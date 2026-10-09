package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50224a;

    public p0(String focUnits) {
        kotlin.jvm.internal.m.f(focUnits, "focUnits");
        this.f50224a = focUnits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && kotlin.jvm.internal.m.a(this.f50224a, ((p0) obj).f50224a);
    }

    public final int hashCode() {
        return this.f50224a.hashCode();
    }

    public final String toString() {
        return ep.a.g("UpdateFocUnits(focUnits=", this.f50224a, ")");
    }
}
