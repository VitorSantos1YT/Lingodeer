package ys;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b3 f58104b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(l1.b3 b3Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f58103a = i11;
        this.f58104b = b3Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f58103a) {
            case 0:
                return new k0(this.f58104b, dVar, 0);
            default:
                return new k0(this.f58104b, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f58103a) {
            case 0:
                k0 k0Var = (k0) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                k0Var.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                k0 k0Var2 = (k0) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                k0Var2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f58103a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.b3 b3Var = this.f58104b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((Number) b3Var.getValue()).longValue();
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((Number) b3Var.getValue()).longValue();
                break;
        }
        return b0Var;
    }
}
