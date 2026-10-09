package d4;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f23086w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f23087x0 = true;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f23088y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f23089z0 = false;

    @Override // d4.g
    public final boolean B() {
        return this.f23089z0;
    }

    @Override // d4.g
    public final boolean C() {
        return this.f23089z0;
    }

    public final boolean V() {
        int i11;
        int i12;
        int i13;
        boolean z11 = true;
        int i14 = 0;
        while (true) {
            i11 = this.f23196v0;
            if (i14 >= i11) {
                break;
            }
            g gVar = this.f23195u0[i14];
            if ((this.f23087x0 || gVar.c()) && ((((i12 = this.f23086w0) == 0 || i12 == 1) && !gVar.B()) || (((i13 = this.f23086w0) == 2 || i13 == 3) && !gVar.C()))) {
                z11 = false;
            }
            i14++;
        }
        if (!z11 || i11 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z12 = false;
        for (int i15 = 0; i15 < this.f23196v0; i15++) {
            g gVar2 = this.f23195u0[i15];
            if (this.f23087x0 || gVar2.c()) {
                if (!z12) {
                    int i16 = this.f23086w0;
                    if (i16 == 0) {
                        iMax = gVar2.j(c.LEFT).d();
                    } else if (i16 == 1) {
                        iMax = gVar2.j(c.RIGHT).d();
                    } else if (i16 == 2) {
                        iMax = gVar2.j(c.TOP).d();
                    } else if (i16 == 3) {
                        iMax = gVar2.j(c.BOTTOM).d();
                    }
                    z12 = true;
                }
                int i17 = this.f23086w0;
                if (i17 == 0) {
                    iMax = Math.min(iMax, gVar2.j(c.LEFT).d());
                } else if (i17 == 1) {
                    iMax = Math.max(iMax, gVar2.j(c.RIGHT).d());
                } else if (i17 == 2) {
                    iMax = Math.min(iMax, gVar2.j(c.TOP).d());
                } else if (i17 == 3) {
                    iMax = Math.max(iMax, gVar2.j(c.BOTTOM).d());
                }
            }
        }
        int i18 = iMax + this.f23088y0;
        int i19 = this.f23086w0;
        if (i19 == 0 || i19 == 1) {
            K(i18, i18);
        } else {
            L(i18, i18);
        }
        this.f23089z0 = true;
        return true;
    }

    public final int W() {
        int i11 = this.f23086w0;
        if (i11 == 0 || i11 == 1) {
            return 0;
        }
        return (i11 == 2 || i11 == 3) ? 1 : -1;
    }

    @Override // d4.g
    public final void b(b4.c cVar, boolean z11) {
        boolean z12;
        int i11;
        int i12;
        d[] dVarArr = this.R;
        d dVar = this.J;
        dVarArr[0] = dVar;
        int i13 = 2;
        d dVar2 = this.K;
        dVarArr[2] = dVar2;
        d dVar3 = this.L;
        dVarArr[1] = dVar3;
        d dVar4 = this.M;
        dVarArr[3] = dVar4;
        for (d dVar5 : dVarArr) {
            dVar5.f23114i = cVar.k(dVar5);
        }
        int i14 = this.f23086w0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        d dVar6 = dVarArr[i14];
        if (!this.f23089z0) {
            V();
        }
        if (this.f23089z0) {
            this.f23089z0 = false;
            int i15 = this.f23086w0;
            if (i15 == 0 || i15 == 1) {
                cVar.d(dVar.f23114i, this.f23117a0);
                cVar.d(dVar3.f23114i, this.f23117a0);
                return;
            } else {
                if (i15 == 2 || i15 == 3) {
                    cVar.d(dVar2.f23114i, this.f23119b0);
                    cVar.d(dVar4.f23114i, this.f23119b0);
                    return;
                }
                return;
            }
        }
        int i16 = 0;
        while (true) {
            if (i16 >= this.f23196v0) {
                z12 = false;
                break;
            }
            g gVar = this.f23195u0[i16];
            if ((this.f23087x0 || gVar.c()) && ((((i12 = this.f23086w0) == 0 || i12 == 1) && gVar.U[0] == f.MATCH_CONSTRAINT && gVar.J.f23111f != null && gVar.L.f23111f != null) || ((i12 == 2 || i12 == 3) && gVar.U[1] == f.MATCH_CONSTRAINT && gVar.K.f23111f != null && gVar.M.f23111f != null))) {
                z12 = true;
                break;
            }
            i16++;
        }
        boolean z13 = dVar.g() || dVar3.g();
        boolean z14 = dVar2.g() || dVar4.g();
        int i17 = !(!z12 && (((i11 = this.f23086w0) == 0 && z13) || ((i11 == 2 && z14) || ((i11 == 1 && z13) || (i11 == 3 && z14))))) ? 4 : 5;
        int i18 = 0;
        while (i18 < this.f23196v0) {
            g gVar2 = this.f23195u0[i18];
            if (this.f23087x0 || gVar2.c()) {
                b4.h hVarK = cVar.k(gVar2.R[this.f23086w0]);
                d[] dVarArr2 = gVar2.R;
                int i19 = this.f23086w0;
                d dVar7 = dVarArr2[i19];
                dVar7.f23114i = hVarK;
                d dVar8 = dVar7.f23111f;
                int i21 = (dVar8 == null || dVar8.f23109d != this) ? 0 : dVar7.f23112g;
                if (i19 == 0 || i19 == i13) {
                    b4.h hVar = dVar6.f23114i;
                    int i22 = this.f23088y0 - i21;
                    b4.b bVarL = cVar.l();
                    b4.h hVarM = cVar.m();
                    hVarM.f3918d = 0;
                    bVarL.c(hVar, hVarK, hVarM, i22);
                    cVar.c(bVarL);
                } else {
                    b4.h hVar2 = dVar6.f23114i;
                    int i23 = this.f23088y0 + i21;
                    b4.b bVarL2 = cVar.l();
                    b4.h hVarM2 = cVar.m();
                    hVarM2.f3918d = 0;
                    bVarL2.b(hVar2, hVarK, hVarM2, i23);
                    cVar.c(bVarL2);
                }
                cVar.e(dVar6.f23114i, hVarK, this.f23088y0 + i21, i17);
            }
            i18++;
            i13 = 2;
        }
        int i24 = this.f23086w0;
        if (i24 == 0) {
            cVar.e(dVar3.f23114i, dVar.f23114i, 0, 8);
            cVar.e(dVar.f23114i, this.V.L.f23114i, 0, 4);
            cVar.e(dVar.f23114i, this.V.J.f23114i, 0, 0);
            return;
        }
        if (i24 == 1) {
            cVar.e(dVar.f23114i, dVar3.f23114i, 0, 8);
            cVar.e(dVar.f23114i, this.V.J.f23114i, 0, 4);
            cVar.e(dVar.f23114i, this.V.L.f23114i, 0, 0);
        } else if (i24 == 2) {
            cVar.e(dVar4.f23114i, dVar2.f23114i, 0, 8);
            cVar.e(dVar2.f23114i, this.V.M.f23114i, 0, 4);
            cVar.e(dVar2.f23114i, this.V.K.f23114i, 0, 0);
        } else if (i24 == 3) {
            cVar.e(dVar2.f23114i, dVar4.f23114i, 0, 8);
            cVar.e(dVar2.f23114i, this.V.K.f23114i, 0, 4);
            cVar.e(dVar2.f23114i, this.V.M.f23114i, 0, 0);
        }
    }

    @Override // d4.g
    public final boolean c() {
        return true;
    }

    @Override // d4.m, d4.g
    public final void g(g gVar, HashMap map) {
        super.g(gVar, map);
        a aVar = (a) gVar;
        this.f23086w0 = aVar.f23086w0;
        this.f23087x0 = aVar.f23087x0;
        this.f23088y0 = aVar.f23088y0;
    }

    @Override // d4.g
    public final String toString() {
        String strK = ep.a.k(new StringBuilder("[Barrier] "), this.f23137k0, " {");
        for (int i11 = 0; i11 < this.f23196v0; i11++) {
            g gVar = this.f23195u0[i11];
            if (i11 > 0) {
                strK = defpackage.e.m(strK, ", ");
            }
            StringBuilder sbN = ep.a.n(strK);
            sbN.append(gVar.f23137k0);
            strK = sbN.toString();
        }
        return defpackage.e.m(strK, "}");
    }
}
