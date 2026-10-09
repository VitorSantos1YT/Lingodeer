package com.lingodeer.database.model;

import com.google.android.material.datepicker.d;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LastSyncTimeEntity {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22379id;
    private final long lastSyncTime;

    public LastSyncTimeEntity(String id2, long j11) {
        m.f(id2, "id");
        this.f22379id = id2;
        this.lastSyncTime = j11;
    }

    public static /* synthetic */ LastSyncTimeEntity copy$default(LastSyncTimeEntity lastSyncTimeEntity, String str, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = lastSyncTimeEntity.f22379id;
        }
        if ((i11 & 2) != 0) {
            j11 = lastSyncTimeEntity.lastSyncTime;
        }
        return lastSyncTimeEntity.copy(str, j11);
    }

    public final String component1() {
        return this.f22379id;
    }

    public final long component2() {
        return this.lastSyncTime;
    }

    public final LastSyncTimeEntity copy(String id2, long j11) {
        m.f(id2, "id");
        return new LastSyncTimeEntity(id2, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastSyncTimeEntity)) {
            return false;
        }
        LastSyncTimeEntity lastSyncTimeEntity = (LastSyncTimeEntity) obj;
        return m.a(this.f22379id, lastSyncTimeEntity.f22379id) && this.lastSyncTime == lastSyncTimeEntity.lastSyncTime;
    }

    public final String getId() {
        return this.f22379id;
    }

    public final long getLastSyncTime() {
        return this.lastSyncTime;
    }

    public int hashCode() {
        return Long.hashCode(this.lastSyncTime) + (this.f22379id.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbM = d.m(this.lastSyncTime, "LastSyncTimeEntity(id=", this.f22379id, ", lastSyncTime=");
        sbM.append(")");
        return sbM.toString();
    }
}
