package dv;

import com.google.api.Service;
import com.google.gson.JsonObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f24499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ JsonObject f24500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(u0 u0Var, JsonObject jsonObject, vy.d dVar, int i11) {
        super(1, dVar);
        this.f24497a = i11;
        this.f24499c = u0Var;
        this.f24500d = jsonObject;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        switch (this.f24497a) {
            case 0:
                return new p0(this.f24499c, this.f24500d, dVar, 0);
            case 1:
                return new p0(this.f24499c, this.f24500d, dVar, 1);
            case 2:
                return new p0(this.f24499c, this.f24500d, dVar, 2);
            case 3:
                return new p0(this.f24499c, this.f24500d, dVar, 3);
            case 4:
                return new p0(this.f24499c, this.f24500d, dVar, 4);
            case 5:
                return new p0(this.f24499c, this.f24500d, dVar, 5);
            case 6:
                return new p0(this.f24499c, this.f24500d, dVar, 6);
            case 7:
                return new p0(this.f24499c, this.f24500d, dVar, 7);
            case 8:
                return new p0(this.f24499c, this.f24500d, dVar, 8);
            case 9:
                return new p0(this.f24499c, this.f24500d, dVar, 9);
            case 10:
                return new p0(this.f24499c, this.f24500d, dVar, 10);
            case 11:
                return new p0(this.f24499c, this.f24500d, dVar, 11);
            case 12:
                return new p0(this.f24499c, this.f24500d, dVar, 12);
            case 13:
                return new p0(this.f24499c, this.f24500d, dVar, 13);
            case 14:
                return new p0(this.f24499c, this.f24500d, dVar, 14);
            case 15:
                return new p0(this.f24499c, this.f24500d, dVar, 15);
            case 16:
                return new p0(this.f24499c, this.f24500d, dVar, 16);
            case 17:
                return new p0(this.f24499c, this.f24500d, dVar, 17);
            case 18:
                return new p0(this.f24499c, this.f24500d, dVar, 18);
            case 19:
                return new p0(this.f24499c, this.f24500d, dVar, 19);
            case 20:
                return new p0(this.f24499c, this.f24500d, dVar, 20);
            case 21:
                return new p0(this.f24499c, this.f24500d, dVar, 21);
            case 22:
                return new p0(this.f24499c, this.f24500d, dVar, 22);
            case 23:
                return new p0(this.f24499c, this.f24500d, dVar, 23);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new p0(this.f24499c, this.f24500d, dVar, 24);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new p0(this.f24499c, this.f24500d, dVar, 25);
            default:
                return new p0(this.f24499c, this.f24500d, dVar, 26);
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        vy.d dVar = (vy.d) obj;
        switch (this.f24497a) {
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
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                break;
        }
        return ((p0) create(dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f24497a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f24498b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objZ = gVar.Z(this.f24500d, this);
                return objZ == aVar ? aVar : objZ;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f24498b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar2 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objB = gVar2.B(this.f24500d, this);
                return objB == aVar2 ? aVar2 : objB;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f24498b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar3 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objH = gVar3.h(this.f24500d, this);
                return objH == aVar3 ? aVar3 : objH;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f24498b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar4 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objD = gVar4.D(this.f24500d, this);
                return objD == aVar4 ? aVar4 : objD;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f24498b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar5 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objZ2 = gVar5.z(this.f24500d, this);
                return objZ2 == aVar5 ? aVar5 : objZ2;
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f24498b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar6 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objT = gVar6.t(this.f24500d, this);
                return objT == aVar6 ? aVar6 : objT;
            case 6:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f24498b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar7 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objJ = gVar7.j(this.f24500d, this);
                return objJ == aVar7 ? aVar7 : objJ;
            case 7:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f24498b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar8 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objR = gVar8.r(this.f24500d, this);
                return objR == aVar8 ? aVar8 : objR;
            case 8:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i19 = this.f24498b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar9 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objN = gVar9.N(this.f24500d, this);
                return objN == aVar9 ? aVar9 : objN;
            case 9:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f24498b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar10 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objC0 = gVar10.c0(this.f24500d, this);
                return objC0 == aVar10 ? aVar10 : objC0;
            case 10:
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                int i22 = this.f24498b;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar11 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objB0 = gVar11.b0(this.f24500d, this);
                return objB0 == aVar11 ? aVar11 : objB0;
            case 11:
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f24498b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar12 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objV = gVar12.V(this.f24500d, this);
                return objV == aVar12 ? aVar12 : objV;
            case 12:
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                int i24 = this.f24498b;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar13 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objC = gVar13.C(this.f24500d, this);
                return objC == aVar13 ? aVar13 : objC;
            case 13:
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                int i25 = this.f24498b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar14 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objH2 = gVar14.H(this.f24500d, this);
                return objH2 == aVar14 ? aVar14 : objH2;
            case 14:
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                int i26 = this.f24498b;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar15 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objO = gVar15.o(this.f24500d, this);
                return objO == aVar15 ? aVar15 : objO;
            case 15:
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                int i27 = this.f24498b;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar16 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objI = gVar16.i(this.f24500d, this);
                return objI == aVar16 ? aVar16 : objI;
            case 16:
                wy.a aVar17 = wy.a.COROUTINE_SUSPENDED;
                int i28 = this.f24498b;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar17 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objC2 = gVar17.c(this.f24500d, this);
                return objC2 == aVar17 ? aVar17 : objC2;
            case 17:
                wy.a aVar18 = wy.a.COROUTINE_SUSPENDED;
                int i29 = this.f24498b;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar18 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objX = gVar18.X(this.f24500d, this);
                return objX == aVar18 ? aVar18 : objX;
            case 18:
                wy.a aVar19 = wy.a.COROUTINE_SUSPENDED;
                int i30 = this.f24498b;
                if (i30 != 0) {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar19 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objQ = gVar19.Q(this.f24500d, this);
                return objQ == aVar19 ? aVar19 : objQ;
            case 19:
                wy.a aVar20 = wy.a.COROUTINE_SUSPENDED;
                int i31 = this.f24498b;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar20 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objD2 = gVar20.d(this.f24500d, this);
                return objD2 == aVar20 ? aVar20 : objD2;
            case 20:
                wy.a aVar21 = wy.a.COROUTINE_SUSPENDED;
                int i32 = this.f24498b;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar21 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objL = gVar21.l(this.f24500d, this);
                return objL == aVar21 ? aVar21 : objL;
            case 21:
                wy.a aVar22 = wy.a.COROUTINE_SUSPENDED;
                int i33 = this.f24498b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar22 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objP = gVar22.p(this.f24500d, this);
                return objP == aVar22 ? aVar22 : objP;
            case 22:
                wy.a aVar23 = wy.a.COROUTINE_SUSPENDED;
                int i34 = this.f24498b;
                if (i34 != 0) {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar23 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objV2 = gVar23.v(this.f24500d, this);
                return objV2 == aVar23 ? aVar23 : objV2;
            case 23:
                wy.a aVar24 = wy.a.COROUTINE_SUSPENDED;
                int i35 = this.f24498b;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar24 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objK = gVar24.k(this.f24500d, this);
                return objK == aVar24 ? aVar24 : objK;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                wy.a aVar25 = wy.a.COROUTINE_SUSPENDED;
                int i36 = this.f24498b;
                if (i36 != 0) {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar25 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objP2 = gVar25.P(this.f24500d, this);
                return objP2 == aVar25 ? aVar25 : objP2;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                wy.a aVar26 = wy.a.COROUTINE_SUSPENDED;
                int i37 = this.f24498b;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar26 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objF = gVar26.F(this.f24500d, this);
                return objF == aVar26 ? aVar26 : objF;
            default:
                wy.a aVar27 = wy.a.COROUTINE_SUSPENDED;
                int i38 = this.f24498b;
                if (i38 != 0) {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar27 = this.f24499c.f24524c;
                this.f24498b = 1;
                Object objU = gVar27.U(this.f24500d, this);
                return objU == aVar27 ? aVar27 : objU;
        }
    }
}
