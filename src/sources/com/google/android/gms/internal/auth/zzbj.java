package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzbj extends BaseImplementation.ApiMethodImpl {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        a((Result) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result d(Status status) {
        return new zzbv(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void k(Api.AnyClient anyClient) {
        zzbe zzbeVar = (zzbe) anyClient;
        Context context = zzbeVar.f8889c;
        m((zzbh) zzbeVar.y());
    }

    public abstract void m(zzbh zzbhVar);
}
