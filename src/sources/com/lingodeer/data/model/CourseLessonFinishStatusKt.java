package com.lingodeer.data.model;

import com.lingodeer.database.model.LessonFinishStatusEntity;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseLessonFinishStatusKt {
    public static final LessonFinishStatusEntity asEntity(CourseLessonFinishStatus courseLessonFinishStatus) {
        m.f(courseLessonFinishStatus, "<this>");
        return new LessonFinishStatusEntity(courseLessonFinishStatus.getId(), courseLessonFinishStatus.getLan(), courseLessonFinishStatus.getPracticeListening(), courseLessonFinishStatus.getPracticeSpeaking(), courseLessonFinishStatus.getPracticeSpelling(), courseLessonFinishStatus.getPracticeComprehensive(), courseLessonFinishStatus.getTime(), courseLessonFinishStatus.getPendingUpdate());
    }

    public static final CourseLessonFinishStatus asExternalModel(LessonFinishStatusEntity lessonFinishStatusEntity) {
        m.f(lessonFinishStatusEntity, "<this>");
        return new CourseLessonFinishStatus(lessonFinishStatusEntity.getId(), lessonFinishStatusEntity.getLan(), lessonFinishStatusEntity.getPracticeListening(), lessonFinishStatusEntity.getPracticeSpeaking(), lessonFinishStatusEntity.getPracticeSpelling(), lessonFinishStatusEntity.getPracticeComprehensive(), lessonFinishStatusEntity.getTime(), lessonFinishStatusEntity.getPendingUpdate());
    }
}
