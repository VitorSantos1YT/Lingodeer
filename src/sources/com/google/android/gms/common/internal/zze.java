package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zze implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f9017b;

    public zze(BaseGmsClient baseGmsClient, int i11) {
        this.f9017b = baseGmsClient;
        this.f9016a = i11;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i11;
        int i12;
        BaseGmsClient baseGmsClient = this.f9017b;
        if (iBinder == null) {
            synchronized (baseGmsClient.f8893t) {
                i11 = baseGmsClient.P;
            }
            if (i11 == 3) {
                baseGmsClient.X = true;
                i12 = 5;
            } else {
                i12 = 4;
            }
            Handler handler = baseGmsClient.f8892f;
            handler.sendMessage(handler.obtainMessage(i12, baseGmsClient.Z.get(), 16));
            return;
        }
        synchronized (baseGmsClient.H) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                baseGmsClient.K = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGmsServiceBroker)) ? new zzaa(iBinder) : (IGmsServiceBroker) iInterfaceQueryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        BaseGmsClient baseGmsClient2 = this.f9017b;
        int i13 = this.f9016a;
        baseGmsClient2.getClass();
        zzg zzgVar = new zzg(baseGmsClient2, 0, null);
        Handler handler2 = baseGmsClient2.f8892f;
        handler2.sendMessage(handler2.obtainMessage(7, i13, -1, zzgVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        BaseGmsClient baseGmsClient = this.f9017b;
        synchronized (baseGmsClient.H) {
            baseGmsClient.K = null;
        }
        BaseGmsClient baseGmsClient2 = this.f9017b;
        int i11 = this.f9016a;
        Handler handler = baseGmsClient2.f8892f;
        handler.sendMessage(handler.obtainMessage(6, i11, 1));
    }
}
