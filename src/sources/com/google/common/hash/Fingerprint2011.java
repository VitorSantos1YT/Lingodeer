package com.google.common.hash;

import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class Fingerprint2011 extends AbstractNonStreamingHashFunction {
    static {
        new Fingerprint2011();
    }

    public static long c(long j11, long j12) {
        long j13 = (j12 ^ j11) * (-4132994306676758123L);
        long j14 = (j11 ^ (j13 ^ (j13 >>> 47))) * (-4132994306676758123L);
        return (j14 ^ (j14 >>> 47)) * (-4132994306676758123L);
    }

    public static long d(long j11) {
        return j11 ^ (j11 >>> 47);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.hash.LittleEndianByteArray$LittleEndianBytes, java.lang.Enum] */
    public static void e(byte[] bArr, int i11, long j11, long j12, long[] jArr) {
        ?? r9 = LittleEndianByteArray.f17368a;
        long jA = r9.a(bArr, i11);
        long jA2 = r9.a(bArr, i11 + 8);
        long jA3 = r9.a(bArr, i11 + 16);
        long jA4 = r9.a(bArr, i11 + 24);
        long j13 = j11 + jA;
        long j14 = jA2 + j13 + jA3;
        long jRotateRight = Long.rotateRight(j14, 23) + Long.rotateRight(j12 + j13 + jA4, 51);
        jArr[0] = j14 + jA4;
        jArr[1] = jRotateRight + j13;
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [com.google.common.hash.LittleEndianByteArray$LittleEndianBytes, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r15v5, types: [com.google.common.hash.LittleEndianByteArray$LittleEndianBytes, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.common.hash.LittleEndianByteArray$LittleEndianBytes, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v24, types: [com.google.common.hash.LittleEndianByteArray$LittleEndianBytes, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v19, types: [com.google.common.hash.LittleEndianByteArray$LittleEndianBytes, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.google.common.hash.LittleEndianByteArray$LittleEndianBytes, java.lang.Enum] */
    @Override // com.google.common.hash.AbstractNonStreamingHashFunction
    public final HashCode b(byte[] bArr, int i11) {
        long j11;
        long j12;
        long j13;
        long j14;
        long jRotateRight;
        long[] jArr;
        long jC;
        int i12;
        long j15;
        byte[] bArr2 = bArr;
        Preconditions.m(0, i11, bArr2.length);
        if (i11 <= 32) {
            int i13 = i11 & (-8);
            int i14 = i11 & 7;
            long j16 = -4132994306676758123L;
            long jD = (((long) i11) * (-4132994306676758123L)) ^ (-1397348546323613475L);
            for (int i15 = 0; i15 < i13; i15 += 8) {
                jD = (jD ^ (d(LittleEndianByteArray.f17368a.a(bArr2, i15) * (-4132994306676758123L)) * (-4132994306676758123L))) * (-4132994306676758123L);
            }
            if (i14 != 0) {
                Enum r14 = LittleEndianByteArray.f17368a;
                int iMin = Math.min(i14, 8);
                int i16 = 0;
                long j17 = 0;
                while (i16 < iMin) {
                    j17 |= (((long) bArr2[i13 + i16]) & 255) << (i16 * 8);
                    i16++;
                    j16 = j16;
                }
                j15 = j16;
                jD = (jD ^ j17) * j15;
            } else {
                j15 = -4132994306676758123L;
            }
            jC = d(d(jD) * j15);
            j11 = -6505348102511208375L;
            i12 = 8;
            j12 = 0;
        } else {
            if (i11 <= 64) {
                ?? r9 = LittleEndianByteArray.f17368a;
                long jA = r9.a(bArr2, 24);
                j12 = 0;
                int i17 = i11 - 16;
                long jA2 = ((((long) i11) + r9.a(bArr2, i17)) * (-6505348102511208375L)) + r9.a(bArr2, 0);
                long jRotateRight2 = Long.rotateRight(jA2 + jA, 52);
                long jRotateRight3 = Long.rotateRight(jA2, 37);
                long jA3 = jA2 + r9.a(bArr2, 8);
                j11 = -6505348102511208375L;
                long jRotateRight4 = Long.rotateRight(jA3, 7) + jRotateRight3;
                long jA4 = jA3 + r9.a(bArr2, 16);
                long j18 = jA + jA4;
                long jRotateRight5 = Long.rotateRight(jA4, 31) + jRotateRight2 + jRotateRight4;
                long jA5 = r9.a(bArr2, 16) + r9.a(bArr2, i11 - 32);
                long jA6 = r9.a(bArr2, i11 - 8);
                long jRotateRight6 = Long.rotateRight(jA5 + jA6, 52);
                long jRotateRight7 = Long.rotateRight(jA5, 37);
                long jA7 = jA5 + r9.a(bArr2, i11 - 24);
                long jRotateRight8 = Long.rotateRight(jA7, 7) + jRotateRight7;
                long jA8 = jA7 + r9.a(bArr2, i17);
                jC = (-4288712594273399085L) * d((d(((jA8 + jA6 + jRotateRight5) * (-6505348102511208375L)) + ((Long.rotateRight(jA8, 31) + jRotateRight6 + jRotateRight8 + j18) * (-4288712594273399085L))) * (-6505348102511208375L)) + jRotateRight5);
            } else {
                j11 = -6505348102511208375L;
                j12 = 0;
                ?? r11 = LittleEndianByteArray.f17368a;
                long jA9 = r11.a(bArr2, 0);
                long jA10 = r11.a(bArr2, i11 - 16) ^ (-8261664234251669945L);
                long jA11 = r11.a(bArr2, i11 - 56) ^ (-6505348102511208375L);
                long[] jArr2 = new long[2];
                long[] jArr3 = new long[2];
                long j19 = i11;
                e(bArr2, i11 - 64, j19, jA10, jArr2);
                bArr2 = bArr;
                e(bArr2, i11 - 32, j19 * (-8261664234251669945L), -6505348102511208375L, jArr3);
                long jD2 = (d(jArr2[1]) * (-8261664234251669945L)) + jA11;
                long jRotateRight9 = Long.rotateRight(jA9 + jD2, 39) * (-8261664234251669945L);
                long jRotateRight10 = Long.rotateRight(jA10, 33) * (-8261664234251669945L);
                int i18 = (i11 - 1) & (-64);
                int i19 = 0;
                while (true) {
                    long j21 = jRotateRight9 + jRotateRight10 + jArr2[0];
                    ?? r12 = LittleEndianByteArray.f17368a;
                    long jRotateRight11 = Long.rotateRight(j21 + r12.a(bArr2, i19 + 16), 37) * (-8261664234251669945L);
                    long jRotateRight12 = Long.rotateRight(jRotateRight10 + jArr2[1] + r12.a(bArr2, i19 + 48), 42) * (-8261664234251669945L);
                    j13 = jRotateRight11 ^ jArr3[1];
                    j14 = jRotateRight12 ^ jArr2[0];
                    jRotateRight = Long.rotateRight(jD2 ^ jArr3[0], 33);
                    e(bArr2, i19, jArr2[1] * (-8261664234251669945L), j13 + jArr3[0], jArr2);
                    bArr2 = bArr;
                    jArr = jArr3;
                    e(bArr2, i19 + 32, jRotateRight + jArr3[1], j14, jArr);
                    i19 += 64;
                    i18 -= 64;
                    if (i18 == 0) {
                        break;
                    }
                    jArr3 = jArr;
                    jD2 = j13;
                    jRotateRight10 = j14;
                    jRotateRight9 = jRotateRight;
                }
                jC = c((d(j14) * (-8261664234251669945L)) + c(jArr2[0], jArr[0]) + j13, c(jArr2[1], jArr[1]) + jRotateRight);
            }
            i12 = 8;
        }
        long jC2 = c(jC + (i11 >= 9 ? LittleEndianByteArray.f17368a.a(bArr2, i11 - 8) : j11), i11 >= i12 ? LittleEndianByteArray.f17368a.a(bArr2, 0) : j11);
        if (jC2 == j12 || jC2 == 1) {
            jC2 -= 2;
        }
        char[] cArr = HashCode.f17363a;
        return new HashCode.LongHashCode(jC2);
    }

    public final String toString() {
        return "Hashing.fingerprint2011()";
    }
}
