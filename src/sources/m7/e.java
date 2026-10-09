package m7;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import b7.f0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f40956g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f40957h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f40958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f40959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l.g f40960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f40961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b7.f f40962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40963f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        b7.f fVar = new b7.f();
        this.f40958a = mediaCodec;
        this.f40959b = handlerThread;
        this.f40962e = fVar;
        this.f40961d = new AtomicReference();
    }

    public static d e() {
        ArrayDeque arrayDeque = f40956g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new d();
                }
                return (d) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m7.m
    public final void a(Bundle bundle) {
        d();
        l.g gVar = this.f40960c;
        String str = f0.f3975a;
        gVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // m7.m
    public final void b(int i11, int i12, int i13, long j11) {
        d();
        d dVarE = e();
        dVarE.f40951a = i11;
        dVarE.f40952b = i12;
        dVarE.f40954d = j11;
        dVarE.f40955e = i13;
        l.g gVar = this.f40960c;
        String str = f0.f3975a;
        gVar.obtainMessage(1, dVarE).sendToTarget();
    }

    @Override // m7.m
    public final void c(int i11, e7.b bVar, long j11, int i12) {
        d();
        d dVarE = e();
        dVarE.f40951a = i11;
        dVarE.f40952b = 0;
        dVarE.f40954d = j11;
        dVarE.f40955e = i12;
        MediaCodec.CryptoInfo cryptoInfo = dVarE.f40953c;
        cryptoInfo.numSubSamples = bVar.f25108f;
        int[] iArr = bVar.f25106d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = bVar.f25107e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = bVar.f25104b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = bVar.f25103a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = bVar.f25105c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(bVar.f25109g, bVar.f25110h));
        l.g gVar = this.f40960c;
        String str = f0.f3975a;
        gVar.obtainMessage(2, dVarE).sendToTarget();
    }

    @Override // m7.m
    public final void d() {
        RuntimeException runtimeException = (RuntimeException) this.f40961d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // m7.m
    public final void flush() {
        if (this.f40963f) {
            try {
                l.g gVar = this.f40960c;
                gVar.getClass();
                gVar.removeCallbacksAndMessages(null);
                b7.f fVar = this.f40962e;
                synchronized (fVar) {
                    fVar.f3974b = false;
                }
                l.g gVar2 = this.f40960c;
                gVar2.getClass();
                gVar2.obtainMessage(3).sendToTarget();
                synchronized (fVar) {
                    while (!fVar.f3974b) {
                        fVar.f3973a.getClass();
                        fVar.wait();
                    }
                }
            } catch (InterruptedException e8) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e8);
            }
        }
    }

    @Override // m7.m
    public final void shutdown() {
        if (this.f40963f) {
            flush();
            this.f40959b.quit();
        }
        this.f40963f = false;
    }

    @Override // m7.m
    public final void start() {
        if (this.f40963f) {
            return;
        }
        HandlerThread handlerThread = this.f40959b;
        handlerThread.start();
        this.f40960c = new l.g(this, handlerThread.getLooper(), 2);
        this.f40963f = true;
    }
}
