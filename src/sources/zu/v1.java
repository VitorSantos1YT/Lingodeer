package zu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v1 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59569a;

    public v1(int i11) {
        this.f59569a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1) && this.f59569a == ((v1) obj).f59569a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59569a);
    }

    public final String toString() {
        return hh.p0.h(this.f59569a, "UpdateScriptStyle(scriptStyle=", ")");
    }
}
