package es;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import b0.x0;
import bp.e0;
import br.c0;
import bt.g7;
import ch.o0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.LessonState;
import com.lingodeer.data.model.chinesetone.ChineseToneLesson;
import com.lingodeer.data.model.chinesetone.ChineseToneLevel;
import com.lingodeer.data.model.chinesetone.ChineseToneUnit;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import fr.p3;
import g2.f0;
import g2.j0;
import g2.r0;
import g2.x;
import h1.bc;
import h1.k7;
import h1.p7;
import h1.r4;
import h1.s1;
import h1.ua;
import h1.v1;
import iu.k;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.t;
import j0.u;
import j0.v;
import j0.z1;
import j3.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import js.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.z;
import l0.y;
import l1.b1;
import l1.c3;
import l1.d0;
import l1.m;
import l1.n;
import l1.q1;
import l1.s;
import l1.x1;
import nv.p;
import oz.q;
import qy.b0;
import qy.l;
import w2.q0;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f25822a = new t1.d(new dt.g(5), false, 351311910);

    /* JADX WARN: Code duplicated, block: B:50:0x011e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x013d  */
    /* JADX WARN: Code duplicated, block: B:59:0x016c  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a9  */
    public static final void a(final String str, final long j11, final int i11, final fz.a aVar, r rVar, final boolean z11, n nVar, final int i12) {
        s sVar;
        final r rVar2;
        int i13;
        int iHashCode;
        s sVar2;
        s sVar3 = (s) nVar;
        sVar3.f0(-381737262);
        int i14 = i12 | (sVar3.f(str) ? 4 : 2) | (sVar3.e(j11) ? 32 : 16) | (sVar3.d(i11) ? 256 : 128) | (sVar3.h(aVar) ? 2048 : 1024) | 24576 | (sVar3.g(z11) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar3.T(i14 & 1, (74899 & i14) != 74898)) {
            boolean z12 = (i14 & 7168) == 2048;
            Object objQ = sVar3.Q();
            if (z12 || objQ == m.f39353a) {
                objQ = new o0(24, aVar);
                sVar3.o0(objQ);
            }
            o oVar = o.f58481a;
            r rVarC = j0.c.C(k.q(6, 7, (fz.a) objQ, sVar3, oVar, false), CropImageView.DEFAULT_ASPECT_RATIO, 12, 1);
            u uVarA = t.a(j0.i.f35305c, z1.c.P, sVar3, 48);
            int iHashCode2 = Long.hashCode(sVar3.T);
            q1 q1VarL = sVar3.l();
            r rVarC2 = z1.a.c(sVar3, rVarC);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, uVarA, sVar3);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar3);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar3.S) {
                i13 = i14;
            } else {
                i13 = i14;
                if (!kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                }
                y2.h hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC2, sVar3);
                r rVarH = d0.n.h(e2.n(oVar, 78), j11, r0.f.f48733a);
                q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                iHashCode = Long.hashCode(sVar3.T);
                q1 q1VarL2 = sVar3.l();
                r rVarC3 = z1.a.c(sVar3, rVarH);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar, q0VarD, sVar3);
                l1.t.J(hVar2, q1VarL2, sVar3);
                if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar3, iHashCode, hVar3);
                }
                l1.t.J(hVar4, rVarC3, sVar3);
                rVar2 = oVar;
                d0.n.c(se.k.y(i11, sVar3, (i13 >> 6) & 14), null, e2.n(oVar, 54), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 432, 120);
                sVar2 = sVar3;
                if (z11) {
                    sVar2.d0(-681955275);
                    float f5 = 2;
                    d0.n.c(se.k.y(R.drawable.ic_learn_lesson_open_tag, sVar2, 0), null, e2.n(j0.c.E(j0.r.f35391a.a(rVar2, z1.c.f58465c), f5, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), 20), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 48, 120);
                    sVar2 = sVar2;
                } else {
                    sVar2.d0(-689672756);
                }
                sVar2.p(false);
                sVar2.p(true);
                j0.c.g(sVar2, e2.g(rVar2, 8));
                s sVar4 = sVar2;
                ua.b(h(str, sVar2), e2.s(rVar2, 120), 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 2, false, 3, 0, y0.a((y0) sVar2.j(ua.f31167a), ((s1) sVar2.j(v1.f31180a)).f31034q, j3.A(14), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar4, 48, 3120, 54780);
                sVar = sVar4;
                sVar.p(true);
            }
            defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar3);
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC2, sVar3);
            r rVarH2 = d0.n.h(e2.n(oVar, 78), j11, r0.f.f48733a);
            q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
            iHashCode = Long.hashCode(sVar3.T);
            q1 q1VarL3 = sVar3.l();
            r rVarC4 = z1.a.c(sVar3, rVarH2);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            l1.t.J(hVar, q0VarD2, sVar3);
            l1.t.J(hVar2, q1VarL3, sVar3);
            if (sVar3.S) {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar3);
            } else {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar3);
            }
            l1.t.J(hVar5, rVarC4, sVar3);
            rVar2 = oVar;
            d0.n.c(se.k.y(i11, sVar3, (i13 >> 6) & 14), null, e2.n(oVar, 54), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 432, 120);
            sVar2 = sVar3;
            if (z11) {
                sVar2.d0(-681955275);
                float f11 = 2;
                d0.n.c(se.k.y(R.drawable.ic_learn_lesson_open_tag, sVar2, 0), null, e2.n(j0.c.E(j0.r.f35391a.a(rVar2, z1.c.f58465c), f11, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), 20), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 48, 120);
                sVar2 = sVar2;
            } else {
                sVar2.d0(-689672756);
            }
            sVar2.p(false);
            sVar2.p(true);
            j0.c.g(sVar2, e2.g(rVar2, 8));
            s sVar5 = sVar2;
            ua.b(h(str, sVar2), e2.s(rVar2, 120), 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 2, false, 3, 0, y0.a((y0) sVar2.j(ua.f31167a), ((s1) sVar2.j(v1.f31180a)).f31034q, j3.A(14), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar5, 48, 3120, 54780);
            sVar = sVar5;
            sVar.p(true);
        } else {
            sVar = sVar3;
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(str, j11, i11, aVar, rVar2, z11, i12) { // from class: es.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f25778a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f25779b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f25780c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ fz.a f25781d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ r f25782e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f25783f;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1);
                    j.a(this.f25778a, this.f25779b, this.f25780c, this.f25781d, this.f25782e, this.f25783f, (n) obj, iM);
                    return b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(js.c cVar, fz.c cVar2, r rVar, n nVar, int i11) {
        boolean z11;
        boolean z12;
        Iterable iterable;
        s sVar = (s) nVar;
        sVar.f0(-888608640);
        int i12 = i11 | (sVar.f(cVar) ? 4 : 2) | (sVar.h(cVar2) ? 32 : 16) | (sVar.f(rVar) ? 256 : 128);
        int i13 = 1;
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            r rVarD = e2.d(rVar, 1.0f);
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarD);
            y2.k.J.getClass();
            fz.a aVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(aVar);
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
            if (cVar instanceof js.a) {
                sVar.d0(1468273229);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
                z12 = true;
            } else {
                if (!(cVar instanceof js.b)) {
                    throw p.x(sVar, 601554228, false);
                }
                sVar.d0(1468471102);
                js.b bVar = (js.b) cVar;
                if (bVar.f36738b) {
                    sVar.d0(1468410373);
                    tv.a.d(0, 1, sVar, null);
                    sVar.p(false);
                    z12 = true;
                    z11 = false;
                } else {
                    sVar.d0(1468566768);
                    List list = bVar.f36737a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ry.m.d0(arrayList, ((ChineseToneLevel) it.next()).getUnits());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        if (((ChineseToneUnit) obj).getUnitId() != 0) {
                            arrayList2.add(obj);
                        }
                    }
                    List listU0 = ry.m.U0(arrayList2, 6);
                    long j11 = bVar.f36739c;
                    List<List> listL = ns.o.L(ns.o.K(0), ns.o.L(1, 2), ns.o.L(3, 4), ns.o.K(5));
                    ArrayList arrayList3 = new ArrayList();
                    for (List list2 : listL) {
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            int iIntValue = ((Number) it2.next()).intValue();
                            ChineseToneUnit chineseToneUnit = (ChineseToneUnit) ry.m.t0(iIntValue, listU0);
                            l lVar = chineseToneUnit != null ? new l(Integer.valueOf(iIntValue), chineseToneUnit) : null;
                            if (lVar != null) {
                                arrayList4.add(lVar);
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            iterable = ry.r.f50854a;
                        } else {
                            int i15 = arrayList4.size() == i13 ? i13 : 0;
                            ArrayList arrayList5 = new ArrayList(ry.n.W(arrayList4, 10));
                            int size2 = arrayList4.size();
                            int i16 = 0;
                            while (i16 < size2) {
                                Object obj2 = arrayList4.get(i16);
                                i16++;
                                l lVar2 = (l) obj2;
                                boolean z13 = i15;
                                arrayList5.add(new qy.r((ChineseToneUnit) lVar2.f48496b, Integer.valueOf(((Number) lVar2.f48495a).intValue()), Boolean.valueOf(z13)));
                                i12 = i12;
                                i15 = z13 ? 1 : 0;
                            }
                            iterable = arrayList5;
                        }
                        int i17 = i12;
                        ry.m.d0(arrayList3, iterable);
                        i13 = 1;
                        i12 = i17;
                    }
                    int i18 = i12;
                    m0.b bVar2 = new m0.b(2);
                    r rVarD2 = e2.d(o.f58481a, 1.0f);
                    float f5 = 28;
                    float f11 = 36;
                    j0.v1 v1Var = new j0.v1(f5, f11, f5, f11);
                    j0.g gVarG = j0.i.g(f5);
                    j0.g gVarG2 = j0.i.g(f5);
                    boolean zH = sVar.h(arrayList3) | sVar.e(j11) | ((i18 & 112) == 32);
                    Object objQ = sVar.Q();
                    if (zH || objQ == m.f39353a) {
                        Object jVar = new au.j(arrayList3, j11, cVar2, 3);
                        sVar.o0(jVar);
                        objQ = jVar;
                    }
                    z11 = false;
                    z12 = true;
                    md.a.a(bVar2, rVarD2, null, v1Var, gVarG, gVarG2, null, false, null, (fz.c) objQ, sVar, 1769520, 916);
                    sVar.p(false);
                }
                sVar.p(z11);
            }
            sVar.p(z12);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i((Object) cVar, cVar2, (Object) rVar, i11, 27);
        }
    }

    public static final void c(fz.c onUnitClick, fz.a aVar, js.g gVar, n nVar, int i11) {
        s sVar;
        js.g gVar2;
        js.g gVar3;
        kotlin.jvm.internal.m.f(onUnitClick, "onUnitClick");
        s sVar2 = (s) nVar;
        sVar2.f0(-851235699);
        int i12 = i11 | (sVar2.h(onUnitClick) ? 4 : 2) | (sVar2.h(aVar) ? 32 : 16) | 128;
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            sVar2.Y();
            if ((i11 & 1) == 0 || sVar2.C()) {
                sVar2.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar2, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(js.g.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), null);
                sVar2.p(false);
                gVar3 = (js.g) viewModelA;
            } else {
                sVar2.W();
                gVar3 = gVar;
            }
            sVar2.q();
            sVar = sVar2;
            p7.a(null, t1.e.d(-136283311, new at.o(13, aVar), sVar2), null, null, null, 0, 0L, 0L, null, t1.e.d(1056211356, new at.p(7, onUnitClick, l1.t.o(gVar3.f36762e, sVar2)), sVar2), sVar, 805306416, 509);
            gVar2 = gVar3;
        } else {
            sVar = sVar2;
            sVar.W();
            gVar2 = gVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i(i11, 26, aVar, onUnitClick, gVar2);
        }
    }

    public static final void d(final String str, LessonState lessonState, final String str2, final fz.a aVar, final boolean z11, n nVar, int i11) {
        j0 j0VarA;
        int i12;
        long jC;
        s sVar = (s) nVar;
        sVar.f0(1155716351);
        int i13 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.d(lessonState.ordinal()) ? 32 : 16) | (sVar.f(str2) ? 256 : 128) | (sVar.h(aVar) ? 2048 : 1024) | (sVar.g(z11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            int[] iArr = i.f25821a;
            int i14 = iArr[lessonState.ordinal()];
            if (i14 == 1) {
                sVar.d0(-1753106989);
                c3 c3Var = v1.f31180a;
                j0VarA = p3.A(ns.o.L(new x(x.c(((s1) sVar.j(c3Var)).f31017a, 0.8f)), new x(((s1) sVar.j(c3Var)).f31017a)));
                sVar.p(false);
            } else if (i14 == 2) {
                sVar.d0(-1753098893);
                c3 c3Var2 = v1.f31180a;
                j0VarA = p3.A(ns.o.L(new x(x.c(((s1) sVar.j(c3Var2)).f31017a, 0.8f)), new x(((s1) sVar.j(c3Var2)).f31017a)));
                sVar.p(false);
            } else {
                if (i14 != 3) {
                    throw p.x(sVar, -1753108310, false);
                }
                sVar.d0(-1753090708);
                c3 c3Var3 = v1.f31180a;
                j0VarA = p3.A(ns.o.L(new x(x.c(((s1) sVar.j(c3Var3)).f31034q, 0.34f)), new x(x.c(((s1) sVar.j(c3Var3)).f31034q, 0.34f))));
                sVar.p(false);
            }
            final j0 j0Var = j0VarA;
            int i15 = iArr[lessonState.ordinal()];
            if (i15 == 1) {
                i12 = R.drawable.ic_lesson_index_lesson_redo;
            } else if (i15 == 2) {
                i12 = R.drawable.ic_lesson_index_lesson_start;
            } else {
                if (i15 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = R.drawable.ic_lesson_index_lesson_start_grey;
            }
            int i16 = iArr[lessonState.ordinal()];
            if (i16 == 1) {
                sVar.d0(-1753068666);
                jC = ((s1) sVar.j(v1.f31180a)).f31017a;
                sVar.p(false);
            } else if (i16 == 2) {
                sVar.d0(-1753066490);
                jC = ((s1) sVar.j(v1.f31180a)).f31017a;
                sVar.p(false);
            } else {
                if (i16 != 3) {
                    throw p.x(sVar, -1753070980, false);
                }
                sVar.d0(-1753063918);
                jC = x.c(((s1) sVar.j(v1.f31180a)).f31034q, 0.34f);
                sVar.p(false);
            }
            final long j11 = jC;
            final int i17 = i12;
            k7.d(e2.e(o.f58481a, 1.0f), r0.f.d(18), k7.p(((s1) sVar.j(v1.f31180a)).f31033p, sVar, 0), null, null, t1.e.d(-502547343, new fz.f() { // from class: es.e
                /* JADX WARN: Code duplicated, block: B:69:0x02b2  */
                /* JADX WARN: Code duplicated, block: B:71:0x0322  */
                /* JADX WARN: Code duplicated, block: B:74:0x0357  */
                /* JADX WARN: Code duplicated, block: B:76:0x038d  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v17 */
                /* JADX WARN: Type inference failed for: r10v7 */
                /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z12;
                    String strD0;
                    int i18;
                    int i19;
                    d0 d0Var;
                    c3 c3Var4;
                    s sVar2;
                    String str3;
                    o oVar;
                    ?? r11;
                    s sVar3;
                    boolean z13;
                    v Card = (v) obj;
                    n nVar2 = (n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(Card, "$this$Card");
                    s sVar4 = (s) nVar2;
                    if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                        int iHashCode = Long.hashCode(sVar4.T);
                        q1 q1VarL = sVar4.l();
                        o oVar2 = o.f58481a;
                        r rVarC = z1.a.c(sVar4, oVar2);
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
                        fz.a aVar2 = aVar;
                        boolean zF = sVar4.f(aVar2);
                        Object objQ = sVar4.Q();
                        if (zF || objQ == m.f39353a) {
                            objQ = new o0(26, aVar2);
                            sVar4.o0(objQ);
                        }
                        float f5 = 20;
                        r rVarG = e2.g(e2.e(j0.c.E(d0.n.o(oVar2, false, null, (fz.a) objQ, 15), f5, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, 10), 1.0f), 82);
                        a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar4, 48);
                        int iHashCode2 = Long.hashCode(sVar4.T);
                        q1 q1VarL2 = sVar4.l();
                        r rVarC2 = z1.a.c(sVar4, rVarG);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar, a2VarA, sVar4);
                        l1.t.J(hVar2, q1VarL2, sVar4);
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar3);
                        }
                        l1.t.J(hVar4, rVarC2, sVar4);
                        q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
                        int iHashCode3 = Long.hashCode(sVar4.T);
                        q1 q1VarL3 = sVar4.l();
                        r rVarC3 = z1.a.c(sVar4, oVar2);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar, q0VarD2, sVar4);
                        l1.t.J(hVar2, q1VarL3, sVar4);
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                            defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar3);
                        }
                        l1.t.J(hVar4, rVarC3, sVar4);
                        j0.o.a(d0.n.g(e2.n(oVar2, 42), j0Var, r0.f.d(12), 4), sVar4, 0);
                        d0.n.c(se.k.y(R.drawable.ic_lesson_index_course, sVar4, 0), null, e2.n(oVar2, 30), null, null, d0.n.t(sVar4) ? 0.8f : 1.0f, null, sVar4, 432, 88);
                        sVar4.p(true);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        r rVarE = j0.c.E(new i1(1.0f, true), 18, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                        u uVarA = t.a(j0.i.f35305c, z1.c.O, sVar4, 0);
                        int iHashCode4 = Long.hashCode(sVar4.T);
                        q1 q1VarL4 = sVar4.l();
                        r rVarC4 = z1.a.c(sVar4, rVarE);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar, uVarA, sVar4);
                        l1.t.J(hVar2, q1VarL4, sVar4);
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode4))) {
                            defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar3);
                        }
                        l1.t.J(hVar4, rVarC4, sVar4);
                        String str4 = str;
                        if (oz.x.l0(q.i1(str4).toString(), "Introduction", true)) {
                            i18 = -1972313863;
                            i19 = R.string.chinese_tone_lesson_title_introduction;
                            z12 = false;
                        } else {
                            z12 = false;
                            if (oz.x.l0(q.i1(str4).toString(), "Overview", true)) {
                                i18 = -1972133443;
                                i19 = R.string.chinese_tone_lesson_title_overview;
                            } else {
                                sVar4.d0(906218055);
                                strD0 = ub.a.d0(R.string.lesson_s, new Object[]{oz.x.q0(str4, "Lesson ", BuildConfig.VERSION_NAME)}, sVar4);
                                sVar4.p(false);
                            }
                            String str5 = strD0;
                            d0Var = ua.f31167a;
                            y0 y0Var = (y0) sVar4.j(d0Var);
                            long jA = j3.A(16);
                            c3Var4 = v1.f31180a;
                            ua.b(str5, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, ((s1) sVar4.j(c3Var4)).f31034q, jA, n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar4, 0, 0, 65534);
                            sVar2 = sVar4;
                            str3 = str2;
                            if (q.K0(str3)) {
                                oVar = oVar2;
                                r11 = 0;
                                sVar2.d0(-1988765935);
                                sVar3 = sVar2;
                            } else {
                                sVar2.d0(-1971449087);
                                y0 y0VarA = y0.a((y0) sVar2.j(d0Var), ((s1) sVar2.j(c3Var4)).f31036s, j3.A(14), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212);
                                oVar = oVar2;
                                ua.b(str3, j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar2, 48, 0, 65532);
                                sVar3 = sVar2;
                                r11 = 0;
                            }
                            sVar3.p(r11);
                            sVar3.p(true);
                            d0.n.c(se.k.y(i17, sVar3, r11), null, d2.h.i(oVar, k.p(sVar3), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(j11, 5), sVar3, 48, 56);
                            sVar3.p(true);
                            if (z11) {
                                sVar3.d0(-1100894282);
                                d0.n.c(se.k.y(R.drawable.ic_learn_lesson_open_tag, sVar3, 0), null, d2.h.i(j0.c.E(oVar, 56, 6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), k.p(sVar3), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 48, 120);
                                z13 = false;
                            } else {
                                z13 = false;
                                sVar3.d0(-1118929493);
                            }
                            sVar3.p(z13);
                            sVar3.p(true);
                        }
                        strD0 = ep.a.m(sVar4, i18, i19, sVar4, z12);
                        String str6 = strD0;
                        d0Var = ua.f31167a;
                        y0 y0Var2 = (y0) sVar4.j(d0Var);
                        long jA2 = j3.A(16);
                        c3Var4 = v1.f31180a;
                        ua.b(str6, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var2, ((s1) sVar4.j(c3Var4)).f31034q, jA2, n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar4, 0, 0, 65534);
                        sVar2 = sVar4;
                        str3 = str2;
                        if (q.K0(str3)) {
                            sVar2.d0(-1971449087);
                            y0 y0VarA2 = y0.a((y0) sVar2.j(d0Var), ((s1) sVar2.j(c3Var4)).f31036s, j3.A(14), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212);
                            oVar = oVar2;
                            ua.b(str3, j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA2, sVar2, 48, 0, 65532);
                            sVar3 = sVar2;
                            r11 = 0;
                        } else {
                            oVar = oVar2;
                            r11 = 0;
                            sVar2.d0(-1988765935);
                            sVar3 = sVar2;
                        }
                        sVar3.p(r11);
                        sVar3.p(true);
                        d0.n.c(se.k.y(i17, sVar3, r11), null, d2.h.i(oVar, k.p(sVar3), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(j11, 5), sVar3, 48, 56);
                        sVar3.p(true);
                        if (z11) {
                            sVar3.d0(-1100894282);
                            d0.n.c(se.k.y(R.drawable.ic_learn_lesson_open_tag, sVar3, 0), null, d2.h.i(j0.c.E(oVar, 56, 6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), k.p(sVar3), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 48, 120);
                            z13 = false;
                        } else {
                            z13 = false;
                            sVar3.d0(-1118929493);
                        }
                        sVar3.p(z13);
                        sVar3.p(true);
                    } else {
                        sVar4.W();
                    }
                    return b0.f48488a;
                }
            }, sVar), sVar, 196614, 24);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c0(str, lessonState, str2, aVar, z11, i11);
        }
    }

    public static final void e(final String str, final boolean z11, LessonState lessonState, final fz.a aVar, final List list, final fz.c cVar, final Long l9, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(1059437191);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(aVar) ? 2048 : 1024) | (sVar.h(list) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(cVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.f(l9) ? 1048576 : 524288);
        if (sVar.T(i12 & 1, (599059 & i12) != 599058)) {
            final Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF = sVar.f(null) | sVar.f(aVarC);
            Object objQ = sVar.Q();
            if (zF || objQ == m.f39353a) {
                objQ = w4.c.e(xt.u.class, aVarC, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            final xt.u uVar = (xt.u) objQ;
            k7.d(e2.e(o.f58481a, 1.0f), r0.f.d(18), null, null, null, t1.e.d(-1085964807, new fz.f() { // from class: es.f
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:100:0x0338  */
                /* JADX WARN: Code duplicated, block: B:48:0x014f  */
                /* JADX WARN: Code duplicated, block: B:90:0x02f5  */
                /* JADX WARN: Code duplicated, block: B:93:0x0302  */
                /* JADX WARN: Code duplicated, block: B:95:0x0320  */
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i13;
                    int i14;
                    int i15;
                    s sVar2;
                    l1.g gVar;
                    Long l11;
                    boolean z12;
                    boolean z13;
                    v Card = (v) obj;
                    n nVar2 = (n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(Card, "$this$Card");
                    boolean z14 = false;
                    s sVar3 = (s) nVar2;
                    if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        c3 c3Var = v1.f31180a;
                        long j11 = ((s1) sVar3.j(c3Var)).f31033p;
                        long j12 = ((s1) sVar3.j(c3Var)).f31034q;
                        r0 r0Var = f0.f28556b;
                        o oVar = o.f58481a;
                        r rVarH = d0.n.h(oVar, j11, r0Var);
                        fz.a aVar2 = aVar;
                        boolean zF2 = sVar3.f(aVar2);
                        Object objQ2 = sVar3.Q();
                        l1.g gVar2 = m.f39353a;
                        if (zF2 || objQ2 == gVar2) {
                            objQ2 = new o0(25, aVar2);
                            sVar3.o0(objQ2);
                        }
                        r rVarO = d0.n.o(rVarH, false, null, (fz.a) objQ2, 15);
                        float f5 = 20;
                        r rVarG = e2.g(e2.e(j0.c.E(rVarO, f5, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, 10), 1.0f), 56);
                        a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar3, 48);
                        int iHashCode = Long.hashCode(sVar3.T);
                        q1 q1VarL = sVar3.l();
                        r rVarC = z1.a.c(sVar3, rVarG);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar);
                        } else {
                            sVar3.r0();
                        }
                        y2.h hVar = y2.j.f56917f;
                        l1.t.J(hVar, a2VarA, sVar3);
                        y2.h hVar2 = y2.j.f56916e;
                        l1.t.J(hVar2, q1VarL, sVar3);
                        y2.h hVar3 = y2.j.f56918g;
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar3, iHashCode, hVar3);
                        }
                        y2.h hVar4 = y2.j.f56915d;
                        l1.t.J(hVar4, rVarC, sVar3);
                        String strM = str;
                        switch (q.i1(strM).toString()) {
                            case "2nd tone":
                                i13 = -7587685;
                                i14 = R.string.chinese_tone_lesson_2nd_tone;
                                strM = ep.a.m(sVar3, i13, i14, sVar3, false);
                                break;
                            case "4th tone":
                                i13 = -7581733;
                                i14 = R.string.chinese_tone_lesson_4th_tone;
                                strM = ep.a.m(sVar3, i13, i14, sVar3, false);
                                break;
                            case "3rd tone":
                                i13 = -7584709;
                                i14 = R.string.chinese_tone_lesson_3rd_tone;
                                strM = ep.a.m(sVar3, i13, i14, sVar3, false);
                                break;
                            case "一 (yī)":
                                i13 = -7576140;
                                i14 = R.string.chinese_tone_yi_title;
                                strM = ep.a.m(sVar3, i13, i14, sVar3, false);
                                break;
                            case "不 (bù)":
                                i13 = -7578828;
                                i14 = R.string.chinese_tone_bu_title;
                                strM = ep.a.m(sVar3, i13, i14, sVar3, false);
                                break;
                            case "1st tone":
                                i13 = -7590661;
                                i14 = R.string.chinese_tone_lesson_1st_tone;
                                strM = ep.a.m(sVar3, i13, i14, sVar3, false);
                                break;
                            default:
                                sVar3.d0(-7573630);
                                sVar3.p(false);
                                break;
                        }
                        String str2 = strM;
                        y0 y0VarA = y0.a((y0) sVar3.j(ua.f31167a), j12, j3.A(16), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        l1.g gVar3 = gVar2;
                        ua.b(str2, new i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar3, 0, 0, 65532);
                        boolean z15 = z11;
                        if (z15) {
                            sVar3.d0(-7562996);
                            i15 = R.drawable.keyboard_arrow_down_24px;
                        } else {
                            sVar3.d0(-7560254);
                            i15 = R.drawable.keyboard_arrow_right_24px;
                        }
                        k2.b bVarY = se.k.y(i15, sVar3, 0);
                        sVar3.p(false);
                        r4.b(bVarY, null, null, ((s1) sVar3.j(c3Var)).f31036s, sVar3, 48, 4);
                        sVar3.p(true);
                        if (z15) {
                            List list2 = list;
                            if (list2.isEmpty()) {
                                sVar3.d0(1992073673);
                                sVar3.p(false);
                            } else {
                                sVar3.d0(2012908029);
                                k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar3, 0, 7);
                                j0.d dVar = j0.i.f35305c;
                                r rVarE = e2.e(oVar, 1.0f);
                                u uVarA = t.a(dVar, z1.c.O, sVar2, 6);
                                int iHashCode2 = Long.hashCode(sVar2.T);
                                q1 q1VarL2 = sVar2.l();
                                r rVarC2 = z1.a.c(sVar2, rVarE);
                                sVar2.h0();
                                if (sVar2.S) {
                                    sVar2 = sVar3;
                                    sVar2.k(iVar);
                                } else {
                                    sVar2 = sVar3;
                                    sVar2.r0();
                                }
                                l1.t.J(hVar, uVarA, sVar2);
                                l1.t.J(hVar2, q1VarL2, sVar2);
                                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                                }
                                Iterator itO = com.google.android.material.datepicker.d.o(sVar2, rVarC2, hVar4, -2065325883, list2);
                                int i16 = 0;
                                while (itO.hasNext()) {
                                    Object next = itO.next();
                                    int i17 = i16 + 1;
                                    if (i16 < 0) {
                                        ns.o.V();
                                        throw null;
                                    }
                                    ChineseToneLesson chineseToneLesson = (ChineseToneLesson) next;
                                    String strG = j.g(context, uVar, chineseToneLesson.getLessonId(), chineseToneLesson.getDescription());
                                    String lessonName = chineseToneLesson.getLessonName();
                                    LessonState state = chineseToneLesson.getState();
                                    fz.c cVar2 = cVar;
                                    boolean zF3 = sVar2.f(cVar2) | sVar2.h(chineseToneLesson);
                                    Object objQ3 = sVar2.Q();
                                    if (zF3) {
                                        gVar = gVar3;
                                    } else {
                                        gVar = gVar3;
                                        if (objQ3 == gVar) {
                                        }
                                        fz.a aVar3 = (fz.a) objQ3;
                                        long lessonId = chineseToneLesson.getLessonId();
                                        l11 = l9;
                                        if (l11 == null && l11.longValue() == lessonId) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        j.d(lessonName, state, strG, aVar3, z12, sVar2, 0);
                                        if (i16 != ns.o.A(list2)) {
                                            sVar2.d0(920078326);
                                            s sVar4 = sVar2;
                                            k7.g(j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar4, 6, 6);
                                            sVar2 = sVar4;
                                            z13 = false;
                                        } else {
                                            z13 = false;
                                            sVar2.d0(898368840);
                                        }
                                        sVar2.p(z13);
                                        z14 = z13;
                                        i16 = i17;
                                        gVar3 = gVar;
                                    }
                                    objQ3 = new at.f(28, cVar2, chineseToneLesson);
                                    sVar2.o0(objQ3);
                                    fz.a aVar4 = (fz.a) objQ3;
                                    long lessonId2 = chineseToneLesson.getLessonId();
                                    l11 = l9;
                                    if (l11 == null) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    j.d(lessonName, state, strG, aVar4, z12, sVar2, 0);
                                    if (i16 != ns.o.A(list2)) {
                                        sVar2.d0(920078326);
                                        s sVar5 = sVar2;
                                        k7.g(j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar5, 6, 6);
                                        sVar2 = sVar5;
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                        sVar2.d0(898368840);
                                    }
                                    sVar2.p(z13);
                                    z14 = z13;
                                    i16 = i17;
                                    gVar3 = gVar;
                                }
                                boolean z16 = z14;
                                com.google.android.material.datepicker.d.B(sVar2, z16, true, z16);
                            }
                        } else {
                            sVar3.d0(1992073673);
                            sVar3.p(false);
                        }
                    } else {
                        sVar3.W();
                    }
                    return b0.f48488a;
                }
            }, sVar), sVar, 196614, 28);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new g(str, z11, lessonState, aVar, list, cVar, l9, i11);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void f(ChineseToneUnit chineseToneUnit, fz.a onBack, fz.c onLessonClick, fz.c onOverviewClick, w wVar, n nVar, int i11) {
        w wVar2;
        int i12;
        w wVar3;
        js.t tVar;
        w wVar4;
        l0.w wVar5;
        w wVar6;
        boolean z11;
        kotlin.jvm.internal.m.f(onBack, "onBack");
        kotlin.jvm.internal.m.f(onLessonClick, "onLessonClick");
        kotlin.jvm.internal.m.f(onOverviewClick, "onOverviewClick");
        s sVar = (s) nVar;
        sVar.f0(1333202447);
        int i13 = i11 | (sVar.h(chineseToneUnit) ? 4 : 2) | (sVar.h(onBack) ? 32 : 16) | (sVar.h(onLessonClick) ? 256 : 128) | (sVar.h(onOverviewClick) ? 2048 : 1024) | OSSConstants.DEFAULT_BUFFER_SIZE;
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            sVar.Y();
            int i14 = i11 & 1;
            l1.g gVar = m.f39353a;
            if (i14 == 0 || sVar.C()) {
                boolean zH = sVar.h(chineseToneUnit);
                Object objQ = sVar.Q();
                if (zH || objQ == gVar) {
                    objQ = new cr.n(chineseToneUnit, 15);
                    sVar.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(w.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), aVar);
                sVar.p(false);
                i12 = i13 & (-57345);
                wVar3 = (w) viewModelA;
            } else {
                sVar.W();
                i12 = i13 & (-57345);
                wVar3 = wVar;
            }
            sVar.q();
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            b1 b1VarO = l1.t.o(wVar3.f36844e, sVar);
            l0.w wVarA = y.a(0, sVar, 3);
            Object[] objArr = new Object[0];
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new cr.m(27);
                sVar.o0(objQ2);
            }
            b1 b1Var = (b1) w1.j.c(objArr, (fz.a) objQ2, sVar, 48);
            o oVar = o.f58481a;
            r rVarV = j0.c.v(oVar);
            int i15 = i12;
            z1.j jVar = z1.c.f58463a;
            q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarV);
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
            r rVarJ = j0.c.j(e2.e(oVar, 1.0f), 1.2417219f);
            c3 c3Var = v1.f31180a;
            j0.o.a(d0.n.g(rVarJ, p3.A(ns.o.L(new x(x.c(((s1) sVar.j(c3Var)).f31017a, 1.0f)), new x(x.c(((s1) sVar.j(c3Var)).f31017a, CropImageView.DEFAULT_ASPECT_RATIO)))), null, 6), sVar, 0);
            js.u uVar = (js.u) b1VarO.getValue();
            if (uVar instanceof js.s) {
                sVar.d0(-152806678);
                z11 = true;
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
                wVar6 = wVar3;
            } else {
                if (!(uVar instanceof js.t)) {
                    throw p.x(sVar, -282017709, false);
                }
                sVar.d0(-152457122);
                js.u uVar2 = (js.u) b1VarO.getValue();
                kotlin.jvm.internal.m.d(uVar2, "null cannot be cast to non-null type com.lingodeer.chinesetone.viewmodel.ChineseToneUnitUiState.Success");
                js.t tVar2 = (js.t) uVar2;
                e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
                boolean zF = sVar.f(null) | sVar.f(aVarC);
                Object objQ3 = sVar.Q();
                if (zF || objQ3 == gVar) {
                    objQ3 = w4.c.e(xt.u.class, aVarC, null, null, sVar);
                }
                sVar.p(false);
                sVar.p(false);
                xt.u uVar3 = (xt.u) objQ3;
                List list = tVar2.f36834b;
                Long l9 = tVar2.f36835c;
                boolean zF2 = sVar.f(b1Var) | sVar.h(tVar2) | sVar.h(wVar3) | sVar.f(wVarA);
                Object objQ4 = sVar.Q();
                if (zF2 || objQ4 == gVar) {
                    tVar = tVar2;
                    wVar4 = wVar3;
                    wVar5 = wVarA;
                    objQ4 = new x0(4, (Object) b1Var, (Object) tVar, (Object) wVar5, (Object) wVar4, (vy.d) null, false);
                    sVar.o0(objQ4);
                } else {
                    tVar = tVar2;
                    wVar4 = wVar3;
                    wVar5 = wVarA;
                }
                l1.t.g(list, l9, (fz.e) objQ4, sVar);
                u uVarA = t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                int iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC2 = z1.a.c(sVar, oVar);
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
                String strH = h(chineseToneUnit.getUnitName(), sVar);
                float f5 = bc.f30055a;
                js.t tVar3 = tVar;
                w wVar7 = wVar4;
                k.g(onBack, null, t1.e.d(-540861539, new e0(strH, 9), sVar), null, null, null, bc.f(f0.e(4294953984L), 0L, sVar, 30), null, sVar, ((i15 >> 3) & 14) | 384, 186);
                q0 q0VarD2 = j0.o.d(jVar, false);
                int iHashCode3 = Long.hashCode(sVar.T);
                q1 q1VarL3 = sVar.l();
                r rVarC3 = z1.a.c(sVar, oVar);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, q0VarD2, sVar);
                l1.t.J(hVar2, q1VarL3, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                }
                l1.t.J(hVar4, rVarC3, sVar);
                r rVarD = e2.d(oVar, 1.0f);
                float f11 = 32;
                float f12 = 24;
                j0.v1 v1Var = new j0.v1(f12, f11, f12, f11);
                j0.g gVarG = j0.i.g(12);
                wVar6 = wVar7;
                boolean zH2 = sVar.h(tVar3) | sVar.h(context) | sVar.h(uVar3) | ((i15 & 7168) == 2048) | ((i15 & 896) == 256) | sVar.h(wVar6);
                Object objQ5 = sVar.Q();
                if (zH2 || objQ5 == gVar) {
                    g7 g7Var = new g7((Object) tVar3, (Object) context, (Object) uVar3, onOverviewClick, (Object) onLessonClick, (Object) wVar6, 3);
                    sVar.o0(g7Var);
                    objQ5 = g7Var;
                }
                ue.f.a(rVarD, wVar5, v1Var, gVarG, null, null, false, null, (fz.c) objQ5, sVar, 24582, 488);
                sVar = sVar;
                j0.o.a(d0.n.g(e2.g(e2.e(j0.r.f35391a.a(oVar, z1.c.f58464b), 1.0f), f11), p3.A(ns.o.L(new x(f0.e(4294953984L)), new x(x.f28621h))), null, 6), sVar, 0);
                z11 = true;
                sVar.p(true);
                sVar.p(true);
                sVar.p(false);
            }
            sVar.p(z11);
            wVar2 = wVar6;
        } else {
            sVar.W();
            wVar2 = wVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.v1(chineseToneUnit, onBack, onLessonClick, onOverviewClick, wVar2, i11, 4);
        }
    }

    public static final String g(Context context, xt.u uVar, long j11, String str) {
        if (j11 > 0) {
            int iC = uVar.c("chinese_tone_lesson_" + j11);
            if (iC != 0) {
                String string = context.getString(iC);
                kotlin.jvm.internal.m.e(string, "getString(...)");
                return q.K0(string) ? str : string;
            }
        }
        return str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String h(String str, n nVar) {
        kotlin.jvm.internal.m.f(str, DytezVyM.nNLvbWRJPr);
        String string = q.i1(str).toString();
        switch (string.hashCode()) {
            case -1961549709:
                if (string.equals("Tone Basics")) {
                    s sVar = (s) nVar;
                    return ep.a.m(sVar, -943410669, R.string.chinese_tone_unit_1, sVar, false);
                }
                break;
            case -223967125:
                if (string.equals("Neutral Tone")) {
                    s sVar2 = (s) nVar;
                    return ep.a.m(sVar2, -943400493, R.string.chinese_tone_unit_5, sVar2, false);
                }
                break;
            case -156970427:
                if (string.equals("Double-Syllable Tone Practice")) {
                    s sVar3 = (s) nVar;
                    return ep.a.m(sVar3, -943405037, R.string.chinese_tone_unit_3, sVar3, false);
                }
                break;
            case 2571410:
                if (string.equals("TEST")) {
                    s sVar4 = (s) nVar;
                    return ep.a.m(sVar4, -943398474, R.string.chinese_tone_unit_test, sVar4, false);
                }
                break;
            case 392938005:
                if (string.equals("Tone Changes")) {
                    s sVar5 = (s) nVar;
                    return ep.a.m(sVar5, -943402765, R.string.chinese_tone_unit_4, sVar5, false);
                }
                break;
            case 896807918:
                if (string.equals("Single-Syllable Tone Practice")) {
                    s sVar6 = (s) nVar;
                    return ep.a.m(sVar6, -943407853, R.string.chinese_tone_unit_2, sVar6, false);
                }
                break;
        }
        s sVar7 = (s) nVar;
        sVar7.d0(-943396468);
        sVar7.p(false);
        return str;
    }
}
