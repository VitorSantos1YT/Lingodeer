package qp;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Model_Sentence_060;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b2 extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Model_Sentence_060 f47843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f47844j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f47845k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f47846l;
    public final ArrayList m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f47847n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f47848o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o20.w f47849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public lp.b f47850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f47851r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public xx.f f47852s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f47853t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f47854u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f47855v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f47856w;

    public b2(mp.b bVar, long j11) {
        super(bVar, j11);
        this.f47844j = new ArrayList();
        this.f47846l = new ArrayList();
        this.m = new ArrayList();
        this.f47851r = -1;
        this.f47854u = true;
        this.f47855v = true;
        this.f47856w = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:35:0x010d  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e2, code lost:
    
        if (r10.getMarginStart() == (ff.h.l(8.0f) + r16.getWidth())) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean r(final qp.b2 r15, final android.view.View r16, android.graphics.Point r17, java.util.List r18, final android.widget.FrameLayout r19) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qp.b2.r(qp.b2, android.view.View, android.graphics.Point, java.util.List, android.widget.FrameLayout):boolean");
    }

    public static final void s(b2 b2Var) {
        ta.a aVar = b2Var.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.m2) aVar).f32918c.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar2 = b2Var.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            View childAt = ((hj.m2) aVar2).f32918c.getChildAt(i11);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.m.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(0);
                marginLayoutParams.setMarginEnd(0);
                childAt.setLayoutParams(marginLayoutParams);
                childAt.requestLayout();
            }
        }
    }

    public static final void t(b2 b2Var, FrameLayout frameLayout) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        kotlin.jvm.internal.m.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.getMarginStart() == 0 && marginLayoutParams.getMarginEnd() == 0) {
            return;
        }
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.setMarginEnd(0);
        frameLayout.setLayoutParams(marginLayoutParams);
    }

    public static final void u(b2 b2Var, FrameLayout frameLayout) {
        bq.z.b(frameLayout, new n0.w0(26, frameLayout, b2Var));
        b2Var.f47850q = new lp.b(b2Var, 19);
        com.bumptech.glide.d.I(frameLayout, (ViewGroup) b2Var.o().findViewById(R.id.flex_top));
        frameLayout.setOnTouchListener(new o(3, b2Var, frameLayout));
    }

    public final void A() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        TextView textView = ((hj.m2) aVar).f32920e;
        Model_Sentence_060 model_Sentence_060 = this.f47843i;
        if (model_Sentence_060 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        textView.setText(model_Sentence_060.getSentence().getTranslations());
        Model_Sentence_060 model_Sentence_061 = this.f47843i;
        if (model_Sentence_061 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_061.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        q(zq.c.b(sentence));
    }

    public final void B(LinearLayout linearLayout, Word word) {
        TextView textView = (TextView) linearLayout.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) linearLayout.findViewById(R.id.tv_bottom);
        kotlin.jvm.internal.m.c(textView2);
        ff.h.L(this.f47883c, textView2, 20);
        textView3.setVisibility(8);
        textView.setVisibility(8);
        boolean z11 = ((jp.p0) this.f47881a).Q;
        zq.c.e(word, textView, textView2, textView3, true);
    }

    @Override // hi.a
    public final boolean a() {
        Word word;
        ArrayList arrayList = new ArrayList();
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.m2) aVar).f32918c.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            FrameLayout frameLayout = (FrameLayout) ((hj.m2) aVar2).f32918c.getChildAt(i11);
            if (frameLayout != null && (word = (Word) frameLayout.getTag()) != null) {
                arrayList.add(word);
            }
        }
        int size = arrayList.size();
        ArrayList arrayList2 = this.m;
        boolean z11 = size == arrayList2.size();
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (i12 >= arrayList2.size() || (((Word) arrayList.get(i12)).getWordId() != ((Word) arrayList2.get(i12)).getWordId() && !kotlin.jvm.internal.m.a(((Word) arrayList.get(i12)).getWord(), ((Word) arrayList2.get(i12)).getWord()))) {
                z11 = false;
            }
        }
        Model_Sentence_060 model_Sentence_060 = this.f47843i;
        if (model_Sentence_060 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_060.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        gb.r.d(sentence, this.f47846l, this.f47881a);
        return z11;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_060 model_Sentence_060 = this.f47843i;
        if (model_Sentence_060 != null) {
            return fv.b.G(model_Sentence_060.getSentenceId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // hi.a
    public final String c() {
        return nv.p.m(this.f47882b, "1;", ";6");
    }

    @Override // qp.d, hi.a
    public final void f() {
        super.f();
        xx.f fVar = this.f47852s;
        if (fVar != null) {
            ux.b.a(fVar);
        }
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.m2) aVar).f32918c.setOnTouchListener(null);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.m2) aVar2).f32918c.setOnDragListener(null);
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.m2) aVar3).f32917b.setOnTouchListener(null);
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((hj.m2) aVar4).f32917b.setOnDragListener(null);
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_060 model_Sentence_060 = this.f47843i;
        if (model_Sentence_060 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strH = fv.b.H(model_Sentence_060.getSentenceId());
        Model_Sentence_060 model_Sentence_061 = this.f47843i;
        if (model_Sentence_061 != null) {
            arrayList.add(new fv.a(2L, strH, fv.b.F(model_Sentence_061.getSentenceId())));
            return arrayList;
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // qp.d, hi.a
    public final String h() {
        return this.f47885e;
    }

    @Override // hi.a
    public final int i() {
        return 1;
    }

    @Override // hi.a
    public final void j() throws NoSuchElemException {
        Model_Sentence_060 model_Sentence_060LoadFullObject = Model_Sentence_060.loadFullObject(this.f47882b);
        if (model_Sentence_060LoadFullObject == null) {
            throw new NoSuchElemException();
        }
        this.f47843i = model_Sentence_060LoadFullObject;
        if (model_Sentence_060LoadFullObject.getOptionList().size() == 0) {
            throw new NoSuchElemException();
        }
    }

    @Override // hi.a
    public final void k() {
        A();
        ArrayList arrayList = this.f47844j;
        if (arrayList.size() != 0) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                kotlin.jvm.internal.m.e(obj, "next(...)");
                View view = (View) obj;
                view.setVisibility(4);
                view.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                view.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
            }
            arrayList.clear();
        }
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.m2) aVar).f32917b.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            View childAt = ((hj.m2) aVar2).f32917b.getChildAt(i12);
            Word word = (Word) childAt.getTag();
            if (word != null) {
                z(childAt, word);
                childAt.requestLayout();
            }
        }
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.m2) aVar3).f32917b.requestLayout();
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        int childCount2 = ((hj.m2) aVar4).f32918c.getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            FrameLayout frameLayout = (FrameLayout) ((hj.m2) aVar5).f32918c.getChildAt(i13);
            if (frameLayout != null) {
                TextView textView = (TextView) frameLayout.findViewById(R.id.tv_top);
                TextView textView2 = (TextView) frameLayout.findViewById(R.id.tv_middle);
                TextView textView3 = (TextView) frameLayout.findViewById(R.id.tv_bottom);
                Word word2 = (Word) frameLayout.getTag();
                if (word2 != null) {
                    kotlin.jvm.internal.m.c(textView);
                    kotlin.jvm.internal.m.c(textView2);
                    kotlin.jvm.internal.m.c(textView3);
                    boolean z11 = ((jp.p0) this.f47881a).Q;
                    zq.c.e(word2, textView, textView2, textView3, true);
                }
                if (frameLayout.getChildAt(1) != null) {
                    View childAt2 = frameLayout.getChildAt(1);
                    kotlin.jvm.internal.m.d(childAt2, "null cannot be cast to non-null type android.widget.FrameLayout");
                    FrameLayout frameLayout2 = (FrameLayout) childAt2;
                    Word word3 = (Word) frameLayout2.getTag();
                    if (word3 != null) {
                        z(frameLayout2, word3);
                    }
                }
                frameLayout.requestLayout();
            }
        }
    }

    @Override // qp.d
    public final fz.f n() {
        return a2.f47822a;
    }

    @Override // qp.d
    public final void p() {
        Context context;
        b();
        Model_Sentence_060 model_Sentence_060 = this.f47843i;
        if (model_Sentence_060 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> optionList = model_Sentence_060.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        this.f47845k = optionList;
        ArrayList arrayList = this.m;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        Model_Sentence_060 model_Sentence_061 = this.f47843i;
        if (model_Sentence_061 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> sentWords = model_Sentence_061.getSentence().getSentWords();
        kotlin.jvm.internal.m.e(sentWords, "getSentWords(...)");
        arrayList2.addAll(sentWords);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.m.a(((Word) it.next()).getWord(), " ")) {
                it.remove();
            }
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = this.f47846l;
        arrayList3.clear();
        Model_Sentence_060 model_Sentence_062 = this.f47843i;
        if (model_Sentence_062 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> stemList = model_Sentence_062.getStemList();
        kotlin.jvm.internal.m.e(stemList, "getStemList(...)");
        arrayList3.addAll(stemList);
        ((jp.p0) this.f47881a).O(2);
        A();
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.m2) aVar).f32917b.removeAllViews();
        this.f47844j.clear();
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.m2) aVar2).f32918c.removeAllViews();
        int size = arrayList3.size();
        int i11 = 0;
        while (true) {
            context = this.f47883c;
            if (i11 >= size) {
                break;
            }
            Object obj = arrayList3.get(i11);
            i11++;
            Word word = (Word) obj;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_sentence_drag_top_item, (ViewGroup) ((hj.m2) aVar3).f32917b, false);
            kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) viewInflate;
            LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(R.id.ll_item);
            frameLayout.setTag(word);
            linearLayout.setTag(word);
            B(linearLayout, word);
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            ((hj.m2) aVar4).f32918c.addView(frameLayout);
        }
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        int childCount = ((hj.m2) aVar5).f32918c.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            View childAt = ((hj.m2) aVar6).f32918c.getChildAt(i12);
            kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) childAt).requestLayout();
        }
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        ((hj.m2) aVar7).f32918c.requestLayout();
        v();
        List<Word> list = this.f47845k;
        if (list == null) {
            kotlin.jvm.internal.m.n("options");
            throw null;
        }
        for (Word word2 : list) {
            LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(context);
            ta.a aVar8 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar8);
            View viewInflate2 = layoutInflaterFrom2.inflate(R.layout.item_sentence_drag_btm_item, (ViewGroup) ((hj.m2) aVar8).f32917b, false);
            kotlin.jvm.internal.m.d(viewInflate2, "null cannot be cast to non-null type android.widget.FrameLayout");
            View view = (FrameLayout) viewInflate2;
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.rl_item);
            view.setTag(word2);
            relativeLayout.setTag(word2);
            z(view, word2);
            ta.a aVar9 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar9);
            ((hj.m2) aVar9).f32917b.addView(view);
            this.f47849p = new o20.w(this, 12);
            com.bumptech.glide.d.I(relativeLayout, (ViewGroup) o().findViewById(R.id.flex_top));
            relativeLayout.setOnTouchListener(new o(2, this, relativeLayout));
        }
        ta.a aVar10 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar10);
        ((hj.m2) aVar10).f32919d.setVisibility(4);
        ef.e.B(o());
    }

    public final void v() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.m2) aVar).f32918c.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            View childAt = ((hj.m2) aVar2).f32918c.getChildAt(i11);
            kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) childAt;
            frameLayout.findViewById(R.id.arrow_left).setVisibility(0);
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            if (i11 == ((hj.m2) aVar3).f32918c.getChildCount() - 1) {
                frameLayout.findViewById(R.id.arrow_right).setVisibility(0);
            } else {
                frameLayout.findViewById(R.id.arrow_right).setVisibility(8);
            }
        }
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((hj.m2) aVar4).f32918c.requestLayout();
    }

    public final ArrayList w() {
        char c11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f47856w;
        arrayList2.clear();
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.m2) aVar).f32918c.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            View childAt = ((hj.m2) aVar2).f32918c.getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8 && childAt.getVisibility() != 4) {
                int[] iArr = new int[2];
                childAt.getLocationOnScreen(iArr);
                arrayList.add(iArr);
                childAt.setTag(R.id.tag_rects, null);
                arrayList2.add(childAt);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            int[] iArr2 = (int[]) arrayList.get(i12);
            ArrayList arrayList4 = new ArrayList();
            if (i12 == 0) {
                Rect rect = new Rect();
                rect.left = 0;
                rect.top = iArr2[1];
                rect.right = com.google.android.material.datepicker.d.c((View) arrayList2.get(i12), 2, iArr2[0]);
                rect.bottom = ((View) arrayList2.get(i12)).getHeight() + iArr2[1];
                arrayList4.add(rect);
            }
            int i13 = i12 - 1;
            if (i13 >= 0) {
                if (iArr2[1] > ((int[]) arrayList.get(i13))[1]) {
                    Rect rect2 = new Rect();
                    rect2.left = 0;
                    rect2.top = iArr2[1];
                    rect2.right = com.google.android.material.datepicker.d.c((View) arrayList2.get(i12), 2, iArr2[0]);
                    rect2.bottom = ((View) arrayList2.get(i12)).getHeight() + iArr2[1];
                    arrayList4.add(rect2);
                }
            }
            int i14 = i12 + 1;
            if (i14 < arrayList.size()) {
                int[] iArr3 = (int[]) arrayList.get(i14);
                if (iArr3[1] == iArr2[1]) {
                    Rect rect3 = new Rect();
                    c11 = 1;
                    rect3.left = com.google.android.material.datepicker.d.c((View) arrayList2.get(i12), 2, iArr2[0]);
                    rect3.right = com.google.android.material.datepicker.d.c((View) arrayList2.get(i14), 2, iArr3[0]);
                    int i15 = iArr2[1];
                    rect3.top = i15;
                    rect3.bottom = ((View) arrayList2.get(i12)).getHeight() + i15;
                    arrayList4.add(rect3);
                } else {
                    c11 = 1;
                    Rect rect4 = new Rect();
                    rect4.left = com.google.android.material.datepicker.d.c((View) arrayList2.get(i12), 2, iArr2[0]);
                    rect4.top = iArr2[1];
                    rect4.right = b7.e0.f(LingoSkillApplication.f21665b).widthPixels;
                    rect4.bottom = ((View) arrayList2.get(i12)).getHeight() + iArr2[1];
                    arrayList4.add(rect4);
                }
            } else {
                c11 = 1;
            }
            if (i12 == arrayList.size() - 1) {
                Rect rect5 = new Rect();
                rect5.left = com.google.android.material.datepicker.d.c((View) arrayList2.get(i12), 2, iArr2[0]);
                rect5.right = b7.e0.f(LingoSkillApplication.f21665b).widthPixels;
                int i16 = iArr2[c11];
                rect5.top = i16;
                rect5.bottom = ((View) arrayList2.get(i12)).getHeight() + i16;
                arrayList4.add(rect5);
            }
            ((View) arrayList2.get(i12)).setTag(R.id.tag_rects, arrayList4);
            i12 = i14;
        }
        int size2 = arrayList.size();
        for (int i17 = 0; i17 < size2; i17++) {
            int[] iArr4 = (int[]) arrayList.get(i17);
            if (i17 == 0) {
                ArrayList arrayList5 = new ArrayList();
                Rect rect6 = new Rect();
                rect6.left = 0;
                rect6.top = iArr4[1];
                rect6.right = com.google.android.material.datepicker.d.c((View) arrayList2.get(i17), 2, iArr4[0]);
                rect6.bottom = ((View) arrayList2.get(i17)).getHeight() + iArr4[1];
                arrayList5.add(rect6);
                arrayList3.add(arrayList5);
            }
            if (i17 > 0) {
                int i18 = i17 - 1;
                int[] iArr5 = (int[]) arrayList.get(i18);
                if (iArr5[1] != iArr4[1]) {
                    ArrayList arrayList6 = new ArrayList();
                    Rect rect7 = new Rect();
                    rect7.left = 0;
                    rect7.right = com.google.android.material.datepicker.d.c((View) arrayList2.get(i17), 2, iArr4[0]);
                    int i19 = iArr4[1];
                    rect7.top = i19;
                    rect7.bottom = ((View) arrayList2.get(i17)).getHeight() + i19;
                    Rect rect8 = new Rect();
                    rect8.left = com.google.android.material.datepicker.d.c((View) arrayList2.get(i18), 2, iArr5[0]);
                    rect8.top = iArr5[1];
                    rect8.right = b7.e0.f(LingoSkillApplication.f21665b).widthPixels;
                    rect8.bottom = ((View) arrayList2.get(i18)).getHeight() + iArr5[1];
                    arrayList6.add(rect7);
                    arrayList6.add(rect8);
                    arrayList3.add(arrayList6);
                } else {
                    ArrayList arrayList7 = new ArrayList();
                    Rect rect9 = new Rect();
                    rect9.left = com.google.android.material.datepicker.d.c((View) arrayList2.get(i18), 2, iArr5[0]);
                    rect9.right = com.google.android.material.datepicker.d.c((View) arrayList2.get(i17), 2, iArr4[0]);
                    int i21 = iArr4[1];
                    rect9.top = i21;
                    rect9.bottom = ((View) arrayList2.get(i17)).getHeight() + i21;
                    arrayList7.add(rect9);
                    arrayList3.add(arrayList7);
                }
            }
            if (i17 == arrayList.size() - 1) {
                ArrayList arrayList8 = new ArrayList();
                Rect rect10 = new Rect();
                rect10.left = com.google.android.material.datepicker.d.c((View) arrayList2.get(i17), 2, iArr4[0]);
                rect10.top = iArr4[1];
                rect10.right = b7.e0.f(LingoSkillApplication.f21665b).widthPixels;
                rect10.bottom = ((View) arrayList2.get(i17)).getHeight() + iArr4[1];
                arrayList8.add(rect10);
                arrayList3.add(arrayList8);
            }
        }
        return arrayList3;
    }

    public final void x() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.m2) aVar).f32918c.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            View childAt = ((hj.m2) aVar2).f32918c.getChildAt(i11);
            if (childAt != null && (childAt.getVisibility() == 8 || childAt.getVisibility() == 4)) {
                ta.a aVar3 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                ((hj.m2) aVar3).f32918c.removeView(childAt);
            }
        }
    }

    public final void y() {
        x();
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.m2) aVar).f32917b.getChildCount();
        boolean z11 = true;
        boolean z12 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            if (((hj.m2) aVar2).f32917b.getChildAt(i11).findViewById(R.id.rl_item).getVisibility() == 0) {
                z11 = false;
            } else {
                z12 = true;
            }
        }
        if (z11) {
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            ((hj.m2) aVar3).f32921f.setVisibility(8);
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            int childCount2 = ((hj.m2) aVar4).f32918c.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                ta.a aVar5 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                View childAt = ((hj.m2) aVar5).f32918c.getChildAt(i12);
                kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
                FrameLayout frameLayout = (FrameLayout) childAt;
                frameLayout.findViewById(R.id.arrow_left).setVisibility(4);
                frameLayout.findViewById(R.id.arrow_right).setVisibility(8);
            }
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            ((hj.m2) aVar6).f32918c.requestLayout();
        } else {
            ta.a aVar7 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar7);
            ((hj.m2) aVar7).f32921f.setVisibility(0);
        }
        mp.b bVar = this.f47881a;
        if (z12) {
            ((jp.p0) bVar).O(4);
        } else {
            ((jp.p0) bVar).O(2);
        }
    }

    public final void z(View view, Word word) {
        TextView textView = (TextView) view.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
        kotlin.jvm.internal.m.c(textView2);
        ff.h.L(this.f47883c, textView2, 20);
        textView3.setVisibility(8);
        textView.setVisibility(8);
        boolean z11 = ((jp.p0) this.f47881a).Q;
        zq.c.e(word, textView, textView2, textView3, true);
    }
}
