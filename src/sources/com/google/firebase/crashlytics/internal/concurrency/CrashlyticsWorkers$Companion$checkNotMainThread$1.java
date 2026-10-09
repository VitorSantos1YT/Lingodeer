package com.google.firebase.crashlytics.internal.concurrency;

import android.os.Looper;
import kotlin.jvm.internal.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class CrashlyticsWorkers$Companion$checkNotMainThread$1 extends j implements fz.a {
    @Override // fz.a
    public final Object invoke() {
        ((CrashlyticsWorkers.Companion) this.receiver).getClass();
        return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
    }
}
