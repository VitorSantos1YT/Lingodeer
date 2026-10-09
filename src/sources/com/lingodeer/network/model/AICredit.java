package com.lingodeer.network.model;

import defpackage.e;
import ep.a;
import kotlin.jvm.internal.f;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class AICredit {
    private int CircleStatus;
    private int Credit2Tokens;
    private int CreditConsumed;
    private int CreditGrant;
    private long ExpiredDate;
    private boolean IsFirstAppended;
    private boolean IsFreeTrail;
    private long StartDate;
    private int TokenConsumed;

    public AICredit() {
        this(0, 0, 0, 0, 0, 0L, 0L, false, false, 511, null);
    }

    public static /* synthetic */ AICredit copy$default(AICredit aICredit, int i11, int i12, int i13, int i14, int i15, long j11, long j12, boolean z11, boolean z12, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = aICredit.CircleStatus;
        }
        if ((i16 & 2) != 0) {
            i12 = aICredit.CreditGrant;
        }
        if ((i16 & 4) != 0) {
            i13 = aICredit.CreditConsumed;
        }
        if ((i16 & 8) != 0) {
            i14 = aICredit.TokenConsumed;
        }
        if ((i16 & 16) != 0) {
            i15 = aICredit.Credit2Tokens;
        }
        if ((i16 & 32) != 0) {
            j11 = aICredit.StartDate;
        }
        if ((i16 & 64) != 0) {
            j12 = aICredit.ExpiredDate;
        }
        if ((i16 & 128) != 0) {
            z11 = aICredit.IsFirstAppended;
        }
        if ((i16 & 256) != 0) {
            z12 = aICredit.IsFreeTrail;
        }
        long j13 = j12;
        long j14 = j11;
        int i17 = i14;
        int i18 = i15;
        int i19 = i13;
        return aICredit.copy(i11, i12, i19, i17, i18, j14, j13, z11, z12);
    }

    public final int component1() {
        return this.CircleStatus;
    }

    public final int component2() {
        return this.CreditGrant;
    }

    public final int component3() {
        return this.CreditConsumed;
    }

    public final int component4() {
        return this.TokenConsumed;
    }

    public final int component5() {
        return this.Credit2Tokens;
    }

    public final long component6() {
        return this.StartDate;
    }

    public final long component7() {
        return this.ExpiredDate;
    }

    public final boolean component8() {
        return this.IsFirstAppended;
    }

    public final boolean component9() {
        return this.IsFreeTrail;
    }

    public final AICredit copy(int i11, int i12, int i13, int i14, int i15, long j11, long j12, boolean z11, boolean z12) {
        return new AICredit(i11, i12, i13, i14, i15, j11, j12, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AICredit)) {
            return false;
        }
        AICredit aICredit = (AICredit) obj;
        return this.CircleStatus == aICredit.CircleStatus && this.CreditGrant == aICredit.CreditGrant && this.CreditConsumed == aICredit.CreditConsumed && this.TokenConsumed == aICredit.TokenConsumed && this.Credit2Tokens == aICredit.Credit2Tokens && this.StartDate == aICredit.StartDate && this.ExpiredDate == aICredit.ExpiredDate && this.IsFirstAppended == aICredit.IsFirstAppended && this.IsFreeTrail == aICredit.IsFreeTrail;
    }

    public final int getCircleStatus() {
        return this.CircleStatus;
    }

    public final int getCredit2Tokens() {
        return this.Credit2Tokens;
    }

    public final int getCreditConsumed() {
        return this.CreditConsumed;
    }

    public final int getCreditGrant() {
        return this.CreditGrant;
    }

    public final long getExpiredDate() {
        return this.ExpiredDate;
    }

    public final boolean getIsFirstAppended() {
        return this.IsFirstAppended;
    }

    public final boolean getIsFreeTrail() {
        return this.IsFreeTrail;
    }

    public final long getStartDate() {
        return this.StartDate;
    }

    public final int getTokenConsumed() {
        return this.TokenConsumed;
    }

    public int hashCode() {
        return Boolean.hashCode(this.IsFreeTrail) + e.e(e.f(this.ExpiredDate, e.f(this.StartDate, e.b(this.Credit2Tokens, e.b(this.TokenConsumed, e.b(this.CreditConsumed, e.b(this.CreditGrant, Integer.hashCode(this.CircleStatus) * 31, 31), 31), 31), 31), 31), 31), 31, this.IsFirstAppended);
    }

    public final void setCircleStatus(int i11) {
        this.CircleStatus = i11;
    }

    public final void setCredit2Tokens(int i11) {
        this.Credit2Tokens = i11;
    }

    public final void setCreditConsumed(int i11) {
        this.CreditConsumed = i11;
    }

    public final void setCreditGrant(int i11) {
        this.CreditGrant = i11;
    }

    public final void setExpiredDate(long j11) {
        this.ExpiredDate = j11;
    }

    public final void setIsFirstAppended(boolean z11) {
        this.IsFirstAppended = z11;
    }

    public final void setIsFreeTrail(boolean z11) {
        this.IsFreeTrail = z11;
    }

    public final void setStartDate(long j11) {
        this.StartDate = j11;
    }

    public final void setTokenConsumed(int i11) {
        this.TokenConsumed = i11;
    }

    public String toString() {
        int i11 = this.CircleStatus;
        int i12 = this.CreditGrant;
        int i13 = this.CreditConsumed;
        int i14 = this.TokenConsumed;
        int i15 = this.Credit2Tokens;
        long j11 = this.StartDate;
        long j12 = this.ExpiredDate;
        boolean z11 = this.IsFirstAppended;
        boolean z12 = this.IsFreeTrail;
        StringBuilder sbK = c.k("AICredit(CircleStatus=", i11, ", CreditGrant=", i12, ", CreditConsumed=");
        a.v(i13, i14, ", TokenConsumed=", ", Credit2Tokens=", sbK);
        sbK.append(i15);
        sbK.append(", StartDate=");
        sbK.append(j11);
        a.y(j12, ", ExpiredDate=", ", IsFirstAppended=", sbK);
        sbK.append(z11);
        sbK.append(", IsFreeTrail=");
        sbK.append(z12);
        sbK.append(")");
        return sbK.toString();
    }

    public AICredit(int i11, int i12, int i13, int i14, int i15, long j11, long j12, boolean z11, boolean z12) {
        this.CircleStatus = i11;
        this.CreditGrant = i12;
        this.CreditConsumed = i13;
        this.TokenConsumed = i14;
        this.Credit2Tokens = i15;
        this.StartDate = j11;
        this.ExpiredDate = j12;
        this.IsFirstAppended = z11;
        this.IsFreeTrail = z12;
    }

    public /* synthetic */ AICredit(int i11, int i12, int i13, int i14, int i15, long j11, long j12, boolean z11, boolean z12, int i16, f fVar) {
        this((i16 & 1) != 0 ? 0 : i11, (i16 & 2) != 0 ? 0 : i12, (i16 & 4) != 0 ? 0 : i13, (i16 & 8) != 0 ? 0 : i14, (i16 & 16) != 0 ? 0 : i15, (i16 & 32) != 0 ? 0L : j11, (i16 & 64) == 0 ? j12 : 0L, (i16 & 128) != 0 ? false : z11, (i16 & 256) != 0 ? false : z12);
    }
}
