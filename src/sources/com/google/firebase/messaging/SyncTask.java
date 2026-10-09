package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class SyncTask implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f20528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseMessaging f20529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadPoolExecutor f20530d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ConnectivityChangeReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SyncTask f20531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Context f20532b;

        public final void a() {
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            SyncTask syncTask = this.f20531a;
            if (syncTask != null) {
                Context context = syncTask.f20529c.f20475c;
                this.f20532b = context;
                context.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            SyncTask syncTask = this.f20531a;
            if (syncTask != null && syncTask.a()) {
                SyncTask syncTask2 = this.f20531a;
                syncTask2.f20529c.getClass();
                FirebaseMessaging.b(syncTask2, 0L);
                Context context2 = this.f20532b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f20531a = null;
            }
        }
    }

    public SyncTask(FirebaseMessaging firebaseMessaging, long j11) {
        this.f20529c = firebaseMessaging;
        this.f20527a = j11;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f20475c.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f20528b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f20529c.f20475c.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            return this.f20529c.a() != null;
        } catch (IOException e8) {
            String message = e8.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                e8.getMessage();
                return false;
            }
            if (e8.getMessage() == null) {
                return false;
            }
            throw e8;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.f20528b;
        ServiceStarter serviceStarterA = ServiceStarter.a();
        FirebaseMessaging firebaseMessaging = this.f20529c;
        if (serviceStarterA.c(firebaseMessaging.f20475c)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f20482j = true;
                }
                if (!firebaseMessaging.f20481i.c()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f20482j = false;
                    }
                    if (ServiceStarter.a().c(firebaseMessaging.f20475c)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (ServiceStarter.a().b(firebaseMessaging.f20475c) && !a()) {
                    ConnectivityChangeReceiver connectivityChangeReceiver = new ConnectivityChangeReceiver();
                    connectivityChangeReceiver.f20531a = this;
                    connectivityChangeReceiver.a();
                    if (ServiceStarter.a().c(firebaseMessaging.f20475c)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f20482j = false;
                    }
                } else {
                    firebaseMessaging.j(this.f20527a);
                }
                if (ServiceStarter.a().c(firebaseMessaging.f20475c)) {
                    wakeLock.release();
                }
            } catch (IOException e8) {
                e8.getMessage();
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f20482j = false;
                    if (ServiceStarter.a().c(firebaseMessaging.f20475c)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th2) {
            if (ServiceStarter.a().c(firebaseMessaging.f20475c)) {
                wakeLock.release();
            }
            throw th2;
        }
    }
}
