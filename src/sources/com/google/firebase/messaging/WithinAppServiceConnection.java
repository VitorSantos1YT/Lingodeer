package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class WithinAppServiceConnection implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f20564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f20565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f20566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WithinAppServiceBinder f20567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20568f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class BindRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f20569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TaskCompletionSource f20570b = new TaskCompletionSource();

        public BindRequest(Intent intent) {
            this.f20569a = intent;
        }
    }

    public WithinAppServiceConnection(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f20566d = new ArrayDeque();
        this.f20568f = false;
        Context applicationContext = context.getApplicationContext();
        this.f20563a = applicationContext;
        this.f20564b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f20565c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        while (!this.f20566d.isEmpty()) {
            try {
                WithinAppServiceBinder withinAppServiceBinder = this.f20567e;
                if (withinAppServiceBinder == null || !withinAppServiceBinder.isBinderAlive()) {
                    if (!this.f20568f) {
                        this.f20568f = true;
                        try {
                            if (!ConnectionTracker.b().a(this.f20563a, this.f20564b, this, 65)) {
                                this.f20568f = false;
                                ArrayDeque arrayDeque = this.f20566d;
                                while (!arrayDeque.isEmpty()) {
                                    ((BindRequest) arrayDeque.poll()).f20570b.trySetResult(null);
                                }
                            }
                        } catch (SecurityException unused) {
                        }
                    }
                    return;
                }
                this.f20567e.a((BindRequest) this.f20566d.poll());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized Task b(Intent intent) {
        BindRequest bindRequest;
        bindRequest = new BindRequest(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f20565c;
        bindRequest.f20570b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new k(scheduledThreadPoolExecutor.schedule(new n(bindRequest, 1), 20L, TimeUnit.SECONDS), 4));
        this.f20566d.add(bindRequest);
        a();
        return bindRequest.f20570b.getTask();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f20568f = false;
            if (iBinder instanceof WithinAppServiceBinder) {
                this.f20567e = (WithinAppServiceBinder) iBinder;
                a();
            } else {
                Objects.toString(iBinder);
                ArrayDeque arrayDeque = this.f20566d;
                while (!arrayDeque.isEmpty()) {
                    ((BindRequest) arrayDeque.poll()).f20570b.trySetResult(null);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
