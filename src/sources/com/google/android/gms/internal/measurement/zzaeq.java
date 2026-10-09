package com.google.android.gms.internal.measurement;

import b7.e0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaeq extends zzace implements RandomAccess, zzaee, zzafk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f11283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzaeq f11284e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f11285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11286c;

    static {
        long[] jArr = new long[0];
        f11283d = jArr;
        f11284e = new zzaeq(jArr, 0, false);
    }

    public zzaeq() {
        this(f11283d, 0, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i11 < 0 || i11 > (i12 = this.f11286c)) {
            throw new IndexOutOfBoundsException(zzacg.a(this.f11286c, i11, (byte) 13, "Index:", ", Size:"));
        }
        int i13 = i11 + 1;
        long[] jArr = this.f11285b;
        int length = jArr.length;
        if (i12 < length) {
            System.arraycopy(jArr, i11, jArr, i13, i12 - i11);
        } else {
            long[] jArr2 = new long[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11285b, 0, jArr2, 0, i11);
            System.arraycopy(this.f11285b, i11, jArr2, i13, this.f11286c - i11);
            this.f11285b = jArr2;
        }
        this.f11285b[i11] = jLongValue;
        this.f11286c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        collection.getClass();
        if (!(collection instanceof zzaeq)) {
            return super.addAll(collection);
        }
        zzaeq zzaeqVar = (zzaeq) collection;
        int i11 = zzaeqVar.f11286c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f11286c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        long[] jArr = this.f11285b;
        if (i13 > jArr.length) {
            this.f11285b = Arrays.copyOf(jArr, i13);
        }
        System.arraycopy(zzaeqVar.f11285b, 0, this.f11285b, this.f11286c, zzaeqVar.f11286c);
        this.f11286c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j11) {
        b();
        int i11 = this.f11286c;
        int length = this.f11285b.length;
        if (i11 == length) {
            long[] jArr = new long[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11285b, 0, jArr, 0, this.f11286c);
            this.f11285b = jArr;
        }
        long[] jArr2 = this.f11285b;
        int i12 = this.f11286c;
        this.f11286c = i12 + 1;
        jArr2[i12] = j11;
    }

    public final void e(int i11) {
        if (i11 < 0 || i11 >= this.f11286c) {
            throw new IndexOutOfBoundsException(zzacg.a(this.f11286c, i11, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaeq)) {
            return super.equals(obj);
        }
        zzaeq zzaeqVar = (zzaeq) obj;
        if (this.f11286c != zzaeqVar.f11286c) {
            return false;
        }
        long[] jArr = zzaeqVar.f11285b;
        for (int i11 = 0; i11 < this.f11286c; i11++) {
            if (this.f11285b[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        e(i11);
        return Long.valueOf(this.f11285b[i11]);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f11286c; i12++) {
            long j11 = this.f11285b[i12];
            byte[] bArr = zzaed.f11274a;
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
        int i11 = this.f11286c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f11285b[i12] == jLongValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzaee
    public final long p(int i11) {
        e(i11);
        return this.f11285b[i11];
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        b();
        e(i11);
        long[] jArr = this.f11285b;
        long j11 = jArr[i11];
        int i12 = this.f11286c;
        if (i11 < i12 - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, (i12 - i11) - 1);
        }
        this.f11286c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        b();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f11285b;
        System.arraycopy(jArr, i12, jArr, i11, this.f11286c - i12);
        this.f11286c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        e(i11);
        long[] jArr = this.f11285b;
        long j11 = jArr[i11];
        jArr[i11] = jLongValue;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11286c;
    }

    @Override // com.google.android.gms.internal.measurement.zzaef, com.google.android.gms.internal.measurement.zzadw
    /* JADX INFO: renamed from: zzd */
    public final zzaee zzg(int i11) {
        if (i11 >= this.f11286c) {
            return new zzaeq(i11 == 0 ? f11283d : Arrays.copyOf(this.f11285b, i11), this.f11286c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzaeq(long[] jArr, int i11, boolean z11) {
        super(z11);
        this.f11285b = jArr;
        this.f11286c = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
