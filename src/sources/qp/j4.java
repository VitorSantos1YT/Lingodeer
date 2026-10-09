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
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Model_Word_010;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import hj.b6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j4 extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long[] f47998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Model_Word_010 f47999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f48000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f48001l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f48002n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f48003o;

    public j4(mp.b bVar, long j11) {
        super(bVar, j11);
        this.f47998i = new Long[]{2044L, 1767L, 440L, 2397L, 2398L, 2562L, 2563L, 2564L, 2565L, 441L, 2566L, 2567L, 2568L, 2569L, 2570L, 2396L};
        this.f48001l = new ArrayList();
    }

    public static final void r(j4 j4Var, int i11, String str, SpannableString spannableString, int i12, boolean z11) {
        Object tag;
        Context context = j4Var.f47883c;
        ta.a aVar = j4Var.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        if (i11 >= ((hj.z2) aVar).f33659c.getChildCount()) {
            return;
        }
        kotlin.jvm.internal.m.f(context, "context");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(context.getColor(R.color.color_answer_btm));
        ta.a aVar2 = j4Var.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        Object tag2 = ((hj.z2) aVar2).f33659c.getChildAt(i11).getTag(R.id.bottom_view);
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

    public static boolean u() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return cf.x.n().keyLanguage == 11 || cf.x.n().keyLanguage == 0 || cf.x.n().keyLanguage == 13 || cf.x.n().keyLanguage == 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    @Override // hi.a
    public final boolean a() {
        Object tag;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        int childCount = ((hj.z2) aVar2).f33659c.getChildCount();
        ArrayList arrayList = this.f48000k;
        if (arrayList == null) {
            kotlin.jvm.internal.m.n("mAnswers");
            throw null;
        }
        boolean z11 = childCount == arrayList.size();
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        int childCount2 = ((hj.z2) aVar3).f33659c.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            Object tag2 = ((hj.z2) aVar4).f33659c.getChildAt(i11).getTag(R.id.bottom_view);
            if (tag2 != null && (tag = ((View) tag2).getTag()) != null) {
                Word word = (Word) tag;
                ArrayList arrayList2 = this.f48000k;
                if (arrayList2 == null) {
                    kotlin.jvm.internal.m.n("mAnswers");
                    throw null;
                }
                if (i11 < arrayList2.size()) {
                    String word2 = word.getWord();
                    ArrayList arrayList3 = this.f48000k;
                    if (arrayList3 == null) {
                        kotlin.jvm.internal.m.n("mAnswers");
                        throw null;
                    }
                    if (!kotlin.jvm.internal.m.a(word2, ((Word) arrayList3.get(i11)).getWord())) {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
            }
        }
        mp.b bVar = this.f47881a;
        kotlin.jvm.internal.m.d(bVar, "null cannot be cast to non-null type com.lingo.lingoskill.ui.learn.BaseLessonTestFragment");
        ((jp.p0) bVar).f36528d0 = new o20.w(this, 16);
        return z11;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Word_010 model_Word_010 = this.f47999j;
        if (model_Word_010 != null) {
            return fv.b.Y(model_Word_010.getWordId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // hi.a
    public final String c() {
        return nv.p.m(this.f47882b, "0;", ";5");
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        Model_Word_010 model_Word_010 = this.f47999j;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strZ = fv.b.Z(model_Word_010.getWordId());
        Model_Word_010 model_Word_011 = this.f47999j;
        if (model_Word_011 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        arrayList.add(new fv.a(2L, strZ, fv.b.V(model_Word_011.getWordId())));
        if (u()) {
            ArrayList arrayList2 = this.f48002n;
            if (arrayList2 == null) {
                kotlin.jvm.internal.m.n("mOptions");
                throw null;
            }
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

    /* JADX WARN: Code duplicated, block: B:109:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0171 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x0134  */
    /* JADX WARN: Code duplicated, block: B:56:0x014a  */
    /* JADX WARN: Code duplicated, block: B:65:0x017e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0182  */
    /* JADX WARN: Code duplicated, block: B:69:0x018a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0192  */
    /* JADX WARN: Code duplicated, block: B:73:0x0196  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c3  */
    @Override // hi.a
    public final void j() throws Throwable {
        Model_Word_010 model_Word_010;
        Iterator<Word> it;
        Word next;
        long wordId;
        Model_Word_010 model_Word_011;
        ArrayList arrayListH;
        int size;
        int i11;
        Word word;
        ArrayList arrayList;
        int size2;
        boolean z11;
        int i12;
        Throwable th2;
        ArrayList arrayList2;
        int size3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String lowerCase;
        String lowerCase2;
        String word2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Model_Word_010 model_Word_010LoadFullObject = Model_Word_010.loadFullObject(this.f47882b);
        if (model_Word_010LoadFullObject == null) {
            throw new NoSuchElemException();
        }
        this.f47999j = model_Word_010LoadFullObject;
        if (model_Word_010LoadFullObject.getOptionList().size() == 0) {
            throw new NoSuchElemException();
        }
        Model_Word_010 model_Word_012 = this.f47999j;
        Throwable th3 = null;
        if (model_Word_012 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Word word3 = model_Word_012.getWord();
        kotlin.jvm.internal.m.e(word3, "getWord(...)");
        this.f48000k = qi.b.h(word3);
        qy.q qVar = fv.b.f28186a;
        Model_Word_010 model_Word_013 = this.f47999j;
        if (model_Word_013 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        this.m = fv.b.Y(model_Word_013.getWordId(), null, null);
        ArrayList arrayList7 = new ArrayList();
        this.f48002n = arrayList7;
        Model_Word_010 model_Word_014 = this.f47999j;
        if (model_Word_014 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Word word4 = model_Word_014.getWord();
        kotlin.jvm.internal.m.e(word4, "getWord(...)");
        arrayList7.addAll(qi.b.h(word4));
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().keyLanguage == 12 || cf.x.n().keyLanguage == 1) {
            Long[] lArr = this.f47998i;
            List listL = ns.o.L(Arrays.copyOf(lArr, lArr.length));
            Model_Word_010 model_Word_015 = this.f47999j;
            if (model_Word_015 == null) {
                kotlin.jvm.internal.m.n("mModel");
                throw null;
            }
            if (listL.contains(Long.valueOf(model_Word_015.getWordId()))) {
                model_Word_010 = this.f47999j;
                if (model_Word_010 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                it = model_Word_010.getOptionList().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    wordId = next.getWordId();
                    model_Word_011 = this.f47999j;
                    if (model_Word_011 == null) {
                        Throwable th4 = th3;
                        kotlin.jvm.internal.m.n("mModel");
                        throw th4;
                    }
                    if (wordId != model_Word_011.getWordId()) {
                        arrayListH = qi.b.h(next);
                        size = arrayListH.size();
                        i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayListH.get(i11);
                            i11++;
                            word = (Word) obj;
                            arrayList = this.f48002n;
                            if (arrayList == null) {
                                Throwable th5 = th3;
                                kotlin.jvm.internal.m.n("mOptions");
                                throw th5;
                            }
                            size2 = arrayList.size();
                            z11 = false;
                            i12 = 0;
                            while (i12 < size2) {
                                Object obj2 = arrayList.get(i12);
                                i12++;
                                Word word5 = (Word) obj2;
                                th3 = th3;
                                String word6 = word5.getWord();
                                kotlin.jvm.internal.m.e(word6, "getWord(...)");
                                int[] iArr = bq.r.f4959a;
                                lowerCase = word6.toLowerCase(bq.m.p());
                                kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                                String word7 = word.getWord();
                                kotlin.jvm.internal.m.e(word7, "getWord(...)");
                                it = it;
                                lowerCase2 = word7.toLowerCase(bq.m.p());
                                kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                                if (!lowerCase.equals(lowerCase2)) {
                                    word2 = word.getWord();
                                    kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                    if (oz.q.i1(word2).toString().length() == 0 && (!ry.l.D(new String[]{"â", "a"}, word5.getWord()) || !ry.l.D(new String[]{"â", "a"}, word.getWord()))) {
                                    }
                                }
                                z11 = true;
                            }
                            Iterator<Word> it2 = it;
                            th2 = th3;
                            if (!z11) {
                                arrayList2 = this.f48002n;
                                if (arrayList2 == null) {
                                    kotlin.jvm.internal.m.n("mOptions");
                                    throw th2;
                                }
                                size3 = arrayList2.size();
                                arrayList3 = this.f48000k;
                                if (arrayList3 == null) {
                                    kotlin.jvm.internal.m.n("mAnswers");
                                    throw th2;
                                }
                                if (size3 < arrayList3.size() + 2) {
                                    continue;
                                } else {
                                    arrayList4 = this.f48002n;
                                    if (arrayList4 == null) {
                                        kotlin.jvm.internal.m.n("mOptions");
                                        throw th2;
                                    }
                                    arrayList4.add(word);
                                }
                            }
                            th3 = th2;
                            it = it2;
                        }
                    }
                }
            } else {
                int[] iArr2 = bq.r.f4959a;
                if (!bq.m.F()) {
                    arrayList6 = this.f48002n;
                    if (arrayList6 != null) {
                        kotlin.jvm.internal.m.n("mOptions");
                        throw null;
                    }
                    if (arrayList6.size() <= 3) {
                        model_Word_010 = this.f47999j;
                        if (model_Word_010 == null) {
                            kotlin.jvm.internal.m.n("mModel");
                            throw null;
                        }
                        it = model_Word_010.getOptionList().iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            wordId = next.getWordId();
                            model_Word_011 = this.f47999j;
                            if (model_Word_011 == null) {
                                Throwable th6 = th3;
                                kotlin.jvm.internal.m.n("mModel");
                                throw th6;
                            }
                            if (wordId != model_Word_011.getWordId()) {
                                arrayListH = qi.b.h(next);
                                size = arrayListH.size();
                                i11 = 0;
                                while (i11 < size) {
                                    Object obj3 = arrayListH.get(i11);
                                    i11++;
                                    word = (Word) obj3;
                                    arrayList = this.f48002n;
                                    if (arrayList == null) {
                                        Throwable th7 = th3;
                                        kotlin.jvm.internal.m.n("mOptions");
                                        throw th7;
                                    }
                                    size2 = arrayList.size();
                                    z11 = false;
                                    i12 = 0;
                                    while (i12 < size2) {
                                        Object obj4 = arrayList.get(i12);
                                        i12++;
                                        Word word8 = (Word) obj4;
                                        th3 = th3;
                                        String word9 = word8.getWord();
                                        kotlin.jvm.internal.m.e(word9, "getWord(...)");
                                        int[] iArr3 = bq.r.f4959a;
                                        lowerCase = word9.toLowerCase(bq.m.p());
                                        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                                        String word10 = word.getWord();
                                        kotlin.jvm.internal.m.e(word10, "getWord(...)");
                                        it = it;
                                        lowerCase2 = word10.toLowerCase(bq.m.p());
                                        kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                                        if (!lowerCase.equals(lowerCase2)) {
                                            word2 = word.getWord();
                                            kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                            if (oz.q.i1(word2).toString().length() == 0) {
                                            }
                                        }
                                        z11 = true;
                                    }
                                    Iterator<Word> it3 = it;
                                    th2 = th3;
                                    if (!z11) {
                                        arrayList2 = this.f48002n;
                                        if (arrayList2 == null) {
                                            kotlin.jvm.internal.m.n("mOptions");
                                            throw th2;
                                        }
                                        size3 = arrayList2.size();
                                        arrayList3 = this.f48000k;
                                        if (arrayList3 == null) {
                                            kotlin.jvm.internal.m.n("mAnswers");
                                            throw th2;
                                        }
                                        if (size3 < arrayList3.size() + 2) {
                                            arrayList4 = this.f48002n;
                                            if (arrayList4 == null) {
                                                kotlin.jvm.internal.m.n("mOptions");
                                                throw th2;
                                            }
                                            arrayList4.add(word);
                                        } else {
                                            continue;
                                        }
                                    }
                                    th3 = th2;
                                    it = it3;
                                }
                            }
                        }
                    } else if (!bq.m.F()) {
                        arrayList5 = this.f48002n;
                        if (arrayList5 != null) {
                            kotlin.jvm.internal.m.n("mOptions");
                            throw null;
                        }
                        if (arrayList5.size() <= 6) {
                            model_Word_010 = this.f47999j;
                            if (model_Word_010 == null) {
                                kotlin.jvm.internal.m.n("mModel");
                                throw null;
                            }
                            it = model_Word_010.getOptionList().iterator();
                            while (it.hasNext()) {
                                next = it.next();
                                wordId = next.getWordId();
                                model_Word_011 = this.f47999j;
                                if (model_Word_011 == null) {
                                    Throwable th8 = th3;
                                    kotlin.jvm.internal.m.n("mModel");
                                    throw th8;
                                }
                                if (wordId != model_Word_011.getWordId()) {
                                    arrayListH = qi.b.h(next);
                                    size = arrayListH.size();
                                    i11 = 0;
                                    while (i11 < size) {
                                        Object obj5 = arrayListH.get(i11);
                                        i11++;
                                        word = (Word) obj5;
                                        arrayList = this.f48002n;
                                        if (arrayList == null) {
                                            Throwable th9 = th3;
                                            kotlin.jvm.internal.m.n("mOptions");
                                            throw th9;
                                        }
                                        size2 = arrayList.size();
                                        z11 = false;
                                        i12 = 0;
                                        while (i12 < size2) {
                                            Object obj6 = arrayList.get(i12);
                                            i12++;
                                            Word word11 = (Word) obj6;
                                            th3 = th3;
                                            String word12 = word11.getWord();
                                            kotlin.jvm.internal.m.e(word12, "getWord(...)");
                                            int[] iArr4 = bq.r.f4959a;
                                            lowerCase = word12.toLowerCase(bq.m.p());
                                            kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                                            String word13 = word.getWord();
                                            kotlin.jvm.internal.m.e(word13, "getWord(...)");
                                            it = it;
                                            lowerCase2 = word13.toLowerCase(bq.m.p());
                                            kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                                            if (!lowerCase.equals(lowerCase2)) {
                                                word2 = word.getWord();
                                                kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                if (oz.q.i1(word2).toString().length() == 0) {
                                                }
                                            }
                                            z11 = true;
                                        }
                                        Iterator<Word> it4 = it;
                                        th2 = th3;
                                        if (!z11) {
                                            arrayList2 = this.f48002n;
                                            if (arrayList2 == null) {
                                                kotlin.jvm.internal.m.n("mOptions");
                                                throw th2;
                                            }
                                            size3 = arrayList2.size();
                                            arrayList3 = this.f48000k;
                                            if (arrayList3 == null) {
                                                kotlin.jvm.internal.m.n("mAnswers");
                                                throw th2;
                                            }
                                            if (size3 < arrayList3.size() + 2) {
                                                arrayList4 = this.f48002n;
                                                if (arrayList4 == null) {
                                                    kotlin.jvm.internal.m.n("mOptions");
                                                    throw th2;
                                                }
                                                arrayList4.add(word);
                                            } else {
                                                continue;
                                            }
                                        }
                                        th3 = th2;
                                        it = it4;
                                    }
                                }
                            }
                        }
                    }
                } else if (!bq.m.F()) {
                    arrayList5 = this.f48002n;
                    if (arrayList5 != null) {
                        kotlin.jvm.internal.m.n("mOptions");
                        throw null;
                    }
                    if (arrayList5.size() <= 6) {
                        model_Word_010 = this.f47999j;
                        if (model_Word_010 == null) {
                            kotlin.jvm.internal.m.n("mModel");
                            throw null;
                        }
                        it = model_Word_010.getOptionList().iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            wordId = next.getWordId();
                            model_Word_011 = this.f47999j;
                            if (model_Word_011 == null) {
                                Throwable th10 = th3;
                                kotlin.jvm.internal.m.n("mModel");
                                throw th10;
                            }
                            if (wordId != model_Word_011.getWordId()) {
                                arrayListH = qi.b.h(next);
                                size = arrayListH.size();
                                i11 = 0;
                                while (i11 < size) {
                                    Object obj7 = arrayListH.get(i11);
                                    i11++;
                                    word = (Word) obj7;
                                    arrayList = this.f48002n;
                                    if (arrayList == null) {
                                        Throwable th11 = th3;
                                        kotlin.jvm.internal.m.n("mOptions");
                                        throw th11;
                                    }
                                    size2 = arrayList.size();
                                    z11 = false;
                                    i12 = 0;
                                    while (i12 < size2) {
                                        Object obj8 = arrayList.get(i12);
                                        i12++;
                                        Word word14 = (Word) obj8;
                                        th3 = th3;
                                        String word15 = word14.getWord();
                                        kotlin.jvm.internal.m.e(word15, "getWord(...)");
                                        int[] iArr5 = bq.r.f4959a;
                                        lowerCase = word15.toLowerCase(bq.m.p());
                                        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                                        String word16 = word.getWord();
                                        kotlin.jvm.internal.m.e(word16, "getWord(...)");
                                        it = it;
                                        lowerCase2 = word16.toLowerCase(bq.m.p());
                                        kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                                        if (!lowerCase.equals(lowerCase2)) {
                                            word2 = word.getWord();
                                            kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                            if (oz.q.i1(word2).toString().length() == 0) {
                                            }
                                        }
                                        z11 = true;
                                    }
                                    Iterator<Word> it5 = it;
                                    th2 = th3;
                                    if (!z11) {
                                        arrayList2 = this.f48002n;
                                        if (arrayList2 == null) {
                                            kotlin.jvm.internal.m.n("mOptions");
                                            throw th2;
                                        }
                                        size3 = arrayList2.size();
                                        arrayList3 = this.f48000k;
                                        if (arrayList3 == null) {
                                            kotlin.jvm.internal.m.n("mAnswers");
                                            throw th2;
                                        }
                                        if (size3 < arrayList3.size() + 2) {
                                            arrayList4 = this.f48002n;
                                            if (arrayList4 == null) {
                                                kotlin.jvm.internal.m.n("mOptions");
                                                throw th2;
                                            }
                                            arrayList4.add(word);
                                        } else {
                                            continue;
                                        }
                                    }
                                    th3 = th2;
                                    it = it5;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            int[] iArr6 = bq.r.f4959a;
            if (!bq.m.F()) {
                arrayList6 = this.f48002n;
                if (arrayList6 != null) {
                    kotlin.jvm.internal.m.n("mOptions");
                    throw null;
                }
                if (arrayList6.size() <= 3) {
                    model_Word_010 = this.f47999j;
                    if (model_Word_010 == null) {
                        kotlin.jvm.internal.m.n("mModel");
                        throw null;
                    }
                    it = model_Word_010.getOptionList().iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        wordId = next.getWordId();
                        model_Word_011 = this.f47999j;
                        if (model_Word_011 == null) {
                            Throwable th12 = th3;
                            kotlin.jvm.internal.m.n("mModel");
                            throw th12;
                        }
                        if (wordId != model_Word_011.getWordId()) {
                            arrayListH = qi.b.h(next);
                            size = arrayListH.size();
                            i11 = 0;
                            while (i11 < size) {
                                Object obj9 = arrayListH.get(i11);
                                i11++;
                                word = (Word) obj9;
                                arrayList = this.f48002n;
                                if (arrayList == null) {
                                    Throwable th13 = th3;
                                    kotlin.jvm.internal.m.n("mOptions");
                                    throw th13;
                                }
                                size2 = arrayList.size();
                                z11 = false;
                                i12 = 0;
                                while (i12 < size2) {
                                    Object obj10 = arrayList.get(i12);
                                    i12++;
                                    Word word17 = (Word) obj10;
                                    th3 = th3;
                                    String word18 = word17.getWord();
                                    kotlin.jvm.internal.m.e(word18, "getWord(...)");
                                    int[] iArr7 = bq.r.f4959a;
                                    lowerCase = word18.toLowerCase(bq.m.p());
                                    kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                                    String word19 = word.getWord();
                                    kotlin.jvm.internal.m.e(word19, "getWord(...)");
                                    it = it;
                                    lowerCase2 = word19.toLowerCase(bq.m.p());
                                    kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                                    if (!lowerCase.equals(lowerCase2)) {
                                        word2 = word.getWord();
                                        kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                        if (oz.q.i1(word2).toString().length() == 0) {
                                        }
                                    }
                                    z11 = true;
                                }
                                Iterator<Word> it6 = it;
                                th2 = th3;
                                if (!z11) {
                                    arrayList2 = this.f48002n;
                                    if (arrayList2 == null) {
                                        kotlin.jvm.internal.m.n("mOptions");
                                        throw th2;
                                    }
                                    size3 = arrayList2.size();
                                    arrayList3 = this.f48000k;
                                    if (arrayList3 == null) {
                                        kotlin.jvm.internal.m.n("mAnswers");
                                        throw th2;
                                    }
                                    if (size3 < arrayList3.size() + 2) {
                                        arrayList4 = this.f48002n;
                                        if (arrayList4 == null) {
                                            kotlin.jvm.internal.m.n("mOptions");
                                            throw th2;
                                        }
                                        arrayList4.add(word);
                                    } else {
                                        continue;
                                    }
                                }
                                th3 = th2;
                                it = it6;
                            }
                        }
                    }
                } else if (!bq.m.F()) {
                    arrayList5 = this.f48002n;
                    if (arrayList5 != null) {
                        kotlin.jvm.internal.m.n("mOptions");
                        throw null;
                    }
                    if (arrayList5.size() <= 6) {
                        model_Word_010 = this.f47999j;
                        if (model_Word_010 == null) {
                            kotlin.jvm.internal.m.n("mModel");
                            throw null;
                        }
                        it = model_Word_010.getOptionList().iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            wordId = next.getWordId();
                            model_Word_011 = this.f47999j;
                            if (model_Word_011 == null) {
                                Throwable th14 = th3;
                                kotlin.jvm.internal.m.n("mModel");
                                throw th14;
                            }
                            if (wordId != model_Word_011.getWordId()) {
                                arrayListH = qi.b.h(next);
                                size = arrayListH.size();
                                i11 = 0;
                                while (i11 < size) {
                                    Object obj11 = arrayListH.get(i11);
                                    i11++;
                                    word = (Word) obj11;
                                    arrayList = this.f48002n;
                                    if (arrayList == null) {
                                        Throwable th15 = th3;
                                        kotlin.jvm.internal.m.n("mOptions");
                                        throw th15;
                                    }
                                    size2 = arrayList.size();
                                    z11 = false;
                                    i12 = 0;
                                    while (i12 < size2) {
                                        Object obj12 = arrayList.get(i12);
                                        i12++;
                                        Word word110 = (Word) obj12;
                                        th3 = th3;
                                        String word111 = word110.getWord();
                                        kotlin.jvm.internal.m.e(word111, "getWord(...)");
                                        int[] iArr8 = bq.r.f4959a;
                                        lowerCase = word111.toLowerCase(bq.m.p());
                                        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                                        String word112 = word.getWord();
                                        kotlin.jvm.internal.m.e(word112, "getWord(...)");
                                        it = it;
                                        lowerCase2 = word112.toLowerCase(bq.m.p());
                                        kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                                        if (!lowerCase.equals(lowerCase2)) {
                                            word2 = word.getWord();
                                            kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                            if (oz.q.i1(word2).toString().length() == 0) {
                                            }
                                        }
                                        z11 = true;
                                    }
                                    Iterator<Word> it7 = it;
                                    th2 = th3;
                                    if (!z11) {
                                        arrayList2 = this.f48002n;
                                        if (arrayList2 == null) {
                                            kotlin.jvm.internal.m.n("mOptions");
                                            throw th2;
                                        }
                                        size3 = arrayList2.size();
                                        arrayList3 = this.f48000k;
                                        if (arrayList3 == null) {
                                            kotlin.jvm.internal.m.n("mAnswers");
                                            throw th2;
                                        }
                                        if (size3 < arrayList3.size() + 2) {
                                            arrayList4 = this.f48002n;
                                            if (arrayList4 == null) {
                                                kotlin.jvm.internal.m.n("mOptions");
                                                throw th2;
                                            }
                                            arrayList4.add(word);
                                        } else {
                                            continue;
                                        }
                                    }
                                    th3 = th2;
                                    it = it7;
                                }
                            }
                        }
                    }
                }
            } else if (!bq.m.F()) {
                arrayList5 = this.f48002n;
                if (arrayList5 != null) {
                    kotlin.jvm.internal.m.n("mOptions");
                    throw null;
                }
                if (arrayList5.size() <= 6) {
                    model_Word_010 = this.f47999j;
                    if (model_Word_010 == null) {
                        kotlin.jvm.internal.m.n("mModel");
                        throw null;
                    }
                    it = model_Word_010.getOptionList().iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        wordId = next.getWordId();
                        model_Word_011 = this.f47999j;
                        if (model_Word_011 == null) {
                            Throwable th16 = th3;
                            kotlin.jvm.internal.m.n("mModel");
                            throw th16;
                        }
                        if (wordId != model_Word_011.getWordId()) {
                            arrayListH = qi.b.h(next);
                            size = arrayListH.size();
                            i11 = 0;
                            while (i11 < size) {
                                Object obj13 = arrayListH.get(i11);
                                i11++;
                                word = (Word) obj13;
                                arrayList = this.f48002n;
                                if (arrayList == null) {
                                    Throwable th17 = th3;
                                    kotlin.jvm.internal.m.n("mOptions");
                                    throw th17;
                                }
                                size2 = arrayList.size();
                                z11 = false;
                                i12 = 0;
                                while (i12 < size2) {
                                    Object obj14 = arrayList.get(i12);
                                    i12++;
                                    Word word113 = (Word) obj14;
                                    th3 = th3;
                                    String word114 = word113.getWord();
                                    kotlin.jvm.internal.m.e(word114, "getWord(...)");
                                    int[] iArr9 = bq.r.f4959a;
                                    lowerCase = word114.toLowerCase(bq.m.p());
                                    kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                                    String word115 = word.getWord();
                                    kotlin.jvm.internal.m.e(word115, "getWord(...)");
                                    it = it;
                                    lowerCase2 = word115.toLowerCase(bq.m.p());
                                    kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                                    if (!lowerCase.equals(lowerCase2)) {
                                        word2 = word.getWord();
                                        kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                        if (oz.q.i1(word2).toString().length() == 0) {
                                        }
                                    }
                                    z11 = true;
                                }
                                Iterator<Word> it8 = it;
                                th2 = th3;
                                if (!z11) {
                                    arrayList2 = this.f48002n;
                                    if (arrayList2 == null) {
                                        kotlin.jvm.internal.m.n("mOptions");
                                        throw th2;
                                    }
                                    size3 = arrayList2.size();
                                    arrayList3 = this.f48000k;
                                    if (arrayList3 == null) {
                                        kotlin.jvm.internal.m.n("mAnswers");
                                        throw th2;
                                    }
                                    if (size3 < arrayList3.size() + 2) {
                                        arrayList4 = this.f48002n;
                                        if (arrayList4 == null) {
                                            kotlin.jvm.internal.m.n("mOptions");
                                            throw th2;
                                        }
                                        arrayList4.add(word);
                                    } else {
                                        continue;
                                    }
                                }
                                th3 = th2;
                                it = it8;
                            }
                        }
                    }
                }
            }
        }
        Throwable th18 = th3;
        ArrayList arrayList8 = this.f48002n;
        if (arrayList8 != null) {
            Collections.shuffle(arrayList8);
        } else {
            kotlin.jvm.internal.m.n("mOptions");
            throw th18;
        }
    }

    @Override // hi.a
    public final void k() {
        Model_Word_010 model_Word_010 = this.f47999j;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Word word = model_Word_010.getWord();
        kotlin.jvm.internal.m.e(word, "getWord(...)");
        q(zq.c.c(word));
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        FlexboxLayout flexboxLayout = ((hj.z2) aVar).f33658b;
        flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new g4(this, 1)), 0L);
    }

    @Override // qp.d
    public final fz.f n() {
        return i4.f47982a;
    }

    @Override // qp.d
    public final void p() {
        Context context;
        jp.p0 p0Var = (jp.p0) this.f47881a;
        final int i11 = 0;
        p0Var.O(0);
        Model_Word_010 model_Word_010 = this.f47999j;
        if (model_Word_010 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Word word = model_Word_010.getWord();
        kotlin.jvm.internal.m.e(word, "getWord(...)");
        q(zq.c.c(word));
        int[] iArr = bq.r.f4959a;
        int i12 = bq.m.F() ? R.layout.item_cn_word_abs_model_6_elem : R.layout.item_cn_word_abs_model_6_elem_en;
        ArrayList arrayList = this.f48000k;
        if (arrayList == null) {
            kotlin.jvm.internal.m.n("mAnswers");
            throw null;
        }
        int size = arrayList.size();
        int i13 = 0;
        while (true) {
            context = this.f47883c;
            if (i13 >= size) {
                break;
            }
            Object obj = arrayList.get(i13);
            i13++;
            Word word2 = (Word) obj;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            ta.a aVar = this.f47886f;
            kotlin.jvm.internal.m.c(aVar);
            View viewInflate = layoutInflaterFrom.inflate(i12, (ViewGroup) ((hj.z2) aVar).f33659c, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_word);
            ((TextView) viewInflate.findViewById(R.id.tv_pinyin)).setText(word2.getZhuyin());
            textView.setText(word2.getWord());
            viewInflate.setTag(word2);
            bq.z.b(viewInflate, new n2(2, viewInflate, this));
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            ((hj.z2) aVar2).f33659c.addView(viewInflate);
        }
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.z2) aVar3).f33658b.removeAllViews();
        this.f48001l.clear();
        ArrayList arrayList2 = this.f48002n;
        if (arrayList2 == null) {
            kotlin.jvm.internal.m.n("mOptions");
            throw null;
        }
        int size2 = arrayList2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ArrayList arrayList3 = this.f48002n;
            if (arrayList3 == null) {
                kotlin.jvm.internal.m.n("mOptions");
                throw null;
            }
            Word word3 = (Word) arrayList3.get(i14);
            int[] iArr2 = bq.r.f4959a;
            int i15 = !bq.m.F() ? R.layout.item_word_card_framlayout_autofit_en : R.layout.item_word_card_framlayout_autofit;
            LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(context);
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            View viewInflate2 = layoutInflaterFrom2.inflate(i15, (ViewGroup) ((hj.z2) aVar4).f33658b, false);
            kotlin.jvm.internal.m.d(viewInflate2, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) viewInflate2;
            View viewFindViewById = frameLayout.findViewById(R.id.card_item);
            kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById;
            kotlin.jvm.internal.m.f(context, "context");
            cardView.setCardBackgroundColor(context.getColor(R.color.white));
            float fL = ff.h.l(2.0f);
            WeakHashMap weakHashMap = z4.s0.f58893a;
            z4.j0.k(cardView, fL);
            frameLayout.setBackgroundResource(R.drawable.item_leave);
            cardView.setTag(word3);
            t(frameLayout, word3);
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            ((hj.z2) aVar5).f33658b.addView(frameLayout);
            bq.z.b(cardView, new pr.a0(this, word3, cardView, 9));
        }
        String str = this.m;
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        p0Var.H((ImageView) ((b6) ((hj.z2) aVar6).f33660d.f32524c).f32408d, str);
        ef.e.B(o());
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        bq.z.a(((hj.z2) aVar7).f33658b, 0L, new g4(this, 0));
        ta.a aVar8 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar8);
        bq.z.b((ImageView) ((b6) ((hj.z2) aVar8).f33660d.f32524c).f32408d, new fz.c(this) { // from class: qp.h4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j4 f47964b;

            {
                this.f47964b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj2) {
                View it = (View) obj2;
                switch (i11) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        j4 j4Var = this.f47964b;
                        int i16 = j4Var.f48003o;
                        mp.b bVar = j4Var.f47881a;
                        int i17 = i16 + 1;
                        j4Var.f48003o = i17;
                        if (i17 >= 2) {
                            ta.a aVar9 = j4Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar9);
                            if (((TextView) ((hj.z2) aVar9).f33660d.f32525d).getVisibility() != 0) {
                                ta.a aVar10 = j4Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar10);
                                ((TextView) ((hj.z2) aVar10).f33660d.f32525d).setVisibility(0);
                                ta.a aVar11 = j4Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar11);
                                TextView textView2 = (TextView) ((hj.z2) aVar11).f33660d.f32525d;
                                Model_Word_010 model_Word_011 = j4Var.f47999j;
                                if (model_Word_011 == null) {
                                    kotlin.jvm.internal.m.n("mModel");
                                    throw null;
                                }
                                String translations = model_Word_011.getWord().getTranslations();
                                kotlin.jvm.internal.m.e(translations, "getTranslations(...)");
                                textView2.setText(translations);
                            }
                        }
                        ta.a aVar12 = j4Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar12);
                        if (((hj.z2) aVar12).f33661e.f22150c) {
                            String strB = j4Var.b();
                            ta.a aVar13 = j4Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar13);
                            ImageView ivAudio = (ImageView) ((b6) ((hj.z2) aVar13).f33660d.f32524c).f32408d;
                            kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                            ((jp.p0) bVar).J(strB, ivAudio, 0.8f);
                        } else {
                            String strB2 = j4Var.b();
                            ta.a aVar14 = j4Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar14);
                            ImageView ivAudio2 = (ImageView) ((b6) ((hj.z2) aVar14).f33660d.f32524c).f32408d;
                            kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                            ((jp.p0) bVar).H(ivAudio2, strB2);
                        }
                        return qy.b0.f48488a;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        j4 j4Var2 = this.f47964b;
                        ta.a aVar15 = j4Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar15);
                        ((hj.z2) aVar15).f33661e.c();
                        ta.a aVar16 = j4Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar16);
                        if (((hj.z2) aVar16).f33661e.f22150c) {
                            ta.a aVar17 = j4Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar17);
                            ((ImageView) ((b6) ((hj.z2) aVar17).f33660d.f32524c).f32409e).setVisibility(0);
                        } else {
                            ta.a aVar18 = j4Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar18);
                            ((ImageView) ((b6) ((hj.z2) aVar18).f33660d.f32524c).f32409e).setVisibility(8);
                        }
                        ta.a aVar19 = j4Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar19);
                        ((ImageView) ((b6) ((hj.z2) aVar19).f33660d.f32524c).f32408d).performClick();
                        return qy.b0.f48488a;
                }
            }
        });
        ta.a aVar9 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar9);
        final int i16 = 1;
        bq.z.b(((hj.z2) aVar9).f33661e, new fz.c(this) { // from class: qp.h4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j4 f47964b;

            {
                this.f47964b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj2) {
                View it = (View) obj2;
                switch (i16) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        j4 j4Var = this.f47964b;
                        int i17 = j4Var.f48003o;
                        mp.b bVar = j4Var.f47881a;
                        int i18 = i17 + 1;
                        j4Var.f48003o = i18;
                        if (i18 >= 2) {
                            ta.a aVar10 = j4Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar10);
                            if (((TextView) ((hj.z2) aVar10).f33660d.f32525d).getVisibility() != 0) {
                                ta.a aVar11 = j4Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar11);
                                ((TextView) ((hj.z2) aVar11).f33660d.f32525d).setVisibility(0);
                                ta.a aVar12 = j4Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar12);
                                TextView textView2 = (TextView) ((hj.z2) aVar12).f33660d.f32525d;
                                Model_Word_010 model_Word_011 = j4Var.f47999j;
                                if (model_Word_011 == null) {
                                    kotlin.jvm.internal.m.n("mModel");
                                    throw null;
                                }
                                String translations = model_Word_011.getWord().getTranslations();
                                kotlin.jvm.internal.m.e(translations, "getTranslations(...)");
                                textView2.setText(translations);
                            }
                        }
                        ta.a aVar13 = j4Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar13);
                        if (((hj.z2) aVar13).f33661e.f22150c) {
                            String strB = j4Var.b();
                            ta.a aVar14 = j4Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar14);
                            ImageView ivAudio = (ImageView) ((b6) ((hj.z2) aVar14).f33660d.f32524c).f32408d;
                            kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                            ((jp.p0) bVar).J(strB, ivAudio, 0.8f);
                        } else {
                            String strB2 = j4Var.b();
                            ta.a aVar15 = j4Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar15);
                            ImageView ivAudio2 = (ImageView) ((b6) ((hj.z2) aVar15).f33660d.f32524c).f32408d;
                            kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                            ((jp.p0) bVar).H(ivAudio2, strB2);
                        }
                        return qy.b0.f48488a;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        j4 j4Var2 = this.f47964b;
                        ta.a aVar16 = j4Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar16);
                        ((hj.z2) aVar16).f33661e.c();
                        ta.a aVar17 = j4Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar17);
                        if (((hj.z2) aVar17).f33661e.f22150c) {
                            ta.a aVar18 = j4Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar18);
                            ((ImageView) ((b6) ((hj.z2) aVar18).f33660d.f32524c).f32409e).setVisibility(0);
                        } else {
                            ta.a aVar19 = j4Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar19);
                            ((ImageView) ((b6) ((hj.z2) aVar19).f33660d.f32524c).f32409e).setVisibility(8);
                        }
                        ta.a aVar110 = j4Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar110);
                        ((ImageView) ((b6) ((hj.z2) aVar110).f33660d.f32524c).f32408d).performClick();
                        return qy.b0.f48488a;
                }
            }
        });
    }

    public final void t(View view, Word word) {
        TextView textView = (TextView) view.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
        textView3.setVisibility(8);
        textView.setVisibility(8);
        kotlin.jvm.internal.m.c(textView2);
        Context context = this.f47883c;
        ff.h.L(context, textView2, 18);
        textView.setTextSize(8.0f);
        textView3.setTextSize(8.0f);
        textView2.setTextColor(context.getColor(R.color.primary_black));
        if (u()) {
            boolean z11 = ((jp.p0) this.f47881a).Q;
            zq.c.e(word, textView, textView2, textView3, true);
        } else {
            textView.setVisibility(8);
            textView3.setVisibility(8);
            textView2.setText(word.getWord());
        }
        ef.e.B(view);
    }
}
