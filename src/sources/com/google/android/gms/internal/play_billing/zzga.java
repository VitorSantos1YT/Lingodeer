package com.google.android.gms.internal.play_billing;

import am.rVFB.LwKl;
import b7.e0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzga extends zzdu implements RandomAccess, zzfn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f12391d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f12392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12393c;

    static {
        long[] jArr = new long[0];
        f12391d = jArr;
        new zzga(jArr, 0, false);
    }

    public zzga() {
        this(f12391d, 0, true);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.f12393c)) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f12393c, ", Size:"));
        }
        int i13 = i11 + 1;
        long[] jArr = this.f12392b;
        int length = jArr.length;
        if (i12 < length) {
            System.arraycopy(jArr, i11, jArr, i13, i12 - i11);
        } else {
            long[] jArr2 = new long[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f12392b, 0, jArr2, 0, i11);
            System.arraycopy(this.f12392b, i11, jArr2, i13, this.f12393c - i11);
            this.f12392b = jArr2;
        }
        this.f12392b[i11] = jLongValue;
        this.f12393c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzfo.f12383a;
        collection.getClass();
        if (!(collection instanceof zzga)) {
            return super.addAll(collection);
        }
        zzga zzgaVar = (zzga) collection;
        int i11 = zzgaVar.f12393c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f12393c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        long[] jArr = this.f12392b;
        if (i13 > jArr.length) {
            this.f12392b = Arrays.copyOf(jArr, i13);
        }
        System.arraycopy(zzgaVar.f12392b, 0, this.f12392b, this.f12393c, zzgaVar.f12393c);
        this.f12393c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long b(int i11) {
        e(i11);
        return this.f12392b[i11];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j11) {
        zza();
        int i11 = this.f12393c;
        int length = this.f12392b.length;
        if (i11 == length) {
            long[] jArr = new long[e0.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f12392b, 0, jArr, 0, this.f12393c);
            this.f12392b = jArr;
        }
        long[] jArr2 = this.f12392b;
        int i12 = this.f12393c;
        this.f12393c = i12 + 1;
        jArr2[i12] = j11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzga)) {
            return super.equals(obj);
        }
        zzga zzgaVar = (zzga) obj;
        if (this.f12393c != zzgaVar.f12393c) {
            return false;
        }
        long[] jArr = zzgaVar.f12392b;
        for (int i11 = 0; i11 < this.f12393c; i11++) {
            if (this.f12392b[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        e(i11);
        return Long.valueOf(this.f12392b[i11]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f12393c; i12++) {
            long j11 = this.f12392b[i12];
            Charset charset = zzfo.f12383a;
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
        int i11 = this.f12393c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f12392b[i12] == jLongValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zza();
        e(i11);
        long[] jArr = this.f12392b;
        long j11 = jArr[i11];
        int i12 = this.f12393c;
        if (i11 < i12 - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, (i12 - i11) - 1);
        }
        this.f12393c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f12392b;
        System.arraycopy(jArr, i12, jArr, i11, this.f12393c - i12);
        this.f12393c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        e(i11);
        long[] jArr = this.f12392b;
        long j11 = jArr[i11];
        jArr[i11] = jLongValue;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12393c;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfn
    public final /* bridge */ /* synthetic */ zzfn zzd(int i11) {
        if (i11 >= this.f12393c) {
            return new zzga(i11 == 0 ? f12391d : Arrays.copyOf(this.f12392b, i11), this.f12393c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzga(long[] jArr, int i11, boolean z11) {
        super(z11);
        this.f12392b = jArr;
        this.f12393c = i11;
    }

    public final void e(int i11) {
        if (i11 < 0 || i11 >= this.f12393c) {
            throw new IndexOutOfBoundsException(p.p(LwKl.xAakIPLbGzODEX, i11, this.f12393c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
