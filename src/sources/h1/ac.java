package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f30010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f30011e;

    public ac(long j11, long j12, long j13, long j14, long j15) {
        this.f30007a = j11;
        this.f30008b = j12;
        this.f30009c = j13;
        this.f30010d = j14;
        this.f30011e = j15;
    }

    public final ac a(long j11, long j12, long j13, long j14, long j15) {
        return new ac(j11 != 16 ? j11 : this.f30007a, j12 != 16 ? j12 : this.f30008b, j13 != 16 ? j13 : this.f30009c, j14 != 16 ? j14 : this.f30010d, j15 != 16 ? j15 : this.f30011e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return g2.x.d(this.f30007a, acVar.f30007a) && g2.x.d(this.f30008b, acVar.f30008b) && g2.x.d(this.f30009c, acVar.f30009c) && g2.x.d(this.f30010d, acVar.f30010d) && g2.x.d(this.f30011e, acVar.f30011e);
    }

    public final int hashCode() {
        int i11 = g2.x.f28623j;
        return Long.hashCode(this.f30011e) + defpackage.e.f(this.f30010d, defpackage.e.f(this.f30009c, defpackage.e.f(this.f30008b, Long.hashCode(this.f30007a) * 31, 31), 31), 31);
    }
}
