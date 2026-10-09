package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zznp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f10785a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f10786b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f10787c = {67108863, 33554431};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f10788d = {26, 25};

    public static void a(long[] jArr) {
        jArr[10] = 0;
        int i11 = 0;
        while (i11 < 10) {
            long j11 = jArr[i11];
            long j12 = j11 / 67108864;
            jArr[i11] = j11 - (j12 << 26);
            int i12 = i11 + 1;
            long j13 = jArr[i12] + j12;
            jArr[i12] = j13;
            long j14 = j13 / 33554432;
            jArr[i12] = j13 - (j14 << 25);
            i11 += 2;
            jArr[i11] = jArr[i11] + j14;
        }
        long j15 = jArr[0];
        long j16 = jArr[10];
        long j17 = j15 + (j16 << 4);
        jArr[0] = j17;
        long j18 = j17 + (j16 << 1);
        jArr[0] = j18;
        long j19 = j18 + j16;
        jArr[0] = j19;
        jArr[10] = 0;
        long j21 = j19 / 67108864;
        jArr[0] = j19 - (j21 << 26);
        jArr[1] = jArr[1] + j21;
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        e(jArr4, jArr2, jArr3);
        c(jArr4);
        a(jArr4);
        System.arraycopy(jArr4, 0, jArr, 0, 10);
    }

    public static void c(long[] jArr) {
        long j11 = jArr[8];
        long j12 = jArr[18];
        long j13 = j11 + (j12 << 4);
        jArr[8] = j13;
        long j14 = j13 + (j12 << 1);
        jArr[8] = j14;
        jArr[8] = j14 + j12;
        long j15 = jArr[7];
        long j16 = jArr[17];
        long j17 = j15 + (j16 << 4);
        jArr[7] = j17;
        long j18 = j17 + (j16 << 1);
        jArr[7] = j18;
        jArr[7] = j18 + j16;
        long j19 = jArr[6];
        long j21 = jArr[16];
        long j22 = j19 + (j21 << 4);
        jArr[6] = j22;
        long j23 = j22 + (j21 << 1);
        jArr[6] = j23;
        jArr[6] = j23 + j21;
        long j24 = jArr[5];
        long j25 = jArr[15];
        long j26 = j24 + (j25 << 4);
        jArr[5] = j26;
        long j27 = j26 + (j25 << 1);
        jArr[5] = j27;
        jArr[5] = j27 + j25;
        long j28 = jArr[4];
        long j29 = jArr[14];
        long j30 = j28 + (j29 << 4);
        jArr[4] = j30;
        long j31 = j30 + (j29 << 1);
        jArr[4] = j31;
        jArr[4] = j31 + j29;
        long j32 = jArr[3];
        long j33 = jArr[13];
        long j34 = j32 + (j33 << 4);
        jArr[3] = j34;
        long j35 = j34 + (j33 << 1);
        jArr[3] = j35;
        jArr[3] = j35 + j33;
        long j36 = jArr[2];
        long j37 = jArr[12];
        long j38 = j36 + (j37 << 4);
        jArr[2] = j38;
        long j39 = j38 + (j37 << 1);
        jArr[2] = j39;
        jArr[2] = j39 + j37;
        long j40 = jArr[1];
        long j41 = jArr[11];
        long j42 = j40 + (j41 << 4);
        jArr[1] = j42;
        long j43 = j42 + (j41 << 1);
        jArr[1] = j43;
        jArr[1] = j43 + j41;
        long j44 = jArr[0];
        long j45 = jArr[10];
        long j46 = j44 + (j45 << 4);
        jArr[0] = j46;
        long j47 = j46 + (j45 << 1);
        jArr[0] = j47;
        jArr[0] = j47 + j45;
    }

    public static void d(long[] jArr, long[] jArr2) {
        long j11 = jArr2[0];
        long j12 = j11 * 2;
        long j13 = jArr2[1];
        long j14 = jArr2[2];
        long j15 = jArr2[3];
        long j16 = jArr2[4];
        long j17 = jArr2[5];
        long j18 = jArr2[6];
        long j19 = jArr2[7];
        long j21 = jArr2[8];
        long j22 = jArr2[9];
        long[] jArr3 = {j11 * j11, j12 * j13, ((j11 * j14) + (j13 * j13)) * 2, ((j11 * j15) + (j13 * j14)) * 2, (j12 * j16) + (j13 * 4 * j15) + (j14 * j14), ((j11 * j17) + (j13 * j16) + (j14 * j15)) * 2, ((j13 * 2 * j17) + (j11 * j18) + (j14 * j16) + (j15 * j15)) * 2, ((j11 * j19) + (j13 * j18) + (j14 * j17) + (j15 * j16)) * 2, (((((j15 * j17) + (j13 * j19)) * 2) + (j11 * j21) + (j14 * j18)) * 2) + (j16 * j16), ((j11 * j22) + (j13 * j21) + (j14 * j19) + (j15 * j18) + (j16 * j17)) * 2, ((((j13 * j22) + (j15 * j19)) * 2) + (j14 * j21) + (j16 * j18) + (j17 * j17)) * 2, ((j14 * j22) + (j15 * j21) + (j16 * j19) + (j17 * j18)) * 2, (((((j15 * j22) + (j17 * j19)) * 2) + (j16 * j21)) * 2) + (j18 * j18), ((j16 * j22) + (j17 * j21) + (j18 * j19)) * 2, ((j17 * 2 * j22) + (j18 * j21) + (j19 * j19)) * 2, ((j18 * j22) + (j19 * j21)) * 2, (j19 * 4 * j22) + (j21 * j21), j21 * 2 * j22, 2 * j22 * j22};
        c(jArr3);
        a(jArr3);
        System.arraycopy(jArr3, 0, jArr, 0, 10);
    }

    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j11 = jArr2[0];
        long j12 = jArr3[1] * j11;
        long j13 = jArr2[1];
        long j14 = jArr3[0];
        jArr[1] = (j13 * j14) + j12;
        long j15 = jArr2[1];
        long j16 = jArr3[1];
        jArr[2] = (jArr2[2] * j14) + (jArr3[2] * j11) + (j15 * 2 * j16);
        long j17 = jArr3[2];
        long j18 = jArr2[2];
        jArr[3] = (jArr2[3] * j14) + (jArr3[3] * j11) + (j18 * j16) + (j15 * j17);
        long j19 = jArr3[3];
        long j21 = jArr2[3];
        jArr[4] = (jArr2[4] * j14) + (jArr3[4] * j11) + (((j21 * j16) + (j15 * j19)) * 2) + (j18 * j17);
        long j22 = jArr3[4];
        long j23 = (j15 * j22) + (j21 * j17) + (j18 * j19);
        long j24 = jArr2[4];
        jArr[5] = (jArr2[5] * j14) + (jArr3[5] * j11) + (j24 * j16) + j23;
        long j25 = jArr3[5];
        long j26 = jArr2[5];
        jArr[6] = (jArr2[6] * j14) + (jArr3[6] * j11) + (j24 * j17) + (j18 * j22) + (((j26 * j16) + (j15 * j25) + (j21 * j19)) * 2);
        long j27 = (j26 * j17) + (j18 * j25) + (j24 * j19) + (j21 * j22);
        long j28 = jArr3[6];
        long j29 = (j15 * j28) + j27;
        long j30 = jArr2[6];
        jArr[7] = (jArr2[7] * j14) + (jArr3[7] * j11) + (j30 * j16) + j29;
        long j31 = jArr3[7];
        long j32 = (j15 * j31) + (j26 * j19) + (j21 * j25);
        long j33 = jArr2[7];
        long j34 = (((j33 * j16) + j32) * 2) + (j24 * j22);
        jArr[8] = (jArr2[8] * j14) + (jArr3[8] * j11) + (j30 * j17) + (j18 * j28) + j34;
        long j35 = (j33 * j17) + (j18 * j31) + (j30 * j19) + (j21 * j28) + (j26 * j22) + (j24 * j25);
        long j36 = jArr3[8];
        long j37 = (j15 * j36) + j35;
        long j38 = jArr2[8];
        jArr[9] = (jArr2[9] * j14) + (j11 * jArr3[9]) + (j38 * j16) + j37;
        long j39 = (j33 * j19) + (j21 * j31) + (j26 * j25);
        long j40 = jArr3[9];
        long j41 = jArr2[9];
        long j42 = j24 * j28;
        jArr[10] = (j38 * j17) + (j18 * j36) + (j30 * j22) + j42 + (((j16 * j41) + (j15 * j40) + j39) * 2);
        long j43 = j18 * j40;
        long j44 = j17 * j41;
        jArr[11] = j44 + j43 + (j38 * j19) + (j21 * j36) + (j33 * j22) + (j24 * j31) + (j30 * j25) + (j26 * j28);
        long j45 = j21 * j40;
        long j46 = j19 * j41;
        long j47 = j38 * j22;
        jArr[12] = j47 + (j24 * j36) + ((j46 + j45 + (j33 * j25) + (j26 * j31)) * 2) + (j30 * j28);
        long j48 = j24 * j40;
        long j49 = j22 * j41;
        jArr[13] = j49 + j48 + (j38 * j25) + (j26 * j36) + (j33 * j28) + (j30 * j31);
        long j50 = j25 * j41;
        long j51 = j38 * j28;
        jArr[14] = j51 + (j30 * j36) + ((j50 + (j26 * j40) + (j33 * j31)) * 2);
        long j52 = j30 * j40;
        long j53 = j28 * j41;
        jArr[15] = j53 + j52 + (j38 * j31) + (j33 * j36);
        jArr[16] = (((j31 * j41) + (j33 * j40)) * 2) + (j38 * j36);
        jArr[17] = (j36 * j41) + (j38 * j40);
        jArr[18] = j41 * 2 * j40;
    }

    public static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 10; i11++) {
            jArr[i11] = jArr2[i11] - jArr3[i11];
        }
    }

    public static byte[] g(long[] jArr) {
        long j11;
        int[] iArr;
        int i11;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            j11 = 19;
            iArr = f10788d;
            if (i13 >= 2) {
                break;
            }
            int i14 = 0;
            while (i14 < 9) {
                long j12 = jArrCopyOf[i14];
                int i15 = iArr[i14 & 1];
                int i16 = -((int) (((j12 >> 31) & j12) >> i15));
                jArrCopyOf[i14] = j12 + ((long) (i16 << i15));
                i14++;
                jArrCopyOf[i14] = jArrCopyOf[i14] - ((long) i16);
            }
            long j13 = jArrCopyOf[9];
            int i17 = -((int) (((j13 >> 31) & j13) >> 25));
            jArrCopyOf[9] = j13 + ((long) (i17 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i17) * 19);
            i13++;
        }
        long j14 = jArrCopyOf[0];
        int i18 = -((int) (((j14 >> 31) & j14) >> 26));
        jArrCopyOf[0] = j14 + ((long) (i18 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i18);
        int i19 = 0;
        while (true) {
            iArr2 = f10787c;
            if (i19 >= 2) {
                break;
            }
            int i21 = i12;
            while (i21 < 9) {
                long j15 = jArrCopyOf[i21];
                int i22 = i21 & 1;
                int i23 = i12;
                int i24 = i19;
                int i25 = (int) (j15 >> iArr[i22]);
                jArrCopyOf[i21] = j15 & ((long) iArr2[i22]);
                i21++;
                jArrCopyOf[i21] = jArrCopyOf[i21] + ((long) i25);
                i12 = i23;
                j11 = j11;
                i19 = i24;
            }
            i19++;
        }
        int i26 = i12;
        long j16 = jArrCopyOf[9];
        jArrCopyOf[9] = j16 & 33554431;
        long j17 = (((long) ((int) (j16 >> 25))) * j11) + jArrCopyOf[i26];
        jArrCopyOf[i26] = j17;
        int i27 = ~((((int) j17) - 67108845) >> 31);
        for (int i28 = 1; i28 < 10; i28++) {
            int i29 = ~(((int) jArrCopyOf[i28]) ^ iArr2[i28 & 1]);
            int i30 = i29 & (i29 << 16);
            int i31 = i30 & (i30 << 8);
            int i32 = i31 & (i31 << 4);
            int i33 = i32 & (i32 << 2);
            i27 &= (i33 & (i33 << 1)) >> 31;
        }
        jArrCopyOf[i26] = jArrCopyOf[i26] - ((long) (67108845 & i27));
        long j18 = 33554431 & i27;
        jArrCopyOf[1] = jArrCopyOf[1] - j18;
        for (i11 = 2; i11 < 10; i11 += 2) {
            jArrCopyOf[i11] = jArrCopyOf[i11] - ((long) (67108863 & i27));
            int i34 = i11 + 1;
            jArrCopyOf[i34] = jArrCopyOf[i34] - j18;
        }
        for (int i35 = i26; i35 < 10; i35++) {
            jArrCopyOf[i35] = jArrCopyOf[i35] << f10786b[i35];
        }
        byte[] bArr = new byte[32];
        for (int i36 = i26; i36 < 10; i36++) {
            int i37 = f10785a[i36];
            long j19 = bArr[i37];
            long j21 = jArrCopyOf[i36];
            bArr[i37] = (byte) (j19 | (j21 & 255));
            int i38 = i37 + 1;
            bArr[i38] = (byte) (((long) bArr[i38]) | ((j21 >> 8) & 255));
            int i39 = i37 + 2;
            bArr[i39] = (byte) (((long) bArr[i39]) | ((j21 >> 16) & 255));
            int i40 = i37 + 3;
            bArr[i40] = (byte) (((long) bArr[i40]) | ((j21 >> 24) & 255));
        }
        return bArr;
    }

    public static void h(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 10; i11++) {
            jArr[i11] = jArr2[i11] + jArr3[i11];
        }
    }
}
