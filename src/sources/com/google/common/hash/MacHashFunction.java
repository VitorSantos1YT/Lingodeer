package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class MacHashFunction extends AbstractHashFunction {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class MacHasher extends AbstractByteHasher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f17370a;

        @Override // com.google.common.hash.Hasher
        public final HashCode c() {
            Preconditions.p("Cannot re-use a Hasher after calling hash() on it", !this.f17370a);
            this.f17370a = true;
            throw null;
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public final void e(byte b3) {
            Preconditions.p("Cannot re-use a Hasher after calling hash() on it", !this.f17370a);
            throw null;
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public final void f(byte[] bArr) {
            Preconditions.p("Cannot re-use a Hasher after calling hash() on it", !this.f17370a);
            throw null;
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public final void g(byte[] bArr, int i11) {
            Preconditions.p("Cannot re-use a Hasher after calling hash() on it", !this.f17370a);
            throw null;
        }
    }

    @Override // com.google.common.hash.HashFunction
    public final Hasher a() {
        throw null;
    }

    public final String toString() {
        return null;
    }
}
