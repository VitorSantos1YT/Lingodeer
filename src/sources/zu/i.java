package zu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59440a;

    public i(String nickName) {
        kotlin.jvm.internal.m.f(nickName, "nickName");
        this.f59440a = nickName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && kotlin.jvm.internal.m.a(this.f59440a, ((i) obj).f59440a);
    }

    public final int hashCode() {
        return this.f59440a.hashCode();
    }

    public final String toString() {
        return ep.a.g("UpdateNickName(nickName=", this.f59440a, ")");
    }
}
