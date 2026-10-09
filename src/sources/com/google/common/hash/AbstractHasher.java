package com.google.common.hash;

import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractHasher implements Hasher {
    @Override // com.google.common.hash.Hasher
    public Hasher a(byte[] bArr) {
        return d(bArr, bArr.length);
    }

    public Hasher d(byte[] bArr, int i11) {
        Preconditions.m(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            b(bArr[i12]);
        }
        return this;
    }
}
