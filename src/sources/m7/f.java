package m7;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import f7.c0;
import java.util.ArrayDeque;
import lf.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f40965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f40966c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f40971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaFormat f40972i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f40973j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f40974k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f40975l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IllegalStateException f40976n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public x0 f40977o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40964a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d1.t f40967d = new d1.t();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1.t f40968e = new d1.t();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f40969f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f40970g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f40965b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f40970g;
        if (!arrayDeque.isEmpty()) {
            this.f40972i = (MediaFormat) arrayDeque.getLast();
        }
        d1.t tVar = this.f40967d;
        tVar.f22992c = tVar.f22991b;
        d1.t tVar2 = this.f40968e;
        tVar2.f22992c = tVar2.f22991b;
        this.f40969f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f40964a) {
            this.f40974k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f40964a) {
            this.f40973j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i11) {
        c0 c0Var;
        synchronized (this.f40964a) {
            this.f40967d.a(i11);
            x0 x0Var = this.f40977o;
            if (x0Var != null && (c0Var = ((p) x0Var.f40130b).f41014i0) != null) {
                c0Var.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i11, MediaCodec.BufferInfo bufferInfo) {
        c0 c0Var;
        synchronized (this.f40964a) {
            try {
                MediaFormat mediaFormat = this.f40972i;
                if (mediaFormat != null) {
                    this.f40968e.a(-2);
                    this.f40970g.add(mediaFormat);
                    this.f40972i = null;
                }
                this.f40968e.a(i11);
                this.f40969f.add(bufferInfo);
                x0 x0Var = this.f40977o;
                if (x0Var != null && (c0Var = ((p) x0Var.f40130b).f41014i0) != null) {
                    c0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f40964a) {
            this.f40968e.a(-2);
            this.f40970g.add(mediaFormat);
            this.f40972i = null;
        }
    }
}
