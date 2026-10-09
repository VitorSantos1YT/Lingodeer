package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzq extends GmsClientSupervisor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f9037d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f9038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile com.google.android.gms.internal.common.zzg f9039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConnectionTracker f9040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f9042i;

    public zzq(Context context, Looper looper) {
        zzp zzpVar = new zzp(this);
        this.f9038e = context.getApplicationContext();
        com.google.android.gms.internal.common.zzg zzgVar = new com.google.android.gms.internal.common.zzg(looper, zzpVar);
        Looper.getMainLooper();
        this.f9039f = zzgVar;
        this.f9040g = ConnectionTracker.b();
        this.f9041h = 5000L;
        this.f9042i = 300000L;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final ConnectionResult b(zzn zznVar, zze zzeVar, String str, Executor executor) {
        ConnectionResult connectionResultA;
        HashMap map = this.f9037d;
        synchronized (map) {
            try {
                zzo zzoVar = (zzo) map.get(zznVar);
                if (executor == null) {
                    executor = null;
                }
                if (zzoVar == null) {
                    zzoVar = new zzo(this, zznVar);
                    zzoVar.f9029a.put(zzeVar, zzeVar);
                    connectionResultA = zzoVar.a(str, executor);
                    map.put(zznVar, zzoVar);
                } else {
                    this.f9039f.removeMessages(0, zznVar);
                    if (zzoVar.f9029a.containsKey(zzeVar)) {
                        String string = zznVar.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(string);
                        throw new IllegalStateException(sb2.toString());
                    }
                    zzoVar.f9029a.put(zzeVar, zzeVar);
                    int i11 = zzoVar.f9030b;
                    if (i11 == 1) {
                        zzeVar.onServiceConnected(zzoVar.f9034f, zzoVar.f9032d);
                    } else if (i11 == 2) {
                        connectionResultA = zzoVar.a(str, executor);
                    }
                    connectionResultA = null;
                }
                if (zzoVar.f9031c) {
                    return ConnectionResult.f8629f;
                }
                if (connectionResultA == null) {
                    connectionResultA = new ConnectionResult(-1, null, null);
                }
                return connectionResultA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void c(zzn zznVar, ServiceConnection serviceConnection) {
        Preconditions.h(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f9037d;
        synchronized (map) {
            try {
                zzo zzoVar = (zzo) map.get(zznVar);
                if (zzoVar == null) {
                    String string = zznVar.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(string);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!zzoVar.f9029a.containsKey(serviceConnection)) {
                    String string2 = zznVar.toString();
                    StringBuilder sb3 = new StringBuilder(string2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(string2);
                    throw new IllegalStateException(sb3.toString());
                }
                zzoVar.f9029a.remove(serviceConnection);
                if (zzoVar.f9029a.isEmpty()) {
                    this.f9039f.sendMessageDelayed(this.f9039f.obtainMessage(0, zznVar), this.f9041h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
