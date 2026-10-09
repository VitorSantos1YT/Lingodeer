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
public final class ImmutableLongArray implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ImmutableLongArray f17507d = new ImmutableLongArray(new long[0], 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f17508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient int f17509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17510c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class AsList extends AbstractList<Long> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableLongArray f17511a;

        public AsList(ImmutableLongArray immutableLongArray) {
            this.f17511a = immutableLongArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            boolean z11 = obj instanceof AsList;
            ImmutableLongArray immutableLongArray = this.f17511a;
            if (z11) {
                return immutableLongArray.equals(((AsList) obj).f17511a);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (immutableLongArray.a() != list.size()) {
                return false;
            }
            int i11 = immutableLongArray.f17509b;
            for (Object obj2 : list) {
                if (obj2 instanceof Long) {
                    int i12 = i11 + 1;
                    if (immutableLongArray.f17508a[i11] == ((Long) obj2).longValue()) {
                        i11 = i12;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i11) {
            ImmutableLongArray immutableLongArray = this.f17511a;
            Preconditions.i(i11, immutableLongArray.a());
            return Long.valueOf(immutableLongArray.f17508a[immutableLongArray.f17509b + i11]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            return this.f17511a.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Long) {
                long jLongValue = ((Long) obj).longValue();
                ImmutableLongArray immutableLongArray = this.f17511a;
                int i11 = immutableLongArray.f17509b;
                for (int i12 = i11; i12 < immutableLongArray.f17510c; i12++) {
                    if (immutableLongArray.f17508a[i12] == jLongValue) {
                        return i12 - i11;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            int i11;
            if (obj instanceof Long) {
                long jLongValue = ((Long) obj).longValue();
                ImmutableLongArray immutableLongArray = this.f17511a;
                int i12 = immutableLongArray.f17510c;
                do {
                    i12--;
                    i11 = immutableLongArray.f17509b;
                    if (i12 >= i11) {
                    }
                } while (immutableLongArray.f17508a[i12] != jLongValue);
                return i12 - i11;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f17511a.a();
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i11, int i12) {
            ImmutableLongArray immutableLongArray;
            ImmutableLongArray immutableLongArray2 = this.f17511a;
            Preconditions.m(i11, i12, immutableLongArray2.a());
            if (i11 == i12) {
                immutableLongArray = ImmutableLongArray.f17507d;
            } else {
                long[] jArr = immutableLongArray2.f17508a;
                int i13 = immutableLongArray2.f17509b;
                immutableLongArray = new ImmutableLongArray(jArr, i11 + i13, i13 + i12);
            }
            return new AsList(immutableLongArray);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return this.f17511a.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long[] f17512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17513b;
    }

    public ImmutableLongArray(long[] jArr, int i11, int i12) {
        this.f17508a = jArr;
        this.f17509b = i11;
        this.f17510c = i12;
    }

    public final int a() {
        return this.f17510c - this.f17509b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableLongArray) {
            ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
            if (a() == immutableLongArray.a()) {
                for (int i11 = 0; i11 < a(); i11++) {
                    Preconditions.i(i11, a());
                    long j11 = this.f17508a[this.f17509b + i11];
                    Preconditions.i(i11, immutableLongArray.a());
                    if (j11 == immutableLongArray.f17508a[immutableLongArray.f17509b + i11]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = 1;
        for (int i11 = this.f17509b; i11 < this.f17510c; i11++) {
            iC = (iC * 31) + Longs.c(this.f17508a[i11]);
        }
        return iC;
    }

    public Object readResolve() {
        return this.f17510c == this.f17509b ? f17507d : this;
    }

    public final String toString() {
        int i11 = this.f17509b;
        int i12 = this.f17510c;
        if (i12 == i11) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(a() * 5);
        sb2.append('[');
        long[] jArr = this.f17508a;
        sb2.append(jArr[i11]);
        while (true) {
            i11++;
            if (i11 >= i12) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(jArr[i11]);
        }
    }

    public Object writeReplace() {
        long[] jArr = this.f17508a;
        int i11 = this.f17510c;
        int i12 = this.f17509b;
        if (i12 <= 0 && i11 >= jArr.length) {
            return this;
        }
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i12, i11);
        return new ImmutableLongArray(jArrCopyOfRange, 0, jArrCopyOfRange.length);
    }
}
