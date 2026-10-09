package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzp implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8603a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Messenger f8604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzq f8605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f8606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f8607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzv f8608f;

    public zzp(zzv zzvVar) {
        this.f8608f = zzvVar;
        com.google.android.gms.internal.cloudmessaging.zzf zzfVar = new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzm
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i11 = message.arg1;
                zzp zzpVar = this.f8600a;
                synchronized (zzpVar) {
                    try {
                        zzs zzsVar = (zzs) zzpVar.f8607e.get(i11);
                        if (zzsVar == null) {
                            return true;
                        }
                        zzpVar.f8607e.remove(i11);
                        zzpVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            zzsVar.c(new zzt("Not supported by GmsCore", null));
                            return true;
                        }
                        zzsVar.a(data);
                        return true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.f8604b = new Messenger(zzfVar);
        this.f8606d = new ArrayDeque();
        this.f8607e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i11 = this.f8603a;
            if (i11 == 0) {
                throw new IllegalStateException();
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f8603a = 4;
                return;
            }
            this.f8603a = 4;
            ConnectionTracker.b().c(this.f8608f.f8616a, this);
            zzt zztVar = new zzt(str, securityException);
            Iterator it = this.f8606d.iterator();
            while (it.hasNext()) {
                ((zzs) it.next()).c(zztVar);
            }
            this.f8606d.clear();
            for (int i12 = 0; i12 < this.f8607e.size(); i12++) {
                ((zzs) this.f8607e.valueAt(i12)).c(zztVar);
            }
            this.f8607e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() {
        if (this.f8603a == 2 && this.f8606d.isEmpty() && this.f8607e.size() == 0) {
            this.f8603a = 3;
            ConnectionTracker.b().c(this.f8608f.f8616a, this);
        }
    }

    public final synchronized boolean d(zzs zzsVar) {
        int i11 = this.f8603a;
        if (i11 != 0) {
            if (i11 == 1) {
                this.f8606d.add(zzsVar);
                return true;
            }
            if (i11 != 2) {
                return false;
            }
            this.f8606d.add(zzsVar);
            this.f8608f.f8617b.execute(new zzj(this));
            return true;
        }
        this.f8606d.add(zzsVar);
        Preconditions.j(this.f8603a == 0);
        this.f8603a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ConnectionTracker.b().a(this.f8608f.f8616a, intent, this, 1)) {
                this.f8608f.f8617b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzp zzpVar = this.f8598a;
                        synchronized (zzpVar) {
                            if (zzpVar.f8603a == 1) {
                                zzpVar.a("Timed out while binding");
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e8) {
            b("Unable to bind to service", e8);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f8608f.f8617b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
            @Override // java.lang.Runnable
            public final void run() {
                zzp zzpVar = this.f8595a;
                IBinder iBinder2 = iBinder;
                synchronized (zzpVar) {
                    if (iBinder2 == null) {
                        zzpVar.a("Null service connection");
                        return;
                    }
                    try {
                        zzpVar.f8605c = new zzq(iBinder2);
                        zzpVar.f8603a = 2;
                        zzpVar.f8608f.f8617b.execute(new zzj(zzpVar));
                    } catch (RemoteException e8) {
                        zzpVar.a(e8.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f8608f.f8617b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzl
            @Override // java.lang.Runnable
            public final void run() {
                this.f8599a.a("Service disconnected");
            }
        });
    }
}
