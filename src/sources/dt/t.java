package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24200a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f24201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f24204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.a f24205f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f24206t;

    public /* synthetic */ t(float f5, int i11, boolean z11, fz.a aVar, t1.d dVar, int i12) {
        this.f24201b = f5;
        this.f24202c = i11;
        this.f24204e = z11;
        this.f24205f = aVar;
        this.f24206t = dVar;
        this.f24203d = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24200a) {
            case 0:
                ((Integer) obj2).getClass();
                a0.f((z1.r) this.f24206t, this.f24201b, this.f24204e, this.f24205f, (l1.n) obj, l1.t.M(this.f24202c | 1), this.f24203d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                e.G((qy.l) this.f24206t, this.f24201b, this.f24202c, this.f24203d, this.f24204e, this.f24205f, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                ys.a.v(this.f24201b, this.f24202c, this.f24204e, this.f24205f, (t1.d) this.f24206t, (l1.n) obj, l1.t.M(this.f24203d | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ t(qy.l lVar, float f5, int i11, int i12, boolean z11, fz.a aVar, int i13) {
        this.f24206t = lVar;
        this.f24201b = f5;
        this.f24202c = i11;
        this.f24203d = i12;
        this.f24204e = z11;
        this.f24205f = aVar;
    }

    public /* synthetic */ t(z1.r rVar, float f5, boolean z11, fz.a aVar, int i11, int i12) {
        this.f24206t = rVar;
        this.f24201b = f5;
        this.f24204e = z11;
        this.f24205f = aVar;
        this.f24202c = i11;
        this.f24203d = i12;
    }
}
