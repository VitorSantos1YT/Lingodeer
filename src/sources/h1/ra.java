package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ra extends kotlin.jvm.internal.n implements fz.c {
    public final /* synthetic */ w2.g1 H;
    public final /* synthetic */ w2.g1 K;
    public final /* synthetic */ w2.g1 L;
    public final /* synthetic */ w2.g1 M;
    public final /* synthetic */ sa N;
    public final /* synthetic */ int O;
    public final /* synthetic */ w2.s0 P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f31002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f31005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f31006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f31007f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f31008t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(w2.g1 g1Var, int i11, int i12, w2.g1 g1Var2, w2.g1 g1Var3, w2.g1 g1Var4, w2.g1 g1Var5, w2.g1 g1Var6, w2.g1 g1Var7, w2.g1 g1Var8, w2.g1 g1Var9, sa saVar, int i13, w2.s0 s0Var) {
        super(1);
        this.f31002a = g1Var;
        this.f31003b = i11;
        this.f31004c = i12;
        this.f31005d = g1Var2;
        this.f31006e = g1Var3;
        this.f31007f = g1Var4;
        this.f31008t = g1Var5;
        this.H = g1Var6;
        this.K = g1Var7;
        this.L = g1Var8;
        this.M = g1Var9;
        this.N = saVar;
        this.O = i13;
        this.P = s0Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        boolean z11;
        int iQ;
        w2.f1 f1Var = (w2.f1) obj;
        sa saVar = this.N;
        boolean z12 = saVar.f31073a;
        w2.g1 g1Var = this.L;
        w2.g1 g1Var2 = this.f31005d;
        w2.s0 s0Var = this.P;
        w2.g1 g1Var3 = this.M;
        w2.g1 g1Var4 = this.K;
        w2.g1 g1Var5 = this.H;
        w2.g1 g1Var6 = this.f31008t;
        w2.g1 g1Var7 = this.f31007f;
        w2.g1 g1Var8 = this.f31006e;
        int i11 = this.f31004c;
        int i12 = this.f31003b;
        w2.g1 g1Var9 = this.f31002a;
        if (g1Var9 != null) {
            int i13 = g1Var9.f54502b;
            int i14 = this.O;
            int i15 = i14 + i13;
            float f5 = saVar.f31074b;
            float density = s0Var.getDensity();
            int i16 = qa.f30936a;
            w2.f1.i(f1Var, g1Var, 0L);
            float f11 = i1.d1.f33993b;
            int i17 = i11 - (g1Var3 != null ? g1Var3.f54502b : 0);
            if (g1Var7 != null) {
                w2.f1.k(f1Var, g1Var7, 0, Math.round((1 + CropImageView.DEFAULT_ASPECT_RATIO) * ((i17 - g1Var7.f54502b) / 2.0f)));
            }
            if (z12) {
                iQ = Math.round((1 + CropImageView.DEFAULT_ASPECT_RATIO) * ((i17 - g1Var9.f54502b) / 2.0f));
            } else {
                iQ = hz.b.Q(i1.d1.f33993b * density);
            }
            w2.f1.k(f1Var, g1Var9, g1Var7 != null ? g1Var7.f54501a : 0, iQ - hz.b.Q((iQ - i14) * f5));
            if (g1Var5 != null) {
                w2.f1.k(f1Var, g1Var5, g1Var7 != null ? g1Var7.f54501a : 0, i15);
            }
            int i18 = (g1Var7 != null ? g1Var7.f54501a : 0) + (g1Var5 != null ? g1Var5.f54501a : 0);
            w2.f1.k(f1Var, g1Var2, i18, i15);
            if (g1Var8 != null) {
                w2.f1.k(f1Var, g1Var8, i18, i15);
            }
            if (g1Var4 != null) {
                w2.f1.k(f1Var, g1Var4, (i12 - (g1Var6 != null ? g1Var6.f54501a : 0)) - g1Var4.f54501a, i15);
            }
            if (g1Var6 != null) {
                w2.f1.k(f1Var, g1Var6, i12 - g1Var6.f54501a, Math.round((1 + CropImageView.DEFAULT_ASPECT_RATIO) * ((i17 - g1Var6.f54502b) / 2.0f)));
            }
            if (g1Var3 != null) {
                w2.f1.k(f1Var, g1Var3, 0, i17);
            }
        } else {
            float density2 = s0Var.getDensity();
            j0.t1 t1Var = saVar.f31075c;
            int i19 = qa.f30936a;
            w2.f1.i(f1Var, g1Var, 0L);
            float f12 = i1.d1.f33993b;
            int i21 = i11 - (g1Var3 != null ? g1Var3.f54502b : 0);
            int iQ2 = hz.b.Q(t1Var.c() * density2);
            if (g1Var7 != null) {
                w2.f1.k(f1Var, g1Var7, 0, Math.round((1 + CropImageView.DEFAULT_ASPECT_RATIO) * ((i21 - g1Var7.f54502b) / 2.0f)));
            }
            if (g1Var5 != null) {
                z11 = z12;
                w2.f1.k(f1Var, g1Var5, g1Var7 != null ? g1Var7.f54501a : 0, qa.d(z11, i21, iQ2, g1Var5));
            } else {
                z11 = z12;
            }
            int i22 = (g1Var7 != null ? g1Var7.f54501a : 0) + (g1Var5 != null ? g1Var5.f54501a : 0);
            w2.f1.k(f1Var, g1Var2, i22, qa.d(z11, i21, iQ2, g1Var2));
            if (g1Var8 != null) {
                w2.f1.k(f1Var, g1Var8, i22, qa.d(z11, i21, iQ2, g1Var8));
            }
            if (g1Var4 != null) {
                w2.f1.k(f1Var, g1Var4, (i12 - (g1Var6 != null ? g1Var6.f54501a : 0)) - g1Var4.f54501a, qa.d(z11, i21, iQ2, g1Var4));
            }
            if (g1Var6 != null) {
                w2.f1.k(f1Var, g1Var6, i12 - g1Var6.f54501a, Math.round((1 + CropImageView.DEFAULT_ASPECT_RATIO) * ((i21 - g1Var6.f54502b) / 2.0f)));
            }
            if (g1Var3 != null) {
                w2.f1.k(f1Var, g1Var3, 0, i21);
            }
        }
        return qy.b0.f48488a;
    }
}
