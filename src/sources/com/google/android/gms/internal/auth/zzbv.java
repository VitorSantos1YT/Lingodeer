package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbv implements ProxyApi.SpatulaHeaderResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f9453a;

    public zzbv(Status status) {
        Preconditions.g(status);
        this.f9453a = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f9453a;
    }

    public zzbv(String str) {
        Preconditions.g(str);
        this.f9453a = Status.f8703e;
    }
}
