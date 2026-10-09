package d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22857a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f22859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f22860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f22861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22862f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f22863t;

    public /* synthetic */ b(l lVar, boolean z11, u3.j jVar, boolean z12, long j11, float f5, z1.r rVar, int i11) {
        this.f22863t = lVar;
        this.f22858b = z11;
        this.H = jVar;
        this.f22859c = z12;
        this.f22861e = j11;
        this.f22860d = f5;
        this.K = rVar;
        this.f22862f = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22857a) {
            case 0:
                ((Integer) obj2).getClass();
                qx.p.d((l) this.f22863t, this.f22858b, (u3.j) this.H, this.f22859c, this.f22861e, this.f22860d, (z1.r) this.K, (l1.n) obj, l1.t.M(this.f22862f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                yg.r.a((String) this.f22863t, (Boolean) this.H, (Boolean) this.K, this.f22858b, this.f22859c, this.f22860d, this.f22861e, (l1.n) obj, l1.t.M(this.f22862f | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ b(String str, Boolean bool, Boolean bool2, boolean z11, boolean z12, float f5, long j11, int i11) {
        this.f22863t = str;
        this.H = bool;
        this.K = bool2;
        this.f22858b = z11;
        this.f22859c = z12;
        this.f22860d = f5;
        this.f22861e = j11;
        this.f22862f = i11;
    }
}
