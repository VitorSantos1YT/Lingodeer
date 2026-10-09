package com.google.android.gms.internal.auth;

import defpackage.e;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzgg extends zzdr implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzgg f9535d = new zzgg(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f9536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9537c;

    public zzgg() {
        this(new Object[10], 0, true);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        zza();
        if (i11 < 0 || i11 > (i12 = this.f9537c)) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f9537c, ", Size:"));
        }
        Object[] objArr = this.f9536b;
        if (i12 < objArr.length) {
            System.arraycopy(objArr, i11, objArr, i11 + 1, i12 - i11);
        } else {
            Object[] objArr2 = new Object[e.D(i12, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i11);
            System.arraycopy(this.f9536b, i11, objArr2, i11 + 1, this.f9537c - i11);
            this.f9536b = objArr2;
        }
        this.f9536b[i11] = obj;
        this.f9537c++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i11) {
        if (i11 < 0 || i11 >= this.f9537c) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f9537c, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        b(i11);
        return this.f9536b[i11];
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        zza();
        b(i11);
        Object[] objArr = this.f9536b;
        Object obj = objArr[i11];
        int i12 = this.f9537c;
        if (i11 < i12 - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (i12 - i11) - 1);
        }
        this.f9537c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        zza();
        b(i11);
        Object[] objArr = this.f9536b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9537c;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i11) {
        if (i11 >= this.f9537c) {
            return new zzgg(Arrays.copyOf(this.f9536b, i11), this.f9537c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzgg(Object[] objArr, int i11, boolean z11) {
        super(z11);
        this.f9536b = objArr;
        this.f9537c = i11;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i11 = this.f9537c;
        Object[] objArr = this.f9536b;
        if (i11 == objArr.length) {
            this.f9536b = Arrays.copyOf(objArr, ((i11 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f9536b;
        int i12 = this.f9537c;
        this.f9537c = i12 + 1;
        objArr2[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
