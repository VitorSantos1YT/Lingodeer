package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzlp implements zzlo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzjn f10696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10697b;

    public zzlp(zzjn zzjnVar) {
        this.f10696a = zzjnVar;
        this.f10697b = zzjnVar.f10582a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlo
    public final byte[] a(int i11, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrC;
        byte[] bArrA;
        if (bArr2.length < i11) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, i11, bArr2.length);
        zzjg.zza zzaVar = new zzjg.zza(0);
        zzaVar.f10575a = this.f10696a;
        zzcw zzcwVar = zzcw.f10287a;
        zzaVar.f10576b = zzzw.b(bArr, zzcwVar);
        zzjg zzjgVarA = zzaVar.a();
        zzyj zzyjVar = new zzyj(zzjgVarA.f10572b.c(zzcwVar), zzjgVarA.f10573c);
        byte[][] bArr3 = {zzlk.f10692a};
        int length = bArrCopyOfRange.length;
        byte[] bArr4 = zzyjVar.f11021c;
        if (length < bArr4.length + 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        if (!zzqj.b(bArr4, bArrCopyOfRange)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) zzyj.f11018g.get();
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrCopyOfRange, bArr4.length, bArr4.length + 16);
        byte[] bArr5 = (byte[]) bArrCopyOfRange2.clone();
        bArr5[8] = (byte) (bArr5[8] & 127);
        bArr5[12] = (byte) (bArr5[12] & 127);
        cipher.init(2, new SecretKeySpec(zzyjVar.f11020b, "AES"), new IvParameterSpec(bArr5));
        int length2 = bArr4.length + 16;
        int length3 = bArrCopyOfRange.length - length2;
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange, length2, length3);
        if (length3 == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        byte[][] bArr6 = (byte[][]) Arrays.copyOf(bArr3, 2);
        bArr6[1] = bArrDoFinal;
        int length4 = bArr6.length;
        zzsc zzscVar = zzyjVar.f11019a;
        if (length4 == 0) {
            bArrA = zzscVar.a(zzyj.f11017f, 16);
        } else {
            byte[] bArrA2 = zzscVar.a(zzyj.f11016e, 16);
            for (int i12 = 0; i12 < bArr6.length - 1; i12++) {
                byte[] bArr7 = bArr6[i12];
                if (bArr7 == null) {
                    bArr7 = new byte[0];
                }
                bArrA2 = zzyl.c(zzru.a(bArrA2), zzscVar.a(bArr7, 16));
            }
            byte[] bArr8 = bArr6[bArr6.length - 1];
            if (bArr8.length >= 16) {
                if (bArr8.length < bArrA2.length) {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
                int length5 = bArr8.length - bArrA2.length;
                bArrC = Arrays.copyOf(bArr8, bArr8.length);
                for (int i13 = 0; i13 < bArrA2.length; i13++) {
                    int i14 = length5 + i13;
                    bArrC[i14] = (byte) (bArrC[i14] ^ bArrA2[i13]);
                }
            } else {
                if (bArr8.length >= 16) {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr8, 16);
                bArrCopyOf[bArr8.length] = -128;
                bArrC = zzyl.c(bArrCopyOf, zzru.a(bArrA2));
            }
            bArrA = zzscVar.a(bArrC, 16);
        }
        if (MessageDigest.isEqual(bArrCopyOfRange2, bArrA)) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlo
    public final int zza() {
        return this.f10697b;
    }
}
