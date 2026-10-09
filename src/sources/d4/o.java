package d4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends p {
    @Override // d4.p
    public final void V(int i11, int i12, int i13, int i14) {
        int iR = this.A0 + this.B0;
        int iL = this.f23198w0 + this.f23199x0;
        if (this.f23196v0 > 0) {
            iR += this.f23195u0[0].r();
            iL += this.f23195u0[0].l();
        }
        int iMax = Math.max(this.f23123d0, iR);
        int iMax2 = Math.max(this.f23125e0, iL);
        if (i11 != 1073741824) {
            if (i11 == Integer.MIN_VALUE) {
                i12 = Math.min(iMax, i12);
            } else {
                i12 = i11 == 0 ? iMax : 0;
            }
        }
        if (i13 != 1073741824) {
            if (i13 == Integer.MIN_VALUE) {
                i14 = Math.min(iMax2, i14);
            } else {
                i14 = i13 == 0 ? iMax2 : 0;
            }
        }
        this.D0 = i12;
        this.E0 = i14;
        P(i12);
        M(i14);
        this.C0 = this.f23196v0 > 0;
    }

    @Override // d4.g
    public final void b(b4.c cVar, boolean z11) {
        super.b(cVar, z11);
        if (this.f23196v0 > 0) {
            g gVar = this.f23195u0[0];
            gVar.E();
            gVar.f23129g0 = 0.5f;
            gVar.f23127f0 = 0.5f;
            c cVar2 = c.LEFT;
            gVar.e(cVar2, this, cVar2, 0);
            c cVar3 = c.RIGHT;
            gVar.e(cVar3, this, cVar3, 0);
            c cVar4 = c.TOP;
            gVar.e(cVar4, this, cVar4, 0);
            c cVar5 = c.BOTTOM;
            gVar.e(cVar5, this, cVar5, 0);
        }
    }
}
