package defpackage;

import a0.k0;
import am.rVFB.LwKl;
import b0.o1;
import bp.r0;
import bt.a3;
import bt.g8;
import bt.s0;
import com.lingo.lingoskill.object.MergedBillingThemeBillingPage;
import com.lingodeer.R;
import com.lingodeer.course.smarttips.data.model.TextType;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.yalantis.ucrop.view.CropImageView;
import d0.m0;
import dt.d4;
import fr.j3;
import fu.j0;
import fz.a;
import fz.c;
import fz.e;
import fz.f;
import g2.x;
import h1.dc;
import h1.e1;
import h1.fc;
import h1.k7;
import h1.s1;
import h1.ua;
import j0.a2;
import j0.b;
import j0.b2;
import j0.e2;
import j0.i;
import j0.i1;
import j0.t;
import j0.t1;
import j0.u;
import j0.u0;
import j0.v;
import j0.z1;
import j3.y0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jt.i0;
import kotlin.jvm.internal.m;
import l1.a1;
import l1.b1;
import l1.b3;
import l1.c3;
import l1.g;
import l1.h1;
import l1.n;
import l1.q1;
import l1.s;
import mt.f0;
import mt.k1;
import mt.l0;
import mt.p;
import mt.v1;
import ns.c0;
import oz.q;
import pr.a0;
import pr.z;
import qy.b0;
import rt.d5;
import rt.jf;
import rt.le;
import rt.qe;
import rt.se;
import rt.w4;
import w2.q0;
import y2.h;
import y2.j;
import y2.k;
import ys.d0;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22624d;

    public /* synthetic */ d(a aVar, a aVar2, b1 b1Var) {
        this.f22621a = 11;
        this.f22623c = aVar;
        this.f22624d = aVar2;
        this.f22622b = b1Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        se seVar = (se) this.f22622b;
        a aVar = (a) this.f22623c;
        c cVar = (c) this.f22624d;
        k0 AnimatedVisibility = (k0) obj;
        n nVar = (n) obj2;
        ((Integer) obj3).getClass();
        m.f(AnimatedVisibility, "$this$AnimatedVisibility");
        u uVarA = t.a(i.f35305c, z1.c.O, nVar, 0);
        s sVar = (s) nVar;
        int iHashCode = Long.hashCode(sVar.T);
        q1 q1VarL = sVar.l();
        o oVar = o.f58481a;
        r rVarC = z1.a.c(nVar, oVar);
        k.J.getClass();
        y2.i iVar = j.f56913b;
        sVar.h0();
        if (sVar.S) {
            sVar.k(iVar);
        } else {
            sVar.r0();
        }
        l1.t.J(j.f56917f, uVarA, nVar);
        l1.t.J(j.f56916e, q1VarL, nVar);
        h hVar = j.f56918g;
        if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
            e.A(iHashCode, sVar, iHashCode, hVar);
        }
        l1.t.J(j.f56915d, rVarC, nVar);
        k7.g(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, v1.f41978a, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), CropImageView.DEFAULT_ASPECT_RATIO, ((s1) ((s) nVar).j(h1.v1.f31180a)).B, nVar, 6, 2);
        qe qeVar = seVar instanceof qe ? (qe) seVar : null;
        le leVar = qeVar != null ? qeVar.f50315a : null;
        boolean zF = sVar.f(cVar);
        Object objQ = sVar.Q();
        if (zF || objQ == l1.m.f39353a) {
            objQ = new o1(cVar, 15);
            sVar.o0(objQ);
        }
        f0.c(leVar, aVar, (c) objQ, nVar, 0);
        sVar.p(true);
        return b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0330  */
    /* JADX WARN: Code duplicated, block: B:64:0x034a  */
    private final Object c(Object obj, Object obj2, Object obj3) {
        w4 w4Var;
        c3 c3Var;
        long j11;
        long j12;
        s sVar;
        boolean z11;
        boolean zF;
        Object objQ;
        d5 d5Var = (d5) this.f22622b;
        a aVar = (a) this.f22623c;
        w4 w4Var2 = (w4) this.f22624d;
        v Card = (v) obj;
        n nVar = (n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        m.f(Card, "$this$Card");
        s sVar2 = (s) nVar;
        if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            o oVar = o.f58481a;
            float f5 = 16;
            float f11 = 14;
            r rVarD = j0.c.D(e2.i(e2.e(oVar, 1.0f), 78, CropImageView.DEFAULT_ASPECT_RATIO, 2), f5, f11, 4, f11);
            z1.i iVar = z1.c.M;
            b bVar = i.f35303a;
            a2 a2VarA = z1.a(bVar, iVar, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            r rVarC = z1.a.c(sVar2, rVarD);
            k.J.getClass();
            y2.i iVar2 = j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar2);
            } else {
                sVar2.r0();
            }
            h hVar = j.f56917f;
            l1.t.J(hVar, a2VarA, sVar2);
            h hVar2 = j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar2);
            h hVar3 = j.f56918g;
            if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                e.A(iHashCode, sVar2, iHashCode, hVar3);
            }
            h hVar4 = j.f56915d;
            l1.t.J(hVar4, rVarC, sVar2);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            i1 i1Var = new i1(1.0f, true);
            u uVarA = t.a(i.f35305c, z1.c.O, sVar2, 0);
            int iHashCode2 = Long.hashCode(sVar2.T);
            q1 q1VarL2 = sVar2.l();
            r rVarC2 = z1.a.c(sVar2, i1Var);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar2);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, uVarA, sVar2);
            l1.t.J(hVar2, q1VarL2, sVar2);
            if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                e.A(iHashCode2, sVar2, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar2);
            String str = d5Var.f49615c;
            boolean z12 = d5Var.f49619g;
            y0 y0Var = (y0) sVar2.j(ua.f31167a);
            long jA = j3.A(18);
            c3 c3Var2 = h1.v1.f31180a;
            ua.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, y0.a(y0Var, ((s1) sVar2.j(c3Var2)).f31034q, jA, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar2, 0, 3120, 55294);
            j0.c.g(sVar2, e2.g(oVar, 8));
            a2 a2VarA2 = z1.a(bVar, iVar, sVar2, 48);
            int iHashCode3 = Long.hashCode(sVar2.T);
            q1 q1VarL3 = sVar2.l();
            r rVarC3 = z1.a.c(sVar2, oVar);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar2);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, a2VarA2, sVar2);
            l1.t.J(hVar2, q1VarL3, sVar2);
            if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                e.A(iHashCode3, sVar2, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar2);
            String strE0 = ub.a.e0(sVar2, R.string.listen_along_sentences);
            String str2 = d5Var.f49616d + " " + strE0;
            if (z12) {
                if (w4Var != w4.WORDS) {
                    w4Var = w4Var2;
                    sVar2.d0(619167707);
                    c3Var = c3Var2;
                    j11 = ((s1) sVar2.j(c3Var)).f31017a;
                    sVar2.p(false);
                }
                ua.b(str2, null, j11, j3.A(13), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 3072, 0, 131058);
                ua.b(" · ", null, ((s1) sVar2.j(c3Var)).f31036s, j3.A(13), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 3078, 0, 131058);
                String strE1 = ub.a.e0(sVar2, R.string.listen_along_words);
                String str3 = d5Var.f49617e + " " + strE1;
                if (z12 || w4Var == w4.SENTENCES) {
                    sVar2.d0(619998290);
                    j12 = ((s1) sVar2.j(c3Var)).f31036s;
                    sVar2.p(false);
                } else {
                    sVar2.d0(619903771);
                    j12 = ((s1) sVar2.j(c3Var)).f31017a;
                    sVar2.p(false);
                }
                ua.b(str3, null, j12, j3.A(13), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 3072, 0, 131058);
                sVar = sVar2;
                sVar.p(true);
                sVar.p(true);
                j0.c.g(sVar, e2.s(oVar, f5));
                if (d5Var.f49618f) {
                    z11 = false;
                    sVar.d0(235692430);
                } else {
                    sVar.d0(255140280);
                    d0.n.c(se.k.y(R.drawable.ic_lesson_index_pro, sVar, 0), null, e2.n(j0.c.C(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 10, 1), 24), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
                    sVar = sVar;
                    z11 = false;
                }
                sVar.p(z11);
                boolean z13 = d5Var.f49619g;
                zF = sVar.f(aVar);
                objQ = sVar.Q();
                if (zF || objQ == l1.m.f39353a) {
                    objQ = new r0(11, aVar);
                    sVar.o0(objQ);
                }
                e1.a(z13, (c) objQ, oVar, false, null, sVar, 384, 56);
                sVar.p(true);
            } else {
                w4Var = w4Var2;
            }
            w4Var = w4Var2;
            c3Var = c3Var2;
            sVar2.d0(619262226);
            j11 = ((s1) sVar2.j(c3Var)).f31036s;
            sVar2.p(false);
            ua.b(str2, null, j11, j3.A(13), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 3072, 0, 131058);
            ua.b(" · ", null, ((s1) sVar2.j(c3Var)).f31036s, j3.A(13), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 3078, 0, 131058);
            String strE2 = ub.a.e0(sVar2, R.string.listen_along_words);
            String str4 = d5Var.f49617e + " " + strE2;
            if (z12) {
                sVar2.d0(619998290);
                j12 = ((s1) sVar2.j(c3Var)).f31036s;
                sVar2.p(false);
            } else {
                sVar2.d0(619998290);
                j12 = ((s1) sVar2.j(c3Var)).f31036s;
                sVar2.p(false);
            }
            ua.b(str4, null, j12, j3.A(13), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 3072, 0, 131058);
            sVar = sVar2;
            sVar.p(true);
            sVar.p(true);
            j0.c.g(sVar, e2.s(oVar, f5));
            if (d5Var.f49618f) {
                sVar.d0(255140280);
                d0.n.c(se.k.y(R.drawable.ic_lesson_index_pro, sVar, 0), null, e2.n(j0.c.C(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 10, 1), 24), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
                sVar = sVar;
                z11 = false;
            } else {
                z11 = false;
                sVar.d0(235692430);
            }
            sVar.p(z11);
            boolean z14 = d5Var.f49619g;
            zF = sVar.f(aVar);
            objQ = sVar.Q();
            if (zF) {
                objQ = new r0(11, aVar);
                sVar.o0(objQ);
            } else {
                objQ = new r0(11, aVar);
                sVar.o0(objQ);
            }
            e1.a(z14, (c) objQ, oVar, false, null, sVar, 384, 56);
            sVar.p(true);
        } else {
            sVar2.W();
        }
        return b0.f48488a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        Map.Entry entry = (Map.Entry) this.f22622b;
        e eVar = (e) this.f22623c;
        b1 b1Var = (b1) this.f22624d;
        l0.c item = (l0.c) obj;
        n nVar = (n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        m.f(item, "$this$item");
        s sVar = (s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            TextType textType = ((vs.k) entry.getKey()).f54168a;
            boolean zF = sVar.f(eVar) | sVar.h(entry);
            Object objQ = sVar.Q();
            g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = new a0(eVar, entry, b1Var);
                sVar.o0(objQ);
            }
            c cVar = (c) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new z(11, b1Var);
                sVar.o0(objQ2);
            }
            a aVar = (a) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = new p(22, b1Var);
                sVar.o0(objQ3);
            }
            us.b.m(textType, true, cVar, aVar, (c) objQ3, sVar, 27696);
        } else {
            sVar.W();
        }
        return b0.f48488a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) this.f22622b;
        Set set = (Set) this.f22623c;
        c cVar = (c) this.f22624d;
        v Card = (v) obj;
        n nVar = (n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        m.f(Card, "$this$Card");
        s sVar = (s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            m0.a aVar = new m0.a(96);
            float f5 = 12;
            j0.v1 v1Var = new j0.v1(f5, f5, f5, f5);
            float f11 = 8;
            j0.g gVarG = i.g(f11);
            j0.g gVarG2 = i.g(f11);
            boolean zH = sVar.h(arrayList) | sVar.h(set) | sVar.f(cVar);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new a0(arrayList, set, cVar, 26);
                sVar.o0(objQ);
            }
            md.a.a(aVar, null, null, v1Var, gVarG2, gVarG, null, false, null, (c) objQ, sVar, 1772544, 918);
        } else {
            sVar.W();
        }
        return b0.f48488a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        c cVar = (c) this.f22622b;
        LeaderBoardUser leaderBoardUser = (LeaderBoardUser) this.f22623c;
        b1 b1Var = (b1) this.f22624d;
        v ModalBottomSheet = (v) obj;
        n nVar = (n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        m.f(ModalBottomSheet, "$this$ModalBottomSheet");
        s sVar = (s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            float f5 = 16;
            o oVar = o.f58481a;
            r rVarE = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, 7);
            j0.d dVar = i.f35305c;
            z1.h hVar = z1.c.O;
            u uVarA = t.a(dVar, hVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarE);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            h hVar2 = j.f56917f;
            l1.t.J(hVar2, uVarA, sVar);
            h hVar3 = j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            h hVar4 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            h hVar5 = j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            z1.i iVar2 = z1.c.M;
            a2 a2VarA = z1.a(i.f35303a, iVar2, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, a2VarA, sVar);
            l1.t.J(hVar3, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                e.A(iHashCode2, sVar, iHashCode2, hVar4);
            }
            l1.t.J(hVar5, rVarC2, sVar);
            int emojiStatus = leaderBoardUser.getEmojiStatus();
            Integer numValueOf = Integer.valueOf(emojiStatus);
            if (emojiStatus == -1) {
                numValueOf = null;
            }
            qu.b.g(leaderBoardUser.getImageName(), leaderBoardUser.getNickName(), numValueOf != null ? new qu.c(numValueOf.intValue(), 0, 0) : null, false, 40, j0.c.E(oVar, 20, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), sVar, 224256);
            float f11 = 8;
            r rVarE2 = j0.c.E(oVar, 19, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, 10);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            r rVarP = w4.c.p(1.0f, true, rVarE2);
            u uVarA2 = t.a(dVar, hVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            r rVarC3 = z1.a.c(sVar, rVarP);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, uVarA2, sVar);
            l1.t.J(hVar3, q1VarL3, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                e.A(iHashCode3, sVar, iHashCode3, hVar4);
            }
            l1.t.J(hVar5, rVarC3, sVar);
            ua.b(leaderBoardUser.getNickName(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), 0L, j3.A(16), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
            j0.c.g(sVar, e2.g(oVar, f5));
            k7.g(j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 6, 6);
            float f12 = 12;
            j0.g gVarG = i.g(f12);
            r rVarI = e2.i(e2.e(oVar, 1.0f), 62, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            boolean zF = sVar.f(cVar) | sVar.h(leaderBoardUser);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = new l0(cVar, leaderBoardUser, b1Var, 28);
                sVar.o0(objQ);
            }
            r rVarB = j0.c.B(d0.n.o(rVarI, false, null, (a) objQ, 15), f5, f12);
            a2 a2VarA2 = z1.a(gVarG, iVar2, sVar, 54);
            int iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            r rVarC4 = z1.a.c(sVar, rVarB);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, a2VarA2, sVar);
            l1.t.J(hVar3, q1VarL4, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                e.A(iHashCode4, sVar, iHashCode4, hVar4);
            }
            l1.t.J(hVar5, rVarC4, sVar);
            d0.n.c(se.k.y(R.drawable.ic_remove_follower, sVar, 0), null, e2.n(j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 24), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
            ua.b(ub.a.e0(sVar, R.string.remove_follower), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30175h, sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        return b0.f48488a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        b3 b3Var = (b3) this.f22622b;
        b3 b3Var2 = (b3) this.f22623c;
        b3 b3Var3 = (b3) this.f22624d;
        k0 AnimatedVisibility = (k0) obj;
        n nVar = (n) obj2;
        ((Integer) obj3).getClass();
        m.f(AnimatedVisibility, "$this$AnimatedVisibility");
        r rVarC = j0.c.C(e2.g(e2.e(j0.c.F(d0.n.h(o.f58481a, j3.w(((MergedBillingThemeBillingPage) b3Var.getValue()).getColorCountDownTitleBar()), g2.f0.f28556b)), 1.0f), 52), 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
        a2 a2VarA = z1.a(i.f35303a, z1.c.M, nVar, 48);
        s sVar = (s) nVar;
        int iHashCode = Long.hashCode(sVar.T);
        q1 q1VarL = sVar.l();
        r rVarC2 = z1.a.c(nVar, rVarC);
        k.J.getClass();
        y2.i iVar = j.f56913b;
        sVar.h0();
        if (sVar.S) {
            sVar.k(iVar);
        } else {
            sVar.r0();
        }
        l1.t.J(j.f56917f, a2VarA, nVar);
        l1.t.J(j.f56916e, q1VarL, nVar);
        h hVar = j.f56918g;
        if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
            e.A(iHashCode, sVar, iHashCode, hVar);
        }
        l1.t.J(j.f56915d, rVarC2, nVar);
        ua.b((String) b3Var2.getValue(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), j3.w(((MergedBillingThemeBillingPage) b3Var.getValue()).getColorCountDownTitleBarText()), j3.A(20), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), nVar, 0, 0, 65534);
        if (1.0f <= 0.0d) {
            k0.a.a("invalid weight; must be greater than zero");
        }
        j0.c.g(nVar, new i1(1.0f, true));
        yg.o.l(3072, j3.w(((MergedBillingThemeBillingPage) b3Var.getValue()).getColorCountDownTitleBarText()), j3.w(((MergedBillingThemeBillingPage) b3Var.getValue()).getColorCountDownTitleBar()), (String) b3Var3.getValue(), nVar, null);
        sVar.p(true);
        return b0.f48488a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f22622b;
        a aVar = (a) this.f22623c;
        b3 b3Var = (b3) this.f22624d;
        l0.c item = (l0.c) obj;
        n nVar = (n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        m.f(item, "$this$item");
        s sVar = (s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
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
            l1.t.J(j.f56917f, q0VarD, sVar);
            l1.t.J(j.f56916e, q1VarL, sVar);
            h hVar = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(j.f56915d, rVarC, sVar);
            wb.k.c(((MergedBillingThemeBillingPage) b3Var.getValue()).getBannerPicUrl(), j0.c.j(e2.e(oVar, 1.0f), 1.7281106f), null, sVar, 432, 4088);
            if (m.a(str, "bottom_tab")) {
                sVar.d0(193685080);
            } else {
                sVar.d0(207474965);
                k7.h(aVar, j0.r.f35391a.a(j0.c.F(oVar), z1.c.f58465c), false, null, yg.r.f57841a, sVar, 196608, 28);
                sVar = sVar;
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        return b0.f48488a;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11;
        boolean z11;
        switch (this.f22621a) {
            case 0:
                g gVar = (g) this.f22622b;
                a aVar = (a) this.f22623c;
                a aVar2 = (a) this.f22624d;
                v ModalBottomSheet = (v) obj;
                n nVar = (n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zF = sVar.f(aVar) | sVar.f(aVar2);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new a(0, aVar, aVar2);
                        sVar.o0(objQ);
                    }
                    android.support.v4.media.session.a.b(gVar, (a) objQ, aVar2, sVar, 0);
                } else {
                    sVar.W();
                }
                return b0.f48488a;
            case 1:
                ArrayList arrayList = (ArrayList) this.f22622b;
                String str = (String) this.f22623c;
                c cVar = (c) this.f22624d;
                v OutlinedCard = (v) obj;
                n nVar2 = (n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                m.f(OutlinedCard, "$this$OutlinedCard");
                s sVar2 = (s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    u uVarA = t.a(i.f35305c, z1.c.O, sVar2, 0);
                    int iHashCode = Long.hashCode(sVar2.T);
                    q1 q1VarL = sVar2.l();
                    r rVarC = z1.a.c(sVar2, o.f58481a);
                    k.J.getClass();
                    y2.i iVar = j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(j.f56917f, uVarA, sVar2);
                    l1.t.J(j.f56916e, q1VarL, sVar2);
                    h hVar = j.f56918g;
                    if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(j.f56915d, rVarC, sVar2);
                    boolean zH = sVar2.h(arrayList) | sVar2.f(str) | sVar2.f(cVar);
                    Object objQ2 = sVar2.Q();
                    if (zH || objQ2 == l1.m.f39353a) {
                        objQ2 = new aj.c(arrayList, str, cVar, 8);
                        sVar2.o0(objQ2);
                    }
                    ue.f.a(null, null, null, null, null, null, false, null, (c) objQ2, sVar2, 0, 511);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                return b0.f48488a;
            case 2:
                d0 d0Var = (d0) this.f22622b;
                b1 b1Var = (b1) this.f22623c;
                b1 b1Var2 = (b1) this.f22624d;
                String audioPath = (String) obj;
                Long l9 = (Long) obj2;
                long jLongValue = l9.longValue();
                g8 direction = (g8) obj3;
                m.f(audioPath, "audioPath");
                m.f(direction, "direction");
                b1Var.setValue(-1L);
                b1Var2.setValue(-1L);
                if (direction == g8.Left) {
                    b1Var.setValue(l9);
                } else {
                    b1Var2.setValue(l9);
                }
                if (d0Var != null) {
                    jh.h.m(d0Var, ns.o.K(audioPath), new ht.d(jLongValue, ry.r.f50854a), new aj.c(direction, b1Var, b1Var2, 17));
                }
                return b0.f48488a;
            case 3:
                List list = (List) this.f22622b;
                List list2 = (List) this.f22623c;
                c0 c0Var = (c0) this.f22624d;
                v OutlinedCard2 = (v) obj;
                n nVar3 = (n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                m.f(OutlinedCard2, "$this$OutlinedCard");
                s sVar3 = (s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    r rVarA = j0.c.A(o.f58481a, 12);
                    u uVarA2 = t.a(i.g(6), z1.c.O, sVar3, 6);
                    int iHashCode2 = Long.hashCode(sVar3.T);
                    q1 q1VarL2 = sVar3.l();
                    r rVarC2 = z1.a.c(sVar3, rVarA);
                    k.J.getClass();
                    y2.i iVar2 = j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(j.f56917f, uVarA2, sVar3);
                    l1.t.J(j.f56916e, q1VarL2, sVar3);
                    h hVar2 = j.f56918g;
                    if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                        e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                    }
                    l1.t.J(j.f56915d, rVarC2, sVar3);
                    if (list.isEmpty()) {
                        i11 = 12;
                        z11 = false;
                        sVar3.d0(786028319);
                    } else {
                        sVar3.d0(823683647);
                        i11 = 12;
                        z11 = false;
                        d4.a(list, null, list2, false, false, y0.a(ct.c.b(sVar3), 0L, j3.A(16), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), i.f35303a, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 4, 0L, false, null, false, false, false, null, null, null, sVar3, 1572864, 384, 0, 4190106);
                        sVar3 = sVar3;
                    }
                    sVar3.p(z11);
                    if (q.K0(c0Var.f43963a)) {
                        sVar3.d0(786028319);
                    } else {
                        sVar3.d0(824176764);
                        ua.b(c0Var.f43963a, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar3.j(ua.f31167a), ((s1) sVar3.j(h1.v1.f31180a)).f31036s, j3.A(i11), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar3, 0, 0, 65534);
                    }
                    sVar3.p(z11);
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                return b0.f48488a;
            case 4:
                CourseWord courseWord = (CourseWord) this.f22622b;
                c cVar2 = (c) this.f22623c;
                b3 b3Var = (b3) this.f22624d;
                v Card = (v) obj;
                n nVar4 = (n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                m.f(Card, "$this$Card");
                s sVar4 = (s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    r rVarD = e2.d(o.f58481a, 1.0f);
                    boolean z12 = courseWord.getSelectedState() == OptionItemSelectedState.DEFAULT;
                    boolean zF2 = sVar4.f(cVar2) | sVar4.h(courseWord);
                    Object objQ3 = sVar4.Q();
                    if (zF2 || objQ3 == l1.m.f39353a) {
                        objQ3 = new s0(cVar2, courseWord, 15);
                        sVar4.o0(objQ3);
                    }
                    r rVarQ = iu.k.q(6, 6, (a) objQ3, sVar4, rVarD, z12);
                    q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    int iHashCode3 = Long.hashCode(sVar4.T);
                    q1 q1VarL3 = sVar4.l();
                    r rVarC3 = z1.a.c(sVar4, rVarQ);
                    k.J.getClass();
                    y2.i iVar3 = j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar3);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(j.f56917f, q0VarD, sVar4);
                    l1.t.J(j.f56916e, q1VarL3, sVar4);
                    h hVar3 = j.f56918g;
                    if (sVar4.S || !m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                        e.A(iHashCode3, sVar4, iHashCode3, hVar3);
                    }
                    l1.t.J(j.f56915d, rVarC3, sVar4);
                    ua.b(courseWord.getWord(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(ua.f31167a), ((x) b3Var.getValue()).f28624a, ct.c.c(sVar4), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar4, 0, 0, 65534);
                    sVar4.p(true);
                } else {
                    sVar4.W();
                }
                return b0.f48488a;
            case 5:
                bs.a aVar3 = (bs.a) this.f22622b;
                String str2 = (String) this.f22623c;
                c cVar3 = (c) this.f22624d;
                l0.c item = (l0.c) obj;
                n nVar5 = (n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                m.f(item, "$this$item");
                s sVar5 = (s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    u uVarA3 = t.a(i.g(16), z1.c.O, sVar5, 6);
                    int iHashCode4 = Long.hashCode(sVar5.T);
                    q1 q1VarL4 = sVar5.l();
                    r rVarC4 = z1.a.c(sVar5, o.f58481a);
                    k.J.getClass();
                    y2.i iVar4 = j.f56913b;
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar4);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(j.f56917f, uVarA3, sVar5);
                    l1.t.J(j.f56916e, q1VarL4, sVar5);
                    h hVar4 = j.f56918g;
                    if (sVar5.S || !m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                        e.A(iHashCode4, sVar5, iHashCode4, hVar4);
                    }
                    l1.t.J(j.f56915d, rVarC4, sVar5);
                    sVar5.d0(-1254195047);
                    for (bs.c cVar4 : aVar3.f5110a) {
                        boolean zEquals = str2.equals(cVar4.f5117f);
                        boolean zF3 = sVar5.f(cVar3) | sVar5.f(cVar4);
                        Object objQ4 = sVar5.Q();
                        if (zF3 || objQ4 == l1.m.f39353a) {
                            objQ4 = new gs.j(cVar3, cVar4, 0);
                            sVar5.o0(objQ4);
                        }
                        gs.a.m(cVar4, zEquals, (a) objQ4, sVar5, 0);
                    }
                    sVar5.p(false);
                    sVar5.p(true);
                } else {
                    sVar5.W();
                }
                return b0.f48488a;
            case 6:
                bs.b bVar = (bs.b) this.f22622b;
                String str3 = (String) this.f22623c;
                c cVar5 = (c) this.f22624d;
                l0.c item2 = (l0.c) obj;
                n nVar6 = (n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                m.f(item2, "$this$item");
                s sVar6 = (s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    u uVarA4 = t.a(i.g(16), z1.c.O, sVar6, 6);
                    int iHashCode5 = Long.hashCode(sVar6.T);
                    q1 q1VarL5 = sVar6.l();
                    r rVarC5 = z1.a.c(sVar6, o.f58481a);
                    k.J.getClass();
                    y2.i iVar5 = j.f56913b;
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar5);
                    } else {
                        sVar6.r0();
                    }
                    l1.t.J(j.f56917f, uVarA4, sVar6);
                    l1.t.J(j.f56916e, q1VarL5, sVar6);
                    h hVar5 = j.f56918g;
                    if (sVar6.S || !m.a(sVar6.Q(), Integer.valueOf(iHashCode5))) {
                        e.A(iHashCode5, sVar6, iHashCode5, hVar5);
                    }
                    l1.t.J(j.f56915d, rVarC5, sVar6);
                    sVar6.d0(-168860130);
                    for (bs.c cVar6 : bVar.f5111a) {
                        boolean zEquals2 = str3.equals(cVar6.f5117f);
                        boolean zF4 = sVar6.f(cVar5) | sVar6.f(cVar6);
                        Object objQ5 = sVar6.Q();
                        if (zF4 || objQ5 == l1.m.f39353a) {
                            objQ5 = new gs.j(cVar5, cVar6, 1);
                            sVar6.o0(objQ5);
                        }
                        gs.a.m(cVar6, zEquals2, (a) objQ5, sVar6, 0);
                    }
                    sVar6.p(false);
                    sVar6.p(true);
                } else {
                    sVar6.W();
                }
                return b0.f48488a;
            case 7:
                kr.d0 d0Var2 = (kr.d0) this.f22622b;
                c cVar7 = (c) this.f22624d;
                a aVar4 = (a) this.f22623c;
                k0 AnimatedVisibility = (k0) obj;
                ((Integer) obj3).getClass();
                m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                ir.a aVar5 = d0Var2.f38449j;
                s sVar7 = (s) ((n) obj2);
                if (aVar5 == null) {
                    sVar7.d0(1122378136);
                } else {
                    sVar7.d0(1122378137);
                    boolean zF5 = sVar7.f(cVar7);
                    Object objQ6 = sVar7.Q();
                    g gVar2 = l1.m.f39353a;
                    if (zF5 || objQ6 == gVar2) {
                        objQ6 = new o1(cVar7, 12);
                        sVar7.o0(objQ6);
                    }
                    c cVar8 = (c) objQ6;
                    boolean zF6 = sVar7.f(aVar4);
                    Object objQ7 = sVar7.Q();
                    if (zF6 || objQ7 == gVar2) {
                        objQ7 = new jr.m(3, aVar4);
                        sVar7.o0(objQ7);
                    }
                    jr.z.a(aVar5, cVar8, (a) objQ7, sVar7, 0);
                }
                sVar7.p(false);
                return b0.f48488a;
            case 8:
                kr.r0 r0Var = (kr.r0) this.f22622b;
                a aVar6 = (a) this.f22623c;
                b1 b1Var3 = (b1) this.f22624d;
                k0 AnimatedVisibility2 = (k0) obj;
                n nVar7 = (n) obj2;
                ((Integer) obj3).getClass();
                m.f(AnimatedVisibility2, "$this$AnimatedVisibility");
                o oVar = o.f58481a;
                s sVar8 = (s) nVar7;
                r rVarH = d0.n.h(j0.c.j(e2.e(oVar, 1.0f), 1.7777778f), x.c(((s1) sVar8.j(h1.v1.f31180a)).f31034q, 0.5f), g2.f0.f28556b);
                q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
                int iHashCode6 = Long.hashCode(sVar8.T);
                q1 q1VarL6 = sVar8.l();
                r rVarC6 = z1.a.c(nVar7, rVarH);
                k.J.getClass();
                y2.i iVar6 = j.f56913b;
                sVar8.h0();
                if (sVar8.S) {
                    sVar8.k(iVar6);
                } else {
                    sVar8.r0();
                }
                l1.t.J(j.f56917f, q0VarD2, nVar7);
                l1.t.J(j.f56916e, q1VarL6, nVar7);
                h hVar6 = j.f56918g;
                if (sVar8.S || !m.a(sVar8.Q(), Integer.valueOf(iHashCode6))) {
                    e.A(iHashCode6, sVar8, iHashCode6, hVar6);
                }
                l1.t.J(j.f56915d, rVarC6, nVar7);
                k2.b bVarY = se.k.y(r0Var.f38568e ? R.drawable.ic_video_pause : R.drawable.ic_video_play, nVar7, 0);
                boolean zH2 = sVar8.h(r0Var) | sVar8.f(aVar6);
                Object objQ8 = sVar8.Q();
                if (zH2 || objQ8 == l1.m.f39353a) {
                    objQ8 = new androidx.lifecycle.compose.a(20, aVar6, r0Var, b1Var3);
                    sVar8.o0(objQ8);
                }
                d0.n.c(bVarY, null, iu.k.q(6, 7, (a) objQ8, nVar7, oVar, false), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, nVar7, 56, 120);
                sVar8.p(true);
                return b0.f48488a;
            case 9:
                jf jfVar = (jf) this.f22622b;
                c cVar9 = (c) this.f22623c;
                b1 b1Var4 = (b1) this.f22624d;
                t1 paddingValues = (t1) obj;
                n nVar8 = (n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                m.f(paddingValues, "paddingValues");
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((s) nVar8).f(paddingValues) ? 4 : 2;
                }
                s sVar9 = (s) nVar8;
                if (sVar9.T(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    o oVar2 = o.f58481a;
                    r rVarZ = j0.c.z(e2.d(oVar2, 1.0f), paddingValues);
                    q0 q0VarD3 = j0.o.d(z1.c.f58463a, false);
                    int iHashCode7 = Long.hashCode(sVar9.T);
                    q1 q1VarL7 = sVar9.l();
                    r rVarC7 = z1.a.c(sVar9, rVarZ);
                    k.J.getClass();
                    y2.i iVar7 = j.f56913b;
                    sVar9.h0();
                    if (sVar9.S) {
                        sVar9.k(iVar7);
                    } else {
                        sVar9.r0();
                    }
                    l1.t.J(j.f56917f, q0VarD3, sVar9);
                    l1.t.J(j.f56916e, q1VarL7, sVar9);
                    h hVar7 = j.f56918g;
                    if (sVar9.S || !m.a(sVar9.Q(), Integer.valueOf(iHashCode7))) {
                        e.A(iHashCode7, sVar9, iHashCode7, hVar7);
                    }
                    l1.t.J(j.f56915d, rVarC7, sVar9);
                    boolean z13 = jfVar.f49949b;
                    g gVar3 = l1.m.f39353a;
                    if (z13) {
                        sVar9.d0(275293830);
                        tv.a.d(0, 1, sVar9, null);
                        sVar9.p(false);
                    } else if (jfVar.f49948a.isEmpty()) {
                        sVar9.d0(275393030);
                        tv.a.d(0, 1, sVar9, null);
                        sVar9.p(false);
                    } else {
                        sVar9.d0(275547162);
                        r rVarD2 = e2.d(oVar2, 1.0f);
                        boolean zH3 = sVar9.h(jfVar) | sVar9.f(cVar9);
                        Object objQ9 = sVar9.Q();
                        if (zH3 || objQ9 == gVar3) {
                            objQ9 = new j0(jfVar, cVar9, b1Var4, 17);
                            sVar9.o0(objQ9);
                        }
                        ue.f.a(rVarD2, null, null, null, null, null, false, null, (c) objQ9, sVar9, 6, 510);
                        sVar9.p(false);
                    }
                    sVar9.p(true);
                    lt.j jVar = (lt.j) b1Var4.getValue();
                    if (jVar == null) {
                        sVar9.d0(-159649056);
                    } else {
                        sVar9.d0(-159649055);
                        boolean zH4 = sVar9.h(jVar) | sVar9.f(cVar9);
                        Object objQ10 = sVar9.Q();
                        if (zH4 || objQ10 == gVar3) {
                            objQ10 = new androidx.lifecycle.compose.a(jVar, cVar9, b1Var4, 25);
                            sVar9.o0(objQ10);
                        }
                        a aVar7 = (a) objQ10;
                        Object objQ11 = sVar9.Q();
                        if (objQ11 == gVar3) {
                            objQ11 = new i0(19, b1Var4);
                            sVar9.o0(objQ11);
                        }
                        lt.b.c(aVar7, (a) objQ11, sVar9, 48);
                    }
                    sVar9.p(false);
                } else {
                    sVar9.W();
                }
                return b0.f48488a;
            case 10:
                b1 b1Var5 = (b1) this.f22622b;
                a1 a1Var = (a1) this.f22623c;
                b1 b1Var6 = (b1) this.f22624d;
                b2 AppTopAppBar = (b2) obj;
                n nVar9 = (n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                m.f(AppTopAppBar, "$this$AppTopAppBar");
                s sVar10 = (s) nVar9;
                if (sVar10.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    o oVar3 = o.f58481a;
                    r rVarA2 = j0.c.A(oVar3, 16);
                    Object objQ12 = sVar10.Q();
                    if (objQ12 == l1.m.f39353a) {
                        objQ12 = new i0(26, b1Var5);
                        sVar10.o0(objQ12);
                    }
                    r rVarQ2 = iu.k.q(24582, 7, (a) objQ12, sVar10, rVarA2, false);
                    a2 a2VarA = z1.a(i.f35303a, z1.c.M, sVar10, 48);
                    int iHashCode8 = Long.hashCode(sVar10.T);
                    q1 q1VarL8 = sVar10.l();
                    r rVarC8 = z1.a.c(sVar10, rVarQ2);
                    k.J.getClass();
                    y2.i iVar8 = j.f56913b;
                    sVar10.h0();
                    if (sVar10.S) {
                        sVar10.k(iVar8);
                    } else {
                        sVar10.r0();
                    }
                    l1.t.J(j.f56917f, a2VarA, sVar10);
                    l1.t.J(j.f56916e, q1VarL8, sVar10);
                    h hVar8 = j.f56918g;
                    if (sVar10.S || !m.a(sVar10.Q(), Integer.valueOf(iHashCode8))) {
                        e.A(iHashCode8, sVar10, iHashCode8, hVar8);
                    }
                    l1.t.J(j.f56915d, rVarC8, sVar10);
                    d0.n.c(se.k.y(R.drawable.baseline_filter_list_balck_24, sVar10, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(((s1) sVar10.j(h1.v1.f31180a)).f31034q, 5), sVar10, 48, 60);
                    j0.c.g(sVar10, e2.s(oVar3, 4));
                    ua.b((((h1) a1Var).l() + 1) + "/" + ((List) b1Var6.getValue()).size(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar10, 0, 0, 131070);
                    sVar10.p(true);
                } else {
                    sVar10.W();
                }
                return b0.f48488a;
            case 11:
                a aVar8 = (a) this.f22623c;
                a aVar9 = (a) this.f22624d;
                b1 b1Var7 = (b1) this.f22622b;
                v DropdownMenu = (v) obj;
                n nVar10 = (n) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                m.f(DropdownMenu, "$this$DropdownMenu");
                s sVar11 = (s) nVar10;
                if (sVar11.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    t1.d dVar = mt.g.f41448q;
                    boolean zF7 = sVar11.f(aVar8);
                    Object objQ13 = sVar11.Q();
                    g gVar4 = l1.m.f39353a;
                    if (zF7 || objQ13 == gVar4) {
                        objQ13 = new fu.e(6, aVar8, b1Var7);
                        sVar11.o0(objQ13);
                    }
                    h1.s.b(dVar, (a) objQ13, null, false, null, null, sVar11, 6);
                    t1.d dVar2 = mt.g.f41450r;
                    boolean zF8 = sVar11.f(aVar9);
                    Object objQ14 = sVar11.Q();
                    if (zF8 || objQ14 == gVar4) {
                        objQ14 = new fu.e(7, aVar9, b1Var7);
                        sVar11.o0(objQ14);
                    }
                    h1.s.b(dVar2, (a) objQ14, null, false, null, null, sVar11, 6);
                } else {
                    sVar11.W();
                }
                return b0.f48488a;
            case 12:
                rt.a2 a2Var = (rt.a2) this.f22622b;
                b3 b3Var2 = (b3) this.f22623c;
                a1 a1Var2 = (a1) this.f22624d;
                t1 paddingValues2 = (t1) obj;
                n nVar11 = (n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                m.f(paddingValues2, "paddingValues");
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= ((s) nVar11).f(paddingValues2) ? 4 : 2;
                }
                s sVar12 = (s) nVar11;
                if (sVar12.T(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    rt.o1 o1Var = (rt.o1) b3Var2.getValue();
                    int iL = ((h1) a1Var2).l();
                    boolean zH5 = sVar12.h(a2Var);
                    Object objQ15 = sVar12.Q();
                    g gVar5 = l1.m.f39353a;
                    if (zH5 || objQ15 == gVar5) {
                        a3 a3Var = new a3(1, a2Var, rt.a2.class, "setContentTab", "setContentTab(Lcom/lingodeer/course/viewmodels/FutureReviewContentTab;)V", 0, 20);
                        sVar12.o0(a3Var);
                        objQ15 = a3Var;
                    }
                    c cVar10 = (c) ((mz.e) objQ15);
                    boolean zH6 = sVar12.h(a2Var);
                    Object objQ16 = sVar12.Q();
                    if (zH6 || objQ16 == gVar5) {
                        objQ16 = new mt.i1(a2Var, 1);
                        sVar12.o0(objQ16);
                    }
                    e eVar = (e) objQ16;
                    boolean zH7 = sVar12.h(a2Var);
                    Object objQ17 = sVar12.Q();
                    if (zH7 || objQ17 == gVar5) {
                        a3 a3Var2 = new a3(1, a2Var, rt.a2.class, "toggleUnitExpansion", "toggleUnitExpansion(J)V", 0, 21);
                        sVar12.o0(a3Var2);
                        objQ17 = a3Var2;
                    }
                    c cVar11 = (c) ((mz.e) objQ17);
                    boolean zH8 = sVar12.h(a2Var);
                    Object objQ18 = sVar12.Q();
                    if (zH8 || objQ18 == gVar5) {
                        m0 m0Var = new m0(2, a2Var, rt.a2.class, "updateUnitSelection", "updateUnitSelection(JZ)V", 0, 2);
                        sVar12.o0(m0Var);
                        objQ18 = m0Var;
                    }
                    e eVar2 = (e) ((mz.e) objQ18);
                    boolean zH9 = sVar12.h(a2Var);
                    Object objQ19 = sVar12.Q();
                    if (zH9 || objQ19 == gVar5) {
                        objQ19 = new k1(a2Var, 0);
                        sVar12.o0(objQ19);
                    }
                    mt.g.M(o1Var, iL, cVar10, eVar, cVar11, eVar2, (c) objQ19, j0.c.z(e2.d(o.f58481a, 1.0f), paddingValues2), sVar12, 0);
                } else {
                    sVar12.W();
                }
                return b0.f48488a;
            case 13:
                return a(obj, obj2, obj3);
            case 14:
                return c(obj, obj2, obj3);
            case 15:
                return d(obj, obj2, obj3);
            case 16:
                return e(obj, obj2, obj3);
            case 17:
                return h(obj, obj2, obj3);
            case 18:
                return j(obj, obj2, obj3);
            case 19:
                return k(obj, obj2, obj3);
            case 20:
                return l(obj, obj2, obj3);
            default:
                String str4 = (String) this.f22622b;
                a aVar10 = (a) this.f22623c;
                a aVar11 = (a) this.f22624d;
                v ModalBottomSheet2 = (v) obj;
                n nVar12 = (n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                m.f(ModalBottomSheet2, "$this$ModalBottomSheet");
                s sVar13 = (s) nVar12;
                if (sVar13.T(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    y0 y0VarA = y0.a(((dc) sVar13.j(fc.f30256a)).f30175h, 0L, j3.A(18), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744445);
                    o oVar4 = o.f58481a;
                    float f5 = 16;
                    ua.b(str4, j0.c.A(e2.e(oVar4, 1.0f), f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar13, 48, 0, 65532);
                    boolean zF9 = sVar13.f(aVar10) | sVar13.f(aVar11);
                    Object objQ20 = sVar13.Q();
                    if (zF9 || objQ20 == l1.m.f39353a) {
                        objQ20 = new a(4, aVar10, aVar11);
                        sVar13.o0(objQ20);
                    }
                    iu.k.e((a) objQ20, e2.e(j0.c.B(oVar4, f5, f5), 1.0f), false, 0L, null, ys.a.f57893n, sVar13, 196656, 28);
                } else {
                    sVar13.W();
                }
                return b0.f48488a;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i11) {
        this.f22621a = i11;
        this.f22622b = obj;
        this.f22623c = obj2;
        this.f22624d = obj3;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        long j11;
        long j12;
        List<mh.d> list = (List) this.f22622b;
        x1.p pVar = (x1.p) this.f22623c;
        xt.u uVar = (xt.u) this.f22624d;
        n nVar = (n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        m.f((u0) obj, LwKl.NkGXlKPpTV);
        s sVar = (s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            for (mh.d dVar : list) {
                kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
                boolean zContains = pVar.contains(dVar);
                uVar2.f38357a = zContains;
                if (zContains) {
                    sVar.d0(1080203335);
                    j11 = ((s1) sVar.j(h1.v1.f31180a)).f31017a;
                } else {
                    sVar.d0(1080204590);
                    j11 = ((s1) sVar.j(h1.v1.f31180a)).B;
                }
                sVar.p(false);
                r rVarB = j0.c.B(iu.k.q(0, 7, new l0(uVar2, pVar, dVar, 10), sVar, d0.n.h(o.f58481a, j11, r0.f.a()), false), 16, 4);
                q0 q0VarD = j0.o.d(z1.c.f58463a, false);
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
                l1.t.J(j.f56917f, q0VarD, sVar);
                l1.t.J(j.f56916e, q1VarL, sVar);
                h hVar = j.f56918g;
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(j.f56915d, rVarC, sVar);
                String lowerCase = dVar.a().toLowerCase(Locale.ROOT);
                m.e(lowerCase, "toLowerCase(...)");
                String strE0 = ub.a.e0(sVar, uVar.c(lowerCase));
                if (uVar2.f38357a) {
                    sVar.d0(-7451327);
                    j12 = ((s1) sVar.j(h1.v1.f31180a)).f31019b;
                } else {
                    sVar.d0(-7450015);
                    j12 = ((s1) sVar.j(h1.v1.f31180a)).f31034q;
                }
                sVar.p(false);
                s sVar2 = sVar;
                ua.b(strE0, null, j12, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131066);
                sVar = sVar2;
                sVar.p(true);
            }
        } else {
            sVar.W();
        }
        return b0.f48488a;
    }

    public /* synthetic */ d(kr.d0 d0Var, c cVar, a aVar) {
        this.f22621a = 7;
        this.f22622b = d0Var;
        this.f22624d = cVar;
        this.f22623c = aVar;
    }
}
