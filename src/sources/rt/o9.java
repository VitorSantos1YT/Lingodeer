package rt;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o9 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y9 f50207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ja f50208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f50209e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o9(y9 y9Var, ja jaVar, String str, vy.d dVar, int i11) {
        super(2, dVar);
        this.f50205a = i11;
        this.f50207c = y9Var;
        this.f50208d = jaVar;
        this.f50209e = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f50205a) {
            case 0:
                return new o9(this.f50207c, this.f50208d, this.f50209e, dVar, 0);
            case 1:
                return new o9(this.f50207c, this.f50208d, this.f50209e, dVar, 1);
            default:
                return new o9(this.f50207c, this.f50208d, this.f50209e, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f50205a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((o9) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        String str;
        Object value4;
        Object objB;
        switch (this.f50205a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f50206b;
                qy.b0 b0Var = qy.b0.f48488a;
                ja jaVar = this.f50208d;
                y9 y9Var = this.f50207c;
                if (i11 != 0) {
                    if (i11 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else if (i11 == 2) {
                        com.bumptech.glide.e.F(obj);
                        vt.c cVar = y9Var.f50703b;
                        this.f50206b = 3;
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
                    uz.i1 i1Var = y9Var.f50715i0;
                    i1Var.getClass();
                    i1Var.l(null, o.f50161a);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f50206b = 1;
                if (y9.a(y9Var, jaVar, this) == aVar) {
                    return aVar;
                }
                this.f50206b = 2;
                if (y9.b(y9Var, jaVar, this.f50209e, this) == aVar) {
                    return aVar;
                }
                vt.c cVar2 = y9Var.f50703b;
                this.f50206b = 3;
                ((vt.d) cVar2).j(this);
                if (b0Var == aVar) {
                    return aVar;
                }
                uz.i1 i1Var2 = y9Var.f50715i0;
                i1Var2.getClass();
                i1Var2.l(null, o.f50161a);
                return b0Var;
            case 1:
                y9 y9Var2 = this.f50207c;
                uz.i1 i1Var3 = y9Var2.f50710e0;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f50206b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                ja jaVar2 = this.f50208d;
                try {
                    try {
                        if (i12 != 0) {
                            if (i12 == 1) {
                                com.bumptech.glide.e.F(obj);
                            } else if (i12 == 2) {
                                com.bumptech.glide.e.F(obj);
                                str = this.f50209e;
                                this.f50206b = 3;
                                if (y9.b(y9Var2, jaVar2, str, this) == aVar2) {
                                    return aVar2;
                                }
                                vt.c cVar3 = y9Var2.f50703b;
                                this.f50206b = 4;
                                ((vt.d) cVar3).j(this);
                                if (b0Var2 == aVar2) {
                                    return aVar2;
                                }
                            } else if (i12 == 3) {
                                com.bumptech.glide.e.F(obj);
                                vt.c cVar4 = y9Var2.f50703b;
                                this.f50206b = 4;
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
                            uz.i1 i1Var4 = y9Var2.f50715i0;
                            o oVar = o.f50161a;
                            i1Var4.getClass();
                            i1Var4.l(null, oVar);
                            do {
                                value4 = i1Var3.getValue();
                            } while (!i1Var3.j(value4, qx.b.y((Set) value4, jaVar2.f49927a)));
                            return b0Var2;
                        }
                        com.bumptech.glide.e.F(obj);
                        vt.e eVar = y9Var2.f50705c;
                        String strK = xt.d.k(((fr.o0) y9Var2.f50701a).f27733a.keyLanguage);
                        String str2 = jaVar2.f49927a;
                        String str3 = jaVar2.f49928b;
                        this.f50206b = 1;
                        if (((fr.r) eVar).a(strK, str2, true, str3, this) == aVar2) {
                            return aVar2;
                        }
                        this.f50206b = 2;
                        if (y9.a(y9Var2, jaVar2, this) == aVar2) {
                            return aVar2;
                        }
                        str = this.f50209e;
                        this.f50206b = 3;
                        if (y9.b(y9Var2, jaVar2, str, this) == aVar2) {
                            return aVar2;
                        }
                        vt.c cVar5 = y9Var2.f50703b;
                        this.f50206b = 4;
                        ((vt.d) cVar5).j(this);
                        if (b0Var2 == aVar2) {
                            return aVar2;
                        }
                        uz.i1 i1Var5 = y9Var2.f50715i0;
                        o oVar2 = o.f50161a;
                        i1Var5.getClass();
                        i1Var5.l(null, oVar2);
                        do {
                            value4 = i1Var3.getValue();
                        } while (!i1Var3.j(value4, qx.b.y((Set) value4, jaVar2.f49927a)));
                    } catch (Exception e8) {
                        if (e8 instanceof CancellationException) {
                            throw e8;
                        }
                        uz.i1 i1Var6 = y9Var2.f50712f0;
                        do {
                            value2 = i1Var6.getValue();
                        } while (!i1Var6.j(value2, ry.x.Z(jaVar2.f49927a, (Map) value2)));
                        do {
                            value3 = i1Var3.getValue();
                        } while (!i1Var3.j(value3, qx.b.y((Set) value3, jaVar2.f49927a)));
                    }
                    return b0Var2;
                } catch (Throwable th2) {
                    do {
                        value = i1Var3.getValue();
                    } while (!i1Var3.j(value, qx.b.y((Set) value, jaVar2.f49927a)));
                    throw th2;
                }
            default:
                y9 y9Var3 = this.f50207c;
                uz.i1 i1Var7 = y9Var3.f50715i0;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f50206b;
                qy.b0 b0Var3 = qy.b0.f48488a;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.h hVar = y9Var3.f50709e;
                    if (hVar == null) {
                        i1Var7.getClass();
                        i1Var7.l(null, n.f50107a);
                    } else {
                        String strK2 = xt.d.k(((fr.o0) y9Var3.f50701a).f27733a.keyLanguage);
                        String str4 = this.f50208d.f49928b;
                        this.f50206b = 1;
                        objB = ((vt.r) hVar).b(strK2, str4, this.f50209e, this);
                        if (objB == aVar3) {
                            return aVar3;
                        }
                    }
                    return b0Var3;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                objB = obj;
                p pVarD = ia.d((vt.y) objB);
                i1Var7.getClass();
                i1Var7.l(null, pVarD);
                return b0Var3;
        }
    }
}
