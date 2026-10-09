package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzll implements zzlz {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlz
    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        zzjb.zza zzaVar = zzia.f10540c;
        try {
            zzhl.c();
            zzia zziaVar = new zzia(bArr, zzhl.c().getProvider());
            if (bArr3 == null) {
                throw new NullPointerException("ciphertext is null");
            }
            if (bArr2.length != 12) {
                throw new GeneralSecurityException("nonce length must be 12 bytes.");
            }
            if (bArr3.length < i11 + 16) {
                throw new GeneralSecurityException("ciphertext too short");
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", zziaVar.f10542b);
            cipher.init(2, zziaVar.f10541a, ivParameterSpec);
            if (bArr4.length != 0) {
                cipher.updateAAD(bArr4);
            }
            return cipher.doFinal(bArr3, i11, bArr3.length - i11);
        } catch (GeneralSecurityException unused) {
            return new zzhy(bArr).c(ByteBuffer.wrap(Arrays.copyOfRange(bArr3, i11, bArr3.length)), bArr2, bArr4);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlz
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlz
    public final byte[] zzc() {
        return zzml.f10739k;
    }
}
