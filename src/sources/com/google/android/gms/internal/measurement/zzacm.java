package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzacm extends zzacp {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f11209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11211e;

    public zzacm(byte[] bArr, int i11, int i12) {
        zzacr.n(i11, i11 + i12, bArr.length);
        this.f11209c = bArr;
        this.f11210d = i11;
        this.f11211e = i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final byte b(int i11) {
        return this.f11209c[this.f11210d + i11];
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int d() {
        return this.f11211e;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final zzacr e(int i11, int i12) {
        int iN = zzacr.n(i11, i12, this.f11211e);
        if (iN == 0) {
            return zzacr.f11213b;
        }
        return new zzacm(this.f11209c, this.f11210d + i11, iN);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void f(byte[] bArr, int i11) {
        System.arraycopy(this.f11209c, this.f11210d, bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void g(zzada zzadaVar) {
        zzadaVar.a(this.f11209c, this.f11210d, this.f11211e);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final boolean h(zzacr zzacrVar) {
        boolean z11 = zzacrVar instanceof zzacq;
        if (!z11 && !(zzacrVar instanceof zzacm)) {
            return zzacrVar.h(this);
        }
        int iD = zzacrVar.d();
        int i11 = this.f11211e;
        if (i11 > iD) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 18 + String.valueOf(i11).length());
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 > zzacrVar.d()) {
            int iD2 = zzacrVar.d();
            StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 27 + String.valueOf(iD2).length());
            sb3.append("Ran off end of other: 0, ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(iD2);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f11209c;
        int i12 = this.f11210d;
        if (z11) {
            return zzacr.o(i12, 0, i11, bArr, ((zzacq) zzacrVar).f11212c);
        }
        if (!(zzacrVar instanceof zzacm)) {
            return zzacrVar.e(0, i11).equals(e(i12, i11 + i12));
        }
        zzacm zzacmVar = (zzacm) zzacrVar;
        return zzacr.o(i12, zzacmVar.f11210d, i11, bArr, zzacmVar.f11209c);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int j(int i11, int i12) {
        return zzaed.a(i11, this.f11209c, this.f11210d, i12);
    }
}
