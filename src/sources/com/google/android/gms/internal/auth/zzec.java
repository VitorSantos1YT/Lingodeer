package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
class zzec extends zzeb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9481c;

    public zzec(byte[] bArr) {
        bArr.getClass();
        this.f9481c = bArr;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public byte b(int i11) {
        return this.f9481c[i11];
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public byte d(int i11) {
        return this.f9481c[i11];
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public int e() {
        return this.f9481c.length;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzef) && e() == ((zzef) obj).e()) {
            if (e() == 0) {
                return true;
            }
            if (!(obj instanceof zzec)) {
                return obj.equals(this);
            }
            zzec zzecVar = (zzec) obj;
            int i11 = this.f9483a;
            int i12 = zzecVar.f9483a;
            if (i11 == 0 || i12 == 0 || i11 == i12) {
                int iE = e();
                if (iE > zzecVar.e()) {
                    throw new IllegalArgumentException("Length too large: " + iE + e());
                }
                if (iE > zzecVar.e()) {
                    throw new IllegalArgumentException(p.p("Ran off end of other: 0, ", iE, zzecVar.e(), ", "));
                }
                byte[] bArr = zzecVar.f9481c;
                int i13 = 0;
                int i14 = 0;
                while (i13 < iE) {
                    if (this.f9481c[i13] == bArr[i14]) {
                        i13++;
                        i14++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final int f(int i11, int i12) {
        Charset charset = zzfa.f9501a;
        for (int i13 = 0; i13 < i12; i13++) {
            i11 = (i11 * 31) + this.f9481c[i13];
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final zzef g() {
        int iK = zzef.k(0, 47, e());
        return iK == 0 ? zzef.f9482b : new zzdz(this.f9481c, iK);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final String h(Charset charset) {
        return new String(this.f9481c, 0, e(), charset);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final boolean j() {
        return zzhn.f9576a.b(this.f9481c, 0, e());
    }
}
