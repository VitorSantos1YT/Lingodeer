package com.google.common.primitives;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class UnsignedLong extends Number implements Comparable<UnsignedLong>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17528a;

    static {
        new UnsignedLong(0L);
        new UnsignedLong(1L);
        new UnsignedLong(-1L);
    }

    public UnsignedLong(long j11) {
        this.f17528a = j11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(UnsignedLong unsignedLong) {
        UnsignedLong unsignedLong2 = unsignedLong;
        unsignedLong2.getClass();
        return UnsignedLongs.a(this.f17528a, unsignedLong2.f17528a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        long j11 = this.f17528a;
        return j11 >= 0 ? j11 : ((j11 >>> 1) | (j11 & 1)) * 2.0d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof UnsignedLong) && this.f17528a == ((UnsignedLong) obj).f17528a;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        long j11 = this.f17528a;
        return j11 >= 0 ? j11 : ((j11 >>> 1) | (j11 & 1)) * 2.0f;
    }

    public final int hashCode() {
        return Longs.c(this.f17528a);
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.f17528a;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.f17528a;
    }

    public final String toString() {
        long j11 = this.f17528a;
        if (j11 == 0) {
            return "0";
        }
        if (j11 > 0) {
            return Long.toString(j11, 10);
        }
        char[] cArr = new char[64];
        long j12 = (j11 >>> 1) / ((long) 5);
        long j13 = 10;
        int i11 = 63;
        cArr[63] = Character.forDigit((int) (j11 - (j12 * j13)), 10);
        while (j12 > 0) {
            i11--;
            cArr[i11] = Character.forDigit((int) (j12 % j13), 10);
            j12 /= j13;
        }
        return new String(cArr, i11, 64 - i11);
    }
}
