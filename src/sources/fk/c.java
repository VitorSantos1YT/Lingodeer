package fk;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lingo.lingoskill.deskill.ui.learn.DESyllableIntroductionActivity;
import com.lingo.lingoskill.espanskill.ui.learn.ESSyllableIntroductionActivity;
import com.lingo.lingoskill.esusskill.ui.learn.ESUSSyllableIntroductionActivity;
import com.lingo.lingoskill.franchskill.ui.learn.FRSyllableIntroductionActivity2;
import com.lingo.lingoskill.itskill.ui.learn.ITSyllableIntroductionActivity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.tbruyelle.rxpermissions3.RxPermissions;
import hj.k5;
import hj.l5;
import hj.m5;
import hj.o4;
import hj.p;
import hj.t;
import hj.w;
import km.m1;
import km.p1;
import km.s1;
import kotlin.jvm.internal.y;
import ob.m;
import ob.u;
import re.q;
import ui.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27335b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f27334a = i11;
        this.f27335b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i11 = this.f27334a;
        q qVar = vx.b.f54316e;
        boolean z11 = true;
        Object obj = this.f27335b;
        switch (i11) {
            case 0:
                ESSyllableIntroductionActivity eSSyllableIntroductionActivity = (ESSyllableIntroductionActivity) obj;
                int i12 = ESSyllableIntroductionActivity.f21802y0;
                y yVar = new y();
                yVar.f38361a = BuildConfig.VERSION_NAME;
                int childCount = ((p) eSSyllableIntroductionActivity.j()).f33054c.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = ((p) eSSyllableIntroductionActivity.j()).f33054c.getChildAt(i13);
                    if (childAt instanceof TextView) {
                        Object obj2 = yVar.f38361a;
                        CharSequence text = ((TextView) childAt).getText();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(obj2);
                        sb2.append((Object) text);
                        String string = sb2.toString();
                        yVar.f38361a = string;
                        yVar.f38361a = ((Object) string) + "\n";
                    }
                }
                ob.c cVar = new ob.c(9, yVar, eSSyllableIntroductionActivity);
                RxPermissions rxPermissions = new RxPermissions(eSSyllableIntroductionActivity);
                if (rxPermissions.isGranted("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    cVar.m();
                } else {
                    rxPermissions.request("android.permission.WRITE_EXTERNAL_STORAGE").h(new m(cVar, eSSyllableIntroductionActivity, rxPermissions, 17), qVar);
                }
                return true;
            case 1:
                m1 m1Var = (m1) obj;
                y yVar2 = new y();
                yVar2.f38361a = BuildConfig.VERSION_NAME;
                ta.a aVar = m1Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                int childCount2 = ((k5) aVar).f32827c.getChildCount();
                for (int i14 = 0; i14 < childCount2; i14++) {
                    ta.a aVar2 = m1Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar2);
                    View childAt2 = ((k5) aVar2).f32827c.getChildAt(i14);
                    if (childAt2 instanceof TextView) {
                        Object obj3 = yVar2.f38361a;
                        CharSequence text2 = ((TextView) childAt2).getText();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(obj3);
                        sb3.append((Object) text2);
                        String string2 = sb3.toString();
                        yVar2.f38361a = string2;
                        yVar2.f38361a = ((Object) string2) + "\n";
                    }
                }
                b1.p pVar = new b1.p(17, yVar2, m1Var);
                RxPermissions rxPermissions2 = new RxPermissions(m1Var);
                Context contextRequireContext = m1Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                if (rxPermissions2.isGranted("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    pVar.m();
                } else {
                    rxPermissions2.request("android.permission.WRITE_EXTERNAL_STORAGE").h(new m(pVar, contextRequireContext, rxPermissions2, 17), qVar);
                }
                return true;
            case 2:
                p1 p1Var = (p1) obj;
                y yVar3 = new y();
                yVar3.f38361a = BuildConfig.VERSION_NAME;
                ta.a aVar3 = p1Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                int childCount3 = ((l5) aVar3).f32865c.getChildCount();
                for (int i15 = 0; i15 < childCount3; i15++) {
                    ta.a aVar4 = p1Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar4);
                    View childAt3 = ((l5) aVar4).f32865c.getChildAt(i15);
                    if (childAt3 instanceof TextView) {
                        Object obj4 = yVar3.f38361a;
                        CharSequence text3 = ((TextView) childAt3).getText();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(obj4);
                        sb4.append((Object) text3);
                        String string3 = sb4.toString();
                        yVar3.f38361a = string3;
                        yVar3.f38361a = ((Object) string3) + "\n";
                    }
                }
                ob.c cVar2 = new ob.c(17, yVar3, p1Var);
                RxPermissions rxPermissions3 = new RxPermissions(p1Var);
                Context contextRequireContext2 = p1Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                if (rxPermissions3.isGranted("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    cVar2.m();
                } else {
                    rxPermissions3.request("android.permission.WRITE_EXTERNAL_STORAGE").h(new m(cVar2, contextRequireContext2, rxPermissions3, 17), qVar);
                }
                return true;
            case 3:
                s1 s1Var = (s1) obj;
                y yVar4 = new y();
                yVar4.f38361a = BuildConfig.VERSION_NAME;
                ta.a aVar5 = s1Var.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                int childCount4 = ((m5) aVar5).f32938c.getChildCount();
                for (int i16 = 0; i16 < childCount4; i16++) {
                    ta.a aVar6 = s1Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar6);
                    View childAt4 = ((m5) aVar6).f32938c.getChildAt(i16);
                    if (childAt4 instanceof TextView) {
                        Object obj5 = yVar4.f38361a;
                        CharSequence text4 = ((TextView) childAt4).getText();
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(obj5);
                        sb5.append((Object) text4);
                        String string4 = sb5.toString();
                        yVar4.f38361a = string4;
                        yVar4.f38361a = ((Object) string4) + "\n";
                    }
                }
                ob.e eVar = new ob.e(17, yVar4, s1Var);
                RxPermissions rxPermissions4 = new RxPermissions(s1Var);
                Context contextRequireContext3 = s1Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                if (rxPermissions4.isGranted("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    eVar.m();
                } else {
                    rxPermissions4.request("android.permission.WRITE_EXTERNAL_STORAGE").h(new m(eVar, contextRequireContext3, rxPermissions4, 17), qVar);
                }
                return true;
            case 4:
                DESyllableIntroductionActivity dESyllableIntroductionActivity = (DESyllableIntroductionActivity) obj;
                int i17 = DESyllableIntroductionActivity.G0;
                y yVar5 = new y();
                yVar5.f38361a = BuildConfig.VERSION_NAME;
                int childCount5 = ((hj.m) dESyllableIntroductionActivity.j()).f32879c.getChildCount();
                for (int i18 = 0; i18 < childCount5; i18++) {
                    View childAt5 = ((hj.m) dESyllableIntroductionActivity.j()).f32879c.getChildAt(i18);
                    if (childAt5 instanceof TextView) {
                        Object obj6 = yVar5.f38361a;
                        CharSequence text5 = ((TextView) childAt5).getText();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(obj6);
                        sb6.append((Object) text5);
                        String string5 = sb6.toString();
                        yVar5.f38361a = string5;
                        yVar5.f38361a = ((Object) string5) + "\n";
                    }
                }
                u uVar = new u(21, yVar5, dESyllableIntroductionActivity);
                RxPermissions rxPermissions5 = new RxPermissions(dESyllableIntroductionActivity);
                if (rxPermissions5.isGranted("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    uVar.m();
                } else {
                    rxPermissions5.request("android.permission.WRITE_EXTERNAL_STORAGE").h(new m(uVar, dESyllableIntroductionActivity, rxPermissions5, 17), qVar);
                }
                return true;
            case 5:
                ESUSSyllableIntroductionActivity eSUSSyllableIntroductionActivity = (ESUSSyllableIntroductionActivity) obj;
                int i19 = ESUSSyllableIntroductionActivity.f21828y0;
                y yVar6 = new y();
                yVar6.f38361a = BuildConfig.VERSION_NAME;
                int childCount6 = ((hj.q) eSUSSyllableIntroductionActivity.j()).f33107c.getChildCount();
                for (int i21 = 0; i21 < childCount6; i21++) {
                    View childAt6 = ((hj.q) eSUSSyllableIntroductionActivity.j()).f33107c.getChildAt(i21);
                    if (childAt6 instanceof TextView) {
                        Object obj7 = yVar6.f38361a;
                        CharSequence text6 = ((TextView) childAt6).getText();
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(obj7);
                        sb7.append((Object) text6);
                        String string6 = sb7.toString();
                        yVar6.f38361a = string6;
                        yVar6.f38361a = ((Object) string6) + "\n";
                    }
                }
                b1.p pVar2 = new b1.p(22, yVar6, eSUSSyllableIntroductionActivity);
                RxPermissions rxPermissions6 = new RxPermissions(eSUSSyllableIntroductionActivity);
                if (rxPermissions6.isGranted("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    pVar2.m();
                } else {
                    rxPermissions6.request("android.permission.WRITE_EXTERNAL_STORAGE").h(new m(pVar2, eSUSSyllableIntroductionActivity, rxPermissions6, 17), qVar);
                }
                return true;
            case 6:
                FRSyllableIntroductionActivity2 fRSyllableIntroductionActivity2 = (FRSyllableIntroductionActivity2) obj;
                int i22 = FRSyllableIntroductionActivity2.K0;
                y yVar7 = new y();
                yVar7.f38361a = BuildConfig.VERSION_NAME;
                int childCount7 = ((t) fRSyllableIntroductionActivity2.j()).f33282c.getChildCount();
                for (int i23 = 0; i23 < childCount7; i23++) {
                    View childAt7 = ((t) fRSyllableIntroductionActivity2.j()).f33282c.getChildAt(i23);
                    if (childAt7 instanceof TextView) {
                        Object obj8 = yVar7.f38361a;
                        CharSequence text7 = ((TextView) childAt7).getText();
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(obj8);
                        sb8.append((Object) text7);
                        String string7 = sb8.toString();
                        yVar7.f38361a = string7;
                        yVar7.f38361a = ((Object) string7) + "\n";
                    }
                }
                qh.d dVar = new qh.d(4, yVar7, fRSyllableIntroductionActivity2);
                RxPermissions rxPermissions7 = new RxPermissions(fRSyllableIntroductionActivity2);
                if (rxPermissions7.isGranted("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    dVar.m();
                } else {
                    rxPermissions7.request("android.permission.WRITE_EXTERNAL_STORAGE").h(new m(dVar, fRSyllableIntroductionActivity2, rxPermissions7, 17), qVar);
                }
                return true;
            case 7:
                f fVar = (f) obj;
                y yVar8 = new y();
                yVar8.f38361a = BuildConfig.VERSION_NAME;
                ta.a aVar7 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar7);
                int childCount8 = ((o4) aVar7).f33028i.getChildCount();
                int i24 = 0;
                while (i24 < childCount8) {
                    ta.a aVar8 = fVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar8);
                    View childAt8 = ((o4) aVar8).f33028i.getChildAt(i24);
                    boolean z12 = childAt8 instanceof TextView;
                    if (z12) {
                        Object obj9 = yVar8.f38361a;
                        CharSequence text8 = ((TextView) childAt8).getText();
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(obj9);
                        sb9.append((Object) text8);
                        String string8 = sb9.toString();
                        yVar8.f38361a = string8;
                        yVar8.f38361a = ((Object) string8) + "\n";
                    }
                    if (z12) {
                        Object obj10 = yVar8.f38361a;
                        CharSequence text9 = ((TextView) childAt8).getText();
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(obj10);
                        sb10.append((Object) text9);
                        String string9 = sb10.toString();
                        yVar8.f38361a = string9;
                        yVar8.f38361a = ((Object) string9) + "\n";
                    }
                    if (childAt8 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) childAt8;
                        int childCount9 = viewGroup.getChildCount();
                        int i25 = 0;
                        while (i25 < childCount9) {
                            View childAt9 = viewGroup.getChildAt(i25);
                            boolean z13 = childAt9 instanceof TextView;
                            boolean z14 = z11;
                            if (z13) {
                                Object obj11 = yVar8.f38361a;
                                CharSequence text10 = ((TextView) childAt9).getText();
                                StringBuilder sb11 = new StringBuilder();
                                sb11.append(obj11);
                                sb11.append((Object) text10);
                                String string10 = sb11.toString();
                                yVar8.f38361a = string10;
                                yVar8.f38361a = ((Object) string10) + "\n";
                            }
                            if (z13) {
                                Object obj12 = yVar8.f38361a;
                                CharSequence text11 = ((TextView) childAt9).getText();
                                StringBuilder sb12 = new StringBuilder();
                                sb12.append(obj12);
                                sb12.append((Object) text11);
                                String string11 = sb12.toString();
                                yVar8.f38361a = string11;
                                yVar8.f38361a = ((Object) string11) + "\n";
                            }
                            i25++;
                            z11 = z14;
                        }
                    }
                    i24++;
                    z11 = z11;
                }
                boolean z15 = z11;
                qh.d dVar2 = new qh.d(6, yVar8, fVar);
                RxPermissions rxPermissions8 = new RxPermissions(fVar);
                Context contextRequireContext4 = fVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                if (rxPermissions8.isGranted("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    dVar2.m();
                } else {
                    rxPermissions8.request("android.permission.WRITE_EXTERNAL_STORAGE").h(new m(dVar2, contextRequireContext4, rxPermissions8, 17), qVar);
                }
                return z15;
            default:
                ITSyllableIntroductionActivity iTSyllableIntroductionActivity = (ITSyllableIntroductionActivity) obj;
                int i26 = ITSyllableIntroductionActivity.f21889h0;
                y yVar9 = new y();
                yVar9.f38361a = BuildConfig.VERSION_NAME;
                int childCount10 = ((w) iTSyllableIntroductionActivity.j()).f33478c.getChildCount();
                for (int i27 = 0; i27 < childCount10; i27++) {
                    View childAt10 = ((w) iTSyllableIntroductionActivity.j()).f33478c.getChildAt(i27);
                    if (childAt10 instanceof TextView) {
                        Object obj13 = yVar9.f38361a;
                        CharSequence text12 = ((TextView) childAt10).getText();
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append(obj13);
                        sb13.append((Object) text12);
                        String string12 = sb13.toString();
                        yVar9.f38361a = string12;
                        yVar9.f38361a = ((Object) string12) + "\n";
                    }
                }
                qp.b bVar = new qp.b(12, yVar9, iTSyllableIntroductionActivity);
                RxPermissions rxPermissions9 = new RxPermissions(iTSyllableIntroductionActivity);
                if (rxPermissions9.isGranted("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    bVar.m();
                } else {
                    rxPermissions9.request("android.permission.WRITE_EXTERNAL_STORAGE").h(new m(bVar, iTSyllableIntroductionActivity, rxPermissions9, 17), qVar);
                }
                return true;
        }
    }
}
