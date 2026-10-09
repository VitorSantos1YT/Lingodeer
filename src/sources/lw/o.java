package lw;

import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f40425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f40426b;

    public o(n nVar, q1 q1Var) {
        Preconditions.k(nVar, "state is null");
        this.f40425a = nVar;
        Preconditions.k(q1Var, "status is null");
        this.f40426b = q1Var;
    }

    public static o a(n nVar) {
        Preconditions.e("state is TRANSIENT_ERROR. Use forError() instead", nVar != n.TRANSIENT_FAILURE);
        return new o(nVar, q1.f40434e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f40425a.equals(oVar.f40425a) && this.f40426b.equals(oVar.f40426b);
    }

    public final int hashCode() {
        return this.f40425a.hashCode() ^ this.f40426b.hashCode();
    }

    public final String toString() {
        q1 q1Var = this.f40426b;
        boolean zF = q1Var.f();
        n nVar = this.f40425a;
        if (zF) {
            return nVar.toString();
        }
        return nVar + "(" + q1Var + ")";
    }
}
