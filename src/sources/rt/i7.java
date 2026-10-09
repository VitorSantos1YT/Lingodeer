package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i7 implements t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y8 f49876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49877b;

    public i7(y8 courseReviewUnit, boolean z11) {
        kotlin.jvm.internal.m.f(courseReviewUnit, "courseReviewUnit");
        this.f49876a = courseReviewUnit;
        this.f49877b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7)) {
            return false;
        }
        i7 i7Var = (i7) obj;
        return kotlin.jvm.internal.m.a(this.f49876a, i7Var.f49876a) && this.f49877b == i7Var.f49877b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49877b) + (this.f49876a.hashCode() * 31);
    }

    public final String toString() {
        return "OnCourseReviewUnitCheckedChange(courseReviewUnit=" + this.f49876a + ", isChecked=" + this.f49877b + ")";
    }
}
