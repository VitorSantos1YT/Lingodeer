package com.google.android.gms.internal.measurement;

import b7.e0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzadv extends zzace implements RandomAccess, zzaeb, zzafk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f11268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzadv f11269e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f11270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11271c;

    static {
        int[] iArr = new int[0];
        f11268d = iArr;
        f11269e = new zzadv(iArr, 0, false);
    }

    public zzadv() {
        this(f11268d, 0, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzaef, com.google.android.gms.internal.measurement.zzadw
    /* JADX INFO: renamed from: C */
    public final zzaeb zzg(int i11) {
        if (i11 >= this.f11271c) {
            return new zzadv(i11 == 0 ? f11268d : Arrays.copyOf(this.f11270b, i11), this.f11271c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzaeb
    public final int U(int i11) {
        d(i11);
        return this.f11270b[i11];
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i11 < 0 || i11 > (i12 = this.f11271c)) {
            throw new IndexOutOfBoundsException(zzacg.a(this.f11271c, i11, (byte) 13, "Index:", ", Size:"));
        }
        int i13 = i11 + 1;
        int[] iArr = this.f11270b;
        int length = iArr.length;
        if (i12 < length) {
            System.arraycopy(iArr, i11, iArr, i13, i12 - i11);
        } else {
            int[] iArr2 = new int[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11270b, 0, iArr2, 0, i11);
            System.arraycopy(this.f11270b, i11, iArr2, i13, this.f11271c - i11);
            this.f11270b = iArr2;
        }
        this.f11270b[i11] = iIntValue;
        this.f11271c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        collection.getClass();
        if (!(collection instanceof zzadv)) {
            return super.addAll(collection);
        }
        zzadv zzadvVar = (zzadv) collection;
        int i11 = zzadvVar.f11271c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f11271c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        int[] iArr = this.f11270b;
        if (i13 > iArr.length) {
            this.f11270b = Arrays.copyOf(iArr, i13);
        }
        System.arraycopy(zzadvVar.f11270b, 0, this.f11270b, this.f11271c, zzadvVar.f11271c);
        this.f11271c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i11) {
        if (i11 < 0 || i11 >= this.f11271c) {
            throw new IndexOutOfBoundsException(zzacg.a(this.f11271c, i11, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzadv)) {
            return super.equals(obj);
        }
        zzadv zzadvVar = (zzadv) obj;
        if (this.f11271c != zzadvVar.f11271c) {
            return false;
        }
        int[] iArr = zzadvVar.f11270b;
        for (int i11 = 0; i11 < this.f11271c; i11++) {
            if (this.f11270b[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        d(i11);
        return Integer.valueOf(this.f11270b[i11]);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f11271c; i12++) {
            i11 = (i11 * 31) + this.f11270b[i12];
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i11 = this.f11271c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f11270b[i12] == iIntValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        b();
        d(i11);
        int[] iArr = this.f11270b;
        int i12 = iArr[i11];
        int i13 = this.f11271c;
        if (i11 < i13 - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (i13 - i11) - 1);
        }
        this.f11271c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        b();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f11270b;
        System.arraycopy(iArr, i12, iArr, i11, this.f11271c - i12);
        this.f11271c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        d(i11);
        int[] iArr = this.f11270b;
        int i12 = iArr[i11];
        iArr[i11] = iIntValue;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11271c;
    }

    public final void zzh(int i11) {
        b();
        int i12 = this.f11271c;
        int length = this.f11270b.length;
        if (i12 == length) {
            int[] iArr = new int[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11270b, 0, iArr, 0, this.f11271c);
            this.f11270b = iArr;
        }
        int[] iArr2 = this.f11270b;
        int i13 = this.f11271c;
        this.f11271c = i13 + 1;
        iArr2[i13] = i11;
    }

    public zzadv(int[] iArr, int i11, boolean z11) {
        super(z11);
        this.f11270b = iArr;
        this.f11271c = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
