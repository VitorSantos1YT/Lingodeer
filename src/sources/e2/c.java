package e2;

import y2.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class c extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f24707a;

    public c(fz.c cVar) {
        this.f24707a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f24707a == ((c) obj).f24707a;
        }
        return false;
    }

    @Override // y2.d1
    public final z1.q f() {
        e eVar = new e();
        eVar.Q = this.f24707a;
        return eVar;
    }

    public final int hashCode() {
        return this.f24707a.hashCode();
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        ((e) qVar).Q = this.f24707a;
    }
}
