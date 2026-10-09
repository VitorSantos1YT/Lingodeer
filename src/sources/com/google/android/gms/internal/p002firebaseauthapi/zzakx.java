package com.google.android.gms.internal.p002firebaseauthapi;

import b7.e0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzakx extends zzaiy<Integer> implements zzalb<Integer>, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f10135d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f10136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10137c;

    static {
        int[] iArr = new int[0];
        f10135d = iArr;
        new zzakx(iArr, 0, false);
    }

    public zzakx() {
        this(f10135d, 0, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        int iIntValue = ((Integer) obj).intValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.f10137c)) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f10137c, ", Size:"));
        }
        int[] iArr = this.f10136b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i11, iArr, i11 + 1, i12 - i11);
        } else {
            int[] iArr2 = new int[e0.c(iArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f10136b, 0, iArr2, 0, i11);
            System.arraycopy(this.f10136b, i11, iArr2, i11 + 1, this.f10137c - i11);
            this.f10136b = iArr2;
        }
        this.f10136b[i11] = iIntValue;
        this.f10137c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzakw.f10134a;
        collection.getClass();
        if (!(collection instanceof zzakx)) {
            return super.addAll(collection);
        }
        zzakx zzakxVar = (zzakx) collection;
        int i11 = zzakxVar.f10137c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f10137c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        int[] iArr = this.f10136b;
        if (i13 > iArr.length) {
            this.f10136b = Arrays.copyOf(iArr, i13);
        }
        System.arraycopy(zzakxVar.f10136b, 0, this.f10136b, this.f10137c, zzakxVar.f10137c);
        this.f10137c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int b(int i11) {
        e(i11);
        return this.f10136b[i11];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i11) {
        zza();
        int i12 = this.f10137c;
        int[] iArr = this.f10136b;
        if (i12 == iArr.length) {
            int[] iArr2 = new int[e0.c(iArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f10136b, 0, iArr2, 0, this.f10137c);
            this.f10136b = iArr2;
        }
        int[] iArr3 = this.f10136b;
        int i13 = this.f10137c;
        this.f10137c = i13 + 1;
        iArr3[i13] = i11;
    }

    public final void e(int i11) {
        if (i11 < 0 || i11 >= this.f10137c) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f10137c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzakx)) {
            return super.equals(obj);
        }
        zzakx zzakxVar = (zzakx) obj;
        if (this.f10137c != zzakxVar.f10137c) {
            return false;
        }
        int[] iArr = zzakxVar.f10136b;
        for (int i11 = 0; i11 < this.f10137c; i11++) {
            if (this.f10136b[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        return Integer.valueOf(b(i11));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f10137c; i12++) {
            i11 = (i11 * 31) + this.f10136b[i12];
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i11 = this.f10137c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f10136b[i12] == iIntValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i11) {
        zza();
        e(i11);
        int[] iArr = this.f10136b;
        int i12 = iArr[i11];
        int i13 = this.f10137c;
        if (i11 < i13 - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (i13 - i11) - 1);
        }
        this.f10137c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f10136b;
        System.arraycopy(iArr, i12, iArr, i11, this.f10137c - i12);
        this.f10137c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i11, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        e(i11);
        int[] iArr = this.f10136b;
        int i12 = iArr[i11];
        iArr[i11] = iIntValue;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10137c;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalb
    public final /* synthetic */ zzalb zza(int i11) {
        if (i11 >= this.f10137c) {
            return new zzakx(i11 == 0 ? f10135d : Arrays.copyOf(this.f10136b, i11), this.f10137c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzakx(int[] iArr, int i11, boolean z11) {
        super(z11);
        this.f10136b = iArr;
        this.f10137c = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
