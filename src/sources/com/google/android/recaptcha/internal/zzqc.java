package com.google.android.recaptcha.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqc {
    protected static final Charset zza = StandardCharsets.UTF_16;
    protected int[] zzb;
    protected int[] zzc;
    private final int[] zzd = {511133343, 1277647508, 107287496, 338123662};
    private byte[] zze;
    private byte[] zzf;
    private int zzg;

    public zzqc() {
    }

    public static int zza(int i11, int i12) {
        if (i11 % 2 != 0) {
            return (i11 | i12) - (i11 & i12);
        }
        return ((~i11) & i12) | ((~i12) & i11);
    }

    public static String zze(String str, byte[] bArr, zzqd zzqdVar) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr2 = new byte[12];
        int length = bArrDecode.length - 12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArrDecode, 0, bArr2, 0, 12);
        System.arraycopy(bArrDecode, 12, bArr3, 0, length);
        return new String(new zzqc(bArr, bArr2).zzd(bArr3), zza);
    }

    public static String zzf(String str, byte[] bArr, zzqd zzqdVar) {
        byte[] bArr2 = new byte[12];
        new SecureRandom().nextBytes(bArr2);
        byte[] bArrZzd = new zzqc(bArr, bArr2).zzd(str.getBytes(zza));
        int length = bArrZzd.length;
        byte[] bArr3 = new byte[length + 12];
        System.arraycopy(bArr2, 0, bArr3, 0, 12);
        System.arraycopy(bArrZzd, 0, bArr3, 12, length);
        return Base64.encodeToString(bArr3, 2);
    }

    private static final int zzg(byte[] bArr, int i11) {
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    public final void zzb(int i11, int i12, int i13, int i14) {
        zzc(i11, i12, i14, 16);
        zzc(i13, i14, i12, 12);
        zzc(i11, i12, i14, 8);
        zzc(i13, i14, i12, 7);
    }

    public final void zzc(int i11, int i12, int i13, int i14) {
        int[] iArr = this.zzb;
        int i15 = iArr[i11] + iArr[i12];
        iArr[i11] = i15;
        int iZza = zza(iArr[i13], i15);
        iArr[i13] = iZza;
        iArr[i13] = (iZza << i14) | (iZza >>> (32 - i14));
    }

    public final byte[] zzd(byte[] bArr) {
        if (this.zzg != 1) {
            throw new IllegalStateException();
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i11 = 0;
        while (length > 0) {
            int[] iArr = this.zzc;
            int[] iArr2 = this.zzb;
            int length2 = iArr.length;
            System.arraycopy(iArr, 0, iArr2, 0, 16);
            this.zzb[12] = this.zzg;
            for (int i12 = 0; i12 < 10; i12++) {
                zzb(0, 4, 8, 12);
                zzb(1, 5, 9, 13);
                zzb(2, 6, 10, 14);
                zzb(3, 7, 11, 15);
                zzb(0, 5, 10, 15);
                zzb(1, 6, 11, 12);
                zzb(2, 7, 8, 13);
                zzb(3, 4, 9, 14);
            }
            byte[] bArr3 = new byte[64];
            for (int i13 = 0; i13 < 16; i13++) {
                int i14 = this.zzb[i13];
                int i15 = i13 * 4;
                bArr3[i15] = (byte) (i14 & 255);
                bArr3[i15 + 1] = (byte) ((i14 >> 8) & 255);
                bArr3[i15 + 2] = (byte) ((i14 >> 16) & 255);
                bArr3[i15 + 3] = (byte) ((i14 >> 24) & 255);
            }
            for (int i16 = 0; i16 < Math.min(64, length); i16++) {
                int i17 = i11 + i16;
                bArr2[i17] = (byte) zza(bArr3[i16], bArr[i17]);
            }
            this.zzg++;
            length -= 64;
            i11 += 64;
        }
        return bArr2;
    }

    public zzqc(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException();
        }
        this.zze = bArr;
        this.zzg = 1;
        this.zzf = bArr2;
        this.zzb = new int[16];
        for (int i11 = 0; i11 < 4; i11++) {
            this.zzb[i11] = zza(this.zzd[i11], 2131181306);
        }
        for (int i12 = 4; i12 < 12; i12++) {
            this.zzb[i12] = zzg(this.zze, (i12 - 4) * 4);
        }
        this.zzb[12] = this.zzg;
        for (int i13 = 13; i13 < 16; i13++) {
            this.zzb[i13] = zzg(this.zzf, (i13 - 13) * 4);
        }
        int[] iArr = new int[16];
        this.zzc = iArr;
        int[] iArr2 = this.zzb;
        int length = iArr2.length;
        System.arraycopy(iArr2, 0, iArr, 0, 16);
    }
}
