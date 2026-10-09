package w2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f54559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0 f54560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1 f54561c = new o1(this, 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o1 f54562d = new o1(this, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o1 f54563e = new o1(this, 1);

    public p1(s1 s1Var) {
        this.f54559a = s1Var;
    }

    public final m0 a() {
        m0 m0Var = this.f54560b;
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
