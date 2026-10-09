package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class kb extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1.r f30558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f30559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f30561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30562e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(z1.r rVar, n nVar, int i11, boolean z11, int i12) {
        super(2);
        this.f30558a = rVar;
        this.f30559b = nVar;
        this.f30560c = i11;
        this.f30561d = z11;
        this.f30562e = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        wb.m(this.f30558a, this.f30559b, this.f30560c, this.f30561d, (l1.n) obj, l1.t.M(this.f30562e | 1));
        return qy.b0.f48488a;
    }
}
