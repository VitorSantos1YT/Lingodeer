package com.lingodeer.data.model;

import com.lingodeer.database.model.LessonTestProgressEntity;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LessonTestProgressKt {
    public static final LessonTestProgressEntity asEntityModel(LessonTestProgress lessonTestProgress) {
        m.f(lessonTestProgress, "<this>");
        return new LessonTestProgressEntity(lessonTestProgress.getId(), lessonTestProgress.getLearnProgress(), lessonTestProgress.getRedoProgress(), lessonTestProgress.getPracticeListeningProgress(), lessonTestProgress.getPracticeSpeakingProgress(), lessonTestProgress.getPracticeSpellingProgress(), lessonTestProgress.getPracticeComprehensiveProgress());
    }

    public static final LessonTestProgress asExternalModel(LessonTestProgressEntity lessonTestProgressEntity) {
        m.f(lessonTestProgressEntity, "<this>");
        return new LessonTestProgress(lessonTestProgressEntity.getId(), lessonTestProgressEntity.getLearnProgress(), lessonTestProgressEntity.getRedoProgress(), lessonTestProgressEntity.getPracticeListeningProgress(), lessonTestProgressEntity.getPracticeSpeakingProgress(), lessonTestProgressEntity.getPracticeSpellingProgress(), lessonTestProgressEntity.getPracticeComprehensiveProgress());
    }
}
