package m6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h2.d f40930d;

    public u() {
        int i11 = pz.a.f47220d;
        pz.c cVar = pz.c.SECONDS;
        long jP = pz.f.p(45, cVar);
        long jP2 = pz.f.p(5, cVar);
        long jP3 = pz.f.p(5, cVar);
        this.f40927a = jP;
        this.f40928b = jP2;
        this.f40929c = jP3;
        this.f40930d = t.f40926a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            long j11 = uVar.f40927a;
            int i11 = pz.a.f47220d;
            if (this.f40927a == j11 && this.f40928b == uVar.f40928b && this.f40929c == uVar.f40929c && kotlin.jvm.internal.m.a(this.f40930d, uVar.f40930d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = pz.a.f47220d;
        return this.f40930d.hashCode() + defpackage.e.f(this.f40929c, defpackage.e.f(this.f40928b, Long.hashCode(this.f40927a) * 31, 31), 31);
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) pz.a.k(this.f40927a)) + ", additionalTime=" + ((Object) pz.a.k(this.f40928b)) + ", idleTimeout=" + ((Object) pz.a.k(this.f40929c)) + ", timeSource=" + this.f40930d + ')';
    }
}
