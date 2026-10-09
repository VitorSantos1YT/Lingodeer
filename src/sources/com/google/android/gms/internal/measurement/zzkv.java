package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.SettableFuture;
import com.pairip.VMRunner;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkv extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f11672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f11673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SettableFuture f11674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AsyncCallable f11675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Executor f11676e;

    public zzkv(AtomicBoolean atomicBoolean, Context context, SettableFuture settableFuture, AsyncCallable asyncCallable, Executor executor) {
        this.f11672a = atomicBoolean;
        this.f11673b = context;
        this.f11674c = settableFuture;
        this.f11675d = asyncCallable;
        this.f11676e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("NPaq1j7HyGPegjb7", new Object[]{this, context, intent});
    }
}
