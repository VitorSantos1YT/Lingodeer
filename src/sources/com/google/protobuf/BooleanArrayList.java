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
final class BooleanArrayList extends AbstractProtobufList<Boolean> implements Internal.BooleanList, RandomAccess, PrimitiveNonBoxingCollection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f21156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21157c;

    static {
        new BooleanArrayList(new boolean[0], 0, false);
    }

    public BooleanArrayList() {
        this(new boolean[10], 0, true);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i11 < 0 || i11 > (i12 = this.f21157c)) {
            StringBuilder sbI = c.i(i11, "Index:", ", Size:");
            sbI.append(this.f21157c);
            throw new IndexOutOfBoundsException(sbI.toString());
        }
        boolean[] zArr = this.f21156b;
        if (i12 < zArr.length) {
            System.arraycopy(zArr, i11, zArr, i11 + 1, i12 - i11);
        } else {
            boolean[] zArr2 = new boolean[e.D(i12, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i11);
            System.arraycopy(this.f21156b, i11, zArr2, i11 + 1, this.f21157c - i11);
            this.f21156b = zArr2;
        }
        this.f21156b[i11] = zBooleanValue;
        this.f21157c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = Internal.f21282a;
        collection.getClass();
        if (!(collection instanceof BooleanArrayList)) {
            return super.addAll(collection);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) collection;
        int i11 = booleanArrayList.f21157c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f21157c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        boolean[] zArr = this.f21156b;
        if (i13 > zArr.length) {
            this.f21156b = Arrays.copyOf(zArr, i13);
        }
        System.arraycopy(booleanArrayList.f21156b, 0, this.f21156b, this.f21157c, booleanArrayList.f21157c);
        this.f21157c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(boolean z11) {
        b();
        int i11 = this.f21157c;
        boolean[] zArr = this.f21156b;
        if (i11 == zArr.length) {
            boolean[] zArr2 = new boolean[e.D(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i11);
            this.f21156b = zArr2;
        }
        boolean[] zArr3 = this.f21156b;
        int i12 = this.f21157c;
        this.f21157c = i12 + 1;
        zArr3[i12] = z11;
    }

    public final void e(int i11) {
        if (i11 < 0 || i11 >= this.f21157c) {
            StringBuilder sbI = c.i(i11, "Index:", ", Size:");
            sbI.append(this.f21157c);
            throw new IndexOutOfBoundsException(sbI.toString());
        }
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BooleanArrayList)) {
            return super.equals(obj);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) obj;
        if (this.f21157c != booleanArrayList.f21157c) {
            return false;
        }
        boolean[] zArr = booleanArrayList.f21156b;
        for (int i11 = 0; i11 < this.f21157c; i11++) {
            if (this.f21156b[i11] != zArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        e(i11);
        return Boolean.valueOf(this.f21156b[i11]);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f21157c; i12++) {
            int i13 = i11 * 31;
            boolean z11 = this.f21156b[i12];
            Charset charset = Internal.f21282a;
            i11 = i13 + (z11 ? 1231 : 1237);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i11 = this.f21157c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f21156b[i12] == zBooleanValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        b();
        e(i11);
        boolean[] zArr = this.f21156b;
        boolean z11 = zArr[i11];
        int i12 = this.f21157c;
        if (i11 < i12 - 1) {
            System.arraycopy(zArr, i11 + 1, zArr, i11, (i12 - i11) - 1);
        }
        this.f21157c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        b();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f21156b;
        System.arraycopy(zArr, i12, zArr, i11, this.f21157c - i12);
        this.f21157c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        e(i11);
        boolean[] zArr = this.f21156b;
        boolean z11 = zArr[i11];
        zArr[i11] = zBooleanValue;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21157c;
    }

    public BooleanArrayList(boolean[] zArr, int i11, boolean z11) {
        super(z11);
        this.f21156b = zArr;
        this.f21157c = i11;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public final Internal.BooleanList a(int i11) {
        if (i11 >= this.f21157c) {
            return new BooleanArrayList(Arrays.copyOf(this.f21156b, i11), this.f21157c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Boolean) obj).booleanValue());
        return true;
    }
}
