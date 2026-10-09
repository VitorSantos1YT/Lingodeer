package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzkk {
    public static long zza(long j11, long j12) {
        long j13 = j11 + j12;
        zzkl.zza(((j11 ^ j12) < 0) | ((j11 ^ j13) >= 0), "checkedAdd", j11, j12);
        return j13;
    }

    public static long zzb(long j11, long j12) {
        long j13 = (-1) + j11;
        zzkl.zza(((1 ^ j11) >= 0) | ((j11 ^ j13) >= 0), "checkedSubtract", j11, 1L);
        return j13;
    }
}
