package ys;

import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import rt.dc;
import rt.ka;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l1 implements fz.g {
    public final /* synthetic */ long H;
    public final /* synthetic */ List K;
    public final /* synthetic */ WordSentenceCharacterSummaryType L;
    public final /* synthetic */ fz.c M;
    public final /* synthetic */ WordSentenceCharacterSummaryType N;
    public final /* synthetic */ fz.c O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f58128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f58129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.e f58130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.e f58131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.e f58132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.f f58133f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f58134t;

    public l1(List list, String str, fz.e eVar, fz.e eVar2, fz.e eVar3, fz.f fVar, boolean z11, long j11, List list2, WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType, fz.c cVar, WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType2, fz.c cVar2) {
        this.f58128a = list;
        this.f58129b = str;
        this.f58130c = eVar;
        this.f58131d = eVar2;
        this.f58132e = eVar3;
        this.f58133f = fVar;
        this.f58134t = z11;
        this.H = j11;
        this.K = list2;
        this.L = wordSentenceCharacterSummaryType;
        this.M = cVar;
        this.N = wordSentenceCharacterSummaryType2;
        this.O = cVar2;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        dc dcVar;
        ka kaVar;
        ka kaVar2;
        l0.c cVar = (l0.c) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.n nVar = (l1.n) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i11 = (((l1.s) nVar).f(cVar) ? 4 : 2) | iIntValue2;
        } else {
            i11 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i11 |= ((l1.s) nVar).d(iIntValue) ? 32 : 16;
        }
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(i11 & 1, (i11 & 147) != 146)) {
            WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType = (WordSentenceCharacterSummaryType) this.f58128a.get(iIntValue);
            sVar.d0(440505337);
            boolean z11 = wordSentenceCharacterSummaryType instanceof WordSentenceCharacterSummaryType.SentenceType;
            List<CourseWord> displayCourseWords = z11 ? ((WordSentenceCharacterSummaryType.SentenceType) wordSentenceCharacterSummaryType).getSentence().getDisplayCourseWords() : ry.r.f50854a;
            float speechScore = z11 ? ((WordSentenceCharacterSummaryType.SentenceType) wordSentenceCharacterSummaryType).getSentence().getSpeechScore() : -1.0f;
            String translation = z11 ? ((WordSentenceCharacterSummaryType.SentenceType) wordSentenceCharacterSummaryType).getSentence().getTranslation() : BuildConfig.VERSION_NAME;
            boolean z12 = !wordSentenceCharacterSummaryType.isSkipped() && speechScore >= CropImageView.DEFAULT_ASPECT_RATIO;
            long jF = p1.f(wordSentenceCharacterSummaryType);
            fz.e eVar = this.f58130c;
            String str = this.f58129b;
            l1.b1 b1VarH = p1.h(str, jF, eVar, sVar);
            boolean z13 = (b1VarH == null || (kaVar2 = (ka) b1VarH.getValue()) == null || !kaVar2.f49981a || this.f58131d == null) ? false : true;
            boolean z14 = (b1VarH == null || (kaVar = (ka) b1VarH.getValue()) == null || !kaVar.f49982b) ? false : true;
            l1.b1 b1VarI = p1.i(str, jF, this.f58132e, sVar);
            boolean z15 = (b1VarI == null || (dcVar = (dc) b1VarI.getValue()) == null || !dcVar.f49635a || this.f58133f == null) ? false : true;
            boolean zF = sVar.f(wordSentenceCharacterSummaryType);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            a0.j0.d(this.f58134t, j0.e2.e(z1.o.f58481a, 1.0f), null, null, null, t1.e.d(250231044, new k1(this.H, iIntValue, this.K, z13, z14, this.f58131d, str, jF, b1VarI, wordSentenceCharacterSummaryType, (l1.b1) objQ, this.f58133f, z15, displayCourseWords, translation, z12, this.L, this.M, this.N, speechScore, this.O), sVar), sVar, 196656, 28);
            sVar.p(false);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }
}
