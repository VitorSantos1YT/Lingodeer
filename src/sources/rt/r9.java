package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r9 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y9 f50345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r9(int i11, y9 y9Var, vy.d dVar) {
        super(2, dVar);
        this.f50343a = i11;
        this.f50345c = y9Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f50343a) {
            case 0:
                return new r9(0, this.f50345c, dVar);
            default:
                return new r9(1, this.f50345c, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f50343a) {
            case 0:
                break;
        }
        return ((r9) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f50343a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f50344b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f50344b = 1;
                    if (this.f50345c.u(true, true, this) == aVar) {
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
                int i12 = this.f50344b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f50344b = 1;
                    if (this.f50345c.u(true, false, this) == aVar2) {
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
