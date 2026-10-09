package fb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27061b;

    public d0(long j11, long j12) {
        this.f27060a = j11;
        this.f27061b = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class.equals(obj.getClass())) {
            d0 d0Var = (d0) obj;
            if (d0Var.f27060a == this.f27060a && d0Var.f27061b == this.f27061b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27061b) + (Long.hashCode(this.f27060a) * 31);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.f27060a + ", flexIntervalMillis=" + this.f27061b + '}';
    }
}
