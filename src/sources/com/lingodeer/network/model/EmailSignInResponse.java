package com.lingodeer.network.model;

import c00.a;
import c00.e;
import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@e
public final class EmailSignInResponse {
    public static final Companion Companion = new Companion(null);
    private String joined_date;
    private String law_age;
    private String law_from;
    private String learninglan;
    private String multi_account_flag;
    private String nickname;
    private String uid;
    private String uilan;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return EmailSignInResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ EmailSignInResponse(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, o1 o1Var) {
        if (96 != (i11 & 96)) {
            d1.k(i11, 96, EmailSignInResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.uid = BuildConfig.VERSION_NAME;
        } else {
            this.uid = str;
        }
        if ((i11 & 2) == 0) {
            this.nickname = BuildConfig.VERSION_NAME;
        } else {
            this.nickname = str2;
        }
        if ((i11 & 4) == 0) {
            this.law_from = BuildConfig.VERSION_NAME;
        } else {
            this.law_from = str3;
        }
        if ((i11 & 8) == 0) {
            this.law_age = BuildConfig.VERSION_NAME;
        } else {
            this.law_age = str4;
        }
        if ((i11 & 16) == 0) {
            this.multi_account_flag = BuildConfig.VERSION_NAME;
        } else {
            this.multi_account_flag = str5;
        }
        this.learninglan = str6;
        this.uilan = str7;
        if ((i11 & 128) == 0) {
            this.joined_date = BuildConfig.VERSION_NAME;
        } else {
            this.joined_date = str8;
        }
    }

    public static /* synthetic */ EmailSignInResponse copy$default(EmailSignInResponse emailSignInResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = emailSignInResponse.uid;
        }
        if ((i11 & 2) != 0) {
            str2 = emailSignInResponse.nickname;
        }
        if ((i11 & 4) != 0) {
            str3 = emailSignInResponse.law_from;
        }
        if ((i11 & 8) != 0) {
            str4 = emailSignInResponse.law_age;
        }
        if ((i11 & 16) != 0) {
            str5 = emailSignInResponse.multi_account_flag;
        }
        if ((i11 & 32) != 0) {
            str6 = emailSignInResponse.learninglan;
        }
        if ((i11 & 64) != 0) {
            str7 = emailSignInResponse.uilan;
        }
        if ((i11 & 128) != 0) {
            str8 = emailSignInResponse.joined_date;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return emailSignInResponse.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    public static final /* synthetic */ void write$Self$network_release(EmailSignInResponse emailSignInResponse, b bVar, g gVar) {
        if (bVar.G(gVar) || !m.a(emailSignInResponse.uid, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 0, emailSignInResponse.uid);
        }
        if (bVar.G(gVar) || !m.a(emailSignInResponse.nickname, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 1, emailSignInResponse.nickname);
        }
        if (bVar.G(gVar) || !m.a(emailSignInResponse.law_from, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 2, emailSignInResponse.law_from);
        }
        if (bVar.G(gVar) || !m.a(emailSignInResponse.law_age, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 3, emailSignInResponse.law_age);
        }
        if (bVar.G(gVar) || !m.a(emailSignInResponse.multi_account_flag, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 4, emailSignInResponse.multi_account_flag);
        }
        bVar.w(gVar, 5, emailSignInResponse.learninglan);
        bVar.w(gVar, 6, emailSignInResponse.uilan);
        if (!bVar.G(gVar) && m.a(emailSignInResponse.joined_date, BuildConfig.VERSION_NAME)) {
            return;
        }
        bVar.w(gVar, 7, emailSignInResponse.joined_date);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component2() {
        return this.nickname;
    }

    public final String component3() {
        return this.law_from;
    }

    public final String component4() {
        return this.law_age;
    }

    public final String component5() {
        return this.multi_account_flag;
    }

    public final String component6() {
        return this.learninglan;
    }

    public final String component7() {
        return this.uilan;
    }

    public final String component8() {
        return this.joined_date;
    }

    public final EmailSignInResponse copy(String uid, String nickname, String law_from, String law_age, String multi_account_flag, String learninglan, String uilan, String joined_date) {
        m.f(uid, "uid");
        m.f(nickname, "nickname");
        m.f(law_from, "law_from");
        m.f(law_age, "law_age");
        m.f(multi_account_flag, "multi_account_flag");
        m.f(learninglan, "learninglan");
        m.f(uilan, "uilan");
        m.f(joined_date, "joined_date");
        return new EmailSignInResponse(uid, nickname, law_from, law_age, multi_account_flag, learninglan, uilan, joined_date);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailSignInResponse)) {
            return false;
        }
        EmailSignInResponse emailSignInResponse = (EmailSignInResponse) obj;
        return m.a(this.uid, emailSignInResponse.uid) && m.a(this.nickname, emailSignInResponse.nickname) && m.a(this.law_from, emailSignInResponse.law_from) && m.a(this.law_age, emailSignInResponse.law_age) && m.a(this.multi_account_flag, emailSignInResponse.multi_account_flag) && m.a(this.learninglan, emailSignInResponse.learninglan) && m.a(this.uilan, emailSignInResponse.uilan) && m.a(this.joined_date, emailSignInResponse.joined_date);
    }

    public final String getJoined_date() {
        return this.joined_date;
    }

    public final String getLaw_age() {
        return this.law_age;
    }

    public final String getLaw_from() {
        return this.law_from;
    }

    public final String getLearninglan() {
        return this.learninglan;
    }

    public final String getMulti_account_flag() {
        return this.multi_account_flag;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getUilan() {
        return this.uilan;
    }

    public int hashCode() {
        return this.joined_date.hashCode() + defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(this.uid.hashCode() * 31, 31, this.nickname), 31, this.law_from), 31, this.law_age), 31, this.multi_account_flag), 31, this.learninglan), 31, this.uilan);
    }

    public final void setJoined_date(String str) {
        m.f(str, "<set-?>");
        this.joined_date = str;
    }

    public final void setLaw_age(String str) {
        m.f(str, "<set-?>");
        this.law_age = str;
    }

    public final void setLaw_from(String str) {
        m.f(str, "<set-?>");
        this.law_from = str;
    }

    public final void setLearninglan(String str) {
        m.f(str, "<set-?>");
        this.learninglan = str;
    }

    public final void setMulti_account_flag(String str) {
        m.f(str, "<set-?>");
        this.multi_account_flag = str;
    }

    public final void setNickname(String str) {
        m.f(str, "<set-?>");
        this.nickname = str;
    }

    public final void setUid(String str) {
        m.f(str, "<set-?>");
        this.uid = str;
    }

    public final void setUilan(String str) {
        m.f(str, "<set-?>");
        this.uilan = str;
    }

    public String toString() {
        String str = this.uid;
        String str2 = this.nickname;
        String str3 = this.law_from;
        String str4 = this.law_age;
        String str5 = this.multi_account_flag;
        String str6 = this.learninglan;
        String str7 = this.uilan;
        String str8 = this.joined_date;
        StringBuilder sbS = defpackage.e.s("EmailSignInResponse(uid=", str, ", nickname=", str2, ", law_from=");
        d.w(sbS, str3, ", law_age=", str4, ", multi_account_flag=");
        d.w(sbS, str5, ", learninglan=", str6, ", uilan=");
        return defpackage.e.p(sbS, str7, ", joined_date=", str8, ")");
    }

    public EmailSignInResponse(String uid, String nickname, String law_from, String law_age, String multi_account_flag, String learninglan, String uilan, String joined_date) {
        m.f(uid, "uid");
        m.f(nickname, "nickname");
        m.f(law_from, "law_from");
        m.f(law_age, "law_age");
        m.f(multi_account_flag, "multi_account_flag");
        m.f(learninglan, "learninglan");
        m.f(uilan, "uilan");
        m.f(joined_date, "joined_date");
        this.uid = uid;
        this.nickname = nickname;
        this.law_from = law_from;
        this.law_age = law_age;
        this.multi_account_flag = multi_account_flag;
        this.learninglan = learninglan;
        this.uilan = uilan;
        this.joined_date = joined_date;
    }

    public /* synthetic */ EmailSignInResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, f fVar) {
        this((i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i11 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i11 & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i11 & 8) != 0 ? BuildConfig.VERSION_NAME : str4, (i11 & 16) != 0 ? BuildConfig.VERSION_NAME : str5, str6, str7, (i11 & 128) != 0 ? BuildConfig.VERSION_NAME : str8);
    }
}
