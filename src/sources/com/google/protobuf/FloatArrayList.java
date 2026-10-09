package com.google.protobuf;

import defpackage.e;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import pt.ImS.aYZzTH;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, RandomAccess, PrimitiveNonBoxingCollection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f21260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21261c;

    static {
        new FloatArrayList(new float[0], 0, false);
    }

    public FloatArrayList() {
        this(new float[10], 0, true);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        float fFloatValue = ((Float) obj).floatValue();
        b();
        if (i11 < 0 || i11 > (i12 = this.f21261c)) {
            StringBuilder sbI = c.i(i11, "Index:", ", Size:");
            sbI.append(this.f21261c);
            throw new IndexOutOfBoundsException(sbI.toString());
        }
        float[] fArr = this.f21260b;
        if (i12 < fArr.length) {
            System.arraycopy(fArr, i11, fArr, i11 + 1, i12 - i11);
        } else {
            float[] fArr2 = new float[e.D(i12, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i11);
            System.arraycopy(this.f21260b, i11, fArr2, i11 + 1, this.f21261c - i11);
            this.f21260b = fArr2;
        }
        this.f21260b[i11] = fFloatValue;
        this.f21261c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = Internal.f21282a;
        collection.getClass();
        if (!(collection instanceof FloatArrayList)) {
            return super.addAll(collection);
        }
        FloatArrayList floatArrayList = (FloatArrayList) collection;
        int i11 = floatArrayList.f21261c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f21261c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        float[] fArr = this.f21260b;
        if (i13 > fArr.length) {
            this.f21260b = Arrays.copyOf(fArr, i13);
        }
        System.arraycopy(floatArrayList.f21260b, 0, this.f21260b, this.f21261c, floatArrayList.f21261c);
        this.f21261c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(float f5) {
        b();
        int i11 = this.f21261c;
        float[] fArr = this.f21260b;
        if (i11 == fArr.length) {
            float[] fArr2 = new float[e.D(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i11);
            this.f21260b = fArr2;
        }
        float[] fArr3 = this.f21260b;
        int i12 = this.f21261c;
        this.f21261c = i12 + 1;
        fArr3[i12] = f5;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatArrayList)) {
            return super.equals(obj);
        }
        FloatArrayList floatArrayList = (FloatArrayList) obj;
        if (this.f21261c != floatArrayList.f21261c) {
            return false;
        }
        float[] fArr = floatArrayList.f21260b;
        for (int i11 = 0; i11 < this.f21261c; i11++) {
            if (Float.floatToIntBits(this.f21260b[i11]) != Float.floatToIntBits(fArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        e(i11);
        return Float.valueOf(this.f21260b[i11]);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i11 = 0; i11 < this.f21261c; i11++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f21260b[i11]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i11 = this.f21261c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f21260b[i12] == fFloatValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        b();
        e(i11);
        float[] fArr = this.f21260b;
        float f5 = fArr[i11];
        int i12 = this.f21261c;
        if (i11 < i12 - 1) {
            System.arraycopy(fArr, i11 + 1, fArr, i11, (i12 - i11) - 1);
        }
        this.f21261c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        b();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f21260b;
        System.arraycopy(fArr, i12, fArr, i11, this.f21261c - i12);
        this.f21261c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        b();
        e(i11);
        float[] fArr = this.f21260b;
        float f5 = fArr[i11];
        fArr[i11] = fFloatValue;
        return Float.valueOf(f5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21261c;
    }

    public FloatArrayList(float[] fArr, int i11, boolean z11) {
        super(z11);
        this.f21260b = fArr;
        this.f21261c = i11;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public final Internal.FloatList a(int i11) {
        if (i11 >= this.f21261c) {
            return new FloatArrayList(Arrays.copyOf(this.f21260b, i11), this.f21261c, true);
        }
        throw new IllegalArgumentException();
    }

    public final void e(int i11) {
        if (i11 < 0 || i11 >= this.f21261c) {
            StringBuilder sbI = c.i(i11, aYZzTH.pZHs, ", Size:");
            sbI.append(this.f21261c);
            throw new IndexOutOfBoundsException(sbI.toString());
        }
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Float) obj).floatValue());
        return true;
    }
}
