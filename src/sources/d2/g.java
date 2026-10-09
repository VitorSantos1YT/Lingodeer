package d2;

import y2.d1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class g extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f23071a;

    public g(fz.c cVar) {
        this.f23071a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f23071a == ((g) obj).f23071a;
        }
        return false;
    }

    @Override // y2.d1
    public final q f() {
        f fVar = new f();
        fVar.Q = this.f23071a;
        return fVar;
    }

    public final int hashCode() {
        return this.f23071a.hashCode();
    }

    @Override // y2.d1
    public final void j(q qVar) {
        ((f) qVar).Q = this.f23071a;
    }
}
