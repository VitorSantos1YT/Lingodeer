package mw;

import com.google.common.base.Preconditions;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends j5 implements w {
    public static final Logger K = Logger.getLogger(c.class.getName());
    public volatile boolean H;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r5 f42366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f42367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f42368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f42369f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public lw.c1 f42370t;

    public c(ay.k0 k0Var, n5 n5Var, r5 r5Var, lw.c1 c1Var, lw.c cVar, boolean z11) {
        Preconditions.k(c1Var, "headers");
        Preconditions.k(r5Var, "transportTracer");
        this.f42366c = r5Var;
        this.f42368e = !Boolean.TRUE.equals(cVar.a(k1.f42499n));
        this.f42369f = z11;
        if (!z11) {
            this.f42367d = new m3(this, k0Var, n5Var);
            this.f42370t = c1Var;
            return;
        }
        g1.k kVar = new g1.k();
        kVar.f28532e = this;
        Preconditions.k(c1Var, "headers");
        kVar.f28529b = c1Var;
        kVar.f28530c = n5Var;
        this.f42367d = kVar;
    }

    @Override // mw.w
    public final void d(int i11) {
        this.f42367d.d(i11);
    }

    @Override // mw.o5
    public final boolean f() {
        return ((nw.m) this).P.e() && !this.H;
    }

    @Override // mw.w
    public final void h() {
        nw.m mVar = (nw.m) this;
        if (mVar.P.f42354n) {
            return;
        }
        mVar.P.f42354n = true;
        this.f42367d.close();
    }

    @Override // mw.w
    public final void k(l2.f fVar) {
        fVar.a(((nw.m) this).R.f40343a.get(lw.f.f40373a), "remote_addr");
    }

    @Override // mw.w
    public final void l(int i11) {
        ((nw.m) this).P.f42342a.f42505b = i11;
    }

    @Override // mw.w
    public final void n(y yVar) {
        nw.m mVar = (nw.m) this;
        nw.l lVar = mVar.P;
        Preconditions.p("Already called setListener", lVar.f42351j == null);
        Preconditions.k(yVar, "listener");
        lVar.f42351j = yVar;
        if (this.f42369f) {
            return;
        }
        mVar.Q.n(this.f42370t, null);
        this.f42370t = null;
    }

    @Override // mw.w
    public final void p(lw.q1 q1Var) {
        Preconditions.e("Should not cancel with OK status", !q1Var.f());
        this.H = true;
        lp.b bVar = ((nw.m) this).Q;
        bVar.getClass();
        tw.b.c();
        try {
            synchronized (((nw.m) bVar.f40184b).P.f44229w) {
                ((nw.m) bVar.f40184b).P.l(q1Var, true, null);
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

    @Override // mw.w
    public final void r(lw.u uVar) {
        nw.l lVar = ((nw.m) this).P;
        Preconditions.p("Already called start", lVar.f42351j == null);
        Preconditions.k(uVar, "decompressorRegistry");
        lVar.f42352k = uVar;
    }

    @Override // mw.w
    public final void s(lw.s sVar) {
        lw.c1 c1Var = this.f42370t;
        lw.x0 x0Var = k1.f42489c;
        c1Var.a(x0Var);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f42370t.e(x0Var, Long.valueOf(Math.max(0L, sVar.b())));
    }

    public final void v(nw.x xVar, boolean z11, boolean z12, int i11) {
        m00.i iVar;
        Preconditions.e("null frame before EOS", xVar != null || z11);
        lp.b bVar = ((nw.m) this).Q;
        bVar.getClass();
        tw.b.c();
        try {
            if (xVar == null) {
                iVar = nw.m.T;
            } else {
                iVar = xVar.f44279a;
                int i12 = (int) iVar.f40718b;
                if (i12 > 0) {
                    nw.l lVar = ((nw.m) bVar.f40184b).P;
                    synchronized (lVar.f42343b) {
                        lVar.f42346e += i12;
                    }
                }
            }
            synchronized (((nw.m) bVar.f40184b).P.f44229w) {
                nw.l.k(((nw.m) bVar.f40184b).P, iVar, z11, z12);
                r5 r5Var = ((nw.m) bVar.f40184b).f42366c;
                if (i11 == 0) {
                    r5Var.getClass();
                } else {
                    r5Var.getClass();
                    ((n3) r5Var.f42667a).t();
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
}
