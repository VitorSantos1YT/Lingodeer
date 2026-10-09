package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzwy implements AsyncFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzws f12138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AsyncFunction f12139b;

    public zzwy(zzws zzwsVar, AsyncFunction asyncFunction) {
        this.f12138a = zzwsVar;
        this.f12139b = asyncFunction;
    }

    @Override // com.google.common.util.concurrent.AsyncFunction
    public final ListenableFuture apply(Object obj) {
        zzwq zzwqVarC = zzvy.c();
        zzws zzwsVarB = zzvy.b(zzwqVarC, this.f12138a);
        try {
            ListenableFuture listenableFutureApply = this.f12139b.apply(obj);
            if (listenableFutureApply == null) {
                throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
            }
            zzvy.b(zzwqVarC, zzwsVarB);
            return listenableFutureApply;
        } catch (Throwable th2) {
            try {
                zzvu.a(th2);
                throw th2;
            } catch (Throwable th3) {
                zzvy.b(zzwqVarC, zzwsVarB);
                throw th3;
            }
        }
    }

    public final String toString() {
        AsyncFunction asyncFunction = this.f12139b;
        StringBuilder sb2 = new StringBuilder(asyncFunction.toString().length() + 14);
        sb2.append("propagating=[");
        sb2.append(asyncFunction);
        sb2.append("]");
        return sb2.toString();
    }
}
