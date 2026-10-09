package qp;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.lingo.lingoskill.object.Model_Sentence_080;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i2 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Model_Sentence_080 f47974k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f47975l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h2 f47976n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f47977o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h2 f47978p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f47979q;

    public i2(mp.b bVar, long j11) {
        super(bVar, j11, 1);
        this.m = 4;
        this.f47977o = new ArrayList();
        this.f47979q = ff.h.l(2.0f);
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
            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Sentence");
            z11 = u().getSentenceId() == ((Sentence) tag).getSentenceId();
            Context context = this.f47883c;
            if (z11) {
                kotlin.jvm.internal.m.f(context, "context");
                i11 = R.color.color_43CC93;
            } else {
                kotlin.jvm.internal.m.f(context, "context");
                i11 = R.color.color_FF6666;
            }
            int color = context.getColor(i11);
            h2 h2Var = this.f47978p;
            if (h2Var != null) {
                h2Var.f59271g = color;
                h2Var.f59272h = color;
                h2Var.f59273i = color;
                if (h2Var != null) {
                    h2Var.e();
                }
            }
        }
        return z11;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_080 model_Sentence_080 = this.f47974k;
        if (model_Sentence_080 != null) {
            return ep.a.D(fv.b.G(model_Sentence_080.getSentenceId(), null, null), "#@@@#", fv.b.G(u().getSentenceId(), null, null));
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // qp.a, hi.a
    public final String c() {
        return nv.p.m(this.f47882b, "1;", ";8");
    }

    @Override // qp.d, hi.a
    public final void d(ViewGroup viewGroup) {
        Model_Sentence_080 model_Sentence_080 = this.f47974k;
        if (model_Sentence_080 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Sentence> optionList = model_Sentence_080.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        this.f47975l = optionList;
        this.m = optionList.size();
        super.d(viewGroup);
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_080 model_Sentence_080 = this.f47974k;
        if (model_Sentence_080 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strH = fv.b.H(model_Sentence_080.getSentenceId());
        Model_Sentence_080 model_Sentence_081 = this.f47974k;
        if (model_Sentence_081 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        arrayList.add(new fv.a(2L, strH, fv.b.F(model_Sentence_081.getSentenceId())));
        Model_Sentence_080 model_Sentence_082 = this.f47974k;
        if (model_Sentence_082 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        for (Sentence sentence : model_Sentence_082.getOptionList()) {
            qy.q qVar2 = fv.b.f28186a;
            arrayList.add(new fv.a(2L, fv.b.H(sentence.getSentenceId()), fv.b.F(sentence.getSentenceId())));
        }
        if (!((jp.p0) this.f47881a).Q) {
            Model_Sentence_080 model_Sentence_083 = this.f47974k;
            if (model_Sentence_083 == null) {
                kotlin.jvm.internal.m.n("mModel");
                throw null;
            }
            for (Word word : model_Sentence_083.getSentence().getSentWords()) {
                if (word.getWordType() != 1) {
                    qy.q qVar3 = fv.b.f28186a;
                    arrayList.add(new fv.a(2L, fv.b.Z(word.getWordId()), fv.b.V(word.getWordId())));
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
        Model_Sentence_080 model_Sentence_080LoadFullObject = Model_Sentence_080.loadFullObject(this.f47882b);
        if (model_Sentence_080LoadFullObject == null) {
            throw new NoSuchElemException();
        }
        this.f47974k = model_Sentence_080LoadFullObject;
        if (model_Sentence_080LoadFullObject.getOptionList().size() == 0) {
            throw new NoSuchElemException();
        }
    }

    @Override // hi.a
    public final void k() {
        h2 h2Var = this.f47976n;
        if (h2Var == null) {
            kotlin.jvm.internal.m.n("sentenceLayout");
            throw null;
        }
        h2Var.e();
        ArrayList arrayList = this.f47977o;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            kotlin.jvm.internal.m.e(obj, "next(...)");
            ((zq.b) obj).e();
        }
    }

    @Override // qp.d
    public final fz.f n() {
        return g2.f47940a;
    }

    @Override // qp.a
    public final void r(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        MaterialCardView materialCardView = (MaterialCardView) view;
        int defaultColor = materialCardView.getCardBackgroundColor().getDefaultColor();
        Context context = this.f47883c;
        kotlin.jvm.internal.m.f(context, "context");
        android.support.v4.media.session.a.h(materialCardView, defaultColor, context.getColor(R.color.white));
        ((ImageView) materialCardView.findViewById(R.id.iv_sentence_more)).setImageResource(R.drawable.ic_sentence_right_more);
    }

    @Override // qp.a
    public final void s(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        MaterialCardView materialCardView = (MaterialCardView) view;
        int defaultColor = materialCardView.getCardBackgroundColor().getDefaultColor();
        Context context = this.f47883c;
        kotlin.jvm.internal.m.f(context, "context");
        android.support.v4.media.session.a.h(materialCardView, defaultColor, context.getColor(R.color.color_E1E9F6));
        ImageView imageView = (ImageView) materialCardView.findViewById(R.id.iv_sentence_more);
        kotlin.jvm.internal.m.c(imageView);
        cf.x.L(imageView, R.drawable.ic_sentence_right_more, ColorStateList.valueOf(context.getColor(R.color.white)));
    }

    public final Sentence u() {
        Model_Sentence_080 model_Sentence_080 = this.f47974k;
        if (model_Sentence_080 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence answerSentence = model_Sentence_080.getAnswerSentence();
        kotlin.jvm.internal.m.e(answerSentence, "getAnswerSentence(...)");
        return answerSentence;
    }

    @Override // qp.d
    public final void p() throws Throwable {
        Throwable th2;
        Throwable th3;
        v();
        ((jp.p0) this.f47881a).O(0);
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        View viewFindViewById = ((hj.o2) aVar).f33012b.f32503c.findViewById(R.id.fl_container);
        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
        List<Word> sentWords = v().getSentWords();
        Context context = this.f47883c;
        this.f47976n = new h2((FlexboxLayout) viewFindViewById, this, context, sentWords, 1);
        int[] iArr = bq.r.f4959a;
        boolean zF = bq.m.F();
        Throwable th4 = null;
        int i11 = this.f47979q;
        if (zF) {
            h2 h2Var = this.f47976n;
            if (h2Var == null) {
                kotlin.jvm.internal.m.n("sentenceLayout");
                throw null;
            }
            h2Var.f59274j = 2;
        } else {
            h2 h2Var2 = this.f47976n;
            if (h2Var2 == null) {
                kotlin.jvm.internal.m.n("sentenceLayout");
                throw null;
            }
            h2Var2.f59274j = i11;
        }
        h2 h2Var3 = this.f47976n;
        if (h2Var3 == null) {
            kotlin.jvm.internal.m.n("sentenceLayout");
            throw null;
        }
        h2Var3.m = new n9.q(this, 16);
        h2Var3.d();
        Model_Sentence_080 model_Sentence_080 = this.f47974k;
        if (model_Sentence_080 == null) {
            kotlin.jvm.internal.m.n(kHfjNGauVgdF.JMYYPOMCgrvh);
            throw null;
        }
        Sentence answerSentence = model_Sentence_080.getAnswerSentence();
        kotlin.jvm.internal.m.e(answerSentence, "getAnswerSentence(...)");
        q(zq.c.b(answerSentence));
        this.f47977o = new ArrayList();
        ArrayList arrayList = new ArrayList();
        int i12 = this.m;
        int i13 = 0;
        while (i13 < i12) {
            if (i13 == 0) {
                arrayList.add(u());
                th2 = th4;
            } else {
                int iM = fr.j3.M(this.m);
                while (true) {
                    int size = arrayList.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            th2 = th4;
                            List list = this.f47975l;
                            if (list != null) {
                                arrayList.add(list.get(iM));
                                break;
                            } else {
                                kotlin.jvm.internal.m.n("options");
                                throw th2;
                            }
                        }
                        Object obj = arrayList.get(i14);
                        i14++;
                        long sentenceId = ((Sentence) obj).getSentenceId();
                        th3 = th4;
                        List list2 = this.f47975l;
                        if (list2 == null) {
                            kotlin.jvm.internal.m.n("options");
                            throw th3;
                        }
                        if (sentenceId == ((Sentence) list2.get(iM)).getSentenceId()) {
                            break;
                        } else {
                            th4 = th3;
                        }
                    }
                    iM = fr.j3.M(this.m);
                    th4 = th3;
                }
            }
            i13++;
            th4 = th2;
        }
        Collections.shuffle(arrayList);
        int i15 = this.m;
        for (int i16 = 0; i16 < i15; i16++) {
            int iA = w4.c.a(i16, "rl_answer_");
            Object obj2 = arrayList.get(i16);
            kotlin.jvm.internal.m.e(obj2, "get(...)");
            Sentence sentence = (Sentence) obj2;
            View viewFindViewById2 = o().findViewById(iA);
            kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById2;
            cardView.setVisibility(0);
            cardView.setTag(sentence);
            View viewFindViewById3 = cardView.findViewById(R.id.flex_container);
            kotlin.jvm.internal.m.e(viewFindViewById3, "findViewById(...)");
            h2 h2Var4 = new h2((FlexboxLayout) viewFindViewById3, this, context, sentence.getSentWords(), 0);
            int[] iArr2 = bq.r.f4959a;
            if (bq.m.F()) {
                h2Var4.f59274j = 2;
            } else {
                h2Var4.f59274j = i11;
            }
            h2Var4.f59277n = true;
            h2Var4.d();
            this.f47977o.add(h2Var4);
            bq.z.b(cardView, new pr.a0(this, h2Var4, sentence, 5));
            View viewFindViewById4 = cardView.findViewById(R.id.flex_container);
            kotlin.jvm.internal.m.e(viewFindViewById4, "findViewById(...)");
            bq.z.b((FlexboxLayout) viewFindViewById4, new kp.c(cardView, 4));
        }
        if (this.f47884d.isAudioModel) {
            View viewFindViewById5 = o().findViewById(R.id.root_parent);
            kotlin.jvm.internal.m.e(viewFindViewById5, "findViewById(...)");
            bq.z.b(viewFindViewById5, new ot.e2(this, 9));
            o().findViewById(R.id.root_parent).performClick();
        }
        ef.e.B(o());
    }

    public final Sentence v() {
        Model_Sentence_080 model_Sentence_080 = this.f47974k;
        if (model_Sentence_080 == null) {
            kotlin.jvm.internal.m.n(IMCc.GfxCPFFqqDb);
            throw null;
        }
        Sentence sentence = model_Sentence_080.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        return sentence;
    }
}
