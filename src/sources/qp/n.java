package qp;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Model_Sentence_050;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dt.Xk.wuoM;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Model_Sentence_050 f48063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f48064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f48065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f48066l;
    public List m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m f48067n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f48068o;

    public n(mp.b bVar, long j11) {
        super(bVar, j11);
        this.f48064j = new ArrayList();
        int[] iArr = bq.r.f4959a;
        this.f48068o = bq.m.b();
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_050 model_Sentence_050 = this.f48063i;
        if (model_Sentence_050 != null) {
            return fv.b.G(model_Sentence_050.getSentenceId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // hi.a
    public final String c() {
        return nv.p.m(this.f47882b, "1;", ";5");
    }

    @Override // qp.d, hi.a
    public final void f() {
        super.f();
        m mVar = this.f48067n;
        if (mVar != null) {
            mVar.d();
        }
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_050 model_Sentence_050 = this.f48063i;
        if (model_Sentence_050 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strH = fv.b.H(model_Sentence_050.getSentenceId());
        Model_Sentence_050 model_Sentence_051 = this.f48063i;
        if (model_Sentence_051 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        arrayList.add(new fv.a(2L, strH, fv.b.F(model_Sentence_051.getSentenceId())));
        if (!((jp.p0) this.f47881a).Q) {
            Model_Sentence_050 model_Sentence_052 = this.f48063i;
            if (model_Sentence_052 == null) {
                kotlin.jvm.internal.m.n("mModel");
                throw null;
            }
            for (Word word : model_Sentence_052.getOptionList()) {
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

    @Override // qp.d, hi.a
    public final String h() {
        return this.f47885e;
    }

    @Override // hi.a
    public final int i() {
        return 1;
    }

    @Override // hi.a
    public final void j() throws NoSuchElemException {
        Model_Sentence_050 model_Sentence_050LoadFullObject = Model_Sentence_050.loadFullObject(this.f47882b);
        if (model_Sentence_050LoadFullObject == null) {
            throw new NoSuchElemException();
        }
        this.f48063i = model_Sentence_050LoadFullObject;
    }

    @Override // hi.a
    public final void k() {
        Model_Sentence_050 model_Sentence_050 = this.f48063i;
        if (model_Sentence_050 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_050.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        q(zq.c.b(sentence));
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.l1) aVar).f32838c.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            View childAt = ((hj.l1) aVar2).f32838c.getChildAt(i11);
            kotlin.jvm.internal.m.e(childAt, "getChildAt(...)");
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            s(childAt, (Word) hh.p0.g(((hj.l1) aVar3).f32838c, i11, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word"));
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            ((hj.l1) aVar4).f32838c.getChildAt(i11).requestLayout();
        }
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        ((hj.l1) aVar5).f32838c.requestLayout();
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        FlexboxLayout flexboxLayout = ((hj.l1) aVar6).f32838c;
        flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new k(this, 0)), 0L);
    }

    @Override // qp.d
    public final fz.f n() {
        return l.f48021a;
    }

    @Override // qp.d
    public final void p() {
        Model_Sentence_050 model_Sentence_050 = this.f48063i;
        if (model_Sentence_050 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<List<Long>> answerList = model_Sentence_050.getAnswerList();
        kotlin.jvm.internal.m.e(answerList, "getAnswerList(...)");
        this.f48066l = answerList;
        ArrayList arrayList = new ArrayList();
        this.f48065k = arrayList;
        Model_Sentence_050 model_Sentence_051 = this.f48063i;
        if (model_Sentence_051 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> optionList = model_Sentence_051.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        arrayList.addAll(optionList);
        Model_Sentence_050 model_Sentence_052 = this.f48063i;
        if (model_Sentence_052 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> sentWords = model_Sentence_052.getSentence().getSentWords();
        kotlin.jvm.internal.m.e(sentWords, "getSentWords(...)");
        this.m = sentWords;
        jp.p0 p0Var = (jp.p0) this.f47881a;
        p0Var.O(0);
        Model_Sentence_050 model_Sentence_053 = this.f48063i;
        if (model_Sentence_053 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_053.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        q(zq.c.b(sentence));
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.l1) aVar).f32840e.removeAllViews();
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.l1) aVar2).f32839d.removeAllViews();
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.l1) aVar3).f32838c.removeAllViews();
        this.f48064j.clear();
        ArrayList arrayList2 = this.f48065k;
        if (arrayList2 == null) {
            kotlin.jvm.internal.m.n("options");
            throw null;
        }
        Collections.shuffle(arrayList2);
        ArrayList arrayList3 = this.f48065k;
        if (arrayList3 == null) {
            kotlin.jvm.internal.m.n("options");
            throw null;
        }
        int size = arrayList3.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList3.get(i11);
            i11++;
            Word word = (Word) obj;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f47883c);
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_word_card_framlayout, (ViewGroup) ((hj.l1) aVar4).f32838c, false);
            kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            View view = (FrameLayout) viewInflate;
            view.setBackgroundResource(R.drawable.item_leave);
            view.setTag(word);
            s(view, word);
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            ((hj.l1) aVar5).f32838c.addView(view);
            view.findViewById(R.id.card_item).setTag(word);
        }
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        FlexboxLayout flexboxLayout = ((hj.l1) aVar6).f32838c;
        flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new k(this, 1)), 0L);
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        TextView textView = ((hj.l1) aVar7).f32837b.f32356b;
        Model_Sentence_050 model_Sentence_054 = this.f48063i;
        if (model_Sentence_054 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String translations = model_Sentence_054.getSentence().getTranslations();
        kotlin.jvm.internal.m.e(translations, "getTranslations(...)");
        textView.setText(translations);
        ImageView imageView = (ImageView) o().findViewById(R.id.iv_audio);
        Env env = this.f47884d;
        if (!env.isAudioModel || p0Var.Q) {
            imageView.setVisibility(8);
        } else {
            kotlin.jvm.internal.m.c(imageView);
            bq.z.b(imageView, new n0.w0(16, this, imageView));
            ta.a aVar8 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar8);
            RelativeLayout rootParent = ((hj.l1) aVar8).f32842g;
            kotlin.jvm.internal.m.e(rootParent, "rootParent");
            bq.z.b(rootParent, new ih.c(imageView, 2));
            int[] iArr = bq.r.f4959a;
            if (bq.m.F()) {
                ta.a aVar9 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar9);
                ((hj.l1) aVar9).f32842g.performClick();
            }
        }
        if (p0Var.Q) {
            int[] iArr2 = bq.r.f4959a;
            if (bq.m.F()) {
                p0Var.I(b());
            }
        }
        ta.a aVar10 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar10);
        ((hj.l1) aVar10).f32841f.setVisibility(4);
        m mVar = new m(this, this.f47884d, this.f47883c, o(), new n9.q(this, 11), 0);
        this.f48067n = mVar;
        mVar.e();
        ef.e.B(o());
        imageView.performClick();
        ta.a aVar11 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar11);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ((hj.l1) aVar11).f32837b.f32359e;
        Collection collection = (Collection) this.f48068o.get(0);
        jz.d dVar = jz.e.f37397a;
        lottieAnimationView.setAnimation(((Number) ry.m.I0(collection)).intValue());
        ta.a aVar12 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar12);
        ((LottieAnimationView) ((hj.l1) aVar12).f32837b.f32359e).setRepeatCount(-1);
        if (env.showAnim) {
            ta.a aVar13 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar13);
            ((LottieAnimationView) ((hj.l1) aVar13).f32837b.f32359e).h();
        } else {
            ta.a aVar14 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar14);
            ((LottieAnimationView) ((hj.l1) aVar14).f32837b.f32359e).e();
        }
    }

    public final void r() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        if (((hj.l1) aVar).f32838c.getChildCount() <= 0) {
            return;
        }
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        View childAt = ((hj.l1) aVar2).f32838c.getChildAt(0);
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.l1) aVar3).f32838c.getFlexLines().size();
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((hj.l1) aVar4).f32840e.removeAllViews();
        for (int i11 = 0; i11 < 2; i11++) {
            View view = new View(this.f47883c);
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            view.setLayoutParams(new FlexboxLayout.LayoutParams(((hj.l1) aVar5).f32838c.getWidth(), childAt.getHeight()));
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            ((hj.l1) aVar6).f32840e.addView(view);
        }
    }

    public final void s(View view, Word word) {
        View viewFindViewById = view.findViewById(R.id.card_item);
        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
        CardView cardView = (CardView) viewFindViewById;
        Context context = this.f47883c;
        kotlin.jvm.internal.m.f(context, "context");
        cardView.setCardBackgroundColor(context.getColor(R.color.white));
        cardView.setCardElevation(ff.h.l(2.0f));
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
        TextView textView = (TextView) view.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
        textView3.setVisibility(8);
        textView.setVisibility(8);
        view.findViewById(R.id.ll_item).setPadding((int) context.getResources().getDimension(R.dimen.word_card_padding_hor), (int) context.getResources().getDimension(R.dimen.word_card_padding_ver), (int) context.getResources().getDimension(R.dimen.word_card_padding_hor), (int) context.getResources().getDimension(R.dimen.word_card_padding_ver));
        kotlin.jvm.internal.m.c(textView2);
        boolean z11 = ((jp.p0) this.f47881a).Q;
        zq.c.e(word, textView, textView2, textView3, true);
        view.setLayoutParams(layoutParams);
    }

    @Override // hi.a
    public final boolean a() {
        ArrayList arrayList;
        boolean z11;
        ArrayList arrayList2 = new ArrayList();
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.l1) aVar).f32839d.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            Word word = (Word) hh.p0.g(((hj.l1) aVar2).f32839d, i11, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            if (word.getWordType() != 1) {
                arrayList2.add(word);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        List<Word> list = this.m;
        if (list == null) {
            kotlin.jvm.internal.m.n("answerWords");
            throw null;
        }
        for (Word word2 : list) {
            if (word2.getWordType() != 1) {
                arrayList3.add(word2);
            }
        }
        List<List> list2 = this.f48066l;
        if (list2 == null) {
            kotlin.jvm.internal.m.n("answers");
            throw null;
        }
        boolean z12 = false;
        for (List list3 : list2) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                Word wordH = ij.c.h(((Number) it.next()).longValue());
                if (wordH != null && wordH.getWordType() != 1) {
                    arrayList4.add(wordH);
                }
            }
            if (arrayList2.size() == arrayList3.size() || arrayList2.size() == arrayList4.size()) {
                if (arrayList2.size() == arrayList3.size()) {
                    int size = arrayList3.size();
                    z11 = true;
                    for (int i12 = 0; i12 < size; i12++) {
                        Word word3 = (Word) arrayList3.get(i12);
                        Word word4 = (Word) arrayList2.get(i12);
                        if (word3.getWordId() != word4.getWordId() && !kotlin.jvm.internal.m.a(word3.getWord(), word4.getWord())) {
                            z11 = false;
                        }
                    }
                } else if (arrayList2.size() == arrayList4.size()) {
                    int size2 = arrayList4.size();
                    z11 = true;
                    for (int i13 = 0; i13 < size2; i13++) {
                        Word word5 = (Word) arrayList4.get(i13);
                        Word word6 = (Word) arrayList2.get(i13);
                        if (word5.getWordId() != word6.getWordId() && !kotlin.jvm.internal.m.a(word5.getWord(), word6.getWord())) {
                            z11 = false;
                        }
                    }
                }
                z12 = z11;
            }
        }
        if (!z12) {
            ArrayList arrayList5 = new ArrayList();
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            int childCount2 = ((hj.l1) aVar3).f32839d.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                ta.a aVar4 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                Word word7 = (Word) hh.p0.g(((hj.l1) aVar4).f32839d, i14, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                if (word7.getWordType() != 1) {
                    arrayList5.add(word7);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Model_Sentence_050 model_Sentence_050 = this.f48063i;
            String str = wuoM.czEeJirmV;
            if (model_Sentence_050 == null) {
                kotlin.jvm.internal.m.n(str);
                throw null;
            }
            Sentence sentence = model_Sentence_050.getSentence();
            kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
            int size3 = gb.r.u(sentence).size();
            int i15 = 0;
            int i16 = 0;
            while (i15 < size3) {
                Model_Sentence_050 model_Sentence_051 = this.f48063i;
                if (model_Sentence_051 == null) {
                    kotlin.jvm.internal.m.n(str);
                    throw null;
                }
                Sentence sentence2 = model_Sentence_051.getSentence();
                kotlin.jvm.internal.m.e(sentence2, "getSentence(...)");
                Word word8 = (Word) gb.r.u(sentence2).get(i15);
                SpannableString spannableString = new SpannableString(word8.getWord());
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (cf.x.n().keyLanguage == 10 || cf.x.n().keyLanguage == 22) {
                    String word9 = word8.getWord();
                    kotlin.jvm.internal.m.e(word9, "getWord(...)");
                    spannableString = new SpannableString(oz.x.q0(word9, "́", BuildConfig.VERSION_NAME));
                }
                Context context = this.f47883c;
                kotlin.jvm.internal.m.f(context, "context");
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(context.getColor(R.color.color_answer_btm));
                int i17 = size3;
                if (word8.getWordType() != 1) {
                    if (i16 < arrayList5.size()) {
                        Word word10 = (Word) arrayList5.get(i16);
                        String word11 = word8.getWord();
                        kotlin.jvm.internal.m.e(word11, "getWord(...)");
                        Locale locale = Locale.getDefault();
                        arrayList = arrayList5;
                        kotlin.jvm.internal.m.e(locale, "getDefault(...)");
                        String lowerCase = word11.toLowerCase(locale);
                        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                        String strV = gb.r.v(word10);
                        Locale locale2 = Locale.getDefault();
                        kotlin.jvm.internal.m.e(locale2, "getDefault(...)");
                        String lowerCase2 = strV.toLowerCase(locale2);
                        kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                        if (lowerCase.equals(lowerCase2) || word8.getWordId() == word10.getWordId()) {
                            foregroundColorSpan = foregroundColorSpan;
                        } else {
                            arrayList6.add(Integer.valueOf(i15));
                            foregroundColorSpan = new ForegroundColorSpan(context.getColor(R.color.color_wrong_high_light));
                        }
                    } else {
                        arrayList = arrayList5;
                        foregroundColorSpan = new ForegroundColorSpan(context.getColor(R.color.color_wrong_high_light));
                    }
                    i16++;
                } else {
                    arrayList = arrayList5;
                }
                spannableString.setSpan(foregroundColorSpan, 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                i15++;
                size3 = i17;
                arrayList5 = arrayList;
            }
            mp.b bVar = this.f47881a;
            kotlin.jvm.internal.m.d(bVar, "null cannot be cast to non-null type com.lingo.lingoskill.ui.learn.BaseLessonTestFragment");
            ((jp.p0) bVar).f36528d0 = new qh.d(1, this, spannableStringBuilder);
        }
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        ((LottieAnimationView) ((hj.l1) aVar5).f32837b.f32359e).e();
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        ((LottieAnimationView) ((hj.l1) aVar6).f32837b.f32359e).setRepeatCount(0);
        List list4 = this.f48068o;
        if (z12) {
            ta.a aVar7 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar7);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ((hj.l1) aVar7).f32837b.f32360f;
            Collection collection = (Collection) list4.get(1);
            jz.d dVar = jz.e.f37397a;
            lottieAnimationView.setAnimation(((Number) ry.m.I0(collection)).intValue());
        } else {
            ta.a aVar8 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar8);
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ((hj.l1) aVar8).f32837b.f32360f;
            Collection collection2 = (Collection) list4.get(2);
            jz.d dVar2 = jz.e.f37397a;
            lottieAnimationView2.setAnimation(((Number) ry.m.I0(collection2)).intValue());
        }
        if (this.f47884d.showAnim) {
            ta.a aVar9 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar9);
            ((LottieAnimationView) ((hj.l1) aVar9).f32837b.f32360f).d(new f(this, 1));
            return z12;
        }
        ta.a aVar10 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar10);
        ((LottieAnimationView) ((hj.l1) aVar10).f32837b.f32359e).e();
        return z12;
    }
}
