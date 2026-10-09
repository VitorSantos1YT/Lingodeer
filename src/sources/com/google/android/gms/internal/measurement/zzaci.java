package com.google.android.gms.internal.measurement;

import b7.e0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaci extends zzace implements RandomAccess, zzadw, zzafk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean[] f11203d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f11204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11205c;

    static {
        boolean[] zArr = new boolean[0];
        f11203d = zArr;
        new zzaci(zArr, 0, false);
    }

    public zzaci() {
        this(f11203d, 0, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i11 < 0 || i11 > (i12 = this.f11205c)) {
            throw new IndexOutOfBoundsException(zzacg.a(this.f11205c, i11, (byte) 13, "Index:", ", Size:"));
        }
        int i13 = i11 + 1;
        boolean[] zArr = this.f11204b;
        int length = zArr.length;
        if (i12 < length) {
            System.arraycopy(zArr, i11, zArr, i13, i12 - i11);
        } else {
            boolean[] zArr2 = new boolean[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11204b, 0, zArr2, 0, i11);
            System.arraycopy(this.f11204b, i11, zArr2, i13, this.f11205c - i11);
            this.f11204b = zArr2;
        }
        this.f11204b[i11] = zBooleanValue;
        this.f11205c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        collection.getClass();
        if (!(collection instanceof zzaci)) {
            return super.addAll(collection);
        }
        zzaci zzaciVar = (zzaci) collection;
        int i11 = zzaciVar.f11205c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f11205c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        boolean[] zArr = this.f11204b;
        if (i13 > zArr.length) {
            this.f11204b = Arrays.copyOf(zArr, i13);
        }
        System.arraycopy(zzaciVar.f11204b, 0, this.f11204b, this.f11205c, zzaciVar.f11205c);
        this.f11205c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(boolean z11) {
        b();
        int i11 = this.f11205c;
        int length = this.f11204b.length;
        if (i11 == length) {
            boolean[] zArr = new boolean[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11204b, 0, zArr, 0, this.f11205c);
            this.f11204b = zArr;
        }
        boolean[] zArr2 = this.f11204b;
        int i12 = this.f11205c;
        this.f11205c = i12 + 1;
        zArr2[i12] = z11;
    }

    public final void e(int i11) {
        if (i11 < 0 || i11 >= this.f11205c) {
            throw new IndexOutOfBoundsException(zzacg.a(this.f11205c, i11, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaci)) {
            return super.equals(obj);
        }
        zzaci zzaciVar = (zzaci) obj;
        if (this.f11205c != zzaciVar.f11205c) {
            return false;
        }
        boolean[] zArr = zzaciVar.f11204b;
        for (int i11 = 0; i11 < this.f11205c; i11++) {
            if (this.f11204b[i11] != zArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        e(i11);
        return Boolean.valueOf(this.f11204b[i11]);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f11205c; i12++) {
            int i13 = i11 * 31;
            boolean z11 = this.f11204b[i12];
            byte[] bArr = zzaed.f11274a;
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
        int i11 = this.f11205c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f11204b[i12] == zBooleanValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        b();
        e(i11);
        boolean[] zArr = this.f11204b;
        boolean z11 = zArr[i11];
        int i12 = this.f11205c;
        if (i11 < i12 - 1) {
            System.arraycopy(zArr, i11 + 1, zArr, i11, (i12 - i11) - 1);
        }
        this.f11205c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        b();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f11204b;
        System.arraycopy(zArr, i12, zArr, i11, this.f11205c - i12);
        this.f11205c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        e(i11);
        boolean[] zArr = this.f11204b;
        boolean z11 = zArr[i11];
        zArr[i11] = zBooleanValue;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11205c;
    }

    @Override // com.google.android.gms.internal.measurement.zzaef, com.google.android.gms.internal.measurement.zzadw
    /* JADX INFO: renamed from: zzd */
    public final zzadw zzg(int i11) {
        if (i11 >= this.f11205c) {
            return new zzaci(i11 == 0 ? f11203d : Arrays.copyOf(this.f11204b, i11), this.f11205c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzaci(boolean[] zArr, int i11, boolean z11) {
        super(z11);
        this.f11204b = zArr;
        this.f11205c = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Boolean) obj).booleanValue());
        return true;
    }
}
