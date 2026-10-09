package ad;

import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f630a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f630a == ((r) obj).f630a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f630a);
    }

    public final String toString() {
        return p0.h(this.f630a, "RawRes(resId=", ")");
    }
}
