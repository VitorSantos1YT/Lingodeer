package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zbk extends zbl {
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void k(Api.AnyClient anyClient) {
        zbe zbeVar = (zbe) anyClient;
        zbs zbsVar = (zbs) zbeVar.y();
        zbj zbjVar = new zbj(this);
        GoogleSignInOptions googleSignInOptions = zbeVar.f8543e0;
        Parcel parcelG = zbsVar.g();
        int i11 = com.google.android.gms.internal.p000authapi.zbc.f9415a;
        parcelG.writeStrongBinder(zbjVar);
        com.google.android.gms.internal.p000authapi.zbc.b(parcelG, googleSignInOptions);
        zbsVar.h(parcelG, 103);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result d(Status status) {
        return status;
    }
}
