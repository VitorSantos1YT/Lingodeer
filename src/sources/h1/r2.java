package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fz.e f30954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f30955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f30956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f30957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t1.d f30958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f30959f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(fz.e eVar, long j11, long j12, float f5, t1.d dVar, int i11) {
        super(2);
        this.f30954a = eVar;
        this.f30955b = j11;
        this.f30956c = j12;
        this.f30957d = f5;
        this.f30958e = dVar;
        this.f30959f = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        y2.b(this.f30954a, this.f30955b, this.f30956c, this.f30957d, this.f30958e, (l1.n) obj, l1.t.M(this.f30959f | 1));
        return qy.b0.f48488a;
    }
}
