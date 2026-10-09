package jt;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.RecordingStatus;
import com.lingodeer.data.model.WordAccuracyScoreTimingResult;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f1 extends xy.i implements fz.e {
    public final /* synthetic */ String H;
    public final /* synthetic */ int K;
    public final /* synthetic */ CourseSentence L;
    public final /* synthetic */ vt.n0 M;
    public final /* synthetic */ List N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f36927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ av.i f36928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f36929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f36930f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f36931t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(x0 x0Var, av.i iVar, rz.b0 b0Var, String str, String str2, String str3, int i11, CourseSentence courseSentence, vt.n0 n0Var, List list, vy.d dVar) {
        super(2, dVar);
        this.f36927c = x0Var;
        this.f36928d = iVar;
        this.f36929e = b0Var;
        this.f36930f = str;
        this.f36931t = str2;
        this.H = str3;
        this.K = i11;
        this.L = courseSentence;
        this.M = n0Var;
        this.N = list;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        f1 f1Var = new f1(this.f36927c, this.f36928d, this.f36929e, this.f36930f, this.f36931t, this.H, this.K, this.L, this.M, this.N, dVar);
        f1Var.f36926b = obj;
        return f1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        String sentence;
        List listK;
        List listK2;
        x0 x0Var = this.f36927c;
        l1.b1 b1Var = x0Var.f37263i;
        l1.b1 b1Var2 = x0Var.f37265k;
        l1.b1 b1Var3 = x0Var.f37264j;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f36925a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            if (b1Var3.getValue() instanceof RecordingStatus.Recording) {
                Iterable iterable = (Iterable) b1Var.getValue();
                ArrayList arrayList = new ArrayList(ry.n.W(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(CourseWord.copy$default((CourseWord) it.next(), 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, -1, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -786433, 63, null));
                }
                b1Var.setValue(arrayList);
            } else if (b1Var3.getValue() instanceof RecordingStatus.Recognizing) {
                File file = ((CourseWord) b1Var2.getValue()) != null ? new File(this.f36931t) : new File(this.H);
                boolean zExists = file.exists();
                rz.b0 b0Var = this.f36929e;
                if (zExists) {
                    CourseWord courseWord = (CourseWord) b1Var2.getValue();
                    vt.n0 n0Var = this.M;
                    if (courseWord == null || (sentence = courseWord.getWord()) == null) {
                        int i12 = this.K;
                        CourseSentence courseSentence = this.L;
                        sentence = i12 == 4 ? courseSentence.getSentence() : xt.d.u(((fr.o0) n0Var).f27733a.keyLanguage) ? ry.m.y0(courseSentence.getDisplayCourseWords(), BuildConfig.VERSION_NAME, null, null, new t0(3), 30) : ry.m.y0(courseSentence.getDisplayCourseWords(), " ", null, null, new t0(4), 30);
                    }
                    String str = sentence;
                    CourseWord courseWord2 = (CourseWord) b1Var2.getValue();
                    List list = this.N;
                    if (courseWord2 != null) {
                        listK = ns.o.K(courseWord2.getWord());
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list) {
                            if (((CourseWord) obj2).getWordType() != 1) {
                                arrayList2.add(obj2);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(ry.n.W(arrayList2, 10));
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj3 = arrayList2.get(i13);
                            i13++;
                            arrayList3.add(((CourseWord) obj3).getWord());
                        }
                        listK = arrayList3;
                    }
                    CourseWord courseWord3 = (CourseWord) b1Var2.getValue();
                    String zhuYin = BuildConfig.VERSION_NAME;
                    if (courseWord3 != null) {
                        if (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(((fr.o0) n0Var).f27733a.keyLanguage))) {
                            zhuYin = courseWord3.getZhuYin();
                        }
                        listK2 = ns.o.K(zhuYin);
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : list) {
                            if (((CourseWord) obj4).getWordType() != 1) {
                                arrayList4.add(obj4);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList(ry.n.W(arrayList4, 10));
                        int size2 = arrayList4.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            Object obj5 = arrayList4.get(i14);
                            i14++;
                            arrayList5.add(ry.l.D(new Integer[]{12, 1}, Integer.valueOf(((fr.o0) n0Var).f27733a.keyLanguage)) ? ((CourseWord) obj5).getZhuYin() : BuildConfig.VERSION_NAME);
                        }
                        listK2 = arrayList5;
                    }
                    this.f36928d.b(file, str, listK, listK2, new fu.n(27, b0Var, x0Var), new fp.f(24, b0Var, x0Var));
                } else {
                    rz.e0.B(b0Var, null, null, new e1(x0Var, null), 3);
                }
            } else if (b1Var3.getValue() instanceof RecordingStatus.RecognizeSuccess) {
                Object value = b1Var3.getValue();
                kotlin.jvm.internal.m.d(value, "null cannot be cast to non-null type com.lingodeer.data.model.RecordingStatus.RecognizeSuccess");
                List<WordAccuracyScoreTimingResult> accuracyScoreList = ((RecordingStatus.RecognizeSuccess) value).getAccuracyScoreList();
                File file2 = new File(this.f36930f);
                h00.b bVar = h00.c.f29915d;
                bVar.getClass();
                cz.k.V(file2, bVar.c(new g00.d(WordAccuracyScoreTimingResult.Companion.serializer(), 0), accuracyScoreList));
                this.f36926b = null;
                this.f36925a = 1;
                if (h1.a(x0Var, accuracyScoreList, this) == aVar) {
                    return aVar;
                }
            } else if (b1Var3.getValue() instanceof RecordingStatus.RecognizeError) {
                Object value2 = b1Var3.getValue();
                kotlin.jvm.internal.m.d(value2, "null cannot be cast to non-null type com.lingodeer.data.model.RecordingStatus.RecognizeError");
                switch (y0.f37270a[((RecordingStatus.RecognizeError) value2).getErrorType().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        CourseWord courseWord4 = (CourseWord) b1Var2.getValue();
                        if (courseWord4 != null) {
                            b1Var2.setValue(CourseWord.copy$default(courseWord4, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -786433, 63, null));
                            Iterable<CourseWord> iterable2 = (Iterable) b1Var.getValue();
                            ArrayList arrayList6 = new ArrayList(ry.n.W(iterable2, 10));
                            for (CourseWord courseWord5 : iterable2) {
                                if (courseWord5.getRandomId() == courseWord4.getRandomId()) {
                                    Object value3 = b1Var2.getValue();
                                    kotlin.jvm.internal.m.c(value3);
                                    courseWord5 = (CourseWord) value3;
                                }
                                arrayList6.add(courseWord5);
                            }
                            b1Var.setValue(arrayList6);
                        } else {
                            Iterable iterable3 = (Iterable) b1Var.getValue();
                            ArrayList arrayList7 = new ArrayList(ry.n.W(iterable3, 10));
                            Iterator it2 = iterable3.iterator();
                            while (it2.hasNext()) {
                                arrayList7.add(CourseWord.copy$default((CourseWord) it2.next(), 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -786433, 63, null));
                            }
                            b1Var.setValue(arrayList7);
                            x0Var.f37261g.setValue(ht.q.SELECTED);
                            b1Var3.setValue(new RecordingStatus.RecognizeShowScore(CropImageView.DEFAULT_ASPECT_RATIO, false));
                        }
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
