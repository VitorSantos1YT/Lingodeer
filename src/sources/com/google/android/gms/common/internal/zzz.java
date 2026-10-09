package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzz extends com.google.android.gms.internal.common.zzb implements IGmsCallbacks {
    public zzz() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean g(int i11, Parcel parcel, Parcel parcel2) {
        if (i11 == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) com.google.android.gms.internal.common.zzc.a(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.zzc.c(parcel);
            zzd zzdVar = (zzd) this;
            Preconditions.h(zzdVar.f9014a, "onPostInitComplete can be called only once per call to getRemoteService");
            BaseGmsClient baseGmsClient = zzdVar.f9014a;
            int i13 = zzdVar.f9015b;
            baseGmsClient.getClass();
            zzf zzfVar = new zzf(baseGmsClient, i12, strongBinder, bundle);
            Handler handler = baseGmsClient.f8892f;
            handler.sendMessage(handler.obtainMessage(1, i13, -1, zzfVar));
            zzdVar.f9014a = null;
        } else if (i11 == 2) {
            parcel.readInt();
            com.google.android.gms.internal.common.zzc.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i11 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzj zzjVar = (zzj) com.google.android.gms.internal.common.zzc.a(parcel, zzj.CREATOR);
            com.google.android.gms.internal.common.zzc.c(parcel);
            zzd zzdVar2 = (zzd) this;
            BaseGmsClient baseGmsClient2 = zzdVar2.f9014a;
            Preconditions.h(baseGmsClient2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            Preconditions.g(zzjVar);
            baseGmsClient2.Y = zzjVar;
            if (baseGmsClient2.C()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.f9025d;
                RootTelemetryConfigManager rootTelemetryConfigManagerA = RootTelemetryConfigManager.a();
                RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.f8910a;
                synchronized (rootTelemetryConfigManagerA) {
                    try {
                        if (rootTelemetryConfiguration == null) {
                            rootTelemetryConfiguration = RootTelemetryConfigManager.f8946c;
                        } else {
                            RootTelemetryConfiguration rootTelemetryConfiguration2 = rootTelemetryConfigManagerA.f8947a;
                            if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.f8948a < rootTelemetryConfiguration.f8948a) {
                            }
                        }
                        rootTelemetryConfigManagerA.f8947a = rootTelemetryConfiguration;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            Bundle bundle2 = zzjVar.f9022a;
            Preconditions.h(zzdVar2.f9014a, "onPostInitComplete can be called only once per call to getRemoteService");
            BaseGmsClient baseGmsClient3 = zzdVar2.f9014a;
            int i15 = zzdVar2.f9015b;
            baseGmsClient3.getClass();
            zzf zzfVar2 = new zzf(baseGmsClient3, i14, strongBinder2, bundle2);
            Handler handler2 = baseGmsClient3.f8892f;
            handler2.sendMessage(handler2.obtainMessage(1, i15, -1, zzfVar2));
            zzdVar2.f9014a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
