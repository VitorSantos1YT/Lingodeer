package qp;

import am.rVFB.LwKl;
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
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Model_Sentence_050;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y1 extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Model_Sentence_050 f48267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f48268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f48269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f48270l;
    public List m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m f48271n;

    public y1(mp.b bVar, long j11) {
        super(bVar, j11);
        this.f48268j = new ArrayList();
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_050 model_Sentence_050 = this.f48267i;
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
        m mVar = this.f48271n;
        if (mVar != null) {
            mVar.d();
        }
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_050 model_Sentence_050 = this.f48267i;
        if (model_Sentence_050 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strH = fv.b.H(model_Sentence_050.getSentenceId());
        Model_Sentence_050 model_Sentence_051 = this.f48267i;
        if (model_Sentence_051 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        arrayList.add(new fv.a(2L, strH, fv.b.F(model_Sentence_051.getSentenceId())));
        if (!((jp.p0) this.f47881a).Q) {
            Model_Sentence_050 model_Sentence_052 = this.f48267i;
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
        this.f48267i = model_Sentence_050LoadFullObject;
    }

    @Override // hi.a
    public final void k() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        Model_Sentence_050 model_Sentence_050 = this.f48267i;
        if (model_Sentence_050 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_050.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        q(zq.c.b(sentence));
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        int childCount = ((hj.l2) aVar3).f32844b.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            View childAt = ((hj.l2) aVar4).f32844b.getChildAt(i11);
            kotlin.jvm.internal.m.e(childAt, "getChildAt(...)");
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            s(childAt, (Word) hh.p0.g(((hj.l2) aVar5).f32844b, i11, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word"));
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            ((hj.l2) aVar6).f32844b.getChildAt(i11).requestLayout();
        }
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        ((hj.l2) aVar7).f32844b.requestLayout();
        ta.a aVar8 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar8);
        FlexboxLayout flexboxLayout = ((hj.l2) aVar8).f32844b;
        flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new w1(this, 0)), 0L);
    }

    @Override // qp.d
    public final fz.f n() {
        return x1.f48255a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0190  */
    @Override // qp.d
    public final void p() {
        b();
        Model_Sentence_050 model_Sentence_050 = this.f48267i;
        if (model_Sentence_050 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<List<Long>> answerList = model_Sentence_050.getAnswerList();
        kotlin.jvm.internal.m.e(answerList, "getAnswerList(...)");
        this.f48270l = answerList;
        ArrayList arrayList = new ArrayList();
        this.f48269k = arrayList;
        Model_Sentence_050 model_Sentence_051 = this.f48267i;
        if (model_Sentence_051 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> optionList = model_Sentence_051.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        arrayList.addAll(optionList);
        Model_Sentence_050 model_Sentence_052 = this.f48267i;
        if (model_Sentence_052 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> sentWords = model_Sentence_052.getSentence().getSentWords();
        kotlin.jvm.internal.m.e(sentWords, "getSentWords(...)");
        this.m = sentWords;
        jp.p0 p0Var = (jp.p0) this.f47881a;
        p0Var.O(0);
        Model_Sentence_050 model_Sentence_053 = this.f48267i;
        if (model_Sentence_053 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_053.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        q(zq.c.b(sentence));
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
            ta.a aVar = this.f47886f;
            kotlin.jvm.internal.m.c(aVar);
            ((hj.l2) aVar).f32845c.setFlexDirection(1);
        }
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.l2) aVar2).f32846d.removeAllViews();
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.l2) aVar3).f32845c.removeAllViews();
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((hj.l2) aVar4).f32844b.removeAllViews();
        this.f48268j.clear();
        ArrayList arrayList2 = this.f48269k;
        if (arrayList2 == null) {
            kotlin.jvm.internal.m.n("options");
            throw null;
        }
        Collections.shuffle(arrayList2);
        ArrayList arrayList3 = this.f48269k;
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
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_word_card_framlayout, (ViewGroup) ((hj.l2) aVar5).f32844b, false);
            kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            View view = (FrameLayout) viewInflate;
            view.setBackgroundResource(R.drawable.item_leave);
            view.setTag(word);
            s(view, word);
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            ((hj.l2) aVar6).f32844b.addView(view);
            view.findViewById(R.id.card_item).setTag(word);
        }
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        FlexboxLayout flexboxLayout = ((hj.l2) aVar7).f32844b;
        flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new w1(this, 1)), 0L);
        ta.a aVar8 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar8);
        TextView textView = ((hj.l2) aVar8).f32849g;
        Model_Sentence_050 model_Sentence_054 = this.f48267i;
        if (model_Sentence_054 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String translations = model_Sentence_054.getSentence().getTranslations();
        kotlin.jvm.internal.m.e(translations, "getTranslations(...)");
        textView.setText(translations);
        ImageView imageView = (ImageView) o().findViewById(R.id.iv_audio);
        if (!this.f47884d.isAudioModel || p0Var.Q) {
            imageView.setVisibility(8);
        } else {
            kotlin.jvm.internal.m.c(imageView);
            bq.z.b(imageView, new n0.w0(25, this, imageView));
            ta.a aVar9 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar9);
            RelativeLayout relativeLayout = ((hj.l2) aVar9).f32848f;
            kotlin.jvm.internal.m.c(relativeLayout);
            bq.z.b(relativeLayout, new ih.c(imageView, 6));
            int[] iArr = bq.r.f4959a;
            if (bq.m.F()) {
                ta.a aVar10 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar10);
                RelativeLayout relativeLayout2 = ((hj.l2) aVar10).f32848f;
                kotlin.jvm.internal.m.c(relativeLayout2);
                relativeLayout2.performClick();
            } else {
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (cf.x.n().isTestAutoPlayAudio) {
                    ta.a aVar11 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar11);
                    RelativeLayout relativeLayout3 = ((hj.l2) aVar11).f32848f;
                    kotlin.jvm.internal.m.c(relativeLayout3);
                    relativeLayout3.performClick();
                }
            }
        }
        if (p0Var.Q) {
            int[] iArr2 = bq.r.f4959a;
            if (bq.m.F()) {
                p0Var.I(b());
            }
        }
        ta.a aVar12 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar12);
        ((hj.l2) aVar12).f32847e.setVisibility(4);
        m mVar = new m(this, this.f47884d, this.f47883c, o(), new n9.q(this, 15), 2);
        this.f48271n = mVar;
        mVar.e();
        ef.e.B(o());
    }

    public final void r() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        FlexboxLayout flexboxLayout = ((hj.l2) aVar).f32844b;
        kotlin.jvm.internal.m.c(flexboxLayout);
        if (flexboxLayout.getChildCount() <= 0) {
            return;
        }
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        FlexboxLayout flexboxLayout2 = ((hj.l2) aVar2).f32844b;
        kotlin.jvm.internal.m.c(flexboxLayout2);
        View childAt = flexboxLayout2.getChildAt(0);
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        FlexboxLayout flexboxLayout3 = ((hj.l2) aVar3).f32844b;
        kotlin.jvm.internal.m.c(flexboxLayout3);
        flexboxLayout3.getFlexLines().size();
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        FlexboxLayout flexboxLayout4 = ((hj.l2) aVar4).f32846d;
        kotlin.jvm.internal.m.c(flexboxLayout4);
        flexboxLayout4.removeAllViews();
        for (int i11 = 0; i11 < 2; i11++) {
            View view = new View(this.f47883c);
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            FlexboxLayout flexboxLayout5 = ((hj.l2) aVar5).f32844b;
            kotlin.jvm.internal.m.c(flexboxLayout5);
            view.setLayoutParams(new FlexboxLayout.LayoutParams(flexboxLayout5.getWidth(), childAt.getHeight()));
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            FlexboxLayout flexboxLayout6 = ((hj.l2) aVar6).f32846d;
            kotlin.jvm.internal.m.c(flexboxLayout6);
            flexboxLayout6.addView(view);
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
        kotlin.jvm.internal.m.c(textView2);
        ff.h.L(context, textView2, 20);
        textView3.setVisibility(8);
        textView.setVisibility(8);
        View viewFindViewById2 = view.findViewById(R.id.ll_item);
        int[] iArr = bq.r.f4959a;
        if (bq.m.F()) {
            viewFindViewById2.setPadding((int) context.getResources().getDimension(R.dimen.dp_4), (int) context.getResources().getDimension(R.dimen.dp_2), (int) context.getResources().getDimension(R.dimen.dp_4), (int) context.getResources().getDimension(R.dimen.dp_2));
        } else {
            viewFindViewById2.setPadding((int) context.getResources().getDimension(R.dimen.word_card_padding_hor), (int) context.getResources().getDimension(R.dimen.word_card_padding_ver), (int) context.getResources().getDimension(R.dimen.word_card_padding_hor), (int) context.getResources().getDimension(R.dimen.word_card_padding_ver));
        }
        boolean z11 = ((jp.p0) this.f47881a).Q;
        zq.c.e(word, textView, textView2, textView3, true);
        view.setLayoutParams(layoutParams);
        ef.e.B(viewFindViewById2);
    }

    @Override // hi.a
    public final boolean a() {
        int i11;
        SpannableString spannableString;
        String str;
        ForegroundColorSpan foregroundColorSpan;
        ArrayList arrayList;
        ForegroundColorSpan foregroundColorSpan2;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ArrayList arrayList2 = new ArrayList();
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        int childCount = ((hj.l2) aVar2).f32845c.getChildCount();
        String str2 = BuildConfig.VERSION_NAME;
        String strM = BuildConfig.VERSION_NAME;
        int i12 = 0;
        while (true) {
            i11 = 1;
            if (i12 >= childCount) {
                break;
            }
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            Word word = (Word) hh.p0.g(((hj.l2) aVar3).f32845c, i12, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            if (word.getWordType() != 1) {
                arrayList2.add(word);
            }
            strM = defpackage.e.m(strM, word.getWord());
            i12++;
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
        List<List> list2 = this.f48270l;
        if (list2 == null) {
            kotlin.jvm.internal.m.n("answers");
            throw null;
        }
        boolean z11 = false;
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
                    boolean z12 = true;
                    for (int i13 = 0; i13 < size; i13++) {
                        Word word3 = (Word) arrayList3.get(i13);
                        Word word4 = (Word) arrayList2.get(i13);
                        if (word3.getWordId() != word4.getWordId() && !kotlin.jvm.internal.m.a(word3.getWord(), word4.getWord())) {
                            z12 = false;
                        }
                    }
                    if (!z12) {
                        z11 = z12;
                    }
                    return true;
                }
                if (arrayList2.size() == arrayList4.size()) {
                    int size2 = arrayList4.size();
                    boolean z13 = true;
                    for (int i14 = 0; i14 < size2; i14++) {
                        Word word5 = (Word) arrayList4.get(i14);
                        Word word6 = (Word) arrayList2.get(i14);
                        if (word5.getWordId() != word6.getWordId() && !kotlin.jvm.internal.m.a(word5.getWord(), word6.getWord())) {
                            z13 = false;
                        }
                    }
                    if (z13) {
                        return true;
                    }
                    z11 = z13;
                } else {
                    continue;
                }
            }
        }
        if (z11) {
            return z11;
        }
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        String checkAnswerPrompt = this.f47884d.checkAnswerPrompt;
        kotlin.jvm.internal.m.e(checkAnswerPrompt, "checkAnswerPrompt");
        String strQ0 = oz.x.q0(checkAnswerPrompt, "userSentence%", strM);
        Model_Sentence_050 model_Sentence_050 = this.f48267i;
        String str3 = "mModel";
        if (model_Sentence_050 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String translations = model_Sentence_050.getSentence().getTranslations();
        kotlin.jvm.internal.m.e(translations, LwKl.WFAAmQeTlrRxWH);
        String strQ1 = oz.x.q0(strQ0, "translation%", translations);
        Model_Sentence_050 model_Sentence_051 = this.f48267i;
        if (model_Sentence_051 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String sentence = model_Sentence_051.getSentence().getSentence();
        String str4 = "getSentence(...)";
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        oz.x.q0(strQ1, "correctSentence%", sentence);
        ArrayList arrayList5 = new ArrayList();
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        int childCount2 = ((hj.l2) aVar4).f32845c.getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            Word word7 = (Word) hh.p0.g(((hj.l2) aVar5).f32845c, i15, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            if (word7.getWordType() != 1) {
                arrayList5.add(word7);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Model_Sentence_050 model_Sentence_052 = this.f48267i;
        if (model_Sentence_052 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence2 = model_Sentence_052.getSentence();
        kotlin.jvm.internal.m.e(sentence2, "getSentence(...)");
        int size3 = gb.r.u(sentence2).size();
        int i16 = 0;
        int i17 = 0;
        while (i16 < size3) {
            Model_Sentence_050 model_Sentence_053 = this.f48267i;
            if (model_Sentence_053 == null) {
                kotlin.jvm.internal.m.n(str3);
                throw null;
            }
            Sentence sentence3 = model_Sentence_053.getSentence();
            kotlin.jvm.internal.m.e(sentence3, str4);
            Word word8 = (Word) gb.r.u(sentence3).get(i16);
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            if ((cf.x.n().keyLanguage == i11 || cf.x.n().keyLanguage == 12) && cf.x.n().jsDisPlay == 2 && !kotlin.jvm.internal.m.a(word8.getWord(), " ")) {
                String word9 = word8.getWord();
                kotlin.jvm.internal.m.e(word9, "getWord(...)");
                spannableString = new SpannableString(oz.x.q0(word9, " ", str2));
            } else {
                spannableString = new SpannableString(word8.getWord());
            }
            if (cf.x.n().keyLanguage == 10 || cf.x.n().keyLanguage == 22) {
                String word10 = word8.getWord();
                kotlin.jvm.internal.m.e(word10, "getWord(...)");
                spannableString = new SpannableString(oz.x.q0(word10, "́", str2));
            }
            Context context = this.f47883c;
            String str5 = str2;
            kotlin.jvm.internal.m.f(context, "context");
            ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(context.getColor(R.color.color_answer_btm));
            String str6 = str3;
            if (word8.getWordType() != 1) {
                if (kotlin.jvm.internal.m.a(word8.getWord(), "-")) {
                    str = str4;
                    foregroundColorSpan = foregroundColorSpan3;
                    if (!ry.l.D(new Integer[]{5, 15, 53, 54}, Integer.valueOf(cf.x.n().keyLanguage))) {
                    }
                    spannableString.setSpan(foregroundColorSpan2, 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    i16++;
                    str2 = str5;
                    str3 = str6;
                    str4 = str;
                    arrayList5 = arrayList;
                    i11 = 1;
                } else {
                    str = str4;
                    foregroundColorSpan = foregroundColorSpan3;
                }
                if (i17 < arrayList5.size()) {
                    Word word11 = (Word) arrayList5.get(i17);
                    String word12 = word8.getWord();
                    kotlin.jvm.internal.m.e(word12, "getWord(...)");
                    Locale locale = Locale.getDefault();
                    kotlin.jvm.internal.m.e(locale, "getDefault(...)");
                    String lowerCase = word12.toLowerCase(locale);
                    kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                    String strV = gb.r.v(word11);
                    arrayList = arrayList5;
                    Locale locale2 = Locale.getDefault();
                    kotlin.jvm.internal.m.e(locale2, "getDefault(...)");
                    String lowerCase2 = strV.toLowerCase(locale2);
                    kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                    if (lowerCase.equals(lowerCase2) || word8.getWordId() == word11.getWordId()) {
                        foregroundColorSpan2 = foregroundColorSpan;
                    } else {
                        arrayList6.add(Integer.valueOf(i16));
                        foregroundColorSpan2 = new ForegroundColorSpan(context.getColor(R.color.color_wrong_high_light));
                    }
                } else {
                    arrayList = arrayList5;
                    foregroundColorSpan2 = new ForegroundColorSpan(context.getColor(R.color.color_wrong_high_light));
                }
                i17++;
                spannableString.setSpan(foregroundColorSpan2, 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                i16++;
                str2 = str5;
                str3 = str6;
                str4 = str;
                arrayList5 = arrayList;
                i11 = 1;
            } else {
                str = str4;
                foregroundColorSpan = foregroundColorSpan3;
            }
            arrayList = arrayList5;
            foregroundColorSpan2 = foregroundColorSpan;
            spannableString.setSpan(foregroundColorSpan2, 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            i16++;
            str2 = str5;
            str3 = str6;
            str4 = str;
            arrayList5 = arrayList;
            i11 = 1;
        }
        mp.b bVar = this.f47881a;
        kotlin.jvm.internal.m.d(bVar, "null cannot be cast to non-null type com.lingo.lingoskill.ui.learn.BaseLessonTestFragment");
        ((jp.p0) bVar).f36528d0 = new b(1, this, spannableStringBuilder);
        return z11;
    }
}
