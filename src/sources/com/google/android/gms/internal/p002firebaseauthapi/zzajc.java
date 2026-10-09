package com.google.android.gms.internal.p002firebaseauthapi;

import b7.e0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzajc extends zzaiy<Boolean> implements zzalb<Boolean>, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean[] f10058d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f10059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10060c;

    static {
        boolean[] zArr = new boolean[0];
        f10058d = zArr;
        new zzajc(zArr, 0, false);
    }

    public zzajc() {
        this(f10058d, 0, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.f10060c)) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f10060c, ", Size:"));
        }
        boolean[] zArr = this.f10059b;
        if (i12 < zArr.length) {
            System.arraycopy(zArr, i11, zArr, i11 + 1, i12 - i11);
        } else {
            boolean[] zArr2 = new boolean[e0.c(zArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f10059b, 0, zArr2, 0, i11);
            System.arraycopy(this.f10059b, i11, zArr2, i11 + 1, this.f10060c - i11);
            this.f10059b = zArr2;
        }
        this.f10059b[i11] = zBooleanValue;
        this.f10060c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzakw.f10134a;
        collection.getClass();
        if (!(collection instanceof zzajc)) {
            return super.addAll(collection);
        }
        zzajc zzajcVar = (zzajc) collection;
        int i11 = zzajcVar.f10060c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f10060c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        boolean[] zArr = this.f10059b;
        if (i13 > zArr.length) {
            this.f10059b = Arrays.copyOf(zArr, i13);
        }
        System.arraycopy(zzajcVar.f10059b, 0, this.f10059b, this.f10060c, zzajcVar.f10060c);
        this.f10060c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(boolean z11) {
        zza();
        int i11 = this.f10060c;
        boolean[] zArr = this.f10059b;
        if (i11 == zArr.length) {
            boolean[] zArr2 = new boolean[e0.c(zArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f10059b, 0, zArr2, 0, this.f10060c);
            this.f10059b = zArr2;
        }
        boolean[] zArr3 = this.f10059b;
        int i12 = this.f10060c;
        this.f10060c = i12 + 1;
        zArr3[i12] = z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i11) {
        if (i11 < 0 || i11 >= this.f10060c) {
            throw new IndexOutOfBoundsException(p.p("Index:", i11, this.f10060c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzajc)) {
            return super.equals(obj);
        }
        zzajc zzajcVar = (zzajc) obj;
        if (this.f10060c != zzajcVar.f10060c) {
            return false;
        }
        boolean[] zArr = zzajcVar.f10059b;
        for (int i11 = 0; i11 < this.f10060c; i11++) {
            if (this.f10059b[i11] != zArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        d(i11);
        return Boolean.valueOf(this.f10059b[i11]);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f10060c; i12++) {
            int i13 = i11 * 31;
            boolean z11 = this.f10059b[i12];
            byte[] bArr = zzakw.f10134a;
            i11 = i13 + (z11 ? 1231 : 1237);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i11 = this.f10060c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f10059b[i12] == zBooleanValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i11) {
        zza();
        d(i11);
        boolean[] zArr = this.f10059b;
        boolean z11 = zArr[i11];
        int i12 = this.f10060c;
        if (i11 < i12 - 1) {
            System.arraycopy(zArr, i11 + 1, zArr, i11, (i12 - i11) - 1);
        }
        this.f10060c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f10059b;
        System.arraycopy(zArr, i12, zArr, i11, this.f10060c - i12);
        this.f10060c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i11, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        d(i11);
        boolean[] zArr = this.f10059b;
        boolean z11 = zArr[i11];
        zArr[i11] = zBooleanValue;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10060c;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalb
    public final /* synthetic */ zzalb zza(int i11) {
        if (i11 >= this.f10060c) {
            return new zzajc(i11 == 0 ? f10058d : Arrays.copyOf(this.f10059b, i11), this.f10060c, true);
        }
        throw new IllegalArgumentException();
    }

    public zzajc(boolean[] zArr, int i11, boolean z11) {
        super(z11);
        this.f10059b = zArr;
        this.f10060c = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiy, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        b(((Boolean) obj).booleanValue());
        return true;
    }
}
