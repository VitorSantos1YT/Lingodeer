package com.lingodeer.network.model;

import com.tbruyelle.rxpermissions3.BuildConfig;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ApiPostContent {
    private String caller = BuildConfig.VERSION_NAME;
    private String enKey = BuildConfig.VERSION_NAME;
    private String enIV = BuildConfig.VERSION_NAME;
    private String enContent = BuildConfig.VERSION_NAME;

    public final String getCaller() {
        return this.caller;
    }

    public final String getEnContent() {
        return this.enContent;
    }

    public final String getEnIV() {
        return this.enIV;
    }

    public final String getEnKey() {
        return this.enKey;
    }

    public final void setCaller(String str) {
        m.f(str, "<set-?>");
        this.caller = str;
    }

    public final void setEnContent(String str) {
        m.f(str, "<set-?>");
        this.enContent = str;
    }

    public final void setEnIV(String str) {
        m.f(str, "<set-?>");
        this.enIV = str;
    }

    public final void setEnKey(String str) {
        m.f(str, "<set-?>");
        this.enKey = str;
    }
}
