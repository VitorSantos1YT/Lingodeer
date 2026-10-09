package com.lingo.lingoskill.object;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class OldData {
    private String continuedays = BuildConfig.VERSION_NAME;
    private int total_seconds = 0;
    private int total_xp = 0;

    public String getContinuedays() {
        return this.continuedays;
    }

    public int getTotal_seconds() {
        return this.total_seconds;
    }

    public int getTotal_xp() {
        return this.total_xp;
    }

    public void setContinuedays(String str) {
        this.continuedays = str;
    }

    public void setTotal_seconds(int i11) {
        this.total_seconds = i11;
    }

    public void setTotal_xp(int i11) {
        this.total_xp = i11;
    }
}
