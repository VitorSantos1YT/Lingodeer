package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Comparator;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class UnsignedBytes {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class LexicographicalComparatorHolder {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class PureJavaComparator implements Comparator<byte[]> {
            private static final /* synthetic */ PureJavaComparator[] $VALUES;
            public static final PureJavaComparator INSTANCE;

            static {
                PureJavaComparator pureJavaComparator = new PureJavaComparator("INSTANCE", 0);
                INSTANCE = pureJavaComparator;
                $VALUES = new PureJavaComparator[]{pureJavaComparator};
            }

            public static PureJavaComparator valueOf(String str) {
                return (PureJavaComparator) Enum.valueOf(PureJavaComparator.class, str);
            }

            public static PureJavaComparator[] values() {
                return (PureJavaComparator[]) $VALUES.clone();
            }

            @Override // java.util.Comparator
            public final int compare(byte[] bArr, byte[] bArr2) {
                byte[] bArr3 = bArr;
                byte[] bArr4 = bArr2;
                int iMin = Math.min(bArr3.length, bArr4.length);
                for (int i11 = 0; i11 < iMin; i11++) {
                    int i12 = (bArr3[i11] & 255) - (bArr4[i11] & 255);
                    if (i12 != 0) {
                        return i12;
                    }
                }
                return bArr3.length - bArr4.length;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class UnsafeComparator implements Comparator<byte[]> {
            private static final /* synthetic */ UnsafeComparator[] $VALUES;
            static final boolean BIG_ENDIAN;
            static final int BYTE_ARRAY_BASE_OFFSET;
            public static final UnsafeComparator INSTANCE;
            static final Unsafe theUnsafe;

            static {
                UnsafeComparator unsafeComparator = new UnsafeComparator("INSTANCE", 0);
                INSTANCE = unsafeComparator;
                $VALUES = new UnsafeComparator[]{unsafeComparator};
                BIG_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
                Unsafe unsafeB = b();
                theUnsafe = unsafeB;
                int iArrayBaseOffset = unsafeB.arrayBaseOffset(byte[].class);
                BYTE_ARRAY_BASE_OFFSET = iArrayBaseOffset;
                if (!"64".equals(System.getProperty("sun.arch.data.model")) || iArrayBaseOffset % 8 != 0 || unsafeB.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            public static int a(byte[] bArr, byte[] bArr2) {
                int iMin = Math.min(bArr.length, bArr2.length);
                int i11 = iMin & (-8);
                int i12 = 0;
                while (i12 < i11) {
                    Unsafe unsafe = theUnsafe;
                    long j11 = ((long) BYTE_ARRAY_BASE_OFFSET) + ((long) i12);
                    long j12 = unsafe.getLong(bArr, j11);
                    long j13 = unsafe.getLong(bArr2, j11);
                    if (j12 != j13) {
                        if (BIG_ENDIAN) {
                            return Long.compare(j12 ^ Long.MIN_VALUE, Long.MIN_VALUE ^ j13);
                        }
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j12 ^ j13) & (-8);
                        return ((int) ((j12 >>> iNumberOfTrailingZeros) & 255)) - ((int) ((j13 >>> iNumberOfTrailingZeros) & 255));
                    }
                    i12 += 8;
                }
                while (i12 < iMin) {
                    int i13 = (bArr[i12] & 255) - (bArr2[i12] & 255);
                    if (i13 != 0) {
                        return i13;
                    }
                    i12++;
                }
                return bArr.length - bArr2.length;
            }

            public static Unsafe b() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (PrivilegedActionException e8) {
                        throw new RuntimeException("Could not initialize intrinsics", e8.getCause());
                    }
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.1
                        public static Unsafe a() throws IllegalAccessException {
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }

                        @Override // java.security.PrivilegedExceptionAction
                        public final /* bridge */ /* synthetic */ Unsafe run() {
                            return a();
                        }
                    });
                }
            }

            public static UnsafeComparator valueOf(String str) {
                return (UnsafeComparator) Enum.valueOf(UnsafeComparator.class, str);
            }

            public static UnsafeComparator[] values() {
                return (UnsafeComparator[]) $VALUES.clone();
            }

            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
                return a(bArr, bArr2);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }
        }

        static {
            try {
                Object[] enumConstants = Class.forName(LexicographicalComparatorHolder.class.getName().concat("$UnsafeComparator")).getEnumConstants();
                Objects.requireNonNull(enumConstants);
            } catch (Throwable unused) {
            }
        }
    }

    private UnsignedBytes() {
    }

    public static byte a(long j11) {
        Preconditions.d(j11, "out of range: %s", (j11 >> 8) == 0);
        return (byte) j11;
    }
}
