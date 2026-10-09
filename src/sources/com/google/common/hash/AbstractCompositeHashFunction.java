package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@ElementTypesAreNonnullByDefault
abstract class AbstractCompositeHashFunction extends AbstractHashFunction {

    /* JADX INFO: renamed from: com.google.common.hash.AbstractCompositeHashFunction$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements Hasher {
        @Override // com.google.common.hash.Hasher
        public final Hasher a(byte[] bArr) {
            throw null;
        }

        @Override // com.google.common.hash.Hasher
        public final Hasher b(byte b3) {
            throw null;
        }

        @Override // com.google.common.hash.Hasher
        public final HashCode c() {
            throw null;
        }
    }

    @Override // com.google.common.hash.HashFunction
    public final Hasher a() {
        throw null;
    }
}
