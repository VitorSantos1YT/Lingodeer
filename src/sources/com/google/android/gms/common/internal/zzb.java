package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzb extends com.google.android.gms.internal.common.zzg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f9010a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.f9010a = baseGmsClient;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        zzc zzcVar;
        BaseGmsClient baseGmsClient = this.f9010a;
        if (baseGmsClient.Z.get() != message.arg1) {
            int i11 = message.what;
            if ((i11 == 2 || i11 == 1 || i11 == 7) && (zzcVar = (zzc) message.obj) != null) {
                synchronized (zzcVar) {
                    zzcVar.f9011a = null;
                }
                BaseGmsClient baseGmsClient2 = zzcVar.f9013c;
                synchronized (baseGmsClient2.N) {
                    baseGmsClient2.N.remove(zzcVar);
                }
                return;
            }
            return;
        }
        int i12 = message.what;
        if ((i12 == 1 || i12 == 7 || i12 == 4 || i12 == 5) && !baseGmsClient.g()) {
            zzc zzcVar2 = (zzc) message.obj;
            if (zzcVar2 != null) {
                synchronized (zzcVar2) {
                    zzcVar2.f9011a = null;
                }
                BaseGmsClient baseGmsClient3 = zzcVar2.f9013c;
                synchronized (baseGmsClient3.N) {
                    baseGmsClient3.N.remove(zzcVar2);
                }
                return;
            }
            return;
        }
        int i13 = message.what;
        if (i13 == 4) {
            baseGmsClient.W = new ConnectionResult(message.arg2, null, null);
            if (!baseGmsClient.X && !TextUtils.isEmpty(baseGmsClient.z()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(baseGmsClient.z());
                    if (!baseGmsClient.X) {
                        baseGmsClient.E(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ConnectionResult connectionResult = baseGmsClient.W;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8, null, null);
            }
            baseGmsClient.L.a(connectionResult);
            System.currentTimeMillis();
            return;
        }
        if (i13 == 5) {
            ConnectionResult connectionResult2 = baseGmsClient.W;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8, null, null);
            }
            baseGmsClient.L.a(connectionResult2);
            System.currentTimeMillis();
            return;
        }
        if (i13 == 3) {
            Object obj = message.obj;
            baseGmsClient.L.a(new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i13 == 6) {
            baseGmsClient.E(5, null);
            BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks = baseGmsClient.Q;
            if (baseConnectionCallbacks != null) {
                baseConnectionCallbacks.g(message.arg2);
            }
            System.currentTimeMillis();
            baseGmsClient.D(5, 1, null);
            return;
        }
        if (i13 == 2 && !baseGmsClient.c()) {
            zzc zzcVar3 = (zzc) message.obj;
            if (zzcVar3 != null) {
                synchronized (zzcVar3) {
                    zzcVar3.f9011a = null;
                }
                BaseGmsClient baseGmsClient4 = zzcVar3.f9013c;
                synchronized (baseGmsClient4.N) {
                    baseGmsClient4.N.remove(zzcVar3);
                }
                return;
            }
            return;
        }
        int i14 = message.what;
        if (i14 != 2 && i14 != 1 && i14 != 7) {
            Log.wtf("GmsClient", e.g(i14, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i14).length() + 34)), new Exception());
            return;
        }
        zzc zzcVar4 = (zzc) message.obj;
        synchronized (zzcVar4) {
            try {
                bool = zzcVar4.f9011a;
                if (zzcVar4.f9012b) {
                    new StringBuilder(zzcVar4.toString().length() + 47);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bool != null) {
            zzcVar4.a(bool);
        }
        synchronized (zzcVar4) {
            zzcVar4.f9012b = true;
        }
        synchronized (zzcVar4) {
            zzcVar4.f9011a = null;
        }
        BaseGmsClient baseGmsClient5 = zzcVar4.f9013c;
        synchronized (baseGmsClient5.N) {
            baseGmsClient5.N.remove(zzcVar4);
        }
    }
}
