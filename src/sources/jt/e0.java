package jt;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.RecordingStatus;
import com.lingodeer.data.model.WordAccuracyScoreTimingResult;
import com.yalantis.ucrop.view.CropImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f36911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x1.p f36912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ av.i f36913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f36914f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f36915t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(v vVar, x1.p pVar, av.i iVar, rz.b0 b0Var, String str, vy.d dVar) {
        super(2, dVar);
        this.f36911c = vVar;
        this.f36912d = pVar;
        this.f36913e = iVar;
        this.f36914f = b0Var;
        this.f36915t = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        e0 e0Var = new e0(this.f36911c, this.f36912d, this.f36913e, this.f36914f, this.f36915t, dVar);
        e0Var.f36910b = obj;
        return e0Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [av.i] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        String sentence;
        ?? arrayList2;
        v vVar = this.f36911c;
        x1.p pVar = vVar.f37218i;
        l1.b1 b1Var = vVar.f37215f;
        l1.b1 b1Var2 = vVar.f37214e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f36909a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            int i12 = 0;
            if (b1Var2.getValue() instanceof RecordingStatus.Recognizing) {
                CourseSentence courseSentenceA = ((et.o) ry.m.z0(this.f36912d)).a();
                kotlin.jvm.internal.m.c(courseSentenceA);
                File file = ((CourseWord) b1Var.getValue()) != null ? new File(this.f36915t) : new File(courseSentenceA.getRecordPath());
                boolean zExists = file.exists();
                rz.b0 b0Var = this.f36914f;
                if (zExists) {
                    CourseWord courseWord = (CourseWord) b1Var.getValue();
                    if (courseWord == null || (sentence = courseWord.getWord()) == null) {
                        sentence = courseSentenceA.getSentence();
                    }
                    String str = sentence;
                    CourseWord courseWord2 = (CourseWord) b1Var.getValue();
                    if (courseWord2 != null) {
                        arrayList2 = ns.o.K(courseWord2.getWord());
                    } else {
                        List<CourseWord> speechDisplayCourseWords = courseSentenceA.getSpeechDisplayCourseWords();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : speechDisplayCourseWords) {
                            if (((CourseWord) obj2).getWordType() != 1) {
                                arrayList3.add(obj2);
                            }
                        }
                        arrayList2 = new ArrayList(ry.n.W(arrayList3, 10));
                        int size = arrayList3.size();
                        while (i12 < size) {
                            Object obj3 = arrayList3.get(i12);
                            i12++;
                            arrayList2.add(((CourseWord) obj3).getWord());
                        }
                    }
                    this.f36913e.b(file, str, arrayList2, ry.r.f50854a, new fu.n(26, b0Var, vVar), new fp.f(23, b0Var, vVar));
                } else {
                    rz.e0.B(b0Var, null, null, new d0(vVar, null), 3);
                }
            } else if (b1Var2.getValue() instanceof RecordingStatus.RecognizeSuccess) {
                CourseSentence courseSentenceA2 = ((et.o) ry.m.z0(pVar)).a();
                Object value = b1Var2.getValue();
                kotlin.jvm.internal.m.d(value, iFLeRCXvYCGdPW.nLvDtDCxYucjXi);
                List<WordAccuracyScoreTimingResult> accuracyScoreList = ((RecordingStatus.RecognizeSuccess) value).getAccuracyScoreList();
                this.f36910b = null;
                this.f36909a = 1;
                if (g0.a(vVar, courseSentenceA2, accuracyScoreList, this) == aVar) {
                    return aVar;
                }
            } else if (b1Var2.getValue() instanceof RecordingStatus.RecognizeError) {
                Object value2 = b1Var2.getValue();
                kotlin.jvm.internal.m.d(value2, "null cannot be cast to non-null type com.lingodeer.data.model.RecordingStatus.RecognizeError");
                switch (w.f37239a[((RecordingStatus.RecognizeError) value2).getErrorType().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        l1.b1 b1Var3 = vVar.f37217h;
                        l1.b1 b1Var4 = vVar.f37216g;
                        List<CourseWord> speechDisplayCourseWords2 = ((et.o) ry.m.z0(pVar)).a().getSpeechDisplayCourseWords();
                        ArrayList arrayList4 = new ArrayList(ry.n.W(speechDisplayCourseWords2, 10));
                        Iterator it = speechDisplayCourseWords2.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(CourseWord.copy$default((CourseWord) it.next(), 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -786433, 63, null));
                        }
                        vVar.f37212c.setValue(ht.q.SELECTED);
                        Iterable iterable = (Iterable) b1Var4.getValue();
                        ArrayList arrayList5 = new ArrayList(ry.n.W(iterable, 10));
                        int i13 = 0;
                        for (Object obj4 : iterable) {
                            int i14 = i13 + 1;
                            if (i13 < 0) {
                                ns.o.V();
                                throw null;
                            }
                            et.o hVar = (et.o) obj4;
                            if (i13 == ((Number) b1Var3.getValue()).intValue()) {
                                arrayList = arrayList4;
                                CourseSentence courseSentenceA3 = hVar.a();
                                kotlin.jvm.internal.m.c(courseSentenceA3);
                                hVar = new et.h(CourseSentence.copy$default(courseSentenceA3, 0L, null, null, null, null, null, null, null, null, false, false, false, null, null, arrayList, null, null, null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, 6275071, null));
                            } else {
                                arrayList = arrayList4;
                            }
                            arrayList5.add(hVar);
                            arrayList4 = arrayList;
                            i13 = i14;
                        }
                        b1Var4.setValue(arrayList5);
                        ry.m.N0(pVar);
                        pVar.add(((List) b1Var4.getValue()).get(((Number) b1Var3.getValue()).intValue()));
                        b1Var2.setValue(new RecordingStatus.RecognizeShowScore(CropImageView.DEFAULT_ASPECT_RATIO, b1Var.getValue() != null));
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return qy.b0.f48488a;
    }
}
