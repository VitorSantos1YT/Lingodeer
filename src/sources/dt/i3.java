package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0.d2 f23887c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(d0.d2 d2Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f23885a = i11;
        this.f23887c = d2Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f23885a) {
            case 0:
                return new i3(this.f23887c, dVar, 0);
            default:
                return new i3(this.f23887c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f23885a) {
            case 0:
                break;
        }
        return ((i3) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f23885a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f23886b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    d0.d2 d2Var = this.f23887c;
                    int iL = d2Var.f22662d.l();
                    this.f23886b = 1;
                    if (d0.d2.f(d2Var, iL, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f23886b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    d0.d2 d2Var2 = this.f23887c;
                    int iL2 = d2Var2.f22662d.l();
                    this.f23886b = 1;
                    if (d0.d2.f(d2Var2, iL2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
