package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyc implements zzzi {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzjb.zza f11001d = zzjb.zza.zzb;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f11002e = new zzyf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f11003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11005c;

    public zzyc(byte[] bArr, int i11) throws GeneralSecurityException {
        if (!f11001d.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzzq.b(bArr.length);
        this.f11003a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f11002e.get()).getBlockSize();
        this.f11005c = blockSize;
        if (i11 < 12 || i11 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f11004b = i11;
    }

    public final void a(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, byte[] bArr3, boolean z11) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f11002e.get();
        byte[] bArr4 = new byte[this.f11005c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f11004b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f11003a;
        if (z11) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i11, i12, bArr2, i13) != i12) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
