package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.ForwardingListenableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqi implements zzqm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f11856d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Supplier f11857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Supplier f11859c;

    public zzqi(Supplier supplier) {
        zzqh zzqhVar = zzqh.f11855a;
        this.f11857a = supplier;
        this.f11858b = Math.max(5, 10);
        this.f11859c = zzqhVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzqm
    public final void zza() {
        synchronized (zzqi.class) {
            try {
                if (!f11856d) {
                    zzqg zzqgVar = new zzqg(this);
                    long j11 = this.f11858b;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    ListeningScheduledExecutorService listeningScheduledExecutorService = (ListeningScheduledExecutorService) this.f11857a.get();
                    ListenableFuture listenableFutureSchedule = listeningScheduledExecutorService.schedule((Runnable) new zzqf(this, zzqgVar, listeningScheduledExecutorService, j11), j11, timeUnit);
                    ((ForwardingListenableFuture) listenableFutureSchedule).N(new zzpw(listenableFutureSchedule), MoreExecutors.a());
                    f11856d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
