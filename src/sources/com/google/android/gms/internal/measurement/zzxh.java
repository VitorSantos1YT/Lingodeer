package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import com.google.common.base.Ticker;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzxh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ticker f12144a;

    static {
        Ticker zzxgVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            zzxgVar = new zzxf();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            zzxgVar = new zzxg();
        }
        f12144a = zzxgVar;
    }
}
