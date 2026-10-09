package com.lingodeer.data.model;

import defpackage.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DailyGemHistory {
    private final int amount;
    private final int dayOfWeek;
    private final String description;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22303id;
    private final int pendingAmount;
    private final String type;

    public DailyGemHistory(String id2, int i11, String type, int i12, String description, int i13) {
        m.f(id2, "id");
        m.f(type, "type");
        m.f(description, "description");
        this.f22303id = id2;
        this.amount = i11;
        this.type = type;
        this.pendingAmount = i12;
        this.description = description;
        this.dayOfWeek = i13;
    }

    public static /* synthetic */ DailyGemHistory copy$default(DailyGemHistory dailyGemHistory, String str, int i11, String str2, int i12, String str3, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = dailyGemHistory.f22303id;
        }
        if ((i14 & 2) != 0) {
            i11 = dailyGemHistory.amount;
        }
        if ((i14 & 4) != 0) {
            str2 = dailyGemHistory.type;
        }
        if ((i14 & 8) != 0) {
            i12 = dailyGemHistory.pendingAmount;
        }
        if ((i14 & 16) != 0) {
            str3 = dailyGemHistory.description;
        }
        if ((i14 & 32) != 0) {
            i13 = dailyGemHistory.dayOfWeek;
        }
        String str4 = str3;
        int i15 = i13;
        return dailyGemHistory.copy(str, i11, str2, i12, str4, i15);
    }

    public final String component1() {
        return this.f22303id;
    }

    public final int component2() {
        return this.amount;
    }

    public final String component3() {
        return this.type;
    }

    public final int component4() {
        return this.pendingAmount;
    }

    public final String component5() {
        return this.description;
    }

    public final int component6() {
        return this.dayOfWeek;
    }

    public final DailyGemHistory copy(String id2, int i11, String type, int i12, String description, int i13) {
        m.f(id2, "id");
        m.f(type, "type");
        m.f(description, "description");
        return new DailyGemHistory(id2, i11, type, i12, description, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyGemHistory)) {
            return false;
        }
        DailyGemHistory dailyGemHistory = (DailyGemHistory) obj;
        return m.a(this.f22303id, dailyGemHistory.f22303id) && this.amount == dailyGemHistory.amount && m.a(this.type, dailyGemHistory.type) && this.pendingAmount == dailyGemHistory.pendingAmount && m.a(this.description, dailyGemHistory.description) && this.dayOfWeek == dailyGemHistory.dayOfWeek;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final int getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.f22303id;
    }

    public final int getPendingAmount() {
        return this.pendingAmount;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.dayOfWeek) + e.d(e.b(this.pendingAmount, e.d(e.b(this.amount, this.f22303id.hashCode() * 31, 31), 31, this.type), 31), 31, this.description);
    }

    public String toString() {
        String str = this.f22303id;
        int i11 = this.amount;
        String str2 = this.type;
        int i12 = this.pendingAmount;
        String str3 = this.description;
        int i13 = this.dayOfWeek;
        StringBuilder sbQ = e.q(i11, "DailyGemHistory(id=", str, ", amount=", ", type=");
        sbQ.append(str2);
        sbQ.append(", pendingAmount=");
        sbQ.append(i12);
        sbQ.append(", description=");
        sbQ.append(str3);
        sbQ.append(", dayOfWeek=");
        sbQ.append(i13);
        sbQ.append(")");
        return sbQ.toString();
    }

    public /* synthetic */ DailyGemHistory(String str, int i11, String str2, int i12, String str3, int i13, int i14, f fVar) {
        this(str, i11, str2, i12, str3, (i14 & 32) != 0 ? 0 : i13);
    }
}
