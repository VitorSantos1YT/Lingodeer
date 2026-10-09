package a0;

import b0.g2;
import b0.h2;
import b0.j2;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    public static final void a(b0.c2 c2Var, fz.c cVar, z1.r rVar, l1 l1Var, m1 m1Var, fz.e eVar, fz.f fVar, l1.n nVar, int i11) {
        int i12;
        fz.f fVar2;
        b0.c2 c2Var2;
        l1.g gVar;
        boolean z11;
        b0.v1 v1Var;
        b0.v1 v1Var2;
        b0.v1 v1Var3;
        j2 j2Var;
        b0.v1 v1Var4;
        boolean z12;
        b0.v1 v1Var5;
        b0.v1 v1VarB;
        m1 m1Var2;
        l1 l1Var2;
        boolean z13;
        boolean z14;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1912839215);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(c2Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(rVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(l1Var) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.f(m1Var) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(eVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        int i13 = i12 | 1572864;
        if ((12582912 & i11) == 0) {
            i13 |= sVar.h(fVar) ? 8388608 : 4194304;
        }
        if (sVar.T(i13 & 1, (4793491 & i13) != 4793490)) {
            l1.k1 k1Var = c2Var.f3461d;
            h2 h2Var = c2Var.f3458a;
            if (((Boolean) cVar.invoke(k1Var.getValue())).booleanValue() || ((Boolean) cVar.invoke(h2Var.Y())).booleanValue() || c2Var.g() || c2Var.d()) {
                sVar.d0(-232323267);
                int i14 = i13 & 14;
                int i15 = i14 | 48;
                int i16 = i15 & 14;
                boolean z15 = ((i16 ^ 6) > 4 && sVar.f(c2Var)) || (i15 & 6) == 4;
                Object objQ = sVar.Q();
                boolean z16 = z15;
                l1.g gVar2 = l1.m.f39353a;
                if (z16 || objQ == gVar2) {
                    objQ = h2Var.Y();
                    sVar.o0(objQ);
                }
                if (c2Var.g()) {
                    objQ = h2Var.Y();
                }
                sVar.d0(1844425648);
                v0 v0VarH = h(c2Var, cVar, objQ, sVar);
                sVar.p(false);
                Object value = c2Var.f3461d.getValue();
                sVar.d0(1844425648);
                v0 v0VarH2 = h(c2Var, cVar, value, sVar);
                sVar.p(false);
                int i17 = i16 | 3072;
                au.a aVar = g2.f3545a;
                int i18 = (i17 & 14) ^ 6;
                int i19 = i13;
                boolean z17 = (i18 > 4 && sVar.f(c2Var)) || (i17 & 6) == 4;
                Object objQ2 = sVar.Q();
                if (z17 || objQ2 == gVar2) {
                    objQ2 = new b0.c2(new b0.p0(v0VarH), c2Var, ep.a.k(new StringBuilder(), c2Var.f3460c, " > EnterExitTransition"));
                    sVar.o0(objQ2);
                }
                b0.c2 c2Var3 = (b0.c2) objQ2;
                boolean zF = ((i18 > 4 && sVar.f(c2Var)) || (i17 & 6) == 4) | sVar.f(c2Var3);
                Object objQ3 = sVar.Q();
                if (zF || objQ3 == gVar2) {
                    objQ3 = new au.d1(8, c2Var, c2Var3);
                    sVar.o0(objQ3);
                }
                l1.t.c(c2Var3, (fz.c) objQ3, sVar);
                if (c2Var.g()) {
                    c2Var3.k(v0VarH, v0VarH2);
                } else {
                    c2Var3.p(v0VarH2);
                    c2Var3.f3468k.setValue(Boolean.FALSE);
                }
                l1.b1 b1VarH = l1.t.H(eVar, sVar);
                h2 h2Var2 = c2Var3.f3458a;
                h2 h2Var3 = c2Var3.f3458a;
                l1.k1 k1Var2 = c2Var3.f3461d;
                Object objInvoke = eVar.invoke(h2Var2.Y(), k1Var2.getValue());
                boolean zF2 = sVar.f(c2Var3) | sVar.f(b1VarH);
                Object objQ4 = sVar.Q();
                vy.d dVar = null;
                if (zF2 || objQ4 == gVar2) {
                    objQ4 = new e0(0, c2Var3, b1VarH, dVar);
                    sVar.o0(objQ4);
                }
                l1.b1 b1VarC = l1.t.C((fz.e) objQ4, objInvoke, sVar);
                Object objY = h2Var3.Y();
                v0 v0Var = v0.PostExit;
                if (objY == v0Var && k1Var2.getValue() == v0Var && ((Boolean) b1VarC.getValue()).booleanValue()) {
                    sVar.d0(-230155437);
                    z14 = false;
                    sVar.p(false);
                    fVar2 = fVar;
                } else {
                    sVar.d0(-231293261);
                    boolean z18 = i14 == 4;
                    Object objQ5 = sVar.Q();
                    if (z18 || objQ5 == gVar2) {
                        objQ5 = new l0();
                        sVar.o0(objQ5);
                    }
                    l0 l0Var = (l0) objQ5;
                    j2 j2Var2 = f1.f78a;
                    j2 j2Var3 = b0.e.f3501p;
                    Object objQ6 = sVar.Q();
                    if (objQ6 == gVar2) {
                        objQ6 = c1.f37a;
                        sVar.o0(objQ6);
                    }
                    fz.a aVar2 = (fz.a) objQ6;
                    boolean zF3 = sVar.f(c2Var3);
                    Object objQ7 = sVar.Q();
                    if (zF3 || objQ7 == gVar2) {
                        objQ7 = l1.t.B(l1Var);
                        sVar.o0(objQ7);
                    }
                    l1.b1 b1Var = (l1.b1) objQ7;
                    if (h2Var3.Y() == k1Var2.getValue() && h2Var3.Y() == v0.Visible) {
                        if (c2Var3.g()) {
                            b1Var.setValue(l1Var);
                        } else {
                            b1Var.setValue(l1.f131b);
                        }
                    } else if (k1Var2.getValue() == v0.Visible) {
                        b1Var.setValue(((l1) b1Var.getValue()).a(l1Var));
                    }
                    l1 l1Var3 = (l1) b1Var.getValue();
                    boolean zF4 = sVar.f(c2Var3);
                    Object objQ8 = sVar.Q();
                    if (zF4 || objQ8 == gVar2) {
                        objQ8 = l1.t.B(m1Var);
                        sVar.o0(objQ8);
                    }
                    l1.b1 b1Var2 = (l1.b1) objQ8;
                    if (h2Var3.Y() == k1Var2.getValue() && h2Var3.Y() == v0.Visible) {
                        if (c2Var3.g()) {
                            b1Var2.setValue(m1Var);
                        } else {
                            b1Var2.setValue(m1.f141b);
                        }
                    } else if (k1Var2.getValue() != v0.Visible) {
                        b1Var2.setValue(((m1) b1Var2.getValue()).a(m1Var));
                    }
                    m1 m1Var3 = (m1) b1Var2.getValue();
                    d2 d2Var = l1Var3.f132a;
                    boolean z19 = (d2Var.f54b == null && m1Var3.f143a.f54b == null) ? false : true;
                    boolean z20 = (d2Var.f55c == null && m1Var3.f143a.f55c == null) ? false : true;
                    if (z19) {
                        sVar.d0(133838277);
                        Object objQ9 = sVar.Q();
                        if (objQ9 == gVar2) {
                            objQ9 = "Built-in slide";
                            sVar.o0("Built-in slide");
                        }
                        String str = (String) objQ9;
                        c2Var2 = c2Var3;
                        gVar = gVar2;
                        z11 = true;
                        b0.v1 v1VarB2 = g2.b(c2Var2, j2Var3, str, sVar, 384, 0);
                        sVar.p(false);
                        v1Var = v1VarB2;
                    } else {
                        c2Var2 = c2Var3;
                        gVar = gVar2;
                        z11 = true;
                        sVar.d0(133944080);
                        sVar.p(false);
                        v1Var = null;
                    }
                    if (z20) {
                        sVar.d0(134035871);
                        j2 j2Var4 = b0.e.f3502q;
                        Object objQ10 = sVar.Q();
                        if (objQ10 == gVar) {
                            objQ10 = "Built-in shrink/expand";
                            sVar.o0("Built-in shrink/expand");
                        }
                        b0.v1 v1VarB3 = g2.b(c2Var2, j2Var4, (String) objQ10, sVar, 384, 0);
                        sVar.p(false);
                        v1Var2 = v1VarB3;
                    } else {
                        sVar.d0(134146695);
                        sVar.p(false);
                        v1Var2 = null;
                    }
                    if (z20) {
                        sVar.d0(134220321);
                        Object objQ11 = sVar.Q();
                        if (objQ11 == gVar) {
                            objQ11 = "Built-in InterruptionHandlingOffset";
                            sVar.o0("Built-in InterruptionHandlingOffset");
                        }
                        b0.v1 v1VarB4 = g2.b(c2Var2, j2Var3, (String) objQ11, sVar, 384, 0);
                        sVar.p(false);
                        v1Var3 = v1VarB4;
                    } else {
                        sVar.d0(134390727);
                        sVar.p(false);
                        v1Var3 = null;
                    }
                    d2 d2Var2 = l1Var3.f132a;
                    d2 d2Var3 = m1Var3.f143a;
                    boolean z21 = !z20;
                    j2 j2Var5 = b0.e.f3496j;
                    boolean z22 = (d2Var2.f53a == null && d2Var3.f53a == null) ? false : z11;
                    boolean z23 = (d2Var2.f56d == null && d2Var3.f56d == null) ? false : z11;
                    if (z22) {
                        sVar.d0(-703859581);
                        Object objQ12 = sVar.Q();
                        if (objQ12 == gVar) {
                            objQ12 = "Built-in alpha";
                            sVar.o0("Built-in alpha");
                        }
                        String str2 = (String) objQ12;
                        j2Var = j2Var5;
                        b0.v1 v1VarB5 = g2.b(c2Var2, j2Var, str2, sVar, 384, 0);
                        sVar.p(false);
                        v1Var4 = v1VarB5;
                    } else {
                        j2Var = j2Var5;
                        sVar.d0(-703690136);
                        sVar.p(false);
                        v1Var4 = null;
                    }
                    if (z23) {
                        sVar.d0(-703622493);
                        Object objQ13 = sVar.Q();
                        if (objQ13 == gVar) {
                            objQ13 = "Built-in scale";
                            sVar.o0("Built-in scale");
                        }
                        b0.v1 v1VarB6 = g2.b(c2Var2, j2Var, (String) objQ13, sVar, 384, 0);
                        z12 = false;
                        sVar.p(false);
                        v1Var5 = v1VarB6;
                    } else {
                        z12 = false;
                        sVar.d0(-703453048);
                        sVar.p(false);
                        v1Var5 = null;
                    }
                    if (z23) {
                        sVar.d0(-703375392);
                        v1VarB = g2.b(c2Var2, f1.f78a, "TransformOriginInterruptionHandling", sVar, 384, 0);
                        sVar.p(z12);
                    } else {
                        sVar.d0(-703203064);
                        sVar.p(z12);
                        v1VarB = null;
                    }
                    boolean zH = sVar.h(v1Var4) | sVar.f(l1Var3) | sVar.f(m1Var3) | sVar.h(v1Var5) | sVar.f(c2Var2) | sVar.h(v1VarB);
                    Object objQ14 = sVar.Q();
                    if (zH || objQ14 == gVar) {
                        m1Var2 = m1Var3;
                        l1Var2 = l1Var3;
                        objQ14 = new x0(v1Var4, v1Var5, c2Var2, l1Var2, m1Var2, v1VarB);
                        sVar.o0(objQ14);
                    } else {
                        m1Var2 = m1Var3;
                        l1Var2 = l1Var3;
                    }
                    x0 x0Var = (x0) objQ14;
                    boolean zG = sVar.g(z21) | sVar.f(aVar2);
                    Object objQ15 = sVar.Q();
                    if (zG || objQ15 == gVar) {
                        z13 = false;
                        objQ15 = new d1(z21, aVar2, 0);
                        sVar.o0(objQ15);
                    } else {
                        z13 = false;
                    }
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarI = g2.f0.q(oVar, (fz.c) objQ15).i(new w0(c2Var2, v1Var2, v1Var3, v1Var, l1Var2, m1Var2, aVar2, x0Var));
                    sVar.d0(-7429769);
                    sVar.p(z13);
                    z1.r rVarI2 = rVar.i(rVarI.i(oVar));
                    Object objQ16 = sVar.Q();
                    if (objQ16 == gVar) {
                        objQ16 = new a0(l0Var);
                        sVar.o0(objQ16);
                    }
                    a0 a0Var = (a0) objQ16;
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarI2);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, a0Var, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    fVar2 = fVar;
                    fVar2.invoke(l0Var, sVar, Integer.valueOf((i19 >> 18) & 112));
                    sVar.p(z11);
                    z14 = false;
                    sVar.p(false);
                }
                sVar.p(z14);
            } else {
                sVar.d0(-230149485);
                sVar.p(false);
                fVar2 = fVar;
            }
        } else {
            fVar2 = fVar;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0(c2Var, cVar, rVar, l1Var, m1Var, eVar, fVar2, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0054  */
    /* JADX WARN: Code duplicated, block: B:35:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x005d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:70:0x0105  */
    /* JADX WARN: Code duplicated, block: B:73:0x0113  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void b(j0.b2 b2Var, boolean z11, z1.r rVar, l1 l1Var, m1 m1Var, String str, t1.d dVar, l1.n nVar, int i11, int i12) {
        int i13;
        l1 l1Var2;
        int i14;
        m1 m1Var2;
        int i15;
        int i16;
        t1.d dVar2;
        boolean z12;
        z1.r rVar2;
        m1 m1Var3;
        String str2;
        l1.x1 x1VarT;
        z1.r rVar3;
        l1 l1VarA;
        m1 m1VarA;
        Object objQ;
        int i17;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(234057107);
        if ((i11 & 48) == 0) {
            i13 = (sVar.g(z11) ? 32 : 16) | i11;
        } else {
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= sVar.f(rVar) ? 256 : 128;
        }
        int i19 = i12 & 4;
        if (i19 == 0) {
            if ((i11 & 3072) == 0) {
                l1Var2 = l1Var;
                i13 |= sVar.f(l1Var2) ? 2048 : 1024;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 24576) == 0) {
                    m1Var2 = m1Var;
                    if (sVar.f(m1Var2)) {
                        i15 = 16384;
                    } else {
                        i15 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i13 |= i15;
                }
                i16 = i13 | 196608;
                if ((1572864 & i11) == 0) {
                    dVar2 = dVar;
                    if (sVar.h(dVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i16 |= i17;
                } else {
                    dVar2 = dVar;
                }
                if ((599185 & i16) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i16 & 1, z12)) {
                    if (i18 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i19 != 0) {
                        l1VarA = f1.e(null, 3).a(f1.a(null, 15));
                    } else {
                        l1VarA = l1Var2;
                    }
                    if (i14 != 0) {
                        m1VarA = f1.f(null, 3).a(f1.i(null, 15));
                    } else {
                        m1VarA = m1Var2;
                    }
                    int i21 = i16 >> 3;
                    b0.c2 c2VarE = g2.e(Boolean.valueOf(z11), "AnimatedVisibility", sVar, (i21 & 14) | ((i16 >> 12) & 112), 0);
                    objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = c.f31e;
                        sVar.o0(objQ);
                    }
                    e(c2VarE, (fz.c) objQ, rVar3, l1VarA, m1VarA, dVar2, sVar, (i16 & 57344) | (i16 & 896) | 48 | (i16 & 7168) | (i21 & 458752));
                    m1Var3 = m1VarA;
                    str2 = "AnimatedVisibility";
                    l1Var2 = l1VarA;
                    rVar2 = rVar3;
                } else {
                    sVar.W();
                    rVar2 = rVar;
                    m1Var3 = m1Var2;
                    str2 = str;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new g0(b2Var, z11, rVar2, l1Var2, m1Var3, str2, dVar, i11, i12);
                }
            }
            i13 |= 24576;
            m1Var2 = m1Var;
            i16 = i13 | 196608;
            if ((1572864 & i11) == 0) {
                dVar2 = dVar;
                if (sVar.h(dVar2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i16 |= i17;
            } else {
                dVar2 = dVar;
            }
            if ((599185 & i16) != 599184) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i16 & 1, z12)) {
                if (i18 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar;
                }
                if (i19 != 0) {
                    l1VarA = f1.e(null, 3).a(f1.a(null, 15));
                } else {
                    l1VarA = l1Var2;
                }
                if (i14 != 0) {
                    m1VarA = f1.f(null, 3).a(f1.i(null, 15));
                } else {
                    m1VarA = m1Var2;
                }
                int i22 = i16 >> 3;
                b0.c2 c2VarE2 = g2.e(Boolean.valueOf(z11), "AnimatedVisibility", sVar, (i22 & 14) | ((i16 >> 12) & 112), 0);
                objQ = sVar.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = c.f31e;
                    sVar.o0(objQ);
                }
                e(c2VarE2, (fz.c) objQ, rVar3, l1VarA, m1VarA, dVar2, sVar, (i16 & 57344) | (i16 & 896) | 48 | (i16 & 7168) | (i22 & 458752));
                m1Var3 = m1VarA;
                str2 = "AnimatedVisibility";
                l1Var2 = l1VarA;
                rVar2 = rVar3;
            } else {
                sVar.W();
                rVar2 = rVar;
                m1Var3 = m1Var2;
                str2 = str;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new g0(b2Var, z11, rVar2, l1Var2, m1Var3, str2, dVar, i11, i12);
            }
        }
        i13 |= 3072;
        l1Var2 = l1Var;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 24576) == 0) {
                m1Var2 = m1Var;
                if (sVar.f(m1Var2)) {
                    i15 = 16384;
                } else {
                    i15 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i13 |= i15;
            }
            i16 = i13 | 196608;
            if ((1572864 & i11) == 0) {
                dVar2 = dVar;
                if (sVar.h(dVar2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i16 |= i17;
            } else {
                dVar2 = dVar;
            }
            if ((599185 & i16) != 599184) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i16 & 1, z12)) {
                if (i18 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar;
                }
                if (i19 != 0) {
                    l1VarA = f1.e(null, 3).a(f1.a(null, 15));
                } else {
                    l1VarA = l1Var2;
                }
                if (i14 != 0) {
                    m1VarA = f1.f(null, 3).a(f1.i(null, 15));
                } else {
                    m1VarA = m1Var2;
                }
                int i23 = i16 >> 3;
                b0.c2 c2VarE3 = g2.e(Boolean.valueOf(z11), "AnimatedVisibility", sVar, (i23 & 14) | ((i16 >> 12) & 112), 0);
                objQ = sVar.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = c.f31e;
                    sVar.o0(objQ);
                }
                e(c2VarE3, (fz.c) objQ, rVar3, l1VarA, m1VarA, dVar2, sVar, (i16 & 57344) | (i16 & 896) | 48 | (i16 & 7168) | (i23 & 458752));
                m1Var3 = m1VarA;
                str2 = "AnimatedVisibility";
                l1Var2 = l1VarA;
                rVar2 = rVar3;
            } else {
                sVar.W();
                rVar2 = rVar;
                m1Var3 = m1Var2;
                str2 = str;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new g0(b2Var, z11, rVar2, l1Var2, m1Var3, str2, dVar, i11, i12);
            }
        }
        i13 |= 24576;
        m1Var2 = m1Var;
        i16 = i13 | 196608;
        if ((1572864 & i11) == 0) {
            dVar2 = dVar;
            if (sVar.h(dVar2)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i16 |= i17;
        } else {
            dVar2 = dVar;
        }
        if ((599185 & i16) != 599184) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (sVar.T(i16 & 1, z12)) {
            if (i18 != 0) {
                rVar3 = z1.o.f58481a;
            } else {
                rVar3 = rVar;
            }
            if (i19 != 0) {
                l1VarA = f1.e(null, 3).a(f1.a(null, 15));
            } else {
                l1VarA = l1Var2;
            }
            if (i14 != 0) {
                m1VarA = f1.f(null, 3).a(f1.i(null, 15));
            } else {
                m1VarA = m1Var2;
            }
            int i24 = i16 >> 3;
            b0.c2 c2VarE4 = g2.e(Boolean.valueOf(z11), "AnimatedVisibility", sVar, (i24 & 14) | ((i16 >> 12) & 112), 0);
            objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = c.f31e;
                sVar.o0(objQ);
            }
            e(c2VarE4, (fz.c) objQ, rVar3, l1VarA, m1VarA, dVar2, sVar, (i16 & 57344) | (i16 & 896) | 48 | (i16 & 7168) | (i24 & 458752));
            m1Var3 = m1VarA;
            str2 = "AnimatedVisibility";
            l1Var2 = l1VarA;
            rVar2 = rVar3;
        } else {
            sVar.W();
            rVar2 = rVar;
            m1Var3 = m1Var2;
            str2 = str;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new g0(b2Var, z11, rVar2, l1Var2, m1Var3, str2, dVar, i11, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0122  */
    /* JADX WARN: Code duplicated, block: B:87:0x0130  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void c(boolean z11, z1.r rVar, l1 l1Var, m1 m1Var, String str, fz.f fVar, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVar2;
        int i14;
        l1 l1Var2;
        int i15;
        int i16;
        m1 m1Var2;
        int i17;
        int i18;
        int i19;
        boolean z12;
        z1.r rVar3;
        l1 l1Var3;
        m1 m1Var3;
        String str2;
        l1.x1 x1VarT;
        z1.r rVar4;
        l1 l1VarA;
        m1 m1VarA;
        String str3;
        Object objQ;
        int i21;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1799879339);
        if ((i11 & 48) == 0) {
            i13 = (sVar.g(z11) ? 32 : 16) | i11;
        } else {
            i13 = i11;
        }
        int i22 = i12 & 2;
        if (i22 == 0) {
            if ((i11 & 384) == 0) {
                rVar2 = rVar;
                i13 |= sVar.f(rVar2) ? 256 : 128;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    l1Var2 = l1Var;
                    if (sVar.f(l1Var2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 24576) == 0) {
                        m1Var2 = m1Var;
                        if (sVar.f(m1Var2)) {
                            i17 = 16384;
                        } else {
                            i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 16;
                    if (i18 != 0) {
                        if ((196608 & i11) == 0) {
                            if (sVar.f(str)) {
                                i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                            } else {
                                i19 = 65536;
                            }
                            i13 |= i19;
                        }
                        if ((1572864 & i11) == 0) {
                            if (sVar.h(fVar)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i13 |= i21;
                        }
                        if ((599185 & i13) != 599184) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (sVar.T(i13 & 1, z12)) {
                            if (i22 != 0) {
                                rVar4 = z1.o.f58481a;
                            } else {
                                rVar4 = rVar2;
                            }
                            if (i14 != 0) {
                                l1VarA = f1.e(null, 3).a(f1.d(null, 15));
                            } else {
                                l1VarA = l1Var2;
                            }
                            if (i16 != 0) {
                                m1VarA = f1.f(null, 3).a(f1.l(null, 15));
                            } else {
                                m1VarA = m1Var2;
                            }
                            if (i18 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            int i23 = i13 >> 3;
                            b0.c2 c2VarE = g2.e(Boolean.valueOf(z11), str3, sVar, (i23 & 14) | ((i13 >> 12) & 112), 0);
                            objQ = sVar.Q();
                            if (objQ == l1.m.f39353a) {
                                objQ = c.f32f;
                                sVar.o0(objQ);
                            }
                            l1 l1Var4 = l1VarA;
                            e(c2VarE, (fz.c) objQ, rVar4, l1Var4, m1VarA, fVar, sVar, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (458752 & i23));
                            str2 = str3;
                            rVar3 = rVar4;
                            l1Var3 = l1Var4;
                            m1Var3 = m1VarA;
                        } else {
                            sVar.W();
                            rVar3 = rVar2;
                            l1Var3 = l1Var2;
                            m1Var3 = m1Var2;
                            str2 = str;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, fVar, i11, i12, 1);
                        }
                    }
                    i13 |= 196608;
                    if ((1572864 & i11) == 0) {
                        if (sVar.h(fVar)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                    if ((599185 & i13) != 599184) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i13 & 1, z12)) {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            l1VarA = f1.e(null, 3).a(f1.d(null, 15));
                        } else {
                            l1VarA = l1Var2;
                        }
                        if (i16 != 0) {
                            m1VarA = f1.f(null, 3).a(f1.l(null, 15));
                        } else {
                            m1VarA = m1Var2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i24 = i13 >> 3;
                        b0.c2 c2VarE2 = g2.e(Boolean.valueOf(z11), str3, sVar, (i24 & 14) | ((i13 >> 12) & 112), 0);
                        objQ = sVar.Q();
                        if (objQ == l1.m.f39353a) {
                            objQ = c.f32f;
                            sVar.o0(objQ);
                        }
                        l1 l1Var5 = l1VarA;
                        e(c2VarE2, (fz.c) objQ, rVar4, l1Var5, m1VarA, fVar, sVar, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (458752 & i24));
                        str2 = str3;
                        rVar3 = rVar4;
                        l1Var3 = l1Var5;
                        m1Var3 = m1VarA;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        l1Var3 = l1Var2;
                        m1Var3 = m1Var2;
                        str2 = str;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, fVar, i11, i12, 1);
                    }
                }
                i13 |= 24576;
                m1Var2 = m1Var;
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((196608 & i11) == 0) {
                        if (sVar.f(str)) {
                            i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    if ((1572864 & i11) == 0) {
                        if (sVar.h(fVar)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                    if ((599185 & i13) != 599184) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i13 & 1, z12)) {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            l1VarA = f1.e(null, 3).a(f1.d(null, 15));
                        } else {
                            l1VarA = l1Var2;
                        }
                        if (i16 != 0) {
                            m1VarA = f1.f(null, 3).a(f1.l(null, 15));
                        } else {
                            m1VarA = m1Var2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i25 = i13 >> 3;
                        b0.c2 c2VarE3 = g2.e(Boolean.valueOf(z11), str3, sVar, (i25 & 14) | ((i13 >> 12) & 112), 0);
                        objQ = sVar.Q();
                        if (objQ == l1.m.f39353a) {
                            objQ = c.f32f;
                            sVar.o0(objQ);
                        }
                        l1 l1Var6 = l1VarA;
                        e(c2VarE3, (fz.c) objQ, rVar4, l1Var6, m1VarA, fVar, sVar, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (458752 & i25));
                        str2 = str3;
                        rVar3 = rVar4;
                        l1Var3 = l1Var6;
                        m1Var3 = m1VarA;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        l1Var3 = l1Var2;
                        m1Var3 = m1Var2;
                        str2 = str;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, fVar, i11, i12, 1);
                    }
                }
                i13 |= 196608;
                if ((1572864 & i11) == 0) {
                    if (sVar.h(fVar)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
                if ((599185 & i13) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i13 & 1, z12)) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        l1VarA = f1.e(null, 3).a(f1.d(null, 15));
                    } else {
                        l1VarA = l1Var2;
                    }
                    if (i16 != 0) {
                        m1VarA = f1.f(null, 3).a(f1.l(null, 15));
                    } else {
                        m1VarA = m1Var2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i26 = i13 >> 3;
                    b0.c2 c2VarE4 = g2.e(Boolean.valueOf(z11), str3, sVar, (i26 & 14) | ((i13 >> 12) & 112), 0);
                    objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = c.f32f;
                        sVar.o0(objQ);
                    }
                    l1 l1Var7 = l1VarA;
                    e(c2VarE4, (fz.c) objQ, rVar4, l1Var7, m1VarA, fVar, sVar, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (458752 & i26));
                    str2 = str3;
                    rVar3 = rVar4;
                    l1Var3 = l1Var7;
                    m1Var3 = m1VarA;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    l1Var3 = l1Var2;
                    m1Var3 = m1Var2;
                    str2 = str;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, fVar, i11, i12, 1);
                }
            }
            i13 |= 3072;
            l1Var2 = l1Var;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    m1Var2 = m1Var;
                    if (sVar.f(m1Var2)) {
                        i17 = 16384;
                    } else {
                        i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((196608 & i11) == 0) {
                        if (sVar.f(str)) {
                            i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    if ((1572864 & i11) == 0) {
                        if (sVar.h(fVar)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                    if ((599185 & i13) != 599184) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i13 & 1, z12)) {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            l1VarA = f1.e(null, 3).a(f1.d(null, 15));
                        } else {
                            l1VarA = l1Var2;
                        }
                        if (i16 != 0) {
                            m1VarA = f1.f(null, 3).a(f1.l(null, 15));
                        } else {
                            m1VarA = m1Var2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i27 = i13 >> 3;
                        b0.c2 c2VarE5 = g2.e(Boolean.valueOf(z11), str3, sVar, (i27 & 14) | ((i13 >> 12) & 112), 0);
                        objQ = sVar.Q();
                        if (objQ == l1.m.f39353a) {
                            objQ = c.f32f;
                            sVar.o0(objQ);
                        }
                        l1 l1Var8 = l1VarA;
                        e(c2VarE5, (fz.c) objQ, rVar4, l1Var8, m1VarA, fVar, sVar, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (458752 & i27));
                        str2 = str3;
                        rVar3 = rVar4;
                        l1Var3 = l1Var8;
                        m1Var3 = m1VarA;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        l1Var3 = l1Var2;
                        m1Var3 = m1Var2;
                        str2 = str;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, fVar, i11, i12, 1);
                    }
                }
                i13 |= 196608;
                if ((1572864 & i11) == 0) {
                    if (sVar.h(fVar)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
                if ((599185 & i13) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i13 & 1, z12)) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        l1VarA = f1.e(null, 3).a(f1.d(null, 15));
                    } else {
                        l1VarA = l1Var2;
                    }
                    if (i16 != 0) {
                        m1VarA = f1.f(null, 3).a(f1.l(null, 15));
                    } else {
                        m1VarA = m1Var2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i28 = i13 >> 3;
                    b0.c2 c2VarE6 = g2.e(Boolean.valueOf(z11), str3, sVar, (i28 & 14) | ((i13 >> 12) & 112), 0);
                    objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = c.f32f;
                        sVar.o0(objQ);
                    }
                    l1 l1Var9 = l1VarA;
                    e(c2VarE6, (fz.c) objQ, rVar4, l1Var9, m1VarA, fVar, sVar, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (458752 & i28));
                    str2 = str3;
                    rVar3 = rVar4;
                    l1Var3 = l1Var9;
                    m1Var3 = m1VarA;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    l1Var3 = l1Var2;
                    m1Var3 = m1Var2;
                    str2 = str;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, fVar, i11, i12, 1);
                }
            }
            i13 |= 24576;
            m1Var2 = m1Var;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((196608 & i11) == 0) {
                    if (sVar.f(str)) {
                        i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((1572864 & i11) == 0) {
                    if (sVar.h(fVar)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
                if ((599185 & i13) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i13 & 1, z12)) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        l1VarA = f1.e(null, 3).a(f1.d(null, 15));
                    } else {
                        l1VarA = l1Var2;
                    }
                    if (i16 != 0) {
                        m1VarA = f1.f(null, 3).a(f1.l(null, 15));
                    } else {
                        m1VarA = m1Var2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i29 = i13 >> 3;
                    b0.c2 c2VarE7 = g2.e(Boolean.valueOf(z11), str3, sVar, (i29 & 14) | ((i13 >> 12) & 112), 0);
                    objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = c.f32f;
                        sVar.o0(objQ);
                    }
                    l1 l1Var10 = l1VarA;
                    e(c2VarE7, (fz.c) objQ, rVar4, l1Var10, m1VarA, fVar, sVar, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (458752 & i29));
                    str2 = str3;
                    rVar3 = rVar4;
                    l1Var3 = l1Var10;
                    m1Var3 = m1VarA;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    l1Var3 = l1Var2;
                    m1Var3 = m1Var2;
                    str2 = str;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, fVar, i11, i12, 1);
                }
            }
            i13 |= 196608;
            if ((1572864 & i11) == 0) {
                if (sVar.h(fVar)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
            if ((599185 & i13) != 599184) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i13 & 1, z12)) {
                if (i22 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i14 != 0) {
                    l1VarA = f1.e(null, 3).a(f1.d(null, 15));
                } else {
                    l1VarA = l1Var2;
                }
                if (i16 != 0) {
                    m1VarA = f1.f(null, 3).a(f1.l(null, 15));
                } else {
                    m1VarA = m1Var2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i210 = i13 >> 3;
                b0.c2 c2VarE8 = g2.e(Boolean.valueOf(z11), str3, sVar, (i210 & 14) | ((i13 >> 12) & 112), 0);
                objQ = sVar.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = c.f32f;
                    sVar.o0(objQ);
                }
                l1 l1Var11 = l1VarA;
                e(c2VarE8, (fz.c) objQ, rVar4, l1Var11, m1VarA, fVar, sVar, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (458752 & i210));
                str2 = str3;
                rVar3 = rVar4;
                l1Var3 = l1Var11;
                m1Var3 = m1VarA;
            } else {
                sVar.W();
                rVar3 = rVar2;
                l1Var3 = l1Var2;
                m1Var3 = m1Var2;
                str2 = str;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, fVar, i11, i12, 1);
            }
        }
        i13 |= 384;
        rVar2 = rVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                l1Var2 = l1Var;
                if (sVar.f(l1Var2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    m1Var2 = m1Var;
                    if (sVar.f(m1Var2)) {
                        i17 = 16384;
                    } else {
                        i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((196608 & i11) == 0) {
                        if (sVar.f(str)) {
                            i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    if ((1572864 & i11) == 0) {
                        if (sVar.h(fVar)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                    if ((599185 & i13) != 599184) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i13 & 1, z12)) {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            l1VarA = f1.e(null, 3).a(f1.d(null, 15));
                        } else {
                            l1VarA = l1Var2;
                        }
                        if (i16 != 0) {
                            m1VarA = f1.f(null, 3).a(f1.l(null, 15));
                        } else {
                            m1VarA = m1Var2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i211 = i13 >> 3;
                        b0.c2 c2VarE9 = g2.e(Boolean.valueOf(z11), str3, sVar, (i211 & 14) | ((i13 >> 12) & 112), 0);
                        objQ = sVar.Q();
                        if (objQ == l1.m.f39353a) {
                            objQ = c.f32f;
                            sVar.o0(objQ);
                        }
                        l1 l1Var12 = l1VarA;
                        e(c2VarE9, (fz.c) objQ, rVar4, l1Var12, m1VarA, fVar, sVar, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (458752 & i211));
                        str2 = str3;
                        rVar3 = rVar4;
                        l1Var3 = l1Var12;
                        m1Var3 = m1VarA;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        l1Var3 = l1Var2;
                        m1Var3 = m1Var2;
                        str2 = str;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, fVar, i11, i12, 1);
                    }
                }
                i13 |= 196608;
                if ((1572864 & i11) == 0) {
                    if (sVar.h(fVar)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
                if ((599185 & i13) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i13 & 1, z12)) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        l1VarA = f1.e(null, 3).a(f1.d(null, 15));
                    } else {
                        l1VarA = l1Var2;
                    }
                    if (i16 != 0) {
                        m1VarA = f1.f(null, 3).a(f1.l(null, 15));
                    } else {
                        m1VarA = m1Var2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i212 = i13 >> 3;
                    b0.c2 c2VarE10 = g2.e(Boolean.valueOf(z11), str3, sVar, (i212 & 14) | ((i13 >> 12) & 112), 0);
                    objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = c.f32f;
                        sVar.o0(objQ);
                    }
                    l1 l1Var13 = l1VarA;
                    e(c2VarE10, (fz.c) objQ, rVar4, l1Var13, m1VarA, fVar, sVar, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (458752 & i212));
                    str2 = str3;
                    rVar3 = rVar4;
                    l1Var3 = l1Var13;
                    m1Var3 = m1VarA;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    l1Var3 = l1Var2;
                    m1Var3 = m1Var2;
                    str2 = str;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, fVar, i11, i12, 1);
                }
            }
            i13 |= 24576;
            m1Var2 = m1Var;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((196608 & i11) == 0) {
                    if (sVar.f(str)) {
                        i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((1572864 & i11) == 0) {
                    if (sVar.h(fVar)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
                if ((599185 & i13) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i13 & 1, z12)) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        l1VarA = f1.e(null, 3).a(f1.d(null, 15));
                    } else {
                        l1VarA = l1Var2;
                    }
                    if (i16 != 0) {
                        m1VarA = f1.f(null, 3).a(f1.l(null, 15));
                    } else {
                        m1VarA = m1Var2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i213 = i13 >> 3;
                    b0.c2 c2VarE11 = g2.e(Boolean.valueOf(z11), str3, sVar, (i213 & 14) | ((i13 >> 12) & 112), 0);
                    objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = c.f32f;
                        sVar.o0(objQ);
                    }
                    l1 l1Var14 = l1VarA;
                    e(c2VarE11, (fz.c) objQ, rVar4, l1Var14, m1VarA, fVar, sVar, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (458752 & i213));
                    str2 = str3;
                    rVar3 = rVar4;
                    l1Var3 = l1Var14;
                    m1Var3 = m1VarA;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    l1Var3 = l1Var2;
                    m1Var3 = m1Var2;
                    str2 = str;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, fVar, i11, i12, 1);
                }
            }
            i13 |= 196608;
            if ((1572864 & i11) == 0) {
                if (sVar.h(fVar)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
            if ((599185 & i13) != 599184) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i13 & 1, z12)) {
                if (i22 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i14 != 0) {
                    l1VarA = f1.e(null, 3).a(f1.d(null, 15));
                } else {
                    l1VarA = l1Var2;
                }
                if (i16 != 0) {
                    m1VarA = f1.f(null, 3).a(f1.l(null, 15));
                } else {
                    m1VarA = m1Var2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i214 = i13 >> 3;
                b0.c2 c2VarE12 = g2.e(Boolean.valueOf(z11), str3, sVar, (i214 & 14) | ((i13 >> 12) & 112), 0);
                objQ = sVar.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = c.f32f;
                    sVar.o0(objQ);
                }
                l1 l1Var15 = l1VarA;
                e(c2VarE12, (fz.c) objQ, rVar4, l1Var15, m1VarA, fVar, sVar, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (458752 & i214));
                str2 = str3;
                rVar3 = rVar4;
                l1Var3 = l1Var15;
                m1Var3 = m1VarA;
            } else {
                sVar.W();
                rVar3 = rVar2;
                l1Var3 = l1Var2;
                m1Var3 = m1Var2;
                str2 = str;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, fVar, i11, i12, 1);
            }
        }
        i13 |= 3072;
        l1Var2 = l1Var;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 24576) == 0) {
                m1Var2 = m1Var;
                if (sVar.f(m1Var2)) {
                    i17 = 16384;
                } else {
                    i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i13 |= i17;
            }
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((196608 & i11) == 0) {
                    if (sVar.f(str)) {
                        i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((1572864 & i11) == 0) {
                    if (sVar.h(fVar)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
                if ((599185 & i13) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i13 & 1, z12)) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        l1VarA = f1.e(null, 3).a(f1.d(null, 15));
                    } else {
                        l1VarA = l1Var2;
                    }
                    if (i16 != 0) {
                        m1VarA = f1.f(null, 3).a(f1.l(null, 15));
                    } else {
                        m1VarA = m1Var2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i215 = i13 >> 3;
                    b0.c2 c2VarE13 = g2.e(Boolean.valueOf(z11), str3, sVar, (i215 & 14) | ((i13 >> 12) & 112), 0);
                    objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = c.f32f;
                        sVar.o0(objQ);
                    }
                    l1 l1Var16 = l1VarA;
                    e(c2VarE13, (fz.c) objQ, rVar4, l1Var16, m1VarA, fVar, sVar, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (458752 & i215));
                    str2 = str3;
                    rVar3 = rVar4;
                    l1Var3 = l1Var16;
                    m1Var3 = m1VarA;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    l1Var3 = l1Var2;
                    m1Var3 = m1Var2;
                    str2 = str;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, fVar, i11, i12, 1);
                }
            }
            i13 |= 196608;
            if ((1572864 & i11) == 0) {
                if (sVar.h(fVar)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
            if ((599185 & i13) != 599184) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i13 & 1, z12)) {
                if (i22 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i14 != 0) {
                    l1VarA = f1.e(null, 3).a(f1.d(null, 15));
                } else {
                    l1VarA = l1Var2;
                }
                if (i16 != 0) {
                    m1VarA = f1.f(null, 3).a(f1.l(null, 15));
                } else {
                    m1VarA = m1Var2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i216 = i13 >> 3;
                b0.c2 c2VarE14 = g2.e(Boolean.valueOf(z11), str3, sVar, (i216 & 14) | ((i13 >> 12) & 112), 0);
                objQ = sVar.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = c.f32f;
                    sVar.o0(objQ);
                }
                l1 l1Var17 = l1VarA;
                e(c2VarE14, (fz.c) objQ, rVar4, l1Var17, m1VarA, fVar, sVar, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (458752 & i216));
                str2 = str3;
                rVar3 = rVar4;
                l1Var3 = l1Var17;
                m1Var3 = m1VarA;
            } else {
                sVar.W();
                rVar3 = rVar2;
                l1Var3 = l1Var2;
                m1Var3 = m1Var2;
                str2 = str;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, fVar, i11, i12, 1);
            }
        }
        i13 |= 24576;
        m1Var2 = m1Var;
        i18 = i12 & 16;
        if (i18 != 0) {
            if ((196608 & i11) == 0) {
                if (sVar.f(str)) {
                    i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            if ((1572864 & i11) == 0) {
                if (sVar.h(fVar)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
            if ((599185 & i13) != 599184) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i13 & 1, z12)) {
                if (i22 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i14 != 0) {
                    l1VarA = f1.e(null, 3).a(f1.d(null, 15));
                } else {
                    l1VarA = l1Var2;
                }
                if (i16 != 0) {
                    m1VarA = f1.f(null, 3).a(f1.l(null, 15));
                } else {
                    m1VarA = m1Var2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i217 = i13 >> 3;
                b0.c2 c2VarE15 = g2.e(Boolean.valueOf(z11), str3, sVar, (i217 & 14) | ((i13 >> 12) & 112), 0);
                objQ = sVar.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = c.f32f;
                    sVar.o0(objQ);
                }
                l1 l1Var18 = l1VarA;
                e(c2VarE15, (fz.c) objQ, rVar4, l1Var18, m1VarA, fVar, sVar, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (458752 & i217));
                str2 = str3;
                rVar3 = rVar4;
                l1Var3 = l1Var18;
                m1Var3 = m1VarA;
            } else {
                sVar.W();
                rVar3 = rVar2;
                l1Var3 = l1Var2;
                m1Var3 = m1Var2;
                str2 = str;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, fVar, i11, i12, 1);
            }
        }
        i13 |= 196608;
        if ((1572864 & i11) == 0) {
            if (sVar.h(fVar)) {
                i21 = 1048576;
            } else {
                i21 = 524288;
            }
            i13 |= i21;
        }
        if ((599185 & i13) != 599184) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (sVar.T(i13 & 1, z12)) {
            if (i22 != 0) {
                rVar4 = z1.o.f58481a;
            } else {
                rVar4 = rVar2;
            }
            if (i14 != 0) {
                l1VarA = f1.e(null, 3).a(f1.d(null, 15));
            } else {
                l1VarA = l1Var2;
            }
            if (i16 != 0) {
                m1VarA = f1.f(null, 3).a(f1.l(null, 15));
            } else {
                m1VarA = m1Var2;
            }
            if (i18 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            int i218 = i13 >> 3;
            b0.c2 c2VarE16 = g2.e(Boolean.valueOf(z11), str3, sVar, (i218 & 14) | ((i13 >> 12) & 112), 0);
            objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = c.f32f;
                sVar.o0(objQ);
            }
            l1 l1Var19 = l1VarA;
            e(c2VarE16, (fz.c) objQ, rVar4, l1Var19, m1VarA, fVar, sVar, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (458752 & i218));
            str2 = str3;
            rVar3 = rVar4;
            l1Var3 = l1Var19;
            m1Var3 = m1VarA;
        } else {
            sVar.W();
            rVar3 = rVar2;
            l1Var3 = l1Var2;
            m1Var3 = m1Var2;
            str2 = str;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, fVar, i11, i12, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:84:0x0120  */
    /* JADX WARN: Code duplicated, block: B:87:0x012e  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void d(boolean z11, z1.r rVar, l1 l1Var, m1 m1Var, String str, t1.d dVar, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVar2;
        int i14;
        l1 l1Var2;
        int i15;
        int i16;
        m1 m1Var2;
        int i17;
        int i18;
        int i19;
        boolean z12;
        z1.r rVar3;
        l1 l1Var3;
        m1 m1Var3;
        String str2;
        l1.x1 x1VarT;
        z1.r rVar4;
        l1 l1VarA;
        m1 m1VarA;
        String str3;
        Object objQ;
        int i21;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1448730565);
        if ((i11 & 6) == 0) {
            i13 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i22 = i12 & 2;
        if (i22 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i13 |= sVar.f(rVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 384) == 0) {
                    l1Var2 = l1Var;
                    if (sVar.f(l1Var2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 3072) == 0) {
                        m1Var2 = m1Var;
                        if (sVar.f(m1Var2)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 16;
                    if (i18 != 0) {
                        if ((i11 & 24576) == 0) {
                            if (sVar.f(str)) {
                                i19 = 16384;
                            } else {
                                i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                            }
                            i13 |= i19;
                        }
                        if ((196608 & i11) == 0) {
                            if (sVar.h(dVar)) {
                                i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                            } else {
                                i21 = 65536;
                            }
                            i13 |= i21;
                        }
                        if ((74899 & i13) != 74898) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (sVar.T(i13 & 1, z12)) {
                            if (i22 != 0) {
                                rVar4 = z1.o.f58481a;
                            } else {
                                rVar4 = rVar2;
                            }
                            if (i14 != 0) {
                                l1VarA = f1.e(null, 3).a(f1.c(null, 15));
                            } else {
                                l1VarA = l1Var2;
                            }
                            if (i16 != 0) {
                                m1VarA = f1.k(null, 15).a(f1.f(null, 3));
                            } else {
                                m1VarA = m1Var2;
                            }
                            if (i18 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            b0.c2 c2VarE = g2.e(Boolean.valueOf(z11), str3, sVar, (i13 & 14) | ((i13 >> 9) & 112), 0);
                            objQ = sVar.Q();
                            if (objQ == l1.m.f39353a) {
                                objQ = c.f30d;
                                sVar.o0(objQ);
                            }
                            fz.c cVar = (fz.c) objQ;
                            int i23 = i13 << 3;
                            l1 l1Var4 = l1VarA;
                            e(c2VarE, cVar, rVar4, l1Var4, m1VarA, dVar, sVar, (i23 & 57344) | (i23 & 896) | 48 | (i23 & 7168) | (i13 & 458752));
                            str2 = str3;
                            rVar3 = rVar4;
                            l1Var3 = l1Var4;
                            m1Var3 = m1VarA;
                        } else {
                            sVar.W();
                            rVar3 = rVar2;
                            l1Var3 = l1Var2;
                            m1Var3 = m1Var2;
                            str2 = str;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, dVar, i11, i12, 0);
                        }
                    }
                    i13 |= 24576;
                    if ((196608 & i11) == 0) {
                        if (sVar.h(dVar)) {
                            i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((74899 & i13) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i13 & 1, z12)) {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            l1VarA = f1.e(null, 3).a(f1.c(null, 15));
                        } else {
                            l1VarA = l1Var2;
                        }
                        if (i16 != 0) {
                            m1VarA = f1.k(null, 15).a(f1.f(null, 3));
                        } else {
                            m1VarA = m1Var2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        b0.c2 c2VarE2 = g2.e(Boolean.valueOf(z11), str3, sVar, (i13 & 14) | ((i13 >> 9) & 112), 0);
                        objQ = sVar.Q();
                        if (objQ == l1.m.f39353a) {
                            objQ = c.f30d;
                            sVar.o0(objQ);
                        }
                        fz.c cVar2 = (fz.c) objQ;
                        int i24 = i13 << 3;
                        l1 l1Var5 = l1VarA;
                        e(c2VarE2, cVar2, rVar4, l1Var5, m1VarA, dVar, sVar, (i24 & 57344) | (i24 & 896) | 48 | (i24 & 7168) | (i13 & 458752));
                        str2 = str3;
                        rVar3 = rVar4;
                        l1Var3 = l1Var5;
                        m1Var3 = m1VarA;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        l1Var3 = l1Var2;
                        m1Var3 = m1Var2;
                        str2 = str;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, dVar, i11, i12, 0);
                    }
                }
                i13 |= 3072;
                m1Var2 = m1Var;
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        if (sVar.f(str)) {
                            i19 = 16384;
                        } else {
                            i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                        }
                        i13 |= i19;
                    }
                    if ((196608 & i11) == 0) {
                        if (sVar.h(dVar)) {
                            i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((74899 & i13) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i13 & 1, z12)) {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            l1VarA = f1.e(null, 3).a(f1.c(null, 15));
                        } else {
                            l1VarA = l1Var2;
                        }
                        if (i16 != 0) {
                            m1VarA = f1.k(null, 15).a(f1.f(null, 3));
                        } else {
                            m1VarA = m1Var2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        b0.c2 c2VarE3 = g2.e(Boolean.valueOf(z11), str3, sVar, (i13 & 14) | ((i13 >> 9) & 112), 0);
                        objQ = sVar.Q();
                        if (objQ == l1.m.f39353a) {
                            objQ = c.f30d;
                            sVar.o0(objQ);
                        }
                        fz.c cVar3 = (fz.c) objQ;
                        int i25 = i13 << 3;
                        l1 l1Var6 = l1VarA;
                        e(c2VarE3, cVar3, rVar4, l1Var6, m1VarA, dVar, sVar, (i25 & 57344) | (i25 & 896) | 48 | (i25 & 7168) | (i13 & 458752));
                        str2 = str3;
                        rVar3 = rVar4;
                        l1Var3 = l1Var6;
                        m1Var3 = m1VarA;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        l1Var3 = l1Var2;
                        m1Var3 = m1Var2;
                        str2 = str;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, dVar, i11, i12, 0);
                    }
                }
                i13 |= 24576;
                if ((196608 & i11) == 0) {
                    if (sVar.h(dVar)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((74899 & i13) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i13 & 1, z12)) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        l1VarA = f1.e(null, 3).a(f1.c(null, 15));
                    } else {
                        l1VarA = l1Var2;
                    }
                    if (i16 != 0) {
                        m1VarA = f1.k(null, 15).a(f1.f(null, 3));
                    } else {
                        m1VarA = m1Var2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    b0.c2 c2VarE4 = g2.e(Boolean.valueOf(z11), str3, sVar, (i13 & 14) | ((i13 >> 9) & 112), 0);
                    objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = c.f30d;
                        sVar.o0(objQ);
                    }
                    fz.c cVar4 = (fz.c) objQ;
                    int i26 = i13 << 3;
                    l1 l1Var7 = l1VarA;
                    e(c2VarE4, cVar4, rVar4, l1Var7, m1VarA, dVar, sVar, (i26 & 57344) | (i26 & 896) | 48 | (i26 & 7168) | (i13 & 458752));
                    str2 = str3;
                    rVar3 = rVar4;
                    l1Var3 = l1Var7;
                    m1Var3 = m1VarA;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    l1Var3 = l1Var2;
                    m1Var3 = m1Var2;
                    str2 = str;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, dVar, i11, i12, 0);
                }
            }
            i13 |= 384;
            l1Var2 = l1Var;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    m1Var2 = m1Var;
                    if (sVar.f(m1Var2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        if (sVar.f(str)) {
                            i19 = 16384;
                        } else {
                            i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                        }
                        i13 |= i19;
                    }
                    if ((196608 & i11) == 0) {
                        if (sVar.h(dVar)) {
                            i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((74899 & i13) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i13 & 1, z12)) {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            l1VarA = f1.e(null, 3).a(f1.c(null, 15));
                        } else {
                            l1VarA = l1Var2;
                        }
                        if (i16 != 0) {
                            m1VarA = f1.k(null, 15).a(f1.f(null, 3));
                        } else {
                            m1VarA = m1Var2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        b0.c2 c2VarE5 = g2.e(Boolean.valueOf(z11), str3, sVar, (i13 & 14) | ((i13 >> 9) & 112), 0);
                        objQ = sVar.Q();
                        if (objQ == l1.m.f39353a) {
                            objQ = c.f30d;
                            sVar.o0(objQ);
                        }
                        fz.c cVar5 = (fz.c) objQ;
                        int i27 = i13 << 3;
                        l1 l1Var8 = l1VarA;
                        e(c2VarE5, cVar5, rVar4, l1Var8, m1VarA, dVar, sVar, (i27 & 57344) | (i27 & 896) | 48 | (i27 & 7168) | (i13 & 458752));
                        str2 = str3;
                        rVar3 = rVar4;
                        l1Var3 = l1Var8;
                        m1Var3 = m1VarA;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        l1Var3 = l1Var2;
                        m1Var3 = m1Var2;
                        str2 = str;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, dVar, i11, i12, 0);
                    }
                }
                i13 |= 24576;
                if ((196608 & i11) == 0) {
                    if (sVar.h(dVar)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((74899 & i13) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i13 & 1, z12)) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        l1VarA = f1.e(null, 3).a(f1.c(null, 15));
                    } else {
                        l1VarA = l1Var2;
                    }
                    if (i16 != 0) {
                        m1VarA = f1.k(null, 15).a(f1.f(null, 3));
                    } else {
                        m1VarA = m1Var2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    b0.c2 c2VarE6 = g2.e(Boolean.valueOf(z11), str3, sVar, (i13 & 14) | ((i13 >> 9) & 112), 0);
                    objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = c.f30d;
                        sVar.o0(objQ);
                    }
                    fz.c cVar6 = (fz.c) objQ;
                    int i28 = i13 << 3;
                    l1 l1Var9 = l1VarA;
                    e(c2VarE6, cVar6, rVar4, l1Var9, m1VarA, dVar, sVar, (i28 & 57344) | (i28 & 896) | 48 | (i28 & 7168) | (i13 & 458752));
                    str2 = str3;
                    rVar3 = rVar4;
                    l1Var3 = l1Var9;
                    m1Var3 = m1VarA;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    l1Var3 = l1Var2;
                    m1Var3 = m1Var2;
                    str2 = str;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, dVar, i11, i12, 0);
                }
            }
            i13 |= 3072;
            m1Var2 = m1Var;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    if (sVar.f(str)) {
                        i19 = 16384;
                    } else {
                        i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i13 |= i19;
                }
                if ((196608 & i11) == 0) {
                    if (sVar.h(dVar)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((74899 & i13) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i13 & 1, z12)) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        l1VarA = f1.e(null, 3).a(f1.c(null, 15));
                    } else {
                        l1VarA = l1Var2;
                    }
                    if (i16 != 0) {
                        m1VarA = f1.k(null, 15).a(f1.f(null, 3));
                    } else {
                        m1VarA = m1Var2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    b0.c2 c2VarE7 = g2.e(Boolean.valueOf(z11), str3, sVar, (i13 & 14) | ((i13 >> 9) & 112), 0);
                    objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = c.f30d;
                        sVar.o0(objQ);
                    }
                    fz.c cVar7 = (fz.c) objQ;
                    int i29 = i13 << 3;
                    l1 l1Var10 = l1VarA;
                    e(c2VarE7, cVar7, rVar4, l1Var10, m1VarA, dVar, sVar, (i29 & 57344) | (i29 & 896) | 48 | (i29 & 7168) | (i13 & 458752));
                    str2 = str3;
                    rVar3 = rVar4;
                    l1Var3 = l1Var10;
                    m1Var3 = m1VarA;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    l1Var3 = l1Var2;
                    m1Var3 = m1Var2;
                    str2 = str;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, dVar, i11, i12, 0);
                }
            }
            i13 |= 24576;
            if ((196608 & i11) == 0) {
                if (sVar.h(dVar)) {
                    i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((74899 & i13) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i13 & 1, z12)) {
                if (i22 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i14 != 0) {
                    l1VarA = f1.e(null, 3).a(f1.c(null, 15));
                } else {
                    l1VarA = l1Var2;
                }
                if (i16 != 0) {
                    m1VarA = f1.k(null, 15).a(f1.f(null, 3));
                } else {
                    m1VarA = m1Var2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                b0.c2 c2VarE8 = g2.e(Boolean.valueOf(z11), str3, sVar, (i13 & 14) | ((i13 >> 9) & 112), 0);
                objQ = sVar.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = c.f30d;
                    sVar.o0(objQ);
                }
                fz.c cVar8 = (fz.c) objQ;
                int i210 = i13 << 3;
                l1 l1Var11 = l1VarA;
                e(c2VarE8, cVar8, rVar4, l1Var11, m1VarA, dVar, sVar, (i210 & 57344) | (i210 & 896) | 48 | (i210 & 7168) | (i13 & 458752));
                str2 = str3;
                rVar3 = rVar4;
                l1Var3 = l1Var11;
                m1Var3 = m1VarA;
            } else {
                sVar.W();
                rVar3 = rVar2;
                l1Var3 = l1Var2;
                m1Var3 = m1Var2;
                str2 = str;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, dVar, i11, i12, 0);
            }
        }
        i13 |= 48;
        rVar2 = rVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 384) == 0) {
                l1Var2 = l1Var;
                if (sVar.f(l1Var2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    m1Var2 = m1Var;
                    if (sVar.f(m1Var2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        if (sVar.f(str)) {
                            i19 = 16384;
                        } else {
                            i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                        }
                        i13 |= i19;
                    }
                    if ((196608 & i11) == 0) {
                        if (sVar.h(dVar)) {
                            i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((74899 & i13) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i13 & 1, z12)) {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            l1VarA = f1.e(null, 3).a(f1.c(null, 15));
                        } else {
                            l1VarA = l1Var2;
                        }
                        if (i16 != 0) {
                            m1VarA = f1.k(null, 15).a(f1.f(null, 3));
                        } else {
                            m1VarA = m1Var2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        b0.c2 c2VarE9 = g2.e(Boolean.valueOf(z11), str3, sVar, (i13 & 14) | ((i13 >> 9) & 112), 0);
                        objQ = sVar.Q();
                        if (objQ == l1.m.f39353a) {
                            objQ = c.f30d;
                            sVar.o0(objQ);
                        }
                        fz.c cVar9 = (fz.c) objQ;
                        int i211 = i13 << 3;
                        l1 l1Var12 = l1VarA;
                        e(c2VarE9, cVar9, rVar4, l1Var12, m1VarA, dVar, sVar, (i211 & 57344) | (i211 & 896) | 48 | (i211 & 7168) | (i13 & 458752));
                        str2 = str3;
                        rVar3 = rVar4;
                        l1Var3 = l1Var12;
                        m1Var3 = m1VarA;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        l1Var3 = l1Var2;
                        m1Var3 = m1Var2;
                        str2 = str;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, dVar, i11, i12, 0);
                    }
                }
                i13 |= 24576;
                if ((196608 & i11) == 0) {
                    if (sVar.h(dVar)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((74899 & i13) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i13 & 1, z12)) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        l1VarA = f1.e(null, 3).a(f1.c(null, 15));
                    } else {
                        l1VarA = l1Var2;
                    }
                    if (i16 != 0) {
                        m1VarA = f1.k(null, 15).a(f1.f(null, 3));
                    } else {
                        m1VarA = m1Var2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    b0.c2 c2VarE10 = g2.e(Boolean.valueOf(z11), str3, sVar, (i13 & 14) | ((i13 >> 9) & 112), 0);
                    objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = c.f30d;
                        sVar.o0(objQ);
                    }
                    fz.c cVar10 = (fz.c) objQ;
                    int i212 = i13 << 3;
                    l1 l1Var13 = l1VarA;
                    e(c2VarE10, cVar10, rVar4, l1Var13, m1VarA, dVar, sVar, (i212 & 57344) | (i212 & 896) | 48 | (i212 & 7168) | (i13 & 458752));
                    str2 = str3;
                    rVar3 = rVar4;
                    l1Var3 = l1Var13;
                    m1Var3 = m1VarA;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    l1Var3 = l1Var2;
                    m1Var3 = m1Var2;
                    str2 = str;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, dVar, i11, i12, 0);
                }
            }
            i13 |= 3072;
            m1Var2 = m1Var;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    if (sVar.f(str)) {
                        i19 = 16384;
                    } else {
                        i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i13 |= i19;
                }
                if ((196608 & i11) == 0) {
                    if (sVar.h(dVar)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((74899 & i13) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i13 & 1, z12)) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        l1VarA = f1.e(null, 3).a(f1.c(null, 15));
                    } else {
                        l1VarA = l1Var2;
                    }
                    if (i16 != 0) {
                        m1VarA = f1.k(null, 15).a(f1.f(null, 3));
                    } else {
                        m1VarA = m1Var2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    b0.c2 c2VarE11 = g2.e(Boolean.valueOf(z11), str3, sVar, (i13 & 14) | ((i13 >> 9) & 112), 0);
                    objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = c.f30d;
                        sVar.o0(objQ);
                    }
                    fz.c cVar11 = (fz.c) objQ;
                    int i213 = i13 << 3;
                    l1 l1Var14 = l1VarA;
                    e(c2VarE11, cVar11, rVar4, l1Var14, m1VarA, dVar, sVar, (i213 & 57344) | (i213 & 896) | 48 | (i213 & 7168) | (i13 & 458752));
                    str2 = str3;
                    rVar3 = rVar4;
                    l1Var3 = l1Var14;
                    m1Var3 = m1VarA;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    l1Var3 = l1Var2;
                    m1Var3 = m1Var2;
                    str2 = str;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, dVar, i11, i12, 0);
                }
            }
            i13 |= 24576;
            if ((196608 & i11) == 0) {
                if (sVar.h(dVar)) {
                    i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((74899 & i13) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i13 & 1, z12)) {
                if (i22 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i14 != 0) {
                    l1VarA = f1.e(null, 3).a(f1.c(null, 15));
                } else {
                    l1VarA = l1Var2;
                }
                if (i16 != 0) {
                    m1VarA = f1.k(null, 15).a(f1.f(null, 3));
                } else {
                    m1VarA = m1Var2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                b0.c2 c2VarE12 = g2.e(Boolean.valueOf(z11), str3, sVar, (i13 & 14) | ((i13 >> 9) & 112), 0);
                objQ = sVar.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = c.f30d;
                    sVar.o0(objQ);
                }
                fz.c cVar12 = (fz.c) objQ;
                int i214 = i13 << 3;
                l1 l1Var15 = l1VarA;
                e(c2VarE12, cVar12, rVar4, l1Var15, m1VarA, dVar, sVar, (i214 & 57344) | (i214 & 896) | 48 | (i214 & 7168) | (i13 & 458752));
                str2 = str3;
                rVar3 = rVar4;
                l1Var3 = l1Var15;
                m1Var3 = m1VarA;
            } else {
                sVar.W();
                rVar3 = rVar2;
                l1Var3 = l1Var2;
                m1Var3 = m1Var2;
                str2 = str;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, dVar, i11, i12, 0);
            }
        }
        i13 |= 384;
        l1Var2 = l1Var;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 3072) == 0) {
                m1Var2 = m1Var;
                if (sVar.f(m1Var2)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    if (sVar.f(str)) {
                        i19 = 16384;
                    } else {
                        i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i13 |= i19;
                }
                if ((196608 & i11) == 0) {
                    if (sVar.h(dVar)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((74899 & i13) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i13 & 1, z12)) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        l1VarA = f1.e(null, 3).a(f1.c(null, 15));
                    } else {
                        l1VarA = l1Var2;
                    }
                    if (i16 != 0) {
                        m1VarA = f1.k(null, 15).a(f1.f(null, 3));
                    } else {
                        m1VarA = m1Var2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    b0.c2 c2VarE13 = g2.e(Boolean.valueOf(z11), str3, sVar, (i13 & 14) | ((i13 >> 9) & 112), 0);
                    objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = c.f30d;
                        sVar.o0(objQ);
                    }
                    fz.c cVar13 = (fz.c) objQ;
                    int i215 = i13 << 3;
                    l1 l1Var16 = l1VarA;
                    e(c2VarE13, cVar13, rVar4, l1Var16, m1VarA, dVar, sVar, (i215 & 57344) | (i215 & 896) | 48 | (i215 & 7168) | (i13 & 458752));
                    str2 = str3;
                    rVar3 = rVar4;
                    l1Var3 = l1Var16;
                    m1Var3 = m1VarA;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    l1Var3 = l1Var2;
                    m1Var3 = m1Var2;
                    str2 = str;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, dVar, i11, i12, 0);
                }
            }
            i13 |= 24576;
            if ((196608 & i11) == 0) {
                if (sVar.h(dVar)) {
                    i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((74899 & i13) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i13 & 1, z12)) {
                if (i22 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i14 != 0) {
                    l1VarA = f1.e(null, 3).a(f1.c(null, 15));
                } else {
                    l1VarA = l1Var2;
                }
                if (i16 != 0) {
                    m1VarA = f1.k(null, 15).a(f1.f(null, 3));
                } else {
                    m1VarA = m1Var2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                b0.c2 c2VarE14 = g2.e(Boolean.valueOf(z11), str3, sVar, (i13 & 14) | ((i13 >> 9) & 112), 0);
                objQ = sVar.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = c.f30d;
                    sVar.o0(objQ);
                }
                fz.c cVar14 = (fz.c) objQ;
                int i216 = i13 << 3;
                l1 l1Var17 = l1VarA;
                e(c2VarE14, cVar14, rVar4, l1Var17, m1VarA, dVar, sVar, (i216 & 57344) | (i216 & 896) | 48 | (i216 & 7168) | (i13 & 458752));
                str2 = str3;
                rVar3 = rVar4;
                l1Var3 = l1Var17;
                m1Var3 = m1VarA;
            } else {
                sVar.W();
                rVar3 = rVar2;
                l1Var3 = l1Var2;
                m1Var3 = m1Var2;
                str2 = str;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, dVar, i11, i12, 0);
            }
        }
        i13 |= 3072;
        m1Var2 = m1Var;
        i18 = i12 & 16;
        if (i18 != 0) {
            if ((i11 & 24576) == 0) {
                if (sVar.f(str)) {
                    i19 = 16384;
                } else {
                    i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i13 |= i19;
            }
            if ((196608 & i11) == 0) {
                if (sVar.h(dVar)) {
                    i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((74899 & i13) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i13 & 1, z12)) {
                if (i22 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i14 != 0) {
                    l1VarA = f1.e(null, 3).a(f1.c(null, 15));
                } else {
                    l1VarA = l1Var2;
                }
                if (i16 != 0) {
                    m1VarA = f1.k(null, 15).a(f1.f(null, 3));
                } else {
                    m1VarA = m1Var2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                b0.c2 c2VarE15 = g2.e(Boolean.valueOf(z11), str3, sVar, (i13 & 14) | ((i13 >> 9) & 112), 0);
                objQ = sVar.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = c.f30d;
                    sVar.o0(objQ);
                }
                fz.c cVar15 = (fz.c) objQ;
                int i217 = i13 << 3;
                l1 l1Var18 = l1VarA;
                e(c2VarE15, cVar15, rVar4, l1Var18, m1VarA, dVar, sVar, (i217 & 57344) | (i217 & 896) | 48 | (i217 & 7168) | (i13 & 458752));
                str2 = str3;
                rVar3 = rVar4;
                l1Var3 = l1Var18;
                m1Var3 = m1VarA;
            } else {
                sVar.W();
                rVar3 = rVar2;
                l1Var3 = l1Var2;
                m1Var3 = m1Var2;
                str2 = str;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, dVar, i11, i12, 0);
            }
        }
        i13 |= 24576;
        if ((196608 & i11) == 0) {
            if (sVar.h(dVar)) {
                i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
            } else {
                i21 = 65536;
            }
            i13 |= i21;
        }
        if ((74899 & i13) != 74898) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (sVar.T(i13 & 1, z12)) {
            if (i22 != 0) {
                rVar4 = z1.o.f58481a;
            } else {
                rVar4 = rVar2;
            }
            if (i14 != 0) {
                l1VarA = f1.e(null, 3).a(f1.c(null, 15));
            } else {
                l1VarA = l1Var2;
            }
            if (i16 != 0) {
                m1VarA = f1.k(null, 15).a(f1.f(null, 3));
            } else {
                m1VarA = m1Var2;
            }
            if (i18 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            b0.c2 c2VarE16 = g2.e(Boolean.valueOf(z11), str3, sVar, (i13 & 14) | ((i13 >> 9) & 112), 0);
            objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = c.f30d;
                sVar.o0(objQ);
            }
            fz.c cVar16 = (fz.c) objQ;
            int i218 = i13 << 3;
            l1 l1Var19 = l1VarA;
            e(c2VarE16, cVar16, rVar4, l1Var19, m1VarA, dVar, sVar, (i218 & 57344) | (i218 & 896) | 48 | (i218 & 7168) | (i13 & 458752));
            str2 = str3;
            rVar3 = rVar4;
            l1Var3 = l1Var19;
            m1Var3 = m1VarA;
        } else {
            sVar.W();
            rVar3 = rVar2;
            l1Var3 = l1Var2;
            m1Var3 = m1Var2;
            str2 = str;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f0(z11, rVar3, l1Var3, m1Var3, str2, dVar, i11, i12, 0);
        }
    }

    public static final void e(b0.c2 c2Var, fz.c cVar, z1.r rVar, l1 l1Var, m1 m1Var, fz.f fVar, l1.n nVar, int i11) {
        int i12;
        l1 l1Var2;
        m1 m1Var2;
        fz.f fVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1706321816);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(c2Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(rVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            l1Var2 = l1Var;
            i12 |= sVar.f(l1Var2) ? 2048 : 1024;
        } else {
            l1Var2 = l1Var;
        }
        if ((i11 & 24576) == 0) {
            m1Var2 = m1Var;
            i12 |= sVar.f(m1Var2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        } else {
            m1Var2 = m1Var;
        }
        if ((i11 & 196608) == 0) {
            fVar2 = fVar;
            i12 |= sVar.h(fVar2) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        } else {
            fVar2 = fVar;
        }
        if (sVar.T(i12 & 1, (74899 & i12) != 74898)) {
            int i13 = i12 & 112;
            int i14 = i12 & 14;
            boolean z11 = (i13 == 32) | (i14 == 4);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new i0(0, cVar, c2Var);
                sVar.o0(objQ);
            }
            z1.r rVarK = w2.a0.k(rVar, (fz.f) objQ);
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = n.f145c;
                sVar.o0(objQ2);
            }
            a(c2Var, cVar, rVarK, l1Var2, m1Var2, (fz.e) objQ2, fVar2, sVar, 196608 | i14 | i13 | (i12 & 7168) | (57344 & i12) | ((i12 << 6) & 29360128));
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m(c2Var, cVar, rVar, l1Var, m1Var, fVar, i11);
        }
    }

    public static final void f(b0.c2 c2Var, z1.r rVar, b0.c0 c0Var, fz.c cVar, t1.d dVar, l1.n nVar, int i11) {
        b0.c0 c0Var2;
        fz.c cVar2;
        b0.c2 c2Var2 = c2Var;
        h2 h2Var = c2Var2.f3458a;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1877370462);
        int i12 = (i11 & 6) == 0 ? (sVar.f(c2Var2) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            c0Var2 = c0Var;
            i12 |= sVar.h(c0Var2) ? 256 : 128;
        } else {
            c0Var2 = c0Var;
        }
        int i13 = i12 | 3072;
        if ((i11 & 24576) == 0) {
            i13 |= sVar.h(dVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = c.H;
                sVar.o0(objQ);
            }
            fz.c cVar3 = (fz.c) objQ;
            Object objQ2 = sVar.Q();
            Object obj = objQ2;
            if (objQ2 == gVar) {
                x1.p pVar = new x1.p();
                pVar.add(h2Var.Y());
                sVar.o0(pVar);
                obj = pVar;
            }
            x1.p pVar2 = (x1.p) obj;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                long[] jArr = y.r0.f56756a;
                objQ3 = new y.i0();
                sVar.o0(objQ3);
            }
            y.i0 i0Var = (y.i0) objQ3;
            l1.k1 k1Var = c2Var2.f3461d;
            if (kotlin.jvm.internal.m.a(h2Var.Y(), k1Var.getValue())) {
                sVar.d0(321189832);
                if (pVar2.size() == 1 && kotlin.jvm.internal.m.a(pVar2.get(0), k1Var.getValue())) {
                    sVar.d0(321514464);
                    sVar.p(false);
                } else {
                    sVar.d0(321324186);
                    boolean z11 = (i13 & 14) == 4;
                    Object objQ4 = sVar.Q();
                    if (z11 || objQ4 == gVar) {
                        objQ4 = new o0(c2Var2, 1);
                        sVar.o0(objQ4);
                    }
                    ry.m.K0(pVar2, (fz.c) objQ4);
                    i0Var.a();
                    sVar.p(false);
                }
                sVar.p(false);
            } else {
                sVar.d0(321520416);
                sVar.p(false);
            }
            if (i0Var.b(k1Var.getValue())) {
                sVar.d0(322323936);
                sVar.p(false);
            } else {
                sVar.d0(321581083);
                ListIterator listIterator = pVar2.listIterator();
                int i14 = 0;
                while (true) {
                    sy.a aVar = (sy.a) listIterator;
                    if (!aVar.hasNext()) {
                        i14 = -1;
                        break;
                    } else if (kotlin.jvm.internal.m.a(cVar3.invoke(aVar.next()), cVar3.invoke(k1Var.getValue()))) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 == -1) {
                    pVar2.add(k1Var.getValue());
                } else {
                    pVar2.set(i14, k1Var.getValue());
                }
                i0Var.a();
                int size = pVar2.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj2 = pVar2.get(i15);
                    i0Var.m(obj2, t1.e.d(-934471669, new t0(c2Var2, c0Var2, obj2, dVar, 0), sVar));
                    i15++;
                    c2Var2 = c2Var;
                    c0Var2 = c0Var;
                }
                sVar.p(false);
            }
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            sVar.d0(-1312707512);
            int size2 = pVar2.size();
            for (int i16 = 0; i16 < size2; i16++) {
                Object obj3 = pVar2.get(i16);
                sVar.a0(1171574969, cVar3.invoke(obj3));
                fz.e eVar = (fz.e) i0Var.g(obj3);
                if (eVar == null) {
                    sVar.d0(1959122128);
                } else {
                    sVar.d0(1171576145);
                    eVar.invoke(sVar, 0);
                }
                sVar.p(false);
                sVar.p(false);
            }
            sVar.p(false);
            sVar.p(true);
            cVar2 = cVar3;
        } else {
            sVar.W();
            cVar2 = cVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new u0(c2Var, rVar, c0Var, cVar2, dVar, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void g(Object obj, z1.r rVar, b0.c0 c0Var, String str, t1.d dVar, l1.n nVar, int i11, int i12) {
        int i13;
        String str2;
        boolean z11;
        z1.r rVar2;
        String str3;
        l1.x1 x1VarT;
        String str4;
        int i14;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-513216493);
        if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? sVar.f(obj) : sVar.h(obj) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar.h(c0Var) ? 256 : 128;
        }
        int i16 = i12 & 8;
        if (i16 == 0) {
            if ((i11 & 3072) == 0) {
                str2 = str;
                i13 |= sVar.f(str2) ? 2048 : 1024;
            }
            if ((i11 & 24576) == 0) {
                if (sVar.h(dVar)) {
                    i14 = 16384;
                } else {
                    i14 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i13 |= i14;
            }
            if ((i13 & 9363) != 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i13 & 1, z11)) {
                if (i15 != 0) {
                    rVar = z1.o.f58481a;
                }
                z1.r rVar3 = rVar;
                if (i16 != 0) {
                    str4 = "Crossfade";
                } else {
                    str4 = str2;
                }
                f(g2.e(obj, str4, sVar, (i13 & 14) | ((i13 >> 6) & 112), 0), rVar3, c0Var, null, dVar, sVar, i13 & 58352);
                str3 = str4;
                rVar2 = rVar3;
            } else {
                sVar.W();
                rVar2 = rVar;
                str3 = str2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new q0(obj, rVar2, c0Var, str3, dVar, i11, i12, 0);
            }
        }
        i13 |= 3072;
        str2 = str;
        if ((i11 & 24576) == 0) {
            if (sVar.h(dVar)) {
                i14 = 16384;
            } else {
                i14 = OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            i13 |= i14;
        }
        if ((i13 & 9363) != 9362) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar.T(i13 & 1, z11)) {
            if (i15 != 0) {
                rVar = z1.o.f58481a;
            }
            z1.r rVar4 = rVar;
            if (i16 != 0) {
                str4 = "Crossfade";
            } else {
                str4 = str2;
            }
            f(g2.e(obj, str4, sVar, (i13 & 14) | ((i13 >> 6) & 112), 0), rVar4, c0Var, null, dVar, sVar, i13 & 58352);
            str3 = str4;
            rVar2 = rVar4;
        } else {
            sVar.W();
            rVar2 = rVar;
            str3 = str2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q0(obj, rVar2, c0Var, str3, dVar, i11, i12, 0);
        }
    }

    public static final v0 h(b0.c2 c2Var, fz.c cVar, Object obj, l1.n nVar) {
        v0 v0Var;
        l1.s sVar = (l1.s) nVar;
        sVar.a0(-422486105, c2Var);
        boolean zG = c2Var.g();
        h2 h2Var = c2Var.f3458a;
        if (zG) {
            sVar.d0(-212146657);
            sVar.p(false);
            if (((Boolean) cVar.invoke(obj)).booleanValue()) {
                v0Var = v0.Visible;
            } else {
                v0Var = ((Boolean) cVar.invoke(h2Var.Y())).booleanValue() ? v0.PostExit : v0.PreEnter;
            }
        } else {
            sVar.d0(-211872524);
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            if (((Boolean) cVar.invoke(h2Var.Y())).booleanValue()) {
                b1Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) cVar.invoke(obj)).booleanValue()) {
                v0Var = v0.Visible;
            } else {
                v0Var = ((Boolean) b1Var.getValue()).booleanValue() ? v0.PostExit : v0.PreEnter;
            }
            sVar.p(false);
        }
        sVar.p(false);
        return v0Var;
    }
}
