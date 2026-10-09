package com.google.android.gms.internal.measurement;

import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzwz implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f12140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzws f12141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f12142c;

    public zzwz(y yVar, zzws zzwsVar, Runnable runnable) {
        this.f12140a = yVar;
        this.f12141b = zzwsVar;
        this.f12142c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((zzxe) this.f12140a.f38361a) != null) {
            throw null;
        }
        zzws zzwsVar = this.f12141b;
        m.d(zzwsVar, "null cannot be cast to non-null type com.google.apps.tiktok.tracing.Trace");
        Runnable runnable = this.f12142c;
        zzwq zzwqVarC = zzvy.c();
        zzws zzwsVarB = zzvy.b(zzwqVarC, zzwsVar);
        try {
            runnable.run();
            zzvy.b(zzwqVarC, zzwsVarB);
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
        Runnable runnable = this.f12142c;
        StringBuilder sb2 = new StringBuilder(runnable.toString().length() + 14);
        sb2.append("propagating=[");
        sb2.append(runnable);
        sb2.append("]");
        return sb2.toString();
    }
}
