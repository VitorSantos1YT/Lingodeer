package rt;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class he {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f49852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f49853b;

    public he(Map folderIdsByItemId, Set favoriteIds) {
        kotlin.jvm.internal.m.f(favoriteIds, "favoriteIds");
        kotlin.jvm.internal.m.f(folderIdsByItemId, "folderIdsByItemId");
        this.f49852a = favoriteIds;
        this.f49853b = folderIdsByItemId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he)) {
            return false;
        }
        he heVar = (he) obj;
        return kotlin.jvm.internal.m.a(this.f49852a, heVar.f49852a) && kotlin.jvm.internal.m.a(this.f49853b, heVar.f49853b);
    }

    public final int hashCode() {
        return this.f49853b.hashCode() + (this.f49852a.hashCode() * 31);
    }

    public final String toString() {
        return "FavoriteBookmarkInputs(favoriteIds=" + this.f49852a + ", folderIdsByItemId=" + this.f49853b + ")";
    }
}
