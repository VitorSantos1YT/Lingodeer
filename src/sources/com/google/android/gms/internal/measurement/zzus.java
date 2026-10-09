package com.google.android.gms.internal.measurement;

import com.google.common.base.Functions;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzus implements zzth {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzut f12044a;

    public /* synthetic */ zzus(zztp zztpVar) {
        Objects.requireNonNull(zztpVar);
        this.f12044a = zztpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzth
    public final ListenableFuture a(final zzwy zzwyVar, final Executor executor) {
        ListenableFuture listenableFutureI = Futures.i(this.f12044a.f12049e.a());
        AsyncFunction asyncFunction = new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzur
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return this.f12041a.f12044a.f12047c.a(zzwyVar, executor);
            }
        };
        int i11 = zzxa.f12143a;
        return Futures.l(Futures.m(listenableFutureI, new zzwy(zzvy.a(), asyncFunction), MoreExecutors.a()), Functions.a(), MoreExecutors.a());
    }
}
