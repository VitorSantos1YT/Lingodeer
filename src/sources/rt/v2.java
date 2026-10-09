package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3 f50522c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2(e3 e3Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f50520a = i11;
        this.f50522c = e3Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f50520a) {
            case 0:
                return new v2(this.f50522c, dVar, 0);
            default:
                return new v2(this.f50522c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f50520a) {
            case 0:
                break;
        }
        return ((v2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f50520a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f50521b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f50521b = 1;
                    if (this.f50522c.J(this) == aVar) {
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
                int i12 = this.f50521b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.c cVar = this.f50522c.f50703b;
                    this.f50521b = 1;
                    ((vt.d) cVar).n(this);
                    if (b0Var == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
        }
    }
}
