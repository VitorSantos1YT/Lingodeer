package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzha {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzha f9561e = new zzha(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f9563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f9564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9565d;

    public zzha(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f9562a = i11;
        this.f9563b = iArr;
        this.f9564c = objArr;
        this.f9565d = z11;
    }

    public static zzha a() {
        return new zzha(0, new int[8], new Object[8], true);
    }

    public final void b(int i11, Object obj) {
        if (!this.f9565d) {
            throw new UnsupportedOperationException();
        }
        c(this.f9562a + 1);
        int[] iArr = this.f9563b;
        int i12 = this.f9562a;
        iArr[i12] = i11;
        this.f9564c[i12] = obj;
        this.f9562a = i12 + 1;
    }

    public final void c(int i11) {
        int[] iArr = this.f9563b;
        if (i11 > iArr.length) {
            int i12 = this.f9562a;
            int i13 = (i12 / 2) + i12;
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 < 8) {
                i11 = 8;
            }
            this.f9563b = Arrays.copyOf(iArr, i11);
            this.f9564c = Arrays.copyOf(this.f9564c, i11);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzha)) {
            return false;
        }
        zzha zzhaVar = (zzha) obj;
        int i11 = this.f9562a;
        if (i11 == zzhaVar.f9562a) {
            int[] iArr = this.f9563b;
            int[] iArr2 = zzhaVar.f9563b;
            for (int i12 = 0; i12 < i11; i12++) {
                if (iArr[i12] == iArr2[i12]) {
                }
            }
            Object[] objArr = this.f9564c;
            Object[] objArr2 = zzhaVar.f9564c;
            int i13 = this.f9562a;
            for (int i14 = 0; i14 < i13; i14++) {
                if (objArr[i14].equals(objArr2[i14])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f9562a;
        int i12 = i11 + 527;
        int[] iArr = this.f9563b;
        int iHashCode = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i12 * 31) + i13;
        Object[] objArr = this.f9564c;
        int i16 = this.f9562a;
        for (int i17 = 0; i17 < i16; i17++) {
            iHashCode = (iHashCode * 31) + objArr[i17].hashCode();
        }
        return (i15 * 31) + iHashCode;
    }

    private zzha() {
        this(0, new int[8], new Object[8], true);
    }
}
