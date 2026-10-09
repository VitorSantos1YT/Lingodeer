package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v0 implements fz.e {
    public final /* synthetic */ long H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24261a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f24264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f24265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f24266f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f24267t;

    public /* synthetic */ v0(String str, int i11, String str2, String str3, long j11, long j12, long j13, int i12) {
        this.f24262b = str;
        this.f24263c = i11;
        this.f24264d = str2;
        this.f24265e = str3;
        this.f24266f = j11;
        this.f24267t = j12;
        this.H = j13;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f24261a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                e.c(this.f24262b, this.f24264d, this.f24263c, this.f24266f, this.f24267t, this.H, this.f24265e, z1.o.f58481a, nVar, l1.t.M(1572865));
                break;
            default:
                yg.o.e(this.f24262b, this.f24263c, this.f24264d, this.f24265e, this.f24266f, this.f24267t, this.H, nVar, l1.t.M(1769473));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ v0(String str, String str2, int i11, long j11, long j12, long j13, String str3, int i12) {
        this.f24262b = str;
        this.f24264d = str2;
        this.f24263c = i11;
        this.f24266f = j11;
        this.f24267t = j12;
        this.H = j13;
        this.f24265e = str3;
    }
}
