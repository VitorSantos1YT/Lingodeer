package rt;

import com.lingodeer.data.model.CourseQuestionPreferenceContext;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a9 implements e9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseQuestionPreferenceContext f49449a;

    public a9(CourseQuestionPreferenceContext context) {
        kotlin.jvm.internal.m.f(context, "context");
        this.f49449a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9) && kotlin.jvm.internal.m.a(this.f49449a, ((a9) obj).f49449a);
    }

    public final int hashCode() {
        return this.f49449a.hashCode();
    }

    public final String toString() {
        return "ResetCurrentQuestionPreference(context=" + this.f49449a + ")";
    }
}
