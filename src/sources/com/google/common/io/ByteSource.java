package com.google.common.io;

import com.google.common.base.Ascii;
import i0.pKy.shrCcjmOhAmRC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ByteSource {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AsCharSource extends CharSource {
        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ByteArrayByteSource extends ByteSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f17438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17439b;

        public ByteArrayByteSource(byte[] bArr) {
            int length = bArr.length;
            this.f17438a = bArr;
            this.f17439b = length;
        }

        public String toString() {
            return "ByteSource.wrap(" + Ascii.e(BaseEncoding.f17418c.c(this.f17438a, this.f17439b)) + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ConcatenatedByteSource extends ByteSource {
        public final String toString() {
            return shrCcjmOhAmRC.gZIYkdhvftithFu;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class EmptyByteSource extends ByteArrayByteSource {
        static {
            new EmptyByteSource();
        }

        public EmptyByteSource() {
            super(new byte[0]);
        }

        @Override // com.google.common.io.ByteSource.ByteArrayByteSource
        public final String toString() {
            return "ByteSource.empty()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class SlicedByteSource extends ByteSource {
        public final String toString() {
            throw null;
        }
    }
}
