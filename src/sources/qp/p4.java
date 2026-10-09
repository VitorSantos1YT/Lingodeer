package qp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.airbnb.lottie.LottieAnimationView;
import com.lingo.lingoskill.object.Model_Word_010;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p4 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Model_Word_010 f48122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f48123l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f48124n;

    public p4(mp.b bVar, long j11) {
        super(bVar, j11, 1);
        this.m = 4;
        this.f48124n = nv.p.m(j11, "0;", ";8");
    }

    @Override // qp.a, hi.a
    public final boolean a() {
        Word word;
        View view = (View) this.f47818j;
        if (view == null || (word = (Word) view.getTag()) == null) {
            return false;
        }
        long wordId = word.getWordId();
        Model_Word_010 model_Word_010 = this.f48122k;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Word word2 = model_Word_010.getWord();
        kotlin.jvm.internal.m.e(word2, "getWord(...)");
        boolean z11 = wordId == word2.getWordId();
        a.t(view, z11);
        return z11;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Word_010 model_Word_010 = this.f48122k;
        if (model_Word_010 != null) {
            return fv.b.Y(model_Word_010.getWordId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // qp.a, hi.a
    public final String c() {
        return this.f48124n;
    }

    @Override // qp.d, hi.a
    public final void d(ViewGroup viewGroup) {
        Model_Word_010 model_Word_010 = this.f48122k;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> optionList = model_Word_010.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        this.f48123l = optionList;
        this.m = optionList.size();
        if (this.f47884d.keyLanguage == 1) {
            this.m = fr.j3.M(2) != 0 ? 4 : 2;
        }
        super.d(viewGroup);
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        Model_Word_010 model_Word_010 = this.f48122k;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        for (Word word : model_Word_010.getOptionList()) {
            qy.q qVar = fv.b.f28186a;
            arrayList.add(new fv.a(2L, fv.b.Z(word.getWordId()), fv.b.V(word.getWordId())));
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
        this.f48122k = model_Word_010LoadFullObject;
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
        return o4.f48099a;
    }

    @Override // qp.d
    public final void p() {
        long wordId;
        List list;
        ((jp.p0) this.f47881a).O(0);
        u();
        ArrayList arrayList = new ArrayList();
        int i11 = this.m;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 == 0) {
                Model_Word_010 model_Word_010 = this.f48122k;
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
                        if (i13 >= size) {
                            List list2 = this.f48123l;
                            if (list2 != null) {
                                arrayList.add(list2.get(iM));
                                break;
                            } else {
                                kotlin.jvm.internal.m.n("options");
                                throw null;
                            }
                        }
                        Object obj = arrayList.get(i13);
                        i13++;
                        wordId = ((Word) obj).getWordId();
                        list = this.f48123l;
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
        int i14 = this.m;
        for (int i15 = 0; i15 < i14; i15++) {
            int iA = w4.c.a(i15, "rl_answer_");
            Object obj2 = arrayList.get(i15);
            kotlin.jvm.internal.m.e(obj2, "get(...)");
            Word word2 = (Word) obj2;
            View viewFindViewById = o().findViewById(iA);
            kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById;
            cardView.setVisibility(0);
            cardView.setTag(word2);
            View viewFindViewById2 = cardView.findViewById(R.id.img_view);
            kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
            LottieAnimationView lottieAnimationView = (LottieAnimationView) viewFindViewById2;
            Context context = this.f47883c;
            int i16 = 4;
            if (!kotlin.jvm.internal.m.a(context.getString(R.string.device_oritation), "land")) {
                cardView.postDelayed(new b2.c(4, cardView, new pv.c(7, cardView, this)), 0L);
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
                th.j.a(new ay.x(new jh.i(strM, i16)).k(ky.e.f38937b).g(px.b.a()).h(new o20.i(lottieAnimationView, 17), vx.b.f54316e), this.f47887g);
            } else {
                com.bumptech.glide.p pVarE = com.bumptech.glide.c.e(context);
                pVarE.getClass();
                new com.bumptech.glide.n(pVarE.f7693a, pVarE, Drawable.class, pVarE.f7694b).z(file).x(lottieAnimationView);
            }
            bq.z.b(cardView, new bt.n1(this, zD, lottieAnimationView, 11));
        }
        ef.e.B(o());
    }

    public final void u() {
        Model_Word_010 model_Word_010 = this.f48122k;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Word word = model_Word_010.getWord();
        kotlin.jvm.internal.m.e(word, "getWord(...)");
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        TextView textView = ((hj.b3) aVar).f32382c.f32636e;
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        TextView textView2 = ((hj.b3) aVar2).f32382c.f32635d;
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        TextView textView3 = ((hj.b3) aVar3).f32382c.f32634c;
        boolean z11 = ((jp.p0) this.f47881a).Q;
        zq.c.e(word, textView, textView2, textView3, true);
        Model_Word_010 model_Word_011 = this.f48122k;
        if (model_Word_011 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Word word2 = model_Word_011.getWord();
        kotlin.jvm.internal.m.e(word2, "getWord(...)");
        q(zq.c.c(word2));
    }
}
