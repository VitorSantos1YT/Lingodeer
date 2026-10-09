package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzage extends zzagf {
    @Override // com.google.android.gms.internal.measurement.zzagf
    public final void a(Object obj, long j11, byte b3) {
        if (zzagg.f11357f) {
            zzagg.b(obj, j11, b3);
        } else {
            zzagg.c(obj, j11, b3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final boolean b(long j11, Object obj) {
        return zzagg.f11357f ? zzagg.n(obj, j11) : zzagg.o(obj, j11);
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final void c(Object obj, long j11, boolean z11) {
        if (zzagg.f11357f) {
            zzagg.b(obj, j11, z11 ? (byte) 1 : (byte) 0);
        } else {
            zzagg.c(obj, j11, z11 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final float d(long j11, Object obj) {
        return Float.intBitsToFloat(this.f11351a.getInt(obj, j11));
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final void e(Object obj, long j11, float f5) {
        this.f11351a.putInt(obj, j11, Float.floatToIntBits(f5));
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final double f(long j11, Object obj) {
        return Double.longBitsToDouble(this.f11351a.getLong(obj, j11));
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final void g(Object obj, long j11, double d5) {
        this.f11351a.putLong(obj, j11, Double.doubleToLongBits(d5));
    }
}
