package zu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59428a;

    public h(String avatar) {
        kotlin.jvm.internal.m.f(avatar, "avatar");
        this.f59428a = avatar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && kotlin.jvm.internal.m.a(this.f59428a, ((h) obj).f59428a);
    }

    public final int hashCode() {
        return this.f59428a.hashCode();
    }

    public final String toString() {
        return ep.a.g("UpdateAvatar(avatar=", this.f59428a, ")");
    }
}
