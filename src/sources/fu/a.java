package fu;

import a0.f1;
import a0.l1;
import a0.m1;
import a0.t1;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.a1;
import bt.j5;
import bt.n5;
import bt.v1;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.DayStreakFinishedStatus;
import com.lingodeer.data.model.DayStreakWeeklyItem;
import com.lingodeer.data.model.DayStreakWeeklyItemStatus;
import com.lingodeer.data.model.ShareStreakType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import dt.d2;
import dt.e1;
import dt.h2;
import dt.n0;
import fr.j3;
import fr.n2;
import fr.p3;
import g2.r0;
import h1.k7;
import h1.r4;
import h1.s1;
import h1.ua;
import hh.p0;
import j0.a2;
import j0.c2;
import j0.e2;
import j0.z1;
import j3.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l1.b1;
import l1.b3;
import l1.c3;
import l1.g1;
import l1.h1;
import l1.q1;
import l1.x1;
import w2.q0;
import w2.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f28044a = new t1.d(new dt.f(14), false, -491621069);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f28045b = new t1.d(new dt.f(15), false, 589665777);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.d f28046c = new t1.d(new dt.g(10), false, -2100555064);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.d f28047d = new t1.d(new dt.g(11), false, -604827265);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t1.d f28048e = new t1.d(new dt.f(16), false, -202372207);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t1.d f28049f = new t1.d(new dt.g(12), false, 1799823870);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t1.d f28050g = new t1.d(new dt.g(13), false, -1406725068);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t1.d f28051h = new t1.d(new dt.f(17), false, -2122102920);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t1.d f28052i = new t1.d(new dt.f(18), false, 808077515);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t1.d f28053j = new t1.d(new dt.f(19), false, 1445009444);

    public static final void a(hu.i uiState, b1 showMilestonePopup, b1 milestonePopupPosition, fz.a onClickPreMonth, fz.a onClickNextMonth, l1.n nVar, int i11) {
        boolean z11;
        b1 b1Var;
        b1 b1Var2;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        kotlin.jvm.internal.m.f(showMilestonePopup, "showMilestonePopup");
        kotlin.jvm.internal.m.f(milestonePopupPosition, "milestonePopupPosition");
        kotlin.jvm.internal.m.f(onClickPreMonth, "onClickPreMonth");
        kotlin.jvm.internal.m.f(onClickNextMonth, "onClickNextMonth");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1692531594);
        int i12 = i11 | (sVar.h(uiState) ? 4 : 2) | (sVar.h(onClickPreMonth) ? 2048 : 1024) | (sVar.h(onClickNextMonth) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i12 & 1, (i12 & 9347) != 9346)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            b1 b1Var3 = (b1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            b1 b1Var4 = (b1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(Boolean.TRUE);
                sVar.o0(objQ3);
            }
            b1 b1Var5 = (b1) objQ3;
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = l1.t.q(sVar);
                sVar.o0(objQ4);
            }
            rz.b0 b0Var = (rz.b0) objQ4;
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            if (((Boolean) b1Var3.getValue()).booleanValue()) {
                sVar.d0(707992505);
                int dayStreak = uiState.f33787a.getDayStreak();
                ShareStreakType shareStreakType = ShareStreakType.STREAK;
                boolean zH = sVar.h(context);
                Object objQ5 = sVar.Q();
                if (zH || objQ5 == gVar) {
                    objQ5 = new f(context, 0);
                    sVar.o0(objQ5);
                }
                fz.f fVar = (fz.f) objQ5;
                boolean zH2 = sVar.h(b0Var) | sVar.h(context);
                Object objQ6 = sVar.Q();
                if (zH2 || objQ6 == gVar) {
                    objQ6 = new g(b0Var, context, 0);
                    sVar.o0(objQ6);
                }
                fz.e eVar = (fz.e) objQ6;
                boolean zH3 = sVar.h(context);
                Object objQ7 = sVar.Q();
                if (zH3 || objQ7 == gVar) {
                    objQ7 = new h(context, 0);
                    sVar.o0(objQ7);
                }
                b1Var = b1Var3;
                b1Var2 = b1Var4;
                z11 = false;
                t(b1Var, dayStreak, shareStreakType, fVar, eVar, (fz.c) objQ7, sVar, 390);
            } else {
                z11 = false;
                b1Var = b1Var3;
                b1Var2 = b1Var4;
                sVar.d0(694341004);
            }
            sVar.p(z11);
            r0.e eVarD = r0.f.d(17);
            boolean z12 = ((i12 & 7168) == 2048 ? true : z11) | ((i12 & 57344) != 16384 ? z11 : true);
            Object objQ8 = sVar.Q();
            if (z12 || objQ8 == gVar) {
                objQ8 = new j(b1Var2, onClickPreMonth, onClickNextMonth, b1Var5);
                sVar.o0(objQ8);
            }
            k7.d(e2.e(s2.g0.a(z1.o.f58481a, qy.b0.f48488a, (PointerInputEventHandler) objQ8), 1.0f), eVarD, null, null, null, t1.e.d(-1855339160, new es.h(uiState, b1Var5, onClickPreMonth, onClickNextMonth, b1Var, milestonePopupPosition, 1), sVar), sVar, 196608, 28);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v1(uiState, showMilestonePopup, milestonePopupPosition, onClickPreMonth, onClickNextMonth, i11, 6);
        }
    }

    public static final void b(String str, z1.r rVar, fz.a aVar, fz.a aVar2, l1.n nVar, int i11) {
        z1.r rVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-689317561);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | 48 | (sVar.h(aVar) ? 256 : 128) | (sVar.h(aVar2) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            z1.i iVar = z1.c.M;
            j0.e eVar = j0.i.f35307e;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarB = j0.c.B(e2.e(oVar, 1.0f), 32, 16);
            a2 a2VarA = z1.a(eVar, iVar, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarB);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
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
            k7.h(aVar, null, false, null, f28046c, sVar, ((i12 >> 6) & 14) | 196608, 30);
            ua.b(str, j0.c.C(oVar, 24, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), 0L, j3.A(18), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, (i12 & 14) | 48, 0, 65532);
            sVar = sVar;
            k7.h(aVar2, null, false, null, f28047d, sVar, ((i12 >> 9) & 14) | 196608, 30);
            sVar.p(true);
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.t(str, rVar2, aVar, aVar2, i11, 7);
        }
    }

    public static final void c(z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1216529548);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            z1.r rVarS = e2.s(rVar, 100);
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new n2(5);
                sVar.o0(objQ);
            }
            float f5 = 4;
            z1.r rVarB = j0.c.B(j0.c.E(d2.h.e(rVarS, (fz.c) objQ), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, 7), 6, f5);
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarB);
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
            ua.b(ub.a.e0(sVar, R.string.next_milestone), j0.r.f35391a.a(e2.e(z1.o.f58481a, 1.0f), z1.c.f58467e), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), g2.f0.e(4294921241L), j3.A(11), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar, 0, 0, 65532);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.g(rVar, i11, 9);
        }
    }

    public static final void d(hu.b bVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(179596055);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(bVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            long jC = bVar.f33778g ? g2.x.c(g2.f0.e(4294955845L), 0.15f) : g2.x.c(g2.f0.e(4294932831L), 0.2f);
            int i13 = k.f28126b[bVar.f33782k.ordinal()];
            z1.o oVar = z1.o.f58481a;
            if (i13 == 1) {
                sVar.d0(-1182797706);
                j0.o.a(d0.n.h(e2.n(oVar, 32), jC, r0.f.f48733a), sVar, 0);
                sVar.p(false);
            } else if (i13 == 2) {
                sVar.d0(793136784);
                j0.o.a(d0.n.h(e2.e(e2.g(oVar, 32), 1.0f), jC, r0.f.c(0, 6)), sVar, 0);
                sVar.p(false);
            } else if (i13 == 3) {
                sVar.d0(793148359);
                j0.o.a(d0.n.h(e2.e(e2.g(oVar, 32), 1.0f), jC, r0.f.d(0)), sVar, 0);
                sVar.p(false);
            } else if (i13 == 4) {
                sVar.d0(793158668);
                j0.o.a(d0.n.h(e2.e(e2.g(oVar, 32), 1.0f), jC, r0.f.c(50, 9)), sVar, 0);
                sVar.p(false);
            } else {
                if (i13 != 5) {
                    throw nv.p.x(sVar, 793127820, false);
                }
                sVar.d0(-1181537463);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j5(bVar, i11, 1);
        }
    }

    public static final void e(hu.b bVar, z1.r rVar, l1.n nVar, int i11) {
        int i12;
        boolean z11;
        long j11;
        k2.b bVarY;
        boolean z12;
        k2.b bVarY2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(265709902);
        int i13 = (sVar.f(bVar) ? 4 : 2) | i11 | (sVar.f(rVar) ? 32 : 16);
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            boolean z13 = bVar.f33780i;
            boolean z14 = bVar.f33779h;
            boolean z15 = bVar.f33778g;
            boolean z16 = (z13 || bVar.f33781j) ? false : true;
            q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
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
            long jE = g2.f0.e(4288322202L);
            d(bVar, sVar, i13 & 14);
            if (z16) {
                sVar.d0(1472727856);
                int i14 = k.f28125a[bVar.f33776e.ordinal()];
                z1.o oVar = z1.o.f58481a;
                w0 w0Var = w2.i.f54517d;
                i12 = 14;
                if (i14 != 1) {
                    if (i14 == 2) {
                        sVar.d0(1474747103);
                        if (z15) {
                            sVar.d0(1474822371);
                            bVarY = se.k.y(R.drawable.day_streak_calendar_day_freeze, sVar, 0);
                            sVar.p(false);
                        } else {
                            sVar.d0(1474946619);
                            bVarY = se.k.y(R.drawable.day_streak_calendar_day_freeze_current, sVar, 0);
                            sVar.p(false);
                        }
                        d0.n.c(bVarY, null, e2.s(oVar, 24), null, w0Var, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 25008, 104);
                        jE = g2.x.f28621h;
                        z12 = false;
                        sVar.p(false);
                    } else if (i14 == 3) {
                        sVar.d0(1475435551);
                        if (z15) {
                            sVar.d0(1475510819);
                            bVarY2 = se.k.y(R.drawable.day_streak_calendar_day_shield, sVar, 0);
                            sVar.p(false);
                        } else {
                            sVar.d0(1475635067);
                            bVarY2 = se.k.y(R.drawable.day_streak_calendar_day_shield_current, sVar, 0);
                            sVar.p(false);
                        }
                        d0.n.c(bVarY2, null, e2.s(oVar, 24), null, w0Var, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 25008, 104);
                        jE = g2.x.f28621h;
                        z12 = false;
                        sVar.p(false);
                    } else if (i14 == 4) {
                        sVar.d0(1476161509);
                        if (z14) {
                            sVar.d0(1477027525);
                            z1.r rVarN = e2.n(oVar, 30);
                            long jE2 = g2.f0.e(4292532954L);
                            r0.e eVar = r0.f.f48733a;
                            j0.o.a(d0.n.h(rVarN, jE2, eVar), sVar, 0);
                            j0.c.g(sVar, e2.n(d0.n.h(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 42, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), g2.f0.e(4291414473L), eVar), 6));
                            z12 = false;
                            sVar.p(false);
                        } else {
                            z12 = false;
                            sVar.d0(1477649540);
                            sVar.p(false);
                        }
                        sVar.p(z12);
                    } else {
                        if (i14 != 5) {
                            throw nv.p.x(sVar, -91039558, false);
                        }
                        sVar.d0(1478093336);
                        z12 = false;
                        sVar.p(false);
                    }
                    z11 = z12;
                } else {
                    sVar.d0(1472694996);
                    if (z15) {
                        sVar.d0(1472701134);
                        d0.n.c(se.k.y(R.drawable.day_streak_calendar_day_streak, sVar, 0), null, e2.s(oVar, 28), null, w0Var, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(g2.f0.e(4294947328L), 5), sVar, 1597872, 40);
                        j11 = ((s1) sVar.j(h1.v1.f31180a)).f31019b;
                        z11 = false;
                        sVar.p(false);
                    } else if (z14) {
                        sVar.d0(1473356195);
                        d0.n.c(se.k.y(R.drawable.day_streak_calendar_day_streak, sVar, 0), null, e2.s(oVar, 28), null, w0Var, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 25008, 104);
                        z1.r rVarE = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 42, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                        c3 c3Var = h1.v1.f31180a;
                        j0.c.g(sVar, e2.n(d0.n.h(rVarE, ((s1) sVar.j(c3Var)).f31024f, r0.f.f48733a), 6));
                        j11 = ((s1) sVar.j(c3Var)).f31019b;
                        z11 = false;
                        sVar.p(false);
                    } else {
                        sVar.d0(1474198403);
                        d0.n.c(se.k.y(R.drawable.day_streak_calendar_day_streak, sVar, 0), null, e2.s(oVar, 28), null, w0Var, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 25008, 104);
                        j11 = ((s1) sVar.j(h1.v1.f31180a)).f31019b;
                        z11 = false;
                        sVar.p(false);
                    }
                    jE = j11;
                    sVar.p(z11);
                }
            } else {
                i12 = 14;
                z11 = false;
                sVar.d0(1447866042);
            }
            sVar.p(z11);
            ua.b(z16 ? String.valueOf(bVar.f33772a) : BuildConfig.VERSION_NAME, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), jE, j3.A(i12), n3.s.N, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar, 0, 0, 65534);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.z(bVar, i11, 29, rVar);
        }
    }

    public static final void f(z1.r rVar, final int i11, final int i12, final int i13, boolean z11, final fz.a onClickGetMore, final fz.a onClickUserStreakFreeze, l1.n nVar, int i14) {
        kotlin.jvm.internal.m.f(onClickGetMore, "onClickGetMore");
        kotlin.jvm.internal.m.f(onClickUserStreakFreeze, "onClickUserStreakFreeze");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1535491678);
        int i15 = i14 | (sVar.d(i11) ? 32 : 16) | (sVar.d(i12) ? 256 : 128) | (sVar.d(i13) ? 2048 : 1024) | (sVar.g(z11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(onClickGetMore) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.h(onClickUserStreakFreeze) ? 1048576 : 524288);
        if (sVar.T(i15 & 1, (599187 & i15) != 599186)) {
            final boolean z12 = i13 > 0 && z11;
            k7.d(rVar, r0.f.d(19), null, null, null, t1.e.d(2007408368, new fz.f() { // from class: fu.b
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    y2.h hVar;
                    y2.h hVar2;
                    j0.v Card = (j0.v) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(Card, "$this$Card");
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        float f5 = 22;
                        z1.o oVar = z1.o.f58481a;
                        k7.g(j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar2, 6, 6);
                        float f11 = 20;
                        float f12 = 25;
                        z1.r rVarD = j0.c.D(e2.d(oVar, 1.0f), f12, f11, f12, f11);
                        j0.b bVar = j0.i.f35303a;
                        z1.i iVar = z1.c.L;
                        a2 a2VarA = z1.a(bVar, iVar, sVar2, 0);
                        int iHashCode = Long.hashCode(sVar2.T);
                        q1 q1VarL = sVar2.l();
                        z1.r rVarC = z1.a.c(sVar2, rVarD);
                        y2.k.J.getClass();
                        y2.i iVar2 = y2.j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar2);
                        } else {
                            sVar2.r0();
                        }
                        y2.h hVar3 = y2.j.f56917f;
                        l1.t.J(hVar3, a2VarA, sVar2);
                        y2.h hVar4 = y2.j.f56916e;
                        l1.t.J(hVar4, q1VarL, sVar2);
                        y2.h hVar5 = y2.j.f56918g;
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar5);
                        }
                        y2.h hVar6 = y2.j.f56915d;
                        l1.t.J(hVar6, rVarC, sVar2);
                        k2.b bVarY = se.k.y(R.drawable.day_streak_icon_large, sVar2, 0);
                        float f13 = 36;
                        z1.r rVarS = e2.s(oVar, f13);
                        w0 w0Var = w2.i.f54517d;
                        d0.n.c(bVarY, null, rVarS, null, w0Var, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 25008, 104);
                        z1.r rVarE = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                        j0.d dVar = j0.i.f35305c;
                        z1.h hVar7 = z1.c.O;
                        j0.u uVarA = j0.t.a(dVar, hVar7, sVar2, 0);
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        q1 q1VarL2 = sVar2.l();
                        z1.r rVarC2 = z1.a.c(sVar2, rVarE);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar2);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(hVar3, uVarA, sVar2);
                        l1.t.J(hVar4, q1VarL2, sVar2);
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar5);
                        }
                        l1.t.J(hVar6, rVarC2, sVar2);
                        z1.i iVar3 = z1.c.M;
                        a2 a2VarA2 = z1.a(bVar, iVar3, sVar2, 48);
                        int iHashCode3 = Long.hashCode(sVar2.T);
                        q1 q1VarL3 = sVar2.l();
                        z1.r rVarC3 = z1.a.c(sVar2, oVar);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar2);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(hVar3, a2VarA2, sVar2);
                        l1.t.J(hVar4, q1VarL3, sVar2);
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                            defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar5);
                        }
                        l1.t.J(hVar6, rVarC3, sVar2);
                        String strE0 = ub.a.e0(sVar2, R.string.learning_streak);
                        l1.d0 d0Var = ua.f31167a;
                        y0 y0Var = (y0) sVar2.j(d0Var);
                        long jA = j3.A(16);
                        n3.s sVar3 = n3.s.H;
                        ua.b(strE0, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, 0L, jA, sVar3, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar2, 0, 0, 65534);
                        sVar2.p(true);
                        String strE1 = ub.a.e0(sVar2, R.string.learning_streak_desc);
                        y0 y0Var2 = (y0) sVar2.j(d0Var);
                        long jA2 = j3.A(14);
                        n3.s sVar4 = n3.s.f43178t;
                        float f14 = 6;
                        ua.b(strE1, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var2, 0L, jA2, sVar4, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar2, 48, 0, 65532);
                        sVar2.p(true);
                        sVar2.p(true);
                        k7.g(j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar2, 6, 6);
                        z1.r rVarD2 = j0.c.D(e2.d(oVar, 1.0f), f12, f11, f12, f11);
                        a2 a2VarA3 = z1.a(bVar, iVar, sVar2, 0);
                        int iHashCode4 = Long.hashCode(sVar2.T);
                        q1 q1VarL4 = sVar2.l();
                        z1.r rVarC4 = z1.a.c(sVar2, rVarD2);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar2);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(hVar3, a2VarA3, sVar2);
                        l1.t.J(hVar4, q1VarL4, sVar2);
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode4))) {
                            hVar = hVar5;
                            defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar);
                        } else {
                            hVar = hVar5;
                        }
                        l1.t.J(hVar6, rVarC4, sVar2);
                        y2.h hVar8 = hVar;
                        d0.n.c(se.k.y(R.drawable.day_streak_shield, sVar2, 0), null, e2.s(oVar, f13), null, w0Var, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 25008, 104);
                        z1.r rVarE2 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                        j0.u uVarA2 = j0.t.a(dVar, hVar7, sVar2, 0);
                        int iHashCode5 = Long.hashCode(sVar2.T);
                        q1 q1VarL5 = sVar2.l();
                        z1.r rVarC5 = z1.a.c(sVar2, rVarE2);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar2);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(hVar3, uVarA2, sVar2);
                        l1.t.J(hVar4, q1VarL5, sVar2);
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode5))) {
                            defpackage.e.A(iHashCode5, sVar2, iHashCode5, hVar8);
                        }
                        l1.t.J(hVar6, rVarC5, sVar2);
                        a2 a2VarA4 = z1.a(bVar, iVar3, sVar2, 48);
                        int iHashCode6 = Long.hashCode(sVar2.T);
                        q1 q1VarL6 = sVar2.l();
                        z1.r rVarC6 = z1.a.c(sVar2, oVar);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar2);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(hVar3, a2VarA4, sVar2);
                        l1.t.J(hVar4, q1VarL6, sVar2);
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode6))) {
                            defpackage.e.A(iHashCode6, sVar2, iHashCode6, hVar8);
                        }
                        l1.t.J(hVar6, rVarC6, sVar2);
                        ua.b(ub.a.e0(sVar2, R.string.streak_shields), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(d0Var), 0L, j3.A(16), sVar3, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar2, 0, 0, 65534);
                        c2 c2Var = c2.f35266a;
                        j0.c.g(sVar2, c2Var.a(oVar, 1.0f));
                        float f15 = 4;
                        float f16 = 11;
                        r4.b(se.k.y(R.drawable.day_streak_shield_count, sVar2, 0), null, e2.n(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f15, CropImageView.DEFAULT_ASPECT_RATIO, 11), f16), g2.f0.e(4294947072L), sVar2, 3504, 0);
                        ua.b(String.valueOf(i12 - i11), null, g2.f0.e(4294947072L), j3.A(14), null, sVar3, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 200064, 0, 131026);
                        sVar2.p(true);
                        ua.b(ub.a.e0(sVar2, R.string.need_a_break_protect_your_streak_with_streak_shields_you_can_use_up_to_two_streak_shields_at_a_time), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(d0Var), 0L, j3.A(14), sVar4, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar2, 48, 0, 65532);
                        sVar2.p(true);
                        sVar2.p(true);
                        k7.g(j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar2, 6, 6);
                        z1.r rVarD3 = j0.c.D(e2.d(oVar, 1.0f), f12, f11, f12, f11);
                        a2 a2VarA5 = z1.a(bVar, iVar, sVar2, 0);
                        int iHashCode7 = Long.hashCode(sVar2.T);
                        q1 q1VarL7 = sVar2.l();
                        z1.r rVarC7 = z1.a.c(sVar2, rVarD3);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar2);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(hVar3, a2VarA5, sVar2);
                        l1.t.J(hVar4, q1VarL7, sVar2);
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode7))) {
                            hVar2 = hVar8;
                            defpackage.e.A(iHashCode7, sVar2, iHashCode7, hVar2);
                        } else {
                            hVar2 = hVar8;
                        }
                        l1.t.J(hVar6, rVarC7, sVar2);
                        y2.h hVar9 = hVar2;
                        d0.n.c(se.k.y(R.drawable.day_streak_freeze, sVar2, 0), null, e2.s(oVar, f13), null, w0Var, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 25008, 104);
                        z1.r rVarE3 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                        j0.u uVarA3 = j0.t.a(dVar, hVar7, sVar2, 0);
                        int iHashCode8 = Long.hashCode(sVar2.T);
                        q1 q1VarL8 = sVar2.l();
                        z1.r rVarC8 = z1.a.c(sVar2, rVarE3);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar2);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(hVar3, uVarA3, sVar2);
                        l1.t.J(hVar4, q1VarL8, sVar2);
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode8))) {
                            defpackage.e.A(iHashCode8, sVar2, iHashCode8, hVar9);
                        }
                        l1.t.J(hVar6, rVarC8, sVar2);
                        a2 a2VarA6 = z1.a(bVar, iVar3, sVar2, 48);
                        int iHashCode9 = Long.hashCode(sVar2.T);
                        q1 q1VarL9 = sVar2.l();
                        z1.r rVarC9 = z1.a.c(sVar2, oVar);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar2);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(hVar3, a2VarA6, sVar2);
                        l1.t.J(hVar4, q1VarL9, sVar2);
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode9))) {
                            defpackage.e.A(iHashCode9, sVar2, iHashCode9, hVar9);
                        }
                        l1.t.J(hVar6, rVarC9, sVar2);
                        ua.b(ub.a.e0(sVar2, R.string.streak_freeze), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(d0Var), 0L, j3.A(16), sVar3, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar2, 0, 0, 65534);
                        j0.c.g(sVar2, c2Var.a(oVar, 1.0f));
                        r4.b(se.k.y(R.drawable.day_streak_shield_count, sVar2, 0), null, e2.n(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f15, CropImageView.DEFAULT_ASPECT_RATIO, 11), f16), g2.f0.e(4284723967L), sVar2, 3504, 0);
                        ua.b(String.valueOf(i13), null, g2.f0.e(4284723967L), j3.A(14), null, sVar3, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 200064, 0, 131026);
                        sVar2.p(true);
                        ua.b(ub.a.e0(sVar2, R.string.streak_freeze_desc), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(d0Var), 0L, j3.A(14), sVar4, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar2, 48, 0, 65532);
                        float f17 = 16;
                        j0.g gVarG = j0.i.g(f17);
                        z1.r rVarE4 = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f17, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                        a2 a2VarA7 = z1.a(gVarG, iVar3, sVar2, 54);
                        int iHashCode10 = Long.hashCode(sVar2.T);
                        q1 q1VarL10 = sVar2.l();
                        z1.r rVarC10 = z1.a.c(sVar2, rVarE4);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar2);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(hVar3, a2VarA7, sVar2);
                        l1.t.J(hVar4, q1VarL10, sVar2);
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode10))) {
                            defpackage.e.A(iHashCode10, sVar2, iHashCode10, hVar9);
                        }
                        l1.t.J(hVar6, rVarC10, sVar2);
                        float f18 = 8;
                        j0.v1 v1VarD = j0.c.d(f18, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        float f19 = 28;
                        z1.r rVarI = e2.i(c2Var.a(oVar, 1.0f), f19, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        boolean z13 = z12;
                        boolean zG = sVar2.g(z13);
                        fz.a aVar = onClickUserStreakFreeze;
                        boolean zF = zG | sVar2.f(aVar);
                        Object objQ = sVar2.Q();
                        if (zF || objQ == l1.m.f39353a) {
                            objQ = new n5(z13, aVar, 3);
                            sVar2.o0(objQ);
                        }
                        k7.b((fz.a) objQ, rVarI, z13, null, null, null, null, v1VarD, a.f28044a, sVar2, 817889280, 376);
                        k7.i(onClickGetMore, e2.i(c2Var.a(oVar, 1.0f), f19, CropImageView.DEFAULT_ASPECT_RATIO, 2), false, null, null, d0.n.a(((s1) sVar2.j(h1.v1.f31180a)).f31017a, 1), j0.c.d(f18, CropImageView.DEFAULT_ASPECT_RATIO, 2), a.f28045b, sVar2, 817889280, 316);
                        com.google.android.material.datepicker.d.B(sVar2, true, true, true);
                    } else {
                        sVar2.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar), sVar, 196614, 28);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(rVar, i11, i12, i13, z11, onClickGetMore, onClickUserStreakFreeze, i14);
        }
    }

    public static final void g(int i11, String str, l1.n nVar, z1.r rVar) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(672369860);
        int i12 = (sVar2.f(str) ? 4 : 2) | i11 | (sVar2.f(rVar) ? 32 : 16);
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            sVar = sVar2;
            ua.b(str, rVar, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), g2.f0.e(4284308829L), j3.A(15), n3.s.K, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar, i12 & 126, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.a(str, rVar, i11, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:105:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:109:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:114:0x0316  */
    /* JADX WARN: Code duplicated, block: B:117:0x033b  */
    /* JADX WARN: Code duplicated, block: B:118:0x033f  */
    /* JADX WARN: Code duplicated, block: B:123:0x035a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0405  */
    /* JADX WARN: Code duplicated, block: B:127:0x0409  */
    /* JADX WARN: Code duplicated, block: B:132:0x0424  */
    /* JADX WARN: Code duplicated, block: B:135:0x0442  */
    /* JADX WARN: Code duplicated, block: B:138:0x0462  */
    /* JADX WARN: Code duplicated, block: B:141:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:142:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:147:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:150:0x053a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0568  */
    /* JADX WARN: Code duplicated, block: B:99:0x029d  */
    public static final void h(DayStreakFinishedStatus dayStreakStatus, List dayStreakWeeklyItems, fz.a onClickContinue, fz.f shareImage, fz.e savePic, fz.c shareMore, l1.n nVar, int i11) {
        l1.s sVar;
        Object fVar;
        b3 b3Var;
        int iHashCode;
        int i12;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        Object objQ;
        Object objQ2;
        int iHashCode5;
        l1.s sVar2;
        boolean z11;
        kotlin.jvm.internal.m.f(dayStreakStatus, "dayStreakStatus");
        kotlin.jvm.internal.m.f(dayStreakWeeklyItems, "dayStreakWeeklyItems");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(shareImage, "shareImage");
        kotlin.jvm.internal.m.f(savePic, "savePic");
        kotlin.jvm.internal.m.f(shareMore, "shareMore");
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(264282788);
        int i13 = (sVar3.h(dayStreakStatus) ? 4 : 2) | i11 | (sVar3.h(dayStreakWeeklyItems) ? 32 : 16);
        if ((i11 & 384) == 0) {
            i13 |= sVar3.h(onClickContinue) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar3.h(shareImage) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= sVar3.h(savePic) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i13 |= sVar3.h(shareMore) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if (sVar3.T(i13 & 1, (74899 & i13) != 74898)) {
            Object objQ3 = sVar3.Q();
            Object obj = l1.m.f39353a;
            if (objQ3 == obj) {
                objQ3 = l1.t.B(Boolean.FALSE);
                sVar3.o0(objQ3);
            }
            b1 b1Var = (b1) objQ3;
            Object objQ4 = sVar3.Q();
            if (objQ4 == obj) {
                objQ4 = l1.t.B(Boolean.FALSE);
                sVar3.o0(objQ4);
            }
            b1 b1Var2 = (b1) objQ4;
            Object objQ5 = sVar3.Q();
            if (objQ5 == obj) {
                objQ5 = l1.t.B(Boolean.FALSE);
                sVar3.o0(objQ5);
            }
            b1 b1Var3 = (b1) objQ5;
            Object objQ6 = sVar3.Q();
            if (objQ6 == obj) {
                objQ6 = l1.t.B(Boolean.FALSE);
                sVar3.o0(objQ6);
            }
            Object objQ7 = sVar3.Q();
            if (objQ7 == obj) {
                objQ7 = l1.t.B(Boolean.FALSE);
                sVar3.o0(objQ7);
            }
            b1 b1Var4 = (b1) objQ7;
            Object objQ8 = sVar3.Q();
            if (objQ8 == obj) {
                objQ8 = l1.t.B(Boolean.FALSE);
                sVar3.o0(objQ8);
            }
            Object objQ9 = sVar3.Q();
            if (objQ9 == obj) {
                objQ9 = b0.e.a(1.2f);
                sVar3.o0(objQ9);
            }
            b0.d dVar = (b0.d) objQ9;
            Object objQ10 = sVar3.Q();
            if (objQ10 == obj) {
                objQ10 = ns.o.L(Integer.valueOf(R.string.sun), Integer.valueOf(R.string.mon), Integer.valueOf(R.string.tue), Integer.valueOf(R.string.wed), Integer.valueOf(R.string.thu), Integer.valueOf(R.string.fri), Integer.valueOf(R.string.sat));
                sVar3.o0(objQ10);
            }
            List list = (List) objQ10;
            boolean zF = sVar3.f(dayStreakWeeklyItems);
            Object objQ11 = sVar3.Q();
            Object obj2 = objQ11;
            if (zF || objQ11 == obj) {
                x1.p pVar = new x1.p();
                ArrayList arrayList = new ArrayList(ry.n.W(dayStreakWeeklyItems, 10));
                Iterator it = dayStreakWeeklyItems.iterator();
                while (it.hasNext()) {
                    arrayList.add(DayStreakWeeklyItem.copy$default((DayStreakWeeklyItem) it.next(), null, 0, DayStreakWeeklyItemStatus.NOT_STREAK, 3, null));
                }
                pVar.addAll(arrayList);
                sVar3.o0(pVar);
                obj2 = pVar;
            }
            x1.p pVar2 = (x1.p) obj2;
            boolean zH = sVar3.h(dVar);
            Object objQ12 = sVar3.Q();
            if (zH || objQ12 == obj) {
                fVar = new b0.f(dVar, b1Var4, b1Var3, b1Var2, (vy.d) null);
                sVar3.o0(fVar);
            } else {
                fVar = objQ12;
            }
            l1.t.f((fz.e) fVar, qy.b0.f48488a, sVar3);
            Boolean bool = (Boolean) b1Var3.getValue();
            bool.getClass();
            boolean zH2 = sVar3.h(dayStreakWeeklyItems) | sVar3.f(pVar2);
            Object objQ13 = sVar3.Q();
            if (zH2 || objQ13 == obj) {
                objQ13 = new av.g0(dayStreakWeeklyItems, pVar2, b1Var3, null);
                sVar3.o0(objQ13);
            }
            l1.t.f((fz.e) objQ13, bool, sVar3);
            long j11 = ((s1) sVar3.j(h1.v1.f31180a)).f31033p;
            r0 r0Var = g2.f0.f28556b;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarH = d0.n.h(oVar, j11, r0Var);
            z1.j jVar = z1.c.f58463a;
            q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode6 = Long.hashCode(sVar3.T);
            q1 q1VarL = sVar3.l();
            z1.r rVarC = z1.a.c(sVar3, rVarH);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD, sVar3);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar3);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar3.S) {
                b3Var = b1Var3;
            } else {
                b3Var = b1Var3;
                if (!kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode6))) {
                }
                y2.h hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC, sVar3);
                z1.h hVar5 = z1.c.P;
                z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
                j0.d dVar2 = j0.i.f35305c;
                j0.u uVarA = j0.t.a(dVar2, hVar5, sVar3, 48);
                iHashCode = Long.hashCode(sVar3.T);
                q1 q1VarL2 = sVar3.l();
                z1.r rVarC2 = z1.a.c(sVar3, rVarV);
                sVar3.h0();
                i12 = i13;
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar, uVarA, sVar3);
                l1.t.J(hVar2, q1VarL2, sVar3);
                if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar3, iHashCode, hVar3);
                }
                l1.t.J(hVar4, rVarC2, sVar3);
                j0.c.g(sVar3, j0.v.a(oVar, 0.7f));
                z1.r rVarG = e2.g(e2.e(oVar, 1.0f), 162);
                q0 q0VarD2 = j0.o.d(z1.c.H, false);
                iHashCode2 = Long.hashCode(sVar3.T);
                q1 q1VarL3 = sVar3.l();
                z1.r rVarC3 = z1.a.c(sVar3, rVarG);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar, q0VarD2, sVar3);
                l1.t.J(hVar2, q1VarL3, sVar3);
                if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar3);
                }
                l1.t.J(hVar4, rVarC3, sVar3);
                a2 a2VarA = z1.a(j0.i.f35303a, z1.c.N, sVar3, 48);
                iHashCode3 = Long.hashCode(sVar3.T);
                q1 q1VarL4 = sVar3.l();
                z1.r rVarC4 = z1.a.c(sVar3, oVar);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar, a2VarA, sVar3);
                l1.t.J(hVar2, q1VarL4, sVar3);
                if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar3);
                }
                l1.t.J(hVar4, rVarC4, sVar3);
                n(6, 0, sVar3, j0.c.j(e2.s(j0.c.y(oVar, CropImageView.DEFAULT_ASPECT_RATIO, -10, 1), 90), 0.517757f));
                q(dayStreakStatus.getDayStreak(), null, sVar3, 0, 2);
                sVar3.p(true);
                sVar3.p(true);
                a0.j0.c(((Boolean) b1Var4.getValue()).booleanValue(), null, f1.e(null, 3), f1.f(null, 3), null, f28051h, sVar3, 1600518, 18);
                j0.c.g(sVar3, j0.v.a(oVar, 0.7f));
                z1.r rVarG2 = e2.g(e2.e(j0.c.B(oVar, 20, 41), 1.0f), 114);
                j0.u uVarA2 = j0.t.a(dVar2, z1.c.O, sVar3, 0);
                iHashCode4 = Long.hashCode(sVar3.T);
                q1 q1VarL5 = sVar3.l();
                z1.r rVarC5 = z1.a.c(sVar3, rVarG2);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar, uVarA2, sVar3);
                l1.t.J(hVar2, q1VarL5, sVar3);
                if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode4))) {
                    defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar3);
                }
                l1.t.J(hVar4, rVarC5, sVar3);
                boolean zBooleanValue = ((Boolean) b3Var.getValue()).booleanValue();
                l1 l1VarE = f1.e(null, 3);
                objQ = sVar3.Q();
                if (objQ == obj) {
                    objQ = new n2(16);
                    sVar3.o0(objQ);
                }
                l1 l1VarA = l1VarE.a(f1.r((fz.c) objQ, 1));
                m1 m1VarF = f1.f(null, 3);
                objQ2 = sVar3.Q();
                if (objQ2 == obj) {
                    objQ2 = new n2(17);
                    sVar3.o0(objQ2);
                }
                a0.j0.c(zBooleanValue, e2.d(oVar, 1.0f), l1VarA, m1VarF.a(f1.w((fz.c) objQ2, 1)), null, t1.e.d(13331566, new at.p(11, pVar2, list), sVar3), sVar3, 1600902, 16);
                sVar3.p(true);
                j0.c.g(sVar3, j0.v.a(oVar, 2.0f));
                z1.r rVarG3 = e2.g(oVar, 81);
                q0 q0VarD3 = j0.o.d(jVar, false);
                iHashCode5 = Long.hashCode(sVar3.T);
                q1 q1VarL6 = sVar3.l();
                z1.r rVarC6 = z1.a.c(sVar3, rVarG3);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar, q0VarD3, sVar3);
                l1.t.J(hVar2, q1VarL6, sVar3);
                if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode5))) {
                    defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar3);
                }
                l1.t.J(hVar4, rVarC6, sVar3);
                a0.j0.c(((Boolean) b1Var2.getValue()).booleanValue(), null, f1.e(null, 3), f1.f(null, 3), null, t1.e.d(172242421, new f0(0, onClickContinue, b1Var), sVar3), sVar3, 1600518, 18);
                sVar2 = sVar3;
                sVar2.p(true);
                sVar2.p(true);
                if (((Boolean) b1Var.getValue()).booleanValue()) {
                    sVar2.d0(40733390);
                    z11 = true;
                    t(b1Var, dayStreakStatus.getDayStreak(), ShareStreakType.STREAK, shareImage, savePic, shareMore, sVar2, (i12 & 7168) | 390 | (57344 & i12) | (i12 & 458752));
                } else {
                    z11 = true;
                    sVar2.d0(30907320);
                }
                sVar2.p(false);
                sVar2.p(z11);
                sVar = sVar2;
            }
            defpackage.e.A(iHashCode6, sVar3, iHashCode6, hVar3);
            y2.h hVar6 = y2.j.f56915d;
            l1.t.J(hVar6, rVarC, sVar3);
            z1.h hVar7 = z1.c.P;
            z1.r rVarV2 = j0.c.v(e2.d(oVar, 1.0f));
            j0.d dVar3 = j0.i.f35305c;
            j0.u uVarA3 = j0.t.a(dVar3, hVar7, sVar3, 48);
            iHashCode = Long.hashCode(sVar3.T);
            q1 q1VarL7 = sVar3.l();
            z1.r rVarC7 = z1.a.c(sVar3, rVarV2);
            sVar3.h0();
            i12 = i13;
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            l1.t.J(hVar, uVarA3, sVar3);
            l1.t.J(hVar2, q1VarL7, sVar3);
            if (sVar3.S) {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar3);
            } else {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar3);
            }
            l1.t.J(hVar6, rVarC7, sVar3);
            j0.c.g(sVar3, j0.v.a(oVar, 0.7f));
            z1.r rVarG4 = e2.g(e2.e(oVar, 1.0f), 162);
            q0 q0VarD4 = j0.o.d(z1.c.H, false);
            iHashCode2 = Long.hashCode(sVar3.T);
            q1 q1VarL8 = sVar3.l();
            z1.r rVarC8 = z1.a.c(sVar3, rVarG4);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            l1.t.J(hVar, q0VarD4, sVar3);
            l1.t.J(hVar2, q1VarL8, sVar3);
            if (sVar3.S) {
                defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar3);
            } else {
                defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar3);
            }
            l1.t.J(hVar6, rVarC8, sVar3);
            a2 a2VarA2 = z1.a(j0.i.f35303a, z1.c.N, sVar3, 48);
            iHashCode3 = Long.hashCode(sVar3.T);
            q1 q1VarL9 = sVar3.l();
            z1.r rVarC9 = z1.a.c(sVar3, oVar);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            l1.t.J(hVar, a2VarA2, sVar3);
            l1.t.J(hVar2, q1VarL9, sVar3);
            if (sVar3.S) {
                defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar3);
            } else {
                defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar3);
            }
            l1.t.J(hVar6, rVarC9, sVar3);
            n(6, 0, sVar3, j0.c.j(e2.s(j0.c.y(oVar, CropImageView.DEFAULT_ASPECT_RATIO, -10, 1), 90), 0.517757f));
            q(dayStreakStatus.getDayStreak(), null, sVar3, 0, 2);
            sVar3.p(true);
            sVar3.p(true);
            a0.j0.c(((Boolean) b1Var4.getValue()).booleanValue(), null, f1.e(null, 3), f1.f(null, 3), null, f28051h, sVar3, 1600518, 18);
            j0.c.g(sVar3, j0.v.a(oVar, 0.7f));
            z1.r rVarG5 = e2.g(e2.e(j0.c.B(oVar, 20, 41), 1.0f), 114);
            j0.u uVarA4 = j0.t.a(dVar3, z1.c.O, sVar3, 0);
            iHashCode4 = Long.hashCode(sVar3.T);
            q1 q1VarL10 = sVar3.l();
            z1.r rVarC10 = z1.a.c(sVar3, rVarG5);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            l1.t.J(hVar, uVarA4, sVar3);
            l1.t.J(hVar2, q1VarL10, sVar3);
            if (sVar3.S) {
                defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar3);
            } else {
                defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar3);
            }
            l1.t.J(hVar6, rVarC10, sVar3);
            boolean zBooleanValue2 = ((Boolean) b3Var.getValue()).booleanValue();
            l1 l1VarE2 = f1.e(null, 3);
            objQ = sVar3.Q();
            if (objQ == obj) {
                objQ = new n2(16);
                sVar3.o0(objQ);
            }
            l1 l1VarA2 = l1VarE2.a(f1.r((fz.c) objQ, 1));
            m1 m1VarF2 = f1.f(null, 3);
            objQ2 = sVar3.Q();
            if (objQ2 == obj) {
                objQ2 = new n2(17);
                sVar3.o0(objQ2);
            }
            a0.j0.c(zBooleanValue2, e2.d(oVar, 1.0f), l1VarA2, m1VarF2.a(f1.w((fz.c) objQ2, 1)), null, t1.e.d(13331566, new at.p(11, pVar2, list), sVar3), sVar3, 1600902, 16);
            sVar3.p(true);
            j0.c.g(sVar3, j0.v.a(oVar, 2.0f));
            z1.r rVarG6 = e2.g(oVar, 81);
            q0 q0VarD5 = j0.o.d(jVar, false);
            iHashCode5 = Long.hashCode(sVar3.T);
            q1 q1VarL11 = sVar3.l();
            z1.r rVarC11 = z1.a.c(sVar3, rVarG6);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            l1.t.J(hVar, q0VarD5, sVar3);
            l1.t.J(hVar2, q1VarL11, sVar3);
            if (sVar3.S) {
                defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar3);
            } else {
                defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar3);
            }
            l1.t.J(hVar6, rVarC11, sVar3);
            a0.j0.c(((Boolean) b1Var2.getValue()).booleanValue(), null, f1.e(null, 3), f1.f(null, 3), null, t1.e.d(172242421, new f0(0, onClickContinue, b1Var), sVar3), sVar3, 1600518, 18);
            sVar2 = sVar3;
            sVar2.p(true);
            sVar2.p(true);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar2.d0(40733390);
                z11 = true;
                t(b1Var, dayStreakStatus.getDayStreak(), ShareStreakType.STREAK, shareImage, savePic, shareMore, sVar2, (i12 & 7168) | 390 | (57344 & i12) | (i12 & 458752));
            } else {
                z11 = true;
                sVar2.d0(30907320);
            }
            sVar2.p(false);
            sVar2.p(z11);
            sVar = sVar2;
        } else {
            sVar3.W();
            sVar = sVar3;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.d(dayStreakStatus, dayStreakWeeklyItems, onClickContinue, shareImage, savePic, shareMore, i11);
        }
    }

    public static final void i(DayStreakFinishedStatus dayStreakStatus, fz.a onDismissRequest, l1.n nVar, int i11) {
        fz.a aVar;
        kotlin.jvm.internal.m.f(dayStreakStatus, "dayStreakStatus");
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1239365018);
        int i12 = (sVar.h(dayStreakStatus) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF = sVar.f(null) | sVar.f(aVarC);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = w4.c.e(ur.a.class, aVarC, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            aVar = onDismissRequest;
            androidx.compose.ui.window.a.a(aVar, new z3.r(3), t1.e.d(-2061204241, new fp.e((ur.a) objQ, dayStreakStatus, onDismissRequest, 1), sVar), sVar, 438, 0);
        } else {
            aVar = onDismissRequest;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(dayStreakStatus, i11, 1, aVar);
        }
    }

    public static final void j(final int i11, final long j11, final fz.a aVar, l1.n nVar, final boolean z11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1570508409);
        int i12 = i11 | (sVar.g(z11) ? 4 : 2) | (sVar.h(aVar) ? 32 : 16) | (sVar.e(j11) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarG = e2.g(oVar, 52);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarG);
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
            c2 c2Var = c2.f35266a;
            j0.c.g(sVar, c2Var.a(oVar, 1.0f));
            a0.j0.b(c2Var, z11, null, f1.e(null, 3), null, null, t1.e.d(1442799307, new n0(aVar, j11, 1), sVar), sVar, 1575942 | ((i12 << 3) & 112), 26);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(i11, j11, aVar, z11) { // from class: fu.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f28152a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ fz.a f28153b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f28154c;

                {
                    this.f28152a = z11;
                    this.f28153b = aVar;
                    this.f28154c = j11;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.j(l1.t.M(1), this.f28154c, this.f28153b, (l1.n) obj, this.f28152a);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void k(int i11, int i12, fz.a onDismissRequest, l1.n nVar) {
        fz.a aVar;
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(166091988);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12;
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF = sVar.f(null) | sVar.f(aVarC);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = w4.c.e(ur.a.class, aVarC, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            ur.a aVar2 = (ur.a) objQ;
            boolean zH = sVar.h(aVar2) | ((i13 & 14) == 4);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new a1(aVar2, i11, null, 27);
                sVar.o0(objQ2);
            }
            l1.t.f((fz.e) objQ2, qy.b0.f48488a, sVar);
            aVar = onDismissRequest;
            androidx.compose.ui.window.a.a(aVar, new z3.r(3), t1.e.d(-957415779, new m(i11, onDismissRequest), sVar), sVar, 438, 0);
        } else {
            aVar = onDismissRequest;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m(i11, aVar, i12, 3);
        }
    }

    public static final void l(int i11, int i12, fz.a aVar, l1.n nVar) {
        int i13;
        fz.a aVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-2690000);
        int i14 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.h(aVar) ? 32 : 16);
        if (sVar.T(i14 & 1, (i14 & 19) != 18)) {
            i13 = i11;
            aVar2 = aVar;
            m(i13, oz.x.q0(ub.a.e0(sVar, R.string.you_earned_s_streak_shield_s), "%s", String.valueOf(i11)), ub.a.e0(sVar, R.string.need_a_day_s_break_protect_your_streak_with_streak_shields), aVar2, sVar, (i14 & 14) | ((i14 << 6) & 7168));
        } else {
            i13 = i11;
            aVar2 = aVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m(i13, aVar2, i12, 1);
        }
    }

    public static final void m(int i11, String str, String str2, fz.a aVar, l1.n nVar, int i12) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(679090768);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.f(str) ? 32 : 16) | (sVar.f(str2) ? 256 : 128);
        if ((i12 & 3072) == 0) {
            i13 |= sVar.h(aVar) ? 2048 : 1024;
        }
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            int i14 = i13 & 14;
            boolean z11 = i14 == 4;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            boolean z12 = i14 == 4;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            b1 b1Var2 = (b1) objQ2;
            Integer numValueOf = Integer.valueOf(i11);
            boolean zF = sVar.f(b1Var) | sVar.f(b1Var2);
            Object objQ3 = sVar.Q();
            if (zF || objQ3 == gVar) {
                objQ3 = new y(b1Var, b1Var2, null, 0);
                sVar.o0(objQ3);
            }
            l1.t.f((fz.e) objQ3, numValueOf, sVar);
            k7.d(e2.g(e2.e(j0.c.C(z1.o.f58481a, 22, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 410), r0.f.d(14), null, null, null, t1.e.d(1366534814, new q(aVar, i11, b1Var2, str, str2), sVar), sVar, 196614, 28);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.d(i11, str, str2, aVar, i12, 1);
        }
    }

    public static final void n(int i11, int i12, l1.n nVar, z1.r rVar) {
        z1.r rVar2;
        int i13;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-887854973);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            rVar2 = rVar;
        } else if ((i11 & 6) == 0) {
            rVar2 = rVar;
            i13 = (sVar.f(rVar2) ? 4 : 2) | i11;
        } else {
            rVar2 = rVar;
            i13 = i11;
        }
        if (sVar.T(i13 & 1, (i13 & 3) != 2)) {
            if (i14 != 0) {
                rVar2 = z1.o.f58481a;
            }
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = defpackage.e.v(0, sVar);
            }
            l1.a1 a1Var = (l1.a1) objQ;
            ad.p pVarL = gb.r.L(new ad.r(R.raw.day_streak_finished_fire_1), sVar);
            ad.p pVarL2 = gb.r.L(new ad.r(R.raw.day_streak_finished_fire_2), sVar);
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            b1 b1Var = (b1) objQ2;
            ad.i iVarE = ff.h.e((wc.h) pVarL.getValue(), false, CropImageView.DEFAULT_ASPECT_RATIO, sVar, 1022);
            ad.i iVarE2 = ff.h.e((wc.h) pVarL2.getValue(), ((Boolean) b1Var.getValue()).booleanValue(), CropImageView.DEFAULT_ASPECT_RATIO, sVar, 956);
            Object value = iVarE.getValue();
            boolean zF = sVar.f(iVarE);
            Object objQ3 = sVar.Q();
            if (zF || objQ3 == gVar) {
                z zVar = new z(iVarE, a1Var, b1Var, null, 0);
                sVar.o0(zVar);
                objQ3 = zVar;
            }
            l1.t.f((fz.e) objQ3, value, sVar);
            h1 h1Var = (h1) a1Var;
            wc.h hVar = h1Var.l() == 0 ? (wc.h) pVarL.getValue() : (wc.h) pVarL2.getValue();
            boolean zF2 = sVar.f(iVarE) | sVar.f(iVarE2);
            Object objQ4 = sVar.Q();
            if (zF2 || objQ4 == gVar) {
                objQ4 = new r(h1Var, iVarE, iVarE2, 0);
                sVar.o0(objQ4);
            }
            j3.a(hVar, (fz.a) objQ4, rVar2, null, null, w2.i.f54517d, sVar, (i13 << 6) & 896, 48, 129016);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t(rVar2, i11, i12, 0);
        }
    }

    public static final void o(fz.e animationFirstRoundDuration, l1.n nVar, int i11) {
        ad.p pVar;
        kotlin.jvm.internal.m.f(animationFirstRoundDuration, "animationFirstRoundDuration");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(455614218);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = defpackage.e.v(0, sVar);
            }
            l1.a1 a1Var = (l1.a1) objQ;
            ad.p pVarL = gb.r.L(new ad.r(R.raw.day_streak_finished_milestone_1), sVar);
            ad.p pVarL2 = gb.r.L(new ad.r(R.raw.day_streak_finished_milestone_2), sVar);
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            b1 b1Var = (b1) objQ2;
            ad.i iVarE = ff.h.e((wc.h) pVarL.getValue(), false, CropImageView.DEFAULT_ASPECT_RATIO, sVar, 1022);
            ad.i iVarE2 = ff.h.e((wc.h) pVarL2.getValue(), false, CropImageView.DEFAULT_ASPECT_RATIO, sVar, 958);
            Object value = iVarE.getValue();
            boolean zF = sVar.f(iVarE);
            Object objQ3 = sVar.Q();
            vy.d dVar = null;
            if (zF || objQ3 == gVar) {
                z zVar = new z(iVarE, a1Var, b1Var, null, 1);
                sVar.o0(zVar);
                objQ3 = zVar;
            }
            l1.t.f((fz.e) objQ3, value, sVar);
            wc.h hVar = (wc.h) pVarL2.getValue();
            Float fValueOf = hVar != null ? Float.valueOf(hVar.b()) : null;
            wc.h hVar2 = (wc.h) pVarL2.getValue();
            Float fValueOf2 = hVar2 != null ? Float.valueOf(hVar2.b()) : null;
            boolean zF2 = sVar.f(pVarL) | sVar.f(pVarL2);
            Object objQ4 = sVar.Q();
            if (zF2 || objQ4 == gVar) {
                pVar = pVarL2;
                ad.y yVar = new ad.y(animationFirstRoundDuration, pVarL, pVar, dVar, 9);
                sVar.o0(yVar);
                objQ4 = yVar;
            } else {
                pVar = pVarL2;
            }
            l1.t.g(fValueOf, fValueOf2, (fz.e) objQ4, sVar);
            h1 h1Var = (h1) a1Var;
            wc.h hVar3 = h1Var.l() == 0 ? (wc.h) pVarL.getValue() : (wc.h) pVar.getValue();
            float f5 = 214;
            z1.r rVarY = j0.c.y(e2.g(e2.s(z1.o.f58481a, f5), f5), CropImageView.DEFAULT_ASPECT_RATIO, -20, 1);
            boolean zF3 = sVar.f(iVarE) | sVar.f(iVarE2);
            Object objQ5 = sVar.Q();
            if (zF3 || objQ5 == gVar) {
                objQ5 = new r(h1Var, iVarE, iVarE2, 1);
                sVar.o0(objQ5);
            }
            j3.a(hVar3, (fz.a) objQ5, rVarY, null, null, w2.i.f54517d, sVar, 384, 48, 129016);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e1(i11, 3, animationFirstRoundDuration);
        }
    }

    public static final void p(int i11, int i12, fz.a onClickClose, l1.n nVar) {
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-429808131);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.h(onClickClose) ? 32 : 16);
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = p0.s(CropImageView.DEFAULT_ASPECT_RATIO, sVar);
            }
            g1 g1Var = (g1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = p0.s(CropImageView.DEFAULT_ASPECT_RATIO, sVar);
            }
            g1 g1Var2 = (g1) objQ3;
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = l1.t.B(new g2.x(g2.x.f28621h));
                sVar.o0(objQ4);
            }
            b1 b1Var2 = (b1) objQ4;
            Object objQ5 = sVar.Q();
            if (objQ5 == gVar) {
                objQ5 = l1.t.B(new g2.x(g2.x.f28621h));
                sVar.o0(objQ5);
            }
            b1 b1Var3 = (b1) objQ5;
            b3 b3VarA = t1.a(((g2.x) b1Var2.getValue()).f28624a, null, BuildConfig.VERSION_NAME, sVar, 384, 10);
            b3 b3VarA2 = t1.a(((g2.x) b1Var3.getValue()).f28624a, null, BuildConfig.VERSION_NAME, sVar, 384, 10);
            Object objQ6 = sVar.Q();
            if (objQ6 == gVar) {
                fr.c cVar = new fr.c(b1Var2, b1Var3, b1Var, (vy.d) null, 5);
                sVar.o0(cVar);
                objQ6 = cVar;
            }
            l1.t.f((fz.e) objQ6, qy.b0.f48488a, sVar);
            k7.d(e2.g(e2.e(j0.c.C(z1.o.f58481a, 22, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 410), r0.f.d(14), null, null, null, t1.e.d(1036993391, new w(b3VarA, b3VarA2, b1Var, onClickClose, g1Var, g1Var2, i11), sVar), sVar, 196614, 28);
            sVar = sVar;
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m(i11, onClickClose, i12, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0107  */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Code duplicated, block: B:54:0x011e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:57:0x012a  */
    /* JADX WARN: Code duplicated, block: B:58:0x012e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0132  */
    /* JADX WARN: Code duplicated, block: B:60:0x0136  */
    /* JADX WARN: Code duplicated, block: B:61:0x013a  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0178  */
    /* JADX WARN: Code duplicated, block: B:66:0x017c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    /* JADX WARN: Code duplicated, block: B:68:0x0184  */
    /* JADX WARN: Code duplicated, block: B:69:0x0188  */
    /* JADX WARN: Code duplicated, block: B:70:0x018c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0190  */
    /* JADX WARN: Code duplicated, block: B:72:0x0194  */
    /* JADX WARN: Code duplicated, block: B:73:0x0198  */
    /* JADX WARN: Code duplicated, block: B:74:0x019c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void q(int i11, z1.r rVar, l1.n nVar, int i12, int i13) {
        int i14;
        z1.r rVar2;
        boolean z11;
        boolean z12;
        x1 x1VarT;
        z1.o oVar;
        z1.r rVar3;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        String strValueOf;
        int length;
        int i15;
        char cCharAt;
        int iHashCode2;
        y2.i iVar2;
        y2.h hVar2;
        int i16;
        int i17;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(2024342270);
        if ((i12 & 6) == 0) {
            i14 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i18 = i13 & 2;
        if (i18 == 0) {
            if ((i12 & 48) == 0) {
                rVar2 = rVar;
                i14 |= sVar.f(rVar2) ? 32 : 16;
            }
            z11 = true;
            if ((i14 & 19) != 18) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i14 & 1, z12)) {
                oVar = z1.o.f58481a;
                if (i18 != 0) {
                    rVar3 = oVar;
                } else {
                    rVar3 = rVar2;
                }
                a2 a2VarA = z1.a(j0.i.g(-12), z1.c.L, sVar, 6);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(sVar, rVar3);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA, sVar);
                l1.t.J(y2.j.f56916e, q1VarL, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar);
                sVar.d0(711429222);
                strValueOf = String.valueOf(i11);
                length = strValueOf.length();
                i15 = 0;
                while (i15 < length) {
                    cCharAt = strValueOf.charAt(i15);
                    q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(sVar, oVar);
                    y2.k.J.getClass();
                    iVar2 = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                    hVar2 = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar);
                    switch (Integer.parseInt(String.valueOf(cCharAt))) {
                        case 1:
                            i16 = R.drawable.day_streak_number_1_bg;
                            break;
                        case 2:
                            i16 = R.drawable.day_streak_number_2_bg;
                            break;
                        case 3:
                            i16 = R.drawable.day_streak_number_3_bg;
                            break;
                        case 4:
                            i16 = R.drawable.day_streak_number_4_bg;
                            break;
                        case 5:
                            i16 = R.drawable.day_streak_number_5_bg;
                            break;
                        case 6:
                            i16 = R.drawable.day_streak_number_6_bg;
                            break;
                        case 7:
                            i16 = R.drawable.day_streak_number_7_bg;
                            break;
                        case 8:
                            i16 = R.drawable.day_streak_number_8_bg;
                            break;
                        case 9:
                            i16 = R.drawable.day_streak_number_9_bg;
                            break;
                        default:
                            i16 = R.drawable.day_streak_number_0_bg;
                            break;
                    }
                    float f5 = 80;
                    float f11 = 98;
                    String str = strValueOf;
                    int i19 = i15;
                    z1.r rVar4 = rVar3;
                    int i21 = length;
                    d0.n.c(se.k.y(i16, sVar, 0), null, e2.g(e2.s(oVar, f5), f11), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
                    switch (Integer.parseInt(String.valueOf(cCharAt))) {
                        case 1:
                            i17 = R.drawable.day_streak_number_1;
                            break;
                        case 2:
                            i17 = R.drawable.day_streak_number_2;
                            break;
                        case 3:
                            i17 = R.drawable.day_streak_number_3;
                            break;
                        case 4:
                            i17 = R.drawable.day_streak_number_4;
                            break;
                        case 5:
                            i17 = R.drawable.day_streak_number_5;
                            break;
                        case 6:
                            i17 = R.drawable.day_streak_number_6;
                            break;
                        case 7:
                            i17 = R.drawable.day_streak_number_7;
                            break;
                        case 8:
                            i17 = R.drawable.day_streak_number_8;
                            break;
                        case 9:
                            i17 = R.drawable.day_streak_number_9;
                            break;
                        default:
                            i17 = R.drawable.day_streak_number_0;
                            break;
                    }
                    d0.n.c(se.k.y(i17, sVar, 0), null, e2.g(e2.s(oVar, f5), f11), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
                    sVar.p(true);
                    i15 = i19 + 1;
                    z11 = true;
                    strValueOf = str;
                    rVar3 = rVar4;
                    length = i21;
                }
                sVar.p(false);
                sVar.p(z11);
                rVar2 = rVar3;
            } else {
                sVar.W();
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new l(i11, rVar2, i12, i13);
            }
        }
        i14 |= 48;
        rVar2 = rVar;
        z11 = true;
        if ((i14 & 19) != 18) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (sVar.T(i14 & 1, z12)) {
            oVar = z1.o.f58481a;
            if (i18 != 0) {
                rVar3 = oVar;
            } else {
                rVar3 = rVar2;
            }
            a2 a2VarA2 = z1.a(j0.i.g(-12), z1.c.L, sVar, 6);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVar3);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA2, sVar);
            l1.t.J(y2.j.f56916e, q1VarL3, sVar);
            hVar = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC3, sVar);
            sVar.d0(711429222);
            strValueOf = String.valueOf(i11);
            length = strValueOf.length();
            i15 = 0;
            while (i15 < length) {
                cCharAt = strValueOf.charAt(i15);
                q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL4 = sVar.l();
                z1.r rVarC4 = z1.a.c(sVar, oVar);
                y2.k.J.getClass();
                iVar2 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD2, sVar);
                l1.t.J(y2.j.f56916e, q1VarL4, sVar);
                hVar2 = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
                } else {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
                }
                l1.t.J(y2.j.f56915d, rVarC4, sVar);
                switch (Integer.parseInt(String.valueOf(cCharAt))) {
                    case 1:
                        i16 = R.drawable.day_streak_number_1_bg;
                        break;
                    case 2:
                        i16 = R.drawable.day_streak_number_2_bg;
                        break;
                    case 3:
                        i16 = R.drawable.day_streak_number_3_bg;
                        break;
                    case 4:
                        i16 = R.drawable.day_streak_number_4_bg;
                        break;
                    case 5:
                        i16 = R.drawable.day_streak_number_5_bg;
                        break;
                    case 6:
                        i16 = R.drawable.day_streak_number_6_bg;
                        break;
                    case 7:
                        i16 = R.drawable.day_streak_number_7_bg;
                        break;
                    case 8:
                        i16 = R.drawable.day_streak_number_8_bg;
                        break;
                    case 9:
                        i16 = R.drawable.day_streak_number_9_bg;
                        break;
                    default:
                        i16 = R.drawable.day_streak_number_0_bg;
                        break;
                }
                float f12 = 80;
                float f13 = 98;
                String str2 = strValueOf;
                int i110 = i15;
                z1.r rVar5 = rVar3;
                int i22 = length;
                d0.n.c(se.k.y(i16, sVar, 0), null, e2.g(e2.s(oVar, f12), f13), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
                switch (Integer.parseInt(String.valueOf(cCharAt))) {
                    case 1:
                        i17 = R.drawable.day_streak_number_1;
                        break;
                    case 2:
                        i17 = R.drawable.day_streak_number_2;
                        break;
                    case 3:
                        i17 = R.drawable.day_streak_number_3;
                        break;
                    case 4:
                        i17 = R.drawable.day_streak_number_4;
                        break;
                    case 5:
                        i17 = R.drawable.day_streak_number_5;
                        break;
                    case 6:
                        i17 = R.drawable.day_streak_number_6;
                        break;
                    case 7:
                        i17 = R.drawable.day_streak_number_7;
                        break;
                    case 8:
                        i17 = R.drawable.day_streak_number_8;
                        break;
                    case 9:
                        i17 = R.drawable.day_streak_number_9;
                        break;
                    default:
                        i17 = R.drawable.day_streak_number_0;
                        break;
                }
                d0.n.c(se.k.y(i17, sVar, 0), null, e2.g(e2.s(oVar, f12), f13), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
                sVar.p(true);
                i15 = i110 + 1;
                z11 = true;
                strValueOf = str2;
                rVar3 = rVar5;
                length = i22;
            }
            sVar.p(false);
            sVar.p(z11);
            rVar2 = rVar3;
        } else {
            sVar.W();
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new l(i11, rVar2, i12, i13);
        }
    }

    public static final void r(int i11, int i12, fz.a onClickClose, l1.n nVar) {
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-237936175);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.h(onClickClose) ? 32 : 16);
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            b1 b1Var2 = (b1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = new y(b1Var, b1Var2, null, 1);
                sVar.o0(objQ3);
            }
            l1.t.f((fz.e) objQ3, qy.b0.f48488a, sVar);
            k7.d(e2.g(e2.e(j0.c.C(z1.o.f58481a, 22, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 410), r0.f.d(14), null, null, null, t1.e.d(1010924575, new v(i11, onClickClose, b1Var, b1Var2), sVar), sVar, 196614, 28);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m(i11, onClickClose, i12, 4);
        }
    }

    public static final void s(b1 showMilestonePopup, long j11, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(showMilestonePopup, "showMilestonePopup");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(390036695);
        int i12 = i11 | (sVar.e(j11) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            if (((Boolean) showMilestonePopup.getValue()).booleanValue()) {
                sVar.d0(1696844583);
                v3.c cVar = (v3.c) sVar.j(z2.g1.f58547h);
                Object objQ = sVar.Q();
                l1.g gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = defpackage.e.v(0, sVar);
                }
                l1.a1 a1Var = (l1.a1) objQ;
                Object objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = l1.t.B(Boolean.FALSE);
                    sVar.o0(objQ2);
                }
                b1 b1Var = (b1) objQ2;
                h1 h1Var = (h1) a1Var;
                boolean zD = sVar.d(h1Var.l());
                Object objQ3 = sVar.Q();
                if (zD || objQ3 == gVar) {
                    objQ3 = l1.t.B(new v3.j((((long) ((int) ((((int) (j11 & 4294967295L)) - (h1Var.l() / 2)) - cVar.e0(16)))) & 4294967295L) | (((long) ((int) (((int) (j11 >> 32)) - cVar.e0(50)))) << 32)));
                    sVar.o0(objQ3);
                }
                long j12 = ((v3.j) ((b1) objQ3).getValue()).f53492a;
                Object objQ4 = sVar.Q();
                if (objQ4 == gVar) {
                    objQ4 = new h2(8, showMilestonePopup);
                    sVar.o0(objQ4);
                }
                z3.k.b(null, j12, (fz.a) objQ4, null, t1.e.d(-1999417553, new ch.z(28, b1Var, a1Var), sVar), sVar, 24576, 9);
            } else {
                sVar.d0(1692703851);
            }
            sVar.p(false);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d2(i11, j11, 3, showMilestonePopup);
        }
    }

    public static final void t(b1 b1Var, int i11, ShareStreakType shareStreakType, fz.f shareImage, fz.e savePic, fz.c shareMore, l1.n nVar, int i12) {
        b1 b1Var2;
        kotlin.jvm.internal.m.f(shareStreakType, "shareStreakType");
        kotlin.jvm.internal.m.f(shareImage, "shareImage");
        kotlin.jvm.internal.m.f(savePic, "savePic");
        kotlin.jvm.internal.m.f(shareMore, "shareMore");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1814107091);
        int i13 = (sVar.d(i11) ? 32 : 16) | i12;
        if ((i12 & 3072) == 0) {
            i13 |= sVar.h(shareImage) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= sVar.h(savePic) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i12) == 0) {
            i13 |= sVar.h(shareMore) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if (sVar.T(i13 & 1, (74899 & i13) != 74898)) {
            kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
            Object objQ = sVar.Q();
            Object obj = null;
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                sVar.o0(null);
                objQ = null;
            }
            yVar.f38361a = (Uri) objQ;
            kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                sVar.o0(null);
            } else {
                obj = objQ2;
            }
            yVar2.f38361a = (Bitmap) obj;
            b1Var2 = b1Var;
            tv.j.b(b1Var2, new n(2, yVar, shareImage), new fp.f(1, yVar, shareMore), new fp.f(yVar2, savePic), t1.e.d(-567962711, new androidx.lifecycle.compose.h(i11, shareStreakType, yVar2, yVar), sVar), sVar, 24582);
        } else {
            b1Var2 = b1Var;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.n(b1Var2, i11, shareStreakType, shareImage, savePic, shareMore, i12);
        }
    }

    public static final void u(int i11, ShareStreakType shareStreakType, g0 g0Var, l1.n nVar, int i12) {
        int iIntValue;
        kotlin.jvm.internal.m.f(shareStreakType, "shareStreakType");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1651191719);
        int i13 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.d(shareStreakType.ordinal()) ? 32 : 16) | (sVar.h(g0Var) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar);
                sVar.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            l1.t.H(shareStreakType, sVar);
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = p3.A(ns.o.L(new g2.x(g2.f0.e(4294926359L)), new g2.x(g2.f0.e(4294955366L))));
                sVar.o0(objQ2);
            }
            g2.t tVar = (g2.t) objQ2;
            if (k0.f28127a[shareStreakType.ordinal()] == 1) {
                iIntValue = R.string.day_streak_share_title_milestone;
            } else {
                Integer[] numArr = {Integer.valueOf(R.string.day_streak_share_title_1), Integer.valueOf(R.string.day_streak_share_title_2)};
                jz.d dVar = jz.e.f37397a;
                iIntValue = ((Number) ry.l.d0(numArr)).intValue();
            }
            boolean zD = ((i13 & 14) == 4) | sVar.d(R.drawable.day_streak_share_streaked) | sVar.d(iIntValue) | sVar.h(b0Var) | ((i13 & 896) == 256);
            Object objQ3 = sVar.Q();
            if (zD || objQ3 == gVar) {
                h0 h0Var = new h0(tVar, iIntValue, i11, b0Var, g0Var);
                sVar.o0(h0Var);
                objQ3 = h0Var;
            }
            float f5 = 320;
            y3.h.b((fz.c) objQ3, e2.p(z1.o.f58481a, f5, f5), null, sVar, 48, 4);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.t1(i11, shareStreakType, g0Var, i12, 4);
        }
    }
}
