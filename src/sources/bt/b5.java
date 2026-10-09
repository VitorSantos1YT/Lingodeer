package bt;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.v;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b5 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5221a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f5223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5226f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5227t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(float f5, f0.l lVar, f0.e2 e2Var, vy.d dVar) {
        super(2, dVar);
        this.f5223c = f5;
        this.f5226f = lVar;
        this.f5227t = e2Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5221a) {
            case 0:
                return new b5((i8) this.f5225e, (p0.c) this.f5226f, this.f5223c, (l1.a1) this.f5227t, dVar);
            case 1:
                return new b5(this.f5223c, (f0.l) this.f5226f, (f0.e2) this.f5227t, dVar);
            default:
                return new b5((g0.g) this.f5225e, this.f5223c, (fz.c) this.f5226f, (f0.n1) this.f5227t, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f5221a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((b5) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0331  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v15, types: [g0.d] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        i8 i8Var;
        p0.c cVar;
        f2.c cVar2;
        float f5;
        float f11;
        b0.n nVar;
        kotlin.jvm.internal.v vVar;
        float f12;
        float fSignum;
        final kotlin.jvm.internal.v vVar2;
        Object objB;
        float f13;
        float f14;
        switch (this.f5221a) {
            case 0:
                l1.a1 a1Var = (l1.a1) this.f5227t;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f5222b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i8Var = (i8) this.f5225e;
                    if (i8Var != null && ((l1.h1) a1Var).l() != 0 && i8Var.f5550b > i8Var.f5549a) {
                        com.lingo.lingoskill.object.a aVar2 = new com.lingo.lingoskill.object.a(28);
                        this.f5224d = i8Var;
                        this.f5222b = 1;
                        if (l1.t.x(getContext()).p(aVar2, this) == aVar) {
                            return aVar;
                        }
                        cVar = (p0.c) this.f5226f;
                        float f15 = i8Var.f5549a;
                        float f16 = this.f5223c;
                        f5 = f15 - f16;
                        if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                            f5 = 0.0f;
                        }
                        cVar2 = new f2.c(CropImageView.DEFAULT_ASPECT_RATIO, f5, ((l1.h1) a1Var).l(), i8Var.f5550b + f16);
                        this.f5224d = null;
                        this.f5222b = 2;
                        if (cVar.a(cVar2, this) == aVar) {
                            return aVar;
                        }
                    }
                } else if (i11 == 1) {
                    i8Var = (i8) this.f5224d;
                    com.bumptech.glide.e.F(obj);
                    cVar = (p0.c) this.f5226f;
                    float f17 = i8Var.f5549a;
                    float f18 = this.f5223c;
                    f5 = f17 - f18;
                    if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                        f5 = 0.0f;
                    }
                    cVar2 = new f2.c(CropImageView.DEFAULT_ASPECT_RATIO, f5, ((l1.h1) a1Var).l(), i8Var.f5550b + f18);
                    this.f5224d = null;
                    this.f5222b = 2;
                    if (cVar.a(cVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            case 1:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f5222b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = (b0.n) this.f5225e;
                    vVar = (kotlin.jvm.internal.v) this.f5224d;
                    try {
                        com.bumptech.glide.e.F(obj);
                    } catch (CancellationException unused) {
                        vVar.f38358a = ((Number) nVar.b()).floatValue();
                    }
                    f11 = vVar.f38358a;
                    break;
                } else {
                    com.bumptech.glide.e.F(obj);
                    f11 = this.f5223c;
                    if (Math.abs(f11) > 1.0f) {
                        kotlin.jvm.internal.v vVar3 = new kotlin.jvm.internal.v();
                        vVar3.f38358a = f11;
                        kotlin.jvm.internal.v vVar4 = new kotlin.jvm.internal.v();
                        b0.n nVarB = b0.e.b(CropImageView.DEFAULT_ASPECT_RATIO, f11, 28);
                        try {
                            f0.l lVar = (f0.l) this.f5226f;
                            b0.x xVar = lVar.f26345a;
                            aj.c cVar3 = new aj.c(vVar4, (f0.e2) this.f5227t, vVar3, lVar);
                            this.f5224d = vVar3;
                            this.f5225e = nVarB;
                            this.f5222b = 1;
                            if (b0.e.f(nVarB, xVar, false, cVar3, this) == aVar3) {
                                return aVar3;
                            }
                            vVar = vVar3;
                            f11 = vVar.f38358a;
                        } catch (CancellationException unused2) {
                            nVar = nVarB;
                            vVar = vVar3;
                            vVar.f38358a = ((Number) nVar.b()).floatValue();
                        }
                    }
                }
                return new Float(f11);
            default:
                final fz.c cVar4 = (fz.c) this.f5226f;
                g0.g gVar = (g0.g) this.f5225e;
                ob.u uVar = gVar.f28334a;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f5222b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    ob.i iVar = new ob.i(gVar.f28335b.f3731a);
                    b0.o oVar = new b0.o(CropImageView.DEFAULT_ASPECT_RATIO);
                    float f19 = this.f5223c;
                    float f21 = ((b0.o) iVar.m(oVar, new b0.o(f19))).f3626a;
                    o0.t tVar = (o0.t) uVar.f44891b;
                    int iN = tVar.n();
                    l1.k1 k1Var = tVar.f44446p;
                    int i14 = ((o0.n) k1Var.getValue()).f44402c + iN;
                    if (i14 == 0) {
                        fSignum = 0.0f;
                        f12 = 0.0f;
                    } else {
                        int i15 = f19 < CropImageView.DEFAULT_ASPECT_RATIO ? tVar.f44436e + 1 : tVar.f44436e;
                        int iL = hz.b.l(((int) (f21 / i14)) + i15, 0, tVar.m());
                        tVar.n();
                        int i16 = ((o0.n) k1Var.getValue()).f44402c;
                        f12 = 0.0f;
                        long j11 = i15;
                        long j12 = 1;
                        long j13 = j11 - j12;
                        int i17 = (int) (j13 < 0 ? 0L : j13);
                        long j14 = j11 + j12;
                        if (j14 > 2147483647L) {
                            j14 = 2147483647L;
                        }
                        int iAbs = Math.abs((hz.b.l(hz.b.l(iL, i17, (int) j14), 0, tVar.m()) - i15) * i14) - i14;
                        if (iAbs < 0) {
                            iAbs = 0;
                        }
                        fSignum = iAbs == 0 ? iAbs : iAbs * Math.signum(f19);
                    }
                    if (Float.isNaN(fSignum)) {
                        i0.a.c("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    vVar2 = new kotlin.jvm.internal.v();
                    float fSignum2 = Math.signum(f19) * Math.abs(fSignum);
                    vVar2.f38358a = fSignum2;
                    cVar4.invoke(new Float(fSignum2));
                    f0.n1 n1Var = (f0.n1) this.f5227t;
                    float f22 = vVar2.f38358a;
                    final int i18 = 0;
                    ?? r9 = new fz.c() { // from class: g0.d
                        @Override // fz.c
                        public final Object invoke(Object obj2) {
                            int i19 = i18;
                            float fFloatValue = ((Float) obj2).floatValue();
                            switch (i19) {
                                case 0:
                                    v vVar5 = vVar2;
                                    float f23 = vVar5.f38358a - fFloatValue;
                                    vVar5.f38358a = f23;
                                    cVar4.invoke(Float.valueOf(f23));
                                    break;
                                default:
                                    v vVar6 = vVar2;
                                    float f24 = vVar6.f38358a - fFloatValue;
                                    vVar6.f38358a = f24;
                                    cVar4.invoke(Float.valueOf(f24));
                                    break;
                            }
                            return b0.f48488a;
                        }
                    };
                    this.f5224d = vVar2;
                    this.f5222b = 1;
                    objB = g0.g.b(gVar, n1Var, f22, this.f5223c, r9, this);
                    if (objB != aVar4) {
                    }
                    return aVar4;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                kotlin.jvm.internal.v vVar5 = (kotlin.jvm.internal.v) this.f5224d;
                com.bumptech.glide.e.F(obj);
                vVar2 = vVar5;
                f12 = 0.0f;
                objB = obj;
                b0.n nVar2 = (b0.n) objB;
                float fFloatValue = ((Number) nVar2.b()).floatValue();
                o0.t tVar2 = (o0.t) uVar.f44891b;
                g0.l lVar2 = tVar2.l().f44412n;
                List list = tVar2.l().f44400a;
                int size = list.size();
                int i19 = 0;
                float f23 = Float.NEGATIVE_INFINITY;
                float f24 = Float.POSITIVE_INFINITY;
                while (i19 < size) {
                    o0.e eVar = (o0.e) list.get(i19);
                    android.support.v4.media.session.a.t(tVar2.l());
                    float f25 = f12;
                    int i21 = tVar2.l().f44405f;
                    int i22 = tVar2.l().f44403d;
                    int i23 = tVar2.l().f44401b;
                    int i24 = eVar.f44371j;
                    tVar2.m();
                    lVar2.getClass();
                    float f26 = i24 - 0;
                    if (f26 <= f25 && f26 > f23) {
                        f23 = f26;
                    }
                    if (f26 >= f25 && f26 < f24) {
                        f24 = f26;
                    }
                    i19++;
                    f12 = f25;
                }
                float f27 = f12;
                if (f23 == Float.NEGATIVE_INFINITY) {
                    f23 = f24;
                }
                if (f24 == Float.POSITIVE_INFINITY) {
                    f24 = f23;
                }
                if (!tVar2.d()) {
                    if (ub.a.X(tVar2, fFloatValue)) {
                        f23 = f27;
                        f24 = f23;
                    } else {
                        f24 = f27;
                    }
                }
                if (tVar2.c()) {
                    f13 = f23;
                    f14 = f24;
                } else if (ub.a.X(tVar2, fFloatValue)) {
                    f14 = f24;
                    f13 = f27;
                } else {
                    f13 = f27;
                    f14 = f13;
                }
                float fFloatValue2 = ((Number) ((at.p) uVar.f44892c).invoke(Float.valueOf(fFloatValue), Float.valueOf(f13), Float.valueOf(f14))).floatValue();
                if (fFloatValue2 != f13 && fFloatValue2 != f14 && fFloatValue2 != f27) {
                    i0.a.c("Final Snapping Offset Should Be one of " + f13 + ", " + f14 + " or 0.0");
                }
                if (fFloatValue2 == Float.POSITIVE_INFINITY || fFloatValue2 == Float.NEGATIVE_INFINITY) {
                    fFloatValue2 = f27;
                }
                if (Float.isNaN(fFloatValue2)) {
                    i0.a.c("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                vVar2.f38358a = fFloatValue2;
                f0.n1 n1Var2 = (f0.n1) this.f5227t;
                b0.n nVarL = b0.e.l(nVar2, f27, f27, 30);
                b0.i1 i1Var = gVar.f28336c;
                final int i25 = 1;
                fz.c cVar5 = new fz.c() { // from class: g0.d
                    @Override // fz.c
                    public final Object invoke(Object obj2) {
                        int i110 = i25;
                        float fFloatValue3 = ((Float) obj2).floatValue();
                        switch (i110) {
                            case 0:
                                v vVar6 = vVar2;
                                float f28 = vVar6.f38358a - fFloatValue3;
                                vVar6.f38358a = f28;
                                cVar4.invoke(Float.valueOf(f28));
                                break;
                            default:
                                v vVar7 = vVar2;
                                float f29 = vVar7.f38358a - fFloatValue3;
                                vVar7.f38358a = f29;
                                cVar4.invoke(Float.valueOf(f29));
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                this.f5224d = null;
                this.f5222b = 2;
                Object objB2 = g0.k.b(n1Var2, fFloatValue2, fFloatValue2, nVarL, i1Var, cVar5, this);
                if (objB2 != aVar4) {
                    return objB2;
                }
                return aVar4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(i8 i8Var, p0.c cVar, float f5, l1.a1 a1Var, vy.d dVar) {
        super(2, dVar);
        this.f5225e = i8Var;
        this.f5226f = cVar;
        this.f5223c = f5;
        this.f5227t = a1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(g0.g gVar, float f5, fz.c cVar, f0.n1 n1Var, vy.d dVar) {
        super(2, dVar);
        this.f5225e = gVar;
        this.f5223c = f5;
        this.f5226f = cVar;
        this.f5227t = n1Var;
    }
}
