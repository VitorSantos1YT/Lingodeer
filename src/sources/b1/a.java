package b1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import b0.l0;
import b0.x0;
import b7.e0;
import bp.b2;
import bp.d1;
import bp.e1;
import bp.p0;
import bp.q0;
import bt.z6;
import com.google.gson.Gson;
import com.lingo.course.ui.CourseTestActivity;
import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingo.lingoskill.japanskill.ui.syllable.adapter.JPHwCharListAdapter;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.lingoskill.object.PdWord;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.thaiskill.ui.learn.THAISyllableIntroductionActivity;
import com.lingo.lingoskill.ui.base.LoginPromptActivity;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.old.HwCharThumbView;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseLessonPracticeType;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.uistate.CourseLessonClicked;
import com.yalantis.ucrop.view.CropImageView;
import d0.y1;
import f0.a1;
import f0.i2;
import fr.o0;
import hh.j0;
import j0.t;
import j0.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jt.h2;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import l1.b1;
import l1.b3;
import l1.n;
import l1.q1;
import l1.s;
import m0.l;
import ot.f2;
import pr.a0;
import qp.k2;
import qy.b0;
import rt.l9;
import rt.m9;
import rt.ob;
import rt.x8;
import s0.c1;
import s0.o1;
import s0.s0;
import xu.z;
import y2.k0;
import z1.o;
import z1.r;
import z2.g1;
import z2.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3765f;

    public /* synthetic */ a(m mVar, o3.p pVar, o3.w wVar, s0 s0Var, g2.t tVar) {
        this.f3760a = 21;
        this.f3763d = mVar;
        this.f3764e = pVar;
        this.f3762c = wVar;
        this.f3765f = s0Var;
        this.f3761b = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.lang.Object, java.util.List] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        List listSubList;
        int i11 = this.f3760a;
        final int i12 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        final int i13 = 1;
        b0 b0Var = b0.f48488a;
        Object obj2 = this.f3762c;
        Object obj3 = this.f3765f;
        Object obj4 = this.f3764e;
        Object obj5 = this.f3763d;
        Object obj6 = this.f3761b;
        switch (i11) {
            case 0:
                w wVar = (w) obj;
                r rVar = ((e) obj5).f3773a;
                wVar.f3830h = (o3.w) obj2;
                wVar.f3831i = (o3.j) obj4;
                wVar.f3825c = (a0) obj3;
                wVar.f3826d = (fz.c) obj6;
                wVar.f3827e = rVar != null ? rVar.R : null;
                wVar.f3828f = rVar != null ? rVar.S : null;
                wVar.f3829g = rVar != null ? (p2) y2.f.i(rVar, g1.f58557s) : null;
                return b0Var;
            case 1:
                x1.p pVar = (x1.p) obj2;
                l0.h LazyColumn = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                LazyColumn.q(pVar.size(), null, new p0(0, pVar), new t1.d(new q0(pVar, (ep.c) obj5, (fz.c) obj6, (b1) obj4, (b1) obj3, 0), true, 2039820996));
                return b0Var;
            case 2:
                b1 b1Var = (b1) obj2;
                CourseWord courseWord = (CourseWord) obj5;
                b1 b1Var2 = (b1) obj6;
                f2.b bVar = (f2.b) obj;
                ((l1.g1) obj4).m(CropImageView.DEFAULT_ASPECT_RATIO);
                ((l1.g1) obj3).m(CropImageView.DEFAULT_ASPECT_RATIO);
                w2.x xVar = (w2.x) b1Var2.getValue();
                long jC = xVar != null ? xVar.c(0L) : 0L;
                w2.x xVar2 = (w2.x) b1Var2.getValue();
                b1Var.setValue(new h2(courseWord, 0L, jC, f2.b.h(xVar2 != null ? xVar2.c(0L) : 0L, bVar.f26570a)));
                return b0Var;
            case 3:
                b1 b1Var3 = (b1) obj5;
                CourseWord courseWord2 = (CourseWord) obj;
                bt.b.X((ht.o) obj4, (b1) obj3, (fz.e) obj6, e0.m(courseWord2, "it", "toString(...)"), new z6(6, b1Var3));
                b1Var3.setValue(new ht.d(courseWord2.getWordId(), ((CourseWord) obj2).getVisemedMap()));
                return b0Var;
            case 4:
                ht.o oVar = (ht.o) obj2;
                fz.e eVar = (fz.e) obj5;
                CourseWord courseWord3 = (CourseWord) obj4;
                b1 b1Var4 = (b1) obj3;
                CourseWord it = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ((fz.c) obj6).invoke(it);
                if (!oVar.f33766o && !oVar.f33757e) {
                    eVar.invoke(e0.l(it, "toString(...)"), new ju.d(25));
                    b1Var4.setValue(new ht.d(it.getWordId(), courseWord3.getVisemedMap()));
                }
                return b0Var;
            case 5:
                CourseTestActivity courseTestActivity = (CourseTestActivity) obj2;
                b1 b1Var5 = (b1) obj5;
                b1 b1Var6 = (b1) obj4;
                b1 b1Var7 = (b1) obj3;
                b1 b1Var8 = (b1) obj6;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    int i14 = CourseTestActivity.R;
                    b1Var5.setValue(Boolean.TRUE);
                } else {
                    int i15 = CourseTestActivity.R;
                }
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(courseTestActivity), null, null, new ch.u(courseTestActivity, zBooleanValue, b1Var6, b1Var7, b1Var8, b1Var5, (vy.d) null), 3);
                return b0Var;
            case 6:
                CourseTestIndexActivity courseTestIndexActivity = (CourseTestIndexActivity) obj2;
                rz.b0 b0Var2 = (rz.b0) obj5;
                b1 b1Var9 = (b1) obj4;
                b1 b1Var10 = (b1) obj3;
                b1 b1Var11 = (b1) obj6;
                CourseLessonClicked lesson = (CourseLessonClicked) obj;
                int i16 = CourseTestIndexActivity.N;
                kotlin.jvm.internal.m.f(lesson, "lesson");
                CoursePracticeType coursePracticeTypeC = ch.a.c(lesson.getPracticeType());
                if (!lesson.getLesson().getCanAccess()) {
                    b1Var9.setValue(new ob(lesson.getLesson(), lesson.getPracticeType()));
                    b1Var11.setValue(Boolean.TRUE);
                } else if (((o0) courseTestIndexActivity.l()).f27733a.isUnloginUser() && lesson.getLesson().getUnitSortIndex() >= 3 && !xt.b.f56281c) {
                    i.c cVar = courseTestIndexActivity.M;
                    int unitSortIndex = lesson.getLesson().getUnitSortIndex();
                    Intent intent = new Intent(courseTestIndexActivity, (Class<?>) LoginPromptActivity.class);
                    intent.putExtra(INTENTS.EXTRA_INT, unitSortIndex);
                    cVar.a(intent);
                } else if (lesson.getLesson().getCanReview() || !ry.l.D(new CoursePracticeType[]{CoursePracticeType.COURSE_PRACTICE_SPEAKING, CoursePracticeType.COURSE_PRACTICE_LISTENING, CoursePracticeType.COURSE_PRACTICE_SPELLING, CoursePracticeType.COURSE_PRACTICE_COMPREHENSIVE}, coursePracticeTypeC)) {
                    CourseLesson lesson2 = lesson.getLesson();
                    CourseLessonPracticeType practiceType = lesson.getPracticeType();
                    androidx.lifecycle.compose.a aVar = new androidx.lifecycle.compose.a(lesson, b1Var9, b1Var10, 9);
                    CoursePracticeType coursePracticeTypeC2 = ch.a.c(practiceType);
                    if (coursePracticeTypeC2 != null) {
                        rz.e0.B(b0Var2, null, null, new x0(courseTestIndexActivity, lesson2, coursePracticeTypeC2, aVar, practiceType, (vy.d) null, 3), 3);
                    } else {
                        courseTestIndexActivity.q(lesson2, practiceType);
                    }
                } else {
                    b1Var9.setValue(new ob(lesson.getLesson(), lesson.getPracticeType()));
                    b1Var11.setValue(Boolean.TRUE);
                }
                return b0Var;
            case 7:
                List list = (List) obj2;
                String str = (String) obj5;
                l0.h LazyColumn2 = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn2, "$this$LazyColumn");
                int i17 = 3;
                LazyColumn2.q(list.size(), new av.r(i12, new y1(28), list), new p0(3, list), new t1.d(new e1(list, (ht.l) obj4, (fz.c) obj6, (b1) obj3, 1), true, 802480018));
                if (!oz.q.K0(str)) {
                    l0.h.p(LazyColumn2, null, new t1.d(new bp.a0(str, i17), true, -857564247), 3);
                }
                return b0Var;
            case 8:
                jt.v vVar = (jt.v) obj2;
                l0.h LazyColumn3 = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn3, "$this$LazyColumn");
                l0.h.p(LazyColumn3, null, et.a.f25824b, 3);
                x1.p pVar2 = vVar.f37218i;
                LazyColumn3.q(pVar2.size(), null, new p0(5, pVar2), new t1.d(new et.e0(pVar2, (CoursePracticeType) obj5, vVar, (rz.b0) obj4, (l0.w) obj3, (b3) obj6, 0), true, 2039820996));
                return b0Var;
            case 9:
                f0.g1 g1Var = (f0.g1) obj2;
                y yVar = (y) obj5;
                kotlin.jvm.internal.v vVar2 = (kotlin.jvm.internal.v) obj4;
                i2 i2Var = (i2) obj3;
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) obj6;
                float fFloatValue = ((Float) obj).floatValue();
                f0.b1 b1VarF = f0.g1.f((tz.h) g1Var.f26283f);
                if (b1VarF != null) {
                    g1Var.g(b1VarF);
                    f0.b1 b1VarA = ((f0.b1) yVar.f38361a).a(b1VarF);
                    yVar.f38361a = b1VarA;
                    float fG = i2Var.g(i2Var.e(b1VarA.f26194a));
                    vVar2.f38358a = fG;
                    uVar.f38357a = !a1.a(fG - fFloatValue);
                }
                return Boolean.valueOf(b1VarF != null);
            case 10:
                js.r rVar2 = (js.r) obj2;
                fz.a aVar2 = (fz.a) obj4;
                j9.t NavHost = (j9.t) obj;
                kotlin.jvm.internal.m.f(NavHost, "$this$NavHost");
                c.a.g(NavHost, "chinese_tone_test", null, null, new t1.d(new br.u(rVar2, (l9) obj5, aVar2, (j9.v) obj3, 1), true, -2078979384), 254);
                c.a.g(NavHost, "chinese_tone_finish", null, null, new t1.d(new b2(rVar2, aVar2, (fz.c) obj6, i12), true, -243476623), 254);
                return b0Var;
            case 11:
                fz.c cVar2 = (fz.c) obj6;
                j9.v vVar3 = (j9.v) obj2;
                LanguageItem it2 = (LanguageItem) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                ((b1) obj5).setValue(it2);
                int[] iArr = bq.r.f4959a;
                ((b1) obj4).setValue(bq.m.x(it2.getLocate()));
                if (((Boolean) ((b3) obj3).getValue()).booleanValue()) {
                    cVar2.invoke(it2);
                } else {
                    j9.v.b(vVar3, "billing");
                }
                return b0Var;
            case 12:
                LinearLayout linearLayout = (LinearLayout) obj2;
                j0 j0Var = (j0) obj5;
                EditText editText = (EditText) obj4;
                View view = (View) obj6;
                kotlin.jvm.internal.m.f((View) obj, "it");
                linearLayout.setVisibility(8);
                kotlin.jvm.internal.m.c(editText);
                int selectionStart = editText.getSelectionStart();
                String dictationWord = ((PdWord) obj3).getDictationWord();
                kotlin.jvm.internal.m.e(dictationWord, "getDictationWord(...)");
                j0Var.getClass();
                editText.getText().insert(selectionStart, dictationWord);
                HashMap map = j0Var.R;
                ArrayList arrayList = (ArrayList) map.get(view);
                if (arrayList == null) {
                    map.put(view, ns.o.b(linearLayout));
                } else {
                    arrayList.add(linearLayout);
                }
                return b0Var;
            case 13:
                JPHwCharListAdapter jPHwCharListAdapter = (JPHwCharListAdapter) obj2;
                HwView hwView = (HwView) obj5;
                HwCharThumbView hwCharThumbView = (HwCharThumbView) obj4;
                HwCharacter hwCharacter = (HwCharacter) obj3;
                qy.l lVar = (qy.l) obj6;
                View view2 = (View) obj;
                kotlin.jvm.internal.m.f(view2, "view");
                View view3 = jPHwCharListAdapter.f21903c;
                if (view3 != null) {
                    HwView hwView2 = (HwView) view3.findViewById(R.id.hw_view);
                    if (hwView2 != null) {
                        hwView2.g();
                        hwView2.setVisibility(8);
                    }
                    HwCharThumbView hwCharThumbView2 = (HwCharThumbView) view3.findViewById(R.id.hw_thumb_view);
                    if (hwCharThumbView2 != null) {
                        hwCharThumbView2.setVisibility(0);
                    }
                }
                jPHwCharListAdapter.f21903c = view2;
                hwView.setVisibility(0);
                hwCharThumbView.setVisibility(8);
                hwView.postDelayed(new b2.c(4, hwView, new androidx.lifecycle.compose.a(hwView, hwCharacter, lVar, 23)), 0L);
                jPHwCharListAdapter.f21901a.c("jxz_cr_learn_click_word", new m9(26));
                new Gson().toJson(hwCharacter);
                th.e eVar2 = jPHwCharListAdapter.f21902b;
                qy.q qVar = fv.b.f28186a;
                String pinyin = hwCharacter.getPinyin();
                kotlin.jvm.internal.m.e(pinyin, "getPinyin(...)");
                Uri uri = Uri.parse(fv.b.k0(pinyin));
                kotlin.jvm.internal.m.e(uri, "parse(...)");
                eVar2.j(uri);
                return b0Var;
            case 14:
                b1 b1Var12 = (b1) obj4;
                b1 b1Var13 = (b1) obj6;
                l1.j0 DisposableEffect = (l1.j0) obj;
                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                av.n nVar = new av.n((Context) obj2);
                nVar.f3172c = new hd.d((b1) obj5, 29);
                b1Var12.setValue(nVar);
                av.b bVar2 = new av.b();
                bVar2.f3108a = new a5.f((b1) obj3, 25);
                b1Var13.setValue(bVar2);
                return new l0(12, b1Var12, b1Var13);
            case 15:
                ArrayList arrayList2 = (ArrayList) obj5;
                kotlin.jvm.internal.w wVar2 = (kotlin.jvm.internal.w) obj4;
                m9.g gVar = (m9.g) obj3;
                Bundle bundle = (Bundle) obj6;
                j9.e entry = (j9.e) obj;
                kotlin.jvm.internal.m.f(entry, "entry");
                ((kotlin.jvm.internal.u) obj2).f38357a = true;
                int iIndexOf = arrayList2.indexOf(entry);
                if (iIndexOf != -1) {
                    int i18 = iIndexOf + 1;
                    listSubList = arrayList2.subList(wVar2.f38359a, i18);
                    wVar2.f38359a = i18;
                } else {
                    listSubList = ry.r.f50854a;
                }
                gVar.a(entry.f36188b, bundle, entry, listSubList);
                return b0Var;
            case 16:
                String selectedUnitName = (String) obj;
                kotlin.jvm.internal.m.f(selectedUnitName, "selectedUnitName");
                ((b1) obj5).setValue(selectedUnitName);
                ((b1) obj4).setValue(Boolean.FALSE);
                rz.e0.B((rz.b0) obj2, null, null, new kr.w(10, (o0.b) obj3, (b1) obj6, selectedUnitName, (vy.d) null), 3);
                return b0Var;
            case 17:
                List list2 = (List) obj2;
                l0.h LazyColumn4 = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn4, "$this$LazyColumn");
                LazyColumn4.q(list2.size(), new av.r(8, new lt.d(16), list2), new p0(15, list2), new t1.d(new q0(list2, (x8) obj5, (fz.c) obj6, (fz.c) obj4, (fz.c) obj3, 2), true, 802480018));
                return b0Var;
            case 18:
                ArrayList arrayList3 = (ArrayList) obj2;
                l0.h LazyColumn5 = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn5, "$this$LazyColumn");
                l0.h.p(LazyColumn5, null, new t1.d(new bp.u(15, (fz.a) obj5), true, -1837694375), 3);
                LazyColumn5.q(arrayList3.size(), null, new d1(3, arrayList3), new t1.d(new nv.j(arrayList3, (String) obj4, (fz.a) obj3, (fz.c) obj6, 0), true, 802480018));
                return b0Var;
            case 19:
                LinearLayout linearLayout2 = (LinearLayout) obj2;
                k2 k2Var = (k2) obj5;
                EditText editText2 = (EditText) obj4;
                View view4 = (View) obj6;
                kotlin.jvm.internal.m.f((View) obj, "it");
                linearLayout2.setVisibility(8);
                kotlin.jvm.internal.m.c(editText2);
                int selectionStart2 = editText2.getSelectionStart();
                String word = ((Word) obj3).getWord();
                kotlin.jvm.internal.m.e(word, "getWord(...)");
                k2Var.getClass();
                editText2.getText().insert(selectionStart2, word);
                HashMap map2 = k2Var.f48011l;
                ArrayList arrayList4 = (ArrayList) map2.get(view4);
                if (arrayList4 == null) {
                    map2.put(view4, ns.o.b(linearLayout2));
                } else {
                    arrayList4.add(linearLayout2);
                }
                return b0Var;
            case 20:
                List list3 = (List) obj2;
                List list4 = (List) obj5;
                List list5 = (List) obj4;
                final THAISyllableIntroductionActivity tHAISyllableIntroductionActivity = (THAISyllableIntroductionActivity) obj3;
                uo.a aVar3 = (uo.a) obj6;
                m0.j LazyVerticalGrid = (m0.j) obj;
                int i19 = THAISyllableIntroductionActivity.M;
                kotlin.jvm.internal.m.f(LazyVerticalGrid, "$this$LazyVerticalGrid");
                f2 f2Var = new f2(27);
                final Object[] objArr5 = objArr4 == true ? 1 : 0;
                m0.j.p(LazyVerticalGrid, f2Var, new t1.d(new fz.f() { // from class: ro.d
                    @Override // fz.f
                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        int i21 = objArr5;
                        o oVar2 = o.f58481a;
                        b0 b0Var3 = b0.f48488a;
                        THAISyllableIntroductionActivity tHAISyllableIntroductionActivity2 = tHAISyllableIntroductionActivity;
                        l item = (l) obj7;
                        n nVar2 = (n) obj8;
                        int iIntValue = ((Integer) obj9).intValue();
                        switch (i21) {
                            case 0:
                                int i22 = THAISyllableIntroductionActivity.M;
                                m.f(item, "$this$item");
                                s sVar = (s) nVar2;
                                if (!sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    sVar.W();
                                } else {
                                    u uVarA = t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                                    int iHashCode = Long.hashCode(sVar.T);
                                    q1 q1VarL = sVar.l();
                                    r rVarC = z1.a.c(sVar, oVar2);
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
                                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                                    tHAISyllableIntroductionActivity2.q(ub.a.e0(sVar, R.string.thai_alp_section_content_1), sVar, 0);
                                    tHAISyllableIntroductionActivity2.t(ub.a.e0(sVar, R.string.thai_alp_section_content_2), sVar, 0);
                                    tHAISyllableIntroductionActivity2.q(ub.a.e0(sVar, R.string.thai_alp_section_content_3), sVar, 0);
                                    tHAISyllableIntroductionActivity2.q(ub.a.e0(sVar, R.string.thai_alp_section_content_4), sVar, 0);
                                    tHAISyllableIntroductionActivity2.q(ub.a.e0(sVar, R.string.thai_alp_section_content_5), sVar, 0);
                                    ep.a.C(oVar2, 8, sVar, true);
                                }
                                break;
                            case 1:
                                int i23 = THAISyllableIntroductionActivity.M;
                                m.f(item, "$this$item");
                                s sVar2 = (s) nVar2;
                                if (!sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    sVar2.W();
                                } else {
                                    u uVarA2 = t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                                    int iHashCode2 = Long.hashCode(sVar2.T);
                                    q1 q1VarL2 = sVar2.l();
                                    r rVarC2 = z1.a.c(sVar2, oVar2);
                                    y2.k.J.getClass();
                                    y2.i iVar2 = y2.j.f56913b;
                                    sVar2.h0();
                                    if (sVar2.S) {
                                        sVar2.k(iVar2);
                                    } else {
                                        sVar2.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, uVarA2, sVar2);
                                    l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                                    y2.h hVar2 = y2.j.f56918g;
                                    if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                                    tHAISyllableIntroductionActivity2.t(ub.a.e0(sVar2, R.string.thai_alp_section_content_6), sVar2, 0);
                                    tHAISyllableIntroductionActivity2.q(ub.a.e0(sVar2, R.string.thai_alp_section_content_7), sVar2, 0);
                                    tHAISyllableIntroductionActivity2.q(ub.a.e0(sVar2, R.string.thai_alp_section_content_8), sVar2, 0);
                                    tHAISyllableIntroductionActivity2.s(ub.a.e0(sVar2, R.string.thai_alp_section_content_9), sVar2, 0);
                                    sVar2.p(true);
                                }
                                break;
                            default:
                                int i24 = THAISyllableIntroductionActivity.M;
                                m.f(item, "$this$item");
                                s sVar3 = (s) nVar2;
                                if (!sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    sVar3.W();
                                } else {
                                    tHAISyllableIntroductionActivity2.s(ub.a.e0(sVar3, R.string.thai_alp_section_content_10), sVar3, 0);
                                }
                                break;
                        }
                        return b0Var3;
                    }
                }, true, -338817077), 5);
                LazyVerticalGrid.q(list3.size(), null, null, new qu.m(4, list3), new t1.d(new ro.k(list3, tHAISyllableIntroductionActivity, aVar3, i12), true, -1117249557));
                m0.j.p(LazyVerticalGrid, new f2(28), new t1.d(new fz.f() { // from class: ro.d
                    @Override // fz.f
                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        int i21 = i13;
                        o oVar2 = o.f58481a;
                        b0 b0Var3 = b0.f48488a;
                        THAISyllableIntroductionActivity tHAISyllableIntroductionActivity2 = tHAISyllableIntroductionActivity;
                        l item = (l) obj7;
                        n nVar2 = (n) obj8;
                        int iIntValue = ((Integer) obj9).intValue();
                        switch (i21) {
                            case 0:
                                int i22 = THAISyllableIntroductionActivity.M;
                                m.f(item, "$this$item");
                                s sVar = (s) nVar2;
                                if (!sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    sVar.W();
                                } else {
                                    u uVarA = t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                                    int iHashCode = Long.hashCode(sVar.T);
                                    q1 q1VarL = sVar.l();
                                    r rVarC = z1.a.c(sVar, oVar2);
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
                                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                                    tHAISyllableIntroductionActivity2.q(ub.a.e0(sVar, R.string.thai_alp_section_content_1), sVar, 0);
                                    tHAISyllableIntroductionActivity2.t(ub.a.e0(sVar, R.string.thai_alp_section_content_2), sVar, 0);
                                    tHAISyllableIntroductionActivity2.q(ub.a.e0(sVar, R.string.thai_alp_section_content_3), sVar, 0);
                                    tHAISyllableIntroductionActivity2.q(ub.a.e0(sVar, R.string.thai_alp_section_content_4), sVar, 0);
                                    tHAISyllableIntroductionActivity2.q(ub.a.e0(sVar, R.string.thai_alp_section_content_5), sVar, 0);
                                    ep.a.C(oVar2, 8, sVar, true);
                                }
                                break;
                            case 1:
                                int i23 = THAISyllableIntroductionActivity.M;
                                m.f(item, "$this$item");
                                s sVar2 = (s) nVar2;
                                if (!sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    sVar2.W();
                                } else {
                                    u uVarA2 = t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                                    int iHashCode2 = Long.hashCode(sVar2.T);
                                    q1 q1VarL2 = sVar2.l();
                                    r rVarC2 = z1.a.c(sVar2, oVar2);
                                    y2.k.J.getClass();
                                    y2.i iVar2 = y2.j.f56913b;
                                    sVar2.h0();
                                    if (sVar2.S) {
                                        sVar2.k(iVar2);
                                    } else {
                                        sVar2.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, uVarA2, sVar2);
                                    l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                                    y2.h hVar2 = y2.j.f56918g;
                                    if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                                    tHAISyllableIntroductionActivity2.t(ub.a.e0(sVar2, R.string.thai_alp_section_content_6), sVar2, 0);
                                    tHAISyllableIntroductionActivity2.q(ub.a.e0(sVar2, R.string.thai_alp_section_content_7), sVar2, 0);
                                    tHAISyllableIntroductionActivity2.q(ub.a.e0(sVar2, R.string.thai_alp_section_content_8), sVar2, 0);
                                    tHAISyllableIntroductionActivity2.s(ub.a.e0(sVar2, R.string.thai_alp_section_content_9), sVar2, 0);
                                    sVar2.p(true);
                                }
                                break;
                            default:
                                int i24 = THAISyllableIntroductionActivity.M;
                                m.f(item, "$this$item");
                                s sVar3 = (s) nVar2;
                                if (!sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    sVar3.W();
                                } else {
                                    tHAISyllableIntroductionActivity2.s(ub.a.e0(sVar3, R.string.thai_alp_section_content_10), sVar3, 0);
                                }
                                break;
                        }
                        return b0Var3;
                    }
                }, true, 754867572), 5);
                LazyVerticalGrid.q(list4.size(), null, null, new qu.m(5, list4), new t1.d(new ro.k(list4, tHAISyllableIntroductionActivity, aVar3, objArr3 == true ? 1 : 0), true, -1117249557));
                m0.j.p(LazyVerticalGrid, new f2(29), new t1.d(new fz.f() { // from class: ro.d
                    @Override // fz.f
                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        int i21 = i12;
                        o oVar2 = o.f58481a;
                        b0 b0Var3 = b0.f48488a;
                        THAISyllableIntroductionActivity tHAISyllableIntroductionActivity2 = tHAISyllableIntroductionActivity;
                        l item = (l) obj7;
                        n nVar2 = (n) obj8;
                        int iIntValue = ((Integer) obj9).intValue();
                        switch (i21) {
                            case 0:
                                int i22 = THAISyllableIntroductionActivity.M;
                                m.f(item, "$this$item");
                                s sVar = (s) nVar2;
                                if (!sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    sVar.W();
                                } else {
                                    u uVarA = t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                                    int iHashCode = Long.hashCode(sVar.T);
                                    q1 q1VarL = sVar.l();
                                    r rVarC = z1.a.c(sVar, oVar2);
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
                                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                                    tHAISyllableIntroductionActivity2.q(ub.a.e0(sVar, R.string.thai_alp_section_content_1), sVar, 0);
                                    tHAISyllableIntroductionActivity2.t(ub.a.e0(sVar, R.string.thai_alp_section_content_2), sVar, 0);
                                    tHAISyllableIntroductionActivity2.q(ub.a.e0(sVar, R.string.thai_alp_section_content_3), sVar, 0);
                                    tHAISyllableIntroductionActivity2.q(ub.a.e0(sVar, R.string.thai_alp_section_content_4), sVar, 0);
                                    tHAISyllableIntroductionActivity2.q(ub.a.e0(sVar, R.string.thai_alp_section_content_5), sVar, 0);
                                    ep.a.C(oVar2, 8, sVar, true);
                                }
                                break;
                            case 1:
                                int i23 = THAISyllableIntroductionActivity.M;
                                m.f(item, "$this$item");
                                s sVar2 = (s) nVar2;
                                if (!sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    sVar2.W();
                                } else {
                                    u uVarA2 = t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                                    int iHashCode2 = Long.hashCode(sVar2.T);
                                    q1 q1VarL2 = sVar2.l();
                                    r rVarC2 = z1.a.c(sVar2, oVar2);
                                    y2.k.J.getClass();
                                    y2.i iVar2 = y2.j.f56913b;
                                    sVar2.h0();
                                    if (sVar2.S) {
                                        sVar2.k(iVar2);
                                    } else {
                                        sVar2.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, uVarA2, sVar2);
                                    l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                                    y2.h hVar2 = y2.j.f56918g;
                                    if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                                    tHAISyllableIntroductionActivity2.t(ub.a.e0(sVar2, R.string.thai_alp_section_content_6), sVar2, 0);
                                    tHAISyllableIntroductionActivity2.q(ub.a.e0(sVar2, R.string.thai_alp_section_content_7), sVar2, 0);
                                    tHAISyllableIntroductionActivity2.q(ub.a.e0(sVar2, R.string.thai_alp_section_content_8), sVar2, 0);
                                    tHAISyllableIntroductionActivity2.s(ub.a.e0(sVar2, R.string.thai_alp_section_content_9), sVar2, 0);
                                    sVar2.p(true);
                                }
                                break;
                            default:
                                int i24 = THAISyllableIntroductionActivity.M;
                                m.f(item, "$this$item");
                                s sVar3 = (s) nVar2;
                                if (!sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    sVar3.W();
                                } else {
                                    tHAISyllableIntroductionActivity2.s(ub.a.e0(sVar3, R.string.thai_alp_section_content_10), sVar3, 0);
                                }
                                break;
                        }
                        return b0Var3;
                    }
                }, true, -1742649261), 5);
                LazyVerticalGrid.q(list5.size(), null, null, new qu.m(3, list5), new t1.d(new ro.k(list5, tHAISyllableIntroductionActivity, aVar3, i13), true, -1117249557));
                m0.j.p(LazyVerticalGrid, new ro.e(objArr2 == true ? 1 : 0), new t1.d(new ro.f(tHAISyllableIntroductionActivity, aVar3, objArr == true ? 1 : 0), true, 54801202), 5);
                return b0Var;
            case 21:
                o3.p pVar3 = (o3.p) obj4;
                o3.w wVar3 = (o3.w) obj2;
                s0 s0Var = (s0) obj3;
                g2.t tVar = (g2.t) obj6;
                k0 k0Var = (k0) obj;
                k0Var.a();
                float fL = ((m) obj5).f3795c.l();
                if (fL != CropImageView.DEFAULT_ASPECT_RATIO) {
                    long j11 = wVar3.f44705b;
                    int i21 = j3.x0.f35822c;
                    int iS = pVar3.s((int) (j11 >> 32));
                    o1 o1VarD = s0Var.d();
                    f2.c cVarC = o1VarD != null ? o1VarD.f51124a.c(iS) : new f2.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                    float fFloor = (float) Math.floor(k0Var.e0(c1.f51011a));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f5 = fFloor / 2;
                    float f11 = cVarC.f26572a + f5;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (k0Var.f56937a.d() >> 32)) - f5;
                    if (f11 > fIntBitsToFloat) {
                        f11 = fIntBitsToFloat;
                    }
                    if (f11 >= f5) {
                        f5 = f11;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f5)) + 0.5f : (float) Math.rint(f5);
                    i2.d.F(k0Var, tVar, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(cVarC.f26573b)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(cVarC.f26575d)) & 4294967295L), fFloor, fL, 432);
                }
                return b0Var;
            default:
                l0.h LazyColumn6 = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn6, "$this$LazyColumn");
                ?? r9 = this.f3762c;
                LazyColumn6.q(r9.size(), null, new z(0, r9), new t1.d(new q0(r9, (fz.c) obj6, (fz.c) obj5, (fz.c) obj4, (fz.c) obj3), true, 2039820996));
                return b0Var;
        }
    }

    public /* synthetic */ a(fz.c cVar, Object obj, Object obj2, Object obj3, b3 b3Var, int i11) {
        this.f3760a = i11;
        this.f3761b = cVar;
        this.f3762c = obj;
        this.f3763d = obj2;
        this.f3764e = obj3;
        this.f3765f = b3Var;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f3760a = i11;
        this.f3762c = obj;
        this.f3763d = obj2;
        this.f3764e = obj3;
        this.f3765f = obj4;
        this.f3761b = obj5;
    }

    public /* synthetic */ a(List list, fz.c cVar, fz.c cVar2, fz.c cVar3, fz.c cVar4) {
        this.f3760a = 22;
        this.f3762c = list;
        this.f3761b = cVar;
        this.f3763d = cVar2;
        this.f3764e = cVar3;
        this.f3765f = cVar4;
    }

    public /* synthetic */ a(List list, Object obj, fz.c cVar, Object obj2, Object obj3, int i11) {
        this.f3760a = i11;
        this.f3762c = list;
        this.f3763d = obj;
        this.f3761b = cVar;
        this.f3764e = obj2;
        this.f3765f = obj3;
    }

    public /* synthetic */ a(List list, String str, ht.l lVar, fz.c cVar, b1 b1Var) {
        this.f3760a = 7;
        this.f3762c = list;
        this.f3763d = str;
        this.f3764e = lVar;
        this.f3761b = cVar;
        this.f3765f = b1Var;
    }
}
