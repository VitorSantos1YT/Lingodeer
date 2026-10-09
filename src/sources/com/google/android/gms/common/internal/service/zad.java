package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import com.google.android.gms.common.api.Api;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zad extends zag {
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void k(Api.AnyClient anyClient) {
        zan zanVar = (zan) ((zai) anyClient).y();
        zae zaeVar = new zae(this);
        Parcel parcelG = zanVar.g();
        com.google.android.gms.internal.base.zac.c(parcelG, zaeVar);
        zanVar.h(parcelG);
    }
}
