package g2;

import y2.d1;
import y2.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class q extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f28592a;

    public q(fz.c cVar) {
        this.f28592a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.f28592a == ((q) obj).f28592a;
        }
        return false;
    }

    @Override // y2.d1
    public final z1.q f() {
        return new r(this.f28592a);
    }

    public final int hashCode() {
        return this.f28592a.hashCode();
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        k1 k1Var;
        r rVar = (r) qVar;
        fz.c cVar = this.f28592a;
        rVar.Q = cVar;
        if (rVar.f58482a.P && (k1Var = y2.f.v(rVar, 2).R) != null) {
            k1Var.A1(cVar, true);
        }
    }
}
