package h1;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f30186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f30187b;

    static {
        new b0.v(0.8f, CropImageView.DEFAULT_ASPECT_RATIO, 0.8f, 0.15f);
        float f5 = 4;
        f30186a = f5;
        f30187b = 16 - f5;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public static final void a(t1.d dVar, z1.r rVar, t1.d dVar2, fz.f fVar, float f5, j0.n2 n2Var, ac acVar, l1.n nVar, int i11, int i12) {
        fz.f fVar2;
        ac acVarB;
        int i13;
        fz.f fVar3;
        float f11;
        int i14;
        z1.r rVar2;
        fz.f fVar4;
        ac acVar2;
        j0.n2 n2Var2;
        int i15;
        float f12;
        l1.s sVar;
        float f13;
        z1.r rVar3;
        fz.f fVar5;
        j0.n2 n2Var3;
        ac acVar3;
        l1.x1 x1VarT;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1952988048);
        int i16 = i11 | 48;
        int i17 = i12 & 8;
        if (i17 == 0) {
            if ((i11 & 3072) == 0) {
                fVar2 = fVar;
                i16 |= sVar2.h(fVar2) ? 2048 : 1024;
            }
            int i18 = i16 | 90112;
            if ((i12 & 64) == 0) {
                acVarB = acVar;
                int i19 = sVar2.f(acVarB) ? 1048576 : 524288;
                i13 = i18 | i19 | 12582912;
                if ((4793491 & i13) == 4793490 || !sVar2.F()) {
                    sVar2.Y();
                    if ((i11 & 1) != 0 || sVar2.C()) {
                        if (i17 != 0) {
                            fVar3 = z1.f31390b;
                        } else {
                            fVar3 = fVar2;
                        }
                        f11 = bc.f30055a;
                        j0.k1 k1VarD = bc.d(sVar2);
                        i14 = (-458753) & i13;
                        if ((i12 & 64) != 0) {
                            acVarB = bc.b((s1) sVar2.j(v1.f31180a));
                            i14 = i13 & (-4128769);
                        }
                        rVar2 = z1.o.f58481a;
                        fVar4 = fVar3;
                        acVar2 = acVarB;
                        n2Var2 = k1VarD;
                        i15 = i14;
                    } else {
                        sVar2.W();
                        i15 = i13 & (-458753);
                        if ((i12 & 64) != 0) {
                            i15 = i13 & (-4128769);
                        }
                        rVar2 = rVar;
                        n2Var2 = n2Var;
                        fVar4 = fVar2;
                        acVar2 = acVarB;
                        f11 = f5;
                    }
                    sVar2.q();
                    j3.y0 y0VarA = fc.a(k1.o0.f37679d, sVar2);
                    if (!v3.f.b(f11, Float.NaN) || v3.f.b(f11, Float.POSITIVE_INFINITY)) {
                        f12 = bc.f30055a;
                    } else {
                        f12 = f11;
                    }
                    int i21 = i15 << 6;
                    sVar = sVar2;
                    b(rVar2, dVar, y0VarA, true, dVar2, fVar4, f12, n2Var2, acVar2, null, sVar, (i21 & 234881024) | (458752 & i21) | 27702 | 805306368);
                    f13 = f11;
                    rVar3 = rVar2;
                    fVar5 = fVar4;
                    n2Var3 = n2Var2;
                    acVar3 = acVar2;
                } else {
                    sVar2.W();
                    rVar3 = rVar;
                    f13 = f5;
                    n2Var3 = n2Var;
                    sVar = sVar2;
                    acVar3 = acVarB;
                    fVar5 = fVar2;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new t(dVar, rVar3, dVar2, fVar5, f13, n2Var3, acVar3, i11, i12);
                }
            }
            acVarB = acVar;
            i13 = i18 | i19 | 12582912;
            if ((4793491 & i13) == 4793490) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i17 != 0) {
                        fVar3 = z1.f31390b;
                    } else {
                        fVar3 = fVar2;
                    }
                    f11 = bc.f30055a;
                    j0.k1 k1VarD2 = bc.d(sVar2);
                    i14 = (-458753) & i13;
                    if ((i12 & 64) != 0) {
                        acVarB = bc.b((s1) sVar2.j(v1.f31180a));
                        i14 = i13 & (-4128769);
                    }
                    rVar2 = z1.o.f58481a;
                    fVar4 = fVar3;
                    acVar2 = acVarB;
                    n2Var2 = k1VarD2;
                    i15 = i14;
                } else {
                    if (i17 != 0) {
                        fVar3 = z1.f31390b;
                    } else {
                        fVar3 = fVar2;
                    }
                    f11 = bc.f30055a;
                    j0.k1 k1VarD3 = bc.d(sVar2);
                    i14 = (-458753) & i13;
                    if ((i12 & 64) != 0) {
                        acVarB = bc.b((s1) sVar2.j(v1.f31180a));
                        i14 = i13 & (-4128769);
                    }
                    rVar2 = z1.o.f58481a;
                    fVar4 = fVar3;
                    acVar2 = acVarB;
                    n2Var2 = k1VarD3;
                    i15 = i14;
                }
                sVar2.q();
                j3.y0 y0VarA2 = fc.a(k1.o0.f37679d, sVar2);
                if (v3.f.b(f11, Float.NaN)) {
                    f12 = bc.f30055a;
                } else {
                    f12 = bc.f30055a;
                }
                int i22 = i15 << 6;
                sVar = sVar2;
                b(rVar2, dVar, y0VarA2, true, dVar2, fVar4, f12, n2Var2, acVar2, null, sVar, (i22 & 234881024) | (458752 & i22) | 27702 | 805306368);
                f13 = f11;
                rVar3 = rVar2;
                fVar5 = fVar4;
                n2Var3 = n2Var2;
                acVar3 = acVar2;
            } else {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i17 != 0) {
                        fVar3 = z1.f31390b;
                    } else {
                        fVar3 = fVar2;
                    }
                    f11 = bc.f30055a;
                    j0.k1 k1VarD4 = bc.d(sVar2);
                    i14 = (-458753) & i13;
                    if ((i12 & 64) != 0) {
                        acVarB = bc.b((s1) sVar2.j(v1.f31180a));
                        i14 = i13 & (-4128769);
                    }
                    rVar2 = z1.o.f58481a;
                    fVar4 = fVar3;
                    acVar2 = acVarB;
                    n2Var2 = k1VarD4;
                    i15 = i14;
                } else {
                    if (i17 != 0) {
                        fVar3 = z1.f31390b;
                    } else {
                        fVar3 = fVar2;
                    }
                    f11 = bc.f30055a;
                    j0.k1 k1VarD5 = bc.d(sVar2);
                    i14 = (-458753) & i13;
                    if ((i12 & 64) != 0) {
                        acVarB = bc.b((s1) sVar2.j(v1.f31180a));
                        i14 = i13 & (-4128769);
                    }
                    rVar2 = z1.o.f58481a;
                    fVar4 = fVar3;
                    acVar2 = acVarB;
                    n2Var2 = k1VarD5;
                    i15 = i14;
                }
                sVar2.q();
                j3.y0 y0VarA3 = fc.a(k1.o0.f37679d, sVar2);
                if (v3.f.b(f11, Float.NaN)) {
                    f12 = bc.f30055a;
                } else {
                    f12 = bc.f30055a;
                }
                int i23 = i15 << 6;
                sVar = sVar2;
                b(rVar2, dVar, y0VarA3, true, dVar2, fVar4, f12, n2Var2, acVar2, null, sVar, (i23 & 234881024) | (458752 & i23) | 27702 | 805306368);
                f13 = f11;
                rVar3 = rVar2;
                fVar5 = fVar4;
                n2Var3 = n2Var2;
                acVar3 = acVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new t(dVar, rVar3, dVar2, fVar5, f13, n2Var3, acVar3, i11, i12);
            }
        }
        i16 = i11 | 3120;
        fVar2 = fVar;
        int i110 = i16 | 90112;
        if ((i12 & 64) == 0) {
            acVarB = acVar;
            if (sVar2.f(acVarB)) {
            }
            i13 = i110 | i19 | 12582912;
            if ((4793491 & i13) == 4793490) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i17 != 0) {
                        fVar3 = z1.f31390b;
                    } else {
                        fVar3 = fVar2;
                    }
                    f11 = bc.f30055a;
                    j0.k1 k1VarD6 = bc.d(sVar2);
                    i14 = (-458753) & i13;
                    if ((i12 & 64) != 0) {
                        acVarB = bc.b((s1) sVar2.j(v1.f31180a));
                        i14 = i13 & (-4128769);
                    }
                    rVar2 = z1.o.f58481a;
                    fVar4 = fVar3;
                    acVar2 = acVarB;
                    n2Var2 = k1VarD6;
                    i15 = i14;
                } else {
                    if (i17 != 0) {
                        fVar3 = z1.f31390b;
                    } else {
                        fVar3 = fVar2;
                    }
                    f11 = bc.f30055a;
                    j0.k1 k1VarD7 = bc.d(sVar2);
                    i14 = (-458753) & i13;
                    if ((i12 & 64) != 0) {
                        acVarB = bc.b((s1) sVar2.j(v1.f31180a));
                        i14 = i13 & (-4128769);
                    }
                    rVar2 = z1.o.f58481a;
                    fVar4 = fVar3;
                    acVar2 = acVarB;
                    n2Var2 = k1VarD7;
                    i15 = i14;
                }
                sVar2.q();
                j3.y0 y0VarA4 = fc.a(k1.o0.f37679d, sVar2);
                if (v3.f.b(f11, Float.NaN)) {
                    f12 = bc.f30055a;
                } else {
                    f12 = bc.f30055a;
                }
                int i24 = i15 << 6;
                sVar = sVar2;
                b(rVar2, dVar, y0VarA4, true, dVar2, fVar4, f12, n2Var2, acVar2, null, sVar, (i24 & 234881024) | (458752 & i24) | 27702 | 805306368);
                f13 = f11;
                rVar3 = rVar2;
                fVar5 = fVar4;
                n2Var3 = n2Var2;
                acVar3 = acVar2;
            } else {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i17 != 0) {
                        fVar3 = z1.f31390b;
                    } else {
                        fVar3 = fVar2;
                    }
                    f11 = bc.f30055a;
                    j0.k1 k1VarD8 = bc.d(sVar2);
                    i14 = (-458753) & i13;
                    if ((i12 & 64) != 0) {
                        acVarB = bc.b((s1) sVar2.j(v1.f31180a));
                        i14 = i13 & (-4128769);
                    }
                    rVar2 = z1.o.f58481a;
                    fVar4 = fVar3;
                    acVar2 = acVarB;
                    n2Var2 = k1VarD8;
                    i15 = i14;
                } else {
                    if (i17 != 0) {
                        fVar3 = z1.f31390b;
                    } else {
                        fVar3 = fVar2;
                    }
                    f11 = bc.f30055a;
                    j0.k1 k1VarD9 = bc.d(sVar2);
                    i14 = (-458753) & i13;
                    if ((i12 & 64) != 0) {
                        acVarB = bc.b((s1) sVar2.j(v1.f31180a));
                        i14 = i13 & (-4128769);
                    }
                    rVar2 = z1.o.f58481a;
                    fVar4 = fVar3;
                    acVar2 = acVarB;
                    n2Var2 = k1VarD9;
                    i15 = i14;
                }
                sVar2.q();
                j3.y0 y0VarA5 = fc.a(k1.o0.f37679d, sVar2);
                if (v3.f.b(f11, Float.NaN)) {
                    f12 = bc.f30055a;
                } else {
                    f12 = bc.f30055a;
                }
                int i25 = i15 << 6;
                sVar = sVar2;
                b(rVar2, dVar, y0VarA5, true, dVar2, fVar4, f12, n2Var2, acVar2, null, sVar, (i25 & 234881024) | (458752 & i25) | 27702 | 805306368);
                f13 = f11;
                rVar3 = rVar2;
                fVar5 = fVar4;
                n2Var3 = n2Var2;
                acVar3 = acVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new t(dVar, rVar3, dVar2, fVar5, f13, n2Var3, acVar3, i11, i12);
            }
        }
        acVarB = acVar;
        i13 = i110 | i19 | 12582912;
        if ((4793491 & i13) == 4793490) {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i17 != 0) {
                    fVar3 = z1.f31390b;
                } else {
                    fVar3 = fVar2;
                }
                f11 = bc.f30055a;
                j0.k1 k1VarD10 = bc.d(sVar2);
                i14 = (-458753) & i13;
                if ((i12 & 64) != 0) {
                    acVarB = bc.b((s1) sVar2.j(v1.f31180a));
                    i14 = i13 & (-4128769);
                }
                rVar2 = z1.o.f58481a;
                fVar4 = fVar3;
                acVar2 = acVarB;
                n2Var2 = k1VarD10;
                i15 = i14;
            } else {
                if (i17 != 0) {
                    fVar3 = z1.f31390b;
                } else {
                    fVar3 = fVar2;
                }
                f11 = bc.f30055a;
                j0.k1 k1VarD11 = bc.d(sVar2);
                i14 = (-458753) & i13;
                if ((i12 & 64) != 0) {
                    acVarB = bc.b((s1) sVar2.j(v1.f31180a));
                    i14 = i13 & (-4128769);
                }
                rVar2 = z1.o.f58481a;
                fVar4 = fVar3;
                acVar2 = acVarB;
                n2Var2 = k1VarD11;
                i15 = i14;
            }
            sVar2.q();
            j3.y0 y0VarA6 = fc.a(k1.o0.f37679d, sVar2);
            if (v3.f.b(f11, Float.NaN)) {
                f12 = bc.f30055a;
            } else {
                f12 = bc.f30055a;
            }
            int i26 = i15 << 6;
            sVar = sVar2;
            b(rVar2, dVar, y0VarA6, true, dVar2, fVar4, f12, n2Var2, acVar2, null, sVar, (i26 & 234881024) | (458752 & i26) | 27702 | 805306368);
            f13 = f11;
            rVar3 = rVar2;
            fVar5 = fVar4;
            n2Var3 = n2Var2;
            acVar3 = acVar2;
        } else {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i17 != 0) {
                    fVar3 = z1.f31390b;
                } else {
                    fVar3 = fVar2;
                }
                f11 = bc.f30055a;
                j0.k1 k1VarD12 = bc.d(sVar2);
                i14 = (-458753) & i13;
                if ((i12 & 64) != 0) {
                    acVarB = bc.b((s1) sVar2.j(v1.f31180a));
                    i14 = i13 & (-4128769);
                }
                rVar2 = z1.o.f58481a;
                fVar4 = fVar3;
                acVar2 = acVarB;
                n2Var2 = k1VarD12;
                i15 = i14;
            } else {
                if (i17 != 0) {
                    fVar3 = z1.f31390b;
                } else {
                    fVar3 = fVar2;
                }
                f11 = bc.f30055a;
                j0.k1 k1VarD13 = bc.d(sVar2);
                i14 = (-458753) & i13;
                if ((i12 & 64) != 0) {
                    acVarB = bc.b((s1) sVar2.j(v1.f31180a));
                    i14 = i13 & (-4128769);
                }
                rVar2 = z1.o.f58481a;
                fVar4 = fVar3;
                acVar2 = acVarB;
                n2Var2 = k1VarD13;
                i15 = i14;
            }
            sVar2.q();
            j3.y0 y0VarA7 = fc.a(k1.o0.f37679d, sVar2);
            if (v3.f.b(f11, Float.NaN)) {
                f12 = bc.f30055a;
            } else {
                f12 = bc.f30055a;
            }
            int i27 = i15 << 6;
            sVar = sVar2;
            b(rVar2, dVar, y0VarA7, true, dVar2, fVar4, f12, n2Var2, acVar2, null, sVar, (i27 & 234881024) | (458752 & i27) | 27702 | 805306368);
            f13 = f11;
            rVar3 = rVar2;
            fVar5 = fVar4;
            n2Var3 = n2Var2;
            acVar3 = acVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t(dVar, rVar3, dVar2, fVar5, f13, n2Var3, acVar3, i11, i12);
        }
    }

    public static final void b(z1.r rVar, fz.e eVar, j3.y0 y0Var, boolean z11, fz.e eVar2, fz.f fVar, float f5, j0.n2 n2Var, ac acVar, a9.i iVar, l1.n nVar, int i11) {
        int i12;
        j3.y0 y0Var2;
        boolean z12;
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-342194911);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            y0Var2 = y0Var;
            i12 |= sVar2.f(y0Var2) ? 256 : 128;
        } else {
            y0Var2 = y0Var;
        }
        if ((i11 & 3072) == 0) {
            z12 = z11;
            i12 |= sVar2.g(z12) ? 2048 : 1024;
        } else {
            z12 = z11;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(eVar2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(fVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.c(f5) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar2.f(n2Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= sVar2.f(acVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= sVar2.f(iVar) ? 536870912 : 268435456;
        }
        if ((306783379 & i12) == 306783378 && sVar2.F()) {
            sVar2.W();
            sVar = sVar2;
        } else {
            if (Float.isNaN(f5) || f5 == Float.POSITIVE_INFINITY) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            float fE0 = ((v3.c) sVar2.j(z2.g1.f58547h)).e0(f5);
            if (fE0 < CropImageView.DEFAULT_ASPECT_RATIO) {
                fE0 = 0.0f;
            }
            int i13 = i12 & 1879048192;
            boolean zC = (i13 == 536870912) | sVar2.c(fE0);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (zC || objQ == gVar) {
                objQ = new u(iVar, fE0);
                sVar2.o0(objQ);
            }
            l1.t.j((fz.a) objQ, sVar2);
            boolean z13 = i13 == 536870912;
            Object objQ2 = sVar2.Q();
            int i14 = 5;
            if (z13 || objQ2 == gVar) {
                objQ2 = l1.t.s(new a0.c0(iVar, i14));
                sVar2.o0(objQ2);
            }
            l1.b3 b3VarA = a0.t1.a(g2.f0.u(b0.b0.f3440c.a(((Number) ((l1.b3) objQ2).getValue()).floatValue()), acVar.f30007a, acVar.f30008b), b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, null, 5), null, sVar2, 48, 12);
            t1.d dVarD = t1.e.d(1370231018, new a0.h(fVar, 2), sVar2);
            sVar2.d0(-1193605157);
            z1.r rVarA = z1.o.f58481a;
            if (iVar != null) {
                f0.h1 h1Var = f0.h1.Vertical;
                boolean z14 = i13 == 536870912;
                Object objQ3 = sVar2.Q();
                if (z14 || objQ3 == gVar) {
                    objQ3 = new a0.o0(iVar, 11);
                    sVar2.o0(objQ3);
                }
                ad.a0 a0Var = f0.p0.f26394a;
                l1.b1 b1VarH = l1.t.H((fz.c) objQ3, sVar2);
                Object objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    f0.k kVar = new f0.k(new bp.h0(20, b1VarH));
                    sVar2.o0(kVar);
                    objQ4 = kVar;
                }
                f0.s0 s0Var = (f0.s0) objQ4;
                boolean z15 = i13 == 536870912;
                Object objQ5 = sVar2.Q();
                if (z15 || objQ5 == gVar) {
                    objQ5 = new y(iVar, null);
                    sVar2.o0(objQ5);
                }
                rVarA = f0.p0.a(rVarA, s0Var, h1Var, false, null, false, (fz.f) objQ5, false, 188);
            }
            sVar2.p(false);
            sVar = sVar2;
            i9.a(rVar.i(rVarA), null, ((g2.x) b3VarA.getValue()).f28624a, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1943739546, new w(n2Var, f5, iVar, acVar, eVar, y0Var2, z12, eVar2, dVarD), sVar), sVar, 12582912, 122);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new x(rVar, eVar, y0Var, z11, eVar2, fVar, f5, n2Var, acVar, iVar, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0123  */
    /* JADX WARN: Code duplicated, block: B:102:0x012b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0136  */
    /* JADX WARN: Code duplicated, block: B:106:0x0150  */
    /* JADX WARN: Code duplicated, block: B:110:0x015c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0199  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0109  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    public static final void c(fz.e eVar, z1.r rVar, fz.e eVar2, fz.f fVar, float f5, j0.n2 n2Var, ac acVar, a9.i iVar, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVar2;
        int i14;
        fz.f fVar2;
        int i15;
        int i16;
        j0.n2 n2VarD;
        ac acVarE;
        int i17;
        a9.i iVar2;
        int i18;
        z1.r rVar3;
        float f11;
        fz.f fVar3;
        j0.n2 n2Var2;
        ac acVar2;
        a9.i iVar3;
        z1.r rVar4;
        float f12;
        l1.s sVar;
        float f13;
        z1.r rVar5;
        fz.f fVar4;
        a9.i iVar4;
        l1.x1 x1VarT;
        int i19;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(226148675);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.h(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i21 = i12 & 2;
        if (i21 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i13 |= sVar2.f(rVar2) ? 32 : 16;
            }
            if ((i11 & 384) == 0) {
                if (sVar2.h(eVar2)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i13 |= i19;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    fVar2 = fVar;
                    if (sVar2.h(fVar2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i13 | 24576;
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        n2VarD = n2Var;
                        int i22 = sVar2.f(n2VarD) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
                        i16 |= i22;
                    } else {
                        n2VarD = n2Var;
                    }
                    i16 |= i22;
                } else {
                    n2VarD = n2Var;
                }
                if ((1572864 & i11) == 0) {
                    if ((i12 & 64) == 0) {
                        acVarE = acVar;
                        int i23 = sVar2.f(acVarE) ? 1048576 : 524288;
                        i16 |= i23;
                    } else {
                        acVarE = acVar;
                    }
                    i16 |= i23;
                } else {
                    acVarE = acVar;
                }
                i17 = i12 & 128;
                if (i17 != 0) {
                    if ((12582912 & i11) == 0) {
                        iVar2 = iVar;
                        if (sVar2.f(iVar2)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i16 |= i18;
                    }
                    if ((4793491 & i16) == 4793490 || !sVar2.F()) {
                        sVar2.Y();
                        if ((i11 & 1) != 0 || sVar2.C()) {
                            if (i21 != 0) {
                                rVar3 = z1.o.f58481a;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i14 != 0) {
                                fVar2 = z1.f31389a;
                            }
                            f11 = bc.f30055a;
                            if ((i12 & 32) != 0) {
                                i16 &= -458753;
                                n2VarD = bc.d(sVar2);
                            }
                            if ((i12 & 64) != 0) {
                                i16 &= -3670017;
                                acVarE = bc.e(sVar2);
                            }
                            if (i17 != 0) {
                                rVar4 = rVar3;
                                iVar3 = null;
                                fVar3 = fVar2;
                                n2Var2 = n2VarD;
                                acVar2 = acVarE;
                            } else {
                                fVar3 = fVar2;
                                n2Var2 = n2VarD;
                                acVar2 = acVarE;
                                iVar3 = iVar2;
                                rVar4 = rVar3;
                            }
                        } else {
                            sVar2.W();
                            if ((i12 & 32) != 0) {
                                i16 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                i16 &= -3670017;
                            }
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                            iVar3 = iVar2;
                            rVar4 = rVar2;
                            f11 = f5;
                        }
                        sVar2.q();
                        j3.y0 y0VarA = fc.a(k1.o0.f37679d, sVar2);
                        if (!v3.f.b(f11, Float.NaN) || v3.f.b(f11, Float.POSITIVE_INFINITY)) {
                            f12 = bc.f30055a;
                        } else {
                            f12 = f11;
                        }
                        int i24 = ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112);
                        int i25 = i16 << 6;
                        sVar = sVar2;
                        b(rVar4, eVar, y0VarA, false, eVar2, fVar3, f12, n2Var2, acVar2, iVar3, sVar, i24 | (57344 & i25) | (458752 & i25) | (29360128 & i25) | (234881024 & i25) | (i25 & 1879048192));
                        f13 = f11;
                        rVar5 = rVar4;
                        fVar4 = fVar3;
                        n2VarD = n2Var2;
                        acVarE = acVar2;
                        iVar4 = iVar3;
                    } else {
                        sVar2.W();
                        sVar = sVar2;
                        rVar5 = rVar2;
                        fVar4 = fVar2;
                        iVar4 = iVar2;
                        f13 = f5;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new z(eVar, rVar5, eVar2, fVar4, f13, n2VarD, acVarE, iVar4, i11, i12);
                    }
                }
                i16 |= 12582912;
                iVar2 = iVar;
                if ((4793491 & i16) == 4793490) {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            fVar2 = z1.f31389a;
                        }
                        f11 = bc.f30055a;
                        if ((i12 & 32) != 0) {
                            i16 &= -458753;
                            n2VarD = bc.d(sVar2);
                        }
                        if ((i12 & 64) != 0) {
                            i16 &= -3670017;
                            acVarE = bc.e(sVar2);
                        }
                        if (i17 != 0) {
                            rVar4 = rVar3;
                            iVar3 = null;
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                        } else {
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                            iVar3 = iVar2;
                            rVar4 = rVar3;
                        }
                    } else {
                        if (i21 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            fVar2 = z1.f31389a;
                        }
                        f11 = bc.f30055a;
                        if ((i12 & 32) != 0) {
                            i16 &= -458753;
                            n2VarD = bc.d(sVar2);
                        }
                        if ((i12 & 64) != 0) {
                            i16 &= -3670017;
                            acVarE = bc.e(sVar2);
                        }
                        if (i17 != 0) {
                            rVar4 = rVar3;
                            iVar3 = null;
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                        } else {
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                            iVar3 = iVar2;
                            rVar4 = rVar3;
                        }
                    }
                    sVar2.q();
                    j3.y0 y0VarA2 = fc.a(k1.o0.f37679d, sVar2);
                    if (v3.f.b(f11, Float.NaN)) {
                        f12 = bc.f30055a;
                    } else {
                        f12 = bc.f30055a;
                    }
                    int i26 = ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112);
                    int i27 = i16 << 6;
                    sVar = sVar2;
                    b(rVar4, eVar, y0VarA2, false, eVar2, fVar3, f12, n2Var2, acVar2, iVar3, sVar, i26 | (57344 & i27) | (458752 & i27) | (29360128 & i27) | (234881024 & i27) | (i27 & 1879048192));
                    f13 = f11;
                    rVar5 = rVar4;
                    fVar4 = fVar3;
                    n2VarD = n2Var2;
                    acVarE = acVar2;
                    iVar4 = iVar3;
                } else {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            fVar2 = z1.f31389a;
                        }
                        f11 = bc.f30055a;
                        if ((i12 & 32) != 0) {
                            i16 &= -458753;
                            n2VarD = bc.d(sVar2);
                        }
                        if ((i12 & 64) != 0) {
                            i16 &= -3670017;
                            acVarE = bc.e(sVar2);
                        }
                        if (i17 != 0) {
                            rVar4 = rVar3;
                            iVar3 = null;
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                        } else {
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                            iVar3 = iVar2;
                            rVar4 = rVar3;
                        }
                    } else {
                        if (i21 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            fVar2 = z1.f31389a;
                        }
                        f11 = bc.f30055a;
                        if ((i12 & 32) != 0) {
                            i16 &= -458753;
                            n2VarD = bc.d(sVar2);
                        }
                        if ((i12 & 64) != 0) {
                            i16 &= -3670017;
                            acVarE = bc.e(sVar2);
                        }
                        if (i17 != 0) {
                            rVar4 = rVar3;
                            iVar3 = null;
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                        } else {
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                            iVar3 = iVar2;
                            rVar4 = rVar3;
                        }
                    }
                    sVar2.q();
                    j3.y0 y0VarA3 = fc.a(k1.o0.f37679d, sVar2);
                    if (v3.f.b(f11, Float.NaN)) {
                        f12 = bc.f30055a;
                    } else {
                        f12 = bc.f30055a;
                    }
                    int i28 = ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112);
                    int i29 = i16 << 6;
                    sVar = sVar2;
                    b(rVar4, eVar, y0VarA3, false, eVar2, fVar3, f12, n2Var2, acVar2, iVar3, sVar, i28 | (57344 & i29) | (458752 & i29) | (29360128 & i29) | (234881024 & i29) | (i29 & 1879048192));
                    f13 = f11;
                    rVar5 = rVar4;
                    fVar4 = fVar3;
                    n2VarD = n2Var2;
                    acVarE = acVar2;
                    iVar4 = iVar3;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new z(eVar, rVar5, eVar2, fVar4, f13, n2VarD, acVarE, iVar4, i11, i12);
                }
            }
            i13 |= 3072;
            fVar2 = fVar;
            i16 = i13 | 24576;
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    n2VarD = n2Var;
                    if (sVar2.f(n2VarD)) {
                    }
                    i16 |= i22;
                } else {
                    n2VarD = n2Var;
                }
                i16 |= i22;
            } else {
                n2VarD = n2Var;
            }
            if ((1572864 & i11) == 0) {
                if ((i12 & 64) == 0) {
                    acVarE = acVar;
                    if (sVar2.f(acVarE)) {
                    }
                    i16 |= i23;
                } else {
                    acVarE = acVar;
                }
                i16 |= i23;
            } else {
                acVarE = acVar;
            }
            i17 = i12 & 128;
            if (i17 != 0) {
                if ((12582912 & i11) == 0) {
                    iVar2 = iVar;
                    if (sVar2.f(iVar2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i16 |= i18;
                }
                if ((4793491 & i16) == 4793490) {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            fVar2 = z1.f31389a;
                        }
                        f11 = bc.f30055a;
                        if ((i12 & 32) != 0) {
                            i16 &= -458753;
                            n2VarD = bc.d(sVar2);
                        }
                        if ((i12 & 64) != 0) {
                            i16 &= -3670017;
                            acVarE = bc.e(sVar2);
                        }
                        if (i17 != 0) {
                            rVar4 = rVar3;
                            iVar3 = null;
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                        } else {
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                            iVar3 = iVar2;
                            rVar4 = rVar3;
                        }
                    } else {
                        if (i21 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            fVar2 = z1.f31389a;
                        }
                        f11 = bc.f30055a;
                        if ((i12 & 32) != 0) {
                            i16 &= -458753;
                            n2VarD = bc.d(sVar2);
                        }
                        if ((i12 & 64) != 0) {
                            i16 &= -3670017;
                            acVarE = bc.e(sVar2);
                        }
                        if (i17 != 0) {
                            rVar4 = rVar3;
                            iVar3 = null;
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                        } else {
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                            iVar3 = iVar2;
                            rVar4 = rVar3;
                        }
                    }
                    sVar2.q();
                    j3.y0 y0VarA4 = fc.a(k1.o0.f37679d, sVar2);
                    if (v3.f.b(f11, Float.NaN)) {
                        f12 = bc.f30055a;
                    } else {
                        f12 = bc.f30055a;
                    }
                    int i210 = ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112);
                    int i211 = i16 << 6;
                    sVar = sVar2;
                    b(rVar4, eVar, y0VarA4, false, eVar2, fVar3, f12, n2Var2, acVar2, iVar3, sVar, i210 | (57344 & i211) | (458752 & i211) | (29360128 & i211) | (234881024 & i211) | (i211 & 1879048192));
                    f13 = f11;
                    rVar5 = rVar4;
                    fVar4 = fVar3;
                    n2VarD = n2Var2;
                    acVarE = acVar2;
                    iVar4 = iVar3;
                } else {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            fVar2 = z1.f31389a;
                        }
                        f11 = bc.f30055a;
                        if ((i12 & 32) != 0) {
                            i16 &= -458753;
                            n2VarD = bc.d(sVar2);
                        }
                        if ((i12 & 64) != 0) {
                            i16 &= -3670017;
                            acVarE = bc.e(sVar2);
                        }
                        if (i17 != 0) {
                            rVar4 = rVar3;
                            iVar3 = null;
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                        } else {
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                            iVar3 = iVar2;
                            rVar4 = rVar3;
                        }
                    } else {
                        if (i21 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            fVar2 = z1.f31389a;
                        }
                        f11 = bc.f30055a;
                        if ((i12 & 32) != 0) {
                            i16 &= -458753;
                            n2VarD = bc.d(sVar2);
                        }
                        if ((i12 & 64) != 0) {
                            i16 &= -3670017;
                            acVarE = bc.e(sVar2);
                        }
                        if (i17 != 0) {
                            rVar4 = rVar3;
                            iVar3 = null;
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                        } else {
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                            iVar3 = iVar2;
                            rVar4 = rVar3;
                        }
                    }
                    sVar2.q();
                    j3.y0 y0VarA5 = fc.a(k1.o0.f37679d, sVar2);
                    if (v3.f.b(f11, Float.NaN)) {
                        f12 = bc.f30055a;
                    } else {
                        f12 = bc.f30055a;
                    }
                    int i212 = ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112);
                    int i213 = i16 << 6;
                    sVar = sVar2;
                    b(rVar4, eVar, y0VarA5, false, eVar2, fVar3, f12, n2Var2, acVar2, iVar3, sVar, i212 | (57344 & i213) | (458752 & i213) | (29360128 & i213) | (234881024 & i213) | (i213 & 1879048192));
                    f13 = f11;
                    rVar5 = rVar4;
                    fVar4 = fVar3;
                    n2VarD = n2Var2;
                    acVarE = acVar2;
                    iVar4 = iVar3;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new z(eVar, rVar5, eVar2, fVar4, f13, n2VarD, acVarE, iVar4, i11, i12);
                }
            }
            i16 |= 12582912;
            iVar2 = iVar;
            if ((4793491 & i16) == 4793490) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        fVar2 = z1.f31389a;
                    }
                    f11 = bc.f30055a;
                    if ((i12 & 32) != 0) {
                        i16 &= -458753;
                        n2VarD = bc.d(sVar2);
                    }
                    if ((i12 & 64) != 0) {
                        i16 &= -3670017;
                        acVarE = bc.e(sVar2);
                    }
                    if (i17 != 0) {
                        rVar4 = rVar3;
                        iVar3 = null;
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                    } else {
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                        iVar3 = iVar2;
                        rVar4 = rVar3;
                    }
                } else {
                    if (i21 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        fVar2 = z1.f31389a;
                    }
                    f11 = bc.f30055a;
                    if ((i12 & 32) != 0) {
                        i16 &= -458753;
                        n2VarD = bc.d(sVar2);
                    }
                    if ((i12 & 64) != 0) {
                        i16 &= -3670017;
                        acVarE = bc.e(sVar2);
                    }
                    if (i17 != 0) {
                        rVar4 = rVar3;
                        iVar3 = null;
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                    } else {
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                        iVar3 = iVar2;
                        rVar4 = rVar3;
                    }
                }
                sVar2.q();
                j3.y0 y0VarA6 = fc.a(k1.o0.f37679d, sVar2);
                if (v3.f.b(f11, Float.NaN)) {
                    f12 = bc.f30055a;
                } else {
                    f12 = bc.f30055a;
                }
                int i214 = ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112);
                int i215 = i16 << 6;
                sVar = sVar2;
                b(rVar4, eVar, y0VarA6, false, eVar2, fVar3, f12, n2Var2, acVar2, iVar3, sVar, i214 | (57344 & i215) | (458752 & i215) | (29360128 & i215) | (234881024 & i215) | (i215 & 1879048192));
                f13 = f11;
                rVar5 = rVar4;
                fVar4 = fVar3;
                n2VarD = n2Var2;
                acVarE = acVar2;
                iVar4 = iVar3;
            } else {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        fVar2 = z1.f31389a;
                    }
                    f11 = bc.f30055a;
                    if ((i12 & 32) != 0) {
                        i16 &= -458753;
                        n2VarD = bc.d(sVar2);
                    }
                    if ((i12 & 64) != 0) {
                        i16 &= -3670017;
                        acVarE = bc.e(sVar2);
                    }
                    if (i17 != 0) {
                        rVar4 = rVar3;
                        iVar3 = null;
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                    } else {
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                        iVar3 = iVar2;
                        rVar4 = rVar3;
                    }
                } else {
                    if (i21 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        fVar2 = z1.f31389a;
                    }
                    f11 = bc.f30055a;
                    if ((i12 & 32) != 0) {
                        i16 &= -458753;
                        n2VarD = bc.d(sVar2);
                    }
                    if ((i12 & 64) != 0) {
                        i16 &= -3670017;
                        acVarE = bc.e(sVar2);
                    }
                    if (i17 != 0) {
                        rVar4 = rVar3;
                        iVar3 = null;
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                    } else {
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                        iVar3 = iVar2;
                        rVar4 = rVar3;
                    }
                }
                sVar2.q();
                j3.y0 y0VarA7 = fc.a(k1.o0.f37679d, sVar2);
                if (v3.f.b(f11, Float.NaN)) {
                    f12 = bc.f30055a;
                } else {
                    f12 = bc.f30055a;
                }
                int i216 = ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112);
                int i217 = i16 << 6;
                sVar = sVar2;
                b(rVar4, eVar, y0VarA7, false, eVar2, fVar3, f12, n2Var2, acVar2, iVar3, sVar, i216 | (57344 & i217) | (458752 & i217) | (29360128 & i217) | (234881024 & i217) | (i217 & 1879048192));
                f13 = f11;
                rVar5 = rVar4;
                fVar4 = fVar3;
                n2VarD = n2Var2;
                acVarE = acVar2;
                iVar4 = iVar3;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new z(eVar, rVar5, eVar2, fVar4, f13, n2VarD, acVarE, iVar4, i11, i12);
            }
        }
        i13 |= 48;
        rVar2 = rVar;
        if ((i11 & 384) == 0) {
            if (sVar2.h(eVar2)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i13 |= i19;
        }
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                fVar2 = fVar;
                if (sVar2.h(fVar2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i13 | 24576;
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    n2VarD = n2Var;
                    if (sVar2.f(n2VarD)) {
                    }
                    i16 |= i22;
                } else {
                    n2VarD = n2Var;
                }
                i16 |= i22;
            } else {
                n2VarD = n2Var;
            }
            if ((1572864 & i11) == 0) {
                if ((i12 & 64) == 0) {
                    acVarE = acVar;
                    if (sVar2.f(acVarE)) {
                    }
                    i16 |= i23;
                } else {
                    acVarE = acVar;
                }
                i16 |= i23;
            } else {
                acVarE = acVar;
            }
            i17 = i12 & 128;
            if (i17 != 0) {
                if ((12582912 & i11) == 0) {
                    iVar2 = iVar;
                    if (sVar2.f(iVar2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i16 |= i18;
                }
                if ((4793491 & i16) == 4793490) {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            fVar2 = z1.f31389a;
                        }
                        f11 = bc.f30055a;
                        if ((i12 & 32) != 0) {
                            i16 &= -458753;
                            n2VarD = bc.d(sVar2);
                        }
                        if ((i12 & 64) != 0) {
                            i16 &= -3670017;
                            acVarE = bc.e(sVar2);
                        }
                        if (i17 != 0) {
                            rVar4 = rVar3;
                            iVar3 = null;
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                        } else {
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                            iVar3 = iVar2;
                            rVar4 = rVar3;
                        }
                    } else {
                        if (i21 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            fVar2 = z1.f31389a;
                        }
                        f11 = bc.f30055a;
                        if ((i12 & 32) != 0) {
                            i16 &= -458753;
                            n2VarD = bc.d(sVar2);
                        }
                        if ((i12 & 64) != 0) {
                            i16 &= -3670017;
                            acVarE = bc.e(sVar2);
                        }
                        if (i17 != 0) {
                            rVar4 = rVar3;
                            iVar3 = null;
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                        } else {
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                            iVar3 = iVar2;
                            rVar4 = rVar3;
                        }
                    }
                    sVar2.q();
                    j3.y0 y0VarA8 = fc.a(k1.o0.f37679d, sVar2);
                    if (v3.f.b(f11, Float.NaN)) {
                        f12 = bc.f30055a;
                    } else {
                        f12 = bc.f30055a;
                    }
                    int i218 = ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112);
                    int i219 = i16 << 6;
                    sVar = sVar2;
                    b(rVar4, eVar, y0VarA8, false, eVar2, fVar3, f12, n2Var2, acVar2, iVar3, sVar, i218 | (57344 & i219) | (458752 & i219) | (29360128 & i219) | (234881024 & i219) | (i219 & 1879048192));
                    f13 = f11;
                    rVar5 = rVar4;
                    fVar4 = fVar3;
                    n2VarD = n2Var2;
                    acVarE = acVar2;
                    iVar4 = iVar3;
                } else {
                    sVar2.Y();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            fVar2 = z1.f31389a;
                        }
                        f11 = bc.f30055a;
                        if ((i12 & 32) != 0) {
                            i16 &= -458753;
                            n2VarD = bc.d(sVar2);
                        }
                        if ((i12 & 64) != 0) {
                            i16 &= -3670017;
                            acVarE = bc.e(sVar2);
                        }
                        if (i17 != 0) {
                            rVar4 = rVar3;
                            iVar3 = null;
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                        } else {
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                            iVar3 = iVar2;
                            rVar4 = rVar3;
                        }
                    } else {
                        if (i21 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            fVar2 = z1.f31389a;
                        }
                        f11 = bc.f30055a;
                        if ((i12 & 32) != 0) {
                            i16 &= -458753;
                            n2VarD = bc.d(sVar2);
                        }
                        if ((i12 & 64) != 0) {
                            i16 &= -3670017;
                            acVarE = bc.e(sVar2);
                        }
                        if (i17 != 0) {
                            rVar4 = rVar3;
                            iVar3 = null;
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                        } else {
                            fVar3 = fVar2;
                            n2Var2 = n2VarD;
                            acVar2 = acVarE;
                            iVar3 = iVar2;
                            rVar4 = rVar3;
                        }
                    }
                    sVar2.q();
                    j3.y0 y0VarA9 = fc.a(k1.o0.f37679d, sVar2);
                    if (v3.f.b(f11, Float.NaN)) {
                        f12 = bc.f30055a;
                    } else {
                        f12 = bc.f30055a;
                    }
                    int i2110 = ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112);
                    int i2111 = i16 << 6;
                    sVar = sVar2;
                    b(rVar4, eVar, y0VarA9, false, eVar2, fVar3, f12, n2Var2, acVar2, iVar3, sVar, i2110 | (57344 & i2111) | (458752 & i2111) | (29360128 & i2111) | (234881024 & i2111) | (i2111 & 1879048192));
                    f13 = f11;
                    rVar5 = rVar4;
                    fVar4 = fVar3;
                    n2VarD = n2Var2;
                    acVarE = acVar2;
                    iVar4 = iVar3;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new z(eVar, rVar5, eVar2, fVar4, f13, n2VarD, acVarE, iVar4, i11, i12);
                }
            }
            i16 |= 12582912;
            iVar2 = iVar;
            if ((4793491 & i16) == 4793490) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        fVar2 = z1.f31389a;
                    }
                    f11 = bc.f30055a;
                    if ((i12 & 32) != 0) {
                        i16 &= -458753;
                        n2VarD = bc.d(sVar2);
                    }
                    if ((i12 & 64) != 0) {
                        i16 &= -3670017;
                        acVarE = bc.e(sVar2);
                    }
                    if (i17 != 0) {
                        rVar4 = rVar3;
                        iVar3 = null;
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                    } else {
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                        iVar3 = iVar2;
                        rVar4 = rVar3;
                    }
                } else {
                    if (i21 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        fVar2 = z1.f31389a;
                    }
                    f11 = bc.f30055a;
                    if ((i12 & 32) != 0) {
                        i16 &= -458753;
                        n2VarD = bc.d(sVar2);
                    }
                    if ((i12 & 64) != 0) {
                        i16 &= -3670017;
                        acVarE = bc.e(sVar2);
                    }
                    if (i17 != 0) {
                        rVar4 = rVar3;
                        iVar3 = null;
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                    } else {
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                        iVar3 = iVar2;
                        rVar4 = rVar3;
                    }
                }
                sVar2.q();
                j3.y0 y0VarA10 = fc.a(k1.o0.f37679d, sVar2);
                if (v3.f.b(f11, Float.NaN)) {
                    f12 = bc.f30055a;
                } else {
                    f12 = bc.f30055a;
                }
                int i2112 = ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112);
                int i2113 = i16 << 6;
                sVar = sVar2;
                b(rVar4, eVar, y0VarA10, false, eVar2, fVar3, f12, n2Var2, acVar2, iVar3, sVar, i2112 | (57344 & i2113) | (458752 & i2113) | (29360128 & i2113) | (234881024 & i2113) | (i2113 & 1879048192));
                f13 = f11;
                rVar5 = rVar4;
                fVar4 = fVar3;
                n2VarD = n2Var2;
                acVarE = acVar2;
                iVar4 = iVar3;
            } else {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        fVar2 = z1.f31389a;
                    }
                    f11 = bc.f30055a;
                    if ((i12 & 32) != 0) {
                        i16 &= -458753;
                        n2VarD = bc.d(sVar2);
                    }
                    if ((i12 & 64) != 0) {
                        i16 &= -3670017;
                        acVarE = bc.e(sVar2);
                    }
                    if (i17 != 0) {
                        rVar4 = rVar3;
                        iVar3 = null;
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                    } else {
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                        iVar3 = iVar2;
                        rVar4 = rVar3;
                    }
                } else {
                    if (i21 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        fVar2 = z1.f31389a;
                    }
                    f11 = bc.f30055a;
                    if ((i12 & 32) != 0) {
                        i16 &= -458753;
                        n2VarD = bc.d(sVar2);
                    }
                    if ((i12 & 64) != 0) {
                        i16 &= -3670017;
                        acVarE = bc.e(sVar2);
                    }
                    if (i17 != 0) {
                        rVar4 = rVar3;
                        iVar3 = null;
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                    } else {
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                        iVar3 = iVar2;
                        rVar4 = rVar3;
                    }
                }
                sVar2.q();
                j3.y0 y0VarA11 = fc.a(k1.o0.f37679d, sVar2);
                if (v3.f.b(f11, Float.NaN)) {
                    f12 = bc.f30055a;
                } else {
                    f12 = bc.f30055a;
                }
                int i2114 = ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112);
                int i2115 = i16 << 6;
                sVar = sVar2;
                b(rVar4, eVar, y0VarA11, false, eVar2, fVar3, f12, n2Var2, acVar2, iVar3, sVar, i2114 | (57344 & i2115) | (458752 & i2115) | (29360128 & i2115) | (234881024 & i2115) | (i2115 & 1879048192));
                f13 = f11;
                rVar5 = rVar4;
                fVar4 = fVar3;
                n2VarD = n2Var2;
                acVarE = acVar2;
                iVar4 = iVar3;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new z(eVar, rVar5, eVar2, fVar4, f13, n2VarD, acVarE, iVar4, i11, i12);
            }
        }
        i13 |= 3072;
        fVar2 = fVar;
        i16 = i13 | 24576;
        if ((196608 & i11) == 0) {
            if ((i12 & 32) == 0) {
                n2VarD = n2Var;
                if (sVar2.f(n2VarD)) {
                }
                i16 |= i22;
            } else {
                n2VarD = n2Var;
            }
            i16 |= i22;
        } else {
            n2VarD = n2Var;
        }
        if ((1572864 & i11) == 0) {
            if ((i12 & 64) == 0) {
                acVarE = acVar;
                if (sVar2.f(acVarE)) {
                }
                i16 |= i23;
            } else {
                acVarE = acVar;
            }
            i16 |= i23;
        } else {
            acVarE = acVar;
        }
        i17 = i12 & 128;
        if (i17 != 0) {
            if ((12582912 & i11) == 0) {
                iVar2 = iVar;
                if (sVar2.f(iVar2)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i16 |= i18;
            }
            if ((4793491 & i16) == 4793490) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        fVar2 = z1.f31389a;
                    }
                    f11 = bc.f30055a;
                    if ((i12 & 32) != 0) {
                        i16 &= -458753;
                        n2VarD = bc.d(sVar2);
                    }
                    if ((i12 & 64) != 0) {
                        i16 &= -3670017;
                        acVarE = bc.e(sVar2);
                    }
                    if (i17 != 0) {
                        rVar4 = rVar3;
                        iVar3 = null;
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                    } else {
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                        iVar3 = iVar2;
                        rVar4 = rVar3;
                    }
                } else {
                    if (i21 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        fVar2 = z1.f31389a;
                    }
                    f11 = bc.f30055a;
                    if ((i12 & 32) != 0) {
                        i16 &= -458753;
                        n2VarD = bc.d(sVar2);
                    }
                    if ((i12 & 64) != 0) {
                        i16 &= -3670017;
                        acVarE = bc.e(sVar2);
                    }
                    if (i17 != 0) {
                        rVar4 = rVar3;
                        iVar3 = null;
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                    } else {
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                        iVar3 = iVar2;
                        rVar4 = rVar3;
                    }
                }
                sVar2.q();
                j3.y0 y0VarA12 = fc.a(k1.o0.f37679d, sVar2);
                if (v3.f.b(f11, Float.NaN)) {
                    f12 = bc.f30055a;
                } else {
                    f12 = bc.f30055a;
                }
                int i2116 = ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112);
                int i2117 = i16 << 6;
                sVar = sVar2;
                b(rVar4, eVar, y0VarA12, false, eVar2, fVar3, f12, n2Var2, acVar2, iVar3, sVar, i2116 | (57344 & i2117) | (458752 & i2117) | (29360128 & i2117) | (234881024 & i2117) | (i2117 & 1879048192));
                f13 = f11;
                rVar5 = rVar4;
                fVar4 = fVar3;
                n2VarD = n2Var2;
                acVarE = acVar2;
                iVar4 = iVar3;
            } else {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        fVar2 = z1.f31389a;
                    }
                    f11 = bc.f30055a;
                    if ((i12 & 32) != 0) {
                        i16 &= -458753;
                        n2VarD = bc.d(sVar2);
                    }
                    if ((i12 & 64) != 0) {
                        i16 &= -3670017;
                        acVarE = bc.e(sVar2);
                    }
                    if (i17 != 0) {
                        rVar4 = rVar3;
                        iVar3 = null;
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                    } else {
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                        iVar3 = iVar2;
                        rVar4 = rVar3;
                    }
                } else {
                    if (i21 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        fVar2 = z1.f31389a;
                    }
                    f11 = bc.f30055a;
                    if ((i12 & 32) != 0) {
                        i16 &= -458753;
                        n2VarD = bc.d(sVar2);
                    }
                    if ((i12 & 64) != 0) {
                        i16 &= -3670017;
                        acVarE = bc.e(sVar2);
                    }
                    if (i17 != 0) {
                        rVar4 = rVar3;
                        iVar3 = null;
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                    } else {
                        fVar3 = fVar2;
                        n2Var2 = n2VarD;
                        acVar2 = acVarE;
                        iVar3 = iVar2;
                        rVar4 = rVar3;
                    }
                }
                sVar2.q();
                j3.y0 y0VarA13 = fc.a(k1.o0.f37679d, sVar2);
                if (v3.f.b(f11, Float.NaN)) {
                    f12 = bc.f30055a;
                } else {
                    f12 = bc.f30055a;
                }
                int i2118 = ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112);
                int i2119 = i16 << 6;
                sVar = sVar2;
                b(rVar4, eVar, y0VarA13, false, eVar2, fVar3, f12, n2Var2, acVar2, iVar3, sVar, i2118 | (57344 & i2119) | (458752 & i2119) | (29360128 & i2119) | (234881024 & i2119) | (i2119 & 1879048192));
                f13 = f11;
                rVar5 = rVar4;
                fVar4 = fVar3;
                n2VarD = n2Var2;
                acVarE = acVar2;
                iVar4 = iVar3;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new z(eVar, rVar5, eVar2, fVar4, f13, n2VarD, acVarE, iVar4, i11, i12);
            }
        }
        i16 |= 12582912;
        iVar2 = iVar;
        if ((4793491 & i16) == 4793490) {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    fVar2 = z1.f31389a;
                }
                f11 = bc.f30055a;
                if ((i12 & 32) != 0) {
                    i16 &= -458753;
                    n2VarD = bc.d(sVar2);
                }
                if ((i12 & 64) != 0) {
                    i16 &= -3670017;
                    acVarE = bc.e(sVar2);
                }
                if (i17 != 0) {
                    rVar4 = rVar3;
                    iVar3 = null;
                    fVar3 = fVar2;
                    n2Var2 = n2VarD;
                    acVar2 = acVarE;
                } else {
                    fVar3 = fVar2;
                    n2Var2 = n2VarD;
                    acVar2 = acVarE;
                    iVar3 = iVar2;
                    rVar4 = rVar3;
                }
            } else {
                if (i21 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    fVar2 = z1.f31389a;
                }
                f11 = bc.f30055a;
                if ((i12 & 32) != 0) {
                    i16 &= -458753;
                    n2VarD = bc.d(sVar2);
                }
                if ((i12 & 64) != 0) {
                    i16 &= -3670017;
                    acVarE = bc.e(sVar2);
                }
                if (i17 != 0) {
                    rVar4 = rVar3;
                    iVar3 = null;
                    fVar3 = fVar2;
                    n2Var2 = n2VarD;
                    acVar2 = acVarE;
                } else {
                    fVar3 = fVar2;
                    n2Var2 = n2VarD;
                    acVar2 = acVarE;
                    iVar3 = iVar2;
                    rVar4 = rVar3;
                }
            }
            sVar2.q();
            j3.y0 y0VarA14 = fc.a(k1.o0.f37679d, sVar2);
            if (v3.f.b(f11, Float.NaN)) {
                f12 = bc.f30055a;
            } else {
                f12 = bc.f30055a;
            }
            int i21110 = ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112);
            int i21111 = i16 << 6;
            sVar = sVar2;
            b(rVar4, eVar, y0VarA14, false, eVar2, fVar3, f12, n2Var2, acVar2, iVar3, sVar, i21110 | (57344 & i21111) | (458752 & i21111) | (29360128 & i21111) | (234881024 & i21111) | (i21111 & 1879048192));
            f13 = f11;
            rVar5 = rVar4;
            fVar4 = fVar3;
            n2VarD = n2Var2;
            acVarE = acVar2;
            iVar4 = iVar3;
        } else {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    fVar2 = z1.f31389a;
                }
                f11 = bc.f30055a;
                if ((i12 & 32) != 0) {
                    i16 &= -458753;
                    n2VarD = bc.d(sVar2);
                }
                if ((i12 & 64) != 0) {
                    i16 &= -3670017;
                    acVarE = bc.e(sVar2);
                }
                if (i17 != 0) {
                    rVar4 = rVar3;
                    iVar3 = null;
                    fVar3 = fVar2;
                    n2Var2 = n2VarD;
                    acVar2 = acVarE;
                } else {
                    fVar3 = fVar2;
                    n2Var2 = n2VarD;
                    acVar2 = acVarE;
                    iVar3 = iVar2;
                    rVar4 = rVar3;
                }
            } else {
                if (i21 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    fVar2 = z1.f31389a;
                }
                f11 = bc.f30055a;
                if ((i12 & 32) != 0) {
                    i16 &= -458753;
                    n2VarD = bc.d(sVar2);
                }
                if ((i12 & 64) != 0) {
                    i16 &= -3670017;
                    acVarE = bc.e(sVar2);
                }
                if (i17 != 0) {
                    rVar4 = rVar3;
                    iVar3 = null;
                    fVar3 = fVar2;
                    n2Var2 = n2VarD;
                    acVar2 = acVarE;
                } else {
                    fVar3 = fVar2;
                    n2Var2 = n2VarD;
                    acVar2 = acVarE;
                    iVar3 = iVar2;
                    rVar4 = rVar3;
                }
            }
            sVar2.q();
            j3.y0 y0VarA15 = fc.a(k1.o0.f37679d, sVar2);
            if (v3.f.b(f11, Float.NaN)) {
                f12 = bc.f30055a;
            } else {
                f12 = bc.f30055a;
            }
            int i21112 = ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112);
            int i21113 = i16 << 6;
            sVar = sVar2;
            b(rVar4, eVar, y0VarA15, false, eVar2, fVar3, f12, n2Var2, acVar2, iVar3, sVar, i21112 | (57344 & i21113) | (458752 & i21113) | (29360128 & i21113) | (234881024 & i21113) | (i21113 & 1879048192));
            f13 = f11;
            rVar5 = rVar4;
            fVar4 = fVar3;
            n2VarD = n2Var2;
            acVarE = acVar2;
            iVar4 = iVar3;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z(eVar, rVar5, eVar2, fVar4, f13, n2VarD, acVarE, iVar4, i11, i12);
        }
    }

    public static final void d(z1.r rVar, v vVar, long j11, long j12, long j13, fz.e eVar, j3.y0 y0Var, j0.h hVar, j0.f fVar, fz.e eVar2, t1.d dVar, l1.n nVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        l1.s sVar;
        long j14 = j13;
        t1.d dVar2 = dVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-742442296);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.f(rVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? sVar2.f(vVar) : sVar2.h(vVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar2.e(j11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar2.e(j12) ? 2048 : 1024;
        }
        int i17 = i13;
        if ((i11 & 24576) == 0) {
            i14 = i17 | (sVar2.e(j14) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        } else {
            i14 = i17;
        }
        if ((i11 & 196608) == 0) {
            i15 = i14 | (sVar2.h(eVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        } else {
            i15 = i14;
        }
        if ((i11 & 1572864) == 0) {
            i15 |= sVar2.f(y0Var) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i15 |= sVar2.c(1.0f) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i15 |= sVar2.f(hVar) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i15 |= sVar2.f(fVar) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i16 = i12 | (sVar2.d(0) ? 4 : 2);
        } else {
            i16 = i12;
        }
        if ((i12 & 48) == 0) {
            i16 |= sVar2.g(false) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i16 |= sVar2.h(eVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i16 |= sVar2.h(dVar2) ? 2048 : 1024;
        }
        int i18 = i16;
        if ((i15 & 306783379) == 306783378 && (i18 & 1171) == 1170 && sVar2.F()) {
            sVar2.W();
            sVar = sVar2;
        } else {
            boolean z11 = ((i15 & 112) == 32 || ((i15 & 64) != 0 && sVar2.h(vVar))) | ((i15 & 1879048192) == 536870912) | ((i15 & 234881024) == 67108864) | ((i18 & 14) == 4);
            Object objQ = sVar2.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new b0(vVar, fVar, hVar);
                sVar2.o0(objQ);
            }
            w2.q0 q0Var = (w2.q0) objQ;
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, q0Var, sVar2);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar2);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar2);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarL = w2.a0.l(oVar, "navigationIcon");
            float f5 = f30186a;
            z1.r rVarE = j0.c.E(rVarL, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            z1.j jVar = z1.c.f58463a;
            w2.q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarE);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar2, q0VarD, sVar2);
            l1.t.J(hVar3, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
            }
            l1.t.J(hVar5, rVarC2, sVar2);
            l1.d0 d0Var = h2.f30320a;
            l1.t.a(d0Var.a(new g2.x(j11)), eVar2, sVar2, ((i18 >> 3) & 112) | 8);
            sVar2.p(true);
            z1.r rVarR = g2.f0.r(j0.c.C(w2.a0.l(oVar, "title"), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2).i(oVar), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, null, 131067);
            w2.q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode3 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL3 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, rVarR);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar2, q0VarD2, sVar2);
            l1.t.J(hVar3, q1VarL3, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar4);
            }
            l1.t.J(hVar5, rVarC3, sVar2);
            int i19 = i15 >> 9;
            i1.p.a(j12, y0Var, eVar, sVar2, (i19 & 14) | ((i15 >> 15) & 112) | (i19 & 896));
            sVar = sVar2;
            sVar.p(true);
            z1.r rVarE2 = j0.c.E(w2.a0.l(oVar, "actionIcons"), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, 11);
            w2.q0 q0VarD3 = j0.o.d(jVar, false);
            int iHashCode4 = Long.hashCode(sVar.T);
            l1.q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarE2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, q0VarD3, sVar);
            l1.t.J(hVar3, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar4);
            }
            l1.t.J(hVar5, rVarC4, sVar);
            j14 = j13;
            dVar2 = dVar;
            l1.t.a(d0Var.a(new g2.x(j14)), dVar2, sVar, 8 | ((i18 >> 6) & 112));
            sVar.p(true);
            sVar.p(true);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c0(rVar, vVar, j11, j12, j14, eVar, y0Var, hVar, fVar, eVar2, dVar2, i11, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object e(cc ccVar, float f5, b0.x xVar, b0.i1 i1Var, xy.c cVar) {
        d0 d0Var;
        kotlin.jvm.internal.v vVar;
        kotlin.jvm.internal.v vVar2;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i11 = d0Var.f30124e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                d0Var.f30124e = i11 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(cVar);
            }
        } else {
            d0Var = new d0(cVar);
        }
        d0 d0Var2 = d0Var;
        Object obj = d0Var2.f30123d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = d0Var2.f30124e;
        if (i12 != 0) {
            if (i12 == 1) {
                kotlin.jvm.internal.v vVar3 = d0Var2.f30122c;
                i1Var = d0Var2.f30121b;
                cc ccVar2 = (cc) d0Var2.f30120a;
                com.bumptech.glide.e.F(obj);
                vVar = vVar3;
                ccVar = ccVar2;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vVar2 = (kotlin.jvm.internal.v) d0Var2.f30120a;
                com.bumptech.glide.e.F(obj);
            }
            vVar = vVar2;
            return new v3.q(gb.r.b(CropImageView.DEFAULT_ASPECT_RATIO, vVar.f38358a));
        }
        com.bumptech.glide.e.F(obj);
        if (ccVar.a() < 0.01f || ccVar.a() == 1.0f) {
            return new v3.q(0L);
        }
        vVar = new kotlin.jvm.internal.v();
        vVar.f38358a = f5;
        if (xVar != null && Math.abs(f5) > 1.0f) {
            kotlin.jvm.internal.v vVar4 = new kotlin.jvm.internal.v();
            b0.n nVarB = b0.e.b(CropImageView.DEFAULT_ASPECT_RATIO, f5, 28);
            a0.j jVar = new a0.j(vVar4, ccVar, vVar, 7);
            d0Var2.f30120a = ccVar;
            d0Var2.f30121b = i1Var;
            d0Var2.f30122c = vVar;
            d0Var2.f30124e = 1;
            if (b0.e.f(nVarB, xVar, false, jVar, d0Var2) != aVar) {
            }
            return aVar;
        }
        return new v3.q(gb.r.b(CropImageView.DEFAULT_ASPECT_RATIO, vVar.f38358a));
        b0.i1 i1Var2 = i1Var;
        if (i1Var2 != null) {
            l1.g1 g1Var = ccVar.f30112c;
            l1.g1 g1Var2 = ccVar.f30110a;
            l1.g1 g1Var3 = ccVar.f30112c;
            if (g1Var.l() < CropImageView.DEFAULT_ASPECT_RATIO && g1Var3.l() > g1Var2.l()) {
                b0.n nVarB2 = b0.e.b(g1Var3.l(), CropImageView.DEFAULT_ASPECT_RATIO, 30);
                Float f11 = new Float(ccVar.a() < 0.5f ? 0.0f : g1Var2.l());
                a0.o0 o0Var = new a0.o0(ccVar, 12);
                d0Var2.f30120a = vVar;
                d0Var2.f30121b = null;
                d0Var2.f30122c = null;
                d0Var2.f30124e = 2;
                if (b0.e.i(nVarB2, f11, i1Var2, false, o0Var, d0Var2, 4) != aVar) {
                    vVar2 = vVar;
                    vVar = vVar2;
                }
                return aVar;
            }
        }
        return new v3.q(gb.r.b(CropImageView.DEFAULT_ASPECT_RATIO, vVar.f38358a));
    }
}
