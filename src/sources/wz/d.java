package wz;

import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vy.i f55510a;

    public d(vy.i iVar) {
        this.f55510a = iVar;
    }

    @Override // rz.b0
    public final vy.i getCoroutineContext() {
        return this.f55510a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f55510a + ')';
    }
}
