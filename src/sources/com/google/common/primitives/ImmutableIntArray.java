package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
@Immutable
public final class ImmutableIntArray implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ImmutableIntArray f17502d = new ImmutableIntArray(0, 0, new int[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f17503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient int f17504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17505c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableIntArray f17506a;

        public AsList(ImmutableIntArray immutableIntArray) {
            this.f17506a = immutableIntArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            boolean z11 = obj instanceof AsList;
            ImmutableIntArray immutableIntArray = this.f17506a;
            if (z11) {
                return immutableIntArray.equals(((AsList) obj).f17506a);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (immutableIntArray.a() != list.size()) {
                return false;
            }
            int i11 = immutableIntArray.f17504b;
            for (Object obj2 : list) {
                if (obj2 instanceof Integer) {
                    int i12 = i11 + 1;
                    if (immutableIntArray.f17503a[i11] == ((Integer) obj2).intValue()) {
                        i11 = i12;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i11) {
            ImmutableIntArray immutableIntArray = this.f17506a;
            Preconditions.i(i11, immutableIntArray.a());
            return Integer.valueOf(immutableIntArray.f17503a[immutableIntArray.f17504b + i11]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            return this.f17506a.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                ImmutableIntArray immutableIntArray = this.f17506a;
                int i11 = immutableIntArray.f17504b;
                for (int i12 = i11; i12 < immutableIntArray.f17505c; i12++) {
                    if (immutableIntArray.f17503a[i12] == iIntValue) {
                        return i12 - i11;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            int i11;
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                ImmutableIntArray immutableIntArray = this.f17506a;
                int i12 = immutableIntArray.f17505c;
                do {
                    i12--;
                    i11 = immutableIntArray.f17504b;
                    if (i12 >= i11) {
                    }
                } while (immutableIntArray.f17503a[i12] != iIntValue);
                return i12 - i11;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f17506a.a();
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i11, int i12) {
            ImmutableIntArray immutableIntArray;
            ImmutableIntArray immutableIntArray2 = this.f17506a;
            Preconditions.m(i11, i12, immutableIntArray2.a());
            if (i11 == i12) {
                immutableIntArray = ImmutableIntArray.f17502d;
            } else {
                int[] iArr = immutableIntArray2.f17503a;
                int i13 = immutableIntArray2.f17504b;
                immutableIntArray = new ImmutableIntArray(i11 + i13, i13 + i12, iArr);
            }
            return new AsList(immutableIntArray);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return this.f17506a.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
    }

    public ImmutableIntArray(int[] iArr) {
        this(0, iArr.length, iArr);
    }

    public final int a() {
        return this.f17505c - this.f17504b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableIntArray) {
            ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
            if (a() == immutableIntArray.a()) {
                for (int i11 = 0; i11 < a(); i11++) {
                    Preconditions.i(i11, a());
                    int i12 = this.f17503a[this.f17504b + i11];
                    Preconditions.i(i11, immutableIntArray.a());
                    if (i12 == immutableIntArray.f17503a[immutableIntArray.f17504b + i11]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = 1;
        for (int i12 = this.f17504b; i12 < this.f17505c; i12++) {
            i11 = (i11 * 31) + this.f17503a[i12];
        }
        return i11;
    }

    public Object readResolve() {
        return this.f17505c == this.f17504b ? f17502d : this;
    }

    public final String toString() {
        int i11 = this.f17504b;
        int i12 = this.f17505c;
        if (i12 == i11) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(a() * 5);
        sb2.append('[');
        int[] iArr = this.f17503a;
        sb2.append(iArr[i11]);
        while (true) {
            i11++;
            if (i11 >= i12) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
    }

    public Object writeReplace() {
        int[] iArr = this.f17503a;
        int i11 = this.f17505c;
        int i12 = this.f17504b;
        return (i12 > 0 || i11 < iArr.length) ? new ImmutableIntArray(Arrays.copyOfRange(iArr, i12, i11)) : this;
    }

    public ImmutableIntArray(int i11, int i12, int[] iArr) {
        this.f17503a = iArr;
        this.f17504b = i11;
        this.f17505c = i12;
    }
}
