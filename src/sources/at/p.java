package at;

import a0.k0;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwnerKt;
import bp.r0;
import bp.t3;
import ch.o0;
import ch.z;
import com.google.api.Service;
import com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity;
import com.lingo.lingoskill.ui.base.UpdateLessonActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.DayStreakWeeklyItem;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.SyllableWriteCharacter;
import com.yalantis.ucrop.view.CropImageView;
import dt.a0;
import dt.h2;
import dt.k3;
import f0.h1;
import f0.m0;
import f0.n0;
import fr.j3;
import g2.f0;
import h1.g7;
import h1.i9;
import h1.k7;
import h1.r4;
import h1.s1;
import h1.ua;
import h1.v1;
import iv.j0;
import j0.a2;
import j0.b2;
import j0.e2;
import j0.i1;
import j0.t1;
import j0.u;
import j0.u0;
import j0.v;
import j0.z1;
import j3.p0;
import j3.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import km.x0;
import kr.c1;
import kr.d0;
import kv.s0;
import l1.b1;
import l1.b3;
import l1.c3;
import l1.q1;
import l1.t;
import mt.j6;
import mt.k1;
import n3.g0;
import qp.m3;
import qy.b0;
import rt.jf;
import rt.me;
import rt.o1;
import rt.o8;
import rt.qc;
import rt.rc;
import rz.e0;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2917c;

    public /* synthetic */ p(int i11, Object obj, Object obj2) {
        this.f2915a = i11;
        this.f2916b = obj;
        this.f2917c = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        boolean z11;
        boolean z12;
        boolean z13;
        mh.i iVar = (mh.i) this.f2916b;
        fz.a aVar = (fz.a) this.f2917c;
        v Card = (v) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        z1.j jVar = z1.c.f58463a;
        kotlin.jvm.internal.m.f(Card, "$this$Card");
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            t.J(hVar, q0VarD, sVar);
            y2.h hVar2 = y2.j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            t.J(hVar4, rVarC, sVar);
            float f5 = 6;
            z1.r rVarA = j0.c.A(oVar, f5);
            j0.b bVar = j0.i.f35303a;
            a2 a2VarA = z1.a(bVar, z1.c.L, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarA);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            t.J(hVar, a2VarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            t.J(hVar, q0VarD2, sVar);
            t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            t.J(hVar4, rVarC3, sVar);
            gc.h hVar5 = new gc.h((Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b));
            hVar5.f29004c = iVar.f41138d;
            hVar5.b();
            wb.k.b(hVar5.a(), iVar.f41136b, d2.h.b(e2.p(oVar, 114, 111), r0.f.d(12)), se.k.y(R.drawable.ic_me_banner, sVar, 0), null, w2.i.f54514a, sVar, 4096, 64496);
            if (iVar.f41141g == mh.f.IN_PROGRESS) {
                sVar.d0(-1530352323);
                d0.n.c(se.k.y(R.drawable.ic_pd_lesson_inprogress, sVar, 0), null, j0.r.f35391a.a(j0.c.A(oVar, 4), z1.c.K), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 56, 120);
                z11 = false;
            } else {
                z11 = false;
                sVar.d0(-1539087472);
            }
            sVar.p(z11);
            sVar.p(true);
            j0.c.g(sVar, e2.s(oVar, 14));
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            z1.r rVarC4 = e2.c(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
            j0.e eVar = j0.i.f35309g;
            z1.h hVar6 = z1.c.O;
            u uVarA = j0.t.a(eVar, hVar6, sVar, 6);
            int iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarC4);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            t.J(hVar, uVarA, sVar);
            t.J(hVar2, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar3);
            }
            t.J(hVar4, rVarC5, sVar);
            float f11 = 8;
            z1.r rVarE = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, 11);
            u uVarA2 = j0.t.a(j0.i.f35305c, hVar6, sVar, 0);
            int iHashCode5 = Long.hashCode(sVar.T);
            q1 q1VarL5 = sVar.l();
            z1.r rVarC6 = z1.a.c(sVar, rVarE);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            t.J(hVar, uVarA2, sVar);
            t.J(hVar2, q1VarL5, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar3);
            }
            t.J(hVar4, rVarC6, sVar);
            ua.b(iVar.f41136b, null, 0L, j3.A(15), null, n3.s.K, null, 0L, null, 0L, 2, false, 2, 0, null, sVar, 199680, 3120, 120790);
            j0.c.g(sVar, e2.g(oVar, f11));
            ua.b(iVar.f41137c, null, ((s1) sVar.j(v1.f31180a)).f31036s, j3.A(14), null, n3.s.H, null, 0L, null, 0L, 2, false, 1, 0, null, sVar, 199680, 3120, 120786);
            sVar.p(true);
            z1.i iVar3 = z1.c.M;
            z1.r rVarE2 = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f11, 4, 3);
            a2 a2VarA2 = z1.a(bVar, iVar3, sVar, 48);
            int iHashCode6 = Long.hashCode(sVar.T);
            q1 q1VarL6 = sVar.l();
            z1.r rVarC7 = z1.a.c(sVar, rVarE2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            t.J(hVar, a2VarA2, sVar);
            t.J(hVar2, q1VarL6, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode6))) {
                defpackage.e.A(iHashCode6, sVar, iHashCode6, hVar3);
            }
            t.J(hVar4, rVarC7, sVar);
            sVar.d0(-1168520582);
            e20.a aVarA = q10.b.a(sVar);
            sVar.d0(-1633490746);
            boolean zF = sVar.f(null) | sVar.f(aVarA);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = w4.c.e(xt.u.class, aVarA, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            xt.u uVar = (xt.u) objQ;
            sVar.d0(-398489972);
            List list = iVar.f41140f;
            ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String lowerCase = ((mh.d) it.next()).a().toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                arrayList.add(ub.a.e0(sVar, uVar.c(lowerCase)));
            }
            sVar.p(false);
            String strY0 = ry.m.y0(arrayList, " / ", null, null, null, 62);
            long jA = j3.A(12);
            c3 c3Var = v1.f31180a;
            long j11 = ((s1) sVar.j(c3Var)).f31036s;
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            ua.b(strY0, new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j11, jA, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 3072, 0, 131056);
            ew.a.a(3072, ((s1) sVar.j(c3Var)).f31036s, aVar, sVar, e2.n(oVar, 18), iVar.f41143i);
            com.google.android.material.datepicker.d.B(sVar, true, true, true);
            List list2 = uh.a.f52967a;
            if (!ry.l.D(c.a.n(), Long.valueOf(iVar.f41135a)) || iVar.f41142h) {
                z12 = true;
                z13 = false;
                sVar.d0(-1763594598);
            } else {
                sVar.d0(-1751951184);
                z1.r rVarB = j0.c.B(d0.n.h(oVar, ((s1) sVar.j(c3Var)).f31017a, r0.f.f(f11, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, 10)), f5, 2);
                q0 q0VarD3 = j0.o.d(jVar, false);
                int iHashCode7 = Long.hashCode(sVar.T);
                q1 q1VarL7 = sVar.l();
                z1.r rVarC8 = z1.a.c(sVar, rVarB);
                y2.k.J.getClass();
                y2.i iVar4 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar4);
                } else {
                    sVar.r0();
                }
                t.J(y2.j.f56917f, q0VarD3, sVar);
                t.J(y2.j.f56916e, q1VarL7, sVar);
                y2.h hVar7 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode7))) {
                    defpackage.e.A(iHashCode7, sVar, iHashCode7, hVar7);
                }
                t.J(y2.j.f56915d, rVarC8, sVar);
                String upperCase = ub.a.e0(sVar, R.string.free).toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.m.e(upperCase, "toUpperCase(...)");
                ua.b(upperCase, null, ((s1) sVar.j(c3Var)).f31019b, j3.A(12), null, n3.s.L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 199680, 0, 131026);
                z12 = true;
                sVar.p(true);
                z13 = false;
            }
            sVar.p(z13);
            sVar.p(z12);
        } else {
            sVar.W();
        }
        return b0.f48488a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        jf jfVar = (jf) this.f2917c;
        fz.c cVar = (fz.c) this.f2916b;
        b2 TopAppBar = (b2) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.f(TopAppBar, "$this$TopAppBar");
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            int i11 = jfVar.f49950c;
            l1.g gVar = l1.m.f39353a;
            if (i11 > 0) {
                sVar.d0(262065144);
                boolean zF = sVar.f(cVar);
                Object objQ = sVar.Q();
                if (zF || objQ == gVar) {
                    objQ = new x0(cVar, 4);
                    sVar.o0(objQ);
                }
                k7.m((fz.a) objQ, null, false, null, null, null, lt.b.f40306b, sVar, 805306368, 510);
                sVar.p(false);
            } else {
                sVar.d0(262278300);
                boolean zF2 = sVar.f(cVar);
                Object objQ2 = sVar.Q();
                if (zF2 || objQ2 == gVar) {
                    objQ2 = new x0(cVar, 5);
                    sVar.o0(objQ2);
                }
                k7.m((fz.a) objQ2, null, false, null, null, null, lt.b.f40307c, sVar, 805306368, 510);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        return b0.f48488a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        rt.a2 a2Var = (rt.a2) this.f2916b;
        b3 b3Var = (b3) this.f2917c;
        b2 AppTopAppBar = (b2) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.f(AppTopAppBar, "$this$AppTopAppBar");
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            me meVar = ((o1) b3Var.getValue()).f50164b;
            boolean zH = sVar.h(a2Var);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new k1(a2Var, 1);
                sVar.o0(objQ);
            }
            mt.v1.b(meVar, (fz.c) objQ, sVar, 0);
        } else {
            sVar.W();
        }
        return b0.f48488a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        fz.f fVar = (fz.f) this.f2916b;
        fz.a aVar = (fz.a) this.f2917c;
        Integer num = (Integer) obj;
        num.intValue();
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        Integer num2 = (Integer) obj3;
        num2.intValue();
        fVar.invoke(num, bool, num2);
        aVar.invoke();
        return b0.f48488a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        o8 o8Var = (o8) this.f2916b;
        fz.a aVar = (fz.a) this.f2917c;
        v ModalBottomSheet = (v) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            j6.e(o8Var.f50198a, o8Var.f50201d, aVar, sVar, 0);
        } else {
            sVar.W();
        }
        return b0.f48488a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        fz.c cVar = (fz.c) this.f2916b;
        sv.h hVar = (sv.h) this.f2917c;
        v Card = (v) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.f(Card, "$this$Card");
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            z1.r rVarB = j0.c.B(z1.o.f58481a, 16, 22);
            u uVarA = j0.t.a(j0.i.i(14), z1.c.P, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarB);
            y2.k.J.getClass();
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
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
            }
            t.J(y2.j.f56915d, rVarC, sVar);
            r4.b(se.k.y(R.drawable.syllable_test_part_locked, sVar, 0), null, null, ((s1) sVar.j(v1.f31180a)).f31017a, sVar, 48, 4);
            ua.b(ub.a.e0(sVar, R.string.sound_change_rules_locked_message), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), 0L, j3.A(14), n3.s.K, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar, 0, 0, 65534);
            boolean zF = sVar.f(cVar) | sVar.h(hVar);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = new l1.z1(20, cVar, hVar);
                sVar.o0(objQ);
            }
            iu.k.e((fz.a) objQ, null, false, 0L, null, nv.a.f44100i, sVar, 196608, 30);
            sVar.p(true);
        } else {
            sVar.W();
        }
        return b0.f48488a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        o0.t tVar = (o0.t) this.f2916b;
        v3.m mVar = (v3.m) this.f2917c;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        float fFloatValue3 = ((Float) obj3).floatValue();
        boolean zX = ub.a.X(tVar, fFloatValue);
        char c11 = 0;
        if (tVar.l().f44404e != h1.Vertical && mVar != v3.m.Ltr) {
            zX = !zX;
        }
        int i11 = tVar.l().f44401b;
        float fQ = i11 == 0 ? 0.0f : ub.a.Q(tVar) / i11;
        float f5 = fQ - ((int) fQ);
        if (Math.abs(fFloatValue) >= tVar.f44447q.e0(g0.k.f28354a)) {
            c11 = fFloatValue > CropImageView.DEFAULT_ASPECT_RATIO ? (char) 1 : (char) 2;
        }
        if (c11 == 0) {
            fFloatValue2 = Math.abs(f5) > 0.5f ? fFloatValue3 : fFloatValue3;
        } else if (c11 != 1) {
            if (c11 != 2) {
                fFloatValue2 = 0.0f;
            }
        }
        return Float.valueOf(fFloatValue2);
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        AchievementLevel achievementLevel = (AchievementLevel) this.f2916b;
        b1 b1Var = (b1) this.f2917c;
        k0 AnimatedVisibility = (k0) obj;
        l1.n nVar = (l1.n) obj2;
        ((Integer) obj3).getClass();
        kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
        int iX = ve.i.x((AchievementLevel) b1Var.getValue(), ((AchievementLevel) b1Var.getValue()).getLevel());
        int currentValue = achievementLevel.getCurrentValue();
        if (currentValue < 0) {
            currentValue = 0;
        }
        float fK = CropImageView.DEFAULT_ASPECT_RATIO;
        if (iX > 0) {
            fK = hz.b.k(currentValue / iX, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        }
        float f5 = 34;
        z1.o oVar = z1.o.f58481a;
        z1.r rVarE = j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, f5, f5, 2);
        a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, nVar, 48);
        l1.s sVar = (l1.s) nVar;
        int iHashCode = Long.hashCode(sVar.T);
        q1 q1VarL = sVar.l();
        z1.r rVarC = z1.a.c(nVar, rVarE);
        y2.k.J.getClass();
        y2.i iVar = y2.j.f56913b;
        sVar.h0();
        if (sVar.S) {
            sVar.k(iVar);
        } else {
            sVar.r0();
        }
        t.J(y2.j.f56917f, a2VarA, nVar);
        t.J(y2.j.f56916e, q1VarL, nVar);
        y2.h hVar = y2.j.f56918g;
        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
        }
        t.J(y2.j.f56915d, rVarC, nVar);
        long jS = ve.i.s((AchievementLevel) b1Var.getValue());
        boolean zC = sVar.c(fK);
        Object objQ = sVar.Q();
        if (zC || objQ == l1.m.f39353a) {
            objQ = new pr.h(fK);
            sVar.o0(objQ);
        }
        g7.c((fz.a) objQ, d2.h.b(e2.g(oVar, 10), r0.f.a()), jS, f0.e(4293125091L), 1, CropImageView.DEFAULT_ASPECT_RATIO, null, nVar, 3072, 96);
        if (1.0f <= 0.0d) {
            k0.a.a("invalid weight; must be greater than zero");
        }
        j0.c.g(nVar, new i1(1.0f, true));
        ua.b(currentValue + "/" + iX, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), jS, 0L, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777210), nVar, 0, 0, 65534);
        sVar.p(true);
        return b0.f48488a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        SyllableWriteCharacter syllableWriteCharacter = (SyllableWriteCharacter) this.f2916b;
        b1 b1Var = (b1) this.f2917c;
        v Card = (v) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.f(Card, "$this$Card");
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
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
            y2.h hVar = y2.j.f56917f;
            t.J(hVar, uVarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            t.J(hVar4, rVarC, sVar);
            String luoMa = syllableWriteCharacter.getLuoMa();
            if (luoMa.length() <= 0) {
                luoMa = null;
            }
            if (luoMa == null) {
                luoMa = ep.a.m(sVar, -576953269, R.string.ko_syllable_silent, sVar, false);
            } else {
                sVar.d0(-576954695);
                sVar.p(false);
            }
            ua.b(luoMa, j0.c.A(oVar, 16), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), 0L, j3.A(18), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 48, 0, 65532);
            k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 0, 7);
            z1.r rVarA = j0.c.A(e2.e(oVar, 1.0f), 20);
            a2 a2VarA = z1.a(j0.i.f35307e, z1.c.L, sVar, 6);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarA);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, a2VarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            z1.r rVarN = e2.n(oVar, 140);
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new mt.p(17, b1Var);
                sVar.o0(objQ);
            }
            ef.e.c(54, (fz.c) objQ, sVar, rVarN);
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        return b0.f48488a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        Spannable spannable = (Spannable) this.f2916b;
        bt.t tVar = (bt.t) this.f2917c;
        p0 p0Var = (p0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        n3.i iVar = p0Var.f35759f;
        n3.s sVar = p0Var.f35756c;
        if (sVar == null) {
            sVar = n3.s.f43178t;
        }
        n3.o oVar = p0Var.f35757d;
        int i11 = oVar != null ? oVar.f43170a : 0;
        n3.p pVar = p0Var.f35758e;
        int i12 = pVar != null ? pVar.f43171a : 65535;
        r3.c cVar = (r3.c) tVar.f6004b;
        g0 g0VarB = ((n3.j) cVar.f48771e).b(iVar, sVar, i11, i12);
        if (g0VarB instanceof n3.f0) {
            Object obj4 = ((n3.f0) g0VarB).f43151a;
            kotlin.jvm.internal.m.d(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
            typeface = (Typeface) obj4;
        } else {
            m3 m3Var = new m3(g0VarB, cVar.L);
            cVar.L = m3Var;
            Object obj5 = m3Var.f48058c;
            kotlin.jvm.internal.m.d(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
            typeface = (Typeface) obj5;
        }
        spannable.setSpan(new m3.b(typeface, 1), iIntValue, iIntValue2, 33);
        return b0.f48488a;
    }

    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [rz.d0, vy.d, vy.i] */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r11;
        int i11;
        int i12;
        boolean z11;
        int i13 = this.f2915a;
        z1.o oVar = z1.o.f58481a;
        l1.g gVar = l1.m.f39353a;
        int i14 = 0;
        b0 b0Var = b0.f48488a;
        Object obj4 = this.f2917c;
        Object obj5 = this.f2916b;
        switch (i13) {
            case 0:
                fz.c cVar = (fz.c) obj5;
                CourseUnit courseUnit = (CourseUnit) obj4;
                b2 TopAppBar = (b2) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TopAppBar, "$this$TopAppBar");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zF = sVar.f(cVar) | sVar.h(courseUnit);
                    Object objQ = sVar.Q();
                    if (zF || objQ == gVar) {
                        objQ = new s(cVar, courseUnit, 0);
                        sVar.o0(objQ);
                    }
                    k7.h((fz.a) objQ, null, false, null, b.f2856b, sVar, 196608, 30);
                } else {
                    sVar.W();
                }
                return b0Var;
            case 1:
                UpdateLessonActivity updateLessonActivity = (UpdateLessonActivity) obj5;
                lc.d dialog = (lc.d) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                CharSequence text = (CharSequence) obj3;
                int i15 = UpdateLessonActivity.W;
                kotlin.jvm.internal.m.f(dialog, "dialog");
                kotlin.jvm.internal.m.f(text, "text");
                e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity), null, null, new t3(iIntValue2 + 1, (ArrayList) obj4, updateLessonActivity, (vy.d) null), 3);
                return b0Var;
            case 2:
                String str = (String) obj5;
                b1 b1Var = (b1) obj4;
                k0 AnimatedVisibility = (k0) obj;
                l1.n nVar2 = (l1.n) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                l1.s sVar2 = (l1.s) nVar2;
                int iHashCode = Long.hashCode(sVar2.T);
                q1 q1VarL = sVar2.l();
                z1.o oVar2 = z1.o.f58481a;
                z1.r rVarC = z1.a.c(nVar2, oVar2);
                y2.k.J.getClass();
                y2.i iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                t.J(y2.j.f56917f, q0VarD, nVar2);
                t.J(y2.j.f56916e, q1VarL, nVar2);
                y2.h hVar = y2.j.f56918g;
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                t.J(y2.j.f56915d, rVarC, nVar2);
                z1.j jVar = z1.c.H;
                j0.r rVar = j0.r.f35391a;
                z1.r rVarE = e2.e(rVar.a(oVar2, jVar), 1.0f);
                Object objQ2 = sVar2.Q();
                if (objQ2 == gVar) {
                    objQ2 = new br.b(i14);
                    sVar2.o0(objQ2);
                }
                wb.k.b(str, null, rVarE, null, (fz.c) objQ2, w2.i.f54517d, nVar2, 12582960, 64376);
                z1.r rVarA = rVar.a(e2.n(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, 24, 4, CropImageView.DEFAULT_ASPECT_RATIO, 9), 28), z1.c.f58465c);
                Object objQ3 = sVar2.Q();
                if (objQ3 == gVar) {
                    objQ3 = new bp.p(9, b1Var);
                    sVar2.o0(objQ3);
                }
                k7.d(iu.k.q(24576, 7, (fz.a) objQ3, nVar2, rVarA, false), r0.f.f48733a, null, k7.s(2), null, br.e.f5027a, nVar2, 196608, 20);
                sVar2.p(true);
                return b0Var;
            case 3:
                GRKSyllableIntroductionActivity gRKSyllableIntroductionActivity = (GRKSyllableIntroductionActivity) obj5;
                gl.a aVar = (gl.a) obj4;
                t1 contentPadding = (t1) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i16 = GRKSyllableIntroductionActivity.H;
                kotlin.jvm.internal.m.f(contentPadding, "contentPadding");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((l1.s) nVar3).f(contentPadding) ? 4 : 2;
                }
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    z1.r rVarZ = j0.c.z(oVar, contentPadding);
                    q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                    int iHashCode2 = Long.hashCode(sVar3.T);
                    q1 q1VarL2 = sVar3.l();
                    z1.r rVarC2 = z1.a.c(sVar3, rVarZ);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    t.J(y2.j.f56917f, q0VarD2, sVar3);
                    t.J(y2.j.f56916e, q1VarL2, sVar3);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                    }
                    t.J(y2.j.f56915d, rVarC2, sVar3);
                    gRKSyllableIntroductionActivity.p(aVar, sVar3, 0);
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                return b0Var;
            case 4:
                fz.a aVar2 = (fz.a) obj5;
                ht.l lVar = (ht.l) obj4;
                j0.q CourseTestChallengeBaseTitle = (j0.q) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(CourseTestChallengeBaseTitle, "$this$CourseTestChallengeBaseTitle");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((l1.s) nVar4).f(CourseTestChallengeBaseTitle) ? 4 : 2;
                }
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    boolean zF2 = sVar4.f(aVar2);
                    Object objQ4 = sVar4.Q();
                    if (zF2 || objQ4 == gVar) {
                        objQ4 = new o0(11, aVar2);
                        sVar4.o0(objQ4);
                    }
                    a0.m(CourseTestChallengeBaseTitle.a(e2.g(j0.c.A(iu.k.q(6, 7, (fz.a) objQ4, sVar4, z1.o.f58481a, false), dt.c.f23682n), dt.c.f23683o), z1.c.f58467e), ((s1) sVar4.j(v1.f31180a)).f31017a, !kotlin.jvm.internal.m.a(lVar, ht.a.f33722e) && lVar.b() == -1, sVar4, 0, 0);
                } else {
                    sVar4.W();
                }
                return b0Var;
            case 5:
                k0 AnimatedVisibility2 = (k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility2, "$this$AnimatedVisibility");
                k3.g((ns.s) obj5, (fz.a) obj4, null, (l1.n) obj2, 0);
                return b0Var;
            case 6:
                k0 AnimatedVisibility3 = (k0) obj;
                l1.n nVar5 = (l1.n) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility3, "$this$AnimatedVisibility");
                i9.a(null, r0.f.d(24), ((s1) ((l1.s) nVar5).j(v1.f31180a)).f31035r, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1305515342, new z(22, (fz.a) obj5, (t1.d) obj4), nVar5), nVar5, 12582912, 121);
                return b0Var;
            case 7:
                fz.c cVar2 = (fz.c) obj5;
                b3 b3Var = (b3) obj4;
                t1 paddingValues = (t1) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(paddingValues, "paddingValues");
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((l1.s) nVar6).f(paddingValues) ? 4 : 2;
                }
                l1.s sVar5 = (l1.s) nVar6;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    js.c cVar3 = (js.c) b3Var.getValue();
                    boolean zF3 = sVar5.f(cVar2);
                    Object objQ5 = sVar5.Q();
                    if (zF3 || objQ5 == gVar) {
                        objQ5 = new b0.o1(cVar2, 6);
                        sVar5.o0(objQ5);
                    }
                    es.j.b(cVar3, (fz.c) objQ5, j0.c.z(oVar, paddingValues), sVar5, 0);
                } else {
                    sVar5.W();
                }
                return b0Var;
            case 8:
                n0 n0Var = (n0) obj5;
                n9.q qVar = (n9.q) obj4;
                s2.t tVar = (s2.t) obj;
                s2.t tVar2 = (s2.t) obj2;
                f2.b bVar = (f2.b) obj3;
                n0Var.Z = 0L;
                if (((Boolean) n0Var.T.invoke(tVar)).booleanValue()) {
                    if (!n0Var.Y) {
                        if (n0Var.W == null) {
                            r11 = 0;
                            n0Var.W = qx.p.b(Integer.MAX_VALUE, 6, null);
                        } else {
                            r11 = 0;
                        }
                        n0Var.Y = true;
                        e0.B(n0Var.H0(), r11, r11, new m0(n0Var, r11), 3);
                    }
                    fb.g0.f(qVar, tVar, 0L);
                    long jG = f2.b.g(tVar2.f51345c, bVar.f26570a);
                    tz.h hVar3 = n0Var.W;
                    if (hVar3 != null) {
                        hVar3.i(new f0.q(jG));
                    }
                }
                return b0Var;
            case 9:
                rc rcVar = (rc) obj5;
                b1 b1Var2 = (b1) obj4;
                b2 CourseTestProgressBar = (b2) obj;
                l1.n nVar7 = (l1.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(CourseTestProgressBar, "$this$CourseTestProgressBar");
                l1.s sVar6 = (l1.s) nVar7;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    boolean z12 = ((qc) rcVar).f50304d;
                    z1.o oVar3 = z1.o.f58481a;
                    if (z12) {
                        sVar6.d0(754898587);
                        k2.b bVarY = se.k.y(R.drawable.ic_lesson_setting_btn, sVar6, 0);
                        Object objQ6 = sVar6.Q();
                        if (objQ6 == gVar) {
                            objQ6 = new h2(6, b1Var2);
                            sVar6.o0(objQ6);
                        }
                        d0.n.c(bVarY, null, j0.c.A(e2.n(iu.k.q(24582, 7, (fz.a) objQ6, sVar6, oVar3, false), 24), 2), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar6, 48, 120);
                        j0.c.g(sVar6, e2.n(oVar3, 14));
                        sVar6.p(false);
                    } else {
                        sVar6.d0(755700960);
                        j0.c.g(sVar6, e2.n(oVar3, 24));
                        sVar6.p(false);
                    }
                } else {
                    sVar6.W();
                }
                return b0Var;
            case 10:
                hu.i iVar3 = (hu.i) obj5;
                b1 b1Var3 = (b1) obj4;
                u0 FlowRow = (u0) obj;
                l1.n nVar8 = (l1.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(FlowRow, "$this$FlowRow");
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((l1.s) nVar8).f(FlowRow) ? 4 : 2;
                }
                l1.s sVar7 = (l1.s) nVar8;
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    ArrayList arrayList = iVar3.f33789c;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj6 = arrayList.get(i17);
                        i17++;
                        hu.b bVar2 = (hu.b) obj6;
                        boolean zF4 = sVar7.f(bVar2) | sVar7.f(b1Var3);
                        Object objQ7 = sVar7.Q();
                        if (zF4 || objQ7 == gVar) {
                            objQ7 = new com.google.accompanist.permissions.a(17, bVar2, b1Var3);
                            sVar7.o0(objQ7);
                        }
                        fu.a.e(bVar2, e2.g(FlowRow.a(w2.a0.m(oVar, (fz.c) objQ7), 1.0f), 52), sVar7, 0);
                    }
                } else {
                    sVar7.W();
                }
                return b0Var;
            case 11:
                x1.p pVar = (x1.p) obj5;
                List list = (List) obj4;
                k0 AnimatedVisibility4 = (k0) obj;
                l1.n nVar9 = (l1.n) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility4, "$this$AnimatedVisibility");
                l1.s sVar8 = (l1.s) nVar9;
                float f5 = 12;
                z1.r rVarH = d0.n.h(e2.d(oVar, 1.0f), ((s1) sVar8.j(v1.f31180a)).f31033p, r0.f.d(f5));
                d0.v vVarA = d0.n.a(f0.e(4294956955L), (float) 1.5d);
                z1.r rVarE2 = j0.c.E(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.d(f5), rVarH), CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, 18, 5);
                a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, nVar9, 0);
                int iHashCode3 = Long.hashCode(sVar8.T);
                q1 q1VarL3 = sVar8.l();
                z1.r rVarC3 = z1.a.c(nVar9, rVarE2);
                y2.k.J.getClass();
                y2.i iVar4 = y2.j.f56913b;
                sVar8.h0();
                if (sVar8.S) {
                    sVar8.k(iVar4);
                } else {
                    sVar8.r0();
                }
                t.J(y2.j.f56917f, a2VarA, nVar9);
                t.J(y2.j.f56916e, q1VarL3, nVar9);
                y2.h hVar4 = y2.j.f56918g;
                if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar8, iHashCode3, hVar4);
                }
                t.J(y2.j.f56915d, rVarC3, nVar9);
                sVar8.d0(1469080662);
                ListIterator listIterator = pVar.listIterator();
                int i18 = 0;
                while (true) {
                    sy.a aVar3 = (sy.a) listIterator;
                    if (!aVar3.hasNext()) {
                        sVar8.p(false);
                        sVar8.p(true);
                        return b0Var;
                    }
                    Object next = aVar3.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    DayStreakWeeklyItem dayStreakWeeklyItem = (DayStreakWeeklyItem) next;
                    String strE0 = ub.a.e0(nVar9, ((Number) list.get(i18)).intValue());
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    fu.e0.a(strE0, new i1(1.0f, true), dayStreakWeeklyItem.getStatus(), nVar9, 0);
                    i18 = i19;
                }
                break;
            case 12:
                mv.u uVar = (mv.u) obj4;
                fz.c cVar4 = (fz.c) obj5;
                t1 paddingValues2 = (t1) obj;
                l1.n nVar10 = (l1.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(paddingValues2, "paddingValues");
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((l1.s) nVar10).f(paddingValues2) ? 4 : 2;
                }
                l1.s sVar9 = (l1.s) nVar10;
                if (sVar9.T(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    iv.a.f(0, cVar4, ((mv.t) uVar).f42275b, sVar9, j0.c.z(oVar, paddingValues2));
                } else {
                    sVar9.W();
                }
                return b0Var;
            case 13:
                fz.c cVar5 = (fz.c) obj5;
                s0 s0Var = (s0) obj4;
                v Card = (v) obj;
                l1.n nVar11 = (l1.n) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar10 = (l1.s) nVar11;
                if (sVar10.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    boolean zF5 = sVar10.f(cVar5) | sVar10.d(s0Var.ordinal());
                    Object objQ8 = sVar10.Q();
                    if (zF5 || objQ8 == gVar) {
                        objQ8 = new fp.f(15, cVar5, s0Var);
                        sVar10.o0(objQ8);
                    }
                    z1.r rVarA2 = j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ8, 15), 8);
                    u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar10, 48);
                    int iHashCode4 = Long.hashCode(sVar10.T);
                    q1 q1VarL4 = sVar10.l();
                    z1.r rVarC4 = z1.a.c(sVar10, rVarA2);
                    y2.k.J.getClass();
                    y2.i iVar5 = y2.j.f56913b;
                    sVar10.h0();
                    if (sVar10.S) {
                        sVar10.k(iVar5);
                    } else {
                        sVar10.r0();
                    }
                    t.J(y2.j.f56917f, uVarA, sVar10);
                    t.J(y2.j.f56916e, q1VarL4, sVar10);
                    y2.h hVar5 = y2.j.f56918g;
                    if (sVar10.S || !kotlin.jvm.internal.m.a(sVar10.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar10, iHashCode4, hVar5);
                    }
                    t.J(y2.j.f56915d, rVarC4, sVar10);
                    d0.n.c(se.k.y(R.drawable.ic_syllable_exam, sVar10, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar10, 48, 124);
                    iu.k.n(ub.a.e0(sVar10, R.string.test), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar10, 0, 0, 131070);
                    sVar10.p(true);
                } else {
                    sVar10.W();
                }
                return b0Var;
            case 14:
                String str2 = (String) obj5;
                t1.d dVar = (t1.d) obj4;
                v JPSyllableIntroNoteContainer = (v) obj;
                l1.n nVar12 = (l1.n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(JPSyllableIntroNoteContainer, "$this$JPSyllableIntroNoteContainer");
                l1.s sVar11 = (l1.s) nVar12;
                if (sVar11.T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    ua.b(str2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j0.b(sVar11), sVar11, 0, 0, 65534);
                    dVar.invoke(sVar11, 0);
                } else {
                    sVar11.W();
                }
                return b0Var;
            case 15:
                b1 b1Var4 = (b1) obj5;
                kr.m mVar = (kr.m) obj4;
                b2 AppTopAppBar = (b2) obj;
                l1.n nVar13 = (l1.n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppTopAppBar, "$this$AppTopAppBar");
                l1.s sVar12 = (l1.s) nVar13;
                if (sVar12.T(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    z1.i iVar6 = z1.c.M;
                    j0.g gVarG = j0.i.g(8);
                    z1.r rVarE3 = j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, 11);
                    Object objQ9 = sVar12.Q();
                    if (objQ9 == gVar) {
                        objQ9 = new h2(24, b1Var4);
                        sVar12.o0(objQ9);
                    }
                    z1.r rVarQ = iu.k.q(24582, 7, (fz.a) objQ9, sVar12, rVarE3, false);
                    a2 a2VarA2 = z1.a(gVarG, iVar6, sVar12, 54);
                    int iHashCode5 = Long.hashCode(sVar12.T);
                    q1 q1VarL5 = sVar12.l();
                    z1.r rVarC5 = z1.a.c(sVar12, rVarQ);
                    y2.k.J.getClass();
                    y2.i iVar7 = y2.j.f56913b;
                    sVar12.h0();
                    if (sVar12.S) {
                        sVar12.k(iVar7);
                    } else {
                        sVar12.r0();
                    }
                    t.J(y2.j.f56917f, a2VarA2, sVar12);
                    t.J(y2.j.f56916e, q1VarL5, sVar12);
                    y2.h hVar6 = y2.j.f56918g;
                    if (sVar12.S || !kotlin.jvm.internal.m.a(sVar12.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar12, iHashCode5, hVar6);
                    }
                    t.J(y2.j.f56915d, rVarC5, sVar12);
                    int i21 = jr.o.f36687a[((kr.l) mVar).f38519e.ordinal()];
                    if (i21 == 1) {
                        i11 = -1588022410;
                        i12 = R.string.time;
                    } else {
                        if (i21 != 2) {
                            throw nv.p.x(sVar12, -1588025159, false);
                        }
                        i11 = -1588019210;
                        i12 = R.string.like;
                    }
                    String strM = ep.a.m(sVar12, i11, i12, sVar12, false);
                    y0 y0Var = (y0) sVar12.j(ua.f31167a);
                    long jA = j3.A(14);
                    c3 c3Var = v1.f31180a;
                    ua.b(strM, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, ((s1) sVar12.j(c3Var)).f31036s, jA, n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar12, 0, 0, 65534);
                    r4.b(se.k.y(R.drawable.ic_speak_ld_sort, sVar12, 0), null, null, ((s1) sVar12.j(c3Var)).f31036s, sVar12, 56, 4);
                    sVar12.p(true);
                } else {
                    sVar12.W();
                }
                return b0Var;
            case 16:
                d0 d0Var = (d0) obj5;
                fz.a aVar4 = (fz.a) obj4;
                v Card2 = (v) obj;
                l1.n nVar14 = (l1.n) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card2, "$this$Card");
                l1.s sVar13 = (l1.s) nVar14;
                if (sVar13.T(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    z1.r rVarD = e2.d(oVar, 1.0f);
                    q0 q0VarD3 = j0.o.d(z1.c.f58467e, false);
                    int iHashCode6 = Long.hashCode(sVar13.T);
                    q1 q1VarL6 = sVar13.l();
                    z1.r rVarC6 = z1.a.c(sVar13, rVarD);
                    y2.k.J.getClass();
                    y2.i iVar8 = y2.j.f56913b;
                    sVar13.h0();
                    if (sVar13.S) {
                        sVar13.k(iVar8);
                    } else {
                        sVar13.r0();
                    }
                    t.J(y2.j.f56917f, q0VarD3, sVar13);
                    t.J(y2.j.f56916e, q1VarL6, sVar13);
                    y2.h hVar7 = y2.j.f56918g;
                    if (sVar13.S || !kotlin.jvm.internal.m.a(sVar13.Q(), Integer.valueOf(iHashCode6))) {
                        defpackage.e.A(iHashCode6, sVar13, iHashCode6, hVar7);
                    }
                    t.J(y2.j.f56915d, rVarC6, sVar13);
                    boolean z13 = d0Var.f38444e;
                    long j11 = ((s1) sVar13.j(v1.f31180a)).f31019b;
                    z1.r rVarN = e2.n(oVar, 62);
                    boolean zF6 = sVar13.f(aVar4);
                    Object objQ10 = sVar13.Q();
                    if (zF6 || objQ10 == gVar) {
                        objQ10 = new jr.m(8, aVar4);
                        sVar13.o0(objQ10);
                    }
                    a0.a(z13, rVarN, j11, (fz.a) objQ10, sVar13, 48, 0);
                    sVar13.p(true);
                } else {
                    sVar13.W();
                }
                return b0Var;
            case 17:
                fz.a aVar5 = (fz.a) obj5;
                c1 c1Var = (c1) obj4;
                l0.c item = (l0.c) obj;
                l1.n nVar15 = (l1.n) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= ((l1.s) nVar15).f(item) ? 4 : 2;
                }
                l1.s sVar14 = (l1.s) nVar15;
                if (sVar14.T(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    z1.r rVarA3 = item.a();
                    u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar14, 0);
                    int iHashCode7 = Long.hashCode(sVar14.T);
                    q1 q1VarL7 = sVar14.l();
                    z1.r rVarC7 = z1.a.c(sVar14, rVarA3);
                    y2.k.J.getClass();
                    y2.i iVar9 = y2.j.f56913b;
                    sVar14.h0();
                    if (sVar14.S) {
                        sVar14.k(iVar9);
                    } else {
                        sVar14.r0();
                    }
                    t.J(y2.j.f56917f, uVarA2, sVar14);
                    t.J(y2.j.f56916e, q1VarL7, sVar14);
                    y2.h hVar8 = y2.j.f56918g;
                    if (sVar14.S || !kotlin.jvm.internal.m.a(sVar14.Q(), Integer.valueOf(iHashCode7))) {
                        defpackage.e.A(iHashCode7, sVar14, iHashCode7, hVar8);
                    }
                    t.J(y2.j.f56915d, rVarC7, sVar14);
                    float f11 = 32;
                    iu.k.e(aVar5, e2.e(j0.c.B(oVar, f11, 16), 1.0f), c1Var.f38437d, 0L, null, jr.a.f36575u, sVar14, 196656, 24);
                    ua.b(ub.a.e0(sVar14, R.string.tip_finish_recording_the_whole_dialogue_to_enable_preview), e2.e(j0.c.C(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar14, 48, 0, 130556);
                    sVar14.p(true);
                } else {
                    sVar14.W();
                }
                return b0Var;
            case 18:
                km.u uVar2 = (km.u) obj5;
                b1 b1Var5 = (b1) obj4;
                fz.a showNext = (fz.a) obj;
                l1.n nVar16 = (l1.n) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(showNext, "showNext");
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= ((l1.s) nVar16).h(showNext) ? 4 : 2;
                }
                l1.s sVar15 = (l1.s) nVar16;
                if (sVar15.T(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    z1.r rVarD2 = e2.d(j0.c.v(j0.c.F(oVar)), 1.0f);
                    Bundle arguments = uVar2.getArguments();
                    if (arguments == null) {
                        arguments = Bundle.EMPTY;
                    }
                    arguments.putInt(INTENTS.EXTRA_INT, ((Number) b1Var5.getValue()).intValue());
                    z11 = (iIntValue14 & 14) == 4;
                    Object objQ11 = sVar15.Q();
                    if (z11 || objQ11 == gVar) {
                        objQ11 = new r0(9, showNext);
                        sVar15.o0(objQ11);
                    }
                    ub.a.H(km.f.class, rVarD2, null, arguments, (fz.c) objQ11, sVar15, 0, 4);
                } else {
                    sVar15.W();
                }
                return b0Var;
            case 19:
                return a(obj, obj2, obj3);
            case 20:
                return c(obj, obj2, obj3);
            case 21:
                return d(obj, obj2, obj3);
            case 22:
                return e(obj, obj2, obj3);
            case 23:
                return h(obj, obj2, obj3);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return j(obj, obj2, obj3);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return k(obj, obj2, obj3);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return l(obj, obj2, obj3);
            case 27:
                return m(obj, obj2, obj3);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return n(obj, obj2, obj3);
            default:
                sm.c cVar6 = (sm.c) obj5;
                b1 b1Var6 = (b1) obj4;
                fz.a showNext2 = (fz.a) obj;
                l1.n nVar17 = (l1.n) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(showNext2, "showNext");
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= ((l1.s) nVar17).h(showNext2) ? 4 : 2;
                }
                l1.s sVar16 = (l1.s) nVar17;
                if (sVar16.T(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    z1.r rVarD3 = e2.d(j0.c.v(j0.c.F(oVar)), 1.0f);
                    Bundle arguments2 = cVar6.getArguments();
                    if (arguments2 == null) {
                        arguments2 = Bundle.EMPTY;
                    }
                    arguments2.putInt(INTENTS.EXTRA_INT, ((Number) b1Var6.getValue()).intValue());
                    z11 = (iIntValue15 & 14) == 4;
                    Object objQ12 = sVar16.Q();
                    if (z11 || objQ12 == gVar) {
                        objQ12 = new r0(13, showNext2);
                        sVar16.o0(objQ12);
                    }
                    ub.a.H(km.f.class, rVarD3, null, arguments2, (fz.c) objQ12, sVar16, 0, 4);
                } else {
                    sVar16.W();
                }
                return b0Var;
        }
    }

    public /* synthetic */ p(Object obj, fz.c cVar, int i11) {
        this.f2915a = i11;
        this.f2917c = obj;
        this.f2916b = cVar;
    }
}
