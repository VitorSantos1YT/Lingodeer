package com.lingodeer.data.model;

import com.google.android.material.datepicker.d;
import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LoginHistory {
    private final String accountType;
    private final String email;
    private final boolean isMember;
    private final long lastLogOutTime;
    private final int learningLan;
    private final String nickName;
    private final int uiLan;
    private final String uid;

    public LoginHistory(String uid, String nickName, String email, String accountType, boolean z11, int i11, int i12, long j11) {
        m.f(uid, "uid");
        m.f(nickName, "nickName");
        m.f(email, "email");
        m.f(accountType, "accountType");
        this.uid = uid;
        this.nickName = nickName;
        this.email = email;
        this.accountType = accountType;
        this.isMember = z11;
        this.learningLan = i11;
        this.uiLan = i12;
        this.lastLogOutTime = j11;
    }

    public static /* synthetic */ LoginHistory copy$default(LoginHistory loginHistory, String str, String str2, String str3, String str4, boolean z11, int i11, int i12, long j11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = loginHistory.uid;
        }
        if ((i13 & 2) != 0) {
            str2 = loginHistory.nickName;
        }
        if ((i13 & 4) != 0) {
            str3 = loginHistory.email;
        }
        if ((i13 & 8) != 0) {
            str4 = loginHistory.accountType;
        }
        if ((i13 & 16) != 0) {
            z11 = loginHistory.isMember;
        }
        if ((i13 & 32) != 0) {
            i11 = loginHistory.learningLan;
        }
        if ((i13 & 64) != 0) {
            i12 = loginHistory.uiLan;
        }
        if ((i13 & 128) != 0) {
            j11 = loginHistory.lastLogOutTime;
        }
        long j12 = j11;
        int i14 = i11;
        int i15 = i12;
        boolean z12 = z11;
        String str5 = str3;
        return loginHistory.copy(str, str2, str5, str4, z12, i14, i15, j12);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component2() {
        return this.nickName;
    }

    public final String component3() {
        return this.email;
    }

    public final String component4() {
        return this.accountType;
    }

    public final boolean component5() {
        return this.isMember;
    }

    public final int component6() {
        return this.learningLan;
    }

    public final int component7() {
        return this.uiLan;
    }

    public final long component8() {
        return this.lastLogOutTime;
    }

    public final LoginHistory copy(String uid, String nickName, String email, String accountType, boolean z11, int i11, int i12, long j11) {
        m.f(uid, "uid");
        m.f(nickName, "nickName");
        m.f(email, "email");
        m.f(accountType, "accountType");
        return new LoginHistory(uid, nickName, email, accountType, z11, i11, i12, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginHistory)) {
            return false;
        }
        LoginHistory loginHistory = (LoginHistory) obj;
        return m.a(this.uid, loginHistory.uid) && m.a(this.nickName, loginHistory.nickName) && m.a(this.email, loginHistory.email) && m.a(this.accountType, loginHistory.accountType) && this.isMember == loginHistory.isMember && this.learningLan == loginHistory.learningLan && this.uiLan == loginHistory.uiLan && this.lastLogOutTime == loginHistory.lastLogOutTime;
    }

    public final String getAccountType() {
        return this.accountType;
    }

    public final String getEmail() {
        return this.email;
    }

    public final long getLastLogOutTime() {
        return this.lastLogOutTime;
    }

    public final int getLearningLan() {
        return this.learningLan;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final int getUiLan() {
        return this.uiLan;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        return Long.hashCode(this.lastLogOutTime) + e.b(this.uiLan, e.b(this.learningLan, e.e(e.d(e.d(e.d(this.uid.hashCode() * 31, 31, this.nickName), 31, this.email), 31, this.accountType), 31, this.isMember), 31), 31);
    }

    public final boolean isMember() {
        return this.isMember;
    }

    public String toString() {
        String str = this.uid;
        String str2 = this.nickName;
        String str3 = this.email;
        String str4 = this.accountType;
        boolean z11 = this.isMember;
        int i11 = this.learningLan;
        int i12 = this.uiLan;
        long j11 = this.lastLogOutTime;
        StringBuilder sbS = e.s("LoginHistory(uid=", str, ", nickName=", str2, ", email=");
        d.w(sbS, str3, ", accountType=", str4, ", isMember=");
        sbS.append(z11);
        sbS.append(", learningLan=");
        sbS.append(i11);
        sbS.append(", uiLan=");
        sbS.append(i12);
        sbS.append(", lastLogOutTime=");
        sbS.append(j11);
        sbS.append(")");
        return sbS.toString();
    }
}
