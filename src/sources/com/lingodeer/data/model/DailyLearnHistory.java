package com.lingodeer.data.model;

import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import defpackage.e;
import ep.a;
import hh.p0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DailyLearnHistory {
    private final int amount;
    private final int baseXP;
    private final int dayOfWeek;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22304id;
    private final int pendingAmount;

    public DailyLearnHistory(String id2, int i11, int i12, int i13, int i14) {
        m.f(id2, "id");
        this.f22304id = id2;
        this.amount = i11;
        this.baseXP = i12;
        this.pendingAmount = i13;
        this.dayOfWeek = i14;
    }

    public static /* synthetic */ DailyLearnHistory copy$default(DailyLearnHistory dailyLearnHistory, String str, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = dailyLearnHistory.f22304id;
        }
        if ((i15 & 2) != 0) {
            i11 = dailyLearnHistory.amount;
        }
        if ((i15 & 4) != 0) {
            i12 = dailyLearnHistory.baseXP;
        }
        if ((i15 & 8) != 0) {
            i13 = dailyLearnHistory.pendingAmount;
        }
        if ((i15 & 16) != 0) {
            i14 = dailyLearnHistory.dayOfWeek;
        }
        int i16 = i14;
        int i17 = i12;
        return dailyLearnHistory.copy(str, i11, i17, i13, i16);
    }

    public final String component1() {
        return this.f22304id;
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

    public final int component5() {
        return this.dayOfWeek;
    }

    public final DailyLearnHistory copy(String id2, int i11, int i12, int i13, int i14) {
        m.f(id2, "id");
        return new DailyLearnHistory(id2, i11, i12, i13, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyLearnHistory)) {
            return false;
        }
        DailyLearnHistory dailyLearnHistory = (DailyLearnHistory) obj;
        return m.a(this.f22304id, dailyLearnHistory.f22304id) && this.amount == dailyLearnHistory.amount && this.baseXP == dailyLearnHistory.baseXP && this.pendingAmount == dailyLearnHistory.pendingAmount && this.dayOfWeek == dailyLearnHistory.dayOfWeek;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final int getBaseXP() {
        return this.baseXP;
    }

    public final int getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final String getId() {
        return this.f22304id;
    }

    public final int getLearnXP() {
        return this.amount + this.baseXP + this.pendingAmount;
    }

    public final int getPendingAmount() {
        return this.pendingAmount;
    }

    public int hashCode() {
        return Integer.hashCode(this.dayOfWeek) + e.b(this.pendingAmount, e.b(this.baseXP, e.b(this.amount, this.f22304id.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        String str = this.f22304id;
        int i11 = this.amount;
        int i12 = this.baseXP;
        int i13 = this.pendingAmount;
        int i14 = this.dayOfWeek;
        StringBuilder sbQ = e.q(i11, "DailyLearnHistory(id=", str, ", amount=", ", baseXP=");
        a.v(i12, i13, ", pendingAmount=", ", dayOfWeek=", sbQ);
        return p0.i(i14, MzwEyWCkjXL.fWAauprUWJe, sbQ);
    }

    public /* synthetic */ DailyLearnHistory(String str, int i11, int i12, int i13, int i14, int i15, f fVar) {
        this(str, i11, i12, i13, (i15 & 16) != 0 ? 0 : i14);
    }
}
