package t7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends Handler implements Runnable {
    public boolean H;
    public volatile boolean K;
    public final /* synthetic */ n L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f52089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f52090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f52091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IOException f52092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52093f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Thread f52094t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, Looper looper, l lVar, j jVar, int i11, long j11) {
        super(looper);
        this.L = nVar;
        this.f52089b = lVar;
        this.f52091d = jVar;
        this.f52088a = i11;
        this.f52090c = j11;
    }

    public final void a(boolean z11) {
        this.K = z11;
        this.f52092e = null;
        if (hasMessages(1)) {
            this.H = true;
            removeMessages(1);
            if (!z11) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.H = true;
                    this.f52089b.k();
                    Thread thread = this.f52094t;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z11) {
            this.L.f52098b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            j jVar = this.f52091d;
            jVar.getClass();
            jVar.g(this.f52089b, jElapsedRealtime, jElapsedRealtime - this.f52090c, true);
            this.f52091d = null;
        }
    }

    public final void b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = jElapsedRealtime - this.f52090c;
        j jVar = this.f52091d;
        jVar.getClass();
        jVar.p(this.f52089b, jElapsedRealtime, j11, this.f52093f);
        this.f52092e = null;
        n nVar = this.L;
        u7.a aVar = nVar.f52097a;
        k kVar = nVar.f52098b;
        kVar.getClass();
        aVar.execute(kVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.K) {
            return;
        }
        int i11 = message.what;
        if (i11 == 1) {
            b();
            return;
        }
        if (i11 == 4) {
            throw ((Error) message.obj);
        }
        this.L.f52098b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = jElapsedRealtime - this.f52090c;
        j jVar = this.f52091d;
        jVar.getClass();
        if (this.H) {
            jVar.g(this.f52089b, jElapsedRealtime, j11, false);
            return;
        }
        int i12 = message.what;
        if (i12 == 2) {
            try {
                jVar.c(this.f52089b, jElapsedRealtime, j11);
                return;
            } catch (RuntimeException e8) {
                b7.a.p("Unexpected exception handling load completed", e8);
                this.L.f52099c = new Loader$UnexpectedLoaderException(e8);
                return;
            }
        }
        if (i12 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f52092e = iOException;
        int i13 = this.f52093f + 1;
        this.f52093f = i13;
        f9.e eVarE = jVar.e(this.f52089b, jElapsedRealtime, j11, iOException, i13);
        int i14 = eVarE.f27021b;
        if (i14 == 3) {
            this.L.f52099c = this.f52092e;
            return;
        }
        if (i14 != 2) {
            if (i14 == 1) {
                this.f52093f = 1;
            }
            long jMin = eVarE.f27020a;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f52093f - 1) * 1000, 5000);
            }
            n nVar = this.L;
            b7.a.j(nVar.f52098b == null);
            nVar.f52098b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z11;
        try {
            synchronized (this) {
                z11 = this.H;
                this.f52094t = Thread.currentThread();
            }
            if (!z11) {
                Trace.beginSection("load:".concat(this.f52089b.getClass().getSimpleName()));
                try {
                    this.f52089b.e();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f52094t = null;
                Thread.interrupted();
            }
            if (this.K) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e8) {
            if (this.K) {
                return;
            }
            obtainMessage(3, e8).sendToTarget();
        } catch (Exception e10) {
            if (this.K) {
                return;
            }
            b7.a.p("Unexpected exception loading stream", e10);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e10)).sendToTarget();
        } catch (OutOfMemoryError e11) {
            if (this.K) {
                return;
            }
            b7.a.p("OutOfMemory error loading stream", e11);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e11)).sendToTarget();
        } catch (Error e12) {
            if (!this.K) {
                b7.a.p("Unexpected error loading stream", e12);
                obtainMessage(4, e12).sendToTarget();
            }
            throw e12;
        }
    }
}
