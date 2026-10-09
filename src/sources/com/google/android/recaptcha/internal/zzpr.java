package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzpr {
    final Unsafe zza;

    public zzpr(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j11);

    public abstract float zzb(Object obj, long j11);

    public abstract void zzc(Object obj, long j11, boolean z11);

    public abstract void zzd(Object obj, long j11, byte b3);

    public abstract void zze(Object obj, long j11, double d5);

    public abstract void zzf(Object obj, long j11, float f5);

    public abstract boolean zzg(Object obj, long j11);
}
