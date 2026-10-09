package rt;

import com.lingodeer.data.model.CourseQuestionPreference;
import com.lingodeer.data.model.CourseQuestionPreferenceContext;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c9 implements e9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseQuestionPreferenceContext f49576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CourseQuestionPreference f49577b;

    public c9(CourseQuestionPreferenceContext context, CourseQuestionPreference preference) {
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(preference, "preference");
        this.f49576a = context;
        this.f49577b = preference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9)) {
            return false;
        }
        c9 c9Var = (c9) obj;
        return kotlin.jvm.internal.m.a(this.f49576a, c9Var.f49576a) && kotlin.jvm.internal.m.a(this.f49577b, c9Var.f49577b);
    }

    public final int hashCode() {
        return this.f49577b.hashCode() + (this.f49576a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateQuestionPreference(context=" + this.f49576a + ", preference=" + this.f49577b + ")";
    }
}
