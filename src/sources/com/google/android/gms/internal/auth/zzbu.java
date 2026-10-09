package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzbu implements ProxyApi.ProxyResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f9452a;

    public zzbu(Status status) {
        this.f9452a = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f9452a;
    }

    public zzbu() {
        this.f9452a = Status.f8703e;
    }
}
