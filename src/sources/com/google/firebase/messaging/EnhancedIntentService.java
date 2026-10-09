package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.threads.PoolableExecutors;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnhancedIntentService extends Service {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f20458f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Binder f20460b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20462d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f20459a = PoolableExecutors.f20633b.a(new NamedThreadFactory("Firebase-Messaging-Intent-Handle"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20461c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20463e = 0;

    /* JADX INFO: renamed from: com.google.firebase.messaging.EnhancedIntentService$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements WithinAppServiceBinder.IntentHandler {
        public AnonymousClass1() {
        }
    }

    public final void a(Intent intent) {
        if (intent != null) {
            WakeLockHolder.b(intent);
        }
        synchronized (this.f20461c) {
            try {
                int i11 = this.f20463e - 1;
                this.f20463e = i11;
                if (i11 == 0) {
                    stopSelfResult(this.f20462d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void c(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (this.f20460b == null) {
                this.f20460b = new WithinAppServiceBinder(new AnonymousClass1());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f20460b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f20459a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i11, int i12) {
        synchronized (this.f20461c) {
            this.f20462d = i12;
            this.f20463e++;
        }
        Intent intentB = b(intent);
        if (intentB == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f20459a.execute(new b(this, intentB, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener(new s.a(1), new m(this, intent));
        return 3;
    }

    public Intent b(Intent intent) {
        return intent;
    }
}
