package mt;

import android.graphics.DashPathEffect;
import android.net.Uri;
import androidx.lifecycle.ViewModelKt;
import bt.h7;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.logging.type.LogSeverity;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.WordSentenceSourceKt;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import h1.p7;
import h1.ua;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import rt.dc;
import rt.ka;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f41654a = 0;

    static {
        new rt.n0("Unit 1", new SRSStatus(BuildConfig.VERSION_NAME, 0L, 0L, 0, "cn", "course", 0L, wt.o.CORRECT), new WordSentenceCharacterType.SentenceType(ft.a.a()), 0, true);
        new rt.q2(null, true, false, 5, 20, 3, 7, false, BuildConfig.VERSION_NAME, 0, -1, 0, 0, 0, 0, 0, 1.0f, true, 65538);
    }

    public static final void a(ht.l lVar, fz.a aVar, l1.n nVar, int i11) {
        int i12;
        l1.b1 b1Var;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(614338664);
        int i13 = i11 & 6;
        j0.r rVar = j0.r.f35391a;
        if (i13 == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(lVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(aVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.j jVar = z1.c.f58467e;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarA = rVar.a(oVar, jVar);
            w2.q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarA);
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
            List listL = ns.o.L(se.k.y(R.drawable.srs_audio_1, sVar, 0), se.k.y(R.drawable.srs_audio_2, sVar, 0), se.k.y(R.drawable.srs_audio_3, sVar, 0));
            kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(listL.get(wVar.f38359a));
                sVar.o0(objQ);
            }
            l1.b1 b1Var2 = (l1.b1) objQ;
            if (lVar instanceof ht.c) {
                sVar.d0(597048439);
                b1Var = b1Var2;
                l1.t.f(new dt.w(b1Var2, listL, wVar, null, 8), qy.b0.f48488a, sVar);
                sVar.p(false);
            } else {
                b1Var = b1Var2;
                sVar.d0(597452958);
                sVar.p(false);
                b1Var.setValue(listL.get(0));
            }
            k2.b bVar = (k2.b) b1Var.getValue();
            g2.p pVar = new g2.p(((h1.s1) sVar.j(h1.v1.f31180a)).f31034q, 5);
            float f5 = 278;
            float f11 = 98;
            z1.r rVarP = j0.e2.p(oVar, f5, f11);
            boolean z11 = (i12 & 896) == 256;
            Object objQ2 = sVar.Q();
            if (z11 || objQ2 == gVar) {
                objQ2 = new e2(4, aVar);
                sVar.o0(objQ2);
            }
            z1.r rVarQ = iu.k.q(6, 7, (fz.a) objQ2, sVar, rVarP, false);
            sVar = sVar;
            d0.n.c(bVar, null, rVarQ, null, null, CropImageView.DEFAULT_ASPECT_RATIO, pVar, sVar, 48, 56);
            d0.n.c(se.k.y(R.drawable.srs_audio_deer, sVar, 0), null, j0.e2.p(oVar, f5, f11), null, w2.i.f54514a, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 25008, 104);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.t1(lVar, i11, 16, aVar);
        }
    }

    public static final void b(final rt.n0 n0Var, final boolean z11, final boolean z12, boolean z13, final fz.c cVar, l1.n nVar, final int i11) {
        int i12;
        final boolean z14;
        boolean z15;
        WordSentenceCharacterType wordSentenceCharacterType;
        boolean z16;
        boolean z17;
        boolean z18;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1903148253);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(n0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.g(z12) ? 256 : 128;
        }
        int i13 = i12 | 3072;
        if ((i11 & 24576) == 0) {
            i13 |= sVar.h(cVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            WordSentenceCharacterType wordSentenceCharacterType2 = n0Var.f50110c;
            boolean z19 = (wordSentenceCharacterType2 instanceof WordSentenceCharacterType.SentenceType) && z11 && z12;
            d0.d2 d2VarU = d0.n.u(sVar);
            z1.h hVar = z1.c.P;
            float f5 = 16;
            j0.g gVarI = j0.i.i(f5);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarA = j0.c.A(d0.n.y(j0.e2.d(oVar, 1.0f), d2VarU, z19, 12), f5);
            j0.u uVarA = j0.t.a(gVarI, hVar, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarA);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, uVarA, sVar);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            if (wordSentenceCharacterType2 instanceof WordSentenceCharacterType.CharacterType) {
                sVar.d0(1718896769);
                if (z11) {
                    sVar.d0(1718977183);
                    z18 = false;
                    z16 = true;
                    dt.g4.b(WordSentenceSourceKt.toWordItem(((WordSentenceCharacterType.CharacterType) wordSentenceCharacterType2).getCharacter()), j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, ct.c.c(sVar), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777213), null, false, null, false, false, false, 0, null, sVar, 0, 1020);
                    sVar = sVar;
                } else {
                    z16 = true;
                    z18 = false;
                    sVar.d0(1680450011);
                }
                sVar.p(z18);
                if (z12) {
                    sVar.d0(1719331668);
                    l1.s sVar2 = sVar;
                    ua.b(((WordSentenceCharacterType.CharacterType) wordSentenceCharacterType2).getCharacter().getTranslation(), null, ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, ct.c.e(sVar), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar2, 0, 0, 130546);
                    sVar = sVar2;
                } else {
                    sVar.d0(1680450011);
                }
                sVar.p(z18);
                sVar.p(z18);
                z14 = true;
            } else if (wordSentenceCharacterType2 instanceof WordSentenceCharacterType.WordType) {
                sVar.d0(1719737365);
                if (z11) {
                    sVar.d0(1719813129);
                    dt.g4.b(((WordSentenceCharacterType.WordType) wordSentenceCharacterType2).getWord(), j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, ct.c.c(sVar), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777213), null, false, null, false, false, false, 0, null, sVar, 0, 1020);
                    sVar = sVar;
                } else {
                    sVar.d0(1680450011);
                }
                sVar.p(false);
                if (z12) {
                    sVar.d0(1720127097);
                    l1.s sVar3 = sVar;
                    ua.b(((WordSentenceCharacterType.WordType) wordSentenceCharacterType2).getWord().getTranslation(), null, ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, ct.c.e(sVar), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar3, 0, 0, 130546);
                    sVar = sVar3;
                } else {
                    sVar.d0(1680450011);
                }
                sVar.p(false);
                sVar.p(false);
                z14 = true;
                z16 = true;
            } else {
                if (!(wordSentenceCharacterType2 instanceof WordSentenceCharacterType.SentenceType)) {
                    throw nv.p.x(sVar, -1884214552, false);
                }
                sVar.d0(1720559981);
                if (z11) {
                    sVar.d0(1720627809);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    l1.q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(sVar, oVar);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar2, q0VarD, sVar);
                    l1.t.J(hVar3, q1VarL2, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
                    }
                    l1.t.J(hVar5, rVarC2, sVar);
                    List<CourseWord> displayCourseWords = ((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType2).getSentence().getDisplayCourseWords();
                    boolean z20 = n0Var.f50112e;
                    j3.y0 y0VarA = j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, ct.c.c(sVar), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777213);
                    int i14 = z12 ? 4 : Integer.MAX_VALUE;
                    long jA = fr.j3.A(12);
                    boolean z21 = (57344 & i13) == 16384;
                    Object objQ = sVar.Q();
                    if (z21 || objQ == l1.m.f39353a) {
                        objQ = new b0.o1(cVar, 17);
                        sVar.o0(objQ);
                    }
                    wordSentenceCharacterType = wordSentenceCharacterType2;
                    dt.d4.a(displayCourseWords, null, null, true, false, y0VarA, null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, i14, jA, false, null, false, false, z20, null, null, (fz.c) objQ, sVar, i13 & 7168, 3072, 0, 1822678);
                    z14 = true;
                    sVar = sVar;
                    z16 = true;
                    sVar.p(true);
                    z15 = false;
                } else {
                    z15 = false;
                    wordSentenceCharacterType = wordSentenceCharacterType2;
                    z14 = true;
                    z16 = true;
                    sVar.d0(1680450011);
                }
                sVar.p(z15);
                if (z12) {
                    sVar.d0(1721453277);
                    iu.k.c(((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType).getSentence().getTranslation(), null, j3.y0.a((j3.y0) sVar.j(ua.f31167a), ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, ct.c.e(sVar), n3.s.f43178t, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), 0, false, 3, 0, new s0.g(fr.j3.A(10), ct.c.e(sVar), fr.j3.z(0.25d)), sVar, 1572864, 186);
                    z17 = false;
                } else {
                    z17 = false;
                    sVar.d0(1680450011);
                }
                sVar.p(z17);
                sVar.p(z17);
            }
            sVar.p(z16);
        } else {
            sVar.W();
            z14 = z13;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: mt.g3
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m3.b(n0Var, z11, z12, z14, cVar, (l1.n) obj, l1.t.M(i11 | 1));
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void c(final boolean z11, final rt.n0 n0Var, final int i11, ht.l lVar, final fz.a aVar, final fz.c cVar, fz.a aVar2, final boolean z12, final boolean z13, final fz.a aVar3, final boolean z14, final String str, final fz.c cVar2, final fz.a aVar4, final fz.a aVar5, l1.n nVar, final int i12) {
        final ht.l lVar2;
        fz.a aVar6;
        int i13;
        final fz.a aVar7;
        int i14;
        boolean z15;
        boolean z16;
        rt.n0 n0Var2;
        l1.s sVar;
        boolean z17;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1597609884);
        int i15 = i12 | (sVar2.g(z11) ? 4 : 2) | (sVar2.h(n0Var) ? 32 : 16) | (sVar2.d(i11) ? 256 : 128) | (sVar2.h(lVar) ? 2048 : 1024);
        boolean zH = sVar2.h(aVar);
        int i16 = OSSConstants.DEFAULT_BUFFER_SIZE;
        int i17 = i15 | (zH ? 16384 : 8192) | (sVar2.h(cVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(aVar2) ? 1048576 : 524288) | (sVar2.g(z12) ? 8388608 : 4194304) | (sVar2.g(z13) ? 67108864 : 33554432) | (sVar2.h(aVar3) ? 536870912 : 268435456);
        int i18 = (sVar2.g(z14) ? 4 : 2) | (sVar2.f(str) ? 32 : 16) | (sVar2.h(cVar2) ? 256 : 128) | (sVar2.h(aVar4) ? 2048 : 1024);
        if (sVar2.h(aVar5)) {
            i16 = 16384;
        }
        int i19 = i18 | i16;
        if (sVar2.T(i17 & 1, ((i17 & 306783379) == 306783378 && (i19 & 9363) == 9362) ? false : true)) {
            z1.h hVar = z1.c.P;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarD = j0.e2.d(oVar, 1.0f);
            j0.u uVarA = j0.t.a(j0.i.f35305c, hVar, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarD);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
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
            z1.r rVarD2 = z1.a.d(j0.v.a(j0.e2.e(d0.n.h(oVar, ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p, g2.f0.f28556b), 1.0f), 1.0f), 1.0f);
            z1.j jVar = z1.c.f58463a;
            w2.q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarD2);
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
            float f5 = 16;
            z1.r rVarA = j0.c.A(j0.e2.d(oVar, 1.0f), f5);
            w2.q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode3 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL3 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, rVarA);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar2, q0VarD2, sVar2);
            l1.t.J(hVar3, q1VarL3, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar4);
            }
            l1.t.J(hVar5, rVarC3, sVar2);
            j0.r rVar = j0.r.f35391a;
            if (i11 != 0) {
                i13 = i11;
                if (i13 != 1) {
                    if (i13 == 2) {
                        lVar2 = lVar;
                        aVar7 = aVar;
                        sVar2.d0(350998883);
                        int i21 = i17 >> 6;
                        a(lVar2, aVar7, sVar2, (i21 & 896) | (i21 & 112) | 6);
                        z17 = false;
                        sVar2.p(false);
                    } else if (i13 != 3) {
                        sVar2.d0(-2030908900);
                        z17 = false;
                        sVar2.p(false);
                        lVar2 = lVar;
                        aVar7 = aVar;
                    } else {
                        sVar2.d0(-2004599541);
                        final int i22 = 0;
                        lVar2 = lVar;
                        aVar7 = aVar;
                        j(n0Var, rVar.a(d2.h.b(j0.e2.n(oVar, 200), r0.f.d(12)), z1.c.f58467e), t1.e.d(131753576, new fz.e() { // from class: mt.b3
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                int i23 = i22;
                                l1.n nVar2 = (l1.n) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                switch (i23) {
                                    case 0:
                                        l1.s sVar3 = (l1.s) nVar2;
                                        if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            m3.a(lVar2, aVar7, sVar3, 0);
                                        } else {
                                            sVar3.W();
                                        }
                                        break;
                                    default:
                                        l1.s sVar4 = (l1.s) nVar2;
                                        if (sVar4.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            boolean z18 = lVar2 instanceof ht.c;
                                            long j11 = ((h1.s1) sVar4.j(h1.v1.f31180a)).f31017a;
                                            z1.r rVarN = j0.e2.n(z1.o.f58481a, 24);
                                            fz.a aVar8 = aVar7;
                                            boolean zF = sVar4.f(aVar8);
                                            Object objQ = sVar4.Q();
                                            if (zF || objQ == l1.m.f39353a) {
                                                objQ = new e2(5, aVar8);
                                                sVar4.o0(objQ);
                                            }
                                            dt.a0.a(z18, rVarN, j11, (fz.a) objQ, sVar4, 48, 0);
                                        } else {
                                            sVar4.W();
                                        }
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        }, sVar2), sVar2, ((i17 >> 3) & 14) | 384);
                        z17 = false;
                        sVar2.p(false);
                    }
                    i14 = 57344;
                    z15 = true;
                    z16 = z17;
                    n0Var2 = n0Var;
                } else {
                    lVar2 = lVar;
                    aVar7 = aVar;
                    sVar2.d0(-2003749025);
                    int i23 = i17 >> 3;
                    i14 = 57344;
                    z15 = true;
                    z16 = false;
                    b(n0Var, false, true, false, cVar, sVar2, (i23 & 57344) | (i23 & 14) | 432);
                    sVar2.p(false);
                    n0Var2 = n0Var;
                }
            } else {
                i13 = i11;
                lVar2 = lVar;
                aVar7 = aVar;
                i14 = 57344;
                z15 = true;
                z16 = false;
                sVar2.d0(-2003407777);
                int i24 = i17 >> 3;
                b(n0Var, true, false, false, cVar, sVar2, (i24 & 14) | 432 | (i24 & 57344));
                n0Var2 = n0Var;
                sVar2.p(false);
            }
            sVar2.p(z15);
            if (n0Var2.f50109b.getUnitId() > 0) {
                sVar2.d0(-1744652626);
                k7.h(aVar5, rVar.a(oVar, jVar), false, null, g.f41465y0, sVar2, ((i19 >> 12) & 14) | 196608, 28);
            } else {
                sVar2.d0(-1772560190);
            }
            sVar2.p(z16);
            l1.g gVar = l1.m.f39353a;
            if (i13 != 2) {
                sVar2.d0(-1744205668);
                boolean z18 = (i17 & i14) == 16384 ? z15 : z16;
                Object objQ = sVar2.Q();
                if (z18 || objQ == gVar) {
                    objQ = new e2(2, aVar7);
                    sVar2.o0(objQ);
                }
                final int i25 = 1;
                k7.h((fz.a) objQ, rVar.a(oVar, z1.c.f58465c), false, null, t1.e.d(-1950070385, new fz.e() { // from class: mt.b3
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i26 = i25;
                        l1.n nVar2 = (l1.n) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (i26) {
                            case 0:
                                l1.s sVar3 = (l1.s) nVar2;
                                if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    m3.a(lVar2, aVar7, sVar3, 0);
                                } else {
                                    sVar3.W();
                                }
                                break;
                            default:
                                l1.s sVar4 = (l1.s) nVar2;
                                if (sVar4.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    boolean z19 = lVar2 instanceof ht.c;
                                    long j11 = ((h1.s1) sVar4.j(h1.v1.f31180a)).f31017a;
                                    z1.r rVarN = j0.e2.n(z1.o.f58481a, 24);
                                    fz.a aVar8 = aVar7;
                                    boolean zF = sVar4.f(aVar8);
                                    Object objQ2 = sVar4.Q();
                                    if (zF || objQ2 == l1.m.f39353a) {
                                        objQ2 = new e2(5, aVar8);
                                        sVar4.o0(objQ2);
                                    }
                                    dt.a0.a(z19, rVarN, j11, (fz.a) objQ2, sVar4, 48, 0);
                                } else {
                                    sVar4.W();
                                }
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                }, sVar2), sVar2, 196608, 28);
            } else {
                sVar2.d0(-1772560190);
            }
            sVar2.p(z16);
            sVar2.p(z15);
            z1.r rVarA2 = j0.v.a(j0.e2.e(j0.c.E(j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, 7), 1.0f), 1.0f);
            if (z11) {
                aVar6 = aVar2;
                sVar = sVar2;
                sVar.d0(-1597033474);
                sVar.p(z16);
            } else {
                sVar2.d0(-1597152204);
                boolean z19 = (i17 & 3670016) == 1048576 ? z15 : z16;
                Object objQ2 = sVar2.Q();
                if (z19 || objQ2 == gVar) {
                    aVar6 = aVar2;
                    objQ2 = new e2(3, aVar6);
                    sVar2.o0(objQ2);
                } else {
                    aVar6 = aVar2;
                }
                rVarA2 = iu.k.q(0, 7, (fz.a) objQ2, sVar2, rVarA2, false);
                sVar = sVar2;
                sVar.p(z16);
            }
            boolean z20 = z15;
            final rt.n0 n0Var3 = n0Var2;
            final int i26 = i13;
            l1.s sVar3 = sVar;
            k(rVarA2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, CropImageView.DEFAULT_ASPECT_RATIO, t1.e.d(1527625950, new fz.e() { // from class: mt.c3
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    int i27;
                    l1.b1 b1Var;
                    j0.r rVar2;
                    l1.b1 b1Var2;
                    l1.n nVar2 = (l1.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    z1.j jVar2 = z1.c.f58465c;
                    l1.s sVar4 = (l1.s) nVar2;
                    if (sVar4.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        z1.o oVar2 = z1.o.f58481a;
                        z1.r rVarD3 = j0.e2.d(oVar2, 1.0f);
                        z1.j jVar3 = z1.c.f58463a;
                        w2.q0 q0VarD3 = j0.o.d(jVar3, false);
                        int iHashCode4 = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL4 = sVar4.l();
                        z1.r rVarC4 = z1.a.c(sVar4, rVarD3);
                        y2.k.J.getClass();
                        y2.i iVar2 = y2.j.f56913b;
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar2);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD3, sVar4);
                        l1.t.J(y2.j.f56916e, q1VarL4, sVar4);
                        y2.h hVar6 = y2.j.f56918g;
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode4))) {
                            defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar6);
                        }
                        l1.t.J(y2.j.f56915d, rVarC4, sVar4);
                        boolean z21 = z11;
                        boolean z22 = !z21;
                        z1.j jVar4 = z1.c.f58467e;
                        j0.r rVar3 = j0.r.f35391a;
                        z1.r rVarP = j0.e2.p(rVar3.a(oVar2, jVar4), 48, 80);
                        a0.l1 l1VarE = a0.f1.e(b0.e.r(150, 0, null, 6), 2);
                        b0.i2 i2VarR = b0.e.r(LogSeverity.NOTICE_VALUE, 0, null, 4);
                        Object objQ3 = sVar4.Q();
                        l1.g gVar2 = l1.m.f39353a;
                        if (objQ3 == gVar2) {
                            objQ3 = new b0.k2(29);
                            sVar4.o0(objQ3);
                        }
                        l1.s sVar5 = sVar4;
                        a0.j0.c(z22, rVarP, l1VarE, a0.f1.v(i2VarR, (fz.c) objQ3).a(a0.f1.f(b0.e.r(LogSeverity.NOTICE_VALUE, 0, null, 6), 2)), null, g.f41467z0, sVar5, 1575936, 16);
                        z1.r rVarD4 = j0.e2.d(oVar2, 1.0f);
                        b0.i2 i2VarR2 = b0.e.r(LogSeverity.NOTICE_VALUE, 0, null, 4);
                        Object objQ4 = sVar5.Q();
                        if (objQ4 == gVar2) {
                            objQ4 = new lt.d(23);
                            sVar5.o0(objQ4);
                        }
                        a0.l1 l1VarA = a0.f1.q(i2VarR2, (fz.c) objQ4).a(a0.f1.e(b0.e.r(LogSeverity.NOTICE_VALUE, 0, null, 6), 2));
                        b0.i2 i2VarR3 = b0.e.r(LogSeverity.NOTICE_VALUE, 0, null, 4);
                        Object objQ5 = sVar5.Q();
                        if (objQ5 == gVar2) {
                            objQ5 = new lt.d(24);
                            sVar5.o0(objQ5);
                        }
                        a0.m1 m1VarA = a0.f1.v(i2VarR3, (fz.c) objQ5).a(a0.f1.f(b0.e.r(LogSeverity.NOTICE_VALUE, 0, null, 6), 2));
                        rt.n0 n0Var4 = n0Var3;
                        a0.j0.c(z21, rVarD4, l1VarA, m1VarA, null, t1.e.d(431524457, new h3(n0Var4, i26, cVar), sVar5), sVar5, 1573248, 16);
                        if (z21) {
                            sVar5.d0(-334081701);
                            float f11 = -10;
                            i27 = -365941238;
                            k7.h(aVar4, j0.e2.n(j0.c.x(rVar3.a(oVar2, jVar3), f11, f11), 32), false, null, g.A0, sVar5, 196608, 28);
                            sVar5 = sVar5;
                        } else {
                            i27 = -365941238;
                            sVar5.d0(-365941238);
                        }
                        sVar5.p(false);
                        boolean zF = sVar5.f(n0Var4.f50109b.getId());
                        Object objQ6 = sVar5.Q();
                        if (zF || objQ6 == gVar2) {
                            objQ6 = l1.t.B(Boolean.FALSE);
                            sVar5.o0(objQ6);
                        }
                        l1.b1 b1Var3 = (l1.b1) objQ6;
                        boolean z23 = z12;
                        if (z21 && z23) {
                            sVar5.d0(-333190482);
                            l1.s sVar6 = sVar5;
                            b1Var = b1Var3;
                            rVar2 = rVar3;
                            k7.h(aVar3, j0.e2.n(j0.c.x(rVar3.a(oVar2, jVar2), 10, -10), 32), false, null, t1.e.d(-1844497591, new at.m(z13, 4), sVar5), sVar6, 196608, 28);
                            sVar5 = sVar6;
                        } else {
                            b1Var = b1Var3;
                            rVar2 = r22;
                            sVar5.d0(i27);
                        }
                        sVar5.p(false);
                        String str2 = str;
                        if (z21 && z14) {
                            sVar5.d0(-332021813);
                            boolean z24 = !oz.q.K0(str2);
                            l1.b1 b1Var4 = b1Var;
                            boolean zF2 = sVar5.f(b1Var4);
                            Object objQ7 = sVar5.Q();
                            if (zF2 || objQ7 == gVar2) {
                                objQ7 = new w1(20, b1Var4);
                                sVar5.o0(objQ7);
                            }
                            fz.a aVar8 = (fz.a) objQ7;
                            z1.r rVarN = j0.e2.n(j0.c.x(rVar2.a(oVar2, jVar2), z23 ? -26 : 10, -10), 32);
                            l1.s sVar7 = sVar5;
                            b1Var2 = b1Var4;
                            kt.l.a(0, 0L, aVar8, sVar7, rVarN, z24);
                            sVar5 = sVar7;
                        } else {
                            b1Var2 = b1Var;
                            sVar5.d0(i27);
                        }
                        sVar5.p(false);
                        if (((Boolean) b1Var2.getValue()).booleanValue()) {
                            sVar5.d0(-331506934);
                            WordSentenceCharacterType wordSentenceCharacterType = n0Var4.f50110c;
                            boolean zF3 = sVar5.f(b1Var2);
                            Object objQ8 = sVar5.Q();
                            if (zF3 || objQ8 == gVar2) {
                                objQ8 = new w1(21, b1Var2);
                                sVar5.o0(objQ8);
                            }
                            fz.a aVar9 = (fz.a) objQ8;
                            fz.c cVar3 = cVar2;
                            boolean zF4 = sVar5.f(cVar3);
                            Object objQ9 = sVar5.Q();
                            if (zF4 || objQ9 == gVar2) {
                                objQ9 = new b0.o1(cVar3, 18);
                                sVar5.o0(objQ9);
                            }
                            fz.c cVar4 = (fz.c) objQ9;
                            boolean zF5 = sVar5.f(cVar3);
                            Object objQ10 = sVar5.Q();
                            if (zF5 || objQ10 == gVar2) {
                                objQ10 = new km.x0(cVar3, 11);
                                sVar5.o0(objQ10);
                            }
                            l1.s sVar8 = sVar5;
                            kt.l.c(wordSentenceCharacterType, str2, aVar9, cVar4, null, 0, (fz.a) objQ10, sVar8, 0, 48);
                            sVar5 = sVar8;
                        } else {
                            sVar5.d0(i27);
                        }
                        sVar5.p(false);
                        sVar5.p(true);
                    } else {
                        sVar4.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar), sVar3, 1572864);
            sVar2 = sVar3;
            sVar2.p(z20);
        } else {
            lVar2 = lVar;
            aVar6 = aVar2;
            sVar2.W();
        }
        l1.x1 x1VarT = sVar2.t();
        if (x1VarT != null) {
            final fz.a aVar8 = aVar6;
            final ht.l lVar3 = lVar2;
            x1VarT.f39502d = new fz.e(z11, n0Var, i11, lVar3, aVar, cVar, aVar8, z12, z13, aVar3, z14, str, cVar2, aVar4, aVar5, i12) { // from class: mt.d3
                public final /* synthetic */ boolean H;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ fz.a L;
                public final /* synthetic */ boolean M;
                public final /* synthetic */ String N;
                public final /* synthetic */ fz.c O;
                public final /* synthetic */ fz.a P;
                public final /* synthetic */ fz.a Q;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f41342a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ rt.n0 f41343b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f41344c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ht.l f41345d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ fz.a f41346e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ fz.c f41347f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ fz.a f41348t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1);
                    m3.c(this.f41342a, this.f41343b, this.f41344c, this.f41345d, this.f41346e, this.f41347f, this.f41348t, this.H, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void d(boolean z11, Map map, boolean z12, fz.a aVar, fz.c cVar, fz.c cVar2, l1.n nVar, int i11) {
        int i12;
        fz.a aVar2;
        boolean z13;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1668184801);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = i12 | (sVar.h(map) ? 32 : 16);
        if ((i11 & 384) == 0) {
            i13 |= sVar.g(z12) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            aVar2 = aVar;
            i13 |= sVar.h(aVar2) ? 2048 : 1024;
        } else {
            aVar2 = aVar;
        }
        if ((i11 & 24576) == 0) {
            i13 |= sVar.h(cVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i13 |= sVar.h(cVar2) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if (sVar.T(i13 & 1, (74899 & i13) != 74898)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarG = j0.e2.g(j0.e2.e(j0.c.v(oVar), 1.0f), 120);
            w2.q0 q0VarD = j0.o.d(z1.c.H, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarG);
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
                sVar.d0(-1602419590);
                int i14 = i13 >> 3;
                int i15 = i13 >> 6;
                int i16 = (i14 & 112) | (i14 & 14) | 24576 | (i15 & 896) | (i15 & 7168);
                z13 = true;
                y3.d(map, z12, cVar, cVar2, j0.e2.e(j0.c.C(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), sVar, i16);
                sVar.p(false);
            } else {
                z13 = true;
                sVar.d0(-1602018946);
                float f5 = 16;
                iu.k.e(aVar2, j0.e2.e(j0.c.A(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, 7), f5), 1.0f), false, 0L, null, g.B0, sVar, ((i13 >> 9) & 14) | 196656, 28);
                sVar = sVar;
                sVar.p(false);
            }
            sVar.p(z13);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.r0(z11, map, z12, aVar, cVar, cVar2, i11);
        }
    }

    public static final void e(final z1.r rVar, final rt.n0 n0Var, final boolean z11, final int i11, final ht.l lVar, final ka kaVar, final dc dcVar, final fz.a aVar, final fz.c cVar, final fz.a aVar2, final fz.a aVar3, final fz.c cVar2, final fz.a aVar4, final fz.a aVar5, l1.n nVar, final int i12, final int i13) {
        int i14;
        fz.a aVar6;
        fz.c cVar3;
        int i15;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-972523523);
        int i16 = (sVar.f(rVar) ? 4 : 2) | i12 | (sVar.h(n0Var) ? 32 : 16) | (sVar.g(z11) ? 256 : 128);
        if ((i12 & 3072) == 0) {
            i14 = i11;
            i16 |= sVar.d(i14) ? 2048 : 1024;
        } else {
            i14 = i11;
        }
        int i17 = i16 | (sVar.h(lVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.f(kaVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.f(dcVar) ? 1048576 : 524288);
        if ((12582912 & i12) == 0) {
            aVar6 = aVar;
            i17 |= sVar.h(aVar6) ? 8388608 : 4194304;
        } else {
            aVar6 = aVar;
        }
        if ((100663296 & i12) == 0) {
            cVar3 = cVar;
            i17 |= sVar.h(cVar3) ? 67108864 : 33554432;
        } else {
            cVar3 = cVar;
        }
        if ((i12 & 805306368) == 0) {
            i17 |= sVar.h(aVar2) ? 536870912 : 268435456;
        }
        if ((i13 & 6) == 0) {
            i15 = i13 | (sVar.h(aVar3) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= sVar.h(cVar2) ? 32 : 16;
        }
        int i18 = i17;
        if (sVar.T(i18 & 1, ((i18 & 306783379) == 306783378 && (i15 & 1171) == 1170) ? false : true)) {
            final int i19 = i14;
            final fz.a aVar7 = aVar6;
            final fz.c cVar4 = cVar3;
            k7.d(j0.e2.d(rVar, 1.0f), r0.f.d(12), null, null, null, t1.e.d(1178341999, new fz.f() { // from class: mt.z2
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    j0.v Card = (j0.v) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(Card, "$this$Card");
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                        int iHashCode = Long.hashCode(sVar2.T);
                        l1.q1 q1VarL = sVar2.l();
                        z1.r rVarC = z1.a.c(sVar2, z1.o.f58481a);
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
                        ka kaVar2 = kaVar;
                        boolean z12 = kaVar2.f49981a;
                        boolean z13 = kaVar2.f49982b;
                        dc dcVar2 = dcVar;
                        m3.c(z11, n0Var, i19, lVar, aVar7, cVar4, aVar2, z12, z13, aVar3, dcVar2.f49635a, dcVar2.f49636b, cVar2, aVar4, aVar5, sVar2, 0);
                        sVar2.p(true);
                    } else {
                        sVar2.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar), sVar, 196608, 28);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: mt.a3
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i12 | 1);
                    int iM2 = l1.t.M(i13);
                    m3.e(rVar, n0Var, z11, i11, lVar, kaVar, dcVar, aVar, cVar, aVar2, aVar3, cVar2, aVar4, aVar5, (l1.n) obj, iM, iM2);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void f(final rt.q2 q2Var, final ht.l lVar, final ka kaVar, final dc dcVar, final fz.a aVar, final fz.a aVar2, final fz.c cVar, final fz.c cVar2, final fz.a aVar3, final fz.c cVar3, final fz.j jVar, final fz.c cVar4, final fz.a aVar4, final fz.c cVar5, final fz.a aVar5, final fz.a aVar6, final fz.c cVar6, l1.n nVar, final int i11) {
        boolean z11;
        l1.s sVar;
        boolean z12;
        l1.s sVar2;
        l1.b1 b1Var;
        l1.b1 b1Var2;
        boolean z13;
        l1.s sVar3;
        l1.b1 b1Var3;
        l1.s sVar4;
        SRSStatus sRSStatus;
        l1.s sVar5 = (l1.s) nVar;
        sVar5.f0(209928681);
        int i12 = i11 | (sVar5.h(q2Var) ? 4 : 2) | (sVar5.h(lVar) ? 32 : 16) | (sVar5.f(kaVar) ? 256 : 128) | (sVar5.f(dcVar) ? 2048 : 1024);
        boolean zH = sVar5.h(aVar);
        int i13 = OSSConstants.DEFAULT_BUFFER_SIZE;
        int i14 = i12 | (zH ? 16384 : 8192) | (sVar5.h(aVar2) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar5.h(cVar) ? 1048576 : 524288) | (sVar5.h(cVar2) ? 8388608 : 4194304) | (sVar5.h(aVar3) ? 67108864 : 33554432) | (sVar5.h(cVar3) ? 536870912 : 268435456);
        int i15 = (sVar5.h(jVar) ? 4 : 2) | (sVar5.h(cVar4) ? 32 : 16) | (sVar5.h(aVar4) ? 256 : 128) | (sVar5.h(cVar5) ? 2048 : 1024);
        if (sVar5.h(aVar5)) {
            i13 = 16384;
        }
        int i16 = i15 | i13 | (sVar5.h(aVar6) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar5.h(cVar6) ? 1048576 : 524288);
        if (sVar5.T(i14 & 1, ((i14 & 306783379) == 306783378 && (i16 & 599187) == 599186) ? false : true)) {
            boolean zH2 = ((i14 & 234881024) == 67108864) | ((458752 & i14) == 131072) | sVar5.h(q2Var);
            Object objQ = sVar5.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH2 || objQ == gVar) {
                objQ = new l0(aVar2, q2Var, aVar3, 4);
                sVar5.o0(objQ);
            }
            final fz.a aVar7 = (fz.a) objQ;
            Object objQ2 = sVar5.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar5.o0(objQ2);
            }
            l1.b1 b1Var4 = (l1.b1) objQ2;
            if (((Boolean) b1Var4.getValue()).booleanValue()) {
                sVar5.d0(514157233);
                int i17 = q2Var.f50273k;
                int i18 = q2Var.m;
                int i19 = q2Var.f50275n;
                int i21 = q2Var.f50276o;
                int i22 = q2Var.f50279r;
                float f5 = q2Var.f50280s;
                boolean z14 = q2Var.f50281t;
                Object objQ3 = sVar5.Q();
                if (objQ3 == gVar) {
                    objQ3 = new w1(10, b1Var4);
                    sVar5.o0(objQ3);
                }
                g.C(i17, i18, i19, i21, i22, f5, z14, (fz.a) objQ3, jVar, sVar5, ((i16 << 24) & 234881024) | 12582912);
                z11 = false;
            } else {
                z11 = false;
                sVar5.d0(498025081);
            }
            sVar5.p(z11);
            Object objQ4 = sVar5.Q();
            if (objQ4 == gVar) {
                objQ4 = l1.t.B(Boolean.FALSE);
                sVar5.o0(objQ4);
            }
            l1.b1 b1Var5 = (l1.b1) objQ4;
            Object objQ5 = sVar5.Q();
            if (objQ5 == gVar) {
                objQ5 = l1.t.B(Boolean.FALSE);
                sVar5.o0(objQ5);
            }
            l1.b1 b1Var6 = (l1.b1) objQ5;
            Object objQ6 = sVar5.Q();
            if (objQ6 == gVar) {
                objQ6 = l1.t.B(Boolean.FALSE);
                sVar5.o0(objQ6);
            }
            rt.n0 n0Var = q2Var.f50263a;
            l1.b1 b1Var7 = (l1.b1) objQ6;
            long unitId = (n0Var == null || (sRSStatus = n0Var.f50109b) == null) ? -1L : sRSStatus.getUnitId();
            if (!((Boolean) b1Var6.getValue()).booleanValue() || unitId <= 0) {
                n0Var = n0Var;
                sVar = sVar5;
                z12 = false;
                sVar.d0(498025081);
            } else {
                sVar5.d0(515068230);
                Object objQ7 = sVar5.Q();
                if (objQ7 == gVar) {
                    objQ7 = new w1(11, b1Var6);
                    sVar5.o0(objQ7);
                }
                fz.a aVar8 = (fz.a) objQ7;
                boolean z15 = (i16 & 3670016) == 1048576;
                Object objQ8 = sVar5.Q();
                if (z15 || objQ8 == gVar) {
                    objQ8 = new km.x0(cVar6, 10);
                    sVar5.o0(objQ8);
                }
                ys.j3.c(unitId, aVar8, (fz.a) objQ8, sVar5, 48);
                sVar = sVar5;
                z12 = false;
            }
            sVar.p(z12);
            if (((Boolean) b1Var5.getValue()).booleanValue()) {
                sVar.d0(515372185);
                Object objQ9 = sVar.Q();
                if (objQ9 == gVar) {
                    objQ9 = new w1(12, b1Var5);
                    sVar.o0(objQ9);
                }
                fz.a aVar9 = (fz.a) objQ9;
                Object objQ10 = sVar.Q();
                if (objQ10 == gVar) {
                    objQ10 = new w1(13, b1Var5);
                    sVar.o0(objQ10);
                }
                fz.a aVar10 = (fz.a) objQ10;
                boolean zH3 = sVar.h(q2Var) | ((i16 & 112) == 32) | ((i14 & 57344) == 16384);
                Object objQ11 = sVar.Q();
                if (zH3 || objQ11 == gVar) {
                    sVar4 = sVar;
                    b1Var2 = b1Var4;
                    z13 = false;
                    b0.k0 k0Var = new b0.k0(q2Var, cVar4, aVar, b1Var5, 14);
                    b1Var5 = b1Var5;
                    sVar4.o0(k0Var);
                    objQ11 = k0Var;
                } else {
                    sVar4 = sVar;
                    b1Var2 = b1Var4;
                    z13 = false;
                }
                fz.a aVar11 = (fz.a) objQ11;
                l1.s sVar6 = sVar4;
                b1Var = b1Var5;
                sVar2 = sVar6;
                tv.a.i(true, aVar9, aVar10, aVar11, sVar2, 438);
            } else {
                sVar2 = sVar;
                b1Var = b1Var5;
                b1Var2 = b1Var4;
                b1Var6 = b1Var6;
                b1Var7 = b1Var7;
                n0Var = n0Var;
                z13 = z12;
                sVar2.d0(498025081);
            }
            sVar2.p(z13);
            if (((Boolean) b1Var7.getValue()).booleanValue()) {
                sVar2.d0(515853491);
                Object objQ12 = sVar2.Q();
                if (objQ12 == gVar) {
                    b1Var3 = b1Var7;
                    objQ12 = new w1(14, b1Var3);
                    sVar2.o0(objQ12);
                } else {
                    b1Var3 = b1Var7;
                }
                l1.s sVar7 = sVar2;
                k7.a((fz.a) objQ12, t1.e.d(1257405941, new v2(0, aVar5, b1Var3), sVar2), null, t1.e.d(1720742963, new bp.s(b1Var3, 10, (byte) 0), sVar2), g.f41461w0, g.f41463x0, null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar7, 1772598, 16276);
                sVar3 = sVar7;
            } else {
                sVar3 = sVar2;
                b1Var3 = b1Var7;
                sVar3.d0(498025081);
            }
            sVar3.p(z13);
            Object objQ13 = sVar3.Q();
            if (objQ13 == gVar) {
                objQ13 = new w1(9, b1Var);
                sVar3.o0(objQ13);
            }
            se.i.a(z13, (fz.a) objQ13, sVar3, 48, 1);
            l1.s sVar8 = sVar3;
            final l1.b1 b1Var8 = b1Var3;
            final rt.n0 n0Var2 = n0Var;
            final l1.b1 b1Var9 = b1Var6;
            p7.a(null, t1.e.d(994908589, new bp.t((Object) q2Var, (Object) aVar6, (Object) b1Var, (Object) b1Var2, 21), sVar8), t1.e.d(-1667160978, new bp.t(q2Var, aVar7, cVar, cVar2), sVar8), null, null, 0, 0L, 0L, null, t1.e.d(-1449909064, new fz.f() { // from class: mt.t2
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final j0.t1 innerPadding = (j0.t1) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(innerPadding, "innerPadding");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((l1.s) nVar2).f(innerPadding) ? 4 : 2;
                    }
                    l1.s sVar9 = (l1.s) nVar2;
                    if (sVar9.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                        rt.n0 n0Var3 = n0Var2;
                        final rt.q2 q2Var2 = q2Var;
                        if (n0Var3 == null) {
                            sVar9.d0(245230514);
                            sVar9.p(false);
                            cVar4.invoke(q2Var2.f50272j);
                        } else {
                            sVar9.d0(245404486);
                            Object[] objArr = {Integer.valueOf(q2Var2.f50267e), Integer.valueOf(q2Var2.f50279r), Integer.valueOf(q2Var2.f50276o), Integer.valueOf(q2Var2.f50277p), Boolean.valueOf(q2Var2.f50278q)};
                            boolean zH4 = sVar9.h(q2Var2);
                            final fz.a aVar12 = aVar3;
                            boolean zF = zH4 | sVar9.f(aVar12);
                            Object objQ14 = sVar9.Q();
                            l1.g gVar2 = l1.m.f39353a;
                            if (zF || objQ14 == gVar2) {
                                objQ14 = new iv.h0(21, q2Var2, aVar12, null);
                                sVar9.o0(objQ14);
                            }
                            l1.t.i(objArr, (fz.e) objQ14, sVar9);
                            Object objQ15 = sVar9.Q();
                            if (objQ15 == gVar2) {
                                objQ15 = new lt.d(20);
                                sVar9.o0(objQ15);
                            }
                            fz.c cVar7 = (fz.c) objQ15;
                            Object objQ16 = sVar9.Q();
                            if (objQ16 == gVar2) {
                                objQ16 = new lt.d(21);
                                sVar9.o0(objQ16);
                            }
                            fz.c cVar8 = (fz.c) objQ16;
                            final ht.l lVar2 = lVar;
                            final ka kaVar2 = kaVar;
                            final dc dcVar2 = dcVar;
                            final fz.c cVar9 = cVar3;
                            final fz.a aVar13 = aVar7;
                            final fz.a aVar14 = aVar4;
                            final fz.c cVar10 = cVar5;
                            final l1.b1 b1Var10 = b1Var8;
                            final l1.b1 b1Var11 = b1Var9;
                            a0.o.b(n0Var3, null, cVar7, null, BuildConfig.VERSION_NAME, cVar8, t1.e.d(-362935449, new fz.g() { // from class: mt.x2
                                @Override // fz.g
                                public final Object f(Object obj4, Object obj5, Object obj6, Object obj7) {
                                    a0.r AnimatedContent = (a0.r) obj4;
                                    final rt.n0 value = (rt.n0) obj5;
                                    l1.n nVar3 = (l1.n) obj6;
                                    ((Integer) obj7).getClass();
                                    kotlin.jvm.internal.m.f(AnimatedContent, "$this$AnimatedContent");
                                    kotlin.jvm.internal.m.f(value, "value");
                                    l1.w1 w1VarA = ct.c.f22477b.a(Boolean.TRUE);
                                    final j0.t1 t1Var = innerPadding;
                                    final rt.q2 q2Var3 = q2Var2;
                                    final ht.l lVar3 = lVar2;
                                    final ka kaVar3 = kaVar2;
                                    final dc dcVar3 = dcVar2;
                                    final fz.a aVar15 = aVar12;
                                    final fz.c cVar11 = cVar9;
                                    final fz.a aVar16 = aVar13;
                                    final fz.a aVar17 = aVar14;
                                    final fz.c cVar12 = cVar10;
                                    final l1.b1 b1Var12 = b1Var10;
                                    final l1.b1 b1Var13 = b1Var11;
                                    l1.t.a(w1VarA, t1.e.d(1839222439, new fz.e() { // from class: mt.y2
                                        @Override // fz.e
                                        public final Object invoke(Object obj8, Object obj9) {
                                            l1.n nVar4 = (l1.n) obj8;
                                            int iIntValue2 = ((Integer) obj9).intValue();
                                            l1.s sVar10 = (l1.s) nVar4;
                                            if (sVar10.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                z1.r rVarC = j0.c.C(j0.c.z(j0.e2.d(z1.o.f58481a, 1.0f), t1Var), 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                                rt.q2 q2Var4 = q2Var3;
                                                boolean z16 = q2Var4.f50266d;
                                                int i23 = q2Var4.f50277p;
                                                Object objQ17 = sVar10.Q();
                                                l1.g gVar3 = l1.m.f39353a;
                                                if (objQ17 == gVar3) {
                                                    objQ17 = new w1(18, b1Var12);
                                                    sVar10.o0(objQ17);
                                                }
                                                fz.a aVar18 = (fz.a) objQ17;
                                                Object objQ18 = sVar10.Q();
                                                if (objQ18 == gVar3) {
                                                    objQ18 = new w1(19, b1Var13);
                                                    sVar10.o0(objQ18);
                                                }
                                                m3.e(rVarC, value, z16, i23, lVar3, kaVar3, dcVar3, aVar15, cVar11, aVar16, aVar17, cVar12, aVar18, (fz.a) objQ18, sVar10, 0, 3456);
                                            } else {
                                                sVar10.W();
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    }, nVar3), nVar3, 56);
                                    return qy.b0.f48488a;
                                }
                            }, sVar9), sVar9, 1794432, 10);
                            sVar9.p(false);
                        }
                    } else {
                        sVar9.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar8), sVar8, 805306800, 505);
            sVar5 = sVar8;
        } else {
            sVar5.W();
        }
        l1.x1 x1VarT = sVar5.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(lVar, kaVar, dcVar, aVar, aVar2, cVar, cVar2, aVar3, cVar3, jVar, cVar4, aVar4, cVar5, aVar5, aVar6, cVar6, i11) { // from class: mt.u2
                public final /* synthetic */ fz.c H;
                public final /* synthetic */ fz.a K;
                public final /* synthetic */ fz.c L;
                public final /* synthetic */ fz.j M;
                public final /* synthetic */ fz.c N;
                public final /* synthetic */ fz.a O;
                public final /* synthetic */ fz.c P;
                public final /* synthetic */ fz.a Q;
                public final /* synthetic */ fz.a R;
                public final /* synthetic */ fz.c S;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ht.l f41941b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ka f41942c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ dc f41943d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ fz.a f41944e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ fz.a f41945f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ fz.c f41946t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1);
                    m3.f(this.f41940a, this.f41941b, this.f41942c, this.f41943d, this.f41944e, this.f41945f, this.f41946t, this.H, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [rt.n0] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r7v10, types: [l1.b3] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [rt.q2] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
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
    public static final void g(List reviewList, final boolean z11, final fz.a aVar, final fz.c cVar, final fz.c cVar2, final rt.b4 b4Var, l1.n nVar, int i11) {
        l1.s sVar;
        vy.d dVar;
        l1.b1 b1VarO;
        Object obj;
        ?? r9;
        l1.b1 b1Var;
        l1.g gVar;
        l1.b1 b1Var2;
        vy.d dVar2;
        l1.b1 b1Var3;
        l1.b1 b1Var4;
        ?? r11;
        long j11;
        Object a1Var;
        rt.q2 q2Var;
        kotlin.jvm.internal.m.f(reviewList, "reviewList");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1093011100);
        int i12 = i11 | (sVar2.h(reviewList) ? 4 : 2) | (sVar2.g(z11) ? 32 : 16) | (sVar2.h(aVar) ? 256 : 128) | (sVar2.h(cVar) ? 2048 : 1024) | (sVar2.h(cVar2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(b4Var) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar2.T(i12 & 1, (74899 & i12) != 74898)) {
            sVar2.Y();
            if ((i11 & 1) != 0 && !sVar2.C()) {
                sVar2.W();
            }
            sVar2.q();
            Object objQ = sVar2.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ == gVar2) {
                objQ = l1.t.q(sVar2);
                sVar2.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar2) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ2);
            }
            final l1.b1 b1Var5 = (l1.b1) objQ2;
            boolean zH = sVar2.h(b4Var);
            Object objQ3 = sVar2.Q();
            if (zH || objQ3 == gVar2) {
                objQ3 = new w2(b4Var, 0);
                sVar2.o0(objQ3);
            }
            l1.t.c(b4Var, (fz.c) objQ3, sVar2);
            final l1.b1 b1VarO2 = l1.t.o(b4Var.f49506p0, sVar2);
            final l1.b1 b1VarO3 = l1.t.o(b4Var.f49501k0, sVar2);
            final l1.b1 b1VarO4 = l1.t.o(b4Var.f49504n0, sVar2);
            final l1.b1 b1VarO5 = l1.t.o(b4Var.f49505o0, sVar2);
            l1.b1 b1VarO6 = l1.t.o(b4Var.f49500j0, sVar2);
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar2) {
                objQ4 = l1.t.B(null);
                sVar2.o0(objQ4);
            }
            final l1.b1 b1Var6 = (l1.b1) objQ4;
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar2) {
                objQ5 = l1.t.B(null);
                sVar2.o0(objQ5);
            }
            final l1.b1 b1Var7 = (l1.b1) objQ5;
            Object objQ6 = sVar2.Q();
            if (objQ6 == gVar2) {
                objQ6 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ6);
            }
            l1.b1 b1Var8 = (l1.b1) objQ6;
            Object objQ7 = sVar2.Q();
            if (objQ7 == gVar2) {
                objQ7 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ7);
            }
            l1.b1 b1Var9 = (l1.b1) objQ7;
            Object objQ8 = sVar2.Q();
            if (objQ8 == gVar2) {
                objQ8 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ8);
            }
            l1.b1 b1Var10 = (l1.b1) objQ8;
            boolean zF = sVar2.f((rt.m0) b1Var6.getValue());
            Object objQ9 = sVar2.Q();
            ry.r rVar = ry.r.f50854a;
            if (zF || objQ9 == gVar2) {
                rt.m0 m0Var = (rt.m0) b1Var6.getValue();
                if (m0Var != null) {
                    vt.h hVar = b4Var.H;
                    fr.o0 o0Var = (fr.o0) b4Var.f49491d;
                    String strK = xt.d.k(o0Var.f27733a.keyLanguage);
                    String str = m0Var.f50043b;
                    dVar = null;
                    objQ9 = uz.x0.A(new no.g(((vt.r) hVar).e(strK, str), ((fr.r) b4Var.f49495f).b(xt.d.k(o0Var.f27733a.keyLanguage), str), new rt.t3(3, 0, dVar)), ViewModelKt.getViewModelScope(b4Var), uz.a1.a(2), rVar);
                } else {
                    dVar = null;
                    objQ9 = null;
                }
                sVar2.o0(objQ9);
            } else {
                b0Var = b0Var;
                dVar = null;
            }
            uz.g1 g1Var = (uz.g1) objQ9;
            if (g1Var == null) {
                sVar2.d0(-1744335955);
                sVar2.p(false);
                obj = dVar;
            } else {
                sVar2.d0(1883393748);
                b1VarO = l1.t.o(g1Var, sVar2);
                sVar2.p(false);
            }
            if (obj == null) {
                obj = b1VarO;
                sVar2.d0(-1744314998);
                Object objQ10 = sVar2.Q();
                if (objQ10 == gVar2) {
                    objQ10 = l1.t.B(rVar);
                    sVar2.o0(objQ10);
                }
                sVar2.p(false);
                r9 = (l1.b1) objQ10;
            } else {
                obj = b1VarO;
                sVar2.d0(1883388937);
                sVar2.p(false);
                r9 = obj;
            }
            rt.m0 m0Var2 = (rt.m0) b1Var6.getValue();
            List list = (List) r9.getValue();
            rt.p pVar = (rt.p) b1VarO6.getValue();
            boolean zBooleanValue = ((Boolean) b1Var10.getValue()).booleanValue();
            boolean zH2 = sVar2.h(b4Var);
            Object objQ11 = sVar2.Q();
            if (zH2 || objQ11 == gVar2) {
                b1Var = b1Var9;
                gVar = gVar2;
                d0.m0 m0Var3 = new d0.m0(2, b4Var, rt.b4.class, "createFolder", "createFolder(Lcom/lingodeer/course/viewmodels/CourseFlashCardBookmarkTarget;Ljava/lang/String;)V", 0, 4);
                sVar2.o0(m0Var3);
                objQ11 = m0Var3;
            } else {
                gVar = gVar2;
                b1Var = b1Var9;
            }
            fz.e eVar = (fz.e) ((mz.e) objQ11);
            boolean zH3 = sVar2.h(b4Var);
            Object objQ12 = sVar2.Q();
            if (zH3 || objQ12 == gVar) {
                d0.m0 m0Var4 = new d0.m0(2, b4Var, rt.b4.class, "addBookmarkToFolder", "addBookmarkToFolder(Lcom/lingodeer/course/viewmodels/CourseFlashCardBookmarkTarget;Ljava/lang/String;)V", 0, 5);
                sVar2.o0(m0Var4);
                objQ12 = m0Var4;
            }
            fz.e eVar2 = (fz.e) ((mz.e) objQ12);
            Object objQ13 = sVar2.Q();
            if (objQ13 == gVar) {
                objQ13 = new ch.h0(b1Var6, b1Var10, 6);
                sVar2.o0(objQ13);
            }
            fz.a aVar2 = (fz.a) objQ13;
            Object objQ14 = sVar2.Q();
            if (objQ14 == gVar) {
                objQ14 = new bp.i2(b1Var7, b1Var8, 13);
                sVar2.o0(objQ14);
            }
            fz.c cVar3 = (fz.c) objQ14;
            boolean zH4 = sVar2.h(b4Var);
            Object objQ15 = sVar2.Q();
            if (zH4 || objQ15 == gVar) {
                bt.y2 y2Var = new bt.y2(0, b4Var, rt.b4.class, "clearBookmarkFolderOperationResult", "clearBookmarkFolderOperationResult()V", 0, 18);
                sVar2.o0(y2Var);
                objQ15 = y2Var;
            }
            g.i(m0Var2, list, pVar, zBooleanValue, null, eVar, eVar2, aVar2, cVar3, (fz.a) ((mz.e) objQ15), sVar2, 113246208, 16);
            if (((Boolean) b1Var8.getValue()).booleanValue()) {
                sVar2.d0(-1743565914);
                rt.m0 m0Var5 = (rt.m0) b1Var7.getValue();
                Object objQ16 = sVar2.Q();
                if (objQ16 == gVar) {
                    b1Var2 = b1Var8;
                    dVar2 = null;
                    objQ16 = new fu.y(b1Var2, b1Var7, dVar2, 2);
                    sVar2.o0(objQ16);
                } else {
                    b1Var2 = b1Var8;
                    dVar2 = null;
                }
                l1.t.f((fz.e) objQ16, m0Var5, sVar2);
            } else {
                b1Var2 = b1Var8;
                dVar2 = null;
                sVar2.d0(-1753023394);
            }
            sVar2.p(false);
            Object objQ17 = sVar2.Q();
            if (objQ17 == gVar) {
                b1Var3 = b1Var2;
                objQ17 = new i3(0, b1Var7, b1Var3, b1Var6, b1Var10);
                sVar2.o0(objQ17);
            } else {
                b1Var3 = b1Var2;
            }
            final fz.a aVar3 = (fz.a) objQ17;
            boolean zBooleanValue2 = ((Boolean) b1Var3.getValue()).booleanValue();
            Object objQ18 = sVar2.Q();
            if (objQ18 == gVar) {
                b1Var4 = b1Var;
                objQ18 = new p(4, b1Var4);
                sVar2.o0(objQ18);
            } else {
                b1Var4 = b1Var;
            }
            dt.c1 c1Var = new dt.c1(zBooleanValue2, aVar3, (fz.c) objQ18);
            rt.r2 r2Var = (rt.r2) b1VarO2.getValue();
            if (r2Var instanceof rt.q2) {
                q2Var = (rt.q2) r2Var;
            } else {
                r11 = dVar2;
            }
            ?? r14 = r11 != 0 ? r11.f50263a : dVar2;
            if (r14 == 0) {
                r11 = q2Var;
                r11 = q2Var;
                sVar2.d0(-1742091927);
                sVar2.p(false);
                a1Var = dVar2;
            } else {
                r11 = q2Var;
                sVar2.d0(-1742091926);
                boolean zH5 = sVar2.h(b4Var);
                Object objQ19 = sVar2.Q();
                if (zH5 || objQ19 == gVar) {
                    r11 = q2Var;
                    d0.m0 m0Var6 = new d0.m0(2, b4Var, rt.b4.class, "bookmarkUiStateFor", "bookmarkUiStateFor(Ljava/lang/String;J)Lkotlinx/coroutines/flow/StateFlow;", 0, 6);
                    sVar2.o0(m0Var6);
                    objQ19 = m0Var6;
                }
                fz.e eVar3 = (fz.e) ((mz.e) objQ19);
                long unitId = r14.f50109b.getUnitId();
                boolean zH6 = sVar2.h(b4Var);
                Object objQ20 = sVar2.Q();
                if (zH6 || objQ20 == gVar) {
                    j11 = unitId;
                    br.j jVar = new br.j(b4Var, b1Var3, b1Var7, b1Var6, 11);
                    sVar2.o0(jVar);
                    objQ20 = jVar;
                } else {
                    j11 = unitId;
                }
                a1Var = new dt.a1(eVar3, j11, (fz.f) objQ20);
                sVar2.p(false);
            }
            final l1.b1 b1Var11 = b1Var3;
            final rz.b0 b0Var2 = b0Var;
            final l1.b1 b1Var12 = b1Var4;
            sVar = sVar2;
            l1.t.b(new l1.w1[]{dt.v2.f24277c.a(a1Var), dt.v2.f24278d.a(c1Var)}, t1.e.d(-1364394460, new fz.e() { // from class: mt.r2
                @Override // fz.e
                public final Object invoke(Object obj2, Object obj3) {
                    l1.s sVar3;
                    z1.r rVar2;
                    boolean z12;
                    l1.b3 b3Var;
                    Object obj4;
                    l1.b1 b1Var13;
                    rt.b4 b4Var2;
                    l1.b1 b1Var14;
                    rz.b0 b0Var3;
                    fz.c cVar4;
                    boolean z13;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    l1.s sVar4 = (l1.s) nVar2;
                    if (sVar4.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        z1.r rVarD = j0.e2.d(z1.o.f58481a, 1.0f);
                        w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
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
                        l1.t.J(y2.j.f56917f, q0VarD, sVar4);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar4);
                        y2.h hVar2 = y2.j.f56918g;
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar4, iHashCode, hVar2);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, sVar4);
                        l1.b1 b1Var15 = b1VarO2;
                        rt.r2 r2Var2 = (rt.r2) b1Var15.getValue();
                        boolean z14 = r2Var2 instanceof rt.q2;
                        rt.b4 b4Var3 = b4Var;
                        l1.b1 b1Var16 = b1Var11;
                        l1.g gVar3 = l1.m.f39353a;
                        if (z14) {
                            sVar4.d0(-1984859246);
                            rt.r2 r2Var3 = (rt.r2) b1Var15.getValue();
                            kotlin.jvm.internal.m.d(r2Var3, "null cannot be cast to non-null type com.lingodeer.course.viewmodels.CourseFlashCardScreenUiState.Success");
                            final rt.q2 q2Var2 = (rt.q2) r2Var3;
                            boolean z15 = q2Var2.f50271i;
                            rz.b0 b0Var4 = b0Var2;
                            final fz.c cVar5 = cVar;
                            final l1.b1 b1Var17 = b1Var5;
                            if (z15) {
                                sVar4.d0(-1984792069);
                                String str2 = q2Var2.f50272j;
                                boolean zH7 = sVar4.h(b0Var4) | sVar4.h(b4Var3) | sVar4.f(cVar5) | sVar4.h(q2Var2);
                                Object objQ21 = sVar4.Q();
                                if (zH7 || objQ21 == gVar3) {
                                    h7 h7Var = new h7(q2Var2, b0Var4, b1Var17, b4Var3, cVar5, null, 1);
                                    sVar4.o0(h7Var);
                                    objQ21 = h7Var;
                                }
                                l1.t.f((fz.e) objQ21, str2, sVar4);
                                sVar4.p(false);
                                sVar3 = sVar4;
                                z13 = false;
                                rVar2 = null;
                            } else {
                                final rt.b4 b4Var4 = b4Var3;
                                final rz.b0 b0Var5 = b0Var4;
                                b1Var16 = b1Var16;
                                sVar4.d0(-1984539791);
                                ht.l lVar = (ht.l) b1VarO3.getValue();
                                l1.b3 b3Var2 = b1VarO4;
                                ka kaVar = (ka) b3Var2.getValue();
                                dc dcVar = (dc) b1VarO5.getValue();
                                final boolean z16 = z11;
                                boolean zG = sVar4.g(z16) | sVar4.h(b4Var4) | sVar4.h(b0Var5) | sVar4.f(cVar5) | sVar4.h(q2Var2);
                                final fz.a aVar4 = aVar;
                                boolean zF2 = zG | sVar4.f(aVar4);
                                Object objQ22 = sVar4.Q();
                                if (zF2 || objQ22 == gVar3) {
                                    b3Var = b3Var2;
                                    obj4 = new fz.a() { // from class: mt.j3
                                        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
                                        /* JADX WARN: Code duplicated, block: B:13:0x0035  */
                                        @Override // fz.a
                                        public final Object invoke() {
                                            boolean z17 = z16;
                                            rt.b4 b4Var5 = b4Var4;
                                            rz.b0 b0Var6 = b0Var5;
                                            l1.b1 b1Var18 = b1Var17;
                                            if (z17) {
                                                ot.h2 h2Var = (ot.h2) b4Var5.f49488b0.f4944b;
                                                if ((h2Var != null ? h2Var.b().size() : 0) > 0) {
                                                    m3.i(b0Var6, b1Var18, b4Var5, cVar5, q2Var2.f50272j);
                                                } else if (!((Boolean) b1Var18.getValue()).booleanValue()) {
                                                    b1Var18.setValue(Boolean.TRUE);
                                                    rz.e0.B(b0Var6, null, null, new kb.e(16, b4Var5, aVar4, null), 3);
                                                }
                                            } else if (!((Boolean) b1Var18.getValue()).booleanValue()) {
                                                b1Var18.setValue(Boolean.TRUE);
                                                rz.e0.B(b0Var6, null, null, new kb.e(16, b4Var5, aVar4, null), 3);
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    b4Var4 = b4Var4;
                                    b0Var5 = b0Var5;
                                    b1Var13 = b1Var17;
                                    cVar5 = cVar5;
                                    sVar4.o0(obj4);
                                } else {
                                    obj4 = objQ22;
                                    b3Var = b3Var2;
                                    b1Var13 = b1Var17;
                                }
                                fz.a aVar5 = (fz.a) obj4;
                                boolean zH8 = sVar4.h(b4Var4);
                                Object objQ23 = sVar4.Q();
                                if (zH8 || objQ23 == gVar3) {
                                    rz.b0 b0Var6 = b0Var5;
                                    b4Var2 = b4Var4;
                                    b1Var14 = b1Var13;
                                    b0Var3 = b0Var6;
                                    cVar4 = cVar5;
                                    bt.y2 y2Var2 = new bt.y2(0, b4Var2, rt.b4.class, "toggleAnswerVisibility", "toggleAnswerVisibility()V", 0, 22);
                                    sVar4.o0(y2Var2);
                                    objQ23 = y2Var2;
                                } else {
                                    b0Var3 = b0Var5;
                                    b1Var14 = b1Var13;
                                    b4Var2 = b4Var4;
                                    cVar4 = cVar5;
                                }
                                fz.a aVar6 = (fz.a) ((mz.e) objQ23);
                                boolean zH9 = sVar4.h(b4Var2);
                                Object objQ24 = sVar4.Q();
                                if (zH9 || objQ24 == gVar3) {
                                    bt.a3 a3Var = new bt.a3(1, b4Var2, rt.b4.class, "updateSRSStatus", "updateSRSStatus(Lcom/lingodeer/data/usecase/SRSUserRating;)V", 0, 26);
                                    sVar4.o0(a3Var);
                                    objQ24 = a3Var;
                                }
                                fz.c cVar6 = (fz.c) ((mz.e) objQ24);
                                boolean zH10 = sVar4.h(b4Var2);
                                Object objQ25 = sVar4.Q();
                                if (zH10 || objQ25 == gVar3) {
                                    bt.a3 a3Var2 = new bt.a3(1, b4Var2, rt.b4.class, "playSoundEffect", "playSoundEffect(Lcom/lingodeer/data/usecase/SRSUserRating;)V", 0, 27);
                                    sVar4.o0(a3Var2);
                                    objQ25 = a3Var2;
                                }
                                fz.c cVar7 = (fz.c) ((mz.e) objQ25);
                                boolean zH11 = sVar4.h(b4Var2);
                                Object objQ26 = sVar4.Q();
                                if (zH11 || objQ26 == gVar3) {
                                    bt.y2 y2Var3 = new bt.y2(0, b4Var2, rt.b4.class, "playAudio", "playAudio()V", 0, 23);
                                    sVar4.o0(y2Var3);
                                    objQ26 = y2Var3;
                                }
                                fz.a aVar7 = (fz.a) ((mz.e) objQ26);
                                boolean zH12 = sVar4.h(b4Var2);
                                Object objQ27 = sVar4.Q();
                                if (zH12 || objQ27 == gVar3) {
                                    bt.a3 a3Var3 = new bt.a3(1, b4Var2, rt.b4.class, "playWordAudio", "playWordAudio(Ljava/lang/String;)V", 0, 28);
                                    sVar4.o0(a3Var3);
                                    objQ27 = a3Var3;
                                }
                                fz.c cVar8 = (fz.c) ((mz.e) objQ27);
                                boolean zH13 = sVar4.h(b4Var2);
                                Object objQ28 = sVar4.Q();
                                if (zH13 || objQ28 == gVar3) {
                                    rt.b4 b4Var5 = b4Var2;
                                    k3 k3Var = new k3(7, 0, rt.b4.class, b4Var5, "updateSettings", "updateSettings(IIIIIFZ)V");
                                    b4Var2 = b4Var5;
                                    sVar4.o0(k3Var);
                                    objQ28 = k3Var;
                                }
                                fz.j jVar2 = (fz.j) ((mz.e) objQ28);
                                boolean zH14 = sVar4.h(b0Var3) | sVar4.h(b4Var2) | sVar4.f(cVar4);
                                Object objQ29 = sVar4.Q();
                                if (zH14 || objQ29 == gVar3) {
                                    objQ29 = new l3(b0Var3, b1Var14, b4Var2, cVar4);
                                    sVar4.o0(objQ29);
                                }
                                fz.c cVar9 = (fz.c) ((mz.e) objQ29);
                                boolean zH15 = sVar4.h(b4Var2) | sVar4.f(b3Var);
                                Object objQ30 = sVar4.Q();
                                if (zH15 || objQ30 == gVar3) {
                                    rt.b4 b4Var6 = b4Var2;
                                    bp.x1 x1Var = new bp.x1(b4Var6, b3Var, b1Var16, b1Var7, b1Var6);
                                    b4Var2 = b4Var6;
                                    sVar4.o0(x1Var);
                                    objQ30 = x1Var;
                                }
                                fz.a aVar8 = (fz.a) objQ30;
                                boolean zH16 = sVar4.h(b4Var2);
                                Object objQ31 = sVar4.Q();
                                if (zH16 || objQ31 == gVar3) {
                                    bt.a3 a3Var4 = new bt.a3(1, b4Var2, rt.b4.class, "saveKnowledgeNoteForCurrent", "saveKnowledgeNoteForCurrent(Ljava/lang/String;)V", 0, 25);
                                    sVar4.o0(a3Var4);
                                    objQ31 = a3Var4;
                                }
                                fz.c cVar10 = (fz.c) ((mz.e) objQ31);
                                boolean zH17 = sVar4.h(b4Var2);
                                Object objQ32 = sVar4.Q();
                                if (zH17 || objQ32 == gVar3) {
                                    objQ32 = new bt.y2(0, b4Var2, rt.b4.class, "hideCurrentCardFromReview", "hideCurrentCardFromReview()V", 0, 19);
                                    sVar4.o0(objQ32);
                                }
                                fz.a aVar9 = (fz.a) ((mz.e) objQ32);
                                boolean zH18 = sVar4.h(b4Var2);
                                Object objQ33 = sVar4.Q();
                                if (zH18 || objQ33 == gVar3) {
                                    bt.y2 y2Var4 = new bt.y2(0, b4Var2, rt.b4.class, "updateScriptShortcutDisplay", "updateScriptShortcutDisplay()V", 0, 20);
                                    sVar4.o0(y2Var4);
                                    objQ33 = y2Var4;
                                }
                                rVar2 = null;
                                m3.f(q2Var2, lVar, kaVar, dcVar, aVar5, aVar6, cVar6, cVar7, aVar7, cVar8, jVar2, cVar9, aVar8, cVar10, aVar9, (fz.a) ((mz.e) objQ33), cVar2, sVar4, 0);
                                sVar3 = sVar4;
                                z13 = false;
                                sVar3.p(false);
                            }
                            sVar3.p(z13);
                        } else {
                            sVar3 = sVar4;
                            b1Var16 = b1Var16;
                            rVar2 = null;
                            if (kotlin.jvm.internal.m.a(r2Var2, rt.o2.f50180a)) {
                                sVar3.d0(1737165269);
                                boolean zH19 = sVar3.h(b4Var3);
                                Object objQ34 = sVar3.Q();
                                if (zH19 || objQ34 == gVar3) {
                                    bt.y2 y2Var5 = new bt.y2(0, b4Var3, rt.b4.class, "retryLoadingFlashCards", "retryLoadingFlashCards()V", 0, 21);
                                    sVar3.o0(y2Var5);
                                    objQ34 = y2Var5;
                                }
                                p2.e((fz.a) ((mz.e) objQ34), sVar3, 0);
                                sVar3.p(false);
                            } else {
                                if (!(r2Var2 instanceof rt.p2)) {
                                    throw nv.p.x(sVar3, 1737085611, false);
                                }
                                sVar3.d0(1737170661);
                                rt.r2 r2Var4 = (rt.r2) b1Var15.getValue();
                                kotlin.jvm.internal.m.d(r2Var4, "null cannot be cast to non-null type com.lingodeer.course.viewmodels.CourseFlashCardScreenUiState.Loading");
                                tv.a.g(((rt.p2) r2Var4).f50229a, null, sVar3, 0, 6);
                                sVar3.p(false);
                            }
                        }
                        if (!((Boolean) b1Var16.getValue()).booleanValue() || ((Boolean) b1Var12.getValue()).booleanValue()) {
                            z12 = false;
                            sVar3.d0(-1996839816);
                        } else {
                            sVar3.d0(-1982066580);
                            g.a(54, aVar3, sVar3, rVar2);
                            z12 = false;
                        }
                        sVar3.p(z12);
                        sVar3.p(true);
                    } else {
                        sVar4.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar), sVar, 56);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.q1(reviewList, z11, aVar, cVar, cVar2, b4Var, i11, 4);
        }
    }

    public static final void h(l1.b1 b1Var, l1.b1 b1Var2, rt.b4 b4Var, l1.b1 b1Var3, rt.m0 m0Var, boolean z11, fz.a aVar) {
        rt.m0 m0Var2;
        if (m0Var == null || z11) {
            aVar.invoke();
            return;
        }
        if (((Boolean) b1Var.getValue()).booleanValue()) {
            rt.m0 m0Var3 = (rt.m0) b1Var2.getValue();
            if (!kotlin.jvm.internal.m.a(m0Var3 != null ? m0Var3.f50042a : null, m0Var.f50042a) && (m0Var2 = (rt.m0) b1Var2.getValue()) != null) {
                b4Var.f(m0Var2, "__default_bookmark_folder__");
            }
        }
        b1Var3.setValue(m0Var);
    }

    public static final void i(rz.b0 b0Var, l1.b1 b1Var, rt.b4 b4Var, fz.c cVar, String str) {
        if (((Boolean) b1Var.getValue()).booleanValue()) {
            return;
        }
        b1Var.setValue(Boolean.TRUE);
        rz.e0.B(b0Var, null, null, new kr.w(12, b4Var, cVar, str, (vy.d) null), 3);
    }

    public static final void j(rt.n0 n0Var, z1.r rVar, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        Uri videoUri;
        boolean z11;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(2130641069);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(n0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(dVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            boolean zF = sVar.f(n0Var);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                WordSentenceCharacterType wordSentenceCharacterType = n0Var.f50110c;
                if (wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType) {
                    videoUri = ((WordSentenceCharacterType.WordType) wordSentenceCharacterType).getWord().getVideoUri();
                } else if (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) {
                    videoUri = ((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType).getSentence().getVideoUri();
                } else {
                    if (!(wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    videoUri = null;
                }
                objQ = videoUri;
                sVar.o0(objQ);
            }
            Uri uri = (Uri) objQ;
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
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
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            if (uri != null) {
                sVar.d0(-547126800);
                z11 = true;
                dt.y4.a(uri, j0.e2.d(z1.o.f58481a, 1.0f), null, true, 0L, null, null, sVar, 3120, 116);
                sVar.p(false);
            } else {
                z11 = true;
                sVar.d0(-546955463);
                hh.p0.x((i12 >> 6) & 14, dVar, sVar, false);
            }
            sVar.p(z11);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(n0Var, rVar, dVar, i11, 25);
        }
    }

    public static final void k(final z1.r rVar, float f5, float f11, long j11, g2.l lVar, float f12, t1.d dVar, l1.n nVar, final int i11) {
        t1.d dVar2;
        final float f13;
        final float f14;
        final long j12;
        final g2.l lVar2;
        final float f15;
        float f16;
        long j13;
        g2.l lVar3;
        float f17;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(408114658);
        int i12 = i11 | (sVar.f(rVar) ? 4 : 2) | 206256;
        if (sVar.T(i12 & 1, (599187 & i12) != 599186)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                f13 = 2;
                f16 = 8;
                j13 = ((h1.s1) sVar.j(h1.v1.f31180a)).A;
                lVar3 = new g2.l(new DashPathEffect(new float[]{15.0f, 20.0f}, CropImageView.DEFAULT_ASPECT_RATIO));
                f17 = 16;
            } else {
                sVar.W();
                f13 = f5;
                f16 = f11;
                j13 = j11;
                lVar3 = lVar;
                f17 = f12;
            }
            sVar.q();
            boolean zE = sVar.e(j13) | sVar.h(lVar3);
            Object objQ = sVar.Q();
            if (zE || objQ == l1.m.f39353a) {
                final float f18 = f13;
                final float f19 = f16;
                final g2.l lVar4 = lVar3;
                final long j14 = j13;
                objQ = new fz.c() { // from class: mt.e3
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        i2.d drawBehind = (i2.d) obj;
                        kotlin.jvm.internal.m.f(drawBehind, "$this$drawBehind");
                        float fE0 = drawBehind.e0(f18);
                        float fE1 = drawBehind.e0(f19);
                        float f21 = fE0 / 2;
                        i2.d.y(drawBehind, j14, (((long) Float.floatToRawIntBits(f21)) << 32) | (((long) Float.floatToRawIntBits(f21)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.d() >> 32)) - fE0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)) - fE0)) & 4294967295L), (((long) Float.floatToRawIntBits(fE1)) << 32) | (((long) Float.floatToRawIntBits(fE1)) & 4294967295L), new i2.h(fE0, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, lVar4, 14), 224);
                        return qy.b0.f48488a;
                    }
                };
                sVar.o0(objQ);
            }
            z1.r rVarA = j0.c.A(d2.h.d(rVar, (fz.c) objQ), f17);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarA);
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
            dVar2 = dVar;
            hh.p0.x(6, dVar2, sVar, true);
            f15 = f17;
            f14 = f16;
            lVar2 = lVar3;
            j12 = j13;
        } else {
            dVar2 = dVar;
            sVar.W();
            f13 = f5;
            f14 = f11;
            j12 = j11;
            lVar2 = lVar;
            f15 = f12;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            final t1.d dVar3 = dVar2;
            x1VarT.f39502d = new fz.e(f13, f14, j12, lVar2, f15, dVar3, i11) { // from class: mt.f3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ float f41406b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f41407c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f41408d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ g2.l f41409e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f41410f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ t1.d f41411t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1572865);
                    m3.k(this.f41405a, this.f41406b, this.f41407c, this.f41408d, this.f41409e, this.f41410f, this.f41411t, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }
}
