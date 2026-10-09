package com.lingodeer.database.model;

import defpackage.e;
import ep.a;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ChineseToneLessonStatusEntity {
    private final long lessonId;
    private final boolean pendingUpdate;
    private final int status;
    private final long time;

    public ChineseToneLessonStatusEntity(long j11, int i11, long j12, boolean z11) {
        this.lessonId = j11;
        this.status = i11;
        this.time = j12;
        this.pendingUpdate = z11;
    }

    public static /* synthetic */ ChineseToneLessonStatusEntity copy$default(ChineseToneLessonStatusEntity chineseToneLessonStatusEntity, long j11, int i11, long j12, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = chineseToneLessonStatusEntity.lessonId;
        }
        long j13 = j11;
        if ((i12 & 2) != 0) {
            i11 = chineseToneLessonStatusEntity.status;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            j12 = chineseToneLessonStatusEntity.time;
        }
        long j14 = j12;
        if ((i12 & 8) != 0) {
            z11 = chineseToneLessonStatusEntity.pendingUpdate;
        }
        return chineseToneLessonStatusEntity.copy(j13, i13, j14, z11);
    }

    public final long component1() {
        return this.lessonId;
    }

    public final int component2() {
        return this.status;
    }

    public final long component3() {
        return this.time;
    }

    public final boolean component4() {
        return this.pendingUpdate;
    }

    public final ChineseToneLessonStatusEntity copy(long j11, int i11, long j12, boolean z11) {
        return new ChineseToneLessonStatusEntity(j11, i11, j12, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChineseToneLessonStatusEntity)) {
            return false;
        }
        ChineseToneLessonStatusEntity chineseToneLessonStatusEntity = (ChineseToneLessonStatusEntity) obj;
        return this.lessonId == chineseToneLessonStatusEntity.lessonId && this.status == chineseToneLessonStatusEntity.status && this.time == chineseToneLessonStatusEntity.time && this.pendingUpdate == chineseToneLessonStatusEntity.pendingUpdate;
    }

    public final long getLessonId() {
        return this.lessonId;
    }

    public final boolean getPendingUpdate() {
        return this.pendingUpdate;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return Boolean.hashCode(this.pendingUpdate) + e.f(this.time, e.b(this.status, Long.hashCode(this.lessonId) * 31, 31), 31);
    }

    public String toString() {
        long j11 = this.lessonId;
        int i11 = this.status;
        long j12 = this.time;
        boolean z11 = this.pendingUpdate;
        StringBuilder sb2 = new StringBuilder("ChineseToneLessonStatusEntity(lessonId=");
        sb2.append(j11);
        sb2.append(", status=");
        sb2.append(i11);
        a.y(j12, ", time=", ", pendingUpdate=", sb2);
        return p0.p(sb2, z11, ")");
    }
}
