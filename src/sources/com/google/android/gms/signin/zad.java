package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Api.AbstractClientBuilder f13709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Api f13710b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        new Api.ClientKey();
        zaa zaaVar = new zaa();
        f13709a = zaaVar;
        new zab();
        new Scope(1, "profile");
        new Scope(1, "email");
        f13710b = new Api("SignIn.API", zaaVar, clientKey);
    }
}
