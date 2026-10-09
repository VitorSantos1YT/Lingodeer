package com.lingodeer.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;
import ep.a;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import w4.c;
import wt.o;
import wt.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class SRSStatus implements Parcelable {
    public static final Parcelable.Creator<SRSStatus> CREATOR = new Creator();
    private float easeFactor;
    private final long elemId;
    private final int elemType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22321id;
    private long interval;
    private boolean isReviewed;
    private final String lan;
    private int lapses;
    private int lastHighSoEasyCount;
    private long lastModifierTime;
    private long lastReviewTime;
    private final o lastStudyStatus;
    private final long lastStudyTime;
    private int learningStep;
    private long nextReviewTime;
    private final boolean pendingUpdate;
    private final ReviewVisibilityMode reviewVisibilityMode;
    private int soEasyCount;
    private s status;
    private final String type;
    private final long unitId;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Creator implements Parcelable.Creator<SRSStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SRSStatus createFromParcel(Parcel parcel) {
            m.f(parcel, "parcel");
            String string = parcel.readString();
            long j11 = parcel.readLong();
            long j12 = parcel.readLong();
            int i11 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            long j13 = parcel.readLong();
            o oVarValueOf = o.valueOf(parcel.readString());
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            s sVarValueOf = s.valueOf(parcel.readString());
            long j14 = parcel.readLong();
            long j15 = parcel.readLong();
            long j16 = parcel.readLong();
            float f5 = parcel.readFloat();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            boolean z12 = true;
            long j17 = parcel.readLong();
            if (parcel.readInt() == 0) {
                z12 = false;
            }
            return new SRSStatus(string, j11, j12, i11, string2, string3, j13, oVarValueOf, z11, sVarValueOf, j14, j15, j16, f5, i12, i13, i14, i15, j17, z12, ReviewVisibilityMode.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SRSStatus[] newArray(int i11) {
            return new SRSStatus[i11];
        }
    }

    public SRSStatus(String id2, long j11, long j12, int i11, String lan, String type, long j13, o lastStudyStatus, boolean z11, s status, long j14, long j15, long j16, float f5, int i12, int i13, int i14, int i15, long j17, boolean z12, ReviewVisibilityMode reviewVisibilityMode) {
        m.f(id2, "id");
        m.f(lan, "lan");
        m.f(type, "type");
        m.f(lastStudyStatus, "lastStudyStatus");
        m.f(status, "status");
        m.f(reviewVisibilityMode, "reviewVisibilityMode");
        this.f22321id = id2;
        this.unitId = j11;
        this.elemId = j12;
        this.elemType = i11;
        this.lan = lan;
        this.type = type;
        this.lastStudyTime = j13;
        this.lastStudyStatus = lastStudyStatus;
        this.isReviewed = z11;
        this.status = status;
        this.lastReviewTime = j14;
        this.nextReviewTime = j15;
        this.interval = j16;
        this.easeFactor = f5;
        this.learningStep = i12;
        this.lapses = i13;
        this.soEasyCount = i14;
        this.lastHighSoEasyCount = i15;
        this.lastModifierTime = j17;
        this.pendingUpdate = z12;
        this.reviewVisibilityMode = reviewVisibilityMode;
    }

    public static /* synthetic */ SRSStatus copy$default(SRSStatus sRSStatus, String str, long j11, long j12, int i11, String str2, String str3, long j13, o oVar, boolean z11, s sVar, long j14, long j15, long j16, float f5, int i12, int i13, int i14, int i15, long j17, boolean z12, ReviewVisibilityMode reviewVisibilityMode, int i16, Object obj) {
        String str4 = (i16 & 1) != 0 ? sRSStatus.f22321id : str;
        long j18 = (i16 & 2) != 0 ? sRSStatus.unitId : j11;
        long j19 = (i16 & 4) != 0 ? sRSStatus.elemId : j12;
        int i17 = (i16 & 8) != 0 ? sRSStatus.elemType : i11;
        String str5 = (i16 & 16) != 0 ? sRSStatus.lan : str2;
        String str6 = (i16 & 32) != 0 ? sRSStatus.type : str3;
        long j21 = (i16 & 64) != 0 ? sRSStatus.lastStudyTime : j13;
        o oVar2 = (i16 & 128) != 0 ? sRSStatus.lastStudyStatus : oVar;
        boolean z13 = (i16 & 256) != 0 ? sRSStatus.isReviewed : z11;
        s sVar2 = (i16 & 512) != 0 ? sRSStatus.status : sVar;
        String str7 = str4;
        long j22 = (i16 & 1024) != 0 ? sRSStatus.lastReviewTime : j14;
        long j23 = (i16 & 2048) != 0 ? sRSStatus.nextReviewTime : j15;
        long j24 = (i16 & 4096) != 0 ? sRSStatus.interval : j16;
        return sRSStatus.copy(str7, j18, j19, i17, str5, str6, j21, oVar2, z13, sVar2, j22, j23, j24, (i16 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? sRSStatus.easeFactor : f5, (i16 & 16384) != 0 ? sRSStatus.learningStep : i12, (32768 & i16) != 0 ? sRSStatus.lapses : i13, (i16 & 65536) != 0 ? sRSStatus.soEasyCount : i14, (i16 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? sRSStatus.lastHighSoEasyCount : i15, (i16 & 262144) != 0 ? sRSStatus.lastModifierTime : j17, (i16 & 524288) != 0 ? sRSStatus.pendingUpdate : z12, (i16 & 1048576) != 0 ? sRSStatus.reviewVisibilityMode : reviewVisibilityMode);
    }

    public final String component1() {
        return this.f22321id;
    }

    public final s component10() {
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

    public final ReviewVisibilityMode component21() {
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

    public final o component8() {
        return this.lastStudyStatus;
    }

    public final boolean component9() {
        return this.isReviewed;
    }

    public final SRSStatus copy(String id2, long j11, long j12, int i11, String lan, String type, long j13, o lastStudyStatus, boolean z11, s status, long j14, long j15, long j16, float f5, int i12, int i13, int i14, int i15, long j17, boolean z12, ReviewVisibilityMode reviewVisibilityMode) {
        m.f(id2, "id");
        m.f(lan, "lan");
        m.f(type, "type");
        m.f(lastStudyStatus, "lastStudyStatus");
        m.f(status, "status");
        m.f(reviewVisibilityMode, "reviewVisibilityMode");
        return new SRSStatus(id2, j11, j12, i11, lan, type, j13, lastStudyStatus, z11, status, j14, j15, j16, f5, i12, i13, i14, i15, j17, z12, reviewVisibilityMode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SRSStatus)) {
            return false;
        }
        SRSStatus sRSStatus = (SRSStatus) obj;
        return m.a(this.f22321id, sRSStatus.f22321id) && this.unitId == sRSStatus.unitId && this.elemId == sRSStatus.elemId && this.elemType == sRSStatus.elemType && m.a(this.lan, sRSStatus.lan) && m.a(this.type, sRSStatus.type) && this.lastStudyTime == sRSStatus.lastStudyTime && this.lastStudyStatus == sRSStatus.lastStudyStatus && this.isReviewed == sRSStatus.isReviewed && this.status == sRSStatus.status && this.lastReviewTime == sRSStatus.lastReviewTime && this.nextReviewTime == sRSStatus.nextReviewTime && this.interval == sRSStatus.interval && Float.compare(this.easeFactor, sRSStatus.easeFactor) == 0 && this.learningStep == sRSStatus.learningStep && this.lapses == sRSStatus.lapses && this.soEasyCount == sRSStatus.soEasyCount && this.lastHighSoEasyCount == sRSStatus.lastHighSoEasyCount && this.lastModifierTime == sRSStatus.lastModifierTime && this.pendingUpdate == sRSStatus.pendingUpdate && this.reviewVisibilityMode == sRSStatus.reviewVisibilityMode;
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
        return this.f22321id;
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

    public final o getLastStudyStatus() {
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

    public final String getPracticeMetaData() {
        long j11 = this.lastStudyTime;
        int iB = this.lastStudyStatus.b();
        boolean z11 = this.isReviewed;
        return j11 + ":" + iB + ":" + (z11 ? 1 : 0) + ":" + this.unitId;
    }

    public final ReviewVisibilityMode getReviewVisibilityMode() {
        return this.reviewVisibilityMode;
    }

    public final String getSRSMetaData() {
        if (this.lastStudyTime == 0 && !isExcludedFromReview()) {
            return BuildConfig.VERSION_NAME;
        }
        long j11 = this.lastReviewTime;
        long j12 = this.nextReviewTime;
        int iB = this.status.b();
        int i11 = this.soEasyCount;
        int i12 = this.lastHighSoEasyCount;
        int i13 = this.learningStep;
        float f5 = this.easeFactor;
        long j13 = this.interval;
        int i14 = this.lapses;
        int value = this.reviewVisibilityMode.getValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j11);
        sb2.append(":");
        sb2.append(j12);
        c.t(iB, i11, ":", ":hs-", sb2);
        c.t(i12, i13, "-", "#sm2-", sb2);
        sb2.append("-");
        sb2.append(f5);
        sb2.append("-");
        sb2.append(j13);
        sb2.append("-");
        sb2.append(i14);
        return e.g(value, "#rvm-", sb2);
    }

    public final int getSoEasyCount() {
        return this.soEasyCount;
    }

    public final s getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public final long getUnitId() {
        return this.unitId;
    }

    public int hashCode() {
        return this.reviewVisibilityMode.hashCode() + e.e(e.f(this.lastModifierTime, e.b(this.lastHighSoEasyCount, e.b(this.soEasyCount, e.b(this.lapses, e.b(this.learningStep, e.a(e.f(this.interval, e.f(this.nextReviewTime, e.f(this.lastReviewTime, (this.status.hashCode() + e.e((this.lastStudyStatus.hashCode() + e.f(this.lastStudyTime, e.d(e.d(e.b(this.elemType, e.f(this.elemId, e.f(this.unitId, this.f22321id.hashCode() * 31, 31), 31), 31), 31, this.lan), 31, this.type), 31)) * 31, 31, this.isReviewed)) * 31, 31), 31), 31), this.easeFactor, 31), 31), 31), 31), 31), 31), 31, this.pendingUpdate);
    }

    public final boolean isExcludedFromReview() {
        return this.reviewVisibilityMode.isExcludedFromReview(this.elemType);
    }

    public final boolean isReviewed() {
        return this.isReviewed;
    }

    public final void setEaseFactor(float f5) {
        this.easeFactor = f5;
    }

    public final void setInterval(long j11) {
        this.interval = j11;
    }

    public final void setLapses(int i11) {
        this.lapses = i11;
    }

    public final void setLastHighSoEasyCount(int i11) {
        this.lastHighSoEasyCount = i11;
    }

    public final void setLastModifierTime(long j11) {
        this.lastModifierTime = j11;
    }

    public final void setLastReviewTime(long j11) {
        this.lastReviewTime = j11;
    }

    public final void setLearningStep(int i11) {
        this.learningStep = i11;
    }

    public final void setNextReviewTime(long j11) {
        this.nextReviewTime = j11;
    }

    public final void setReviewed(boolean z11) {
        this.isReviewed = z11;
    }

    public final void setSoEasyCount(int i11) {
        this.soEasyCount = i11;
    }

    public final void setStatus(s sVar) {
        m.f(sVar, "<set-?>");
        this.status = sVar;
    }

    public String toString() {
        String str = this.f22321id;
        long j11 = this.unitId;
        long j12 = this.elemId;
        int i11 = this.elemType;
        String str2 = this.lan;
        String str3 = this.type;
        long j13 = this.lastStudyTime;
        o oVar = this.lastStudyStatus;
        boolean z11 = this.isReviewed;
        s sVar = this.status;
        long j14 = this.lastReviewTime;
        long j15 = this.nextReviewTime;
        long j16 = this.interval;
        float f5 = this.easeFactor;
        int i12 = this.learningStep;
        int i13 = this.lapses;
        int i14 = this.soEasyCount;
        int i15 = this.lastHighSoEasyCount;
        long j17 = this.lastModifierTime;
        boolean z12 = this.pendingUpdate;
        ReviewVisibilityMode reviewVisibilityMode = this.reviewVisibilityMode;
        StringBuilder sbM = d.m(j11, "SRSStatus(id=", str, ", unitId=");
        a.y(j12, ", elemId=", ", elemType=", sbM);
        sbM.append(i11);
        sbM.append(", lan=");
        sbM.append(str2);
        sbM.append(", type=");
        sbM.append(str3);
        sbM.append(", lastStudyTime=");
        sbM.append(j13);
        sbM.append(", lastStudyStatus=");
        sbM.append(oVar);
        sbM.append(", isReviewed=");
        sbM.append(z11);
        sbM.append(", status=");
        sbM.append(sVar);
        sbM.append(", lastReviewTime=");
        sbM.append(j14);
        a.y(j15, ", nextReviewTime=", ", interval=", sbM);
        sbM.append(j16);
        sbM.append(", easeFactor=");
        sbM.append(f5);
        c.t(i12, i13, ", learningStep=", ", lapses=", sbM);
        c.t(i14, i15, ", soEasyCount=", ", lastHighSoEasyCount=", sbM);
        a.y(j17, ", lastModifierTime=", ", pendingUpdate=", sbM);
        sbM.append(z12);
        sbM.append(", reviewVisibilityMode=");
        sbM.append(reviewVisibilityMode);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        m.f(dest, "dest");
        dest.writeString(this.f22321id);
        dest.writeLong(this.unitId);
        dest.writeLong(this.elemId);
        dest.writeInt(this.elemType);
        dest.writeString(this.lan);
        dest.writeString(this.type);
        dest.writeLong(this.lastStudyTime);
        dest.writeString(this.lastStudyStatus.name());
        dest.writeInt(this.isReviewed ? 1 : 0);
        dest.writeString(this.status.name());
        dest.writeLong(this.lastReviewTime);
        dest.writeLong(this.nextReviewTime);
        dest.writeLong(this.interval);
        dest.writeFloat(this.easeFactor);
        dest.writeInt(this.learningStep);
        dest.writeInt(this.lapses);
        dest.writeInt(this.soEasyCount);
        dest.writeInt(this.lastHighSoEasyCount);
        dest.writeLong(this.lastModifierTime);
        dest.writeInt(this.pendingUpdate ? 1 : 0);
        dest.writeString(this.reviewVisibilityMode.name());
    }

    public /* synthetic */ SRSStatus(String str, long j11, long j12, int i11, String str2, String str3, long j13, o oVar, boolean z11, s sVar, long j14, long j15, long j16, float f5, int i12, int i13, int i14, int i15, long j17, boolean z12, ReviewVisibilityMode reviewVisibilityMode, int i16, f fVar) {
        this(str, j11, j12, i11, str2, str3, j13, oVar, z11, sVar, j14, j15, j16, f5, i12, i13, i14, i15, j17, z12, (i16 & 1048576) != 0 ? ReviewVisibilityMode.DEFAULT : reviewVisibilityMode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SRSStatus(String id2, long j11, long j12, int i11, String lan, String type, long j13, o lastStudyStatus) {
        this(id2, j11, j12, i11, lan, type, j13, lastStudyStatus, false, s.NEW, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, j13, true, null, 1048576, null);
        m.f(id2, "id");
        m.f(lan, "lan");
        m.f(type, "type");
        m.f(lastStudyStatus, "lastStudyStatus");
    }
}
