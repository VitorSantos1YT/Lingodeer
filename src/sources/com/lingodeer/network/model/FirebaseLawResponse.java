package com.lingodeer.network.model;

import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseLawResponse {
    private String email;
    private final String joined_date;
    private String law_age;
    private String law_from;
    private String learninglan;
    private String nickname;
    private String uid;
    private String uilan;

    public FirebaseLawResponse(String uid, String nickname, String email, String law_from, String law_age, String learninglan, String uilan, String joined_date) {
        m.f(uid, "uid");
        m.f(nickname, "nickname");
        m.f(email, "email");
        m.f(law_from, "law_from");
        m.f(law_age, "law_age");
        m.f(learninglan, "learninglan");
        m.f(uilan, "uilan");
        m.f(joined_date, "joined_date");
        this.uid = uid;
        this.nickname = nickname;
        this.email = email;
        this.law_from = law_from;
        this.law_age = law_age;
        this.learninglan = learninglan;
        this.uilan = uilan;
        this.joined_date = joined_date;
    }

    public static /* synthetic */ FirebaseLawResponse copy$default(FirebaseLawResponse firebaseLawResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = firebaseLawResponse.uid;
        }
        if ((i11 & 2) != 0) {
            str2 = firebaseLawResponse.nickname;
        }
        if ((i11 & 4) != 0) {
            str3 = firebaseLawResponse.email;
        }
        if ((i11 & 8) != 0) {
            str4 = firebaseLawResponse.law_from;
        }
        if ((i11 & 16) != 0) {
            str5 = firebaseLawResponse.law_age;
        }
        if ((i11 & 32) != 0) {
            str6 = firebaseLawResponse.learninglan;
        }
        if ((i11 & 64) != 0) {
            str7 = firebaseLawResponse.uilan;
        }
        if ((i11 & 128) != 0) {
            str8 = firebaseLawResponse.joined_date;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return firebaseLawResponse.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component2() {
        return this.nickname;
    }

    public final String component3() {
        return this.email;
    }

    public final String component4() {
        return this.law_from;
    }

    public final String component5() {
        return this.law_age;
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

    public final FirebaseLawResponse copy(String uid, String nickname, String email, String law_from, String law_age, String learninglan, String uilan, String joined_date) {
        m.f(uid, "uid");
        m.f(nickname, "nickname");
        m.f(email, "email");
        m.f(law_from, "law_from");
        m.f(law_age, "law_age");
        m.f(learninglan, "learninglan");
        m.f(uilan, "uilan");
        m.f(joined_date, "joined_date");
        return new FirebaseLawResponse(uid, nickname, email, law_from, law_age, learninglan, uilan, joined_date);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseLawResponse)) {
            return false;
        }
        FirebaseLawResponse firebaseLawResponse = (FirebaseLawResponse) obj;
        return m.a(this.uid, firebaseLawResponse.uid) && m.a(this.nickname, firebaseLawResponse.nickname) && m.a(this.email, firebaseLawResponse.email) && m.a(this.law_from, firebaseLawResponse.law_from) && m.a(this.law_age, firebaseLawResponse.law_age) && m.a(this.learninglan, firebaseLawResponse.learninglan) && m.a(this.uilan, firebaseLawResponse.uilan) && m.a(this.joined_date, firebaseLawResponse.joined_date);
    }

    public final String getEmail() {
        return this.email;
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
        return this.joined_date.hashCode() + e.d(e.d(e.d(e.d(e.d(e.d(this.uid.hashCode() * 31, 31, this.nickname), 31, this.email), 31, this.law_from), 31, this.law_age), 31, this.learninglan), 31, this.uilan);
    }

    public final void setEmail(String str) {
        m.f(str, "<set-?>");
        this.email = str;
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
        String str3 = this.email;
        String str4 = this.law_from;
        String str5 = this.law_age;
        String str6 = this.learninglan;
        String str7 = this.uilan;
        String str8 = this.joined_date;
        StringBuilder sbS = e.s("FirebaseLawResponse(uid=", str, ", nickname=", str2, ", email=");
        d.w(sbS, str3, ", law_from=", str4, ", law_age=");
        d.w(sbS, str5, ", learninglan=", str6, ", uilan=");
        return e.p(sbS, str7, ", joined_date=", str8, ")");
    }

    public /* synthetic */ FirebaseLawResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, f fVar) {
        this((i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i11 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i11 & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i11 & 8) != 0 ? BuildConfig.VERSION_NAME : str4, (i11 & 16) != 0 ? BuildConfig.VERSION_NAME : str5, str6, str7, (i11 & 128) != 0 ? BuildConfig.VERSION_NAME : str8);
    }
}
