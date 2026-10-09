package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h8 implements k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49836a;

    public h8(String folderId) {
        kotlin.jvm.internal.m.f(folderId, "folderId");
        this.f49836a = folderId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8) && kotlin.jvm.internal.m.a(this.f49836a, ((h8) obj).f49836a);
    }

    public final int hashCode() {
        return this.f49836a.hashCode();
    }

    public final String toString() {
        return ep.a.g("BookmarkFolder(folderId=", this.f49836a, ")");
    }
}
