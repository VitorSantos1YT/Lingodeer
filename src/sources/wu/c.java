package wu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55379a;

    public c(String multiAccountFlag) {
        kotlin.jvm.internal.m.f(multiAccountFlag, "multiAccountFlag");
        this.f55379a = multiAccountFlag;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && kotlin.jvm.internal.m.a(this.f55379a, ((c) obj).f55379a);
    }

    public final int hashCode() {
        return this.f55379a.hashCode();
    }

    public final String toString() {
        return ep.a.g("LoginFailedUserNotExist(multiAccountFlag=", this.f55379a, ")");
    }
}
