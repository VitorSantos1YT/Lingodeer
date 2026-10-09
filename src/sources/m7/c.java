package m7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import b7.f0;
import java.nio.ByteBuffer;
import lf.i0;
import lf.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f40945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f40946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f40947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f40948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f40949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40950f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f40945a = mediaCodec;
        this.f40946b = new f(handlerThread);
        this.f40947c = mVar;
        this.f40948d = jVar;
    }

    public static void p(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i11) {
        j jVar;
        f fVar = cVar.f40946b;
        MediaCodec mediaCodec = cVar.f40945a;
        HandlerThread handlerThread = fVar.f40965b;
        b7.a.j(fVar.f40966c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f40966c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i11);
        Trace.endSection();
        cVar.f40947c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.f40948d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f40950f = 1;
    }

    public static String q(int i11, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i11 == 1) {
            sb2.append("Audio");
        } else if (i11 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i11);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // m7.l
    public final void a(Bundle bundle) {
        this.f40947c.a(bundle);
    }

    @Override // m7.l
    public final void b(int i11, int i12, int i13, long j11) {
        this.f40947c.b(i11, i12, i13, j11);
    }

    @Override // m7.l
    public final void c(int i11, e7.b bVar, long j11, int i12) {
        this.f40947c.c(i11, bVar, j11, i12);
    }

    @Override // m7.l
    public final void d(int i11) {
        this.f40945a.releaseOutputBuffer(i11, false);
    }

    @Override // m7.l
    public final void e(v7.i iVar, Handler handler) {
        this.f40945a.setOnFrameRenderedListener(new a(this, iVar, 0), handler);
    }

    @Override // m7.l
    public final MediaFormat f() {
        MediaFormat mediaFormat;
        f fVar = this.f40946b;
        synchronized (fVar.f40964a) {
            try {
                mediaFormat = fVar.f40971h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override // m7.l
    public final void flush() {
        this.f40947c.flush();
        this.f40945a.flush();
        f fVar = this.f40946b;
        synchronized (fVar.f40964a) {
            fVar.f40975l++;
            Handler handler = fVar.f40966c;
            String str = f0.f3975a;
            handler.post(new i0(fVar, 1));
        }
        this.f40945a.start();
    }

    @Override // m7.l
    public final void g() {
        this.f40945a.detachOutputSurface();
    }

    @Override // m7.l
    public final void h(int i11, long j11) {
        this.f40945a.releaseOutputBuffer(i11, j11);
    }

    @Override // m7.l
    public final int i() {
        this.f40947c.d();
        f fVar = this.f40946b;
        synchronized (fVar.f40964a) {
            try {
                IllegalStateException illegalStateException = fVar.f40976n;
                if (illegalStateException != null) {
                    fVar.f40976n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fVar.f40973j;
                if (codecException != null) {
                    fVar.f40973j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = fVar.f40974k;
                if (cryptoException != null) {
                    fVar.f40974k = null;
                    throw cryptoException;
                }
                int i11 = -1;
                if (fVar.f40975l > 0 || fVar.m) {
                    return -1;
                }
                d1.t tVar = fVar.f40967d;
                int i12 = tVar.f22991b;
                int i13 = tVar.f22992c;
                if (!(i12 == i13)) {
                    if (i12 == i13) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i11 = ((int[]) tVar.f22994e)[i12];
                    tVar.f22991b = (i12 + 1) & tVar.f22993d;
                }
                return i11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m7.l
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        this.f40947c.d();
        f fVar = this.f40946b;
        synchronized (fVar.f40964a) {
            try {
                IllegalStateException illegalStateException = fVar.f40976n;
                if (illegalStateException != null) {
                    fVar.f40976n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fVar.f40973j;
                if (codecException != null) {
                    fVar.f40973j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = fVar.f40974k;
                if (cryptoException != null) {
                    fVar.f40974k = null;
                    throw cryptoException;
                }
                if (fVar.f40975l > 0 || fVar.m) {
                    return -1;
                }
                d1.t tVar = fVar.f40968e;
                int i11 = tVar.f22991b;
                int i12 = tVar.f22992c;
                if (i11 == i12) {
                    return -1;
                }
                if (i11 == i12) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i13 = ((int[]) tVar.f22994e)[i11];
                tVar.f22991b = tVar.f22993d & (i11 + 1);
                if (i13 >= 0) {
                    b7.a.k(fVar.f40971h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) fVar.f40969f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i13 == -2) {
                    fVar.f40971h = (MediaFormat) fVar.f40970g.remove();
                }
                return i13;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m7.l
    public final void k(int i11) {
        this.f40945a.setVideoScalingMode(i11);
    }

    @Override // m7.l
    public final ByteBuffer l(int i11) {
        return this.f40945a.getInputBuffer(i11);
    }

    @Override // m7.l
    public final void m(Surface surface) {
        this.f40945a.setOutputSurface(surface);
    }

    @Override // m7.l
    public final ByteBuffer n(int i11) {
        return this.f40945a.getOutputBuffer(i11);
    }

    @Override // m7.l
    public final boolean o(x0 x0Var) {
        f fVar = this.f40946b;
        synchronized (fVar.f40964a) {
            fVar.f40977o = x0Var;
        }
        return true;
    }

    @Override // m7.l
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f40950f == 1) {
                this.f40947c.shutdown();
                f fVar = this.f40946b;
                synchronized (fVar.f40964a) {
                    fVar.m = true;
                    fVar.f40965b.quit();
                    fVar.a();
                }
            }
            this.f40950f = 2;
            if (this.f40949e) {
                return;
            }
            try {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 30 && i11 < 33) {
                    this.f40945a.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && (jVar2 = this.f40948d) != null) {
                    jVar2.c(this.f40945a);
                }
                this.f40945a.release();
                this.f40949e = true;
            }
        } catch (Throwable th2) {
            if (!this.f40949e) {
                try {
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 30 && i12 < 33) {
                        this.f40945a.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f40948d) != null) {
                        jVar.c(this.f40945a);
                    }
                    this.f40945a.release();
                    this.f40949e = true;
                }
            }
            throw th2;
        }
    }
}
