package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.zip.Checksum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class ChecksumHashFunction extends AbstractHashFunction implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hashing.ChecksumType f17348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17349b = 32;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17350c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class ChecksumHasher extends AbstractByteHasher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Checksum f17351a;

        public ChecksumHasher(Checksum checksum) {
            checksum.getClass();
            this.f17351a = checksum;
        }

        @Override // com.google.common.hash.Hasher
        public final HashCode c() {
            long value = this.f17351a.getValue();
            if (ChecksumHashFunction.this.f17349b == 32) {
                char[] cArr = HashCode.f17363a;
                return new HashCode.IntHashCode((int) value);
            }
            char[] cArr2 = HashCode.f17363a;
            return new HashCode.LongHashCode(value);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public final void e(byte b3) {
            this.f17351a.update(b3);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public final void g(byte[] bArr, int i11) {
            this.f17351a.update(bArr, 0, i11);
        }
    }

    public ChecksumHashFunction(Hashing.ChecksumType checksumType, String str) {
        this.f17348a = checksumType;
        this.f17350c = str;
    }

    @Override // com.google.common.hash.HashFunction
    public final Hasher a() {
        return new ChecksumHasher((Checksum) this.f17348a.get());
    }

    public final String toString() {
        return this.f17350c;
    }
}
