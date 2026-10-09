package i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f34075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j3.y0 f34076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.e f34077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f34078e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(long j11, j3.y0 y0Var, fz.e eVar, int i11, int i12) {
        super(2);
        this.f34074a = i12;
        this.f34075b = j11;
        this.f34076c = y0Var;
        this.f34077d = eVar;
        this.f34078e = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34074a) {
            case 0:
                ((Number) obj2).intValue();
                p.a(this.f34075b, this.f34076c, this.f34077d, (l1.n) obj, l1.t.M(this.f34078e | 1));
                break;
            default:
                ((Number) obj2).intValue();
                d1.b(this.f34075b, this.f34076c, this.f34077d, (l1.n) obj, l1.t.M(this.f34078e | 1));
                break;
        }
        return qy.b0.f48488a;
    }
}
