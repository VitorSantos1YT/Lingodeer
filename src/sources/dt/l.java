package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23948a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f23949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f23951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f23953f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ qy.e f23954t;

    public /* synthetic */ l(fz.a aVar, fz.e eVar, int i11, long j11, int i12, fz.a aVar2) {
        this.f23949b = aVar;
        this.f23953f = eVar;
        this.f23950c = i11;
        this.f23951d = j11;
        this.f23952e = i12;
        this.f23954t = aVar2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23948a) {
            case 0:
                ((Integer) obj2).getClass();
                a0.h((z1.r) this.f23953f, this.f23951d, this.f23949b, (t1.d) this.f23954t, (l1.n) obj, l1.t.M(this.f23950c | 1), this.f23952e);
                break;
            default:
                fz.e eVar = (fz.e) this.f23953f;
                fz.a aVar = (fz.a) this.f23954t;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    iu.k.g(this.f23949b, null, jr.a.f36568n, null, t1.e.d(-776936956, new jr.y(eVar, this.f23950c, this.f23951d, this.f23952e, aVar), sVar), null, null, null, sVar, 24960, 234);
                } else {
                    sVar.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ l(z1.r rVar, long j11, fz.a aVar, t1.d dVar, int i11, int i12) {
        this.f23953f = rVar;
        this.f23951d = j11;
        this.f23949b = aVar;
        this.f23954t = dVar;
        this.f23950c = i11;
        this.f23952e = i12;
    }
}
