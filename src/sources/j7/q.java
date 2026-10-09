package j7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36162b;

    public q(long j11, long j12) {
        this.f36161a = j11;
        this.f36162b = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f36161a == qVar.f36161a && this.f36162b == qVar.f36162b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f36161a) * 31) + ((int) this.f36162b);
    }
}
