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
final class zzfb extends zzdu implements RandomAccess, zzfn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f12373d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f12374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12375c;

    static {
        float[] fArr = new float[0];
        f12373d = fArr;
        new zzfb(fArr, 0, false);
    }

    public zzfb() {
        this(f12373d, 0, true);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.f12375c)) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f12375c, ", Size:"));
        }
        int i13 = i11 + 1;
        float[] fArr = this.f12374b;
        int length = fArr.length;
        if (i12 < length) {
            System.arraycopy(fArr, i11, fArr, i13, i12 - i11);
        } else {
            float[] fArr2 = new float[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f12374b, 0, fArr2, 0, i11);
            System.arraycopy(this.f12374b, i11, fArr2, i13, this.f12375c - i11);
            this.f12374b = fArr2;
        }
        this.f12374b[i11] = fFloatValue;
        this.f12375c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzfo.f12383a;
        collection.getClass();
        if (!(collection instanceof zzfb)) {
            return super.addAll(collection);
        }
        zzfb zzfbVar = (zzfb) collection;
        int i11 = zzfbVar.f12375c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f12375c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        float[] fArr = this.f12374b;
        if (i13 > fArr.length) {
            this.f12374b = Arrays.copyOf(fArr, i13);
        }
        System.arraycopy(zzfbVar.f12374b, 0, this.f12374b, this.f12375c, zzfbVar.f12375c);
        this.f12375c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(float f5) {
        zza();
        int i11 = this.f12375c;
        int length = this.f12374b.length;
        if (i11 == length) {
            float[] fArr = new float[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f12374b, 0, fArr, 0, this.f12375c);
            this.f12374b = fArr;
        }
        float[] fArr2 = this.f12374b;
        int i12 = this.f12375c;
        this.f12375c = i12 + 1;
        fArr2[i12] = f5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i11) {
        if (i11 < 0 || i11 >= this.f12375c) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f12375c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfb)) {
            return super.equals(obj);
        }
        zzfb zzfbVar = (zzfb) obj;
        if (this.f12375c != zzfbVar.f12375c) {
            return false;
        }
        float[] fArr = zzfbVar.f12374b;
        for (int i11 = 0; i11 < this.f12375c; i11++) {
            if (Float.floatToIntBits(this.f12374b[i11]) != Float.floatToIntBits(fArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        d(i11);
        return Float.valueOf(this.f12374b[i11]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i11 = 0; i11 < this.f12375c; i11++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f12374b[i11]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i11 = this.f12375c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f12374b[i12] == fFloatValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zza();
        d(i11);
        float[] fArr = this.f12374b;
        float f5 = fArr[i11];
        int i12 = this.f12375c;
        if (i11 < i12 - 1) {
            System.arraycopy(fArr, i11 + 1, fArr, i11, (i12 - i11) - 1);
        }
        this.f12375c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f12374b;
        System.arraycopy(fArr, i12, fArr, i11, this.f12375c - i12);
        this.f12375c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        d(i11);
        float[] fArr = this.f12374b;
        float f5 = fArr[i11];
        fArr[i11] = fFloatValue;
        return Float.valueOf(f5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12375c;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfn
    public final /* bridge */ /* synthetic */ zzfn zzd(int i11) {
        if (i11 >= this.f12375c) {
            return new zzfb(i11 == 0 ? f12373d : Arrays.copyOf(this.f12374b, i11), this.f12375c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzfb(float[] fArr, int i11, boolean z11) {
        super(z11);
        this.f12374b = fArr;
        this.f12375c = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Float) obj).floatValue());
        return true;
    }
}
