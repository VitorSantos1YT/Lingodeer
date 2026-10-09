package wu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f55410a;

    public k(d dVar) {
        this.f55410a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && kotlin.jvm.internal.m.a(this.f55410a, ((k) obj).f55410a);
    }

    public final int hashCode() {
        return this.f55410a.hashCode();
    }

    public final String toString() {
        return "Failed(reason=" + this.f55410a + ")";
    }
}
