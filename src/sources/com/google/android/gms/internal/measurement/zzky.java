package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import android.os.UserManager;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzky {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UserManager f11682a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f11683b = false;

    private zzky() {
    }

    public static AbstractFuture a(final Context context, final Callable callable, Executor executor) {
        ListenableFuture listenableFutureK;
        AsyncCallable asyncCallable = new AsyncCallable() { // from class: com.google.android.gms.internal.measurement.zzkx
            @Override // com.google.common.util.concurrent.AsyncCallable
            public final /* synthetic */ ListenableFuture call() {
                return Futures.j(MoreExecutors.a(), callable);
            }
        };
        if (b(context)) {
            listenableFutureK = Futures.k(asyncCallable, executor);
        } else {
            final SettableFuture settableFutureQ = SettableFuture.q();
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            final zzkv zzkvVar = new zzkv(atomicBoolean, context, settableFutureQ, asyncCallable, executor);
            context.registerReceiver(zzkvVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            if (b(context) && atomicBoolean.compareAndSet(false, true)) {
                try {
                    context.unregisterReceiver(zzkvVar);
                } catch (IllegalArgumentException unused) {
                }
                settableFutureQ.o(Futures.k(asyncCallable, executor));
            } else {
                settableFutureQ.N(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzkw
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        BroadcastReceiver broadcastReceiver = zzkvVar;
                        if (settableFutureQ.isCancelled() && atomicBoolean.compareAndSet(false, true)) {
                            try {
                                context2.unregisterReceiver(broadcastReceiver);
                            } catch (IllegalArgumentException unused2) {
                            }
                        }
                    }
                }, MoreExecutors.a());
            }
            listenableFutureK = settableFutureQ;
        }
        return (AbstractFuture) listenableFutureK;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0048 A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:19:0x0025, B:31:0x0048, B:32:0x004a, B:22:0x002b, B:24:0x0031, B:27:0x003d, B:29:0x0044), top: B:38:0x0009, inners: #0 }] */
    public static boolean b(Context context) {
        if (f11683b) {
            return true;
        }
        synchronized (zzky.class) {
            try {
                if (f11683b) {
                    return true;
                }
                int i11 = 1;
                while (true) {
                    boolean z11 = false;
                    if (i11 <= 2) {
                        if (f11682a == null) {
                            f11682a = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = f11682a;
                        if (userManager == null) {
                            z11 = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z11 = true;
                                }
                            } catch (NullPointerException unused) {
                                f11682a = null;
                                i11++;
                            }
                        }
                        if (z11) {
                            f11683b = true;
                        }
                        return z11;
                    }
                    if (z11) {
                        f11682a = null;
                    }
                    if (z11) {
                        f11683b = true;
                    }
                    return z11;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
