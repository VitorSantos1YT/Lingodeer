package com.google.android.recaptcha.internal;

import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkz extends zzlc {
    private final int zzc;

    public zzkz(byte[] bArr, int i11, int i12) {
        super(bArr);
        zzle.zzi(0, i12, bArr.length);
        this.zzc = i12;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final byte zza(int i11) {
        int i12 = this.zzc;
        if (((i12 - (i11 + 1)) | i11) >= 0) {
            return ((zzlc) this).zza[i11];
        }
        if (i11 < 0) {
            throw new ArrayIndexOutOfBoundsException(p.j(i11, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(p.p("Index > length: ", i11, i12, ", "));
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final byte zzb(int i11) {
        return ((zzlc) this).zza[i11];
    }

    @Override // com.google.android.recaptcha.internal.zzlc
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final void zze(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(((zzlc) this).zza, 0, bArr, 0, i13);
    }
}
