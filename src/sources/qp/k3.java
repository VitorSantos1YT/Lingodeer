package qp;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k3 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Sentence f48014k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f48015l;
    public h m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f48016n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f48017o;

    public k3(mp.b bVar, long j11) {
        super(bVar, j11, 0);
        this.f48015l = -1;
        this.f48017o = ff.h.l(2.0f);
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Sentence sentence = this.f48014k;
        if (sentence != null) {
            return fv.b.G(sentence.getSentenceId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // qp.a, qp.d, hi.a
    public final void f() {
        super.f();
        h hVar = this.m;
        if (hVar != null) {
            hVar.b();
        } else {
            kotlin.jvm.internal.m.n("sentenceLayout");
            throw null;
        }
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        long j11 = this.f47882b;
        arrayList.add(new fv.a(2L, fv.b.H(j11), fv.b.F(j11)));
        Sentence sentence = this.f48014k;
        if (sentence == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        for (Word word : sentence.getSentWords()) {
            if (word.getWordType() != 1) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if ((cf.x.n().keyLanguage != 5 && cf.x.n().keyLanguage != 15) || (word.getWordId() != 1858 && word.getWordId() != 544)) {
                    qy.q qVar2 = fv.b.f28186a;
                    arrayList.add(new fv.a(2L, fv.b.Z(word.getWordId()), fv.b.V(word.getWordId())));
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
        Sentence sentenceE = ij.c.e(this.f47882b);
        if (sentenceE == null) {
            throw new NoSuchElemException();
        }
        this.f48014k = sentenceE;
    }

    @Override // hi.a
    public final void k() {
        h hVar = this.m;
        if (hVar != null) {
            hVar.e();
        } else {
            kotlin.jvm.internal.m.n("sentenceLayout");
            throw null;
        }
    }

    @Override // qp.d
    public final fz.f n() {
        return j3.f47997a;
    }

    @Override // qp.d
    public final void p() {
        Sentence sentence = this.f48014k;
        if (sentence == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> sentWords = sentence.getSentWords();
        kotlin.jvm.internal.m.e(sentWords, "getSentWords(...)");
        this.f48016n = sentWords;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        this.m = new h(this.f47883c, sentWords, ((hj.g2) aVar).f32604b, this);
        int[] iArr = bq.r.f4959a;
        final int i11 = 2;
        if (bq.m.F()) {
            h hVar = this.m;
            if (hVar == null) {
                kotlin.jvm.internal.m.n("sentenceLayout");
                throw null;
            }
            hVar.f59274j = 2;
        } else {
            h hVar2 = this.m;
            if (hVar2 == null) {
                kotlin.jvm.internal.m.n("sentenceLayout");
                throw null;
            }
            hVar2.f59274j = this.f48017o;
        }
        h hVar3 = this.m;
        if (hVar3 == null) {
            kotlin.jvm.internal.m.n("sentenceLayout");
            throw null;
        }
        final int i12 = 0;
        hVar3.f59278o = false;
        hVar3.m = new lf.x0(this, 23);
        hVar3.d();
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        bq.z.b(((hj.g2) aVar2).f32605c, new fz.c(this) { // from class: qp.i3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k3 f47981b;

            {
                this.f47981b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                ta.a aVar3;
                ta.a aVar4;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        k3 k3Var = this.f47981b;
                        if (k3Var.f48015l == -1) {
                            k3Var.f48015l = 0;
                            ta.a aVar5 = k3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar5);
                            ((hj.g2) aVar5).f32604b.getChildAt(k3Var.f48015l).performClick();
                        } else {
                            do {
                                int i13 = k3Var.f48015l + 1;
                                k3Var.f48015l = i13;
                                ta.a aVar6 = k3Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar6);
                                if (i13 == ((hj.g2) aVar6).f32604b.getChildCount()) {
                                    k3Var.f48015l = 0;
                                }
                                aVar3 = k3Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar3);
                            } while (((Word) hh.p0.g(((hj.g2) aVar3).f32604b, k3Var.f48015l, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word")).getWordType() == 1);
                            h hVar4 = k3Var.m;
                            if (hVar4 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow = hVar4.f59275k;
                            if (popupWindow != null && popupWindow.isShowing()) {
                                h hVar5 = k3Var.m;
                                if (hVar5 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow2 = hVar5.f59275k;
                                if (popupWindow2 != null) {
                                    popupWindow2.dismiss();
                                }
                            }
                            ta.a aVar7 = k3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar7);
                            ((hj.g2) aVar7).f32604b.getChildAt(k3Var.f48015l).performClick();
                            k3Var.u();
                        }
                        return qy.b0.f48488a;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        k3 k3Var2 = this.f47981b;
                        if (k3Var2.f48015l == -1) {
                            k3Var2.f48015l = 0;
                            ta.a aVar8 = k3Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar8);
                            ((hj.g2) aVar8).f32604b.getChildAt(k3Var2.f48015l).performClick();
                        } else {
                            do {
                                int i14 = k3Var2.f48015l - 1;
                                k3Var2.f48015l = i14;
                                if (i14 < 0) {
                                    ta.a aVar9 = k3Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar9);
                                    k3Var2.f48015l = ((hj.g2) aVar9).f32604b.getChildCount() - 1;
                                }
                                aVar4 = k3Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar4);
                            } while (((Word) hh.p0.g(((hj.g2) aVar4).f32604b, k3Var2.f48015l, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word")).getWordType() == 1);
                            h hVar6 = k3Var2.m;
                            if (hVar6 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow3 = hVar6.f59275k;
                            if (popupWindow3 != null && popupWindow3.isShowing()) {
                                h hVar7 = k3Var2.m;
                                if (hVar7 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow4 = hVar7.f59275k;
                                if (popupWindow4 != null) {
                                    popupWindow4.dismiss();
                                }
                            }
                            ta.a aVar10 = k3Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar10);
                            ((hj.g2) aVar10).f32604b.getChildAt(k3Var2.f48015l).performClick();
                            k3Var2.u();
                        }
                        return qy.b0.f48488a;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        k3 k3Var3 = this.f47981b;
                        h hVar8 = k3Var3.m;
                        if (hVar8 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow5 = hVar8.f59275k;
                        if (popupWindow5 != null && popupWindow5.isShowing()) {
                            h hVar9 = k3Var3.m;
                            if (hVar9 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow6 = hVar9.f59275k;
                            if (popupWindow6 != null) {
                                popupWindow6.dismiss();
                            }
                        }
                        k3Var3.u();
                        return qy.b0.f48488a;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        k3 k3Var4 = this.f47981b;
                        h hVar10 = k3Var4.m;
                        if (hVar10 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow7 = hVar10.f59275k;
                        if (popupWindow7 != null && popupWindow7.isShowing()) {
                            h hVar11 = k3Var4.m;
                            if (hVar11 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow8 = hVar11.f59275k;
                            if (popupWindow8 != null) {
                                popupWindow8.dismiss();
                            }
                        }
                        return qy.b0.f48488a;
                }
            }
        });
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        final int i13 = 1;
        bq.z.b(((hj.g2) aVar3).f32606d, new fz.c(this) { // from class: qp.i3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k3 f47981b;

            {
                this.f47981b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                ta.a aVar4;
                ta.a aVar5;
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        k3 k3Var = this.f47981b;
                        if (k3Var.f48015l == -1) {
                            k3Var.f48015l = 0;
                            ta.a aVar6 = k3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar6);
                            ((hj.g2) aVar6).f32604b.getChildAt(k3Var.f48015l).performClick();
                        } else {
                            do {
                                int i14 = k3Var.f48015l + 1;
                                k3Var.f48015l = i14;
                                ta.a aVar7 = k3Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar7);
                                if (i14 == ((hj.g2) aVar7).f32604b.getChildCount()) {
                                    k3Var.f48015l = 0;
                                }
                                aVar4 = k3Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar4);
                            } while (((Word) hh.p0.g(((hj.g2) aVar4).f32604b, k3Var.f48015l, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word")).getWordType() == 1);
                            h hVar4 = k3Var.m;
                            if (hVar4 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow = hVar4.f59275k;
                            if (popupWindow != null && popupWindow.isShowing()) {
                                h hVar5 = k3Var.m;
                                if (hVar5 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow2 = hVar5.f59275k;
                                if (popupWindow2 != null) {
                                    popupWindow2.dismiss();
                                }
                            }
                            ta.a aVar8 = k3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar8);
                            ((hj.g2) aVar8).f32604b.getChildAt(k3Var.f48015l).performClick();
                            k3Var.u();
                        }
                        return qy.b0.f48488a;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        k3 k3Var2 = this.f47981b;
                        if (k3Var2.f48015l == -1) {
                            k3Var2.f48015l = 0;
                            ta.a aVar9 = k3Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar9);
                            ((hj.g2) aVar9).f32604b.getChildAt(k3Var2.f48015l).performClick();
                        } else {
                            do {
                                int i15 = k3Var2.f48015l - 1;
                                k3Var2.f48015l = i15;
                                if (i15 < 0) {
                                    ta.a aVar10 = k3Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar10);
                                    k3Var2.f48015l = ((hj.g2) aVar10).f32604b.getChildCount() - 1;
                                }
                                aVar5 = k3Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar5);
                            } while (((Word) hh.p0.g(((hj.g2) aVar5).f32604b, k3Var2.f48015l, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word")).getWordType() == 1);
                            h hVar6 = k3Var2.m;
                            if (hVar6 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow3 = hVar6.f59275k;
                            if (popupWindow3 != null && popupWindow3.isShowing()) {
                                h hVar7 = k3Var2.m;
                                if (hVar7 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow4 = hVar7.f59275k;
                                if (popupWindow4 != null) {
                                    popupWindow4.dismiss();
                                }
                            }
                            ta.a aVar11 = k3Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar11);
                            ((hj.g2) aVar11).f32604b.getChildAt(k3Var2.f48015l).performClick();
                            k3Var2.u();
                        }
                        return qy.b0.f48488a;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        k3 k3Var3 = this.f47981b;
                        h hVar8 = k3Var3.m;
                        if (hVar8 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow5 = hVar8.f59275k;
                        if (popupWindow5 != null && popupWindow5.isShowing()) {
                            h hVar9 = k3Var3.m;
                            if (hVar9 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow6 = hVar9.f59275k;
                            if (popupWindow6 != null) {
                                popupWindow6.dismiss();
                            }
                        }
                        k3Var3.u();
                        return qy.b0.f48488a;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        k3 k3Var4 = this.f47981b;
                        h hVar10 = k3Var4.m;
                        if (hVar10 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow7 = hVar10.f59275k;
                        if (popupWindow7 != null && popupWindow7.isShowing()) {
                            h hVar11 = k3Var4.m;
                            if (hVar11 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow8 = hVar11.f59275k;
                            if (popupWindow8 != null) {
                                popupWindow8.dismiss();
                            }
                        }
                        return qy.b0.f48488a;
                }
            }
        });
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        bq.z.b(((hj.g2) aVar4).f32608f, new fz.c(this) { // from class: qp.i3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k3 f47981b;

            {
                this.f47981b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                ta.a aVar5;
                ta.a aVar6;
                View it = (View) obj;
                switch (i11) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        k3 k3Var = this.f47981b;
                        if (k3Var.f48015l == -1) {
                            k3Var.f48015l = 0;
                            ta.a aVar7 = k3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar7);
                            ((hj.g2) aVar7).f32604b.getChildAt(k3Var.f48015l).performClick();
                        } else {
                            do {
                                int i14 = k3Var.f48015l + 1;
                                k3Var.f48015l = i14;
                                ta.a aVar8 = k3Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar8);
                                if (i14 == ((hj.g2) aVar8).f32604b.getChildCount()) {
                                    k3Var.f48015l = 0;
                                }
                                aVar5 = k3Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar5);
                            } while (((Word) hh.p0.g(((hj.g2) aVar5).f32604b, k3Var.f48015l, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word")).getWordType() == 1);
                            h hVar4 = k3Var.m;
                            if (hVar4 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow = hVar4.f59275k;
                            if (popupWindow != null && popupWindow.isShowing()) {
                                h hVar5 = k3Var.m;
                                if (hVar5 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow2 = hVar5.f59275k;
                                if (popupWindow2 != null) {
                                    popupWindow2.dismiss();
                                }
                            }
                            ta.a aVar9 = k3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar9);
                            ((hj.g2) aVar9).f32604b.getChildAt(k3Var.f48015l).performClick();
                            k3Var.u();
                        }
                        return qy.b0.f48488a;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        k3 k3Var2 = this.f47981b;
                        if (k3Var2.f48015l == -1) {
                            k3Var2.f48015l = 0;
                            ta.a aVar10 = k3Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar10);
                            ((hj.g2) aVar10).f32604b.getChildAt(k3Var2.f48015l).performClick();
                        } else {
                            do {
                                int i15 = k3Var2.f48015l - 1;
                                k3Var2.f48015l = i15;
                                if (i15 < 0) {
                                    ta.a aVar11 = k3Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar11);
                                    k3Var2.f48015l = ((hj.g2) aVar11).f32604b.getChildCount() - 1;
                                }
                                aVar6 = k3Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar6);
                            } while (((Word) hh.p0.g(((hj.g2) aVar6).f32604b, k3Var2.f48015l, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word")).getWordType() == 1);
                            h hVar6 = k3Var2.m;
                            if (hVar6 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow3 = hVar6.f59275k;
                            if (popupWindow3 != null && popupWindow3.isShowing()) {
                                h hVar7 = k3Var2.m;
                                if (hVar7 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow4 = hVar7.f59275k;
                                if (popupWindow4 != null) {
                                    popupWindow4.dismiss();
                                }
                            }
                            ta.a aVar12 = k3Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar12);
                            ((hj.g2) aVar12).f32604b.getChildAt(k3Var2.f48015l).performClick();
                            k3Var2.u();
                        }
                        return qy.b0.f48488a;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        k3 k3Var3 = this.f47981b;
                        h hVar8 = k3Var3.m;
                        if (hVar8 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow5 = hVar8.f59275k;
                        if (popupWindow5 != null && popupWindow5.isShowing()) {
                            h hVar9 = k3Var3.m;
                            if (hVar9 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow6 = hVar9.f59275k;
                            if (popupWindow6 != null) {
                                popupWindow6.dismiss();
                            }
                        }
                        k3Var3.u();
                        return qy.b0.f48488a;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        k3 k3Var4 = this.f47981b;
                        h hVar10 = k3Var4.m;
                        if (hVar10 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow7 = hVar10.f59275k;
                        if (popupWindow7 != null && popupWindow7.isShowing()) {
                            h hVar11 = k3Var4.m;
                            if (hVar11 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow8 = hVar11.f59275k;
                            if (popupWindow8 != null) {
                                popupWindow8.dismiss();
                            }
                        }
                        return qy.b0.f48488a;
                }
            }
        });
        ((jp.p0) this.f47881a).O(1);
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        ((hj.g2) aVar5).f32605c.setVisibility(8);
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        ((hj.g2) aVar6).f32606d.setVisibility(8);
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        LinearLayout rootParent = ((hj.g2) aVar7).f32609g;
        kotlin.jvm.internal.m.e(rootParent, "rootParent");
        final int i14 = 3;
        bq.z.b(rootParent, new fz.c(this) { // from class: qp.i3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k3 f47981b;

            {
                this.f47981b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                ta.a aVar8;
                ta.a aVar9;
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        k3 k3Var = this.f47981b;
                        if (k3Var.f48015l == -1) {
                            k3Var.f48015l = 0;
                            ta.a aVar10 = k3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar10);
                            ((hj.g2) aVar10).f32604b.getChildAt(k3Var.f48015l).performClick();
                        } else {
                            do {
                                int i15 = k3Var.f48015l + 1;
                                k3Var.f48015l = i15;
                                ta.a aVar11 = k3Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar11);
                                if (i15 == ((hj.g2) aVar11).f32604b.getChildCount()) {
                                    k3Var.f48015l = 0;
                                }
                                aVar8 = k3Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar8);
                            } while (((Word) hh.p0.g(((hj.g2) aVar8).f32604b, k3Var.f48015l, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word")).getWordType() == 1);
                            h hVar4 = k3Var.m;
                            if (hVar4 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow = hVar4.f59275k;
                            if (popupWindow != null && popupWindow.isShowing()) {
                                h hVar5 = k3Var.m;
                                if (hVar5 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow2 = hVar5.f59275k;
                                if (popupWindow2 != null) {
                                    popupWindow2.dismiss();
                                }
                            }
                            ta.a aVar12 = k3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar12);
                            ((hj.g2) aVar12).f32604b.getChildAt(k3Var.f48015l).performClick();
                            k3Var.u();
                        }
                        return qy.b0.f48488a;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        k3 k3Var2 = this.f47981b;
                        if (k3Var2.f48015l == -1) {
                            k3Var2.f48015l = 0;
                            ta.a aVar13 = k3Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar13);
                            ((hj.g2) aVar13).f32604b.getChildAt(k3Var2.f48015l).performClick();
                        } else {
                            do {
                                int i16 = k3Var2.f48015l - 1;
                                k3Var2.f48015l = i16;
                                if (i16 < 0) {
                                    ta.a aVar14 = k3Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar14);
                                    k3Var2.f48015l = ((hj.g2) aVar14).f32604b.getChildCount() - 1;
                                }
                                aVar9 = k3Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar9);
                            } while (((Word) hh.p0.g(((hj.g2) aVar9).f32604b, k3Var2.f48015l, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word")).getWordType() == 1);
                            h hVar6 = k3Var2.m;
                            if (hVar6 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow3 = hVar6.f59275k;
                            if (popupWindow3 != null && popupWindow3.isShowing()) {
                                h hVar7 = k3Var2.m;
                                if (hVar7 == null) {
                                    kotlin.jvm.internal.m.n("sentenceLayout");
                                    throw null;
                                }
                                PopupWindow popupWindow4 = hVar7.f59275k;
                                if (popupWindow4 != null) {
                                    popupWindow4.dismiss();
                                }
                            }
                            ta.a aVar15 = k3Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar15);
                            ((hj.g2) aVar15).f32604b.getChildAt(k3Var2.f48015l).performClick();
                            k3Var2.u();
                        }
                        return qy.b0.f48488a;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        k3 k3Var3 = this.f47981b;
                        h hVar8 = k3Var3.m;
                        if (hVar8 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow5 = hVar8.f59275k;
                        if (popupWindow5 != null && popupWindow5.isShowing()) {
                            h hVar9 = k3Var3.m;
                            if (hVar9 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow6 = hVar9.f59275k;
                            if (popupWindow6 != null) {
                                popupWindow6.dismiss();
                            }
                        }
                        k3Var3.u();
                        return qy.b0.f48488a;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        k3 k3Var4 = this.f47981b;
                        h hVar10 = k3Var4.m;
                        if (hVar10 == null) {
                            kotlin.jvm.internal.m.n("sentenceLayout");
                            throw null;
                        }
                        PopupWindow popupWindow7 = hVar10.f59275k;
                        if (popupWindow7 != null && popupWindow7.isShowing()) {
                            h hVar11 = k3Var4.m;
                            if (hVar11 == null) {
                                kotlin.jvm.internal.m.n("sentenceLayout");
                                throw null;
                            }
                            PopupWindow popupWindow8 = hVar11.f59275k;
                            if (popupWindow8 != null) {
                                popupWindow8.dismiss();
                            }
                        }
                        return qy.b0.f48488a;
                }
            }
        });
    }

    public final void u() {
        ((jp.p0) this.f47881a).O(5);
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.g2) aVar).f32605c.setVisibility(0);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.g2) aVar2).f32606d.setVisibility(0);
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.g2) aVar3).f32607e.setImageResource(R.drawable.ic_sentence_trans_show);
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        TextView textView = ((hj.g2) aVar4).f32611i;
        Sentence sentence = this.f48014k;
        if (sentence == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String translations = sentence.getTranslations();
        kotlin.jvm.internal.m.e(translations, "getTranslations(...)");
        textView.setText(translations);
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        ((hj.g2) aVar5).f32611i.setVisibility(0);
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        ((hj.g2) aVar6).f32610h.setVisibility(4);
    }
}
