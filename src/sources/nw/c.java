package nw;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.net.Socket;
import m00.h0;
import m00.k0;
import mw.g5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements h0 {
    public m00.c K;
    public Socket L;
    public boolean M;
    public int N;
    public int O;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g5 f44191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f44192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44193e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44189a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m00.i f44190b = new m00.i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44194f = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f44195t = false;
    public boolean H = false;

    public c(g5 g5Var, p pVar) {
        Preconditions.k(g5Var, "executor");
        this.f44191c = g5Var;
        this.f44192d = pVar;
        this.f44193e = 10000;
    }

    @Override // m00.h0
    public final void K0(m00.i iVar, long j11) throws IOException {
        Preconditions.k(iVar, "source");
        if (this.H) {
            throw new IOException("closed");
        }
        tw.b.c();
        try {
            synchronized (this.f44189a) {
                try {
                    this.f44190b.K0(iVar, j11);
                    int i11 = this.O + this.N;
                    this.O = i11;
                    boolean z11 = false;
                    this.N = 0;
                    if (!this.M && i11 > this.f44193e) {
                        this.M = true;
                        z11 = true;
                    } else if (!this.f44194f && !this.f44195t && this.f44190b.d() > 0) {
                        this.f44194f = true;
                    }
                    if (z11) {
                        try {
                            this.L.close();
                        } catch (IOException e8) {
                            this.f44192d.n(e8);
                        }
                    } else {
                        this.f44191c.execute(new a(this, 0));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            tw.b.f52660a.getClass();
        } catch (Throwable th3) {
            try {
                tw.b.f52660a.getClass();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void a(m00.c cVar, Socket socket) {
        Preconditions.p("AsyncSink's becomeConnected should only be called once.", this.K == null);
        this.K = cVar;
        this.L = socket;
    }

    @Override // m00.h0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.H) {
            return;
        }
        this.H = true;
        this.f44191c.execute(new aj.i(this, 23));
    }

    @Override // m00.h0, java.io.Flushable
    public final void flush() throws IOException {
        if (this.H) {
            throw new IOException("closed");
        }
        tw.b.c();
        try {
            synchronized (this.f44189a) {
                if (!this.f44195t) {
                    this.f44195t = true;
                    this.f44191c.execute(new a(this, 1));
                }
            }
            tw.b.f52660a.getClass();
        } catch (Throwable th2) {
            try {
                tw.b.f52660a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // m00.h0
    public final k0 timeout() {
        return k0.f40719d;
    }
}
