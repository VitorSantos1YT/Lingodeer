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
final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final IntArrayList f21279d = new IntArrayList(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f21280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21281c;

    public IntArrayList() {
        this(new int[10], 0, true);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i11 < 0 || i11 > (i12 = this.f21281c)) {
            StringBuilder sbI = c.i(i11, "Index:", ", Size:");
            sbI.append(this.f21281c);
            throw new IndexOutOfBoundsException(sbI.toString());
        }
        int[] iArr = this.f21280b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i11, iArr, i11 + 1, i12 - i11);
        } else {
            int[] iArr2 = new int[e.D(i12, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            System.arraycopy(this.f21280b, i11, iArr2, i11 + 1, this.f21281c - i11);
            this.f21280b = iArr2;
        }
        this.f21280b[i11] = iIntValue;
        this.f21281c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = Internal.f21282a;
        collection.getClass();
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i11 = intArrayList.f21281c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f21281c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        int[] iArr = this.f21280b;
        if (i13 > iArr.length) {
            this.f21280b = Arrays.copyOf(iArr, i13);
        }
        System.arraycopy(intArrayList.f21280b, 0, this.f21280b, this.f21281c, intArrayList.f21281c);
        this.f21281c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i11) {
        b();
        int i12 = this.f21281c;
        int[] iArr = this.f21280b;
        if (i12 == iArr.length) {
            int[] iArr2 = new int[e.D(i12, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f21280b = iArr2;
        }
        int[] iArr3 = this.f21280b;
        int i13 = this.f21281c;
        this.f21281c = i13 + 1;
        iArr3[i13] = i11;
    }

    public final void e(int i11) {
        if (i11 < 0 || i11 >= this.f21281c) {
            StringBuilder sbI = c.i(i11, "Index:", ", Size:");
            sbI.append(this.f21281c);
            throw new IndexOutOfBoundsException(sbI.toString());
        }
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.f21281c != intArrayList.f21281c) {
            return false;
        }
        int[] iArr = intArrayList.f21280b;
        for (int i11 = 0; i11 < this.f21281c; i11++) {
            if (this.f21280b[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i11) {
        e(i11);
        return this.f21280b[i11];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return Integer.valueOf(f(i11));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f21281c; i12++) {
            i11 = (i11 * 31) + this.f21280b[i12];
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i11 = this.f21281c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f21280b[i12] == iIntValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        b();
        e(i11);
        int[] iArr = this.f21280b;
        int i12 = iArr[i11];
        int i13 = this.f21281c;
        if (i11 < i13 - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (i13 - i11) - 1);
        }
        this.f21281c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        b();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f21280b;
        System.arraycopy(iArr, i12, iArr, i11, this.f21281c - i12);
        this.f21281c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        e(i11);
        int[] iArr = this.f21280b;
        int i12 = iArr[i11];
        iArr[i11] = iIntValue;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21281c;
    }

    public IntArrayList(int[] iArr, int i11, boolean z11) {
        super(z11);
        this.f21280b = iArr;
        this.f21281c = i11;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public final Internal.IntList a(int i11) {
        if (i11 >= this.f21281c) {
            return new IntArrayList(Arrays.copyOf(this.f21280b, i11), this.f21281c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
