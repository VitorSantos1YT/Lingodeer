package j0;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f35254a = new b(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f35255b = new b(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x2.h f35256c = new x2.h(new hh.y(11));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final iv.c f35257d = new iv.c(9);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f35258e = 9;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f35259f = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f35260g = 10;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f35261h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f35262i = 15;

    public static final z1.r A(z1.r rVar, float f5) {
        return rVar.i(new p1(f5, f5, f5, f5));
    }

    public static final z1.r B(z1.r rVar, float f5, float f11) {
        return rVar.i(new p1(f5, f11, f5, f11));
    }

    public static z1.r C(z1.r rVar, float f5, float f11, int i11) {
        if ((i11 & 1) != 0) {
            f5 = 0;
        }
        if ((i11 & 2) != 0) {
            f11 = 0;
        }
        return B(rVar, f5, f11);
    }

    public static final z1.r D(z1.r rVar, float f5, float f11, float f12, float f13) {
        return rVar.i(new p1(f5, f11, f12, f13));
    }

    public static z1.r E(z1.r rVar, float f5, float f11, float f12, float f13, int i11) {
        if ((i11 & 1) != 0) {
            f5 = 0;
        }
        if ((i11 & 2) != 0) {
            f11 = 0;
        }
        if ((i11 & 4) != 0) {
            f12 = 0;
        }
        if ((i11 & 8) != 0) {
            f13 = 0;
        }
        return D(rVar, f5, f11, f12, f13);
    }

    public static final z1.r F(z1.r rVar) {
        return z1.a.a(rVar, new q2(2));
    }

    public static final long G(long j11, h1 h1Var) {
        return h1Var == h1.Horizontal ? v3.b.a(v3.a.j(j11), v3.a.h(j11), v3.a.i(j11), v3.a.g(j11)) : v3.b.a(v3.a.i(j11), v3.a.g(j11), v3.a.j(j11), v3.a.h(j11));
    }

    public static final b1 H(r4.d dVar) {
        return new b1(dVar.f48793a, dVar.f48794b, dVar.f48795c, dVar.f48796d);
    }

    public static final void I(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    public static final z1.r J(z1.r rVar, e1 e1Var) {
        return rVar.i(new f1(e1Var));
    }

    public static final void a(z1.r rVar, z1.e eVar, t1.d dVar, l1.n nVar, int i11, int i12) {
        int i13;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(380139498);
        if ((i11 & 6) == 0) {
            i13 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= sVar.f(eVar) ? 32 : 16;
        }
        int i15 = i13 | 384;
        if ((i11 & 3072) == 0) {
            i15 |= sVar.h(dVar) ? 2048 : 1024;
        }
        if (sVar.T(i15 & 1, (i15 & 1171) != 1170)) {
            if (i14 != 0) {
                eVar = z1.c.f58463a;
            }
            w2.q0 q0VarD = o.d(eVar, false);
            boolean zF = sVar.f(q0VarD) | ((i15 & 7168) == 2048);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = new fu.n(18, q0VarD, dVar);
                sVar.o0(objQ);
            }
            w2.a0.b(rVar, (fz.e) objQ, sVar, i15 & 14, 0);
        } else {
            sVar.W();
        }
        z1.e eVar2 = eVar;
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.d(rVar, eVar2, dVar, i11, i12, 5);
        }
    }

    public static final void b(z1.r rVar, f fVar, h hVar, int i11, t0 t0Var, t1.d dVar, l1.n nVar, int i12) {
        int i13;
        int i14;
        z1.i iVar = z1.c.L;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1956591841);
        if ((i12 & 6) == 0) {
            i13 = (sVar.f(rVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.f(fVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar.f(hVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.f(iVar) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= sVar.d(i11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i12) == 0) {
            i13 |= sVar.d(Integer.MAX_VALUE) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i12) == 0) {
            i13 |= sVar.f(t0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i12) == 0) {
            i13 |= sVar.h(dVar) ? 8388608 : 4194304;
        }
        int i15 = i13;
        if (sVar.T(i15 & 1, (i15 & 4793491) != 4793490)) {
            int i16 = i15 & 3670016;
            boolean z11 = i16 == 1048576;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new q0((m0) t0Var.f3561b);
                sVar.o0(objQ);
            }
            q0 q0Var = (q0) objQ;
            int i17 = i15 >> 3;
            boolean zF = ((((i17 & 14) ^ 6) > 4 && sVar.f(fVar)) || (i17 & 6) == 4) | ((((i17 & 112) ^ 48) > 32 && sVar.f(hVar)) || (i17 & 48) == 32) | ((((i17 & 896) ^ 384) > 256 && sVar.f(iVar)) || (i17 & 384) == 256) | ((((i17 & 7168) ^ 3072) > 2048 && sVar.d(i11)) || (i17 & 3072) == 2048) | ((((57344 & i17) ^ 24576) > 16384 && sVar.d(Integer.MAX_VALUE)) || (i17 & 24576) == 16384) | sVar.f(q0Var);
            Object objQ2 = sVar.Q();
            if (zF || objQ2 == gVar) {
                i14 = i16;
                s0 s0Var = new s0(fVar, hVar, fVar.a(), new z(iVar), hVar.a(), i11, q0Var);
                sVar.o0(s0Var);
                objQ2 = s0Var;
            } else {
                i14 = i16;
            }
            s0 s0Var2 = (s0) objQ2;
            boolean z12 = (i14 == 1048576) | ((i15 & 29360128) == 8388608) | ((i15 & 458752) == 131072);
            Object objQ3 = sVar.Q();
            Object obj = objQ3;
            if (z12 || objQ3 == gVar) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new t1.d(new l0(dVar, 0), true, -1192950673));
                t0Var.getClass();
                int i18 = n0.f35344a[((m0) t0Var.f3561b).ordinal()];
                sVar.o0(arrayList);
                obj = arrayList;
            }
            t1.d dVar2 = new t1.d(new ue.p(1, (List) obj), true, 1271844412);
            boolean zF2 = sVar.f(s0Var2);
            Object objQ4 = sVar.Q();
            if (zF2 || objQ4 == gVar) {
                objQ4 = new w2.v0(s0Var2);
                sVar.o0(objQ4);
            }
            w2.q0 q0Var2 = (w2.q0) objQ4;
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0Var2, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar2 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            hh.p0.x(0, dVar2, sVar, true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.n(rVar, fVar, hVar, i11, t0Var, dVar, i12);
        }
    }

    public static final void c(z1.r rVar, f fVar, h hVar, z1.i iVar, int i11, int i12, final t1.d dVar, l1.n nVar, final int i13, final int i14) {
        int i15;
        final z1.r rVar2;
        final f fVar2;
        final h hVar2;
        final z1.i iVar2;
        final int i16;
        final int i17;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1303174015);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (sVar.f(rVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= sVar.f(fVar) ? 32 : 16;
        }
        int i21 = i14 & 4;
        if (i21 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= sVar.f(hVar) ? 256 : 128;
        }
        int i22 = i15 | 3072;
        int i23 = i14 & 16;
        if (i23 != 0) {
            i22 = i15 | 27648;
        } else if ((i13 & 24576) == 0) {
            i22 |= sVar.d(i11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i24 = i22 | 196608;
        if (sVar.T(i24 & 1, (599187 & i24) != 599186)) {
            if (i18 != 0) {
                rVar = z1.o.f58481a;
            }
            z1.r rVar3 = rVar;
            if (i19 != 0) {
                fVar = i.f35303a;
            }
            if (i21 != 0) {
                hVar = i.f35305c;
            }
            h hVar3 = hVar;
            z1.i iVar3 = z1.c.L;
            int i25 = i23 != 0 ? Integer.MAX_VALUE : i11;
            f fVar3 = fVar;
            b(rVar3, fVar3, hVar3, i25, t0.f35418c, dVar, sVar, (i24 & 57344) | (i24 & 14) | 1572864 | (i24 & 112) | (i24 & 896) | 3072 | 12779520);
            iVar2 = iVar3;
            i16 = i25;
            i17 = Integer.MAX_VALUE;
            hVar2 = hVar3;
            fVar2 = fVar3;
            rVar2 = rVar3;
        } else {
            sVar.W();
            rVar2 = rVar;
            fVar2 = fVar;
            hVar2 = hVar;
            iVar2 = iVar;
            i16 = i11;
            i17 = i12;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: j0.k0
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c.c(rVar2, fVar2, hVar2, iVar2, i16, i17, dVar, (l1.n) obj, l1.t.M(i13 | 1), i14);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static v1 d(float f5, float f11, int i11) {
        if ((i11 & 1) != 0) {
            f5 = 0;
        }
        if ((i11 & 2) != 0) {
            f11 = 0;
        }
        return new v1(f5, f11, f5, f11);
    }

    public static final v1 e(float f5, float f11, float f12, float f13) {
        return new v1(f5, f11, f12, f13);
    }

    public static v1 f(float f5, float f11, float f12, float f13, int i11) {
        if ((i11 & 1) != 0) {
            f5 = 0;
        }
        if ((i11 & 2) != 0) {
            f11 = 0;
        }
        if ((i11 & 4) != 0) {
            f12 = 0;
        }
        if ((i11 & 8) != 0) {
            f13 = 0;
        }
        return new v1(f5, f11, f12, f13);
    }

    public static final void g(l1.n nVar, z1.r rVar) {
        n nVar2 = n.f35342c;
        l1.s sVar = (l1.s) nVar;
        int iHashCode = Long.hashCode(sVar.T);
        z1.r rVarC = z1.a.c(nVar, rVar);
        l1.q1 q1VarL = sVar.l();
        y2.k.J.getClass();
        y2.i iVar = y2.j.f56913b;
        l1.a aVar = sVar.f39434a;
        sVar.h0();
        if (sVar.S) {
            sVar.k(iVar);
        } else {
            sVar.r0();
        }
        l1.t.J(y2.j.f56917f, nVar2, nVar);
        l1.t.J(y2.j.f56916e, q1VarL, nVar);
        l1.t.J(y2.j.f56915d, rVarC, nVar);
        y2.h hVar = y2.j.f56918g;
        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
        }
        sVar.p(true);
    }

    public static f0 h(float f5, float f11, int i11) {
        if ((i11 & 1) != 0) {
            f5 = 0;
        }
        float f12 = 0;
        float f13 = 0;
        if ((i11 & 8) != 0) {
            f11 = 0;
        }
        return new f0(f5, f12, f13, f11);
    }

    public static z1.r j(z1.r rVar, float f5) {
        return rVar.i(new j(f5));
    }

    public static final float k(t1 t1Var, v3.m mVar) {
        return mVar == v3.m.Ltr ? t1Var.d(mVar) : t1Var.b(mVar);
    }

    public static final float l(t1 t1Var, v3.m mVar) {
        return mVar == v3.m.Ltr ? t1Var.b(mVar) : t1Var.d(mVar);
    }

    public static long m(long j11, h1 h1Var) {
        h1 h1Var2 = h1.Horizontal;
        return v3.b.a(h1Var == h1Var2 ? v3.a.j(j11) : v3.a.i(j11), h1Var == h1Var2 ? v3.a.h(j11) : v3.a.g(j11), h1Var == h1Var2 ? v3.a.i(j11) : v3.a.j(j11), h1Var == h1Var2 ? v3.a.g(j11) : v3.a.h(j11));
    }

    public static long n(int i11, long j11) {
        return v3.b.a(0, v3.a.h(j11), (i11 & 4) != 0 ? v3.a.i(j11) : 0, v3.a.g(j11));
    }

    public static final y1 o(w2.p0 p0Var) {
        Object objG = p0Var.G();
        if (objG instanceof y1) {
            return (y1) objG;
        }
        return null;
    }

    public static final float p(y1 y1Var) {
        return y1Var != null ? y1Var.f35441a : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public static final z1.r q(z1.r rVar, e1 e1Var) {
        return rVar.i(new c1(e1Var));
    }

    public static final z1.r r(z1.r rVar) {
        return z1.a.a(rVar, new q2(0));
    }

    public static final boolean s(long j11, int i11, int i12) {
        int iJ = v3.a.j(j11);
        if (i11 > v3.a.h(j11) || iJ > i11) {
            return false;
        }
        return i12 <= v3.a.g(j11) && v3.a.i(j11) <= i12;
    }

    public static final w2.r0 t(x1 x1Var, int i11, int i12, int i13, int i14, int i15, w2.s0 s0Var, List list, w2.g1[] g1VarArr, int i16, int i17, int[] iArr, int i18) {
        int i19;
        float f5;
        int i21;
        int i22;
        int i23;
        List list2 = list;
        long j11 = i15;
        int i24 = i17 - i16;
        int[] iArr2 = new int[i24];
        int i25 = i16;
        int iMax = 0;
        int i26 = 0;
        int i27 = 0;
        int iMin = 0;
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        while (i25 < i17) {
            w2.p0 p0Var = (w2.p0) list2.get(i25);
            float fP = p(o(p0Var));
            if (fP > CropImageView.DEFAULT_ASPECT_RATIO) {
                f11 += fP;
                i26++;
                i21 = i25;
            } else {
                int i28 = i13 - i27;
                w2.g1 g1VarB = g1VarArr[i25];
                if (g1VarB == null) {
                    if (i13 == Integer.MAX_VALUE) {
                        i21 = i25;
                        i22 = i26;
                        i23 = Integer.MAX_VALUE;
                    } else {
                        i21 = i25;
                        i22 = i26;
                        i23 = i28 < 0 ? 0 : i28;
                    }
                    g1VarB = p0Var.B(x1Var.c(0, i23, i14, false));
                } else {
                    i21 = i25;
                    i22 = i26;
                }
                w2.g1 g1Var = g1VarB;
                int iD = x1Var.d(g1Var);
                int iB = x1Var.b(g1Var);
                iArr2[i21 - i16] = iD;
                int i29 = i28 - iD;
                if (i29 < 0) {
                    i29 = 0;
                }
                iMin = Math.min(i15, i29);
                i27 += iD + iMin;
                iMax = Math.max(iMax, iB);
                g1VarArr[i21] = g1Var;
                i26 = i22;
            }
            i25 = i21 + 1;
            j11 = j11;
        }
        long j12 = j11;
        int i30 = i26;
        if (i30 == 0) {
            i27 -= iMin;
            i19 = 0;
        } else {
            long j13 = ((long) (i30 - 1)) * j12;
            long jRound = ((long) ((i13 != Integer.MAX_VALUE ? i13 : i11) - i27)) - j13;
            if (jRound < 0) {
                jRound = 0;
            }
            float f12 = jRound / f11;
            for (int i31 = i16; i31 < i17; i31++) {
                jRound -= (long) Math.round(p(o((w2.p0) list2.get(i31))) * f12);
            }
            int i32 = i16;
            int i33 = iMax;
            int i34 = 0;
            while (i32 < i17) {
                if (g1VarArr[i32] == null) {
                    w2.p0 p0Var2 = (w2.p0) list2.get(i32);
                    f5 = f12;
                    y1 y1VarO = o(p0Var2);
                    float fP2 = p(y1VarO);
                    if (fP2 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                        k0.a.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j14 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fP2 * f5) + iSignum);
                    w2.g1 g1VarB2 = p0Var2.B(x1Var.c((!(y1VarO != null ? y1VarO.f35442b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i14, true));
                    int iD2 = x1Var.d(g1VarB2);
                    int iB2 = x1Var.b(g1VarB2);
                    iArr2[i32 - i16] = iD2;
                    i34 += iD2;
                    int iMax3 = Math.max(i33, iB2);
                    g1VarArr[i32] = g1VarB2;
                    i33 = iMax3;
                    jRound = j14;
                } else {
                    f5 = f12;
                }
                i32++;
                list2 = list;
                f12 = f5;
            }
            i19 = (int) (((long) i34) + j13);
            int i35 = i13 - i27;
            if (i19 < 0) {
                i19 = 0;
            }
            if (i19 > i35) {
                i19 = i35;
            }
            iMax = i33;
        }
        int i36 = i19 + i27;
        if (i36 < 0) {
            i36 = 0;
        }
        int iMax4 = Math.max(i36, i11);
        int iMax5 = Math.max(iMax, Math.max(i12, 0));
        int[] iArr3 = new int[i24];
        x1Var.j(iMax4, iArr2, iArr3, s0Var);
        return x1Var.g(g1VarArr, s0Var, iArr3, iMax4, iMax5, iArr, i18, i16, i17);
    }

    public static final void u(w2.p0 p0Var, s0 s0Var, long j11, fz.c cVar) {
        if (p(o(p0Var)) != CropImageView.DEFAULT_ASPECT_RATIO) {
            s0Var.getClass();
            p0Var.W(p0Var.p(Integer.MAX_VALUE));
            return;
        }
        o(p0Var);
        w2.g1 g1VarB = p0Var.B(j11);
        cVar.invoke(g1VarB);
        s0Var.getClass();
        g1VarB.g0();
        g1VarB.a0();
    }

    public static final z1.r v(z1.r rVar) {
        return z1.a.a(rVar, new q2(1));
    }

    public static final z1.r w(z1.r rVar, fz.c cVar) {
        return rVar.i(new n1(cVar));
    }

    public static final z1.r x(z1.r rVar, float f5, float f11) {
        return rVar.i(new l1(f5, f11));
    }

    public static z1.r y(z1.r rVar, float f5, float f11, int i11) {
        if ((i11 & 1) != 0) {
            f5 = 0;
        }
        if ((i11 & 2) != 0) {
            f11 = 0;
        }
        return x(rVar, f5, f11);
    }

    public static final z1.r z(z1.r rVar, t1 t1Var) {
        return rVar.i(new u1(t1Var));
    }

    public abstract int i(int i11, v3.m mVar);
}
