package rt;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u8 f50486b = new u8(ry.s.f50855a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f50487a;

    public u8(Map itemIdByReviewId) {
        kotlin.jvm.internal.m.f(itemIdByReviewId, "itemIdByReviewId");
        this.f50487a = itemIdByReviewId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8) && kotlin.jvm.internal.m.a(this.f50487a, ((u8) obj).f50487a);
    }

    public final int hashCode() {
        return this.f50487a.hashCode();
    }

    public final String toString() {
        return "CourseReviewSelection(itemIdByReviewId=" + this.f50487a + ")";
    }
}
