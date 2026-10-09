package qp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
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
public final class f4 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Model_Word_010 f47933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f47934l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f47935n;

    public f4(mp.b bVar, long j11) {
        super(bVar, j11, 1);
        this.m = 4;
        this.f47935n = nv.p.m(j11, "0;", ";4");
    }

    @Override // qp.a, hi.a
    public final boolean a() {
        Word word;
        int i11;
        View view = (View) this.f47818j;
        boolean z11 = false;
        if (view != null && (word = (Word) view.getTag()) != null) {
            z11 = word.getWordId() == u().getWordId();
            TextView textView = (TextView) view.findViewById(R.id.tv_top);
            TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
            TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
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
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Word_010 model_Word_010 = this.f47933k;
        if (model_Word_010 != null) {
            return fv.b.Y(model_Word_010.getWordId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // qp.a, hi.a
    public final String c() {
        return this.f47935n;
    }

    @Override // qp.d, hi.a
    public final void d(ViewGroup viewGroup) {
        Model_Word_010 model_Word_010 = this.f47933k;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> optionList = model_Word_010.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        this.f47934l = optionList;
        this.m = optionList.size();
        ArrayList arrayList = new ArrayList();
        arrayList.add(u());
        List<Word> list = this.f47934l;
        if (list == null) {
            kotlin.jvm.internal.m.n("options");
            throw null;
        }
        for (Word word : list) {
            int size = arrayList.size();
            boolean z11 = false;
            for (int i11 = 0; i11 < size; i11++) {
                Word word2 = (Word) arrayList.get(i11);
                if (word2.getWordId() == word.getWordId() || kotlin.jvm.internal.m.a(word2.getTranslations(), word.getTranslations())) {
                    z11 = true;
                }
            }
            if (!z11) {
                arrayList.add(word);
            }
        }
        List list2 = this.f47934l;
        if (list2 == null) {
            kotlin.jvm.internal.m.n("options");
            throw null;
        }
        list2.clear();
        List list3 = this.f47934l;
        if (list3 == null) {
            kotlin.jvm.internal.m.n("options");
            throw null;
        }
        list3.addAll(arrayList);
        List list4 = this.f47934l;
        if (list4 == null) {
            kotlin.jvm.internal.m.n("options");
            throw null;
        }
        this.m = list4.size();
        if (this.f47884d.keyLanguage == 1) {
            if (fr.j3.M(2) == 0) {
                if (this.m > 2) {
                    this.m = 2;
                }
            } else if (this.m == 4) {
                this.m = 4;
            }
        }
        super.d(viewGroup);
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        Model_Word_010 model_Word_010 = this.f47933k;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        for (Word word : model_Word_010.getOptionList()) {
            qy.q qVar = fv.b.f28186a;
            arrayList.add(new fv.a(2L, fv.b.Z(word.getWordId()), fv.b.V(word.getWordId())));
        }
        return arrayList;
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
        this.f47933k = model_Word_010LoadFullObject;
        if (model_Word_010LoadFullObject.getOptionList().size() == 0) {
            throw new NoSuchElemException();
        }
    }

    @Override // hi.a
    public final void k() {
        v();
    }

    @Override // qp.d
    public final fz.f n() {
        return e4.f47913a;
    }

    @Override // qp.d
    public final void p() {
        String translations;
        List list;
        ((jp.p0) this.f47881a).O(0);
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        final int i11 = 1;
        bq.z.b((ImageView) ((b6) ((hj.y2) aVar).f33615b.f32524c).f32408d, new fz.c(this) { // from class: qp.d4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f4 f47899b;

            {
                this.f47899b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i11) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        f4 f4Var = this.f47899b;
                        mp.b bVar = f4Var.f47881a;
                        String strB = f4Var.b();
                        ta.a aVar2 = f4Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar2);
                        ImageView ivAudio = (ImageView) ((b6) ((hj.y2) aVar2).f33615b.f32524c).f32408d;
                        kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                        ((jp.p0) bVar).H(ivAudio, strB);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        f4 f4Var2 = this.f47899b;
                        mp.b bVar2 = f4Var2.f47881a;
                        String strB2 = f4Var2.b();
                        ta.a aVar3 = f4Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar3);
                        ((jp.p0) bVar2).H((ImageView) ((b6) ((hj.y2) aVar3).f33615b.f32524c).f32408d, strB2);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "v");
                        f4 f4Var3 = this.f47899b;
                        View view = (View) f4Var3.f47818j;
                        if (view != null) {
                            f4Var3.r(view);
                        }
                        f4Var3.f47818j = it;
                        f4Var3.s(it);
                        ((jp.p0) f4Var3.f47881a).O(4);
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((ImageView) ((b6) ((hj.y2) aVar2).f33615b.f32524c).f32408d).performClick();
        v();
        ArrayList arrayList = new ArrayList();
        int i12 = this.m;
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 == 0) {
                arrayList.add(u());
            } else {
                int iM = fr.j3.M(this.m);
                while (true) {
                    int size = arrayList.size();
                    int i14 = 0;
                    do {
                        if (i14 >= size) {
                            List list2 = this.f47934l;
                            if (list2 != null) {
                                arrayList.add(list2.get(iM));
                                break;
                            } else {
                                kotlin.jvm.internal.m.n("options");
                                throw null;
                            }
                        }
                        Object obj = arrayList.get(i14);
                        i14++;
                        Word word = (Word) obj;
                        long wordId = word.getWordId();
                        List list3 = this.f47934l;
                        if (list3 == null) {
                            kotlin.jvm.internal.m.n("options");
                            throw null;
                        }
                        if (wordId == ((Word) list3.get(iM)).getWordId()) {
                            break;
                        }
                        translations = word.getTranslations();
                        list = this.f47934l;
                        if (list == null) {
                            kotlin.jvm.internal.m.n("options");
                            throw null;
                        }
                    } while (!kotlin.jvm.internal.m.a(translations, ((Word) list.get(iM)).getTranslations()));
                    iM = fr.j3.M(this.m);
                }
            }
        }
        Collections.shuffle(arrayList);
        int size2 = arrayList.size();
        for (int i15 = 0; i15 < size2; i15++) {
            int iA = w4.c.a(i15, "rl_answer_");
            Object obj2 = arrayList.get(i15);
            kotlin.jvm.internal.m.e(obj2, "get(...)");
            Word word2 = (Word) obj2;
            View viewFindViewById = o().findViewById(iA);
            kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById;
            cardView.setVisibility(0);
            cardView.setTag(word2);
            final int i16 = 2;
            bq.z.b(cardView, new fz.c(this) { // from class: qp.d4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f4 f47899b;

                {
                    this.f47899b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj3) {
                    View it = (View) obj3;
                    switch (i16) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            f4 f4Var = this.f47899b;
                            mp.b bVar = f4Var.f47881a;
                            String strB = f4Var.b();
                            ta.a aVar3 = f4Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar3);
                            ImageView ivAudio = (ImageView) ((b6) ((hj.y2) aVar3).f33615b.f32524c).f32408d;
                            kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                            ((jp.p0) bVar).H(ivAudio, strB);
                            break;
                        case 1:
                            kotlin.jvm.internal.m.f(it, "it");
                            f4 f4Var2 = this.f47899b;
                            mp.b bVar2 = f4Var2.f47881a;
                            String strB2 = f4Var2.b();
                            ta.a aVar4 = f4Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar4);
                            ((jp.p0) bVar2).H((ImageView) ((b6) ((hj.y2) aVar4).f33615b.f32524c).f32408d, strB2);
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "v");
                            f4 f4Var3 = this.f47899b;
                            View view = (View) f4Var3.f47818j;
                            if (view != null) {
                                f4Var3.r(view);
                            }
                            f4Var3.f47818j = it;
                            f4Var3.s(it);
                            ((jp.p0) f4Var3.f47881a).O(4);
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            LinearLayout linearLayout = (LinearLayout) cardView.findViewById(R.id.ll_word);
            kotlin.jvm.internal.m.c(linearLayout);
            bq.z.b(linearLayout, new kp.c(cardView, 5));
            TextView textView = (TextView) cardView.findViewById(R.id.tv_top);
            TextView textView2 = (TextView) cardView.findViewById(R.id.tv_middle);
            TextView textView3 = (TextView) cardView.findViewById(R.id.tv_bottom);
            kotlin.jvm.internal.m.c(textView2);
            ff.h.L(this.f47883c, textView2, 22);
            textView.setVisibility(8);
            textView3.setVisibility(8);
            textView2.setText(word2.getTranslations());
        }
        ef.e.B(o());
        final int i17 = 0;
        bq.z.b(o(), new fz.c(this) { // from class: qp.d4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f4 f47899b;

            {
                this.f47899b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj3) {
                View it = (View) obj3;
                switch (i17) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        f4 f4Var = this.f47899b;
                        mp.b bVar = f4Var.f47881a;
                        String strB = f4Var.b();
                        ta.a aVar3 = f4Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar3);
                        ImageView ivAudio = (ImageView) ((b6) ((hj.y2) aVar3).f33615b.f32524c).f32408d;
                        kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                        ((jp.p0) bVar).H(ivAudio, strB);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        f4 f4Var2 = this.f47899b;
                        mp.b bVar2 = f4Var2.f47881a;
                        String strB2 = f4Var2.b();
                        ta.a aVar4 = f4Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar4);
                        ((jp.p0) bVar2).H((ImageView) ((b6) ((hj.y2) aVar4).f33615b.f32524c).f32408d, strB2);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "v");
                        f4 f4Var3 = this.f47899b;
                        View view = (View) f4Var3.f47818j;
                        if (view != null) {
                            f4Var3.r(view);
                        }
                        f4Var3.f47818j = it;
                        f4Var3.s(it);
                        ((jp.p0) f4Var3.f47881a).O(4);
                        break;
                }
                return qy.b0.f48488a;
            }
        });
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

    public final Word u() {
        Model_Word_010 model_Word_010 = this.f47933k;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Word word = model_Word_010.getWord();
        kotlin.jvm.internal.m.e(word, "getWord(...)");
        return word;
    }

    public final void v() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        TextView textView = (TextView) ((hj.y2) aVar).f33615b.f32525d;
        Model_Word_010 model_Word_010 = this.f47933k;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Word word = model_Word_010.getWord();
        kotlin.jvm.internal.m.e(word, "getWord(...)");
        textView.setText(zq.c.a(word, this.f47883c));
        Model_Word_010 model_Word_011 = this.f47933k;
        if (model_Word_011 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Word word2 = model_Word_011.getWord();
        kotlin.jvm.internal.m.e(word2, "getWord(...)");
        q(zq.c.c(word2));
    }

    @Override // qp.a
    public final void s(View view) {
        kotlin.jvm.internal.m.f(view, ualZoVVCQs.vrQtDmM);
        CardView cardView = (CardView) view;
        int defaultColor = cardView.getCardBackgroundColor().getDefaultColor();
        Context context = this.f47883c;
        kotlin.jvm.internal.m.f(context, "context");
        android.support.v4.media.session.a.h(cardView, defaultColor, context.getColor(R.color.color_E1E9F6));
    }
}
