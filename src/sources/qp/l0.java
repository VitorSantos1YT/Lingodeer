package qp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Model_Word_010;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Model_Word_010 f48023j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f48024k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f48025l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f48026n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f48027o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Long[] f48028p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f48029q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(mp.b bVar, long j11, int i11) {
        super(bVar, j11);
        this.f48022i = i11;
        switch (i11) {
            case 1:
                super(bVar, j11);
                this.m = 18;
                int[] iArr = bq.r.f4959a;
                this.f48027o = bq.m.b();
                this.f48028p = new Long[]{2044L, 1767L, 440L, 2397L, 2398L, 2562L, 2563L, 2564L, 2565L, 441L, 2566L, 2567L, 2568L, 2569L, 2570L, 2396L};
                this.f48029q = nv.p.m(j11, "0;", ";9");
                break;
            default:
                this.m = 18;
                int[] iArr2 = bq.r.f4959a;
                this.f48027o = bq.m.b();
                this.f48028p = new Long[]{2044L, 1767L, 440L, 2397L, 2398L, 2562L, 2563L, 2564L, 2565L, 441L, 2566L, 2567L, 2568L, 2569L, 2570L, 2396L};
                this.f48029q = nv.p.m(j11, "0;", ";9");
                break;
        }
    }

    public static void r(View view, int i11, int i12) {
        TextView textView = (TextView) view.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
        textView.setTextColor(i11);
        textView2.setTextColor(i12);
        textView3.setTextColor(i11);
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
        Object tag2;
        int i11 = this.f48022i;
        Env env = this.f47884d;
        List list = this.f48027o;
        switch (i11) {
            case 0:
                ta.a aVar = this.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ta.a aVar2 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                int childCount = ((hj.r1) aVar2).f33208d.getChildCount();
                ArrayList arrayList = this.f48024k;
                if (arrayList == null) {
                    kotlin.jvm.internal.m.n("mAnswers");
                    throw null;
                }
                boolean z11 = childCount == arrayList.size();
                ta.a aVar3 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                int childCount2 = ((hj.r1) aVar3).f33208d.getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    ta.a aVar4 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar4);
                    Object tag3 = ((hj.r1) aVar4).f33208d.getChildAt(i12).getTag(R.id.bottom_view);
                    if (tag3 != null && (tag = ((View) tag3).getTag()) != null) {
                        String word = ((Word) tag).getWord();
                        ArrayList arrayList2 = this.f48024k;
                        if (arrayList2 == null) {
                            kotlin.jvm.internal.m.n("mAnswers");
                            throw null;
                        }
                        if (!kotlin.jvm.internal.m.a(word, ((Word) arrayList2.get(i12)).getWord())) {
                            z11 = false;
                        }
                    }
                }
                if (z11) {
                    ta.a aVar5 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar5);
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ((hj.r1) aVar5).f33206b.f33677e;
                    Collection collection = (Collection) list.get(1);
                    jz.d dVar = jz.e.f37397a;
                    lottieAnimationView.setAnimation(((Number) ry.m.I0(collection)).intValue());
                } else {
                    ta.a aVar6 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar6);
                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ((hj.r1) aVar6).f33206b.f33677e;
                    Collection collection2 = (Collection) list.get(2);
                    jz.d dVar2 = jz.e.f37397a;
                    lottieAnimationView2.setAnimation(((Number) ry.m.I0(collection2)).intValue());
                }
                if (env.showAnim) {
                    ta.a aVar7 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar7);
                    ((LottieAnimationView) ((hj.r1) aVar7).f33206b.f33677e).d(new f(this, 5));
                } else {
                    ta.a aVar8 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar8);
                    ((LottieAnimationView) ((hj.r1) aVar8).f33206b.f33676d).e();
                }
                return z11;
            default:
                ta.a aVar9 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar9);
                ta.a aVar10 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar10);
                int childCount3 = ((hj.s1) aVar10).f33259d.getChildCount();
                ArrayList arrayList3 = this.f48024k;
                if (arrayList3 == null) {
                    kotlin.jvm.internal.m.n("mAnswers");
                    throw null;
                }
                boolean z12 = childCount3 == arrayList3.size();
                ta.a aVar11 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar11);
                int childCount4 = ((hj.s1) aVar11).f33259d.getChildCount();
                for (int i13 = 0; i13 < childCount4; i13++) {
                    ta.a aVar12 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar12);
                    Object tag4 = ((hj.s1) aVar12).f33259d.getChildAt(i13).getTag(R.id.bottom_view);
                    if (tag4 != null && (tag2 = ((View) tag4).getTag()) != null) {
                        String word2 = ((Word) tag2).getWord();
                        ArrayList arrayList4 = this.f48024k;
                        if (arrayList4 == null) {
                            kotlin.jvm.internal.m.n("mAnswers");
                            throw null;
                        }
                        if (!kotlin.jvm.internal.m.a(word2, ((Word) arrayList4.get(i13)).getWord())) {
                            z12 = false;
                        }
                    }
                }
                if (z12) {
                    ta.a aVar13 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar13);
                    LottieAnimationView lottieAnimationView3 = (LottieAnimationView) ((hj.s1) aVar13).f33257b.f32360f;
                    Collection collection3 = (Collection) list.get(1);
                    jz.d dVar3 = jz.e.f37397a;
                    lottieAnimationView3.setAnimation(((Number) ry.m.I0(collection3)).intValue());
                } else {
                    ta.a aVar14 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar14);
                    LottieAnimationView lottieAnimationView4 = (LottieAnimationView) ((hj.s1) aVar14).f33257b.f32360f;
                    Collection collection4 = (Collection) list.get(2);
                    jz.d dVar4 = jz.e.f37397a;
                    lottieAnimationView4.setAnimation(((Number) ry.m.I0(collection4)).intValue());
                }
                if (env.showAnim) {
                    ta.a aVar15 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar15);
                    ((LottieAnimationView) ((hj.s1) aVar15).f33257b.f32360f).d(new f(this, 6));
                } else {
                    ta.a aVar16 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar16);
                    ((LottieAnimationView) ((hj.s1) aVar16).f33257b.f32359e).e();
                }
                return z12;
        }
    }

    @Override // hi.a
    public final String b() {
        switch (this.f48022i) {
            case 0:
                qy.q qVar = fv.b.f28186a;
                break;
            default:
                qy.q qVar2 = fv.b.f28186a;
                break;
        }
        return fv.b.Y(t().getWordId(), null, null);
    }

    @Override // hi.a
    public final String c() {
        switch (this.f48022i) {
            case 0:
                break;
        }
        return this.f48029q;
    }

    @Override // hi.a
    public final List g() {
        int i11 = 0;
        switch (this.f48022i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                qy.q qVar = fv.b.f28186a;
                arrayList.add(new fv.a(2L, fv.b.Z(t().getWordId()), fv.b.V(t().getWordId())));
                if (y()) {
                    ArrayList arrayList2 = (ArrayList) u();
                    int size = arrayList2.size();
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
            default:
                ArrayList arrayList3 = new ArrayList();
                qy.q qVar3 = fv.b.f28186a;
                arrayList3.add(new fv.a(2L, fv.b.Z(t().getWordId()), fv.b.V(t().getWordId())));
                if (y()) {
                    ArrayList arrayList4 = (ArrayList) u();
                    int size2 = arrayList4.size();
                    while (i11 < size2) {
                        Object obj2 = arrayList4.get(i11);
                        i11++;
                        Word word2 = (Word) obj2;
                        if (word2.getWordType() != 1 && !kotlin.jvm.internal.m.a(word2.getWord(), " ")) {
                            qy.q qVar4 = fv.b.f28186a;
                            String luoma3 = word2.getLuoma();
                            kotlin.jvm.internal.m.e(luoma3, "getLuoma(...)");
                            String strK1 = fv.b.k0(luoma3);
                            String luoma4 = word2.getLuoma();
                            kotlin.jvm.internal.m.e(luoma4, "getLuoma(...)");
                            arrayList3.add(new fv.a(1L, strK1, fv.b.j0(luoma4)));
                        }
                    }
                }
                return arrayList3;
        }
    }

    @Override // hi.a
    public final int i() {
        switch (this.f48022i) {
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x020b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:33:0x0105  */
    /* JADX WARN: Code duplicated, block: B:39:0x012d  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:73:0x0211  */
    /* JADX WARN: Code duplicated, block: B:77:0x0232  */
    /* JADX WARN: Code duplicated, block: B:79:0x0248  */
    /* JADX WARN: Code duplicated, block: B:85:0x0270  */
    /* JADX WARN: Code duplicated, block: B:97:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x013f A[SYNTHETIC] */
    @Override // hi.a
    public final void j() throws NoSuchElemException {
        ArrayList arrayListF;
        int size;
        int i11;
        Word word;
        ArrayList arrayList;
        int size2;
        boolean z11;
        int i12;
        int size3;
        ArrayList arrayList2;
        Object obj;
        ArrayList arrayListF2;
        int size4;
        int i13;
        Word word2;
        ArrayList arrayList3;
        int size5;
        boolean z12;
        int i14;
        int size6;
        ArrayList arrayList4;
        Object obj2;
        int i15 = this.f48022i;
        Long[] lArr = this.f48028p;
        long j11 = this.f47882b;
        switch (i15) {
            case 0:
                Model_Word_010 model_Word_010LoadFullObject = Model_Word_010.loadFullObject(j11);
                if (model_Word_010LoadFullObject == null) {
                    throw new NoSuchElemException();
                }
                this.f48023j = model_Word_010LoadFullObject;
                if (t().getOptionList().size() == 0) {
                    throw new NoSuchElemException();
                }
                Word word3 = t().getWord();
                kotlin.jvm.internal.m.e(word3, "getWord(...)");
                this.f48024k = qi.b.f(word3);
                qy.q qVar = fv.b.f28186a;
                fv.b.Y(t().getWordId(), null, null);
                this.f48025l = new ArrayList();
                List listU = u();
                Word word4 = t().getWord();
                kotlin.jvm.internal.m.e(word4, "getWord(...)");
                ((ArrayList) listU).addAll(qi.b.f(word4));
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if ((cf.x.n().keyLanguage == 12 || cf.x.n().keyLanguage == 1) && ns.o.L(Arrays.copyOf(lArr, lArr.length)).contains(Long.valueOf(t().getWordId()))) {
                    for (Word word5 : t().getOptionList()) {
                        if (word5.getWordId() != t().getWordId()) {
                            arrayListF = qi.b.f(word5);
                            size = arrayListF.size();
                            i11 = 0;
                            while (i11 < size) {
                                Object obj3 = arrayListF.get(i11);
                                i11++;
                                word = (Word) obj3;
                                arrayList = (ArrayList) u();
                                size2 = arrayList.size();
                                z11 = false;
                                i12 = 0;
                                while (i12 < size2) {
                                    obj = arrayList.get(i12);
                                    i12++;
                                    if (kotlin.jvm.internal.m.a(((Word) obj).getWord(), word.getWord())) {
                                        z11 = true;
                                    }
                                }
                                if (!z11) {
                                    size3 = ((ArrayList) u()).size();
                                    arrayList2 = this.f48024k;
                                    if (arrayList2 != null) {
                                        kotlin.jvm.internal.m.n("mAnswers");
                                        throw null;
                                    }
                                    if (size3 < arrayList2.size() + 2) {
                                        ((ArrayList) u()).add(word);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int[] iArr = bq.r.f4959a;
                    if ((bq.m.F() && ((ArrayList) u()).size() <= 3) || (!bq.m.F() && ((ArrayList) u()).size() <= 6)) {
                        while (r0.hasNext()) {
                            if (word5.getWordId() != t().getWordId()) {
                                arrayListF = qi.b.f(word5);
                                size = arrayListF.size();
                                i11 = 0;
                                while (i11 < size) {
                                    Object obj4 = arrayListF.get(i11);
                                    i11++;
                                    word = (Word) obj4;
                                    arrayList = (ArrayList) u();
                                    size2 = arrayList.size();
                                    z11 = false;
                                    i12 = 0;
                                    while (i12 < size2) {
                                        obj = arrayList.get(i12);
                                        i12++;
                                        if (kotlin.jvm.internal.m.a(((Word) obj).getWord(), word.getWord())) {
                                            z11 = true;
                                        }
                                    }
                                    if (!z11) {
                                        size3 = ((ArrayList) u()).size();
                                        arrayList2 = this.f48024k;
                                        if (arrayList2 != null) {
                                            kotlin.jvm.internal.m.n("mAnswers");
                                            throw null;
                                        }
                                        if (size3 < arrayList2.size() + 2) {
                                            ((ArrayList) u()).add(word);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                Collections.shuffle(u());
                return;
            default:
                Model_Word_010 model_Word_010LoadFullObject2 = Model_Word_010.loadFullObject(j11);
                if (model_Word_010LoadFullObject2 == null) {
                    throw new NoSuchElemException();
                }
                this.f48023j = model_Word_010LoadFullObject2;
                if (t().getOptionList().size() == 0) {
                    throw new NoSuchElemException();
                }
                Word word6 = t().getWord();
                kotlin.jvm.internal.m.e(word6, "getWord(...)");
                this.f48024k = qi.b.f(word6);
                qy.q qVar2 = fv.b.f28186a;
                fv.b.Y(t().getWordId(), null, null);
                this.f48025l = new ArrayList();
                List listU2 = u();
                Word word7 = t().getWord();
                kotlin.jvm.internal.m.e(word7, "getWord(...)");
                ((ArrayList) listU2).addAll(qi.b.f(word7));
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if ((cf.x.n().keyLanguage == 12 || cf.x.n().keyLanguage == 1) && ns.o.L(Arrays.copyOf(lArr, lArr.length)).contains(Long.valueOf(t().getWordId()))) {
                    for (Word word8 : t().getOptionList()) {
                        if (word8.getWordId() != t().getWordId()) {
                            arrayListF2 = qi.b.f(word8);
                            size4 = arrayListF2.size();
                            i13 = 0;
                            while (i13 < size4) {
                                Object obj5 = arrayListF2.get(i13);
                                i13++;
                                word2 = (Word) obj5;
                                arrayList3 = (ArrayList) u();
                                size5 = arrayList3.size();
                                z12 = false;
                                i14 = 0;
                                while (i14 < size5) {
                                    obj2 = arrayList3.get(i14);
                                    i14++;
                                    if (kotlin.jvm.internal.m.a(((Word) obj2).getWord(), word2.getWord())) {
                                        z12 = true;
                                    }
                                }
                                if (!z12) {
                                    size6 = ((ArrayList) u()).size();
                                    arrayList4 = this.f48024k;
                                    if (arrayList4 != null) {
                                        kotlin.jvm.internal.m.n("mAnswers");
                                        throw null;
                                    }
                                    if (size6 < arrayList4.size() + 2) {
                                        ((ArrayList) u()).add(word2);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int[] iArr2 = bq.r.f4959a;
                    if ((bq.m.F() && ((ArrayList) u()).size() <= 3) || (!bq.m.F() && ((ArrayList) u()).size() <= 6)) {
                        while (r0.hasNext()) {
                            if (word8.getWordId() != t().getWordId()) {
                                arrayListF2 = qi.b.f(word8);
                                size4 = arrayListF2.size();
                                i13 = 0;
                                while (i13 < size4) {
                                    Object obj6 = arrayListF2.get(i13);
                                    i13++;
                                    word2 = (Word) obj6;
                                    arrayList3 = (ArrayList) u();
                                    size5 = arrayList3.size();
                                    z12 = false;
                                    i14 = 0;
                                    while (i14 < size5) {
                                        obj2 = arrayList3.get(i14);
                                        i14++;
                                        if (kotlin.jvm.internal.m.a(((Word) obj2).getWord(), word2.getWord())) {
                                            z12 = true;
                                        }
                                    }
                                    if (!z12) {
                                        size6 = ((ArrayList) u()).size();
                                        arrayList4 = this.f48024k;
                                        if (arrayList4 != null) {
                                            kotlin.jvm.internal.m.n("mAnswers");
                                            throw null;
                                        }
                                        if (size6 < arrayList4.size() + 2) {
                                            ((ArrayList) u()).add(word2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                Collections.shuffle(u());
                return;
        }
    }

    @Override // hi.a
    public final void k() {
        switch (this.f48022i) {
            case 0:
                Word word = t().getWord();
                kotlin.jvm.internal.m.e(word, "getWord(...)");
                q(zq.c.c(word));
                ta.a aVar = this.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                FlexboxLayout flexboxLayout = ((hj.r1) aVar).f33207c;
                flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new j0(this, 0)), 0L);
                break;
            default:
                x();
                ta.a aVar2 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                FlexboxLayout flexboxLayout2 = ((hj.s1) aVar2).f33258c;
                flexboxLayout2.postDelayed(new b2.c(4, flexboxLayout2, new q0(this, 0)), 0L);
                break;
        }
    }

    @Override // qp.d
    public final fz.f n() {
        switch (this.f48022i) {
            case 0:
                return k0.f48006a;
            default:
                return r0.f48147a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0128  */
    @Override // qp.d
    public final void p() {
        int i11 = this.f48022i;
        List list = this.f48027o;
        mp.b bVar = this.f47881a;
        Context context = this.f47883c;
        Env env = this.f47884d;
        switch (i11) {
            case 0:
                ((jp.p0) bVar).O(0);
                Word word = t().getWord();
                kotlin.jvm.internal.m.e(word, "getWord(...)");
                q(zq.c.c(word));
                ArrayList arrayList = this.f48024k;
                if (arrayList == null) {
                    kotlin.jvm.internal.m.n("mAnswers");
                    throw null;
                }
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    Word word2 = (Word) obj;
                    int[] iArr = bq.r.f4959a;
                    int i13 = bq.m.F() ? R.layout.item_cn_word_abs_model_6_elem : R.layout.item_cn_word_abs_model_6_elem_en;
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                    ta.a aVar = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar);
                    View viewInflate = layoutInflaterFrom.inflate(i13, (ViewGroup) ((hj.r1) aVar).f33208d, false);
                    ((TextView) viewInflate.findViewById(R.id.tv_word)).setText(word2.getWord());
                    bq.z.b(viewInflate, new n0.w0(19, viewInflate, this));
                    ta.a aVar2 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    ((hj.r1) aVar2).f33208d.addView(viewInflate);
                }
                ArrayList arrayList2 = (ArrayList) u();
                int size2 = arrayList2.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = arrayList2.get(i14);
                    i14++;
                    Word word3 = (Word) obj2;
                    int[] iArr2 = bq.r.f4959a;
                    int i15 = !bq.m.F() ? R.layout.item_word_card_framlayout_autofit_en : R.layout.item_word_card_framlayout_autofit;
                    LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(context);
                    ta.a aVar3 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar3);
                    View viewInflate2 = layoutInflaterFrom2.inflate(i15, (ViewGroup) ((hj.r1) aVar3).f33207c, false);
                    kotlin.jvm.internal.m.d(viewInflate2, "null cannot be cast to non-null type android.widget.FrameLayout");
                    FrameLayout frameLayout = (FrameLayout) viewInflate2;
                    CardView cardView = (CardView) frameLayout.findViewById(R.id.card_item);
                    kotlin.jvm.internal.m.f(context, "context");
                    cardView.setCardBackgroundColor(context.getColor(R.color.white));
                    float fL = ff.h.l(2.0f);
                    WeakHashMap weakHashMap = z4.s0.f58893a;
                    z4.j0.k(cardView, fL);
                    frameLayout.setBackgroundResource(R.drawable.item_leave);
                    cardView.setTag(word3);
                    v(frameLayout, word3);
                    ta.a aVar4 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar4);
                    ((hj.r1) aVar4).f33207c.addView(frameLayout);
                    bq.z.b(cardView, new pr.a0(this, word3, cardView, 3));
                }
                View viewFindViewById = o().findViewById(R.id.iv_audio);
                kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                ImageView imageView = (ImageView) viewFindViewById;
                bq.z.b(imageView, new n0.w0(18, this, imageView));
                ta.a aVar5 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                LinearLayout rootParent = ((hj.r1) aVar5).f33209e;
                kotlin.jvm.internal.m.e(rootParent, "rootParent");
                bq.z.b(rootParent, new ih.c(imageView, 3));
                ef.e.B(o());
                ta.a aVar6 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                bq.z.a(((hj.r1) aVar6).f33207c, 0L, new j0(this, 1));
                ta.a aVar7 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar7);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ((hj.r1) aVar7).f33206b.f33676d;
                Collection collection = (Collection) list.get(0);
                jz.d dVar = jz.e.f37397a;
                lottieAnimationView.setAnimation(((Number) ry.m.I0(collection)).intValue());
                ta.a aVar8 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar8);
                ((LottieAnimationView) ((hj.r1) aVar8).f33206b.f33676d).setRepeatCount(-1);
                if (env.showAnim) {
                    ta.a aVar9 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar9);
                    ((LottieAnimationView) ((hj.r1) aVar9).f33206b.f33676d).h();
                } else {
                    ta.a aVar10 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar10);
                    ((LottieAnimationView) ((hj.r1) aVar10).f33206b.f33676d).e();
                }
                imageView.performClick();
                return;
            default:
                jp.p0 p0Var = (jp.p0) bVar;
                p0Var.O(0);
                x();
                ArrayList arrayList3 = this.f48024k;
                if (arrayList3 == null) {
                    kotlin.jvm.internal.m.n("mAnswers");
                    throw null;
                }
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj3 = arrayList3.get(i16);
                    i16++;
                    Word word4 = (Word) obj3;
                    int[] iArr3 = bq.r.f4959a;
                    int i17 = bq.m.F() ? R.layout.item_cn_word_abs_model_6_elem : R.layout.item_cn_word_abs_model_6_elem_en;
                    LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(context);
                    ta.a aVar11 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar11);
                    View viewInflate3 = layoutInflaterFrom3.inflate(i17, (ViewGroup) ((hj.s1) aVar11).f33259d, false);
                    ((TextView) viewInflate3.findViewById(R.id.tv_word)).setText(word4.getWord());
                    bq.z.b(viewInflate3, new n0.w0(21, viewInflate3, this));
                    ta.a aVar12 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar12);
                    ((hj.s1) aVar12).f33259d.addView(viewInflate3);
                }
                ArrayList arrayList4 = (ArrayList) u();
                int size4 = arrayList4.size();
                int i18 = 0;
                while (i18 < size4) {
                    Object obj4 = arrayList4.get(i18);
                    i18++;
                    Word word5 = (Word) obj4;
                    int[] iArr4 = bq.r.f4959a;
                    int i19 = !bq.m.F() ? R.layout.item_word_card_framlayout_autofit_en : R.layout.item_word_card_framlayout_autofit;
                    LayoutInflater layoutInflaterFrom4 = LayoutInflater.from(context);
                    ta.a aVar13 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar13);
                    ArrayList arrayList5 = arrayList4;
                    View viewInflate4 = layoutInflaterFrom4.inflate(i19, (ViewGroup) ((hj.s1) aVar13).f33258c, false);
                    kotlin.jvm.internal.m.d(viewInflate4, "null cannot be cast to non-null type android.widget.FrameLayout");
                    FrameLayout frameLayout2 = (FrameLayout) viewInflate4;
                    CardView cardView2 = (CardView) frameLayout2.findViewById(R.id.card_item);
                    kotlin.jvm.internal.m.f(context, "context");
                    cardView2.setCardBackgroundColor(context.getColor(R.color.white));
                    float fL2 = ff.h.l(2.0f);
                    WeakHashMap weakHashMap2 = z4.s0.f58893a;
                    z4.j0.k(cardView2, fL2);
                    frameLayout2.setBackgroundResource(R.drawable.item_leave);
                    cardView2.setTag(word5);
                    w(frameLayout2, word5);
                    ta.a aVar14 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar14);
                    ((hj.s1) aVar14).f33258c.addView(frameLayout2);
                    bq.z.b(cardView2, new pr.a0(this, word5, cardView2, 4));
                    arrayList4 = arrayList5;
                }
                View viewFindViewById2 = o().findViewById(R.id.iv_audio);
                kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
                ImageView imageView2 = (ImageView) viewFindViewById2;
                if (!env.isAudioModel) {
                    imageView2.setVisibility(8);
                } else if (p0Var.Q) {
                    int[] iArr5 = bq.r.f4959a;
                    if (bq.m.F()) {
                        bq.z.b(imageView2, new n0.w0(20, this, imageView2));
                        ta.a aVar15 = this.f47886f;
                        kotlin.jvm.internal.m.c(aVar15);
                        LinearLayout rootParent2 = ((hj.s1) aVar15).f33260e;
                        kotlin.jvm.internal.m.e(rootParent2, "rootParent");
                        bq.z.b(rootParent2, new ih.c(imageView2, 4));
                    } else {
                        imageView2.setVisibility(8);
                    }
                } else {
                    bq.z.b(imageView2, new n0.w0(20, this, imageView2));
                    ta.a aVar16 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar16);
                    LinearLayout rootParent3 = ((hj.s1) aVar16).f33260e;
                    kotlin.jvm.internal.m.e(rootParent3, "rootParent");
                    bq.z.b(rootParent3, new ih.c(imageView2, 4));
                }
                ef.e.B(o());
                ta.a aVar17 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar17);
                FlexboxLayout flexboxLayout = ((hj.s1) aVar17).f33258c;
                flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new q0(this, 1)), 0L);
                ta.a aVar18 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar18);
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ((hj.s1) aVar18).f33257b.f32359e;
                Collection collection2 = (Collection) list.get(0);
                jz.d dVar2 = jz.e.f37397a;
                lottieAnimationView2.setAnimation(((Number) ry.m.I0(collection2)).intValue());
                ta.a aVar19 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar19);
                ((LottieAnimationView) ((hj.s1) aVar19).f33257b.f32359e).setRepeatCount(-1);
                if (env.showAnim) {
                    ta.a aVar20 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar20);
                    ((LottieAnimationView) ((hj.s1) aVar20).f33257b.f32359e).h();
                    return;
                } else {
                    ta.a aVar21 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar21);
                    ((LottieAnimationView) ((hj.s1) aVar21).f33257b.f32359e).e();
                    return;
                }
        }
    }

    public final Model_Word_010 t() {
        switch (this.f48022i) {
            case 0:
                Model_Word_010 model_Word_010 = this.f48023j;
                if (model_Word_010 != null) {
                    return model_Word_010;
                }
                kotlin.jvm.internal.m.n("mModel");
                throw null;
            default:
                Model_Word_010 model_Word_011 = this.f48023j;
                if (model_Word_011 != null) {
                    return model_Word_011;
                }
                kotlin.jvm.internal.m.n("mModel");
                throw null;
        }
    }

    public final List u() {
        switch (this.f48022i) {
            case 0:
                ArrayList arrayList = this.f48025l;
                if (arrayList != null) {
                    return arrayList;
                }
                kotlin.jvm.internal.m.n("mOptions");
                throw null;
            default:
                ArrayList arrayList2 = this.f48025l;
                if (arrayList2 != null) {
                    return arrayList2;
                }
                kotlin.jvm.internal.m.n("mOptions");
                throw null;
        }
    }

    public void v(View view, Word word) {
        TextView textView = (TextView) view.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
        textView3.setVisibility(8);
        textView.setVisibility(8);
        textView2.setTextSize(this.m);
        textView.setTextSize(8.0f);
        textView3.setTextSize(8.0f);
        kotlin.jvm.internal.m.f(word, "word");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().keyLanguage == 12 || cf.x.n().keyLanguage == 1) {
            int i11 = this.f47884d.jsDisPlay;
            if (i11 == 2 || i11 == 4) {
                textView2.setText(word.getLuoma());
            } else {
                textView2.setText(word.getWord());
            }
        } else {
            boolean z11 = ((jp.p0) this.f47881a).Q;
            zq.c.e(word, textView, textView2, textView3, true);
        }
        ef.e.B(view);
    }

    public void w(View view, Word word) {
        TextView textView = (TextView) view.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
        textView3.setVisibility(8);
        textView.setVisibility(8);
        textView2.setTextSize(this.m);
        textView.setTextSize(8.0f);
        textView3.setTextSize(8.0f);
        kotlin.jvm.internal.m.f(word, "word");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().keyLanguage == 12 || cf.x.n().keyLanguage == 1) {
            int i11 = this.f47884d.jsDisPlay;
            if (i11 == 2 || i11 == 4) {
                textView2.setText(word.getLuoma());
            } else {
                textView2.setText(word.getWord());
            }
        } else {
            boolean z11 = ((jp.p0) this.f47881a).Q;
            zq.c.e(word, textView, textView2, textView3, true);
        }
        ef.e.B(view);
    }

    public void x() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.s1) aVar).f33257b.f32356b.setText(t().getWord().getTranslations());
        Word word = t().getWord();
        kotlin.jvm.internal.m.e(word, "getWord(...)");
        q(zq.c.c(word));
    }

    public final boolean y() {
        switch (this.f48022i) {
            case 0:
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                return cf.x.n().keyLanguage == 11 || cf.x.n().keyLanguage == 0 || cf.x.n().keyLanguage == 13 || cf.x.n().keyLanguage == 2;
            default:
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                return cf.x.n().keyLanguage == 11 || cf.x.n().keyLanguage == 0 || cf.x.n().keyLanguage == 13 || cf.x.n().keyLanguage == 2;
        }
    }
}
