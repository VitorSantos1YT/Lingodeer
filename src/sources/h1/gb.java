package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class gb extends kotlin.jvm.internal.n implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za f30305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f30306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f30307c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(za zaVar, n nVar, boolean z11) {
        super(3);
        this.f30305a = zaVar;
        this.f30306b = nVar;
        this.f30307c = z11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l1.n nVar = (l1.n) obj2;
        ((Number) obj3).intValue();
        z1.r rVarB = g3.r.b(j0.e2.n(z1.o.f58481a, k1.k0.f37578b), false, o0.U);
        float f5 = wb.f31261a;
        n nVar2 = this.f30306b;
        boolean z11 = this.f30307c;
        wb.l(rVarB, f5, t1.e.d(-320307952, new fb(this.f30305a, (y.w) obj, nVar2, z11), nVar), nVar, 432);
        return qy.b0.f48488a;
    }
}
