package qp;

import android.animation.LayoutTransition;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Model_Sentence_100;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s2 extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Model_Sentence_100 f48179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f48180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f48181k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f48182l;
    public h m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f48183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f48184o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f48185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f48186q;

    public s2(mp.b bVar, long j11) {
        super(bVar, j11);
        this.f48182l = new ArrayList();
        this.f48185p = 200L;
        this.f48186q = ff.h.l(2.0f);
    }

    public static final void r(s2 s2Var) {
        int i11;
        mp.b bVar = s2Var.f47881a;
        Context context = s2Var.f47883c;
        ta.a aVar = s2Var.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.a2) aVar).f32335c.getChildCount();
        int i12 = 1;
        boolean z11 = true;
        while (true) {
            i11 = 0;
            if (i12 >= childCount) {
                break;
            }
            ta.a aVar2 = s2Var.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            View childAt = ((hj.a2) aVar2).f32335c.getChildAt(i12);
            Object tag = childAt.getTag();
            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            Word word = (Word) tag;
            if (childAt.getTag(R.id.tag_view) == null && kotlin.jvm.internal.m.a(word.getWord(), "_____")) {
                z11 = false;
            }
            i12++;
        }
        if (z11) {
            ((jp.p0) bVar).O(4);
            ta.a aVar3 = s2Var.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            int childCount2 = ((hj.a2) aVar3).f32334b.getChildCount();
            while (i11 < childCount2) {
                ta.a aVar4 = s2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                View childAt2 = ((hj.a2) aVar4).f32334b.getChildAt(i11);
                View viewFindViewById = childAt2.findViewById(R.id.card_item);
                kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                if (((CardView) viewFindViewById).getTranslationY() == CropImageView.DEFAULT_ASPECT_RATIO) {
                    kotlin.jvm.internal.m.f(context, "context");
                    s(childAt2, context.getColor(R.color.divider_line_color), context.getColor(R.color.divider_line_color));
                }
                i11++;
            }
            return;
        }
        ((jp.p0) bVar).O(0);
        ta.a aVar5 = s2Var.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        int childCount3 = ((hj.a2) aVar5).f32334b.getChildCount();
        while (i11 < childCount3) {
            ta.a aVar6 = s2Var.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            View childAt3 = ((hj.a2) aVar6).f32334b.getChildAt(i11);
            View viewFindViewById2 = childAt3.findViewById(R.id.card_item);
            kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
            if (((CardView) viewFindViewById2).getTranslationY() == CropImageView.DEFAULT_ASPECT_RATIO) {
                kotlin.jvm.internal.m.f(context, "context");
                s(childAt3, context.getColor(R.color.second_black), context.getColor(R.color.primary_black));
            }
            i11++;
        }
    }

    public static void s(View view, int i11, int i12) {
        TextView textView = (TextView) view.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
        textView.setTextColor(i11);
        textView2.setTextColor(i12);
        textView3.setTextColor(i11);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00df  */
    @Override // hi.a
    public final boolean a() {
        SpannableString spannableString;
        ArrayList arrayList;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ArrayList arrayList2 = new ArrayList();
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        int childCount = ((hj.a2) aVar2).f32335c.getChildCount();
        int i11 = 1;
        for (int i12 = 1; i12 < childCount; i12++) {
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            View childAt = ((hj.a2) aVar3).f32335c.getChildAt(i12);
            View view = (View) childAt.getTag(R.id.tag_view);
            if (view != null) {
                Word word = (Word) view.getTag();
                if (word != null) {
                    arrayList2.add(word);
                }
            } else {
                Object tag = childAt.getTag();
                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                arrayList2.add((Word) tag);
                if (childAt.getTag(R.id.tag_punch) != null) {
                    Object tag2 = childAt.getTag(R.id.tag_punch);
                    kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                    arrayList2.add((Word) tag2);
                }
            }
        }
        ArrayList arrayList3 = this.f48182l;
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (((Word) it.next()).getWordType() == 1) {
                it.remove();
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (((Word) it2.next()).getWordType() == 1) {
                it2.remove();
            }
        }
        boolean z11 = arrayList2.size() == arrayList3.size();
        int size = arrayList2.size();
        for (int i13 = 0; i13 < size; i13++) {
            Word word2 = (Word) arrayList2.get(i13);
            if (i13 < arrayList3.size()) {
                Word word3 = (Word) arrayList3.get(i13);
                if (word2.getWordId() != word3.getWordId() && !kotlin.jvm.internal.m.a(word2.getWord(), word3.getWord())) {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        int childCount2 = ((hj.a2) aVar4).f32335c.getChildCount();
        for (int i14 = 1; i14 < childCount2; i14++) {
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            View childAt2 = ((hj.a2) aVar5).f32335c.getChildAt(i14);
            View view2 = (View) childAt2.getTag(R.id.tag_view);
            if (view2 != null) {
                Word word4 = (Word) view2.getTag();
                if (word4 != null && word4.getWordType() != 1) {
                    arrayList4.add(word4);
                }
            } else {
                Word word5 = (Word) childAt2.getTag();
                if (word5 != null && word5.getWordType() != 1) {
                    arrayList4.add(word5);
                }
            }
        }
        ArrayList arrayList5 = new ArrayList();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Model_Sentence_100 model_Sentence_100 = this.f48179i;
        if (model_Sentence_100 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_100.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        int size2 = gb.r.u(sentence).size();
        int i15 = 0;
        int i16 = 0;
        while (i15 < size2) {
            Model_Sentence_100 model_Sentence_101 = this.f48179i;
            if (model_Sentence_101 == null) {
                kotlin.jvm.internal.m.n("mModel");
                throw null;
            }
            Sentence sentence2 = model_Sentence_101.getSentence();
            kotlin.jvm.internal.m.e(sentence2, "getSentence(...)");
            Word word6 = (Word) gb.r.u(sentence2).get(i15);
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if ((cf.x.n().keyLanguage == i11 || cf.x.n().keyLanguage == 12) && cf.x.n().jsDisPlay == 2 && !kotlin.jvm.internal.m.a(word6.getWord(), " ")) {
                String word7 = word6.getWord();
                kotlin.jvm.internal.m.e(word7, "getWord(...)");
                spannableString = new SpannableString(oz.x.q0(word7, " ", BuildConfig.VERSION_NAME));
            } else {
                spannableString = new SpannableString(word6.getWord());
            }
            if (cf.x.n().keyLanguage == 10 || cf.x.n().keyLanguage == 22) {
                String word8 = word6.getWord();
                kotlin.jvm.internal.m.e(word8, "getWord(...)");
                spannableString = new SpannableString(oz.x.q0(word8, "́", BuildConfig.VERSION_NAME));
            }
            Context context = this.f47883c;
            kotlin.jvm.internal.m.f(context, "context");
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(context.getColor(R.color.color_answer_btm));
            boolean z12 = z11;
            StyleSpan styleSpan = new StyleSpan(0);
            int i17 = size2;
            int i18 = 1;
            if (word6.getWordType() != 1) {
                if (i16 < arrayList4.size()) {
                    Word word9 = (Word) arrayList4.get(i16);
                    String word10 = word6.getWord();
                    kotlin.jvm.internal.m.e(word10, "getWord(...)");
                    Locale locale = Locale.getDefault();
                    arrayList = arrayList4;
                    kotlin.jvm.internal.m.e(locale, "getDefault(...)");
                    String lowerCase = word10.toLowerCase(locale);
                    kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                    String strV = gb.r.v(word9);
                    Locale locale2 = Locale.getDefault();
                    kotlin.jvm.internal.m.e(locale2, "getDefault(...)");
                    String lowerCase2 = strV.toLowerCase(locale2);
                    kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                    if (lowerCase.equals(lowerCase2) || word6.getWordId() == word9.getWordId()) {
                        foregroundColorSpan = foregroundColorSpan;
                    } else {
                        arrayList5.add(Integer.valueOf(i15));
                        foregroundColorSpan = new ForegroundColorSpan(context.getColor(R.color.color_wrong_high_light));
                    }
                } else {
                    arrayList = arrayList4;
                    foregroundColorSpan = new ForegroundColorSpan(context.getColor(R.color.color_wrong_high_light));
                }
                ArrayList arrayList6 = this.f48181k;
                if (arrayList6 == null) {
                    kotlin.jvm.internal.m.n("stemList");
                    throw null;
                }
                if (arrayList6.contains(word6)) {
                    i18 = 1;
                } else {
                    i18 = 1;
                    styleSpan = new StyleSpan(1);
                }
                i16++;
            } else {
                arrayList = arrayList4;
            }
            spannableString.setSpan(foregroundColorSpan, 0, spannableString.length(), 33);
            spannableString.setSpan(styleSpan, 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            i15++;
            i11 = i18;
            z11 = z12;
            size2 = i17;
            arrayList4 = arrayList;
        }
        boolean z13 = z11;
        mp.b bVar = this.f47881a;
        kotlin.jvm.internal.m.d(bVar, "null cannot be cast to non-null type com.lingo.lingoskill.ui.learn.BaseLessonTestFragment");
        ((jp.p0) bVar).f36528d0 = new o2(0, this, spannableStringBuilder);
        return z13;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_100 model_Sentence_100 = this.f48179i;
        if (model_Sentence_100 != null) {
            return fv.b.G(model_Sentence_100.getSentenceId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // hi.a
    public final String c() {
        return nv.p.m(this.f47882b, "1;", ";10");
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_100 model_Sentence_100 = this.f48179i;
        if (model_Sentence_100 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strH = fv.b.H(model_Sentence_100.getSentenceId());
        Model_Sentence_100 model_Sentence_101 = this.f48179i;
        if (model_Sentence_101 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        arrayList.add(new fv.a(2L, strH, fv.b.F(model_Sentence_101.getSentenceId())));
        if (!((jp.p0) this.f47881a).Q) {
            Model_Sentence_100 model_Sentence_102 = this.f48179i;
            if (model_Sentence_102 == null) {
                kotlin.jvm.internal.m.n("mModel");
                throw null;
            }
            for (Word word : model_Sentence_102.getSentence().getSentWords()) {
                if (word.getWordType() != 1) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    if ((cf.x.n().keyLanguage != 5 && cf.x.n().keyLanguage != 15) || (word.getWordId() != 1858 && word.getWordId() != 544)) {
                        qy.q qVar2 = fv.b.f28186a;
                        arrayList.add(new fv.a(2L, fv.b.Z(word.getWordId()), fv.b.V(word.getWordId())));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // hi.a
    public final int i() {
        return 1;
    }

    @Override // hi.a
    public final void j() throws NoSuchElemException {
        Model_Sentence_100 model_Sentence_100LoadFullObject = Model_Sentence_100.loadFullObject(this.f47882b);
        if (model_Sentence_100LoadFullObject == null) {
            throw new NoSuchElemException();
        }
        this.f48179i = model_Sentence_100LoadFullObject;
    }

    @Override // hi.a
    public final void k() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        y();
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        int childCount = ((hj.a2) aVar2).f32334b.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            View childAt = ((hj.a2) aVar3).f32334b.getChildAt(i11);
            kotlin.jvm.internal.m.e(childAt, "getChildAt(...)");
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            w(childAt, (Word) hh.p0.g(((hj.a2) aVar4).f32334b, i11, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word"));
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            ((hj.a2) aVar5).f32334b.getChildAt(i11).requestLayout();
        }
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        ((hj.a2) aVar6).f32334b.requestLayout();
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        FlexboxLayout flexboxLayout = ((hj.a2) aVar7).f32334b;
        flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new l2(this, 0)), 0L);
    }

    @Override // qp.d
    public final fz.f n() {
        return p2.f48114a;
    }

    @Override // qp.d
    public final void p() {
        ArrayList arrayList = this.f48182l;
        arrayList.clear();
        Model_Sentence_100 model_Sentence_100 = this.f48179i;
        if (model_Sentence_100 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> sentWords = model_Sentence_100.getSentence().getSentWords();
        kotlin.jvm.internal.m.e(sentWords, "getSentWords(...)");
        arrayList.addAll(sentWords);
        ArrayList arrayList2 = new ArrayList();
        this.f48181k = arrayList2;
        Model_Sentence_100 model_Sentence_101 = this.f48179i;
        if (model_Sentence_101 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> stemList = model_Sentence_101.getStemList();
        kotlin.jvm.internal.m.e(stemList, "getStemList(...)");
        arrayList2.addAll(stemList);
        ArrayList arrayList3 = new ArrayList();
        this.f48180j = arrayList3;
        Model_Sentence_100 model_Sentence_102 = this.f48179i;
        if (model_Sentence_102 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> optionList = model_Sentence_102.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        Collections.shuffle(optionList);
        Model_Sentence_100 model_Sentence_103 = this.f48179i;
        if (model_Sentence_103 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> optionList2 = model_Sentence_103.getOptionList();
        kotlin.jvm.internal.m.e(optionList2, "getOptionList(...)");
        arrayList3.addAll(optionList2);
        jp.p0 p0Var = (jp.p0) this.f47881a;
        p0Var.O(0);
        y();
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.a2) aVar).f32335c.removeAllViews();
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.a2) aVar2).f32334b.removeAllViews();
        ArrayList arrayList4 = this.f48181k;
        if (arrayList4 == null) {
            kotlin.jvm.internal.m.n("stemList");
            throw null;
        }
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        Context context = this.f47883c;
        this.m = new h(this, context, arrayList4, ((hj.a2) aVar3).f32335c, 8);
        int[] iArr = bq.r.f4959a;
        if (bq.m.F()) {
            h hVar = this.m;
            if (hVar != null) {
                hVar.f59274j = 2;
            }
        } else {
            h hVar2 = this.m;
            if (hVar2 != null) {
                hVar2.f59274j = this.f48186q;
            }
        }
        h hVar3 = this.m;
        if (hVar3 != null) {
            hVar3.m = new lp.b(this, 20);
        }
        if (hVar3 != null) {
            hVar3.d();
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        View viewInflate = layoutInflaterFrom.inflate(R.layout.include_iv_audio, (ViewGroup) ((hj.a2) aVar4).f32335c, false);
        kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewInflate;
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        ((hj.a2) aVar5).f32335c.addView(imageView, 0);
        if (!this.f47884d.isAudioModel || p0Var.Q) {
            imageView.setVisibility(8);
        } else {
            bq.z.b(imageView, new n0.w0(29, this, imageView));
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            bq.z.b(((hj.a2) aVar6).f32336d, new ih.c(imageView, 8));
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (cf.x.n().isTestAutoPlayAudio) {
                imageView.performClick();
            }
        }
        x();
        ArrayList arrayList5 = this.f48180j;
        if (arrayList5 == null) {
            kotlin.jvm.internal.m.n("options");
            throw null;
        }
        int size = arrayList5.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList5.get(i11);
            i11++;
            Word word = (Word) obj;
            LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(context);
            ta.a aVar7 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar7);
            View viewInflate2 = layoutInflaterFrom2.inflate(R.layout.item_word_card_framlayout, (ViewGroup) ((hj.a2) aVar7).f32334b, false);
            kotlin.jvm.internal.m.d(viewInflate2, "null cannot be cast to non-null type android.widget.FrameLayout");
            View view = (FrameLayout) viewInflate2;
            view.setBackgroundResource(R.drawable.item_leave);
            View viewFindViewById = view.findViewById(R.id.card_item);
            kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById;
            cardView.setCardBackgroundColor(context.getColor(R.color.white));
            cardView.setCardElevation(ff.h.l(2.0f));
            view.setTag(word);
            cardView.setTag(word);
            w(view, word);
            ta.a aVar8 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar8);
            ((hj.a2) aVar8).f32334b.addView(view);
            bq.z.b(view, new ot.e2(this, 11));
        }
        ta.a aVar9 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar9);
        FlexboxLayout flexboxLayout = ((hj.a2) aVar9).f32335c;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimator(2, null);
        layoutTransition.setAnimator(3, null);
        layoutTransition.setAnimator(4, null);
        flexboxLayout.setLayoutTransition(layoutTransition);
        ta.a aVar10 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar10);
        FlexboxLayout flexboxLayout2 = ((hj.a2) aVar10).f32334b;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setAnimator(2, null);
        layoutTransition2.setAnimator(3, null);
        layoutTransition2.setAnimator(4, null);
        flexboxLayout2.setLayoutTransition(layoutTransition2);
        ef.e.B(o());
    }

    public final void t() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.a2) aVar).f32335c.getChildCount();
        for (int i11 = 1; i11 < childCount; i11++) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            View childAt = ((hj.a2) aVar2).f32335c.getChildAt(i11);
            View view = (View) childAt.getTag(R.id.tag_view);
            if (view != null) {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                childAt.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                View view2 = this.f48183n;
                if (view2 == null || !childAt.equals(view2)) {
                    float f5 = iArr[0] - iArr2[0];
                    float f11 = iArr[1] - iArr2[1];
                    z4.w0 w0VarB = z4.s0.b(view);
                    w0VarB.k(f5);
                    w0VarB.m(f11);
                    w0VarB.e(200L);
                    w0VarB.g(new um.a());
                    w0VarB.f(new DecelerateInterpolator());
                    w0VarB.i();
                }
            }
        }
    }

    public final void u(boolean z11) {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.a2) aVar).f32334b.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            ((hj.a2) aVar2).f32334b.getChildAt(i11).setClickable(z11);
        }
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        int childCount2 = ((hj.a2) aVar3).f32335c.getChildCount();
        for (int i12 = 1; i12 < childCount2; i12++) {
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            ((hj.a2) aVar4).f32335c.getChildAt(i12).setClickable(z11);
        }
    }

    public final void v(Word word, TextView textView, TextView textView2, TextView textView3) {
        boolean z11 = ((jp.p0) this.f47881a).Q;
        zq.c.e(word, textView, textView2, textView3, true);
    }

    public final void w(View view, Word word) {
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = ff.h.l(15.0f);
        TextView textView = (TextView) view.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
        kotlin.jvm.internal.m.c(textView2);
        Context context = this.f47883c;
        ff.h.L(context, textView2, 20);
        textView3.setVisibility(8);
        textView.setVisibility(8);
        View viewFindViewById = view.findViewById(R.id.ll_item);
        int[] iArr = bq.r.f4959a;
        if (bq.m.F()) {
            viewFindViewById.setPadding((int) context.getResources().getDimension(R.dimen.dp_4), (int) context.getResources().getDimension(R.dimen.dp_2), (int) context.getResources().getDimension(R.dimen.dp_4), (int) context.getResources().getDimension(R.dimen.dp_2));
        } else {
            viewFindViewById.setPadding((int) context.getResources().getDimension(R.dimen.word_card_padding_hor), (int) context.getResources().getDimension(R.dimen.word_card_padding_ver), (int) context.getResources().getDimension(R.dimen.word_card_padding_hor), (int) context.getResources().getDimension(R.dimen.word_card_padding_ver));
        }
        v(word, textView, textView2, textView3);
        view.setLayoutParams(layoutParams);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage)) && textView2.getPaddingTop() == 0) {
            textView2.setPadding(textView2.getPaddingLeft(), (int) fr.j3.Z(2, context), textView2.getPaddingRight(), (int) fr.j3.Z(2, context));
        }
    }

    public final void x() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.a2) aVar).f32335c.getChildCount();
        for (int i11 = 1; i11 < childCount; i11++) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            View childAt = ((hj.a2) aVar2).f32335c.getChildAt(i11);
            kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) childAt;
            View viewFindViewById = frameLayout.findViewById(R.id.ll_item);
            TextView textView = (TextView) viewFindViewById.findViewById(R.id.tv_middle);
            Object tag = frameLayout.getTag();
            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            if (kotlin.jvm.internal.m.a(((Word) tag).getWord(), "_____")) {
                viewFindViewById.setBackgroundResource(R.drawable.flexbox_grey_under_line);
                textView.setText(BuildConfig.VERSION_NAME);
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                layoutParams.width = ff.h.l(36.0f);
                frameLayout.setLayoutParams(layoutParams);
                bq.z.b(frameLayout, new n2(0, frameLayout, this));
            }
            int[] iArr = bq.r.f4959a;
            if (bq.m.F()) {
                viewFindViewById.setPadding(ff.h.l(CropImageView.DEFAULT_ASPECT_RATIO), ff.h.s(R.dimen.dp_2), ff.h.l(CropImageView.DEFAULT_ASPECT_RATIO), ff.h.s(R.dimen.dp_2));
            } else {
                viewFindViewById.setPadding(ff.h.l(CropImageView.DEFAULT_ASPECT_RATIO), ff.h.s(R.dimen.word_card_padding_ver), ff.h.l(CropImageView.DEFAULT_ASPECT_RATIO), ff.h.s(R.dimen.word_card_padding_ver));
            }
            frameLayout.requestLayout();
        }
    }

    public final void y() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        TextView textView = ((hj.a2) aVar).f32336d;
        Model_Sentence_100 model_Sentence_100 = this.f48179i;
        if (model_Sentence_100 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        textView.setText(model_Sentence_100.getSentence().getTranslations());
        Model_Sentence_100 model_Sentence_101 = this.f48179i;
        if (model_Sentence_101 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_101.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        q(zq.c.b(sentence));
    }
}
