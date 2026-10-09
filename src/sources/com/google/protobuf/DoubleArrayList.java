package com.google.protobuf;

import defpackage.e;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DoubleArrayList f21231d = new DoubleArrayList(new double[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f21232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21233c;

    public DoubleArrayList() {
        this(new double[10], 0, true);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        if (i11 < 0 || i11 > (i12 = this.f21233c)) {
            StringBuilder sbI = c.i(i11, "Index:", ", Size:");
            sbI.append(this.f21233c);
            throw new IndexOutOfBoundsException(sbI.toString());
        }
        double[] dArr = this.f21232b;
        if (i12 < dArr.length) {
            System.arraycopy(dArr, i11, dArr, i11 + 1, i12 - i11);
        } else {
            double[] dArr2 = new double[e.D(i12, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i11);
            System.arraycopy(this.f21232b, i11, dArr2, i11 + 1, this.f21233c - i11);
            this.f21232b = dArr2;
        }
        this.f21232b[i11] = dDoubleValue;
        this.f21233c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = Internal.f21282a;
        collection.getClass();
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        int i11 = doubleArrayList.f21233c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f21233c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        double[] dArr = this.f21232b;
        if (i13 > dArr.length) {
            this.f21232b = Arrays.copyOf(dArr, i13);
        }
        System.arraycopy(doubleArrayList.f21232b, 0, this.f21232b, this.f21233c, doubleArrayList.f21233c);
        this.f21233c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(double d5) {
        b();
        int i11 = this.f21233c;
        double[] dArr = this.f21232b;
        if (i11 == dArr.length) {
            double[] dArr2 = new double[e.D(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i11);
            this.f21232b = dArr2;
        }
        double[] dArr3 = this.f21232b;
        int i12 = this.f21233c;
        this.f21233c = i12 + 1;
        dArr3[i12] = d5;
    }

    public final void e(int i11) {
        if (i11 < 0 || i11 >= this.f21233c) {
            StringBuilder sbI = c.i(i11, "Index:", ", Size:");
            sbI.append(this.f21233c);
            throw new IndexOutOfBoundsException(sbI.toString());
        }
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoubleArrayList)) {
            return super.equals(obj);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) obj;
        if (this.f21233c != doubleArrayList.f21233c) {
            return false;
        }
        double[] dArr = doubleArrayList.f21232b;
        for (int i11 = 0; i11 < this.f21233c; i11++) {
            if (Double.doubleToLongBits(this.f21232b[i11]) != Double.doubleToLongBits(dArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        e(i11);
        return Double.valueOf(this.f21232b[i11]);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i11 = 0; i11 < this.f21233c; i11++) {
            iB = (iB * 31) + Internal.b(Double.doubleToLongBits(this.f21232b[i11]));
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i11 = this.f21233c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f21232b[i12] == dDoubleValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        b();
        e(i11);
        double[] dArr = this.f21232b;
        double d5 = dArr[i11];
        int i12 = this.f21233c;
        if (i11 < i12 - 1) {
            System.arraycopy(dArr, i11 + 1, dArr, i11, (i12 - i11) - 1);
        }
        this.f21233c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        b();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f21232b;
        System.arraycopy(dArr, i12, dArr, i11, this.f21233c - i12);
        this.f21233c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        e(i11);
        double[] dArr = this.f21232b;
        double d5 = dArr[i11];
        dArr[i11] = dDoubleValue;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21233c;
    }

    public DoubleArrayList(double[] dArr, int i11, boolean z11) {
        super(z11);
        this.f21232b = dArr;
        this.f21233c = i11;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public final Internal.DoubleList a(int i11) {
        if (i11 >= this.f21233c) {
            return new DoubleArrayList(Arrays.copyOf(this.f21232b, i11), this.f21233c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Double) obj).doubleValue());
        return true;
    }
}
