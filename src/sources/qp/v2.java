package qp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.type.bACG.scNRoQgKSYX;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Model_Sentence_070;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v2 extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Model_Sentence_070 f48224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f48225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f48226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f48227l;
    public h m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m f48228n;

    public v2(mp.b bVar, long j11) {
        super(bVar, j11);
        this.f48225j = new ArrayList();
        this.f48227l = BuildConfig.VERSION_NAME;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hi.a
    public final boolean a() {
        int i11 = 0;
        String[] strArr = (String[]) oz.q.W0(this.f48227l, new String[]{"!@@@!"}, 0, 6).toArray(new String[0]);
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.b2) aVar).f32377c.getChildCount();
        String str = BuildConfig.VERSION_NAME;
        for (int i12 = 0; i12 < childCount; i12++) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            str = defpackage.e.m(str, ((Word) hh.p0.g(((hj.b2) aVar2).f32377c, i12, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word")).getTranslations());
        }
        int length = strArr.length;
        int i13 = 0;
        while (i13 < length) {
            String str2 = strArr[i13];
            kotlin.jvm.internal.m.f(str, "str");
            Pattern patternCompile = Pattern.compile("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]");
            kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
            String strReplaceAll = patternCompile.matcher(str).replaceAll(BuildConfig.VERSION_NAME);
            int i14 = 1;
            int iB = w4.c.b(1, strReplaceAll, "replaceAll(...)");
            int i15 = i11;
            int i16 = i15;
            while (i15 <= iB) {
                int i17 = kotlin.jvm.internal.m.h(strReplaceAll.charAt(i16 == 0 ? i15 : iB), 32) <= 0 ? 1 : i16;
                if (i16 != 0) {
                    if (i17 == 0) {
                        i14 = 1;
                        break;
                    }
                    iB--;
                } else if (i17 == 0) {
                    i14 = 1;
                    i16 = 1;
                } else {
                    i15++;
                }
                i14 = 1;
            }
            String input = w4.c.g(strReplaceAll, iB, i14, i15);
            Pattern patternCompile2 = Pattern.compile(" ");
            kotlin.jvm.internal.m.e(patternCompile2, "compile(...)");
            kotlin.jvm.internal.m.f(input, "input");
            String strReplaceAll2 = patternCompile2.matcher(input).replaceAll(BuildConfig.VERSION_NAME);
            kotlin.jvm.internal.m.e(strReplaceAll2, "replaceAll(...)");
            Locale locale = Locale.getDefault();
            kotlin.jvm.internal.m.e(locale, "getDefault(...)");
            kotlin.jvm.internal.m.e(strReplaceAll2.toLowerCase(locale), "toLowerCase(...)");
            kotlin.jvm.internal.m.f(str2, "str");
            Pattern patternCompile3 = Pattern.compile("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]");
            kotlin.jvm.internal.m.e(patternCompile3, "compile(...)");
            String strReplaceAll3 = patternCompile3.matcher(str2).replaceAll(BuildConfig.VERSION_NAME);
            String[] strArr2 = strArr;
            int iB2 = w4.c.b(1, strReplaceAll3, "replaceAll(...)");
            int i18 = length;
            int i19 = i16;
            int i21 = i19;
            while (true) {
                i13 = i13;
                if (i19 > iB2) {
                    break;
                }
                int i22 = i21;
                int i23 = kotlin.jvm.internal.m.h(strReplaceAll3.charAt(i21 == 0 ? i19 : iB2), 32) <= 0 ? 1 : i16;
                if (i22 != 0) {
                    if (i23 == 0) {
                        break;
                    }
                    iB2--;
                } else if (i23 == 0) {
                    i21 = 1;
                } else {
                    i19++;
                }
                i21 = i22;
            }
            String input2 = w4.c.g(strReplaceAll3, iB2, 1, i19);
            Pattern patternCompile4 = Pattern.compile(" ");
            kotlin.jvm.internal.m.e(patternCompile4, "compile(...)");
            kotlin.jvm.internal.m.f(input2, "input");
            String strReplaceAll4 = patternCompile4.matcher(input2).replaceAll(BuildConfig.VERSION_NAME);
            kotlin.jvm.internal.m.e(strReplaceAll4, "replaceAll(...)");
            Locale locale2 = Locale.getDefault();
            kotlin.jvm.internal.m.e(locale2, "getDefault(...)");
            kotlin.jvm.internal.m.e(strReplaceAll4.toLowerCase(locale2), "toLowerCase(...)");
            Pattern patternCompile5 = Pattern.compile("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]");
            kotlin.jvm.internal.m.e(patternCompile5, "compile(...)");
            String strReplaceAll5 = patternCompile5.matcher(str).replaceAll(BuildConfig.VERSION_NAME);
            kotlin.jvm.internal.m.e(strReplaceAll5, "replaceAll(...)");
            int length2 = strReplaceAll5.length() - 1;
            int i24 = i16;
            int i25 = i24;
            while (i25 <= length2) {
                int i26 = i24;
                int i27 = kotlin.jvm.internal.m.h(strReplaceAll5.charAt(i24 == 0 ? i25 : length2), 32) <= 0 ? 1 : i16;
                if (i26 != 0) {
                    if (i27 == 0) {
                        break;
                    }
                    length2--;
                } else if (i27 == 0) {
                    i24 = 1;
                } else {
                    i25++;
                }
                i24 = i26;
            }
            String input3 = w4.c.g(strReplaceAll5, length2, 1, i25);
            Pattern patternCompile6 = Pattern.compile(" ");
            kotlin.jvm.internal.m.e(patternCompile6, "compile(...)");
            kotlin.jvm.internal.m.f(input3, "input");
            String strReplaceAll6 = patternCompile6.matcher(input3).replaceAll(BuildConfig.VERSION_NAME);
            kotlin.jvm.internal.m.e(strReplaceAll6, "replaceAll(...)");
            Locale locale3 = Locale.getDefault();
            kotlin.jvm.internal.m.e(locale3, "getDefault(...)");
            String lowerCase = strReplaceAll6.toLowerCase(locale3);
            kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
            String strS = nv.p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", str2, BuildConfig.VERSION_NAME, "replaceAll(...)");
            int length3 = strS.length() - 1;
            int i28 = i16;
            int i29 = i28;
            while (i29 <= length3) {
                int i30 = kotlin.jvm.internal.m.h(strS.charAt(i28 == 0 ? i29 : length3), 32) <= 0 ? 1 : i16;
                if (i28 != 0) {
                    if (i30 == 0) {
                        break;
                    }
                    length3--;
                } else if (i30 == 0) {
                    i28 = 1;
                } else {
                    i29++;
                }
            }
            String input4 = w4.c.g(strS, length3, 1, i29);
            Pattern patternCompile7 = Pattern.compile(" ");
            kotlin.jvm.internal.m.e(patternCompile7, "compile(...)");
            kotlin.jvm.internal.m.f(input4, "input");
            String strReplaceAll7 = patternCompile7.matcher(input4).replaceAll(BuildConfig.VERSION_NAME);
            kotlin.jvm.internal.m.e(strReplaceAll7, "replaceAll(...)");
            Locale locale4 = Locale.getDefault();
            kotlin.jvm.internal.m.e(locale4, "getDefault(...)");
            String lowerCase2 = strReplaceAll7.toLowerCase(locale4);
            kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
            if (lowerCase.equals(lowerCase2)) {
                return true;
            }
            i13++;
            i11 = i16;
            strArr = strArr2;
            length = i18;
        }
        boolean z11 = i11;
        mp.b bVar = this.f47881a;
        kotlin.jvm.internal.m.d(bVar, "null cannot be cast to non-null type com.lingo.lingoskill.ui.learn.BaseLessonTestFragment");
        ((jp.p0) bVar).f36528d0 = new o20.i(this, 14);
        return z11;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_070 model_Sentence_070 = this.f48224i;
        if (model_Sentence_070 != null) {
            return fv.b.G(model_Sentence_070.getSentenceId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // hi.a
    public final String c() {
        return nv.p.m(this.f47882b, "1;", ";12");
    }

    @Override // qp.d, hi.a
    public final void f() {
        super.f();
        m mVar = this.f48228n;
        if (mVar != null) {
            mVar.d();
        }
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
        Model_Sentence_070 model_Sentence_070LoadFullObject = Model_Sentence_070.loadFullObject(this.f47882b);
        if (model_Sentence_070LoadFullObject == null) {
            throw new NoSuchElemException();
        }
        this.f48224i = model_Sentence_070LoadFullObject;
        if (model_Sentence_070LoadFullObject.getOptionList().size() == 0) {
            throw new NoSuchElemException();
        }
    }

    @Override // hi.a
    public final void k() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        t();
        Model_Sentence_070 model_Sentence_070 = this.f48224i;
        if (model_Sentence_070 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_070.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        q(zq.c.b(sentence));
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        int childCount = ((hj.b2) aVar3).f32376b.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            View childAt = ((hj.b2) aVar4).f32376b.getChildAt(i11);
            kotlin.jvm.internal.m.e(childAt, "getChildAt(...)");
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            s(childAt, (Word) hh.p0.g(((hj.b2) aVar5).f32376b, i11, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word"));
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            ((hj.b2) aVar6).f32376b.getChildAt(i11).requestLayout();
        }
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        FlexboxLayout flexboxLayout = ((hj.b2) aVar7).f32376b;
        flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new t2(this, 0)), 0L);
    }

    @Override // qp.d
    public final fz.f n() {
        return u2.f48214a;
    }

    public final void r() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        if (((hj.b2) aVar).f32376b.getChildCount() <= 0) {
            return;
        }
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        View childAt = ((hj.b2) aVar2).f32376b.getChildAt(0);
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.b2) aVar3).f32376b.getFlexLines().size();
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((hj.b2) aVar4).f32378d.removeAllViews();
        for (int i11 = 0; i11 < 2; i11++) {
            View view = new View(this.f47883c);
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            view.setLayoutParams(new FlexboxLayout.LayoutParams(((hj.b2) aVar5).f32376b.getWidth(), childAt.getHeight()));
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            ((hj.b2) aVar6).f32378d.addView(view);
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
        kotlin.jvm.internal.m.c(textView2);
        ff.h.L(context, textView2, 20);
        View viewFindViewById2 = view.findViewById(R.id.ll_item);
        viewFindViewById2.setPadding(ff.h.l(10.0f), ff.h.l(6.0f), ff.h.l(10.0f), ff.h.l(6.0f));
        textView.setVisibility(8);
        textView2.setVisibility(0);
        textView2.setText(word.getTranslations());
        textView3.setVisibility(8);
        view.setLayoutParams(layoutParams);
        ef.e.B(viewFindViewById2);
    }

    public final void t() {
        View viewFindViewById = o().findViewById(R.id.flex_container);
        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
        FlexboxLayout flexboxLayout = (FlexboxLayout) viewFindViewById;
        Model_Sentence_070 model_Sentence_070 = this.f48224i;
        if (model_Sentence_070 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> sentWords = model_Sentence_070.getSentence().getSentWords();
        kotlin.jvm.internal.m.e(sentWords, "getSentWords(...)");
        this.m = new h(flexboxLayout, this, this.f47883c, sentWords);
        int[] iArr = bq.r.f4959a;
        if (bq.m.F()) {
            h hVar = this.m;
            if (hVar == null) {
                kotlin.jvm.internal.m.n("sentenceLayout");
                throw null;
            }
            hVar.f59274j = 2;
        } else {
            h hVar2 = this.m;
            if (hVar2 == null) {
                kotlin.jvm.internal.m.n("sentenceLayout");
                throw null;
            }
            hVar2.f59274j = ff.h.l(2.0f);
        }
        h hVar3 = this.m;
        if (hVar3 == null) {
            kotlin.jvm.internal.m.n("sentenceLayout");
            throw null;
        }
        hVar3.m = new lf.x0(this, 22);
        hVar3.d();
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_070 model_Sentence_070 = this.f48224i;
        if (model_Sentence_070 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strH = fv.b.H(model_Sentence_070.getSentenceId());
        Model_Sentence_070 model_Sentence_071 = this.f48224i;
        if (model_Sentence_071 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        arrayList.add(new fv.a(2L, strH, fv.b.F(model_Sentence_071.getSentenceId())));
        if (!((jp.p0) this.f47881a).Q) {
            Model_Sentence_070 model_Sentence_072 = this.f48224i;
            if (model_Sentence_072 == null) {
                kotlin.jvm.internal.m.n("mModel");
                throw null;
            }
            Sentence sentence = model_Sentence_072.getSentence();
            kotlin.jvm.internal.m.e(sentence, anrPHlQ.okQwGz);
            for (Word word : sentence.getSentWords()) {
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

    @Override // qp.d
    public final void p() {
        b();
        Model_Sentence_070 model_Sentence_070 = this.f48224i;
        if (model_Sentence_070 != null) {
            String answer = model_Sentence_070.getAnswer();
            kotlin.jvm.internal.m.e(answer, "getAnswer(...)");
            this.f48227l = answer;
            Model_Sentence_070 model_Sentence_071 = this.f48224i;
            if (model_Sentence_071 != null) {
                List<Word> optionList = model_Sentence_071.getOptionList();
                kotlin.jvm.internal.m.e(optionList, scNRoQgKSYX.eXNugKPHxqa);
                this.f48226k = optionList;
                ((jp.p0) this.f47881a).O(0);
                t();
                Model_Sentence_070 model_Sentence_072 = this.f48224i;
                if (model_Sentence_072 != null) {
                    Sentence sentence = model_Sentence_072.getSentence();
                    kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
                    q(zq.c.b(sentence));
                    ta.a aVar = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar);
                    ((hj.b2) aVar).f32378d.removeAllViews();
                    ta.a aVar2 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    ((hj.b2) aVar2).f32377c.removeAllViews();
                    ta.a aVar3 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar3);
                    ((hj.b2) aVar3).f32376b.removeAllViews();
                    this.f48225j.clear();
                    List list = this.f48226k;
                    if (list != null) {
                        Collections.shuffle(list);
                        List<Word> list2 = this.f48226k;
                        if (list2 != null) {
                            for (Word word : list2) {
                                LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f47883c);
                                ta.a aVar4 = this.f47886f;
                                kotlin.jvm.internal.m.c(aVar4);
                                View viewInflate = layoutInflaterFrom.inflate(R.layout.item_word_card_framlayout, (ViewGroup) ((hj.b2) aVar4).f32376b, false);
                                kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                                View view = (FrameLayout) viewInflate;
                                view.setBackgroundResource(R.drawable.item_leave);
                                view.setTag(word);
                                s(view, word);
                                ta.a aVar5 = this.f47886f;
                                kotlin.jvm.internal.m.c(aVar5);
                                ((hj.b2) aVar5).f32376b.addView(view);
                                view.findViewById(R.id.card_item).setTag(word);
                            }
                            ta.a aVar6 = this.f47886f;
                            kotlin.jvm.internal.m.c(aVar6);
                            FlexboxLayout flexboxLayout = ((hj.b2) aVar6).f32376b;
                            flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new t2(this, 1)), 0L);
                            if (this.f47884d.isAudioModel) {
                                View viewFindViewById = o().findViewById(R.id.root_parent);
                                kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                                bq.z.b(viewFindViewById, new ot.e2(this, 12));
                                o().findViewById(R.id.root_parent).performClick();
                            }
                            ta.a aVar7 = this.f47886f;
                            kotlin.jvm.internal.m.c(aVar7);
                            ((hj.b2) aVar7).f32379e.setVisibility(4);
                            m mVar = new m(this, this.f47884d, this.f47883c, o(), new lp.j(this, 18), 3);
                            this.f48228n = mVar;
                            mVar.e();
                            ef.e.B(o());
                            return;
                        }
                        kotlin.jvm.internal.m.n("options");
                        throw null;
                    }
                    kotlin.jvm.internal.m.n("options");
                    throw null;
                }
                kotlin.jvm.internal.m.n("mModel");
                throw null;
            }
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }
}
