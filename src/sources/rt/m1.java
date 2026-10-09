package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f50048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f50049b;

    public m1(List items, List list) {
        kotlin.jvm.internal.m.f(items, "items");
        this.f50048a = items;
        this.f50049b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return kotlin.jvm.internal.m.a(this.f50048a, m1Var.f50048a) && kotlin.jvm.internal.m.a(this.f50049b, m1Var.f50049b);
    }

    public final int hashCode() {
        return this.f50049b.hashCode() + (this.f50048a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseFlashCardFutureReviewResolution(items=" + this.f50048a + ", invalidStatuses=" + this.f50049b + ")";
    }
}
