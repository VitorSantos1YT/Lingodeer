package com.google.firebase.crashlytics.internal.concurrency;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class CrashlyticsWorkers$Companion$checkBlockingThread$1 extends j implements fz.a {
    @Override // fz.a
    public final Object invoke() {
        ((CrashlyticsWorkers.Companion) this.receiver).getClass();
        String strA = CrashlyticsWorkers.Companion.a();
        m.e(strA, "<get-threadName>(...)");
        return Boolean.valueOf(q.v0(strA, "Firebase Blocking Thread #", false));
    }
}
