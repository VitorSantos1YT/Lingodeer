package g00;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements mz.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mz.k f28440a;

    public n0(mz.k origin) {
        kotlin.jvm.internal.m.f(origin, "origin");
        this.f28440a = origin;
    }

    @Override // mz.k
    public final boolean a() {
        return this.f28440a.a();
    }

    @Override // mz.k
    public final List c() {
        return this.f28440a.c();
    }

    @Override // mz.k
    public final mz.c d() {
        return this.f28440a.d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        n0 n0Var = obj instanceof n0 ? (n0) obj : null;
        mz.k kVar = n0Var != null ? n0Var.f28440a : null;
        mz.k kVar2 = this.f28440a;
        if (!kotlin.jvm.internal.m.a(kVar2, kVar)) {
            return false;
        }
        mz.c cVarD = kVar2.d();
        if (!(cVarD instanceof mz.c)) {
            return false;
        }
        mz.k kVar3 = obj instanceof mz.k ? (mz.k) obj : null;
        mz.c cVarD2 = kVar3 != null ? kVar3.d() : null;
        if (cVarD2 == null || !(cVarD2 instanceof mz.c)) {
            return false;
        }
        return qx.b.p(cVarD).equals(qx.b.p(cVarD2));
    }

    public final int hashCode() {
        return this.f28440a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f28440a;
    }
}
