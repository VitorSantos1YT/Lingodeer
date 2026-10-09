package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j7 implements t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y8 f49922a;

    public j7(y8 courseReviewUnit) {
        kotlin.jvm.internal.m.f(courseReviewUnit, "courseReviewUnit");
        this.f49922a = courseReviewUnit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7) && kotlin.jvm.internal.m.a(this.f49922a, ((j7) obj).f49922a);
    }

    public final int hashCode() {
        return this.f49922a.hashCode();
    }

    public final String toString() {
        return "OnHeaderClick(courseReviewUnit=" + this.f49922a + ")";
    }
}
