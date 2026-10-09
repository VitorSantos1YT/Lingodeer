package qp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.drawerlayout.widget.ktFt.FpIL;
import com.airbnb.lottie.LottieAnimationView;
import com.lingo.lingoskill.object.Model_Word_010;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Model_Word_010 f48218k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f48219l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f48220n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f48221o;

    public v0(mp.b bVar, long j11) {
        super(bVar, j11, 1);
        this.m = 4;
        int[] iArr = bq.r.f4959a;
        this.f48220n = bq.m.b();
        this.f48221o = nv.p.m(j11, "0;", ";10");
    }

    @Override // qp.a, hi.a
    public final boolean a() {
        View view = (View) this.f47818j;
        if (view != null) {
            view.getTag();
        }
        View view2 = (View) this.f47818j;
        kotlin.jvm.internal.m.c(view2);
        Object tag = view2.getTag();
        kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
        boolean z11 = ((Word) tag).getWordId() == u().getWordId();
        List list = this.f48220n;
        if (z11) {
            ta.a aVar = this.f47886f;
            kotlin.jvm.internal.m.c(aVar);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ((hj.p1) aVar).f33080b.f32360f;
            Collection collection = (Collection) list.get(1);
            jz.d dVar = jz.e.f37397a;
            lottieAnimationView.setAnimation(((Number) ry.m.I0(collection)).intValue());
        } else {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ((hj.p1) aVar2).f33080b.f32360f;
            Collection collection2 = (Collection) list.get(2);
            jz.d dVar2 = jz.e.f37397a;
            lottieAnimationView2.setAnimation(((Number) ry.m.I0(collection2)).intValue());
        }
        if (this.f47884d.showAnim) {
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            ((LottieAnimationView) ((hj.p1) aVar3).f33080b.f32360f).d(new f(this, 8));
            return z11;
        }
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((LottieAnimationView) ((hj.p1) aVar4).f33080b.f32359e).e();
        return z11;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Word_010 model_Word_010 = this.f48218k;
        if (model_Word_010 != null) {
            return fv.b.Y(model_Word_010.getWordId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // qp.a, hi.a
    public final String c() {
        return this.f48221o;
    }

    @Override // qp.d, hi.a
    public final void d(ViewGroup viewGroup) {
        Model_Word_010 model_Word_010 = this.f48218k;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> optionList = model_Word_010.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        this.f48219l = optionList;
        this.m = optionList.size();
        super.d(viewGroup);
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        Model_Word_010 model_Word_010 = this.f48218k;
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
        this.f48218k = model_Word_010LoadFullObject;
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
        return u0.f48212a;
    }

    @Override // qp.a
    public final void r(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        view.setEnabled(true);
    }

    @Override // qp.a
    public final void s(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        view.setEnabled(false);
    }

    public final Word u() {
        Model_Word_010 model_Word_010 = this.f48218k;
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
        ((hj.p1) aVar).f33080b.f32356b.setText(u().getTranslations());
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((ImageView) ((hj.p1) aVar2).f33080b.f32358d).setVisibility(8);
        q(zq.c.c(u()));
    }

    @Override // qp.d
    public final void p() {
        long wordId;
        List list;
        ((jp.p0) this.f47881a).O(0);
        v();
        ArrayList arrayList = new ArrayList();
        int i11 = this.m;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 == 0) {
                arrayList.add(u());
            } else {
                int iM = fr.j3.M(this.m);
                while (true) {
                    int size = arrayList.size();
                    int i13 = 0;
                    do {
                        if (i13 >= size) {
                            List list2 = this.f48219l;
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
                        list = this.f48219l;
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
            int iA = w4.c.a(i15, FpIL.LbxNbFqHJj);
            Object obj2 = arrayList.get(i15);
            kotlin.jvm.internal.m.e(obj2, "get(...)");
            FrameLayout frameLayout = (FrameLayout) o().findViewById(iA);
            frameLayout.setVisibility(0);
            frameLayout.setTag((Word) obj2);
            bq.z.b(frameLayout, new ot.e2(this, 7));
        }
        ef.e.B(o());
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ((hj.p1) aVar).f33080b.f32359e;
        Collection collection = (Collection) this.f48220n.get(0);
        jz.d dVar = jz.e.f37397a;
        lottieAnimationView.setAnimation(((Number) ry.m.I0(collection)).intValue());
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((LottieAnimationView) ((hj.p1) aVar2).f33080b.f32359e).setRepeatCount(-1);
        if (this.f47884d.showAnim) {
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            ((LottieAnimationView) ((hj.p1) aVar3).f33080b.f32359e).h();
        } else {
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            ((LottieAnimationView) ((hj.p1) aVar4).f33080b.f32359e).e();
        }
    }
}
