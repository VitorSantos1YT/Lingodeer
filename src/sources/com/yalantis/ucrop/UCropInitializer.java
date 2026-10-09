package com.yalantis.ucrop;

import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class UCropInitializer {
    public UCropInitializer setOkHttpClient(OkHttpClient okHttpClient) {
        OkHttpClientStore.INSTANCE.setClient(okHttpClient);
        return this;
    }
}
