package h1;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f31337a = 48;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f31338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0.v1 f31339c;

    static {
        float f5 = 12;
        f31338b = f5;
        f31339c = j0.c.f(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, f5, 3);
        float f11 = 24;
        j0.c.f(f11, 16, f5, CropImageView.DEFAULT_ASPECT_RATIO, 8);
        j0.c.f(f11, CropImageView.DEFAULT_ASPECT_RATIO, f5, f5, 2);
    }

    public static final void a(z1.r rVar, fz.e eVar, t1.d dVar, fz.e eVar2, m2 m2Var, j3.y0 y0Var, float f5, t1.d dVar2, l1.n nVar, int i11) {
        int i12;
        t1.d dVar3;
        fz.e eVar3;
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1507356255);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            dVar3 = dVar;
            i12 |= sVar2.h(dVar3) ? 256 : 128;
        } else {
            dVar3 = dVar;
        }
        if ((i11 & 3072) == 0) {
            eVar3 = eVar2;
            i12 |= sVar2.h(eVar3) ? 2048 : 1024;
        } else {
            eVar3 = eVar2;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.f(m2Var) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.f(y0Var) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.c(f5) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar2.h(dVar2) ? 8388608 : 4194304;
        }
        int i13 = i12;
        if ((i13 & 4793491) == 4793490 && sVar2.F()) {
            sVar2.W();
            sVar = sVar2;
        } else {
            z1.r rVarH = d0.n.h(g3.r.b(j0.e2.r(rVar, k1.d.f37465b, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), false, o0.f30767d), m2Var.f30639a, g2.f0.f28556b);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarH);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar2);
            b(eVar, m2Var.f30640b, m2Var.f30641c, f5, t1.e.d(-229007058, new a0.t0(dVar3, eVar3, eVar, m2Var, y0Var), sVar2), sVar2, (i13 & 112) | 196614 | (57344 & (i13 >> 6)));
            sVar = sVar2;
            hh.p0.x(14 & (i13 >> 21), dVar2, sVar, true);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q2(rVar, eVar, dVar, eVar2, m2Var, y0Var, f5, dVar2, i11);
        }
    }

    public static final void b(fz.e eVar, long j11, long j12, float f5, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-996037719);
        int i13 = i11 & 6;
        z1.o oVar = z1.o.f58481a;
        if (i13 == 0) {
            i12 = (sVar.f(oVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.e(j11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.e(j12) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.c(f5) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(dVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((74899 & i12) == 74898 && sVar.F()) {
            sVar.W();
        } else {
            z1.r rVarI = j0.e2.e(oVar, 1.0f).i(eVar != null ? j0.e2.b(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, 1) : oVar);
            j0.u uVarA = j0.t.a(j0.i.f35309g, z1.c.O, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarI);
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
            sVar.d0(594325590);
            if (eVar != null) {
                i1.p.a(j11, fc.a(k1.d.f37477o, sVar), t1.e.d(1936268514, new b(2, eVar), sVar), sVar, ((i12 >> 6) & 14) | 384);
            }
            sVar.p(false);
            l1.t.a(h2.f30320a.a(new g2.x(j12)), dVar, sVar, ((i12 >> 12) & 112) | 8);
            sVar.p(true);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new r2(eVar, j11, j12, f5, dVar, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(boolean z11, fz.a aVar, boolean z12, boolean z13, boolean z14, boolean z15, String str, m2 m2Var, t1.d dVar, l1.n nVar, int i11) {
        long j11;
        int i12;
        int i13;
        b0.z zVar;
        int i14;
        l1.b3 b3VarH;
        l1.b3 b3VarA;
        d0.v vVarA;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1434777861);
        int i15 = i11 | (sVar.g(z11) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128) | (sVar.g(z12) ? 2048 : 1024) | (sVar.g(z13) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.g(z14) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.g(z15) ? 1048576 : 524288) | (sVar.f(str) ? 8388608 : 4194304) | (sVar.f(m2Var) ? 67108864 : 33554432);
        if ((306783379 & i15) == 306783378 && sVar.F()) {
            sVar.W();
        } else {
            boolean z16 = (29360128 & i15) == 8388608;
            Object objQ = sVar.Q();
            if (z16 || objQ == l1.m.f39353a) {
                objQ = new c6.o(str, 4);
                sVar.o0(objQ);
            }
            z1.r rVarB = g3.r.b(z1.o.f58481a, true, (fz.c) objQ);
            g2.w0 w0VarA = y7.a(k1.d.f37466c, sVar);
            int i16 = i15 >> 3;
            if (z11) {
                j11 = z13 ? m2Var.f30655r : m2Var.f30656s;
            } else {
                j11 = g2.x.f28621h;
            }
            if (z12) {
                sVar.d0(-217363149);
                i12 = i16;
                zVar = null;
                i14 = 6;
                i13 = 100;
                b3VarH = a0.t1.a(j11, b0.e.r(100, 0, null, 6), null, sVar, 0, 12);
                sVar.p(false);
            } else {
                i12 = i16;
                i13 = 100;
                zVar = null;
                i14 = 6;
                sVar.d0(-217247953);
                b3VarH = l1.t.H(new g2.x(j11), sVar);
                sVar.p(false);
            }
            long j12 = ((g2.x) b3VarH.getValue()).f28624a;
            long j13 = m2Var.f30652o;
            if (z11 && z13) {
                j13 = m2Var.f30653p;
            } else if (z11 && !z13) {
                j13 = m2Var.f30654q;
            } else if (z15 && z13) {
                j13 = m2Var.f30660w;
            } else if (!z15 || z13) {
                if (z14) {
                    j13 = m2Var.f30657t;
                } else if (z13) {
                    j13 = m2Var.f30651n;
                }
            }
            if (z15) {
                sVar.d0(-828303257);
                b3VarA = l1.t.H(new g2.x(j13), sVar);
                sVar.p(false);
            } else {
                sVar.d0(-828241443);
                b3VarA = a0.t1.a(j13, b0.e.r(i13, 0, zVar, i14), null, sVar, 0, 12);
                sVar.p(false);
            }
            long j14 = ((g2.x) b3VarA.getValue()).f28624a;
            if (!z14 || z11) {
                vVarA = zVar;
            } else {
                vVarA = d0.n.a(m2Var.f30658u, k1.d.f37473j);
            }
            i9.b(z11, aVar, rVarB, z13, w0VarA, j12, j14, CropImageView.DEFAULT_ASPECT_RATIO, vVarA, null, t1.e.d(-2031780827, new f(dVar, 4, (byte) 0), sVar), sVar, i12 & 7294, 1408);
            sVar = sVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new s2(z11, aVar, z12, z13, z14, z15, str, m2Var, dVar, i11);
        }
    }

    public static final void d(int i11, int i12, fz.c cVar, l1.n nVar, z1.r rVar) {
        boolean z11;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1393846115);
        int i13 = (sVar.d(i11) ? 32 : 16) | i12 | (sVar.h(cVar) ? 256 : 128);
        if ((i13 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            l1.g gVar = l1.m.f39353a;
            if (i11 == 0) {
                sVar.d0(-411219388);
                z11 = (i13 & 896) == 256;
                Object objQ = sVar.Q();
                if (z11 || objQ == gVar) {
                    objQ = new t2(cVar, 0);
                    sVar.o0(objQ);
                }
                k7.h((fz.a) objQ, rVar, false, null, a2.f29965a, sVar, 196656, 28);
                sVar.p(false);
            } else {
                sVar.d0(-410937381);
                z11 = (i13 & 896) == 256;
                Object objQ2 = sVar.Q();
                if (z11 || objQ2 == gVar) {
                    objQ2 = new t2(cVar, 1);
                    sVar.o0(objQ2);
                }
                k7.h((fz.a) objQ2, rVar, false, null, a2.f29966b, sVar, 196656, 28);
                sVar.p(false);
            }
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new u2(rVar, i11, cVar, i12, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x024a  */
    public static final void e(i1.z zVar, fz.c cVar, long j11, Long l9, Long l11, u7 u7Var, p2 p2Var, t7 t7Var, m2 m2Var, l1.n nVar, int i11) {
        z1.r rVarF;
        l1.s sVar;
        l1.s sVar2;
        z1.o oVar;
        boolean zBooleanValue;
        boolean z11;
        boolean z12;
        fz.c cVar2 = cVar;
        p2 p2Var2 = p2Var;
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(-1912870997);
        int i12 = i11 | (sVar3.f(zVar) ? 4 : 2) | (sVar3.h(cVar2) ? 32 : 16) | (sVar3.e(j11) ? 256 : 128) | (sVar3.f(l9) ? 2048 : 1024) | (sVar3.f(l11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar3.f(u7Var) ? 131072 : 65536) | (sVar3.f(p2Var2) ? 1048576 : 524288) | (sVar3.f(t7Var) ? 8388608 : 4194304) | (sVar3.f(m2Var) ? 67108864 : 33554432);
        if ((i12 & 38347923) == 38347922 && sVar3.F()) {
            sVar3.W();
            sVar = sVar3;
        } else {
            sVar3.d0(1821433443);
            z1.o oVar2 = z1.o.f58481a;
            l1.g gVar = l1.m.f39353a;
            if (u7Var != null) {
                boolean z13 = ((i12 & 458752) == 131072) | ((i12 & 234881024) == 67108864);
                Object objQ = sVar3.Q();
                if (z13 || objQ == gVar) {
                    objQ = new a0.e(4, u7Var, m2Var);
                    sVar3.o0(objQ);
                }
                rVarF = d2.h.f(oVar2, (fz.c) objQ);
            } else {
                rVarF = oVar2;
            }
            sVar3.p(false);
            Locale localeR = k7.r(sVar3);
            float f5 = f31337a;
            z1.r rVarI = j0.e2.j(6 * f5).i(rVarF);
            j0.u uVarA = j0.t.a(j0.i.f35308f, z1.c.O, sVar3, 6);
            int iHashCode = Long.hashCode(sVar3.T);
            l1.q1 q1VarL = sVar3.l();
            z1.r rVarC = z1.a.c(sVar3, rVarI);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar3);
            l1.t.J(y2.j.f56916e, q1VarL, sVar3);
            y2.h hVar = y2.j.f56918g;
            if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar3);
            sVar3.d0(-647461340);
            int i13 = 0;
            int i14 = 0;
            int i15 = 6;
            while (i13 < i15) {
                z1.r rVarE = j0.e2.e(oVar2, 1.0f);
                j0.a2 a2VarA = j0.z1.a(j0.i.f35308f, z1.c.M, sVar3, 54);
                z1.o oVar3 = oVar2;
                int iHashCode2 = Long.hashCode(sVar3.T);
                l1.q1 q1VarL2 = sVar3.l();
                z1.r rVarC2 = z1.a.c(sVar3, rVarE);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar3.h0();
                int i16 = i13;
                if (sVar3.S) {
                    sVar3.k(iVar2);
                } else {
                    sVar3.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA, sVar3);
                l1.t.J(y2.j.f56916e, q1VarL2, sVar3);
                y2.h hVar2 = y2.j.f56918g;
                if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                }
                l1.t.J(y2.j.f56915d, rVarC2, sVar3);
                sVar3.d0(-88395975);
                int i17 = 0;
                while (i17 < 7) {
                    int i18 = zVar.f34109d;
                    if (i14 < i18 || i14 >= i18 + zVar.f34108c) {
                        sVar2 = sVar3;
                        i14 = i14;
                        oVar = oVar3;
                        sVar2.d0(1554856342);
                        j0.c.g(sVar2, j0.e2.l(oVar, f5, f5));
                        sVar2.p(false);
                    } else {
                        sVar3.d0(1555370911);
                        int i19 = i14 - zVar.f34109d;
                        long j12 = (((long) i19) * 86400000) + zVar.f34110e;
                        boolean z14 = j12 == j11;
                        boolean z15 = l9 != null && j12 == l9.longValue();
                        boolean z16 = l11 != null && j12 == l11.longValue();
                        sVar3.d0(-88360892);
                        if (u7Var != null) {
                            boolean zE = ((i12 & 458752) == 131072) | sVar3.e(j12);
                            Object objQ2 = sVar3.Q();
                            if (zE || objQ2 == gVar) {
                                if (j12 < (l9 != null ? l9.longValue() : Long.MAX_VALUE)) {
                                    z12 = false;
                                } else {
                                    if (j12 <= (l11 != null ? l11.longValue() : Long.MIN_VALUE)) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                }
                                objQ2 = ep.a.s(z12, sVar3);
                            }
                            zBooleanValue = ((Boolean) ((l1.b1) objQ2).getValue()).booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        sVar3.p(false);
                        boolean z17 = u7Var != null;
                        boolean z18 = zBooleanValue;
                        StringBuilder sb2 = new StringBuilder();
                        boolean z19 = z17;
                        sVar3.d0(-647730741);
                        if (!z19) {
                            z11 = false;
                        } else if (z15) {
                            sVar3.d0(-647727716);
                            sb2.append(i1.p.i(sVar3, R.string.m3c_date_range_picker_start_headline));
                            z11 = false;
                            sVar3.p(false);
                        } else {
                            z11 = false;
                            if (z16) {
                                sVar3.d0(-647723718);
                                sb2.append(i1.p.i(sVar3, R.string.m3c_date_range_picker_end_headline));
                                z11 = false;
                                sVar3.p(false);
                            } else if (z18) {
                                sVar3.d0(-647719783);
                                sb2.append(i1.p.i(sVar3, R.string.m3c_date_range_picker_day_in_range));
                                z11 = false;
                                sVar3.p(false);
                            } else {
                                sVar3.d0(1395591750);
                                sVar3.p(false);
                            }
                        }
                        sVar3.p(z11);
                        sVar3.d0(-647717033);
                        if (z14 != 0) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(i1.p.i(sVar3, R.string.m3c_date_picker_today_description));
                        }
                        sVar3.p(false);
                        String string = sb2.length() == 0 ? null : sb2.toString();
                        z1.o oVar4 = oVar3;
                        String strA = p2Var2.a(Long.valueOf(j12), localeR, true);
                        if (strA == null) {
                            strA = BuildConfig.VERSION_NAME;
                        }
                        boolean z20 = z15 || z16;
                        boolean zE2 = ((i12 & 112) == 32) | sVar3.e(j12);
                        Object objQ3 = sVar3.Q();
                        if (zE2 || objQ3 == gVar) {
                            objQ3 = new v2(j12, cVar2);
                            sVar3.o0(objQ3);
                        }
                        fz.a aVar = (fz.a) objQ3;
                        boolean zE3 = ((i12 & 29360128) == 8388608) | sVar3.e(j12);
                        Object objQ4 = sVar3.Q();
                        if (zE3 || objQ4 == gVar) {
                            objQ4 = Boolean.valueOf(t7Var.b(zVar.f34106a) && t7Var.a(j12));
                            sVar3.o0(objQ4);
                        }
                        boolean zBooleanValue2 = ((Boolean) objQ4).booleanValue();
                        if (string != null) {
                            strA = ep.a.D(string, ", ", strA);
                        }
                        l1.s sVar4 = sVar3;
                        oVar = oVar4;
                        c(z20, aVar, z15, zBooleanValue2, z14, z18, strA, m2Var, t1.e.d(-2095706591, new w2(i19), sVar3), sVar4, 805306374 | (i12 & 234881024));
                        sVar2 = sVar4;
                        sVar2.p(false);
                    }
                    p2Var2 = p2Var;
                    localeR = localeR;
                    oVar3 = oVar;
                    sVar3 = sVar2;
                    i14++;
                    i17++;
                    cVar2 = cVar;
                    gVar = gVar;
                }
                l1.s sVar5 = sVar3;
                sVar5.p(false);
                sVar5.p(true);
                p2Var2 = p2Var;
                sVar3 = sVar5;
                i13 = i16 + 1;
                i15 = 6;
                i14 = i14;
                oVar2 = oVar3;
                cVar2 = cVar;
            }
            sVar = sVar3;
            sVar.p(false);
            sVar.p(true);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new x2(zVar, cVar, j11, l9, l11, u7Var, p2Var, t7Var, m2Var, i11);
        }
    }

    public static final void f(m2 m2Var, i1.x xVar, l1.n nVar, int i11) {
        m2 m2Var2 = m2Var;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1849465391);
        int i12 = (i11 & 6) == 0 ? (sVar.f(m2Var2) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(xVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && sVar.F()) {
            sVar.W();
        } else {
            int iD = xVar.d();
            List listI = xVar.i();
            ArrayList arrayList = new ArrayList();
            boolean z11 = true;
            int i13 = iD - 1;
            int size = listI.size();
            for (int i14 = i13; i14 < size; i14++) {
                arrayList.add(listI.get(i14));
            }
            boolean z12 = false;
            for (int i15 = 0; i15 < i13; i15++) {
                arrayList.add(listI.get(i15));
            }
            j3.y0 y0VarA = fc.a(k1.d.f37485w, sVar);
            z1.o oVar = z1.o.f58481a;
            float f5 = f31337a;
            z1.r rVarE = j0.e2.e(j0.e2.b(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, 1), 1.0f);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35308f, z1.c.M, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            sVar.d0(396197267);
            int size2 = arrayList.size();
            int i16 = 0;
            while (i16 < size2) {
                qy.l lVar = (qy.l) arrayList.get(i16);
                boolean zF = sVar.f(lVar);
                Object objQ = sVar.Q();
                if (zF || objQ == l1.m.f39353a) {
                    objQ = new a0.o0(lVar, 14);
                    sVar.o0(objQ);
                }
                z1.r rVarP = j0.e2.p(g3.r.a(oVar, (fz.c) objQ), f5, f5);
                w2.q0 q0VarD = j0.o.d(z1.c.f58467e, z12);
                int iHashCode2 = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarP);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD, sVar);
                l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                y2.h hVar2 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
                }
                l1.t.J(y2.j.f56915d, rVarC2, sVar);
                l1.s sVar2 = sVar;
                ua.b((String) lVar.f48496b, j0.e2.w(oVar, null, 3), m2Var2.f30642d, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, y0VarA, sVar2, 48, 0, 65016);
                sVar = sVar2;
                sVar.p(true);
                i16++;
                z12 = false;
                z11 = true;
                oVar = oVar;
                arrayList = arrayList;
                size2 = size2;
                f5 = f5;
                m2Var2 = m2Var;
            }
            sVar.p(z12);
            sVar.p(z11);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new u2(m2Var, i11, 1, xVar);
        }
    }
}
