package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o5 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e8 f30790c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o5(e8 e8Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f30788a = i11;
        this.f30790c = e8Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f30788a) {
            case 0:
                return new o5(this.f30790c, dVar, 0);
            case 1:
                return new o5(this.f30790c, dVar, 1);
            case 2:
                return new o5(this.f30790c, dVar, 2);
            case 3:
                return new o5(this.f30790c, dVar, 3);
            case 4:
                return new o5(this.f30790c, dVar, 4);
            case 5:
                return new o5(this.f30790c, dVar, 5);
            default:
                return new o5(this.f30790c, dVar, 6);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f30788a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((o5) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f30788a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f30789b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f30789b = 1;
                    if (this.f30790c.d(this) == aVar) {
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
                int i12 = this.f30789b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f30789b = 1;
                    if (this.f30790c.b(this) == aVar2) {
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
                int i13 = this.f30789b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f30789b = 1;
                    e8 e8Var = this.f30790c;
                    i1.o0 o0VarH = e8Var.f30211b.h();
                    f8 f8Var = f8.PartiallyExpanded;
                    if (!o0VarH.f34055a.containsKey(f8Var)) {
                        f8Var = f8.Expanded;
                    }
                    Object objA = e8.a(e8Var, f8Var, this);
                    if (objA != aVar3) {
                        objA = b0Var;
                    }
                    if (objA == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f30789b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f30789b = 1;
                    if (this.f30790c.b(this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f30789b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f30789b = 1;
                    ob.s sVar = this.f30790c.f30211b;
                    Object objC = i1.p.c(sVar, f8.Expanded, ((l1.g1) sVar.f44885k).l(), this);
                    if (objC != aVar5) {
                        objC = b0Var2;
                    }
                    if (objC == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var2;
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f30789b;
                if (i16 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f30789b = 1;
                    if (this.f30790c.d(this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f30789b;
                if (i17 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f30789b = 1;
                    if (this.f30790c.b(this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
