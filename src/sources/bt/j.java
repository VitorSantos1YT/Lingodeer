package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5551a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f5552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f5553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f5554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5555e;

    public /* synthetic */ j(int i11, int i12, fz.a aVar, z1.r rVar, boolean z11) {
        this.f5555e = i11;
        this.f5554d = z11;
        this.f5553c = aVar;
        this.f5552b = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5551a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(3073);
                b.f0(this.f5555e, iM, this.f5553c, (l1.n) obj, this.f5552b, this.f5554d);
                break;
            default:
                ((Integer) obj2).getClass();
                qx.p.e(l1.t.M(this.f5555e | 1), this.f5553c, (l1.n) obj, this.f5552b, this.f5554d);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ j(z1.r rVar, boolean z11, fz.a aVar, int i11) {
        this.f5552b = rVar;
        this.f5553c = aVar;
        this.f5554d = z11;
        this.f5555e = i11;
    }
}
