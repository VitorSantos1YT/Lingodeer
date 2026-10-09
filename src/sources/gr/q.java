package gr;

import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType;
import g2.f0;
import gp.l1;
import java.util.List;
import l1.b1;
import l1.b3;
import qy.b0;
import rt.h9;
import ys.a1;
import ys.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements fz.c {
    public final /* synthetic */ qy.e H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29735a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f29736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f29737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f29738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f29739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f29740f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f29741t;

    public /* synthetic */ q(CourseTestFinishSummaryUiState courseTestFinishSummaryUiState, fz.e eVar, fz.e eVar2, fz.e eVar3, fz.f fVar, h9 h9Var, fz.a aVar, b1 b1Var, b1 b1Var2, b1 b1Var3, av.n nVar, b1 b1Var4, b1 b1Var5) {
        this.f29741t = courseTestFinishSummaryUiState;
        this.H = eVar;
        this.K = eVar2;
        this.L = eVar3;
        this.M = fVar;
        this.N = h9Var;
        this.f29736b = aVar;
        this.f29737c = b1Var;
        this.f29738d = b1Var2;
        this.f29739e = b1Var3;
        this.O = nVar;
        this.f29740f = b1Var4;
        this.P = b1Var5;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        av.n nVar;
        b1 b1Var;
        l0.h hVar;
        b1 b1Var2;
        CourseTestFinishSummaryUiState courseTestFinishSummaryUiState;
        switch (this.f29735a) {
            case 0:
                b3 b3Var = (b3) this.f29741t;
                fz.c cVar = (fz.c) this.H;
                j9.v vVar = (j9.v) this.K;
                ur.a aVar = (ur.a) this.L;
                ni.m mVar = (ni.m) this.M;
                l1 l1Var = (l1) this.N;
                f.n nVar2 = (f.n) this.O;
                fz.a aVar2 = (fz.a) this.P;
                j9.t NavHost = (j9.t) obj;
                kotlin.jvm.internal.m.f(NavHost, "$this$NavHost");
                b1 b1Var3 = this.f29737c;
                b1 b1Var4 = this.f29738d;
                c.a.g(NavHost, "chooseLanguage", null, null, new t1.d(new fu.d(b3Var, cVar, vVar, b1Var3, b1Var4), true, -661256921), 254);
                c.a.g(NavHost, "billing", null, null, new t1.d(new ei.j(aVar, b1Var4, mVar, l1Var, nVar2, this.f29736b, aVar2, this.f29739e, this.f29740f), true, -1453771376), 254);
                break;
            default:
                CourseTestFinishSummaryUiState courseTestFinishSummaryUiState2 = (CourseTestFinishSummaryUiState) this.f29741t;
                fz.e eVar = (fz.e) this.H;
                fz.e eVar2 = (fz.e) this.K;
                fz.e eVar3 = (fz.e) this.L;
                fz.f fVar = (fz.f) this.M;
                h9 h9Var = (h9) this.N;
                av.n nVar3 = (av.n) this.O;
                b1 b1Var5 = (b1) this.P;
                l0.h LazyColumn = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                l0.h.p(LazyColumn, null, new t1.d(new tp.u(5, h9Var, this.f29736b), true, 401423813), 3);
                l0.h.p(LazyColumn, null, ys.a.f57889i, 3);
                b1 b1Var6 = this.f29737c;
                l0.h.p(LazyColumn, null, new t1.d(new ys.b1(courseTestFinishSummaryUiState2, b1Var6, 5), true, -1673695859), 3);
                CourseTestFinishSummaryUiState.Success success = (CourseTestFinishSummaryUiState.Success) courseTestFinishSummaryUiState2;
                boolean zIsSpeakingPractice = success.isSpeakingPractice();
                b1 b1Var7 = this.f29738d;
                b1 b1Var8 = this.f29739e;
                if (zIsSpeakingPractice) {
                    List<WordSentenceCharacterSummaryType> characterItems = success.getCharacterItems();
                    boolean zBooleanValue = ((Boolean) b1Var6.getValue()).booleanValue();
                    long jC = f0.c(1301044210);
                    WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType = (WordSentenceCharacterSummaryType) b1Var7.getValue();
                    WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType2 = (WordSentenceCharacterSummaryType) b1Var8.getValue();
                    a1 a1Var = new a1(b1Var8, b1Var7, nVar3, 0);
                    a1 a1Var2 = new a1(b1Var7, b1Var8, nVar3, 1);
                    nVar = nVar3;
                    b1Var2 = b1Var7;
                    b1Var = b1Var5;
                    hVar = LazyColumn;
                    p1.k(hVar, characterItems, zBooleanValue, "course_c", jC, wordSentenceCharacterSummaryType, wordSentenceCharacterSummaryType2, eVar, eVar2, eVar3, fVar, a1Var, a1Var2);
                    eVar = eVar;
                    eVar2 = eVar2;
                    eVar3 = eVar3;
                } else {
                    nVar = nVar3;
                    b1Var = b1Var5;
                    hVar = LazyColumn;
                    b1Var2 = b1Var7;
                    p1.m(hVar, success.getCharacterItems(), ((Boolean) b1Var6.getValue()).booleanValue(), "course_c", f0.c(1301044210), eVar, eVar2, eVar3, fVar, new a1(nVar, b1Var2, b1Var8, 2));
                }
                b1 b1Var9 = this.f29740f;
                l0.h.p(hVar, null, new t1.d(new ys.b1(courseTestFinishSummaryUiState2, b1Var9, 0), true, -965669588), 3);
                if (success.isSpeakingPractice()) {
                    fz.e eVar4 = eVar3;
                    fz.e eVar5 = eVar;
                    fz.e eVar6 = eVar2;
                    hVar = hVar;
                    courseTestFinishSummaryUiState = courseTestFinishSummaryUiState2;
                    p1.k(hVar, success.getWordItems(), ((Boolean) b1Var9.getValue()).booleanValue(), "course_w", f0.c(1308592640), (WordSentenceCharacterSummaryType) b1Var2.getValue(), (WordSentenceCharacterSummaryType) b1Var8.getValue(), eVar5, eVar6, eVar4, fVar, new a1(b1Var8, b1Var2, nVar, 3), new a1(b1Var2, b1Var8, nVar, 4));
                    eVar = eVar5;
                    eVar2 = eVar6;
                    eVar3 = eVar4;
                } else {
                    courseTestFinishSummaryUiState = courseTestFinishSummaryUiState2;
                    p1.m(hVar, success.getWordItems(), ((Boolean) b1Var9.getValue()).booleanValue(), "course_w", f0.c(1308592640), eVar, eVar2, eVar3, fVar, new a1(nVar, b1Var2, b1Var8, 5));
                }
                b1 b1Var10 = b1Var;
                l0.h.p(hVar, null, new t1.d(new ys.b1(courseTestFinishSummaryUiState, b1Var10, 1), true, -257643317), 3);
                if (success.isSpeakingPractice()) {
                    p1.k(hVar, success.getSentenceItems(), ((Boolean) b1Var10.getValue()).booleanValue(), "course_s", f0.c(1293253375), (WordSentenceCharacterSummaryType) b1Var2.getValue(), (WordSentenceCharacterSummaryType) b1Var8.getValue(), eVar, eVar2, eVar3, fVar, new a1(b1Var8, b1Var2, nVar, 6), new a1(b1Var2, b1Var8, nVar, 7));
                } else {
                    p1.m(hVar, success.getSentenceItems(), ((Boolean) b1Var10.getValue()).booleanValue(), "course_s", f0.c(1293253375), eVar, eVar2, eVar3, fVar, new a1(nVar, b1Var2, b1Var8, 8));
                }
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ q(b1 b1Var, fz.c cVar, j9.v vVar, b1 b1Var2, b1 b1Var3, ur.a aVar, ni.m mVar, l1 l1Var, f.n nVar, fz.a aVar2, fz.a aVar3, b1 b1Var4, b1 b1Var5) {
        this.f29741t = b1Var;
        this.H = cVar;
        this.K = vVar;
        this.f29737c = b1Var2;
        this.f29738d = b1Var3;
        this.L = aVar;
        this.M = mVar;
        this.N = l1Var;
        this.O = nVar;
        this.f29736b = aVar2;
        this.P = aVar3;
        this.f29739e = b1Var4;
        this.f29740f = b1Var5;
    }
}
