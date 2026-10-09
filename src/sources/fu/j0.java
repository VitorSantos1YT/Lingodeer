package fu;

import a0.w1;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.ViewModelKt;
import b0.l0;
import bp.b2;
import bp.e1;
import bp.p0;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.flexbox.FlexboxLayout;
import com.google.api.Service;
import com.google.logging.type.LogSeverity;
import com.lingo.fluent.ui.base.adapter.PdLearnDetailAdapter;
import com.lingo.fluent.ui.base.adapter.PdLearnSpeakAdapter;
import com.lingo.fluent.ui.base.adapter.PdVocabularyAdapter;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.BaseReviewGroup;
import com.lingo.lingoskill.object.JPChar;
import com.lingo.lingoskill.object.PdSentence;
import com.lingo.lingoskill.object.PdWord;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.learn.adapter.AbsDialogModelAdapter;
import com.lingo.lingoskill.ui.learn.adapter.LessonFinishSummaryAdapter;
import com.lingo.splash.SplashIndexActivity;
import com.lingo.story.ui.StoryActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import dt.h2;
import hj.q6;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kv.s0;
import l1.b1;
import l1.g1;
import mt.b6;
import mt.q2;
import rt.jf;
import rt.ke;
import rt.m9;
import rt.o1;
import rt.ud;
import su.Mbl.tcppUUQxZjFdy;
import uz.i1;
import ys.o3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28124d;

    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, int i11) {
        this.f28121a = i11;
        this.f28122b = obj;
        this.f28123c = obj2;
        this.f28124d = obj3;
    }

    public /* synthetic */ j0(b1 b1Var, rz.b0 b0Var, b1 b1Var2) {
        this.f28121a = 20;
        this.f28123c = b1Var;
        this.f28122b = b0Var;
        this.f28124d = b1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x017c  */
    /* JADX WARN: Code duplicated, block: B:33:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:37:0x01e8  */
    @Override // fz.c
    public final Object invoke(Object obj) throws Throwable {
        kv.j0 j0Var;
        CardView cardView;
        FrameLayout frameLayout;
        ImageView imageView;
        Context context;
        int i11 = this.f28121a;
        int i12 = 8;
        int i13 = 4;
        Throwable th2 = null;
        final int i14 = 0;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f28124d;
        Object obj3 = this.f28123c;
        Object obj4 = this.f28122b;
        switch (i11) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                kotlin.jvm.internal.m.f(bitmap, "bitmap");
                rz.e0.B((rz.b0) obj4, null, null, new b0.g((Context) obj3, bitmap, (g0) obj2, (vy.d) null, 4), 3);
                return b0Var;
            case 1:
                j9.v vVar = (j9.v) obj4;
                l1.j0 DisposableEffect = (l1.j0) obj;
                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                gr.r rVar = new gr.r((b1) obj3, (g1) obj2);
                vVar.getClass();
                m9.g gVar = vVar.f36257b;
                gVar.getClass();
                gVar.f41084p.add(rVar);
                ry.k kVar = gVar.f41075f;
                if (!kVar.isEmpty()) {
                    j9.e eVar = (j9.e) kVar.last();
                    j9.v vVar2 = gVar.f41070a;
                    j9.q qVar = eVar.f36188b;
                    eVar.H.a();
                    rVar.a(vVar2, qVar);
                }
                return new l0(i12, vVar, rVar);
            case 2:
                ni.m mVar = (ni.m) obj3;
                com.android.billingclient.api.o it = (com.android.billingclient.api.o) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ((ur.a) obj4).c("ld_first_enter_subscribe_starttrial", new m9(26));
                i1 i1Var = mVar.O;
                i1Var.getClass();
                i1Var.l(null, it);
                mVar.a((f.n) obj2, it, "first_open");
                return b0Var;
            case 3:
                j9.v vVar3 = (j9.v) obj3;
                SplashIndexActivity splashIndexActivity = (SplashIndexActivity) obj2;
                j9.t NavHost = (j9.t) obj;
                int i15 = SplashIndexActivity.M;
                kotlin.jvm.internal.m.f(NavHost, "$this$NavHost");
                c.a.g(NavHost, "start", null, null, new t1.d(new b2(obj4, vVar3, (Object) splashIndexActivity, 3), true, 1906294754), 254);
                c.a.g(NavHost, "chooseLanguage", null, null, new t1.d(new gr.u(vVar3, splashIndexActivity, i14), true, -2136861365), 254);
                return b0Var;
            case 4:
                String str = (String) obj4;
                View view = (View) obj3;
                hh.c0 c0Var = (hh.c0) obj2;
                kotlin.jvm.internal.m.f((View) obj, "it");
                cf.x.z();
                if (gh.c.d(str)) {
                    cf.x.z();
                    gh.c.f(str);
                    ((ImageView) view.findViewById(R.id.iv_fav)).setImageResource(R.drawable.ic_pd_word_tag_un_fav);
                } else {
                    cf.x.z();
                    gh.c.b(str);
                    ((ImageView) view.findViewById(R.id.iv_fav)).setImageResource(R.drawable.ic_pd_word_tag_fav);
                    c0Var.t().c("jxz_fl_add_star_word", new fk.a(29));
                }
                return b0Var;
            case 5:
                EditText editText = (EditText) obj2;
                kotlin.jvm.internal.m.f((View) obj, "it");
                ArrayList arrayList = (ArrayList) ((hh.j0) obj4).R.get((View) obj3);
                if (arrayList != null) {
                    kotlin.jvm.internal.m.c(editText);
                    int selectionStart = editText.getSelectionStart();
                    if (selectionStart > 0) {
                        Editable text = editText.getText();
                        int size = arrayList.size();
                        int length = 0;
                        for (int i16 = 0; i16 < size; i16++) {
                            Object obj5 = arrayList.get(i16);
                            kotlin.jvm.internal.m.e(obj5, "get(...)");
                            View view2 = (View) obj5;
                            Object tag = view2.getTag();
                            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.PdWord");
                            String dictationWord = ((PdWord) tag).getDictationWord();
                            if (selectionStart <= length || selectionStart > dictationWord.length() + length) {
                                length += dictationWord.length();
                            } else {
                                text.delete(length, dictationWord.length() + length);
                                view2.setVisibility(0);
                                view2.setClickable(true);
                                arrayList.remove(view2);
                            }
                        }
                    }
                }
                return b0Var;
            case 6:
                BaseViewHolder baseViewHolder = (BaseViewHolder) obj3;
                PdWord pdWord = (PdWord) obj2;
                View itemView = (View) obj;
                kotlin.jvm.internal.m.f(itemView, "itemView");
                View itemView2 = baseViewHolder.itemView;
                kotlin.jvm.internal.m.e(itemView2, "itemView");
                kotlin.jvm.internal.m.c(pdWord);
                ((PdLearnDetailAdapter) obj4).c(itemView, itemView2, pdWord, baseViewHolder.getAdapterPosition(), true);
                return b0Var;
            case 7:
                String str2 = (String) obj4;
                PdLearnSpeakAdapter pdLearnSpeakAdapter = (PdLearnSpeakAdapter) obj3;
                ImageView imageView2 = (ImageView) obj2;
                kotlin.jvm.internal.m.f((View) obj, "it");
                if (new File(str2).exists()) {
                    pdLearnSpeakAdapter.j(false);
                    kotlin.jvm.internal.m.c(imageView2);
                    pdLearnSpeakAdapter.i(imageView2, str2);
                }
                return b0Var;
            case 8:
                PdLearnSpeakAdapter pdLearnSpeakAdapter2 = (PdLearnSpeakAdapter) obj4;
                ImageView imageView3 = (ImageView) obj3;
                kotlin.jvm.internal.m.f((View) obj, "it");
                Long sentenceId = ((PdSentence) obj2).getSentenceId();
                kotlin.jvm.internal.m.e(sentenceId, "getSentenceId(...)");
                long jLongValue = sentenceId.longValue();
                th.e eVar2 = pdLearnSpeakAdapter2.f21644f;
                String strF = xt.b.a().f();
                int[] iArr = bq.r.f4959a;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                StringBuilder sbM = com.google.android.material.datepicker.d.m(jLongValue, "pod-", bq.m.g(cf.x.n().keyLanguage), "-s-");
                sbM.append(".mp3");
                String str3 = strF + sbM.toString();
                pdLearnSpeakAdapter2.h();
                xx.f fVar = pdLearnSpeakAdapter2.f21650l;
                if (fVar != null) {
                    ux.b.a(fVar);
                }
                eVar2.m(0.96f, false);
                eVar2.h(str3);
                eVar2.f52416c = new ob.c(14, imageView3, pdLearnSpeakAdapter2);
                Drawable drawable = imageView3.getDrawable();
                kotlin.jvm.internal.m.e(drawable, "getDrawable(...)");
                if (drawable instanceof AnimationDrawable) {
                    ((AnimationDrawable) drawable).start();
                }
                return b0Var;
            case 9:
                String str4 = (String) obj4;
                ImageView imageView4 = (ImageView) obj3;
                PdVocabularyAdapter pdVocabularyAdapter = (PdVocabularyAdapter) obj2;
                kotlin.jvm.internal.m.f((View) obj, "it");
                cf.x.z();
                if (gh.c.d(str4)) {
                    cf.x.z();
                    gh.c.f(str4);
                    imageView4.setImageResource(R.drawable.ic_pd_word_tag_un_fav);
                } else {
                    cf.x.z();
                    gh.c.b(str4);
                    imageView4.setImageResource(R.drawable.ic_pd_word_tag_fav);
                    pdVocabularyAdapter.f21653b.c("jxz_fl_add_star_word", new hh.y(7));
                }
                return b0Var;
            case 10:
                mv.d0 d0Var = (mv.d0) obj4;
                mv.g0 g0Var = (mv.g0) obj3;
                j9.v vVar4 = (j9.v) obj2;
                s0 script = (s0) obj;
                kotlin.jvm.internal.m.f(script, "script");
                int i17 = iv.e0.f34712a[script.ordinal()];
                if (i17 == 1) {
                    j0Var = d0Var.f42201g;
                } else if (i17 == 2) {
                    j0Var = d0Var.f42202h;
                } else {
                    if (i17 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j0Var = null;
                }
                if (j0Var != null) {
                    g0Var.a(new mv.a0(new kv.h0(j0Var, false)));
                    j9.v.b(vVar4, "syllable_test");
                }
                return b0Var;
            case 11:
                final StoryActivity storyActivity = (StoryActivity) obj4;
                final j9.v vVar5 = (j9.v) obj3;
                final b1 b1Var = (b1) obj2;
                j9.t NavHost2 = (j9.t) obj;
                int i18 = StoryActivity.N;
                kotlin.jvm.internal.m.f(NavHost2, "$this$NavHost");
                final int i19 = 1;
                c.a.g(NavHost2, jr.a0.StoryReading.a(), null, null, new t1.d(new fz.g() { // from class: jr.f
                    @Override // fz.g
                    public final Object f(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i21 = i14;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        l1.g gVar2 = l1.m.f39353a;
                        final b1 b1Var2 = b1Var;
                        final j9.v vVar6 = vVar5;
                        final StoryActivity storyActivity2 = storyActivity;
                        a0.r composable = (a0.r) obj6;
                        j9.e it2 = (j9.e) obj7;
                        l1.n nVar = (l1.n) obj8;
                        ((Integer) obj9).getClass();
                        int i22 = StoryActivity.N;
                        kotlin.jvm.internal.m.f(composable, "$this$composable");
                        kotlin.jvm.internal.m.f(it2, "it");
                        switch (i21) {
                            case 0:
                                l1.s sVar = (l1.s) nVar;
                                Object objQ = sVar.Q();
                                if (objQ == gVar2) {
                                    objQ = new j9.a0(15);
                                    sVar.o0(objQ);
                                }
                                final int i23 = 0;
                                o3.a((fz.c) objQ, null, t1.e.d(294993514, new fz.e() { // from class: jr.d
                                    @Override // fz.e
                                    public final Object invoke(Object obj10, Object obj11) {
                                        int i24 = i23;
                                        qy.b0 b0Var3 = qy.b0.f48488a;
                                        l1.g gVar3 = l1.m.f39353a;
                                        b1 b1Var3 = b1Var2;
                                        j9.v vVar7 = vVar6;
                                        StoryActivity storyActivity3 = storyActivity2;
                                        switch (i24) {
                                            case 0:
                                                l1.n nVar2 = (l1.n) obj10;
                                                int iIntValue = ((Integer) obj11).intValue();
                                                int i25 = StoryActivity.N;
                                                l1.s sVar2 = (l1.s) nVar2;
                                                if (!sVar2.T(1 & iIntValue, (iIntValue & 3) != 2)) {
                                                    sVar2.W();
                                                } else {
                                                    int iP = storyActivity3.p();
                                                    long jLongValue2 = ((Number) storyActivity3.H.getValue()).longValue();
                                                    boolean zH = sVar2.h(vVar7);
                                                    Object objQ2 = sVar2.Q();
                                                    if (zH || objQ2 == gVar3) {
                                                        objQ2 = new ch.b0(vVar7, 20);
                                                        sVar2.o0(objQ2);
                                                    }
                                                    fz.e eVar3 = (fz.e) objQ2;
                                                    boolean zH2 = sVar2.h(storyActivity3);
                                                    Object objQ3 = sVar2.Q();
                                                    if (zH2 || objQ3 == gVar3) {
                                                        objQ3 = new b(storyActivity3, 6);
                                                        sVar2.o0(objQ3);
                                                    }
                                                    fz.a aVar = (fz.a) objQ3;
                                                    Object objQ4 = sVar2.Q();
                                                    if (objQ4 == gVar3) {
                                                        objQ4 = new bp.s(b1Var3, 3, (byte) 0);
                                                        sVar2.o0(objQ4);
                                                    }
                                                    z.d(iP, jLongValue2, eVar3, aVar, (fz.e) objQ4, null, sVar2, 24576);
                                                }
                                                break;
                                            default:
                                                l1.n nVar3 = (l1.n) obj10;
                                                int iIntValue2 = ((Integer) obj11).intValue();
                                                int i26 = StoryActivity.N;
                                                l1.s sVar3 = (l1.s) nVar3;
                                                if (!sVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    sVar3.W();
                                                } else {
                                                    int iP2 = storyActivity3.p();
                                                    boolean zH3 = sVar3.h(storyActivity3);
                                                    Object objQ5 = sVar3.Q();
                                                    if (zH3 || objQ5 == gVar3) {
                                                        objQ5 = new b(storyActivity3, 5);
                                                        sVar3.o0(objQ5);
                                                    }
                                                    fz.a aVar2 = (fz.a) objQ5;
                                                    Object objQ6 = sVar3.Q();
                                                    if (objQ6 == gVar3) {
                                                        objQ6 = new h2(17, b1Var3);
                                                        sVar3.o0(objQ6);
                                                    }
                                                    fz.a aVar3 = (fz.a) objQ6;
                                                    boolean zH4 = sVar3.h(vVar7);
                                                    Object objQ7 = sVar3.Q();
                                                    if (zH4 || objQ7 == gVar3) {
                                                        objQ7 = new j9.g(vVar7, 4);
                                                        sVar3.o0(objQ7);
                                                    }
                                                    a.q(iP2, null, aVar2, aVar3, (fz.a) objQ7, sVar3, 3072);
                                                }
                                                break;
                                        }
                                        return b0Var3;
                                    }
                                }, sVar), sVar, 390);
                                break;
                            default:
                                l1.s sVar2 = (l1.s) nVar;
                                Object objQ2 = sVar2.Q();
                                if (objQ2 == gVar2) {
                                    objQ2 = new j9.a0(15);
                                    sVar2.o0(objQ2);
                                }
                                final int i24 = 1;
                                o3.a((fz.c) objQ2, null, t1.e.d(-914695149, new fz.e() { // from class: jr.d
                                    @Override // fz.e
                                    public final Object invoke(Object obj10, Object obj11) {
                                        int i25 = i24;
                                        qy.b0 b0Var3 = qy.b0.f48488a;
                                        l1.g gVar3 = l1.m.f39353a;
                                        b1 b1Var3 = b1Var2;
                                        j9.v vVar7 = vVar6;
                                        StoryActivity storyActivity3 = storyActivity2;
                                        switch (i25) {
                                            case 0:
                                                l1.n nVar2 = (l1.n) obj10;
                                                int iIntValue = ((Integer) obj11).intValue();
                                                int i26 = StoryActivity.N;
                                                l1.s sVar3 = (l1.s) nVar2;
                                                if (!sVar3.T(1 & iIntValue, (iIntValue & 3) != 2)) {
                                                    sVar3.W();
                                                } else {
                                                    int iP = storyActivity3.p();
                                                    long jLongValue2 = ((Number) storyActivity3.H.getValue()).longValue();
                                                    boolean zH = sVar3.h(vVar7);
                                                    Object objQ3 = sVar3.Q();
                                                    if (zH || objQ3 == gVar3) {
                                                        objQ3 = new ch.b0(vVar7, 20);
                                                        sVar3.o0(objQ3);
                                                    }
                                                    fz.e eVar3 = (fz.e) objQ3;
                                                    boolean zH2 = sVar3.h(storyActivity3);
                                                    Object objQ4 = sVar3.Q();
                                                    if (zH2 || objQ4 == gVar3) {
                                                        objQ4 = new b(storyActivity3, 6);
                                                        sVar3.o0(objQ4);
                                                    }
                                                    fz.a aVar = (fz.a) objQ4;
                                                    Object objQ5 = sVar3.Q();
                                                    if (objQ5 == gVar3) {
                                                        objQ5 = new bp.s(b1Var3, 3, (byte) 0);
                                                        sVar3.o0(objQ5);
                                                    }
                                                    z.d(iP, jLongValue2, eVar3, aVar, (fz.e) objQ5, null, sVar3, 24576);
                                                }
                                                break;
                                            default:
                                                l1.n nVar3 = (l1.n) obj10;
                                                int iIntValue2 = ((Integer) obj11).intValue();
                                                int i27 = StoryActivity.N;
                                                l1.s sVar4 = (l1.s) nVar3;
                                                if (!sVar4.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    sVar4.W();
                                                } else {
                                                    int iP2 = storyActivity3.p();
                                                    boolean zH3 = sVar4.h(storyActivity3);
                                                    Object objQ6 = sVar4.Q();
                                                    if (zH3 || objQ6 == gVar3) {
                                                        objQ6 = new b(storyActivity3, 5);
                                                        sVar4.o0(objQ6);
                                                    }
                                                    fz.a aVar2 = (fz.a) objQ6;
                                                    Object objQ7 = sVar4.Q();
                                                    if (objQ7 == gVar3) {
                                                        objQ7 = new h2(17, b1Var3);
                                                        sVar4.o0(objQ7);
                                                    }
                                                    fz.a aVar3 = (fz.a) objQ7;
                                                    boolean zH4 = sVar4.h(vVar7);
                                                    Object objQ8 = sVar4.Q();
                                                    if (zH4 || objQ8 == gVar3) {
                                                        objQ8 = new j9.g(vVar7, 4);
                                                        sVar4.o0(objQ8);
                                                    }
                                                    a.q(iP2, null, aVar2, aVar3, (fz.a) objQ8, sVar4, 3072);
                                                }
                                                break;
                                        }
                                        return b0Var3;
                                    }
                                }, sVar2), sVar2, 390);
                                break;
                        }
                        return b0Var2;
                    }
                }, true, -1547583610), 254);
                c.a.g(NavHost2, jr.a0.StorySpeaking.a(), null, null, new t1.d(new fz.g() { // from class: jr.f
                    @Override // fz.g
                    public final Object f(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i21 = i19;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        l1.g gVar2 = l1.m.f39353a;
                        final b1 b1Var2 = b1Var;
                        final j9.v vVar6 = vVar5;
                        final StoryActivity storyActivity2 = storyActivity;
                        a0.r composable = (a0.r) obj6;
                        j9.e it2 = (j9.e) obj7;
                        l1.n nVar = (l1.n) obj8;
                        ((Integer) obj9).getClass();
                        int i22 = StoryActivity.N;
                        kotlin.jvm.internal.m.f(composable, "$this$composable");
                        kotlin.jvm.internal.m.f(it2, "it");
                        switch (i21) {
                            case 0:
                                l1.s sVar = (l1.s) nVar;
                                Object objQ = sVar.Q();
                                if (objQ == gVar2) {
                                    objQ = new j9.a0(15);
                                    sVar.o0(objQ);
                                }
                                final int i23 = 0;
                                o3.a((fz.c) objQ, null, t1.e.d(294993514, new fz.e() { // from class: jr.d
                                    @Override // fz.e
                                    public final Object invoke(Object obj10, Object obj11) {
                                        int i25 = i23;
                                        qy.b0 b0Var3 = qy.b0.f48488a;
                                        l1.g gVar3 = l1.m.f39353a;
                                        b1 b1Var3 = b1Var2;
                                        j9.v vVar7 = vVar6;
                                        StoryActivity storyActivity3 = storyActivity2;
                                        switch (i25) {
                                            case 0:
                                                l1.n nVar2 = (l1.n) obj10;
                                                int iIntValue = ((Integer) obj11).intValue();
                                                int i26 = StoryActivity.N;
                                                l1.s sVar3 = (l1.s) nVar2;
                                                if (!sVar3.T(1 & iIntValue, (iIntValue & 3) != 2)) {
                                                    sVar3.W();
                                                } else {
                                                    int iP = storyActivity3.p();
                                                    long jLongValue2 = ((Number) storyActivity3.H.getValue()).longValue();
                                                    boolean zH = sVar3.h(vVar7);
                                                    Object objQ3 = sVar3.Q();
                                                    if (zH || objQ3 == gVar3) {
                                                        objQ3 = new ch.b0(vVar7, 20);
                                                        sVar3.o0(objQ3);
                                                    }
                                                    fz.e eVar3 = (fz.e) objQ3;
                                                    boolean zH2 = sVar3.h(storyActivity3);
                                                    Object objQ4 = sVar3.Q();
                                                    if (zH2 || objQ4 == gVar3) {
                                                        objQ4 = new b(storyActivity3, 6);
                                                        sVar3.o0(objQ4);
                                                    }
                                                    fz.a aVar = (fz.a) objQ4;
                                                    Object objQ5 = sVar3.Q();
                                                    if (objQ5 == gVar3) {
                                                        objQ5 = new bp.s(b1Var3, 3, (byte) 0);
                                                        sVar3.o0(objQ5);
                                                    }
                                                    z.d(iP, jLongValue2, eVar3, aVar, (fz.e) objQ5, null, sVar3, 24576);
                                                }
                                                break;
                                            default:
                                                l1.n nVar3 = (l1.n) obj10;
                                                int iIntValue2 = ((Integer) obj11).intValue();
                                                int i27 = StoryActivity.N;
                                                l1.s sVar4 = (l1.s) nVar3;
                                                if (!sVar4.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    sVar4.W();
                                                } else {
                                                    int iP2 = storyActivity3.p();
                                                    boolean zH3 = sVar4.h(storyActivity3);
                                                    Object objQ6 = sVar4.Q();
                                                    if (zH3 || objQ6 == gVar3) {
                                                        objQ6 = new b(storyActivity3, 5);
                                                        sVar4.o0(objQ6);
                                                    }
                                                    fz.a aVar2 = (fz.a) objQ6;
                                                    Object objQ7 = sVar4.Q();
                                                    if (objQ7 == gVar3) {
                                                        objQ7 = new h2(17, b1Var3);
                                                        sVar4.o0(objQ7);
                                                    }
                                                    fz.a aVar3 = (fz.a) objQ7;
                                                    boolean zH4 = sVar4.h(vVar7);
                                                    Object objQ8 = sVar4.Q();
                                                    if (zH4 || objQ8 == gVar3) {
                                                        objQ8 = new j9.g(vVar7, 4);
                                                        sVar4.o0(objQ8);
                                                    }
                                                    a.q(iP2, null, aVar2, aVar3, (fz.a) objQ8, sVar4, 3072);
                                                }
                                                break;
                                        }
                                        return b0Var3;
                                    }
                                }, sVar), sVar, 390);
                                break;
                            default:
                                l1.s sVar2 = (l1.s) nVar;
                                Object objQ2 = sVar2.Q();
                                if (objQ2 == gVar2) {
                                    objQ2 = new j9.a0(15);
                                    sVar2.o0(objQ2);
                                }
                                final int i24 = 1;
                                o3.a((fz.c) objQ2, null, t1.e.d(-914695149, new fz.e() { // from class: jr.d
                                    @Override // fz.e
                                    public final Object invoke(Object obj10, Object obj11) {
                                        int i25 = i24;
                                        qy.b0 b0Var3 = qy.b0.f48488a;
                                        l1.g gVar3 = l1.m.f39353a;
                                        b1 b1Var3 = b1Var2;
                                        j9.v vVar7 = vVar6;
                                        StoryActivity storyActivity3 = storyActivity2;
                                        switch (i25) {
                                            case 0:
                                                l1.n nVar2 = (l1.n) obj10;
                                                int iIntValue = ((Integer) obj11).intValue();
                                                int i26 = StoryActivity.N;
                                                l1.s sVar3 = (l1.s) nVar2;
                                                if (!sVar3.T(1 & iIntValue, (iIntValue & 3) != 2)) {
                                                    sVar3.W();
                                                } else {
                                                    int iP = storyActivity3.p();
                                                    long jLongValue2 = ((Number) storyActivity3.H.getValue()).longValue();
                                                    boolean zH = sVar3.h(vVar7);
                                                    Object objQ3 = sVar3.Q();
                                                    if (zH || objQ3 == gVar3) {
                                                        objQ3 = new ch.b0(vVar7, 20);
                                                        sVar3.o0(objQ3);
                                                    }
                                                    fz.e eVar3 = (fz.e) objQ3;
                                                    boolean zH2 = sVar3.h(storyActivity3);
                                                    Object objQ4 = sVar3.Q();
                                                    if (zH2 || objQ4 == gVar3) {
                                                        objQ4 = new b(storyActivity3, 6);
                                                        sVar3.o0(objQ4);
                                                    }
                                                    fz.a aVar = (fz.a) objQ4;
                                                    Object objQ5 = sVar3.Q();
                                                    if (objQ5 == gVar3) {
                                                        objQ5 = new bp.s(b1Var3, 3, (byte) 0);
                                                        sVar3.o0(objQ5);
                                                    }
                                                    z.d(iP, jLongValue2, eVar3, aVar, (fz.e) objQ5, null, sVar3, 24576);
                                                }
                                                break;
                                            default:
                                                l1.n nVar3 = (l1.n) obj10;
                                                int iIntValue2 = ((Integer) obj11).intValue();
                                                int i27 = StoryActivity.N;
                                                l1.s sVar4 = (l1.s) nVar3;
                                                if (!sVar4.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    sVar4.W();
                                                } else {
                                                    int iP2 = storyActivity3.p();
                                                    boolean zH3 = sVar4.h(storyActivity3);
                                                    Object objQ6 = sVar4.Q();
                                                    if (zH3 || objQ6 == gVar3) {
                                                        objQ6 = new b(storyActivity3, 5);
                                                        sVar4.o0(objQ6);
                                                    }
                                                    fz.a aVar2 = (fz.a) objQ6;
                                                    Object objQ7 = sVar4.Q();
                                                    if (objQ7 == gVar3) {
                                                        objQ7 = new h2(17, b1Var3);
                                                        sVar4.o0(objQ7);
                                                    }
                                                    fz.a aVar3 = (fz.a) objQ7;
                                                    boolean zH4 = sVar4.h(vVar7);
                                                    Object objQ8 = sVar4.Q();
                                                    if (zH4 || objQ8 == gVar3) {
                                                        objQ8 = new j9.g(vVar7, 4);
                                                        sVar4.o0(objQ8);
                                                    }
                                                    a.q(iP2, null, aVar2, aVar3, (fz.a) objQ8, sVar4, 3072);
                                                }
                                                break;
                                        }
                                        return b0Var3;
                                    }
                                }, sVar2), sVar2, 390);
                                break;
                        }
                        return b0Var2;
                    }
                }, true, -2104785361), 254);
                c.a.g(NavHost2, jr.a0.StoryLeaderboard.a(), null, null, new t1.d(new bt.t(storyActivity, 3), true, 1845266190), 254);
                c.a.g(NavHost2, jr.a0.StoryReadingFinish.a(), null, null, new t1.d(new fz.g() { // from class: jr.c
                    @Override // fz.g
                    public final Object f(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i21 = i14;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        l1.g gVar2 = l1.m.f39353a;
                        j9.v vVar6 = vVar5;
                        final StoryActivity storyActivity2 = storyActivity;
                        switch (i21) {
                            case 0:
                                a0.r composable = (a0.r) obj6;
                                j9.e it2 = (j9.e) obj7;
                                ((Integer) obj9).getClass();
                                int i22 = StoryActivity.N;
                                kotlin.jvm.internal.m.f(composable, "$this$composable");
                                kotlin.jvm.internal.m.f(it2, "it");
                                long jLongValue2 = ((Number) storyActivity2.H.getValue()).longValue();
                                int iP = storyActivity2.p();
                                l1.s sVar = (l1.s) ((l1.n) obj8);
                                boolean zH = sVar.h(vVar6);
                                Object objQ = sVar.Q();
                                if (zH || objQ == gVar2) {
                                    objQ = new j9.g(vVar6, 3);
                                    sVar.o0(objQ);
                                }
                                fz.a aVar = (fz.a) objQ;
                                boolean zH2 = sVar.h(storyActivity2);
                                Object objQ2 = sVar.Q();
                                if (zH2 || objQ2 == gVar2) {
                                    final int i23 = 1;
                                    objQ2 = new fz.c() { // from class: jr.e
                                        @Override // fz.c
                                        public final Object invoke(Object obj10) {
                                            int i24 = i23;
                                            qy.b0 b0Var3 = qy.b0.f48488a;
                                            StoryActivity storyActivity3 = storyActivity2;
                                            int iIntValue = ((Integer) obj10).intValue();
                                            switch (i24) {
                                                case 0:
                                                    int i25 = StoryActivity.N;
                                                    Intent intent = new Intent(storyActivity3, (Class<?>) LoginActivity.class);
                                                    intent.putExtra(INTENTS.EXTRA_INT, iIntValue);
                                                    storyActivity3.startActivity(intent);
                                                    break;
                                                default:
                                                    int i26 = StoryActivity.N;
                                                    Intent intent2 = new Intent(storyActivity3, (Class<?>) LoginActivity.class);
                                                    intent2.putExtra(INTENTS.EXTRA_INT, iIntValue);
                                                    storyActivity3.startActivity(intent2);
                                                    break;
                                            }
                                            return b0Var3;
                                        }
                                    };
                                    sVar.o0(objQ2);
                                }
                                a.i(jLongValue2, iP, aVar, (fz.c) objQ2, null, sVar, 0);
                                break;
                            default:
                                a0.r composable2 = (a0.r) obj6;
                                j9.e it3 = (j9.e) obj7;
                                ((Integer) obj9).getClass();
                                int i24 = StoryActivity.N;
                                kotlin.jvm.internal.m.f(composable2, "$this$composable");
                                kotlin.jvm.internal.m.f(it3, "it");
                                long jLongValue3 = ((Number) storyActivity2.H.getValue()).longValue();
                                int iP2 = storyActivity2.p();
                                l1.s sVar2 = (l1.s) ((l1.n) obj8);
                                boolean zH3 = sVar2.h(storyActivity2);
                                Object objQ3 = sVar2.Q();
                                if (zH3 || objQ3 == gVar2) {
                                    objQ3 = new b(storyActivity2, 2);
                                    sVar2.o0(objQ3);
                                }
                                fz.a aVar2 = (fz.a) objQ3;
                                boolean zH4 = sVar2.h(vVar6);
                                Object objQ4 = sVar2.Q();
                                if (zH4 || objQ4 == gVar2) {
                                    objQ4 = new j9.g(vVar6, 2);
                                    sVar2.o0(objQ4);
                                }
                                fz.a aVar3 = (fz.a) objQ4;
                                boolean zH5 = sVar2.h(storyActivity2);
                                Object objQ5 = sVar2.Q();
                                if (zH5 || objQ5 == gVar2) {
                                    objQ5 = new b(storyActivity2, 3);
                                    sVar2.o0(objQ5);
                                }
                                fz.a aVar4 = (fz.a) objQ5;
                                boolean zH6 = sVar2.h(storyActivity2);
                                Object objQ6 = sVar2.Q();
                                if (zH6 || objQ6 == gVar2) {
                                    final int i25 = 0;
                                    objQ6 = new fz.c() { // from class: jr.e
                                        @Override // fz.c
                                        public final Object invoke(Object obj10) {
                                            int i26 = i25;
                                            qy.b0 b0Var3 = qy.b0.f48488a;
                                            StoryActivity storyActivity3 = storyActivity2;
                                            int iIntValue = ((Integer) obj10).intValue();
                                            switch (i26) {
                                                case 0:
                                                    int i27 = StoryActivity.N;
                                                    Intent intent = new Intent(storyActivity3, (Class<?>) LoginActivity.class);
                                                    intent.putExtra(INTENTS.EXTRA_INT, iIntValue);
                                                    storyActivity3.startActivity(intent);
                                                    break;
                                                default:
                                                    int i28 = StoryActivity.N;
                                                    Intent intent2 = new Intent(storyActivity3, (Class<?>) LoginActivity.class);
                                                    intent2.putExtra(INTENTS.EXTRA_INT, iIntValue);
                                                    storyActivity3.startActivity(intent2);
                                                    break;
                                            }
                                            return b0Var3;
                                        }
                                    };
                                    sVar2.o0(objQ6);
                                }
                                a.m(jLongValue3, iP2, null, aVar2, aVar3, aVar4, (fz.c) objQ6, sVar2, 0);
                                break;
                        }
                        return b0Var2;
                    }
                }, true, 1500350445), 254);
                c.a.g(NavHost2, jr.a0.StorySpeakingFinish.a(), null, null, new t1.d(new fz.g() { // from class: jr.c
                    @Override // fz.g
                    public final Object f(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i21 = i19;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        l1.g gVar2 = l1.m.f39353a;
                        j9.v vVar6 = vVar5;
                        final StoryActivity storyActivity2 = storyActivity;
                        switch (i21) {
                            case 0:
                                a0.r composable = (a0.r) obj6;
                                j9.e it2 = (j9.e) obj7;
                                ((Integer) obj9).getClass();
                                int i22 = StoryActivity.N;
                                kotlin.jvm.internal.m.f(composable, "$this$composable");
                                kotlin.jvm.internal.m.f(it2, "it");
                                long jLongValue2 = ((Number) storyActivity2.H.getValue()).longValue();
                                int iP = storyActivity2.p();
                                l1.s sVar = (l1.s) ((l1.n) obj8);
                                boolean zH = sVar.h(vVar6);
                                Object objQ = sVar.Q();
                                if (zH || objQ == gVar2) {
                                    objQ = new j9.g(vVar6, 3);
                                    sVar.o0(objQ);
                                }
                                fz.a aVar = (fz.a) objQ;
                                boolean zH2 = sVar.h(storyActivity2);
                                Object objQ2 = sVar.Q();
                                if (zH2 || objQ2 == gVar2) {
                                    final int i23 = 1;
                                    objQ2 = new fz.c() { // from class: jr.e
                                        @Override // fz.c
                                        public final Object invoke(Object obj10) {
                                            int i26 = i23;
                                            qy.b0 b0Var3 = qy.b0.f48488a;
                                            StoryActivity storyActivity3 = storyActivity2;
                                            int iIntValue = ((Integer) obj10).intValue();
                                            switch (i26) {
                                                case 0:
                                                    int i27 = StoryActivity.N;
                                                    Intent intent = new Intent(storyActivity3, (Class<?>) LoginActivity.class);
                                                    intent.putExtra(INTENTS.EXTRA_INT, iIntValue);
                                                    storyActivity3.startActivity(intent);
                                                    break;
                                                default:
                                                    int i28 = StoryActivity.N;
                                                    Intent intent2 = new Intent(storyActivity3, (Class<?>) LoginActivity.class);
                                                    intent2.putExtra(INTENTS.EXTRA_INT, iIntValue);
                                                    storyActivity3.startActivity(intent2);
                                                    break;
                                            }
                                            return b0Var3;
                                        }
                                    };
                                    sVar.o0(objQ2);
                                }
                                a.i(jLongValue2, iP, aVar, (fz.c) objQ2, null, sVar, 0);
                                break;
                            default:
                                a0.r composable2 = (a0.r) obj6;
                                j9.e it3 = (j9.e) obj7;
                                ((Integer) obj9).getClass();
                                int i24 = StoryActivity.N;
                                kotlin.jvm.internal.m.f(composable2, "$this$composable");
                                kotlin.jvm.internal.m.f(it3, "it");
                                long jLongValue3 = ((Number) storyActivity2.H.getValue()).longValue();
                                int iP2 = storyActivity2.p();
                                l1.s sVar2 = (l1.s) ((l1.n) obj8);
                                boolean zH3 = sVar2.h(storyActivity2);
                                Object objQ3 = sVar2.Q();
                                if (zH3 || objQ3 == gVar2) {
                                    objQ3 = new b(storyActivity2, 2);
                                    sVar2.o0(objQ3);
                                }
                                fz.a aVar2 = (fz.a) objQ3;
                                boolean zH4 = sVar2.h(vVar6);
                                Object objQ4 = sVar2.Q();
                                if (zH4 || objQ4 == gVar2) {
                                    objQ4 = new j9.g(vVar6, 2);
                                    sVar2.o0(objQ4);
                                }
                                fz.a aVar3 = (fz.a) objQ4;
                                boolean zH5 = sVar2.h(storyActivity2);
                                Object objQ5 = sVar2.Q();
                                if (zH5 || objQ5 == gVar2) {
                                    objQ5 = new b(storyActivity2, 3);
                                    sVar2.o0(objQ5);
                                }
                                fz.a aVar4 = (fz.a) objQ5;
                                boolean zH6 = sVar2.h(storyActivity2);
                                Object objQ6 = sVar2.Q();
                                if (zH6 || objQ6 == gVar2) {
                                    final int i25 = 0;
                                    objQ6 = new fz.c() { // from class: jr.e
                                        @Override // fz.c
                                        public final Object invoke(Object obj10) {
                                            int i26 = i25;
                                            qy.b0 b0Var3 = qy.b0.f48488a;
                                            StoryActivity storyActivity3 = storyActivity2;
                                            int iIntValue = ((Integer) obj10).intValue();
                                            switch (i26) {
                                                case 0:
                                                    int i27 = StoryActivity.N;
                                                    Intent intent = new Intent(storyActivity3, (Class<?>) LoginActivity.class);
                                                    intent.putExtra(INTENTS.EXTRA_INT, iIntValue);
                                                    storyActivity3.startActivity(intent);
                                                    break;
                                                default:
                                                    int i28 = StoryActivity.N;
                                                    Intent intent2 = new Intent(storyActivity3, (Class<?>) LoginActivity.class);
                                                    intent2.putExtra(INTENTS.EXTRA_INT, iIntValue);
                                                    storyActivity3.startActivity(intent2);
                                                    break;
                                            }
                                            return b0Var3;
                                        }
                                    };
                                    sVar2.o0(objQ6);
                                }
                                a.m(jLongValue3, iP2, null, aVar2, aVar3, aVar4, (fz.c) objQ6, sVar2, 0);
                                break;
                        }
                        return b0Var2;
                    }
                }, true, 1155434700), 254);
                return b0Var;
            case 12:
                x1.p pVar = (x1.p) obj4;
                j9.e eVar3 = (j9.e) obj3;
                pVar.add(eVar3);
                return new a0.i((k9.o) obj2, eVar3, pVar);
            case 13:
                AbsDialogModelAdapter absDialogModelAdapter = (AbsDialogModelAdapter) obj4;
                BaseViewHolder baseViewHolder2 = (BaseViewHolder) obj3;
                Sentence sentence = (Sentence) obj2;
                kotlin.jvm.internal.m.f((View) obj, "it");
                if (!absDialogModelAdapter.f22061j) {
                    View itemView3 = baseViewHolder2.itemView;
                    kotlin.jvm.internal.m.e(itemView3, "itemView");
                    absDialogModelAdapter.l(itemView3, sentence);
                }
                return b0Var;
            case 14:
                AbsDialogModelAdapter.a((AbsDialogModelAdapter) obj4, (BaseViewHolder) obj3, (Word) obj2, (View) obj);
                return b0Var;
            case 15:
                HashMap map = (HashMap) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                FlexboxLayout flexboxLayout = (FlexboxLayout) obj2;
                kotlin.jvm.internal.m.f((View) obj, "it");
                if (!map.isEmpty()) {
                    Object obj6 = arrayList2.get(0);
                    kotlin.jvm.internal.m.e(obj6, "get(...)");
                    View view3 = (View) obj6;
                    Object tag2 = view3.getTag();
                    kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                    Word word = (Word) tag2;
                    Integer num = (Integer) map.get(view3);
                    int iIntValue = num != null ? num.intValue() : 1;
                    String word2 = word.getWord();
                    int childCount = flexboxLayout.getChildCount();
                    for (int i21 = 0; i21 < childCount; i21++) {
                        View childAt = flexboxLayout.getChildAt(i21);
                        Object tag3 = childAt.getTag();
                        kotlin.jvm.internal.m.d(tag3, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                        Word word3 = (Word) tag3;
                        if (childAt.isEnabled()) {
                            String word4 = word3.getWord();
                            kotlin.jvm.internal.m.e(word4, "getWord(...)");
                            Locale ROOT = Locale.ROOT;
                            kotlin.jvm.internal.m.e(ROOT, "ROOT");
                            String lowerCase = word4.toLowerCase(ROOT);
                            kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                            String lowerCase2 = String.valueOf(word2.charAt(iIntValue - 1)).toLowerCase(ROOT);
                            kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                            if (lowerCase.equals(lowerCase2)) {
                                childAt.setScaleX(1.0f);
                                childAt.setScaleY(1.0f);
                                LinearInterpolator linearInterpolator = new LinearInterpolator();
                                kp.g gVar2 = new kp.g(0);
                                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(childAt, PropertyValuesHolder.ofFloat("scaleX", 0.8f), PropertyValuesHolder.ofFloat("scaleY", 0.8f));
                                objectAnimatorOfPropertyValuesHolder.setDuration(LogSeverity.NOTICE_VALUE);
                                objectAnimatorOfPropertyValuesHolder.setRepeatMode(2);
                                objectAnimatorOfPropertyValuesHolder.setRepeatCount(3);
                                objectAnimatorOfPropertyValuesHolder.setInterpolator(linearInterpolator);
                                objectAnimatorOfPropertyValuesHolder.addListener(gVar2);
                                objectAnimatorOfPropertyValuesHolder.start();
                            }
                        }
                    }
                }
                return b0Var;
            case 16:
                LessonFinishSummaryAdapter lessonFinishSummaryAdapter = (LessonFinishSummaryAdapter) obj2;
                kotlin.jvm.internal.m.f((View) obj, "it");
                int layoutPosition = ((BaseViewHolder) obj4).getLayoutPosition();
                if (((BaseReviewGroup) obj3).isExpanded()) {
                    lessonFinishSummaryAdapter.collapse(layoutPosition, false);
                } else {
                    lessonFinishSummaryAdapter.expand(layoutPosition, false);
                }
                return b0Var;
            case 17:
                int i22 = 1;
                jf jfVar = (jf) obj4;
                fz.c cVar = (fz.c) obj3;
                b1 b1Var2 = (b1) obj2;
                l0.h LazyColumn = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                if (jfVar.f49952e) {
                    l0.h.p(LazyColumn, null, new t1.d(new lt.c(jfVar, i22), true, -1226437642), 3);
                }
                List list = jfVar.f49948a;
                LazyColumn.q(list.size(), new av.r(5, new lt.d(i14), list), new p0(12, list), new t1.d(new iv.v(list, cVar, b1Var2, 1), true, 802480018));
                l0.h.p(LazyColumn, null, lt.b.f40308d, 3);
                return b0Var;
            case 18:
                List list2 = (List) obj4;
                l0.h LazyColumn2 = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn2, "$this$LazyColumn");
                LazyColumn2.q(list2.size(), new av.r(6, new lt.d(14), list2), new p0(13, list2), new t1.d(new dl.n(list2, (String) obj3, (b1) obj2, 3), true, 802480018));
                return b0Var;
            case 19:
                mt.c cVar2 = (mt.c) obj4;
                fz.c cVar3 = (fz.c) obj3;
                fz.e eVar4 = (fz.e) obj2;
                String name = (String) obj;
                kotlin.jvm.internal.m.f(name, "name");
                if (kotlin.jvm.internal.m.a(cVar2, mt.a.f41222a)) {
                    cVar3.invoke(name);
                } else {
                    if (!(cVar2 instanceof mt.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar4.invoke(((mt.b) cVar2).f41265a, name);
                }
                return b0Var;
            case 20:
                b1 b1Var3 = (b1) obj3;
                l0.h LazyColumn3 = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn3, "$this$LazyColumn");
                List list3 = (List) b1Var3.getValue();
                LazyColumn3.q(list3.size(), null, new p0(16, list3), new t1.d(new e1(list3, (rz.b0) obj4, (b1) obj2, b1Var3), true, 802480018));
                return b0Var;
            case 21:
                o1 o1Var = (o1) obj3;
                fz.c cVar4 = (fz.c) obj2;
                ke keVar = (ke) ry.m.t0(((Integer) obj).intValue(), (List) obj4);
                if (keVar != null && keVar != o1Var.f50165c) {
                    cVar4.invoke(keVar);
                }
                return b0Var;
            case 22:
                q2 q2Var = (q2) obj;
                kotlin.jvm.internal.m.f(q2Var, tcppUUQxZjFdy.IOYIiUNuOZZM);
                ((b1) obj2).setValue(Boolean.FALSE);
                ((fz.c) obj4).invoke(q2Var);
                ((fz.c) obj3).invoke(q2Var);
                return b0Var;
            case 23:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((fz.c) obj4).invoke(((Map.Entry) obj3).getKey());
                ((b1) obj2).setValue(bool);
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                Integer num2 = (Integer) obj;
                num2.intValue();
                ((fz.e) obj4).invoke(((ud) obj3).f50502a, num2);
                ((fz.c) obj2).invoke(null);
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                o9.b bVar = (o9.b) obj4;
                l0.h LazyColumn4 = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn4, "$this$LazyColumn");
                l0.h.r(LazyColumn4, bVar.c(), new a0.e(20, new b6(6), bVar), new t1.d(new b2(bVar, (fz.c) obj3, (ph.k) obj2, 10), true, 1486725066), 4);
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                fz.c cVar5 = (fz.c) obj4;
                fz.c cVar6 = (fz.c) obj3;
                ph.a0 a0Var = (ph.a0) obj2;
                oh.h event = (oh.h) obj;
                kotlin.jvm.internal.m.f(event, "event");
                if (event instanceof oh.e) {
                    cVar5.invoke(((oh.e) event).f44917a);
                } else if (event instanceof oh.g) {
                    cVar6.invoke(((oh.g) event).f44919a);
                } else if (event instanceof oh.f) {
                    rz.e0.B(ViewModelKt.getViewModelScope(a0Var), null, null, new w1(9, ((oh.f) event).f44918a, a0Var, (vy.d) null), 3);
                }
                return b0Var;
            case 27:
                o9.b bVar2 = (o9.b) obj4;
                l0.h LazyRow = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyRow, "$this$LazyRow");
                l0.h.r(LazyRow, bVar2.c(), new a0.e(20, new b6(7), bVar2), new t1.d(new b2(bVar2, (fz.c) obj3, (fz.c) obj2, 11), true, 1912084258), 4);
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                List list4 = (List) obj4;
                l0.h LazyColumn5 = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn5, "$this$LazyColumn");
                LazyColumn5.q(list4.size(), new av.r(15, new b6(i12), list4), new p0(24, list4), new t1.d(new dl.n(list4, (fz.c) obj3, (fz.c) obj2, i13), true, 802480018));
                return b0Var;
            default:
                om.m mVar2 = (om.m) obj4;
                kotlin.jvm.internal.m.f((View) obj, "it");
                mVar2.M = (CardView) obj3;
                String displayLuoMa = ((JPChar) obj2).getDisplayLuoMa();
                qy.q qVar2 = fv.b.f28186a;
                kotlin.jvm.internal.m.c(displayLuoMa);
                String strC = fv.b.c(displayLuoMa, null, null);
                mVar2.f45622e.a(strC);
                int[] iArr2 = bq.r.f4959a;
                mVar2.P = bq.m.B(strC);
                CardView cardView2 = mVar2.M;
                if (cardView2 == null || cardView2.getTag() == null) {
                    cardView = mVar2.M;
                    kotlin.jvm.internal.m.c(cardView);
                    View viewFindViewById = cardView.findViewById(R.id.frame_layout);
                    kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                    frameLayout = (FrameLayout) viewFindViewById;
                    View viewFindViewById2 = cardView.findViewById(R.id.img_tick);
                    kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
                    imageView = (ImageView) viewFindViewById2;
                    imageView.setImageResource(R.drawable.ic_word_select_wrong);
                    frameLayout.setVisibility(0);
                    context = mVar2.H;
                    if (context != null) {
                        kotlin.jvm.internal.m.n("mContext");
                        throw null;
                    }
                    cardView.startAnimation(AnimationUtils.loadAnimation(context, R.anim.anim_shake));
                    imageView.setVisibility(8);
                    frameLayout.setBackgroundResource(R.drawable.bg_word_model_wrong);
                    th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new ob.c(25, frameLayout, mVar2), om.a.N), mVar2.f45601d);
                    if (!mVar2.O) {
                        mVar2.O = true;
                    }
                } else {
                    JPChar jPChar = mVar2.N;
                    if (jPChar == null) {
                        kotlin.jvm.internal.m.n("mModel");
                        throw null;
                    }
                    long id2 = jPChar.getId();
                    CardView cardView3 = mVar2.M;
                    Object tag4 = cardView3 != null ? cardView3.getTag() : null;
                    kotlin.jvm.internal.m.d(tag4, "null cannot be cast to non-null type com.lingo.lingoskill.object.JPChar");
                    if (id2 == ((JPChar) tag4).getId()) {
                        CardView cardView4 = mVar2.M;
                        kotlin.jvm.internal.m.c(cardView4);
                        int size2 = mVar2.L.size();
                        int i23 = 0;
                        while (i23 < size2) {
                            Throwable th3 = th2;
                            View viewFindViewById3 = mVar2.d().findViewById(w4.c.a(i23, "rl_answer_"));
                            kotlin.jvm.internal.m.e(viewFindViewById3, "findViewById(...)");
                            CardView cardView5 = (CardView) viewFindViewById3;
                            Object tag5 = cardView5.getTag();
                            kotlin.jvm.internal.m.d(tag5, "null cannot be cast to non-null type com.lingo.lingoskill.object.JPChar");
                            long id3 = ((JPChar) tag5).getId();
                            JPChar jPChar2 = mVar2.N;
                            if (jPChar2 == null) {
                                kotlin.jvm.internal.m.n("mModel");
                                throw th3;
                            }
                            if (id3 != jPChar2.getId()) {
                                cardView5.setVisibility(4);
                            }
                            cardView5.setClickable(false);
                            i23++;
                            th2 = th3;
                        }
                        View viewFindViewById4 = cardView4.findViewById(R.id.frame_layout);
                        kotlin.jvm.internal.m.e(viewFindViewById4, "findViewById(...)");
                        FrameLayout frameLayout2 = (FrameLayout) viewFindViewById4;
                        View viewFindViewById5 = cardView4.findViewById(R.id.img_tick);
                        kotlin.jvm.internal.m.e(viewFindViewById5, "findViewById(...)");
                        ImageView imageView5 = (ImageView) viewFindViewById5;
                        frameLayout2.setBackgroundResource(R.drawable.bg_word_model_correct);
                        imageView5.setImageResource(R.drawable.ic_word_select_correct);
                        frameLayout2.setVisibility(0);
                        imageView5.setVisibility(8);
                        int[] iArr3 = new int[2];
                        cardView4.getLocationOnScreen(iArr3);
                        ta.a aVar = mVar2.f45600c;
                        kotlin.jvm.internal.m.c(aVar);
                        int[] iArr4 = {((((q6) aVar).f33174b.getWidth() / 2) + i) - (cardView4.getWidth() / 2), ((((q6) aVar).f33174b.getHeight() / 2) + i) - (cardView4.getHeight() / 2)};
                        ((q6) aVar).f33174b.getLocationOnScreen(iArr4);
                        int i24 = iArr4[0];
                        ta.a aVar2 = mVar2.f45600c;
                        kotlin.jvm.internal.m.c(aVar2);
                        int i25 = iArr4[1];
                        ta.a aVar3 = mVar2.f45600c;
                        kotlin.jvm.internal.m.c(aVar3);
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cardView4, "translationX", iArr4[0] - iArr3[0]);
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(cardView4, "translationY", iArr4[1] - iArr3[1]);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
                        animatorSet.setDuration(500L);
                        animatorSet.addListener(new om.l(imageView5, cardView4, mVar2, i14));
                        animatorSet.start();
                    } else {
                        cardView = mVar2.M;
                        kotlin.jvm.internal.m.c(cardView);
                        View viewFindViewById6 = cardView.findViewById(R.id.frame_layout);
                        kotlin.jvm.internal.m.e(viewFindViewById6, "findViewById(...)");
                        frameLayout = (FrameLayout) viewFindViewById6;
                        View viewFindViewById7 = cardView.findViewById(R.id.img_tick);
                        kotlin.jvm.internal.m.e(viewFindViewById7, "findViewById(...)");
                        imageView = (ImageView) viewFindViewById7;
                        imageView.setImageResource(R.drawable.ic_word_select_wrong);
                        frameLayout.setVisibility(0);
                        context = mVar2.H;
                        if (context != null) {
                            kotlin.jvm.internal.m.n("mContext");
                            throw null;
                        }
                        cardView.startAnimation(AnimationUtils.loadAnimation(context, R.anim.anim_shake));
                        imageView.setVisibility(8);
                        frameLayout.setBackgroundResource(R.drawable.bg_word_model_wrong);
                        th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new ob.c(25, frameLayout, mVar2), om.a.N), mVar2.f45601d);
                        if (!mVar2.O) {
                            mVar2.O = true;
                        }
                    }
                }
                return b0Var;
        }
    }
}
