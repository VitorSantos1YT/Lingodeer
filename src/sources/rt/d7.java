package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d7 implements t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49625a;

    public d7(String name) {
        kotlin.jvm.internal.m.f(name, "name");
        this.f49625a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d7) && kotlin.jvm.internal.m.a(this.f49625a, ((d7) obj).f49625a);
    }

    public final int hashCode() {
        return this.f49625a.hashCode();
    }

    public final String toString() {
        return ep.a.g("CreateBookmarkFolder(name=", this.f49625a, ")");
    }
}
