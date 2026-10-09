package fu;

import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.r3;
import h1.dc;
import h1.fc;
import h1.r4;
import h1.s1;
import h1.ua;
import h1.v1;
import hh.p0;
import j0.b2;
import j0.e2;
import j3.y0;
import l1.c3;
import l1.q1;
import mt.y3;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b0 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28065b;

    public /* synthetic */ b0(int i11, int i12) {
        this.f28064a = i12;
        this.f28065b = i11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11;
        switch (this.f28064a) {
            case 0:
                b2 AppGradientButton = (b2) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton, "$this$AppGradientButton");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar, this.f28065b), null, null, sVar, 0, 6);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                j0.v Card = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarD = e2.d(oVar, 1.0f);
                    q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    int iHashCode = Long.hashCode(sVar2.T);
                    q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(sVar2, rVarD);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar2);
                    Object objQ = sVar2.Q();
                    int i12 = this.f28065b;
                    l1.g gVar = l1.m.f39353a;
                    if (objQ == gVar) {
                        if (i12 == 1) {
                            i11 = R.raw.first_tone;
                        } else if (i12 == 2) {
                            i11 = R.raw.second_tone;
                        } else if (i12 != 3) {
                            i11 = i12 != 4 ? R.raw.neutral_tone : R.raw.fourth_tone;
                        } else {
                            i11 = R.raw.third_tone;
                        }
                        objQ = Integer.valueOf(i11);
                        sVar2.o0(objQ);
                    }
                    int iIntValue3 = ((Number) objQ).intValue();
                    z1.r rVarD2 = e2.d(oVar, 1.0f);
                    boolean zD = sVar2.d(i12);
                    Object objQ2 = sVar2.Q();
                    if (zD || objQ2 == gVar) {
                        objQ2 = new r3(i12, 2);
                        sVar2.o0(objQ2);
                    }
                    tv.g.a(rVarD2, iIntValue3, null, null, false, (fz.c) objQ2, sVar2, 196662, 28);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                b2 Button = (b2) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Button, "$this$Button");
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    r4.b(se.k.y(R.drawable.delete_24px, sVar3, 0), null, null, 0L, sVar3, 48, 12);
                    j0.c.g(sVar3, e2.s(z1.o.f58481a, 6));
                    ua.b(oz.x.q0(ub.a.e0(sVar3, R.string.offline_batch_delete), "%s", String.valueOf(this.f28065b)), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                b2 AppGradientButton2 = (b2) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton2, "$this$AppGradientButton");
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar4, R.string.listen_along_play) + " (" + this.f28065b + ")", null, null, sVar4, 0, 6);
                } else {
                    sVar4.W();
                }
                break;
            case 4:
                j0.v OutlinedCard = (j0.v) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard, "$this$OutlinedCard");
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    y3.m(R.drawable.course_review_index_quiz, this.f28065b, 0, ub.a.e0(sVar5, R.string._5_min_quiz_audio_based), sVar5, j0.c.B(z1.o.f58481a, 10, 12));
                } else {
                    sVar5.W();
                }
                break;
            case 5:
                j0.v OutlinedCard2 = (j0.v) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard2, "$this$OutlinedCard");
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    y3.m(R.drawable.course_review_index_quiz_video, this.f28065b, 0, ub.a.e0(sVar6, R.string._5_min_quiz_video_based), sVar6, j0.c.B(z1.o.f58481a, 10, 12));
                } else {
                    sVar6.W();
                }
                break;
            case 6:
                j0.v OutlinedCard3 = (j0.v) obj;
                l1.n nVar7 = (l1.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard3, "$this$OutlinedCard");
                l1.s sVar7 = (l1.s) nVar7;
                if (sVar7.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    y3.m(R.drawable.course_review_index_character, this.f28065b, 0, ub.a.e0(sVar7, R.string.knowledge_note_characters), sVar7, j0.c.B(z1.o.f58481a, 10, 12));
                } else {
                    sVar7.W();
                }
                break;
            case 7:
                j0.v OutlinedCard4 = (j0.v) obj;
                l1.n nVar8 = (l1.n) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard4, "$this$OutlinedCard");
                l1.s sVar8 = (l1.s) nVar8;
                if (sVar8.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    y3.m(R.drawable.course_review_index_word, this.f28065b, 0, ub.a.e0(sVar8, R.string.knowledge_note_words), sVar8, j0.c.B(z1.o.f58481a, 10, 12));
                } else {
                    sVar8.W();
                }
                break;
            case 8:
                j0.v OutlinedCard5 = (j0.v) obj;
                l1.n nVar9 = (l1.n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard5, "$this$OutlinedCard");
                l1.s sVar9 = (l1.s) nVar9;
                if (sVar9.T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    y3.m(R.drawable.course_review_index_sentence, this.f28065b, 0, ub.a.e0(sVar9, R.string.knowledge_note_sentences), sVar9, j0.c.B(z1.o.f58481a, 10, 12));
                } else {
                    sVar9.W();
                }
                break;
            case 9:
                j0.v OutlinedCard6 = (j0.v) obj;
                l1.n nVar10 = (l1.n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard6, "$this$OutlinedCard");
                l1.s sVar10 = (l1.s) nVar10;
                if (sVar10.T(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    y3.m(R.drawable.course_review_index_character, this.f28065b, 0, ub.a.e0(sVar10, R.string.characters_bookmarked), sVar10, j0.c.B(z1.o.f58481a, 10, 12));
                } else {
                    sVar10.W();
                }
                break;
            case 10:
                j0.v OutlinedCard7 = (j0.v) obj;
                l1.n nVar11 = (l1.n) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard7, "$this$OutlinedCard");
                l1.s sVar11 = (l1.s) nVar11;
                if (sVar11.T(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    y3.m(R.drawable.course_review_index_word, this.f28065b, 0, ub.a.e0(sVar11, R.string.words_bookmarked), sVar11, j0.c.B(z1.o.f58481a, 10, 12));
                } else {
                    sVar11.W();
                }
                break;
            case 11:
                j0.v OutlinedCard8 = (j0.v) obj;
                l1.n nVar12 = (l1.n) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard8, "$this$OutlinedCard");
                l1.s sVar12 = (l1.s) nVar12;
                if (sVar12.T(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    y3.m(R.drawable.course_review_index_sentence, this.f28065b, 0, ub.a.e0(sVar12, R.string.expressions_bookmarked), sVar12, j0.c.B(z1.o.f58481a, 10, 12));
                } else {
                    sVar12.W();
                }
                break;
            case 12:
                b2 AppGradientButton3 = (b2) obj;
                l1.n nVar13 = (l1.n) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton3, "$this$AppGradientButton");
                l1.s sVar13 = (l1.s) nVar13;
                if (sVar13.T(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar13, R.string.start) + " (" + this.f28065b + ")", null, null, sVar13, 0, 6);
                } else {
                    sVar13.W();
                }
                break;
            default:
                a0.k0 AnimatedVisibility = (a0.k0) obj;
                l1.n nVar14 = (l1.n) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, nVar14, 48);
                l1.s sVar14 = (l1.s) nVar14;
                int iHashCode2 = Long.hashCode(sVar14.T);
                q1 q1VarL2 = sVar14.l();
                z1.o oVar2 = z1.o.f58481a;
                z1.r rVarC2 = z1.a.c(nVar14, oVar2);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar14.h0();
                if (sVar14.S) {
                    sVar14.k(iVar2);
                } else {
                    sVar14.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA, nVar14);
                l1.t.J(y2.j.f56916e, q1VarL2, nVar14);
                y2.h hVar2 = y2.j.f56918g;
                if (sVar14.S || !kotlin.jvm.internal.m.a(sVar14.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar14, iHashCode2, hVar2);
                }
                l1.t.J(y2.j.f56915d, rVarC2, nVar14);
                String strE0 = ub.a.e0(nVar14, R.string.you_have_unlock_all_preceding_lessons);
                float f5 = 16;
                z1.r rVarE = j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                c3 c3Var = fc.f30256a;
                l1.s sVar15 = (l1.s) nVar14;
                y0 y0Var = ((dc) sVar15.j(c3Var)).f30174g;
                long j11 = ((s1) sVar15.j(v1.f31180a)).f31017a;
                n3.s sVar16 = n3.s.N;
                ua.b(strE0, rVarE, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, j11, 0L, sVar16, null, null, 0L, null, null, 0, 0, 0L, null, 16777210), nVar14, 48, 0, 65532);
                ua.b(p0.h(this.f28065b, "+", " XP"), j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(((dc) sVar15.j(c3Var)).f30174g, g2.f0.e(4291411327L), 0L, sVar16, null, null, 0L, null, null, 0, 0, 0L, null, 16777210), nVar14, 48, 0, 65532);
                sVar14.p(true);
                break;
        }
        return qy.b0.f48488a;
    }
}
