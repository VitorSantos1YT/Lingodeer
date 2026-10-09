package fr;

import com.lingodeer.database.model.DauMetricsEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x4 f27993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3(x4 x4Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f27991a = i11;
        this.f27993c = x4Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27991a) {
            case 0:
                return new y3(this.f27993c, dVar, 0);
            case 1:
                return new y3(this.f27993c, dVar, 1);
            default:
                return new y3(this.f27993c, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27991a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((y3) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27991a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f27992b;
                x4 x4Var = this.f27993c;
                if (i11 != 0) {
                    if (i11 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else if (i11 == 2) {
                        com.bumptech.glide.e.F(obj);
                        this.f27992b = 3;
                        if (x4.h(x4Var, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                au.m0 m0VarH = x4Var.f27968a.H();
                String id2 = ks.f.b();
                m0VarH.getClass();
                kotlin.jvm.internal.m.f(id2, "id");
                no.g gVarL = qx.p.l(m0VarH.f3046a, new String[]{"dau_metrics"}, new au.f(id2, 6));
                this.f27992b = 1;
                obj = uz.x0.u(gVarL, this);
                if (obj == aVar) {
                    return aVar;
                }
                if (((DauMetricsEntity) obj) == null) {
                    au.m0 m0VarH2 = x4Var.f27968a.H();
                    DauMetricsEntity dauMetricsEntity = new DauMetricsEntity(ks.f.b(), 0, true, false);
                    this.f27992b = 2;
                    if (m0VarH2.a(dauMetricsEntity, this) == aVar) {
                        return aVar;
                    }
                }
                this.f27992b = 3;
                if (x4.h(x4Var, this) == aVar) {
                    return aVar;
                }
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f27992b;
                x4 x4Var2 = this.f27993c;
                if (i12 != 0) {
                    if (i12 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else if (i12 == 2 || i12 == 3) {
                        com.bumptech.glide.e.F(obj);
                        this.f27992b = 4;
                        if (x4.h(x4Var2, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i12 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                au.m0 m0VarH3 = x4Var2.f27968a.H();
                String id3 = ks.f.b();
                m0VarH3.getClass();
                kotlin.jvm.internal.m.f(id3, "id");
                no.g gVarL2 = qx.p.l(m0VarH3.f3046a, new String[]{"dau_metrics"}, new au.f(id3, 6));
                this.f27992b = 1;
                obj = uz.x0.u(gVarL2, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                DauMetricsEntity dauMetricsEntity2 = (DauMetricsEntity) obj;
                if (dauMetricsEntity2 == null) {
                    au.m0 m0VarH4 = x4Var2.f27968a.H();
                    DauMetricsEntity dauMetricsEntity3 = new DauMetricsEntity(ks.f.b(), 1, true, true);
                    this.f27992b = 2;
                    if (m0VarH4.a(dauMetricsEntity3, this) == aVar2) {
                        return aVar2;
                    }
                } else if (dauMetricsEntity2.getFinishLessonType() == 0) {
                    au.m0 m0VarH5 = x4Var2.f27968a.H();
                    DauMetricsEntity dauMetricsEntityCopy$default = DauMetricsEntity.copy$default(dauMetricsEntity2, null, 1, false, true, 5, null);
                    this.f27992b = 3;
                    if (m0VarH5.a(dauMetricsEntityCopy$default, this) == aVar2) {
                        return aVar2;
                    }
                }
                this.f27992b = 4;
                if (x4.h(x4Var2, this) == aVar2) {
                    return aVar2;
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f27992b;
                x4 x4Var3 = this.f27993c;
                try {
                    if (i13 != 0) {
                        if (i13 == 1) {
                            com.bumptech.glide.e.F(obj);
                        } else {
                            if (i13 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.e.F(obj);
                        }
                        x4Var3.f27973f.c();
                        return Boolean.TRUE;
                    }
                    com.bumptech.glide.e.F(obj);
                    gq.w wVarB = x4Var3.f27973f.b(false);
                    this.f27992b = 1;
                    obj = x4.b(x4Var3, wVarB, true, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        Boolean bool = Boolean.FALSE;
                        x4Var3.f27973f.c();
                        return bool;
                    }
                    this.f27992b = 2;
                    if (x4.e(x4Var3, this) == aVar3) {
                        return aVar3;
                    }
                    x4Var3.f27973f.c();
                    return Boolean.TRUE;
                } catch (Throwable th2) {
                    x4Var3.f27973f.c();
                    throw th2;
                }
        }
    }
}
