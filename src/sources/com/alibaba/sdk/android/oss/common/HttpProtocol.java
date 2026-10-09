package com.alibaba.sdk.android.oss.common;

import com.adjust.sdk.Constants;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum HttpProtocol {
    HTTP("http"),
    HTTPS(Constants.SCHEME);

    private final String httpProtocol;

    HttpProtocol(String str) {
        this.httpProtocol = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.httpProtocol;
    }
}
