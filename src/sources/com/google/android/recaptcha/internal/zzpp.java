package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzpp extends zzpr {
    public zzpp(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final double zza(Object obj, long j11) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j11));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final float zzb(Object obj, long j11) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j11));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zzc(Object obj, long j11, boolean z11) {
        if (zzps.zzb) {
            zzps.zzD(obj, j11, z11 ? (byte) 1 : (byte) 0);
        } else {
            zzps.zzE(obj, j11, z11 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zzd(Object obj, long j11, byte b3) {
        if (zzps.zzb) {
            zzps.zzD(obj, j11, b3);
        } else {
            zzps.zzE(obj, j11, b3);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zze(Object obj, long j11, double d5) {
        this.zza.putLong(obj, j11, Double.doubleToLongBits(d5));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zzf(Object obj, long j11, float f5) {
        this.zza.putInt(obj, j11, Float.floatToIntBits(f5));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final boolean zzg(Object obj, long j11) {
        return zzps.zzb ? zzps.zzt(obj, j11) : zzps.zzu(obj, j11);
    }
}
