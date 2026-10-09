package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class zzeg extends zzef {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f12349c;

    public zzeg(byte[] bArr) {
        bArr.getClass();
        this.f12349c = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public byte b(int i11) {
        return this.f12349c[i11];
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public byte d(int i11) {
        return this.f12349c[i11];
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public int e() {
        return this.f12349c.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzei) && e() == ((zzei) obj).e()) {
            if (e() == 0) {
                return true;
            }
            if (!(obj instanceof zzeg)) {
                return obj.equals(this);
            }
            zzeg zzegVar = (zzeg) obj;
            int i11 = this.f12351a;
            int i12 = zzegVar.f12351a;
            if (i11 == 0 || i12 == 0 || i11 == i12) {
                int iE = e();
                if (iE > zzegVar.e()) {
                    throw new IllegalArgumentException("Length too large: " + iE + e());
                }
                if (iE > zzegVar.e()) {
                    throw new IllegalArgumentException(p.p("Ran off end of other: 0, ", iE, zzegVar.e(), ", "));
                }
                byte[] bArr = zzegVar.f12349c;
                int i13 = 0;
                int i14 = 0;
                while (i13 < iE) {
                    if (this.f12349c[i13] == bArr[i14]) {
                        i13++;
                        i14++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final int f(int i11, int i12) {
        Charset charset = zzfo.f12383a;
        for (int i13 = 0; i13 < i12; i13++) {
            i11 = (i11 * 31) + this.f12349c[i13];
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final zzei g() {
        int iJ = zzei.j(0, 47, e());
        return iJ == 0 ? zzei.f12350b : new zzec(this.f12349c, iJ);
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final void h(zzdz zzdzVar) {
        ((zzem) zzdzVar).w(this.f12349c, e());
    }
}
