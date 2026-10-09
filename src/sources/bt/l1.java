package bt;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l1 implements fz.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CourseSentence f5649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.e f5651e;

    public /* synthetic */ l1(l1.b1 b1Var, CourseSentence courseSentence, l1.b1 b1Var2, fz.e eVar, int i11) {
        this.f5647a = i11;
        this.f5648b = b1Var;
        this.f5649c = courseSentence;
        this.f5650d = b1Var2;
        this.f5651e = eVar;
    }

    @Override // fz.h
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        j0.q CourseTestModelScreen = (j0.q) obj;
        switch (this.f5647a) {
            case 0:
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
                    ht.q qVar = (ht.q) this.f5648b.getValue();
                    CourseSentence courseSentence = this.f5649c;
                    int i12 = i11;
                    List<CourseWord> displayCourseWords = courseSentence.getDisplayCourseWords();
                    List list = (List) this.f5650d.getValue();
                    List<CourseWord> courseWords = courseSentence.getCourseWords();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : courseWords) {
                        if (((CourseWord) obj6).getWordType() != 1) {
                            arrayList.add(obj6);
                        }
                    }
                    String translation = courseSentence.getTranslation();
                    fz.e eVar = this.f5651e;
                    boolean zF = sVar.f(eVar);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new b0.p1(3, eVar);
                        sVar.o0(objQ);
                    }
                    int i13 = i12 & 14;
                    int i14 = i12 << 15;
                    dt.v2.k(CourseTestModelScreen, qVar, displayCourseWords, null, null, translation, iIntValue, zBooleanValue, list, arrayList, false, false, false, false, false, (fz.c) objQ, sVar, i13 | (3670016 & i14) | (i14 & 29360128), 0, 15884);
                } else {
                    sVar.W();
                }
                break;
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                l1.n nVar2 = (l1.n) obj4;
                int iIntValue4 = ((Integer) obj5).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen, "$this$CourseTestModelScreen");
                int i15 = (iIntValue4 & 6) == 0 ? (((l1.s) nVar2).f(CourseTestModelScreen) ? 4 : 2) | iIntValue4 : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i15 |= ((l1.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                if ((iIntValue4 & 384) == 0) {
                    i15 |= ((l1.s) nVar2).g(zBooleanValue2) ? 256 : 128;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(i15 & 1, (i15 & 1171) != 1170)) {
                    ht.q qVar2 = (ht.q) this.f5648b.getValue();
                    CourseSentence courseSentence2 = this.f5649c;
                    int i16 = i15;
                    List<CourseWord> displayCourseWords2 = courseSentence2.getDisplayCourseWords();
                    List list2 = (List) this.f5650d.getValue();
                    List<CourseWord> courseWords2 = courseSentence2.getCourseWords();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj7 : courseWords2) {
                        if (((CourseWord) obj7).getWordType() != 1) {
                            arrayList2.add(obj7);
                        }
                    }
                    String translation2 = courseSentence2.getTranslation();
                    fz.e eVar2 = this.f5651e;
                    boolean zF2 = sVar2.f(eVar2);
                    Object objQ2 = sVar2.Q();
                    if (zF2 || objQ2 == l1.m.f39353a) {
                        objQ2 = new b0.p1(7, eVar2);
                        sVar2.o0(objQ2);
                    }
                    int i17 = i16 & 14;
                    int i18 = i16 << 15;
                    dt.v2.k(CourseTestModelScreen, qVar2, displayCourseWords2, null, null, translation2, iIntValue3, zBooleanValue2, list2, arrayList2, false, false, false, false, false, (fz.c) objQ2, sVar2, i17 | (3670016 & i18) | (i18 & 29360128), 0, 15884);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
