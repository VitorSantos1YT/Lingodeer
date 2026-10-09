package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g5 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vt.n0 f23840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g5(vt.n0 n0Var, int i11, vy.d dVar, int i12) {
        super(2, dVar);
        this.f23838a = i12;
        this.f23840c = n0Var;
        this.f23841d = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f23838a) {
            case 0:
                return new g5(this.f23840c, this.f23841d, dVar, 0);
            default:
                return new g5(this.f23840c, this.f23841d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f23838a) {
            case 0:
                break;
        }
        return ((g5) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f23838a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f23839b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f23839b = 1;
                    if (((fr.o0) this.f23840c).e0(this.f23841d, this) == aVar) {
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
                int i12 = this.f23839b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f23839b = 1;
                    if (((fr.o0) this.f23840c).e0(this.f23841d, this) == aVar2) {
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
