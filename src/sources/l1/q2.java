package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 extends x1.a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f39429c;

    public q2(long j11, float f5) {
        super(j11);
        this.f39429c = f5;
    }

    @Override // x1.a0
    public final void a(x1.a0 a0Var) {
        kotlin.jvm.internal.m.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f39429c = ((q2) a0Var).f39429c;
    }

    @Override // x1.a0
    public final x1.a0 b(long j11) {
        return new q2(j11, this.f39429c);
    }
}
