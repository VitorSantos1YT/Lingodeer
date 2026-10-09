package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzf extends zza {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f9018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f9019h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(BaseGmsClient baseGmsClient, int i11, IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i11, bundle);
        this.f9019h = baseGmsClient;
        this.f9018g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.zza
    public final boolean b() {
        IBinder iBinder = this.f9018g;
        try {
            Preconditions.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            BaseGmsClient baseGmsClient = this.f9019h;
            if (!baseGmsClient.z().equals(interfaceDescriptor)) {
                new StringBuilder(baseGmsClient.z().length() + 34 + String.valueOf(interfaceDescriptor).length());
                return false;
            }
            IInterface iInterfaceS = baseGmsClient.s(iBinder);
            if (iInterfaceS != null && (baseGmsClient.D(2, 4, iInterfaceS) || baseGmsClient.D(3, 4, iInterfaceS))) {
                baseGmsClient.W = null;
                BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks = baseGmsClient.Q;
                if (baseConnectionCallbacks == null) {
                    return true;
                }
                baseConnectionCallbacks.h();
                return true;
            }
            return false;
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.zza
    public final void c(ConnectionResult connectionResult) {
        BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener = this.f9019h.R;
        if (baseOnConnectionFailedListener != null) {
            baseOnConnectionFailedListener.j(connectionResult);
        }
        System.currentTimeMillis();
    }
}
