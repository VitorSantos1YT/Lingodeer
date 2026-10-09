package nh;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import b0.o1;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import fu.j0;
import g2.f0;
import h1.r4;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.o;
import j0.t;
import j0.u;
import j0.z1;
import java.util.Locale;
import java.util.Map;
import km.s0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.a1;
import l1.b3;
import l1.c3;
import l1.h1;
import l1.n;
import l1.q1;
import l1.s;
import l1.x1;
import mt.k6;
import nv.p;
import ph.a0;
import w2.q0;
import y2.j;
import y2.k;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final void a(Exception exc, fz.a aVar, r rVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-407948011);
        if (sVar.T(i11 & 1, (i11 & 129) != 128)) {
            r rVarD = e2.d(rVar, 1.0f);
            u uVarA = t.a(j0.i.f35307e, z1.c.P, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarD);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(j.f56917f, uVarA, sVar);
            l1.t.J(j.f56916e, q1VarL, sVar);
            y2.h hVar = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(j.f56915d, rVarC, sVar);
            tv.a.d(0, 1, sVar, null);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(exc, aVar, rVar, i11, 1);
        }
    }

    public static final void b(Map map, fz.c cVar, r rVar, n nVar, int i11) {
        r rVar2;
        boolean z11;
        boolean z12;
        s sVar = (s) nVar;
        sVar.f0(1483393280);
        int i12 = i11 | (sVar.h(map) ? 4 : 2) | (sVar.h(cVar) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = defpackage.e.v(0, sVar);
            }
            a1 a1Var = (a1) objQ;
            q0 q0VarD = o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = j.f56917f;
            l1.t.J(hVar, q0VarD, sVar);
            y2.h hVar2 = j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            rVar2 = rVar;
            r rVarY = d0.n.y(e2.d(rVar2, 1.0f), d0.n.u(sVar), true, 12);
            u uVarA = t.a(j0.i.g(24), z1.c.O, sVar, 6);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            j0.c.g(sVar, e2.g(oVar, 42));
            sVar.d0(2005539840);
            for (Map.Entry entry : map.entrySet()) {
                mh.b bVar = (mh.b) entry.getKey();
                o9.b bVarA = o9.d.a((uz.i) entry.getValue(), sVar);
                if (bVarA.c() > 0) {
                    sVar.d0(-401247144);
                    String strB = bVar.b();
                    Object objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new s0(a1Var, null, 7);
                        sVar.o0(objQ2);
                    }
                    l1.t.f((fz.e) objQ2, strB, sVar);
                    int i13 = i12 & 112;
                    boolean z13 = i13 == 32;
                    Object objQ3 = sVar.Q();
                    if (z13 || objQ3 == gVar) {
                        objQ3 = new o1(cVar, 21);
                        sVar.o0(objQ3);
                    }
                    fz.c cVar2 = (fz.c) objQ3;
                    boolean z14 = i13 == 32;
                    Object objQ4 = sVar.Q();
                    if (z14 || objQ4 == gVar) {
                        objQ4 = new o1(cVar, 22);
                        sVar.o0(objQ4);
                    }
                    fz.c cVar3 = (fz.c) objQ4;
                    boolean z15 = i13 == 32;
                    Object objQ5 = sVar.Q();
                    if (z15 || objQ5 == gVar) {
                        objQ5 = new o1(cVar, 23);
                        sVar.o0(objQ5);
                    }
                    d(bVar, bVarA, cVar2, cVar3, (fz.c) objQ5, null, sVar, 64);
                    z12 = false;
                } else {
                    z12 = false;
                    sVar.d0(-406644213);
                }
                sVar.p(z12);
                oVar = oVar;
            }
            z1.o oVar2 = oVar;
            sVar.p(false);
            ep.a.C(oVar2, 72, sVar, true);
            if (((h1) a1Var).l() < map.size()) {
                sVar.d0(1098450257);
                z11 = false;
                tv.a.d(0, 0, sVar, d0.n.h(oVar2, ((s1) sVar.j(v1.f31180a)).f31031n, f0.f28556b));
            } else {
                z11 = false;
                sVar.d0(1092200316);
            }
            sVar.p(z11);
            sVar.p(true);
        } else {
            rVar2 = rVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(map, cVar, false, rVar2, i11, 2);
        }
    }

    public static final void c(fz.c onViewMoreClick, fz.c onLessonClick, r rVar, a0 a0Var, n nVar, int i11) {
        r rVar2;
        a0 a0Var2;
        int i12;
        a0 a0Var3;
        r rVar3;
        m.f(onViewMoreClick, "onViewMoreClick");
        m.f(onLessonClick, "onLessonClick");
        s sVar = (s) nVar;
        sVar.f0(-1232684635);
        int i13 = i11 | (sVar.h(onViewMoreClick) ? 4 : 2) | (sVar.h(onLessonClick) ? 32 : 16) | 1408;
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            sVar.Y();
            int i14 = i11 & 1;
            z1.o oVar = z1.o.f58481a;
            if (i14 == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(a0.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-7169);
                a0Var3 = (a0) viewModelA;
                rVar3 = oVar;
            } else {
                sVar.W();
                a0Var3 = a0Var;
                i12 = i13 & (-7169);
                rVar3 = rVar;
            }
            sVar.q();
            b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(a0Var3.K, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7);
            r rVarD = e2.d(rVar3, 1.0f);
            u uVarA = t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarD);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(j.f56917f, uVarA, sVar);
            l1.t.J(j.f56916e, q1VarL, sVar);
            y2.h hVar = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(j.f56915d, rVarC, sVar);
            oh.d dVar = (oh.d) b3VarCollectAsStateWithLifecycle.getValue();
            if (dVar instanceof oh.b) {
                sVar.d0(336484254);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            } else {
                boolean z11 = dVar instanceof oh.c;
                l1.g gVar = l1.m.f39353a;
                if (z11) {
                    sVar.d0(1841164208);
                    oh.d dVar2 = (oh.d) b3VarCollectAsStateWithLifecycle.getValue();
                    m.d(dVar2, "null cannot be cast to non-null type com.lingo.fluent.ui.compose.state.PdFeedUiState.Success");
                    Map map = ((oh.c) dVar2).f44915a;
                    boolean zH = ((i12 & 112) == 32) | ((i12 & 14) == 4) | sVar.h(a0Var3);
                    Object objQ = sVar.Q();
                    if (zH || objQ == gVar) {
                        objQ = new j0(onLessonClick, onViewMoreClick, a0Var3, 26);
                        sVar.o0(objQ);
                    }
                    b(map, (fz.c) objQ, e2.d(oVar, 1.0f), sVar, 384);
                    sVar.p(false);
                } else {
                    if (!(dVar instanceof oh.a)) {
                        throw p.x(sVar, 336483872, false);
                    }
                    sVar.d0(1842199112);
                    oh.d dVar3 = (oh.d) b3VarCollectAsStateWithLifecycle.getValue();
                    m.d(dVar3, "null cannot be cast to non-null type com.lingo.fluent.ui.compose.state.PdFeedUiState.Error");
                    Exception exc = ((oh.a) dVar3).f44913a;
                    Object objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new ju.d(25);
                        sVar.o0(objQ2);
                    }
                    a(exc, (fz.a) objQ2, e2.d(oVar, 1.0f), sVar, 432);
                    sVar.p(false);
                }
            }
            sVar.p(true);
            rVar2 = rVar3;
            a0Var2 = a0Var3;
        } else {
            sVar.W();
            rVar2 = rVar;
            a0Var2 = a0Var;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.t(onViewMoreClick, onLessonClick, rVar2, a0Var2, i11, 27);
        }
    }

    public static final void d(mh.b bVar, o9.b bVar2, fz.c cVar, fz.c cVar2, fz.c cVar3, r rVar, n nVar, int i11) {
        fz.c cVar4;
        r rVar2;
        s sVar = (s) nVar;
        sVar.f0(-1728408872);
        int i12 = i11 | (sVar.d(bVar.ordinal()) ? 4 : 2) | (sVar.h(bVar2) ? 32 : 16) | (sVar.h(cVar) ? 256 : 128) | (sVar.h(cVar2) ? 2048 : 1024) | (sVar.h(cVar3) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | 196608;
        if (sVar.T(i12 & 1, (74899 & i12) != 74898)) {
            u uVarA = t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = j.f56917f;
            l1.t.J(hVar, uVarA, sVar);
            y2.h hVar2 = j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            sVar.d0(-1168520582);
            e20.a aVarA = q10.b.a(sVar);
            sVar.d0(-1633490746);
            boolean zF = sVar.f(null) | sVar.f(aVarA);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = w4.c.e(xt.u.class, aVarA, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            xt.u uVar = (xt.u) objQ;
            float f5 = 14;
            float f11 = 12;
            r rVarE = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, 6);
            z1.i iVar2 = z1.c.M;
            j0.b bVar3 = j0.i.f35303a;
            a2 a2VarA = z1.a(bVar3, iVar2, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, rVarE);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, a2VarA, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            j0.c.g(sVar, d0.n.h(e2.p(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 5, CropImageView.DEFAULT_ASPECT_RATIO, 11), 4, f5), bVar.a(), r0.f.d(2)));
            String lowerCase = bVar.b().toLowerCase(Locale.ROOT);
            m.e(lowerCase, "toLowerCase(...)");
            ua.b(ub.a.e0(sVar, uVar.c(lowerCase)), null, 0L, 0L, null, n3.s.L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 196608, 0, 131038);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            w4.c.r(1.0f, true, sVar);
            r rVarE2 = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, 11);
            boolean z11 = ((i12 & 14) == 4) | ((i12 & 896) == 256);
            Object objQ2 = sVar.Q();
            if (z11 || objQ2 == gVar) {
                objQ2 = new l1.z1(17, cVar, bVar);
                sVar.o0(objQ2);
            }
            r rVarQ = iu.k.q(6, 7, (fz.a) objQ2, sVar, rVarE2, false);
            a2 a2VarA2 = z1.a(bVar3, iVar2, sVar, 48);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            r rVarC3 = z1.a.c(sVar, rVarQ);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, a2VarA2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            String strE0 = ub.a.e0(sVar, R.string.view_all);
            long jA = j3.A(14);
            n3.s sVar2 = n3.s.K;
            c3 c3Var = v1.f31180a;
            ua.b(strE0, null, ((s1) sVar.j(c3Var)).f31017a, jA, null, sVar2, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 199680, 0, 131026);
            r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar, 0), null, e2.n(oVar, 18), ((s1) sVar.j(c3Var)).f31017a, sVar, 440, 0);
            sVar.p(true);
            sVar.p(true);
            j0.g gVarG = j0.i.g(f11);
            j0.v1 v1VarD = j0.c.d(f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            boolean z12 = ((i12 & 7168) == 2048) | ((i12 & 112) == 32 || sVar.h(bVar2)) | ((i12 & 57344) == 16384);
            Object objQ3 = sVar.Q();
            if (z12 || objQ3 == gVar) {
                cVar4 = cVar2;
                objQ3 = new j0(bVar2, cVar4, cVar3, 27);
                sVar.o0(objQ3);
            } else {
                cVar4 = cVar2;
            }
            ue.f.c(null, null, v1VarD, gVarG, null, null, false, null, (fz.c) objQ3, sVar, 24960);
            sVar = sVar;
            sVar.p(true);
            rVar2 = oVar;
        } else {
            cVar4 = cVar2;
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.f0(bVar, bVar2, cVar, cVar4, cVar3, rVar2, i11, 11);
        }
    }
}
