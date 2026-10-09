package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzo implements ServiceConnection, zzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f9032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzn f9033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComponentName f9034f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzq f9035t;

    public zzo(zzq zzqVar, zzn zznVar) {
        java.util.Objects.requireNonNull(zzqVar);
        this.f9035t = zzqVar;
        this.f9033e = zznVar;
        this.f9029a = new HashMap();
        this.f9030b = 2;
    }

    public final ConnectionResult a(String str, Executor executor) throws Throwable {
        try {
            Intent intentA = zzah.a(this.f9035t.f9038e, this.f9033e);
            this.f9030b = 3;
            StrictMode.VmPolicy vmPolicyA = com.google.android.gms.common.util.zzd.a();
            try {
                zzq zzqVar = this.f9035t;
                ConnectionTracker connectionTracker = zzqVar.f9040g;
                Context context = zzqVar.f9038e;
                zzn zznVar = this.f9033e;
                try {
                    boolean zD = connectionTracker.d(context, str, intentA, this, 4225, executor);
                    this.f9031c = zD;
                    if (zD) {
                        zzqVar.f9039f.sendMessageDelayed(zzqVar.f9039f.obtainMessage(1, zznVar), zzqVar.f9042i);
                        ConnectionResult connectionResult = ConnectionResult.f8629f;
                        StrictMode.setVmPolicy(vmPolicyA);
                        return connectionResult;
                    }
                    this.f9030b = 2;
                    try {
                        zzqVar.f9040g.c(zzqVar.f9038e, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    ConnectionResult connectionResult2 = new ConnectionResult(16, null, null);
                    StrictMode.setVmPolicy(vmPolicyA);
                    return connectionResult2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    StrictMode.setVmPolicy(vmPolicyA);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (zzaf e8) {
            return e8.f9007a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzq zzqVar = this.f9035t;
        synchronized (zzqVar.f9037d) {
            try {
                zzqVar.f9039f.removeMessages(1, this.f9033e);
                this.f9032d = iBinder;
                this.f9034f = componentName;
                Iterator it = this.f9029a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f9030b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzq zzqVar = this.f9035t;
        synchronized (zzqVar.f9037d) {
            try {
                zzqVar.f9039f.removeMessages(1, this.f9033e);
                this.f9032d = null;
                this.f9034f = componentName;
                Iterator it = this.f9029a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f9030b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
