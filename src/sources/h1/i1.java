package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1.d f30390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j3.y0 f30391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f30392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f30393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f30394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f30395f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0.t1 f30396t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(t1.d dVar, j3.y0 y0Var, long j11, long j12, long j13, float f5, j0.t1 t1Var, int i11) {
        super(2);
        this.f30390a = dVar;
        this.f30391b = y0Var;
        this.f30392c = j11;
        this.f30393d = j12;
        this.f30394e = j13;
        this.f30395f = f5;
        this.f30396t = t1Var;
        this.H = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        m1.c(this.f30390a, this.f30391b, this.f30392c, this.f30393d, this.f30394e, this.f30395f, this.f30396t, (l1.n) obj, l1.t.M(this.H | 1));
        return qy.b0.f48488a;
    }
}
