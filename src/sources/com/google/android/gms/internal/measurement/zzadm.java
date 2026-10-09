package com.google.android.gms.internal.measurement;

import b7.e0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzadm extends zzace implements RandomAccess, zzaea, zzafk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f11261d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f11262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11263c;

    static {
        float[] fArr = new float[0];
        f11261d = fArr;
        new zzadm(fArr, 0, false);
    }

    public zzadm() {
        this(f11261d, 0, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        float fFloatValue = ((Float) obj).floatValue();
        b();
        if (i11 < 0 || i11 > (i12 = this.f11263c)) {
            throw new IndexOutOfBoundsException(zzacg.a(this.f11263c, i11, (byte) 13, "Index:", ", Size:"));
        }
        int i13 = i11 + 1;
        float[] fArr = this.f11262b;
        int length = fArr.length;
        if (i12 < length) {
            System.arraycopy(fArr, i11, fArr, i13, i12 - i11);
        } else {
            float[] fArr2 = new float[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11262b, 0, fArr2, 0, i11);
            System.arraycopy(this.f11262b, i11, fArr2, i13, this.f11263c - i11);
            this.f11262b = fArr2;
        }
        this.f11262b[i11] = fFloatValue;
        this.f11263c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        collection.getClass();
        if (!(collection instanceof zzadm)) {
            return super.addAll(collection);
        }
        zzadm zzadmVar = (zzadm) collection;
        int i11 = zzadmVar.f11263c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f11263c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        float[] fArr = this.f11262b;
        if (i13 > fArr.length) {
            this.f11262b = Arrays.copyOf(fArr, i13);
        }
        System.arraycopy(zzadmVar.f11262b, 0, this.f11262b, this.f11263c, zzadmVar.f11263c);
        this.f11263c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(float f5) {
        b();
        int i11 = this.f11263c;
        int length = this.f11262b.length;
        if (i11 == length) {
            float[] fArr = new float[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11262b, 0, fArr, 0, this.f11263c);
            this.f11262b = fArr;
        }
        float[] fArr2 = this.f11262b;
        int i12 = this.f11263c;
        this.f11263c = i12 + 1;
        fArr2[i12] = f5;
    }

    public final void e(int i11) {
        if (i11 < 0 || i11 >= this.f11263c) {
            throw new IndexOutOfBoundsException(zzacg.a(this.f11263c, i11, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzadm)) {
            return super.equals(obj);
        }
        zzadm zzadmVar = (zzadm) obj;
        if (this.f11263c != zzadmVar.f11263c) {
            return false;
        }
        float[] fArr = zzadmVar.f11262b;
        for (int i11 = 0; i11 < this.f11263c; i11++) {
            if (Float.floatToIntBits(this.f11262b[i11]) != Float.floatToIntBits(fArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        e(i11);
        return Float.valueOf(this.f11262b[i11]);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i11 = 0; i11 < this.f11263c; i11++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f11262b[i11]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i11 = this.f11263c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f11262b[i12] == fFloatValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        b();
        e(i11);
        float[] fArr = this.f11262b;
        float f5 = fArr[i11];
        int i12 = this.f11263c;
        if (i11 < i12 - 1) {
            System.arraycopy(fArr, i11 + 1, fArr, i11, (i12 - i11) - 1);
        }
        this.f11263c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        b();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f11262b;
        System.arraycopy(fArr, i12, fArr, i11, this.f11263c - i12);
        this.f11263c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        b();
        e(i11);
        float[] fArr = this.f11262b;
        float f5 = fArr[i11];
        fArr[i11] = fFloatValue;
        return Float.valueOf(f5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11263c;
    }

    @Override // com.google.android.gms.internal.measurement.zzaef, com.google.android.gms.internal.measurement.zzadw
    /* JADX INFO: renamed from: zzd */
    public final zzaea zzg(int i11) {
        if (i11 >= this.f11263c) {
            return new zzadm(i11 == 0 ? f11261d : Arrays.copyOf(this.f11262b, i11), this.f11263c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzadm(float[] fArr, int i11, boolean z11) {
        super(z11);
        this.f11262b = fArr;
        this.f11263c = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Float) obj).floatValue());
        return true;
    }
}
