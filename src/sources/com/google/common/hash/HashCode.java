package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class HashCode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f17363a = "0123456789abcdef".toCharArray();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class BytesHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f17364b;

        public BytesHashCode(byte[] bArr) {
            bArr.getClass();
            this.f17364b = bArr;
        }

        @Override // com.google.common.hash.HashCode
        public final byte[] a() {
            return (byte[]) this.f17364b.clone();
        }

        @Override // com.google.common.hash.HashCode
        public final int b() {
            byte[] bArr = this.f17364b;
            Preconditions.n(bArr.length, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length >= 4);
            return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        }

        @Override // com.google.common.hash.HashCode
        public final long c() {
            byte[] bArr = this.f17364b;
            Preconditions.n(bArr.length, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length >= 8);
            long j11 = bArr[0] & 255;
            for (int i11 = 1; i11 < Math.min(bArr.length, 8); i11++) {
                j11 |= (((long) bArr[i11]) & 255) << (i11 * 8);
            }
            return j11;
        }

        @Override // com.google.common.hash.HashCode
        public final int d() {
            return this.f17364b.length * 8;
        }

        @Override // com.google.common.hash.HashCode
        public final boolean e(HashCode hashCode) {
            byte[] bArr = this.f17364b;
            if (bArr.length != hashCode.f().length) {
                return false;
            }
            boolean z11 = true;
            for (int i11 = 0; i11 < bArr.length; i11++) {
                z11 &= bArr[i11] == hashCode.f()[i11];
            }
            return z11;
        }

        @Override // com.google.common.hash.HashCode
        public final byte[] f() {
            return this.f17364b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class IntHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17365b;

        public IntHashCode(int i11) {
            this.f17365b = i11;
        }

        @Override // com.google.common.hash.HashCode
        public final byte[] a() {
            int i11 = this.f17365b;
            return new byte[]{(byte) i11, (byte) (i11 >> 8), (byte) (i11 >> 16), (byte) (i11 >> 24)};
        }

        @Override // com.google.common.hash.HashCode
        public final int b() {
            return this.f17365b;
        }

        @Override // com.google.common.hash.HashCode
        public final long c() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override // com.google.common.hash.HashCode
        public final int d() {
            return 32;
        }

        @Override // com.google.common.hash.HashCode
        public final boolean e(HashCode hashCode) {
            return this.f17365b == hashCode.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LongHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17366b;

        public LongHashCode(long j11) {
            this.f17366b = j11;
        }

        @Override // com.google.common.hash.HashCode
        public final byte[] a() {
            long j11 = this.f17366b;
            return new byte[]{(byte) j11, (byte) (j11 >> 8), (byte) (j11 >> 16), (byte) (j11 >> 24), (byte) (j11 >> 32), (byte) (j11 >> 40), (byte) (j11 >> 48), (byte) (j11 >> 56)};
        }

        @Override // com.google.common.hash.HashCode
        public final int b() {
            return (int) this.f17366b;
        }

        @Override // com.google.common.hash.HashCode
        public final long c() {
            return this.f17366b;
        }

        @Override // com.google.common.hash.HashCode
        public final int d() {
            return 64;
        }

        @Override // com.google.common.hash.HashCode
        public final boolean e(HashCode hashCode) {
            return this.f17366b == hashCode.c();
        }
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public abstract boolean e(HashCode hashCode);

    public final boolean equals(Object obj) {
        if (!(obj instanceof HashCode)) {
            return false;
        }
        HashCode hashCode = (HashCode) obj;
        return d() == hashCode.d() && e(hashCode);
    }

    public byte[] f() {
        return a();
    }

    public final int hashCode() {
        if (d() >= 32) {
            return b();
        }
        byte[] bArrF = f();
        int i11 = bArrF[0] & 255;
        for (int i12 = 1; i12 < bArrF.length; i12++) {
            i11 |= (bArrF[i12] & 255) << (i12 * 8);
        }
        return i11;
    }

    public final String toString() {
        byte[] bArrF = f();
        StringBuilder sb2 = new StringBuilder(bArrF.length * 2);
        for (byte b3 : bArrF) {
            char[] cArr = f17363a;
            sb2.append(cArr[(b3 >> 4) & 15]);
            sb2.append(cArr[b3 & 15]);
        }
        return sb2.toString();
    }
}
