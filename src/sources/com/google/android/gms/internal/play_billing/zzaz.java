package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzbl f12242a;

    static {
        zzbl zzayVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            zzayVar = new zzax();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            zzayVar = new zzay();
        }
        f12242a = zzayVar;
    }
}
