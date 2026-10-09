package qp;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.object.Model_Sentence_020;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q1 extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Model_Sentence_020 f48128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public FrameLayout f48129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f48130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f48131l;
    public Sentence m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f48132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f48133o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public z4.w0 f48134p;

    @Override // hi.a
    public final boolean a() {
        ArrayList arrayList = new ArrayList();
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.h2) aVar).f32652b.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            Word word = (Word) hh.p0.g(((hj.h2) aVar2).f32652b, i11, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            int i12 = this.f48133o;
            if (i12 != -1 && i11 != i12) {
                arrayList.add(word);
            }
        }
        ArrayList arrayList2 = this.f48131l;
        if (arrayList2 == null) {
            kotlin.jvm.internal.m.n("answers");
            throw null;
        }
        if (arrayList2.size() == arrayList.size()) {
            ArrayList arrayList3 = this.f48131l;
            if (arrayList3 == null) {
                kotlin.jvm.internal.m.n("answers");
                throw null;
            }
            int size = arrayList3.size();
            for (int i13 = 0; i13 < size; i13++) {
                ArrayList arrayList4 = this.f48131l;
                if (arrayList4 == null) {
                    kotlin.jvm.internal.m.n("answers");
                    throw null;
                }
                if (((Word) arrayList4.get(i13)).getWordId() != ((Word) arrayList.get(i13)).getWordId()) {
                    ArrayList arrayList5 = this.f48131l;
                    if (arrayList5 == null) {
                        kotlin.jvm.internal.m.n("answers");
                        throw null;
                    }
                    if (!kotlin.jvm.internal.m.a(((Word) arrayList5.get(i13)).getWord(), ((Word) arrayList.get(i13)).getWord())) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_020 model_Sentence_020 = this.f48128i;
        if (model_Sentence_020 != null) {
            return fv.b.G(model_Sentence_020.getSentenceId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // hi.a
    public final String c() {
        return nv.p.m(this.f47882b, "1;", ";2");
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_020 model_Sentence_020 = this.f48128i;
        if (model_Sentence_020 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strH = fv.b.H(model_Sentence_020.getSentenceId());
        Model_Sentence_020 model_Sentence_021 = this.f48128i;
        if (model_Sentence_021 != null) {
            arrayList.add(new fv.a(2L, strH, fv.b.F(model_Sentence_021.getSentenceId())));
            return arrayList;
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // hi.a
    public final int i() {
        return 1;
    }

    @Override // hi.a
    public final void j() throws NoSuchElemException {
        Model_Sentence_020 model_Sentence_020LoadFullObject = Model_Sentence_020.loadFullObject(this.f47882b);
        if (model_Sentence_020LoadFullObject == null) {
            throw new NoSuchElemException();
        }
        this.f48128i = model_Sentence_020LoadFullObject;
    }

    @Override // hi.a
    public final void k() {
        h hVar = this.f48132n;
        if (hVar == null) {
            kotlin.jvm.internal.m.n("sentenceLayout");
            throw null;
        }
        hVar.e();
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        FlexboxLayout flexboxLayout = ((hj.h2) aVar).f32652b;
        flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new o1(this, 0)), 0L);
    }

    @Override // qp.d
    public final fz.f n() {
        return p1.f48113a;
    }

    @Override // qp.d
    public final void p() {
        Model_Sentence_020 model_Sentence_020 = this.f48128i;
        if (model_Sentence_020 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_020.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        this.m = sentence;
        ArrayList arrayList = new ArrayList();
        Model_Sentence_020 model_Sentence_021 = this.f48128i;
        if (model_Sentence_021 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> answerList = model_Sentence_021.getAnswerList();
        kotlin.jvm.internal.m.e(answerList, "getAnswerList(...)");
        arrayList.addAll(answerList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.m.a(((Word) it.next()).getWord(), " ")) {
                it.remove();
            }
        }
        this.f48130k = arrayList;
        ArrayList arrayList2 = new ArrayList();
        Model_Sentence_020 model_Sentence_022 = this.f48128i;
        if (model_Sentence_022 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> sentWords = model_Sentence_022.getSentence().getSentWords();
        kotlin.jvm.internal.m.e(sentWords, "getSentWords(...)");
        arrayList2.addAll(sentWords);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (kotlin.jvm.internal.m.a(((Word) it2.next()).getWord(), " ")) {
                it2.remove();
            }
        }
        this.f48131l = arrayList2;
        ((jp.p0) this.f47881a).O(0);
        ArrayList arrayList3 = this.f48130k;
        if (arrayList3 == null) {
            kotlin.jvm.internal.m.n("options");
            throw null;
        }
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        FlexboxLayout flexboxLayout = ((hj.h2) aVar).f32652b;
        Context context = this.f47883c;
        h hVar = new h(this, context, arrayList3, flexboxLayout, 5);
        this.f48132n = hVar;
        hVar.d();
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        int childCount = ((hj.h2) aVar2).f32652b.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            View childAt = ((hj.h2) aVar3).f32652b.getChildAt(i11);
            kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) childAt;
            CardView cardView = (CardView) frameLayout.findViewById(R.id.card_item);
            LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(R.id.ll_item);
            ImageView imageView = (ImageView) frameLayout.findViewById(R.id.iv_delete);
            Object tag = frameLayout.getTag();
            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            if (((Word) tag).getWordType() != 1) {
                imageView.setVisibility(0);
                cardView.setCardBackgroundColor(context.getColor(R.color.white));
                bq.z.b(frameLayout, new au.a1(this, imageView, i11, frameLayout, 3));
                linearLayout.setPadding(ff.h.l(8.0f), ff.h.l(4.0f), ff.h.l(8.0f), ff.h.l(4.0f));
            }
            frameLayout.requestLayout();
        }
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        TextView textView = ((hj.h2) aVar4).f32653c;
        Sentence sentence2 = this.m;
        if (sentence2 == null) {
            kotlin.jvm.internal.m.n("mainSent");
            throw null;
        }
        textView.setText(sentence2.getTranslations());
        Model_Sentence_020 model_Sentence_023 = this.f48128i;
        if (model_Sentence_023 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence3 = model_Sentence_023.getSentence();
        kotlin.jvm.internal.m.e(sentence3, "getSentence(...)");
        q(zq.c.b(sentence3));
        ef.e.B(o());
    }
}
