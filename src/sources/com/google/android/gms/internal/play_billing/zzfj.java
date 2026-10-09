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
final class zzfj extends zzdu implements RandomAccess, zzfm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f12379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzfj f12380e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f12381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12382c;

    static {
        int[] iArr = new int[0];
        f12379d = iArr;
        f12380e = new zzfj(iArr, 0, false);
    }

    public zzfj() {
        this(f12379d, 0, true);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        int iIntValue = ((Integer) obj).intValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.f12382c)) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f12382c, ", Size:"));
        }
        int i13 = i11 + 1;
        int[] iArr = this.f12381b;
        int length = iArr.length;
        if (i12 < length) {
            System.arraycopy(iArr, i11, iArr, i13, i12 - i11);
        } else {
            int[] iArr2 = new int[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f12381b, 0, iArr2, 0, i11);
            System.arraycopy(this.f12381b, i11, iArr2, i13, this.f12382c - i11);
            this.f12381b = iArr2;
        }
        this.f12381b[i11] = iIntValue;
        this.f12382c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzfo.f12383a;
        collection.getClass();
        if (!(collection instanceof zzfj)) {
            return super.addAll(collection);
        }
        zzfj zzfjVar = (zzfj) collection;
        int i11 = zzfjVar.f12382c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f12382c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        int[] iArr = this.f12381b;
        if (i13 > iArr.length) {
            this.f12381b = Arrays.copyOf(iArr, i13);
        }
        System.arraycopy(zzfjVar.f12381b, 0, this.f12381b, this.f12382c, zzfjVar.f12382c);
        this.f12382c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int b(int i11) {
        e(i11);
        return this.f12381b[i11];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i11) {
        zza();
        int i12 = this.f12382c;
        int length = this.f12381b.length;
        if (i12 == length) {
            int[] iArr = new int[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f12381b, 0, iArr, 0, this.f12382c);
            this.f12381b = iArr;
        }
        int[] iArr2 = this.f12381b;
        int i13 = this.f12382c;
        this.f12382c = i13 + 1;
        iArr2[i13] = i11;
    }

    public final void e(int i11) {
        if (i11 < 0 || i11 >= this.f12382c) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f12382c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfj)) {
            return super.equals(obj);
        }
        zzfj zzfjVar = (zzfj) obj;
        if (this.f12382c != zzfjVar.f12382c) {
            return false;
        }
        int[] iArr = zzfjVar.f12381b;
        for (int i11 = 0; i11 < this.f12382c; i11++) {
            if (this.f12381b[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        e(i11);
        return Integer.valueOf(this.f12381b[i11]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f12382c; i12++) {
            i11 = (i11 * 31) + this.f12381b[i12];
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i11 = this.f12382c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f12381b[i12] == iIntValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zza();
        e(i11);
        int[] iArr = this.f12381b;
        int i12 = iArr[i11];
        int i13 = this.f12382c;
        if (i11 < i13 - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (i13 - i11) - 1);
        }
        this.f12382c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f12381b;
        System.arraycopy(iArr, i12, iArr, i11, this.f12382c - i12);
        this.f12382c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        e(i11);
        int[] iArr = this.f12381b;
        int i12 = iArr[i11];
        iArr[i11] = iIntValue;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12382c;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfn
    public final /* bridge */ /* synthetic */ zzfn zzd(int i11) {
        if (i11 >= this.f12382c) {
            return new zzfj(i11 == 0 ? f12379d : Arrays.copyOf(this.f12381b, i11), this.f12382c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzfj(int[] iArr, int i11, boolean z11) {
        super(z11);
        this.f12381b = iArr;
        this.f12382c = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
