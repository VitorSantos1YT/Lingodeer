package ys;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bt.g6;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import rt.l9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y0 {
    public static final void a(l3 data, z1.r rVar, long j11, l1.n nVar, int i11) {
        l3 l3Var;
        l1.s sVar;
        b0.d dVar;
        b0.d dVar2;
        b0.d dVar3;
        String strJ;
        kotlin.jvm.internal.m.f(data, "data");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(44362668);
        int i12 = i11 | (sVar2.f(data) ? 4 : 2) | (sVar2.f(rVar) ? 32 : 16) | (sVar2.e(j11) ? 256 : 128);
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = b0.e.a(CropImageView.DEFAULT_ASPECT_RATIO);
                sVar2.o0(objQ);
            }
            b0.d dVar4 = (b0.d) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = b0.e.a(0.5f);
                sVar2.o0(objQ2);
            }
            b0.d dVar5 = (b0.d) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = b0.e.a(CropImageView.DEFAULT_ASPECT_RATIO);
                sVar2.o0(objQ3);
            }
            b0.d dVar6 = (b0.d) objQ3;
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ4);
            }
            l1.b1 b1Var = (l1.b1) objQ4;
            Integer numValueOf = Integer.valueOf(data.f58144c);
            boolean zH = ((i12 & 14) == 4) | ((i12 & 896) == 256) | sVar2.h(dVar4) | sVar2.h(dVar5) | sVar2.h(dVar6);
            Object objQ5 = sVar2.Q();
            if (zH || objQ5 == gVar) {
                dVar = dVar5;
                dVar2 = dVar4;
                dVar3 = dVar6;
                fr.w0 w0Var = new fr.w0(j11, dVar2, dVar, dVar3, data, b1Var, null);
                l3Var = data;
                sVar2.o0(w0Var);
                objQ5 = w0Var;
            } else {
                l3Var = data;
                dVar2 = dVar4;
                dVar = dVar5;
                dVar3 = dVar6;
            }
            l1.t.f((fz.e) objQ5, numValueOf, sVar2);
            boolean zG = sVar2.g(((Boolean) b1Var.getValue()).booleanValue()) | sVar2.c(((Number) dVar3.d()).floatValue());
            Object objQ6 = sVar2.Q();
            if (zG || objQ6 == gVar) {
                int i13 = x0.f58320a[l3Var.f58146e.ordinal()];
                if (i13 == 1) {
                    strJ = nv.p.j((int) ((Number) dVar3.d()).floatValue(), "+");
                } else if (i13 == 2) {
                    strJ = w4.c.f((int) ((Number) dVar3.d()).floatValue(), "%");
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    long jFloatValue = (long) ((Number) dVar3.d()).floatValue();
                    long j12 = 60;
                    strJ = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jFloatValue / j12), Long.valueOf(jFloatValue % j12)}, 2));
                }
                objQ6 = strJ;
                sVar2.o0(objQ6);
            }
            String str = (String) objQ6;
            z1.r rVarS = g2.f0.s(rVar, ((Number) dVar.d()).floatValue(), ((Number) dVar.d()).floatValue(), ((Number) dVar2.d()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, null, 524280);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarS);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar2);
            sVar = sVar2;
            b(l3Var.f58142a, l3Var.f58143b, str, l3Var.f58145d, j0.e2.e(z1.o.f58481a, 1.0f), sVar, 24576, 0);
            sVar.p(true);
        } else {
            l3Var = data;
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new km.v0(l3Var, rVar, j11, i11, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Code duplicated, block: B:56:0x0146  */
    /* JADX WARN: Code duplicated, block: B:57:0x014a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0165  */
    /* JADX WARN: Code duplicated, block: B:64:0x0288  */
    /* JADX WARN: Code duplicated, block: B:67:0x0293  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void b(final int i11, final String title, final String value, final long j11, z1.r rVar, l1.n nVar, final int i12, final int i13) {
        z1.r rVar2;
        boolean z11;
        l1.s sVar;
        final z1.r rVar3;
        l1.x1 x1VarT;
        z1.o oVar;
        z1.r rVar4;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        int iHashCode2;
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(value, "value");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1772118253);
        int i14 = (sVar2.d(i11) ? 4 : 2) | i12;
        if ((i12 & 48) == 0) {
            i14 |= sVar2.f(title) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= sVar2.f(value) ? 256 : 128;
        }
        int i15 = i14 | (sVar2.e(j11) ? 2048 : 1024);
        int i16 = i13 & 16;
        if (i16 == 0) {
            if ((i12 & 24576) == 0) {
                rVar2 = rVar;
                i15 |= sVar2.f(rVar2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            if ((i15 & 9363) != 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar2.T(i15 & 1, z11)) {
                oVar = z1.o.f58481a;
                if (i16 != 0) {
                    rVar4 = oVar;
                } else {
                    rVar4 = rVar2;
                }
                z1.h hVar2 = z1.c.P;
                z1.r rVarB = d2.h.b(rVar4, r0.f.d(10));
                l1.c3 c3Var = h1.v1.f31180a;
                float f5 = 14;
                z1.r rVarD = d2.h.d(d2.h.b(d0.n.h(rVarB, ((h1.s1) sVar2.j(c3Var)).f31033p, r0.f.d(f5)), r0.f.d(f5)), new au.o(j11, 24));
                float f11 = 16;
                z1.r rVarG = j0.e2.g(j0.c.C(rVarD, CropImageView.DEFAULT_ASPECT_RATIO, f11, 1), 58);
                j0.u uVarA = j0.t.a(j0.i.f35305c, hVar2, sVar2, 48);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL = sVar2.l();
                z1.r rVarC = z1.a.c(sVar2, rVarG);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                y2.h hVar3 = y2.j.f56917f;
                l1.t.J(hVar3, uVarA, sVar2);
                y2.h hVar4 = y2.j.f56916e;
                l1.t.J(hVar4, q1VarL, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                y2.h hVar5 = y2.j.f56915d;
                l1.t.J(hVar5, rVarC, sVar2);
                float f12 = 6;
                j0.a2 a2VarA = j0.z1.a(j0.i.g(f12), z1.c.M, sVar2, 54);
                iHashCode2 = Long.hashCode(sVar2.T);
                l1.q1 q1VarL2 = sVar2.l();
                z1.r rVarC2 = z1.a.c(sVar2, oVar);
                sVar2.h0();
                int i17 = i15;
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar3, a2VarA, sVar2);
                l1.t.J(hVar4, q1VarL2, sVar2);
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
                }
                l1.t.J(hVar5, rVarC2, sVar2);
                z1.r rVar5 = rVar4;
                d0.n.c(se.k.y(i11, sVar2, i17 & 14), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 48, 124);
                l1.d0 d0Var = ua.f31167a;
                iu.k.c(value, j0.e2.g(oVar, 24), j3.y0.a((j3.y0) sVar2.j(d0Var), j11, fr.j3.A(16), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 1, 0, new s0.g(fr.j3.A(8), fr.j3.A(16), fr.j3.A(1)), sVar2, ((i17 >> 6) & 14) | 1572912, 184);
                sVar2.p(true);
                sVar = sVar2;
                iu.k.c(title, j0.c.E(j0.c.C(oVar, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), j3.y0.a((j3.y0) sVar2.j(d0Var), ((h1.s1) sVar2.j(c3Var)).f31034q, fr.j3.A(14), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 1, 0, new s0.g(fr.j3.A(8), fr.j3.A(14), fr.j3.A(1)), sVar, ((i17 >> 3) & 14) | 1572912, 184);
                sVar.p(true);
                rVar3 = rVar5;
            } else {
                sVar = sVar2;
                sVar.W();
                rVar3 = rVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: ys.t0
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        y0.b(i11, title, value, j11, rVar3, (l1.n) obj, l1.t.M(i12 | 1), i13);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i15 |= 24576;
        rVar2 = rVar;
        if ((i15 & 9363) != 9362) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar2.T(i15 & 1, z11)) {
            oVar = z1.o.f58481a;
            if (i16 != 0) {
                rVar4 = oVar;
            } else {
                rVar4 = rVar2;
            }
            z1.h hVar6 = z1.c.P;
            z1.r rVarB2 = d2.h.b(rVar4, r0.f.d(10));
            l1.c3 c3Var2 = h1.v1.f31180a;
            float f13 = 14;
            z1.r rVarD2 = d2.h.d(d2.h.b(d0.n.h(rVarB2, ((h1.s1) sVar2.j(c3Var2)).f31033p, r0.f.d(f13)), r0.f.d(f13)), new au.o(j11, 24));
            float f14 = 16;
            z1.r rVarG2 = j0.e2.g(j0.c.C(rVarD2, CropImageView.DEFAULT_ASPECT_RATIO, f14, 1), 58);
            j0.u uVarA2 = j0.t.a(j0.i.f35305c, hVar6, sVar2, 48);
            iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL3 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, rVarG2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar7 = y2.j.f56917f;
            l1.t.J(hVar7, uVarA2, sVar2);
            y2.h hVar8 = y2.j.f56916e;
            l1.t.J(hVar8, q1VarL3, sVar2);
            hVar = y2.j.f56918g;
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            y2.h hVar9 = y2.j.f56915d;
            l1.t.J(hVar9, rVarC3, sVar2);
            float f15 = 6;
            j0.a2 a2VarA2 = j0.z1.a(j0.i.g(f15), z1.c.M, sVar2, 54);
            iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL4 = sVar2.l();
            z1.r rVarC4 = z1.a.c(sVar2, oVar);
            sVar2.h0();
            int i18 = i15;
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar7, a2VarA2, sVar2);
            l1.t.J(hVar8, q1VarL4, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
            } else {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
            }
            l1.t.J(hVar9, rVarC4, sVar2);
            z1.r rVar6 = rVar4;
            d0.n.c(se.k.y(i11, sVar2, i18 & 14), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 48, 124);
            l1.d0 d0Var2 = ua.f31167a;
            iu.k.c(value, j0.e2.g(oVar, 24), j3.y0.a((j3.y0) sVar2.j(d0Var2), j11, fr.j3.A(16), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 1, 0, new s0.g(fr.j3.A(8), fr.j3.A(16), fr.j3.A(1)), sVar2, ((i18 >> 6) & 14) | 1572912, 184);
            sVar2.p(true);
            sVar = sVar2;
            iu.k.c(title, j0.c.E(j0.c.C(oVar, f15, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), j3.y0.a((j3.y0) sVar2.j(d0Var2), ((h1.s1) sVar2.j(c3Var2)).f31034q, fr.j3.A(14), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 1, 0, new s0.g(fr.j3.A(8), fr.j3.A(14), fr.j3.A(1)), sVar, ((i18 >> 3) & 14) | 1572912, 184);
            sVar.p(true);
            rVar3 = rVar6;
        } else {
            sVar = sVar2;
            sVar.W();
            rVar3 = rVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: ys.t0
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y0.b(i11, title, value, j11, rVar3, (l1.n) obj, l1.t.M(i12 | 1), i13);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0144  */
    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:105:0x0150  */
    /* JADX WARN: Code duplicated, block: B:107:0x0159  */
    /* JADX WARN: Code duplicated, block: B:109:0x0161  */
    /* JADX WARN: Code duplicated, block: B:110:0x0164  */
    /* JADX WARN: Code duplicated, block: B:118:0x0182  */
    /* JADX WARN: Code duplicated, block: B:121:0x018c  */
    /* JADX WARN: Code duplicated, block: B:127:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01be  */
    /* JADX WARN: Code duplicated, block: B:135:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01db  */
    /* JADX WARN: Code duplicated, block: B:145:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:154:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:157:0x028f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0297  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0119  */
    /* JADX WARN: Code duplicated, block: B:90:0x0120  */
    /* JADX WARN: Code duplicated, block: B:92:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0133  */
    /* JADX WARN: Code duplicated, block: B:98:0x013a  */
    public static final void c(final CoursePracticeType practiceType, final CourseTestFinishSummaryUiState summaryUiState, final long j11, final boolean z11, final fz.a showFinish, final fz.c loginNow, boolean z12, fz.a aVar, fz.e eVar, fz.e eVar2, fz.e eVar3, fz.e eVar4, fz.f fVar, l9 l9Var, l1.n nVar, final int i11, final int i12) {
        int i13;
        boolean z13;
        boolean z14;
        fz.a aVar2;
        fz.e eVar5;
        int i14;
        int i15;
        char c11;
        int i16;
        char c12;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        boolean z15;
        l1.s sVar;
        final fz.e eVar6;
        final fz.e eVar7;
        final fz.e eVar8;
        final fz.f fVar2;
        final l9 l9Var2;
        final fz.e eVar9;
        final fz.a aVar3;
        final boolean z16;
        l1.x1 x1VarT;
        boolean z17;
        fz.a aVar4;
        fz.e eVar10;
        fz.e eVar11;
        fz.e eVar12;
        fz.e eVar13;
        fz.f fVar3;
        ViewModelStoreOwner current;
        fz.a aVar5;
        fz.e eVar14;
        final fz.f fVar4;
        final l9 l9Var3;
        final fz.e eVar15;
        final fz.e eVar16;
        final fz.e eVar17;
        Object objQ;
        kotlin.jvm.internal.m.f(practiceType, "practiceType");
        kotlin.jvm.internal.m.f(summaryUiState, "summaryUiState");
        kotlin.jvm.internal.m.f(showFinish, "showFinish");
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1835428694);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.d(practiceType.ordinal()) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.h(summaryUiState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar2.e(j11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            z13 = z11;
            i13 |= sVar2.g(z13) ? 2048 : 1024;
        } else {
            z13 = z11;
        }
        if ((i11 & 24576) == 0) {
            i13 |= sVar2.h(showFinish) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i13 |= sVar2.h(loginNow) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        int i23 = i12 & 64;
        if (i23 != 0) {
            i13 |= 1572864;
            z14 = z12;
        } else {
            z14 = z12;
            if ((i11 & 1572864) == 0) {
                i13 |= sVar2.g(z14) ? 1048576 : 524288;
            }
        }
        int i24 = i12 & 128;
        if (i24 != 0) {
            i13 |= 12582912;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            if ((i11 & 12582912) == 0) {
                i13 |= sVar2.h(aVar2) ? 8388608 : 4194304;
            }
        }
        int i25 = i12 & 256;
        if (i25 != 0) {
            i13 |= 100663296;
            eVar5 = eVar;
        } else {
            eVar5 = eVar;
            if ((i11 & 100663296) == 0) {
                i13 |= sVar2.h(eVar5) ? 67108864 : 33554432;
            }
        }
        int i26 = i13;
        int i27 = i12 & 512;
        if (i27 == 0) {
            if ((i11 & 805306368) == 0) {
                i26 |= sVar2.h(eVar2) ? 536870912 : 268435456;
            }
            i14 = i12 & 1024;
            if (i14 != 0) {
                c11 = 6;
                i15 = i14;
            } else {
                i15 = i14;
                if (sVar2.h(eVar3)) {
                    c11 = 4;
                } else {
                    c11 = 2;
                }
            }
            i16 = i12 & 2048;
            if (i16 != 0) {
                i17 = c11 | '0';
            } else {
                if (sVar2.h(eVar4)) {
                    c12 = ' ';
                } else {
                    c12 = 16;
                }
                i17 = c11 | c12;
            }
            i18 = i17;
            i19 = i12 & 4096;
            if (i19 != 0) {
                i22 = i18 | 384;
            } else {
                if (sVar2.h(fVar)) {
                    i21 = 256;
                } else {
                    i21 = 128;
                }
                i22 = i18 | i21;
            }
            int i28 = i22 | 1024;
            if ((i26 & 306783379) == 306783378 || (i28 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (sVar2.T(i26 & 1, z15)) {
                sVar2.Y();
                if ((i11 & 1) != 0 || sVar2.C()) {
                    z17 = i23 == 0 ? z14 : true;
                    if (i24 != 0) {
                        objQ = sVar2.Q();
                        if (objQ == l1.m.f39353a) {
                            objQ = new ju.d(25);
                            sVar2.o0(objQ);
                        }
                        aVar4 = (fz.a) objQ;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i25 != 0) {
                        eVar10 = a.f57888h;
                    } else {
                        eVar10 = eVar5;
                    }
                    if (i27 != 0) {
                        eVar11 = null;
                    } else {
                        eVar11 = eVar2;
                    }
                    if (i15 != 0) {
                        eVar12 = null;
                    } else {
                        eVar12 = eVar3;
                    }
                    if (i16 != 0) {
                        eVar13 = null;
                    } else {
                        eVar13 = eVar4;
                    }
                    fVar3 = i19 == 0 ? fVar : null;
                    sVar2.d0(-1614864554);
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar2, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(l9.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), null);
                    sVar2.p(false);
                    aVar5 = aVar4;
                    eVar14 = eVar10;
                    fVar4 = fVar3;
                    l9Var3 = (l9) viewModelA;
                    eVar15 = eVar13;
                    eVar16 = eVar12;
                    eVar17 = eVar11;
                } else {
                    sVar2.W();
                    eVar17 = eVar2;
                    eVar15 = eVar4;
                    l9Var3 = l9Var;
                    z17 = z14;
                    aVar5 = aVar2;
                    eVar14 = eVar5;
                    eVar16 = eVar3;
                    fVar4 = fVar;
                }
                sVar2.q();
                final boolean z18 = z13;
                l9 l9Var4 = l9Var3;
                fz.e eVar18 = eVar17;
                fz.e eVar19 = eVar16;
                fz.f fVar5 = fVar4;
                int i29 = i26 >> 3;
                fz.a aVar6 = aVar5;
                z14 = z17;
                fz.e eVar20 = eVar14;
                a.a(practiceType, null, null, loginNow, showFinish, z14, aVar6, eVar20, t1.e.d(1738913809, new fz.f() { // from class: ys.v0
                    @Override // fz.f
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        fz.a showNext = (fz.a) obj;
                        l1.n nVar2 = (l1.n) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        kotlin.jvm.internal.m.f(showNext, "showNext");
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ((l1.s) nVar2).h(showNext) ? 4 : 2;
                        }
                        l1.s sVar3 = (l1.s) nVar2;
                        if (sVar3.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                            l9 l9Var5 = l9Var3;
                            l1.b1 b1VarO = l1.t.o(l9Var5.f50024d, sVar3);
                            CourseTestFinishSummaryUiState.Loading loading = CourseTestFinishSummaryUiState.Loading.INSTANCE;
                            CourseTestFinishSummaryUiState courseTestFinishSummaryUiState = summaryUiState;
                            if (kotlin.jvm.internal.m.a(courseTestFinishSummaryUiState, loading)) {
                                sVar3.d0(353898069);
                                sVar3.p(false);
                            } else {
                                if (!(courseTestFinishSummaryUiState instanceof CourseTestFinishSummaryUiState.Success)) {
                                    throw nv.p.x(sVar3, 353897081, false);
                                }
                                sVar3.d0(-1913958145);
                                CourseTestFinishSummaryUiState.Success success = (CourseTestFinishSummaryUiState.Success) courseTestFinishSummaryUiState;
                                y0.d(success.getXp(), success.getAccuracy(), (int) j11, z18, t1.e.d(-1476713069, new g6(courseTestFinishSummaryUiState, l9Var5, showNext, eVar17, eVar16, eVar15, fVar4, b1VarO), sVar3), sVar3, 24576, 0);
                                sVar3.p(false);
                            }
                        } else {
                            sVar3.W();
                        }
                        return qy.b0.f48488a;
                    }
                }, sVar2), sVar2, (i26 & 14) | 100663296 | ((i26 >> 6) & 7168) | (i26 & 57344) | (458752 & i29) | (3670016 & i29) | (i29 & 29360128), 6);
                sVar = sVar2;
                aVar3 = aVar6;
                eVar9 = eVar20;
                eVar6 = eVar18;
                eVar7 = eVar19;
                eVar8 = eVar15;
                fVar2 = fVar5;
                l9Var2 = l9Var4;
            } else {
                sVar = sVar2;
                sVar.W();
                eVar6 = eVar2;
                eVar7 = eVar3;
                eVar8 = eVar4;
                fVar2 = fVar;
                l9Var2 = l9Var;
                eVar9 = eVar5;
                aVar3 = aVar2;
            }
            z16 = z14;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: ys.w0
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM = l1.t.M(i11 | 1);
                        y0.c(practiceType, summaryUiState, j11, z11, showFinish, loginNow, z16, aVar3, eVar9, eVar6, eVar7, eVar8, fVar2, l9Var2, (l1.n) obj, iM, i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i26 |= 805306368;
        i14 = i12 & 1024;
        if (i14 != 0) {
            c11 = 6;
            i15 = i14;
        } else {
            i15 = i14;
            if (sVar2.h(eVar3)) {
                c11 = 4;
            } else {
                c11 = 2;
            }
        }
        i16 = i12 & 2048;
        if (i16 != 0) {
            i17 = c11 | '0';
        } else {
            if (sVar2.h(eVar4)) {
                c12 = ' ';
            } else {
                c12 = 16;
            }
            i17 = c11 | c12;
        }
        i18 = i17;
        i19 = i12 & 4096;
        if (i19 != 0) {
            i22 = i18 | 384;
        } else {
            if (sVar2.h(fVar)) {
                i21 = 256;
            } else {
                i21 = 128;
            }
            i22 = i18 | i21;
        }
        int i210 = i22 | 1024;
        if ((i26 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (sVar2.T(i26 & 1, z15)) {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i23 == 0) {
                }
                if (i24 != 0) {
                    objQ = sVar2.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = new ju.d(25);
                        sVar2.o0(objQ);
                    }
                    aVar4 = (fz.a) objQ;
                } else {
                    aVar4 = aVar2;
                }
                if (i25 != 0) {
                    eVar10 = a.f57888h;
                } else {
                    eVar10 = eVar5;
                }
                if (i27 != 0) {
                    eVar11 = null;
                } else {
                    eVar11 = eVar2;
                }
                if (i15 != 0) {
                    eVar12 = null;
                } else {
                    eVar12 = eVar3;
                }
                if (i16 != 0) {
                    eVar13 = null;
                } else {
                    eVar13 = eVar4;
                }
                if (i19 == 0) {
                }
                sVar2.d0(-1614864554);
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar2, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA2 = i20.b.a(kotlin.jvm.internal.z.a(l9.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), null);
                sVar2.p(false);
                aVar5 = aVar4;
                eVar14 = eVar10;
                fVar4 = fVar3;
                l9Var3 = (l9) viewModelA2;
                eVar15 = eVar13;
                eVar16 = eVar12;
                eVar17 = eVar11;
            } else {
                if (i23 == 0) {
                }
                if (i24 != 0) {
                    objQ = sVar2.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = new ju.d(25);
                        sVar2.o0(objQ);
                    }
                    aVar4 = (fz.a) objQ;
                } else {
                    aVar4 = aVar2;
                }
                if (i25 != 0) {
                    eVar10 = a.f57888h;
                } else {
                    eVar10 = eVar5;
                }
                if (i27 != 0) {
                    eVar11 = null;
                } else {
                    eVar11 = eVar2;
                }
                if (i15 != 0) {
                    eVar12 = null;
                } else {
                    eVar12 = eVar3;
                }
                if (i16 != 0) {
                    eVar13 = null;
                } else {
                    eVar13 = eVar4;
                }
                if (i19 == 0) {
                }
                sVar2.d0(-1614864554);
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar2, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA3 = i20.b.a(kotlin.jvm.internal.z.a(l9.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), null);
                sVar2.p(false);
                aVar5 = aVar4;
                eVar14 = eVar10;
                fVar4 = fVar3;
                l9Var3 = (l9) viewModelA3;
                eVar15 = eVar13;
                eVar16 = eVar12;
                eVar17 = eVar11;
            }
            sVar2.q();
            final boolean z19 = z13;
            l9 l9Var5 = l9Var3;
            fz.e eVar110 = eVar17;
            fz.e eVar111 = eVar16;
            fz.f fVar6 = fVar4;
            int i211 = i26 >> 3;
            fz.a aVar7 = aVar5;
            z14 = z17;
            fz.e eVar21 = eVar14;
            a.a(practiceType, null, null, loginNow, showFinish, z14, aVar7, eVar21, t1.e.d(1738913809, new fz.f() { // from class: ys.v0
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    fz.a showNext = (fz.a) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(showNext, "showNext");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((l1.s) nVar2).h(showNext) ? 4 : 2;
                    }
                    l1.s sVar3 = (l1.s) nVar2;
                    if (sVar3.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                        l9 l9Var6 = l9Var3;
                        l1.b1 b1VarO = l1.t.o(l9Var6.f50024d, sVar3);
                        CourseTestFinishSummaryUiState.Loading loading = CourseTestFinishSummaryUiState.Loading.INSTANCE;
                        CourseTestFinishSummaryUiState courseTestFinishSummaryUiState = summaryUiState;
                        if (kotlin.jvm.internal.m.a(courseTestFinishSummaryUiState, loading)) {
                            sVar3.d0(353898069);
                            sVar3.p(false);
                        } else {
                            if (!(courseTestFinishSummaryUiState instanceof CourseTestFinishSummaryUiState.Success)) {
                                throw nv.p.x(sVar3, 353897081, false);
                            }
                            sVar3.d0(-1913958145);
                            CourseTestFinishSummaryUiState.Success success = (CourseTestFinishSummaryUiState.Success) courseTestFinishSummaryUiState;
                            y0.d(success.getXp(), success.getAccuracy(), (int) j11, z19, t1.e.d(-1476713069, new g6(courseTestFinishSummaryUiState, l9Var6, showNext, eVar17, eVar16, eVar15, fVar4, b1VarO), sVar3), sVar3, 24576, 0);
                            sVar3.p(false);
                        }
                    } else {
                        sVar3.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar2), sVar2, (i26 & 14) | 100663296 | ((i26 >> 6) & 7168) | (i26 & 57344) | (458752 & i211) | (3670016 & i211) | (i211 & 29360128), 6);
            sVar = sVar2;
            aVar3 = aVar7;
            eVar9 = eVar21;
            eVar6 = eVar110;
            eVar7 = eVar111;
            eVar8 = eVar15;
            fVar2 = fVar6;
            l9Var2 = l9Var5;
        } else {
            sVar = sVar2;
            sVar.W();
            eVar6 = eVar2;
            eVar7 = eVar3;
            eVar8 = eVar4;
            fVar2 = fVar;
            l9Var2 = l9Var;
            eVar9 = eVar5;
            aVar3 = aVar2;
        }
        z16 = z14;
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: ys.w0
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i11 | 1);
                    y0.c(practiceType, summaryUiState, j11, z11, showFinish, loginNow, z16, aVar3, eVar9, eVar6, eVar7, eVar8, fVar2, l9Var2, (l1.n) obj, iM, i12);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void d(final int i11, final int i12, final int i13, boolean z11, fz.e eVar, l1.n nVar, final int i14, final int i15) {
        boolean z12;
        int i16;
        final fz.e eVar2;
        final boolean z13;
        y2.h hVar;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(782572219);
        int i17 = i14 | (sVar.d(i11) ? 4 : 2);
        if ((i14 & 48) == 0) {
            i17 |= sVar.d(i12) ? 32 : 16;
        }
        int i18 = i17 | (sVar.d(i13) ? 256 : 128);
        int i19 = i15 & 8;
        if (i19 != 0) {
            i16 = i18 | 3072;
            z12 = z11;
        } else {
            z12 = z11;
            i16 = i18 | (sVar.g(z12) ? 2048 : 1024);
        }
        if (sVar.T(i16 & 1, (i16 & 9363) != 9362)) {
            boolean z14 = i19 != 0 ? true : z12;
            boolean zBooleanValue = ((Boolean) sVar.j(ju.f.f37376j)).booleanValue();
            long j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p;
            g2.r0 r0Var = g2.f0.f28556b;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarH = d0.n.h(oVar, j11, r0Var);
            w2.q0 q0VarD = j0.o.d(z1.c.f58464b, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarH);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, q0VarD, sVar);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            z1.j jVar = z1.c.f58463a;
            w2.q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, q0VarD2, sVar);
            l1.t.J(hVar3, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            }
            l1.t.J(hVar5, rVarC2, sVar);
            d0.n.c(se.k.y(R.drawable.course_test_finish_banner_bg, sVar, 0), null, j0.e2.e(oVar, 1.0f), null, w2.i.f54517d, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 25008, 104);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                Integer[] numArr = {Integer.valueOf(R.raw.course_finish), Integer.valueOf(R.raw.course_finish_3)};
                jz.d dVar = jz.e.f37397a;
                objQ = Integer.valueOf(((Number) ry.l.d0(numArr)).intValue());
                sVar.o0(objQ);
            }
            int iIntValue = ((Number) objQ).intValue();
            z1.r rVarJ = j0.c.j(j0.e2.e(oVar, 1.0f), 2.25f);
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new xt.r(24);
                sVar.o0(objQ2);
            }
            tv.g.a(rVarJ, iIntValue, null, null, false, (fz.c) objQ2, sVar, 1572918, 60);
            sVar = sVar;
            sVar.p(true);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, uVarA, sVar);
            l1.t.J(hVar3, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                hVar = hVar4;
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar);
            } else {
                hVar = hVar4;
            }
            l1.t.J(hVar5, rVarC3, sVar);
            z1.r rVarE = j0.e2.e(oVar, zBooleanValue ? 0.7f : 1.0f);
            w2.q0 q0VarD3 = j0.o.d(jVar, false);
            int iHashCode4 = Long.hashCode(sVar.T);
            l1.q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarE);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, q0VarD3, sVar);
            l1.t.J(hVar3, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar);
            }
            l1.t.J(hVar5, rVarC4, sVar);
            j0.c.g(sVar, j0.c.j(j0.e2.e(oVar, 1.0f), 2.25f));
            sVar.p(true);
            z1.r rVarE2 = j0.e2.e(j0.c.C(oVar, !z14 ? 32 : 12, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
            j0.a2 a2VarA = j0.z1.a(j0.i.g(!z14 ? 22 : 10), z1.c.L, sVar, 0);
            int iHashCode5 = Long.hashCode(sVar.T);
            l1.q1 q1VarL5 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarE2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, a2VarA, sVar);
            l1.t.J(hVar3, q1VarL5, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar);
            }
            l1.t.J(hVar5, rVarC5, sVar);
            ArrayList arrayListM = ns.o.M(new l3(R.drawable.course_test_finish_xp, ub.a.e0(sVar, R.string.f22253xp), i11, g2.f0.e(4278227967L), n0.XP), new l3(R.drawable.course_test_finish_accuarcy, ub.a.e0(sVar, R.string.accuracy), i12, g2.f0.e(4278496527L), n0.ACCURACY), new l3(R.drawable.course_test_finish_time, ub.a.e0(sVar, R.string.time), i13, g2.f0.e(4294915089L), n0.TIME));
            if (!z14) {
                arrayListM.remove(1);
            }
            sVar.d0(-54696829);
            int size = arrayListM.size();
            int i21 = 0;
            int i22 = 0;
            while (i22 < size) {
                Object obj = arrayListM.get(i22);
                int i23 = i22 + 1;
                int i24 = i21 + 1;
                if (i21 < 0) {
                    ns.o.V();
                    throw null;
                }
                l3 l3Var = (l3) obj;
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                a(l3Var, new j0.i1(1.0f, true), ((long) i21) * 500, sVar, 0);
                i22 = i23;
                i21 = i24;
            }
            sVar.p(false);
            sVar.p(true);
            j0.c.g(sVar, j0.e2.g(oVar, 8));
            eVar2 = eVar;
            eVar2.invoke(sVar, 6);
            sVar.p(true);
            sVar.p(true);
            z13 = z14;
        } else {
            eVar2 = eVar;
            sVar.W();
            z13 = z12;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: ys.u0
                @Override // fz.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    y0.d(i11, i12, i13, z13, eVar2, (l1.n) obj2, l1.t.M(i14 | 1), i15);
                    return qy.b0.f48488a;
                }
            };
        }
    }
}
