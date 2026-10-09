package dv;

import com.google.api.Service;
import com.google.gson.JsonObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f24450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ JsonObject f24451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(u0 u0Var, JsonObject jsonObject, vy.d dVar, int i11) {
        super(1, dVar);
        this.f24448a = i11;
        this.f24450c = u0Var;
        this.f24451d = jsonObject;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        switch (this.f24448a) {
            case 0:
                return new g0(this.f24450c, this.f24451d, dVar, 0);
            case 1:
                return new g0(this.f24450c, this.f24451d, dVar, 1);
            case 2:
                return new g0(this.f24450c, this.f24451d, dVar, 2);
            case 3:
                return new g0(this.f24450c, this.f24451d, dVar, 3);
            case 4:
                return new g0(this.f24450c, this.f24451d, dVar, 4);
            case 5:
                return new g0(this.f24450c, this.f24451d, dVar, 5);
            case 6:
                return new g0(this.f24450c, this.f24451d, dVar, 6);
            case 7:
                return new g0(this.f24450c, this.f24451d, dVar, 7);
            case 8:
                return new g0(this.f24450c, this.f24451d, dVar, 8);
            case 9:
                return new g0(this.f24450c, this.f24451d, dVar, 9);
            case 10:
                return new g0(this.f24450c, this.f24451d, dVar, 10);
            case 11:
                return new g0(this.f24450c, this.f24451d, dVar, 11);
            case 12:
                return new g0(this.f24450c, this.f24451d, dVar, 12);
            case 13:
                return new g0(this.f24450c, this.f24451d, dVar, 13);
            case 14:
                return new g0(this.f24450c, this.f24451d, dVar, 14);
            case 15:
                return new g0(this.f24450c, this.f24451d, dVar, 15);
            case 16:
                return new g0(this.f24450c, this.f24451d, dVar, 16);
            case 17:
                return new g0(this.f24450c, this.f24451d, dVar, 17);
            case 18:
                return new g0(this.f24450c, this.f24451d, dVar, 18);
            case 19:
                return new g0(this.f24450c, this.f24451d, dVar, 19);
            case 20:
                return new g0(this.f24450c, this.f24451d, dVar, 20);
            case 21:
                return new g0(this.f24450c, this.f24451d, dVar, 21);
            case 22:
                return new g0(this.f24450c, this.f24451d, dVar, 22);
            case 23:
                return new g0(this.f24450c, this.f24451d, dVar, 23);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new g0(this.f24450c, this.f24451d, dVar, 24);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new g0(this.f24450c, this.f24451d, dVar, 25);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new g0(this.f24450c, this.f24451d, dVar, 26);
            case 27:
                return new g0(this.f24450c, this.f24451d, dVar, 27);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new g0(this.f24450c, this.f24451d, dVar, 28);
            default:
                return new g0(this.f24450c, this.f24451d, dVar, 29);
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        vy.d dVar = (vy.d) obj;
        switch (this.f24448a) {
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
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                break;
            case 27:
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                break;
        }
        return ((g0) create(dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f24448a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f24449b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objB = gVar.b(this.f24451d, this);
                return objB == aVar ? aVar : objB;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f24449b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar2 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objT = gVar2.t(this.f24451d, this);
                return objT == aVar2 ? aVar2 : objT;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f24449b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar3 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objA = gVar3.a(this.f24451d, this);
                return objA == aVar3 ? aVar3 : objA;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f24449b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar4 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objL = gVar4.L(this.f24451d, this);
                return objL == aVar4 ? aVar4 : objL;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f24449b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar5 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objR = gVar5.R(this.f24451d, this);
                return objR == aVar5 ? aVar5 : objR;
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f24449b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar6 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objT2 = gVar6.T(this.f24451d, this);
                return objT2 == aVar6 ? aVar6 : objT2;
            case 6:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f24449b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar7 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objX = gVar7.x(this.f24451d, this);
                return objX == aVar7 ? aVar7 : objX;
            case 7:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f24449b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar8 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objJ = gVar8.J(this.f24451d, this);
                return objJ == aVar8 ? aVar8 : objJ;
            case 8:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i19 = this.f24449b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar9 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objO = gVar9.O(this.f24451d, this);
                return objO == aVar9 ? aVar9 : objO;
            case 9:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f24449b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar10 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objM = gVar10.m(this.f24451d, this);
                return objM == aVar10 ? aVar10 : objM;
            case 10:
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                int i22 = this.f24449b;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar11 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objK = gVar11.K(this.f24451d, this);
                return objK == aVar11 ? aVar11 : objK;
            case 11:
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f24449b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar12 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objQ = gVar12.q(this.f24451d, this);
                return objQ == aVar12 ? aVar12 : objQ;
            case 12:
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                int i24 = this.f24449b;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar13 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objU = gVar13.u(this.f24451d, this);
                return objU == aVar13 ? aVar13 : objU;
            case 13:
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                int i25 = this.f24449b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar14 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objN = gVar14.n(this.f24451d, this);
                return objN == aVar14 ? aVar14 : objN;
            case 14:
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                int i26 = this.f24449b;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar15 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objS = gVar15.s(this.f24451d, this);
                return objS == aVar15 ? aVar15 : objS;
            case 15:
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                int i27 = this.f24449b;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar16 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objG = gVar16.g(this.f24451d, this);
                return objG == aVar16 ? aVar16 : objG;
            case 16:
                wy.a aVar17 = wy.a.COROUTINE_SUSPENDED;
                int i28 = this.f24449b;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar17 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objF = gVar17.f(this.f24451d, this);
                return objF == aVar17 ? aVar17 : objF;
            case 17:
                wy.a aVar18 = wy.a.COROUTINE_SUSPENDED;
                int i29 = this.f24449b;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar18 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objS2 = gVar18.S(this.f24451d, this);
                return objS2 == aVar18 ? aVar18 : objS2;
            case 18:
                wy.a aVar19 = wy.a.COROUTINE_SUSPENDED;
                int i30 = this.f24449b;
                if (i30 != 0) {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar19 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objE = gVar19.E(this.f24451d, this);
                return objE == aVar19 ? aVar19 : objE;
            case 19:
                wy.a aVar20 = wy.a.COROUTINE_SUSPENDED;
                int i31 = this.f24449b;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar20 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objW = gVar20.w(this.f24451d, this);
                return objW == aVar20 ? aVar20 : objW;
            case 20:
                wy.a aVar21 = wy.a.COROUTINE_SUSPENDED;
                int i32 = this.f24449b;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar21 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objY = gVar21.y(this.f24451d, this);
                return objY == aVar21 ? aVar21 : objY;
            case 21:
                wy.a aVar22 = wy.a.COROUTINE_SUSPENDED;
                int i33 = this.f24449b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar22 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objM2 = gVar22.M(this.f24451d, this);
                return objM2 == aVar22 ? aVar22 : objM2;
            case 22:
                wy.a aVar23 = wy.a.COROUTINE_SUSPENDED;
                int i34 = this.f24449b;
                if (i34 != 0) {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar23 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objE2 = gVar23.e(this.f24451d, this);
                return objE2 == aVar23 ? aVar23 : objE2;
            case 23:
                wy.a aVar24 = wy.a.COROUTINE_SUSPENDED;
                int i35 = this.f24449b;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar24 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objA0 = gVar24.a0(this.f24451d, this);
                return objA0 == aVar24 ? aVar24 : objA0;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                wy.a aVar25 = wy.a.COROUTINE_SUSPENDED;
                int i36 = this.f24449b;
                if (i36 != 0) {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar25 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objI = gVar25.I(this.f24451d, this);
                return objI == aVar25 ? aVar25 : objI;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                wy.a aVar26 = wy.a.COROUTINE_SUSPENDED;
                int i37 = this.f24449b;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar26 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objD0 = gVar26.d0(this.f24451d, this);
                return objD0 == aVar26 ? aVar26 : objD0;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                wy.a aVar27 = wy.a.COROUTINE_SUSPENDED;
                int i38 = this.f24449b;
                if (i38 != 0) {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar27 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objW2 = gVar27.W(this.f24451d, this);
                return objW2 == aVar27 ? aVar27 : objW2;
            case 27:
                wy.a aVar28 = wy.a.COROUTINE_SUSPENDED;
                int i39 = this.f24449b;
                if (i39 != 0) {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar28 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objA2 = gVar28.A(this.f24451d, this);
                return objA2 == aVar28 ? aVar28 : objA2;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                wy.a aVar29 = wy.a.COROUTINE_SUSPENDED;
                int i40 = this.f24449b;
                if (i40 != 0) {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar29 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objG2 = gVar29.G(this.f24451d, this);
                return objG2 == aVar29 ? aVar29 : objG2;
            default:
                wy.a aVar30 = wy.a.COROUTINE_SUSPENDED;
                int i41 = this.f24449b;
                if (i41 != 0) {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                g gVar30 = this.f24450c.f24524c;
                this.f24449b = 1;
                Object objY2 = gVar30.Y(this.f24451d, this);
                return objY2 == aVar30 ? aVar30 : objY2;
        }
    }
}
