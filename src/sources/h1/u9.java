package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u9 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f31160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f31161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2.s0 f31162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f31164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f31165f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Integer f31166t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(w2.g1 g1Var, w2.g1 g1Var2, w2.s0 s0Var, int i11, int i12, Integer num, Integer num2) {
        super(1);
        this.f31160a = g1Var;
        this.f31161b = g1Var2;
        this.f31162c = s0Var;
        this.f31163d = i11;
        this.f31164e = i12;
        this.f31165f = num;
        this.f31166t = num2;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        w2.f1 f1Var = (w2.f1) obj;
        w2.g1 g1Var = this.f31161b;
        int i11 = this.f31164e;
        w2.g1 g1Var2 = this.f31160a;
        if (g1Var2 != null && g1Var != null) {
            Integer num = this.f31165f;
            kotlin.jvm.internal.m.c(num);
            int iIntValue = num.intValue();
            Integer num2 = this.f31166t;
            kotlin.jvm.internal.m.c(num2);
            int iIntValue2 = num2.intValue();
            float f5 = iIntValue == iIntValue2 ? x9.f31319c : x9.f31320d;
            w2.s0 s0Var = this.f31162c;
            int iN0 = s0Var.n0(k1.y.f37829b) + s0Var.n0(f5);
            int iK0 = (s0Var.k0(x9.f31321e) + g1Var.f54502b) - iIntValue;
            int i12 = g1Var2.f54501a;
            int i13 = this.f31163d;
            int i14 = (i11 - iIntValue2) - iN0;
            w2.f1.k(f1Var, g1Var2, (i13 - i12) / 2, i14);
            w2.f1.k(f1Var, g1Var, (i13 - g1Var.f54501a) / 2, i14 - iK0);
        } else if (g1Var2 != null) {
            float f11 = x9.f31317a;
            w2.f1.k(f1Var, g1Var2, 0, (i11 - g1Var2.f54502b) / 2);
        } else if (g1Var != null) {
            float f12 = x9.f31317a;
            w2.f1.k(f1Var, g1Var, 0, (i11 - g1Var.f54502b) / 2);
        }
        return qy.b0.f48488a;
    }
}
