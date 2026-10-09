package rt;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f49566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f49567b;

    public c6(Map map, Set favoriteItemIds) {
        kotlin.jvm.internal.m.f(favoriteItemIds, "favoriteItemIds");
        this.f49566a = favoriteItemIds;
        this.f49567b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6)) {
            return false;
        }
        c6 c6Var = (c6) obj;
        return kotlin.jvm.internal.m.a(this.f49566a, c6Var.f49566a) && kotlin.jvm.internal.m.a(this.f49567b, c6Var.f49567b);
    }

    public final int hashCode() {
        return this.f49567b.hashCode() + (this.f49566a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseReviewBookmarkSnapshot(favoriteItemIds=" + this.f49566a + ", folderIdByItemId=" + this.f49567b + ")";
    }
}
