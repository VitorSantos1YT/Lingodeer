package iv;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.dc;
import h1.fc;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.z1;
import l1.c3;
import l1.q1;
import l1.x1;
import rt.cb;
import rt.db;
import rt.eb;
import rt.fb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f34792a = g2.f0.e(4281697231L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f34793b = g2.f0.e(4292824832L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f34794c = g2.f0.e(4282413312L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f34795d = 0;

    public static final void a(int i11, String str, l1.n nVar, z1.r rVar) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1177354596);
        int i12 = (sVar.f(str) ? 4 : 2) | i11 | (sVar.f(rVar) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
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
            d(sVar, 0);
            f(i12 & 14, 2, str, sVar, null);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.a(str, rVar, i11, 2);
        }
    }

    public static final void b(fz.c cVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1485971703);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.h(cVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = e2.e(oVar, 1.0f);
            c3 c3Var = v1.f31180a;
            float f5 = 8;
            z1.r rVarA = j0.c.A(d0.n.h(rVarE, ((s1) sVar.j(c3Var)).f31033p, r0.f.d(f5)), f5);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarA);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, a2VarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            int i13 = i12 & 14;
            boolean z11 = i13 == 4;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new bt.g(cVar, 12);
                sVar.o0(objQ);
            }
            float f11 = 12;
            z1.r rVarB = j0.c.B(d0.n.h(iu.k.q(6, 7, (fz.a) objQ, sVar, oVar, false), ((s1) sVar.j(c3Var)).f31035r, r0.f.d(6)), 16, f11);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarB);
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
            l1.t.J(hVar4, rVarC2, sVar);
            ua.b("わたし", null, f34793b, j3.A(18), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 3462, 0, 130546);
            j0.c.g(sVar, e2.g(oVar, 10));
            ua.b("私", null, f34792a, j3.A(20), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 3462, 0, 130546);
            sVar = sVar;
            sVar.p(true);
            z1.r rVarE2 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j0.u uVarA2 = j0.t.a(j0.i.g(18), z1.c.O, sVar, 6);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarE2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            String strE0 = ub.a.e0(sVar, R.string.furigana);
            boolean z12 = i13 == 4;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new bt.g(cVar, 13);
                sVar.o0(objQ2);
            }
            a(0, strE0, sVar, iu.k.q(6, 7, (fz.a) objQ2, sVar, oVar, false));
            String strE1 = ub.a.e0(sVar, R.string.kanji_table);
            boolean z13 = i13 == 4;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new bt.g(cVar, 14);
                sVar.o0(objQ3);
            }
            a(0, strE1, sVar, iu.k.q(6, 7, (fz.a) objQ3, sVar, oVar, false));
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d(cVar, i11, 3);
        }
    }

    public static final void c(fz.c cVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1480079944);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.h(cVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            ua.b(ub.a.e0(sVar, R.string.hiragana), e2.e(z1.o.f58481a, 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30174g, sVar, 48, 0, 65532);
            sVar = sVar;
            o(cVar, sVar, i12 & 14);
            e(ub.a.e0(sVar, R.string.hiragana_originates_from_the_cursive_script_of_chinese_calligraphy_the_form_of_hiragana_is_round_and_smooth_without_any_sharp_angles_hiragana_is_a_phonetic_lettering_system_it_can_be_used_to_represent_the_pronunciation_of_a_kanji_as_well_as_used_alone_as_a_character_in_writing_when_hiragana_is_used_as_a_character_on_its_own_it_can_be_a_segment_of_a_word_or_a_grammatical_element_in_a_sentence_such_as_a_particle), sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d(cVar, i11, 4);
        }
    }

    public static final void d(l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-409621302);
        if (sVar.T(i11 & 1, i11 != 0)) {
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar);
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
            z1.r rVarB = d2.h.b(e2.n(oVar, 3), r0.f.f48733a);
            c3 c3Var = v1.f31180a;
            long j11 = ((s1) sVar.j(c3Var)).f31017a;
            g2.r0 r0Var = g2.f0.f28556b;
            j0.o.a(d0.n.h(rVarB, j11, r0Var), sVar, 0);
            j0.o.a(d0.n.h(e2.g(e2.s(oVar, 16), 1), ((s1) sVar.j(c3Var)).f31017a, r0Var), sVar, 0);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(i11, 1);
        }
    }

    public static final void e(String str, l1.n nVar, int i11) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1271765838);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar2.j(fc.f30256a)).f30177j, ((s1) sVar2.j(v1.f31180a)).f31036s, j3.A(16), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, i12 & 14, 0, 65534);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.e0(str, i11, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    public static final void f(int i11, int i12, String str, l1.n nVar, z1.r rVar) {
        int i13;
        z1.r rVar2;
        boolean z11;
        l1.s sVar;
        z1.r rVar3;
        x1 x1VarT;
        z1.r rVar4;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1947614809);
        if ((i11 & 6) == 0) {
            i13 = i11 | (sVar2.f(str) ? 4 : 2);
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i13 |= sVar2.f(rVar2) ? 32 : 16;
            }
            if ((i13 & 19) != 18) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar2.T(i13 & 1, z11)) {
                if (i14 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                c3 c3Var = v1.f31180a;
                float f5 = 8;
                sVar = sVar2;
                ua.b(str, j0.c.B(d0.n.h(rVar4, ((s1) sVar2.j(c3Var)).f31017a, r0.f.a()), f5, f5), ((s1) sVar2.j(c3Var)).f31019b, j3.A(16), null, null, null, 0L, new u3.k(3), 0L, 0, false, 1, 0, null, sVar, (i13 & 14) | 3072, 3072, 122352);
                rVar3 = rVar4;
            } else {
                sVar = sVar2;
                sVar.W();
                rVar3 = rVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new bt.z(str, rVar3, i11, i12, 2);
            }
        }
        i13 |= 48;
        rVar2 = rVar;
        if ((i13 & 19) != 18) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar2.T(i13 & 1, z11)) {
            if (i14 != 0) {
                rVar4 = z1.o.f58481a;
            } else {
                rVar4 = rVar2;
            }
            c3 c3Var2 = v1.f31180a;
            float f11 = 8;
            sVar = sVar2;
            ua.b(str, j0.c.B(d0.n.h(rVar4, ((s1) sVar2.j(c3Var2)).f31017a, r0.f.a()), f11, f11), ((s1) sVar2.j(c3Var2)).f31019b, j3.A(16), null, null, null, 0L, new u3.k(3), 0L, 0, false, 1, 0, null, sVar, (i13 & 14) | 3072, 3072, 122352);
            rVar3 = rVar4;
        } else {
            sVar = sVar2;
            sVar.W();
            rVar3 = rVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.z(str, rVar3, i11, i12, 2);
        }
    }

    public static final void g(String str, long j11, l1.n nVar, int i11) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1535415632);
        if (sVar2.T(i11 & 1, (i11 & 19) != 18)) {
            sVar = sVar2;
            ua.b(str, null, j11, j3.A(32), null, n3.s.H, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 200070, 0, 131026);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new gr.d(i11, 1, j11, str);
        }
    }

    public static final void h(int i11, long j11, String str, l1.n nVar, z1.r rVar) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-112810295);
        int i12 = i11 | (sVar2.f(rVar) ? 256 : 128);
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            sVar = sVar2;
            ua.b(str, j0.c.B(d0.n.h(rVar, ((s1) sVar2.j(v1.f31180a)).f31035r, r0.f.d(6)), 4, 2), j11, j3.A(32), null, n3.s.H, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 200070, 0, 131024);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new gr.i(str, j11, rVar, i11);
        }
    }

    public static final void i(int i11, fz.a aVar, fz.c cVar, fz.c cVar2, l1.n nVar, int i12) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(194323334);
        int i13 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.h(aVar) ? 32 : 16) | (sVar.h(cVar) ? 256 : 128) | (sVar.h(cVar2) ? 2048 : 1024);
        if (!sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            sVar.W();
        } else if (i11 == 2) {
            sVar.d0(2061137221);
            p(aVar, cVar2, sVar, ((i13 >> 6) & 112) | ((i13 >> 3) & 14));
            sVar.p(false);
        } else {
            sVar.d0(-529102075);
            float f5 = 16;
            z1.r rVarY = d0.n.y(j0.c.A(z1.o.f58481a, f5), d0.n.u(sVar), false, 14);
            j0.u uVarA = j0.t.a(j0.i.g(f5), z1.c.O, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarY);
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
            if (i11 != 0) {
                if (i11 != 1) {
                    sVar.d0(-1309624173);
                } else {
                    sVar.d0(96526357);
                    c(cVar, sVar, (i13 >> 6) & 14);
                }
                sVar.p(false);
            } else {
                sVar.d0(96524216);
                l(cVar2, sVar, (i13 >> 9) & 14);
                sVar.p(false);
            }
            sVar.p(true);
            sVar.p(false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(i11, aVar, cVar, cVar2, i12);
        }
    }

    public static final void j(fz.a onBackClick, fz.a onStartLearningClick, mv.n nVar, l1.n nVar2, int i11) {
        mv.n nVar3;
        int i12;
        mv.n nVar4;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onStartLearningClick, "onStartLearningClick");
        l1.s sVar = (l1.s) nVar2;
        sVar.f0(1968569966);
        int i13 = i11 | (sVar.h(onBackClick) ? 4 : 2) | (sVar.h(onStartLearningClick) ? 32 : 16) | 128;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(mv.n.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-897);
                nVar4 = (mv.n) viewModelA;
            } else {
                sVar.W();
                i12 = i13 & (-897);
                nVar4 = nVar;
            }
            sVar.q();
            boolean zH = sVar.h(nVar4);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            vy.d dVar = null;
            if (zH || objQ == gVar) {
                objQ = new k(nVar4, dVar, 0);
                sVar.o0(objQ);
            }
            l1.t.f((fz.e) objQ, qy.b0.f48488a, sVar);
            mv.k kVar = (mv.k) l1.t.o(nVar4.H, sVar).getValue();
            if (kotlin.jvm.internal.m.a(kVar, mv.i.f42215a)) {
                sVar.d0(2010139005);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            } else {
                if (!(kVar instanceof mv.j)) {
                    throw nv.p.x(sVar, 2010137818, false);
                }
                sVar.d0(-2110120024);
                fb fbVar = ((mv.j) kVar).f42223a;
                if (fbVar instanceof db) {
                    sVar.d0(-2110041005);
                    tv.a.g(((db) fbVar).f49634a, null, sVar, 0, 6);
                    sVar.p(false);
                } else if (kotlin.jvm.internal.m.a(fbVar, eb.f49693a)) {
                    sVar.d0(2010148925);
                    tv.a.d(0, 1, sVar, null);
                    sVar.p(false);
                } else {
                    if (!kotlin.jvm.internal.m.a(fbVar, cb.f49585a)) {
                        throw nv.p.x(sVar, 2010142018, false);
                    }
                    sVar.d0(-2109804599);
                    boolean zH2 = sVar.h(nVar4);
                    Object objQ2 = sVar.Q();
                    if (zH2 || objQ2 == gVar) {
                        objQ2 = new h(nVar4, 0);
                        sVar.o0(objQ2);
                    }
                    fz.c cVar = (fz.c) objQ2;
                    boolean zH3 = sVar.h(nVar4);
                    Object objQ3 = sVar.Q();
                    if (zH3 || objQ3 == gVar) {
                        objQ3 = new h(nVar4, 1);
                        sVar.o0(objQ3);
                    }
                    k(onBackClick, onStartLearningClick, cVar, (fz.c) objQ3, null, sVar, i12 & 126, 16);
                    sVar.p(false);
                }
                sVar.p(false);
            }
            nVar3 = nVar4;
        } else {
            sVar.W();
            nVar3 = nVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i(onBackClick, onStartLearningClick, nVar3, i11, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0111  */
    /* JADX WARN: Code duplicated, block: B:69:0x011f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0162  */
    /* JADX WARN: Code duplicated, block: B:75:0x022b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0238  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void k(fz.a onBackClick, fz.a onStartLearningClick, fz.c cVar, fz.c cVar2, z1.r rVar, l1.n nVar, int i11, int i12) {
        int i13;
        fz.c cVar3;
        int i14;
        fz.c cVar4;
        int i15;
        int i16;
        boolean z11;
        fz.c cVar5;
        fz.c cVar6;
        z1.r rVar2;
        x1 x1VarT;
        l1.g gVar;
        fz.c cVar7;
        fz.c cVar8;
        Object objQ;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        Object objQ2;
        Object objQ3;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onStartLearningClick, "onStartLearningClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(484091146);
        if ((i11 & 6) == 0) {
            i13 = (sVar.h(onBackClick) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar.h(onStartLearningClick) ? 32 : 16;
        }
        int i17 = i12 & 4;
        if (i17 == 0) {
            if ((i11 & 384) == 0) {
                cVar3 = cVar;
                i13 |= sVar.h(cVar3) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    cVar4 = cVar2;
                    if (sVar.h(cVar4)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i13 | 24576;
                if ((i16 & 9363) != 9362) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar.T(i16 & 1, z11)) {
                    gVar = l1.m.f39353a;
                    if (i17 != 0) {
                        objQ3 = sVar.Q();
                        if (objQ3 == gVar) {
                            objQ3 = new in.c(5);
                            sVar.o0(objQ3);
                        }
                        cVar7 = (fz.c) objQ3;
                    } else {
                        cVar7 = cVar3;
                    }
                    if (i14 != 0) {
                        objQ2 = sVar.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new in.c(6);
                            sVar.o0(objQ2);
                        }
                        cVar8 = (fz.c) objQ2;
                    } else {
                        cVar8 = cVar4;
                    }
                    objQ = sVar.Q();
                    if (objQ == gVar) {
                        objQ = new hh.y(9);
                        sVar.o0(objQ);
                    }
                    o0.b bVarB = o0.w.b(0, 384, 3, (fz.a) objQ, sVar);
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarV = j0.c.v(oVar);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                    iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarV);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    h1.e0.c(a.f34661a, null, t1.e.d(1555594362, new at.o(17, onBackClick), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
                    float f5 = 28;
                    float f11 = 16;
                    j0.v1 v1Var = new j0.v1(f5, f11, f5, f11);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    fz.c cVar9 = cVar7;
                    fz.c cVar10 = cVar8;
                    ve.i.d(bVarB, new i1(1.0f, true), v1Var, null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(1470699009, new br.u(bVarB, onStartLearningClick, cVar9, cVar10, 2), sVar), sVar, 384, 16376);
                    ua.b((bVarB.k() + 1) + "/" + bVarB.m(), j0.c.E(e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f11, 7), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar.j(fc.f30256a)).m, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447), sVar, 48, 0, 65532);
                    sVar = sVar;
                    sVar.p(true);
                    cVar6 = cVar10;
                    rVar2 = oVar;
                    cVar5 = cVar9;
                } else {
                    sVar.W();
                    cVar5 = cVar3;
                    cVar6 = cVar4;
                    rVar2 = rVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new br.n(onBackClick, onStartLearningClick, cVar5, cVar6, rVar2, i11, i12);
                }
            }
            i13 |= 3072;
            cVar4 = cVar2;
            i16 = i13 | 24576;
            if ((i16 & 9363) != 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i16 & 1, z11)) {
                gVar = l1.m.f39353a;
                if (i17 != 0) {
                    objQ3 = sVar.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new in.c(5);
                        sVar.o0(objQ3);
                    }
                    cVar7 = (fz.c) objQ3;
                } else {
                    cVar7 = cVar3;
                }
                if (i14 != 0) {
                    objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new in.c(6);
                        sVar.o0(objQ2);
                    }
                    cVar8 = (fz.c) objQ2;
                } else {
                    cVar8 = cVar4;
                }
                objQ = sVar.Q();
                if (objQ == gVar) {
                    objQ = new hh.y(9);
                    sVar.o0(objQ);
                }
                o0.b bVarB2 = o0.w.b(0, 384, 3, (fz.a) objQ, sVar);
                z1.o oVar2 = z1.o.f58481a;
                z1.r rVarV2 = j0.c.v(oVar2);
                j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarV2);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA2, sVar);
                l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC2, sVar);
                h1.e0.c(a.f34661a, null, t1.e.d(1555594362, new at.o(17, onBackClick), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
                float f12 = 28;
                float f13 = 16;
                j0.v1 v1Var2 = new j0.v1(f12, f13, f12, f13);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                fz.c cVar11 = cVar7;
                fz.c cVar12 = cVar8;
                ve.i.d(bVarB2, new i1(1.0f, true), v1Var2, null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(1470699009, new br.u(bVarB2, onStartLearningClick, cVar11, cVar12, 2), sVar), sVar, 384, 16376);
                ua.b((bVarB2.k() + 1) + "/" + bVarB2.m(), j0.c.E(e2.e(oVar2, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f13, 7), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar.j(fc.f30256a)).m, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447), sVar, 48, 0, 65532);
                sVar = sVar;
                sVar.p(true);
                cVar6 = cVar12;
                rVar2 = oVar2;
                cVar5 = cVar11;
            } else {
                sVar.W();
                cVar5 = cVar3;
                cVar6 = cVar4;
                rVar2 = rVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new br.n(onBackClick, onStartLearningClick, cVar5, cVar6, rVar2, i11, i12);
            }
        }
        i13 |= 384;
        cVar3 = cVar;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                cVar4 = cVar2;
                if (sVar.h(cVar4)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i13 | 24576;
            if ((i16 & 9363) != 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i16 & 1, z11)) {
                gVar = l1.m.f39353a;
                if (i17 != 0) {
                    objQ3 = sVar.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new in.c(5);
                        sVar.o0(objQ3);
                    }
                    cVar7 = (fz.c) objQ3;
                } else {
                    cVar7 = cVar3;
                }
                if (i14 != 0) {
                    objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new in.c(6);
                        sVar.o0(objQ2);
                    }
                    cVar8 = (fz.c) objQ2;
                } else {
                    cVar8 = cVar4;
                }
                objQ = sVar.Q();
                if (objQ == gVar) {
                    objQ = new hh.y(9);
                    sVar.o0(objQ);
                }
                o0.b bVarB3 = o0.w.b(0, 384, 3, (fz.a) objQ, sVar);
                z1.o oVar3 = z1.o.f58481a;
                z1.r rVarV3 = j0.c.v(oVar3);
                j0.u uVarA3 = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL3 = sVar.l();
                z1.r rVarC3 = z1.a.c(sVar, rVarV3);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA3, sVar);
                l1.t.J(y2.j.f56916e, q1VarL3, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC3, sVar);
                h1.e0.c(a.f34661a, null, t1.e.d(1555594362, new at.o(17, onBackClick), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
                float f14 = 28;
                float f15 = 16;
                j0.v1 v1Var3 = new j0.v1(f14, f15, f14, f15);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                fz.c cVar13 = cVar7;
                fz.c cVar14 = cVar8;
                ve.i.d(bVarB3, new i1(1.0f, true), v1Var3, null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(1470699009, new br.u(bVarB3, onStartLearningClick, cVar13, cVar14, 2), sVar), sVar, 384, 16376);
                ua.b((bVarB3.k() + 1) + "/" + bVarB3.m(), j0.c.E(e2.e(oVar3, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f15, 7), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar.j(fc.f30256a)).m, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447), sVar, 48, 0, 65532);
                sVar = sVar;
                sVar.p(true);
                cVar6 = cVar14;
                rVar2 = oVar3;
                cVar5 = cVar13;
            } else {
                sVar.W();
                cVar5 = cVar3;
                cVar6 = cVar4;
                rVar2 = rVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new br.n(onBackClick, onStartLearningClick, cVar5, cVar6, rVar2, i11, i12);
            }
        }
        i13 |= 3072;
        cVar4 = cVar2;
        i16 = i13 | 24576;
        if ((i16 & 9363) != 9362) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar.T(i16 & 1, z11)) {
            gVar = l1.m.f39353a;
            if (i17 != 0) {
                objQ3 = sVar.Q();
                if (objQ3 == gVar) {
                    objQ3 = new in.c(5);
                    sVar.o0(objQ3);
                }
                cVar7 = (fz.c) objQ3;
            } else {
                cVar7 = cVar3;
            }
            if (i14 != 0) {
                objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = new in.c(6);
                    sVar.o0(objQ2);
                }
                cVar8 = (fz.c) objQ2;
            } else {
                cVar8 = cVar4;
            }
            objQ = sVar.Q();
            if (objQ == gVar) {
                objQ = new hh.y(9);
                sVar.o0(objQ);
            }
            o0.b bVarB4 = o0.w.b(0, 384, 3, (fz.a) objQ, sVar);
            z1.o oVar4 = z1.o.f58481a;
            z1.r rVarV4 = j0.c.v(oVar4);
            j0.u uVarA4 = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarV4);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA4, sVar);
            l1.t.J(y2.j.f56916e, q1VarL4, sVar);
            hVar = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC4, sVar);
            h1.e0.c(a.f34661a, null, t1.e.d(1555594362, new at.o(17, onBackClick), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            float f16 = 28;
            float f17 = 16;
            j0.v1 v1Var4 = new j0.v1(f16, f17, f16, f17);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            fz.c cVar15 = cVar7;
            fz.c cVar16 = cVar8;
            ve.i.d(bVarB4, new i1(1.0f, true), v1Var4, null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(1470699009, new br.u(bVarB4, onStartLearningClick, cVar15, cVar16, 2), sVar), sVar, 384, 16376);
            ua.b((bVarB4.k() + 1) + "/" + bVarB4.m(), j0.c.E(e2.e(oVar4, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f17, 7), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar.j(fc.f30256a)).m, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447), sVar, 48, 0, 65532);
            sVar = sVar;
            sVar.p(true);
            cVar6 = cVar16;
            rVar2 = oVar4;
            cVar5 = cVar15;
        } else {
            sVar.W();
            cVar5 = cVar3;
            cVar6 = cVar4;
            rVar2 = rVar;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.n(onBackClick, onStartLearningClick, cVar5, cVar6, rVar2, i11, i12);
        }
    }

    public static final void l(fz.c cVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-2017238218);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.h(cVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            ua.b(ub.a.e0(sVar, R.string.japanese_writing), e2.e(z1.o.f58481a, 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30174g, sVar, 48, 0, 65532);
            sVar = sVar;
            m(cVar, sVar, i12 & 14);
            e(ub.a.e0(sVar, R.string.the_japanese_writing_system_consists_of_three_different_systems_hiragana_katakana_and_kanji_for_example_this_simple_japanese_sentence_below_i_buy_a_television_includes_all_of_the_three), sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d(cVar, i11, 0);
        }
    }

    public static final void m(fz.c cVar, l1.n nVar, int i11) {
        int i12;
        fz.c cVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1278426107);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(cVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            float f5 = 8;
            z1.r rVarC = j0.c.C(d0.n.h(e2.e(z1.o.f58481a, 1.0f), ((s1) sVar.j(v1.f31180a)).f31033p, r0.f.d(f5)), CropImageView.DEFAULT_ASPECT_RATIO, f5, 1);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarC);
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
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            cVar2 = cVar;
            q(ub.a.e0(sVar, R.string.kanji_table), ub.a.e0(sVar, R.string.hiragana_table), ub.a.e0(sVar, R.string.katakana_table), cVar2, null, sVar, (i12 << 9) & 7168);
            sVar.p(true);
        } else {
            cVar2 = cVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d(cVar2, i11, 2);
        }
    }

    public static final void n(String str, String str2, fz.a aVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(482215590);
        int i12 = i11 | (sVar.f(str2) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = e2.e(oVar, 1.0f);
            boolean z11 = (i12 & 896) == 256;
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new et.p(17, aVar);
                sVar.o0(objQ);
            }
            z1.r rVarE2 = j0.c.E(iu.k.q(6, 7, (fz.a) objQ, sVar, rVarE, false), 24, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE2);
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
            z1.r rVarS = e2.s(oVar, 48);
            c3 c3Var = v1.f31180a;
            ua.b(str, j0.c.A(d0.n.h(rVarS, ((s1) sVar.j(c3Var)).f31035r, r0.f.d(6)), 8), ((s1) sVar.j(c3Var)).f31034q, j3.A(18), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 3078, 0, 130544);
            sVar = sVar;
            j0.c.g(sVar, e2.s(oVar, 16));
            d(sVar, 0);
            f((i12 >> 3) & 14, 2, str2, sVar, null);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f(i11, 0, aVar, str, str2);
        }
    }

    public static final void o(fz.c cVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1793711289);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(cVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            float f5 = 8;
            z1.r rVarA = j0.c.A(d0.n.h(e2.e(z1.o.f58481a, 1.0f), ((s1) sVar.j(v1.f31180a)).f31033p, r0.f.d(f5)), f5);
            j0.u uVarA = j0.t.a(j0.i.g(f5), z1.c.O, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarA);
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
            String strE0 = ub.a.e0(sVar, R.string.hiragana_table);
            int i13 = i12 & 14;
            boolean z11 = i13 == 4;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new bt.g(cVar, 9);
                sVar.o0(objQ);
            }
            n("あ", strE0, (fz.a) objQ, sVar, 6);
            String strE1 = ub.a.e0(sVar, R.string.katakana_table);
            boolean z12 = i13 == 4;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new bt.g(cVar, 10);
                sVar.o0(objQ2);
            }
            n("ア", strE1, (fz.a) objQ2, sVar, 6);
            String strE2 = ub.a.e0(sVar, R.string.romaji);
            boolean z13 = i13 == 4;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new bt.g(cVar, 11);
                sVar.o0(objQ3);
            }
            n("a", strE2, (fz.a) objQ3, sVar, 6);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d(cVar, i11, 1);
        }
    }

    public static final void p(fz.a aVar, fz.c cVar, l1.n nVar, int i11) {
        int i12;
        fz.a aVar2 = aVar;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(888971158);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(aVar2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(cVar) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarD = e2.d(oVar, 1.0f);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
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
            float f5 = 16;
            z1.r rVarE = e2.e(d0.n.y(j0.c.A(oVar, f5), d0.n.u(sVar), false, 14), 1.0f);
            j0.u uVarA = j0.t.a(j0.i.g(f5), z1.c.O, sVar, 6);
            int i13 = i12;
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarE);
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
            l1.t.J(hVar4, rVarC2, sVar);
            ua.b(ub.a.e0(sVar, R.string.kanji), e2.e(oVar, 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30174g, sVar, 48, 0, 65532);
            b(cVar, sVar, (i13 >> 3) & 14);
            e(ub.a.e0(sVar, R.string.there_are_massive_amounts_of_kanji_in_the_japanese_language_that_are_almost_identical_in_appearance_with_chinese_characters_yet_with_completely_different_pronunciations_and_denotations), sVar, 0);
            e(ub.a.e0(sVar, R.string.hiragana_placed_above_a_kanji_is_called_furigana_which_indicates_the_pronunciation_of_the_kanji_as_in_the_examples_below), sVar, 0);
            ep.a.C(oVar, 72, sVar, true);
            aVar2 = aVar;
            iu.k.e(aVar2, j0.r.f35391a.a(e2.e(j0.c.A(oVar, f5), 1.0f), z1.c.H), false, 0L, null, a.f34662b, sVar, (14 & i13) | 196608, 28);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e(aVar2, cVar, i11);
        }
    }

    public static final void q(String str, String str2, String str3, fz.c cVar, z1.r rVar, l1.n nVar, int i11) {
        int i12;
        z1.r rVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1999063758);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(str3) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(cVar) ? 2048 : 1024;
        }
        int i13 = i12 | 24576;
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = e2.e(oVar, 1.0f);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = n.f34788a;
                sVar.o0(objQ);
            }
            w2.q0 q0Var = (w2.q0) objQ;
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
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
            int i14 = i13 & 7168;
            boolean z11 = i14 == 2048;
            Object objQ2 = sVar.Q();
            if (z11 || objQ2 == gVar) {
                objQ2 = new bt.g(cVar, 15);
                sVar.o0(objQ2);
            }
            f(i13 & 14, 0, str, sVar, iu.k.q(6, 7, (fz.a) objQ2, sVar, oVar, false));
            boolean z12 = i14 == 2048;
            Object objQ3 = sVar.Q();
            if (z12 || objQ3 == gVar) {
                objQ3 = new bt.g(cVar, 16);
                sVar.o0(objQ3);
            }
            r(6, sVar, iu.k.q(6, 7, (fz.a) objQ3, sVar, oVar, false), true);
            boolean z13 = i14 == 2048;
            Object objQ4 = sVar.Q();
            if (z13 || objQ4 == gVar) {
                objQ4 = new bt.g(cVar, 17);
                sVar.o0(objQ4);
            }
            f((i13 >> 6) & 14, 0, str3, sVar, iu.k.q(6, 7, (fz.a) objQ4, sVar, oVar, false));
            boolean z14 = i14 == 2048;
            Object objQ5 = sVar.Q();
            if (z14 || objQ5 == gVar) {
                objQ5 = new bt.g(cVar, 18);
                sVar.o0(objQ5);
            }
            r(6, sVar, iu.k.q(6, 7, (fz.a) objQ5, sVar, oVar, false), true);
            boolean z15 = i14 == 2048;
            Object objQ6 = sVar.Q();
            if (z15 || objQ6 == gVar) {
                objQ6 = new bt.g(cVar, 19);
                sVar.o0(objQ6);
            }
            r(6, sVar, iu.k.q(6, 7, (fz.a) objQ6, sVar, oVar, false), false);
            boolean z16 = i14 == 2048;
            Object objQ7 = sVar.Q();
            if (z16 || objQ7 == gVar) {
                objQ7 = new bt.g(cVar, 20);
                sVar.o0(objQ7);
            }
            f((i13 >> 3) & 14, 0, str2, sVar, iu.k.q(6, 7, (fz.a) objQ7, sVar, oVar, false));
            boolean z17 = i14 == 2048;
            Object objQ8 = sVar.Q();
            if (z17 || objQ8 == gVar) {
                objQ8 = new bt.g(cVar, 21);
                sVar.o0(objQ8);
            }
            z1.r rVarQ = iu.k.q(6, 7, (fz.a) objQ8, sVar, oVar, false);
            long j11 = f34792a;
            h(54, j11, "私", sVar, rVarQ);
            boolean z18 = i14 == 2048;
            Object objQ9 = sVar.Q();
            if (z18 || objQ9 == gVar) {
                objQ9 = new bt.g(cVar, 22);
                sVar.o0(objQ9);
            }
            z1.r rVarQ2 = iu.k.q(6, 7, (fz.a) objQ9, sVar, oVar, false);
            long j12 = f34793b;
            h(54, j12, "は", sVar, rVarQ2);
            boolean z19 = i14 == 2048;
            Object objQ10 = sVar.Q();
            if (z19 || objQ10 == gVar) {
                objQ10 = new bt.g(cVar, 23);
                sVar.o0(objQ10);
            }
            h(54, f34794c, "テレビ", sVar, iu.k.q(6, 7, (fz.a) objQ10, sVar, oVar, false));
            g("を", j12, sVar, 54);
            g("買", j11, sVar, 54);
            g("う", j12, sVar, 54);
            ua.b("。", null, ((s1) sVar.j(v1.f31180a)).f31036s, j3.A(28), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 3078, 0, 131058);
            sVar = sVar;
            sVar.p(true);
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.e2(str, str2, str3, cVar, rVar2, i11, 5);
        }
    }

    public static final void r(int i11, l1.n nVar, z1.r rVar, boolean z11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1694057079);
        int i12 = (sVar.f(rVar) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
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
            g2.r0 r0Var = g2.f0.f28556b;
            z1.o oVar = z1.o.f58481a;
            if (z11) {
                sVar.d0(-1446160575);
            } else {
                sVar.d0(-1423676120);
                j0.o.a(d0.n.h(d2.h.b(e2.n(oVar, 3), r0.f.f48733a), ((s1) sVar.j(v1.f31180a)).f31017a, r0Var), sVar, 0);
            }
            sVar.p(false);
            z1.r rVarG = e2.g(e2.s(oVar, 1), 16);
            c3 c3Var = v1.f31180a;
            j0.o.a(d0.n.h(rVarG, ((s1) sVar.j(c3Var)).f31017a, r0Var), sVar, 0);
            if (z11) {
                sVar.d0(-1423259480);
                j0.o.a(d0.n.h(d2.h.b(e2.n(oVar, 3), r0.f.f48733a), ((s1) sVar.j(c3Var)).f31017a, r0Var), sVar, 0);
            } else {
                sVar.d0(-1446160575);
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new g(z11, rVar, i11, 0);
        }
    }
}
