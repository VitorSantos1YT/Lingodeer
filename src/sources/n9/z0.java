package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f43744b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(a1 a1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f43743a = i11;
        this.f43744b = a1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f43743a) {
            case 0:
                return new z0(this.f43744b, dVar, 0);
            default:
                return new z0(this.f43744b, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        uz.j jVar = (uz.j) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f43743a) {
            case 0:
                z0 z0Var = (z0) create(jVar, dVar);
                qy.b0 b0Var = qy.b0.f48488a;
                z0Var.invokeSuspend(b0Var);
                return b0Var;
            default:
                z0 z0Var2 = (z0) create(jVar, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                z0Var2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f43743a;
        qy.b0 b0Var = qy.b0.f48488a;
        a1 a1Var = this.f43744b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                a1Var.f43486f.i(new Integer(0));
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                a1Var.f43485e.i(new Integer(0));
                break;
        }
        return b0Var;
    }
}
