package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p7 implements t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50242a;

    public p7(String folderId) {
        kotlin.jvm.internal.m.f(folderId, "folderId");
        this.f50242a = folderId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p7) && kotlin.jvm.internal.m.a(this.f50242a, ((p7) obj).f50242a);
    }

    public final int hashCode() {
        return this.f50242a.hashCode();
    }

    public final String toString() {
        return ep.a.g("SelectBookmarkFolderView(folderId=", this.f50242a, ")");
    }
}
