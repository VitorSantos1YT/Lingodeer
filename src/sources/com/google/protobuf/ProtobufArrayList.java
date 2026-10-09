package com.google.protobuf;

import defpackage.e;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtobufArrayList f21352d = new ProtobufArrayList(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f21353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21354c;

    public ProtobufArrayList() {
        this(new Object[10], 0, true);
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public final Internal.ProtobufList a(int i11) {
        if (i11 >= this.f21354c) {
            return new ProtobufArrayList(Arrays.copyOf(this.f21353b, i11), this.f21354c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i11 = this.f21354c;
        Object[] objArr = this.f21353b;
        if (i11 == objArr.length) {
            this.f21353b = Arrays.copyOf(objArr, ((i11 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f21353b;
        int i12 = this.f21354c;
        this.f21354c = i12 + 1;
        objArr2[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(int i11) {
        if (i11 < 0 || i11 >= this.f21354c) {
            StringBuilder sbI = c.i(i11, "Index:", ", Size:");
            sbI.append(this.f21354c);
            throw new IndexOutOfBoundsException(sbI.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        d(i11);
        return this.f21353b[i11];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        b();
        d(i11);
        Object[] objArr = this.f21353b;
        Object obj = objArr[i11];
        int i12 = this.f21354c;
        if (i11 < i12 - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (i12 - i11) - 1);
        }
        this.f21354c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        b();
        d(i11);
        Object[] objArr = this.f21353b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21354c;
    }

    public ProtobufArrayList(Object[] objArr, int i11, boolean z11) {
        super(z11);
        this.f21353b = objArr;
        this.f21354c = i11;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        b();
        if (i11 >= 0 && i11 <= (i12 = this.f21354c)) {
            Object[] objArr = this.f21353b;
            if (i12 < objArr.length) {
                System.arraycopy(objArr, i11, objArr, i11 + 1, i12 - i11);
            } else {
                Object[] objArr2 = new Object[e.D(i12, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i11);
                System.arraycopy(this.f21353b, i11, objArr2, i11 + 1, this.f21354c - i11);
                this.f21353b = objArr2;
            }
            this.f21353b[i11] = obj;
            this.f21354c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbI = c.i(i11, "Index:", ", Size:");
        sbI.append(this.f21354c);
        throw new IndexOutOfBoundsException(sbI.toString());
    }
}
