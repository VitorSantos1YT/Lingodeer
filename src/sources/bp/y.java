package bp;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.lingo.lingoskill.malskill.ui.learn.MALSyllableIntroductionActivity;
import com.lingo.lingoskill.object.KOCharZhuyin;
import com.lingo.lingoskill.object.LocateLanguageItem;
import com.lingo.lingoskill.ukrskill.ui.learn.UKRSyllableIntroductionActivity;
import com.lingodeer.R;
import com.lingodeer.course.smarttips.data.model.Element;
import com.lingodeer.course.smarttips.data.model.ElementType;
import com.lingodeer.course.smarttips.data.model.TextType;
import com.lingodeer.data.model.CourseWord;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.e8;
import h1.k7;
import h1.t6;
import h1.ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rt.se;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4907f;

    public /* synthetic */ y(ViewModel viewModel, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, int i11) {
        this.f4902a = i11;
        this.f4906e = viewModel;
        this.f4903b = b1Var;
        this.f4904c = b1Var2;
        this.f4905d = b1Var3;
        this.f4907f = b1Var4;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x01a2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean, int] */
    private final Object a(Object obj, Object obj2, Object obj3) {
        j0.c2 c2Var;
        Object obj4;
        float f5;
        Object obj5;
        boolean z11;
        boolean zH;
        Object objQ;
        MALSyllableIntroductionActivity mALSyllableIntroductionActivity = (MALSyllableIntroductionActivity) this.f4903b;
        List list = (List) this.f4904c;
        List<List> list2 = (List) this.f4905d;
        List list3 = (List) this.f4906e;
        ln.a aVar = (ln.a) this.f4907f;
        m0.l item = (m0.l) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i11 = MALSyllableIntroductionActivity.Q;
        z1.i iVar = z1.c.L;
        kotlin.jvm.internal.m.f(item, "$this$item");
        int i12 = 0;
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            mALSyllableIntroductionActivity.s("Vowel", sVar, 6);
            mALSyllableIntroductionActivity.q("Each vowel's pronunciation is quite similar to that in English.", sVar, 6);
            float f11 = 8;
            j0.c.g(sVar, j0.e2.g(oVar, f11));
            sVar.d0(1900458025);
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c2Var = j0.c2.f35266a;
                obj4 = l1.m.f39353a;
                if (!zHasNext) {
                    break;
                }
                List list4 = (List) it.next();
                j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, iVar, sVar, i12);
                int iHashCode2 = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, oVar);
                y2.k.J.getClass();
                y2.i iVar3 = y2.j.f56913b;
                sVar.h0();
                Iterator it2 = it;
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA, sVar);
                l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                y2.h hVar2 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
                }
                l1.t.J(y2.j.f56915d, rVarC2, sVar);
                String str = (String) list4.get(0);
                float f12 = 72;
                z1.r rVarG = j0.e2.g(c2Var.a(oVar, 1.5f), f12);
                boolean zH2 = sVar.h(aVar);
                Object objQ2 = sVar.Q();
                if (zH2) {
                    obj5 = obj4;
                } else {
                    obj5 = obj4;
                    if (objQ2 != obj5) {
                        z11 = false;
                    }
                    Object obj6 = obj5;
                    z1.o oVar2 = oVar;
                    List list5 = list2;
                    z1.i iVar4 = iVar;
                    float f13 = f11;
                    List list6 = list3;
                    mALSyllableIntroductionActivity.u(str, BuildConfig.VERSION_NAME, rVarG, false, false, (fz.c) objQ2, sVar, 24624, 8);
                    String str2 = (String) list4.get(1);
                    String str3 = (String) list4.get(0);
                    z1.r rVarG2 = j0.e2.g(c2Var.a(oVar2, 2.0f), f12);
                    zH = sVar.h(aVar);
                    objQ = sVar.Q();
                    if (zH || objQ == obj6) {
                        objQ = new in.f(aVar, 1);
                        sVar.o0(objQ);
                    }
                    mALSyllableIntroductionActivity.u(str2, str3, rVarG2, false, false, (fz.c) objQ, sVar, 0, 24);
                    sVar.p(true);
                    oVar = oVar2;
                    list2 = list5;
                    list3 = list6;
                    it = it2;
                    f11 = f13;
                    i12 = 0;
                    iVar = iVar4;
                }
                z11 = false;
                objQ2 = new in.f(aVar, 0);
                sVar.o0(objQ2);
                Object obj7 = obj5;
                z1.o oVar3 = oVar;
                List list7 = list2;
                z1.i iVar5 = iVar;
                float f14 = f11;
                List list8 = list3;
                mALSyllableIntroductionActivity.u(str, BuildConfig.VERSION_NAME, rVarG, false, false, (fz.c) objQ2, sVar, 24624, 8);
                String str4 = (String) list4.get(1);
                String str5 = (String) list4.get(0);
                z1.r rVarG3 = j0.e2.g(c2Var.a(oVar3, 2.0f), f12);
                zH = sVar.h(aVar);
                objQ = sVar.Q();
                if (zH) {
                    objQ = new in.f(aVar, 1);
                    sVar.o0(objQ);
                } else {
                    objQ = new in.f(aVar, 1);
                    sVar.o0(objQ);
                }
                mALSyllableIntroductionActivity.u(str4, str5, rVarG3, false, false, (fz.c) objQ, sVar, 0, 24);
                sVar.p(true);
                oVar = oVar3;
                list2 = list7;
                list3 = list8;
                it = it2;
                f11 = f14;
                i12 = 0;
                iVar = iVar5;
            }
            List<List> list9 = list3;
            z1.i iVar6 = iVar;
            z1.o oVar4 = oVar;
            sVar.p(i12);
            mALSyllableIntroductionActivity.q("In Malay, the vowel \"e\" has two pronunciations. The first is the schwa /ə/, a more neutral and unstressed sound, similar to the \"a\" in \"about.\" The second is the open \"e,\" which sounds like the \"e\" in \"bed.\"", sVar, 6);
            mALSyllableIntroductionActivity.q("Most instances of \"e\" are pronounced as a schwa.", sVar, 6);
            float f15 = f11;
            j0.c.g(sVar, j0.e2.g(oVar4, f15));
            sVar.d0(1900505720);
            for (List list10 : list2) {
                z1.i iVar7 = iVar6;
                j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, iVar7, sVar, 0);
                int iHashCode3 = Long.hashCode(sVar.T);
                l1.q1 q1VarL3 = sVar.l();
                z1.r rVarC3 = z1.a.c(sVar, oVar4);
                y2.k.J.getClass();
                y2.i iVar8 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar8);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA2, sVar);
                l1.t.J(y2.j.f56916e, q1VarL3, sVar);
                y2.h hVar3 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                }
                l1.t.J(y2.j.f56915d, rVarC3, sVar);
                String str6 = (String) list10.get(0);
                float f16 = 72;
                z1.r rVarG4 = j0.e2.g(c2Var.a(oVar4, 1.5f), f16);
                boolean zH3 = sVar.h(aVar);
                Object objQ3 = sVar.Q();
                if (zH3 || objQ3 == obj4) {
                    objQ3 = new in.f(aVar, 2);
                    sVar.o0(objQ3);
                }
                float f17 = f15;
                mALSyllableIntroductionActivity.u(str6, BuildConfig.VERSION_NAME, rVarG4, false, false, (fz.c) objQ3, sVar, 24624, 8);
                String str7 = (String) list10.get(1);
                String str8 = (String) oz.q.W0((CharSequence) list10.get(0), new String[]{"\n"}, 0, 6).get(0);
                z1.r rVarG5 = j0.e2.g(c2Var.a(oVar4, 2.0f), f16);
                boolean zH4 = sVar.h(aVar);
                Object objQ4 = sVar.Q();
                if (zH4 || objQ4 == obj4) {
                    objQ4 = new in.f(aVar, 3);
                    sVar.o0(objQ4);
                }
                mALSyllableIntroductionActivity.u(str7, str8, rVarG5, false, false, (fz.c) objQ4, sVar, 0, 24);
                sVar.p(true);
                f15 = f17;
                iVar6 = iVar7;
            }
            z1.i iVar9 = iVar6;
            sVar.p(false);
            mALSyllableIntroductionActivity.q("In Malay, the \"a\" sound at the end of words is commonly pronounced as a schwa /ə/ in informal speech.", sVar, 6);
            j0.c.g(sVar, j0.e2.g(oVar4, f15));
            Object objQ5 = sVar.Q();
            Object obj8 = objQ5;
            if (objQ5 == obj4) {
                String[] strArr = {"Formal", "Informal"};
                sVar.o0(strArr);
                obj8 = strArr;
            }
            String[] strArr2 = (String[]) obj8;
            z1.r rVarQ = j0.c.q(oVar4, j0.e1.Min);
            z1.i iVar10 = iVar9;
            j0.a2 a2VarA3 = j0.z1.a(j0.i.f35303a, iVar10, sVar, 0);
            int iHashCode4 = Long.hashCode(sVar.T);
            l1.q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarQ);
            y2.k.J.getClass();
            y2.i iVar11 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar11);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA3, sVar);
            l1.t.J(y2.j.f56916e, q1VarL4, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar4);
            }
            l1.t.J(y2.j.f56915d, rVarC4, sVar);
            sVar.d0(-2010497868);
            int length = strArr2.length;
            int i13 = 0;
            while (true) {
                f5 = 1.0f;
                if (i13 >= length) {
                    break;
                }
                String str9 = strArr2[i13];
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                nn.c.o(0, str9, sVar, j0.e2.c(new j0.i1(1.0f, true), 1.0f));
                i13++;
            }
            ?? r11 = 0;
            sVar.p(false);
            sVar.p(true);
            sVar.d0(1900563253);
            for (List list11 : list9) {
                j0.a2 a2VarA4 = j0.z1.a(j0.i.f35303a, iVar10, sVar, r11);
                int iHashCode5 = Long.hashCode(sVar.T);
                l1.q1 q1VarL5 = sVar.l();
                z1.r rVarC5 = z1.a.c(sVar, oVar4);
                y2.k.J.getClass();
                y2.i iVar12 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar12);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA4, sVar);
                l1.t.J(y2.j.f56916e, q1VarL5, sVar);
                y2.h hVar5 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                    defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar5);
                }
                l1.t.J(y2.j.f56915d, rVarC5, sVar);
                String str10 = (String) list11.get(0);
                z1.r rVarA = c2Var.a(oVar4, f5);
                float f18 = 72;
                z1.r rVarG6 = j0.e2.g(rVarA, f18);
                boolean zH5 = sVar.h(aVar);
                Object objQ6 = sVar.Q();
                if (zH5 || objQ6 == obj4) {
                    objQ6 = new in.f(aVar, 4);
                    sVar.o0(objQ6);
                }
                z1.i iVar13 = iVar10;
                mALSyllableIntroductionActivity.u(str10, "a", rVarG6, true, false, (fz.c) objQ6, sVar, 3120, 16);
                String str11 = (String) list11.get(1);
                f5 = 1.0f;
                z1.r rVarG7 = j0.e2.g(c2Var.a(oVar4, 1.0f), f18);
                boolean zH6 = sVar.h(aVar);
                Object objQ7 = sVar.Q();
                if (zH6 || objQ7 == obj4) {
                    objQ7 = new in.f(aVar, 5);
                    sVar.o0(objQ7);
                }
                mALSyllableIntroductionActivity.u(str11, "a", rVarG7, true, false, (fz.c) objQ7, sVar, 3120, 16);
                sVar.p(true);
                iVar10 = iVar13;
                r11 = 0;
            }
            sVar.p(r11);
            sVar.p(true);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        boolean z11;
        kr.s0 s0Var = (kr.s0) this.f4903b;
        fz.a aVar = (fz.a) this.f4904c;
        fz.a aVar2 = (fz.a) this.f4905d;
        fz.a aVar3 = (fz.a) this.f4906e;
        fz.a aVar4 = (fz.a) this.f4907f;
        j0.t1 paddingValues = (j0.t1) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        z1.j jVar = z1.c.f58467e;
        kotlin.jvm.internal.m.f(paddingValues, "paddingValues");
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((l1.s) nVar).f(paddingValues) ? 4 : 2;
        }
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarZ = j0.c.z(j0.e2.d(oVar, 1.0f), paddingValues);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarZ);
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
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            if (((Boolean) sVar.j(ju.f.f37376j)).booleanValue()) {
                sVar.d0(2012053723);
                j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
                int iHashCode3 = Long.hashCode(sVar.T);
                l1.q1 q1VarL3 = sVar.l();
                z1.r rVarC3 = z1.a.c(sVar, oVar);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, a2VarA, sVar);
                l1.t.J(hVar2, q1VarL3, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                }
                l1.t.J(hVar4, rVarC3, sVar);
                kr.r0 r0Var = (kr.r0) s0Var;
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                float f5 = Float.MAX_VALUE;
                if (1.0f <= Float.MAX_VALUE) {
                    f5 = 1.0f;
                }
                jr.a.l(r0Var, new j0.i1(f5, true), aVar, sVar, 0);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                j0.i1 i1Var = new j0.i1(1.0f > f5 ? Float.MAX_VALUE : 1.0f, true);
                w2.q0 q0VarD2 = j0.o.d(jVar, false);
                int iHashCode4 = Long.hashCode(sVar.T);
                l1.q1 q1VarL4 = sVar.l();
                z1.r rVarC4 = z1.a.c(sVar, i1Var);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, q0VarD2, sVar);
                l1.t.J(hVar2, q1VarL4, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                    defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar3);
                }
                l1.t.J(hVar4, rVarC4, sVar);
                tv.a.b(r0Var.f38569f, sVar, 0);
                sVar.p(true);
                sVar.p(true);
                j0.c.g(sVar, j0.v.a(oVar, 1.0f));
                sVar.p(false);
                z11 = true;
            } else {
                sVar.d0(2012758198);
                kr.r0 r0Var2 = (kr.r0) s0Var;
                jr.a.l(r0Var2, j0.e2.e(oVar, 1.0f), aVar, sVar, 48);
                j0.c.g(sVar, j0.v.a(oVar, 1.0f));
                z1.r rVarE = j0.e2.e(oVar, 1.0f);
                w2.q0 q0VarD3 = j0.o.d(jVar, false);
                int iHashCode5 = Long.hashCode(sVar.T);
                l1.q1 q1VarL5 = sVar.l();
                z1.r rVarC5 = z1.a.c(sVar, rVarE);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, q0VarD3, sVar);
                l1.t.J(hVar2, q1VarL5, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                    defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar3);
                }
                l1.t.J(hVar4, rVarC5, sVar);
                tv.a.b(r0Var2.f38569f, sVar, 0);
                z11 = true;
                sVar.p(true);
                j0.c.g(sVar, j0.v.a(oVar, 2.0f));
                sVar.p(false);
            }
            boolean zH = sVar.h(s0Var) | sVar.f(aVar2) | sVar.f(aVar3);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new androidx.lifecycle.compose.a(19, aVar2, s0Var, aVar3);
                sVar.o0(objQ);
            }
            float f11 = 32;
            iu.k.e((fz.a) objQ, j0.e2.e(j0.c.C(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), false, 0L, null, jr.a.f36572r, sVar, 196656, 28);
            k7.m(aVar4, j0.c.E(j0.c.C(j0.e2.e(oVar, 1.0f), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, 16, 5), false, null, null, null, jr.a.f36573s, sVar, 805306416, 508);
            sVar.p(z11);
            sVar.p(z11);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        l1.g gVar;
        l1.s sVar;
        v3.c cVar = (v3.c) this.f4904c;
        rt.a2 a2Var = (rt.a2) this.f4905d;
        l1.b3 b3Var = (l1.b3) this.f4906e;
        l1.g1 g1Var = (l1.g1) this.f4907f;
        l1.b1 b1Var = (l1.b1) this.f4903b;
        a0.k0 AnimatedVisibility = (a0.k0) obj;
        ((Integer) obj3).getClass();
        kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
        float fT = cVar.T(g1Var.l());
        boolean z11 = ((rt.o1) b3Var.getValue()).f50166d;
        String str = ((rt.o1) b3Var.getValue()).f50167e;
        se seVar = ((rt.o1) b3Var.getValue()).f50175n;
        int i11 = ((rt.o1) b3Var.getValue()).f50173k;
        int i12 = ((rt.o1) b3Var.getValue()).f50174l;
        boolean z12 = ((rt.o1) b3Var.getValue()).m;
        l1.s sVar2 = (l1.s) ((l1.n) obj2);
        boolean zH = sVar2.h(a2Var);
        Object objQ = sVar2.Q();
        l1.g gVar2 = l1.m.f39353a;
        if (zH || objQ == gVar2) {
            objQ = new mt.e1(a2Var, b1Var, 1);
            sVar2.o0(objQ);
        }
        fz.a aVar = (fz.a) objQ;
        boolean zH2 = sVar2.h(a2Var);
        Object objQ2 = sVar2.Q();
        if (zH2 || objQ2 == gVar2) {
            gVar = gVar2;
            sVar = sVar2;
            bt.a3 a3Var = new bt.a3(1, a2Var, rt.a2.class, "updateQuery", "updateQuery(Ljava/lang/String;)V", 0, 22);
            sVar.o0(a3Var);
            objQ2 = a3Var;
        } else {
            sVar = sVar2;
            gVar = gVar2;
        }
        fz.c cVar2 = (fz.c) ((mz.e) objQ2);
        boolean zH3 = sVar.h(a2Var);
        Object objQ3 = sVar.Q();
        if (zH3 || objQ3 == gVar) {
            bt.y2 y2Var = new bt.y2(0, a2Var, rt.a2.class, "toggleSearchExpanded", "toggleSearchExpanded()V", 0, 14);
            sVar.o0(y2Var);
            objQ3 = y2Var;
        }
        fz.a aVar2 = (fz.a) ((mz.e) objQ3);
        Object objQ4 = sVar.Q();
        if (objQ4 == gVar) {
            objQ4 = new mt.q(19, b1Var);
            sVar.o0(objQ4);
        }
        fz.a aVar3 = (fz.a) objQ4;
        Object objQ5 = sVar.Q();
        if (objQ5 == gVar) {
            objQ5 = new mt.q(20, b1Var);
            sVar.o0(objQ5);
        }
        fz.a aVar4 = (fz.a) objQ5;
        boolean zH4 = sVar.h(a2Var);
        Object objQ6 = sVar.Q();
        if (zH4 || objQ6 == gVar) {
            objQ6 = new mt.g1(a2Var, b1Var, 0);
            sVar.o0(objQ6);
        }
        fz.c cVar3 = (fz.c) objQ6;
        boolean zF = sVar.f(b3Var) | sVar.h(a2Var);
        Object objQ7 = sVar.Q();
        if (zF || objQ7 == gVar) {
            objQ7 = new mt.h1(a2Var, b3Var, 0);
            sVar.o0(objQ7);
        }
        mt.v1.e(fT, z11, str, seVar, i11, i12, z12, aVar, cVar2, aVar2, aVar3, aVar4, cVar3, (fz.a) objQ7, j0.e2.d(z1.o.f58481a, 1.0f), sVar, 0);
        return qy.b0.f48488a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.f4903b;
        TextType textType = (TextType) this.f4904c;
        fz.c cVar = (fz.c) this.f4905d;
        fz.a aVar = (fz.a) this.f4906e;
        fz.c cVar2 = (fz.c) this.f4907f;
        j0.v Card = (j0.v) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.f(Card, "$this$Card");
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            z1.r rVarB = j0.c.B(d0.n.h(j0.e2.e(z1.o.f58481a, 1.0f), xVar.f38360a, g2.f0.f28556b), 24, 12);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarB);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            Element element = textType.getElement();
            ElementType elementType = ElementType.Text;
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new ju.d(25);
                sVar.o0(objQ);
            }
            us.b.l(element, elementType, false, false, null, (fz.a) objQ, cVar, aVar, cVar2, sVar, 200112, 16);
            sVar.p(true);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:104:0x050a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0575  */
    /* JADX WARN: Code duplicated, block: B:110:0x057d  */
    /* JADX WARN: Code duplicated, block: B:112:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:113:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:118:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:122:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:23:0x0118  */
    /* JADX WARN: Code duplicated, block: B:24:0x011c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0137  */
    /* JADX WARN: Code duplicated, block: B:33:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:342:0x0df3  */
    /* JADX WARN: Code duplicated, block: B:346:0x0e0d  */
    /* JADX WARN: Code duplicated, block: B:350:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x0485 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x060c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:37:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:38:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:43:0x0217  */
    /* JADX WARN: Code duplicated, block: B:46:0x023e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0243  */
    /* JADX WARN: Code duplicated, block: B:53:0x027b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x027d  */
    /* JADX WARN: Code duplicated, block: B:60:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:61:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:66:0x0315  */
    /* JADX WARN: Code duplicated, block: B:70:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:72:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:74:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x0402  */
    /* JADX WARN: Code duplicated, block: B:84:0x0428  */
    /* JADX WARN: Code duplicated, block: B:88:0x045f  */
    /* JADX WARN: Code duplicated, block: B:94:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:95:0x04ce  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        LocateLanguageItem locateLanguageItem;
        boolean zH;
        Object objQ;
        boolean z11;
        int i11;
        Integer num;
        aq.b bVar;
        int iHashCode;
        l1.g gVar;
        List listL;
        Iterator it;
        int i12;
        aq.b bVar2;
        int iHashCode2;
        y2.i iVar;
        y2.h hVar;
        Integer num2;
        Integer num3;
        UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity;
        List listL2;
        Iterator it2;
        int i13;
        int iHashCode3;
        y2.i iVar2;
        y2.h hVar2;
        List listL3;
        Iterator it3;
        int i14;
        Object next;
        int i15;
        int iHashCode4;
        y2.i iVar3;
        y2.h hVar3;
        boolean zH2;
        Object objQ2;
        Object next2;
        int i16;
        int iHashCode5;
        y2.i iVar4;
        y2.h hVar4;
        boolean zH3;
        Object objQ3;
        boolean zH4;
        Object objQ4;
        Object next3;
        int i17;
        int iHashCode6;
        y2.i iVar5;
        y2.h hVar5;
        aq.b bVar3;
        boolean zH5;
        Object objQ5;
        l1.g gVar2;
        boolean zH6;
        Object objQ6;
        int i18 = this.f4902a;
        z1.o oVar = z1.o.f58481a;
        l1.g gVar3 = l1.m.f39353a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj5 = this.f4907f;
        Object obj6 = this.f4906e;
        Object obj7 = this.f4905d;
        Object obj8 = this.f4904c;
        Object obj9 = this.f4903b;
        int i19 = 2;
        switch (i18) {
            case 0:
                ep.c cVar = (ep.c) obj6;
                Context context = (Context) obj5;
                l1.b1 b1Var = (l1.b1) obj8;
                l1.b1 b1Var2 = (l1.b1) obj7;
                a0.k0 AnimatedVisibility = (a0.k0) obj;
                l1.n nVar = (l1.n) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                if (((v3.k) ((l1.b1) obj9).getValue()) == null) {
                    l1.s sVar = (l1.s) nVar;
                    sVar.d0(1626094228);
                    sVar.p(false);
                } else {
                    l1.s sVar2 = (l1.s) nVar;
                    sVar2.d0(1626094229);
                    z1.r rVarD = j0.e2.d(oVar, 1.0f);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode7 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(sVar2, rVarD);
                    y2.k.J.getClass();
                    y2.i iVar6 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar6);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                    y2.h hVar6 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode7))) {
                        defpackage.e.A(iHashCode7, sVar2, iHashCode7, hVar6);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar2);
                    kotlin.jvm.internal.m.f(context, "context");
                    ArrayList arrayListB = ns.o.b("en", "es", "fr", "de", "ja", "ko", "vi", "zh", "pt", "ru", "in", "pl", "it", "tr", "th", "ar");
                    ArrayList arrayList = new ArrayList();
                    int size = arrayListB.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj10 = arrayListB.get(i21);
                        i21++;
                        String str = (String) obj10;
                        arrayList.add(new LocateLanguageItem(str, ep.c.r(R.string.ls_section_header, context, str), 0, 4, null));
                    }
                    int size2 = arrayList.size();
                    int i22 = 0;
                    do {
                        if (i22 < size2) {
                            obj4 = arrayList.get(i22);
                            i22++;
                        } else {
                            obj4 = null;
                        }
                        locateLanguageItem = (LocateLanguageItem) obj4;
                        if (locateLanguageItem != null) {
                            arrayList.remove(locateLanguageItem);
                            arrayList.add(0, locateLanguageItem);
                        }
                        String str2 = cVar.f25725t;
                        kotlin.jvm.internal.m.e(str2, "<get-deviceLanguage>(...)");
                        zH = sVar2.h(cVar);
                        objQ = sVar2.Q();
                        if (zH || objQ == gVar3) {
                            objQ = new aj.c(cVar, b1Var, b1Var2, 7);
                            sVar2.o0(objQ);
                        }
                        g1.k(arrayList, str2, (fz.c) objQ, sVar2, 0);
                        sVar2.p(true);
                        sVar2.p(false);
                    } while (!kotlin.jvm.internal.m.a(((LocateLanguageItem) obj4).getLocate(), cVar.f25725t));
                    locateLanguageItem = (LocateLanguageItem) obj4;
                    if (locateLanguageItem != null) {
                        arrayList.remove(locateLanguageItem);
                        arrayList.add(0, locateLanguageItem);
                    }
                    String str3 = cVar.f25725t;
                    kotlin.jvm.internal.m.e(str3, "<get-deviceLanguage>(...)");
                    zH = sVar2.h(cVar);
                    objQ = sVar2.Q();
                    if (zH) {
                        objQ = new aj.c(cVar, b1Var, b1Var2, 7);
                        sVar2.o0(objQ);
                    } else {
                        objQ = new aj.c(cVar, b1Var, b1Var2, 7);
                        sVar2.o0(objQ);
                    }
                    g1.k(arrayList, str3, (fz.c) objQ, sVar2, 0);
                    sVar2.p(true);
                    sVar2.p(false);
                }
                return b0Var;
            case 1:
                fz.c cVar2 = (fz.c) obj8;
                rz.b0 b0Var2 = (rz.b0) obj7;
                e8 e8Var = (e8) obj6;
                fz.a aVar = (fz.a) obj5;
                l1.b1 b1Var3 = (l1.b1) obj9;
                j0.v ModalBottomSheet = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                l1.s sVar3 = (l1.s) nVar2;
                if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zF = sVar3.f(cVar2) | sVar3.h(b0Var2) | sVar3.f(e8Var) | sVar3.f(aVar);
                    Object objQ7 = sVar3.Q();
                    if (zF || objQ7 == gVar3) {
                        o oVar2 = new o(cVar2, b0Var2, e8Var, aVar, 0);
                        sVar3.o0(oVar2);
                        objQ7 = oVar2;
                    }
                    fz.c cVar3 = (fz.c) objQ7;
                    Object objQ8 = sVar3.Q();
                    if (objQ8 == gVar3) {
                        objQ8 = new p(0, b1Var3);
                        sVar3.o0(objQ8);
                    }
                    g1.j(cVar3, (fz.a) objQ8, j0.e2.e(j0.c.v(j0.e2.c(oVar, 0.8f)), 1.0f), null, sVar3, 48);
                } else {
                    sVar3.W();
                }
                return b0Var;
            case 2:
                e2.l lVar = (e2.l) obj6;
                fz.c cVar4 = (fz.c) obj5;
                l1.b1 b1Var4 = (l1.b1) obj9;
                l1.b1 b1Var5 = (l1.b1) obj8;
                l1.b1 b1Var6 = (l1.b1) obj7;
                j0.t1 paddingValues = (j0.t1) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(paddingValues, "paddingValues");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((l1.s) nVar3).f(paddingValues) ? 4 : 2;
                }
                l1.s sVar4 = (l1.s) nVar3;
                if (sVar4.T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    z1.r rVarZ = j0.c.z(j0.e2.d(oVar, 1.0f), paddingValues);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar4, 48);
                    int iHashCode8 = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL2 = sVar4.l();
                    z1.r rVarC2 = z1.a.c(sVar4, rVarZ);
                    y2.k.J.getClass();
                    y2.i iVar7 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar7);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar4);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar4);
                    y2.h hVar7 = y2.j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode8))) {
                        defpackage.e.A(iHashCode8, sVar4, iHashCode8, hVar7);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar4);
                    String str4 = (String) b1Var4.getValue();
                    float f5 = 16;
                    z1.r rVarB = j0.c.B(j0.e2.e(oVar, 1.0f), f5, f5);
                    s0.r0 r0Var = new s0.r0(6, 7, 115);
                    boolean zH7 = sVar4.h(lVar) | sVar4.f(cVar4);
                    Object objQ9 = sVar4.Q();
                    if (zH7 || objQ9 == gVar3) {
                        objQ9 = new aj.c(lVar, cVar4, b1Var4, 10);
                        sVar4.o0(objQ9);
                    }
                    s0.q0 q0Var = new s0.q0((fz.c) objQ9, null, 62);
                    boolean z12 = ((Boolean) b1Var5.getValue()).booleanValue() || ((Boolean) b1Var6.getValue()).booleanValue();
                    Object objQ10 = sVar4.Q();
                    if (objQ10 == gVar3) {
                        objQ10 = new r1(b1Var4, b1Var5, b1Var6, 0);
                        sVar4.o0(objQ10);
                    }
                    t6.a(str4, (fz.c) objQ10, rVarB, false, null, g1.f4591g, null, null, null, z12, null, r0Var, q0Var, true, 0, 0, null, null, sVar4, 1573296, 12779520, 8150968);
                    if (((Boolean) b1Var5.getValue()).booleanValue()) {
                        sVar4.d0(-461129843);
                        ua.b(ub.a.e0(sVar4, R.string.the_email_does_s_t_exist), j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((h1.s1) sVar4.j(h1.v1.f31180a)).f31040w, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 48, 0, 131064);
                        sVar4.p(false);
                    } else {
                        if (((Boolean) b1Var6.getValue()).booleanValue()) {
                            sVar4.d0(-460834971);
                            ua.b(ub.a.e0(sVar4, R.string.the_format_of_email_is_incorrect), j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((h1.s1) sVar4.j(h1.v1.f31180a)).f31040w, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 48, 0, 131064);
                            z11 = false;
                        } else {
                            z11 = false;
                            sVar4.d0(-468170408);
                        }
                        sVar4.p(z11);
                    }
                    j0.c.g(sVar4, j0.e2.g(oVar, f5));
                    boolean zF2 = sVar4.f(cVar4);
                    Object objQ11 = sVar4.Q();
                    if (zF2 || objQ11 == gVar3) {
                        i11 = 2;
                        objQ11 = new q(cVar4, b1Var4, 2);
                        sVar4.o0(objQ11);
                    } else {
                        i11 = 2;
                    }
                    iu.k.e((fz.a) objQ11, j0.c.C(j0.e2.e(oVar, 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, i11), ((String) b1Var4.getValue()).length() > 0, 0L, null, g1.f4592h, sVar4, 196656, 24);
                    sVar4.p(true);
                } else {
                    sVar4.W();
                }
                return b0Var;
            case 3:
                List list = (List) obj8;
                ht.l lVar2 = (ht.l) obj7;
                fz.c cVar5 = (fz.c) obj6;
                String str5 = (String) obj5;
                l1.b1 b1Var7 = (l1.b1) obj9;
                j0.v ModalBottomSheet2 = (j0.v) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet2, "$this$ModalBottomSheet");
                l1.s sVar5 = (l1.s) nVar4;
                if (sVar5.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    float f11 = 16;
                    z1.r rVarB2 = j0.c.B(j0.e2.c(j0.e2.e(oVar, 1.0f), 0.7f), f11, f11);
                    j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                    int iHashCode9 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL3 = sVar5.l();
                    z1.r rVarC3 = z1.a.c(sVar5, rVarB2);
                    y2.k.J.getClass();
                    y2.i iVar8 = y2.j.f56913b;
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar8);
                    } else {
                        sVar5.r0();
                    }
                    y2.h hVar8 = y2.j.f56917f;
                    l1.t.J(hVar8, uVarA2, sVar5);
                    y2.h hVar9 = y2.j.f56916e;
                    l1.t.J(hVar9, q1VarL3, sVar5);
                    y2.h hVar10 = y2.j.f56918g;
                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode9))) {
                        defpackage.e.A(iHashCode9, sVar5, iHashCode9, hVar10);
                    }
                    y2.h hVar11 = y2.j.f56915d;
                    l1.t.J(hVar11, rVarC3, sVar5);
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                    int iHashCode10 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL4 = sVar5.l();
                    z1.r rVarC4 = z1.a.c(sVar5, oVar);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar8);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar8, a2VarA, sVar5);
                    l1.t.J(hVar9, q1VarL4, sVar5);
                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode10))) {
                        defpackage.e.A(iHashCode10, sVar5, iHashCode10, hVar10);
                    }
                    l1.t.J(hVar11, rVarC4, sVar5);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.c.g(sVar5, new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    ua.b(ub.a.e0(sVar5, R.string.literal_translation), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar5.j(ua.f31167a), ((h1.s1) sVar5.j(h1.v1.f31180a)).f31034q, fr.j3.A(18), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar5, 0, 0, 65534);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.c.g(sVar5, new j0.i1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                    sVar5.p(true);
                    j0.c.g(sVar5, j0.e2.g(oVar, 22));
                    boolean zF3 = sVar5.f(list);
                    Object objQ12 = sVar5.Q();
                    Object obj11 = objQ12;
                    if (zF3 || objQ12 == gVar3) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj12 : list) {
                            CourseWord courseWord = (CourseWord) obj12;
                            if (!oz.q.K0(courseWord.getWord()) || !oz.q.K0(courseWord.getTranslation())) {
                                arrayList2.add(obj12);
                            }
                        }
                        sVar5.o0(arrayList2);
                        obj11 = arrayList2;
                    }
                    List list2 = (List) obj11;
                    z1.r rVarE = j0.e2.e(oVar, 1.0f);
                    j0.g gVarG = j0.i.g(6);
                    boolean zH8 = sVar5.h(list2) | sVar5.h(lVar2) | sVar5.f(cVar5) | sVar5.f(str5);
                    Object objQ13 = sVar5.Q();
                    if (zH8 || objQ13 == gVar3) {
                        objQ13 = new b1.a(list2, str5, lVar2, cVar5, b1Var7);
                        sVar5.o0(objQ13);
                    }
                    ue.f.a(rVarE, null, null, gVarG, null, null, false, null, (fz.c) objQ13, sVar5, 24582, 494);
                    sVar5.p(true);
                } else {
                    sVar5.W();
                }
                return b0Var;
            case 4:
                Integer num4 = (Integer) obj;
                int iIntValue4 = num4.intValue();
                Integer num5 = (Integer) obj2;
                int iIntValue5 = num5.intValue();
                KOCharZhuyin item = (KOCharZhuyin) obj3;
                kotlin.jvm.internal.m.f(item, "item");
                ((l1.b1) obj9).setValue(num4);
                ((l1.b1) obj8).setValue(num5);
                ((l1.b1) obj7).setValue(null);
                ((gn.e) obj6).b(iIntValue4, iIntValue5, item);
                ((l1.b1) obj5).setValue(Boolean.TRUE);
                return b0Var;
            case 5:
                return a(obj, obj2, obj3);
            case 6:
                z1.r rVar = (z1.r) obj9;
                kr.l lVar3 = (kr.l) obj8;
                fz.c cVar6 = (fz.c) obj7;
                fz.c cVar7 = (fz.c) obj6;
                fz.a aVar2 = (fz.a) obj5;
                j0.q PullToRefreshBox = (j0.q) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(PullToRefreshBox, "$this$PullToRefreshBox");
                l1.s sVar6 = (l1.s) nVar5;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    boolean zH9 = sVar6.h(lVar3) | sVar6.f(cVar6) | sVar6.f(cVar7) | sVar6.f(aVar2);
                    Object objQ14 = sVar6.Q();
                    if (zH9 || objQ14 == gVar3) {
                        b0.a aVar3 = new b0.a(18, cVar6, lVar3, cVar7, aVar2);
                        sVar6.o0(aVar3);
                        objQ14 = aVar3;
                    }
                    ue.f.a(rVar, null, null, null, null, null, false, null, (fz.c) objQ14, sVar6, 0, 510);
                } else {
                    sVar6.W();
                }
                return b0Var;
            case 7:
                kr.z0 z0Var = (kr.z0) obj8;
                rz.b0 b0Var3 = (rz.b0) obj7;
                fz.a aVar4 = (fz.a) obj6;
                fz.a aVar5 = (fz.a) obj5;
                l1.b1 b1Var8 = (l1.b1) obj9;
                fz.a showNext = (fz.a) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(showNext, "showNext");
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((l1.s) nVar6).h(showNext) ? 4 : 2;
                }
                l1.s sVar7 = (l1.s) nVar6;
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    kr.s0 s0Var = (kr.s0) b1Var8.getValue();
                    boolean zH10 = sVar7.h(z0Var);
                    Object objQ15 = sVar7.Q();
                    if (zH10 || objQ15 == gVar3) {
                        objQ15 = new jr.c0(z0Var, 0);
                        sVar7.o0(objQ15);
                    }
                    fz.a aVar6 = (fz.a) objQ15;
                    boolean zH11 = sVar7.h(z0Var);
                    Object objQ16 = sVar7.Q();
                    if (zH11 || objQ16 == gVar3) {
                        objQ16 = new jr.c0(z0Var, 1);
                        sVar7.o0(objQ16);
                    }
                    fz.a aVar7 = (fz.a) objQ16;
                    boolean zH12 = sVar7.h(b0Var3) | sVar7.h(z0Var) | sVar7.f(aVar4);
                    Object objQ17 = sVar7.Q();
                    if (zH12 || objQ17 == gVar3) {
                        objQ17 = new androidx.lifecycle.compose.a(b0Var3, z0Var, aVar4, 18);
                        sVar7.o0(objQ17);
                    }
                    jr.a.n(s0Var, aVar6, showNext, aVar7, (fz.a) objQ17, aVar5, sVar7, (iIntValue7 << 6) & 896);
                } else {
                    sVar7.W();
                }
                return b0Var;
            case 8:
                return c(obj, obj2, obj3);
            case 9:
                return d(obj, obj2, obj3);
            case 10:
                Integer num6 = (Integer) obj;
                int iIntValue8 = num6.intValue();
                Integer num7 = (Integer) obj2;
                int iIntValue9 = num7.intValue();
                pq.a item2 = (pq.a) obj3;
                kotlin.jvm.internal.m.f(item2, "item");
                ((l1.b1) obj9).setValue(num6);
                ((l1.b1) obj8).setValue(num7);
                ((l1.b1) obj7).setValue(null);
                ((tq.d) obj6).c(iIntValue8, iIntValue9, item2);
                ((l1.b1) obj5).setValue(Boolean.TRUE);
                return b0Var;
            case 11:
                return e(obj, obj2, obj3);
            default:
                UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity2 = (UKRSyllableIntroductionActivity) obj9;
                List list3 = (List) obj8;
                List list4 = (List) obj7;
                List list5 = (List) obj6;
                aq.b bVar4 = (aq.b) obj5;
                m0.l item3 = (m0.l) obj;
                l1.n nVar7 = (l1.n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                int i23 = UKRSyllableIntroductionActivity.H;
                z1.i iVar9 = z1.c.L;
                int i24 = 3;
                Integer num8 = 3;
                Integer num9 = 2;
                kotlin.jvm.internal.m.f(item3, "$this$item");
                l1.s sVar8 = (l1.s) nVar7;
                if (!sVar8.T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    sVar8.W();
                    return b0Var;
                }
                j0.u uVarA3 = j0.t.a(j0.i.f35305c, z1.c.O, sVar8, 0);
                int iHashCode11 = Long.hashCode(sVar8.T);
                l1.q1 q1VarL5 = sVar8.l();
                z1.r rVarC5 = z1.a.c(sVar8, oVar);
                y2.k.J.getClass();
                y2.i iVar10 = y2.j.f56913b;
                sVar8.h0();
                if (sVar8.S) {
                    sVar8.k(iVar10);
                } else {
                    sVar8.r0();
                }
                y2.h hVar12 = y2.j.f56917f;
                l1.t.J(hVar12, uVarA3, sVar8);
                y2.h hVar13 = y2.j.f56916e;
                l1.t.J(hVar13, q1VarL5, sVar8);
                y2.h hVar14 = y2.j.f56918g;
                if (!sVar8.S) {
                    num = 1;
                    if (!kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode11))) {
                    }
                    y2.h hVar15 = y2.j.f56915d;
                    l1.t.J(hVar15, rVarC5, sVar8);
                    uKRSyllableIntroductionActivity2.w(ub.a.e0(sVar8, R.string.ukr_alp_section_content_8), sVar8, 0);
                    uKRSyllableIntroductionActivity2.q(ub.a.e0(sVar8, R.string.ukr_alp_section_content_9), sVar8, 0);
                    float f12 = 8;
                    j0.c.g(sVar8, j0.e2.g(oVar, f12));
                    j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, iVar9, sVar8, 0);
                    bVar = bVar4;
                    iHashCode = Long.hashCode(sVar8.T);
                    l1.q1 q1VarL6 = sVar8.l();
                    z1.r rVarC6 = z1.a.c(sVar8, oVar);
                    sVar8.h0();
                    gVar = gVar3;
                    if (sVar8.S) {
                        sVar8.k(iVar10);
                    } else {
                        sVar8.r0();
                    }
                    l1.t.J(hVar12, a2VarA2, sVar8);
                    l1.t.J(hVar13, q1VarL6, sVar8);
                    if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar8, iHashCode, hVar14);
                    }
                    l1.t.J(hVar15, rVarC6, sVar8);
                    String strE0 = ub.a.e0(sVar8, R.string.ukr_alp_section_content_10);
                    float f13 = 1;
                    z1.r rVarA = j0.c.A(oVar, f13);
                    j0.c2 c2Var = j0.c2.f35266a;
                    float f14 = 42;
                    uKRSyllableIntroductionActivity2.u(0, strE0, sVar8, j0.e2.g(c2Var.a(rVarA, 1.0f), f14));
                    uKRSyllableIntroductionActivity2.u(0, ub.a.e0(sVar8, R.string.ukr_alp_section_content_11), sVar8, w4.c.q(oVar, f13, c2Var, 1.0f, f14));
                    sVar8.p(true);
                    listL = ns.o.L(new qy.l(ns.o.K(num9), ns.o.L(num9, num8)), new qy.l(ns.o.K(num9), ns.o.L(num9, num8)), new qy.l(ns.o.K(num9), ns.o.L(num9, num8)));
                    sVar8.d0(-738673994);
                    it = list3.iterator();
                    i12 = 0;
                    while (it.hasNext()) {
                        next3 = it.next();
                        i17 = i12 + 1;
                        if (i12 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        List list6 = (List) next3;
                        j0.a2 a2VarA3 = j0.z1.a(j0.i.f35303a, iVar9, sVar8, 0);
                        Iterator it4 = it;
                        UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity3 = uKRSyllableIntroductionActivity2;
                        iHashCode6 = Long.hashCode(sVar8.T);
                        l1.q1 q1VarL7 = sVar8.l();
                        z1.r rVarC7 = z1.a.c(sVar8, oVar);
                        y2.k.J.getClass();
                        iVar5 = y2.j.f56913b;
                        sVar8.h0();
                        Integer num10 = num8;
                        if (sVar8.S) {
                            sVar8.k(iVar5);
                        } else {
                            sVar8.r0();
                        }
                        l1.t.J(y2.j.f56917f, a2VarA3, sVar8);
                        l1.t.J(y2.j.f56916e, q1VarL7, sVar8);
                        hVar5 = y2.j.f56918g;
                        if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode6))) {
                            defpackage.e.A(iHashCode6, sVar8, iHashCode6, hVar5);
                        }
                        l1.t.J(y2.j.f56915d, rVarC7, sVar8);
                        List listSubList = list6.subList(0, i24);
                        List list7 = (List) ((qy.l) listL.get(i12)).f48495a;
                        bVar3 = bVar;
                        zH5 = sVar8.h(bVar3);
                        objQ5 = sVar8.Q();
                        if (zH5) {
                            gVar2 = gVar;
                        } else {
                            gVar2 = gVar;
                            if (objQ5 == gVar2) {
                            }
                            uKRSyllableIntroductionActivity3.t(listSubList, list7, 1.0f, (fz.c) objQ5, sVar8, 3078);
                            List listSubList2 = list6.subList(3, list6.size());
                            List list8 = (List) ((qy.l) listL.get(i12)).f48496b;
                            zH6 = sVar8.h(bVar3);
                            objQ6 = sVar8.Q();
                            if (zH6 || objQ6 == gVar2) {
                                objQ6 = new xp.h(bVar3, 3);
                                sVar8.o0(objQ6);
                            }
                            uKRSyllableIntroductionActivity3.t(listSubList2, list8, 1.0f, (fz.c) objQ6, sVar8, 3078);
                            uKRSyllableIntroductionActivity2 = uKRSyllableIntroductionActivity3;
                            sVar8.p(true);
                            bVar = bVar3;
                            gVar = gVar2;
                            it = it4;
                            i12 = i17;
                            num8 = num10;
                            i24 = 3;
                            i19 = 2;
                        }
                        objQ5 = new xp.h(bVar3, i19);
                        sVar8.o0(objQ5);
                        uKRSyllableIntroductionActivity3.t(listSubList, list7, 1.0f, (fz.c) objQ5, sVar8, 3078);
                        List listSubList3 = list6.subList(3, list6.size());
                        List list9 = (List) ((qy.l) listL.get(i12)).f48496b;
                        zH6 = sVar8.h(bVar3);
                        objQ6 = sVar8.Q();
                        if (zH6) {
                            objQ6 = new xp.h(bVar3, 3);
                            sVar8.o0(objQ6);
                        } else {
                            objQ6 = new xp.h(bVar3, 3);
                            sVar8.o0(objQ6);
                        }
                        uKRSyllableIntroductionActivity3.t(listSubList3, list9, 1.0f, (fz.c) objQ6, sVar8, 3078);
                        uKRSyllableIntroductionActivity2 = uKRSyllableIntroductionActivity3;
                        sVar8.p(true);
                        bVar = bVar3;
                        gVar = gVar2;
                        it = it4;
                        i12 = i17;
                        num8 = num10;
                        i24 = 3;
                        i19 = 2;
                    }
                    Integer num11 = num8;
                    bVar2 = bVar;
                    l1.g gVar4 = gVar;
                    sVar8.p(false);
                    uKRSyllableIntroductionActivity2.q(ub.a.e0(sVar8, R.string.ukr_alp_section_content_12), sVar8, 0);
                    j0.c.g(sVar8, j0.e2.g(oVar, f12));
                    j0.a2 a2VarA4 = j0.z1.a(j0.i.f35303a, iVar9, sVar8, 0);
                    iHashCode2 = Long.hashCode(sVar8.T);
                    l1.q1 q1VarL8 = sVar8.l();
                    z1.r rVarC8 = z1.a.c(sVar8, oVar);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar8.h0();
                    if (sVar8.S) {
                        sVar8.k(iVar);
                    } else {
                        sVar8.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA4, sVar8);
                    l1.t.J(y2.j.f56916e, q1VarL8, sVar8);
                    hVar = y2.j.f56918g;
                    if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar8, iHashCode2, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC8, sVar8);
                    uKRSyllableIntroductionActivity2.u(0, ub.a.e0(sVar8, R.string.ukr_alp_section_content_10), sVar8, w4.c.q(oVar, f13, c2Var, 1.0f, f14));
                    uKRSyllableIntroductionActivity2.u(0, ub.a.e0(sVar8, R.string.ukr_alp_section_content_11), sVar8, w4.c.q(oVar, f13, c2Var, 1.0f, f14));
                    sVar8.p(true);
                    num2 = num;
                    num3 = 0;
                    uKRSyllableIntroductionActivity = uKRSyllableIntroductionActivity2;
                    listL2 = ns.o.L(new qy.l(ns.o.K(num9), ns.o.L(num2, num9)), new qy.l(ns.o.K(0), ns.o.L(null, num2)), new qy.l(ns.o.K(null), ns.o.L(null, num2)), new qy.l(ns.o.K(num9), ns.o.L(num9, num11)));
                    sVar8.d0(-738624425);
                    it2 = list4.iterator();
                    i13 = 0;
                    while (it2.hasNext()) {
                        next2 = it2.next();
                        i16 = i13 + 1;
                        if (i13 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        List list10 = (List) next2;
                        Iterator it5 = it2;
                        j0.a2 a2VarA5 = j0.z1.a(j0.i.f35303a, iVar9, sVar8, 0);
                        Integer num12 = num3;
                        Integer num13 = num9;
                        iHashCode5 = Long.hashCode(sVar8.T);
                        l1.q1 q1VarL9 = sVar8.l();
                        z1.r rVarC9 = z1.a.c(sVar8, oVar);
                        y2.k.J.getClass();
                        iVar4 = y2.j.f56913b;
                        sVar8.h0();
                        Integer num14 = num2;
                        if (sVar8.S) {
                            sVar8.k(iVar4);
                        } else {
                            sVar8.r0();
                        }
                        l1.t.J(y2.j.f56917f, a2VarA5, sVar8);
                        l1.t.J(y2.j.f56916e, q1VarL9, sVar8);
                        hVar4 = y2.j.f56918g;
                        if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode5))) {
                            defpackage.e.A(iHashCode5, sVar8, iHashCode5, hVar4);
                        }
                        l1.t.J(y2.j.f56915d, rVarC9, sVar8);
                        List listSubList4 = list10.subList(0, 3);
                        List list11 = (List) ((qy.l) listL2.get(i13)).f48495a;
                        zH3 = sVar8.h(bVar2);
                        objQ3 = sVar8.Q();
                        if (zH3 || objQ3 == gVar4) {
                            objQ3 = new xp.h(bVar2, 4);
                            sVar8.o0(objQ3);
                        }
                        uKRSyllableIntroductionActivity.t(listSubList4, list11, 1.0f, (fz.c) objQ3, sVar8, 3078);
                        List listSubList5 = list10.subList(3, list10.size());
                        List list12 = (List) ((qy.l) listL2.get(i13)).f48496b;
                        zH4 = sVar8.h(bVar2);
                        objQ4 = sVar8.Q();
                        if (zH4 || objQ4 == gVar4) {
                            objQ4 = new xp.h(bVar2, 5);
                            sVar8.o0(objQ4);
                        }
                        uKRSyllableIntroductionActivity.t(listSubList5, list12, 1.0f, (fz.c) objQ4, sVar8, 3078);
                        sVar8.p(true);
                        it2 = it5;
                        num9 = num13;
                        num3 = num12;
                        i13 = i16;
                        num2 = num14;
                    }
                    Integer num15 = num2;
                    Integer num16 = num3;
                    Integer num17 = num9;
                    sVar8.p(false);
                    uKRSyllableIntroductionActivity.q(ub.a.e0(sVar8, R.string.ukr_alp_section_content_13), sVar8, 0);
                    j0.c.g(sVar8, j0.e2.g(oVar, f12));
                    j0.a2 a2VarA6 = j0.z1.a(j0.i.f35303a, iVar9, sVar8, 0);
                    iHashCode3 = Long.hashCode(sVar8.T);
                    l1.q1 q1VarL10 = sVar8.l();
                    z1.r rVarC10 = z1.a.c(sVar8, oVar);
                    y2.k.J.getClass();
                    iVar2 = y2.j.f56913b;
                    sVar8.h0();
                    if (sVar8.S) {
                        sVar8.k(iVar2);
                    } else {
                        sVar8.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA6, sVar8);
                    l1.t.J(y2.j.f56916e, q1VarL10, sVar8);
                    hVar2 = y2.j.f56918g;
                    if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar8, iHashCode3, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC10, sVar8);
                    String strE1 = ub.a.e0(sVar8, R.string.ukr_alp_section_content_10);
                    z1.r rVarA2 = j0.c.A(oVar, f13);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    uKRSyllableIntroductionActivity.u(0, strE1, sVar8, j0.e2.g(rVarA2.i(new j0.i1(1.0f, true)), f14));
                    sVar8.p(true);
                    listL3 = ns.o.L(ns.o.L(num15, num17), ns.o.L(num16, num15), ns.o.L(num16, num15), ns.o.L(num11, 4));
                    sVar8.d0(-738585874);
                    it3 = list5.iterator();
                    i14 = 0;
                    while (it3.hasNext()) {
                        next = it3.next();
                        i15 = i14 + 1;
                        if (i14 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        List list13 = (List) next;
                        j0.a2 a2VarA7 = j0.z1.a(j0.i.f35303a, iVar9, sVar8, 0);
                        iHashCode4 = Long.hashCode(sVar8.T);
                        l1.q1 q1VarL11 = sVar8.l();
                        z1.r rVarC11 = z1.a.c(sVar8, oVar);
                        y2.k.J.getClass();
                        iVar3 = y2.j.f56913b;
                        sVar8.h0();
                        Iterator it6 = it3;
                        if (sVar8.S) {
                            sVar8.k(iVar3);
                        } else {
                            sVar8.r0();
                        }
                        l1.t.J(y2.j.f56917f, a2VarA7, sVar8);
                        l1.t.J(y2.j.f56916e, q1VarL11, sVar8);
                        hVar3 = y2.j.f56918g;
                        if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode4))) {
                            defpackage.e.A(iHashCode4, sVar8, iHashCode4, hVar3);
                        }
                        l1.t.J(y2.j.f56915d, rVarC11, sVar8);
                        List listSubList6 = list13.subList(0, 3);
                        List list14 = (List) listL3.get(i14);
                        zH2 = sVar8.h(bVar2);
                        objQ2 = sVar8.Q();
                        if (zH2 || objQ2 == gVar4) {
                            objQ2 = new xp.h(bVar2, 6);
                            sVar8.o0(objQ2);
                        }
                        uKRSyllableIntroductionActivity.t(listSubList6, list14, 1.0f, (fz.c) objQ2, sVar8, 3078);
                        sVar8.p(true);
                        it3 = it6;
                        i14 = i15;
                    }
                    sVar8.p(false);
                    sVar8.p(true);
                    return b0Var;
                }
                num = 1;
                defpackage.e.A(iHashCode11, sVar8, iHashCode11, hVar14);
                y2.h hVar16 = y2.j.f56915d;
                l1.t.J(hVar16, rVarC5, sVar8);
                uKRSyllableIntroductionActivity2.w(ub.a.e0(sVar8, R.string.ukr_alp_section_content_8), sVar8, 0);
                uKRSyllableIntroductionActivity2.q(ub.a.e0(sVar8, R.string.ukr_alp_section_content_9), sVar8, 0);
                float f15 = 8;
                j0.c.g(sVar8, j0.e2.g(oVar, f15));
                j0.a2 a2VarA8 = j0.z1.a(j0.i.f35303a, iVar9, sVar8, 0);
                bVar = bVar4;
                iHashCode = Long.hashCode(sVar8.T);
                l1.q1 q1VarL12 = sVar8.l();
                z1.r rVarC12 = z1.a.c(sVar8, oVar);
                sVar8.h0();
                gVar = gVar3;
                if (sVar8.S) {
                    sVar8.k(iVar10);
                } else {
                    sVar8.r0();
                }
                l1.t.J(hVar12, a2VarA8, sVar8);
                l1.t.J(hVar13, q1VarL12, sVar8);
                if (sVar8.S) {
                    defpackage.e.A(iHashCode, sVar8, iHashCode, hVar14);
                } else {
                    defpackage.e.A(iHashCode, sVar8, iHashCode, hVar14);
                }
                l1.t.J(hVar16, rVarC12, sVar8);
                String strE2 = ub.a.e0(sVar8, R.string.ukr_alp_section_content_10);
                float f16 = 1;
                z1.r rVarA3 = j0.c.A(oVar, f16);
                j0.c2 c2Var2 = j0.c2.f35266a;
                float f17 = 42;
                uKRSyllableIntroductionActivity2.u(0, strE2, sVar8, j0.e2.g(c2Var2.a(rVarA3, 1.0f), f17));
                uKRSyllableIntroductionActivity2.u(0, ub.a.e0(sVar8, R.string.ukr_alp_section_content_11), sVar8, w4.c.q(oVar, f16, c2Var2, 1.0f, f17));
                sVar8.p(true);
                listL = ns.o.L(new qy.l(ns.o.K(num9), ns.o.L(num9, num8)), new qy.l(ns.o.K(num9), ns.o.L(num9, num8)), new qy.l(ns.o.K(num9), ns.o.L(num9, num8)));
                sVar8.d0(-738673994);
                it = list3.iterator();
                i12 = 0;
                while (it.hasNext()) {
                    next3 = it.next();
                    i17 = i12 + 1;
                    if (i12 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    List list15 = (List) next3;
                    j0.a2 a2VarA9 = j0.z1.a(j0.i.f35303a, iVar9, sVar8, 0);
                    Iterator it7 = it;
                    UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity4 = uKRSyllableIntroductionActivity2;
                    iHashCode6 = Long.hashCode(sVar8.T);
                    l1.q1 q1VarL13 = sVar8.l();
                    z1.r rVarC13 = z1.a.c(sVar8, oVar);
                    y2.k.J.getClass();
                    iVar5 = y2.j.f56913b;
                    sVar8.h0();
                    Integer num18 = num8;
                    if (sVar8.S) {
                        sVar8.k(iVar5);
                    } else {
                        sVar8.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA9, sVar8);
                    l1.t.J(y2.j.f56916e, q1VarL13, sVar8);
                    hVar5 = y2.j.f56918g;
                    if (sVar8.S) {
                        defpackage.e.A(iHashCode6, sVar8, iHashCode6, hVar5);
                    } else {
                        defpackage.e.A(iHashCode6, sVar8, iHashCode6, hVar5);
                    }
                    l1.t.J(y2.j.f56915d, rVarC13, sVar8);
                    List listSubList7 = list15.subList(0, i24);
                    List list16 = (List) ((qy.l) listL.get(i12)).f48495a;
                    bVar3 = bVar;
                    zH5 = sVar8.h(bVar3);
                    objQ5 = sVar8.Q();
                    if (zH5) {
                        gVar2 = gVar;
                        if (objQ5 == gVar2) {
                        }
                        uKRSyllableIntroductionActivity4.t(listSubList7, list16, 1.0f, (fz.c) objQ5, sVar8, 3078);
                        List listSubList8 = list15.subList(3, list15.size());
                        List list17 = (List) ((qy.l) listL.get(i12)).f48496b;
                        zH6 = sVar8.h(bVar3);
                        objQ6 = sVar8.Q();
                        if (zH6) {
                            objQ6 = new xp.h(bVar3, 3);
                            sVar8.o0(objQ6);
                        } else {
                            objQ6 = new xp.h(bVar3, 3);
                            sVar8.o0(objQ6);
                        }
                        uKRSyllableIntroductionActivity4.t(listSubList8, list17, 1.0f, (fz.c) objQ6, sVar8, 3078);
                        uKRSyllableIntroductionActivity2 = uKRSyllableIntroductionActivity4;
                        sVar8.p(true);
                        bVar = bVar3;
                        gVar = gVar2;
                        it = it7;
                        i12 = i17;
                        num8 = num18;
                        i24 = 3;
                        i19 = 2;
                    } else {
                        gVar2 = gVar;
                    }
                    objQ5 = new xp.h(bVar3, i19);
                    sVar8.o0(objQ5);
                    uKRSyllableIntroductionActivity4.t(listSubList7, list16, 1.0f, (fz.c) objQ5, sVar8, 3078);
                    List listSubList9 = list15.subList(3, list15.size());
                    List list18 = (List) ((qy.l) listL.get(i12)).f48496b;
                    zH6 = sVar8.h(bVar3);
                    objQ6 = sVar8.Q();
                    if (zH6) {
                        objQ6 = new xp.h(bVar3, 3);
                        sVar8.o0(objQ6);
                    } else {
                        objQ6 = new xp.h(bVar3, 3);
                        sVar8.o0(objQ6);
                    }
                    uKRSyllableIntroductionActivity4.t(listSubList9, list18, 1.0f, (fz.c) objQ6, sVar8, 3078);
                    uKRSyllableIntroductionActivity2 = uKRSyllableIntroductionActivity4;
                    sVar8.p(true);
                    bVar = bVar3;
                    gVar = gVar2;
                    it = it7;
                    i12 = i17;
                    num8 = num18;
                    i24 = 3;
                    i19 = 2;
                }
                Integer num19 = num8;
                bVar2 = bVar;
                l1.g gVar5 = gVar;
                sVar8.p(false);
                uKRSyllableIntroductionActivity2.q(ub.a.e0(sVar8, R.string.ukr_alp_section_content_12), sVar8, 0);
                j0.c.g(sVar8, j0.e2.g(oVar, f15));
                j0.a2 a2VarA10 = j0.z1.a(j0.i.f35303a, iVar9, sVar8, 0);
                iHashCode2 = Long.hashCode(sVar8.T);
                l1.q1 q1VarL14 = sVar8.l();
                z1.r rVarC14 = z1.a.c(sVar8, oVar);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar8.h0();
                if (sVar8.S) {
                    sVar8.k(iVar);
                } else {
                    sVar8.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA10, sVar8);
                l1.t.J(y2.j.f56916e, q1VarL14, sVar8);
                hVar = y2.j.f56918g;
                if (sVar8.S) {
                    defpackage.e.A(iHashCode2, sVar8, iHashCode2, hVar);
                } else {
                    defpackage.e.A(iHashCode2, sVar8, iHashCode2, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC14, sVar8);
                uKRSyllableIntroductionActivity2.u(0, ub.a.e0(sVar8, R.string.ukr_alp_section_content_10), sVar8, w4.c.q(oVar, f16, c2Var2, 1.0f, f17));
                uKRSyllableIntroductionActivity2.u(0, ub.a.e0(sVar8, R.string.ukr_alp_section_content_11), sVar8, w4.c.q(oVar, f16, c2Var2, 1.0f, f17));
                sVar8.p(true);
                num2 = num;
                num3 = 0;
                uKRSyllableIntroductionActivity = uKRSyllableIntroductionActivity2;
                listL2 = ns.o.L(new qy.l(ns.o.K(num9), ns.o.L(num2, num9)), new qy.l(ns.o.K(0), ns.o.L(null, num2)), new qy.l(ns.o.K(null), ns.o.L(null, num2)), new qy.l(ns.o.K(num9), ns.o.L(num9, num19)));
                sVar8.d0(-738624425);
                it2 = list4.iterator();
                i13 = 0;
                while (it2.hasNext()) {
                    next2 = it2.next();
                    i16 = i13 + 1;
                    if (i13 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    List list19 = (List) next2;
                    Iterator it8 = it2;
                    j0.a2 a2VarA11 = j0.z1.a(j0.i.f35303a, iVar9, sVar8, 0);
                    Integer num110 = num3;
                    Integer num111 = num9;
                    iHashCode5 = Long.hashCode(sVar8.T);
                    l1.q1 q1VarL15 = sVar8.l();
                    z1.r rVarC15 = z1.a.c(sVar8, oVar);
                    y2.k.J.getClass();
                    iVar4 = y2.j.f56913b;
                    sVar8.h0();
                    Integer num112 = num2;
                    if (sVar8.S) {
                        sVar8.k(iVar4);
                    } else {
                        sVar8.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA11, sVar8);
                    l1.t.J(y2.j.f56916e, q1VarL15, sVar8);
                    hVar4 = y2.j.f56918g;
                    if (sVar8.S) {
                        defpackage.e.A(iHashCode5, sVar8, iHashCode5, hVar4);
                    } else {
                        defpackage.e.A(iHashCode5, sVar8, iHashCode5, hVar4);
                    }
                    l1.t.J(y2.j.f56915d, rVarC15, sVar8);
                    List listSubList10 = list19.subList(0, 3);
                    List list110 = (List) ((qy.l) listL2.get(i13)).f48495a;
                    zH3 = sVar8.h(bVar2);
                    objQ3 = sVar8.Q();
                    if (zH3) {
                        objQ3 = new xp.h(bVar2, 4);
                        sVar8.o0(objQ3);
                    } else {
                        objQ3 = new xp.h(bVar2, 4);
                        sVar8.o0(objQ3);
                    }
                    uKRSyllableIntroductionActivity.t(listSubList10, list110, 1.0f, (fz.c) objQ3, sVar8, 3078);
                    List listSubList11 = list19.subList(3, list19.size());
                    List list111 = (List) ((qy.l) listL2.get(i13)).f48496b;
                    zH4 = sVar8.h(bVar2);
                    objQ4 = sVar8.Q();
                    if (zH4) {
                        objQ4 = new xp.h(bVar2, 5);
                        sVar8.o0(objQ4);
                    } else {
                        objQ4 = new xp.h(bVar2, 5);
                        sVar8.o0(objQ4);
                    }
                    uKRSyllableIntroductionActivity.t(listSubList11, list111, 1.0f, (fz.c) objQ4, sVar8, 3078);
                    sVar8.p(true);
                    it2 = it8;
                    num9 = num111;
                    num3 = num110;
                    i13 = i16;
                    num2 = num112;
                }
                Integer num113 = num2;
                Integer num114 = num3;
                Integer num115 = num9;
                sVar8.p(false);
                uKRSyllableIntroductionActivity.q(ub.a.e0(sVar8, R.string.ukr_alp_section_content_13), sVar8, 0);
                j0.c.g(sVar8, j0.e2.g(oVar, f15));
                j0.a2 a2VarA12 = j0.z1.a(j0.i.f35303a, iVar9, sVar8, 0);
                iHashCode3 = Long.hashCode(sVar8.T);
                l1.q1 q1VarL16 = sVar8.l();
                z1.r rVarC16 = z1.a.c(sVar8, oVar);
                y2.k.J.getClass();
                iVar2 = y2.j.f56913b;
                sVar8.h0();
                if (sVar8.S) {
                    sVar8.k(iVar2);
                } else {
                    sVar8.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA12, sVar8);
                l1.t.J(y2.j.f56916e, q1VarL16, sVar8);
                hVar2 = y2.j.f56918g;
                if (sVar8.S) {
                    defpackage.e.A(iHashCode3, sVar8, iHashCode3, hVar2);
                } else {
                    defpackage.e.A(iHashCode3, sVar8, iHashCode3, hVar2);
                }
                l1.t.J(y2.j.f56915d, rVarC16, sVar8);
                String strE3 = ub.a.e0(sVar8, R.string.ukr_alp_section_content_10);
                z1.r rVarA4 = j0.c.A(oVar, f16);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                uKRSyllableIntroductionActivity.u(0, strE3, sVar8, j0.e2.g(rVarA4.i(new j0.i1(1.0f, true)), f17));
                sVar8.p(true);
                listL3 = ns.o.L(ns.o.L(num113, num115), ns.o.L(num114, num113), ns.o.L(num114, num113), ns.o.L(num19, 4));
                sVar8.d0(-738585874);
                it3 = list5.iterator();
                i14 = 0;
                while (it3.hasNext()) {
                    next = it3.next();
                    i15 = i14 + 1;
                    if (i14 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    List list112 = (List) next;
                    j0.a2 a2VarA13 = j0.z1.a(j0.i.f35303a, iVar9, sVar8, 0);
                    iHashCode4 = Long.hashCode(sVar8.T);
                    l1.q1 q1VarL17 = sVar8.l();
                    z1.r rVarC17 = z1.a.c(sVar8, oVar);
                    y2.k.J.getClass();
                    iVar3 = y2.j.f56913b;
                    sVar8.h0();
                    Iterator it9 = it3;
                    if (sVar8.S) {
                        sVar8.k(iVar3);
                    } else {
                        sVar8.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA13, sVar8);
                    l1.t.J(y2.j.f56916e, q1VarL17, sVar8);
                    hVar3 = y2.j.f56918g;
                    if (sVar8.S) {
                        defpackage.e.A(iHashCode4, sVar8, iHashCode4, hVar3);
                    } else {
                        defpackage.e.A(iHashCode4, sVar8, iHashCode4, hVar3);
                    }
                    l1.t.J(y2.j.f56915d, rVarC17, sVar8);
                    List listSubList12 = list112.subList(0, 3);
                    List list113 = (List) listL3.get(i14);
                    zH2 = sVar8.h(bVar2);
                    objQ2 = sVar8.Q();
                    if (zH2) {
                        objQ2 = new xp.h(bVar2, 6);
                        sVar8.o0(objQ2);
                    } else {
                        objQ2 = new xp.h(bVar2, 6);
                        sVar8.o0(objQ2);
                    }
                    uKRSyllableIntroductionActivity.t(listSubList12, list113, 1.0f, (fz.c) objQ2, sVar8, 3078);
                    sVar8.p(true);
                    it3 = it9;
                    i14 = i15;
                }
                sVar8.p(false);
                sVar8.p(true);
                return b0Var;
        }
    }

    public /* synthetic */ y(e2.l lVar, fz.c cVar, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3) {
        this.f4902a = 2;
        this.f4906e = lVar;
        this.f4907f = cVar;
        this.f4903b = b1Var;
        this.f4904c = b1Var2;
        this.f4905d = b1Var3;
    }

    public /* synthetic */ y(fz.c cVar, rz.b0 b0Var, e8 e8Var, fz.a aVar, l1.b1 b1Var) {
        this.f4902a = 1;
        this.f4904c = cVar;
        this.f4905d = b0Var;
        this.f4906e = e8Var;
        this.f4907f = aVar;
        this.f4903b = b1Var;
    }

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f4902a = i11;
        this.f4903b = obj;
        this.f4904c = obj2;
        this.f4905d = obj3;
        this.f4906e = obj4;
        this.f4907f = obj5;
    }

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, Object obj4, l1.b1 b1Var, int i11) {
        this.f4902a = i11;
        this.f4904c = obj;
        this.f4905d = obj2;
        this.f4906e = obj3;
        this.f4907f = obj4;
        this.f4903b = b1Var;
    }

    public /* synthetic */ y(l1.b1 b1Var, ep.c cVar, Context context, l1.b1 b1Var2, l1.b1 b1Var3) {
        this.f4902a = 0;
        this.f4903b = b1Var;
        this.f4906e = cVar;
        this.f4907f = context;
        this.f4904c = b1Var2;
        this.f4905d = b1Var3;
    }
}
