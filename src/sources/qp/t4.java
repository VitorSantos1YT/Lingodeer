package qp;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Model_Word_010;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class t4 extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Model_Word_010 f48204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f48205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f48206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f48207l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Long[] f48208n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f48209o;

    public t4(mp.b bVar, long j11) {
        super(bVar, j11);
        new ArrayList();
        this.f48207l = 24;
        this.m = 18;
        this.f48208n = new Long[]{2044L, 1767L, 440L, 2397L, 2398L, 2562L, 2563L, 2564L, 2565L, 441L, 2566L, 2567L, 2568L, 2569L, 2570L, 2396L};
        this.f48209o = nv.p.m(j11, "0;", ";9");
    }

    public static final void r(t4 t4Var, int i11, String str, SpannableString spannableString, int i12, boolean z11) {
        Object tag;
        Context context = t4Var.f47883c;
        ta.a aVar = t4Var.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        if (i11 >= ((hj.c3) aVar).f32457c.getChildCount()) {
            return;
        }
        kotlin.jvm.internal.m.f(context, "context");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(context.getColor(R.color.color_answer_btm));
        ta.a aVar2 = t4Var.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        Object tag2 = ((hj.c3) aVar2).f32457c.getChildAt(i11).getTag(R.id.bottom_view);
        if (tag2 == null || (tag = ((View) tag2).getTag()) == null) {
            return;
        }
        Word word = (Word) tag;
        if (!kotlin.jvm.internal.m.a(z11 ? word.getLuoma() : word.getWord(), str)) {
            foregroundColorSpan = new ForegroundColorSpan(context.getColor(R.color.color_wrong_high_light));
        }
        spannableString.setSpan(foregroundColorSpan, i12, str.length() + i12, 33);
    }

    public static void s(View view, int i11, int i12) {
        TextView textView = (TextView) view.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
        textView.setTextColor(i11);
        textView2.setTextColor(i12);
        textView3.setTextColor(i11);
    }

    @Override // hi.a
    public final boolean a() {
        Object tag;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        boolean z11 = ((hj.c3) aVar2).f32457c.getChildCount() == ((ArrayList) t()).size();
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        int childCount = ((hj.c3) aVar3).f32457c.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            Object tag2 = ((hj.c3) aVar4).f32457c.getChildAt(i11).getTag(R.id.bottom_view);
            if (tag2 != null && (tag = ((View) tag2).getTag()) != null) {
                Word word = (Word) tag;
                if (i11 >= ((ArrayList) t()).size() || !kotlin.jvm.internal.m.a(word.getWord(), ((Word) ((ArrayList) t()).get(i11)).getWord())) {
                    z11 = false;
                }
            }
        }
        mp.b bVar = this.f47881a;
        kotlin.jvm.internal.m.d(bVar, "null cannot be cast to non-null type com.lingo.lingoskill.ui.learn.BaseLessonTestFragment");
        ((jp.p0) bVar).f36528d0 = new lp.j(this, 21);
        return z11;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        return fv.b.Y(u().getWordId(), null, null);
    }

    @Override // hi.a
    public String c() {
        return this.f48209o;
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        arrayList.add(new fv.a(2L, fv.b.Z(u().getWordId()), fv.b.V(u().getWordId())));
        if (z()) {
            ArrayList arrayList2 = (ArrayList) v();
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                Word word = (Word) obj;
                if (word.getWordType() != 1 && !kotlin.jvm.internal.m.a(word.getWord(), " ")) {
                    qy.q qVar2 = fv.b.f28186a;
                    String luoma = word.getLuoma();
                    kotlin.jvm.internal.m.e(luoma, "getLuoma(...)");
                    String strK0 = fv.b.k0(luoma);
                    String luoma2 = word.getLuoma();
                    kotlin.jvm.internal.m.e(luoma2, "getLuoma(...)");
                    arrayList.add(new fv.a(1L, strK0, fv.b.j0(luoma2)));
                }
            }
        }
        return arrayList;
    }

    @Override // hi.a
    public final int i() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008d  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:33:0x0135  */
    /* JADX WARN: Code duplicated, block: B:36:0x014b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0173  */
    /* JADX WARN: Code duplicated, block: B:55:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0194 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x016e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // hi.a
    public void j() throws NoSuchElemException {
        ArrayList arrayListH;
        int size;
        int i11;
        Word word;
        ArrayList arrayList;
        int size2;
        boolean z11;
        int i12;
        String lowerCase;
        String lowerCase2;
        String word2;
        Model_Word_010 model_Word_010LoadFullObject = Model_Word_010.loadFullObject(this.f47882b);
        if (model_Word_010LoadFullObject == null) {
            throw new NoSuchElemException();
        }
        this.f48204i = model_Word_010LoadFullObject;
        if (u().getOptionList().size() == 0) {
            throw new NoSuchElemException();
        }
        Word word3 = u().getWord();
        kotlin.jvm.internal.m.e(word3, "getWord(...)");
        this.f48205j = qi.b.h(word3);
        qy.q qVar = fv.b.f28186a;
        fv.b.Y(u().getWordId(), null, null);
        this.f48206k = new ArrayList();
        List listV = v();
        Word word4 = u().getWord();
        kotlin.jvm.internal.m.e(word4, "getWord(...)");
        ((ArrayList) listV).addAll(qi.b.h(word4));
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().keyLanguage == 12 || cf.x.n().keyLanguage == 1) {
            Long[] lArr = this.f48208n;
            if (ns.o.L(Arrays.copyOf(lArr, lArr.length)).contains(Long.valueOf(u().getWordId()))) {
                for (Word word5 : u().getOptionList()) {
                    if (word5.getWordId() != u().getWordId()) {
                        arrayListH = qi.b.h(word5);
                        size = arrayListH.size();
                        i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayListH.get(i11);
                            i11++;
                            word = (Word) obj;
                            arrayList = (ArrayList) v();
                            size2 = arrayList.size();
                            z11 = false;
                            i12 = 0;
                            while (i12 < size2) {
                                Object obj2 = arrayList.get(i12);
                                i12++;
                                Word word6 = (Word) obj2;
                                String word7 = word6.getWord();
                                kotlin.jvm.internal.m.e(word7, "getWord(...)");
                                int[] iArr = bq.r.f4959a;
                                lowerCase = word7.toLowerCase(bq.m.p());
                                kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                                String word8 = word.getWord();
                                kotlin.jvm.internal.m.e(word8, "getWord(...)");
                                lowerCase2 = word8.toLowerCase(bq.m.p());
                                kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                                if (!lowerCase.equals(lowerCase2)) {
                                    word2 = word.getWord();
                                    kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                    if (oz.q.i1(word2).toString().length() == 0 && (!ry.l.D(new String[]{"â", "a"}, word6.getWord()) || !ry.l.D(new String[]{"â", "a"}, word.getWord()))) {
                                    }
                                }
                                z11 = true;
                            }
                            if (z11 && ((ArrayList) v()).size() < ((ArrayList) t()).size() + 2) {
                                ((ArrayList) v()).add(word);
                            }
                        }
                    }
                }
            } else {
                int[] iArr2 = bq.r.f4959a;
                if ((bq.m.F() && ((ArrayList) v()).size() <= 3) || (!bq.m.F() && ((ArrayList) v()).size() <= 6)) {
                    while (r1.hasNext()) {
                        if (word5.getWordId() != u().getWordId()) {
                            arrayListH = qi.b.h(word5);
                            size = arrayListH.size();
                            i11 = 0;
                            while (i11 < size) {
                                Object obj3 = arrayListH.get(i11);
                                i11++;
                                word = (Word) obj3;
                                arrayList = (ArrayList) v();
                                size2 = arrayList.size();
                                z11 = false;
                                i12 = 0;
                                while (i12 < size2) {
                                    Object obj4 = arrayList.get(i12);
                                    i12++;
                                    Word word9 = (Word) obj4;
                                    String word10 = word9.getWord();
                                    kotlin.jvm.internal.m.e(word10, "getWord(...)");
                                    int[] iArr3 = bq.r.f4959a;
                                    lowerCase = word10.toLowerCase(bq.m.p());
                                    kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                                    String word11 = word.getWord();
                                    kotlin.jvm.internal.m.e(word11, "getWord(...)");
                                    lowerCase2 = word11.toLowerCase(bq.m.p());
                                    kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                                    if (!lowerCase.equals(lowerCase2)) {
                                        word2 = word.getWord();
                                        kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                        if (oz.q.i1(word2).toString().length() == 0) {
                                        }
                                    }
                                    z11 = true;
                                }
                                if (z11) {
                                }
                            }
                        }
                    }
                }
            }
        } else {
            int[] iArr4 = bq.r.f4959a;
            if (bq.m.F()) {
                while (r1.hasNext()) {
                    if (word5.getWordId() != u().getWordId()) {
                        arrayListH = qi.b.h(word5);
                        size = arrayListH.size();
                        i11 = 0;
                        while (i11 < size) {
                            Object obj5 = arrayListH.get(i11);
                            i11++;
                            word = (Word) obj5;
                            arrayList = (ArrayList) v();
                            size2 = arrayList.size();
                            z11 = false;
                            i12 = 0;
                            while (i12 < size2) {
                                Object obj6 = arrayList.get(i12);
                                i12++;
                                Word word12 = (Word) obj6;
                                String word13 = word12.getWord();
                                kotlin.jvm.internal.m.e(word13, "getWord(...)");
                                int[] iArr5 = bq.r.f4959a;
                                lowerCase = word13.toLowerCase(bq.m.p());
                                kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                                String word14 = word.getWord();
                                kotlin.jvm.internal.m.e(word14, "getWord(...)");
                                lowerCase2 = word14.toLowerCase(bq.m.p());
                                kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                                if (!lowerCase.equals(lowerCase2)) {
                                    word2 = word.getWord();
                                    kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                    if (oz.q.i1(word2).toString().length() == 0) {
                                    }
                                }
                                z11 = true;
                            }
                            if (z11) {
                            }
                        }
                    }
                }
            } else {
                while (r1.hasNext()) {
                    if (word5.getWordId() != u().getWordId()) {
                        arrayListH = qi.b.h(word5);
                        size = arrayListH.size();
                        i11 = 0;
                        while (i11 < size) {
                            Object obj7 = arrayListH.get(i11);
                            i11++;
                            word = (Word) obj7;
                            arrayList = (ArrayList) v();
                            size2 = arrayList.size();
                            z11 = false;
                            i12 = 0;
                            while (i12 < size2) {
                                Object obj8 = arrayList.get(i12);
                                i12++;
                                Word word15 = (Word) obj8;
                                String word16 = word15.getWord();
                                kotlin.jvm.internal.m.e(word16, "getWord(...)");
                                int[] iArr6 = bq.r.f4959a;
                                lowerCase = word16.toLowerCase(bq.m.p());
                                kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                                String word17 = word.getWord();
                                kotlin.jvm.internal.m.e(word17, "getWord(...)");
                                lowerCase2 = word17.toLowerCase(bq.m.p());
                                kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                                if (!lowerCase.equals(lowerCase2)) {
                                    word2 = word.getWord();
                                    kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                    if (oz.q.i1(word2).toString().length() == 0) {
                                    }
                                }
                                z11 = true;
                            }
                            if (z11) {
                            }
                        }
                    }
                }
            }
        }
        Collections.shuffle(v());
    }

    @Override // hi.a
    public final void k() {
        y();
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        FlexboxLayout flexboxLayout = ((hj.c3) aVar).f32456b;
        flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new q4(this, 0)), 0L);
    }

    @Override // qp.d
    public final fz.f n() {
        return s4.f48195a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0120  */
    @Override // qp.d
    public final void p() {
        Context context;
        jp.p0 p0Var = (jp.p0) this.f47881a;
        final int i11 = 0;
        p0Var.O(0);
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.c3) aVar).f32461g.setTextSize(this.f48207l);
        y();
        ArrayList arrayList = (ArrayList) t();
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            int i13 = 4;
            context = this.f47883c;
            if (i12 >= size) {
                break;
            }
            Object obj = arrayList.get(i12);
            i12++;
            Word word = (Word) obj;
            int[] iArr = bq.r.f4959a;
            int i14 = bq.m.F() ? R.layout.item_cn_word_abs_model_6_elem : R.layout.item_cn_word_abs_model_6_elem_en;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            View viewInflate = layoutInflaterFrom.inflate(i14, (ViewGroup) ((hj.c3) aVar2).f32457c, false);
            ((TextView) viewInflate.findViewById(R.id.tv_word)).setText(word.getWord());
            bq.z.b(viewInflate, new n2(i13, viewInflate, this));
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            ((hj.c3) aVar3).f32457c.addView(viewInflate);
        }
        ArrayList arrayList2 = (ArrayList) v();
        int size2 = arrayList2.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList2.get(i15);
            i15++;
            Word word2 = (Word) obj2;
            int[] iArr2 = bq.r.f4959a;
            int i16 = !bq.m.F() ? R.layout.item_word_card_framlayout_autofit_en : R.layout.item_word_card_framlayout_autofit;
            LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(context);
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            View viewInflate2 = layoutInflaterFrom2.inflate(i16, (ViewGroup) ((hj.c3) aVar4).f32456b, false);
            kotlin.jvm.internal.m.d(viewInflate2, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) viewInflate2;
            CardView cardView = (CardView) frameLayout.findViewById(R.id.card_item);
            kotlin.jvm.internal.m.f(context, "context");
            cardView.setCardBackgroundColor(context.getColor(R.color.white));
            float fL = ff.h.l(2.0f);
            WeakHashMap weakHashMap = z4.s0.f58893a;
            z4.j0.k(cardView, fL);
            frameLayout.setBackgroundResource(R.drawable.item_leave);
            cardView.setTag(word2);
            x(frameLayout, word2);
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            ((hj.c3) aVar5).f32456b.addView(frameLayout);
            bq.z.b(cardView, new pr.a0(this, word2, cardView, 10));
        }
        Env env = this.f47884d;
        final int i17 = 1;
        if (env.isAudioModel) {
            if (p0Var.Q) {
                int[] iArr3 = bq.r.f4959a;
                if (bq.m.F()) {
                    ta.a aVar6 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar6);
                    bq.z.b((ImageView) ((hj.c3) aVar6).f32458d.f32490c, new fz.c(this) { // from class: qp.r4

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ t4 f48154b;

                        {
                            this.f48154b = this;
                        }

                        @Override // fz.c
                        public final Object invoke(Object obj3) {
                            View it = (View) obj3;
                            switch (i11) {
                                case 0:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    t4 t4Var = this.f48154b;
                                    mp.b bVar = t4Var.f47881a;
                                    String strB = t4Var.b();
                                    ta.a aVar7 = t4Var.f47886f;
                                    kotlin.jvm.internal.m.c(aVar7);
                                    ImageView ivAudio = (ImageView) ((hj.c3) aVar7).f32458d.f32490c;
                                    kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                                    ((jp.p0) bVar).H(ivAudio, strB);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    ta.a aVar8 = this.f48154b.f47886f;
                                    kotlin.jvm.internal.m.c(aVar8);
                                    ((ImageView) ((hj.c3) aVar8).f32458d.f32490c).performClick();
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    });
                    ta.a aVar7 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar7);
                    ConstraintLayout llParent = ((hj.c3) aVar7).f32459e;
                    kotlin.jvm.internal.m.e(llParent, "llParent");
                    bq.z.b(llParent, new fz.c(this) { // from class: qp.r4

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ t4 f48154b;

                        {
                            this.f48154b = this;
                        }

                        @Override // fz.c
                        public final Object invoke(Object obj3) {
                            View it = (View) obj3;
                            switch (i17) {
                                case 0:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    t4 t4Var = this.f48154b;
                                    mp.b bVar = t4Var.f47881a;
                                    String strB = t4Var.b();
                                    ta.a aVar8 = t4Var.f47886f;
                                    kotlin.jvm.internal.m.c(aVar8);
                                    ImageView ivAudio = (ImageView) ((hj.c3) aVar8).f32458d.f32490c;
                                    kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                                    ((jp.p0) bVar).H(ivAudio, strB);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    ta.a aVar9 = this.f48154b.f47886f;
                                    kotlin.jvm.internal.m.c(aVar9);
                                    ((ImageView) ((hj.c3) aVar9).f32458d.f32490c).performClick();
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    });
                } else {
                    ta.a aVar8 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar8);
                    ((ImageView) ((hj.c3) aVar8).f32458d.f32490c).setVisibility(8);
                }
            } else {
                ta.a aVar9 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar9);
                bq.z.b((ImageView) ((hj.c3) aVar9).f32458d.f32490c, new fz.c(this) { // from class: qp.r4

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ t4 f48154b;

                    {
                        this.f48154b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj3) {
                        View it = (View) obj3;
                        switch (i11) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                t4 t4Var = this.f48154b;
                                mp.b bVar = t4Var.f47881a;
                                String strB = t4Var.b();
                                ta.a aVar10 = t4Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar10);
                                ImageView ivAudio = (ImageView) ((hj.c3) aVar10).f32458d.f32490c;
                                kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                                ((jp.p0) bVar).H(ivAudio, strB);
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "it");
                                ta.a aVar11 = this.f48154b.f47886f;
                                kotlin.jvm.internal.m.c(aVar11);
                                ((ImageView) ((hj.c3) aVar11).f32458d.f32490c).performClick();
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
                ta.a aVar10 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar10);
                ConstraintLayout llParent2 = ((hj.c3) aVar10).f32459e;
                kotlin.jvm.internal.m.e(llParent2, "llParent");
                bq.z.b(llParent2, new fz.c(this) { // from class: qp.r4

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ t4 f48154b;

                    {
                        this.f48154b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj3) {
                        View it = (View) obj3;
                        switch (i17) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                t4 t4Var = this.f48154b;
                                mp.b bVar = t4Var.f47881a;
                                String strB = t4Var.b();
                                ta.a aVar11 = t4Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar11);
                                ImageView ivAudio = (ImageView) ((hj.c3) aVar11).f32458d.f32490c;
                                kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                                ((jp.p0) bVar).H(ivAudio, strB);
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "it");
                                ta.a aVar12 = this.f48154b.f47886f;
                                kotlin.jvm.internal.m.c(aVar12);
                                ((ImageView) ((hj.c3) aVar12).f32458d.f32490c).performClick();
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
            }
            if (env.isTestAutoPlayAudio) {
                ta.a aVar11 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar11);
                ((ImageView) ((hj.c3) aVar11).f32458d.f32490c).performClick();
            }
        } else {
            ta.a aVar12 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar12);
            ((ImageView) ((hj.c3) aVar12).f32458d.f32490c).setVisibility(8);
        }
        ef.e.B(o());
        ta.a aVar13 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar13);
        FlexboxLayout flexboxLayout = ((hj.c3) aVar13).f32456b;
        flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new q4(this, 1)), 0L);
    }

    public final List t() {
        ArrayList arrayList = this.f48205j;
        if (arrayList != null) {
            return arrayList;
        }
        kotlin.jvm.internal.m.n("mAnswers");
        throw null;
    }

    public final Model_Word_010 u() {
        Model_Word_010 model_Word_010 = this.f48204i;
        if (model_Word_010 != null) {
            return model_Word_010;
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    public final List v() {
        ArrayList arrayList = this.f48206k;
        if (arrayList != null) {
            return arrayList;
        }
        kotlin.jvm.internal.m.n("mOptions");
        throw null;
    }

    public void w(Word word, TextView textView, TextView textView2, TextView textView3) {
        kotlin.jvm.internal.m.f(word, "word");
        textView2.setVisibility(8);
        textView3.setVisibility(8);
        textView.setText(word.getWord());
        int[] iArr = bq.r.f4959a;
        bq.m.J(textView);
    }

    public final void x(View view, Word word) {
        TextView textView = (TextView) view.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
        textView3.setVisibility(8);
        textView.setVisibility(8);
        textView2.setTextSize(this.m);
        textView.setTextSize(8.0f);
        textView3.setTextSize(8.0f);
        w(word, textView2, textView, textView3);
        ef.e.B(view);
    }

    public void y() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.c3) aVar).f32460f.setVisibility(8);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().keyLanguage == 12 || cf.x.n().keyLanguage == 1) {
            switch (this.f47884d.jsDisPlay) {
                case 0:
                    ta.a aVar2 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    ((hj.c3) aVar2).f32461g.setText(u().getWord().getZhuyin());
                    break;
                case 1:
                    ta.a aVar3 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar3);
                    ((hj.c3) aVar3).f32461g.setText(u().getWord().getZhuyin());
                    break;
                case 2:
                    ta.a aVar4 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar4);
                    ((hj.c3) aVar4).f32461g.setText(u().getWord().getLuoma());
                    break;
                case 3:
                    ta.a aVar5 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar5);
                    ((hj.c3) aVar5).f32461g.setText(u().getWord().getZhuyin());
                    break;
                case 4:
                    ta.a aVar6 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar6);
                    ((hj.c3) aVar6).f32461g.setText(u().getWord().getLuoma());
                    break;
                case 5:
                    ta.a aVar7 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar7);
                    ((hj.c3) aVar7).f32460f.setVisibility(0);
                    ta.a aVar8 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar8);
                    ((hj.c3) aVar8).f32461g.setText(u().getWord().getZhuyin());
                    ta.a aVar9 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar9);
                    ((hj.c3) aVar9).f32460f.setText(u().getWord().getLuoma());
                    break;
                case 6:
                    ta.a aVar10 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar10);
                    ((hj.c3) aVar10).f32460f.setVisibility(0);
                    ta.a aVar11 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar11);
                    ((hj.c3) aVar11).f32461g.setText(u().getWord().getZhuyin());
                    ta.a aVar12 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar12);
                    ((hj.c3) aVar12).f32460f.setText(u().getWord().getLuoma());
                    break;
            }
        } else {
            int[] iArr = bq.r.f4959a;
            if (bq.m.F()) {
                ta.a aVar13 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar13);
                ((hj.c3) aVar13).f32461g.setText(u().getWord().getLuoma());
            } else {
                ta.a aVar14 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar14);
                ((hj.c3) aVar14).f32461g.setText(u().getWord().getTranslations());
            }
        }
        Word word = u().getWord();
        kotlin.jvm.internal.m.e(word, "getWord(...)");
        q(zq.c.c(word));
    }

    public boolean z() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return cf.x.n().keyLanguage == 11 || cf.x.n().keyLanguage == 0 || cf.x.n().keyLanguage == 13 || cf.x.n().keyLanguage == 2;
    }
}
