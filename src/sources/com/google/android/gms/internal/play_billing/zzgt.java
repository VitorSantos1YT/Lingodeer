package com.google.android.gms.internal.play_billing;

import b7.e0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgt extends zzdu implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f12421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzgt f12422e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f12423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12424c;

    static {
        Object[] objArr = new Object[0];
        f12421d = objArr;
        f12422e = new zzgt(objArr, 0, false);
    }

    public zzgt() {
        this(f12421d, 0, true);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        zza();
        if (i11 < 0 || i11 > (i12 = this.f12424c)) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f12424c, ", Size:"));
        }
        int i13 = i11 + 1;
        Object[] objArr = this.f12423b;
        int length = objArr.length;
        if (i12 < length) {
            System.arraycopy(objArr, i11, objArr, i13, i12 - i11);
        } else {
            Object[] objArr2 = new Object[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f12423b, 0, objArr2, 0, i11);
            System.arraycopy(this.f12423b, i11, objArr2, i13, this.f12424c - i11);
            this.f12423b = objArr2;
        }
        this.f12423b[i11] = obj;
        this.f12424c++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i11) {
        if (i11 < 0 || i11 >= this.f12424c) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f12424c, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        b(i11);
        return this.f12423b[i11];
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        zza();
        b(i11);
        Object[] objArr = this.f12423b;
        Object obj = objArr[i11];
        int i12 = this.f12424c;
        if (i11 < i12 - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (i12 - i11) - 1);
        }
        this.f12424c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        zza();
        b(i11);
        Object[] objArr = this.f12423b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12424c;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfn
    public final /* bridge */ /* synthetic */ zzfn zzd(int i11) {
        if (i11 >= this.f12424c) {
            return new zzgt(i11 == 0 ? f12421d : Arrays.copyOf(this.f12423b, i11), this.f12424c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzgt(Object[] objArr, int i11, boolean z11) {
        super(z11);
        this.f12423b = objArr;
        this.f12424c = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i11 = this.f12424c;
        int length = this.f12423b.length;
        if (i11 == length) {
            this.f12423b = Arrays.copyOf(this.f12423b, e0.c(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f12423b;
        int i12 = this.f12424c;
        this.f12424c = i12 + 1;
        objArr[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
