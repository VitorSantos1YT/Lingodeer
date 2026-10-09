package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class af implements hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49470a;

    public af(long j11) {
        this.f49470a = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof af) && this.f49470a == ((af) obj).f49470a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f49470a);
    }

    public final String toString() {
        return nv.p.m(this.f49470a, "DeleteUnit(unitId=", ")");
    }
}
