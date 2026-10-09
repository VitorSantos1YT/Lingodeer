package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzvb extends zztf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzafc f12056a;

    public zzvb(zznu zznuVar) {
        this.f12056a = zznuVar;
    }

    @Override // com.google.android.gms.internal.measurement.zztf
    public final AbstractFuture a(final IOException iOException, zztg zztgVar) {
        if (!(iOException.getCause() instanceof zzaeh)) {
            return (AbstractFuture) Futures.f(iOException);
        }
        ListenableFuture listenableFutureG = Futures.g(this.f12056a);
        final zzui zzuiVar = ((zzty) zztgVar).f12001a;
        AsyncFunction asyncFunction = new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzuf
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ ListenableFuture apply(Object obj) throws IOException {
                zzui zzuiVar2 = zzuiVar;
                zzuiVar2.c((Uri) Futures.d(zzuiVar2.f12019b), obj);
                return Futures.h();
            }
        };
        int i11 = zzxa.f12143a;
        return (AbstractFuture) Futures.c(Futures.m(listenableFutureG, new zzwy(zzvy.a(), asyncFunction), zzuiVar.f12021d), IOException.class, new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzva
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ ListenableFuture apply(Object obj) throws IOException {
                IOException iOException2 = iOException;
                iOException2.addSuppressed((IOException) obj);
                throw iOException2;
            }
        }, MoreExecutors.a());
    }
}
