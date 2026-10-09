package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q2 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5871a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f5874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1.r f5875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5876f;

    public /* synthetic */ q2(String str, int i11, boolean z11, boolean z12, z1.r rVar, int i12) {
        this.f5876f = str;
        this.f5872b = i11;
        this.f5873c = z11;
        this.f5874d = z12;
        this.f5875e = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5871a) {
            case 0:
                ((Integer) obj2).getClass();
                d3.f(this.f5873c, this.f5874d, (fz.a) this.f5876f, this.f5875e, (l1.n) obj, l1.t.M(this.f5872b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                mt.y3.z((String) this.f5876f, this.f5872b, this.f5873c, this.f5874d, this.f5875e, (l1.n) obj, iM);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ q2(boolean z11, boolean z12, fz.a aVar, z1.r rVar, int i11) {
        this.f5873c = z11;
        this.f5874d = z12;
        this.f5876f = aVar;
        this.f5875e = rVar;
        this.f5872b = i11;
    }
}
