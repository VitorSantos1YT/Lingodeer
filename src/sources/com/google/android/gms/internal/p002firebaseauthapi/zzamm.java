package com.google.android.gms.internal.p002firebaseauthapi;

import b7.e0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzamm<E> extends zzaiy<E> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f10183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzamm f10184e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f10185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10186c;

    static {
        Object[] objArr = new Object[0];
        f10183d = objArr;
        f10184e = new zzamm(objArr, 0, false);
    }

    public zzamm() {
        this(f10183d, 0, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        zza();
        if (i11 < 0 || i11 > (i12 = this.f10186c)) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f10186c, ", Size:"));
        }
        Object[] objArr = this.f10185b;
        if (i12 < objArr.length) {
            System.arraycopy(objArr, i11, objArr, i11 + 1, i12 - i11);
        } else {
            Object[] objArr2 = new Object[e0.c(objArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f10185b, 0, objArr2, 0, i11);
            System.arraycopy(this.f10185b, i11, objArr2, i11 + 1, this.f10186c - i11);
            this.f10185b = objArr2;
        }
        this.f10185b[i11] = obj;
        this.f10186c++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i11) {
        if (i11 < 0 || i11 >= this.f10186c) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f10186c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.Collection, java.util.List
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
        int i11 = this.f10186c;
        if (i11 != list.size()) {
            return false;
        }
        if (!(obj instanceof zzamm)) {
            for (int i12 = 0; i12 < i11; i12++) {
                if (!this.f10185b[i12].equals(list.get(i12))) {
                    return false;
                }
            }
            return true;
        }
        zzamm zzammVar = (zzamm) obj;
        for (int i13 = 0; i13 < i11; i13++) {
            if (!this.f10185b[i13].equals(zzammVar.f10185b[i13])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        b(i11);
        return this.f10185b[i11];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = this.f10186c;
        int iHashCode = 1;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode = (iHashCode * 31) + this.f10185b[i12].hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        zza();
        b(i11);
        Object[] objArr = this.f10185b;
        Object obj = objArr[i11];
        int i12 = this.f10186c;
        if (i11 < i12 - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (i12 - i11) - 1);
        }
        this.f10186c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        zza();
        b(i11);
        Object[] objArr = this.f10185b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10186c;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalb
    public final /* synthetic */ zzalb zza(int i11) {
        if (i11 >= this.f10186c) {
            return new zzamm(i11 == 0 ? f10183d : Arrays.copyOf(this.f10185b, i11), this.f10186c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzamm(Object[] objArr, int i11, boolean z11) {
        super(z11);
        this.f10185b = objArr;
        this.f10186c = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i11 = this.f10186c;
        Object[] objArr = this.f10185b;
        if (i11 == objArr.length) {
            this.f10185b = Arrays.copyOf(this.f10185b, e0.c(objArr.length, 3, 2, 1, 10));
        }
        Object[] objArr2 = this.f10185b;
        int i12 = this.f10186c;
        this.f10186c = i12 + 1;
        objArr2[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
