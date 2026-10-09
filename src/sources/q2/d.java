package q2;

import y2.d1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class d extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f47411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.c f47412b;

    public d(fz.c cVar, fz.c cVar2) {
        this.f47411a = cVar;
        this.f47412b = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f47411a == dVar.f47411a && this.f47412b == dVar.f47412b;
    }

    @Override // y2.d1
    public final q f() {
        f fVar = new f();
        fVar.Q = this.f47411a;
        fVar.R = this.f47412b;
        return fVar;
    }

    public final int hashCode() {
        fz.c cVar = this.f47411a;
        int iHashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        fz.c cVar2 = this.f47412b;
        return iHashCode + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    @Override // y2.d1
    public final void j(q qVar) {
        f fVar = (f) qVar;
        fVar.Q = this.f47411a;
        fVar.R = this.f47412b;
    }
}
