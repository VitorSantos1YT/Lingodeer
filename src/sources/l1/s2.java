package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends x1.a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39461c;

    public s2(long j11, int i11) {
        super(j11);
        this.f39461c = i11;
    }

    @Override // x1.a0
    public final void a(x1.a0 a0Var) {
        kotlin.jvm.internal.m.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f39461c = ((s2) a0Var).f39461c;
    }

    @Override // x1.a0
    public final x1.a0 b(long j11) {
        return new s2(j11, this.f39461c);
    }
}
