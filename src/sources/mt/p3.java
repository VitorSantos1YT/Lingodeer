package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p3 implements fz.a {
    public final /* synthetic */ l1.b1 H;
    public final /* synthetic */ l1.b1 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.j f41758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41761f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41762t;

    public /* synthetic */ p3(int i11, fz.j jVar, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, l1.b1 b1Var5, l1.b1 b1Var6, l1.b1 b1Var7) {
        this.f41756a = i11;
        this.f41757b = b1Var;
        this.f41758c = jVar;
        this.f41759d = b1Var2;
        this.f41760e = b1Var3;
        this.f41761f = b1Var4;
        this.f41762t = b1Var5;
        this.H = b1Var6;
        this.K = b1Var7;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f41756a) {
            case 0:
                g.D(this.f41758c, this.f41757b, this.f41759d, this.f41760e, this.f41761f, this.f41762t, this.H, this.K, 0, 0, 0, 0, 0, false, 32512);
                break;
            case 1:
                l1.b1 b1Var = this.f41757b;
                int iIntValue = ((Number) b1Var.getValue()).intValue() - 10;
                b1Var.setValue(Integer.valueOf(iIntValue));
                g.D(this.f41758c, this.f41759d, this.f41760e, b1Var, this.f41761f, this.f41762t, this.H, this.K, 0, 0, iIntValue, 0, 0, false, 31488);
                break;
            default:
                l1.b1 b1Var2 = this.f41757b;
                int iIntValue2 = ((Number) b1Var2.getValue()).intValue() + 10;
                b1Var2.setValue(Integer.valueOf(iIntValue2));
                g.D(this.f41758c, this.f41759d, this.f41760e, b1Var2, this.f41761f, this.f41762t, this.H, this.K, 0, 0, iIntValue2, 0, 0, false, 31488);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ p3(fz.j jVar, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, l1.b1 b1Var5, l1.b1 b1Var6, l1.b1 b1Var7) {
        this.f41756a = 0;
        this.f41758c = jVar;
        this.f41757b = b1Var;
        this.f41759d = b1Var2;
        this.f41760e = b1Var3;
        this.f41761f = b1Var4;
        this.f41762t = b1Var5;
        this.H = b1Var6;
        this.K = b1Var7;
    }
}
