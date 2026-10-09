package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzp implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzq f9036a;

    public /* synthetic */ zzp(zzq zzqVar) {
        this.f9036a = zzqVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i11 = message.what;
        if (i11 == 0) {
            zzq zzqVar = this.f9036a;
            synchronized (zzqVar.f9037d) {
                try {
                    zzn zznVar = (zzn) message.obj;
                    zzo zzoVar = (zzo) zzqVar.f9037d.get(zznVar);
                    if (zzoVar != null && zzoVar.f9029a.isEmpty()) {
                        if (zzoVar.f9031c) {
                            zzn zznVar2 = zzoVar.f9033e;
                            zzq zzqVar2 = zzoVar.f9035t;
                            zzqVar2.f9039f.removeMessages(1, zznVar2);
                            zzqVar2.f9040g.c(zzqVar2.f9038e, zzoVar);
                            zzoVar.f9031c = false;
                            zzoVar.f9030b = 2;
                        }
                        zzqVar.f9037d.remove(zznVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        if (i11 != 1) {
            return false;
        }
        zzq zzqVar3 = this.f9036a;
        synchronized (zzqVar3.f9037d) {
            try {
                zzn zznVar3 = (zzn) message.obj;
                zzo zzoVar2 = (zzo) zzqVar3.f9037d.get(zznVar3);
                if (zzoVar2 != null && zzoVar2.f9030b == 3) {
                    new StringBuilder(String.valueOf(zznVar3).length() + 47);
                    new Exception();
                    ComponentName componentName = zzoVar2.f9034f;
                    if (componentName == null) {
                        zznVar3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = zznVar3.f9027b;
                        Preconditions.g(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    zzoVar2.onServiceDisconnected(componentName);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }
}
