package com.lingodeer.database.model;

import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import defpackage.e;
import ep.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DailyGemHistoryEntity {
    private final int amount;
    private final String description;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22362id;
    private final int pendingAmount;
    private final String type;

    public DailyGemHistoryEntity(String id2, int i11, String type, int i12, String description) {
        m.f(id2, "id");
        m.f(type, "type");
        m.f(description, "description");
        this.f22362id = id2;
        this.amount = i11;
        this.type = type;
        this.pendingAmount = i12;
        this.description = description;
    }

    public static /* synthetic */ DailyGemHistoryEntity copy$default(DailyGemHistoryEntity dailyGemHistoryEntity, String str, int i11, String str2, int i12, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dailyGemHistoryEntity.f22362id;
        }
        if ((i13 & 2) != 0) {
            i11 = dailyGemHistoryEntity.amount;
        }
        if ((i13 & 4) != 0) {
            str2 = dailyGemHistoryEntity.type;
        }
        if ((i13 & 8) != 0) {
            i12 = dailyGemHistoryEntity.pendingAmount;
        }
        if ((i13 & 16) != 0) {
            str3 = dailyGemHistoryEntity.description;
        }
        String str4 = str3;
        String str5 = str2;
        return dailyGemHistoryEntity.copy(str, i11, str5, i12, str4);
    }

    public final String component1() {
        return this.f22362id;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyGemHistoryEntity)) {
            return false;
        }
        DailyGemHistoryEntity dailyGemHistoryEntity = (DailyGemHistoryEntity) obj;
        return m.a(this.f22362id, dailyGemHistoryEntity.f22362id) && this.amount == dailyGemHistoryEntity.amount && m.a(this.type, dailyGemHistoryEntity.type) && this.pendingAmount == dailyGemHistoryEntity.pendingAmount && m.a(this.description, dailyGemHistoryEntity.description);
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.f22362id;
    }

    public final int getPendingAmount() {
        return this.pendingAmount;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.description.hashCode() + e.b(this.pendingAmount, e.d(e.b(this.amount, this.f22362id.hashCode() * 31, 31), 31, this.type), 31);
    }

    public String toString() {
        String str = this.f22362id;
        int i11 = this.amount;
        String str2 = this.type;
        int i12 = this.pendingAmount;
        String str3 = this.description;
        StringBuilder sbQ = e.q(i11, "DailyGemHistoryEntity(id=", str, ", amount=", ", type=");
        sbQ.append(str2);
        sbQ.append(", pendingAmount=");
        sbQ.append(i12);
        sbQ.append(", description=");
        return a.k(sbQ, str3, ")");
    }

    public final DailyGemHistoryEntity copy(String str, int i11, String type, int i12, String description) {
        m.f(str, SemtNwfPgIhi.QgZFpBjAn);
        m.f(type, "type");
        m.f(description, "description");
        return new DailyGemHistoryEntity(str, i11, type, i12, description);
    }
}
