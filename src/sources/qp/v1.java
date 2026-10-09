package qp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.airbnb.lottie.LottieAnimationView;
import com.lingo.lingoskill.object.Model_Sentence_040;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import hj.b6;
import i0.pKy.shrCcjmOhAmRC;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v1 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Model_Sentence_040 f48222k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f48223l;
    public int m;

    public v1(mp.b bVar, long j11) {
        super(bVar, j11, 1);
        this.m = 4;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_040 model_Sentence_040 = this.f48222k;
        if (model_Sentence_040 != null) {
            return fv.b.G(model_Sentence_040.getSentenceId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // qp.a, hi.a
    public final String c() {
        return nv.p.m(this.f47882b, "1;", ";4");
    }

    @Override // qp.d, hi.a
    public final void d(ViewGroup viewGroup) {
        List list = this.f48223l;
        if (list == null) {
            kotlin.jvm.internal.m.n("options");
            throw null;
        }
        this.m = list.size();
        super.d(viewGroup);
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_040 model_Sentence_040 = this.f48222k;
        if (model_Sentence_040 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strH = fv.b.H(model_Sentence_040.getSentenceId());
        Model_Sentence_040 model_Sentence_041 = this.f48222k;
        if (model_Sentence_041 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        arrayList.add(new fv.a(2L, strH, fv.b.F(model_Sentence_041.getSentenceId())));
        if (!((jp.p0) this.f47881a).Q) {
            List<Word> list = this.f48223l;
            if (list == null) {
                kotlin.jvm.internal.m.n("options");
                throw null;
            }
            for (Word word : list) {
                qy.q qVar2 = fv.b.f28186a;
                long wordId = word.getWordId();
                String mainPic = word.getMainPic();
                kotlin.jvm.internal.m.e(mainPic, "getMainPic(...)");
                String strG0 = fv.b.g0(wordId, mainPic);
                long wordId2 = word.getWordId();
                String mainPic2 = word.getMainPic();
                kotlin.jvm.internal.m.e(mainPic2, "getMainPic(...)");
                arrayList.add(new fv.a(3L, strG0, fv.b.e0(wordId2, mainPic2)));
                if (word.Animation == 1) {
                    arrayList.add(new fv.a(3L, fv.b.U(word.getWordId()), fv.g.y(word.getWordId())));
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
        Model_Sentence_040 model_Sentence_040LoadFullObject = Model_Sentence_040.loadFullObject(this.f47882b);
        if (model_Sentence_040LoadFullObject == null) {
            throw new NoSuchElemException();
        }
        this.f48222k = model_Sentence_040LoadFullObject;
        List<Word> optionList = model_Sentence_040LoadFullObject.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        this.f48223l = optionList;
    }

    @Override // hi.a
    public final void k() {
    }

    @Override // qp.d
    public final fz.f n() {
        return u1.f48213a;
    }

    @Override // qp.d
    public final void p() {
        jp.p0 p0Var = (jp.p0) this.f47881a;
        final int i11 = 0;
        p0Var.O(0);
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        bq.z.b((ImageView) ((b6) ((hj.k2) aVar).f32812b.f32490c).f32408d, new fz.c(this) { // from class: qp.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v1 f48200b;

            {
                this.f48200b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i11) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        v1 v1Var = this.f48200b;
                        mp.b bVar = v1Var.f47881a;
                        String strB = v1Var.b();
                        ta.a aVar2 = v1Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar2);
                        ImageView ivAudio = (ImageView) ((b6) ((hj.k2) aVar2).f32812b.f32490c).f32408d;
                        kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                        ((jp.p0) bVar).H(ivAudio, strB);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        v1 v1Var2 = this.f48200b;
                        mp.b bVar2 = v1Var2.f47881a;
                        String strB2 = v1Var2.b();
                        ta.a aVar3 = v1Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar3);
                        ImageView ivAudio2 = (ImageView) ((b6) ((hj.k2) aVar3).f32812b.f32490c).f32408d;
                        kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                        ((jp.p0) bVar2).H(ivAudio2, strB2);
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        String strB = b();
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        p0Var.H((ImageView) ((b6) ((hj.k2) aVar2).f32812b.f32490c).f32408d, strB);
        Model_Sentence_040 model_Sentence_040 = this.f48222k;
        if (model_Sentence_040 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_040.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        q(zq.c.b(sentence));
        ArrayList arrayList = new ArrayList();
        int i12 = this.m;
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 == 0) {
                List list = this.f48223l;
                if (list == null) {
                    kotlin.jvm.internal.m.n("options");
                    throw null;
                }
                arrayList.add(list.get(0));
            } else {
                List list2 = this.f48223l;
                if (list2 == null) {
                    kotlin.jvm.internal.m.n("options");
                    throw null;
                }
                int iM = fr.j3.M(list2.size());
                while (true) {
                    int size = arrayList.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            List list3 = this.f48223l;
                            if (list3 != null) {
                                arrayList.add(list3.get(iM));
                                break;
                            } else {
                                kotlin.jvm.internal.m.n("options");
                                throw null;
                            }
                        }
                        Object obj = arrayList.get(i14);
                        i14++;
                        Word word = (Word) obj;
                        if (word != null) {
                            long wordId = word.getWordId();
                            List list4 = this.f48223l;
                            if (list4 == null) {
                                kotlin.jvm.internal.m.n("options");
                                throw null;
                            }
                            if (wordId == ((Word) list4.get(iM)).getWordId()) {
                                break;
                            }
                        }
                    }
                    List list5 = this.f48223l;
                    if (list5 == null) {
                        kotlin.jvm.internal.m.n("options");
                        throw null;
                    }
                    iM = fr.j3.M(list5.size());
                }
            }
        }
        Collections.shuffle(arrayList);
        int i15 = this.m;
        int i16 = 0;
        while (true) {
            final int i17 = 1;
            if (i16 >= i15) {
                bq.z.b(o(), new fz.c(this) { // from class: qp.t1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ v1 f48200b;

                    {
                        this.f48200b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj2) {
                        View it = (View) obj2;
                        switch (i17) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                v1 v1Var = this.f48200b;
                                mp.b bVar = v1Var.f47881a;
                                String strB2 = v1Var.b();
                                ta.a aVar3 = v1Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar3);
                                ImageView ivAudio = (ImageView) ((b6) ((hj.k2) aVar3).f32812b.f32490c).f32408d;
                                kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                                ((jp.p0) bVar).H(ivAudio, strB2);
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "it");
                                v1 v1Var2 = this.f48200b;
                                mp.b bVar2 = v1Var2.f47881a;
                                String strB3 = v1Var2.b();
                                ta.a aVar4 = v1Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar4);
                                ImageView ivAudio2 = (ImageView) ((b6) ((hj.k2) aVar4).f32812b.f32490c).f32408d;
                                kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                                ((jp.p0) bVar2).H(ivAudio2, strB3);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
                return;
            }
            View viewFindViewById = o().findViewById(w4.c.a(i16, "rl_answer_"));
            kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById;
            cardView.setVisibility(0);
            Object obj2 = arrayList.get(i16);
            kotlin.jvm.internal.m.e(obj2, "get(...)");
            Word word2 = (Word) obj2;
            cardView.setTag(word2);
            View viewFindViewById2 = cardView.findViewById(R.id.img_view);
            kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
            LottieAnimationView lottieAnimationView = (LottieAnimationView) viewFindViewById2;
            Context context = this.f47883c;
            if (!kotlin.jvm.internal.m.a(context.getString(R.string.device_oritation), "land")) {
                cardView.postDelayed(new b2.c(4, cardView, new pv.c(1, cardView, this)), 0L);
            }
            qy.q qVar = fv.b.f28186a;
            long wordId2 = word2.getWordId();
            String mainPic = word2.getMainPic();
            kotlin.jvm.internal.m.e(mainPic, "getMainPic(...)");
            File file = new File(fv.b.f0(wordId2, mainPic));
            String strM = defpackage.e.m(xt.b.a().k(), fv.g.y(word2.getWordId()));
            boolean zD = com.google.android.material.datepicker.d.D(strM);
            if (zD && this.f47884d.showAnim) {
                int[] iArr = bq.r.f4959a;
                th.j.a(new ay.x(new jh.i(strM, 2)).k(ky.e.f38937b).g(px.b.a()).h(new lf.x0(lottieAnimationView, 20), vx.b.f54316e), this.f47887g);
            } else {
                com.bumptech.glide.p pVarE = com.bumptech.glide.c.e(context);
                pVarE.getClass();
                new com.bumptech.glide.n(pVarE.f7693a, pVarE, Drawable.class, pVarE.f7694b).z(file).x(lottieAnimationView);
            }
            bq.z.b(cardView, new bt.n1(this, zD, lottieAnimationView, 9));
            i16++;
        }
    }

    @Override // qp.a, hi.a
    public final boolean a() {
        View view = (View) this.f47818j;
        boolean z11 = false;
        if (view == null || view.getTag() == null) {
            return false;
        }
        View view2 = (View) this.f47818j;
        kotlin.jvm.internal.m.c(view2);
        Object tag = view2.getTag();
        kotlin.jvm.internal.m.d(tag, shrCcjmOhAmRC.znIK);
        Word word = (Word) tag;
        Model_Sentence_040 model_Sentence_040 = this.f48222k;
        if (model_Sentence_040 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Word wordH = ij.c.h(model_Sentence_040.getAnswer());
        if (wordH != null && wordH.getWordId() == word.getWordId()) {
            z11 = true;
        }
        View view3 = (View) this.f47818j;
        kotlin.jvm.internal.m.c(view3);
        a.t(view3, z11);
        return z11;
    }
}
