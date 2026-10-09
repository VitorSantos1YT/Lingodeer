package kv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38826a;

    public v0(String value) {
        kotlin.jvm.internal.m.f(value, "value");
        this.f38826a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && kotlin.jvm.internal.m.a(this.f38826a, ((v0) obj).f38826a);
    }

    public final int hashCode() {
        return this.f38826a.hashCode();
    }

    public final String toString() {
        return ep.a.g("Raw(value=", this.f38826a, ")");
    }
}
