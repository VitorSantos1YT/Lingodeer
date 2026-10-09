package w2;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f54471a = new w0(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f54472b = new Object();

    public static final void a(p1 p1Var, z1.r rVar, fz.e eVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-511989831);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(p1Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(eVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            int iHashCode = Long.hashCode(sVar.T);
            l1.q qVarG = l1.t.G(sVar);
            z1.r rVarC = z1.a.c(sVar, rVar);
            l1.q1 q1VarL = sVar.l();
            y2.i iVar = y2.i.f56873c;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(p1Var.f54561c, p1Var, sVar);
            l1.t.J(p1Var.f54562d, qVarG, sVar);
            l1.t.J(p1Var.f54563e, eVar, sVar);
            y2.k.J.getClass();
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            l1.t.F(sVar, y2.j.f56919h);
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            l1.t.y(sVar, Integer.valueOf(iHashCode), y2.j.f56918g);
            sVar.p(true);
            if (sVar.F()) {
                sVar.d0(-1266202711);
            } else {
                sVar.d0(-1259244916);
                boolean zH = sVar.h(p1Var);
                Object objQ = sVar.Q();
                if (zH || objQ == l1.m.f39353a) {
                    objQ = new l1(p1Var, 0);
                    sVar.o0(objQ);
                }
                l1.t.j((fz.a) objQ, sVar);
            }
            sVar.p(false);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new o6.f(p1Var, rVar, eVar, i11);
        }
    }

    public static final void b(z1.r rVar, fz.e eVar, l1.n nVar, int i11, int i12) {
        int i13;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1298353104);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar.h(eVar) ? 32 : 16;
        }
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            if (i14 != 0) {
                rVar = z1.o.f58481a;
            }
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new p1(w0.f54597b);
                sVar.o0(objQ);
            }
            a((p1) objQ, rVar, eVar, sVar, (i13 << 3) & 1008);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6.q(rVar, eVar, i11, i12);
        }
    }

    public static final float c(long j11, long j12) {
        return Math.min(Float.intBitsToFloat((int) (j12 >> 32)) / Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)) / Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final float d(f1 f1Var, boolean z11, p[] pVarArr, float f5) {
        float f11 = Float.NaN;
        for (p pVar : pVarArr) {
            float fB = f1Var.b(pVar);
            if (Float.isNaN(f11)) {
                f11 = fB;
            } else if (z11 == (fB > f11)) {
                f11 = fB;
            }
        }
        return Float.isNaN(f11) ? f5 : f11;
    }

    public static final f2.c e(x xVar) {
        x xVarH = xVar.H();
        return xVarH != null ? xVarH.E(xVar, true) : new f2.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (int) (xVar.m() >> 32), (int) (xVar.m() & 4294967295L));
    }

    public static final f2.c f(x xVar, boolean z11) {
        x xVarH = h(xVar);
        float fM = (int) (xVarH.m() >> 32);
        float fM2 = (int) (xVarH.m() & 4294967295L);
        f2.c cVarE = xVarH.E(xVar, z11);
        float f5 = cVarE.f26575d;
        float f11 = cVarE.f26574c;
        float f12 = cVarE.f26573b;
        float f13 = cVarE.f26572a;
        if (z11) {
            if (f13 < CropImageView.DEFAULT_ASPECT_RATIO) {
                f13 = 0.0f;
            }
            if (f13 > fM) {
                f13 = fM;
            }
        }
        if (z11) {
            if (f12 < CropImageView.DEFAULT_ASPECT_RATIO) {
                f12 = 0.0f;
            }
            if (f12 > fM2) {
                f12 = fM2;
            }
        }
        if (z11) {
            if (f11 < CropImageView.DEFAULT_ASPECT_RATIO) {
                f11 = 0.0f;
            }
            if (f11 <= fM) {
                fM = f11;
            }
            f11 = fM;
        }
        if (z11) {
            if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                f5 = 0.0f;
            }
            if (f5 <= fM2) {
                fM2 = f5;
            }
            f5 = fM2;
        }
        if (f13 == f11 || f12 == f5) {
            return f2.c.f26571e;
        }
        long jC = xVarH.c((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L));
        long jC2 = xVarH.c((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L));
        long jC3 = xVarH.c((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L));
        long jC4 = xVarH.c((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jC >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jC2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jC4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jC3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jC & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jC2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jC4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jC3 & 4294967295L));
        return new f2.c(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final boolean g(long j11, long j12) {
        return j11 == j12;
    }

    public static final x h(x xVar) {
        x xVar2;
        x xVarH = xVar.H();
        while (true) {
            x xVar3 = xVarH;
            xVar2 = xVar;
            xVar = xVar3;
            if (xVar == null) {
                break;
            }
            xVarH = xVar.H();
        }
        y2.k1 k1Var = xVar2 instanceof y2.k1 ? (y2.k1) xVar2 : null;
        if (k1Var == null) {
            return xVar2;
        }
        y2.k1 k1Var2 = k1Var.S;
        while (true) {
            y2.k1 k1Var3 = k1Var2;
            y2.k1 k1Var4 = k1Var;
            k1Var = k1Var3;
            if (k1Var == null) {
                return k1Var4;
            }
            k1Var2 = k1Var.S;
        }
    }

    public static final Object i(p0 p0Var) {
        Object objG = p0Var.G();
        b0 b0Var = objG instanceof b0 ? (b0) objG : null;
        if (b0Var != null) {
            return b0Var.Q;
        }
        return null;
    }

    public static final y2.r0 j(y2.r0 r0Var) {
        y2.i0 i0Var = r0Var.Q.Q;
        while (true) {
            y2.i0 i0VarW = i0Var.w();
            y2.i0 i0Var2 = null;
            if ((i0VarW != null ? i0VarW.K : null) == null) {
                y2.r0 r0VarA1 = ((y2.k1) i0Var.f56892i0.f50087e).a1();
                kotlin.jvm.internal.m.c(r0VarA1);
                return r0VarA1;
            }
            y2.i0 i0VarW2 = i0Var.w();
            if (i0VarW2 != null) {
                i0Var2 = i0VarW2.K;
            }
            kotlin.jvm.internal.m.c(i0Var2);
            y2.i0 i0VarW3 = i0Var.w();
            kotlin.jvm.internal.m.c(i0VarW3);
            i0Var = i0VarW3.K;
            kotlin.jvm.internal.m.c(i0Var);
        }
    }

    public static final z1.r k(z1.r rVar, fz.f fVar) {
        return rVar.i(new y(fVar));
    }

    public static final z1.r l(z1.r rVar, Object obj) {
        return rVar.i(new z(obj));
    }

    public static final z1.r m(z1.r rVar, fz.c cVar) {
        return rVar.i(new x0(cVar));
    }

    public static final z1.r n(z1.r rVar, fz.c cVar) {
        return rVar.i(new z0(cVar));
    }

    public static final z1.r o(z1.r rVar, fz.c cVar) {
        return rVar.i(new b1(cVar));
    }

    public static final long p(long j11, long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) * Float.intBitsToFloat((int) (j11 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j12 & 4294967295L)) * Float.intBitsToFloat((int) (j11 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
