package qu;

import am.rVFB.LwKl;
import com.lingo.lingoskill.idnskill.ui.learn.IDNSyllableIntroductionActivity;
import com.lingo.lingoskill.ptskill.ui.syllable.PTNewSyllableIntroductionActivity;
import com.lingo.lingoskill.turskill.ui.learn.TURSyllableIntroductionActivity;
import com.lingo.lingoskill.ukrskill.ui.learn.UKRSyllableIntroductionActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseCharacterGroup;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import g2.f0;
import h1.g7;
import h1.r4;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.b2;
import j0.e2;
import j0.i1;
import j0.t1;
import j0.z1;
import l1.q1;
import qy.b0;
import rt.dd;
import rt.ed;
import rt.f4;
import rt.g4;
import rt.mb;
import s0.n1;
import w2.g1;
import w2.p0;
import w2.q0;
import w2.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f48411b;

    public /* synthetic */ s(Object obj, int i11) {
        this.f48410a = i11;
        this.f48411b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v140, types: [java.lang.Object, java.util.Collection] */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Exception {
        String strQ0;
        int i11 = this.f48410a;
        z1.o oVar = z1.o.f58481a;
        b0 b0Var = b0.f48488a;
        Object obj4 = this.f48411b;
        switch (i11) {
            case 0:
                tu.h hVar = (tu.h) obj4;
                b2 AppGradientButton = (b2) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton, "$this$AppGradientButton");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tu.k kVar = ((tu.g) hVar).f52568c;
                    if (kVar == null || !kVar.f52596c) {
                        sVar.d0(40838761);
                        iu.k.d(ub.a.e0(sVar, R.string.confirm), null, null, sVar, 0, 6);
                        sVar.p(false);
                    } else {
                        sVar.d0(40159148);
                        a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
                        int iHashCode = Long.hashCode(sVar.T);
                        q1 q1VarL = sVar.l();
                        z1.o oVar2 = z1.o.f58481a;
                        z1.r rVarC = z1.a.c(sVar, oVar2);
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
                        y2.h hVar2 = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, sVar);
                        r4.a(se.k.y(R.drawable.gem_icon, sVar, 0), null, sVar, 432);
                        iu.k.d(oz.x.q0(ub.a.e0(sVar, R.string.use_s_gems), "%s", "100"), j0.c.E(oVar2, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), null, sVar, 48, 4);
                        sVar.p(true);
                        sVar.p(false);
                    }
                } else {
                    sVar.W();
                }
                return b0Var;
            case 1:
                ((a00.c) obj4).invoke((Throwable) obj);
                return b0Var;
            case 2:
                v3.a aVar = (v3.a) obj3;
                long j11 = ((n1) obj4).f51118f;
                long j12 = aVar.f53483a;
                int iJ = v3.a.j(j12);
                long j13 = aVar.f53483a;
                g1 g1VarB = ((p0) obj2).B(v3.a.a(hz.b.l((int) (j11 >> 32), iJ, v3.a.h(j13)), 0, hz.b.l((int) (4294967295L & j11), v3.a.i(j13), v3.a.g(j13)), 0, 10, j12));
                return ((s0) obj).q0(g1VarB.f54501a, g1VarB.f54502b, ry.s.f50855a, new c1.i(g1VarB, 10));
            case 3:
                IDNSyllableIntroductionActivity iDNSyllableIntroductionActivity = (IDNSyllableIntroductionActivity) obj4;
                m0.l item = (m0.l) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i12 = IDNSyllableIntroductionActivity.P;
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    q1 q1VarL2 = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, oVar);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                    iDNSyllableIntroductionActivity.q("Indonesian is the official language of the Republic of Indonesia and is spoken by over 270 million people. It uses the Latin alphabet, consisting of 26 letters, the same as the English alphabet. However, some letters have different pronunciations. Additionally, Indonesian has simpler phonetic rules, so the spelling of words generally matches their pronunciation.", sVar2, 6);
                    ep.a.C(oVar, 8, sVar2, true);
                } else {
                    sVar2.W();
                }
                return b0Var;
            case 4:
                CourseCharacterGroup courseCharacterGroup = (CourseCharacterGroup) obj4;
                j0.v Card = (j0.v) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    z1.r rVarB = j0.c.B(e2.e(oVar, 1.0f), 16, 12);
                    z1.i iVar3 = z1.c.M;
                    a2 a2VarA2 = z1.a(j0.i.f35303a, iVar3, sVar3, 48);
                    int iHashCode3 = Long.hashCode(sVar3.T);
                    q1 q1VarL3 = sVar3.l();
                    z1.r rVarC3 = z1.a.c(sVar3, rVarB);
                    y2.k.J.getClass();
                    y2.i iVar4 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar4);
                    } else {
                        sVar3.r0();
                    }
                    y2.h hVar4 = y2.j.f56917f;
                    l1.t.J(hVar4, a2VarA2, sVar3);
                    y2.h hVar5 = y2.j.f56916e;
                    l1.t.J(hVar5, q1VarL3, sVar3);
                    y2.h hVar6 = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar6);
                    }
                    y2.h hVar7 = y2.j.f56915d;
                    l1.t.J(hVar7, rVarC3, sVar3);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    i1 i1Var = new i1(1.0f, true);
                    j0.u uVarA2 = j0.t.a(j0.i.g(8), z1.c.O, sVar3, 6);
                    int iHashCode4 = Long.hashCode(sVar3.T);
                    q1 q1VarL4 = sVar3.l();
                    z1.r rVarC4 = z1.a.c(sVar3, i1Var);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar4);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(hVar4, uVarA2, sVar3);
                    l1.t.J(hVar5, q1VarL4, sVar3);
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar6);
                    }
                    l1.t.J(hVar7, rVarC4, sVar3);
                    a2 a2VarA3 = z1.a(j0.i.g(4), iVar3, sVar3, 54);
                    int iHashCode5 = Long.hashCode(sVar3.T);
                    q1 q1VarL5 = sVar3.l();
                    z1.r rVarC5 = z1.a.c(sVar3, oVar);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar4);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(hVar4, a2VarA3, sVar3);
                    l1.t.J(hVar5, q1VarL5, sVar3);
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar6);
                    }
                    l1.t.J(hVar7, rVarC5, sVar3);
                    int groupIndex = courseCharacterGroup.getGroupIndex();
                    if (groupIndex == 11) {
                        sVar3.d0(2010313901);
                        strQ0 = oz.x.q0(ub.a.d0(R.string.group_s, new Object[]{courseCharacterGroup.getGroupName()}, sVar3), "?", BuildConfig.VERSION_NAME);
                        sVar3.p(false);
                    } else if (groupIndex != 37) {
                        sVar3.d0(2010321343);
                        strQ0 = ub.a.d0(R.string.group_s, new Object[]{courseCharacterGroup.getGroupName()}, sVar3);
                        sVar3.p(false);
                    } else {
                        sVar3.d0(2010319629);
                        strQ0 = oz.x.q0(ub.a.d0(R.string.group_s, new Object[]{courseCharacterGroup.getGroupName()}, sVar3), "?", BuildConfig.VERSION_NAME);
                        sVar3.p(false);
                    }
                    ua.b(strQ0, null, ((s1) sVar3.j(v1.f31180a)).f31034q, j3.A(18), null, n3.s.f43178t, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 199680, 0, 131026);
                    sVar3.p(true);
                    ua.b(ry.m.y0(oz.q.W0(xt.b.b().isSChinese ? courseCharacterGroup.getGroupList() : courseCharacterGroup.getTGroupList(), new String[]{LwKl.XZiVoiPmZt}, 0, 6), " ", null, null, null, 62), null, f0.e(4292401368L), j3.A(14), null, null, null, 0L, null, j3.A(16), 0, false, 0, 0, null, sVar3, 3456, 6, 130034);
                    sVar3.p(true);
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                return b0Var;
            case 5:
                TURSyllableIntroductionActivity tURSyllableIntroductionActivity = (TURSyllableIntroductionActivity) obj4;
                m0.l item2 = (m0.l) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i13 = TURSyllableIntroductionActivity.H;
                kotlin.jvm.internal.m.f(item2, "$this$item");
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    j0.u uVarA3 = j0.t.a(j0.i.f35305c, z1.c.O, sVar4, 0);
                    int iHashCode6 = Long.hashCode(sVar4.T);
                    q1 q1VarL6 = sVar4.l();
                    z1.r rVarC6 = z1.a.c(sVar4, oVar);
                    y2.k.J.getClass();
                    y2.i iVar5 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar5);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA3, sVar4);
                    l1.t.J(y2.j.f56916e, q1VarL6, sVar4);
                    y2.h hVar8 = y2.j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode6))) {
                        defpackage.e.A(iHashCode6, sVar4, iHashCode6, hVar8);
                    }
                    l1.t.J(y2.j.f56915d, rVarC6, sVar4);
                    tURSyllableIntroductionActivity.q(ub.a.e0(sVar4, R.string.tur_alp_section_content_1), sVar4, 0);
                    tURSyllableIntroductionActivity.q(ub.a.e0(sVar4, R.string.tur_alp_section_content_2), sVar4, 0);
                    ep.a.C(oVar, 8, sVar4, true);
                } else {
                    sVar4.W();
                }
                return b0Var;
            case 6:
                yn.a aVar2 = (yn.a) obj4;
                t1 contentPadding = (t1) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i14 = PTNewSyllableIntroductionActivity.f21986t;
                kotlin.jvm.internal.m.f(contentPadding, "contentPadding");
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((l1.s) nVar5).f(contentPadding) ? 4 : 2;
                }
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    z1.r rVarZ = j0.c.z(oVar, contentPadding);
                    q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode7 = Long.hashCode(sVar5.T);
                    q1 q1VarL7 = sVar5.l();
                    z1.r rVarC7 = z1.a.c(sVar5, rVarZ);
                    y2.k.J.getClass();
                    y2.i iVar6 = y2.j.f56913b;
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar6);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar5);
                    l1.t.J(y2.j.f56916e, q1VarL7, sVar5);
                    y2.h hVar9 = y2.j.f56918g;
                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode7))) {
                        defpackage.e.A(iHashCode7, sVar5, iHashCode7, hVar9);
                    }
                    l1.t.J(y2.j.f56915d, rVarC7, sVar5);
                    boolean zH = sVar5.h(aVar2);
                    Object objQ = sVar5.Q();
                    if (zH || objQ == l1.m.f39353a) {
                        objQ = new s0.a(aVar2, 26);
                        sVar5.o0(objQ);
                    }
                    xn.a.b((fz.c) objQ, sVar5, 0);
                    sVar5.p(true);
                } else {
                    sVar5.W();
                }
                return b0Var;
            case 7:
                UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity = (UKRSyllableIntroductionActivity) obj4;
                m0.l item3 = (m0.l) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i15 = UKRSyllableIntroductionActivity.H;
                kotlin.jvm.internal.m.f(item3, "$this$item");
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    j0.u uVarA4 = j0.t.a(j0.i.f35305c, z1.c.O, sVar6, 0);
                    int iHashCode8 = Long.hashCode(sVar6.T);
                    q1 q1VarL8 = sVar6.l();
                    z1.r rVarC8 = z1.a.c(sVar6, oVar);
                    y2.k.J.getClass();
                    y2.i iVar7 = y2.j.f56913b;
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar7);
                    } else {
                        sVar6.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA4, sVar6);
                    l1.t.J(y2.j.f56916e, q1VarL8, sVar6);
                    y2.h hVar10 = y2.j.f56918g;
                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode8))) {
                        defpackage.e.A(iHashCode8, sVar6, iHashCode8, hVar10);
                    }
                    l1.t.J(y2.j.f56915d, rVarC8, sVar6);
                    uKRSyllableIntroductionActivity.v(ub.a.e0(sVar6, R.string.ukr_alp_section_content_1), sVar6, 0);
                    uKRSyllableIntroductionActivity.w(ub.a.e0(sVar6, R.string.ukr_alp_section_content_2), sVar6, 0);
                    uKRSyllableIntroductionActivity.q(ub.a.e0(sVar6, R.string.ukr_alp_section_content_3), sVar6, 0);
                    ep.a.C(oVar, 8, sVar6, true);
                } else {
                    sVar6.W();
                }
                return b0Var;
            case 8:
                ed edVar = (ed) obj4;
                l0.c item4 = (l0.c) obj;
                l1.n nVar7 = (l1.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item4, "$this$item");
                l1.s sVar7 = (l1.s) nVar7;
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    at.b.e(0, 4, edVar.f49697c, ub.a.e0(sVar7, R.string.lesson_index_section_title_1), sVar7, null);
                } else {
                    sVar7.W();
                }
                return b0Var;
            case 9:
                g4 g4Var = (g4) obj4;
                l0.c item5 = (l0.c) obj;
                l1.n nVar8 = (l1.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item5, "$this$item");
                l1.s sVar8 = (l1.s) nVar8;
                if (sVar8.T(1 & iIntValue8, (iIntValue8 & 17) != 16)) {
                    f4 f4Var = (f4) g4Var;
                    boolean zIsEmpty = f4Var.f49727e.isEmpty();
                    z1.o oVar3 = z1.o.f58481a;
                    if (zIsEmpty) {
                        if (f4Var.f49726d != null) {
                            sVar8.d0(1768272760);
                            at.b.e(384, 0, ((s1) sVar8.j(v1.f31180a)).f31028j, ub.a.e0(sVar8, R.string.conversation_practice), sVar8, j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 32, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
                        } else {
                            sVar8.d0(1760976724);
                        }
                        sVar8.p(false);
                    } else {
                        sVar8.d0(1767843224);
                        at.b.e(384, 0, ((s1) sVar8.j(v1.f31180a)).f31028j, ub.a.e0(sVar8, R.string.practice_with_a_story), sVar8, j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 32, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
                        sVar8.p(false);
                    }
                } else {
                    sVar8.W();
                }
                return b0Var;
            case 10:
                String bookmarkValue = (String) obj;
                long jLongValue = ((Long) obj2).longValue();
                String note = (String) obj3;
                kotlin.jvm.internal.m.f(bookmarkValue, "bookmarkValue");
                kotlin.jvm.internal.m.f(note, "note");
                ((mb) obj4).E(jLongValue, bookmarkValue, note);
                return b0Var;
            case 11:
                String bookmarkValue2 = (String) obj;
                long jLongValue2 = ((Long) obj2).longValue();
                String note2 = (String) obj3;
                kotlin.jvm.internal.m.f(bookmarkValue2, "bookmarkValue");
                kotlin.jvm.internal.m.f(note2, "note");
                ((dd) obj4).E(jLongValue2, bookmarkValue2, note2);
                return b0Var;
            default:
                zs.c cVar = (zs.c) obj4;
                b2 Button = (b2) obj;
                l1.n nVar9 = (l1.n) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Button, "$this$Button");
                l1.s sVar9 = (l1.s) nVar9;
                if (!sVar9.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    sVar9.W();
                } else if (cVar.f59351g) {
                    sVar9.d0(709118848);
                    a2 a2VarA4 = z1.a(j0.i.f35303a, z1.c.M, sVar9, 48);
                    int iHashCode9 = Long.hashCode(sVar9.T);
                    q1 q1VarL9 = sVar9.l();
                    z1.r rVarC9 = z1.a.c(sVar9, oVar);
                    y2.k.J.getClass();
                    y2.i iVar8 = y2.j.f56913b;
                    sVar9.h0();
                    if (sVar9.S) {
                        sVar9.k(iVar8);
                    } else {
                        sVar9.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA4, sVar9);
                    l1.t.J(y2.j.f56916e, q1VarL9, sVar9);
                    y2.h hVar11 = y2.j.f56918g;
                    if (sVar9.S || !kotlin.jvm.internal.m.a(sVar9.Q(), Integer.valueOf(iHashCode9))) {
                        defpackage.e.A(iHashCode9, sVar9, iHashCode9, hVar11);
                    }
                    l1.t.J(y2.j.f56915d, rVarC9, sVar9);
                    g7.b(2, 0, 438, 24, g2.x.f28618e, 0L, sVar9, e2.n(oVar, 16));
                    j0.c.g(sVar9, e2.s(oVar, 8));
                    ua.b("发送中...", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar9, 6, 0, 131070);
                    sVar9.p(true);
                    sVar9.p(false);
                } else {
                    sVar9.d0(709659705);
                    ua.b(ub.a.e0(sVar9, R.string.send), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar9, 0, 0, 131070);
                    sVar9.p(false);
                }
                return b0Var;
        }
    }
}
