package kr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f38439a;

    public d(n user) {
        kotlin.jvm.internal.m.f(user, "user");
        this.f38439a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && kotlin.jvm.internal.m.a(this.f38439a, ((d) obj).f38439a);
    }

    public final int hashCode() {
        return this.f38439a.hashCode();
    }

    public final String toString() {
        return "Like(user=" + this.f38439a + ")";
    }
}
