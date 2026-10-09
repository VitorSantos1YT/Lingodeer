package iv;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import h1.dc;
import h1.fc;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.e2;
import l1.c3;
import l1.q1;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f34761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f34762b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f34763c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f34764d = 12;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f34765e;

    static {
        float f5 = 16;
        f34761a = f5;
        f34765e = f5;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x0112  */
    /* JADX WARN: Code duplicated, block: B:60:0x011c  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public static final void a(String text, fz.a onClick, z1.r rVar, v3.f fVar, l1.n nVar, int i11, int i12) {
        int i13;
        v3.f fVar2;
        boolean z11;
        v3.f fVar3;
        x1 x1VarT;
        v3.f fVar4;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        z1.r rVarG;
        kotlin.jvm.internal.m.f(text, "text");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1726899297);
        if ((i11 & 6) == 0) {
            i13 = (sVar.f(text) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar.h(onClick) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar.f(rVar) ? 256 : 128;
        }
        int i14 = i12 & 8;
        if (i14 == 0) {
            if ((i11 & 3072) == 0) {
                fVar2 = fVar;
                i13 |= sVar.f(fVar2) ? 2048 : 1024;
            }
            if ((i13 & 1171) != 1170) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i13 & 1, z11)) {
                if (i14 != 0) {
                    fVar4 = null;
                } else {
                    fVar4 = fVar2;
                }
                z1.r rVarB = j0.c.B(e2.e(rVar, 1.0f), f34761a, 12);
                w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(sVar, rVarB);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD, sVar);
                l1.t.J(y2.j.f56916e, q1VarL, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar);
                rVarG = z1.o.f58481a;
                z1.r rVarE = e2.e(rVarG, 1.0f);
                if (fVar4 != null) {
                    rVarG = e2.g(rVarG, fVar4.f53489a);
                }
                iu.k.e(onClick, rVarE.i(rVarG), false, 0L, null, t1.e.d(-1852833486, new bp.a0(text, 9), sVar), sVar, ((i13 >> 3) & 14) | 196608, 28);
                sVar.p(true);
                fVar3 = fVar4;
            } else {
                sVar.W();
                fVar3 = fVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new bp.z(text, onClick, rVar, fVar3, i11, i12, 2);
            }
        }
        i13 |= 3072;
        fVar2 = fVar;
        if ((i13 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar.T(i13 & 1, z11)) {
            if (i14 != 0) {
                fVar4 = null;
            } else {
                fVar4 = fVar2;
            }
            z1.r rVarB2 = j0.c.B(e2.e(rVar, 1.0f), f34761a, 12);
            w2.q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarB2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD2, sVar);
            l1.t.J(y2.j.f56916e, q1VarL2, sVar);
            hVar = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            rVarG = z1.o.f58481a;
            z1.r rVarE2 = e2.e(rVarG, 1.0f);
            if (fVar4 != null) {
                rVarG = e2.g(rVarG, fVar4.f53489a);
            }
            iu.k.e(onClick, rVarE2.i(rVarG), false, 0L, null, t1.e.d(-1852833486, new bp.a0(text, 9), sVar), sVar, ((i13 >> 3) & 14) | 196608, 28);
            sVar.p(true);
            fVar3 = fVar4;
        } else {
            sVar.W();
            fVar3 = fVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.z(text, onClick, rVar, fVar3, i11, i12, 2);
        }
    }

    public static final j3.y0 b(l1.n nVar) {
        l1.s sVar = (l1.s) nVar;
        return j3.y0.a(((dc) sVar.j(fc.f30256a)).f30178k, ((s1) sVar.j(v1.f31180a)).f31036s, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:74:0x0102  */
    /* JADX WARN: Code duplicated, block: B:77:0x016f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0173  */
    /* JADX WARN: Code duplicated, block: B:81:0x0186  */
    /* JADX WARN: Code duplicated, block: B:83:0x0194  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public static final void c(final String title, z1.r rVar, j3.y0 y0Var, float f5, t1.d dVar, l1.n nVar, final int i11, final int i12) {
        int i13;
        z1.r rVar2;
        j3.y0 y0VarA;
        int i14;
        float f11;
        int i15;
        boolean z11;
        final t1.d dVar2;
        l1.s sVar;
        final z1.r rVar3;
        final j3.y0 y0Var2;
        final float f12;
        x1 x1VarT;
        z1.r rVar4;
        int i16;
        z1.r rVar5;
        float f13;
        j3.y0 y0Var3;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        int i17;
        kotlin.jvm.internal.m.f(title, "title");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1506720861);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.f(title) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i13 |= sVar2.f(rVar2) ? 32 : 16;
            }
            if ((i11 & 384) == 0) {
                if ((i12 & 4) == 0) {
                    y0VarA = y0Var;
                    int i19 = sVar2.f(y0VarA) ? 256 : 128;
                    i13 |= i19;
                } else {
                    y0VarA = y0Var;
                }
                i13 |= i19;
            } else {
                y0VarA = y0Var;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    f11 = f5;
                    if (sVar2.c(f11)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i11 & 24576) == 0) {
                    if (sVar2.h(dVar)) {
                        i17 = 16384;
                    } else {
                        i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i13 |= i17;
                }
                if ((i13 & 9363) != 9362) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar2.T(i13 & 1, z11)) {
                    sVar2.Y();
                    if ((i11 & 1) != 0 || sVar2.C()) {
                        if (i18 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            y0VarA = j3.y0.a(((dc) sVar2.j(fc.f30256a)).f30176i, ((s1) sVar2.j(v1.f31180a)).f31034q, 0L, n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777210);
                        }
                        if (i14 != 0) {
                            i16 = i13;
                            rVar5 = rVar4;
                            f13 = 0.18f;
                            y0Var3 = y0VarA;
                        } else {
                            i16 = i13;
                            rVar5 = rVar4;
                        }
                        sVar2.q();
                        float f14 = 8;
                        r0.e eVarD = r0.f.d(f14);
                        z1.r rVarB = d2.h.b(e2.e(rVar5, 1.0f), eVarD);
                        c3 c3Var = v1.f31180a;
                        z1.r rVarB2 = j0.c.B(d0.n.j(d0.n.h(rVarB, g2.x.c(((s1) sVar2.j(c3Var)).f31021c, 0.22f), eVarD), 1, g2.x.c(((s1) sVar2.j(c3Var)).f31017a, f13), eVarD), 16, 14);
                        j0.u uVarA = j0.t.a(j0.i.g(f14), z1.c.O, sVar2, 6);
                        iHashCode = Long.hashCode(sVar2.T);
                        q1 q1VarL = sVar2.l();
                        z1.r rVarC = z1.a.c(sVar2, rVarB2);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(y2.j.f56917f, uVarA, sVar2);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                        hVar = y2.j.f56918g;
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, sVar2);
                        float f15 = f13;
                        ua.b(title, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var3, sVar2, i16 & 14, (i16 << 12) & 3670016, 65534);
                        sVar = sVar2;
                        dVar2 = dVar;
                        dVar2.invoke(j0.v.f35424a, sVar, Integer.valueOf(6 | ((i16 >> 9) & 112)));
                        sVar.p(true);
                        y0Var2 = y0Var3;
                        rVar3 = rVar5;
                        f12 = f15;
                    } else {
                        sVar2.W();
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                        }
                        i16 = i13;
                        rVar5 = rVar2;
                    }
                    y0Var3 = y0VarA;
                    f13 = f11;
                    sVar2.q();
                    float f16 = 8;
                    r0.e eVarD2 = r0.f.d(f16);
                    z1.r rVarB3 = d2.h.b(e2.e(rVar5, 1.0f), eVarD2);
                    c3 c3Var2 = v1.f31180a;
                    z1.r rVarB4 = j0.c.B(d0.n.j(d0.n.h(rVarB3, g2.x.c(((s1) sVar2.j(c3Var2)).f31021c, 0.22f), eVarD2), 1, g2.x.c(((s1) sVar2.j(c3Var2)).f31017a, f13), eVarD2), 16, 14);
                    j0.u uVarA2 = j0.t.a(j0.i.g(f16), z1.c.O, sVar2, 6);
                    iHashCode = Long.hashCode(sVar2.T);
                    q1 q1VarL2 = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, rVarB4);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA2, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                    hVar = y2.j.f56918g;
                    if (sVar2.S) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                    float f17 = f13;
                    ua.b(title, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var3, sVar2, i16 & 14, (i16 << 12) & 3670016, 65534);
                    sVar = sVar2;
                    dVar2 = dVar;
                    dVar2.invoke(j0.v.f35424a, sVar, Integer.valueOf(6 | ((i16 >> 9) & 112)));
                    sVar.p(true);
                    y0Var2 = y0Var3;
                    rVar3 = rVar5;
                    f12 = f17;
                } else {
                    dVar2 = dVar;
                    sVar = sVar2;
                    sVar.W();
                    rVar3 = rVar2;
                    y0Var2 = y0VarA;
                    f12 = f11;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: iv.i0
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j0.c(title, rVar3, y0Var2, f12, dVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i13 |= 3072;
            f11 = f5;
            if ((i11 & 24576) == 0) {
                if (sVar2.h(dVar)) {
                    i17 = 16384;
                } else {
                    i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i13 |= i17;
            }
            if ((i13 & 9363) != 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar2.T(i13 & 1, z11)) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        y0VarA = j3.y0.a(((dc) sVar2.j(fc.f30256a)).f30176i, ((s1) sVar2.j(v1.f31180a)).f31034q, 0L, n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777210);
                    }
                    if (i14 != 0) {
                        i16 = i13;
                        rVar5 = rVar4;
                        f13 = 0.18f;
                        y0Var3 = y0VarA;
                    } else {
                        i16 = i13;
                        rVar5 = rVar4;
                        y0Var3 = y0VarA;
                        f13 = f11;
                    }
                } else {
                    if (i18 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        y0VarA = j3.y0.a(((dc) sVar2.j(fc.f30256a)).f30176i, ((s1) sVar2.j(v1.f31180a)).f31034q, 0L, n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777210);
                    }
                    if (i14 != 0) {
                        i16 = i13;
                        rVar5 = rVar4;
                        f13 = 0.18f;
                        y0Var3 = y0VarA;
                    } else {
                        i16 = i13;
                        rVar5 = rVar4;
                        y0Var3 = y0VarA;
                        f13 = f11;
                    }
                }
                sVar2.q();
                float f18 = 8;
                r0.e eVarD3 = r0.f.d(f18);
                z1.r rVarB5 = d2.h.b(e2.e(rVar5, 1.0f), eVarD3);
                c3 c3Var3 = v1.f31180a;
                z1.r rVarB6 = j0.c.B(d0.n.j(d0.n.h(rVarB5, g2.x.c(((s1) sVar2.j(c3Var3)).f31021c, 0.22f), eVarD3), 1, g2.x.c(((s1) sVar2.j(c3Var3)).f31017a, f13), eVarD3), 16, 14);
                j0.u uVarA3 = j0.t.a(j0.i.g(f18), z1.c.O, sVar2, 6);
                iHashCode = Long.hashCode(sVar2.T);
                q1 q1VarL3 = sVar2.l();
                z1.r rVarC3 = z1.a.c(sVar2, rVarB6);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA3, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL3, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC3, sVar2);
                float f19 = f13;
                ua.b(title, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var3, sVar2, i16 & 14, (i16 << 12) & 3670016, 65534);
                sVar = sVar2;
                dVar2 = dVar;
                dVar2.invoke(j0.v.f35424a, sVar, Integer.valueOf(6 | ((i16 >> 9) & 112)));
                sVar.p(true);
                y0Var2 = y0Var3;
                rVar3 = rVar5;
                f12 = f19;
            } else {
                dVar2 = dVar;
                sVar = sVar2;
                sVar.W();
                rVar3 = rVar2;
                y0Var2 = y0VarA;
                f12 = f11;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: iv.i0
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j0.c(title, rVar3, y0Var2, f12, dVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i13 |= 48;
        rVar2 = rVar;
        if ((i11 & 384) == 0) {
            if ((i12 & 4) == 0) {
                y0VarA = y0Var;
                if (sVar2.f(y0VarA)) {
                }
                i13 |= i19;
            } else {
                y0VarA = y0Var;
            }
            i13 |= i19;
        } else {
            y0VarA = y0Var;
        }
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                f11 = f5;
                if (sVar2.c(f11)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i11 & 24576) == 0) {
                if (sVar2.h(dVar)) {
                    i17 = 16384;
                } else {
                    i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i13 |= i17;
            }
            if ((i13 & 9363) != 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar2.T(i13 & 1, z11)) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        y0VarA = j3.y0.a(((dc) sVar2.j(fc.f30256a)).f30176i, ((s1) sVar2.j(v1.f31180a)).f31034q, 0L, n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777210);
                    }
                    if (i14 != 0) {
                        i16 = i13;
                        rVar5 = rVar4;
                        f13 = 0.18f;
                        y0Var3 = y0VarA;
                    } else {
                        i16 = i13;
                        rVar5 = rVar4;
                        y0Var3 = y0VarA;
                        f13 = f11;
                    }
                } else {
                    if (i18 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        y0VarA = j3.y0.a(((dc) sVar2.j(fc.f30256a)).f30176i, ((s1) sVar2.j(v1.f31180a)).f31034q, 0L, n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777210);
                    }
                    if (i14 != 0) {
                        i16 = i13;
                        rVar5 = rVar4;
                        f13 = 0.18f;
                        y0Var3 = y0VarA;
                    } else {
                        i16 = i13;
                        rVar5 = rVar4;
                        y0Var3 = y0VarA;
                        f13 = f11;
                    }
                }
                sVar2.q();
                float f110 = 8;
                r0.e eVarD4 = r0.f.d(f110);
                z1.r rVarB7 = d2.h.b(e2.e(rVar5, 1.0f), eVarD4);
                c3 c3Var4 = v1.f31180a;
                z1.r rVarB8 = j0.c.B(d0.n.j(d0.n.h(rVarB7, g2.x.c(((s1) sVar2.j(c3Var4)).f31021c, 0.22f), eVarD4), 1, g2.x.c(((s1) sVar2.j(c3Var4)).f31017a, f13), eVarD4), 16, 14);
                j0.u uVarA4 = j0.t.a(j0.i.g(f110), z1.c.O, sVar2, 6);
                iHashCode = Long.hashCode(sVar2.T);
                q1 q1VarL4 = sVar2.l();
                z1.r rVarC4 = z1.a.c(sVar2, rVarB8);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA4, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL4, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC4, sVar2);
                float f111 = f13;
                ua.b(title, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var3, sVar2, i16 & 14, (i16 << 12) & 3670016, 65534);
                sVar = sVar2;
                dVar2 = dVar;
                dVar2.invoke(j0.v.f35424a, sVar, Integer.valueOf(6 | ((i16 >> 9) & 112)));
                sVar.p(true);
                y0Var2 = y0Var3;
                rVar3 = rVar5;
                f12 = f111;
            } else {
                dVar2 = dVar;
                sVar = sVar2;
                sVar.W();
                rVar3 = rVar2;
                y0Var2 = y0VarA;
                f12 = f11;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: iv.i0
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j0.c(title, rVar3, y0Var2, f12, dVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i13 |= 3072;
        f11 = f5;
        if ((i11 & 24576) == 0) {
            if (sVar2.h(dVar)) {
                i17 = 16384;
            } else {
                i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            i13 |= i17;
        }
        if ((i13 & 9363) != 9362) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar2.T(i13 & 1, z11)) {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                    y0VarA = j3.y0.a(((dc) sVar2.j(fc.f30256a)).f30176i, ((s1) sVar2.j(v1.f31180a)).f31034q, 0L, n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777210);
                }
                if (i14 != 0) {
                    i16 = i13;
                    rVar5 = rVar4;
                    f13 = 0.18f;
                    y0Var3 = y0VarA;
                } else {
                    i16 = i13;
                    rVar5 = rVar4;
                    y0Var3 = y0VarA;
                    f13 = f11;
                }
            } else {
                if (i18 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                    y0VarA = j3.y0.a(((dc) sVar2.j(fc.f30256a)).f30176i, ((s1) sVar2.j(v1.f31180a)).f31034q, 0L, n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777210);
                }
                if (i14 != 0) {
                    i16 = i13;
                    rVar5 = rVar4;
                    f13 = 0.18f;
                    y0Var3 = y0VarA;
                } else {
                    i16 = i13;
                    rVar5 = rVar4;
                    y0Var3 = y0VarA;
                    f13 = f11;
                }
            }
            sVar2.q();
            float f112 = 8;
            r0.e eVarD5 = r0.f.d(f112);
            z1.r rVarB9 = d2.h.b(e2.e(rVar5, 1.0f), eVarD5);
            c3 c3Var5 = v1.f31180a;
            z1.r rVarB10 = j0.c.B(d0.n.j(d0.n.h(rVarB9, g2.x.c(((s1) sVar2.j(c3Var5)).f31021c, 0.22f), eVarD5), 1, g2.x.c(((s1) sVar2.j(c3Var5)).f31017a, f13), eVarD5), 16, 14);
            j0.u uVarA5 = j0.t.a(j0.i.g(f112), z1.c.O, sVar2, 6);
            iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL5 = sVar2.l();
            z1.r rVarC5 = z1.a.c(sVar2, rVarB10);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA5, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL5, sVar2);
            hVar = y2.j.f56918g;
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC5, sVar2);
            float f113 = f13;
            ua.b(title, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var3, sVar2, i16 & 14, (i16 << 12) & 3670016, 65534);
            sVar = sVar2;
            dVar2 = dVar;
            dVar2.invoke(j0.v.f35424a, sVar, Integer.valueOf(6 | ((i16 >> 9) & 112)));
            sVar.p(true);
            y0Var2 = y0Var3;
            rVar3 = rVar5;
            f12 = f113;
        } else {
            dVar2 = dVar;
            sVar = sVar2;
            sVar.W();
            rVar3 = rVar2;
            y0Var2 = y0VarA;
            f12 = f11;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: iv.i0
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j0.c(title, rVar3, y0Var2, f12, dVar2, (l1.n) obj, l1.t.M(i11 | 1), i12);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void d(z1.r rVar, t1.d dVar, l1.n nVar, int i11, int i12) {
        int i13;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(373882762);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            if (i14 != 0) {
                rVar = z1.o.f58481a;
            }
            j0.b bVar = j0.i.f35303a;
            j0.u uVarA = j0.t.a(j0.i.g(f34764d), z1.c.O, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            dVar.invoke(j0.v.f35424a, sVar, 54);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new gs.o(rVar, dVar, i11, i12);
        }
    }
}
