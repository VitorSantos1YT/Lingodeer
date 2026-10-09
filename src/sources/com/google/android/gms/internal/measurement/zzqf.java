package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ForwardingListenableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzqf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f11851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListeningScheduledExecutorService f11852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11853c;

    public zzqf(zzqi zzqiVar, Runnable runnable, ListeningScheduledExecutorService listeningScheduledExecutorService, long j11) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f11851a = runnable;
        this.f11852b = listeningScheduledExecutorService;
        this.f11853c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((zzqg) this.f11851a).run();
        ListenableFuture listenableFutureSchedule = this.f11852b.schedule((Runnable) this, this.f11853c, TimeUnit.MINUTES);
        ((ForwardingListenableFuture) listenableFutureSchedule).N(new zzpw(listenableFutureSchedule), MoreExecutors.a());
    }
}
