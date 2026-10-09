package qp;

import android.widget.TextView;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Model_Word_010;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.data.env.Env;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u4 extends t4 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f48216p;

    public u4(mp.b bVar, long j11) {
        super(bVar, j11);
        this.f48216p = nv.p.m(j11, "0;", ";10");
    }

    @Override // qp.t4, hi.a
    public final String c() {
        return this.f48216p;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x007f  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:29:0x00db  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:33:0x0127  */
    /* JADX WARN: Code duplicated, block: B:36:0x013d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0165  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0186 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0160 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // qp.t4, hi.a
    public final void j() throws NoSuchElemException {
        ArrayList arrayListF;
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
        this.f48205j = qi.b.f(word3);
        this.f48206k = new ArrayList();
        List listV = v();
        Word word4 = u().getWord();
        kotlin.jvm.internal.m.e(word4, "getWord(...)");
        ((ArrayList) listV).addAll(qi.b.f(word4));
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().keyLanguage == 12 || cf.x.n().keyLanguage == 1) {
            Long[] lArr = this.f48208n;
            if (ns.o.L(Arrays.copyOf(lArr, lArr.length)).contains(Long.valueOf(u().getWordId()))) {
                for (Word word5 : u().getOptionList()) {
                    if (word5.getWordId() != u().getWordId()) {
                        arrayListF = qi.b.f(word5);
                        size = arrayListF.size();
                        i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayListF.get(i11);
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
                            arrayListF = qi.b.f(word5);
                            size = arrayListF.size();
                            i11 = 0;
                            while (i11 < size) {
                                Object obj3 = arrayListF.get(i11);
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
                        arrayListF = qi.b.f(word5);
                        size = arrayListF.size();
                        i11 = 0;
                        while (i11 < size) {
                            Object obj5 = arrayListF.get(i11);
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
                        arrayListF = qi.b.f(word5);
                        size = arrayListF.size();
                        i11 = 0;
                        while (i11 < size) {
                            Object obj7 = arrayListF.get(i11);
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
        qy.q qVar = fv.b.f28186a;
        fv.b.Y(u().getWordId(), null, null);
    }

    @Override // qp.t4
    public final void w(Word word, TextView textView, TextView textView2, TextView textView3) {
        kotlin.jvm.internal.m.f(word, "word");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().keyLanguage != 12 && cf.x.n().keyLanguage != 1) {
            boolean z11 = ((jp.p0) this.f47881a).Q;
            zq.c.e(word, textView2, textView, textView3, true);
            return;
        }
        int i11 = this.f47884d.jsDisPlay;
        if (i11 == 2 || i11 == 4) {
            textView.setText(word.getLuoma());
        } else {
            if (i11 != 5) {
                textView.setText(word.getWord());
                return;
            }
            textView3.setVisibility(0);
            textView.setText(word.getWord());
            textView3.setText(word.getLuoma());
        }
    }

    @Override // qp.t4
    public final void y() {
        String translations;
        String word;
        String zhuyin;
        String strG0;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.c3) aVar).f32461g.setText(u().getWord().getTranslations());
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = cf.x.n().keyLanguage;
        Env env = this.f47884d;
        if (i11 == 12 || cf.x.n().keyLanguage == 1) {
            switch (env.jsDisPlay) {
                case 0:
                    translations = u().getWord().getTranslations();
                    word = u().getWord().getWord();
                    zhuyin = u().getWord().getZhuyin();
                    strG0 = w4.c.h(translations, "\n", word, " / ", zhuyin);
                    break;
                case 1:
                    strG0 = oz.r.g0("\n                    " + u().getWord().getTranslations() + "\n                    " + u().getWord().getZhuyin() + "\n                    ");
                    break;
                case 2:
                    strG0 = oz.r.g0("\n                    " + u().getWord().getTranslations() + "\n                    " + u().getWord().getLuoma() + "\n                    ");
                    break;
                case 3:
                    translations = u().getWord().getTranslations();
                    word = u().getWord().getWord();
                    zhuyin = u().getWord().getZhuyin();
                    strG0 = w4.c.h(translations, "\n", word, " / ", zhuyin);
                    break;
                case 4:
                    translations = u().getWord().getTranslations();
                    word = u().getWord().getWord();
                    zhuyin = u().getWord().getLuoma();
                    strG0 = w4.c.h(translations, "\n", word, " / ", zhuyin);
                    break;
                case 5:
                    translations = u().getWord().getTranslations();
                    word = u().getWord().getZhuyin();
                    zhuyin = u().getWord().getLuoma();
                    strG0 = w4.c.h(translations, "\n", word, " / ", zhuyin);
                    break;
                case 6:
                    translations = u().getWord().getTranslations();
                    word = u().getWord().getWord();
                    zhuyin = u().getWord().getZhuyin();
                    strG0 = w4.c.h(translations, "\n", word, " / ", zhuyin);
                    break;
                default:
                    translations = u().getWord().getTranslations();
                    word = u().getWord().getWord();
                    zhuyin = u().getWord().getZhuyin();
                    strG0 = w4.c.h(translations, "\n", word, " / ", zhuyin);
                    break;
            }
        } else {
            Word word2 = u().getWord();
            kotlin.jvm.internal.m.e(word2, "getWord(...)");
            strG0 = zq.c.c(word2);
        }
        q(strG0);
        int i12 = env.jsDisPlay;
    }

    @Override // qp.t4
    public final boolean z() {
        int[] iArr = bq.r.f4959a;
        return bq.m.F();
    }
}
