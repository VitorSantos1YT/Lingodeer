package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzys implements zzbm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzyc f11034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzo f11035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f11037d;

    public zzys(zzyc zzycVar, zzzo zzzoVar, int i11, byte[] bArr) {
        this.f11034a = zzycVar;
        this.f11035b = zzzoVar;
        this.f11036c = i11;
        this.f11037d = bArr;
    }

    public static zzys c(zzdh zzdhVar) {
        zzzw zzzwVar = zzdhVar.f10298b;
        zzcw zzcwVar = zzcw.f10287a;
        byte[] bArrC = zzzwVar.c(zzcwVar);
        zzdo zzdoVar = zzdhVar.f10297a;
        zzyc zzycVar = new zzyc(bArrC, zzdoVar.f10313c);
        zzzm zzzmVar = new zzzm("HMAC".concat(String.valueOf(zzdoVar.f10316f)), new SecretKeySpec(zzdhVar.f10299c.c(zzcwVar), "HMAC"));
        int i11 = zzdoVar.f10314d;
        return new zzys(zzycVar, new zzzo(zzzmVar, i11), i11, zzdhVar.f10300d.b());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f11037d;
        int length2 = bArr3.length;
        int i11 = this.f11036c;
        if (length < length2 + i11) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzqj.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr3.length, bArr.length - i11);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i11, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (!MessageDigest.isEqual(this.f11035b.a(zzyl.d(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))), bArrCopyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        int length3 = bArrCopyOfRange.length;
        zzyc zzycVar = this.f11034a;
        int i12 = zzycVar.f11004b;
        if (length3 < i12) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr4 = new byte[i12];
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 0, i12);
        int length4 = bArrCopyOfRange.length;
        int i13 = zzycVar.f11004b;
        byte[] bArr5 = new byte[length4 - i13];
        zzycVar.a(bArrCopyOfRange, i13, bArrCopyOfRange.length - i13, bArr5, 0, bArr4, false);
        return bArr5;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        zzyc zzycVar = this.f11034a;
        int i11 = zzycVar.f11004b;
        int i12 = Integer.MAX_VALUE - i11;
        if (length > i12) {
            throw new GeneralSecurityException(p.j(i12, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i11];
        byte[] bArrA = zzpz.a(i11);
        System.arraycopy(bArrA, 0, bArr3, 0, i11);
        zzycVar.a(bArr, 0, bArr.length, bArr3, zzycVar.f11004b, bArrA, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return zzyl.d(this.f11037d, bArr3, this.f11035b.a(zzyl.d(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }
}
