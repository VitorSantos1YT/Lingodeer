package qp;

import aj.uZCn.evRpcb;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Model_Sentence_030;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import su.Mbl.tcppUUQxZjFdy;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s1 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Model_Sentence_030 f48171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h f48172l;
    public List m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f48173n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f48174o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f48175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f48176q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f48177r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f48178s;

    public s1(mp.b bVar, long j11) {
        super(bVar, j11, 1);
        this.f48175p = 4;
        this.f48177r = 1;
        this.f48178s = ff.h.l(2.0f);
    }

    @Override // qp.a, hi.a
    public final boolean a() {
        int i11;
        View view = (View) this.f47818j;
        boolean z11 = false;
        if (view != null && view.getTag() != null) {
            View view2 = (View) this.f47818j;
            kotlin.jvm.internal.m.c(view2);
            Object tag = view2.getTag();
            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            long wordId = ((Word) tag).getWordId();
            List list = this.f48174o;
            if (list == null) {
                kotlin.jvm.internal.m.n("answers");
                throw null;
            }
            if (wordId == ((Word) list.get(0)).getWordId()) {
                z11 = true;
            }
        }
        if (((View) this.f47818j) != null) {
            Context context = this.f47883c;
            if (z11) {
                kotlin.jvm.internal.m.f(context, "context");
                i11 = R.color.color_43CC93;
            } else {
                kotlin.jvm.internal.m.f(context, "context");
                i11 = R.color.color_FF6666;
            }
            int color = context.getColor(i11);
            View view3 = (View) this.f47818j;
            kotlin.jvm.internal.m.c(view3);
            TextView textView = (TextView) view3.findViewById(R.id.tv_top);
            View view4 = (View) this.f47818j;
            kotlin.jvm.internal.m.c(view4);
            TextView textView2 = (TextView) view4.findViewById(R.id.tv_middle);
            View view5 = (View) this.f47818j;
            kotlin.jvm.internal.m.c(view5);
            TextView textView3 = (TextView) view5.findViewById(R.id.tv_bottom);
            textView.setTextColor(color);
            textView2.setTextColor(color);
            textView3.setTextColor(color);
        }
        Model_Sentence_030 model_Sentence_030 = this.f48171k;
        if (model_Sentence_030 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_030.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        List list2 = this.m;
        if (list2 != null) {
            gb.r.d(sentence, list2, this.f47881a);
            return z11;
        }
        kotlin.jvm.internal.m.n("stemList");
        throw null;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_030 model_Sentence_030 = this.f48171k;
        if (model_Sentence_030 != null) {
            return fv.b.G(model_Sentence_030.getSentenceId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // qp.a, hi.a
    public final String c() {
        return nv.p.m(this.f47882b, "1;", ";3");
    }

    @Override // qp.d, hi.a
    public final void d(ViewGroup viewGroup) {
        Model_Sentence_030 model_Sentence_030 = this.f48171k;
        if (model_Sentence_030 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> stemList = model_Sentence_030.getStemList();
        kotlin.jvm.internal.m.e(stemList, "getStemList(...)");
        this.m = stemList;
        Model_Sentence_030 model_Sentence_031 = this.f48171k;
        if (model_Sentence_031 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> optionList = model_Sentence_031.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        this.f48173n = optionList;
        Model_Sentence_030 model_Sentence_032 = this.f48171k;
        if (model_Sentence_032 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> answerList = model_Sentence_032.getAnswerList();
        kotlin.jvm.internal.m.e(answerList, "getAnswerList(...)");
        this.f48174o = answerList;
        List list = this.f48173n;
        if (list == null) {
            kotlin.jvm.internal.m.n("options");
            throw null;
        }
        int size = list.size();
        this.f48175p = size;
        if (this.f47884d.keyLanguage == 1) {
            if (3 <= size) {
                size = 3;
            }
            this.f48175p = size;
        }
        super.d(viewGroup);
    }

    @Override // hi.a
    public final int i() {
        return 1;
    }

    @Override // hi.a
    public final void j() throws NoSuchElemException {
        Model_Sentence_030 model_Sentence_030LoadFullObject = Model_Sentence_030.loadFullObject(this.f47882b);
        if (model_Sentence_030LoadFullObject == null) {
            throw new NoSuchElemException();
        }
        this.f48171k = model_Sentence_030LoadFullObject;
        if (model_Sentence_030LoadFullObject.getOptionList().size() == 0) {
            throw new NoSuchElemException();
        }
    }

    @Override // hi.a
    public final void k() {
        h hVar = this.f48172l;
        if (hVar == null) {
            kotlin.jvm.internal.m.n("sentenceLayout");
            throw null;
        }
        hVar.e();
        w();
        int i11 = this.f48175p;
        for (int i12 = 0; i12 < i11; i12++) {
            View viewFindViewById = o().findViewById(w4.c.a(i12, "rl_answer_"));
            kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById;
            Object tag = cardView.getTag();
            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            v(cardView, (Word) tag);
        }
        u();
        x();
    }

    @Override // qp.d
    public final fz.f n() {
        return r1.f48148a;
    }

    @Override // qp.a
    public final void r(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        CardView cardView = (CardView) view;
        int defaultColor = cardView.getCardBackgroundColor().getDefaultColor();
        Context context = this.f47883c;
        kotlin.jvm.internal.m.f(context, "context");
        android.support.v4.media.session.a.h(cardView, defaultColor, context.getColor(R.color.white));
        ((ImageView) cardView.findViewById(R.id.iv_sentence_more)).setImageResource(R.drawable.ic_sentence_right_more);
    }

    @Override // qp.a
    public final void s(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        CardView cardView = (CardView) view;
        int defaultColor = cardView.getCardBackgroundColor().getDefaultColor();
        Context context = this.f47883c;
        kotlin.jvm.internal.m.f(context, "context");
        android.support.v4.media.session.a.h(cardView, defaultColor, context.getColor(R.color.color_E1E9F6));
        ImageView imageView = (ImageView) cardView.findViewById(R.id.iv_sentence_more);
        kotlin.jvm.internal.m.c(imageView);
        cf.x.L(imageView, R.drawable.ic_sentence_right_more, ColorStateList.valueOf(context.getColor(R.color.white)));
        x();
    }

    public final void u() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        FlexboxLayout flexboxLayout = ((hj.j2) aVar).f32756b;
        flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new lt.e(this, 19)), 0L);
    }

    public final void v(CardView cardView, Word word) {
        TextView textView = (TextView) cardView.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) cardView.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) cardView.findViewById(R.id.tv_bottom);
        kotlin.jvm.internal.m.c(textView2);
        ff.h.L(this.f47883c, textView2, 20);
        kotlin.jvm.internal.m.c(textView);
        kotlin.jvm.internal.m.c(textView3);
        boolean z11 = ((jp.p0) this.f47881a).Q;
        zq.c.e(word, textView, textView2, textView3, true);
    }

    public final void w() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((FlexboxLayout) ((hj.j2) aVar).f32757c.f32524c).getChildCount();
        for (int i11 = 1; i11 < childCount; i11++) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            View childAt = ((FlexboxLayout) ((hj.j2) aVar2).f32757c.f32524c).getChildAt(i11);
            kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) childAt;
            View viewFindViewById = frameLayout.findViewById(R.id.ll_item);
            TextView textView = (TextView) frameLayout.findViewById(R.id.tv_middle);
            Object tag = frameLayout.getTag();
            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            if (kotlin.jvm.internal.m.a(((Word) tag).getWord(), "_____")) {
                viewFindViewById.setBackgroundResource(R.drawable.flexbox_grey_under_line);
                textView.setText("      ");
                this.f48176q = viewFindViewById;
                this.f48177r = i11;
            }
            frameLayout.requestLayout();
        }
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_030 model_Sentence_030 = this.f48171k;
        String str = iFLeRCXvYCGdPW.OEvrYdag;
        if (model_Sentence_030 == null) {
            kotlin.jvm.internal.m.n(str);
            throw null;
        }
        String strH = fv.b.H(model_Sentence_030.getSentenceId());
        Model_Sentence_030 model_Sentence_031 = this.f48171k;
        if (model_Sentence_031 == null) {
            kotlin.jvm.internal.m.n(str);
            throw null;
        }
        arrayList.add(new fv.a(2L, strH, fv.b.F(model_Sentence_031.getSentenceId())));
        if (!((jp.p0) this.f47881a).Q) {
            Model_Sentence_030 model_Sentence_032 = this.f48171k;
            if (model_Sentence_032 == null) {
                kotlin.jvm.internal.m.n(str);
                throw null;
            }
            for (Word word : model_Sentence_032.getStemList()) {
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
        long wordId;
        List list;
        jp.p0 p0Var = (jp.p0) this.f47881a;
        p0Var.O(0);
        Model_Sentence_030 model_Sentence_030 = this.f48171k;
        if (model_Sentence_030 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_030.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        q(zq.c.b(sentence));
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        TextView textView = (TextView) ((hj.j2) aVar).f32757c.f32525d;
        Model_Sentence_030 model_Sentence_031 = this.f48171k;
        if (model_Sentence_031 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String translations = model_Sentence_031.getSentence().getTranslations();
        kotlin.jvm.internal.m.e(translations, "getTranslations(...)");
        textView.setText(oz.x.q0(translations, "\n", BuildConfig.VERSION_NAME));
        List list2 = this.m;
        if (list2 == null) {
            kotlin.jvm.internal.m.n("stemList");
            throw null;
        }
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        FlexboxLayout flexboxLayout = (FlexboxLayout) ((hj.j2) aVar2).f32757c.f32524c;
        Context context = this.f47883c;
        this.f48172l = new h(this, context, list2, flexboxLayout, 6);
        int[] iArr = bq.r.f4959a;
        boolean zF = bq.m.F();
        int i11 = this.f48178s;
        String str = evRpcb.eEeuDQB;
        if (zF) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if ((cf.x.n().keyLanguage == 1 || cf.x.n().keyLanguage == 12) && cf.x.n().jsDisPlay == 2) {
                h hVar = this.f48172l;
                if (hVar == null) {
                    kotlin.jvm.internal.m.n(str);
                    throw null;
                }
                hVar.f59274j = i11;
            } else {
                h hVar2 = this.f48172l;
                if (hVar2 == null) {
                    kotlin.jvm.internal.m.n(str);
                    throw null;
                }
                hVar2.f59274j = 2;
            }
        } else {
            h hVar3 = this.f48172l;
            if (hVar3 == null) {
                kotlin.jvm.internal.m.n(str);
                throw null;
            }
            hVar3.f59274j = i11;
        }
        h hVar4 = this.f48172l;
        if (hVar4 == null) {
            kotlin.jvm.internal.m.n(str);
            throw null;
        }
        hVar4.m = new lp.j(this, 16);
        hVar4.d();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        View viewInflate = layoutInflaterFrom.inflate(R.layout.include_iv_audio, (ViewGroup) ((hj.j2) aVar3).f32757c.f32524c, false);
        kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewInflate;
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((FlexboxLayout) ((hj.j2) aVar4).f32757c.f32524c).addView(imageView, 0);
        w();
        int i12 = 8;
        if (!this.f47884d.isAudioModel || p0Var.Q) {
            imageView.setVisibility(8);
        } else {
            bq.z.b(imageView, new n0.w0(24, this, imageView));
            bq.z.b(o(), new ih.c(imageView, 5));
            imageView.setVisibility(0);
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            if (cf.x.n().isTestAutoPlayAudio) {
                imageView.performClick();
            }
        }
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        int i13 = this.f48175p;
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 == 0) {
                List list3 = this.f48174o;
                if (list3 == null) {
                    kotlin.jvm.internal.m.n("answers");
                    throw null;
                }
                arrayList.add(list3.get(0));
            } else {
                List list4 = this.f48173n;
                if (list4 == null) {
                    kotlin.jvm.internal.m.n("options");
                    throw null;
                }
                int iM = fr.j3.M(list4.size());
                while (true) {
                    int size = arrayList.size();
                    int i15 = 0;
                    do {
                        if (i15 >= size) {
                            List list5 = this.f48173n;
                            if (list5 != null) {
                                arrayList.add(list5.get(iM));
                                break;
                            } else {
                                kotlin.jvm.internal.m.n("options");
                                throw null;
                            }
                        }
                        Object obj = arrayList.get(i15);
                        i15++;
                        wordId = ((Word) obj).getWordId();
                        list = this.f48173n;
                        if (list == null) {
                            kotlin.jvm.internal.m.n("options");
                            throw null;
                        }
                    } while (wordId != ((Word) list.get(iM)).getWordId());
                    List list6 = this.f48173n;
                    if (list6 == null) {
                        kotlin.jvm.internal.m.n("options");
                        throw null;
                    }
                    iM = fr.j3.M(list6.size());
                }
            }
        }
        Collections.shuffle(arrayList);
        int i16 = this.f48175p;
        for (int i17 = 0; i17 < i16; i17++) {
            int iA = w4.c.a(i17, "rl_answer_");
            Word word = (Word) arrayList.get(i17);
            View viewFindViewById = o().findViewById(iA);
            kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById;
            cardView.setVisibility(0);
            cardView.setTag(word);
            bq.z.b(cardView, new ot.e2(this, i12));
            v(cardView, word);
            LinearLayout linearLayout = (LinearLayout) cardView.findViewById(R.id.ll_word);
            kotlin.jvm.internal.m.c(linearLayout);
            bq.z.b(linearLayout, new kp.c(cardView, 3));
        }
        u();
        ef.e.B(o());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009e  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:38:0x0104  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:42:0x010d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0119  */
    /* JADX WARN: Code duplicated, block: B:46:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0129  */
    /* JADX WARN: Code duplicated, block: B:49:0x0147  */
    /* JADX WARN: Code duplicated, block: B:51:0x014b  */
    /* JADX WARN: Code duplicated, block: B:53:0x014f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0167  */
    /* JADX WARN: Code duplicated, block: B:61:0x0173  */
    /* JADX WARN: Code duplicated, block: B:63:0x0177  */
    /* JADX WARN: Code duplicated, block: B:65:0x0183  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a9  */
    public final void x() {
        View view;
        int i11;
        int i12;
        List list;
        Word word;
        int i13;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        if (this.f48176q == null || (view = (View) this.f47818j) == null) {
            return;
        }
        Object tag = view.getTag();
        kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
        Word word2 = (Word) tag;
        View view2 = this.f48176q;
        kotlin.jvm.internal.m.c(view2);
        View viewFindViewById = view2.findViewById(R.id.tv_top);
        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
        View view3 = this.f48176q;
        kotlin.jvm.internal.m.c(view3);
        View viewFindViewById2 = view3.findViewById(R.id.tv_middle);
        kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        View view4 = this.f48176q;
        kotlin.jvm.internal.m.c(view4);
        View viewFindViewById3 = view4.findViewById(R.id.tv_bottom);
        kotlin.jvm.internal.m.e(viewFindViewById3, "findViewById(...)");
        boolean z11 = ((jp.p0) this.f47881a).Q;
        zq.c.e(word2, (TextView) viewFindViewById, textView, (TextView) viewFindViewById3, true);
        int[] iArr = bq.r.f4959a;
        if (!bq.m.F()) {
            int i14 = this.f48177r;
            String str = tcppUUQxZjFdy.yGLRh;
            if (i14 == 1) {
                List list8 = this.m;
                if (list8 == null) {
                    kotlin.jvm.internal.m.n("stemList");
                    throw null;
                }
                if (hh.p0.C((Word) nv.p.g(1, list8), str)) {
                    String strM = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                    String word3 = word2.getWord();
                    kotlin.jvm.internal.m.e(word3, str);
                    String strSubstring = word3.substring(1);
                    kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                    textView.setText(strM.concat(strSubstring));
                } else if (this.f48177r != 2) {
                    i11 = this.f48177r;
                    if (i11 > 1) {
                        i12 = i11 - 2;
                        list = this.m;
                        if (list != null) {
                            kotlin.jvm.internal.m.n("stemList");
                            throw null;
                        }
                        word = (Word) list.get(i12);
                        if (!hh.p0.C(word, str)) {
                            list4 = this.m;
                            if (list4 != null) {
                                kotlin.jvm.internal.m.n("stemList");
                                throw null;
                            }
                            if (hh.p0.C((Word) nv.p.g(1, list4), str)) {
                                String strM2 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                String word4 = word2.getWord();
                                kotlin.jvm.internal.m.e(word4, str);
                                String strSubstring2 = word4.substring(1);
                                kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                                textView.setText(strM2.concat(strSubstring2));
                            } else if (this.f48177r > 2) {
                                i13 = this.f48177r - 3;
                                list2 = this.m;
                                if (list2 != null) {
                                    kotlin.jvm.internal.m.n("stemList");
                                    throw null;
                                }
                                if (hh.p0.C((Word) list2.get(i13), str)) {
                                    list3 = this.m;
                                    if (list3 != null) {
                                        kotlin.jvm.internal.m.n("stemList");
                                        throw null;
                                    }
                                    if (hh.p0.C((Word) nv.p.g(1, list3), str)) {
                                        String strM3 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                        String word5 = word2.getWord();
                                        kotlin.jvm.internal.m.e(word5, str);
                                        String strSubstring3 = word5.substring(1);
                                        kotlin.jvm.internal.m.e(strSubstring3, "substring(...)");
                                        textView.setText(strM3.concat(strSubstring3));
                                    }
                                }
                            }
                        } else if (this.f48177r > 2) {
                            i13 = this.f48177r - 3;
                            list2 = this.m;
                            if (list2 != null) {
                                kotlin.jvm.internal.m.n("stemList");
                                throw null;
                            }
                            if (hh.p0.C((Word) list2.get(i13), str)) {
                                list3 = this.m;
                                if (list3 != null) {
                                    kotlin.jvm.internal.m.n("stemList");
                                    throw null;
                                }
                                if (hh.p0.C((Word) nv.p.g(1, list3), str)) {
                                    String strM4 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                    String word6 = word2.getWord();
                                    kotlin.jvm.internal.m.e(word6, str);
                                    String strSubstring4 = word6.substring(1);
                                    kotlin.jvm.internal.m.e(strSubstring4, "substring(...)");
                                    textView.setText(strM4.concat(strSubstring4));
                                }
                            }
                        }
                    }
                } else {
                    list5 = this.m;
                    if (list5 != null) {
                        kotlin.jvm.internal.m.n("stemList");
                        throw null;
                    }
                    if (((Word) list5.get(0)).getWordType() != 1) {
                        i11 = this.f48177r;
                        if (i11 > 1) {
                            i12 = i11 - 2;
                            list = this.m;
                            if (list != null) {
                                kotlin.jvm.internal.m.n("stemList");
                                throw null;
                            }
                            word = (Word) list.get(i12);
                            if (!hh.p0.C(word, str)) {
                                list4 = this.m;
                                if (list4 != null) {
                                    kotlin.jvm.internal.m.n("stemList");
                                    throw null;
                                }
                                if (hh.p0.C((Word) nv.p.g(1, list4), str)) {
                                    String strM5 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                    String word7 = word2.getWord();
                                    kotlin.jvm.internal.m.e(word7, str);
                                    String strSubstring5 = word7.substring(1);
                                    kotlin.jvm.internal.m.e(strSubstring5, "substring(...)");
                                    textView.setText(strM5.concat(strSubstring5));
                                } else if (this.f48177r > 2) {
                                    i13 = this.f48177r - 3;
                                    list2 = this.m;
                                    if (list2 != null) {
                                        kotlin.jvm.internal.m.n("stemList");
                                        throw null;
                                    }
                                    if (hh.p0.C((Word) list2.get(i13), str)) {
                                        list3 = this.m;
                                        if (list3 != null) {
                                            kotlin.jvm.internal.m.n("stemList");
                                            throw null;
                                        }
                                        if (hh.p0.C((Word) nv.p.g(1, list3), str)) {
                                            String strM6 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                            String word8 = word2.getWord();
                                            kotlin.jvm.internal.m.e(word8, str);
                                            String strSubstring6 = word8.substring(1);
                                            kotlin.jvm.internal.m.e(strSubstring6, "substring(...)");
                                            textView.setText(strM6.concat(strSubstring6));
                                        }
                                    }
                                }
                            } else if (this.f48177r > 2) {
                                i13 = this.f48177r - 3;
                                list2 = this.m;
                                if (list2 != null) {
                                    kotlin.jvm.internal.m.n("stemList");
                                    throw null;
                                }
                                if (hh.p0.C((Word) list2.get(i13), str)) {
                                    list3 = this.m;
                                    if (list3 != null) {
                                        kotlin.jvm.internal.m.n("stemList");
                                        throw null;
                                    }
                                    if (hh.p0.C((Word) nv.p.g(1, list3), str)) {
                                        String strM7 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                        String word9 = word2.getWord();
                                        kotlin.jvm.internal.m.e(word9, str);
                                        String strSubstring7 = word9.substring(1);
                                        kotlin.jvm.internal.m.e(strSubstring7, "substring(...)");
                                        textView.setText(strM7.concat(strSubstring7));
                                    }
                                }
                            }
                        }
                    } else {
                        list6 = this.m;
                        if (list6 != null) {
                            kotlin.jvm.internal.m.n("stemList");
                            throw null;
                        }
                        if (kotlin.jvm.internal.m.a(((Word) list6.get(0)).getWord(), "_____")) {
                            i11 = this.f48177r;
                            if (i11 > 1) {
                                i12 = i11 - 2;
                                list = this.m;
                                if (list != null) {
                                    kotlin.jvm.internal.m.n("stemList");
                                    throw null;
                                }
                                word = (Word) list.get(i12);
                                if (!hh.p0.C(word, str)) {
                                    list4 = this.m;
                                    if (list4 != null) {
                                        kotlin.jvm.internal.m.n("stemList");
                                        throw null;
                                    }
                                    if (hh.p0.C((Word) nv.p.g(1, list4), str)) {
                                        String strM8 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                        String word10 = word2.getWord();
                                        kotlin.jvm.internal.m.e(word10, str);
                                        String strSubstring8 = word10.substring(1);
                                        kotlin.jvm.internal.m.e(strSubstring8, "substring(...)");
                                        textView.setText(strM8.concat(strSubstring8));
                                    } else if (this.f48177r > 2) {
                                        i13 = this.f48177r - 3;
                                        list2 = this.m;
                                        if (list2 != null) {
                                            kotlin.jvm.internal.m.n("stemList");
                                            throw null;
                                        }
                                        if (hh.p0.C((Word) list2.get(i13), str)) {
                                            list3 = this.m;
                                            if (list3 != null) {
                                                kotlin.jvm.internal.m.n("stemList");
                                                throw null;
                                            }
                                            if (hh.p0.C((Word) nv.p.g(1, list3), str)) {
                                                String strM9 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                                String word11 = word2.getWord();
                                                kotlin.jvm.internal.m.e(word11, str);
                                                String strSubstring9 = word11.substring(1);
                                                kotlin.jvm.internal.m.e(strSubstring9, "substring(...)");
                                                textView.setText(strM9.concat(strSubstring9));
                                            }
                                        }
                                    }
                                } else if (this.f48177r > 2) {
                                    i13 = this.f48177r - 3;
                                    list2 = this.m;
                                    if (list2 != null) {
                                        kotlin.jvm.internal.m.n("stemList");
                                        throw null;
                                    }
                                    if (hh.p0.C((Word) list2.get(i13), str)) {
                                        list3 = this.m;
                                        if (list3 != null) {
                                            kotlin.jvm.internal.m.n("stemList");
                                            throw null;
                                        }
                                        if (hh.p0.C((Word) nv.p.g(1, list3), str)) {
                                            String strM10 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                            String word12 = word2.getWord();
                                            kotlin.jvm.internal.m.e(word12, str);
                                            String strSubstring10 = word12.substring(1);
                                            kotlin.jvm.internal.m.e(strSubstring10, "substring(...)");
                                            textView.setText(strM10.concat(strSubstring10));
                                        }
                                    }
                                }
                            }
                        } else {
                            list7 = this.m;
                            if (list7 != null) {
                                kotlin.jvm.internal.m.n("stemList");
                                throw null;
                            }
                            if (hh.p0.C((Word) nv.p.g(1, list7), str)) {
                                String strM11 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                String word13 = word2.getWord();
                                kotlin.jvm.internal.m.e(word13, str);
                                String strSubstring11 = word13.substring(1);
                                kotlin.jvm.internal.m.e(strSubstring11, "substring(...)");
                                textView.setText(strM11.concat(strSubstring11));
                            } else {
                                i11 = this.f48177r;
                                if (i11 > 1) {
                                    i12 = i11 - 2;
                                    list = this.m;
                                    if (list != null) {
                                        kotlin.jvm.internal.m.n("stemList");
                                        throw null;
                                    }
                                    word = (Word) list.get(i12);
                                    if (!hh.p0.C(word, str)) {
                                        list4 = this.m;
                                        if (list4 != null) {
                                            kotlin.jvm.internal.m.n("stemList");
                                            throw null;
                                        }
                                        if (hh.p0.C((Word) nv.p.g(1, list4), str)) {
                                            String strM12 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                            String word14 = word2.getWord();
                                            kotlin.jvm.internal.m.e(word14, str);
                                            String strSubstring12 = word14.substring(1);
                                            kotlin.jvm.internal.m.e(strSubstring12, "substring(...)");
                                            textView.setText(strM12.concat(strSubstring12));
                                        } else if (this.f48177r > 2) {
                                            i13 = this.f48177r - 3;
                                            list2 = this.m;
                                            if (list2 != null) {
                                                kotlin.jvm.internal.m.n("stemList");
                                                throw null;
                                            }
                                            if (hh.p0.C((Word) list2.get(i13), str)) {
                                                list3 = this.m;
                                                if (list3 != null) {
                                                    kotlin.jvm.internal.m.n("stemList");
                                                    throw null;
                                                }
                                                if (hh.p0.C((Word) nv.p.g(1, list3), str)) {
                                                    String strM13 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                                    String word15 = word2.getWord();
                                                    kotlin.jvm.internal.m.e(word15, str);
                                                    String strSubstring13 = word15.substring(1);
                                                    kotlin.jvm.internal.m.e(strSubstring13, "substring(...)");
                                                    textView.setText(strM13.concat(strSubstring13));
                                                }
                                            }
                                        }
                                    } else if (this.f48177r > 2) {
                                        i13 = this.f48177r - 3;
                                        list2 = this.m;
                                        if (list2 != null) {
                                            kotlin.jvm.internal.m.n("stemList");
                                            throw null;
                                        }
                                        if (hh.p0.C((Word) list2.get(i13), str)) {
                                            list3 = this.m;
                                            if (list3 != null) {
                                                kotlin.jvm.internal.m.n("stemList");
                                                throw null;
                                            }
                                            if (hh.p0.C((Word) nv.p.g(1, list3), str)) {
                                                String strM14 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                                String word16 = word2.getWord();
                                                kotlin.jvm.internal.m.e(word16, str);
                                                String strSubstring14 = word16.substring(1);
                                                kotlin.jvm.internal.m.e(strSubstring14, "substring(...)");
                                                textView.setText(strM14.concat(strSubstring14));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (this.f48177r != 2) {
                i11 = this.f48177r;
                if (i11 > 1) {
                    i12 = i11 - 2;
                    list = this.m;
                    if (list != null) {
                        kotlin.jvm.internal.m.n("stemList");
                        throw null;
                    }
                    word = (Word) list.get(i12);
                    if (!hh.p0.C(word, str)) {
                        list4 = this.m;
                        if (list4 != null) {
                            kotlin.jvm.internal.m.n("stemList");
                            throw null;
                        }
                        if (hh.p0.C((Word) nv.p.g(1, list4), str)) {
                            String strM15 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                            String word17 = word2.getWord();
                            kotlin.jvm.internal.m.e(word17, str);
                            String strSubstring15 = word17.substring(1);
                            kotlin.jvm.internal.m.e(strSubstring15, "substring(...)");
                            textView.setText(strM15.concat(strSubstring15));
                        } else if (this.f48177r > 2) {
                            i13 = this.f48177r - 3;
                            list2 = this.m;
                            if (list2 != null) {
                                kotlin.jvm.internal.m.n("stemList");
                                throw null;
                            }
                            if (hh.p0.C((Word) list2.get(i13), str)) {
                                list3 = this.m;
                                if (list3 != null) {
                                    kotlin.jvm.internal.m.n("stemList");
                                    throw null;
                                }
                                if (hh.p0.C((Word) nv.p.g(1, list3), str)) {
                                    String strM16 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                    String word18 = word2.getWord();
                                    kotlin.jvm.internal.m.e(word18, str);
                                    String strSubstring16 = word18.substring(1);
                                    kotlin.jvm.internal.m.e(strSubstring16, "substring(...)");
                                    textView.setText(strM16.concat(strSubstring16));
                                }
                            }
                        }
                    } else if (this.f48177r > 2 && word.getWordType() == 1 && !kotlin.jvm.internal.m.a(word.getWord(), "_____")) {
                        i13 = this.f48177r - 3;
                        list2 = this.m;
                        if (list2 != null) {
                            kotlin.jvm.internal.m.n("stemList");
                            throw null;
                        }
                        if (hh.p0.C((Word) list2.get(i13), str)) {
                            list3 = this.m;
                            if (list3 != null) {
                                kotlin.jvm.internal.m.n("stemList");
                                throw null;
                            }
                            if (hh.p0.C((Word) nv.p.g(1, list3), str)) {
                                String strM17 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                String word19 = word2.getWord();
                                kotlin.jvm.internal.m.e(word19, str);
                                String strSubstring17 = word19.substring(1);
                                kotlin.jvm.internal.m.e(strSubstring17, "substring(...)");
                                textView.setText(strM17.concat(strSubstring17));
                            }
                        }
                    }
                }
            } else {
                list5 = this.m;
                if (list5 != null) {
                    kotlin.jvm.internal.m.n("stemList");
                    throw null;
                }
                if (((Word) list5.get(0)).getWordType() != 1) {
                    i11 = this.f48177r;
                    if (i11 > 1) {
                        i12 = i11 - 2;
                        list = this.m;
                        if (list != null) {
                            kotlin.jvm.internal.m.n("stemList");
                            throw null;
                        }
                        word = (Word) list.get(i12);
                        if (!hh.p0.C(word, str)) {
                            list4 = this.m;
                            if (list4 != null) {
                                kotlin.jvm.internal.m.n("stemList");
                                throw null;
                            }
                            if (hh.p0.C((Word) nv.p.g(1, list4), str)) {
                                String strM18 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                String word110 = word2.getWord();
                                kotlin.jvm.internal.m.e(word110, str);
                                String strSubstring18 = word110.substring(1);
                                kotlin.jvm.internal.m.e(strSubstring18, "substring(...)");
                                textView.setText(strM18.concat(strSubstring18));
                            } else if (this.f48177r > 2) {
                                i13 = this.f48177r - 3;
                                list2 = this.m;
                                if (list2 != null) {
                                    kotlin.jvm.internal.m.n("stemList");
                                    throw null;
                                }
                                if (hh.p0.C((Word) list2.get(i13), str)) {
                                    list3 = this.m;
                                    if (list3 != null) {
                                        kotlin.jvm.internal.m.n("stemList");
                                        throw null;
                                    }
                                    if (hh.p0.C((Word) nv.p.g(1, list3), str)) {
                                        String strM19 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                        String word111 = word2.getWord();
                                        kotlin.jvm.internal.m.e(word111, str);
                                        String strSubstring19 = word111.substring(1);
                                        kotlin.jvm.internal.m.e(strSubstring19, "substring(...)");
                                        textView.setText(strM19.concat(strSubstring19));
                                    }
                                }
                            }
                        } else if (this.f48177r > 2) {
                            i13 = this.f48177r - 3;
                            list2 = this.m;
                            if (list2 != null) {
                                kotlin.jvm.internal.m.n("stemList");
                                throw null;
                            }
                            if (hh.p0.C((Word) list2.get(i13), str)) {
                                list3 = this.m;
                                if (list3 != null) {
                                    kotlin.jvm.internal.m.n("stemList");
                                    throw null;
                                }
                                if (hh.p0.C((Word) nv.p.g(1, list3), str)) {
                                    String strM110 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                    String word112 = word2.getWord();
                                    kotlin.jvm.internal.m.e(word112, str);
                                    String strSubstring110 = word112.substring(1);
                                    kotlin.jvm.internal.m.e(strSubstring110, "substring(...)");
                                    textView.setText(strM110.concat(strSubstring110));
                                }
                            }
                        }
                    }
                } else {
                    list6 = this.m;
                    if (list6 != null) {
                        kotlin.jvm.internal.m.n("stemList");
                        throw null;
                    }
                    if (kotlin.jvm.internal.m.a(((Word) list6.get(0)).getWord(), "_____")) {
                        i11 = this.f48177r;
                        if (i11 > 1) {
                            i12 = i11 - 2;
                            list = this.m;
                            if (list != null) {
                                kotlin.jvm.internal.m.n("stemList");
                                throw null;
                            }
                            word = (Word) list.get(i12);
                            if (!hh.p0.C(word, str)) {
                                list4 = this.m;
                                if (list4 != null) {
                                    kotlin.jvm.internal.m.n("stemList");
                                    throw null;
                                }
                                if (hh.p0.C((Word) nv.p.g(1, list4), str)) {
                                    String strM111 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                    String word113 = word2.getWord();
                                    kotlin.jvm.internal.m.e(word113, str);
                                    String strSubstring111 = word113.substring(1);
                                    kotlin.jvm.internal.m.e(strSubstring111, "substring(...)");
                                    textView.setText(strM111.concat(strSubstring111));
                                } else if (this.f48177r > 2) {
                                    i13 = this.f48177r - 3;
                                    list2 = this.m;
                                    if (list2 != null) {
                                        kotlin.jvm.internal.m.n("stemList");
                                        throw null;
                                    }
                                    if (hh.p0.C((Word) list2.get(i13), str)) {
                                        list3 = this.m;
                                        if (list3 != null) {
                                            kotlin.jvm.internal.m.n("stemList");
                                            throw null;
                                        }
                                        if (hh.p0.C((Word) nv.p.g(1, list3), str)) {
                                            String strM112 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                            String word114 = word2.getWord();
                                            kotlin.jvm.internal.m.e(word114, str);
                                            String strSubstring112 = word114.substring(1);
                                            kotlin.jvm.internal.m.e(strSubstring112, "substring(...)");
                                            textView.setText(strM112.concat(strSubstring112));
                                        }
                                    }
                                }
                            } else if (this.f48177r > 2) {
                                i13 = this.f48177r - 3;
                                list2 = this.m;
                                if (list2 != null) {
                                    kotlin.jvm.internal.m.n("stemList");
                                    throw null;
                                }
                                if (hh.p0.C((Word) list2.get(i13), str)) {
                                    list3 = this.m;
                                    if (list3 != null) {
                                        kotlin.jvm.internal.m.n("stemList");
                                        throw null;
                                    }
                                    if (hh.p0.C((Word) nv.p.g(1, list3), str)) {
                                        String strM113 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                        String word115 = word2.getWord();
                                        kotlin.jvm.internal.m.e(word115, str);
                                        String strSubstring113 = word115.substring(1);
                                        kotlin.jvm.internal.m.e(strSubstring113, "substring(...)");
                                        textView.setText(strM113.concat(strSubstring113));
                                    }
                                }
                            }
                        }
                    } else {
                        list7 = this.m;
                        if (list7 != null) {
                            kotlin.jvm.internal.m.n("stemList");
                            throw null;
                        }
                        if (hh.p0.C((Word) nv.p.g(1, list7), str)) {
                            String strM114 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                            String word116 = word2.getWord();
                            kotlin.jvm.internal.m.e(word116, str);
                            String strSubstring114 = word116.substring(1);
                            kotlin.jvm.internal.m.e(strSubstring114, "substring(...)");
                            textView.setText(strM114.concat(strSubstring114));
                        } else {
                            i11 = this.f48177r;
                            if (i11 > 1) {
                                i12 = i11 - 2;
                                list = this.m;
                                if (list != null) {
                                    kotlin.jvm.internal.m.n("stemList");
                                    throw null;
                                }
                                word = (Word) list.get(i12);
                                if (!hh.p0.C(word, str)) {
                                    list4 = this.m;
                                    if (list4 != null) {
                                        kotlin.jvm.internal.m.n("stemList");
                                        throw null;
                                    }
                                    if (hh.p0.C((Word) nv.p.g(1, list4), str)) {
                                        String strM115 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                        String word117 = word2.getWord();
                                        kotlin.jvm.internal.m.e(word117, str);
                                        String strSubstring115 = word117.substring(1);
                                        kotlin.jvm.internal.m.e(strSubstring115, "substring(...)");
                                        textView.setText(strM115.concat(strSubstring115));
                                    } else if (this.f48177r > 2) {
                                        i13 = this.f48177r - 3;
                                        list2 = this.m;
                                        if (list2 != null) {
                                            kotlin.jvm.internal.m.n("stemList");
                                            throw null;
                                        }
                                        if (hh.p0.C((Word) list2.get(i13), str)) {
                                            list3 = this.m;
                                            if (list3 != null) {
                                                kotlin.jvm.internal.m.n("stemList");
                                                throw null;
                                            }
                                            if (hh.p0.C((Word) nv.p.g(1, list3), str)) {
                                                String strM116 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                                String word118 = word2.getWord();
                                                kotlin.jvm.internal.m.e(word118, str);
                                                String strSubstring116 = word118.substring(1);
                                                kotlin.jvm.internal.m.e(strSubstring116, "substring(...)");
                                                textView.setText(strM116.concat(strSubstring116));
                                            }
                                        }
                                    }
                                } else if (this.f48177r > 2) {
                                    i13 = this.f48177r - 3;
                                    list2 = this.m;
                                    if (list2 != null) {
                                        kotlin.jvm.internal.m.n("stemList");
                                        throw null;
                                    }
                                    if (hh.p0.C((Word) list2.get(i13), str)) {
                                        list3 = this.m;
                                        if (list3 != null) {
                                            kotlin.jvm.internal.m.n("stemList");
                                            throw null;
                                        }
                                        if (hh.p0.C((Word) nv.p.g(1, list3), str)) {
                                            String strM117 = hh.p0.m(hh.p0.j(word2, str, 0, 1, "substring(...)"), "toUpperCase(...)");
                                            String word119 = word2.getWord();
                                            kotlin.jvm.internal.m.e(word119, str);
                                            String strSubstring117 = word119.substring(1);
                                            kotlin.jvm.internal.m.e(strSubstring117, "substring(...)");
                                            textView.setText(strM117.concat(strSubstring117));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        View view5 = this.f48176q;
        if (view5 != null) {
            view5.requestLayout();
        }
    }
}
