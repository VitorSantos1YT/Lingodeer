package com.google.android.gms.internal.measurement;

import b7.e0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzafm<E> extends zzace<E> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f11320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzafm f11321e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f11322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11323c;

    static {
        Object[] objArr = new Object[0];
        f11320d = objArr;
        f11321e = new zzafm(objArr, 0, false);
    }

    public zzafm() {
        this(f11320d, 0, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        b();
        if (i11 < 0 || i11 > (i12 = this.f11323c)) {
            throw new IndexOutOfBoundsException(zzacg.a(this.f11323c, i11, (byte) 13, "Index:", ", Size:"));
        }
        int i13 = i11 + 1;
        Object[] objArr = this.f11322b;
        int length = objArr.length;
        if (i12 < length) {
            System.arraycopy(objArr, i11, objArr, i13, i12 - i11);
        } else {
            Object[] objArr2 = new Object[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11322b, 0, objArr2, 0, i11);
            System.arraycopy(this.f11322b, i11, objArr2, i13, this.f11323c - i11);
            this.f11322b = objArr2;
        }
        this.f11322b[i11] = obj;
        this.f11323c++;
        ((AbstractList) this).modCount++;
    }

    public final void d(int i11) {
        if (i11 < 0 || i11 >= this.f11323c) {
            throw new IndexOutOfBoundsException(zzacg.a(this.f11323c, i11, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i11 = this.f11323c;
        if (i11 != list.size()) {
            return false;
        }
        if (!(obj instanceof zzafm)) {
            for (int i12 = 0; i12 < i11; i12++) {
                if (!this.f11322b[i12].equals(list.get(i12))) {
                    return false;
                }
            }
            return true;
        }
        zzafm zzafmVar = (zzafm) obj;
        for (int i13 = 0; i13 < i11; i13++) {
            if (!this.f11322b[i13].equals(zzafmVar.f11322b[i13])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        d(i11);
        return this.f11322b[i11];
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = this.f11323c;
        int iHashCode = 1;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode = (iHashCode * 31) + this.f11322b[i12].hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        b();
        d(i11);
        Object[] objArr = this.f11322b;
        Object obj = objArr[i11];
        int i12 = this.f11323c;
        if (i11 < i12 - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (i12 - i11) - 1);
        }
        this.f11323c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        b();
        d(i11);
        Object[] objArr = this.f11322b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11323c;
    }

    @Override // com.google.android.gms.internal.measurement.zzaef, com.google.android.gms.internal.measurement.zzadw
    public final /* bridge */ /* synthetic */ zzaef zzg(int i11) {
        if (i11 >= this.f11323c) {
            return new zzafm(i11 == 0 ? f11320d : Arrays.copyOf(this.f11322b, i11), this.f11323c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzafm(Object[] objArr, int i11, boolean z11) {
        super(z11);
        this.f11322b = objArr;
        this.f11323c = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i11 = this.f11323c;
        int length = this.f11322b.length;
        if (i11 == length) {
            this.f11322b = Arrays.copyOf(this.f11322b, e0.c(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f11322b;
        int i12 = this.f11323c;
        this.f11323c = i12 + 1;
        objArr[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
