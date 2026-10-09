package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhl extends zzhn {
    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final double a(Object obj, long j11) {
        return Double.longBitsToDouble(this.f12455a.getLong(obj, j11));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final float b(Object obj, long j11) {
        return Float.intBitsToFloat(this.f12455a.getInt(obj, j11));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final void c(Object obj, long j11, boolean z11) {
        if (zzho.f12462g) {
            zzho.c(obj, j11, z11 ? (byte) 1 : (byte) 0);
        } else {
            zzho.d(obj, j11, z11 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final void d(Object obj, long j11, byte b3) {
        if (zzho.f12462g) {
            zzho.c(obj, j11, b3);
        } else {
            zzho.d(obj, j11, b3);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final void e(Object obj, long j11, double d5) {
        this.f12455a.putLong(obj, j11, Double.doubleToLongBits(d5));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final void f(Object obj, long j11, float f5) {
        this.f12455a.putInt(obj, j11, Float.floatToIntBits(f5));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final boolean g(Object obj, long j11) {
        return zzho.f12462g ? zzho.m(obj, j11) : zzho.n(obj, j11);
    }
}
