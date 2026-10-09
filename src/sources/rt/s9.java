package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s9 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y9 f50382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht.o f50383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cc f50384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s9(y9 y9Var, ht.o oVar, cc ccVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f50380a = i11;
        this.f50382c = y9Var;
        this.f50383d = oVar;
        this.f50384e = ccVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f50380a) {
            case 0:
                return new s9(this.f50382c, this.f50383d, this.f50384e, dVar, 0);
            default:
                return new s9(this.f50382c, this.f50383d, this.f50384e, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f50380a) {
            case 0:
                break;
        }
        return ((s9) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f50380a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f50381b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    long j11 = ((ac) this.f50384e).f49456a;
                    ht.o oVar = this.f50383d;
                    int i12 = oVar != null ? oVar.f33755c : 6;
                    this.f50381b = 1;
                    this.f50382c.B(i12, j11, false);
                    if (b0Var == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f50381b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    long j12 = ((bc) this.f50384e).f49543a;
                    ht.o oVar2 = this.f50383d;
                    int i14 = oVar2 != null ? oVar2.f33755c : 6;
                    this.f50381b = 1;
                    this.f50382c.B(i14, j12, true);
                    if (b0Var2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var2;
        }
    }
}
