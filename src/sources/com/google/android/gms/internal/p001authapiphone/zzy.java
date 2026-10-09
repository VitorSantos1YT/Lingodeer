package com.google.android.gms.internal.p001authapiphone;

import android.os.Parcel;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzy implements RemoteCall {
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        zzh zzhVar = (zzh) ((zzw) anyClient).y();
        zzaa zzaaVar = new zzaa(taskCompletionSource);
        Parcel parcelG = zza.g();
        parcelG.writeString(null);
        int i11 = zzc.f9378a;
        parcelG.writeStrongBinder(zzaaVar);
        zzhVar.h(parcelG, 2);
    }
}
