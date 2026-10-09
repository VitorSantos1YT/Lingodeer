package h1;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f30851a = 16;

    /* JADX WARN: Code duplicated, block: B:101:0x0142  */
    /* JADX WARN: Code duplicated, block: B:104:0x0149  */
    /* JADX WARN: Code duplicated, block: B:107:0x014f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0165  */
    /* JADX WARN: Code duplicated, block: B:111:0x0173  */
    /* JADX WARN: Code duplicated, block: B:114:0x0187  */
    /* JADX WARN: Code duplicated, block: B:116:0x018d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0197 A[PHI: r29
      0x0197: PHI (r29v3 fz.e) = (r29v1 fz.e), (r29v4 fz.e) binds: [B:119:0x0195, B:117:0x0190] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:128:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:130:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:141:0x023e  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x0103  */
    /* JADX WARN: Code duplicated, block: B:86:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0138  */
    /* JADX WARN: Code duplicated, block: B:99:0x013d  */
    public static final void a(z1.r rVar, fz.e eVar, fz.e eVar2, fz.e eVar3, fz.e eVar4, int i11, long j11, long j12, j0.n2 n2Var, t1.d dVar, l1.n nVar, int i12, int i13) {
        z1.r rVar2;
        int i14;
        fz.e eVar5;
        int i15;
        fz.e eVar6;
        int i16;
        int i17;
        int i18;
        fz.e eVar7;
        int i19;
        int i21;
        long j13;
        t1.d dVar2;
        long jB;
        int i22;
        fz.e eVar8;
        z1.r rVar3;
        int i23;
        int i24;
        j0.n2 n2Var2;
        int i25;
        fz.e eVar9;
        boolean z11;
        Object objQ;
        boolean z12;
        i1.r0 r0Var;
        boolean z13;
        Object objQ2;
        long j14;
        fz.e eVar10;
        fz.e eVar11;
        int i26;
        j0.n2 n2Var3;
        z1.r rVar4;
        long j15;
        fz.e eVar12;
        fz.e eVar13;
        l1.x1 x1VarT;
        int i27;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1219521777);
        int i28 = i13 & 1;
        if (i28 != 0) {
            i14 = i12 | 6;
            rVar2 = rVar;
        } else if ((i12 & 6) == 0) {
            rVar2 = rVar;
            i14 = (sVar.f(rVar2) ? 4 : 2) | i12;
        } else {
            rVar2 = rVar;
            i14 = i12;
        }
        int i29 = i13 & 2;
        if (i29 == 0) {
            if ((i12 & 48) == 0) {
                eVar5 = eVar;
                i14 |= sVar.h(eVar5) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                if ((i12 & 384) == 0) {
                    eVar6 = eVar2;
                    if (sVar.h(eVar6)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i14 |= i16;
                }
                i17 = i14 | 3072;
                i18 = i13 & 16;
                if (i18 != 0) {
                    if ((i12 & 24576) == 0) {
                        eVar7 = eVar4;
                        if (sVar.h(eVar7)) {
                            i19 = 16384;
                        } else {
                            i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                        }
                        i17 |= i19;
                    }
                    i21 = i17 | 196608;
                    if ((1572864 & i12) == 0) {
                        if ((i13 & 64) == 0) {
                            j13 = j11;
                            int i30 = sVar.e(j13) ? 1048576 : 524288;
                            i21 |= i30;
                        } else {
                            j13 = j11;
                        }
                        i21 |= i30;
                    } else {
                        j13 = j11;
                    }
                    if ((i12 & 12582912) == 0) {
                        i21 |= 4194304;
                    }
                    if ((i12 & 100663296) != 0) {
                        i21 |= ((i13 & 256) == 0 || !sVar.f(n2Var)) ? 33554432 : 67108864;
                    }
                    if ((i12 & 805306368) == 0) {
                        if (sVar.h(dVar)) {
                            i27 = 536870912;
                        } else {
                            i27 = 268435456;
                        }
                        i21 |= i27;
                    }
                    if ((i21 & 306783379) == 306783378 || !sVar.F()) {
                        sVar.Y();
                        if ((i12 & 1) != 0 || sVar.C()) {
                            if (i28 != 0) {
                                rVar2 = z1.o.f58481a;
                            }
                            if (i29 != 0) {
                                eVar5 = d2.f30126a;
                            }
                            if (i15 != 0) {
                                eVar6 = d2.f30127b;
                            }
                            dVar2 = d2.f30128c;
                            if (i18 != 0) {
                                eVar7 = d2.f30129d;
                            }
                            if ((i13 & 64) != 0) {
                                j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                                i21 &= -3670017;
                            }
                            jB = v1.b(j13, sVar);
                            i22 = i21 & (-29360129);
                            if ((i13 & 256) != 0) {
                                WeakHashMap weakHashMap = j0.o2.f35353v;
                                n2Var2 = j0.b.e(sVar).f35360g;
                                i23 = (-264241153) & i21;
                                eVar8 = dVar2;
                                rVar3 = rVar2;
                                i24 = 2;
                            } else {
                                eVar8 = dVar2;
                                rVar3 = rVar2;
                                i23 = i22;
                                i24 = 2;
                                n2Var2 = n2Var;
                            }
                        } else {
                            sVar.W();
                            if ((i13 & 64) != 0) {
                                i21 &= -3670017;
                            }
                            int i31 = i21 & (-29360129);
                            if ((i13 & 256) != 0) {
                                i31 = i21 & (-264241153);
                            }
                            eVar8 = eVar3;
                            jB = j12;
                            n2Var2 = n2Var;
                            i23 = i31;
                            rVar3 = rVar2;
                            i24 = i11;
                        }
                        sVar.q();
                        i25 = (234881024 & i23) ^ 100663296;
                        boolean z14 = true;
                        if (i25 > 67108864 || !sVar.f(n2Var2)) {
                            eVar9 = eVar8;
                            if ((i23 & 100663296) != 67108864) {
                                z11 = false;
                            }
                            objQ = sVar.Q();
                            z12 = z11;
                            l1.g gVar = l1.m.f39353a;
                            if (z12 || objQ == gVar) {
                                objQ = new i1.r0(n2Var2);
                                sVar.o0(objQ);
                            }
                            r0Var = (i1.r0) objQ;
                            boolean zF = sVar.f(r0Var);
                            int i32 = i24;
                            if ((i25 > 67108864 || !sVar.f(n2Var2)) && (i23 & 100663296) != 67108864) {
                            }
                            z13 = zF | z14;
                            objQ2 = sVar.Q();
                            if (z13 || objQ2 == gVar) {
                                objQ2 = new a0.e(10, r0Var, n2Var2);
                                sVar.o0(objQ2);
                            }
                            fz.e eVar14 = eVar7;
                            fz.e eVar15 = eVar5;
                            fz.e eVar16 = eVar6;
                            long j16 = j13;
                            long j17 = jB;
                            i9.a(z1.a.a(rVar3, new d1.e1((fz.c) objQ2, 2)), null, j16, j17, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1979205334, new a0.m(i32, eVar15, dVar, eVar9, eVar14, r0Var, eVar16), sVar), sVar, ((i23 >> 12) & 896) | 12582912, 114);
                            j14 = j16;
                            eVar10 = eVar15;
                            eVar11 = eVar16;
                            i26 = i32;
                            n2Var3 = n2Var2;
                            rVar4 = rVar3;
                            j15 = j17;
                            eVar12 = eVar9;
                            eVar13 = eVar14;
                        } else {
                            eVar9 = eVar8;
                        }
                        z11 = true;
                        objQ = sVar.Q();
                        z12 = z11;
                        l1.g gVar2 = l1.m.f39353a;
                        if (z12) {
                            objQ = new i1.r0(n2Var2);
                            sVar.o0(objQ);
                        } else {
                            objQ = new i1.r0(n2Var2);
                            sVar.o0(objQ);
                        }
                        r0Var = (i1.r0) objQ;
                        boolean zF2 = sVar.f(r0Var);
                        int i33 = i24;
                        z14 = i25 > 67108864 ? false : false;
                        z13 = zF2 | z14;
                        objQ2 = sVar.Q();
                        if (z13) {
                            objQ2 = new a0.e(10, r0Var, n2Var2);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new a0.e(10, r0Var, n2Var2);
                            sVar.o0(objQ2);
                        }
                        fz.e eVar17 = eVar7;
                        fz.e eVar18 = eVar5;
                        fz.e eVar19 = eVar6;
                        long j18 = j13;
                        long j19 = jB;
                        i9.a(z1.a.a(rVar3, new d1.e1((fz.c) objQ2, 2)), null, j18, j19, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1979205334, new a0.m(i33, eVar18, dVar, eVar9, eVar17, r0Var, eVar19), sVar), sVar, ((i23 >> 12) & 896) | 12582912, 114);
                        j14 = j18;
                        eVar10 = eVar18;
                        eVar11 = eVar19;
                        i26 = i33;
                        n2Var3 = n2Var2;
                        rVar4 = rVar3;
                        j15 = j19;
                        eVar12 = eVar9;
                        eVar13 = eVar17;
                    } else {
                        sVar.W();
                        eVar12 = eVar3;
                        i26 = i11;
                        rVar4 = rVar2;
                        eVar10 = eVar5;
                        j15 = j12;
                        eVar13 = eVar7;
                        eVar11 = eVar6;
                        j14 = j13;
                        n2Var3 = n2Var;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new n7(rVar4, eVar10, eVar11, eVar12, eVar13, i26, j14, j15, n2Var3, dVar, i12, i13);
                    }
                }
                i17 = i14 | 27648;
                eVar7 = eVar4;
                i21 = i17 | 196608;
                if ((1572864 & i12) == 0) {
                    if ((i13 & 64) == 0) {
                        j13 = j11;
                        if (sVar.e(j13)) {
                        }
                        i21 |= i30;
                    } else {
                        j13 = j11;
                    }
                    i21 |= i30;
                } else {
                    j13 = j11;
                }
                if ((i12 & 12582912) == 0) {
                    i21 |= 4194304;
                }
                if ((i12 & 100663296) != 0) {
                    i21 |= ((i13 & 256) == 0 || !sVar.f(n2Var)) ? 33554432 : 67108864;
                }
                if ((i12 & 805306368) == 0) {
                    if (sVar.h(dVar)) {
                        i27 = 536870912;
                    } else {
                        i27 = 268435456;
                    }
                    i21 |= i27;
                }
                if ((i21 & 306783379) == 306783378) {
                    sVar.Y();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i29 != 0) {
                            eVar5 = d2.f30126a;
                        }
                        if (i15 != 0) {
                            eVar6 = d2.f30127b;
                        }
                        dVar2 = d2.f30128c;
                        if (i18 != 0) {
                            eVar7 = d2.f30129d;
                        }
                        if ((i13 & 64) != 0) {
                            j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                            i21 &= -3670017;
                        }
                        jB = v1.b(j13, sVar);
                        i22 = i21 & (-29360129);
                        if ((i13 & 256) != 0) {
                            WeakHashMap weakHashMap2 = j0.o2.f35353v;
                            n2Var2 = j0.b.e(sVar).f35360g;
                            i23 = (-264241153) & i21;
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i24 = 2;
                        } else {
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i23 = i22;
                            i24 = 2;
                            n2Var2 = n2Var;
                        }
                    } else {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i29 != 0) {
                            eVar5 = d2.f30126a;
                        }
                        if (i15 != 0) {
                            eVar6 = d2.f30127b;
                        }
                        dVar2 = d2.f30128c;
                        if (i18 != 0) {
                            eVar7 = d2.f30129d;
                        }
                        if ((i13 & 64) != 0) {
                            j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                            i21 &= -3670017;
                        }
                        jB = v1.b(j13, sVar);
                        i22 = i21 & (-29360129);
                        if ((i13 & 256) != 0) {
                            WeakHashMap weakHashMap3 = j0.o2.f35353v;
                            n2Var2 = j0.b.e(sVar).f35360g;
                            i23 = (-264241153) & i21;
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i24 = 2;
                        } else {
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i23 = i22;
                            i24 = 2;
                            n2Var2 = n2Var;
                        }
                    }
                    sVar.q();
                    i25 = (234881024 & i23) ^ 100663296;
                    boolean z15 = true;
                    if (i25 > 67108864) {
                        eVar9 = eVar8;
                        if ((i23 & 100663296) != 67108864) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        eVar9 = eVar8;
                        if ((i23 & 100663296) != 67108864) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    objQ = sVar.Q();
                    z12 = z11;
                    l1.g gVar3 = l1.m.f39353a;
                    if (z12) {
                        objQ = new i1.r0(n2Var2);
                        sVar.o0(objQ);
                    } else {
                        objQ = new i1.r0(n2Var2);
                        sVar.o0(objQ);
                    }
                    r0Var = (i1.r0) objQ;
                    boolean zF3 = sVar.f(r0Var);
                    int i34 = i24;
                    if (i25 > 67108864) {
                    }
                    z13 = zF3 | z15;
                    objQ2 = sVar.Q();
                    if (z13) {
                        objQ2 = new a0.e(10, r0Var, n2Var2);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new a0.e(10, r0Var, n2Var2);
                        sVar.o0(objQ2);
                    }
                    fz.e eVar110 = eVar7;
                    fz.e eVar111 = eVar5;
                    fz.e eVar112 = eVar6;
                    long j110 = j13;
                    long j111 = jB;
                    i9.a(z1.a.a(rVar3, new d1.e1((fz.c) objQ2, 2)), null, j110, j111, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1979205334, new a0.m(i34, eVar111, dVar, eVar9, eVar110, r0Var, eVar112), sVar), sVar, ((i23 >> 12) & 896) | 12582912, 114);
                    j14 = j110;
                    eVar10 = eVar111;
                    eVar11 = eVar112;
                    i26 = i34;
                    n2Var3 = n2Var2;
                    rVar4 = rVar3;
                    j15 = j111;
                    eVar12 = eVar9;
                    eVar13 = eVar110;
                } else {
                    sVar.Y();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i29 != 0) {
                            eVar5 = d2.f30126a;
                        }
                        if (i15 != 0) {
                            eVar6 = d2.f30127b;
                        }
                        dVar2 = d2.f30128c;
                        if (i18 != 0) {
                            eVar7 = d2.f30129d;
                        }
                        if ((i13 & 64) != 0) {
                            j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                            i21 &= -3670017;
                        }
                        jB = v1.b(j13, sVar);
                        i22 = i21 & (-29360129);
                        if ((i13 & 256) != 0) {
                            WeakHashMap weakHashMap4 = j0.o2.f35353v;
                            n2Var2 = j0.b.e(sVar).f35360g;
                            i23 = (-264241153) & i21;
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i24 = 2;
                        } else {
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i23 = i22;
                            i24 = 2;
                            n2Var2 = n2Var;
                        }
                    } else {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i29 != 0) {
                            eVar5 = d2.f30126a;
                        }
                        if (i15 != 0) {
                            eVar6 = d2.f30127b;
                        }
                        dVar2 = d2.f30128c;
                        if (i18 != 0) {
                            eVar7 = d2.f30129d;
                        }
                        if ((i13 & 64) != 0) {
                            j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                            i21 &= -3670017;
                        }
                        jB = v1.b(j13, sVar);
                        i22 = i21 & (-29360129);
                        if ((i13 & 256) != 0) {
                            WeakHashMap weakHashMap5 = j0.o2.f35353v;
                            n2Var2 = j0.b.e(sVar).f35360g;
                            i23 = (-264241153) & i21;
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i24 = 2;
                        } else {
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i23 = i22;
                            i24 = 2;
                            n2Var2 = n2Var;
                        }
                    }
                    sVar.q();
                    i25 = (234881024 & i23) ^ 100663296;
                    boolean z16 = true;
                    if (i25 > 67108864) {
                        eVar9 = eVar8;
                        if ((i23 & 100663296) != 67108864) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        eVar9 = eVar8;
                        if ((i23 & 100663296) != 67108864) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    objQ = sVar.Q();
                    z12 = z11;
                    l1.g gVar4 = l1.m.f39353a;
                    if (z12) {
                        objQ = new i1.r0(n2Var2);
                        sVar.o0(objQ);
                    } else {
                        objQ = new i1.r0(n2Var2);
                        sVar.o0(objQ);
                    }
                    r0Var = (i1.r0) objQ;
                    boolean zF4 = sVar.f(r0Var);
                    int i35 = i24;
                    if (i25 > 67108864) {
                    }
                    z13 = zF4 | z16;
                    objQ2 = sVar.Q();
                    if (z13) {
                        objQ2 = new a0.e(10, r0Var, n2Var2);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new a0.e(10, r0Var, n2Var2);
                        sVar.o0(objQ2);
                    }
                    fz.e eVar113 = eVar7;
                    fz.e eVar114 = eVar5;
                    fz.e eVar115 = eVar6;
                    long j112 = j13;
                    long j113 = jB;
                    i9.a(z1.a.a(rVar3, new d1.e1((fz.c) objQ2, 2)), null, j112, j113, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1979205334, new a0.m(i35, eVar114, dVar, eVar9, eVar113, r0Var, eVar115), sVar), sVar, ((i23 >> 12) & 896) | 12582912, 114);
                    j14 = j112;
                    eVar10 = eVar114;
                    eVar11 = eVar115;
                    i26 = i35;
                    n2Var3 = n2Var2;
                    rVar4 = rVar3;
                    j15 = j113;
                    eVar12 = eVar9;
                    eVar13 = eVar113;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new n7(rVar4, eVar10, eVar11, eVar12, eVar13, i26, j14, j15, n2Var3, dVar, i12, i13);
                }
            }
            i14 |= 384;
            eVar6 = eVar2;
            i17 = i14 | 3072;
            i18 = i13 & 16;
            if (i18 != 0) {
                if ((i12 & 24576) == 0) {
                    eVar7 = eVar4;
                    if (sVar.h(eVar7)) {
                        i19 = 16384;
                    } else {
                        i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i17 |= i19;
                }
                i21 = i17 | 196608;
                if ((1572864 & i12) == 0) {
                    if ((i13 & 64) == 0) {
                        j13 = j11;
                        if (sVar.e(j13)) {
                        }
                        i21 |= i30;
                    } else {
                        j13 = j11;
                    }
                    i21 |= i30;
                } else {
                    j13 = j11;
                }
                if ((i12 & 12582912) == 0) {
                    i21 |= 4194304;
                }
                if ((i12 & 100663296) != 0) {
                    i21 |= ((i13 & 256) == 0 || !sVar.f(n2Var)) ? 33554432 : 67108864;
                }
                if ((i12 & 805306368) == 0) {
                    if (sVar.h(dVar)) {
                        i27 = 536870912;
                    } else {
                        i27 = 268435456;
                    }
                    i21 |= i27;
                }
                if ((i21 & 306783379) == 306783378) {
                    sVar.Y();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i29 != 0) {
                            eVar5 = d2.f30126a;
                        }
                        if (i15 != 0) {
                            eVar6 = d2.f30127b;
                        }
                        dVar2 = d2.f30128c;
                        if (i18 != 0) {
                            eVar7 = d2.f30129d;
                        }
                        if ((i13 & 64) != 0) {
                            j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                            i21 &= -3670017;
                        }
                        jB = v1.b(j13, sVar);
                        i22 = i21 & (-29360129);
                        if ((i13 & 256) != 0) {
                            WeakHashMap weakHashMap6 = j0.o2.f35353v;
                            n2Var2 = j0.b.e(sVar).f35360g;
                            i23 = (-264241153) & i21;
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i24 = 2;
                        } else {
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i23 = i22;
                            i24 = 2;
                            n2Var2 = n2Var;
                        }
                    } else {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i29 != 0) {
                            eVar5 = d2.f30126a;
                        }
                        if (i15 != 0) {
                            eVar6 = d2.f30127b;
                        }
                        dVar2 = d2.f30128c;
                        if (i18 != 0) {
                            eVar7 = d2.f30129d;
                        }
                        if ((i13 & 64) != 0) {
                            j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                            i21 &= -3670017;
                        }
                        jB = v1.b(j13, sVar);
                        i22 = i21 & (-29360129);
                        if ((i13 & 256) != 0) {
                            WeakHashMap weakHashMap7 = j0.o2.f35353v;
                            n2Var2 = j0.b.e(sVar).f35360g;
                            i23 = (-264241153) & i21;
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i24 = 2;
                        } else {
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i23 = i22;
                            i24 = 2;
                            n2Var2 = n2Var;
                        }
                    }
                    sVar.q();
                    i25 = (234881024 & i23) ^ 100663296;
                    boolean z17 = true;
                    if (i25 > 67108864) {
                        eVar9 = eVar8;
                        if ((i23 & 100663296) != 67108864) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        eVar9 = eVar8;
                        if ((i23 & 100663296) != 67108864) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    objQ = sVar.Q();
                    z12 = z11;
                    l1.g gVar5 = l1.m.f39353a;
                    if (z12) {
                        objQ = new i1.r0(n2Var2);
                        sVar.o0(objQ);
                    } else {
                        objQ = new i1.r0(n2Var2);
                        sVar.o0(objQ);
                    }
                    r0Var = (i1.r0) objQ;
                    boolean zF5 = sVar.f(r0Var);
                    int i36 = i24;
                    if (i25 > 67108864) {
                    }
                    z13 = zF5 | z17;
                    objQ2 = sVar.Q();
                    if (z13) {
                        objQ2 = new a0.e(10, r0Var, n2Var2);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new a0.e(10, r0Var, n2Var2);
                        sVar.o0(objQ2);
                    }
                    fz.e eVar116 = eVar7;
                    fz.e eVar117 = eVar5;
                    fz.e eVar118 = eVar6;
                    long j114 = j13;
                    long j115 = jB;
                    i9.a(z1.a.a(rVar3, new d1.e1((fz.c) objQ2, 2)), null, j114, j115, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1979205334, new a0.m(i36, eVar117, dVar, eVar9, eVar116, r0Var, eVar118), sVar), sVar, ((i23 >> 12) & 896) | 12582912, 114);
                    j14 = j114;
                    eVar10 = eVar117;
                    eVar11 = eVar118;
                    i26 = i36;
                    n2Var3 = n2Var2;
                    rVar4 = rVar3;
                    j15 = j115;
                    eVar12 = eVar9;
                    eVar13 = eVar116;
                } else {
                    sVar.Y();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i29 != 0) {
                            eVar5 = d2.f30126a;
                        }
                        if (i15 != 0) {
                            eVar6 = d2.f30127b;
                        }
                        dVar2 = d2.f30128c;
                        if (i18 != 0) {
                            eVar7 = d2.f30129d;
                        }
                        if ((i13 & 64) != 0) {
                            j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                            i21 &= -3670017;
                        }
                        jB = v1.b(j13, sVar);
                        i22 = i21 & (-29360129);
                        if ((i13 & 256) != 0) {
                            WeakHashMap weakHashMap8 = j0.o2.f35353v;
                            n2Var2 = j0.b.e(sVar).f35360g;
                            i23 = (-264241153) & i21;
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i24 = 2;
                        } else {
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i23 = i22;
                            i24 = 2;
                            n2Var2 = n2Var;
                        }
                    } else {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i29 != 0) {
                            eVar5 = d2.f30126a;
                        }
                        if (i15 != 0) {
                            eVar6 = d2.f30127b;
                        }
                        dVar2 = d2.f30128c;
                        if (i18 != 0) {
                            eVar7 = d2.f30129d;
                        }
                        if ((i13 & 64) != 0) {
                            j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                            i21 &= -3670017;
                        }
                        jB = v1.b(j13, sVar);
                        i22 = i21 & (-29360129);
                        if ((i13 & 256) != 0) {
                            WeakHashMap weakHashMap9 = j0.o2.f35353v;
                            n2Var2 = j0.b.e(sVar).f35360g;
                            i23 = (-264241153) & i21;
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i24 = 2;
                        } else {
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i23 = i22;
                            i24 = 2;
                            n2Var2 = n2Var;
                        }
                    }
                    sVar.q();
                    i25 = (234881024 & i23) ^ 100663296;
                    boolean z18 = true;
                    if (i25 > 67108864) {
                        eVar9 = eVar8;
                        if ((i23 & 100663296) != 67108864) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        eVar9 = eVar8;
                        if ((i23 & 100663296) != 67108864) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    objQ = sVar.Q();
                    z12 = z11;
                    l1.g gVar6 = l1.m.f39353a;
                    if (z12) {
                        objQ = new i1.r0(n2Var2);
                        sVar.o0(objQ);
                    } else {
                        objQ = new i1.r0(n2Var2);
                        sVar.o0(objQ);
                    }
                    r0Var = (i1.r0) objQ;
                    boolean zF6 = sVar.f(r0Var);
                    int i37 = i24;
                    if (i25 > 67108864) {
                    }
                    z13 = zF6 | z18;
                    objQ2 = sVar.Q();
                    if (z13) {
                        objQ2 = new a0.e(10, r0Var, n2Var2);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new a0.e(10, r0Var, n2Var2);
                        sVar.o0(objQ2);
                    }
                    fz.e eVar119 = eVar7;
                    fz.e eVar1110 = eVar5;
                    fz.e eVar1111 = eVar6;
                    long j116 = j13;
                    long j117 = jB;
                    i9.a(z1.a.a(rVar3, new d1.e1((fz.c) objQ2, 2)), null, j116, j117, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1979205334, new a0.m(i37, eVar1110, dVar, eVar9, eVar119, r0Var, eVar1111), sVar), sVar, ((i23 >> 12) & 896) | 12582912, 114);
                    j14 = j116;
                    eVar10 = eVar1110;
                    eVar11 = eVar1111;
                    i26 = i37;
                    n2Var3 = n2Var2;
                    rVar4 = rVar3;
                    j15 = j117;
                    eVar12 = eVar9;
                    eVar13 = eVar119;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new n7(rVar4, eVar10, eVar11, eVar12, eVar13, i26, j14, j15, n2Var3, dVar, i12, i13);
                }
            }
            i17 = i14 | 27648;
            eVar7 = eVar4;
            i21 = i17 | 196608;
            if ((1572864 & i12) == 0) {
                if ((i13 & 64) == 0) {
                    j13 = j11;
                    if (sVar.e(j13)) {
                    }
                    i21 |= i30;
                } else {
                    j13 = j11;
                }
                i21 |= i30;
            } else {
                j13 = j11;
            }
            if ((i12 & 12582912) == 0) {
                i21 |= 4194304;
            }
            if ((i12 & 100663296) != 0) {
                i21 |= ((i13 & 256) == 0 || !sVar.f(n2Var)) ? 33554432 : 67108864;
            }
            if ((i12 & 805306368) == 0) {
                if (sVar.h(dVar)) {
                    i27 = 536870912;
                } else {
                    i27 = 268435456;
                }
                i21 |= i27;
            }
            if ((i21 & 306783379) == 306783378) {
                sVar.Y();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i29 != 0) {
                        eVar5 = d2.f30126a;
                    }
                    if (i15 != 0) {
                        eVar6 = d2.f30127b;
                    }
                    dVar2 = d2.f30128c;
                    if (i18 != 0) {
                        eVar7 = d2.f30129d;
                    }
                    if ((i13 & 64) != 0) {
                        j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                        i21 &= -3670017;
                    }
                    jB = v1.b(j13, sVar);
                    i22 = i21 & (-29360129);
                    if ((i13 & 256) != 0) {
                        WeakHashMap weakHashMap10 = j0.o2.f35353v;
                        n2Var2 = j0.b.e(sVar).f35360g;
                        i23 = (-264241153) & i21;
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i24 = 2;
                    } else {
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i23 = i22;
                        i24 = 2;
                        n2Var2 = n2Var;
                    }
                } else {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i29 != 0) {
                        eVar5 = d2.f30126a;
                    }
                    if (i15 != 0) {
                        eVar6 = d2.f30127b;
                    }
                    dVar2 = d2.f30128c;
                    if (i18 != 0) {
                        eVar7 = d2.f30129d;
                    }
                    if ((i13 & 64) != 0) {
                        j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                        i21 &= -3670017;
                    }
                    jB = v1.b(j13, sVar);
                    i22 = i21 & (-29360129);
                    if ((i13 & 256) != 0) {
                        WeakHashMap weakHashMap11 = j0.o2.f35353v;
                        n2Var2 = j0.b.e(sVar).f35360g;
                        i23 = (-264241153) & i21;
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i24 = 2;
                    } else {
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i23 = i22;
                        i24 = 2;
                        n2Var2 = n2Var;
                    }
                }
                sVar.q();
                i25 = (234881024 & i23) ^ 100663296;
                boolean z19 = true;
                if (i25 > 67108864) {
                    eVar9 = eVar8;
                    if ((i23 & 100663296) != 67108864) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    eVar9 = eVar8;
                    if ((i23 & 100663296) != 67108864) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                objQ = sVar.Q();
                z12 = z11;
                l1.g gVar7 = l1.m.f39353a;
                if (z12) {
                    objQ = new i1.r0(n2Var2);
                    sVar.o0(objQ);
                } else {
                    objQ = new i1.r0(n2Var2);
                    sVar.o0(objQ);
                }
                r0Var = (i1.r0) objQ;
                boolean zF7 = sVar.f(r0Var);
                int i38 = i24;
                if (i25 > 67108864) {
                }
                z13 = zF7 | z19;
                objQ2 = sVar.Q();
                if (z13) {
                    objQ2 = new a0.e(10, r0Var, n2Var2);
                    sVar.o0(objQ2);
                } else {
                    objQ2 = new a0.e(10, r0Var, n2Var2);
                    sVar.o0(objQ2);
                }
                fz.e eVar1112 = eVar7;
                fz.e eVar1113 = eVar5;
                fz.e eVar1114 = eVar6;
                long j118 = j13;
                long j119 = jB;
                i9.a(z1.a.a(rVar3, new d1.e1((fz.c) objQ2, 2)), null, j118, j119, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1979205334, new a0.m(i38, eVar1113, dVar, eVar9, eVar1112, r0Var, eVar1114), sVar), sVar, ((i23 >> 12) & 896) | 12582912, 114);
                j14 = j118;
                eVar10 = eVar1113;
                eVar11 = eVar1114;
                i26 = i38;
                n2Var3 = n2Var2;
                rVar4 = rVar3;
                j15 = j119;
                eVar12 = eVar9;
                eVar13 = eVar1112;
            } else {
                sVar.Y();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i29 != 0) {
                        eVar5 = d2.f30126a;
                    }
                    if (i15 != 0) {
                        eVar6 = d2.f30127b;
                    }
                    dVar2 = d2.f30128c;
                    if (i18 != 0) {
                        eVar7 = d2.f30129d;
                    }
                    if ((i13 & 64) != 0) {
                        j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                        i21 &= -3670017;
                    }
                    jB = v1.b(j13, sVar);
                    i22 = i21 & (-29360129);
                    if ((i13 & 256) != 0) {
                        WeakHashMap weakHashMap12 = j0.o2.f35353v;
                        n2Var2 = j0.b.e(sVar).f35360g;
                        i23 = (-264241153) & i21;
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i24 = 2;
                    } else {
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i23 = i22;
                        i24 = 2;
                        n2Var2 = n2Var;
                    }
                } else {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i29 != 0) {
                        eVar5 = d2.f30126a;
                    }
                    if (i15 != 0) {
                        eVar6 = d2.f30127b;
                    }
                    dVar2 = d2.f30128c;
                    if (i18 != 0) {
                        eVar7 = d2.f30129d;
                    }
                    if ((i13 & 64) != 0) {
                        j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                        i21 &= -3670017;
                    }
                    jB = v1.b(j13, sVar);
                    i22 = i21 & (-29360129);
                    if ((i13 & 256) != 0) {
                        WeakHashMap weakHashMap13 = j0.o2.f35353v;
                        n2Var2 = j0.b.e(sVar).f35360g;
                        i23 = (-264241153) & i21;
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i24 = 2;
                    } else {
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i23 = i22;
                        i24 = 2;
                        n2Var2 = n2Var;
                    }
                }
                sVar.q();
                i25 = (234881024 & i23) ^ 100663296;
                boolean z110 = true;
                if (i25 > 67108864) {
                    eVar9 = eVar8;
                    if ((i23 & 100663296) != 67108864) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    eVar9 = eVar8;
                    if ((i23 & 100663296) != 67108864) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                objQ = sVar.Q();
                z12 = z11;
                l1.g gVar8 = l1.m.f39353a;
                if (z12) {
                    objQ = new i1.r0(n2Var2);
                    sVar.o0(objQ);
                } else {
                    objQ = new i1.r0(n2Var2);
                    sVar.o0(objQ);
                }
                r0Var = (i1.r0) objQ;
                boolean zF8 = sVar.f(r0Var);
                int i39 = i24;
                if (i25 > 67108864) {
                }
                z13 = zF8 | z110;
                objQ2 = sVar.Q();
                if (z13) {
                    objQ2 = new a0.e(10, r0Var, n2Var2);
                    sVar.o0(objQ2);
                } else {
                    objQ2 = new a0.e(10, r0Var, n2Var2);
                    sVar.o0(objQ2);
                }
                fz.e eVar1115 = eVar7;
                fz.e eVar1116 = eVar5;
                fz.e eVar1117 = eVar6;
                long j1110 = j13;
                long j1111 = jB;
                i9.a(z1.a.a(rVar3, new d1.e1((fz.c) objQ2, 2)), null, j1110, j1111, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1979205334, new a0.m(i39, eVar1116, dVar, eVar9, eVar1115, r0Var, eVar1117), sVar), sVar, ((i23 >> 12) & 896) | 12582912, 114);
                j14 = j1110;
                eVar10 = eVar1116;
                eVar11 = eVar1117;
                i26 = i39;
                n2Var3 = n2Var2;
                rVar4 = rVar3;
                j15 = j1111;
                eVar12 = eVar9;
                eVar13 = eVar1115;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new n7(rVar4, eVar10, eVar11, eVar12, eVar13, i26, j14, j15, n2Var3, dVar, i12, i13);
            }
        }
        i14 |= 48;
        eVar5 = eVar;
        i15 = i13 & 4;
        if (i15 != 0) {
            if ((i12 & 384) == 0) {
                eVar6 = eVar2;
                if (sVar.h(eVar6)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i14 |= i16;
            }
            i17 = i14 | 3072;
            i18 = i13 & 16;
            if (i18 != 0) {
                if ((i12 & 24576) == 0) {
                    eVar7 = eVar4;
                    if (sVar.h(eVar7)) {
                        i19 = 16384;
                    } else {
                        i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i17 |= i19;
                }
                i21 = i17 | 196608;
                if ((1572864 & i12) == 0) {
                    if ((i13 & 64) == 0) {
                        j13 = j11;
                        if (sVar.e(j13)) {
                        }
                        i21 |= i30;
                    } else {
                        j13 = j11;
                    }
                    i21 |= i30;
                } else {
                    j13 = j11;
                }
                if ((i12 & 12582912) == 0) {
                    i21 |= 4194304;
                }
                if ((i12 & 100663296) != 0) {
                    i21 |= ((i13 & 256) == 0 || !sVar.f(n2Var)) ? 33554432 : 67108864;
                }
                if ((i12 & 805306368) == 0) {
                    if (sVar.h(dVar)) {
                        i27 = 536870912;
                    } else {
                        i27 = 268435456;
                    }
                    i21 |= i27;
                }
                if ((i21 & 306783379) == 306783378) {
                    sVar.Y();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i29 != 0) {
                            eVar5 = d2.f30126a;
                        }
                        if (i15 != 0) {
                            eVar6 = d2.f30127b;
                        }
                        dVar2 = d2.f30128c;
                        if (i18 != 0) {
                            eVar7 = d2.f30129d;
                        }
                        if ((i13 & 64) != 0) {
                            j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                            i21 &= -3670017;
                        }
                        jB = v1.b(j13, sVar);
                        i22 = i21 & (-29360129);
                        if ((i13 & 256) != 0) {
                            WeakHashMap weakHashMap14 = j0.o2.f35353v;
                            n2Var2 = j0.b.e(sVar).f35360g;
                            i23 = (-264241153) & i21;
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i24 = 2;
                        } else {
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i23 = i22;
                            i24 = 2;
                            n2Var2 = n2Var;
                        }
                    } else {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i29 != 0) {
                            eVar5 = d2.f30126a;
                        }
                        if (i15 != 0) {
                            eVar6 = d2.f30127b;
                        }
                        dVar2 = d2.f30128c;
                        if (i18 != 0) {
                            eVar7 = d2.f30129d;
                        }
                        if ((i13 & 64) != 0) {
                            j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                            i21 &= -3670017;
                        }
                        jB = v1.b(j13, sVar);
                        i22 = i21 & (-29360129);
                        if ((i13 & 256) != 0) {
                            WeakHashMap weakHashMap15 = j0.o2.f35353v;
                            n2Var2 = j0.b.e(sVar).f35360g;
                            i23 = (-264241153) & i21;
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i24 = 2;
                        } else {
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i23 = i22;
                            i24 = 2;
                            n2Var2 = n2Var;
                        }
                    }
                    sVar.q();
                    i25 = (234881024 & i23) ^ 100663296;
                    boolean z111 = true;
                    if (i25 > 67108864) {
                        eVar9 = eVar8;
                        if ((i23 & 100663296) != 67108864) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        eVar9 = eVar8;
                        if ((i23 & 100663296) != 67108864) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    objQ = sVar.Q();
                    z12 = z11;
                    l1.g gVar9 = l1.m.f39353a;
                    if (z12) {
                        objQ = new i1.r0(n2Var2);
                        sVar.o0(objQ);
                    } else {
                        objQ = new i1.r0(n2Var2);
                        sVar.o0(objQ);
                    }
                    r0Var = (i1.r0) objQ;
                    boolean zF9 = sVar.f(r0Var);
                    int i310 = i24;
                    if (i25 > 67108864) {
                    }
                    z13 = zF9 | z111;
                    objQ2 = sVar.Q();
                    if (z13) {
                        objQ2 = new a0.e(10, r0Var, n2Var2);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new a0.e(10, r0Var, n2Var2);
                        sVar.o0(objQ2);
                    }
                    fz.e eVar1118 = eVar7;
                    fz.e eVar1119 = eVar5;
                    fz.e eVar11110 = eVar6;
                    long j1112 = j13;
                    long j1113 = jB;
                    i9.a(z1.a.a(rVar3, new d1.e1((fz.c) objQ2, 2)), null, j1112, j1113, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1979205334, new a0.m(i310, eVar1119, dVar, eVar9, eVar1118, r0Var, eVar11110), sVar), sVar, ((i23 >> 12) & 896) | 12582912, 114);
                    j14 = j1112;
                    eVar10 = eVar1119;
                    eVar11 = eVar11110;
                    i26 = i310;
                    n2Var3 = n2Var2;
                    rVar4 = rVar3;
                    j15 = j1113;
                    eVar12 = eVar9;
                    eVar13 = eVar1118;
                } else {
                    sVar.Y();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i29 != 0) {
                            eVar5 = d2.f30126a;
                        }
                        if (i15 != 0) {
                            eVar6 = d2.f30127b;
                        }
                        dVar2 = d2.f30128c;
                        if (i18 != 0) {
                            eVar7 = d2.f30129d;
                        }
                        if ((i13 & 64) != 0) {
                            j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                            i21 &= -3670017;
                        }
                        jB = v1.b(j13, sVar);
                        i22 = i21 & (-29360129);
                        if ((i13 & 256) != 0) {
                            WeakHashMap weakHashMap16 = j0.o2.f35353v;
                            n2Var2 = j0.b.e(sVar).f35360g;
                            i23 = (-264241153) & i21;
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i24 = 2;
                        } else {
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i23 = i22;
                            i24 = 2;
                            n2Var2 = n2Var;
                        }
                    } else {
                        if (i28 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i29 != 0) {
                            eVar5 = d2.f30126a;
                        }
                        if (i15 != 0) {
                            eVar6 = d2.f30127b;
                        }
                        dVar2 = d2.f30128c;
                        if (i18 != 0) {
                            eVar7 = d2.f30129d;
                        }
                        if ((i13 & 64) != 0) {
                            j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                            i21 &= -3670017;
                        }
                        jB = v1.b(j13, sVar);
                        i22 = i21 & (-29360129);
                        if ((i13 & 256) != 0) {
                            WeakHashMap weakHashMap17 = j0.o2.f35353v;
                            n2Var2 = j0.b.e(sVar).f35360g;
                            i23 = (-264241153) & i21;
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i24 = 2;
                        } else {
                            eVar8 = dVar2;
                            rVar3 = rVar2;
                            i23 = i22;
                            i24 = 2;
                            n2Var2 = n2Var;
                        }
                    }
                    sVar.q();
                    i25 = (234881024 & i23) ^ 100663296;
                    boolean z112 = true;
                    if (i25 > 67108864) {
                        eVar9 = eVar8;
                        if ((i23 & 100663296) != 67108864) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        eVar9 = eVar8;
                        if ((i23 & 100663296) != 67108864) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    objQ = sVar.Q();
                    z12 = z11;
                    l1.g gVar10 = l1.m.f39353a;
                    if (z12) {
                        objQ = new i1.r0(n2Var2);
                        sVar.o0(objQ);
                    } else {
                        objQ = new i1.r0(n2Var2);
                        sVar.o0(objQ);
                    }
                    r0Var = (i1.r0) objQ;
                    boolean zF10 = sVar.f(r0Var);
                    int i311 = i24;
                    if (i25 > 67108864) {
                    }
                    z13 = zF10 | z112;
                    objQ2 = sVar.Q();
                    if (z13) {
                        objQ2 = new a0.e(10, r0Var, n2Var2);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new a0.e(10, r0Var, n2Var2);
                        sVar.o0(objQ2);
                    }
                    fz.e eVar11111 = eVar7;
                    fz.e eVar11112 = eVar5;
                    fz.e eVar11113 = eVar6;
                    long j1114 = j13;
                    long j1115 = jB;
                    i9.a(z1.a.a(rVar3, new d1.e1((fz.c) objQ2, 2)), null, j1114, j1115, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1979205334, new a0.m(i311, eVar11112, dVar, eVar9, eVar11111, r0Var, eVar11113), sVar), sVar, ((i23 >> 12) & 896) | 12582912, 114);
                    j14 = j1114;
                    eVar10 = eVar11112;
                    eVar11 = eVar11113;
                    i26 = i311;
                    n2Var3 = n2Var2;
                    rVar4 = rVar3;
                    j15 = j1115;
                    eVar12 = eVar9;
                    eVar13 = eVar11111;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new n7(rVar4, eVar10, eVar11, eVar12, eVar13, i26, j14, j15, n2Var3, dVar, i12, i13);
                }
            }
            i17 = i14 | 27648;
            eVar7 = eVar4;
            i21 = i17 | 196608;
            if ((1572864 & i12) == 0) {
                if ((i13 & 64) == 0) {
                    j13 = j11;
                    if (sVar.e(j13)) {
                    }
                    i21 |= i30;
                } else {
                    j13 = j11;
                }
                i21 |= i30;
            } else {
                j13 = j11;
            }
            if ((i12 & 12582912) == 0) {
                i21 |= 4194304;
            }
            if ((i12 & 100663296) != 0) {
                i21 |= ((i13 & 256) == 0 || !sVar.f(n2Var)) ? 33554432 : 67108864;
            }
            if ((i12 & 805306368) == 0) {
                if (sVar.h(dVar)) {
                    i27 = 536870912;
                } else {
                    i27 = 268435456;
                }
                i21 |= i27;
            }
            if ((i21 & 306783379) == 306783378) {
                sVar.Y();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i29 != 0) {
                        eVar5 = d2.f30126a;
                    }
                    if (i15 != 0) {
                        eVar6 = d2.f30127b;
                    }
                    dVar2 = d2.f30128c;
                    if (i18 != 0) {
                        eVar7 = d2.f30129d;
                    }
                    if ((i13 & 64) != 0) {
                        j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                        i21 &= -3670017;
                    }
                    jB = v1.b(j13, sVar);
                    i22 = i21 & (-29360129);
                    if ((i13 & 256) != 0) {
                        WeakHashMap weakHashMap18 = j0.o2.f35353v;
                        n2Var2 = j0.b.e(sVar).f35360g;
                        i23 = (-264241153) & i21;
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i24 = 2;
                    } else {
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i23 = i22;
                        i24 = 2;
                        n2Var2 = n2Var;
                    }
                } else {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i29 != 0) {
                        eVar5 = d2.f30126a;
                    }
                    if (i15 != 0) {
                        eVar6 = d2.f30127b;
                    }
                    dVar2 = d2.f30128c;
                    if (i18 != 0) {
                        eVar7 = d2.f30129d;
                    }
                    if ((i13 & 64) != 0) {
                        j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                        i21 &= -3670017;
                    }
                    jB = v1.b(j13, sVar);
                    i22 = i21 & (-29360129);
                    if ((i13 & 256) != 0) {
                        WeakHashMap weakHashMap19 = j0.o2.f35353v;
                        n2Var2 = j0.b.e(sVar).f35360g;
                        i23 = (-264241153) & i21;
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i24 = 2;
                    } else {
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i23 = i22;
                        i24 = 2;
                        n2Var2 = n2Var;
                    }
                }
                sVar.q();
                i25 = (234881024 & i23) ^ 100663296;
                boolean z113 = true;
                if (i25 > 67108864) {
                    eVar9 = eVar8;
                    if ((i23 & 100663296) != 67108864) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    eVar9 = eVar8;
                    if ((i23 & 100663296) != 67108864) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                objQ = sVar.Q();
                z12 = z11;
                l1.g gVar11 = l1.m.f39353a;
                if (z12) {
                    objQ = new i1.r0(n2Var2);
                    sVar.o0(objQ);
                } else {
                    objQ = new i1.r0(n2Var2);
                    sVar.o0(objQ);
                }
                r0Var = (i1.r0) objQ;
                boolean zF11 = sVar.f(r0Var);
                int i312 = i24;
                if (i25 > 67108864) {
                }
                z13 = zF11 | z113;
                objQ2 = sVar.Q();
                if (z13) {
                    objQ2 = new a0.e(10, r0Var, n2Var2);
                    sVar.o0(objQ2);
                } else {
                    objQ2 = new a0.e(10, r0Var, n2Var2);
                    sVar.o0(objQ2);
                }
                fz.e eVar11114 = eVar7;
                fz.e eVar11115 = eVar5;
                fz.e eVar11116 = eVar6;
                long j1116 = j13;
                long j1117 = jB;
                i9.a(z1.a.a(rVar3, new d1.e1((fz.c) objQ2, 2)), null, j1116, j1117, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1979205334, new a0.m(i312, eVar11115, dVar, eVar9, eVar11114, r0Var, eVar11116), sVar), sVar, ((i23 >> 12) & 896) | 12582912, 114);
                j14 = j1116;
                eVar10 = eVar11115;
                eVar11 = eVar11116;
                i26 = i312;
                n2Var3 = n2Var2;
                rVar4 = rVar3;
                j15 = j1117;
                eVar12 = eVar9;
                eVar13 = eVar11114;
            } else {
                sVar.Y();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i29 != 0) {
                        eVar5 = d2.f30126a;
                    }
                    if (i15 != 0) {
                        eVar6 = d2.f30127b;
                    }
                    dVar2 = d2.f30128c;
                    if (i18 != 0) {
                        eVar7 = d2.f30129d;
                    }
                    if ((i13 & 64) != 0) {
                        j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                        i21 &= -3670017;
                    }
                    jB = v1.b(j13, sVar);
                    i22 = i21 & (-29360129);
                    if ((i13 & 256) != 0) {
                        WeakHashMap weakHashMap110 = j0.o2.f35353v;
                        n2Var2 = j0.b.e(sVar).f35360g;
                        i23 = (-264241153) & i21;
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i24 = 2;
                    } else {
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i23 = i22;
                        i24 = 2;
                        n2Var2 = n2Var;
                    }
                } else {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i29 != 0) {
                        eVar5 = d2.f30126a;
                    }
                    if (i15 != 0) {
                        eVar6 = d2.f30127b;
                    }
                    dVar2 = d2.f30128c;
                    if (i18 != 0) {
                        eVar7 = d2.f30129d;
                    }
                    if ((i13 & 64) != 0) {
                        j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                        i21 &= -3670017;
                    }
                    jB = v1.b(j13, sVar);
                    i22 = i21 & (-29360129);
                    if ((i13 & 256) != 0) {
                        WeakHashMap weakHashMap111 = j0.o2.f35353v;
                        n2Var2 = j0.b.e(sVar).f35360g;
                        i23 = (-264241153) & i21;
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i24 = 2;
                    } else {
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i23 = i22;
                        i24 = 2;
                        n2Var2 = n2Var;
                    }
                }
                sVar.q();
                i25 = (234881024 & i23) ^ 100663296;
                boolean z114 = true;
                if (i25 > 67108864) {
                    eVar9 = eVar8;
                    if ((i23 & 100663296) != 67108864) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    eVar9 = eVar8;
                    if ((i23 & 100663296) != 67108864) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                objQ = sVar.Q();
                z12 = z11;
                l1.g gVar12 = l1.m.f39353a;
                if (z12) {
                    objQ = new i1.r0(n2Var2);
                    sVar.o0(objQ);
                } else {
                    objQ = new i1.r0(n2Var2);
                    sVar.o0(objQ);
                }
                r0Var = (i1.r0) objQ;
                boolean zF12 = sVar.f(r0Var);
                int i313 = i24;
                if (i25 > 67108864) {
                }
                z13 = zF12 | z114;
                objQ2 = sVar.Q();
                if (z13) {
                    objQ2 = new a0.e(10, r0Var, n2Var2);
                    sVar.o0(objQ2);
                } else {
                    objQ2 = new a0.e(10, r0Var, n2Var2);
                    sVar.o0(objQ2);
                }
                fz.e eVar11117 = eVar7;
                fz.e eVar11118 = eVar5;
                fz.e eVar11119 = eVar6;
                long j1118 = j13;
                long j1119 = jB;
                i9.a(z1.a.a(rVar3, new d1.e1((fz.c) objQ2, 2)), null, j1118, j1119, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1979205334, new a0.m(i313, eVar11118, dVar, eVar9, eVar11117, r0Var, eVar11119), sVar), sVar, ((i23 >> 12) & 896) | 12582912, 114);
                j14 = j1118;
                eVar10 = eVar11118;
                eVar11 = eVar11119;
                i26 = i313;
                n2Var3 = n2Var2;
                rVar4 = rVar3;
                j15 = j1119;
                eVar12 = eVar9;
                eVar13 = eVar11117;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new n7(rVar4, eVar10, eVar11, eVar12, eVar13, i26, j14, j15, n2Var3, dVar, i12, i13);
            }
        }
        i14 |= 384;
        eVar6 = eVar2;
        i17 = i14 | 3072;
        i18 = i13 & 16;
        if (i18 != 0) {
            if ((i12 & 24576) == 0) {
                eVar7 = eVar4;
                if (sVar.h(eVar7)) {
                    i19 = 16384;
                } else {
                    i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i17 |= i19;
            }
            i21 = i17 | 196608;
            if ((1572864 & i12) == 0) {
                if ((i13 & 64) == 0) {
                    j13 = j11;
                    if (sVar.e(j13)) {
                    }
                    i21 |= i30;
                } else {
                    j13 = j11;
                }
                i21 |= i30;
            } else {
                j13 = j11;
            }
            if ((i12 & 12582912) == 0) {
                i21 |= 4194304;
            }
            if ((i12 & 100663296) != 0) {
                i21 |= ((i13 & 256) == 0 || !sVar.f(n2Var)) ? 33554432 : 67108864;
            }
            if ((i12 & 805306368) == 0) {
                if (sVar.h(dVar)) {
                    i27 = 536870912;
                } else {
                    i27 = 268435456;
                }
                i21 |= i27;
            }
            if ((i21 & 306783379) == 306783378) {
                sVar.Y();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i29 != 0) {
                        eVar5 = d2.f30126a;
                    }
                    if (i15 != 0) {
                        eVar6 = d2.f30127b;
                    }
                    dVar2 = d2.f30128c;
                    if (i18 != 0) {
                        eVar7 = d2.f30129d;
                    }
                    if ((i13 & 64) != 0) {
                        j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                        i21 &= -3670017;
                    }
                    jB = v1.b(j13, sVar);
                    i22 = i21 & (-29360129);
                    if ((i13 & 256) != 0) {
                        WeakHashMap weakHashMap112 = j0.o2.f35353v;
                        n2Var2 = j0.b.e(sVar).f35360g;
                        i23 = (-264241153) & i21;
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i24 = 2;
                    } else {
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i23 = i22;
                        i24 = 2;
                        n2Var2 = n2Var;
                    }
                } else {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i29 != 0) {
                        eVar5 = d2.f30126a;
                    }
                    if (i15 != 0) {
                        eVar6 = d2.f30127b;
                    }
                    dVar2 = d2.f30128c;
                    if (i18 != 0) {
                        eVar7 = d2.f30129d;
                    }
                    if ((i13 & 64) != 0) {
                        j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                        i21 &= -3670017;
                    }
                    jB = v1.b(j13, sVar);
                    i22 = i21 & (-29360129);
                    if ((i13 & 256) != 0) {
                        WeakHashMap weakHashMap113 = j0.o2.f35353v;
                        n2Var2 = j0.b.e(sVar).f35360g;
                        i23 = (-264241153) & i21;
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i24 = 2;
                    } else {
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i23 = i22;
                        i24 = 2;
                        n2Var2 = n2Var;
                    }
                }
                sVar.q();
                i25 = (234881024 & i23) ^ 100663296;
                boolean z115 = true;
                if (i25 > 67108864) {
                    eVar9 = eVar8;
                    if ((i23 & 100663296) != 67108864) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    eVar9 = eVar8;
                    if ((i23 & 100663296) != 67108864) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                objQ = sVar.Q();
                z12 = z11;
                l1.g gVar13 = l1.m.f39353a;
                if (z12) {
                    objQ = new i1.r0(n2Var2);
                    sVar.o0(objQ);
                } else {
                    objQ = new i1.r0(n2Var2);
                    sVar.o0(objQ);
                }
                r0Var = (i1.r0) objQ;
                boolean zF13 = sVar.f(r0Var);
                int i314 = i24;
                if (i25 > 67108864) {
                }
                z13 = zF13 | z115;
                objQ2 = sVar.Q();
                if (z13) {
                    objQ2 = new a0.e(10, r0Var, n2Var2);
                    sVar.o0(objQ2);
                } else {
                    objQ2 = new a0.e(10, r0Var, n2Var2);
                    sVar.o0(objQ2);
                }
                fz.e eVar111110 = eVar7;
                fz.e eVar111111 = eVar5;
                fz.e eVar111112 = eVar6;
                long j11110 = j13;
                long j11111 = jB;
                i9.a(z1.a.a(rVar3, new d1.e1((fz.c) objQ2, 2)), null, j11110, j11111, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1979205334, new a0.m(i314, eVar111111, dVar, eVar9, eVar111110, r0Var, eVar111112), sVar), sVar, ((i23 >> 12) & 896) | 12582912, 114);
                j14 = j11110;
                eVar10 = eVar111111;
                eVar11 = eVar111112;
                i26 = i314;
                n2Var3 = n2Var2;
                rVar4 = rVar3;
                j15 = j11111;
                eVar12 = eVar9;
                eVar13 = eVar111110;
            } else {
                sVar.Y();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i29 != 0) {
                        eVar5 = d2.f30126a;
                    }
                    if (i15 != 0) {
                        eVar6 = d2.f30127b;
                    }
                    dVar2 = d2.f30128c;
                    if (i18 != 0) {
                        eVar7 = d2.f30129d;
                    }
                    if ((i13 & 64) != 0) {
                        j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                        i21 &= -3670017;
                    }
                    jB = v1.b(j13, sVar);
                    i22 = i21 & (-29360129);
                    if ((i13 & 256) != 0) {
                        WeakHashMap weakHashMap114 = j0.o2.f35353v;
                        n2Var2 = j0.b.e(sVar).f35360g;
                        i23 = (-264241153) & i21;
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i24 = 2;
                    } else {
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i23 = i22;
                        i24 = 2;
                        n2Var2 = n2Var;
                    }
                } else {
                    if (i28 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i29 != 0) {
                        eVar5 = d2.f30126a;
                    }
                    if (i15 != 0) {
                        eVar6 = d2.f30127b;
                    }
                    dVar2 = d2.f30128c;
                    if (i18 != 0) {
                        eVar7 = d2.f30129d;
                    }
                    if ((i13 & 64) != 0) {
                        j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                        i21 &= -3670017;
                    }
                    jB = v1.b(j13, sVar);
                    i22 = i21 & (-29360129);
                    if ((i13 & 256) != 0) {
                        WeakHashMap weakHashMap115 = j0.o2.f35353v;
                        n2Var2 = j0.b.e(sVar).f35360g;
                        i23 = (-264241153) & i21;
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i24 = 2;
                    } else {
                        eVar8 = dVar2;
                        rVar3 = rVar2;
                        i23 = i22;
                        i24 = 2;
                        n2Var2 = n2Var;
                    }
                }
                sVar.q();
                i25 = (234881024 & i23) ^ 100663296;
                boolean z116 = true;
                if (i25 > 67108864) {
                    eVar9 = eVar8;
                    if ((i23 & 100663296) != 67108864) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    eVar9 = eVar8;
                    if ((i23 & 100663296) != 67108864) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                objQ = sVar.Q();
                z12 = z11;
                l1.g gVar14 = l1.m.f39353a;
                if (z12) {
                    objQ = new i1.r0(n2Var2);
                    sVar.o0(objQ);
                } else {
                    objQ = new i1.r0(n2Var2);
                    sVar.o0(objQ);
                }
                r0Var = (i1.r0) objQ;
                boolean zF14 = sVar.f(r0Var);
                int i315 = i24;
                if (i25 > 67108864) {
                }
                z13 = zF14 | z116;
                objQ2 = sVar.Q();
                if (z13) {
                    objQ2 = new a0.e(10, r0Var, n2Var2);
                    sVar.o0(objQ2);
                } else {
                    objQ2 = new a0.e(10, r0Var, n2Var2);
                    sVar.o0(objQ2);
                }
                fz.e eVar111113 = eVar7;
                fz.e eVar111114 = eVar5;
                fz.e eVar111115 = eVar6;
                long j11112 = j13;
                long j11113 = jB;
                i9.a(z1.a.a(rVar3, new d1.e1((fz.c) objQ2, 2)), null, j11112, j11113, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1979205334, new a0.m(i315, eVar111114, dVar, eVar9, eVar111113, r0Var, eVar111115), sVar), sVar, ((i23 >> 12) & 896) | 12582912, 114);
                j14 = j11112;
                eVar10 = eVar111114;
                eVar11 = eVar111115;
                i26 = i315;
                n2Var3 = n2Var2;
                rVar4 = rVar3;
                j15 = j11113;
                eVar12 = eVar9;
                eVar13 = eVar111113;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new n7(rVar4, eVar10, eVar11, eVar12, eVar13, i26, j14, j15, n2Var3, dVar, i12, i13);
            }
        }
        i17 = i14 | 27648;
        eVar7 = eVar4;
        i21 = i17 | 196608;
        if ((1572864 & i12) == 0) {
            if ((i13 & 64) == 0) {
                j13 = j11;
                if (sVar.e(j13)) {
                }
                i21 |= i30;
            } else {
                j13 = j11;
            }
            i21 |= i30;
        } else {
            j13 = j11;
        }
        if ((i12 & 12582912) == 0) {
            i21 |= 4194304;
        }
        if ((i12 & 100663296) != 0) {
            i21 |= ((i13 & 256) == 0 || !sVar.f(n2Var)) ? 33554432 : 67108864;
        }
        if ((i12 & 805306368) == 0) {
            if (sVar.h(dVar)) {
                i27 = 536870912;
            } else {
                i27 = 268435456;
            }
            i21 |= i27;
        }
        if ((i21 & 306783379) == 306783378) {
            sVar.Y();
            if ((i12 & 1) != 0) {
                if (i28 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if (i29 != 0) {
                    eVar5 = d2.f30126a;
                }
                if (i15 != 0) {
                    eVar6 = d2.f30127b;
                }
                dVar2 = d2.f30128c;
                if (i18 != 0) {
                    eVar7 = d2.f30129d;
                }
                if ((i13 & 64) != 0) {
                    j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                    i21 &= -3670017;
                }
                jB = v1.b(j13, sVar);
                i22 = i21 & (-29360129);
                if ((i13 & 256) != 0) {
                    WeakHashMap weakHashMap116 = j0.o2.f35353v;
                    n2Var2 = j0.b.e(sVar).f35360g;
                    i23 = (-264241153) & i21;
                    eVar8 = dVar2;
                    rVar3 = rVar2;
                    i24 = 2;
                } else {
                    eVar8 = dVar2;
                    rVar3 = rVar2;
                    i23 = i22;
                    i24 = 2;
                    n2Var2 = n2Var;
                }
            } else {
                if (i28 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if (i29 != 0) {
                    eVar5 = d2.f30126a;
                }
                if (i15 != 0) {
                    eVar6 = d2.f30127b;
                }
                dVar2 = d2.f30128c;
                if (i18 != 0) {
                    eVar7 = d2.f30129d;
                }
                if ((i13 & 64) != 0) {
                    j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                    i21 &= -3670017;
                }
                jB = v1.b(j13, sVar);
                i22 = i21 & (-29360129);
                if ((i13 & 256) != 0) {
                    WeakHashMap weakHashMap117 = j0.o2.f35353v;
                    n2Var2 = j0.b.e(sVar).f35360g;
                    i23 = (-264241153) & i21;
                    eVar8 = dVar2;
                    rVar3 = rVar2;
                    i24 = 2;
                } else {
                    eVar8 = dVar2;
                    rVar3 = rVar2;
                    i23 = i22;
                    i24 = 2;
                    n2Var2 = n2Var;
                }
            }
            sVar.q();
            i25 = (234881024 & i23) ^ 100663296;
            boolean z117 = true;
            if (i25 > 67108864) {
                eVar9 = eVar8;
                if ((i23 & 100663296) != 67108864) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                eVar9 = eVar8;
                if ((i23 & 100663296) != 67108864) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            objQ = sVar.Q();
            z12 = z11;
            l1.g gVar15 = l1.m.f39353a;
            if (z12) {
                objQ = new i1.r0(n2Var2);
                sVar.o0(objQ);
            } else {
                objQ = new i1.r0(n2Var2);
                sVar.o0(objQ);
            }
            r0Var = (i1.r0) objQ;
            boolean zF15 = sVar.f(r0Var);
            int i316 = i24;
            if (i25 > 67108864) {
            }
            z13 = zF15 | z117;
            objQ2 = sVar.Q();
            if (z13) {
                objQ2 = new a0.e(10, r0Var, n2Var2);
                sVar.o0(objQ2);
            } else {
                objQ2 = new a0.e(10, r0Var, n2Var2);
                sVar.o0(objQ2);
            }
            fz.e eVar111116 = eVar7;
            fz.e eVar111117 = eVar5;
            fz.e eVar111118 = eVar6;
            long j11114 = j13;
            long j11115 = jB;
            i9.a(z1.a.a(rVar3, new d1.e1((fz.c) objQ2, 2)), null, j11114, j11115, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1979205334, new a0.m(i316, eVar111117, dVar, eVar9, eVar111116, r0Var, eVar111118), sVar), sVar, ((i23 >> 12) & 896) | 12582912, 114);
            j14 = j11114;
            eVar10 = eVar111117;
            eVar11 = eVar111118;
            i26 = i316;
            n2Var3 = n2Var2;
            rVar4 = rVar3;
            j15 = j11115;
            eVar12 = eVar9;
            eVar13 = eVar111116;
        } else {
            sVar.Y();
            if ((i12 & 1) != 0) {
                if (i28 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if (i29 != 0) {
                    eVar5 = d2.f30126a;
                }
                if (i15 != 0) {
                    eVar6 = d2.f30127b;
                }
                dVar2 = d2.f30128c;
                if (i18 != 0) {
                    eVar7 = d2.f30129d;
                }
                if ((i13 & 64) != 0) {
                    j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                    i21 &= -3670017;
                }
                jB = v1.b(j13, sVar);
                i22 = i21 & (-29360129);
                if ((i13 & 256) != 0) {
                    WeakHashMap weakHashMap118 = j0.o2.f35353v;
                    n2Var2 = j0.b.e(sVar).f35360g;
                    i23 = (-264241153) & i21;
                    eVar8 = dVar2;
                    rVar3 = rVar2;
                    i24 = 2;
                } else {
                    eVar8 = dVar2;
                    rVar3 = rVar2;
                    i23 = i22;
                    i24 = 2;
                    n2Var2 = n2Var;
                }
            } else {
                if (i28 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if (i29 != 0) {
                    eVar5 = d2.f30126a;
                }
                if (i15 != 0) {
                    eVar6 = d2.f30127b;
                }
                dVar2 = d2.f30128c;
                if (i18 != 0) {
                    eVar7 = d2.f30129d;
                }
                if ((i13 & 64) != 0) {
                    j13 = ((s1) sVar.j(v1.f31180a)).f31031n;
                    i21 &= -3670017;
                }
                jB = v1.b(j13, sVar);
                i22 = i21 & (-29360129);
                if ((i13 & 256) != 0) {
                    WeakHashMap weakHashMap119 = j0.o2.f35353v;
                    n2Var2 = j0.b.e(sVar).f35360g;
                    i23 = (-264241153) & i21;
                    eVar8 = dVar2;
                    rVar3 = rVar2;
                    i24 = 2;
                } else {
                    eVar8 = dVar2;
                    rVar3 = rVar2;
                    i23 = i22;
                    i24 = 2;
                    n2Var2 = n2Var;
                }
            }
            sVar.q();
            i25 = (234881024 & i23) ^ 100663296;
            boolean z118 = true;
            if (i25 > 67108864) {
                eVar9 = eVar8;
                if ((i23 & 100663296) != 67108864) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                eVar9 = eVar8;
                if ((i23 & 100663296) != 67108864) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            objQ = sVar.Q();
            z12 = z11;
            l1.g gVar16 = l1.m.f39353a;
            if (z12) {
                objQ = new i1.r0(n2Var2);
                sVar.o0(objQ);
            } else {
                objQ = new i1.r0(n2Var2);
                sVar.o0(objQ);
            }
            r0Var = (i1.r0) objQ;
            boolean zF16 = sVar.f(r0Var);
            int i317 = i24;
            if (i25 > 67108864) {
            }
            z13 = zF16 | z118;
            objQ2 = sVar.Q();
            if (z13) {
                objQ2 = new a0.e(10, r0Var, n2Var2);
                sVar.o0(objQ2);
            } else {
                objQ2 = new a0.e(10, r0Var, n2Var2);
                sVar.o0(objQ2);
            }
            fz.e eVar111119 = eVar7;
            fz.e eVar1111110 = eVar5;
            fz.e eVar1111111 = eVar6;
            long j11116 = j13;
            long j11117 = jB;
            i9.a(z1.a.a(rVar3, new d1.e1((fz.c) objQ2, 2)), null, j11116, j11117, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1979205334, new a0.m(i317, eVar1111110, dVar, eVar9, eVar111119, r0Var, eVar1111111), sVar), sVar, ((i23 >> 12) & 896) | 12582912, 114);
            j14 = j11116;
            eVar10 = eVar1111110;
            eVar11 = eVar1111111;
            i26 = i317;
            n2Var3 = n2Var2;
            rVar4 = rVar3;
            j15 = j11117;
            eVar12 = eVar9;
            eVar13 = eVar111119;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n7(rVar4, eVar10, eVar11, eVar12, eVar13, i26, j14, j15, n2Var3, dVar, i12, i13);
        }
    }

    public static final void b(int i11, fz.e eVar, t1.d dVar, fz.e eVar2, fz.e eVar3, j0.n2 n2Var, fz.e eVar4, l1.n nVar, int i12) {
        int i13;
        t1.d dVar2;
        j0.n2 n2Var2;
        fz.e eVar5;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-975511942);
        if ((i12 & 6) == 0) {
            i13 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.h(eVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            dVar2 = dVar;
            i13 |= sVar.h(dVar2) ? 256 : 128;
        } else {
            dVar2 = dVar;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.h(eVar2) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= sVar.h(eVar3) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i12) == 0) {
            n2Var2 = n2Var;
            i13 |= sVar.f(n2Var2) ? 131072 : 65536;
        } else {
            n2Var2 = n2Var;
        }
        if ((1572864 & i12) == 0) {
            eVar5 = eVar4;
            i13 |= sVar.h(eVar5) ? 1048576 : 524288;
        } else {
            eVar5 = eVar4;
        }
        if ((i13 & 599187) == 599186 && sVar.F()) {
            sVar.W();
        } else {
            boolean z11 = ((i13 & 896) == 256) | ((i13 & 112) == 32) | ((i13 & 7168) == 2048) | ((458752 & i13) == 131072) | ((57344 & i13) == 16384) | ((i13 & 14) == 4) | ((3670016 & i13) == 1048576);
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                a0.m mVar = new a0.m(eVar, eVar2, eVar3, i11, n2Var2, eVar5, dVar2, 4);
                sVar.o0(mVar);
                objQ = mVar;
            }
            w2.a0.b(null, (fz.e) objQ, sVar, 0, 1);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v0(i11, eVar, dVar, eVar2, eVar3, n2Var, eVar4, i12);
        }
    }
}
