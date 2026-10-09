package m0;

import bp.h2;
import d0.l1;
import f0.h1;
import n0.r0;
import qp.o2;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f40541a;

    public a0(x xVar) {
        this.f40541a = xVar;
    }

    @Override // n0.r0
    public final int a() {
        x xVar = this.f40541a;
        return (int) (xVar.g().f40603q == h1.Vertical ? xVar.g().e() & 4294967295L : xVar.g().e() >> 32);
    }

    @Override // n0.r0
    public final float b() {
        x xVar = this.f40541a;
        return (xVar.f40653d.f39181b.l() * 500) + xVar.f40653d.f39182c.l();
    }

    @Override // n0.r0
    public final int c() {
        x xVar = this.f40541a;
        return (-xVar.g().f40600n) + xVar.g().f40604r;
    }

    @Override // n0.r0
    public final float d() {
        x xVar = this.f40541a;
        int iL = xVar.f40653d.f39181b.l();
        int iL2 = xVar.f40653d.f39182c.l();
        return xVar.d() ? (iL * 500) + iL2 + 100 : (iL * 500) + iL2;
    }

    @Override // n0.r0
    public final g3.d e() {
        return new g3.d(-1, -1);
    }

    @Override // n0.r0
    public final Object f(int i11, h2 h2Var) {
        o2 o2Var = x.f40649w;
        x xVar = this.f40541a;
        xVar.getClass();
        Object objA = xVar.a(l1.Default, new gp.a(xVar, i11, null, 28), h2Var);
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        b0 b0Var = b0.f48488a;
        if (objA != aVar) {
            objA = b0Var;
        }
        return objA == aVar ? objA : b0Var;
    }
}
