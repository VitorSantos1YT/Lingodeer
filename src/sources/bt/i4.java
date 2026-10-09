package bt;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i4 implements fz.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CourseSentence f5524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.e f5525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5526f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5527t;

    public /* synthetic */ i4(l1.b1 b1Var, boolean z11, CourseSentence courseSentence, Object obj, Object obj2, fz.e eVar, int i11) {
        this.f5521a = i11;
        this.f5522b = b1Var;
        this.f5523c = z11;
        this.f5524d = courseSentence;
        this.f5526f = obj;
        this.f5527t = obj2;
        this.f5525e = eVar;
    }

    @Override // fz.h
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f5521a) {
            case 0:
                jt.s0 s0Var = (jt.s0) this.f5526f;
                x1.p pVar = (x1.p) this.f5527t;
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
                    ht.q qVar = (ht.q) this.f5522b.getValue();
                    boolean z11 = this.f5523c;
                    CourseSentence courseSentence = this.f5524d;
                    List<CourseWord> displayCourseWords = z11 ? courseSentence.getDisplayCourseWords() : (List) s0Var.f37174r.getValue();
                    List<CourseWord> courseWords = courseSentence.getCourseWords();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : courseWords) {
                        j0.q qVar2 = CourseTestModelScreen;
                        if (((CourseWord) obj6).getWordType() != 1) {
                            arrayList.add(obj6);
                        }
                        CourseTestModelScreen = qVar2;
                    }
                    j0.q qVar3 = CourseTestModelScreen;
                    String translation = courseSentence.getTranslation();
                    boolean z12 = !z11;
                    boolean zBooleanValue2 = ((Boolean) s0Var.f37169l.getValue()).booleanValue();
                    fz.e eVar = this.f5525e;
                    boolean zF = sVar.f(eVar);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new b0.p1(8, eVar);
                        sVar.o0(objQ);
                    }
                    int i12 = i11 & 14;
                    int i13 = i11 << 15;
                    dt.v2.k(qVar3, qVar, displayCourseWords, null, null, translation, iIntValue, zBooleanValue, pVar, arrayList, z11, z12, false, zBooleanValue2, false, (fz.c) objQ, sVar, i12 | (3670016 & i13) | (i13 & 29360128), 0, 10252);
                } else {
                    sVar.W();
                }
                break;
            default:
                CourseSentence courseSentence2 = (CourseSentence) this.f5526f;
                jt.q1 q1Var = (jt.q1) this.f5527t;
                j0.q CourseTestModelScreen2 = (j0.q) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                l1.n nVar2 = (l1.n) obj4;
                int iIntValue4 = ((Integer) obj5).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen2, "$this$CourseTestModelScreen");
                int i14 = (iIntValue4 & 6) == 0 ? (((l1.s) nVar2).f(CourseTestModelScreen2) ? 4 : 2) | iIntValue4 : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i14 |= ((l1.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                if ((iIntValue4 & 384) == 0) {
                    i14 |= ((l1.s) nVar2).g(zBooleanValue3) ? 256 : 128;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(i14 & 1, (i14 & 1171) != 1170)) {
                    ht.q qVar4 = (ht.q) this.f5522b.getValue();
                    boolean z13 = this.f5523c;
                    CourseSentence courseSentence3 = this.f5524d;
                    List<CourseWord> displayCourseWords2 = z13 ? courseSentence3.getDisplayCourseWords() : courseSentence2.getDisplayCourseWords();
                    List<CourseWord> courseWords2 = (z13 ? courseSentence3 : courseSentence2).getCourseWords();
                    List<CourseWord> list = displayCourseWords2;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj7 : courseWords2) {
                        CourseSentence courseSentence4 = courseSentence2;
                        if (((CourseWord) obj7).getWordType() != 1) {
                            arrayList2.add(obj7);
                        }
                        courseSentence2 = courseSentence4;
                    }
                    String translation2 = z13 ? courseSentence3.getTranslation() : courseSentence2.getTranslation();
                    boolean zBooleanValue4 = ((Boolean) q1Var.f37130h.getValue()).booleanValue();
                    fz.e eVar2 = this.f5525e;
                    boolean zF2 = sVar2.f(eVar2);
                    Object objQ2 = sVar2.Q();
                    if (zF2 || objQ2 == l1.m.f39353a) {
                        objQ2 = new b0.p1(13, eVar2);
                        sVar2.o0(objQ2);
                    }
                    int i15 = i14 << 15;
                    dt.v2.k(CourseTestModelScreen2, qVar4, list, null, null, translation2, iIntValue3, zBooleanValue3, null, arrayList2, false, false, false, zBooleanValue4, false, (fz.c) objQ2, sVar2, (i14 & 14) | (3670016 & i15) | (i15 & 29360128), 0, 11916);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
