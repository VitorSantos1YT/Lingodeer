package com.google.android.gms.internal.auth;

import defpackage.e;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzek extends zzdr implements RandomAccess, zzez, zzge {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f9485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9486c;

    static {
        new zzek(new double[0], 0, false);
    }

    public zzek() {
        this(new double[10], 0, true);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.f9486c)) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f9486c, ", Size:"));
        }
        double[] dArr = this.f9485b;
        if (i12 < dArr.length) {
            System.arraycopy(dArr, i11, dArr, i11 + 1, i12 - i11);
        } else {
            double[] dArr2 = new double[e.D(i12, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i11);
            System.arraycopy(this.f9485b, i11, dArr2, i11 + 1, this.f9486c - i11);
            this.f9485b = dArr2;
        }
        this.f9485b[i11] = dDoubleValue;
        this.f9486c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzfa.f9501a;
        collection.getClass();
        if (!(collection instanceof zzek)) {
            return super.addAll(collection);
        }
        zzek zzekVar = (zzek) collection;
        int i11 = zzekVar.f9486c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f9486c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        double[] dArr = this.f9485b;
        if (i13 > dArr.length) {
            this.f9485b = Arrays.copyOf(dArr, i13);
        }
        System.arraycopy(zzekVar.f9485b, 0, this.f9485b, this.f9486c, zzekVar.f9486c);
        this.f9486c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(double d5) {
        zza();
        int i11 = this.f9486c;
        double[] dArr = this.f9485b;
        if (i11 == dArr.length) {
            double[] dArr2 = new double[e.D(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i11);
            this.f9485b = dArr2;
        }
        double[] dArr3 = this.f9485b;
        int i12 = this.f9486c;
        this.f9486c = i12 + 1;
        dArr3[i12] = d5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i11) {
        if (i11 < 0 || i11 >= this.f9486c) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f9486c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzek)) {
            return super.equals(obj);
        }
        zzek zzekVar = (zzek) obj;
        if (this.f9486c != zzekVar.f9486c) {
            return false;
        }
        double[] dArr = zzekVar.f9485b;
        for (int i11 = 0; i11 < this.f9486c; i11++) {
            if (Double.doubleToLongBits(this.f9485b[i11]) != Double.doubleToLongBits(dArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        d(i11);
        return Double.valueOf(this.f9485b[i11]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f9486c; i12++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f9485b[i12]);
            Charset charset = zzfa.f9501a;
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
        int i11 = this.f9486c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f9485b[i12] == dDoubleValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zza();
        d(i11);
        double[] dArr = this.f9485b;
        double d5 = dArr[i11];
        int i12 = this.f9486c;
        if (i11 < i12 - 1) {
            System.arraycopy(dArr, i11 + 1, dArr, i11, (i12 - i11) - 1);
        }
        this.f9486c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f9485b;
        System.arraycopy(dArr, i12, dArr, i11, this.f9486c - i12);
        this.f9486c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        d(i11);
        double[] dArr = this.f9485b;
        double d5 = dArr[i11];
        dArr[i11] = dDoubleValue;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9486c;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i11) {
        if (i11 >= this.f9486c) {
            return new zzek(Arrays.copyOf(this.f9485b, i11), this.f9486c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzek(double[] dArr, int i11, boolean z11) {
        super(z11);
        this.f9485b = dArr;
        this.f9486c = i11;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Double) obj).doubleValue());
        return true;
    }
}
