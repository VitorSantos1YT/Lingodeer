package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class gf implements hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49801a;

    public gf(long j11) {
        this.f49801a = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gf) && this.f49801a == ((gf) obj).f49801a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f49801a);
    }

    public final String toString() {
        return nv.p.m(this.f49801a, "ToggleSelectUnit(unitId=", ")");
    }
}
