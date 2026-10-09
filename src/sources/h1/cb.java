package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class cb extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1.r f30105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f30106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1.d f30107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30108d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(z1.r rVar, float f5, t1.d dVar, int i11) {
        super(2);
        this.f30105a = rVar;
        this.f30106b = f5;
        this.f30107c = dVar;
        this.f30108d = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM = l1.t.M(this.f30108d | 1);
        wb.l(this.f30105a, this.f30106b, this.f30107c, (l1.n) obj, iM);
        return qy.b0.f48488a;
    }
}
