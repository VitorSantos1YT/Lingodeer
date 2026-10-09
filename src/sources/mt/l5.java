package mt;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.WordSentenceSourceKt;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.g8;
import h1.i8;
import h1.k7;
import h1.o8;
import h1.ua;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ko.Zea.ealNNtLp;
import kotlin.NoWhenBranchMatchedException;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f41627a = 152;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f41628b = 76;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f41629c = 92;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f41630d = 12;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f41631e = 42;

    public static final void a(z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-869267483);
        int i12 = (sVar.f(rVar) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            long j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p;
            j0.o.a(d0.n.g(rVar, fr.p3.A(ns.o.L(new g2.x(j11), new g2.x(g2.x.c(j11, CropImageView.DEFAULT_ASPECT_RATIO)))), null, 6), sVar, 0);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.g(rVar, i11, 14);
        }
    }

    public static final void b(int i11, WordSentenceCharacterType wordSentenceCharacterType, rt.x4 x4Var, long j11, boolean z11, l1.n nVar, int i12) {
        int i13;
        int i14;
        List<CourseWord> listK;
        List<CourseWord> list;
        String word;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1835865652);
        if ((i12 & 6) == 0) {
            i13 = i11;
            i14 = (sVar.d(i13) ? 4 : 2) | i12;
        } else {
            i13 = i11;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar.h(wordSentenceCharacterType) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= sVar.f(x4Var) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= sVar.e(j11) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= sVar.g(z11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar.T(i14 & 1, (i14 & 9363) != 9362)) {
            j3.y0 y0VarA = j3.y0.a((j3.y0) sVar.j(ua.f31167a), j11, fr.j3.A(24), z11 ? n3.s.K : n3.s.f43178t, null, null, 0L, null, null, 0, 0, 0L, null, 16777208);
            boolean zF = sVar.f(wordSentenceCharacterType);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            Object obj = objQ;
            if (zF || objQ == gVar) {
                if (wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType) {
                    listK = ns.o.K(WordSentenceSourceKt.toWordItem(((WordSentenceCharacterType.CharacterType) wordSentenceCharacterType).getCharacter()));
                } else if (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) {
                    WordSentenceCharacterType.SentenceType sentenceType = (WordSentenceCharacterType.SentenceType) wordSentenceCharacterType;
                    List<CourseWord> displayCourseWords = sentenceType.getSentence().getDisplayCourseWords();
                    if (displayCourseWords.isEmpty()) {
                        list = displayCourseWords;
                        list = null;
                    }
                    if (list == null) {
                        listK = sentenceType.getSentence().getCourseWords();
                    }
                    sVar.o0(list);
                    obj = list;
                } else {
                    if (!(wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listK = ns.o.K(((WordSentenceCharacterType.WordType) wordSentenceCharacterType).getWord());
                }
                list = listK;
                sVar.o0(list);
                obj = list;
            }
            List list2 = (List) obj;
            boolean zD = sVar.d(x4Var.f50625b) | sVar.c(x4Var.f50627d);
            Object objQ2 = sVar.Q();
            if (zD || objQ2 == gVar) {
                ct.b bVar = new ct.b(x4Var.f50627d, x4Var.f50625b, 637, fr.j3.A(24));
                sVar.o0(bVar);
                objQ2 = bVar;
            }
            ct.b bVar2 = (ct.b) objQ2;
            if (list2.isEmpty()) {
                sVar.d0(161488237);
                if (wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType) {
                    word = ((WordSentenceCharacterType.CharacterType) wordSentenceCharacterType).getCharacter().getCharacter();
                } else if (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) {
                    word = ((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType).getSentence().getSentence();
                } else {
                    if (!(wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    word = ((WordSentenceCharacterType.WordType) wordSentenceCharacterType).getWord().getWord();
                }
                ua.b(word, null, j11, fr.j3.A(24), null, z11 ? n3.s.K : n3.s.f43178t, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, ((i14 >> 3) & 896) | 3072, 0, 130514);
                sVar.p(false);
            } else {
                sVar.d0(160877537);
                l1.t.b(new l1.w1[]{ju.f.f37370d.a(Integer.valueOf(i13)), ct.c.f22476a.a(bVar2)}, t1.e.d(516589775, new bp.b0(z11, list2, y0VarA, 9), sVar), sVar, 56);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.m(i13, wordSentenceCharacterType, x4Var, j11, z11, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x021c  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0155  */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:71:0x0174  */
    /* JADX WARN: Code duplicated, block: B:75:0x018e  */
    /* JADX WARN: Code duplicated, block: B:77:0x019f  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01da  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ee  */
    public static final void c(rt.w4 w4Var, int i11, boolean z11, fz.c cVar, fz.a aVar, z1.r rVar, l1.n nVar, int i12) {
        int i13;
        float f5;
        int iHashCode;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        int i16;
        boolean z14;
        boolean z15;
        boolean zD;
        Object objQ;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1901094274);
        int i17 = (i12 & 6) == 0 ? (sVar.d(w4Var.ordinal()) ? 4 : 2) | i12 : i12;
        if ((i12 & 48) == 0) {
            i17 |= sVar.d(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i17 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i17 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i17 |= sVar.h(aVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i12) == 0) {
            i17 |= sVar.f(rVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if (sVar.T(i17 & 1, (74899 & i17) != 74898)) {
            z1.r rVarE = j0.e2.e(rVar, 1.0f);
            l1.c3 c3Var = h1.v1.f31180a;
            long j11 = ((h1.s1) sVar.j(c3Var)).f31031n;
            g2.r0 r0Var = g2.f0.f28556b;
            float f11 = 28;
            z1.r rVarB = j0.c.B(j0.c.v(d0.n.h(rVarE, j11, r0Var)), f11, 16);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarB);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, uVarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S) {
                f5 = f11;
            } else {
                f5 = f11;
                if (!kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                }
                y2.h hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC, sVar);
                z1.o oVar = z1.o.f58481a;
                z1.r rVarB2 = j0.c.B(d0.n.h(d2.h.b(j0.e2.e(oVar, 1.0f), r0.f.d(f5)), ((h1.s1) sVar.j(c3Var)).f31035r, r0Var), 12, 4);
                j0.a2 a2VarA = j0.z1.a(j0.i.f35310h, z1.c.M, sVar, 54);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarB2);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, a2VarA, sVar);
                l1.t.J(hVar2, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                }
                l1.t.J(hVar4, rVarC2, sVar);
                sVar.d0(552747397);
                for (rt.w4 w4Var2 : rt.w4.a()) {
                    i14 = k5.f41597b[w4Var2.ordinal()];
                    if (i14 != 1) {
                        z13 = false;
                        i15 = 444418958;
                        i16 = R.string.listen_along_sentences;
                    } else if (i14 != 2) {
                        z13 = false;
                        i15 = 444421994;
                        i16 = R.string.listen_along_words;
                    } else {
                        if (i14 == 3) {
                            throw nv.p.x(sVar, 444417131, false);
                        }
                        i15 = 444424906;
                        i16 = R.string.listen_along_mixed;
                        z13 = false;
                    }
                    String strM = ep.a.m(sVar, i15, i16, sVar, z13);
                    if (w4Var == w4Var2) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i17 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zD = z15 | sVar.d(w4Var2.ordinal());
                    objQ = sVar.Q();
                    if (zD || objQ == l1.m.f39353a) {
                        objQ = new l1.z1(10, cVar, w4Var2);
                        sVar.o0(objQ);
                    }
                    j(24582, (fz.a) objQ, strM, sVar, z14);
                }
                sVar.p(false);
                sVar.p(true);
                j0.c.g(sVar, j0.e2.g(oVar, 14));
                if (i11 > 0 || z11) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                i13 = i11;
                iu.k.e(aVar, j0.e2.e(oVar, 1.0f), z12, 0L, null, t1.e.d(-1160779517, new fu.b0(i13, 3), sVar), sVar, ((i17 >> 12) & 14) | 196656, 24);
                sVar.p(true);
            }
            defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            z1.o oVar2 = z1.o.f58481a;
            z1.r rVarB3 = j0.c.B(d0.n.h(d2.h.b(j0.e2.e(oVar2, 1.0f), r0.f.d(f5)), ((h1.s1) sVar.j(c3Var)).f31035r, r0Var), 12, 4);
            j0.a2 a2VarA2 = j0.z1.a(j0.i.f35310h, z1.c.M, sVar, 54);
            iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarB3);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, a2VarA2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            l1.t.J(hVar5, rVarC3, sVar);
            sVar.d0(552747397);
            while (r2.hasNext()) {
                i14 = k5.f41597b[w4Var2.ordinal()];
                if (i14 != 1) {
                    z13 = false;
                    i15 = 444418958;
                    i16 = R.string.listen_along_sentences;
                } else if (i14 != 2) {
                    z13 = false;
                    i15 = 444421994;
                    i16 = R.string.listen_along_words;
                } else {
                    if (i14 == 3) {
                        throw nv.p.x(sVar, 444417131, false);
                    }
                    i15 = 444424906;
                    i16 = R.string.listen_along_mixed;
                    z13 = false;
                }
                String strM2 = ep.a.m(sVar, i15, i16, sVar, z13);
                if (w4Var == w4Var2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i17 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zD = z15 | sVar.d(w4Var2.ordinal());
                objQ = sVar.Q();
                if (zD) {
                    objQ = new l1.z1(10, cVar, w4Var2);
                    sVar.o0(objQ);
                } else {
                    objQ = new l1.z1(10, cVar, w4Var2);
                    sVar.o0(objQ);
                }
                j(24582, (fz.a) objQ, strM2, sVar, z14);
            }
            sVar.p(false);
            sVar.p(true);
            j0.c.g(sVar, j0.e2.g(oVar2, 14));
            if (i11 > 0) {
                z12 = false;
            } else {
                z12 = false;
            }
            i13 = i11;
            iu.k.e(aVar, j0.e2.e(oVar2, 1.0f), z12, 0L, null, t1.e.d(-1160779517, new fu.b0(i13, 3), sVar), sVar, ((i17 >> 12) & 14) | 196656, 24);
            sVar.p(true);
        } else {
            i13 = i11;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new lh.b(w4Var, i13, z11, cVar, aVar, rVar, i12);
        }
    }

    public static final void d(rt.v4 v4Var, fz.a aVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1472414610);
        if ((i11 & 6) == 0) {
            i12 = (sVar.d(v4Var.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(aVar) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            k7.d(iu.k.q(((i12 << 9) & 57344) | 6, 7, aVar, sVar, j0.e2.n(z1.o.f58481a, 72), false), r0.f.d(36), k7.p(((h1.s1) sVar.j(h1.v1.f31180a)).f31031n, sVar, 0), null, null, t1.e.d(1708922172, new a00.b(v4Var, 25), sVar), sVar, 196608, 24);
            sVar = sVar;
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.t1(v4Var, i11, 18, aVar);
        }
    }

    public static final void e(rt.v4 v4Var, fz.a aVar, z1.r rVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1615452739);
        if ((i11 & 6) == 0) {
            i12 = (sVar.d(v4Var.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(rVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            long j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p;
            z1.r rVarE = j0.e2.e(rVar, 1.0f);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
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
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, uVarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            z1.o oVar = z1.o.f58481a;
            int i13 = i12;
            j0.o.a(d0.n.g(j0.e2.g(j0.e2.e(oVar, 1.0f), f41628b), fr.p3.A(ns.o.L(new g2.x(g2.x.c(j11, CropImageView.DEFAULT_ASPECT_RATIO)), new g2.x(j11))), null, 6), sVar, 0);
            z1.r rVarE2 = j0.c.E(j0.c.v(d0.n.h(j0.e2.e(oVar, 1.0f), j11, g2.f0.f28556b)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 20, 7);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarE2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            d(v4Var, aVar, sVar, i13 & 126);
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(v4Var, aVar, rVar, i11, 26);
        }
    }

    public static final void f(final rt.b5 b5Var, fz.a aVar, final fz.a aVar2, final fz.c cVar, final fz.c cVar2, final fz.c cVar3, final fz.a aVar3, final fz.c cVar4, final fz.c cVar5, final fz.c cVar6, final fz.c cVar7, final fz.c cVar8, final fz.c cVar9, final fz.c cVar10, final fz.c cVar11, final fz.a aVar4, final fz.a aVar5, l1.n nVar, final int i11, final int i12) {
        int i13;
        int i14;
        l1.s sVar;
        Object xVar;
        l1.b1 b1Var;
        l1.b1 b1Var2;
        int i15;
        fz.a aVar6 = aVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(341532488);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.h(b5Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.h(aVar6) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar2.h(aVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar2.h(cVar) ? 2048 : 1024;
        }
        int i16 = i11 & 24576;
        int i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
        if (i16 == 0) {
            i13 |= sVar2.h(cVar2) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= sVar2.h(cVar3) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= sVar2.h(aVar3) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= sVar2.h(cVar4) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= sVar2.h(cVar5) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= sVar2.h(cVar6) ? 536870912 : 268435456;
        }
        int i18 = i13;
        if ((i12 & 6) == 0) {
            i14 = i12 | (sVar2.h(cVar7) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar2.h(cVar8) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= sVar2.h(cVar9) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= sVar2.h(cVar10) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            if (sVar2.h(cVar11)) {
                i17 = 16384;
            }
            i14 |= i17;
        }
        if ((i12 & 196608) == 0) {
            i14 |= sVar2.h(aVar4) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= sVar2.h(aVar5) ? 1048576 : 524288;
        }
        if (sVar2.T(i18 & 1, ((i18 & 306783379) == 306783378 && (i14 & 599187) == 599186) ? false : true)) {
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ);
            }
            l1.b1 b1Var3 = (l1.b1) objQ;
            l0.w wVarA = l0.y.a(0, sVar2, 3);
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(null);
                sVar2.o0(objQ2);
            }
            l1.b1 b1Var4 = (l1.b1) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ3);
            }
            l1.b1 b1Var5 = (l1.b1) objQ3;
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ4);
            }
            l1.b1 b1Var6 = (l1.b1) objQ4;
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                objQ5 = l1.t.B(b5Var.f49515h);
                sVar2.o0(objQ5);
            }
            l1.b1 b1Var7 = (l1.b1) objQ5;
            Object objQ6 = sVar2.Q();
            if (objQ6 == gVar) {
                objQ6 = new x1.s();
                sVar2.o0(objQ6);
            }
            x1.s sVar3 = (x1.s) objQ6;
            Context context = (Context) sVar2.j(AndroidCompositionLocals_androidKt.f1200b);
            String strE0 = ub.a.e0(sVar2, R.string.listen_along_end_of_current_set);
            int i19 = b5Var.f49514g;
            rt.v4 v4Var = b5Var.f49515h;
            Integer numValueOf = Integer.valueOf(i19);
            Integer numValueOf2 = Integer.valueOf(b5Var.f49513f.size());
            Object objQ7 = sVar2.Q();
            if (objQ7 == gVar) {
                objQ7 = new bt.g0(b1Var4, b1Var5, null, 4);
                sVar2.o0(objQ7);
            }
            l1.t.g(numValueOf, numValueOf2, (fz.e) objQ7, sVar2);
            boolean zH = sVar2.h(b5Var) | sVar2.h(context) | sVar2.f(strE0);
            Object objQ8 = sVar2.Q();
            if (zH || objQ8 == gVar) {
                b1Var = b1Var4;
                b1Var2 = b1Var5;
                i15 = 0;
                xVar = new ad.x(b5Var, context, strE0, b1Var7, null, 24);
                sVar2.o0(xVar);
            } else {
                b1Var = b1Var4;
                b1Var2 = b1Var5;
                xVar = objQ8;
                i15 = 0;
            }
            l1.t.f((fz.e) xVar, r22, sVar2);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarH = d0.n.h(j0.e2.d(oVar, 1.0f), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p, g2.f0.f28556b);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar, sVar2, i15);
            l1.b1 b1Var8 = b1Var;
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarH);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            l1.b1 b1Var9 = b1Var2;
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, uVarA, sVar2);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar2);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar2);
            z1.r rVarA = j0.v.a(oVar, 1.0f);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarA);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar2, q0VarD, sVar2);
            l1.t.J(hVar3, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
            }
            l1.t.J(hVar5, rVarC2, sVar2);
            z1.r rVarD = j0.e2.d(oVar, 1.0f);
            j0.u uVarA2 = j0.t.a(dVar, hVar, sVar2, 0);
            int iHashCode3 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL3 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, rVarD);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar2, uVarA2, sVar2);
            l1.t.J(hVar3, q1VarL3, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar4);
            }
            l1.t.J(hVar5, rVarC3, sVar2);
            aVar6 = aVar;
            h1.e0.a(t1.e.d(-1471860065, new r(b5Var, 4), sVar2), null, t1.e.d(1955721633, new lt.g(aVar6, 10, (byte) 0), sVar2), t1.e.d(-1207322422, new br.j(aVar4, b5Var, aVar3, b1Var3, 13), sVar2), CropImageView.DEFAULT_ASPECT_RATIO, null, null, sVar2, 3462, 242);
            k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, g2.x.f28621h, sVar2, 384, 3);
            j0.c.a(j0.v.a(oVar, 1.0f), null, t1.e.d(1305689488, new ei.l(b5Var, wVarA, sVar3, b1Var6, b1Var9, b1Var8, cVar), sVar2), sVar2, 3072, 6);
            sVar2.p(true);
            e(v4Var, aVar2, j0.r.f35391a.a(oVar, z1.c.H), sVar2, (i18 >> 3) & 112);
            sVar2.p(true);
            sVar2.p(true);
            if (((Boolean) b1Var3.getValue()).booleanValue()) {
                sVar2.d0(-170000764);
                boolean z11 = (i14 & 3670016) == 1048576;
                Object objQ9 = sVar2.Q();
                if (z11 || objQ9 == gVar) {
                    objQ9 = new fu.e(11, aVar5, b1Var3);
                    sVar2.o0(objQ9);
                }
                h1.a6.a((fz.a) objQ9, null, h1.a6.f(6, 2, null, sVar2), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-1960004032, new fz.f() { // from class: mt.z4
                    @Override // fz.f
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        j0.v ModalBottomSheet = (j0.v) obj;
                        l1.n nVar2 = (l1.n) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                        l1.s sVar4 = (l1.s) nVar2;
                        if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                            rt.b5 b5Var2 = b5Var;
                            l5.m(b5Var2.f49508a, b5Var2.f49512e, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, sVar4, 0);
                        } else {
                            sVar4.W();
                        }
                        return qy.b0.f48488a;
                    }
                }, sVar2), sVar2, 0, 384, 4090);
                sVar = sVar2;
            } else {
                sVar = sVar2;
                sVar.d0(-206485222);
            }
            sVar.p(false);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            final fz.a aVar7 = aVar6;
            x1VarT.f39502d = new fz.e() { // from class: mt.a5
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iM = l1.t.M(i11 | 1);
                    int iM2 = l1.t.M(i12);
                    l5.f(b5Var, aVar7, aVar2, cVar, cVar2, cVar3, aVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, aVar4, aVar5, (l1.n) obj, iM, iM2);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void g(int i11, rt.t4 t4Var, boolean z11, boolean z12, rt.x4 x4Var, fz.a aVar, z1.r rVar, l1.n nVar, int i12) {
        l1.s sVar;
        long jC;
        long jC2;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1336811840);
        int i13 = i12 | (sVar2.d(i11) ? 4 : 2) | (sVar2.h(t4Var) ? 32 : 16) | (sVar2.g(z11) ? 256 : 128) | (sVar2.g(z12) ? 2048 : 1024) | (sVar2.f(x4Var) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(aVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.f(rVar) ? 1048576 : 524288);
        if (sVar2.T(i13 & 1, (599187 & i13) != 599186)) {
            if (z11) {
                sVar2.d0(-480945337);
                jC = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                sVar2.p(false);
            } else if (z12) {
                sVar2.d0(-480943447);
                jC = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31034q;
                sVar2.p(false);
            } else {
                sVar2.d0(-480941453);
                jC = g2.x.c(((h1.s1) sVar2.j(h1.v1.f31180a)).f31034q, 0.42f);
                sVar2.p(false);
            }
            long j11 = jC;
            if (z11) {
                sVar2.d0(-480938032);
                jC2 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31036s;
                sVar2.p(false);
            } else if (z12) {
                sVar2.d0(-480935856);
                jC2 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31036s;
                sVar2.p(false);
            } else {
                sVar2.d0(-480933421);
                jC2 = g2.x.c(((h1.s1) sVar2.j(h1.v1.f31180a)).f31036s, 0.42f);
                sVar2.p(false);
            }
            long j12 = jC2;
            z1.r rVarB = j0.c.B(j0.e2.e(z1.o.f58481a, 1.0f), 28, 10);
            l1.b3 b3VarB = b0.h.b(z12 ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO, b0.e.r(AchievementLevelType.DAY_STREAK_LV_8, 0, null, 6), "listen_along_start_here_progress", sVar2, 3120, 20);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar2, 48);
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
            sVar = sVar2;
            int i14 = (i13 >> 12) & 112;
            p(((Number) b3VarB.getValue()).floatValue(), aVar, t1.e.d(1223788961, new v4(i11, t4Var, x4Var, j11, j12, z11, rVarB), sVar), sVar, i14 | 384);
            q(((Number) b3VarB.getValue()).floatValue(), aVar, sVar, i14);
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.r0(i11, t4Var, z11, z12, x4Var, aVar, rVar, i12);
        }
    }

    public static final void h(int i11, rt.t4 t4Var, rt.x4 x4Var, long j11, long j12, boolean z11, z1.r rVar, l1.n nVar, int i12) {
        boolean z12;
        boolean z13;
        String translation;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1735996157);
        int i13 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.h(t4Var) ? 32 : 16) | (sVar.f(x4Var) ? 256 : 128) | (sVar.e(j11) ? 2048 : 1024) | (sVar.e(j12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.g(z11) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar.T(i13 & 1, (599187 & i13) != 599186)) {
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
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
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            b(i11, t4Var.f50424d, x4Var, j11, z11, sVar, (i13 & 8078) | ((i13 >> 3) & 57344));
            if (x4Var.f50629f) {
                sVar.d0(-999234690);
                j0.c.g(sVar, j0.e2.g(z1.o.f58481a, 6));
                WordSentenceCharacterType wordSentenceCharacterType = t4Var.f50424d;
                if (wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType) {
                    translation = BuildConfig.VERSION_NAME;
                } else if (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) {
                    translation = ((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType).getSentence().getTranslation();
                } else {
                    if (!(wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    translation = ((WordSentenceCharacterType.WordType) wordSentenceCharacterType).getWord().getTranslation();
                }
                int i14 = ((i13 >> 6) & 896) | 3072;
                z13 = true;
                z12 = false;
                ua.b(translation, null, j12, fr.j3.A(14), null, z11 ? n3.s.H : n3.s.f43178t, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, i14, 0, 130514);
                sVar = sVar;
            } else {
                z12 = false;
                z13 = true;
                sVar.d0(-1042888983);
            }
            sVar.p(z12);
            sVar.p(z13);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v4(i11, t4Var, x4Var, j11, j12, z11, rVar, i12);
        }
    }

    public static final void i(int i11, l1.n nVar, z1.r rVar, boolean z11) {
        int i12;
        long jC;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(153791504);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = i12 | 48;
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            l1.c3 c3Var = h1.v1.f31180a;
            long j11 = ((h1.s1) sVar.j(c3Var)).f31017a;
            z1.o oVar = z1.o.f58481a;
            float f5 = 10;
            z1.r rVarB = d2.h.b(j0.e2.n(oVar, 20), r0.f.d(f5));
            float f11 = 2;
            if (z11) {
                sVar.d0(1764758839);
                sVar.p(false);
                jC = j11;
            } else {
                sVar.d0(1764760681);
                jC = g2.x.c(((h1.s1) sVar.j(c3Var)).f31036s, 0.62f);
                sVar.p(false);
            }
            z1.r rVarJ = d0.n.j(rVarB, f11, jC, r0.f.d(f5));
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarJ);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            if (z11) {
                sVar.d0(-519670612);
                j0.o.a(d0.n.h(d2.h.b(j0.e2.n(oVar, 12), r0.f.d(6)), j11, g2.f0.f28556b), sVar, 0);
            } else {
                sVar.d0(-542775656);
            }
            sVar.p(false);
            sVar.p(true);
            rVar = oVar;
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.n(i11, rVar, z11);
        }
    }

    public static final void j(int i11, fz.a aVar, String str, l1.n nVar, boolean z11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-965465351);
        int i12 = i11 | (sVar.f(str) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.h(aVar) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 9361) != 9360)) {
            r0.e eVarD = r0.f.d(22);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarB = j0.c.B(iu.k.q((i12 << 3) & 57344, 7, aVar, sVar, d2.h.b(oVar, eVarD), false), 4, 6);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35307e, z1.c.M, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarB);
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
            i((i12 >> 6) & 14, sVar, null, z11);
            j0.c.g(sVar, j0.e2.s(oVar, 8));
            ua.b(str, null, ((h1.s1) sVar.j(h1.v1.f31180a)).f31034q, fr.j3.A(14), null, n3.s.f43178t, null, 0L, null, 0L, 2, false, 1, 0, null, sVar, ((i12 >> 3) & 14) | 199680, 3120, 120786);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iv.y(str, z11, aVar, i11, 2);
        }
    }

    public static final void l(final rt.c5 uiState, final fz.a onBackClick, final fz.a goBilling, final fz.c cVar, final fz.c onUnitClick, final fz.a onSelectAllUnits, final fz.a onDeselectAllUnits, final fz.a onPlaySelected, final fz.a onTogglePlayPause, final fz.c onStartFrom, final fz.c onPlaybackModeChange, final fz.c onScriptStyleChange, final fz.a onScriptShortcutClick, final fz.c onSleepTimerChange, final fz.c onShowNativeTranslationChange, final fz.c onRandomOrderChange, final fz.c onLoopChange, final fz.c onAudioSpeedChange, final fz.c onPlaysPerItemChange, final fz.c onPauseBetweenRepetitionsChange, final fz.c onPauseBetweenItemsChange, final fz.a onSettingsShown, final fz.a onSettingsDismissed, l1.n nVar, final int i11) {
        int i12;
        l1.s sVar;
        boolean z11;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(goBilling, "goBilling");
        kotlin.jvm.internal.m.f(cVar, PQgum.ouq);
        kotlin.jvm.internal.m.f(onUnitClick, "onUnitClick");
        kotlin.jvm.internal.m.f(onSelectAllUnits, "onSelectAllUnits");
        kotlin.jvm.internal.m.f(onDeselectAllUnits, "onDeselectAllUnits");
        kotlin.jvm.internal.m.f(onPlaySelected, "onPlaySelected");
        kotlin.jvm.internal.m.f(onTogglePlayPause, "onTogglePlayPause");
        kotlin.jvm.internal.m.f(onStartFrom, "onStartFrom");
        kotlin.jvm.internal.m.f(onPlaybackModeChange, "onPlaybackModeChange");
        kotlin.jvm.internal.m.f(onScriptStyleChange, "onScriptStyleChange");
        kotlin.jvm.internal.m.f(onScriptShortcutClick, "onScriptShortcutClick");
        kotlin.jvm.internal.m.f(onSleepTimerChange, "onSleepTimerChange");
        kotlin.jvm.internal.m.f(onShowNativeTranslationChange, "onShowNativeTranslationChange");
        kotlin.jvm.internal.m.f(onRandomOrderChange, "onRandomOrderChange");
        kotlin.jvm.internal.m.f(onLoopChange, "onLoopChange");
        kotlin.jvm.internal.m.f(onAudioSpeedChange, "onAudioSpeedChange");
        kotlin.jvm.internal.m.f(onPlaysPerItemChange, "onPlaysPerItemChange");
        kotlin.jvm.internal.m.f(onPauseBetweenRepetitionsChange, "onPauseBetweenRepetitionsChange");
        kotlin.jvm.internal.m.f(onPauseBetweenItemsChange, "onPauseBetweenItemsChange");
        kotlin.jvm.internal.m.f(onSettingsShown, "onSettingsShown");
        kotlin.jvm.internal.m.f(onSettingsDismissed, "onSettingsDismissed");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-456055826);
        if ((i11 & 6) == 0) {
            i12 = i11 | ((i11 & 8) == 0 ? sVar2.f(uiState) : sVar2.h(uiState) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(onBackClick) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(goBilling) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(cVar) ? 2048 : 1024;
        }
        int i13 = i11 & 24576;
        int i14 = OSSConstants.DEFAULT_BUFFER_SIZE;
        if (i13 == 0) {
            i12 |= sVar2.h(onUnitClick) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(onSelectAllUnits) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.h(onDeselectAllUnits) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar2.h(onPlaySelected) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= sVar2.h(onTogglePlayPause) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= sVar2.h(onStartFrom) ? 536870912 : 268435456;
        }
        int i15 = (sVar2.h(onPlaybackModeChange) ? 4 : 2) | (sVar2.h(onScriptStyleChange) ? 32 : 16) | (sVar2.h(onScriptShortcutClick) ? 256 : 128) | (sVar2.h(onSleepTimerChange) ? 2048 : 1024);
        if (sVar2.h(onShowNativeTranslationChange)) {
            i14 = 16384;
        }
        int i16 = i15 | i14 | (sVar2.h(onRandomOrderChange) ? 131072 : 65536) | (sVar2.h(onLoopChange) ? 1048576 : 524288) | (sVar2.h(onAudioSpeedChange) ? 8388608 : 4194304) | (sVar2.h(onPlaysPerItemChange) ? 67108864 : 33554432) | (sVar2.h(onPauseBetweenRepetitionsChange) ? 536870912 : 268435456);
        int i17 = (sVar2.h(onPauseBetweenItemsChange) ? 4 : 2) | (sVar2.h(onSettingsShown) ? 32 : 16) | (sVar2.h(onSettingsDismissed) ? 256 : 128);
        if (!sVar2.T(i12 & 1, ((i12 & 306783379) == 306783378 && (i16 & 306783379) == 306783378 && (i17 & 147) == 146) ? false : true)) {
            sVar = sVar2;
            sVar.W();
        } else if (uiState.equals(rt.a5.f49439a)) {
            sVar2.d0(-182950275);
            tv.a.d(0, 1, sVar2, null);
            sVar2.p(false);
            sVar = sVar2;
        } else {
            if (!(uiState instanceof rt.b5)) {
                throw nv.p.x(sVar2, -182950299, false);
            }
            sVar2.d0(-1376372993);
            rt.b5 b5Var = (rt.b5) uiState;
            Float f5 = b5Var.f49516i;
            if (f5 != null) {
                sVar2.d0(-1376379658);
                tv.a.g(f5 != null ? f5.floatValue() : CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 0, 6);
                sVar2.p(false);
                z11 = false;
                sVar = sVar2;
            } else if (b5Var.f49513f.isEmpty()) {
                sVar2.d0(-1376239290);
                sVar = sVar2;
                z11 = false;
                s(b5Var, onBackClick, goBilling, cVar, onUnitClick, onSelectAllUnits, onDeselectAllUnits, onPlaySelected, sVar, i12 & 33554416);
                sVar.p(false);
            } else {
                sVar2.d0(-1375723667);
                int i18 = i12 >> 18;
                int i19 = (i12 & 112) | (i18 & 896) | (i18 & 7168);
                int i21 = i16 << 12;
                int i22 = i17 << 12;
                int i23 = ((i16 >> 18) & 8190) | (i22 & 57344) | (i22 & 458752) | (i22 & 3670016);
                z11 = false;
                f(b5Var, onBackClick, onTogglePlayPause, onStartFrom, onPlaybackModeChange, onScriptStyleChange, onScriptShortcutClick, onSleepTimerChange, onShowNativeTranslationChange, onRandomOrderChange, onLoopChange, onAudioSpeedChange, onPlaysPerItemChange, onPauseBetweenRepetitionsChange, onPauseBetweenItemsChange, onSettingsShown, onSettingsDismissed, sVar2, i19 | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016) | (29360128 & i21) | (234881024 & i21) | (i21 & 1879048192), i23);
                sVar = sVar2;
                sVar.p(false);
            }
            sVar.p(z11);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: mt.y4
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i11 | 1);
                    l5.l(uiState, onBackClick, goBilling, cVar, onUnitClick, onSelectAllUnits, onDeselectAllUnits, onPlaySelected, onTogglePlayPause, onStartFrom, onPlaybackModeChange, onScriptStyleChange, onScriptShortcutClick, onSleepTimerChange, onShowNativeTranslationChange, onRandomOrderChange, onLoopChange, onAudioSpeedChange, onPlaysPerItemChange, onPauseBetweenRepetitionsChange, onPauseBetweenItemsChange, onSettingsShown, onSettingsDismissed, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x024b  */
    /* JADX WARN: Code duplicated, block: B:105:0x025a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0277  */
    /* JADX WARN: Code duplicated, block: B:108:0x0287  */
    /* JADX WARN: Code duplicated, block: B:109:0x028b  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:117:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:119:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:120:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:131:0x0333  */
    /* JADX WARN: Code duplicated, block: B:133:0x033f  */
    /* JADX WARN: Code duplicated, block: B:134:0x034a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0368  */
    /* JADX WARN: Code duplicated, block: B:137:0x0370  */
    /* JADX WARN: Code duplicated, block: B:141:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:144:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:145:0x03be  */
    /* JADX WARN: Code duplicated, block: B:151:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:154:0x0414  */
    /* JADX WARN: Code duplicated, block: B:155:0x0416  */
    /* JADX WARN: Code duplicated, block: B:158:0x0468  */
    /* JADX WARN: Code duplicated, block: B:159:0x046a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0477  */
    /* JADX WARN: Code duplicated, block: B:168:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:170:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:173:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:175:0x050b  */
    /* JADX WARN: Code duplicated, block: B:182:0x0381 A[EDGE_INSN: B:182:0x0381->B:139:0x0381 BREAK  A[LOOP:0: B:129:0x0328->B:138:0x0379], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:96:0x022c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0230  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v30 */
    public static final void m(int i11, rt.x4 x4Var, fz.c cVar, fz.c cVar2, fz.c cVar3, fz.c cVar4, fz.c cVar5, fz.c cVar6, fz.c cVar7, fz.c cVar8, fz.c cVar9, fz.c cVar10, l1.n nVar, int i12) {
        l1.s sVar;
        fz.c cVar11;
        fz.c cVar12;
        l1.b1 b1Var;
        Object objQ;
        float f5;
        int iHashCode;
        int i13;
        String[] strArrD;
        int i14;
        int length;
        boolean z11;
        int iL;
        Object objQ2;
        l1.g gVar;
        int i15;
        boolean z12;
        boolean z13;
        boolean zH;
        Object objQ3;
        int i16;
        z1.o oVar;
        l1.s sVar2;
        ArrayList arrayList;
        Iterator<E> it;
        float f11;
        float f12;
        float f13;
        Object objQ4;
        boolean z14;
        Object objQ5;
        l1.s sVar3;
        boolean z15;
        boolean z16;
        Object objQ6;
        String strT;
        String strT2;
        Integer numB;
        String strT3;
        l1.s sVar4 = (l1.s) nVar;
        sVar4.f0(1434521842);
        int i17 = i12 | (sVar4.d(i11) ? 4 : 2) | (sVar4.f(x4Var) ? 32 : 16) | (sVar4.h(cVar2) ? 2048 : 1024) | (sVar4.h(cVar3) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar4.h(cVar4) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar4.h(cVar5) ? 1048576 : 524288) | (sVar4.h(cVar6) ? 8388608 : 4194304) | (sVar4.h(cVar7) ? 67108864 : 33554432) | (sVar4.h(cVar8) ? 536870912 : 268435456);
        int i18 = (sVar4.h(cVar9) ? 4 : 2) | (sVar4.h(cVar10) ? 32 : 16);
        if (sVar4.T(i17 & 1, ((i17 & 306783251) == 306783250 && (i18 & 19) == 18) ? false : true)) {
            Object objQ7 = sVar4.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ7 == gVar2) {
                objQ7 = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ7);
            }
            Object objQ8 = sVar4.Q();
            if (objQ8 == gVar2) {
                objQ8 = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ8);
            }
            l1.b1 b1Var2 = (l1.b1) objQ8;
            Object objQ9 = sVar4.Q();
            if (objQ9 == gVar2) {
                objQ9 = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ9);
            }
            l1.b1 b1Var3 = (l1.b1) objQ9;
            v3.c cVar13 = (v3.c) sVar4.j(z2.g1.f58547h);
            Object objQ10 = sVar4.Q();
            if (objQ10 == gVar2) {
                objQ10 = ep.a.r(0, sVar4);
            }
            l1.b1 b1Var4 = (l1.b1) objQ10;
            boolean zD = sVar4.d(((Number) b1Var4.getValue()).intValue()) | sVar4.f(cVar13);
            Object objQ11 = sVar4.Q();
            if (zD || objQ11 == gVar2) {
                objQ11 = new v3.f(((Number) b1Var4.getValue()).intValue() == 0 ? Float.NaN : cVar13.Q(((Number) b1Var4.getValue()).intValue()));
                sVar4.o0(objQ11);
            }
            float f14 = ((v3.f) objQ11).f53489a;
            z1.o oVar2 = z1.o.f58481a;
            z1.r rVarC = j0.e2.c(j0.e2.e(oVar2, 1.0f), 0.82f);
            Object objQ12 = sVar4.Q();
            if (objQ12 == gVar2) {
                objQ12 = new p(12, b1Var4);
                sVar4.o0(objQ12);
            }
            z1.r rVarO = w2.a0.o(rVarC, (fz.c) objQ12);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar, sVar4, 0);
            int iHashCode2 = Long.hashCode(sVar4.T);
            l1.q1 q1VarL = sVar4.l();
            z1.r rVarC2 = z1.a.c(sVar4, rVarO);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar4.h0();
            if (sVar4.S) {
                sVar4.k(iVar);
            } else {
                sVar4.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, uVarA, sVar4);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar4);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar4.S) {
                b1Var = b1Var2;
            } else {
                b1Var = b1Var2;
                if (!kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                }
                y2.h hVar5 = y2.j.f56915d;
                l1.t.J(hVar5, rVarC2, sVar4);
                String strE0 = ub.a.e0(sVar4, R.string.learning_preferences);
                objQ = sVar4.Q();
                if (objQ == gVar2) {
                    objQ = new ju.d(24);
                    sVar4.o0(objQ);
                }
                ys.a.l(432, (fz.a) objQ, strE0, sVar4, false);
                z1.r rVarY = d0.n.y(oVar2, d0.n.u(sVar4), true, 12);
                f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                z1.r rVarC3 = j0.c.C(j0.c.v(j0.e2.i(rVarY, f14, CropImageView.DEFAULT_ASPECT_RATIO, 2)), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                j0.u uVarA2 = j0.t.a(dVar, hVar, sVar4, 0);
                iHashCode = Long.hashCode(sVar4.T);
                l1.q1 q1VarL2 = sVar4.l();
                z1.r rVarC4 = z1.a.c(sVar4, rVarC3);
                sVar4.h0();
                if (sVar4.S) {
                    sVar4.k(iVar);
                } else {
                    sVar4.r0();
                }
                l1.t.J(hVar2, uVarA2, sVar4);
                l1.t.J(hVar3, q1VarL2, sVar4);
                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar4, iHashCode, hVar4);
                }
                l1.t.J(hVar5, rVarC4, sVar4);
                i13 = i17 & 14;
                strArrD = ys.a.D(sVar4, i11);
                if (strArrD.length == 0) {
                    sVar4.d0(-840835268);
                    sVar4.p(false);
                    cVar11 = cVar2;
                    sVar2 = sVar4;
                    i16 = 0;
                    oVar = oVar2;
                    i15 = i17;
                    gVar = gVar2;
                } else {
                    sVar4.d0(-790199620);
                    String strE = ys.a.E(sVar4, i11);
                    i14 = x4Var.f50625b;
                    length = strArrD.length;
                    if (length <= 0) {
                        iL = 0;
                        z11 = true;
                    } else {
                        z11 = true;
                        iL = hz.b.l(i14, 0, length - 1);
                    }
                    boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                    objQ2 = sVar4.Q();
                    gVar = gVar2;
                    if (objQ2 == gVar) {
                        objQ2 = new p(13, b1Var);
                        sVar4.o0(objQ2);
                    }
                    fz.c cVar14 = (fz.c) objQ2;
                    i15 = i17;
                    if ((i15 & 7168) == 2048) {
                        z12 = z11;
                    } else {
                        z12 = false;
                    }
                    if (i13 == 4) {
                        z13 = z11;
                    } else {
                        z13 = false;
                    }
                    zH = z13 | z12 | sVar4.h(strArrD);
                    objQ3 = sVar4.Q();
                    if (!zH || objQ3 == gVar) {
                        cVar11 = cVar2;
                        objQ3 = new j9.h(cVar11, i11, strArrD);
                        sVar4.o0(objQ3);
                    } else {
                        cVar11 = cVar2;
                    }
                    i16 = 0;
                    int i19 = iL;
                    oVar = oVar2;
                    ys.a.i(strE, strArrD, i19, zBooleanValue, false, cVar14, (fz.c) objQ3, sVar4, 196608, 16);
                    sVar2 = sVar4;
                    sVar2.p(false);
                }
                String strE1 = ub.a.e0(sVar2, R.string.listen_along_sleep_timer);
                sVar2.d0(390183384);
                yy.a aVarA = rt.y4.a();
                arrayList = new ArrayList(ry.n.W(aVarA, 10));
                it = aVarA.iterator();
                while (true) {
                    f11 = f5;
                    if (it.hasNext()) {
                        break;
                    }
                    numB = ((rt.y4) it.next()).b();
                    if (numB == null) {
                        sVar2.d0(1627685624);
                        sVar2.p(i16);
                        strT3 = null;
                    } else {
                        sVar2.d0(1627685625);
                        strT3 = t(R.string.listen_along_mins, new Object[]{Integer.valueOf(numB.intValue())}, sVar2);
                        sVar2.p(i16);
                    }
                    if (strT3 == null) {
                        strT3 = ep.a.m(sVar2, 1299434603, R.string.listen_along_off, sVar2, i16);
                    } else {
                        sVar2.d0(1299431751);
                        sVar2.p(i16);
                    }
                    arrayList.add(strT3);
                    f5 = f11;
                }
                sVar2.p(i16);
                String[] strArr = (String[]) arrayList.toArray(new String[i16]);
                rt.y4 y4Var = x4Var.f50628e;
                f12 = x4Var.f50635l;
                f13 = x4Var.f50634k;
                int i21 = x4Var.f50633j;
                int iOrdinal = y4Var.ordinal();
                boolean zBooleanValue2 = ((Boolean) r24.getValue()).booleanValue();
                objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = new p(14, b1Var3);
                    sVar2.o0(objQ4);
                }
                fz.c cVar15 = (fz.c) objQ4;
                if ((57344 & i15) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ5 = sVar2.Q();
                if (z14 || objQ5 == gVar) {
                    objQ5 = new b0.o1(cVar3, 19);
                    sVar2.o0(objQ5);
                }
                sVar3 = sVar2;
                ys.a.i(strE1, strArr, iOrdinal, zBooleanValue2, false, cVar15, (fz.c) objQ5, sVar3, 196608, 16);
                ys.a.m(ub.a.e0(sVar3, R.string.listen_along_show_native_translation), x4Var.f50629f, cVar4, sVar3, (i15 >> 9) & 896);
                String strE2 = ub.a.e0(sVar3, R.string.listen_along_random_order);
                if (x4Var.f50630g == rt.s4.SHUFFLE) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                ys.a.m(strE2, z15, cVar5, sVar3, (i15 >> 12) & 896);
                ys.a.m(ub.a.e0(sVar3, R.string.listen_along_loop), x4Var.f50631h, cVar6, sVar3, (i15 >> 15) & 896);
                o(x4Var.f50632i, cVar7, sVar3, (i15 >> 21) & 112);
                String strE3 = ub.a.e0(sVar3, R.string.listen_along_plays_per_sentence);
                String strT4 = t(R.string.listen_along_times_format, new Object[]{Integer.valueOf(i21)}, sVar3);
                float f15 = i21;
                lz.d dVar2 = new lz.d(1.0f, 5.0f);
                if ((1879048192 & i15) == 536870912) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objQ6 = sVar3.Q();
                if (!z16 || objQ6 == gVar) {
                    cVar12 = cVar8;
                    objQ6 = new b0.o1(cVar12, 20);
                    sVar3.o0(objQ6);
                } else {
                    cVar12 = cVar8;
                }
                n(strE3, strT4, f15, dVar2, 3, CropImageView.DEFAULT_ASPECT_RATIO, false, (fz.c) objQ6, sVar3, 24576, 96);
                String strE4 = ub.a.e0(sVar3, R.string.listen_along_pause_between_plays);
                if (f13 == f11) {
                    strT = ep.a.m(sVar3, -787253845, R.string.listen_along_off, sVar3, false);
                } else {
                    sVar3.d0(-787162581);
                    strT = t(R.string.listen_along_seconds_format, new Object[]{u(f13)}, sVar3);
                    sVar3.p(false);
                }
                n(strE4, strT, x4Var.f50634k, new lz.d(f11, 5.0f), 0, 0.5f, false, cVar9, sVar3, ((i18 << 21) & 29360128) | 1794048, 0);
                String strE5 = ub.a.e0(sVar3, R.string.listen_along_pause_between_items);
                if (f12 == CropImageView.DEFAULT_ASPECT_RATIO) {
                    strT2 = ep.a.m(sVar3, -786447349, R.string.listen_along_off, sVar3, false);
                } else {
                    sVar3.d0(-786356271);
                    strT2 = t(R.string.listen_along_seconds_format, new Object[]{u(f12)}, sVar3);
                    sVar3.p(false);
                }
                n(strE5, strT2, x4Var.f50635l, new lz.d(CropImageView.DEFAULT_ASPECT_RATIO, 5.0f), 0, 0.5f, false, cVar10, sVar3, ((i18 << 18) & 29360128) | 1794048, 0);
                sVar = sVar3;
                hh.p0.B(oVar, 24, sVar, true, true);
            }
            defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar4);
            y2.h hVar6 = y2.j.f56915d;
            l1.t.J(hVar6, rVarC2, sVar4);
            String strE6 = ub.a.e0(sVar4, R.string.learning_preferences);
            objQ = sVar4.Q();
            if (objQ == gVar2) {
                objQ = new ju.d(24);
                sVar4.o0(objQ);
            }
            ys.a.l(432, (fz.a) objQ, strE6, sVar4, false);
            z1.r rVarY2 = d0.n.y(oVar2, d0.n.u(sVar4), true, 12);
            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
            z1.r rVarC5 = j0.c.C(j0.c.v(j0.e2.i(rVarY2, f14, CropImageView.DEFAULT_ASPECT_RATIO, 2)), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.u uVarA3 = j0.t.a(dVar, hVar, sVar4, 0);
            iHashCode = Long.hashCode(sVar4.T);
            l1.q1 q1VarL3 = sVar4.l();
            z1.r rVarC6 = z1.a.c(sVar4, rVarC5);
            sVar4.h0();
            if (sVar4.S) {
                sVar4.k(iVar);
            } else {
                sVar4.r0();
            }
            l1.t.J(hVar2, uVarA3, sVar4);
            l1.t.J(hVar3, q1VarL3, sVar4);
            if (sVar4.S) {
                defpackage.e.A(iHashCode, sVar4, iHashCode, hVar4);
            } else {
                defpackage.e.A(iHashCode, sVar4, iHashCode, hVar4);
            }
            l1.t.J(hVar6, rVarC6, sVar4);
            i13 = i17 & 14;
            strArrD = ys.a.D(sVar4, i11);
            if (strArrD.length == 0) {
                sVar4.d0(-840835268);
                sVar4.p(false);
                cVar11 = cVar2;
                sVar2 = sVar4;
                i16 = 0;
                oVar = oVar2;
                i15 = i17;
                gVar = gVar2;
            } else {
                sVar4.d0(-790199620);
                String strE7 = ys.a.E(sVar4, i11);
                i14 = x4Var.f50625b;
                length = strArrD.length;
                if (length <= 0) {
                    iL = 0;
                    z11 = true;
                } else {
                    z11 = true;
                    iL = hz.b.l(i14, 0, length - 1);
                }
                boolean zBooleanValue3 = ((Boolean) b1Var.getValue()).booleanValue();
                objQ2 = sVar4.Q();
                gVar = gVar2;
                if (objQ2 == gVar) {
                    objQ2 = new p(13, b1Var);
                    sVar4.o0(objQ2);
                }
                fz.c cVar16 = (fz.c) objQ2;
                i15 = i17;
                if ((i15 & 7168) == 2048) {
                    z12 = z11;
                } else {
                    z12 = false;
                }
                if (i13 == 4) {
                    z13 = z11;
                } else {
                    z13 = false;
                }
                zH = z13 | z12 | sVar4.h(strArrD);
                objQ3 = sVar4.Q();
                if (zH) {
                    cVar11 = cVar2;
                    objQ3 = new j9.h(cVar11, i11, strArrD);
                    sVar4.o0(objQ3);
                } else {
                    cVar11 = cVar2;
                    objQ3 = new j9.h(cVar11, i11, strArrD);
                    sVar4.o0(objQ3);
                }
                i16 = 0;
                int i110 = iL;
                oVar = oVar2;
                ys.a.i(strE7, strArrD, i110, zBooleanValue3, false, cVar16, (fz.c) objQ3, sVar4, 196608, 16);
                sVar2 = sVar4;
                sVar2.p(false);
            }
            String strE8 = ub.a.e0(sVar2, R.string.listen_along_sleep_timer);
            sVar2.d0(390183384);
            yy.a aVarA2 = rt.y4.a();
            arrayList = new ArrayList(ry.n.W(aVarA2, 10));
            it = aVarA2.iterator();
            while (true) {
                f11 = f5;
                if (it.hasNext()) {
                    break;
                    break;
                }
                numB = ((rt.y4) it.next()).b();
                if (numB == null) {
                    sVar2.d0(1627685624);
                    sVar2.p(i16);
                    strT3 = null;
                } else {
                    sVar2.d0(1627685625);
                    strT3 = t(R.string.listen_along_mins, new Object[]{Integer.valueOf(numB.intValue())}, sVar2);
                    sVar2.p(i16);
                }
                if (strT3 == null) {
                    strT3 = ep.a.m(sVar2, 1299434603, R.string.listen_along_off, sVar2, i16);
                } else {
                    sVar2.d0(1299431751);
                    sVar2.p(i16);
                }
                arrayList.add(strT3);
                f5 = f11;
            }
            sVar2.p(i16);
            String[] strArr2 = (String[]) arrayList.toArray(new String[i16]);
            rt.y4 y4Var2 = x4Var.f50628e;
            f12 = x4Var.f50635l;
            f13 = x4Var.f50634k;
            int i22 = x4Var.f50633j;
            int iOrdinal2 = y4Var2.ordinal();
            boolean zBooleanValue4 = ((Boolean) r24.getValue()).booleanValue();
            objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = new p(14, b1Var3);
                sVar2.o0(objQ4);
            }
            fz.c cVar17 = (fz.c) objQ4;
            if ((57344 & i15) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            objQ5 = sVar2.Q();
            if (z14) {
                objQ5 = new b0.o1(cVar3, 19);
                sVar2.o0(objQ5);
            } else {
                objQ5 = new b0.o1(cVar3, 19);
                sVar2.o0(objQ5);
            }
            sVar3 = sVar2;
            ys.a.i(strE8, strArr2, iOrdinal2, zBooleanValue4, false, cVar17, (fz.c) objQ5, sVar3, 196608, 16);
            ys.a.m(ub.a.e0(sVar3, R.string.listen_along_show_native_translation), x4Var.f50629f, cVar4, sVar3, (i15 >> 9) & 896);
            String strE9 = ub.a.e0(sVar3, R.string.listen_along_random_order);
            if (x4Var.f50630g == rt.s4.SHUFFLE) {
                z15 = true;
            } else {
                z15 = false;
            }
            ys.a.m(strE9, z15, cVar5, sVar3, (i15 >> 12) & 896);
            ys.a.m(ub.a.e0(sVar3, R.string.listen_along_loop), x4Var.f50631h, cVar6, sVar3, (i15 >> 15) & 896);
            o(x4Var.f50632i, cVar7, sVar3, (i15 >> 21) & 112);
            String strE10 = ub.a.e0(sVar3, R.string.listen_along_plays_per_sentence);
            String strT5 = t(R.string.listen_along_times_format, new Object[]{Integer.valueOf(i22)}, sVar3);
            float f16 = i22;
            lz.d dVar3 = new lz.d(1.0f, 5.0f);
            if ((1879048192 & i15) == 536870912) {
                z16 = true;
            } else {
                z16 = false;
            }
            objQ6 = sVar3.Q();
            if (z16) {
                cVar12 = cVar8;
                objQ6 = new b0.o1(cVar12, 20);
                sVar3.o0(objQ6);
            } else {
                cVar12 = cVar8;
                objQ6 = new b0.o1(cVar12, 20);
                sVar3.o0(objQ6);
            }
            n(strE10, strT5, f16, dVar3, 3, CropImageView.DEFAULT_ASPECT_RATIO, false, (fz.c) objQ6, sVar3, 24576, 96);
            String strE11 = ub.a.e0(sVar3, R.string.listen_along_pause_between_plays);
            if (f13 == f11) {
                strT = ep.a.m(sVar3, -787253845, R.string.listen_along_off, sVar3, false);
            } else {
                sVar3.d0(-787162581);
                strT = t(R.string.listen_along_seconds_format, new Object[]{u(f13)}, sVar3);
                sVar3.p(false);
            }
            n(strE11, strT, x4Var.f50634k, new lz.d(f11, 5.0f), 0, 0.5f, false, cVar9, sVar3, ((i18 << 21) & 29360128) | 1794048, 0);
            String strE12 = ub.a.e0(sVar3, R.string.listen_along_pause_between_items);
            if (f12 == CropImageView.DEFAULT_ASPECT_RATIO) {
                strT2 = ep.a.m(sVar3, -786447349, R.string.listen_along_off, sVar3, false);
            } else {
                sVar3.d0(-786356271);
                strT2 = t(R.string.listen_along_seconds_format, new Object[]{u(f12)}, sVar3);
                sVar3.p(false);
            }
            n(strE12, strT2, x4Var.f50635l, new lz.d(CropImageView.DEFAULT_ASPECT_RATIO, 5.0f), 0, 0.5f, false, cVar10, sVar3, ((i18 << 18) & 29360128) | 1794048, 0);
            sVar = sVar3;
            hh.p0.B(oVar, 24, sVar, true, true);
        } else {
            sVar = sVar4;
            cVar11 = cVar2;
            cVar12 = cVar8;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e5(i11, x4Var, cVar, cVar11, cVar3, cVar4, cVar5, cVar6, cVar7, cVar12, cVar9, cVar10, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0208  */
    /* JADX WARN: Code duplicated, block: B:107:0x0218  */
    /* JADX WARN: Code duplicated, block: B:110:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:111:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:114:0x0301  */
    /* JADX WARN: Code duplicated, block: B:115:0x0303  */
    /* JADX WARN: Code duplicated, block: B:118:0x030f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0311  */
    /* JADX WARN: Code duplicated, block: B:125:0x0324  */
    /* JADX WARN: Code duplicated, block: B:128:0x0389  */
    /* JADX WARN: Code duplicated, block: B:130:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:131:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:136:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:140:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:142:0x0402  */
    /* JADX WARN: Code duplicated, block: B:143:0x0404  */
    /* JADX WARN: Code duplicated, block: B:146:0x0419  */
    /* JADX WARN: Code duplicated, block: B:147:0x0426  */
    /* JADX WARN: Code duplicated, block: B:150:0x0484  */
    /* JADX WARN: Code duplicated, block: B:152:0x0497  */
    /* JADX WARN: Code duplicated, block: B:155:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x0102  */
    /* JADX WARN: Code duplicated, block: B:85:0x0123  */
    /* JADX WARN: Code duplicated, block: B:88:0x018f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0193  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ed  */
    public static final void n(final String str, final String str2, final float f5, final lz.d dVar, final int i11, float f11, boolean z11, final fz.c cVar, l1.n nVar, final int i12, final int i13) {
        int i14;
        float f12;
        int i15;
        boolean z12;
        int i16;
        boolean z13;
        final boolean z14;
        final float f13;
        l1.x1 x1VarT;
        float f14;
        boolean z15;
        float fK;
        int iQ;
        int iQ2;
        boolean zD;
        Object objQ;
        l1.g gVar;
        List list;
        Object objQ2;
        long j11;
        z1.o oVar;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        y2.h hVar2;
        y2.h hVar3;
        y2.h hVar4;
        float f15;
        int i17;
        int iHashCode2;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objQ3;
        float f16;
        boolean z20;
        int iHashCode3;
        Iterator itO;
        int iIntValue;
        boolean z21;
        long j12;
        int i18;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-11109703);
        if ((i12 & 6) == 0) {
            i14 = (sVar.f(str) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar.f(str2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= sVar.c(f5) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= sVar.f(dVar) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= sVar.d(i11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i19 = i13 & 32;
        if (i19 == 0) {
            if ((196608 & i12) == 0) {
                f12 = f11;
                i14 |= sVar.c(f12) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
            }
            i15 = i13 & 64;
            if (i15 != 0) {
                i14 |= 1572864;
                z12 = z11;
            } else {
                z12 = z11;
                if ((i12 & 1572864) == 0) {
                    if (sVar.g(z12)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i14 |= i16;
                }
            }
            if ((i12 & 12582912) == 0) {
                if (sVar.h(cVar)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i14 |= i18;
            }
            if ((i14 & 4793491) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar.T(i14 & 1, z13)) {
                if (i19 != 0) {
                    f14 = 1.0f;
                } else {
                    f14 = f12;
                }
                if (i15 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                float f17 = dVar.f40530a;
                float f18 = dVar.f40531b;
                fK = hz.b.k(f5, f17, f18);
                iQ = hz.b.Q(f17);
                iQ2 = hz.b.Q(f18);
                zD = sVar.d(iQ) | sVar.d(iQ2);
                objQ = sVar.Q();
                gVar = l1.m.f39353a;
                if (zD || objQ == gVar) {
                    objQ = ry.m.a1(new lz.g(iQ, iQ2, 1));
                    sVar.o0(objQ);
                }
                list = (List) objQ;
                float fK2 = hz.b.k((fK - f17) / (f18 - f17), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = com.google.android.material.datepicker.d.f(sVar);
                }
                h0.i iVar2 = (h0.i) objQ2;
                l1.c3 c3Var = h1.v1.f31180a;
                j11 = ((h1.s1) sVar.j(c3Var)).f31017a;
                long jC = g2.x.c(((h1.s1) sVar.j(c3Var)).f31035r, 0.72f);
                oVar = z1.o.f58481a;
                float f19 = 16;
                z1.r rVarE = j0.c.E(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 18, CropImageView.DEFAULT_ASPECT_RATIO, f19, 5);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(sVar, rVarE);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                hVar = y2.j.f56917f;
                l1.t.J(hVar, uVarA, sVar);
                hVar2 = y2.j.f56916e;
                l1.t.J(hVar2, q1VarL, sVar);
                hVar3 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                }
                hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC, sVar);
                z1.r rVarE2 = j0.e2.e(oVar, 1.0f);
                f15 = f14;
                j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
                i17 = i14;
                iHashCode2 = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarE2);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, a2VarA, sVar);
                l1.t.J(hVar2, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                }
                l1.t.J(hVar4, rVarC2, sVar);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                j0.i1 i1Var = new j0.i1(1.0f, true);
                l1.c3 c3Var2 = fc.f30256a;
                ua.b(str, i1Var, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar.j(c3Var2)).f30175h, ((h1.s1) sVar.j(c3Var)).f31034q, 0L, n3.s.f43178t, null, null, 0L, null, null, 0, 0, 0L, null, 16777210), sVar, i17 & 14, 0, 65532);
                ua.b(str2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar.j(c3Var2)).f30175h, j11, 0L, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777210), sVar, (i17 >> 3) & 14, 0, 65534);
                sVar.p(true);
                j0.c.g(sVar, j0.e2.g(oVar, f19));
                int i21 = i8.f30425a;
                long j13 = g2.x.f28621h;
                g8 g8VarA = i8.a(j11, j13, j13, j13, j13, sVar);
                sVar = sVar;
                z1.r rVarG = j0.e2.g(j0.e2.e(oVar, 1.0f), 36);
                if ((i17 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i17 & 29360128) == 8388608) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z22 = z16 | z17;
                if ((i17 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z22 | z18;
                objQ3 = sVar.Q();
                if (!z19 || objQ3 == gVar) {
                    f16 = f15;
                    objQ3 = new dt.p1(f16, cVar, dVar, 2);
                    sVar.o0(objQ3);
                } else {
                    f16 = f15;
                }
                float f21 = f16;
                o8.a(fK, (fz.c) objQ3, rVarG, false, null, g8VarA, iVar2, i11, t1.e.d(243523307, new dt.r0(j11, 1), sVar), t1.e.d(-757532564, new t4(jC, j11, fK2), sVar), dVar, sVar, ((r3 << 9) & 29360128) | 907542912, (i17 >> 9) & 14, 24);
                if (z15) {
                    sVar.d0(-750214816);
                    j0.c.g(sVar, j0.e2.g(oVar, 10));
                    z1.r rVarE3 = j0.e2.e(oVar, 1.0f);
                    j0.a2 a2VarA2 = j0.z1.a(j0.i.f35309g, z1.c.L, sVar, 6);
                    iHashCode3 = Long.hashCode(sVar.T);
                    l1.q1 q1VarL3 = sVar.l();
                    z1.r rVarC3 = z1.a.c(sVar, rVarE3);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar, a2VarA2, sVar);
                    l1.t.J(hVar2, q1VarL3, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                    }
                    itO = com.google.android.material.datepicker.d.o(sVar, rVarC3, hVar4, 416487103, list);
                    while (itO.hasNext()) {
                        iIntValue = ((Number) itO.next()).intValue();
                        if (iIntValue == hz.b.Q(fK)) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        String strValueOf = String.valueOf(iIntValue);
                        j3.y0 y0Var = (j3.y0) sVar.j(ua.f31167a);
                        long jA = fr.j3.A(14);
                        if (z21) {
                            sVar.d0(-254433775);
                            sVar.p(false);
                            j12 = j11;
                        } else {
                            sVar.d0(-254432394);
                            long j14 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s;
                            sVar.p(false);
                            j12 = j14;
                        }
                        l1.s sVar2 = sVar;
                        ua.b(strValueOf, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, j12, jA, n3.s.f43178t, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar2, 0, 0, 65534);
                        sVar = sVar2;
                    }
                    z20 = true;
                    com.google.android.material.datepicker.d.B(sVar, false, true, false);
                } else {
                    z20 = true;
                    sVar.d0(-809992333);
                    sVar.p(false);
                }
                sVar.p(z20);
                z14 = z15;
                f13 = f21;
            } else {
                sVar.W();
                z14 = z12;
                f13 = f12;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: mt.u4
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        l5.n(str, str2, f5, dVar, i11, f13, z14, cVar, (l1.n) obj, l1.t.M(i12 | 1), i13);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i14 |= 196608;
        f12 = f11;
        i15 = i13 & 64;
        if (i15 != 0) {
            i14 |= 1572864;
            z12 = z11;
        } else {
            z12 = z11;
            if ((i12 & 1572864) == 0) {
                if (sVar.g(z12)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i14 |= i16;
            }
        }
        if ((i12 & 12582912) == 0) {
            if (sVar.h(cVar)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i14 |= i18;
        }
        if ((i14 & 4793491) != 4793490) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (sVar.T(i14 & 1, z13)) {
            if (i19 != 0) {
                f14 = 1.0f;
            } else {
                f14 = f12;
            }
            if (i15 != 0) {
                z15 = true;
            } else {
                z15 = z12;
            }
            float f110 = dVar.f40530a;
            float f111 = dVar.f40531b;
            fK = hz.b.k(f5, f110, f111);
            iQ = hz.b.Q(f110);
            iQ2 = hz.b.Q(f111);
            zD = sVar.d(iQ) | sVar.d(iQ2);
            objQ = sVar.Q();
            gVar = l1.m.f39353a;
            if (zD) {
                objQ = ry.m.a1(new lz.g(iQ, iQ2, 1));
                sVar.o0(objQ);
            } else {
                objQ = ry.m.a1(new lz.g(iQ, iQ2, 1));
                sVar.o0(objQ);
            }
            list = (List) objQ;
            float fK3 = hz.b.k((fK - f110) / (f111 - f110), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
            objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = com.google.android.material.datepicker.d.f(sVar);
            }
            h0.i iVar3 = (h0.i) objQ2;
            l1.c3 c3Var3 = h1.v1.f31180a;
            j11 = ((h1.s1) sVar.j(c3Var3)).f31017a;
            long jC2 = g2.x.c(((h1.s1) sVar.j(c3Var3)).f31035r, 0.72f);
            oVar = z1.o.f58481a;
            float f112 = 16;
            z1.r rVarE4 = j0.c.E(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 18, CropImageView.DEFAULT_ASPECT_RATIO, f112, 5);
            j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarE4);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            hVar = y2.j.f56917f;
            l1.t.J(hVar, uVarA2, sVar);
            hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL4, sVar);
            hVar3 = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC4, sVar);
            z1.r rVarE5 = j0.e2.e(oVar, 1.0f);
            f15 = f14;
            j0.a2 a2VarA3 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            i17 = i14;
            iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL5 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarE5);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, a2VarA3, sVar);
            l1.t.J(hVar2, q1VarL5, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            } else {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC5, sVar);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.i1 i1Var2 = new j0.i1(1.0f, true);
            l1.c3 c3Var4 = fc.f30256a;
            ua.b(str, i1Var2, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar.j(c3Var4)).f30175h, ((h1.s1) sVar.j(c3Var3)).f31034q, 0L, n3.s.f43178t, null, null, 0L, null, null, 0, 0, 0L, null, 16777210), sVar, i17 & 14, 0, 65532);
            ua.b(str2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar.j(c3Var4)).f30175h, j11, 0L, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777210), sVar, (i17 >> 3) & 14, 0, 65534);
            sVar.p(true);
            j0.c.g(sVar, j0.e2.g(oVar, f112));
            int i22 = i8.f30425a;
            long j15 = g2.x.f28621h;
            g8 g8VarA2 = i8.a(j11, j15, j15, j15, j15, sVar);
            sVar = sVar;
            z1.r rVarG2 = j0.e2.g(j0.e2.e(oVar, 1.0f), 36);
            if ((i17 & 458752) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((i17 & 29360128) == 8388608) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z23 = z16 | z17;
            if ((i17 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z23 | z18;
            objQ3 = sVar.Q();
            if (z19) {
                f16 = f15;
                objQ3 = new dt.p1(f16, cVar, dVar, 2);
                sVar.o0(objQ3);
            } else {
                f16 = f15;
                objQ3 = new dt.p1(f16, cVar, dVar, 2);
                sVar.o0(objQ3);
            }
            float f22 = f16;
            o8.a(fK, (fz.c) objQ3, rVarG2, false, null, g8VarA2, iVar3, i11, t1.e.d(243523307, new dt.r0(j11, 1), sVar), t1.e.d(-757532564, new t4(jC2, j11, fK3), sVar), dVar, sVar, ((r3 << 9) & 29360128) | 907542912, (i17 >> 9) & 14, 24);
            if (z15) {
                sVar.d0(-750214816);
                j0.c.g(sVar, j0.e2.g(oVar, 10));
                z1.r rVarE6 = j0.e2.e(oVar, 1.0f);
                j0.a2 a2VarA4 = j0.z1.a(j0.i.f35309g, z1.c.L, sVar, 6);
                iHashCode3 = Long.hashCode(sVar.T);
                l1.q1 q1VarL6 = sVar.l();
                z1.r rVarC6 = z1.a.c(sVar, rVarE6);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, a2VarA4, sVar);
                l1.t.J(hVar2, q1VarL6, sVar);
                if (sVar.S) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                } else {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                }
                itO = com.google.android.material.datepicker.d.o(sVar, rVarC6, hVar4, 416487103, list);
                while (itO.hasNext()) {
                    iIntValue = ((Number) itO.next()).intValue();
                    if (iIntValue == hz.b.Q(fK)) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    String strValueOf2 = String.valueOf(iIntValue);
                    j3.y0 y0Var2 = (j3.y0) sVar.j(ua.f31167a);
                    long jA2 = fr.j3.A(14);
                    if (z21) {
                        sVar.d0(-254433775);
                        sVar.p(false);
                        j12 = j11;
                    } else {
                        sVar.d0(-254432394);
                        long j16 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s;
                        sVar.p(false);
                        j12 = j16;
                    }
                    l1.s sVar3 = sVar;
                    ua.b(strValueOf2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var2, j12, jA2, n3.s.f43178t, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar3, 0, 0, 65534);
                    sVar = sVar3;
                }
                z20 = true;
                com.google.android.material.datepicker.d.B(sVar, false, true, false);
            } else {
                z20 = true;
                sVar.d0(-809992333);
                sVar.p(false);
            }
            sVar.p(z20);
            z14 = z15;
            f13 = f22;
        } else {
            sVar.W();
            z14 = z12;
            f13 = f12;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: mt.u4
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l5.n(str, str2, f5, dVar, i11, f13, z14, cVar, (l1.n) obj, l1.t.M(i12 | 1), i13);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v2, types: [l1.n] */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r3v6, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void o(float f5, fz.c cVar, l1.n nVar, int i11) {
        int i12;
        fz.c cVar2;
        int i13;
        ?? r9;
        ?? r11;
        String strJ1;
        long j11;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-610753857);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.c(f5) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(cVar) ? 32 : 16;
        }
        int i14 = i12;
        if (sVar.T(i14 & 1, (i14 & 19) != 18)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = j0.c.C(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 14, 1);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarC);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, uVarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC2, sVar);
            ua.b(ub.a.e0(sVar, R.string.listen_along_audio_speed), null, 0L, 0L, null, n3.s.K, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 196608, 0, 131038);
            l1.s sVar2 = sVar;
            j0.c.g(sVar2, j0.e2.g(oVar, 12));
            j0.e eVar = j0.i.f35309g;
            float f11 = 1.0f;
            z1.r rVarE = j0.e2.e(oVar, 1.0f);
            j0.a2 a2VarA = j0.z1.a(eVar, z1.c.L, sVar2, 6);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, rVarE);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, a2VarA, sVar2);
            l1.t.J(hVar2, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar2);
            sVar2.d0(-1084921816);
            Iterator it = ns.o.L(Float.valueOf(0.6f), Float.valueOf(0.8f), Float.valueOf(1.0f), Float.valueOf(1.25f), Float.valueOf(1.5f)).iterator();
            ?? r12 = sVar2;
            while (it.hasNext()) {
                float fFloatValue = ((Number) it.next()).floatValue();
                if (fFloatValue == f11) {
                    strJ1 = "1.0";
                    r11 = 0;
                } else {
                    r11 = 0;
                    strJ1 = oz.q.j1(oz.q.j1(String.valueOf(fFloatValue), '0'), '.');
                }
                if (f5 == fFloatValue) {
                    r12.d0(372258949);
                    j11 = ((h1.s1) r12.j(h1.v1.f31180a)).f31017a;
                } else {
                    r12.d0(372260206);
                    j11 = ((h1.s1) r12.j(h1.v1.f31180a)).f31036s;
                }
                r12.p(r11);
                int i15 = ((i14 & 112) == 32 ? 1 : r11) | (r12.c(fFloatValue) ? 1 : 0);
                Object objQ = r12.Q();
                if (i15 != 0 || objQ == l1.m.f39353a) {
                    objQ = new f5(cVar, fFloatValue, r11);
                    r12.o0(objQ);
                }
                ?? r22 = r12;
                ua.b(strJ1, d0.n.o(oVar, r11, null, (fz.a) objQ, 15), j11, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, r22, 0, 0, 131064);
                it = it;
                r12 = r22;
                f11 = f11;
            }
            cVar2 = cVar;
            i13 = 0;
            com.google.android.material.datepicker.d.B(r12, false, true, true);
            r9 = r12;
        } else {
            cVar2 = cVar;
            i13 = 0;
            sVar.W();
            r9 = sVar;
        }
        l1.x1 x1VarT = r9.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new s4(f5, cVar2, i11, i13);
        }
    }

    public static final void p(float f5, fz.a aVar, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(77193615);
        if ((i11 & 6) == 0) {
            i12 = (sVar.c(f5) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(dVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            long j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31017a;
            r0.e eVarD = r0.f.d(24);
            z1.r rVarQ = z1.o.f58481a;
            z1.r rVarB = d2.h.b(j0.c.C(j0.e2.e(rVarQ, 1.0f), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2), eVarD);
            boolean zE = ((i12 & 14) == 4) | sVar.e(j11);
            Object objQ = sVar.Q();
            if (zE || objQ == l1.m.f39353a) {
                objQ = new iu.m(f5, 1, j11);
                sVar.o0(objQ);
            }
            z1.r rVarD = d2.h.d(rVarB, (fz.c) objQ);
            if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
                sVar.d0(1869066044);
                rVarQ = iu.k.q(((i12 << 9) & 57344) | 6, 7, aVar, sVar, rVarQ, false);
                sVar.p(false);
            } else {
                sVar.d0(1869157091);
                sVar.p(false);
            }
            z1.r rVarI = rVarD.i(rVarQ);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarI);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            hh.p0.x((i12 >> 6) & 14, dVar, sVar, true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w4(f5, aVar, dVar, i11, 0);
        }
    }

    public static final void q(float f5, fz.a aVar, l1.n nVar, int i11) {
        int i12;
        z1.r rVar;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1892669463);
        if ((i11 & 6) == 0) {
            i12 = (sVar.c(f5) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(aVar) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            float f11 = f41631e;
            z1.r rVarQ = z1.o.f58481a;
            z1.r rVarG = j0.e2.g(rVarQ, f11);
            boolean z11 = (i12 & 14) == 4;
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new iv.m(1, f5);
                sVar.o0(objQ);
            }
            z1.r rVarQ2 = g2.f0.q(rVarG, (fz.c) objQ);
            if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
                sVar.d0(185740596);
                rVar = rVarQ;
                rVarQ = iu.k.q(((i12 << 9) & 57344) | 6, 7, aVar, sVar, rVar, false);
                sVar.p(false);
            } else {
                rVar = rVarQ;
                sVar.d0(185831643);
                sVar.p(false);
            }
            z1.r rVarI = rVarQ2.i(rVarQ);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35307e, z1.c.M, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarI);
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
            l1.c3 c3Var = h1.v1.f31180a;
            ua.b("↖", null, ((h1.s1) sVar.j(c3Var)).f31017a, fr.j3.A(24), null, n3.s.H, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 199686, 0, 131026);
            j0.c.g(sVar, j0.e2.s(rVar, 14));
            ua.b(ub.a.e0(sVar, R.string.listen_along_start_here), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar.j(fc.f30256a)).f30175h, ((h1.s1) sVar.j(c3Var)).f31017a, 0L, n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777210), sVar, 0, 0, 65534);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new s4(f5, aVar, i11, 1);
        }
    }

    public static final void r(rt.d5 d5Var, rt.w4 w4Var, fz.a aVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(675010782);
        int i12 = (sVar.f(d5Var) ? 4 : 2) | i11 | (sVar.d(w4Var.ordinal()) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            k7.d(d0.n.o(j0.e2.e(z1.o.f58481a, 1.0f), false, null, aVar, 15), r0.f.d(6), k7.p(((h1.s1) sVar.j(h1.v1.f31180a)).f31033p, sVar, 0), k7.q(62, 0), null, t1.e.d(-811895344, new defpackage.d(d5Var, aVar, w4Var, 14), sVar), sVar, 196608, 16);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fp.e(d5Var, w4Var, aVar, i11, 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:123:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:124:0x0300  */
    /* JADX WARN: Code duplicated, block: B:129:0x031b  */
    /* JADX WARN: Code duplicated, block: B:132:0x032c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0352  */
    /* JADX WARN: Code duplicated, block: B:135:0x0356  */
    /* JADX WARN: Code duplicated, block: B:140:0x0371  */
    /* JADX WARN: Code duplicated, block: B:142:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:144:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:145:0x03df  */
    /* JADX WARN: Code duplicated, block: B:151:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:155:0x0427  */
    /* JADX WARN: Code duplicated, block: B:156:0x0429  */
    /* JADX WARN: Code duplicated, block: B:159:0x0438  */
    public static final void s(rt.b5 b5Var, fz.a aVar, fz.a aVar2, fz.c cVar, fz.c cVar2, fz.a aVar3, fz.a aVar4, fz.a aVar5, l1.n nVar, int i11) {
        boolean z11;
        boolean z12;
        l1.b1 b1Var;
        l1.g gVar;
        float f5;
        boolean z13;
        l1.b1 b1Var2;
        y2.i iVar;
        y2.h hVar;
        l1.g gVar2;
        y2.i iVar2;
        l1.s sVar;
        int iHashCode;
        boolean z14;
        boolean zC;
        Object objQ;
        l1.g gVar3;
        l1.s sVar2;
        boolean z15;
        boolean z16;
        Object objQ2;
        int iHashCode2;
        fz.c cVar3 = cVar2;
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(774986276);
        int i12 = (i11 & 6) == 0 ? (sVar3.h(b5Var) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar3.h(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar3.h(aVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar3.h(cVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar3.h(cVar3) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar3.h(aVar3) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar3.h(aVar4) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar3.h(aVar5) ? 8388608 : 4194304;
        }
        if (sVar3.T(i12 & 1, (4793491 & i12) != 4793490)) {
            List list = b5Var.f49510c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((rt.d5) obj).f49618f) {
                    arrayList.add(obj);
                }
            }
            boolean zIsEmpty = arrayList.isEmpty();
            boolean z17 = !zIsEmpty;
            if (zIsEmpty) {
                z11 = false;
            } else {
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj2 = arrayList.get(i13);
                            i13++;
                            if (!((rt.d5) obj2).f49619g) {
                                z11 = false;
                            }
                        }
                    }
                }
                z11 = true;
            }
            v3.c cVar4 = (v3.c) sVar3.j(z2.g1.f58547h);
            Object objQ3 = sVar3.Q();
            l1.g gVar4 = l1.m.f39353a;
            if (objQ3 == gVar4) {
                objQ3 = l1.t.B(Boolean.FALSE);
                sVar3.o0(objQ3);
            }
            l1.b1 b1Var3 = (l1.b1) objQ3;
            Object objQ4 = sVar3.Q();
            if (objQ4 == gVar4) {
                objQ4 = ep.a.r(0, sVar3);
            }
            l1.b1 b1Var4 = (l1.b1) objQ4;
            float f11 = 16;
            float fQ = cVar4.Q(cVar4.n0(f11) + ((Number) b1Var4.getValue()).intValue());
            if (((Boolean) b1Var3.getValue()).booleanValue()) {
                sVar3.d0(-2127135606);
                Object objQ5 = sVar3.Q();
                if (objQ5 == gVar4) {
                    objQ5 = new n4(2, b1Var3);
                    sVar3.o0(objQ5);
                }
                b1Var = b1Var3;
                f5 = f11;
                z12 = z17;
                gVar = gVar4;
                z13 = false;
                h1.a6.a((fz.a) objQ5, null, h1.a6.f(6, 2, null, sVar3), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-1419642084, new fu.f0(2, aVar2, b1Var3), sVar3), sVar3, 6, 384, 4090);
                sVar3 = sVar3;
            } else {
                z12 = z17;
                b1Var = b1Var3;
                gVar = gVar4;
                f5 = f11;
                z13 = false;
                sVar3.d0(-2140087778);
            }
            sVar3.p(z13);
            Boolean boolValueOf = Boolean.valueOf(b5Var.f49509b);
            Boolean bool = (Boolean) b1Var.getValue();
            bool.getClass();
            boolean zH = sVar3.h(b5Var);
            Object objQ6 = sVar3.Q();
            if (zH || objQ6 == gVar) {
                b1Var2 = b1Var;
                objQ6 = new iv.h0(22, b5Var, b1Var2, null);
                sVar3.o0(objQ6);
            } else {
                b1Var2 = b1Var;
            }
            l1.t.g(boolValueOf, bool, (fz.e) objQ6, sVar3);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarD = j0.e2.d(oVar, 1.0f);
            l1.c3 c3Var = h1.v1.f31180a;
            z1.r rVarH = d0.n.h(rVarD, ((h1.s1) sVar3.j(c3Var)).f31031n, g2.f0.f28556b);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar3, 0);
            int iHashCode3 = Long.hashCode(sVar3.T);
            l1.q1 q1VarL = sVar3.l();
            z1.r rVarC = z1.a.c(sVar3, rVarH);
            y2.k.J.getClass();
            l1.b1 b1Var5 = b1Var2;
            y2.i iVar3 = y2.j.f56913b;
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar3);
            } else {
                sVar3.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, uVarA, sVar3);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar3);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar3.S) {
                iVar = iVar3;
            } else {
                iVar = iVar3;
                if (!kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                }
                hVar = y2.j.f56915d;
                l1.t.J(hVar, rVarC, sVar3);
                gVar2 = gVar;
                iVar2 = iVar;
                sVar = sVar3;
                iu.k.g(aVar, null, j.f41558a, null, t1.e.d(1044949273, new b5(z11, aVar4, aVar3, z12), sVar3), null, null, null, sVar, ((i12 >> 3) & 14) | 24960, 234);
                k7.g(null, 1, g2.x.f28621h, sVar, 432, 1);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                j0.i1 i1Var = new j0.i1(1.0f, true);
                w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, i1Var);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar2, q0VarD, sVar);
                l1.t.J(hVar3, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                }
                l1.t.J(hVar, rVarC2, sVar);
                if (b5Var.f49510c.isEmpty()) {
                    sVar.d0(-573245167);
                    z1.r rVarD2 = j0.e2.d(oVar, 1.0f);
                    w2.q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
                    iHashCode2 = Long.hashCode(sVar.T);
                    l1.q1 q1VarL3 = sVar.l();
                    z1.r rVarC3 = z1.a.c(sVar, rVarD2);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar2, q0VarD2, sVar);
                    l1.t.J(hVar3, q1VarL3, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
                    }
                    l1.t.J(hVar, rVarC3, sVar);
                    ua.b(ub.a.e0(sVar, R.string.srs_future_reviews_tab_empty), null, ((h1.s1) sVar.j(c3Var)).f31036s, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131066);
                    sVar2 = sVar;
                    sVar2.p(true);
                    z15 = false;
                    sVar2.p(false);
                    cVar3 = cVar2;
                    gVar3 = gVar2;
                } else {
                    sVar.d0(-572883707);
                    z1.r rVarC4 = j0.c.C(j0.e2.d(oVar, 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    j0.g gVarG = j0.i.g(12);
                    boolean zH2 = sVar.h(b5Var);
                    if ((i12 & 57344) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zC = zH2 | z14 | sVar.c(fQ);
                    objQ = sVar.Q();
                    gVar3 = gVar2;
                    if (!zC || objQ == gVar3) {
                        cVar3 = cVar2;
                        objQ = new g0.h(b5Var, cVar3, b1Var5, fQ);
                        sVar.o0(objQ);
                    } else {
                        cVar3 = cVar2;
                    }
                    ue.f.a(rVarC4, null, null, gVarG, null, null, false, null, (fz.c) objQ, sVar, 24582, 494);
                    sVar2 = sVar;
                    z15 = false;
                    sVar2.p(false);
                }
                rt.w4 w4Var = b5Var.f49511d;
                int i14 = b5Var.f49517j;
                if (b5Var.f49516i != null) {
                    z16 = true;
                } else {
                    z16 = z15;
                }
                z1.r rVarA = j0.r.f35391a.a(oVar, z1.c.H);
                objQ2 = sVar2.Q();
                if (objQ2 == gVar3) {
                    objQ2 = new p(11, b1Var4);
                    sVar2.o0(objQ2);
                }
                z1.r rVarO = w2.a0.o(rVarA, (fz.c) objQ2);
                int i15 = i12;
                l1.s sVar4 = sVar2;
                c(w4Var, i14, z16, cVar, aVar5, rVarO, sVar4, (i15 & 7168) | ((i15 >> 9) & 57344));
                sVar3 = sVar4;
                sVar3.p(true);
                sVar3.p(true);
            }
            defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar4);
            hVar = y2.j.f56915d;
            l1.t.J(hVar, rVarC, sVar3);
            gVar2 = gVar;
            iVar2 = iVar;
            sVar = sVar3;
            iu.k.g(aVar, null, j.f41558a, null, t1.e.d(1044949273, new b5(z11, aVar4, aVar3, z12), sVar3), null, null, null, sVar, ((i12 >> 3) & 14) | 24960, 234);
            k7.g(null, 1, g2.x.f28621h, sVar, 432, 1);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.i1 i1Var2 = new j0.i1(1.0f, true);
            w2.q0 q0VarD3 = j0.o.d(z1.c.f58463a, false);
            iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL4 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, i1Var2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, q0VarD3, sVar);
            l1.t.J(hVar3, q1VarL4, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            l1.t.J(hVar, rVarC5, sVar);
            if (b5Var.f49510c.isEmpty()) {
                sVar.d0(-573245167);
                z1.r rVarD3 = j0.e2.d(oVar, 1.0f);
                w2.q0 q0VarD4 = j0.o.d(z1.c.f58467e, false);
                iHashCode2 = Long.hashCode(sVar.T);
                l1.q1 q1VarL5 = sVar.l();
                z1.r rVarC6 = z1.a.c(sVar, rVarD3);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar2, q0VarD4, sVar);
                l1.t.J(hVar3, q1VarL5, sVar);
                if (sVar.S) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
                } else {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
                }
                l1.t.J(hVar, rVarC6, sVar);
                ua.b(ub.a.e0(sVar, R.string.srs_future_reviews_tab_empty), null, ((h1.s1) sVar.j(c3Var)).f31036s, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131066);
                sVar2 = sVar;
                sVar2.p(true);
                z15 = false;
                sVar2.p(false);
                cVar3 = cVar2;
                gVar3 = gVar2;
            } else {
                sVar.d0(-572883707);
                z1.r rVarC7 = j0.c.C(j0.e2.d(oVar, 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                j0.g gVarG2 = j0.i.g(12);
                boolean zH3 = sVar.h(b5Var);
                if ((i12 & 57344) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zC = zH3 | z14 | sVar.c(fQ);
                objQ = sVar.Q();
                gVar3 = gVar2;
                if (zC) {
                    cVar3 = cVar2;
                    objQ = new g0.h(b5Var, cVar3, b1Var5, fQ);
                    sVar.o0(objQ);
                } else {
                    cVar3 = cVar2;
                    objQ = new g0.h(b5Var, cVar3, b1Var5, fQ);
                    sVar.o0(objQ);
                }
                ue.f.a(rVarC7, null, null, gVarG2, null, null, false, null, (fz.c) objQ, sVar, 24582, 494);
                sVar2 = sVar;
                z15 = false;
                sVar2.p(false);
            }
            rt.w4 w4Var2 = b5Var.f49511d;
            int i16 = b5Var.f49517j;
            if (b5Var.f49516i != null) {
                z16 = true;
            } else {
                z16 = z15;
            }
            z1.r rVarA2 = j0.r.f35391a.a(oVar, z1.c.H);
            objQ2 = sVar2.Q();
            if (objQ2 == gVar3) {
                objQ2 = new p(11, b1Var4);
                sVar2.o0(objQ2);
            }
            z1.r rVarO2 = w2.a0.o(rVarA2, (fz.c) objQ2);
            int i17 = i12;
            l1.s sVar5 = sVar2;
            c(w4Var2, i16, z16, cVar, aVar5, rVarO2, sVar5, (i17 & 7168) | ((i17 >> 9) & 57344));
            sVar3 = sVar5;
            sVar3.p(true);
            sVar3.p(true);
        } else {
            sVar3.W();
        }
        l1.x1 x1VarT = sVar3.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.m1(b5Var, aVar, aVar2, cVar, cVar3, aVar3, aVar4, aVar5, i11);
        }
    }

    public static final String t(int i11, Object[] objArr, l1.n nVar) {
        String strE0 = ub.a.e0(nVar, i11);
        oz.o oVar = new oz.o("%(\\d+\\$)?@");
        l1.s sVar = (l1.s) nVar;
        Object objQ = sVar.Q();
        if (objQ == l1.m.f39353a) {
            objQ = new lt.d(27);
            sVar.o0(objQ);
        }
        String strH = oVar.h(strE0, (fz.c) objQ);
        Locale locale = Locale.getDefault();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, strH, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final String u(float f5) {
        return f5 % 1.0f == CropImageView.DEFAULT_ASPECT_RATIO ? String.valueOf(hz.b.Q(f5)) : String.format(Locale.ROOT, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f5)}, 1));
    }

    public static final void k(fz.a onBackClick, fz.a goBilling, rt.r5 r5Var, l1.n nVar, int i11) {
        rt.r5 r5Var2;
        int i12;
        rt.r5 r5Var3;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(goBilling, "goBilling");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1912196379);
        int i13 = i11 | (sVar.h(onBackClick) ? 4 : 2) | (sVar.h(goBilling) ? 32 : 16) | 128;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(rt.r5.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-897);
                r5Var3 = (rt.r5) viewModelA;
            } else {
                sVar.W();
                i12 = i13 & (-897);
                r5Var3 = r5Var;
            }
            sVar.q();
            l1.b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(r5Var3.N, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7);
            View view = (View) sVar.j(AndroidCompositionLocals_androidKt.f1204f);
            rt.c5 c5Var = (rt.c5) b3VarCollectAsStateWithLifecycle.getValue();
            rt.b5 b5Var = c5Var instanceof rt.b5 ? (rt.b5) c5Var : null;
            rt.v4 v4Var = b5Var != null ? b5Var.f49515h : null;
            int i14 = v4Var == null ? -1 : k5.f41596a[v4Var.ordinal()];
            boolean z11 = i14 == 1 || i14 == 2;
            Boolean boolValueOf = Boolean.valueOf(z11);
            boolean zH = sVar.h(view) | sVar.g(z11);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new x4(view, z11, 0);
                sVar.o0(objQ);
            }
            l1.t.d(view, boolValueOf, (fz.c) objQ, sVar);
            rt.c5 c5Var2 = (rt.c5) b3VarCollectAsStateWithLifecycle.getValue();
            boolean zH2 = sVar.h(r5Var3);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                c4 c4Var = new c4(1, r5Var3, rt.r5.class, "selectResourceMode", "selectResourceMode(Lcom/lingodeer/course/viewmodels/CourseListenAlongResourceMode;)V", 0, 10);
                sVar.o0(c4Var);
                objQ2 = c4Var;
            }
            fz.c cVar = (fz.c) ((mz.e) objQ2);
            boolean zH3 = sVar.h(r5Var3);
            Object objQ3 = sVar.Q();
            if (zH3 || objQ3 == gVar) {
                c4 c4Var2 = new c4(1, r5Var3, rt.r5.class, "toggleUnit", "toggleUnit(J)V", 0, 11);
                sVar.o0(c4Var2);
                objQ3 = c4Var2;
            }
            fz.c cVar2 = (fz.c) ((mz.e) objQ3);
            boolean zH4 = sVar.h(r5Var3);
            Object objQ4 = sVar.Q();
            if (zH4 || objQ4 == gVar) {
                j5 j5Var = new j5(0, r5Var3, rt.r5.class, "selectAllUnits", "selectAllUnits()V", 0, 1);
                sVar.o0(j5Var);
                objQ4 = j5Var;
            }
            fz.a aVar = (fz.a) ((mz.e) objQ4);
            boolean zH5 = sVar.h(r5Var3);
            Object objQ5 = sVar.Q();
            if (zH5 || objQ5 == gVar) {
                j5 j5Var2 = new j5(0, r5Var3, rt.r5.class, "deselectAllUnits", "deselectAllUnits()V", 0, 2);
                sVar.o0(j5Var2);
                objQ5 = j5Var2;
            }
            fz.a aVar2 = (fz.a) ((mz.e) objQ5);
            boolean zH6 = sVar.h(r5Var3);
            Object objQ6 = sVar.Q();
            if (zH6 || objQ6 == gVar) {
                j5 j5Var3 = new j5(0, r5Var3, rt.r5.class, "playSelected", "playSelected()V", 0, 3);
                sVar.o0(j5Var3);
                objQ6 = j5Var3;
            }
            fz.a aVar3 = (fz.a) ((mz.e) objQ6);
            boolean zH7 = sVar.h(r5Var3);
            Object objQ7 = sVar.Q();
            if (zH7 || objQ7 == gVar) {
                j5 j5Var4 = new j5(0, r5Var3, rt.r5.class, "togglePlayPause", "togglePlayPause()V", 0, 4);
                sVar.o0(j5Var4);
                objQ7 = j5Var4;
            }
            fz.a aVar4 = (fz.a) ((mz.e) objQ7);
            boolean zH8 = sVar.h(r5Var3);
            Object objQ8 = sVar.Q();
            if (zH8 || objQ8 == gVar) {
                objQ8 = new c4(1, r5Var3, rt.r5.class, "startFrom", "startFrom(I)V", 0, 12);
                sVar.o0(objQ8);
            }
            fz.c cVar3 = (fz.c) ((mz.e) objQ8);
            boolean zH9 = sVar.h(r5Var3);
            Object objQ9 = sVar.Q();
            if (zH9 || objQ9 == gVar) {
                c4 c4Var3 = new c4(1, r5Var3, rt.r5.class, "updatePlaybackMode", "updatePlaybackMode(Lcom/lingodeer/course/viewmodels/CourseListenAlongPlaybackMode;)V", 0, 13);
                sVar.o0(c4Var3);
                objQ9 = c4Var3;
            }
            fz.c cVar4 = (fz.c) ((mz.e) objQ9);
            boolean zH10 = sVar.h(r5Var3);
            Object objQ10 = sVar.Q();
            if (zH10 || objQ10 == gVar) {
                c4 c4Var4 = new c4(1, r5Var3, rt.r5.class, "updateScriptStyle", "updateScriptStyle(I)V", 0, 1);
                sVar.o0(c4Var4);
                objQ10 = c4Var4;
            }
            fz.c cVar5 = (fz.c) ((mz.e) objQ10);
            boolean zH11 = sVar.h(r5Var3);
            Object objQ11 = sVar.Q();
            if (zH11 || objQ11 == gVar) {
                bt.y2 y2Var = new bt.y2(0, r5Var3, rt.r5.class, "updateScriptShortcutDisplay", "updateScriptShortcutDisplay()V", 0, 28);
                sVar.o0(y2Var);
                objQ11 = y2Var;
            }
            fz.a aVar5 = (fz.a) ((mz.e) objQ11);
            boolean zH12 = sVar.h(r5Var3);
            Object objQ12 = sVar.Q();
            if (zH12 || objQ12 == gVar) {
                c4 c4Var5 = new c4(1, r5Var3, rt.r5.class, "updateSleepTimer", "updateSleepTimer(Lcom/lingodeer/course/viewmodels/CourseListenAlongSleepTimer;)V", 0, 2);
                sVar.o0(c4Var5);
                objQ12 = c4Var5;
            }
            fz.c cVar6 = (fz.c) ((mz.e) objQ12);
            boolean zH13 = sVar.h(r5Var3);
            Object objQ13 = sVar.Q();
            if (zH13 || objQ13 == gVar) {
                c4 c4Var6 = new c4(1, r5Var3, rt.r5.class, "updateShowNativeTranslation", "updateShowNativeTranslation(Z)V", 0, 3);
                sVar.o0(c4Var6);
                objQ13 = c4Var6;
            }
            fz.c cVar7 = (fz.c) ((mz.e) objQ13);
            boolean zH14 = sVar.h(r5Var3);
            Object objQ14 = sVar.Q();
            if (zH14 || objQ14 == gVar) {
                c4 c4Var7 = new c4(1, r5Var3, rt.r5.class, "updateRandomOrder", "updateRandomOrder(Z)V", 0, 4);
                sVar.o0(c4Var7);
                objQ14 = c4Var7;
            }
            fz.c cVar8 = (fz.c) ((mz.e) objQ14);
            boolean zH15 = sVar.h(r5Var3);
            Object objQ15 = sVar.Q();
            if (zH15 || objQ15 == gVar) {
                c4 c4Var8 = new c4(1, r5Var3, rt.r5.class, "updateLoop", "updateLoop(Z)V", 0, 5);
                sVar.o0(c4Var8);
                objQ15 = c4Var8;
            }
            fz.c cVar9 = (fz.c) ((mz.e) objQ15);
            boolean zH16 = sVar.h(r5Var3);
            Object objQ16 = sVar.Q();
            if (zH16 || objQ16 == gVar) {
                c4 c4Var9 = new c4(1, r5Var3, rt.r5.class, "updateAudioSpeed", "updateAudioSpeed(F)V", 0, 6);
                sVar.o0(c4Var9);
                objQ16 = c4Var9;
            }
            fz.c cVar10 = (fz.c) ((mz.e) objQ16);
            boolean zH17 = sVar.h(r5Var3);
            Object objQ17 = sVar.Q();
            if (zH17 || objQ17 == gVar) {
                c4 c4Var10 = new c4(1, r5Var3, rt.r5.class, "updatePlaysPerItem", "updatePlaysPerItem(I)V", 0, 7);
                sVar.o0(c4Var10);
                objQ17 = c4Var10;
            }
            fz.c cVar11 = (fz.c) ((mz.e) objQ17);
            boolean zH18 = sVar.h(r5Var3);
            Object objQ18 = sVar.Q();
            if (zH18 || objQ18 == gVar) {
                c4 c4Var11 = new c4(1, r5Var3, rt.r5.class, "updatePauseBetweenRepetitions", "updatePauseBetweenRepetitions(F)V", 0, 8);
                sVar.o0(c4Var11);
                objQ18 = c4Var11;
            }
            fz.c cVar12 = (fz.c) ((mz.e) objQ18);
            boolean zH19 = sVar.h(r5Var3);
            Object objQ19 = sVar.Q();
            if (zH19 || objQ19 == gVar) {
                c4 c4Var12 = new c4(1, r5Var3, rt.r5.class, "updatePauseBetweenItems", ealNNtLp.iGGsFTmQB, 0, 9);
                sVar.o0(c4Var12);
                objQ19 = c4Var12;
            }
            fz.c cVar13 = (fz.c) ((mz.e) objQ19);
            boolean zH20 = sVar.h(r5Var3);
            Object objQ20 = sVar.Q();
            if (zH20 || objQ20 == gVar) {
                bt.y2 y2Var2 = new bt.y2(0, r5Var3, rt.r5.class, "onSettingsShown", "onSettingsShown()V", 0, 29);
                sVar.o0(y2Var2);
                objQ20 = y2Var2;
            }
            fz.a aVar6 = (fz.a) ((mz.e) objQ20);
            boolean zH21 = sVar.h(r5Var3);
            Object objQ21 = sVar.Q();
            if (zH21 || objQ21 == gVar) {
                j5 j5Var5 = new j5(0, r5Var3, rt.r5.class, "onSettingsDismissed", "onSettingsDismissed()V", 0, 0);
                sVar.o0(j5Var5);
                objQ21 = j5Var5;
            }
            l(c5Var2, onBackClick, goBilling, cVar, cVar2, aVar, aVar2, aVar3, aVar4, cVar3, cVar4, cVar5, aVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, aVar6, (fz.a) ((mz.e) objQ21), sVar, (i12 << 3) & 1008);
            sVar = sVar;
            r5Var2 = r5Var3;
        } else {
            sVar.W();
            r5Var2 = r5Var;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fp.e(onBackClick, goBilling, (ViewModel) r5Var2, i11, 29);
        }
    }
}
