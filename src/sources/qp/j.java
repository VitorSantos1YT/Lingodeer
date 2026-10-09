package qp;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.object.Model_Sentence_020;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Model_Sentence_020 f47983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public FrameLayout f47984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f47985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f47986l;
    public Sentence m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f47987n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f47988o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f47989p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z4.w0 f47990q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f47991r;

    public j(mp.b bVar, long j11) {
        super(bVar, j11);
        int[] iArr = bq.r.f4959a;
        this.f47991r = bq.m.b();
    }

    @Override // hi.a
    public final boolean a() {
        ArrayList arrayList = new ArrayList();
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.k1) aVar).f32808c.getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            Word word = (Word) hh.p0.g(((hj.k1) aVar2).f32808c, i12, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            int i13 = this.f47988o;
            if (i13 != -1 && i12 != i13) {
                arrayList.add(word);
            }
        }
        ArrayList arrayList2 = this.f47986l;
        if (arrayList2 == null) {
            kotlin.jvm.internal.m.n("answers");
            throw null;
        }
        boolean z11 = arrayList2.size() == arrayList.size();
        ArrayList arrayList3 = this.f47986l;
        if (arrayList3 == null) {
            kotlin.jvm.internal.m.n("answers");
            throw null;
        }
        int size = arrayList3.size();
        for (int i14 = 0; i14 < size; i14++) {
            ArrayList arrayList4 = this.f47986l;
            if (arrayList4 == null) {
                kotlin.jvm.internal.m.n("answers");
                throw null;
            }
            if (((Word) arrayList4.get(i14)).getWordId() != ((Word) arrayList.get(i14)).getWordId()) {
                ArrayList arrayList5 = this.f47986l;
                if (arrayList5 == null) {
                    kotlin.jvm.internal.m.n("answers");
                    throw null;
                }
                if (!kotlin.jvm.internal.m.a(((Word) arrayList5.get(i14)).getWord(), ((Word) arrayList.get(i14)).getWord())) {
                    z11 = false;
                }
            }
        }
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((LottieAnimationView) ((hj.k1) aVar3).f32807b.f32359e).e();
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((LottieAnimationView) ((hj.k1) aVar4).f32807b.f32359e).setRepeatCount(0);
        List list = this.f47991r;
        if (z11) {
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ((hj.k1) aVar5).f32807b.f32360f;
            Collection collection = (Collection) list.get(1);
            jz.d dVar = jz.e.f37397a;
            lottieAnimationView.setAnimation(((Number) ry.m.I0(collection)).intValue());
        } else {
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ((hj.k1) aVar6).f32807b.f32360f;
            Collection collection2 = (Collection) list.get(2);
            jz.d dVar2 = jz.e.f37397a;
            lottieAnimationView2.setAnimation(((Number) ry.m.I0(collection2)).intValue());
        }
        if (this.f47884d.showAnim) {
            ta.a aVar7 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar7);
            ((LottieAnimationView) ((hj.k1) aVar7).f32807b.f32360f).d(new f(this, i11));
            return z11;
        }
        ta.a aVar8 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar8);
        ((LottieAnimationView) ((hj.k1) aVar8).f32807b.f32359e).e();
        return z11;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_020 model_Sentence_020 = this.f47983i;
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
        Model_Sentence_020 model_Sentence_020 = this.f47983i;
        if (model_Sentence_020 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strH = fv.b.H(model_Sentence_020.getSentenceId());
        Model_Sentence_020 model_Sentence_021 = this.f47983i;
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
        this.f47983i = model_Sentence_020LoadFullObject;
    }

    @Override // hi.a
    public final void k() {
        h hVar = this.f47987n;
        if (hVar == null) {
            kotlin.jvm.internal.m.n("sentenceLayout");
            throw null;
        }
        hVar.e();
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        FlexboxLayout flexboxLayout = ((hj.k1) aVar).f32808c;
        flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new e(this, 0)), 0L);
    }

    @Override // qp.d
    public final fz.f n() {
        return g.f47936a;
    }

    @Override // qp.d
    public final void p() {
        int i11;
        Model_Sentence_020 model_Sentence_020 = this.f47983i;
        if (model_Sentence_020 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_020.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        this.m = sentence;
        ArrayList arrayList = new ArrayList();
        Model_Sentence_020 model_Sentence_021 = this.f47983i;
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
        this.f47985k = arrayList;
        ArrayList arrayList2 = new ArrayList();
        Model_Sentence_020 model_Sentence_022 = this.f47983i;
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
        this.f47986l = arrayList2;
        ((jp.p0) this.f47881a).O(0);
        this.f47989p = false;
        ArrayList arrayList3 = this.f47985k;
        if (arrayList3 == null) {
            kotlin.jvm.internal.m.n("options");
            throw null;
        }
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        h hVar = new h(this, this.f47883c, arrayList3, ((hj.k1) aVar).f32808c, 0);
        this.f47987n = hVar;
        hVar.d();
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        int childCount = ((hj.k1) aVar2).f32808c.getChildCount();
        int i12 = 0;
        while (true) {
            i11 = 1;
            if (i12 >= childCount) {
                break;
            }
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            View childAt = ((hj.k1) aVar3).f32808c.getChildAt(i12);
            kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) childAt;
            LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(R.id.ll_item);
            Object tag = frameLayout.getTag();
            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            if (((Word) tag).getWordType() != 1) {
                linearLayout.setBackgroundResource(R.drawable.flexbox_grey_under_light_line);
                bq.z.b(frameLayout, new au.k(this, i12, 3, frameLayout));
            }
            linearLayout.setPadding(ff.h.l(8.0f), ff.h.l(4.0f), ff.h.l(8.0f), ff.h.l(4.0f));
            frameLayout.requestLayout();
            i12++;
        }
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        TextView textView = ((hj.k1) aVar4).f32807b.f32356b;
        Sentence sentence2 = this.m;
        if (sentence2 == null) {
            kotlin.jvm.internal.m.n("mainSent");
            throw null;
        }
        textView.setText(sentence2.getTranslations());
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        ((ImageView) ((hj.k1) aVar5).f32807b.f32358d).setVisibility(8);
        Model_Sentence_020 model_Sentence_023 = this.f47983i;
        if (model_Sentence_023 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence3 = model_Sentence_023.getSentence();
        kotlin.jvm.internal.m.e(sentence3, "getSentence(...)");
        q(zq.c.b(sentence3));
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        FrameLayout frameLayout2 = ((hj.k1) aVar6).f32809d;
        frameLayout2.postDelayed(new b2.c(4, frameLayout2, new e(this, i11)), 0L);
        ef.e.B(o());
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ((hj.k1) aVar7).f32807b.f32359e;
        Collection collection = (Collection) this.f47991r.get(0);
        jz.d dVar = jz.e.f37397a;
        lottieAnimationView.setAnimation(((Number) ry.m.I0(collection)).intValue());
        ta.a aVar8 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar8);
        ((LottieAnimationView) ((hj.k1) aVar8).f32807b.f32359e).setRepeatCount(-1);
        if (this.f47884d.showAnim) {
            ta.a aVar9 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar9);
            ((LottieAnimationView) ((hj.k1) aVar9).f32807b.f32359e).h();
        } else {
            ta.a aVar10 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar10);
            ((LottieAnimationView) ((hj.k1) aVar10).f32807b.f32359e).e();
        }
    }
}
