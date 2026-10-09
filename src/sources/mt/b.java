package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41266b;

    public b(String folderId, String currentName) {
        kotlin.jvm.internal.m.f(folderId, "folderId");
        kotlin.jvm.internal.m.f(currentName, "currentName");
        this.f41265a = folderId;
        this.f41266b = currentName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.m.a(this.f41265a, bVar.f41265a) && kotlin.jvm.internal.m.a(this.f41266b, bVar.f41266b);
    }

    public final int hashCode() {
        return this.f41266b.hashCode() + (this.f41265a.hashCode() * 31);
    }

    public final String toString() {
        return ep.a.h("Rename(folderId=", this.f41265a, ", currentName=", this.f41266b, ")");
    }
}
