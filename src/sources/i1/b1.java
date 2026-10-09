package i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33981a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f33982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f33983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy.e f33984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(long j11, fz.e eVar, int i11) {
        super(2);
        this.f33982b = j11;
        this.f33984d = eVar;
        this.f33983c = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f33981a;
        l1.n nVar = (l1.n) obj;
        ((Number) obj2).intValue();
        switch (i11) {
            case 0:
                d1.c(this.f33982b, (fz.e) this.f33984d, nVar, l1.t.M(this.f33983c | 1));
                break;
            default:
                j1.j.b((fz.a) this.f33984d, this.f33982b, nVar, l1.t.M(this.f33983c | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(fz.a aVar, long j11, int i11) {
        super(2);
        this.f33984d = aVar;
        this.f33982b = j11;
        this.f33983c = i11;
    }
}
