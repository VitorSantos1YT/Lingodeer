package fu;

import android.net.Uri;
import android.os.Bundle;
import com.google.api.Service;
import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import com.lingo.lingoskill.malskill.ui.learn.MALSyllableIntroductionActivity;
import com.lingo.lingoskill.ui.handwrite.HandWriteGroupActivity;
import com.lingo.lingoskill.ui.handwrite.HandWriteSearchActivity;
import com.lingo.lingoskill.ui.learn.BaseSmartTipsActivity;
import com.lingo.lingoskill.ui.learn.DebugTestActivity;
import com.lingo.splash.SplashIndexActivity;
import com.lingo.story.ui.StoryActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.DayStreakFinishedStatus;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.dc;
import h1.fc;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.v1;
import iv.b1;
import iv.z0;
import j0.e2;
import j3.y0;
import java.util.Collection;
import java.util.List;
import jt.c1;
import jt.x0;
import l1.b3;
import l1.g1;
import l1.w1;
import w2.q0;
import w2.q1;
import ys.e3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28138c;

    public /* synthetic */ n(int i11, Object obj, Object obj2) {
        this.f28136a = i11;
        this.f28137b = obj;
        this.f28138c = obj2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f28136a;
        int i12 = 7;
        l1.g gVar = l1.m.f39353a;
        boolean z11 = false;
        int i13 = 2;
        int i14 = 3;
        char c11 = 1;
        char c12 = 1;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj3 = this.f28138c;
        Object obj4 = this.f28137b;
        switch (i11) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                ((g1) obj4).m(fFloatValue);
                ((g1) obj3).m(fFloatValue2);
                return b0Var;
            case 1:
                ((Integer) obj2).getClass();
                a.i((DayStreakFinishedStatus) obj4, (fz.a) obj3, (l1.n) obj, l1.t.M(49));
                return b0Var;
            case 2:
                fz.f fVar = (fz.f) obj3;
                String packageName = (String) obj;
                String title = (String) obj2;
                kotlin.jvm.internal.m.f(packageName, "packageName");
                kotlin.jvm.internal.m.f(title, "title");
                Uri uri = (Uri) ((kotlin.jvm.internal.y) obj4).f38361a;
                if (uri != null) {
                    fVar.invoke(uri, packageName, title);
                }
                return b0Var;
            case 3:
                ((Integer) obj2).getClass();
                int i15 = SplashIndexActivity.M;
                ((SplashIndexActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 4:
                ((Integer) obj2).getClass();
                int i16 = SplashIndexActivity.M;
                ((SplashIndexActivity) obj4).p((hr.c) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 5:
                ((Integer) obj2).getClass();
                int i17 = HandWriteGroupActivity.f22048t;
                ((HandWriteGroupActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 6:
                ((Integer) obj2).getClass();
                int i18 = HandWriteSearchActivity.f22049t;
                ((HandWriteSearchActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 7:
                ((Integer) obj2).getClass();
                int i19 = MALSyllableIntroductionActivity.Q;
                ((MALSyllableIntroductionActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 8:
                ((Integer) obj2).getClass();
                int i21 = MALSyllableIntroductionActivity.Q;
                ((MALSyllableIntroductionActivity) obj4).t((ln.a) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 9:
                mv.u uVar = (mv.u) obj4;
                fz.a aVar = (fz.a) obj3;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h1.e0.c(t1.e.d(602561584, new ch.b0(uVar, 11), sVar), null, t1.e.d(1919327342, new at.o(19, aVar), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
                } else {
                    sVar.W();
                }
                return b0Var;
            case 10:
                o0.t tVar = (o0.t) obj4;
                rz.b0 b0Var2 = (rz.b0) obj3;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean z12 = tVar.k() == 0;
                    String strE0 = ub.a.e0(sVar2, R.string.hiragana_table);
                    boolean zH = sVar2.h(b0Var2) | sVar2.f(tVar);
                    Object objQ = sVar2.Q();
                    if (zH || objQ == gVar) {
                        objQ = new iv.x(b0Var2, tVar, c11 == true ? 1 : 0);
                        sVar2.o0(objQ);
                    }
                    iv.a.C(0, (fz.a) objQ, strE0, sVar2, z12);
                    boolean z13 = tVar.k() == 1;
                    String strE1 = ub.a.e0(sVar2, R.string.katakana_table);
                    boolean zH2 = sVar2.h(b0Var2) | sVar2.f(tVar);
                    Object objQ2 = sVar2.Q();
                    if (zH2 || objQ2 == gVar) {
                        objQ2 = new iv.x(b0Var2, tVar, i13);
                        sVar2.o0(objQ2);
                    }
                    iv.a.C(0, (fz.a) objQ2, strE1, sVar2, z13);
                    boolean z14 = tVar.k() == 2;
                    String strE2 = ub.a.e0(sVar2, R.string.handwriting);
                    boolean zH3 = sVar2.h(b0Var2) | sVar2.f(tVar);
                    Object objQ3 = sVar2.Q();
                    if (zH3 || objQ3 == gVar) {
                        objQ3 = new iv.x(b0Var2, tVar, z11 ? 1 : 0);
                        sVar2.o0(objQ3);
                    }
                    iv.a.C(0, (fz.a) objQ3, strE2, sVar2, z14);
                } else {
                    sVar2.W();
                }
                return b0Var;
            case 11:
                kv.e0 e0Var = (kv.e0) obj4;
                String str = (String) obj3;
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String str2 = e0Var.f38731c;
                    ua.b(oz.q.K0(str2) ? str : str2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar3.j(fc.f30256a)).f30178k, sVar3, 0, 0, 65534);
                } else {
                    sVar3.W();
                }
                return b0Var;
            case 12:
                kv.q qVar = (kv.q) obj4;
                fz.c cVar = (fz.c) obj3;
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    kv.n nVar5 = (kv.n) qVar;
                    if (nVar5.f38784c.isEmpty()) {
                        sVar4.d0(154939328);
                    } else {
                        sVar4.d0(161102965);
                        iv.a.A(nVar5.f38784c, cVar, j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar4, 384, 0);
                    }
                    sVar4.p(false);
                } else {
                    sVar4.W();
                }
                return b0Var;
            case 13:
                ((Integer) obj2).getClass();
                iv.a.v((String) obj4, (List) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 14:
                ((Integer) obj2).getClass();
                z0.g((kv.c) obj4, (z1.r) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 15:
                ((Integer) obj2).getClass();
                z0.d((kv.b) obj4, (fz.c) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 16:
                ((Integer) obj2).getClass();
                z0.o((kv.g) obj4, (fz.c) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 17:
                fz.a aVar2 = (fz.a) obj4;
                mv.n nVar6 = (mv.n) obj3;
                l1.n nVar7 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar7;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zH4 = sVar5.h(nVar6);
                    Object objQ4 = sVar5.Q();
                    if (zH4 || objQ4 == gVar) {
                        objQ4 = new hh.o(nVar6, 10);
                        sVar5.o0(objQ4);
                    }
                    fz.a aVar3 = (fz.a) objQ4;
                    boolean zH5 = sVar5.h(nVar6);
                    Object objQ5 = sVar5.Q();
                    if (zH5 || objQ5 == gVar) {
                        objQ5 = new iv.h(nVar6, i14);
                        sVar5.o0(objQ5);
                    }
                    b1.d(aVar2, aVar3, (fz.c) objQ5, null, sVar5, 0);
                } else {
                    sVar5.W();
                }
                return b0Var;
            case 18:
                q1 q1Var = (q1) obj;
                v3.a aVar4 = (v3.a) obj2;
                return ((q0) obj4).e(q1Var, q1Var.C(b0Var, new t1.d(new es.c(c12 == true ? 1 : 0, (t1.d) obj3, new j0.s(q1Var, aVar4.f53483a)), true, -431986394)), aVar4.f53483a);
            case 19:
                ((Integer) obj2).getClass();
                int i22 = HINDISyllableIntroductionActivity.K;
                ((HINDISyllableIntroductionActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 20:
                ((Integer) obj2).getClass();
                int i23 = BaseSmartTipsActivity.H;
                ((BaseSmartTipsActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 21:
                ((Integer) obj2).getClass();
                int i24 = DebugTestActivity.H;
                ((DebugTestActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case 22:
                b3 b3Var = (b3) obj4;
                fz.a aVar5 = (fz.a) obj3;
                l1.n nVar8 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.s sVar6 = (l1.s) nVar8;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    rp.h hVar = (rp.h) b3Var.getValue();
                    if (kotlin.jvm.internal.m.a(hVar, rp.f.f49347a)) {
                        sVar6.d0(-1534816861);
                        z1.r rVarH = d0.n.h(e2.g(e2.e(z1.o.f58481a, 1.0f), 220), ((s1) sVar6.j(v1.f31180a)).f31033p, r0.f.d(12));
                        q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                        int iHashCode = Long.hashCode(sVar6.T);
                        l1.q1 q1VarL = sVar6.l();
                        z1.r rVarC = z1.a.c(sVar6, rVarH);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar6.h0();
                        if (sVar6.S) {
                            sVar6.k(iVar);
                        } else {
                            sVar6.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD, sVar6);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar6);
                        y2.h hVar2 = y2.j.f56918g;
                        if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar6, iHashCode, hVar2);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, sVar6);
                        tv.a.d(0, 1, sVar6, null);
                        sVar6.p(true);
                        sVar6.p(false);
                    } else {
                        if (!(hVar instanceof rp.g)) {
                            throw nv.p.x(sVar6, -1534818957, false);
                        }
                        sVar6.d0(-1534803870);
                        rp.g gVar2 = (rp.g) hVar;
                        e3.b(gVar2.f49348a, gVar2.f49349b, aVar5, sVar6, 0);
                        sVar6.p(false);
                    }
                } else {
                    sVar6.W();
                }
                return b0Var;
            case 23:
                ((Integer) obj2).getClass();
                gb.r.a((fz.a) obj4, (rp.e) obj3, (l1.n) obj, l1.t.M(7));
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((Integer) obj2).getClass();
                int i25 = StoryActivity.N;
                ((StoryActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                kr.b0 b0Var3 = (kr.b0) obj4;
                l1.b1 b1Var = (l1.b1) obj3;
                l1.n nVar9 = (l1.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                l1.s sVar7 = (l1.s) nVar9;
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zH6 = sVar7.h(b0Var3);
                    Object objQ6 = sVar7.Q();
                    if (zH6 || objQ6 == gVar) {
                        objQ6 = new fp.f(21, b0Var3, b1Var);
                        sVar7.o0(objQ6);
                    }
                    k7.m((fz.a) objQ6, null, false, null, null, null, jr.a.f36561f, sVar7, 805306368, 510);
                } else {
                    sVar7.W();
                }
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                rz.e0.B((rz.b0) obj4, null, null, new jt.b0((List) obj2, (jt.v) obj3, (String) obj, null), 3);
                return b0Var;
            case 27:
                rz.e0.B((rz.b0) obj4, null, null, new c1((List) obj2, (x0) obj3, (String) obj, null), 3);
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                v3.d dVar = (v3.d) obj4;
                t1.d dVar2 = (t1.d) obj3;
                l1.n nVar10 = (l1.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                l1.s sVar8 = (l1.s) nVar10;
                if (sVar8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    w1 w1VarA = z2.g1.f58547h.a(dVar);
                    l1.d0 d0Var = ua.f31167a;
                    l1.t.b(new w1[]{w1VarA, d0Var.a(y0.a((y0) sVar8.j(d0Var), 0L, 0L, null, null, defpackage.f.f26114a, 0L, null, null, 0, 0, j3.v(1.3d), null, 16646111))}, t1.e.d(-615388816, new br.m(dVar2, i12), sVar8), sVar8, 56);
                } else {
                    sVar8.W();
                }
                return b0Var;
            default:
                ((Integer) obj2).getClass();
                k9.m.b((List) obj4, (Collection) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var;
        }
    }

    public /* synthetic */ n(Object obj, int i11, int i12, Object obj2) {
        this.f28136a = i12;
        this.f28137b = obj;
        this.f28138c = obj2;
    }
}
