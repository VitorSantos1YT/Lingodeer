package rt;

import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseLessonPracticeType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ob implements rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseLesson f50211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CourseLessonPracticeType f50212b;

    public ob(CourseLesson courseLesson, CourseLessonPracticeType practiceType) {
        kotlin.jvm.internal.m.f(courseLesson, "courseLesson");
        kotlin.jvm.internal.m.f(practiceType, "practiceType");
        this.f50211a = courseLesson;
        this.f50212b = practiceType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob)) {
            return false;
        }
        ob obVar = (ob) obj;
        return kotlin.jvm.internal.m.a(this.f50211a, obVar.f50211a) && this.f50212b == obVar.f50212b;
    }

    public final int hashCode() {
        return this.f50212b.hashCode() + (this.f50211a.hashCode() * 31);
    }

    public final String toString() {
        return "ClickedCourseLesson(courseLesson=" + this.f50211a + ", practiceType=" + this.f50212b + ")";
    }
}
