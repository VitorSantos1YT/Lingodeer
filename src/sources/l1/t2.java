package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 extends x1.a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f39473c;

    public t2(long j11, long j12) {
        super(j11);
        this.f39473c = j12;
    }

    @Override // x1.a0
    public final void a(x1.a0 a0Var) {
        kotlin.jvm.internal.m.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f39473c = ((t2) a0Var).f39473c;
    }

    @Override // x1.a0
    public final x1.a0 b(long j11) {
        return new t2(j11, this.f39473c);
    }
}
