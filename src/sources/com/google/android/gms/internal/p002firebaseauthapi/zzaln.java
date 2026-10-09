package com.google.android.gms.internal.p002firebaseauthapi;

import b7.e0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaln extends zzaiy<Long> implements zzalb<Long>, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f10149d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f10150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10151c;

    static {
        long[] jArr = new long[0];
        f10149d = jArr;
        new zzaln(jArr, 0, false);
    }

    public zzaln() {
        this(f10149d, 0, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.f10151c)) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f10151c, ", Size:"));
        }
        long[] jArr = this.f10150b;
        if (i12 < jArr.length) {
            System.arraycopy(jArr, i11, jArr, i11 + 1, i12 - i11);
        } else {
            long[] jArr2 = new long[e0.c(jArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f10150b, 0, jArr2, 0, i11);
            System.arraycopy(this.f10150b, i11, jArr2, i11 + 1, this.f10151c - i11);
            this.f10150b = jArr2;
        }
        this.f10150b[i11] = jLongValue;
        this.f10151c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzakw.f10134a;
        collection.getClass();
        if (!(collection instanceof zzaln)) {
            return super.addAll(collection);
        }
        zzaln zzalnVar = (zzaln) collection;
        int i11 = zzalnVar.f10151c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f10151c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        long[] jArr = this.f10150b;
        if (i13 > jArr.length) {
            this.f10150b = Arrays.copyOf(jArr, i13);
        }
        System.arraycopy(zzalnVar.f10150b, 0, this.f10150b, this.f10151c, zzalnVar.f10151c);
        this.f10151c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(long j11) {
        zza();
        int i11 = this.f10151c;
        long[] jArr = this.f10150b;
        if (i11 == jArr.length) {
            long[] jArr2 = new long[e0.c(jArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f10150b, 0, jArr2, 0, this.f10151c);
            this.f10150b = jArr2;
        }
        long[] jArr3 = this.f10150b;
        int i12 = this.f10151c;
        this.f10151c = i12 + 1;
        jArr3[i12] = j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long d(int i11) {
        e(i11);
        return this.f10150b[i11];
    }

    public final void e(int i11) {
        if (i11 < 0 || i11 >= this.f10151c) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f10151c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaln)) {
            return super.equals(obj);
        }
        zzaln zzalnVar = (zzaln) obj;
        if (this.f10151c != zzalnVar.f10151c) {
            return false;
        }
        long[] jArr = zzalnVar.f10150b;
        for (int i11 = 0; i11 < this.f10151c; i11++) {
            if (this.f10150b[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        return Long.valueOf(d(i11));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i11 = 0; i11 < this.f10151c; i11++) {
            iB = (iB * 31) + zzakw.b(this.f10150b[i11]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i11 = this.f10151c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f10150b[i12] == jLongValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i11) {
        zza();
        e(i11);
        long[] jArr = this.f10150b;
        long j11 = jArr[i11];
        int i12 = this.f10151c;
        if (i11 < i12 - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, (i12 - i11) - 1);
        }
        this.f10151c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f10150b;
        System.arraycopy(jArr, i12, jArr, i11, this.f10151c - i12);
        this.f10151c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i11, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        e(i11);
        long[] jArr = this.f10150b;
        long j11 = jArr[i11];
        jArr[i11] = jLongValue;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10151c;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalb
    public final /* synthetic */ zzalb zza(int i11) {
        if (i11 >= this.f10151c) {
            return new zzaln(i11 == 0 ? f10149d : Arrays.copyOf(this.f10150b, i11), this.f10151c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzaln(long[] jArr, int i11, boolean z11) {
        super(z11);
        this.f10150b = jArr;
        this.f10151c = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        b(((Long) obj).longValue());
        return true;
    }
}
