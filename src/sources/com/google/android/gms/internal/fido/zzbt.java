package com.google.android.gms.internal.fido;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzbt extends zzbc {
    public static final Object[] H;
    public static final zzbt K;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f9668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f9669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f9670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f9671f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient int f9672t;

    static {
        Object[] objArr = new Object[0];
        H = objArr;
        K = new zzbt(0, 0, 0, objArr, objArr);
    }

    public zzbt(int i11, int i12, int i13, Object[] objArr, Object[] objArr2) {
        this.f9668c = objArr;
        this.f9669d = i11;
        this.f9670e = objArr2;
        this.f9671f = i12;
        this.f9672t = i13;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f9668c;
        int i11 = this.f9672t;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f9670e;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i11 = iRotateLeft & this.f9671f;
            Object obj2 = objArr[i11];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i11 + 1;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final int d() {
        return this.f9672t;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    /* JADX INFO: renamed from: f */
    public final zzcb iterator() {
        return l().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final Object[] g() {
        return this.f9668c;
    }

    @Override // com.google.android.gms.internal.fido.zzbc, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f9669d;
    }

    @Override // com.google.android.gms.internal.fido.zzbc, com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return l().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzbc
    public final zzaz m() {
        zzcc zzccVar = zzaz.f9651b;
        int i11 = this.f9672t;
        return i11 == 0 ? zzbs.f9665e : new zzbs(i11, this.f9668c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9672t;
    }
}
