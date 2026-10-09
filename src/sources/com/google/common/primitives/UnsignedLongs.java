package com.google.common.primitives;

import java.math.BigInteger;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class UnsignedLongs {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LexicographicalComparator implements Comparator<long[]> {
        private static final /* synthetic */ LexicographicalComparator[] $VALUES;
        public static final LexicographicalComparator INSTANCE;

        static {
            LexicographicalComparator lexicographicalComparator = new LexicographicalComparator("INSTANCE", 0);
            INSTANCE = lexicographicalComparator;
            $VALUES = new LexicographicalComparator[]{lexicographicalComparator};
        }

        public static LexicographicalComparator valueOf(String str) {
            return (LexicographicalComparator) Enum.valueOf(LexicographicalComparator.class, str);
        }

        public static LexicographicalComparator[] values() {
            return (LexicographicalComparator[]) $VALUES.clone();
        }

        @Override // java.util.Comparator
        public final int compare(long[] jArr, long[] jArr2) {
            long[] jArr3 = jArr;
            long[] jArr4 = jArr2;
            int iMin = Math.min(jArr3.length, jArr4.length);
            for (int i11 = 0; i11 < iMin; i11++) {
                long j11 = jArr3[i11];
                long j12 = jArr4[i11];
                if (j11 != j12) {
                    return UnsignedLongs.a(j11, j12);
                }
            }
            return jArr3.length - jArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ParseOverflowDetection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final long[] f17529a = new long[37];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f17530b = new int[37];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int[] f17531c = new int[37];

        static {
            long j11;
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i11 = 2; i11 <= 36; i11++) {
                long[] jArr = f17529a;
                long j12 = i11;
                long j13 = -1;
                if (j12 < 0) {
                    j11 = UnsignedLongs.a(-1L, j12) < 0 ? 0L : 1L;
                } else {
                    long j14 = (Long.MAX_VALUE / j12) << 1;
                    j11 = j14 + ((long) (UnsignedLongs.a((-1) - (j14 * j12), j12) >= 0 ? 1 : 0));
                }
                jArr[i11] = j11;
                int[] iArr = f17530b;
                if (j12 < 0) {
                    if (UnsignedLongs.a(-1L, j12) < 0) {
                    }
                    iArr[i11] = (int) j13;
                    f17531c[i11] = bigInteger.toString(i11).length() - 1;
                } else {
                    j13 = (-1) - (((Long.MAX_VALUE / j12) << 1) * j12);
                    if (UnsignedLongs.a(j13, j12) < 0) {
                        j12 = 0;
                    }
                }
                j13 -= j12;
                iArr[i11] = (int) j13;
                f17531c[i11] = bigInteger.toString(i11).length() - 1;
            }
        }

        private ParseOverflowDetection() {
        }
    }

    private UnsignedLongs() {
    }

    public static int a(long j11, long j12) {
        return Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
    }
}
