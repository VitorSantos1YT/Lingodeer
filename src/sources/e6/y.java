package e6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements c6.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p6.c f25091a;

    public y(p6.c cVar) {
        this.f25091a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.f25091a.equals(((y) obj).f25091a);
    }

    public final int hashCode() {
        return this.f25091a.hashCode();
    }

    public final String toString() {
        return "CornerRadiusModifier(radius=" + this.f25091a + ')';
    }
}
