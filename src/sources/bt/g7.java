package bt;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.fluent.ui.base.adapter.PdLearnSpeakAdapter;
import com.lingo.fluent.widget.WaveView;
import com.lingo.lingoskill.object.ARChar;
import com.lingo.lingoskill.object.KOCharZhuyin;
import com.lingo.lingoskill.object.Model_Sentence_010;
import com.lingo.lingoskill.object.Model_Sentence_030;
import com.lingo.lingoskill.object.PdSentence;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.speak.adapter.SpeakTryAdapter;
import com.lingo.lingoskill.ui.learn.adapter.AbsDialogModelAdapter;
import com.lingodeer.R;
import com.lingodeer.course.smarttips.data.model.Audio;
import com.lingodeer.course.smarttips.data.model.Element;
import com.lingodeer.course.smarttips.data.model.Hint;
import com.lingodeer.data.model.CourseUiState;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.chinesetone.ChineseToneLesson;
import com.yalantis.ucrop.view.CropImageView;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import rt.l9;
import rt.y9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g7 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5451f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5452t;

    public /* synthetic */ g7(CourseUiState.Success success, fz.c cVar, fz.c cVar2, fz.a aVar, fz.a aVar2, fz.a aVar3) {
        this.f5446a = 16;
        this.f5450e = success;
        this.f5449d = cVar;
        this.f5451f = cVar2;
        this.f5447b = aVar;
        this.f5448c = aVar2;
        this.f5452t = aVar3;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        js.w wVar;
        switch (this.f5446a) {
            case 0:
                fz.c cVar = (fz.c) this.f5449d;
                ht.o oVar = (ht.o) this.f5450e;
                CourseWord courseWord = (CourseWord) this.f5451f;
                l1.b1 b1Var = (l1.b1) this.f5447b;
                l1.b1 b1Var2 = (l1.b1) this.f5448c;
                fz.e eVar = (fz.e) this.f5452t;
                CourseWord it = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it, "it");
                cVar.invoke(it);
                if (!oVar.f33766o) {
                    b.X(oVar, b1Var2, eVar, b7.e0.l(it, "toString(...)"), new z6(8, b1Var));
                    b1Var.setValue(new ht.d(it.getWordId(), courseWord.getVisemedMap()));
                }
                return qy.b0.f48488a;
            case 1:
                dn.d dVar = (dn.d) this.f5449d;
                gi.d dVar2 = (gi.d) this.f5450e;
                l1.b1 b1Var3 = (l1.b1) this.f5447b;
                l1.b1 b1Var4 = (l1.b1) this.f5448c;
                l1.b1 b1Var5 = (l1.b1) this.f5451f;
                l1.b1 b1Var6 = (l1.b1) this.f5452t;
                ARChar newItem = (ARChar) obj;
                kotlin.jvm.internal.m.f(newItem, "newItem");
                if (dVar != null) {
                    int iF = dVar.f();
                    for (int i11 = 1; i11 < iF; i11++) {
                        int iA = dVar.a();
                        for (int i12 = 1; i12 < iA; i12++) {
                            ARChar aRChar = (ARChar) dVar.d(i11, i12);
                            if (kotlin.jvm.internal.m.a(aRChar.getCharacter(), newItem.getCharacter()) && kotlin.jvm.internal.m.a(aRChar.getZhuyin(), newItem.getZhuyin())) {
                                b1Var3.setValue(Integer.valueOf(i11));
                                b1Var4.setValue(Integer.valueOf(i12));
                                b1Var5.setValue(null);
                                b1Var6.setValue(null);
                                b1Var5.setValue(Integer.valueOf(i11));
                                b1Var6.setValue(Integer.valueOf(i12));
                                uz.i1 i1Var = dVar2.f29258c;
                                i1Var.l(null, gi.a.a((gi.a) i1Var.getValue(), newItem, ((gi.a) i1Var.getValue()).f29244b, null, false, CropImageView.DEFAULT_ASPECT_RATIO, false, 121));
                                dVar2.c(newItem);
                            }
                        }
                    }
                }
                return qy.b0.f48488a;
            case 2:
                dn.d dVar3 = (dn.d) this.f5449d;
                gn.e eVar2 = (gn.e) this.f5450e;
                l1.b1 b1Var7 = (l1.b1) this.f5447b;
                l1.b1 b1Var8 = (l1.b1) this.f5448c;
                l1.b1 b1Var9 = (l1.b1) this.f5451f;
                l1.b1 b1Var10 = (l1.b1) this.f5452t;
                KOCharZhuyin newItem2 = (KOCharZhuyin) obj;
                kotlin.jvm.internal.m.f(newItem2, "newItem");
                if (dVar3 != null) {
                    int iF2 = dVar3.f();
                    for (int i13 = 1; i13 < iF2; i13++) {
                        int iA2 = dVar3.a();
                        for (int i14 = 1; i14 < iA2; i14++) {
                            KOCharZhuyin kOCharZhuyin = (KOCharZhuyin) dVar3.d(i13, i14);
                            if (kotlin.jvm.internal.m.a(kOCharZhuyin.getCharacter(), newItem2.getCharacter()) && kotlin.jvm.internal.m.a(kOCharZhuyin.getZhuyin(), newItem2.getZhuyin())) {
                                b1Var7.setValue(Integer.valueOf(i13));
                                b1Var8.setValue(Integer.valueOf(i14));
                                b1Var9.setValue(Integer.valueOf(i13));
                                b1Var10.setValue(Integer.valueOf(i14));
                                uz.i1 i1Var2 = eVar2.f29324d;
                                i1Var2.l(null, gn.a.a((gn.a) i1Var2.getValue(), false, newItem2, ((gn.a) i1Var2.getValue()).f29303c, null, false, CropImageView.DEFAULT_ASPECT_RATIO, false, 121));
                                eVar2.c(newItem2);
                            }
                        }
                    }
                }
                return qy.b0.f48488a;
            case 3:
                js.t tVar = (js.t) this.f5450e;
                Context context = (Context) this.f5451f;
                xt.u uVar = (xt.u) this.f5447b;
                fz.c cVar2 = (fz.c) this.f5449d;
                fz.c cVar3 = (fz.c) this.f5448c;
                js.w wVar2 = (js.w) this.f5452t;
                l0.h LazyColumn = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                int i15 = 0;
                for (js.b0 b0Var : tVar.f36834b) {
                    if (b0Var instanceof js.a0) {
                        js.a0 a0Var = (js.a0) b0Var;
                        l0.h.p(LazyColumn, defpackage.e.h(a0Var.f36736a.getLessonId(), "single_"), new t1.d(new es.h(a0Var, context, uVar, tVar, cVar2, cVar3, 0), true, -1627546220), 2);
                        wVar = wVar2;
                    } else {
                        if (!(b0Var instanceof js.z)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        js.z zVar = (js.z) b0Var;
                        ChineseToneLesson chineseToneLesson = (ChineseToneLesson) ry.m.s0(zVar.f36857b);
                        String str = "section_" + (chineseToneLesson != null ? chineseToneLesson.getLessonId() : i15) + "_" + i15;
                        fz.c cVar4 = cVar3;
                        js.t tVar2 = tVar;
                        Context context2 = context;
                        js.w wVar3 = wVar2;
                        int i16 = i15;
                        bp.v vVar = new bp.v(zVar, wVar3, i16, cVar4, context2, tVar2);
                        cVar3 = cVar4;
                        tVar = tVar2;
                        wVar = wVar3;
                        context = context2;
                        l0.h.p(LazyColumn, str, new t1.d(vVar, true, -1534287541), 2);
                        i15 = i16 + 1;
                    }
                    wVar2 = wVar;
                    uVar = uVar;
                    cVar2 = cVar2;
                }
                return qy.b0.f48488a;
            case 4:
                PdLearnSpeakAdapter.b((PdLearnSpeakAdapter) this.f5449d, (ConstraintLayout) this.f5450e, (LinearLayout) this.f5451f, (FlexboxLayout) this.f5447b, (PdSentence) this.f5448c, (BaseViewHolder) this.f5452t, (View) obj);
                break;
            case 5:
                PdLearnSpeakAdapter.a((PdLearnSpeakAdapter) this.f5449d, (WaveView) this.f5450e, (ImageView) this.f5451f, (String) this.f5447b, (ImageView) this.f5448c, (PdSentence) this.f5452t, (View) obj);
                break;
            case 6:
                SpeakTryAdapter speakTryAdapter = (SpeakTryAdapter) this.f5449d;
                View view = (View) this.f5450e;
                String str2 = (String) this.f5451f;
                FrameLayout frameLayout = (FrameLayout) this.f5447b;
                ImageView imageView = (ImageView) this.f5448c;
                View view2 = (View) this.f5452t;
                kotlin.jvm.internal.m.f((View) obj, "it");
                speakTryAdapter.h();
                th.e eVar3 = speakTryAdapter.f22014a;
                ob.m mVar = new ob.m(speakTryAdapter, view, str2, 14);
                eVar3.getClass();
                eVar3.f52416c = mVar;
                speakTryAdapter.g(view, str2);
                eVar3.h(str2);
                frameLayout.setBackgroundResource(R.drawable.point_accent);
                android.support.v4.media.session.a.K(imageView.getBackground());
                view2.setVisibility(0);
                ij.d dVar4 = speakTryAdapter.f22023j;
                if (dVar4 != null) {
                    dVar4.d();
                }
                ij.d dVar5 = new ij.d(23);
                dVar5.f34423d = view2;
                dVar5.f34421b = 2000;
                dVar5.E();
                speakTryAdapter.f22023j = dVar5;
                break;
            case 7:
                mv.k0 k0Var = (mv.k0) this.f5450e;
                l9 l9Var = (l9) this.f5451f;
                l1.i1 i1Var3 = (l1.i1) this.f5447b;
                fz.a aVar = (fz.a) this.f5448c;
                j9.v vVar2 = (j9.v) this.f5452t;
                fz.c cVar5 = (fz.c) this.f5449d;
                j9.t NavHost = (j9.t) obj;
                kotlin.jvm.internal.m.f(NavHost, "$this$NavHost");
                c.a.g(NavHost, "syllable_test", null, null, new t1.d(new fu.d(k0Var, l9Var, i1Var3, aVar, vVar2, 2), true, 1366883186), 254);
                c.a.g(NavHost, "syllable_finish", null, null, new t1.d(new bp.b2(k0Var, aVar, cVar5, 5), true, 717766939), 254);
                break;
            case 8:
                w2.g1[] g1VarArr = (w2.g1[]) this.f5449d;
                List list = (List) this.f5450e;
                w2.s0 s0Var = (w2.s0) this.f5451f;
                kotlin.jvm.internal.w wVar4 = (kotlin.jvm.internal.w) this.f5447b;
                kotlin.jvm.internal.w wVar5 = (kotlin.jvm.internal.w) this.f5448c;
                j0.p pVar = (j0.p) this.f5452t;
                w2.f1 f1Var = (w2.f1) obj;
                int length = g1VarArr.length;
                int i17 = 0;
                int i18 = 0;
                while (i18 < length) {
                    w2.g1 g1Var = g1VarArr[i18];
                    kotlin.jvm.internal.m.d(g1Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    j0.o.b(f1Var, g1Var, (w2.p0) list.get(i17), s0Var.getLayoutDirection(), wVar4.f38359a, wVar5.f38359a, pVar.f35374a);
                    i18++;
                    i17++;
                }
                return qy.b0.f48488a;
            case 9:
                Sentence sentence = (Sentence) this.f5449d;
                Model_Sentence_010 model_Sentence_010 = (Model_Sentence_010) this.f5450e;
                AbsDialogModelAdapter absDialogModelAdapter = (AbsDialogModelAdapter) this.f5451f;
                CardView cardView = (CardView) this.f5447b;
                FlexboxLayout flexboxLayout = (FlexboxLayout) this.f5448c;
                FlexboxLayout flexboxLayout2 = (FlexboxLayout) this.f5452t;
                kotlin.jvm.internal.m.f((View) obj, "it");
                long sentenceId = sentence.getSentenceId();
                String answer = model_Sentence_010.getAnswer();
                kotlin.jvm.internal.m.e(answer, "getAnswer(...)");
                if (sentenceId == Long.parseLong(answer)) {
                    AbsDialogModelAdapter.h(absDialogModelAdapter, cardView, flexboxLayout);
                    int childCount = flexboxLayout2.getChildCount();
                    for (int i19 = 1; i19 < childCount; i19++) {
                        View childAt = flexboxLayout2.getChildAt(i19);
                        ((TextView) childAt.findViewById(R.id.tv_middle)).setVisibility(0);
                        childAt.setTag(R.id.tag_is_invisiable, Boolean.FALSE);
                    }
                } else {
                    AbsDialogModelAdapter.i(absDialogModelAdapter, cardView);
                }
                return qy.b0.f48488a;
            case 10:
                Word word = (Word) this.f5449d;
                Model_Sentence_030 model_Sentence_030 = (Model_Sentence_030) this.f5450e;
                AbsDialogModelAdapter absDialogModelAdapter2 = (AbsDialogModelAdapter) this.f5451f;
                CardView cardView2 = (CardView) this.f5447b;
                FlexboxLayout flexboxLayout3 = (FlexboxLayout) this.f5448c;
                FlexboxLayout flexboxLayout4 = (FlexboxLayout) this.f5452t;
                kotlin.jvm.internal.m.f((View) obj, "it");
                if (word.getWordId() == model_Sentence_030.getAnswerList().get(0).getWordId()) {
                    AbsDialogModelAdapter.h(absDialogModelAdapter2, cardView2, flexboxLayout3);
                    int childCount2 = flexboxLayout4.getChildCount();
                    for (int i21 = 1; i21 < childCount2; i21++) {
                        View childAt2 = flexboxLayout4.getChildAt(i21);
                        ((TextView) childAt2.findViewById(R.id.tv_middle)).setVisibility(0);
                        childAt2.setTag(R.id.tag_is_invisiable, Boolean.FALSE);
                    }
                } else {
                    AbsDialogModelAdapter.i(absDialogModelAdapter2, cardView2);
                }
                return qy.b0.f48488a;
            case 11:
                List list2 = (List) this.f5450e;
                String str3 = (String) this.f5451f;
                fz.c cVar6 = (fz.c) this.f5449d;
                rz.b0 b0Var2 = (rz.b0) this.f5447b;
                h1.e8 e8Var = (h1.e8) this.f5448c;
                fz.a aVar2 = (fz.a) this.f5452t;
                l0.h LazyColumn2 = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn2, "$this$LazyColumn");
                LazyColumn2.q(list2.size(), null, new bp.p0(14, list2), new t1.d(new mt.n(list2, str3, cVar6, b0Var2, e8Var, aVar2, list2), true, 2039820996));
                break;
            case 12:
                rt.j2 j2Var = (rt.j2) this.f5449d;
                j9.v vVar3 = (j9.v) this.f5450e;
                l1.b1 b1Var11 = (l1.b1) this.f5447b;
                l1.b1 b1Var12 = (l1.b1) this.f5448c;
                l1.b1 b1Var13 = (l1.b1) this.f5451f;
                l1.b1 b1Var14 = (l1.b1) this.f5452t;
                mt.q2 mode = (mt.q2) obj;
                kotlin.jvm.internal.m.f(mode, "mode");
                b1Var11.setValue(Boolean.FALSE);
                b1Var12.setValue(mode);
                j2Var.M = ns.o.S((List) b1Var13.getValue());
                j2Var.N = true;
                if (mt.o2.f41720a[mode.ordinal()] == 5) {
                    j9.v.b(vVar3, "test");
                } else {
                    b1Var14.setValue(mt.p2.f(mode));
                    j9.v.b(vVar3, "srs_test");
                }
                return qy.b0.f48488a;
            case 13:
                dn.d dVar6 = (dn.d) this.f5449d;
                tq.d dVar7 = (tq.d) this.f5450e;
                l1.b1 b1Var15 = (l1.b1) this.f5447b;
                l1.b1 b1Var16 = (l1.b1) this.f5448c;
                l1.b1 b1Var17 = (l1.b1) this.f5451f;
                l1.b1 b1Var18 = (l1.b1) this.f5452t;
                pq.a newItem3 = (pq.a) obj;
                kotlin.jvm.internal.m.f(newItem3, "newItem");
                if (dVar6 != null) {
                    int iF3 = dVar6.f();
                    for (int i22 = 0; i22 < iF3; i22++) {
                        int iA3 = dVar6.a();
                        for (int i23 = 0; i23 < iA3; i23++) {
                            pq.a aVar3 = (pq.a) dVar6.d(i22, i23);
                            if (kotlin.jvm.internal.m.a(aVar3.f46983a, newItem3.f46983a) && kotlin.jvm.internal.m.a(aVar3.f46984b, newItem3.f46984b) && kotlin.jvm.internal.m.a(aVar3.f46985c, newItem3.f46985c)) {
                                b1Var15.setValue(Integer.valueOf(i22));
                                b1Var16.setValue(Integer.valueOf(i23));
                                b1Var17.setValue(Integer.valueOf(i22));
                                b1Var18.setValue(Integer.valueOf(i23));
                                uz.i1 i1Var4 = dVar7.f52525c;
                                i1Var4.l(null, tq.a.a((tq.a) i1Var4.getValue(), newItem3, ((tq.a) i1Var4.getValue()).f52509b, null, false, CropImageView.DEFAULT_ASPECT_RATIO, false, 121));
                                dVar7.d(newItem3);
                            }
                        }
                    }
                }
                return qy.b0.f48488a;
            case 14:
                sv.o oVar2 = (sv.o) this.f5450e;
                l9 l9Var2 = (l9) this.f5451f;
                l1.i1 i1Var5 = (l1.i1) this.f5447b;
                fz.a aVar4 = (fz.a) this.f5448c;
                j9.v vVar4 = (j9.v) this.f5452t;
                fz.c cVar7 = (fz.c) this.f5449d;
                j9.t NavHost2 = (j9.t) obj;
                kotlin.jvm.internal.m.f(NavHost2, "$this$NavHost");
                c.a.g(NavHost2, "syllable_test", null, null, new t1.d(new fu.d(oVar2, l9Var2, i1Var5, aVar4, vVar4, 5), true, 1752534164), 254);
                c.a.g(NavHost2, "syllable_finish", null, null, new t1.d(new bp.b2(oVar2, aVar4, cVar7, 14), true, 1103417917), 254);
                break;
            case 15:
                Element element = (Element) this.f5450e;
                fz.a aVar5 = (fz.a) this.f5451f;
                HashMap map = (HashMap) this.f5447b;
                fz.c cVar8 = (fz.c) this.f5449d;
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.f5448c;
                fz.c cVar9 = (fz.c) this.f5452t;
                int iIntValue = ((Integer) obj).intValue();
                boolean z11 = false;
                for (Hint hint : element.getHints()) {
                    int from = hint.getFrom() - 1;
                    if (iIntValue < hint.getTo() + 1 && from <= iIntValue) {
                        v3.j jVar = (v3.j) map.get(hint);
                        long j11 = jVar != null ? jVar.f53492a : 0L;
                        long jA = v3.j.a((int) (Float.intBitsToFloat((int) (xVar.f38360a >> 32)) + ((int) (j11 >> 32))), (int) (Float.intBitsToFloat((int) (xVar.f38360a & 4294967295L)) + ((int) (j11 & 4294967295L))));
                        Objects.toString(cVar8);
                        cVar8.invoke(new qy.l(hint, new v3.j(jA)));
                        z11 = true;
                    }
                }
                if (!z11) {
                    aVar5.invoke();
                }
                for (Audio audio : element.getAudios()) {
                    int from2 = audio.getFrom();
                    if (iIntValue < audio.getTo() && from2 <= iIntValue) {
                        cVar9.invoke(audio.getUrl());
                    }
                }
                return qy.b0.f48488a;
            default:
                CourseUiState.Success success = (CourseUiState.Success) this.f5450e;
                fz.c cVar10 = (fz.c) this.f5449d;
                fz.c cVar11 = (fz.c) this.f5451f;
                fz.a aVar6 = (fz.a) this.f5447b;
                fz.a aVar7 = (fz.a) this.f5448c;
                fz.a aVar8 = (fz.a) this.f5452t;
                l0.h LazyColumn3 = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn3, "$this$LazyColumn");
                List<CourseUnit> courseUnits = success.getCourseUnits();
                LazyColumn3.q(courseUnits.size(), null, new qu.m(22, courseUnits), new t1.d(new et.e0(courseUnits, cVar10, success, cVar11, aVar6, aVar7, 2), true, 2039820996));
                l0.h.p(LazyColumn3, null, new t1.d(new tp.u(6, success, aVar8), true, 1668977285), 3);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ g7(Object obj, Object obj2, Object obj3, fz.c cVar, Object obj4, Object obj5, int i11) {
        this.f5446a = i11;
        this.f5450e = obj;
        this.f5451f = obj2;
        this.f5447b = obj3;
        this.f5449d = cVar;
        this.f5448c = obj4;
        this.f5452t = obj5;
    }

    public /* synthetic */ g7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11) {
        this.f5446a = i11;
        this.f5449d = obj;
        this.f5450e = obj2;
        this.f5451f = obj3;
        this.f5447b = obj4;
        this.f5448c = obj5;
        this.f5452t = obj6;
    }

    public /* synthetic */ g7(Object obj, Object obj2, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, int i11) {
        this.f5446a = i11;
        this.f5449d = obj;
        this.f5450e = obj2;
        this.f5447b = b1Var;
        this.f5448c = b1Var2;
        this.f5451f = b1Var3;
        this.f5452t = b1Var4;
    }

    public /* synthetic */ g7(List list, String str, fz.c cVar, rz.b0 b0Var, h1.e8 e8Var, fz.a aVar) {
        this.f5446a = 11;
        this.f5450e = list;
        this.f5451f = str;
        this.f5449d = cVar;
        this.f5447b = b0Var;
        this.f5448c = e8Var;
        this.f5452t = aVar;
    }

    public /* synthetic */ g7(y9 y9Var, l9 l9Var, l1.i1 i1Var, fz.a aVar, j9.v vVar, fz.c cVar, int i11) {
        this.f5446a = i11;
        this.f5450e = y9Var;
        this.f5451f = l9Var;
        this.f5447b = i1Var;
        this.f5448c = aVar;
        this.f5452t = vVar;
        this.f5449d = cVar;
    }
}
