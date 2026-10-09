package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z3 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f31395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f31396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f31397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f31398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f31399f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3(z1.r rVar, float f5, long j11, int i11, int i12, int i13) {
        super(2);
        this.f31394a = i13;
        this.f31395b = rVar;
        this.f31396c = f5;
        this.f31397d = j11;
        this.f31398e = i11;
        this.f31399f = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31394a) {
            case 0:
                ((Number) obj2).intValue();
                k7.e(this.f31395b, this.f31396c, this.f31397d, (l1.n) obj, l1.t.M(this.f31398e | 1), this.f31399f);
                break;
            case 1:
                ((Number) obj2).intValue();
                k7.g(this.f31395b, this.f31396c, this.f31397d, (l1.n) obj, l1.t.M(this.f31398e | 1), this.f31399f);
                break;
            default:
                ((Number) obj2).intValue();
                k7.n(this.f31395b, this.f31396c, this.f31397d, (l1.n) obj, l1.t.M(this.f31398e | 1), this.f31399f);
                break;
        }
        return qy.b0.f48488a;
    }
}
