package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ float H;
    public final /* synthetic */ float K;
    public final /* synthetic */ t1.d L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30758a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f30759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0.p0 f30760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f30761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0.d2 f30762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.w0 f30763f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f30764t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z1.r rVar, b0.p0 p0Var, l1.b1 b1Var, d0.d2 d2Var, g2.w0 w0Var, long j11, float f5, float f11, t1.d dVar) {
        super(2);
        this.f30759b = rVar;
        this.f30760c = p0Var;
        this.f30761d = b1Var;
        this.f30762e = d2Var;
        this.f30763f = w0Var;
        this.f30764t = j11;
        this.H = f5;
        this.K = f11;
        this.L = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30758a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar = (l1.s) nVar;
                    if (sVar.F()) {
                        sVar.W();
                    } else {
                        b5.a(this.f30759b, this.f30760c, this.f30761d, this.f30762e, this.f30763f, this.f30764t, this.H, this.K, this.L, nVar, 384);
                    }
                } else {
                    b5.a(this.f30759b, this.f30760c, this.f30761d, this.f30762e, this.f30763f, this.f30764t, this.H, this.K, this.L, nVar, 384);
                }
                break;
            default:
                ((Number) obj2).intValue();
                int iM = l1.t.M(385);
                b5.a(this.f30759b, this.f30760c, this.f30761d, this.f30762e, this.f30763f, this.f30764t, this.H, this.K, this.L, (l1.n) obj, iM);
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z1.r rVar, b0.p0 p0Var, l1.b1 b1Var, d0.d2 d2Var, g2.w0 w0Var, long j11, float f5, float f11, t1.d dVar, int i11) {
        super(2);
        this.f30759b = rVar;
        this.f30760c = p0Var;
        this.f30761d = b1Var;
        this.f30762e = d2Var;
        this.f30763f = w0Var;
        this.f30764t = j11;
        this.H = f5;
        this.K = f11;
        this.L = dVar;
    }
}
