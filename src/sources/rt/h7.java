package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h7 implements t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f49834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f49835c;

    public h7(String reviewId, long j11, boolean z11) {
        kotlin.jvm.internal.m.f(reviewId, "reviewId");
        this.f49833a = reviewId;
        this.f49834b = j11;
        this.f49835c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7)) {
            return false;
        }
        h7 h7Var = (h7) obj;
        return kotlin.jvm.internal.m.a(this.f49833a, h7Var.f49833a) && this.f49834b == h7Var.f49834b && this.f49835c == h7Var.f49835c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49835c) + defpackage.e.f(this.f49834b, this.f49833a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM = com.google.android.material.datepicker.d.m(this.f49834b, "OnCourseReviewCheckedChange(reviewId=", this.f49833a, ", itemId=");
        sbM.append(", isChecked=");
        sbM.append(this.f49835c);
        sbM.append(")");
        return sbM.toString();
    }
}
