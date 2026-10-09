package iv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f34850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1.r f34851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.a f34852f;

    public /* synthetic */ v0(String str, String str2, boolean z11, z1.r rVar, fz.a aVar, int i11, int i12) {
        this.f34847a = i12;
        this.f34848b = str;
        this.f34849c = str2;
        this.f34850d = z11;
        this.f34851e = rVar;
        this.f34852f = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34847a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(385);
                z0.x(this.f34848b, this.f34849c, this.f34850d, this.f34851e, this.f34852f, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(7);
                nv.a.o(this.f34848b, this.f34849c, this.f34850d, this.f34851e, this.f34852f, (l1.n) obj, iM2);
                break;
        }
        return qy.b0.f48488a;
    }
}
