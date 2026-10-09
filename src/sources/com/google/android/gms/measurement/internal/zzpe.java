package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzpe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzpg f13591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13592b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13593c = a();

    public zzpe(zzpg zzpgVar) {
        this.f13591a = zzpgVar;
    }

    public final long a() {
        zzpg zzpgVar = this.f13591a;
        Preconditions.g(zzpgVar);
        long jLongValue = ((Long) zzfy.f12885v.a(null)).longValue();
        long jLongValue2 = ((Long) zzfy.f12887w.a(null)).longValue();
        for (int i11 = 1; i11 < this.f13592b; i11++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        ((DefaultClock) zzpgVar.c()).getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
