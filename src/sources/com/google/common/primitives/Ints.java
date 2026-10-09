package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Ints extends IntsMethodsForWeb {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class IntArrayAsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f17514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17516c;

        public IntArrayAsList(int i11, int i12, int[] iArr) {
            this.f17514a = iArr;
            this.f17515b = i11;
            this.f17516c = i12;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            int iIntValue = ((Integer) obj).intValue();
            int i11 = this.f17515b;
            while (i11 < this.f17516c) {
                if (this.f17514a[i11] == iIntValue) {
                    if (i11 != -1) {
                        return true;
                    }
                    return false;
                }
                i11++;
            }
            i11 = -1;
            if (i11 != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IntArrayAsList)) {
                return super.equals(obj);
            }
            IntArrayAsList intArrayAsList = (IntArrayAsList) obj;
            int size = size();
            if (intArrayAsList.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                if (this.f17514a[this.f17515b + i11] != intArrayAsList.f17514a[intArrayAsList.f17515b + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i11) {
            Preconditions.i(i11, size());
            return Integer.valueOf(this.f17514a[this.f17515b + i11]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i11 = 1;
            for (int i12 = this.f17515b; i12 < this.f17516c; i12++) {
                i11 = (i11 * 31) + this.f17514a[i12];
            }
            return i11;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001f  */
        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                int i11 = this.f17515b;
                int i12 = i11;
                while (i12 < this.f17516c) {
                    if (this.f17514a[i12] != iIntValue) {
                        i12++;
                    } else if (i12 >= 0) {
                        return i12 - i11;
                    }
                }
                i12 = -1;
                if (i12 >= 0) {
                    return i12 - i11;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            int i11;
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                int i12 = this.f17516c;
                do {
                    i12--;
                    i11 = this.f17515b;
                    if (i12 < i11) {
                        i12 = -1;
                        break;
                    }
                } while (this.f17514a[i12] != iIntValue);
                if (i12 >= 0) {
                    return i12 - i11;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i11, Object obj) {
            Integer num = (Integer) obj;
            Preconditions.i(i11, size());
            int i12 = this.f17515b + i11;
            int[] iArr = this.f17514a;
            int i13 = iArr[i12];
            num.getClass();
            iArr[i12] = num.intValue();
            return Integer.valueOf(i13);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f17516c - this.f17515b;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i11, int i12) {
            Preconditions.m(i11, i12, size());
            if (i11 == i12) {
                return Collections.EMPTY_LIST;
            }
            int i13 = this.f17515b;
            return new IntArrayAsList(i11 + i13, i13 + i12, this.f17514a);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            int[] iArr = this.f17514a;
            int i11 = this.f17515b;
            sb2.append(iArr[i11]);
            while (true) {
                i11++;
                if (i11 >= this.f17516c) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(iArr[i11]);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class IntConverter extends Converter<String, Integer> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Converter f17517a = new IntConverter();
        private static final long serialVersionUID = 1;

        private IntConverter() {
        }

        private Object readResolve() {
            return f17517a;
        }

        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            return Integer.decode((String) obj);
        }

        public final String toString() {
            return "Ints.stringConverter()";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LexicographicalComparator implements Comparator<int[]> {
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
        public final int compare(int[] iArr, int[] iArr2) {
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            int iMin = Math.min(iArr3.length, iArr4.length);
            for (int i11 = 0; i11 < iMin; i11++) {
                int iCompare = Integer.compare(iArr3[i11], iArr4[i11]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return iArr3.length - iArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Ints.lexicographicalComparator()";
        }
    }

    private Ints() {
    }

    public static List a(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new IntArrayAsList(0, iArr.length, iArr);
    }

    public static int b(long j11) {
        int i11 = (int) j11;
        Preconditions.d(j11, "Out of range: %s", ((long) i11) == j11);
        return i11;
    }

    public static int c(int i11, int i12) {
        Preconditions.c(i12, i12 <= 1073741823, 1073741823, "min (%s) must be less than or equal to max (%s)");
        return Math.min(Math.max(i11, i12), 1073741823);
    }

    public static int d(byte b3, byte b11, byte b12, byte b13) {
        return (b3 << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static int e(long j11) {
        if (j11 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j11 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j11;
    }

    public static int[] f(Collection collection) {
        if (collection instanceof IntArrayAsList) {
            IntArrayAsList intArrayAsList = (IntArrayAsList) collection;
            return Arrays.copyOfRange(intArrayAsList.f17514a, intArrayAsList.f17515b, intArrayAsList.f17516c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = array[i11];
            obj.getClass();
            iArr[i11] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Integer g(String str) {
        byte b3;
        Integer num;
        Long l9;
        Long lValueOf;
        Long lValueOf2;
        byte b11;
        str.getClass();
        if (str.isEmpty()) {
            l9 = 0;
            num = null;
        } else {
            int i11 = str.charAt(0) == '-' ? 1 : 0;
            if (i11 == str.length()) {
                l9 = 0;
                num = null;
            } else {
                int i12 = i11 + 1;
                char cCharAt = str.charAt(i11);
                if (cCharAt < 128) {
                    b3 = Longs.AsciiDigits.f17518a[cCharAt];
                } else {
                    byte[] bArr = Longs.AsciiDigits.f17518a;
                    b3 = -1;
                }
                if (b3 < 0 || b3 >= 10) {
                    num = null;
                    l9 = num;
                } else {
                    long j11 = -b3;
                    long j12 = 10;
                    long j13 = Long.MIN_VALUE / j12;
                    while (true) {
                        if (i12 < str.length()) {
                            int i13 = i12 + 1;
                            char cCharAt2 = str.charAt(i12);
                            if (cCharAt2 < 128) {
                                b11 = Longs.AsciiDigits.f17518a[cCharAt2];
                            } else {
                                byte[] bArr2 = Longs.AsciiDigits.f17518a;
                                b11 = -1;
                            }
                            if (b11 < 0 || b11 >= 10 || j11 < j13) {
                                num = null;
                            } else {
                                long j14 = j11 * j12;
                                num = null;
                                long j15 = b11;
                                if (j14 >= j15 - Long.MIN_VALUE) {
                                    j11 = j14 - j15;
                                    i12 = i13;
                                }
                            }
                        } else {
                            num = null;
                            if (i11 != 0) {
                                lValueOf2 = Long.valueOf(j11);
                            } else if (j11 != Long.MIN_VALUE) {
                                lValueOf = Long.valueOf(-j11);
                            }
                        }
                        l9 = num;
                    }
                }
            }
        }
        if (l9 != 0) {
            l9 = lValueOf;
            l9 = lValueOf2;
            if (l9.longValue() == l9.intValue()) {
                return Integer.valueOf(l9.intValue());
            }
        }
        l9 = lValueOf;
        l9 = lValueOf2;
        return num;
    }
}
