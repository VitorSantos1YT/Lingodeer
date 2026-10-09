package qp;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Model_Sentence_010;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n1 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Model_Sentence_010 f48071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Sentence f48072l;
    public List m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f48073n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f48074o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h f48075p;

    public n1(mp.b bVar, long j11) {
        super(bVar, j11, 1);
        this.f48073n = 4;
        this.f48074o = new ArrayList();
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_010 model_Sentence_010 = this.f48071k;
        if (model_Sentence_010 != null) {
            return fv.b.G(model_Sentence_010.getSentenceId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // qp.a, hi.a
    public final String c() {
        return nv.p.m(this.f47882b, "1;", ";1");
    }

    @Override // qp.d, hi.a
    public final void d(ViewGroup viewGroup) {
        Model_Sentence_010 model_Sentence_010 = this.f48071k;
        if (model_Sentence_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Sentence> optionList = model_Sentence_010.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        List listS = ns.o.S(optionList);
        this.m = listS;
        this.f48073n = ((ArrayList) listS).size();
        if (this.f47884d.keyLanguage == 1) {
            List list = this.m;
            if (list == null) {
                kotlin.jvm.internal.m.n("options");
                throw null;
            }
            if (list.size() >= 3) {
                this.f48073n = 3;
            }
        }
        super.d(viewGroup);
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_010 model_Sentence_010 = this.f48071k;
        if (model_Sentence_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strH = fv.b.H(model_Sentence_010.getSentenceId());
        Model_Sentence_010 model_Sentence_011 = this.f48071k;
        if (model_Sentence_011 != null) {
            arrayList.add(new fv.a(2L, strH, fv.b.F(model_Sentence_011.getSentenceId())));
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
        Model_Sentence_010 model_Sentence_010LoadFullObject = Model_Sentence_010.loadFullObject(this.f47882b);
        if (model_Sentence_010LoadFullObject == null) {
            throw new NoSuchElemException();
        }
        this.f48071k = model_Sentence_010LoadFullObject;
        if (model_Sentence_010LoadFullObject.getOptionList().size() == 0) {
            throw new NoSuchElemException();
        }
    }

    @Override // qp.d
    public final fz.f n() {
        return m1.f48050a;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0169  */
    @Override // qp.d
    public final void p() {
        ((jp.p0) this.f47881a).O(0);
        Model_Sentence_010 model_Sentence_010 = this.f48071k;
        if (model_Sentence_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_010.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        this.f48072l = sentence;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        TextView textView = (TextView) ((hj.f2) aVar).f32562b.f32503c.findViewById(R.id.tv_title);
        Sentence sentence2 = this.f48072l;
        if (sentence2 == null) {
            kotlin.jvm.internal.m.n("mainSent");
            throw null;
        }
        textView.setText(sentence2.getTranslations());
        Model_Sentence_010 model_Sentence_011 = this.f48071k;
        if (model_Sentence_011 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence3 = model_Sentence_011.getSentence();
        kotlin.jvm.internal.m.e(sentence3, "getSentence(...)");
        q(zq.c.b(sentence3));
        ArrayList arrayList = new ArrayList();
        Sentence sentence4 = this.f48072l;
        if (sentence4 == null) {
            kotlin.jvm.internal.m.n("mainSent");
            throw null;
        }
        List<Sentence> list = this.m;
        if (list == null) {
            kotlin.jvm.internal.m.n("options");
            throw null;
        }
        for (Sentence sentence5 : list) {
            long sentenceId = sentence5.getSentenceId();
            Model_Sentence_010 model_Sentence_012 = this.f48071k;
            if (model_Sentence_012 == null) {
                kotlin.jvm.internal.m.n("mModel");
                throw null;
            }
            String answer = model_Sentence_012.getAnswer();
            kotlin.jvm.internal.m.e(answer, "getAnswer(...)");
            if (sentenceId == Long.parseLong(answer)) {
                sentence4 = sentence5;
            }
        }
        int i11 = this.f48073n;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 == 0) {
                arrayList.add(sentence4);
            } else {
                int iM = fr.j3.M(this.f48073n);
                while (true) {
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            List list2 = this.m;
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
                        Sentence sentence6 = (Sentence) obj;
                        if (sentence6 != null) {
                            long sentenceId2 = sentence6.getSentenceId();
                            List list3 = this.m;
                            if (list3 == null) {
                                kotlin.jvm.internal.m.n("options");
                                throw null;
                            }
                            if (sentenceId2 == ((Sentence) list3.get(iM)).getSentenceId()) {
                                break;
                            }
                        }
                    }
                    iM = fr.j3.M(this.f48073n);
                }
            }
        }
        Collections.shuffle(arrayList);
        int i14 = this.f48073n;
        for (int i15 = 0; i15 < i14; i15++) {
            int iA = w4.c.a(i15, "rl_answer_");
            Sentence sentence7 = (Sentence) arrayList.get(i15);
            View viewFindViewById = o().findViewById(iA);
            kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById;
            cardView.setVisibility(0);
            cardView.setTag(sentence7);
            View viewFindViewById2 = cardView.findViewById(R.id.flex_container);
            kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
            h hVar = new h((FlexboxLayout) viewFindViewById2, this, this.f47883c, sentence7.getSentWords());
            int[] iArr = bq.r.f4959a;
            if (bq.m.F()) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (ry.l.D(new Integer[]{2, 13}, Integer.valueOf(cf.x.n().keyLanguage))) {
                    hVar.f59274j = ff.h.l(2.0f);
                } else {
                    Env env = this.f47884d;
                    int i16 = env.keyLanguage;
                    if (i16 != 12 && i16 != 1) {
                        hVar.f59274j = 2;
                    } else if (env.jsDisPlay == 2) {
                        hVar.f59274j = ff.h.l(2.0f);
                    } else {
                        hVar.f59274j = 2;
                    }
                }
            } else {
                hVar.f59274j = ff.h.l(2.0f);
            }
            hVar.f59277n = true;
            hVar.d();
            this.f48074o.add(hVar);
            bq.z.b(cardView, new n0.w0(23, this, hVar));
            View viewFindViewById3 = cardView.findViewById(R.id.flex_container);
            kotlin.jvm.internal.m.e(viewFindViewById3, "findViewById(...)");
            bq.z.b((FlexboxLayout) viewFindViewById3, new kp.c(cardView, 2));
        }
        ef.e.B(o());
    }

    @Override // qp.a
    public final void r(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        MaterialCardView materialCardView = (MaterialCardView) view;
        int defaultColor = materialCardView.getCardBackgroundColor().getDefaultColor();
        Context context = this.f47883c;
        kotlin.jvm.internal.m.f(context, "context");
        android.support.v4.media.session.a.h(materialCardView, defaultColor, context.getColor(R.color.white));
        ((ImageView) materialCardView.findViewById(R.id.iv_sentence_more)).setImageResource(R.drawable.ic_sentence_right_more);
    }

    @Override // qp.a
    public final void s(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        MaterialCardView materialCardView = (MaterialCardView) view;
        int defaultColor = materialCardView.getCardBackgroundColor().getDefaultColor();
        Context context = this.f47883c;
        kotlin.jvm.internal.m.f(context, "context");
        android.support.v4.media.session.a.h(materialCardView, defaultColor, context.getColor(R.color.color_E1E9F6));
        ImageView imageView = (ImageView) materialCardView.findViewById(R.id.iv_sentence_more);
        kotlin.jvm.internal.m.c(imageView);
        cf.x.L(imageView, R.drawable.ic_sentence_right_more, ColorStateList.valueOf(context.getColor(R.color.white)));
    }

    @Override // qp.a, hi.a
    public final boolean a() {
        int i11;
        View view = (View) this.f47818j;
        if (view == null || view.getTag() == null) {
            return false;
        }
        Model_Sentence_010 model_Sentence_010 = this.f48071k;
        if (model_Sentence_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String answer = model_Sentence_010.getAnswer();
        kotlin.jvm.internal.m.e(answer, OCBJEWZHh.PePQuuWi);
        long j11 = Long.parseLong(answer);
        View view2 = (View) this.f47818j;
        kotlin.jvm.internal.m.c(view2);
        Object tag = view2.getTag();
        kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Sentence");
        boolean z11 = j11 == ((Sentence) tag).getSentenceId();
        Context context = this.f47883c;
        if (z11) {
            kotlin.jvm.internal.m.f(context, "context");
            i11 = R.color.color_43CC93;
        } else {
            kotlin.jvm.internal.m.f(context, "context");
            i11 = R.color.color_FF6666;
        }
        int color = context.getColor(i11);
        h hVar = this.f48075p;
        if (hVar != null) {
            hVar.f59271g = color;
            hVar.f59272h = color;
            hVar.f59273i = color;
            if (hVar != null) {
                hVar.e();
            }
        }
        return z11;
    }

    @Override // hi.a
    public final void k() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        Model_Sentence_010 model_Sentence_010 = this.f48071k;
        if (model_Sentence_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_010.getSentence();
        kotlin.jvm.internal.m.e(sentence, SemtNwfPgIhi.JUAi);
        q(zq.c.b(sentence));
        Iterator it = this.f48074o.iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.m.e(next, "next(...)");
            ((zq.b) next).e();
        }
    }
}
