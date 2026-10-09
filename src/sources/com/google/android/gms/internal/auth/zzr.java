package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzr implements RemoteCall {
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        zzp zzpVar = (zzp) ((zzi) anyClient).y();
        zzaa zzaaVar = new zzaa(taskCompletionSource);
        Parcel parcelG = zzpVar.g();
        zzc.c(parcelG, zzaaVar);
        parcelG.writeInt(0);
        zzpVar.h(parcelG, 6);
    }
}
