package com.lingodeer.data.model;

import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import defpackage.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DailyStreakHistory {
    private final int dayOfWeek;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22308id;
    private final String pendingType;
    private final String type;

    public DailyStreakHistory(String id2, String type, String pendingType, int i11) {
        m.f(id2, "id");
        m.f(type, "type");
        m.f(pendingType, "pendingType");
        this.f22308id = id2;
        this.type = type;
        this.pendingType = pendingType;
        this.dayOfWeek = i11;
    }

    public static /* synthetic */ DailyStreakHistory copy$default(DailyStreakHistory dailyStreakHistory, String str, String str2, String str3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = dailyStreakHistory.f22308id;
        }
        if ((i12 & 2) != 0) {
            str2 = dailyStreakHistory.type;
        }
        if ((i12 & 4) != 0) {
            str3 = dailyStreakHistory.pendingType;
        }
        if ((i12 & 8) != 0) {
            i11 = dailyStreakHistory.dayOfWeek;
        }
        return dailyStreakHistory.copy(str, str2, str3, i11);
    }

    public final String component1() {
        return this.f22308id;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.pendingType;
    }

    public final int component4() {
        return this.dayOfWeek;
    }

    public final DailyStreakHistory copy(String id2, String type, String pendingType, int i11) {
        m.f(id2, "id");
        m.f(type, "type");
        m.f(pendingType, "pendingType");
        return new DailyStreakHistory(id2, type, pendingType, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyStreakHistory)) {
            return false;
        }
        DailyStreakHistory dailyStreakHistory = (DailyStreakHistory) obj;
        return m.a(this.f22308id, dailyStreakHistory.f22308id) && m.a(this.type, dailyStreakHistory.type) && m.a(this.pendingType, dailyStreakHistory.pendingType) && this.dayOfWeek == dailyStreakHistory.dayOfWeek;
    }

    public final int getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final String getId() {
        return this.f22308id;
    }

    public final String getPendingType() {
        return this.pendingType;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.dayOfWeek) + e.d(e.d(this.f22308id.hashCode() * 31, 31, this.type), 31, this.pendingType);
    }

    public String toString() {
        String str = this.f22308id;
        String str2 = this.type;
        String str3 = this.pendingType;
        int i11 = this.dayOfWeek;
        StringBuilder sbS = e.s("DailyStreakHistory(id=", str, ", type=", str2, ", pendingType=");
        sbS.append(str3);
        sbS.append(ualZoVVCQs.JXaxaxF);
        sbS.append(i11);
        sbS.append(")");
        return sbS.toString();
    }

    public /* synthetic */ DailyStreakHistory(String str, String str2, String str3, int i11, int i12, f fVar) {
        this(str, str2, str3, (i12 & 8) != 0 ? 0 : i11);
    }
}
