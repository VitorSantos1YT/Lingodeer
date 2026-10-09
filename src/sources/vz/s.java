package vz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements vy.d, xy.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vy.d f54362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vy.i f54363b;

    public s(vy.d dVar, vy.i iVar) {
        this.f54362a = dVar;
        this.f54363b = iVar;
    }

    @Override // xy.d
    public final xy.d getCallerFrame() {
        vy.d dVar = this.f54362a;
        if (dVar instanceof xy.d) {
            return (xy.d) dVar;
        }
        return null;
    }

    @Override // vy.d
    public final vy.i getContext() {
        return this.f54363b;
    }

    @Override // vy.d
    public final void resumeWith(Object obj) {
        this.f54362a.resumeWith(obj);
    }
}
