package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v5 implements w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ns.r0 f50528a;

    public v5(ns.r0 response) {
        kotlin.jvm.internal.m.f(response, "response");
        this.f50528a = response;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v5) && kotlin.jvm.internal.m.a(this.f50528a, ((v5) obj).f50528a);
    }

    public final int hashCode() {
        return this.f50528a.hashCode();
    }

    public final String toString() {
        return "Success(response=" + this.f50528a + ")";
    }
}
