package p7;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d7.e f46504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final hh.c f46505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k7.g f46506j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final re.v f46507k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f46508l;
    public final y6.p m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f46509n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f46510o = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f46511p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f46512q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d7.q f46513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public y6.x f46514s;

    public v0(y6.x xVar, d7.e eVar, hh.c cVar, k7.g gVar, re.v vVar, int i11, y6.p pVar) {
        this.f46514s = xVar;
        this.f46504h = eVar;
        this.f46505i = cVar;
        this.f46506j = gVar;
        this.f46507k = vVar;
        this.f46508l = i11;
        this.m = pVar;
    }

    @Override // p7.a
    public final z a(b0 b0Var, t7.g gVar, long j11) {
        d7.f fVarS = this.f46504h.s();
        d7.q qVar = this.f46513r;
        if (qVar != null) {
            fVarS.c(qVar);
        }
        y6.u uVar = g().f57373b;
        uVar.getClass();
        Uri uri = uVar.f57358a;
        b7.a.k(this.f46324g);
        int i11 = 0;
        return new s0(uri, fVarS, new b((x7.p) this.f46505i.f32212b), this.f46506j, new k7.c(this.f46321d.f37958c, i11, b0Var), this.f46507k, new k7.c(this.f46320c.f37958c, i11, b0Var), this, gVar, this.f46508l, this.m, b7.f0.K(uVar.f57362e), null);
    }

    @Override // p7.a
    public final synchronized y6.x g() {
        return this.f46514s;
    }

    @Override // p7.a
    public final void k(d7.q qVar) {
        this.f46513r = qVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        g7.j jVar = this.f46324g;
        b7.a.k(jVar);
        k7.g gVar = this.f46506j;
        gVar.c(looperMyLooper, jVar);
        gVar.a();
        s();
    }

    @Override // p7.a
    public final void m(z zVar) {
        s0 s0Var = (s0) zVar;
        if (s0Var.Y) {
            for (y0 y0Var : s0Var.V) {
                y0Var.g();
                hd.b bVar = y0Var.f46545h;
                if (bVar != null) {
                    bVar.x(y0Var.f46542e);
                    y0Var.f46545h = null;
                    y0Var.f46544g = null;
                }
            }
        }
        s0Var.N.c(s0Var);
        s0Var.S.removeCallbacksAndMessages(null);
        s0Var.T = null;
        s0Var.f46486q0 = true;
    }

    @Override // p7.a
    public final void o() {
        this.f46506j.release();
    }

    @Override // p7.a
    public final synchronized void r(y6.x xVar) {
        this.f46514s = xVar;
    }

    public final void s() {
        y6.o0 d1Var = new d1(this.f46510o, this.f46511p, this.f46512q, g());
        if (this.f46509n) {
            d1Var = new t0(d1Var);
        }
        l(d1Var);
    }

    public final void t(long j11, x7.y yVar, boolean z11) {
        if (j11 == -9223372036854775807L) {
            j11 = this.f46510o;
        }
        boolean zD = yVar.d();
        if (!this.f46509n && this.f46510o == j11 && this.f46511p == zD && this.f46512q == z11) {
            return;
        }
        this.f46510o = j11;
        this.f46511p = zD;
        this.f46512q = z11;
        this.f46509n = false;
        s();
    }

    @Override // p7.a
    public final void i() {
    }
}
