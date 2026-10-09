package gq;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f29655a;

    public y(w wVar) {
        this.f29655a = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && kotlin.jvm.internal.m.a(this.f29655a, ((y) obj).f29655a);
    }

    public final int hashCode() {
        return this.f29655a.hashCode();
    }

    public final String toString() {
        return "ReuseExisting(session=" + this.f29655a + ")";
    }
}
