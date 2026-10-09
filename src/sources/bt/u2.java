package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2.v f6061b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(e2.v vVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f6060a = i11;
        this.f6061b = vVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f6060a) {
            case 0:
                return new u2(this.f6061b, dVar, 0);
            default:
                return new u2(this.f6061b, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f6060a) {
            case 0:
                u2 u2Var = (u2) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                u2Var.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                u2 u2Var2 = (u2) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                u2Var2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f6060a;
        qy.b0 b0Var = qy.b0.f48488a;
        e2.v vVar = this.f6061b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                e2.v.b(vVar);
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                e2.v.b(vVar);
                break;
        }
        return b0Var;
    }
}
