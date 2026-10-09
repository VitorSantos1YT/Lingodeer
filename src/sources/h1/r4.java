package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1.r f30966a = j0.e2.n(z1.o.f58481a, k1.p.f37683a);

    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    public static final void a(k2.b bVar, z1.r rVar, l1.n nVar, int i11) {
        z1.r rVarK;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1755070997);
        if ((((sVar.h(bVar) ? 4 : 2) | i11 | 3072) & 1171) == 1170 && sVar.F()) {
            sVar.W();
        } else {
            sVar.d0(-2144829472);
            sVar.p(false);
            boolean zA = f2.e.a(bVar.h(), 9205357640488583168L);
            z1.o oVar = z1.o.f58481a;
            if (zA) {
                rVarK = f30966a;
            } else {
                long jH = bVar.h();
                if (Float.isInfinite(f2.e.d(jH)) && Float.isInfinite(f2.e.b(jH))) {
                    rVarK = f30966a;
                } else {
                    long jH2 = bVar.h();
                    rVarK = w2.a0.k(oVar, new q4(f2.e.d(jH2), f2.e.b(jH2)));
                }
            }
            boolean zH = sVar.h(bVar) | sVar.h(null);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new a0.o0(bVar, 16);
                sVar.o0(objQ);
            }
            j0.o.a(d2.h.d(rVarK, (fz.c) objQ).i(oVar), sVar, 0);
            rVar = oVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b2.h(bVar, i11, 3, rVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x0106  */
    /* JADX WARN: Code duplicated, block: B:89:0x011a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0128  */
    /* JADX WARN: Code duplicated, block: B:93:0x0132  */
    /* JADX WARN: Code duplicated, block: B:97:0x0154  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    public static final void b(k2.b bVar, String str, z1.r rVar, long j11, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVar2;
        long j12;
        int i14;
        z1.r rVar3;
        long j13;
        boolean z11;
        Object objQ;
        g2.p pVar;
        ?? r9;
        z1.r rVarB;
        z1.r rVar4;
        long j14;
        long jH;
        boolean z12;
        Object objQ2;
        l1.x1 x1VarT;
        int i15;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-2142239481);
        if ((i11 & 6) == 0) {
            i13 = (sVar.h(bVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar.f(str) ? 32 : 16;
        }
        int i16 = i12 & 4;
        if (i16 == 0) {
            if ((i11 & 384) == 0) {
                rVar2 = rVar;
                i13 |= sVar.f(rVar2) ? 256 : 128;
            }
            if ((i11 & 3072) == 0) {
                j12 = j11;
                if ((i12 & 8) == 0 || !sVar.e(j12)) {
                    i15 = 1024;
                } else {
                    i15 = 2048;
                }
                i13 |= i15;
            } else {
                j12 = j11;
            }
            if ((i13 & 1171) == 1170 || !sVar.F()) {
                sVar.Y();
                i14 = i11 & 1;
                rVar3 = z1.o.f58481a;
                if (i14 != 0 || sVar.C()) {
                    if (i16 != 0) {
                        rVar2 = rVar3;
                    }
                    if ((i12 & 8) != 0) {
                        j12 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                        i13 &= -7169;
                    }
                } else {
                    sVar.W();
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                    }
                }
                j13 = j12;
                sVar.q();
                z11 = (((i13 & 7168) ^ 3072) <= 2048 && sVar.e(j13)) || (i13 & 3072) == 2048;
                objQ = sVar.Q();
                l1.g gVar = l1.m.f39353a;
                if (z11 || objQ == gVar) {
                    if (g2.x.d(j13, g2.x.f28622i)) {
                        pVar = null;
                    } else {
                        pVar = new g2.p(j13, 5);
                    }
                    objQ = pVar;
                    sVar.o0(objQ);
                }
                g2.p pVar2 = (g2.p) objQ;
                sVar.d0(-2144891392);
                if (str != null) {
                    z12 = (i13 & 112) == 32;
                    objQ2 = sVar.Q();
                    if (z12 || objQ2 == gVar) {
                        objQ2 = new c6.o(str, 5);
                        sVar.o0(objQ2);
                    }
                    r9 = 0;
                    rVarB = g3.r.b(rVar3, false, (fz.c) objQ2);
                } else {
                    r9 = 0;
                    rVarB = rVar3;
                }
                sVar.p(r9);
                if (f2.e.a(bVar.h(), 9205357640488583168L)) {
                    rVar3 = f30966a;
                } else {
                    jH = bVar.h();
                    if (Float.isInfinite(f2.e.d(jH)) && Float.isInfinite(f2.e.b(jH))) {
                        rVar3 = f30966a;
                    }
                }
                j0.o.a(d2.h.g(rVar2.i(rVar3), bVar, null, w2.i.f54515b, CropImageView.DEFAULT_ASPECT_RATIO, pVar2, 22).i(rVarB), sVar, r9);
                rVar4 = rVar2;
                j14 = j13;
            } else {
                sVar.W();
                rVar4 = rVar2;
                j14 = j12;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new p4(bVar, str, rVar4, j14, i11, i12, 1);
            }
        }
        i13 |= 384;
        rVar2 = rVar;
        if ((i11 & 3072) == 0) {
            j12 = j11;
            if ((i12 & 8) == 0) {
                i15 = 1024;
            } else {
                i15 = 1024;
            }
            i13 |= i15;
        } else {
            j12 = j11;
        }
        if ((i13 & 1171) == 1170) {
            sVar.Y();
            i14 = i11 & 1;
            rVar3 = z1.o.f58481a;
            if (i14 != 0) {
                if (i16 != 0) {
                    rVar2 = rVar3;
                }
                if ((i12 & 8) != 0) {
                    j12 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                    i13 &= -7169;
                }
            } else {
                if (i16 != 0) {
                    rVar2 = rVar3;
                }
                if ((i12 & 8) != 0) {
                    j12 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                    i13 &= -7169;
                }
            }
            j13 = j12;
            sVar.q();
            if (((i13 & 7168) ^ 3072) <= 2048) {
            }
            objQ = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (z11) {
                if (g2.x.d(j13, g2.x.f28622i)) {
                    pVar = null;
                } else {
                    pVar = new g2.p(j13, 5);
                }
                objQ = pVar;
                sVar.o0(objQ);
            } else {
                if (g2.x.d(j13, g2.x.f28622i)) {
                    pVar = null;
                } else {
                    pVar = new g2.p(j13, 5);
                }
                objQ = pVar;
                sVar.o0(objQ);
            }
            g2.p pVar3 = (g2.p) objQ;
            sVar.d0(-2144891392);
            if (str != null) {
                if ((i13 & 112) == 32) {
                }
                objQ2 = sVar.Q();
                if (z12) {
                    objQ2 = new c6.o(str, 5);
                    sVar.o0(objQ2);
                } else {
                    objQ2 = new c6.o(str, 5);
                    sVar.o0(objQ2);
                }
                r9 = 0;
                rVarB = g3.r.b(rVar3, false, (fz.c) objQ2);
            } else {
                r9 = 0;
                rVarB = rVar3;
            }
            sVar.p(r9);
            if (f2.e.a(bVar.h(), 9205357640488583168L)) {
                jH = bVar.h();
                if (Float.isInfinite(f2.e.d(jH))) {
                    rVar3 = f30966a;
                }
            } else {
                rVar3 = f30966a;
            }
            j0.o.a(d2.h.g(rVar2.i(rVar3), bVar, null, w2.i.f54515b, CropImageView.DEFAULT_ASPECT_RATIO, pVar3, 22).i(rVarB), sVar, r9);
            rVar4 = rVar2;
            j14 = j13;
        } else {
            sVar.Y();
            i14 = i11 & 1;
            rVar3 = z1.o.f58481a;
            if (i14 != 0) {
                if (i16 != 0) {
                    rVar2 = rVar3;
                }
                if ((i12 & 8) != 0) {
                    j12 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                    i13 &= -7169;
                }
            } else {
                if (i16 != 0) {
                    rVar2 = rVar3;
                }
                if ((i12 & 8) != 0) {
                    j12 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                    i13 &= -7169;
                }
            }
            j13 = j12;
            sVar.q();
            if (((i13 & 7168) ^ 3072) <= 2048) {
            }
            objQ = sVar.Q();
            l1.g gVar3 = l1.m.f39353a;
            if (z11) {
                if (g2.x.d(j13, g2.x.f28622i)) {
                    pVar = null;
                } else {
                    pVar = new g2.p(j13, 5);
                }
                objQ = pVar;
                sVar.o0(objQ);
            } else {
                if (g2.x.d(j13, g2.x.f28622i)) {
                    pVar = null;
                } else {
                    pVar = new g2.p(j13, 5);
                }
                objQ = pVar;
                sVar.o0(objQ);
            }
            g2.p pVar4 = (g2.p) objQ;
            sVar.d0(-2144891392);
            if (str != null) {
                if ((i13 & 112) == 32) {
                }
                objQ2 = sVar.Q();
                if (z12) {
                    objQ2 = new c6.o(str, 5);
                    sVar.o0(objQ2);
                } else {
                    objQ2 = new c6.o(str, 5);
                    sVar.o0(objQ2);
                }
                r9 = 0;
                rVarB = g3.r.b(rVar3, false, (fz.c) objQ2);
            } else {
                r9 = 0;
                rVarB = rVar3;
            }
            sVar.p(r9);
            if (f2.e.a(bVar.h(), 9205357640488583168L)) {
                jH = bVar.h();
                if (Float.isInfinite(f2.e.d(jH))) {
                    rVar3 = f30966a;
                }
            } else {
                rVar3 = f30966a;
            }
            j0.o.a(d2.h.g(rVar2.i(rVar3), bVar, null, w2.i.f54515b, CropImageView.DEFAULT_ASPECT_RATIO, pVar4, 22).i(rVarB), sVar, r9);
            rVar4 = rVar2;
            j14 = j13;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new p4(bVar, str, rVar4, j14, i11, i12, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void c(l2.e eVar, String str, z1.r rVar, long j11, l1.n nVar, int i11, int i12) {
        z1.r rVar2;
        long j12;
        z1.r rVar3;
        z1.r rVar4;
        long j13;
        z1.r rVar5;
        long j14;
        l1.x1 x1VarT;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-126890956);
        int i13 = (sVar.f(eVar) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i13 |= sVar.f(str) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 == 0) {
            if ((i11 & 384) == 0) {
                rVar2 = rVar;
                i13 |= sVar.f(rVar2) ? 256 : 128;
            }
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    j12 = j11;
                    int i15 = sVar.e(j12) ? 2048 : 1024;
                    i13 |= i15;
                } else {
                    j12 = j11;
                }
                i13 |= i15;
            } else {
                j12 = j11;
            }
            if ((i13 & 1171) == 1170 || !sVar.F()) {
                sVar.Y();
                if ((i11 & 1) != 0 || sVar.C()) {
                    if (i14 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        rVar4 = rVar3;
                        j13 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                    } else {
                        rVar4 = rVar3;
                    }
                    sVar.q();
                    b(l2.a.d(eVar, sVar), str, rVar4, j13, sVar, (i13 & 112) | 8 | (i13 & 896) | (i13 & 7168), 0);
                    rVar5 = rVar4;
                    j14 = j13;
                } else {
                    sVar.W();
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                    }
                    rVar4 = rVar2;
                }
                j13 = j12;
                sVar.q();
                b(l2.a.d(eVar, sVar), str, rVar4, j13, sVar, (i13 & 112) | 8 | (i13 & 896) | (i13 & 7168), 0);
                rVar5 = rVar4;
                j14 = j13;
            } else {
                sVar.W();
                j14 = j12;
                rVar5 = rVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new p4(eVar, str, rVar5, j14, i11, i12, 0);
            }
        }
        i13 |= 384;
        rVar2 = rVar;
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                j12 = j11;
                if (sVar.e(j12)) {
                }
                i13 |= i15;
            } else {
                j12 = j11;
            }
            i13 |= i15;
        } else {
            j12 = j11;
        }
        if ((i13 & 1171) == 1170) {
            sVar.Y();
            if ((i11 & 1) != 0) {
                if (i14 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    rVar4 = rVar3;
                    j13 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                } else {
                    rVar4 = rVar3;
                    j13 = j12;
                }
            } else {
                if (i14 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    rVar4 = rVar3;
                    j13 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                } else {
                    rVar4 = rVar3;
                    j13 = j12;
                }
            }
            sVar.q();
            b(l2.a.d(eVar, sVar), str, rVar4, j13, sVar, (i13 & 112) | 8 | (i13 & 896) | (i13 & 7168), 0);
            rVar5 = rVar4;
            j14 = j13;
        } else {
            sVar.Y();
            if ((i11 & 1) != 0) {
                if (i14 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    rVar4 = rVar3;
                    j13 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                } else {
                    rVar4 = rVar3;
                    j13 = j12;
                }
            } else {
                if (i14 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    rVar4 = rVar3;
                    j13 = ((g2.x) sVar.j(h2.f30320a)).f28624a;
                } else {
                    rVar4 = rVar3;
                    j13 = j12;
                }
            }
            sVar.q();
            b(l2.a.d(eVar, sVar), str, rVar4, j13, sVar, (i13 & 112) | 8 | (i13 & 896) | (i13 & 7168), 0);
            rVar5 = rVar4;
            j14 = j13;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new p4(eVar, str, rVar5, j14, i11, i12, 0);
        }
    }
}
