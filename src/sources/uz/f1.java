package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f1 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f53296a;

    public f1(long j11) {
        this.f53296a = j11;
        if (j11 < 0) {
            throw new IllegalArgumentException(nv.p.m(j11, "stopTimeout(", " ms) cannot be negative").toString());
        }
    }

    @Override // uz.b1
    public final i a(vz.t tVar) {
        return x0.o(new n9.n1(x0.B(tVar, new e1(this, null)), new ej.j(2, 5, null), 3));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f1) {
            return this.f53296a == ((f1) obj).f53296a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(this.f53296a) * 31);
    }

    public final String toString() {
        sy.c cVar = new sy.c(2);
        long j11 = this.f53296a;
        if (j11 > 0) {
            cVar.add("stopTimeout=" + j11 + "ms");
        }
        return hh.p0.o(new StringBuilder("SharingStarted.WhileSubscribed("), ry.m.y0(ns.o.e(cVar), null, null, null, null, 63), ')');
    }
}
