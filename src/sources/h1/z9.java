package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z9 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aa f31425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f31426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f31427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f31428d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(aa aaVar, z1.r rVar, float f5, long j11, int i11) {
        super(2);
        this.f31425a = aaVar;
        this.f31426b = rVar;
        this.f31427c = f5;
        this.f31428d = j11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM = l1.t.M(3073);
        this.f31425a.a(this.f31427c, iM, this.f31428d, (l1.n) obj, this.f31426b);
        return qy.b0.f48488a;
    }
}
