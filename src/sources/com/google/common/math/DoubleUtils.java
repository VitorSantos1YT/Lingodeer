package com.google.common.math;

import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class DoubleUtils {
    private DoubleUtils() {
    }

    public static long a(double d5) {
        Preconditions.e("not a normal value", b(d5));
        int exponent = Math.getExponent(d5);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d5) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean b(double d5) {
        return Math.getExponent(d5) <= 1023;
    }
}
