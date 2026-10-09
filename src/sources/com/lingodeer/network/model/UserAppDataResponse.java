package com.lingodeer.network.model;

import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import hh.p0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class UserAppDataResponse {
    private String setting_learning_lan;
    private String setting_reminders;
    private boolean setting_show_leaderboard;
    private boolean setting_soundffect;
    private String setting_uilan;
    private String user_image;
    private String user_joined;
    private String user_nickname;
    private int var_billing_page_views;
    private boolean var_buy_coffee;
    private String var_news_feed_read_ids;

    public UserAppDataResponse() {
        this(null, null, null, false, 0, null, null, null, null, false, false, 2047, null);
    }

    public static /* synthetic */ UserAppDataResponse copy$default(UserAppDataResponse userAppDataResponse, String str, String str2, String str3, boolean z11, int i11, String str4, String str5, String str6, String str7, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = userAppDataResponse.user_image;
        }
        if ((i12 & 2) != 0) {
            str2 = userAppDataResponse.user_nickname;
        }
        if ((i12 & 4) != 0) {
            str3 = userAppDataResponse.user_joined;
        }
        if ((i12 & 8) != 0) {
            z11 = userAppDataResponse.var_buy_coffee;
        }
        if ((i12 & 16) != 0) {
            i11 = userAppDataResponse.var_billing_page_views;
        }
        if ((i12 & 32) != 0) {
            str4 = userAppDataResponse.var_news_feed_read_ids;
        }
        if ((i12 & 64) != 0) {
            str5 = userAppDataResponse.setting_learning_lan;
        }
        if ((i12 & 128) != 0) {
            str6 = userAppDataResponse.setting_uilan;
        }
        if ((i12 & 256) != 0) {
            str7 = userAppDataResponse.setting_reminders;
        }
        if ((i12 & 512) != 0) {
            z12 = userAppDataResponse.setting_soundffect;
        }
        if ((i12 & 1024) != 0) {
            z13 = userAppDataResponse.setting_show_leaderboard;
        }
        boolean z14 = z12;
        boolean z15 = z13;
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        int i13 = i11;
        String str12 = str3;
        return userAppDataResponse.copy(str, str2, str12, z11, i13, str10, str11, str8, str9, z14, z15);
    }

    public final String component1() {
        return this.user_image;
    }

    public final boolean component10() {
        return this.setting_soundffect;
    }

    public final boolean component11() {
        return this.setting_show_leaderboard;
    }

    public final String component2() {
        return this.user_nickname;
    }

    public final String component3() {
        return this.user_joined;
    }

    public final boolean component4() {
        return this.var_buy_coffee;
    }

    public final int component5() {
        return this.var_billing_page_views;
    }

    public final String component6() {
        return this.var_news_feed_read_ids;
    }

    public final String component7() {
        return this.setting_learning_lan;
    }

    public final String component8() {
        return this.setting_uilan;
    }

    public final String component9() {
        return this.setting_reminders;
    }

    public final UserAppDataResponse copy(String user_image, String user_nickname, String user_joined, boolean z11, int i11, String var_news_feed_read_ids, String setting_learning_lan, String setting_uilan, String setting_reminders, boolean z12, boolean z13) {
        m.f(user_image, "user_image");
        m.f(user_nickname, "user_nickname");
        m.f(user_joined, "user_joined");
        m.f(var_news_feed_read_ids, "var_news_feed_read_ids");
        m.f(setting_learning_lan, "setting_learning_lan");
        m.f(setting_uilan, "setting_uilan");
        m.f(setting_reminders, "setting_reminders");
        return new UserAppDataResponse(user_image, user_nickname, user_joined, z11, i11, var_news_feed_read_ids, setting_learning_lan, setting_uilan, setting_reminders, z12, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAppDataResponse)) {
            return false;
        }
        UserAppDataResponse userAppDataResponse = (UserAppDataResponse) obj;
        return m.a(this.user_image, userAppDataResponse.user_image) && m.a(this.user_nickname, userAppDataResponse.user_nickname) && m.a(this.user_joined, userAppDataResponse.user_joined) && this.var_buy_coffee == userAppDataResponse.var_buy_coffee && this.var_billing_page_views == userAppDataResponse.var_billing_page_views && m.a(this.var_news_feed_read_ids, userAppDataResponse.var_news_feed_read_ids) && m.a(this.setting_learning_lan, userAppDataResponse.setting_learning_lan) && m.a(this.setting_uilan, userAppDataResponse.setting_uilan) && m.a(this.setting_reminders, userAppDataResponse.setting_reminders) && this.setting_soundffect == userAppDataResponse.setting_soundffect && this.setting_show_leaderboard == userAppDataResponse.setting_show_leaderboard;
    }

    public final String getSetting_learning_lan() {
        return this.setting_learning_lan;
    }

    public final String getSetting_reminders() {
        return this.setting_reminders;
    }

    public final boolean getSetting_show_leaderboard() {
        return this.setting_show_leaderboard;
    }

    public final boolean getSetting_soundffect() {
        return this.setting_soundffect;
    }

    public final String getSetting_uilan() {
        return this.setting_uilan;
    }

    public final String getUser_image() {
        return this.user_image;
    }

    public final String getUser_joined() {
        return this.user_joined;
    }

    public final String getUser_nickname() {
        return this.user_nickname;
    }

    public final int getVar_billing_page_views() {
        return this.var_billing_page_views;
    }

    public final boolean getVar_buy_coffee() {
        return this.var_buy_coffee;
    }

    public final String getVar_news_feed_read_ids() {
        return this.var_news_feed_read_ids;
    }

    public int hashCode() {
        return Boolean.hashCode(this.setting_show_leaderboard) + e.e(e.d(e.d(e.d(e.d(e.b(this.var_billing_page_views, e.e(e.d(e.d(this.user_image.hashCode() * 31, 31, this.user_nickname), 31, this.user_joined), 31, this.var_buy_coffee), 31), 31, this.var_news_feed_read_ids), 31, this.setting_learning_lan), 31, this.setting_uilan), 31, this.setting_reminders), 31, this.setting_soundffect);
    }

    public final void setSetting_learning_lan(String str) {
        m.f(str, "<set-?>");
        this.setting_learning_lan = str;
    }

    public final void setSetting_reminders(String str) {
        m.f(str, "<set-?>");
        this.setting_reminders = str;
    }

    public final void setSetting_show_leaderboard(boolean z11) {
        this.setting_show_leaderboard = z11;
    }

    public final void setSetting_soundffect(boolean z11) {
        this.setting_soundffect = z11;
    }

    public final void setSetting_uilan(String str) {
        m.f(str, "<set-?>");
        this.setting_uilan = str;
    }

    public final void setUser_image(String str) {
        m.f(str, "<set-?>");
        this.user_image = str;
    }

    public final void setUser_joined(String str) {
        m.f(str, "<set-?>");
        this.user_joined = str;
    }

    public final void setUser_nickname(String str) {
        m.f(str, "<set-?>");
        this.user_nickname = str;
    }

    public final void setVar_billing_page_views(int i11) {
        this.var_billing_page_views = i11;
    }

    public final void setVar_buy_coffee(boolean z11) {
        this.var_buy_coffee = z11;
    }

    public final void setVar_news_feed_read_ids(String str) {
        m.f(str, "<set-?>");
        this.var_news_feed_read_ids = str;
    }

    public UserAppDataResponse(String user_image, String user_nickname, String user_joined, boolean z11, int i11, String var_news_feed_read_ids, String setting_learning_lan, String setting_uilan, String setting_reminders, boolean z12, boolean z13) {
        m.f(user_image, "user_image");
        m.f(user_nickname, "user_nickname");
        m.f(user_joined, "user_joined");
        m.f(var_news_feed_read_ids, "var_news_feed_read_ids");
        m.f(setting_learning_lan, "setting_learning_lan");
        m.f(setting_uilan, "setting_uilan");
        m.f(setting_reminders, "setting_reminders");
        this.user_image = user_image;
        this.user_nickname = user_nickname;
        this.user_joined = user_joined;
        this.var_buy_coffee = z11;
        this.var_billing_page_views = i11;
        this.var_news_feed_read_ids = var_news_feed_read_ids;
        this.setting_learning_lan = setting_learning_lan;
        this.setting_uilan = setting_uilan;
        this.setting_reminders = setting_reminders;
        this.setting_soundffect = z12;
        this.setting_show_leaderboard = z13;
    }

    public String toString() {
        String str = this.user_image;
        String str2 = this.user_nickname;
        String str3 = this.user_joined;
        boolean z11 = this.var_buy_coffee;
        int i11 = this.var_billing_page_views;
        String str4 = this.var_news_feed_read_ids;
        String str5 = this.setting_learning_lan;
        String str6 = this.setting_uilan;
        String str7 = this.setting_reminders;
        boolean z12 = this.setting_soundffect;
        boolean z13 = this.setting_show_leaderboard;
        StringBuilder sbS = e.s("UserAppDataResponse(user_image=", str, ", user_nickname=", str2, ", user_joined=");
        sbS.append(str3);
        sbS.append(tcppUUQxZjFdy.nJxdLGkoSujQjJ);
        sbS.append(z11);
        sbS.append(", var_billing_page_views=");
        sbS.append(i11);
        sbS.append(", var_news_feed_read_ids=");
        sbS.append(str4);
        sbS.append(", setting_learning_lan=");
        d.w(sbS, str5, ", setting_uilan=", str6, ", setting_reminders=");
        sbS.append(str7);
        sbS.append(", setting_soundffect=");
        sbS.append(z12);
        sbS.append(", setting_show_leaderboard=");
        return p0.p(sbS, z13, ")");
    }

    public /* synthetic */ UserAppDataResponse(String str, String str2, String str3, boolean z11, int i11, String str4, String str5, String str6, String str7, boolean z12, boolean z13, int i12, f fVar) {
        this((i12 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i12 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i12 & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i12 & 8) != 0 ? false : z11, (i12 & 16) != 0 ? 0 : i11, (i12 & 32) != 0 ? BuildConfig.VERSION_NAME : str4, (i12 & 64) != 0 ? BuildConfig.VERSION_NAME : str5, (i12 & 128) != 0 ? BuildConfig.VERSION_NAME : str6, (i12 & 256) != 0 ? BuildConfig.VERSION_NAME : str7, (i12 & 512) != 0 ? false : z12, (i12 & 1024) != 0 ? false : z13);
    }
}
