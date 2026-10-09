package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzib {
    public static long a(byte[] bArr, int i11) {
        return ((long) (((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16))) & 4294967295L;
    }

    public static void b(long j11, byte[] bArr, int i11) {
        int i12 = 0;
        while (i12 < 4) {
            bArr[i11 + i12] = (byte) (255 & j11);
            i12++;
            j11 >>= 8;
        }
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jA = a(bArr, 0) & 67108863;
        int i11 = 3;
        long jA2 = (a(bArr, 3) >> 2) & 67108611;
        long jA3 = (a(bArr, 6) >> 4) & 67092735;
        long jA4 = (a(bArr, 9) >> 6) & 66076671;
        long jA5 = (a(bArr, 12) >> 8) & 1048575;
        long j11 = jA2 * 5;
        long j12 = jA3 * 5;
        long j13 = jA4 * 5;
        long j14 = jA5 * 5;
        byte[] bArr3 = new byte[17];
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        int i12 = 0;
        while (i12 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i12);
            System.arraycopy(bArr2, i12, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jA6 = j19 + (a(bArr3, 0) & 67108863);
            long jA7 = j15 + ((a(bArr3, i11) >> 2) & 67108863);
            long jA8 = j16 + ((a(bArr3, 6) >> 4) & 67108863);
            long jA9 = j17 + ((a(bArr3, 9) >> 6) & 67108863);
            long j21 = jA2;
            long jA10 = j18 + (((a(bArr3, 12) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j22 = (jA10 * j11) + (jA9 * j12) + (jA8 * j13) + (jA7 * j14) + (jA6 * jA);
            long j23 = (jA10 * j12) + (jA9 * j13) + (jA8 * j14) + (jA7 * jA) + (jA6 * j21);
            long j24 = (jA10 * j13) + (jA9 * j14) + (jA8 * jA) + (jA7 * j21) + (jA6 * jA3);
            long j25 = (jA10 * j14) + (jA9 * jA) + (jA8 * j21) + (jA7 * jA3) + (jA6 * jA4);
            long j26 = jA9 * j21;
            long j27 = jA10 * jA;
            long j28 = j23 + (j22 >> 26);
            long j29 = j24 + (j28 >> 26);
            long j30 = j25 + (j29 >> 26);
            long j31 = j27 + j26 + (jA8 * jA3) + (jA7 * jA4) + (jA6 * jA5) + (j30 >> 26);
            long j32 = j31 >> 26;
            j18 = j31 & 67108863;
            long j33 = (j32 * 5) + (j22 & 67108863);
            i12 += 16;
            j16 = j29 & 67108863;
            j17 = j30 & 67108863;
            j19 = j33 & 67108863;
            j15 = (j28 & 67108863) + (j33 >> 26);
            jA2 = j21;
            i11 = 3;
        }
        long j34 = j16 + (j15 >> 26);
        long j35 = j34 & 67108863;
        long j36 = j17 + (j34 >> 26);
        long j37 = j36 & 67108863;
        long j38 = j18 + (j36 >> 26);
        long j39 = j38 & 67108863;
        long j40 = ((j38 >> 26) * 5) + j19;
        long j41 = j40 >> 26;
        long j42 = j40 & 67108863;
        long j43 = (j15 & 67108863) + j41;
        long j44 = j42 + 5;
        long j45 = j44 & 67108863;
        long j46 = j43 + (j44 >> 26);
        long j47 = j35 + (j46 >> 26);
        long j48 = j37 + (j47 >> 26);
        long j49 = j48 & 67108863;
        long j50 = (j39 + (j48 >> 26)) - 67108864;
        long j51 = j50 >> 63;
        long j52 = j42 & j51;
        long j53 = j43 & j51;
        long j54 = j35 & j51;
        long j55 = j37 & j51;
        long j56 = j39 & j51;
        long j57 = ~j51;
        long j58 = j53 | (j46 & 67108863 & j57);
        long j59 = j54 | (j47 & 67108863 & j57);
        long j60 = j55 | (j49 & j57);
        long j61 = (j52 | (j45 & j57) | (j58 << 26)) & 4294967295L;
        long j62 = ((j58 >> 6) | (j59 << 20)) & 4294967295L;
        long j63 = ((j59 >> 12) | (j60 << 14)) & 4294967295L;
        long j64 = ((j60 >> 18) | ((j56 | (j50 & j57)) << 8)) & 4294967295L;
        long jA11 = a(bArr, 16) + j61;
        long j65 = jA11 & 4294967295L;
        long jA12 = a(bArr, 20) + j62 + (jA11 >> 32);
        long jA13 = a(bArr, 24) + j63 + (jA12 >> 32);
        long jA14 = (a(bArr, 28) + j64 + (jA13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        b(j65, bArr4, 0);
        b(jA12 & 4294967295L, bArr4, 4);
        b(jA13 & 4294967295L, bArr4, 8);
        b(jA14, bArr4, 12);
        return bArr4;
    }
}
