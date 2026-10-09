package nh;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdLesson;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import dt.j1;
import fr.j3;
import fr.p3;
import g2.f0;
import g2.x;
import h1.k7;
import h1.r4;
import h1.s1;
import h1.ua;
import h1.v1;
import hh.p0;
import iv.h0;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.t;
import j0.u;
import j0.z1;
import java.util.List;
import km.s0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.b3;
import l1.c3;
import l1.n;
import l1.q1;
import l1.s;
import l1.x1;
import ph.p;
import ry.l;
import w2.q0;
import y2.j;
import y2.k;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final void a(int i11, int i12, fz.a aVar, String str, n nVar, boolean z11, boolean z12) {
        k2.b bVarY;
        boolean z13;
        s sVar = (s) nVar;
        sVar.f0(367163366);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.f(str) ? 32 : 16);
        if ((i12 & 384) == 0) {
            i13 |= sVar.g(z11) ? 256 : 128;
        }
        int i14 = i13 | (sVar.h(aVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i14 & 1, (i14 & 9363) != 9362)) {
            u uVarA = t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            o oVar = o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = j.f56917f;
            l1.t.J(hVar, uVarA, sVar);
            y2.h hVar2 = j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            r rVarG = e2.g(e2.e(oVar, 1.0f), 72);
            boolean z14 = (57344 & i14) == 16384;
            Object objQ = sVar.Q();
            if (z14 || objQ == l1.m.f39353a) {
                objQ = new mt.e2(27, aVar);
                sVar.o0(objQ);
            }
            r rVarC2 = j0.c.C(d0.n.o(rVarG, true, null, (fz.a) objQ, 14), 26, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC3 = z1.a.c(sVar, rVarC2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, a2VarA, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            d0.n.c(se.k.y(i11, sVar, i14 & 14), null, e2.n(oVar, 24), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 440, 120);
            j0.c.g(sVar, e2.s(oVar, 32));
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            ua.b(str, new i1(1.0f, true), 0L, j3.A(16), null, n3.s.H, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, ((i14 >> 3) & 14) | 199680, 0, 131028);
            if (z11) {
                sVar.d0(2144271329);
                bVarY = se.k.y(R.drawable.ic_me_right_arrow, sVar, 0);
                sVar.p(false);
            } else {
                sVar.d0(2144361601);
                bVarY = se.k.y(R.drawable.ic_sub_intro_lock, sVar, 0);
                sVar.p(false);
            }
            r4.b(bVarY, null, e2.n(oVar, 18), x.c(((s1) sVar.j(v1.f31180a)).f31036s, 0.5f), sVar, 440, 0);
            sVar = sVar;
            sVar.p(true);
            if (z12) {
                sVar.d0(-1131611398);
                k7.g(j0.c.E(oVar, 64, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), (float) 0.5d, 0L, sVar, 54, 4);
                z13 = false;
            } else {
                z13 = false;
                sVar.d0(-1142740398);
            }
            sVar.p(z13);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f(i11, str, z11, z12, aVar, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0303  */
    /* JADX WARN: Code duplicated, block: B:103:0x034f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0355  */
    /* JADX WARN: Code duplicated, block: B:107:0x0364  */
    /* JADX WARN: Code duplicated, block: B:111:0x0376  */
    /* JADX WARN: Code duplicated, block: B:114:0x03af  */
    /* JADX WARN: Code duplicated, block: B:115:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:118:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:120:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:123:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:124:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:127:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:129:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:131:0x0558  */
    /* JADX WARN: Code duplicated, block: B:134:0x0567  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:66:0x011d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0138  */
    /* JADX WARN: Code duplicated, block: B:71:0x0142  */
    /* JADX WARN: Code duplicated, block: B:74:0x0154  */
    /* JADX WARN: Code duplicated, block: B:78:0x018e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0192  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:90:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:93:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:95:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:98:0x02ff  */
    public static final void b(PdLesson pdLesson, fz.a onBackClick, fz.c onLessonClick, fz.c onPurchasePrompt, boolean z11, ph.s sVar, n nVar, int i11, int i12) {
        ph.s sVar2;
        int i13;
        boolean z12;
        fz.c cVar;
        fz.c cVar2;
        boolean z13;
        s sVar3;
        PdLesson pdLesson2;
        ph.s sVar4;
        x1 x1VarT;
        ViewModelStoreOwner current;
        ph.s sVar5;
        boolean zH;
        Object objQ;
        l1.g gVar;
        String str;
        boolean zH2;
        Object objQ2;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        l1.g gVar2;
        int iHashCode2;
        boolean zH3;
        Object objQ3;
        int iHashCode3;
        y2.i iVar2;
        int iHashCode4;
        int iHashCode5;
        m.f(onBackClick, "onBackClick");
        m.f(onLessonClick, "onLessonClick");
        m.f(onPurchasePrompt, "onPurchasePrompt");
        s sVar6 = (s) nVar;
        sVar6.f0(-722701662);
        int i14 = (sVar6.h(pdLesson) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i14 |= sVar6.h(onBackClick) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i14 |= sVar6.h(onLessonClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i14 |= sVar6.h(onPurchasePrompt) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= sVar6.g(z11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((i12 & 32) == 0) {
            sVar2 = sVar;
            int i15 = sVar6.h(sVar2) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
            i13 = i14 | i15;
            if ((74899 & i13) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar6.T(i13 & 1, z12)) {
                sVar6.Y();
                if ((i11 & 1) == 0 && !sVar6.C()) {
                    sVar6.W();
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                    }
                } else if ((i12 & 32) != 0) {
                    sVar6.d0(-1614864554);
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar6, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModel viewModelA = i20.b.a(z.a(ph.s.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar6), null);
                    sVar6.p(false);
                    sVar2 = (ph.s) viewModelA;
                    i13 &= -458753;
                }
                int i16 = i13;
                sVar5 = sVar2;
                sVar6.q();
                b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(sVar5.f46914c, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar6, 0, 7);
                zH = sVar6.h(sVar5) | sVar6.h(pdLesson);
                objQ = sVar6.Q();
                gVar = l1.m.f39353a;
                if (zH || objQ == gVar) {
                    objQ = new h0(28, sVar5, pdLesson, null);
                    sVar6.o0(objQ);
                }
                l1.t.f((fz.e) objQ, pdLesson, sVar6);
                str = ((p) b3VarCollectAsStateWithLifecycle.getValue()).f46906d;
                if (str == null) {
                    sVar6.d0(666364216);
                } else {
                    sVar6.d0(666364217);
                    zH2 = sVar6.h(sVar5);
                    objQ2 = sVar6.Q();
                    if (zH2 || objQ2 == gVar) {
                        objQ2 = new s0(sVar5, null, 8);
                        sVar6.o0(objQ2);
                    }
                    l1.t.f((fz.e) objQ2, str, sVar6);
                }
                sVar6.p(false);
                o oVar = o.f58481a;
                r rVarD = e2.d(oVar, 1.0f);
                q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                iHashCode = Long.hashCode(sVar6.T);
                q1 q1VarL = sVar6.l();
                r rVarC = z1.a.c(sVar6, rVarD);
                k.J.getClass();
                iVar = j.f56913b;
                sVar6.h0();
                if (sVar6.S) {
                    sVar6.k(iVar);
                } else {
                    sVar6.r0();
                }
                y2.h hVar2 = j.f56917f;
                l1.t.J(hVar2, q0VarD, sVar6);
                y2.h hVar3 = j.f56916e;
                l1.t.J(hVar3, q1VarL, sVar6);
                hVar = j.f56918g;
                if (sVar6.S) {
                    gVar2 = gVar;
                } else {
                    gVar2 = gVar;
                    if (!m.a(sVar6.Q(), Integer.valueOf(iHashCode))) {
                    }
                    y2.h hVar4 = j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar6);
                    gc.h hVar5 = new gc.h((Context) sVar6.j(AndroidCompositionLocals_androidKt.f1200b));
                    Long lessonId = pdLesson.getLessonId();
                    m.e(lessonId, "getLessonId(...)");
                    long jLongValue = lessonId.longValue();
                    int[] iArr = bq.r.f4959a;
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    hVar5.f29004c = defpackage.e.n("https://res.lingodeer.com/deercast/", bq.m.g(cf.x.n().keyLanguage), "/icons/", bq.m.g(cf.x.n().keyLanguage) + "_" + jLongValue + "_large.jpg");
                    hVar5.b();
                    float f5 = (float) 280;
                    l1.g gVar3 = gVar2;
                    wb.k.c(hVar5.a(), e2.g(e2.e(oVar, 1.0f), f5), w2.i.f54514a, sVar6, 1573296, 4024);
                    r rVarG = e2.g(e2.e(oVar, 1.0f), f5);
                    long j11 = x.f28615b;
                    j0.o.a(d0.n.g(rVarG, p3.A(ns.o.L(new x(x.c(j11, 0.3f)), new x(x.c(j11, 0.6f)))), null, 6), sVar6, 6);
                    float f11 = 8;
                    r rVarB = j0.c.B(j0.c.F(e2.e(oVar, 1.0f)), 16, f11);
                    a2 a2VarA = z1.a(j0.i.f35309g, z1.c.M, sVar6, 54);
                    iHashCode2 = Long.hashCode(sVar6.T);
                    q1 q1VarL2 = sVar6.l();
                    r rVarC2 = z1.a.c(sVar6, rVarB);
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar);
                    } else {
                        sVar6.r0();
                    }
                    l1.t.J(hVar2, a2VarA, sVar6);
                    l1.t.J(hVar3, q1VarL2, sVar6);
                    if (sVar6.S || !m.a(sVar6.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar6, iHashCode2, hVar);
                    }
                    l1.t.J(hVar4, rVarC2, sVar6);
                    k7.h(onBackClick, null, false, null, a.f43776d, sVar6, 196608 | ((i16 >> 3) & 14), 30);
                    zH3 = sVar6.h(sVar5);
                    objQ3 = sVar6.Q();
                    if (zH3 || objQ3 == gVar3) {
                        objQ3 = new lt.e(sVar5, 5);
                        sVar6.o0(objQ3);
                    }
                    k7.h((fz.a) objQ3, null, false, null, t1.e.d(2129535268, new mt.r(b3VarCollectAsStateWithLifecycle, 5), sVar6), sVar6, 196608, 30);
                    sVar6.p(true);
                    r rVarD2 = e2.d(oVar, 1.0f);
                    j0.d dVar = j0.i.f35305c;
                    z1.h hVar6 = z1.c.O;
                    u uVarA = t.a(dVar, hVar6, sVar6, 0);
                    iHashCode3 = Long.hashCode(sVar6.T);
                    q1 q1VarL3 = sVar6.l();
                    r rVarC3 = z1.a.c(sVar6, rVarD2);
                    sVar6.h0();
                    if (sVar6.S) {
                        iVar2 = iVar;
                        sVar6.k(iVar2);
                    } else {
                        iVar2 = iVar;
                        sVar6.r0();
                    }
                    l1.t.J(hVar2, uVarA, sVar6);
                    l1.t.J(hVar3, q1VarL3, sVar6);
                    if (sVar6.S || !m.a(sVar6.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar6, iHashCode3, hVar);
                    }
                    l1.t.J(hVar4, rVarC3, sVar6);
                    r rVarC4 = j0.c.C(e2.g(e2.e(oVar, 1.0f), 240), 19, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    u uVarA2 = t.a(j0.i.f35306d, hVar6, sVar6, 6);
                    iHashCode4 = Long.hashCode(sVar6.T);
                    q1 q1VarL4 = sVar6.l();
                    r rVarC5 = z1.a.c(sVar6, rVarC4);
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar2);
                    } else {
                        sVar6.r0();
                    }
                    l1.t.J(hVar2, uVarA2, sVar6);
                    l1.t.J(hVar3, q1VarL4, sVar6);
                    if (sVar6.S || !m.a(sVar6.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar6, iHashCode4, hVar);
                    }
                    l1.t.J(hVar4, rVarC5, sVar6);
                    String title = pdLesson.getTitle();
                    m.e(title, "getTitle(...)");
                    long j12 = x.f28618e;
                    iu.k.h(title, null, j12, null, null, 0L, j3.A(12), j3.A(22), n3.s.L, 0L, null, 0, false, 2, 0, null, null, CropImageView.DEFAULT_ASPECT_RATIO, sVar6, 819462528, 1572864, 2030906);
                    sVar3 = sVar6;
                    j0.c.g(sVar3, e2.g(oVar, 9));
                    String titleTranslation = pdLesson.getTitleTranslation();
                    m.e(titleTranslation, "getTitleTranslation(...)");
                    iu.k.h(titleTranslation, null, j12, null, null, 0L, j3.A(12), j3.A(15), null, 0L, null, 0, false, 2, 0, null, null, CropImageView.DEFAULT_ASPECT_RATIO, sVar6, 14156160, 1572864, 2031418);
                    sVar3.p(true);
                    j0.c.g(sVar3, e2.g(oVar, 12));
                    float f12 = 24;
                    r rVarB2 = d2.h.b(e2.d(oVar, 1.0f), r0.f.f(f12, f12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12));
                    c3 c3Var = v1.f31180a;
                    r rVarE = j0.c.E(d0.n.y(d0.n.h(rVarB2, ((s1) sVar3.j(c3Var)).f31031n, f0.f28556b), d0.n.u(sVar3), false, 14), CropImageView.DEFAULT_ASPECT_RATIO, 32, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                    u uVarA3 = t.a(dVar, hVar6, sVar3, 0);
                    iHashCode5 = Long.hashCode(sVar3.T);
                    q1 q1VarL5 = sVar3.l();
                    r rVarC6 = z1.a.c(sVar3, rVarE);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(hVar2, uVarA3, sVar3);
                    l1.t.J(hVar3, q1VarL5, sVar3);
                    if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar);
                    }
                    l1.t.J(hVar4, rVarC6, sVar3);
                    float f13 = 18;
                    float f14 = 0;
                    pdLesson2 = pdLesson;
                    cVar = onLessonClick;
                    cVar2 = onPurchasePrompt;
                    z13 = z11;
                    k7.d(j0.c.C(e2.e(oVar, 1.0f), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), r0.f.d(f11), k7.p(((s1) sVar3.j(c3Var)).f31033p, sVar3, 0), k7.q(62, f14), null, t1.e.d(-581064153, new g(cVar, z13, pdLesson2, cVar2), sVar3), sVar3, 196614, 16);
                    float f15 = 40;
                    j0.c.g(sVar3, e2.g(oVar, f15));
                    k7.d(j0.c.C(e2.e(oVar, 1.0f), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), r0.f.d(f11), k7.p(((s1) sVar3.j(c3Var)).f31033p, sVar3, 0), k7.q(62, f14), null, t1.e.d(2079684816, new g(z13, pdLesson2, cVar, cVar2), sVar3), sVar3, 196614, 16);
                    p0.B(oVar, f15, sVar3, true, true);
                    sVar3.p(true);
                    sVar4 = sVar5;
                }
                defpackage.e.A(iHashCode, sVar6, iHashCode, hVar);
                y2.h hVar7 = j.f56915d;
                l1.t.J(hVar7, rVarC, sVar6);
                gc.h hVar8 = new gc.h((Context) sVar6.j(AndroidCompositionLocals_androidKt.f1200b));
                Long lessonId2 = pdLesson.getLessonId();
                m.e(lessonId2, "getLessonId(...)");
                long jLongValue2 = lessonId2.longValue();
                int[] iArr2 = bq.r.f4959a;
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                hVar8.f29004c = defpackage.e.n("https://res.lingodeer.com/deercast/", bq.m.g(cf.x.n().keyLanguage), "/icons/", bq.m.g(cf.x.n().keyLanguage) + "_" + jLongValue2 + "_large.jpg");
                hVar8.b();
                float f16 = (float) 280;
                l1.g gVar4 = gVar2;
                wb.k.c(hVar8.a(), e2.g(e2.e(oVar, 1.0f), f16), w2.i.f54514a, sVar6, 1573296, 4024);
                r rVarG2 = e2.g(e2.e(oVar, 1.0f), f16);
                long j13 = x.f28615b;
                j0.o.a(d0.n.g(rVarG2, p3.A(ns.o.L(new x(x.c(j13, 0.3f)), new x(x.c(j13, 0.6f)))), null, 6), sVar6, 6);
                float f17 = 8;
                r rVarB3 = j0.c.B(j0.c.F(e2.e(oVar, 1.0f)), 16, f17);
                a2 a2VarA2 = z1.a(j0.i.f35309g, z1.c.M, sVar6, 54);
                iHashCode2 = Long.hashCode(sVar6.T);
                q1 q1VarL6 = sVar6.l();
                r rVarC7 = z1.a.c(sVar6, rVarB3);
                sVar6.h0();
                if (sVar6.S) {
                    sVar6.k(iVar);
                } else {
                    sVar6.r0();
                }
                l1.t.J(hVar2, a2VarA2, sVar6);
                l1.t.J(hVar3, q1VarL6, sVar6);
                if (sVar6.S) {
                    defpackage.e.A(iHashCode2, sVar6, iHashCode2, hVar);
                } else {
                    defpackage.e.A(iHashCode2, sVar6, iHashCode2, hVar);
                }
                l1.t.J(hVar7, rVarC7, sVar6);
                k7.h(onBackClick, null, false, null, a.f43776d, sVar6, 196608 | ((i16 >> 3) & 14), 30);
                zH3 = sVar6.h(sVar5);
                objQ3 = sVar6.Q();
                if (zH3) {
                    objQ3 = new lt.e(sVar5, 5);
                    sVar6.o0(objQ3);
                } else {
                    objQ3 = new lt.e(sVar5, 5);
                    sVar6.o0(objQ3);
                }
                k7.h((fz.a) objQ3, null, false, null, t1.e.d(2129535268, new mt.r(b3VarCollectAsStateWithLifecycle, 5), sVar6), sVar6, 196608, 30);
                sVar6.p(true);
                r rVarD3 = e2.d(oVar, 1.0f);
                j0.d dVar2 = j0.i.f35305c;
                z1.h hVar9 = z1.c.O;
                u uVarA4 = t.a(dVar2, hVar9, sVar6, 0);
                iHashCode3 = Long.hashCode(sVar6.T);
                q1 q1VarL7 = sVar6.l();
                r rVarC8 = z1.a.c(sVar6, rVarD3);
                sVar6.h0();
                if (sVar6.S) {
                    iVar2 = iVar;
                    sVar6.k(iVar2);
                } else {
                    iVar2 = iVar;
                    sVar6.r0();
                }
                l1.t.J(hVar2, uVarA4, sVar6);
                l1.t.J(hVar3, q1VarL7, sVar6);
                if (sVar6.S) {
                    defpackage.e.A(iHashCode3, sVar6, iHashCode3, hVar);
                } else {
                    defpackage.e.A(iHashCode3, sVar6, iHashCode3, hVar);
                }
                l1.t.J(hVar7, rVarC8, sVar6);
                r rVarC9 = j0.c.C(e2.g(e2.e(oVar, 1.0f), 240), 19, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                u uVarA5 = t.a(j0.i.f35306d, hVar9, sVar6, 6);
                iHashCode4 = Long.hashCode(sVar6.T);
                q1 q1VarL8 = sVar6.l();
                r rVarC10 = z1.a.c(sVar6, rVarC9);
                sVar6.h0();
                if (sVar6.S) {
                    sVar6.k(iVar2);
                } else {
                    sVar6.r0();
                }
                l1.t.J(hVar2, uVarA5, sVar6);
                l1.t.J(hVar3, q1VarL8, sVar6);
                if (sVar6.S) {
                    defpackage.e.A(iHashCode4, sVar6, iHashCode4, hVar);
                } else {
                    defpackage.e.A(iHashCode4, sVar6, iHashCode4, hVar);
                }
                l1.t.J(hVar7, rVarC10, sVar6);
                String title2 = pdLesson.getTitle();
                m.e(title2, "getTitle(...)");
                long j14 = x.f28618e;
                iu.k.h(title2, null, j14, null, null, 0L, j3.A(12), j3.A(22), n3.s.L, 0L, null, 0, false, 2, 0, null, null, CropImageView.DEFAULT_ASPECT_RATIO, sVar6, 819462528, 1572864, 2030906);
                sVar3 = sVar6;
                j0.c.g(sVar3, e2.g(oVar, 9));
                String titleTranslation2 = pdLesson.getTitleTranslation();
                m.e(titleTranslation2, "getTitleTranslation(...)");
                iu.k.h(titleTranslation2, null, j14, null, null, 0L, j3.A(12), j3.A(15), null, 0L, null, 0, false, 2, 0, null, null, CropImageView.DEFAULT_ASPECT_RATIO, sVar6, 14156160, 1572864, 2031418);
                sVar3.p(true);
                j0.c.g(sVar3, e2.g(oVar, 12));
                float f18 = 24;
                r rVarB4 = d2.h.b(e2.d(oVar, 1.0f), r0.f.f(f18, f18, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12));
                c3 c3Var2 = v1.f31180a;
                r rVarE2 = j0.c.E(d0.n.y(d0.n.h(rVarB4, ((s1) sVar3.j(c3Var2)).f31031n, f0.f28556b), d0.n.u(sVar3), false, 14), CropImageView.DEFAULT_ASPECT_RATIO, 32, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                u uVarA6 = t.a(dVar2, hVar9, sVar3, 0);
                iHashCode5 = Long.hashCode(sVar3.T);
                q1 q1VarL9 = sVar3.l();
                r rVarC11 = z1.a.c(sVar3, rVarE2);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar2);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar2, uVarA6, sVar3);
                l1.t.J(hVar3, q1VarL9, sVar3);
                if (sVar3.S) {
                    defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar);
                } else {
                    defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar);
                }
                l1.t.J(hVar7, rVarC11, sVar3);
                float f19 = 18;
                float f110 = 0;
                pdLesson2 = pdLesson;
                cVar = onLessonClick;
                cVar2 = onPurchasePrompt;
                z13 = z11;
                k7.d(j0.c.C(e2.e(oVar, 1.0f), f19, CropImageView.DEFAULT_ASPECT_RATIO, 2), r0.f.d(f17), k7.p(((s1) sVar3.j(c3Var2)).f31033p, sVar3, 0), k7.q(62, f110), null, t1.e.d(-581064153, new g(cVar, z13, pdLesson2, cVar2), sVar3), sVar3, 196614, 16);
                float f111 = 40;
                j0.c.g(sVar3, e2.g(oVar, f111));
                k7.d(j0.c.C(e2.e(oVar, 1.0f), f19, CropImageView.DEFAULT_ASPECT_RATIO, 2), r0.f.d(f17), k7.p(((s1) sVar3.j(c3Var2)).f31033p, sVar3, 0), k7.q(62, f110), null, t1.e.d(2079684816, new g(z13, pdLesson2, cVar, cVar2), sVar3), sVar3, 196614, 16);
                p0.B(oVar, f111, sVar3, true, true);
                sVar3.p(true);
                sVar4 = sVar5;
            } else {
                cVar = onLessonClick;
                cVar2 = onPurchasePrompt;
                z13 = z11;
                sVar3 = sVar6;
                pdLesson2 = pdLesson;
                sVar3.W();
                sVar4 = sVar2;
            }
            x1VarT = sVar3.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new j1(pdLesson2, onBackClick, cVar, cVar2, z13, sVar4, i11, i12);
            }
        }
        sVar2 = sVar;
        i13 = i14 | i15;
        if ((74899 & i13) != 74898) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (sVar6.T(i13 & 1, z12)) {
            sVar6.Y();
            if ((i11 & 1) == 0) {
                if ((i12 & 32) != 0) {
                    sVar6.d0(-1614864554);
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar6, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModel viewModelA2 = i20.b.a(z.a(ph.s.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar6), null);
                    sVar6.p(false);
                    sVar2 = (ph.s) viewModelA2;
                    i13 &= -458753;
                }
            } else if ((i12 & 32) != 0) {
                sVar6.d0(-1614864554);
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar6, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA3 = i20.b.a(z.a(ph.s.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar6), null);
                sVar6.p(false);
                sVar2 = (ph.s) viewModelA3;
                i13 &= -458753;
            }
            int i17 = i13;
            sVar5 = sVar2;
            sVar6.q();
            b3 b3VarCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(sVar5.f46914c, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar6, 0, 7);
            zH = sVar6.h(sVar5) | sVar6.h(pdLesson);
            objQ = sVar6.Q();
            gVar = l1.m.f39353a;
            if (zH) {
                objQ = new h0(28, sVar5, pdLesson, null);
                sVar6.o0(objQ);
            } else {
                objQ = new h0(28, sVar5, pdLesson, null);
                sVar6.o0(objQ);
            }
            l1.t.f((fz.e) objQ, pdLesson, sVar6);
            str = ((p) b3VarCollectAsStateWithLifecycle2.getValue()).f46906d;
            if (str == null) {
                sVar6.d0(666364216);
            } else {
                sVar6.d0(666364217);
                zH2 = sVar6.h(sVar5);
                objQ2 = sVar6.Q();
                if (zH2) {
                    objQ2 = new s0(sVar5, null, 8);
                    sVar6.o0(objQ2);
                } else {
                    objQ2 = new s0(sVar5, null, 8);
                    sVar6.o0(objQ2);
                }
                l1.t.f((fz.e) objQ2, str, sVar6);
            }
            sVar6.p(false);
            o oVar2 = o.f58481a;
            r rVarD4 = e2.d(oVar2, 1.0f);
            q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
            iHashCode = Long.hashCode(sVar6.T);
            q1 q1VarL10 = sVar6.l();
            r rVarC12 = z1.a.c(sVar6, rVarD4);
            k.J.getClass();
            iVar = j.f56913b;
            sVar6.h0();
            if (sVar6.S) {
                sVar6.k(iVar);
            } else {
                sVar6.r0();
            }
            y2.h hVar10 = j.f56917f;
            l1.t.J(hVar10, q0VarD2, sVar6);
            y2.h hVar11 = j.f56916e;
            l1.t.J(hVar11, q1VarL10, sVar6);
            hVar = j.f56918g;
            if (sVar6.S) {
                gVar2 = gVar;
                if (!m.a(sVar6.Q(), Integer.valueOf(iHashCode))) {
                }
                y2.h hVar12 = j.f56915d;
                l1.t.J(hVar12, rVarC12, sVar6);
                gc.h hVar13 = new gc.h((Context) sVar6.j(AndroidCompositionLocals_androidKt.f1200b));
                Long lessonId3 = pdLesson.getLessonId();
                m.e(lessonId3, "getLessonId(...)");
                long jLongValue3 = lessonId3.longValue();
                int[] iArr3 = bq.r.f4959a;
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                hVar13.f29004c = defpackage.e.n("https://res.lingodeer.com/deercast/", bq.m.g(cf.x.n().keyLanguage), "/icons/", bq.m.g(cf.x.n().keyLanguage) + "_" + jLongValue3 + "_large.jpg");
                hVar13.b();
                float f112 = (float) 280;
                l1.g gVar5 = gVar2;
                wb.k.c(hVar13.a(), e2.g(e2.e(oVar2, 1.0f), f112), w2.i.f54514a, sVar6, 1573296, 4024);
                r rVarG3 = e2.g(e2.e(oVar2, 1.0f), f112);
                long j15 = x.f28615b;
                j0.o.a(d0.n.g(rVarG3, p3.A(ns.o.L(new x(x.c(j15, 0.3f)), new x(x.c(j15, 0.6f)))), null, 6), sVar6, 6);
                float f113 = 8;
                r rVarB5 = j0.c.B(j0.c.F(e2.e(oVar2, 1.0f)), 16, f113);
                a2 a2VarA3 = z1.a(j0.i.f35309g, z1.c.M, sVar6, 54);
                iHashCode2 = Long.hashCode(sVar6.T);
                q1 q1VarL11 = sVar6.l();
                r rVarC13 = z1.a.c(sVar6, rVarB5);
                sVar6.h0();
                if (sVar6.S) {
                    sVar6.k(iVar);
                } else {
                    sVar6.r0();
                }
                l1.t.J(hVar10, a2VarA3, sVar6);
                l1.t.J(hVar11, q1VarL11, sVar6);
                if (sVar6.S) {
                    defpackage.e.A(iHashCode2, sVar6, iHashCode2, hVar);
                } else {
                    defpackage.e.A(iHashCode2, sVar6, iHashCode2, hVar);
                }
                l1.t.J(hVar12, rVarC13, sVar6);
                k7.h(onBackClick, null, false, null, a.f43776d, sVar6, 196608 | ((i17 >> 3) & 14), 30);
                zH3 = sVar6.h(sVar5);
                objQ3 = sVar6.Q();
                if (zH3) {
                    objQ3 = new lt.e(sVar5, 5);
                    sVar6.o0(objQ3);
                } else {
                    objQ3 = new lt.e(sVar5, 5);
                    sVar6.o0(objQ3);
                }
                k7.h((fz.a) objQ3, null, false, null, t1.e.d(2129535268, new mt.r(b3VarCollectAsStateWithLifecycle2, 5), sVar6), sVar6, 196608, 30);
                sVar6.p(true);
                r rVarD5 = e2.d(oVar2, 1.0f);
                j0.d dVar3 = j0.i.f35305c;
                z1.h hVar14 = z1.c.O;
                u uVarA7 = t.a(dVar3, hVar14, sVar6, 0);
                iHashCode3 = Long.hashCode(sVar6.T);
                q1 q1VarL12 = sVar6.l();
                r rVarC14 = z1.a.c(sVar6, rVarD5);
                sVar6.h0();
                if (sVar6.S) {
                    iVar2 = iVar;
                    sVar6.k(iVar2);
                } else {
                    iVar2 = iVar;
                    sVar6.r0();
                }
                l1.t.J(hVar10, uVarA7, sVar6);
                l1.t.J(hVar11, q1VarL12, sVar6);
                if (sVar6.S) {
                    defpackage.e.A(iHashCode3, sVar6, iHashCode3, hVar);
                } else {
                    defpackage.e.A(iHashCode3, sVar6, iHashCode3, hVar);
                }
                l1.t.J(hVar12, rVarC14, sVar6);
                r rVarC15 = j0.c.C(e2.g(e2.e(oVar2, 1.0f), 240), 19, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                u uVarA8 = t.a(j0.i.f35306d, hVar14, sVar6, 6);
                iHashCode4 = Long.hashCode(sVar6.T);
                q1 q1VarL13 = sVar6.l();
                r rVarC16 = z1.a.c(sVar6, rVarC15);
                sVar6.h0();
                if (sVar6.S) {
                    sVar6.k(iVar2);
                } else {
                    sVar6.r0();
                }
                l1.t.J(hVar10, uVarA8, sVar6);
                l1.t.J(hVar11, q1VarL13, sVar6);
                if (sVar6.S) {
                    defpackage.e.A(iHashCode4, sVar6, iHashCode4, hVar);
                } else {
                    defpackage.e.A(iHashCode4, sVar6, iHashCode4, hVar);
                }
                l1.t.J(hVar12, rVarC16, sVar6);
                String title3 = pdLesson.getTitle();
                m.e(title3, "getTitle(...)");
                long j16 = x.f28618e;
                iu.k.h(title3, null, j16, null, null, 0L, j3.A(12), j3.A(22), n3.s.L, 0L, null, 0, false, 2, 0, null, null, CropImageView.DEFAULT_ASPECT_RATIO, sVar6, 819462528, 1572864, 2030906);
                sVar3 = sVar6;
                j0.c.g(sVar3, e2.g(oVar2, 9));
                String titleTranslation3 = pdLesson.getTitleTranslation();
                m.e(titleTranslation3, "getTitleTranslation(...)");
                iu.k.h(titleTranslation3, null, j16, null, null, 0L, j3.A(12), j3.A(15), null, 0L, null, 0, false, 2, 0, null, null, CropImageView.DEFAULT_ASPECT_RATIO, sVar6, 14156160, 1572864, 2031418);
                sVar3.p(true);
                j0.c.g(sVar3, e2.g(oVar2, 12));
                float f114 = 24;
                r rVarB6 = d2.h.b(e2.d(oVar2, 1.0f), r0.f.f(f114, f114, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12));
                c3 c3Var3 = v1.f31180a;
                r rVarE3 = j0.c.E(d0.n.y(d0.n.h(rVarB6, ((s1) sVar3.j(c3Var3)).f31031n, f0.f28556b), d0.n.u(sVar3), false, 14), CropImageView.DEFAULT_ASPECT_RATIO, 32, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                u uVarA9 = t.a(dVar3, hVar14, sVar3, 0);
                iHashCode5 = Long.hashCode(sVar3.T);
                q1 q1VarL14 = sVar3.l();
                r rVarC17 = z1.a.c(sVar3, rVarE3);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar2);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar10, uVarA9, sVar3);
                l1.t.J(hVar11, q1VarL14, sVar3);
                if (sVar3.S) {
                    defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar);
                } else {
                    defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar);
                }
                l1.t.J(hVar12, rVarC17, sVar3);
                float f115 = 18;
                float f116 = 0;
                pdLesson2 = pdLesson;
                cVar = onLessonClick;
                cVar2 = onPurchasePrompt;
                z13 = z11;
                k7.d(j0.c.C(e2.e(oVar2, 1.0f), f115, CropImageView.DEFAULT_ASPECT_RATIO, 2), r0.f.d(f113), k7.p(((s1) sVar3.j(c3Var3)).f31033p, sVar3, 0), k7.q(62, f116), null, t1.e.d(-581064153, new g(cVar, z13, pdLesson2, cVar2), sVar3), sVar3, 196614, 16);
                float f117 = 40;
                j0.c.g(sVar3, e2.g(oVar2, f117));
                k7.d(j0.c.C(e2.e(oVar2, 1.0f), f115, CropImageView.DEFAULT_ASPECT_RATIO, 2), r0.f.d(f113), k7.p(((s1) sVar3.j(c3Var3)).f31033p, sVar3, 0), k7.q(62, f116), null, t1.e.d(2079684816, new g(z13, pdLesson2, cVar, cVar2), sVar3), sVar3, 196614, 16);
                p0.B(oVar2, f117, sVar3, true, true);
                sVar3.p(true);
                sVar4 = sVar5;
            } else {
                gVar2 = gVar;
            }
            defpackage.e.A(iHashCode, sVar6, iHashCode, hVar);
            y2.h hVar15 = j.f56915d;
            l1.t.J(hVar15, rVarC12, sVar6);
            gc.h hVar16 = new gc.h((Context) sVar6.j(AndroidCompositionLocals_androidKt.f1200b));
            Long lessonId4 = pdLesson.getLessonId();
            m.e(lessonId4, "getLessonId(...)");
            long jLongValue4 = lessonId4.longValue();
            int[] iArr4 = bq.r.f4959a;
            LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
            hVar16.f29004c = defpackage.e.n("https://res.lingodeer.com/deercast/", bq.m.g(cf.x.n().keyLanguage), "/icons/", bq.m.g(cf.x.n().keyLanguage) + "_" + jLongValue4 + "_large.jpg");
            hVar16.b();
            float f118 = (float) 280;
            l1.g gVar6 = gVar2;
            wb.k.c(hVar16.a(), e2.g(e2.e(oVar2, 1.0f), f118), w2.i.f54514a, sVar6, 1573296, 4024);
            r rVarG4 = e2.g(e2.e(oVar2, 1.0f), f118);
            long j17 = x.f28615b;
            j0.o.a(d0.n.g(rVarG4, p3.A(ns.o.L(new x(x.c(j17, 0.3f)), new x(x.c(j17, 0.6f)))), null, 6), sVar6, 6);
            float f119 = 8;
            r rVarB7 = j0.c.B(j0.c.F(e2.e(oVar2, 1.0f)), 16, f119);
            a2 a2VarA4 = z1.a(j0.i.f35309g, z1.c.M, sVar6, 54);
            iHashCode2 = Long.hashCode(sVar6.T);
            q1 q1VarL15 = sVar6.l();
            r rVarC18 = z1.a.c(sVar6, rVarB7);
            sVar6.h0();
            if (sVar6.S) {
                sVar6.k(iVar);
            } else {
                sVar6.r0();
            }
            l1.t.J(hVar10, a2VarA4, sVar6);
            l1.t.J(hVar11, q1VarL15, sVar6);
            if (sVar6.S) {
                defpackage.e.A(iHashCode2, sVar6, iHashCode2, hVar);
            } else {
                defpackage.e.A(iHashCode2, sVar6, iHashCode2, hVar);
            }
            l1.t.J(hVar15, rVarC18, sVar6);
            k7.h(onBackClick, null, false, null, a.f43776d, sVar6, 196608 | ((i17 >> 3) & 14), 30);
            zH3 = sVar6.h(sVar5);
            objQ3 = sVar6.Q();
            if (zH3) {
                objQ3 = new lt.e(sVar5, 5);
                sVar6.o0(objQ3);
            } else {
                objQ3 = new lt.e(sVar5, 5);
                sVar6.o0(objQ3);
            }
            k7.h((fz.a) objQ3, null, false, null, t1.e.d(2129535268, new mt.r(b3VarCollectAsStateWithLifecycle2, 5), sVar6), sVar6, 196608, 30);
            sVar6.p(true);
            r rVarD6 = e2.d(oVar2, 1.0f);
            j0.d dVar4 = j0.i.f35305c;
            z1.h hVar17 = z1.c.O;
            u uVarA10 = t.a(dVar4, hVar17, sVar6, 0);
            iHashCode3 = Long.hashCode(sVar6.T);
            q1 q1VarL16 = sVar6.l();
            r rVarC19 = z1.a.c(sVar6, rVarD6);
            sVar6.h0();
            if (sVar6.S) {
                iVar2 = iVar;
                sVar6.k(iVar2);
            } else {
                iVar2 = iVar;
                sVar6.r0();
            }
            l1.t.J(hVar10, uVarA10, sVar6);
            l1.t.J(hVar11, q1VarL16, sVar6);
            if (sVar6.S) {
                defpackage.e.A(iHashCode3, sVar6, iHashCode3, hVar);
            } else {
                defpackage.e.A(iHashCode3, sVar6, iHashCode3, hVar);
            }
            l1.t.J(hVar15, rVarC19, sVar6);
            r rVarC110 = j0.c.C(e2.g(e2.e(oVar2, 1.0f), 240), 19, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            u uVarA11 = t.a(j0.i.f35306d, hVar17, sVar6, 6);
            iHashCode4 = Long.hashCode(sVar6.T);
            q1 q1VarL17 = sVar6.l();
            r rVarC111 = z1.a.c(sVar6, rVarC110);
            sVar6.h0();
            if (sVar6.S) {
                sVar6.k(iVar2);
            } else {
                sVar6.r0();
            }
            l1.t.J(hVar10, uVarA11, sVar6);
            l1.t.J(hVar11, q1VarL17, sVar6);
            if (sVar6.S) {
                defpackage.e.A(iHashCode4, sVar6, iHashCode4, hVar);
            } else {
                defpackage.e.A(iHashCode4, sVar6, iHashCode4, hVar);
            }
            l1.t.J(hVar15, rVarC111, sVar6);
            String title4 = pdLesson.getTitle();
            m.e(title4, "getTitle(...)");
            long j18 = x.f28618e;
            iu.k.h(title4, null, j18, null, null, 0L, j3.A(12), j3.A(22), n3.s.L, 0L, null, 0, false, 2, 0, null, null, CropImageView.DEFAULT_ASPECT_RATIO, sVar6, 819462528, 1572864, 2030906);
            sVar3 = sVar6;
            j0.c.g(sVar3, e2.g(oVar2, 9));
            String titleTranslation4 = pdLesson.getTitleTranslation();
            m.e(titleTranslation4, "getTitleTranslation(...)");
            iu.k.h(titleTranslation4, null, j18, null, null, 0L, j3.A(12), j3.A(15), null, 0L, null, 0, false, 2, 0, null, null, CropImageView.DEFAULT_ASPECT_RATIO, sVar6, 14156160, 1572864, 2031418);
            sVar3.p(true);
            j0.c.g(sVar3, e2.g(oVar2, 12));
            float f1110 = 24;
            r rVarB8 = d2.h.b(e2.d(oVar2, 1.0f), r0.f.f(f1110, f1110, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12));
            c3 c3Var4 = v1.f31180a;
            r rVarE4 = j0.c.E(d0.n.y(d0.n.h(rVarB8, ((s1) sVar3.j(c3Var4)).f31031n, f0.f28556b), d0.n.u(sVar3), false, 14), CropImageView.DEFAULT_ASPECT_RATIO, 32, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            u uVarA12 = t.a(dVar4, hVar17, sVar3, 0);
            iHashCode5 = Long.hashCode(sVar3.T);
            q1 q1VarL18 = sVar3.l();
            r rVarC112 = z1.a.c(sVar3, rVarE4);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar2);
            } else {
                sVar3.r0();
            }
            l1.t.J(hVar10, uVarA12, sVar3);
            l1.t.J(hVar11, q1VarL18, sVar3);
            if (sVar3.S) {
                defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar);
            } else {
                defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar);
            }
            l1.t.J(hVar15, rVarC112, sVar3);
            float f1111 = 18;
            float f1112 = 0;
            pdLesson2 = pdLesson;
            cVar = onLessonClick;
            cVar2 = onPurchasePrompt;
            z13 = z11;
            k7.d(j0.c.C(e2.e(oVar2, 1.0f), f1111, CropImageView.DEFAULT_ASPECT_RATIO, 2), r0.f.d(f119), k7.p(((s1) sVar3.j(c3Var4)).f31033p, sVar3, 0), k7.q(62, f1112), null, t1.e.d(-581064153, new g(cVar, z13, pdLesson2, cVar2), sVar3), sVar3, 196614, 16);
            float f1113 = 40;
            j0.c.g(sVar3, e2.g(oVar2, f1113));
            k7.d(j0.c.C(e2.e(oVar2, 1.0f), f1111, CropImageView.DEFAULT_ASPECT_RATIO, 2), r0.f.d(f119), k7.p(((s1) sVar3.j(c3Var4)).f31033p, sVar3, 0), k7.q(62, f1112), null, t1.e.d(2079684816, new g(z13, pdLesson2, cVar, cVar2), sVar3), sVar3, 196614, 16);
            p0.B(oVar2, f1113, sVar3, true, true);
            sVar3.p(true);
            sVar4 = sVar5;
        } else {
            cVar = onLessonClick;
            cVar2 = onPurchasePrompt;
            z13 = z11;
            sVar3 = sVar6;
            pdLesson2 = pdLesson;
            sVar3.W();
            sVar4 = sVar2;
        }
        x1VarT = sVar3.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j1(pdLesson2, onBackClick, cVar, cVar2, z13, sVar4, i11, i12);
        }
    }

    public static final boolean c(PdLesson pdLesson) {
        List list = uh.a.f52967a;
        return l.D(c.a.n(), pdLesson.getLessonId());
    }
}
