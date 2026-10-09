package xu;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bt.i5;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.uistate.CommonUiState;
import com.lingodeer.data.model.uistate.DailyGoalUiState;
import com.lingodeer.data.model.uistate.DayStreakUiState;
import com.lingodeer.data.model.uistate.LeaderBoardClass;
import com.lingodeer.data.model.uistate.LeaderBoardUiState;
import com.lingodeer.data.model.uistate.MainUiState;
import com.lingodeer.data.model.uistate.MasteryUiState;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import dt.i2;
import fr.j3;
import h1.k7;
import h1.ua;
import j0.c2;
import j0.e2;
import kotlin.NoWhenBranchMatchedException;
import l1.b3;
import mt.k6;
import zu.j2;
import zu.k2;
import zu.l2;
import zu.s2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a1 {
    /* JADX WARN: Code duplicated, block: B:164:0x0497  */
    /* JADX WARN: Code duplicated, block: B:165:0x0499  */
    /* JADX WARN: Code duplicated, block: B:169:0x04a2  */
    public static final void a(String str, String str2, boolean z11, int i11, int i12, CommonUiState commonUiState, fz.c cVar, l1.n nVar, int i13) {
        int i14;
        int i15;
        int i16;
        fz.c cVar2;
        j0.b bVar;
        int i17;
        l1.s sVar;
        boolean z12;
        boolean z13;
        l1.g gVar;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objQ;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-954926962);
        if ((i13 & 6) == 0) {
            i14 = (sVar2.f(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar2.f(str2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= sVar2.g(z11) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= sVar2.d(i11) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= sVar2.d(i12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i13) == 0) {
            i14 |= sVar2.h(commonUiState) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i13) == 0) {
            i14 |= sVar2.h(cVar) ? 1048576 : 524288;
        }
        if (sVar2.T(i14 & 1, (599187 & i14) != 599186)) {
            z1.j jVar = z1.c.f58463a;
            w2.q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar2, oVar);
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
            float f5 = 16;
            z1.r rVarE = j0.c.E(j0.c.F(e2.e(oVar, 1.0f)), 22, 12, f5, CropImageView.DEFAULT_ASPECT_RATIO, 8);
            int i18 = i14 & 3670016;
            boolean z17 = (i18 == 1048576) | ((i14 & 896) == 256);
            Object objQ2 = sVar2.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (z17 || objQ2 == gVar2) {
                objQ2 = new i2(cVar, z11, 2);
                sVar2.o0(objQ2);
            }
            z1.r rVarQ = iu.k.q(0, 7, (fz.a) objQ2, sVar2, rVarE, false);
            z1.i iVar2 = z1.c.M;
            j0.b bVar2 = j0.i.f35303a;
            j0.a2 a2VarA = j0.z1.a(bVar2, iVar2, sVar2, 48);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarQ);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, a2VarA, sVar2);
            l1.t.J(hVar2, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar2);
            w2.q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode3 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL3 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, oVar);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, q0VarD2, sVar2);
            l1.t.J(hVar2, q1VarL3, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar2);
            boolean zK0 = oz.q.K0(str);
            int i19 = R.drawable.ep_me_avaster_active;
            if (zK0) {
                bVar = bVar2;
                i17 = 16;
                sVar2.d0(-1058391847);
                if (!z11) {
                    i19 = R.drawable.me_avaster;
                }
                k2.b bVarY = se.k.y(i19, sVar2, 0);
                z1.r rVarB = d2.h.b(e2.n(oVar, 52), r0.f.a());
                d0.v vVarA = d0.n.a(g2.x.f28618e, 1);
                d0.n.c(bVarY, null, d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.a(), rVarB), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 48, 120);
                sVar = sVar2;
                z12 = false;
                sVar.p(false);
            } else {
                sVar2.d0(-1059248501);
                String strConcat = oz.x.s0(str, "http", false) ? str : null;
                if (strConcat == null) {
                    strConcat = "https://lingodeer.oss-us-west-1.aliyuncs.com/uimage/".concat(str);
                }
                k2.b bVarY2 = se.k.y(R.drawable.ep_me_avaster_active, sVar2, 0);
                z1.r rVarB2 = d2.h.b(e2.n(oVar, 52), r0.f.a());
                String str3 = strConcat;
                d0.v vVarA2 = d0.n.a(g2.x.f28618e, 1);
                bVar = bVar2;
                i17 = 16;
                wb.k.b(str3, null, d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.a(), rVarB2), bVarY2, null, w2.i.f54517d, sVar2, 48, 64496);
                sVar = sVar2;
                z12 = false;
                sVar.p(false);
            }
            if (kotlin.jvm.internal.m.a(commonUiState, CommonUiState.Loading.INSTANCE)) {
                sVar.d0(1628456162);
                sVar.p(z12);
            } else {
                if (!(commonUiState instanceof CommonUiState.Success)) {
                    throw nv.p.x(sVar, 1628454708, false);
                }
                sVar.d0(-1057395879);
                if (((CommonUiState.Success) commonUiState).getHasPurchased()) {
                    sVar.d0(-1057340823);
                    l1.s sVar3 = sVar;
                    d0.n.c(se.k.y(R.drawable.ic_me_membership_crown, sVar, 0), null, d2.h.i(j0.c.x(j0.r.f35391a.a(oVar, z1.c.f58465c), 10, -12), iu.k.p(sVar), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 48, 120);
                    sVar = sVar3;
                    z13 = false;
                } else {
                    z13 = false;
                    sVar.d0(-1084488732);
                }
                sVar.p(z13);
                sVar.p(z13);
            }
            sVar.p(true);
            z1.r rVarE2 = j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            z1.r rVarP = w4.c.p(1.0f, true, rVarE2);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode4 = Long.hashCode(sVar.T);
            l1.q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarP);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA, sVar);
            l1.t.J(hVar2, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar3);
            }
            l1.t.J(hVar4, rVarC4, sVar);
            j3.y0 y0Var = (j3.y0) sVar.j(ua.f31167a);
            long jA = j3.A(i17);
            n3.s sVar4 = n3.s.K;
            long j11 = ju.a.f37339r;
            l1.s sVar5 = sVar;
            ua.b(str2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, j11, jA, sVar4, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar5, (i14 >> 3) & 14, 0, 65534);
            l1.s sVar6 = sVar5;
            if (z11) {
                sVar6.d0(-1911235650);
                z1.r rVarE3 = j0.c.E(j0.c.q(oVar, j0.e1.Min), CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                j0.a2 a2VarA2 = j0.z1.a(bVar, z1.c.L, sVar6, 0);
                int iHashCode5 = Long.hashCode(sVar6.T);
                l1.q1 q1VarL5 = sVar6.l();
                z1.r rVarC5 = z1.a.c(sVar6, rVarE3);
                sVar6.h0();
                if (sVar6.S) {
                    sVar6.k(iVar);
                } else {
                    sVar6.r0();
                }
                l1.t.J(hVar, a2VarA2, sVar6);
                l1.t.J(hVar2, q1VarL5, sVar6);
                if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode5))) {
                    defpackage.e.A(iHashCode5, sVar6, iHashCode5, hVar3);
                }
                l1.t.J(hVar4, rVarC5, sVar6);
                String strE0 = ub.a.e0(sVar6, R.string.following);
                boolean z18 = i18 == 1048576;
                Object objQ3 = sVar6.Q();
                if (z18) {
                    gVar = gVar2;
                } else {
                    gVar = gVar2;
                    if (objQ3 != gVar) {
                        cVar2 = cVar;
                    }
                    i15 = i11;
                    b(i15, (i14 >> 9) & 14, strE0, sVar6, iu.k.q(6, 7, (fz.a) objQ3, sVar6, oVar, false));
                    k7.n(j0.c.B(oVar, f5, 4), CropImageView.DEFAULT_ASPECT_RATIO, j11, sVar6, 6, 2);
                    sVar6 = sVar6;
                    String strE1 = ub.a.e0(sVar6, R.string.followers);
                    if (i18 == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objQ = sVar6.Q();
                    if (z16 || objQ == gVar) {
                        objQ = new w0(cVar2, 1);
                        sVar6.o0(objQ);
                    }
                    i16 = i12;
                    b(i16, (i14 >> 12) & 14, strE1, sVar6, iu.k.q(6, 7, (fz.a) objQ, sVar6, oVar, false));
                    z14 = true;
                    sVar6.p(true);
                    z15 = false;
                }
                cVar2 = cVar;
                objQ3 = new w0(cVar2, 0);
                sVar6.o0(objQ3);
                i15 = i11;
                b(i15, (i14 >> 9) & 14, strE0, sVar6, iu.k.q(6, 7, (fz.a) objQ3, sVar6, oVar, false));
                k7.n(j0.c.B(oVar, f5, 4), CropImageView.DEFAULT_ASPECT_RATIO, j11, sVar6, 6, 2);
                sVar6 = sVar6;
                String strE2 = ub.a.e0(sVar6, R.string.followers);
                if (i18 == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objQ = sVar6.Q();
                if (z16) {
                    objQ = new w0(cVar2, 1);
                    sVar6.o0(objQ);
                } else {
                    objQ = new w0(cVar2, 1);
                    sVar6.o0(objQ);
                }
                i16 = i12;
                b(i16, (i14 >> 12) & 14, strE2, sVar6, iu.k.q(6, 7, (fz.a) objQ, sVar6, oVar, false));
                z14 = true;
                sVar6.p(true);
                z15 = false;
            } else {
                i15 = i11;
                i16 = i12;
                cVar2 = cVar;
                gVar = gVar2;
                z14 = true;
                z15 = false;
                sVar6.d0(-1939426988);
            }
            sVar6.p(z15);
            sVar6.p(z14);
            boolean z19 = i18 == 1048576;
            Object objQ4 = sVar6.Q();
            if (z19 || objQ4 == gVar) {
                objQ4 = new w0(cVar2, 2);
                sVar6.o0(objQ4);
            }
            l1.s sVar7 = sVar6;
            k7.h((fz.a) objQ4, null, false, null, c.V, sVar7, 196608, 30);
            sVar2 = sVar7;
            sVar2.p(true);
            sVar2.p(true);
        } else {
            i15 = i11;
            i16 = i12;
            cVar2 = cVar;
            sVar2.W();
        }
        l1.x1 x1VarT = sVar2.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new tg.f0(str, str2, z11, i15, i16, commonUiState, cVar2, i13);
        }
    }

    public static final void b(int i11, int i12, String str, l1.n nVar, z1.r rVar) {
        int i13;
        String str2 = str;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1961819290);
        if ((i12 & 6) == 0) {
            i13 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.f(str2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar.f(rVar) ? 256 : 128;
        }
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.N, sVar, 48);
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
            String strValueOf = String.valueOf(i11);
            l1.d0 d0Var = ua.f31167a;
            j3.y0 y0Var = (j3.y0) sVar.j(d0Var);
            long jA = j3.A(14);
            n3.s sVar2 = n3.s.H;
            long j11 = ju.a.f37339r;
            ua.b(strValueOf, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, j11, jA, sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 0, 0, 65534);
            str2 = str;
            ua.b(str2, j0.c.E(z1.o.f58481a, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 2, 6), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(d0Var), j11, j3.A(10), n3.s.L, null, null, 0L, null, u3.l.f52752c, 0, 0, 0L, null, 16773112), sVar, ((i13 >> 3) & 14) | 48, 0, 65532);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.z(i11, str2, rVar, i12);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void c(MainUiState mainUiState, fz.c handleIntent, s2 s2Var, l1.n nVar, int i11) {
        s2 s2Var2;
        int i12;
        s2 s2Var3;
        kotlin.jvm.internal.m.f(mainUiState, "mainUiState");
        kotlin.jvm.internal.m.f(handleIntent, "handleIntent");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1030249834);
        int i13 = i11 | (sVar.h(mainUiState) ? 4 : 2) | (sVar.h(handleIntent) ? 32 : 16) | 128;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(s2.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-897);
                s2Var3 = (s2) viewModelA;
            } else {
                sVar.W();
                i12 = i13 & (-897);
                s2Var3 = s2Var;
            }
            sVar.q();
            l1.b1 b1VarO = l1.t.o(s2Var3.K, sVar);
            l1.b1 b1VarO2 = l1.t.o(s2Var3.M, sVar);
            l1.b1 b1VarO3 = l1.t.o(s2Var3.O, sVar);
            l1.b1 b1VarO4 = l1.t.o(s2Var3.Q, sVar);
            l1.b1 b1VarO5 = l1.t.o(s2Var3.P, sVar);
            l2 l2Var = (l2) b1VarO.getValue();
            zu.t tVar = (zu.t) b1VarO4.getValue();
            zu.b0 b0Var = (zu.b0) b1VarO3.getValue();
            zu.y0 y0Var = (zu.y0) b1VarO2.getValue();
            MasteryUiState masteryUiState = (MasteryUiState) b1VarO5.getValue();
            LeaderBoardUiState leaderBoardUiState = mainUiState.getLeaderBoardUiState();
            boolean zF = sVar.f(b1VarO2) | sVar.h(s2Var3) | ((i12 & 112) == 32);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = new x0.j(s2Var3, handleIntent, b1VarO2, 1);
                sVar.o0(objQ);
            }
            d(l2Var, tVar, b0Var, mainUiState, masteryUiState, leaderBoardUiState, y0Var, handleIntent, (fz.c) objQ, sVar, ((i12 << 18) & 29360128) | ((i12 << 9) & 7168));
            s2Var2 = s2Var3;
        } else {
            sVar.W();
            s2Var2 = s2Var;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(mainUiState, handleIntent, false, s2Var2, i11, 28);
        }
    }

    public static final void d(l2 l2Var, zu.t tVar, zu.b0 b0Var, MainUiState mainUiState, MasteryUiState masteryUiState, LeaderBoardUiState leaderBoardUiState, zu.y0 y0Var, fz.c cVar, fz.c cVar2, l1.n nVar, int i11) {
        int i12;
        LeaderBoardUiState leaderBoardUiState2;
        fz.c cVar3;
        fz.c cVar4;
        String strM;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(790971402);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar.f(l2Var) : sVar.h(l2Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar.f(tVar) : sVar.h(tVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & 512) == 0 ? sVar.f(b0Var) : sVar.h(b0Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(mainUiState) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(masteryUiState) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            leaderBoardUiState2 = leaderBoardUiState;
            i12 |= sVar.h(leaderBoardUiState2) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        } else {
            leaderBoardUiState2 = leaderBoardUiState;
        }
        if ((1572864 & i11) == 0) {
            i12 |= (2097152 & i11) == 0 ? sVar.f(y0Var) : sVar.h(y0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            cVar3 = cVar;
            i12 |= sVar.h(cVar3) ? 8388608 : 4194304;
        } else {
            cVar3 = cVar;
        }
        if ((100663296 & i11) == 0) {
            cVar4 = cVar2;
            i12 |= sVar.h(cVar4) ? 67108864 : 33554432;
        } else {
            cVar4 = cVar2;
        }
        if (!sVar.T(i12 & 1, (38347923 & i12) != 38347922)) {
            sVar.W();
        } else if (kotlin.jvm.internal.m.a(l2Var, j2.f59458a)) {
            sVar.d0(-85677991);
            tv.a.d(0, 1, sVar, null);
            sVar.p(false);
        } else {
            if (!(l2Var instanceof k2)) {
                throw nv.p.x(sVar, -85677172, false);
            }
            sVar.d0(1639065114);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarH = d0.n.h(e2.d(oVar, 1.0f), ((h1.s1) sVar.j(h1.v1.f31180a)).f31031n, g2.f0.f28556b);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
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
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            int i13 = i12;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            d0.n.c(se.k.y(R.drawable.me_top_banner, sVar, 0), null, e2.g(e2.e(oVar, 1.0f), 162), null, w2.i.f54520g, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 25008, 104);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            k2 k2Var = (k2) l2Var;
            String str = k2Var.f59468c;
            if (k2Var.f59466a) {
                sVar.d0(90112371);
                sVar.p(false);
                strM = k2Var.f59467b;
            } else {
                strM = ep.a.m(sVar, 90191173, R.string.sign_in_sign_up, sVar, false);
            }
            int i14 = (i13 >> 3) & 3670016;
            a(str, strM, k2Var.f59466a, k2Var.f59473h, k2Var.f59474i, mainUiState.getCommonUiState(), cVar3, sVar, i14);
            int i15 = i13 >> 6;
            f(k2Var, mainUiState.getDayStreakUiState(), tVar, leaderBoardUiState2, y0Var, cVar4, sVar, ((i13 << 3) & 896) | (i15 & 7168) | (i15 & 57344) | ((i13 >> 9) & 458752));
            e(y0Var, tVar, b0Var, mainUiState.getDailyGoalUiState(), masteryUiState, leaderBoardUiState, cVar, sVar, (i13 & 458752) | ((i13 >> 18) & 14) | (i13 & 112) | (i13 & 896) | (i13 & 57344) | i14);
            sVar = sVar;
            com.google.android.material.datepicker.d.B(sVar, true, true, false);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i5(l2Var, tVar, b0Var, mainUiState, masteryUiState, leaderBoardUiState, y0Var, cVar, cVar2, i11);
        }
    }

    public static final void e(final zu.y0 y0Var, zu.t tVar, zu.b0 b0Var, DailyGoalUiState dailyGoalUiState, MasteryUiState masteryUiState, LeaderBoardUiState leaderBoardUiState, fz.c cVar, l1.n nVar, int i11) {
        int i12;
        LeaderBoardUiState leaderBoardUiState2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-437515500);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar.f(y0Var) : sVar.h(y0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar.f(tVar) : sVar.h(tVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & 512) == 0 ? sVar.f(b0Var) : sVar.h(b0Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(dailyGoalUiState) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(masteryUiState) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            leaderBoardUiState2 = leaderBoardUiState;
            i12 |= sVar.h(leaderBoardUiState2) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        } else {
            leaderBoardUiState2 = leaderBoardUiState;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.h(cVar) ? 1048576 : 524288;
        }
        if (sVar.T(i12 & 1, (599187 & i12) != 599186)) {
            float f5 = 12;
            final float fE0 = ((v3.c) sVar.j(z2.g1.f58547h)).e0(f5);
            final int i13 = (int) fE0;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = defpackage.e.v(0, sVar);
            }
            l1.a1 a1Var = (l1.a1) objQ;
            l1.h1 h1Var = (l1.h1) a1Var;
            int i14 = i13 * 2;
            final l1.b1 b1VarH = l1.t.H(Integer.valueOf((h1Var.l() - i14) / 3), sVar);
            int iL = (h1Var.l() - i14) / 3;
            int i15 = i12;
            final l1.b1 b1VarH2 = l1.t.H(Integer.valueOf(iL), sVar);
            boolean zD = sVar.d(h1Var.l()) | ((i15 & 14) == 4 || ((i15 & 8) != 0 && sVar.f(y0Var)));
            Object objQ2 = sVar.Q();
            if (zD || objQ2 == gVar) {
                objQ2 = l1.t.s(new fz.a() { // from class: xu.y0
                    @Override // fz.a
                    public final Object invoke() {
                        int i16;
                        int iIntValue;
                        int iIntValue2;
                        int iIntValue3;
                        zu.w0 w0Var = zu.w0.f59570a;
                        zu.y0 y0Var2 = y0Var;
                        boolean zA = kotlin.jvm.internal.m.a(y0Var2, w0Var);
                        int i17 = i13;
                        l1.b1 b1Var = b1VarH2;
                        if (!zA) {
                            if (kotlin.jvm.internal.m.a(y0Var2, zu.u0.f59565a)) {
                                iIntValue = ((Number) b1Var.getValue()).intValue() + i17;
                                iIntValue2 = ((Number) b1Var.getValue()).intValue() / 2;
                            } else {
                                if (!kotlin.jvm.internal.m.a(y0Var2, zu.r0.f59544a)) {
                                    boolean zA2 = kotlin.jvm.internal.m.a(y0Var2, zu.s0.f59553a);
                                    l1.b1 b1Var2 = b1VarH;
                                    if (zA2) {
                                        iIntValue3 = ((Number) b1Var2.getValue()).intValue() / 2;
                                    } else if (kotlin.jvm.internal.m.a(y0Var2, zu.x0.f59575a)) {
                                        iIntValue = ((Number) b1Var2.getValue()).intValue() + i17;
                                        iIntValue2 = ((Number) b1Var2.getValue()).intValue() / 2;
                                    } else if (kotlin.jvm.internal.m.a(y0Var2, zu.v0.f59568a)) {
                                        iIntValue = (((Number) b1Var2.getValue()).intValue() * 2) + i17;
                                        iIntValue2 = ((Number) b1Var2.getValue()).intValue() / 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    return Integer.valueOf(i16);
                                }
                                iIntValue = (((Number) b1Var.getValue()).intValue() * 2) + i17;
                                iIntValue2 = ((Number) b1Var.getValue()).intValue() / 2;
                            }
                            i16 = iIntValue + iIntValue2;
                            return Integer.valueOf(i16);
                        }
                        iIntValue3 = ((Number) b1Var.getValue()).intValue() / 2;
                        i16 = iIntValue3 + i17;
                        return Integer.valueOf(i16);
                    }
                });
                sVar.o0(objQ2);
            }
            b3 b3VarC = b0.h.c(Integer.valueOf(((Number) ((b3) objQ2).getValue()).intValue()), b0.e.f3497k, b0.h.f3549c, null, BuildConfig.VERSION_NAME, sVar, 24576, 8);
            final long j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).H;
            final int iIntValue = ((Number) b3VarC.getValue()).intValue();
            z1.r rVarE = j0.c.E(d2.h.d(z1.o.f58481a, new fz.c() { // from class: xu.x0
                @Override // fz.c
                public final Object invoke(Object obj) {
                    i2.d drawBehind = (i2.d) obj;
                    kotlin.jvm.internal.m.f(drawBehind, "$this$drawBehind");
                    int i16 = iIntValue;
                    if (i16 != 0) {
                        g2.k kVarA = g2.o.a();
                        float f11 = i16;
                        kVarA.g(f11, CropImageView.DEFAULT_ASPECT_RATIO);
                        float f12 = fE0;
                        kVarA.f(f11 - f12, f12);
                        kVarA.f(f11 + f12, f12);
                        kVarA.d();
                        i2.d.o0(drawBehind, kVarA, j11, CropImageView.DEFAULT_ASPECT_RATIO, i2.g.f34126a, 52);
                    }
                    return qy.b0.f48488a;
                }
            }), CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = new bt.a2(a1Var, 16);
                sVar.o0(objQ3);
            }
            k7.d(w2.a0.m(rVarE, (fz.c) objQ3), r0.f.d(0), null, null, null, t1.e.d(629441122, new ei.l(y0Var, tVar, cVar, leaderBoardUiState2, b0Var, dailyGoalUiState, masteryUiState, 6), sVar), sVar, 196608, 28);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new mt.e(y0Var, tVar, b0Var, dailyGoalUiState, masteryUiState, leaderBoardUiState, cVar, i11, 5);
        }
    }

    public static final void f(k2 k2Var, DayStreakUiState dayStreakUiState, zu.t tVar, LeaderBoardUiState leaderBoardUiState, zu.y0 y0Var, fz.c cVar, l1.n nVar, int i11) {
        int i12;
        LeaderBoardUiState leaderBoardUiState2;
        l1.s sVar;
        y2.h hVar;
        int i13;
        boolean z11;
        boolean z12;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-884509979);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.f(k2Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(dayStreakUiState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & 512) == 0 ? sVar2.f(tVar) : sVar2.h(tVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            leaderBoardUiState2 = leaderBoardUiState;
            i12 |= sVar2.h(leaderBoardUiState2) ? 2048 : 1024;
        } else {
            leaderBoardUiState2 = leaderBoardUiState;
        }
        if ((i11 & 24576) == 0) {
            i12 |= (32768 & i11) == 0 ? sVar2.f(y0Var) : sVar2.h(y0Var) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(cVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        int i14 = i12;
        if (sVar2.T(i14 & 1, (i14 & 74899) != 74898)) {
            boolean zD = ry.l.D(new zu.y0[]{zu.s0.f59553a, zu.x0.f59575a, zu.v0.f59568a}, y0Var);
            float f5 = 16;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = e2.e(e2.g(j0.c.E(j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 126), 1.0f);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarE);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, q0VarD, sVar2);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar2);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar2);
            z1.r rVarC2 = e2.c(oVar, 1.0f);
            j0.d dVar = j0.i.f35306d;
            z1.h hVar6 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar6, sVar2, 6);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, rVarC2);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar2, uVarA, sVar2);
            l1.t.J(hVar3, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                hVar = hVar4;
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
            } else {
                hVar = hVar4;
            }
            l1.t.J(hVar5, rVarC3, sVar2);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                i13 = 0;
                objQ = l1.t.B(new v3.f(0));
                sVar2.o0(objQ);
            } else {
                i13 = 0;
            }
            l1.b1 b1Var = (l1.b1) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(new v3.f(i13));
                sVar2.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(new v3.f(8));
                sVar2.o0(objQ3);
            }
            l1.b1 b1Var3 = (l1.b1) objQ3;
            b3 b3VarA = b0.h.a(((v3.f) b1Var.getValue()).f53489a, null, BuildConfig.VERSION_NAME, sVar2, 384, 10);
            b3 b3VarA2 = b0.h.a(((v3.f) b1Var2.getValue()).f53489a, null, BuildConfig.VERSION_NAME, sVar2, 384, 10);
            b3 b3VarA3 = b0.h.a(((v3.f) b1Var3.getValue()).f53489a, null, BuildConfig.VERSION_NAME, sVar2, 384, 10);
            Boolean boolValueOf = Boolean.valueOf(zD);
            boolean zG = sVar2.g(zD);
            Object objQ4 = sVar2.Q();
            if (zG || objQ4 == gVar) {
                objQ4 = new z0(zD, b1Var, b1Var2, b1Var3, null, 0);
                z11 = zD;
                sVar2.o0(objQ4);
            } else {
                z11 = zD;
            }
            l1.t.f((fz.e) objQ4, boolValueOf, sVar2);
            r0.e eVarE = r0.f.e(((v3.f) b3VarA2.getValue()).f53489a, ((v3.f) b3VarA2.getValue()).f53489a, ((v3.f) b3VarA3.getValue()).f53489a, ((v3.f) b3VarA3.getValue()).f53489a);
            z1.r rVarC4 = j0.c.C(oVar, ((v3.f) b3VarA.getValue()).f53489a, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            int i15 = i14 & 458752;
            boolean z13 = i15 == 131072;
            Object objQ5 = sVar2.Q();
            if (z13 || objQ5 == gVar) {
                objQ5 = new uu.b(cVar, 22);
                sVar2.o0(objQ5);
            }
            y2.h hVar7 = hVar;
            g(eVarE, tVar, leaderBoardUiState2, y0Var, k2Var, rVarC4, (fz.c) objQ5, sVar2, ((i14 >> 3) & 8176) | ((i14 << 12) & 57344));
            boolean z14 = !z11;
            a0.j0.c(z14, null, null, null, null, c.T, sVar2, 1572870, 30);
            sVar2.p(true);
            z1.r rVarC5 = e2.c(oVar, 1.0f);
            j0.u uVarA2 = j0.t.a(j0.i.f35305c, hVar6, sVar2, 6);
            int iHashCode3 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL3 = sVar2.l();
            z1.r rVarC6 = z1.a.c(sVar2, rVarC5);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar2, uVarA2, sVar2);
            l1.t.J(hVar3, q1VarL3, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar7);
            }
            l1.t.J(hVar5, rVarC6, sVar2);
            Object objQ6 = sVar2.Q();
            if (objQ6 == gVar) {
                objQ6 = l1.t.B(new v3.f(10));
                sVar2.o0(objQ6);
            }
            l1.b1 b1Var4 = (l1.b1) objQ6;
            Object objQ7 = sVar2.Q();
            if (objQ7 == gVar) {
                objQ7 = l1.t.B(new v3.f(8));
                sVar2.o0(objQ7);
            }
            l1.b1 b1Var5 = (l1.b1) objQ7;
            Object objQ8 = sVar2.Q();
            if (objQ8 == gVar) {
                z12 = false;
                objQ8 = l1.t.B(new v3.f(0));
                sVar2.o0(objQ8);
            } else {
                z12 = false;
            }
            l1.b1 b1Var6 = (l1.b1) objQ8;
            b3 b3VarA4 = b0.h.a(((v3.f) b1Var4.getValue()).f53489a, null, BuildConfig.VERSION_NAME, sVar2, 384, 10);
            b3 b3VarA5 = b0.h.a(((v3.f) b1Var5.getValue()).f53489a, null, BuildConfig.VERSION_NAME, sVar2, 384, 10);
            b3 b3VarA6 = b0.h.a(((v3.f) b1Var6.getValue()).f53489a, null, BuildConfig.VERSION_NAME, sVar2, 384, 10);
            Boolean boolValueOf2 = Boolean.valueOf(z11);
            boolean zG2 = sVar2.g(z11);
            Object objQ9 = sVar2.Q();
            if (zG2 || objQ9 == gVar) {
                objQ9 = new z0(z11, b1Var4, b1Var5, b1Var6, null, 1);
                sVar2.o0(objQ9);
            }
            l1.t.f((fz.e) objQ9, boolValueOf2, sVar2);
            a0.j0.c(z14, null, null, null, null, c.U, sVar2, 1572870, 30);
            r0.e eVarE2 = r0.f.e(((v3.f) b3VarA5.getValue()).f53489a, ((v3.f) b3VarA5.getValue()).f53489a, ((v3.f) b3VarA6.getValue()).f53489a, ((v3.f) b3VarA6.getValue()).f53489a);
            int i16 = k2Var.f59475j;
            z1.r rVarC7 = j0.c.C(oVar, ((v3.f) b3VarA4.getValue()).f53489a, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            if (i15 == 131072) {
                z12 = true;
            }
            Object objQ10 = sVar2.Q();
            if (z12 || objQ10 == gVar) {
                objQ10 = new uu.b(cVar, 23);
                sVar2.o0(objQ10);
            }
            h(eVarE2, i16, k2Var, dayStreakUiState, y0Var, rVarC7, (fz.c) objQ10, sVar2, ((i14 << 6) & 8064) | (i14 & 57344));
            sVar = sVar2;
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.d(k2Var, dayStreakUiState, tVar, leaderBoardUiState, y0Var, cVar, i11, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(r0.e eVar, zu.t tVar, LeaderBoardUiState leaderBoardUiState, zu.y0 y0Var, k2 k2Var, z1.r rVar, fz.c cVar, l1.n nVar, int i11) {
        int i12;
        String strValueOf;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-827010142);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar.f(tVar) : sVar.h(tVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(leaderBoardUiState) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= (i11 & 4096) == 0 ? sVar.f(y0Var) : sVar.h(y0Var) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.f(k2Var) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.f(rVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.h(cVar) ? 1048576 : 524288;
        }
        if (sVar.T(i12 & 1, (599187 & i12) != 599186)) {
            z1.r rVarB = d2.h.b(d0.n.h(e2.g(rVar, 62), ((h1.s1) sVar.j(h1.v1.f31180a)).F, eVar), eVar);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
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
            String strE0 = ub.a.e0(sVar, R.string.achievements);
            if (kotlin.jvm.internal.m.a(tVar, zu.r.f59543a)) {
                strValueOf = BuildConfig.VERSION_NAME;
            } else {
                if (!(tVar instanceof zu.s)) {
                    throw new NoWhenBranchMatchedException();
                }
                strValueOf = String.valueOf(((zu.s) tVar).f59552d);
            }
            String str = strValueOf;
            boolean zA = kotlin.jvm.internal.m.a(y0Var, zu.s0.f59553a);
            c2 c2Var = c2.f35266a;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarA = c2Var.a(oVar, 1.0f);
            int i13 = i12 & 3670016;
            boolean z11 = i13 == 1048576;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new w0(cVar, 3);
                sVar.o0(objQ);
            }
            i(R.drawable.ep_me_achievements, strE0, str, zA, iu.k.q(0, 7, (fz.a) objQ, sVar, rVarA, false), sVar, 0);
            float f5 = 16;
            k7.n(j0.c.C(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, 1), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 6, 6);
            String strE1 = ub.a.e0(sVar, R.string.mastery);
            String strValueOf2 = String.valueOf(k2Var.f59472g);
            boolean zA2 = kotlin.jvm.internal.m.a(y0Var, zu.x0.f59575a);
            z1.r rVarA2 = c2Var.a(oVar, 1.0f);
            boolean z12 = i13 == 1048576;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new w0(cVar, 4);
                sVar.o0(objQ2);
            }
            i(R.drawable.ep_me_word_sent, strE1, strValueOf2, zA2, iu.k.q(0, 7, (fz.a) objQ2, sVar, rVarA2, false), sVar, 0);
            k7.n(j0.c.C(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, 1), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 6, 6);
            String strE2 = ub.a.e0(sVar, R.string.ranking);
            Object objValueOf = "-";
            if (leaderBoardUiState instanceof LeaderBoardUiState.Success) {
                LeaderBoardClass leaderBoardClass = ((LeaderBoardUiState.Success) leaderBoardUiState).getLeaderBoardClass();
                objValueOf = String.valueOf(leaderBoardClass != null ? Integer.valueOf(leaderBoardClass.getRank()) : "-");
            }
            String str2 = objValueOf;
            boolean zA3 = kotlin.jvm.internal.m.a(y0Var, zu.v0.f59568a);
            z1.r rVarA3 = c2Var.a(oVar, 1.0f);
            boolean z13 = i13 == 1048576;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new w0(cVar, 5);
                sVar.o0(objQ3);
            }
            i(R.drawable.ep_me_leaderboard, strE2, str2, zA3, iu.k.q(0, 7, (fz.a) objQ3, sVar, rVarA3, false), sVar, 0);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new mt.e(eVar, tVar, leaderBoardUiState, y0Var, k2Var, rVar, cVar, i11, 4);
        }
    }

    public static final void h(r0.e eVar, int i11, k2 k2Var, DayStreakUiState dayStreakUiState, zu.y0 y0Var, z1.r rVar, fz.c cVar, l1.n nVar, int i12) {
        int i13;
        String strValueOf;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1989807878);
        if ((i12 & 6) == 0) {
            i13 = (sVar.f(eVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.d(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar.f(k2Var) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.h(dayStreakUiState) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= (32768 & i12) == 0 ? sVar.f(y0Var) : sVar.h(y0Var) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i12) == 0) {
            i13 |= sVar.f(rVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i12) == 0) {
            i13 |= sVar.h(cVar) ? 1048576 : 524288;
        }
        if (sVar.T(i13 & 1, (599187 & i13) != 599186)) {
            z1.r rVarB = d2.h.b(d0.n.h(e2.g(rVar, 62), ((h1.s1) sVar.j(h1.v1.f31180a)).F, eVar), eVar);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
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
            String strE0 = ub.a.e0(sVar, R.string.f22253xp);
            String strValueOf2 = String.valueOf(k2Var.f59469d);
            boolean zA = kotlin.jvm.internal.m.a(y0Var, zu.w0.f59570a);
            c2 c2Var = c2.f35266a;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarA = c2Var.a(oVar, 1.0f);
            int i14 = i13 & 3670016;
            boolean z11 = i14 == 1048576;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new w0(cVar, 6);
                sVar.o0(objQ);
            }
            i(R.drawable.ep_me_xp, strE0, strValueOf2, zA, iu.k.q(0, 7, (fz.a) objQ, sVar, rVarA, false), sVar, 0);
            float f5 = 16;
            k7.n(j0.c.C(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, 1), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 6, 6);
            String strE1 = ub.a.e0(sVar, R.string.day_streak);
            if (kotlin.jvm.internal.m.a(dayStreakUiState, DayStreakUiState.Loading.INSTANCE)) {
                strValueOf = BuildConfig.VERSION_NAME;
            } else {
                if (!(dayStreakUiState instanceof DayStreakUiState.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                strValueOf = String.valueOf(((DayStreakUiState.Success) dayStreakUiState).getTodayStreakStatus().getDayStreak());
            }
            String str = strValueOf;
            boolean zA2 = kotlin.jvm.internal.m.a(y0Var, zu.u0.f59565a);
            z1.r rVarA2 = c2Var.a(oVar, 1.0f);
            boolean z12 = i14 == 1048576;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new w0(cVar, 7);
                sVar.o0(objQ2);
            }
            i(R.drawable.ep_me_daystreak, strE1, str, zA2, iu.k.q(0, 7, (fz.a) objQ2, sVar, rVarA2, false), sVar, 0);
            k7.n(j0.c.C(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, 1), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 6, 6);
            String strE2 = ub.a.e0(sVar, R.string.gem);
            String strValueOf3 = String.valueOf(i11);
            boolean zA3 = kotlin.jvm.internal.m.a(y0Var, zu.r0.f59544a);
            z1.r rVarA3 = c2Var.a(oVar, 1.0f);
            boolean z13 = i14 == 1048576;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new w0(cVar, 8);
                sVar.o0(objQ3);
            }
            i(R.drawable.ep_me_gem, strE2, strValueOf3, zA3, iu.k.q(0, 7, (fz.a) objQ3, sVar, rVarA3, false), sVar, 0);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new pr.b0(eVar, i11, k2Var, dayStreakUiState, y0Var, rVar, cVar, i12);
        }
    }

    public static final void i(int i11, String title, String value, boolean z11, z1.r rVar, l1.n nVar, int i12) {
        long j11;
        z1.o oVar;
        boolean z12;
        boolean z13;
        boolean z14;
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(value, "value");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(209667476);
        int i13 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.f(title) ? 32 : 16) | (sVar.f(value) ? 256 : 128) | (sVar.g(z11) ? 2048 : 1024) | (sVar.f(rVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            z1.r rVarG = e2.g(rVar, 70);
            if (z11) {
                sVar.d0(-373008348);
                j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31021c;
                sVar.p(false);
            } else {
                sVar.d0(-373007457);
                sVar.p(false);
                j11 = g2.x.f28621h;
            }
            z1.r rVarH = d0.n.h(rVarG, j11, g2.f0.f28556b);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
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
            z1.o oVar2 = z1.o.f58481a;
            z1.r rVarD = e2.d(oVar2, 1.0f);
            j0.u uVarA = j0.t.a(j0.i.f35307e, z1.c.P, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarD);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, oVar2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, a2VarA, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            if (i11 != 0) {
                sVar.d0(-1016914797);
                oVar = oVar2;
                z12 = true;
                z13 = false;
                d0.n.c(se.k.y(i11, sVar, i13 & 14), null, e2.n(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 2, CropImageView.DEFAULT_ASPECT_RATIO, 11), 28), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
            } else {
                oVar = oVar2;
                z12 = true;
                z13 = false;
                sVar.d0(-1047943410);
            }
            sVar.p(z13);
            l1.d0 d0Var = ua.f31167a;
            ua.b(value, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(d0Var), 0L, j3.A(16), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, (i13 >> 6) & 14, 0, 65534);
            sVar.p(z12);
            z1.o oVar3 = oVar;
            ua.b(title, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(d0Var), 0L, j3.A(12), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar, ((i13 >> 3) & 14) | 48, 0, 65532);
            sVar = sVar;
            sVar.p(z12);
            if (z11) {
                sVar.d0(-601156603);
                j0.c.g(sVar, j0.r.f35391a.a(d0.n.h(e2.g(e2.e(oVar3, 1.0f), 3), ((h1.s1) sVar.j(h1.v1.f31180a)).f31017a, r0.f.a()), z1.c.H));
                z14 = false;
            } else {
                z14 = false;
                sVar.d0(-633093144);
            }
            sVar.p(z14);
            sVar.p(z12);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.o(i11, title, value, z11, rVar, i12);
        }
    }
}
