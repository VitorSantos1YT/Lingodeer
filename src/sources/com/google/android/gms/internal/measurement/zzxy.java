package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzxy extends zzzj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f12161a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12162b = 0;

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final int a() {
        return this.f12162b;
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final zzyl b(int i11) {
        if (i11 < this.f12162b) {
            return (zzyl) this.f12161a[i11 + i11];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final Object c(int i11) {
        if (i11 < this.f12162b) {
            return this.f12161a[i11 + i11 + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final Object d(zzyl zzylVar) {
        int iF = f(zzylVar);
        if (iF == -1) {
            return null;
        }
        return zzylVar.f12180b.cast(this.f12161a[iF + iF + 1]);
    }

    public final void e(zzyl zzylVar, Object obj) {
        int iF;
        if (!zzylVar.f12181c && (iF = f(zzylVar)) != -1) {
            zzabr.a(obj, "metadata value");
            this.f12161a[iF + iF + 1] = obj;
            return;
        }
        int i11 = this.f12162b + 1;
        Object[] objArr = this.f12161a;
        int length = objArr.length;
        if (i11 + i11 > length) {
            this.f12161a = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.f12161a;
        int i12 = this.f12162b;
        int i13 = i12 + i12;
        objArr2[i13] = zzylVar;
        zzabr.a(obj, "metadata value");
        objArr2[i13 + 1] = obj;
        this.f12162b++;
    }

    public final int f(zzyl zzylVar) {
        for (int i11 = 0; i11 < this.f12162b; i11++) {
            if (this.f12161a[i11 + i11].equals(zzylVar)) {
                return i11;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata{");
        for (int i11 = 0; i11 < this.f12162b; i11++) {
            sb2.append(" '");
            sb2.append(b(i11));
            sb2.append("': ");
            sb2.append(c(i11));
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
