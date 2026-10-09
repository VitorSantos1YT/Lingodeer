package com.google.android.gms.fido.u2f;

import android.os.Parcel;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.fido.zzw;
import com.google.android.gms.internal.fido.zzy;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zza implements RemoteCall {
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        zzd zzdVar = new zzd(taskCompletionSource);
        zzw zzwVar = (zzw) ((zzy) anyClient).y();
        Parcel parcelG = zzwVar.g();
        ClassLoader classLoader = com.google.android.gms.internal.fido.zzc.f9678a;
        parcelG.writeStrongBinder(zzdVar);
        parcelG.writeInt(0);
        zzwVar.h(parcelG, 2);
    }
}
