package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzpw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture f11835a;

    public /* synthetic */ zzpw(ListenableFuture listenableFuture) {
        this.f11835a = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        try {
            Futures.d(this.f11835a);
        } catch (ExecutionException e8) {
            zzrn.b().post(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzpv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    throw new RuntimeException(e8.getCause());
                }
            });
        }
    }
}
