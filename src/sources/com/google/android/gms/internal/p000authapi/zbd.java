package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zbd extends GmsClient {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final com.google.android.gms.auth.api.zbd f9416e0;

    public zbd(Context context, Looper looper, ClientSettings clientSettings, com.google.android.gms.auth.api.zbd zbdVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, clientSettings, connectionCallbacks, onConnectionFailedListener);
        zbdVar = zbdVar == null ? com.google.android.gms.auth.api.zbd.f8555c : zbdVar;
        zbc zbcVar = new zbc();
        zbcVar.f8553a = Boolean.FALSE;
        zbcVar.f8553a = Boolean.valueOf(zbdVar.f8556a);
        zbcVar.f8554b = zbdVar.f8557b;
        zbcVar.f8554b = zbaw.a();
        this.f9416e0 = new com.google.android.gms.auth.api.zbd(zbcVar);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int m() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof zbe ? (zbe) iInterfaceQueryLocalInterface : new zbe(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle w() {
        com.google.android.gms.auth.api.zbd zbdVar = this.f9416e0;
        zbdVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", zbdVar.f8556a);
        bundle.putString("log_session_id", zbdVar.f8557b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String z() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }
}
