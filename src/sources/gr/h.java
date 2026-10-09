package gr;

import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements fz.e {
    public final /* synthetic */ int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f29691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f29692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f29693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z1.r f29694f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.a f29695t;

    public /* synthetic */ h(String str, long j11, long j12, long j13, z1.r rVar, fz.a aVar, int i11, int i12) {
        this.f29689a = i12;
        this.f29690b = str;
        this.f29691c = j11;
        this.f29692d = j12;
        this.f29693e = j13;
        this.f29694f = rVar;
        this.f29695t = aVar;
        this.H = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29689a) {
            case 0:
                ((Integer) obj2).getClass();
                n.b(this.f29690b, this.f29691c, this.f29692d, this.f29693e, this.f29694f, this.f29695t, (l1.n) obj, l1.t.M(this.H | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                yg.o.c(this.f29690b, this.f29691c, this.f29692d, this.f29693e, this.f29694f, this.f29695t, (l1.n) obj, l1.t.M(this.H | 1));
                break;
        }
        return b0.f48488a;
    }
}
