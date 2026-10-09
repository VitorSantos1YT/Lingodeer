package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzp f8597a;

    public /* synthetic */ zzj(zzp zzpVar) {
        this.f8597a = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            final zzp zzpVar = this.f8597a;
            synchronized (zzpVar) {
                try {
                    if (zzpVar.f8603a != 2) {
                        return;
                    }
                    if (zzpVar.f8606d.isEmpty()) {
                        zzpVar.c();
                        return;
                    }
                    final zzs zzsVar = (zzs) zzpVar.f8606d.poll();
                    zzpVar.f8607e.put(zzsVar.f8611a, zzsVar);
                    zzpVar.f8608f.f8617b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzn
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzp zzpVar2 = zzpVar;
                            int i11 = zzsVar.f8611a;
                            synchronized (zzpVar2) {
                                zzs zzsVar2 = (zzs) zzpVar2.f8607e.get(i11);
                                if (zzsVar2 != null) {
                                    zzpVar2.f8607e.remove(i11);
                                    zzsVar2.c(new zzt("Timed out waiting for response", null));
                                    zzpVar2.c();
                                }
                            }
                        }
                    }, 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(zzsVar));
                    }
                    zzv zzvVar = zzpVar.f8608f;
                    Messenger messenger = zzpVar.f8604b;
                    int i11 = zzsVar.f8613c;
                    Context context = zzvVar.f8616a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i11;
                    messageObtain.arg1 = zzsVar.f8611a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", zzsVar.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", zzsVar.f8614d);
                    messageObtain.setData(bundle);
                    try {
                        zzq zzqVar = zzpVar.f8605c;
                        Messenger messenger2 = zzqVar.f8609a;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            zzd zzdVar = zzqVar.f8610b;
                            if (zzdVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = zzdVar.f8584a;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e8) {
                        zzpVar.a(e8.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
