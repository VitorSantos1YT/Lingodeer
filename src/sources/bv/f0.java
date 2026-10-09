package bv;

import g00.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class f0 {
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6297b;

    public /* synthetic */ f0(int i11, int i12, int i13) {
        if (3 != (i11 & 3)) {
            d1.k(i11, 3, d0.f6292a.getDescriptor());
            throw null;
        }
        this.f6296a = i12;
        this.f6297b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f6296a == f0Var.f6296a && this.f6297b == f0Var.f6297b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6297b) + (Integer.hashCode(this.f6296a) * 31);
    }

    public final String toString() {
        return hh.p0.l("TimeSpan(end=", this.f6296a, ", start=", this.f6297b, ")");
    }
}
