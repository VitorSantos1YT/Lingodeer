package z2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i1 f58589c = new i1(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f58590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f58591b;

    public i1(long j11, long j12) {
        this.f58590a = j11;
        this.f58591b = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            return v3.l.a(this.f58590a, i1Var.f58590a) && this.f58591b == i1Var.f58591b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f58591b) + (Long.hashCode(this.f58590a) * 31);
    }
}
