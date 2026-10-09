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
final class zzdy extends zzdu implements RandomAccess, zzfn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean[] f12339d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f12340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12341c;

    static {
        boolean[] zArr = new boolean[0];
        f12339d = zArr;
        new zzdy(zArr, 0, false);
    }

    public zzdy() {
        this(f12339d, 0, true);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.f12341c)) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f12341c, ", Size:"));
        }
        int i13 = i11 + 1;
        boolean[] zArr = this.f12340b;
        int length = zArr.length;
        if (i12 < length) {
            System.arraycopy(zArr, i11, zArr, i13, i12 - i11);
        } else {
            boolean[] zArr2 = new boolean[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f12340b, 0, zArr2, 0, i11);
            System.arraycopy(this.f12340b, i11, zArr2, i13, this.f12341c - i11);
            this.f12340b = zArr2;
        }
        this.f12340b[i11] = zBooleanValue;
        this.f12341c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzfo.f12383a;
        collection.getClass();
        if (!(collection instanceof zzdy)) {
            return super.addAll(collection);
        }
        zzdy zzdyVar = (zzdy) collection;
        int i11 = zzdyVar.f12341c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f12341c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        boolean[] zArr = this.f12340b;
        if (i13 > zArr.length) {
            this.f12340b = Arrays.copyOf(zArr, i13);
        }
        System.arraycopy(zzdyVar.f12340b, 0, this.f12340b, this.f12341c, zzdyVar.f12341c);
        this.f12341c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(boolean z11) {
        zza();
        int i11 = this.f12341c;
        int length = this.f12340b.length;
        if (i11 == length) {
            boolean[] zArr = new boolean[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f12340b, 0, zArr, 0, this.f12341c);
            this.f12340b = zArr;
        }
        boolean[] zArr2 = this.f12340b;
        int i12 = this.f12341c;
        this.f12341c = i12 + 1;
        zArr2[i12] = z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i11) {
        if (i11 < 0 || i11 >= this.f12341c) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f12341c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdy)) {
            return super.equals(obj);
        }
        zzdy zzdyVar = (zzdy) obj;
        if (this.f12341c != zzdyVar.f12341c) {
            return false;
        }
        boolean[] zArr = zzdyVar.f12340b;
        for (int i11 = 0; i11 < this.f12341c; i11++) {
            if (this.f12340b[i11] != zArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        d(i11);
        return Boolean.valueOf(this.f12340b[i11]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f12341c; i12++) {
            int i13 = i11 * 31;
            boolean z11 = this.f12340b[i12];
            Charset charset = zzfo.f12383a;
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
        int i11 = this.f12341c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f12340b[i12] == zBooleanValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zza();
        d(i11);
        boolean[] zArr = this.f12340b;
        boolean z11 = zArr[i11];
        int i12 = this.f12341c;
        if (i11 < i12 - 1) {
            System.arraycopy(zArr, i11 + 1, zArr, i11, (i12 - i11) - 1);
        }
        this.f12341c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f12340b;
        System.arraycopy(zArr, i12, zArr, i11, this.f12341c - i12);
        this.f12341c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        d(i11);
        boolean[] zArr = this.f12340b;
        boolean z11 = zArr[i11];
        zArr[i11] = zBooleanValue;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12341c;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfn
    public final /* bridge */ /* synthetic */ zzfn zzd(int i11) {
        if (i11 >= this.f12341c) {
            return new zzdy(i11 == 0 ? f12339d : Arrays.copyOf(this.f12340b, i11), this.f12341c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzdy(boolean[] zArr, int i11, boolean z11) {
        super(z11);
        this.f12340b = zArr;
        this.f12341c = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Boolean) obj).booleanValue());
        return true;
    }
}
