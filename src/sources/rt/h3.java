package rt;

import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b4 f49817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f49818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f49819e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3(b4 b4Var, m0 m0Var, String str, vy.d dVar, int i11) {
        super(2, dVar);
        this.f49815a = i11;
        this.f49817c = b4Var;
        this.f49818d = m0Var;
        this.f49819e = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f49815a) {
            case 0:
                return new h3(this.f49817c, this.f49818d, this.f49819e, dVar, 0);
            case 1:
                return new h3(this.f49817c, this.f49818d, this.f49819e, dVar, 1);
            case 2:
                return new h3(this.f49817c, this.f49818d, this.f49819e, dVar, 2);
            default:
                return new h3(this.f49817c, this.f49818d, this.f49819e, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f49815a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((h3) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0117  */
    /* JADX WARN: Code duplicated, block: B:59:0x0123  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        String str;
        Object value3;
        Object objB;
        switch (this.f49815a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f49816b;
                qy.b0 b0Var = qy.b0.f48488a;
                m0 m0Var = this.f49818d;
                b4 b4Var = this.f49817c;
                if (i11 != 0) {
                    if (i11 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else if (i11 == 2) {
                        com.bumptech.glide.e.F(obj);
                        vt.c cVar = b4Var.f49493e;
                        this.f49816b = 3;
                        ((vt.d) cVar).j(this);
                        if (b0Var == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    uz.i1 i1Var = b4Var.f49499i0;
                    i1Var.getClass();
                    i1Var.l(null, o.f50161a);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f49816b = 1;
                if (b4.c(b4Var, m0Var, this) == aVar) {
                    return aVar;
                }
                this.f49816b = 2;
                if (b4.d(b4Var, m0Var, this.f49819e, this) == aVar) {
                    return aVar;
                }
                vt.c cVar2 = b4Var.f49493e;
                this.f49816b = 3;
                ((vt.d) cVar2).j(this);
                if (b0Var == aVar) {
                    return aVar;
                }
                uz.i1 i1Var2 = b4Var.f49499i0;
                i1Var2.getClass();
                i1Var2.l(null, o.f50161a);
                return b0Var;
            case 1:
                b4 b4Var2 = this.f49817c;
                uz.i1 i1Var3 = b4Var2.Z;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f49816b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                m0 m0Var2 = this.f49818d;
                try {
                    try {
                        if (i12 != 0) {
                            if (i12 == 1) {
                                com.bumptech.glide.e.F(obj);
                            } else if (i12 == 2) {
                                com.bumptech.glide.e.F(obj);
                                str = this.f49819e;
                                this.f49816b = 3;
                                if (b4.d(b4Var2, m0Var2, str, this) == aVar2) {
                                    return aVar2;
                                }
                                vt.c cVar3 = b4Var2.f49493e;
                                this.f49816b = 4;
                                ((vt.d) cVar3).j(this);
                                if (b0Var2 == aVar2) {
                                    return aVar2;
                                }
                            } else if (i12 == 3) {
                                com.bumptech.glide.e.F(obj);
                                vt.c cVar4 = b4Var2.f49493e;
                                this.f49816b = 4;
                                ((vt.d) cVar4).j(this);
                                if (b0Var2 == aVar2) {
                                    return aVar2;
                                }
                            } else {
                                if (i12 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                com.bumptech.glide.e.F(obj);
                            }
                            uz.i1 i1Var4 = b4Var2.f49499i0;
                            o oVar = o.f50161a;
                            i1Var4.getClass();
                            i1Var4.l(null, oVar);
                            do {
                                value3 = i1Var3.getValue();
                            } while (!i1Var3.j(value3, qx.b.y((Set) value3, m0Var2.f50042a)));
                            return b0Var2;
                        }
                        com.bumptech.glide.e.F(obj);
                        vt.e eVar = b4Var2.f49495f;
                        String strK = xt.d.k(((fr.o0) b4Var2.f49491d).f27733a.keyLanguage);
                        String str2 = m0Var2.f50042a;
                        String str3 = m0Var2.f50043b;
                        this.f49816b = 1;
                        if (((fr.r) eVar).a(strK, str2, true, str3, this) == aVar2) {
                            return aVar2;
                        }
                        b4.b(b4Var2, m0Var2.f50042a, true);
                        this.f49816b = 2;
                        if (b4.c(b4Var2, m0Var2, this) == aVar2) {
                            return aVar2;
                        }
                        str = this.f49819e;
                        this.f49816b = 3;
                        if (b4.d(b4Var2, m0Var2, str, this) == aVar2) {
                            return aVar2;
                        }
                        vt.c cVar5 = b4Var2.f49493e;
                        this.f49816b = 4;
                        ((vt.d) cVar5).j(this);
                        if (b0Var2 == aVar2) {
                            return aVar2;
                        }
                        uz.i1 i1Var5 = b4Var2.f49499i0;
                        o oVar2 = o.f50161a;
                        i1Var5.getClass();
                        i1Var5.l(null, oVar2);
                        do {
                            value3 = i1Var3.getValue();
                        } while (!i1Var3.j(value3, qx.b.y((Set) value3, m0Var2.f50042a)));
                    } catch (Exception e8) {
                        if (e8 instanceof CancellationException) {
                            throw e8;
                        }
                        b4.b(b4Var2, m0Var2.f50042a, true);
                        do {
                            value = i1Var3.getValue();
                        } while (!i1Var3.j(value, qx.b.y((Set) value, m0Var2.f50042a)));
                    }
                    return b0Var2;
                } catch (Throwable th2) {
                    do {
                        value2 = i1Var3.getValue();
                    } while (!i1Var3.j(value2, qx.b.y((Set) value2, m0Var2.f50042a)));
                    throw th2;
                }
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f49816b;
                b4 b4Var3 = this.f49817c;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.h hVar = b4Var3.H;
                    String strK2 = xt.d.k(((fr.o0) b4Var3.f49491d).f27733a.keyLanguage);
                    String str4 = this.f49818d.f50043b;
                    this.f49816b = 1;
                    objB = ((vt.r) hVar).b(strK2, str4, this.f49819e, this);
                    if (objB == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objB = obj;
                }
                uz.i1 i1Var6 = b4Var3.f49499i0;
                p pVarD = ia.d((vt.y) objB);
                i1Var6.getClass();
                i1Var6.l(null, pVarD);
                return qy.b0.f48488a;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f49816b;
                qy.b0 b0Var3 = qy.b0.f48488a;
                b4 b4Var4 = this.f49817c;
                if (i14 != 0) {
                    if (i14 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return b0Var3;
                }
                com.bumptech.glide.e.F(obj);
                vt.p0 p0Var = b4Var4.f49507t;
                String strK3 = xt.d.k(((fr.o0) b4Var4.f49491d).f27733a.keyLanguage);
                m0 m0Var3 = this.f49818d;
                String str5 = m0Var3.f50044c;
                long j11 = m0Var3.f50045d;
                this.f49816b = 1;
                if (((fr.x0) p0Var).d(strK3, str5, j11, this.f49819e, this) == aVar4) {
                    return aVar4;
                }
                vt.c cVar6 = b4Var4.f49493e;
                this.f49816b = 2;
                ((vt.d) cVar6).j(this);
                if (b0Var3 == aVar4) {
                    return aVar4;
                }
                return b0Var3;
        }
    }
}
