package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f23660c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(int i11, l1.b1 b1Var, vy.d dVar) {
        super(2, dVar);
        this.f23658a = 7;
        this.f23659b = i11;
        this.f23660c = b1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f23658a) {
            case 0:
                return new b2(this.f23660c, dVar, 0);
            case 1:
                return new b2(this.f23660c, dVar, 1);
            case 2:
                return new b2(this.f23660c, dVar, 2);
            case 3:
                return new b2(this.f23660c, dVar, 3);
            case 4:
                return new b2(this.f23660c, dVar, 4);
            case 5:
                return new b2(this.f23660c, dVar, 5);
            case 6:
                return new b2(this.f23660c, dVar, 6);
            case 7:
                return new b2(this.f23659b, this.f23660c, dVar);
            case 8:
                return new b2(this.f23660c, dVar, 8);
            case 9:
                return new b2(this.f23660c, dVar, 9);
            case 10:
                return new b2(this.f23660c, dVar, 10);
            default:
                return new b2(this.f23660c, dVar, 11);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f23658a) {
            case 0:
                return ((b2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((b2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((b2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((b2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((b2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((b2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((b2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 7:
                b2 b2Var = (b2) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                b2Var.invokeSuspend(b0Var2);
                return b0Var2;
            case 8:
                return ((b2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((b2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((b2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((b2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f23658a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.b1 b1Var = this.f23660c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f23659b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f23659b = 1;
                    if (rz.e0.m(300L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f23659b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f23659b = 1;
                    if (rz.e0.m(300L, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f23659b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f23659b = 1;
                    if (rz.e0.m(4000L, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f23659b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f23659b = 1;
                    if (rz.e0.m(600L, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f23659b;
                if (i16 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f23659b = 1;
                    if (rz.e0.m(300L, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f23659b;
                if (i17 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (!((Boolean) b1Var.getValue()).booleanValue()) {
                        return b0Var;
                    }
                    this.f23659b = 1;
                    if (rz.e0.m(500L, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 6:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f23659b;
                if (i18 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f23659b = 1;
                    if (rz.e0.m(500L, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 7:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (this.f23659b == 3) {
                    b1Var.setValue(Boolean.TRUE);
                }
                return b0Var;
            case 8:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i19 = this.f23659b;
                if (i19 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f23659b = 1;
                    if (rz.e0.m(200L, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 9:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f23659b;
                if (i21 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f23659b = 1;
                    if (rz.e0.m(200L, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 10:
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                int i22 = this.f23659b;
                if (i22 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f23659b = 1;
                    if (rz.e0.m(200L, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            default:
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f23659b;
                if (i23 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f23659b = 1;
                    if (rz.e0.m(4000L, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                oz.o oVar = ys.j3.f58088a;
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(l1.b1 b1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f23658a = i11;
        this.f23660c = b1Var;
    }
}
