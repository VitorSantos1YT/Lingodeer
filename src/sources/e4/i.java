package e4;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f24811a = new b();

    public static boolean a(d4.g gVar) {
        d4.f fVar;
        d4.f fVar2;
        d4.f[] fVarArr = gVar.U;
        d4.f fVar3 = fVarArr[0];
        d4.f fVar4 = fVarArr[1];
        d4.g gVar2 = gVar.V;
        d4.h hVar = gVar2 != null ? (d4.h) gVar2 : null;
        if (hVar != null) {
            d4.f fVar5 = hVar.U[0];
            d4.f fVar6 = d4.f.FIXED;
        }
        if (hVar != null) {
            d4.f fVar7 = hVar.U[1];
            d4.f fVar8 = d4.f.FIXED;
        }
        d4.f fVar9 = d4.f.FIXED;
        boolean z11 = fVar3 == fVar9 || gVar.B() || fVar3 == d4.f.WRAP_CONTENT || (fVar3 == (fVar2 = d4.f.MATCH_CONSTRAINT) && gVar.f23149r == 0 && gVar.Y == CropImageView.DEFAULT_ASPECT_RATIO && gVar.u(0)) || (fVar3 == fVar2 && gVar.f23149r == 1 && gVar.v(0, gVar.r()));
        boolean z12 = fVar4 == fVar9 || gVar.C() || fVar4 == d4.f.WRAP_CONTENT || (fVar4 == (fVar = d4.f.MATCH_CONSTRAINT) && gVar.f23151s == 0 && gVar.Y == CropImageView.DEFAULT_ASPECT_RATIO && gVar.u(1)) || (fVar4 == fVar && gVar.f23151s == 1 && gVar.v(1, gVar.l()));
        return (gVar.Y > CropImageView.DEFAULT_ASPECT_RATIO && (z11 || z12)) || (z11 && z12);
    }

    public static q b(d4.g gVar, int i11, ArrayList arrayList, q qVar) {
        int i12;
        int i13 = i11 == 0 ? gVar.f23152s0 : gVar.f23154t0;
        if (i13 != -1 && (qVar == null || i13 != qVar.f24821b)) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                q qVar2 = (q) arrayList.get(i14);
                if (qVar2.f24821b == i13) {
                    if (qVar != null) {
                        qVar.c(i11, qVar2);
                        arrayList.remove(qVar);
                    }
                    qVar = qVar2;
                    break;
                }
            }
        } else if (i13 != -1) {
            return qVar;
        }
        if (qVar == null) {
            if (gVar instanceof d4.m) {
                d4.m mVar = (d4.m) gVar;
                int i15 = 0;
                while (true) {
                    if (i15 >= mVar.f23196v0) {
                        i12 = -1;
                        break;
                    }
                    d4.g gVar2 = mVar.f23195u0[i15];
                    if ((i11 == 0 && (i12 = gVar2.f23152s0) != -1) || (i11 == 1 && (i12 = gVar2.f23154t0) != -1)) {
                        break;
                    }
                    i15++;
                }
                if (i12 != -1) {
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        q qVar3 = (q) arrayList.get(i16);
                        if (qVar3.f24821b == i12) {
                            qVar = qVar3;
                            break;
                        }
                    }
                }
            }
            if (qVar == null) {
                qVar = new q();
                qVar.f24820a = new ArrayList();
                qVar.f24823d = null;
                qVar.f24824e = -1;
                int i17 = q.f24819f;
                q.f24819f = i17 + 1;
                qVar.f24821b = i17;
                qVar.f24822c = i11;
            }
            arrayList.add(qVar);
        }
        int i18 = qVar.f24821b;
        ArrayList arrayList2 = qVar.f24820a;
        if (arrayList2.contains(gVar)) {
            return qVar;
        }
        arrayList2.add(gVar);
        if (gVar instanceof d4.l) {
            d4.l lVar = (d4.l) gVar;
            lVar.f23192x0.c(lVar.f23193y0 == 0 ? 1 : 0, qVar, arrayList);
        }
        if (i11 == 0) {
            gVar.f23152s0 = i18;
            gVar.J.c(i11, qVar, arrayList);
            gVar.L.c(i11, qVar, arrayList);
        } else {
            gVar.f23154t0 = i18;
            gVar.K.c(i11, qVar, arrayList);
            gVar.N.c(i11, qVar, arrayList);
            gVar.M.c(i11, qVar, arrayList);
        }
        gVar.Q.c(i11, qVar, arrayList);
        return qVar;
    }

    public static void c(int i11, d4.g gVar, j4.f fVar, boolean z11) {
        d4.d dVar;
        d4.d dVar2;
        char c11;
        d4.d dVar3;
        d4.d dVar4;
        if (gVar.m) {
            return;
        }
        if (!(gVar instanceof d4.h) && gVar.A() && a(gVar)) {
            d4.h.W(gVar, fVar, new b());
        }
        d4.d dVarJ = gVar.j(d4.c.LEFT);
        d4.d dVarJ2 = gVar.j(d4.c.RIGHT);
        int iD = dVarJ.d();
        int iD2 = dVarJ2.d();
        HashSet<d4.d> hashSet = dVarJ.f23106a;
        if (hashSet != null && dVarJ.f23108c) {
            for (d4.d dVar5 : hashSet) {
                d4.g gVar2 = dVar5.f23109d;
                int i12 = i11 + 1;
                boolean zA = a(gVar2);
                d4.d dVar6 = gVar2.J;
                d4.d dVar7 = gVar2.L;
                if (gVar2.A() && zA) {
                    c11 = 0;
                    d4.h.W(gVar2, fVar, new b());
                } else {
                    c11 = 0;
                }
                char c12 = ((dVar5 == dVar6 && (dVar4 = dVar7.f23111f) != null && dVar4.f23108c) || (dVar5 == dVar7 && (dVar3 = dVar6.f23111f) != null && dVar3.f23108c)) ? (char) 1 : c11;
                d4.f fVar2 = gVar2.U[c11];
                d4.f fVar3 = d4.f.MATCH_CONSTRAINT;
                if (fVar2 != fVar3 || zA) {
                    if (!gVar2.A()) {
                        if (dVar5 == dVar6 && dVar7.f23111f == null) {
                            int iE = dVar6.e() + iD;
                            gVar2.K(iE, gVar2.r() + iE);
                            c(i12, gVar2, fVar, z11);
                        } else if (dVar5 == dVar7 && dVar6.f23111f == null) {
                            int iE2 = iD - dVar7.e();
                            gVar2.K(iE2 - gVar2.r(), iE2);
                            c(i12, gVar2, fVar, z11);
                        } else if (c12 != 0 && !gVar2.y()) {
                            d(i12, gVar2, fVar, z11);
                        }
                    }
                } else if (fVar2 == fVar3 && gVar2.f23156v >= 0 && gVar2.f23155u >= 0 && (gVar2.f23133i0 == 8 || (gVar2.f23149r == 0 && gVar2.Y == CropImageView.DEFAULT_ASPECT_RATIO))) {
                    if (!gVar2.y() && !gVar2.G && c12 != 0 && !gVar2.y()) {
                        e(i12, gVar, fVar, gVar2, z11);
                    }
                }
            }
        }
        if (gVar instanceof d4.l) {
            return;
        }
        HashSet<d4.d> hashSet2 = dVarJ2.f23106a;
        if (hashSet2 != null && dVarJ2.f23108c) {
            for (d4.d dVar8 : hashSet2) {
                d4.g gVar3 = dVar8.f23109d;
                int i13 = i11 + 1;
                boolean zA2 = a(gVar3);
                d4.d dVar9 = gVar3.J;
                d4.d dVar10 = gVar3.L;
                if (gVar3.A() && zA2) {
                    d4.h.W(gVar3, fVar, new b());
                }
                boolean z12 = (dVar8 == dVar9 && (dVar2 = dVar10.f23111f) != null && dVar2.f23108c) || (dVar8 == dVar10 && (dVar = dVar9.f23111f) != null && dVar.f23108c);
                d4.f fVar4 = gVar3.U[0];
                d4.f fVar5 = d4.f.MATCH_CONSTRAINT;
                if (fVar4 != fVar5 || zA2) {
                    if (!gVar3.A()) {
                        if (dVar8 == dVar9 && dVar10.f23111f == null) {
                            int iE3 = dVar9.e() + iD2;
                            gVar3.K(iE3, gVar3.r() + iE3);
                            c(i13, gVar3, fVar, z11);
                        } else if (dVar8 == dVar10 && dVar9.f23111f == null) {
                            int iE4 = iD2 - dVar10.e();
                            gVar3.K(iE4 - gVar3.r(), iE4);
                            c(i13, gVar3, fVar, z11);
                        } else if (z12 && !gVar3.y()) {
                            d(i13, gVar3, fVar, z11);
                        }
                    }
                } else if (fVar4 == fVar5 && gVar3.f23156v >= 0 && gVar3.f23155u >= 0) {
                    if (gVar3.f23133i0 == 8 || (gVar3.f23149r == 0 && gVar3.Y == CropImageView.DEFAULT_ASPECT_RATIO)) {
                        if (!gVar3.y() && !gVar3.G && z12 && !gVar3.y()) {
                            e(i13, gVar, fVar, gVar3, z11);
                        }
                    }
                }
            }
        }
        gVar.m = true;
    }

    public static void d(int i11, d4.g gVar, j4.f fVar, boolean z11) {
        float f5 = gVar.f23127f0;
        d4.d dVar = gVar.J;
        int iD = dVar.f23111f.d();
        d4.d dVar2 = gVar.L;
        int iD2 = dVar2.f23111f.d();
        int iE = dVar.e() + iD;
        int iE2 = iD2 - dVar2.e();
        if (iD == iD2) {
            f5 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iR = gVar.r();
        int i12 = (iD2 - iD) - iR;
        if (iD > iD2) {
            i12 = (iD - iD2) - iR;
        }
        int i13 = ((int) (i12 > 0 ? (f5 * i12) + 0.5f : f5 * i12)) + iD;
        int i14 = i13 + iR;
        if (iD > iD2) {
            i14 = i13 - iR;
        }
        gVar.K(i13, i14);
        c(i11 + 1, gVar, fVar, z11);
    }

    public static void e(int i11, d4.g gVar, j4.f fVar, d4.g gVar2, boolean z11) {
        float f5 = gVar2.f23127f0;
        d4.d dVar = gVar2.J;
        int iE = dVar.e() + dVar.f23111f.d();
        d4.d dVar2 = gVar2.L;
        int iD = dVar2.f23111f.d() - dVar2.e();
        if (iD >= iE) {
            int iR = gVar2.r();
            if (gVar2.f23133i0 != 8) {
                int i12 = gVar2.f23149r;
                if (i12 == 2) {
                    iR = (int) (gVar2.f23127f0 * 0.5f * (gVar instanceof d4.h ? gVar.r() : gVar.V.r()));
                } else if (i12 == 0) {
                    iR = iD - iE;
                }
                iR = Math.max(gVar2.f23155u, iR);
                int i13 = gVar2.f23156v;
                if (i13 > 0) {
                    iR = Math.min(i13, iR);
                }
            }
            int i14 = iE + ((int) ((f5 * ((iD - iE) - iR)) + 0.5f));
            gVar2.K(i14, iR + i14);
            c(i11 + 1, gVar2, fVar, z11);
        }
    }

    public static void f(int i11, d4.g gVar, j4.f fVar) {
        float f5 = gVar.f23129g0;
        d4.d dVar = gVar.K;
        int iD = dVar.f23111f.d();
        d4.d dVar2 = gVar.M;
        int iD2 = dVar2.f23111f.d();
        int iE = dVar.e() + iD;
        int iE2 = iD2 - dVar2.e();
        if (iD == iD2) {
            f5 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iL = gVar.l();
        int i12 = (iD2 - iD) - iL;
        if (iD > iD2) {
            i12 = (iD - iD2) - iL;
        }
        int i13 = (int) (i12 > 0 ? (f5 * i12) + 0.5f : f5 * i12);
        int i14 = iD + i13;
        int i15 = i14 + iL;
        if (iD > iD2) {
            i14 = iD - i13;
            i15 = i14 - iL;
        }
        gVar.L(i14, i15);
        i(i11 + 1, gVar, fVar);
    }

    public static void g(int i11, d4.g gVar, j4.f fVar, d4.g gVar2) {
        float f5 = gVar2.f23129g0;
        d4.d dVar = gVar2.K;
        int iE = dVar.e() + dVar.f23111f.d();
        d4.d dVar2 = gVar2.M;
        int iD = dVar2.f23111f.d() - dVar2.e();
        if (iD >= iE) {
            int iL = gVar2.l();
            if (gVar2.f23133i0 != 8) {
                int i12 = gVar2.f23151s;
                if (i12 == 2) {
                    iL = (int) (f5 * 0.5f * (gVar instanceof d4.h ? gVar.l() : gVar.V.l()));
                } else if (i12 == 0) {
                    iL = iD - iE;
                }
                iL = Math.max(gVar2.f23158x, iL);
                int i13 = gVar2.f23159y;
                if (i13 > 0) {
                    iL = Math.min(i13, iL);
                }
            }
            int i14 = iE + ((int) ((f5 * ((iD - iE) - iL)) + 0.5f));
            gVar2.L(i14, iL + i14);
            i(i11 + 1, gVar2, fVar);
        }
    }

    public static boolean h(d4.f fVar, d4.f fVar2, d4.f fVar3, d4.f fVar4) {
        d4.f fVar5;
        d4.f fVar6;
        d4.f fVar7 = d4.f.FIXED;
        return (fVar3 == fVar7 || fVar3 == (fVar6 = d4.f.WRAP_CONTENT) || (fVar3 == d4.f.MATCH_PARENT && fVar != fVar6)) || (fVar4 == fVar7 || fVar4 == (fVar5 = d4.f.WRAP_CONTENT) || (fVar4 == d4.f.MATCH_PARENT && fVar2 != fVar5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    public static void i(int i11, d4.g gVar, j4.f fVar) {
        boolean z11;
        d4.d dVar;
        d4.d dVar2;
        float f5;
        d4.d dVar3;
        d4.d dVar4;
        if (gVar.f23141n) {
            return;
        }
        if (!(gVar instanceof d4.h) && gVar.A() && a(gVar)) {
            d4.h.W(gVar, fVar, new b());
        }
        d4.d dVarJ = gVar.j(d4.c.TOP);
        d4.d dVarJ2 = gVar.j(d4.c.BOTTOM);
        int iD = dVarJ.d();
        int iD2 = dVarJ2.d();
        HashSet<d4.d> hashSet = dVarJ.f23106a;
        char c11 = 1;
        if (hashSet != null && dVarJ.f23108c) {
            for (d4.d dVar5 : hashSet) {
                d4.g gVar2 = dVar5.f23109d;
                int i12 = i11 + 1;
                boolean zA = a(gVar2);
                d4.d dVar6 = gVar2.K;
                d4.d dVar7 = gVar2.M;
                if (gVar2.A() && zA) {
                    f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    d4.h.W(gVar2, fVar, new b());
                } else {
                    f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                }
                char c12 = ((dVar5 == dVar6 && (dVar4 = dVar7.f23111f) != null && dVar4.f23108c) || (dVar5 == dVar7 && (dVar3 = dVar6.f23111f) != null && dVar3.f23108c)) ? c11 : (char) 0;
                d4.f fVar2 = gVar2.U[c11];
                char c13 = c11;
                d4.f fVar3 = d4.f.MATCH_CONSTRAINT;
                if (fVar2 != fVar3 || zA) {
                    if (!gVar2.A()) {
                        if (dVar5 == dVar6 && dVar7.f23111f == null) {
                            int iE = dVar6.e() + iD;
                            gVar2.L(iE, gVar2.l() + iE);
                            i(i12, gVar2, fVar);
                        } else if (dVar5 == dVar7 && dVar6.f23111f == null) {
                            int iE2 = iD - dVar7.e();
                            gVar2.L(iE2 - gVar2.l(), iE2);
                            i(i12, gVar2, fVar);
                        } else if (c12 != 0 && !gVar2.z()) {
                            f(i12, gVar2, fVar);
                        }
                    }
                } else if (fVar2 == fVar3 && gVar2.f23159y >= 0 && gVar2.f23158x >= 0 && ((gVar2.f23133i0 == 8 || (gVar2.f23151s == 0 && gVar2.Y == f5)) && !gVar2.z() && !gVar2.G && c12 != 0 && !gVar2.z())) {
                    g(i12, gVar, fVar, gVar2);
                }
                c11 = c13;
            }
        }
        ?? r17 = c11;
        if (gVar instanceof d4.l) {
            return;
        }
        HashSet<d4.d> hashSet2 = dVarJ2.f23106a;
        if (hashSet2 != null && dVarJ2.f23108c) {
            for (d4.d dVar8 : hashSet2) {
                d4.g gVar3 = dVar8.f23109d;
                int i13 = i11 + 1;
                boolean zA2 = a(gVar3);
                d4.d dVar9 = gVar3.K;
                d4.d dVar10 = gVar3.M;
                if (gVar3.A() && zA2) {
                    d4.h.W(gVar3, fVar, new b());
                }
                ?? r11 = ((dVar8 == dVar9 && (dVar2 = dVar10.f23111f) != null && dVar2.f23108c) || (dVar8 == dVar10 && (dVar = dVar9.f23111f) != null && dVar.f23108c)) ? r17 == true ? 1 : 0 : 0;
                d4.f fVar4 = gVar3.U[r17 == true ? 1 : 0];
                d4.f fVar5 = d4.f.MATCH_CONSTRAINT;
                if (fVar4 != fVar5 || zA2) {
                    if (!gVar3.A()) {
                        if (dVar8 == dVar9 && dVar10.f23111f == null) {
                            int iE3 = dVar9.e() + iD2;
                            gVar3.L(iE3, gVar3.l() + iE3);
                            i(i13, gVar3, fVar);
                        } else if (dVar8 == dVar10 && dVar9.f23111f == null) {
                            int iE4 = iD2 - dVar10.e();
                            gVar3.L(iE4 - gVar3.l(), iE4);
                            i(i13, gVar3, fVar);
                        } else if (r11 != 0 && !gVar3.z()) {
                            f(i13, gVar3, fVar);
                        }
                    }
                } else if (fVar4 == fVar5 && gVar3.f23159y >= 0 && gVar3.f23158x >= 0 && (gVar3.f23133i0 == 8 || (gVar3.f23151s == 0 && gVar3.Y == CropImageView.DEFAULT_ASPECT_RATIO))) {
                    if (!gVar3.z() && !gVar3.G && r11 != 0 && !gVar3.z()) {
                        g(i13, gVar, fVar, gVar3);
                    }
                }
            }
        }
        d4.d dVarJ3 = gVar.j(d4.c.BASELINE);
        if (dVarJ3.f23106a != null && dVarJ3.f23108c) {
            int iD3 = dVarJ3.d();
            for (d4.d dVar11 : dVarJ3.f23106a) {
                d4.g gVar4 = dVar11.f23109d;
                int i14 = i11 + 1;
                boolean zA3 = a(gVar4);
                d4.d dVar12 = gVar4.N;
                if (gVar4.A() && zA3) {
                    d4.h.W(gVar4, fVar, new b());
                }
                if (gVar4.U[r17 == true ? 1 : 0] != d4.f.MATCH_CONSTRAINT || zA3) {
                    if (!gVar4.A()) {
                        if (dVar11 == dVar12) {
                            int iE5 = dVar11.e() + iD3;
                            if (gVar4.E) {
                                int i15 = iE5 - gVar4.f23121c0;
                                int i16 = gVar4.X + i15;
                                gVar4.f23119b0 = i15;
                                gVar4.K.l(i15);
                                gVar4.M.l(i16);
                                dVar12.l(iE5);
                                z11 = r17 == true ? 1 : 0;
                                gVar4.f23138l = z11;
                            } else {
                                z11 = r17 == true ? 1 : 0;
                            }
                            i(i14, gVar4, fVar);
                        }
                        r17 = z11;
                    }
                }
                z11 = r17 == true ? 1 : 0;
                r17 = z11;
            }
        }
        gVar.f23141n = r17;
    }
}
