package com.google.common.hash;

import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class FarmHashFingerprint64 extends AbstractNonStreamingHashFunction {
    static {
        new FarmHashFingerprint64();
    }

    public static long c(long j11, long j12, long j13) {
        long j14 = (j11 ^ j12) * j13;
        long j15 = ((j14 ^ (j14 >>> 47)) ^ j12) * j13;
        return (j15 ^ (j15 >>> 47)) * j13;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.hash.LittleEndianByteArray$LittleEndianBytes, java.lang.Enum] */
    public static void d(byte[] bArr, int i11, long j11, long j12, long[] jArr) {
        ?? r9 = LittleEndianByteArray.f17368a;
        long jA = r9.a(bArr, i11);
        long jA2 = r9.a(bArr, i11 + 8);
        long jA3 = r9.a(bArr, i11 + 16);
        long jA4 = r9.a(bArr, i11 + 24);
        long j13 = j11 + jA;
        long j14 = jA2 + j13 + jA3;
        long jRotateRight = Long.rotateRight(j14, 44) + Long.rotateRight(j12 + j13 + jA4, 21);
        jArr[0] = j14 + jA4;
        jArr[1] = jRotateRight + j13;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [com.google.common.hash.LittleEndianByteArray$LittleEndianBytes, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v29, types: [com.google.common.hash.LittleEndianByteArray$LittleEndianBytes, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v32, types: [com.google.common.hash.LittleEndianByteArray$LittleEndianBytes, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v40, types: [com.google.common.hash.LittleEndianByteArray$LittleEndianBytes, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.common.hash.LittleEndianByteArray$LittleEndianBytes, java.lang.Enum] */
    @Override // com.google.common.hash.AbstractNonStreamingHashFunction
    public final HashCode b(byte[] bArr, int i11) {
        char c11;
        ?? r11;
        long j11;
        long j12;
        long jA;
        long jRotateRight;
        long[] jArr;
        int i12;
        byte[] bArr2 = bArr;
        char c12 = 0;
        Preconditions.m(0, i11, bArr2.length);
        long j13 = -4348849565147123417L;
        long jC = -7286425919675154353L;
        if (i11 > 32) {
            char c13 = '@';
            if (i11 <= 64) {
                long j14 = (((long) i11) * 2) - 7286425919675154353L;
                ?? r9 = LittleEndianByteArray.f17368a;
                long jA2 = r9.a(bArr2, 0) * (-7286425919675154353L);
                long jA3 = r9.a(bArr2, 8);
                long jA4 = r9.a(bArr2, i11 - 8) * j14;
                long jRotateRight2 = Long.rotateRight(jA4, 30) + Long.rotateRight(jA2 + jA3, 43) + (r9.a(bArr2, i11 - 16) * (-7286425919675154353L));
                long jC2 = c(jRotateRight2, Long.rotateRight(jA3 - 7286425919675154353L, 18) + jA2 + jA4, j14);
                long jA5 = r9.a(bArr2, 16) * j14;
                long jA6 = r9.a(bArr2, 24);
                long jA7 = (jRotateRight2 + r9.a(bArr2, i11 - 32)) * j14;
                jC = c(Long.rotateRight(jA7, 30) + Long.rotateRight(jA5 + jA6, 43) + ((r9.a(bArr2, i11 - 24) + jC2) * j14), Long.rotateRight(jA6 + jA2, 18) + jA5 + jA7, j14);
            } else {
                long j15 = 81;
                long j16 = (j15 * (-5435081209227447693L)) + 113;
                long j17 = (j16 * (-7286425919675154353L)) + 113;
                long j18 = ((j17 >>> 47) ^ j17) * (-7286425919675154353L);
                long[] jArr2 = new long[2];
                long[] jArr3 = new long[2];
                long jA8 = (j15 * (-7286425919675154353L)) + LittleEndianByteArray.f17368a.a(bArr2, 0);
                int i13 = i11 - 1;
                int i14 = (i13 / 64) * 64;
                int i15 = i13 & 63;
                int i16 = i14 + i15;
                int i17 = i16 - 63;
                int i18 = i15;
                int i19 = 0;
                while (true) {
                    long j19 = jA8 + j16 + jArr2[c12];
                    c11 = c12;
                    char c14 = c13;
                    r11 = LittleEndianByteArray.f17368a;
                    long jRotateRight3 = Long.rotateRight(j19 + r11.a(bArr2, i19 + 8), 37) * (-5435081209227447693L);
                    long jRotateRight4 = Long.rotateRight(j16 + jArr2[1] + r11.a(bArr2, i19 + 48), 42) * (-5435081209227447693L);
                    j11 = jRotateRight3 ^ jArr3[1];
                    j12 = j13;
                    jA = jArr2[c11] + r11.a(bArr2, i19 + 40) + jRotateRight4;
                    jRotateRight = Long.rotateRight(j18 + jArr3[c11], 33) * (-5435081209227447693L);
                    jArr = jArr2;
                    int i21 = i14;
                    i12 = i18;
                    d(bArr2, i19, jArr2[1] * (-5435081209227447693L), j11 + jArr3[c11], jArr);
                    int i22 = i19;
                    d(bArr2, i22 + 32, jArr3[1] + jRotateRight, r11.a(bArr2, i22 + 16) + jA, jArr3);
                    i19 = i22 + 64;
                    if (i19 == i21) {
                        break;
                    }
                    bArr2 = bArr;
                    jA8 = jRotateRight;
                    j16 = jA;
                    i14 = i21;
                    jArr2 = jArr;
                    c13 = c14;
                    j18 = j11;
                    j13 = j12;
                    i18 = i12;
                    c12 = c11;
                }
                long j21 = ((j11 & 255) << 1) - 5435081209227447693L;
                long j22 = jArr3[c11] + ((long) i12);
                jArr3[c11] = j22;
                long j23 = jArr[c11] + j22;
                jArr[c11] = j23;
                jArr3[c11] = jArr3[c11] + j23;
                long jRotateRight5 = Long.rotateRight(jRotateRight + jA + jArr[c11] + r11.a(bArr2, i16 - 55), 37) * j21;
                long jRotateRight6 = Long.rotateRight(jA + jArr[1] + r11.a(bArr2, i16 - 15), 42) * j21;
                long j24 = jRotateRight5 ^ (jArr3[1] * 9);
                long jA9 = (jArr[c11] * 9) + r11.a(bArr2, i16 - 23) + jRotateRight6;
                long jRotateRight7 = Long.rotateRight(j11 + jArr3[c11], 33) * j21;
                d(bArr2, i17, jArr[1] * j21, jArr3[c11] + j24, jArr);
                d(bArr2, i16 - 31, jArr3[1] + jRotateRight7, r11.a(bArr2, i16 - 47) + jA9, jArr3);
                jC = c((((jA9 >>> 47) ^ jA9) * j12) + c(jArr[c11], jArr3[c11], j21) + j24, c(jArr[1], jArr3[1], j21) + jRotateRight7, j21);
            }
        } else if (i11 > 16) {
            long j25 = (((long) i11) * 2) - 7286425919675154353L;
            ?? r12 = LittleEndianByteArray.f17368a;
            long jA10 = r12.a(bArr2, 0) * (-5435081209227447693L);
            long jA11 = r12.a(bArr2, 8);
            long jA12 = r12.a(bArr2, i11 - 8) * j25;
            jC = c(Long.rotateRight(jA12, 30) + Long.rotateRight(jA10 + jA11, 43) + (r12.a(bArr2, i11 - 16) * (-7286425919675154353L)), Long.rotateRight(jA11 - 7286425919675154353L, 18) + jA10 + jA12, j25);
        } else if (i11 >= 8) {
            long j26 = (((long) i11) * 2) - 7286425919675154353L;
            ?? r13 = LittleEndianByteArray.f17368a;
            long jA13 = r13.a(bArr2, 0) - 7286425919675154353L;
            long jA14 = r13.a(bArr2, i11 - 8);
            jC = c((Long.rotateRight(jA14, 37) * j26) + jA13, (Long.rotateRight(jA13, 25) + jA14) * j26, j26);
        } else if (i11 >= 4) {
            jC = c(((long) i11) + ((((long) LittleEndianByteArray.a(bArr2, 0)) & 4294967295L) << 3), ((long) LittleEndianByteArray.a(bArr2, i11 - 4)) & 4294967295L, ((long) (i11 * 2)) - 7286425919675154353L);
        } else if (i11 > 0) {
            long j27 = (((long) ((bArr2[0] & 255) + ((bArr2[i11 >> 1] & 255) << 8))) * (-7286425919675154353L)) ^ (((long) (((bArr2[i11 - 1] & 255) << 2) + i11)) * (-4348849565147123417L));
            jC = (-7286425919675154353L) * (j27 ^ (j27 >>> 47));
        }
        long j28 = jC;
        char[] cArr = HashCode.f17363a;
        return new HashCode.LongHashCode(j28);
    }

    public final String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
