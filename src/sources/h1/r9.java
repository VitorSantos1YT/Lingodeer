package h1;

import com.alibaba.sdk.android.oss.common.OSSConstants;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f30995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f30996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f30997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f30998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f30999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0.g1 f31000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b0.i2 f31001g;

    static {
        float f5 = k1.h0.f37552k;
        f30995a = f5;
        f30996b = k1.h0.f37561u;
        f30997c = k1.h0.f37558r;
        float f11 = k1.h0.f37555o;
        f30998d = f11;
        f30999e = (f11 - f5) / 2;
        f31000f = new b0.g1(0);
        f31001g = new b0.i2(100, (b0.z) null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x0147  */
    /* JADX WARN: Code duplicated, block: B:53:0x0163  */
    /* JADX WARN: Code duplicated, block: B:56:0x0170  */
    /* JADX WARN: Code duplicated, block: B:57:0x0183  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void a(boolean z11, fz.c cVar, z1.r rVar, boolean z12, p9 p9Var, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVar2;
        int i14;
        int i15;
        int i16;
        z1.o oVar;
        s1 s1Var;
        p9 p9Var2;
        long j11;
        p9 p9Var3;
        int i17;
        boolean z13;
        p9 p9Var4;
        z1.o oVar2;
        z1.r rVar3;
        Object objQ;
        h0.i iVar;
        int i18;
        z1.r rVarD;
        boolean z14;
        p9 p9Var5;
        z1.r rVar4;
        l1.x1 x1VarT;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1580463220);
        if ((i11 & 6) == 0) {
            i13 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar.h(cVar) ? 32 : 16;
        }
        int i19 = i12 & 4;
        if (i19 == 0) {
            if ((i11 & 384) == 0) {
                z1.r rVar5 = rVar;
                i13 |= sVar.f(rVar5) ? 256 : 128;
                rVar2 = rVar5;
            }
            i14 = i13 | 27648;
            if ((196608 & i11) == 0) {
                i14 = 93184 | i13;
            }
            i15 = 1572864 | i14;
            if ((599187 & i15) == 599186 || !sVar.F()) {
                sVar.Y();
                i16 = i11 & 1;
                oVar = z1.o.f58481a;
                if (i16 != 0 || sVar.C()) {
                    if (i19 != 0) {
                        rVar2 = oVar;
                    }
                    s1Var = (s1) sVar.j(v1.f31180a);
                    p9Var2 = s1Var.Y;
                    j11 = s1Var.f31033p;
                    if (p9Var2 == null) {
                        long jC = v1.c(s1Var, k1.h0.f37551j);
                        long jC2 = v1.c(s1Var, k1.h0.m);
                        long j12 = g2.x.f28621h;
                        p9Var3 = new p9(jC, jC2, j12, v1.c(s1Var, k1.h0.f37553l), v1.c(s1Var, k1.h0.f37560t), v1.c(s1Var, k1.h0.f37563w), v1.c(s1Var, k1.h0.f37559s), v1.c(s1Var, k1.h0.f37562v), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37542a), 1.0f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37544c), 0.12f), j11), j12, g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37543b), 0.38f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37545d), 0.38f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37547f), 0.12f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37548g), 0.12f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37546e), 0.38f), j11));
                        s1Var.Y = p9Var3;
                    } else {
                        p9Var3 = p9Var2;
                    }
                    i17 = i15 & (-458753);
                    z13 = true;
                    p9Var4 = p9Var3;
                    rVar3 = rVar2;
                    oVar2 = oVar;
                } else {
                    sVar.W();
                    i17 = i15 & (-458753);
                    z13 = z12;
                    p9Var4 = p9Var;
                    oVar2 = oVar;
                    rVar3 = rVar2;
                }
                int i21 = i17;
                z1.r rVar6 = rVar3;
                sVar.q();
                sVar.d0(783532531);
                objQ = sVar.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = com.google.android.material.datepicker.d.f(sVar);
                }
                iVar = (h0.i) objQ;
                sVar.p(false);
                if (cVar != null) {
                    l1.c3 c3Var = s4.f31053a;
                    i18 = 2;
                    rVarD = q0.c.d(c5.f30080a, z11, iVar, z13, new g3.k(2), cVar);
                } else {
                    i18 = 2;
                    rVarD = oVar2;
                }
                int i22 = i21 << 3;
                b(j0.e2.l(j0.e2.w(rVar6.i(rVarD), z1.c.f58467e, i18), f30997c, f30998d), z11, z13, p9Var4, iVar, y7.a(k1.h0.f37549h, sVar), sVar, (i22 & 112) | ((i21 >> 6) & 896) | (i22 & 57344));
                z14 = z13;
                p9Var5 = p9Var4;
                rVar4 = rVar6;
            } else {
                sVar.W();
                p9Var5 = p9Var;
                rVar4 = rVar2;
                z14 = z12;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new a1(z11, cVar, rVar4, z14, p9Var5, i11, i12, 2);
            }
        }
        i13 |= 384;
        rVar2 = rVar;
        i14 = i13 | 27648;
        if ((196608 & i11) == 0) {
            i14 = 93184 | i13;
        }
        i15 = 1572864 | i14;
        if ((599187 & i15) == 599186) {
            sVar.Y();
            i16 = i11 & 1;
            oVar = z1.o.f58481a;
            if (i16 != 0) {
                if (i19 != 0) {
                    rVar2 = oVar;
                }
                s1Var = (s1) sVar.j(v1.f31180a);
                p9Var2 = s1Var.Y;
                j11 = s1Var.f31033p;
                if (p9Var2 == null) {
                    long jC3 = v1.c(s1Var, k1.h0.f37551j);
                    long jC4 = v1.c(s1Var, k1.h0.m);
                    long j13 = g2.x.f28621h;
                    p9Var3 = new p9(jC3, jC4, j13, v1.c(s1Var, k1.h0.f37553l), v1.c(s1Var, k1.h0.f37560t), v1.c(s1Var, k1.h0.f37563w), v1.c(s1Var, k1.h0.f37559s), v1.c(s1Var, k1.h0.f37562v), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37542a), 1.0f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37544c), 0.12f), j11), j13, g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37543b), 0.38f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37545d), 0.38f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37547f), 0.12f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37548g), 0.12f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37546e), 0.38f), j11));
                    s1Var.Y = p9Var3;
                } else {
                    p9Var3 = p9Var2;
                }
                i17 = i15 & (-458753);
                z13 = true;
                p9Var4 = p9Var3;
                rVar3 = rVar2;
                oVar2 = oVar;
            } else {
                if (i19 != 0) {
                    rVar2 = oVar;
                }
                s1Var = (s1) sVar.j(v1.f31180a);
                p9Var2 = s1Var.Y;
                j11 = s1Var.f31033p;
                if (p9Var2 == null) {
                    long jC5 = v1.c(s1Var, k1.h0.f37551j);
                    long jC6 = v1.c(s1Var, k1.h0.m);
                    long j14 = g2.x.f28621h;
                    p9Var3 = new p9(jC5, jC6, j14, v1.c(s1Var, k1.h0.f37553l), v1.c(s1Var, k1.h0.f37560t), v1.c(s1Var, k1.h0.f37563w), v1.c(s1Var, k1.h0.f37559s), v1.c(s1Var, k1.h0.f37562v), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37542a), 1.0f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37544c), 0.12f), j11), j14, g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37543b), 0.38f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37545d), 0.38f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37547f), 0.12f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37548g), 0.12f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37546e), 0.38f), j11));
                    s1Var.Y = p9Var3;
                } else {
                    p9Var3 = p9Var2;
                }
                i17 = i15 & (-458753);
                z13 = true;
                p9Var4 = p9Var3;
                rVar3 = rVar2;
                oVar2 = oVar;
            }
            int i23 = i17;
            z1.r rVar7 = rVar3;
            sVar.q();
            sVar.d0(783532531);
            objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = com.google.android.material.datepicker.d.f(sVar);
            }
            iVar = (h0.i) objQ;
            sVar.p(false);
            if (cVar != null) {
                l1.c3 c3Var2 = s4.f31053a;
                i18 = 2;
                rVarD = q0.c.d(c5.f30080a, z11, iVar, z13, new g3.k(2), cVar);
            } else {
                i18 = 2;
                rVarD = oVar2;
            }
            int i24 = i23 << 3;
            b(j0.e2.l(j0.e2.w(rVar7.i(rVarD), z1.c.f58467e, i18), f30997c, f30998d), z11, z13, p9Var4, iVar, y7.a(k1.h0.f37549h, sVar), sVar, (i24 & 112) | ((i23 >> 6) & 896) | (i24 & 57344));
            z14 = z13;
            p9Var5 = p9Var4;
            rVar4 = rVar7;
        } else {
            sVar.Y();
            i16 = i11 & 1;
            oVar = z1.o.f58481a;
            if (i16 != 0) {
                if (i19 != 0) {
                    rVar2 = oVar;
                }
                s1Var = (s1) sVar.j(v1.f31180a);
                p9Var2 = s1Var.Y;
                j11 = s1Var.f31033p;
                if (p9Var2 == null) {
                    long jC7 = v1.c(s1Var, k1.h0.f37551j);
                    long jC8 = v1.c(s1Var, k1.h0.m);
                    long j15 = g2.x.f28621h;
                    p9Var3 = new p9(jC7, jC8, j15, v1.c(s1Var, k1.h0.f37553l), v1.c(s1Var, k1.h0.f37560t), v1.c(s1Var, k1.h0.f37563w), v1.c(s1Var, k1.h0.f37559s), v1.c(s1Var, k1.h0.f37562v), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37542a), 1.0f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37544c), 0.12f), j11), j15, g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37543b), 0.38f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37545d), 0.38f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37547f), 0.12f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37548g), 0.12f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37546e), 0.38f), j11));
                    s1Var.Y = p9Var3;
                } else {
                    p9Var3 = p9Var2;
                }
                i17 = i15 & (-458753);
                z13 = true;
                p9Var4 = p9Var3;
                rVar3 = rVar2;
                oVar2 = oVar;
            } else {
                if (i19 != 0) {
                    rVar2 = oVar;
                }
                s1Var = (s1) sVar.j(v1.f31180a);
                p9Var2 = s1Var.Y;
                j11 = s1Var.f31033p;
                if (p9Var2 == null) {
                    long jC9 = v1.c(s1Var, k1.h0.f37551j);
                    long jC10 = v1.c(s1Var, k1.h0.m);
                    long j16 = g2.x.f28621h;
                    p9Var3 = new p9(jC9, jC10, j16, v1.c(s1Var, k1.h0.f37553l), v1.c(s1Var, k1.h0.f37560t), v1.c(s1Var, k1.h0.f37563w), v1.c(s1Var, k1.h0.f37559s), v1.c(s1Var, k1.h0.f37562v), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37542a), 1.0f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37544c), 0.12f), j11), j16, g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37543b), 0.38f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37545d), 0.38f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37547f), 0.12f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37548g), 0.12f), j11), g2.f0.l(g2.x.c(v1.c(s1Var, k1.h0.f37546e), 0.38f), j11));
                    s1Var.Y = p9Var3;
                } else {
                    p9Var3 = p9Var2;
                }
                i17 = i15 & (-458753);
                z13 = true;
                p9Var4 = p9Var3;
                rVar3 = rVar2;
                oVar2 = oVar;
            }
            int i25 = i17;
            z1.r rVar8 = rVar3;
            sVar.q();
            sVar.d0(783532531);
            objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = com.google.android.material.datepicker.d.f(sVar);
            }
            iVar = (h0.i) objQ;
            sVar.p(false);
            if (cVar != null) {
                l1.c3 c3Var3 = s4.f31053a;
                i18 = 2;
                rVarD = q0.c.d(c5.f30080a, z11, iVar, z13, new g3.k(2), cVar);
            } else {
                i18 = 2;
                rVarD = oVar2;
            }
            int i26 = i25 << 3;
            b(j0.e2.l(j0.e2.w(rVar8.i(rVarD), z1.c.f58467e, i18), f30997c, f30998d), z11, z13, p9Var4, iVar, y7.a(k1.h0.f37549h, sVar), sVar, (i26 & 112) | ((i25 >> 6) & 896) | (i26 & 57344));
            z14 = z13;
            p9Var5 = p9Var4;
            rVar4 = rVar8;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new a1(z11, cVar, rVar4, z14, p9Var5, i11, i12, 2);
        }
    }

    public static final void b(z1.r rVar, boolean z11, boolean z12, p9 p9Var, h0.i iVar, g2.w0 w0Var, l1.n nVar, int i11) {
        int i12;
        long j11;
        long j12;
        long j13;
        long j14;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1594099146);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.g(z12) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(p9Var) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(null) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.f(iVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.f(w0Var) ? 1048576 : 524288;
        }
        if ((i12 & 599187) == 599186 && sVar.F()) {
            sVar.W();
        } else {
            if (z12) {
                j11 = z11 ? p9Var.f30868b : p9Var.f30872f;
            } else {
                j11 = z11 ? p9Var.f30876j : p9Var.f30879n;
            }
            if (z12) {
                j12 = z11 ? p9Var.f30867a : p9Var.f30871e;
            } else {
                j12 = z11 ? p9Var.f30875i : p9Var.m;
            }
            g2.w0 w0VarA = y7.a(k1.h0.f37557q, sVar);
            float f5 = k1.h0.f37556p;
            if (z12) {
                j13 = j11;
                j14 = z11 ? p9Var.f30869c : p9Var.f30873g;
            } else {
                j13 = j11;
                j14 = z11 ? p9Var.f30877k : p9Var.f30880o;
            }
            z1.r rVarH = d0.n.h(d0.n.j(rVar, f5, j14, w0VarA), j13, w0VarA);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarH);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            z1.r rVarH2 = d0.n.h(d0.c1.a(j0.r.f35391a.a(z1.o.f58481a, z1.c.f58466d).i(new va(iVar, z11)), iVar, l7.a(false, k1.h0.f37554n / 2, 0L, sVar, 54, 4)), j12, w0Var);
            w2.q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarH2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD2, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            sVar.d0(1163457794);
            sVar.p(false);
            sVar.p(true);
            sVar.p(true);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q9(rVar, z11, z12, p9Var, iVar, w0Var, i11);
        }
    }
}
