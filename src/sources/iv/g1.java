package iv;

import l1.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1 f34738b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(i1 i1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f34737a = i11;
        this.f34738b = i1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f34737a) {
            case 0:
                return new g1(this.f34738b, dVar, 0);
            default:
                return new g1(this.f34738b, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f34737a) {
            case 0:
                g1 g1Var = (g1) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                g1Var.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                g1 g1Var2 = (g1) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                g1Var2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f34737a;
        qy.b0 b0Var = qy.b0.f48488a;
        i1 i1Var = this.f34738b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                i1Var.n(System.currentTimeMillis());
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                i1Var.n(System.currentTimeMillis());
                break;
        }
        return b0Var;
    }
}
