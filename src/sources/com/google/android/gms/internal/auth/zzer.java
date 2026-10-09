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
final class zzer extends zzdr implements RandomAccess, zzez, zzge {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f9494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9495c;

    static {
        new zzer(new float[0], 0, false);
    }

    public zzer() {
        this(new float[10], 0, true);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.f9495c)) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f9495c, ", Size:"));
        }
        float[] fArr = this.f9494b;
        if (i12 < fArr.length) {
            System.arraycopy(fArr, i11, fArr, i11 + 1, i12 - i11);
        } else {
            float[] fArr2 = new float[e.D(i12, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i11);
            System.arraycopy(this.f9494b, i11, fArr2, i11 + 1, this.f9495c - i11);
            this.f9494b = fArr2;
        }
        this.f9494b[i11] = fFloatValue;
        this.f9495c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzfa.f9501a;
        collection.getClass();
        if (!(collection instanceof zzer)) {
            return super.addAll(collection);
        }
        zzer zzerVar = (zzer) collection;
        int i11 = zzerVar.f9495c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f9495c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        float[] fArr = this.f9494b;
        if (i13 > fArr.length) {
            this.f9494b = Arrays.copyOf(fArr, i13);
        }
        System.arraycopy(zzerVar.f9494b, 0, this.f9494b, this.f9495c, zzerVar.f9495c);
        this.f9495c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(float f5) {
        zza();
        int i11 = this.f9495c;
        float[] fArr = this.f9494b;
        if (i11 == fArr.length) {
            float[] fArr2 = new float[e.D(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i11);
            this.f9494b = fArr2;
        }
        float[] fArr3 = this.f9494b;
        int i12 = this.f9495c;
        this.f9495c = i12 + 1;
        fArr3[i12] = f5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i11) {
        if (i11 < 0 || i11 >= this.f9495c) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f9495c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzer)) {
            return super.equals(obj);
        }
        zzer zzerVar = (zzer) obj;
        if (this.f9495c != zzerVar.f9495c) {
            return false;
        }
        float[] fArr = zzerVar.f9494b;
        for (int i11 = 0; i11 < this.f9495c; i11++) {
            if (Float.floatToIntBits(this.f9494b[i11]) != Float.floatToIntBits(fArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        d(i11);
        return Float.valueOf(this.f9494b[i11]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i11 = 0; i11 < this.f9495c; i11++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f9494b[i11]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i11 = this.f9495c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f9494b[i12] == fFloatValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zza();
        d(i11);
        float[] fArr = this.f9494b;
        float f5 = fArr[i11];
        int i12 = this.f9495c;
        if (i11 < i12 - 1) {
            System.arraycopy(fArr, i11 + 1, fArr, i11, (i12 - i11) - 1);
        }
        this.f9495c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f9494b;
        System.arraycopy(fArr, i12, fArr, i11, this.f9495c - i12);
        this.f9495c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        d(i11);
        float[] fArr = this.f9494b;
        float f5 = fArr[i11];
        fArr[i11] = fFloatValue;
        return Float.valueOf(f5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9495c;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i11) {
        if (i11 >= this.f9495c) {
            return new zzer(Arrays.copyOf(this.f9494b, i11), this.f9495c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzer(float[] fArr, int i11, boolean z11) {
        super(z11);
        this.f9494b = fArr;
        this.f9495c = i11;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Float) obj).floatValue());
        return true;
    }
}
