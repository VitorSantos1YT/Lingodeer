package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v4 implements fz.e {
    public final /* synthetic */ z1.r H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41991a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rt.t4 f41993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt.x4 f41994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f41995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f41996f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f41997t;

    public /* synthetic */ v4(int i11, rt.t4 t4Var, rt.x4 x4Var, long j11, long j12, boolean z11, z1.r rVar) {
        this.f41992b = i11;
        this.f41993c = t4Var;
        this.f41994d = x4Var;
        this.f41995e = j11;
        this.f41996f = j12;
        this.f41997t = z11;
        this.H = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41991a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l5.h(this.f41992b, this.f41993c, this.f41994d, this.f41995e, this.f41996f, this.f41997t, this.H, sVar, 1572864);
                } else {
                    sVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                l5.h(this.f41992b, this.f41993c, this.f41994d, this.f41995e, this.f41996f, this.f41997t, this.H, (l1.n) obj, l1.t.M(1572865));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ v4(int i11, rt.t4 t4Var, rt.x4 x4Var, long j11, long j12, boolean z11, z1.r rVar, int i12) {
        this.f41992b = i11;
        this.f41993c = t4Var;
        this.f41994d = x4Var;
        this.f41995e = j11;
        this.f41996f = j12;
        this.f41997t = z11;
        this.H = rVar;
    }
}
