package com.lingodeer.network.model;

import com.tbruyelle.rxpermissions3.BuildConfig;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ServerResult<T> {
    private String error;
    private String servertime;
    private int status;

    public ServerResult() {
        this(0, null, null, 7, null);
    }

    public abstract T converter();

    public final String getError() {
        return this.error;
    }

    public final String getServertime() {
        return this.servertime;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setError(String str) {
        m.f(str, "<set-?>");
        this.error = str;
    }

    public final void setServertime(String str) {
        m.f(str, "<set-?>");
        this.servertime = str;
    }

    public final void setStatus(int i11) {
        this.status = i11;
    }

    public ServerResult(int i11, String error, String servertime) {
        m.f(error, "error");
        m.f(servertime, "servertime");
        this.status = i11;
        this.error = error;
        this.servertime = servertime;
    }

    public /* synthetic */ ServerResult(int i11, String str, String str2, int i12, f fVar) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? BuildConfig.VERSION_NAME : str, (i12 & 4) != 0 ? BuildConfig.VERSION_NAME : str2);
    }
}
