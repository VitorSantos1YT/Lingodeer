package dl;

import av.t;
import bp.b1;
import com.adjust.sdk.Constants;
import com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity;
import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import com.lingo.lingoskill.idnskill.ui.learn.IDNSyllableIntroductionActivity;
import com.lingo.lingoskill.malskill.ui.learn.MALSyllableIntroductionActivity;
import com.lingo.lingoskill.turskill.ui.learn.TURSyllableIntroductionActivity;
import com.lingo.lingoskill.ukrskill.ui.learn.UKRSyllableIntroductionActivity;
import com.lingodeer.R;
import com.lingodeer.course.smarttips.data.model.AudioExampleType;
import com.lingodeer.course.smarttips.data.model.DialogueType;
import com.lingodeer.course.smarttips.data.model.DividerType;
import com.lingodeer.course.smarttips.data.model.ImageExampleType;
import com.lingodeer.course.smarttips.data.model.TableType;
import com.lingodeer.course.smarttips.data.model.TextExampleType;
import com.lingodeer.course.smarttips.data.model.TextType;
import g2.f0;
import g2.x;
import h1.s1;
import h1.v1;
import j0.e2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import l1.s;
import mt.c6;
import qy.b0;
import rt.r;
import us.p;
import z1.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f23480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23482d;

    public /* synthetic */ n(List list, Object obj, Object obj2, int i11) {
        this.f23479a = i11;
        this.f23480b = list;
        this.f23481c = obj;
        this.f23482d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:198:0x049b  */
    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12;
        int i13;
        int i14;
        String strM;
        String strValueOf;
        int i15;
        int i16;
        int i17;
        float f5;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23 = this.f23479a;
        o oVar = o.f58481a;
        int i24 = 5;
        b0 b0Var = b0.f48488a;
        l1.g gVar = l1.m.f39353a;
        Object obj5 = this.f23481c;
        List list = this.f23480b;
        Object obj6 = this.f23482d;
        int i25 = 4;
        switch (i23) {
            case 0:
                m0.l lVar = (m0.l) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.n nVar = (l1.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                gl.a aVar = (gl.a) obj6;
                if ((iIntValue2 & 6) == 0) {
                    i11 = iIntValue2 | (((s) nVar).f(lVar) ? 4 : 2);
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((s) nVar).d(iIntValue) ? 32 : 16;
                }
                s sVar = (s) nVar;
                if (sVar.T(i11 & 1, (i11 & 147) != 146)) {
                    List list2 = (List) list.get(iIntValue);
                    sVar.d0(1945993225);
                    GRKSyllableIntroductionActivity gRKSyllableIntroductionActivity = (GRKSyllableIntroductionActivity) obj5;
                    String str = (String) list2.get(0);
                    String str2 = (String) list2.get(1);
                    boolean zH = sVar.h(aVar) | sVar.h(list2);
                    Object objQ = sVar.Q();
                    if (zH || objQ == gVar) {
                        objQ = new b1(i24, aVar, list2);
                        sVar.o0(objQ);
                    }
                    int i26 = GRKSyllableIntroductionActivity.H;
                    gRKSyllableIntroductionActivity.r(str, str2, (fz.a) objQ, sVar, 0);
                    sVar.p(false);
                } else {
                    sVar.W();
                }
                return b0Var;
            case 1:
                m0.l lVar2 = (m0.l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.n nVar2 = (l1.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                ln.a aVar2 = (ln.a) obj6;
                if ((iIntValue4 & 6) == 0) {
                    i12 = iIntValue4 | (((s) nVar2).f(lVar2) ? 4 : 2);
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                s sVar2 = (s) nVar2;
                if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
                    String str3 = (String) list.get(iIntValue3);
                    sVar2.d0(1331475988);
                    MALSyllableIntroductionActivity mALSyllableIntroductionActivity = (MALSyllableIntroductionActivity) obj5;
                    boolean zH2 = sVar2.h(aVar2);
                    Object objQ2 = sVar2.Q();
                    if (zH2 || objQ2 == gVar) {
                        objQ2 = new t(aVar2, i25);
                        sVar2.o0(objQ2);
                    }
                    int i27 = MALSyllableIntroductionActivity.Q;
                    mALSyllableIntroductionActivity.r(str3, (fz.c) objQ2, sVar2, 0);
                    sVar2.p(false);
                } else {
                    sVar2.W();
                }
                return b0Var;
            case 2:
                m0.l lVar3 = (m0.l) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                l1.n nVar3 = (l1.n) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                ml.a aVar3 = (ml.a) obj6;
                if ((iIntValue6 & 6) == 0) {
                    i13 = iIntValue6 | (((s) nVar3).f(lVar3) ? 4 : 2);
                } else {
                    i13 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i13 |= ((s) nVar3).d(iIntValue5) ? 32 : 16;
                }
                s sVar3 = (s) nVar3;
                if (sVar3.T(i13 & 1, (i13 & 147) != 146)) {
                    List list3 = (List) list.get(iIntValue5);
                    sVar3.d0(-1211369401);
                    String str4 = (String) list3.get(0);
                    String str5 = (String) list3.get(1);
                    String str6 = (String) list3.get(2);
                    HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity = (HINDISyllableIntroductionActivity) obj5;
                    boolean zH3 = sVar3.h(aVar3) | sVar3.f(str6);
                    Object objQ3 = sVar3.Q();
                    if (zH3 || objQ3 == gVar) {
                        objQ3 = new b1(16, aVar3, str6);
                        sVar3.o0(objQ3);
                    }
                    int i28 = HINDISyllableIntroductionActivity.K;
                    hINDISyllableIntroductionActivity.r(str4, str5, (fz.a) objQ3, sVar3, 0);
                    sVar3.p(false);
                } else {
                    sVar3.W();
                }
                return b0Var;
            case 3:
                l0.c cVar = (l0.c) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                l1.n nVar4 = (l1.n) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                l1.b1 b1Var = (l1.b1) obj6;
                if ((iIntValue8 & 6) == 0) {
                    i14 = iIntValue8 | (((s) nVar4).f(cVar) ? 4 : 2);
                } else {
                    i14 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i14 |= ((s) nVar4).d(iIntValue7) ? 32 : 16;
                }
                s sVar4 = (s) nVar4;
                if (sVar4.T(i14 & 1, (i14 & 147) != 146)) {
                    r rVar = (r) list.get(iIntValue7);
                    sVar4.d0(-2117949011);
                    String str7 = rVar.f50318a;
                    int i29 = rVar.f50320c;
                    boolean zA = kotlin.jvm.internal.m.a(str7, (String) b1Var.getValue());
                    if (rVar.f50321d) {
                        strM = ep.a.m(sVar4, -2117834467, R.string.bookmark_folder_default_folder, sVar4, false);
                    } else {
                        sVar4.d0(-2117727703);
                        sVar4.p(false);
                        strM = rVar.f50319b;
                    }
                    String str8 = strM;
                    String str9 = (String) obj5;
                    if (str9 == null) {
                        strValueOf = String.valueOf(i29);
                    } else {
                        strValueOf = i29 + " " + str9;
                    }
                    String str10 = strValueOf;
                    boolean zF = sVar4.f(rVar);
                    Object objQ4 = sVar4.Q();
                    if (zF || objQ4 == gVar) {
                        objQ4 = new b1(21, rVar, b1Var);
                        sVar4.o0(objQ4);
                    }
                    mt.g.f(str8, str10, zA, (fz.a) objQ4, sVar4, 0);
                    sVar4.p(false);
                } else {
                    sVar4.W();
                }
                return b0Var;
            case 4:
                l0.c cVar2 = (l0.c) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                l1.n nVar5 = (l1.n) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                fz.c cVar3 = (fz.c) obj6;
                fz.c cVar4 = (fz.c) obj5;
                if ((iIntValue10 & 6) == 0) {
                    i15 = iIntValue10 | (((s) nVar5).f(cVar2) ? 4 : 2);
                } else {
                    i15 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i15 |= ((s) nVar5).d(iIntValue9) ? 32 : 16;
                }
                s sVar5 = (s) nVar5;
                if (sVar5.T(i15 & 1, (i15 & 147) != 146)) {
                    mh.i iVar = (mh.i) list.get(iIntValue9);
                    sVar5.d0(45106690);
                    z1.r rVarG = e2.g(oVar, 126);
                    boolean zF2 = sVar5.f(cVar4) | sVar5.f(iVar);
                    Object objQ5 = sVar5.Q();
                    if (zF2 || objQ5 == gVar) {
                        objQ5 = new nh.e(cVar4, iVar, 0);
                        sVar5.o0(objQ5);
                    }
                    fz.a aVar4 = (fz.a) objQ5;
                    boolean zF3 = sVar5.f(cVar3) | sVar5.f(iVar);
                    Object objQ6 = sVar5.Q();
                    if (zF3 || objQ6 == gVar) {
                        objQ6 = new nh.e(cVar3, iVar, 1);
                        sVar5.o0(objQ6);
                    }
                    ew.a.d(iVar, aVar4, (fz.a) objQ6, rVarG, true, sVar5, 27648, 0);
                    sVar5.p(false);
                } else {
                    sVar5.W();
                }
                return b0Var;
            case 5:
                m0.l lVar4 = (m0.l) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                l1.n nVar6 = (l1.n) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                wl.a aVar5 = (wl.a) obj6;
                if ((iIntValue12 & 6) == 0) {
                    i16 = iIntValue12 | (((s) nVar6).f(lVar4) ? 4 : 2);
                } else {
                    i16 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i16 |= ((s) nVar6).d(iIntValue11) ? 32 : 16;
                }
                s sVar6 = (s) nVar6;
                if (sVar6.T(i16 & 1, (i16 & 147) != 146)) {
                    String str11 = (String) list.get(iIntValue11);
                    sVar6.d0(1002607722);
                    IDNSyllableIntroductionActivity iDNSyllableIntroductionActivity = (IDNSyllableIntroductionActivity) obj5;
                    boolean zH4 = sVar6.h(aVar5);
                    Object objQ7 = sVar6.Q();
                    if (zH4 || objQ7 == gVar) {
                        objQ7 = new t(aVar5, 11);
                        sVar6.o0(objQ7);
                    }
                    int i30 = IDNSyllableIntroductionActivity.P;
                    iDNSyllableIntroductionActivity.r(str11, (fz.c) objQ7, sVar6, 0);
                    sVar6.p(false);
                } else {
                    sVar6.W();
                }
                return b0Var;
            case 6:
                l0.c cVar5 = (l0.c) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                l1.n nVar7 = (l1.n) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                fz.e eVar = (fz.e) obj5;
                l1.b1 b1Var2 = (l1.b1) obj6;
                if ((iIntValue14 & 6) == 0) {
                    i17 = iIntValue14 | (((s) nVar7).f(cVar5) ? 4 : 2);
                } else {
                    i17 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i17 |= ((s) nVar7).d(iIntValue13) ? 32 : 16;
                }
                s sVar7 = (s) nVar7;
                if (sVar7.T(i17 & 1, (i17 & 147) != 146)) {
                    vs.m mVar = (vs.m) list.get(iIntValue13);
                    sVar7.d0(-431656320);
                    if (mVar instanceof vs.g) {
                        sVar7.d0(540263416);
                        vs.g gVar2 = (vs.g) mVar;
                        DialogueType dialogueType = gVar2.f54160a;
                        boolean zF4 = sVar7.f(mVar) | sVar7.f(eVar);
                        Object objQ8 = sVar7.Q();
                        if (zF4 || objQ8 == gVar) {
                            objQ8 = new c6(eVar, gVar2, b1Var2, 1);
                            sVar7.o0(objQ8);
                        }
                        fz.c cVar6 = (fz.c) objQ8;
                        Object objQ9 = sVar7.Q();
                        if (objQ9 == gVar) {
                            objQ9 = new us.o(3, b1Var2);
                            sVar7.o0(objQ9);
                        }
                        fz.a aVar6 = (fz.a) objQ9;
                        Object objQ10 = sVar7.Q();
                        if (objQ10 == gVar) {
                            objQ10 = new p(3, b1Var2);
                            sVar7.o0(objQ10);
                        }
                        us.b.c(dialogueType, cVar6, aVar6, (fz.c) objQ10, sVar7, 3456);
                        sVar7.p(false);
                    } else if (mVar instanceof vs.l) {
                        sVar7.d0(540281341);
                        vs.l lVar5 = (vs.l) mVar;
                        TextExampleType textExampleType = lVar5.f54171a;
                        boolean zF5 = sVar7.f(mVar) | sVar7.f(eVar);
                        Object objQ11 = sVar7.Q();
                        if (zF5 || objQ11 == gVar) {
                            objQ11 = new c6(eVar, lVar5, b1Var2, 3);
                            sVar7.o0(objQ11);
                        }
                        fz.c cVar7 = (fz.c) objQ11;
                        Object objQ12 = sVar7.Q();
                        if (objQ12 == gVar) {
                            objQ12 = new us.o(4, b1Var2);
                            sVar7.o0(objQ12);
                        }
                        fz.a aVar7 = (fz.a) objQ12;
                        Object objQ13 = sVar7.Q();
                        if (objQ13 == gVar) {
                            objQ13 = new p(4, b1Var2);
                            sVar7.o0(objQ13);
                        }
                        us.b.d(textExampleType, cVar7, aVar7, (fz.c) objQ13, sVar7, 3456);
                        sVar7.p(false);
                    } else if (mVar instanceof vs.f) {
                        sVar7.d0(540299485);
                        vs.f fVar = (vs.f) mVar;
                        AudioExampleType audioExampleType = fVar.f54158a;
                        boolean zF6 = sVar7.f(mVar) | sVar7.f(eVar);
                        Object objQ14 = sVar7.Q();
                        if (zF6 || objQ14 == gVar) {
                            objQ14 = new c6(eVar, fVar, b1Var2, 4);
                            sVar7.o0(objQ14);
                        }
                        fz.c cVar8 = (fz.c) objQ14;
                        Object objQ15 = sVar7.Q();
                        if (objQ15 == gVar) {
                            objQ15 = new us.o(5, b1Var2);
                            sVar7.o0(objQ15);
                        }
                        fz.a aVar8 = (fz.a) objQ15;
                        Object objQ16 = sVar7.Q();
                        if (objQ16 == gVar) {
                            objQ16 = new p(5, b1Var2);
                            sVar7.o0(objQ16);
                        }
                        us.b.b(audioExampleType, cVar8, aVar8, (fz.c) objQ16, sVar7, 3456);
                        sVar7.p(false);
                    } else if (mVar instanceof vs.i) {
                        sVar7.d0(540318621);
                        vs.i iVar2 = (vs.i) mVar;
                        ImageExampleType imageExampleType = iVar2.f54164a;
                        boolean zF7 = sVar7.f(mVar) | sVar7.f(eVar);
                        Object objQ17 = sVar7.Q();
                        if (zF7 || objQ17 == gVar) {
                            objQ17 = new c6(eVar, iVar2, b1Var2, 2);
                            sVar7.o0(objQ17);
                        }
                        fz.c cVar9 = (fz.c) objQ17;
                        Object objQ18 = sVar7.Q();
                        if (objQ18 == gVar) {
                            objQ18 = new us.o(0, b1Var2);
                            sVar7.o0(objQ18);
                        }
                        fz.a aVar9 = (fz.a) objQ18;
                        Object objQ19 = sVar7.Q();
                        if (objQ19 == gVar) {
                            objQ19 = new p(0, b1Var2);
                            sVar7.o0(objQ19);
                        }
                        us.b.e(imageExampleType, cVar9, aVar9, (fz.c) objQ19, sVar7, 3456);
                        sVar7.p(false);
                    } else if (mVar instanceof vs.j) {
                        sVar7.d0(540337420);
                        vs.j jVar = (vs.j) mVar;
                        TableType tableType = jVar.f54166a;
                        boolean zF8 = sVar7.f(mVar) | sVar7.f(eVar);
                        Object objQ20 = sVar7.Q();
                        if (zF8 || objQ20 == gVar) {
                            objQ20 = new av.r(19, eVar, jVar);
                            sVar7.o0(objQ20);
                        }
                        fz.c cVar10 = (fz.c) objQ20;
                        Object objQ21 = sVar7.Q();
                        if (objQ21 == gVar) {
                            objQ21 = new us.o(1, b1Var2);
                            sVar7.o0(objQ21);
                        }
                        fz.a aVar10 = (fz.a) objQ21;
                        Object objQ22 = sVar7.Q();
                        if (objQ22 == gVar) {
                            objQ22 = new p(1, b1Var2);
                            sVar7.o0(objQ22);
                        }
                        us.b.k(tableType, cVar10, aVar10, (fz.c) objQ22, sVar7, 3456);
                        sVar7.p(false);
                    } else if (mVar instanceof vs.k) {
                        sVar7.d0(540352723);
                        vs.k kVar = (vs.k) mVar;
                        TextType textType = kVar.f54168a;
                        boolean zF9 = sVar7.f(mVar) | sVar7.f(eVar);
                        Object objQ23 = sVar7.Q();
                        if (zF9 || objQ23 == gVar) {
                            objQ23 = new av.r(20, eVar, kVar);
                            sVar7.o0(objQ23);
                        }
                        fz.c cVar11 = (fz.c) objQ23;
                        Object objQ24 = sVar7.Q();
                        if (objQ24 == gVar) {
                            i18 = 2;
                            objQ24 = new us.o(2, b1Var2);
                            sVar7.o0(objQ24);
                        } else {
                            i18 = 2;
                        }
                        fz.a aVar11 = (fz.a) objQ24;
                        Object objQ25 = sVar7.Q();
                        if (objQ25 == gVar) {
                            objQ25 = new p(i18, b1Var2);
                            sVar7.o0(objQ25);
                        }
                        us.b.m(textType, false, cVar11, aVar11, (fz.c) objQ25, sVar7, 27696);
                        sVar7.p(false);
                    } else {
                        if (!(mVar instanceof vs.h)) {
                            throw nv.p.x(sVar7, 540264931, false);
                        }
                        sVar7.d0(-428411613);
                        DividerType dividerType = ((vs.h) mVar).f54162a;
                        String lineWeight = dividerType.getElement().getLineWeight();
                        if (lineWeight == null) {
                            f5 = 1;
                        } else {
                            int iHashCode = lineWeight.hashCode();
                            if (iHashCode != -1078030475) {
                                if (iHashCode != 3029637) {
                                    if (iHashCode == 102970646) {
                                        lineWeight.equals("light");
                                    }
                                } else if (lineWeight.equals("bold")) {
                                    f5 = 5;
                                }
                                f5 = 1;
                            } else if (lineWeight.equals(Constants.MEDIUM)) {
                                f5 = (float) 2.5d;
                            } else {
                                f5 = 1;
                            }
                        }
                        String lineColor = dividerType.getElement().getLineColor();
                        long jK = lineColor != null ? tv.a.k(lineColor) : x.f28621h;
                        if (d0.n.t(sVar7)) {
                            sVar7.d0(-427986758);
                            jK = ((s1) sVar7.j(v1.f31180a)).f31033p;
                        } else {
                            sVar7.d0(-442132895);
                        }
                        sVar7.p(false);
                        j0.c.g(sVar7, d0.n.h(e2.g(e2.e(oVar, 1.0f), f5), jK, f0.f28556b));
                        sVar7.p(false);
                    }
                    sVar7.p(false);
                } else {
                    sVar7.W();
                }
                return b0Var;
            case 7:
                m0.l lVar6 = (m0.l) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                l1.n nVar8 = (l1.n) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                fz.c cVar12 = (fz.c) obj6;
                if ((iIntValue16 & 6) == 0) {
                    i19 = iIntValue16 | (((s) nVar8).f(lVar6) ? 4 : 2);
                } else {
                    i19 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i19 |= ((s) nVar8).d(iIntValue15) ? 32 : 16;
                }
                s sVar8 = (s) nVar8;
                if (sVar8.T(i19 & 1, (i19 & 147) != 146)) {
                    String str12 = (String) ((ArrayList) list).get(iIntValue15);
                    sVar8.d0(1389656413);
                    boolean zContains = ((Set) obj5).contains(str12);
                    boolean zF10 = sVar8.f(cVar12) | sVar8.f(str12);
                    Object objQ26 = sVar8.Q();
                    if (zF10 || objQ26 == gVar) {
                        objQ26 = new b1(28, cVar12, str12);
                        sVar8.o0(objQ26);
                    }
                    vr.b.d(0, (fz.a) objQ26, str12, sVar8, zContains);
                    sVar8.p(false);
                } else {
                    sVar8.W();
                }
                return b0Var;
            case 8:
                m0.l lVar7 = (m0.l) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                l1.n nVar9 = (l1.n) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                zo.b bVar = (zo.b) obj6;
                if ((iIntValue18 & 6) == 0) {
                    i21 = iIntValue18 | (((s) nVar9).f(lVar7) ? 4 : 2);
                } else {
                    i21 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i21 |= ((s) nVar9).d(iIntValue17) ? 32 : 16;
                }
                s sVar9 = (s) nVar9;
                if (sVar9.T(i21 & 1, (i21 & 147) != 146)) {
                    String str13 = (String) list.get(iIntValue17);
                    sVar9.d0(-1879695160);
                    TURSyllableIntroductionActivity tURSyllableIntroductionActivity = (TURSyllableIntroductionActivity) obj5;
                    boolean zF11 = sVar9.f(str13) | sVar9.h(bVar);
                    Object objQ27 = sVar9.Q();
                    if (zF11 || objQ27 == gVar) {
                        objQ27 = new vr.h(1, str13, bVar);
                        sVar9.o0(objQ27);
                    }
                    int i31 = TURSyllableIntroductionActivity.H;
                    tURSyllableIntroductionActivity.r(str13, (fz.a) objQ27, sVar9, 0);
                    sVar9.p(false);
                } else {
                    sVar9.W();
                }
                return b0Var;
            default:
                m0.l lVar8 = (m0.l) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                l1.n nVar10 = (l1.n) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                aq.b bVar2 = (aq.b) obj6;
                if ((iIntValue20 & 6) == 0) {
                    i22 = iIntValue20 | (((s) nVar10).f(lVar8) ? 4 : 2);
                } else {
                    i22 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i22 |= ((s) nVar10).d(iIntValue19) ? 32 : 16;
                }
                s sVar10 = (s) nVar10;
                if (sVar10.T(i22 & 1, (i22 & 147) != 146)) {
                    List list4 = (List) list.get(iIntValue19);
                    sVar10.d0(-447112191);
                    UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity = (UKRSyllableIntroductionActivity) obj5;
                    String str14 = (String) list4.get(0);
                    String str15 = (String) list4.get(1);
                    boolean zH5 = sVar10.h(bVar2) | sVar10.h(list4);
                    Object objQ28 = sVar10.Q();
                    if (zH5 || objQ28 == gVar) {
                        objQ28 = new vr.h(2, bVar2, list4);
                        sVar10.o0(objQ28);
                    }
                    int i32 = UKRSyllableIntroductionActivity.H;
                    uKRSyllableIntroductionActivity.r(str14, str15, (fz.a) objQ28, sVar10, 0);
                    sVar10.p(false);
                } else {
                    sVar10.W();
                }
                return b0Var;
        }
    }
}
