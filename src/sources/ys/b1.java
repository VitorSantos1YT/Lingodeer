package ys;

import com.lingodeer.R;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import mt.k4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b1 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseTestFinishSummaryUiState f57928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f57929c;

    public /* synthetic */ b1(CourseTestFinishSummaryUiState courseTestFinishSummaryUiState, l1.b1 b1Var, int i11) {
        this.f57927a = i11;
        this.f57928b = courseTestFinishSummaryUiState;
        this.f57929c = b1Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r0.e eVarD;
        r0.e eVarD2;
        CourseWord word;
        int i11;
        int i12;
        r0.e eVarD3;
        switch (this.f57927a) {
            case 0:
                l0.c item = (l0.c) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    CourseTestFinishSummaryUiState courseTestFinishSummaryUiState = this.f57928b;
                    if (((CourseTestFinishSummaryUiState.Success) courseTestFinishSummaryUiState).getWordItems().isEmpty()) {
                        sVar.d0(-585560106);
                    } else {
                        sVar.d0(-571623901);
                        l1.b1 b1Var = this.f57929c;
                        if (((Boolean) b1Var.getValue()).booleanValue()) {
                            float f5 = 12;
                            eVarD = r0.f.f(f5, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12);
                        } else {
                            eVarD = r0.f.d(12);
                        }
                        k7.d(d2.h.f(j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), new k4(((Boolean) b1Var.getValue()).booleanValue() ? z0.TopItem : z0.FullItem, g2.f0.c(1308592640), 7)), eVarD, null, null, null, t1.e.d(-1519248897, new b1(courseTestFinishSummaryUiState, b1Var, 2), sVar), sVar, 196608, 28);
                    }
                    sVar.p(false);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                l0.c item2 = (l0.c) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item2, "$this$item");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    CourseTestFinishSummaryUiState courseTestFinishSummaryUiState2 = this.f57928b;
                    if (((CourseTestFinishSummaryUiState.Success) courseTestFinishSummaryUiState2).getSentenceItems().isEmpty()) {
                        sVar2.d0(-364126569);
                    } else {
                        sVar2.d0(-345370267);
                        l1.b1 b1Var2 = this.f57929c;
                        if (((Boolean) b1Var2.getValue()).booleanValue()) {
                            float f11 = 12;
                            eVarD2 = r0.f.f(f11, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12);
                        } else {
                            eVarD2 = r0.f.d(12);
                        }
                        k7.d(d2.h.f(j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), new k4(((Boolean) b1Var2.getValue()).booleanValue() ? z0.TopItem : z0.FullItem, g2.f0.c(1293253375), 7)), eVarD2, null, null, null, t1.e.d(-811222626, new b1(courseTestFinishSummaryUiState2, b1Var2, 4), sVar2), sVar2, 196608, 28);
                    }
                    sVar2.p(false);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                j0.v Card = (j0.v) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    l1.b1 b1Var3 = this.f57929c;
                    l1.b3 b3VarB = b0.h.b(((Boolean) b1Var3.getValue()).booleanValue() ? 90.0f : CropImageView.DEFAULT_ASPECT_RATIO, null, BuildConfig.VERSION_NAME, sVar3, 3072, 22);
                    String strE0 = ub.a.e0(sVar3, R.string.words);
                    int size = ((CourseTestFinishSummaryUiState.Success) this.f57928b).getWordItems().size();
                    long jC = g2.f0.c(452954624);
                    float fFloatValue = ((Number) b3VarB.getValue()).floatValue();
                    Object objQ = sVar3.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = new xu.m(29, b1Var3);
                        sVar3.o0(objQ);
                    }
                    p1.c(R.drawable.course_summary_category_word, strE0, size, jC, fFloatValue, (fz.a) objQ, sVar3, 199680);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                j0.v Card2 = (j0.v) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card2, "$this$Card");
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar4, 0);
                    int iHashCode = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL = sVar4.l();
                    z1.r rVarC = z1.a.c(sVar4, z1.o.f58481a);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar4);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar4);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar4);
                    l1.b1 b1Var4 = this.f57929c;
                    l1.b3 b3VarB2 = b0.h.b(((Boolean) b1Var4.getValue()).booleanValue() ? 90.0f : CropImageView.DEFAULT_ASPECT_RATIO, null, BuildConfig.VERSION_NAME, sVar4, 3072, 22);
                    CourseTestFinishSummaryUiState.Success success = (CourseTestFinishSummaryUiState.Success) this.f57928b;
                    boolean zF = sVar4.f(success.getCharacterItems());
                    Object objQ2 = sVar4.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF || objQ2 == gVar) {
                        Object objQ0 = ry.m.q0(success.getCharacterItems());
                        WordSentenceCharacterSummaryType.WordType wordType = objQ0 instanceof WordSentenceCharacterSummaryType.WordType ? (WordSentenceCharacterSummaryType.WordType) objQ0 : null;
                        objQ2 = Boolean.valueOf((wordType == null || (word = wordType.getWord()) == null || word.getWordType() != 4) ? false : true);
                        sVar4.o0(objQ2);
                    }
                    if (((Boolean) objQ2).booleanValue()) {
                        i11 = 1342359385;
                        i12 = R.string.chinese_tone_syllables;
                    } else {
                        i11 = 1342361123;
                        i12 = R.string.characters;
                    }
                    String strM = ep.a.m(sVar4, i11, i12, sVar4, false);
                    int size2 = success.getCharacterItems().size();
                    long jC2 = g2.f0.c(445406194);
                    float fFloatValue2 = ((Number) b3VarB2.getValue()).floatValue();
                    Object objQ3 = sVar4.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new d1(0, b1Var4);
                        sVar4.o0(objQ3);
                    }
                    p1.c(R.drawable.course_summary_category_character, strM, size2, jC2, fFloatValue2, (fz.a) objQ3, sVar4, 199680);
                    sVar4.p(true);
                } else {
                    sVar4.W();
                }
                break;
            case 4:
                j0.v Card3 = (j0.v) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card3, "$this$Card");
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    l1.b1 b1Var5 = this.f57929c;
                    l1.b3 b3VarB3 = b0.h.b(((Boolean) b1Var5.getValue()).booleanValue() ? 90.0f : CropImageView.DEFAULT_ASPECT_RATIO, null, BuildConfig.VERSION_NAME, sVar5, 3072, 22);
                    String strE1 = ub.a.e0(sVar5, R.string.sentences);
                    int size3 = ((CourseTestFinishSummaryUiState.Success) this.f57928b).getSentenceItems().size();
                    long jC3 = g2.f0.c(437615359);
                    float fFloatValue3 = ((Number) b3VarB3.getValue()).floatValue();
                    Object objQ4 = sVar5.Q();
                    if (objQ4 == l1.m.f39353a) {
                        objQ4 = new d1(1, b1Var5);
                        sVar5.o0(objQ4);
                    }
                    p1.c(R.drawable.course_summary_category_sentence, strE1, size3, jC3, fFloatValue3, (fz.a) objQ4, sVar5, 199680);
                } else {
                    sVar5.W();
                }
                break;
            default:
                l0.c item3 = (l0.c) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item3, "$this$item");
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    CourseTestFinishSummaryUiState courseTestFinishSummaryUiState3 = this.f57928b;
                    if (((CourseTestFinishSummaryUiState.Success) courseTestFinishSummaryUiState3).getCharacterItems().isEmpty()) {
                        sVar6.d0(-806546251);
                    } else {
                        sVar6.d0(-797854781);
                        l1.b1 b1Var6 = this.f57929c;
                        if (((Boolean) b1Var6.getValue()).booleanValue()) {
                            float f12 = 12;
                            eVarD3 = r0.f.f(f12, f12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12);
                        } else {
                            eVarD3 = r0.f.d(12);
                        }
                        k7.d(d2.h.f(z1.o.f58481a, new k4(((Boolean) b1Var6.getValue()).booleanValue() ? z0.TopItem : z0.FullItem, g2.f0.c(1301044210), 7)), eVarD3, null, null, null, t1.e.d(2067692128, new b1(courseTestFinishSummaryUiState3, b1Var6, 3), sVar6), sVar6, 196608, 28);
                    }
                    sVar6.p(false);
                } else {
                    sVar6.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
