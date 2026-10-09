package y0;

import d1.q0;
import d1.r0;
import d1.s0;
import y2.d1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class i extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o20.i f56797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f56798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f56799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q0 f56800d;

    public i(o20.i iVar, r0 r0Var, s0 s0Var, q0 q0Var) {
        this.f56797a = iVar;
        this.f56798b = r0Var;
        this.f56799c = s0Var;
        this.f56800d = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f56797a == iVar.f56797a && this.f56798b == iVar.f56798b && this.f56799c == iVar.f56799c && this.f56800d == iVar.f56800d;
    }

    @Override // y2.d1
    public final q f() {
        return new k(this.f56797a, this.f56798b, this.f56799c, this.f56800d);
    }

    public final int hashCode() {
        return this.f56800d.hashCode() + ((this.f56799c.hashCode() + ((this.f56798b.hashCode() + (this.f56797a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // y2.d1
    public final void j(q qVar) {
        k kVar = (k) qVar;
        kVar.S.f44522b = null;
        o20.i iVar = this.f56797a;
        kVar.S = iVar;
        iVar.f44522b = kVar;
        kVar.T = this.f56798b;
        kVar.U = this.f56799c;
        kVar.V = this.f56800d;
    }
}
