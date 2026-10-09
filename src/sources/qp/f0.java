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
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Model_Sentence_050;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Model_Sentence_050 f47916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f47917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f47918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f47919l;
    public List m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m f47920n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f47921o;

    public f0(mp.b bVar, long j11) {
        super(bVar, j11);
        this.f47917j = new ArrayList();
        int[] iArr = bq.r.f4959a;
        this.f47921o = bq.m.b();
    }

    @Override // hi.a
    public final boolean a() {
        ArrayList arrayList;
        boolean z11;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ArrayList arrayList2 = new ArrayList();
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        int childCount = ((hj.j1) aVar2).f32750d.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            Word word = (Word) hh.p0.g(((hj.j1) aVar3).f32750d, i11, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
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
        List<List> list2 = this.f47919l;
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
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            int childCount2 = ((hj.j1) aVar4).f32750d.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                ta.a aVar5 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                Word word7 = (Word) hh.p0.g(((hj.j1) aVar5).f32750d, i14, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                if (word7.getWordType() != 1) {
                    arrayList5.add(word7);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Model_Sentence_050 model_Sentence_050 = this.f47916i;
            if (model_Sentence_050 == null) {
                kotlin.jvm.internal.m.n("mModel");
                throw null;
            }
            Sentence sentence = model_Sentence_050.getSentence();
            kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
            int size3 = gb.r.u(sentence).size();
            int i15 = 0;
            int i16 = 0;
            while (i15 < size3) {
                Model_Sentence_050 model_Sentence_051 = this.f47916i;
                if (model_Sentence_051 == null) {
                    kotlin.jvm.internal.m.n("mModel");
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
            ((jp.p0) bVar).f36528d0 = new ob.l(29, this, spannableStringBuilder);
        }
        List list4 = this.f47921o;
        if (z12) {
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ((hj.j1) aVar6).f32748b.f33677e;
            Collection collection = (Collection) list4.get(1);
            jz.d dVar = jz.e.f37397a;
            lottieAnimationView.setAnimation(((Number) ry.m.I0(collection)).intValue());
        } else {
            ta.a aVar7 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar7);
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ((hj.j1) aVar7).f32748b.f33677e;
            Collection collection2 = (Collection) list4.get(2);
            jz.d dVar2 = jz.e.f37397a;
            lottieAnimationView2.setAnimation(((Number) ry.m.I0(collection2)).intValue());
        }
        if (this.f47884d.showAnim) {
            ta.a aVar8 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar8);
            ((LottieAnimationView) ((hj.j1) aVar8).f32748b.f33677e).d(new f(this, 3));
            return z12;
        }
        ta.a aVar9 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar9);
        ((LottieAnimationView) ((hj.j1) aVar9).f32748b.f33676d).e();
        return z12;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_050 model_Sentence_050 = this.f47916i;
        if (model_Sentence_050 != null) {
            return fv.b.G(model_Sentence_050.getSentenceId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // hi.a
    public final String c() {
        return nv.p.m(this.f47882b, "1;", ";4");
    }

    @Override // qp.d, hi.a
    public final void f() {
        super.f();
        m mVar = this.f47920n;
        if (mVar != null) {
            mVar.d();
        }
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_050 model_Sentence_050 = this.f47916i;
        if (model_Sentence_050 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strH = fv.b.H(model_Sentence_050.getSentenceId());
        Model_Sentence_050 model_Sentence_051 = this.f47916i;
        if (model_Sentence_051 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        arrayList.add(new fv.a(2L, strH, fv.b.F(model_Sentence_051.getSentenceId())));
        if (!((jp.p0) this.f47881a).Q) {
            Model_Sentence_050 model_Sentence_052 = this.f47916i;
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
        this.f47916i = model_Sentence_050LoadFullObject;
    }

    @Override // hi.a
    public final void k() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        Model_Sentence_050 model_Sentence_050 = this.f47916i;
        if (model_Sentence_050 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_050.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        q(zq.c.b(sentence));
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        int childCount = ((hj.j1) aVar3).f32749c.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            View childAt = ((hj.j1) aVar4).f32749c.getChildAt(i11);
            kotlin.jvm.internal.m.e(childAt, "getChildAt(...)");
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            t(childAt, (Word) hh.p0.g(((hj.j1) aVar5).f32749c, i11, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word"));
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            ((hj.j1) aVar6).f32749c.getChildAt(i11).requestLayout();
        }
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        ((hj.j1) aVar7).f32749c.requestLayout();
        ta.a aVar8 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar8);
        FlexboxLayout flexboxLayout = ((hj.j1) aVar8).f32749c;
        flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new d0(this, 0)), 0L);
    }

    @Override // qp.d
    public final fz.f n() {
        return e0.f47908a;
    }

    public final void r() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        FlexboxLayout flexboxLayout = ((hj.j1) aVar).f32749c;
        kotlin.jvm.internal.m.c(flexboxLayout);
        if (flexboxLayout.getChildCount() <= 0) {
            return;
        }
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        FlexboxLayout flexboxLayout2 = ((hj.j1) aVar2).f32749c;
        kotlin.jvm.internal.m.c(flexboxLayout2);
        View childAt = flexboxLayout2.getChildAt(0);
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        FlexboxLayout flexboxLayout3 = ((hj.j1) aVar3).f32749c;
        kotlin.jvm.internal.m.c(flexboxLayout3);
        flexboxLayout3.getFlexLines().size();
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        FlexboxLayout flexboxLayout4 = ((hj.j1) aVar4).f32751e;
        kotlin.jvm.internal.m.c(flexboxLayout4);
        flexboxLayout4.removeAllViews();
        for (int i11 = 0; i11 < 2; i11++) {
            View view = new View(this.f47883c);
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            FlexboxLayout flexboxLayout5 = ((hj.j1) aVar5).f32749c;
            kotlin.jvm.internal.m.c(flexboxLayout5);
            view.setLayoutParams(new FlexboxLayout.LayoutParams(flexboxLayout5.getWidth(), childAt.getHeight()));
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            FlexboxLayout flexboxLayout6 = ((hj.j1) aVar6).f32751e;
            kotlin.jvm.internal.m.c(flexboxLayout6);
            flexboxLayout6.addView(view);
        }
    }

    public final void s() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        android.support.v4.media.session.a.H(((hj.j1) aVar).f32748b.f33674b.getBackground());
        String strB = b();
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ImageView ivAudio = ((hj.j1) aVar2).f32748b.f33674b;
        kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
        ((jp.p0) this.f47881a).H(ivAudio, strB);
    }

    public final void t(View view, Word word) {
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

    @Override // qp.d
    public final void p() {
        Model_Sentence_050 model_Sentence_050 = this.f47916i;
        if (model_Sentence_050 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<List<Long>> answerList = model_Sentence_050.getAnswerList();
        kotlin.jvm.internal.m.e(answerList, "getAnswerList(...)");
        this.f47919l = answerList;
        ArrayList arrayList = new ArrayList();
        this.f47918k = arrayList;
        Model_Sentence_050 model_Sentence_051 = this.f47916i;
        if (model_Sentence_051 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> optionList = model_Sentence_051.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        arrayList.addAll(optionList);
        Model_Sentence_050 model_Sentence_052 = this.f47916i;
        if (model_Sentence_052 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> sentWords = model_Sentence_052.getSentence().getSentWords();
        kotlin.jvm.internal.m.e(sentWords, "getSentWords(...)");
        this.m = sentWords;
        final int i11 = 0;
        ((jp.p0) this.f47881a).O(0);
        Model_Sentence_050 model_Sentence_053 = this.f47916i;
        if (model_Sentence_053 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_053.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        q(zq.c.b(sentence));
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.j1) aVar).f32751e.removeAllViews();
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.j1) aVar2).f32750d.removeAllViews();
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.j1) aVar3).f32749c.removeAllViews();
        this.f47917j.clear();
        ArrayList arrayList2 = this.f47918k;
        String str = xTCJ.wYCz;
        if (arrayList2 == null) {
            kotlin.jvm.internal.m.n(str);
            throw null;
        }
        Collections.shuffle(arrayList2);
        ArrayList arrayList3 = this.f47918k;
        if (arrayList3 == null) {
            kotlin.jvm.internal.m.n(str);
            throw null;
        }
        int size = arrayList3.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList3.get(i12);
            i12++;
            Word word = (Word) obj;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f47883c);
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_word_card_framlayout, (ViewGroup) ((hj.j1) aVar4).f32749c, false);
            kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            View view = (FrameLayout) viewInflate;
            view.setBackgroundResource(R.drawable.item_leave);
            view.setTag(word);
            t(view, word);
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            ((hj.j1) aVar5).f32749c.addView(view);
            view.findViewById(R.id.card_item).setTag(word);
        }
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        FlexboxLayout flexboxLayout = ((hj.j1) aVar6).f32749c;
        final int i13 = 1;
        flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new d0(this, i13)), 0L);
        ImageView imageView = (ImageView) o().findViewById(R.id.iv_audio);
        kotlin.jvm.internal.m.c(imageView);
        bq.z.b(imageView, new fz.c(this) { // from class: qp.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f47868b;

            {
                this.f47868b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj2) {
                View it = (View) obj2;
                switch (i11) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        this.f47868b.s();
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        this.f47868b.s();
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        RelativeLayout relativeLayout = ((hj.j1) aVar7).f32753g;
        kotlin.jvm.internal.m.c(relativeLayout);
        bq.z.b(relativeLayout, new fz.c(this) { // from class: qp.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f47868b;

            {
                this.f47868b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj2) {
                View it = (View) obj2;
                switch (i13) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        this.f47868b.s();
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        this.f47868b.s();
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        Env env = this.f47884d;
        if (env.isAudioModel) {
            s();
        }
        ta.a aVar8 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar8);
        ((hj.j1) aVar8).f32752f.setVisibility(4);
        m mVar = new m(this, this.f47884d, this.f47883c, o(), new o20.i(this, 10), 1);
        this.f47920n = mVar;
        mVar.e();
        ef.e.B(o());
        ta.a aVar9 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar9);
        ((hj.j1) aVar9).f32754h.setOnTouchListener(new com.google.android.material.search.f(4));
        ta.a aVar10 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar10);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ((hj.j1) aVar10).f32748b.f33676d;
        Collection collection = (Collection) this.f47921o.get(0);
        jz.d dVar = jz.e.f37397a;
        lottieAnimationView.setAnimation(((Number) ry.m.I0(collection)).intValue());
        ta.a aVar11 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar11);
        ((LottieAnimationView) ((hj.j1) aVar11).f32748b.f33676d).setRepeatCount(-1);
        if (env.showAnim) {
            ta.a aVar12 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar12);
            ((LottieAnimationView) ((hj.j1) aVar12).f32748b.f33676d).h();
        } else {
            ta.a aVar13 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar13);
            ((LottieAnimationView) ((hj.j1) aVar13).f32748b.f33676d).e();
        }
    }
}
