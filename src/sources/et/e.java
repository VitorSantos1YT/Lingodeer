package et;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f25860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f25861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(boolean z11, o oVar, fz.c cVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f25858a = i11;
        this.f25859b = z11;
        this.f25860c = oVar;
        this.f25861d = cVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f25858a) {
            case 0:
                return new e(this.f25859b, this.f25861d, this.f25860c, dVar);
            case 1:
                return new e(this.f25859b, this.f25860c, this.f25861d, dVar, 1);
            case 2:
                return new e(this.f25859b, this.f25860c, this.f25861d, dVar, 2);
            default:
                return new e(this.f25859b, this.f25860c, this.f25861d, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f25858a) {
            case 0:
                e eVar = (e) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                eVar.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                e eVar2 = (e) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                eVar2.invokeSuspend(b0Var3);
                return b0Var3;
            case 2:
                e eVar3 = (e) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                eVar3.invokeSuspend(b0Var4);
                return b0Var4;
            default:
                e eVar4 = (e) create(b0Var, dVar);
                qy.b0 b0Var5 = qy.b0.f48488a;
                eVar4.invokeSuspend(b0Var5);
                return b0Var5;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        CourseWord courseWord;
        String lowerCase;
        CourseWord courseWord2;
        CourseWord courseWord3;
        int i11 = this.f25858a;
        int i12 = 0;
        boolean z11 = this.f25859b;
        o oVar = this.f25860c;
        qy.b0 b0Var = qy.b0.f48488a;
        fz.c cVar = this.f25861d;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (z11) {
                    k kVar = (k) oVar;
                    CourseSentence courseSentence = kVar.f25886a;
                    ArrayList arrayList = kVar.f25887b;
                    ot.h hVar = kVar.f25888c;
                    List<CourseSentence> list = hVar.f45830c;
                    ArrayList arrayList2 = new ArrayList(ry.n.W(list, 10));
                    for (CourseSentence courseSentenceCopy$default : list) {
                        if (courseSentenceCopy$default.getSentenceId() == kVar.f25888c.f45829b) {
                            courseSentenceCopy$default = CourseSentence.copy$default(courseSentenceCopy$default, 0L, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, OptionItemSelectedState.CORRECT, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, 8257535, null);
                        }
                        arrayList2.add(courseSentenceCopy$default);
                    }
                    cVar.invoke(new k(courseSentence, arrayList, ot.h.a(hVar, arrayList2)));
                } else {
                    k kVar2 = (k) oVar;
                    CourseSentence courseSentence2 = kVar2.f25886a;
                    ArrayList arrayList3 = kVar2.f25887b;
                    ot.h hVar2 = kVar2.f25888c;
                    List<CourseSentence> list2 = hVar2.f45830c;
                    ArrayList arrayList4 = new ArrayList(ry.n.W(list2, 10));
                    for (CourseSentence courseSentenceCopy$default2 : list2) {
                        if (courseSentenceCopy$default2.getSentenceId() == kVar2.f25888c.f45829b) {
                            courseSentenceCopy$default2 = CourseSentence.copy$default(courseSentenceCopy$default2, 0L, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, OptionItemSelectedState.DEFAULT, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, 8257535, null);
                        }
                        arrayList4.add(courseSentenceCopy$default2);
                    }
                    cVar.invoke(new k(courseSentence2, arrayList3, ot.h.a(hVar2, arrayList4)));
                }
                return b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (z11) {
                    i iVar = (i) oVar;
                    List list3 = iVar.f25883b.f45762b;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : list3) {
                        CourseWord courseWord4 = (CourseWord) obj2;
                        if (courseWord4.getWordType() != 1 || kotlin.jvm.internal.m.a(courseWord4.getWord(), "_____")) {
                            arrayList5.add(obj2);
                        }
                    }
                    List<CourseWord> displayCourseWords = iVar.f25882a.getDisplayCourseWords();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj3 : displayCourseWords) {
                        if (((CourseWord) obj3).getWordType() != 1) {
                            arrayList6.add(obj3);
                        }
                    }
                    Iterator it = arrayList6.iterator();
                    int i13 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            int i14 = i13 + 1;
                            courseWord = (CourseWord) it.next();
                            if (!kotlin.jvm.internal.m.a(((CourseWord) arrayList5.get(i13)).getWord(), "_____")) {
                                i13 = i14;
                            }
                        } else {
                            courseWord = null;
                        }
                    }
                    if (courseWord != null) {
                        CourseSentence courseSentence3 = iVar.f25882a;
                        ot.c cVar2 = iVar.f25883b;
                        List list4 = cVar2.f45763c;
                        ArrayList arrayList7 = new ArrayList(ry.n.W(list4, 10));
                        int i15 = 0;
                        int i16 = -1;
                        for (Object obj4 : list4) {
                            int i17 = i15 + 1;
                            if (i15 < 0) {
                                ns.o.V();
                                throw null;
                            }
                            CourseWord courseWordCopy$default = (CourseWord) obj4;
                            String word = courseWordCopy$default.getWord();
                            Locale locale = Locale.ROOT;
                            String lowerCase2 = word.toLowerCase(locale);
                            kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                            String word2 = courseWord.getWord();
                            if (word2 != null) {
                                lowerCase = word2.toLowerCase(locale);
                                kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                            } else {
                                lowerCase = null;
                            }
                            if (lowerCase2.equals(lowerCase) && i16 == -1 && courseWordCopy$default.getSelectedState() == OptionItemSelectedState.DEFAULT) {
                                courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                                i16 = i15;
                            }
                            arrayList7.add(courseWordCopy$default);
                            i15 = i17;
                        }
                        cVar.invoke(new i(courseSentence3, ot.c.a(cVar2, null, arrayList7, 3)));
                    }
                } else {
                    i iVar2 = (i) oVar;
                    CourseSentence courseSentence4 = iVar2.f25882a;
                    ot.c cVar3 = iVar2.f25883b;
                    List list5 = cVar3.f45763c;
                    ArrayList arrayList8 = new ArrayList(ry.n.W(list5, 10));
                    for (Object obj5 : list5) {
                        int i18 = i12 + 1;
                        if (i12 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        CourseWord courseWordCopy$default2 = (CourseWord) obj5;
                        if (courseWordCopy$default2.getSelectedState() == OptionItemSelectedState.CORRECT) {
                            courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.DEFAULT, null, null, 0, -1, 59, null);
                        }
                        arrayList8.add(courseWordCopy$default2);
                        i12 = i18;
                    }
                    cVar.invoke(new i(courseSentence4, ot.c.a(cVar3, null, arrayList8, 3)));
                }
                return b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (z11) {
                    l lVar = (l) oVar;
                    Iterator<T> it2 = lVar.f25889a.getDisplayCourseWords().iterator();
                    int i19 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            int i21 = i19 + 1;
                            courseWord2 = (CourseWord) it2.next();
                            if (!kotlin.jvm.internal.m.a(((CourseWord) lVar.f25890b.f45880c.get(i19)).getWord(), "_____")) {
                                i19 = i21;
                            }
                        } else {
                            courseWord2 = null;
                        }
                    }
                    if (courseWord2 != null) {
                        CourseSentence courseSentence5 = lVar.f25889a;
                        ot.l lVar2 = lVar.f25890b;
                        List list6 = lVar2.f45881d;
                        ArrayList arrayList9 = new ArrayList(ry.n.W(list6, 10));
                        int i22 = 0;
                        int i23 = -1;
                        for (Object obj6 : list6) {
                            int i24 = i22 + 1;
                            if (i22 < 0) {
                                ns.o.V();
                                throw null;
                            }
                            CourseWord courseWordCopy$default3 = (CourseWord) obj6;
                            String word3 = courseWordCopy$default3.getWord();
                            Locale locale2 = Locale.ROOT;
                            String lowerCase3 = word3.toLowerCase(locale2);
                            kotlin.jvm.internal.m.e(lowerCase3, "toLowerCase(...)");
                            String lowerCase4 = courseWord2.getWord().toLowerCase(locale2);
                            kotlin.jvm.internal.m.e(lowerCase4, "toLowerCase(...)");
                            if (lowerCase3.equals(lowerCase4) && i23 == -1 && courseWordCopy$default3.getSelectedState() == OptionItemSelectedState.DEFAULT) {
                                courseWordCopy$default3 = CourseWord.copy$default(courseWordCopy$default3, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                                i23 = i22;
                            }
                            arrayList9.add(courseWordCopy$default3);
                            i22 = i24;
                        }
                        cVar.invoke(new l(courseSentence5, ot.l.a(lVar2, null, arrayList9, 7)));
                    }
                } else {
                    l lVar3 = (l) oVar;
                    CourseSentence courseSentence6 = lVar3.f25889a;
                    ot.l lVar4 = lVar3.f25890b;
                    List list7 = lVar4.f45881d;
                    ArrayList arrayList10 = new ArrayList(ry.n.W(list7, 10));
                    for (Object obj7 : list7) {
                        int i25 = i12 + 1;
                        if (i12 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        CourseWord courseWordCopy$default4 = (CourseWord) obj7;
                        if (courseWordCopy$default4.getSelectedState() == OptionItemSelectedState.CORRECT) {
                            courseWordCopy$default4 = CourseWord.copy$default(courseWordCopy$default4, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.DEFAULT, null, null, 0, -1, 59, null);
                        }
                        arrayList10.add(courseWordCopy$default4);
                        i12 = i25;
                    }
                    cVar.invoke(new l(courseSentence6, ot.l.a(lVar4, null, arrayList10, 7)));
                }
                return b0Var;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (z11) {
                    m mVar = (m) oVar;
                    Iterator<T> it3 = mVar.f25891a.getDisplayCourseWords().iterator();
                    int i26 = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            int i27 = i26 + 1;
                            courseWord3 = (CourseWord) it3.next();
                            if (!kotlin.jvm.internal.m.a(((CourseWord) mVar.f25892b.get(i26)).getWord(), "_____")) {
                                i26 = i27;
                            }
                        } else {
                            courseWord3 = null;
                        }
                    }
                    if (courseWord3 != null) {
                        CourseSentence courseSentence7 = mVar.f25891a;
                        ArrayList arrayList11 = mVar.f25892b;
                        ot.n nVar = mVar.f25893c;
                        List list8 = nVar.f45908b;
                        ArrayList arrayList12 = new ArrayList(ry.n.W(list8, 10));
                        int i28 = -1;
                        for (Object obj8 : list8) {
                            int i29 = i12 + 1;
                            if (i12 < 0) {
                                ns.o.V();
                                throw null;
                            }
                            CourseWord courseWordCopy$default5 = (CourseWord) obj8;
                            String word4 = courseWordCopy$default5.getWord();
                            Locale locale3 = Locale.ROOT;
                            String lowerCase5 = word4.toLowerCase(locale3);
                            kotlin.jvm.internal.m.e(lowerCase5, "toLowerCase(...)");
                            String lowerCase6 = courseWord3.getWord().toLowerCase(locale3);
                            kotlin.jvm.internal.m.e(lowerCase6, "toLowerCase(...)");
                            if (lowerCase5.equals(lowerCase6) && i28 == -1 && courseWordCopy$default5.getSelectedState() == OptionItemSelectedState.DEFAULT) {
                                courseWordCopy$default5 = CourseWord.copy$default(courseWordCopy$default5, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                                i28 = i12;
                            }
                            arrayList12.add(courseWordCopy$default5);
                            i12 = i29;
                        }
                        cVar.invoke(new m(courseSentence7, arrayList11, ot.n.a(nVar, arrayList12)));
                    }
                } else {
                    m mVar2 = (m) oVar;
                    CourseSentence courseSentence8 = mVar2.f25891a;
                    ArrayList arrayList13 = mVar2.f25892b;
                    ot.n nVar2 = mVar2.f25893c;
                    List list9 = nVar2.f45908b;
                    ArrayList arrayList14 = new ArrayList(ry.n.W(list9, 10));
                    for (Object obj9 : list9) {
                        int i30 = i12 + 1;
                        if (i12 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        CourseWord courseWordCopy$default6 = (CourseWord) obj9;
                        if (courseWordCopy$default6.getSelectedState() == OptionItemSelectedState.CORRECT) {
                            courseWordCopy$default6 = CourseWord.copy$default(courseWordCopy$default6, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.DEFAULT, null, null, 0, -1, 59, null);
                        }
                        arrayList14.add(courseWordCopy$default6);
                        i12 = i30;
                    }
                    cVar.invoke(new m(courseSentence8, arrayList13, ot.n.a(nVar2, arrayList14)));
                }
                return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z11, fz.c cVar, o oVar, vy.d dVar) {
        super(2, dVar);
        this.f25858a = 0;
        this.f25859b = z11;
        this.f25861d = cVar;
        this.f25860c = oVar;
    }
}
