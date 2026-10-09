package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzhv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f10535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10536b;

    public zzhv(byte[] bArr, int i11) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f10535a = zzhu.d(bArr);
        this.f10536b = i11;
    }

    public abstract int a();

    public final ByteBuffer b(byte[] bArr, int i11) {
        int[] iArrD = d(zzhu.d(bArr), i11);
        int[] iArr = (int[]) iArrD.clone();
        zzhu.b(iArr);
        for (int i12 = 0; i12 < iArrD.length; i12++) {
            iArrD[i12] = iArrD[i12] + iArr[i12];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrD, 0, 16);
        return byteBufferOrder;
    }

    public final void c(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != a()) {
            throw new GeneralSecurityException(p.j(a(), "The nonce length (in bytes) must be "));
        }
        int iRemaining = byteBuffer2.remaining();
        int i11 = iRemaining / 64;
        int i12 = i11 + 1;
        for (int i13 = 0; i13 < i12; i13++) {
            ByteBuffer byteBufferB = b(bArr, this.f10536b + i13);
            if (i13 == i11) {
                zzyl.a(byteBuffer, byteBuffer2, byteBufferB, iRemaining % 64);
            } else {
                zzyl.a(byteBuffer, byteBuffer2, byteBufferB, 64);
            }
        }
    }

    public abstract int[] d(int[] iArr, int i11);
}
