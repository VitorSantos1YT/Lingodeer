package l0;

import bp.h2;
import f0.c2;
import f0.h1;
import n0.r0;
import qp.o2;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f39104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2 f39105c;

    public /* synthetic */ d(c2 c2Var, boolean z11, int i11) {
        this.f39103a = i11;
        this.f39105c = c2Var;
        this.f39104b = z11;
    }

    @Override // n0.r0
    public final int a() {
        switch (this.f39103a) {
            case 0:
                w wVar = (w) this.f39105c;
                return (int) (wVar.h().f39159o == h1.Vertical ? wVar.h().e() & 4294967295L : wVar.h().e() >> 32);
            default:
                o0.t tVar = (o0.t) this.f39105c;
                return (int) (tVar.l().f44404e == h1.Vertical ? tVar.l().e() & 4294967295L : tVar.l().e() >> 32);
        }
    }

    @Override // n0.r0
    public final float b() {
        switch (this.f39103a) {
            case 0:
                w wVar = (w) this.f39105c;
                return (wVar.f39206e.f39181b.l() * 500) + wVar.f39206e.f39182c.l();
            default:
                return cf.x.e((o0.t) this.f39105c);
        }
    }

    @Override // n0.r0
    public final int c() {
        int i11;
        int i12;
        switch (this.f39103a) {
            case 0:
                w wVar = (w) this.f39105c;
                i11 = -wVar.h().f39157l;
                i12 = wVar.h().f39160p;
                break;
            default:
                o0.t tVar = (o0.t) this.f39105c;
                i11 = -tVar.l().f44405f;
                i12 = tVar.l().f44403d;
                break;
        }
        return i11 + i12;
    }

    @Override // n0.r0
    public final float d() {
        switch (this.f39103a) {
            case 0:
                w wVar = (w) this.f39105c;
                int iL = wVar.f39206e.f39181b.l();
                int iL2 = wVar.f39206e.f39182c.l();
                return wVar.d() ? (iL * 500) + iL2 + 100 : (iL * 500) + iL2;
            default:
                o0.t tVar = (o0.t) this.f39105c;
                return o0.w.a(tVar.l(), tVar.m());
        }
    }

    @Override // n0.r0
    public final g3.d e() {
        switch (this.f39103a) {
            case 0:
                w wVar = (w) this.f39105c;
                return this.f39104b ? new g3.d(wVar.h().f39158n, 1) : new g3.d(1, wVar.h().f39158n);
            default:
                o0.t tVar = (o0.t) this.f39105c;
                return this.f39104b ? new g3.d(tVar.m(), 1) : new g3.d(1, tVar.m());
        }
    }

    @Override // n0.r0
    public final Object f(int i11, h2 h2Var) {
        int i12 = this.f39103a;
        b0 b0Var = b0.f48488a;
        c2 c2Var = this.f39105c;
        switch (i12) {
            case 0:
                o2 o2Var = w.f39201x;
                Object objJ = ((w) c2Var).j(i11, 0, h2Var);
                return objJ == wy.a.COROUTINE_SUSPENDED ? objJ : b0Var;
            default:
                Object objT = o0.t.t((o0.t) c2Var, i11, h2Var);
                return objT == wy.a.COROUTINE_SUSPENDED ? objT : b0Var;
        }
    }
}
