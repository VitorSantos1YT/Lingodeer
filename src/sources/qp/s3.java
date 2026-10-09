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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.lingo.lingoskill.object.Model_Sentence_QA;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.b6;
import i0.pKy.shrCcjmOhAmRC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s3 extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Model_Sentence_QA f48187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f48188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f48189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f48190l;
    public m m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f48191n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f48192o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public hj.e3 f48193p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b6 f48194q;

    public s3(mp.b bVar, long j11) {
        super(bVar, j11);
        this.f48188j = new ArrayList();
    }

    @Override // hi.a
    public final boolean a() {
        boolean z11;
        ArrayList arrayList;
        String str;
        kotlin.jvm.internal.m.c(this.f48194q);
        ArrayList arrayList2 = new ArrayList();
        b6 b6Var = this.f48194q;
        kotlin.jvm.internal.m.c(b6Var);
        int childCount = ((FlexboxLayout) b6Var.f32407c).getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            b6 b6Var2 = this.f48194q;
            kotlin.jvm.internal.m.c(b6Var2);
            Word word = (Word) hh.p0.g((FlexboxLayout) b6Var2.f32407c, i11, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            if (word.getWordType() != 1) {
                arrayList2.add(word);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        List<Word> list = this.f48190l;
        if (list == null) {
            kotlin.jvm.internal.m.n("answerWords");
            throw null;
        }
        for (Word word2 : list) {
            if (word2.getWordType() != 1) {
                arrayList3.add(word2);
            }
        }
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
            if (z11) {
                return true;
            }
        } else {
            z11 = false;
        }
        if (z11) {
            return z11;
        }
        ArrayList arrayList4 = new ArrayList();
        b6 b6Var3 = this.f48194q;
        kotlin.jvm.internal.m.c(b6Var3);
        int childCount2 = ((FlexboxLayout) b6Var3.f32407c).getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            b6 b6Var4 = this.f48194q;
            kotlin.jvm.internal.m.c(b6Var4);
            Word word5 = (Word) hh.p0.g((FlexboxLayout) b6Var4.f32407c, i13, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            if (word5.getWordType() != 1) {
                arrayList4.add(word5);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Model_Sentence_QA model_Sentence_QA = this.f48187i;
        String str2 = "mModel";
        if (model_Sentence_QA == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_QA.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        int size2 = gb.r.u(sentence).size();
        int i14 = 0;
        int i15 = 0;
        while (i14 < size2) {
            Model_Sentence_QA model_Sentence_QA2 = this.f48187i;
            if (model_Sentence_QA2 == null) {
                kotlin.jvm.internal.m.n(str2);
                throw null;
            }
            Sentence sentence2 = model_Sentence_QA2.getSentence();
            kotlin.jvm.internal.m.e(sentence2, "getSentence(...)");
            Word word6 = (Word) gb.r.u(sentence2).get(i14);
            SpannableString spannableString = new SpannableString(word6.getWord());
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (cf.x.n().keyLanguage == 10 || cf.x.n().keyLanguage == 22) {
                String word7 = word6.getWord();
                kotlin.jvm.internal.m.e(word7, "getWord(...)");
                spannableString = new SpannableString(oz.x.q0(word7, "́", BuildConfig.VERSION_NAME));
            }
            Context context = this.f47883c;
            kotlin.jvm.internal.m.f(context, "context");
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(context.getColor(R.color.color_answer_btm));
            int i16 = size2;
            if (word6.getWordType() != 1) {
                if (i15 < arrayList4.size()) {
                    Word word8 = (Word) arrayList4.get(i15);
                    String word9 = word6.getWord();
                    kotlin.jvm.internal.m.e(word9, "getWord(...)");
                    Locale locale = Locale.getDefault();
                    arrayList = arrayList4;
                    kotlin.jvm.internal.m.e(locale, "getDefault(...)");
                    String lowerCase = word9.toLowerCase(locale);
                    kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                    String strV = gb.r.v(word8);
                    str = str2;
                    Locale locale2 = Locale.getDefault();
                    kotlin.jvm.internal.m.e(locale2, "getDefault(...)");
                    String lowerCase2 = strV.toLowerCase(locale2);
                    kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                    if (lowerCase.equals(lowerCase2) || word6.getWordId() == word8.getWordId()) {
                        foregroundColorSpan = foregroundColorSpan;
                    } else {
                        arrayList5.add(Integer.valueOf(i14));
                        foregroundColorSpan = new ForegroundColorSpan(context.getColor(R.color.color_wrong_high_light));
                    }
                } else {
                    arrayList = arrayList4;
                    str = str2;
                    foregroundColorSpan = new ForegroundColorSpan(context.getColor(R.color.color_wrong_high_light));
                }
                i15++;
            } else {
                arrayList = arrayList4;
                str = str2;
            }
            spannableString.setSpan(foregroundColorSpan, 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            i14++;
            size2 = i16;
            arrayList4 = arrayList;
            str2 = str;
        }
        mp.b bVar = this.f47881a;
        kotlin.jvm.internal.m.d(bVar, "null cannot be cast to non-null type com.lingo.lingoskill.ui.learn.BaseLessonTestFragment");
        ((jp.p0) bVar).f36528d0 = new qh.d(3, this, spannableStringBuilder);
        return z11;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_QA model_Sentence_QA = this.f48187i;
        if (model_Sentence_QA != null) {
            return fv.b.G(model_Sentence_QA.getSentenceId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // qp.d, hi.a
    public final void f() {
        super.f();
        m mVar = this.m;
        if (mVar != null) {
            mVar.d();
        }
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        Model_Sentence_QA model_Sentence_QA = this.f48187i;
        if (model_Sentence_QA == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        kotlin.jvm.internal.m.e(model_Sentence_QA.getSentence(), "getSentence(...)");
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_QA model_Sentence_QA2 = this.f48187i;
        if (model_Sentence_QA2 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strH = fv.b.H(model_Sentence_QA2.getSentenceId());
        Model_Sentence_QA model_Sentence_QA3 = this.f48187i;
        if (model_Sentence_QA3 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        arrayList.add(new fv.a(2L, strH, fv.b.F(model_Sentence_QA3.getSentenceId())));
        Model_Sentence_QA model_Sentence_QA4 = this.f48187i;
        if (model_Sentence_QA4 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strH2 = fv.b.H(model_Sentence_QA4.getSentenceStem());
        Model_Sentence_QA model_Sentence_QA5 = this.f48187i;
        if (model_Sentence_QA5 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        arrayList.add(new fv.a(2L, strH2, fv.b.F(model_Sentence_QA5.getSentenceStem())));
        if (!((jp.p0) this.f47881a).Q) {
            Model_Sentence_QA model_Sentence_QA6 = this.f48187i;
            if (model_Sentence_QA6 == null) {
                kotlin.jvm.internal.m.n("mModel");
                throw null;
            }
            for (Word word : model_Sentence_QA6.getOptionList()) {
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
        Model_Sentence_QA model_Sentence_QALoadFullObject = Model_Sentence_QA.loadFullObject(this.f47882b);
        if (model_Sentence_QALoadFullObject == null) {
            throw new NoSuchElemException();
        }
        this.f48187i = model_Sentence_QALoadFullObject;
    }

    @Override // hi.a
    public final void k() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        kotlin.jvm.internal.m.c(this.f48194q);
        Model_Sentence_QA model_Sentence_QA = this.f48187i;
        if (model_Sentence_QA == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_QA.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        q(zq.c.b(sentence));
        h hVar = this.f48191n;
        if (hVar == null) {
            kotlin.jvm.internal.m.n("sentenceLayout");
            throw null;
        }
        hVar.e();
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        int childCount = ((hj.q2) aVar2).f33138b.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            View childAt = ((hj.q2) aVar3).f33138b.getChildAt(i11);
            kotlin.jvm.internal.m.e(childAt, "getChildAt(...)");
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            s(childAt, (Word) hh.p0.g(((hj.q2) aVar4).f33138b, i11, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word"));
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            ((hj.q2) aVar5).f33138b.getChildAt(i11).requestLayout();
        }
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        ((hj.q2) aVar6).f33138b.requestLayout();
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        FlexboxLayout flexboxLayout = ((hj.q2) aVar7).f33138b;
        flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new q3(this, 0)), 0L);
    }

    @Override // qp.d
    public final fz.f n() {
        return r3.f48152a;
    }

    public final void r() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        if (((hj.q2) aVar).f33138b.getChildCount() <= 0) {
            return;
        }
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        View childAt = ((hj.q2) aVar2).f33138b.getChildAt(0);
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        int size = ((hj.q2) aVar3).f33138b.getFlexLines().size();
        if (size >= 2) {
            size = 2;
        }
        b6 b6Var = this.f48194q;
        kotlin.jvm.internal.m.c(b6Var);
        ((FlexboxLayout) b6Var.f32408d).removeAllViews();
        for (int i11 = 0; i11 < size; i11++) {
            View view = new View(this.f47883c);
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            view.setLayoutParams(new FlexboxLayout.LayoutParams(((hj.q2) aVar4).f33138b.getWidth(), childAt.getHeight()));
            b6 b6Var2 = this.f48194q;
            kotlin.jvm.internal.m.c(b6Var2);
            ((FlexboxLayout) b6Var2.f32408d).addView(view);
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
        viewFindViewById2.setPadding((int) context.getResources().getDimension(R.dimen.word_card_padding_hor), (int) context.getResources().getDimension(R.dimen.word_card_padding_ver), (int) context.getResources().getDimension(R.dimen.word_card_padding_hor), (int) context.getResources().getDimension(R.dimen.word_card_padding_ver));
        boolean z11 = ((jp.p0) this.f47881a).Q;
        zq.c.e(word, textView, textView2, textView3, true);
        view.setLayoutParams(layoutParams);
        ef.e.B(viewFindViewById2);
    }

    @Override // hi.a
    public final String c() {
        return nv.p.m(this.f47882b, shrCcjmOhAmRC.emZDiAD, ";8");
    }

    @Override // qp.d
    public final void p() {
        ArrayList arrayList = new ArrayList();
        this.f48189k = arrayList;
        Model_Sentence_QA model_Sentence_QA = this.f48187i;
        if (model_Sentence_QA == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> optionList = model_Sentence_QA.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        arrayList.addAll(optionList);
        Model_Sentence_QA model_Sentence_QA2 = this.f48187i;
        if (model_Sentence_QA2 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> sentWords = model_Sentence_QA2.getSentence().getSentWords();
        kotlin.jvm.internal.m.e(sentWords, "getSentWords(...)");
        this.f48190l = sentWords;
        mp.b bVar = this.f47881a;
        ((jp.p0) bVar).O(0);
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.q2) aVar).f33141e.removeAllViews();
        Model_Sentence_QA model_Sentence_QA3 = this.f48187i;
        if (model_Sentence_QA3 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        boolean zA = kotlin.jvm.internal.m.a(model_Sentence_QA3.getOptPosition(), "False");
        Context context = this.f47883c;
        if (zA) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            this.f48194q = b6.c(layoutInflaterFrom, ((hj.q2) aVar2).f33141e);
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            LinearLayout linearLayout = ((hj.q2) aVar3).f33141e;
            b6 b6Var = this.f48194q;
            linearLayout.addView(b6Var != null ? (LinearLayout) b6Var.f32406b : null);
            LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(context);
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            this.f48193p = hj.e3.d(layoutInflaterFrom2, ((hj.q2) aVar4).f33141e);
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            LinearLayout linearLayout2 = ((hj.q2) aVar5).f33141e;
            hj.e3 e3Var = this.f48193p;
            linearLayout2.addView(e3Var != null ? (ConstraintLayout) e3Var.f32523b : null);
        } else {
            LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(context);
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            this.f48193p = hj.e3.d(layoutInflaterFrom3, ((hj.q2) aVar6).f33141e);
            ta.a aVar7 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar7);
            LinearLayout linearLayout3 = ((hj.q2) aVar7).f33141e;
            hj.e3 e3Var2 = this.f48193p;
            linearLayout3.addView(e3Var2 != null ? (ConstraintLayout) e3Var2.f32523b : null);
            LayoutInflater layoutInflaterFrom4 = LayoutInflater.from(context);
            ta.a aVar8 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar8);
            this.f48194q = b6.c(layoutInflaterFrom4, ((hj.q2) aVar8).f33141e);
            ta.a aVar9 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar9);
            LinearLayout linearLayout4 = ((hj.q2) aVar9).f33141e;
            b6 b6Var2 = this.f48194q;
            linearLayout4.addView(b6Var2 != null ? (LinearLayout) b6Var2.f32406b : null);
        }
        Model_Sentence_QA model_Sentence_QA4 = this.f48187i;
        if (model_Sentence_QA4 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String translations = model_Sentence_QA4.getSentence().getTranslations();
        kotlin.jvm.internal.m.e(translations, bjXGJ.VMCIMIrK);
        if (translations.length() == 0) {
            b6 b6Var3 = this.f48194q;
            if (b6Var3 != null) {
                ((TextView) b6Var3.f32409e).setText("This is translation");
            }
        } else {
            b6 b6Var4 = this.f48194q;
            if (b6Var4 != null) {
                TextView textView = (TextView) b6Var4.f32409e;
                Model_Sentence_QA model_Sentence_QA5 = this.f48187i;
                if (model_Sentence_QA5 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                textView.setText(model_Sentence_QA5.getSentence().getTranslations());
            }
        }
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_QA model_Sentence_QA6 = this.f48187i;
        if (model_Sentence_QA6 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strG = fv.b.G(model_Sentence_QA6.getSentenceStem(), null, null);
        hj.e3 e3Var3 = this.f48193p;
        int i11 = 1;
        if (e3Var3 != null) {
            bq.z.b((ImageView) e3Var3.f32525d, new n2(i11, this, strG));
        }
        Model_Sentence_QA model_Sentence_QA7 = this.f48187i;
        if (model_Sentence_QA7 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> sentWords2 = model_Sentence_QA7.getSentence2().getSentWords();
        kotlin.jvm.internal.m.e(sentWords2, "getSentWords(...)");
        hj.e3 e3Var4 = this.f48193p;
        FlexboxLayout flexboxLayout = e3Var4 != null ? (FlexboxLayout) e3Var4.f32524c : null;
        kotlin.jvm.internal.m.c(flexboxLayout);
        bVar.getClass();
        h hVar = new h(context, sentWords2, flexboxLayout, this, 11);
        int[] iArr = bq.r.f4959a;
        if (!bq.m.F() || this.f47884d.csDisplay == 0) {
            hVar.f59274j = ff.h.l(2.0f);
        } else {
            hVar.f59274j = 2;
        }
        hVar.f59278o = false;
        hVar.f59277n = true;
        hVar.d();
        this.f48191n = hVar;
        Model_Sentence_QA model_Sentence_QA8 = this.f48187i;
        if (model_Sentence_QA8 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_QA8.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        q(zq.c.b(sentence));
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
            b6 b6Var5 = this.f48194q;
            kotlin.jvm.internal.m.c(b6Var5);
            ((FlexboxLayout) b6Var5.f32407c).setFlexDirection(1);
        }
        b6 b6Var6 = this.f48194q;
        kotlin.jvm.internal.m.c(b6Var6);
        ((FlexboxLayout) b6Var6.f32408d).removeAllViews();
        b6 b6Var7 = this.f48194q;
        kotlin.jvm.internal.m.c(b6Var7);
        ((FlexboxLayout) b6Var7.f32407c).removeAllViews();
        ta.a aVar10 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar10);
        ((hj.q2) aVar10).f33138b.removeAllViews();
        this.f48188j.clear();
        ArrayList arrayList2 = this.f48189k;
        if (arrayList2 == null) {
            kotlin.jvm.internal.m.n("options");
            throw null;
        }
        Collections.shuffle(arrayList2);
        ArrayList arrayList3 = this.f48189k;
        if (arrayList3 == null) {
            kotlin.jvm.internal.m.n("options");
            throw null;
        }
        int size = arrayList3.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList3.get(i12);
            i12++;
            Word word = (Word) obj;
            LayoutInflater layoutInflaterFrom5 = LayoutInflater.from(context);
            ta.a aVar11 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar11);
            View viewInflate = layoutInflaterFrom5.inflate(R.layout.item_word_card_framlayout, (ViewGroup) ((hj.q2) aVar11).f33138b, false);
            kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            View view = (FrameLayout) viewInflate;
            view.setBackgroundResource(R.drawable.item_leave);
            view.setTag(word);
            s(view, word);
            ta.a aVar12 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar12);
            ((hj.q2) aVar12).f33138b.addView(view);
            view.findViewById(R.id.card_item).setTag(word);
        }
        ta.a aVar13 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar13);
        FlexboxLayout flexboxLayout2 = ((hj.q2) aVar13).f33138b;
        flexboxLayout2.postDelayed(new b2.c(4, flexboxLayout2, new q3(this, 1)), 0L);
        jp.p0 p0Var = (jp.p0) bVar;
        if (p0Var.Q) {
            int[] iArr2 = bq.r.f4959a;
            if (bq.m.F()) {
                p0Var.I(b());
            }
        }
        ta.a aVar14 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar14);
        ((hj.q2) aVar14).f33140d.setVisibility(4);
        m mVar = new m(this, this.f47884d, this.f47883c, o(), new lp.j(this, 20), 5);
        this.m = mVar;
        mVar.e();
        ef.e.B(o());
    }
}
