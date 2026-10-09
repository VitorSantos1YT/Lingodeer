package com.lingodeer.network.model;

import com.google.gson.JsonObject;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LeaderBoardResponse {
    private String curUserLevel;
    private String curUserWeekName;
    private String preUserLevel;
    private JsonObject user_dict_cur;
    private JsonObject user_dict_pre;

    public LeaderBoardResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ LeaderBoardResponse copy$default(LeaderBoardResponse leaderBoardResponse, String str, String str2, String str3, JsonObject jsonObject, JsonObject jsonObject2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = leaderBoardResponse.preUserLevel;
        }
        if ((i11 & 2) != 0) {
            str2 = leaderBoardResponse.curUserLevel;
        }
        if ((i11 & 4) != 0) {
            str3 = leaderBoardResponse.curUserWeekName;
        }
        if ((i11 & 8) != 0) {
            jsonObject = leaderBoardResponse.user_dict_pre;
        }
        if ((i11 & 16) != 0) {
            jsonObject2 = leaderBoardResponse.user_dict_cur;
        }
        JsonObject jsonObject3 = jsonObject2;
        String str4 = str3;
        return leaderBoardResponse.copy(str, str2, str4, jsonObject, jsonObject3);
    }

    public final String component1() {
        return this.preUserLevel;
    }

    public final String component2() {
        return this.curUserLevel;
    }

    public final String component3() {
        return this.curUserWeekName;
    }

    public final JsonObject component4() {
        return this.user_dict_pre;
    }

    public final JsonObject component5() {
        return this.user_dict_cur;
    }

    public final LeaderBoardResponse copy(String preUserLevel, String curUserLevel, String curUserWeekName, JsonObject user_dict_pre, JsonObject user_dict_cur) {
        m.f(preUserLevel, "preUserLevel");
        m.f(curUserLevel, "curUserLevel");
        m.f(curUserWeekName, "curUserWeekName");
        m.f(user_dict_pre, "user_dict_pre");
        m.f(user_dict_cur, "user_dict_cur");
        return new LeaderBoardResponse(preUserLevel, curUserLevel, curUserWeekName, user_dict_pre, user_dict_cur);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderBoardResponse)) {
            return false;
        }
        LeaderBoardResponse leaderBoardResponse = (LeaderBoardResponse) obj;
        return m.a(this.preUserLevel, leaderBoardResponse.preUserLevel) && m.a(this.curUserLevel, leaderBoardResponse.curUserLevel) && m.a(this.curUserWeekName, leaderBoardResponse.curUserWeekName) && m.a(this.user_dict_pre, leaderBoardResponse.user_dict_pre) && m.a(this.user_dict_cur, leaderBoardResponse.user_dict_cur);
    }

    public final String getCurUserLevel() {
        return this.curUserLevel;
    }

    public final String getCurUserWeekName() {
        return this.curUserWeekName;
    }

    public final String getPreUserLevel() {
        return this.preUserLevel;
    }

    public final JsonObject getUser_dict_cur() {
        return this.user_dict_cur;
    }

    public final JsonObject getUser_dict_pre() {
        return this.user_dict_pre;
    }

    public int hashCode() {
        return this.user_dict_cur.hashCode() + ((this.user_dict_pre.hashCode() + e.d(e.d(this.preUserLevel.hashCode() * 31, 31, this.curUserLevel), 31, this.curUserWeekName)) * 31);
    }

    public final void setCurUserLevel(String str) {
        m.f(str, "<set-?>");
        this.curUserLevel = str;
    }

    public final void setCurUserWeekName(String str) {
        m.f(str, "<set-?>");
        this.curUserWeekName = str;
    }

    public final void setPreUserLevel(String str) {
        m.f(str, "<set-?>");
        this.preUserLevel = str;
    }

    public final void setUser_dict_cur(JsonObject jsonObject) {
        m.f(jsonObject, "<set-?>");
        this.user_dict_cur = jsonObject;
    }

    public final void setUser_dict_pre(JsonObject jsonObject) {
        m.f(jsonObject, "<set-?>");
        this.user_dict_pre = jsonObject;
    }

    public String toString() {
        String str = this.preUserLevel;
        String str2 = this.curUserLevel;
        String str3 = this.curUserWeekName;
        JsonObject jsonObject = this.user_dict_pre;
        JsonObject jsonObject2 = this.user_dict_cur;
        StringBuilder sbS = e.s("LeaderBoardResponse(preUserLevel=", str, ", curUserLevel=", str2, ", curUserWeekName=");
        sbS.append(str3);
        sbS.append(", user_dict_pre=");
        sbS.append(jsonObject);
        sbS.append(", user_dict_cur=");
        sbS.append(jsonObject2);
        sbS.append(")");
        return sbS.toString();
    }

    public LeaderBoardResponse(String preUserLevel, String curUserLevel, String curUserWeekName, JsonObject user_dict_pre, JsonObject user_dict_cur) {
        m.f(preUserLevel, "preUserLevel");
        m.f(curUserLevel, "curUserLevel");
        m.f(curUserWeekName, "curUserWeekName");
        m.f(user_dict_pre, "user_dict_pre");
        m.f(user_dict_cur, "user_dict_cur");
        this.preUserLevel = preUserLevel;
        this.curUserLevel = curUserLevel;
        this.curUserWeekName = curUserWeekName;
        this.user_dict_pre = user_dict_pre;
        this.user_dict_cur = user_dict_cur;
    }

    public /* synthetic */ LeaderBoardResponse(String str, String str2, String str3, JsonObject jsonObject, JsonObject jsonObject2, int i11, f fVar) {
        this((i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i11 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i11 & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i11 & 8) != 0 ? new JsonObject() : jsonObject, (i11 & 16) != 0 ? new JsonObject() : jsonObject2);
    }
}
