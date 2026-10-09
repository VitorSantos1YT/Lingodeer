package h1;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f30637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0.v1 f30638b;

    static {
        float f5 = 8;
        f30637a = f5;
        j0.c.d(f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
        f30638b = j0.c.d(f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
        j0.c.d(f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
    public static final void a(boolean z11, fz.a aVar, t1.d dVar, z1.r rVar, boolean z12, g2.w0 w0Var, r7 r7Var, s7 s7Var, d0.v vVar, l1.n nVar, int i11) {
        int i12;
        z1.r rVar2;
        g2.w0 w0Var2;
        d0.v vVar2;
        s7 s7Var2;
        z1.r rVar3;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1711985619);
        int i13 = i11 | (sVar.g(z11) ? 4 : 2) | (sVar.h(aVar) ? 32 : 16) | 3072 | (sVar.g(z12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | 5963776 | (sVar.f(r7Var) ? 67108864 : 33554432) | 268435456;
        if ((306783379 & i13) == 306783378 && sVar.F()) {
            sVar.W();
            rVar3 = rVar;
            w0Var2 = w0Var;
            s7Var2 = s7Var;
            vVar2 = vVar;
        } else {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                float f5 = f4.f30233a;
                g2.w0 w0VarA = y7.a(k1.o.f37655b, sVar);
                float f11 = k1.o.f37658e;
                s7 s7Var3 = new s7(f11, k1.o.f37666n, k1.o.f37664k, k1.o.f37665l, k1.o.f37657d, f11);
                int i14 = i13 & (-1908408321);
                long jD = v1.d(k1.o.f37667o, sVar);
                long j11 = g2.x.f28621h;
                long jC = g2.x.c(v1.d(k1.o.f37661h, sVar), k1.o.f37662i);
                float f12 = k1.o.f37668p;
                float f13 = k1.o.m;
                if (z12) {
                    if (z11) {
                        jD = j11;
                    }
                } else if (z11) {
                    jD = j11;
                } else {
                    jD = jC;
                }
                if (z11) {
                    f12 = f13;
                }
                d0.v vVarA = d0.n.a(jD, f12);
                i12 = i14;
                rVar2 = z1.o.f58481a;
                w0Var2 = w0VarA;
                vVar2 = vVarA;
                s7Var2 = s7Var3;
            } else {
                sVar.W();
                w0Var2 = w0Var;
                s7Var2 = s7Var;
                vVar2 = vVar;
                i12 = i13 & (-1908408321);
                rVar2 = rVar;
            }
            sVar.q();
            b(z11, rVar2, aVar, z12, dVar, fc.a(k1.o.f37669q, sVar), w0Var2, r7Var, s7Var2, vVar2, f4.f30233a, f30638b, sVar, 102260736 | (i12 & 14) | 12582960 | ((i12 << 3) & 896) | ((i12 >> 3) & 7168), ((i12 >> 24) & 14) | 224256);
            rVar3 = rVar2;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j1(z11, aVar, dVar, rVar3, z12, w0Var2, r7Var, s7Var2, vVar2, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v25 */
    public static final void b(boolean z11, z1.r rVar, fz.a aVar, boolean z12, t1.d dVar, j3.y0 y0Var, g2.w0 w0Var, r7 r7Var, s7 s7Var, d0.v vVar, float f5, j0.t1 t1Var, l1.n nVar, int i11, int i12) {
        int i13;
        int i14;
        long j11;
        float f11;
        b0.d dVar2;
        boolean z13;
        b0.n nVar2;
        ?? r9;
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(402951308);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.g(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar2.h(aVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar2.g(z12) ? 2048 : 1024;
        }
        int i15 = i11 & 24576;
        int i16 = OSSConstants.DEFAULT_BUFFER_SIZE;
        if (i15 == 0) {
            i13 |= sVar2.h(dVar) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= sVar2.f(y0Var) ? 131072 : 65536;
        }
        vy.d dVar3 = null;
        if ((i11 & 1572864) == 0) {
            i13 |= sVar2.h(null) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= sVar2.h(null) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= sVar2.h(null) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= sVar2.f(w0Var) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (sVar2.f(r7Var) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar2.f(s7Var) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= sVar2.f(vVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= sVar2.c(f5) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            if (sVar2.f(t1Var)) {
                i16 = 16384;
            }
            i14 |= i16;
        }
        if ((i12 & 196608) == 0) {
            i14 |= sVar2.f(null) ? 131072 : 65536;
        }
        if ((i13 & 306783379) == 306783378 && (i14 & 74899) == 74898 && sVar2.F()) {
            sVar2.W();
            sVar = sVar2;
        } else {
            sVar2.d0(2072749057);
            Object objQ = sVar2.Q();
            Object obj = l1.m.f39353a;
            if (objQ == obj) {
                objQ = com.google.android.material.datepicker.d.f(sVar2);
            }
            h0.i iVar = (h0.i) objQ;
            sVar2.p(false);
            z1.r rVarB = g3.r.b(rVar, false, o0.f30766c);
            if (z12) {
                j11 = !z11 ? r7Var.f30981a : r7Var.f30989i;
            } else {
                j11 = z11 ? r7Var.f30990j : r7Var.f30985e;
            }
            long j12 = j11;
            sVar2.d0(2072762384);
            if (s7Var == null) {
                iVar = iVar;
                i13 = i13;
                r9 = 0;
                nVar2 = null;
            } else {
                int i17 = ((i13 >> 9) & 14) | ((i14 << 3) & 896);
                Object objQ2 = sVar2.Q();
                if (objQ2 == obj) {
                    objQ2 = new x1.p();
                    sVar2.o0(objQ2);
                }
                x1.p pVar = (x1.p) objQ2;
                Object objQ3 = sVar2.Q();
                if (objQ3 == obj) {
                    objQ3 = l1.t.B(null);
                    sVar2.o0(objQ3);
                }
                l1.b1 b1Var = (l1.b1) objQ3;
                boolean zF = sVar2.f(iVar);
                Object objQ4 = sVar2.Q();
                if (zF || objQ4 == obj) {
                    objQ4 = new l0(iVar, pVar, dVar3, 2);
                    sVar2.o0(objQ4);
                }
                l1.t.f((fz.e) objQ4, iVar, sVar2);
                h0.h hVar = (h0.h) ry.m.A0(pVar);
                if (!z12) {
                    f11 = s7Var.f31063f;
                } else if (hVar instanceof h0.k) {
                    f11 = s7Var.f31059b;
                } else if (hVar instanceof h0.f) {
                    f11 = s7Var.f31061d;
                } else if (hVar instanceof h0.d) {
                    f11 = s7Var.f31060c;
                } else {
                    f11 = hVar instanceof h0.b ? s7Var.f31062e : s7Var.f31058a;
                }
                Object objQ5 = sVar2.Q();
                if (objQ5 == obj) {
                    objQ5 = new b0.d(new v3.f(f11), b0.e.f3498l, null, 12);
                    sVar2.o0(objQ5);
                }
                b0.d dVar4 = (b0.d) objQ5;
                v3.f fVar = new v3.f(f11);
                boolean zH = sVar2.h(dVar4) | sVar2.c(f11) | ((((i17 & 14) ^ 6) > 4 && sVar2.g(z12)) || (i17 & 6) == 4) | sVar2.h(hVar);
                Object objQ6 = sVar2.Q();
                if (zH || objQ6 == obj) {
                    dVar2 = dVar4;
                    z13 = false;
                    m0 m0Var = new m0(dVar2, f11, z12, hVar, b1Var, null);
                    sVar2.o0(m0Var);
                    objQ6 = m0Var;
                } else {
                    dVar2 = dVar4;
                    z13 = false;
                }
                l1.t.f((fz.e) objQ6, fVar, sVar2);
                nVar2 = dVar2.f3472c;
                r9 = z13;
            }
            sVar2.p(r9);
            l1.s sVar3 = sVar2;
            int i18 = i13;
            i9.b(z11, aVar, rVarB, z12, w0Var, j12, 0L, nVar2 != null ? ((v3.f) nVar2.f3614b.getValue()).f53489a : (float) r9, vVar, iVar, t1.e.d(-577614814, new k1(r7Var, z12, z11, dVar, y0Var, f5, t1Var), sVar3), sVar3, (i18 & 14) | ((i18 >> 3) & 112) | (i18 & 7168) | ((i18 >> 15) & 57344) | ((i14 << 21) & 1879048192), 192);
            sVar = sVar3;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new l1(z11, rVar, aVar, z12, dVar, y0Var, w0Var, r7Var, s7Var, vVar, f5, t1Var, i11, i12);
        }
    }

    public static final void c(t1.d dVar, j3.y0 y0Var, long j11, long j12, long j13, float f5, j0.t1 t1Var, l1.n nVar, int i11) {
        t1.d dVar2;
        int i12;
        long j14;
        long j15;
        j0.t1 t1Var2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-782878228);
        if ((i11 & 6) == 0) {
            dVar2 = dVar;
            i12 = (sVar.h(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(y0Var) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.e(j11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(null) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(null) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(null) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            j14 = j12;
            i12 |= sVar.e(j14) ? 1048576 : 524288;
        } else {
            j14 = j12;
        }
        if ((12582912 & i11) == 0) {
            j15 = j13;
            i12 |= sVar.e(j15) ? 8388608 : 4194304;
        } else {
            j15 = j13;
        }
        if ((100663296 & i11) == 0) {
            i12 |= sVar.c(f5) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            t1Var2 = t1Var;
            i12 |= sVar.f(t1Var2) ? 536870912 : 268435456;
        } else {
            t1Var2 = t1Var;
        }
        if ((i12 & 306783379) == 306783378 && sVar.F()) {
            sVar.W();
        } else {
            l1.t.b(new l1.w1[]{h2.f30320a.a(new g2.x(j11)), ua.f31167a.a(y0Var)}, t1.e.d(1748799148, new h1(f5, t1Var2, j14, dVar2, j15), sVar), sVar, 56);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i1(dVar, y0Var, j11, j12, j13, f5, t1Var, i11);
        }
    }
}
