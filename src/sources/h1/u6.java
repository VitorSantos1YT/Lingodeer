package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u6 extends kotlin.jvm.internal.n implements fz.c {
    public final /* synthetic */ w2.g1 H;
    public final /* synthetic */ w2.g1 K;
    public final /* synthetic */ w2.g1 L;
    public final /* synthetic */ w2.g1 M;
    public final /* synthetic */ v6 N;
    public final /* synthetic */ w2.s0 O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f31149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f31150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f31151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f31152f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f31153t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(int i11, int i12, w2.g1 g1Var, w2.g1 g1Var2, w2.g1 g1Var3, w2.g1 g1Var4, w2.g1 g1Var5, w2.g1 g1Var6, w2.g1 g1Var7, w2.g1 g1Var8, w2.g1 g1Var9, v6 v6Var, w2.s0 s0Var) {
        super(1);
        this.f31147a = i11;
        this.f31148b = i12;
        this.f31149c = g1Var;
        this.f31150d = g1Var2;
        this.f31151e = g1Var3;
        this.f31152f = g1Var4;
        this.f31153t = g1Var5;
        this.H = g1Var6;
        this.K = g1Var7;
        this.L = g1Var8;
        this.M = g1Var9;
        this.N = v6Var;
        this.O = s0Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int iRound;
        float f5;
        w2.f1 f1Var = (w2.f1) obj;
        v6 v6Var = this.N;
        float f11 = v6Var.f31194c;
        boolean z11 = v6Var.f31193b;
        w2.s0 s0Var = this.O;
        float density = s0Var.getDensity();
        v3.m layoutDirection = s0Var.getLayoutDirection();
        j0.t1 t1Var = v6Var.f31195d;
        float f12 = t6.f31108a;
        w2.f1.i(f1Var, this.L, 0L);
        float f13 = i1.d1.f33993b;
        w2.g1 g1Var = this.M;
        int i11 = this.f31147a - (g1Var != null ? g1Var.f54502b : 0);
        int iQ = hz.b.Q(t1Var.c() * density);
        int iQ2 = hz.b.Q(j0.c.l(t1Var, layoutDirection) * density);
        float f14 = i1.d1.f33994c * density;
        w2.g1 g1Var2 = this.f31149c;
        float f15 = 2.0f;
        if (g1Var2 != null) {
            w2.f1.k(f1Var, g1Var2, 0, Math.round((1 + CropImageView.DEFAULT_ASPECT_RATIO) * ((i11 - g1Var2.f54502b) / 2.0f)));
        }
        w2.g1 g1Var3 = this.H;
        if (g1Var3 != null) {
            if (z11) {
                iRound = Math.round((1 + CropImageView.DEFAULT_ASPECT_RATIO) * ((i11 - g1Var3.f54502b) / 2.0f));
            } else {
                iRound = iQ;
            }
            int iB = android.support.v4.media.session.a.B(iRound, f11, -(g1Var3.f54502b / 2));
            if (g1Var2 == null) {
                f5 = 0.0f;
            } else {
                f5 = (1 - f11) * (g1Var2.f54501a - f14);
            }
            w2.f1.k(f1Var, g1Var3, hz.b.Q(f5) + iQ2, iB);
        } else {
            f15 = 2.0f;
        }
        w2.g1 g1Var4 = this.f31151e;
        if (g1Var4 != null) {
            w2.f1.k(f1Var, g1Var4, g1Var2 != null ? g1Var2.f54501a : 0, t6.f(z11, i11, iQ, g1Var3, g1Var4));
        }
        int i12 = (g1Var2 != null ? g1Var2.f54501a : 0) + (g1Var4 != null ? g1Var4.f54501a : 0);
        w2.g1 g1Var5 = this.f31153t;
        w2.f1.k(f1Var, g1Var5, i12, t6.f(z11, i11, iQ, g1Var3, g1Var5));
        w2.g1 g1Var6 = this.K;
        if (g1Var6 != null) {
            w2.f1.k(f1Var, g1Var6, i12, t6.f(z11, i11, iQ, g1Var3, g1Var6));
        }
        int i13 = this.f31148b;
        w2.g1 g1Var7 = this.f31150d;
        w2.g1 g1Var8 = this.f31152f;
        if (g1Var8 != null) {
            w2.f1.k(f1Var, g1Var8, (i13 - (g1Var7 != null ? g1Var7.f54501a : 0)) - g1Var8.f54501a, t6.f(z11, i11, iQ, g1Var3, g1Var8));
        }
        if (g1Var7 != null) {
            w2.f1.k(f1Var, g1Var7, i13 - g1Var7.f54501a, Math.round((1 + CropImageView.DEFAULT_ASPECT_RATIO) * ((i11 - g1Var7.f54502b) / f15)));
        }
        if (g1Var != null) {
            w2.f1.k(f1Var, g1Var, 0, i11);
        }
        return qy.b0.f48488a;
    }
}
