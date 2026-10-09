package h1;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f30805a = k1.f0.f37520j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f30806b;

    static {
        float f5 = k1.f0.f37518h;
        f30806b = f5;
        ef.e.a(f5, k1.f0.f37517g);
        float f11 = k1.f0.f37511a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0131  */
    /* JADX WARN: Code duplicated, block: B:106:0x0140  */
    /* JADX WARN: Code duplicated, block: B:107:0x0143  */
    /* JADX WARN: Code duplicated, block: B:110:0x014d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0153  */
    /* JADX WARN: Code duplicated, block: B:118:0x0162  */
    /* JADX WARN: Code duplicated, block: B:120:0x0166  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:92:0x0110  */
    /* JADX WARN: Code duplicated, block: B:94:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x012b  */
    public static final void a(float f5, fz.c cVar, z1.r rVar, boolean z11, fz.a aVar, g8 g8Var, h0.i iVar, int i11, t1.d dVar, t1.d dVar2, lz.d dVar3, l1.n nVar, int i12, int i13, int i14) {
        int i15;
        z1.r rVar2;
        g8 g8Var2;
        h0.i iVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        fz.a aVar2;
        int i21;
        fz.a aVar3;
        boolean z12;
        boolean z13;
        boolean z14;
        Object objQ;
        l1.s sVar;
        boolean z15;
        l1.x1 x1VarT;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1191170377);
        if ((i12 & 6) == 0) {
            i15 = (sVar2.c(f5) ? 4 : 2) | i12;
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= sVar2.h(cVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            rVar2 = rVar;
            i15 |= sVar2.f(rVar2) ? 256 : 128;
        } else {
            rVar2 = rVar;
        }
        int i27 = i15 | 3072;
        int i28 = i14 & 16;
        if (i28 == 0) {
            if ((i12 & 24576) == 0) {
                i27 |= sVar2.h(aVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            if ((196608 & i12) == 0) {
                g8Var2 = g8Var;
                if (sVar2.f(g8Var2)) {
                    i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i26 = 65536;
                }
                i27 |= i26;
            } else {
                g8Var2 = g8Var;
            }
            if ((1572864 & i12) == 0) {
                iVar2 = iVar;
                if (sVar2.f(iVar2)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i27 |= i25;
            } else {
                iVar2 = iVar;
            }
            i16 = i14 & 128;
            if (i16 != 0) {
                i27 |= 12582912;
                i17 = i11;
            } else {
                i17 = i11;
                if ((i12 & 12582912) == 0) {
                    if (sVar2.d(i17)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i27 |= i18;
                }
            }
            if ((i12 & 100663296) == 0) {
                if (sVar2.h(dVar)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i27 |= i24;
            }
            if ((i12 & 805306368) == 0) {
                if (sVar2.h(dVar2)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i27 |= i23;
            }
            if ((i13 & 6) == 0) {
                if (sVar2.f(dVar3)) {
                    i22 = 4;
                } else {
                    i22 = 2;
                }
                i19 = i13 | i22;
            } else {
                i19 = i13;
            }
            if ((i27 & 306783379) != 306783378 && (i19 & 3) == 2 && sVar2.F()) {
                sVar2.W();
                z15 = z11;
                sVar = sVar2;
                i21 = i17;
                aVar3 = aVar;
            } else {
                sVar2.Y();
                boolean z16 = true;
                if ((i12 & 1) != 0 || sVar2.C()) {
                    if (i28 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    i21 = i17;
                    aVar3 = aVar2;
                    z12 = true;
                } else {
                    sVar2.W();
                    z12 = z11;
                    i21 = i17;
                    aVar3 = aVar;
                }
                sVar2.q();
                if ((29360128 & i27) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z17 = z12;
                if ((((i19 & 14) ^ 6) > 4 || !sVar2.f(dVar3)) && (i19 & 6) != 4) {
                }
                z14 = z13 | z16;
                objQ = sVar2.Q();
                if (z14 || objQ == l1.m.f39353a) {
                    objQ = new p8(f5, i21, aVar3, dVar3);
                    sVar2.o0(objQ);
                }
                p8 p8Var = (p8) objQ;
                p8Var.f30853b = aVar3;
                p8Var.f30856e = cVar;
                p8Var.c(f5);
                int i29 = ((i27 >> 3) & 1008) | ((i27 >> 6) & 57344);
                int i30 = i27 >> 9;
                sVar = sVar2;
                b(p8Var, rVar2, z17, null, iVar2, dVar, dVar2, sVar, i29 | (458752 & i30) | (i30 & 3670016));
                z15 = z17;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new k8(f5, cVar, rVar, z15, aVar3, g8Var2, iVar, i21, dVar, dVar2, dVar3, i12, i13, i14);
            }
        }
        i27 = i15 | 27648;
        if ((196608 & i12) == 0) {
            g8Var2 = g8Var;
            if (sVar2.f(g8Var2)) {
                i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
            } else {
                i26 = 65536;
            }
            i27 |= i26;
        } else {
            g8Var2 = g8Var;
        }
        if ((1572864 & i12) == 0) {
            iVar2 = iVar;
            if (sVar2.f(iVar2)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i27 |= i25;
        } else {
            iVar2 = iVar;
        }
        i16 = i14 & 128;
        if (i16 != 0) {
            i27 |= 12582912;
            i17 = i11;
        } else {
            i17 = i11;
            if ((i12 & 12582912) == 0) {
                if (sVar2.d(i17)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i27 |= i18;
            }
        }
        if ((i12 & 100663296) == 0) {
            if (sVar2.h(dVar)) {
                i24 = 67108864;
            } else {
                i24 = 33554432;
            }
            i27 |= i24;
        }
        if ((i12 & 805306368) == 0) {
            if (sVar2.h(dVar2)) {
                i23 = 536870912;
            } else {
                i23 = 268435456;
            }
            i27 |= i23;
        }
        if ((i13 & 6) == 0) {
            if (sVar2.f(dVar3)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i19 = i13 | i22;
        } else {
            i19 = i13;
        }
        if ((i27 & 306783379) != 306783378) {
            sVar2.Y();
            boolean z18 = true;
            if ((i12 & 1) != 0) {
                if (i28 != 0) {
                    aVar2 = null;
                } else {
                    aVar2 = aVar;
                }
                if (i16 != 0) {
                    i17 = 0;
                }
                i21 = i17;
                aVar3 = aVar2;
                z12 = true;
            } else {
                if (i28 != 0) {
                    aVar2 = null;
                } else {
                    aVar2 = aVar;
                }
                if (i16 != 0) {
                    i17 = 0;
                }
                i21 = i17;
                aVar3 = aVar2;
                z12 = true;
            }
            sVar2.q();
            if ((29360128 & i27) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z19 = z12;
            z18 = ((i19 & 14) ^ 6) > 4 ? false : false;
            z14 = z13 | z18;
            objQ = sVar2.Q();
            if (z14) {
                objQ = new p8(f5, i21, aVar3, dVar3);
                sVar2.o0(objQ);
            } else {
                objQ = new p8(f5, i21, aVar3, dVar3);
                sVar2.o0(objQ);
            }
            p8 p8Var2 = (p8) objQ;
            p8Var2.f30853b = aVar3;
            p8Var2.f30856e = cVar;
            p8Var2.c(f5);
            int i210 = ((i27 >> 3) & 1008) | ((i27 >> 6) & 57344);
            int i31 = i27 >> 9;
            sVar = sVar2;
            b(p8Var2, rVar2, z19, null, iVar2, dVar, dVar2, sVar, i210 | (458752 & i31) | (i31 & 3670016));
            z15 = z19;
        } else {
            sVar2.Y();
            boolean z110 = true;
            if ((i12 & 1) != 0) {
                if (i28 != 0) {
                    aVar2 = null;
                } else {
                    aVar2 = aVar;
                }
                if (i16 != 0) {
                    i17 = 0;
                }
                i21 = i17;
                aVar3 = aVar2;
                z12 = true;
            } else {
                if (i28 != 0) {
                    aVar2 = null;
                } else {
                    aVar2 = aVar;
                }
                if (i16 != 0) {
                    i17 = 0;
                }
                i21 = i17;
                aVar3 = aVar2;
                z12 = true;
            }
            sVar2.q();
            if ((29360128 & i27) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z111 = z12;
            if (((i19 & 14) ^ 6) > 4) {
            }
            z14 = z13 | z110;
            objQ = sVar2.Q();
            if (z14) {
                objQ = new p8(f5, i21, aVar3, dVar3);
                sVar2.o0(objQ);
            } else {
                objQ = new p8(f5, i21, aVar3, dVar3);
                sVar2.o0(objQ);
            }
            p8 p8Var3 = (p8) objQ;
            p8Var3.f30853b = aVar3;
            p8Var3.f30856e = cVar;
            p8Var3.c(f5);
            int i211 = ((i27 >> 3) & 1008) | ((i27 >> 6) & 57344);
            int i32 = i27 >> 9;
            sVar = sVar2;
            b(p8Var3, rVar2, z111, null, iVar2, dVar, dVar2, sVar, i211 | (458752 & i32) | (i32 & 3670016));
            z15 = z111;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k8(f5, cVar, rVar, z15, aVar3, g8Var2, iVar, i21, dVar, dVar2, dVar3, i12, i13, i14);
        }
    }

    public static final void b(p8 p8Var, z1.r rVar, boolean z11, g8 g8Var, h0.i iVar, t1.d dVar, t1.d dVar2, l1.n nVar, int i11) {
        int i12;
        int i13;
        g8 g8VarB;
        g8 g8Var2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1303883986);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(p8Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.f(iVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(dVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.h(dVar2) ? 1048576 : 524288;
        }
        if ((599187 & i12) == 599186 && sVar.F()) {
            sVar.W();
            g8Var2 = g8Var;
        } else {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                int i14 = i8.f30425a;
                i13 = i12 & (-7169);
                g8VarB = i8.b((s1) sVar.j(v1.f31180a));
            } else {
                sVar.W();
                i13 = i12 & (-7169);
                g8VarB = g8Var;
            }
            sVar.q();
            if (p8Var.f30852a < 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            int i15 = i13 >> 3;
            c(rVar, p8Var, z11, iVar, dVar, dVar2, sVar, (i13 & 896) | (i15 & 14) | ((i13 << 3) & 112) | (i15 & 7168) | (57344 & i15) | (i15 & 458752));
            g8Var2 = g8VarB;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j8(p8Var, rVar, z11, g8Var2, iVar, dVar, dVar2, i11);
        }
    }

    public static final void c(z1.r rVar, p8 p8Var, boolean z11, h0.i iVar, t1.d dVar, t1.d dVar2, l1.n nVar, int i11) {
        int i12;
        z1.r e0Var;
        int i13;
        boolean z12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1390990089);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(p8Var) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(iVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(dVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(dVar2) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        int i14 = i12;
        if ((74899 & i14) == 74898 && sVar.F()) {
            sVar.W();
        } else {
            p8Var.f30859h = sVar.j(z2.g1.f58552n) == v3.m.Rtl;
            vy.d dVar3 = null;
            z1.o oVar = z1.o.f58481a;
            if (z11) {
                gu.b bVar = new gu.b(p8Var, dVar3, 7);
                s2.l lVar = s2.g0.f51302a;
                e0Var = new s2.e0(p8Var, iVar, null, new s2.f0(bVar), 4);
            } else {
                e0Var = oVar;
            }
            f0.h1 h1Var = f0.h1.Horizontal;
            boolean z13 = p8Var.f30859h;
            boolean zBooleanValue = ((Boolean) p8Var.f30862k.getValue()).booleanValue();
            boolean zH = sVar.h(p8Var);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                i13 = 1;
                objQ = new g.k(p8Var, dVar3, i13);
                sVar.o0(objQ);
            } else {
                i13 = 1;
            }
            z1.r rVarA = f0.p0.a(oVar, p8Var, h1Var, z11, iVar, zBooleanValue, (fz.f) objQ, z13, 32);
            l1.c3 c3Var = s4.f31053a;
            z1.r rVarI = g3.r.b(j0.e2.m(rVar.i(c5.f30080a), f30806b, f30805a, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), false, new a0.d1(z11, p8Var, i13)).i(i1.g.f34017b);
            final float fL = p8Var.f30855d.l();
            lz.d dVar4 = p8Var.f30854c;
            final lz.d dVar5 = new lz.d(dVar4.f40530a, dVar4.f40531b);
            final int i15 = p8Var.f30852a;
            z1.r rVarI2 = d0.n.q(g3.r.b(rVarI, true, new fz.c() { // from class: d0.z1
                @Override // fz.c
                public final Object invoke(Object obj) {
                    Float fValueOf = Float.valueOf(fL);
                    lz.d dVar6 = dVar5;
                    g3.z.c((g3.b0) obj, new g3.j(((Number) hz.b.o(fValueOf, dVar6)).floatValue(), dVar6, i15));
                    return qy.b0.f48488a;
                }
            }), z11, iVar).i(e0Var).i(rVarA);
            boolean zH2 = sVar.h(p8Var);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                objQ2 = new n8(p8Var, 0);
                sVar.o0(objQ2);
            }
            w2.q0 q0Var = (w2.q0) objQ2;
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarI2);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0Var, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            z1.r rVarX = j0.e2.x(w2.a0.l(oVar, h8.THUMB), 3);
            boolean zH3 = sVar.h(p8Var);
            Object objQ3 = sVar.Q();
            if (zH3 || objQ3 == gVar) {
                z12 = false;
                objQ3 = new l8(p8Var, 0);
                sVar.o0(objQ3);
            } else {
                z12 = false;
            }
            z1.r rVarO = w2.a0.o(rVarX, (fz.c) objQ3);
            z1.j jVar = z1.c.f58463a;
            w2.q0 q0VarD = j0.o.d(jVar, z12);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarO);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            int i16 = (i14 >> 3) & 14;
            dVar.invoke(p8Var, sVar, Integer.valueOf(((i14 >> 9) & 112) | i16));
            sVar.p(true);
            z1.r rVarL = w2.a0.l(oVar, h8.TRACK);
            w2.q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarL);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            dVar2.invoke(p8Var, sVar, Integer.valueOf(i16 | ((i14 >> 12) & 112)));
            sVar.p(true);
            sVar.p(true);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new a5(rVar, p8Var, z11, iVar, dVar, dVar2, i11);
        }
    }

    public static final float d(float f5, float f11, float f12, float[] fArr) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f13 = fArr[0];
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f13);
            } else {
                float fAbs = Math.abs(android.support.v4.media.session.a.A(f11, f12, f13) - f5);
                lz.g gVar = new lz.g(1, length, 1);
                int i11 = gVar.f40533b;
                int i12 = gVar.f40534c;
                boolean z11 = i12 <= 0 ? 1 >= i11 : 1 <= i11;
                int i13 = z11 ? 1 : i11;
                while (z11) {
                    if (i13 != i11) {
                        i13 += i12;
                    } else {
                        if (!z11) {
                            throw new NoSuchElementException();
                        }
                        z11 = false;
                        i13 = i13;
                    }
                    float f14 = fArr[i13];
                    float fAbs2 = Math.abs(android.support.v4.media.session.a.A(f11, f12, f14) - f5);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f13 = f14;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f13);
            }
        }
        return fValueOf != null ? android.support.v4.media.session.a.A(f11, f12, fValueOf.floatValue()) : f5;
    }
}
