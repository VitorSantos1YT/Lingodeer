package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h6 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ float H;
    public final /* synthetic */ float K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6 f30332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f30333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f30334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0.i f30335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1.r f30336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ha f30337f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g2.w0 f30338t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(j6 j6Var, boolean z11, boolean z12, h0.i iVar, z1.r rVar, ha haVar, g2.w0 w0Var, float f5, float f11, int i11, int i12) {
        super(2);
        this.f30332a = j6Var;
        this.f30333b = z11;
        this.f30334c = z12;
        this.f30335d = iVar;
        this.f30336e = rVar;
        this.f30337f = haVar;
        this.f30338t = w0Var;
        this.H = f5;
        this.K = f11;
        this.L = i11;
        this.M = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f30332a.a(this.f30333b, this.f30334c, this.f30335d, this.f30336e, this.f30337f, this.f30338t, this.H, this.K, (l1.n) obj, l1.t.M(this.L | 1), this.M);
        return qy.b0.f48488a;
    }
}
