package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g7 implements t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8 f49785a;

    public g7(r8 courseReviewPracticeModel) {
        kotlin.jvm.internal.m.f(courseReviewPracticeModel, "courseReviewPracticeModel");
        this.f49785a = courseReviewPracticeModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7) && this.f49785a == ((g7) obj).f49785a;
    }

    public final int hashCode() {
        return this.f49785a.hashCode();
    }

    public final String toString() {
        return "OnChangeReviewPracticeModel(courseReviewPracticeModel=" + this.f49785a + ")";
    }
}
