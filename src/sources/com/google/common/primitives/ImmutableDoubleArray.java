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
public final class ImmutableDoubleArray implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ImmutableDoubleArray f17497d = new ImmutableDoubleArray(new double[0], 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f17498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient int f17499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17500c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class AsList extends AbstractList<Double> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableDoubleArray f17501a;

        public AsList(ImmutableDoubleArray immutableDoubleArray) {
            this.f17501a = immutableDoubleArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            boolean z11 = obj instanceof AsList;
            ImmutableDoubleArray immutableDoubleArray = this.f17501a;
            if (z11) {
                return immutableDoubleArray.equals(((AsList) obj).f17501a);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (immutableDoubleArray.b() != list.size()) {
                return false;
            }
            int i11 = immutableDoubleArray.f17499b;
            for (Object obj2 : list) {
                if (obj2 instanceof Double) {
                    int i12 = i11 + 1;
                    if (ImmutableDoubleArray.a(immutableDoubleArray.f17498a[i11], ((Double) obj2).doubleValue())) {
                        i11 = i12;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i11) {
            ImmutableDoubleArray immutableDoubleArray = this.f17501a;
            Preconditions.i(i11, immutableDoubleArray.b());
            return Double.valueOf(immutableDoubleArray.f17498a[immutableDoubleArray.f17499b + i11]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            return this.f17501a.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                ImmutableDoubleArray immutableDoubleArray = this.f17501a;
                int i11 = immutableDoubleArray.f17499b;
                for (int i12 = i11; i12 < immutableDoubleArray.f17500c; i12++) {
                    if (ImmutableDoubleArray.a(immutableDoubleArray.f17498a[i12], dDoubleValue)) {
                        return i12 - i11;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                ImmutableDoubleArray immutableDoubleArray = this.f17501a;
                int i11 = immutableDoubleArray.f17499b;
                for (int i12 = immutableDoubleArray.f17500c - 1; i12 >= i11; i12--) {
                    if (ImmutableDoubleArray.a(immutableDoubleArray.f17498a[i12], dDoubleValue)) {
                        return i12 - i11;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f17501a.b();
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i11, int i12) {
            ImmutableDoubleArray immutableDoubleArray;
            ImmutableDoubleArray immutableDoubleArray2 = this.f17501a;
            Preconditions.m(i11, i12, immutableDoubleArray2.b());
            if (i11 == i12) {
                immutableDoubleArray = ImmutableDoubleArray.f17497d;
            } else {
                double[] dArr = immutableDoubleArray2.f17498a;
                int i13 = immutableDoubleArray2.f17499b;
                immutableDoubleArray = new ImmutableDoubleArray(dArr, i11 + i13, i13 + i12);
            }
            return new AsList(immutableDoubleArray);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return this.f17501a.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
    }

    public ImmutableDoubleArray(double[] dArr, int i11, int i12) {
        this.f17498a = dArr;
        this.f17499b = i11;
        this.f17500c = i12;
    }

    public static boolean a(double d5, double d11) {
        return Double.doubleToLongBits(d5) == Double.doubleToLongBits(d11);
    }

    public final int b() {
        return this.f17500c - this.f17499b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableDoubleArray) {
            ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
            if (b() == immutableDoubleArray.b()) {
                for (int i11 = 0; i11 < b(); i11++) {
                    Preconditions.i(i11, b());
                    double d5 = this.f17498a[this.f17499b + i11];
                    Preconditions.i(i11, immutableDoubleArray.b());
                    if (a(d5, immutableDoubleArray.f17498a[immutableDoubleArray.f17499b + i11])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i11 = this.f17499b; i11 < this.f17500c; i11++) {
            double d5 = this.f17498a[i11];
            int i12 = Doubles.f17490a;
            iHashCode = (iHashCode * 31) + Double.valueOf(d5).hashCode();
        }
        return iHashCode;
    }

    public Object readResolve() {
        return this.f17500c == this.f17499b ? f17497d : this;
    }

    public final String toString() {
        int i11 = this.f17499b;
        int i12 = this.f17500c;
        if (i12 == i11) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(b() * 5);
        sb2.append('[');
        double[] dArr = this.f17498a;
        sb2.append(dArr[i11]);
        while (true) {
            i11++;
            if (i11 >= i12) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(dArr[i11]);
        }
    }

    public Object writeReplace() {
        double[] dArr = this.f17498a;
        int i11 = this.f17500c;
        int i12 = this.f17499b;
        if (i12 <= 0 && i11 >= dArr.length) {
            return this;
        }
        double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i12, i11);
        return new ImmutableDoubleArray(dArrCopyOfRange, 0, dArrCopyOfRange.length);
    }
}
