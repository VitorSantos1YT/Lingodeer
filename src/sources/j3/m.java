package j3;

import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f35716d = j3.L(8589934592L, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f35717e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35720c;

    static {
        long jV = j3.v(0.25d);
        f35717e = new m(jV, jV, j3.v(0.25d));
    }

    public m(long j11, long j12, long j13) {
        this.f35718a = j11;
        this.f35719b = j12;
        this.f35720c = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        Object obj2 = p.f35753a;
        if (!obj2.equals(obj2) || !v3.o.a(this.f35718a, mVar.f35718a) || !v3.o.a(this.f35719b, mVar.f35719b)) {
            return false;
        }
        v3.o.a(this.f35720c, mVar.f35720c);
        return false;
    }

    public final int hashCode() {
        int iHashCode = p.f35753a.hashCode() * 31;
        v3.p[] pVarArr = v3.o.f53500b;
        return i2.g.f34126a.hashCode() + defpackage.e.a(defpackage.e.f(this.f35720c, defpackage.e.f(this.f35719b, defpackage.e.f(this.f35718a, iHashCode, 31), 31), 961), Float.NaN, 31);
    }

    public final String toString() {
        return "Bullet(shape=" + p.f35753a + ", size=(" + ((Object) v3.o.f(this.f35718a)) + ", " + ((Object) v3.o.f(this.f35719b)) + "), padding=" + ((Object) v3.o.f(this.f35720c)) + ", brush=null, alpha=NaN, drawStyle=" + i2.g.f34126a + ')';
    }
}
