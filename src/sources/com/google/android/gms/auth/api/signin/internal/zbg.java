package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zbg extends zbl {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result d(Status status) {
        return new GoogleSignInResult(null, status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void k(Api.AnyClient anyClient) {
        zbs zbsVar = (zbs) ((zbe) anyClient).y();
        zbf zbfVar = new zbf(this);
        Parcel parcelG = zbsVar.g();
        int i11 = com.google.android.gms.internal.p000authapi.zbc.f9415a;
        parcelG.writeStrongBinder(zbfVar);
        parcelG.writeInt(0);
        zbsVar.h(parcelG, 101);
    }
}
