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
final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LongArrayList f21304d = new LongArrayList(new long[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f21305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21306c;

    public LongArrayList() {
        this(new long[10], 0, true);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i11 < 0 || i11 > (i12 = this.f21306c)) {
            StringBuilder sbI = c.i(i11, "Index:", ", Size:");
            sbI.append(this.f21306c);
            throw new IndexOutOfBoundsException(sbI.toString());
        }
        long[] jArr = this.f21305b;
        if (i12 < jArr.length) {
            System.arraycopy(jArr, i11, jArr, i11 + 1, i12 - i11);
        } else {
            long[] jArr2 = new long[e.D(i12, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i11);
            System.arraycopy(this.f21305b, i11, jArr2, i11 + 1, this.f21306c - i11);
            this.f21305b = jArr2;
        }
        this.f21305b[i11] = jLongValue;
        this.f21306c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = Internal.f21282a;
        collection.getClass();
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i11 = longArrayList.f21306c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f21306c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        long[] jArr = this.f21305b;
        if (i13 > jArr.length) {
            this.f21305b = Arrays.copyOf(jArr, i13);
        }
        System.arraycopy(longArrayList.f21305b, 0, this.f21305b, this.f21306c, longArrayList.f21306c);
        this.f21306c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j11) {
        b();
        int i11 = this.f21306c;
        long[] jArr = this.f21305b;
        if (i11 == jArr.length) {
            long[] jArr2 = new long[e.D(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i11);
            this.f21305b = jArr2;
        }
        long[] jArr3 = this.f21305b;
        int i12 = this.f21306c;
        this.f21306c = i12 + 1;
        jArr3[i12] = j11;
    }

    public final void e(int i11) {
        if (i11 < 0 || i11 >= this.f21306c) {
            StringBuilder sbI = c.i(i11, "Index:", ", Size:");
            sbI.append(this.f21306c);
            throw new IndexOutOfBoundsException(sbI.toString());
        }
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.f21306c != longArrayList.f21306c) {
            return false;
        }
        long[] jArr = longArrayList.f21305b;
        for (int i11 = 0; i11 < this.f21306c; i11++) {
            if (this.f21305b[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    public final long f(int i11) {
        e(i11);
        return this.f21305b[i11];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return Long.valueOf(f(i11));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i11 = 0; i11 < this.f21306c; i11++) {
            iB = (iB * 31) + Internal.b(this.f21305b[i11]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i11 = this.f21306c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f21305b[i12] == jLongValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        b();
        e(i11);
        long[] jArr = this.f21305b;
        long j11 = jArr[i11];
        int i12 = this.f21306c;
        if (i11 < i12 - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, (i12 - i11) - 1);
        }
        this.f21306c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        b();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f21305b;
        System.arraycopy(jArr, i12, jArr, i11, this.f21306c - i12);
        this.f21306c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        e(i11);
        long[] jArr = this.f21305b;
        long j11 = jArr[i11];
        jArr[i11] = jLongValue;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21306c;
    }

    public LongArrayList(long[] jArr, int i11, boolean z11) {
        super(z11);
        this.f21305b = jArr;
        this.f21306c = i11;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public final Internal.LongList a(int i11) {
        if (i11 >= this.f21306c) {
            return new LongArrayList(Arrays.copyOf(this.f21305b, i11), this.f21306c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
