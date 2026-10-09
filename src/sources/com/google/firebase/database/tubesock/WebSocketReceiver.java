package com.google.firebase.database.tubesock;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class WebSocketReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DataInputStream f19583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebSocket f19584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WebSocketEventHandler f19585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f19586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MessageBuilderFactory.Builder f19587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f19588f;

    public static long b(byte[] bArr) {
        return (((long) bArr[2]) << 56) + (((long) (bArr[3] & 255)) << 48) + (((long) (bArr[4] & 255)) << 40) + (((long) (bArr[5] & 255)) << 32) + (((long) (bArr[6] & 255)) << 24) + ((long) ((bArr[7] & 255) << 16)) + ((long) ((bArr[8] & 255) << 8)) + ((long) (bArr[9] & 255));
    }

    public final void a(boolean z11, byte b3, byte[] bArr) {
        if (b3 == 9) {
            if (!z11) {
                throw new WebSocketException("PING must not fragment across frames");
            }
            if (bArr.length > 125) {
                throw new WebSocketException("PING frame too long");
            }
            WebSocket webSocket = this.f19584b;
            synchronized (webSocket) {
                webSocket.f((byte) 10, bArr);
            }
            return;
        }
        MessageBuilderFactory.Builder builder = this.f19587e;
        if (builder != null && b3 != 0) {
            throw new WebSocketException("Failed to continue outstanding frame");
        }
        if (builder == null && b3 == 0) {
            throw new WebSocketException("Received continuing frame, but there's nothing to continue");
        }
        if (builder == null) {
            this.f19587e = b3 == 2 ? new MessageBuilderFactory.BinaryBuilder() : new MessageBuilderFactory.TextBuilder();
        }
        if (!this.f19587e.a(bArr)) {
            throw new WebSocketException("Failed to decode frame");
        }
        if (z11) {
            WebSocketMessage webSocketMessageB = this.f19587e.b();
            this.f19587e = null;
            this.f19585c.b(webSocketMessageB);
        }
    }

    public final void c() {
        long jB;
        this.f19585c = this.f19584b.f19568c;
        while (!this.f19588f) {
            try {
                this.f19583a.readFully(this.f19586d, 0, 1);
                byte[] bArr = this.f19586d;
                byte b3 = bArr[0];
                boolean z11 = (b3 & 128) != 0;
                if ((b3 & 112) != 0) {
                    throw new WebSocketException("Invalid frame received");
                }
                byte b11 = (byte) (b3 & 15);
                this.f19583a.readFully(bArr, 1, 1);
                byte[] bArr2 = this.f19586d;
                byte b12 = bArr2[1];
                if (b12 < 126) {
                    jB = b12;
                } else if (b12 == 126) {
                    this.f19583a.readFully(bArr2, 2, 2);
                    byte[] bArr3 = this.f19586d;
                    jB = (((long) (bArr3[2] & 255)) << 8) | ((long) (bArr3[3] & 255));
                } else if (b12 == 127) {
                    this.f19583a.readFully(bArr2, 2, 8);
                    jB = b(this.f19586d);
                } else {
                    jB = 0;
                }
                int i11 = (int) jB;
                byte[] bArr4 = new byte[i11];
                this.f19583a.readFully(bArr4, 0, i11);
                if (b11 == 8) {
                    this.f19584b.c();
                } else if (b11 != 10) {
                    if (b11 != 1 && b11 != 2 && b11 != 9 && b11 != 0) {
                        throw new WebSocketException("Unsupported opcode: " + ((int) b11));
                    }
                    a(z11, b11, bArr4);
                }
            } catch (WebSocketException e8) {
                this.f19588f = true;
                WebSocket webSocket = this.f19584b;
                webSocket.f19568c.d(e8);
                if (webSocket.f19566a == WebSocket.State.CONNECTED) {
                    webSocket.b();
                }
                webSocket.c();
            } catch (SocketTimeoutException unused) {
            } catch (IOException e10) {
                WebSocketException webSocketException = new WebSocketException("IO Error", e10);
                this.f19588f = true;
                WebSocket webSocket2 = this.f19584b;
                webSocket2.f19568c.d(webSocketException);
                if (webSocket2.f19566a == WebSocket.State.CONNECTED) {
                    webSocket2.b();
                }
                webSocket2.c();
            }
        }
    }
}
