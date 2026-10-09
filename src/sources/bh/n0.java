package bh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f4304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f4305d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i11, long j11, a1 a1Var, vy.d dVar) {
        super(2, dVar);
        this.f4302a = i11;
        this.f4304c = a1Var;
        this.f4305d = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4302a) {
            case 0:
                return new n0(0, this.f4305d, this.f4304c, dVar);
            case 1:
                return new n0(1, this.f4305d, this.f4304c, dVar);
            case 2:
                return new n0(2, this.f4305d, this.f4304c, dVar);
            case 3:
                return new n0(3, this.f4305d, this.f4304c, dVar);
            case 4:
                return new n0(4, this.f4305d, this.f4304c, dVar);
            case 5:
                return new n0(5, this.f4305d, this.f4304c, dVar);
            case 6:
                return new n0(6, this.f4305d, this.f4304c, dVar);
            case 7:
                return new n0(7, this.f4305d, this.f4304c, dVar);
            case 8:
                return new n0(8, this.f4305d, this.f4304c, dVar);
            default:
                return new n0(9, this.f4305d, this.f4304c, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4302a) {
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
        }
        return ((n0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4302a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f4303b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    a1 a1Var = this.f4304c;
                    m0 m0Var = new m0(a1Var.f(((fr.o0) a1Var.f4149c).f27733a.keyLanguage, this.f4305d), a1Var, 0);
                    this.f4303b = 1;
                    if (uz.x0.u(m0Var, this) == aVar) {
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
                int i12 = this.f4303b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    a1 a1Var2 = this.f4304c;
                    m0 m0Var2 = new m0(a1Var2.f(((fr.o0) a1Var2.f4149c).f27733a.keyLanguage, this.f4305d), a1Var2, 1);
                    this.f4303b = 1;
                    if (uz.x0.u(m0Var2, this) == aVar2) {
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
                int i13 = this.f4303b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    a1 a1Var3 = this.f4304c;
                    m0 m0Var3 = new m0(a1Var3.f(((fr.o0) a1Var3.f4149c).f27733a.keyLanguage, this.f4305d), a1Var3, 2);
                    this.f4303b = 1;
                    if (uz.x0.u(m0Var3, this) == aVar3) {
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
                int i14 = this.f4303b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    a1 a1Var4 = this.f4304c;
                    m0 m0Var4 = new m0(a1Var4.f(((fr.o0) a1Var4.f4149c).f27733a.keyLanguage, this.f4305d), a1Var4, 3);
                    this.f4303b = 1;
                    if (uz.x0.u(m0Var4, this) == aVar4) {
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
                int i15 = this.f4303b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    a1 a1Var5 = this.f4304c;
                    m0 m0Var5 = new m0(a1Var5.h(((fr.o0) a1Var5.f4149c).f27733a.keyLanguage, this.f4305d), a1Var5, 4);
                    this.f4303b = 1;
                    if (uz.x0.u(m0Var5, this) == aVar5) {
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
                int i16 = this.f4303b;
                if (i16 == 0) {
                    com.bumptech.glide.e.F(obj);
                    a1 a1Var6 = this.f4304c;
                    m0 m0Var6 = new m0(a1Var6.h(((fr.o0) a1Var6.f4149c).f27733a.keyLanguage, this.f4305d), a1Var6, 5);
                    this.f4303b = 1;
                    if (uz.x0.u(m0Var6, this) == aVar6) {
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
                int i17 = this.f4303b;
                if (i17 == 0) {
                    com.bumptech.glide.e.F(obj);
                    a1 a1Var7 = this.f4304c;
                    m0 m0Var7 = new m0(a1Var7.h(((fr.o0) a1Var7.f4149c).f27733a.keyLanguage, this.f4305d), a1Var7, 6);
                    this.f4303b = 1;
                    if (uz.x0.u(m0Var7, this) == aVar7) {
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
                int i18 = this.f4303b;
                if (i18 == 0) {
                    com.bumptech.glide.e.F(obj);
                    a1 a1Var8 = this.f4304c;
                    m0 m0Var8 = new m0(a1Var8.h(((fr.o0) a1Var8.f4149c).f27733a.keyLanguage, this.f4305d), a1Var8, 7);
                    this.f4303b = 1;
                    if (uz.x0.u(m0Var8, this) == aVar8) {
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
                int i19 = this.f4303b;
                if (i19 == 0) {
                    com.bumptech.glide.e.F(obj);
                    a1 a1Var9 = this.f4304c;
                    m0 m0Var9 = new m0(a1Var9.h(((fr.o0) a1Var9.f4149c).f27733a.keyLanguage, this.f4305d), a1Var9, 8);
                    this.f4303b = 1;
                    if (uz.x0.u(m0Var9, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f4303b;
                if (i21 == 0) {
                    com.bumptech.glide.e.F(obj);
                    a1 a1Var10 = this.f4304c;
                    m0 m0Var10 = new m0(a1Var10.h(((fr.o0) a1Var10.f4149c).f27733a.keyLanguage, this.f4305d), a1Var10, 9);
                    this.f4303b = 1;
                    if (uz.x0.u(m0Var10, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
