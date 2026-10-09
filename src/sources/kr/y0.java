package kr;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends xy.i implements fz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f38615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int f38616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ float f38617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ List f38618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ qy.l f38619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z0 f38620f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(z0 z0Var, vy.d dVar) {
        super(6, dVar);
        this.f38620f = z0Var;
    }

    @Override // fz.i
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj2).intValue();
        float fFloatValue = ((Number) obj3).floatValue();
        y0 y0Var = new y0(this.f38620f, (vy.d) obj6);
        y0Var.f38615a = zBooleanValue;
        y0Var.f38616b = iIntValue;
        y0Var.f38617c = fFloatValue;
        y0Var.f38618d = (List) obj4;
        y0Var.f38619e = (qy.l) obj5;
        return y0Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        boolean z11 = this.f38615a;
        int i11 = this.f38616b;
        float f5 = this.f38617c;
        List list = this.f38618d;
        qy.l lVar = this.f38619e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        String[] strArrL = jh.h.l(this.f38620f.f38632f, list.size());
        return new r0(list, strArrL != null ? ry.l.k0(strArrL) : ry.r.f50854a, i11, f5, z11, ((Number) lVar.f48496b).intValue(), ((Boolean) lVar.f48495a).booleanValue());
    }
}
