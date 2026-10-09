package com.google.firebase.database.tubesock;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class WebSocketWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f19589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Random f19590b = new Random();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f19591c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19592d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WebSocket f19593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WritableByteChannel f19594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Thread f19595g;

    public WebSocketWriter(WebSocket webSocket, int i11) {
        Thread threadNewThread = WebSocket.f19564n.newThread(new Runnable() { // from class: com.google.firebase.database.tubesock.WebSocketWriter.1
            @Override // java.lang.Runnable
            public final void run() {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                while (!webSocketWriter.f19591c && !Thread.interrupted()) {
                    try {
                        webSocketWriter.f19594f.write((ByteBuffer) webSocketWriter.f19589a.take());
                    } catch (IOException e8) {
                        WebSocketException webSocketException = new WebSocketException("IO Exception", e8);
                        WebSocket webSocket2 = webSocketWriter.f19593e;
                        webSocket2.f19568c.d(webSocketException);
                        if (webSocket2.f19566a == WebSocket.State.CONNECTED) {
                            webSocket2.b();
                        }
                        webSocket2.c();
                        return;
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < webSocketWriter.f19589a.size(); i12++) {
                    webSocketWriter.f19594f.write((ByteBuffer) webSocketWriter.f19589a.take());
                }
            }
        });
        this.f19595g = threadNewThread;
        ThreadInitializer threadInitializer = WebSocket.f19565o;
        String strJ = p.j(i11, "TubeSockWriter-");
        ((WebSocket.AnonymousClass1) threadInitializer).getClass();
        threadNewThread.setName(strJ);
        this.f19593e = webSocket;
        this.f19589a = new LinkedBlockingQueue();
    }

    public final ByteBuffer a(byte b3, byte[] bArr) {
        int length = bArr.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + (length < 126 ? 6 : length <= 65535 ? 8 : 14));
        byteBufferAllocate.put((byte) (b3 | (-128)));
        if (length < 126) {
            byteBufferAllocate.put((byte) (length | 128));
        } else if (length <= 65535) {
            byteBufferAllocate.put((byte) 254);
            byteBufferAllocate.putShort((short) length);
        } else {
            byteBufferAllocate.put((byte) 255);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(length);
        }
        byte[] bArr2 = new byte[4];
        this.f19590b.nextBytes(bArr2);
        byteBufferAllocate.put(bArr2);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byteBufferAllocate.put((byte) (bArr[i11] ^ bArr2[i11 % 4]));
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public final synchronized void b(byte b3, byte[] bArr) {
        try {
            ByteBuffer byteBufferA = a(b3, bArr);
            if (this.f19591c && (this.f19592d || b3 != 8)) {
                throw new WebSocketException("Shouldn't be sending");
            }
            if (b3 == 8) {
                this.f19592d = true;
            }
            this.f19589a.add(byteBufferA);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
