package tv;

import ad.p;
import android.content.res.Resources;
import android.graphics.Color;
import bp.h2;
import bt.w6;
import com.google.api.Service;
import com.google.logging.type.LogSeverity;
import com.google.protobuf.DescriptorProtos;
import com.lingodeer.R;
import com.stkouyu.util.httputil.Consts;
import com.yalantis.ucrop.view.CropImageView;
import d1.h0;
import dt.n2;
import dt.u;
import fr.j3;
import fr.k0;
import g2.f0;
import g2.r0;
import gr.x;
import h1.a6;
import h1.e8;
import h1.g7;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.v1;
import hh.p0;
import iv.w0;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.z1;
import j3.y0;
import java.util.List;
import kotlin.jvm.internal.m;
import l1.b1;
import l1.b3;
import l1.c3;
import l1.d0;
import l1.g1;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import qy.b0;
import rz.w;
import w2.q0;
import y2.k;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f52632a = new t1.d(new w(6), false, 1341669265);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f52633b = new t1.d(new w(7), false, -1130765940);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.d f52634c = new t1.d(new bt.d(2), false, 726802228);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.d f52635d = new t1.d(new bt.d(3), false, 105711052);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t1.d f52636e = new t1.d(new w(8), false, 565689687);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t1.d f52637f = new t1.d(new w(9), false, -927385099);

    public static final void a(int i11, fz.a onClickExplain, n nVar, r rVar) {
        r rVar2;
        m.f(onClickExplain, "onClickExplain");
        s sVar = (s) nVar;
        sVar.f0(-1657576016);
        int i12 = i11 | 48;
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new okhttp3.b(13, onClickExplain);
                sVar.o0(objQ);
            }
            rVar2 = rVar;
            k7.h((fz.a) objQ, rVar2, false, null, t1.e.d(-1992436493, new w(10), sVar), sVar, 196656, 28);
        } else {
            rVar2 = rVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new u(i11, 3, onClickExplain, rVar2);
        }
    }

    public static final void b(int i11, n nVar, int i12) {
        int i13;
        boolean z11;
        s sVar = (s) nVar;
        sVar.f0(1810007165);
        if ((i12 & 6) == 0) {
            i13 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if (sVar.T(i13 & 1, (i13 & 3) != 2)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = p0.s(CropImageView.DEFAULT_ASPECT_RATIO, sVar);
            }
            g1 g1Var = (g1) objQ;
            Integer numValueOf = Integer.valueOf(i11);
            boolean z12 = (i13 & 14) == 4;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new h2(i11, g1Var, (vy.d) null, 13);
                sVar.o0(objQ2);
            }
            t.f((fz.e) objQ2, numValueOf, sVar);
            o oVar = o.f58481a;
            r rVarA = d2.h.a(e2.e(oVar, 1.0f), g1Var.l());
            q0 q0VarD = j0.o.d(z1.c.H, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarA);
            k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, q0VarD, sVar);
            t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar);
            k2.b bVarY = se.k.y(R.drawable.bg_lesson_finish_star_star, sVar, 0);
            float f5 = LogSeverity.NOTICE_VALUE;
            d0.n.c(bVarY, null, e2.n(oVar, f5), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
            d0.n.c(se.k.y(R.drawable.bg_lesson_finish_star, sVar, 0), null, e2.n(oVar, f5), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
            d0.n.c(se.k.y(R.drawable.pic_lesson_finish_star_deer, sVar, 0), null, e2.n(oVar, f5), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
            if (i11 > 0) {
                sVar.d0(1281094848);
                z11 = false;
                ua.b(ub.a.d0(R.string._plus_s_xp, new Object[]{String.valueOf(i11)}, sVar), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 66, 7), ((s1) sVar.j(v1.f31180a)).f31019b, j3.A(20), null, n3.s.L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 199728, 0, 131024);
                sVar = sVar;
            } else {
                z11 = false;
                sVar.d0(1279036479);
            }
            sVar.p(z11);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b(i11, i12);
        }
    }

    public static final void c(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(135850834);
        if (sVar.T(i11 & 1, i11 != 0)) {
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new ju.d(25);
                sVar.o0(objQ);
            }
            h1.k.d((fz.a) objQ, null, null, f52633b, sVar, 3078, 6);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w(i11, 11);
        }
    }

    public static final void d(int i11, int i12, n nVar, r rVar) {
        int i13;
        s sVar = (s) nVar;
        sVar.f0(-838193663);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if (sVar.T(i13 & 1, (i13 & 3) != 2)) {
            o oVar = o.f58481a;
            if (i14 != 0) {
                rVar = oVar;
            }
            p pVarL = gb.r.L(new ad.r(R.raw.dialogue_loading), sVar);
            ad.i iVarE = ff.h.e((wc.h) pVarL.getValue(), false, CropImageView.DEFAULT_ASPECT_RATIO, sVar, 958);
            r rVarD = e2.d(rVar, 1.0f);
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarD);
            k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, q0VarD, sVar);
            t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar);
            wc.h hVar2 = (wc.h) pVarL.getValue();
            boolean zF = sVar.f(iVarE);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = new w6(iVarE, 9);
                sVar.o0(objQ);
            }
            j3.a(hVar2, (fz.a) objQ, j0.r.f35391a.a(e2.g(e2.s(oVar, 100), 50), z1.c.f58467e), null, null, null, sVar, 0, 0, 131064);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.t(rVar, i11, i12, 3);
        }
    }

    public static final void e(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1996088579);
        if (sVar.T(i11 & 1, i11 != 0)) {
            p pVarL = gb.r.L(new ad.r(R.raw.dialogue_loading_grey), sVar);
            ad.i iVarE = ff.h.e((wc.h) pVarL.getValue(), false, CropImageView.DEFAULT_ASPECT_RATIO, sVar, 958);
            o oVar = o.f58481a;
            r rVarD = e2.d(oVar, 1.0f);
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarD);
            k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, q0VarD, sVar);
            t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar);
            wc.h hVar2 = (wc.h) pVarL.getValue();
            boolean zF = sVar.f(iVarE);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = new w6(iVarE, 7);
                sVar.o0(objQ);
            }
            j3.a(hVar2, (fz.a) objQ, j0.r.f35391a.a(j0.c.j(e2.s(oVar, 62), 2.47f), z1.c.f58467e), null, null, null, sVar, 0, 0, 131064);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w(i11, 12);
        }
    }

    public static final void f(List list, n nVar, int i11) {
        boolean z11;
        s sVar = (s) nVar;
        sVar.f0(407782339);
        int i12 = i11 | (sVar.h(list) ? 4 : 2);
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            o oVar = o.f58481a;
            r rVarD = e2.d(oVar, 1.0f);
            j0.e eVar = j0.i.f35307e;
            z1.h hVar = z1.c.P;
            j0.u uVarA = j0.t.a(eVar, hVar, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarD);
            k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            t.J(hVar2, uVarA, sVar);
            y2.h hVar3 = y2.j.f56916e;
            t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            t.J(hVar5, rVarC, sVar);
            p pVarL = gb.r.L(new ad.r(R.raw.anima_loading), sVar);
            ad.i iVarE = ff.h.e((wc.h) pVarL.getValue(), false, 1.8f, sVar, 926);
            wc.h hVar6 = (wc.h) pVarL.getValue();
            boolean zF = sVar.f(iVarE);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = new w6(iVarE, 6);
                sVar.o0(objQ);
            }
            j3.a(hVar6, (fz.a) objQ, j0.c.y(e2.n(oVar, 210), CropImageView.DEFAULT_ASPECT_RATIO, -30, 1), null, null, null, sVar, 384, 0, 131064);
            r rVarY = j0.c.y(oVar, CropImageView.DEFAULT_ASPECT_RATIO, -32, 1);
            j0.u uVarA2 = j0.t.a(j0.i.f35305c, hVar, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar2, uVarA2, sVar);
            t.J(hVar3, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            }
            t.J(hVar5, rVarC2, sVar);
            boolean zF2 = sVar.f(list);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = ep.a.r(0, sVar);
            }
            b1 b1Var = (b1) objQ2;
            boolean zF3 = sVar.f(b1Var) | sVar.h(list);
            Object objQ3 = sVar.Q();
            if (zF3 || objQ3 == gVar) {
                objQ3 = new sr.d(6, list, b1Var, null);
                sVar.o0(objQ3);
            }
            t.f((fz.e) objQ3, list, sVar);
            if (list.isEmpty()) {
                z11 = false;
                sVar.d0(-1416913709);
            } else {
                sVar.d0(-1412105330);
                Object obj = list.get(((Number) b1Var.getValue()).intValue() % list.size());
                Object objQ4 = sVar.Q();
                if (objQ4 == gVar) {
                    objQ4 = new st.a(20);
                    sVar.o0(objQ4);
                }
                a0.o.b(obj, null, (fz.c) objQ4, null, null, null, f52634c, sVar, 1573248, 58);
                sVar = sVar;
                z11 = false;
            }
            sVar.p(z11);
            s sVar2 = sVar;
            g7.d(CropImageView.DEFAULT_ASPECT_RATIO, 1, 390, 16, ((s1) sVar.j(v1.f31180a)).f31024f, f0.e(4292928236L), sVar2, e2.g(j0.c.E(j0.c.C(e2.e(oVar, 1.0f), 42, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 22, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 2));
            sVar = sVar2;
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w0(i11, 2, list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x031d  */
    /* JADX WARN: Code duplicated, block: B:105:0x032f  */
    /* JADX WARN: Code duplicated, block: B:108:0x035c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0365  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    /* JADX WARN: Code duplicated, block: B:55:0x017e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0182  */
    /* JADX WARN: Code duplicated, block: B:61:0x019f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01da  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0201  */
    /* JADX WARN: Code duplicated, block: B:85:0x020b  */
    /* JADX WARN: Code duplicated, block: B:86:0x020d  */
    /* JADX WARN: Code duplicated, block: B:92:0x021a  */
    /* JADX WARN: Code duplicated, block: B:95:0x023f  */
    /* JADX WARN: Code duplicated, block: B:98:0x026e  */
    /* JADX WARN: Code duplicated, block: B:99:0x02be  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    public static final void g(float f5, Resources resources, n nVar, final int i11, final int i12) {
        int i13;
        final Resources resources2;
        boolean z11;
        s sVar;
        x1 x1VarT;
        Resources resources3;
        c3 c3Var;
        o oVar;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        int i14;
        ad.i iVarE;
        boolean zF;
        Object objQ;
        Object obj;
        int iHashCode2;
        String strM;
        ?? r9;
        String strM2;
        Object objQ2;
        b1 b1Var;
        boolean z12;
        boolean z13;
        Object objQ3;
        Object objQ4;
        Resources resources4;
        b3 b3VarB;
        boolean zF2;
        Object objQ5;
        Object objQ6;
        boolean z14;
        s sVar2;
        final float f11 = f5;
        s sVar3 = (s) nVar;
        sVar3.f0(386525458);
        if ((i11 & 6) == 0) {
            i13 = (sVar3.c(f11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= sVar3.g(false) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 == 0) {
            if ((i11 & 384) == 0) {
                resources2 = resources;
                i13 |= sVar3.h(resources2) ? 256 : 128;
            }
            if ((i13 & 147) != 146) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar3.T(i13 & 1, z11)) {
                if (i15 != 0) {
                    resources3 = null;
                } else {
                    resources3 = resources2;
                }
                c3Var = v1.f31180a;
                long j11 = ((s1) sVar3.j(c3Var)).f31033p;
                r0 r0Var = f0.f28556b;
                oVar = o.f58481a;
                r rVarD = e2.d(d0.n.h(oVar, j11, r0Var), 1.0f);
                j0.e eVar = j0.i.f35307e;
                z1.h hVar2 = z1.c.P;
                j0.u uVarA = j0.t.a(eVar, hVar2, sVar3, 54);
                iHashCode = Long.hashCode(sVar3.T);
                q1 q1VarL = sVar3.l();
                r rVarC = z1.a.c(sVar3, rVarD);
                k.J.getClass();
                iVar = y2.j.f56913b;
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                y2.h hVar3 = y2.j.f56917f;
                t.J(hVar3, uVarA, sVar3);
                y2.h hVar4 = y2.j.f56916e;
                t.J(hVar4, q1VarL, sVar3);
                hVar = y2.j.f56918g;
                if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                }
                y2.h hVar5 = y2.j.f56915d;
                t.J(hVar5, rVarC, sVar3);
                p pVarL = gb.r.L(new ad.r(R.raw.anima_loading), sVar3);
                i14 = i13;
                iVarE = ff.h.e((wc.h) pVarL.getValue(), false, 1.8f, sVar3, 926);
                wc.h hVar6 = (wc.h) pVarL.getValue();
                zF = sVar3.f(iVarE);
                objQ = sVar3.Q();
                obj = l1.m.f39353a;
                if (zF || objQ == obj) {
                    objQ = new w6(iVarE, 8);
                    sVar3.o0(objQ);
                }
                j3.a(hVar6, (fz.a) objQ, j0.c.y(e2.n(oVar, 210), CropImageView.DEFAULT_ASPECT_RATIO, -30, 1), null, null, null, sVar3, 384, 0, 131064);
                r rVarY = j0.c.y(oVar, CropImageView.DEFAULT_ASPECT_RATIO, -32, 1);
                j0.u uVarA2 = j0.t.a(j0.i.f35305c, hVar2, sVar3, 48);
                iHashCode2 = Long.hashCode(sVar3.T);
                q1 q1VarL2 = sVar3.l();
                r rVarC2 = z1.a.c(sVar3, rVarY);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                t.J(hVar3, uVarA2, sVar3);
                t.J(hVar4, q1VarL2, sVar3);
                if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar);
                }
                t.J(hVar5, rVarC2, sVar3);
                sVar3.d0(158402110);
                if (resources3 != null) {
                    strM = resources3.getString(R.string.loading_tips_1);
                } else {
                    strM = null;
                }
                if (strM == null) {
                    r9 = 0;
                    strM = ep.a.m(sVar3, -1518908859, R.string.loading_tips_1, sVar3, false);
                } else {
                    r9 = 0;
                    sVar3.d0(-1518910347);
                    sVar3.p(false);
                }
                if (resources3 != null) {
                    strM2 = resources3.getString(R.string.loading_tips_2);
                } else {
                    strM2 = null;
                }
                if (strM2 == null) {
                    strM2 = ep.a.m(sVar3, -1518905371, R.string.loading_tips_2, sVar3, r9);
                } else {
                    sVar3.d0(-1518906859);
                    sVar3.p(r9);
                }
                String[] strArr = {strM, strM2};
                objQ2 = sVar3.Q();
                if (objQ2 == obj) {
                    objQ2 = ep.a.r(r9, sVar3);
                }
                b1Var = (b1) objQ2;
                if (f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z12);
                if ((i14 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objQ3 = sVar3.Q();
                if (z13 || objQ3 == obj) {
                    objQ3 = new k0(f5, 1, b1Var, null);
                    sVar3.o0(objQ3);
                }
                t.f((fz.e) objQ3, boolValueOf, sVar3);
                String str = strArr[((Number) b1Var.getValue()).intValue() % 2];
                objQ4 = sVar3.Q();
                if (objQ4 == obj) {
                    objQ4 = new st.a(21);
                    sVar3.o0(objQ4);
                }
                a0.o.b(str, null, (fz.c) objQ4, null, null, null, f52635d, sVar3, 1573248, 58);
                sVar3.p(false);
                if (f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
                    sVar3.d0(159993371);
                    g7.d(CropImageView.DEFAULT_ASPECT_RATIO, 1, 390, 16, ((s1) sVar3.j(c3Var)).f31024f, f0.e(4292928236L), sVar3, e2.g(j0.c.E(j0.c.C(e2.e(oVar, 1.0f), 42, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 22, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 2));
                    s sVar4 = sVar3;
                    sVar4.p(false);
                    f11 = f5;
                    z14 = true;
                    resources4 = resources3;
                    sVar2 = sVar4;
                } else {
                    sVar3.d0(160461068);
                    resources4 = resources3;
                    f11 = f5;
                    b3VarB = b0.h.b(f11, null, null, sVar3, i14 & 14, 30);
                    r rVarG = e2.g(j0.c.E(j0.c.C(e2.e(oVar, 1.0f), 52, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 22, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 2);
                    long j12 = ((s1) sVar3.j(c3Var)).f31024f;
                    long jE = f0.e(4292928236L);
                    float f12 = -4;
                    zF2 = sVar3.f(b3VarB);
                    objQ5 = sVar3.Q();
                    if (zF2 || objQ5 == obj) {
                        objQ5 = new h0(b3VarB, 3);
                        sVar3.o0(objQ5);
                    }
                    fz.a aVar = (fz.a) objQ5;
                    objQ6 = sVar3.Q();
                    if (objQ6 == obj) {
                        objQ6 = new st.a(22);
                        sVar3.o0(objQ6);
                    }
                    fz.c cVar = (fz.c) objQ6;
                    z14 = true;
                    g7.c(aVar, rVarG, j12, jE, 1, f12, cVar, sVar3, 1772592, 0);
                    s sVar5 = sVar3;
                    sVar5.p(false);
                    sVar2 = sVar5;
                }
                sVar2.p(z14);
                sVar2.p(z14);
                resources2 = resources4;
                sVar = sVar2;
            } else {
                sVar3.W();
                sVar = sVar3;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: tv.d
                    @Override // fz.e
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iM = t.M(i11 | 1);
                        a.g(f11, resources2, (n) obj2, iM, i12);
                        return b0.f48488a;
                    }
                };
            }
        }
        i13 |= 384;
        resources2 = resources;
        if ((i13 & 147) != 146) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar3.T(i13 & 1, z11)) {
            if (i15 != 0) {
                resources3 = null;
            } else {
                resources3 = resources2;
            }
            c3Var = v1.f31180a;
            long j13 = ((s1) sVar3.j(c3Var)).f31033p;
            r0 r0Var2 = f0.f28556b;
            oVar = o.f58481a;
            r rVarD2 = e2.d(d0.n.h(oVar, j13, r0Var2), 1.0f);
            j0.e eVar2 = j0.i.f35307e;
            z1.h hVar7 = z1.c.P;
            j0.u uVarA3 = j0.t.a(eVar2, hVar7, sVar3, 54);
            iHashCode = Long.hashCode(sVar3.T);
            q1 q1VarL3 = sVar3.l();
            r rVarC3 = z1.a.c(sVar3, rVarD2);
            k.J.getClass();
            iVar = y2.j.f56913b;
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            y2.h hVar8 = y2.j.f56917f;
            t.J(hVar8, uVarA3, sVar3);
            y2.h hVar9 = y2.j.f56916e;
            t.J(hVar9, q1VarL3, sVar3);
            hVar = y2.j.f56918g;
            if (sVar3.S) {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
            }
            y2.h hVar10 = y2.j.f56915d;
            t.J(hVar10, rVarC3, sVar3);
            p pVarL2 = gb.r.L(new ad.r(R.raw.anima_loading), sVar3);
            i14 = i13;
            iVarE = ff.h.e((wc.h) pVarL2.getValue(), false, 1.8f, sVar3, 926);
            wc.h hVar11 = (wc.h) pVarL2.getValue();
            zF = sVar3.f(iVarE);
            objQ = sVar3.Q();
            obj = l1.m.f39353a;
            if (zF) {
                objQ = new w6(iVarE, 8);
                sVar3.o0(objQ);
            } else {
                objQ = new w6(iVarE, 8);
                sVar3.o0(objQ);
            }
            j3.a(hVar11, (fz.a) objQ, j0.c.y(e2.n(oVar, 210), CropImageView.DEFAULT_ASPECT_RATIO, -30, 1), null, null, null, sVar3, 384, 0, 131064);
            r rVarY2 = j0.c.y(oVar, CropImageView.DEFAULT_ASPECT_RATIO, -32, 1);
            j0.u uVarA4 = j0.t.a(j0.i.f35305c, hVar7, sVar3, 48);
            iHashCode2 = Long.hashCode(sVar3.T);
            q1 q1VarL4 = sVar3.l();
            r rVarC4 = z1.a.c(sVar3, rVarY2);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            t.J(hVar8, uVarA4, sVar3);
            t.J(hVar9, q1VarL4, sVar3);
            if (sVar3.S) {
                defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar);
            } else {
                defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar);
            }
            t.J(hVar10, rVarC4, sVar3);
            sVar3.d0(158402110);
            if (resources3 != null) {
                strM = resources3.getString(R.string.loading_tips_1);
            } else {
                strM = null;
            }
            if (strM == null) {
                r9 = 0;
                strM = ep.a.m(sVar3, -1518908859, R.string.loading_tips_1, sVar3, false);
            } else {
                r9 = 0;
                sVar3.d0(-1518910347);
                sVar3.p(false);
            }
            if (resources3 != null) {
                strM2 = resources3.getString(R.string.loading_tips_2);
            } else {
                strM2 = null;
            }
            if (strM2 == null) {
                strM2 = ep.a.m(sVar3, -1518905371, R.string.loading_tips_2, sVar3, r9);
            } else {
                sVar3.d0(-1518906859);
                sVar3.p(r9);
            }
            String[] strArr2 = {strM, strM2};
            objQ2 = sVar3.Q();
            if (objQ2 == obj) {
                objQ2 = ep.a.r(r9, sVar3);
            }
            b1Var = (b1) objQ2;
            if (f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
                z12 = true;
            } else {
                z12 = false;
            }
            Boolean boolValueOf2 = Boolean.valueOf(z12);
            if ((i14 & 14) == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            objQ3 = sVar3.Q();
            if (z13) {
                objQ3 = new k0(f5, 1, b1Var, null);
                sVar3.o0(objQ3);
            } else {
                objQ3 = new k0(f5, 1, b1Var, null);
                sVar3.o0(objQ3);
            }
            t.f((fz.e) objQ3, boolValueOf2, sVar3);
            String str2 = strArr2[((Number) b1Var.getValue()).intValue() % 2];
            objQ4 = sVar3.Q();
            if (objQ4 == obj) {
                objQ4 = new st.a(21);
                sVar3.o0(objQ4);
            }
            a0.o.b(str2, null, (fz.c) objQ4, null, null, null, f52635d, sVar3, 1573248, 58);
            sVar3.p(false);
            if (f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
                sVar3.d0(159993371);
                g7.d(CropImageView.DEFAULT_ASPECT_RATIO, 1, 390, 16, ((s1) sVar3.j(c3Var)).f31024f, f0.e(4292928236L), sVar3, e2.g(j0.c.E(j0.c.C(e2.e(oVar, 1.0f), 42, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 22, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 2));
                s sVar6 = sVar3;
                sVar6.p(false);
                f11 = f5;
                z14 = true;
                resources4 = resources3;
                sVar2 = sVar6;
            } else {
                sVar3.d0(160461068);
                resources4 = resources3;
                f11 = f5;
                b3VarB = b0.h.b(f11, null, null, sVar3, i14 & 14, 30);
                r rVarG2 = e2.g(j0.c.E(j0.c.C(e2.e(oVar, 1.0f), 52, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 22, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 2);
                long j14 = ((s1) sVar3.j(c3Var)).f31024f;
                long jE2 = f0.e(4292928236L);
                float f13 = -4;
                zF2 = sVar3.f(b3VarB);
                objQ5 = sVar3.Q();
                if (zF2) {
                    objQ5 = new h0(b3VarB, 3);
                    sVar3.o0(objQ5);
                } else {
                    objQ5 = new h0(b3VarB, 3);
                    sVar3.o0(objQ5);
                }
                fz.a aVar2 = (fz.a) objQ5;
                objQ6 = sVar3.Q();
                if (objQ6 == obj) {
                    objQ6 = new st.a(22);
                    sVar3.o0(objQ6);
                }
                fz.c cVar2 = (fz.c) objQ6;
                z14 = true;
                g7.c(aVar2, rVarG2, j14, jE2, 1, f13, cVar2, sVar3, 1772592, 0);
                s sVar7 = sVar3;
                sVar7.p(false);
                sVar2 = sVar7;
            }
            sVar2.p(z14);
            sVar2.p(z14);
            resources2 = resources4;
            sVar = sVar2;
        } else {
            sVar3.W();
            sVar = sVar3;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: tv.d
                @Override // fz.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM = t.M(i11 | 1);
                    a.g(f11, resources2, (n) obj2, iM, i12);
                    return b0.f48488a;
                }
            };
        }
    }

    public static final void h(int i11, String value, String title, fz.a aVar, n nVar, int i12) {
        fz.a aVar2;
        boolean z11;
        m.f(value, "value");
        m.f(title, "title");
        s sVar = (s) nVar;
        sVar.f0(79916472);
        int i13 = i12 | (sVar.d(i11) ? 32 : 16) | (sVar.f(value) ? 256 : 128) | (sVar.f(title) ? 2048 : 1024) | 1597440;
        if (sVar.T(i13 & 1, (i13 & 533651) != 533650)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new ju.d(25);
                sVar.o0(objQ);
            }
            fz.a aVar3 = (fz.a) objQ;
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            r rVarG = e2.g(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 70);
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new okhttp3.b(12, aVar3);
                sVar.o0(objQ2);
            }
            r rVarO = d0.n.o(rVarG, false, null, (fz.a) objQ2, 14);
            j0.u uVarA = j0.t.a(j0.i.f35307e, z1.c.P, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarO);
            k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            t.J(hVar, uVarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            t.J(hVar4, rVarC, sVar);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            o oVar = o.f58481a;
            r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, a2VarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            if (i11 != 0) {
                sVar.d0(-531234603);
                d0.n.c(se.k.y(i11, sVar, (i13 >> 3) & 14), null, j0.c.E(e2.n(oVar, 20), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 2, CropImageView.DEFAULT_ASPECT_RATIO, 11), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
                z11 = false;
            } else {
                z11 = false;
                sVar.d0(-533875152);
            }
            sVar.p(z11);
            d0 d0Var = ua.f31167a;
            ua.b(value, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), 0L, j3.A(18), n3.s.N, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, (i13 >> 6) & 14, 0, 65534);
            sVar.p(true);
            ua.b(title, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), 0L, j3.A(11), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar, ((i13 >> 9) & 14) | 48, 0, 65532);
            sVar = sVar;
            sVar.p(true);
            aVar2 = aVar3;
        } else {
            sVar.W();
            aVar2 = aVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new qg.d(i11, i12, aVar2, value, title);
        }
    }

    public static final void i(boolean z11, fz.a onDismissRequest, fz.a onClickConfirm, fz.a onClickCancel, n nVar, int i11) {
        int i12;
        s sVar;
        m.f(onDismissRequest, "onDismissRequest");
        m.f(onClickConfirm, "onClickConfirm");
        m.f(onClickCancel, "onClickCancel");
        s sVar2 = (s) nVar;
        sVar2.f0(-2118108178);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar2.g(z11) ? 4 : 2);
        } else {
            i12 = i11;
        }
        int i13 = i12 | (sVar2.h(onClickCancel) ? 2048 : 1024);
        if (sVar2.T(i13 & 1, (i13 & 1171) != 1170)) {
            e8 e8VarF = a6.f(6, 2, null, sVar2);
            Object objQ = sVar2.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new okhttp3.b(17, onDismissRequest);
                sVar2.o0(objQ);
            }
            sVar = sVar2;
            a6.a((fz.a) objQ, null, e8VarF, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-1549409461, new n2(z11, onClickConfirm, onClickCancel, 6), sVar2), sVar, 0, 384, 4090);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new x(i11, 1, onDismissRequest, onClickConfirm, onClickCancel, z11);
        }
    }

    public static final long j(String str) {
        return oz.x.s0(str, "#", false) ? f0.c(Color.parseColor(str)) : g2.x.f28621h;
    }

    public static final long k(String str) {
        m.f(str, "<this>");
        if (!oz.x.s0(str, "#", false)) {
            return g2.x.f28621h;
        }
        if (str.length() == 9) {
            String strSubstring = str.substring(7, 9);
            m.e(strSubstring, "substring(...)");
            String strSubstring2 = str.substring(1, 7);
            m.e(strSubstring2, "substring(...)");
            str = "#" + strSubstring + strSubstring2;
        }
        return f0.c(Color.parseColor(str));
    }

    public static final String l(ks.d dVar, n nVar) {
        m.f(dVar, "<this>");
        switch (c.f52641a[dVar.ordinal()]) {
            case 1:
                s sVar = (s) nVar;
                sVar.d0(1279033947);
                return nv.p.t(ub.a.e0(sVar, R.string.chinese), " 1", sVar, false);
            case 2:
                s sVar2 = (s) nVar;
                sVar2.d0(1279036219);
                return nv.p.t(ub.a.e0(sVar2, R.string.chinese), " 2", sVar2, false);
            case 3:
                s sVar3 = (s) nVar;
                sVar3.d0(1279038396);
                return nv.p.t(ub.a.e0(sVar3, R.string.japanese), " 1", sVar3, false);
            case 4:
                s sVar4 = (s) nVar;
                sVar4.d0(1279040700);
                return nv.p.t(ub.a.e0(sVar4, R.string.japanese), " 2", sVar4, false);
            case 5:
                s sVar5 = (s) nVar;
                sVar5.d0(1279042906);
                return nv.p.t(ub.a.e0(sVar5, R.string.korean), " 1", sVar5, false);
            case 6:
                s sVar6 = (s) nVar;
                sVar6.d0(1279045146);
                return nv.p.t(ub.a.e0(sVar6, R.string.korean), " 2", sVar6, false);
            case 7:
                s sVar7 = (s) nVar;
                return ep.a.m(sVar7, 1279047284, R.string.english, sVar7, false);
            case 8:
                s sVar8 = (s) nVar;
                sVar8.d0(1279049243);
                return nv.p.t(ub.a.e0(sVar8, R.string.spanish), " 1", sVar8, false);
            case 9:
                s sVar9 = (s) nVar;
                sVar9.d0(1279051425);
                return nv.p.t(ub.a.e0(sVar9, R.string.french_normal), " 1", sVar9, false);
            case 10:
                s sVar10 = (s) nVar;
                sVar10.d0(1279053786);
                return nv.p.t(ub.a.e0(sVar10, R.string.german), " 1", sVar10, false);
            case 11:
                s sVar11 = (s) nVar;
                sVar11.d0(1279055934);
                return nv.p.t(ub.a.e0(sVar11, R.string.portuguese), " 1", sVar11, false);
            case 12:
                s sVar12 = (s) nVar;
                return ep.a.m(sVar12, 1279058199, R.string.vietnamese, sVar12, false);
            case 13:
                s sVar13 = (s) nVar;
                sVar13.d0(1279060347);
                return nv.p.t(ub.a.e0(sVar13, R.string.spanish), " 2", sVar13, false);
            case 14:
                s sVar14 = (s) nVar;
                sVar14.d0(1279062625);
                return nv.p.t(ub.a.e0(sVar14, R.string.french_normal), " 2", sVar14, false);
            case 15:
                s sVar15 = (s) nVar;
                sVar15.d0(1279065082);
                return nv.p.t(ub.a.e0(sVar15, R.string.german), " 2", sVar15, false);
            case 16:
                s sVar16 = (s) nVar;
                sVar16.d0(1279067326);
                return nv.p.t(ub.a.e0(sVar16, R.string.portuguese), " 2", sVar16, false);
            case 17:
                s sVar17 = (s) nVar;
                sVar17.d0(1279069595);
                return nv.p.t(ub.a.e0(sVar17, R.string.russian), " 1", sVar17, false);
            case 18:
                s sVar18 = (s) nVar;
                sVar18.d0(1279071867);
                return nv.p.t(ub.a.e0(sVar18, R.string.russian), " 2", sVar18, false);
            case 19:
                s sVar19 = (s) nVar;
                sVar19.d0(1279074041);
                return nv.p.t(ub.a.e0(sVar19, R.string.italy), " 1", sVar19, false);
            case 20:
                s sVar20 = (s) nVar;
                sVar20.d0(1279076249);
                return nv.p.t(ub.a.e0(sVar20, R.string.italy), " 2", sVar20, false);
            case 21:
                s sVar21 = (s) nVar;
                sVar21.d0(1279078462);
                return nv.p.t(ub.a.e0(sVar21, R.string.spanish_us), " 1", sVar21, false);
            case 22:
                s sVar22 = (s) nVar;
                sVar22.d0(1279080926);
                return nv.p.t(ub.a.e0(sVar22, R.string.spanish_us), " 2", sVar22, false);
            case 23:
                s sVar23 = (s) nVar;
                sVar23.d0(1279083302);
                return nv.p.t(ub.a.e0(sVar23, R.string.french_accelerated), " 1", sVar23, false);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                s sVar24 = (s) nVar;
                sVar24.d0(1279086022);
                return nv.p.t(ub.a.e0(sVar24, R.string.french_accelerated), " 2", sVar24, false);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                s sVar25 = (s) nVar;
                sVar25.d0(1279088538);
                return nv.p.t(ub.a.e0(sVar25, R.string.arabic), " 1", sVar25, false);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                s sVar26 = (s) nVar;
                sVar26.d0(1279090778);
                return nv.p.t(ub.a.e0(sVar26, R.string.arabic), " 2", sVar26, false);
            case 27:
                s sVar27 = (s) nVar;
                return ep.a.m(sVar27, 1279092977, R.string.thai, sVar27, false);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                s sVar28 = (s) nVar;
                return ep.a.m(sVar28, 1279094868, R.string.turkish, sVar28, false);
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                s sVar29 = (s) nVar;
                return ep.a.m(sVar29, 1279096914, R.string.hindi, sVar29, false);
            case 30:
                s sVar30 = (s) nVar;
                return ep.a.m(sVar30, 1279098832, R.string.grk, sVar30, false);
            case 31:
                s sVar31 = (s) nVar;
                return ep.a.m(sVar31, 1279100688, R.string.ukr, sVar31, false);
            case Consts.SP /* 32 */:
                s sVar32 = (s) nVar;
                return ep.a.m(sVar32, 1279102550, R.string.indonesia, sVar32, false);
            case 33:
                s sVar33 = (s) nVar;
                return ep.a.m(sVar33, 1279104595, R.string.polish, sVar33, false);
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                s sVar34 = (s) nVar;
                return ep.a.m(sVar34, 1279106546, R.string.malay, sVar34, false);
            default:
                throw nv.p.x((s) nVar, 1279034911, false);
        }
    }

    public static final String m(ks.d dVar, n nVar) {
        String strL;
        m.f(dVar, "<this>");
        s sVar = (s) nVar;
        sVar.d0(-2020791095);
        if (oz.x.k0(l(dVar, sVar), " 1", false)) {
            sVar.d0(1780017086);
            strL = l(dVar, sVar).substring(0, l(dVar, sVar).length() - 2);
            m.e(strL, "substring(...)");
            sVar.p(false);
        } else if (oz.x.k0(l(dVar, sVar), " 2", false)) {
            sVar.d0(1780136126);
            strL = l(dVar, sVar).substring(0, l(dVar, sVar).length() - 2);
            m.e(strL, "substring(...)");
            sVar.p(false);
        } else {
            sVar.d0(1780216137);
            strL = l(dVar, sVar);
            sVar.p(false);
        }
        sVar.p(false);
        return strL;
    }

    public static final ks.d n(int i11) throws Exception {
        if (i11 == 40) {
            return ks.d.IT_UP;
        }
        if (i11 == 51) {
            return ks.d.AR;
        }
        if (i11 == 57) {
            return ks.d.THAI;
        }
        if (i11 == 61) {
            return ks.d.HINDI;
        }
        if (i11 == 63) {
            return ks.d.UKR;
        }
        if (i11 == 65) {
            return ks.d.GRK;
        }
        if (i11 == 69) {
            return ks.d.MAL;
        }
        if (i11 == 47) {
            return ks.d.ES_US;
        }
        if (i11 == 48) {
            return ks.d.ES_US_UP;
        }
        switch (i11) {
            case 0:
                return ks.d.CN;
            case 1:
                return ks.d.JP;
            case 2:
                return ks.d.KR;
            case 3:
                return ks.d.EN;
            case 4:
                return ks.d.ES;
            case 5:
                return ks.d.FR;
            case 6:
                return ks.d.DE;
            case 7:
                return ks.d.VT;
            case 8:
                return ks.d.PT;
            default:
                switch (i11) {
                    case 10:
                        return ks.d.RU;
                    case 11:
                        return ks.d.CN_UP;
                    case 12:
                        return ks.d.JP_UP;
                    case 13:
                        return ks.d.KR_UP;
                    case 14:
                        return ks.d.ES_UP;
                    case 15:
                        return ks.d.FR_UP;
                    case 16:
                        return ks.d.DE_UP;
                    case 17:
                        return ks.d.PT_UP;
                    case 18:
                        return ks.d.IDN;
                    case 19:
                        return ks.d.POL;
                    case 20:
                        return ks.d.IT;
                    case 21:
                        return ks.d.TUR;
                    case 22:
                        return ks.d.RU_UP;
                    default:
                        switch (i11) {
                            case 53:
                                return ks.d.FR_US;
                            case 54:
                                return ks.d.FR_US_UP;
                            case 55:
                                return ks.d.AR_UP;
                            default:
                                throw new Exception("unknown language");
                        }
                }
        }
    }
}
