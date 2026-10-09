package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyg implements zzbm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzjb.zza f11012c = zzjb.zza.zzb;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f11013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11014b;

    public zzyg(byte[] bArr, zzzv zzzvVar) throws GeneralSecurityException {
        if (!f11012c.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        ThreadLocal threadLocal = zzgv.f10499a;
        zzzq.b(bArr.length);
        this.f11013a = new SecretKeySpec(bArr, "AES");
        this.f11014b = zzzvVar.b();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f11014b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzqj.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = zzgv.a(bArr, bArr3.length, 12);
        Cipher cipher = (Cipher) zzgv.f10499a.get();
        cipher.init(2, this.f11013a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = zzpz.a(12);
        AlgorithmParameterSpec algorithmParameterSpecA = zzgv.a(bArrA, 0, bArrA.length);
        Cipher cipher = (Cipher) zzgv.f10499a.get();
        cipher.init(1, this.f11013a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr3 = this.f11014b;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr3.length, 12);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + 12) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
