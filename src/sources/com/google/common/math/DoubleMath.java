package com.google.common.math;

import com.google.common.base.Preconditions;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class DoubleMath {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f17467a = 0;

    /* JADX INFO: renamed from: com.google.common.math.DoubleMath$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17468a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f17468a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17468a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17468a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17468a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17468a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17468a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17468a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17468a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        Math.log(2.0d);
    }

    private DoubleMath() {
    }

    public static boolean a(double d5) {
        if (DoubleUtils.b(d5)) {
            return d5 == 0.0d || 52 - Long.numberOfTrailingZeros(DoubleUtils.a(d5)) <= Math.getExponent(d5);
        }
        return false;
    }

    public static boolean b(double d5) {
        if (d5 > 0.0d && DoubleUtils.b(d5)) {
            long jA = DoubleUtils.a(d5);
            if ((jA & (jA - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public static int c(double d5) {
        boolean zB;
        RoundingMode roundingMode = RoundingMode.CEILING;
        boolean z11 = false;
        Preconditions.e("x must be positive and finite", d5 > 0.0d && DoubleUtils.b(d5));
        int exponent = Math.getExponent(d5);
        if (Math.getExponent(d5) < -1022) {
            return c(d5 * 4.503599627370496E15d) - 52;
        }
        switch (AnonymousClass1.f17468a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.c(b(d5));
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z11 = !b(d5);
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z11 = exponent < 0;
                zB = b(d5);
                z11 &= !zB;
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z11 = exponent >= 0;
                zB = b(d5);
                z11 &= !zB;
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d5) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z11 = true;
                }
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x009a, please report this as an issue */
    public static long d(double d5, RoundingMode roundingMode) {
        double dRint;
        long j11;
        boolean z11;
        if (!DoubleUtils.b(d5)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (AnonymousClass1.f17468a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.c(a(d5));
                dRint = d5;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d5 + " and rounding mode " + roundingMode);
            case 2:
                if (d5 >= 0.0d || a(d5)) {
                    dRint = d5;
                } else {
                    j11 = ((long) d5) - 1;
                    dRint = j11;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d5 + " and rounding mode " + roundingMode);
            case 3:
                if (d5 <= 0.0d || a(d5)) {
                    dRint = d5;
                } else {
                    j11 = ((long) d5) + 1;
                    dRint = j11;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d5 + " and rounding mode " + roundingMode);
            case 4:
                dRint = d5;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d5 + " and rounding mode " + roundingMode);
            case 5:
                if (a(d5)) {
                    dRint = d5;
                } else {
                    dRint = ((long) d5) + ((long) (d5 > 0.0d ? 1 : -1));
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d5 + " and rounding mode " + roundingMode);
            case 6:
                dRint = Math.rint(d5);
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d5 + " and rounding mode " + roundingMode);
            case 7:
                dRint = Math.rint(d5);
                if (Math.abs(d5 - dRint) == 0.5d) {
                    dRint = Math.copySign(0.5d, d5) + d5;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d5 + " and rounding mode " + roundingMode);
            case 8:
                dRint = Math.rint(d5);
                if (Math.abs(d5 - dRint) == 0.5d) {
                    dRint = d5;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d5 + " and rounding mode " + roundingMode);
            default:
                throw new AssertionError();
        }
    }
}
