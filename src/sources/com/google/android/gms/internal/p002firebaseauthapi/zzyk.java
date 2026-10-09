package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyk implements zzbm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzhy f11022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11023b;

    public zzyk(byte[] bArr, byte[] bArr2) {
        this.f11022a = new zzhy(bArr);
        this.f11023b = bArr2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f11023b;
        if (bArr3.length == 0) {
            return c(bArr, bArr2);
        }
        if (zzqj.b(bArr3, bArr)) {
            return c(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] bArrA = zzpz.a(12);
        byteBufferAllocate.put(bArrA);
        this.f11022a.b(byteBufferAllocate, bArrA, bArr, bArr2);
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArr3 = this.f11023b;
        return bArr3.length == 0 ? bArrArray : zzyl.d(bArr3, bArrArray);
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        return this.f11022a.c(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
    }
}
