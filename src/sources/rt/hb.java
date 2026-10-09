package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class hb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49845b;

    public hb(long j11, boolean z11) {
        this.f49844a = j11;
        this.f49845b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        return this.f49844a == hbVar.f49844a && this.f49845b == hbVar.f49845b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49845b) + (Long.hashCode(this.f49844a) * 31);
    }

    public final String toString() {
        return "CountdownState(timeRemaining=" + this.f49844a + ", isFinished=" + this.f49845b + ")";
    }
}
