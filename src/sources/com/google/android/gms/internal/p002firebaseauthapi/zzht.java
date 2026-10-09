package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzht {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzjb.zza f10532b = zzjb.zza.zzb;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f10533a;

    public zzht(byte[] bArr) throws GeneralSecurityException {
        if (!f10532b.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        ThreadLocal threadLocal = zzgv.f10499a;
        zzzq.b(bArr.length);
        this.f10533a = new SecretKeySpec(bArr, "AES");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, int i11, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length < i11 + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = zzgv.a(bArr, 0, bArr.length);
        Cipher cipher = (Cipher) zzgv.f10499a.get();
        cipher.init(2, this.f10533a, algorithmParameterSpecA);
        if (bArr3 != null && bArr3.length != 0) {
            cipher.updateAAD(bArr3);
        }
        return cipher.doFinal(bArr2, i11, bArr2.length - i11);
    }
}
