package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49991b;

    public kc(String url, String path) {
        kotlin.jvm.internal.m.f(url, "url");
        kotlin.jvm.internal.m.f(path, "path");
        this.f49990a = url;
        this.f49991b = path;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc)) {
            return false;
        }
        kc kcVar = (kc) obj;
        return kotlin.jvm.internal.m.a(this.f49990a, kcVar.f49990a) && kotlin.jvm.internal.m.a(this.f49991b, kcVar.f49991b);
    }

    public final int hashCode() {
        return this.f49991b.hashCode() + (this.f49990a.hashCode() * 31);
    }

    public final String toString() {
        return ep.a.h("ResourceKey(url=", this.f49990a, ", path=", this.f49991b, ")");
    }
}
