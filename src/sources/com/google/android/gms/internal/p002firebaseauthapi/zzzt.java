package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzzt {
    public static byte[] a(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return b(bArr, bArr2);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        int i11 = 32;
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        int i12 = 0;
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        byte b3 = (byte) (bArrCopyOf[31] & 127);
        bArrCopyOf[31] = b3;
        bArrCopyOf[31] = (byte) (b3 | 64);
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
        bArrCopyOf2[31] = (byte) (bArrCopyOf2[31] & 127);
        for (int i13 = 0; i13 < 7; i13++) {
            byte[][] bArr3 = zznj.f10776a;
            if (MessageDigest.isEqual(bArr3[i13], bArrCopyOf2)) {
                throw new InvalidKeyException(a.e("Banned public key: ", zzzj.a(bArr3[i13])));
            }
        }
        int i14 = 10;
        long[] jArr2 = new long[10];
        for (int i15 = 0; i15 < 10; i15++) {
            int i16 = zznp.f10785a[i15];
            jArr2[i15] = (((((long) (bArrCopyOf2[i16 + 3] & 255)) << 24) | ((((long) (bArrCopyOf2[i16] & 255)) | (((long) (bArrCopyOf2[i16 + 1] & 255)) << 8)) | (((long) (bArrCopyOf2[i16 + 2] & 255)) << 16))) >> zznp.f10786b[i15]) & ((long) zznp.f10787c[i15 & 1]);
        }
        long[] jArr3 = new long[19];
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        jArr5[0] = 1;
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        long[] jArr8 = new long[19];
        jArr8[0] = 1;
        long[] jArr9 = new long[19];
        long[] jArr10 = new long[19];
        jArr10[0] = 1;
        System.arraycopy(jArr2, 0, jArr3, 0, 10);
        while (i12 < i11) {
            int i17 = bArrCopyOf[31 - i12] & 255;
            int i18 = 0;
            while (i18 < 8) {
                int i19 = (i17 >> (7 - i18)) & 1;
                zznj.a(jArr5, jArr3, i19);
                zznj.a(jArr6, jArr4, i19);
                byte[] bArr4 = bArrCopyOf;
                long[] jArrCopyOf = Arrays.copyOf(jArr5, 10);
                int i21 = i17;
                long[] jArr11 = new long[19];
                int i22 = i12;
                long[] jArr12 = new long[19];
                int i23 = i18;
                long[] jArr13 = new long[19];
                long[] jArr14 = jArr;
                long[] jArr15 = new long[19];
                long[] jArr16 = new long[19];
                long[] jArr17 = jArr10;
                long[] jArr18 = new long[19];
                long[] jArr19 = new long[19];
                zznp.h(jArr5, jArr5, jArr6);
                zznp.f(jArr6, jArrCopyOf, jArr6);
                long[] jArrCopyOf2 = Arrays.copyOf(jArr3, 10);
                zznp.h(jArr3, jArr3, jArr4);
                zznp.f(jArr4, jArrCopyOf2, jArr4);
                zznp.e(jArr15, jArr3, jArr6);
                zznp.e(jArr16, jArr5, jArr4);
                zznp.c(jArr15);
                zznp.a(jArr15);
                zznp.c(jArr16);
                zznp.a(jArr16);
                long[] jArr20 = jArr3;
                System.arraycopy(jArr15, 0, jArrCopyOf2, 0, 10);
                zznp.h(jArr15, jArr15, jArr16);
                zznp.f(jArr16, jArrCopyOf2, jArr16);
                zznp.d(jArr19, jArr15);
                zznp.d(jArr18, jArr16);
                zznp.e(jArr16, jArr18, jArr2);
                zznp.c(jArr16);
                zznp.a(jArr16);
                System.arraycopy(jArr19, 0, jArr7, 0, 10);
                System.arraycopy(jArr16, 0, jArr8, 0, 10);
                zznp.d(jArr12, jArr5);
                zznp.d(jArr13, jArr6);
                zznp.e(jArr9, jArr12, jArr13);
                zznp.c(jArr9);
                zznp.a(jArr9);
                zznp.f(jArr13, jArr12, jArr13);
                Arrays.fill(jArr11, 10, 18, 0L);
                int i24 = 0;
                for (int i25 = 10; i24 < i25; i25 = 10) {
                    jArr11[i24] = jArr13[i24] * 121665;
                    i24++;
                }
                zznp.a(jArr11);
                zznp.h(jArr11, jArr11, jArr12);
                zznp.e(jArr17, jArr13, jArr11);
                zznp.c(jArr17);
                zznp.a(jArr17);
                zznj.a(jArr9, jArr7, i19);
                zznj.a(jArr17, jArr8, i19);
                i18 = i23 + 1;
                long[] jArr21 = jArr5;
                jArr5 = jArr9;
                jArr9 = jArr21;
                long[] jArr22 = jArr6;
                jArr6 = jArr17;
                jArr10 = jArr22;
                long[] jArr23 = jArr8;
                jArr8 = jArr4;
                jArr4 = jArr23;
                i17 = i21;
                jArr3 = jArr7;
                bArrCopyOf = bArr4;
                i12 = i22;
                jArr = jArr14;
                jArr7 = jArr20;
            }
            i12++;
            i11 = 32;
            i14 = 10;
        }
        long[] jArr24 = jArr;
        int i26 = i14;
        long[] jArr25 = new long[i26];
        long[] jArr26 = new long[i26];
        long[] jArr27 = new long[i26];
        long[] jArr28 = new long[i26];
        long[] jArr29 = new long[i26];
        long[] jArr30 = new long[i26];
        long[] jArr31 = new long[i26];
        long[] jArr32 = new long[i26];
        long[] jArr33 = new long[i26];
        long[] jArr34 = new long[i26];
        long[] jArr35 = jArr3;
        long[] jArr36 = new long[i26];
        zznp.d(jArr26, jArr6);
        zznp.d(jArr36, jArr26);
        zznp.d(jArr34, jArr36);
        zznp.b(jArr27, jArr34, jArr6);
        zznp.b(jArr28, jArr27, jArr26);
        zznp.d(jArr34, jArr28);
        zznp.b(jArr29, jArr34, jArr27);
        zznp.d(jArr34, jArr29);
        zznp.d(jArr36, jArr34);
        zznp.d(jArr34, jArr36);
        zznp.d(jArr36, jArr34);
        zznp.d(jArr34, jArr36);
        zznp.b(jArr30, jArr34, jArr29);
        zznp.d(jArr34, jArr30);
        zznp.d(jArr36, jArr34);
        for (int i27 = 2; i27 < 10; i27 += 2) {
            zznp.d(jArr34, jArr36);
            zznp.d(jArr36, jArr34);
        }
        zznp.b(jArr31, jArr36, jArr30);
        zznp.d(jArr34, jArr31);
        zznp.d(jArr36, jArr34);
        for (int i28 = 2; i28 < 20; i28 += 2) {
            zznp.d(jArr34, jArr36);
            zznp.d(jArr36, jArr34);
        }
        zznp.b(jArr34, jArr36, jArr31);
        zznp.d(jArr36, jArr34);
        zznp.d(jArr34, jArr36);
        for (int i29 = 2; i29 < 10; i29 += 2) {
            zznp.d(jArr36, jArr34);
            zznp.d(jArr34, jArr36);
        }
        zznp.b(jArr32, jArr34, jArr30);
        zznp.d(jArr34, jArr32);
        zznp.d(jArr36, jArr34);
        for (int i30 = 2; i30 < 50; i30 += 2) {
            zznp.d(jArr34, jArr36);
            zznp.d(jArr36, jArr34);
        }
        zznp.b(jArr33, jArr36, jArr32);
        zznp.d(jArr36, jArr33);
        zznp.d(jArr34, jArr36);
        for (int i31 = 2; i31 < 100; i31 += 2) {
            zznp.d(jArr36, jArr34);
            zznp.d(jArr34, jArr36);
        }
        zznp.b(jArr36, jArr34, jArr33);
        zznp.d(jArr34, jArr36);
        zznp.d(jArr36, jArr34);
        for (int i32 = 2; i32 < 50; i32 += 2) {
            zznp.d(jArr34, jArr36);
            zznp.d(jArr36, jArr34);
        }
        zznp.b(jArr34, jArr36, jArr32);
        zznp.d(jArr36, jArr34);
        zznp.d(jArr34, jArr36);
        zznp.d(jArr36, jArr34);
        zznp.d(jArr34, jArr36);
        zznp.d(jArr36, jArr34);
        zznp.b(jArr25, jArr36, jArr28);
        zznp.b(jArr24, jArr5, jArr25);
        long[] jArr37 = new long[10];
        long[] jArr38 = new long[10];
        long[] jArr39 = new long[11];
        long[] jArr40 = new long[11];
        long[] jArr41 = new long[11];
        zznp.b(jArr37, jArr2, jArr24);
        zznp.h(jArr38, jArr2, jArr24);
        long[] jArr42 = new long[10];
        jArr42[0] = 486662;
        zznp.h(jArr40, jArr38, jArr42);
        zznp.b(jArr40, jArr40, jArr4);
        zznp.h(jArr40, jArr40, jArr35);
        zznp.b(jArr40, jArr40, jArr37);
        zznp.b(jArr40, jArr40, jArr35);
        for (int i33 = 0; i33 < 10; i33++) {
            jArr39[i33] = jArr40[i33] * 4;
        }
        zznp.a(jArr39);
        zznp.b(jArr40, jArr37, jArr4);
        zznp.f(jArr40, jArr40, jArr4);
        zznp.b(jArr41, jArr38, jArr35);
        zznp.h(jArr40, jArr40, jArr41);
        zznp.d(jArr40, jArr40);
        if (MessageDigest.isEqual(zznp.g(jArr39), zznp.g(jArr40))) {
            return zznp.g(jArr24);
        }
        throw new IllegalStateException(a.e("Arithmetic error in curve multiplication with the public key: ", zzzj.a(bArr2)));
    }
}
