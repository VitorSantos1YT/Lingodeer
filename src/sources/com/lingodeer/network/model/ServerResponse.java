package com.lingodeer.network.model;

import com.lingodeer.network.model.ServerResult;
import com.tbruyelle.rxpermissions3.BuildConfig;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ServerResponse<F, T extends ServerResult<F>> {
    private final String error;
    private final T result;
    private final String servertime;
    private final int status;

    public ServerResponse(T result, int i11, String error, String servertime) {
        m.f(result, "result");
        m.f(error, "error");
        m.f(servertime, "servertime");
        this.result = result;
        this.status = i11;
        this.error = error;
        this.servertime = servertime;
    }

    public final String getError() {
        return this.error;
    }

    public final T getResult() {
        return this.result;
    }

    public final String getServertime() {
        return this.servertime;
    }

    public final int getStatus() {
        return this.status;
    }

    public /* synthetic */ ServerResponse(ServerResult serverResult, int i11, String str, String str2, int i12, f fVar) {
        this(serverResult, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? BuildConfig.VERSION_NAME : str, (i12 & 8) != 0 ? BuildConfig.VERSION_NAME : str2);
    }
}
