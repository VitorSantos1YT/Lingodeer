package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzsf implements zzsc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzjb.zza f10942c = zzjb.zza.zza;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f10943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f10944b;

    public zzsf(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (!f10942c.a()) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.f10943a = new SecretKeySpec(bArr, "AES");
        this.f10944b = provider;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsc
    public final byte[] a(byte[] bArr, int i11) throws NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i11 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Mac mac = Mac.getInstance("AESCMAC", this.f10944b);
        mac.init(this.f10943a);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        return i11 == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i11);
    }
}
