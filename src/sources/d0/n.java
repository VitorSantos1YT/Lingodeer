package d0;

import android.content.res.Configuration;
import android.os.Build;
import android.view.KeyEvent;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final v a(long j11, float f5) {
        return new v(f5, new g2.y0(j11));
    }

    public static final void b(int i11, fz.c cVar, l1.n nVar, z1.r rVar) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-932836462);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(cVar) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            j0.c.g(sVar, d2.h.d(rVar, cVar));
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w(i11, cVar, rVar, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x0113  */
    /* JADX WARN: Code duplicated, block: B:103:0x0127  */
    /* JADX WARN: Code duplicated, block: B:106:0x0144  */
    /* JADX WARN: Code duplicated, block: B:109:0x0167  */
    /* JADX WARN: Code duplicated, block: B:110:0x016b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0183  */
    /* JADX WARN: Code duplicated, block: B:115:0x0191  */
    /* JADX WARN: Code duplicated, block: B:118:0x019d  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:96:0x0108  */
    /* JADX WARN: Code duplicated, block: B:97:0x010a  */
    public static final void c(final k2.b bVar, final String str, z1.r rVar, z1.e eVar, w2.j jVar, float f5, g2.p pVar, l1.n nVar, final int i11, final int i12) {
        int i13;
        z1.r rVar2;
        int i14;
        z1.e eVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        float f11;
        int i19;
        int i21;
        int i22;
        int i23;
        boolean z11;
        final z1.r rVar3;
        final z1.e eVar3;
        final w2.j jVar2;
        final g2.p pVar2;
        final float f12;
        l1.x1 x1VarT;
        z1.r rVarB;
        z1.e eVar4;
        int i24;
        w2.j jVar3;
        g2.p pVar3;
        l1.g gVar;
        Object objQ;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        boolean z12;
        Object objQ2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1142754848);
        if ((i11 & 6) == 0) {
            i13 = (sVar.h(bVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar.f(str) ? 32 : 16;
        }
        int i25 = i12 & 4;
        if (i25 == 0) {
            if ((i11 & 384) == 0) {
                rVar2 = rVar;
                i13 |= sVar.f(rVar2) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    eVar2 = eVar;
                    if (sVar.f(eVar2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    if ((i11 & 24576) == 0) {
                        if (sVar.f(jVar)) {
                            i17 = 16384;
                        } else {
                            i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 32;
                    if (i18 != 0) {
                        if ((196608 & i11) == 0) {
                            f11 = f5;
                            if (sVar.c(f11)) {
                                i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                            } else {
                                i19 = 65536;
                            }
                            i13 |= i19;
                        }
                        i21 = i12 & 64;
                        if (i21 != 0) {
                            if ((1572864 & i11) == 0) {
                                if (sVar.f(pVar)) {
                                    i22 = 1048576;
                                } else {
                                    i22 = 524288;
                                }
                                i13 |= i22;
                            }
                            i23 = i13;
                            if ((i13 & 599187) != 599186) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (sVar.T(i23 & 1, z11)) {
                                rVarB = z1.o.f58481a;
                                if (i25 != 0) {
                                    rVar2 = rVarB;
                                }
                                if (i14 != 0) {
                                    eVar4 = z1.c.f58467e;
                                } else {
                                    eVar4 = eVar2;
                                }
                                if (i16 != 0) {
                                    jVar3 = w2.i.f54515b;
                                    i24 = i18;
                                } else {
                                    i24 = i18;
                                    jVar3 = jVar;
                                }
                                if (i24 != 0) {
                                    f11 = 1.0f;
                                }
                                if (i21 != 0) {
                                    pVar3 = null;
                                } else {
                                    pVar3 = pVar;
                                }
                                gVar = l1.m.f39353a;
                                if (str != null) {
                                    sVar.d0(1899234820);
                                    if ((i23 & 112) == 32) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    objQ2 = sVar.Q();
                                    if (z12 || objQ2 == gVar) {
                                        objQ2 = new au.f(str, 26);
                                        sVar.o0(objQ2);
                                    }
                                    rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                                    sVar.p(false);
                                } else {
                                    sVar.d0(1899393602);
                                    sVar.p(false);
                                }
                                z1.r rVarG = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                                objQ = sVar.Q();
                                if (objQ == gVar) {
                                    objQ = y0.f22842a;
                                    sVar.o0(objQ);
                                }
                                w2.q0 q0Var = (w2.q0) objQ;
                                iHashCode = Long.hashCode(sVar.T);
                                z1.r rVarC = z1.a.c(sVar, rVarG);
                                l1.q1 q1VarL = sVar.l();
                                y2.k.J.getClass();
                                iVar = y2.j.f56913b;
                                sVar.h0();
                                if (sVar.S) {
                                    sVar.k(iVar);
                                } else {
                                    sVar.r0();
                                }
                                l1.t.J(y2.j.f56917f, q0Var, sVar);
                                l1.t.J(y2.j.f56916e, q1VarL, sVar);
                                l1.t.J(y2.j.f56915d, rVarC, sVar);
                                hVar = y2.j.f56918g;
                                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                }
                                sVar.p(true);
                                rVar3 = rVar2;
                                eVar3 = eVar4;
                                jVar2 = jVar3;
                                pVar2 = pVar3;
                            } else {
                                sVar.W();
                                rVar3 = rVar2;
                                eVar3 = eVar2;
                                jVar2 = jVar;
                                pVar2 = pVar;
                            }
                            f12 = f11;
                            x1VarT = sVar.t();
                            if (x1VarT != null) {
                                x1VarT.f39502d = new fz.e() { // from class: d0.x0
                                    @Override // fz.e
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                        return qy.b0.f48488a;
                                    }
                                };
                            }
                        }
                        i13 |= 1572864;
                        i23 = i13;
                        if ((i13 & 599187) != 599186) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (sVar.T(i23 & 1, z11)) {
                            rVarB = z1.o.f58481a;
                            if (i25 != 0) {
                                rVar2 = rVarB;
                            }
                            if (i14 != 0) {
                                eVar4 = z1.c.f58467e;
                            } else {
                                eVar4 = eVar2;
                            }
                            if (i16 != 0) {
                                jVar3 = w2.i.f54515b;
                                i24 = i18;
                            } else {
                                i24 = i18;
                                jVar3 = jVar;
                            }
                            if (i24 != 0) {
                                f11 = 1.0f;
                            }
                            if (i21 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            gVar = l1.m.f39353a;
                            if (str != null) {
                                sVar.d0(1899234820);
                                if ((i23 & 112) == 32) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                objQ2 = sVar.Q();
                                if (z12) {
                                    objQ2 = new au.f(str, 26);
                                    sVar.o0(objQ2);
                                } else {
                                    objQ2 = new au.f(str, 26);
                                    sVar.o0(objQ2);
                                }
                                rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                                sVar.p(false);
                            } else {
                                sVar.d0(1899393602);
                                sVar.p(false);
                            }
                            z1.r rVarG2 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                            objQ = sVar.Q();
                            if (objQ == gVar) {
                                objQ = y0.f22842a;
                                sVar.o0(objQ);
                            }
                            w2.q0 q0Var2 = (w2.q0) objQ;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC2 = z1.a.c(sVar, rVarG2);
                            l1.q1 q1VarL2 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, q0Var2, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                            l1.t.J(y2.j.f56915d, rVarC2, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar3 = rVar2;
                            eVar3 = eVar4;
                            jVar2 = jVar3;
                            pVar2 = pVar3;
                        } else {
                            sVar.W();
                            rVar3 = rVar2;
                            eVar3 = eVar2;
                            jVar2 = jVar;
                            pVar2 = pVar;
                        }
                        f12 = f11;
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            x1VarT.f39502d = new fz.e() { // from class: d0.x0
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i13 |= 196608;
                    f11 = f5;
                    i21 = i12 & 64;
                    if (i21 != 0) {
                        if ((1572864 & i11) == 0) {
                            if (sVar.f(pVar)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i13 |= i22;
                        }
                        i23 = i13;
                        if ((i13 & 599187) != 599186) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (sVar.T(i23 & 1, z11)) {
                            rVarB = z1.o.f58481a;
                            if (i25 != 0) {
                                rVar2 = rVarB;
                            }
                            if (i14 != 0) {
                                eVar4 = z1.c.f58467e;
                            } else {
                                eVar4 = eVar2;
                            }
                            if (i16 != 0) {
                                jVar3 = w2.i.f54515b;
                                i24 = i18;
                            } else {
                                i24 = i18;
                                jVar3 = jVar;
                            }
                            if (i24 != 0) {
                                f11 = 1.0f;
                            }
                            if (i21 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            gVar = l1.m.f39353a;
                            if (str != null) {
                                sVar.d0(1899234820);
                                if ((i23 & 112) == 32) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                objQ2 = sVar.Q();
                                if (z12) {
                                    objQ2 = new au.f(str, 26);
                                    sVar.o0(objQ2);
                                } else {
                                    objQ2 = new au.f(str, 26);
                                    sVar.o0(objQ2);
                                }
                                rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                                sVar.p(false);
                            } else {
                                sVar.d0(1899393602);
                                sVar.p(false);
                            }
                            z1.r rVarG3 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                            objQ = sVar.Q();
                            if (objQ == gVar) {
                                objQ = y0.f22842a;
                                sVar.o0(objQ);
                            }
                            w2.q0 q0Var3 = (w2.q0) objQ;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC3 = z1.a.c(sVar, rVarG3);
                            l1.q1 q1VarL3 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, q0Var3, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL3, sVar);
                            l1.t.J(y2.j.f56915d, rVarC3, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar3 = rVar2;
                            eVar3 = eVar4;
                            jVar2 = jVar3;
                            pVar2 = pVar3;
                        } else {
                            sVar.W();
                            rVar3 = rVar2;
                            eVar3 = eVar2;
                            jVar2 = jVar;
                            pVar2 = pVar;
                        }
                        f12 = f11;
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            x1VarT.f39502d = new fz.e() { // from class: d0.x0
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i13 |= 1572864;
                    i23 = i13;
                    if ((i13 & 599187) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i23 & 1, z11)) {
                        rVarB = z1.o.f58481a;
                        if (i25 != 0) {
                            rVar2 = rVarB;
                        }
                        if (i14 != 0) {
                            eVar4 = z1.c.f58467e;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (i16 != 0) {
                            jVar3 = w2.i.f54515b;
                            i24 = i18;
                        } else {
                            i24 = i18;
                            jVar3 = jVar;
                        }
                        if (i24 != 0) {
                            f11 = 1.0f;
                        }
                        if (i21 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        gVar = l1.m.f39353a;
                        if (str != null) {
                            sVar.d0(1899234820);
                            if ((i23 & 112) == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objQ2 = sVar.Q();
                            if (z12) {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            } else {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            }
                            rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                            sVar.p(false);
                        } else {
                            sVar.d0(1899393602);
                            sVar.p(false);
                        }
                        z1.r rVarG4 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                        objQ = sVar.Q();
                        if (objQ == gVar) {
                            objQ = y0.f22842a;
                            sVar.o0(objQ);
                        }
                        w2.q0 q0Var4 = (w2.q0) objQ;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC4 = z1.a.c(sVar, rVarG4);
                        l1.q1 q1VarL4 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0Var4, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL4, sVar);
                        l1.t.J(y2.j.f56915d, rVarC4, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar3 = rVar2;
                        eVar3 = eVar4;
                        jVar2 = jVar3;
                        pVar2 = pVar3;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        eVar3 = eVar2;
                        jVar2 = jVar;
                        pVar2 = pVar;
                    }
                    f12 = f11;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: d0.x0
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i13 |= 24576;
                i18 = i12 & 32;
                if (i18 != 0) {
                    if ((196608 & i11) == 0) {
                        f11 = f5;
                        if (sVar.c(f11)) {
                            i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    i21 = i12 & 64;
                    if (i21 != 0) {
                        if ((1572864 & i11) == 0) {
                            if (sVar.f(pVar)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i13 |= i22;
                        }
                        i23 = i13;
                        if ((i13 & 599187) != 599186) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (sVar.T(i23 & 1, z11)) {
                            rVarB = z1.o.f58481a;
                            if (i25 != 0) {
                                rVar2 = rVarB;
                            }
                            if (i14 != 0) {
                                eVar4 = z1.c.f58467e;
                            } else {
                                eVar4 = eVar2;
                            }
                            if (i16 != 0) {
                                jVar3 = w2.i.f54515b;
                                i24 = i18;
                            } else {
                                i24 = i18;
                                jVar3 = jVar;
                            }
                            if (i24 != 0) {
                                f11 = 1.0f;
                            }
                            if (i21 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            gVar = l1.m.f39353a;
                            if (str != null) {
                                sVar.d0(1899234820);
                                if ((i23 & 112) == 32) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                objQ2 = sVar.Q();
                                if (z12) {
                                    objQ2 = new au.f(str, 26);
                                    sVar.o0(objQ2);
                                } else {
                                    objQ2 = new au.f(str, 26);
                                    sVar.o0(objQ2);
                                }
                                rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                                sVar.p(false);
                            } else {
                                sVar.d0(1899393602);
                                sVar.p(false);
                            }
                            z1.r rVarG5 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                            objQ = sVar.Q();
                            if (objQ == gVar) {
                                objQ = y0.f22842a;
                                sVar.o0(objQ);
                            }
                            w2.q0 q0Var5 = (w2.q0) objQ;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC5 = z1.a.c(sVar, rVarG5);
                            l1.q1 q1VarL5 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, q0Var5, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL5, sVar);
                            l1.t.J(y2.j.f56915d, rVarC5, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar3 = rVar2;
                            eVar3 = eVar4;
                            jVar2 = jVar3;
                            pVar2 = pVar3;
                        } else {
                            sVar.W();
                            rVar3 = rVar2;
                            eVar3 = eVar2;
                            jVar2 = jVar;
                            pVar2 = pVar;
                        }
                        f12 = f11;
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            x1VarT.f39502d = new fz.e() { // from class: d0.x0
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i13 |= 1572864;
                    i23 = i13;
                    if ((i13 & 599187) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i23 & 1, z11)) {
                        rVarB = z1.o.f58481a;
                        if (i25 != 0) {
                            rVar2 = rVarB;
                        }
                        if (i14 != 0) {
                            eVar4 = z1.c.f58467e;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (i16 != 0) {
                            jVar3 = w2.i.f54515b;
                            i24 = i18;
                        } else {
                            i24 = i18;
                            jVar3 = jVar;
                        }
                        if (i24 != 0) {
                            f11 = 1.0f;
                        }
                        if (i21 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        gVar = l1.m.f39353a;
                        if (str != null) {
                            sVar.d0(1899234820);
                            if ((i23 & 112) == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objQ2 = sVar.Q();
                            if (z12) {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            } else {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            }
                            rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                            sVar.p(false);
                        } else {
                            sVar.d0(1899393602);
                            sVar.p(false);
                        }
                        z1.r rVarG6 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                        objQ = sVar.Q();
                        if (objQ == gVar) {
                            objQ = y0.f22842a;
                            sVar.o0(objQ);
                        }
                        w2.q0 q0Var6 = (w2.q0) objQ;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC6 = z1.a.c(sVar, rVarG6);
                        l1.q1 q1VarL6 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0Var6, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL6, sVar);
                        l1.t.J(y2.j.f56915d, rVarC6, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar3 = rVar2;
                        eVar3 = eVar4;
                        jVar2 = jVar3;
                        pVar2 = pVar3;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        eVar3 = eVar2;
                        jVar2 = jVar;
                        pVar2 = pVar;
                    }
                    f12 = f11;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: d0.x0
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i13 |= 196608;
                f11 = f5;
                i21 = i12 & 64;
                if (i21 != 0) {
                    if ((1572864 & i11) == 0) {
                        if (sVar.f(pVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i13 |= i22;
                    }
                    i23 = i13;
                    if ((i13 & 599187) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i23 & 1, z11)) {
                        rVarB = z1.o.f58481a;
                        if (i25 != 0) {
                            rVar2 = rVarB;
                        }
                        if (i14 != 0) {
                            eVar4 = z1.c.f58467e;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (i16 != 0) {
                            jVar3 = w2.i.f54515b;
                            i24 = i18;
                        } else {
                            i24 = i18;
                            jVar3 = jVar;
                        }
                        if (i24 != 0) {
                            f11 = 1.0f;
                        }
                        if (i21 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        gVar = l1.m.f39353a;
                        if (str != null) {
                            sVar.d0(1899234820);
                            if ((i23 & 112) == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objQ2 = sVar.Q();
                            if (z12) {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            } else {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            }
                            rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                            sVar.p(false);
                        } else {
                            sVar.d0(1899393602);
                            sVar.p(false);
                        }
                        z1.r rVarG7 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                        objQ = sVar.Q();
                        if (objQ == gVar) {
                            objQ = y0.f22842a;
                            sVar.o0(objQ);
                        }
                        w2.q0 q0Var7 = (w2.q0) objQ;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC7 = z1.a.c(sVar, rVarG7);
                        l1.q1 q1VarL7 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0Var7, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL7, sVar);
                        l1.t.J(y2.j.f56915d, rVarC7, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar3 = rVar2;
                        eVar3 = eVar4;
                        jVar2 = jVar3;
                        pVar2 = pVar3;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        eVar3 = eVar2;
                        jVar2 = jVar;
                        pVar2 = pVar;
                    }
                    f12 = f11;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: d0.x0
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i13 |= 1572864;
                i23 = i13;
                if ((i13 & 599187) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i23 & 1, z11)) {
                    rVarB = z1.o.f58481a;
                    if (i25 != 0) {
                        rVar2 = rVarB;
                    }
                    if (i14 != 0) {
                        eVar4 = z1.c.f58467e;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (i16 != 0) {
                        jVar3 = w2.i.f54515b;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        jVar3 = jVar;
                    }
                    if (i24 != 0) {
                        f11 = 1.0f;
                    }
                    if (i21 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    gVar = l1.m.f39353a;
                    if (str != null) {
                        sVar.d0(1899234820);
                        if ((i23 & 112) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objQ2 = sVar.Q();
                        if (z12) {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        }
                        rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                        sVar.p(false);
                    } else {
                        sVar.d0(1899393602);
                        sVar.p(false);
                    }
                    z1.r rVarG8 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                    objQ = sVar.Q();
                    if (objQ == gVar) {
                        objQ = y0.f22842a;
                        sVar.o0(objQ);
                    }
                    w2.q0 q0Var8 = (w2.q0) objQ;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC8 = z1.a.c(sVar, rVarG8);
                    l1.q1 q1VarL8 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0Var8, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL8, sVar);
                    l1.t.J(y2.j.f56915d, rVarC8, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar3 = rVar2;
                    eVar3 = eVar4;
                    jVar2 = jVar3;
                    pVar2 = pVar3;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    eVar3 = eVar2;
                    jVar2 = jVar;
                    pVar2 = pVar;
                }
                f12 = f11;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: d0.x0
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i13 |= 3072;
            eVar2 = eVar;
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    if (sVar.f(jVar)) {
                        i17 = 16384;
                    } else {
                        i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    if ((196608 & i11) == 0) {
                        f11 = f5;
                        if (sVar.c(f11)) {
                            i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    i21 = i12 & 64;
                    if (i21 != 0) {
                        if ((1572864 & i11) == 0) {
                            if (sVar.f(pVar)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i13 |= i22;
                        }
                        i23 = i13;
                        if ((i13 & 599187) != 599186) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (sVar.T(i23 & 1, z11)) {
                            rVarB = z1.o.f58481a;
                            if (i25 != 0) {
                                rVar2 = rVarB;
                            }
                            if (i14 != 0) {
                                eVar4 = z1.c.f58467e;
                            } else {
                                eVar4 = eVar2;
                            }
                            if (i16 != 0) {
                                jVar3 = w2.i.f54515b;
                                i24 = i18;
                            } else {
                                i24 = i18;
                                jVar3 = jVar;
                            }
                            if (i24 != 0) {
                                f11 = 1.0f;
                            }
                            if (i21 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            gVar = l1.m.f39353a;
                            if (str != null) {
                                sVar.d0(1899234820);
                                if ((i23 & 112) == 32) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                objQ2 = sVar.Q();
                                if (z12) {
                                    objQ2 = new au.f(str, 26);
                                    sVar.o0(objQ2);
                                } else {
                                    objQ2 = new au.f(str, 26);
                                    sVar.o0(objQ2);
                                }
                                rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                                sVar.p(false);
                            } else {
                                sVar.d0(1899393602);
                                sVar.p(false);
                            }
                            z1.r rVarG9 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                            objQ = sVar.Q();
                            if (objQ == gVar) {
                                objQ = y0.f22842a;
                                sVar.o0(objQ);
                            }
                            w2.q0 q0Var9 = (w2.q0) objQ;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC9 = z1.a.c(sVar, rVarG9);
                            l1.q1 q1VarL9 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, q0Var9, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL9, sVar);
                            l1.t.J(y2.j.f56915d, rVarC9, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar3 = rVar2;
                            eVar3 = eVar4;
                            jVar2 = jVar3;
                            pVar2 = pVar3;
                        } else {
                            sVar.W();
                            rVar3 = rVar2;
                            eVar3 = eVar2;
                            jVar2 = jVar;
                            pVar2 = pVar;
                        }
                        f12 = f11;
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            x1VarT.f39502d = new fz.e() { // from class: d0.x0
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i13 |= 1572864;
                    i23 = i13;
                    if ((i13 & 599187) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i23 & 1, z11)) {
                        rVarB = z1.o.f58481a;
                        if (i25 != 0) {
                            rVar2 = rVarB;
                        }
                        if (i14 != 0) {
                            eVar4 = z1.c.f58467e;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (i16 != 0) {
                            jVar3 = w2.i.f54515b;
                            i24 = i18;
                        } else {
                            i24 = i18;
                            jVar3 = jVar;
                        }
                        if (i24 != 0) {
                            f11 = 1.0f;
                        }
                        if (i21 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        gVar = l1.m.f39353a;
                        if (str != null) {
                            sVar.d0(1899234820);
                            if ((i23 & 112) == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objQ2 = sVar.Q();
                            if (z12) {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            } else {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            }
                            rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                            sVar.p(false);
                        } else {
                            sVar.d0(1899393602);
                            sVar.p(false);
                        }
                        z1.r rVarG10 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                        objQ = sVar.Q();
                        if (objQ == gVar) {
                            objQ = y0.f22842a;
                            sVar.o0(objQ);
                        }
                        w2.q0 q0Var10 = (w2.q0) objQ;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC10 = z1.a.c(sVar, rVarG10);
                        l1.q1 q1VarL10 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0Var10, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL10, sVar);
                        l1.t.J(y2.j.f56915d, rVarC10, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar3 = rVar2;
                        eVar3 = eVar4;
                        jVar2 = jVar3;
                        pVar2 = pVar3;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        eVar3 = eVar2;
                        jVar2 = jVar;
                        pVar2 = pVar;
                    }
                    f12 = f11;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: d0.x0
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i13 |= 196608;
                f11 = f5;
                i21 = i12 & 64;
                if (i21 != 0) {
                    if ((1572864 & i11) == 0) {
                        if (sVar.f(pVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i13 |= i22;
                    }
                    i23 = i13;
                    if ((i13 & 599187) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i23 & 1, z11)) {
                        rVarB = z1.o.f58481a;
                        if (i25 != 0) {
                            rVar2 = rVarB;
                        }
                        if (i14 != 0) {
                            eVar4 = z1.c.f58467e;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (i16 != 0) {
                            jVar3 = w2.i.f54515b;
                            i24 = i18;
                        } else {
                            i24 = i18;
                            jVar3 = jVar;
                        }
                        if (i24 != 0) {
                            f11 = 1.0f;
                        }
                        if (i21 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        gVar = l1.m.f39353a;
                        if (str != null) {
                            sVar.d0(1899234820);
                            if ((i23 & 112) == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objQ2 = sVar.Q();
                            if (z12) {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            } else {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            }
                            rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                            sVar.p(false);
                        } else {
                            sVar.d0(1899393602);
                            sVar.p(false);
                        }
                        z1.r rVarG11 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                        objQ = sVar.Q();
                        if (objQ == gVar) {
                            objQ = y0.f22842a;
                            sVar.o0(objQ);
                        }
                        w2.q0 q0Var11 = (w2.q0) objQ;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC11 = z1.a.c(sVar, rVarG11);
                        l1.q1 q1VarL11 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0Var11, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL11, sVar);
                        l1.t.J(y2.j.f56915d, rVarC11, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar3 = rVar2;
                        eVar3 = eVar4;
                        jVar2 = jVar3;
                        pVar2 = pVar3;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        eVar3 = eVar2;
                        jVar2 = jVar;
                        pVar2 = pVar;
                    }
                    f12 = f11;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: d0.x0
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i13 |= 1572864;
                i23 = i13;
                if ((i13 & 599187) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i23 & 1, z11)) {
                    rVarB = z1.o.f58481a;
                    if (i25 != 0) {
                        rVar2 = rVarB;
                    }
                    if (i14 != 0) {
                        eVar4 = z1.c.f58467e;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (i16 != 0) {
                        jVar3 = w2.i.f54515b;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        jVar3 = jVar;
                    }
                    if (i24 != 0) {
                        f11 = 1.0f;
                    }
                    if (i21 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    gVar = l1.m.f39353a;
                    if (str != null) {
                        sVar.d0(1899234820);
                        if ((i23 & 112) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objQ2 = sVar.Q();
                        if (z12) {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        }
                        rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                        sVar.p(false);
                    } else {
                        sVar.d0(1899393602);
                        sVar.p(false);
                    }
                    z1.r rVarG12 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                    objQ = sVar.Q();
                    if (objQ == gVar) {
                        objQ = y0.f22842a;
                        sVar.o0(objQ);
                    }
                    w2.q0 q0Var12 = (w2.q0) objQ;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC12 = z1.a.c(sVar, rVarG12);
                    l1.q1 q1VarL12 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0Var12, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL12, sVar);
                    l1.t.J(y2.j.f56915d, rVarC12, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar3 = rVar2;
                    eVar3 = eVar4;
                    jVar2 = jVar3;
                    pVar2 = pVar3;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    eVar3 = eVar2;
                    jVar2 = jVar;
                    pVar2 = pVar;
                }
                f12 = f11;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: d0.x0
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i13 |= 24576;
            i18 = i12 & 32;
            if (i18 != 0) {
                if ((196608 & i11) == 0) {
                    f11 = f5;
                    if (sVar.c(f11)) {
                        i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                i21 = i12 & 64;
                if (i21 != 0) {
                    if ((1572864 & i11) == 0) {
                        if (sVar.f(pVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i13 |= i22;
                    }
                    i23 = i13;
                    if ((i13 & 599187) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i23 & 1, z11)) {
                        rVarB = z1.o.f58481a;
                        if (i25 != 0) {
                            rVar2 = rVarB;
                        }
                        if (i14 != 0) {
                            eVar4 = z1.c.f58467e;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (i16 != 0) {
                            jVar3 = w2.i.f54515b;
                            i24 = i18;
                        } else {
                            i24 = i18;
                            jVar3 = jVar;
                        }
                        if (i24 != 0) {
                            f11 = 1.0f;
                        }
                        if (i21 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        gVar = l1.m.f39353a;
                        if (str != null) {
                            sVar.d0(1899234820);
                            if ((i23 & 112) == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objQ2 = sVar.Q();
                            if (z12) {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            } else {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            }
                            rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                            sVar.p(false);
                        } else {
                            sVar.d0(1899393602);
                            sVar.p(false);
                        }
                        z1.r rVarG13 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                        objQ = sVar.Q();
                        if (objQ == gVar) {
                            objQ = y0.f22842a;
                            sVar.o0(objQ);
                        }
                        w2.q0 q0Var13 = (w2.q0) objQ;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC13 = z1.a.c(sVar, rVarG13);
                        l1.q1 q1VarL13 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0Var13, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL13, sVar);
                        l1.t.J(y2.j.f56915d, rVarC13, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar3 = rVar2;
                        eVar3 = eVar4;
                        jVar2 = jVar3;
                        pVar2 = pVar3;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        eVar3 = eVar2;
                        jVar2 = jVar;
                        pVar2 = pVar;
                    }
                    f12 = f11;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: d0.x0
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i13 |= 1572864;
                i23 = i13;
                if ((i13 & 599187) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i23 & 1, z11)) {
                    rVarB = z1.o.f58481a;
                    if (i25 != 0) {
                        rVar2 = rVarB;
                    }
                    if (i14 != 0) {
                        eVar4 = z1.c.f58467e;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (i16 != 0) {
                        jVar3 = w2.i.f54515b;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        jVar3 = jVar;
                    }
                    if (i24 != 0) {
                        f11 = 1.0f;
                    }
                    if (i21 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    gVar = l1.m.f39353a;
                    if (str != null) {
                        sVar.d0(1899234820);
                        if ((i23 & 112) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objQ2 = sVar.Q();
                        if (z12) {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        }
                        rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                        sVar.p(false);
                    } else {
                        sVar.d0(1899393602);
                        sVar.p(false);
                    }
                    z1.r rVarG14 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                    objQ = sVar.Q();
                    if (objQ == gVar) {
                        objQ = y0.f22842a;
                        sVar.o0(objQ);
                    }
                    w2.q0 q0Var14 = (w2.q0) objQ;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC14 = z1.a.c(sVar, rVarG14);
                    l1.q1 q1VarL14 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0Var14, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL14, sVar);
                    l1.t.J(y2.j.f56915d, rVarC14, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar3 = rVar2;
                    eVar3 = eVar4;
                    jVar2 = jVar3;
                    pVar2 = pVar3;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    eVar3 = eVar2;
                    jVar2 = jVar;
                    pVar2 = pVar;
                }
                f12 = f11;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: d0.x0
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i13 |= 196608;
            f11 = f5;
            i21 = i12 & 64;
            if (i21 != 0) {
                if ((1572864 & i11) == 0) {
                    if (sVar.f(pVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i13 |= i22;
                }
                i23 = i13;
                if ((i13 & 599187) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i23 & 1, z11)) {
                    rVarB = z1.o.f58481a;
                    if (i25 != 0) {
                        rVar2 = rVarB;
                    }
                    if (i14 != 0) {
                        eVar4 = z1.c.f58467e;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (i16 != 0) {
                        jVar3 = w2.i.f54515b;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        jVar3 = jVar;
                    }
                    if (i24 != 0) {
                        f11 = 1.0f;
                    }
                    if (i21 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    gVar = l1.m.f39353a;
                    if (str != null) {
                        sVar.d0(1899234820);
                        if ((i23 & 112) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objQ2 = sVar.Q();
                        if (z12) {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        }
                        rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                        sVar.p(false);
                    } else {
                        sVar.d0(1899393602);
                        sVar.p(false);
                    }
                    z1.r rVarG15 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                    objQ = sVar.Q();
                    if (objQ == gVar) {
                        objQ = y0.f22842a;
                        sVar.o0(objQ);
                    }
                    w2.q0 q0Var15 = (w2.q0) objQ;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC15 = z1.a.c(sVar, rVarG15);
                    l1.q1 q1VarL15 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0Var15, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL15, sVar);
                    l1.t.J(y2.j.f56915d, rVarC15, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar3 = rVar2;
                    eVar3 = eVar4;
                    jVar2 = jVar3;
                    pVar2 = pVar3;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    eVar3 = eVar2;
                    jVar2 = jVar;
                    pVar2 = pVar;
                }
                f12 = f11;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: d0.x0
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i13 |= 1572864;
            i23 = i13;
            if ((i13 & 599187) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i23 & 1, z11)) {
                rVarB = z1.o.f58481a;
                if (i25 != 0) {
                    rVar2 = rVarB;
                }
                if (i14 != 0) {
                    eVar4 = z1.c.f58467e;
                } else {
                    eVar4 = eVar2;
                }
                if (i16 != 0) {
                    jVar3 = w2.i.f54515b;
                    i24 = i18;
                } else {
                    i24 = i18;
                    jVar3 = jVar;
                }
                if (i24 != 0) {
                    f11 = 1.0f;
                }
                if (i21 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                gVar = l1.m.f39353a;
                if (str != null) {
                    sVar.d0(1899234820);
                    if ((i23 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objQ2 = sVar.Q();
                    if (z12) {
                        objQ2 = new au.f(str, 26);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new au.f(str, 26);
                        sVar.o0(objQ2);
                    }
                    rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                    sVar.p(false);
                } else {
                    sVar.d0(1899393602);
                    sVar.p(false);
                }
                z1.r rVarG16 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                objQ = sVar.Q();
                if (objQ == gVar) {
                    objQ = y0.f22842a;
                    sVar.o0(objQ);
                }
                w2.q0 q0Var16 = (w2.q0) objQ;
                iHashCode = Long.hashCode(sVar.T);
                z1.r rVarC16 = z1.a.c(sVar, rVarG16);
                l1.q1 q1VarL16 = sVar.l();
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0Var16, sVar);
                l1.t.J(y2.j.f56916e, q1VarL16, sVar);
                l1.t.J(y2.j.f56915d, rVarC16, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                sVar.p(true);
                rVar3 = rVar2;
                eVar3 = eVar4;
                jVar2 = jVar3;
                pVar2 = pVar3;
            } else {
                sVar.W();
                rVar3 = rVar2;
                eVar3 = eVar2;
                jVar2 = jVar;
                pVar2 = pVar;
            }
            f12 = f11;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: d0.x0
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i13 |= 384;
        rVar2 = rVar;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                eVar2 = eVar;
                if (sVar.f(eVar2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    if (sVar.f(jVar)) {
                        i17 = 16384;
                    } else {
                        i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    if ((196608 & i11) == 0) {
                        f11 = f5;
                        if (sVar.c(f11)) {
                            i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    i21 = i12 & 64;
                    if (i21 != 0) {
                        if ((1572864 & i11) == 0) {
                            if (sVar.f(pVar)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i13 |= i22;
                        }
                        i23 = i13;
                        if ((i13 & 599187) != 599186) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (sVar.T(i23 & 1, z11)) {
                            rVarB = z1.o.f58481a;
                            if (i25 != 0) {
                                rVar2 = rVarB;
                            }
                            if (i14 != 0) {
                                eVar4 = z1.c.f58467e;
                            } else {
                                eVar4 = eVar2;
                            }
                            if (i16 != 0) {
                                jVar3 = w2.i.f54515b;
                                i24 = i18;
                            } else {
                                i24 = i18;
                                jVar3 = jVar;
                            }
                            if (i24 != 0) {
                                f11 = 1.0f;
                            }
                            if (i21 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            gVar = l1.m.f39353a;
                            if (str != null) {
                                sVar.d0(1899234820);
                                if ((i23 & 112) == 32) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                objQ2 = sVar.Q();
                                if (z12) {
                                    objQ2 = new au.f(str, 26);
                                    sVar.o0(objQ2);
                                } else {
                                    objQ2 = new au.f(str, 26);
                                    sVar.o0(objQ2);
                                }
                                rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                                sVar.p(false);
                            } else {
                                sVar.d0(1899393602);
                                sVar.p(false);
                            }
                            z1.r rVarG17 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                            objQ = sVar.Q();
                            if (objQ == gVar) {
                                objQ = y0.f22842a;
                                sVar.o0(objQ);
                            }
                            w2.q0 q0Var17 = (w2.q0) objQ;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC17 = z1.a.c(sVar, rVarG17);
                            l1.q1 q1VarL17 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, q0Var17, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL17, sVar);
                            l1.t.J(y2.j.f56915d, rVarC17, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar3 = rVar2;
                            eVar3 = eVar4;
                            jVar2 = jVar3;
                            pVar2 = pVar3;
                        } else {
                            sVar.W();
                            rVar3 = rVar2;
                            eVar3 = eVar2;
                            jVar2 = jVar;
                            pVar2 = pVar;
                        }
                        f12 = f11;
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            x1VarT.f39502d = new fz.e() { // from class: d0.x0
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i13 |= 1572864;
                    i23 = i13;
                    if ((i13 & 599187) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i23 & 1, z11)) {
                        rVarB = z1.o.f58481a;
                        if (i25 != 0) {
                            rVar2 = rVarB;
                        }
                        if (i14 != 0) {
                            eVar4 = z1.c.f58467e;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (i16 != 0) {
                            jVar3 = w2.i.f54515b;
                            i24 = i18;
                        } else {
                            i24 = i18;
                            jVar3 = jVar;
                        }
                        if (i24 != 0) {
                            f11 = 1.0f;
                        }
                        if (i21 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        gVar = l1.m.f39353a;
                        if (str != null) {
                            sVar.d0(1899234820);
                            if ((i23 & 112) == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objQ2 = sVar.Q();
                            if (z12) {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            } else {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            }
                            rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                            sVar.p(false);
                        } else {
                            sVar.d0(1899393602);
                            sVar.p(false);
                        }
                        z1.r rVarG18 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                        objQ = sVar.Q();
                        if (objQ == gVar) {
                            objQ = y0.f22842a;
                            sVar.o0(objQ);
                        }
                        w2.q0 q0Var18 = (w2.q0) objQ;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC18 = z1.a.c(sVar, rVarG18);
                        l1.q1 q1VarL18 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0Var18, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL18, sVar);
                        l1.t.J(y2.j.f56915d, rVarC18, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar3 = rVar2;
                        eVar3 = eVar4;
                        jVar2 = jVar3;
                        pVar2 = pVar3;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        eVar3 = eVar2;
                        jVar2 = jVar;
                        pVar2 = pVar;
                    }
                    f12 = f11;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: d0.x0
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i13 |= 196608;
                f11 = f5;
                i21 = i12 & 64;
                if (i21 != 0) {
                    if ((1572864 & i11) == 0) {
                        if (sVar.f(pVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i13 |= i22;
                    }
                    i23 = i13;
                    if ((i13 & 599187) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i23 & 1, z11)) {
                        rVarB = z1.o.f58481a;
                        if (i25 != 0) {
                            rVar2 = rVarB;
                        }
                        if (i14 != 0) {
                            eVar4 = z1.c.f58467e;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (i16 != 0) {
                            jVar3 = w2.i.f54515b;
                            i24 = i18;
                        } else {
                            i24 = i18;
                            jVar3 = jVar;
                        }
                        if (i24 != 0) {
                            f11 = 1.0f;
                        }
                        if (i21 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        gVar = l1.m.f39353a;
                        if (str != null) {
                            sVar.d0(1899234820);
                            if ((i23 & 112) == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objQ2 = sVar.Q();
                            if (z12) {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            } else {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            }
                            rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                            sVar.p(false);
                        } else {
                            sVar.d0(1899393602);
                            sVar.p(false);
                        }
                        z1.r rVarG19 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                        objQ = sVar.Q();
                        if (objQ == gVar) {
                            objQ = y0.f22842a;
                            sVar.o0(objQ);
                        }
                        w2.q0 q0Var19 = (w2.q0) objQ;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC19 = z1.a.c(sVar, rVarG19);
                        l1.q1 q1VarL19 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0Var19, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL19, sVar);
                        l1.t.J(y2.j.f56915d, rVarC19, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar3 = rVar2;
                        eVar3 = eVar4;
                        jVar2 = jVar3;
                        pVar2 = pVar3;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        eVar3 = eVar2;
                        jVar2 = jVar;
                        pVar2 = pVar;
                    }
                    f12 = f11;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: d0.x0
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i13 |= 1572864;
                i23 = i13;
                if ((i13 & 599187) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i23 & 1, z11)) {
                    rVarB = z1.o.f58481a;
                    if (i25 != 0) {
                        rVar2 = rVarB;
                    }
                    if (i14 != 0) {
                        eVar4 = z1.c.f58467e;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (i16 != 0) {
                        jVar3 = w2.i.f54515b;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        jVar3 = jVar;
                    }
                    if (i24 != 0) {
                        f11 = 1.0f;
                    }
                    if (i21 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    gVar = l1.m.f39353a;
                    if (str != null) {
                        sVar.d0(1899234820);
                        if ((i23 & 112) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objQ2 = sVar.Q();
                        if (z12) {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        }
                        rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                        sVar.p(false);
                    } else {
                        sVar.d0(1899393602);
                        sVar.p(false);
                    }
                    z1.r rVarG110 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                    objQ = sVar.Q();
                    if (objQ == gVar) {
                        objQ = y0.f22842a;
                        sVar.o0(objQ);
                    }
                    w2.q0 q0Var110 = (w2.q0) objQ;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC110 = z1.a.c(sVar, rVarG110);
                    l1.q1 q1VarL110 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0Var110, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL110, sVar);
                    l1.t.J(y2.j.f56915d, rVarC110, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar3 = rVar2;
                    eVar3 = eVar4;
                    jVar2 = jVar3;
                    pVar2 = pVar3;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    eVar3 = eVar2;
                    jVar2 = jVar;
                    pVar2 = pVar;
                }
                f12 = f11;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: d0.x0
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i13 |= 24576;
            i18 = i12 & 32;
            if (i18 != 0) {
                if ((196608 & i11) == 0) {
                    f11 = f5;
                    if (sVar.c(f11)) {
                        i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                i21 = i12 & 64;
                if (i21 != 0) {
                    if ((1572864 & i11) == 0) {
                        if (sVar.f(pVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i13 |= i22;
                    }
                    i23 = i13;
                    if ((i13 & 599187) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i23 & 1, z11)) {
                        rVarB = z1.o.f58481a;
                        if (i25 != 0) {
                            rVar2 = rVarB;
                        }
                        if (i14 != 0) {
                            eVar4 = z1.c.f58467e;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (i16 != 0) {
                            jVar3 = w2.i.f54515b;
                            i24 = i18;
                        } else {
                            i24 = i18;
                            jVar3 = jVar;
                        }
                        if (i24 != 0) {
                            f11 = 1.0f;
                        }
                        if (i21 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        gVar = l1.m.f39353a;
                        if (str != null) {
                            sVar.d0(1899234820);
                            if ((i23 & 112) == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objQ2 = sVar.Q();
                            if (z12) {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            } else {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            }
                            rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                            sVar.p(false);
                        } else {
                            sVar.d0(1899393602);
                            sVar.p(false);
                        }
                        z1.r rVarG111 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                        objQ = sVar.Q();
                        if (objQ == gVar) {
                            objQ = y0.f22842a;
                            sVar.o0(objQ);
                        }
                        w2.q0 q0Var111 = (w2.q0) objQ;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC111 = z1.a.c(sVar, rVarG111);
                        l1.q1 q1VarL111 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0Var111, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL111, sVar);
                        l1.t.J(y2.j.f56915d, rVarC111, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar3 = rVar2;
                        eVar3 = eVar4;
                        jVar2 = jVar3;
                        pVar2 = pVar3;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        eVar3 = eVar2;
                        jVar2 = jVar;
                        pVar2 = pVar;
                    }
                    f12 = f11;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: d0.x0
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i13 |= 1572864;
                i23 = i13;
                if ((i13 & 599187) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i23 & 1, z11)) {
                    rVarB = z1.o.f58481a;
                    if (i25 != 0) {
                        rVar2 = rVarB;
                    }
                    if (i14 != 0) {
                        eVar4 = z1.c.f58467e;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (i16 != 0) {
                        jVar3 = w2.i.f54515b;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        jVar3 = jVar;
                    }
                    if (i24 != 0) {
                        f11 = 1.0f;
                    }
                    if (i21 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    gVar = l1.m.f39353a;
                    if (str != null) {
                        sVar.d0(1899234820);
                        if ((i23 & 112) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objQ2 = sVar.Q();
                        if (z12) {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        }
                        rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                        sVar.p(false);
                    } else {
                        sVar.d0(1899393602);
                        sVar.p(false);
                    }
                    z1.r rVarG112 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                    objQ = sVar.Q();
                    if (objQ == gVar) {
                        objQ = y0.f22842a;
                        sVar.o0(objQ);
                    }
                    w2.q0 q0Var112 = (w2.q0) objQ;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC112 = z1.a.c(sVar, rVarG112);
                    l1.q1 q1VarL112 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0Var112, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL112, sVar);
                    l1.t.J(y2.j.f56915d, rVarC112, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar3 = rVar2;
                    eVar3 = eVar4;
                    jVar2 = jVar3;
                    pVar2 = pVar3;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    eVar3 = eVar2;
                    jVar2 = jVar;
                    pVar2 = pVar;
                }
                f12 = f11;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: d0.x0
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i13 |= 196608;
            f11 = f5;
            i21 = i12 & 64;
            if (i21 != 0) {
                if ((1572864 & i11) == 0) {
                    if (sVar.f(pVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i13 |= i22;
                }
                i23 = i13;
                if ((i13 & 599187) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i23 & 1, z11)) {
                    rVarB = z1.o.f58481a;
                    if (i25 != 0) {
                        rVar2 = rVarB;
                    }
                    if (i14 != 0) {
                        eVar4 = z1.c.f58467e;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (i16 != 0) {
                        jVar3 = w2.i.f54515b;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        jVar3 = jVar;
                    }
                    if (i24 != 0) {
                        f11 = 1.0f;
                    }
                    if (i21 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    gVar = l1.m.f39353a;
                    if (str != null) {
                        sVar.d0(1899234820);
                        if ((i23 & 112) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objQ2 = sVar.Q();
                        if (z12) {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        }
                        rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                        sVar.p(false);
                    } else {
                        sVar.d0(1899393602);
                        sVar.p(false);
                    }
                    z1.r rVarG113 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                    objQ = sVar.Q();
                    if (objQ == gVar) {
                        objQ = y0.f22842a;
                        sVar.o0(objQ);
                    }
                    w2.q0 q0Var113 = (w2.q0) objQ;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC113 = z1.a.c(sVar, rVarG113);
                    l1.q1 q1VarL113 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0Var113, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL113, sVar);
                    l1.t.J(y2.j.f56915d, rVarC113, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar3 = rVar2;
                    eVar3 = eVar4;
                    jVar2 = jVar3;
                    pVar2 = pVar3;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    eVar3 = eVar2;
                    jVar2 = jVar;
                    pVar2 = pVar;
                }
                f12 = f11;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: d0.x0
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i13 |= 1572864;
            i23 = i13;
            if ((i13 & 599187) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i23 & 1, z11)) {
                rVarB = z1.o.f58481a;
                if (i25 != 0) {
                    rVar2 = rVarB;
                }
                if (i14 != 0) {
                    eVar4 = z1.c.f58467e;
                } else {
                    eVar4 = eVar2;
                }
                if (i16 != 0) {
                    jVar3 = w2.i.f54515b;
                    i24 = i18;
                } else {
                    i24 = i18;
                    jVar3 = jVar;
                }
                if (i24 != 0) {
                    f11 = 1.0f;
                }
                if (i21 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                gVar = l1.m.f39353a;
                if (str != null) {
                    sVar.d0(1899234820);
                    if ((i23 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objQ2 = sVar.Q();
                    if (z12) {
                        objQ2 = new au.f(str, 26);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new au.f(str, 26);
                        sVar.o0(objQ2);
                    }
                    rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                    sVar.p(false);
                } else {
                    sVar.d0(1899393602);
                    sVar.p(false);
                }
                z1.r rVarG114 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                objQ = sVar.Q();
                if (objQ == gVar) {
                    objQ = y0.f22842a;
                    sVar.o0(objQ);
                }
                w2.q0 q0Var114 = (w2.q0) objQ;
                iHashCode = Long.hashCode(sVar.T);
                z1.r rVarC114 = z1.a.c(sVar, rVarG114);
                l1.q1 q1VarL114 = sVar.l();
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0Var114, sVar);
                l1.t.J(y2.j.f56916e, q1VarL114, sVar);
                l1.t.J(y2.j.f56915d, rVarC114, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                sVar.p(true);
                rVar3 = rVar2;
                eVar3 = eVar4;
                jVar2 = jVar3;
                pVar2 = pVar3;
            } else {
                sVar.W();
                rVar3 = rVar2;
                eVar3 = eVar2;
                jVar2 = jVar;
                pVar2 = pVar;
            }
            f12 = f11;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: d0.x0
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i13 |= 3072;
        eVar2 = eVar;
        i16 = i12 & 16;
        if (i16 != 0) {
            if ((i11 & 24576) == 0) {
                if (sVar.f(jVar)) {
                    i17 = 16384;
                } else {
                    i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i13 |= i17;
            }
            i18 = i12 & 32;
            if (i18 != 0) {
                if ((196608 & i11) == 0) {
                    f11 = f5;
                    if (sVar.c(f11)) {
                        i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                i21 = i12 & 64;
                if (i21 != 0) {
                    if ((1572864 & i11) == 0) {
                        if (sVar.f(pVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i13 |= i22;
                    }
                    i23 = i13;
                    if ((i13 & 599187) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i23 & 1, z11)) {
                        rVarB = z1.o.f58481a;
                        if (i25 != 0) {
                            rVar2 = rVarB;
                        }
                        if (i14 != 0) {
                            eVar4 = z1.c.f58467e;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (i16 != 0) {
                            jVar3 = w2.i.f54515b;
                            i24 = i18;
                        } else {
                            i24 = i18;
                            jVar3 = jVar;
                        }
                        if (i24 != 0) {
                            f11 = 1.0f;
                        }
                        if (i21 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        gVar = l1.m.f39353a;
                        if (str != null) {
                            sVar.d0(1899234820);
                            if ((i23 & 112) == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objQ2 = sVar.Q();
                            if (z12) {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            } else {
                                objQ2 = new au.f(str, 26);
                                sVar.o0(objQ2);
                            }
                            rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                            sVar.p(false);
                        } else {
                            sVar.d0(1899393602);
                            sVar.p(false);
                        }
                        z1.r rVarG115 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                        objQ = sVar.Q();
                        if (objQ == gVar) {
                            objQ = y0.f22842a;
                            sVar.o0(objQ);
                        }
                        w2.q0 q0Var115 = (w2.q0) objQ;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC115 = z1.a.c(sVar, rVarG115);
                        l1.q1 q1VarL115 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0Var115, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL115, sVar);
                        l1.t.J(y2.j.f56915d, rVarC115, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar3 = rVar2;
                        eVar3 = eVar4;
                        jVar2 = jVar3;
                        pVar2 = pVar3;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        eVar3 = eVar2;
                        jVar2 = jVar;
                        pVar2 = pVar;
                    }
                    f12 = f11;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: d0.x0
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i13 |= 1572864;
                i23 = i13;
                if ((i13 & 599187) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i23 & 1, z11)) {
                    rVarB = z1.o.f58481a;
                    if (i25 != 0) {
                        rVar2 = rVarB;
                    }
                    if (i14 != 0) {
                        eVar4 = z1.c.f58467e;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (i16 != 0) {
                        jVar3 = w2.i.f54515b;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        jVar3 = jVar;
                    }
                    if (i24 != 0) {
                        f11 = 1.0f;
                    }
                    if (i21 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    gVar = l1.m.f39353a;
                    if (str != null) {
                        sVar.d0(1899234820);
                        if ((i23 & 112) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objQ2 = sVar.Q();
                        if (z12) {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        }
                        rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                        sVar.p(false);
                    } else {
                        sVar.d0(1899393602);
                        sVar.p(false);
                    }
                    z1.r rVarG116 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                    objQ = sVar.Q();
                    if (objQ == gVar) {
                        objQ = y0.f22842a;
                        sVar.o0(objQ);
                    }
                    w2.q0 q0Var116 = (w2.q0) objQ;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC116 = z1.a.c(sVar, rVarG116);
                    l1.q1 q1VarL116 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0Var116, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL116, sVar);
                    l1.t.J(y2.j.f56915d, rVarC116, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar3 = rVar2;
                    eVar3 = eVar4;
                    jVar2 = jVar3;
                    pVar2 = pVar3;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    eVar3 = eVar2;
                    jVar2 = jVar;
                    pVar2 = pVar;
                }
                f12 = f11;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: d0.x0
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i13 |= 196608;
            f11 = f5;
            i21 = i12 & 64;
            if (i21 != 0) {
                if ((1572864 & i11) == 0) {
                    if (sVar.f(pVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i13 |= i22;
                }
                i23 = i13;
                if ((i13 & 599187) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i23 & 1, z11)) {
                    rVarB = z1.o.f58481a;
                    if (i25 != 0) {
                        rVar2 = rVarB;
                    }
                    if (i14 != 0) {
                        eVar4 = z1.c.f58467e;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (i16 != 0) {
                        jVar3 = w2.i.f54515b;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        jVar3 = jVar;
                    }
                    if (i24 != 0) {
                        f11 = 1.0f;
                    }
                    if (i21 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    gVar = l1.m.f39353a;
                    if (str != null) {
                        sVar.d0(1899234820);
                        if ((i23 & 112) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objQ2 = sVar.Q();
                        if (z12) {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        }
                        rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                        sVar.p(false);
                    } else {
                        sVar.d0(1899393602);
                        sVar.p(false);
                    }
                    z1.r rVarG117 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                    objQ = sVar.Q();
                    if (objQ == gVar) {
                        objQ = y0.f22842a;
                        sVar.o0(objQ);
                    }
                    w2.q0 q0Var117 = (w2.q0) objQ;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC117 = z1.a.c(sVar, rVarG117);
                    l1.q1 q1VarL117 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0Var117, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL117, sVar);
                    l1.t.J(y2.j.f56915d, rVarC117, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar3 = rVar2;
                    eVar3 = eVar4;
                    jVar2 = jVar3;
                    pVar2 = pVar3;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    eVar3 = eVar2;
                    jVar2 = jVar;
                    pVar2 = pVar;
                }
                f12 = f11;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: d0.x0
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i13 |= 1572864;
            i23 = i13;
            if ((i13 & 599187) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i23 & 1, z11)) {
                rVarB = z1.o.f58481a;
                if (i25 != 0) {
                    rVar2 = rVarB;
                }
                if (i14 != 0) {
                    eVar4 = z1.c.f58467e;
                } else {
                    eVar4 = eVar2;
                }
                if (i16 != 0) {
                    jVar3 = w2.i.f54515b;
                    i24 = i18;
                } else {
                    i24 = i18;
                    jVar3 = jVar;
                }
                if (i24 != 0) {
                    f11 = 1.0f;
                }
                if (i21 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                gVar = l1.m.f39353a;
                if (str != null) {
                    sVar.d0(1899234820);
                    if ((i23 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objQ2 = sVar.Q();
                    if (z12) {
                        objQ2 = new au.f(str, 26);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new au.f(str, 26);
                        sVar.o0(objQ2);
                    }
                    rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                    sVar.p(false);
                } else {
                    sVar.d0(1899393602);
                    sVar.p(false);
                }
                z1.r rVarG118 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                objQ = sVar.Q();
                if (objQ == gVar) {
                    objQ = y0.f22842a;
                    sVar.o0(objQ);
                }
                w2.q0 q0Var118 = (w2.q0) objQ;
                iHashCode = Long.hashCode(sVar.T);
                z1.r rVarC118 = z1.a.c(sVar, rVarG118);
                l1.q1 q1VarL118 = sVar.l();
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0Var118, sVar);
                l1.t.J(y2.j.f56916e, q1VarL118, sVar);
                l1.t.J(y2.j.f56915d, rVarC118, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                sVar.p(true);
                rVar3 = rVar2;
                eVar3 = eVar4;
                jVar2 = jVar3;
                pVar2 = pVar3;
            } else {
                sVar.W();
                rVar3 = rVar2;
                eVar3 = eVar2;
                jVar2 = jVar;
                pVar2 = pVar;
            }
            f12 = f11;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: d0.x0
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i13 |= 24576;
        i18 = i12 & 32;
        if (i18 != 0) {
            if ((196608 & i11) == 0) {
                f11 = f5;
                if (sVar.c(f11)) {
                    i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            i21 = i12 & 64;
            if (i21 != 0) {
                if ((1572864 & i11) == 0) {
                    if (sVar.f(pVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i13 |= i22;
                }
                i23 = i13;
                if ((i13 & 599187) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i23 & 1, z11)) {
                    rVarB = z1.o.f58481a;
                    if (i25 != 0) {
                        rVar2 = rVarB;
                    }
                    if (i14 != 0) {
                        eVar4 = z1.c.f58467e;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (i16 != 0) {
                        jVar3 = w2.i.f54515b;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        jVar3 = jVar;
                    }
                    if (i24 != 0) {
                        f11 = 1.0f;
                    }
                    if (i21 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    gVar = l1.m.f39353a;
                    if (str != null) {
                        sVar.d0(1899234820);
                        if ((i23 & 112) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objQ2 = sVar.Q();
                        if (z12) {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new au.f(str, 26);
                            sVar.o0(objQ2);
                        }
                        rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                        sVar.p(false);
                    } else {
                        sVar.d0(1899393602);
                        sVar.p(false);
                    }
                    z1.r rVarG119 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                    objQ = sVar.Q();
                    if (objQ == gVar) {
                        objQ = y0.f22842a;
                        sVar.o0(objQ);
                    }
                    w2.q0 q0Var119 = (w2.q0) objQ;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC119 = z1.a.c(sVar, rVarG119);
                    l1.q1 q1VarL119 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0Var119, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL119, sVar);
                    l1.t.J(y2.j.f56915d, rVarC119, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar3 = rVar2;
                    eVar3 = eVar4;
                    jVar2 = jVar3;
                    pVar2 = pVar3;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    eVar3 = eVar2;
                    jVar2 = jVar;
                    pVar2 = pVar;
                }
                f12 = f11;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: d0.x0
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i13 |= 1572864;
            i23 = i13;
            if ((i13 & 599187) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i23 & 1, z11)) {
                rVarB = z1.o.f58481a;
                if (i25 != 0) {
                    rVar2 = rVarB;
                }
                if (i14 != 0) {
                    eVar4 = z1.c.f58467e;
                } else {
                    eVar4 = eVar2;
                }
                if (i16 != 0) {
                    jVar3 = w2.i.f54515b;
                    i24 = i18;
                } else {
                    i24 = i18;
                    jVar3 = jVar;
                }
                if (i24 != 0) {
                    f11 = 1.0f;
                }
                if (i21 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                gVar = l1.m.f39353a;
                if (str != null) {
                    sVar.d0(1899234820);
                    if ((i23 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objQ2 = sVar.Q();
                    if (z12) {
                        objQ2 = new au.f(str, 26);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new au.f(str, 26);
                        sVar.o0(objQ2);
                    }
                    rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                    sVar.p(false);
                } else {
                    sVar.d0(1899393602);
                    sVar.p(false);
                }
                z1.r rVarG1110 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                objQ = sVar.Q();
                if (objQ == gVar) {
                    objQ = y0.f22842a;
                    sVar.o0(objQ);
                }
                w2.q0 q0Var1110 = (w2.q0) objQ;
                iHashCode = Long.hashCode(sVar.T);
                z1.r rVarC1110 = z1.a.c(sVar, rVarG1110);
                l1.q1 q1VarL1110 = sVar.l();
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0Var1110, sVar);
                l1.t.J(y2.j.f56916e, q1VarL1110, sVar);
                l1.t.J(y2.j.f56915d, rVarC1110, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                sVar.p(true);
                rVar3 = rVar2;
                eVar3 = eVar4;
                jVar2 = jVar3;
                pVar2 = pVar3;
            } else {
                sVar.W();
                rVar3 = rVar2;
                eVar3 = eVar2;
                jVar2 = jVar;
                pVar2 = pVar;
            }
            f12 = f11;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: d0.x0
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i13 |= 196608;
        f11 = f5;
        i21 = i12 & 64;
        if (i21 != 0) {
            if ((1572864 & i11) == 0) {
                if (sVar.f(pVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i13 |= i22;
            }
            i23 = i13;
            if ((i13 & 599187) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i23 & 1, z11)) {
                rVarB = z1.o.f58481a;
                if (i25 != 0) {
                    rVar2 = rVarB;
                }
                if (i14 != 0) {
                    eVar4 = z1.c.f58467e;
                } else {
                    eVar4 = eVar2;
                }
                if (i16 != 0) {
                    jVar3 = w2.i.f54515b;
                    i24 = i18;
                } else {
                    i24 = i18;
                    jVar3 = jVar;
                }
                if (i24 != 0) {
                    f11 = 1.0f;
                }
                if (i21 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                gVar = l1.m.f39353a;
                if (str != null) {
                    sVar.d0(1899234820);
                    if ((i23 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objQ2 = sVar.Q();
                    if (z12) {
                        objQ2 = new au.f(str, 26);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new au.f(str, 26);
                        sVar.o0(objQ2);
                    }
                    rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                    sVar.p(false);
                } else {
                    sVar.d0(1899393602);
                    sVar.p(false);
                }
                z1.r rVarG1111 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
                objQ = sVar.Q();
                if (objQ == gVar) {
                    objQ = y0.f22842a;
                    sVar.o0(objQ);
                }
                w2.q0 q0Var1111 = (w2.q0) objQ;
                iHashCode = Long.hashCode(sVar.T);
                z1.r rVarC1111 = z1.a.c(sVar, rVarG1111);
                l1.q1 q1VarL1111 = sVar.l();
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0Var1111, sVar);
                l1.t.J(y2.j.f56916e, q1VarL1111, sVar);
                l1.t.J(y2.j.f56915d, rVarC1111, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                sVar.p(true);
                rVar3 = rVar2;
                eVar3 = eVar4;
                jVar2 = jVar3;
                pVar2 = pVar3;
            } else {
                sVar.W();
                rVar3 = rVar2;
                eVar3 = eVar2;
                jVar2 = jVar;
                pVar2 = pVar;
            }
            f12 = f11;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: d0.x0
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i13 |= 1572864;
        i23 = i13;
        if ((i13 & 599187) != 599186) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar.T(i23 & 1, z11)) {
            rVarB = z1.o.f58481a;
            if (i25 != 0) {
                rVar2 = rVarB;
            }
            if (i14 != 0) {
                eVar4 = z1.c.f58467e;
            } else {
                eVar4 = eVar2;
            }
            if (i16 != 0) {
                jVar3 = w2.i.f54515b;
                i24 = i18;
            } else {
                i24 = i18;
                jVar3 = jVar;
            }
            if (i24 != 0) {
                f11 = 1.0f;
            }
            if (i21 != 0) {
                pVar3 = null;
            } else {
                pVar3 = pVar;
            }
            gVar = l1.m.f39353a;
            if (str != null) {
                sVar.d0(1899234820);
                if ((i23 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objQ2 = sVar.Q();
                if (z12) {
                    objQ2 = new au.f(str, 26);
                    sVar.o0(objQ2);
                } else {
                    objQ2 = new au.f(str, 26);
                    sVar.o0(objQ2);
                }
                rVarB = g3.r.b(rVarB, false, (fz.c) objQ2);
                sVar.p(false);
            } else {
                sVar.d0(1899393602);
                sVar.p(false);
            }
            z1.r rVarG1112 = d2.h.g(d2.h.c(rVar2.i(rVarB)), bVar, eVar4, jVar3, f11, pVar3, 2);
            objQ = sVar.Q();
            if (objQ == gVar) {
                objQ = y0.f22842a;
                sVar.o0(objQ);
            }
            w2.q0 q0Var1112 = (w2.q0) objQ;
            iHashCode = Long.hashCode(sVar.T);
            z1.r rVarC1112 = z1.a.c(sVar, rVarG1112);
            l1.q1 q1VarL1112 = sVar.l();
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0Var1112, sVar);
            l1.t.J(y2.j.f56916e, q1VarL1112, sVar);
            l1.t.J(y2.j.f56915d, rVarC1112, sVar);
            hVar = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            sVar.p(true);
            rVar3 = rVar2;
            eVar3 = eVar4;
            jVar2 = jVar3;
            pVar2 = pVar3;
        } else {
            sVar.W();
            rVar3 = rVar2;
            eVar3 = eVar2;
            jVar2 = jVar;
            pVar2 = pVar;
        }
        f12 = f11;
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: d0.x0
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n.c(bVar, str, rVar3, eVar3, jVar2, f12, pVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void d(g2.h hVar, String str, z1.r rVar, w2.j jVar, l1.s sVar) {
        z1.j jVar2 = z1.c.f58467e;
        boolean zF = sVar.f(hVar);
        Object objQ = sVar.Q();
        if (zF || objQ == l1.m.f39353a) {
            objQ = se.k.a(hVar, 1);
            sVar.o0(objQ);
        }
        c((k2.a) objQ, str, rVar, jVar2, jVar, 1.0f, null, sVar, 24624, 0);
    }

    public static float e(EdgeEffect edgeEffect, float f5, float f11, v3.c cVar) {
        float f12 = j0.f22736a;
        double density = cVar.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f5) * 0.35f;
        double d5 = ((double) j0.f22736a) * density;
        float fExp = (float) (Math.exp((j0.f22737b / j0.f22738c) * Math.log(dAbs / d5)) * d5);
        int i11 = Build.VERSION.SDK_INT;
        if (fExp > (i11 >= 31 ? l.b(edgeEffect) : 0.0f) * f11) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        int iQ = hz.b.Q(f5);
        if (i11 >= 31) {
            edgeEffect.onAbsorb(iQ);
            return f5;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iQ);
        }
        return f5;
    }

    public static final z1.r f(float f5, g2.t tVar, g2.w0 w0Var, z1.r rVar) {
        return rVar.i(new m(0L, tVar, f5, w0Var, 1));
    }

    public static /* synthetic */ z1.r g(z1.r rVar, g2.t tVar, g2.w0 w0Var, int i11) {
        if ((i11 & 2) != 0) {
            w0Var = g2.f0.f28556b;
        }
        return f(1.0f, tVar, w0Var, rVar);
    }

    public static final z1.r h(z1.r rVar, long j11, g2.w0 w0Var) {
        return rVar.i(new m(j11, null, 1.0f, w0Var, 2));
    }

    public static final z1.r j(z1.r rVar, float f5, long j11, g2.w0 w0Var) {
        return k(f5, new g2.y0(j11), w0Var, rVar);
    }

    public static final z1.r k(float f5, g2.t tVar, g2.w0 w0Var, z1.r rVar) {
        return rVar.i(new u(f5, tVar, w0Var));
    }

    public static final void l(long j11, f0.h1 h1Var) {
        if (h1Var == f0.h1.Vertical) {
            if (v3.a.g(j11) != Integer.MAX_VALUE) {
                return;
            }
            i0.a.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (v3.a.h(j11) != Integer.MAX_VALUE) {
                return;
            }
            i0.a.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final z1.r m(z1.r rVar, h0.i iVar, z0 z0Var, boolean z11, g3.k kVar, fz.a aVar) {
        z1.r rVarI;
        if (z0Var instanceof g1) {
            rVarI = new x(iVar, (g1) z0Var, false, z11, null, kVar, aVar);
        } else if (z0Var == null) {
            rVarI = new x(iVar, null, false, z11, null, kVar, aVar);
        } else {
            z1.o oVar = z1.o.f58481a;
            rVarI = iVar != null ? c1.a(oVar, iVar, z0Var).i(new x(iVar, null, false, z11, null, kVar, aVar)) : z1.a.a(oVar, new y(z0Var, z11, kVar, aVar));
        }
        return rVar.i(rVarI);
    }

    public static /* synthetic */ z1.r n(z1.r rVar, h0.i iVar, z0 z0Var, boolean z11, g3.k kVar, fz.a aVar, int i11) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i11 & 16) != 0) {
            kVar = null;
        }
        return m(rVar, iVar, z0Var, z12, kVar, aVar);
    }

    public static z1.r o(z1.r rVar, boolean z11, String str, fz.a aVar, int i11) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i11 & 2) != 0) {
            str = null;
        }
        return rVar.i(new x(null, null, true, z12, str, null, aVar));
    }

    public static z1.r p(z1.r rVar, h0.i iVar, fz.a aVar) {
        return rVar.i(new c0(aVar, iVar));
    }

    public static final z1.r q(z1.r rVar, boolean z11, h0.i iVar) {
        return rVar.i(z11 ? new l0(iVar) : z1.o.f58481a);
    }

    public static z1.r r(z1.r rVar, h0.i iVar) {
        return rVar.i(new s0(iVar));
    }

    public static final boolean s(KeyEvent keyEvent) {
        long jB = q2.c.b(keyEvent);
        int i11 = q2.a.f47409p;
        return q2.a.a(jB, q2.a.f47402h) || q2.a.a(jB, q2.a.f47405k) || q2.a.a(jB, q2.a.f47408o) || q2.a.a(jB, q2.a.f47404j);
    }

    public static final boolean t(l1.n nVar) {
        return (((Configuration) ((l1.s) nVar).j(AndroidCompositionLocals_androidKt.f1199a)).uiMode & 48) == 32;
    }

    public static final d2 u(l1.n nVar) {
        Object[] objArr = new Object[0];
        boolean zD = ((l1.s) nVar).d(0);
        l1.s sVar = (l1.s) nVar;
        Object objQ = sVar.Q();
        if (zD || objQ == l1.m.f39353a) {
            objQ = new cr.m(5);
            sVar.o0(objQ);
        }
        return (d2) w1.j.d(objArr, d2.f22658i, (fz.a) objQ, sVar, 0);
    }

    public static z1.r v(z1.r rVar, d2 d2Var, boolean z11, boolean z12) {
        return w(rVar, d2Var, z12 ? f0.h1.Vertical : f0.h1.Horizontal, z11, null, d2Var.f22661c, true, null, null).i(new g2(d2Var, z12));
    }

    public static final z1.r w(z1.r rVar, f0.c2 c2Var, f0.h1 h1Var, boolean z11, f0.t0 t0Var, h0.i iVar, boolean z12, i iVar2, o0.h hVar) {
        float f5 = b0.f22640a;
        f0.h1 h1Var2 = f0.h1.Vertical;
        z1.o oVar = z1.o.f58481a;
        return rVar.i(h1Var == h1Var2 ? d2.h.b(oVar, r0.f22791c) : d2.h.b(oVar, r0.f22790b)).i(new e2(iVar2, hVar, t0Var, h1Var, c2Var, iVar, z11, z12));
    }

    public static final long x(long j11, float f5) {
        float fMax = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (j11 >> 32)) - f5);
        float fMax2 = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (j11 & 4294967295L)) - f5);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static z1.r y(z1.r rVar, d2 d2Var, boolean z11, int i11) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return v(rVar, d2Var, z11, true);
    }
}
