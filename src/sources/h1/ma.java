package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ma extends kotlin.jvm.internal.n implements fz.f {
    public final /* synthetic */ fz.e H;
    public final /* synthetic */ g2.w0 K;
    public final /* synthetic */ ha L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f30696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f30697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f30698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o3.f0 f30699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0.i f30700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f30701f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.e f30702t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(String str, boolean z11, boolean z12, o3.f0 f0Var, h0.i iVar, boolean z13, fz.e eVar, fz.e eVar2, g2.w0 w0Var, ha haVar) {
        super(3);
        this.f30696a = str;
        this.f30697b = z11;
        this.f30698c = z12;
        this.f30699d = f0Var;
        this.f30700e = iVar;
        this.f30701f = z13;
        this.f30702t = eVar;
        this.H = eVar2;
        this.K = w0Var;
        this.L = haVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fz.e eVar = (fz.e) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((l1.s) nVar).h(eVar) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18) {
            l1.s sVar = (l1.s) nVar;
            if (sVar.F()) {
                sVar.W();
            } else {
                la.f30616a.b(this.f30696a, eVar, this.f30697b, this.f30698c, this.f30699d, this.f30700e, this.f30701f, this.f30702t, this.H, this.K, this.L, null, null, nVar, (iIntValue << 3) & 112);
            }
        } else {
            la.f30616a.b(this.f30696a, eVar, this.f30697b, this.f30698c, this.f30699d, this.f30700e, this.f30701f, this.f30702t, this.H, this.K, this.L, null, null, nVar, (iIntValue << 3) & 112);
        }
        return qy.b0.f48488a;
    }
}
