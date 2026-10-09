package com.lingodeer.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.d;
import defpackage.e;
import ep.a;
import kotlin.jvm.internal.m;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ReviewStatus implements Parcelable {
    public static final Parcelable.Creator<ReviewStatus> CREATOR = new Creator();
    private final long elemId;
    private final int elemType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22320id;
    private final long lastStudyTime;
    private final String status;
    private final long unitId;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Creator implements Parcelable.Creator<ReviewStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReviewStatus createFromParcel(Parcel parcel) {
            m.f(parcel, "parcel");
            return new ReviewStatus(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReviewStatus[] newArray(int i11) {
            return new ReviewStatus[i11];
        }
    }

    public ReviewStatus(String id2, long j11, long j12, int i11, long j13, String status) {
        m.f(id2, "id");
        m.f(status, "status");
        this.f22320id = id2;
        this.unitId = j11;
        this.elemId = j12;
        this.elemType = i11;
        this.lastStudyTime = j13;
        this.status = status;
    }

    public static /* synthetic */ ReviewStatus copy$default(ReviewStatus reviewStatus, String str, long j11, long j12, int i11, long j13, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = reviewStatus.f22320id;
        }
        if ((i12 & 2) != 0) {
            j11 = reviewStatus.unitId;
        }
        if ((i12 & 4) != 0) {
            j12 = reviewStatus.elemId;
        }
        if ((i12 & 8) != 0) {
            i11 = reviewStatus.elemType;
        }
        if ((i12 & 16) != 0) {
            j13 = reviewStatus.lastStudyTime;
        }
        if ((i12 & 32) != 0) {
            str2 = reviewStatus.status;
        }
        int i13 = i11;
        long j14 = j12;
        return reviewStatus.copy(str, j11, j14, i13, j13, str2);
    }

    public final String component1() {
        return this.f22320id;
    }

    public final long component2() {
        return this.unitId;
    }

    public final long component3() {
        return this.elemId;
    }

    public final int component4() {
        return this.elemType;
    }

    public final long component5() {
        return this.lastStudyTime;
    }

    public final String component6() {
        return this.status;
    }

    public final ReviewStatus copy(String id2, long j11, long j12, int i11, long j13, String status) {
        m.f(id2, "id");
        m.f(status, "status");
        return new ReviewStatus(id2, j11, j12, i11, j13, status);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewStatus)) {
            return false;
        }
        ReviewStatus reviewStatus = (ReviewStatus) obj;
        return m.a(this.f22320id, reviewStatus.f22320id) && this.unitId == reviewStatus.unitId && this.elemId == reviewStatus.elemId && this.elemType == reviewStatus.elemType && this.lastStudyTime == reviewStatus.lastStudyTime && m.a(this.status, reviewStatus.status);
    }

    public final long getElemId() {
        return this.elemId;
    }

    public final int getElemType() {
        return this.elemType;
    }

    public final String getId() {
        return this.f22320id;
    }

    public final long getLastStudyTime() {
        return this.lastStudyTime;
    }

    public final String getStatus() {
        return this.status;
    }

    public final long getUnitId() {
        return this.unitId;
    }

    public int hashCode() {
        return this.status.hashCode() + e.f(this.lastStudyTime, e.b(this.elemType, e.f(this.elemId, e.f(this.unitId, this.f22320id.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toRecord() {
        return this.f22320id + ":" + this.unitId + ":" + this.lastStudyTime + ":" + this.status;
    }

    public String toString() {
        String str = this.f22320id;
        long j11 = this.unitId;
        long j12 = this.elemId;
        int i11 = this.elemType;
        long j13 = this.lastStudyTime;
        String str2 = this.status;
        StringBuilder sbM = d.m(j11, "ReviewStatus(id=", str, ", unitId=");
        a.y(j12, ", elemId=", ", elemType=", sbM);
        sbM.append(i11);
        sbM.append(", lastStudyTime=");
        sbM.append(j13);
        return p.u(sbM, ", status=", str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        m.f(dest, "dest");
        dest.writeString(this.f22320id);
        dest.writeLong(this.unitId);
        dest.writeLong(this.elemId);
        dest.writeInt(this.elemType);
        dest.writeLong(this.lastStudyTime);
        dest.writeString(this.status);
    }
}
