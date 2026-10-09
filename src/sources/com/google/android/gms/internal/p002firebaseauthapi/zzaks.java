package com.google.android.gms.internal.p002firebaseauthapi;

import b7.e0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaks extends zzaiy<Float> implements zzalb<Float>, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f10127d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f10128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10129c;

    static {
        float[] fArr = new float[0];
        f10127d = fArr;
        new zzaks(fArr, 0, false);
    }

    public zzaks() {
        this(f10127d, 0, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.f10129c)) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f10129c, ", Size:"));
        }
        float[] fArr = this.f10128b;
        if (i12 < fArr.length) {
            System.arraycopy(fArr, i11, fArr, i11 + 1, i12 - i11);
        } else {
            float[] fArr2 = new float[e0.c(fArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f10128b, 0, fArr2, 0, i11);
            System.arraycopy(this.f10128b, i11, fArr2, i11 + 1, this.f10129c - i11);
            this.f10128b = fArr2;
        }
        this.f10128b[i11] = fFloatValue;
        this.f10129c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzakw.f10134a;
        collection.getClass();
        if (!(collection instanceof zzaks)) {
            return super.addAll(collection);
        }
        zzaks zzaksVar = (zzaks) collection;
        int i11 = zzaksVar.f10129c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f10129c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        float[] fArr = this.f10128b;
        if (i13 > fArr.length) {
            this.f10128b = Arrays.copyOf(fArr, i13);
        }
        System.arraycopy(zzaksVar.f10128b, 0, this.f10128b, this.f10129c, zzaksVar.f10129c);
        this.f10129c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(float f5) {
        zza();
        int i11 = this.f10129c;
        float[] fArr = this.f10128b;
        if (i11 == fArr.length) {
            float[] fArr2 = new float[e0.c(fArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f10128b, 0, fArr2, 0, this.f10129c);
            this.f10128b = fArr2;
        }
        float[] fArr3 = this.f10128b;
        int i12 = this.f10129c;
        this.f10129c = i12 + 1;
        fArr3[i12] = f5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i11) {
        if (i11 < 0 || i11 >= this.f10129c) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f10129c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaks)) {
            return super.equals(obj);
        }
        zzaks zzaksVar = (zzaks) obj;
        if (this.f10129c != zzaksVar.f10129c) {
            return false;
        }
        float[] fArr = zzaksVar.f10128b;
        for (int i11 = 0; i11 < this.f10129c; i11++) {
            if (Float.floatToIntBits(this.f10128b[i11]) != Float.floatToIntBits(fArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        d(i11);
        return Float.valueOf(this.f10128b[i11]);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i11 = 0; i11 < this.f10129c; i11++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f10128b[i11]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i11 = this.f10129c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f10128b[i12] == fFloatValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i11) {
        zza();
        d(i11);
        float[] fArr = this.f10128b;
        float f5 = fArr[i11];
        int i12 = this.f10129c;
        if (i11 < i12 - 1) {
            System.arraycopy(fArr, i11 + 1, fArr, i11, (i12 - i11) - 1);
        }
        this.f10129c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f10128b;
        System.arraycopy(fArr, i12, fArr, i11, this.f10129c - i12);
        this.f10129c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i11, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        d(i11);
        float[] fArr = this.f10128b;
        float f5 = fArr[i11];
        fArr[i11] = fFloatValue;
        return Float.valueOf(f5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10129c;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalb
    public final /* synthetic */ zzalb zza(int i11) {
        if (i11 >= this.f10129c) {
            return new zzaks(i11 == 0 ? f10127d : Arrays.copyOf(this.f10128b, i11), this.f10129c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzaks(float[] fArr, int i11, boolean z11) {
        super(z11);
        this.f10128b = fArr;
        this.f10129c = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        b(((Float) obj).floatValue());
        return true;
    }
}
