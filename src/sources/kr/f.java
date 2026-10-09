package kr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f38456a;

    public f(n user) {
        kotlin.jvm.internal.m.f(user, "user");
        this.f38456a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.m.a(this.f38456a, ((f) obj).f38456a);
    }

    public final int hashCode() {
        return this.f38456a.hashCode();
    }

    public final String toString() {
        return "Select(user=" + this.f38456a + ")";
    }
}
