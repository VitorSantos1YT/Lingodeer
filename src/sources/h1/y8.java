package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y8 extends kotlin.jvm.internal.n implements fz.c {
    public final /* synthetic */ int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f31360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f31362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f31364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f31365f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f31366t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(w2.g1 g1Var, int i11, w2.g1 g1Var2, int i12, int i13, w2.g1 g1Var3, int i14, int i15) {
        super(1);
        this.f31360a = g1Var;
        this.f31361b = i11;
        this.f31362c = g1Var2;
        this.f31363d = i12;
        this.f31364e = i13;
        this.f31365f = g1Var3;
        this.f31366t = i14;
        this.H = i15;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        w2.f1 f1Var = (w2.f1) obj;
        w2.f1.k(f1Var, this.f31360a, 0, this.f31361b);
        w2.g1 g1Var = this.f31362c;
        if (g1Var != null) {
            w2.f1.k(f1Var, g1Var, this.f31363d, this.f31364e);
        }
        w2.g1 g1Var2 = this.f31365f;
        if (g1Var2 != null) {
            w2.f1.k(f1Var, g1Var2, this.f31366t, this.H);
        }
        return qy.b0.f48488a;
    }
}
