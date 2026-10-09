package x1;

import androidx.compose.runtime.snapshots.SnapshotApplyConflictException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f55673c;

    public g(b bVar) {
        this.f55673c = bVar;
    }

    @Override // x1.q
    public final void d() throws SnapshotApplyConflictException {
        this.f55673c.c();
        throw new SnapshotApplyConflictException();
    }
}
