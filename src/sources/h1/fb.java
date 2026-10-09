package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class fb extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za f30252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y.w f30253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f30254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f30255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(za zaVar, y.w wVar, n nVar, boolean z11) {
        super(2);
        this.f30252a = zaVar;
        this.f30253b = wVar;
        this.f30254c = nVar;
        this.f30255d = z11;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            l1.s sVar = (l1.s) nVar;
            if (sVar.F()) {
                sVar.W();
            } else {
                l1.t.a(h2.f30320a.a(new g2.x(this.f30252a.f31434f)), t1.e.d(1992872400, new z4(this.f30253b, this.f30254c, this.f30255d), nVar), nVar, 56);
            }
        } else {
            l1.t.a(h2.f30320a.a(new g2.x(this.f30252a.f31434f)), t1.e.d(1992872400, new z4(this.f30253b, this.f30254c, this.f30255d), nVar), nVar, 56);
        }
        return qy.b0.f48488a;
    }
}
