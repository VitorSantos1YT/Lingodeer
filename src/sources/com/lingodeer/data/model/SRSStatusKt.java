package com.lingodeer.data.model;

import com.lingodeer.database.model.SRSStatusEntity;
import kotlin.jvm.internal.m;
import wt.n;
import wt.o;
import wt.r;
import wt.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class SRSStatusKt {
    private static final int CHARACTER_ELEM_TYPE = 2;

    public static final SRSStatusEntity asEntityModel(SRSStatus sRSStatus) {
        m.f(sRSStatus, "<this>");
        String id2 = sRSStatus.getId();
        long unitId = sRSStatus.getUnitId();
        long elemId = sRSStatus.getElemId();
        int elemType = sRSStatus.getElemType();
        String lan = sRSStatus.getLan();
        String type = sRSStatus.getType();
        long lastStudyTime = sRSStatus.getLastStudyTime();
        int iB = sRSStatus.getLastStudyStatus().b();
        boolean zIsReviewed = sRSStatus.isReviewed();
        return new SRSStatusEntity(id2, unitId, elemId, elemType, lan, type, lastStudyTime, iB, zIsReviewed ? 1 : 0, sRSStatus.getStatus().b(), sRSStatus.getLastReviewTime(), sRSStatus.getNextReviewTime(), sRSStatus.getInterval(), sRSStatus.getEaseFactor(), sRSStatus.getLearningStep(), sRSStatus.getLapses(), sRSStatus.getSoEasyCount(), sRSStatus.getLastHighSoEasyCount(), sRSStatus.getLastModifierTime(), sRSStatus.getPendingUpdate(), sRSStatus.getReviewVisibilityMode().getValue());
    }

    public static final SRSStatus asExternalModel(SRSStatusEntity sRSStatusEntity) {
        m.f(sRSStatusEntity, "<this>");
        String id2 = sRSStatusEntity.getId();
        long unitId = sRSStatusEntity.getUnitId();
        long elemId = sRSStatusEntity.getElemId();
        int elemType = sRSStatusEntity.getElemType();
        String lan = sRSStatusEntity.getLan();
        String type = sRSStatusEntity.getType();
        long lastStudyTime = sRSStatusEntity.getLastStudyTime();
        n nVar = o.Companion;
        int lastStudyStatus = sRSStatusEntity.getLastStudyStatus();
        nVar.getClass();
        o oVarA = n.a(lastStudyStatus);
        boolean z11 = sRSStatusEntity.isReviewed() == 1;
        r rVar = s.Companion;
        int status = sRSStatusEntity.getStatus();
        rVar.getClass();
        return new SRSStatus(id2, unitId, elemId, elemType, lan, type, lastStudyTime, oVarA, z11, r.a(status), sRSStatusEntity.getLastReviewTime(), sRSStatusEntity.getNextReviewTime(), sRSStatusEntity.getInterval(), sRSStatusEntity.getEaseFactor(), sRSStatusEntity.getLearningStep(), sRSStatusEntity.getLapses(), sRSStatusEntity.getSoEasyCount(), sRSStatusEntity.getLastHighSoEasyCount(), sRSStatusEntity.getLastModifierTime(), sRSStatusEntity.getPendingUpdate(), ReviewVisibilityMode.Companion.fromValue(sRSStatusEntity.getReviewVisibilityMode()));
    }
}
