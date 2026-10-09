package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q5 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0.d f5889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5890d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q5(int i11, int i12, b0.d dVar, vy.d dVar2) {
        super(2, dVar2);
        this.f5887a = i12;
        this.f5889c = dVar;
        this.f5890d = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5887a) {
            case 0:
                return new q5(this.f5890d, 0, this.f5889c, dVar);
            default:
                return new q5(this.f5890d, 1, this.f5889c, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f5887a) {
            case 0:
                break;
        }
        return ((q5) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f5887a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f5888b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    Float f5 = new Float(this.f5890d);
                    b0.i2 i2VarR = b0.e.r(500, 0, null, 6);
                    this.f5888b = 1;
                    if (b0.d.c(this.f5889c, f5, i2VarR, null, this, 12) == aVar) {
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
                int i12 = this.f5888b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    Float f11 = new Float(this.f5890d);
                    b0.i2 i2VarR2 = b0.e.r(500, 0, null, 6);
                    this.f5888b = 1;
                    if (b0.d.c(this.f5889c, f11, i2VarR2, null, this, 12) == aVar2) {
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
