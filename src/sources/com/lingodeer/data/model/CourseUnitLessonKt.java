package com.lingodeer.data.model;

import com.tbruyelle.rxpermissions3.BuildConfig;
import kotlin.jvm.internal.m;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseUnitLessonKt {
    public static final CourseLesson fallbackCourseLesson(long j11) {
        return new CourseLesson(j11, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, 0, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, -1L, null, 0, false, false, false, null, false, false, false, 0, null, null, null, 33550336, null);
    }

    public static final boolean isFallbackLesson(CourseLesson courseLesson) {
        m.f(courseLesson, "<this>");
        return courseLesson.getUnitId() == -1 && q.K0(courseLesson.getLessonName()) && q.K0(courseLesson.getDescription()) && courseLesson.getSortIndex() == 0 && q.K0(courseLesson.getNormalRegex()) && q.K0(courseLesson.getLastRegex()) && q.K0(courseLesson.getRepeatRegex()) && q.K0(courseLesson.getChallengeRegex()) && q.K0(courseLesson.getWordList()) && q.K0(courseLesson.getSentenceList()) && q.K0(courseLesson.getCharacterList());
    }
}
