package ys;

import bt.g6;
import bt.j5;
import bt.w6;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseUiState;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.UnitDirection;
import com.lingodeer.data.model.UnitState;
import com.yalantis.ucrop.view.CropImageView;
import h1.g7;
import h1.ua;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f57917a = 130;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f57918b = 42;

    public static final void a(final float f5, final int i11, final long j11, l1.n nVar, final z1.r rVar) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1833744814);
        if ((i11 & 6) == 0) {
            i12 = (sVar.c(f5) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.e(j11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(rVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            float f11 = 3;
            float f12 = 0;
            boolean z11 = (i12 & 14) == 4;
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new pr.h(f5);
                sVar.o0(objQ);
            }
            g7.a((fz.a) objQ, rVar, j11, f11, 0L, 0, f12, sVar, ((i12 >> 3) & 112) | 1575936 | ((i12 << 3) & 896), 48);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: ys.t2
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i11 | 1);
                    a3.a(f5, iM, j11, (l1.n) obj, rVar);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void b(z1.r rVar, l1.n nVar, int i11) {
        z1.r rVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-180040465);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            ad.p pVarL = gb.r.L(new ad.r(R.raw.course_current_enter), sVar);
            ad.i iVarE = ff.h.e((wc.h) pVarL.getValue(), false, 0.5f, sVar, 926);
            wc.h hVar = (wc.h) pVarL.getValue();
            boolean zF = sVar.f(iVarE);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = new w6(iVarE, 11);
                sVar.o0(objQ);
            }
            rVar2 = rVar;
            fr.j3.a(hVar, (fz.a) objQ, rVar2, null, null, w2.i.f54520g, sVar, 384, 48, 129016);
        } else {
            rVar2 = rVar;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.g(rVar2, i11, 17);
        }
    }

    public static final void c(int i11, l1.n nVar, z1.r rVar, boolean z11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1012504080);
        int i12 = (sVar.g(z11) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
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
            d0.n.c(se.k.y(z11 ? R.drawable.course_list_finish_active : R.drawable.course_list_finish_grey, sVar, 0), null, j0.e2.s(z1.o.f58481a, 72), null, w2.i.f54517d, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 25008, 104);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iv.g(z11, rVar, i11, 2);
        }
    }

    public static final void d(int i11, fz.a onClickLevelUp, l1.n nVar, z1.r rVar) {
        fz.a aVar;
        z1.r rVar2;
        kotlin.jvm.internal.m.f(onClickLevelUp, "onClickLevelUp");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-87473602);
        int i12 = (sVar.h(onClickLevelUp) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            aVar = onClickLevelUp;
            rVar2 = rVar;
            iu.k.e(aVar, rVar2, false, 0L, null, a.f57900u, sVar, ((i12 >> 3) & 14) | 196656, 28);
        } else {
            aVar = onClickLevelUp;
            rVar2 = rVar;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.u(i11, 4, aVar, rVar2);
        }
    }

    public static final void e(CourseUnit courseUnit, fz.c onClickUnitTestOut, l1.n nVar, int i11) {
        l1.s sVar;
        long jC;
        long jC2;
        Object r2Var;
        l1.g gVar;
        int i12;
        kotlin.jvm.internal.m.f(onClickUnitTestOut, "onClickUnitTestOut");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(104643434);
        int i13 = i11 | (sVar2.h(courseUnit) ? 4 : 2) | (sVar2.h(onClickUnitTestOut) ? 32 : 16);
        if (sVar2.T(i13 & 1, (i13 & 19) != 18)) {
            long jM217getActiveColor0d7_KjU = (courseUnit.isTestOutReview() || courseUnit.isTestOutActive()) ? courseUnit.m217getActiveColor0d7_KjU() : g2.f0.e(4289901234L);
            int i14 = (courseUnit.isTestOutReview() || courseUnit.isTestOutActive()) ? R.drawable.new_testout_key_active : R.drawable.new_testout_key_grey;
            if (!courseUnit.isTestOutReview()) {
                courseUnit.isTestOutActive();
            }
            UnitState unitState = UnitState.StateOpen;
            UnitState unitState2 = UnitState.StateRedo;
            UnitState[] unitStateArr = {unitState, unitState2};
            CourseUnit preUnit = courseUnit.getPreUnit();
            if (ry.l.D(unitStateArr, preUnit != null ? preUnit.getUnitState() : null)) {
                CourseUnit preUnit2 = courseUnit.getPreUnit();
                jC = preUnit2 != null ? preUnit2.m218getActiveDashLineColor0d7_KjU() : courseUnit.m218getActiveDashLineColor0d7_KjU();
            } else {
                jC = g2.f0.c(2107086743);
            }
            long j11 = jC;
            UnitState[] unitStateArr2 = {unitState, unitState2};
            CourseUnit nextUnit = courseUnit.getNextUnit();
            if (ry.l.D(unitStateArr2, nextUnit != null ? nextUnit.getUnitState() : null)) {
                CourseUnit nextUnit2 = courseUnit.getNextUnit();
                jC2 = nextUnit2 != null ? nextUnit2.m218getActiveDashLineColor0d7_KjU() : courseUnit.m218getActiveDashLineColor0d7_KjU();
            } else {
                jC2 = g2.f0.c(2107086743);
            }
            float fP = iu.k.p(sVar2);
            float f5 = f57918b;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarG = j0.e2.g(j0.e2.e(j0.c.E(j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 25, 7), 1.0f), 140);
            boolean zC = sVar2.c(fP) | sVar2.h(courseUnit) | sVar2.e(j11) | sVar2.e(jC2);
            Object objQ = sVar2.Q();
            long j12 = jC2;
            l1.g gVar2 = l1.m.f39353a;
            if (zC || objQ == gVar2) {
                gVar = gVar2;
                i12 = i14;
                r2Var = new r2(fP, courseUnit, j11, j12, 1);
                sVar2.o0(r2Var);
            } else {
                i12 = i14;
                r2Var = objQ;
                gVar = gVar2;
            }
            z1.r rVarD = z1.a.d(d2.h.e(rVarG, (fz.c) r2Var), -1.0f);
            z1.j jVar = z1.c.f58463a;
            w2.q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarD);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD, sVar2);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar2);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar2);
            z1.r rVarB = d2.h.b(j0.e2.g(j0.e2.e(oVar, 1.0f), 62), r0.f.d(10));
            z1.j jVar2 = z1.c.f58467e;
            j0.r rVar = j0.r.f35391a;
            z1.r rVarH = d0.n.h(rVar.a(rVarB, jVar2), jM217getActiveColor0d7_KjU, r0.f.d(12));
            boolean z11 = courseUnit.isTestOutActive() || courseUnit.isTestOutReview();
            boolean zH = ((i13 & 112) == 32) | sVar2.h(courseUnit);
            Object objQ2 = sVar2.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new at.s(onClickUnitTestOut, courseUnit, 3);
                sVar2.o0(objQ2);
            }
            z1.r rVarO = d0.n.o(rVarH, z11, null, (fz.a) objQ2, 14);
            w2.q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarO);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, q0VarD2, sVar2);
            l1.t.J(hVar2, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar2);
            d0.n.c(se.k.y(R.drawable.course_testout_bg_frame, sVar2, 0), null, j0.e2.d(oVar, 1.0f), null, w2.i.f54520g, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 25008, 104);
            sVar = sVar2;
            d0.n.c(se.k.y(i12, sVar, 0), null, rVar.a(j0.e2.p(j0.c.E(oVar, 24, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 47, 64), z1.c.f58466d), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 48, 120);
            ua.b(ub.a.e0(sVar, R.string.test_out), rVar.a(j0.c.E(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), jVar2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(ua.f31167a), g2.x.f28618e, fr.j3.A(18), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 0, 0, 65532);
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new pr.y(courseUnit, i11, 27, onClickUnitTestOut);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 l1.s, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    public static final void f(final String str, final long j11, final float f5, final boolean z11, final long j12, final fz.a aVar, final z1.r rVar, xt.u uVar, l1.n nVar, final int i11) {
        int i12;
        xt.u uVar2;
        boolean z12;
        int i13;
        boolean z13;
        Object objL;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(949312348);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.e(j11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.c(f5) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.g(z11) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.e(j12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(aVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.f(rVar) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= 4194304;
        }
        if (sVar.T(i12 & 1, (4793491 & i12) != 4793490)) {
            sVar.Y();
            int i14 = i11 & 1;
            Object obj = l1.m.f39353a;
            if (i14 == 0 || sVar.C()) {
                e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
                boolean zF = sVar.f(null) | sVar.f(aVarC);
                Object objQ = sVar.Q();
                if (zF || objQ == obj) {
                    objQ = w4.c.e(xt.u.class, aVarC, null, null, sVar);
                }
                z12 = false;
                sVar.p(false);
                sVar.p(false);
                uVar2 = (xt.u) objQ;
                i13 = i12 & (-29360129);
            } else {
                sVar.W();
                i13 = i12 & (-29360129);
                uVar2 = uVar;
                z12 = false;
            }
            int i15 = i13;
            sVar.q();
            z1.r rVarN = j0.e2.n(rVar, f57917a);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, z12);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarN);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            z1.o oVar = z1.o.f58481a;
            if (z11) {
                sVar.d0(1917570678);
                b(j0.e2.n(oVar, 160), sVar, 6);
                z13 = false;
            } else {
                z13 = false;
                sVar.d0(1895211308);
            }
            sVar.p(z13);
            r0.e eVar = r0.f.f48733a;
            z1.r rVarH = d0.n.h(oVar, j11, eVar);
            d0.v vVarA = d0.n.a(g2.x.f28618e, 3);
            z1.r rVarN2 = j0.e2.n(d0.n.k(vVarA.f22811a, vVarA.f22812b, eVar, rVarH), 82);
            boolean z14 = (i15 & 458752) == 131072;
            Object objQ2 = sVar.Q();
            if (z14 || objQ2 == obj) {
                objQ2 = new k2(6, aVar);
                sVar.o0(objQ2);
            }
            j0.c.g(sVar, iu.k.q(0, 7, (fz.a) objQ2, sVar, rVarN2, false));
            sVar.d0(1585896295);
            sVar.d0(1585893108);
            try {
                objL = se.k.y(uVar2.a(str), sVar, 0);
            } catch (Throwable th2) {
                objL = com.bumptech.glide.e.l(th2);
            }
            sVar.p(false);
            if (!(objL instanceof qy.n)) {
                d0.n.c((k2.b) objL, null, j0.e2.n(oVar, 80), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(j12, 5), sVar, 432, 56);
            }
            sVar.p(false);
            if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
                sVar.d0(1918407740);
                a(f5, ((i15 >> 6) & 14) | 384 | (i15 & 112), j11, sVar, j0.e2.n(oVar, 88));
            } else {
                sVar.d0(1895211308);
            }
            sVar.p(r3);
            if (z11) {
                sVar.d0(1918552324);
                d0.n.c(se.k.y(R.drawable.new_cur_unit_open, sVar, r3), null, j0.c.E(j0.r.f35391a.a(oVar, z1.c.f58465c), CropImageView.DEFAULT_ASPECT_RATIO, 24, 22, CropImageView.DEFAULT_ASPECT_RATIO, 9), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 120);
            } else {
                sVar.d0(1895211308);
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
            uVar2 = uVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            final xt.u uVar3 = uVar2;
            x1VarT.f39502d = new fz.e() { // from class: ys.s2
                @Override // fz.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    a3.f(str, j11, f5, z11, j12, aVar, rVar, uVar3, (l1.n) obj2, l1.t.M(i11 | 1));
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void g(CourseUnit courseUnit, boolean z11, fz.c onClickUnit, z1.r rVar, l1.n nVar, int i11) {
        int i12;
        long jM217getActiveColor0d7_KjU;
        kotlin.jvm.internal.m.f(onClickUnit, "onClickUnit");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1888985519);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(courseUnit) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(onClickUnit) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(rVar) ? 2048 : 1024;
        }
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            int i13 = z2.f58347a[courseUnit.getUnitState().ordinal()];
            if (i13 == 1 || i13 == 2) {
                jM217getActiveColor0d7_KjU = courseUnit.m217getActiveColor0d7_KjU();
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                jM217getActiveColor0d7_KjU = g2.f0.e(4292401368L);
            }
            long j11 = jM217getActiveColor0d7_KjU;
            String activeIcon = courseUnit.getActiveIcon();
            String str = courseUnit.getFinishedLessonCount() + "/" + courseUnit.getTotalLessonCount();
            boolean zD = sVar.d(courseUnit.getFinishedLessonCount()) | sVar.d(courseUnit.getTotalLessonCount());
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zD || objQ == gVar) {
                objQ = Float.valueOf(courseUnit.getFinishedLessonCount() / courseUnit.getTotalLessonCount());
                sVar.o0(objQ);
            }
            float fFloatValue = ((Number) objQ).floatValue();
            UnitDirection unitDirection = courseUnit.getUnitDirection();
            int[] iArr = z2.f58348b;
            j0.a2 a2VarA = j0.z1.a(iArr[unitDirection.ordinal()] == 1 ? j0.i.f35303a : j0.i.f35304b, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar);
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
            int i14 = iArr[courseUnit.getUnitDirection().ordinal()];
            z1.o oVar = z1.o.f58481a;
            float f5 = f57918b;
            if (i14 == 1) {
                sVar.d0(-83267263);
                long jE = courseUnit.getUnitState() == UnitState.StateLocked ? g2.f0.e(4289966513L) : g2.x.f28618e;
                boolean zH = ((i12 & 896) == 256) | sVar.h(courseUnit);
                Object objQ2 = sVar.Q();
                if (zH || objQ2 == gVar) {
                    objQ2 = new at.s(onClickUnit, courseUnit, 1);
                    sVar.o0(objQ2);
                }
                f(activeIcon, j11, fFloatValue, z11, jE, (fz.a) objQ2, j0.c.E(oVar, f5 - 15, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), null, sVar, ((i12 << 6) & 7168) | 1572864);
                sVar = sVar;
                String unitName = courseUnit.getUnitName();
                z1.h hVar2 = z1.c.O;
                z1.r rVarY = j0.c.y(oVar, -10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                j(unitName, str, hVar2, 5, j0.c.E(rVarY.i(new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 82, CropImageView.DEFAULT_ASPECT_RATIO, 11), sVar, 384);
                sVar.p(false);
            } else {
                if (i14 != 2) {
                    throw nv.p.x(sVar, 1936975587, false);
                }
                sVar.d0(-82193144);
                String unitName2 = courseUnit.getUnitName();
                z1.h hVar3 = z1.c.Q;
                z1.r rVarY2 = j0.c.y(oVar, 10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                j(unitName2, str, hVar3, 6, j0.c.E(rVarY2.i(new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 82, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), sVar, 384);
                long jE2 = courseUnit.getUnitState() == UnitState.StateLocked ? g2.f0.e(4289966513L) : g2.x.f28618e;
                boolean zH2 = ((i12 & 896) == 256) | sVar.h(courseUnit);
                Object objQ3 = sVar.Q();
                if (zH2 || objQ3 == gVar) {
                    objQ3 = new at.s(onClickUnit, courseUnit, 2);
                    sVar.o0(objQ3);
                }
                f(activeIcon, j11, fFloatValue, z11, jE2, (fz.a) objQ3, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5 - 15, CropImageView.DEFAULT_ASPECT_RATIO, 11), null, sVar, ((i12 << 6) & 7168) | 1572864);
                sVar = sVar;
                sVar.p(false);
            }
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.o(courseUnit, z11, onClickUnit, rVar, i11, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    public static final void h(CourseUnit courseUnit, boolean z11, fz.c cVar, z1.r rVar, l1.n nVar, int i11) {
        fz.c cVar2;
        boolean z12;
        CourseUnit courseUnit2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1198410330);
        int i12 = (sVar.h(courseUnit) ? 4 : 2) | i11 | (sVar.g(z11) ? 32 : 16) | (sVar.h(cVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            if (courseUnit.getNextUnit() != null) {
                CourseUnit nextUnit = courseUnit.getNextUnit();
                kotlin.jvm.internal.m.c(nextUnit);
                if (nextUnit.isTestOut()) {
                    sVar.d0(-1750070674);
                } else {
                    sVar.d0(-1732384926);
                    k(courseUnit, sVar, i12 & 14);
                }
            } else {
                sVar.d0(-1750070674);
            }
            sVar.p(false);
            cVar2 = cVar;
            g(courseUnit, z11, cVar2, j0.c.y(j0.e2.e(z1.o.f58481a, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 0, 1), sVar, (i12 & 14) | 3072 | (i12 & 112) | (i12 & 896));
            courseUnit2 = courseUnit;
            z12 = z11;
            sVar.p(true);
        } else {
            cVar2 = cVar;
            z12 = z11;
            courseUnit2 = courseUnit;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.d(courseUnit2, z12, cVar2, rVar, i11);
        }
    }

    public static final void i(CourseUiState.Success success, l0.w wVar, fz.c updateTopBannerRes, fz.a onClickAlphabet, fz.a onClickChineseTone, fz.c onClickUnit, fz.c onClickUnitTestOut, fz.a onClickLevelUp, l1.n nVar, int i11) {
        l1.s sVar;
        Object u2Var;
        l1.a1 a1Var;
        CourseUiState.Success courseUiState = success;
        l0.w lazyListState = wVar;
        kotlin.jvm.internal.m.f(courseUiState, "courseUiState");
        kotlin.jvm.internal.m.f(lazyListState, "lazyListState");
        kotlin.jvm.internal.m.f(updateTopBannerRes, "updateTopBannerRes");
        kotlin.jvm.internal.m.f(onClickAlphabet, "onClickAlphabet");
        kotlin.jvm.internal.m.f(onClickChineseTone, "onClickChineseTone");
        kotlin.jvm.internal.m.f(onClickUnit, "onClickUnit");
        kotlin.jvm.internal.m.f(onClickUnitTestOut, "onClickUnitTestOut");
        kotlin.jvm.internal.m.f(onClickLevelUp, "onClickLevelUp");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1464875968);
        int i12 = i11 | (sVar2.h(courseUiState) ? 4 : 2) | (sVar2.f(lazyListState) ? 32 : 16) | (sVar2.h(updateTopBannerRes) ? 256 : 128) | (sVar2.h(onClickAlphabet) ? 2048 : 1024) | (sVar2.h(onClickChineseTone) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(onClickUnit) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(onClickUnitTestOut) ? 1048576 : 524288) | (sVar2.h(onClickLevelUp) ? 8388608 : 4194304);
        if (sVar2.T(i12 & 1, (4793491 & i12) != 4793490)) {
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = defpackage.e.v(0, sVar2);
            }
            l1.a1 a1Var2 = (l1.a1) objQ;
            Object[] objArr = new Object[0];
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = new d(4);
                sVar2.o0(objQ2);
            }
            l1.b1 b1Var = (l1.b1) w1.j.c(objArr, (fz.a) objQ2, sVar2, 48);
            Boolean bool = (Boolean) b1Var.getValue();
            bool.getClass();
            int i13 = i12 & 112;
            boolean zF = sVar2.f(b1Var) | (i13 == 32) | sVar2.h(courseUiState);
            Object objQ3 = sVar2.Q();
            if (zF || objQ3 == gVar) {
                a1Var = a1Var2;
                u2Var = new u2(lazyListState, courseUiState, b1Var, a1Var, null);
                lazyListState = lazyListState;
                courseUiState = courseUiState;
                sVar2.o0(u2Var);
            } else {
                u2Var = objQ3;
                a1Var = a1Var2;
            }
            l1.t.f((fz.e) u2Var, bool, sVar2);
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = l1.t.s(new et.r(lazyListState, 2));
                sVar2.o0(objQ4);
            }
            l1.b3 b3Var = (l1.b3) objQ4;
            Integer numValueOf = Integer.valueOf(((Number) b3Var.getValue()).intValue());
            boolean zH = ((i12 & 896) == 256) | sVar2.h(courseUiState);
            Object objQ5 = sVar2.Q();
            if (zH || objQ5 == gVar) {
                objQ5 = new v2(courseUiState, updateTopBannerRes, b3Var, null);
                sVar2.o0(objQ5);
            }
            l1.t.f((fz.e) objQ5, numValueOf, sVar2);
            boolean zBooleanValue = ((Boolean) sVar2.j(ju.f.f37376j)).booleanValue();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = zBooleanValue ? j0.e2.e(oVar, 0.7f) : j0.e2.e(oVar, 1.0f);
            z1.r rVarD = j0.e2.d(oVar, 1.0f);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarD);
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
            j0.v1 v1VarF = j0.c.f(CropImageView.DEFAULT_ASPECT_RATIO, 42, CropImageView.DEFAULT_ASPECT_RATIO, 32, 5);
            Object objQ6 = sVar2.Q();
            if (objQ6 == gVar) {
                objQ6 = new bt.a2(a1Var, 18);
                sVar2.o0(objQ6);
            }
            z1.r rVarN = w2.a0.n(rVarE, (fz.c) objQ6);
            z1.h hVar2 = z1.c.P;
            boolean zH2 = sVar2.h(courseUiState) | ((3670016 & i12) == 1048576) | ((458752 & i12) == 131072) | ((i12 & 7168) == 2048) | ((57344 & i12) == 16384) | ((29360128 & i12) == 8388608);
            Object objQ7 = sVar2.Q();
            if (zH2 || objQ7 == gVar) {
                bt.g7 g7Var = new bt.g7(courseUiState, onClickUnitTestOut, onClickUnit, onClickAlphabet, onClickChineseTone, onClickLevelUp);
                sVar2.o0(g7Var);
                objQ7 = g7Var;
            }
            sVar = sVar2;
            ue.f.a(rVarN, wVar, v1VarF, null, hVar2, null, false, null, (fz.c) objQ7, sVar, i13 | 196992, 472);
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new g6(success, wVar, updateTopBannerRes, onClickAlphabet, onClickChineseTone, onClickUnit, onClickUnitTestOut, onClickLevelUp, i11);
        }
    }

    public static final void j(String str, String str2, z1.h hVar, int i11, z1.r rVar, l1.n nVar, int i12) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1910436031);
        int i13 = i12 | (sVar2.f(str) ? 4 : 2) | (sVar2.f(str2) ? 32 : 16) | (sVar2.d(i11) ? 2048 : 1024) | (sVar2.f(rVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar2.T(i13 & 1, (i13 & 9363) != 9362)) {
            j0.u uVarA = j0.t.a(j0.i.f35305c, hVar, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVar);
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
            y2.h hVar2 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar2);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar2);
            l1.d0 d0Var = ua.f31167a;
            j3.y0 y0Var = (j3.y0) sVar2.j(d0Var);
            long jA = fr.j3.A(16);
            n3.s sVar3 = n3.s.K;
            ua.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, 0L, jA, sVar3, null, null, 0L, null, null, i11, 0, 0L, null, 16744441), sVar2, i13 & 14, 0, 65534);
            j0.c.g(sVar2, j0.e2.g(z1.o.f58481a, 2));
            ua.b(str2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(d0Var), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31036s, fr.j3.A(12), sVar3, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar2, (i13 >> 3) & 14, 0, 65534);
            sVar = sVar2;
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a(str, str2, hVar, i11, rVar, i12);
        }
    }

    public static final void k(CourseUnit courseUnit, l1.n nVar, int i11) {
        int i12;
        float fP;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1841867185);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(courseUnit) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            UnitState[] unitStateArr = {UnitState.StateOpen, UnitState.StateRedo};
            CourseUnit nextUnit = courseUnit.getNextUnit();
            long jM218getActiveDashLineColor0d7_KjU = ry.l.D(unitStateArr, nextUnit != null ? nextUnit.getUnitState() : null) ? courseUnit.m218getActiveDashLineColor0d7_KjU() : g2.f0.c(2107086743);
            float f5 = f57917a;
            z1.r rVarG = j0.e2.g(j0.e2.e(j0.c.C(j0.c.y(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, f5 / 2, 1), f57918b + 45, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), f5);
            int i13 = z2.f58348b[courseUnit.getUnitDirection().ordinal()];
            if (i13 == 1) {
                sVar.d0(-1436298369);
                fP = iu.k.p(sVar);
                sVar.p(false);
            } else {
                if (i13 != 2) {
                    throw nv.p.x(sVar, 507855229, false);
                }
                sVar.d0(-1436216002);
                fP = -iu.k.p(sVar);
                sVar.p(false);
            }
            boolean zC = sVar.c(fP) | sVar.e(jM218getActiveDashLineColor0d7_KjU);
            Object objQ = sVar.Q();
            if (zC || objQ == l1.m.f39353a) {
                objQ = new iu.m(fP, 2, jM218getActiveDashLineColor0d7_KjU);
                sVar.o0(objQ);
            }
            d0.n.b(6, (fz.c) objQ, sVar, rVarG);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j5(courseUnit, i11, 5);
        }
    }
}
