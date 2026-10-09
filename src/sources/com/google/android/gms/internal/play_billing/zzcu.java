package com.google.android.gms.internal.play_billing;

import com.android.billingclient.api.d0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcu extends zzcw {
    public static zzcz a(Object obj) {
        return new zzcx(obj);
    }

    public static zzcz b(zzcz zzczVar, ScheduledExecutorService scheduledExecutorService) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (zzczVar.isDone()) {
            return zzczVar;
        }
        zzde zzdeVar = new zzde();
        zzdeVar.H = zzczVar;
        zzdb zzdbVar = new zzdb();
        zzdbVar.f12330a = zzdeVar;
        zzdeVar.K = scheduledExecutorService.schedule(zzdbVar, 28500L, timeUnit);
        zzczVar.h0(zzdbVar, zzcp.zza);
        return zzdeVar;
    }

    public static void c(zzcz zzczVar, d0 d0Var, ExecutorService executorService) {
        zzczVar.h0(new zzct(zzczVar, d0Var), executorService);
    }
}
