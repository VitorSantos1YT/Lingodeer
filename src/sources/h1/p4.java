package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p4 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f30836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f30837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f30838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f30840f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f30841t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p4(Object obj, String str, z1.r rVar, long j11, int i11, int i12, int i13) {
        super(2);
        this.f30835a = i13;
        this.f30841t = obj;
        this.f30836b = str;
        this.f30837c = rVar;
        this.f30838d = j11;
        this.f30839e = i11;
        this.f30840f = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30835a) {
            case 0:
                ((Number) obj2).intValue();
                l2.e eVar = (l2.e) this.f30841t;
                r4.c(eVar, this.f30836b, this.f30837c, this.f30838d, (l1.n) obj, l1.t.M(this.f30839e | 1), this.f30840f);
                break;
            default:
                ((Number) obj2).intValue();
                k2.b bVar = (k2.b) this.f30841t;
                r4.b(bVar, this.f30836b, this.f30837c, this.f30838d, (l1.n) obj, l1.t.M(this.f30839e | 1), this.f30840f);
                break;
        }
        return qy.b0.f48488a;
    }
}
