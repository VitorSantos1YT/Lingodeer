package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f30260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f30261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f30262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f30263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2.w0 f30264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f30265f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, z1.r rVar, float f5, float f11, g2.w0 w0Var, long j11, int i11) {
        super(2);
        this.f30260a = h0Var;
        this.f30261b = rVar;
        this.f30262c = f5;
        this.f30263d = f11;
        this.f30264e = w0Var;
        this.f30265f = j11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM = l1.t.M(196609);
        this.f30260a.a(this.f30261b, this.f30262c, this.f30263d, this.f30264e, this.f30265f, (l1.n) obj, iM);
        return qy.b0.f48488a;
    }
}
