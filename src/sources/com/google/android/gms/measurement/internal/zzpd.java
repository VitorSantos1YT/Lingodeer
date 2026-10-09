package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzpd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13590b;

    public zzpd(zzpg zzpgVar, String str) {
        this.f13589a = str;
        ((DefaultClock) zzpgVar.c()).getClass();
        this.f13590b = SystemClock.elapsedRealtime();
    }
}
