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
final class zzfm extends zzdr implements RandomAccess, zzez, zzge {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f9507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9508c;

    static {
        new zzfm(new long[0], 0, false);
    }

    public zzfm() {
        this(new long[10], 0, true);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.f9508c)) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f9508c, ", Size:"));
        }
        long[] jArr = this.f9507b;
        if (i12 < jArr.length) {
            System.arraycopy(jArr, i11, jArr, i11 + 1, i12 - i11);
        } else {
            long[] jArr2 = new long[e.D(i12, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i11);
            System.arraycopy(this.f9507b, i11, jArr2, i11 + 1, this.f9508c - i11);
            this.f9507b = jArr2;
        }
        this.f9507b[i11] = jLongValue;
        this.f9508c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzfa.f9501a;
        collection.getClass();
        if (!(collection instanceof zzfm)) {
            return super.addAll(collection);
        }
        zzfm zzfmVar = (zzfm) collection;
        int i11 = zzfmVar.f9508c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f9508c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        long[] jArr = this.f9507b;
        if (i13 > jArr.length) {
            this.f9507b = Arrays.copyOf(jArr, i13);
        }
        System.arraycopy(zzfmVar.f9507b, 0, this.f9507b, this.f9508c, zzfmVar.f9508c);
        this.f9508c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(long j11) {
        zza();
        int i11 = this.f9508c;
        long[] jArr = this.f9507b;
        if (i11 == jArr.length) {
            long[] jArr2 = new long[e.D(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i11);
            this.f9507b = jArr2;
        }
        long[] jArr3 = this.f9507b;
        int i12 = this.f9508c;
        this.f9508c = i12 + 1;
        jArr3[i12] = j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i11) {
        if (i11 < 0 || i11 >= this.f9508c) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f9508c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfm)) {
            return super.equals(obj);
        }
        zzfm zzfmVar = (zzfm) obj;
        if (this.f9508c != zzfmVar.f9508c) {
            return false;
        }
        long[] jArr = zzfmVar.f9507b;
        for (int i11 = 0; i11 < this.f9508c; i11++) {
            if (this.f9507b[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        d(i11);
        return Long.valueOf(this.f9507b[i11]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f9508c; i12++) {
            long j11 = this.f9507b[i12];
            Charset charset = zzfa.f9501a;
            i11 = (i11 * 31) + ((int) (j11 ^ (j11 >>> 32)));
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i11 = this.f9508c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f9507b[i12] == jLongValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zza();
        d(i11);
        long[] jArr = this.f9507b;
        long j11 = jArr[i11];
        int i12 = this.f9508c;
        if (i11 < i12 - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, (i12 - i11) - 1);
        }
        this.f9508c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f9507b;
        System.arraycopy(jArr, i12, jArr, i11, this.f9508c - i12);
        this.f9508c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        d(i11);
        long[] jArr = this.f9507b;
        long j11 = jArr[i11];
        jArr[i11] = jLongValue;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9508c;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i11) {
        if (i11 >= this.f9508c) {
            return new zzfm(Arrays.copyOf(this.f9507b, i11), this.f9508c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzfm(long[] jArr, int i11, boolean z11) {
        super(z11);
        this.f9507b = jArr;
        this.f9508c = i11;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Long) obj).longValue());
        return true;
    }
}
