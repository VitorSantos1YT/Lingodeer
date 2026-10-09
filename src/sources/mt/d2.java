package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d2 implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41335a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f41337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f41338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f41339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.c f41340f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f41341t;

    public /* synthetic */ d2(String str, String[] strArr, int i11, boolean z11, boolean z12, fz.c cVar, fz.c cVar2, int i12, int i13) {
        this.H = str;
        this.K = strArr;
        this.f41336b = i11;
        this.f41337c = z11;
        this.f41338d = z12;
        this.f41339e = cVar;
        this.f41340f = cVar2;
        this.f41341t = i13;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41335a) {
            case 0:
                ((Integer) obj2).getClass();
                p2.c(this.f41337c, (q2) this.H, this.f41338d, this.f41339e, (fz.a) this.K, this.f41340f, (l1.n) obj, l1.t.M(this.f41336b | 1), this.f41341t);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(196609);
                ys.a.i((String) this.H, (String[]) this.K, this.f41336b, this.f41337c, this.f41338d, this.f41339e, this.f41340f, (l1.n) obj, iM, this.f41341t);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ d2(boolean z11, q2 q2Var, boolean z12, fz.c cVar, fz.a aVar, fz.c cVar2, int i11, int i12) {
        this.f41337c = z11;
        this.H = q2Var;
        this.f41338d = z12;
        this.f41339e = cVar;
        this.K = aVar;
        this.f41340f = cVar2;
        this.f41336b = i11;
        this.f41341t = i12;
    }
}
