package com.lingodeer.data.model.uistate;

import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseLessonPracticeType;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseLessonClicked {
    private final CourseLesson lesson;
    private final CourseLessonPracticeType practiceType;

    public CourseLessonClicked(CourseLesson lesson, CourseLessonPracticeType practiceType) {
        m.f(lesson, "lesson");
        m.f(practiceType, "practiceType");
        this.lesson = lesson;
        this.practiceType = practiceType;
    }

    public static /* synthetic */ CourseLessonClicked copy$default(CourseLessonClicked courseLessonClicked, CourseLesson courseLesson, CourseLessonPracticeType courseLessonPracticeType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            courseLesson = courseLessonClicked.lesson;
        }
        if ((i11 & 2) != 0) {
            courseLessonPracticeType = courseLessonClicked.practiceType;
        }
        return courseLessonClicked.copy(courseLesson, courseLessonPracticeType);
    }

    public final CourseLesson component1() {
        return this.lesson;
    }

    public final CourseLessonPracticeType component2() {
        return this.practiceType;
    }

    public final CourseLessonClicked copy(CourseLesson lesson, CourseLessonPracticeType practiceType) {
        m.f(lesson, "lesson");
        m.f(practiceType, "practiceType");
        return new CourseLessonClicked(lesson, practiceType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseLessonClicked)) {
            return false;
        }
        CourseLessonClicked courseLessonClicked = (CourseLessonClicked) obj;
        return m.a(this.lesson, courseLessonClicked.lesson) && this.practiceType == courseLessonClicked.practiceType;
    }

    public final CourseLesson getLesson() {
        return this.lesson;
    }

    public final CourseLessonPracticeType getPracticeType() {
        return this.practiceType;
    }

    public int hashCode() {
        return this.practiceType.hashCode() + (this.lesson.hashCode() * 31);
    }

    public String toString() {
        return "CourseLessonClicked(lesson=" + this.lesson + ", practiceType=" + this.practiceType + ")";
    }
}
