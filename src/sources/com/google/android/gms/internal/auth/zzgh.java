package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzgh implements zzfu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzfx f9538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f9539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9540c;

    public zzgh(zzhs zzhsVar, Object[] objArr) {
        this.f9538a = zzhsVar;
        this.f9539b = objArr;
        char cCharAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (cCharAt < 55296) {
            this.f9540c = cCharAt;
            return;
        }
        int i11 = cCharAt & 8191;
        int i12 = 1;
        int i13 = 13;
        while (true) {
            int i14 = i12 + 1;
            char cCharAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i12);
            if (cCharAt2 < 55296) {
                this.f9540c = i11 | (cCharAt2 << i13);
                return;
            } else {
                i11 |= (cCharAt2 & 8191) << i13;
                i13 += 13;
                i12 = i14;
            }
        }
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final zzfx zza() {
        return this.f9538a;
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final boolean zzb() {
        return (this.f9540c & 2) == 2;
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final int zzc() {
        return (this.f9540c & 1) != 0 ? 1 : 2;
    }
}
