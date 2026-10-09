package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzii implements zzbm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f10552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzsc f10554c;

    public zzii(byte[] bArr, zzzv zzzvVar, int i11) {
        this.f10554c = zzzl.b(zzsa.d(zzrz.b(bArr.length), zzzw.b(bArr, zzcw.f10287a)));
        this.f10552a = zzzvVar.b();
        this.f10553b = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f10552a;
        int length2 = bArr3.length;
        int i11 = this.f10553b;
        if (length < length2 + i11 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzqj.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int length3 = bArr3.length + i11;
        zzht zzhtVar = new zzht(c(Arrays.copyOfRange(bArr, bArr3.length, length3)));
        int i12 = length3 + 12;
        return zzhtVar.a(Arrays.copyOfRange(bArr, length3, i12), bArr, i12, bArr2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        int i11 = this.f10553b;
        int i12 = i11 + 12;
        byte[] bArrA = zzpz.a(i12);
        byte[] bArrCopyOf = Arrays.copyOf(bArrA, i11);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, i11, i12);
        zzht zzhtVar = new zzht(c(bArrCopyOf));
        byte[] bArr3 = this.f10552a;
        int length = bArr3.length + i11 + bArrCopyOfRange.length;
        if (bArrCopyOfRange.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = zzgv.a(bArrCopyOfRange, 0, bArrCopyOfRange.length);
        Cipher cipher = (Cipher) zzgv.f10499a.get();
        cipher.init(1, zzhtVar.f10533a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        if (outputSize > Integer.MAX_VALUE - length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr4 = new byte[length + outputSize];
        if (cipher.doFinal(bArr, 0, bArr.length, bArr4, length) != outputSize) {
            throw new GeneralSecurityException("not enough data written");
        }
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        System.arraycopy(bArrA, 0, bArr4, bArr3.length, bArrA.length);
        return bArr4;
    }

    public final byte[] c(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length > 12 || bArr.length < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
        byte[] bArr4 = new byte[32];
        zzsc zzscVar = this.f10554c;
        System.arraycopy(zzscVar.a(bArr2, 16), 0, bArr4, 0, 16);
        System.arraycopy(zzscVar.a(bArr3, 16), 0, bArr4, 16, 16);
        return bArr4;
    }
}
