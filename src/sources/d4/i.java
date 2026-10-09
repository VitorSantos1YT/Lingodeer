package d4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23167a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f23170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f23171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f23172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f23173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23175i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23176j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23177k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f23182q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f23183r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f23168b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23169c = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23178l = 0;
    public int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23179n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23180o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f23181p = 0;

    public i(j jVar, int i11, d dVar, d dVar2, d dVar3, d dVar4, int i12) {
        this.f23183r = jVar;
        this.f23167a = i11;
        this.f23170d = dVar;
        this.f23171e = dVar2;
        this.f23172f = dVar3;
        this.f23173g = dVar4;
        this.f23174h = jVar.A0;
        this.f23175i = jVar.f23198w0;
        this.f23176j = jVar.B0;
        this.f23177k = jVar.f23199x0;
        this.f23182q = i12;
    }

    public final void a(g gVar) {
        int i11 = this.f23167a;
        j jVar = this.f23183r;
        if (i11 == 0) {
            int iY = jVar.Y(gVar, this.f23182q);
            if (gVar.U[0] == f.MATCH_CONSTRAINT) {
                this.f23181p++;
                iY = 0;
            }
            this.f23178l = iY + (gVar.f23133i0 != 8 ? jVar.T0 : 0) + this.f23178l;
            int iX = jVar.X(gVar, this.f23182q);
            if (this.f23168b == null || this.f23169c < iX) {
                this.f23168b = gVar;
                this.f23169c = iX;
                this.m = iX;
            }
        } else {
            int iY2 = jVar.Y(gVar, this.f23182q);
            int iX2 = jVar.X(gVar, this.f23182q);
            if (gVar.U[1] == f.MATCH_CONSTRAINT) {
                this.f23181p++;
                iX2 = 0;
            }
            this.m = iX2 + (gVar.f23133i0 != 8 ? jVar.U0 : 0) + this.m;
            if (this.f23168b == null || this.f23169c < iY2) {
                this.f23168b = gVar;
                this.f23169c = iY2;
                this.f23178l = iY2;
            }
        }
        this.f23180o++;
    }

    public final void b(int i11, boolean z11, boolean z12) {
        j jVar;
        int i12;
        int i13;
        g gVar;
        boolean z13;
        char c11;
        float f5;
        float f11;
        int i14;
        float f12;
        float f13;
        int i15;
        int i16 = this.f23180o;
        int i17 = 0;
        while (true) {
            jVar = this.f23183r;
            if (i17 >= i16 || (i15 = this.f23179n + i17) >= jVar.f1) {
                break;
            }
            g gVar2 = jVar.e1[i15];
            if (gVar2 != null) {
                gVar2.E();
            }
            i17++;
        }
        if (i16 == 0 || this.f23168b == null) {
            return;
        }
        boolean z14 = z12 && i11 == 0;
        int i18 = -1;
        int i19 = -1;
        for (int i21 = 0; i21 < i16; i21++) {
            int i22 = this.f23179n + (z11 ? (i16 - 1) - i21 : i21);
            if (i22 >= jVar.f1) {
                break;
            }
            g gVar3 = jVar.e1[i22];
            if (gVar3 != null && gVar3.f23133i0 == 0) {
                if (i18 == -1) {
                    i18 = i21;
                }
                i19 = i21;
            }
        }
        if (this.f23167a == 0) {
            g gVar4 = this.f23168b;
            gVar4.f23140m0 = jVar.I0;
            d dVar = gVar4.M;
            d dVar2 = gVar4.K;
            int i23 = this.f23175i;
            if (i11 > 0) {
                i23 += jVar.U0;
            }
            dVar2.a(this.f23171e, i23);
            if (z12) {
                dVar.a(this.f23173g, this.f23177k);
            }
            if (i11 > 0) {
                this.f23171e.f23109d.M.a(dVar2, 0);
            }
            if (jVar.W0 != 3 || gVar4.E) {
                gVar = gVar4;
                break;
            }
            int i24 = 0;
            while (true) {
                if (i24 < i16) {
                    int i25 = this.f23179n + (z11 ? (i16 - 1) - i24 : i24);
                    if (i25 < jVar.f1) {
                        gVar = jVar.e1[i25];
                        if (gVar.E) {
                            break;
                        } else {
                            i24++;
                        }
                    }
                }
                gVar = gVar4;
                break;
            }
            int i26 = 0;
            g gVar5 = null;
            while (i26 < i16) {
                int i27 = z11 ? (i16 - 1) - i26 : i26;
                int i28 = this.f23179n + i27;
                if (i28 >= jVar.f1) {
                    return;
                }
                g gVar6 = jVar.e1[i28];
                if (gVar6 == null) {
                    i16 = i16;
                    z13 = z14;
                    i19 = i19;
                    c11 = 3;
                } else {
                    d dVar3 = gVar6.M;
                    d dVar4 = gVar6.K;
                    d dVar5 = gVar6.J;
                    z13 = z14;
                    if (i26 == 0) {
                        gVar6.f(dVar5, this.f23170d, this.f23174h);
                    }
                    if (i27 == 0) {
                        int i29 = jVar.H0;
                        if (z11) {
                            f5 = 1.0f;
                            f11 = 1.0f - jVar.N0;
                        } else {
                            f5 = 1.0f;
                            f11 = jVar.N0;
                        }
                        if (this.f23179n != 0 || (i14 = jVar.J0) == -1) {
                            if (!z12 || (i14 = jVar.L0) == -1) {
                                i14 = i29;
                                f12 = f11;
                            } else if (z11) {
                                f13 = jVar.R0;
                                f12 = f5 - f13;
                            } else {
                                f12 = jVar.R0;
                            }
                        } else if (z11) {
                            f13 = jVar.P0;
                            f12 = f5 - f13;
                        } else {
                            f12 = jVar.P0;
                        }
                        gVar6.f23139l0 = i14;
                        gVar6.f23127f0 = f12;
                    }
                    if (i26 == i16 - 1) {
                        gVar6.f(gVar6.L, this.f23172f, this.f23176j);
                    }
                    if (gVar5 != null) {
                        d dVar6 = gVar5.L;
                        dVar5.a(dVar6, jVar.T0);
                        if (i26 == i18) {
                            int i30 = this.f23174h;
                            if (dVar5.h()) {
                                dVar5.f23113h = i30;
                            }
                        }
                        dVar6.a(dVar5, 0);
                        if (i26 == i19 + 1) {
                            int i31 = this.f23176j;
                            if (dVar6.h()) {
                                dVar6.f23113h = i31;
                            }
                        }
                    }
                    if (gVar6 != gVar4) {
                        int i32 = jVar.W0;
                        c11 = 3;
                        if (i32 == 3 && gVar.E && gVar6 != gVar && gVar6.E) {
                            gVar6.N.a(gVar.N, 0);
                        } else if (i32 == 0) {
                            dVar4.a(dVar2, 0);
                        } else if (i32 == 1) {
                            dVar3.a(dVar, 0);
                        } else if (z13) {
                            dVar4.a(this.f23171e, this.f23175i);
                            dVar3.a(this.f23173g, this.f23177k);
                        } else {
                            dVar4.a(dVar2, 0);
                            dVar3.a(dVar, 0);
                        }
                    } else {
                        c11 = 3;
                    }
                    gVar5 = gVar6;
                }
                i26++;
                z14 = z13;
                i19 = i19;
                i16 = i16;
            }
            return;
        }
        int i33 = i16;
        boolean z15 = z14;
        int i34 = i19;
        g gVar7 = this.f23168b;
        gVar7.f23139l0 = jVar.H0;
        d dVar7 = gVar7.J;
        d dVar8 = gVar7.L;
        int i35 = this.f23174h;
        if (i11 > 0) {
            i35 += jVar.T0;
        }
        if (z11) {
            dVar8.a(this.f23172f, i35);
            if (z12) {
                dVar7.a(this.f23170d, this.f23176j);
            }
            if (i11 > 0) {
                this.f23172f.f23109d.J.a(dVar8, 0);
            }
        } else {
            dVar7.a(this.f23170d, i35);
            if (z12) {
                dVar8.a(this.f23172f, this.f23176j);
            }
            if (i11 > 0) {
                this.f23170d.f23109d.L.a(dVar7, 0);
            }
        }
        int i36 = 0;
        g gVar8 = null;
        while (true) {
            int i37 = i33;
            if (i36 >= i37 || (i12 = this.f23179n + i36) >= jVar.f1) {
                return;
            }
            g gVar9 = jVar.e1[i12];
            if (gVar9 == null) {
                i33 = i37;
            } else {
                d dVar9 = gVar9.K;
                d dVar10 = gVar9.L;
                d dVar11 = gVar9.J;
                if (i36 == 0) {
                    gVar9.f(dVar9, this.f23171e, this.f23175i);
                    int i38 = jVar.I0;
                    float f14 = jVar.O0;
                    if (this.f23179n == 0) {
                        int i39 = jVar.K0;
                        i33 = i37;
                        i13 = -1;
                        if (i39 != -1) {
                            f14 = jVar.Q0;
                        }
                        i38 = i39;
                        gVar9.f23140m0 = i38;
                        gVar9.f23129g0 = f14;
                    } else {
                        i33 = i37;
                        i13 = -1;
                    }
                    if (z12 && (i39 = jVar.M0) != i13) {
                        f14 = jVar.S0;
                        i38 = i39;
                    }
                    gVar9.f23140m0 = i38;
                    gVar9.f23129g0 = f14;
                } else {
                    i33 = i37;
                }
                if (i36 == i33 - 1) {
                    gVar9.f(gVar9.M, this.f23173g, this.f23177k);
                }
                if (gVar8 != null) {
                    d dVar12 = gVar8.M;
                    dVar9.a(dVar12, jVar.U0);
                    if (i36 == i18) {
                        int i40 = this.f23175i;
                        if (dVar9.h()) {
                            dVar9.f23113h = i40;
                        }
                    }
                    dVar12.a(dVar9, 0);
                    if (i36 == i34 + 1) {
                        int i41 = this.f23177k;
                        if (dVar12.h()) {
                            dVar12.f23113h = i41;
                        }
                    }
                }
                if (gVar9 != gVar7) {
                    if (z11) {
                        int i42 = jVar.V0;
                        if (i42 == 0) {
                            dVar10.a(dVar8, 0);
                        } else if (i42 == 1) {
                            dVar11.a(dVar7, 0);
                        } else if (i42 == 2) {
                            dVar11.a(dVar7, 0);
                            dVar10.a(dVar8, 0);
                        }
                    } else {
                        int i43 = jVar.V0;
                        if (i43 == 0) {
                            dVar11.a(dVar7, 0);
                        } else if (i43 == 1) {
                            dVar10.a(dVar8, 0);
                        } else if (i43 == 2) {
                            if (z15) {
                                dVar11.a(this.f23170d, this.f23174h);
                                dVar10.a(this.f23172f, this.f23176j);
                            } else {
                                dVar11.a(dVar7, 0);
                                dVar10.a(dVar8, 0);
                            }
                        }
                    }
                }
                gVar8 = gVar9;
            }
            i36++;
        }
    }

    public final int c() {
        return this.f23167a == 1 ? this.m - this.f23183r.U0 : this.m;
    }

    public final int d() {
        return this.f23167a == 0 ? this.f23178l - this.f23183r.T0 : this.f23178l;
    }

    public final void e(int i11) {
        int i12 = this.f23181p;
        if (i12 == 0) {
            return;
        }
        int i13 = this.f23180o;
        int i14 = i11 / i12;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = this.f23179n;
            int i17 = i16 + i15;
            j jVar = this.f23183r;
            if (i17 >= jVar.f1) {
                break;
            }
            g gVar = jVar.e1[i16 + i15];
            if (this.f23167a == 0) {
                if (gVar != null) {
                    f[] fVarArr = gVar.U;
                    if (fVarArr[0] == f.MATCH_CONSTRAINT && gVar.f23149r == 0) {
                        jVar.W(gVar, f.FIXED, i14, fVarArr[1], gVar.l());
                    }
                }
            } else if (gVar != null) {
                f[] fVarArr2 = gVar.U;
                if (fVarArr2[1] == f.MATCH_CONSTRAINT && gVar.f23151s == 0) {
                    int i18 = i14;
                    jVar.W(gVar, fVarArr2[0], gVar.r(), f.FIXED, i18);
                    i14 = i18;
                }
            }
        }
        this.f23178l = 0;
        this.m = 0;
        this.f23168b = null;
        this.f23169c = 0;
        int i19 = this.f23180o;
        for (int i21 = 0; i21 < i19; i21++) {
            int i22 = this.f23179n + i21;
            j jVar2 = this.f23183r;
            if (i22 >= jVar2.f1) {
                return;
            }
            g gVar2 = jVar2.e1[i22];
            if (this.f23167a == 0) {
                int iR = gVar2.r();
                int i23 = jVar2.T0;
                if (gVar2.f23133i0 == 8) {
                    i23 = 0;
                }
                this.f23178l = iR + i23 + this.f23178l;
                int iX = jVar2.X(gVar2, this.f23182q);
                if (this.f23168b == null || this.f23169c < iX) {
                    this.f23168b = gVar2;
                    this.f23169c = iX;
                    this.m = iX;
                }
            } else {
                int iY = jVar2.Y(gVar2, this.f23182q);
                int iX2 = jVar2.X(gVar2, this.f23182q);
                int i24 = jVar2.U0;
                if (gVar2.f23133i0 == 8) {
                    i24 = 0;
                }
                this.m = iX2 + i24 + this.m;
                if (this.f23168b == null || this.f23169c < iY) {
                    this.f23168b = gVar2;
                    this.f23169c = iY;
                    this.f23178l = iY;
                }
            }
        }
    }

    public final void f(int i11, d dVar, d dVar2, d dVar3, d dVar4, int i12, int i13, int i14, int i15, int i16) {
        this.f23167a = i11;
        this.f23170d = dVar;
        this.f23171e = dVar2;
        this.f23172f = dVar3;
        this.f23173g = dVar4;
        this.f23174h = i12;
        this.f23175i = i13;
        this.f23176j = i14;
        this.f23177k = i15;
        this.f23182q = i16;
    }
}
