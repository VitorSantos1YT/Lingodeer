package com.lingodeer.database.model;

import com.google.android.material.datepicker.d;
import com.google.type.bACG.scNRoQgKSYX;
import defpackage.e;
import ep.a;
import kotlin.jvm.internal.m;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ReviewStatusEntity {
    private final long elemId;
    private final int elemType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22382id;
    private final long lastStudyTime;
    private final String status;
    private final long unitId;

    public static /* synthetic */ ReviewStatusEntity copy$default(ReviewStatusEntity reviewStatusEntity, String str, long j11, long j12, int i11, long j13, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = reviewStatusEntity.f22382id;
        }
        if ((i12 & 2) != 0) {
            j11 = reviewStatusEntity.unitId;
        }
        if ((i12 & 4) != 0) {
            j12 = reviewStatusEntity.elemId;
        }
        if ((i12 & 8) != 0) {
            i11 = reviewStatusEntity.elemType;
        }
        if ((i12 & 16) != 0) {
            j13 = reviewStatusEntity.lastStudyTime;
        }
        if ((i12 & 32) != 0) {
            str2 = reviewStatusEntity.status;
        }
        int i13 = i11;
        long j14 = j12;
        return reviewStatusEntity.copy(str, j11, j14, i13, j13, str2);
    }

    public final String component1() {
        return this.f22382id;
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

    public final ReviewStatusEntity copy(String id2, long j11, long j12, int i11, long j13, String status) {
        m.f(id2, "id");
        m.f(status, "status");
        return new ReviewStatusEntity(id2, j11, j12, i11, j13, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewStatusEntity)) {
            return false;
        }
        ReviewStatusEntity reviewStatusEntity = (ReviewStatusEntity) obj;
        return m.a(this.f22382id, reviewStatusEntity.f22382id) && this.unitId == reviewStatusEntity.unitId && this.elemId == reviewStatusEntity.elemId && this.elemType == reviewStatusEntity.elemType && this.lastStudyTime == reviewStatusEntity.lastStudyTime && m.a(this.status, reviewStatusEntity.status);
    }

    public final long getElemId() {
        return this.elemId;
    }

    public final int getElemType() {
        return this.elemType;
    }

    public final String getId() {
        return this.f22382id;
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
        return this.status.hashCode() + e.f(this.lastStudyTime, e.b(this.elemType, e.f(this.elemId, e.f(this.unitId, this.f22382id.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        String str = this.f22382id;
        long j11 = this.unitId;
        long j12 = this.elemId;
        int i11 = this.elemType;
        long j13 = this.lastStudyTime;
        String str2 = this.status;
        StringBuilder sbM = d.m(j11, "ReviewStatusEntity(id=", str, ", unitId=");
        a.y(j12, ", elemId=", ", elemType=", sbM);
        sbM.append(i11);
        sbM.append(", lastStudyTime=");
        sbM.append(j13);
        return p.u(sbM, ", status=", str2, ")");
    }

    public ReviewStatusEntity(String id2, long j11, long j12, int i11, long j13, String str) {
        m.f(id2, "id");
        m.f(str, scNRoQgKSYX.EJu);
        this.f22382id = id2;
        this.unitId = j11;
        this.elemId = j12;
        this.elemType = i11;
        this.lastStudyTime = j13;
        this.status = str;
    }
}
