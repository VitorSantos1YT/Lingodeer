package b0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends h2 {
    public static final o U = new o(CropImageView.DEFAULT_ASPECT_RATIO);
    public static final o V = new o(1.0f);
    public final av.d H;
    public final l1.g1 K;
    public rz.m L;
    public final a00.e M;
    public final s0 N;
    public long O;
    public final y.e0 P;
    public w0 Q;
    public final v0 R;
    public float S;
    public final v0 T;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.k1 f3527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.k1 f3528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c2 f3530f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f3531t;

    /* JADX WARN: Type inference failed for: r3v6, types: [b0.v0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [b0.v0] */
    public f1(j9.e eVar) {
        super(0);
        this.f3527c = l1.t.B(eVar);
        this.f3528d = l1.t.B(eVar);
        this.f3529e = eVar;
        this.H = new av.d(this, 3);
        this.K = new l1.g1(CropImageView.DEFAULT_ASPECT_RATIO);
        this.M = new a00.e();
        this.N = new s0();
        this.O = Long.MIN_VALUE;
        this.P = new y.e0();
        final int i11 = 0;
        this.R = new fz.c(this) { // from class: b0.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f3711b;

            {
                this.f3711b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                Long l9 = (Long) obj;
                switch (i11) {
                    case 0:
                        this.f3711b.O = l9.longValue();
                        break;
                    default:
                        long jLongValue = l9.longValue();
                        f1 f1Var = this.f3711b;
                        long j11 = jLongValue - f1Var.O;
                        f1Var.O = jLongValue;
                        long jR = hz.b.R(j11 / ((double) f1Var.S));
                        y.e0 e0Var = f1Var.P;
                        if (e0Var.i()) {
                            Object[] objArr = e0Var.f56686a;
                            int i12 = e0Var.f56687b;
                            int i13 = 0;
                            for (int i14 = 0; i14 < i12; i14++) {
                                w0 w0Var = (w0) objArr[i14];
                                f1.y0(w0Var, jR);
                                w0Var.f3725c = true;
                            }
                            c2 c2Var = f1Var.f3530f;
                            if (c2Var != null) {
                                c2Var.o();
                            }
                            int i15 = e0Var.f56687b;
                            Object[] objArr2 = e0Var.f56686a;
                            lz.g gVarU = hz.b.U(0, i15);
                            int i16 = gVarU.f40532a;
                            int i17 = gVarU.f40533b;
                            if (i16 <= i17) {
                                while (true) {
                                    objArr2[i16 - i13] = objArr2[i16];
                                    if (((w0) objArr2[i16]).f3725c) {
                                        i13++;
                                    }
                                    if (i16 != i17) {
                                        i16++;
                                    }
                                }
                            }
                            ry.l.P(i15 - i13, i15, null, objArr2);
                            e0Var.f56687b -= i13;
                        }
                        w0 w0Var2 = f1Var.Q;
                        if (w0Var2 != null) {
                            w0Var2.f3729g = f1Var.f3531t;
                            f1.y0(w0Var2, jR);
                            f1Var.B0(w0Var2.f3726d);
                            if (w0Var2.f3726d == 1.0f) {
                                f1Var.Q = null;
                            }
                            f1Var.A0();
                        }
                        break;
                }
                return qy.b0.f48488a;
            }
        };
        final int i12 = 1;
        this.T = new fz.c(this) { // from class: b0.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f3711b;

            {
                this.f3711b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                Long l9 = (Long) obj;
                switch (i12) {
                    case 0:
                        this.f3711b.O = l9.longValue();
                        break;
                    default:
                        long jLongValue = l9.longValue();
                        f1 f1Var = this.f3711b;
                        long j11 = jLongValue - f1Var.O;
                        f1Var.O = jLongValue;
                        long jR = hz.b.R(j11 / ((double) f1Var.S));
                        y.e0 e0Var = f1Var.P;
                        if (e0Var.i()) {
                            Object[] objArr = e0Var.f56686a;
                            int i13 = e0Var.f56687b;
                            int i14 = 0;
                            for (int i15 = 0; i15 < i13; i15++) {
                                w0 w0Var = (w0) objArr[i15];
                                f1.y0(w0Var, jR);
                                w0Var.f3725c = true;
                            }
                            c2 c2Var = f1Var.f3530f;
                            if (c2Var != null) {
                                c2Var.o();
                            }
                            int i16 = e0Var.f56687b;
                            Object[] objArr2 = e0Var.f56686a;
                            lz.g gVarU = hz.b.U(0, i16);
                            int i17 = gVarU.f40532a;
                            int i18 = gVarU.f40533b;
                            if (i17 <= i18) {
                                while (true) {
                                    objArr2[i17 - i14] = objArr2[i17];
                                    if (((w0) objArr2[i17]).f3725c) {
                                        i14++;
                                    }
                                    if (i17 != i18) {
                                        i17++;
                                    }
                                }
                            }
                            ry.l.P(i16 - i14, i16, null, objArr2);
                            e0Var.f56687b -= i14;
                        }
                        w0 w0Var2 = f1Var.Q;
                        if (w0Var2 != null) {
                            w0Var2.f3729g = f1Var.f3531t;
                            f1.y0(w0Var2, jR);
                            f1Var.B0(w0Var2.f3726d);
                            if (w0Var2.f3726d == 1.0f) {
                                f1Var.Q = null;
                            }
                            f1Var.A0();
                        }
                        break;
                }
                return qy.b0.f48488a;
            }
        };
    }

    public static final void s0(f1 f1Var) {
        c2 c2Var = f1Var.f3530f;
        l1.g1 g1Var = f1Var.K;
        if (c2Var == null) {
            return;
        }
        w0 w0Var = f1Var.Q;
        if (w0Var == null) {
            if (f1Var.f3531t <= 0 || g1Var.l() == 1.0f || kotlin.jvm.internal.m.a(f1Var.f3528d.getValue(), f1Var.f3527c.getValue())) {
                w0Var = null;
            } else {
                w0Var = new w0();
                w0Var.f3726d = g1Var.l();
                long j11 = f1Var.f3531t;
                w0Var.f3729g = j11;
                w0Var.f3730h = hz.b.R((1.0d - ((double) g1Var.l())) * j11);
                w0Var.f3727e.e(0, g1Var.l());
            }
        }
        if (w0Var != null) {
            w0Var.f3729g = f1Var.f3531t;
            f1Var.P.a(w0Var);
            c2Var.m(w0Var);
        }
        f1Var.Q = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object t0(f1 f1Var, xy.c cVar) {
        z0 z0Var;
        y.e0 e0Var = f1Var.P;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i11 = z0Var.f3755c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                z0Var.f3755c = i11 - Integer.MIN_VALUE;
            } else {
                z0Var = new z0(f1Var, cVar);
            }
        } else {
            z0Var = new z0(f1Var, cVar);
        }
        Object obj = z0Var.f3753a;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = z0Var.f3755c;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            if (e0Var.h() && f1Var.Q == null) {
                return b0Var;
            }
            if (e.n(z0Var.getContext()) == CropImageView.DEFAULT_ASPECT_RATIO) {
                f1Var.x0();
                f1Var.O = Long.MIN_VALUE;
                return b0Var;
            }
            if (f1Var.O == Long.MIN_VALUE) {
                v0 v0Var = f1Var.R;
                z0Var.f3755c = 1;
                if (l1.t.x(z0Var.getContext()).p(v0Var, z0Var) != obj2) {
                }
            }
            return obj2;
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.e.F(obj);
        do {
            if (!e0Var.i() && f1Var.Q == null) {
                f1Var.O = Long.MIN_VALUE;
                return b0Var;
            }
            z0Var.f3755c = 2;
        } while (f1Var.w0(z0Var) != obj2);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object u0(f1 f1Var, xy.c cVar) {
        d1 d1Var;
        Object value;
        Object obj;
        a00.e eVar = f1Var.M;
        if (cVar instanceof d1) {
            d1Var = (d1) cVar;
            int i11 = d1Var.f3484d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                d1Var.f3484d = i11 - Integer.MIN_VALUE;
            } else {
                d1Var = new d1(f1Var, cVar);
            }
        } else {
            d1Var = new d1(f1Var, cVar);
        }
        Object obj2 = d1Var.f3482b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = d1Var.f3484d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj2);
            value = f1Var.f3527c.getValue();
            d1Var.f3481a = value;
            d1Var.f3484d = 1;
            if (eVar.b(d1Var) != aVar) {
            }
            return aVar;
        }
        if (i12 == 1) {
            Object obj3 = d1Var.f3481a;
            com.bumptech.glide.e.F(obj2);
            value = obj3;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = d1Var.f3481a;
            com.bumptech.glide.e.F(obj2);
        }
        if (kotlin.jvm.internal.m.a(obj2, obj)) {
            return qy.b0.f48488a;
        }
        f1Var.O = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        d1Var.f3481a = value;
        d1Var.f3484d = 2;
        rz.m mVar = new rz.m(1, ue.f.x(d1Var));
        mVar.s();
        f1Var.L = mVar;
        eVar.a(null);
        Object objR = mVar.r();
        if (objR != aVar) {
            obj = value;
            obj2 = objR;
            if (kotlin.jvm.internal.m.a(obj2, obj)) {
                return qy.b0.f48488a;
            }
            f1Var.O = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0086, please report this as an issue */
    public static final Object v0(f1 f1Var, xy.c cVar) {
        e1 e1Var;
        Object value;
        Object obj;
        a00.e eVar = f1Var.M;
        if (cVar instanceof e1) {
            e1Var = (e1) cVar;
            int i11 = e1Var.f3509d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                e1Var.f3509d = i11 - Integer.MIN_VALUE;
            } else {
                e1Var = new e1(f1Var, cVar);
            }
        } else {
            e1Var = new e1(f1Var, cVar);
        }
        Object obj2 = e1Var.f3507b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = e1Var.f3509d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj2);
            value = f1Var.f3527c.getValue();
            e1Var.f3506a = value;
            e1Var.f3509d = 1;
            if (eVar.b(e1Var) != aVar) {
            }
            return aVar;
        }
        if (i12 == 1) {
            Object obj3 = e1Var.f3506a;
            com.bumptech.glide.e.F(obj2);
            value = obj3;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = e1Var.f3506a;
            com.bumptech.glide.e.F(obj2);
        }
        if (!kotlin.jvm.internal.m.a(obj2, obj)) {
            f1Var.O = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return qy.b0.f48488a;
        if (!kotlin.jvm.internal.m.a(value, f1Var.f3529e)) {
            e1Var.f3506a = value;
            e1Var.f3509d = 2;
            rz.m mVar = new rz.m(1, ue.f.x(e1Var));
            mVar.s();
            f1Var.L = mVar;
            eVar.a(null);
            Object objR = mVar.r();
            if (objR != aVar) {
                obj = value;
                obj2 = objR;
                if (!kotlin.jvm.internal.m.a(obj2, obj)) {
                    f1Var.O = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return aVar;
        }
        eVar.a(null);
        return qy.b0.f48488a;
    }

    public static void y0(w0 w0Var, long j11) {
        long j12 = w0Var.f3723a;
        o oVar = w0Var.f3727e;
        long j13 = j12 + j11;
        w0Var.f3723a = j13;
        long j14 = w0Var.f3730h;
        if (j13 >= j14) {
            w0Var.f3726d = 1.0f;
            return;
        }
        o2 o2Var = w0Var.f3724b;
        if (o2Var == null) {
            float f5 = j13 / j14;
            w0Var.f3726d = (f5 * 1.0f) + ((1 - f5) * oVar.a(0));
            return;
        }
        o oVar2 = w0Var.f3728f;
        if (oVar2 == null) {
            oVar2 = U;
        }
        w0Var.f3726d = hz.b.k(((o) o2Var.i(j13, oVar, V, oVar2)).a(0), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
    }

    public final void A0() {
        c2 c2Var = this.f3530f;
        if (c2Var == null) {
            return;
        }
        c2Var.l(hz.b.R(((double) this.K.l()) * ((Number) c2Var.f3469l.getValue()).longValue()));
    }

    public final void B0(float f5) {
        this.K.m(f5);
    }

    @Override // b0.h2
    public final Object Y() {
        return this.f3528d.getValue();
    }

    @Override // b0.h2
    public final Object a0() {
        return this.f3527c.getValue();
    }

    @Override // b0.h2
    public final void o0(Object obj) {
        this.f3528d.setValue(obj);
    }

    @Override // b0.h2
    public final void p0(c2 c2Var) {
        c2 c2Var2 = this.f3530f;
        if (c2Var2 != null && !c2Var.equals(c2Var2)) {
            t0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f3530f + ", new instance: " + c2Var);
        }
        this.f3530f = c2Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qy.h] */
    @Override // b0.h2
    public final void q0() {
        this.f3530f = null;
        ((x1.u) g2.f3546b.getValue()).b(this);
    }

    public final Object w0(xy.c cVar) {
        float fN = e.n(cVar.getContext());
        qy.b0 b0Var = qy.b0.f48488a;
        if (fN <= CropImageView.DEFAULT_ASPECT_RATIO) {
            x0();
            return b0Var;
        }
        this.S = fN;
        Object objP = l1.t.x(cVar.getContext()).p(this.T, cVar);
        return objP == wy.a.COROUTINE_SUSPENDED ? objP : b0Var;
    }

    public final void x0() {
        c2 c2Var = this.f3530f;
        if (c2Var != null) {
            c2Var.c();
        }
        this.P.d();
        if (this.Q != null) {
            this.Q = null;
            B0(1.0f);
            A0();
        }
    }

    public final Object z0(float f5, Object obj, xy.i iVar) {
        if (CropImageView.DEFAULT_ASPECT_RATIO > f5 || f5 > 1.0f) {
            t0.a("Expecting fraction between 0 and 1. Got " + f5);
        }
        c2 c2Var = this.f3530f;
        if (c2Var != null) {
            Object objA = s0.a(this.N, new c1(obj, this.f3527c.getValue(), this, c2Var, f5, null), iVar);
            if (objA == wy.a.COROUTINE_SUSPENDED) {
                return objA;
            }
        }
        return qy.b0.f48488a;
    }
}
