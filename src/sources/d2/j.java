package d2;

import y2.d1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class j extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f23073a;

    public j(fz.c cVar) {
        this.f23073a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.f23073a == ((j) obj).f23073a;
        }
        return false;
    }

    @Override // y2.d1
    public final q f() {
        k kVar = new k();
        kVar.Q = this.f23073a;
        return kVar;
    }

    public final int hashCode() {
        return this.f23073a.hashCode();
    }

    @Override // y2.d1
    public final void j(q qVar) {
        ((k) qVar).Q = this.f23073a;
    }
}
