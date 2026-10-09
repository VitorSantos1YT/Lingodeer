package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3.a0 f30039a = z3.a0.Inherit;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f30040b;

    public b6(boolean z11) {
        this.f30040b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b6) {
            return this.f30039a == ((b6) obj).f30039a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30040b) + (this.f30039a.hashCode() * 31);
    }
}
