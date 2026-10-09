package zu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59383a;

    public b1(String keyword) {
        kotlin.jvm.internal.m.f(keyword, "keyword");
        this.f59383a = keyword;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && kotlin.jvm.internal.m.a(this.f59383a, ((b1) obj).f59383a);
    }

    public final int hashCode() {
        return this.f59383a.hashCode();
    }

    public final String toString() {
        return ep.a.g("SearchFriends(keyword=", this.f59383a, ")");
    }
}
