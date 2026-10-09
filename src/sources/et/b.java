package et;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f25830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f25831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f25832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f25833e;

    public /* synthetic */ b(o oVar, fz.a aVar, fz.c cVar, rz.b0 b0Var, int i11) {
        this.f25829a = i11;
        this.f25830b = oVar;
        this.f25831c = aVar;
        this.f25832d = cVar;
        this.f25833e = b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x029c  */
    /* JADX WARN: Code duplicated, block: B:104:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:107:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:149:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:150:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:153:0x0414  */
    /* JADX WARN: Code duplicated, block: B:155:0x0421  */
    /* JADX WARN: Code duplicated, block: B:184:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0477 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0112  */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:58:0x013b  */
    @Override // fz.c
    public final Object invoke(Object obj) {
        Object obj2;
        CourseWord courseWord;
        String lowerCase;
        ArrayList arrayList;
        String word;
        int i11;
        Object obj3;
        CourseWord courseWord2;
        String lowerCase2;
        ArrayList arrayList2;
        String word2;
        Object obj4;
        CourseWord courseWord3;
        String lowerCase3;
        ArrayList arrayList3;
        String word3;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f25829a) {
            case 0:
                CourseWord optionWord = (CourseWord) obj;
                kotlin.jvm.internal.m.f(optionWord, "optionWord");
                o oVar = this.f25830b;
                l lVar = (l) oVar;
                CourseSentence courseSentence = lVar.f25889a;
                ot.l lVar2 = lVar.f25890b;
                List list = lVar2.f45880c;
                Iterator<T> it = courseSentence.getDisplayCourseWords().iterator();
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    obj2 = null;
                    z11 = false;
                    if (it.hasNext()) {
                        int i14 = i13 + 1;
                        courseWord = (CourseWord) it.next();
                        if (!kotlin.jvm.internal.m.a(((CourseWord) list.get(i13)).getWord(), "_____")) {
                            i13 = i14;
                        }
                    } else {
                        i13 = -1;
                        courseWord = null;
                    }
                }
                String word4 = optionWord.getWord();
                Locale locale = Locale.ROOT;
                String lowerCase4 = word4.toLowerCase(locale);
                kotlin.jvm.internal.m.e(lowerCase4, "toLowerCase(...)");
                if (courseWord == null || (word = courseWord.getWord()) == null) {
                    lowerCase = null;
                } else {
                    lowerCase = word.toLowerCase(locale);
                    kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                }
                boolean zEquals = lowerCase4.equals(lowerCase);
                fz.c cVar = this.f25832d;
                if (zEquals) {
                    ArrayList arrayList4 = new ArrayList(ry.n.W(list, 10));
                    int i15 = 0;
                    for (Object obj5 : list) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        CourseWord courseWord4 = (CourseWord) obj5;
                        if (courseWord4.isQuestionWord() && i13 == i15) {
                            kotlin.jvm.internal.m.c(courseWord);
                            courseWord4 = courseWord;
                        }
                        arrayList4.add(courseWord4);
                        i15 = i16;
                    }
                    int size = arrayList4.size();
                    while (i12 < size) {
                        Object obj6 = arrayList4.get(i12);
                        i12++;
                        if (((CourseWord) obj6).isQuestionWord()) {
                            obj2 = obj6;
                            if (obj2 == null) {
                                this.f25831c.invoke();
                            } else {
                                CourseSentence courseSentence2 = lVar.f25889a;
                                List<CourseWord> list2 = lVar2.f45881d;
                                arrayList = new ArrayList(ry.n.W(list2, 10));
                                for (CourseWord courseWordCopy$default : list2) {
                                    if (kotlin.jvm.internal.m.a(courseWordCopy$default, optionWord)) {
                                        courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null);
                                    }
                                    arrayList.add(courseWordCopy$default);
                                }
                                cVar.invoke(new l(courseSentence2, ot.l.a(lVar2, arrayList4, arrayList, 3)));
                            }
                        }
                    }
                    if (obj2 == null) {
                        this.f25831c.invoke();
                    } else {
                        CourseSentence courseSentence3 = lVar.f25889a;
                        List<CourseWord> list3 = lVar2.f45881d;
                        arrayList = new ArrayList(ry.n.W(list3, 10));
                        while (r4.hasNext()) {
                            if (kotlin.jvm.internal.m.a(courseWordCopy$default, optionWord)) {
                                courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null);
                            }
                            arrayList.add(courseWordCopy$default);
                        }
                        cVar.invoke(new l(courseSentence3, ot.l.a(lVar2, arrayList4, arrayList, 3)));
                    }
                } else {
                    rz.e0.B(this.f25833e, null, null, new f(cVar, oVar, optionWord, z11 ? 1 : 0, 2), 3);
                }
                return qy.b0.f48488a;
            case 1:
                CourseWord optionWord2 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(optionWord2, "optionWord");
                o oVar2 = this.f25830b;
                m mVar = (m) oVar2;
                CourseSentence courseSentence4 = mVar.f25891a;
                ArrayList arrayList5 = mVar.f25892b;
                Iterator<T> it2 = courseSentence4.getDisplayCourseWords().iterator();
                int i17 = 0;
                int i18 = 0;
                while (true) {
                    i11 = i17;
                    obj3 = null;
                    z12 = false;
                    if (it2.hasNext()) {
                        int i19 = i18 + 1;
                        courseWord2 = (CourseWord) it2.next();
                        if (!kotlin.jvm.internal.m.a(((CourseWord) arrayList5.get(i18)).getWord(), "_____")) {
                            i18 = i19;
                            i17 = i11;
                        }
                    } else {
                        i18 = -1;
                        courseWord2 = null;
                    }
                }
                String word5 = optionWord2.getWord();
                Locale locale2 = Locale.ROOT;
                String lowerCase5 = word5.toLowerCase(locale2);
                kotlin.jvm.internal.m.e(lowerCase5, "toLowerCase(...)");
                if (courseWord2 == null || (word2 = courseWord2.getWord()) == null) {
                    lowerCase2 = null;
                } else {
                    lowerCase2 = word2.toLowerCase(locale2);
                    kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                }
                boolean zEquals2 = lowerCase5.equals(lowerCase2);
                fz.c cVar2 = this.f25832d;
                if (zEquals2) {
                    ArrayList arrayList6 = new ArrayList(ry.n.W(arrayList5, 10));
                    int size2 = arrayList5.size();
                    int i21 = i11;
                    int i22 = i21;
                    while (i22 < size2) {
                        Object obj7 = arrayList5.get(i22);
                        i22++;
                        int i23 = i21 + 1;
                        if (i21 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        CourseWord courseWord5 = (CourseWord) obj7;
                        if (courseWord5.isQuestionWord() && i18 == i21) {
                            kotlin.jvm.internal.m.c(courseWord2);
                            courseWord5 = courseWord2;
                        }
                        arrayList6.add(courseWord5);
                        i21 = i23;
                    }
                    int size3 = arrayList6.size();
                    while (i11 < size3) {
                        Object obj8 = arrayList6.get(i11);
                        i11++;
                        if (((CourseWord) obj8).isQuestionWord()) {
                            obj3 = obj8;
                            if (obj3 == null) {
                                this.f25831c.invoke();
                            } else {
                                CourseSentence courseSentence5 = mVar.f25891a;
                                ot.n nVar = mVar.f25893c;
                                List<CourseWord> list4 = nVar.f45908b;
                                arrayList2 = new ArrayList(ry.n.W(list4, 10));
                                for (CourseWord courseWordCopy$default2 : list4) {
                                    if (kotlin.jvm.internal.m.a(courseWordCopy$default2, optionWord2)) {
                                        courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null);
                                    }
                                    arrayList2.add(courseWordCopy$default2);
                                }
                                cVar2.invoke(new m(courseSentence5, arrayList6, ot.n.a(nVar, arrayList2)));
                            }
                        }
                    }
                    if (obj3 == null) {
                        this.f25831c.invoke();
                    } else {
                        CourseSentence courseSentence6 = mVar.f25891a;
                        ot.n nVar2 = mVar.f25893c;
                        List<CourseWord> list5 = nVar2.f45908b;
                        arrayList2 = new ArrayList(ry.n.W(list5, 10));
                        while (r4.hasNext()) {
                            if (kotlin.jvm.internal.m.a(courseWordCopy$default2, optionWord2)) {
                                courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null);
                            }
                            arrayList2.add(courseWordCopy$default2);
                        }
                        cVar2.invoke(new m(courseSentence6, arrayList6, ot.n.a(nVar2, arrayList2)));
                    }
                } else {
                    rz.e0.B(this.f25833e, null, null, new f(cVar2, oVar2, optionWord2, z12 ? 1 : 0, 0), 3);
                }
                return qy.b0.f48488a;
            case 2:
                CourseSentence optionSentence = (CourseSentence) obj;
                kotlin.jvm.internal.m.f(optionSentence, "optionSentence");
                long sentenceId = optionSentence.getSentenceId();
                o oVar3 = this.f25830b;
                if (sentenceId == ((k) oVar3).f25888c.f45829b) {
                    this.f25831c.invoke();
                } else {
                    rz.e0.B(this.f25833e, null, null, new a0.e0(this.f25832d, oVar3, optionSentence, (vy.d) null, 19), 3);
                }
                return qy.b0.f48488a;
            default:
                CourseWord optionWord3 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(optionWord3, "optionWord");
                o oVar4 = this.f25830b;
                i iVar = (i) oVar4;
                ot.c cVar3 = iVar.f25883b;
                CourseSentence courseSentence7 = iVar.f25882a;
                List list6 = cVar3.f45762b;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj9 : list6) {
                    CourseWord courseWord6 = (CourseWord) obj9;
                    if (courseWord6.getWordType() != 1 || kotlin.jvm.internal.m.a(courseWord6.getWord(), "_____")) {
                        arrayList7.add(obj9);
                    }
                }
                List<CourseWord> displayCourseWords = courseSentence7.getDisplayCourseWords();
                ArrayList arrayList8 = new ArrayList();
                for (Object obj10 : displayCourseWords) {
                    if (((CourseWord) obj10).getWordType() != 1) {
                        arrayList8.add(obj10);
                    }
                }
                Iterator it3 = arrayList8.iterator();
                int i24 = 0;
                int i25 = 0;
                while (true) {
                    obj4 = null;
                    z13 = false;
                    if (it3.hasNext()) {
                        int i26 = i25 + 1;
                        courseWord3 = (CourseWord) it3.next();
                        if (!kotlin.jvm.internal.m.a(((CourseWord) arrayList7.get(i25)).getWord(), "_____")) {
                            i25 = i26;
                        }
                    } else {
                        courseWord3 = null;
                    }
                }
                optionWord3.toString();
                Objects.toString(courseWord3);
                String word6 = optionWord3.getWord();
                Locale locale3 = Locale.ROOT;
                String lowerCase6 = word6.toLowerCase(locale3);
                kotlin.jvm.internal.m.e(lowerCase6, "toLowerCase(...)");
                if (courseWord3 == null || (word3 = courseWord3.getWord()) == null) {
                    lowerCase3 = null;
                } else {
                    lowerCase3 = word3.toLowerCase(locale3);
                    kotlin.jvm.internal.m.e(lowerCase3, "toLowerCase(...)");
                }
                boolean zEquals3 = lowerCase6.equals(lowerCase3);
                fz.c cVar4 = this.f25832d;
                if (zEquals3) {
                    ArrayList arrayList9 = new ArrayList(ry.n.W(list6, 10));
                    int i27 = 0;
                    boolean z14 = false;
                    for (Object obj11 : list6) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        CourseWord courseWord7 = (CourseWord) obj11;
                        if (courseWord7.isQuestionWord() && !z14) {
                            kotlin.jvm.internal.m.c(courseWord3);
                            z14 = true;
                            courseWord7 = courseWord3;
                        }
                        arrayList9.add(courseWord7);
                        i27 = i28;
                        z14 = z14;
                    }
                    int size4 = arrayList9.size();
                    while (i24 < size4) {
                        Object obj12 = arrayList9.get(i24);
                        i24++;
                        if (((CourseWord) obj12).isQuestionWord()) {
                            obj4 = obj12;
                            if (obj4 == null) {
                                this.f25831c.invoke();
                            } else {
                                List<CourseWord> list7 = cVar3.f45763c;
                                arrayList3 = new ArrayList(ry.n.W(list7, 10));
                                for (CourseWord courseWordCopy$default3 : list7) {
                                    if (kotlin.jvm.internal.m.a(courseWordCopy$default3, optionWord3)) {
                                        courseWordCopy$default3 = CourseWord.copy$default(courseWordCopy$default3, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null);
                                    }
                                    arrayList3.add(courseWordCopy$default3);
                                }
                                cVar4.invoke(new i(courseSentence7, ot.c.a(cVar3, arrayList9, arrayList3, 1)));
                            }
                        }
                    }
                    if (obj4 == null) {
                        this.f25831c.invoke();
                    } else {
                        List<CourseWord> list8 = cVar3.f45763c;
                        arrayList3 = new ArrayList(ry.n.W(list8, 10));
                        while (r3.hasNext()) {
                            if (kotlin.jvm.internal.m.a(courseWordCopy$default3, optionWord3)) {
                                courseWordCopy$default3 = CourseWord.copy$default(courseWordCopy$default3, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null);
                            }
                            arrayList3.add(courseWordCopy$default3);
                        }
                        cVar4.invoke(new i(courseSentence7, ot.c.a(cVar3, arrayList9, arrayList3, 1)));
                    }
                } else {
                    rz.e0.B(this.f25833e, null, null, new f(cVar4, oVar4, optionWord3, z13 ? 1 : 0, 1), 3);
                }
                return qy.b0.f48488a;
        }
    }

    public /* synthetic */ b(o oVar, fz.a aVar, rz.b0 b0Var, fz.c cVar) {
        this.f25829a = 2;
        this.f25830b = oVar;
        this.f25831c = aVar;
        this.f25833e = b0Var;
        this.f25832d = cVar;
    }
}
