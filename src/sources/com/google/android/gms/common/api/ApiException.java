package com.google.android.gms.common.api;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ApiException extends Exception {

    @Deprecated
    protected final Status mStatus;

    public ApiException(Status status) {
        int i11 = status.f8706a;
        String str = status.f8707b;
        str = str == null ? BuildConfig.VERSION_NAME : str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 2 + String.valueOf(str).length());
        sb2.append(i11);
        sb2.append(": ");
        sb2.append(str);
        super(sb2.toString());
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.f8706a;
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.f8707b;
    }
}
