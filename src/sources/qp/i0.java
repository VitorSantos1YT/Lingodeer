package qp;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.media3.ui.PlayerView;
import com.airbnb.lottie.LottieAnimationView;
import com.lingo.lingoskill.object.Model_Word_010;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import mt.f5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f47966k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Model_Word_010 f47967l;
    public List m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f47968n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f47969o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f47970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f47971q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(mp.b bVar, long j11, int i11) {
        super(bVar, j11, 1);
        this.f47966k = i11;
        switch (i11) {
            case 1:
                super(bVar, j11, 1);
                this.f47968n = 4;
                this.f47969o = 24;
                int[] iArr = bq.r.f4959a;
                this.f47970p = bq.m.b();
                this.f47971q = nv.p.m(j11, "0;", ";3");
                break;
            case 2:
                super(bVar, j11, 1);
                this.f47968n = 4;
                this.f47969o = 24;
                this.f47971q = nv.p.m(j11, "0;", ";3");
                break;
            default:
                this.f47968n = 4;
                this.f47969o = 24;
                int[] iArr2 = bq.r.f4959a;
                this.f47970p = bq.m.b();
                this.f47971q = nv.p.m(j11, "0;", ";3");
                break;
        }
    }

    @Override // qp.a, hi.a
    public final boolean a() {
        int color;
        int color2;
        Word word;
        int color3;
        int i11 = this.f47966k;
        Env env = this.f47884d;
        Context context = this.f47883c;
        switch (i11) {
            case 0:
                List list = (List) this.f47970p;
                View view = (View) this.f47818j;
                if (view == null || view.getTag() == null) {
                    return false;
                }
                View view2 = (View) this.f47818j;
                kotlin.jvm.internal.m.c(view2);
                Object tag = view2.getTag();
                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                long wordId = ((Word) tag).getWordId();
                Model_Word_010 model_Word_010 = this.f47967l;
                if (model_Word_010 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                Word word2 = model_Word_010.getWord();
                kotlin.jvm.internal.m.e(word2, "getWord(...)");
                boolean z11 = wordId == word2.getWordId();
                View view3 = (View) this.f47818j;
                kotlin.jvm.internal.m.c(view3);
                TextView textView = (TextView) view3.findViewById(R.id.tv_top);
                View view4 = (View) this.f47818j;
                kotlin.jvm.internal.m.c(view4);
                TextView textView2 = (TextView) view4.findViewById(R.id.tv_middle);
                View view5 = (View) this.f47818j;
                kotlin.jvm.internal.m.c(view5);
                TextView textView3 = (TextView) view5.findViewById(R.id.tv_bottom);
                if (z11) {
                    kotlin.jvm.internal.m.f(context, "context");
                    color = context.getColor(R.color.color_43CC93);
                } else {
                    kotlin.jvm.internal.m.f(context, "context");
                    color = context.getColor(R.color.color_FF6666);
                }
                textView.setTextColor(color);
                textView2.setTextColor(color);
                textView3.setTextColor(color);
                if (z11) {
                    ta.a aVar = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar);
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ((hj.q1) aVar).f33135c.f33677e;
                    Collection collection = (Collection) list.get(1);
                    jz.d dVar = jz.e.f37397a;
                    lottieAnimationView.setAnimation(((Number) ry.m.I0(collection)).intValue());
                } else {
                    ta.a aVar2 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ((hj.q1) aVar2).f33135c.f33677e;
                    Collection collection2 = (Collection) list.get(2);
                    jz.d dVar2 = jz.e.f37397a;
                    lottieAnimationView2.setAnimation(((Number) ry.m.I0(collection2)).intValue());
                }
                if (env.showAnim) {
                    ta.a aVar3 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar3);
                    ((LottieAnimationView) ((hj.q1) aVar3).f33135c.f33677e).d(new f(this, 4));
                    return z11;
                }
                ta.a aVar4 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                ((LottieAnimationView) ((hj.q1) aVar4).f33135c.f33676d).e();
                return z11;
            case 1:
                List list2 = (List) this.f47970p;
                View view6 = (View) this.f47818j;
                if (view6 == null || view6.getTag() == null) {
                    return false;
                }
                View view7 = (View) this.f47818j;
                kotlin.jvm.internal.m.c(view7);
                Object tag2 = view7.getTag();
                kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                long wordId2 = ((Word) tag2).getWordId();
                Model_Word_010 model_Word_011 = this.f47967l;
                if (model_Word_011 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                Word word3 = model_Word_011.getWord();
                kotlin.jvm.internal.m.e(word3, "getWord(...)");
                boolean z12 = wordId2 == word3.getWordId();
                View view8 = (View) this.f47818j;
                kotlin.jvm.internal.m.c(view8);
                TextView textView4 = (TextView) view8.findViewById(R.id.tv_top);
                View view9 = (View) this.f47818j;
                kotlin.jvm.internal.m.c(view9);
                TextView textView5 = (TextView) view9.findViewById(R.id.tv_middle);
                View view10 = (View) this.f47818j;
                kotlin.jvm.internal.m.c(view10);
                TextView textView6 = (TextView) view10.findViewById(R.id.tv_bottom);
                if (z12) {
                    kotlin.jvm.internal.m.f(context, "context");
                    color2 = context.getColor(R.color.color_43CC93);
                } else {
                    kotlin.jvm.internal.m.f(context, "context");
                    color2 = context.getColor(R.color.color_FF6666);
                }
                textView4.setTextColor(color2);
                textView5.setTextColor(color2);
                textView6.setTextColor(color2);
                if (z12) {
                    ta.a aVar5 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar5);
                    LottieAnimationView lottieAnimationView3 = (LottieAnimationView) ((hj.o1) aVar5).f33010b.f32360f;
                    Collection collection3 = (Collection) list2.get(1);
                    jz.d dVar3 = jz.e.f37397a;
                    lottieAnimationView3.setAnimation(((Number) ry.m.I0(collection3)).intValue());
                } else {
                    ta.a aVar6 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar6);
                    LottieAnimationView lottieAnimationView4 = (LottieAnimationView) ((hj.o1) aVar6).f33010b.f32360f;
                    Collection collection4 = (Collection) list2.get(2);
                    jz.d dVar4 = jz.e.f37397a;
                    lottieAnimationView4.setAnimation(((Number) ry.m.I0(collection4)).intValue());
                }
                if (env.showAnim) {
                    ta.a aVar7 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar7);
                    ((LottieAnimationView) ((hj.o1) aVar7).f33010b.f32360f).d(new f(this, 7));
                    return z12;
                }
                ta.a aVar8 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar8);
                ((LottieAnimationView) ((hj.o1) aVar8).f33010b.f32359e).e();
                return z12;
            default:
                View view11 = (View) this.f47818j;
                if (view11 == null || (word = (Word) view11.getTag()) == null) {
                    return false;
                }
                long wordId3 = word.getWordId();
                Model_Word_010 model_Word_012 = this.f47967l;
                if (model_Word_012 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                Word word4 = model_Word_012.getWord();
                kotlin.jvm.internal.m.e(word4, "getWord(...)");
                boolean z13 = wordId3 == word4.getWordId();
                View view12 = (View) this.f47818j;
                kotlin.jvm.internal.m.c(view12);
                TextView textView7 = (TextView) view12.findViewById(R.id.tv_top);
                View view13 = (View) this.f47818j;
                kotlin.jvm.internal.m.c(view13);
                TextView textView8 = (TextView) view13.findViewById(R.id.tv_middle);
                View view14 = (View) this.f47818j;
                kotlin.jvm.internal.m.c(view14);
                TextView textView9 = (TextView) view14.findViewById(R.id.tv_bottom);
                if (z13) {
                    kotlin.jvm.internal.m.f(context, "context");
                    color3 = context.getColor(R.color.color_43CC93);
                } else {
                    kotlin.jvm.internal.m.f(context, "context");
                    color3 = context.getColor(R.color.color_FF6666);
                }
                textView7.setTextColor(color3);
                textView8.setTextColor(color3);
                textView9.setTextColor(color3);
                return z13;
        }
    }

    @Override // hi.a
    public final String b() {
        switch (this.f47966k) {
            case 0:
                qy.q qVar = fv.b.f28186a;
                Model_Word_010 model_Word_010 = this.f47967l;
                if (model_Word_010 != null) {
                    return fv.b.Y(model_Word_010.getWordId(), null, null);
                }
                kotlin.jvm.internal.m.n("mModel");
                throw null;
            case 1:
                qy.q qVar2 = fv.b.f28186a;
                Model_Word_010 model_Word_011 = this.f47967l;
                if (model_Word_011 != null) {
                    return fv.b.Y(model_Word_011.getWordId(), null, null);
                }
                kotlin.jvm.internal.m.n("mModel");
                throw null;
            default:
                qy.q qVar3 = fv.b.f28186a;
                Model_Word_010 model_Word_012 = this.f47967l;
                if (model_Word_012 != null) {
                    return fv.b.Y(model_Word_012.getWordId(), null, null);
                }
                kotlin.jvm.internal.m.n("mModel");
                throw null;
        }
    }

    @Override // qp.a, hi.a
    public final String c() {
        switch (this.f47966k) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f47971q;
    }

    @Override // qp.d, hi.a
    public final void d(ViewGroup viewGroup) {
        switch (this.f47966k) {
            case 0:
                Model_Word_010 model_Word_010 = this.f47967l;
                if (model_Word_010 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                List<Word> optionList = model_Word_010.getOptionList();
                kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
                this.m = optionList;
                this.f47968n = optionList.size();
                if (this.f47884d.keyLanguage == 1) {
                    this.f47968n = fr.j3.M(2) != 0 ? 4 : 2;
                }
                super.d(viewGroup);
                return;
            case 1:
                Model_Word_010 model_Word_011 = this.f47967l;
                if (model_Word_011 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                List<Word> optionList2 = model_Word_011.getOptionList();
                kotlin.jvm.internal.m.e(optionList2, "getOptionList(...)");
                this.m = optionList2;
                this.f47968n = optionList2.size();
                if (this.f47884d.keyLanguage == 1) {
                    this.f47968n = fr.j3.M(2) != 0 ? 4 : 2;
                }
                super.d(viewGroup);
                return;
            default:
                Model_Word_010 model_Word_012 = this.f47967l;
                if (model_Word_012 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                List<Word> optionList3 = model_Word_012.getOptionList();
                kotlin.jvm.internal.m.e(optionList3, "getOptionList(...)");
                this.m = optionList3;
                this.f47968n = optionList3.size();
                if (this.f47884d.keyLanguage == 1) {
                    this.f47968n = fr.j3.M(2) != 0 ? 4 : 2;
                }
                super.d(viewGroup);
                return;
        }
    }

    @Override // qp.a, qp.d, hi.a
    public void f() {
        switch (this.f47966k) {
            case 2:
                super.f();
                ta.a aVar = this.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                y6.j0 player = ((PlayerView) ((hj.x2) aVar).f33567b.f33677e).getPlayer();
                if (player != null) {
                    player.release();
                }
                break;
            default:
                super.f();
                break;
        }
    }

    @Override // hi.a
    public final List g() {
        switch (this.f47966k) {
            case 0:
                ArrayList arrayList = new ArrayList();
                Model_Word_010 model_Word_010 = this.f47967l;
                if (model_Word_010 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                for (Word word : model_Word_010.getOptionList()) {
                    qy.q qVar = fv.b.f28186a;
                    arrayList.add(new fv.a(2L, fv.b.Z(word.getWordId()), fv.b.V(word.getWordId())));
                }
                return arrayList;
            case 1:
                ArrayList arrayList2 = new ArrayList();
                Model_Word_010 model_Word_011 = this.f47967l;
                if (model_Word_011 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                for (Word word2 : model_Word_011.getOptionList()) {
                    qy.q qVar2 = fv.b.f28186a;
                    arrayList2.add(new fv.a(2L, fv.b.Z(word2.getWordId()), fv.b.V(word2.getWordId())));
                }
                return arrayList2;
            default:
                ArrayList arrayList3 = new ArrayList();
                Model_Word_010 model_Word_012 = this.f47967l;
                if (model_Word_012 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                for (Word word3 : model_Word_012.getOptionList()) {
                    qy.q qVar3 = fv.b.f28186a;
                    arrayList3.add(new fv.a(2L, fv.b.Z(word3.getWordId()), fv.b.V(word3.getWordId())));
                }
                qy.q qVar4 = fv.b.f28186a;
                Model_Word_010 model_Word_013 = this.f47967l;
                if (model_Word_013 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                String strI0 = fv.b.i0(model_Word_013.getWordId());
                Model_Word_010 model_Word_014 = this.f47967l;
                if (model_Word_014 != null) {
                    arrayList3.add(new fv.a(8L, strI0, fv.g.B(model_Word_014.getWordId())));
                    return arrayList3;
                }
                kotlin.jvm.internal.m.n("mModel");
                throw null;
        }
    }

    @Override // hi.a
    public final int i() {
        switch (this.f47966k) {
        }
        return 0;
    }

    @Override // hi.a
    public final void j() throws NoSuchElemException {
        switch (this.f47966k) {
            case 0:
                Model_Word_010 model_Word_010LoadFullObject = Model_Word_010.loadFullObject(this.f47882b);
                if (model_Word_010LoadFullObject == null) {
                    throw new NoSuchElemException();
                }
                this.f47967l = model_Word_010LoadFullObject;
                if (model_Word_010LoadFullObject.getOptionList().size() == 0) {
                    throw new NoSuchElemException();
                }
                return;
            case 1:
                Model_Word_010 model_Word_010LoadFullObject2 = Model_Word_010.loadFullObject(this.f47882b);
                if (model_Word_010LoadFullObject2 == null) {
                    throw new NoSuchElemException();
                }
                this.f47967l = model_Word_010LoadFullObject2;
                if (model_Word_010LoadFullObject2.getOptionList().size() == 0) {
                    throw new NoSuchElemException();
                }
                return;
            default:
                Model_Word_010 model_Word_010LoadFullObject3 = Model_Word_010.loadFullObject(this.f47882b);
                if (model_Word_010LoadFullObject3 == null) {
                    throw new NoSuchElemException();
                }
                this.f47967l = model_Word_010LoadFullObject3;
                if (model_Word_010LoadFullObject3.getOptionList().size() == 0) {
                    throw new NoSuchElemException();
                }
                return;
        }
    }

    @Override // hi.a
    public final void k() {
        switch (this.f47966k) {
            case 0:
                Model_Word_010 model_Word_010 = this.f47967l;
                if (model_Word_010 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                Word word = model_Word_010.getWord();
                kotlin.jvm.internal.m.e(word, "getWord(...)");
                q(zq.c.c(word));
                int i11 = this.f47968n;
                for (int i12 = 0; i12 < i11; i12++) {
                    View viewFindViewById = o().findViewById(w4.c.a(i12, "rl_answer_"));
                    kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                    CardView cardView = (CardView) viewFindViewById;
                    Object tag = cardView.getTag();
                    kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                    u(cardView, (Word) tag);
                }
                return;
            case 1:
                x();
                int i13 = this.f47968n;
                for (int i14 = 0; i14 < i13; i14++) {
                    View viewFindViewById2 = o().findViewById(w4.c.a(i14, "rl_answer_"));
                    kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
                    CardView cardView2 = (CardView) viewFindViewById2;
                    Object tag2 = cardView2.getTag();
                    kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                    v(cardView2, (Word) tag2);
                }
                return;
            default:
                Model_Word_010 model_Word_011 = this.f47967l;
                if (model_Word_011 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                Word word2 = model_Word_011.getWord();
                kotlin.jvm.internal.m.e(word2, "getWord(...)");
                q(zq.c.c(word2));
                int i15 = this.f47968n;
                for (int i16 = 0; i16 < i15; i16++) {
                    View viewFindViewById3 = o().findViewById(w4.c.a(i16, "rl_answer_"));
                    kotlin.jvm.internal.m.e(viewFindViewById3, "findViewById(...)");
                    CardView cardView3 = (CardView) viewFindViewById3;
                    Object tag3 = cardView3.getTag();
                    kotlin.jvm.internal.m.d(tag3, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                    w(cardView3, (Word) tag3);
                }
                return;
        }
    }

    @Override // qp.d
    public final fz.f n() {
        switch (this.f47966k) {
            case 0:
                return h0.f47946a;
            case 1:
                return t0.f48198a;
            default:
                return c4.f47873a;
        }
    }

    @Override // qp.d
    public final void p() {
        long wordId;
        List list;
        long wordId2;
        List list2;
        long wordId3;
        List list3;
        int i11 = this.f47966k;
        Env env = this.f47884d;
        final int i12 = 3;
        mp.b bVar = this.f47881a;
        final int i13 = 2;
        final int i14 = 0;
        final int i15 = 1;
        switch (i11) {
            case 0:
                ((jp.p0) bVar).O(0);
                ta.a aVar = this.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                bq.z.b(((hj.q1) aVar).f33135c.f33674b, new fz.c(this) { // from class: qp.g0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ i0 f47938b;

                    {
                        this.f47938b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        View it = (View) obj;
                        switch (i12) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                i0 i0Var = this.f47938b;
                                mp.b bVar2 = i0Var.f47881a;
                                String strB = i0Var.b();
                                ta.a aVar2 = i0Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar2);
                                ImageView ivAudio = ((hj.q1) aVar2).f33135c.f33674b;
                                kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                                ((jp.p0) bVar2).H(ivAudio, strB);
                                break;
                            case 1:
                                kotlin.jvm.internal.m.f(it, "it");
                                i0 i0Var2 = this.f47938b;
                                mp.b bVar3 = i0Var2.f47881a;
                                String strB2 = i0Var2.b();
                                ta.a aVar3 = i0Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar3);
                                ImageView imageView = ((hj.q1) aVar3).f33135c.f33674b;
                                kotlin.jvm.internal.m.c(imageView);
                                ((jp.p0) bVar3).H(imageView, strB2);
                                break;
                            case 2:
                                kotlin.jvm.internal.m.f(it, "it");
                                i0 i0Var3 = this.f47938b;
                                mp.b bVar4 = i0Var3.f47881a;
                                String strB3 = i0Var3.b();
                                ta.a aVar4 = i0Var3.f47886f;
                                kotlin.jvm.internal.m.c(aVar4);
                                ImageView imageView2 = ((hj.q1) aVar4).f33135c.f33674b;
                                kotlin.jvm.internal.m.c(imageView2);
                                ((jp.p0) bVar4).H(imageView2, strB3);
                                break;
                            case 3:
                                kotlin.jvm.internal.m.f(it, "it");
                                i0 i0Var4 = this.f47938b;
                                mp.b bVar5 = i0Var4.f47881a;
                                String strB4 = i0Var4.b();
                                ta.a aVar5 = i0Var4.f47886f;
                                kotlin.jvm.internal.m.c(aVar5);
                                ((jp.p0) bVar5).H(((hj.q1) aVar5).f33135c.f33674b, strB4);
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "v");
                                i0 i0Var5 = this.f47938b;
                                View view = (View) i0Var5.f47818j;
                                if (view != null) {
                                    i0Var5.r(view);
                                }
                                i0Var5.f47818j = it;
                                i0Var5.s(it);
                                ((jp.p0) i0Var5.f47881a).O(4);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
                ta.a aVar2 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                ((hj.q1) aVar2).f33135c.f33674b.performClick();
                Model_Word_010 model_Word_010 = this.f47967l;
                if (model_Word_010 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                Word word = model_Word_010.getWord();
                kotlin.jvm.internal.m.e(word, "getWord(...)");
                q(zq.c.c(word));
                ArrayList arrayList = new ArrayList();
                int i16 = this.f47968n;
                for (int i17 = 0; i17 < i16; i17++) {
                    if (i17 == 0) {
                        Model_Word_010 model_Word_011 = this.f47967l;
                        if (model_Word_011 == null) {
                            kotlin.jvm.internal.m.n("mModel");
                            throw null;
                        }
                        Word word2 = model_Word_011.getWord();
                        kotlin.jvm.internal.m.e(word2, "getWord(...)");
                        arrayList.add(word2);
                    } else {
                        int iM = fr.j3.M(this.f47968n);
                        while (true) {
                            int size = arrayList.size();
                            int i18 = 0;
                            do {
                                if (i18 >= size) {
                                    List list4 = this.m;
                                    if (list4 == null) {
                                        kotlin.jvm.internal.m.n("options");
                                        throw null;
                                    }
                                    arrayList.add(list4.get(iM));
                                }
                                Object obj = arrayList.get(i18);
                                i18++;
                                wordId = ((Word) obj).getWordId();
                                list = this.m;
                                if (list == null) {
                                    kotlin.jvm.internal.m.n("options");
                                    throw null;
                                }
                                break;
                            } while (wordId != ((Word) list.get(iM)).getWordId());
                            iM = fr.j3.M(this.f47968n);
                        }
                    }
                }
                Collections.shuffle(arrayList);
                int size2 = arrayList.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    int iA = w4.c.a(i19, "rl_answer_");
                    Object obj2 = arrayList.get(i19);
                    kotlin.jvm.internal.m.e(obj2, "get(...)");
                    Word word3 = (Word) obj2;
                    View viewFindViewById = o().findViewById(iA);
                    kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                    CardView cardView = (CardView) viewFindViewById;
                    cardView.setVisibility(0);
                    cardView.setTag(word3);
                    final int i21 = 4;
                    bq.z.b(cardView, new fz.c(this) { // from class: qp.g0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ i0 f47938b;

                        {
                            this.f47938b = this;
                        }

                        @Override // fz.c
                        public final Object invoke(Object obj3) {
                            View it = (View) obj3;
                            switch (i21) {
                                case 0:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    i0 i0Var = this.f47938b;
                                    mp.b bVar2 = i0Var.f47881a;
                                    String strB = i0Var.b();
                                    ta.a aVar3 = i0Var.f47886f;
                                    kotlin.jvm.internal.m.c(aVar3);
                                    ImageView ivAudio = ((hj.q1) aVar3).f33135c.f33674b;
                                    kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                                    ((jp.p0) bVar2).H(ivAudio, strB);
                                    break;
                                case 1:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    i0 i0Var2 = this.f47938b;
                                    mp.b bVar3 = i0Var2.f47881a;
                                    String strB2 = i0Var2.b();
                                    ta.a aVar4 = i0Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar4);
                                    ImageView imageView = ((hj.q1) aVar4).f33135c.f33674b;
                                    kotlin.jvm.internal.m.c(imageView);
                                    ((jp.p0) bVar3).H(imageView, strB2);
                                    break;
                                case 2:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    i0 i0Var3 = this.f47938b;
                                    mp.b bVar4 = i0Var3.f47881a;
                                    String strB3 = i0Var3.b();
                                    ta.a aVar5 = i0Var3.f47886f;
                                    kotlin.jvm.internal.m.c(aVar5);
                                    ImageView imageView2 = ((hj.q1) aVar5).f33135c.f33674b;
                                    kotlin.jvm.internal.m.c(imageView2);
                                    ((jp.p0) bVar4).H(imageView2, strB3);
                                    break;
                                case 3:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    i0 i0Var4 = this.f47938b;
                                    mp.b bVar5 = i0Var4.f47881a;
                                    String strB4 = i0Var4.b();
                                    ta.a aVar6 = i0Var4.f47886f;
                                    kotlin.jvm.internal.m.c(aVar6);
                                    ((jp.p0) bVar5).H(((hj.q1) aVar6).f33135c.f33674b, strB4);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.f(it, "v");
                                    i0 i0Var5 = this.f47938b;
                                    View view = (View) i0Var5.f47818j;
                                    if (view != null) {
                                        i0Var5.r(view);
                                    }
                                    i0Var5.f47818j = it;
                                    i0Var5.s(it);
                                    ((jp.p0) i0Var5.f47881a).O(4);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    });
                    u(cardView, word3);
                }
                ef.e.B(o());
                bq.z.b(o(), new fz.c(this) { // from class: qp.g0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ i0 f47938b;

                    {
                        this.f47938b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj3) {
                        View it = (View) obj3;
                        switch (i14) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                i0 i0Var = this.f47938b;
                                mp.b bVar2 = i0Var.f47881a;
                                String strB = i0Var.b();
                                ta.a aVar3 = i0Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar3);
                                ImageView ivAudio = ((hj.q1) aVar3).f33135c.f33674b;
                                kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                                ((jp.p0) bVar2).H(ivAudio, strB);
                                break;
                            case 1:
                                kotlin.jvm.internal.m.f(it, "it");
                                i0 i0Var2 = this.f47938b;
                                mp.b bVar3 = i0Var2.f47881a;
                                String strB2 = i0Var2.b();
                                ta.a aVar4 = i0Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar4);
                                ImageView imageView = ((hj.q1) aVar4).f33135c.f33674b;
                                kotlin.jvm.internal.m.c(imageView);
                                ((jp.p0) bVar3).H(imageView, strB2);
                                break;
                            case 2:
                                kotlin.jvm.internal.m.f(it, "it");
                                i0 i0Var3 = this.f47938b;
                                mp.b bVar4 = i0Var3.f47881a;
                                String strB3 = i0Var3.b();
                                ta.a aVar5 = i0Var3.f47886f;
                                kotlin.jvm.internal.m.c(aVar5);
                                ImageView imageView2 = ((hj.q1) aVar5).f33135c.f33674b;
                                kotlin.jvm.internal.m.c(imageView2);
                                ((jp.p0) bVar4).H(imageView2, strB3);
                                break;
                            case 3:
                                kotlin.jvm.internal.m.f(it, "it");
                                i0 i0Var4 = this.f47938b;
                                mp.b bVar5 = i0Var4.f47881a;
                                String strB4 = i0Var4.b();
                                ta.a aVar6 = i0Var4.f47886f;
                                kotlin.jvm.internal.m.c(aVar6);
                                ((jp.p0) bVar5).H(((hj.q1) aVar6).f33135c.f33674b, strB4);
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "v");
                                i0 i0Var5 = this.f47938b;
                                View view = (View) i0Var5.f47818j;
                                if (view != null) {
                                    i0Var5.r(view);
                                }
                                i0Var5.f47818j = it;
                                i0Var5.s(it);
                                ((jp.p0) i0Var5.f47881a).O(4);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
                ta.a aVar3 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ((hj.q1) aVar3).f33135c.f33676d;
                Collection collection = (Collection) ((List) this.f47970p).get(0);
                jz.d dVar = jz.e.f37397a;
                lottieAnimationView.setAnimation(((Number) ry.m.I0(collection)).intValue());
                ta.a aVar4 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                ((LottieAnimationView) ((hj.q1) aVar4).f33135c.f33676d).setRepeatCount(-1);
                if (env.showAnim) {
                    ta.a aVar5 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar5);
                    ((LottieAnimationView) ((hj.q1) aVar5).f33135c.f33676d).h();
                } else {
                    ta.a aVar6 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar6);
                    ((LottieAnimationView) ((hj.q1) aVar6).f33135c.f33676d).e();
                }
                ta.a aVar7 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar7);
                LinearLayout rootParent = ((hj.q1) aVar7).f33136d;
                kotlin.jvm.internal.m.e(rootParent, "rootParent");
                final int i22 = 1;
                bq.z.b(rootParent, new fz.c(this) { // from class: qp.g0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ i0 f47938b;

                    {
                        this.f47938b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj3) {
                        View it = (View) obj3;
                        switch (i22) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                i0 i0Var = this.f47938b;
                                mp.b bVar2 = i0Var.f47881a;
                                String strB = i0Var.b();
                                ta.a aVar8 = i0Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar8);
                                ImageView ivAudio = ((hj.q1) aVar8).f33135c.f33674b;
                                kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                                ((jp.p0) bVar2).H(ivAudio, strB);
                                break;
                            case 1:
                                kotlin.jvm.internal.m.f(it, "it");
                                i0 i0Var2 = this.f47938b;
                                mp.b bVar3 = i0Var2.f47881a;
                                String strB2 = i0Var2.b();
                                ta.a aVar9 = i0Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar9);
                                ImageView imageView = ((hj.q1) aVar9).f33135c.f33674b;
                                kotlin.jvm.internal.m.c(imageView);
                                ((jp.p0) bVar3).H(imageView, strB2);
                                break;
                            case 2:
                                kotlin.jvm.internal.m.f(it, "it");
                                i0 i0Var3 = this.f47938b;
                                mp.b bVar4 = i0Var3.f47881a;
                                String strB3 = i0Var3.b();
                                ta.a aVar10 = i0Var3.f47886f;
                                kotlin.jvm.internal.m.c(aVar10);
                                ImageView imageView2 = ((hj.q1) aVar10).f33135c.f33674b;
                                kotlin.jvm.internal.m.c(imageView2);
                                ((jp.p0) bVar4).H(imageView2, strB3);
                                break;
                            case 3:
                                kotlin.jvm.internal.m.f(it, "it");
                                i0 i0Var4 = this.f47938b;
                                mp.b bVar5 = i0Var4.f47881a;
                                String strB4 = i0Var4.b();
                                ta.a aVar11 = i0Var4.f47886f;
                                kotlin.jvm.internal.m.c(aVar11);
                                ((jp.p0) bVar5).H(((hj.q1) aVar11).f33135c.f33674b, strB4);
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "v");
                                i0 i0Var5 = this.f47938b;
                                View view = (View) i0Var5.f47818j;
                                if (view != null) {
                                    i0Var5.r(view);
                                }
                                i0Var5.f47818j = it;
                                i0Var5.s(it);
                                ((jp.p0) i0Var5.f47881a).O(4);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
                ta.a aVar8 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar8);
                final int i23 = 2;
                bq.z.b(((hj.q1) aVar8).f33134b, new fz.c(this) { // from class: qp.g0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ i0 f47938b;

                    {
                        this.f47938b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj3) {
                        View it = (View) obj3;
                        switch (i23) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                i0 i0Var = this.f47938b;
                                mp.b bVar2 = i0Var.f47881a;
                                String strB = i0Var.b();
                                ta.a aVar9 = i0Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar9);
                                ImageView ivAudio = ((hj.q1) aVar9).f33135c.f33674b;
                                kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                                ((jp.p0) bVar2).H(ivAudio, strB);
                                break;
                            case 1:
                                kotlin.jvm.internal.m.f(it, "it");
                                i0 i0Var2 = this.f47938b;
                                mp.b bVar3 = i0Var2.f47881a;
                                String strB2 = i0Var2.b();
                                ta.a aVar10 = i0Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar10);
                                ImageView imageView = ((hj.q1) aVar10).f33135c.f33674b;
                                kotlin.jvm.internal.m.c(imageView);
                                ((jp.p0) bVar3).H(imageView, strB2);
                                break;
                            case 2:
                                kotlin.jvm.internal.m.f(it, "it");
                                i0 i0Var3 = this.f47938b;
                                mp.b bVar4 = i0Var3.f47881a;
                                String strB3 = i0Var3.b();
                                ta.a aVar11 = i0Var3.f47886f;
                                kotlin.jvm.internal.m.c(aVar11);
                                ImageView imageView2 = ((hj.q1) aVar11).f33135c.f33674b;
                                kotlin.jvm.internal.m.c(imageView2);
                                ((jp.p0) bVar4).H(imageView2, strB3);
                                break;
                            case 3:
                                kotlin.jvm.internal.m.f(it, "it");
                                i0 i0Var4 = this.f47938b;
                                mp.b bVar5 = i0Var4.f47881a;
                                String strB4 = i0Var4.b();
                                ta.a aVar12 = i0Var4.f47886f;
                                kotlin.jvm.internal.m.c(aVar12);
                                ((jp.p0) bVar5).H(((hj.q1) aVar12).f33135c.f33674b, strB4);
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "v");
                                i0 i0Var5 = this.f47938b;
                                View view = (View) i0Var5.f47818j;
                                if (view != null) {
                                    i0Var5.r(view);
                                }
                                i0Var5.f47818j = it;
                                i0Var5.s(it);
                                ((jp.p0) i0Var5.f47881a).O(4);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
                return;
            case 1:
                ((jp.p0) bVar).O(0);
                ef.e.B(o());
                x();
                ArrayList arrayList2 = new ArrayList();
                int i24 = this.f47968n;
                for (int i25 = 0; i25 < i24; i25++) {
                    if (i25 == 0) {
                        Model_Word_010 model_Word_012 = this.f47967l;
                        if (model_Word_012 == null) {
                            kotlin.jvm.internal.m.n("mModel");
                            throw null;
                        }
                        Word word4 = model_Word_012.getWord();
                        kotlin.jvm.internal.m.e(word4, "getWord(...)");
                        arrayList2.add(word4);
                    } else {
                        int iM2 = fr.j3.M(this.f47968n);
                        while (true) {
                            int size3 = arrayList2.size();
                            int i26 = 0;
                            do {
                                if (i26 >= size3) {
                                    List list5 = this.m;
                                    if (list5 == null) {
                                        kotlin.jvm.internal.m.n("options");
                                        throw null;
                                    }
                                    arrayList2.add(list5.get(iM2));
                                }
                                Object obj3 = arrayList2.get(i26);
                                i26++;
                                wordId2 = ((Word) obj3).getWordId();
                                list2 = this.m;
                                if (list2 == null) {
                                    kotlin.jvm.internal.m.n("options");
                                    throw null;
                                }
                                break;
                            } while (wordId2 != ((Word) list2.get(iM2)).getWordId());
                            iM2 = fr.j3.M(this.f47968n);
                        }
                    }
                }
                Collections.shuffle(arrayList2);
                int size4 = arrayList2.size();
                for (int i27 = 0; i27 < size4; i27++) {
                    int iA2 = w4.c.a(i27, "rl_answer_");
                    Object obj4 = arrayList2.get(i27);
                    kotlin.jvm.internal.m.e(obj4, "get(...)");
                    Word word5 = (Word) obj4;
                    View viewFindViewById2 = o().findViewById(iA2);
                    kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
                    CardView cardView2 = (CardView) viewFindViewById2;
                    cardView2.setVisibility(0);
                    cardView2.setTag(word5);
                    final int i28 = 2;
                    bq.z.b(cardView2, new fz.c(this) { // from class: qp.s0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ i0 f48170b;

                        {
                            this.f48170b = this;
                        }

                        @Override // fz.c
                        public final Object invoke(Object obj5) {
                            View it = (View) obj5;
                            switch (i28) {
                                case 0:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    i0 i0Var = this.f48170b;
                                    mp.b bVar2 = i0Var.f47881a;
                                    String strB = i0Var.b();
                                    ta.a aVar9 = i0Var.f47886f;
                                    kotlin.jvm.internal.m.c(aVar9);
                                    ImageView ivAudio = (ImageView) ((hj.o1) aVar9).f33010b.f32358d;
                                    kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                                    ((jp.p0) bVar2).H(ivAudio, strB);
                                    break;
                                case 1:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    i0 i0Var2 = this.f48170b;
                                    mp.b bVar3 = i0Var2.f47881a;
                                    String strB2 = i0Var2.b();
                                    ta.a aVar10 = i0Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar10);
                                    ImageView ivAudio2 = (ImageView) ((hj.o1) aVar10).f33010b.f32358d;
                                    kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                                    ((jp.p0) bVar3).H(ivAudio2, strB2);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.f(it, "v");
                                    i0 i0Var3 = this.f48170b;
                                    View view = (View) i0Var3.f47818j;
                                    if (view != null) {
                                        i0Var3.r(view);
                                    }
                                    i0Var3.f47818j = it;
                                    i0Var3.s(it);
                                    ((jp.p0) i0Var3.f47881a).O(4);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    });
                    v(cardView2, word5);
                }
                if (env.isAudioModel) {
                    ta.a aVar9 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar9);
                    bq.z.b((ImageView) ((hj.o1) aVar9).f33010b.f32358d, new fz.c(this) { // from class: qp.s0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ i0 f48170b;

                        {
                            this.f48170b = this;
                        }

                        @Override // fz.c
                        public final Object invoke(Object obj5) {
                            View it = (View) obj5;
                            switch (i14) {
                                case 0:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    i0 i0Var = this.f48170b;
                                    mp.b bVar2 = i0Var.f47881a;
                                    String strB = i0Var.b();
                                    ta.a aVar10 = i0Var.f47886f;
                                    kotlin.jvm.internal.m.c(aVar10);
                                    ImageView ivAudio = (ImageView) ((hj.o1) aVar10).f33010b.f32358d;
                                    kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                                    ((jp.p0) bVar2).H(ivAudio, strB);
                                    break;
                                case 1:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    i0 i0Var2 = this.f48170b;
                                    mp.b bVar3 = i0Var2.f47881a;
                                    String strB2 = i0Var2.b();
                                    ta.a aVar11 = i0Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar11);
                                    ImageView ivAudio2 = (ImageView) ((hj.o1) aVar11).f33010b.f32358d;
                                    kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                                    ((jp.p0) bVar3).H(ivAudio2, strB2);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.f(it, "v");
                                    i0 i0Var3 = this.f48170b;
                                    View view = (View) i0Var3.f47818j;
                                    if (view != null) {
                                        i0Var3.r(view);
                                    }
                                    i0Var3.f47818j = it;
                                    i0Var3.s(it);
                                    ((jp.p0) i0Var3.f47881a).O(4);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    });
                    final int i29 = 1;
                    bq.z.b(o(), new fz.c(this) { // from class: qp.s0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ i0 f48170b;

                        {
                            this.f48170b = this;
                        }

                        @Override // fz.c
                        public final Object invoke(Object obj5) {
                            View it = (View) obj5;
                            switch (i29) {
                                case 0:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    i0 i0Var = this.f48170b;
                                    mp.b bVar2 = i0Var.f47881a;
                                    String strB = i0Var.b();
                                    ta.a aVar10 = i0Var.f47886f;
                                    kotlin.jvm.internal.m.c(aVar10);
                                    ImageView ivAudio = (ImageView) ((hj.o1) aVar10).f33010b.f32358d;
                                    kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                                    ((jp.p0) bVar2).H(ivAudio, strB);
                                    break;
                                case 1:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    i0 i0Var2 = this.f48170b;
                                    mp.b bVar3 = i0Var2.f47881a;
                                    String strB2 = i0Var2.b();
                                    ta.a aVar11 = i0Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar11);
                                    ImageView ivAudio2 = (ImageView) ((hj.o1) aVar11).f33010b.f32358d;
                                    kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                                    ((jp.p0) bVar3).H(ivAudio2, strB2);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.f(it, "v");
                                    i0 i0Var3 = this.f48170b;
                                    View view = (View) i0Var3.f47818j;
                                    if (view != null) {
                                        i0Var3.r(view);
                                    }
                                    i0Var3.f47818j = it;
                                    i0Var3.s(it);
                                    ((jp.p0) i0Var3.f47881a).O(4);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    });
                    ta.a aVar10 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar10);
                    ((ImageView) ((hj.o1) aVar10).f33010b.f32358d).performClick();
                } else {
                    ta.a aVar11 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar11);
                    ((ImageView) ((hj.o1) aVar11).f33010b.f32358d).setVisibility(8);
                }
                ta.a aVar12 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar12);
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ((hj.o1) aVar12).f33010b.f32359e;
                Collection collection2 = (Collection) ((List) this.f47970p).get(0);
                jz.d dVar2 = jz.e.f37397a;
                lottieAnimationView2.setAnimation(((Number) ry.m.I0(collection2)).intValue());
                ta.a aVar13 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar13);
                ((LottieAnimationView) ((hj.o1) aVar13).f33010b.f32359e).setRepeatCount(-1);
                if (env.showAnim) {
                    ta.a aVar14 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar14);
                    ((LottieAnimationView) ((hj.o1) aVar14).f33010b.f32359e).h();
                    return;
                } else {
                    ta.a aVar15 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar15);
                    ((LottieAnimationView) ((hj.o1) aVar15).f33010b.f32359e).e();
                    return;
                }
            default:
                ((jp.p0) bVar).O(0);
                Context context = this.f47883c;
                float dimension = context.getResources().getDimension(R.dimen.video_margin_left_right);
                ta.a aVar16 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar16);
                bq.z.a((PlayerView) ((hj.x2) aVar16).f33567b.f33677e, 0L, new f5(this, dimension, i13));
                if (((f7.a0) this.f47970p) == null) {
                    this.f47970p = new f7.n(context).a();
                    ta.a aVar17 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar17);
                    ((PlayerView) ((hj.x2) aVar17).f33567b.f33677e).setPlayer((f7.a0) this.f47970p);
                    f7.a0 a0Var = (f7.a0) this.f47970p;
                    if (a0Var != null) {
                        a0Var.r(true);
                    }
                }
                ob.l lVar = new ob.l(context, b7.f0.B(context));
                String strR = xt.b.a().r();
                qy.q qVar = fv.b.f28186a;
                Model_Word_010 model_Word_013 = this.f47967l;
                if (model_Word_013 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                Uri uri = Uri.parse(strR + fv.g.B(model_Word_013.WordId));
                hh.c cVar = new hh.c(new x7.k(), 16);
                re.v vVar = new re.v(i13);
                y6.x xVarA = y6.x.a(uri);
                xVarA.f57373b.getClass();
                xVarA.f57373b.getClass();
                xVarA.f57373b.getClass();
                p7.v0 v0Var = new p7.v0(xVarA, lVar, cVar, k7.g.f37960a, vVar, 1048576, null);
                f7.a0 a0Var2 = (f7.a0) this.f47970p;
                if (a0Var2 != null) {
                    a0Var2.G0(v0Var);
                }
                f7.a0 a0Var3 = (f7.a0) this.f47970p;
                if (a0Var3 != null) {
                    a0Var3.a();
                }
                f7.a0 a0Var4 = (f7.a0) this.f47970p;
                if (a0Var4 != null) {
                    a0Var4.r(true);
                }
                f7.a0 a0Var5 = (f7.a0) this.f47970p;
                if (a0Var5 != null) {
                    a0Var5.P.a(new o3(this, i15));
                }
                ta.a aVar18 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar18);
                FrameLayout overlayFrameLayout = ((PlayerView) ((hj.x2) aVar18).f33567b.f33677e).getOverlayFrameLayout();
                if (overlayFrameLayout != null) {
                    bq.z.b(overlayFrameLayout, new fz.c(this) { // from class: qp.b4

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ i0 f47858b;

                        {
                            this.f47858b = this;
                        }

                        @Override // fz.c
                        public final Object invoke(Object obj5) {
                            View v11 = (View) obj5;
                            switch (i15) {
                                case 0:
                                    kotlin.jvm.internal.m.f(v11, "v");
                                    i0 i0Var = this.f47858b;
                                    View view = (View) i0Var.f47818j;
                                    if (view != null) {
                                        i0Var.r(view);
                                    }
                                    i0Var.f47818j = v11;
                                    i0Var.s(v11);
                                    ((jp.p0) i0Var.f47881a).O(4);
                                    break;
                                case 1:
                                    kotlin.jvm.internal.m.f(v11, "it");
                                    i0 i0Var2 = this.f47858b;
                                    f7.a0 a0Var6 = (f7.a0) i0Var2.f47970p;
                                    if (a0Var6 == null || !a0Var6.g()) {
                                        f7.a0 a0Var7 = (f7.a0) i0Var2.f47970p;
                                        if (a0Var7 != null) {
                                            a0Var7.c(new y6.e0(1.0f, 1.0f));
                                        }
                                        f7.a0 a0Var8 = (f7.a0) i0Var2.f47970p;
                                        if (a0Var8 != null) {
                                            a0Var8.r(true);
                                        }
                                        ta.a aVar19 = i0Var2.f47886f;
                                        kotlin.jvm.internal.m.c(aVar19);
                                        ((LinearLayout) ((hj.x2) aVar19).f33567b.f33679g).setVisibility(8);
                                        ta.a aVar20 = i0Var2.f47886f;
                                        kotlin.jvm.internal.m.c(aVar20);
                                        ((FrameLayout) ((hj.x2) aVar20).f33567b.f33678f).setVisibility(8);
                                    }
                                    return qy.b0.f48488a;
                                case 2:
                                    kotlin.jvm.internal.m.f(v11, "it");
                                    i0 i0Var3 = this.f47858b;
                                    f7.a0 a0Var9 = (f7.a0) i0Var3.f47970p;
                                    if (a0Var9 != null) {
                                        a0Var9.c(new y6.e0(1.0f, 1.0f));
                                    }
                                    f7.a0 a0Var10 = (f7.a0) i0Var3.f47970p;
                                    if (a0Var10 != null) {
                                        a0Var10.r(true);
                                    }
                                    ta.a aVar21 = i0Var3.f47886f;
                                    kotlin.jvm.internal.m.c(aVar21);
                                    ((LinearLayout) ((hj.x2) aVar21).f33567b.f33679g).setVisibility(8);
                                    ta.a aVar22 = i0Var3.f47886f;
                                    kotlin.jvm.internal.m.c(aVar22);
                                    ((FrameLayout) ((hj.x2) aVar22).f33567b.f33678f).setVisibility(8);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.f(v11, "it");
                                    i0 i0Var4 = this.f47858b;
                                    f7.a0 a0Var11 = (f7.a0) i0Var4.f47970p;
                                    if (a0Var11 != null) {
                                        a0Var11.r(false);
                                    }
                                    f7.a0 a0Var12 = (f7.a0) i0Var4.f47970p;
                                    if (a0Var12 != null) {
                                        a0Var12.c(new y6.e0(0.5f, 1.0f));
                                    }
                                    f7.a0 a0Var13 = (f7.a0) i0Var4.f47970p;
                                    if (a0Var13 != null) {
                                        a0Var13.r(true);
                                    }
                                    ta.a aVar23 = i0Var4.f47886f;
                                    kotlin.jvm.internal.m.c(aVar23);
                                    ((LinearLayout) ((hj.x2) aVar23).f33567b.f33679g).setVisibility(8);
                                    ta.a aVar24 = i0Var4.f47886f;
                                    kotlin.jvm.internal.m.c(aVar24);
                                    ((FrameLayout) ((hj.x2) aVar24).f33567b.f33678f).setVisibility(8);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    });
                }
                ta.a aVar19 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar19);
                bq.z.b(((hj.x2) aVar19).f33567b.f33674b, new fz.c(this) { // from class: qp.b4

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ i0 f47858b;

                    {
                        this.f47858b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj5) {
                        View v11 = (View) obj5;
                        switch (i13) {
                            case 0:
                                kotlin.jvm.internal.m.f(v11, "v");
                                i0 i0Var = this.f47858b;
                                View view = (View) i0Var.f47818j;
                                if (view != null) {
                                    i0Var.r(view);
                                }
                                i0Var.f47818j = v11;
                                i0Var.s(v11);
                                ((jp.p0) i0Var.f47881a).O(4);
                                break;
                            case 1:
                                kotlin.jvm.internal.m.f(v11, "it");
                                i0 i0Var2 = this.f47858b;
                                f7.a0 a0Var6 = (f7.a0) i0Var2.f47970p;
                                if (a0Var6 == null || !a0Var6.g()) {
                                    f7.a0 a0Var7 = (f7.a0) i0Var2.f47970p;
                                    if (a0Var7 != null) {
                                        a0Var7.c(new y6.e0(1.0f, 1.0f));
                                    }
                                    f7.a0 a0Var8 = (f7.a0) i0Var2.f47970p;
                                    if (a0Var8 != null) {
                                        a0Var8.r(true);
                                    }
                                    ta.a aVar110 = i0Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar110);
                                    ((LinearLayout) ((hj.x2) aVar110).f33567b.f33679g).setVisibility(8);
                                    ta.a aVar20 = i0Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar20);
                                    ((FrameLayout) ((hj.x2) aVar20).f33567b.f33678f).setVisibility(8);
                                }
                                return qy.b0.f48488a;
                            case 2:
                                kotlin.jvm.internal.m.f(v11, "it");
                                i0 i0Var3 = this.f47858b;
                                f7.a0 a0Var9 = (f7.a0) i0Var3.f47970p;
                                if (a0Var9 != null) {
                                    a0Var9.c(new y6.e0(1.0f, 1.0f));
                                }
                                f7.a0 a0Var10 = (f7.a0) i0Var3.f47970p;
                                if (a0Var10 != null) {
                                    a0Var10.r(true);
                                }
                                ta.a aVar21 = i0Var3.f47886f;
                                kotlin.jvm.internal.m.c(aVar21);
                                ((LinearLayout) ((hj.x2) aVar21).f33567b.f33679g).setVisibility(8);
                                ta.a aVar22 = i0Var3.f47886f;
                                kotlin.jvm.internal.m.c(aVar22);
                                ((FrameLayout) ((hj.x2) aVar22).f33567b.f33678f).setVisibility(8);
                                break;
                            default:
                                kotlin.jvm.internal.m.f(v11, "it");
                                i0 i0Var4 = this.f47858b;
                                f7.a0 a0Var11 = (f7.a0) i0Var4.f47970p;
                                if (a0Var11 != null) {
                                    a0Var11.r(false);
                                }
                                f7.a0 a0Var12 = (f7.a0) i0Var4.f47970p;
                                if (a0Var12 != null) {
                                    a0Var12.c(new y6.e0(0.5f, 1.0f));
                                }
                                f7.a0 a0Var13 = (f7.a0) i0Var4.f47970p;
                                if (a0Var13 != null) {
                                    a0Var13.r(true);
                                }
                                ta.a aVar23 = i0Var4.f47886f;
                                kotlin.jvm.internal.m.c(aVar23);
                                ((LinearLayout) ((hj.x2) aVar23).f33567b.f33679g).setVisibility(8);
                                ta.a aVar24 = i0Var4.f47886f;
                                kotlin.jvm.internal.m.c(aVar24);
                                ((FrameLayout) ((hj.x2) aVar24).f33567b.f33678f).setVisibility(8);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
                ta.a aVar20 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar20);
                bq.z.b(((hj.x2) aVar20).f33567b.f33676d, new fz.c(this) { // from class: qp.b4

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ i0 f47858b;

                    {
                        this.f47858b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj5) {
                        View v11 = (View) obj5;
                        switch (i12) {
                            case 0:
                                kotlin.jvm.internal.m.f(v11, "v");
                                i0 i0Var = this.f47858b;
                                View view = (View) i0Var.f47818j;
                                if (view != null) {
                                    i0Var.r(view);
                                }
                                i0Var.f47818j = v11;
                                i0Var.s(v11);
                                ((jp.p0) i0Var.f47881a).O(4);
                                break;
                            case 1:
                                kotlin.jvm.internal.m.f(v11, "it");
                                i0 i0Var2 = this.f47858b;
                                f7.a0 a0Var6 = (f7.a0) i0Var2.f47970p;
                                if (a0Var6 == null || !a0Var6.g()) {
                                    f7.a0 a0Var7 = (f7.a0) i0Var2.f47970p;
                                    if (a0Var7 != null) {
                                        a0Var7.c(new y6.e0(1.0f, 1.0f));
                                    }
                                    f7.a0 a0Var8 = (f7.a0) i0Var2.f47970p;
                                    if (a0Var8 != null) {
                                        a0Var8.r(true);
                                    }
                                    ta.a aVar110 = i0Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar110);
                                    ((LinearLayout) ((hj.x2) aVar110).f33567b.f33679g).setVisibility(8);
                                    ta.a aVar21 = i0Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar21);
                                    ((FrameLayout) ((hj.x2) aVar21).f33567b.f33678f).setVisibility(8);
                                }
                                return qy.b0.f48488a;
                            case 2:
                                kotlin.jvm.internal.m.f(v11, "it");
                                i0 i0Var3 = this.f47858b;
                                f7.a0 a0Var9 = (f7.a0) i0Var3.f47970p;
                                if (a0Var9 != null) {
                                    a0Var9.c(new y6.e0(1.0f, 1.0f));
                                }
                                f7.a0 a0Var10 = (f7.a0) i0Var3.f47970p;
                                if (a0Var10 != null) {
                                    a0Var10.r(true);
                                }
                                ta.a aVar22 = i0Var3.f47886f;
                                kotlin.jvm.internal.m.c(aVar22);
                                ((LinearLayout) ((hj.x2) aVar22).f33567b.f33679g).setVisibility(8);
                                ta.a aVar23 = i0Var3.f47886f;
                                kotlin.jvm.internal.m.c(aVar23);
                                ((FrameLayout) ((hj.x2) aVar23).f33567b.f33678f).setVisibility(8);
                                break;
                            default:
                                kotlin.jvm.internal.m.f(v11, "it");
                                i0 i0Var4 = this.f47858b;
                                f7.a0 a0Var11 = (f7.a0) i0Var4.f47970p;
                                if (a0Var11 != null) {
                                    a0Var11.r(false);
                                }
                                f7.a0 a0Var12 = (f7.a0) i0Var4.f47970p;
                                if (a0Var12 != null) {
                                    a0Var12.c(new y6.e0(0.5f, 1.0f));
                                }
                                f7.a0 a0Var13 = (f7.a0) i0Var4.f47970p;
                                if (a0Var13 != null) {
                                    a0Var13.r(true);
                                }
                                ta.a aVar24 = i0Var4.f47886f;
                                kotlin.jvm.internal.m.c(aVar24);
                                ((LinearLayout) ((hj.x2) aVar24).f33567b.f33679g).setVisibility(8);
                                ta.a aVar25 = i0Var4.f47886f;
                                kotlin.jvm.internal.m.c(aVar25);
                                ((FrameLayout) ((hj.x2) aVar25).f33567b.f33678f).setVisibility(8);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
                ta.a aVar21 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar21);
                ((LinearLayout) ((hj.x2) aVar21).f33567b.f33679g).setVisibility(8);
                ta.a aVar22 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar22);
                ((FrameLayout) ((hj.x2) aVar22).f33567b.f33678f).setVisibility(8);
                Model_Word_010 model_Word_014 = this.f47967l;
                if (model_Word_014 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                Word word6 = model_Word_014.getWord();
                kotlin.jvm.internal.m.e(word6, "getWord(...)");
                q(zq.c.c(word6));
                ArrayList arrayList3 = new ArrayList();
                int i30 = this.f47968n;
                for (int i31 = 0; i31 < i30; i31++) {
                    if (i31 == 0) {
                        Model_Word_010 model_Word_015 = this.f47967l;
                        if (model_Word_015 == null) {
                            kotlin.jvm.internal.m.n("mModel");
                            throw null;
                        }
                        Word word7 = model_Word_015.getWord();
                        kotlin.jvm.internal.m.e(word7, "getWord(...)");
                        arrayList3.add(word7);
                    } else {
                        int iM3 = fr.j3.M(this.f47968n);
                        while (true) {
                            int size5 = arrayList3.size();
                            int i32 = 0;
                            do {
                                if (i32 >= size5) {
                                    List list6 = this.m;
                                    if (list6 == null) {
                                        kotlin.jvm.internal.m.n("options");
                                        throw null;
                                    }
                                    arrayList3.add(list6.get(iM3));
                                }
                                Object obj5 = arrayList3.get(i32);
                                i32++;
                                wordId3 = ((Word) obj5).getWordId();
                                list3 = this.m;
                                if (list3 == null) {
                                    kotlin.jvm.internal.m.n("options");
                                    throw null;
                                }
                                break;
                            } while (wordId3 != ((Word) list3.get(iM3)).getWordId());
                            iM3 = fr.j3.M(this.f47968n);
                        }
                    }
                }
                Collections.shuffle(arrayList3);
                int size6 = arrayList3.size();
                for (int i33 = 0; i33 < size6; i33++) {
                    int iA3 = w4.c.a(i33, "rl_answer_");
                    Object obj6 = arrayList3.get(i33);
                    kotlin.jvm.internal.m.e(obj6, "get(...)");
                    Word word8 = (Word) obj6;
                    View viewFindViewById3 = o().findViewById(iA3);
                    kotlin.jvm.internal.m.e(viewFindViewById3, "findViewById(...)");
                    CardView cardView3 = (CardView) viewFindViewById3;
                    cardView3.setVisibility(0);
                    cardView3.setTag(word8);
                    bq.z.b(cardView3, new fz.c(this) { // from class: qp.b4

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ i0 f47858b;

                        {
                            this.f47858b = this;
                        }

                        @Override // fz.c
                        public final Object invoke(Object obj7) {
                            View v11 = (View) obj7;
                            switch (i14) {
                                case 0:
                                    kotlin.jvm.internal.m.f(v11, "v");
                                    i0 i0Var = this.f47858b;
                                    View view = (View) i0Var.f47818j;
                                    if (view != null) {
                                        i0Var.r(view);
                                    }
                                    i0Var.f47818j = v11;
                                    i0Var.s(v11);
                                    ((jp.p0) i0Var.f47881a).O(4);
                                    break;
                                case 1:
                                    kotlin.jvm.internal.m.f(v11, "it");
                                    i0 i0Var2 = this.f47858b;
                                    f7.a0 a0Var6 = (f7.a0) i0Var2.f47970p;
                                    if (a0Var6 == null || !a0Var6.g()) {
                                        f7.a0 a0Var7 = (f7.a0) i0Var2.f47970p;
                                        if (a0Var7 != null) {
                                            a0Var7.c(new y6.e0(1.0f, 1.0f));
                                        }
                                        f7.a0 a0Var8 = (f7.a0) i0Var2.f47970p;
                                        if (a0Var8 != null) {
                                            a0Var8.r(true);
                                        }
                                        ta.a aVar110 = i0Var2.f47886f;
                                        kotlin.jvm.internal.m.c(aVar110);
                                        ((LinearLayout) ((hj.x2) aVar110).f33567b.f33679g).setVisibility(8);
                                        ta.a aVar23 = i0Var2.f47886f;
                                        kotlin.jvm.internal.m.c(aVar23);
                                        ((FrameLayout) ((hj.x2) aVar23).f33567b.f33678f).setVisibility(8);
                                    }
                                    return qy.b0.f48488a;
                                case 2:
                                    kotlin.jvm.internal.m.f(v11, "it");
                                    i0 i0Var3 = this.f47858b;
                                    f7.a0 a0Var9 = (f7.a0) i0Var3.f47970p;
                                    if (a0Var9 != null) {
                                        a0Var9.c(new y6.e0(1.0f, 1.0f));
                                    }
                                    f7.a0 a0Var10 = (f7.a0) i0Var3.f47970p;
                                    if (a0Var10 != null) {
                                        a0Var10.r(true);
                                    }
                                    ta.a aVar24 = i0Var3.f47886f;
                                    kotlin.jvm.internal.m.c(aVar24);
                                    ((LinearLayout) ((hj.x2) aVar24).f33567b.f33679g).setVisibility(8);
                                    ta.a aVar25 = i0Var3.f47886f;
                                    kotlin.jvm.internal.m.c(aVar25);
                                    ((FrameLayout) ((hj.x2) aVar25).f33567b.f33678f).setVisibility(8);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.f(v11, "it");
                                    i0 i0Var4 = this.f47858b;
                                    f7.a0 a0Var11 = (f7.a0) i0Var4.f47970p;
                                    if (a0Var11 != null) {
                                        a0Var11.r(false);
                                    }
                                    f7.a0 a0Var12 = (f7.a0) i0Var4.f47970p;
                                    if (a0Var12 != null) {
                                        a0Var12.c(new y6.e0(0.5f, 1.0f));
                                    }
                                    f7.a0 a0Var13 = (f7.a0) i0Var4.f47970p;
                                    if (a0Var13 != null) {
                                        a0Var13.r(true);
                                    }
                                    ta.a aVar26 = i0Var4.f47886f;
                                    kotlin.jvm.internal.m.c(aVar26);
                                    ((LinearLayout) ((hj.x2) aVar26).f33567b.f33679g).setVisibility(8);
                                    ta.a aVar27 = i0Var4.f47886f;
                                    kotlin.jvm.internal.m.c(aVar27);
                                    ((FrameLayout) ((hj.x2) aVar27).f33567b.f33678f).setVisibility(8);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    });
                    w(cardView3, word8);
                }
                ef.e.B(o());
                return;
        }
    }

    @Override // qp.a
    public final void r(View view) {
        switch (this.f47966k) {
            case 0:
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
                break;
            case 1:
                kotlin.jvm.internal.m.f(view, "view");
                CardView cardView2 = (CardView) view;
                ArgbEvaluator argbEvaluator5 = new ArgbEvaluator();
                Context context2 = this.f47883c;
                kotlin.jvm.internal.m.f(context2, "context");
                Integer numValueOf5 = Integer.valueOf(context2.getColor(R.color.color_E1E9F6));
                kotlin.jvm.internal.m.f(context2, "context");
                ObjectAnimator.ofObject(cardView2, "cardBackgroundColor", argbEvaluator5, numValueOf5, Integer.valueOf(context2.getColor(R.color.white))).setDuration(300L).start();
                TextView textView4 = (TextView) cardView2.findViewById(R.id.tv_top);
                TextView textView5 = (TextView) cardView2.findViewById(R.id.tv_middle);
                TextView textView6 = (TextView) cardView2.findViewById(R.id.tv_bottom);
                ArgbEvaluator argbEvaluator6 = new ArgbEvaluator();
                Integer numValueOf6 = Integer.valueOf(textView4.getTextColors().getDefaultColor());
                kotlin.jvm.internal.m.f(context2, "context");
                ObjectAnimator.ofObject(textView4, "textColor", argbEvaluator6, numValueOf6, Integer.valueOf(context2.getColor(R.color.second_black))).setDuration(300L).start();
                ArgbEvaluator argbEvaluator7 = new ArgbEvaluator();
                Integer numValueOf7 = Integer.valueOf(textView5.getTextColors().getDefaultColor());
                kotlin.jvm.internal.m.f(context2, "context");
                ObjectAnimator.ofObject(textView5, "textColor", argbEvaluator7, numValueOf7, Integer.valueOf(context2.getColor(R.color.primary_black))).setDuration(300L).start();
                ArgbEvaluator argbEvaluator8 = new ArgbEvaluator();
                Integer numValueOf8 = Integer.valueOf(textView6.getTextColors().getDefaultColor());
                kotlin.jvm.internal.m.f(context2, "context");
                ObjectAnimator.ofObject(textView6, "textColor", argbEvaluator8, numValueOf8, Integer.valueOf(context2.getColor(R.color.second_black))).setDuration(300L).start();
                break;
            default:
                kotlin.jvm.internal.m.f(view, "view");
                CardView cardView3 = (CardView) view;
                ArgbEvaluator argbEvaluator9 = new ArgbEvaluator();
                Context context3 = this.f47883c;
                kotlin.jvm.internal.m.f(context3, "context");
                Integer numValueOf9 = Integer.valueOf(context3.getColor(R.color.color_E1E9F6));
                kotlin.jvm.internal.m.f(context3, "context");
                ObjectAnimator.ofObject(cardView3, "cardBackgroundColor", argbEvaluator9, numValueOf9, Integer.valueOf(context3.getColor(R.color.white))).setDuration(300L).start();
                TextView textView7 = (TextView) cardView3.findViewById(R.id.tv_top);
                TextView textView8 = (TextView) cardView3.findViewById(R.id.tv_middle);
                TextView textView9 = (TextView) cardView3.findViewById(R.id.tv_bottom);
                ArgbEvaluator argbEvaluator10 = new ArgbEvaluator();
                Integer numValueOf10 = Integer.valueOf(textView7.getTextColors().getDefaultColor());
                kotlin.jvm.internal.m.f(context3, "context");
                ObjectAnimator.ofObject(textView7, "textColor", argbEvaluator10, numValueOf10, Integer.valueOf(context3.getColor(R.color.second_black))).setDuration(300L).start();
                ArgbEvaluator argbEvaluator11 = new ArgbEvaluator();
                Integer numValueOf11 = Integer.valueOf(textView8.getTextColors().getDefaultColor());
                kotlin.jvm.internal.m.f(context3, "context");
                ObjectAnimator.ofObject(textView8, "textColor", argbEvaluator11, numValueOf11, Integer.valueOf(context3.getColor(R.color.primary_black))).setDuration(300L).start();
                ArgbEvaluator argbEvaluator12 = new ArgbEvaluator();
                Integer numValueOf12 = Integer.valueOf(textView9.getTextColors().getDefaultColor());
                kotlin.jvm.internal.m.f(context3, "context");
                ObjectAnimator.ofObject(textView9, "textColor", argbEvaluator12, numValueOf12, Integer.valueOf(context3.getColor(R.color.second_black))).setDuration(300L).start();
                break;
        }
    }

    @Override // qp.a
    public final void s(View view) {
        switch (this.f47966k) {
            case 0:
                kotlin.jvm.internal.m.f(view, "view");
                CardView cardView = (CardView) view;
                int defaultColor = cardView.getCardBackgroundColor().getDefaultColor();
                Context context = this.f47883c;
                kotlin.jvm.internal.m.f(context, "context");
                android.support.v4.media.session.a.h(cardView, defaultColor, context.getColor(R.color.color_E1E9F6));
                break;
            case 1:
                kotlin.jvm.internal.m.f(view, "view");
                CardView cardView2 = (CardView) view;
                int defaultColor2 = cardView2.getCardBackgroundColor().getDefaultColor();
                Context context2 = this.f47883c;
                kotlin.jvm.internal.m.f(context2, "context");
                android.support.v4.media.session.a.h(cardView2, defaultColor2, context2.getColor(R.color.color_E1E9F6));
                break;
            default:
                kotlin.jvm.internal.m.f(view, "view");
                CardView cardView3 = (CardView) view;
                int defaultColor3 = cardView3.getCardBackgroundColor().getDefaultColor();
                Context context3 = this.f47883c;
                kotlin.jvm.internal.m.f(context3, "context");
                android.support.v4.media.session.a.h(cardView3, defaultColor3, context3.getColor(R.color.color_E1E9F6));
                break;
        }
    }

    public void u(CardView cardView, Word word) {
        TextView textView = (TextView) cardView.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) cardView.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) cardView.findViewById(R.id.tv_bottom);
        textView2.setTextSize(this.f47969o);
        kotlin.jvm.internal.m.c(textView);
        kotlin.jvm.internal.m.c(textView3);
        boolean z11 = ((jp.p0) this.f47881a).Q;
        zq.c.e(word, textView, textView2, textView3, true);
    }

    public void v(CardView cardView, Word word) {
        TextView textView = (TextView) cardView.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) cardView.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) cardView.findViewById(R.id.tv_bottom);
        textView2.setTextSize(this.f47969o);
        kotlin.jvm.internal.m.c(textView);
        kotlin.jvm.internal.m.c(textView3);
        boolean z11 = ((jp.p0) this.f47881a).Q;
        zq.c.e(word, textView, textView2, textView3, true);
    }

    public void w(CardView cardView, Word word) {
        TextView textView = (TextView) cardView.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) cardView.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) cardView.findViewById(R.id.tv_bottom);
        textView2.setTextSize(this.f47969o);
        kotlin.jvm.internal.m.c(textView);
        kotlin.jvm.internal.m.c(textView3);
        boolean z11 = ((jp.p0) this.f47881a).Q;
        zq.c.e(word, textView, textView2, textView3, true);
    }

    public void x() {
        Model_Word_010 model_Word_010 = this.f47967l;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Word word = model_Word_010.getWord();
        kotlin.jvm.internal.m.e(word, "getWord(...)");
        q(zq.c.c(word));
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        TextView textView = ((hj.o1) aVar).f33010b.f32356b;
        Model_Word_010 model_Word_011 = this.f47967l;
        if (model_Word_011 != null) {
            textView.setText(model_Word_011.getWord().getTranslations());
        } else {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
    }
}
