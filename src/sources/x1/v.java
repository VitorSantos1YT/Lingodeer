package x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p1.c f55734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55736e;

    public v(long j11, p1.c cVar) {
        super(j11);
        this.f55734c = cVar;
    }

    @Override // x1.a0
    public final void a(a0 a0Var) {
        synchronized (q.f55704a) {
            kotlin.jvm.internal.m.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f55734c = ((v) a0Var).f55734c;
            this.f55735d = ((v) a0Var).f55735d;
            this.f55736e = ((v) a0Var).f55736e;
        }
    }

    @Override // x1.a0
    public final a0 b(long j11) {
        return new v(j11, this.f55734c);
    }
}
