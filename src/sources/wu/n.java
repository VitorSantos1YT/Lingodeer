package wu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55423a;

    public n(String lanSetting) {
        kotlin.jvm.internal.m.f(lanSetting, "lanSetting");
        this.f55423a = lanSetting;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && kotlin.jvm.internal.m.a(this.f55423a, ((n) obj).f55423a);
    }

    public final int hashCode() {
        return this.f55423a.hashCode();
    }

    public final String toString() {
        return ep.a.g("Success(lanSetting=", this.f55423a, ")");
    }
}
