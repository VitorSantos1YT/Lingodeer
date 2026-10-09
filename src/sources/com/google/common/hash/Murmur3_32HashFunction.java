package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.Immutable;
import hh.p0;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class Murmur3_32HashFunction extends AbstractHashFunction implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17386c = 0;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17388b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Murmur3_32Hasher extends AbstractHasher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f17390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17392d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f17393e;

        @Override // com.google.common.hash.Hasher
        public final Hasher b(byte b3) {
            e(1, b3 & 255);
            return this;
        }

        @Override // com.google.common.hash.Hasher
        public final HashCode c() {
            Preconditions.r(!this.f17393e);
            this.f17393e = true;
            int i11 = this.f17389a;
            int i12 = (int) this.f17390b;
            int i13 = Murmur3_32HashFunction.f17386c;
            int iRotateLeft = i11 ^ (Integer.rotateLeft(i12 * (-862048943), 15) * 461845907);
            this.f17389a = iRotateLeft;
            int i14 = iRotateLeft ^ this.f17392d;
            int i15 = (i14 ^ (i14 >>> 16)) * (-2048144789);
            int i16 = (i15 ^ (i15 >>> 13)) * (-1028477387);
            int i17 = i16 ^ (i16 >>> 16);
            char[] cArr = HashCode.f17363a;
            return new HashCode.IntHashCode(i17);
        }

        @Override // com.google.common.hash.AbstractHasher
        public final Hasher d(byte[] bArr, int i11) {
            int i12 = 0;
            Preconditions.m(0, i11, bArr.length);
            while (true) {
                int i13 = i12 + 4;
                if (i13 > i11) {
                    break;
                }
                int i14 = Murmur3_32HashFunction.f17386c;
                e(4, Ints.d(bArr[i12 + 3], bArr[i12 + 2], bArr[i12 + 1], bArr[i12]));
                i12 = i13;
            }
            while (i12 < i11) {
                b(bArr[i12]);
                i12++;
            }
            return this;
        }

        public final void e(int i11, long j11) {
            long j12 = this.f17390b;
            int i12 = this.f17391c;
            long j13 = ((j11 & 4294967295L) << i12) | j12;
            this.f17390b = j13;
            int i13 = (i11 * 8) + i12;
            this.f17391c = i13;
            this.f17392d += i11;
            if (i13 >= 32) {
                int i14 = this.f17389a;
                int i15 = Murmur3_32HashFunction.f17386c;
                this.f17389a = (Integer.rotateLeft((Integer.rotateLeft(((int) j13) * (-862048943), 15) * 461845907) ^ i14, 13) * 5) - 430675100;
                this.f17390b >>>= 32;
                this.f17391c -= 32;
            }
        }
    }

    static {
        new Murmur3_32HashFunction(0, false);
        new Murmur3_32HashFunction(0, true);
        new Murmur3_32HashFunction(Hashing.f17367a, true);
    }

    public Murmur3_32HashFunction(int i11, boolean z11) {
        this.f17387a = i11;
        this.f17388b = z11;
    }

    @Override // com.google.common.hash.HashFunction
    public final Hasher a() {
        Murmur3_32Hasher murmur3_32Hasher = new Murmur3_32Hasher();
        murmur3_32Hasher.f17389a = this.f17387a;
        murmur3_32Hasher.f17392d = 0;
        murmur3_32Hasher.f17393e = false;
        return murmur3_32Hasher;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Murmur3_32HashFunction)) {
            return false;
        }
        Murmur3_32HashFunction murmur3_32HashFunction = (Murmur3_32HashFunction) obj;
        return this.f17387a == murmur3_32HashFunction.f17387a && this.f17388b == murmur3_32HashFunction.f17388b;
    }

    public final int hashCode() {
        return Murmur3_32HashFunction.class.hashCode() ^ this.f17387a;
    }

    public final String toString() {
        return p0.i(this.f17387a, ")", new StringBuilder("Hashing.murmur3_32("));
    }
}
