package com.google.android.gms.internal.p002firebaseauthapi;

import hh.p0;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhd implements zzbm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f10506d = zzzj.b("7a806c");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f10507e = zzzj.b("46bb91c3c5");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f10508f = zzzj.b("36864200e0eaf5284d884a0e77d31646");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f10509g = zzzj.b("bae8e37fc83441b16034566b");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f10510h = zzzj.b("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zziv f10511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecretKeySpec f10512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f10513c;

    public zzhd(byte[] bArr, byte[] bArr2, zziv zzivVar) throws InvalidAlgorithmParameterException {
        this.f10513c = bArr2;
        zzzq.b(bArr.length);
        this.f10512b = new SecretKeySpec(bArr, "AES");
        this.f10511a = zzivVar;
    }

    public static boolean c(Cipher cipher) {
        try {
            byte[] bArr = f10509g;
            cipher.init(2, new SecretKeySpec(f10508f, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f10507e);
            byte[] bArr2 = f10510h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f10506d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f10513c;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzqj.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipherA = this.f10511a.a();
        cipherA.init(2, this.f10512b, new GCMParameterSpec(128, bArr, bArr3.length, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipherA.updateAAD(bArr2);
        }
        return cipherA.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipherA = this.f10511a.a();
        int length = bArr.length;
        byte[] bArr3 = this.f10513c;
        if (length > 2147483619 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + bArr.length + 16);
        byte[] bArrA = zzpz.a(12);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr3.length, 12);
        cipherA.init(1, this.f10512b, new GCMParameterSpec(128, bArrA, 0, bArrA.length));
        if (bArr2 != null && bArr2.length != 0) {
            cipherA.updateAAD(bArr2);
        }
        int iDoFinal = cipherA.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + 12);
        if (iDoFinal == bArr.length + 16) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException(p0.h(iDoFinal - bArr.length, "encryption failed; AES-GCM-SIV tag must be 16 bytes, but got only ", " bytes"));
    }
}
