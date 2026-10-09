package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f3587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fz.a f3590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1.k1 f3591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f3592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3594h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l1.k1 f3595i = l1.t.B(Boolean.TRUE);

    public l(Object obj, j2 j2Var, s sVar, long j11, Object obj2, long j12, fz.a aVar) {
        this.f3587a = j2Var;
        this.f3588b = obj2;
        this.f3589c = j12;
        this.f3590d = aVar;
        this.f3591e = l1.t.B(obj);
        this.f3592f = e.k(sVar);
        this.f3593g = j11;
    }

    public final void a() {
        this.f3595i.setValue(Boolean.FALSE);
        this.f3590d.invoke();
    }
}
