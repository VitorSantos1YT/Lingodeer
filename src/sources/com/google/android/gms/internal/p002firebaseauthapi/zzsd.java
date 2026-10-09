package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzsd implements zzsc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzjb.zza f10937d = zzjb.zza.zza;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f10938e = new zzsg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f10939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f10940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f10941c;

    public zzsd(byte[] bArr) throws GeneralSecurityException {
        zzzq.b(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f10939a = secretKeySpec;
        if (!f10937d.a()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f10938e.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrA = zzru.a(cipher.doFinal(new byte[16]));
        this.f10940b = bArrA;
        this.f10941c = zzru.a(bArrA);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsc
    public final byte[] a(byte[] bArr, int i11) throws GeneralSecurityException {
        byte[] bArrC;
        if (i11 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!f10937d.a()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f10938e.get();
        cipher.init(1, this.f10939a);
        int length = bArr.length;
        int i12 = length == 0 ? 1 : ((length - 1) / 16) + 1;
        if ((i12 << 4) == bArr.length) {
            bArrC = zzyl.b(bArr, (i12 - 1) << 4, this.f10940b, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (i12 - 1) << 4, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrC = zzyl.c(bArrCopyOf, this.f10941c);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i13 = 0; i13 < i12 - 1; i13++) {
            int i14 = i13 << 4;
            for (int i15 = 0; i15 < 16; i15++) {
                bArr3[i15] = (byte) (bArr2[i15] ^ bArr[i15 + i14]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        for (int i16 = 0; i16 < 16; i16++) {
            bArr3[i16] = (byte) (bArr2[i16] ^ bArrC[i16]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i11 ? bArr2 : Arrays.copyOf(bArr2, i11);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
