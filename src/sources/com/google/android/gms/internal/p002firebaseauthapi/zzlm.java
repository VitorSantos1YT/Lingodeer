package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzlm implements zzlo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10693a;

    public zzlm(zzed zzedVar) throws GeneralSecurityException {
        if (zzedVar.f10368b != 12) {
            throw new GeneralSecurityException("invalid IV size");
        }
        if (zzedVar.f10369c != 16) {
            throw new GeneralSecurityException("invalid tag size");
        }
        if (zzedVar.f10370d != zzed.zzb.f10377d) {
            throw new GeneralSecurityException("invalid variant");
        }
        this.f10693a = zzedVar.f10367a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlo
    public final byte[] a(int i11, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2.length < i11) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (bArr.length != this.f10693a) {
            throw new GeneralSecurityException("invalid key size");
        }
        ThreadLocal threadLocal = zzgv.f10499a;
        zzzq.b(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        int i12 = i11 + 12;
        if (bArr2.length < i11 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = zzgv.a(bArr2, i11, 12);
        Cipher cipher = (Cipher) zzgv.f10499a.get();
        cipher.init(2, secretKeySpec, algorithmParameterSpecA);
        return cipher.doFinal(bArr2, i12, (bArr2.length - i11) - 12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlo
    public final int zza() {
        return this.f10693a;
    }
}
