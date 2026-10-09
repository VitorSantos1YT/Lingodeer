package xu;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.uistate.DailyGoalUiState;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.dc;
import h1.fc;
import h1.g7;
import h1.i7;
import h1.k7;
import h1.r4;
import h1.ua;
import j0.c2;
import j0.e2;
import java.util.List;
import l1.c3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a2 {
    public static final void a(int i11, fz.a aVar, String str, l1.n nVar, boolean z11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1961618732);
        int i12 = i11 | (sVar.g(z11) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarG = e2.g(e2.e(oVar, 1.0f), 56);
            g3.k kVar = new g3.k(3);
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new r1(4, aVar);
                sVar.o0(objQ);
            }
            z1.r rVarB = q0.c.b(rVarG, z11, false, kVar, (fz.a) objQ, 10);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarB);
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
            i7.a(z11, null, null, false, null, sVar, 48 | ((i12 >> 3) & 14), 60);
            ua.b(str, j0.c.E(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30177j, sVar, 54, 0, 65532);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iv.y(str, z11, aVar, i11, 4);
        }
    }

    public static final void b(int i11, fz.a aVar, fz.c cVar, l1.n nVar, int i12) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-2000517846);
        int i13 = i12 | (sVar2.d(i11) ? 4 : 2) | (sVar2.h(cVar) ? 256 : 128);
        if (sVar2.T(i13 & 1, (i13 & 147) != 146)) {
            Object objQ = sVar2.Q();
            if (objQ == l1.m.f39353a) {
                Integer numValueOf = Integer.valueOf(i11);
                if (i11 <= 0) {
                    numValueOf = null;
                }
                objQ = defpackage.e.v(numValueOf != null ? numValueOf.intValue() : 10, sVar2);
            }
            l1.a1 a1Var = (l1.a1) objQ;
            sVar = sVar2;
            k7.a(aVar, t1.e.d(-857791006, new s1(aVar, cVar, a1Var), sVar2), null, t1.e.d(-1950426208, new nv.y(24, aVar), sVar2), c.f56366p0, t1.e.d(-1441895363, new mt.r(a1Var, 26), sVar2), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772598, 16276);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iv.e(i11, aVar, cVar, i12, 4);
        }
    }

    public static final void c(boolean z11, fz.a aVar, l1.n nVar, int i11) {
        fz.a aVar2;
        boolean z12;
        String strM;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1576764464);
        int i12 = i11 | (sVar.g(z11) ? 4 : 2);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            z1.i iVar = z1.c.M;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = e2.e(oVar, 1.0f);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, iVar, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, a2VarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            k2.b bVarY = se.k.y(R.drawable.ep_daily_goal, sVar, 0);
            c3 c3Var = h1.v1.f31180a;
            r4.b(bVarY, null, null, ((h1.s1) sVar.j(c3Var)).f31017a, sVar, 48, 4);
            if (z11) {
                z12 = false;
                strM = ep.a.m(sVar, -1106848510, R.string.daily_goal, sVar, false);
            } else {
                z12 = false;
                strM = ep.a.m(sVar, -1106941634, R.string.set_daily_goal, sVar, false);
            }
            ua.b(strM, j0.c.E(oVar, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, 0L, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777211), sVar, 48, 0, 65532);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            w4.c.r(1.0f, true, sVar);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
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
            k2.b bVarY2 = se.k.y(R.drawable.ic_me_daily_goal_edit, sVar, 0);
            z1.r rVarA = j0.c.A(oVar, 4);
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                aVar2 = aVar;
                objQ = new r1(2, aVar2);
                sVar.o0(objQ);
            } else {
                aVar2 = aVar;
            }
            d0.n.c(bVarY2, null, iu.k.q(6, 7, (fz.a) objQ, sVar, rVarA, false), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 120);
            sVar = sVar;
            if (z11) {
                sVar.d0(123479068);
            } else {
                sVar.d0(138613361);
                j0.o.a(j0.r.f35391a.a(d0.n.h(e2.n(oVar, 6), ((h1.s1) sVar.j(c3Var)).f31040w, r0.f.f48733a), z1.c.f58465c), sVar, 0);
            }
            sVar.p(false);
            sVar.p(true);
            sVar.p(true);
        } else {
            aVar2 = aVar;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.i(z11, aVar2, i11, 2);
        }
    }

    public static final void d(final int i11, final int i12, l1.n nVar, int i13) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-771845467);
        int i14 = (sVar.d(i11) ? 4 : 2) | i13 | (sVar.d(i12) ? 32 : 16);
        if (sVar.T(i14 & 1, (i14 & 19) != 18)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
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
            long j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31017a;
            long jE = g2.f0.e(4292666604L);
            float f5 = -4;
            z1.r rVarG = e2.g(oVar, 6);
            boolean z11 = ((i14 & 14) == 4) | ((i14 & 112) == 32);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new fz.a() { // from class: xu.t1
                    @Override // fz.a
                    public final Object invoke() {
                        return Float.valueOf(i11 / i12);
                    }
                };
                sVar.o0(objQ);
            }
            fz.a aVar = (fz.a) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new xt.r(4);
                sVar.o0(objQ2);
            }
            g7.c(aVar, rVarG, j11, jE, 1, f5, (fz.c) objQ2, sVar, 1772592, 0);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.c.g(sVar, new j0.i1(1.0f, true));
            ua.b("(" + i11 + "/" + i12 + ")", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(ua.f31167a), g2.f0.e(4287269541L), j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, 0, 0, 65534);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new tv.b(i11, i12, i13);
        }
    }

    public static final void e(final String str, final String str2, final String str3, long j11, final n3.s sVar, final long j12, final boolean z11, final z1.r rVar, l1.n nVar, final int i11) {
        long j13;
        l1.s sVar2;
        y2.i iVar;
        y2.h hVar;
        boolean z12;
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(-651744826);
        int i12 = i11 | (sVar3.f(str) ? 4 : 2) | (sVar3.f(str2) ? 32 : 16) | (sVar3.f(str3) ? 256 : 128) | (sVar3.e(j12) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if ((i11 & 1572864) == 0) {
            i12 |= sVar3.g(z11) ? 1048576 : 524288;
        }
        int i13 = i12;
        if (sVar3.T(i13 & 1, (i13 & 4793491) != 4793490)) {
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar3, 0);
            int iHashCode = Long.hashCode(sVar3.T);
            l1.q1 q1VarL = sVar3.l();
            z1.r rVarC = z1.a.c(sVar3, rVar);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar2);
            } else {
                sVar3.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, uVarA, sVar3);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar3);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar3);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarI = e2.i(oVar, 42, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            z1.i iVar3 = z1.c.M;
            j0.b bVar = j0.i.f35303a;
            j0.a2 a2VarA = j0.z1.a(bVar, iVar3, sVar3, 48);
            int iHashCode2 = Long.hashCode(sVar3.T);
            l1.q1 q1VarL2 = sVar3.l();
            z1.r rVarC2 = z1.a.c(sVar3, rVarI);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar2);
            } else {
                sVar3.r0();
            }
            l1.t.J(hVar2, a2VarA, sVar3);
            l1.t.J(hVar3, q1VarL2, sVar3);
            if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar4);
            }
            l1.t.J(hVar5, rVarC2, sVar3);
            l1.d0 d0Var = ua.f31167a;
            j3.y0 y0VarA = j3.y0.a((j3.y0) sVar3.j(d0Var), j12, j11, sVar, null, null, 0L, null, null, 0, 0, 0L, null, 16777208);
            s0.g gVarA = s0.x0.a(j3.A(8), j11);
            c2 c2Var = c2.f35266a;
            iu.k.c(str, c2Var.a(oVar, 1.2f), y0VarA, 0, false, 2, 0, gVarA, sVar3, (i13 & 14) | 1572864, 184);
            z1.r rVarA = c2Var.a(oVar, 1.5f);
            float f5 = 8;
            z1.r rVarC3 = j0.c.C(rVarA, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.a2 a2VarA2 = j0.z1.a(bVar, iVar3, sVar3, 48);
            int iHashCode3 = Long.hashCode(sVar3.T);
            l1.q1 q1VarL3 = sVar3.l();
            z1.r rVarC4 = z1.a.c(sVar3, rVarC3);
            sVar3.h0();
            if (sVar3.S) {
                iVar = iVar2;
                sVar3.k(iVar);
            } else {
                iVar = iVar2;
                sVar3.r0();
            }
            l1.t.J(hVar2, a2VarA2, sVar3);
            l1.t.J(hVar3, q1VarL3, sVar3);
            if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                hVar = hVar4;
                defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar);
            } else {
                hVar = hVar4;
            }
            l1.t.J(hVar5, rVarC4, sVar3);
            y2.i iVar4 = iVar;
            y2.h hVar6 = hVar;
            d0.n.c(se.k.y(R.drawable.ep_me_history_learntime, sVar3, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 48, 124);
            float f11 = 7;
            iu.k.c(str2, j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), j3.y0.a((j3.y0) sVar3.j(d0Var), j12, j11, sVar, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 1, 0, s0.x0.a(j3.A(8), j11), sVar3, ((i13 >> 3) & 14) | 1572912, 184);
            sVar3.p(true);
            z1.r rVarC5 = j0.c.C(c2Var.a(oVar, 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.a2 a2VarA3 = j0.z1.a(bVar, iVar3, sVar3, 48);
            int iHashCode4 = Long.hashCode(sVar3.T);
            l1.q1 q1VarL4 = sVar3.l();
            z1.r rVarC6 = z1.a.c(sVar3, rVarC5);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar4);
            } else {
                sVar3.r0();
            }
            l1.t.J(hVar2, a2VarA3, sVar3);
            l1.t.J(hVar3, q1VarL4, sVar3);
            if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar6);
            }
            l1.t.J(hVar5, rVarC6, sVar3);
            d0.n.c(se.k.y(R.drawable.ep_me_history_xp, sVar3, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 48, 124);
            j13 = j11;
            sVar2 = sVar3;
            iu.k.c(str3, j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), j3.y0.a((j3.y0) sVar3.j(d0Var), j12, j11, sVar, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 1, 0, s0.x0.a(j3.A(8), j13), sVar2, ((i13 >> 6) & 14) | 1572912, 184);
            sVar2.p(true);
            sVar2.p(true);
            if (z11) {
                sVar2.d0(1157809787);
                k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar2, 0, 7);
                z12 = false;
            } else {
                z12 = false;
                sVar2.d0(1144789446);
            }
            sVar2.p(z12);
            sVar2.p(true);
        } else {
            j13 = j11;
            sVar2 = sVar3;
            sVar2.W();
        }
        l1.x1 x1VarT = sVar2.t();
        if (x1VarT != null) {
            final long j14 = j13;
            x1VarT.f39502d = new fz.e() { // from class: xu.w1
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a2.e(str, str2, str3, j14, sVar, j12, z11, rVar, (l1.n) obj, l1.t.M(i11 | 1));
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void f(zu.a0 dailyHistoryUiState, DailyGoalUiState dailyGoalUiState, fz.c updateDailyGoal, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(dailyHistoryUiState, "dailyHistoryUiState");
        kotlin.jvm.internal.m.f(dailyGoalUiState, "dailyGoalUiState");
        kotlin.jvm.internal.m.f(updateDailyGoal, "updateDailyGoal");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1027592955);
        int i12 = (sVar.h(dailyHistoryUiState) ? 4 : 2) | i11 | (sVar.h(dailyGoalUiState) ? 32 : 16) | (sVar.h(updateDailyGoal) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            k7.d(j0.c.C(e2.d(z1.o.f58481a, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 3), r0.f.d(8), null, null, null, t1.e.d(-111487789, new v1(dailyGoalUiState, updateDailyGoal, dailyHistoryUiState, 0), sVar), sVar, 196614, 28);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new s1(dailyHistoryUiState, dailyGoalUiState, updateDailyGoal, i11, 2);
        }
    }

    public static final void g(zu.b0 dailyHistoryUiState, DailyGoalUiState dailyGoalUiState, fz.c updateDailyGoal, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(dailyHistoryUiState, "dailyHistoryUiState");
        kotlin.jvm.internal.m.f(dailyGoalUiState, "dailyGoalUiState");
        kotlin.jvm.internal.m.f(updateDailyGoal, "updateDailyGoal");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1927593812);
        int i12 = (sVar.f(dailyHistoryUiState) ? 4 : 2) | i11 | (sVar.h(dailyGoalUiState) ? 32 : 16) | (sVar.h(updateDailyGoal) ? 256 : 128);
        if (!sVar.T(i12 & 1, (i12 & 147) != 146)) {
            sVar.W();
        } else if (dailyHistoryUiState.equals(zu.z.f59579a)) {
            sVar.d0(-1286741157);
            tv.a.d(0, 1, sVar, null);
            sVar.p(false);
        } else {
            if (!(dailyHistoryUiState instanceof zu.a0)) {
                throw nv.p.x(sVar, -1286743057, false);
            }
            sVar.d0(-1234204357);
            f((zu.a0) dailyHistoryUiState, dailyGoalUiState, updateDailyGoal, sVar, i12 & 1008);
            sVar.p(false);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new s1(dailyHistoryUiState, dailyGoalUiState, updateDailyGoal, i11, 0);
        }
    }

    public static final void h(List list, z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-572728395);
        int i12 = (sVar.h(list) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            c3 c3Var = z2.g1.f58547h;
            l1.t.a(c3Var.a(new v3.d(((v3.c) sVar.j(c3Var)).getDensity(), 1.0f)), t1.e.d(-2021974283, new u1(list, rVar), sVar), sVar, 56);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new u1(list, rVar, i11);
        }
    }
}
