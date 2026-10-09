package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GmsClient;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzam extends GmsClient {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean C() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int m() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface s(IBinder iBinder) {
        int i11 = com.google.android.gms.auth.account.zzd.f8350a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.auth.account.zze ? (com.google.android.gms.auth.account.zze) iInterfaceQueryLocalInterface : new com.google.android.gms.auth.account.zzc(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] u() {
        return new Feature[]{com.google.android.gms.auth.zze.f8561d};
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String z() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }
}
