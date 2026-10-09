package ci;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.fluent.object.WordOptions;
import com.lingo.fluent.object.WordSpellOption;
import com.lingo.fluent.ui.base.PdGrammarActivity;
import com.lingo.fluent.ui.base.PdVocabularyActivity;
import com.lingo.fluent.ui.base.adapter.PdVocabularyAdapter;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.ar.ui.syllable.ARSyllableIntroductionActivity;
import com.lingo.lingoskill.ar.ui.syllable.ARSyllableTestIndexActivity;
import com.lingo.lingoskill.ar.ui.syllable.adapter.ARSyllableIndexAdapter;
import com.lingo.lingoskill.object.PdWord;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import hj.h3;
import hj.u5;
import hj.w5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import n0.w0;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7126b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f7125a = i11;
        this.f7126b = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String strF;
        String string;
        String word;
        int i11 = 3;
        long j11 = 0;
        int i12 = 2;
        int i13 = 1;
        switch (this.f7125a) {
            case 0:
                g gVar = (g) this.f7126b;
                gVar.N.addAll((List) obj);
                ARSyllableIndexAdapter aRSyllableIndexAdapter = gVar.O;
                if (aRSyllableIndexAdapter == null) {
                    kotlin.jvm.internal.m.n("adapter");
                    throw null;
                }
                aRSyllableIndexAdapter.notifyDataSetChanged();
                if (ij.l.f34436b == null) {
                    synchronized (ij.l.class) {
                        if (ij.l.f34436b == null) {
                            ij.l.f34436b = new ij.l();
                        }
                        break;
                    }
                }
                if (b7.e0.d(ij.l.f34436b, 51) > 1) {
                    ta.a aVar = gVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar);
                    RecyclerView recyclerView = ((h3) aVar).f32657c;
                    recyclerView.postDelayed(new b2.c(4, recyclerView, new av.d(gVar, 24)), 0L);
                    return;
                }
                return;
            case 1:
                ARSyllableIntroductionActivity aRSyllableIntroductionActivity = (ARSyllableIntroductionActivity) this.f7126b;
                Integer num = (Integer) obj;
                int i14 = ARSyllableIntroductionActivity.Q;
                kotlin.jvm.internal.m.c(num);
                aRSyllableIntroductionActivity.getClass();
                if (num.intValue() == 100) {
                    aRSyllableIntroductionActivity.u(false);
                    return;
                }
                return;
            case 2:
                ARSyllableTestIndexActivity aRSyllableTestIndexActivity = (ARSyllableTestIndexActivity) this.f7126b;
                Integer num2 = (Integer) obj;
                int i15 = ARSyllableTestIndexActivity.Q;
                kotlin.jvm.internal.m.c(num2);
                if (num2.intValue() == 100) {
                    aRSyllableTestIndexActivity.u(false);
                    return;
                }
                return;
            case 3:
                vy.d dVar = null;
                PdGrammarActivity pdGrammarActivity = (PdGrammarActivity) this.f7126b;
                ArrayList arrayList = (ArrayList) obj;
                int i16 = PdGrammarActivity.W;
                kotlin.jvm.internal.m.c(arrayList);
                if (arrayList.isEmpty()) {
                    ((hj.j0) pdGrammarActivity.j()).f32744h.setVisibility(8);
                    ((hj.j0) pdGrammarActivity.j()).f32741e.clearColorFilter();
                } else {
                    ((hj.j0) pdGrammarActivity.j()).f32744h.setText(String.valueOf(arrayList.size()));
                    ((hj.j0) pdGrammarActivity.j()).f32744h.setVisibility(0);
                    ((hj.j0) pdGrammarActivity.j()).f32741e.clearColorFilter();
                    ((hj.j0) pdGrammarActivity.j()).f32741e.setColorFilter(pdGrammarActivity.getColor(R.color.color_primary));
                }
                if (pdGrammarActivity.V) {
                    pdGrammarActivity.V = false;
                    return;
                }
                boolean z11 = false;
                if (((hj.j0) pdGrammarActivity.j()).f32745i.getVisibility() == 0) {
                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(pdGrammarActivity), null, null, new bp.j(5, pdGrammarActivity, dVar, z11), 3);
                    return;
                } else {
                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(pdGrammarActivity), null, null, new hh.l(pdGrammarActivity, dVar, i11), 3);
                    return;
                }
            case 4:
                PdVocabularyActivity pdVocabularyActivity = (PdVocabularyActivity) this.f7126b;
                List list = (List) obj;
                if (list == null) {
                    int i17 = PdVocabularyActivity.Z;
                    return;
                }
                pdVocabularyActivity.T.clear();
                pdVocabularyActivity.T.addAll(list);
                PdVocabularyAdapter pdVocabularyAdapter = pdVocabularyActivity.R;
                if (pdVocabularyAdapter == null) {
                    kotlin.jvm.internal.m.n("favAdapter");
                    throw null;
                }
                pdVocabularyAdapter.notifyDataSetChanged();
                PdVocabularyAdapter pdVocabularyAdapter2 = pdVocabularyActivity.R;
                if (pdVocabularyAdapter2 != null) {
                    pdVocabularyAdapter2.setEmptyView(R.layout.include_empty_content, ((hj.m0) pdVocabularyActivity.j()).f32908g);
                    return;
                } else {
                    kotlin.jvm.internal.m.n("favAdapter");
                    throw null;
                }
            case 5:
                qh.e eVar = (qh.e) this.f7126b;
                if (((WordOptions) obj) == null) {
                    eVar.F();
                    eVar.B();
                    return;
                }
                ta.a aVar2 = eVar.f36400f;
                ArrayList arrayList2 = eVar.V;
                kotlin.jvm.internal.m.c(aVar2);
                ImageView imageView = ((u5) aVar2).f33413n;
                imageView.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                imageView.setImageResource(R.drawable.ic_game_word_choose_right_deer);
                ta.a aVar3 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ImageView imageView2 = ((u5) aVar3).f33406f;
                imageView2.setAlpha(1.0f);
                imageView2.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                imageView2.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                imageView2.setVisibility(8);
                ta.a aVar4 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ImageView imageView3 = ((u5) aVar4).f33407g;
                imageView3.setAlpha(1.0f);
                imageView3.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                imageView3.setVisibility(8);
                ta.a aVar5 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                View view = ((u5) aVar5).G;
                view.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                view.setVisibility(8);
                ta.a aVar6 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                ImageView imageView4 = ((u5) aVar6).f33411k;
                imageView4.setAlpha(1.0f);
                imageView4.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                imageView4.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                imageView4.setImageResource(R.drawable.ic_game_word_choose_move_box);
                imageView4.setVisibility(0);
                eVar.x();
                ta.a aVar7 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar7);
                ((u5) aVar7).f33411k.getAnimation();
                int[] iArr = bq.r.f4959a;
                long jA = bq.m.A(R.raw.kr_gamevocab_w_1);
                ta.a aVar8 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar8);
                ImageView imageView5 = ((u5) aVar8).f33411k;
                Property property = View.TRANSLATION_X;
                Context contextRequireContext = eVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                float fY = j3.y(contextRequireContext) * 0.63f;
                Context contextRequireContext2 = eVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                float fZ = j3.Z(8, contextRequireContext2) + fY;
                ta.a aVar9 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar9);
                ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(imageView5, PropertyValuesHolder.ofFloat((Property<?, Float>) property, CropImageView.DEFAULT_ASPECT_RATIO, fZ + (((u5) aVar9).f33411k.getWidth() / 2))).setDuration(4000L);
                eVar.P = duration;
                if (duration != null) {
                    duration.setStartDelay(jA);
                }
                ObjectAnimator objectAnimator = eVar.P;
                if (objectAnimator != null) {
                    objectAnimator.addListener(new gi.g(eVar, 3));
                }
                th.e eVar2 = eVar.O;
                if (eVar2 == null) {
                    kotlin.jvm.internal.m.n("player");
                    throw null;
                }
                sh.b bVar = eVar.N;
                if (bVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                if (bVar.a().getWord().getWordStruct() == 1) {
                    strF = xt.b.a().f();
                    Long wordId = bVar.a().getWord().getWordId();
                    kotlin.jvm.internal.m.e(wordId, "getWordId(...)");
                    long jLongValue = wordId.longValue();
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    StringBuilder sbM = com.google.android.material.datepicker.d.m(jLongValue, "pod-", bq.m.g(cf.x.n().keyLanguage), "-w-yx-");
                    sbM.append(".mp3");
                    string = sbM.toString();
                } else {
                    strF = xt.b.a().f();
                    Long wordId2 = bVar.a().getWord().getWordId();
                    kotlin.jvm.internal.m.e(wordId2, "getWordId(...)");
                    long jLongValue2 = wordId2.longValue();
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    StringBuilder sbM2 = com.google.android.material.datepicker.d.m(jLongValue2, "pod-", bq.m.g(cf.x.n().keyLanguage), "-w-");
                    sbM2.append(".mp3");
                    string = sbM2.toString();
                }
                eVar2.h(defpackage.e.m(strF, string));
                ObjectAnimator objectAnimator2 = eVar.P;
                if (objectAnimator2 != null) {
                    objectAnimator2.start();
                }
                ta.a aVar10 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar10);
                ((u5) aVar10).B.setText(BuildConfig.VERSION_NAME);
                ta.a aVar11 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar11);
                ((u5) aVar11).F.setText(BuildConfig.VERSION_NAME);
                ta.a aVar12 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar12);
                ((u5) aVar12).f33423x.setText(BuildConfig.VERSION_NAME);
                ta.a aVar13 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar13);
                ((u5) aVar13).f33423x.setVisibility(8);
                ta.a aVar14 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar14);
                ((u5) aVar14).F.setVisibility(8);
                if (cf.x.n().keyLanguage == 0 && ((fr.o0) eVar.s()).t() == 2) {
                    ta.a aVar15 = eVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar15);
                    TextView textView = ((u5) aVar15).D;
                    sh.b bVar2 = eVar.N;
                    if (bVar2 == null) {
                        kotlin.jvm.internal.m.n("viewModel");
                        throw null;
                    }
                    textView.setText(bVar2.a().getWord().getShowLuoma());
                } else if (cf.x.n().keyLanguage == 0 && ((fr.o0) eVar.s()).t() == 0) {
                    ta.a aVar16 = eVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar16);
                    ((u5) aVar16).F.setVisibility(0);
                    ta.a aVar17 = eVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar17);
                    TextView textView2 = ((u5) aVar17).F;
                    sh.b bVar3 = eVar.N;
                    if (bVar3 == null) {
                        kotlin.jvm.internal.m.n("viewModel");
                        throw null;
                    }
                    textView2.setText(bVar3.a().getWord().getShowLuoma());
                    ta.a aVar18 = eVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar18);
                    TextView textView3 = ((u5) aVar18).D;
                    sh.b bVar4 = eVar.N;
                    if (bVar4 == null) {
                        kotlin.jvm.internal.m.n("viewModel");
                        throw null;
                    }
                    textView3.setText(bVar4.a().getWord().getDetailWord());
                } else {
                    ta.a aVar19 = eVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar19);
                    TextView textView4 = ((u5) aVar19).D;
                    sh.b bVar5 = eVar.N;
                    if (bVar5 == null) {
                        kotlin.jvm.internal.m.n("viewModel");
                        throw null;
                    }
                    textView4.setText(bVar5.a().getWord().getDetailWord());
                }
                int size = arrayList2.size();
                for (int i18 = 0; i18 < size; i18++) {
                    Object obj2 = arrayList2.get(i18);
                    kotlin.jvm.internal.m.e(obj2, "get(...)");
                    AppCompatTextView appCompatTextView = (AppCompatTextView) obj2;
                    sh.b bVar6 = eVar.N;
                    if (bVar6 == null) {
                        kotlin.jvm.internal.m.n("viewModel");
                        throw null;
                    }
                    PdWord pdWord = bVar6.a().getOptions().get(i18);
                    kotlin.jvm.internal.m.e(pdWord, "get(...)");
                    PdWord pdWord2 = pdWord;
                    ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
                    Context context = appCompatTextView.getContext();
                    kotlin.jvm.internal.m.e(context, "getContext(...)");
                    layoutParams.height = (int) j3.Z(62, context);
                    appCompatTextView.setEnabled(true);
                    appCompatTextView.setText(pdWord2.getDetailTrans());
                    appCompatTextView.setTag(pdWord2);
                    appCompatTextView.setAlpha(1.0f);
                    appCompatTextView.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                    appCompatTextView.setBackgroundResource(R.drawable.bg_game_word_choose_option_btn);
                    bq.z.b(appCompatTextView, new w0(12, eVar, appCompatTextView));
                }
                return;
            case 6:
                qh.c0 c0Var = (qh.c0) this.f7126b;
                WordOptions wordOptions = (WordOptions) obj;
                sh.c cVar = c0Var.S;
                if (cVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                boolean z12 = cVar.O;
                if (z12 && cVar.f51689d >= 5) {
                    c0Var.C(false);
                    return;
                }
                if (wordOptions == null) {
                    if (z12) {
                        if (z12) {
                            Context contextRequireContext3 = c0Var.requireContext();
                            kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                            float fY2 = j3.y(contextRequireContext3);
                            ta.a aVar20 = c0Var.f36400f;
                            kotlin.jvm.internal.m.c(aVar20);
                            float translationX = fY2 - ((w5) aVar20).f33531h.getTranslationX();
                            ta.a aVar21 = c0Var.f36400f;
                            kotlin.jvm.internal.m.c(aVar21);
                            z4.w0 w0VarB = s0.b(((w5) aVar21).f33531h);
                            w0VarB.k(translationX);
                            w0VarB.f(new DecelerateInterpolator());
                            j11 = 400;
                            w0VarB.e(400L);
                            w0VarB.i();
                        }
                        th.j.a(qx.h.m(j11, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.i(c0Var, 8), vx.b.f54316e), c0Var.f36401t);
                        return;
                    }
                    return;
                }
                String str = DytezVyM.KhxwaEwuPUXDO;
                Iterator it = c0Var.O.iterator();
                kotlin.jvm.internal.m.e(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    kotlin.jvm.internal.m.e(next, str);
                    View view2 = (View) next;
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                    view2.setVisibility(4);
                }
                ta.a aVar22 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar22);
                ((w5) aVar22).f33535l.setVisibility(0);
                Iterator it2 = c0Var.T.iterator();
                kotlin.jvm.internal.m.e(it2, "iterator(...)");
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    kotlin.jvm.internal.m.e(next2, str);
                    ((LinearLayout) next2).setVisibility(8);
                }
                ta.a aVar23 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar23);
                View view3 = ((w5) aVar23).f33543u;
                ta.a aVar24 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar24);
                view3.setPivotY(((w5) aVar24).f33543u.getHeight());
                ta.a aVar25 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar25);
                z4.w0 w0VarB2 = s0.b(((w5) aVar25).f33543u);
                w0VarB2.d(1.0f);
                w0VarB2.e(300L);
                w0VarB2.i();
                sh.c cVar2 = c0Var.S;
                if (cVar2 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                cVar2.a();
                ta.a aVar26 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar26);
                ((w5) aVar26).f33525b.start();
                th.e eVar3 = c0Var.N;
                if (eVar3 == null) {
                    kotlin.jvm.internal.m.n("player");
                    throw null;
                }
                eVar3.f52416c = new qh.z(0, c0Var, wordOptions);
                sh.c cVar3 = c0Var.S;
                if (cVar3 != null) {
                    eVar3.h(cVar3.a());
                    return;
                } else {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
            default:
                qh.k0 k0Var = (qh.k0) this.f7126b;
                WordSpellOption wordSpellOption = (WordSpellOption) obj;
                if (wordSpellOption == null) {
                    sh.d dVar2 = k0Var.T;
                    if (dVar2 == null) {
                        kotlin.jvm.internal.m.n("viewModel");
                        throw null;
                    }
                    if (dVar2.N) {
                        k0Var.C();
                        return;
                    }
                    return;
                }
                sh.d dVar3 = k0Var.T;
                if (dVar3 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                if (dVar3.f51697e.get()) {
                    k0Var.A();
                    sh.d dVar4 = k0Var.T;
                    if (dVar4 == null) {
                        kotlin.jvm.internal.m.n("viewModel");
                        throw null;
                    }
                    dVar4.f51697e.set(false);
                }
                k0Var.x().f32539d.removeAllViews();
                k0Var.x().f32540e.removeAllViews();
                k0Var.x().f32542g.setVisibility(8);
                k0Var.x().f32544i.setVisibility(8);
                FrameLayout frameLayout = k0Var.x().f32538c;
                frameLayout.setAlpha(1.0f);
                frameLayout.setEnabled(true);
                FrameLayout frameLayout2 = k0Var.x().f32537b;
                frameLayout2.setAlpha(1.0f);
                frameLayout2.setEnabled(true);
                k0Var.x().f32541f.animate().translationY(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(0L).start();
                LinearLayout linearLayout = k0Var.x().f32541f;
                linearLayout.setAlpha(1.0f);
                linearLayout.setBackgroundResource(0);
                linearLayout.setScaleX(1.0f);
                linearLayout.setScaleY(1.0f);
                k0Var.x().f32543h.setText(wordSpellOption.getWord().getDetailTrans());
                int size2 = wordSpellOption.getAnswerCharList().size();
                int i19 = 0;
                while (true) {
                    int i21 = R.id.tv_char;
                    if (i19 >= size2) {
                        ArrayList arrayList3 = (ArrayList) ns.o.S(wordSpellOption.getOptionCharList());
                        int size3 = arrayList3.size();
                        int i22 = 0;
                        while (i22 < size3) {
                            Object obj3 = arrayList3.get(i22);
                            i22++;
                            PdWord pdWord3 = (PdWord) obj3;
                            View viewInflate = LayoutInflater.from(k0Var.requireContext()).inflate(R.layout.item_word_game_spell_question_option, (ViewGroup) k0Var.x().f32540e, false);
                            ((TextView) viewInflate.findViewById(i21)).setText(pdWord3.getWord());
                            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                            if (cf.x.n().keyLanguage == 0 && ((fr.o0) k0Var.s()).t() == 2) {
                                ((TextView) viewInflate.findViewById(i21)).setTextSize(16.0f);
                            } else if (cf.x.n().keyLanguage == 1) {
                                ((TextView) viewInflate.findViewById(i21)).setTextSize(20.0f);
                            } else {
                                ((TextView) viewInflate.findViewById(i21)).setTextSize(24.0f);
                            }
                            ViewGroup.LayoutParams layoutParams2 = viewInflate.getLayoutParams();
                            kotlin.jvm.internal.m.d(layoutParams2, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
                            FlexboxLayout.LayoutParams layoutParams3 = (FlexboxLayout.LayoutParams) layoutParams2;
                            if (k0Var.x().f32540e.getChildCount() == 5) {
                                layoutParams3.L = true;
                            }
                            Context context2 = viewInflate.getContext();
                            kotlin.jvm.internal.m.e(context2, "getContext(...)");
                            float fY3 = j3.y(context2);
                            Context context3 = viewInflate.getContext();
                            kotlin.jvm.internal.m.e(context3, "getContext(...)");
                            float fZ2 = fY3 - j3.Z(64, context3);
                            Context context4 = viewInflate.getContext();
                            kotlin.jvm.internal.m.e(context4, "getContext(...)");
                            float f5 = 5;
                            ((ViewGroup.MarginLayoutParams) layoutParams3).width = (int) ((fZ2 - j3.Z(64, context4)) / f5);
                            Context context5 = viewInflate.getContext();
                            kotlin.jvm.internal.m.e(context5, "getContext(...)");
                            float fY4 = j3.y(context5);
                            Context context6 = viewInflate.getContext();
                            kotlin.jvm.internal.m.e(context6, "getContext(...)");
                            float fZ3 = fY4 - j3.Z(64, context6);
                            Context context7 = viewInflate.getContext();
                            kotlin.jvm.internal.m.e(context7, "getContext(...)");
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = (int) ((fZ3 - j3.Z(64, context7)) / f5);
                            k0Var.x().f32540e.addView(viewInflate);
                            bq.z.b(viewInflate, new pr.a0(k0Var, viewInflate, pdWord3, i13));
                            i21 = R.id.tv_char;
                        }
                        bq.z.b(k0Var.x().f32537b, new qh.e0(k0Var, 2));
                        bq.z.b(k0Var.x().f32538c, new w0(15, k0Var, wordSpellOption));
                        return;
                    }
                    View viewInflate2 = LayoutInflater.from(k0Var.requireContext()).inflate(R.layout.item_word_game_spell_question_body, (ViewGroup) k0Var.x().f32539d, false);
                    View viewFindViewById = viewInflate2.findViewById(R.id.iv_bottom_line);
                    TextView textView5 = (TextView) viewInflate2.findViewById(R.id.tv_char);
                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                    if (cf.x.n().keyLanguage == 0 && ((fr.o0) k0Var.s()).t() == i12) {
                        ViewGroup.LayoutParams layoutParams4 = viewInflate2.getLayoutParams();
                        Context context8 = viewInflate2.getContext();
                        kotlin.jvm.internal.m.e(context8, "getContext(...)");
                        layoutParams4.width = (int) j3.Z(58, context8);
                    } else if (cf.x.n().keyLanguage == 1) {
                        ViewGroup.LayoutParams layoutParams5 = viewInflate2.getLayoutParams();
                        Context context9 = viewInflate2.getContext();
                        kotlin.jvm.internal.m.e(context9, "getContext(...)");
                        layoutParams5.width = (int) j3.Z(52, context9);
                    } else {
                        int[] iArr2 = bq.r.f4959a;
                        if (bq.m.F()) {
                            ViewGroup.LayoutParams layoutParams6 = viewInflate2.getLayoutParams();
                            Context context10 = viewInflate2.getContext();
                            kotlin.jvm.internal.m.e(context10, "getContext(...)");
                            layoutParams6.width = (int) j3.Z(28, context10);
                        } else {
                            ViewGroup.LayoutParams layoutParams7 = viewInflate2.getLayoutParams();
                            Context context11 = viewInflate2.getContext();
                            kotlin.jvm.internal.m.e(context11, "getContext(...)");
                            layoutParams7.width = (int) j3.Z(20, context11);
                        }
                    }
                    if (i19 >= wordSpellOption.getBodyCharList().size() || (word = wordSpellOption.getBodyCharList().get(i19).getWord()) == null || word.length() == 0) {
                        viewFindViewById.setVisibility(0);
                        textView5.setText(BuildConfig.VERSION_NAME);
                    } else {
                        viewFindViewById.setVisibility(8);
                        textView5.setText(wordSpellOption.getBodyCharList().get(i19).getWord());
                    }
                    k0Var.x().f32539d.addView(viewInflate2);
                    i19++;
                    i12 = 2;
                }
                break;
        }
    }
}
