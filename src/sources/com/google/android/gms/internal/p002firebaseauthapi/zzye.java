package com.google.android.gms.internal.p002firebaseauthapi;

import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzye implements zzbm {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzjb.zza f11006e = zzjb.zza.zza;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f11007f = new zzyh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f11008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzsc f11009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f11010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11011d;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f11008a;
        int length2 = length - bArr3.length;
        int i11 = this.f11011d;
        int i12 = (length2 - i11) - 16;
        if (i12 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzqj.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrC = c(0, bArr, bArr3.length, i11);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrC2 = c(1, bArr2, 0, bArr2.length);
        byte[] bArrC3 = c(2, bArr, bArr3.length + i11, i12);
        int length3 = bArr.length - 16;
        byte b3 = 0;
        for (int i13 = 0; i13 < 16; i13++) {
            b3 = (byte) (b3 | (((bArr[length3 + i13] ^ bArrC2[i13]) ^ bArrC[i13]) ^ bArrC3[i13]));
        }
        if (b3 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) f11007f.get();
        cipher.init(1, this.f11010c, new IvParameterSpec(bArrC));
        return cipher.doFinal(bArr, bArr3.length + i11, i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f11008a;
        int length2 = Integer.MAX_VALUE - bArr3.length;
        int i11 = this.f11011d;
        if (length > (length2 - i11) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i11 + bArr.length + 16);
        byte[] bArrA = zzpz.a(i11);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr3.length, i11);
        byte[] bArrC = c(0, bArrA, 0, bArrA.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrC2 = c(1, bArr2, 0, bArr2.length);
        Cipher cipher = (Cipher) f11007f.get();
        cipher.init(1, this.f11010c, new IvParameterSpec(bArrC));
        cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + i11);
        byte[] bArrC3 = c(2, bArrCopyOf, bArr3.length + i11, bArr.length);
        int length3 = bArr3.length + bArr.length + i11;
        for (int i12 = 0; i12 < 16; i12++) {
            bArrCopyOf[length3 + i12] = (byte) ((bArrC2[i12] ^ bArrC[i12]) ^ bArrC3[i12]);
        }
        return bArrCopyOf;
    }

    public final byte[] c(int i11, byte[] bArr, int i12, int i13) {
        byte[] bArr2 = new byte[i13 + 16];
        bArr2[15] = (byte) i11;
        System.arraycopy(bArr, i12, bArr2, 16, i13);
        return this.f11009b.a(bArr2, 16);
    }

    public zzye(int i11, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (f11006e.a()) {
            if (i11 != 12 && i11 != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.f11011d = i11;
            zzzq.b(bArr.length);
            this.f11010c = new SecretKeySpec(bArr, "AES");
            this.f11009b = zzzl.b(zzsa.d(zzrz.b(bArr.length), zzzw.b(bArr, zzcw.f10287a)));
            this.f11008a = bArr2;
            return;
        }
        throw new GeneralSecurityException(OCBJEWZHh.blTkJGFl);
    }
}
