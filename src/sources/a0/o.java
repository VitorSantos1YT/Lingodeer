package a0;

import b0.g2;
import b0.h2;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f152b = 0;

    static {
        long j11 = Integer.MIN_VALUE;
        f151a = (j11 & 4294967295L) | (j11 << 32);
    }

    public static final void a(b0.c2 c2Var, z1.r rVar, fz.c cVar, z1.e eVar, fz.c cVar2, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        fz.c cVar3;
        l1.s sVar;
        h2 h2Var;
        x1.p pVar;
        y yVar;
        b0.v1 v1VarB;
        l1.s sVar2;
        boolean z11;
        fz.c cVar4 = cVar;
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(511725103);
        if ((i11 & 6) == 0) {
            i12 = (sVar3.f(c2Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar3.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar3.h(cVar4) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar3.f(eVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar3.h(cVar2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        t1.d dVar2 = dVar;
        if ((196608 & i11) == 0) {
            i12 |= sVar3.h(dVar2) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if (sVar3.T(i12 & 1, (74899 & i12) != 74898)) {
            v3.m mVar = (v3.m) sVar3.j(z2.g1.f58552n);
            int i13 = i12 & 14;
            boolean z12 = i13 == 4;
            Object objQ = sVar3.Q();
            l1.g gVar = l1.m.f39353a;
            if (z12 || objQ == gVar) {
                objQ = new y(c2Var, eVar, mVar);
                sVar3.o0(objQ);
            }
            y yVar2 = (y) objQ;
            boolean z13 = i13 == 4;
            Object objQ2 = sVar3.Q();
            Object obj = objQ2;
            if (z13 || objQ2 == gVar) {
                Object[] objArr = {c2Var.f3458a.Y()};
                x1.p pVar2 = new x1.p();
                pVar2.addAll(ry.l.k0(objArr));
                sVar3.o0(pVar2);
                obj = pVar2;
            }
            x1.p pVar3 = (x1.p) obj;
            boolean z14 = i13 == 4;
            Object objQ3 = sVar3.Q();
            if (z14 || objQ3 == gVar) {
                long[] jArr = y.r0.f56756a;
                objQ3 = new y.i0();
                sVar3.o0(objQ3);
            }
            y.i0 i0Var = (y.i0) objQ3;
            h2 h2Var2 = c2Var.f3458a;
            l1.k1 k1Var = c2Var.f3461d;
            if (!pVar3.contains(h2Var2.Y())) {
                pVar3.clear();
                pVar3.add(h2Var2.Y());
            }
            if (kotlin.jvm.internal.m.a(h2Var2.Y(), k1Var.getValue())) {
                if (pVar3.size() != 1 || !kotlin.jvm.internal.m.a(pVar3.get(0), h2Var2.Y())) {
                    pVar3.clear();
                    pVar3.add(h2Var2.Y());
                }
                if (i0Var.f56717e != 1 || i0Var.c(h2Var2.Y())) {
                    i0Var.a();
                }
                yVar2.f235b = eVar;
            }
            if (kotlin.jvm.internal.m.a(h2Var2.Y(), k1Var.getValue()) || pVar3.contains(k1Var.getValue())) {
                h2Var = h2Var2;
            } else {
                ListIterator listIterator = pVar3.listIterator();
                int i14 = 0;
                while (true) {
                    sy.a aVar = (sy.a) listIterator;
                    h2Var = h2Var2;
                    if (!aVar.hasNext()) {
                        i14 = -1;
                        break;
                    } else {
                        if (kotlin.jvm.internal.m.a(cVar2.invoke(aVar.next()), cVar2.invoke(k1Var.getValue()))) {
                            break;
                        }
                        i14++;
                        h2Var2 = h2Var;
                    }
                }
                if (i14 == -1) {
                    pVar3.add(k1Var.getValue());
                } else {
                    pVar3.set(i14, k1Var.getValue());
                }
            }
            if (i0Var.c(k1Var.getValue()) && i0Var.c(h2Var.Y())) {
                sVar3.d0(1969054067);
                sVar3.p(false);
                cVar3 = cVar4;
            } else {
                sVar3.d0(1966468977);
                i0Var.a();
                int size = pVar3.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj2 = pVar3.get(i15);
                    i0Var.m(obj2, t1.e.d(-23915175, new l(c2Var, obj2, cVar4, yVar2, pVar3, dVar2), sVar3));
                    i15++;
                    cVar4 = cVar4;
                    dVar2 = dVar;
                }
                cVar3 = cVar4;
                sVar3.p(false);
            }
            boolean zF = sVar3.f(c2Var.f()) | sVar3.f(yVar2);
            Object objQ4 = sVar3.Q();
            if (zF || objQ4 == gVar) {
                objQ4 = (p0) cVar3.invoke(yVar2);
                sVar3.o0(objQ4);
            }
            p0 p0Var = (p0) objQ4;
            b0.c2 c2Var2 = yVar2.f234a;
            boolean zF2 = sVar3.f(yVar2);
            Object objQ5 = sVar3.Q();
            if (zF2 || objQ5 == gVar) {
                objQ5 = l1.t.B(Boolean.FALSE);
                sVar3.o0(objQ5);
            }
            l1.b1 b1Var = (l1.b1) objQ5;
            l1.b1 b1VarH = l1.t.H(p0Var.f165d, sVar3);
            if (kotlin.jvm.internal.m.a(c2Var2.f3458a.Y(), c2Var2.f3461d.getValue())) {
                b1Var.setValue(Boolean.FALSE);
            } else if (b1VarH.getValue() != null) {
                b1Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            z1.r rVar2 = z1.o.f58481a;
            if (zBooleanValue) {
                sVar3.d0(1353180665);
                pVar = pVar3;
                l1.s sVar4 = sVar3;
                yVar = yVar2;
                v1VarB = g2.b(yVar2.f234a, b0.e.f3502q, null, sVar4, 0, 2);
                boolean zF3 = sVar4.f(v1VarB);
                Object objQ6 = sVar4.Q();
                if (zF3 || objQ6 == gVar) {
                    objQ6 = d2.h.c(rVar2);
                    sVar4.o0(objQ6);
                }
                rVar2 = (z1.r) objQ6;
                sVar4.p(false);
                sVar2 = sVar4;
            } else {
                pVar = pVar3;
                l1.s sVar5 = sVar3;
                yVar = yVar2;
                sVar5.d0(1353446707);
                sVar5.p(false);
                v1VarB = null;
                yVar.f238e = null;
                sVar2 = sVar5;
            }
            z1.r rVarI = rVar.i(rVar2.i(new t(v1VarB, b1VarH, yVar)));
            Object objQ7 = sVar2.Q();
            if (objQ7 == gVar) {
                objQ7 = new q(yVar);
                sVar2.o0(objQ7);
            }
            q qVar = (q) objQ7;
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarI);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, qVar, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar2);
            sVar2.d0(-860173498);
            int size2 = pVar.size();
            int i16 = 0;
            while (i16 < size2) {
                x1.p pVar4 = pVar;
                Object obj3 = pVar4.get(i16);
                sVar2.a0(-2026002954, cVar2.invoke(obj3));
                fz.e eVar2 = (fz.e) i0Var.g(obj3);
                if (eVar2 == null) {
                    sVar2.d0(1618454323);
                    z11 = false;
                } else {
                    z11 = false;
                    sVar2.d0(-2026001778);
                    eVar2.invoke(sVar2, 0);
                }
                sVar2.p(z11);
                sVar2.p(z11);
                i16++;
                pVar = pVar4;
            }
            sVar2.p(false);
            sVar2.p(true);
            sVar = sVar2;
        } else {
            cVar3 = cVar4;
            l1.s sVar6 = sVar3;
            sVar6.W();
            sVar = sVar6;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m(c2Var, rVar, cVar3, eVar, cVar2, dVar, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:91:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x0124  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void b(Object obj, z1.r rVar, fz.c cVar, z1.e eVar, String str, fz.c cVar2, t1.d dVar, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVar2;
        int i14;
        fz.c cVar3;
        int i15;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        int i21;
        boolean z11;
        z1.e eVar2;
        fz.c cVar4;
        z1.r rVar3;
        fz.c cVar5;
        String str3;
        l1.x1 x1VarT;
        z1.r rVar4;
        l1.g gVar;
        fz.c cVar6;
        fz.c cVar7;
        Object objQ;
        Object objQ2;
        int i22;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1501828832);
        if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? sVar.f(obj) : sVar.h(obj) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i23 = i12 & 2;
        if (i23 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i13 |= sVar.f(rVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 384) == 0) {
                    cVar3 = cVar;
                    if (sVar.h(cVar3)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i13 | 3072;
                i17 = i12 & 16;
                if (i17 != 0) {
                    if ((i11 & 24576) == 0) {
                        str2 = str;
                        if (sVar.f(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = OSSConstants.DEFAULT_BUFFER_SIZE;
                        }
                        i16 |= i18;
                    }
                    i19 = i12 & 32;
                    if (i19 != 0) {
                        if ((196608 & i11) == 0) {
                            if (sVar.h(cVar2)) {
                                i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                            } else {
                                i21 = 65536;
                            }
                            i16 |= i21;
                        }
                        if ((1572864 & i11) == 0) {
                            if (sVar.h(dVar)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i16 |= i22;
                        }
                        if ((599187 & i16) != 599186) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (sVar.T(i16 & 1, z11)) {
                            if (i23 != 0) {
                                rVar4 = z1.o.f58481a;
                            } else {
                                rVar4 = rVar2;
                            }
                            gVar = l1.m.f39353a;
                            if (i14 != 0) {
                                objQ2 = sVar.Q();
                                if (objQ2 == gVar) {
                                    objQ2 = c.f28b;
                                    sVar.o0(objQ2);
                                }
                                cVar6 = (fz.c) objQ2;
                            } else {
                                cVar6 = cVar3;
                            }
                            z1.j jVar = z1.c.f58463a;
                            if (i17 != 0) {
                                str2 = "AnimatedContent";
                            }
                            if (i19 != 0) {
                                objQ = sVar.Q();
                                if (objQ == gVar) {
                                    objQ = c.f29c;
                                    sVar.o0(objQ);
                                }
                                cVar7 = (fz.c) objQ;
                            } else {
                                cVar7 = cVar2;
                            }
                            int i24 = i16 >> 3;
                            fz.c cVar8 = cVar7;
                            a(g2.e(obj, str2, sVar, (i16 & 14) | ((i16 >> 9) & 112), 0), rVar4, cVar6, jVar, cVar8, dVar, sVar, (i16 & 8176) | (57344 & i24) | (i24 & 458752));
                            rVar3 = rVar4;
                            cVar5 = cVar6;
                            eVar2 = jVar;
                            cVar4 = cVar8;
                        } else {
                            sVar.W();
                            eVar2 = eVar;
                            cVar4 = cVar2;
                            rVar3 = rVar2;
                            cVar5 = cVar3;
                        }
                        str3 = str2;
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            x1VarT.f39502d = new d(obj, rVar3, cVar5, eVar2, str3, cVar4, dVar, i11, i12);
                        }
                    }
                    i16 |= 196608;
                    if ((1572864 & i11) == 0) {
                        if (sVar.h(dVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i16 |= i22;
                    }
                    if ((599187 & i16) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i16 & 1, z11)) {
                        if (i23 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        gVar = l1.m.f39353a;
                        if (i14 != 0) {
                            objQ2 = sVar.Q();
                            if (objQ2 == gVar) {
                                objQ2 = c.f28b;
                                sVar.o0(objQ2);
                            }
                            cVar6 = (fz.c) objQ2;
                        } else {
                            cVar6 = cVar3;
                        }
                        z1.j jVar2 = z1.c.f58463a;
                        if (i17 != 0) {
                            str2 = "AnimatedContent";
                        }
                        if (i19 != 0) {
                            objQ = sVar.Q();
                            if (objQ == gVar) {
                                objQ = c.f29c;
                                sVar.o0(objQ);
                            }
                            cVar7 = (fz.c) objQ;
                        } else {
                            cVar7 = cVar2;
                        }
                        int i25 = i16 >> 3;
                        fz.c cVar9 = cVar7;
                        a(g2.e(obj, str2, sVar, (i16 & 14) | ((i16 >> 9) & 112), 0), rVar4, cVar6, jVar2, cVar9, dVar, sVar, (i16 & 8176) | (57344 & i25) | (i25 & 458752));
                        rVar3 = rVar4;
                        cVar5 = cVar6;
                        eVar2 = jVar2;
                        cVar4 = cVar9;
                    } else {
                        sVar.W();
                        eVar2 = eVar;
                        cVar4 = cVar2;
                        rVar3 = rVar2;
                        cVar5 = cVar3;
                    }
                    str3 = str2;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new d(obj, rVar3, cVar5, eVar2, str3, cVar4, dVar, i11, i12);
                    }
                }
                i16 = i13 | 27648;
                str2 = str;
                i19 = i12 & 32;
                if (i19 != 0) {
                    if ((196608 & i11) == 0) {
                        if (sVar.h(cVar2)) {
                            i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i21 = 65536;
                        }
                        i16 |= i21;
                    }
                    if ((1572864 & i11) == 0) {
                        if (sVar.h(dVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i16 |= i22;
                    }
                    if ((599187 & i16) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i16 & 1, z11)) {
                        if (i23 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        gVar = l1.m.f39353a;
                        if (i14 != 0) {
                            objQ2 = sVar.Q();
                            if (objQ2 == gVar) {
                                objQ2 = c.f28b;
                                sVar.o0(objQ2);
                            }
                            cVar6 = (fz.c) objQ2;
                        } else {
                            cVar6 = cVar3;
                        }
                        z1.j jVar3 = z1.c.f58463a;
                        if (i17 != 0) {
                            str2 = "AnimatedContent";
                        }
                        if (i19 != 0) {
                            objQ = sVar.Q();
                            if (objQ == gVar) {
                                objQ = c.f29c;
                                sVar.o0(objQ);
                            }
                            cVar7 = (fz.c) objQ;
                        } else {
                            cVar7 = cVar2;
                        }
                        int i26 = i16 >> 3;
                        fz.c cVar10 = cVar7;
                        a(g2.e(obj, str2, sVar, (i16 & 14) | ((i16 >> 9) & 112), 0), rVar4, cVar6, jVar3, cVar10, dVar, sVar, (i16 & 8176) | (57344 & i26) | (i26 & 458752));
                        rVar3 = rVar4;
                        cVar5 = cVar6;
                        eVar2 = jVar3;
                        cVar4 = cVar10;
                    } else {
                        sVar.W();
                        eVar2 = eVar;
                        cVar4 = cVar2;
                        rVar3 = rVar2;
                        cVar5 = cVar3;
                    }
                    str3 = str2;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new d(obj, rVar3, cVar5, eVar2, str3, cVar4, dVar, i11, i12);
                    }
                }
                i16 |= 196608;
                if ((1572864 & i11) == 0) {
                    if (sVar.h(dVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i16 |= i22;
                }
                if ((599187 & i16) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i16 & 1, z11)) {
                    if (i23 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    gVar = l1.m.f39353a;
                    if (i14 != 0) {
                        objQ2 = sVar.Q();
                        if (objQ2 == gVar) {
                            objQ2 = c.f28b;
                            sVar.o0(objQ2);
                        }
                        cVar6 = (fz.c) objQ2;
                    } else {
                        cVar6 = cVar3;
                    }
                    z1.j jVar4 = z1.c.f58463a;
                    if (i17 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i19 != 0) {
                        objQ = sVar.Q();
                        if (objQ == gVar) {
                            objQ = c.f29c;
                            sVar.o0(objQ);
                        }
                        cVar7 = (fz.c) objQ;
                    } else {
                        cVar7 = cVar2;
                    }
                    int i27 = i16 >> 3;
                    fz.c cVar11 = cVar7;
                    a(g2.e(obj, str2, sVar, (i16 & 14) | ((i16 >> 9) & 112), 0), rVar4, cVar6, jVar4, cVar11, dVar, sVar, (i16 & 8176) | (57344 & i27) | (i27 & 458752));
                    rVar3 = rVar4;
                    cVar5 = cVar6;
                    eVar2 = jVar4;
                    cVar4 = cVar11;
                } else {
                    sVar.W();
                    eVar2 = eVar;
                    cVar4 = cVar2;
                    rVar3 = rVar2;
                    cVar5 = cVar3;
                }
                str3 = str2;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new d(obj, rVar3, cVar5, eVar2, str3, cVar4, dVar, i11, i12);
                }
            }
            i13 |= 384;
            cVar3 = cVar;
            i16 = i13 | 3072;
            i17 = i12 & 16;
            if (i17 != 0) {
                if ((i11 & 24576) == 0) {
                    str2 = str;
                    if (sVar.f(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i16 |= i18;
                }
                i19 = i12 & 32;
                if (i19 != 0) {
                    if ((196608 & i11) == 0) {
                        if (sVar.h(cVar2)) {
                            i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i21 = 65536;
                        }
                        i16 |= i21;
                    }
                    if ((1572864 & i11) == 0) {
                        if (sVar.h(dVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i16 |= i22;
                    }
                    if ((599187 & i16) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i16 & 1, z11)) {
                        if (i23 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        gVar = l1.m.f39353a;
                        if (i14 != 0) {
                            objQ2 = sVar.Q();
                            if (objQ2 == gVar) {
                                objQ2 = c.f28b;
                                sVar.o0(objQ2);
                            }
                            cVar6 = (fz.c) objQ2;
                        } else {
                            cVar6 = cVar3;
                        }
                        z1.j jVar5 = z1.c.f58463a;
                        if (i17 != 0) {
                            str2 = "AnimatedContent";
                        }
                        if (i19 != 0) {
                            objQ = sVar.Q();
                            if (objQ == gVar) {
                                objQ = c.f29c;
                                sVar.o0(objQ);
                            }
                            cVar7 = (fz.c) objQ;
                        } else {
                            cVar7 = cVar2;
                        }
                        int i28 = i16 >> 3;
                        fz.c cVar12 = cVar7;
                        a(g2.e(obj, str2, sVar, (i16 & 14) | ((i16 >> 9) & 112), 0), rVar4, cVar6, jVar5, cVar12, dVar, sVar, (i16 & 8176) | (57344 & i28) | (i28 & 458752));
                        rVar3 = rVar4;
                        cVar5 = cVar6;
                        eVar2 = jVar5;
                        cVar4 = cVar12;
                    } else {
                        sVar.W();
                        eVar2 = eVar;
                        cVar4 = cVar2;
                        rVar3 = rVar2;
                        cVar5 = cVar3;
                    }
                    str3 = str2;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new d(obj, rVar3, cVar5, eVar2, str3, cVar4, dVar, i11, i12);
                    }
                }
                i16 |= 196608;
                if ((1572864 & i11) == 0) {
                    if (sVar.h(dVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i16 |= i22;
                }
                if ((599187 & i16) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i16 & 1, z11)) {
                    if (i23 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    gVar = l1.m.f39353a;
                    if (i14 != 0) {
                        objQ2 = sVar.Q();
                        if (objQ2 == gVar) {
                            objQ2 = c.f28b;
                            sVar.o0(objQ2);
                        }
                        cVar6 = (fz.c) objQ2;
                    } else {
                        cVar6 = cVar3;
                    }
                    z1.j jVar6 = z1.c.f58463a;
                    if (i17 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i19 != 0) {
                        objQ = sVar.Q();
                        if (objQ == gVar) {
                            objQ = c.f29c;
                            sVar.o0(objQ);
                        }
                        cVar7 = (fz.c) objQ;
                    } else {
                        cVar7 = cVar2;
                    }
                    int i29 = i16 >> 3;
                    fz.c cVar13 = cVar7;
                    a(g2.e(obj, str2, sVar, (i16 & 14) | ((i16 >> 9) & 112), 0), rVar4, cVar6, jVar6, cVar13, dVar, sVar, (i16 & 8176) | (57344 & i29) | (i29 & 458752));
                    rVar3 = rVar4;
                    cVar5 = cVar6;
                    eVar2 = jVar6;
                    cVar4 = cVar13;
                } else {
                    sVar.W();
                    eVar2 = eVar;
                    cVar4 = cVar2;
                    rVar3 = rVar2;
                    cVar5 = cVar3;
                }
                str3 = str2;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new d(obj, rVar3, cVar5, eVar2, str3, cVar4, dVar, i11, i12);
                }
            }
            i16 = i13 | 27648;
            str2 = str;
            i19 = i12 & 32;
            if (i19 != 0) {
                if ((196608 & i11) == 0) {
                    if (sVar.h(cVar2)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i16 |= i21;
                }
                if ((1572864 & i11) == 0) {
                    if (sVar.h(dVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i16 |= i22;
                }
                if ((599187 & i16) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i16 & 1, z11)) {
                    if (i23 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    gVar = l1.m.f39353a;
                    if (i14 != 0) {
                        objQ2 = sVar.Q();
                        if (objQ2 == gVar) {
                            objQ2 = c.f28b;
                            sVar.o0(objQ2);
                        }
                        cVar6 = (fz.c) objQ2;
                    } else {
                        cVar6 = cVar3;
                    }
                    z1.j jVar7 = z1.c.f58463a;
                    if (i17 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i19 != 0) {
                        objQ = sVar.Q();
                        if (objQ == gVar) {
                            objQ = c.f29c;
                            sVar.o0(objQ);
                        }
                        cVar7 = (fz.c) objQ;
                    } else {
                        cVar7 = cVar2;
                    }
                    int i210 = i16 >> 3;
                    fz.c cVar14 = cVar7;
                    a(g2.e(obj, str2, sVar, (i16 & 14) | ((i16 >> 9) & 112), 0), rVar4, cVar6, jVar7, cVar14, dVar, sVar, (i16 & 8176) | (57344 & i210) | (i210 & 458752));
                    rVar3 = rVar4;
                    cVar5 = cVar6;
                    eVar2 = jVar7;
                    cVar4 = cVar14;
                } else {
                    sVar.W();
                    eVar2 = eVar;
                    cVar4 = cVar2;
                    rVar3 = rVar2;
                    cVar5 = cVar3;
                }
                str3 = str2;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new d(obj, rVar3, cVar5, eVar2, str3, cVar4, dVar, i11, i12);
                }
            }
            i16 |= 196608;
            if ((1572864 & i11) == 0) {
                if (sVar.h(dVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i16 |= i22;
            }
            if ((599187 & i16) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i16 & 1, z11)) {
                if (i23 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                gVar = l1.m.f39353a;
                if (i14 != 0) {
                    objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = c.f28b;
                        sVar.o0(objQ2);
                    }
                    cVar6 = (fz.c) objQ2;
                } else {
                    cVar6 = cVar3;
                }
                z1.j jVar8 = z1.c.f58463a;
                if (i17 != 0) {
                    str2 = "AnimatedContent";
                }
                if (i19 != 0) {
                    objQ = sVar.Q();
                    if (objQ == gVar) {
                        objQ = c.f29c;
                        sVar.o0(objQ);
                    }
                    cVar7 = (fz.c) objQ;
                } else {
                    cVar7 = cVar2;
                }
                int i211 = i16 >> 3;
                fz.c cVar15 = cVar7;
                a(g2.e(obj, str2, sVar, (i16 & 14) | ((i16 >> 9) & 112), 0), rVar4, cVar6, jVar8, cVar15, dVar, sVar, (i16 & 8176) | (57344 & i211) | (i211 & 458752));
                rVar3 = rVar4;
                cVar5 = cVar6;
                eVar2 = jVar8;
                cVar4 = cVar15;
            } else {
                sVar.W();
                eVar2 = eVar;
                cVar4 = cVar2;
                rVar3 = rVar2;
                cVar5 = cVar3;
            }
            str3 = str2;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new d(obj, rVar3, cVar5, eVar2, str3, cVar4, dVar, i11, i12);
            }
        }
        i13 |= 48;
        rVar2 = rVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 384) == 0) {
                cVar3 = cVar;
                if (sVar.h(cVar3)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i13 | 3072;
            i17 = i12 & 16;
            if (i17 != 0) {
                if ((i11 & 24576) == 0) {
                    str2 = str;
                    if (sVar.f(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i16 |= i18;
                }
                i19 = i12 & 32;
                if (i19 != 0) {
                    if ((196608 & i11) == 0) {
                        if (sVar.h(cVar2)) {
                            i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i21 = 65536;
                        }
                        i16 |= i21;
                    }
                    if ((1572864 & i11) == 0) {
                        if (sVar.h(dVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i16 |= i22;
                    }
                    if ((599187 & i16) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (sVar.T(i16 & 1, z11)) {
                        if (i23 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        gVar = l1.m.f39353a;
                        if (i14 != 0) {
                            objQ2 = sVar.Q();
                            if (objQ2 == gVar) {
                                objQ2 = c.f28b;
                                sVar.o0(objQ2);
                            }
                            cVar6 = (fz.c) objQ2;
                        } else {
                            cVar6 = cVar3;
                        }
                        z1.j jVar9 = z1.c.f58463a;
                        if (i17 != 0) {
                            str2 = "AnimatedContent";
                        }
                        if (i19 != 0) {
                            objQ = sVar.Q();
                            if (objQ == gVar) {
                                objQ = c.f29c;
                                sVar.o0(objQ);
                            }
                            cVar7 = (fz.c) objQ;
                        } else {
                            cVar7 = cVar2;
                        }
                        int i212 = i16 >> 3;
                        fz.c cVar16 = cVar7;
                        a(g2.e(obj, str2, sVar, (i16 & 14) | ((i16 >> 9) & 112), 0), rVar4, cVar6, jVar9, cVar16, dVar, sVar, (i16 & 8176) | (57344 & i212) | (i212 & 458752));
                        rVar3 = rVar4;
                        cVar5 = cVar6;
                        eVar2 = jVar9;
                        cVar4 = cVar16;
                    } else {
                        sVar.W();
                        eVar2 = eVar;
                        cVar4 = cVar2;
                        rVar3 = rVar2;
                        cVar5 = cVar3;
                    }
                    str3 = str2;
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new d(obj, rVar3, cVar5, eVar2, str3, cVar4, dVar, i11, i12);
                    }
                }
                i16 |= 196608;
                if ((1572864 & i11) == 0) {
                    if (sVar.h(dVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i16 |= i22;
                }
                if ((599187 & i16) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i16 & 1, z11)) {
                    if (i23 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    gVar = l1.m.f39353a;
                    if (i14 != 0) {
                        objQ2 = sVar.Q();
                        if (objQ2 == gVar) {
                            objQ2 = c.f28b;
                            sVar.o0(objQ2);
                        }
                        cVar6 = (fz.c) objQ2;
                    } else {
                        cVar6 = cVar3;
                    }
                    z1.j jVar10 = z1.c.f58463a;
                    if (i17 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i19 != 0) {
                        objQ = sVar.Q();
                        if (objQ == gVar) {
                            objQ = c.f29c;
                            sVar.o0(objQ);
                        }
                        cVar7 = (fz.c) objQ;
                    } else {
                        cVar7 = cVar2;
                    }
                    int i213 = i16 >> 3;
                    fz.c cVar17 = cVar7;
                    a(g2.e(obj, str2, sVar, (i16 & 14) | ((i16 >> 9) & 112), 0), rVar4, cVar6, jVar10, cVar17, dVar, sVar, (i16 & 8176) | (57344 & i213) | (i213 & 458752));
                    rVar3 = rVar4;
                    cVar5 = cVar6;
                    eVar2 = jVar10;
                    cVar4 = cVar17;
                } else {
                    sVar.W();
                    eVar2 = eVar;
                    cVar4 = cVar2;
                    rVar3 = rVar2;
                    cVar5 = cVar3;
                }
                str3 = str2;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new d(obj, rVar3, cVar5, eVar2, str3, cVar4, dVar, i11, i12);
                }
            }
            i16 = i13 | 27648;
            str2 = str;
            i19 = i12 & 32;
            if (i19 != 0) {
                if ((196608 & i11) == 0) {
                    if (sVar.h(cVar2)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i16 |= i21;
                }
                if ((1572864 & i11) == 0) {
                    if (sVar.h(dVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i16 |= i22;
                }
                if ((599187 & i16) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i16 & 1, z11)) {
                    if (i23 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    gVar = l1.m.f39353a;
                    if (i14 != 0) {
                        objQ2 = sVar.Q();
                        if (objQ2 == gVar) {
                            objQ2 = c.f28b;
                            sVar.o0(objQ2);
                        }
                        cVar6 = (fz.c) objQ2;
                    } else {
                        cVar6 = cVar3;
                    }
                    z1.j jVar11 = z1.c.f58463a;
                    if (i17 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i19 != 0) {
                        objQ = sVar.Q();
                        if (objQ == gVar) {
                            objQ = c.f29c;
                            sVar.o0(objQ);
                        }
                        cVar7 = (fz.c) objQ;
                    } else {
                        cVar7 = cVar2;
                    }
                    int i214 = i16 >> 3;
                    fz.c cVar18 = cVar7;
                    a(g2.e(obj, str2, sVar, (i16 & 14) | ((i16 >> 9) & 112), 0), rVar4, cVar6, jVar11, cVar18, dVar, sVar, (i16 & 8176) | (57344 & i214) | (i214 & 458752));
                    rVar3 = rVar4;
                    cVar5 = cVar6;
                    eVar2 = jVar11;
                    cVar4 = cVar18;
                } else {
                    sVar.W();
                    eVar2 = eVar;
                    cVar4 = cVar2;
                    rVar3 = rVar2;
                    cVar5 = cVar3;
                }
                str3 = str2;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new d(obj, rVar3, cVar5, eVar2, str3, cVar4, dVar, i11, i12);
                }
            }
            i16 |= 196608;
            if ((1572864 & i11) == 0) {
                if (sVar.h(dVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i16 |= i22;
            }
            if ((599187 & i16) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i16 & 1, z11)) {
                if (i23 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                gVar = l1.m.f39353a;
                if (i14 != 0) {
                    objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = c.f28b;
                        sVar.o0(objQ2);
                    }
                    cVar6 = (fz.c) objQ2;
                } else {
                    cVar6 = cVar3;
                }
                z1.j jVar12 = z1.c.f58463a;
                if (i17 != 0) {
                    str2 = "AnimatedContent";
                }
                if (i19 != 0) {
                    objQ = sVar.Q();
                    if (objQ == gVar) {
                        objQ = c.f29c;
                        sVar.o0(objQ);
                    }
                    cVar7 = (fz.c) objQ;
                } else {
                    cVar7 = cVar2;
                }
                int i215 = i16 >> 3;
                fz.c cVar19 = cVar7;
                a(g2.e(obj, str2, sVar, (i16 & 14) | ((i16 >> 9) & 112), 0), rVar4, cVar6, jVar12, cVar19, dVar, sVar, (i16 & 8176) | (57344 & i215) | (i215 & 458752));
                rVar3 = rVar4;
                cVar5 = cVar6;
                eVar2 = jVar12;
                cVar4 = cVar19;
            } else {
                sVar.W();
                eVar2 = eVar;
                cVar4 = cVar2;
                rVar3 = rVar2;
                cVar5 = cVar3;
            }
            str3 = str2;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new d(obj, rVar3, cVar5, eVar2, str3, cVar4, dVar, i11, i12);
            }
        }
        i13 |= 384;
        cVar3 = cVar;
        i16 = i13 | 3072;
        i17 = i12 & 16;
        if (i17 != 0) {
            if ((i11 & 24576) == 0) {
                str2 = str;
                if (sVar.f(str2)) {
                    i18 = 16384;
                } else {
                    i18 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i16 |= i18;
            }
            i19 = i12 & 32;
            if (i19 != 0) {
                if ((196608 & i11) == 0) {
                    if (sVar.h(cVar2)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i16 |= i21;
                }
                if ((1572864 & i11) == 0) {
                    if (sVar.h(dVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i16 |= i22;
                }
                if ((599187 & i16) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i16 & 1, z11)) {
                    if (i23 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    gVar = l1.m.f39353a;
                    if (i14 != 0) {
                        objQ2 = sVar.Q();
                        if (objQ2 == gVar) {
                            objQ2 = c.f28b;
                            sVar.o0(objQ2);
                        }
                        cVar6 = (fz.c) objQ2;
                    } else {
                        cVar6 = cVar3;
                    }
                    z1.j jVar13 = z1.c.f58463a;
                    if (i17 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i19 != 0) {
                        objQ = sVar.Q();
                        if (objQ == gVar) {
                            objQ = c.f29c;
                            sVar.o0(objQ);
                        }
                        cVar7 = (fz.c) objQ;
                    } else {
                        cVar7 = cVar2;
                    }
                    int i216 = i16 >> 3;
                    fz.c cVar110 = cVar7;
                    a(g2.e(obj, str2, sVar, (i16 & 14) | ((i16 >> 9) & 112), 0), rVar4, cVar6, jVar13, cVar110, dVar, sVar, (i16 & 8176) | (57344 & i216) | (i216 & 458752));
                    rVar3 = rVar4;
                    cVar5 = cVar6;
                    eVar2 = jVar13;
                    cVar4 = cVar110;
                } else {
                    sVar.W();
                    eVar2 = eVar;
                    cVar4 = cVar2;
                    rVar3 = rVar2;
                    cVar5 = cVar3;
                }
                str3 = str2;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new d(obj, rVar3, cVar5, eVar2, str3, cVar4, dVar, i11, i12);
                }
            }
            i16 |= 196608;
            if ((1572864 & i11) == 0) {
                if (sVar.h(dVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i16 |= i22;
            }
            if ((599187 & i16) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i16 & 1, z11)) {
                if (i23 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                gVar = l1.m.f39353a;
                if (i14 != 0) {
                    objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = c.f28b;
                        sVar.o0(objQ2);
                    }
                    cVar6 = (fz.c) objQ2;
                } else {
                    cVar6 = cVar3;
                }
                z1.j jVar14 = z1.c.f58463a;
                if (i17 != 0) {
                    str2 = "AnimatedContent";
                }
                if (i19 != 0) {
                    objQ = sVar.Q();
                    if (objQ == gVar) {
                        objQ = c.f29c;
                        sVar.o0(objQ);
                    }
                    cVar7 = (fz.c) objQ;
                } else {
                    cVar7 = cVar2;
                }
                int i217 = i16 >> 3;
                fz.c cVar111 = cVar7;
                a(g2.e(obj, str2, sVar, (i16 & 14) | ((i16 >> 9) & 112), 0), rVar4, cVar6, jVar14, cVar111, dVar, sVar, (i16 & 8176) | (57344 & i217) | (i217 & 458752));
                rVar3 = rVar4;
                cVar5 = cVar6;
                eVar2 = jVar14;
                cVar4 = cVar111;
            } else {
                sVar.W();
                eVar2 = eVar;
                cVar4 = cVar2;
                rVar3 = rVar2;
                cVar5 = cVar3;
            }
            str3 = str2;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new d(obj, rVar3, cVar5, eVar2, str3, cVar4, dVar, i11, i12);
            }
        }
        i16 = i13 | 27648;
        str2 = str;
        i19 = i12 & 32;
        if (i19 != 0) {
            if ((196608 & i11) == 0) {
                if (sVar.h(cVar2)) {
                    i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i21 = 65536;
                }
                i16 |= i21;
            }
            if ((1572864 & i11) == 0) {
                if (sVar.h(dVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i16 |= i22;
            }
            if ((599187 & i16) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i16 & 1, z11)) {
                if (i23 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                gVar = l1.m.f39353a;
                if (i14 != 0) {
                    objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = c.f28b;
                        sVar.o0(objQ2);
                    }
                    cVar6 = (fz.c) objQ2;
                } else {
                    cVar6 = cVar3;
                }
                z1.j jVar15 = z1.c.f58463a;
                if (i17 != 0) {
                    str2 = "AnimatedContent";
                }
                if (i19 != 0) {
                    objQ = sVar.Q();
                    if (objQ == gVar) {
                        objQ = c.f29c;
                        sVar.o0(objQ);
                    }
                    cVar7 = (fz.c) objQ;
                } else {
                    cVar7 = cVar2;
                }
                int i218 = i16 >> 3;
                fz.c cVar112 = cVar7;
                a(g2.e(obj, str2, sVar, (i16 & 14) | ((i16 >> 9) & 112), 0), rVar4, cVar6, jVar15, cVar112, dVar, sVar, (i16 & 8176) | (57344 & i218) | (i218 & 458752));
                rVar3 = rVar4;
                cVar5 = cVar6;
                eVar2 = jVar15;
                cVar4 = cVar112;
            } else {
                sVar.W();
                eVar2 = eVar;
                cVar4 = cVar2;
                rVar3 = rVar2;
                cVar5 = cVar3;
            }
            str3 = str2;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new d(obj, rVar3, cVar5, eVar2, str3, cVar4, dVar, i11, i12);
            }
        }
        i16 |= 196608;
        if ((1572864 & i11) == 0) {
            if (sVar.h(dVar)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i16 |= i22;
        }
        if ((599187 & i16) != 599186) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar.T(i16 & 1, z11)) {
            if (i23 != 0) {
                rVar4 = z1.o.f58481a;
            } else {
                rVar4 = rVar2;
            }
            gVar = l1.m.f39353a;
            if (i14 != 0) {
                objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = c.f28b;
                    sVar.o0(objQ2);
                }
                cVar6 = (fz.c) objQ2;
            } else {
                cVar6 = cVar3;
            }
            z1.j jVar16 = z1.c.f58463a;
            if (i17 != 0) {
                str2 = "AnimatedContent";
            }
            if (i19 != 0) {
                objQ = sVar.Q();
                if (objQ == gVar) {
                    objQ = c.f29c;
                    sVar.o0(objQ);
                }
                cVar7 = (fz.c) objQ;
            } else {
                cVar7 = cVar2;
            }
            int i219 = i16 >> 3;
            fz.c cVar113 = cVar7;
            a(g2.e(obj, str2, sVar, (i16 & 14) | ((i16 >> 9) & 112), 0), rVar4, cVar6, jVar16, cVar113, dVar, sVar, (i16 & 8176) | (57344 & i219) | (i219 & 458752));
            rVar3 = rVar4;
            cVar5 = cVar6;
            eVar2 = jVar16;
            cVar4 = cVar113;
        } else {
            sVar.W();
            eVar2 = eVar;
            cVar4 = cVar2;
            rVar3 = rVar2;
            cVar5 = cVar3;
        }
        str3 = str2;
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d(obj, rVar3, cVar5, eVar2, str3, cVar4, dVar, i11, i12);
        }
    }
}
