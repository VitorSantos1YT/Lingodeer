package com.lingodeer.data.model;

import com.lingodeer.database.model.LearnProgressEntity;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LearnProgressKt {
    public static final LearnProgressEntity asEntityModel(LearnProgress learnProgress) {
        m.f(learnProgress, "<this>");
        return new LearnProgressEntity(learnProgress.getLan(), learnProgress.getMain(), learnProgress.getMainTT(), learnProgress.getLessonExam(), learnProgress.getLessonStars(), learnProgress.getAudioLesson(), learnProgress.getPronun(), learnProgress.getCurrentEnteredUnitId(), learnProgress.getFlashCardPracticeCount(), learnProgress.getFlashCardDisplayIn(), learnProgress.getFlashCardFocusUnit(), learnProgress.getFlashCardIsLearnChar(), learnProgress.getFlashCardIsLearnWord(), learnProgress.getFlashCardIsLearnSent(), learnProgress.getFlashCardFocusNew(), learnProgress.getFlashCardFocusWeak(), learnProgress.getFlashCardFocusGood(), learnProgress.getFlashCardFocusPerfect(), learnProgress.getReviewFilterMethodChar(), learnProgress.getReviewFilterMethodWord(), learnProgress.getReviewFilterMethodSent(), learnProgress.getReviewPracticeModelChar(), learnProgress.getReviewPracticeModelWord(), learnProgress.getReviewPracticeModelSent(), learnProgress.getReviewSelectRecordChar(), learnProgress.getReviewSelectRecordWord(), learnProgress.getReviewSelectRecordSent(), learnProgress.getAckEnterPos(), learnProgress.getAckUnitId(), learnProgress.getRestartTimestamp(), learnProgress.getPendingUpdate());
    }

    public static final LearnProgress asExternalModel(LearnProgressEntity learnProgressEntity) {
        m.f(learnProgressEntity, "<this>");
        return new LearnProgress(learnProgressEntity.getLan(), learnProgressEntity.getMain(), learnProgressEntity.getMainTT(), learnProgressEntity.getLessonExam(), learnProgressEntity.getLessonStars(), learnProgressEntity.getAudioLesson(), learnProgressEntity.getPronun(), learnProgressEntity.getRestartTimestamp(), learnProgressEntity.getCurrentEnteredUnitId(), learnProgressEntity.getFlashCardPracticeCount(), learnProgressEntity.getFlashCardDisplayIn(), learnProgressEntity.getFlashCardFocusUnit(), learnProgressEntity.getFlashCardIsLearnChar(), learnProgressEntity.getFlashCardIsLearnWord(), learnProgressEntity.getFlashCardIsLearnSent(), learnProgressEntity.getFlashCardFocusNew(), learnProgressEntity.getFlashCardFocusWeak(), learnProgressEntity.getFlashCardFocusGood(), learnProgressEntity.getFlashCardFocusPerfect(), learnProgressEntity.getReviewFilterMethodChar(), learnProgressEntity.getReviewFilterMethodWord(), learnProgressEntity.getReviewFilterMethodSent(), learnProgressEntity.getReviewPracticeModelChar(), learnProgressEntity.getReviewPracticeModelWord(), learnProgressEntity.getReviewPracticeModelSent(), learnProgressEntity.getReviewSelectRecordChar(), learnProgressEntity.getReviewSelectRecordWord(), learnProgressEntity.getReviewSelectRecordSent(), learnProgressEntity.getAckEnterPos(), (int) learnProgressEntity.getAckUnitId(), learnProgressEntity.getPendingUpdate());
    }
}
