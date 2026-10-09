package bh;

import android.net.Uri;
import com.lingo.lingoskill.object.ConvertUtilsKt;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f4251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set f4253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1 f4254e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(Set set, s1 s1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4250a = i11;
        this.f4253d = set;
        this.f4254e = s1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4250a) {
            case 0:
                return new j1(this.f4253d, this.f4254e, dVar, 0);
            case 1:
                return new j1(this.f4253d, this.f4254e, dVar, 1);
            default:
                return new j1(this.f4253d, this.f4254e, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4250a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((j1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0283  */
    /* JADX WARN: Code duplicated, block: B:122:0x0293 A[LOOP:6: B:120:0x028d->B:122:0x0293, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:128:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:133:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:176:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:180:0x03db A[LOOP:11: B:178:0x03d5->B:180:0x03db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x0404  */
    /* JADX WARN: Code duplicated, block: B:195:0x0436  */
    /* JADX WARN: Code duplicated, block: B:198:0x0455  */
    /* JADX WARN: Code duplicated, block: B:200:0x046c  */
    /* JADX WARN: Code duplicated, block: B:204:0x047b  */
    /* JADX WARN: Code duplicated, block: B:213:0x048f  */
    /* JADX WARN: Code duplicated, block: B:216:0x049e  */
    /* JADX WARN: Code duplicated, block: B:232:0x054e  */
    /* JADX WARN: Code duplicated, block: B:241:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x0480 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x0312 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x02e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0422 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0551 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x046f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x04b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x0498 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5 A[LOOP:0: B:38:0x00bf->B:40:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:46:0x0104  */
    /* JADX WARN: Code duplicated, block: B:48:0x011d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:55:0x0145 A[Catch: CancellationException -> 0x0173, Exception -> 0x0175, TRY_LEAVE, TryCatch #5 {Exception -> 0x0175, blocks: (B:53:0x0135, B:55:0x0145), top: B:241:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x017e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0180  */
    /* JADX WARN: Code duplicated, block: B:68:0x018d  */
    /* JADX WARN: Code duplicated, block: B:69:0x018f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0194  */
    /* JADX WARN: Code duplicated, block: B:73:0x0196  */
    /* JADX WARN: Code duplicated, block: B:76:0x019b  */
    /* JADX WARN: Code duplicated, block: B:77:0x019d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c4  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objT;
        Object objT2;
        ArrayList arrayList;
        qy.l lVar;
        int iW;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList2;
        Map mapG0;
        ArrayList arrayList3;
        int size;
        Sentence sentence;
        List list;
        ArrayList arrayList4;
        Iterator it;
        List<Word> sentWords;
        ArrayList arrayList5;
        Iterator<T> it2;
        ArrayList arrayList6;
        qy.l lVar2;
        CourseWord courseWord;
        Word word;
        qy.l lVar3;
        Object objT3;
        Object objT4;
        ArrayList arrayList7;
        qy.l lVar4;
        int iW2;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList8;
        int size2;
        Sentence sentence2;
        List list2;
        ArrayList arrayList9;
        Iterator it3;
        qy.l lVar5;
        Word word2;
        Object objT5;
        Object objT6;
        ArrayList arrayList10;
        qy.l lVar6;
        int i11;
        int iW3;
        LinkedHashMap linkedHashMap3;
        LinkedHashSet linkedHashSet;
        int size3;
        int i12;
        Sentence sentence3;
        List list3;
        ArrayList arrayList11;
        Iterator it4;
        int i13;
        ArrayList arrayList12;
        ArrayList arrayList13;
        Long l9;
        boolean z11;
        boolean z12;
        boolean z13;
        int size4;
        int i14;
        Word word3;
        switch (this.f4250a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f4252c;
                int i16 = 0;
                s1 s1Var = this.f4254e;
                if (i15 != 0) {
                    if (i15 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objT = obj;
                    } else {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        arrayList = this.f4251b;
                        com.bumptech.glide.e.F(obj);
                        objT2 = obj;
                    }
                    Iterable iterable = (Iterable) objT2;
                    iW = ry.x.W(ry.n.W(iterable, 10));
                    if (iW < 16) {
                        iW = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iW);
                    for (Object obj2 : iterable) {
                        linkedHashMap.put(new Long(((Word) obj2).getWordId()), obj2);
                    }
                    Collection<Word> collectionValues = linkedHashMap.values();
                    arrayList2 = new ArrayList();
                    for (Word word4 : collectionValues) {
                        try {
                            lVar3 = new qy.l(new Long(word4.getWordId()), ConvertUtilsKt.toWordItem(word4));
                        } catch (CancellationException e8) {
                            throw e8;
                        } catch (Exception unused) {
                            lVar3 = null;
                        }
                        if (lVar3 != null) {
                            arrayList2.add(lVar3);
                        }
                        break;
                    }
                    mapG0 = ry.x.g0(arrayList2);
                    arrayList3 = new ArrayList();
                    size = arrayList.size();
                    while (i16 < size) {
                        Object obj3 = arrayList.get(i16);
                        i16++;
                        qy.l lVar7 = (qy.l) obj3;
                        sentence = (Sentence) lVar7.f48495a;
                        list = (List) lVar7.f48496b;
                        arrayList4 = new ArrayList();
                        it = list.iterator();
                        while (it.hasNext()) {
                            word = (Word) linkedHashMap.get(new Long(((Number) it.next()).longValue()));
                            if (word != null) {
                                arrayList4.add(word);
                            }
                        }
                        if (arrayList4.size() != list.size()) {
                            arrayList6 = arrayList;
                            lVar2 = null;
                        } else {
                            try {
                                sentence.setSentWords(arrayList4);
                                sentWords = sentence.getSentWords();
                            } catch (CancellationException e10) {
                                throw e10;
                            } catch (Exception unused2) {
                                sentWords = null;
                            }
                            if (sentWords == null) {
                                arrayList6 = arrayList;
                                lVar2 = null;
                            } else {
                                arrayList5 = new ArrayList();
                                it2 = sentWords.iterator();
                                while (it2.hasNext()) {
                                    courseWord = (CourseWord) mapG0.get(new Long(((Word) it2.next()).getWordId()));
                                    if (courseWord != null) {
                                        arrayList5.add(courseWord);
                                    }
                                }
                                if (arrayList5.isEmpty() && arrayList5.size() == sentWords.size()) {
                                    try {
                                        try {
                                            Long l11 = new Long(sentence.getSentenceId());
                                            long sentenceId = sentence.getSentenceId();
                                            String sentence4 = sentence.getSentence();
                                            kotlin.jvm.internal.m.e(sentence4, "getSentence(...)");
                                            String wordList = sentence.getWordList();
                                            kotlin.jvm.internal.m.e(wordList, "getWordList(...)");
                                            String dirCode = sentence.getDirCode();
                                            kotlin.jvm.internal.m.e(dirCode, "getDirCode(...)");
                                            String translations = sentence.getTranslations();
                                            kotlin.jvm.internal.m.e(translations, "getTranslations(...)");
                                            int i17 = ((fr.o0) s1Var.f4362c).f27733a.keyLanguage;
                                            arrayList6 = arrayList;
                                            try {
                                                Uri EMPTY = Uri.EMPTY;
                                                kotlin.jvm.internal.m.e(EMPTY, "EMPTY");
                                                lVar2 = new qy.l(l11, new CourseSentence(sentenceId, sentence4, wordList, dirCode, translations, BuildConfig.VERSION_NAME, EMPTY, EMPTY, null, false, false, false, arrayList5, c.a.G(i17, arrayList5), null, null, null, null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, 8376064, null));
                                            } catch (Exception unused3) {
                                                lVar2 = null;
                                            }
                                        } catch (Exception unused4) {
                                            arrayList6 = arrayList;
                                        }
                                    } catch (CancellationException e11) {
                                        throw e11;
                                    }
                                } else {
                                    arrayList6 = arrayList;
                                    lVar2 = null;
                                }
                            }
                        }
                        if (lVar2 != null) {
                            arrayList3.add(lVar2);
                        }
                        arrayList = arrayList6;
                        break;
                    }
                    return ry.x.g0(arrayList3);
                }
                com.bumptech.glide.e.F(obj);
                Set set = this.f4253d;
                h1 h1Var = new h1(s1Var, null);
                this.f4252c = 1;
                objT = vc.a.t(set, h1Var, this);
                if (objT == aVar) {
                    return aVar;
                }
                ArrayList arrayList14 = new ArrayList();
                for (Sentence sentence5 : (List) objT) {
                    try {
                        String wordList2 = sentence5.getWordList();
                        kotlin.jvm.internal.m.e(wordList2, "getWordList(...)");
                        lVar = new qy.l(sentence5, ks.b.n(wordList2));
                    } catch (CancellationException e12) {
                        throw e12;
                    } catch (Exception unused5) {
                        lVar = null;
                    }
                    if (lVar != null) {
                        arrayList14.add(lVar);
                    }
                    break;
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size5 = arrayList14.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj4 = arrayList14.get(i18);
                    i18++;
                    ry.m.d0(linkedHashSet2, (Iterable) ((qy.l) obj4).f48496b);
                }
                i1 i1Var = new i1(s1Var, null);
                this.f4251b = arrayList14;
                this.f4252c = 2;
                objT2 = vc.a.t(linkedHashSet2, i1Var, this);
                if (objT2 == aVar) {
                    return aVar;
                }
                arrayList = arrayList14;
                Iterable iterable2 = (Iterable) objT2;
                iW = ry.x.W(ry.n.W(iterable2, 10));
                if (iW < 16) {
                    iW = 16;
                }
                linkedHashMap = new LinkedHashMap(iW);
                while (r2.hasNext()) {
                    linkedHashMap.put(new Long(((Word) obj2).getWordId()), obj2);
                }
                Collection<Word> collectionValues2 = linkedHashMap.values();
                arrayList2 = new ArrayList();
                while (r2.hasNext()) {
                    lVar3 = new qy.l(new Long(word4.getWordId()), ConvertUtilsKt.toWordItem(word4));
                    if (lVar3 != null) {
                        arrayList2.add(lVar3);
                    }
                }
                mapG0 = ry.x.g0(arrayList2);
                arrayList3 = new ArrayList();
                size = arrayList.size();
                while (i16 < size) {
                    Object obj5 = arrayList.get(i16);
                    i16++;
                    qy.l lVar8 = (qy.l) obj5;
                    sentence = (Sentence) lVar8.f48495a;
                    list = (List) lVar8.f48496b;
                    arrayList4 = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                        word = (Word) linkedHashMap.get(new Long(((Number) it.next()).longValue()));
                        if (word != null) {
                            arrayList4.add(word);
                        }
                    }
                    if (arrayList4.size() != list.size()) {
                        arrayList6 = arrayList;
                        lVar2 = null;
                    } else {
                        sentence.setSentWords(arrayList4);
                        sentWords = sentence.getSentWords();
                        if (sentWords == null) {
                            arrayList6 = arrayList;
                            lVar2 = null;
                        } else {
                            arrayList5 = new ArrayList();
                            it2 = sentWords.iterator();
                            while (it2.hasNext()) {
                                courseWord = (CourseWord) mapG0.get(new Long(((Word) it2.next()).getWordId()));
                                if (courseWord != null) {
                                    arrayList5.add(courseWord);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                arrayList6 = arrayList;
                                lVar2 = null;
                            } else {
                                arrayList6 = arrayList;
                                lVar2 = null;
                            }
                        }
                    }
                    if (lVar2 != null) {
                        arrayList3.add(lVar2);
                    }
                    arrayList = arrayList6;
                }
                return ry.x.g0(arrayList3);
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i19 = this.f4252c;
                int i21 = 0;
                s1 s1Var2 = this.f4254e;
                if (i19 != 0) {
                    if (i19 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objT3 = obj;
                    } else {
                        if (i19 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        arrayList7 = this.f4251b;
                        com.bumptech.glide.e.F(obj);
                        objT4 = obj;
                    }
                    Iterable iterable3 = (Iterable) objT4;
                    iW2 = ry.x.W(ry.n.W(iterable3, 10));
                    if (iW2 < 16) {
                        iW2 = 16;
                    }
                    linkedHashMap2 = new LinkedHashMap(iW2);
                    for (Object obj6 : iterable3) {
                        linkedHashMap2.put(new Long(((Word) obj6).getWordId()), obj6);
                    }
                    arrayList8 = new ArrayList();
                    size2 = arrayList7.size();
                    while (i21 < size2) {
                        Object obj7 = arrayList7.get(i21);
                        i21++;
                        qy.l lVar9 = (qy.l) obj7;
                        sentence2 = (Sentence) lVar9.f48495a;
                        list2 = (List) lVar9.f48496b;
                        arrayList9 = new ArrayList();
                        it3 = list2.iterator();
                        while (it3.hasNext()) {
                            word2 = (Word) linkedHashMap2.get(new Long(((Number) it3.next()).longValue()));
                            if (word2 != null) {
                                arrayList9.add(word2);
                            }
                        }
                        if (arrayList9.size() == list2.size()) {
                            lVar5 = null;
                        } else {
                            try {
                                Long l12 = new Long(sentence2.getSentenceId());
                                sentence2.setSentWords(arrayList9);
                                lVar5 = new qy.l(l12, ConvertUtilsKt.toSentenceItem(sentence2));
                            } catch (CancellationException e13) {
                                throw e13;
                            } catch (Exception unused6) {
                                lVar5 = null;
                            }
                        }
                        if (lVar5 != null) {
                            arrayList8.add(lVar5);
                        }
                        break;
                    }
                    return ry.x.g0(arrayList8);
                }
                com.bumptech.glide.e.F(obj);
                Set set2 = this.f4253d;
                l1 l1Var = new l1(s1Var2, null);
                this.f4252c = 1;
                objT3 = vc.a.t(set2, l1Var, this);
                if (objT3 == aVar2) {
                    return aVar2;
                }
                ArrayList arrayList15 = new ArrayList();
                for (Sentence sentence6 : (List) objT3) {
                    try {
                        String wordList3 = sentence6.getWordList();
                        kotlin.jvm.internal.m.e(wordList3, "getWordList(...)");
                        lVar4 = new qy.l(sentence6, ks.b.n(wordList3));
                    } catch (CancellationException e14) {
                        throw e14;
                    } catch (Exception unused7) {
                        lVar4 = null;
                    }
                    if (lVar4 != null) {
                        arrayList15.add(lVar4);
                    }
                    break;
                }
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                int size6 = arrayList15.size();
                int i22 = 0;
                while (i22 < size6) {
                    Object obj8 = arrayList15.get(i22);
                    i22++;
                    ry.m.d0(linkedHashSet3, (Iterable) ((qy.l) obj8).f48496b);
                }
                m1 m1Var = new m1(s1Var2, null);
                this.f4251b = arrayList15;
                this.f4252c = 2;
                objT4 = vc.a.t(linkedHashSet3, m1Var, this);
                if (objT4 == aVar2) {
                    return aVar2;
                }
                arrayList7 = arrayList15;
                Iterable iterable4 = (Iterable) objT4;
                iW2 = ry.x.W(ry.n.W(iterable4, 10));
                if (iW2 < 16) {
                    iW2 = 16;
                }
                linkedHashMap2 = new LinkedHashMap(iW2);
                while (r2.hasNext()) {
                    linkedHashMap2.put(new Long(((Word) obj6).getWordId()), obj6);
                }
                arrayList8 = new ArrayList();
                size2 = arrayList7.size();
                while (i21 < size2) {
                    Object obj9 = arrayList7.get(i21);
                    i21++;
                    qy.l lVar10 = (qy.l) obj9;
                    sentence2 = (Sentence) lVar10.f48495a;
                    list2 = (List) lVar10.f48496b;
                    arrayList9 = new ArrayList();
                    it3 = list2.iterator();
                    while (it3.hasNext()) {
                        word2 = (Word) linkedHashMap2.get(new Long(((Number) it3.next()).longValue()));
                        if (word2 != null) {
                            arrayList9.add(word2);
                        }
                    }
                    if (arrayList9.size() == list2.size()) {
                        Long l13 = new Long(sentence2.getSentenceId());
                        sentence2.setSentWords(arrayList9);
                        lVar5 = new qy.l(l13, ConvertUtilsKt.toSentenceItem(sentence2));
                    } else {
                        lVar5 = null;
                    }
                    if (lVar5 != null) {
                        arrayList8.add(lVar5);
                    }
                    break;
                }
                return ry.x.g0(arrayList8);
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f4252c;
                s1 s1Var3 = this.f4254e;
                int i24 = 2;
                Long l14 = null;
                if (i23 != 0) {
                    if (i23 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objT5 = obj;
                    } else {
                        if (i23 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        arrayList10 = this.f4251b;
                        com.bumptech.glide.e.F(obj);
                        objT6 = obj;
                    }
                    Iterable iterable5 = (Iterable) objT6;
                    i11 = 10;
                    iW3 = ry.x.W(ry.n.W(iterable5, 10));
                    if (iW3 < 16) {
                        iW3 = 16;
                    }
                    linkedHashMap3 = new LinkedHashMap(iW3);
                    for (Object obj10 : iterable5) {
                        linkedHashMap3.put(new Long(((Word) obj10).getWordId()), obj10);
                    }
                    linkedHashSet = new LinkedHashSet();
                    size3 = arrayList10.size();
                    i12 = 0;
                    while (i12 < size3) {
                        Object obj11 = arrayList10.get(i12);
                        i12++;
                        qy.l lVar11 = (qy.l) obj11;
                        sentence3 = (Sentence) lVar11.f48495a;
                        list3 = (List) lVar11.f48496b;
                        arrayList11 = new ArrayList();
                        it4 = list3.iterator();
                        while (it4.hasNext()) {
                            int i25 = i24;
                            word3 = (Word) linkedHashMap3.get(new Long(((Number) it4.next()).longValue()));
                            if (word3 != null) {
                                arrayList11.add(word3);
                            }
                            i24 = i25;
                        }
                        i13 = i24;
                        if (arrayList11.size() != list3.size()) {
                            arrayList12 = arrayList10;
                            l9 = l14;
                        } else {
                            try {
                                try {
                                    arrayList13 = new ArrayList(ry.n.W(arrayList11, i11));
                                    size4 = arrayList11.size();
                                    i14 = 0;
                                    while (i14 < size4) {
                                        Object obj12 = arrayList11.get(i14);
                                        i14++;
                                        Word word5 = (Word) obj12;
                                        String word6 = word5.getWord();
                                        kotlin.jvm.internal.m.e(word6, "getWord(...)");
                                        String zhuyin = word5.getZhuyin();
                                        arrayList12 = arrayList10;
                                        try {
                                            kotlin.jvm.internal.m.e(zhuyin, "getZhuyin(...)");
                                            arrayList13.add(new rs.g(word6, zhuyin, word5.getWordType()));
                                            arrayList10 = arrayList12;
                                        } catch (Exception unused8) {
                                            arrayList13 = null;
                                            if (arrayList13 == null) {
                                                l9 = null;
                                            } else {
                                                l9 = new Long(sentence3.getSentenceId());
                                                if (sentence3.Sentence != null) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (sentence3.Translations != null) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if (sentence3.DirCode != null) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                if (!rs.c.b(z11, z12, z13, arrayList13, ry.l.D(new Integer[]{13, Integer.valueOf(i13)}, Integer.valueOf(((fr.o0) s1Var3.f4362c).f27733a.keyLanguage)))) {
                                                    l9 = null;
                                                }
                                            }
                                            if (l9 != null) {
                                                linkedHashSet.add(l9);
                                            }
                                            i24 = i13;
                                            arrayList10 = arrayList12;
                                            l14 = null;
                                            i11 = 10;
                                        }
                                    }
                                    arrayList12 = arrayList10;
                                } catch (Exception unused9) {
                                    arrayList12 = arrayList10;
                                }
                                if (arrayList13 == null) {
                                    l9 = null;
                                } else {
                                    l9 = new Long(sentence3.getSentenceId());
                                    if (sentence3.Sentence != null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (sentence3.Translations != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (sentence3.DirCode != null) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (!rs.c.b(z11, z12, z13, arrayList13, ry.l.D(new Integer[]{13, Integer.valueOf(i13)}, Integer.valueOf(((fr.o0) s1Var3.f4362c).f27733a.keyLanguage)))) {
                                        l9 = null;
                                    }
                                }
                            } catch (CancellationException e15) {
                                throw e15;
                            }
                        }
                        if (l9 != null) {
                            linkedHashSet.add(l9);
                        }
                        i24 = i13;
                        arrayList10 = arrayList12;
                        l14 = null;
                        i11 = 10;
                    }
                    return linkedHashSet;
                }
                com.bumptech.glide.e.F(obj);
                Set set3 = this.f4253d;
                p1 p1Var = new p1(s1Var3, null);
                this.f4252c = 1;
                objT5 = vc.a.t(set3, p1Var, this);
                if (objT5 == aVar3) {
                    return aVar3;
                }
                ArrayList arrayList16 = new ArrayList();
                for (Sentence sentence7 : (List) objT5) {
                    try {
                        String wordList4 = sentence7.getWordList();
                        kotlin.jvm.internal.m.e(wordList4, "getWordList(...)");
                        lVar6 = new qy.l(sentence7, ks.b.n(wordList4));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception unused10) {
                        lVar6 = null;
                    }
                    if (lVar6 != null) {
                        arrayList16.add(lVar6);
                    }
                    break;
                }
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                int size7 = arrayList16.size();
                int i26 = 0;
                while (i26 < size7) {
                    Object obj13 = arrayList16.get(i26);
                    i26++;
                    ry.m.d0(linkedHashSet4, (Iterable) ((qy.l) obj13).f48496b);
                }
                q1 q1Var = new q1(s1Var3, null);
                this.f4251b = arrayList16;
                this.f4252c = 2;
                objT6 = vc.a.t(linkedHashSet4, q1Var, this);
                if (objT6 == aVar3) {
                    return aVar3;
                }
                arrayList10 = arrayList16;
                Iterable iterable6 = (Iterable) objT6;
                i11 = 10;
                iW3 = ry.x.W(ry.n.W(iterable6, 10));
                if (iW3 < 16) {
                    iW3 = 16;
                }
                linkedHashMap3 = new LinkedHashMap(iW3);
                while (r2.hasNext()) {
                    linkedHashMap3.put(new Long(((Word) obj10).getWordId()), obj10);
                }
                linkedHashSet = new LinkedHashSet();
                size3 = arrayList10.size();
                i12 = 0;
                while (i12 < size3) {
                    Object obj14 = arrayList10.get(i12);
                    i12++;
                    qy.l lVar12 = (qy.l) obj14;
                    sentence3 = (Sentence) lVar12.f48495a;
                    list3 = (List) lVar12.f48496b;
                    arrayList11 = new ArrayList();
                    it4 = list3.iterator();
                    while (it4.hasNext()) {
                        int i27 = i24;
                        word3 = (Word) linkedHashMap3.get(new Long(((Number) it4.next()).longValue()));
                        if (word3 != null) {
                            arrayList11.add(word3);
                        }
                        i24 = i27;
                    }
                    i13 = i24;
                    if (arrayList11.size() != list3.size()) {
                        arrayList12 = arrayList10;
                        l9 = l14;
                    } else {
                        arrayList13 = new ArrayList(ry.n.W(arrayList11, i11));
                        size4 = arrayList11.size();
                        i14 = 0;
                        while (i14 < size4) {
                            Object obj15 = arrayList11.get(i14);
                            i14++;
                            Word word7 = (Word) obj15;
                            String word8 = word7.getWord();
                            kotlin.jvm.internal.m.e(word8, "getWord(...)");
                            String zhuyin2 = word7.getZhuyin();
                            arrayList12 = arrayList10;
                            kotlin.jvm.internal.m.e(zhuyin2, "getZhuyin(...)");
                            arrayList13.add(new rs.g(word8, zhuyin2, word7.getWordType()));
                            arrayList10 = arrayList12;
                        }
                        arrayList12 = arrayList10;
                        if (arrayList13 == null) {
                            l9 = null;
                        } else {
                            l9 = new Long(sentence3.getSentenceId());
                            if (sentence3.Sentence != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (sentence3.Translations != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (sentence3.DirCode != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!rs.c.b(z11, z12, z13, arrayList13, ry.l.D(new Integer[]{13, Integer.valueOf(i13)}, Integer.valueOf(((fr.o0) s1Var3.f4362c).f27733a.keyLanguage)))) {
                                l9 = null;
                            }
                        }
                    }
                    if (l9 != null) {
                        linkedHashSet.add(l9);
                    }
                    i24 = i13;
                    arrayList10 = arrayList12;
                    l14 = null;
                    i11 = 10;
                }
                return linkedHashSet;
        }
    }
}
