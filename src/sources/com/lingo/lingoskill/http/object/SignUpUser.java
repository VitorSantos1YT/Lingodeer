package com.lingo.lingoskill.http.object;

import android.content.Context;
import android.text.TextUtils;
import com.lingodeer.data.env.Env;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SignUpUser {
    private String error;
    private String law_age;
    private String law_from;
    private String learninglan;
    private String multi_account_flag;
    private String nickname;
    private String servertime;
    private String status;
    private String uid;
    private String uilan;

    public String getError() {
        return this.error;
    }

    public String getLaw_age() {
        return this.law_age;
    }

    public String getLaw_from() {
        return this.law_from;
    }

    public String getLearninglan() {
        return this.learninglan;
    }

    public String getMulti_account_flag() {
        return this.multi_account_flag;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getServertime() {
        return this.servertime;
    }

    public String getStatus() {
        return this.status;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUilan() {
        return this.uilan;
    }

    public void setError(String str) {
        this.error = str;
    }

    public void setLaw_age(String str) {
        this.law_age = str;
    }

    public void setLaw_from(String str) {
        this.law_from = str;
    }

    public void setLearninglan(String str) {
        this.learninglan = str;
    }

    public void setMulti_account_flag(String str) {
        this.multi_account_flag = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setServertime(String str) {
        this.servertime = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUilan(String str) {
        this.uilan = str;
    }

    public void updateEnv(Env env, Context context) {
        env.uid = this.uid;
        env.accountType = "lingoDeer";
        env.nickName = this.nickname;
        if (!TextUtils.isEmpty(this.law_from)) {
            env.regin = this.law_from;
            env.updateEntry("regin");
            if (TextUtils.isEmpty(this.law_age)) {
                env.age = Integer.parseInt(this.law_age);
                env.updateEntry("age");
            }
        }
        env.updateEntry("uid");
        env.updateEntry("accountType");
        env.updateEntry("nickName");
    }
}
