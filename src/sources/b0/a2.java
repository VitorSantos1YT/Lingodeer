package b0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3426a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(float f5, f1 f1Var, j9.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f3428c = f5;
        this.f3429d = f1Var;
        this.f3430e = eVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f3426a) {
            case 0:
                a2 a2Var = new a2((c2) this.f3430e, dVar);
                a2Var.f3429d = obj;
                return a2Var;
            case 1:
                return new a2((g1.k) this.f3429d, this.f3428c, (m) this.f3430e, dVar);
            default:
                return new a2(this.f3428c, (f1) this.f3429d, (j9.e) this.f3430e, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f3426a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((a2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        final float fN;
        rz.b0 b0Var;
        Object objA;
        switch (this.f3426a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f3427b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    rz.b0 b0Var2 = (rz.b0) this.f3429d;
                    fN = e.n(b0Var2.getCoroutineContext());
                    b0Var = b0Var2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fN = this.f3428c;
                    b0Var = (rz.b0) this.f3429d;
                    com.bumptech.glide.e.F(obj);
                }
                while (rz.e0.w(b0Var)) {
                    final c2 c2Var = (c2) this.f3430e;
                    fz.c cVar = new fz.c() { // from class: b0.z1
                        @Override // fz.c
                        public final Object invoke(Object obj2) {
                            long jLongValue = ((Long) obj2).longValue();
                            c2 c2Var2 = c2Var;
                            boolean zG = c2Var2.g();
                            l1.i1 i1Var = c2Var2.f3464g;
                            if (!zG) {
                                if (i1Var.l() == Long.MIN_VALUE) {
                                    i1Var.n(jLongValue);
                                    ((l1.k1) c2Var2.f3458a.f3561b).setValue(Boolean.TRUE);
                                }
                                long jL = jLongValue - i1Var.l();
                                float f5 = fN;
                                if (f5 != CropImageView.DEFAULT_ASPECT_RATIO) {
                                    jL = hz.b.R(jL / ((double) f5));
                                }
                                c2Var2.n(jL);
                                c2Var2.h(jL, f5 == CropImageView.DEFAULT_ASPECT_RATIO);
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    this.f3429d = b0Var;
                    this.f3428c = fN;
                    this.f3427b = 1;
                    if (l1.t.x(getContext()).p(cVar, this) == aVar) {
                        return aVar;
                    }
                }
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f3427b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    d dVar = (d) ((g1.k) this.f3429d).f28530c;
                    Float f5 = new Float(this.f3428c);
                    m mVar = (m) this.f3430e;
                    this.f3427b = 1;
                    if (d.c(dVar, f5, mVar, null, this, 12) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                f1 f1Var = (f1) this.f3429d;
                float f11 = this.f3428c;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f3427b;
                qy.b0 b0Var3 = qy.b0.f48488a;
                if (i13 != 0) {
                    if (i13 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return b0Var3;
                }
                com.bumptech.glide.e.F(obj);
                if (f11 > CropImageView.DEFAULT_ASPECT_RATIO) {
                    this.f3427b = 1;
                    if (f1Var.z0(f11, f1Var.f3527c.getValue(), this) == aVar3) {
                        return aVar3;
                    }
                }
                if (f11 == CropImageView.DEFAULT_ASPECT_RATIO) {
                    j9.e eVar = (j9.e) this.f3430e;
                    this.f3427b = 2;
                    c2 c2Var2 = f1Var.f3530f;
                    if (c2Var2 == null || ((kotlin.jvm.internal.m.a(f1Var.f3528d.getValue(), eVar) && kotlin.jvm.internal.m.a(f1Var.f3527c.getValue(), eVar)) || (objA = s0.a(f1Var.N, new y0(f1Var, eVar, c2Var2, (vy.d) null), this)) != aVar3)) {
                        objA = b0Var3;
                    }
                    if (objA == aVar3) {
                        return aVar3;
                    }
                }
                return b0Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(c2 c2Var, vy.d dVar) {
        super(2, dVar);
        this.f3430e = c2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(g1.k kVar, float f5, m mVar, vy.d dVar) {
        super(2, dVar);
        this.f3429d = kVar;
        this.f3428c = f5;
        this.f3430e = mVar;
    }
}
