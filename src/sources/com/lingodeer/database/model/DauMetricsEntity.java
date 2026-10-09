package com.lingodeer.database.model;

import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DauMetricsEntity {
    private final int finishLessonType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22366id;
    private final boolean pendingUpdate;
    private final boolean pendingUpdateFinishLessonType;

    public DauMetricsEntity(String id2, int i11, boolean z11, boolean z12) {
        m.f(id2, "id");
        this.f22366id = id2;
        this.finishLessonType = i11;
        this.pendingUpdate = z11;
        this.pendingUpdateFinishLessonType = z12;
    }

    public static /* synthetic */ DauMetricsEntity copy$default(DauMetricsEntity dauMetricsEntity, String str, int i11, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = dauMetricsEntity.f22366id;
        }
        if ((i12 & 2) != 0) {
            i11 = dauMetricsEntity.finishLessonType;
        }
        if ((i12 & 4) != 0) {
            z11 = dauMetricsEntity.pendingUpdate;
        }
        if ((i12 & 8) != 0) {
            z12 = dauMetricsEntity.pendingUpdateFinishLessonType;
        }
        return dauMetricsEntity.copy(str, i11, z11, z12);
    }

    public final String component1() {
        return this.f22366id;
    }

    public final int component2() {
        return this.finishLessonType;
    }

    public final boolean component3() {
        return this.pendingUpdate;
    }

    public final boolean component4() {
        return this.pendingUpdateFinishLessonType;
    }

    public final DauMetricsEntity copy(String id2, int i11, boolean z11, boolean z12) {
        m.f(id2, "id");
        return new DauMetricsEntity(id2, i11, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DauMetricsEntity)) {
            return false;
        }
        DauMetricsEntity dauMetricsEntity = (DauMetricsEntity) obj;
        return m.a(this.f22366id, dauMetricsEntity.f22366id) && this.finishLessonType == dauMetricsEntity.finishLessonType && this.pendingUpdate == dauMetricsEntity.pendingUpdate && this.pendingUpdateFinishLessonType == dauMetricsEntity.pendingUpdateFinishLessonType;
    }

    public final int getFinishLessonType() {
        return this.finishLessonType;
    }

    public final String getId() {
        return this.f22366id;
    }

    public final boolean getPendingUpdate() {
        return this.pendingUpdate;
    }

    public final boolean getPendingUpdateFinishLessonType() {
        return this.pendingUpdateFinishLessonType;
    }

    public int hashCode() {
        return Boolean.hashCode(this.pendingUpdateFinishLessonType) + e.e(e.b(this.finishLessonType, this.f22366id.hashCode() * 31, 31), 31, this.pendingUpdate);
    }

    public String toString() {
        String str = this.f22366id;
        int i11 = this.finishLessonType;
        boolean z11 = this.pendingUpdate;
        boolean z12 = this.pendingUpdateFinishLessonType;
        StringBuilder sbQ = e.q(i11, "DauMetricsEntity(id=", str, xTCJ.pHfSNRb, ", pendingUpdate=");
        sbQ.append(z11);
        sbQ.append(", pendingUpdateFinishLessonType=");
        sbQ.append(z12);
        sbQ.append(")");
        return sbQ.toString();
    }
}
