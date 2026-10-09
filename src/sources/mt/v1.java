package mt;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.i9;
import h1.k7;
import h1.ua;
import java.util.WeakHashMap;
import rt.le;
import rt.me;
import rt.pe;
import rt.qe;
import rt.re;
import rt.se;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f41978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f41979b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f41980c = 112;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f41981d;

    static {
        float f5 = 10;
        f41978a = f5;
        f41981d = f5;
    }

    public static final void a(final boolean z11, final String query, final se scheduleFilter, final int i11, final int i12, final boolean z12, final boolean z13, final fz.a onSearchClick, final fz.c onQueryChange, final fz.a onSearchClose, final fz.a onScheduleFilterClick, final fz.a onToggleAll, final z1.r rVar, l1.n nVar, final int i13, final int i14) {
        int i15;
        int i16;
        kotlin.jvm.internal.m.f(query, "query");
        kotlin.jvm.internal.m.f(scheduleFilter, "scheduleFilter");
        kotlin.jvm.internal.m.f(onSearchClick, "onSearchClick");
        kotlin.jvm.internal.m.f(onQueryChange, "onQueryChange");
        kotlin.jvm.internal.m.f(onSearchClose, "onSearchClose");
        kotlin.jvm.internal.m.f(onScheduleFilterClick, "onScheduleFilterClick");
        kotlin.jvm.internal.m.f(onToggleAll, "onToggleAll");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1242908886);
        if ((i13 & 6) == 0) {
            i15 = (sVar.g(z11) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= sVar.f(query) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= sVar.f(scheduleFilter) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= sVar.d(i11) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= sVar.d(i12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((i13 & 196608) == 0) {
            i15 |= sVar.g(z12) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= sVar.g(z13) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i15 |= sVar.h(onSearchClick) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= sVar.h(onQueryChange) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= sVar.h(onSearchClose) ? 536870912 : 268435456;
        }
        int i17 = i15;
        if ((i14 & 48) == 0) {
            i16 = i14 | (sVar.h(onToggleAll) ? 32 : 16);
        } else {
            i16 = i14;
        }
        if (sVar.T(i17 & 1, ((i17 & 306783379) == 306783378 && (i16 & 147) == 146) ? false : true)) {
            int i18 = i17 >> 6;
            j(scheduleFilter, i11, i12, z12, z13, onScheduleFilterClick, onToggleAll, t1.e.d(217583432, new p1(z11, query, onQueryChange, onSearchClose, onSearchClick, 0), sVar), 4, rVar, sVar, (i18 & 57344) | (i18 & 14) | 113246208 | (i18 & 112) | (i18 & 896) | (i18 & 7168) | 196608 | ((i16 << 15) & 3670016) | 805306368);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: mt.q1
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i13 | 1);
                    int iM2 = l1.t.M(i14);
                    v1.a(z11, query, scheduleFilter, i11, i12, z12, z13, onSearchClick, onQueryChange, onSearchClose, onScheduleFilterClick, onToggleAll, rVar, (l1.n) obj, iM, iM2);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void b(me currentMode, fz.c onModeChange, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(currentMode, "currentMode");
        kotlin.jvm.internal.m.f(onModeChange, "onModeChange");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-337634333);
        int i12 = (sVar.d(currentMode.ordinal()) ? 4 : 2) | i11 | (sVar.h(onModeChange) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
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
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new q(27, b1Var);
                sVar.o0(objQ2);
            }
            k7.m((fz.a) objQ2, null, false, null, null, null, t1.e.d(-1161303616, new a00.b(currentMode, 23), sVar), sVar, 805306374, 510);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = new q(28, b1Var);
                sVar.o0(objQ3);
            }
            h1.s.a(zBooleanValue, (fz.a) objQ3, null, 0L, null, null, null, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, t1.e.d(2075791448, new u1(onModeChange, b1Var, 0), sVar), sVar, 48);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k9.p(currentMode, i11, 13, onModeChange);
        }
    }

    public static final void c(se seVar, z1.r rVar, l1.n nVar, int i11) {
        String strF;
        int i12;
        int i13;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-895144841);
        int i14 = (sVar.f(seVar) ? 4 : 2) | i11 | (sVar.f(rVar) ? 32 : 16);
        if (sVar.T(i14 & 1, (i14 & 19) != 18)) {
            boolean z11 = seVar instanceof qe;
            if (z11) {
                sVar.d0(192225582);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 48);
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
                le leVar = ((qe) seVar).f50315a;
                ua.b(f0.e(leVar.f50034a), null, 0L, fr.j3.A(10), null, null, null, 0L, null, fr.j3.A(11), 0, false, 1, 0, null, sVar, 3072, 3078, 121846);
                ua.b(f0.e(leVar.f50035b), null, 0L, fr.j3.A(10), null, null, null, 0L, null, fr.j3.A(11), 0, false, 1, 0, null, sVar, 3072, 3078, 121846);
                sVar = sVar;
                sVar.p(true);
                sVar.p(false);
            } else {
                sVar.d0(192872769);
                if (kotlin.jvm.internal.m.a(seVar, pe.f50253a)) {
                    i12 = 1249358333;
                    i13 = R.string.srs_filter_all;
                } else {
                    if (kotlin.jvm.internal.m.a(seVar, re.f50348a)) {
                        i12 = 1249360957;
                        i13 = R.string.srs_filter_new;
                    } else {
                        if (!z11) {
                            throw nv.p.x(sVar, 1249356494, false);
                        }
                        sVar.d0(1249364331);
                        sVar.p(false);
                        strF = f0.f(((qe) seVar).f50315a);
                    }
                    iu.k.c(strF, rVar, j3.y0.a(((dc) sVar.j(fc.f30256a)).m, 0L, 0L, null, null, null, 0L, null, null, 3, 0, fr.j3.A(16), null, 16613375), 2, false, 2, 0, new s0.g(fr.j3.A(9), fr.j3.A(14), fr.j3.z(0.25d)), sVar, (i14 & 112) | 1597440, 168);
                    sVar.p(false);
                }
                strF = ep.a.m(sVar, i12, i13, sVar, false);
                iu.k.c(strF, rVar, j3.y0.a(((dc) sVar.j(fc.f30256a)).m, 0L, 0L, null, null, null, 0L, null, null, 3, 0, fr.j3.A(16), null, 16613375), 2, false, 2, 0, new s0.g(fr.j3.A(9), fr.j3.A(14), fr.j3.z(0.25d)), sVar, (i14 & 112) | 1597440, 168);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k9.p(seVar, i11, 12, rVar);
        }
    }

    public static final void d(String str, boolean z11, fz.a aVar, z1.r rVar, l1.n nVar, int i11) {
        long j11;
        long j12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(383653845);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128) | (sVar.f(rVar) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            z1.r rVarB = d2.h.b(j0.e2.g(rVar, 48), r0.f.d(8));
            if (z11) {
                sVar.d0(524048667);
                j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31021c;
                sVar.p(false);
            } else {
                sVar.d0(524135901);
                j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31035r;
                sVar.p(false);
            }
            z1.r rVarB2 = q0.c.b(d0.n.h(rVarB, j11, g2.f0.f28556b), z11, false, new g3.k(3), aVar, 10);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarB2);
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
            z1.r rVarC2 = j0.c.C(z1.o.f58481a, 4, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j3.y0 y0Var = ((dc) sVar.j(fc.f30256a)).m;
            if (z11) {
                sVar.d0(384491827);
                j12 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31022d;
                sVar.p(false);
            } else {
                sVar.d0(384581045);
                j12 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s;
                sVar.p(false);
            }
            iu.k.c(str, rVarC2, j3.y0.a(y0Var, j12, 0L, null, null, null, 0L, null, null, 3, 0, fr.j3.A(16), null, 16613374), 2, false, 2, 0, new s0.g(fr.j3.A(9), fr.j3.A(14), fr.j3.z(0.25d)), sVar, (14 & i12) | 1597488, 168);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.d(str, z11, aVar, rVar, i11, 10);
        }
    }

    public static final void e(final float f5, final boolean z11, final String query, final se scheduleFilter, final int i11, final int i12, final boolean z12, final fz.a onSearchClick, final fz.c onQueryChange, final fz.a onSearchClose, final fz.a onScheduleFilterClick, final fz.a onScheduleFilterDismiss, final fz.c onScheduleFilterChange, final fz.a onToggleAll, final z1.r rVar, l1.n nVar, final int i13) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(query, "query");
        kotlin.jvm.internal.m.f(scheduleFilter, "scheduleFilter");
        kotlin.jvm.internal.m.f(onSearchClick, "onSearchClick");
        kotlin.jvm.internal.m.f(onQueryChange, "onQueryChange");
        kotlin.jvm.internal.m.f(onSearchClose, "onSearchClose");
        kotlin.jvm.internal.m.f(onScheduleFilterClick, "onScheduleFilterClick");
        kotlin.jvm.internal.m.f(onScheduleFilterDismiss, "onScheduleFilterDismiss");
        kotlin.jvm.internal.m.f(onScheduleFilterChange, "onScheduleFilterChange");
        kotlin.jvm.internal.m.f(onToggleAll, "onToggleAll");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(173408778);
        int i14 = i13 | (sVar2.c(f5) ? 4 : 2) | (sVar2.g(z11) ? 32 : 16) | (sVar2.f(query) ? 256 : 128) | (sVar2.f(scheduleFilter) ? 2048 : 1024) | (sVar2.d(i11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.d(i12) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.g(z12) ? 1048576 : 524288) | (sVar2.h(onSearchClick) ? 8388608 : 4194304) | (sVar2.h(onQueryChange) ? 67108864 : 33554432) | (sVar2.h(onSearchClose) ? 536870912 : 268435456);
        if (sVar2.T(i14 & 1, ((i14 & 306783379) == 306783378 && (((24630 | (sVar2.h(onScheduleFilterChange) ? (char) 256 : (char) 128)) | (sVar2.h(onToggleAll) ? (char) 2048 : (char) 1024)) & 9363) == 9362) ? false : true)) {
            Object objQ = sVar2.Q();
            if (objQ == l1.m.f39353a) {
                objQ = com.google.android.material.datepicker.d.f(sVar2);
            }
            h0.i iVar = (h0.i) objQ;
            z1.r rVarV = j0.c.v(j0.c.E(rVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarV);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar2);
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
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = j0.e2.e(oVar, 1.0f);
            l1.c3 c3Var = h1.v1.f31180a;
            sVar = sVar2;
            i9.a(rVarE, null, ((h1.s1) sVar2.j(c3Var)).f31033p, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1493653927, new fz.e() { // from class: mt.o1
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    l1.n nVar2 = (l1.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    l1.s sVar3 = (l1.s) nVar2;
                    if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar3, 0);
                        int iHashCode2 = Long.hashCode(sVar3.T);
                        l1.q1 q1VarL2 = sVar3.l();
                        z1.o oVar2 = z1.o.f58481a;
                        z1.r rVarC2 = z1.a.c(sVar3, oVar2);
                        y2.k.J.getClass();
                        y2.i iVar3 = y2.j.f56913b;
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar3);
                        } else {
                            sVar3.r0();
                        }
                        l1.t.J(y2.j.f56917f, uVarA2, sVar3);
                        l1.t.J(y2.j.f56916e, q1VarL2, sVar3);
                        y2.h hVar2 = y2.j.f56918g;
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                        }
                        l1.t.J(y2.j.f56915d, rVarC2, sVar3);
                        float f11 = n1.f41680a + 4;
                        t1.d dVarD = t1.e.d(-145066211, new p1(z11, query, onQueryChange, onSearchClose, onSearchClick, 1), sVar3);
                        z1.r rVarE2 = j0.e2.e(oVar2, 1.0f);
                        se seVar = scheduleFilter;
                        v1.j(seVar, i11, i12, z12, true, onScheduleFilterClick, onToggleAll, dVarD, f11, rVarE2, sVar3, 918577152);
                        v1.g(f11, null, sVar3, 6);
                        v1.f(seVar, onScheduleFilterChange, onScheduleFilterDismiss, j0.e2.e(oVar2, 1.0f), sVar3, 3072);
                        sVar3.p(true);
                    } else {
                        sVar3.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar2), sVar, 12582918, 122);
            z1.r rVarE2 = j0.e2.e(oVar, 1.0f);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.o.a(d0.n.n(d0.n.h(w4.c.p(1.0f, true, rVarE2), g2.x.c(((h1.s1) sVar.j(c3Var)).C, 0.45f), g2.f0.f28556b), iVar, null, false, null, onScheduleFilterDismiss, 28), sVar, 0);
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(f5, z11, query, scheduleFilter, i11, i12, z12, onSearchClick, onQueryChange, onSearchClose, onScheduleFilterClick, onScheduleFilterDismiss, onScheduleFilterChange, onToggleAll, rVar, i13) { // from class: mt.s1
                public final /* synthetic */ fz.a H;
                public final /* synthetic */ fz.c K;
                public final /* synthetic */ fz.a L;
                public final /* synthetic */ fz.a M;
                public final /* synthetic */ fz.a N;
                public final /* synthetic */ fz.c O;
                public final /* synthetic */ fz.a P;
                public final /* synthetic */ z1.r Q;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f41860a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f41861b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f41862c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ se f41863d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f41864e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f41865f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ boolean f41866t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1);
                    v1.e(this.f41860a, this.f41861b, this.f41862c, this.f41863d, this.f41864e, this.f41865f, this.f41866t, this.H, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void f(se seVar, fz.c cVar, fz.a aVar, z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1513837120);
        int i12 = i11 | (sVar.f(seVar) ? 4 : 2) | (sVar.h(cVar) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            boolean z11 = (i12 & 14) == 4;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = ep.a.s(seVar instanceof qe, sVar);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            z1.r rVarE = j0.c.E(rVar, CropImageView.DEFAULT_ASPECT_RATIO, f41979b, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
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
            z1.r rVarA = j0.c.A(d0.n.h(d2.h.b(j0.c.C(j0.e2.e(oVar, 1.0f), 12, CropImageView.DEFAULT_ASPECT_RATIO, 2), r0.f.d(10)), ((h1.s1) sVar.j(h1.v1.f31180a)).f31035r, g2.f0.f28556b), 2);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarA);
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
            String strE0 = ub.a.e0(sVar, R.string.srs_filter_all);
            boolean z12 = !((Boolean) b1Var.getValue()).booleanValue() && (seVar instanceof pe);
            int i13 = i12 & 112;
            boolean z13 = i13 == 32;
            Object objQ2 = sVar.Q();
            if (z13 || objQ2 == gVar) {
                objQ2 = new km.x0(cVar, 7);
                sVar.o0(objQ2);
            }
            j0.c2 c2Var = j0.c2.f35266a;
            d(strE0, z12, (fz.a) objQ2, c2Var.a(oVar, 0.8f), sVar, 0);
            String strE1 = ub.a.e0(sVar, R.string.srs_filter_new);
            boolean z14 = !((Boolean) b1Var.getValue()).booleanValue() && (seVar instanceof re);
            boolean z15 = i13 == 32;
            Object objQ3 = sVar.Q();
            if (z15 || objQ3 == gVar) {
                objQ3 = new km.x0(cVar, 8);
                sVar.o0(objQ3);
            }
            d(strE1, z14, (fz.a) objQ3, c2Var.a(oVar, 1.0f), sVar, 0);
            String strE2 = ub.a.e0(sVar, R.string.srs_filter_custom_range);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            boolean zF = sVar.f(b1Var);
            Object objQ4 = sVar.Q();
            if (zF || objQ4 == gVar) {
                objQ4 = new q(26, b1Var);
                sVar.o0(objQ4);
            }
            d(strE2, zBooleanValue, (fz.a) objQ4, c2Var.a(oVar, 1.65f), sVar, 0);
            sVar.p(true);
            a0.j0.c(((Boolean) b1Var.getValue()).booleanValue(), null, null, null, null, t1.e.d(-944566222, new defpackage.d(seVar, aVar, cVar, 13), sVar), sVar, 1572870, 30);
            sVar = sVar;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.d0(-611105480);
                sVar.p(false);
            } else {
                sVar.d0(-591027276);
                ep.a.C(oVar, f41978a, sVar, false);
            }
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.t(seVar, cVar, aVar, rVar, i11, 19);
        }
    }

    public static final void g(final float f5, z1.r rVar, l1.n nVar, final int i11) {
        final z1.r rVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(279906000);
        int i12 = i11 | 48;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            long j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31035r;
            rVar2 = z1.o.f58481a;
            z1.r rVarE = j0.e2.e(rVar2, 1.0f);
            float f11 = f41981d;
            z1.r rVarE2 = j0.c.E(j0.e2.g(rVarE, f11), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, 11);
            w2.q0 q0VarD = j0.o.d(z1.c.f58468f, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE2);
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
            z1.r rVarP = j0.e2.p(rVar2, f41980c, f11);
            w2.q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarP);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD2, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            z1.r rVarP2 = j0.e2.p(j0.c.y(rVar2, CropImageView.DEFAULT_ASPECT_RATIO, f41979b, 1), 18, f11);
            boolean zE = sVar.e(j11);
            Object objQ = sVar.Q();
            if (zE || objQ == l1.m.f39353a) {
                objQ = new au.o(j11, 16);
                sVar.o0(objQ);
            }
            d0.n.b(6, (fz.c) objQ, sVar, rVarP2);
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(f5, rVar2, i11) { // from class: mt.r1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f41824a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z1.r f41825b;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(7);
                    v1.g(this.f41824a, this.f41825b, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void h(String str, fz.c cVar, fz.a aVar, z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1802272913);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.h(cVar) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            e2.l lVar = (e2.l) sVar.j(z2.g1.f58548i);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new e2.v();
                sVar.o0(objQ);
            }
            e2.v vVar = (e2.v) objQ;
            WeakHashMap weakHashMap = j0.o2.f35353v;
            boolean z11 = j0.b.e(sVar).f35356c.e().f48796d > 0;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var = (l1.b1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = new bt.u2(vVar, null, 1);
                sVar.o0(objQ3);
            }
            l1.t.f((fz.e) objQ3, qy.b0.f48488a, sVar);
            Boolean boolValueOf = Boolean.valueOf(z11);
            boolean zG = sVar.g(z11) | sVar.h(lVar);
            Object objQ4 = sVar.Q();
            if (zG || objQ4 == gVar) {
                bt.t5 t5Var = new bt.t5(z11, lVar, b1Var, (vy.d) null, 6);
                sVar.o0(t5Var);
                objQ4 = t5Var;
            }
            l1.t.f((fz.e) objQ4, boolValueOf, sVar);
            z1.r rVarJ = e2.d.j(rVar, vVar);
            r0.e eVarD = r0.f.d(24);
            h1.j6 j6Var = h1.j6.f30479a;
            l1.c3 c3Var = h1.v1.f31180a;
            h1.t6.a(str, cVar, rVarJ, false, null, null, g.f41430g0, g.f41432h0, t1.e.d(716751418, new lt.g(aVar, 7, (byte) 0), sVar), false, null, null, null, true, 0, 0, eVarD, h1.j6.c(g2.x.c(((h1.s1) sVar.j(c3Var)).f31035r, 0.35f), g2.x.c(((h1.s1) sVar.j(c3Var)).f31035r, 0.35f), ((h1.s1) sVar.j(c3Var)).f31017a, g2.x.c(((h1.s1) sVar.j(c3Var)).A, 0.4f), sVar, 2147477455), sVar, (i12 & 14) | 918552576 | (i12 & 112), 12582912, 1965176);
            sVar = sVar;
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.t(str, cVar, aVar, rVar, i11, 20);
        }
    }

    public static final void i(int i11, fz.a aVar, l1.n nVar, z1.r rVar) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1769111508);
        int i12 = (sVar.h(aVar) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            i9.c(aVar, j0.e2.g(rVar, 48), false, r0.f.d(24), g2.x.c(((h1.s1) sVar.j(h1.v1.f31180a)).f31035r, 0.55f), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, null, g.f41428f0, sVar, i12 & 14, 996);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.u(i11, aVar, rVar);
        }
    }

    public static final void j(final se seVar, final int i11, final int i12, final boolean z11, final boolean z12, final fz.a aVar, final fz.a aVar2, t1.d dVar, final float f5, final z1.r rVar, l1.n nVar, final int i13) {
        int i14;
        l1.s sVar;
        i3.a aVar3;
        final t1.d dVar2 = dVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1259057402);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? sVar2.f(seVar) : sVar2.h(seVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar2.d(i11) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= sVar2.d(i12) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= sVar2.g(z11) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= sVar2.g(z12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i13) == 0) {
            i14 |= sVar2.h(aVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i13) == 0) {
            i14 |= sVar2.h(aVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= sVar2.h(dVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i14 |= sVar2.c(f5) ? 67108864 : 33554432;
        }
        if ((805306368 & i13) == 0) {
            i14 |= sVar2.f(rVar) ? 536870912 : 268435456;
        }
        if (sVar2.T(i14 & 1, (306783379 & i14) != 306783378)) {
            z1.r rVarC = j0.c.C(j0.e2.g(rVar, 52), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.a2 a2VarA = j0.z1.a(j0.i.g(8), z1.c.M, sVar2, 54);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarC);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, a2VarA, sVar2);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar2);
            y2.h hVar3 = y2.j.f56918g;
            int i15 = i14;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC2, sVar2);
            if (i12 <= 0) {
                aVar3 = i3.a.Off;
            } else if (z11) {
                aVar3 = i3.a.On;
            } else {
                aVar3 = i11 > 0 ? i3.a.Indeterminate : i3.a.Off;
            }
            String strE0 = ub.a.e0(sVar2, aVar3 == i3.a.On ? R.string.offline_deselect_all : R.string.offline_select_all);
            float f11 = 48;
            i3.a aVar4 = aVar3;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarN = j0.e2.n(oVar, f11);
            z1.j jVar = z1.c.f58467e;
            w2.q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, rVarN);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, q0VarD, sVar2);
            l1.t.J(hVar2, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar2);
            boolean z13 = i12 > 0;
            boolean zF = sVar2.f(strE0);
            Object objQ = sVar2.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = new gh.g(strE0, 1);
                sVar2.o0(objQ);
            }
            int i16 = i15 >> 15;
            h1.e1.c(aVar4, aVar2, g3.r.b(oVar, false, (fz.c) objQ), z13, null, sVar2, i16 & 112, 48);
            sVar = sVar2;
            sVar.p(true);
            if (!(((double) 1.0f) > 0.0d)) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.i1 i1Var = new j0.i1(1.0f, true);
            w2.q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, i1Var);
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
            l1.t.J(hVar4, rVarC4, sVar);
            dVar2 = dVar;
            hh.p0.x((i15 >> 21) & 14, dVar2, sVar, true);
            k7.i(aVar, j0.e2.s(j0.e2.g(oVar, f11), f41980c), false, r0.f.d(14), null, null, j0.c.d(10, CropImageView.DEFAULT_ASPECT_RATIO, 2), t1.e.d(-659141916, new gs.m(seVar, z12, 3), sVar), sVar, (14 & i16) | 817889328, 372);
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: mt.t1
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v1.j(seVar, i11, i12, z11, z12, aVar, aVar2, dVar2, f5, rVar, (l1.n) obj, l1.t.M(i13 | 1));
                    return qy.b0.f48488a;
                }
            };
        }
    }
}
