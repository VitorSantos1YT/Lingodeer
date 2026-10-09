package d4;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f23197a = new boolean[3];

    /* JADX WARN: Code duplicated, block: B:188:0x029b  */
    /* JADX WARN: Code duplicated, block: B:205:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:207:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:209:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:211:0x0313  */
    /* JADX WARN: Code duplicated, block: B:233:0x0380  */
    /* JADX WARN: Code duplicated, block: B:235:0x039c  */
    /* JADX WARN: Code duplicated, block: B:237:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:241:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:252:0x0435  */
    /* JADX WARN: Code duplicated, block: B:406:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:409:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:410:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:413:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:414:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:416:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:418:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:421:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:423:0x06d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:433:0x06f0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:74:0x0117  */
    public static void a(h hVar, b4.c cVar, ArrayList arrayList, int i11) {
        int i12;
        b[] bVarArr;
        int i13;
        int i14;
        d[] dVarArr;
        float f5;
        boolean z11;
        boolean z12;
        boolean z13;
        int i15;
        g gVar;
        b4.c cVar2;
        b4.h hVar2;
        d dVar;
        b4.h hVar3;
        int i16;
        d dVar2;
        b4.h hVar4;
        g gVar2;
        int i17;
        d[] dVarArr2;
        int i18;
        d dVar3;
        d dVar4;
        b4.h hVar5;
        d dVar5;
        b4.h hVar6;
        int size;
        ArrayList arrayList2;
        float f11;
        b4.h hVar7;
        b4.h hVar8;
        b4.h hVar9;
        b4.h hVar10;
        b4.b bVarL;
        float f12;
        d dVar6;
        g gVar3;
        int i19;
        int i21;
        int i22;
        g gVar4;
        float f13;
        h hVar11 = hVar;
        if (i11 == 0) {
            i12 = hVar11.D0;
            bVarArr = hVar11.G0;
            i13 = 0;
        } else {
            i12 = hVar11.E0;
            bVarArr = hVar11.F0;
            i13 = 2;
        }
        int i23 = i12;
        b[] bVarArr2 = bVarArr;
        int i24 = 0;
        while (i24 < i23) {
            b bVar = bVarArr2[i24];
            boolean z14 = bVar.f23105q;
            g gVar5 = bVar.f23090a;
            d[] dVarArr3 = gVar5.R;
            int i25 = 8;
            if (z14) {
                i14 = i24;
                dVarArr = dVarArr3;
                f5 = CropImageView.DEFAULT_ASPECT_RATIO;
            } else {
                int i26 = bVar.f23101l;
                int i27 = i26 * 2;
                g gVar6 = gVar5;
                g gVar7 = gVar6;
                boolean z15 = false;
                f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                while (!z15) {
                    bVar.f23098i++;
                    g[] gVarArr = gVar6.f23146p0;
                    d[] dVarArr4 = gVar6.R;
                    gVarArr[i26] = null;
                    gVar6.f23144o0[i26] = null;
                    if (gVar6.f23133i0 != i25) {
                        gVar6.k(i26);
                        f fVar = f.MATCH_CONSTRAINT;
                        dVarArr4[i27].e();
                        int i28 = i27 + 1;
                        dVarArr4[i28].e();
                        dVarArr4[i27].e();
                        dVarArr4[i28].e();
                        if (bVar.f23091b == null) {
                            bVar.f23091b = gVar6;
                        }
                        bVar.f23093d = gVar6;
                        f fVar2 = gVar6.U[i26];
                        if (fVar2 == fVar) {
                            i21 = i24;
                            int i29 = gVar6.f23153t[i26];
                            i22 = i26;
                            if (i29 == 0 || i29 == 3 || i29 == 2) {
                                bVar.f23099j++;
                                float f14 = gVar6.f23142n0[i22];
                                if (f14 > CropImageView.DEFAULT_ASPECT_RATIO) {
                                    f13 = f14;
                                    bVar.f23100k += f13;
                                } else {
                                    f13 = f14;
                                }
                                if (gVar6.f23133i0 != 8 && fVar2 == fVar && (i29 == 0 || i29 == 3)) {
                                    if (f13 < CropImageView.DEFAULT_ASPECT_RATIO) {
                                        bVar.f23102n = true;
                                    } else {
                                        bVar.f23103o = true;
                                    }
                                    if (bVar.f23097h == null) {
                                        bVar.f23097h = new ArrayList();
                                    }
                                    bVar.f23097h.add(gVar6);
                                }
                                if (bVar.f23095f == null) {
                                    bVar.f23095f = gVar6;
                                }
                                g gVar8 = bVar.f23096g;
                                if (gVar8 != null) {
                                    gVar8.f23144o0[i22] = gVar6;
                                }
                                bVar.f23096g = gVar6;
                            }
                            if (i22 == 0) {
                                if (gVar6.f23149r == 0 && gVar6.f23155u == 0) {
                                    int i30 = gVar6.f23156v;
                                }
                            } else if (gVar6.f23151s == 0 && gVar6.f23158x == 0) {
                                int i31 = gVar6.f23159y;
                            }
                        } else {
                            i21 = i24;
                            i22 = i26;
                            dVarArr3 = dVarArr3;
                        }
                    } else {
                        i21 = i24;
                        i22 = i26;
                        dVarArr3 = dVarArr3;
                    }
                    if (gVar7 != gVar6) {
                        gVar7.f23146p0[i22] = gVar6;
                    }
                    d dVar7 = dVarArr4[i27 + 1].f23111f;
                    if (dVar7 != null) {
                        gVar4 = dVar7.f23109d;
                        d dVar8 = gVar4.R[i27].f23111f;
                        if (dVar8 == null || dVar8.f23109d != gVar6) {
                            gVar4 = null;
                        }
                    } else {
                        gVar4 = null;
                    }
                    if (gVar4 == null) {
                        gVar4 = gVar6;
                        z15 = true;
                    }
                    gVar7 = gVar6;
                    i26 = i22;
                    dVarArr3 = dVarArr3;
                    i25 = 8;
                    gVar6 = gVar4;
                    i24 = i21;
                }
                i14 = i24;
                int i32 = i26;
                dVarArr = dVarArr3;
                g gVar9 = bVar.f23091b;
                if (gVar9 != null) {
                    gVar9.R[i27].e();
                }
                g gVar10 = bVar.f23093d;
                if (gVar10 != null) {
                    gVar10.R[i27 + 1].e();
                }
                bVar.f23092c = gVar6;
                if (i32 == 0 && bVar.m) {
                    bVar.f23094e = gVar6;
                } else {
                    bVar.f23094e = gVar5;
                }
                bVar.f23104p = bVar.f23103o && bVar.f23102n;
            }
            bVar.f23105q = true;
            if (arrayList == 0 || arrayList.contains(gVar5)) {
                g gVar11 = bVar.f23092c;
                g gVar12 = bVar.f23091b;
                g gVar13 = bVar.f23093d;
                g gVar14 = bVar.f23094e;
                float f15 = bVar.f23100k;
                f[] fVarArr = hVar11.U;
                d[] dVarArr5 = hVar11.R;
                boolean z16 = fVarArr[i11] == f.WRAP_CONTENT;
                if (i11 == 0) {
                    int i33 = gVar14.f23139l0;
                    boolean z17 = i33 == 0;
                    z11 = i33 == 1;
                    z12 = i33 == 2;
                    z13 = z17;
                } else {
                    int i34 = gVar14.f23140m0;
                    boolean z18 = i34 == 0;
                    z11 = i34 == 1;
                    z12 = i34 == 2;
                    z13 = z18;
                }
                boolean z19 = false;
                while (!z19) {
                    d[] dVarArr6 = gVar5.R;
                    d dVar9 = dVarArr6[i13];
                    int i35 = z12 ? 1 : 4;
                    int iE = dVar9.e();
                    d[] dVarArr7 = dVarArr5;
                    f fVar3 = gVar5.U[i11];
                    boolean z20 = z12;
                    f fVar4 = f.MATCH_CONSTRAINT;
                    boolean z21 = fVar3 == fVar4 && gVar5.f23153t[i11] == 0;
                    d dVar10 = dVar9.f23111f;
                    if (dVar10 != null && gVar5 != gVar5) {
                        iE = dVar10.e() + iE;
                    }
                    int i36 = iE;
                    if (z20 && gVar5 != gVar5 && gVar5 != gVar12) {
                        i35 = 8;
                    }
                    g gVar15 = gVar5;
                    d dVar11 = dVar9.f23111f;
                    if (dVar11 != null) {
                        if (gVar5 == gVar12) {
                            cVar.f(dVar9.f23114i, dVar11.f23114i, i36, 6);
                        } else {
                            cVar.f(dVar9.f23114i, dVar11.f23114i, i36, 8);
                        }
                        if (z21 && !z20) {
                            i35 = 5;
                        }
                        cVar.e(dVar9.f23114i, dVar9.f23111f.f23114i, i36, (gVar5 == gVar12 && z20 && gVar5.T[i11]) ? 5 : i35);
                    } else {
                        i23 = i23;
                    }
                    if (z16) {
                        if (gVar5.f23133i0 == 8 || gVar5.U[i11] != fVar4) {
                            i19 = 0;
                        } else {
                            i19 = 0;
                            cVar.f(dVarArr6[i13 + 1].f23114i, dVarArr6[i13].f23114i, 0, 5);
                        }
                        cVar.f(dVarArr6[i13].f23114i, dVarArr7[i13].f23114i, i19, 8);
                    }
                    d dVar12 = dVarArr6[i13 + 1].f23111f;
                    if (dVar12 != null) {
                        gVar3 = dVar12.f23109d;
                        d dVar13 = gVar3.R[i13].f23111f;
                        if (dVar13 == null || dVar13.f23109d != gVar5) {
                            gVar3 = null;
                        }
                    } else {
                        gVar3 = null;
                    }
                    if (gVar3 != null) {
                        gVar5 = gVar3;
                    } else {
                        z19 = true;
                    }
                    gVar5 = gVar15;
                    dVarArr5 = dVarArr7;
                    z12 = z20;
                    i23 = i23;
                }
                d[] dVarArr8 = dVarArr5;
                boolean z22 = z12;
                i15 = i23;
                if (gVar13 != null) {
                    int i37 = i13 + 1;
                    if (gVar11.R[i37].f23111f != null) {
                        d dVar14 = gVar13.R[i37];
                        if (gVar13.U[i11] == f.MATCH_CONSTRAINT && gVar13.f23153t[i11] == 0 && !z22) {
                            d dVar15 = dVar14.f23111f;
                            if (dVar15.f23109d == hVar11) {
                                cVar.e(dVar14.f23114i, dVar15.f23114i, -dVar14.e(), 5);
                            } else if (z22) {
                                dVar6 = dVar14.f23111f;
                                if (dVar6.f23109d == hVar11) {
                                    cVar.e(dVar14.f23114i, dVar6.f23114i, -dVar14.e(), 4);
                                }
                            }
                        } else if (z22) {
                            dVar6 = dVar14.f23111f;
                            if (dVar6.f23109d == hVar11) {
                                cVar.e(dVar14.f23114i, dVar6.f23114i, -dVar14.e(), 4);
                            }
                        }
                        cVar.g(dVar14.f23114i, gVar11.R[i37].f23111f.f23114i, -dVar14.e(), 6);
                    }
                }
                if (z16 != 0) {
                    int i38 = i13 + 1;
                    b4.h hVar12 = dVarArr8[i38].f23114i;
                    d dVar16 = gVar11.R[i38];
                    cVar.f(hVar12, dVar16.f23114i, dVar16.e(), 8);
                }
                ArrayList arrayList3 = bVar.f23097h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (bVar.f23102n && !bVar.f23104p) {
                        f15 = bVar.f23099j;
                    }
                    g gVar16 = null;
                    float f16 = f5;
                    int i39 = 0;
                    while (i39 < size) {
                        g gVar17 = (g) arrayList3.get(i39);
                        float[] fArr = gVar17.f23142n0;
                        d[] dVarArr9 = gVar17.R;
                        float f17 = fArr[i11];
                        if (f17 >= f5) {
                            arrayList2 = arrayList3;
                            if (f17 == f5) {
                                cVar.e(dVarArr9[i13 + 1].f23114i, dVarArr9[i13].f23114i, 0, 8);
                                size = size;
                                i39 = i39;
                                f11 = f5;
                                f16 = f16;
                            } else {
                                float f18 = f16;
                                if (gVar16 != null) {
                                    d[] dVarArr10 = gVar16.R;
                                    hVar7 = dVarArr10[i13].f23114i;
                                    int i40 = i13 + 1;
                                    hVar8 = dVarArr10[i40].f23114i;
                                    hVar9 = dVarArr9[i13].f23114i;
                                    hVar10 = dVarArr9[i40].f23114i;
                                    bVarL = cVar.l();
                                    f12 = f5;
                                    bVarL.f3888b = f12;
                                    f11 = f12;
                                    if (f15 != f12 || f18 == f17) {
                                        bVarL.f3890d.g(hVar7, 1.0f);
                                        bVarL.f3890d.g(hVar8, -1.0f);
                                        bVarL.f3890d.g(hVar10, 1.0f);
                                        bVarL.f3890d.g(hVar9, -1.0f);
                                    } else if (f18 == f11) {
                                        bVarL.f3890d.g(hVar7, 1.0f);
                                        bVarL.f3890d.g(hVar8, -1.0f);
                                    } else if (f17 == f5) {
                                        bVarL.f3890d.g(hVar9, 1.0f);
                                        bVarL.f3890d.g(hVar10, -1.0f);
                                    } else {
                                        float f19 = (f18 / f15) / (f17 / f15);
                                        bVarL.f3890d.g(hVar7, 1.0f);
                                        bVarL.f3890d.g(hVar8, -1.0f);
                                        bVarL.f3890d.g(hVar10, f19);
                                        bVarL.f3890d.g(hVar9, -f19);
                                    }
                                    cVar.c(bVarL);
                                } else {
                                    i39 = i39;
                                    f11 = f5;
                                    f17 = f17;
                                }
                                f16 = f17;
                                gVar16 = gVar17;
                            }
                        } else {
                            if (bVar.f23104p) {
                                arrayList2 = arrayList3;
                                cVar.e(dVarArr9[i13 + 1].f23114i, dVarArr9[i13].f23114i, 0, 4);
                            } else {
                                f17 = 1.0f;
                                arrayList2 = arrayList3;
                                if (f17 == f5) {
                                    cVar.e(dVarArr9[i13 + 1].f23114i, dVarArr9[i13].f23114i, 0, 8);
                                } else {
                                    float f110 = f16;
                                    if (gVar16 != null) {
                                        d[] dVarArr11 = gVar16.R;
                                        hVar7 = dVarArr11[i13].f23114i;
                                        int i41 = i13 + 1;
                                        hVar8 = dVarArr11[i41].f23114i;
                                        hVar9 = dVarArr9[i13].f23114i;
                                        hVar10 = dVarArr9[i41].f23114i;
                                        bVarL = cVar.l();
                                        f12 = f5;
                                        bVarL.f3888b = f12;
                                        f11 = f12;
                                        if (f15 != f12) {
                                            bVarL.f3890d.g(hVar7, 1.0f);
                                            bVarL.f3890d.g(hVar8, -1.0f);
                                            bVarL.f3890d.g(hVar10, 1.0f);
                                            bVarL.f3890d.g(hVar9, -1.0f);
                                        } else {
                                            bVarL.f3890d.g(hVar7, 1.0f);
                                            bVarL.f3890d.g(hVar8, -1.0f);
                                            bVarL.f3890d.g(hVar10, 1.0f);
                                            bVarL.f3890d.g(hVar9, -1.0f);
                                        }
                                        cVar.c(bVarL);
                                    } else {
                                        i39 = i39;
                                        f11 = f5;
                                        f17 = f17;
                                    }
                                    f16 = f17;
                                    gVar16 = gVar17;
                                }
                            }
                            size = size;
                            i39 = i39;
                            f11 = f5;
                            f16 = f16;
                        }
                        i39++;
                        arrayList3 = arrayList2;
                        size = size;
                        f5 = f11;
                    }
                }
                if (gVar12 == null || !(gVar12 == gVar13 || z22)) {
                    gVar = gVar13;
                    if (!z13 || gVar12 == null) {
                        int i42 = 8;
                        if (z11 && gVar12 != null) {
                            int i43 = bVar.f23099j;
                            boolean z23 = i43 > 0 && bVar.f23098i == i43;
                            g gVar18 = gVar12;
                            g gVar19 = gVar18;
                            while (gVar19 != null) {
                                d[] dVarArr12 = gVar19.R;
                                g gVar20 = gVar19.f23146p0[i11];
                                while (gVar20 != null && gVar20.f23133i0 == i42) {
                                    gVar20 = gVar20.f23146p0[i11];
                                }
                                if (gVar19 == gVar12 || gVar19 == gVar || gVar20 == null) {
                                    gVar18 = gVar18;
                                } else {
                                    if (gVar20 == gVar) {
                                        gVar20 = null;
                                    }
                                    d dVar17 = dVarArr12[i13];
                                    b4.h hVar13 = dVar17.f23114i;
                                    int i44 = i13 + 1;
                                    b4.h hVar14 = gVar18.R[i44].f23114i;
                                    int iE2 = dVar17.e();
                                    int iE3 = dVarArr12[i44].e();
                                    if (gVar20 != null) {
                                        dVar = gVar20.R[i13];
                                        hVar3 = dVar.f23114i;
                                        d dVar18 = dVar.f23111f;
                                        hVar2 = dVar18 != null ? dVar18.f23114i : null;
                                    } else {
                                        d dVar19 = gVar.R[i13];
                                        b4.h hVar15 = dVar19 != null ? dVar19.f23114i : null;
                                        hVar2 = dVarArr12[i44].f23114i;
                                        dVar = dVar19;
                                        hVar3 = hVar15;
                                    }
                                    if (dVar != null) {
                                        iE3 += dVar.e();
                                    }
                                    int iE4 = iE2 + gVar18.R[i44].e();
                                    int i45 = z23 ? 8 : 4;
                                    if (hVar13 != null && hVar14 != null && hVar3 != null && hVar2 != null) {
                                        cVar.b(hVar13, hVar14, iE4, 0.5f, hVar3, hVar2, iE3, i45);
                                    }
                                    gVar20 = gVar20;
                                }
                                if (gVar19.f23133i0 != 8) {
                                    gVar18 = gVar19;
                                }
                                gVar19 = gVar20;
                                gVar18 = gVar18;
                                i42 = 8;
                            }
                            cVar2 = cVar;
                            d dVar20 = gVar12.R[i13];
                            d dVar21 = dVarArr[i13].f23111f;
                            int i46 = i13 + 1;
                            d dVar22 = gVar.R[i46];
                            d dVar23 = gVar11.R[i46].f23111f;
                            if (dVar21 != null) {
                                if (gVar12 != gVar) {
                                    cVar2.e(dVar20.f23114i, dVar21.f23114i, dVar20.e(), 5);
                                } else if (dVar23 != null) {
                                    cVar2.b(dVar20.f23114i, dVar21.f23114i, dVar20.e(), 0.5f, dVar22.f23114i, dVar23.f23114i, dVar22.e(), 5);
                                }
                            }
                            if (dVar23 != null && gVar12 != gVar) {
                                cVar2.e(dVar22.f23114i, dVar23.f23114i, -dVar22.e(), 5);
                            }
                        }
                        if ((z13 || z11) && gVar12 != null && gVar12 != gVar) {
                            dVarArr2 = gVar12.R;
                            d dVar24 = dVarArr2[i13];
                            if (gVar == null) {
                                gVar = gVar12;
                            }
                            d[] dVarArr13 = gVar.R;
                            i18 = i13 + 1;
                            dVar3 = dVarArr13[i18];
                            dVar4 = dVar24.f23111f;
                            if (dVar4 != null) {
                                hVar5 = dVar4.f23114i;
                            } else {
                                hVar5 = null;
                            }
                            dVar5 = dVar3.f23111f;
                            if (dVar5 != null) {
                                hVar6 = dVar5.f23114i;
                            } else {
                                hVar6 = null;
                            }
                            if (gVar11 != gVar) {
                                d dVar25 = gVar11.R[i18].f23111f;
                                hVar6 = dVar25 != null ? dVar25.f23114i : null;
                            }
                            if (gVar12 == gVar) {
                                dVar3 = dVarArr2[i18];
                            }
                            if (hVar5 == null && hVar6 != null) {
                                cVar2.b(dVar24.f23114i, hVar5, dVar24.e(), 0.5f, hVar6, dVar3.f23114i, dVarArr13[i18].e(), 5);
                            }
                        }
                    } else {
                        int i47 = bVar.f23099j;
                        boolean z24 = i47 > 0 && bVar.f23098i == i47;
                        g gVar21 = gVar12;
                        g gVar22 = gVar21;
                        while (gVar21 != null) {
                            d[] dVarArr14 = gVar21.R;
                            g gVar23 = gVar21.f23146p0[i11];
                            while (true) {
                                if (gVar23 == null) {
                                    i16 = 8;
                                    break;
                                }
                                i16 = 8;
                                if (gVar23.f23133i0 != 8) {
                                    break;
                                } else {
                                    gVar23 = gVar23.f23146p0[i11];
                                }
                            }
                            if (gVar23 != null || gVar21 == gVar) {
                                d dVar26 = dVarArr14[i13];
                                b4.h hVar16 = dVar26.f23114i;
                                d dVar27 = dVar26.f23111f;
                                b4.h hVar17 = dVar27 != null ? dVar27.f23114i : null;
                                if (gVar22 != gVar21) {
                                    hVar17 = gVar22.R[i13 + 1].f23114i;
                                } else if (gVar21 == gVar12) {
                                    d dVar28 = dVarArr[i13].f23111f;
                                    hVar17 = dVar28 != null ? dVar28.f23114i : null;
                                }
                                int iE5 = dVar26.e();
                                int i48 = i13 + 1;
                                int iE6 = dVarArr14[i48].e();
                                if (gVar23 != null) {
                                    dVar2 = gVar23.R[i13];
                                    hVar4 = dVar2.f23114i;
                                } else {
                                    dVar2 = gVar11.R[i48].f23111f;
                                    hVar4 = dVar2 != null ? dVar2.f23114i : null;
                                }
                                b4.h hVar18 = dVarArr14[i48].f23114i;
                                if (dVar2 != null) {
                                    iE6 += dVar2.e();
                                }
                                int iE7 = gVar22.R[i48].e() + iE5;
                                if (hVar16 == null || hVar17 == null || hVar4 == null || hVar18 == null) {
                                    gVar2 = gVar23;
                                    i17 = 8;
                                } else {
                                    if (gVar21 == gVar12) {
                                        iE7 = gVar12.R[i13].e();
                                    }
                                    if (gVar21 == gVar) {
                                        iE6 = gVar.R[i48].e();
                                    }
                                    gVar2 = gVar23;
                                    i17 = 8;
                                    cVar.b(hVar16, hVar17, iE7, 0.5f, hVar4, hVar18, iE6, z24 ? 8 : 5);
                                }
                            } else {
                                gVar2 = gVar23;
                                i17 = i16;
                            }
                            if (gVar21.f23133i0 != i17) {
                                gVar22 = gVar21;
                            }
                            gVar21 = gVar2;
                            gVar22 = gVar22;
                        }
                    }
                } else {
                    d dVar29 = dVarArr[i13];
                    int i49 = i13 + 1;
                    d dVar30 = gVar11.R[i49];
                    d dVar31 = dVar29.f23111f;
                    b4.h hVar19 = dVar31 != null ? dVar31.f23114i : null;
                    d dVar32 = dVar30.f23111f;
                    b4.h hVar20 = dVar32 != null ? dVar32.f23114i : null;
                    d dVar33 = gVar12.R[i13];
                    if (gVar13 != null) {
                        dVar30 = gVar13.R[i49];
                    }
                    if (hVar19 == null || hVar20 == null) {
                        gVar = gVar13;
                    } else {
                        float f21 = i11 == 0 ? gVar14.f23127f0 : gVar14.f23129g0;
                        int iE8 = dVar33.e();
                        int iE9 = dVar30.e();
                        b4.h hVar21 = dVar33.f23114i;
                        b4.h hVar22 = dVar30.f23114i;
                        b4.h hVar23 = hVar19;
                        gVar = gVar13;
                        cVar.b(hVar21, hVar23, iE8, f21, hVar20, hVar22, iE9, 7);
                    }
                }
                cVar2 = cVar;
                if (z13) {
                    dVarArr2 = gVar12.R;
                    d dVar210 = dVarArr2[i13];
                    if (gVar == null) {
                        gVar = gVar12;
                    }
                    d[] dVarArr15 = gVar.R;
                    i18 = i13 + 1;
                    dVar3 = dVarArr15[i18];
                    dVar4 = dVar210.f23111f;
                    if (dVar4 != null) {
                        hVar5 = dVar4.f23114i;
                    } else {
                        hVar5 = null;
                    }
                    dVar5 = dVar3.f23111f;
                    if (dVar5 != null) {
                        hVar6 = dVar5.f23114i;
                    } else {
                        hVar6 = null;
                    }
                    if (gVar11 != gVar) {
                        d dVar211 = gVar11.R[i18].f23111f;
                        hVar6 = dVar211 != null ? dVar211.f23114i : null;
                    }
                    if (gVar12 == gVar) {
                        dVar3 = dVarArr2[i18];
                    }
                    if (hVar5 == null) {
                    }
                } else {
                    dVarArr2 = gVar12.R;
                    d dVar212 = dVarArr2[i13];
                    if (gVar == null) {
                        gVar = gVar12;
                    }
                    d[] dVarArr16 = gVar.R;
                    i18 = i13 + 1;
                    dVar3 = dVarArr16[i18];
                    dVar4 = dVar212.f23111f;
                    if (dVar4 != null) {
                        hVar5 = dVar4.f23114i;
                    } else {
                        hVar5 = null;
                    }
                    dVar5 = dVar3.f23111f;
                    if (dVar5 != null) {
                        hVar6 = dVar5.f23114i;
                    } else {
                        hVar6 = null;
                    }
                    if (gVar11 != gVar) {
                        d dVar213 = gVar11.R[i18].f23111f;
                        hVar6 = dVar213 != null ? dVar213.f23114i : null;
                    }
                    if (gVar12 == gVar) {
                        dVar3 = dVarArr2[i18];
                    }
                    if (hVar5 == null) {
                    }
                }
            } else {
                i15 = i23;
            }
            i24 = i14 + 1;
            hVar11 = hVar;
            i23 = i15;
        }
    }

    public static void b(h hVar, b4.c cVar, g gVar) {
        gVar.f23143o = -1;
        d dVar = gVar.N;
        d dVar2 = gVar.M;
        d dVar3 = gVar.K;
        d dVar4 = gVar.L;
        d dVar5 = gVar.J;
        gVar.f23145p = -1;
        f fVar = hVar.U[0];
        f fVar2 = f.WRAP_CONTENT;
        if (fVar != fVar2 && gVar.U[0] == f.MATCH_PARENT) {
            int i11 = dVar5.f23112g;
            int iR = hVar.r() - dVar4.f23112g;
            dVar5.f23114i = cVar.k(dVar5);
            dVar4.f23114i = cVar.k(dVar4);
            cVar.d(dVar5.f23114i, i11);
            cVar.d(dVar4.f23114i, iR);
            gVar.f23143o = 2;
            gVar.f23117a0 = i11;
            int i12 = iR - i11;
            gVar.W = i12;
            int i13 = gVar.f23123d0;
            if (i12 < i13) {
                gVar.W = i13;
            }
        }
        if (hVar.U[1] == fVar2 || gVar.U[1] != f.MATCH_PARENT) {
            return;
        }
        int i14 = dVar3.f23112g;
        int iL = hVar.l() - dVar2.f23112g;
        dVar3.f23114i = cVar.k(dVar3);
        dVar2.f23114i = cVar.k(dVar2);
        cVar.d(dVar3.f23114i, i14);
        cVar.d(dVar2.f23114i, iL);
        if (gVar.f23121c0 > 0 || gVar.f23133i0 == 8) {
            b4.h hVarK = cVar.k(dVar);
            dVar.f23114i = hVarK;
            cVar.d(hVarK, gVar.f23121c0 + i14);
        }
        gVar.f23145p = 2;
        gVar.f23119b0 = i14;
        int i15 = iL - i14;
        gVar.X = i15;
        int i16 = gVar.f23125e0;
        if (i15 < i16) {
            gVar.X = i16;
        }
    }

    public static final boolean c(int i11, int i12) {
        return (i11 & i12) == i12;
    }
}
