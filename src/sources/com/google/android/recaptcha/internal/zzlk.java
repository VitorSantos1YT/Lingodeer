package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzlk extends zzln {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzlk(byte[] bArr, int i11, int i12) {
        super(null);
        int length = bArr.length;
        if (((length - i12) | i12) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i12)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i12;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzb(byte b3) throws zzll {
        try {
            byte[] bArr = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            bArr[i11] = b3;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e8);
        }
    }

    public final void zzc(byte[] bArr, int i11, int i12) {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i12);
            this.zzd += i12;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i12)), e8);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzd(int i11, boolean z11) throws zzll {
        zzt(i11 << 3);
        zzb(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zze(int i11, zzle zzleVar) throws zzll {
        zzt((i11 << 3) | 2);
        zzt(zzleVar.zzd());
        zzleVar.zzh(this);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzf(int i11, int i12) throws zzll {
        zzt((i11 << 3) | 5);
        zzg(i12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzg(int i11) throws zzll {
        try {
            byte[] bArr = this.zzb;
            int i12 = this.zzd;
            int i13 = i12 + 1;
            this.zzd = i13;
            bArr[i12] = (byte) (i11 & 255);
            int i14 = i12 + 2;
            this.zzd = i14;
            bArr[i13] = (byte) ((i11 >> 8) & 255);
            int i15 = i12 + 3;
            this.zzd = i15;
            bArr[i14] = (byte) ((i11 >> 16) & 255);
            this.zzd = i12 + 4;
            bArr[i15] = (byte) ((i11 >> 24) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e8);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzh(int i11, long j11) throws zzll {
        zzt((i11 << 3) | 1);
        zzi(j11);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzi(long j11) throws zzll {
        try {
            byte[] bArr = this.zzb;
            int i11 = this.zzd;
            int i12 = i11 + 1;
            this.zzd = i12;
            bArr[i11] = (byte) (((int) j11) & 255);
            int i13 = i11 + 2;
            this.zzd = i13;
            bArr[i12] = (byte) (((int) (j11 >> 8)) & 255);
            int i14 = i11 + 3;
            this.zzd = i14;
            bArr[i13] = (byte) (((int) (j11 >> 16)) & 255);
            int i15 = i11 + 4;
            this.zzd = i15;
            bArr[i14] = (byte) (((int) (j11 >> 24)) & 255);
            int i16 = i11 + 5;
            this.zzd = i16;
            bArr[i15] = (byte) (((int) (j11 >> 32)) & 255);
            int i17 = i11 + 6;
            this.zzd = i17;
            bArr[i16] = (byte) (((int) (j11 >> 40)) & 255);
            int i18 = i11 + 7;
            this.zzd = i18;
            bArr[i17] = (byte) (((int) (j11 >> 48)) & 255);
            this.zzd = i11 + 8;
            bArr[i18] = (byte) (((int) (j11 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e8);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzj(int i11, int i12) throws zzll {
        zzt(i11 << 3);
        zzk(i12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzk(int i11) throws zzll {
        if (i11 >= 0) {
            zzt(i11);
        } else {
            zzv(i11);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzl(byte[] bArr, int i11, int i12) {
        zzc(bArr, 0, i12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzm(int i11, zzoi zzoiVar, zzow zzowVar) throws zzll {
        zzt((i11 << 3) | 2);
        zzt(((zzko) zzoiVar).zza(zzowVar));
        zzowVar.zzj(zzoiVar, this.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzn(int i11, zzoi zzoiVar) throws zzll {
        zzt(11);
        zzs(2, i11);
        zzt(26);
        zzt(zzoiVar.zzo());
        zzoiVar.zze(this);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzo(int i11, zzle zzleVar) throws zzll {
        zzt(11);
        zzs(2, i11);
        zze(3, zzleVar);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzp(int i11, String str) throws zzll {
        zzt((i11 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) throws zzll {
        int i11 = this.zzd;
        try {
            int iZzA = zzln.zzA(str.length() * 3);
            int iZzA2 = zzln.zzA(str.length());
            if (iZzA2 != iZzA) {
                zzt(zzpv.zzc(str));
                byte[] bArr = this.zzb;
                int i12 = this.zzd;
                this.zzd = zzpv.zzb(str, bArr, i12, this.zzc - i12);
                return;
            }
            int i13 = i11 + iZzA2;
            this.zzd = i13;
            int iZzb = zzpv.zzb(str, this.zzb, i13, this.zzc - i13);
            this.zzd = i11;
            zzt((iZzb - i11) - iZzA2);
            this.zzd = iZzb;
        } catch (zzpu e8) {
            this.zzd = i11;
            zzD(str, e8);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzll(e10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzr(int i11, int i12) throws zzll {
        zzt((i11 << 3) | i12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzs(int i11, int i12) throws zzll {
        zzt(i11 << 3);
        zzt(i12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzt(int i11) throws zzll {
        while ((i11 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i12 = this.zzd;
                this.zzd = i12 + 1;
                bArr[i12] = (byte) ((i11 | 128) & 255);
                i11 >>>= 7;
            } catch (IndexOutOfBoundsException e8) {
                throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e8);
            }
        }
        byte[] bArr2 = this.zzb;
        int i13 = this.zzd;
        this.zzd = i13 + 1;
        bArr2[i13] = (byte) i11;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzu(int i11, long j11) throws zzll {
        zzt(i11 << 3);
        zzv(j11);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzv(long j11) throws zzll {
        if (!zzln.zzc || this.zzc - this.zzd < 10) {
            while ((j11 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i11 = this.zzd;
                    this.zzd = i11 + 1;
                    bArr[i11] = (byte) ((((int) j11) | 128) & 255);
                    j11 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e8);
                }
            }
            byte[] bArr2 = this.zzb;
            int i12 = this.zzd;
            this.zzd = i12 + 1;
            bArr2[i12] = (byte) j11;
            return;
        }
        while (true) {
            int i13 = (int) j11;
            if ((j11 & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i14 = this.zzd;
                this.zzd = i14 + 1;
                zzps.zzn(bArr3, i14, (byte) i13);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i15 = this.zzd;
            this.zzd = i15 + 1;
            zzps.zzn(bArr4, i15, (byte) ((i13 | 128) & 255));
            j11 >>>= 7;
        }
    }
}
