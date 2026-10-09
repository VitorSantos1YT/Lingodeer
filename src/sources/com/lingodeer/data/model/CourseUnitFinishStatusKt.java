package com.lingodeer.data.model;

import com.lingodeer.database.model.UnitFinishStatusEntity;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseUnitFinishStatusKt {
    public static final UnitFinishStatusEntity asEntityModel(CourseUnitFinishStatus courseUnitFinishStatus) {
        m.f(courseUnitFinishStatus, "<this>");
        return new UnitFinishStatusEntity(courseUnitFinishStatus.getId(), courseUnitFinishStatus.getLan(), courseUnitFinishStatus.getCurEnterLessonIndex(), courseUnitFinishStatus.getStoryReading(), courseUnitFinishStatus.getStorySpeaking(), courseUnitFinishStatus.getTipsReading(), courseUnitFinishStatus.getDialogWarmUp(), courseUnitFinishStatus.getDialogPractice(), courseUnitFinishStatus.getDialogSpeaking(), courseUnitFinishStatus.getTime(), courseUnitFinishStatus.getPendingUpdate());
    }

    public static final CourseUnitFinishStatus asExternalModel(UnitFinishStatusEntity unitFinishStatusEntity) {
        m.f(unitFinishStatusEntity, "<this>");
        return new CourseUnitFinishStatus(unitFinishStatusEntity.getId(), unitFinishStatusEntity.getLan(), unitFinishStatusEntity.getCurEnterLessonIndex(), unitFinishStatusEntity.getStoryReading(), unitFinishStatusEntity.getStorySpeaking(), unitFinishStatusEntity.getTipsReading(), unitFinishStatusEntity.getDialogWarmUp(), unitFinishStatusEntity.getDialogPractice(), unitFinishStatusEntity.getDialogSpeaking(), unitFinishStatusEntity.getTime(), unitFinishStatusEntity.getPendingUpdate());
    }
}
