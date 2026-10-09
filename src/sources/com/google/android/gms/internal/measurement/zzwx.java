package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzwx implements AsyncCallable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzws f12136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AsyncCallable f12137b;

    public zzwx(zzws zzwsVar, AsyncCallable asyncCallable) {
        this.f12136a = zzwsVar;
        this.f12137b = asyncCallable;
    }

    @Override // com.google.common.util.concurrent.AsyncCallable
    public final ListenableFuture call() {
        zzwq zzwqVarC = zzvy.c();
        zzws zzwsVarB = zzvy.b(zzwqVarC, this.f12136a);
        try {
            ListenableFuture listenableFutureCall = this.f12137b.call();
            zzvy.b(zzwqVarC, zzwsVarB);
            m.e(listenableFutureCall, "wrapInTrace(...)");
            return listenableFutureCall;
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
        AsyncCallable asyncCallable = this.f12137b;
        StringBuilder sb2 = new StringBuilder(asyncCallable.toString().length() + 14);
        sb2.append("propagating=[");
        sb2.append(asyncCallable);
        sb2.append("]");
        return sb2.toString();
    }
}
