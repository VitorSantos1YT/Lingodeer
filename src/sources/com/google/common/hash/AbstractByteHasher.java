package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractByteHasher extends AbstractHasher {
    public AbstractByteHasher() {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher
    public final Hasher a(byte[] bArr) {
        bArr.getClass();
        f(bArr);
        return this;
    }

    @Override // com.google.common.hash.Hasher
    public final Hasher b(byte b3) {
        e(b3);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher
    public final Hasher d(byte[] bArr, int i11) {
        Preconditions.m(0, i11, bArr.length);
        g(bArr, i11);
        return this;
    }

    public abstract void e(byte b3);

    public void f(byte[] bArr) {
        g(bArr, bArr.length);
    }

    public void g(byte[] bArr, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            e(bArr[i12]);
        }
    }
}
