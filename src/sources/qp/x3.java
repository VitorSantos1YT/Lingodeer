package qp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Model_Word_010;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class x3 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Model_Word_010 f48258k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f48259l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f48260n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f48261o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qy.q f48262p;

    public x3(mp.b bVar, long j11) {
        super(bVar, j11, 1);
        this.m = 4;
        this.f48260n = 24;
        this.f48261o = 24;
        this.f48262p = com.bumptech.glide.d.v(new dt.k2(this, j11, 3));
    }

    @Override // qp.a, hi.a
    public final boolean a() {
        Word word;
        int i11;
        View view = (View) this.f47818j;
        boolean z11 = false;
        if (view != null && (word = (Word) view.getTag()) != null) {
            long wordId = word.getWordId();
            Word word2 = v().getWord();
            kotlin.jvm.internal.m.e(word2, "getWord(...)");
            z11 = wordId == word2.getWordId();
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
        Word word = v().getWord();
        kotlin.jvm.internal.m.e(word, "getWord(...)");
        return u(word);
    }

    @Override // qp.a, hi.a
    public String c() {
        return (String) this.f48262p.getValue();
    }

    @Override // qp.d, hi.a
    public final void d(ViewGroup viewGroup) {
        List<Word> optionList = v().getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        this.f48259l = optionList;
        this.m = optionList.size();
        super.d(viewGroup);
    }

    @Override // hi.a
    public List g() {
        ArrayList arrayList = new ArrayList();
        for (Word word : v().getOptionList()) {
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
        this.f48258k = model_Word_010LoadFullObject;
        if (v().getOptionList().size() == 0) {
            throw new NoSuchElemException();
        }
    }

    @Override // hi.a
    public final void k() {
        y();
        int i11 = this.m;
        for (int i12 = 0; i12 < i11; i12++) {
            View viewFindViewById = o().findViewById(w4.c.a(i12, "rl_answer_"));
            kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById;
            Object tag = cardView.getTag();
            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            w(cardView, (Word) tag);
        }
    }

    @Override // qp.d
    public final fz.f n() {
        return w3.f48248a;
    }

    @Override // qp.d
    public final void p() {
        ((jp.p0) this.f47881a).O(0);
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((TextView) ((hj.v2) aVar).f33454b.f32490c).setTextSize(this.f48260n);
        y();
        ArrayList arrayList = new ArrayList();
        int i11 = this.m;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 == 0) {
                Word word = v().getWord();
                kotlin.jvm.internal.m.e(word, "getWord(...)");
                arrayList.add(word);
            } else {
                int iM = fr.j3.M(this.m);
                while (true) {
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            List list = this.f48259l;
                            if (list != null) {
                                arrayList.add(list.get(iM));
                                break;
                            } else {
                                kotlin.jvm.internal.m.n("options");
                                throw null;
                            }
                        }
                        Object obj = arrayList.get(i13);
                        i13++;
                        Word word2 = (Word) obj;
                        if (word2 != null) {
                            long wordId = word2.getWordId();
                            List list2 = this.f48259l;
                            if (list2 == null) {
                                kotlin.jvm.internal.m.n("options");
                                throw null;
                            }
                            if (wordId == ((Word) list2.get(iM)).getWordId()) {
                                break;
                            }
                        }
                    }
                    iM = fr.j3.M(this.m);
                }
            }
        }
        Collections.shuffle(arrayList);
        int i14 = this.m;
        for (int i15 = 0; i15 < i14; i15++) {
            int iA = w4.c.a(i15, "rl_answer_");
            Object obj2 = arrayList.get(i15);
            kotlin.jvm.internal.m.e(obj2, "get(...)");
            Word word3 = (Word) obj2;
            View viewFindViewById = o().findViewById(iA);
            kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById;
            cardView.setVisibility(0);
            if (!kotlin.jvm.internal.m.a(this.f47883c.getString(R.string.device_oritation), "land")) {
                cardView.postDelayed(new b2.c(4, cardView, new pv.c(3, cardView, this)), 0L);
            }
            cardView.setTag(word3);
            bq.z.b(cardView, new ot.e2(this, 13));
            w(cardView, word3);
        }
        ef.e.B(o());
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

    public String u(Word word) {
        qy.q qVar = fv.b.f28186a;
        return fv.b.Y(word.getWordId(), null, null);
    }

    public final Model_Word_010 v() {
        Model_Word_010 model_Word_010 = this.f48258k;
        if (model_Word_010 != null) {
            return model_Word_010;
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    public final void w(CardView cardView, Word word) {
        TextView textView = (TextView) cardView.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) cardView.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) cardView.findViewById(R.id.tv_bottom);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
            textView2.setMaxLines(1);
            textView.setMaxLines(1);
            textView3.setMaxLines(1);
        }
        textView2.setTextSize(this.f48261o);
        kotlin.jvm.internal.m.c(textView);
        kotlin.jvm.internal.m.c(textView3);
        textView.setVisibility(8);
        textView3.setVisibility(8);
        x(textView2);
        boolean z11 = ((jp.p0) this.f47881a).Q;
        zq.c.e(word, textView, textView2, textView3, true);
    }

    public void x(TextView textView) {
        v10.c.G(textView);
        ff.h.L(this.f47883c, textView, 24);
        textView.postDelayed(new b2.c(4, textView, new pv.c(4, textView, this)), 0L);
    }

    public final void y() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((TextView) ((hj.v2) aVar).f33454b.f32490c).setText(v().getWord().getTranslations());
        Word word = v().getWord();
        kotlin.jvm.internal.m.e(word, "getWord(...)");
        q(zq.c.c(word));
    }
}
