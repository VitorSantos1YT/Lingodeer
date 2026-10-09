package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x1 extends xy.i implements fz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ List f50612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ me f50613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ ke f50614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f50615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ u1 f50616e;

    public x1(vy.d dVar) {
        super(6, dVar);
    }

    @Override // fz.i
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        x1 x1Var = new x1((vy.d) obj6);
        x1Var.f50612a = (List) obj;
        x1Var.f50613b = (me) obj2;
        x1Var.f50614c = (ke) obj3;
        x1Var.f50615d = zBooleanValue;
        x1Var.f50616e = (u1) obj5;
        return x1Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        List list = this.f50612a;
        me meVar = this.f50613b;
        ke keVar = this.f50614c;
        boolean z11 = this.f50615d;
        u1 u1Var = this.f50616e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        return new r1(list, meVar, keVar, z11, u1Var.f50465a, u1Var.f50466b);
    }
}
