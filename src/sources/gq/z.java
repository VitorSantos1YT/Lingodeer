package gq;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f29656a;

    public z(w wVar) {
        this.f29656a = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && kotlin.jvm.internal.m.a(this.f29656a, ((z) obj).f29656a);
    }

    public final int hashCode() {
        return this.f29656a.hashCode();
    }

    public final String toString() {
        return "SupersededAndWait(previousSession=" + this.f29656a + ")";
    }
}
