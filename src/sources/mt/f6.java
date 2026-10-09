package mt;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.WordSentenceSourceKt;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import rt.c7;
import rt.d7;
import rt.e7;
import rt.e8;
import rt.f7;
import rt.f8;
import rt.g7;
import rt.g8;
import rt.i7;
import rt.j7;
import rt.k7;
import rt.l7;
import rt.m7;
import rt.m8;
import rt.n7;
import rt.o7;
import rt.p7;
import rt.p8;
import rt.q7;
import rt.r7;
import rt.r8;
import rt.s7;
import rt.x8;
import rt.y8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f6 {
    public static final void a(WordSentenceCharacterType.CharacterType characterType, boolean z11, z1.r modifier, l1.n nVar, int i11) {
        long jY;
        long jY2;
        kotlin.jvm.internal.m.f(modifier, "modifier");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1884905311);
        int i12 = (sVar.h(characterType) ? 4 : 2) | i11 | (sVar.g(z11) ? 32 : 16);
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(modifier) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, modifier);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            CourseWord wordItem = WordSentenceSourceKt.toWordItem(characterType.getCharacter());
            l1.d0 d0Var = ua.f31167a;
            j3.y0 y0Var = (j3.y0) sVar.j(d0Var);
            long jA = fr.j3.A(18);
            if (z11) {
                sVar.d0(913735130);
                jY = ob.f.y((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                sVar.p(false);
            } else {
                sVar.d0(913654778);
                jY = ((h1.s1) sVar.j(h1.v1.f31180a)).f31034q;
                sVar.p(false);
            }
            dt.g4.b(wordItem, j3.y0.a(y0Var, jY, jA, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), j0.c.E(z1.o.f58481a, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), false, null, false, false, false, 0, z1.c.O, sVar, 805306752, 504);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.c.g(sVar, new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            String translation = characterType.getCharacter().getTranslation();
            j3.y0 y0Var2 = (j3.y0) sVar.j(d0Var);
            if (z11) {
                sVar.d0(914229146);
                jY2 = ob.f.y((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                sVar.p(false);
            } else {
                sVar.d0(914142067);
                jY2 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s;
                sVar.p(false);
            }
            j3.y0 y0VarA = j3.y0.a(y0Var2, jY2, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            ua.b(translation, j0.c.E(new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, new u3.k(6), 0L, 0, false, 0, 0, y0VarA, sVar, 0, 0, 65020);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.l3(characterType, z11, modifier, i11, 3);
        }
    }

    public static final void b(WordSentenceCharacterType.SentenceType sentenceType, boolean z11, z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar;
        long jY;
        long jY2;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-157569909);
        int i12 = (sVar2.h(sentenceType) ? 4 : 2) | i11 | (sVar2.g(z11) ? 32 : 16);
        if ((i11 & 384) == 0) {
            i12 |= sVar2.f(rVar) ? 256 : 128;
        }
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar2);
            List<CourseWord> displayCourseWords = sentenceType.getSentence().getDisplayCourseWords();
            l1.d0 d0Var = ua.f31167a;
            j3.y0 y0Var = (j3.y0) sVar2.j(d0Var);
            long jA = fr.j3.A(18);
            if (z11) {
                sVar2.d0(-189718782);
                jY = ob.f.y((h1.s1) sVar2.j(h1.v1.f31180a), sVar2);
                sVar2.p(false);
            } else {
                sVar2.d0(-189638430);
                jY = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31034q;
                sVar2.p(false);
            }
            dt.d4.a(displayCourseWords, null, null, false, false, j3.y0.a(y0Var, jY, jA, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), j0.i.f35303a, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar2, 1575936, 0, 0, 4194198);
            j0.c.g(sVar2, j0.e2.g(z1.o.f58481a, 4));
            String translation = sentenceType.getSentence().getTranslation();
            j3.y0 y0Var2 = (j3.y0) sVar2.j(d0Var);
            if (z11) {
                sVar2.d0(-189272382);
                jY2 = ob.f.y((h1.s1) sVar2.j(h1.v1.f31180a), sVar2);
                sVar2.p(false);
            } else {
                sVar2.d0(-189191813);
                jY2 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31036s;
                sVar2.p(false);
            }
            ua.b(translation, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var2, jY2, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar2, 0, 0, 65534);
            sVar = sVar2;
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.l3(sentenceType, z11, rVar, i11, 2);
        }
    }

    public static final void c(WordSentenceCharacterType.WordType wordType, boolean z11, z1.r rVar, l1.n nVar, int i11) {
        long jY;
        long jY2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-104342037);
        int i12 = (sVar.h(wordType) ? 4 : 2) | i11 | (sVar.g(z11) ? 32 : 16);
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(rVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            CourseWord word = wordType.getWord();
            l1.d0 d0Var = ua.f31167a;
            j3.y0 y0Var = (j3.y0) sVar.j(d0Var);
            long jA = fr.j3.A(18);
            if (z11) {
                sVar.d0(-1986265264);
                jY = ob.f.y((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                sVar.p(false);
            } else {
                sVar.d0(-1986184912);
                jY = ((h1.s1) sVar.j(h1.v1.f31180a)).f31034q;
                sVar.p(false);
            }
            dt.g4.b(word, j3.y0.a(y0Var, jY, jA, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), j0.c.E(z1.o.f58481a, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), false, null, false, false, false, 0, z1.c.O, sVar, 805306752, 504);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.c.g(sVar, new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            String translation = wordType.getWord().getTranslation();
            j3.y0 y0Var2 = (j3.y0) sVar.j(d0Var);
            if (z11) {
                sVar.d0(-1985819856);
                jY2 = ob.f.y((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                sVar.p(false);
            } else {
                sVar.d0(-1985739287);
                jY2 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s;
                sVar.p(false);
            }
            j3.y0 y0VarA = j3.y0.a(y0Var2, jY2, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            ua.b(translation, j0.c.E(new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, new u3.k(6), 0L, 0, false, 0, 0, y0VarA, sVar, 0, 0, 65020);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.l3(wordType, z11, rVar, i11, 4);
        }
    }

    public static final void d(final List units, final z1.r rVar, final boolean z11, final boolean z12, final fz.e onCourseReviewUnitCheckedChange, final fz.f onCourseReviewCheckedChange, final fz.c onHeaderClick, final fz.c onPlayAudio, final fz.c onToggleFavorite, final boolean z13, final fz.c cVar, final fz.a onShowPremiumWall, l1.n nVar, final int i11) {
        int i12;
        boolean z14;
        boolean z15;
        l1.s sVar;
        int i13;
        kotlin.jvm.internal.m.f(units, "units");
        kotlin.jvm.internal.m.f(onCourseReviewUnitCheckedChange, "onCourseReviewUnitCheckedChange");
        kotlin.jvm.internal.m.f(onCourseReviewCheckedChange, "onCourseReviewCheckedChange");
        kotlin.jvm.internal.m.f(onHeaderClick, "onHeaderClick");
        kotlin.jvm.internal.m.f(onPlayAudio, "onPlayAudio");
        kotlin.jvm.internal.m.f(onToggleFavorite, "onToggleFavorite");
        kotlin.jvm.internal.m.f(onShowPremiumWall, "onShowPremiumWall");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-2000222379);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(units) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            z14 = z12;
            i12 |= sVar2.g(z14) ? 2048 : 1024;
        } else {
            z14 = z12;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(onCourseReviewUnitCheckedChange) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(onCourseReviewCheckedChange) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.h(onHeaderClick) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar2.h(onPlayAudio) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= sVar2.h(onToggleFavorite) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            z15 = z13;
            i12 |= sVar2.g(z15) ? 536870912 : 268435456;
        } else {
            z15 = z13;
        }
        if (sVar2.T(i12 & 1, (i12 & 306783379) != 306783378)) {
            l0.w wVarA = l0.y.a(0, sVar2, 3);
            boolean zH = ((i12 & 896) == 256) | sVar2.h(units) | ((i12 & 7168) == 2048) | ((57344 & i12) == 16384) | ((3670016 & i12) == 1048576) | ((458752 & i12) == 131072) | ((29360128 & i12) == 8388608) | ((234881024 & i12) == 67108864) | ((1879048192 & i12) == 536870912);
            Object objQ = sVar2.Q();
            if (zH || objQ == l1.m.f39353a) {
                final boolean z16 = z14;
                final boolean z17 = z15;
                i13 = i12;
                fz.c cVar2 = new fz.c() { // from class: mt.z5
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        l0.h LazyColumn = (l0.h) obj;
                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                        for (y8 y8Var : units) {
                            String strH = defpackage.e.h(y8Var.f50691a, "unit_");
                            boolean z18 = z11;
                            boolean z19 = z16;
                            fz.e eVar = onCourseReviewUnitCheckedChange;
                            fz.a aVar = onShowPremiumWall;
                            l0.h.p(LazyColumn, strH, new t1.d(new br.b0(z18, y8Var, z19, eVar, aVar, onHeaderClick, 2), true, 1214536972), 2);
                            if (y8Var.f50697g) {
                                List list = y8Var.f50700j;
                                LazyColumn.q(list.size(), new av.r(12, new k(8, (byte) 0), list), new bp.p0(21, list), new t1.d(new d6(list, y8Var, onCourseReviewCheckedChange, aVar, onPlayAudio, onToggleFavorite, z19, cVar, z17), true, 2039820996));
                            }
                        }
                        l0.h.p(LazyColumn, null, g.G0, 3);
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(cVar2);
                objQ = cVar2;
            } else {
                i13 = i12;
            }
            sVar = sVar2;
            ue.f.a(rVar, wVarA, null, null, null, null, false, null, (fz.c) objQ, sVar, (i13 >> 3) & 14, 508);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: mt.a6
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f6.d(units, rVar, z11, z12, onCourseReviewUnitCheckedChange, onCourseReviewCheckedChange, onHeaderClick, onPlayAudio, onToggleFavorite, z13, cVar, onShowPremiumWall, (l1.n) obj, l1.t.M(i11 | 1));
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void e(x8 reviewType, boolean z11, boolean z12, final m8 m8Var, fz.a onBackClick, fz.e onPracticeClick, fz.a goBilling, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(reviewType, "reviewType");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        kotlin.jvm.internal.m.f(goBilling, "goBilling");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1030031730);
        int i12 = i11 | (sVar2.d(reviewType.ordinal()) ? 4 : 2) | (sVar2.g(z11) ? 32 : 16) | (sVar2.g(z12) ? 256 : 128) | (sVar2.h(m8Var) ? 2048 : 1024) | (sVar2.h(onBackClick) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(onPracticeClick) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(goBilling) ? 1048576 : 524288);
        if (sVar2.T(i12 & 1, (599187 & i12) != 599186)) {
            sVar2.Y();
            if ((i11 & 1) != 0 && !sVar2.C()) {
                sVar2.W();
            }
            sVar2.q();
            g8 g8Var = (g8) l1.t.o(m8Var.f49897c0, sVar2).getValue();
            boolean zH = sVar2.h(m8Var);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                final int i13 = 2;
                objQ = new fz.e() { // from class: mt.v5
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i13) {
                            case 0:
                                WordSentenceCharacterType contentType = (WordSentenceCharacterType) obj;
                                String folderId = (String) obj2;
                                kotlin.jvm.internal.m.f(contentType, "contentType");
                                kotlin.jvm.internal.m.f(folderId, "folderId");
                                m8Var.f(new f7(contentType, folderId));
                                break;
                            case 1:
                                WordSentenceCharacterType contentType2 = (WordSentenceCharacterType) obj;
                                String note = (String) obj2;
                                kotlin.jvm.internal.m.f(contentType2, "contentType");
                                kotlin.jvm.internal.m.f(note, "note");
                                m8Var.f(new n7(contentType2, note));
                                break;
                            case 2:
                                y8 courseReviewUnit = (y8) obj;
                                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                kotlin.jvm.internal.m.f(courseReviewUnit, "courseReviewUnit");
                                m8Var.f(new i7(courseReviewUnit, zBooleanValue));
                                break;
                            default:
                                List selectedContents = (List) obj;
                                List practiceModels = (List) obj2;
                                kotlin.jvm.internal.m.f(selectedContents, "selectedContents");
                                kotlin.jvm.internal.m.f(practiceModels, "practiceModels");
                                m8Var.f(new l7(selectedContents, practiceModels));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ);
            }
            fz.e eVar = (fz.e) objQ;
            boolean zH2 = sVar2.h(m8Var);
            Object objQ2 = sVar2.Q();
            if (zH2 || objQ2 == gVar) {
                objQ2 = new a00.b(m8Var, 26);
                sVar2.o0(objQ2);
            }
            fz.f fVar = (fz.f) objQ2;
            boolean zH3 = sVar2.h(m8Var);
            Object objQ3 = sVar2.Q();
            if (zH3 || objQ3 == gVar) {
                final int i14 = 4;
                objQ3 = new fz.c() { // from class: mt.u5
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                WordSentenceCharacterType it = (WordSentenceCharacterType) obj;
                                kotlin.jvm.internal.m.f(it, "it");
                                m8Var.f(new k7(it));
                                break;
                            case 1:
                                WordSentenceCharacterType it2 = (WordSentenceCharacterType) obj;
                                kotlin.jvm.internal.m.f(it2, "it");
                                m8Var.f(new s7(it2));
                                break;
                            case 2:
                                String it3 = (String) obj;
                                kotlin.jvm.internal.m.f(it3, "it");
                                m8Var.f(new p7(it3));
                                break;
                            case 3:
                                String name = (String) obj;
                                kotlin.jvm.internal.m.f(name, "name");
                                m8Var.f(new d7(name));
                                break;
                            case 4:
                                y8 it4 = (y8) obj;
                                kotlin.jvm.internal.m.f(it4, "it");
                                m8Var.f(new j7(it4));
                                break;
                            case 5:
                                r8 it5 = (r8) obj;
                                kotlin.jvm.internal.m.f(it5, "it");
                                m8Var.f(new g7(it5));
                                break;
                            case 6:
                                p8 it6 = (p8) obj;
                                kotlin.jvm.internal.m.f(it6, "it");
                                m8Var.f(new q7(it6));
                                break;
                            default:
                                r8 it7 = (r8) obj;
                                kotlin.jvm.internal.m.f(it7, "it");
                                m8Var.f(new r7(it7));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ3);
            }
            fz.c cVar = (fz.c) objQ3;
            boolean zH4 = sVar2.h(m8Var);
            Object objQ4 = sVar2.Q();
            if (zH4 || objQ4 == gVar) {
                final int i15 = 2;
                objQ4 = new fz.a() { // from class: mt.t5
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                m8Var.f(m7.f50066a);
                                break;
                            case 1:
                                m8Var.f(c7.f49568a);
                                break;
                            case 2:
                                m8Var.f(o7.f50197a);
                                break;
                            default:
                                m8Var.f(e7.f49684a);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ4);
            }
            fz.a aVar = (fz.a) objQ4;
            boolean zH5 = sVar2.h(m8Var);
            Object objQ5 = sVar2.Q();
            if (zH5 || objQ5 == gVar) {
                final int i16 = 3;
                objQ5 = new fz.a() { // from class: mt.t5
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                m8Var.f(m7.f50066a);
                                break;
                            case 1:
                                m8Var.f(c7.f49568a);
                                break;
                            case 2:
                                m8Var.f(o7.f50197a);
                                break;
                            default:
                                m8Var.f(e7.f49684a);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ5);
            }
            fz.a aVar2 = (fz.a) objQ5;
            boolean zH6 = sVar2.h(m8Var);
            Object objQ6 = sVar2.Q();
            if (zH6 || objQ6 == gVar) {
                final int i17 = 5;
                objQ6 = new fz.c() { // from class: mt.u5
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i17) {
                            case 0:
                                WordSentenceCharacterType it = (WordSentenceCharacterType) obj;
                                kotlin.jvm.internal.m.f(it, "it");
                                m8Var.f(new k7(it));
                                break;
                            case 1:
                                WordSentenceCharacterType it2 = (WordSentenceCharacterType) obj;
                                kotlin.jvm.internal.m.f(it2, "it");
                                m8Var.f(new s7(it2));
                                break;
                            case 2:
                                String it3 = (String) obj;
                                kotlin.jvm.internal.m.f(it3, "it");
                                m8Var.f(new p7(it3));
                                break;
                            case 3:
                                String name = (String) obj;
                                kotlin.jvm.internal.m.f(name, "name");
                                m8Var.f(new d7(name));
                                break;
                            case 4:
                                y8 it4 = (y8) obj;
                                kotlin.jvm.internal.m.f(it4, "it");
                                m8Var.f(new j7(it4));
                                break;
                            case 5:
                                r8 it5 = (r8) obj;
                                kotlin.jvm.internal.m.f(it5, "it");
                                m8Var.f(new g7(it5));
                                break;
                            case 6:
                                p8 it6 = (p8) obj;
                                kotlin.jvm.internal.m.f(it6, "it");
                                m8Var.f(new q7(it6));
                                break;
                            default:
                                r8 it7 = (r8) obj;
                                kotlin.jvm.internal.m.f(it7, "it");
                                m8Var.f(new r7(it7));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ6);
            }
            fz.c cVar2 = (fz.c) objQ6;
            boolean zH7 = sVar2.h(m8Var);
            Object objQ7 = sVar2.Q();
            if (zH7 || objQ7 == gVar) {
                final int i18 = 3;
                objQ7 = new fz.e() { // from class: mt.v5
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i18) {
                            case 0:
                                WordSentenceCharacterType contentType = (WordSentenceCharacterType) obj;
                                String folderId = (String) obj2;
                                kotlin.jvm.internal.m.f(contentType, "contentType");
                                kotlin.jvm.internal.m.f(folderId, "folderId");
                                m8Var.f(new f7(contentType, folderId));
                                break;
                            case 1:
                                WordSentenceCharacterType contentType2 = (WordSentenceCharacterType) obj;
                                String note = (String) obj2;
                                kotlin.jvm.internal.m.f(contentType2, "contentType");
                                kotlin.jvm.internal.m.f(note, "note");
                                m8Var.f(new n7(contentType2, note));
                                break;
                            case 2:
                                y8 courseReviewUnit = (y8) obj;
                                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                kotlin.jvm.internal.m.f(courseReviewUnit, "courseReviewUnit");
                                m8Var.f(new i7(courseReviewUnit, zBooleanValue));
                                break;
                            default:
                                List selectedContents = (List) obj;
                                List practiceModels = (List) obj2;
                                kotlin.jvm.internal.m.f(selectedContents, "selectedContents");
                                kotlin.jvm.internal.m.f(practiceModels, "practiceModels");
                                m8Var.f(new l7(selectedContents, practiceModels));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ7);
            }
            fz.e eVar2 = (fz.e) objQ7;
            boolean zH8 = sVar2.h(m8Var);
            Object objQ8 = sVar2.Q();
            if (zH8 || objQ8 == gVar) {
                final int i19 = 6;
                objQ8 = new fz.c() { // from class: mt.u5
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i19) {
                            case 0:
                                WordSentenceCharacterType it = (WordSentenceCharacterType) obj;
                                kotlin.jvm.internal.m.f(it, "it");
                                m8Var.f(new k7(it));
                                break;
                            case 1:
                                WordSentenceCharacterType it2 = (WordSentenceCharacterType) obj;
                                kotlin.jvm.internal.m.f(it2, "it");
                                m8Var.f(new s7(it2));
                                break;
                            case 2:
                                String it3 = (String) obj;
                                kotlin.jvm.internal.m.f(it3, "it");
                                m8Var.f(new p7(it3));
                                break;
                            case 3:
                                String name = (String) obj;
                                kotlin.jvm.internal.m.f(name, "name");
                                m8Var.f(new d7(name));
                                break;
                            case 4:
                                y8 it4 = (y8) obj;
                                kotlin.jvm.internal.m.f(it4, "it");
                                m8Var.f(new j7(it4));
                                break;
                            case 5:
                                r8 it5 = (r8) obj;
                                kotlin.jvm.internal.m.f(it5, "it");
                                m8Var.f(new g7(it5));
                                break;
                            case 6:
                                p8 it6 = (p8) obj;
                                kotlin.jvm.internal.m.f(it6, "it");
                                m8Var.f(new q7(it6));
                                break;
                            default:
                                r8 it7 = (r8) obj;
                                kotlin.jvm.internal.m.f(it7, "it");
                                m8Var.f(new r7(it7));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ8);
            }
            fz.c cVar3 = (fz.c) objQ8;
            boolean zH9 = sVar2.h(m8Var);
            Object objQ9 = sVar2.Q();
            if (zH9 || objQ9 == gVar) {
                final int i21 = 7;
                objQ9 = new fz.c() { // from class: mt.u5
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i21) {
                            case 0:
                                WordSentenceCharacterType it = (WordSentenceCharacterType) obj;
                                kotlin.jvm.internal.m.f(it, "it");
                                m8Var.f(new k7(it));
                                break;
                            case 1:
                                WordSentenceCharacterType it2 = (WordSentenceCharacterType) obj;
                                kotlin.jvm.internal.m.f(it2, "it");
                                m8Var.f(new s7(it2));
                                break;
                            case 2:
                                String it3 = (String) obj;
                                kotlin.jvm.internal.m.f(it3, "it");
                                m8Var.f(new p7(it3));
                                break;
                            case 3:
                                String name = (String) obj;
                                kotlin.jvm.internal.m.f(name, "name");
                                m8Var.f(new d7(name));
                                break;
                            case 4:
                                y8 it4 = (y8) obj;
                                kotlin.jvm.internal.m.f(it4, "it");
                                m8Var.f(new j7(it4));
                                break;
                            case 5:
                                r8 it5 = (r8) obj;
                                kotlin.jvm.internal.m.f(it5, "it");
                                m8Var.f(new g7(it5));
                                break;
                            case 6:
                                p8 it6 = (p8) obj;
                                kotlin.jvm.internal.m.f(it6, "it");
                                m8Var.f(new q7(it6));
                                break;
                            default:
                                r8 it7 = (r8) obj;
                                kotlin.jvm.internal.m.f(it7, "it");
                                m8Var.f(new r7(it7));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ9);
            }
            fz.c cVar4 = (fz.c) objQ9;
            boolean zH10 = sVar2.h(m8Var);
            Object objQ10 = sVar2.Q();
            if (zH10 || objQ10 == gVar) {
                final int i22 = 0;
                objQ10 = new fz.a() { // from class: mt.t5
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i22) {
                            case 0:
                                m8Var.f(m7.f50066a);
                                break;
                            case 1:
                                m8Var.f(c7.f49568a);
                                break;
                            case 2:
                                m8Var.f(o7.f50197a);
                                break;
                            default:
                                m8Var.f(e7.f49684a);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ10);
            }
            fz.a aVar3 = (fz.a) objQ10;
            boolean zH11 = sVar2.h(m8Var);
            Object objQ11 = sVar2.Q();
            if (zH11 || objQ11 == gVar) {
                final int i23 = 0;
                objQ11 = new fz.c() { // from class: mt.u5
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i23) {
                            case 0:
                                WordSentenceCharacterType it = (WordSentenceCharacterType) obj;
                                kotlin.jvm.internal.m.f(it, "it");
                                m8Var.f(new k7(it));
                                break;
                            case 1:
                                WordSentenceCharacterType it2 = (WordSentenceCharacterType) obj;
                                kotlin.jvm.internal.m.f(it2, "it");
                                m8Var.f(new s7(it2));
                                break;
                            case 2:
                                String it3 = (String) obj;
                                kotlin.jvm.internal.m.f(it3, "it");
                                m8Var.f(new p7(it3));
                                break;
                            case 3:
                                String name = (String) obj;
                                kotlin.jvm.internal.m.f(name, "name");
                                m8Var.f(new d7(name));
                                break;
                            case 4:
                                y8 it4 = (y8) obj;
                                kotlin.jvm.internal.m.f(it4, "it");
                                m8Var.f(new j7(it4));
                                break;
                            case 5:
                                r8 it5 = (r8) obj;
                                kotlin.jvm.internal.m.f(it5, "it");
                                m8Var.f(new g7(it5));
                                break;
                            case 6:
                                p8 it6 = (p8) obj;
                                kotlin.jvm.internal.m.f(it6, "it");
                                m8Var.f(new q7(it6));
                                break;
                            default:
                                r8 it7 = (r8) obj;
                                kotlin.jvm.internal.m.f(it7, "it");
                                m8Var.f(new r7(it7));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ11);
            }
            fz.c cVar5 = (fz.c) objQ11;
            boolean zH12 = sVar2.h(m8Var);
            Object objQ12 = sVar2.Q();
            if (zH12 || objQ12 == gVar) {
                final int i24 = 1;
                objQ12 = new fz.c() { // from class: mt.u5
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i24) {
                            case 0:
                                WordSentenceCharacterType it = (WordSentenceCharacterType) obj;
                                kotlin.jvm.internal.m.f(it, "it");
                                m8Var.f(new k7(it));
                                break;
                            case 1:
                                WordSentenceCharacterType it2 = (WordSentenceCharacterType) obj;
                                kotlin.jvm.internal.m.f(it2, "it");
                                m8Var.f(new s7(it2));
                                break;
                            case 2:
                                String it3 = (String) obj;
                                kotlin.jvm.internal.m.f(it3, "it");
                                m8Var.f(new p7(it3));
                                break;
                            case 3:
                                String name = (String) obj;
                                kotlin.jvm.internal.m.f(name, "name");
                                m8Var.f(new d7(name));
                                break;
                            case 4:
                                y8 it4 = (y8) obj;
                                kotlin.jvm.internal.m.f(it4, "it");
                                m8Var.f(new j7(it4));
                                break;
                            case 5:
                                r8 it5 = (r8) obj;
                                kotlin.jvm.internal.m.f(it5, "it");
                                m8Var.f(new g7(it5));
                                break;
                            case 6:
                                p8 it6 = (p8) obj;
                                kotlin.jvm.internal.m.f(it6, "it");
                                m8Var.f(new q7(it6));
                                break;
                            default:
                                r8 it7 = (r8) obj;
                                kotlin.jvm.internal.m.f(it7, "it");
                                m8Var.f(new r7(it7));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ12);
            }
            fz.c cVar6 = (fz.c) objQ12;
            boolean zH13 = sVar2.h(m8Var);
            Object objQ13 = sVar2.Q();
            if (zH13 || objQ13 == gVar) {
                final int i25 = 2;
                objQ13 = new fz.c() { // from class: mt.u5
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i25) {
                            case 0:
                                WordSentenceCharacterType it = (WordSentenceCharacterType) obj;
                                kotlin.jvm.internal.m.f(it, "it");
                                m8Var.f(new k7(it));
                                break;
                            case 1:
                                WordSentenceCharacterType it2 = (WordSentenceCharacterType) obj;
                                kotlin.jvm.internal.m.f(it2, "it");
                                m8Var.f(new s7(it2));
                                break;
                            case 2:
                                String it3 = (String) obj;
                                kotlin.jvm.internal.m.f(it3, "it");
                                m8Var.f(new p7(it3));
                                break;
                            case 3:
                                String name = (String) obj;
                                kotlin.jvm.internal.m.f(name, "name");
                                m8Var.f(new d7(name));
                                break;
                            case 4:
                                y8 it4 = (y8) obj;
                                kotlin.jvm.internal.m.f(it4, "it");
                                m8Var.f(new j7(it4));
                                break;
                            case 5:
                                r8 it5 = (r8) obj;
                                kotlin.jvm.internal.m.f(it5, "it");
                                m8Var.f(new g7(it5));
                                break;
                            case 6:
                                p8 it6 = (p8) obj;
                                kotlin.jvm.internal.m.f(it6, "it");
                                m8Var.f(new q7(it6));
                                break;
                            default:
                                r8 it7 = (r8) obj;
                                kotlin.jvm.internal.m.f(it7, "it");
                                m8Var.f(new r7(it7));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ13);
            }
            fz.c cVar7 = (fz.c) objQ13;
            boolean zH14 = sVar2.h(m8Var);
            Object objQ14 = sVar2.Q();
            if (zH14 || objQ14 == gVar) {
                final int i26 = 0;
                objQ14 = new fz.e() { // from class: mt.v5
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i26) {
                            case 0:
                                WordSentenceCharacterType contentType = (WordSentenceCharacterType) obj;
                                String folderId = (String) obj2;
                                kotlin.jvm.internal.m.f(contentType, "contentType");
                                kotlin.jvm.internal.m.f(folderId, "folderId");
                                m8Var.f(new f7(contentType, folderId));
                                break;
                            case 1:
                                WordSentenceCharacterType contentType2 = (WordSentenceCharacterType) obj;
                                String note = (String) obj2;
                                kotlin.jvm.internal.m.f(contentType2, "contentType");
                                kotlin.jvm.internal.m.f(note, "note");
                                m8Var.f(new n7(contentType2, note));
                                break;
                            case 2:
                                y8 courseReviewUnit = (y8) obj;
                                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                kotlin.jvm.internal.m.f(courseReviewUnit, "courseReviewUnit");
                                m8Var.f(new i7(courseReviewUnit, zBooleanValue));
                                break;
                            default:
                                List selectedContents = (List) obj;
                                List practiceModels = (List) obj2;
                                kotlin.jvm.internal.m.f(selectedContents, "selectedContents");
                                kotlin.jvm.internal.m.f(practiceModels, "practiceModels");
                                m8Var.f(new l7(selectedContents, practiceModels));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ14);
            }
            fz.e eVar3 = (fz.e) objQ14;
            boolean zH15 = sVar2.h(m8Var);
            Object objQ15 = sVar2.Q();
            if (zH15 || objQ15 == gVar) {
                final int i27 = 3;
                objQ15 = new fz.c() { // from class: mt.u5
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i27) {
                            case 0:
                                WordSentenceCharacterType it = (WordSentenceCharacterType) obj;
                                kotlin.jvm.internal.m.f(it, "it");
                                m8Var.f(new k7(it));
                                break;
                            case 1:
                                WordSentenceCharacterType it2 = (WordSentenceCharacterType) obj;
                                kotlin.jvm.internal.m.f(it2, "it");
                                m8Var.f(new s7(it2));
                                break;
                            case 2:
                                String it3 = (String) obj;
                                kotlin.jvm.internal.m.f(it3, "it");
                                m8Var.f(new p7(it3));
                                break;
                            case 3:
                                String name = (String) obj;
                                kotlin.jvm.internal.m.f(name, "name");
                                m8Var.f(new d7(name));
                                break;
                            case 4:
                                y8 it4 = (y8) obj;
                                kotlin.jvm.internal.m.f(it4, "it");
                                m8Var.f(new j7(it4));
                                break;
                            case 5:
                                r8 it5 = (r8) obj;
                                kotlin.jvm.internal.m.f(it5, "it");
                                m8Var.f(new g7(it5));
                                break;
                            case 6:
                                p8 it6 = (p8) obj;
                                kotlin.jvm.internal.m.f(it6, "it");
                                m8Var.f(new q7(it6));
                                break;
                            default:
                                r8 it7 = (r8) obj;
                                kotlin.jvm.internal.m.f(it7, "it");
                                m8Var.f(new r7(it7));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ15);
            }
            fz.c cVar8 = (fz.c) objQ15;
            boolean zH16 = sVar2.h(m8Var);
            Object objQ16 = sVar2.Q();
            if (zH16 || objQ16 == gVar) {
                final int i28 = 1;
                objQ16 = new fz.a() { // from class: mt.t5
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i28) {
                            case 0:
                                m8Var.f(m7.f50066a);
                                break;
                            case 1:
                                m8Var.f(c7.f49568a);
                                break;
                            case 2:
                                m8Var.f(o7.f50197a);
                                break;
                            default:
                                m8Var.f(e7.f49684a);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ16);
            }
            fz.a aVar4 = (fz.a) objQ16;
            boolean zH17 = sVar2.h(m8Var);
            Object objQ17 = sVar2.Q();
            if (zH17 || objQ17 == gVar) {
                final int i29 = 1;
                objQ17 = new fz.e() { // from class: mt.v5
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i29) {
                            case 0:
                                WordSentenceCharacterType contentType = (WordSentenceCharacterType) obj;
                                String folderId = (String) obj2;
                                kotlin.jvm.internal.m.f(contentType, "contentType");
                                kotlin.jvm.internal.m.f(folderId, "folderId");
                                m8Var.f(new f7(contentType, folderId));
                                break;
                            case 1:
                                WordSentenceCharacterType contentType2 = (WordSentenceCharacterType) obj;
                                String note = (String) obj2;
                                kotlin.jvm.internal.m.f(contentType2, "contentType");
                                kotlin.jvm.internal.m.f(note, "note");
                                m8Var.f(new n7(contentType2, note));
                                break;
                            case 2:
                                y8 courseReviewUnit = (y8) obj;
                                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                kotlin.jvm.internal.m.f(courseReviewUnit, "courseReviewUnit");
                                m8Var.f(new i7(courseReviewUnit, zBooleanValue));
                                break;
                            default:
                                List selectedContents = (List) obj;
                                List practiceModels = (List) obj2;
                                kotlin.jvm.internal.m.f(selectedContents, "selectedContents");
                                kotlin.jvm.internal.m.f(practiceModels, "practiceModels");
                                m8Var.f(new l7(selectedContents, practiceModels));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(objQ17);
            }
            fz.e eVar4 = (fz.e) objQ17;
            boolean z13 = (i12 & 458752) == 131072;
            Object objQ18 = sVar2.Q();
            if (z13 || objQ18 == gVar) {
                objQ18 = new dt.e1(4, onPracticeClick);
                sVar2.o0(objQ18);
            }
            sVar = sVar2;
            f(g8Var, reviewType, false, eVar, fVar, cVar, aVar, aVar2, cVar2, eVar2, cVar3, cVar4, aVar3, cVar5, cVar6, cVar7, eVar3, cVar8, aVar4, eVar4, onBackClick, (fz.e) objQ18, goBilling, sVar, (i12 << 3) & 112, 0, (i12 >> 12) & 910);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.r1(reviewType, z11, z12, m8Var, onBackClick, onPracticeClick, goBilling, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:219:0x03a0  */
    public static final void f(final g8 uiState, final x8 reviewType, boolean z11, final fz.e onCourseReviewUnitCheckedChange, final fz.f onCourseReviewCheckedChange, final fz.c onHeaderClick, final fz.a onSelectAll, final fz.a onDeselectAll, final fz.c onChangePracticeModel, fz.e onOpenPracticeModeChooser, final fz.c onSelectPracticeModeChooserFilter, final fz.c onSelectPracticeModeChooserModel, final fz.a onRefreshPracticeModeChooser, final fz.c onPlayAudio, final fz.c onToggleFavorite, final fz.c onSelectBookmarkFolderView, final fz.e onMoveFavoriteToBookmarkFolder, final fz.c onCreateBookmarkFolder, final fz.a onClearBookmarkFolderOperationResult, final fz.e onSaveNote, final fz.a onBackClick, final fz.e onPracticeClick, final fz.a goBilling, l1.n nVar, final int i11, final int i12, final int i13) {
        final fz.e eVar;
        l1.s sVar;
        final boolean z12;
        nz.i iVarR;
        boolean z13;
        nz.j jVarT;
        boolean z14;
        boolean z15;
        rt.p pVar;
        l1.b1 b1Var;
        l1.b1 b1Var2;
        g8 g8Var;
        l1.s sVar2;
        l1.g gVar;
        l1.b1 b1Var3;
        boolean z16;
        f8 f8Var;
        x8 x8Var;
        char c11;
        l1.b1 b1Var4;
        l1.b1 b1Var5;
        f8 f8Var2;
        z1.o oVar;
        boolean z17;
        l1.g gVar2;
        int i14;
        l1.b1 b1Var6;
        z1.r rVar;
        boolean z18;
        l1.s sVar3;
        l1.b1 b1Var7;
        l1.b1 b1Var8;
        boolean z19;
        uiState = uiState;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        kotlin.jvm.internal.m.f(reviewType, "reviewType");
        kotlin.jvm.internal.m.f(onCourseReviewUnitCheckedChange, "onCourseReviewUnitCheckedChange");
        kotlin.jvm.internal.m.f(onCourseReviewCheckedChange, "onCourseReviewCheckedChange");
        kotlin.jvm.internal.m.f(onHeaderClick, "onHeaderClick");
        kotlin.jvm.internal.m.f(onSelectAll, "onSelectAll");
        kotlin.jvm.internal.m.f(onDeselectAll, "onDeselectAll");
        kotlin.jvm.internal.m.f(onChangePracticeModel, "onChangePracticeModel");
        kotlin.jvm.internal.m.f(onOpenPracticeModeChooser, "onOpenPracticeModeChooser");
        kotlin.jvm.internal.m.f(onSelectPracticeModeChooserFilter, "onSelectPracticeModeChooserFilter");
        kotlin.jvm.internal.m.f(onSelectPracticeModeChooserModel, "onSelectPracticeModeChooserModel");
        kotlin.jvm.internal.m.f(onRefreshPracticeModeChooser, "onRefreshPracticeModeChooser");
        kotlin.jvm.internal.m.f(onPlayAudio, "onPlayAudio");
        kotlin.jvm.internal.m.f(onToggleFavorite, "onToggleFavorite");
        kotlin.jvm.internal.m.f(onSelectBookmarkFolderView, "onSelectBookmarkFolderView");
        kotlin.jvm.internal.m.f(onMoveFavoriteToBookmarkFolder, "onMoveFavoriteToBookmarkFolder");
        kotlin.jvm.internal.m.f(onCreateBookmarkFolder, "onCreateBookmarkFolder");
        kotlin.jvm.internal.m.f(onClearBookmarkFolderOperationResult, "onClearBookmarkFolderOperationResult");
        kotlin.jvm.internal.m.f(onSaveNote, "onSaveNote");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onPracticeClick, "onPracticeClick");
        kotlin.jvm.internal.m.f(goBilling, "goBilling");
        l1.s sVar4 = (l1.s) nVar;
        sVar4.f0(-1465725801);
        int i15 = (i11 & 6) == 0 ? i11 | ((i11 & 8) == 0 ? sVar4.f(uiState) : sVar4.h(uiState) ? 4 : 2) : i11;
        if ((i11 & 48) == 0) {
            i15 |= sVar4.d(reviewType.ordinal()) ? 32 : 16;
        }
        int i16 = i15 | 384;
        int i17 = (i11 & 3072) == 0 ? i16 | (sVar4.h(onCourseReviewUnitCheckedChange) ? 2048 : 1024) : i16;
        int i18 = i11 & 24576;
        int i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
        int i21 = i18 == 0 ? i17 | (sVar4.h(onCourseReviewCheckedChange) ? 16384 : 8192) : i17;
        if ((i11 & 196608) == 0) {
            i21 |= sVar4.h(onHeaderClick) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i21 |= sVar4.h(onSelectAll) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i21 |= sVar4.h(onDeselectAll) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i21 |= sVar4.h(onChangePracticeModel) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i21 |= sVar4.h(onOpenPracticeModeChooser) ? 536870912 : 268435456;
        }
        int i22 = i21;
        int i23 = (i12 & 6) == 0 ? i12 | (sVar4.h(onSelectPracticeModeChooserFilter) ? 4 : 2) : i12;
        if ((i12 & 48) == 0) {
            i23 |= sVar4.h(onSelectPracticeModeChooserModel) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i23 |= sVar4.h(onRefreshPracticeModeChooser) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i23 |= sVar4.h(onPlayAudio) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            if (sVar4.h(onToggleFavorite)) {
                i19 = 16384;
            }
            i23 |= i19;
        }
        if ((i12 & 1572864) == 0) {
            i23 |= sVar4.h(onMoveFavoriteToBookmarkFolder) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i23 |= sVar4.h(onCreateBookmarkFolder) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i23 |= sVar4.h(onClearBookmarkFolderOperationResult) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i23 |= sVar4.h(onSaveNote) ? 536870912 : 268435456;
        }
        int i24 = i23;
        int i25 = (i13 & 6) == 0 ? i13 | (sVar4.h(onBackClick) ? 4 : 2) : i13;
        if ((i13 & 48) == 0) {
            i25 |= sVar4.h(onPracticeClick) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i25 |= sVar4.h(goBilling) ? 256 : 128;
        }
        int i26 = i25;
        if (sVar4.T(i22 & 1, ((i22 & 306783379) == 306783378 && (i24 & 306717843) == 306717842 && (i26 & 147) == 146) ? false : true)) {
            Object objQ = sVar4.Q();
            l1.g gVar3 = l1.m.f39353a;
            if (objQ == gVar3) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ);
            }
            l1.b1 b1Var9 = (l1.b1) objQ;
            Object objQ2 = sVar4.Q();
            vy.d dVar = null;
            if (objQ2 == gVar3) {
                objQ2 = l1.t.B(null);
                sVar4.o0(objQ2);
            }
            l1.b1 b1Var10 = (l1.b1) objQ2;
            Object objQ3 = sVar4.Q();
            if (objQ3 == gVar3) {
                objQ3 = l1.t.B(null);
                sVar4.o0(objQ3);
            }
            l1.b1 b1Var11 = (l1.b1) objQ3;
            Object objQ4 = sVar4.Q();
            if (objQ4 == gVar3) {
                objQ4 = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ4);
            }
            l1.b1 b1Var12 = (l1.b1) objQ4;
            Object objQ5 = sVar4.Q();
            if (objQ5 == gVar3) {
                objQ5 = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ5);
            }
            l1.b1 b1Var13 = (l1.b1) objQ5;
            Object objQ6 = sVar4.Q();
            if (objQ6 == gVar3) {
                objQ6 = l1.t.B(null);
                sVar4.o0(objQ6);
            }
            l1.b1 b1Var14 = (l1.b1) objQ6;
            boolean z20 = uiState instanceof f8;
            f8 f8Var3 = z20 ? (f8) uiState : null;
            nz.o oVarG0 = f8Var3 != null ? ry.m.g0(f8Var3.f49746e) : null;
            if (oVarG0 == null) {
                sVar4.d0(1497158451);
                sVar4.p(false);
                z13 = false;
                iVarR = null;
            } else {
                sVar4.d0(186842766);
                Object objQ7 = sVar4.Q();
                if (objQ7 == gVar3) {
                    objQ7 = new lt.d(28);
                    sVar4.o0(objQ7);
                }
                iVarR = nz.n.R(oVarG0, (fz.c) objQ7);
                z13 = false;
                sVar4.p(false);
            }
            if (iVarR == null) {
                sVar4.d0(1497192768);
                sVar4.p(z13);
                jVarT = null;
            } else {
                sVar4.d0(186843873);
                Object objQ8 = sVar4.Q();
                if (objQ8 == gVar3) {
                    objQ8 = new lt.d(29);
                    sVar4.o0(objQ8);
                }
                jVarT = nz.n.T(iVarR, (fz.c) objQ8);
                sVar4.p(false);
            }
            List listZ = jVarT != null ? nz.n.Z(jVarT) : null;
            if (listZ == null) {
                listZ = ry.r.f50854a;
            }
            List list = listZ;
            boolean zIsEmpty = list.isEmpty();
            final boolean z21 = !zIsEmpty;
            if (zIsEmpty) {
                z14 = false;
            } else {
                if (list.isEmpty()) {
                    z19 = true;
                    break;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((rt.k6) it.next()).f49970a) {
                            z19 = false;
                            break;
                        }
                    } else {
                        z19 = true;
                        break;
                    }
                }
                if (z19) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            String str = f8Var3 != null ? f8Var3.f49750i : null;
            final boolean z22 = z14;
            Object objQ9 = sVar4.Q();
            if (objQ9 == gVar3) {
                objQ9 = l1.t.B(ry.r.f50854a);
                sVar4.o0(objQ9);
            }
            l1.b1 b1Var15 = (l1.b1) objQ9;
            List list2 = f8Var3 != null ? f8Var3.f49749h : null;
            boolean zH = sVar4.h(f8Var3);
            String str2 = str;
            Object objQ10 = sVar4.Q();
            if (zH || objQ10 == gVar3) {
                objQ10 = new iv.h0(23, f8Var3, b1Var15, dVar);
                sVar4.o0(objQ10);
            }
            l1.t.f((fz.e) objQ10, list2, sVar4);
            z1.o oVar2 = z1.o.f58481a;
            z1.r rVarD = j0.e2.d(oVar2, 1.0f);
            z1.j jVar = z1.c.f58463a;
            w2.q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode = Long.hashCode(sVar4.T);
            l1.q1 q1VarL = sVar4.l();
            z1.r rVarC = z1.a.c(sVar4, rVarD);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar4.h0();
            if (sVar4.S) {
                sVar4.k(iVar);
            } else {
                sVar4.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD, sVar4);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar4);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar4, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar4);
            z1.r rVarD2 = j0.e2.d(oVar2, 1.0f);
            j0.d dVar2 = j0.i.f35305c;
            z1.h hVar5 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar2, hVar5, sVar4, 0);
            int iHashCode2 = Long.hashCode(sVar4.T);
            l1.q1 q1VarL2 = sVar4.l();
            z1.r rVarC2 = z1.a.c(sVar4, rVarD2);
            sVar4.h0();
            if (sVar4.S) {
                sVar4.k(iVar);
            } else {
                sVar4.r0();
            }
            l1.t.J(hVar, uVarA, sVar4);
            l1.t.J(hVar2, q1VarL2, sVar4);
            if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar4);
            uiState = uiState;
            l1.b1 b1Var16 = b1Var14;
            iu.k.g(onBackClick, null, t1.e.d(1150264422, new k9.p(15, reviewType, f8Var3), sVar4), null, t1.e.d(112562044, new fz.f() { // from class: mt.x5
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    j0.b2 AppTopAppBar = (j0.b2) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(AppTopAppBar, "$this$AppTopAppBar");
                    l1.s sVar5 = (l1.s) nVar2;
                    if (sVar5.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        g8 g8Var2 = uiState;
                        if (!(g8Var2 instanceof f8) || ((f8) g8Var2).f49752k) {
                            sVar5.d0(-1045475642);
                        } else {
                            sVar5.d0(-1033493894);
                            boolean z23 = z22;
                            boolean zG = sVar5.g(z23);
                            fz.a aVar = onDeselectAll;
                            boolean zF = zG | sVar5.f(aVar);
                            fz.a aVar2 = onSelectAll;
                            boolean zF2 = zF | sVar5.f(aVar2);
                            Object objQ11 = sVar5.Q();
                            if (zF2 || objQ11 == l1.m.f39353a) {
                                objQ11 = new gr.w(z23, aVar, aVar2, 3);
                                sVar5.o0(objQ11);
                            }
                            h1.k7.m((fz.a) objQ11, null, z21, null, null, null, t1.e.d(2142574292, new dt.h(z23, 3), sVar5), sVar5, 805306368, 506);
                        }
                        sVar5.p(false);
                    } else {
                        sVar5.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar4), null, null, null, sVar4, (i26 & 14) | 24960, 234);
            h1.k7.g(null, 1, g2.x.f28621h, sVar4, 432, 1);
            if (uiState.equals(e8.f49685a)) {
                sVar4.d0(1271756458);
                tv.a.d(0, 1, sVar4, null);
                sVar4.p(false);
                sVar = sVar4;
                gVar2 = gVar3;
                eVar = onOpenPracticeModeChooser;
                b1Var5 = b1Var13;
                b1Var4 = b1Var11;
                b1Var8 = b1Var12;
                b1Var2 = b1Var10;
                z18 = true;
                rVar = null;
            } else {
                if (!z20) {
                    sVar4.d0(1271766489);
                    sVar4.s();
                    throw new NoWhenBranchMatchedException();
                }
                sVar4.d0(770187681);
                f8 f8Var4 = (f8) uiState;
                List<rt.l0> list3 = f8Var4.f49749h;
                if (list3.isEmpty()) {
                    list3 = (List) b1Var15.getValue();
                }
                Object objQ11 = sVar4.Q();
                if (objQ11 == gVar3) {
                    objQ11 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ11);
                }
                l1.b1 b1Var17 = (l1.b1) objQ11;
                rt.k6 k6Var = (rt.k6) b1Var16.getValue();
                if (k6Var == null) {
                    sVar4.d0(770348725);
                    sVar4.p(false);
                    b1Var10 = b1Var10;
                } else {
                    sVar4.d0(770348726);
                    WordSentenceCharacterType wordSentenceCharacterType = k6Var.f49973d;
                    String str3 = k6Var.f49975f;
                    Object objQ12 = sVar4.Q();
                    if (objQ12 == gVar3) {
                        b1Var16 = b1Var16;
                        objQ12 = new n4(11, b1Var16);
                        sVar4.o0(objQ12);
                    } else {
                        b1Var16 = b1Var16;
                    }
                    fz.a aVar = (fz.a) objQ12;
                    int i27 = i24 & 1879048192;
                    boolean zH2 = (i27 == 536870912) | sVar4.h(k6Var);
                    Object objQ13 = sVar4.Q();
                    if (zH2 || objQ13 == gVar3) {
                        objQ13 = new j9.h(27, onSaveNote, k6Var);
                        sVar4.o0(objQ13);
                    }
                    fz.c cVar = (fz.c) objQ13;
                    boolean zH3 = (i27 == 536870912) | sVar4.h(k6Var);
                    Object objQ14 = sVar4.Q();
                    if (zH3 || objQ14 == gVar3) {
                        objQ14 = new l1.z1(13, onSaveNote, k6Var);
                        sVar4.o0(objQ14);
                    }
                    kt.l.c(wordSentenceCharacterType, str3, aVar, cVar, null, 0, (fz.a) objQ14, sVar4, 384, 48);
                    sVar4.p(false);
                }
                if (((Boolean) b1Var17.getValue()).booleanValue()) {
                    sVar4.d0(771042165);
                    Object objQ15 = sVar4.Q();
                    if (objQ15 == gVar3) {
                        objQ15 = new n4(12, b1Var17);
                        sVar4.o0(objQ15);
                    }
                    h1.a6.a((fz.a) objQ15, null, h1.a6.f(6, 2, null, sVar4), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-368629086, new fu.f0(3, goBilling, b1Var17), sVar4), sVar4, 6, 384, 4090);
                    z15 = false;
                } else {
                    z15 = false;
                    sVar4.d0(756812359);
                }
                sVar4.p(z15);
                Boolean boolValueOf = Boolean.valueOf(f8Var4.f49742a);
                Boolean bool = (Boolean) b1Var17.getValue();
                bool.getClass();
                int i28 = i22 & 14;
                boolean z23 = i28 == 4 || ((i22 & 8) != 0 && sVar4.h(uiState));
                Object objQ16 = sVar4.Q();
                if (z23 || objQ16 == gVar3) {
                    objQ16 = new iv.h0(24, uiState, b1Var17, null);
                    sVar4.o0(objQ16);
                }
                l1.t.g(boolValueOf, bool, (fz.e) objQ16, sVar4);
                if (((Boolean) b1Var12.getValue()).booleanValue()) {
                    sVar4.d0(771949039);
                    WordSentenceCharacterType wordSentenceCharacterType2 = (WordSentenceCharacterType) b1Var11.getValue();
                    Object objQ17 = sVar4.Q();
                    if (objQ17 == gVar3) {
                        objQ17 = new fu.y(b1Var12, b1Var11, null, 5);
                        sVar4.o0(objQ17);
                    }
                    l1.t.f((fz.e) objQ17, wordSentenceCharacterType2, sVar4);
                    sVar4.p(false);
                } else {
                    sVar4.d0(756812359);
                    sVar4.p(false);
                }
                WordSentenceCharacterType wordSentenceCharacterType3 = (WordSentenceCharacterType) b1Var10.getValue();
                ArrayList arrayList = new ArrayList(ry.n.W(list3, 10));
                for (rt.l0 l0Var : list3) {
                    arrayList.add(new rt.r(l0Var.f50004c, l0Var.f50002a, l0Var.f50003b, l0Var.f50006e));
                    list3 = list3;
                }
                List list4 = list3;
                rt.k0 k0Var = f8Var4.f49753l;
                if (kotlin.jvm.internal.m.a(k0Var, rt.i0.f49858a)) {
                    pVar = rt.n.f50107a;
                } else if (kotlin.jvm.internal.m.a(k0Var, rt.j0.f49902a)) {
                    pVar = rt.o.f50161a;
                } else if (kotlin.jvm.internal.m.a(k0Var, rt.g0.f49771a)) {
                    pVar = rt.l.f50001a;
                } else if (kotlin.jvm.internal.m.a(k0Var, rt.h0.f49807a)) {
                    pVar = rt.m.f50041a;
                } else {
                    if (!kotlin.jvm.internal.m.a(k0Var, rt.f0.f49708a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pVar = rt.k.f49954a;
                }
                rt.p pVar2 = pVar;
                boolean zBooleanValue = ((Boolean) b1Var13.getValue()).booleanValue();
                String strJ = j(reviewType, sVar4);
                boolean z24 = (i24 & 29360128) == 8388608;
                Object objQ18 = sVar4.Q();
                if (z24 || objQ18 == gVar3) {
                    objQ18 = new bt.e6(onCreateBookmarkFolder, 10);
                    sVar4.o0(objQ18);
                }
                fz.e eVar2 = (fz.e) objQ18;
                Object objQ19 = sVar4.Q();
                if (objQ19 == gVar3) {
                    b1Var = b1Var13;
                    b1Var2 = b1Var10;
                    objQ19 = new ch.h0(b1Var2, b1Var, 9);
                    sVar4.o0(objQ19);
                } else {
                    b1Var = b1Var13;
                    b1Var2 = b1Var10;
                }
                fz.a aVar2 = (fz.a) objQ19;
                Object objQ20 = sVar4.Q();
                if (objQ20 == gVar3) {
                    objQ20 = new bp.i2(b1Var11, b1Var12, 16);
                    sVar4.o0(objQ20);
                }
                g.i(wordSentenceCharacterType3, arrayList, pVar2, zBooleanValue, strJ, eVar2, onMoveFavoriteToBookmarkFolder, aVar2, (fz.c) objQ20, onClearBookmarkFolderOperationResult, sVar4, (i24 & 3670016) | 113246208 | ((i24 << 3) & 1879048192), 0);
                if (((Boolean) b1Var9.getValue()).booleanValue()) {
                    sVar4.d0(773420578);
                    Object objQ21 = sVar4.Q();
                    if (objQ21 == gVar3) {
                        b1Var3 = b1Var9;
                        objQ21 = new n4(9, b1Var3);
                        sVar4.o0(objQ21);
                    } else {
                        b1Var3 = b1Var9;
                    }
                    g8Var = uiState;
                    f8Var = f8Var4;
                    c11 = 2631;
                    x8Var = reviewType;
                    gVar = gVar3;
                    h1.a6.a((fz.a) objQ21, null, h1.a6.f(6, 2, null, sVar4), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-374215126, new h2(g8Var, reviewType, onSelectPracticeModeChooserFilter, onSelectPracticeModeChooserModel, onRefreshPracticeModeChooser, onChangePracticeModel, onPracticeClick, b1Var3), sVar4), sVar4, 6, 384, 4090);
                    sVar2 = sVar4;
                    z16 = false;
                } else {
                    g8Var = uiState;
                    sVar2 = sVar4;
                    gVar = gVar3;
                    b1Var3 = b1Var9;
                    z16 = false;
                    f8Var = f8Var4;
                    x8Var = reviewType;
                    c11 = 2631;
                    sVar2.d0(756812359);
                }
                sVar2.p(z16);
                z1.r rVarA = j0.v.a(oVar2, 1.0f);
                w2.q0 q0VarD2 = j0.o.d(jVar, z16);
                int iHashCode3 = Long.hashCode(sVar2.T);
                l1.q1 q1VarL3 = sVar2.l();
                z1.r rVarC3 = z1.a.c(sVar2, rVarA);
                y2.i iVar2 = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.E()) {
                    sVar2.k(iVar2);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.c(), q0VarD2, sVar2);
                l1.t.J(y2.j.e(), q1VarL3, sVar2);
                y2.h hVarB = y2.j.b();
                if (sVar2.E() || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVarB);
                }
                l1.t.J(y2.j.d(), rVarC3, sVar2);
                if (f8Var.f49746e.isEmpty()) {
                    b1Var4 = b1Var11;
                    b1Var5 = b1Var;
                    l1.b1 b1Var18 = b1Var3;
                    l1.g gVar4 = gVar;
                    f8Var2 = f8Var;
                    oVar = oVar2;
                    l1.s sVar5 = sVar2;
                    sVar5.d0(-1357522834);
                    z1.r rVarD3 = j0.e2.d(oVar, 1.0f);
                    w2.q0 q0VarD3 = j0.o.d(z1.c.f58467e, false);
                    int iHashCode4 = Long.hashCode(l1.t.w(sVar5));
                    l1.q1 q1VarA = sVar5.A();
                    z1.r rVarC4 = z1.a.c(sVar5, rVarD3);
                    y2.i iVarA = y2.j.a();
                    sVar5.h0();
                    if (sVar5.E()) {
                        sVar5.k(iVarA);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(y2.j.c(), q0VarD3, sVar5);
                    l1.t.J(y2.j.e(), q1VarA, sVar5);
                    y2.h hVarB2 = y2.j.b();
                    if (sVar5.E() || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVarB2);
                    }
                    l1.t.J(y2.j.d(), rVarC4, sVar5);
                    z17 = false;
                    k2.b bVarY = se.k.y(R.drawable.lb_weekly_xp_empty, sVar5, 0);
                    gVar2 = gVar4;
                    i14 = i28;
                    b1Var6 = b1Var18;
                    d0.n.c(bVarY, null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 48, 124);
                    sVar = sVar5;
                    sVar.r();
                    sVar.s();
                } else {
                    sVar2.d0(-1361121500);
                    j0.u uVarA2 = j0.t.a(dVar2, hVar5, sVar2, 0);
                    int iHashCode5 = Long.hashCode(l1.t.w(sVar2));
                    l1.q1 q1VarA2 = sVar2.A();
                    z1.r rVarC5 = z1.a.c(sVar2, oVar);
                    y2.i iVarA2 = y2.j.a();
                    sVar2.h0();
                    if (sVar2.E()) {
                        oVar = oVar2;
                        sVar2.k(iVarA2);
                    } else {
                        oVar = oVar2;
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.c(), uVarA2, sVar2);
                    l1.t.J(y2.j.e(), q1VarA2, sVar2);
                    y2.h hVarB3 = y2.j.b();
                    if (sVar2.E() || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar2, iHashCode5, hVarB3);
                    }
                    l1.t.J(y2.j.d(), rVarC5, sVar2);
                    if (f8Var.f49752k) {
                        sVar3 = sVar2;
                        sVar3.d0(-1565595329);
                    } else {
                        sVar2.d0(-1989570145);
                        if (str2 == null) {
                            sVar2.d0(-1547070939);
                            sVar2.s();
                            sVar3 = sVar2;
                        } else {
                            sVar2.d0(-1547070938);
                            l1.s sVar6 = sVar2;
                            ua.b(ub.a.d0(R.string.bookmark_folder_current_view, new Object[]{str2, Integer.valueOf(list.size()), j(x8Var, sVar2)}, sVar2), j0.c.B(oVar, 20, 8), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31036s, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar6, 48, 0, 131064);
                            sVar3 = sVar6;
                            sVar3.s();
                        }
                    }
                    sVar3.s();
                    List list5 = f8Var.f49746e;
                    boolean z25 = f8Var.f49752k;
                    boolean z26 = !z25;
                    z1.r rVarA2 = j0.v.a(oVar, 1.0f);
                    boolean zH4 = ((i24 & 57344) == 16384) | sVar3.h(list4) | (i28 == 4 || ((i22 & 8) != 0 && sVar3.h(g8Var)));
                    Object objQ22 = sVar3.Q();
                    if (zH4 || objQ22 == gVar) {
                        l1.b1 b1Var19 = b1Var;
                        b1Var7 = b1Var3;
                        dl.d dVar3 = new dl.d(list4, g8Var, onToggleFavorite, b1Var2, b1Var19, b1Var11, b1Var12, 7);
                        b1Var4 = b1Var11;
                        f8Var2 = f8Var;
                        b1Var5 = b1Var19;
                        sVar3.o0(dVar3);
                        objQ22 = dVar3;
                    } else {
                        b1Var4 = b1Var11;
                        b1Var5 = b1Var;
                        b1Var7 = b1Var3;
                        f8Var2 = f8Var;
                    }
                    fz.c cVar2 = (fz.c) objQ22;
                    Object objQ23 = sVar3.Q();
                    if (objQ23 == gVar) {
                        objQ23 = new p(15, b1Var16);
                        sVar3.o0(objQ23);
                    }
                    fz.c cVar3 = (fz.c) objQ23;
                    Object objQ24 = sVar3.Q();
                    if (objQ24 == gVar) {
                        objQ24 = new n4(10, b1Var17);
                        sVar3.o0(objQ24);
                    }
                    l1.s sVar7 = sVar3;
                    d(list5, rVarA2, false, z25, onCourseReviewUnitCheckedChange, onCourseReviewCheckedChange, onHeaderClick, onPlayAudio, cVar2, z26, cVar3, (fz.a) objQ24, sVar7, ((i22 << 3) & 4186112) | ((i24 << 12) & 29360128));
                    sVar7.r();
                    sVar7.s();
                    sVar = sVar7;
                    gVar2 = gVar;
                    i14 = i28;
                    b1Var6 = b1Var7;
                    z17 = false;
                }
                float f5 = 32;
                z1.r rVarG = j0.e2.g(j0.e2.e(j0.r.f35391a.a(oVar, z1.c.H), 1.0f), f5);
                l1.c3 c3Var = h1.v1.f31180a;
                rVar = null;
                j0.c.g(sVar, d0.n.g(rVarG, fr.p3.A(ns.o.L(g2.x.a(g2.x.c(((h1.s1) sVar.j(c3Var)).a(), CropImageView.DEFAULT_ASPECT_RATIO)), g2.x.a(((h1.s1) sVar.j(c3Var)).a()))), null, 6));
                sVar.r();
                f8 f8Var5 = f8Var2;
                if (f8Var5.f49752k) {
                    eVar = onOpenPracticeModeChooser;
                    z18 = true;
                    sVar.d0(756812359);
                } else {
                    sVar.d0(780196899);
                    z1.r rVarE = j0.e2.e(j0.c.C(j0.c.E(j0.c.v(oVar), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, 7), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
                    int iHashCode6 = Long.hashCode(l1.t.w(sVar));
                    l1.q1 q1VarA3 = sVar.A();
                    z1.r rVarC6 = z1.a.c(sVar, rVarE);
                    y2.i iVarA3 = y2.j.a();
                    sVar.h0();
                    if (sVar.E()) {
                        sVar.k(iVarA3);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.c(), a2VarA, sVar);
                    l1.t.J(y2.j.e(), q1VarA3, sVar);
                    y2.h hVarB4 = y2.j.b();
                    if (sVar.E() || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode6))) {
                        defpackage.e.A(iHashCode6, sVar, iHashCode6, hVarB4);
                    }
                    l1.t.J(y2.j.d(), rVarC6, sVar);
                    boolean z27 = !f8Var5.f49745d.isEmpty();
                    if (!(((double) 1.0f) > 0.0d ? true : z17)) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    z18 = true;
                    j0.i1 i1Var = new j0.i1(1.0f, true);
                    boolean z28 = ((i14 == 4 || ((i22 & 8) != 0 && sVar.h(uiState))) ? true : z17) | ((i22 & 1879048192) == 536870912 ? true : z17);
                    Object objQ25 = sVar.Q();
                    if (z28 || objQ25 == gVar2) {
                        eVar = onOpenPracticeModeChooser;
                        objQ25 = new l0(uiState, eVar, b1Var6, 7);
                        sVar.o0(objQ25);
                    } else {
                        eVar = onOpenPracticeModeChooser;
                    }
                    l1.s sVar8 = sVar;
                    iu.k.e((fz.a) objQ25, i1Var, z27, 0L, null, t1.e.d(-1433604297, new a00.b(uiState, 27), sVar), sVar8, 196608, 24);
                    sVar = sVar8;
                    sVar.r();
                }
                sVar.s();
                sVar.s();
            }
            sVar.r();
            if (((Boolean) b1Var8.getValue()).booleanValue()) {
                sVar.d0(2093795341);
                Object objQ26 = sVar.Q();
                if (objQ26 == gVar2) {
                    objQ26 = new i3(3, b1Var4, b1Var8, b1Var2, b1Var5);
                    sVar.o0(objQ26);
                }
                g.a(54, (fz.a) objQ26, sVar, rVar);
            } else {
                sVar.d0(2068747217);
            }
            sVar.s();
            sVar.r();
            z12 = z18;
        } else {
            eVar = onOpenPracticeModeChooser;
            sVar = sVar4;
            sVar.W();
            z12 = z11;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f(new fz.e() { // from class: mt.w5
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i11 | 1);
                    int iM2 = l1.t.M(i12);
                    int iM3 = l1.t.M(i13);
                    f6.f(uiState, reviewType, z12, onCourseReviewUnitCheckedChange, onCourseReviewCheckedChange, onHeaderClick, onSelectAll, onDeselectAll, onChangePracticeModel, eVar, onSelectPracticeModeChooserFilter, onSelectPracticeModeChooserModel, onRefreshPracticeModeChooser, onPlayAudio, onToggleFavorite, onSelectBookmarkFolderView, onMoveFavoriteToBookmarkFolder, onCreateBookmarkFolder, onClearBookmarkFolderOperationResult, onSaveNote, onBackClick, onPracticeClick, goBilling, (l1.n) obj, iM, iM2, iM3);
                    return qy.b0.f48488a;
                }
            });
        }
    }

    public static final void g(boolean z11, y8 y8Var, boolean z12, fz.e onCourseReviewUnitCheckedChange, fz.a onHeaderClick, l1.n nVar, int i11, int i12) {
        boolean z13;
        int i13;
        boolean z14;
        kotlin.jvm.internal.m.f(onCourseReviewUnitCheckedChange, "onCourseReviewUnitCheckedChange");
        kotlin.jvm.internal.m.f(onHeaderClick, "onHeaderClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1192655935);
        int i14 = (sVar.h(y8Var) ? 32 : 16) | i11;
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 = i14 | 384;
            z13 = z12;
        } else {
            z13 = z12;
            i13 = i14 | (sVar.g(z13) ? 256 : 128);
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar.h(onCourseReviewUnitCheckedChange) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= sVar.h(onHeaderClick) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar.T(i13 & 1, (i13 & 9361) != 9360)) {
            boolean z15 = i15 == 0 ? z13 : true;
            float f5 = 6;
            z1.r rVarB = j0.c.B(z1.o.f58481a, 16, f5);
            r0.e eVarD = r0.f.d(f5);
            z14 = z15;
            h1.k7.d(rVarB, eVarD, null, null, null, t1.e.d(-954760563, new bt.q0(onHeaderClick, y8Var, z14, onCourseReviewUnitCheckedChange, 1), sVar), sVar, 196614, 28);
        } else {
            sVar.W();
            z14 = z13;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.r3(z11, y8Var, z14, onCourseReviewUnitCheckedChange, onHeaderClick, i11, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x023e  */
    /* JADX WARN: Code duplicated, block: B:103:0x024e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0252  */
    /* JADX WARN: Code duplicated, block: B:107:0x0260  */
    /* JADX WARN: Code duplicated, block: B:109:0x0264  */
    /* JADX WARN: Code duplicated, block: B:111:0x0274  */
    /* JADX WARN: Code duplicated, block: B:113:0x0278  */
    /* JADX WARN: Code duplicated, block: B:120:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:132:0x0308  */
    /* JADX WARN: Code duplicated, block: B:135:0x032b  */
    /* JADX WARN: Code duplicated, block: B:137:0x033b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0152  */
    /* JADX WARN: Code duplicated, block: B:69:0x015e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0160  */
    /* JADX WARN: Code duplicated, block: B:74:0x016e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x020c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0218  */
    /* JADX WARN: Code duplicated, block: B:95:0x0228  */
    /* JADX WARN: Code duplicated, block: B:97:0x022c  */
    /* JADX WARN: Code duplicated, block: B:99:0x023a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v62 */
    public static final void h(rt.k6 k6Var, fz.f fVar, fz.c onPlayAudio, fz.c onToggleFavorite, boolean z11, fz.c cVar, boolean z12, l1.n nVar, int i11) {
        l1.s sVar;
        Object e4Var;
        int i12;
        SRSStatus sRSStatus;
        fz.a aVar;
        Object obj;
        ?? r9;
        l1.s sVar2;
        int iHashCode;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        l1.s sVar3;
        boolean z17;
        boolean zH;
        Object objQ;
        boolean z18;
        boolean z19;
        boolean zH2;
        Object objQ2;
        rt.k6 courseReviewContent = k6Var;
        fz.f onCourseReviewCheckedChange = fVar;
        kotlin.jvm.internal.m.f(courseReviewContent, "courseReviewContent");
        String str = courseReviewContent.f49975f;
        SRSStatus sRSStatus2 = courseReviewContent.f49972c;
        WordSentenceCharacterType wordSentenceCharacterType = courseReviewContent.f49973d;
        kotlin.jvm.internal.m.f(onCourseReviewCheckedChange, "onCourseReviewCheckedChange");
        kotlin.jvm.internal.m.f(onPlayAudio, "onPlayAudio");
        kotlin.jvm.internal.m.f(onToggleFavorite, "onToggleFavorite");
        l1.s sVar4 = (l1.s) nVar;
        sVar4.f0(2057978438);
        int i13 = i11 | (sVar4.h(courseReviewContent) ? 4 : 2) | (sVar4.h(onCourseReviewCheckedChange) ? 32 : 16) | (sVar4.h(onPlayAudio) ? 256 : 128) | (sVar4.h(onToggleFavorite) ? 2048 : 1024) | (sVar4.g(z11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar4.h(cVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar4.g(z12) ? 1048576 : 524288);
        if (sVar4.T(i13 & 1, (i13 & 599187) != 599186)) {
            z1.i iVar = z1.c.M;
            boolean zH3 = ((57344 & i13) == 16384) | ((458752 & i13) == 131072) | sVar4.h(courseReviewContent) | ((i13 & 896) == 256);
            Object objQ3 = sVar4.Q();
            Object obj2 = l1.m.f39353a;
            if (zH3 || objQ3 == obj2) {
                i12 = i13;
                e4Var = new bt.e4(3, cVar, k6Var, onPlayAudio, z11);
                courseReviewContent = k6Var;
                sVar4.o0(e4Var);
            } else {
                i12 = i13;
                e4Var = objQ3;
            }
            z1.o oVar = z1.o.f58481a;
            float f5 = 16;
            z1.r rVarB = j0.c.B(d0.n.o(oVar, false, null, (fz.a) e4Var, 15), f5, 8);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, iVar, sVar4, 48);
            int iHashCode2 = Long.hashCode(sVar4.T);
            l1.q1 q1VarL = sVar4.l();
            z1.r rVarC = z1.a.c(sVar4, rVarB);
            y2.k.J.getClass();
            fz.a aVar2 = y2.j.f56913b;
            sVar4.h0();
            if (sVar4.S) {
                sVar4.k(aVar2);
            } else {
                sVar4.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, a2VarA, sVar4);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar4);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar4.S) {
                sRSStatus = sRSStatus2;
            } else {
                sRSStatus = sRSStatus2;
                if (!kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                }
                y2.h hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC, sVar4);
                if (z12) {
                    sVar4.d0(1097159210);
                    if ((i12 & 7168) == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zH2 = z19 | sVar4.h(courseReviewContent);
                    objQ2 = sVar4.Q();
                    if (zH2 || objQ2 == obj2) {
                        objQ2 = new l1.z1(12, onToggleFavorite, courseReviewContent);
                        sVar4.o0(objQ2);
                    }
                    obj = obj2;
                    aVar = aVar2;
                    r9 = 0;
                    h1.k7.h((fz.a) objQ2, j0.e2.n(j0.c.y(oVar, 10, CropImageView.DEFAULT_ASPECT_RATIO, 2), 32), false, null, t1.e.d(-403944598, new y5(courseReviewContent), sVar4), sVar4, 196656, 28);
                    sVar2 = sVar4;
                } else {
                    aVar = aVar2;
                    obj = obj2;
                    r9 = 0;
                    sVar4.d0(1063468224);
                    sVar2 = sVar4;
                }
                sVar2.p(r9);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                j0.i1 i1Var = new j0.i1(1.0f, true);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, r9);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL2 = sVar2.l();
                z1.r rVarC2 = z1.a.c(sVar2, i1Var);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(aVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar, uVarA, sVar2);
                l1.t.J(hVar2, q1VarL2, sVar2);
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
                }
                l1.t.J(hVar4, rVarC2, sVar2);
                if (wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType) {
                    sVar2.d0(-357831445);
                    WordSentenceCharacterType.CharacterType characterType = (WordSentenceCharacterType.CharacterType) wordSentenceCharacterType;
                    if (sRSStatus.getLastStudyStatus() == wt.o.WRONG) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    a(characterType, z18, j0.e2.e(oVar, 1.0f), sVar2, 384);
                    sVar2.p(false);
                } else if (wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType) {
                    sVar2.d0(-357820378);
                    WordSentenceCharacterType.WordType wordType = (WordSentenceCharacterType.WordType) wordSentenceCharacterType;
                    if (sRSStatus.getLastStudyStatus() == wt.o.WRONG) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    c(wordType, z14, j0.e2.e(oVar, 1.0f), sVar2, 384);
                    sVar2.p(false);
                } else {
                    if (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) {
                        throw nv.p.x(sVar2, -357833861, false);
                    }
                    sVar2.d0(-357809261);
                    WordSentenceCharacterType.SentenceType sentenceType = (WordSentenceCharacterType.SentenceType) wordSentenceCharacterType;
                    if (sRSStatus.getLastStudyStatus() == wt.o.WRONG) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    b(sentenceType, z13, j0.c.E(j0.e2.e(oVar, 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), sVar2, 384);
                    sVar2.p(false);
                }
                if (z11 || oz.q.K0(str)) {
                    z15 = false;
                    sVar2.d0(1757412086);
                } else {
                    sVar2.d0(1793250814);
                    j0.c.g(sVar2, j0.e2.g(oVar, 6));
                    i(48, str, sVar2, j0.c.E(j0.e2.e(oVar, 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14));
                    z15 = false;
                }
                sVar2.p(z15);
                sVar2.p(true);
                if (z11) {
                    z16 = false;
                    courseReviewContent = k6Var;
                    onCourseReviewCheckedChange = fVar;
                    sVar2.d0(1063468224);
                    sVar3 = sVar2;
                } else {
                    sVar2.d0(1099652509);
                    courseReviewContent = k6Var;
                    boolean z20 = courseReviewContent.f49970a;
                    boolean z21 = courseReviewContent.f49971b;
                    z1.r rVarE = j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                    if ((i12 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zH = z17 | sVar2.h(courseReviewContent);
                    objQ = sVar2.Q();
                    if (!zH || objQ == obj) {
                        onCourseReviewCheckedChange = fVar;
                        objQ = new j9.h(28, onCourseReviewCheckedChange, courseReviewContent);
                        sVar2.o0(objQ);
                    } else {
                        onCourseReviewCheckedChange = fVar;
                    }
                    l1.s sVar5 = sVar2;
                    h1.e1.a(z20, (fz.c) objQ, rVarE, z21, null, sVar5, 384, 48);
                    sVar3 = sVar5;
                    z16 = false;
                }
                sVar3.p(z16);
                sVar3.p(true);
                sVar = sVar3;
            }
            defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar3);
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar4);
            if (z12) {
                sVar4.d0(1097159210);
                if ((i12 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zH2 = z19 | sVar4.h(courseReviewContent);
                objQ2 = sVar4.Q();
                if (zH2) {
                    objQ2 = new l1.z1(12, onToggleFavorite, courseReviewContent);
                    sVar4.o0(objQ2);
                } else {
                    objQ2 = new l1.z1(12, onToggleFavorite, courseReviewContent);
                    sVar4.o0(objQ2);
                }
                obj = obj2;
                aVar = aVar2;
                r9 = 0;
                h1.k7.h((fz.a) objQ2, j0.e2.n(j0.c.y(oVar, 10, CropImageView.DEFAULT_ASPECT_RATIO, 2), 32), false, null, t1.e.d(-403944598, new y5(courseReviewContent), sVar4), sVar4, 196656, 28);
                sVar2 = sVar4;
            } else {
                aVar = aVar2;
                obj = obj2;
                r9 = 0;
                sVar4.d0(1063468224);
                sVar2 = sVar4;
            }
            sVar2.p(r9);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.i1 i1Var2 = new j0.i1(1.0f, true);
            j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, r9);
            iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL3 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, i1Var2);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(aVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, uVarA2, sVar2);
            l1.t.J(hVar2, q1VarL3, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            }
            l1.t.J(hVar5, rVarC3, sVar2);
            if (wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType) {
                sVar2.d0(-357831445);
                WordSentenceCharacterType.CharacterType characterType2 = (WordSentenceCharacterType.CharacterType) wordSentenceCharacterType;
                if (sRSStatus.getLastStudyStatus() == wt.o.WRONG) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                a(characterType2, z18, j0.e2.e(oVar, 1.0f), sVar2, 384);
                sVar2.p(false);
            } else if (wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType) {
                sVar2.d0(-357820378);
                WordSentenceCharacterType.WordType wordType2 = (WordSentenceCharacterType.WordType) wordSentenceCharacterType;
                if (sRSStatus.getLastStudyStatus() == wt.o.WRONG) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                c(wordType2, z14, j0.e2.e(oVar, 1.0f), sVar2, 384);
                sVar2.p(false);
            } else {
                if (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) {
                    throw nv.p.x(sVar2, -357833861, false);
                }
                sVar2.d0(-357809261);
                WordSentenceCharacterType.SentenceType sentenceType2 = (WordSentenceCharacterType.SentenceType) wordSentenceCharacterType;
                if (sRSStatus.getLastStudyStatus() == wt.o.WRONG) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                b(sentenceType2, z13, j0.c.E(j0.e2.e(oVar, 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), sVar2, 384);
                sVar2.p(false);
            }
            if (z11) {
                z15 = false;
                sVar2.d0(1757412086);
            } else {
                z15 = false;
                sVar2.d0(1757412086);
            }
            sVar2.p(z15);
            sVar2.p(true);
            if (z11) {
                sVar2.d0(1099652509);
                courseReviewContent = k6Var;
                boolean z22 = courseReviewContent.f49970a;
                boolean z23 = courseReviewContent.f49971b;
                z1.r rVarE2 = j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                if ((i12 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zH = z17 | sVar2.h(courseReviewContent);
                objQ = sVar2.Q();
                if (zH) {
                    onCourseReviewCheckedChange = fVar;
                    objQ = new j9.h(28, onCourseReviewCheckedChange, courseReviewContent);
                    sVar2.o0(objQ);
                } else {
                    onCourseReviewCheckedChange = fVar;
                    objQ = new j9.h(28, onCourseReviewCheckedChange, courseReviewContent);
                    sVar2.o0(objQ);
                }
                l1.s sVar6 = sVar2;
                h1.e1.a(z22, (fz.c) objQ, rVarE2, z23, null, sVar6, 384, 48);
                sVar3 = sVar6;
                z16 = false;
            } else {
                z16 = false;
                courseReviewContent = k6Var;
                onCourseReviewCheckedChange = fVar;
                sVar2.d0(1063468224);
                sVar3 = sVar2;
            }
            sVar3.p(z16);
            sVar3.p(true);
            sVar = sVar3;
        } else {
            sVar4.W();
            sVar = sVar4;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.r1(courseReviewContent, onCourseReviewCheckedChange, onPlayAudio, onToggleFavorite, z11, cVar, z12, i11);
        }
    }

    public static final void i(int i11, String str, l1.n nVar, z1.r rVar) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-960045789);
        int i12 = i11 | (sVar.f(str) ? 4 : 2);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            z1.r rVarG = j0.e2.g(rVar, 32);
            l1.c3 c3Var = h1.v1.f31180a;
            float f5 = 8;
            z1.r rVarE = j0.c.E(d0.n.h(rVarG, ((h1.s1) sVar.j(c3Var)).f31035r, r0.f.d(6)), 10, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, 10);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            j3.y0 y0Var = ((dc) sVar.j(fc.f30256a)).f30178k;
            long j11 = ((h1.s1) sVar.j(c3Var)).f31036s;
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            ua.b(str, new j0.i1(1.0f, true), j11, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, y0Var, sVar, i12 & 14, 3120, 55288);
            sVar = sVar;
            h1.r4.b(se.k.y(R.drawable.notebook_edit, sVar, 0), null, j0.e2.n(j0.c.E(z1.o.f58481a, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 20), ((h1.s1) sVar.j(c3Var)).f31017a, sVar, 432, 0);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.a(str, rVar, i11, 5);
        }
    }

    public static final String j(x8 x8Var, l1.n nVar) {
        kotlin.jvm.internal.m.f(x8Var, "<this>");
        int i11 = e6.f41391a[x8Var.ordinal()];
        if (i11 == 1) {
            l1.s sVar = (l1.s) nVar;
            return ep.a.m(sVar, -2122172091, R.string.characters, sVar, false);
        }
        if (i11 == 2) {
            l1.s sVar2 = (l1.s) nVar;
            return ep.a.m(sVar2, -2122169344, R.string.words, sVar2, false);
        }
        if (i11 == 3) {
            l1.s sVar3 = (l1.s) nVar;
            return ep.a.m(sVar3, -2122166620, R.string.sentences, sVar3, false);
        }
        if (i11 != 4) {
            throw nv.p.x((l1.s) nVar, -2122173439, false);
        }
        l1.s sVar4 = (l1.s) nVar;
        return ep.a.m(sVar4, -2122163680, R.string.words, sVar4, false);
    }
}
