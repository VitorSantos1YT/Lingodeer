package qp;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Model_Word_010;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import hj.b6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class a4 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Model_Word_010 f47825k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f47826l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qy.q f47827n;

    public a4(mp.b bVar, long j11) {
        super(bVar, j11, 1);
        this.m = 4;
        this.f47827n = com.bumptech.glide.d.v(new dt.k2(this, j11, 4));
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
            Word word = u().getWord();
            kotlin.jvm.internal.m.e(word, "getWord(...)");
            z11 = wordId == word.getWordId();
            View view3 = (View) this.f47818j;
            kotlin.jvm.internal.m.c(view3);
            TextView textView = (TextView) view3.findViewById(R.id.tv_top);
            View view4 = (View) this.f47818j;
            kotlin.jvm.internal.m.c(view4);
            TextView textView2 = (TextView) view4.findViewById(R.id.tv_middle);
            View view5 = (View) this.f47818j;
            kotlin.jvm.internal.m.c(view5);
            TextView textView3 = (TextView) view5.findViewById(R.id.tv_bottom);
            Context context = this.f47883c;
            if (z11) {
                kotlin.jvm.internal.m.f(context, "context");
                i11 = R.color.color_43CC93;
            } else {
                kotlin.jvm.internal.m.f(context, "context");
                i11 = R.color.color_FF6666;
            }
            int color = context.getColor(i11);
            textView.setTextColor(color);
            textView2.setTextColor(color);
            textView3.setTextColor(color);
        }
        return z11;
    }

    @Override // hi.a
    public String b() {
        qy.q qVar = fv.b.f28186a;
        return fv.b.Y(u().getWordId(), null, null);
    }

    @Override // qp.a, hi.a
    public String c() {
        return (String) this.f47827n.getValue();
    }

    @Override // qp.d, hi.a
    public final void d(ViewGroup viewGroup) {
        List<Word> optionList = u().getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        this.f47826l = optionList;
        this.m = optionList.size();
        super.d(viewGroup);
    }

    @Override // hi.a
    public List g() {
        ArrayList arrayList = new ArrayList();
        for (Word word : u().getOptionList()) {
            qy.q qVar = fv.b.f28186a;
            arrayList.add(new fv.a(2L, fv.b.Z(word.getWordId()), fv.b.V(word.getWordId())));
        }
        return arrayList;
    }

    @Override // hi.a
    public int i() {
        return 0;
    }

    @Override // hi.a
    public void j() throws NoSuchElemException {
        Model_Word_010 model_Word_010LoadFullObject = Model_Word_010.loadFullObject(this.f47882b);
        if (model_Word_010LoadFullObject == null) {
            throw new NoSuchElemException();
        }
        this.f47825k = model_Word_010LoadFullObject;
        if (u().getOptionList().size() == 0) {
            throw new NoSuchElemException();
        }
    }

    @Override // hi.a
    public final void k() {
        x();
        int i11 = this.m;
        for (int i12 = 0; i12 < i11; i12++) {
            View viewFindViewById = o().findViewById(w4.c.a(i12, "rl_answer_"));
            kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById;
            Object tag = cardView.getTag();
            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            v(cardView, (Word) tag);
        }
    }

    @Override // qp.d
    public final fz.f n() {
        return z3.f48294a;
    }

    @Override // qp.d
    public final void p() {
        long wordId;
        List list;
        final int i11 = 0;
        ((jp.p0) this.f47881a).O(0);
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        final int i12 = 1;
        bq.z.b((ImageView) ((b6) ((hj.w2) aVar).f33514c.f32524c).f32408d, new fz.c(this) { // from class: qp.y3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a4 f48274b;

            {
                this.f48274b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        a4 a4Var = this.f48274b;
                        mp.b bVar = a4Var.f47881a;
                        String strB = a4Var.b();
                        ta.a aVar2 = a4Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar2);
                        ImageView ivAudio = (ImageView) ((b6) ((hj.w2) aVar2).f33514c.f32524c).f32408d;
                        kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                        ((jp.p0) bVar).H(ivAudio, strB);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a4 a4Var2 = this.f48274b;
                        mp.b bVar2 = a4Var2.f47881a;
                        String strB2 = a4Var2.b();
                        ta.a aVar3 = a4Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar3);
                        ((jp.p0) bVar2).H((ImageView) ((b6) ((hj.w2) aVar3).f33514c.f32524c).f32408d, strB2);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "v");
                        a4 a4Var3 = this.f48274b;
                        View view = (View) a4Var3.f47818j;
                        if (view != null) {
                            a4Var3.r(view);
                        }
                        a4Var3.f47818j = it;
                        a4Var3.s(it);
                        ((jp.p0) a4Var3.f47881a).O(4);
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((ImageView) ((b6) ((hj.w2) aVar2).f33514c.f32524c).f32408d).performClick();
        x();
        ArrayList arrayList = new ArrayList();
        int i13 = this.m;
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 == 0) {
                Word word = u().getWord();
                kotlin.jvm.internal.m.e(word, "getWord(...)");
                arrayList.add(word);
            } else {
                int iM = fr.j3.M(this.m);
                while (true) {
                    int size = arrayList.size();
                    int i15 = 0;
                    do {
                        if (i15 >= size) {
                            List list2 = this.f47826l;
                            if (list2 != null) {
                                arrayList.add(list2.get(iM));
                                break;
                            } else {
                                kotlin.jvm.internal.m.n("options");
                                throw null;
                            }
                        }
                        Object obj = arrayList.get(i15);
                        i15++;
                        wordId = ((Word) obj).getWordId();
                        list = this.f47826l;
                        if (list == null) {
                            kotlin.jvm.internal.m.n("options");
                            throw null;
                        }
                    } while (wordId != ((Word) list.get(iM)).getWordId());
                    iM = fr.j3.M(this.m);
                }
            }
        }
        Collections.shuffle(arrayList);
        int size2 = arrayList.size();
        int i16 = 0;
        while (true) {
            final int i17 = 2;
            if (i16 >= size2) {
                break;
            }
            int iA = w4.c.a(i16, "rl_answer_");
            Object obj2 = arrayList.get(i16);
            kotlin.jvm.internal.m.e(obj2, "get(...)");
            Word word2 = (Word) obj2;
            View viewFindViewById = o().findViewById(iA);
            kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById;
            cardView.setVisibility(0);
            if (!kotlin.jvm.internal.m.a(this.f47883c.getString(R.string.device_oritation), "land")) {
                cardView.postDelayed(new b2.c(4, cardView, new pv.c(6, cardView, this)), 0L);
            }
            cardView.setTag(word2);
            bq.z.b(cardView, new fz.c(this) { // from class: qp.y3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a4 f48274b;

                {
                    this.f48274b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj3) {
                    View it = (View) obj3;
                    switch (i17) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            a4 a4Var = this.f48274b;
                            mp.b bVar = a4Var.f47881a;
                            String strB = a4Var.b();
                            ta.a aVar3 = a4Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar3);
                            ImageView ivAudio = (ImageView) ((b6) ((hj.w2) aVar3).f33514c.f32524c).f32408d;
                            kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                            ((jp.p0) bVar).H(ivAudio, strB);
                            break;
                        case 1:
                            kotlin.jvm.internal.m.f(it, "it");
                            a4 a4Var2 = this.f48274b;
                            mp.b bVar2 = a4Var2.f47881a;
                            String strB2 = a4Var2.b();
                            ta.a aVar4 = a4Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar4);
                            ((jp.p0) bVar2).H((ImageView) ((b6) ((hj.w2) aVar4).f33514c.f32524c).f32408d, strB2);
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "v");
                            a4 a4Var3 = this.f48274b;
                            View view = (View) a4Var3.f47818j;
                            if (view != null) {
                                a4Var3.r(view);
                            }
                            a4Var3.f47818j = it;
                            a4Var3.s(it);
                            ((jp.p0) a4Var3.f47881a).O(4);
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            v(cardView, word2);
            i16++;
        }
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        LinearLayout rootParent = ((hj.w2) aVar3).f33515d;
        kotlin.jvm.internal.m.e(rootParent, "rootParent");
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ViewGroup[] viewGroupArr = {rootParent, ((hj.w2) aVar4).f33513b};
        for (int i18 = 0; i18 < 2; i18++) {
            bq.z.b(viewGroupArr[i18], new fz.c(this) { // from class: qp.y3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a4 f48274b;

                {
                    this.f48274b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj3) {
                    View it = (View) obj3;
                    switch (i11) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            a4 a4Var = this.f48274b;
                            mp.b bVar = a4Var.f47881a;
                            String strB = a4Var.b();
                            ta.a aVar5 = a4Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar5);
                            ImageView ivAudio = (ImageView) ((b6) ((hj.w2) aVar5).f33514c.f32524c).f32408d;
                            kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                            ((jp.p0) bVar).H(ivAudio, strB);
                            break;
                        case 1:
                            kotlin.jvm.internal.m.f(it, "it");
                            a4 a4Var2 = this.f48274b;
                            mp.b bVar2 = a4Var2.f47881a;
                            String strB2 = a4Var2.b();
                            ta.a aVar6 = a4Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar6);
                            ((jp.p0) bVar2).H((ImageView) ((b6) ((hj.w2) aVar6).f33514c.f32524c).f32408d, strB2);
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "v");
                            a4 a4Var3 = this.f48274b;
                            View view = (View) a4Var3.f47818j;
                            if (view != null) {
                                a4Var3.r(view);
                            }
                            a4Var3.f47818j = it;
                            a4Var3.s(it);
                            ((jp.p0) a4Var3.f47881a).O(4);
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
        }
        ef.e.B(o());
    }

    @Override // qp.a
    public final void r(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        CardView cardView = (CardView) view;
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Context context = this.f47883c;
        kotlin.jvm.internal.m.f(context, "context");
        Integer numValueOf = Integer.valueOf(context.getColor(R.color.color_E1E9F6));
        kotlin.jvm.internal.m.f(context, "context");
        ObjectAnimator.ofObject(cardView, "cardBackgroundColor", argbEvaluator, numValueOf, Integer.valueOf(context.getColor(R.color.white))).setDuration(300L).start();
        TextView textView = (TextView) cardView.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) cardView.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) cardView.findViewById(R.id.tv_bottom);
        ArgbEvaluator argbEvaluator2 = new ArgbEvaluator();
        Integer numValueOf2 = Integer.valueOf(textView.getTextColors().getDefaultColor());
        kotlin.jvm.internal.m.f(context, "context");
        ObjectAnimator.ofObject(textView, "textColor", argbEvaluator2, numValueOf2, Integer.valueOf(context.getColor(R.color.second_black))).setDuration(300L).start();
        ArgbEvaluator argbEvaluator3 = new ArgbEvaluator();
        Integer numValueOf3 = Integer.valueOf(textView2.getTextColors().getDefaultColor());
        kotlin.jvm.internal.m.f(context, "context");
        ObjectAnimator.ofObject(textView2, "textColor", argbEvaluator3, numValueOf3, Integer.valueOf(context.getColor(R.color.primary_black))).setDuration(300L).start();
        ArgbEvaluator argbEvaluator4 = new ArgbEvaluator();
        Integer numValueOf4 = Integer.valueOf(textView3.getTextColors().getDefaultColor());
        kotlin.jvm.internal.m.f(context, "context");
        ObjectAnimator.ofObject(textView3, "textColor", argbEvaluator4, numValueOf4, Integer.valueOf(context.getColor(R.color.second_black))).setDuration(300L).start();
    }

    @Override // qp.a
    public final void s(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        CardView cardView = (CardView) view;
        int defaultColor = cardView.getCardBackgroundColor().getDefaultColor();
        Context context = this.f47883c;
        kotlin.jvm.internal.m.f(context, "context");
        android.support.v4.media.session.a.h(cardView, defaultColor, context.getColor(R.color.color_E1E9F6));
    }

    public final Model_Word_010 u() {
        Model_Word_010 model_Word_010 = this.f47825k;
        if (model_Word_010 != null) {
            return model_Word_010;
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    public final void v(CardView cardView, Word word) {
        TextView textView = (TextView) cardView.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) cardView.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) cardView.findViewById(R.id.tv_bottom);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
            textView2.setMaxLines(1);
            textView.setMaxLines(1);
            textView3.setMaxLines(1);
        }
        kotlin.jvm.internal.m.c(textView2);
        w(textView2);
        kotlin.jvm.internal.m.c(textView);
        kotlin.jvm.internal.m.c(textView3);
        boolean z11 = ((jp.p0) this.f47881a).Q;
        zq.c.e(word, textView, textView2, textView3, true);
    }

    public void w(TextView textView) {
        ff.h.L(this.f47883c, textView, 24);
        textView.postDelayed(new b2.c(4, textView, new pv.c(5, textView, this)), 0L);
    }

    public final void x() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((TextView) ((hj.w2) aVar).f33514c.f32525d).setVisibility(8);
        Word word = u().getWord();
        kotlin.jvm.internal.m.e(word, "getWord(...)");
        q(zq.c.c(word));
    }
}
