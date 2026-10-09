package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a4 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0.c f23644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f23645d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4(p0.c cVar, l1.b1 b1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f23642a = i11;
        this.f23644c = cVar;
        this.f23645d = b1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f23642a) {
            case 0:
                return new a4(this.f23644c, this.f23645d, dVar, 0);
            case 1:
                return new a4(this.f23644c, this.f23645d, dVar, 1);
            default:
                return new a4(this.f23644c, this.f23645d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f23642a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((a4) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f23642a;
        qy.b0 b0Var = qy.b0.f48488a;
        p0.c cVar = this.f23644c;
        l1.b1 b1Var = this.f23645d;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f23643b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                float f5 = d4.f23745a;
                if (!((Boolean) b1Var.getValue()).booleanValue()) {
                    return b0Var;
                }
                this.f23643b = 1;
                return cVar.a(null, this) == aVar ? aVar : b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f23643b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                float f11 = d4.f23745a;
                if (!((Boolean) b1Var.getValue()).booleanValue()) {
                    return b0Var;
                }
                this.f23643b = 1;
                return cVar.a(null, this) == aVar2 ? aVar2 : b0Var;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f23643b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                float f12 = d4.f23745a;
                if (!((Boolean) b1Var.getValue()).booleanValue()) {
                    return b0Var;
                }
                this.f23643b = 1;
                return cVar.a(null, this) == aVar3 ? aVar3 : b0Var;
        }
    }
}
