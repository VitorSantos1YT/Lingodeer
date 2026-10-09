package x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o1.d f55706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55707d;

    public r(long j11, o1.d dVar) {
        super(j11);
        this.f55706c = dVar;
    }

    @Override // x1.a0
    public final void a(a0 a0Var) {
        kotlin.jvm.internal.m.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        r rVar = (r) a0Var;
        synchronized (q.f55705b) {
            this.f55706c = rVar.f55706c;
            this.f55707d = rVar.f55707d;
        }
    }

    @Override // x1.a0
    public final a0 b(long j11) {
        return new r(j11, this.f55706c);
    }
}
