package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GmsClient;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzi extends GmsClient {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean B() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean C() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void f(String str) {
        "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str));
        super.f(str);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int m() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return iInterfaceQueryLocalInterface instanceof zzp ? (zzp) iInterfaceQueryLocalInterface : new zzp(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] u() {
        return new Feature[]{com.google.android.gms.auth.zze.f8560c, com.google.android.gms.auth.zze.f8559b, com.google.android.gms.auth.zze.f8558a};
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String z() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }
}
