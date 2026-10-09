package com.google.android.gms.auth.api;

import com.google.android.gms.common.api.Api;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class Auth {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Api f8351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.auth.api.signin.internal.zbd f8352b;

    static {
        new Api.ClientKey();
        Api.ClientKey clientKey = new Api.ClientKey();
        new zba();
        zbb zbbVar = new zbb();
        Api api = AuthProxy.f8353a;
        f8351a = new Api("Auth.GOOGLE_SIGN_IN_API", zbbVar, clientKey);
        Api api2 = AuthProxy.f8353a;
        f8352b = new com.google.android.gms.auth.api.signin.internal.zbd();
    }

    private Auth() {
    }
}
