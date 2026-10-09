package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w4 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f42021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f42022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1.d f42023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f42024e;

    public /* synthetic */ w4(float f5, fz.a aVar, t1.d dVar, int i11, int i12) {
        this.f42020a = i12;
        this.f42021b = f5;
        this.f42022c = aVar;
        this.f42023d = dVar;
        this.f42024e = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f42020a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                l5.p(this.f42021b, this.f42022c, this.f42023d, nVar, l1.t.M(this.f42024e | 1));
                break;
            default:
                nn.c.n(this.f42021b, this.f42022c, this.f42023d, nVar, l1.t.M(this.f42024e | 1));
                break;
        }
        return qy.b0.f48488a;
    }
}
