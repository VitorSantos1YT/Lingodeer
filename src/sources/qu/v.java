package qu;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import b0.e2;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.data.model.uistate.LeaderBoardClass;
import com.lingodeer.data.model.uistate.LeaderBoardRankState;
import com.lingodeer.data.model.uistate.LeaderBoardUiState;
import com.yalantis.ucrop.view.CropImageView;
import g2.f0;
import h1.s1;
import h1.v1;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.q1;
import l1.x1;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v {
    public static final void a(LeaderBoardUiState leaderBoardUiState, tu.t tVar, fz.a pullToRefresh, fz.a onClickLogin, fz.e eVar, l1.n nVar, int i11) {
        tu.t tVar2;
        fz.e eVar2;
        int i12;
        tu.t tVar3;
        fz.e eVar3;
        kotlin.jvm.internal.m.f(leaderBoardUiState, "leaderBoardUiState");
        kotlin.jvm.internal.m.f(pullToRefresh, "pullToRefresh");
        kotlin.jvm.internal.m.f(onClickLogin, "onClickLogin");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(185393255);
        int i13 = (sVar.h(leaderBoardUiState) ? 4 : 2) | i11 | 16;
        if ((i11 & 384) == 0) {
            i13 |= sVar.h(pullToRefresh) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar.h(onClickLogin) ? 2048 : 1024;
        }
        int i14 = i13 | 24576;
        if (sVar.T(i14 & 1, (i14 & 9363) != 9362)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                i12 = i14 & (-113);
                tVar3 = (tu.t) ViewModelKt.viewModel(z.a(tu.t.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, sVar, 0, 0);
                eVar3 = b.f48348h;
            } else {
                sVar.W();
                i12 = i14 & (-113);
                tVar3 = tVar;
                eVar3 = eVar;
            }
            sVar.q();
            b(leaderBoardUiState, (qy.l) l1.t.o(tVar3.f52626c, sVar).getValue(), pullToRefresh, onClickLogin, eVar3, sVar, 65422 & i12);
            eVar2 = eVar3;
            tVar2 = tVar3;
        } else {
            sVar.W();
            tVar2 = tVar;
            eVar2 = eVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e2(leaderBoardUiState, tVar2, pullToRefresh, onClickLogin, eVar2, i11, 9);
        }
    }

    public static final void b(LeaderBoardUiState leaderBoardUiState, qy.l leaderBoardTime, fz.a pullToRefresh, fz.a onClickLogin, fz.e quickReviewEntrance, l1.n nVar, int i11) {
        int i12;
        boolean z11;
        kotlin.jvm.internal.m.f(leaderBoardUiState, "leaderBoardUiState");
        kotlin.jvm.internal.m.f(leaderBoardTime, "leaderBoardTime");
        kotlin.jvm.internal.m.f(pullToRefresh, "pullToRefresh");
        kotlin.jvm.internal.m.f(onClickLogin, "onClickLogin");
        kotlin.jvm.internal.m.f(quickReviewEntrance, "quickReviewEntrance");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(132234086);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(leaderBoardUiState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(leaderBoardTime) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(pullToRefresh) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(onClickLogin) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(quickReviewEntrance) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar.T(i12 & 1, (i12 & 9363) != 9362)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarD = j0.e2.d(oVar, 1.0f);
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarD);
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
            if (leaderBoardUiState.equals(LeaderBoardUiState.Hide.INSTANCE)) {
                sVar.d0(799452032);
                b.c(j0.e2.c(j0.e2.e(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, 7), 1.0f), 1.0f), sVar, 6);
                sVar.p(false);
            } else {
                boolean zEquals = leaderBoardUiState.equals(LeaderBoardUiState.NeedLogin.INSTANCE);
                l1.g gVar = l1.m.f39353a;
                if (zEquals) {
                    sVar.d0(-986552640);
                    z1.r rVarD2 = j0.e2.d(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), 1.0f);
                    boolean z12 = (i12 & 7168) == 2048;
                    Object objQ = sVar.Q();
                    if (z12 || objQ == gVar) {
                        objQ = new okhttp3.b(9, onClickLogin);
                        sVar.o0(objQ);
                    }
                    b.e(rVarD2, (fz.a) objQ, sVar, 0, 0);
                    sVar.p(false);
                } else if (leaderBoardUiState.equals(LeaderBoardUiState.Loading.INSTANCE)) {
                    sVar.d0(799470127);
                    tv.a.d(0, 1, sVar, null);
                    sVar.p(false);
                } else if (leaderBoardUiState.equals(LeaderBoardUiState.Locked.INSTANCE)) {
                    sVar.d0(799472128);
                    b.d(6, 0, sVar, j0.e2.c(j0.e2.e(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, 7), 1.0f), 1.0f));
                    sVar.p(false);
                } else {
                    if (!(leaderBoardUiState instanceof LeaderBoardUiState.Success)) {
                        throw nv.p.x(sVar, 799452097, false);
                    }
                    sVar.d0(-985891503);
                    LeaderBoardUiState.Success success = (LeaderBoardUiState.Success) leaderBoardUiState;
                    boolean zF = sVar.f(success.getLeaderBoardRankState());
                    Object objQ2 = sVar.Q();
                    if (zF || objQ2 == gVar) {
                        LeaderBoardRankState leaderBoardRankState = success.getLeaderBoardRankState();
                        objQ2 = ep.a.s(kotlin.jvm.internal.m.a(leaderBoardRankState, LeaderBoardRankState.UpgradeStatus.INSTANCE) || kotlin.jvm.internal.m.a(leaderBoardRankState, LeaderBoardRankState.DowngradeStatus.INSTANCE) || kotlin.jvm.internal.m.a(leaderBoardRankState, LeaderBoardRankState.KeepStatus.INSTANCE) || (leaderBoardRankState instanceof LeaderBoardRankState.Top3UpgradeStatus), sVar);
                    }
                    b1 b1Var = (b1) objQ2;
                    if (((Boolean) b1Var.getValue()).booleanValue()) {
                        sVar.d0(-985263381);
                        LeaderBoardClass leaderBoardClass = success.getLeaderBoardClass();
                        kotlin.jvm.internal.m.c(leaderBoardClass);
                        LeaderBoardRankState leaderBoardRankState2 = success.getLeaderBoardRankState();
                        boolean zF2 = sVar.f(b1Var);
                        Object objQ3 = sVar.Q();
                        if (zF2 || objQ3 == gVar) {
                            objQ3 = new pr.z(4, b1Var);
                            sVar.o0(objQ3);
                        }
                        z11 = false;
                        r.a(leaderBoardClass, leaderBoardRankState2, (fz.a) objQ3, sVar, 0);
                        sVar.p(false);
                    } else {
                        sVar.d0(-984914600);
                        Object objQ4 = sVar.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new ju.d(25);
                            sVar.o0(objQ4);
                        }
                        int i13 = i12 << 3;
                        o.c(success, leaderBoardTime, pullToRefresh, (fz.a) objQ4, quickReviewEntrance, sVar, (i13 & 896) | 24582 | (i13 & 7168) | (i13 & 458752));
                        z11 = false;
                        sVar.p(false);
                    }
                    sVar.p(z11);
                }
            }
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e2(leaderBoardUiState, leaderBoardTime, pullToRefresh, onClickLogin, quickReviewEntrance, i11, 10);
        }
    }
}
