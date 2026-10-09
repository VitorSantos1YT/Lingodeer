package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class SipHashFunction extends AbstractHashFunction implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17394a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17395b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17396c = 506097522914230528L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17397d = 1084818905618843912L;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SipHasher extends AbstractStreamingHasher {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17398d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f17399e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f17400f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f17401g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f17402h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f17403i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f17404j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f17405k;

        public SipHasher(int i11, int i12, long j11, long j12) {
            super(8);
            this.f17404j = 0L;
            this.f17405k = 0L;
            this.f17398d = i11;
            this.f17399e = i12;
            this.f17400f = 8317987319222330741L ^ j11;
            this.f17401g = 7237128888997146477L ^ j12;
            this.f17402h = 7816392313619706465L ^ j11;
            this.f17403i = 8387220255154660723L ^ j12;
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public final HashCode e() {
            long j11 = this.f17405k ^ (this.f17404j << 56);
            this.f17405k = j11;
            this.f17403i ^= j11;
            j(this.f17398d);
            this.f17400f = j11 ^ this.f17400f;
            this.f17402h ^= 255;
            j(this.f17399e);
            long j12 = ((this.f17400f ^ this.f17401g) ^ this.f17402h) ^ this.f17403i;
            char[] cArr = HashCode.f17363a;
            return new HashCode.LongHashCode(j12);
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public final void h(ByteBuffer byteBuffer) {
            this.f17404j += 8;
            long j11 = byteBuffer.getLong();
            this.f17403i ^= j11;
            j(this.f17398d);
            this.f17400f = j11 ^ this.f17400f;
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public final void i(ByteBuffer byteBuffer) {
            this.f17404j += (long) byteBuffer.remaining();
            int i11 = 0;
            while (byteBuffer.hasRemaining()) {
                this.f17405k ^= (((long) byteBuffer.get()) & 255) << i11;
                i11 += 8;
            }
        }

        public final void j(int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                long j11 = this.f17400f;
                long j12 = this.f17401g;
                this.f17400f = j11 + j12;
                this.f17402h += this.f17403i;
                this.f17401g = Long.rotateLeft(j12, 13);
                long jRotateLeft = Long.rotateLeft(this.f17403i, 16);
                long j13 = this.f17401g;
                long j14 = this.f17400f;
                this.f17401g = j13 ^ j14;
                this.f17403i = jRotateLeft ^ this.f17402h;
                long jRotateLeft2 = Long.rotateLeft(j14, 32);
                long j15 = this.f17402h;
                long j16 = this.f17401g;
                this.f17402h = j15 + j16;
                this.f17400f = jRotateLeft2 + this.f17403i;
                this.f17401g = Long.rotateLeft(j16, 17);
                long jRotateLeft3 = Long.rotateLeft(this.f17403i, 21);
                long j17 = this.f17401g;
                long j18 = this.f17402h;
                this.f17401g = j17 ^ j18;
                this.f17403i = jRotateLeft3 ^ this.f17400f;
                this.f17402h = Long.rotateLeft(j18, 32);
            }
        }
    }

    static {
        new SipHashFunction();
    }

    @Override // com.google.common.hash.HashFunction
    public final Hasher a() {
        return new SipHasher(this.f17394a, this.f17395b, this.f17396c, this.f17397d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SipHashFunction)) {
            return false;
        }
        SipHashFunction sipHashFunction = (SipHashFunction) obj;
        return this.f17394a == sipHashFunction.f17394a && this.f17395b == sipHashFunction.f17395b && this.f17396c == sipHashFunction.f17396c && this.f17397d == sipHashFunction.f17397d;
    }

    public final int hashCode() {
        return (int) ((((long) ((SipHashFunction.class.hashCode() ^ this.f17394a) ^ this.f17395b)) ^ this.f17396c) ^ this.f17397d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Hashing.sipHash");
        sb2.append(this.f17394a);
        sb2.append(BuildConfig.VERSION_NAME);
        sb2.append(this.f17395b);
        sb2.append("(");
        sb2.append(this.f17396c);
        sb2.append(", ");
        return e.i(this.f17397d, ")", sb2);
    }
}
