package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f23922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f23923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f23924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f23925f;

    public /* synthetic */ k(boolean z11, z1.r rVar, long j11, fz.a aVar, int i11, int i12) {
        this.f23920a = i12;
        this.f23921b = z11;
        this.f23922c = rVar;
        this.f23923d = j11;
        this.f23924e = aVar;
        this.f23925f = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23920a) {
            case 0:
                ((Integer) obj2).getClass();
                a0.c(l1.t.M(this.f23925f | 1), this.f23923d, this.f23924e, (l1.n) obj, this.f23922c, this.f23921b);
                break;
            default:
                ((Integer) obj2).getClass();
                us.b.a(l1.t.M(this.f23925f | 1), this.f23923d, this.f23924e, (l1.n) obj, this.f23922c, this.f23921b);
                break;
        }
        return qy.b0.f48488a;
    }
}
