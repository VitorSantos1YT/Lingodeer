package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzin implements zzbm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzjb.zza f10555d = zzjb.zza.zza;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f10556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f10557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f10558c;

    public zzin(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f10555d.a()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f10556a = bArr;
        this.f10557b = bArr2;
        this.f10558c = provider;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f10557b;
        if (length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzqj.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzhu.c(this.f10556a, bArr4), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        zzjb.zza zzaVar = zzhl.f10519d;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.f10558c);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 24, (bArr.length - bArr3.length) - 24);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = zzpz.a(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzhu.c(this.f10556a, bArrA), "ChaCha20");
        byte[] bArr3 = new byte[12];
        System.arraycopy(bArrA, 16, bArr3, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        zzjb.zza zzaVar = zzhl.f10519d;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.f10558c);
        cipher.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr4 = this.f10557b;
        if (outputSize > 2147483623 - bArr4.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + 24 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr4.length, 24);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr4.length + 24) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
