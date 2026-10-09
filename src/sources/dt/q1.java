package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q1 implements fz.a {
    public final /* synthetic */ float H;
    public final /* synthetic */ l1.b1 K;
    public final /* synthetic */ l1.b1 L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24108a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f24111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f24112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f24113f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f24114t;

    public /* synthetic */ q1(l1.b1 b1Var, float f5, float f11, float f12, float f13, float f14, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4) {
        this.f24109b = b1Var;
        this.f24111d = f5;
        this.f24112e = f11;
        this.f24113f = f12;
        this.f24114t = f13;
        this.H = f14;
        this.f24110c = b1Var2;
        this.K = b1Var3;
        this.L = b1Var4;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f24108a) {
            case 0:
                l1.b1 b1Var = this.f24109b;
                long jV = e.v(this.f24111d, this.f24112e, this.f24113f, this.f24114t, this.H, this.f24110c, ((f2.b) b1Var.getValue()).f26570a);
                e.x(jV, this.K);
                e.y(jV, b1Var);
                this.L.setValue(Boolean.TRUE);
                break;
            default:
                this.f24109b.setValue(Boolean.FALSE);
                l1.b1 b1Var2 = this.f24110c;
                long jV2 = e.v(this.f24111d, this.f24112e, this.f24113f, this.f24114t, this.H, this.K, e.w(b1Var2));
                e.x(jV2, b1Var2);
                e.y(jV2, this.L);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ q1(l1.b1 b1Var, l1.b1 b1Var2, float f5, float f11, float f12, float f13, float f14, l1.b1 b1Var3, l1.b1 b1Var4) {
        this.f24109b = b1Var;
        this.f24110c = b1Var2;
        this.f24111d = f5;
        this.f24112e = f11;
        this.f24113f = f12;
        this.f24114t = f13;
        this.H = f14;
        this.K = b1Var3;
        this.L = b1Var4;
    }
}
