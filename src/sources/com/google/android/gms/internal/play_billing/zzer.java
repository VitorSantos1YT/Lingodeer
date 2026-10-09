package com.google.android.gms.internal.play_billing;

import b7.e0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzer extends zzdu implements RandomAccess, zzfn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double[] f12360d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f12361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12362c;

    static {
        double[] dArr = new double[0];
        f12360d = dArr;
        new zzer(dArr, 0, false);
    }

    public zzer() {
        this(f12360d, 0, true);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.f12362c)) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f12362c, ", Size:"));
        }
        int i13 = i11 + 1;
        double[] dArr = this.f12361b;
        int length = dArr.length;
        if (i12 < length) {
            System.arraycopy(dArr, i11, dArr, i13, i12 - i11);
        } else {
            double[] dArr2 = new double[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f12361b, 0, dArr2, 0, i11);
            System.arraycopy(this.f12361b, i11, dArr2, i13, this.f12362c - i11);
            this.f12361b = dArr2;
        }
        this.f12361b[i11] = dDoubleValue;
        this.f12362c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzfo.f12383a;
        collection.getClass();
        if (!(collection instanceof zzer)) {
            return super.addAll(collection);
        }
        zzer zzerVar = (zzer) collection;
        int i11 = zzerVar.f12362c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f12362c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        double[] dArr = this.f12361b;
        if (i13 > dArr.length) {
            this.f12361b = Arrays.copyOf(dArr, i13);
        }
        System.arraycopy(zzerVar.f12361b, 0, this.f12361b, this.f12362c, zzerVar.f12362c);
        this.f12362c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(double d5) {
        zza();
        int i11 = this.f12362c;
        int length = this.f12361b.length;
        if (i11 == length) {
            double[] dArr = new double[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f12361b, 0, dArr, 0, this.f12362c);
            this.f12361b = dArr;
        }
        double[] dArr2 = this.f12361b;
        int i12 = this.f12362c;
        this.f12362c = i12 + 1;
        dArr2[i12] = d5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i11) {
        if (i11 < 0 || i11 >= this.f12362c) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f12362c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzer)) {
            return super.equals(obj);
        }
        zzer zzerVar = (zzer) obj;
        if (this.f12362c != zzerVar.f12362c) {
            return false;
        }
        double[] dArr = zzerVar.f12361b;
        for (int i11 = 0; i11 < this.f12362c; i11++) {
            if (Double.doubleToLongBits(this.f12361b[i11]) != Double.doubleToLongBits(dArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        d(i11);
        return Double.valueOf(this.f12361b[i11]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f12362c; i12++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f12361b[i12]);
            Charset charset = zzfo.f12383a;
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
        int i11 = this.f12362c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f12361b[i12] == dDoubleValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zza();
        d(i11);
        double[] dArr = this.f12361b;
        double d5 = dArr[i11];
        int i12 = this.f12362c;
        if (i11 < i12 - 1) {
            System.arraycopy(dArr, i11 + 1, dArr, i11, (i12 - i11) - 1);
        }
        this.f12362c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f12361b;
        System.arraycopy(dArr, i12, dArr, i11, this.f12362c - i12);
        this.f12362c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        d(i11);
        double[] dArr = this.f12361b;
        double d5 = dArr[i11];
        dArr[i11] = dDoubleValue;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12362c;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfn
    public final /* bridge */ /* synthetic */ zzfn zzd(int i11) {
        if (i11 >= this.f12362c) {
            return new zzer(i11 == 0 ? f12360d : Arrays.copyOf(this.f12361b, i11), this.f12362c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzer(double[] dArr, int i11, boolean z11) {
        super(z11);
        this.f12361b = dArr;
        this.f12362c = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Double) obj).doubleValue());
        return true;
    }
}
