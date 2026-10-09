package com.google.firebase.remoteconfig.internal;

import bp.g4;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.e;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ConfigCacheClient {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f20689d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s.a f20690e = new s.a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f20691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConfigStorageClient f20692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Task f20693c = null;

    public ConfigCacheClient(Executor executor, ConfigStorageClient configStorageClient) {
        this.f20691a = executor;
        this.f20692b = configStorageClient;
    }

    public static Object a(Task task) throws ExecutionException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AwaitListener awaitListener = new AwaitListener(0);
        Executor executor = f20690e;
        task.addOnSuccessListener(executor, awaitListener);
        task.addOnFailureListener(executor, awaitListener);
        task.addOnCanceledListener(executor, awaitListener);
        if (!awaitListener.f20694a.await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public final synchronized Task b() {
        try {
            Task task = this.f20693c;
            if (task == null || (task.isComplete() && !this.f20693c.isSuccessful())) {
                this.f20693c = Tasks.call(this.f20691a, new g4(this.f20692b, 4));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f20693c;
    }

    public final ConfigContainer c() {
        synchronized (this) {
            try {
                Task task = this.f20693c;
                if (task != null && task.isSuccessful()) {
                    return (ConfigContainer) this.f20693c.getResult();
                }
                try {
                    Task taskB = b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (ConfigContainer) a(taskB);
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Task d(ConfigContainer configContainer) {
        com.google.common.cache.a aVar = new com.google.common.cache.a(2, this, configContainer);
        Executor executor = this.f20691a;
        return Tasks.call(executor, aVar).onSuccessTask(executor, new e(3, this, configContainer));
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class AwaitListener<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CountDownLatch f20694a;

        private AwaitListener() {
            this.f20694a = new CountDownLatch(1);
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void onCanceled() {
            this.f20694a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception exc) {
            this.f20694a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(Object obj) {
            this.f20694a.countDown();
        }

        public /* synthetic */ AwaitListener(int i11) {
            this();
        }
    }
}
