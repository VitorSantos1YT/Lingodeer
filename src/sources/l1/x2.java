package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f39508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.e f39509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f39510e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(fz.e eVar, b1 b1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f39506a = i11;
        this.f39509d = eVar;
        this.f39510e = b1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f39506a) {
            case 0:
                x2 x2Var = new x2(this.f39509d, this.f39510e, dVar, 0);
                x2Var.f39508c = obj;
                return x2Var;
            case 1:
                x2 x2Var2 = new x2(this.f39509d, this.f39510e, dVar, 1);
                x2Var2.f39508c = obj;
                return x2Var2;
            case 2:
                x2 x2Var3 = new x2(this.f39509d, this.f39510e, dVar, 2);
                x2Var3.f39508c = obj;
                return x2Var3;
            case 3:
                x2 x2Var4 = new x2(this.f39509d, this.f39510e, dVar, 3);
                x2Var4.f39508c = obj;
                return x2Var4;
            default:
                x2 x2Var5 = new x2(this.f39509d, this.f39510e, dVar, 4);
                x2Var5.f39508c = obj;
                return x2Var5;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f39506a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((x2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f39506a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f39507b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    u1 u1Var = new u1(this.f39510e, ((rz.b0) this.f39508c).getCoroutineContext());
                    this.f39507b = 1;
                    if (this.f39509d.invoke(u1Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f39507b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    u1 u1Var2 = new u1(this.f39510e, ((rz.b0) this.f39508c).getCoroutineContext());
                    this.f39507b = 1;
                    if (this.f39509d.invoke(u1Var2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f39507b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    u1 u1Var3 = new u1(this.f39510e, ((rz.b0) this.f39508c).getCoroutineContext());
                    this.f39507b = 1;
                    if (this.f39509d.invoke(u1Var3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f39507b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    u1 u1Var4 = new u1(this.f39510e, ((rz.b0) this.f39508c).getCoroutineContext());
                    this.f39507b = 1;
                    if (this.f39509d.invoke(u1Var4, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f39507b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    u1 u1Var5 = new u1(this.f39510e, ((rz.b0) this.f39508c).getCoroutineContext());
                    this.f39507b = 1;
                    if (this.f39509d.invoke(u1Var5, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
