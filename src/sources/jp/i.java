package jp;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bp.f4;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.UnitFinishStatus;
import com.lingo.lingoskill.object.UnitFinishStatusDao;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.learn.adapter.AbsDialogModelAdapter;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends qp.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f36482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f36483l;
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f36484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f36485o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AbsDialogModelAdapter f36486p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PopupWindow f36487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public rx.b f36488r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f36489s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayoutManager f36490t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f36491u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f36492v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final th.e f36493w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(mp.b bVar, String dialogRegex) {
        super(bVar, -1L, 1);
        kotlin.jvm.internal.m.f(dialogRegex, "dialogRegex");
        this.f36482k = dialogRegex;
        this.f36483l = 4;
        this.m = BuildConfig.VERSION_NAME;
        this.f36484n = new ArrayList();
        this.f36485o = new ArrayList();
        this.f36493w = new th.e(this.f47883c);
    }

    public static final void u(i iVar) {
        AbsDialogModelAdapter absDialogModelAdapter = iVar.f36486p;
        if (absDialogModelAdapter == null) {
            kotlin.jvm.internal.m.n("mAdapter");
            throw null;
        }
        absDialogModelAdapter.f22061j = false;
        iVar.f36492v = false;
        iVar.f36491u = 0;
        ta.a aVar = iVar.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.a) aVar).f32323f.setVisibility(0);
    }

    @Override // qp.a, hi.a
    public final boolean a() {
        return false;
    }

    @Override // hi.a
    public final String b() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // qp.a, hi.a
    public final String c() {
        return this.m;
    }

    @Override // qp.a, qp.d, hi.a
    public final void f() {
        super.f();
        this.f36493w.b();
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f36484n;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            Sentence sentence = (Sentence) obj;
            if (sentence.getItemType() != 1) {
                qy.q qVar = fv.b.f28186a;
                arrayList.add(new fv.a(2L, fv.b.H(sentence.getSentenceId()), fv.b.F(sentence.getSentenceId())));
            }
            for (Word word : sentence.getSentWordsNOMF()) {
                if (word.getWordType() != 1 && word.getWordType() != 3 && word.getWordType() != 4) {
                    word.getWordId();
                    word.toString();
                    qy.q qVar2 = fv.b.f28186a;
                    arrayList.add(new fv.a(2L, fv.b.Z(word.getWordId()), fv.b.V(word.getWordId())));
                }
            }
        }
        return arrayList;
    }

    @Override // hi.a
    public final int i() {
        return this.f36483l;
    }

    @Override // hi.a
    public final void j() {
        int i11 = 0;
        for (Object obj : new a5.f(24, false).t(this.f36482k, BuildConfig.VERSION_NAME)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                ns.o.V();
                throw null;
            }
            qi.a aVar = (qi.a) obj;
            Sentence sentenceE = ij.c.e(aVar.f47799b);
            if (sentenceE != null) {
                sentenceE.setModel(null);
                sentenceE.setHasChecked(false);
                this.f36484n.add(sentenceE);
                if (aVar.f47800c != 0) {
                    sentenceE.setModel(aVar);
                }
            }
            i11 = i12;
        }
    }

    @Override // hi.a
    public final void k() {
        Sentence sentence;
        FlexboxLayout flexboxLayout;
        AbsDialogModelAdapter absDialogModelAdapter = this.f36486p;
        if (absDialogModelAdapter == null) {
            kotlin.jvm.internal.m.n("mAdapter");
            throw null;
        }
        LinearLayoutManager linearLayoutManager = this.f36490t;
        if (linearLayoutManager == null) {
            kotlin.jvm.internal.m.n("linearLayoutManager");
            throw null;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        while (true) {
            int i11 = R.id.tv_middle;
            if (iFindFirstVisibleItemPosition >= iFindLastVisibleItemPosition) {
                break;
            }
            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition != null && (sentence = (Sentence) viewFindViewByPosition.getTag()) != null && (flexboxLayout = (FlexboxLayout) viewFindViewByPosition.findViewById(R.id.flex_sentence)) != null) {
                int childCount = flexboxLayout.getChildCount();
                int i12 = 1;
                while (i12 < childCount) {
                    View childAt = flexboxLayout.getChildAt(i12);
                    Word word = (Word) childAt.getTag();
                    TextView textView = (TextView) childAt.findViewById(R.id.tv_top);
                    TextView textView2 = (TextView) childAt.findViewById(i11);
                    if (word != null) {
                        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) textView2.getTag(R.id.tag_span_text);
                        textView.setVisibility(8);
                        textView2.setText(word.getWord());
                        if (spannableStringBuilder != null) {
                            textView2.setText(spannableStringBuilder);
                        }
                        int i13 = i12 - 1;
                        int iO = absDialogModelAdapter.o(i13, word, sentence);
                        int[] iArr = bq.r.f4959a;
                        if (bq.m.F()) {
                            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                            kotlin.jvm.internal.m.d(layoutParams, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
                            FlexboxLayout.LayoutParams layoutParams2 = (FlexboxLayout.LayoutParams) layoutParams;
                            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = iO;
                            childAt.setLayoutParams(layoutParams2);
                        } else {
                            List<Word> sentWordsNOMF = sentence.getSentWordsNOMF();
                            kotlin.jvm.internal.m.e(sentWordsNOMF, "getSentWordsNOMF(...)");
                            AbsDialogModelAdapter.n(i13, sentWordsNOMF, textView2);
                        }
                    }
                    i12++;
                    i11 = R.id.tv_middle;
                }
            }
            iFindFirstVisibleItemPosition++;
        }
        Iterator it = absDialogModelAdapter.f22058g.iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.m.e(next, "next(...)");
            ((zq.b) next).e();
        }
        Iterator it2 = absDialogModelAdapter.f22059h.iterator();
        kotlin.jvm.internal.m.e(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next2 = it2.next();
            kotlin.jvm.internal.m.e(next2, "next(...)");
            View view = (View) next2;
            Word word2 = (Word) view.getTag();
            if (word2 != null) {
                TextView textView3 = (TextView) view.findViewById(R.id.tv_top);
                TextView textView4 = (TextView) view.findViewById(R.id.tv_middle);
                TextView textView5 = (TextView) view.findViewById(R.id.tv_bottom);
                textView5.setVisibility(8);
                textView3.setVisibility(8);
                kotlin.jvm.internal.m.c(textView4);
                zq.c.e(word2, textView3, textView4, textView5, false);
            }
        }
    }

    @Override // qp.d
    public final fz.f n() {
        return e.f36464a;
    }

    @Override // qp.d
    public final void p() {
        ArrayList arrayList = this.f36484n;
        Object obj = arrayList.get(0);
        ArrayList arrayList2 = this.f36485o;
        arrayList2.add(obj);
        p0 p0Var = (p0) this.f47881a;
        p0Var.O(3);
        this.f36486p = new AbsDialogModelAdapter(arrayList2);
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        RecyclerView recyclerView = ((hj.a) aVar).f32324g;
        AbsDialogModelAdapter absDialogModelAdapter = this.f36486p;
        if (absDialogModelAdapter == null) {
            kotlin.jvm.internal.m.n("mAdapter");
            throw null;
        }
        recyclerView.setAdapter(absDialogModelAdapter);
        this.f36490t = new LinearLayoutManager(1);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        RecyclerView recyclerView2 = ((hj.a) aVar2).f32324g;
        LinearLayoutManager linearLayoutManager = this.f36490t;
        if (linearLayoutManager == null) {
            kotlin.jvm.internal.m.n("linearLayoutManager");
            throw null;
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        AbsDialogModelAdapter absDialogModelAdapter2 = this.f36486p;
        if (absDialogModelAdapter2 == null) {
            kotlin.jvm.internal.m.n("mAdapter");
            throw null;
        }
        absDialogModelAdapter2.f22055d = new d(this);
        absDialogModelAdapter2.f22056e = new a5.j(this, 23);
        absDialogModelAdapter2.f22060i = new a5.f(this, 17);
        Context context = this.f47883c;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        View viewInflate = layoutInflaterFrom.inflate(R.layout.foot_dialog_recycler_view, (ViewGroup) ((hj.a) aVar3).f32324g, false);
        kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        AbsDialogModelAdapter absDialogModelAdapter3 = this.f36486p;
        if (absDialogModelAdapter3 == null) {
            kotlin.jvm.internal.m.n("mAdapter");
            throw null;
        }
        absDialogModelAdapter3.addFooterView(frameLayout);
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        RecyclerView recyclerView3 = ((hj.a) aVar4).f32324g;
        recyclerView3.postDelayed(new b2.c(4, recyclerView3, new fp.f(20, frameLayout, this)), 0L);
        LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(context);
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        View viewInflate2 = layoutInflaterFrom2.inflate(R.layout.header_dialog_recycler_view, (ViewGroup) ((hj.a) aVar5).f32324g, false);
        AbsDialogModelAdapter absDialogModelAdapter4 = this.f36486p;
        if (absDialogModelAdapter4 == null) {
            kotlin.jvm.internal.m.n("mAdapter");
            throw null;
        }
        absDialogModelAdapter4.addHeaderView(viewInflate2);
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        RecyclerView recyclerView4 = ((hj.a) aVar6).f32324g;
        recyclerView4.postDelayed(new b2.c(4, recyclerView4, new a(this, 2)), 0L);
        p0Var.E(arrayList.size());
    }

    public final void v() {
        w(this.f36491u);
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.a) aVar).f32324g.addOnScrollListener(new androidx.recyclerview.widget.w(this, 1));
    }

    public final void w(int i11) {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        f fVar = new f(((hj.a) aVar).f32324g.getContext());
        fVar.setTargetPosition(i11);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((hj.a) aVar2).f32324g.getLayoutManager();
        if (linearLayoutManager != null) {
            linearLayoutManager.startSmoothScroll(fVar);
        }
    }

    public final void x(int i11) {
        Context context = this.f47883c;
        final int i12 = 0;
        if (i11 == 0) {
            ta.a aVar = this.f47886f;
            kotlin.jvm.internal.m.c(aVar);
            ((hj.a) aVar).f32322e.setEnabled(false);
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            ((hj.a) aVar2).f32322e.setText(R.string.continue_txt);
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            ((hj.a) aVar3).f32322e.setTextColor(j3.G(context, R.color.color_AFAFAF));
            return;
        }
        final int i13 = 1;
        if (i11 == 1) {
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            ((hj.a) aVar4).f32322e.setEnabled(true);
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            ((hj.a) aVar5).f32322e.setTextColor(j3.G(context, R.color.white));
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            ((hj.a) aVar6).f32322e.setText(R.string.continue_txt);
            ta.a aVar7 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar7);
            bq.z.b(((hj.a) aVar7).f32322e, new fz.c(this) { // from class: jp.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f36455b;

                {
                    this.f36455b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i12) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            i iVar = this.f36455b;
                            ArrayList arrayList = iVar.f36484n;
                            mp.b bVar = iVar.f47881a;
                            ArrayList arrayList2 = iVar.f36485o;
                            ((p0) bVar).S(arrayList2.size());
                            PopupWindow popupWindow = iVar.f36487q;
                            if (popupWindow != null) {
                                popupWindow.dismiss();
                            }
                            int size = arrayList2.size();
                            if (size < arrayList.size()) {
                                arrayList2.add(arrayList.get(size));
                                AbsDialogModelAdapter absDialogModelAdapter = iVar.f36486p;
                                if (absDialogModelAdapter == null) {
                                    kotlin.jvm.internal.m.n("mAdapter");
                                    throw null;
                                }
                                absDialogModelAdapter.notifyItemInserted(absDialogModelAdapter.getHeaderLayoutCount() + size);
                                ta.a aVar8 = iVar.f47886f;
                                kotlin.jvm.internal.m.c(aVar8);
                                RecyclerView recyclerView = ((hj.a) aVar8).f32324g;
                                recyclerView.postDelayed(new b2.c(4, recyclerView, new f4(iVar, size, 3)), 0L);
                            }
                            return qy.b0.f48488a;
                        case 1:
                            kotlin.jvm.internal.m.f(it, "it");
                            i iVar2 = this.f36455b;
                            ((ji.e) iVar2.f47881a).t().c("jxz_dialogue_practice_replay", new a(iVar2, 0));
                            ta.a aVar9 = iVar2.f47886f;
                            kotlin.jvm.internal.m.c(aVar9);
                            ((hj.a) aVar9).f32323f.setVisibility(8);
                            iVar2.f36492v = true;
                            iVar2.f36491u = 0;
                            AbsDialogModelAdapter absDialogModelAdapter2 = iVar2.f36486p;
                            if (absDialogModelAdapter2 == null) {
                                kotlin.jvm.internal.m.n("mAdapter");
                                throw null;
                            }
                            absDialogModelAdapter2.f22061j = true;
                            ta.a aVar10 = iVar2.f47886f;
                            kotlin.jvm.internal.m.c(aVar10);
                            ((hj.a) aVar10).f32324g.scrollToPosition(0);
                            iVar2.v();
                            break;
                            break;
                        case 2:
                            kotlin.jvm.internal.m.f(it, "it");
                            i iVar3 = this.f36455b;
                            Object obj2 = iVar3.f47881a;
                            ((ji.e) obj2).t().c("jxz_dialogue_practice_redo", new a(iVar3, 3));
                            ta.a aVar11 = iVar3.f47886f;
                            kotlin.jvm.internal.m.c(aVar11);
                            ((hj.a) aVar11).f32323f.setVisibility(8);
                            ArrayList arrayList3 = iVar3.f36485o;
                            ArrayList arrayList4 = iVar3.f36484n;
                            p0 p0Var = (p0) obj2;
                            p0Var.E(arrayList4.size());
                            Iterator it2 = arrayList4.iterator();
                            kotlin.jvm.internal.m.e(it2, "iterator(...)");
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                kotlin.jvm.internal.m.e(next, "next(...)");
                                ((Sentence) next).setHasChecked(false);
                            }
                            arrayList3.clear();
                            arrayList3.add(arrayList4.get(0));
                            p0Var.O(3);
                            AbsDialogModelAdapter absDialogModelAdapter3 = iVar3.f36486p;
                            if (absDialogModelAdapter3 == null) {
                                kotlin.jvm.internal.m.n("mAdapter");
                                throw null;
                            }
                            absDialogModelAdapter3.f22052a = null;
                            absDialogModelAdapter3.f22053b = null;
                            absDialogModelAdapter3.f22054c = null;
                            absDialogModelAdapter3.f22058g.clear();
                            absDialogModelAdapter3.f22059h.clear();
                            AbsDialogModelAdapter absDialogModelAdapter4 = iVar3.f36486p;
                            if (absDialogModelAdapter4 == null) {
                                kotlin.jvm.internal.m.n("mAdapter");
                                throw null;
                            }
                            absDialogModelAdapter4.notifyDataSetChanged();
                            ta.a aVar12 = iVar3.f47886f;
                            kotlin.jvm.internal.m.c(aVar12);
                            ((hj.a) aVar12).f32323f.setVisibility(8);
                            ta.a aVar13 = iVar3.f47886f;
                            kotlin.jvm.internal.m.c(aVar13);
                            RecyclerView recyclerView2 = ((hj.a) aVar13).f32324g;
                            recyclerView2.postDelayed(new b2.c(4, recyclerView2, new a(iVar3, 1)), 0L);
                            break;
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            i iVar4 = this.f36455b;
                            mp.b bVar2 = iVar4.f47881a;
                            ((ji.e) bVar2).t().c("jxz_dialogue_practice_finish", new a(iVar4, 4));
                            bVar2.g(true);
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            return;
        }
        final int i14 = 2;
        if (i11 != 2) {
            return;
        }
        ta.a aVar8 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar8);
        if (((hj.a) aVar8).f32323f.getVisibility() != 0) {
            ta.a aVar9 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar9);
            ((hj.a) aVar9).f32323f.setVisibility(0);
            ta.a aVar10 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar10);
            ((hj.a) aVar10).f32322e.setVisibility(8);
            ta.a aVar11 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar11);
            bq.z.b(((hj.a) aVar11).f32321d, new fz.c(this) { // from class: jp.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f36455b;

                {
                    this.f36455b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i13) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            i iVar = this.f36455b;
                            ArrayList arrayList = iVar.f36484n;
                            mp.b bVar = iVar.f47881a;
                            ArrayList arrayList2 = iVar.f36485o;
                            ((p0) bVar).S(arrayList2.size());
                            PopupWindow popupWindow = iVar.f36487q;
                            if (popupWindow != null) {
                                popupWindow.dismiss();
                            }
                            int size = arrayList2.size();
                            if (size < arrayList.size()) {
                                arrayList2.add(arrayList.get(size));
                                AbsDialogModelAdapter absDialogModelAdapter = iVar.f36486p;
                                if (absDialogModelAdapter == null) {
                                    kotlin.jvm.internal.m.n("mAdapter");
                                    throw null;
                                }
                                absDialogModelAdapter.notifyItemInserted(absDialogModelAdapter.getHeaderLayoutCount() + size);
                                ta.a aVar12 = iVar.f47886f;
                                kotlin.jvm.internal.m.c(aVar12);
                                RecyclerView recyclerView = ((hj.a) aVar12).f32324g;
                                recyclerView.postDelayed(new b2.c(4, recyclerView, new f4(iVar, size, 3)), 0L);
                            }
                            return qy.b0.f48488a;
                        case 1:
                            kotlin.jvm.internal.m.f(it, "it");
                            i iVar2 = this.f36455b;
                            ((ji.e) iVar2.f47881a).t().c("jxz_dialogue_practice_replay", new a(iVar2, 0));
                            ta.a aVar13 = iVar2.f47886f;
                            kotlin.jvm.internal.m.c(aVar13);
                            ((hj.a) aVar13).f32323f.setVisibility(8);
                            iVar2.f36492v = true;
                            iVar2.f36491u = 0;
                            AbsDialogModelAdapter absDialogModelAdapter2 = iVar2.f36486p;
                            if (absDialogModelAdapter2 == null) {
                                kotlin.jvm.internal.m.n("mAdapter");
                                throw null;
                            }
                            absDialogModelAdapter2.f22061j = true;
                            ta.a aVar14 = iVar2.f47886f;
                            kotlin.jvm.internal.m.c(aVar14);
                            ((hj.a) aVar14).f32324g.scrollToPosition(0);
                            iVar2.v();
                            break;
                            break;
                        case 2:
                            kotlin.jvm.internal.m.f(it, "it");
                            i iVar3 = this.f36455b;
                            Object obj2 = iVar3.f47881a;
                            ((ji.e) obj2).t().c("jxz_dialogue_practice_redo", new a(iVar3, 3));
                            ta.a aVar15 = iVar3.f47886f;
                            kotlin.jvm.internal.m.c(aVar15);
                            ((hj.a) aVar15).f32323f.setVisibility(8);
                            ArrayList arrayList3 = iVar3.f36485o;
                            ArrayList arrayList4 = iVar3.f36484n;
                            p0 p0Var = (p0) obj2;
                            p0Var.E(arrayList4.size());
                            Iterator it2 = arrayList4.iterator();
                            kotlin.jvm.internal.m.e(it2, "iterator(...)");
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                kotlin.jvm.internal.m.e(next, "next(...)");
                                ((Sentence) next).setHasChecked(false);
                            }
                            arrayList3.clear();
                            arrayList3.add(arrayList4.get(0));
                            p0Var.O(3);
                            AbsDialogModelAdapter absDialogModelAdapter3 = iVar3.f36486p;
                            if (absDialogModelAdapter3 == null) {
                                kotlin.jvm.internal.m.n("mAdapter");
                                throw null;
                            }
                            absDialogModelAdapter3.f22052a = null;
                            absDialogModelAdapter3.f22053b = null;
                            absDialogModelAdapter3.f22054c = null;
                            absDialogModelAdapter3.f22058g.clear();
                            absDialogModelAdapter3.f22059h.clear();
                            AbsDialogModelAdapter absDialogModelAdapter4 = iVar3.f36486p;
                            if (absDialogModelAdapter4 == null) {
                                kotlin.jvm.internal.m.n("mAdapter");
                                throw null;
                            }
                            absDialogModelAdapter4.notifyDataSetChanged();
                            ta.a aVar16 = iVar3.f47886f;
                            kotlin.jvm.internal.m.c(aVar16);
                            ((hj.a) aVar16).f32323f.setVisibility(8);
                            ta.a aVar17 = iVar3.f47886f;
                            kotlin.jvm.internal.m.c(aVar17);
                            RecyclerView recyclerView2 = ((hj.a) aVar17).f32324g;
                            recyclerView2.postDelayed(new b2.c(4, recyclerView2, new a(iVar3, 1)), 0L);
                            break;
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            i iVar4 = this.f36455b;
                            mp.b bVar2 = iVar4.f47881a;
                            ((ji.e) bVar2).t().c("jxz_dialogue_practice_finish", new a(iVar4, 4));
                            bVar2.g(true);
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            ta.a aVar12 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar12);
            bq.z.b(((hj.a) aVar12).f32320c, new fz.c(this) { // from class: jp.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f36455b;

                {
                    this.f36455b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i14) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            i iVar = this.f36455b;
                            ArrayList arrayList = iVar.f36484n;
                            mp.b bVar = iVar.f47881a;
                            ArrayList arrayList2 = iVar.f36485o;
                            ((p0) bVar).S(arrayList2.size());
                            PopupWindow popupWindow = iVar.f36487q;
                            if (popupWindow != null) {
                                popupWindow.dismiss();
                            }
                            int size = arrayList2.size();
                            if (size < arrayList.size()) {
                                arrayList2.add(arrayList.get(size));
                                AbsDialogModelAdapter absDialogModelAdapter = iVar.f36486p;
                                if (absDialogModelAdapter == null) {
                                    kotlin.jvm.internal.m.n("mAdapter");
                                    throw null;
                                }
                                absDialogModelAdapter.notifyItemInserted(absDialogModelAdapter.getHeaderLayoutCount() + size);
                                ta.a aVar13 = iVar.f47886f;
                                kotlin.jvm.internal.m.c(aVar13);
                                RecyclerView recyclerView = ((hj.a) aVar13).f32324g;
                                recyclerView.postDelayed(new b2.c(4, recyclerView, new f4(iVar, size, 3)), 0L);
                            }
                            return qy.b0.f48488a;
                        case 1:
                            kotlin.jvm.internal.m.f(it, "it");
                            i iVar2 = this.f36455b;
                            ((ji.e) iVar2.f47881a).t().c("jxz_dialogue_practice_replay", new a(iVar2, 0));
                            ta.a aVar14 = iVar2.f47886f;
                            kotlin.jvm.internal.m.c(aVar14);
                            ((hj.a) aVar14).f32323f.setVisibility(8);
                            iVar2.f36492v = true;
                            iVar2.f36491u = 0;
                            AbsDialogModelAdapter absDialogModelAdapter2 = iVar2.f36486p;
                            if (absDialogModelAdapter2 == null) {
                                kotlin.jvm.internal.m.n("mAdapter");
                                throw null;
                            }
                            absDialogModelAdapter2.f22061j = true;
                            ta.a aVar15 = iVar2.f47886f;
                            kotlin.jvm.internal.m.c(aVar15);
                            ((hj.a) aVar15).f32324g.scrollToPosition(0);
                            iVar2.v();
                            break;
                            break;
                        case 2:
                            kotlin.jvm.internal.m.f(it, "it");
                            i iVar3 = this.f36455b;
                            Object obj2 = iVar3.f47881a;
                            ((ji.e) obj2).t().c("jxz_dialogue_practice_redo", new a(iVar3, 3));
                            ta.a aVar16 = iVar3.f47886f;
                            kotlin.jvm.internal.m.c(aVar16);
                            ((hj.a) aVar16).f32323f.setVisibility(8);
                            ArrayList arrayList3 = iVar3.f36485o;
                            ArrayList arrayList4 = iVar3.f36484n;
                            p0 p0Var = (p0) obj2;
                            p0Var.E(arrayList4.size());
                            Iterator it2 = arrayList4.iterator();
                            kotlin.jvm.internal.m.e(it2, "iterator(...)");
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                kotlin.jvm.internal.m.e(next, "next(...)");
                                ((Sentence) next).setHasChecked(false);
                            }
                            arrayList3.clear();
                            arrayList3.add(arrayList4.get(0));
                            p0Var.O(3);
                            AbsDialogModelAdapter absDialogModelAdapter3 = iVar3.f36486p;
                            if (absDialogModelAdapter3 == null) {
                                kotlin.jvm.internal.m.n("mAdapter");
                                throw null;
                            }
                            absDialogModelAdapter3.f22052a = null;
                            absDialogModelAdapter3.f22053b = null;
                            absDialogModelAdapter3.f22054c = null;
                            absDialogModelAdapter3.f22058g.clear();
                            absDialogModelAdapter3.f22059h.clear();
                            AbsDialogModelAdapter absDialogModelAdapter4 = iVar3.f36486p;
                            if (absDialogModelAdapter4 == null) {
                                kotlin.jvm.internal.m.n("mAdapter");
                                throw null;
                            }
                            absDialogModelAdapter4.notifyDataSetChanged();
                            ta.a aVar17 = iVar3.f47886f;
                            kotlin.jvm.internal.m.c(aVar17);
                            ((hj.a) aVar17).f32323f.setVisibility(8);
                            ta.a aVar18 = iVar3.f47886f;
                            kotlin.jvm.internal.m.c(aVar18);
                            RecyclerView recyclerView2 = ((hj.a) aVar18).f32324g;
                            recyclerView2.postDelayed(new b2.c(4, recyclerView2, new a(iVar3, 1)), 0L);
                            break;
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            i iVar4 = this.f36455b;
                            mp.b bVar2 = iVar4.f47881a;
                            ((ji.e) bVar2).t().c("jxz_dialogue_practice_finish", new a(iVar4, 4));
                            bVar2.g(true);
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            ta.a aVar13 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar13);
            final int i15 = 3;
            bq.z.b(((hj.a) aVar13).f32319b, new fz.c(this) { // from class: jp.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f36455b;

                {
                    this.f36455b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i15) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            i iVar = this.f36455b;
                            ArrayList arrayList = iVar.f36484n;
                            mp.b bVar = iVar.f47881a;
                            ArrayList arrayList2 = iVar.f36485o;
                            ((p0) bVar).S(arrayList2.size());
                            PopupWindow popupWindow = iVar.f36487q;
                            if (popupWindow != null) {
                                popupWindow.dismiss();
                            }
                            int size = arrayList2.size();
                            if (size < arrayList.size()) {
                                arrayList2.add(arrayList.get(size));
                                AbsDialogModelAdapter absDialogModelAdapter = iVar.f36486p;
                                if (absDialogModelAdapter == null) {
                                    kotlin.jvm.internal.m.n("mAdapter");
                                    throw null;
                                }
                                absDialogModelAdapter.notifyItemInserted(absDialogModelAdapter.getHeaderLayoutCount() + size);
                                ta.a aVar14 = iVar.f47886f;
                                kotlin.jvm.internal.m.c(aVar14);
                                RecyclerView recyclerView = ((hj.a) aVar14).f32324g;
                                recyclerView.postDelayed(new b2.c(4, recyclerView, new f4(iVar, size, 3)), 0L);
                            }
                            return qy.b0.f48488a;
                        case 1:
                            kotlin.jvm.internal.m.f(it, "it");
                            i iVar2 = this.f36455b;
                            ((ji.e) iVar2.f47881a).t().c("jxz_dialogue_practice_replay", new a(iVar2, 0));
                            ta.a aVar15 = iVar2.f47886f;
                            kotlin.jvm.internal.m.c(aVar15);
                            ((hj.a) aVar15).f32323f.setVisibility(8);
                            iVar2.f36492v = true;
                            iVar2.f36491u = 0;
                            AbsDialogModelAdapter absDialogModelAdapter2 = iVar2.f36486p;
                            if (absDialogModelAdapter2 == null) {
                                kotlin.jvm.internal.m.n("mAdapter");
                                throw null;
                            }
                            absDialogModelAdapter2.f22061j = true;
                            ta.a aVar16 = iVar2.f47886f;
                            kotlin.jvm.internal.m.c(aVar16);
                            ((hj.a) aVar16).f32324g.scrollToPosition(0);
                            iVar2.v();
                            break;
                            break;
                        case 2:
                            kotlin.jvm.internal.m.f(it, "it");
                            i iVar3 = this.f36455b;
                            Object obj2 = iVar3.f47881a;
                            ((ji.e) obj2).t().c("jxz_dialogue_practice_redo", new a(iVar3, 3));
                            ta.a aVar17 = iVar3.f47886f;
                            kotlin.jvm.internal.m.c(aVar17);
                            ((hj.a) aVar17).f32323f.setVisibility(8);
                            ArrayList arrayList3 = iVar3.f36485o;
                            ArrayList arrayList4 = iVar3.f36484n;
                            p0 p0Var = (p0) obj2;
                            p0Var.E(arrayList4.size());
                            Iterator it2 = arrayList4.iterator();
                            kotlin.jvm.internal.m.e(it2, "iterator(...)");
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                kotlin.jvm.internal.m.e(next, "next(...)");
                                ((Sentence) next).setHasChecked(false);
                            }
                            arrayList3.clear();
                            arrayList3.add(arrayList4.get(0));
                            p0Var.O(3);
                            AbsDialogModelAdapter absDialogModelAdapter3 = iVar3.f36486p;
                            if (absDialogModelAdapter3 == null) {
                                kotlin.jvm.internal.m.n("mAdapter");
                                throw null;
                            }
                            absDialogModelAdapter3.f22052a = null;
                            absDialogModelAdapter3.f22053b = null;
                            absDialogModelAdapter3.f22054c = null;
                            absDialogModelAdapter3.f22058g.clear();
                            absDialogModelAdapter3.f22059h.clear();
                            AbsDialogModelAdapter absDialogModelAdapter4 = iVar3.f36486p;
                            if (absDialogModelAdapter4 == null) {
                                kotlin.jvm.internal.m.n("mAdapter");
                                throw null;
                            }
                            absDialogModelAdapter4.notifyDataSetChanged();
                            ta.a aVar18 = iVar3.f47886f;
                            kotlin.jvm.internal.m.c(aVar18);
                            ((hj.a) aVar18).f32323f.setVisibility(8);
                            ta.a aVar19 = iVar3.f47886f;
                            kotlin.jvm.internal.m.c(aVar19);
                            RecyclerView recyclerView2 = ((hj.a) aVar19).f32324g;
                            recyclerView2.postDelayed(new b2.c(4, recyclerView2, new a(iVar3, 1)), 0L);
                            break;
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            i iVar4 = this.f36455b;
                            mp.b bVar2 = iVar4.f47881a;
                            ((ji.e) bVar2).t().c("jxz_dialogue_practice_finish", new a(iVar4, 4));
                            bVar2.g(true);
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            int[] iArr = bq.r.f4959a;
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            String strK = b7.e0.k(((p0) this.f47881a).S, bq.m.r(cf.x.n().keyLanguage), "-");
            UnitFinishStatus unitFinishStatus = (UnitFinishStatus) ue.f.y().f34460u.load(strK);
            if (unitFinishStatus != null) {
                UnitFinishStatusDao unitFinishStatusDao = ue.f.y().f34460u;
                unitFinishStatus.setDialogPractice(Boolean.TRUE);
                unitFinishStatusDao.insertOrReplace(unitFinishStatus);
            } else {
                UnitFinishStatusDao unitFinishStatusDao2 = ue.f.y().f34460u;
                UnitFinishStatus unitFinishStatus2 = new UnitFinishStatus();
                unitFinishStatus2.setId(strK);
                unitFinishStatus2.setDialogPractice(Boolean.TRUE);
                unitFinishStatusDao2.insertOrReplace(unitFinishStatus2);
            }
        }
    }
}
