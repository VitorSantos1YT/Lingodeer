package com.google.android.gms.internal.fido;

import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
class zzcw extends zzcv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9699c;

    public zzcw(byte[] bArr) {
        bArr.getClass();
        this.f9699c = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzcz
    public byte b(int i11) {
        return this.f9699c[i11];
    }

    @Override // com.google.android.gms.internal.fido.zzcz
    public byte d(int i11) {
        return this.f9699c[i11];
    }

    @Override // com.google.android.gms.internal.fido.zzcz
    public int e() {
        return this.f9699c.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcz) || e() != ((zzcz) obj).e()) {
            return false;
        }
        if (e() == 0) {
            return true;
        }
        if (!(obj instanceof zzcw)) {
            return obj.equals(this);
        }
        zzcw zzcwVar = (zzcw) obj;
        int i11 = this.f9701a;
        int i12 = zzcwVar.f9701a;
        if (i11 != 0 && i12 != 0 && i11 != i12) {
            return false;
        }
        int iE = e();
        if (iE > zzcwVar.e()) {
            throw new IllegalArgumentException("Length too large: " + iE + e());
        }
        if (iE > zzcwVar.e()) {
            throw new IllegalArgumentException(p.p("Ran off end of other: 0, ", iE, zzcwVar.e(), ", "));
        }
        byte[] bArr = zzcwVar.f9699c;
        int iJ = j() + iE;
        int iJ2 = j();
        int iJ3 = zzcwVar.j();
        while (iJ2 < iJ) {
            if (this.f9699c[iJ2] != bArr[iJ3]) {
                return false;
            }
            iJ2++;
            iJ3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.fido.zzcz
    public final int f(int i11, int i12) {
        int iJ = j();
        byte[] bArr = zzde.f9703a;
        for (int i13 = iJ; i13 < iJ + i12; i13++) {
            i11 = (i11 * 31) + this.f9699c[i13];
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.fido.zzcz
    public final zzcz g() {
        int iH = zzcz.h(0, 47, e());
        return iH == 0 ? zzcz.f9700b : new zzct(this.f9699c, j(), iH);
    }

    public int j() {
        return 0;
    }
}
