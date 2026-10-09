package qp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.lingo.lingoskill.object.Model_Word_010;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lt.AJC.PQgum;
import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z4 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Model_Word_010 f48295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f48296l;
    public int m;

    @Override // qp.a, hi.a
    public final boolean a() {
        int i11;
        View view = (View) this.f47818j;
        if (view == null || view.getTag() == null) {
            return false;
        }
        View view2 = (View) this.f47818j;
        kotlin.jvm.internal.m.c(view2);
        Object tag = view2.getTag();
        kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
        long wordId = ((Word) tag).getWordId();
        Model_Word_010 model_Word_010 = this.f48295k;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Word word = model_Word_010.getWord();
        kotlin.jvm.internal.m.e(word, "getWord(...)");
        boolean z11 = wordId == word.getWordId();
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
        return z11;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Word_010 model_Word_010 = this.f48295k;
        if (model_Word_010 != null) {
            return fv.b.Y(model_Word_010.getWordId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // qp.a, hi.a
    public final String c() {
        return nv.p.m(this.f47882b, "0;", ";12");
    }

    @Override // qp.d, hi.a
    public final void d(ViewGroup viewGroup) {
        Model_Word_010 model_Word_010 = this.f48295k;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> optionList = model_Word_010.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        this.f48296l = optionList;
        this.m = optionList.size();
        super.d(viewGroup);
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        Model_Word_010 model_Word_010 = this.f48295k;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strZ = fv.b.Z(model_Word_010.getWordId());
        Model_Word_010 model_Word_011 = this.f48295k;
        if (model_Word_011 != null) {
            arrayList.add(new fv.a(2L, strZ, fv.b.V(model_Word_011.getWordId())));
            return arrayList;
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // hi.a
    public final int i() {
        return 0;
    }

    @Override // hi.a
    public final void j() throws NoSuchElemException {
        Model_Word_010 model_Word_010LoadFullObject = Model_Word_010.loadFullObject(this.f47882b);
        if (model_Word_010LoadFullObject == null) {
            throw new NoSuchElemException();
        }
        this.f48295k = model_Word_010LoadFullObject;
        if (model_Word_010LoadFullObject.getOptionList().size() == 0) {
            throw new NoSuchElemException();
        }
    }

    @Override // hi.a
    public final void k() {
        u();
    }

    @Override // qp.d
    public final fz.f n() {
        return y4.f48275a;
    }

    @Override // qp.a
    public final void r(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        CardView cardView = (CardView) view;
        int defaultColor = cardView.getCardBackgroundColor().getDefaultColor();
        Context context = this.f47883c;
        kotlin.jvm.internal.m.f(context, "context");
        android.support.v4.media.session.a.h(cardView, defaultColor, context.getColor(R.color.white));
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

    @Override // qp.d
    public final void p() {
        long wordId;
        List list;
        jp.p0 p0Var = (jp.p0) this.f47881a;
        p0Var.O(0);
        p0Var.I(b());
        u();
        ArrayList arrayList = new ArrayList();
        int i11 = this.m;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 == 0) {
                Model_Word_010 model_Word_010 = this.f48295k;
                if (model_Word_010 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                Word word = model_Word_010.getWord();
                kotlin.jvm.internal.m.e(word, "getWord(...)");
                arrayList.add(word);
            } else {
                int iM = fr.j3.M(this.m);
                while (true) {
                    int size = arrayList.size();
                    int i13 = 0;
                    do {
                        String str = txBUGYhC.JNuYwfVYBA;
                        if (i13 >= size) {
                            List list2 = this.f48296l;
                            if (list2 != null) {
                                arrayList.add(list2.get(iM));
                                break;
                            } else {
                                kotlin.jvm.internal.m.n(str);
                                throw null;
                            }
                        }
                        Object obj = arrayList.get(i13);
                        i13++;
                        wordId = ((Word) obj).getWordId();
                        list = this.f48296l;
                        if (list == null) {
                            kotlin.jvm.internal.m.n(str);
                            throw null;
                        }
                    } while (wordId != ((Word) list.get(iM)).getWordId());
                    iM = fr.j3.M(this.m);
                }
            }
        }
        Collections.shuffle(arrayList);
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            int iA = w4.c.a(i14, "rl_answer_");
            Object obj2 = arrayList.get(i14);
            kotlin.jvm.internal.m.e(obj2, "get(...)");
            Word word2 = (Word) obj2;
            View viewFindViewById = o().findViewById(iA);
            kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById;
            cardView.setVisibility(0);
            cardView.setTag(word2);
            final int i15 = 1;
            bq.z.b(cardView, new fz.c(this) { // from class: qp.x4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z4 f48264b;

                {
                    this.f48264b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj3) {
                    View it = (View) obj3;
                    switch (i15) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            z4 z4Var = this.f48264b;
                            ((jp.p0) z4Var.f47881a).I(z4Var.b());
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "v");
                            z4 z4Var2 = this.f48264b;
                            View view = (View) z4Var2.f47818j;
                            if (view != null) {
                                z4Var2.r(view);
                            }
                            z4Var2.f47818j = it;
                            z4Var2.s(it);
                            ((jp.p0) z4Var2.f47881a).O(4);
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            TextView textView = (TextView) cardView.findViewById(R.id.tv_top);
            TextView textView2 = (TextView) cardView.findViewById(R.id.tv_middle);
            TextView textView3 = (TextView) cardView.findViewById(R.id.tv_bottom);
            kotlin.jvm.internal.m.c(textView2);
            ff.h.L(this.f47883c, textView2, 22);
            textView.setVisibility(8);
            textView3.setVisibility(8);
            textView2.setText(word2.getTranslations());
            ((HorizontalScrollView) cardView.findViewById(R.id.hor_scroll_view)).setOnTouchListener(new o(4, this, cardView));
        }
        if (this.f47884d.isAudioModel) {
            p0Var.I(b());
        }
        ef.e.B(o());
        final int i16 = 0;
        bq.z.b(o(), new fz.c(this) { // from class: qp.x4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z4 f48264b;

            {
                this.f48264b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj3) {
                View it = (View) obj3;
                switch (i16) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        z4 z4Var = this.f48264b;
                        ((jp.p0) z4Var.f47881a).I(z4Var.b());
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "v");
                        z4 z4Var2 = this.f48264b;
                        View view = (View) z4Var2.f47818j;
                        if (view != null) {
                            z4Var2.r(view);
                        }
                        z4Var2.f47818j = it;
                        z4Var2.s(it);
                        ((jp.p0) z4Var2.f47881a).O(4);
                        break;
                }
                return qy.b0.f48488a;
            }
        });
    }

    public final void u() {
        Model_Word_010 model_Word_010 = this.f48295k;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Word word = model_Word_010.getWord();
        String str = PQgum.rMCZy;
        kotlin.jvm.internal.m.e(word, str);
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        TextView textView = ((hj.s2) aVar).f33262b.f32636e;
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        TextView textView2 = ((hj.s2) aVar2).f33262b.f32635d;
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        TextView textView3 = ((hj.s2) aVar3).f33262b.f32634c;
        boolean z11 = ((jp.p0) this.f47881a).Q;
        zq.c.e(word, textView, textView2, textView3, true);
        Model_Word_010 model_Word_011 = this.f48295k;
        if (model_Word_011 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Word word2 = model_Word_011.getWord();
        kotlin.jvm.internal.m.e(word2, str);
        q(zq.c.c(word2));
    }
}
