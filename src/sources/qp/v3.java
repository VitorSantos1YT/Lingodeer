package qp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.airbnb.lottie.LottieAnimationView;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Model_Word_010;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v3 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Model_Word_010 f48229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f48230l;
    public final qy.q m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f48231n;

    public v3(mp.b bVar, long j11) {
        super(bVar, j11, 1);
        this.m = com.bumptech.glide.d.v(new lt.e(this, 24));
        this.f48231n = nv.p.m(j11, "0;", ";1");
    }

    @Override // qp.a, hi.a
    public final boolean a() {
        Word word;
        int color;
        int color2;
        int color3;
        View view = (View) this.f47818j;
        if (view == null || (word = (Word) view.getTag()) == null) {
            return false;
        }
        long wordId = word.getWordId();
        Model_Word_010 model_Word_010 = this.f48229k;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        boolean z11 = wordId == model_Word_010.getWord().getWordId();
        TextView textView = (TextView) view.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
        Context context = this.f47883c;
        if (z11) {
            kotlin.jvm.internal.m.f(context, "context");
            color = context.getColor(R.color.color_43CC93);
        } else {
            kotlin.jvm.internal.m.f(context, "context");
            color = context.getColor(R.color.color_FF6666);
        }
        textView.setTextColor(color);
        if (z11) {
            kotlin.jvm.internal.m.f(context, "context");
            color2 = context.getColor(R.color.color_43CC93);
        } else {
            kotlin.jvm.internal.m.f(context, "context");
            color2 = context.getColor(R.color.color_FF6666);
        }
        textView2.setTextColor(color2);
        if (z11) {
            kotlin.jvm.internal.m.f(context, "context");
            color3 = context.getColor(R.color.color_43CC93);
        } else {
            kotlin.jvm.internal.m.f(context, "context");
            color3 = context.getColor(R.color.color_FF6666);
        }
        textView3.setTextColor(color3);
        return z11;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Word_010 model_Word_010 = this.f48229k;
        if (model_Word_010 != null) {
            return fv.b.Y(model_Word_010.getWordId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // qp.a, hi.a
    public final String c() {
        return this.f48231n;
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        Model_Word_010 model_Word_010 = this.f48229k;
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
        this.f48229k = model_Word_010LoadFullObject;
        List<Word> optionList = model_Word_010LoadFullObject.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        this.f48230l = optionList;
        Model_Word_010 model_Word_010 = this.f48229k;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> optionList2 = model_Word_010.getOptionList();
        if ((optionList2 != null ? optionList2.size() : 0) == 0) {
            throw new NoSuchElemException();
        }
    }

    @Override // hi.a
    public final void k() {
        w();
        int length = u().length;
        for (int i11 = 0; i11 < length; i11++) {
            CardView cardView = u()[i11];
            kotlin.jvm.internal.m.e(cardView, "get(...)");
            TextView textView = (TextView) cardView.findViewById(R.id.tv_word);
            Object tag = cardView.getTag();
            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            Word word = (Word) tag;
            kotlin.jvm.internal.m.c(textView);
            textView.setText(zq.c.a(word, this.f47883c));
            int[] iArr = bq.r.f4959a;
            bq.m.J(textView);
            TextView textView2 = (TextView) cardView.findViewById(R.id.tv_top);
            TextView textView3 = (TextView) cardView.findViewById(R.id.tv_middle);
            TextView textView4 = (TextView) cardView.findViewById(R.id.tv_bottom);
            kotlin.jvm.internal.m.c(textView2);
            kotlin.jvm.internal.m.c(textView3);
            kotlin.jvm.internal.m.c(textView4);
            v(word, textView2, textView3, textView4);
        }
    }

    @Override // qp.d
    public final fz.f n() {
        return u3.f48215a;
    }

    @Override // qp.d
    public final void p() {
        ((jp.p0) this.f47881a).O(0);
        w();
        List list = this.f48230l;
        if (list == null) {
            kotlin.jvm.internal.m.n("options");
            throw null;
        }
        List listS = ns.o.S(list);
        int length = u().length;
        for (int i11 = 0; i11 < length; i11++) {
            Word word = (Word) ((ArrayList) listS).get(i11);
            CardView cardView = u()[i11];
            kotlin.jvm.internal.m.e(cardView, "get(...)");
            cardView.setTag(word);
            View viewFindViewById = cardView.findViewById(R.id.img_view);
            kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
            LottieAnimationView lottieAnimationView = (LottieAnimationView) viewFindViewById;
            Context context = this.f47883c;
            if (!kotlin.jvm.internal.m.a(context.getString(R.string.device_oritation), "land")) {
                cardView.postDelayed(new b2.c(4, cardView, new pv.c(i11, this, cardView)), 0L);
            }
            qy.q qVar = fv.b.f28186a;
            long wordId = word.getWordId();
            String mainPic = word.getMainPic();
            kotlin.jvm.internal.m.e(mainPic, "getMainPic(...)");
            File file = new File(fv.b.f0(wordId, mainPic));
            String strM = defpackage.e.m(xt.b.a().k(), fv.g.y(word.getWordId()));
            boolean zD = com.google.android.material.datepicker.d.D(strM);
            if (zD && this.f47884d.showAnim) {
                int[] iArr = bq.r.f4959a;
                th.j.a(new ay.x(new jh.i(strM, 3)).k(ky.e.f38937b).g(px.b.a()).h(new n9.q(lottieAnimationView, 19), vx.b.f54316e), this.f47887g);
            } else {
                com.bumptech.glide.p pVarE = com.bumptech.glide.c.e(context);
                pVarE.getClass();
                new com.bumptech.glide.n(pVarE.f7693a, pVarE, Drawable.class, pVarE.f7694b).z(file).x(lottieAnimationView);
            }
            TextView textView = (TextView) cardView.findViewById(R.id.tv_word);
            kotlin.jvm.internal.m.c(textView);
            textView.setText(zq.c.a(word, context));
            int[] iArr2 = bq.r.f4959a;
            bq.m.J(textView);
            bq.z.b(cardView, new d1.g(this, word, zD, lottieAnimationView));
        }
        ef.e.B(o());
    }

    public final CardView[] u() {
        return (CardView[]) this.m.getValue();
    }

    public final void v(Word word, TextView textView, TextView textView2, TextView textView3) {
        boolean z11 = ((jp.p0) this.f47881a).Q;
        zq.c.e(word, textView, textView2, textView3, false);
        int[] iArr = bq.r.f4959a;
        if (!bq.m.F() && !TextUtils.isEmpty(word.getPos())) {
            textView3.setVisibility(0);
            textView3.setText(word.getPos());
        }
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
            textView.setMaxLines(1);
            textView2.setMaxLines(1);
            textView3.setMaxLines(1);
        }
    }

    public final void w() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.u2) aVar).f33384c.f32636e.setVisibility(8);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.u2) aVar2).f33384c.f32634c.setVisibility(8);
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        TextView textView = ((hj.u2) aVar3).f33384c.f32635d;
        String strY = ff.h.y(this.f47883c, R.string.select_);
        Model_Word_010 model_Word_010 = this.f48229k;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        textView.setText(strY + " \"" + model_Word_010.getWord().getTranslations() + "\"");
        Model_Word_010 model_Word_011 = this.f48229k;
        if (model_Word_011 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Word word = model_Word_011.getWord();
        kotlin.jvm.internal.m.e(word, "getWord(...)");
        q(zq.c.c(word));
    }
}
