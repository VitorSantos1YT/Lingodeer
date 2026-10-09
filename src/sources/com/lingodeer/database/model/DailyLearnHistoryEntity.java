package com.lingodeer.database.model;

import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DailyLearnHistoryEntity {
    private final int amount;
    private final int baseXP;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22363id;
    private final int pendingAmount;

    public DailyLearnHistoryEntity(String id2, int i11, int i12, int i13) {
        m.f(id2, "id");
        this.f22363id = id2;
        this.amount = i11;
        this.baseXP = i12;
        this.pendingAmount = i13;
    }

    public static /* synthetic */ DailyLearnHistoryEntity copy$default(DailyLearnHistoryEntity dailyLearnHistoryEntity, String str, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = dailyLearnHistoryEntity.f22363id;
        }
        if ((i14 & 2) != 0) {
            i11 = dailyLearnHistoryEntity.amount;
        }
        if ((i14 & 4) != 0) {
            i12 = dailyLearnHistoryEntity.baseXP;
        }
        if ((i14 & 8) != 0) {
            i13 = dailyLearnHistoryEntity.pendingAmount;
        }
        return dailyLearnHistoryEntity.copy(str, i11, i12, i13);
    }

    public final String component1() {
        return this.f22363id;
    }

    public final int component2() {
        return this.amount;
    }

    public final int component3() {
        return this.baseXP;
    }

    public final int component4() {
        return this.pendingAmount;
    }

    public final DailyLearnHistoryEntity copy(String id2, int i11, int i12, int i13) {
        m.f(id2, "id");
        return new DailyLearnHistoryEntity(id2, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyLearnHistoryEntity)) {
            return false;
        }
        DailyLearnHistoryEntity dailyLearnHistoryEntity = (DailyLearnHistoryEntity) obj;
        return m.a(this.f22363id, dailyLearnHistoryEntity.f22363id) && this.amount == dailyLearnHistoryEntity.amount && this.baseXP == dailyLearnHistoryEntity.baseXP && this.pendingAmount == dailyLearnHistoryEntity.pendingAmount;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final int getBaseXP() {
        return this.baseXP;
    }

    public final String getId() {
        return this.f22363id;
    }

    public final int getPendingAmount() {
        return this.pendingAmount;
    }

    public int hashCode() {
        return Integer.hashCode(this.pendingAmount) + e.b(this.baseXP, e.b(this.amount, this.f22363id.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.f22363id;
        int i11 = this.amount;
        int i12 = this.baseXP;
        int i13 = this.pendingAmount;
        StringBuilder sbQ = e.q(i11, "DailyLearnHistoryEntity(id=", str, ", amount=", ", baseXP=");
        sbQ.append(i12);
        sbQ.append(", pendingAmount=");
        sbQ.append(i13);
        sbQ.append(")");
        return sbQ.toString();
    }
}
