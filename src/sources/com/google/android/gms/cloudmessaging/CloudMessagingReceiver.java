package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import dt.Xk.wuoM;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SoftReference f8564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SoftReference f8565b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class IntentActionKeys {
        private IntentActionKeys() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class IntentKeys {
        private IntentKeys() {
        }
    }

    public abstract int a(Context context, CloudMessage cloudMessage);

    public void b(Bundle bundle) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        synchronized (CloudMessagingReceiver.class) {
            try {
                SoftReference softReference = f8564a;
                ExecutorService executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new NamedThreadFactory(wuoM.nBJQxgEiREGAi)));
                    f8564a = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
                executorService = executorServiceUnconfigurableExecutorService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        executorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzh
            @Override // java.lang.Runnable
            public final void run() {
                Executor executorUnconfigurableExecutorService;
                CloudMessagingReceiver cloudMessagingReceiver = this.f8590a;
                Intent intent2 = intent;
                final Context context2 = context;
                boolean z11 = zIsOrderedBroadcast;
                BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    int iA = 500;
                    if (intent3 != null) {
                        PendingIntent pendingIntent = (PendingIntent) intent3.getParcelableExtra("pending_intent");
                        if (pendingIntent != null) {
                            try {
                                pendingIntent.send();
                            } catch (PendingIntent.CanceledException unused) {
                            }
                        }
                        Bundle extras = intent3.getExtras();
                        if (extras != null) {
                            extras.remove("pending_intent");
                        } else {
                            extras = new Bundle();
                        }
                        if (Objects.equals(intent3.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
                            cloudMessagingReceiver.b(extras);
                            iA = -1;
                        }
                    } else if (intent2.getExtras() != null) {
                        final CloudMessage cloudMessage = new CloudMessage(intent2);
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        synchronized (CloudMessagingReceiver.class) {
                            try {
                                SoftReference softReference2 = CloudMessagingReceiver.f8565b;
                                executorUnconfigurableExecutorService = softReference2 != null ? (Executor) softReference2.get() : null;
                                if (executorUnconfigurableExecutorService == null) {
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("pscm-ack-executor"));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                    CloudMessagingReceiver.f8565b = new SoftReference(executorUnconfigurableExecutorService);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        executorUnconfigurableExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzg
                            @Override // java.lang.Runnable
                            public final void run() {
                                Task taskB;
                                Intent intent4 = cloudMessage.f8563a;
                                String stringExtra = intent4.getStringExtra("google.message_id");
                                if (stringExtra == null) {
                                    stringExtra = intent4.getStringExtra("message_id");
                                }
                                if (TextUtils.isEmpty(stringExtra)) {
                                    taskB = Tasks.forResult(null);
                                } else {
                                    Bundle bundle = new Bundle();
                                    String stringExtra2 = intent4.getStringExtra("google.message_id");
                                    if (stringExtra2 == null) {
                                        stringExtra2 = intent4.getStringExtra("message_id");
                                    }
                                    bundle.putString("google.message_id", stringExtra2);
                                    Integer numValueOf = intent4.hasExtra("google.product_id") ? Integer.valueOf(intent4.getIntExtra("google.product_id", 0)) : null;
                                    if (numValueOf != null) {
                                        bundle.putInt("google.product_id", numValueOf.intValue());
                                    }
                                    bundle.putBoolean("supports_message_handled", true);
                                    taskB = zzv.a(context2).b(2, bundle);
                                }
                                zze zzeVar = new Executor() { // from class: com.google.android.gms.cloudmessaging.zze
                                    @Override // java.util.concurrent.Executor
                                    public final void execute(Runnable runnable) {
                                        runnable.run();
                                    }
                                };
                                final CountDownLatch countDownLatch2 = countDownLatch;
                                taskB.addOnCompleteListener(zzeVar, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzf
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task) {
                                        countDownLatch2.countDown();
                                    }
                                });
                            }
                        });
                        iA = cloudMessagingReceiver.a(context2, cloudMessage);
                        try {
                            countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
                        } catch (InterruptedException e8) {
                            "Message ack failed: ".concat(e8.toString());
                        }
                    }
                    if (z11 && pendingResult != null) {
                        pendingResult.setResultCode(iA);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                } catch (Throwable th4) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th4;
                }
            }
        });
    }
}
