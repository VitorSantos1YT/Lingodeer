package i1;

import d0.l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements f0.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0.j f34082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ob.s f34083b;

    public v(ob.s sVar) {
        this.f34083b = sVar;
        this.f34082a = new f0.j(sVar, 2);
    }

    @Override // f0.s0
    public final Object a(l1 l1Var, a0.e0 e0Var, f0.m0 m0Var) throws Throwable {
        Object objC = this.f34083b.c(l1Var, new e6.g0(this, e0Var, (vy.d) null), m0Var);
        return objC == wy.a.COROUTINE_SUSPENDED ? objC : qy.b0.f48488a;
    }
}
