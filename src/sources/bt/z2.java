package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jt.m1 f6256c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(jt.m1 m1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f6254a = i11;
        this.f6256c = m1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f6254a) {
            case 0:
                return new z2(this.f6256c, dVar, 0);
            case 1:
                return new z2(this.f6256c, dVar, 1);
            case 2:
                return new z2(this.f6256c, dVar, 2);
            case 3:
                return new z2(this.f6256c, dVar, 3);
            case 4:
                return new z2(this.f6256c, dVar, 4);
            case 5:
                return new z2(this.f6256c, dVar, 5);
            case 6:
                return new z2(this.f6256c, dVar, 6);
            case 7:
                return new z2(this.f6256c, dVar, 7);
            case 8:
                return new z2(this.f6256c, dVar, 8);
            case 9:
                return new z2(this.f6256c, dVar, 9);
            case 10:
                return new z2(this.f6256c, dVar, 10);
            case 11:
                return new z2(this.f6256c, dVar, 11);
            case 12:
                return new z2(this.f6256c, dVar, 12);
            case 13:
                return new z2(this.f6256c, dVar, 13);
            case 14:
                return new z2(this.f6256c, dVar, 14);
            default:
                return new z2(this.f6256c, dVar, 15);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f6254a) {
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
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
        }
        return ((z2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Type inference failed for: r4v16, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r4v2, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r4v20, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r4v24, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r4v28, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r4v38, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r4v42, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r4v52, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r4v56, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r4v6, types: [fz.c, xy.i] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6254a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f6255b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    ?? r9 = this.f6256c.f37070x;
                    this.f6255b = 1;
                    if (r9.invoke(this) == aVar) {
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
                int i12 = this.f6255b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    ?? r11 = this.f6256c.f37070x;
                    this.f6255b = 1;
                    if (r11.invoke(this) == aVar2) {
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
                int i13 = this.f6255b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f6255b = 1;
                    if (this.f6256c.b(this) == aVar3) {
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
                int i14 = this.f6255b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f6255b = 1;
                    if (this.f6256c.a(this) == aVar4) {
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
                int i15 = this.f6255b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    ?? r12 = this.f6256c.f37071y;
                    this.f6255b = 1;
                    if (r12.invoke(this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f6255b;
                if (i16 == 0) {
                    com.bumptech.glide.e.F(obj);
                    ?? r13 = this.f6256c.f37072z;
                    this.f6255b = 1;
                    if (r13.invoke(this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 6:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f6255b;
                if (i17 == 0) {
                    com.bumptech.glide.e.F(obj);
                    ?? r14 = this.f6256c.f37070x;
                    this.f6255b = 1;
                    if (r14.invoke(this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 7:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f6255b;
                if (i18 == 0) {
                    com.bumptech.glide.e.F(obj);
                    ?? r15 = this.f6256c.f37070x;
                    this.f6255b = 1;
                    if (r15.invoke(this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 8:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i19 = this.f6255b;
                if (i19 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f6255b = 1;
                    if (this.f6256c.b(this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 9:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f6255b;
                if (i21 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f6255b = 1;
                    if (this.f6256c.a(this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 10:
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                int i22 = this.f6255b;
                if (i22 == 0) {
                    com.bumptech.glide.e.F(obj);
                    ?? r16 = this.f6256c.f37070x;
                    this.f6255b = 1;
                    if (r16.invoke(this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 11:
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f6255b;
                if (i23 == 0) {
                    com.bumptech.glide.e.F(obj);
                    ?? r17 = this.f6256c.f37070x;
                    this.f6255b = 1;
                    if (r17.invoke(this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 12:
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                int i24 = this.f6255b;
                if (i24 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f6255b = 1;
                    if (this.f6256c.b(this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 13:
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                int i25 = this.f6255b;
                if (i25 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f6255b = 1;
                    if (this.f6256c.a(this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 14:
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                int i26 = this.f6255b;
                if (i26 == 0) {
                    com.bumptech.glide.e.F(obj);
                    ?? r18 = this.f6256c.f37071y;
                    this.f6255b = 1;
                    if (r18.invoke(this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                int i27 = this.f6255b;
                if (i27 == 0) {
                    com.bumptech.glide.e.F(obj);
                    ?? r19 = this.f6256c.f37072z;
                    this.f6255b = 1;
                    if (r19.invoke(this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
