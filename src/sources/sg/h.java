package sg;

import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51644a;

    public h(int i11) {
        this.f51644a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f51644a == ((h) obj).f51644a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f51644a);
    }

    public final String toString() {
        return p0.h(this.f51644a, "AstHeading(level=", ")");
    }
}
