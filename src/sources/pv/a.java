package pv;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bp.b0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.lingodeer.data.model.SyllableWriteCharacter;
import com.lingodeer.data.model.SyllableWriteLesson;
import com.yalantis.ucrop.view.CropImageView;
import h1.e0;
import h1.j0;
import h1.k7;
import iv.u;
import j0.e2;
import j0.g;
import j0.i;
import j0.i1;
import j0.v1;
import java.util.ArrayList;
import java.util.List;
import km.w0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import l1.z1;
import mt.k6;
import nv.e;
import nv.p;
import nv.y;
import qv.h;
import qv.j;
import t1.d;
import ue.f;
import y2.k;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f47184a = new d(new nv.b(27), false, 1910171800);

    public static final void a(ArrayList arrayList, String currentEnteredLessonKey, fz.a onClickLockedLesson, fz.c onLessonClick, n nVar, int i11) {
        int i12;
        s sVar;
        m.f(currentEnteredLessonKey, "currentEnteredLessonKey");
        m.f(onClickLockedLesson, "onClickLockedLesson");
        m.f(onLessonClick, "onLessonClick");
        s sVar2 = (s) nVar;
        sVar2.f0(1263722696);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(arrayList) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(currentEnteredLessonKey) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(onClickLockedLesson) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(onLessonClick) ? 2048 : 1024;
        }
        if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
            float f5 = 16;
            g gVarG = i.g(f5);
            v1 v1Var = new v1(f5, f5, f5, f5);
            boolean zH = sVar2.h(arrayList) | ((i12 & 112) == 32) | ((i12 & 896) == 256) | ((i12 & 7168) == 2048);
            Object objQ = sVar2.Q();
            if (zH || objQ == l1.m.f39353a) {
                e eVar = new e(arrayList, currentEnteredLessonKey, onClickLockedLesson, onLessonClick, 1);
                sVar2.o0(eVar);
                objQ = eVar;
            }
            sVar = sVar2;
            f.a(null, null, v1Var, gVarG, null, null, false, null, (fz.c) objQ, sVar, 24960, 491);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a(arrayList, currentEnteredLessonKey, onClickLockedLesson, onLessonClick, i11, 14);
        }
    }

    public static final void b(qv.c uiState, fz.a onClickLockedLesson, fz.c onLessonClick, n nVar, int i11) {
        m.f(uiState, "uiState");
        m.f(onClickLockedLesson, "onClickLockedLesson");
        m.f(onLessonClick, "onLessonClick");
        s sVar = (s) nVar;
        sVar.f0(-256992095);
        int i12 = (sVar.f(uiState) ? 4 : 2) | i11 | (sVar.h(onClickLockedLesson) ? 32 : 16) | (sVar.h(onLessonClick) ? 256 : 128);
        if (!sVar.T(i12 & 1, (i12 & 147) != 146)) {
            sVar.W();
        } else if (uiState.equals(qv.a.f48424a)) {
            sVar.d0(2138707536);
            tv.a.d(0, 1, sVar, null);
            sVar.p(false);
        } else {
            if (!(uiState instanceof qv.b)) {
                throw p.x(sVar, 2138705954, false);
            }
            sVar.d0(1875496036);
            qv.b bVar = (qv.b) uiState;
            a(bVar.f48425a, bVar.f48427c, onClickLockedLesson, onLessonClick, sVar, (i12 << 3) & 8064);
            sVar.p(false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(uiState, onClickLockedLesson, onLessonClick, i11, 11);
        }
    }

    public static final void c(SyllableWriteCharacter character, boolean z11, fz.c onClick, n nVar, int i11) {
        SyllableWriteCharacter syllableWriteCharacter;
        fz.c cVar;
        m.f(character, "character");
        m.f(onClick, "onClick");
        s sVar = (s) nVar;
        sVar.f0(-427334325);
        int i12 = i11 | (sVar.h(character) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(onClick) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = t.B(null);
                sVar.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            HwView hwView = (HwView) b1Var.getValue();
            Boolean boolValueOf = Boolean.valueOf(z11);
            int i13 = i12 & 896;
            boolean zH = (i13 == 256) | ((i12 & 112) == 32) | sVar.h(character);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                bt.n nVar2 = new bt.n(b1Var, character, z11, onClick, (vy.d) null);
                b1Var = b1Var;
                cVar = onClick;
                syllableWriteCharacter = character;
                sVar.o0(nVar2);
                objQ2 = nVar2;
            } else {
                syllableWriteCharacter = character;
                cVar = onClick;
            }
            t.g(hwView, boolValueOf, (fz.e) objQ2, sVar);
            r rVarE = e2.e(j0.c.B(o.f58481a, 16, 8), 1.0f);
            boolean zH2 = sVar.h(syllableWriteCharacter) | (i13 == 256);
            Object objQ3 = sVar.Q();
            if (zH2 || objQ3 == gVar) {
                objQ3 = new c(0, cVar, syllableWriteCharacter);
                sVar.o0(objQ3);
            }
            k7.c((fz.a) objQ3, rVarE, false, null, null, null, null, t1.e.d(581085622, new at.p(27, syllableWriteCharacter, b1Var), sVar), sVar, 100663344, 252);
        } else {
            syllableWriteCharacter = character;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0(syllableWriteCharacter, z11, onClick, i11, 11);
        }
    }

    public static final void d(int i11, fz.c playAudio, List characters, n nVar, r rVar) {
        int i12;
        m.f(characters, "characters");
        m.f(playAudio, "playAudio");
        s sVar = (s) nVar;
        sVar.f0(1418921227);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(characters) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = t.B(null);
                sVar.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            v1 v1VarD = j0.c.d(CropImageView.DEFAULT_ASPECT_RATIO, 8, 1);
            boolean zH = sVar.h(characters) | ((i12 & 896) == 256);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new u(characters, playAudio, b1Var, 1);
                sVar.o0(objQ2);
            }
            f.a(rVar, null, v1VarD, null, null, null, false, null, (fz.c) objQ2, sVar, ((i12 >> 3) & 14) | 384, 506);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w0(characters, rVar, playAudio, i11);
        }
    }

    public static final void e(SyllableWriteLesson lesson, fz.a onBackClick, fz.c onClickPractice, j jVar, n nVar, int i11) {
        j jVar2;
        int i12;
        j jVar3;
        m.f(lesson, "lesson");
        m.f(onBackClick, "onBackClick");
        m.f(onClickPractice, "onClickPractice");
        s sVar = (s) nVar;
        sVar.f0(1876434178);
        int i13 = i11 | (sVar.h(lesson) ? 4 : 2) | (sVar.h(onBackClick) ? 32 : 16) | (sVar.h(onClickPractice) ? 256 : 128) | 1024;
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            sVar.Y();
            int i14 = i11 & 1;
            l1.g gVar = l1.m.f39353a;
            if (i14 == 0 || sVar.C()) {
                boolean zH = sVar.h(lesson);
                Object objQ = sVar.Q();
                if (zH || objQ == gVar) {
                    objQ = new lt.e(lesson, 15);
                    sVar.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(j.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), aVar);
                sVar.p(false);
                j jVar4 = (j) viewModelA;
                i12 = i13 & (-7169);
                jVar3 = jVar4;
            } else {
                sVar.W();
                i12 = i13 & (-7169);
                jVar3 = jVar;
            }
            sVar.q();
            b1 b1VarO = t.o(jVar3.f48446e, sVar);
            b1 b1VarO2 = t.o(jVar3.f48445d, sVar);
            h hVar = (h) b1VarO.getValue();
            int iIntValue = ((Number) b1VarO2.getValue()).intValue();
            boolean zH2 = sVar.h(jVar3);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                objQ2 = new ot.e2(jVar3, 5);
                sVar.o0(objQ2);
            }
            f(hVar, iIntValue, onBackClick, (fz.c) objQ2, onClickPractice, sVar, ((i12 << 6) & 57344) | ((i12 << 3) & 896));
            jVar2 = jVar3;
        } else {
            sVar.W();
            jVar2 = jVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new pr.t(lesson, onBackClick, onClickPractice, jVar2, i11);
        }
    }

    public static final void f(final h uiState, final int i11, final fz.a onBackClick, final fz.c playAudio, final fz.c onClickPractice, n nVar, final int i12) {
        int i13;
        h hVar;
        fz.c cVar;
        x1 x1VarT;
        fz.e eVar;
        m.f(uiState, "uiState");
        m.f(onBackClick, "onBackClick");
        m.f(playAudio, "playAudio");
        m.f(onClickPractice, "onClickPractice");
        s sVar = (s) nVar;
        sVar.f0(-1265197743);
        if ((i12 & 6) == 0) {
            i13 = ((i12 & 8) == 0 ? sVar.f(uiState) : sVar.h(uiState) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.d(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar.h(onBackClick) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.h(playAudio) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= sVar.h(onClickPractice) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (!sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            hVar = uiState;
            cVar = onClickPractice;
            sVar.W();
        } else {
            if (!uiState.equals(qv.f.f48435a)) {
                if (!(uiState instanceof qv.g)) {
                    throw p.x(sVar, -379275829, false);
                }
                sVar.d0(1127474013);
                if (i11 < 100) {
                    sVar.d0(1127469053);
                    tv.a.g(i11 / 100.0f, null, sVar, 0, 6);
                    sVar.p(false);
                    sVar.p(false);
                    x1VarT = sVar.t();
                    if (x1VarT == null) {
                        return;
                    }
                    final int i14 = 0;
                    eVar = new fz.e() { // from class: pv.b
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i14) {
                                case 0:
                                    ((Integer) obj2).intValue();
                                    a.f(uiState, i11, onBackClick, playAudio, onClickPractice, (n) obj, t.M(i12 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    a.f(uiState, i11, onBackClick, playAudio, onClickPractice, (n) obj, t.M(i12 | 1));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                } else {
                    sVar.d0(1124007345);
                    sVar.p(false);
                    j0.u uVarA = j0.t.a(i.f35305c, z1.c.O, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    o oVar = o.f58481a;
                    r rVarC = z1.a.c(sVar, oVar);
                    k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    t.J(y2.j.f56917f, uVarA, sVar);
                    t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
                    }
                    t.J(y2.j.f56915d, rVarC, sVar);
                    hVar = uiState;
                    e0.c(t1.e.d(718898276, new mt.r(uiState, 12), sVar), null, t1.e.d(-414925790, new y(8, onBackClick), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
                    List list = ((qv.g) hVar).f48437b;
                    if (!(((double) 1.0f) > 0.0d)) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    d((i13 >> 3) & 896, playAudio, list, sVar, new i1(1.0f, true));
                    boolean z11 = ((i13 & 14) == 4 || ((i13 & 8) != 0 && sVar.h(hVar))) | ((57344 & i13) == 16384);
                    Object objQ = sVar.Q();
                    if (z11 || objQ == l1.m.f39353a) {
                        cVar = onClickPractice;
                        objQ = new z1(29, cVar, hVar);
                        sVar.o0(objQ);
                    } else {
                        cVar = onClickPractice;
                    }
                    float f5 = 16;
                    k7.b((fz.a) objQ, e2.g(j0.c.E(j0.c.C(j0.c.v(e2.e(oVar, 1.0f)), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, 7), 42), false, null, null, j0.b(2, 4, 28), null, null, f47184a, sVar, 805306368, 476);
                    sVar = sVar;
                    sVar.p(true);
                    sVar.p(false);
                }
                x1VarT.f39502d = eVar;
            }
            sVar.d0(-379275552);
            tv.a.d(0, 1, sVar, null);
            sVar.p(false);
            hVar = uiState;
            cVar = onClickPractice;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i15 = 1;
            final h hVar3 = hVar;
            final fz.c cVar2 = cVar;
            eVar = new fz.e() { // from class: pv.b
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    switch (i15) {
                        case 0:
                            ((Integer) obj2).intValue();
                            a.f(hVar3, i11, onBackClick, playAudio, cVar2, (n) obj, t.M(i12 | 1));
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            a.f(hVar3, i11, onBackClick, playAudio, cVar2, (n) obj, t.M(i12 | 1));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }
}
