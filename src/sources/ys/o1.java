package ys;

import com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import rt.dc;
import rt.ka;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o1 implements fz.g {
    public final /* synthetic */ long H;
    public final /* synthetic */ List K;
    public final /* synthetic */ fz.c L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f58192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f58193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.e f58194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.e f58195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.e f58196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.f f58197f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f58198t;

    public o1(List list, String str, fz.e eVar, fz.e eVar2, fz.e eVar3, fz.f fVar, boolean z11, long j11, List list2, fz.c cVar) {
        this.f58192a = list;
        this.f58193b = str;
        this.f58194c = eVar;
        this.f58195d = eVar2;
        this.f58196e = eVar3;
        this.f58197f = fVar;
        this.f58198t = z11;
        this.H = j11;
        this.K = list2;
        this.L = cVar;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        String translation;
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
            WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType = (WordSentenceCharacterSummaryType) this.f58192a.get(iIntValue);
            sVar.d0(-2035206873);
            if (wordSentenceCharacterSummaryType instanceof WordSentenceCharacterSummaryType.SentenceType) {
                translation = ((WordSentenceCharacterSummaryType.SentenceType) wordSentenceCharacterSummaryType).getSentence().getTranslation();
            } else if (wordSentenceCharacterSummaryType instanceof WordSentenceCharacterSummaryType.WordType) {
                translation = ((WordSentenceCharacterSummaryType.WordType) wordSentenceCharacterSummaryType).getWord().getTranslation();
            } else {
                if (!(wordSentenceCharacterSummaryType instanceof WordSentenceCharacterSummaryType.CharacterType)) {
                    throw new NoWhenBranchMatchedException();
                }
                translation = ((WordSentenceCharacterSummaryType.CharacterType) wordSentenceCharacterSummaryType).getCharacter().getTranslation();
            }
            String str = translation;
            String soundChangePronunciation = wordSentenceCharacterSummaryType instanceof WordSentenceCharacterSummaryType.WordType ? ((WordSentenceCharacterSummaryType.WordType) wordSentenceCharacterSummaryType).getWord().getSoundChangePronunciation() : BuildConfig.VERSION_NAME;
            long jF = p1.f(wordSentenceCharacterSummaryType);
            fz.e eVar = this.f58194c;
            String str2 = this.f58193b;
            l1.b1 b1VarH = p1.h(str2, jF, eVar, sVar);
            boolean z11 = (b1VarH == null || (kaVar2 = (ka) b1VarH.getValue()) == null || !kaVar2.f49981a || this.f58195d == null) ? false : true;
            boolean z12 = (b1VarH == null || (kaVar = (ka) b1VarH.getValue()) == null || !kaVar.f49982b) ? false : true;
            l1.b1 b1VarI = p1.i(str2, jF, this.f58196e, sVar);
            boolean z13 = (b1VarI == null || (dcVar = (dc) b1VarI.getValue()) == null || !dcVar.f49635a || this.f58197f == null) ? false : true;
            boolean zF = sVar.f(wordSentenceCharacterSummaryType);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            a0.j0.d(this.f58198t, j0.e2.e(z1.o.f58481a, 1.0f), null, null, null, t1.e.d(-43332182, new n1(this.H, iIntValue, this.K, wordSentenceCharacterSummaryType, this.L, z11, z12, this.f58195d, str2, jF, b1VarI, (l1.b1) objQ, this.f58197f, z13, p1.j(wordSentenceCharacterSummaryType, sVar), str, soundChangePronunciation), sVar), sVar, 196656, 28);
            sVar.p(false);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }
}
