package lt;

import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40326a;

    public i(long j11) {
        this.f40326a = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f40326a == ((i) obj).f40326a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40326a);
    }

    public final String toString() {
        return p.m(this.f40326a, "Unit(unitId=", ")");
    }
}
