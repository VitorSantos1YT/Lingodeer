package ku;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import b0.k0;
import b0.o1;
import ch.n0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;
import dt.s2;
import dt.t0;
import fr.j3;
import h1.a6;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.c;
import j0.e2;
import j0.i;
import j0.i1;
import j0.u;
import j0.v;
import j0.z1;
import j3.y0;
import java.util.ArrayList;
import jr.h0;
import jt.i0;
import km.s0;
import km.x0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.d0;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import mu.l;
import mu.x;
import nv.p;
import qy.b0;
import r0.f;
import t1.d;
import tv.g;
import y2.h;
import y2.j;
import y2.k;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f38685a = new d(new iv.b(16), false, -1706952490);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f38686b = new d(new iv.b(17), false, 98041103);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f38687c = new d(new iv.b(18), false, 1806357037);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f38688d = new d(new iv.b(19), false, -572414733);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f38689e = new d(new iv.b(20), false, 123862442);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f38690f = new d(new iv.b(21), false, -1614123775);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f38691g = new d(new iv.b(22), false, 8613025);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f38692h = new d(new iv.b(23), false, 1030311120);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f38693i = new d(new iv.b(24), false, 897212610);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f38694j = new d(new iv.b(25), false, 595005741);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f38695k = new d(new iv.b(26), false, 153157663);

    public static final void a(int i11, String str, String price, r rVar, boolean z11, n nVar, int i12, int i13) {
        boolean z12;
        int i14;
        long j11;
        m.f(price, "price");
        s sVar = (s) nVar;
        sVar.f0(1798934141);
        int i15 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.f(price) ? 256 : 128) | (sVar.f(rVar) ? 2048 : 1024);
        int i16 = i13 & 16;
        if (i16 != 0) {
            i14 = i15 | 24576;
            z12 = z11;
        } else {
            z12 = z11;
            i14 = i15 | (sVar.g(z12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        }
        if (sVar.T(i14 & 1, (i14 & 9363) != 9362)) {
            boolean z13 = i16 != 0 ? false : z12;
            float f5 = (float) 1.5d;
            if (z13) {
                sVar.d0(-2096100924);
                j11 = ((s1) sVar.j(v1.f31180a)).f31017a;
            } else {
                sVar.d0(-2096099676);
                j11 = ((s1) sVar.j(v1.f31180a)).A;
            }
            sVar.p(false);
            float f11 = 16;
            r rVarB = c.B(d0.n.j(rVar, f5, j11, f.d(8)), f11, 12);
            a2 a2VarA = z1.a(i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarB);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(j.f56917f, a2VarA, sVar);
            t.J(j.f56916e, q1VarL, sVar);
            h hVar = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(j.f56915d, rVarC, sVar);
            d0.n.c(se.k.y(i11, sVar, i14 & 14), null, e2.n(o.f58481a, 45), null, w2.i.f54517d, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 25008, 104);
            d0 d0Var = ua.f31167a;
            y0 y0VarA = y0.a((y0) sVar.j(d0Var), 0L, j3.A(16), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            ua.b(str, c.C(new i1(1.0f, true), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar, 6, 0, 65532);
            ua.b(price, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), ((s1) sVar.j(v1.f31180a)).f31017a, j3.A(14), n3.s.N, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, (i14 >> 6) & 14, 0, 65534);
            sVar = sVar;
            sVar.p(true);
            z12 = z13;
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new s2(i11, str, price, rVar, z12, i12, i13);
        }
    }

    public static final void b(int i11, n nVar, int i12) {
        s sVar = (s) nVar;
        sVar.f0(-1345264819);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12;
        if (sVar.T(i13 & 1, (i13 & 3) != 2)) {
            a2 a2VarA = z1.a(i.f35303a, z1.c.L, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            o oVar = o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            h hVar = j.f56917f;
            t.J(hVar, a2VarA, sVar);
            h hVar2 = j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            h hVar3 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            h hVar4 = j.f56915d;
            t.J(hVar4, rVarC, sVar);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            w4.c.r(1.0f, true, sVar);
            z1.i iVar2 = z1.c.M;
            r rVarC2 = c.C(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 14, 1);
            a2 a2VarA2 = z1.a(i.g(10), iVar2, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC3 = z1.a.c(sVar, rVarC2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, a2VarA2, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC3, sVar);
            d0.n.c(se.k.y(R.drawable.gem_icon_large, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
            ua.b(String.valueOf(i11), null, 0L, j3.A(18), null, n3.s.K, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 199680, 0, 131030);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t0(i11, i12);
        }
    }

    public static final void c(int i11, boolean z11, fz.a onClickLogin, fz.a onClickClaim, fz.a onClickCancel, n nVar, int i12) {
        int i13;
        boolean z12;
        m.f(onClickLogin, "onClickLogin");
        m.f(onClickClaim, "onClickClaim");
        m.f(onClickCancel, "onClickCancel");
        s sVar = (s) nVar;
        sVar.f0(1280833202);
        if ((i12 & 6) == 0) {
            i13 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar.h(onClickLogin) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.h(onClickClaim) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= sVar.h(onClickCancel) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            o oVar = o.f58481a;
            r rVarV = c.v(c.F(e2.d(oVar, 1.0f)));
            u uVarA = j0.t.a(i.f35305c, z1.c.P, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarV);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(j.f56917f, uVarA, sVar);
            t.J(j.f56916e, q1VarL, sVar);
            h hVar = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(j.f56915d, rVarC, sVar);
            c.g(sVar, v.a(oVar, 0.5f));
            float f5 = 16;
            int i14 = i13;
            g.a(c.j(e2.s(c.C(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, 1), 200), 1.0f), R.raw.gem_earn, null, null, false, null, sVar, 6, 124);
            ua.b(p.j(i11, "+"), null, 0L, j3.A(32), null, n3.s.L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 199680, 0, 131030);
            sVar = sVar;
            c.g(sVar, v.a(oVar, 1.5f));
            if (z11) {
                sVar.d0(-1786476885);
                iu.k.e(onClickLogin, e2.e(c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), false, 0L, null, f38685a, sVar, ((i14 >> 6) & 14) | 196656, 28);
                c.g(sVar, e2.g(oVar, 12));
                z12 = true;
                k7.i(onClickCancel, e2.e(c.C(e2.i(oVar, 46, CropImageView.DEFAULT_ASPECT_RATIO, 2), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), false, null, null, d0.n.a(((s1) sVar.j(v1.f31180a)).f31017a, 1), c.d(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 3), f38686b, sVar, ((i14 >> 12) & 14) | 817889328, 316);
                sVar = sVar;
                ep.a.C(oVar, f5, sVar, false);
            } else {
                z12 = true;
                sVar.d0(-1785450568);
                iu.k.e(onClickClaim, e2.e(c.A(oVar, f5), 1.0f), false, 0L, null, f38687c, sVar, ((i14 >> 9) & 14) | 196656, 28);
                sVar.p(false);
            }
            sVar.p(z12);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new s2(i11, i12, onClickLogin, onClickClaim, onClickCancel, z11);
        }
    }

    public static final void d(fz.a onShowNext, fz.a onClickLogin, x xVar, n nVar, int i11) {
        x xVar2;
        int i12;
        x xVar3;
        m.f(onShowNext, "onShowNext");
        m.f(onClickLogin, "onClickLogin");
        s sVar = (s) nVar;
        sVar.f0(1407308061);
        int i13 = i11 | (sVar.h(onShowNext) ? 4 : 2) | (sVar.h(onClickLogin) ? 32 : 16) | 128;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(x.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-897);
                xVar3 = (x) viewModelA;
            } else {
                sVar.W();
                i12 = i13 & (-897);
                xVar3 = xVar;
            }
            sVar.q();
            b1 b1VarO = t.o(xVar3.T, sVar);
            if (((Boolean) t.o(xVar3.L, sVar).getValue()).booleanValue()) {
                sVar.d0(1939003270);
                tv.a.c(sVar, 0);
            } else {
                sVar.d0(1936913157);
            }
            sVar.p(false);
            boolean zH = sVar.h(xVar3);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new s0(xVar3, null, 3);
                sVar.o0(objQ);
            }
            t.f((fz.e) objQ, b0.f48488a, sVar);
            l lVar = (l) b1VarO.getValue();
            if (m.a(lVar, mu.j.f42143a)) {
                sVar.d0(-491634068);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            } else {
                if (!(lVar instanceof mu.k)) {
                    throw p.x(sVar, -491635816, false);
                }
                sVar.d0(-491632133);
                mu.k kVar = (mu.k) lVar;
                if (kVar.f42145b > 0) {
                    sVar.d0(1939323562);
                    int i14 = i12;
                    c(kVar.f42145b, kVar.f42146c, onClickLogin, onShowNext, onShowNext, sVar, ((i14 << 3) & 896) | ((i14 << 9) & 7168) | ((i14 << 12) & 57344));
                    sVar.p(false);
                } else {
                    sVar.d0(1939602686);
                    tv.a.d(0, 1, sVar, null);
                    sVar.p(false);
                }
                sVar.p(false);
            }
            xVar2 = xVar3;
        } else {
            sVar.W();
            xVar2 = xVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fp.e(onShowNext, onClickLogin, (ViewModel) xVar2, i11, 15);
        }
    }

    public static final void e(l gemUiState, fz.c launchPurchase, fz.a purchaseStreakFreeze, n nVar, int i11) {
        fz.c cVar;
        m.f(gemUiState, "gemUiState");
        m.f(launchPurchase, "launchPurchase");
        m.f(purchaseStreakFreeze, "purchaseStreakFreeze");
        s sVar = (s) nVar;
        sVar.f0(447206196);
        int i12 = i11 | (sVar.f(gemUiState) ? 4 : 2) | (sVar.h(launchPurchase) ? 32 : 16) | (sVar.h(purchaseStreakFreeze) ? 256 : 128);
        if (!sVar.T(i12 & 1, (i12 & 147) != 146)) {
            cVar = launchPurchase;
            sVar.W();
        } else if (gemUiState.equals(mu.j.f42143a)) {
            sVar.d0(268431235);
            tv.a.d(0, 1, sVar, null);
            sVar.p(false);
            cVar = launchPurchase;
        } else {
            if (!(gemUiState instanceof mu.k)) {
                throw p.x(sVar, 268433885, false);
            }
            sVar.d0(-268389202);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            int i13 = i12 << 6;
            f(b1Var, (b1) objQ2, gemUiState, launchPurchase, purchaseStreakFreeze, sVar, (i13 & 57344) | (i13 & 7168) | 54);
            o oVar = o.f58481a;
            r rVarY = d0.n.y(e2.d(oVar, 1.0f), d0.n.u(sVar), true, 12);
            j0.d dVar = i.f35305c;
            z1.h hVar = z1.c.O;
            u uVarA = j0.t.a(dVar, hVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarY);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            h hVar2 = j.f56917f;
            t.J(hVar2, uVarA, sVar);
            h hVar3 = j.f56916e;
            t.J(hVar3, q1VarL, sVar);
            h hVar4 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            h hVar5 = j.f56915d;
            t.J(hVar5, rVarC, sVar);
            String strE0 = ub.a.e0(sVar, R.string.gem);
            d0 d0Var = ua.f31167a;
            y0 y0Var = (y0) sVar.j(d0Var);
            long jA = j3.A(16);
            n3.s sVar2 = n3.s.H;
            float f5 = 16;
            ua.b(strE0, c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, 0L, jA, sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 48, 0, 65532);
            ua.b(ub.a.e0(sVar, R.string.gem_desc), c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), ((s1) sVar.j(v1.f31180a)).f31036s, j3.A(14), sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 48, 0, 65532);
            r rVarC2 = c.C(c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            u uVarA2 = j0.t.a(i.g(f5), hVar, sVar, 6);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC3 = z1.a.c(sVar, rVarC2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar2, uVarA2, sVar);
            t.J(hVar3, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                e.A(iHashCode2, sVar, iHashCode2, hVar4);
            }
            t.J(hVar5, rVarC3, sVar);
            ArrayList arrayList = ((mu.k) gemUiState).f42148e;
            int size = arrayList.size();
            Object obj = BuildConfig.VERSION_NAME;
            String str = (String) (size > 0 ? arrayList.get(0) : BuildConfig.VERSION_NAME);
            int i14 = i12 & 112;
            boolean z11 = i14 == 32;
            Object objQ3 = sVar.Q();
            if (z11 || objQ3 == gVar) {
                cVar = launchPurchase;
                objQ3 = new x0(cVar, 1);
                sVar.o0(objQ3);
            } else {
                cVar = launchPurchase;
            }
            a(R.drawable.gem_count_1200, "1200", str, iu.k.q(6, 7, (fz.a) objQ3, sVar, oVar, false), false, sVar, 48, 16);
            String str2 = (String) (1 < arrayList.size() ? arrayList.get(1) : BuildConfig.VERSION_NAME);
            boolean z12 = i14 == 32;
            Object objQ4 = sVar.Q();
            if (z12 || objQ4 == gVar) {
                objQ4 = new x0(cVar, 2);
                sVar.o0(objQ4);
            }
            a(R.drawable.gem_count_3000, "3000", str2, iu.k.q(6, 7, (fz.a) objQ4, sVar, oVar, false), false, sVar, 48, 16);
            if (2 < arrayList.size()) {
                obj = arrayList.get(2);
            }
            String str3 = (String) obj;
            boolean z13 = i14 == 32;
            Object objQ5 = sVar.Q();
            if (z13 || objQ5 == gVar) {
                objQ5 = new x0(cVar, 3);
                sVar.o0(objQ5);
            }
            a(R.drawable.gem_count_4500, "5000", str3, iu.k.q(6, 7, (fz.a) objQ5, sVar, oVar, false), false, sVar, 48, 16);
            sVar = sVar;
            com.google.android.material.datepicker.d.B(sVar, true, true, false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fp.e(gemUiState, cVar, purchaseStreakFreeze, i11, 16);
        }
    }

    public static final void f(b1 showRefillDayStreak, b1 showRefillGem, l gemUiState, fz.c launchPurchase, fz.a purchaseStreakFreeze, n nVar, int i11) {
        int i12;
        boolean z11;
        boolean z12;
        Object k0Var;
        int i13;
        m.f(showRefillDayStreak, "showRefillDayStreak");
        m.f(showRefillGem, "showRefillGem");
        m.f(gemUiState, "gemUiState");
        m.f(launchPurchase, "launchPurchase");
        m.f(purchaseStreakFreeze, "purchaseStreakFreeze");
        s sVar = (s) nVar;
        sVar.f0(-121097627);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(showRefillDayStreak) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(showRefillGem) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & 512) == 0 ? sVar.f(gemUiState) : sVar.h(gemUiState) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(launchPurchase) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(purchaseStreakFreeze) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i14 = i12;
        if (!sVar.T(i14 & 1, (i14 & 9363) != 9362)) {
            sVar.W();
        } else if (gemUiState.equals(mu.j.f42143a)) {
            sVar.d0(-410693335);
            sVar.p(false);
        } else {
            if (!(gemUiState instanceof mu.k)) {
                throw p.x(sVar, -410694071, false);
            }
            sVar.d0(153470071);
            boolean zBooleanValue = ((Boolean) showRefillDayStreak.getValue()).booleanValue();
            l1.g gVar = l1.m.f39353a;
            if (zBooleanValue) {
                sVar.d0(153505008);
                int i15 = ((mu.k) gemUiState).f42144a;
                int i16 = i14 & 14;
                boolean z13 = i16 == 4;
                Object objQ = sVar.Q();
                if (z13 || objQ == gVar) {
                    objQ = new i0(12, showRefillDayStreak);
                    sVar.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                boolean z14 = ((i14 & 896) == 256 || ((i14 & 512) != 0 && sVar.h(gemUiState))) | ((i14 & 112) == 32) | ((57344 & i14) == 16384) | (i16 == 4);
                Object objQ2 = sVar.Q();
                if (z14 || objQ2 == gVar) {
                    i13 = i15;
                    k0Var = new k0(gemUiState, showRefillGem, purchaseStreakFreeze, showRefillDayStreak, 11);
                    sVar.o0(k0Var);
                } else {
                    i13 = i15;
                    k0Var = objQ2;
                }
                z11 = false;
                i(i13, 0, aVar, (fz.a) k0Var, sVar);
            } else {
                z11 = false;
                sVar.d0(143735389);
            }
            sVar.p(z11);
            if (((Boolean) showRefillGem.getValue()).booleanValue()) {
                sVar.d0(153993506);
                mu.k kVar = (mu.k) gemUiState;
                boolean z15 = (i14 & 112) == 32;
                Object objQ3 = sVar.Q();
                if (z15 || objQ3 == gVar) {
                    objQ3 = new i0(13, showRefillGem);
                    sVar.o0(objQ3);
                }
                fz.a aVar2 = (fz.a) objQ3;
                boolean z16 = (i14 & 7168) == 2048;
                Object objQ4 = sVar.Q();
                if (z16 || objQ4 == gVar) {
                    objQ4 = new o1(launchPurchase, 13);
                    sVar.o0(objQ4);
                }
                z12 = false;
                j(kVar, aVar2, (fz.c) objQ4, sVar, 0);
            } else {
                z12 = false;
                sVar.d0(143735389);
            }
            sVar.p(z12);
            sVar.p(z12);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.e2(showRefillDayStreak, showRefillGem, gemUiState, launchPurchase, purchaseStreakFreeze, i11, 6);
        }
    }

    public static final void g(int i11, fz.a onDismissRequest, fz.a onClickUseGem, fz.a onClickBilling, n nVar, int i12) {
        s sVar;
        m.f(onDismissRequest, "onDismissRequest");
        m.f(onClickUseGem, "onClickUseGem");
        m.f(onClickBilling, "onClickBilling");
        s sVar2 = (s) nVar;
        sVar2.f0(-2075491944);
        int i13 = (sVar2.h(onClickBilling) ? 2048 : 1024) | i12 | (sVar2.d(i11) ? 4 : 2) | (sVar2.h(onDismissRequest) ? 32 : 16) | (sVar2.h(onClickUseGem) ? 256 : 128);
        if (sVar2.T(i13 & 1, (i13 & 1171) != 1170)) {
            sVar = sVar2;
            a6.a(onDismissRequest, null, a6.f(6, 2, null, sVar2), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(676970779, new fu.v(i11, onClickUseGem, onClickBilling, onDismissRequest, 2), sVar2), sVar, (i13 >> 3) & 14, 384, 4090);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n0(i11, onDismissRequest, onClickUseGem, onClickBilling, i12);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r13v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v0 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v0 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v17 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v16 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v18 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v19 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v20 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v21 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v22 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v23 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v16 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void h(int r40, fz.a r41, fz.a r42, fz.a r43, l1.n r44, int r45) {
        /*
            Method dump skipped, instruction units count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ku.a.h(int, fz.a, fz.a, fz.a, l1.n, int):void");
    }

    public static final void i(int i11, int i12, fz.a onDismissRequest, fz.a onClickBuy, n nVar) {
        int i13;
        s sVar;
        m.f(onDismissRequest, "onDismissRequest");
        m.f(onClickBuy, "onClickBuy");
        s sVar2 = (s) nVar;
        sVar2.f0(945361100);
        if ((i12 & 6) == 0) {
            i13 = (sVar2.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar2.h(onDismissRequest) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar2.h(onClickBuy) ? 256 : 128;
        }
        if (sVar2.T(i13 & 1, (i13 & 147) != 146)) {
            sVar = sVar2;
            a6.a(onDismissRequest, null, a6.f(6, 2, null, sVar2), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-1960520561, new h0(i11, 1, onClickBuy, onDismissRequest), sVar2), sVar, (i13 >> 3) & 14, 384, 4090);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new gs.o(i11, onDismissRequest, onClickBuy, i12, 2);
        }
    }

    public static final void j(mu.k gemUiState, fz.a onDismissRequest, fz.c buyGems, n nVar, int i11) {
        s sVar;
        m.f(gemUiState, "gemUiState");
        m.f(onDismissRequest, "onDismissRequest");
        m.f(buyGems, "buyGems");
        s sVar2 = (s) nVar;
        sVar2.f0(2094001961);
        int i12 = i11 | (sVar2.h(gemUiState) ? 4 : 2);
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(onDismissRequest) ? 32 : 16;
        }
        int i13 = i12 | (sVar2.h(buyGems) ? 256 : 128);
        if (sVar2.T(i13 & 1, (i13 & 147) != 146)) {
            Object objQ = sVar2.Q();
            if (objQ == l1.m.f39353a) {
                objQ = ep.a.r(1, sVar2);
            }
            sVar = sVar2;
            a6.a(onDismissRequest, null, a6.f(6, 2, null, sVar2), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-798425236, new br.j(gemUiState, buyGems, onDismissRequest, (b1) objQ, 8), sVar2), sVar, (i13 >> 3) & 14, 384, 4090);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(gemUiState, onDismissRequest, buyGems, i11, 22);
        }
    }
}
