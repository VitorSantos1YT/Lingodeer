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
final class zzdv extends zzdr implements RandomAccess, zzez, zzge {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f9475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9476c;

    static {
        new zzdv(new boolean[0], 0, false);
    }

    public zzdv() {
        this(new boolean[10], 0, true);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.f9476c)) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f9476c, ", Size:"));
        }
        boolean[] zArr = this.f9475b;
        if (i12 < zArr.length) {
            System.arraycopy(zArr, i11, zArr, i11 + 1, i12 - i11);
        } else {
            boolean[] zArr2 = new boolean[e.D(i12, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i11);
            System.arraycopy(this.f9475b, i11, zArr2, i11 + 1, this.f9476c - i11);
            this.f9475b = zArr2;
        }
        this.f9475b[i11] = zBooleanValue;
        this.f9476c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzfa.f9501a;
        collection.getClass();
        if (!(collection instanceof zzdv)) {
            return super.addAll(collection);
        }
        zzdv zzdvVar = (zzdv) collection;
        int i11 = zzdvVar.f9476c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f9476c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        boolean[] zArr = this.f9475b;
        if (i13 > zArr.length) {
            this.f9475b = Arrays.copyOf(zArr, i13);
        }
        System.arraycopy(zzdvVar.f9475b, 0, this.f9475b, this.f9476c, zzdvVar.f9476c);
        this.f9476c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(boolean z11) {
        zza();
        int i11 = this.f9476c;
        boolean[] zArr = this.f9475b;
        if (i11 == zArr.length) {
            boolean[] zArr2 = new boolean[e.D(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i11);
            this.f9475b = zArr2;
        }
        boolean[] zArr3 = this.f9475b;
        int i12 = this.f9476c;
        this.f9476c = i12 + 1;
        zArr3[i12] = z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i11) {
        if (i11 < 0 || i11 >= this.f9476c) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f9476c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdv)) {
            return super.equals(obj);
        }
        zzdv zzdvVar = (zzdv) obj;
        if (this.f9476c != zzdvVar.f9476c) {
            return false;
        }
        boolean[] zArr = zzdvVar.f9475b;
        for (int i11 = 0; i11 < this.f9476c; i11++) {
            if (this.f9475b[i11] != zArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        d(i11);
        return Boolean.valueOf(this.f9475b[i11]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f9476c; i12++) {
            int i13 = i11 * 31;
            boolean z11 = this.f9475b[i12];
            Charset charset = zzfa.f9501a;
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
        int i11 = this.f9476c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f9475b[i12] == zBooleanValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zza();
        d(i11);
        boolean[] zArr = this.f9475b;
        boolean z11 = zArr[i11];
        int i12 = this.f9476c;
        if (i11 < i12 - 1) {
            System.arraycopy(zArr, i11 + 1, zArr, i11, (i12 - i11) - 1);
        }
        this.f9476c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f9475b;
        System.arraycopy(zArr, i12, zArr, i11, this.f9476c - i12);
        this.f9476c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        d(i11);
        boolean[] zArr = this.f9475b;
        boolean z11 = zArr[i11];
        zArr[i11] = zBooleanValue;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9476c;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i11) {
        if (i11 >= this.f9476c) {
            return new zzdv(Arrays.copyOf(this.f9475b, i11), this.f9476c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzdv(boolean[] zArr, int i11, boolean z11) {
        super(z11);
        this.f9475b = zArr;
        this.f9476c = i11;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Boolean) obj).booleanValue());
        return true;
    }
}
