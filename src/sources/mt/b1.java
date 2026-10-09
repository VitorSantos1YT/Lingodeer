package mt;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.i9;
import h1.k7;
import h1.ua;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import rt.ke;
import rt.me;
import rt.oe;
import rt.ue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f41269a = 4;

    public static final void a(l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(155276013);
        if (sVar.T(i11 & 1, i11 != 0)) {
            h1.r4.b(se.k.y(R.drawable.edit_24px, sVar, 0), null, j0.e2.n(z1.o.f58481a, 16), g2.x.c(((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, 0.7f), sVar, 432, 0);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k(i11);
        }
    }

    public static final void b(int i11, String str, l1.n nVar, z1.r rVar) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1196896360);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.f(str) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(rVar) ? 32 : 16;
        }
        int i13 = i12;
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            z1.r rVarD = j0.e2.d(rVar, 1.0f);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarD);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            z1.h hVar5 = z1.c.P;
            j0.g gVarG = j0.i.g(12);
            z1.r rVarC2 = j0.c.C(z1.o.f58481a, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.u uVarA = j0.t.a(gVarG, hVar5, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarC2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            d0.n.c(se.k.y(R.drawable.ic_lesson_exam_empty, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
            ua.b(str, null, ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30178k, sVar, i13 & 14, 0, 65530);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iv.u0(str, rVar, i11, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00de  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:0x014a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0150  */
    /* JADX WARN: Code duplicated, block: B:57:0x0194  */
    /* JADX WARN: Code duplicated, block: B:59:0x0198  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void c(WordSentenceCharacterType wordSentenceCharacterType, boolean z11, z1.r rVar, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVar2;
        boolean z12;
        l1.s sVar;
        z1.r rVar3;
        l1.x1 x1VarT;
        long jC;
        long j11;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-902790419);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.h(wordSentenceCharacterType) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.g(z11) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 == 0) {
            if ((i11 & 384) == 0) {
                rVar2 = rVar;
                i13 |= sVar2.f(rVar2) ? 256 : 128;
            }
            if ((i13 & 147) != 146) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar2.T(i13 & 1, z12)) {
                if (i14 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (z11) {
                    sVar2.d0(56029960);
                    jC = g2.x.c(((h1.s1) sVar2.j(h1.v1.f31180a)).f31036s, 0.7f);
                    sVar2.p(false);
                } else {
                    sVar2.d0(56111490);
                    jC = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31034q;
                    sVar2.p(false);
                }
                j11 = jC;
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL = sVar2.l();
                z1.r rVarC = z1.a.c(sVar2, rVar3);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar2);
                if (wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType) {
                    sVar2.d0(-1346618111);
                    ua.b(((WordSentenceCharacterType.WordType) wordSentenceCharacterType).getWord().getWord(), null, j11, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, ((dc) sVar2.j(fc.f30256a)).f30175h, sVar2, 0, 3120, 55290);
                    sVar = sVar2;
                    sVar.p(false);
                } else if (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) {
                    sVar2.d0(-1346263781);
                    ua.b(((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType).getSentence().getSentence(), null, j11, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, ((dc) sVar2.j(fc.f30256a)).f30177j, sVar2, 0, 3120, 55290);
                    sVar = sVar2;
                    sVar.p(false);
                } else {
                    if (wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType) {
                        throw nv.p.x(sVar2, -1151819504, false);
                    }
                    sVar2.d0(-1345902569);
                    ua.b(((WordSentenceCharacterType.CharacterType) wordSentenceCharacterType).getCharacter().getCharacter(), null, j11, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, ((dc) sVar2.j(fc.f30256a)).f30175h, sVar2, 0, 3120, 55290);
                    sVar = sVar2;
                    sVar.p(false);
                }
                sVar.p(true);
            } else {
                sVar = sVar2;
                sVar.W();
                rVar3 = rVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new dt.i(wordSentenceCharacterType, z11, rVar3, i11, i12);
            }
        }
        i13 |= 384;
        rVar2 = rVar;
        if ((i13 & 147) != 146) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (sVar2.T(i13 & 1, z12)) {
            if (i14 != 0) {
                rVar3 = z1.o.f58481a;
            } else {
                rVar3 = rVar2;
            }
            if (z11) {
                sVar2.d0(56029960);
                jC = g2.x.c(((h1.s1) sVar2.j(h1.v1.f31180a)).f31036s, 0.7f);
                sVar2.p(false);
            } else {
                sVar2.d0(56111490);
                jC = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31034q;
                sVar2.p(false);
            }
            j11 = jC;
            j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
            iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVar3);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA2, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
            hVar = y2.j.f56918g;
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar2);
            if (wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType) {
                sVar2.d0(-1346618111);
                ua.b(((WordSentenceCharacterType.WordType) wordSentenceCharacterType).getWord().getWord(), null, j11, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, ((dc) sVar2.j(fc.f30256a)).f30175h, sVar2, 0, 3120, 55290);
                sVar = sVar2;
                sVar.p(false);
            } else if (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) {
                sVar2.d0(-1346263781);
                ua.b(((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType).getSentence().getSentence(), null, j11, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, ((dc) sVar2.j(fc.f30256a)).f30177j, sVar2, 0, 3120, 55290);
                sVar = sVar2;
                sVar.p(false);
            } else {
                if (wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType) {
                    throw nv.p.x(sVar2, -1151819504, false);
                }
                sVar2.d0(-1345902569);
                ua.b(((WordSentenceCharacterType.CharacterType) wordSentenceCharacterType).getCharacter().getCharacter(), null, j11, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, ((dc) sVar2.j(fc.f30256a)).f30175h, sVar2, 0, 3120, 55290);
                sVar = sVar2;
                sVar.p(false);
            }
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
            rVar3 = rVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.i(wordSentenceCharacterType, z11, rVar3, i11, i12);
        }
    }

    public static final void d(WordSentenceCharacterType wordSentenceCharacterType, boolean z11, boolean z12, z1.r rVar, l1.n nVar, int i11) {
        l1.x1 x1VarT;
        n0 n0Var;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1891450794);
        int i12 = i11 | (sVar.h(wordSentenceCharacterType) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.g(z12) ? 256 : 128) | (sVar.f(rVar) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            if (z12) {
                sVar.d0(-1764299368);
                sVar.p(false);
                Object objQ = sVar.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = u0.f41936a;
                    sVar.o0(objQ);
                }
                w2.q0 q0Var = (w2.q0) objQ;
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
                l1.t.J(y2.j.f56917f, q0Var, sVar);
                l1.t.J(y2.j.f56916e, q1VarL, sVar);
                y2.h hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar);
                f(null, sVar, 0);
                c(wordSentenceCharacterType, z11, null, sVar, i12 & 126, 4);
                sVar.p(true);
            } else {
                sVar.d0(-1760104758);
                c(wordSentenceCharacterType, z11, rVar, sVar, (i12 & 126) | ((i12 >> 3) & 896), 0);
                sVar.p(false);
                x1VarT = sVar.t();
                if (x1VarT == null) {
                    return;
                } else {
                    n0Var = new n0(wordSentenceCharacterType, z11, z12, rVar, i11, 0);
                }
            }
            x1VarT.f39502d = n0Var;
        }
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            n0Var = new n0(wordSentenceCharacterType, z11, z12, rVar, i11, 1);
            x1VarT.f39502d = n0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:64:0x0127  */
    /* JADX WARN: Code duplicated, block: B:66:0x0162  */
    /* JADX WARN: Code duplicated, block: B:69:0x016d  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void e(oe oeVar, boolean z11, boolean z12, fz.c cVar, fz.a aVar, z1.r rVar, j0.v1 v1Var, l1.n nVar, int i11, int i12) {
        z1.r rVar2;
        int i13;
        boolean z13;
        boolean z14;
        l1.s sVar;
        z1.r rVar3;
        l1.x1 x1VarT;
        z1.r rVarZ;
        z1.r rVar4;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        rt.c1 c1Var = oeVar.f50221b;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(191046620);
        int i14 = i11 | (sVar2.h(oeVar) ? 4 : 2) | (sVar2.g(z11) ? 32 : 16) | (sVar2.g(z12) ? 256 : 128) | (sVar2.h(cVar) ? 2048 : 1024) | (sVar2.h(aVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        int i15 = i12 & 32;
        if (i15 == 0) {
            if ((i11 & 196608) == 0) {
                rVar2 = rVar;
                i14 |= sVar2.f(rVar2) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
            }
            i13 = i14;
            z13 = false;
            if ((599187 & i13) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (sVar2.T(i13 & 1, z14)) {
                rVarZ = z1.o.f58481a;
                if (i15 != 0) {
                    rVar4 = rVarZ;
                } else {
                    rVar4 = rVar2;
                }
                boolean zIsExcludedFromReview = c1Var.f49553a.isExcludedFromReview();
                if (oeVar.f50223d && !zIsExcludedFromReview) {
                    z13 = true;
                }
                z1.i iVar2 = z1.c.M;
                z1.r rVarE = j0.e2.e(rVar4, 1.0f);
                if (!z13) {
                    rVarZ = j0.c.z(rVarZ, v1Var);
                }
                z1.r rVarI = rVarE.i(rVarZ);
                j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, iVar2, sVar2, 48);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL = sVar2.l();
                z1.r rVarC = z1.a.c(sVar2, rVarI);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar2);
                h1.e1.a(z11, cVar, null, z12, null, sVar2, ((i13 >> 3) & 14) | ((i13 >> 6) & 112) | ((i13 << 3) & 7168), 52);
                WordSentenceCharacterType wordSentenceCharacterType = c1Var.f49556d;
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                d(wordSentenceCharacterType, zIsExcludedFromReview, z13, new j0.i1(1.0f, true), sVar2, 0);
                k7.m(aVar, null, false, null, null, null, t1.e.d(1461833627, new gs.m(oeVar, zIsExcludedFromReview, 2), sVar2), sVar2, ((i13 >> 12) & 14) | 805306368, 510);
                sVar = sVar2;
                sVar.p(true);
                rVar3 = rVar4;
            } else {
                sVar = sVar2;
                sVar.W();
                rVar3 = rVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new in.g(oeVar, z11, z12, cVar, aVar, rVar3, v1Var, i11, i12);
            }
        }
        i14 |= 196608;
        rVar2 = rVar;
        i13 = i14;
        z13 = false;
        if ((599187 & i13) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (sVar2.T(i13 & 1, z14)) {
            rVarZ = z1.o.f58481a;
            if (i15 != 0) {
                rVar4 = rVarZ;
            } else {
                rVar4 = rVar2;
            }
            boolean zIsExcludedFromReview2 = c1Var.f49553a.isExcludedFromReview();
            if (oeVar.f50223d) {
                z13 = true;
            }
            z1.i iVar3 = z1.c.M;
            z1.r rVarE2 = j0.e2.e(rVar4, 1.0f);
            if (!z13) {
                rVarZ = j0.c.z(rVarZ, v1Var);
            }
            z1.r rVarI2 = rVarE2.i(rVarZ);
            j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, iVar3, sVar2, 48);
            iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarI2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA2, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
            hVar = y2.j.f56918g;
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar2);
            h1.e1.a(z11, cVar, null, z12, null, sVar2, ((i13 >> 3) & 14) | ((i13 >> 6) & 112) | ((i13 << 3) & 7168), 52);
            WordSentenceCharacterType wordSentenceCharacterType2 = c1Var.f49556d;
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            d(wordSentenceCharacterType2, zIsExcludedFromReview2, z13, new j0.i1(1.0f, true), sVar2, 0);
            k7.m(aVar, null, false, null, null, null, t1.e.d(1461833627, new gs.m(oeVar, zIsExcludedFromReview2, 2), sVar2), sVar2, ((i13 >> 12) & 14) | 805306368, 510);
            sVar = sVar2;
            sVar.p(true);
            rVar3 = rVar4;
        } else {
            sVar = sVar2;
            sVar.W();
            rVar3 = rVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new in.g(oeVar, z11, z12, cVar, aVar, rVar3, v1Var, i11, i12);
        }
    }

    public static final void f(z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-903382040);
        int i12 = i11 | 6;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            float f5 = 0;
            float f11 = 12;
            r0.e eVarE = r0.f.e(f5, f5, f11, f11);
            long j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31021c;
            t1.d dVar = g.Y;
            z1.o oVar = z1.o.f58481a;
            i9.a(oVar, eVarE, j11, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, dVar, sVar, 12582918, 120);
            rVar = oVar;
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.g(rVar, i11, 13);
        }
    }

    public static final void g(oe oeVar, boolean z11, l1.n nVar, int i11) {
        String strN;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(658865842);
        int i12 = (sVar.h(oeVar) ? 4 : 2) | i11 | (sVar.g(z11) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            j0.a2 a2VarA = j0.z1.a(j0.i.g(6), z1.c.M, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, z1.o.f58481a);
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
            if (z11) {
                strN = ep.a.m(sVar, 1849655068, R.string.srs_future_reviews_hidden_label, sVar, false);
            } else {
                sVar.d0(1849747882);
                strN = n(sVar, oeVar.f50222c);
                sVar.p(false);
            }
            h(strN, sVar, 0);
            a(sVar, 0);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.g0(oeVar, z11, i11, 2);
        }
    }

    public static final void h(String str, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1609728022);
        int i12 = (sVar.f(str) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            i9.a(null, r0.f.a(), ((h1.s1) sVar.j(h1.v1.f31180a)).f31035r, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-212804069, new bp.e0(str, 20), sVar), sVar, 12582912, 121);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.e0(str, i11, 21);
        }
    }

    public static final void i(int i11, boolean z11, fz.a onAdjust, fz.a onHide, fz.a onShow, fz.a onCancel, z1.r rVar, l1.n nVar, int i12) {
        kotlin.jvm.internal.m.f(onAdjust, "onAdjust");
        kotlin.jvm.internal.m.f(onHide, "onHide");
        kotlin.jvm.internal.m.f(onShow, "onShow");
        kotlin.jvm.internal.m.f(onCancel, "onCancel");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-89318425);
        int i13 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(onShow) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(onCancel) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.f(rVar) ? 1048576 : 524288);
        if (sVar.T(i13 & 1, (599187 & i13) != 599186)) {
            i9.a(rVar, r0.f.d(12), 0L, 0L, 1, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1219561790, new at.q(i11, z11, onShow, onAdjust, onHide, onCancel), sVar), sVar, ((i13 >> 18) & 14) | 12607488, 108);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new jt.b(i11, z11, onAdjust, onHide, onShow, onCancel, rVar, i12);
        }
    }

    public static final void j(final me displayMode, final ke currentTab, final boolean z11, final boolean z12, final List list, final List list2, final Set expandedUnitIds, final Set selectedIds, final int i11, final int i12, final boolean z13, final String query, final fz.e onItemSelectedChange, final fz.c onToggleExpand, final fz.e onUnitSelectionChange, final fz.c onEditClick, final z1.r rVar, l1.n nVar, final int i13) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(displayMode, "displayMode");
        kotlin.jvm.internal.m.f(currentTab, "currentTab");
        kotlin.jvm.internal.m.f(expandedUnitIds, "expandedUnitIds");
        kotlin.jvm.internal.m.f(selectedIds, "selectedIds");
        kotlin.jvm.internal.m.f(query, "query");
        kotlin.jvm.internal.m.f(onItemSelectedChange, "onItemSelectedChange");
        kotlin.jvm.internal.m.f(onToggleExpand, "onToggleExpand");
        kotlin.jvm.internal.m.f(onUnitSelectionChange, "onUnitSelectionChange");
        kotlin.jvm.internal.m.f(onEditClick, "onEditClick");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-71076307);
        int i14 = i13 | (sVar2.d(displayMode.ordinal()) ? 4 : 2) | (sVar2.d(currentTab.ordinal()) ? 32 : 16) | (sVar2.g(z11) ? 256 : 128) | (sVar2.g(z12) ? 2048 : 1024);
        boolean zH = sVar2.h(list);
        int i15 = OSSConstants.DEFAULT_BUFFER_SIZE;
        int i16 = i14 | (zH ? 16384 : 8192);
        boolean zH2 = sVar2.h(list2);
        int i17 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
        int i18 = i16 | (zH2 ? 131072 : 65536) | (sVar2.h(expandedUnitIds) ? 1048576 : 524288) | (sVar2.h(selectedIds) ? 8388608 : 4194304) | (sVar2.d(i11) ? 67108864 : 33554432) | (sVar2.d(i12) ? 536870912 : 268435456);
        int i19 = 1572864 | (sVar2.g(z13) ? 4 : 2) | (sVar2.f(query) ? 32 : 16) | (sVar2.h(onItemSelectedChange) ? 256 : 128) | (sVar2.h(onToggleExpand) ? 2048 : 1024);
        if (sVar2.h(onUnitSelectionChange)) {
            i15 = 16384;
        }
        int i21 = i19 | i15;
        if (!sVar2.h(onEditClick)) {
            i17 = 65536;
        }
        int i22 = i21 | i17;
        if (sVar2.T(i18 & 1, ((i18 & 306783379) == 306783378 && (599187 & i22) == 599186) ? false : true)) {
            if (!z11) {
                sVar2.d0(-14658174);
                b(48, ub.a.e0(sVar2, R.string.srs_future_reviews_search_empty), sVar2, rVar);
                sVar2.p(false);
            } else if (z12) {
                sVar2.d0(-14215184);
                int i23 = a1.f41230a[displayMode.ordinal()];
                if (i23 == 1) {
                    sVar = sVar2;
                    sVar.d0(-14151014);
                    int i24 = i18 >> 15;
                    int i25 = ((i18 >> 12) & 14) | (i18 & 112) | (i24 & 896) | (i24 & 7168) | (i24 & 57344);
                    int i26 = i22 << 15;
                    k(list, currentTab, selectedIds, i11, i12, z13, query, onItemSelectedChange, onEditClick, rVar, sVar, ((i22 << 9) & 234881024) | i25 | (i26 & 458752) | (i26 & 3670016) | (i26 & 29360128) | 805306368);
                    sVar.p(false);
                } else {
                    if (i23 != 2) {
                        throw nv.p.x(sVar2, 415183866, false);
                    }
                    sVar2.d0(-13492295);
                    int i27 = i18 >> 9;
                    int i28 = ((i18 >> 15) & 14) | (i18 & 112) | ((i18 >> 12) & 896) | (i22 & 7168) | (i27 & 57344) | (i27 & 458752) | (i27 & 3670016);
                    int i29 = i22 << 21;
                    m(list2, currentTab, expandedUnitIds, onToggleExpand, selectedIds, i11, i12, z13, query, onItemSelectedChange, onUnitSelectionChange, onEditClick, rVar, sVar2, i28 | (i29 & 29360128) | (i29 & 234881024) | (i29 & 1879048192), (i22 >> 12) & 1022);
                    sVar = sVar2;
                    sVar.p(false);
                }
                sVar.p(false);
            } else {
                sVar2.d0(-14450939);
                b(48, ub.a.e0(sVar2, R.string.srs_future_reviews_tab_empty), sVar2, rVar);
                sVar2.p(false);
            }
            sVar = sVar2;
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(currentTab, z11, z12, list, list2, expandedUnitIds, selectedIds, i11, i12, z13, query, onItemSelectedChange, onToggleExpand, onUnitSelectionChange, onEditClick, rVar, i13) { // from class: mt.o0
                public final /* synthetic */ Set H;
                public final /* synthetic */ int K;
                public final /* synthetic */ int L;
                public final /* synthetic */ boolean M;
                public final /* synthetic */ String N;
                public final /* synthetic */ fz.e O;
                public final /* synthetic */ fz.c P;
                public final /* synthetic */ fz.e Q;
                public final /* synthetic */ fz.c R;
                public final /* synthetic */ z1.r S;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ke f41707b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f41708c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f41709d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ List f41710e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ List f41711f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ Set f41712t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1);
                    b1.j(this.f41706a, this.f41707b, this.f41708c, this.f41709d, this.f41710e, this.f41711f, this.f41712t, this.H, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x022c  */
    /* JADX WARN: Code duplicated, block: B:125:0x022f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0233  */
    /* JADX WARN: Code duplicated, block: B:129:0x0236  */
    /* JADX WARN: Code duplicated, block: B:132:0x0247  */
    /* JADX WARN: Code duplicated, block: B:133:0x024a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0254  */
    /* JADX WARN: Code duplicated, block: B:141:0x0260  */
    public static final void k(final List list, final ke keVar, final Set set, final int i11, final int i12, final boolean z11, String str, final fz.e eVar, final fz.c cVar, final z1.r rVar, l1.n nVar, final int i13) {
        int i14;
        boolean z12;
        l1.s sVar;
        int i15;
        l0.w wVar;
        l1.g gVar;
        int i16;
        l1.g gVar2;
        l0.w wVar2;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objQ;
        String str2 = str;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(747558725);
        if ((i13 & 6) == 0) {
            i14 = (sVar2.h(list) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i17 = i14 | (sVar2.d(keVar.ordinal()) ? 32 : 16);
        if ((i13 & 384) == 0) {
            i17 |= sVar2.h(set) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i17 |= sVar2.d(i11) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i17 |= sVar2.d(i12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i13) == 0) {
            z12 = z11;
            i17 |= sVar2.g(z12) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        } else {
            z12 = z11;
        }
        if ((1572864 & i13) == 0) {
            i17 |= sVar2.f(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i17 |= sVar2.h(eVar) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i17 |= sVar2.h(cVar) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i17 |= sVar2.f(rVar) ? 536870912 : 268435456;
        }
        if (sVar2.T(i17 & 1, (i17 & 306783379) != 306783378)) {
            l0.w wVarA = l0.y.a(0, sVar2, 3);
            v3.c cVar2 = (v3.c) sVar2.j(z2.g1.f58547h);
            float fE0 = cVar2.e0(2.0f);
            final float fE1 = cVar2.e0(84.0f);
            Object objQ2 = sVar2.Q();
            l1.g gVar3 = l1.m.f39353a;
            if (objQ2 == gVar3) {
                objQ2 = l1.t.B(str2);
                sVar2.o0(objQ2);
            }
            l1.b1 b1Var = (l1.b1) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar3) {
                objQ3 = l1.t.B(null);
                sVar2.o0(objQ3);
            }
            l1.b1 b1Var2 = (l1.b1) objQ3;
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar3) {
                objQ4 = l1.t.B(null);
                sVar2.o0(objQ4);
            }
            final l1.b1 b1Var3 = (l1.b1) objQ4;
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar3) {
                objQ5 = hh.p0.s(CropImageView.DEFAULT_ASPECT_RATIO, sVar2);
            }
            final l1.g1 g1Var = (l1.g1) objQ5;
            Boolean boolValueOf = Boolean.valueOf(z12);
            int i18 = i17 & 458752;
            boolean zF = (i18 == 131072) | ((i17 & 3670016) == 1048576) | sVar2.f(wVarA);
            Object objQ6 = sVar2.Q();
            if (zF || objQ6 == gVar3) {
                i15 = i18;
                wVar = wVarA;
                gVar = gVar3;
                i16 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                v0 v0Var = new v0(z12, str2, wVar, b1Var, b1Var2, null, 0);
                sVar2.o0(v0Var);
                objQ6 = v0Var;
            } else {
                i15 = i18;
                gVar = gVar3;
                wVar = wVarA;
                i16 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
            }
            l1.t.g(str2, boolValueOf, (fz.e) objQ6, sVar2);
            Object[] objArr = {Integer.valueOf(i11), Integer.valueOf(i12), Boolean.valueOf(z11), (String) b1Var3.getValue()};
            boolean z17 = i15 == i16;
            int i19 = i17 & 7168;
            boolean zF2 = (i19 == 2048) | z17 | sVar2.f(wVar) | sVar2.c(fE0);
            Object objQ7 = sVar2.Q();
            if (zF2) {
                gVar2 = gVar;
            } else {
                gVar2 = gVar;
                if (objQ7 != gVar2) {
                    wVar2 = wVar;
                }
                l1.t.i(objArr, (fz.e) objQ7, sVar2);
                z1.r rVarD = j0.e2.d(rVar, 1.0f);
                float f5 = n1.f41680a;
                j0.v1 v1Var = new j0.v1(f5, 4, f5, 12);
                boolean zH = sVar2.h(list) | sVar2.h(set);
                if ((i17 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z18 = zH | z13;
                if (i19 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean zC = z18 | z14 | sVar2.c(fE1);
                if ((29360128 & i17) == 8388608) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zC | z15 | ((i17 & 234881024) == 67108864);
                objQ = sVar2.Q();
                if (z16 || objQ == gVar2) {
                    fz.c cVar3 = new fz.c() { // from class: mt.p0
                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            l0.h LazyColumn = (l0.h) obj;
                            kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                            k kVar = new k(5, (byte) 0);
                            List list2 = list;
                            LazyColumn.q(list2.size(), new av.r(9, kVar, list2), new bp.p0(17, list2), new t1.d(new z0(list2, set, keVar, i11, fE1, eVar, cVar, list2, b1Var3, g1Var, 0), true, 2039820996));
                            return qy.b0.f48488a;
                        }
                    };
                    sVar2.o0(cVar3);
                    objQ = cVar3;
                }
                sVar = sVar2;
                ue.f.a(rVarD, wVar2, v1Var, null, null, null, false, null, (fz.c) objQ, sVar, 384, 504);
            }
            l0.w wVar3 = wVar;
            objQ7 = new w0(z11, i11, wVar3, fE0, b1Var3, g1Var, null, 0);
            wVar2 = wVar3;
            sVar2.o0(objQ7);
            l1.t.i(objArr, (fz.e) objQ7, sVar2);
            z1.r rVarD2 = j0.e2.d(rVar, 1.0f);
            float f11 = n1.f41680a;
            j0.v1 v1Var2 = new j0.v1(f11, 4, f11, 12);
            boolean zH2 = sVar2.h(list) | sVar2.h(set);
            if ((i17 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z19 = zH2 | z13;
            if (i19 == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean zC2 = z19 | z14 | sVar2.c(fE1);
            if ((29360128 & i17) == 8388608) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = zC2 | z15 | ((i17 & 234881024) == 67108864);
            objQ = sVar2.Q();
            if (z16) {
                fz.c cVar4 = new fz.c() { // from class: mt.p0
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        l0.h LazyColumn = (l0.h) obj;
                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                        k kVar = new k(5, (byte) 0);
                        List list2 = list;
                        LazyColumn.q(list2.size(), new av.r(9, kVar, list2), new bp.p0(17, list2), new t1.d(new z0(list2, set, keVar, i11, fE1, eVar, cVar, list2, b1Var3, g1Var, 0), true, 2039820996));
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(cVar4);
                objQ = cVar4;
            } else {
                fz.c cVar5 = new fz.c() { // from class: mt.p0
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        l0.h LazyColumn = (l0.h) obj;
                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                        k kVar = new k(5, (byte) 0);
                        List list2 = list;
                        LazyColumn.q(list2.size(), new av.r(9, kVar, list2), new bp.p0(17, list2), new t1.d(new z0(list2, set, keVar, i11, fE1, eVar, cVar, list2, b1Var3, g1Var, 0), true, 2039820996));
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(cVar5);
                objQ = cVar5;
            }
            sVar = sVar2;
            ue.f.a(rVarD2, wVar2, v1Var2, null, null, null, false, null, (fz.c) objQ, sVar, 384, 504);
        } else {
            str2 = str2;
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            final String str3 = str2;
            x1VarT.f39502d = new fz.e() { // from class: mt.q0
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b1.k(list, keVar, set, i11, i12, z11, str3, eVar, cVar, rVar, (l1.n) obj, l1.t.M(i13 | 1));
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void l(ue ueVar, int i11, int i12, boolean z11, fz.a aVar, fz.c cVar, l1.n nVar, int i13) {
        l1.s sVar;
        i3.a aVar2;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-749549902);
        int i14 = i13 | (sVar2.h(ueVar) ? 4 : 2) | (sVar2.d(i11) ? 32 : 16) | (sVar2.d(i12) ? 256 : 128) | (sVar2.g(z11) ? 2048 : 1024) | (sVar2.h(aVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(cVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar2.T(i14 & 1, (74899 & i14) != 74898)) {
            if (i12 > 0 && i11 > 0) {
                aVar2 = i11 == i12 ? i3.a.On : i3.a.Indeterminate;
            } else {
                aVar2 = i3.a.Off;
            }
            float f5 = 8;
            z1.r rVarB = d2.h.b(z1.o.f58481a, r0.f.d(f5));
            boolean z12 = (i14 & 57344) == 16384;
            Object objQ = sVar2.Q();
            if (z12 || objQ == l1.m.f39353a) {
                objQ = new jr.m(29, aVar);
                sVar2.o0(objQ);
            }
            sVar = sVar2;
            i9.a(d0.n.o(rVarB, false, null, (fz.a) objQ, 15), r0.f.d(f5), ((h1.s1) sVar2.j(h1.v1.f31180a)).I, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-103466633, new dt.s2(i12, aVar2, cVar, i11, ueVar, z11), sVar2), sVar, 12582912, 120);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.s2(ueVar, i11, i12, z11, aVar, cVar, i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0289  */
    /* JADX WARN: Code duplicated, block: B:148:0x028c  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:155:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:160:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:163:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:164:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:168:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:174:0x02e9  */
    public static final void m(final List list, final ke keVar, final Set set, final fz.c cVar, final Set set2, final int i11, final int i12, final boolean z11, final String str, final fz.e eVar, final fz.e eVar2, final fz.c cVar2, final z1.r rVar, l1.n nVar, final int i13, final int i14) {
        int i15;
        int i16;
        l1.s sVar;
        l0.w wVar;
        l1.g gVar;
        int i17;
        boolean z12;
        int i18;
        l1.g gVar2;
        final l1.g1 g1Var;
        l0.w wVar2;
        l1.b1 b1Var;
        boolean z13;
        int i19;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objQ;
        l1.s sVar2;
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(-735878575);
        if ((i13 & 6) == 0) {
            i15 = (sVar3.h(list) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i21 = i15 | (sVar3.d(keVar.ordinal()) ? 32 : 16);
        if ((i13 & 384) == 0) {
            i21 |= sVar3.h(set) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i21 |= sVar3.h(cVar) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i21 |= sVar3.h(set2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i13) == 0) {
            i21 |= sVar3.d(i11) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i21 |= sVar3.d(i12) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i21 |= sVar3.g(z11) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i21 |= sVar3.f(str) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i21 |= sVar3.h(eVar) ? 536870912 : 268435456;
        }
        if ((i14 & 6) == 0) {
            i16 = i14 | (sVar3.h(eVar2) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= sVar3.h(cVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= sVar3.f(rVar) ? 256 : 128;
        }
        int i22 = i16;
        if (sVar3.T(i21 & 1, ((i21 & 306783379) == 306783378 && (i22 & 147) == 146) ? false : true)) {
            l0.w wVarA = l0.y.a(0, sVar3, 3);
            v3.c cVar3 = (v3.c) sVar3.j(z2.g1.f58547h);
            float fE0 = cVar3.e0(2.0f);
            final float fE1 = cVar3.e0(84.0f);
            Object objQ2 = sVar3.Q();
            l1.g gVar3 = l1.m.f39353a;
            if (objQ2 == gVar3) {
                objQ2 = l1.t.B(str);
                sVar3.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            Object objQ3 = sVar3.Q();
            if (objQ3 == gVar3) {
                objQ3 = l1.t.B(null);
                sVar3.o0(objQ3);
            }
            l1.b1 b1Var3 = (l1.b1) objQ3;
            Object objQ4 = sVar3.Q();
            if (objQ4 == gVar3) {
                objQ4 = l1.t.B(null);
                sVar3.o0(objQ4);
            }
            l1.b1 b1Var4 = (l1.b1) objQ4;
            Object objQ5 = sVar3.Q();
            if (objQ5 == gVar3) {
                objQ5 = hh.p0.s(CropImageView.DEFAULT_ASPECT_RATIO, sVar3);
            }
            l1.g1 g1Var2 = (l1.g1) objQ5;
            Boolean boolValueOf = Boolean.valueOf(z11);
            int i23 = i21 & 29360128;
            boolean zF = (i23 == 8388608) | ((i21 & 234881024) == 67108864) | sVar3.f(wVarA);
            Object objQ6 = sVar3.Q();
            if (zF || objQ6 == gVar3) {
                wVar = wVarA;
                gVar = gVar3;
                i17 = 8388608;
                z12 = false;
                i18 = i23;
                v0 v0Var = new v0(z11, str, wVar, b1Var2, b1Var3, null, 1);
                sVar3.o0(v0Var);
                objQ6 = v0Var;
            } else {
                wVar = wVarA;
                gVar = gVar3;
                i17 = 8388608;
                z12 = false;
                i18 = i23;
            }
            l1.t.g(str, boolValueOf, (fz.e) objQ6, sVar3);
            Object[] objArr = {Integer.valueOf(i11), Integer.valueOf(i12), Boolean.valueOf(z11), (String) b1Var4.getValue()};
            boolean z19 = i18 == i17 ? true : z12;
            int i24 = i21 & 458752;
            boolean zF2 = z19 | (i24 == 131072 ? true : z12) | sVar3.f(wVar) | sVar3.c(r23);
            Object objQ7 = sVar3.Q();
            if (zF2) {
                gVar2 = gVar;
            } else {
                gVar2 = gVar;
                if (objQ7 != gVar2) {
                    wVar2 = wVar;
                    b1Var = b1Var4;
                    g1Var = g1Var2;
                }
                l1.t.i(objArr, (fz.e) objQ7, sVar3);
                z1.r rVarD = j0.e2.d(rVar, 1.0f);
                float f5 = n1.f41680a;
                j0.v1 v1Var = new j0.v1(f5, 4, f5, 12);
                boolean zH = sVar3.h(list);
                if ((i21 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                boolean zH2 = zH | z13 | sVar3.h(set2) | sVar3.h(set);
                i19 = i21;
                if ((i19 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = z12;
                }
                boolean z20 = zH2 | z14;
                if ((i22 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                boolean z21 = z20 | z15;
                if (i24 == 131072) {
                    z16 = true;
                } else {
                    z16 = z12;
                }
                boolean zC = z21 | z16 | sVar3.c(fE1);
                if ((1879048192 & i19) == 536870912) {
                    z17 = true;
                } else {
                    z17 = z12;
                }
                z18 = zC | z17 | ((i22 & 112) != 32 ? z12 : true);
                objQ = sVar3.Q();
                if (!z18 || objQ == gVar2) {
                    sVar2 = sVar3;
                    final l1.b1 b1Var5 = b1Var;
                    fz.c cVar4 = new fz.c() { // from class: mt.r0
                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            r0 r0Var = this;
                            l0.h LazyColumn = (l0.h) obj;
                            kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                                ue ueVar = (ue) it.next();
                                long j11 = ueVar.f50510a;
                                String strH = defpackage.e.h(j11, "unit_header_");
                                Set set3 = set;
                                fz.c cVar5 = cVar;
                                fz.e eVar3 = eVar2;
                                ke keVar2 = keVar;
                                Set set4 = set2;
                                l0.h.p(LazyColumn, strH, new t1.d(new es.h(ueVar, set3, cVar5, eVar3, keVar2, set4), true, -590398145), 2);
                                if (set3.contains(Long.valueOf(j11))) {
                                    List list2 = ueVar.f50513d;
                                    k kVar = new k(3, (byte) 0);
                                    LazyColumn.q(list2.size(), new av.r(10, kVar, list2), new bp.p0(18, list2), new t1.d(new z0(list2, set4, keVar2, i11, fE1, eVar, cVar2, ueVar, b1Var5, g1Var, 1), true, 2039820996));
                                }
                                l0.h.p(LazyColumn, defpackage.e.h(j11, "unit_spacing_"), g.Z, 2);
                                r0Var = this;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar2.o0(cVar4);
                    objQ = cVar4;
                } else {
                    sVar2 = sVar3;
                }
                sVar = sVar2;
                ue.f.a(rVarD, wVar2, v1Var, null, null, null, false, null, (fz.c) objQ, sVar, 384, 504);
            }
            g1Var = g1Var2;
            wVar2 = wVar;
            b1Var = b1Var4;
            objQ7 = new w0(z11, i11, wVar2, fE0, b1Var, g1Var, null, 1);
            sVar3.o0(objQ7);
            l1.t.i(objArr, (fz.e) objQ7, sVar3);
            z1.r rVarD2 = j0.e2.d(rVar, 1.0f);
            float f11 = n1.f41680a;
            j0.v1 v1Var2 = new j0.v1(f11, 4, f11, 12);
            boolean zH3 = sVar3.h(list);
            if ((i21 & 112) == 32) {
                z13 = true;
            } else {
                z13 = z12;
            }
            boolean zH4 = zH3 | z13 | sVar3.h(set2) | sVar3.h(set);
            i19 = i21;
            if ((i19 & 7168) == 2048) {
                z14 = true;
            } else {
                z14 = z12;
            }
            boolean z22 = zH4 | z14;
            if ((i22 & 14) == 4) {
                z15 = true;
            } else {
                z15 = z12;
            }
            boolean z23 = z22 | z15;
            if (i24 == 131072) {
                z16 = true;
            } else {
                z16 = z12;
            }
            boolean zC2 = z23 | z16 | sVar3.c(fE1);
            if ((1879048192 & i19) == 536870912) {
                z17 = true;
            } else {
                z17 = z12;
            }
            z18 = zC2 | z17 | ((i22 & 112) != 32 ? z12 : true);
            objQ = sVar3.Q();
            if (z18) {
                sVar2 = sVar3;
                final l1.b1 b1Var6 = b1Var;
                fz.c cVar5 = new fz.c() { // from class: mt.r0
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        r0 r0Var = this;
                        l0.h LazyColumn = (l0.h) obj;
                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                            ue ueVar = (ue) it.next();
                            long j11 = ueVar.f50510a;
                            String strH = defpackage.e.h(j11, "unit_header_");
                            Set set3 = set;
                            fz.c cVar6 = cVar;
                            fz.e eVar3 = eVar2;
                            ke keVar2 = keVar;
                            Set set4 = set2;
                            l0.h.p(LazyColumn, strH, new t1.d(new es.h(ueVar, set3, cVar6, eVar3, keVar2, set4), true, -590398145), 2);
                            if (set3.contains(Long.valueOf(j11))) {
                                List list2 = ueVar.f50513d;
                                k kVar = new k(3, (byte) 0);
                                LazyColumn.q(list2.size(), new av.r(10, kVar, list2), new bp.p0(18, list2), new t1.d(new z0(list2, set4, keVar2, i11, fE1, eVar, cVar2, ueVar, b1Var6, g1Var, 1), true, 2039820996));
                            }
                            l0.h.p(LazyColumn, defpackage.e.h(j11, "unit_spacing_"), g.Z, 2);
                            r0Var = this;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(cVar5);
                objQ = cVar5;
            } else {
                sVar2 = sVar3;
                final l1.b1 b1Var7 = b1Var;
                fz.c cVar6 = new fz.c() { // from class: mt.r0
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        r0 r0Var = this;
                        l0.h LazyColumn = (l0.h) obj;
                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                            ue ueVar = (ue) it.next();
                            long j11 = ueVar.f50510a;
                            String strH = defpackage.e.h(j11, "unit_header_");
                            Set set3 = set;
                            fz.c cVar7 = cVar;
                            fz.e eVar3 = eVar2;
                            ke keVar2 = keVar;
                            Set set4 = set2;
                            l0.h.p(LazyColumn, strH, new t1.d(new es.h(ueVar, set3, cVar7, eVar3, keVar2, set4), true, -590398145), 2);
                            if (set3.contains(Long.valueOf(j11))) {
                                List list2 = ueVar.f50513d;
                                k kVar = new k(3, (byte) 0);
                                LazyColumn.q(list2.size(), new av.r(10, kVar, list2), new bp.p0(18, list2), new t1.d(new z0(list2, set4, keVar2, i11, fE1, eVar, cVar2, ueVar, b1Var7, g1Var, 1), true, 2039820996));
                            }
                            l0.h.p(LazyColumn, defpackage.e.h(j11, "unit_spacing_"), g.Z, 2);
                            r0Var = this;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(cVar6);
                objQ = cVar6;
            }
            sVar = sVar2;
            ue.f.a(rVarD2, wVar2, v1Var2, null, null, null, false, null, (fz.c) objQ, sVar, 384, 504);
        } else {
            sVar = sVar3;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: mt.s0
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i13 | 1);
                    int iM2 = l1.t.M(i14);
                    b1.m(list, keVar, set, cVar, set2, i11, i12, z11, str, eVar, eVar2, cVar2, rVar, (l1.n) obj, iM, iM2);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final String n(l1.n nVar, int i11) {
        if (i11 == 0) {
            l1.s sVar = (l1.s) nVar;
            return ep.a.m(sVar, -509524546, R.string.today, sVar, false);
        }
        l1.s sVar2 = (l1.s) nVar;
        sVar2.d0(-509455819);
        String strD0 = ub.a.d0(R.string.srs_days_value, new Object[]{String.valueOf(i11)}, sVar2);
        sVar2.p(false);
        return strD0;
    }

    public static final boolean o(oe oeVar, ke keVar) {
        if (a1.f41231b[keVar.ordinal()] == 1) {
            return oeVar.f50221b.f49553a.isExcludedFromReview();
        }
        return !oeVar.f50221b.f49553a.isExcludedFromReview();
    }
}
