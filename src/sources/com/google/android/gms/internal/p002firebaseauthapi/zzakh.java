package com.google.android.gms.internal.p002firebaseauthapi;

import b7.e0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzakh extends zzaiy<Double> implements zzalb<Double>, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double[] f10112d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f10113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10114c;

    static {
        double[] dArr = new double[0];
        f10112d = dArr;
        new zzakh(dArr, 0, false);
    }

    public zzakh() {
        this(f10112d, 0, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.f10114c)) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f10114c, ", Size:"));
        }
        double[] dArr = this.f10113b;
        if (i12 < dArr.length) {
            System.arraycopy(dArr, i11, dArr, i11 + 1, i12 - i11);
        } else {
            double[] dArr2 = new double[e0.c(dArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f10113b, 0, dArr2, 0, i11);
            System.arraycopy(this.f10113b, i11, dArr2, i11 + 1, this.f10114c - i11);
            this.f10113b = dArr2;
        }
        this.f10113b[i11] = dDoubleValue;
        this.f10114c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzakw.f10134a;
        collection.getClass();
        if (!(collection instanceof zzakh)) {
            return super.addAll(collection);
        }
        zzakh zzakhVar = (zzakh) collection;
        int i11 = zzakhVar.f10114c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f10114c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        double[] dArr = this.f10113b;
        if (i13 > dArr.length) {
            this.f10113b = Arrays.copyOf(dArr, i13);
        }
        System.arraycopy(zzakhVar.f10113b, 0, this.f10113b, this.f10114c, zzakhVar.f10114c);
        this.f10114c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(double d5) {
        zza();
        int i11 = this.f10114c;
        double[] dArr = this.f10113b;
        if (i11 == dArr.length) {
            double[] dArr2 = new double[e0.c(dArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f10113b, 0, dArr2, 0, this.f10114c);
            this.f10113b = dArr2;
        }
        double[] dArr3 = this.f10113b;
        int i12 = this.f10114c;
        this.f10114c = i12 + 1;
        dArr3[i12] = d5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i11) {
        if (i11 < 0 || i11 >= this.f10114c) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f10114c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzakh)) {
            return super.equals(obj);
        }
        zzakh zzakhVar = (zzakh) obj;
        if (this.f10114c != zzakhVar.f10114c) {
            return false;
        }
        double[] dArr = zzakhVar.f10113b;
        for (int i11 = 0; i11 < this.f10114c; i11++) {
            if (Double.doubleToLongBits(this.f10113b[i11]) != Double.doubleToLongBits(dArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        d(i11);
        return Double.valueOf(this.f10113b[i11]);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i11 = 0; i11 < this.f10114c; i11++) {
            iB = (iB * 31) + zzakw.b(Double.doubleToLongBits(this.f10113b[i11]));
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i11 = this.f10114c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f10113b[i12] == dDoubleValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i11) {
        zza();
        d(i11);
        double[] dArr = this.f10113b;
        double d5 = dArr[i11];
        int i12 = this.f10114c;
        if (i11 < i12 - 1) {
            System.arraycopy(dArr, i11 + 1, dArr, i11, (i12 - i11) - 1);
        }
        this.f10114c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f10113b;
        System.arraycopy(dArr, i12, dArr, i11, this.f10114c - i12);
        this.f10114c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i11, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        d(i11);
        double[] dArr = this.f10113b;
        double d5 = dArr[i11];
        dArr[i11] = dDoubleValue;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10114c;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalb
    public final /* synthetic */ zzalb zza(int i11) {
        if (i11 >= this.f10114c) {
            return new zzakh(i11 == 0 ? f10112d : Arrays.copyOf(this.f10113b, i11), this.f10114c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzakh(double[] dArr, int i11, boolean z11) {
        super(z11);
        this.f10113b = dArr;
        this.f10114c = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        b(((Double) obj).doubleValue());
        return true;
    }
}
