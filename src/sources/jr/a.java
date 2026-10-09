package jr;

import a0.f1;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import b0.t1;
import bt.a3;
import bt.g5;
import bt.q5;
import bt.s5;
import bt.y1;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStateKt;
import com.google.accompanist.permissions.PermissionsUtilKt;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.lingodeer.R;
import com.lingodeer.data.model.CoursePracticeType;
import com.yalantis.ucrop.view.CropImageView;
import dt.d4;
import dt.h2;
import dt.y3;
import fr.j3;
import fr.p3;
import g2.r0;
import h1.g7;
import h1.k7;
import h1.p7;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.z1;
import j3.y0;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kr.c1;
import kr.d1;
import kr.l1;
import kr.m0;
import kr.m1;
import kr.n0;
import kr.n1;
import kr.o1;
import kr.p0;
import kr.p1;
import kr.s0;
import kr.z0;
import l1.a1;
import l1.b1;
import l1.c3;
import l1.h1;
import l1.q1;
import l1.x1;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f36556a = new t1.d(new iv.b(1), false, -189974383);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f36557b = new t1.d(new iv.b(2), false, -896570989);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.d f36558c = new t1.d(new j3.j0(17), false, -1862365032);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.d f36559d = new t1.d(new j3.j0(18), false, 953035307);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t1.d f36560e = new t1.d(new j3.j0(19), false, 844915106);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t1.d f36561f = new t1.d(new iv.b(3), false, 888948867);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t1.d f36562g = new t1.d(new iv.b(4), false, -516242811);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t1.d f36563h = new t1.d(new j3.j0(20), false, -1249320950);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t1.d f36564i = new t1.d(new j3.j0(21), false, -1951916789);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t1.d f36565j = new t1.d(new j3.j0(22), false, 328540371);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t1.d f36566k = new t1.d(new iv.b(5), false, 1013688744);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t1.d f36567l = new t1.d(new j3.j0(23), false, -1513862526);
    public static final t1.d m = new t1.d(new iv.b(6), false, 400469367);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final t1.d f36568n = new t1.d(new j3.j0(24), false, 2036364782);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final t1.d f36569o = new t1.d(new iv.b(7), false, -650469260);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t1.d f36570p = new t1.d(new j3.j0(25), false, -1040858242);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final t1.d f36571q = new t1.d(new j3.j0(26), false, 663003616);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final t1.d f36572r = new t1.d(new iv.b(8), false, -2003805775);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final t1.d f36573s = new t1.d(new iv.b(9), false, -896285149);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final t1.d f36574t = new t1.d(new j3.j0(27), false, 1859791473);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final t1.d f36575u = new t1.d(new iv.b(10), false, 1536205865);

    public static final void a(int i11, kr.h0 h0Var, fz.a aVar, fz.c cVar, l1.n nVar, int i12) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1233707956);
        int i13 = i12 | (sVar2.d(i11) ? 4 : 2) | (sVar2.f(h0Var) ? 32 : 16) | (sVar2.h(cVar) ? 2048 : 1024);
        if (sVar2.T(i13 & 1, (i13 & 1171) != 1170)) {
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = ep.a.r(h0Var.f38476a, sVar2);
            }
            b1 b1Var = (b1) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = ep.a.r(h0Var.f38482g, sVar2);
            }
            b1 b1Var2 = (b1) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = ep.a.s(h0Var.f38483h, sVar2);
            }
            b1 b1Var3 = (b1) objQ3;
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = ep.a.r(h0Var.f38480e, sVar2);
            }
            b1 b1Var4 = (b1) objQ4;
            sVar = sVar2;
            k7.a(aVar, t1.e.d(-449171820, new bp.f0(cVar, h0Var, b1Var, b1Var2, b1Var3, b1Var4, 8), sVar2), null, t1.e.d(-1155768426, new at.o(24, aVar), sVar2), f36558c, t1.e.d(-68179687, new cs.a(i11, b1Var, b1Var3, b1Var2, b1Var4), sVar2), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772598, 16276);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(i11, h0Var, aVar, cVar, i12, 16);
        }
    }

    public static final void b(int i11, l1.n nVar, z1.r rVar, boolean z11) {
        z1.r rVar2;
        Object j0Var;
        a1 a1Var;
        boolean z12 = z11;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1027968077);
        int i12 = i11 | 6 | (sVar.g(z12) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = ns.o.L(Integer.valueOf(R.drawable.ic_speak_play_1), Integer.valueOf(R.drawable.ic_speak_play_2), Integer.valueOf(R.drawable.ic_speak_play_3), Integer.valueOf(R.drawable.ic_speak_play_4), Integer.valueOf(R.drawable.ic_speak_play_5), Integer.valueOf(R.drawable.ic_speak_play_6), Integer.valueOf(R.drawable.ic_speak_play_7), Integer.valueOf(R.drawable.ic_speak_play_8));
                sVar.o0(objQ);
            }
            List list = (List) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = defpackage.e.v(0, sVar);
            }
            a1 a1Var2 = (a1) objQ2;
            Boolean boolValueOf = Boolean.valueOf(z12);
            boolean zH = sVar.h(list) | ((i12 & 112) == 32);
            Object objQ3 = sVar.Q();
            if (zH || objQ3 == gVar) {
                a1Var = a1Var2;
                j0Var = new bh.j0(z12, list, a1Var, (vy.d) null, 6);
                sVar.o0(j0Var);
            } else {
                j0Var = objQ3;
                a1Var = a1Var2;
            }
            l1.t.f((fz.e) j0Var, boolValueOf, sVar);
            k2.b bVarY = se.k.y(((Number) list.get(((h1) a1Var).l())).intValue(), sVar, 0);
            rVar2 = z1.o.f58481a;
            d0.n.c(bVarY, null, rVar2, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 440, 120);
        } else {
            z12 = z12;
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iv.g(i11, rVar2, z12);
        }
    }

    public static final void c(kr.l lVar, z1.r rVar, boolean z11, fz.a aVar, fz.c cVar, fz.c cVar2, fz.a aVar2, l1.n nVar, int i11) {
        z1.r rVar2;
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(2031717466);
        int i12 = i11 | (sVar2.h(lVar) ? 4 : 2);
        if ((i11 & 48) == 0) {
            rVar2 = rVar;
            i12 |= sVar2.f(rVar2) ? 32 : 16;
        } else {
            rVar2 = rVar;
        }
        int i13 = i12 | (sVar2.g(z11) ? 256 : 128) | (sVar2.h(aVar) ? 2048 : 1024) | (sVar2.h(cVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(cVar2) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(aVar2) ? 1048576 : 524288);
        if (sVar2.T(i13 & 1, (599187 & i13) != 599186)) {
            boolean z12 = lVar.f38516b.isEmpty() || z11;
            boolean z13 = (i13 & 7168) == 2048;
            Object objQ = sVar2.Q();
            if (z13 || objQ == l1.m.f39353a) {
                objQ = new et.p(28, aVar);
                sVar2.o0(objQ);
            }
            sVar = sVar2;
            j1.j.a(z12, (fz.a) objQ, null, null, null, null, t1.e.d(1751729972, new bp.y(rVar2, lVar, cVar, cVar2, aVar2, 6), sVar2), sVar, 1572864);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j(lVar, rVar, z11, aVar, cVar, cVar2, aVar2, i11);
        }
    }

    public static final void d(kr.l lVar, z1.r rVar, l1.n nVar, int i11, int i12) {
        z1.r rVar2;
        int i13;
        z1.r rVar3;
        z1.r rVar4;
        boolean z11;
        boolean z12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1229927724);
        int i14 = i11 | (sVar.h(lVar) ? 4 : 2);
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 = i14 | 48;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i13 = i14 | (sVar.f(rVar2) ? 32 : 16);
        }
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVar5 = i15 != 0 ? oVar : rVar2;
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar5);
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
            List list = lVar.f38518d;
            List list2 = lVar.f38517c;
            int i16 = lVar.f38520f;
            Integer numValueOf = Integer.valueOf(i16);
            if (i16 >= list.size()) {
                numValueOf = null;
            }
            wb.k.c(list.get(numValueOf != null ? numValueOf.intValue() : list.size() - 1), j0.c.j(e2.e(oVar, 1.0f), 1.7777778f), null, sVar, 432, 4088);
            if (lVar.f38521g > CropImageView.DEFAULT_ASPECT_RATIO) {
                sVar.d0(190201551);
                boolean zD = sVar.d(i16);
                Object objQ = sVar.Q();
                l1.g gVar = l1.m.f39353a;
                if (zD || objQ == gVar) {
                    objQ = i16 < list2.size() ? (ir.b) list2.get(i16) : (ir.b) ry.m.z0(list2);
                    sVar.o0(objQ);
                }
                ir.b bVar = (ir.b) objQ;
                z1.j jVar = z1.c.H;
                j0.r rVar6 = j0.r.f35391a;
                z1.r rVarC2 = j0.c.C(d0.n.g(e2.e(rVar6.a(oVar, jVar), 1.0f), p3.A(ns.o.L(new g2.x(g2.x.f28621h), new g2.x(g2.f0.e(2281701376L)))), null, 6), CropImageView.DEFAULT_ASPECT_RATIO, 8, 1);
                q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
                int iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                z1.r rVarC3 = z1.a.c(sVar, rVarC2);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, q0VarD2, sVar);
                l1.t.J(hVar2, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                }
                l1.t.J(hVar4, rVarC3, sVar);
                rVar4 = rVar5;
                z11 = true;
                d4.a(bVar.f34557a.getDisplayCourseWords(), null, null, false, false, y0.a((y0) sVar.j(ua.f31167a), g2.x.f28618e, j3.A(16), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar, 3072, 0, 0, 4194262);
                sVar = sVar;
                sVar.p(true);
                boolean zH = sVar.h(lVar);
                Object objQ2 = sVar.Q();
                if (zH || objQ2 == gVar) {
                    objQ2 = new hh.o(lVar, 17);
                    sVar.o0(objQ2);
                }
                fz.a aVar = (fz.a) objQ2;
                z1.r rVarA = rVar6.a(e2.e(oVar, 1.0f), jVar);
                float f5 = -4;
                Object objQ3 = sVar.Q();
                if (objQ3 == gVar) {
                    objQ3 = new j9.a0(20);
                    sVar.o0(objQ3);
                }
                g7.c(aVar, rVarA, 0L, 0L, 0, f5, (fz.c) objQ3, sVar, 1769472, 28);
                z12 = false;
            } else {
                sVar = sVar;
                rVar4 = rVar5;
                z11 = true;
                z12 = false;
                sVar.d0(177636476);
            }
            sVar.p(z12);
            sVar.p(z11);
            rVar3 = rVar4;
        } else {
            sVar.W();
            rVar3 = rVar2;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t1(lVar, rVar3, i11, i12, 7);
        }
    }

    public static final void e(int i11, fz.a onClickBack, kr.b0 b0Var, l1.n nVar, int i12) {
        l1.s sVar;
        kr.b0 b0Var2;
        int i13;
        final kr.b0 b0Var3;
        b1 b1Var;
        l1.g gVar;
        boolean z11;
        kotlin.jvm.internal.m.f(onClickBack, "onClickBack");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-375045511);
        int i14 = i12 | (sVar2.d(i11) ? 4 : 2) | (sVar2.h(onClickBack) ? 32 : 16) | 128;
        if (sVar2.T(i14 & 1, (i14 & 147) != 146)) {
            sVar2.Y();
            int i15 = i12 & 1;
            l1.g gVar2 = l1.m.f39353a;
            if (i15 == 0 || sVar2.C()) {
                boolean z12 = (i14 & 14) == 4;
                Object objQ = sVar2.Q();
                if (z12 || objQ == gVar2) {
                    objQ = new fu.x(i11, 1);
                    sVar2.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                sVar2.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar2, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(kr.b0.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), aVar);
                sVar2.p(false);
                i13 = i14 & (-897);
                b0Var3 = (kr.b0) viewModelA;
            } else {
                sVar2.W();
                i13 = i14 & (-897);
                b0Var3 = b0Var;
            }
            sVar2.q();
            b1 b1VarO = l1.t.o(b0Var3.R, sVar2);
            b1 b1VarO2 = l1.t.o(b0Var3.Q, sVar2);
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar2) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ2);
            }
            b1 b1Var2 = (b1) objQ2;
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                sVar2.d0(-1770411839);
                Object objQ3 = sVar2.Q();
                if (objQ3 == gVar2) {
                    objQ3 = new ju.d(25);
                    sVar2.o0(objQ3);
                }
                b1Var = b1Var2;
                z11 = false;
                gVar = gVar2;
                k7.a((fz.a) objQ3, t1.e.d(1561062406, new fu.n(25, b0Var3, b1Var2), sVar2), null, t1.e.d(155870728, new bp.s(b1Var2, 4, (byte) 0), sVar2), f36563h, f36564i, null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 1772598, 16276);
                sVar2 = sVar2;
            } else {
                b1Var = b1Var2;
                gVar = gVar2;
                z11 = false;
                sVar2.d0(-1774470359);
            }
            sVar2.p(z11);
            kr.m mVar = (kr.m) b1VarO.getValue();
            boolean zBooleanValue = ((Boolean) b1VarO2.getValue()).booleanValue();
            boolean zH = sVar2.h(b0Var3);
            Object objQ4 = sVar2.Q();
            if (zH || objQ4 == gVar) {
                final int i16 = 0;
                objQ4 = new fz.c() { // from class: jr.g
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                kr.n it = (kr.n) obj;
                                kotlin.jvm.internal.m.f(it, "it");
                                b0Var3.a(new kr.f(it));
                                break;
                            case 1:
                                kr.j it2 = (kr.j) obj;
                                kotlin.jvm.internal.m.f(it2, "it");
                                b0Var3.a(new kr.g(it2));
                                break;
                            default:
                                kr.n it3 = (kr.n) obj;
                                kotlin.jvm.internal.m.f(it3, "it");
                                b0Var3.a(new kr.d(it3));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ4);
            }
            fz.c cVar = (fz.c) objQ4;
            boolean zH2 = sVar2.h(b0Var3);
            Object objQ5 = sVar2.Q();
            if (zH2 || objQ5 == gVar) {
                final int i17 = 1;
                objQ5 = new fz.c() { // from class: jr.g
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i17) {
                            case 0:
                                kr.n it = (kr.n) obj;
                                kotlin.jvm.internal.m.f(it, "it");
                                b0Var3.a(new kr.f(it));
                                break;
                            case 1:
                                kr.j it2 = (kr.j) obj;
                                kotlin.jvm.internal.m.f(it2, "it");
                                b0Var3.a(new kr.g(it2));
                                break;
                            default:
                                kr.n it3 = (kr.n) obj;
                                kotlin.jvm.internal.m.f(it3, "it");
                                b0Var3.a(new kr.d(it3));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ5);
            }
            fz.c cVar2 = (fz.c) objQ5;
            boolean zH3 = sVar2.h(b0Var3);
            Object objQ6 = sVar2.Q();
            if (zH3 || objQ6 == gVar) {
                objQ6 = new hh.o(b0Var3, 16);
                sVar2.o0(objQ6);
            }
            fz.a aVar2 = (fz.a) objQ6;
            boolean zH4 = sVar2.h(b0Var3);
            Object objQ7 = sVar2.Q();
            if (zH4 || objQ7 == gVar) {
                final int i18 = 2;
                objQ7 = new fz.c() { // from class: jr.g
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i18) {
                            case 0:
                                kr.n it = (kr.n) obj;
                                kotlin.jvm.internal.m.f(it, "it");
                                b0Var3.a(new kr.f(it));
                                break;
                            case 1:
                                kr.j it2 = (kr.j) obj;
                                kotlin.jvm.internal.m.f(it2, "it");
                                b0Var3.a(new kr.g(it2));
                                break;
                            default:
                                kr.n it3 = (kr.n) obj;
                                kotlin.jvm.internal.m.f(it3, "it");
                                b0Var3.a(new kr.d(it3));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ7);
            }
            fz.c cVar3 = (fz.c) objQ7;
            Object objQ8 = sVar2.Q();
            if (objQ8 == gVar) {
                objQ8 = new h2(21, b1Var);
                sVar2.o0(objQ8);
            }
            f(mVar, zBooleanValue, cVar, cVar2, aVar2, cVar3, (fz.a) objQ8, onClickBack, sVar2, ((i13 << 18) & 29360128) | 1572864);
            sVar = sVar2;
            b0Var2 = b0Var3;
        } else {
            sVar = sVar2;
            sVar.W();
            b0Var2 = b0Var;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t1(i11, onClickBack, b0Var2, i12, 6);
        }
    }

    public static final void f(final kr.m uiState, final boolean z11, final fz.c onClickUser, final fz.c updateShowType, final fz.a pullToRefresh, final fz.c onClickLike, final fz.a onClickDelete, final fz.a onClickBack, l1.n nVar, final int i11) {
        int i12;
        boolean z12;
        l1.s sVar;
        int i13;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        kotlin.jvm.internal.m.f(onClickUser, "onClickUser");
        kotlin.jvm.internal.m.f(updateShowType, "updateShowType");
        kotlin.jvm.internal.m.f(pullToRefresh, "pullToRefresh");
        kotlin.jvm.internal.m.f(onClickLike, "onClickLike");
        kotlin.jvm.internal.m.f(onClickDelete, "onClickDelete");
        kotlin.jvm.internal.m.f(onClickBack, "onClickBack");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1810164377);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar2.f(uiState) : sVar2.h(uiState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            z12 = z11;
            i12 |= sVar2.g(z12) ? 32 : 16;
        } else {
            z12 = z11;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(onClickUser) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(updateShowType) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(pullToRefresh) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(onClickLike) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.h(onClickDelete) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar2.h(onClickBack) ? 8388608 : 4194304;
        }
        boolean z13 = false;
        if (!sVar2.T(i12 & 1, (4793491 & i12) != 4793490)) {
            sVar = sVar2;
            sVar.W();
        } else if (uiState.equals(kr.k.f38507a)) {
            sVar2.d0(106225864);
            tv.a.d(0, 1, sVar2, null);
            sVar2.p(false);
            sVar = sVar2;
        } else {
            if (!(uiState instanceof kr.l)) {
                throw nv.p.x(sVar2, 106228622, false);
            }
            sVar2.d0(-1001762956);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar2.d0(-1001751455);
                int i14 = o.f36687a[((kr.l) uiState).f38519e.ordinal()];
                if (i14 == 1) {
                    i13 = 0;
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i13 = 1;
                }
                Object objQ2 = sVar2.Q();
                if (objQ2 == gVar) {
                    objQ2 = new h2(22, b1Var);
                    sVar2.o0(objQ2);
                }
                fz.a aVar = (fz.a) objQ2;
                boolean z14 = (i12 & 7168) == 2048;
                Object objQ3 = sVar2.Q();
                if (z14 || objQ3 == gVar) {
                    objQ3 = new y3(updateShowType, b1Var, 3);
                    sVar2.o0(objQ3);
                }
                g(i13, aVar, (fz.c) objQ3, sVar2, 48);
                z13 = false;
            } else {
                sVar2.d0(-1007645175);
            }
            sVar2.p(z13);
            p7.a(null, t1.e.d(-259767490, new fp.e(10, onClickBack, b1Var, uiState), sVar2), null, null, null, 0, 0L, 0L, null, t1.e.d(-687046455, new h(uiState, z12, pullToRefresh, onClickUser, onClickLike, onClickDelete), sVar2), sVar2, 805306416, 509);
            sVar = sVar2;
            sVar.p(z13);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: jr.i
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    a.f(uiState, z11, onClickUser, updateShowType, pullToRefresh, onClickLike, onClickDelete, onClickBack, (l1.n) obj, l1.t.M(i11 | 1));
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void g(int i11, fz.a onDismissRequest, fz.c onConfirmation, l1.n nVar, int i12) {
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        kotlin.jvm.internal.m.f(onConfirmation, "onConfirmation");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1968044723);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.h(onConfirmation) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            xu.q1.e(ub.a.e0(sVar, R.string.sort_by), new String[]{ub.a.e0(sVar, R.string.time), ub.a.e0(sVar, R.string.like)}, i11, onDismissRequest, onConfirmation, sVar, (i13 << 6) & 65408);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iv.e(i11, onDismissRequest, onConfirmation, i12, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x039c  */
    /* JADX WARN: Code duplicated, block: B:103:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:107:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:110:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:111:0x0408  */
    /* JADX WARN: Code duplicated, block: B:113:0x0415  */
    /* JADX WARN: Code duplicated, block: B:114:0x047d  */
    /* JADX WARN: Code duplicated, block: B:118:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:121:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:123:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:124:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:129:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:132:0x0539  */
    /* JADX WARN: Code duplicated, block: B:133:0x053d  */
    /* JADX WARN: Code duplicated, block: B:136:0x054a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0558  */
    /* JADX WARN: Code duplicated, block: B:141:0x0594  */
    /* JADX WARN: Code duplicated, block: B:143:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:144:0x05af  */
    /* JADX WARN: Code duplicated, block: B:146:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:147:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:150:0x05c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:155:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:157:0x0609 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x060b  */
    /* JADX WARN: Code duplicated, block: B:160:0x0618  */
    /* JADX WARN: Code duplicated, block: B:161:0x061b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0634  */
    /* JADX WARN: Code duplicated, block: B:165:0x0639  */
    /* JADX WARN: Code duplicated, block: B:166:0x0650  */
    /* JADX WARN: Code duplicated, block: B:167:0x0667  */
    /* JADX WARN: Code duplicated, block: B:169:0x0672  */
    /* JADX WARN: Code duplicated, block: B:171:0x0677  */
    /* JADX WARN: Code duplicated, block: B:172:0x068c  */
    /* JADX WARN: Code duplicated, block: B:173:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:175:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:177:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:178:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:179:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:181:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:183:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:184:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:185:0x070a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0711  */
    /* JADX WARN: Code duplicated, block: B:189:0x0716  */
    /* JADX WARN: Code duplicated, block: B:190:0x072a  */
    /* JADX WARN: Code duplicated, block: B:191:0x073e  */
    /* JADX WARN: Code duplicated, block: B:196:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:198:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:201:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:202:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:205:0x07f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:208:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:211:0x0832  */
    /* JADX WARN: Code duplicated, block: B:212:0x0836  */
    /* JADX WARN: Code duplicated, block: B:215:0x0843  */
    /* JADX WARN: Code duplicated, block: B:217:0x0851  */
    /* JADX WARN: Code duplicated, block: B:220:0x085b  */
    /* JADX WARN: Code duplicated, block: B:222:0x0860  */
    /* JADX WARN: Code duplicated, block: B:224:0x08df  */
    /* JADX WARN: Code duplicated, block: B:227:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x009c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:65:0x012b  */
    /* JADX WARN: Code duplicated, block: B:66:0x012f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0144  */
    /* JADX WARN: Code duplicated, block: B:72:0x0155  */
    /* JADX WARN: Code duplicated, block: B:76:0x0186  */
    /* JADX WARN: Code duplicated, block: B:77:0x018a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0197  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0263  */
    /* JADX WARN: Code duplicated, block: B:94:0x0298  */
    /* JADX WARN: Code duplicated, block: B:95:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:96:0x0303  */
    /* JADX WARN: Code duplicated, block: B:99:0x0398  */
    /* JADX WARN: Instruction removed from duplicated block: B:110:0x03cd, please report this as an issue */
    public static final void h(kr.n user, int i11, fz.a onClick, fz.a onClickLike, fz.a aVar, l1.n nVar, int i12, int i13) {
        int i14;
        boolean z11;
        fz.a aVar2;
        x1 x1VarT;
        l1.g gVar;
        fz.a aVar3;
        Context context;
        boolean z12;
        Object objQ;
        z1.o oVar;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        y2.h hVar2;
        int i15;
        int iHashCode2;
        int i16;
        z1.o oVar2;
        l1.g gVar2;
        Context context2;
        y2.h hVar3;
        y2.i iVar2;
        l1.s sVar;
        c3 c3Var;
        int iHashCode3;
        c3 c3Var2;
        boolean z13;
        l1.s sVar2;
        boolean zG;
        Object objQ2;
        l1.g gVar3;
        int i17;
        l1.s sVar3;
        int iHashCode4;
        l1.s sVar4;
        boolean zE;
        Object objQ3;
        Date time;
        long time2;
        Context context3;
        String strY;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        fz.a aVar4;
        boolean z14;
        boolean z15;
        Object objQ4;
        int iHashCode5;
        int i18;
        boolean z16;
        Object objQ5;
        boolean z17;
        y2.i iVar3;
        y2.h hVar4;
        Object objQ6;
        kotlin.jvm.internal.m.f(user, "user");
        long j16 = user.f38537e;
        String str = user.f38534b;
        String str2 = user.f38535c;
        boolean z18 = user.f38542j;
        kotlin.jvm.internal.m.f(onClick, "onClick");
        kotlin.jvm.internal.m.f(onClickLike, "onClickLike");
        l1.s sVar5 = (l1.s) nVar;
        sVar5.f0(879626790);
        if ((i12 & 6) == 0) {
            i14 = (sVar5.f(user) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar5.d(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= sVar5.h(onClick) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= sVar5.h(onClickLike) ? 2048 : 1024;
        }
        int i19 = i13 & 16;
        if (i19 == 0) {
            if ((i12 & 24576) == 0) {
                i14 |= sVar5.h(aVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            if ((i14 & 9363) != 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar5.T(i14 & 1, z11)) {
                gVar = l1.m.f39353a;
                if (i19 != 0) {
                    objQ6 = sVar5.Q();
                    if (objQ6 == gVar) {
                        objQ6 = new ju.d(25);
                        sVar5.o0(objQ6);
                    }
                    aVar3 = (fz.a) objQ6;
                } else {
                    aVar3 = aVar;
                }
                context = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
                z1.i iVar4 = z1.c.M;
                if ((i14 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objQ = sVar5.Q();
                if (z12 || objQ == gVar) {
                    objQ = new et.p(26, onClick);
                    sVar5.o0(objQ);
                }
                oVar = z1.o.f58481a;
                float f5 = 16;
                z1.r rVarE = j0.c.E(e2.g(d0.n.o(oVar, false, null, (fz.a) objQ, 15), 70), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, 11);
                a2 a2VarA = z1.a(j0.i.f35303a, iVar4, sVar5, 48);
                iHashCode = Long.hashCode(sVar5.T);
                q1 q1VarL = sVar5.l();
                z1.r rVarC = z1.a.c(sVar5, rVarE);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(iVar);
                } else {
                    sVar5.r0();
                }
                y2.h hVar5 = y2.j.f56917f;
                l1.t.J(hVar5, a2VarA, sVar5);
                hVar = y2.j.f56916e;
                l1.t.J(hVar, q1VarL, sVar5);
                hVar2 = y2.j.f56918g;
                if (sVar5.S) {
                    i15 = i14;
                } else {
                    i15 = i14;
                    if (!kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode))) {
                    }
                    y2.h hVar6 = y2.j.f56915d;
                    l1.t.J(hVar6, rVarC, sVar5);
                    z1.r rVarS = e2.s(oVar, 52);
                    z1.j jVar = z1.c.f58467e;
                    q0 q0VarD = j0.o.d(jVar, false);
                    iHashCode2 = Long.hashCode(sVar5.T);
                    q1 q1VarL2 = sVar5.l();
                    z1.r rVarC2 = z1.a.c(sVar5, rVarS);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar5, q0VarD, sVar5);
                    l1.t.J(hVar, q1VarL2, sVar5);
                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar2);
                    }
                    l1.t.J(hVar6, rVarC2, sVar5);
                    i16 = i11 + 1;
                    if (i16 != 0) {
                        if (i16 != 1) {
                            iVar3 = iVar;
                            oVar2 = oVar;
                            gVar2 = gVar;
                            sVar5.d0(-167156550);
                            hVar4 = hVar;
                            d0.n.c(se.k.y(R.drawable.lb_top_user_medal_1, sVar5, 0), null, e2.s(oVar2, 29), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 440, 120);
                            sVar = sVar5;
                            sVar.p(false);
                        } else if (i16 != 2) {
                            iVar3 = iVar;
                            oVar2 = oVar;
                            gVar2 = gVar;
                            sVar5.d0(-167148326);
                            hVar4 = hVar;
                            d0.n.c(se.k.y(R.drawable.lb_top_user_medal_2, sVar5, 0), null, e2.s(oVar2, 29), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 440, 120);
                            sVar = sVar5;
                            sVar.p(false);
                        } else if (i16 != 3) {
                            sVar5.d0(-886113790);
                            iVar3 = iVar;
                            oVar2 = oVar;
                            hVar4 = hVar;
                            gVar2 = gVar;
                            ua.b(String.valueOf(i16), e2.s(oVar, 34), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(ua.f31167a), ((s1) sVar5.j(v1.f31180a)).f31017a, j3.A(14), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar5, 48, 0, 65532);
                            sVar = sVar5;
                            sVar.p(false);
                        } else {
                            iVar3 = iVar;
                            oVar2 = oVar;
                            gVar2 = gVar;
                            sVar5.d0(-167140102);
                            hVar4 = hVar;
                            d0.n.c(se.k.y(R.drawable.lb_top_user_medal_3, sVar5, 0), null, e2.s(oVar2, 29), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 440, 120);
                            sVar = sVar5;
                            sVar.p(false);
                        }
                        y2.i iVar5 = iVar3;
                        context2 = context;
                        hVar3 = hVar4;
                        iVar2 = iVar5;
                    } else {
                        oVar2 = oVar;
                        gVar2 = gVar;
                        sVar5.d0(-167167626);
                        context2 = context;
                        hVar3 = hVar;
                        iVar2 = iVar;
                        d0.n.c(se.k.y(R.drawable.ic_speak_leadboard_me, sVar5, 0), null, j0.c.A(e2.n(oVar2, 29), 5), null, w2.i.f54515b, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 25016, 104);
                        sVar = sVar5;
                        sVar.p(false);
                    }
                    sVar.p(true);
                    z1.r rVarN = e2.n(oVar2, 48);
                    c3Var = v1.f31180a;
                    long j17 = ((s1) sVar.j(c3Var)).f31017a;
                    r0.e eVar = r0.f.f48733a;
                    z1.r rVarB = d2.h.b(d0.n.h(rVarN, j17, eVar), eVar);
                    d0.v vVarA = d0.n.a(((s1) sVar.j(c3Var)).A, 2);
                    z1.r rVarK = d0.n.k(vVarA.f22811a, vVarA.f22812b, eVar, rVarB);
                    q0 q0VarD2 = j0.o.d(jVar, false);
                    iHashCode3 = Long.hashCode(sVar.T);
                    q1 q1VarL3 = sVar.l();
                    z1.r rVarC3 = z1.a.c(sVar, rVarK);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar5, q0VarD2, sVar);
                    l1.t.J(hVar3, q1VarL3, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar2);
                    }
                    l1.t.J(hVar6, rVarC3, sVar);
                    if (str2.length() > 0) {
                        sVar.d0(-413499690);
                        l1.s sVar6 = sVar;
                        c3Var2 = c3Var;
                        wb.k.b("https://lingodeer.oss-us-west-1.aliyuncs.com/uimage/" + str2, null, e2.d(oVar2, 1.0f), se.k.y(R.drawable.avatars_light, sVar6, 0), null, w2.i.f54514a, sVar6, 4528, 64496);
                        sVar2 = sVar6;
                        sVar2.p(false);
                    } else {
                        c3Var2 = c3Var;
                        sVar.d0(-413130852);
                        if (str.length() > 0) {
                            sVar.d0(-413095140);
                            l1.s sVar7 = sVar;
                            ua.b(String.valueOf(oz.q.C0(str)), null, 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), g2.x.f28618e, j3.A(24), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar7, 0, 0, 65022);
                            sVar2 = sVar7;
                            z13 = false;
                            sVar2.p(false);
                        } else {
                            z13 = false;
                            sVar.d0(-412774755);
                            l1.s sVar8 = sVar;
                            d0.n.c(se.k.y(R.drawable.avatars_light, sVar, 0), null, e2.d(oVar2, 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar8, 440, 120);
                            sVar2 = sVar8;
                            sVar2.p(false);
                        }
                        sVar2.p(z13);
                    }
                    zG = sVar2.g(z18);
                    objQ2 = sVar2.Q();
                    if (zG) {
                        gVar3 = gVar2;
                    } else {
                        gVar3 = gVar2;
                        if (objQ2 == gVar3) {
                        }
                        sVar3 = sVar2;
                        d0.n.c(se.k.y(((Number) objQ2).intValue(), sVar2, 0), null, e2.d(oVar2, 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 440, 120);
                        sVar3.p(true);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        z1.r rVarE2 = j0.c.E(new i1(1.0f, true), f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                        float f11 = 8;
                        j0.u uVarA = j0.t.a(j0.i.g(f11), z1.c.O, sVar3, 6);
                        iHashCode4 = Long.hashCode(sVar3.T);
                        q1 q1VarL4 = sVar3.l();
                        z1.r rVarC4 = z1.a.c(sVar3, rVarE2);
                        sVar3.h0();
                        z1.o oVar3 = oVar2;
                        if (sVar3.S) {
                            sVar3.k(iVar2);
                        } else {
                            sVar3.r0();
                        }
                        l1.t.J(hVar5, uVarA, sVar3);
                        l1.t.J(hVar3, q1VarL4, sVar3);
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode4))) {
                            defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar2);
                        }
                        l1.t.J(hVar6, rVarC4, sVar3);
                        ua.b(user.f38534b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                        sVar4 = sVar3;
                        if (user.f38541i) {
                            sVar4.d0(1591145271);
                            if (user.f38543k == 1.0f) {
                                sVar4.d0(1591298597);
                                z17 = false;
                                b(0, sVar4, null, z18);
                                sVar4.p(false);
                            } else {
                                sVar4.d0(1591192701);
                                if ((i15 & 14) == 4) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                objQ5 = sVar4.Q();
                                if (z16 || objQ5 == gVar3) {
                                    objQ5 = new hh.o(user, 18);
                                    sVar4.o0(objQ5);
                                }
                                g7.c((fz.a) objQ5, null, 0L, 0L, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 0, 126);
                                sVar4 = sVar4;
                                z17 = false;
                                sVar4.p(false);
                            }
                            sVar4.p(z17);
                        } else {
                            sVar4.d0(1591425883);
                            zE = sVar4.e(j16);
                            objQ3 = sVar4.Q();
                            if (zE || objQ3 == gVar3) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(j16);
                                time = calendar.getTime();
                                if (time == null) {
                                    strY = null;
                                } else {
                                    time2 = new Date().getTime() - time.getTime();
                                    if (time2 > 32140800000L) {
                                        j15 = time2 / 32140800000L;
                                        if (j15 > 1) {
                                            strY = String.format(ff.h.y(context2, R.string._years_ago), Long.valueOf(j15));
                                        } else {
                                            strY = String.format(ff.h.y(context2, R.string._year_ago), Long.valueOf(j15));
                                        }
                                    } else {
                                        context3 = context2;
                                        if (time2 > 2678400000L) {
                                            j14 = time2 / 2678400000L;
                                            if (j14 > 1) {
                                                strY = String.format(ff.h.y(context3, R.string._months_ago), Long.valueOf(j14));
                                            } else {
                                                strY = String.format(ff.h.y(context3, R.string._month_ago), Long.valueOf(j14));
                                            }
                                        } else if (time2 > 86400000) {
                                            j13 = time2 / 86400000;
                                            if (j13 > 1) {
                                                strY = String.format(ff.h.y(context3, R.string._days_ago), Long.valueOf(j13));
                                            } else {
                                                strY = String.format(ff.h.y(context3, R.string._day_ago), Long.valueOf(j13));
                                            }
                                        } else if (time2 > 3600000) {
                                            j12 = time2 / 3600000;
                                            if (j12 > 1) {
                                                strY = String.format(ff.h.y(context3, R.string._hours_ago), Long.valueOf(j12));
                                            } else {
                                                strY = String.format(ff.h.y(context3, R.string._hour_ago), Long.valueOf(j12));
                                            }
                                        } else if (time2 > 60000) {
                                            j11 = time2 / 60000;
                                            if (j11 > 1) {
                                                strY = String.format(ff.h.y(context3, R.string._minutes_ago), Long.valueOf(j11));
                                            } else {
                                                strY = String.format(ff.h.y(context3, R.string._minute_ago), Long.valueOf(j11));
                                            }
                                        } else {
                                            strY = ff.h.y(context3, R.string.just_now);
                                        }
                                    }
                                }
                                sVar4.o0(strY);
                                objQ3 = strY;
                            }
                            String str3 = (String) objQ3;
                            kotlin.jvm.internal.m.c(str3);
                            ua.b(str3, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(ua.f31167a), ((s1) sVar4.j(c3Var2)).f31036s, j3.A(12), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar4, 0, 0, 65534);
                            sVar4 = sVar4;
                            sVar4.p(false);
                        }
                        sVar4.p(true);
                        if (i11 == -1) {
                            sVar4.d0(1089245135);
                            l1.s sVar9 = sVar4;
                            fz.a aVar5 = aVar3;
                            k7.h(aVar5, null, false, null, f36567l, sVar9, ((i15 >> 12) & 14) | 196608, 30);
                            aVar4 = aVar5;
                            sVar4 = sVar9;
                            z14 = false;
                        } else {
                            aVar4 = aVar3;
                            z14 = false;
                            sVar4.d0(1070140920);
                        }
                        sVar4.p(z14);
                        j0.g gVarG = j0.i.g(f11);
                        z1.h hVar7 = z1.c.P;
                        if ((i15 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objQ4 = sVar4.Q();
                        if (z15 || objQ4 == gVar3) {
                            objQ4 = new et.p(29, onClickLike);
                            sVar4.o0(objQ4);
                        }
                        z1.r rVarQ = iu.k.q(6, 7, (fz.a) objQ4, sVar4, oVar3, false);
                        j0.u uVarA2 = j0.t.a(gVarG, hVar7, sVar4, 54);
                        iHashCode5 = Long.hashCode(sVar4.T);
                        q1 q1VarL5 = sVar4.l();
                        z1.r rVarC5 = z1.a.c(sVar4, rVarQ);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar2);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar5, uVarA2, sVar4);
                        l1.t.J(hVar3, q1VarL5, sVar4);
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode5))) {
                            defpackage.e.A(iHashCode5, sVar4, iHashCode5, hVar2);
                        }
                        l1.t.J(hVar6, rVarC5, sVar4);
                        if (user.f38540h) {
                            i18 = R.drawable.ic_speak_lb_up_liked;
                        } else {
                            i18 = R.drawable.ic_speak_lb_up;
                        }
                        l1.s sVar10 = sVar4;
                        d0.n.c(se.k.y(i18, sVar4, 0), null, e2.n(oVar3, f5), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar10, 440, 120);
                        ua.b(String.valueOf(user.f38539g), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar10.j(ua.f31167a), ((s1) sVar10.j(c3Var2)).f31036s, j3.A(12), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar10, 0, 0, 65534);
                        sVar5 = sVar10;
                        sVar5.p(true);
                        sVar5.p(true);
                        aVar2 = aVar4;
                    }
                    if (z18) {
                        i17 = R.drawable.ic_video_pause;
                    } else {
                        i17 = R.drawable.ic_video_play;
                    }
                    objQ2 = Integer.valueOf(i17);
                    sVar2.o0(objQ2);
                    sVar3 = sVar2;
                    d0.n.c(se.k.y(((Number) objQ2).intValue(), sVar2, 0), null, e2.d(oVar2, 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 440, 120);
                    sVar3.p(true);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    z1.r rVarE3 = j0.c.E(new i1(1.0f, true), f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                    float f12 = 8;
                    j0.u uVarA3 = j0.t.a(j0.i.g(f12), z1.c.O, sVar3, 6);
                    iHashCode4 = Long.hashCode(sVar3.T);
                    q1 q1VarL6 = sVar3.l();
                    z1.r rVarC6 = z1.a.c(sVar3, rVarE3);
                    sVar3.h0();
                    z1.o oVar4 = oVar2;
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(hVar5, uVarA3, sVar3);
                    l1.t.J(hVar3, q1VarL6, sVar3);
                    if (sVar3.S) {
                        defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar2);
                    } else {
                        defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar2);
                    }
                    l1.t.J(hVar6, rVarC6, sVar3);
                    ua.b(user.f38534b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                    sVar4 = sVar3;
                    if (user.f38541i) {
                        sVar4.d0(1591145271);
                        if (user.f38543k == 1.0f) {
                            sVar4.d0(1591298597);
                            z17 = false;
                            b(0, sVar4, null, z18);
                            sVar4.p(false);
                        } else {
                            sVar4.d0(1591192701);
                            if ((i15 & 14) == 4) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objQ5 = sVar4.Q();
                            if (z16) {
                                objQ5 = new hh.o(user, 18);
                                sVar4.o0(objQ5);
                            } else {
                                objQ5 = new hh.o(user, 18);
                                sVar4.o0(objQ5);
                            }
                            g7.c((fz.a) objQ5, null, 0L, 0L, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 0, 126);
                            sVar4 = sVar4;
                            z17 = false;
                            sVar4.p(false);
                        }
                        sVar4.p(z17);
                    } else {
                        sVar4.d0(1591425883);
                        zE = sVar4.e(j16);
                        objQ3 = sVar4.Q();
                        if (zE) {
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTimeInMillis(j16);
                            time = calendar2.getTime();
                            if (time == null) {
                                strY = null;
                            } else {
                                time2 = new Date().getTime() - time.getTime();
                                if (time2 > 32140800000L) {
                                    j15 = time2 / 32140800000L;
                                    if (j15 > 1) {
                                        strY = String.format(ff.h.y(context2, R.string._years_ago), Long.valueOf(j15));
                                    } else {
                                        strY = String.format(ff.h.y(context2, R.string._year_ago), Long.valueOf(j15));
                                    }
                                } else {
                                    context3 = context2;
                                    if (time2 > 2678400000L) {
                                        j14 = time2 / 2678400000L;
                                        if (j14 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._months_ago), Long.valueOf(j14));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._month_ago), Long.valueOf(j14));
                                        }
                                    } else if (time2 > 86400000) {
                                        j13 = time2 / 86400000;
                                        if (j13 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._days_ago), Long.valueOf(j13));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._day_ago), Long.valueOf(j13));
                                        }
                                    } else if (time2 > 3600000) {
                                        j12 = time2 / 3600000;
                                        if (j12 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._hours_ago), Long.valueOf(j12));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._hour_ago), Long.valueOf(j12));
                                        }
                                    } else if (time2 > 60000) {
                                        j11 = time2 / 60000;
                                        if (j11 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._minutes_ago), Long.valueOf(j11));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._minute_ago), Long.valueOf(j11));
                                        }
                                    } else {
                                        strY = ff.h.y(context3, R.string.just_now);
                                    }
                                }
                            }
                            sVar4.o0(strY);
                            objQ3 = strY;
                        } else {
                            Calendar calendar3 = Calendar.getInstance();
                            calendar3.setTimeInMillis(j16);
                            time = calendar3.getTime();
                            if (time == null) {
                                strY = null;
                            } else {
                                time2 = new Date().getTime() - time.getTime();
                                if (time2 > 32140800000L) {
                                    j15 = time2 / 32140800000L;
                                    if (j15 > 1) {
                                        strY = String.format(ff.h.y(context2, R.string._years_ago), Long.valueOf(j15));
                                    } else {
                                        strY = String.format(ff.h.y(context2, R.string._year_ago), Long.valueOf(j15));
                                    }
                                } else {
                                    context3 = context2;
                                    if (time2 > 2678400000L) {
                                        j14 = time2 / 2678400000L;
                                        if (j14 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._months_ago), Long.valueOf(j14));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._month_ago), Long.valueOf(j14));
                                        }
                                    } else if (time2 > 86400000) {
                                        j13 = time2 / 86400000;
                                        if (j13 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._days_ago), Long.valueOf(j13));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._day_ago), Long.valueOf(j13));
                                        }
                                    } else if (time2 > 3600000) {
                                        j12 = time2 / 3600000;
                                        if (j12 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._hours_ago), Long.valueOf(j12));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._hour_ago), Long.valueOf(j12));
                                        }
                                    } else if (time2 > 60000) {
                                        j11 = time2 / 60000;
                                        if (j11 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._minutes_ago), Long.valueOf(j11));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._minute_ago), Long.valueOf(j11));
                                        }
                                    } else {
                                        strY = ff.h.y(context3, R.string.just_now);
                                    }
                                }
                            }
                            sVar4.o0(strY);
                            objQ3 = strY;
                        }
                        String str4 = (String) objQ3;
                        kotlin.jvm.internal.m.c(str4);
                        ua.b(str4, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(ua.f31167a), ((s1) sVar4.j(c3Var2)).f31036s, j3.A(12), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar4, 0, 0, 65534);
                        sVar4 = sVar4;
                        sVar4.p(false);
                    }
                    sVar4.p(true);
                    if (i11 == -1) {
                        sVar4.d0(1089245135);
                        l1.s sVar11 = sVar4;
                        fz.a aVar6 = aVar3;
                        k7.h(aVar6, null, false, null, f36567l, sVar11, ((i15 >> 12) & 14) | 196608, 30);
                        aVar4 = aVar6;
                        sVar4 = sVar11;
                        z14 = false;
                    } else {
                        aVar4 = aVar3;
                        z14 = false;
                        sVar4.d0(1070140920);
                    }
                    sVar4.p(z14);
                    j0.g gVarG2 = j0.i.g(f12);
                    z1.h hVar8 = z1.c.P;
                    if ((i15 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objQ4 = sVar4.Q();
                    if (z15) {
                        objQ4 = new et.p(29, onClickLike);
                        sVar4.o0(objQ4);
                    } else {
                        objQ4 = new et.p(29, onClickLike);
                        sVar4.o0(objQ4);
                    }
                    z1.r rVarQ2 = iu.k.q(6, 7, (fz.a) objQ4, sVar4, oVar4, false);
                    j0.u uVarA4 = j0.t.a(gVarG2, hVar8, sVar4, 54);
                    iHashCode5 = Long.hashCode(sVar4.T);
                    q1 q1VarL7 = sVar4.l();
                    z1.r rVarC7 = z1.a.c(sVar4, rVarQ2);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(hVar5, uVarA4, sVar4);
                    l1.t.J(hVar3, q1VarL7, sVar4);
                    if (sVar4.S) {
                        defpackage.e.A(iHashCode5, sVar4, iHashCode5, hVar2);
                    } else {
                        defpackage.e.A(iHashCode5, sVar4, iHashCode5, hVar2);
                    }
                    l1.t.J(hVar6, rVarC7, sVar4);
                    if (user.f38540h) {
                        i18 = R.drawable.ic_speak_lb_up_liked;
                    } else {
                        i18 = R.drawable.ic_speak_lb_up;
                    }
                    l1.s sVar12 = sVar4;
                    d0.n.c(se.k.y(i18, sVar4, 0), null, e2.n(oVar4, f5), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar12, 440, 120);
                    ua.b(String.valueOf(user.f38539g), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar12.j(ua.f31167a), ((s1) sVar12.j(c3Var2)).f31036s, j3.A(12), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar12, 0, 0, 65534);
                    sVar5 = sVar12;
                    sVar5.p(true);
                    sVar5.p(true);
                    aVar2 = aVar4;
                }
                defpackage.e.A(iHashCode, sVar5, iHashCode, hVar2);
                y2.h hVar9 = y2.j.f56915d;
                l1.t.J(hVar9, rVarC, sVar5);
                z1.r rVarS2 = e2.s(oVar, 52);
                z1.j jVar2 = z1.c.f58467e;
                q0 q0VarD3 = j0.o.d(jVar2, false);
                iHashCode2 = Long.hashCode(sVar5.T);
                q1 q1VarL8 = sVar5.l();
                z1.r rVarC8 = z1.a.c(sVar5, rVarS2);
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(iVar);
                } else {
                    sVar5.r0();
                }
                l1.t.J(hVar5, q0VarD3, sVar5);
                l1.t.J(hVar, q1VarL8, sVar5);
                if (sVar5.S) {
                    defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar2);
                } else {
                    defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar2);
                }
                l1.t.J(hVar9, rVarC8, sVar5);
                i16 = i11 + 1;
                if (i16 != 0) {
                    if (i16 != 1) {
                        iVar3 = iVar;
                        oVar2 = oVar;
                        gVar2 = gVar;
                        sVar5.d0(-167156550);
                        hVar4 = hVar;
                        d0.n.c(se.k.y(R.drawable.lb_top_user_medal_1, sVar5, 0), null, e2.s(oVar2, 29), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 440, 120);
                        sVar = sVar5;
                        sVar.p(false);
                    } else if (i16 != 2) {
                        iVar3 = iVar;
                        oVar2 = oVar;
                        gVar2 = gVar;
                        sVar5.d0(-167148326);
                        hVar4 = hVar;
                        d0.n.c(se.k.y(R.drawable.lb_top_user_medal_2, sVar5, 0), null, e2.s(oVar2, 29), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 440, 120);
                        sVar = sVar5;
                        sVar.p(false);
                    } else if (i16 != 3) {
                        sVar5.d0(-886113790);
                        iVar3 = iVar;
                        oVar2 = oVar;
                        hVar4 = hVar;
                        gVar2 = gVar;
                        ua.b(String.valueOf(i16), e2.s(oVar, 34), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(ua.f31167a), ((s1) sVar5.j(v1.f31180a)).f31017a, j3.A(14), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar5, 48, 0, 65532);
                        sVar = sVar5;
                        sVar.p(false);
                    } else {
                        iVar3 = iVar;
                        oVar2 = oVar;
                        gVar2 = gVar;
                        sVar5.d0(-167140102);
                        hVar4 = hVar;
                        d0.n.c(se.k.y(R.drawable.lb_top_user_medal_3, sVar5, 0), null, e2.s(oVar2, 29), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 440, 120);
                        sVar = sVar5;
                        sVar.p(false);
                    }
                    y2.i iVar6 = iVar3;
                    context2 = context;
                    hVar3 = hVar4;
                    iVar2 = iVar6;
                } else {
                    oVar2 = oVar;
                    gVar2 = gVar;
                    sVar5.d0(-167167626);
                    context2 = context;
                    hVar3 = hVar;
                    iVar2 = iVar;
                    d0.n.c(se.k.y(R.drawable.ic_speak_leadboard_me, sVar5, 0), null, j0.c.A(e2.n(oVar2, 29), 5), null, w2.i.f54515b, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 25016, 104);
                    sVar = sVar5;
                    sVar.p(false);
                }
                sVar.p(true);
                z1.r rVarN2 = e2.n(oVar2, 48);
                c3Var = v1.f31180a;
                long j18 = ((s1) sVar.j(c3Var)).f31017a;
                r0.e eVar2 = r0.f.f48733a;
                z1.r rVarB2 = d2.h.b(d0.n.h(rVarN2, j18, eVar2), eVar2);
                d0.v vVarA2 = d0.n.a(((s1) sVar.j(c3Var)).A, 2);
                z1.r rVarK2 = d0.n.k(vVarA2.f22811a, vVarA2.f22812b, eVar2, rVarB2);
                q0 q0VarD4 = j0.o.d(jVar2, false);
                iHashCode3 = Long.hashCode(sVar.T);
                q1 q1VarL9 = sVar.l();
                z1.r rVarC9 = z1.a.c(sVar, rVarK2);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar5, q0VarD4, sVar);
                l1.t.J(hVar3, q1VarL9, sVar);
                if (sVar.S) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar2);
                } else {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar2);
                }
                l1.t.J(hVar9, rVarC9, sVar);
                if (str2.length() > 0) {
                    sVar.d0(-413499690);
                    l1.s sVar13 = sVar;
                    c3Var2 = c3Var;
                    wb.k.b("https://lingodeer.oss-us-west-1.aliyuncs.com/uimage/" + str2, null, e2.d(oVar2, 1.0f), se.k.y(R.drawable.avatars_light, sVar13, 0), null, w2.i.f54514a, sVar13, 4528, 64496);
                    sVar2 = sVar13;
                    sVar2.p(false);
                } else {
                    c3Var2 = c3Var;
                    sVar.d0(-413130852);
                    if (str.length() > 0) {
                        sVar.d0(-413095140);
                        l1.s sVar14 = sVar;
                        ua.b(String.valueOf(oz.q.C0(str)), null, 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), g2.x.f28618e, j3.A(24), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar14, 0, 0, 65022);
                        sVar2 = sVar14;
                        z13 = false;
                        sVar2.p(false);
                    } else {
                        z13 = false;
                        sVar.d0(-412774755);
                        l1.s sVar15 = sVar;
                        d0.n.c(se.k.y(R.drawable.avatars_light, sVar, 0), null, e2.d(oVar2, 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar15, 440, 120);
                        sVar2 = sVar15;
                        sVar2.p(false);
                    }
                    sVar2.p(z13);
                }
                zG = sVar2.g(z18);
                objQ2 = sVar2.Q();
                if (zG) {
                    gVar3 = gVar2;
                    if (objQ2 == gVar3) {
                    }
                    sVar3 = sVar2;
                    d0.n.c(se.k.y(((Number) objQ2).intValue(), sVar2, 0), null, e2.d(oVar2, 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 440, 120);
                    sVar3.p(true);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    z1.r rVarE4 = j0.c.E(new i1(1.0f, true), f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                    float f13 = 8;
                    j0.u uVarA5 = j0.t.a(j0.i.g(f13), z1.c.O, sVar3, 6);
                    iHashCode4 = Long.hashCode(sVar3.T);
                    q1 q1VarL10 = sVar3.l();
                    z1.r rVarC10 = z1.a.c(sVar3, rVarE4);
                    sVar3.h0();
                    z1.o oVar5 = oVar2;
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(hVar5, uVarA5, sVar3);
                    l1.t.J(hVar3, q1VarL10, sVar3);
                    if (sVar3.S) {
                        defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar2);
                    } else {
                        defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar2);
                    }
                    l1.t.J(hVar9, rVarC10, sVar3);
                    ua.b(user.f38534b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                    sVar4 = sVar3;
                    if (user.f38541i) {
                        sVar4.d0(1591145271);
                        if (user.f38543k == 1.0f) {
                            sVar4.d0(1591298597);
                            z17 = false;
                            b(0, sVar4, null, z18);
                            sVar4.p(false);
                        } else {
                            sVar4.d0(1591192701);
                            if ((i15 & 14) == 4) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objQ5 = sVar4.Q();
                            if (z16) {
                                objQ5 = new hh.o(user, 18);
                                sVar4.o0(objQ5);
                            } else {
                                objQ5 = new hh.o(user, 18);
                                sVar4.o0(objQ5);
                            }
                            g7.c((fz.a) objQ5, null, 0L, 0L, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 0, 126);
                            sVar4 = sVar4;
                            z17 = false;
                            sVar4.p(false);
                        }
                        sVar4.p(z17);
                    } else {
                        sVar4.d0(1591425883);
                        zE = sVar4.e(j16);
                        objQ3 = sVar4.Q();
                        if (zE) {
                            Calendar calendar4 = Calendar.getInstance();
                            calendar4.setTimeInMillis(j16);
                            time = calendar4.getTime();
                            if (time == null) {
                                strY = null;
                            } else {
                                time2 = new Date().getTime() - time.getTime();
                                if (time2 > 32140800000L) {
                                    j15 = time2 / 32140800000L;
                                    if (j15 > 1) {
                                        strY = String.format(ff.h.y(context2, R.string._years_ago), Long.valueOf(j15));
                                    } else {
                                        strY = String.format(ff.h.y(context2, R.string._year_ago), Long.valueOf(j15));
                                    }
                                } else {
                                    context3 = context2;
                                    if (time2 > 2678400000L) {
                                        j14 = time2 / 2678400000L;
                                        if (j14 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._months_ago), Long.valueOf(j14));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._month_ago), Long.valueOf(j14));
                                        }
                                    } else if (time2 > 86400000) {
                                        j13 = time2 / 86400000;
                                        if (j13 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._days_ago), Long.valueOf(j13));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._day_ago), Long.valueOf(j13));
                                        }
                                    } else if (time2 > 3600000) {
                                        j12 = time2 / 3600000;
                                        if (j12 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._hours_ago), Long.valueOf(j12));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._hour_ago), Long.valueOf(j12));
                                        }
                                    } else if (time2 > 60000) {
                                        j11 = time2 / 60000;
                                        if (j11 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._minutes_ago), Long.valueOf(j11));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._minute_ago), Long.valueOf(j11));
                                        }
                                    } else {
                                        strY = ff.h.y(context3, R.string.just_now);
                                    }
                                }
                            }
                            sVar4.o0(strY);
                            objQ3 = strY;
                        } else {
                            Calendar calendar5 = Calendar.getInstance();
                            calendar5.setTimeInMillis(j16);
                            time = calendar5.getTime();
                            if (time == null) {
                                strY = null;
                            } else {
                                time2 = new Date().getTime() - time.getTime();
                                if (time2 > 32140800000L) {
                                    j15 = time2 / 32140800000L;
                                    if (j15 > 1) {
                                        strY = String.format(ff.h.y(context2, R.string._years_ago), Long.valueOf(j15));
                                    } else {
                                        strY = String.format(ff.h.y(context2, R.string._year_ago), Long.valueOf(j15));
                                    }
                                } else {
                                    context3 = context2;
                                    if (time2 > 2678400000L) {
                                        j14 = time2 / 2678400000L;
                                        if (j14 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._months_ago), Long.valueOf(j14));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._month_ago), Long.valueOf(j14));
                                        }
                                    } else if (time2 > 86400000) {
                                        j13 = time2 / 86400000;
                                        if (j13 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._days_ago), Long.valueOf(j13));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._day_ago), Long.valueOf(j13));
                                        }
                                    } else if (time2 > 3600000) {
                                        j12 = time2 / 3600000;
                                        if (j12 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._hours_ago), Long.valueOf(j12));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._hour_ago), Long.valueOf(j12));
                                        }
                                    } else if (time2 > 60000) {
                                        j11 = time2 / 60000;
                                        if (j11 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._minutes_ago), Long.valueOf(j11));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._minute_ago), Long.valueOf(j11));
                                        }
                                    } else {
                                        strY = ff.h.y(context3, R.string.just_now);
                                    }
                                }
                            }
                            sVar4.o0(strY);
                            objQ3 = strY;
                        }
                        String str5 = (String) objQ3;
                        kotlin.jvm.internal.m.c(str5);
                        ua.b(str5, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(ua.f31167a), ((s1) sVar4.j(c3Var2)).f31036s, j3.A(12), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar4, 0, 0, 65534);
                        sVar4 = sVar4;
                        sVar4.p(false);
                    }
                    sVar4.p(true);
                    if (i11 == -1) {
                        sVar4.d0(1089245135);
                        l1.s sVar16 = sVar4;
                        fz.a aVar7 = aVar3;
                        k7.h(aVar7, null, false, null, f36567l, sVar16, ((i15 >> 12) & 14) | 196608, 30);
                        aVar4 = aVar7;
                        sVar4 = sVar16;
                        z14 = false;
                    } else {
                        aVar4 = aVar3;
                        z14 = false;
                        sVar4.d0(1070140920);
                    }
                    sVar4.p(z14);
                    j0.g gVarG3 = j0.i.g(f13);
                    z1.h hVar10 = z1.c.P;
                    if ((i15 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objQ4 = sVar4.Q();
                    if (z15) {
                        objQ4 = new et.p(29, onClickLike);
                        sVar4.o0(objQ4);
                    } else {
                        objQ4 = new et.p(29, onClickLike);
                        sVar4.o0(objQ4);
                    }
                    z1.r rVarQ3 = iu.k.q(6, 7, (fz.a) objQ4, sVar4, oVar5, false);
                    j0.u uVarA6 = j0.t.a(gVarG3, hVar10, sVar4, 54);
                    iHashCode5 = Long.hashCode(sVar4.T);
                    q1 q1VarL11 = sVar4.l();
                    z1.r rVarC11 = z1.a.c(sVar4, rVarQ3);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(hVar5, uVarA6, sVar4);
                    l1.t.J(hVar3, q1VarL11, sVar4);
                    if (sVar4.S) {
                        defpackage.e.A(iHashCode5, sVar4, iHashCode5, hVar2);
                    } else {
                        defpackage.e.A(iHashCode5, sVar4, iHashCode5, hVar2);
                    }
                    l1.t.J(hVar9, rVarC11, sVar4);
                    if (user.f38540h) {
                        i18 = R.drawable.ic_speak_lb_up_liked;
                    } else {
                        i18 = R.drawable.ic_speak_lb_up;
                    }
                    l1.s sVar17 = sVar4;
                    d0.n.c(se.k.y(i18, sVar4, 0), null, e2.n(oVar5, f5), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar17, 440, 120);
                    ua.b(String.valueOf(user.f38539g), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar17.j(ua.f31167a), ((s1) sVar17.j(c3Var2)).f31036s, j3.A(12), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar17, 0, 0, 65534);
                    sVar5 = sVar17;
                    sVar5.p(true);
                    sVar5.p(true);
                    aVar2 = aVar4;
                } else {
                    gVar3 = gVar2;
                }
                if (z18) {
                    i17 = R.drawable.ic_video_pause;
                } else {
                    i17 = R.drawable.ic_video_play;
                }
                objQ2 = Integer.valueOf(i17);
                sVar2.o0(objQ2);
                sVar3 = sVar2;
                d0.n.c(se.k.y(((Number) objQ2).intValue(), sVar2, 0), null, e2.d(oVar2, 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 440, 120);
                sVar3.p(true);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                z1.r rVarE5 = j0.c.E(new i1(1.0f, true), f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                float f14 = 8;
                j0.u uVarA7 = j0.t.a(j0.i.g(f14), z1.c.O, sVar3, 6);
                iHashCode4 = Long.hashCode(sVar3.T);
                q1 q1VarL12 = sVar3.l();
                z1.r rVarC12 = z1.a.c(sVar3, rVarE5);
                sVar3.h0();
                z1.o oVar6 = oVar2;
                if (sVar3.S) {
                    sVar3.k(iVar2);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar5, uVarA7, sVar3);
                l1.t.J(hVar3, q1VarL12, sVar3);
                if (sVar3.S) {
                    defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar2);
                } else {
                    defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar2);
                }
                l1.t.J(hVar9, rVarC12, sVar3);
                ua.b(user.f38534b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                sVar4 = sVar3;
                if (user.f38541i) {
                    sVar4.d0(1591145271);
                    if (user.f38543k == 1.0f) {
                        sVar4.d0(1591298597);
                        z17 = false;
                        b(0, sVar4, null, z18);
                        sVar4.p(false);
                    } else {
                        sVar4.d0(1591192701);
                        if ((i15 & 14) == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objQ5 = sVar4.Q();
                        if (z16) {
                            objQ5 = new hh.o(user, 18);
                            sVar4.o0(objQ5);
                        } else {
                            objQ5 = new hh.o(user, 18);
                            sVar4.o0(objQ5);
                        }
                        g7.c((fz.a) objQ5, null, 0L, 0L, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 0, 126);
                        sVar4 = sVar4;
                        z17 = false;
                        sVar4.p(false);
                    }
                    sVar4.p(z17);
                } else {
                    sVar4.d0(1591425883);
                    zE = sVar4.e(j16);
                    objQ3 = sVar4.Q();
                    if (zE) {
                        Calendar calendar6 = Calendar.getInstance();
                        calendar6.setTimeInMillis(j16);
                        time = calendar6.getTime();
                        if (time == null) {
                            strY = null;
                        } else {
                            time2 = new Date().getTime() - time.getTime();
                            if (time2 > 32140800000L) {
                                j15 = time2 / 32140800000L;
                                if (j15 > 1) {
                                    strY = String.format(ff.h.y(context2, R.string._years_ago), Long.valueOf(j15));
                                } else {
                                    strY = String.format(ff.h.y(context2, R.string._year_ago), Long.valueOf(j15));
                                }
                            } else {
                                context3 = context2;
                                if (time2 > 2678400000L) {
                                    j14 = time2 / 2678400000L;
                                    if (j14 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._months_ago), Long.valueOf(j14));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._month_ago), Long.valueOf(j14));
                                    }
                                } else if (time2 > 86400000) {
                                    j13 = time2 / 86400000;
                                    if (j13 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._days_ago), Long.valueOf(j13));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._day_ago), Long.valueOf(j13));
                                    }
                                } else if (time2 > 3600000) {
                                    j12 = time2 / 3600000;
                                    if (j12 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._hours_ago), Long.valueOf(j12));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._hour_ago), Long.valueOf(j12));
                                    }
                                } else if (time2 > 60000) {
                                    j11 = time2 / 60000;
                                    if (j11 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._minutes_ago), Long.valueOf(j11));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._minute_ago), Long.valueOf(j11));
                                    }
                                } else {
                                    strY = ff.h.y(context3, R.string.just_now);
                                }
                            }
                        }
                        sVar4.o0(strY);
                        objQ3 = strY;
                    } else {
                        Calendar calendar7 = Calendar.getInstance();
                        calendar7.setTimeInMillis(j16);
                        time = calendar7.getTime();
                        if (time == null) {
                            strY = null;
                        } else {
                            time2 = new Date().getTime() - time.getTime();
                            if (time2 > 32140800000L) {
                                j15 = time2 / 32140800000L;
                                if (j15 > 1) {
                                    strY = String.format(ff.h.y(context2, R.string._years_ago), Long.valueOf(j15));
                                } else {
                                    strY = String.format(ff.h.y(context2, R.string._year_ago), Long.valueOf(j15));
                                }
                            } else {
                                context3 = context2;
                                if (time2 > 2678400000L) {
                                    j14 = time2 / 2678400000L;
                                    if (j14 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._months_ago), Long.valueOf(j14));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._month_ago), Long.valueOf(j14));
                                    }
                                } else if (time2 > 86400000) {
                                    j13 = time2 / 86400000;
                                    if (j13 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._days_ago), Long.valueOf(j13));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._day_ago), Long.valueOf(j13));
                                    }
                                } else if (time2 > 3600000) {
                                    j12 = time2 / 3600000;
                                    if (j12 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._hours_ago), Long.valueOf(j12));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._hour_ago), Long.valueOf(j12));
                                    }
                                } else if (time2 > 60000) {
                                    j11 = time2 / 60000;
                                    if (j11 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._minutes_ago), Long.valueOf(j11));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._minute_ago), Long.valueOf(j11));
                                    }
                                } else {
                                    strY = ff.h.y(context3, R.string.just_now);
                                }
                            }
                        }
                        sVar4.o0(strY);
                        objQ3 = strY;
                    }
                    String str6 = (String) objQ3;
                    kotlin.jvm.internal.m.c(str6);
                    ua.b(str6, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(ua.f31167a), ((s1) sVar4.j(c3Var2)).f31036s, j3.A(12), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar4, 0, 0, 65534);
                    sVar4 = sVar4;
                    sVar4.p(false);
                }
                sVar4.p(true);
                if (i11 == -1) {
                    sVar4.d0(1089245135);
                    l1.s sVar18 = sVar4;
                    fz.a aVar8 = aVar3;
                    k7.h(aVar8, null, false, null, f36567l, sVar18, ((i15 >> 12) & 14) | 196608, 30);
                    aVar4 = aVar8;
                    sVar4 = sVar18;
                    z14 = false;
                } else {
                    aVar4 = aVar3;
                    z14 = false;
                    sVar4.d0(1070140920);
                }
                sVar4.p(z14);
                j0.g gVarG4 = j0.i.g(f14);
                z1.h hVar11 = z1.c.P;
                if ((i15 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ4 = sVar4.Q();
                if (z15) {
                    objQ4 = new et.p(29, onClickLike);
                    sVar4.o0(objQ4);
                } else {
                    objQ4 = new et.p(29, onClickLike);
                    sVar4.o0(objQ4);
                }
                z1.r rVarQ4 = iu.k.q(6, 7, (fz.a) objQ4, sVar4, oVar6, false);
                j0.u uVarA8 = j0.t.a(gVarG4, hVar11, sVar4, 54);
                iHashCode5 = Long.hashCode(sVar4.T);
                q1 q1VarL13 = sVar4.l();
                z1.r rVarC13 = z1.a.c(sVar4, rVarQ4);
                sVar4.h0();
                if (sVar4.S) {
                    sVar4.k(iVar2);
                } else {
                    sVar4.r0();
                }
                l1.t.J(hVar5, uVarA8, sVar4);
                l1.t.J(hVar3, q1VarL13, sVar4);
                if (sVar4.S) {
                    defpackage.e.A(iHashCode5, sVar4, iHashCode5, hVar2);
                } else {
                    defpackage.e.A(iHashCode5, sVar4, iHashCode5, hVar2);
                }
                l1.t.J(hVar9, rVarC13, sVar4);
                if (user.f38540h) {
                    i18 = R.drawable.ic_speak_lb_up_liked;
                } else {
                    i18 = R.drawable.ic_speak_lb_up;
                }
                l1.s sVar19 = sVar4;
                d0.n.c(se.k.y(i18, sVar4, 0), null, e2.n(oVar6, f5), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar19, 440, 120);
                ua.b(String.valueOf(user.f38539g), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar19.j(ua.f31167a), ((s1) sVar19.j(c3Var2)).f31036s, j3.A(12), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar19, 0, 0, 65534);
                sVar5 = sVar19;
                sVar5.p(true);
                sVar5.p(true);
                aVar2 = aVar4;
            } else {
                sVar5.W();
                aVar2 = aVar;
            }
            x1VarT = sVar5.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new k(user, i11, onClick, onClickLike, aVar2, i12, i13);
            }
        }
        i14 |= 24576;
        if ((i14 & 9363) != 9362) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar5.T(i14 & 1, z11)) {
            gVar = l1.m.f39353a;
            if (i19 != 0) {
                objQ6 = sVar5.Q();
                if (objQ6 == gVar) {
                    objQ6 = new ju.d(25);
                    sVar5.o0(objQ6);
                }
                aVar3 = (fz.a) objQ6;
            } else {
                aVar3 = aVar;
            }
            context = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
            z1.i iVar7 = z1.c.M;
            if ((i14 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            objQ = sVar5.Q();
            if (z12) {
                objQ = new et.p(26, onClick);
                sVar5.o0(objQ);
            } else {
                objQ = new et.p(26, onClick);
                sVar5.o0(objQ);
            }
            oVar = z1.o.f58481a;
            float f15 = 16;
            z1.r rVarE6 = j0.c.E(e2.g(d0.n.o(oVar, false, null, (fz.a) objQ, 15), 70), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f15, CropImageView.DEFAULT_ASPECT_RATIO, 11);
            a2 a2VarA2 = z1.a(j0.i.f35303a, iVar7, sVar5, 48);
            iHashCode = Long.hashCode(sVar5.T);
            q1 q1VarL14 = sVar5.l();
            z1.r rVarC14 = z1.a.c(sVar5, rVarE6);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar5.h0();
            if (sVar5.S) {
                sVar5.k(iVar);
            } else {
                sVar5.r0();
            }
            y2.h hVar12 = y2.j.f56917f;
            l1.t.J(hVar12, a2VarA2, sVar5);
            hVar = y2.j.f56916e;
            l1.t.J(hVar, q1VarL14, sVar5);
            hVar2 = y2.j.f56918g;
            if (sVar5.S) {
                i15 = i14;
                if (!kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode))) {
                }
                y2.h hVar13 = y2.j.f56915d;
                l1.t.J(hVar13, rVarC14, sVar5);
                z1.r rVarS3 = e2.s(oVar, 52);
                z1.j jVar3 = z1.c.f58467e;
                q0 q0VarD5 = j0.o.d(jVar3, false);
                iHashCode2 = Long.hashCode(sVar5.T);
                q1 q1VarL15 = sVar5.l();
                z1.r rVarC15 = z1.a.c(sVar5, rVarS3);
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(iVar);
                } else {
                    sVar5.r0();
                }
                l1.t.J(hVar12, q0VarD5, sVar5);
                l1.t.J(hVar, q1VarL15, sVar5);
                if (sVar5.S) {
                    defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar2);
                } else {
                    defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar2);
                }
                l1.t.J(hVar13, rVarC15, sVar5);
                i16 = i11 + 1;
                if (i16 != 0) {
                    if (i16 != 1) {
                        iVar3 = iVar;
                        oVar2 = oVar;
                        gVar2 = gVar;
                        sVar5.d0(-167156550);
                        hVar4 = hVar;
                        d0.n.c(se.k.y(R.drawable.lb_top_user_medal_1, sVar5, 0), null, e2.s(oVar2, 29), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 440, 120);
                        sVar = sVar5;
                        sVar.p(false);
                    } else if (i16 != 2) {
                        iVar3 = iVar;
                        oVar2 = oVar;
                        gVar2 = gVar;
                        sVar5.d0(-167148326);
                        hVar4 = hVar;
                        d0.n.c(se.k.y(R.drawable.lb_top_user_medal_2, sVar5, 0), null, e2.s(oVar2, 29), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 440, 120);
                        sVar = sVar5;
                        sVar.p(false);
                    } else if (i16 != 3) {
                        sVar5.d0(-886113790);
                        iVar3 = iVar;
                        oVar2 = oVar;
                        hVar4 = hVar;
                        gVar2 = gVar;
                        ua.b(String.valueOf(i16), e2.s(oVar, 34), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(ua.f31167a), ((s1) sVar5.j(v1.f31180a)).f31017a, j3.A(14), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar5, 48, 0, 65532);
                        sVar = sVar5;
                        sVar.p(false);
                    } else {
                        iVar3 = iVar;
                        oVar2 = oVar;
                        gVar2 = gVar;
                        sVar5.d0(-167140102);
                        hVar4 = hVar;
                        d0.n.c(se.k.y(R.drawable.lb_top_user_medal_3, sVar5, 0), null, e2.s(oVar2, 29), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 440, 120);
                        sVar = sVar5;
                        sVar.p(false);
                    }
                    y2.i iVar8 = iVar3;
                    context2 = context;
                    hVar3 = hVar4;
                    iVar2 = iVar8;
                } else {
                    oVar2 = oVar;
                    gVar2 = gVar;
                    sVar5.d0(-167167626);
                    context2 = context;
                    hVar3 = hVar;
                    iVar2 = iVar;
                    d0.n.c(se.k.y(R.drawable.ic_speak_leadboard_me, sVar5, 0), null, j0.c.A(e2.n(oVar2, 29), 5), null, w2.i.f54515b, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 25016, 104);
                    sVar = sVar5;
                    sVar.p(false);
                }
                sVar.p(true);
                z1.r rVarN3 = e2.n(oVar2, 48);
                c3Var = v1.f31180a;
                long j19 = ((s1) sVar.j(c3Var)).f31017a;
                r0.e eVar3 = r0.f.f48733a;
                z1.r rVarB3 = d2.h.b(d0.n.h(rVarN3, j19, eVar3), eVar3);
                d0.v vVarA3 = d0.n.a(((s1) sVar.j(c3Var)).A, 2);
                z1.r rVarK3 = d0.n.k(vVarA3.f22811a, vVarA3.f22812b, eVar3, rVarB3);
                q0 q0VarD6 = j0.o.d(jVar3, false);
                iHashCode3 = Long.hashCode(sVar.T);
                q1 q1VarL16 = sVar.l();
                z1.r rVarC16 = z1.a.c(sVar, rVarK3);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar12, q0VarD6, sVar);
                l1.t.J(hVar3, q1VarL16, sVar);
                if (sVar.S) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar2);
                } else {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar2);
                }
                l1.t.J(hVar13, rVarC16, sVar);
                if (str2.length() > 0) {
                    sVar.d0(-413499690);
                    l1.s sVar110 = sVar;
                    c3Var2 = c3Var;
                    wb.k.b("https://lingodeer.oss-us-west-1.aliyuncs.com/uimage/" + str2, null, e2.d(oVar2, 1.0f), se.k.y(R.drawable.avatars_light, sVar110, 0), null, w2.i.f54514a, sVar110, 4528, 64496);
                    sVar2 = sVar110;
                    sVar2.p(false);
                } else {
                    c3Var2 = c3Var;
                    sVar.d0(-413130852);
                    if (str.length() > 0) {
                        sVar.d0(-413095140);
                        l1.s sVar111 = sVar;
                        ua.b(String.valueOf(oz.q.C0(str)), null, 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), g2.x.f28618e, j3.A(24), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar111, 0, 0, 65022);
                        sVar2 = sVar111;
                        z13 = false;
                        sVar2.p(false);
                    } else {
                        z13 = false;
                        sVar.d0(-412774755);
                        l1.s sVar112 = sVar;
                        d0.n.c(se.k.y(R.drawable.avatars_light, sVar, 0), null, e2.d(oVar2, 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar112, 440, 120);
                        sVar2 = sVar112;
                        sVar2.p(false);
                    }
                    sVar2.p(z13);
                }
                zG = sVar2.g(z18);
                objQ2 = sVar2.Q();
                if (zG) {
                    gVar3 = gVar2;
                    if (objQ2 == gVar3) {
                    }
                    sVar3 = sVar2;
                    d0.n.c(se.k.y(((Number) objQ2).intValue(), sVar2, 0), null, e2.d(oVar2, 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 440, 120);
                    sVar3.p(true);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    z1.r rVarE7 = j0.c.E(new i1(1.0f, true), f15, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                    float f16 = 8;
                    j0.u uVarA9 = j0.t.a(j0.i.g(f16), z1.c.O, sVar3, 6);
                    iHashCode4 = Long.hashCode(sVar3.T);
                    q1 q1VarL17 = sVar3.l();
                    z1.r rVarC17 = z1.a.c(sVar3, rVarE7);
                    sVar3.h0();
                    z1.o oVar7 = oVar2;
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(hVar12, uVarA9, sVar3);
                    l1.t.J(hVar3, q1VarL17, sVar3);
                    if (sVar3.S) {
                        defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar2);
                    } else {
                        defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar2);
                    }
                    l1.t.J(hVar13, rVarC17, sVar3);
                    ua.b(user.f38534b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                    sVar4 = sVar3;
                    if (user.f38541i) {
                        sVar4.d0(1591145271);
                        if (user.f38543k == 1.0f) {
                            sVar4.d0(1591298597);
                            z17 = false;
                            b(0, sVar4, null, z18);
                            sVar4.p(false);
                        } else {
                            sVar4.d0(1591192701);
                            if ((i15 & 14) == 4) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objQ5 = sVar4.Q();
                            if (z16) {
                                objQ5 = new hh.o(user, 18);
                                sVar4.o0(objQ5);
                            } else {
                                objQ5 = new hh.o(user, 18);
                                sVar4.o0(objQ5);
                            }
                            g7.c((fz.a) objQ5, null, 0L, 0L, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 0, 126);
                            sVar4 = sVar4;
                            z17 = false;
                            sVar4.p(false);
                        }
                        sVar4.p(z17);
                    } else {
                        sVar4.d0(1591425883);
                        zE = sVar4.e(j16);
                        objQ3 = sVar4.Q();
                        if (zE) {
                            Calendar calendar8 = Calendar.getInstance();
                            calendar8.setTimeInMillis(j16);
                            time = calendar8.getTime();
                            if (time == null) {
                                strY = null;
                            } else {
                                time2 = new Date().getTime() - time.getTime();
                                if (time2 > 32140800000L) {
                                    j15 = time2 / 32140800000L;
                                    if (j15 > 1) {
                                        strY = String.format(ff.h.y(context2, R.string._years_ago), Long.valueOf(j15));
                                    } else {
                                        strY = String.format(ff.h.y(context2, R.string._year_ago), Long.valueOf(j15));
                                    }
                                } else {
                                    context3 = context2;
                                    if (time2 > 2678400000L) {
                                        j14 = time2 / 2678400000L;
                                        if (j14 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._months_ago), Long.valueOf(j14));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._month_ago), Long.valueOf(j14));
                                        }
                                    } else if (time2 > 86400000) {
                                        j13 = time2 / 86400000;
                                        if (j13 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._days_ago), Long.valueOf(j13));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._day_ago), Long.valueOf(j13));
                                        }
                                    } else if (time2 > 3600000) {
                                        j12 = time2 / 3600000;
                                        if (j12 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._hours_ago), Long.valueOf(j12));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._hour_ago), Long.valueOf(j12));
                                        }
                                    } else if (time2 > 60000) {
                                        j11 = time2 / 60000;
                                        if (j11 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._minutes_ago), Long.valueOf(j11));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._minute_ago), Long.valueOf(j11));
                                        }
                                    } else {
                                        strY = ff.h.y(context3, R.string.just_now);
                                    }
                                }
                            }
                            sVar4.o0(strY);
                            objQ3 = strY;
                        } else {
                            Calendar calendar9 = Calendar.getInstance();
                            calendar9.setTimeInMillis(j16);
                            time = calendar9.getTime();
                            if (time == null) {
                                strY = null;
                            } else {
                                time2 = new Date().getTime() - time.getTime();
                                if (time2 > 32140800000L) {
                                    j15 = time2 / 32140800000L;
                                    if (j15 > 1) {
                                        strY = String.format(ff.h.y(context2, R.string._years_ago), Long.valueOf(j15));
                                    } else {
                                        strY = String.format(ff.h.y(context2, R.string._year_ago), Long.valueOf(j15));
                                    }
                                } else {
                                    context3 = context2;
                                    if (time2 > 2678400000L) {
                                        j14 = time2 / 2678400000L;
                                        if (j14 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._months_ago), Long.valueOf(j14));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._month_ago), Long.valueOf(j14));
                                        }
                                    } else if (time2 > 86400000) {
                                        j13 = time2 / 86400000;
                                        if (j13 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._days_ago), Long.valueOf(j13));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._day_ago), Long.valueOf(j13));
                                        }
                                    } else if (time2 > 3600000) {
                                        j12 = time2 / 3600000;
                                        if (j12 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._hours_ago), Long.valueOf(j12));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._hour_ago), Long.valueOf(j12));
                                        }
                                    } else if (time2 > 60000) {
                                        j11 = time2 / 60000;
                                        if (j11 > 1) {
                                            strY = String.format(ff.h.y(context3, R.string._minutes_ago), Long.valueOf(j11));
                                        } else {
                                            strY = String.format(ff.h.y(context3, R.string._minute_ago), Long.valueOf(j11));
                                        }
                                    } else {
                                        strY = ff.h.y(context3, R.string.just_now);
                                    }
                                }
                            }
                            sVar4.o0(strY);
                            objQ3 = strY;
                        }
                        String str7 = (String) objQ3;
                        kotlin.jvm.internal.m.c(str7);
                        ua.b(str7, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(ua.f31167a), ((s1) sVar4.j(c3Var2)).f31036s, j3.A(12), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar4, 0, 0, 65534);
                        sVar4 = sVar4;
                        sVar4.p(false);
                    }
                    sVar4.p(true);
                    if (i11 == -1) {
                        sVar4.d0(1089245135);
                        l1.s sVar113 = sVar4;
                        fz.a aVar9 = aVar3;
                        k7.h(aVar9, null, false, null, f36567l, sVar113, ((i15 >> 12) & 14) | 196608, 30);
                        aVar4 = aVar9;
                        sVar4 = sVar113;
                        z14 = false;
                    } else {
                        aVar4 = aVar3;
                        z14 = false;
                        sVar4.d0(1070140920);
                    }
                    sVar4.p(z14);
                    j0.g gVarG5 = j0.i.g(f16);
                    z1.h hVar14 = z1.c.P;
                    if ((i15 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objQ4 = sVar4.Q();
                    if (z15) {
                        objQ4 = new et.p(29, onClickLike);
                        sVar4.o0(objQ4);
                    } else {
                        objQ4 = new et.p(29, onClickLike);
                        sVar4.o0(objQ4);
                    }
                    z1.r rVarQ5 = iu.k.q(6, 7, (fz.a) objQ4, sVar4, oVar7, false);
                    j0.u uVarA10 = j0.t.a(gVarG5, hVar14, sVar4, 54);
                    iHashCode5 = Long.hashCode(sVar4.T);
                    q1 q1VarL18 = sVar4.l();
                    z1.r rVarC18 = z1.a.c(sVar4, rVarQ5);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(hVar12, uVarA10, sVar4);
                    l1.t.J(hVar3, q1VarL18, sVar4);
                    if (sVar4.S) {
                        defpackage.e.A(iHashCode5, sVar4, iHashCode5, hVar2);
                    } else {
                        defpackage.e.A(iHashCode5, sVar4, iHashCode5, hVar2);
                    }
                    l1.t.J(hVar13, rVarC18, sVar4);
                    if (user.f38540h) {
                        i18 = R.drawable.ic_speak_lb_up_liked;
                    } else {
                        i18 = R.drawable.ic_speak_lb_up;
                    }
                    l1.s sVar114 = sVar4;
                    d0.n.c(se.k.y(i18, sVar4, 0), null, e2.n(oVar7, f15), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar114, 440, 120);
                    ua.b(String.valueOf(user.f38539g), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar114.j(ua.f31167a), ((s1) sVar114.j(c3Var2)).f31036s, j3.A(12), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar114, 0, 0, 65534);
                    sVar5 = sVar114;
                    sVar5.p(true);
                    sVar5.p(true);
                    aVar2 = aVar4;
                } else {
                    gVar3 = gVar2;
                }
                if (z18) {
                    i17 = R.drawable.ic_video_pause;
                } else {
                    i17 = R.drawable.ic_video_play;
                }
                objQ2 = Integer.valueOf(i17);
                sVar2.o0(objQ2);
                sVar3 = sVar2;
                d0.n.c(se.k.y(((Number) objQ2).intValue(), sVar2, 0), null, e2.d(oVar2, 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 440, 120);
                sVar3.p(true);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                z1.r rVarE8 = j0.c.E(new i1(1.0f, true), f15, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                float f17 = 8;
                j0.u uVarA11 = j0.t.a(j0.i.g(f17), z1.c.O, sVar3, 6);
                iHashCode4 = Long.hashCode(sVar3.T);
                q1 q1VarL19 = sVar3.l();
                z1.r rVarC19 = z1.a.c(sVar3, rVarE8);
                sVar3.h0();
                z1.o oVar8 = oVar2;
                if (sVar3.S) {
                    sVar3.k(iVar2);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar12, uVarA11, sVar3);
                l1.t.J(hVar3, q1VarL19, sVar3);
                if (sVar3.S) {
                    defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar2);
                } else {
                    defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar2);
                }
                l1.t.J(hVar13, rVarC19, sVar3);
                ua.b(user.f38534b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                sVar4 = sVar3;
                if (user.f38541i) {
                    sVar4.d0(1591145271);
                    if (user.f38543k == 1.0f) {
                        sVar4.d0(1591298597);
                        z17 = false;
                        b(0, sVar4, null, z18);
                        sVar4.p(false);
                    } else {
                        sVar4.d0(1591192701);
                        if ((i15 & 14) == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objQ5 = sVar4.Q();
                        if (z16) {
                            objQ5 = new hh.o(user, 18);
                            sVar4.o0(objQ5);
                        } else {
                            objQ5 = new hh.o(user, 18);
                            sVar4.o0(objQ5);
                        }
                        g7.c((fz.a) objQ5, null, 0L, 0L, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 0, 126);
                        sVar4 = sVar4;
                        z17 = false;
                        sVar4.p(false);
                    }
                    sVar4.p(z17);
                } else {
                    sVar4.d0(1591425883);
                    zE = sVar4.e(j16);
                    objQ3 = sVar4.Q();
                    if (zE) {
                        Calendar calendar10 = Calendar.getInstance();
                        calendar10.setTimeInMillis(j16);
                        time = calendar10.getTime();
                        if (time == null) {
                            strY = null;
                        } else {
                            time2 = new Date().getTime() - time.getTime();
                            if (time2 > 32140800000L) {
                                j15 = time2 / 32140800000L;
                                if (j15 > 1) {
                                    strY = String.format(ff.h.y(context2, R.string._years_ago), Long.valueOf(j15));
                                } else {
                                    strY = String.format(ff.h.y(context2, R.string._year_ago), Long.valueOf(j15));
                                }
                            } else {
                                context3 = context2;
                                if (time2 > 2678400000L) {
                                    j14 = time2 / 2678400000L;
                                    if (j14 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._months_ago), Long.valueOf(j14));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._month_ago), Long.valueOf(j14));
                                    }
                                } else if (time2 > 86400000) {
                                    j13 = time2 / 86400000;
                                    if (j13 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._days_ago), Long.valueOf(j13));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._day_ago), Long.valueOf(j13));
                                    }
                                } else if (time2 > 3600000) {
                                    j12 = time2 / 3600000;
                                    if (j12 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._hours_ago), Long.valueOf(j12));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._hour_ago), Long.valueOf(j12));
                                    }
                                } else if (time2 > 60000) {
                                    j11 = time2 / 60000;
                                    if (j11 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._minutes_ago), Long.valueOf(j11));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._minute_ago), Long.valueOf(j11));
                                    }
                                } else {
                                    strY = ff.h.y(context3, R.string.just_now);
                                }
                            }
                        }
                        sVar4.o0(strY);
                        objQ3 = strY;
                    } else {
                        Calendar calendar11 = Calendar.getInstance();
                        calendar11.setTimeInMillis(j16);
                        time = calendar11.getTime();
                        if (time == null) {
                            strY = null;
                        } else {
                            time2 = new Date().getTime() - time.getTime();
                            if (time2 > 32140800000L) {
                                j15 = time2 / 32140800000L;
                                if (j15 > 1) {
                                    strY = String.format(ff.h.y(context2, R.string._years_ago), Long.valueOf(j15));
                                } else {
                                    strY = String.format(ff.h.y(context2, R.string._year_ago), Long.valueOf(j15));
                                }
                            } else {
                                context3 = context2;
                                if (time2 > 2678400000L) {
                                    j14 = time2 / 2678400000L;
                                    if (j14 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._months_ago), Long.valueOf(j14));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._month_ago), Long.valueOf(j14));
                                    }
                                } else if (time2 > 86400000) {
                                    j13 = time2 / 86400000;
                                    if (j13 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._days_ago), Long.valueOf(j13));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._day_ago), Long.valueOf(j13));
                                    }
                                } else if (time2 > 3600000) {
                                    j12 = time2 / 3600000;
                                    if (j12 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._hours_ago), Long.valueOf(j12));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._hour_ago), Long.valueOf(j12));
                                    }
                                } else if (time2 > 60000) {
                                    j11 = time2 / 60000;
                                    if (j11 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._minutes_ago), Long.valueOf(j11));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._minute_ago), Long.valueOf(j11));
                                    }
                                } else {
                                    strY = ff.h.y(context3, R.string.just_now);
                                }
                            }
                        }
                        sVar4.o0(strY);
                        objQ3 = strY;
                    }
                    String str8 = (String) objQ3;
                    kotlin.jvm.internal.m.c(str8);
                    ua.b(str8, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(ua.f31167a), ((s1) sVar4.j(c3Var2)).f31036s, j3.A(12), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar4, 0, 0, 65534);
                    sVar4 = sVar4;
                    sVar4.p(false);
                }
                sVar4.p(true);
                if (i11 == -1) {
                    sVar4.d0(1089245135);
                    l1.s sVar115 = sVar4;
                    fz.a aVar10 = aVar3;
                    k7.h(aVar10, null, false, null, f36567l, sVar115, ((i15 >> 12) & 14) | 196608, 30);
                    aVar4 = aVar10;
                    sVar4 = sVar115;
                    z14 = false;
                } else {
                    aVar4 = aVar3;
                    z14 = false;
                    sVar4.d0(1070140920);
                }
                sVar4.p(z14);
                j0.g gVarG6 = j0.i.g(f17);
                z1.h hVar15 = z1.c.P;
                if ((i15 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ4 = sVar4.Q();
                if (z15) {
                    objQ4 = new et.p(29, onClickLike);
                    sVar4.o0(objQ4);
                } else {
                    objQ4 = new et.p(29, onClickLike);
                    sVar4.o0(objQ4);
                }
                z1.r rVarQ6 = iu.k.q(6, 7, (fz.a) objQ4, sVar4, oVar8, false);
                j0.u uVarA12 = j0.t.a(gVarG6, hVar15, sVar4, 54);
                iHashCode5 = Long.hashCode(sVar4.T);
                q1 q1VarL110 = sVar4.l();
                z1.r rVarC110 = z1.a.c(sVar4, rVarQ6);
                sVar4.h0();
                if (sVar4.S) {
                    sVar4.k(iVar2);
                } else {
                    sVar4.r0();
                }
                l1.t.J(hVar12, uVarA12, sVar4);
                l1.t.J(hVar3, q1VarL110, sVar4);
                if (sVar4.S) {
                    defpackage.e.A(iHashCode5, sVar4, iHashCode5, hVar2);
                } else {
                    defpackage.e.A(iHashCode5, sVar4, iHashCode5, hVar2);
                }
                l1.t.J(hVar13, rVarC110, sVar4);
                if (user.f38540h) {
                    i18 = R.drawable.ic_speak_lb_up_liked;
                } else {
                    i18 = R.drawable.ic_speak_lb_up;
                }
                l1.s sVar116 = sVar4;
                d0.n.c(se.k.y(i18, sVar4, 0), null, e2.n(oVar8, f15), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar116, 440, 120);
                ua.b(String.valueOf(user.f38539g), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar116.j(ua.f31167a), ((s1) sVar116.j(c3Var2)).f31036s, j3.A(12), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar116, 0, 0, 65534);
                sVar5 = sVar116;
                sVar5.p(true);
                sVar5.p(true);
                aVar2 = aVar4;
            } else {
                i15 = i14;
            }
            defpackage.e.A(iHashCode, sVar5, iHashCode, hVar2);
            y2.h hVar16 = y2.j.f56915d;
            l1.t.J(hVar16, rVarC14, sVar5);
            z1.r rVarS4 = e2.s(oVar, 52);
            z1.j jVar4 = z1.c.f58467e;
            q0 q0VarD7 = j0.o.d(jVar4, false);
            iHashCode2 = Long.hashCode(sVar5.T);
            q1 q1VarL111 = sVar5.l();
            z1.r rVarC111 = z1.a.c(sVar5, rVarS4);
            sVar5.h0();
            if (sVar5.S) {
                sVar5.k(iVar);
            } else {
                sVar5.r0();
            }
            l1.t.J(hVar12, q0VarD7, sVar5);
            l1.t.J(hVar, q1VarL111, sVar5);
            if (sVar5.S) {
                defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar2);
            } else {
                defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar2);
            }
            l1.t.J(hVar16, rVarC111, sVar5);
            i16 = i11 + 1;
            if (i16 != 0) {
                if (i16 != 1) {
                    iVar3 = iVar;
                    oVar2 = oVar;
                    gVar2 = gVar;
                    sVar5.d0(-167156550);
                    hVar4 = hVar;
                    d0.n.c(se.k.y(R.drawable.lb_top_user_medal_1, sVar5, 0), null, e2.s(oVar2, 29), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 440, 120);
                    sVar = sVar5;
                    sVar.p(false);
                } else if (i16 != 2) {
                    iVar3 = iVar;
                    oVar2 = oVar;
                    gVar2 = gVar;
                    sVar5.d0(-167148326);
                    hVar4 = hVar;
                    d0.n.c(se.k.y(R.drawable.lb_top_user_medal_2, sVar5, 0), null, e2.s(oVar2, 29), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 440, 120);
                    sVar = sVar5;
                    sVar.p(false);
                } else if (i16 != 3) {
                    sVar5.d0(-886113790);
                    iVar3 = iVar;
                    oVar2 = oVar;
                    hVar4 = hVar;
                    gVar2 = gVar;
                    ua.b(String.valueOf(i16), e2.s(oVar, 34), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(ua.f31167a), ((s1) sVar5.j(v1.f31180a)).f31017a, j3.A(14), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar5, 48, 0, 65532);
                    sVar = sVar5;
                    sVar.p(false);
                } else {
                    iVar3 = iVar;
                    oVar2 = oVar;
                    gVar2 = gVar;
                    sVar5.d0(-167140102);
                    hVar4 = hVar;
                    d0.n.c(se.k.y(R.drawable.lb_top_user_medal_3, sVar5, 0), null, e2.s(oVar2, 29), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 440, 120);
                    sVar = sVar5;
                    sVar.p(false);
                }
                y2.i iVar9 = iVar3;
                context2 = context;
                hVar3 = hVar4;
                iVar2 = iVar9;
            } else {
                oVar2 = oVar;
                gVar2 = gVar;
                sVar5.d0(-167167626);
                context2 = context;
                hVar3 = hVar;
                iVar2 = iVar;
                d0.n.c(se.k.y(R.drawable.ic_speak_leadboard_me, sVar5, 0), null, j0.c.A(e2.n(oVar2, 29), 5), null, w2.i.f54515b, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 25016, 104);
                sVar = sVar5;
                sVar.p(false);
            }
            sVar.p(true);
            z1.r rVarN4 = e2.n(oVar2, 48);
            c3Var = v1.f31180a;
            long j110 = ((s1) sVar.j(c3Var)).f31017a;
            r0.e eVar4 = r0.f.f48733a;
            z1.r rVarB4 = d2.h.b(d0.n.h(rVarN4, j110, eVar4), eVar4);
            d0.v vVarA4 = d0.n.a(((s1) sVar.j(c3Var)).A, 2);
            z1.r rVarK4 = d0.n.k(vVarA4.f22811a, vVarA4.f22812b, eVar4, rVarB4);
            q0 q0VarD8 = j0.o.d(jVar4, false);
            iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL112 = sVar.l();
            z1.r rVarC112 = z1.a.c(sVar, rVarK4);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar12, q0VarD8, sVar);
            l1.t.J(hVar3, q1VarL112, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar2);
            } else {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar2);
            }
            l1.t.J(hVar16, rVarC112, sVar);
            if (str2.length() > 0) {
                sVar.d0(-413499690);
                l1.s sVar117 = sVar;
                c3Var2 = c3Var;
                wb.k.b("https://lingodeer.oss-us-west-1.aliyuncs.com/uimage/" + str2, null, e2.d(oVar2, 1.0f), se.k.y(R.drawable.avatars_light, sVar117, 0), null, w2.i.f54514a, sVar117, 4528, 64496);
                sVar2 = sVar117;
                sVar2.p(false);
            } else {
                c3Var2 = c3Var;
                sVar.d0(-413130852);
                if (str.length() > 0) {
                    sVar.d0(-413095140);
                    l1.s sVar118 = sVar;
                    ua.b(String.valueOf(oz.q.C0(str)), null, 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), g2.x.f28618e, j3.A(24), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar118, 0, 0, 65022);
                    sVar2 = sVar118;
                    z13 = false;
                    sVar2.p(false);
                } else {
                    z13 = false;
                    sVar.d0(-412774755);
                    l1.s sVar119 = sVar;
                    d0.n.c(se.k.y(R.drawable.avatars_light, sVar, 0), null, e2.d(oVar2, 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar119, 440, 120);
                    sVar2 = sVar119;
                    sVar2.p(false);
                }
                sVar2.p(z13);
            }
            zG = sVar2.g(z18);
            objQ2 = sVar2.Q();
            if (zG) {
                gVar3 = gVar2;
                if (objQ2 == gVar3) {
                }
                sVar3 = sVar2;
                d0.n.c(se.k.y(((Number) objQ2).intValue(), sVar2, 0), null, e2.d(oVar2, 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 440, 120);
                sVar3.p(true);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                z1.r rVarE9 = j0.c.E(new i1(1.0f, true), f15, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                float f18 = 8;
                j0.u uVarA13 = j0.t.a(j0.i.g(f18), z1.c.O, sVar3, 6);
                iHashCode4 = Long.hashCode(sVar3.T);
                q1 q1VarL113 = sVar3.l();
                z1.r rVarC113 = z1.a.c(sVar3, rVarE9);
                sVar3.h0();
                z1.o oVar9 = oVar2;
                if (sVar3.S) {
                    sVar3.k(iVar2);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar12, uVarA13, sVar3);
                l1.t.J(hVar3, q1VarL113, sVar3);
                if (sVar3.S) {
                    defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar2);
                } else {
                    defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar2);
                }
                l1.t.J(hVar16, rVarC113, sVar3);
                ua.b(user.f38534b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                sVar4 = sVar3;
                if (user.f38541i) {
                    sVar4.d0(1591145271);
                    if (user.f38543k == 1.0f) {
                        sVar4.d0(1591298597);
                        z17 = false;
                        b(0, sVar4, null, z18);
                        sVar4.p(false);
                    } else {
                        sVar4.d0(1591192701);
                        if ((i15 & 14) == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objQ5 = sVar4.Q();
                        if (z16) {
                            objQ5 = new hh.o(user, 18);
                            sVar4.o0(objQ5);
                        } else {
                            objQ5 = new hh.o(user, 18);
                            sVar4.o0(objQ5);
                        }
                        g7.c((fz.a) objQ5, null, 0L, 0L, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 0, 126);
                        sVar4 = sVar4;
                        z17 = false;
                        sVar4.p(false);
                    }
                    sVar4.p(z17);
                } else {
                    sVar4.d0(1591425883);
                    zE = sVar4.e(j16);
                    objQ3 = sVar4.Q();
                    if (zE) {
                        Calendar calendar12 = Calendar.getInstance();
                        calendar12.setTimeInMillis(j16);
                        time = calendar12.getTime();
                        if (time == null) {
                            strY = null;
                        } else {
                            time2 = new Date().getTime() - time.getTime();
                            if (time2 > 32140800000L) {
                                j15 = time2 / 32140800000L;
                                if (j15 > 1) {
                                    strY = String.format(ff.h.y(context2, R.string._years_ago), Long.valueOf(j15));
                                } else {
                                    strY = String.format(ff.h.y(context2, R.string._year_ago), Long.valueOf(j15));
                                }
                            } else {
                                context3 = context2;
                                if (time2 > 2678400000L) {
                                    j14 = time2 / 2678400000L;
                                    if (j14 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._months_ago), Long.valueOf(j14));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._month_ago), Long.valueOf(j14));
                                    }
                                } else if (time2 > 86400000) {
                                    j13 = time2 / 86400000;
                                    if (j13 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._days_ago), Long.valueOf(j13));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._day_ago), Long.valueOf(j13));
                                    }
                                } else if (time2 > 3600000) {
                                    j12 = time2 / 3600000;
                                    if (j12 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._hours_ago), Long.valueOf(j12));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._hour_ago), Long.valueOf(j12));
                                    }
                                } else if (time2 > 60000) {
                                    j11 = time2 / 60000;
                                    if (j11 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._minutes_ago), Long.valueOf(j11));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._minute_ago), Long.valueOf(j11));
                                    }
                                } else {
                                    strY = ff.h.y(context3, R.string.just_now);
                                }
                            }
                        }
                        sVar4.o0(strY);
                        objQ3 = strY;
                    } else {
                        Calendar calendar13 = Calendar.getInstance();
                        calendar13.setTimeInMillis(j16);
                        time = calendar13.getTime();
                        if (time == null) {
                            strY = null;
                        } else {
                            time2 = new Date().getTime() - time.getTime();
                            if (time2 > 32140800000L) {
                                j15 = time2 / 32140800000L;
                                if (j15 > 1) {
                                    strY = String.format(ff.h.y(context2, R.string._years_ago), Long.valueOf(j15));
                                } else {
                                    strY = String.format(ff.h.y(context2, R.string._year_ago), Long.valueOf(j15));
                                }
                            } else {
                                context3 = context2;
                                if (time2 > 2678400000L) {
                                    j14 = time2 / 2678400000L;
                                    if (j14 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._months_ago), Long.valueOf(j14));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._month_ago), Long.valueOf(j14));
                                    }
                                } else if (time2 > 86400000) {
                                    j13 = time2 / 86400000;
                                    if (j13 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._days_ago), Long.valueOf(j13));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._day_ago), Long.valueOf(j13));
                                    }
                                } else if (time2 > 3600000) {
                                    j12 = time2 / 3600000;
                                    if (j12 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._hours_ago), Long.valueOf(j12));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._hour_ago), Long.valueOf(j12));
                                    }
                                } else if (time2 > 60000) {
                                    j11 = time2 / 60000;
                                    if (j11 > 1) {
                                        strY = String.format(ff.h.y(context3, R.string._minutes_ago), Long.valueOf(j11));
                                    } else {
                                        strY = String.format(ff.h.y(context3, R.string._minute_ago), Long.valueOf(j11));
                                    }
                                } else {
                                    strY = ff.h.y(context3, R.string.just_now);
                                }
                            }
                        }
                        sVar4.o0(strY);
                        objQ3 = strY;
                    }
                    String str9 = (String) objQ3;
                    kotlin.jvm.internal.m.c(str9);
                    ua.b(str9, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(ua.f31167a), ((s1) sVar4.j(c3Var2)).f31036s, j3.A(12), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar4, 0, 0, 65534);
                    sVar4 = sVar4;
                    sVar4.p(false);
                }
                sVar4.p(true);
                if (i11 == -1) {
                    sVar4.d0(1089245135);
                    l1.s sVar1110 = sVar4;
                    fz.a aVar11 = aVar3;
                    k7.h(aVar11, null, false, null, f36567l, sVar1110, ((i15 >> 12) & 14) | 196608, 30);
                    aVar4 = aVar11;
                    sVar4 = sVar1110;
                    z14 = false;
                } else {
                    aVar4 = aVar3;
                    z14 = false;
                    sVar4.d0(1070140920);
                }
                sVar4.p(z14);
                j0.g gVarG7 = j0.i.g(f18);
                z1.h hVar17 = z1.c.P;
                if ((i15 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ4 = sVar4.Q();
                if (z15) {
                    objQ4 = new et.p(29, onClickLike);
                    sVar4.o0(objQ4);
                } else {
                    objQ4 = new et.p(29, onClickLike);
                    sVar4.o0(objQ4);
                }
                z1.r rVarQ7 = iu.k.q(6, 7, (fz.a) objQ4, sVar4, oVar9, false);
                j0.u uVarA14 = j0.t.a(gVarG7, hVar17, sVar4, 54);
                iHashCode5 = Long.hashCode(sVar4.T);
                q1 q1VarL114 = sVar4.l();
                z1.r rVarC114 = z1.a.c(sVar4, rVarQ7);
                sVar4.h0();
                if (sVar4.S) {
                    sVar4.k(iVar2);
                } else {
                    sVar4.r0();
                }
                l1.t.J(hVar12, uVarA14, sVar4);
                l1.t.J(hVar3, q1VarL114, sVar4);
                if (sVar4.S) {
                    defpackage.e.A(iHashCode5, sVar4, iHashCode5, hVar2);
                } else {
                    defpackage.e.A(iHashCode5, sVar4, iHashCode5, hVar2);
                }
                l1.t.J(hVar16, rVarC114, sVar4);
                if (user.f38540h) {
                    i18 = R.drawable.ic_speak_lb_up_liked;
                } else {
                    i18 = R.drawable.ic_speak_lb_up;
                }
                l1.s sVar1111 = sVar4;
                d0.n.c(se.k.y(i18, sVar4, 0), null, e2.n(oVar9, f15), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar1111, 440, 120);
                ua.b(String.valueOf(user.f38539g), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar1111.j(ua.f31167a), ((s1) sVar1111.j(c3Var2)).f31036s, j3.A(12), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar1111, 0, 0, 65534);
                sVar5 = sVar1111;
                sVar5.p(true);
                sVar5.p(true);
                aVar2 = aVar4;
            } else {
                gVar3 = gVar2;
            }
            if (z18) {
                i17 = R.drawable.ic_video_pause;
            } else {
                i17 = R.drawable.ic_video_play;
            }
            objQ2 = Integer.valueOf(i17);
            sVar2.o0(objQ2);
            sVar3 = sVar2;
            d0.n.c(se.k.y(((Number) objQ2).intValue(), sVar2, 0), null, e2.d(oVar2, 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 440, 120);
            sVar3.p(true);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            z1.r rVarE10 = j0.c.E(new i1(1.0f, true), f15, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            float f19 = 8;
            j0.u uVarA15 = j0.t.a(j0.i.g(f19), z1.c.O, sVar3, 6);
            iHashCode4 = Long.hashCode(sVar3.T);
            q1 q1VarL115 = sVar3.l();
            z1.r rVarC115 = z1.a.c(sVar3, rVarE10);
            sVar3.h0();
            z1.o oVar10 = oVar2;
            if (sVar3.S) {
                sVar3.k(iVar2);
            } else {
                sVar3.r0();
            }
            l1.t.J(hVar12, uVarA15, sVar3);
            l1.t.J(hVar3, q1VarL115, sVar3);
            if (sVar3.S) {
                defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar2);
            } else {
                defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar2);
            }
            l1.t.J(hVar16, rVarC115, sVar3);
            ua.b(user.f38534b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
            sVar4 = sVar3;
            if (user.f38541i) {
                sVar4.d0(1591145271);
                if (user.f38543k == 1.0f) {
                    sVar4.d0(1591298597);
                    z17 = false;
                    b(0, sVar4, null, z18);
                    sVar4.p(false);
                } else {
                    sVar4.d0(1591192701);
                    if ((i15 & 14) == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objQ5 = sVar4.Q();
                    if (z16) {
                        objQ5 = new hh.o(user, 18);
                        sVar4.o0(objQ5);
                    } else {
                        objQ5 = new hh.o(user, 18);
                        sVar4.o0(objQ5);
                    }
                    g7.c((fz.a) objQ5, null, 0L, 0L, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 0, 126);
                    sVar4 = sVar4;
                    z17 = false;
                    sVar4.p(false);
                }
                sVar4.p(z17);
            } else {
                sVar4.d0(1591425883);
                zE = sVar4.e(j16);
                objQ3 = sVar4.Q();
                if (zE) {
                    Calendar calendar14 = Calendar.getInstance();
                    calendar14.setTimeInMillis(j16);
                    time = calendar14.getTime();
                    if (time == null) {
                        strY = null;
                    } else {
                        time2 = new Date().getTime() - time.getTime();
                        if (time2 > 32140800000L) {
                            j15 = time2 / 32140800000L;
                            if (j15 > 1) {
                                strY = String.format(ff.h.y(context2, R.string._years_ago), Long.valueOf(j15));
                            } else {
                                strY = String.format(ff.h.y(context2, R.string._year_ago), Long.valueOf(j15));
                            }
                        } else {
                            context3 = context2;
                            if (time2 > 2678400000L) {
                                j14 = time2 / 2678400000L;
                                if (j14 > 1) {
                                    strY = String.format(ff.h.y(context3, R.string._months_ago), Long.valueOf(j14));
                                } else {
                                    strY = String.format(ff.h.y(context3, R.string._month_ago), Long.valueOf(j14));
                                }
                            } else if (time2 > 86400000) {
                                j13 = time2 / 86400000;
                                if (j13 > 1) {
                                    strY = String.format(ff.h.y(context3, R.string._days_ago), Long.valueOf(j13));
                                } else {
                                    strY = String.format(ff.h.y(context3, R.string._day_ago), Long.valueOf(j13));
                                }
                            } else if (time2 > 3600000) {
                                j12 = time2 / 3600000;
                                if (j12 > 1) {
                                    strY = String.format(ff.h.y(context3, R.string._hours_ago), Long.valueOf(j12));
                                } else {
                                    strY = String.format(ff.h.y(context3, R.string._hour_ago), Long.valueOf(j12));
                                }
                            } else if (time2 > 60000) {
                                j11 = time2 / 60000;
                                if (j11 > 1) {
                                    strY = String.format(ff.h.y(context3, R.string._minutes_ago), Long.valueOf(j11));
                                } else {
                                    strY = String.format(ff.h.y(context3, R.string._minute_ago), Long.valueOf(j11));
                                }
                            } else {
                                strY = ff.h.y(context3, R.string.just_now);
                            }
                        }
                    }
                    sVar4.o0(strY);
                    objQ3 = strY;
                } else {
                    Calendar calendar15 = Calendar.getInstance();
                    calendar15.setTimeInMillis(j16);
                    time = calendar15.getTime();
                    if (time == null) {
                        strY = null;
                    } else {
                        time2 = new Date().getTime() - time.getTime();
                        if (time2 > 32140800000L) {
                            j15 = time2 / 32140800000L;
                            if (j15 > 1) {
                                strY = String.format(ff.h.y(context2, R.string._years_ago), Long.valueOf(j15));
                            } else {
                                strY = String.format(ff.h.y(context2, R.string._year_ago), Long.valueOf(j15));
                            }
                        } else {
                            context3 = context2;
                            if (time2 > 2678400000L) {
                                j14 = time2 / 2678400000L;
                                if (j14 > 1) {
                                    strY = String.format(ff.h.y(context3, R.string._months_ago), Long.valueOf(j14));
                                } else {
                                    strY = String.format(ff.h.y(context3, R.string._month_ago), Long.valueOf(j14));
                                }
                            } else if (time2 > 86400000) {
                                j13 = time2 / 86400000;
                                if (j13 > 1) {
                                    strY = String.format(ff.h.y(context3, R.string._days_ago), Long.valueOf(j13));
                                } else {
                                    strY = String.format(ff.h.y(context3, R.string._day_ago), Long.valueOf(j13));
                                }
                            } else if (time2 > 3600000) {
                                j12 = time2 / 3600000;
                                if (j12 > 1) {
                                    strY = String.format(ff.h.y(context3, R.string._hours_ago), Long.valueOf(j12));
                                } else {
                                    strY = String.format(ff.h.y(context3, R.string._hour_ago), Long.valueOf(j12));
                                }
                            } else if (time2 > 60000) {
                                j11 = time2 / 60000;
                                if (j11 > 1) {
                                    strY = String.format(ff.h.y(context3, R.string._minutes_ago), Long.valueOf(j11));
                                } else {
                                    strY = String.format(ff.h.y(context3, R.string._minute_ago), Long.valueOf(j11));
                                }
                            } else {
                                strY = ff.h.y(context3, R.string.just_now);
                            }
                        }
                    }
                    sVar4.o0(strY);
                    objQ3 = strY;
                }
                String str10 = (String) objQ3;
                kotlin.jvm.internal.m.c(str10);
                ua.b(str10, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(ua.f31167a), ((s1) sVar4.j(c3Var2)).f31036s, j3.A(12), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar4, 0, 0, 65534);
                sVar4 = sVar4;
                sVar4.p(false);
            }
            sVar4.p(true);
            if (i11 == -1) {
                sVar4.d0(1089245135);
                l1.s sVar1112 = sVar4;
                fz.a aVar12 = aVar3;
                k7.h(aVar12, null, false, null, f36567l, sVar1112, ((i15 >> 12) & 14) | 196608, 30);
                aVar4 = aVar12;
                sVar4 = sVar1112;
                z14 = false;
            } else {
                aVar4 = aVar3;
                z14 = false;
                sVar4.d0(1070140920);
            }
            sVar4.p(z14);
            j0.g gVarG8 = j0.i.g(f19);
            z1.h hVar18 = z1.c.P;
            if ((i15 & 7168) == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            objQ4 = sVar4.Q();
            if (z15) {
                objQ4 = new et.p(29, onClickLike);
                sVar4.o0(objQ4);
            } else {
                objQ4 = new et.p(29, onClickLike);
                sVar4.o0(objQ4);
            }
            z1.r rVarQ8 = iu.k.q(6, 7, (fz.a) objQ4, sVar4, oVar10, false);
            j0.u uVarA16 = j0.t.a(gVarG8, hVar18, sVar4, 54);
            iHashCode5 = Long.hashCode(sVar4.T);
            q1 q1VarL116 = sVar4.l();
            z1.r rVarC116 = z1.a.c(sVar4, rVarQ8);
            sVar4.h0();
            if (sVar4.S) {
                sVar4.k(iVar2);
            } else {
                sVar4.r0();
            }
            l1.t.J(hVar12, uVarA16, sVar4);
            l1.t.J(hVar3, q1VarL116, sVar4);
            if (sVar4.S) {
                defpackage.e.A(iHashCode5, sVar4, iHashCode5, hVar2);
            } else {
                defpackage.e.A(iHashCode5, sVar4, iHashCode5, hVar2);
            }
            l1.t.J(hVar16, rVarC116, sVar4);
            if (user.f38540h) {
                i18 = R.drawable.ic_speak_lb_up_liked;
            } else {
                i18 = R.drawable.ic_speak_lb_up;
            }
            l1.s sVar1113 = sVar4;
            d0.n.c(se.k.y(i18, sVar4, 0), null, e2.n(oVar10, f15), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar1113, 440, 120);
            ua.b(String.valueOf(user.f38539g), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar1113.j(ua.f31167a), ((s1) sVar1113.j(c3Var2)).f31036s, j3.A(12), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar1113, 0, 0, 65534);
            sVar5 = sVar1113;
            sVar5.p(true);
            sVar5.p(true);
            aVar2 = aVar4;
        } else {
            sVar5.W();
            aVar2 = aVar;
        }
        x1VarT = sVar5.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k(user, i11, onClick, onClickLike, aVar2, i12, i13);
        }
    }

    public static final void i(final long j11, final int i11, final fz.a onNavigateToSpeakTry, final fz.c loginNow, kr.b bVar, l1.n nVar, final int i12) {
        final kr.b bVar2;
        x1 x1VarT;
        fz.e eVar;
        final kr.b bVar3;
        int i13;
        kotlin.jvm.internal.m.f(onNavigateToSpeakTry, "onNavigateToSpeakTry");
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1265578892);
        int i14 = i12 | (sVar.e(j11) ? 4 : 2) | (sVar.d(i11) ? 32 : 16) | (sVar.h(onNavigateToSpeakTry) ? 256 : 128) | (sVar.h(loginNow) ? 2048 : 1024) | OSSConstants.DEFAULT_BUFFER_SIZE;
        if (sVar.T(i14 & 1, (i14 & 9363) != 9362)) {
            sVar.Y();
            if ((i12 & 1) == 0 || sVar.C()) {
                boolean z11 = ((i14 & 14) == 4) | ((i14 & 112) == 32);
                Object objQ = sVar.Q();
                if (z11 || objQ == l1.m.f39353a) {
                    objQ = new q(j11, i11, 0);
                    sVar.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(kr.b.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), aVar);
                sVar.p(false);
                bVar3 = (kr.b) viewModelA;
                i13 = i14 & (-57345);
            } else {
                sVar.W();
                i13 = i14 & (-57345);
                bVar3 = bVar;
            }
            sVar.q();
            b1 b1VarO = l1.t.o(bVar3.f38423f, sVar);
            if (((Number) b1VarO.getValue()).intValue() == -1) {
                sVar.d0(-1637428224);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
                x1VarT = sVar.t();
                if (x1VarT == null) {
                    return;
                }
                final int i15 = 0;
                eVar = new fz.e(j11, i11, onNavigateToSpeakTry, loginNow, bVar3, i12, i15) { // from class: jr.r

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f36695a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ long f36696b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ int f36697c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ fz.a f36698d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ fz.c f36699e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ kr.b f36700f;

                    {
                        this.f36695a = i15;
                    }

                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f36695a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iM = l1.t.M(1);
                                a.i(this.f36696b, this.f36697c, this.f36698d, this.f36699e, this.f36700f, (l1.n) obj, iM);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iM2 = l1.t.M(1);
                                a.i(this.f36696b, this.f36697c, this.f36698d, this.f36699e, this.f36700f, (l1.n) obj, iM2);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
            } else {
                sVar.d0(-1639424562);
                sVar.p(false);
                ys.a.a(CoursePracticeType.COURSE_STORY_READING, null, null, loginNow, onNavigateToSpeakTry, false, null, null, t1.e.d(-1459898661, new g5(3, b1VarO), sVar), sVar, (i13 & 7168) | 100663302 | ((i13 << 6) & 57344), 230);
                bVar2 = bVar3;
            }
            x1VarT.f39502d = eVar;
        }
        sVar.W();
        bVar2 = bVar;
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i16 = 1;
            eVar = new fz.e(j11, i11, onNavigateToSpeakTry, loginNow, bVar2, i12, i16) { // from class: jr.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f36695a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f36696b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f36697c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ fz.a f36698d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ fz.c f36699e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ kr.b f36700f;

                {
                    this.f36695a = i16;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f36695a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iM = l1.t.M(1);
                            a.i(this.f36696b, this.f36697c, this.f36698d, this.f36699e, this.f36700f, (l1.n) obj, iM);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iM2 = l1.t.M(1);
                            a.i(this.f36696b, this.f36697c, this.f36698d, this.f36699e, this.f36700f, (l1.n) obj, iM2);
                            break;
                    }
                    return qy.b0.f48488a;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }

    public static final void j(int i11, int i12, fz.a onNavigateToSpeakTry, l1.n nVar) {
        int i13;
        kotlin.jvm.internal.m.f(onNavigateToSpeakTry, "onNavigateToSpeakTry");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1561974666);
        if ((i12 & 6) == 0) {
            i13 = i12 | (sVar.d(i11) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.h(onNavigateToSpeakTry) ? 32 : 16;
        }
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            c3 c3Var = v1.f31180a;
            long j11 = ((s1) sVar.j(c3Var)).f31031n;
            r0 r0Var = g2.f0.f28556b;
            z1.o oVar = z1.o.f58481a;
            float f5 = 16;
            z1.r rVarA = j0.c.A(j0.c.v(j0.c.F(e2.d(d0.n.h(oVar, j11, r0Var), 1.0f))), f5);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarA);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, uVarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            j0.c.g(sVar, e2.g(oVar, 56));
            z1.r rVarE = e2.e(oVar, 1.0f);
            q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarE);
            sVar.h0();
            int i14 = i13;
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            tv.a.b(i11, sVar, i14 & 14);
            sVar.p(true);
            ua.b(ub.a.e0(sVar, R.string.you_re_done_with_the_reading_exercises_go_check_out_the_speaking_practice), j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((s1) sVar.j(c3Var)).f31034q, j3.A(18), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 3120, 0, 130544);
            sVar = sVar;
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            w4.c.r(1.0f, true, sVar);
            boolean z11 = (i14 & 112) == 32;
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new m(1, onNavigateToSpeakTry);
                sVar.o0(objQ);
            }
            iu.k.e((fz.a) objQ, e2.e(j0.c.B(oVar, f5, f5), 1.0f), false, 0L, null, m, sVar, 196656, 28);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new p(i11, onNavigateToSpeakTry, i12, 0);
        }
    }

    public static final void k(float f5, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1913112277);
        int i13 = (sVar.c(f5) ? 4 : 2) | i11;
        if (sVar.T(i13 & 1, (i13 & 3) != 2)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.d0(-688027553);
                Object objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = new h2(25, b1Var);
                    sVar.o0(objQ2);
                }
                s5.d((fz.a) objQ2, sVar, 6);
            } else {
                sVar.d0(-709443283);
            }
            sVar.p(false);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
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
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            w4.c.r(1.0f, true, sVar);
            if (f5 < 0.26f) {
                i12 = R.drawable.speech_score_0_25;
            } else if (f5 < 0.51f) {
                i12 = R.drawable.speech_score_26_50;
            } else {
                i12 = f5 < 0.76f ? R.drawable.speech_score_51_75 : R.drawable.speech_score_76_100;
            }
            int i14 = i12;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = new h2(26, b1Var);
                sVar.o0(objQ3);
            }
            z1.r rVarQ = iu.k.q(24582, 7, (fz.a) objQ3, sVar, oVar, false);
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarQ);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            int i15 = (int) (100 * f5);
            long jI = s5.i(i15);
            d0.n.c(se.k.y(i14, sVar, 0), null, e2.p(oVar, 52, 46), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 440, 120);
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = b0.e.a(CropImageView.DEFAULT_ASPECT_RATIO);
                sVar.o0(objQ4);
            }
            b0.d dVar = (b0.d) objQ4;
            boolean zH = sVar.h(dVar) | sVar.d(i15);
            Object objQ5 = sVar.Q();
            if (zH || objQ5 == gVar) {
                objQ5 = new q5(i15, 1, dVar, null);
                sVar.o0(objQ5);
            }
            l1.t.f((fz.e) objQ5, qy.b0.f48488a, sVar);
            ua.b(String.valueOf((int) ((Number) dVar.d()).floatValue()), j0.c.E(j0.r.f35391a.a(oVar, z1.c.f58464b), CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), jI, j3.A(18), n3.s.M, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 0, 0, 65532);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bq.q(i11, f5);
        }
    }

    public static final void l(kr.r0 uiState, z1.r rVar, fz.a switchPlayStatus, l1.n nVar, int i11) {
        fz.a aVar;
        boolean z11;
        boolean z12;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        List list = uiState.f38564a;
        List list2 = uiState.f38565b;
        int i12 = uiState.f38566c;
        kotlin.jvm.internal.m.f(switchPlayStatus, "switchPlayStatus");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1393847810);
        int i13 = i11 | (sVar.h(uiState) ? 4 : 2);
        if ((i11 & 48) == 0) {
            i13 |= sVar.f(rVar) ? 32 : 16;
        }
        int i14 = i13 | (sVar.h(switchPlayStatus) ? 256 : 128);
        if (sVar.T(i14 & 1, (i14 & 147) != 146)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.TRUE);
                sVar.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            Boolean boolValueOf = Boolean.valueOf(uiState.f38568e);
            Boolean bool = (Boolean) b1Var.getValue();
            bool.booleanValue();
            boolean zH = sVar.h(uiState);
            Object objQ2 = sVar.Q();
            vy.d dVar = null;
            if (zH || objQ2 == gVar) {
                objQ2 = new gu.b(19, uiState, b1Var, dVar);
                sVar.o0(objQ2);
            }
            l1.t.g(boolValueOf, bool, (fz.e) objQ2, sVar);
            boolean zH2 = sVar.h(uiState);
            Object objQ3 = sVar.Q();
            if (zH2 || objQ3 == gVar) {
                objQ3 = new fp.f(22, uiState, b1Var);
                sVar.o0(objQ3);
            }
            z1.r rVarQ = iu.k.q((i14 >> 3) & 14, 7, (fz.a) objQ3, sVar, rVar, false);
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarQ);
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
            Integer numValueOf = Integer.valueOf(i12);
            if (i12 >= list2.size()) {
                numValueOf = null;
            }
            Object obj = list2.get(numValueOf != null ? numValueOf.intValue() : list2.size() - 1);
            z1.o oVar = z1.o.f58481a;
            wb.k.c(obj, j0.c.j(e2.e(oVar, 1.0f), 1.7777778f), null, sVar, 432, 4088);
            if (uiState.f38567d > CropImageView.DEFAULT_ASPECT_RATIO) {
                sVar.d0(-100234976);
                boolean zD = sVar.d(i12);
                Object objQ4 = sVar.Q();
                if (zD || objQ4 == gVar) {
                    objQ4 = i12 < list.size() ? (ir.b) list.get(i12) : (ir.b) ry.m.z0(list);
                    sVar.o0(objQ4);
                }
                ir.b bVar = (ir.b) objQ4;
                z1.j jVar = z1.c.H;
                j0.r rVar2 = j0.r.f35391a;
                z1.r rVarC2 = j0.c.C(d0.n.g(e2.e(rVar2.a(oVar, jVar), 1.0f), p3.A(ns.o.L(new g2.x(g2.x.f28621h), new g2.x(g2.f0.e(2281701376L)))), null, 6), CropImageView.DEFAULT_ASPECT_RATIO, 8, 1);
                q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
                int iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                z1.r rVarC3 = z1.a.c(sVar, rVarC2);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, q0VarD2, sVar);
                l1.t.J(hVar2, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                }
                l1.t.J(hVar4, rVarC3, sVar);
                z11 = true;
                d4.a(bVar.f34557a.getDisplayCourseWords(), null, null, false, false, y0.a((y0) sVar.j(ua.f31167a), g2.x.f28618e, j3.A(16), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar, 3072, 0, 0, 4194262);
                sVar.p(true);
                boolean zH3 = sVar.h(uiState);
                Object objQ5 = sVar.Q();
                if (zH3 || objQ5 == gVar) {
                    objQ5 = new hh.o(uiState, 20);
                    sVar.o0(objQ5);
                }
                fz.a aVar2 = (fz.a) objQ5;
                z1.r rVarA = rVar2.a(e2.e(oVar, 1.0f), jVar);
                float f5 = -4;
                Object objQ6 = sVar.Q();
                if (objQ6 == gVar) {
                    objQ6 = new j9.a0(22);
                    sVar.o0(objQ6);
                }
                g7.c(aVar2, rVarA, 0L, 0L, 0, f5, (fz.c) objQ6, sVar, 1769472, 28);
                sVar = sVar;
                z12 = false;
            } else {
                z11 = true;
                z12 = false;
                sVar.d0(-109618490);
            }
            sVar.p(z12);
            aVar = switchPlayStatus;
            l1.s sVar2 = sVar;
            a0.j0.d(((Boolean) b1Var.getValue()).booleanValue(), null, f1.e(null, 3), f1.f(null, 3), null, t1.e.d(-1107443228, new defpackage.d(uiState, aVar, b1Var, 8), sVar), sVar2, 200064, 18);
            sVar = sVar2;
            sVar.p(z11);
        } else {
            aVar = switchPlayStatus;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(uiState, rVar, aVar, i11, 17);
        }
    }

    public static final void m(final long j11, final int i11, z0 z0Var, final fz.a onNavigateBack, final fz.a onNavigateToSpeaking, final fz.a onNavigateToLogin, final fz.c loginNow, l1.n nVar, final int i12) {
        l1.s sVar;
        final z0 z0Var2;
        int i13;
        z0 z0Var3;
        kotlin.jvm.internal.m.f(onNavigateBack, "onNavigateBack");
        kotlin.jvm.internal.m.f(onNavigateToSpeaking, "onNavigateToSpeaking");
        kotlin.jvm.internal.m.f(onNavigateToLogin, "onNavigateToLogin");
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-275743832);
        int i14 = i12 | (sVar2.e(j11) ? 4 : 2) | (sVar2.d(i11) ? 32 : 16) | 128 | (sVar2.h(onNavigateBack) ? 2048 : 1024) | (sVar2.h(onNavigateToSpeaking) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(onNavigateToLogin) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(loginNow) ? 1048576 : 524288);
        if (sVar2.T(i14 & 1, (599187 & i14) != 599186)) {
            sVar2.Y();
            int i15 = i12 & 1;
            l1.g gVar = l1.m.f39353a;
            if (i15 == 0 || sVar2.C()) {
                boolean z11 = ((i14 & 14) == 4) | ((i14 & 112) == 32);
                Object objQ = sVar2.Q();
                if (z11 || objQ == gVar) {
                    objQ = new q(j11, i11, 1);
                    sVar2.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                sVar2.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar2, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(z0.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), aVar);
                sVar2.p(false);
                i13 = i14 & (-897);
                z0Var3 = (z0) viewModelA;
            } else {
                sVar2.W();
                i13 = i14 & (-897);
                z0Var3 = z0Var;
            }
            sVar2.q();
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.q(sVar2);
                sVar2.o0(objQ2);
            }
            rz.b0 b0Var = (rz.b0) objQ2;
            b1 b1VarO = l1.t.o(z0Var3.O, sVar2);
            kr.q1 q1Var = (kr.q1) l1.t.o(z0Var3.N, sVar2).getValue();
            if (kotlin.jvm.internal.m.a(q1Var, m1.f38532a)) {
                sVar2.d0(1298166636);
                sVar2.p(false);
            } else if (kotlin.jvm.internal.m.a(q1Var, n1.f38544a)) {
                sVar2.d0(1588509902);
                Toast.makeText((Context) sVar2.j(AndroidCompositionLocals_androidKt.f1200b), R.string.upload_failed, 0).show();
                onNavigateBack.invoke();
                sVar2.p(false);
            } else if (kotlin.jvm.internal.m.a(q1Var, o1.f38552a)) {
                sVar2.d0(1588692461);
                Toast.makeText((Context) sVar2.j(AndroidCompositionLocals_androidKt.f1200b), R.string.upload_success, 0).show();
                onNavigateBack.invoke();
                sVar2.p(false);
            } else {
                if (!kotlin.jvm.internal.m.a(q1Var, p1.f38558a)) {
                    throw nv.p.x(sVar2, 1298165390, false);
                }
                sVar2.d0(1298179799);
                tv.a.c(sVar2, 0);
                sVar2.p(false);
            }
            s0 s0Var = (s0) b1VarO.getValue();
            if (kotlin.jvm.internal.m.a(s0Var, kr.q0.f38562a)) {
                sVar2.d0(1298182668);
                sVar2.p(false);
                sVar = sVar2;
            } else {
                if (!(s0Var instanceof kr.r0)) {
                    throw nv.p.x(sVar2, 1298181677, false);
                }
                sVar2.d0(1589038576);
                sVar = sVar2;
                ys.a.a(CoursePracticeType.COURSE_STORY_SPEAKING, null, null, loginNow, onNavigateBack, false, null, null, t1.e.d(393794679, new bp.y((Object) z0Var3, (Object) b0Var, (Object) onNavigateToSpeaking, (Object) onNavigateToLogin, b1VarO, 7), sVar2), sVar, ((i13 >> 9) & 7168) | 100663302 | ((i13 << 3) & 57344), 230);
                sVar.p(false);
            }
            z0Var2 = z0Var3;
        } else {
            sVar = sVar2;
            sVar.W();
            z0Var2 = z0Var;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(j11, i11, z0Var2, onNavigateBack, onNavigateToSpeaking, onNavigateToLogin, loginNow, i12) { // from class: jr.b0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f36578a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f36579b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ z0 f36580c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ fz.a f36581d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ fz.a f36582e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ fz.a f36583f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ fz.c f36584t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1);
                    a.m(this.f36578a, this.f36579b, this.f36580c, this.f36581d, this.f36582e, this.f36583f, this.f36584t, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void n(s0 uiState, fz.a switchPlayStatus, fz.a onNavigateBack, fz.a onUploadClick, fz.a onRedoSpeaking, fz.a onNavigateToLogin, l1.n nVar, int i11) {
        int i12;
        l1.s sVar;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        kotlin.jvm.internal.m.f(switchPlayStatus, "switchPlayStatus");
        kotlin.jvm.internal.m.f(onNavigateBack, "onNavigateBack");
        kotlin.jvm.internal.m.f(onUploadClick, "onUploadClick");
        kotlin.jvm.internal.m.f(onRedoSpeaking, "onRedoSpeaking");
        kotlin.jvm.internal.m.f(onNavigateToLogin, "onNavigateToLogin");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(597926234);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar2.f(uiState) : sVar2.h(uiState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(switchPlayStatus) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(onNavigateBack) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(onUploadClick) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(onRedoSpeaking) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(onNavigateToLogin) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if (!sVar2.T(i12 & 1, (74899 & i12) != 74898)) {
            sVar = sVar2;
            sVar.W();
        } else if (uiState.equals(kr.q0.f38562a)) {
            sVar2.d0(-918495319);
            tv.a.d(0, 1, sVar2, null);
            sVar2.p(false);
            sVar = sVar2;
        } else {
            if (!(uiState instanceof kr.r0)) {
                throw nv.p.x(sVar2, -918493990, false);
            }
            sVar2.d0(1591580206);
            p7.a(null, t1.e.d(428870421, new at.o(25, onNavigateBack), sVar2), null, null, null, 0, 0L, 0L, null, t1.e.d(1658934570, new bp.y(uiState, switchPlayStatus, onNavigateToLogin, onUploadClick, onRedoSpeaking, 8), sVar2), sVar2, 805306416, 509);
            sVar = sVar2;
            sVar.p(false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.d((Object) uiState, switchPlayStatus, (Object) onNavigateBack, (qy.e) onUploadClick, (Object) onRedoSpeaking, (Object) onNavigateToLogin, i11, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    public static final void o(c1 c1Var, z1.r rVar, l1.n nVar, int i11, int i12) {
        z1.r rVar2;
        int i13;
        z1.r rVar3;
        long j11;
        ?? r9;
        long jC;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1533297316);
        int i14 = i11 | (sVar.h(c1Var) ? 4 : 2);
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 = i14 | 48;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i13 = i14 | (sVar.f(rVar2) ? 32 : 16);
        }
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVar4 = i15 != 0 ? oVar : rVar2;
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar4);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, uVarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            int i16 = c1Var.f38436c;
            List list = c1Var.f38435b;
            z1.r rVar5 = rVar4;
            float f5 = 1.0f;
            wb.k.c(i16 < list.size() ? (String) list.get(i16) : null, j0.c.j(e2.e(oVar, 1.0f), 1.7777778f), w2.i.f54517d, sVar, 1573296, 4024);
            a2 a2VarA = z1.a(j0.i.g(4), z1.c.L, sVar, 6);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, a2VarA, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            sVar.d0(246286981);
            int i17 = 0;
            for (Object obj : c1Var.f38434a) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    ns.o.V();
                    throw null;
                }
                kr.a1 a1Var = (kr.a1) obj;
                if (i17 == i16) {
                    sVar.d0(538053706);
                    j11 = ((s1) sVar.j(v1.f31180a)).f31017a;
                    sVar.p(false);
                } else {
                    sVar.d0(538054318);
                    sVar.p(false);
                    j11 = g2.x.f28621h;
                }
                if (f5 <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                i1 i1Var = new i1(f5, true);
                j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
                int iHashCode3 = Long.hashCode(sVar.T);
                q1 q1VarL3 = sVar.l();
                z1.r rVarC3 = z1.a.c(sVar, i1Var);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA2, sVar);
                l1.t.J(y2.j.f56916e, q1VarL3, sVar);
                y2.h hVar5 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar5);
                }
                l1.t.J(y2.j.f56915d, rVarC3, sVar);
                float f11 = 6;
                z1.r rVarP = e2.p(oVar, 12, f11);
                boolean zE = sVar.e(j11);
                Object objQ = sVar.Q();
                if (zE || objQ == l1.m.f39353a) {
                    objQ = new au.o(j11, 13);
                    sVar.o0(objQ);
                }
                d0.n.b(6, (fz.c) objQ, sVar, rVarP);
                z1.r rVarG = e2.g(e2.e(oVar, 1.0f), f11);
                if (a1Var.f38415f || i17 == i16) {
                    r9 = 0;
                    sVar.d0(656389376);
                    jC = ((s1) sVar.j(v1.f31180a)).f31017a;
                } else {
                    sVar.d0(656391026);
                    jC = g2.x.c(((s1) sVar.j(v1.f31180a)).f31034q, 0.38f);
                    r9 = 0;
                }
                sVar.p(r9);
                j0.c.g(sVar, d0.n.h(rVarG, jC, r0.f.d((float) r9)));
                sVar.p(true);
                i17 = i18;
                f5 = 1.0f;
            }
            com.google.android.material.datepicker.d.B(sVar, false, true, true);
            rVar3 = rVar5;
        } else {
            sVar.W();
            rVar3 = rVar2;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t1(c1Var, rVar3, i11, i12, 9);
        }
    }

    public static final void p(c1 c1Var, z1.r rVar, fz.c cVar, fz.c cVar2, fz.c cVar3, fz.c cVar4, fz.c cVar5, fz.a aVar, l1.n nVar, int i11, int i12) {
        int i13;
        l1.s sVar;
        z1.r rVar2;
        Object fVar;
        b1 b1Var;
        PermissionState permissionState;
        b1 b1Var2;
        b1 b1Var3;
        l0.w wVar;
        l0.w wVar2;
        c1 c1Var2 = c1Var;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1773010131);
        int i14 = i11 | (sVar2.h(c1Var2) ? 4 : 2);
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 = i14 | 48;
        } else {
            i13 = i14 | (sVar2.f(rVar) ? 32 : 16);
        }
        int i16 = i13 | (sVar2.h(cVar) ? 256 : 128) | (sVar2.h(cVar2) ? 2048 : 1024) | (sVar2.h(cVar3) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(cVar4) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(cVar5) ? 1048576 : 524288) | (sVar2.h(aVar) ? 8388608 : 4194304);
        if (sVar2.T(i16 & 1, (4793491 & i16) != 4793490)) {
            z1.r rVar3 = i15 != 0 ? z1.o.f58481a : rVar;
            PermissionState permissionStateA = PermissionStateKt.a(sVar2);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.valueOf(PermissionsUtilKt.b(permissionStateA.getStatus())));
                sVar2.o0(objQ);
            }
            b1 b1Var4 = (b1) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(null);
                sVar2.o0(objQ2);
            }
            b1 b1Var5 = (b1) objQ2;
            Boolean boolValueOf = Boolean.valueOf(PermissionsUtilKt.b(permissionStateA.getStatus()));
            int i17 = i16 & 57344;
            boolean zF = sVar2.f(permissionStateA) | (i17 == 16384);
            Object objQ3 = sVar2.Q();
            if (zF || objQ3 == gVar) {
                b1Var = b1Var5;
                permissionState = permissionStateA;
                b1Var2 = b1Var4;
                fVar = new b0.f(permissionState, b1Var2, b1Var, cVar3, (vy.d) null);
                sVar2.o0(fVar);
            } else {
                fVar = objQ3;
                b1Var = b1Var5;
                permissionState = permissionStateA;
                b1Var2 = b1Var4;
            }
            l1.t.f((fz.e) fVar, boolValueOf, sVar2);
            l0.w wVarA = l0.y.a(0, sVar2, 3);
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ4);
            }
            b1 b1Var6 = (b1) objQ4;
            Boolean boolValueOf2 = Boolean.valueOf(wVarA.f39210i.b());
            int i18 = i16 & 896;
            boolean zF2 = sVar2.f(wVarA) | sVar2.h(c1Var2) | (i18 == 256);
            Object objQ5 = sVar2.Q();
            if (zF2 || objQ5 == gVar) {
                b1Var3 = b1Var6;
                objQ5 = new ad.x(wVarA, c1Var, cVar, b1Var3, null, 10);
                wVar = wVarA;
                c1Var2 = c1Var;
                sVar2.o0(objQ5);
            } else {
                wVar = wVarA;
                b1Var3 = b1Var6;
            }
            l1.t.f((fz.e) objQ5, boolValueOf2, sVar2);
            Integer numValueOf = Integer.valueOf(c1Var2.f38436c);
            int i19 = r18 & 7168;
            boolean zF3 = sVar2.f(wVar) | sVar2.h(c1Var2) | (i19 == 2048);
            Object objQ6 = sVar2.Q();
            if (zF3 || objQ6 == gVar) {
                l0.w wVar3 = wVar;
                c1 c1Var3 = c1Var2;
                i0 i0Var = new i0(wVar3, c1Var3, cVar2, b1Var3, null, 0);
                wVar2 = wVar3;
                c1Var2 = c1Var3;
                sVar2.o0(i0Var);
                objQ6 = i0Var;
            } else {
                wVar2 = wVar;
            }
            l1.t.f((fz.e) objQ6, numValueOf, sVar2);
            boolean zH = sVar2.h(c1Var2) | sVar2.f(permissionState) | (i18 == 256) | (i19 == 2048) | (i17 == 16384) | ((i16 & 458752) == 131072) | ((i16 & 3670016) == 1048576) | ((i16 & 29360128) == 8388608);
            Object objQ7 = sVar2.Q();
            if (zH || objQ7 == gVar) {
                g0 g0Var = new g0(c1Var2, permissionState, cVar, cVar2, cVar3, cVar4, cVar5, b1Var2, b1Var, b1Var3, aVar);
                sVar2.o0(g0Var);
                objQ7 = g0Var;
            }
            int i21 = (i16 >> 3) & 14;
            sVar = sVar2;
            z1.r rVar4 = rVar3;
            ue.f.a(rVar4, wVar2, null, null, null, null, false, null, (fz.c) objQ7, sVar, i21, 508);
            rVar2 = rVar4;
        } else {
            sVar = sVar2;
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.m1(c1Var, rVar2, cVar, cVar2, cVar3, cVar4, cVar5, aVar, i11, i12);
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
    public static final void q(int i11, l1 l1Var, fz.a onNavigateBack, fz.a onNavigateToSettings, fz.a onNavigateToPreview, l1.n nVar, int i12) {
        l1 l1Var2;
        l1 l1Var3;
        int i13;
        int i14;
        l1 l1Var4;
        kotlin.jvm.internal.m.f(onNavigateBack, "onNavigateBack");
        kotlin.jvm.internal.m.f(onNavigateToSettings, "onNavigateToSettings");
        kotlin.jvm.internal.m.f(onNavigateToPreview, "onNavigateToPreview");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(854363888);
        int i15 = i12 | (sVar.d(i11) ? 4 : 2) | 16 | (sVar.h(onNavigateBack) ? 256 : 128) | (sVar.h(onNavigateToPreview) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i15 & 1, (i15 & 9363) != 9362)) {
            sVar.Y();
            int i16 = i12 & 1;
            l1.g gVar = l1.m.f39353a;
            if (i16 == 0 || sVar.C()) {
                boolean z11 = (i15 & 14) == 4;
                Object objQ = sVar.Q();
                if (z11 || objQ == gVar) {
                    objQ = new fu.x(i11, 3);
                    sVar.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(l1.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), aVar);
                sVar.p(false);
                l1Var3 = (l1) viewModelA;
                i13 = i15 & (-113);
            } else {
                sVar.W();
                i13 = i15 & (-113);
                l1Var3 = l1Var;
            }
            sVar.q();
            b1 b1VarO = l1.t.o(l1Var3.K, sVar);
            sVar.d0(-1614864554);
            ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModel viewModelA2 = i20.b.a(kotlin.jvm.internal.z.a(p0.class), current2.getViewModelStore(), null, i20.a.a(current2), null, q10.b.a(sVar), null);
            sVar.p(false);
            p0 p0Var = (p0) viewModelA2;
            b1 b1VarO2 = l1.t.o(p0Var.f38557c, sVar);
            n0 n0Var = (n0) b1VarO2.getValue();
            if (kotlin.jvm.internal.m.a(n0Var, kr.l0.f38522a)) {
                i14 = -1;
            } else {
                if (!(n0Var instanceof m0)) {
                    throw new NoWhenBranchMatchedException();
                }
                n0 n0Var2 = (n0) b1VarO2.getValue();
                kotlin.jvm.internal.m.d(n0Var2, "null cannot be cast to non-null type com.lingo.story.viewmodels.StorySettingsUiState.Success");
                i14 = ((m0) n0Var2).f38531b.f38477b;
            }
            d1 d1Var = (d1) b1VarO.getValue();
            boolean zH = sVar.h(l1Var3);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new gr.s(l1Var3, 20);
                sVar.o0(objQ2);
            }
            fz.c cVar = (fz.c) objQ2;
            boolean zH2 = sVar.h(l1Var3);
            Object objQ3 = sVar.Q();
            if (zH2 || objQ3 == gVar) {
                a3 a3Var = new a3(1, l1Var3, l1.class, "playAudio", "playAudio(Lcom/lingo/story/viewmodels/StorySpeakingSentence;)V", 0, 12);
                sVar.o0(a3Var);
                objQ3 = a3Var;
            }
            fz.c cVar2 = (fz.c) ((mz.e) objQ3);
            boolean zH3 = sVar.h(l1Var3);
            Object objQ4 = sVar.Q();
            if (zH3 || objQ4 == gVar) {
                objQ4 = new a3(1, l1Var3, l1.class, "recordAudio", "recordAudio(Lcom/lingo/story/viewmodels/StorySpeakingSentence;)V", 0, 13);
                sVar.o0(objQ4);
            }
            fz.c cVar3 = (fz.c) ((mz.e) objQ4);
            boolean zH4 = sVar.h(l1Var3);
            Object objQ5 = sVar.Q();
            if (zH4 || objQ5 == gVar) {
                a3 a3Var2 = new a3(1, l1Var3, l1.class, "stopRecordAudio", "stopRecordAudio(Lcom/lingo/story/viewmodels/StorySpeakingSentence;)V", 0, 14);
                sVar.o0(a3Var2);
                objQ5 = a3Var2;
            }
            fz.c cVar4 = (fz.c) ((mz.e) objQ5);
            boolean zH5 = sVar.h(l1Var3);
            Object objQ6 = sVar.Q();
            if (zH5 || objQ6 == gVar) {
                l1Var4 = l1Var3;
                a3 a3Var3 = new a3(1, l1Var4, l1.class, "playUserRecord", "playUserRecord(Lcom/lingo/story/viewmodels/StorySpeakingSentence;)V", 0, 15);
                sVar.o0(a3Var3);
                objQ6 = a3Var3;
            } else {
                l1Var4 = l1Var3;
            }
            fz.c cVar5 = (fz.c) ((mz.e) objQ6);
            boolean zH6 = sVar.h(p0Var);
            Object objQ7 = sVar.Q();
            if (zH6 || objQ7 == gVar) {
                objQ7 = new v(p0Var, 1);
                sVar.o0(objQ7);
            }
            r(d1Var, onNavigateBack, onNavigateToSettings, cVar, cVar2, cVar3, cVar4, cVar5, onNavigateToPreview, i14, (fz.a) objQ7, sVar, ((i13 << 12) & 234881024) | ((i13 >> 3) & 1008));
            l1Var2 = l1Var4;
        } else {
            sVar.W();
            l1Var2 = l1Var;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a(i11, l1Var2, onNavigateBack, onNavigateToSettings, onNavigateToPreview, i12, 5);
        }
    }

    public static final void s(kr.a1 a1Var, boolean z11, boolean z12, fz.a requestPermission, z1.r rVar, fz.c onPlayAudio, fz.c onRecordAudio, fz.c onStopRecordAudio, fz.c onPlayUserRecord, l1.n nVar, int i11) {
        l1.s sVar;
        x1 x1VarT;
        d0 d0Var;
        kotlin.jvm.internal.m.f(requestPermission, "requestPermission");
        kotlin.jvm.internal.m.f(onPlayAudio, "onPlayAudio");
        kotlin.jvm.internal.m.f(onRecordAudio, "onRecordAudio");
        kotlin.jvm.internal.m.f(onStopRecordAudio, "onStopRecordAudio");
        kotlin.jvm.internal.m.f(onPlayUserRecord, "onPlayUserRecord");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-795582048);
        int i12 = sVar2.S ? -sVar2.I.f39416v : sVar2.G.f39348i;
        int i13 = i11 | (sVar2.h(a1Var) ? 4 : 2) | (sVar2.g(z11) ? 32 : 16) | (sVar2.g(z12) ? 256 : 128) | (sVar2.h(requestPermission) ? 2048 : 1024) | (sVar2.f(rVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(onPlayAudio) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(onRecordAudio) ? 1048576 : 524288) | (sVar2.h(onStopRecordAudio) ? 8388608 : 4194304) | (sVar2.h(onPlayUserRecord) ? 67108864 : 33554432);
        if (sVar2.T(i13 & 1, (38347923 & i13) != 38347922)) {
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
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
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar2);
            sVar2.d0(394436044);
            d4.a(a1Var.f38410a.f34557a.getDisplayCourseWords(), j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), null, false, false, null, null, a1Var.f38411b, false, a1Var.f38417h, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar2, 3120, 0, 0, 4193652);
            a0.j0.c(z11, null, null, null, null, t1.e.d(1568289298, new a00.b(a1Var, 20), sVar2), sVar2, 1572870 | (i13 & 112), 30);
            if (a1Var.f38416g) {
                Object objQ = sVar2.Q();
                l1.g gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = l1.t.B(Boolean.FALSE);
                    sVar2.o0(objQ);
                }
                b1 b1Var = (b1) objQ;
                boolean zH = sVar2.h(a1Var);
                Object objQ2 = sVar2.Q();
                if (zH || objQ2 == gVar) {
                    objQ2 = new gu.b(21, a1Var, b1Var, (vy.d) null);
                    sVar2.o0(objQ2);
                }
                l1.t.f((fz.e) objQ2, qy.b0.f48488a, sVar2);
                sVar = sVar2;
                a0.j0.c(((Boolean) b1Var.getValue()).booleanValue(), null, null, null, null, t1.e.d(-524170181, new y1(a1Var, onPlayAudio, onStopRecordAudio, z12, onRecordAudio, requestPermission, onPlayUserRecord), sVar2), sVar, 1572870, 30);
                sVar.p(false);
                sVar.p(true);
            } else {
                sVar2.w(i12);
                x1VarT = sVar2.t();
                if (x1VarT == null) {
                    return;
                } else {
                    d0Var = new d0(a1Var, z11, z12, requestPermission, rVar, onPlayAudio, onRecordAudio, onStopRecordAudio, onPlayUserRecord, i11, 0);
                }
            }
            x1VarT.f39502d = d0Var;
        }
        sVar = sVar2;
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            d0Var = new d0(a1Var, z11, z12, requestPermission, rVar, onPlayAudio, onRecordAudio, onStopRecordAudio, onPlayUserRecord, i11, 1);
            x1VarT.f39502d = d0Var;
        }
    }

    public static final void r(final d1 uiState, final fz.a onNavigateBack, final fz.a aVar, final fz.c updateCurrentIndex, final fz.c playAudio, final fz.c onRecordAudio, final fz.c onStopRecordAudio, final fz.c onPlayUserRecord, final fz.a onNavigateToPreview, final int i11, final fz.a updateScriptShortcutDisplay, l1.n nVar, final int i12) {
        int i13;
        l1.s sVar;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        kotlin.jvm.internal.m.f(onNavigateBack, "onNavigateBack");
        kotlin.jvm.internal.m.f(aVar, MzwEyWCkjXL.zsCthFLNzQgkgG);
        kotlin.jvm.internal.m.f(updateCurrentIndex, "updateCurrentIndex");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        kotlin.jvm.internal.m.f(onRecordAudio, "onRecordAudio");
        kotlin.jvm.internal.m.f(onStopRecordAudio, "onStopRecordAudio");
        kotlin.jvm.internal.m.f(onPlayUserRecord, "onPlayUserRecord");
        kotlin.jvm.internal.m.f(onNavigateToPreview, "onNavigateToPreview");
        kotlin.jvm.internal.m.f(updateScriptShortcutDisplay, "updateScriptShortcutDisplay");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1909089643);
        if ((i12 & 6) == 0) {
            i13 = ((i12 & 8) == 0 ? sVar2.f(uiState) : sVar2.h(uiState) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar2.h(onNavigateBack) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar2.h(aVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar2.h(updateCurrentIndex) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= sVar2.h(playAudio) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i12) == 0) {
            i13 |= sVar2.h(onRecordAudio) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i12) == 0) {
            i13 |= sVar2.h(onStopRecordAudio) ? 1048576 : 524288;
        }
        if ((12582912 & i12) == 0) {
            i13 |= sVar2.h(onPlayUserRecord) ? 8388608 : 4194304;
        }
        if ((100663296 & i12) == 0) {
            i13 |= sVar2.h(onNavigateToPreview) ? 67108864 : 33554432;
        }
        if ((805306368 & i12) == 0) {
            i13 |= sVar2.d(i11) ? 536870912 : 268435456;
        }
        if (!sVar2.T(i13 & 1, ((i13 & 306783379) == 306783378 && ((sVar2.h(updateScriptShortcutDisplay) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            sVar = sVar2;
            sVar.W();
        } else if (uiState.equals(kr.b1.f38431a)) {
            sVar2.d0(684132250);
            tv.a.d(0, 1, sVar2, null);
            sVar2.p(false);
            sVar = sVar2;
        } else {
            if (!(uiState instanceof c1)) {
                throw nv.p.x(sVar2, 684133704, false);
            }
            sVar2.d0(-266580364);
            p7.a(null, t1.e.d(-1228092570, new ch.n0(onNavigateBack, aVar, i11, updateScriptShortcutDisplay), sVar2), null, null, null, 0, 0L, 0L, null, t1.e.d(794555707, new ei.l(uiState, updateCurrentIndex, playAudio, onRecordAudio, onStopRecordAudio, onPlayUserRecord, onNavigateToPreview, 1), sVar2), sVar2, 805306416, 509);
            sVar = sVar2;
            sVar.p(false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: jr.f0
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.r(uiState, onNavigateBack, aVar, updateCurrentIndex, playAudio, onRecordAudio, onStopRecordAudio, onPlayUserRecord, onNavigateToPreview, i11, updateScriptShortcutDisplay, (l1.n) obj, l1.t.M(i12 | 1));
                    return qy.b0.f48488a;
                }
            };
        }
    }
}
