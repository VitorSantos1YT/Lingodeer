package com.lingodeer.database.model;

import com.google.android.material.datepicker.d;
import defpackage.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ChineseToneLastVisitedEntity {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22361id;
    private final long lessonId;
    private final long time;

    public ChineseToneLastVisitedEntity(String id2, long j11, long j12) {
        m.f(id2, "id");
        this.f22361id = id2;
        this.lessonId = j11;
        this.time = j12;
    }

    public static /* synthetic */ ChineseToneLastVisitedEntity copy$default(ChineseToneLastVisitedEntity chineseToneLastVisitedEntity, String str, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chineseToneLastVisitedEntity.f22361id;
        }
        if ((i11 & 2) != 0) {
            j11 = chineseToneLastVisitedEntity.lessonId;
        }
        if ((i11 & 4) != 0) {
            j12 = chineseToneLastVisitedEntity.time;
        }
        return chineseToneLastVisitedEntity.copy(str, j11, j12);
    }

    public final String component1() {
        return this.f22361id;
    }

    public final long component2() {
        return this.lessonId;
    }

    public final long component3() {
        return this.time;
    }

    public final ChineseToneLastVisitedEntity copy(String id2, long j11, long j12) {
        m.f(id2, "id");
        return new ChineseToneLastVisitedEntity(id2, j11, j12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChineseToneLastVisitedEntity)) {
            return false;
        }
        ChineseToneLastVisitedEntity chineseToneLastVisitedEntity = (ChineseToneLastVisitedEntity) obj;
        return m.a(this.f22361id, chineseToneLastVisitedEntity.f22361id) && this.lessonId == chineseToneLastVisitedEntity.lessonId && this.time == chineseToneLastVisitedEntity.time;
    }

    public final String getId() {
        return this.f22361id;
    }

    public final long getLessonId() {
        return this.lessonId;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return Long.hashCode(this.time) + e.f(this.lessonId, this.f22361id.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.f22361id;
        long j11 = this.lessonId;
        long j12 = this.time;
        StringBuilder sbM = d.m(j11, "ChineseToneLastVisitedEntity(id=", str, ", lessonId=");
        sbM.append(", time=");
        sbM.append(j12);
        sbM.append(")");
        return sbM.toString();
    }

    public /* synthetic */ ChineseToneLastVisitedEntity(String str, long j11, long j12, int i11, f fVar) {
        this((i11 & 1) != 0 ? "last" : str, j11, j12);
    }
}
