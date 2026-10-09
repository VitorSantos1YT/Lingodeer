package d4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends p {
    public g[] e1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public int L0 = -1;
    public int M0 = -1;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public float R0 = 0.5f;
    public float S0 = 0.5f;
    public int T0 = 0;
    public int U0 = 0;
    public int V0 = 2;
    public int W0 = 2;
    public int X0 = 0;
    public int Y0 = -1;
    public int Z0 = 0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final ArrayList f23184a1 = new ArrayList();

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public g[] f23185b1 = null;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public g[] f23186c1 = null;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int[] f23187d1 = null;
    public int f1 = 0;

    /* JADX WARN: Code duplicated, block: B:74:0x0104  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // d4.p
    public final void V(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int[] iArr;
        int i18;
        int i19;
        i iVar;
        char c11;
        int i21;
        int i22;
        int i23;
        int iCeil;
        int iCeil2;
        Object obj;
        g gVar;
        int i24;
        int i25;
        int i26;
        int i27;
        if (this.f23196v0 > 0) {
            g gVar2 = this.V;
            j4.f fVar = gVar2 != null ? ((h) gVar2).f23165y0 : null;
            if (fVar == null) {
                this.D0 = 0;
                this.E0 = 0;
                this.C0 = false;
                return;
            }
            for (int i28 = 0; i28 < this.f23196v0; i28++) {
                g gVar3 = this.f23195u0[i28];
                if (gVar3 != null && !(gVar3 instanceof l)) {
                    f fVarK = gVar3.k(0);
                    f fVarK2 = gVar3.k(1);
                    f fVar2 = f.MATCH_CONSTRAINT;
                    if (fVarK != fVar2 || gVar3.f23149r == 1 || fVarK2 != fVar2 || gVar3.f23151s == 1) {
                        if (fVarK == fVar2) {
                            fVarK = f.WRAP_CONTENT;
                        }
                        if (fVarK2 == fVar2) {
                            fVarK2 = f.WRAP_CONTENT;
                        }
                        e4.b bVar = this.F0;
                        bVar.f24778a = fVarK;
                        bVar.f24779b = fVarK2;
                        bVar.f24780c = gVar3.r();
                        bVar.f24781d = gVar3.l();
                        fVar.b(gVar3, bVar);
                        gVar3.P(bVar.f24782e);
                        gVar3.M(bVar.f24783f);
                        gVar3.J(bVar.f24784g);
                    }
                }
            }
        }
        int i29 = this.A0;
        int i30 = this.B0;
        int i31 = this.f23198w0;
        int i32 = this.f23199x0;
        int[] iArr2 = new int[2];
        int i33 = (i12 - i29) - i30;
        int i34 = this.Z0;
        if (i34 == 1) {
            i33 = (i14 - i31) - i32;
        }
        int i35 = i33;
        if (i34 == 0) {
            if (this.H0 == -1) {
                this.H0 = 0;
            }
            if (this.I0 == -1) {
                this.I0 = 0;
            }
        } else {
            if (this.H0 == -1) {
                this.H0 = 0;
            }
            if (this.I0 == -1) {
                this.I0 = 0;
            }
        }
        g[] gVarArr = this.f23195u0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        while (true) {
            i15 = this.f23196v0;
            if (i36 >= i15) {
                break;
            }
            if (this.f23195u0[i36].f23133i0 == 8) {
                i37++;
            }
            i36++;
        }
        if (i37 > 0) {
            gVarArr = new g[i15 - i37];
            i15 = 0;
            for (int i39 = 0; i39 < this.f23196v0; i39++) {
                g gVar4 = this.f23195u0[i39];
                if (gVar4.f23133i0 != 8) {
                    gVarArr[i15] = gVar4;
                    i15++;
                }
            }
        }
        g[] gVarArr2 = gVarArr;
        this.e1 = gVarArr2;
        this.f1 = i15;
        int i40 = this.X0;
        ArrayList arrayList = this.f23184a1;
        if (i40 != 0) {
            d dVar = this.K;
            d dVar2 = this.J;
            i18 = i29;
            d dVar3 = this.L;
            d dVar4 = this.M;
            if (i40 == 1) {
                i17 = i32;
                iArr = iArr2;
                i19 = i30;
                i16 = i31;
                int i41 = this.Z0;
                if (i15 != 0) {
                    arrayList.clear();
                    i iVar2 = new i(this, i41, this.J, this.K, this.L, this.M, i35);
                    arrayList.add(iVar2);
                    if (i41 == 0) {
                        i21 = 0;
                        int i42 = 0;
                        int i43 = 0;
                        while (i43 < i15) {
                            g gVar5 = gVarArr2[i43];
                            int iY = Y(gVar5, i35);
                            if (gVar5.U[0] == f.MATCH_CONSTRAINT) {
                                i21++;
                            }
                            int i44 = i21;
                            boolean z11 = (i42 == i35 || (this.T0 + i42) + iY > i35) && iVar2.f23168b != null;
                            if (!z11 && i43 > 0 && (i23 = this.Y0) > 0 && i43 % i23 == 0) {
                                z11 = true;
                            }
                            if (z11) {
                                iVar2 = new i(this, i41, this.J, this.K, this.L, this.M, i35);
                                iVar2.f23179n = i43;
                                arrayList.add(iVar2);
                            } else {
                                if (i43 > 0) {
                                    i42 = this.T0 + iY + i42;
                                }
                                iVar2.a(gVar5);
                                i43++;
                                i21 = i44;
                            }
                            i42 = iY;
                            iVar2.a(gVar5);
                            i43++;
                            i21 = i44;
                        }
                    } else {
                        i21 = 0;
                        int i45 = 0;
                        int i46 = 0;
                        while (i46 < i15) {
                            g gVar6 = gVarArr2[i46];
                            int iX = X(gVar6, i35);
                            if (gVar6.U[1] == f.MATCH_CONSTRAINT) {
                                i21++;
                            }
                            int i47 = i21;
                            boolean z12 = (i45 == i35 || (this.U0 + i45) + iX > i35) && iVar2.f23168b != null;
                            if (!z12 && i46 > 0 && (i22 = this.Y0) > 0 && i46 % i22 == 0) {
                                z12 = true;
                            }
                            if (z12) {
                                iVar2 = new i(this, i41, this.J, this.K, this.L, this.M, i35);
                                iVar2.f23179n = i46;
                                arrayList.add(iVar2);
                            } else {
                                if (i46 > 0) {
                                    i45 = this.U0 + iX + i45;
                                }
                                iVar2.a(gVar6);
                                i46++;
                                i21 = i47;
                            }
                            i45 = iX;
                            iVar2.a(gVar6);
                            i46++;
                            i21 = i47;
                        }
                    }
                    int size = arrayList.size();
                    int i48 = this.A0;
                    int i49 = this.f23198w0;
                    int i50 = this.B0;
                    int i51 = this.f23199x0;
                    f[] fVarArr = this.U;
                    f fVar3 = fVarArr[0];
                    f fVar4 = f.WRAP_CONTENT;
                    boolean z13 = fVar3 == fVar4 || fVarArr[1] == fVar4;
                    if (i21 > 0 && z13) {
                        for (int i52 = 0; i52 < size; i52++) {
                            i iVar3 = (i) arrayList.get(i52);
                            if (i41 == 0) {
                                iVar3.e(i35 - iVar3.d());
                            } else {
                                iVar3.e(i35 - iVar3.c());
                            }
                        }
                    }
                    int i53 = i48;
                    int i54 = i49;
                    int i55 = i50;
                    int i56 = i51;
                    d dVar5 = dVar2;
                    d dVar6 = dVar;
                    int iMax = 0;
                    int i57 = 0;
                    d dVar7 = dVar3;
                    d dVar8 = dVar4;
                    for (int i58 = 0; i58 < size; i58++) {
                        i iVar4 = (i) arrayList.get(i58);
                        if (i41 == 0) {
                            if (i58 < size - 1) {
                                dVar8 = ((i) arrayList.get(i58 + 1)).f23168b.K;
                                i56 = 0;
                            } else {
                                i56 = this.f23199x0;
                                dVar8 = dVar4;
                            }
                            d dVar9 = iVar4.f23168b.M;
                            iVar4.f(i41, dVar5, dVar6, dVar7, dVar8, i53, i54, i55, i56, i35);
                            iMax = Math.max(iMax, iVar4.d());
                            int iC = iVar4.c() + i57;
                            if (i58 > 0) {
                                iC += this.U0;
                            }
                            i57 = iC;
                            dVar6 = dVar9;
                            i54 = 0;
                        } else {
                            if (i58 < size - 1) {
                                dVar7 = ((i) arrayList.get(i58 + 1)).f23168b.J;
                                i55 = 0;
                            } else {
                                i55 = this.B0;
                                dVar7 = dVar3;
                            }
                            d dVar10 = iVar4.f23168b.L;
                            iVar4.f(i41, dVar5, dVar6, dVar7, dVar8, i53, i54, i55, i56, i35);
                            int iD = iVar4.d() + iMax;
                            int iMax2 = Math.max(i57, iVar4.c());
                            if (i58 > 0) {
                                iD += this.T0;
                            }
                            i57 = iMax2;
                            iMax = iD;
                            dVar5 = dVar10;
                            i53 = 0;
                        }
                    }
                    iArr[0] = iMax;
                    iArr[1] = i57;
                }
            } else if (i40 == 2) {
                i17 = i32;
                iArr = iArr2;
                i19 = i30;
                i16 = i31;
                int i59 = this.Z0;
                if (i59 == 0) {
                    int i60 = this.Y0;
                    if (i60 <= 0) {
                        int i61 = 0;
                        iCeil2 = 0;
                        for (int i62 = 0; i62 < i15; i62++) {
                            if (i62 > 0) {
                                i61 += this.T0;
                            }
                            g gVar7 = gVarArr2[i62];
                            if (gVar7 != null) {
                                int iY2 = Y(gVar7, i35) + i61;
                                if (iY2 > i35) {
                                    break;
                                }
                                iCeil2++;
                                i61 = iY2;
                            }
                        }
                    } else {
                        iCeil2 = i60;
                    }
                    iCeil = 0;
                } else {
                    iCeil = this.Y0;
                    if (iCeil <= 0) {
                        int i63 = 0;
                        int i64 = 0;
                        for (int i65 = 0; i65 < i15; i65++) {
                            if (i65 > 0) {
                                i63 += this.U0;
                            }
                            g gVar8 = gVarArr2[i65];
                            if (gVar8 != null) {
                                int iX2 = X(gVar8, i35) + i63;
                                if (iX2 > i35) {
                                    break;
                                }
                                i64++;
                                i63 = iX2;
                            }
                        }
                        iCeil = i64;
                    }
                    iCeil2 = 0;
                }
                if (this.f23187d1 == null) {
                    this.f23187d1 = new int[2];
                }
                boolean z14 = (iCeil == 0 && i59 == 1) || (iCeil2 == 0 && i59 == 0);
                while (!z14) {
                    if (i59 == 0) {
                        iCeil = (int) Math.ceil(i15 / iCeil2);
                    } else {
                        iCeil2 = (int) Math.ceil(i15 / iCeil);
                    }
                    g[] gVarArr3 = this.f23186c1;
                    if (gVarArr3 == null || gVarArr3.length < iCeil2) {
                        obj = null;
                        this.f23186c1 = new g[iCeil2];
                    } else {
                        obj = null;
                        Arrays.fill(gVarArr3, (Object) null);
                    }
                    g[] gVarArr4 = this.f23185b1;
                    if (gVarArr4 == null || gVarArr4.length < iCeil) {
                        this.f23185b1 = new g[iCeil];
                    } else {
                        Arrays.fill(gVarArr4, obj);
                    }
                    for (int i66 = 0; i66 < iCeil2; i66++) {
                        for (int i67 = 0; i67 < iCeil; i67++) {
                            int i68 = (i67 * iCeil2) + i66;
                            if (i59 == 1) {
                                i68 = (i66 * iCeil) + i67;
                            }
                            if (i68 < gVarArr2.length && (gVar = gVarArr2[i68]) != null) {
                                int iY3 = Y(gVar, i35);
                                g gVar9 = this.f23186c1[i66];
                                if (gVar9 == null || gVar9.r() < iY3) {
                                    this.f23186c1[i66] = gVar;
                                }
                                int iX3 = X(gVar, i35);
                                g gVar10 = this.f23185b1[i67];
                                if (gVar10 == null || gVar10.l() < iX3) {
                                    this.f23185b1[i67] = gVar;
                                }
                            }
                        }
                    }
                    int iY4 = 0;
                    for (int i69 = 0; i69 < iCeil2; i69++) {
                        g gVar11 = this.f23186c1[i69];
                        if (gVar11 != null) {
                            if (i69 > 0) {
                                iY4 += this.T0;
                            }
                            iY4 = Y(gVar11, i35) + iY4;
                        }
                    }
                    int iX4 = 0;
                    for (int i70 = 0; i70 < iCeil; i70++) {
                        g gVar12 = this.f23185b1[i70];
                        if (gVar12 != null) {
                            if (i70 > 0) {
                                iX4 += this.U0;
                            }
                            iX4 = X(gVar12, i35) + iX4;
                        }
                    }
                    iArr[0] = iY4;
                    iArr[1] = iX4;
                    if (i59 == 0) {
                        if (iY4 <= i35 || iCeil2 <= 1) {
                            z14 = true;
                        } else {
                            iCeil2--;
                        }
                    } else if (iX4 <= i35 || iCeil <= 1) {
                        z14 = true;
                    } else {
                        iCeil--;
                    }
                }
                int[] iArr3 = this.f23187d1;
                iArr3[0] = iCeil2;
                iArr3[1] = iCeil;
                c11 = 1;
            } else if (i40 != 3) {
                i17 = i32;
                iArr = iArr2;
                i19 = i30;
                i16 = i31;
            } else {
                int i71 = this.Z0;
                if (i15 == 0) {
                    i17 = i32;
                    iArr = iArr2;
                    i19 = i30;
                    i16 = i31;
                } else {
                    arrayList.clear();
                    iArr = iArr2;
                    i16 = i31;
                    i17 = i32;
                    i iVar5 = new i(this, i71, this.J, this.K, this.L, this.M, i35);
                    arrayList.add(iVar5);
                    if (i71 == 0) {
                        int i72 = 0;
                        int i73 = 0;
                        i24 = 0;
                        int i74 = 0;
                        while (i72 < i15) {
                            i73++;
                            int i75 = i30;
                            g gVar13 = gVarArr2[i72];
                            int iY5 = Y(gVar13, i35);
                            int i76 = i71;
                            int i77 = i72;
                            if (gVar13.U[0] == f.MATCH_CONSTRAINT) {
                                i24++;
                            }
                            int i78 = i24;
                            boolean z15 = (i74 == i35 || (this.T0 + i74) + iY5 > i35) && iVar5.f23168b != null;
                            if (!z15 && i77 > 0 && (i27 = this.Y0) > 0 && i73 > i27) {
                                z15 = true;
                            }
                            if (z15) {
                                i71 = i76;
                                i26 = i77;
                                iVar5 = new i(this, i71, this.J, this.K, this.L, this.M, i35);
                                iVar5.f23179n = i26;
                                arrayList.add(iVar5);
                                i74 = iY5;
                                i73 = 1;
                            } else {
                                i71 = i76;
                                i26 = i77;
                                i74 = i26 > 0 ? this.T0 + iY5 + i74 : iY5;
                            }
                            iVar5.a(gVar13);
                            i72 = i26 + 1;
                            i24 = i78;
                            i30 = i75;
                        }
                        i19 = i30;
                    } else {
                        i19 = i30;
                        int i79 = 0;
                        int i80 = 0;
                        int i81 = 0;
                        int i82 = 0;
                        while (i82 < i15) {
                            i79++;
                            g gVar14 = gVarArr2[i82];
                            int iX5 = X(gVar14, i35);
                            int i83 = i71;
                            if (gVar14.U[1] == f.MATCH_CONSTRAINT) {
                                i80++;
                            }
                            int i84 = i80;
                            boolean z16 = (i81 == i35 || (this.U0 + i81) + iX5 > i35) && iVar5.f23168b != null;
                            if (!z16 && i82 > 0 && (i25 = this.Y0) > 0 && i79 > i25) {
                                z16 = true;
                            }
                            if (z16) {
                                i71 = i83;
                                iVar5 = new i(this, i71, this.J, this.K, this.L, this.M, i35);
                                iVar5.f23179n = i82;
                                arrayList.add(iVar5);
                                i81 = iX5;
                                i79 = 1;
                            } else {
                                i71 = i83;
                                i81 = i82 > 0 ? this.U0 + iX5 + i81 : iX5;
                            }
                            iVar5.a(gVar14);
                            i82++;
                            i80 = i84;
                        }
                        i24 = i80;
                    }
                    int size2 = arrayList.size();
                    int i85 = this.A0;
                    int i86 = this.f23198w0;
                    int i87 = this.B0;
                    int i88 = this.f23199x0;
                    f[] fVarArr2 = this.U;
                    f fVar5 = fVarArr2[0];
                    f fVar6 = f.WRAP_CONTENT;
                    boolean z17 = fVar5 == fVar6 || fVarArr2[1] == fVar6;
                    if (i24 > 0 && z17) {
                        for (int i89 = 0; i89 < size2; i89++) {
                            i iVar6 = (i) arrayList.get(i89);
                            if (i71 == 0) {
                                iVar6.e(i35 - iVar6.d());
                            } else {
                                iVar6.e(i35 - iVar6.c());
                            }
                        }
                    }
                    int i90 = i85;
                    int i91 = i86;
                    int i92 = i87;
                    int i93 = i88;
                    d dVar11 = dVar2;
                    d dVar12 = dVar;
                    int iMax3 = 0;
                    int i94 = 0;
                    d dVar13 = dVar3;
                    d dVar14 = dVar4;
                    for (int i95 = 0; i95 < size2; i95++) {
                        i iVar7 = (i) arrayList.get(i95);
                        if (i71 == 0) {
                            if (i95 < size2 - 1) {
                                dVar14 = ((i) arrayList.get(i95 + 1)).f23168b.K;
                                i93 = 0;
                            } else {
                                i93 = this.f23199x0;
                                dVar14 = dVar4;
                            }
                            d dVar15 = iVar7.f23168b.M;
                            iVar7.f(i71, dVar11, dVar12, dVar13, dVar14, i90, i91, i92, i93, i35);
                            iMax3 = Math.max(iMax3, iVar7.d());
                            int iC2 = iVar7.c() + i94;
                            if (i95 > 0) {
                                iC2 += this.U0;
                            }
                            i94 = iC2;
                            dVar12 = dVar15;
                            i91 = 0;
                        } else {
                            if (i95 < size2 - 1) {
                                dVar13 = ((i) arrayList.get(i95 + 1)).f23168b.J;
                                i92 = 0;
                            } else {
                                i92 = this.B0;
                                dVar13 = dVar3;
                            }
                            d dVar16 = iVar7.f23168b.L;
                            iVar7.f(i71, dVar11, dVar12, dVar13, dVar14, i90, i91, i92, i93, i35);
                            int iD2 = iVar7.d() + iMax3;
                            int iMax4 = Math.max(i94, iVar7.c());
                            if (i95 > 0) {
                                iD2 += this.T0;
                            }
                            i94 = iMax4;
                            iMax3 = iD2;
                            dVar11 = dVar16;
                            i90 = 0;
                        }
                    }
                    iArr[0] = iMax3;
                    iArr[1] = i94;
                }
            }
            c11 = 1;
        } else {
            i16 = i31;
            i17 = i32;
            iArr = iArr2;
            i18 = i29;
            i19 = i30;
            int i96 = this.Z0;
            if (i15 == 0) {
                c11 = 1;
            } else {
                if (arrayList.size() == 0) {
                    iVar = new i(this, i96, this.J, this.K, this.L, this.M, i35);
                    arrayList.add(iVar);
                } else {
                    i iVar8 = (i) arrayList.get(0);
                    iVar8.f23169c = 0;
                    iVar8.f23168b = null;
                    iVar8.f23178l = 0;
                    iVar8.m = 0;
                    iVar8.f23179n = 0;
                    iVar8.f23180o = 0;
                    iVar8.f23181p = 0;
                    iVar8.f(i96, this.J, this.K, this.L, this.M, this.A0, this.f23198w0, this.B0, this.f23199x0, i35);
                    iVar = iVar8;
                }
                for (int i97 = 0; i97 < i15; i97++) {
                    iVar.a(gVarArr2[i97]);
                }
                i38 = 0;
                iArr[0] = iVar.d();
                c11 = 1;
                iArr[1] = iVar.c();
            }
        }
        int iMin = iArr[i38] + i18 + i19;
        int iMin2 = iArr[c11] + i16 + i17;
        if (i11 == 1073741824) {
            iMin = i12;
        } else if (i11 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i12);
        } else if (i11 != 0) {
            iMin = i38;
        }
        if (i13 == 1073741824) {
            iMin2 = i14;
        } else if (i13 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i14);
        } else if (i13 != 0) {
            iMin2 = i38;
        }
        this.D0 = iMin;
        this.E0 = iMin2;
        P(iMin);
        M(iMin2);
        this.C0 = this.f23196v0 > 0 ? c11 : i38;
    }

    public final int X(g gVar, int i11) {
        g gVar2;
        if (gVar == null) {
            return 0;
        }
        if (gVar.U[1] == f.MATCH_CONSTRAINT) {
            int i12 = gVar.f23151s;
            if (i12 == 0) {
                return 0;
            }
            if (i12 == 2) {
                int i13 = (int) (gVar.f23160z * i11);
                if (i13 != gVar.l()) {
                    gVar.f23128g = true;
                    W(gVar, gVar.U[0], gVar.r(), f.FIXED, i13);
                }
                return i13;
            }
            gVar2 = gVar;
            if (i12 == 1) {
                return gVar2.l();
            }
            if (i12 == 3) {
                return (int) ((gVar2.r() * gVar2.Y) + 0.5f);
            }
        } else {
            gVar2 = gVar;
        }
        return gVar2.l();
    }

    public final int Y(g gVar, int i11) {
        g gVar2;
        if (gVar == null) {
            return 0;
        }
        if (gVar.U[0] == f.MATCH_CONSTRAINT) {
            int i12 = gVar.f23149r;
            if (i12 == 0) {
                return 0;
            }
            if (i12 == 2) {
                int i13 = (int) (gVar.f23157w * i11);
                if (i13 != gVar.r()) {
                    gVar.f23128g = true;
                    W(gVar, f.FIXED, i13, gVar.U[1], gVar.l());
                }
                return i13;
            }
            gVar2 = gVar;
            if (i12 == 1) {
                return gVar2.r();
            }
            if (i12 == 3) {
                return (int) ((gVar2.l() * gVar2.Y) + 0.5f);
            }
        } else {
            gVar2 = gVar;
        }
        return gVar2.r();
    }

    @Override // d4.g
    public final void b(b4.c cVar, boolean z11) {
        g gVar;
        float f5;
        int i11;
        super.b(cVar, z11);
        g gVar2 = this.V;
        boolean z12 = gVar2 != null && ((h) gVar2).f23166z0;
        int i12 = this.X0;
        ArrayList arrayList = this.f23184a1;
        if (i12 != 0) {
            if (i12 == 1) {
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    ((i) arrayList.get(i13)).b(i13, z12, i13 == size + (-1));
                    i13++;
                }
            } else if (i12 != 2) {
                if (i12 == 3) {
                    int size2 = arrayList.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        ((i) arrayList.get(i14)).b(i14, z12, i14 == size2 + (-1));
                        i14++;
                    }
                }
            } else if (this.f23187d1 != null && this.f23186c1 != null && this.f23185b1 != null) {
                for (int i15 = 0; i15 < this.f1; i15++) {
                    this.e1[i15].E();
                }
                int[] iArr = this.f23187d1;
                int i16 = iArr[0];
                int i17 = iArr[1];
                float f11 = this.N0;
                g gVar3 = null;
                int i18 = 0;
                while (i18 < i16) {
                    if (z12) {
                        i11 = (i16 - i18) - 1;
                        f5 = 1.0f - this.N0;
                    } else {
                        f5 = f11;
                        i11 = i18;
                    }
                    g gVar4 = this.f23186c1[i11];
                    if (gVar4 != null) {
                        d dVar = gVar4.J;
                        if (gVar4.f23133i0 != 8) {
                            if (i18 == 0) {
                                gVar4.f(dVar, this.J, this.A0);
                                gVar4.f23139l0 = this.H0;
                                gVar4.f23127f0 = f5;
                            }
                            if (i18 == i16 - 1) {
                                gVar4.f(gVar4.L, this.L, this.B0);
                            }
                            if (i18 > 0 && gVar3 != null) {
                                d dVar2 = gVar3.L;
                                gVar4.f(dVar, dVar2, this.T0);
                                gVar3.f(dVar2, dVar, 0);
                            }
                            gVar3 = gVar4;
                        }
                    }
                    i18++;
                    f11 = f5;
                }
                for (int i19 = 0; i19 < i17; i19++) {
                    g gVar5 = this.f23185b1[i19];
                    if (gVar5 != null) {
                        d dVar3 = gVar5.K;
                        if (gVar5.f23133i0 != 8) {
                            if (i19 == 0) {
                                gVar5.f(dVar3, this.K, this.f23198w0);
                                gVar5.f23140m0 = this.I0;
                                gVar5.f23129g0 = this.O0;
                            }
                            if (i19 == i17 - 1) {
                                gVar5.f(gVar5.M, this.M, this.f23199x0);
                            }
                            if (i19 > 0 && gVar3 != null) {
                                d dVar4 = gVar3.M;
                                gVar5.f(dVar3, dVar4, this.U0);
                                gVar3.f(dVar4, dVar3, 0);
                            }
                            gVar3 = gVar5;
                        }
                    }
                }
                for (int i21 = 0; i21 < i16; i21++) {
                    for (int i22 = 0; i22 < i17; i22++) {
                        int i23 = (i22 * i16) + i21;
                        if (this.Z0 == 1) {
                            i23 = (i21 * i17) + i22;
                        }
                        g[] gVarArr = this.e1;
                        if (i23 < gVarArr.length && (gVar = gVarArr[i23]) != null && gVar.f23133i0 != 8) {
                            g gVar6 = this.f23186c1[i21];
                            g gVar7 = this.f23185b1[i22];
                            if (gVar != gVar6) {
                                gVar.f(gVar.J, gVar6.J, 0);
                                gVar.f(gVar.L, gVar6.L, 0);
                            }
                            if (gVar != gVar7) {
                                gVar.f(gVar.K, gVar7.K, 0);
                                gVar.f(gVar.M, gVar7.M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((i) arrayList.get(0)).b(0, z12, true);
        }
        this.C0 = false;
    }

    @Override // d4.m, d4.g
    public final void g(g gVar, HashMap map) {
        super.g(gVar, map);
        j jVar = (j) gVar;
        this.H0 = jVar.H0;
        this.I0 = jVar.I0;
        this.J0 = jVar.J0;
        this.K0 = jVar.K0;
        this.L0 = jVar.L0;
        this.M0 = jVar.M0;
        this.N0 = jVar.N0;
        this.O0 = jVar.O0;
        this.P0 = jVar.P0;
        this.Q0 = jVar.Q0;
        this.R0 = jVar.R0;
        this.S0 = jVar.S0;
        this.T0 = jVar.T0;
        this.U0 = jVar.U0;
        this.V0 = jVar.V0;
        this.W0 = jVar.W0;
        this.X0 = jVar.X0;
        this.Y0 = jVar.Y0;
        this.Z0 = jVar.Z0;
    }
}
