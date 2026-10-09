package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzi extends GmsClient<zzam> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final String f11111e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final zzbg f11112f0;

    public zzi(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, ClientSettings clientSettings) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f11112f0 = new zzh(this);
        this.f11111e0 = str;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int m() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof zzam ? (zzam) iInterfaceQueryLocalInterface : new zzal(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] u() {
        return com.google.android.gms.location.zzu.f12590a;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle w() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f11111e0);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String z() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }
}
