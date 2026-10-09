package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@ElementTypesAreNonnullByDefault
abstract class AbstractNonStreamingHashFunction extends AbstractHashFunction {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class BufferingHasher extends AbstractHasher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExposedByteArrayOutputStream f17339a = new ExposedByteArrayOutputStream(32);

        public BufferingHasher() {
        }

        @Override // com.google.common.hash.Hasher
        public final Hasher b(byte b3) throws IOException {
            this.f17339a.write(b3);
            return this;
        }

        @Override // com.google.common.hash.Hasher
        public final HashCode c() {
            ExposedByteArrayOutputStream exposedByteArrayOutputStream = this.f17339a;
            return AbstractNonStreamingHashFunction.this.b(exposedByteArrayOutputStream.a(), exposedByteArrayOutputStream.b());
        }

        @Override // com.google.common.hash.AbstractHasher
        public final Hasher d(byte[] bArr, int i11) throws IOException {
            this.f17339a.write(bArr, 0, i11);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public final byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public final int b() {
            return ((ByteArrayOutputStream) this).count;
        }
    }

    @Override // com.google.common.hash.HashFunction
    public final Hasher a() {
        return new BufferingHasher();
    }

    public abstract HashCode b(byte[] bArr, int i11);
}
