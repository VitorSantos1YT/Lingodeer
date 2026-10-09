package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzacq extends zzacp {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f11212c;

    public zzacq(byte[] bArr) {
        bArr.getClass();
        this.f11212c = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final byte b(int i11) {
        return this.f11212c[i11];
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int d() {
        return this.f11212c.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final zzacr e(int i11, int i12) {
        byte[] bArr = this.f11212c;
        int iN = zzacr.n(0, i12, bArr.length);
        return iN == 0 ? zzacr.f11213b : new zzacm(bArr, 0, iN);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void f(byte[] bArr, int i11) {
        System.arraycopy(this.f11212c, 0, bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void g(zzada zzadaVar) {
        byte[] bArr = this.f11212c;
        zzadaVar.a(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final boolean h(zzacr zzacrVar) {
        boolean z11 = zzacrVar instanceof zzacq;
        byte[] bArr = this.f11212c;
        if (z11) {
            return Arrays.equals(bArr, ((zzacq) zzacrVar).f11212c);
        }
        boolean z12 = zzacrVar instanceof zzacm;
        if (!z12) {
            return zzacrVar.h(this);
        }
        zzacm zzacmVar = (zzacm) zzacrVar;
        int i11 = zzacmVar.f11211e;
        int length = bArr.length;
        if (length > i11) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb2.append("Length too large: ");
            sb2.append(length);
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (length <= i11) {
            if (z11) {
                return zzacr.o(0, 0, length, bArr, ((zzacq) zzacrVar).f11212c);
            }
            if (!z12) {
                return zzacrVar.e(0, length).equals(e(0, length));
            }
            return zzacr.o(0, zzacmVar.f11210d, length, bArr, zzacmVar.f11209c);
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(i11).length());
        sb3.append("Ran off end of other: 0, ");
        sb3.append(length);
        sb3.append(", ");
        sb3.append(i11);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int j(int i11, int i12) {
        return zzaed.a(i11, this.f11212c, 0, i12);
    }
}
