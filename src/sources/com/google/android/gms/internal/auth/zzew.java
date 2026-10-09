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
final class zzew extends zzdr implements RandomAccess, zzez, zzge {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f9499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9500c;

    static {
        new zzew(new int[0], 0, false);
    }

    public zzew() {
        this(new int[10], 0, true);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        int iIntValue = ((Integer) obj).intValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.f9500c)) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f9500c, ", Size:"));
        }
        int[] iArr = this.f9499b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i11, iArr, i11 + 1, i12 - i11);
        } else {
            int[] iArr2 = new int[e.D(i12, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            System.arraycopy(this.f9499b, i11, iArr2, i11 + 1, this.f9500c - i11);
            this.f9499b = iArr2;
        }
        this.f9499b[i11] = iIntValue;
        this.f9500c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzfa.f9501a;
        collection.getClass();
        if (!(collection instanceof zzew)) {
            return super.addAll(collection);
        }
        zzew zzewVar = (zzew) collection;
        int i11 = zzewVar.f9500c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f9500c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        int[] iArr = this.f9499b;
        if (i13 > iArr.length) {
            this.f9499b = Arrays.copyOf(iArr, i13);
        }
        System.arraycopy(zzewVar.f9499b, 0, this.f9499b, this.f9500c, zzewVar.f9500c);
        this.f9500c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i11) {
        zza();
        int i12 = this.f9500c;
        int[] iArr = this.f9499b;
        if (i12 == iArr.length) {
            int[] iArr2 = new int[e.D(i12, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f9499b = iArr2;
        }
        int[] iArr3 = this.f9499b;
        int i13 = this.f9500c;
        this.f9500c = i13 + 1;
        iArr3[i13] = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i11) {
        if (i11 < 0 || i11 >= this.f9500c) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f9500c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzew)) {
            return super.equals(obj);
        }
        zzew zzewVar = (zzew) obj;
        if (this.f9500c != zzewVar.f9500c) {
            return false;
        }
        int[] iArr = zzewVar.f9499b;
        for (int i11 = 0; i11 < this.f9500c; i11++) {
            if (this.f9499b[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        d(i11);
        return Integer.valueOf(this.f9499b[i11]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f9500c; i12++) {
            i11 = (i11 * 31) + this.f9499b[i12];
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i11 = this.f9500c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f9499b[i12] == iIntValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zza();
        d(i11);
        int[] iArr = this.f9499b;
        int i12 = iArr[i11];
        int i13 = this.f9500c;
        if (i11 < i13 - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (i13 - i11) - 1);
        }
        this.f9500c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f9499b;
        System.arraycopy(iArr, i12, iArr, i11, this.f9500c - i12);
        this.f9500c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        d(i11);
        int[] iArr = this.f9499b;
        int i12 = iArr[i11];
        iArr[i11] = iIntValue;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9500c;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i11) {
        if (i11 >= this.f9500c) {
            return new zzew(Arrays.copyOf(this.f9499b, i11), this.f9500c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzew(int[] iArr, int i11, boolean z11) {
        super(z11);
        this.f9499b = iArr;
        this.f9500c = i11;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Integer) obj).intValue());
        return true;
    }
}
