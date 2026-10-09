package com.google.android.gms.internal.measurement;

import b7.e0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzadc extends zzace implements RandomAccess, zzadx, zzafk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double[] f11248d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f11249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11250c;

    static {
        double[] dArr = new double[0];
        f11248d = dArr;
        new zzadc(dArr, 0, false);
    }

    public zzadc() {
        this(f11248d, 0, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        if (i11 < 0 || i11 > (i12 = this.f11250c)) {
            throw new IndexOutOfBoundsException(zzacg.a(this.f11250c, i11, (byte) 13, "Index:", ", Size:"));
        }
        int i13 = i11 + 1;
        double[] dArr = this.f11249b;
        int length = dArr.length;
        if (i12 < length) {
            System.arraycopy(dArr, i11, dArr, i13, i12 - i11);
        } else {
            double[] dArr2 = new double[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11249b, 0, dArr2, 0, i11);
            System.arraycopy(this.f11249b, i11, dArr2, i13, this.f11250c - i11);
            this.f11249b = dArr2;
        }
        this.f11249b[i11] = dDoubleValue;
        this.f11250c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        collection.getClass();
        if (!(collection instanceof zzadc)) {
            return super.addAll(collection);
        }
        zzadc zzadcVar = (zzadc) collection;
        int i11 = zzadcVar.f11250c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f11250c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        double[] dArr = this.f11249b;
        if (i13 > dArr.length) {
            this.f11249b = Arrays.copyOf(dArr, i13);
        }
        System.arraycopy(zzadcVar.f11249b, 0, this.f11249b, this.f11250c, zzadcVar.f11250c);
        this.f11250c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(double d5) {
        b();
        int i11 = this.f11250c;
        int length = this.f11249b.length;
        if (i11 == length) {
            double[] dArr = new double[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11249b, 0, dArr, 0, this.f11250c);
            this.f11249b = dArr;
        }
        double[] dArr2 = this.f11249b;
        int i12 = this.f11250c;
        this.f11250c = i12 + 1;
        dArr2[i12] = d5;
    }

    public final void e(int i11) {
        if (i11 < 0 || i11 >= this.f11250c) {
            throw new IndexOutOfBoundsException(zzacg.a(this.f11250c, i11, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzadc)) {
            return super.equals(obj);
        }
        zzadc zzadcVar = (zzadc) obj;
        if (this.f11250c != zzadcVar.f11250c) {
            return false;
        }
        double[] dArr = zzadcVar.f11249b;
        for (int i11 = 0; i11 < this.f11250c; i11++) {
            if (Double.doubleToLongBits(this.f11249b[i11]) != Double.doubleToLongBits(dArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        e(i11);
        return Double.valueOf(this.f11249b[i11]);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f11250c; i12++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f11249b[i12]);
            byte[] bArr = zzaed.f11274a;
            i11 = (i11 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i11 = this.f11250c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f11249b[i12] == dDoubleValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        b();
        e(i11);
        double[] dArr = this.f11249b;
        double d5 = dArr[i11];
        int i12 = this.f11250c;
        if (i11 < i12 - 1) {
            System.arraycopy(dArr, i11 + 1, dArr, i11, (i12 - i11) - 1);
        }
        this.f11250c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        b();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f11249b;
        System.arraycopy(dArr, i12, dArr, i11, this.f11250c - i12);
        this.f11250c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        e(i11);
        double[] dArr = this.f11249b;
        double d5 = dArr[i11];
        dArr[i11] = dDoubleValue;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11250c;
    }

    @Override // com.google.android.gms.internal.measurement.zzaef, com.google.android.gms.internal.measurement.zzadw
    /* JADX INFO: renamed from: zzd */
    public final zzadx zzg(int i11) {
        if (i11 >= this.f11250c) {
            return new zzadc(i11 == 0 ? f11248d : Arrays.copyOf(this.f11249b, i11), this.f11250c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzadc(double[] dArr, int i11, boolean z11) {
        super(z11);
        this.f11249b = dArr;
        this.f11250c = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Double) obj).doubleValue());
        return true;
    }
}
