package com.google.android.gms.common.util.concurrent;

import android.os.Looper;
import com.google.android.gms.internal.common.zzg;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class HandlerExecutor implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzg f9132a;

    public HandlerExecutor(Looper looper) {
        this.f9132a = new zzg(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9132a.post(runnable);
    }
}
