package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import hh.p0;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class Murmur3_128HashFunction extends AbstractHashFunction implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashFunction f17381b = new Murmur3_128HashFunction(0);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17382a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Murmur3_128Hasher extends AbstractStreamingHasher {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f17383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f17384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17385f;

        @Override // com.google.common.hash.AbstractStreamingHasher
        public final HashCode e() {
            long j11 = this.f17383d;
            long j12 = this.f17385f;
            long j13 = j11 ^ j12;
            long j14 = j12 ^ this.f17384e;
            long j15 = j13 + j14;
            long j16 = j14 + j15;
            long j17 = (j15 ^ (j15 >>> 33)) * (-49064778989728563L);
            long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
            long j19 = (j16 ^ (j16 >>> 33)) * (-49064778989728563L);
            long j21 = (j19 ^ (j19 >>> 33)) * (-4265267296055464877L);
            long j22 = j21 ^ (j21 >>> 33);
            long j23 = (j18 ^ (j18 >>> 33)) + j22;
            this.f17383d = j23;
            this.f17384e = j22 + j23;
            byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f17383d).putLong(this.f17384e).array();
            char[] cArr = HashCode.f17363a;
            return new HashCode.BytesHashCode(bArrArray);
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public final void h(ByteBuffer byteBuffer) {
            long j11 = byteBuffer.getLong();
            long j12 = byteBuffer.getLong();
            long jRotateLeft = (Long.rotateLeft(j11 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f17383d;
            this.f17383d = jRotateLeft;
            long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
            long j13 = this.f17384e;
            this.f17383d = ((jRotateLeft2 + j13) * 5) + 1390208809;
            long jRotateLeft3 = (Long.rotateLeft(j12 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j13;
            this.f17384e = jRotateLeft3;
            this.f17384e = ((Long.rotateLeft(jRotateLeft3, 31) + this.f17383d) * 5) + 944331445;
            this.f17385f += 16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.common.hash.AbstractStreamingHasher
        public final void i(ByteBuffer byteBuffer) {
            long j11;
            long j12;
            long j13;
            long j14;
            long j15;
            long j16;
            long j17;
            this.f17385f = byteBuffer.remaining() + this.f17385f;
            long j18 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    j11 = 0;
                    j17 = j11 ^ ((long) (byteBuffer.get(0) & 255));
                    this.f17383d = (Long.rotateLeft(j17 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f17383d;
                    this.f17384e ^= Long.rotateLeft(j18 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 2:
                    j12 = 0;
                    j11 = j12 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j17 = j11 ^ ((long) (byteBuffer.get(0) & 255));
                    this.f17383d = (Long.rotateLeft(j17 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f17383d;
                    this.f17384e ^= Long.rotateLeft(j18 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 3:
                    j13 = 0;
                    j12 = (((long) (byteBuffer.get(2) & 255)) << 16) ^ j13;
                    j11 = j12 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j17 = j11 ^ ((long) (byteBuffer.get(0) & 255));
                    this.f17383d = (Long.rotateLeft(j17 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f17383d;
                    this.f17384e ^= Long.rotateLeft(j18 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 4:
                    j14 = 0;
                    j13 = j14 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                    j12 = (((long) (byteBuffer.get(2) & 255)) << 16) ^ j13;
                    j11 = j12 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j17 = j11 ^ ((long) (byteBuffer.get(0) & 255));
                    this.f17383d = (Long.rotateLeft(j17 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f17383d;
                    this.f17384e ^= Long.rotateLeft(j18 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 5:
                    j15 = 0;
                    j14 = j15 ^ (((long) (byteBuffer.get(4) & 255)) << 32);
                    j13 = j14 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                    j12 = (((long) (byteBuffer.get(2) & 255)) << 16) ^ j13;
                    j11 = j12 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j17 = j11 ^ ((long) (byteBuffer.get(0) & 255));
                    this.f17383d = (Long.rotateLeft(j17 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f17383d;
                    this.f17384e ^= Long.rotateLeft(j18 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 6:
                    j16 = 0;
                    j15 = (((long) (byteBuffer.get(5) & 255)) << 40) ^ j16;
                    j14 = j15 ^ (((long) (byteBuffer.get(4) & 255)) << 32);
                    j13 = j14 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                    j12 = (((long) (byteBuffer.get(2) & 255)) << 16) ^ j13;
                    j11 = j12 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j17 = j11 ^ ((long) (byteBuffer.get(0) & 255));
                    this.f17383d = (Long.rotateLeft(j17 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f17383d;
                    this.f17384e ^= Long.rotateLeft(j18 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 7:
                    j16 = ((long) (byteBuffer.get(6) & 255)) << 48;
                    j15 = (((long) (byteBuffer.get(5) & 255)) << 40) ^ j16;
                    j14 = j15 ^ (((long) (byteBuffer.get(4) & 255)) << 32);
                    j13 = j14 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                    j12 = (((long) (byteBuffer.get(2) & 255)) << 16) ^ j13;
                    j11 = j12 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j17 = j11 ^ ((long) (byteBuffer.get(0) & 255));
                    this.f17383d = (Long.rotateLeft(j17 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f17383d;
                    this.f17384e ^= Long.rotateLeft(j18 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 8:
                    j17 = byteBuffer.getLong();
                    this.f17383d = (Long.rotateLeft(j17 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f17383d;
                    this.f17384e ^= Long.rotateLeft(j18 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 9:
                    j18 ^= (long) (byteBuffer.get(8) & 255);
                    j17 = byteBuffer.getLong();
                    this.f17383d = (Long.rotateLeft(j17 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f17383d;
                    this.f17384e ^= Long.rotateLeft(j18 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 10:
                    j18 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                    j18 ^= (long) (byteBuffer.get(8) & 255);
                    j17 = byteBuffer.getLong();
                    this.f17383d = (Long.rotateLeft(j17 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f17383d;
                    this.f17384e ^= Long.rotateLeft(j18 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 11:
                    j18 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                    j18 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                    j18 ^= (long) (byteBuffer.get(8) & 255);
                    j17 = byteBuffer.getLong();
                    this.f17383d = (Long.rotateLeft(j17 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f17383d;
                    this.f17384e ^= Long.rotateLeft(j18 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 12:
                    j18 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                    j18 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                    j18 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                    j18 ^= (long) (byteBuffer.get(8) & 255);
                    j17 = byteBuffer.getLong();
                    this.f17383d = (Long.rotateLeft(j17 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f17383d;
                    this.f17384e ^= Long.rotateLeft(j18 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 13:
                    j18 ^= ((long) (byteBuffer.get(12) & 255)) << 32;
                    j18 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                    j18 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                    j18 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                    j18 ^= (long) (byteBuffer.get(8) & 255);
                    j17 = byteBuffer.getLong();
                    this.f17383d = (Long.rotateLeft(j17 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f17383d;
                    this.f17384e ^= Long.rotateLeft(j18 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 14:
                    j18 ^= ((long) (byteBuffer.get(13) & 255)) << 40;
                    j18 ^= ((long) (byteBuffer.get(12) & 255)) << 32;
                    j18 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                    j18 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                    j18 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                    j18 ^= (long) (byteBuffer.get(8) & 255);
                    j17 = byteBuffer.getLong();
                    this.f17383d = (Long.rotateLeft(j17 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f17383d;
                    this.f17384e ^= Long.rotateLeft(j18 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 15:
                    j18 = ((long) (byteBuffer.get(14) & 255)) << 48;
                    j18 ^= ((long) (byteBuffer.get(13) & 255)) << 40;
                    j18 ^= ((long) (byteBuffer.get(12) & 255)) << 32;
                    j18 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                    j18 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                    j18 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                    j18 ^= (long) (byteBuffer.get(8) & 255);
                    j17 = byteBuffer.getLong();
                    this.f17383d = (Long.rotateLeft(j17 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f17383d;
                    this.f17384e ^= Long.rotateLeft(j18 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }
    }

    static {
        new Murmur3_128HashFunction(Hashing.f17367a);
    }

    public Murmur3_128HashFunction(int i11) {
        this.f17382a = i11;
    }

    @Override // com.google.common.hash.HashFunction
    public final Hasher a() {
        Murmur3_128Hasher murmur3_128Hasher = new Murmur3_128Hasher(16);
        long j11 = this.f17382a;
        murmur3_128Hasher.f17383d = j11;
        murmur3_128Hasher.f17384e = j11;
        murmur3_128Hasher.f17385f = 0;
        return murmur3_128Hasher;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Murmur3_128HashFunction) && this.f17382a == ((Murmur3_128HashFunction) obj).f17382a;
    }

    public final int hashCode() {
        return Murmur3_128HashFunction.class.hashCode() ^ this.f17382a;
    }

    public final String toString() {
        return p0.i(this.f17382a, ")", new StringBuilder("Hashing.murmur3_128("));
    }
}
