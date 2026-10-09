package e4;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f24813k = new int[2];

    public static void m(int[] iArr, int i11, int i12, int i13, int i14, float f5, int i15) {
        int i16 = i12 - i11;
        int i17 = i14 - i13;
        if (i15 != -1) {
            if (i15 == 0) {
                iArr[0] = (int) ((i17 * f5) + 0.5f);
                iArr[1] = i17;
                return;
            } else {
                if (i15 != 1) {
                    return;
                }
                iArr[0] = i16;
                iArr[1] = (int) ((i16 * f5) + 0.5f);
                return;
            }
        }
        int i18 = (int) ((i17 * f5) + 0.5f);
        int i19 = (int) ((i16 / f5) + 0.5f);
        if (i18 <= i16) {
            iArr[0] = i18;
            iArr[1] = i17;
        } else if (i19 <= i17) {
            iArr[0] = i16;
            iArr[1] = i19;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0262  */
    /* JADX WARN: Code duplicated, block: B:117:0x0271  */
    @Override // e4.d
    public final void a(d dVar) {
        int iG;
        int i11;
        int iG2;
        float f5;
        float f11;
        float f12;
        int i12;
        if (l.f24812a[this.f24835j.ordinal()] == 3) {
            d4.g gVar = this.f24827b;
            l(gVar.J, gVar.L, 0);
            return;
        }
        h hVar = this.f24830e;
        boolean z11 = hVar.f24808j;
        g gVar2 = this.f24833h;
        g gVar3 = this.f24834i;
        if (!z11 && this.f24829d == d4.f.MATCH_CONSTRAINT) {
            d4.g gVar4 = this.f24827b;
            int i13 = gVar4.f23149r;
            if (i13 == 2) {
                d4.g gVar5 = gVar4.V;
                if (gVar5 != null) {
                    h hVar2 = gVar5.f23122d.f24830e;
                    if (hVar2.f24808j) {
                        hVar.d((int) ((hVar2.f24805g * gVar4.f23157w) + 0.5f));
                    }
                }
            } else if (i13 == 3) {
                int i14 = gVar4.f23151s;
                if (i14 == 0 || i14 == 3) {
                    p pVar = gVar4.f23124e;
                    g gVar6 = pVar.f24833h;
                    g gVar7 = pVar.f24834i;
                    boolean z12 = gVar4.J.f23111f != null;
                    boolean z13 = gVar4.K.f23111f != null;
                    boolean z14 = gVar4.L.f23111f != null;
                    boolean z15 = gVar4.M.f23111f != null;
                    int i15 = gVar4.Z;
                    if (z12 && z13 && z14 && z15) {
                        float f13 = gVar4.Y;
                        boolean z16 = gVar6.f24808j;
                        ArrayList arrayList = gVar6.f24810l;
                        int[] iArr = f24813k;
                        if (z16 && gVar7.f24808j) {
                            if (gVar2.f24801c && gVar3.f24801c) {
                                m(iArr, ((g) gVar2.f24810l.get(0)).f24805g + gVar2.f24804f, ((g) gVar3.f24810l.get(0)).f24805g - gVar3.f24804f, gVar6.f24805g + gVar6.f24804f, gVar7.f24805g - gVar7.f24804f, f13, i15);
                                hVar.d(iArr[0]);
                                this.f24827b.f23124e.f24830e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (gVar2.f24808j && gVar3.f24808j) {
                            if (!gVar6.f24801c || !gVar7.f24801c) {
                                return;
                            }
                            m(iArr, gVar2.f24805g + gVar2.f24804f, gVar3.f24805g - gVar3.f24804f, ((g) arrayList.get(0)).f24805g + gVar6.f24804f, ((g) gVar7.f24810l.get(0)).f24805g - gVar7.f24804f, f13, i15);
                            hVar.d(iArr[0]);
                            this.f24827b.f23124e.f24830e.d(iArr[1]);
                        }
                        if (!gVar2.f24801c || !gVar3.f24801c || !gVar6.f24801c || !gVar7.f24801c) {
                            return;
                        }
                        m(iArr, ((g) gVar2.f24810l.get(0)).f24805g + gVar2.f24804f, ((g) gVar3.f24810l.get(0)).f24805g - gVar3.f24804f, ((g) arrayList.get(0)).f24805g + gVar6.f24804f, ((g) gVar7.f24810l.get(0)).f24805g - gVar7.f24804f, f13, i15);
                        hVar.d(iArr[0]);
                        this.f24827b.f23124e.f24830e.d(iArr[1]);
                    } else if (z12 && z14) {
                        if (!gVar2.f24801c || !gVar3.f24801c) {
                            return;
                        }
                        float f14 = gVar4.Y;
                        int i16 = ((g) gVar2.f24810l.get(0)).f24805g + gVar2.f24804f;
                        int i17 = ((g) gVar3.f24810l.get(0)).f24805g - gVar3.f24804f;
                        if (i15 == -1 || i15 == 0) {
                            int iG3 = g(i17 - i16, 0);
                            int i18 = (int) ((iG3 * f14) + 0.5f);
                            int iG4 = g(i18, 1);
                            if (i18 != iG4) {
                                iG3 = (int) ((iG4 / f14) + 0.5f);
                            }
                            hVar.d(iG3);
                            this.f24827b.f23124e.f24830e.d(iG4);
                        } else if (i15 == 1) {
                            int iG5 = g(i17 - i16, 0);
                            int i19 = (int) ((iG5 / f14) + 0.5f);
                            int iG6 = g(i19, 1);
                            if (i19 != iG6) {
                                iG5 = (int) ((iG6 * f14) + 0.5f);
                            }
                            hVar.d(iG5);
                            this.f24827b.f23124e.f24830e.d(iG6);
                        }
                    } else if (z13 && z15) {
                        if (!gVar6.f24801c || !gVar7.f24801c) {
                            return;
                        }
                        float f15 = gVar4.Y;
                        int i21 = ((g) gVar6.f24810l.get(0)).f24805g + gVar6.f24804f;
                        int i22 = ((g) gVar7.f24810l.get(0)).f24805g - gVar7.f24804f;
                        if (i15 == -1) {
                            iG = g(i22 - i21, 1);
                            i11 = (int) ((iG / f15) + 0.5f);
                            iG2 = g(i11, 0);
                            if (i11 != iG2) {
                                iG = (int) ((iG2 * f15) + 0.5f);
                            }
                            hVar.d(iG2);
                            this.f24827b.f23124e.f24830e.d(iG);
                        } else if (i15 == 0) {
                            int iG7 = g(i22 - i21, 1);
                            int i23 = (int) ((iG7 * f15) + 0.5f);
                            int iG8 = g(i23, 0);
                            if (i23 != iG8) {
                                iG7 = (int) ((iG8 / f15) + 0.5f);
                            }
                            hVar.d(iG8);
                            this.f24827b.f23124e.f24830e.d(iG7);
                        } else if (i15 == 1) {
                            iG = g(i22 - i21, 1);
                            i11 = (int) ((iG / f15) + 0.5f);
                            iG2 = g(i11, 0);
                            if (i11 != iG2) {
                                iG = (int) ((iG2 * f15) + 0.5f);
                            }
                            hVar.d(iG2);
                            this.f24827b.f23124e.f24830e.d(iG);
                        }
                    }
                } else {
                    int i24 = gVar4.Z;
                    if (i24 != -1) {
                        if (i24 == 0) {
                            f12 = gVar4.f23124e.f24830e.f24805g / gVar4.Y;
                            i12 = (int) (f12 + 0.5f);
                        } else if (i24 != 1) {
                            i12 = 0;
                        } else {
                            f5 = gVar4.f23124e.f24830e.f24805g;
                            f11 = gVar4.Y;
                        }
                        hVar.d(i12);
                    } else {
                        f5 = gVar4.f23124e.f24830e.f24805g;
                        f11 = gVar4.Y;
                    }
                    f12 = f5 * f11;
                    i12 = (int) (f12 + 0.5f);
                    hVar.d(i12);
                }
            }
        }
        boolean z17 = gVar2.f24801c;
        ArrayList arrayList2 = gVar2.f24810l;
        if (z17) {
            boolean z18 = gVar3.f24801c;
            ArrayList arrayList3 = gVar3.f24810l;
            if (z18) {
                if (gVar2.f24808j && gVar3.f24808j && hVar.f24808j) {
                    return;
                }
                if (!hVar.f24808j && this.f24829d == d4.f.MATCH_CONSTRAINT) {
                    d4.g gVar8 = this.f24827b;
                    if (gVar8.f23149r == 0 && !gVar8.y()) {
                        g gVar9 = (g) arrayList2.get(0);
                        g gVar10 = (g) arrayList3.get(0);
                        int i25 = gVar9.f24805g + gVar2.f24804f;
                        int i26 = gVar10.f24805g + gVar3.f24804f;
                        gVar2.d(i25);
                        gVar3.d(i26);
                        hVar.d(i26 - i25);
                        return;
                    }
                }
                if (!hVar.f24808j && this.f24829d == d4.f.MATCH_CONSTRAINT && this.f24826a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((g) arrayList3.get(0)).f24805g + gVar3.f24804f) - (((g) arrayList2.get(0)).f24805g + gVar2.f24804f), hVar.m);
                    d4.g gVar11 = this.f24827b;
                    int i27 = gVar11.f23156v;
                    int iMax = Math.max(gVar11.f23155u, iMin);
                    if (i27 > 0) {
                        iMax = Math.min(i27, iMax);
                    }
                    hVar.d(iMax);
                }
                if (hVar.f24808j) {
                    g gVar12 = (g) arrayList2.get(0);
                    g gVar13 = (g) arrayList3.get(0);
                    int i28 = gVar12.f24805g;
                    int i29 = gVar2.f24804f + i28;
                    int i30 = gVar13.f24805g;
                    int i31 = gVar3.f24804f + i30;
                    float f16 = this.f24827b.f23127f0;
                    if (gVar12 == gVar13) {
                        f16 = 0.5f;
                    } else {
                        i28 = i29;
                        i30 = i31;
                    }
                    gVar2.d((int) ((((i30 - i28) - hVar.f24805g) * f16) + i28 + 0.5f));
                    gVar3.d(gVar2.f24805g + hVar.f24805g);
                }
            }
        }
    }

    @Override // e4.t
    public final void d() {
        d4.g gVar;
        d4.g gVar2;
        d4.f fVar;
        d4.g gVar3;
        d4.g gVar4;
        d4.f fVar2;
        d4.g gVar5 = this.f24827b;
        boolean z11 = gVar5.f23116a;
        h hVar = this.f24830e;
        if (z11) {
            hVar.d(gVar5.r());
        }
        boolean z12 = hVar.f24808j;
        ArrayList arrayList = hVar.f24809k;
        ArrayList arrayList2 = hVar.f24810l;
        g gVar6 = this.f24834i;
        g gVar7 = this.f24833h;
        if (z12) {
            d4.f fVar3 = this.f24829d;
            d4.f fVar4 = d4.f.MATCH_PARENT;
            if (fVar3 == fVar4 && (gVar2 = (gVar = this.f24827b).V) != null && ((fVar = gVar2.U[0]) == d4.f.FIXED || fVar == fVar4)) {
                t.b(gVar7, gVar2.f23122d.f24833h, gVar.J.e());
                t.b(gVar6, gVar2.f23122d.f24834i, -this.f24827b.L.e());
                return;
            }
        } else {
            d4.g gVar8 = this.f24827b;
            d4.f fVar5 = gVar8.U[0];
            this.f24829d = fVar5;
            if (fVar5 != d4.f.MATCH_CONSTRAINT) {
                d4.f fVar6 = d4.f.MATCH_PARENT;
                if (fVar5 == fVar6 && (gVar4 = gVar8.V) != null && ((fVar2 = gVar4.U[0]) == d4.f.FIXED || fVar2 == fVar6)) {
                    int iR = (gVar4.r() - this.f24827b.J.e()) - this.f24827b.L.e();
                    t.b(gVar7, gVar4.f23122d.f24833h, this.f24827b.J.e());
                    t.b(gVar6, gVar4.f23122d.f24834i, -this.f24827b.L.e());
                    hVar.d(iR);
                    return;
                }
                if (fVar5 == d4.f.FIXED) {
                    hVar.d(gVar8.r());
                }
            }
        }
        if (hVar.f24808j) {
            d4.g gVar9 = this.f24827b;
            if (gVar9.f23116a) {
                d4.d[] dVarArr = gVar9.R;
                d4.d dVar = dVarArr[0];
                d4.d dVar2 = dVar.f23111f;
                if (dVar2 != null && dVarArr[1].f23111f != null) {
                    if (gVar9.y()) {
                        gVar7.f24804f = this.f24827b.R[0].e();
                        gVar6.f24804f = -this.f24827b.R[1].e();
                        return;
                    }
                    g gVarH = t.h(this.f24827b.R[0]);
                    if (gVarH != null) {
                        t.b(gVar7, gVarH, this.f24827b.R[0].e());
                    }
                    g gVarH2 = t.h(this.f24827b.R[1]);
                    if (gVarH2 != null) {
                        t.b(gVar6, gVarH2, -this.f24827b.R[1].e());
                    }
                    gVar7.f24800b = true;
                    gVar6.f24800b = true;
                    return;
                }
                if (dVar2 != null) {
                    g gVarH3 = t.h(dVar);
                    if (gVarH3 != null) {
                        t.b(gVar7, gVarH3, this.f24827b.R[0].e());
                        t.b(gVar6, gVar7, hVar.f24805g);
                        return;
                    }
                    return;
                }
                d4.d dVar3 = dVarArr[1];
                if (dVar3.f23111f != null) {
                    g gVarH4 = t.h(dVar3);
                    if (gVarH4 != null) {
                        t.b(gVar6, gVarH4, -this.f24827b.R[1].e());
                        t.b(gVar7, gVar6, -hVar.f24805g);
                        return;
                    }
                    return;
                }
                if ((gVar9 instanceof d4.m) || gVar9.V == null || gVar9.j(d4.c.CENTER).f23111f != null) {
                    return;
                }
                d4.g gVar10 = this.f24827b;
                t.b(gVar7, gVar10.V.f23122d.f24833h, gVar10.s());
                t.b(gVar6, gVar7, hVar.f24805g);
                return;
            }
        }
        if (this.f24829d == d4.f.MATCH_CONSTRAINT) {
            d4.g gVar11 = this.f24827b;
            int i11 = gVar11.f23149r;
            if (i11 == 2) {
                d4.g gVar12 = gVar11.V;
                if (gVar12 != null) {
                    h hVar2 = gVar12.f23124e.f24830e;
                    arrayList2.add(hVar2);
                    hVar2.f24809k.add(hVar);
                    hVar.f24800b = true;
                    arrayList.add(gVar7);
                    arrayList.add(gVar6);
                }
            } else if (i11 == 3) {
                if (gVar11.f23151s == 3) {
                    gVar7.f24799a = this;
                    gVar6.f24799a = this;
                    p pVar = gVar11.f23124e;
                    pVar.f24833h.f24799a = this;
                    pVar.f24834i.f24799a = this;
                    hVar.f24799a = this;
                    if (gVar11.z()) {
                        arrayList2.add(this.f24827b.f23124e.f24830e);
                        this.f24827b.f23124e.f24830e.f24809k.add(hVar);
                        p pVar2 = this.f24827b.f23124e;
                        pVar2.f24830e.f24799a = this;
                        arrayList2.add(pVar2.f24833h);
                        arrayList2.add(this.f24827b.f23124e.f24834i);
                        this.f24827b.f23124e.f24833h.f24809k.add(hVar);
                        this.f24827b.f23124e.f24834i.f24809k.add(hVar);
                    } else if (this.f24827b.y()) {
                        this.f24827b.f23124e.f24830e.f24810l.add(hVar);
                        arrayList.add(this.f24827b.f23124e.f24830e);
                    } else {
                        this.f24827b.f23124e.f24830e.f24810l.add(hVar);
                    }
                } else {
                    h hVar3 = gVar11.f23124e.f24830e;
                    arrayList2.add(hVar3);
                    hVar3.f24809k.add(hVar);
                    this.f24827b.f23124e.f24833h.f24809k.add(hVar);
                    this.f24827b.f23124e.f24834i.f24809k.add(hVar);
                    hVar.f24800b = true;
                    arrayList.add(gVar7);
                    arrayList.add(gVar6);
                    gVar7.f24810l.add(hVar);
                    gVar6.f24810l.add(hVar);
                }
            }
        }
        d4.g gVar13 = this.f24827b;
        d4.d[] dVarArr2 = gVar13.R;
        d4.d dVar4 = dVarArr2[0];
        d4.d dVar5 = dVar4.f23111f;
        if (dVar5 != null && dVarArr2[1].f23111f != null) {
            if (gVar13.y()) {
                gVar7.f24804f = this.f24827b.R[0].e();
                gVar6.f24804f = -this.f24827b.R[1].e();
                return;
            }
            g gVarH5 = t.h(this.f24827b.R[0]);
            g gVarH6 = t.h(this.f24827b.R[1]);
            if (gVarH5 != null) {
                gVarH5.b(this);
            }
            if (gVarH6 != null) {
                gVarH6.b(this);
            }
            this.f24835j = s.CENTER;
            return;
        }
        if (dVar5 != null) {
            g gVarH7 = t.h(dVar4);
            if (gVarH7 != null) {
                t.b(gVar7, gVarH7, this.f24827b.R[0].e());
                c(gVar6, gVar7, 1, hVar);
                return;
            }
            return;
        }
        d4.d dVar6 = dVarArr2[1];
        if (dVar6.f23111f != null) {
            g gVarH8 = t.h(dVar6);
            if (gVarH8 != null) {
                t.b(gVar6, gVarH8, -this.f24827b.R[1].e());
                c(gVar7, gVar6, -1, hVar);
                return;
            }
            return;
        }
        if ((gVar13 instanceof d4.m) || (gVar3 = gVar13.V) == null) {
            return;
        }
        t.b(gVar7, gVar3.f23122d.f24833h, gVar13.s());
        c(gVar6, gVar7, 1, hVar);
    }

    @Override // e4.t
    public final void e() {
        g gVar = this.f24833h;
        if (gVar.f24808j) {
            this.f24827b.f23117a0 = gVar.f24805g;
        }
    }

    @Override // e4.t
    public final void f() {
        this.f24828c = null;
        this.f24833h.c();
        this.f24834i.c();
        this.f24830e.c();
        this.f24832g = false;
    }

    @Override // e4.t
    public final boolean k() {
        return this.f24829d != d4.f.MATCH_CONSTRAINT || this.f24827b.f23149r == 0;
    }

    public final void n() {
        this.f24832g = false;
        g gVar = this.f24833h;
        gVar.c();
        gVar.f24808j = false;
        g gVar2 = this.f24834i;
        gVar2.c();
        gVar2.f24808j = false;
        this.f24830e.f24808j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f24827b.f23137k0;
    }
}
