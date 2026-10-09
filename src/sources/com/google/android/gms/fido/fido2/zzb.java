package com.google.android.gms.fido.fido2;

import android.os.Parcel;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzb implements RemoteCall {
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        zzj zzjVar = new zzj(taskCompletionSource);
        com.google.android.gms.internal.fido.zzs zzsVar = (com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) anyClient).y();
        Parcel parcelG = zzsVar.g();
        ClassLoader classLoader = com.google.android.gms.internal.fido.zzc.f9678a;
        parcelG.writeStrongBinder(zzjVar);
        zzsVar.h(parcelG, 3);
    }
}
