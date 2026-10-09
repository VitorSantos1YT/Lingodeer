package bt;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f3 implements fz.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CourseSentence f5388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5389d;

    public /* synthetic */ f3(l1.b1 b1Var, CourseSentence courseSentence, Object obj, int i11) {
        this.f5386a = i11;
        this.f5387b = b1Var;
        this.f5388c = courseSentence;
        this.f5389d = obj;
    }

    @Override // fz.h
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f5386a) {
            case 0:
                fz.e eVar = (fz.e) this.f5389d;
                j0.q CourseTestModelScreen = (j0.q) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                l1.n nVar = (l1.n) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen, "$this$CourseTestModelScreen");
                int i11 = (iIntValue2 & 6) == 0 ? (((l1.s) nVar).f(CourseTestModelScreen) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((l1.s) nVar).d(iIntValue) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i11 |= ((l1.s) nVar).g(zBooleanValue) ? 256 : 128;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(i11 & 1, (i11 & 1171) != 1170)) {
                    ht.q qVar = (ht.q) this.f5387b.getValue();
                    CourseSentence courseSentence = this.f5388c;
                    List<CourseWord> displayCourseWords = courseSentence.getDisplayCourseWords();
                    List<CourseWord> courseWords = courseSentence.getCourseWords();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : courseWords) {
                        if (((CourseWord) obj6).getWordType() != 1) {
                            arrayList.add(obj6);
                        }
                    }
                    String translation = courseSentence.getTranslation();
                    boolean zF = sVar.f(eVar);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new b0.p1(4, eVar);
                        sVar.o0(objQ);
                    }
                    int i12 = i11 & 14;
                    int i13 = i11 << 15;
                    dt.v2.k(CourseTestModelScreen, qVar, displayCourseWords, null, null, translation, iIntValue, zBooleanValue, null, arrayList, false, false, false, false, false, (fz.c) objQ, sVar, i12 | (3670016 & i13) | (i13 & 29360128), 0, 16012);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                fz.e eVar2 = (fz.e) this.f5389d;
                j0.q CourseTestModelScreen2 = (j0.q) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                l1.n nVar2 = (l1.n) obj4;
                int iIntValue4 = ((Integer) obj5).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen2, "$this$CourseTestModelScreen");
                int i14 = (iIntValue4 & 6) == 0 ? (((l1.s) nVar2).f(CourseTestModelScreen2) ? 4 : 2) | iIntValue4 : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i14 |= ((l1.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                if ((iIntValue4 & 384) == 0) {
                    i14 |= ((l1.s) nVar2).g(zBooleanValue2) ? 256 : 128;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(i14 & 1, (i14 & 1171) != 1170)) {
                    ht.q qVar2 = (ht.q) this.f5387b.getValue();
                    CourseSentence courseSentence2 = this.f5388c;
                    List<CourseWord> displayCourseWords2 = courseSentence2.getDisplayCourseWords();
                    List<CourseWord> courseWords2 = courseSentence2.getCourseWords();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj7 : courseWords2) {
                        if (((CourseWord) obj7).getWordType() != 1) {
                            arrayList2.add(obj7);
                        }
                    }
                    String translation2 = courseSentence2.getTranslation();
                    boolean zF2 = sVar2.f(eVar2);
                    Object objQ2 = sVar2.Q();
                    if (zF2 || objQ2 == l1.m.f39353a) {
                        objQ2 = new b0.p1(5, eVar2);
                        sVar2.o0(objQ2);
                    }
                    int i15 = i14 & 14;
                    int i16 = i14 << 15;
                    dt.v2.k(CourseTestModelScreen2, qVar2, displayCourseWords2, null, null, translation2, iIntValue3, zBooleanValue2, null, arrayList2, false, false, false, false, false, (fz.c) objQ2, sVar2, i15 | (3670016 & i16) | (i16 & 29360128), 0, 16012);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                fz.e eVar3 = (fz.e) this.f5389d;
                j0.q CourseTestModelScreen3 = (j0.q) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                l1.n nVar3 = (l1.n) obj4;
                int iIntValue6 = ((Integer) obj5).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen3, "$this$CourseTestModelScreen");
                int i17 = (iIntValue6 & 6) == 0 ? (((l1.s) nVar3).f(CourseTestModelScreen3) ? 4 : 2) | iIntValue6 : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i17 |= ((l1.s) nVar3).d(iIntValue5) ? 32 : 16;
                }
                if ((iIntValue6 & 384) == 0) {
                    i17 |= ((l1.s) nVar3).g(zBooleanValue3) ? 256 : 128;
                }
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(i17 & 1, (i17 & 1171) != 1170)) {
                    ht.q qVar3 = (ht.q) this.f5387b.getValue();
                    CourseSentence courseSentence3 = this.f5388c;
                    List<CourseWord> displayCourseWords3 = courseSentence3.getDisplayCourseWords();
                    List<CourseWord> courseWords3 = courseSentence3.getCourseWords();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj8 : courseWords3) {
                        if (((CourseWord) obj8).getWordType() != 1) {
                            arrayList3.add(obj8);
                        }
                    }
                    String translation3 = courseSentence3.getTranslation();
                    boolean zF3 = sVar3.f(eVar3);
                    Object objQ3 = sVar3.Q();
                    if (zF3 || objQ3 == l1.m.f39353a) {
                        objQ3 = new b0.p1(9, eVar3);
                        sVar3.o0(objQ3);
                    }
                    int i18 = i17 & 14;
                    int i19 = i17 << 15;
                    dt.v2.k(CourseTestModelScreen3, qVar3, displayCourseWords3, null, null, translation3, iIntValue5, zBooleanValue3, null, arrayList3, false, false, false, false, false, (fz.c) objQ3, sVar3, i18 | (3670016 & i19) | (i19 & 29360128), 0, 16012);
                } else {
                    sVar3.W();
                }
                break;
            default:
                x1.p pVar = (x1.p) this.f5389d;
                j0.q CourseTestModelScreen4 = (j0.q) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                l1.n nVar4 = (l1.n) obj4;
                int iIntValue8 = ((Integer) obj5).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen4, "$this$CourseTestModelScreen");
                int i21 = (iIntValue8 & 6) == 0 ? (((l1.s) nVar4).f(CourseTestModelScreen4) ? 4 : 2) | iIntValue8 : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i21 |= ((l1.s) nVar4).d(iIntValue7) ? 32 : 16;
                }
                if ((iIntValue8 & 384) == 0) {
                    i21 |= ((l1.s) nVar4).g(zBooleanValue4) ? 256 : 128;
                }
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(i21 & 1, (i21 & 1171) != 1170)) {
                    ht.q qVar4 = (ht.q) this.f5387b.getValue();
                    CourseSentence courseSentence4 = this.f5388c;
                    int i22 = i21;
                    List<CourseWord> displayCourseWords4 = courseSentence4.getDisplayCourseWords();
                    String translation4 = courseSentence4.getTranslation();
                    int i23 = i22 & 14;
                    int i24 = i22 << 15;
                    dt.v2.k(CourseTestModelScreen4, qVar4, displayCourseWords4, null, null, translation4, iIntValue7, zBooleanValue4, pVar, null, false, false, false, false, false, null, sVar4, i23 | (3670016 & i24) | (i24 & 29360128), 6, 32012);
                } else {
                    sVar4.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
