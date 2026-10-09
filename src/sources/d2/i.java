package d2;

import y2.d1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class i extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f23072a;

    public i(fz.c cVar) {
        this.f23072a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return this.f23072a == ((i) obj).f23072a;
        }
        return false;
    }

    @Override // y2.d1
    public final q f() {
        return new d(new e(), this.f23072a);
    }

    public final int hashCode() {
        return this.f23072a.hashCode();
    }

    @Override // y2.d1
    public final void j(q qVar) {
        d dVar = (d) qVar;
        dVar.S = this.f23072a;
        dVar.T0();
    }
}
