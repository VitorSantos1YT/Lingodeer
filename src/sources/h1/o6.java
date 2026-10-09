package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o6 extends kotlin.jvm.internal.n implements fz.f {
    public final /* synthetic */ fz.e H;
    public final /* synthetic */ fz.e K;
    public final /* synthetic */ fz.e L;
    public final /* synthetic */ fz.e M;
    public final /* synthetic */ ha N;
    public final /* synthetic */ g2.w0 O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o3.w f30791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f30792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f30793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o3.f0 f30794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0.i f30795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f30796f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.e f30797t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(o3.w wVar, boolean z11, boolean z12, o3.f0 f0Var, h0.i iVar, boolean z13, fz.e eVar, fz.e eVar2, fz.e eVar3, fz.e eVar4, fz.e eVar5, ha haVar, g2.w0 w0Var) {
        super(3);
        this.f30791a = wVar;
        this.f30792b = z11;
        this.f30793c = z12;
        this.f30794d = f0Var;
        this.f30795e = iVar;
        this.f30796f = z13;
        this.f30797t = eVar;
        this.H = eVar2;
        this.K = eVar3;
        this.L = eVar4;
        this.M = eVar5;
        this.N = haVar;
        this.O = w0Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
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
                j6 j6Var = j6.f30479a;
                String str = this.f30791a.f44704a.f35700b;
                g2.w0 w0Var = this.O;
                boolean z11 = this.f30792b;
                boolean z12 = this.f30796f;
                h0.i iVar = this.f30795e;
                ha haVar = this.N;
                j6Var.b(str, eVar, z11, this.f30793c, this.f30794d, iVar, z12, this.f30797t, this.H, this.K, this.L, this.M, haVar, null, t1.e.d(255570733, new k6(z11, z12, iVar, haVar, w0Var, 1), nVar), nVar, (iIntValue << 3) & 112);
            }
        } else {
            j6 j6Var2 = j6.f30479a;
            String str2 = this.f30791a.f44704a.f35700b;
            g2.w0 w0Var2 = this.O;
            boolean z13 = this.f30792b;
            boolean z14 = this.f30796f;
            h0.i iVar2 = this.f30795e;
            ha haVar2 = this.N;
            j6Var2.b(str2, eVar, z13, this.f30793c, this.f30794d, iVar2, z14, this.f30797t, this.H, this.K, this.L, this.M, haVar2, null, t1.e.d(255570733, new k6(z13, z14, iVar2, haVar2, w0Var2, 1), nVar), nVar, (iIntValue << 3) & 112);
        }
        return qy.b0.f48488a;
    }
}
