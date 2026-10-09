package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzhh extends zzhi {
    @Override // com.google.android.gms.internal.auth.zzhi
    public final double a(Object obj, long j11) {
        return Double.longBitsToDouble(this.f9569a.getLong(obj, j11));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final float b(Object obj, long j11) {
        return Float.intBitsToFloat(this.f9569a.getInt(obj, j11));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void c(Object obj, long j11, boolean z11) {
        if (zzhj.f9575f) {
            zzhj.f(obj, j11, z11);
        } else {
            zzhj.g(obj, j11, z11);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void d(Object obj, long j11, double d5) {
        this.f9569a.putLong(obj, j11, Double.doubleToLongBits(d5));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void e(Object obj, long j11, float f5) {
        this.f9569a.putInt(obj, j11, Float.floatToIntBits(f5));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final boolean f(long j11, Object obj) {
        return zzhj.f9575f ? zzhj.k(j11, obj) : zzhj.l(j11, obj);
    }
}
