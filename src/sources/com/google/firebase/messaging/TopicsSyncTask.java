package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class TopicsSyncTask implements Runnable {
    public static Boolean H;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f20550f = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Boolean f20551t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Metadata f20553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f20554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TopicsSubscriber f20555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20556e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class ConnectivityChangeReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TopicsSyncTask f20557a;

        @Override // android.content.BroadcastReceiver
        public final synchronized void onReceive(Context context, Intent intent) {
            TopicsSyncTask topicsSyncTask = this.f20557a;
            if (topicsSyncTask == null) {
                return;
            }
            if (topicsSyncTask.c()) {
                TopicsSyncTask topicsSyncTask2 = this.f20557a;
                topicsSyncTask2.f20555d.f20547f.schedule(topicsSyncTask2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f20557a = null;
            }
        }
    }

    public TopicsSyncTask(TopicsSubscriber topicsSubscriber, Context context, Metadata metadata, long j11) {
        this.f20555d = topicsSubscriber;
        this.f20552a = context;
        this.f20556e = j11;
        this.f20553b = metadata;
        this.f20554c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (f20550f) {
            try {
                Boolean bool = H;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                H = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context) {
        boolean zBooleanValue;
        synchronized (f20550f) {
            try {
                Boolean bool = f20551t;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                f20551t = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public final synchronized boolean c() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f20552a.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th2) {
            throw th2;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        TopicsSubscriber topicsSubscriber = this.f20555d;
        Context context = this.f20552a;
        boolean zB = b(context);
        PowerManager.WakeLock wakeLock = this.f20554c;
        if (zB) {
            wakeLock.acquire(Constants.f20454a);
        }
        try {
            try {
                try {
                    topicsSubscriber.d(true);
                    if (!this.f20553b.c()) {
                        topicsSubscriber.d(false);
                        if (b(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (!a(context) || c()) {
                        if (topicsSubscriber.e()) {
                            topicsSubscriber.d(false);
                        } else {
                            topicsSubscriber.f(this.f20556e);
                        }
                        if (b(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    ConnectivityChangeReceiver connectivityChangeReceiver = new ConnectivityChangeReceiver();
                    connectivityChangeReceiver.f20557a = this;
                    context.registerReceiver(connectivityChangeReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    if (b(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                } catch (RuntimeException unused3) {
                }
            } catch (IOException e8) {
                e8.getMessage();
                topicsSubscriber.d(false);
                if (b(context)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th2) {
            if (b(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th2;
        }
    }
}
