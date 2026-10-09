package com.lingodeer.database.model;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.material.datepicker.d;
import defpackage.e;
import ep.a;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class SRSStatusEntity {
    private final float easeFactor;
    private final long elemId;
    private final int elemType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22383id;
    private final long interval;
    private final int isReviewed;
    private final String lan;
    private final int lapses;
    private final int lastHighSoEasyCount;
    private final long lastModifierTime;
    private final long lastReviewTime;
    private final int lastStudyStatus;
    private final long lastStudyTime;
    private final int learningStep;
    private final long nextReviewTime;
    private final boolean pendingUpdate;
    private final int reviewVisibilityMode;
    private final int soEasyCount;
    private final int status;
    private final String type;
    private final long unitId;

    public SRSStatusEntity(String id2, long j11, long j12, int i11, String lan, String type, long j13, int i12, int i13, int i14, long j14, long j15, long j16, float f5, int i15, int i16, int i17, int i18, long j17, boolean z11, int i19) {
        m.f(id2, "id");
        m.f(lan, "lan");
        m.f(type, "type");
        this.f22383id = id2;
        this.unitId = j11;
        this.elemId = j12;
        this.elemType = i11;
        this.lan = lan;
        this.type = type;
        this.lastStudyTime = j13;
        this.lastStudyStatus = i12;
        this.isReviewed = i13;
        this.status = i14;
        this.lastReviewTime = j14;
        this.nextReviewTime = j15;
        this.interval = j16;
        this.easeFactor = f5;
        this.learningStep = i15;
        this.lapses = i16;
        this.soEasyCount = i17;
        this.lastHighSoEasyCount = i18;
        this.lastModifierTime = j17;
        this.pendingUpdate = z11;
        this.reviewVisibilityMode = i19;
    }

    public static /* synthetic */ SRSStatusEntity copy$default(SRSStatusEntity sRSStatusEntity, String str, long j11, long j12, int i11, String str2, String str3, long j13, int i12, int i13, int i14, long j14, long j15, long j16, float f5, int i15, int i16, int i17, int i18, long j17, boolean z11, int i19, int i21, Object obj) {
        String str4 = (i21 & 1) != 0 ? sRSStatusEntity.f22383id : str;
        long j18 = (i21 & 2) != 0 ? sRSStatusEntity.unitId : j11;
        long j19 = (i21 & 4) != 0 ? sRSStatusEntity.elemId : j12;
        int i22 = (i21 & 8) != 0 ? sRSStatusEntity.elemType : i11;
        String str5 = (i21 & 16) != 0 ? sRSStatusEntity.lan : str2;
        String str6 = (i21 & 32) != 0 ? sRSStatusEntity.type : str3;
        long j21 = (i21 & 64) != 0 ? sRSStatusEntity.lastStudyTime : j13;
        int i23 = (i21 & 128) != 0 ? sRSStatusEntity.lastStudyStatus : i12;
        int i24 = (i21 & 256) != 0 ? sRSStatusEntity.isReviewed : i13;
        int i25 = (i21 & 512) != 0 ? sRSStatusEntity.status : i14;
        String str7 = str4;
        long j22 = (i21 & 1024) != 0 ? sRSStatusEntity.lastReviewTime : j14;
        long j23 = (i21 & 2048) != 0 ? sRSStatusEntity.nextReviewTime : j15;
        long j24 = (i21 & 4096) != 0 ? sRSStatusEntity.interval : j16;
        return sRSStatusEntity.copy(str7, j18, j19, i22, str5, str6, j21, i23, i24, i25, j22, j23, j24, (i21 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? sRSStatusEntity.easeFactor : f5, (i21 & 16384) != 0 ? sRSStatusEntity.learningStep : i15, (32768 & i21) != 0 ? sRSStatusEntity.lapses : i16, (i21 & 65536) != 0 ? sRSStatusEntity.soEasyCount : i17, (i21 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? sRSStatusEntity.lastHighSoEasyCount : i18, (i21 & 262144) != 0 ? sRSStatusEntity.lastModifierTime : j17, (i21 & 524288) != 0 ? sRSStatusEntity.pendingUpdate : z11, (i21 & 1048576) != 0 ? sRSStatusEntity.reviewVisibilityMode : i19);
    }

    public final String component1() {
        return this.f22383id;
    }

    public final int component10() {
        return this.status;
    }

    public final long component11() {
        return this.lastReviewTime;
    }

    public final long component12() {
        return this.nextReviewTime;
    }

    public final long component13() {
        return this.interval;
    }

    public final float component14() {
        return this.easeFactor;
    }

    public final int component15() {
        return this.learningStep;
    }

    public final int component16() {
        return this.lapses;
    }

    public final int component17() {
        return this.soEasyCount;
    }

    public final int component18() {
        return this.lastHighSoEasyCount;
    }

    public final long component19() {
        return this.lastModifierTime;
    }

    public final long component2() {
        return this.unitId;
    }

    public final boolean component20() {
        return this.pendingUpdate;
    }

    public final int component21() {
        return this.reviewVisibilityMode;
    }

    public final long component3() {
        return this.elemId;
    }

    public final int component4() {
        return this.elemType;
    }

    public final String component5() {
        return this.lan;
    }

    public final String component6() {
        return this.type;
    }

    public final long component7() {
        return this.lastStudyTime;
    }

    public final int component8() {
        return this.lastStudyStatus;
    }

    public final int component9() {
        return this.isReviewed;
    }

    public final SRSStatusEntity copy(String id2, long j11, long j12, int i11, String lan, String type, long j13, int i12, int i13, int i14, long j14, long j15, long j16, float f5, int i15, int i16, int i17, int i18, long j17, boolean z11, int i19) {
        m.f(id2, "id");
        m.f(lan, "lan");
        m.f(type, "type");
        return new SRSStatusEntity(id2, j11, j12, i11, lan, type, j13, i12, i13, i14, j14, j15, j16, f5, i15, i16, i17, i18, j17, z11, i19);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SRSStatusEntity)) {
            return false;
        }
        SRSStatusEntity sRSStatusEntity = (SRSStatusEntity) obj;
        return m.a(this.f22383id, sRSStatusEntity.f22383id) && this.unitId == sRSStatusEntity.unitId && this.elemId == sRSStatusEntity.elemId && this.elemType == sRSStatusEntity.elemType && m.a(this.lan, sRSStatusEntity.lan) && m.a(this.type, sRSStatusEntity.type) && this.lastStudyTime == sRSStatusEntity.lastStudyTime && this.lastStudyStatus == sRSStatusEntity.lastStudyStatus && this.isReviewed == sRSStatusEntity.isReviewed && this.status == sRSStatusEntity.status && this.lastReviewTime == sRSStatusEntity.lastReviewTime && this.nextReviewTime == sRSStatusEntity.nextReviewTime && this.interval == sRSStatusEntity.interval && Float.compare(this.easeFactor, sRSStatusEntity.easeFactor) == 0 && this.learningStep == sRSStatusEntity.learningStep && this.lapses == sRSStatusEntity.lapses && this.soEasyCount == sRSStatusEntity.soEasyCount && this.lastHighSoEasyCount == sRSStatusEntity.lastHighSoEasyCount && this.lastModifierTime == sRSStatusEntity.lastModifierTime && this.pendingUpdate == sRSStatusEntity.pendingUpdate && this.reviewVisibilityMode == sRSStatusEntity.reviewVisibilityMode;
    }

    public final float getEaseFactor() {
        return this.easeFactor;
    }

    public final long getElemId() {
        return this.elemId;
    }

    public final int getElemType() {
        return this.elemType;
    }

    public final String getId() {
        return this.f22383id;
    }

    public final long getInterval() {
        return this.interval;
    }

    public final String getLan() {
        return this.lan;
    }

    public final int getLapses() {
        return this.lapses;
    }

    public final int getLastHighSoEasyCount() {
        return this.lastHighSoEasyCount;
    }

    public final long getLastModifierTime() {
        return this.lastModifierTime;
    }

    public final long getLastReviewTime() {
        return this.lastReviewTime;
    }

    public final int getLastStudyStatus() {
        return this.lastStudyStatus;
    }

    public final long getLastStudyTime() {
        return this.lastStudyTime;
    }

    public final int getLearningStep() {
        return this.learningStep;
    }

    public final long getNextReviewTime() {
        return this.nextReviewTime;
    }

    public final boolean getPendingUpdate() {
        return this.pendingUpdate;
    }

    public final int getReviewVisibilityMode() {
        return this.reviewVisibilityMode;
    }

    public final int getSoEasyCount() {
        return this.soEasyCount;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public final long getUnitId() {
        return this.unitId;
    }

    public int hashCode() {
        return Integer.hashCode(this.reviewVisibilityMode) + e.e(e.f(this.lastModifierTime, e.b(this.lastHighSoEasyCount, e.b(this.soEasyCount, e.b(this.lapses, e.b(this.learningStep, e.a(e.f(this.interval, e.f(this.nextReviewTime, e.f(this.lastReviewTime, e.b(this.status, e.b(this.isReviewed, e.b(this.lastStudyStatus, e.f(this.lastStudyTime, e.d(e.d(e.b(this.elemType, e.f(this.elemId, e.f(this.unitId, this.f22383id.hashCode() * 31, 31), 31), 31), 31, this.lan), 31, this.type), 31), 31), 31), 31), 31), 31), 31), this.easeFactor, 31), 31), 31), 31), 31), 31), 31, this.pendingUpdate);
    }

    public final int isReviewed() {
        return this.isReviewed;
    }

    public String toString() {
        String str = this.f22383id;
        long j11 = this.unitId;
        long j12 = this.elemId;
        int i11 = this.elemType;
        String str2 = this.lan;
        String str3 = this.type;
        long j13 = this.lastStudyTime;
        int i12 = this.lastStudyStatus;
        int i13 = this.isReviewed;
        int i14 = this.status;
        long j14 = this.lastReviewTime;
        long j15 = this.nextReviewTime;
        long j16 = this.interval;
        float f5 = this.easeFactor;
        int i15 = this.learningStep;
        int i16 = this.lapses;
        int i17 = this.soEasyCount;
        int i18 = this.lastHighSoEasyCount;
        long j17 = this.lastModifierTime;
        boolean z11 = this.pendingUpdate;
        int i19 = this.reviewVisibilityMode;
        StringBuilder sbM = d.m(j11, "SRSStatusEntity(id=", str, ", unitId=");
        a.y(j12, ", elemId=", ", elemType=", sbM);
        sbM.append(i11);
        sbM.append(", lan=");
        sbM.append(str2);
        sbM.append(", type=");
        sbM.append(str3);
        sbM.append(", lastStudyTime=");
        sbM.append(j13);
        c.t(i12, i13, ", lastStudyStatus=", ", isReviewed=", sbM);
        sbM.append(", status=");
        sbM.append(i14);
        sbM.append(", lastReviewTime=");
        sbM.append(j14);
        a.y(j15, ", nextReviewTime=", ", interval=", sbM);
        sbM.append(j16);
        sbM.append(", easeFactor=");
        sbM.append(f5);
        c.t(i15, i16, ", learningStep=", ", lapses=", sbM);
        c.t(i17, i18, ", soEasyCount=", ", lastHighSoEasyCount=", sbM);
        a.y(j17, ", lastModifierTime=", ", pendingUpdate=", sbM);
        sbM.append(z11);
        sbM.append(", reviewVisibilityMode=");
        sbM.append(i19);
        sbM.append(")");
        return sbM.toString();
    }

    public /* synthetic */ SRSStatusEntity(String str, long j11, long j12, int i11, String str2, String str3, long j13, int i12, int i13, int i14, long j14, long j15, long j16, float f5, int i15, int i16, int i17, int i18, long j17, boolean z11, int i19, int i21, f fVar) {
        this(str, j11, j12, i11, str2, str3, j13, i12, i13, i14, j14, j15, j16, f5, i15, i16, i17, i18, j17, z11, (i21 & 1048576) != 0 ? 0 : i19);
    }
}
