package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends x1.a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f39485c;

    public u2(long j11, Object obj) {
        super(j11);
        this.f39485c = obj;
    }

    @Override // x1.a0
    public final void a(x1.a0 a0Var) {
        kotlin.jvm.internal.m.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f39485c = ((u2) a0Var).f39485c;
    }

    @Override // x1.a0
    public final x1.a0 b(long j11) {
        return new u2(x1.l.j().g(), this.f39485c);
    }
}
