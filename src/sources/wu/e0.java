package wu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f55386a;

    public e0(d0 reason) {
        kotlin.jvm.internal.m.f(reason, "reason");
        this.f55386a = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && this.f55386a == ((e0) obj).f55386a;
    }

    public final int hashCode() {
        return this.f55386a.hashCode();
    }

    public final String toString() {
        return "Failed(reason=" + this.f55386a + ")";
    }
}
