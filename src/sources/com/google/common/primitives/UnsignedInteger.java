package com.google.common.primitives;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class UnsignedInteger extends Number implements Comparable<UnsignedInteger> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17527a;

    static {
        new UnsignedInteger(0);
        new UnsignedInteger(1);
        new UnsignedInteger(-1);
    }

    public UnsignedInteger(int i11) {
        this.f17527a = i11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(UnsignedInteger unsignedInteger) {
        UnsignedInteger unsignedInteger2 = unsignedInteger;
        unsignedInteger2.getClass();
        return Integer.compare(this.f17527a ^ Integer.MIN_VALUE, unsignedInteger2.f17527a ^ Integer.MIN_VALUE);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof UnsignedInteger) && this.f17527a == ((UnsignedInteger) obj).f17527a;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return longValue();
    }

    public final int hashCode() {
        return this.f17527a;
    }

    @Override // java.lang.Number
    public final int intValue() {
        return this.f17527a;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return ((long) this.f17527a) & 4294967295L;
    }

    public final String toString() {
        return Long.toString(((long) this.f17527a) & 4294967295L, 10);
    }
}
