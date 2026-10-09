package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzv {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static zzv f8615e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f8617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzp f8618c = new zzp(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8619d = 1;

    public zzv(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f8617b = scheduledExecutorService;
        this.f8616a = context.getApplicationContext();
    }

    public static synchronized zzv a(Context context) {
        try {
            if (f8615e == null) {
                f8615e = new zzv(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f8615e;
    }

    public final Task b(int i11, Bundle bundle) {
        int i12;
        synchronized (this) {
            i12 = this.f8619d;
            this.f8619d = i12 + 1;
        }
        return d(new zzr(i12, i11, bundle));
    }

    public final Task c(int i11, Bundle bundle) {
        int i12;
        synchronized (this) {
            i12 = this.f8619d;
            this.f8619d = i12 + 1;
        }
        return d(new zzu(i12, i11, bundle));
    }

    public final synchronized Task d(zzs zzsVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(zzsVar.toString());
            }
            if (!this.f8618c.d(zzsVar)) {
                zzp zzpVar = new zzp(this);
                this.f8618c = zzpVar;
                zzpVar.d(zzsVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzsVar.f8612b.getTask();
    }
}
