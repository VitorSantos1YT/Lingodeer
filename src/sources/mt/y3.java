package mt;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bt.d7;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevelType;
import com.yalantis.ucrop.view.CropImageView;
import h1.bc;
import h1.dc;
import h1.e8;
import h1.fc;
import h1.i7;
import h1.k7;
import h1.p7;
import h1.ua;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import j$.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import l0.Eeqr.HOBXIlHxIkMBEA;
import rt.ae;
import rt.l9;
import rt.r8;
import rt.ud;
import rt.xd;
import rt.yd;
import rt.zd;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y3 {
    public static final void A(sy.c cVar, z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1937685128);
        int i12 = (sVar.h(cVar) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            z1.r rVarE = j0.c.E(j0.e2.e(rVar, 1.0f), 16, CropImageView.DEFAULT_ASPECT_RATIO, 32, CropImageView.DEFAULT_ASPECT_RATIO, 10);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
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
            l1.t.J(hVar, q0VarD, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            long jC = g2.x.c(((h1.s1) sVar.j(h1.v1.f31180a)).f31017a, 0.8f);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarA = j0.r.f35391a.a(j0.e2.g(j0.e2.e(oVar, 1.0f), 2), z1.c.f58467e);
            boolean zH = sVar.h(cVar) | sVar.e(jC);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new k4(cVar, jC, 0);
                sVar.o0(objQ);
            }
            d0.n.b(0, (fz.c) objQ, sVar, rVarA);
            z1.r rVarE2 = j0.e2.e(oVar, 1.0f);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
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
            sVar.d0(-1430040413);
            ListIterator listIterator = cVar.listIterator(0);
            int i13 = 0;
            while (true) {
                sy.a aVar = (sy.a) listIterator;
                if (!aVar.hasNext()) {
                    com.google.android.material.datepicker.d.B(sVar, false, true, true);
                    break;
                }
                Object next = aVar.next();
                int i14 = i13 + 1;
                if (i13 < 0) {
                    ns.o.V();
                    throw null;
                }
                qy.l lVar = (qy.l) next;
                String str = (String) lVar.f48495a;
                int iIntValue = ((Number) lVar.f48496b).intValue();
                boolean zA = kotlin.jvm.internal.m.a(str, ub.a.e0(sVar, R.string.srs_now));
                boolean z11 = i13 == 1;
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                z(str, iIntValue, zA, z11, new j0.i1(1.0f, true), sVar, 0);
                i13 = i14;
            }
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k9.p(cVar, i11, 14, rVar);
        }
    }

    public static final String B(long j11, l1.s sVar) {
        Locale locale = ((Configuration) sVar.j(AndroidCompositionLocals_androidKt.f1199a)).getLocales().get(0);
        boolean zE = sVar.e(j11) | sVar.f(locale);
        Object objQ = sVar.Q();
        if (zE || objQ == l1.m.f39353a) {
            objQ = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(locale).format(Instant.ofEpochSecond(j11).atZone(ZoneId.systemDefault()).l());
            sVar.o0(objQ);
        }
        String str = (String) objQ;
        kotlin.jvm.internal.m.c(str);
        return str;
    }

    public static final void a(final qy.l lVar, final int i11, final boolean z11, final fz.a aVar, final fz.c cVar, final long j11, final z1.r rVar, l1.n nVar, final int i12) {
        j0.r rVar2;
        boolean z12;
        int i13;
        boolean z13;
        boolean z14;
        boolean z15;
        String strQ0;
        z1.j jVar = z1.c.f58464b;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1558496346);
        int i14 = i12 | (sVar.f(lVar) ? 4 : 2) | (sVar.d(i11) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.h(aVar) ? 2048 : 1024) | (sVar.h(cVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.e(j11) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.f(rVar) ? 1048576 : 524288);
        if (sVar.T(i14 & 1, (599187 & i14) != 599186)) {
            l1.b1 b1VarH = l1.t.H(aVar, sVar);
            l1.b1 b1VarH2 = l1.t.H(Boolean.valueOf(z11), sVar);
            l1.b1 b1VarH3 = l1.t.H(cVar, sVar);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar);
                sVar.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var = (l1.b1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(0L);
                sVar.o0(objQ3);
            }
            l1.b1 b1Var2 = (l1.b1) objQ3;
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = l1.t.B(0L);
                sVar.o0(objQ4);
            }
            l1.b1 b1Var3 = (l1.b1) objQ4;
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
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
            z1.o oVar = z1.o.f58481a;
            j0.r rVar3 = j0.r.f35391a;
            if (i11 != 0) {
                sVar.d0(1071232200);
                z1.r rVarJ = j0.c.j(j0.e2.s(j0.c.y(rVar3.a(oVar, jVar), CropImageView.DEFAULT_ASPECT_RATIO, -38, 1), 72), 0.51724136f);
                boolean zF = sVar.f(b1VarH2) | sVar.h(b0Var) | sVar.f(b1VarH3) | sVar.f(b1VarH);
                Object objQ5 = sVar.Q();
                if (zF || objQ5 == gVar) {
                    objQ5 = new dl.d(b0Var, b1VarH2, b1Var3, b1Var2, b1Var, b1VarH3, b1VarH, 6);
                    sVar.o0(objQ5);
                }
                rVar2 = rVar3;
                i13 = 1060452942;
                tv.g.a(rVarJ, i11, null, null, false, (fz.c) objQ5, sVar, (i14 & 112) | 196608, 28);
                z12 = false;
            } else {
                rVar2 = rVar3;
                z12 = false;
                i13 = 1060452942;
                sVar.d0(1060452942);
            }
            sVar.p(z12);
            if (lVar != null) {
                Object obj = lVar.f48495a;
                sVar.d0(1074823550);
                int i15 = x3.f42059b[((wt.t) lVar.f48496b).ordinal()];
                if (i15 == 1) {
                    z15 = false;
                    sVar.d0(727410710);
                    strQ0 = oz.x.q0(ub.a.e0(sVar, R.string.srs_mins), "%s", String.valueOf(((Number) obj).intValue()));
                    sVar.p(false);
                } else if (i15 == 2) {
                    z15 = false;
                    sVar.d0(727416182);
                    strQ0 = oz.x.q0(ub.a.e0(sVar, R.string.srs_hours), "%s", String.valueOf(((Number) obj).intValue()));
                    sVar.p(false);
                } else if (i15 == 3) {
                    z15 = false;
                    sVar.d0(727421590);
                    strQ0 = oz.x.q0(ub.a.e0(sVar, R.string.srs_days), "%s", String.valueOf(((Number) obj).intValue()));
                    sVar.p(false);
                } else if (i15 == 4) {
                    z15 = false;
                    sVar.d0(727427126);
                    strQ0 = oz.x.q0(ub.a.e0(sVar, R.string.srs_months), "%s", String.valueOf(((Number) obj).intValue()));
                    sVar.p(false);
                } else {
                    if (i15 != 5) {
                        throw nv.p.x(sVar, 727408494, false);
                    }
                    sVar.d0(727432598);
                    strQ0 = oz.x.q0(ub.a.e0(sVar, R.string.srs_years), "%s", String.valueOf(((Number) obj).intValue()));
                    z15 = false;
                    sVar.p(false);
                }
                z13 = z15;
                z14 = true;
                iu.k.c(strQ0, j0.c.E(rVar2.a(oVar, jVar), CropImageView.DEFAULT_ASPECT_RATIO, 92, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), j3.y0.a((j3.y0) sVar.j(ua.f31167a), j11, fr.j3.A(12), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), 0, false, 1, 0, new s0.g(fr.j3.A(6), fr.j3.A(12), fr.j3.A(1)), sVar, 1572864, 184);
            } else {
                z13 = false;
                z14 = true;
                sVar.d0(i13);
            }
            sVar.p(z13);
            sVar.p(z14);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(i11, z11, aVar, cVar, j11, rVar, i12) { // from class: mt.t3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f41919b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f41920c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ fz.a f41921d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ fz.c f41922e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f41923f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ z1.r f41924t;

                @Override // fz.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM = l1.t.M(1);
                    y3.a(this.f41918a, this.f41919b, this.f41920c, this.f41921d, this.f41922e, this.f41923f, this.f41924t, (l1.n) obj2, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void b(int i11, int i12, int i13, int i14, l1.n nVar, z1.r rVar) {
        z1.r rVar2;
        y2.i iVar;
        y2.h hVar;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-770023153);
        int i15 = i14 | (sVar.d(i11) ? 4 : 2) | (sVar.d(i12) ? 32 : 16) | (sVar.d(i13) ? 256 : 128) | 3072;
        if (sVar.T(i15 & 1, (i15 & 1171) != 1170)) {
            j0.a2 a2VarA = j0.z1.a(j0.i.g(8), z1.c.M, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
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
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, a2VarA, sVar);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            z1.r rVarB = d2.h.b(oVar, r0.f.a());
            l1.c3 c3Var = h1.v1.f31180a;
            long j11 = ((h1.s1) sVar.j(c3Var)).f31033p;
            g2.r0 r0Var = g2.f0.f28556b;
            z1.r rVarH = d0.n.h(rVarB, j11, r0Var);
            float f5 = 16;
            z1.r rVarC2 = j0.c.C(rVarH, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            z1.j jVar = z1.c.f58467e;
            w2.q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarC2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, q0VarD, sVar);
            l1.t.J(hVar3, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            }
            l1.t.J(hVar5, rVarC3, sVar);
            String strValueOf = i11 > 0 ? String.valueOf(i11) : "0";
            long jA = fr.j3.A(16);
            n3.s sVar2 = n3.s.H;
            ua.b(strValueOf, null, 0L, jA, null, sVar2, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 199680, 0, 131030);
            sVar.p(true);
            d0.n.c(se.k.y(R.drawable.flash_card_number_arrow, sVar, 0), null, d2.h.i(oVar, iu.k.p(sVar), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(g2.x.c(((h1.s1) sVar.j(c3Var)).f31034q, 1.0f), 5), sVar, 48, 56);
            z1.r rVarC4 = j0.c.C(d0.n.h(d2.h.b(oVar, r0.f.a()), ((h1.s1) sVar.j(c3Var)).f31033p, r0Var), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            w2.q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarC4);
            sVar.h0();
            if (sVar.S) {
                iVar = iVar2;
                sVar.k(iVar);
            } else {
                iVar = iVar2;
                sVar.r0();
            }
            l1.t.J(hVar2, q0VarD2, sVar);
            l1.t.J(hVar3, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                hVar = hVar4;
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar);
            } else {
                hVar = hVar4;
            }
            l1.t.J(hVar5, rVarC5, sVar);
            String strValueOf2 = String.valueOf(i12);
            kotlin.jvm.internal.m.f((h1.s1) sVar.j(c3Var), "<this>");
            y2.h hVar6 = hVar;
            y2.i iVar3 = iVar;
            ua.b(strValueOf2, null, d0.n.t(sVar) ? ju.a.f37302d1 : ju.a.f37292a0, fr.j3.A(16), null, sVar2, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 199680, 0, 131026);
            sVar.p(true);
            d0.n.c(se.k.y(R.drawable.flash_card_number_arrow, sVar, 0), null, d2.h.i(oVar, iu.k.p(sVar), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(g2.x.c(((h1.s1) sVar.j(c3Var)).f31034q, 1.0f), 5), sVar, 48, 56);
            z1.r rVarC6 = j0.c.C(d0.n.h(d2.h.b(oVar, r0.f.a()), ((h1.s1) sVar.j(c3Var)).f31033p, r0Var), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            w2.q0 q0VarD3 = j0.o.d(jVar, false);
            int iHashCode4 = Long.hashCode(sVar.T);
            l1.q1 q1VarL4 = sVar.l();
            z1.r rVarC7 = z1.a.c(sVar, rVarC6);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, q0VarD3, sVar);
            l1.t.J(hVar3, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar6);
            }
            l1.t.J(hVar5, rVarC7, sVar);
            String strValueOf3 = String.valueOf(i13);
            kotlin.jvm.internal.m.f((h1.s1) sVar.j(c3Var), "<this>");
            ua.b(strValueOf3, null, d0.n.t(sVar) ? ju.a.e1 : ju.a.f37295b0, fr.j3.A(16), null, sVar2, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 199680, 0, 131026);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.l(i11, i12, i13, i14, rVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00da  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:71:0x0103  */
    /* JADX WARN: Code duplicated, block: B:72:0x0105  */
    /* JADX WARN: Code duplicated, block: B:74:0x0108  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:77:0x010f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0113  */
    /* JADX WARN: Code duplicated, block: B:80:0x0117  */
    /* JADX WARN: Code duplicated, block: B:82:0x011d  */
    /* JADX WARN: Code duplicated, block: B:84:0x012b  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void c(final int i11, final int i12, final int i13, final fz.a onNavigateBack, fz.a aVar, final fz.a onMenuClick, boolean z11, boolean z12, int i14, fz.a aVar2, l1.n nVar, final int i15, final int i16) {
        fz.a aVar3;
        int i17;
        boolean z13;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        byte b3;
        boolean z14;
        l1.s sVar;
        final int i30;
        final fz.a aVar4;
        final boolean z15;
        final boolean z16;
        final fz.a aVar5;
        l1.x1 x1VarT;
        l1.g gVar;
        final boolean z17;
        final boolean z18;
        final int i31;
        final fz.a aVar6;
        Object objQ;
        Object objQ2;
        kotlin.jvm.internal.m.f(onNavigateBack, "onNavigateBack");
        kotlin.jvm.internal.m.f(onMenuClick, "onMenuClick");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1738815328);
        int i32 = (sVar2.d(i11) ? 4 : 2) | i15 | (sVar2.d(i12) ? 32 : 16) | (sVar2.d(i13) ? 256 : 128);
        int i33 = i16 & 16;
        if (i33 == 0) {
            if ((i15 & 24576) == 0) {
                aVar3 = aVar;
                i32 |= sVar2.h(aVar3) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            i17 = i16 & 64;
            if (i17 != 0) {
                i19 = i32 | 1572864;
                z13 = z11;
            } else {
                z13 = z11;
                if (sVar2.g(z13)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i19 = i32 | i18;
            }
            i21 = i16 & 128;
            if (i21 != 0) {
                i23 = i19 | 12582912;
            } else {
                if (sVar2.g(z12)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i23 = i19 | i22;
            }
            i24 = i16 & 256;
            if (i24 != 0) {
                i26 = i23 | 100663296;
            } else {
                int i34 = i23;
                if (sVar2.d(i14)) {
                    i25 = 67108864;
                } else {
                    i25 = 33554432;
                }
                i26 = i34 | i25;
            }
            i27 = i16 & 512;
            if (i27 != 0) {
                i29 = i26 | 805306368;
            } else {
                if (sVar2.h(aVar2)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i29 = i26 | i28;
            }
            b3 = 0;
            if ((i29 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (sVar2.T(i29 & 1, z14)) {
                gVar = l1.m.f39353a;
                if (i33 != 0) {
                    objQ2 = sVar2.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new ju.d(25);
                        sVar2.o0(objQ2);
                    }
                    aVar3 = (fz.a) objQ2;
                }
                final fz.a aVar7 = aVar3;
                if (i17 != 0) {
                    z17 = false;
                } else {
                    z17 = z13;
                }
                if (i21 != 0) {
                    z18 = true;
                } else {
                    z18 = z12;
                }
                if (i24 != 0) {
                    i31 = -1;
                } else {
                    i31 = i14;
                }
                if (i27 != 0) {
                    objQ = sVar2.Q();
                    if (objQ == gVar) {
                        objQ = new ju.d(25);
                        sVar2.o0(objQ);
                    }
                    aVar6 = (fz.a) objQ;
                } else {
                    aVar6 = aVar2;
                }
                t1.d dVarD = t1.e.d(1482631899, new fz.e() { // from class: mt.s3
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        l1.n nVar2 = (l1.n) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        l1.s sVar3 = (l1.s) nVar2;
                        if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                            y3.b(i11, i12, i13, 0, sVar3, null);
                        } else {
                            sVar3.W();
                        }
                        return qy.b0.f48488a;
                    }
                }, sVar2);
                t1.d dVarD2 = t1.e.d(1213466521, new lt.g(onNavigateBack, 9, b3), sVar2);
                z15 = z17;
                t1.d dVarD3 = t1.e.d(1945553232, new fz.f() { // from class: mt.v3
                    @Override // fz.f
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        z1.o oVar;
                        j0.b2 CenterAlignedTopAppBar = (j0.b2) obj;
                        l1.n nVar2 = (l1.n) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        kotlin.jvm.internal.m.f(CenterAlignedTopAppBar, "$this$CenterAlignedTopAppBar");
                        l1.s sVar3 = (l1.s) nVar2;
                        if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                            z1.o oVar2 = z1.o.f58481a;
                            boolean z19 = z17;
                            l1.g gVar2 = l1.m.f39353a;
                            if (z19) {
                                sVar3.d0(-607285388);
                                k2.b bVarY = se.k.y(R.drawable.ic_lesson_tips_btn, sVar3, 0);
                                fz.a aVar8 = aVar7;
                                boolean zF = sVar3.f(aVar8);
                                Object objQ3 = sVar3.Q();
                                if (zF || objQ3 == gVar2) {
                                    objQ3 = new e2(6, aVar8);
                                    sVar3.o0(objQ3);
                                }
                                oVar = oVar2;
                                d0.n.c(bVarY, null, j0.e2.n(iu.k.q(6, 7, (fz.a) objQ3, sVar3, oVar2, false), 22), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 48, 120);
                                j0.c.g(sVar3, j0.e2.s(oVar, 8));
                            } else {
                                oVar = oVar2;
                                sVar3.d0(-610908110);
                            }
                            sVar3.p(false);
                            if (z18) {
                                sVar3.d0(-606881303);
                                k2.b bVarY2 = se.k.y(R.drawable.ic_lesson_setting_btn, sVar3, 0);
                                fz.a aVar9 = onMenuClick;
                                boolean zF2 = sVar3.f(aVar9);
                                Object objQ4 = sVar3.Q();
                                if (zF2 || objQ4 == gVar2) {
                                    objQ4 = new e2(7, aVar9);
                                    sVar3.o0(objQ4);
                                }
                                z1.o oVar3 = oVar;
                                oVar = oVar3;
                                d0.n.c(bVarY2, null, j0.e2.n(iu.k.q(6, 7, (fz.a) objQ4, sVar3, oVar3, false), 22), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 48, 120);
                            } else {
                                sVar3.d0(-610908110);
                            }
                            sVar3.p(false);
                            int i35 = i31;
                            if (i35 != -1) {
                                sVar3.d0(-606513054);
                                j0.c.g(sVar3, j0.e2.s(oVar, 8));
                                fz.a aVar10 = aVar6;
                                boolean zF3 = sVar3.f(aVar10);
                                Object objQ5 = sVar3.Q();
                                if (zF3 || objQ5 == gVar2) {
                                    objQ5 = new e2(8, aVar10);
                                    sVar3.o0(objQ5);
                                }
                                ys.p2.a(i35, 0, (fz.a) objQ5, sVar3);
                            } else {
                                sVar3.d0(-610908110);
                            }
                            sVar3.p(false);
                            j0.c.g(sVar3, j0.e2.s(oVar, 12));
                        } else {
                            sVar3.W();
                        }
                        return qy.b0.f48488a;
                    }
                }, sVar2);
                float f5 = bc.f30055a;
                long j11 = g2.x.f28621h;
                l1.c3 c3Var = h1.v1.f31180a;
                h1.e0.a(dVarD, null, dVarD2, dVarD3, CropImageView.DEFAULT_ASPECT_RATIO, null, bc.a(j11, ((h1.s1) sVar2.j(c3Var)).f31034q, ((h1.s1) sVar2.j(c3Var)).f31034q, ((h1.s1) sVar2.j(c3Var)).f31034q, sVar2), sVar2, 3462, 178);
                sVar = sVar2;
                aVar4 = aVar7;
                z16 = z18;
                i30 = i31;
                aVar5 = aVar6;
            } else {
                sVar = sVar2;
                sVar.W();
                i30 = i14;
                aVar4 = aVar3;
                z15 = z13;
                z16 = z12;
                aVar5 = aVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: mt.w3
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        y3.c(i11, i12, i13, onNavigateBack, aVar4, onMenuClick, z15, z16, i30, aVar5, (l1.n) obj, l1.t.M(i15 | 1), i16);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i32 |= 24576;
        aVar3 = aVar;
        i17 = i16 & 64;
        if (i17 != 0) {
            i19 = i32 | 1572864;
            z13 = z11;
        } else {
            z13 = z11;
            if (sVar2.g(z13)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i19 = i32 | i18;
        }
        i21 = i16 & 128;
        if (i21 != 0) {
            i23 = i19 | 12582912;
        } else {
            if (sVar2.g(z12)) {
                i22 = 8388608;
            } else {
                i22 = 4194304;
            }
            i23 = i19 | i22;
        }
        i24 = i16 & 256;
        if (i24 != 0) {
            i26 = i23 | 100663296;
        } else {
            int i35 = i23;
            if (sVar2.d(i14)) {
                i25 = 67108864;
            } else {
                i25 = 33554432;
            }
            i26 = i35 | i25;
        }
        i27 = i16 & 512;
        if (i27 != 0) {
            i29 = i26 | 805306368;
        } else {
            if (sVar2.h(aVar2)) {
                i28 = 536870912;
            } else {
                i28 = 268435456;
            }
            i29 = i26 | i28;
        }
        b3 = 0;
        if ((i29 & 306783379) != 306783378) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (sVar2.T(i29 & 1, z14)) {
            gVar = l1.m.f39353a;
            if (i33 != 0) {
                objQ2 = sVar2.Q();
                if (objQ2 == gVar) {
                    objQ2 = new ju.d(25);
                    sVar2.o0(objQ2);
                }
                aVar3 = (fz.a) objQ2;
            }
            final fz.a aVar8 = aVar3;
            if (i17 != 0) {
                z17 = false;
            } else {
                z17 = z13;
            }
            if (i21 != 0) {
                z18 = true;
            } else {
                z18 = z12;
            }
            if (i24 != 0) {
                i31 = -1;
            } else {
                i31 = i14;
            }
            if (i27 != 0) {
                objQ = sVar2.Q();
                if (objQ == gVar) {
                    objQ = new ju.d(25);
                    sVar2.o0(objQ);
                }
                aVar6 = (fz.a) objQ;
            } else {
                aVar6 = aVar2;
            }
            t1.d dVarD4 = t1.e.d(1482631899, new fz.e() { // from class: mt.s3
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    l1.n nVar2 = (l1.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    l1.s sVar3 = (l1.s) nVar2;
                    if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        y3.b(i11, i12, i13, 0, sVar3, null);
                    } else {
                        sVar3.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar2);
            t1.d dVarD5 = t1.e.d(1213466521, new lt.g(onNavigateBack, 9, b3), sVar2);
            z15 = z17;
            t1.d dVarD6 = t1.e.d(1945553232, new fz.f() { // from class: mt.v3
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    z1.o oVar;
                    j0.b2 CenterAlignedTopAppBar = (j0.b2) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(CenterAlignedTopAppBar, "$this$CenterAlignedTopAppBar");
                    l1.s sVar3 = (l1.s) nVar2;
                    if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        z1.o oVar2 = z1.o.f58481a;
                        boolean z19 = z17;
                        l1.g gVar2 = l1.m.f39353a;
                        if (z19) {
                            sVar3.d0(-607285388);
                            k2.b bVarY = se.k.y(R.drawable.ic_lesson_tips_btn, sVar3, 0);
                            fz.a aVar9 = aVar8;
                            boolean zF = sVar3.f(aVar9);
                            Object objQ3 = sVar3.Q();
                            if (zF || objQ3 == gVar2) {
                                objQ3 = new e2(6, aVar9);
                                sVar3.o0(objQ3);
                            }
                            oVar = oVar2;
                            d0.n.c(bVarY, null, j0.e2.n(iu.k.q(6, 7, (fz.a) objQ3, sVar3, oVar2, false), 22), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 48, 120);
                            j0.c.g(sVar3, j0.e2.s(oVar, 8));
                        } else {
                            oVar = oVar2;
                            sVar3.d0(-610908110);
                        }
                        sVar3.p(false);
                        if (z18) {
                            sVar3.d0(-606881303);
                            k2.b bVarY2 = se.k.y(R.drawable.ic_lesson_setting_btn, sVar3, 0);
                            fz.a aVar10 = onMenuClick;
                            boolean zF2 = sVar3.f(aVar10);
                            Object objQ4 = sVar3.Q();
                            if (zF2 || objQ4 == gVar2) {
                                objQ4 = new e2(7, aVar10);
                                sVar3.o0(objQ4);
                            }
                            z1.o oVar3 = oVar;
                            oVar = oVar3;
                            d0.n.c(bVarY2, null, j0.e2.n(iu.k.q(6, 7, (fz.a) objQ4, sVar3, oVar3, false), 22), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 48, 120);
                        } else {
                            sVar3.d0(-610908110);
                        }
                        sVar3.p(false);
                        int i36 = i31;
                        if (i36 != -1) {
                            sVar3.d0(-606513054);
                            j0.c.g(sVar3, j0.e2.s(oVar, 8));
                            fz.a aVar11 = aVar6;
                            boolean zF3 = sVar3.f(aVar11);
                            Object objQ5 = sVar3.Q();
                            if (zF3 || objQ5 == gVar2) {
                                objQ5 = new e2(8, aVar11);
                                sVar3.o0(objQ5);
                            }
                            ys.p2.a(i36, 0, (fz.a) objQ5, sVar3);
                        } else {
                            sVar3.d0(-610908110);
                        }
                        sVar3.p(false);
                        j0.c.g(sVar3, j0.e2.s(oVar, 12));
                    } else {
                        sVar3.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar2);
            float f11 = bc.f30055a;
            long j12 = g2.x.f28621h;
            l1.c3 c3Var2 = h1.v1.f31180a;
            h1.e0.a(dVarD4, null, dVarD5, dVarD6, CropImageView.DEFAULT_ASPECT_RATIO, null, bc.a(j12, ((h1.s1) sVar2.j(c3Var2)).f31034q, ((h1.s1) sVar2.j(c3Var2)).f31034q, ((h1.s1) sVar2.j(c3Var2)).f31034q, sVar2), sVar2, 3462, 178);
            sVar = sVar2;
            aVar4 = aVar8;
            z16 = z18;
            i30 = i31;
            aVar5 = aVar6;
        } else {
            sVar = sVar2;
            sVar.W();
            i30 = i14;
            aVar4 = aVar3;
            z15 = z13;
            z16 = z12;
            aVar5 = aVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: mt.w3
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y3.c(i11, i12, i13, onNavigateBack, aVar4, onMenuClick, z15, z16, i30, aVar5, (l1.n) obj, l1.t.M(i15 | 1), i16);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void f(List list, z1.r rVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1393074888);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(rVar) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
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
            sy.c cVarO = ns.o.o();
            cVarO.add(new qy.l("Now", 0));
            cVarO.addAll(list);
            sy.c cVarE = ns.o.e(cVarO);
            if (cVarE.b() > 1) {
                sVar.d0(748462042);
                A(cVarE, j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, 48);
            } else {
                sVar.d0(746789220);
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.t1(list, i11, 17, rVar);
        }
    }

    public static final void g(int i11, fz.a onDismiss, fz.c onConfirm, l1.n nVar, int i12) {
        int i13;
        kotlin.jvm.internal.m.f(onDismiss, "onDismiss");
        kotlin.jvm.internal.m.f(onConfirm, "onConfirm");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(341995155);
        if ((i12 & 6) == 0) {
            i13 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.h(onDismiss) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar.h(onConfirm) ? 256 : 128;
        }
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            boolean z11 = (i13 & 896) == 256;
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new f0.t(onConfirm, 1);
                sVar.o0(objQ);
            }
            h(i11, false, 0, false, onDismiss, (fz.f) objQ, sVar, (i13 & 14) | 3504 | ((i13 << 9) & 57344));
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new gs.o(i11, onDismiss, onConfirm, i12, 3);
        }
    }

    public static final void h(final int i11, final boolean z11, final int i12, final boolean z12, final fz.a onDismiss, final fz.f onConfirm, l1.n nVar, final int i13) {
        final int i14;
        int i15;
        boolean z13;
        int i16;
        boolean z14;
        l1.s sVar;
        kotlin.jvm.internal.m.f(onDismiss, "onDismiss");
        kotlin.jvm.internal.m.f(onConfirm, "onConfirm");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(2136248560);
        if ((i13 & 6) == 0) {
            i14 = i11;
            i15 = (sVar2.d(i14) ? 4 : 2) | i13;
        } else {
            i14 = i11;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            z13 = z11;
            i15 |= sVar2.g(z13) ? 32 : 16;
        } else {
            z13 = z11;
        }
        if ((i13 & 384) == 0) {
            i16 = i12;
            i15 |= sVar2.d(i16) ? 256 : 128;
        } else {
            i16 = i12;
        }
        if ((i13 & 3072) == 0) {
            z14 = z12;
            i15 |= sVar2.g(z14) ? 2048 : 1024;
        } else {
            z14 = z12;
        }
        if ((i13 & 24576) == 0) {
            i15 |= sVar2.h(onDismiss) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i13) == 0) {
            i15 |= sVar2.h(onConfirm) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        int i17 = i15;
        if (sVar2.T(i17 & 1, (74899 & i17) != 74898)) {
            final boolean z15 = z13;
            final int i18 = i16;
            final boolean z16 = z14;
            sVar = sVar2;
            h1.a6.a(onDismiss, null, h1.a6.f(6, 2, null, sVar2), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-1542650765, new fz.f() { // from class: mt.m4
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    j0.v ModalBottomSheet = (j0.v) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                    l1.s sVar3 = (l1.s) nVar2;
                    if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        fz.f fVar = onConfirm;
                        boolean zF = sVar3.f(fVar);
                        fz.a aVar = onDismiss;
                        boolean zF2 = zF | sVar3.f(aVar);
                        Object objQ = sVar3.Q();
                        if (zF2 || objQ == l1.m.f39353a) {
                            objQ = new at.p(22, fVar, aVar);
                            sVar3.o0(objQ);
                        }
                        y3.i(i14, z15, i18, z16, (fz.f) objQ, aVar, sVar3, 0, 0);
                    } else {
                        sVar3.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar2), sVar, (i17 >> 12) & 14, 384, 4090);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: mt.o4
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    y3.h(i11, z11, i12, z12, onDismiss, onConfirm, (l1.n) obj, l1.t.M(i13 | 1));
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void i(final int i11, boolean z11, int i12, final boolean z12, fz.f fVar, fz.a aVar, l1.n nVar, final int i13, final int i14) {
        int i15;
        boolean z13;
        int i16;
        int i17;
        boolean z14;
        fz.f fVar2;
        int i18;
        final int i19;
        final boolean z15;
        final fz.f fVar3;
        final fz.a aVar2;
        fz.f fVar4;
        fz.a aVar3;
        fz.f fVar5;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1924394590);
        if ((i13 & 6) == 0) {
            i15 = (sVar.d(i11) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i21 = i14 & 2;
        if (i21 != 0) {
            i16 = i15 | 48;
            z13 = z11;
        } else {
            z13 = z11;
            i16 = i15 | (sVar.g(z13) ? 32 : 16);
        }
        int i22 = i14 & 4;
        if (i22 != 0) {
            i17 = i16 | 384;
        } else {
            i17 = i16 | (sVar.d(i12) ? 256 : 128);
        }
        if ((i13 & 3072) == 0) {
            z14 = z12;
            i17 |= sVar.g(z14) ? 2048 : 1024;
        } else {
            z14 = z12;
        }
        int i23 = i14 & 16;
        if (i23 != 0) {
            i18 = i17 | 24576;
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            i18 = i17 | (sVar.h(fVar2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        }
        if (sVar.T(i18 & 1, (i18 & 9363) != 9362)) {
            if (i21 != 0) {
                z13 = false;
            }
            int i24 = i22 != 0 ? 0 : i12;
            l1.g gVar = l1.m.f39353a;
            if (i23 != 0) {
                Object objQ = sVar.Q();
                if (objQ == gVar) {
                    objQ = new i(24);
                    sVar.o0(objQ);
                }
                fVar4 = (fz.f) objQ;
            } else {
                fVar4 = fVar2;
            }
            if ((i14 & 32) != 0) {
                Object objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = new ju.d(25);
                    sVar.o0(objQ2);
                }
                aVar3 = (fz.a) objQ2;
            } else {
                aVar3 = aVar;
            }
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = defpackage.e.v(i11, sVar);
            }
            final l1.a1 a1Var = (l1.a1) objQ3;
            boolean z16 = (i18 & 112) == 32;
            Object objQ4 = sVar.Q();
            if (z16 || objQ4 == gVar) {
                objQ4 = ep.a.s(z13, sVar);
            }
            final l1.b1 b1Var = (l1.b1) objQ4;
            boolean z17 = (i18 & 896) == 256;
            Object objQ5 = sVar.Q();
            if (z17 || objQ5 == gVar) {
                objQ5 = defpackage.e.v(i24, sVar);
            }
            final l1.a1 a1Var2 = (l1.a1) objQ5;
            Object objQ6 = sVar.Q();
            if (objQ6 == gVar) {
                objQ6 = l1.t.B(u6.f41963a);
                sVar.o0(objQ6);
            }
            final l1.b1 b1Var2 = (l1.b1) objQ6;
            final List listL = ns.o.L(5, 10, 15, 20, 30, 50, 80, 100);
            z1.h hVar = z1.c.P;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarA = j0.c.A(j0.e2.c(j0.e2.e(oVar, 1.0f), 0.72f), 16);
            j0.u uVarA = j0.t.a(j0.i.f35305c, hVar, sVar, 48);
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
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar2 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            v6 v6Var = (v6) b1Var2.getValue();
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            final boolean z18 = z14;
            a0.o.b(v6Var, j0.e2.e(new j0.i1(1.0f, true), 1.0f), null, null, null, null, t1.e.d(99866681, new fz.g() { // from class: mt.p4
                /* JADX WARN: Code duplicated, block: B:75:0x0397  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // fz.g
                public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
                    Object obj5;
                    l1.b1 b1Var3;
                    boolean zF;
                    Object objQ7;
                    boolean z19;
                    l1.s sVar2;
                    boolean z20;
                    l1.s sVar3;
                    v6 value = (v6) obj2;
                    l1.n nVar2 = (l1.n) obj3;
                    ((Integer) obj4).getClass();
                    kotlin.jvm.internal.m.f((a0.r) obj, HOBXIlHxIkMBEA.QHsmLapPuYLcK);
                    kotlin.jvm.internal.m.f(value, "value");
                    z1.h hVar3 = z1.c.P;
                    z1.o oVar2 = z1.o.f58481a;
                    float f5 = 1.0f;
                    int i25 = 0;
                    z1.r rVarY = d0.n.y(j0.e2.e(oVar2, 1.0f), d0.n.u(nVar2), false, 14);
                    j0.d dVar = j0.i.f35305c;
                    j0.u uVarA2 = j0.t.a(dVar, hVar3, nVar2, 48);
                    l1.s sVar4 = (l1.s) nVar2;
                    int iHashCode2 = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL2 = sVar4.l();
                    z1.r rVarC2 = z1.a.c(nVar2, rVarY);
                    y2.k.J.getClass();
                    fz.a aVar4 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(aVar4);
                    } else {
                        sVar4.r0();
                    }
                    y2.h hVar4 = y2.j.f56917f;
                    l1.t.J(hVar4, uVarA2, nVar2);
                    y2.h hVar5 = y2.j.f56916e;
                    l1.t.J(hVar5, q1VarL2, nVar2);
                    y2.h hVar6 = y2.j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar6);
                    }
                    y2.h hVar7 = y2.j.f56915d;
                    l1.t.J(hVar7, rVarC2, nVar2);
                    boolean zEquals = value.equals(u6.f41963a);
                    l1.b1 b1Var4 = b1Var2;
                    int i26 = 432;
                    Object obj6 = l1.m.f39353a;
                    if (zEquals) {
                        sVar4.d0(39528427);
                        String strE0 = ub.a.e0(nVar2, R.string.srs_cards_per_session);
                        Object objQ8 = sVar4.Q();
                        if (objQ8 == obj6) {
                            objQ8 = new ju.d(25);
                            sVar4.o0(objQ8);
                        }
                        ys.a.l(432, (fz.a) objQ8, strE0, nVar2, false);
                        sVar4.d0(555473435);
                        ArrayList arrayListG1 = ry.m.g1(listL, 2, 2);
                        int size = arrayListG1.size();
                        int i27 = 0;
                        while (i27 < size) {
                            int i28 = i27 + 1;
                            List list = (List) arrayListG1.get(i27);
                            z1.r rVarE = j0.c.E(j0.e2.e(oVar2, f5), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12, 7);
                            j0.a2 a2VarA = j0.z1.a(j0.i.f35310h, z1.c.L, nVar2, 6);
                            z1.o oVar3 = oVar2;
                            int iHashCode3 = Long.hashCode(sVar4.T);
                            l1.q1 q1VarL3 = sVar4.l();
                            z1.r rVarC3 = z1.a.c(nVar2, rVarE);
                            y2.k.J.getClass();
                            fz.a aVar5 = y2.j.f56913b;
                            sVar4.h0();
                            if (sVar4.S) {
                                sVar4.k(aVar5);
                            } else {
                                sVar4.r0();
                            }
                            l1.t.J(y2.j.f56917f, a2VarA, nVar2);
                            l1.t.J(y2.j.f56916e, q1VarL3, nVar2);
                            y2.h hVar8 = y2.j.f56918g;
                            if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                                defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar8);
                            }
                            l1.t.J(y2.j.f56915d, rVarC3, nVar2);
                            int iIntValue = ((Number) list.get(i25)).intValue();
                            String strValueOf = String.valueOf(((Number) list.get(i25)).intValue());
                            l1.a1 a1Var3 = a1Var;
                            l1.h1 h1Var = (l1.h1) a1Var3;
                            boolean z21 = h1Var.l() == ((Number) list.get(i25)).intValue() ? 1 : i25;
                            Object objQ9 = sVar4.Q();
                            if (objQ9 == obj6) {
                                objQ9 = new bt.a2(a1Var3, 13);
                                sVar4.o0(objQ9);
                            }
                            y3.x(iIntValue, strValueOf, z21, (fz.c) objQ9, nVar2, 3072);
                            int iIntValue2 = ((Number) list.get(1)).intValue();
                            String strValueOf2 = String.valueOf(((Number) list.get(1)).intValue());
                            boolean z22 = h1Var.l() == ((Number) list.get(1)).intValue();
                            Object objQ10 = sVar4.Q();
                            if (objQ10 == obj6) {
                                objQ10 = new bt.a2(a1Var3, 11);
                                sVar4.o0(objQ10);
                            }
                            y3.x(iIntValue2, strValueOf2, z22, (fz.c) objQ10, nVar2, 3072);
                            sVar4.p(true);
                            oVar2 = oVar3;
                            i26 = 432;
                            i27 = i28;
                            f5 = 1.0f;
                            i25 = 0;
                        }
                        int i29 = i26;
                        z1.o oVar4 = oVar2;
                        sVar4.p(i25);
                        if (z18) {
                            sVar4.d0(40878911);
                            String strE1 = ub.a.e0(nVar2, R.string.srs_customize_new_cards);
                            Object objQ11 = sVar4.Q();
                            if (objQ11 == obj6) {
                                objQ11 = new n4(0, b1Var4);
                                sVar4.o0(objQ11);
                            }
                            sVar3 = sVar4;
                            z19 = true;
                            y3.j(i29, (fz.a) objQ11, strE1, nVar2, j0.c.E(oVar4, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
                            z20 = false;
                        } else {
                            l1.s sVar5 = sVar4;
                            z19 = true;
                            z20 = false;
                            sVar5.d0(34348575);
                            sVar3 = sVar5;
                        }
                        sVar3.p(z20);
                        sVar3.p(z20);
                        sVar2 = sVar3;
                    } else {
                        if (!value.equals(t6.f41931a)) {
                            throw nv.p.x(sVar4, 555464073, false);
                        }
                        sVar4.d0(41377980);
                        String strE2 = ub.a.e0(nVar2, R.string.srs_customize_new_cards);
                        Object objQ12 = sVar4.Q();
                        if (objQ12 == obj6) {
                            objQ12 = new n4(1, b1Var4);
                            sVar4.o0(objQ12);
                        }
                        ys.a.l(432, (fz.a) objQ12, strE2, nVar2, true);
                        z1.r rVarE2 = j0.c.E(oVar2, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                        j0.u uVarA3 = j0.t.a(dVar, z1.c.O, nVar2, 0);
                        int iHashCode4 = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL4 = sVar4.l();
                        z1.r rVarC4 = z1.a.c(nVar2, rVarE2);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(aVar4);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar4, uVarA3, nVar2);
                        l1.t.J(hVar5, q1VarL4, nVar2);
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode4))) {
                            defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar6);
                        }
                        l1.t.J(hVar7, rVarC4, nVar2);
                        l1.s sVar6 = (l1.s) nVar2;
                        l1.s sVar7 = sVar4;
                        ua.b(ub.a.e0(nVar2, R.string.srs_new_cards_per_day), j0.c.E(j0.e2.e(oVar2, 1.0f), 6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, 6), 0L, fr.j3.A(16), null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar6.j(fc.f30256a)).f30175h, ((h1.s1) sVar6.j(h1.v1.f31180a)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), nVar2, 3072, 0, 65524);
                        l1.a1 a1Var4 = a1Var2;
                        int iL = ((l1.h1) a1Var4).l();
                        boolean zF2 = sVar7.f(a1Var4);
                        Object objQ13 = sVar7.Q();
                        if (zF2) {
                            obj5 = obj6;
                        } else {
                            obj5 = obj6;
                            if (objQ13 == obj5) {
                            }
                            y3.w(iL, 0, (fz.c) objQ13, nVar2);
                            String strE3 = ub.a.e0(nVar2, R.string.srs_shuffle_new_cards);
                            b1Var3 = b1Var;
                            boolean zBooleanValue = ((Boolean) b1Var3.getValue()).booleanValue();
                            zF = sVar7.f(b1Var3);
                            objQ7 = sVar7.Q();
                            if (zF || objQ7 == obj5) {
                                objQ7 = new p(10, b1Var3);
                                sVar7.o0(objQ7);
                            }
                            ys.a.m(strE3, zBooleanValue, (fz.c) objQ7, nVar2, 0);
                            z19 = true;
                            sVar7.p(true);
                            sVar7.p(false);
                            sVar2 = sVar7;
                        }
                        objQ13 = new bt.a2(a1Var4, 12);
                        sVar7.o0(objQ13);
                        y3.w(iL, 0, (fz.c) objQ13, nVar2);
                        String strE4 = ub.a.e0(nVar2, R.string.srs_shuffle_new_cards);
                        b1Var3 = b1Var;
                        boolean zBooleanValue2 = ((Boolean) b1Var3.getValue()).booleanValue();
                        zF = sVar7.f(b1Var3);
                        objQ7 = sVar7.Q();
                        if (zF) {
                            objQ7 = new p(10, b1Var3);
                            sVar7.o0(objQ7);
                        } else {
                            objQ7 = new p(10, b1Var3);
                            sVar7.o0(objQ7);
                        }
                        ys.a.m(strE4, zBooleanValue2, (fz.c) objQ7, nVar2, 0);
                        z19 = true;
                        sVar7.p(true);
                        sVar7.p(false);
                        sVar2 = sVar7;
                    }
                    sVar2.p(z19);
                    return qy.b0.f48488a;
                }
            }, sVar), sVar, 1572864, 60);
            boolean zF = ((i18 & 57344) == 16384) | sVar.f(b1Var) | sVar.f(a1Var2);
            Object objQ7 = sVar.Q();
            if (zF || objQ7 == gVar) {
                fVar5 = fVar4;
                objQ7 = new b0.k0(fVar5, a1Var, b1Var, a1Var2, 16);
                sVar.o0(objQ7);
            } else {
                fVar5 = fVar4;
            }
            iu.k.e((fz.a) objQ7, j0.e2.e(oVar, 1.0f), false, 0L, null, g.F0, sVar, 196656, 28);
            sVar.p(true);
            i19 = i24;
            z15 = z13;
            fVar3 = fVar5;
            aVar2 = aVar3;
        } else {
            sVar.W();
            i19 = i12;
            z15 = z13;
            fVar3 = fVar2;
            aVar2 = aVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: mt.q4
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y3.i(i11, z15, i19, z12, fVar3, aVar2, (l1.n) obj, l1.t.M(i13 | 1), i14);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void j(int i11, fz.a aVar, String str, l1.n nVar, z1.r rVar) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1699422380);
        int i12 = i11 | (sVar.f(str) ? 4 : 2);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.r rVarC = j0.c.C(d0.n.o(d2.h.b(j0.e2.i(j0.e2.e(rVar, 1.0f), 56, CropImageView.DEFAULT_ASPECT_RATIO, 2), r0.f.d(16)), false, null, aVar, 15), 12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
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
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            j3.y0 y0Var = ((dc) sVar.j(fc.f30256a)).f30175h;
            l1.c3 c3Var = h1.v1.f31180a;
            j3.y0 y0VarA = j3.y0.a(y0Var, ((h1.s1) sVar.j(c3Var)).f31034q, 0L, n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777210);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            ua.b(str, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar, i12 & 14, 0, 65532);
            sVar = sVar;
            h1.r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar, 0), null, null, ((h1.s1) sVar.j(c3Var)).f31036s, sVar, 48, 4);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new gs.q(str, aVar, rVar, i11, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f7  */
    public static final void k(boolean z11, int i11, int i12, int i13, int i14, fz.a onClickBookmarkCharacter, fz.a onClickBookmarkWord, fz.a onClickBookmarkExtentWord, fz.a onClickBookmarkExpression, l1.n nVar, int i15) {
        l1.s sVar;
        int i16;
        l1.g gVar;
        l1.s sVar2;
        boolean z12;
        l1.g gVar2;
        l1.s sVar3;
        boolean z13;
        Object objQ;
        kotlin.jvm.internal.m.f(onClickBookmarkCharacter, "onClickBookmarkCharacter");
        kotlin.jvm.internal.m.f(onClickBookmarkWord, "onClickBookmarkWord");
        kotlin.jvm.internal.m.f(onClickBookmarkExtentWord, "onClickBookmarkExtentWord");
        kotlin.jvm.internal.m.f(onClickBookmarkExpression, "onClickBookmarkExpression");
        l1.s sVar4 = (l1.s) nVar;
        sVar4.f0(788702345);
        int i17 = i15 | (sVar4.g(z11) ? 4 : 2) | (sVar4.g(false) ? 32 : 16) | (sVar4.d(i11) ? 256 : 128) | (sVar4.d(i12) ? 2048 : 1024) | (sVar4.d(i13) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar4.d(i14) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar4.h(onClickBookmarkCharacter) ? 1048576 : 524288) | (sVar4.h(onClickBookmarkWord) ? 8388608 : 4194304) | (sVar4.h(onClickBookmarkExtentWord) ? 67108864 : 33554432) | (sVar4.h(onClickBookmarkExpression) ? 536870912 : 268435456);
        if (sVar4.T(i17 & 1, (306783379 & i17) != 306783378)) {
            z1.r rVarC = j0.c.C(j0.c.C(j0.c.v(z1.o.f58481a), CropImageView.DEFAULT_ASPECT_RATIO, 22, 1), 12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.u uVarA = j0.t.a(j0.i.g(10), z1.c.O, sVar4, 6);
            int iHashCode = Long.hashCode(sVar4.T);
            l1.q1 q1VarL = sVar4.l();
            z1.r rVarC2 = z1.a.c(sVar4, rVarC);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar4.h0();
            if (sVar4.S) {
                sVar4.k(iVar);
            } else {
                sVar4.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar4);
            l1.t.J(y2.j.f56916e, q1VarL, sVar4);
            y2.h hVar = y2.j.f56918g;
            if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar4);
            l1.g gVar3 = l1.m.f39353a;
            if (z11) {
                sVar4.d0(-533287381);
                boolean z14 = (3670016 & i17) == 1048576;
                Object objQ2 = sVar4.Q();
                if (z14 || objQ2 == gVar3) {
                    objQ2 = new e2(22, onClickBookmarkCharacter);
                    sVar4.o0(objQ2);
                }
                t1.d dVarD = t1.e.d(68016657, new fu.b0(i11, 9), sVar4);
                i16 = -554974237;
                gVar = gVar3;
                z12 = false;
                k7.j((fz.a) objQ2, null, false, null, null, null, null, dVarD, sVar4, 100663296, 254);
                sVar2 = sVar4;
            } else {
                i16 = -554974237;
                gVar = gVar3;
                sVar2 = sVar4;
                z12 = false;
                sVar2.d0(-554974237);
            }
            sVar2.p(z12);
            boolean z15 = (29360128 & i17) == 8388608 ? true : z12;
            Object objQ3 = sVar2.Q();
            if (z15) {
                gVar2 = gVar;
            } else {
                gVar2 = gVar;
                if (objQ3 == gVar2) {
                }
                l1.g gVar4 = gVar2;
                sVar3 = sVar2;
                k7.j((fz.a) objQ3, null, false, null, null, null, null, t1.e.d(-1993951498, new fu.b0(i12, 10), sVar2), sVar3, 100663296, 254);
                sVar3.d0(i16);
                sVar3.p(z12);
                if ((1879048192 & i17) == 536870912) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                objQ = sVar3.Q();
                if (z13 || objQ == gVar4) {
                    objQ = new e2(24, onClickBookmarkExpression);
                    sVar3.o0(objQ);
                }
                k7.j((fz.a) objQ, null, false, null, null, null, null, t1.e.d(-1844441363, new fu.b0(i13, 11), sVar3), sVar3, 100663296, 254);
                sVar = sVar3;
                sVar.p(true);
            }
            objQ3 = new e2(23, onClickBookmarkWord);
            sVar2.o0(objQ3);
            l1.g gVar5 = gVar2;
            sVar3 = sVar2;
            k7.j((fz.a) objQ3, null, false, null, null, null, null, t1.e.d(-1993951498, new fu.b0(i12, 10), sVar2), sVar3, 100663296, 254);
            sVar3.d0(i16);
            sVar3.p(z12);
            if ((1879048192 & i17) == 536870912) {
                z13 = true;
            } else {
                z13 = z12;
            }
            objQ = sVar3.Q();
            if (z13) {
                objQ = new e2(24, onClickBookmarkExpression);
                sVar3.o0(objQ);
            } else {
                objQ = new e2(24, onClickBookmarkExpression);
                sVar3.o0(objQ);
            }
            k7.j((fz.a) objQ, null, false, null, null, null, null, t1.e.d(-1844441363, new fu.b0(i13, 11), sVar3), sVar3, 100663296, 254);
            sVar = sVar3;
            sVar.p(true);
        } else {
            sVar = sVar4;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iu.a(z11, i11, i12, i13, i14, onClickBookmarkCharacter, onClickBookmarkWord, onClickBookmarkExtentWord, onClickBookmarkExpression, i15);
        }
    }

    public static final void l(final int i11, int i12, l1.n nVar, z1.r rVar) {
        int i13;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-2069905372);
        if ((i12 & 6) == 0) {
            i13 = (sVar.f(rVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.d(i11) ? 32 : 16;
        }
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            final long jE = g2.f0.e(4294730761L);
            k7.k(rVar, r0.f.d(12), null, null, new d0.v(1, new g2.j0(0L, 9187343241974906880L, ns.o.L(new g2.x(g2.f0.e(4294673702L)), new g2.x(g2.f0.e(4294208521L))))), t1.e.d(668169368, new fz.f() { // from class: mt.o5
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v11 */
                /* JADX WARN: Type inference failed for: r12v12, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r12v17 */
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ?? r12;
                    j0.v OutlinedCard = (j0.v) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(OutlinedCard, "$this$OutlinedCard");
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                        int iHashCode = Long.hashCode(sVar2.T);
                        l1.q1 q1VarL = sVar2.l();
                        z1.o oVar = z1.o.f58481a;
                        z1.r rVarC = z1.a.c(sVar2, oVar);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        y2.h hVar = y2.j.f56917f;
                        l1.t.J(hVar, q0VarD, sVar2);
                        y2.h hVar2 = y2.j.f56916e;
                        l1.t.J(hVar2, q1VarL, sVar2);
                        y2.h hVar3 = y2.j.f56918g;
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
                        }
                        y2.h hVar4 = y2.j.f56915d;
                        l1.t.J(hVar4, rVarC, sVar2);
                        float f5 = 140;
                        float f11 = 104;
                        j0.o.a(d0.n.g(j0.e2.p(oVar, f5, f11), new g2.j0((((long) Float.floatToRawIntBits(-300.0f)) << 32) | (((long) Float.floatToRawIntBits(-300.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(200.0f)) << 32) | (((long) Float.floatToRawIntBits(200.0f)) & 4294967295L), ns.o.L(new g2.x(g2.x.c(g2.f0.e(4294961229L), 1.0f)), new g2.x(g2.x.c(g2.f0.e(4294961229L), CropImageView.DEFAULT_ASPECT_RATIO)))), null, 6), sVar2, 0);
                        j0.o.a(d0.n.g(j0.e2.p(j0.r.f35391a.a(d2.h.h(oVar, 180.0f), z1.c.K), f5, f11), new g2.j0((((long) Float.floatToRawIntBits(-300.0f)) << 32) | (((long) Float.floatToRawIntBits(-300.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(200.0f)) << 32) | (((long) Float.floatToRawIntBits(200.0f)) & 4294967295L), ns.o.L(new g2.x(g2.x.c(g2.f0.e(4294961229L), 1.0f)), new g2.x(g2.x.c(g2.f0.e(4294961229L), CropImageView.DEFAULT_ASPECT_RATIO)))), null, 6), sVar2, 0);
                        z1.r rVarE = j0.e2.e(j0.c.C(j0.e2.i(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
                        z1.i iVar2 = z1.c.M;
                        j0.b bVar = j0.i.f35303a;
                        j0.a2 a2VarA = j0.z1.a(bVar, iVar2, sVar2, 48);
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        l1.q1 q1VarL2 = sVar2.l();
                        z1.r rVarC2 = z1.a.c(sVar2, rVarE);
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
                        l1.t.J(hVar4, rVarC2, sVar2);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        j0.i1 i1Var = new j0.i1(1.0f, true);
                        j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                        int iHashCode3 = Long.hashCode(sVar2.T);
                        l1.q1 q1VarL3 = sVar2.l();
                        z1.r rVarC3 = z1.a.c(sVar2, i1Var);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(hVar, uVarA, sVar2);
                        l1.t.J(hVar2, q1VarL3, sVar2);
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                            defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
                        }
                        l1.t.J(hVar4, rVarC3, sVar2);
                        String strE0 = ub.a.e0(sVar2, R.string.words_amp_sentences);
                        long jA = fr.j3.A(16);
                        n3.s sVar3 = n3.s.L;
                        long j11 = jE;
                        ua.b(strE0, null, j11, jA, null, sVar3, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 200064, 0, 131026);
                        j0.a2 a2VarA2 = j0.z1.a(bVar, iVar2, sVar2, 48);
                        int iHashCode4 = Long.hashCode(sVar2.T);
                        l1.q1 q1VarL4 = sVar2.l();
                        z1.r rVarC4 = z1.a.c(sVar2, oVar);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(hVar, a2VarA2, sVar2);
                        l1.t.J(hVar2, q1VarL4, sVar2);
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode4))) {
                            defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar3);
                        }
                        l1.t.J(hVar4, rVarC4, sVar2);
                        int i14 = i11;
                        ua.b(String.valueOf(i14), null, j11, fr.j3.A(36), null, sVar3, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 200064, 0, 131026);
                        if (i14 > 0) {
                            sVar2.d0(1154707862);
                            d0.n.c(se.k.y(R.drawable.course_review_index_flashcards_arrow, sVar2, 0), null, d2.h.i(j0.c.E(oVar, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 4, 6), iu.k.p(sVar2), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 48, 120);
                            r12 = 0;
                        } else {
                            r12 = 0;
                            sVar2.d0(1136314694);
                        }
                        sVar2.p(r12);
                        sVar2.p(true);
                        sVar2.p(true);
                        d0.n.c(se.k.y(R.drawable.course_review_index_flashcards_pic, sVar2, r12), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 48, 124);
                        sVar2.p(true);
                        sVar2.p(true);
                    } else {
                        sVar2.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar), sVar, (i13 & 14) | 221184, 12);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.t(rVar, i11, i12, 1);
        }
    }

    public static final void m(int i11, int i12, int i13, String title, l1.n nVar, z1.r rVar) {
        kotlin.jvm.internal.m.f(title, "title");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-350780979);
        int i14 = i13 | (sVar.d(i11) ? 4 : 2) | (sVar.f(title) ? 32 : 16) | (sVar.d(i12) ? 256 : 128) | (sVar.f(rVar) ? 2048 : 1024);
        if (sVar.T(i14 & 1, (i14 & 1171) != 1170)) {
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
            d0.n.c(se.k.y(i11, sVar, i14 & 14), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
            z1.r rVarE = j0.c.E(z1.o.f58481a, 18, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            ua.b(title, w4.c.p(1.0f, true, rVarE), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar.j(fc.f30256a)).f30177j, 0L, 0L, n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777211), sVar, (i14 >> 3) & 14, 0, 65532);
            ua.b(String.valueOf(i12), null, ((h1.s1) sVar.j(h1.v1.f31180a)).f31017a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131066);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.z(i11, title, i12, rVar, i13);
        }
    }

    public static final void n(final int i11, final int i12, final int i13, final int i14, final int i15, final int i16, final int i17, final boolean z11, final boolean z12, final boolean z13, final int i18, final int i19, final int i21, final int i22, final int i23, final int i24, final int i25, final fz.a onClickFlashCard, final fz.a onClickQuiz, final fz.a onClickQuizVideo, final fz.a onClickCharacter, final fz.a onClickWord, final fz.a onClickExtentWord, final fz.a onClickExpression, final fz.a onClickKnowledgeCard, final fz.a onClickBookmarkCharacter, final fz.a onClickBookmarkWord, final fz.a onClickBookmarkExtentWord, final fz.a onClickBookmarkExpression, final fz.a onClickNoteCharacter, final fz.a onClickNoteWord, final fz.a onClickNoteExpression, final fz.a onClickFutureReview, final fz.a onClickListenAlong, l1.n nVar, final int i26, final int i27) {
        int i28;
        l1.s sVar;
        int i29;
        l1.g gVar;
        boolean z14;
        int i30;
        int i31;
        boolean z15;
        boolean z16;
        l1.b1 b1Var;
        kotlin.jvm.internal.m.f(onClickFlashCard, "onClickFlashCard");
        kotlin.jvm.internal.m.f(onClickQuiz, "onClickQuiz");
        kotlin.jvm.internal.m.f(onClickQuizVideo, "onClickQuizVideo");
        kotlin.jvm.internal.m.f(onClickCharacter, "onClickCharacter");
        kotlin.jvm.internal.m.f(onClickWord, "onClickWord");
        kotlin.jvm.internal.m.f(onClickExtentWord, "onClickExtentWord");
        kotlin.jvm.internal.m.f(onClickExpression, "onClickExpression");
        kotlin.jvm.internal.m.f(onClickKnowledgeCard, "onClickKnowledgeCard");
        kotlin.jvm.internal.m.f(onClickBookmarkCharacter, "onClickBookmarkCharacter");
        kotlin.jvm.internal.m.f(onClickBookmarkWord, "onClickBookmarkWord");
        kotlin.jvm.internal.m.f(onClickBookmarkExtentWord, "onClickBookmarkExtentWord");
        kotlin.jvm.internal.m.f(onClickBookmarkExpression, "onClickBookmarkExpression");
        kotlin.jvm.internal.m.f(onClickNoteCharacter, "onClickNoteCharacter");
        kotlin.jvm.internal.m.f(onClickNoteWord, "onClickNoteWord");
        kotlin.jvm.internal.m.f(onClickNoteExpression, "onClickNoteExpression");
        kotlin.jvm.internal.m.f(onClickFutureReview, "onClickFutureReview");
        kotlin.jvm.internal.m.f(onClickListenAlong, "onClickListenAlong");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(399994795);
        int i32 = i26 | (sVar2.d(i11) ? 4 : 2) | (sVar2.d(i12) ? 32 : 16) | (sVar2.d(i13) ? 256 : 128) | (sVar2.d(i14) ? 2048 : 1024) | (sVar2.d(i16) ? 131072 : 65536) | (sVar2.d(i17) ? 1048576 : 524288) | (sVar2.g(z11) ? 8388608 : 4194304) | (sVar2.g(z12) ? 67108864 : 33554432) | (sVar2.g(z13) ? 536870912 : 268435456);
        int i33 = (sVar2.g(false) ? (char) 4 : (char) 2) | (sVar2.d(i18) ? ' ' : (char) 16) | (sVar2.d(i19) ? 256 : 128) | (sVar2.d(i21) ? (char) 2048 : (char) 1024);
        boolean zD = sVar2.d(i22);
        int i34 = OSSConstants.DEFAULT_BUFFER_SIZE;
        int i35 = i33 | (zD ? 16384 : 8192) | (sVar2.d(i23) ? 131072 : 65536) | (sVar2.d(i24) ? 1048576 : 524288) | (sVar2.d(i25) ? 8388608 : 4194304) | (sVar2.h(onClickFlashCard) ? 67108864 : 33554432) | (sVar2.h(onClickQuiz) ? 536870912 : 268435456);
        int i36 = 3072 | (sVar2.h(onClickQuizVideo) ? (char) 4 : (char) 2) | (sVar2.h(onClickCharacter) ? 32 : 16) | (sVar2.h(onClickWord) ? 256 : 128) | (sVar2.h(onClickExpression) ? 16384 : 8192) | (sVar2.h(onClickKnowledgeCard) ? (char) 0 : (char) 0) | (sVar2.h(onClickBookmarkCharacter) ? (char) 0 : (char) 0) | (sVar2.h(onClickBookmarkWord) ? (char) 0 : (char) 0) | (sVar2.h(onClickBookmarkExtentWord) ? (char) 0 : (char) 0) | (sVar2.h(onClickBookmarkExpression) ? (char) 0 : (char) 0);
        if ((i27 & 6) == 0) {
            i28 = i27 | (sVar2.h(onClickNoteCharacter) ? 4 : 2);
        } else {
            i28 = i27;
        }
        if ((i27 & 48) == 0) {
            i28 |= sVar2.h(onClickNoteWord) ? 32 : 16;
        }
        if ((i27 & 384) == 0) {
            i28 |= sVar2.h(onClickNoteExpression) ? 256 : 128;
        }
        if ((i27 & 24576) == 0) {
            if (sVar2.h(onClickListenAlong)) {
                i34 = 16384;
            }
            i28 |= i34;
        }
        if (sVar2.T(i32 & 1, ((i32 & 306775187) == 306775186 && (i35 & 306783379) == 306783378 && (i36 & 306782355) == 306782354 && (i28 & 8339) == 8338) ? false : true)) {
            Object objQ = sVar2.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ == gVar2) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ);
            }
            final l1.b1 b1Var2 = (l1.b1) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar2) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ2);
            }
            final l1.b1 b1Var3 = (l1.b1) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar2) {
                objQ3 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ3);
            }
            final l1.b1 b1Var4 = (l1.b1) objQ3;
            final int i37 = i18 + i19 + i22 + i21;
            final int i38 = i23 + i24 + i25;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarD = j0.e2.d(oVar, 1.0f);
            z1.j jVar = z1.c.f58463a;
            w2.q0 q0VarD = j0.o.d(jVar, false);
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
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD, sVar2);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar2);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar2);
            float f5 = 18;
            z1.r rVarB = d2.h.b(j0.c.E(j0.e2.d(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 76, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), r0.f.f(f5, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12));
            l1.c3 c3Var = h1.v1.f31180a;
            z1.r rVarY = d0.n.y(d0.n.h(rVarB, ((h1.s1) sVar2.j(c3Var)).f31031n, g2.f0.f28556b), d0.n.u(sVar2), true, 12);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarY);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, uVarA, sVar2);
            l1.t.J(hVar2, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar2);
            float f11 = 20;
            p(384, ((h1.s1) sVar2.j(c3Var)).f31024f, ub.a.e0(sVar2, R.string.review_srs), sVar2, j0.c.E(oVar, f11, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12));
            float f12 = 14;
            z1.r rVarB2 = d2.h.b(j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), r0.f.d(12));
            boolean z17 = (i35 & 234881024) == 67108864;
            Object objQ4 = sVar2.Q();
            if (z17 || objQ4 == gVar2) {
                objQ4 = new e2(12, onClickFlashCard);
                sVar2.o0(objQ4);
            }
            l(i11, (i32 << 3) & 112, sVar2, d0.n.o(rVarB2, false, null, (fz.a) objQ4, 15));
            p(384, ((h1.s1) sVar2.j(c3Var)).f31017a, ub.a.e0(sVar2, R.string.review_practice), sVar2, j0.c.E(oVar, f11, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12));
            k7.d(j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, null, null, null, t1.e.d(1993279897, new fz.f() { // from class: mt.n5
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i39;
                    float f13;
                    l1.g gVar3;
                    j0.v Card = (j0.v) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(Card, "$this$Card");
                    l1.s sVar3 = (l1.s) nVar2;
                    if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        z1.o oVar2 = z1.o.f58481a;
                        boolean z18 = z11;
                        l1.g gVar4 = l1.m.f39353a;
                        if (z18) {
                            sVar3.d0(-416365741);
                            String strE0 = ub.a.e0(sVar3, R.string.characters);
                            z1.r rVarE = j0.e2.e(oVar2, 1.0f);
                            fz.a aVar = onClickCharacter;
                            boolean zF = sVar3.f(aVar);
                            Object objQ5 = sVar3.Q();
                            if (zF || objQ5 == gVar4) {
                                objQ5 = new e2(13, aVar);
                                sVar3.o0(objQ5);
                            }
                            float f14 = 16;
                            z1.r rVarI = j0.e2.i(j0.c.C(d0.n.o(rVarE, false, null, (fz.a) objQ5, 15), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), 67, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            f13 = 0.0f;
                            i39 = 2;
                            y3.m(R.drawable.course_review_index_character, i13, 0, strE0, sVar3, rVarI);
                            z1.r rVarC3 = j0.c.C(oVar2, f14, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            gVar3 = gVar4;
                            k7.g(rVarC3, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar3, 6, 6);
                        } else {
                            i39 = 2;
                            f13 = 0.0f;
                            gVar3 = gVar4;
                            sVar3.d0(-422146807);
                        }
                        sVar3.p(false);
                        String strE1 = ub.a.e0(sVar3, R.string.words);
                        z1.r rVarE2 = j0.e2.e(oVar2, 1.0f);
                        fz.a aVar2 = onClickWord;
                        boolean zF2 = sVar3.f(aVar2);
                        Object objQ6 = sVar3.Q();
                        if (zF2 || objQ6 == gVar3) {
                            objQ6 = new e2(14, aVar2);
                            sVar3.o0(objQ6);
                        }
                        float f15 = 16;
                        float f16 = 67;
                        y3.m(R.drawable.course_review_index_word, i14, 0, strE1, sVar3, j0.e2.i(j0.c.C(d0.n.o(rVarE2, false, null, (fz.a) objQ6, 15), f15, f13, i39), f16, f13, i39));
                        k7.g(j0.c.C(oVar2, f15, f13, i39), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar3, 6, 6);
                        String strE2 = ub.a.e0(sVar3, R.string.sentences);
                        z1.r rVarE3 = j0.e2.e(oVar2, 1.0f);
                        fz.a aVar3 = onClickExpression;
                        boolean zF3 = sVar3.f(aVar3);
                        Object objQ7 = sVar3.Q();
                        if (zF3 || objQ7 == gVar3) {
                            objQ7 = new e2(15, aVar3);
                            sVar3.o0(objQ7);
                        }
                        y3.m(R.drawable.course_review_index_sentence, i16, 0, strE2, sVar3, j0.e2.i(j0.c.C(d0.n.o(rVarE3, false, null, (fz.a) objQ7, 15), f15, f13, i39), f16, f13, i39));
                        if (z13) {
                            sVar3.d0(-414590495);
                            k7.g(j0.c.C(oVar2, f15, f13, i39), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar3, 6, 6);
                            String strE3 = ub.a.e0(sVar3, R.string.knowledge_cards);
                            z1.r rVarE4 = j0.e2.e(oVar2, 1.0f);
                            fz.a aVar4 = onClickKnowledgeCard;
                            boolean zF4 = sVar3.f(aVar4);
                            Object objQ8 = sVar3.Q();
                            if (zF4 || objQ8 == gVar3) {
                                objQ8 = new e2(16, aVar4);
                                sVar3.o0(objQ8);
                            }
                            y3.m(R.drawable.course_review_index_knowledge_card, i17, 0, strE3, sVar3, j0.e2.i(j0.c.C(d0.n.o(rVarE4, false, null, (fz.a) objQ8, 15), f15, f13, i39), f16, f13, i39));
                        } else {
                            sVar3.d0(-422146807);
                        }
                        sVar3.p(false);
                    } else {
                        sVar3.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar2), sVar2, 196614, 30);
            p(384, ((h1.s1) sVar2.j(c3Var)).f31017a, ub.a.e0(sVar2, R.string.review_others), sVar2, j0.c.E(oVar, f11, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12));
            k7.d(j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, null, null, null, t1.e.d(-87448176, new fz.f() { // from class: mt.p5
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    j0.v Card = (j0.v) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(Card, "$this$Card");
                    l1.s sVar3 = (l1.s) nVar2;
                    if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        String strE0 = ub.a.e0(sVar3, R.string._5_min_quiz);
                        z1.o oVar2 = z1.o.f58481a;
                        z1.r rVarE = j0.e2.e(oVar2, 1.0f);
                        final int i39 = i12;
                        boolean zD2 = sVar3.d(i39);
                        final boolean z18 = z12;
                        boolean zG = zD2 | sVar3.g(z18);
                        final fz.a aVar = onClickQuiz;
                        boolean zF = zG | sVar3.f(aVar);
                        Object objQ5 = sVar3.Q();
                        l1.g gVar3 = l1.m.f39353a;
                        if (zF || objQ5 == gVar3) {
                            final l1.b1 b1Var5 = b1Var2;
                            objQ5 = new fz.a() { // from class: mt.m5
                                @Override // fz.a
                                public final Object invoke() {
                                    if (i39 > 0) {
                                        if (z18) {
                                            b1Var5.setValue(Boolean.TRUE);
                                        } else {
                                            aVar.invoke();
                                        }
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar3.o0(objQ5);
                        }
                        float f13 = 16;
                        float f14 = 67;
                        y3.m(R.drawable.course_review_index_quiz, i39, 0, strE0, sVar3, j0.e2.i(j0.c.C(d0.n.o(rVarE, false, null, (fz.a) objQ5, 15), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2));
                        k7.g(j0.c.C(oVar2, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar3, 6, 6);
                        String strE1 = ub.a.e0(sVar3, R.string.listen_along);
                        int i40 = i14;
                        int i41 = i16;
                        int i42 = i40 + i41;
                        z1.r rVarE2 = j0.e2.e(oVar2, 1.0f);
                        boolean zD3 = sVar3.d(i40) | sVar3.d(i41);
                        fz.a aVar2 = onClickListenAlong;
                        boolean zF2 = zD3 | sVar3.f(aVar2);
                        Object objQ6 = sVar3.Q();
                        if (zF2 || objQ6 == gVar3) {
                            objQ6 = new i0(i40, i41, aVar2);
                            sVar3.o0(objQ6);
                        }
                        y3.m(R.drawable.course_review_index_listen_along, i42, 0, strE1, sVar3, j0.e2.i(j0.c.C(d0.n.o(rVarE2, false, null, (fz.a) objQ6, 15), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2));
                        k7.g(j0.c.C(oVar2, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar3, 6, 6);
                        String strE2 = ub.a.e0(sVar3, R.string.bookmarked);
                        z1.r rVarE3 = j0.e2.e(oVar2, 1.0f);
                        Object objQ7 = sVar3.Q();
                        if (objQ7 == gVar3) {
                            objQ7 = new n4(4, b1Var3);
                            sVar3.o0(objQ7);
                        }
                        y3.m(R.drawable.course_review_index_bookmark, i37, 0, strE2, sVar3, j0.e2.i(j0.c.C(d0.n.o(rVarE3, false, null, (fz.a) objQ7, 15), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2));
                        k7.g(j0.c.C(oVar2, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar3, 6, 6);
                        String strE3 = ub.a.e0(sVar3, R.string.knowledge_note_list_title);
                        z1.r rVarE4 = j0.e2.e(oVar2, 1.0f);
                        Object objQ8 = sVar3.Q();
                        if (objQ8 == gVar3) {
                            objQ8 = new n4(5, b1Var4);
                            sVar3.o0(objQ8);
                        }
                        y3.m(R.drawable.course_review_index_notes, i38, 0, strE3, sVar3, j0.e2.i(j0.c.C(d0.n.o(rVarE4, false, null, (fz.a) objQ8, 15), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2));
                    } else {
                        sVar3.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar2), sVar2, 196614, 30);
            ep.a.C(oVar, 16, sVar2, true);
            w2.q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode3 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL3 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, oVar);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, q0VarD2, sVar2);
            l1.t.J(hVar2, q1VarL3, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar2);
            d0.n.c(se.k.y(R.drawable.course_review_index_banner, sVar2, 0), null, j0.e2.g(j0.e2.e(oVar, 1.0f), 92), null, w2.i.f54520g, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 25008, 104);
            ua.b(ub.a.e0(sVar2, R.string.review), j0.r.f35391a.a(j0.c.F(oVar), z1.c.f58467e), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar2.j(fc.f30256a)).f30174g, g2.x.f28615b, fr.j3.A(20), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar2, 0, 0, 65532);
            sVar2.p(true);
            sVar2.p(true);
            if (((Boolean) b1Var3.getValue()).booleanValue()) {
                sVar2.d0(2015690312);
                Object objQ5 = sVar2.Q();
                if (objQ5 == gVar2) {
                    objQ5 = new n4(6, b1Var3);
                    sVar2.o0(objQ5);
                }
                fz.a aVar = (fz.a) objQ5;
                e8 e8VarF = h1.a6.f(6, 2, null, sVar2);
                gVar = gVar2;
                i30 = 6;
                h1.a6.a(aVar, null, e8VarF, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-1912874333, new fz.f() { // from class: mt.q5
                    @Override // fz.f
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        j0.v ModalBottomSheet = (j0.v) obj;
                        l1.n nVar2 = (l1.n) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                        l1.s sVar3 = (l1.s) nVar2;
                        if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                            fz.a aVar2 = onClickBookmarkCharacter;
                            boolean zF = sVar3.f(aVar2);
                            Object objQ6 = sVar3.Q();
                            l1.b1 b1Var5 = b1Var3;
                            l1.g gVar3 = l1.m.f39353a;
                            if (zF || objQ6 == gVar3) {
                                objQ6 = new fu.e(18, aVar2, b1Var5);
                                sVar3.o0(objQ6);
                            }
                            fz.a aVar3 = (fz.a) objQ6;
                            fz.a aVar4 = onClickBookmarkWord;
                            boolean zF2 = sVar3.f(aVar4);
                            Object objQ7 = sVar3.Q();
                            if (zF2 || objQ7 == gVar3) {
                                objQ7 = new fu.e(19, aVar4, b1Var5);
                                sVar3.o0(objQ7);
                            }
                            fz.a aVar5 = (fz.a) objQ7;
                            fz.a aVar6 = onClickBookmarkExtentWord;
                            boolean zF3 = sVar3.f(aVar6);
                            Object objQ8 = sVar3.Q();
                            if (zF3 || objQ8 == gVar3) {
                                objQ8 = new fu.e(20, aVar6, b1Var5);
                                sVar3.o0(objQ8);
                            }
                            fz.a aVar7 = (fz.a) objQ8;
                            fz.a aVar8 = onClickBookmarkExpression;
                            boolean zF4 = sVar3.f(aVar8);
                            Object objQ9 = sVar3.Q();
                            if (zF4 || objQ9 == gVar3) {
                                objQ9 = new fu.e(21, aVar8, b1Var5);
                                sVar3.o0(objQ9);
                            }
                            y3.k(z11, i18, i19, i21, i22, aVar3, aVar5, aVar7, (fz.a) objQ9, sVar3, 0);
                        } else {
                            sVar3.W();
                        }
                        return qy.b0.f48488a;
                    }
                }, sVar2), sVar2, 6, 384, 4090);
                sVar = sVar2;
                z14 = false;
            } else {
                sVar = sVar2;
                gVar = gVar2;
                z14 = false;
                i30 = 6;
                sVar.d0(2002982327);
            }
            sVar.p(z14);
            if (((Boolean) b1Var4.getValue()).booleanValue()) {
                sVar.d0(2016893887);
                Object objQ6 = sVar.Q();
                if (objQ6 == gVar) {
                    objQ6 = new n4(7, b1Var4);
                    sVar.o0(objQ6);
                }
                l1.s sVar3 = sVar;
                i31 = 2002982327;
                h1.a6.a((fz.a) objQ6, null, h1.a6.f(i30, 2, null, sVar), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-835824934, new fz.f() { // from class: mt.r5
                    @Override // fz.f
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        j0.v ModalBottomSheet = (j0.v) obj;
                        l1.n nVar2 = (l1.n) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                        l1.s sVar4 = (l1.s) nVar2;
                        if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                            fz.a aVar2 = onClickNoteCharacter;
                            boolean zF = sVar4.f(aVar2);
                            Object objQ7 = sVar4.Q();
                            l1.b1 b1Var5 = b1Var4;
                            l1.g gVar3 = l1.m.f39353a;
                            if (zF || objQ7 == gVar3) {
                                objQ7 = new fu.e(13, aVar2, b1Var5);
                                sVar4.o0(objQ7);
                            }
                            fz.a aVar3 = (fz.a) objQ7;
                            fz.a aVar4 = onClickNoteWord;
                            boolean zF2 = sVar4.f(aVar4);
                            Object objQ8 = sVar4.Q();
                            if (zF2 || objQ8 == gVar3) {
                                objQ8 = new fu.e(14, aVar4, b1Var5);
                                sVar4.o0(objQ8);
                            }
                            fz.a aVar5 = (fz.a) objQ8;
                            fz.a aVar6 = onClickNoteExpression;
                            boolean zF3 = sVar4.f(aVar6);
                            Object objQ9 = sVar4.Q();
                            if (zF3 || objQ9 == gVar3) {
                                objQ9 = new fu.e(15, aVar6, b1Var5);
                                sVar4.o0(objQ9);
                            }
                            y3.q(z11, i23, i24, i25, aVar3, aVar5, (fz.a) objQ9, sVar4, 0);
                        } else {
                            sVar4.W();
                        }
                        return qy.b0.f48488a;
                    }
                }, sVar), sVar3, 6, 384, 4090);
                sVar = sVar3;
                z15 = false;
            } else {
                i31 = 2002982327;
                z15 = false;
                sVar.d0(2002982327);
            }
            sVar.p(z15);
            if (((Boolean) r13.getValue()).booleanValue()) {
                sVar.d0(2017755098);
                Object objQ7 = sVar.Q();
                if (objQ7 == gVar) {
                    b1Var = b1Var2;
                    objQ7 = new n4(8, b1Var);
                    sVar.o0(objQ7);
                } else {
                    b1Var = r13;
                }
                i29 = i12;
                l1.s sVar4 = sVar;
                h1.a6.a((fz.a) objQ7, null, h1.a6.f(6, 2, null, sVar), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-307584485, new fu.v(i29, onClickQuiz, onClickQuizVideo, b1Var), sVar), sVar4, 6, 384, 4090);
                sVar = sVar4;
                z16 = false;
            } else {
                i29 = i12;
                z16 = false;
                sVar.d0(i31);
            }
            sVar.p(z16);
        } else {
            sVar = sVar2;
            i29 = i12;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i39 = i29;
            x1VarT.f39502d = new fz.e(i11, i39, i13, i14, i15, i16, i17, z11, z12, z13, i18, i19, i21, i22, i23, i24, i25, onClickFlashCard, onClickQuiz, onClickQuizVideo, onClickCharacter, onClickWord, onClickExtentWord, onClickExpression, onClickKnowledgeCard, onClickBookmarkCharacter, onClickBookmarkWord, onClickBookmarkExtentWord, onClickBookmarkExpression, onClickNoteCharacter, onClickNoteWord, onClickNoteExpression, onClickFutureReview, onClickListenAlong, i26, i27) { // from class: mt.s5
                public final /* synthetic */ boolean H;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ boolean L;
                public final /* synthetic */ int M;
                public final /* synthetic */ int N;
                public final /* synthetic */ int O;
                public final /* synthetic */ int P;
                public final /* synthetic */ int Q;
                public final /* synthetic */ int R;
                public final /* synthetic */ int S;
                public final /* synthetic */ fz.a T;
                public final /* synthetic */ fz.a U;
                public final /* synthetic */ fz.a V;
                public final /* synthetic */ fz.a W;
                public final /* synthetic */ fz.a X;
                public final /* synthetic */ fz.a Y;
                public final /* synthetic */ fz.a Z;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f41878a;

                /* JADX INFO: renamed from: a0, reason: collision with root package name */
                public final /* synthetic */ fz.a f41879a0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f41880b;

                /* JADX INFO: renamed from: b0, reason: collision with root package name */
                public final /* synthetic */ fz.a f41881b0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f41882c;

                /* JADX INFO: renamed from: c0, reason: collision with root package name */
                public final /* synthetic */ fz.a f41883c0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f41884d;

                /* JADX INFO: renamed from: d0, reason: collision with root package name */
                public final /* synthetic */ fz.a f41885d0;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f41886e;

                /* JADX INFO: renamed from: e0, reason: collision with root package name */
                public final /* synthetic */ fz.a f41887e0;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f41888f;

                /* JADX INFO: renamed from: f0, reason: collision with root package name */
                public final /* synthetic */ fz.a f41889f0;

                /* JADX INFO: renamed from: g0, reason: collision with root package name */
                public final /* synthetic */ fz.a f41890g0;

                /* JADX INFO: renamed from: h0, reason: collision with root package name */
                public final /* synthetic */ fz.a f41891h0;

                /* JADX INFO: renamed from: i0, reason: collision with root package name */
                public final /* synthetic */ fz.a f41892i0;

                /* JADX INFO: renamed from: j0, reason: collision with root package name */
                public final /* synthetic */ fz.a f41893j0;

                /* JADX INFO: renamed from: k0, reason: collision with root package name */
                public final /* synthetic */ int f41894k0;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ int f41895t;

                {
                    this.f41894k0 = i27;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1);
                    int iM2 = l1.t.M(this.f41894k0);
                    y3.n(this.f41878a, this.f41880b, this.f41882c, this.f41884d, this.f41886e, this.f41888f, this.f41895t, this.H, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.f41879a0, this.f41881b0, this.f41883c0, this.f41885d0, this.f41887e0, this.f41889f0, this.f41890g0, this.f41891h0, this.f41892i0, this.f41893j0, (l1.n) obj, iM, iM2);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void o(l1.b1 b1Var, boolean z11) {
        b1Var.setValue(Boolean.valueOf(z11));
    }

    public static final void p(int i11, long j11, String title, l1.n nVar, z1.r rVar) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(title, "title");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1047273097);
        int i12 = i11 | (sVar2.e(j11) ? 4 : 2) | (sVar2.f(title) ? 32 : 16);
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
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
            l1.t.J(y2.j.f56917f, a2VarA, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar2);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarP = j0.e2.p(oVar, 3, 15);
            boolean z11 = (i12 & 14) == 4;
            Object objQ = sVar2.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new au.o(j11, 17);
                sVar2.o0(objQ);
            }
            d0.n.b(6, (fz.c) objQ, sVar2, rVarP);
            ua.b(title, j0.c.E(oVar, 6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar2.j(fc.f30256a)).f30174g, 0L, fr.j3.A(18), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar2, ((i12 >> 3) & 14) | 48, 0, 65532);
            sVar = sVar2;
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new gr.i(j11, title, rVar, i11, 2);
        }
    }

    public static final void q(boolean z11, int i11, int i12, int i13, fz.a onClickNoteCharacter, fz.a onClickNoteWord, fz.a onClickNoteExpression, l1.n nVar, int i14) {
        l1.s sVar;
        l1.g gVar;
        int i15;
        l1.s sVar2;
        boolean z12;
        kotlin.jvm.internal.m.f(onClickNoteCharacter, "onClickNoteCharacter");
        kotlin.jvm.internal.m.f(onClickNoteWord, "onClickNoteWord");
        kotlin.jvm.internal.m.f(onClickNoteExpression, "onClickNoteExpression");
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(1684823362);
        int i16 = i14 | (sVar3.g(z11) ? 4 : 2) | (sVar3.d(i11) ? 32 : 16) | (sVar3.d(i12) ? 256 : 128) | (sVar3.d(i13) ? 2048 : 1024) | (sVar3.h(onClickNoteCharacter) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar3.h(onClickNoteWord) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar3.h(onClickNoteExpression) ? 1048576 : 524288);
        if (sVar3.T(i16 & 1, (i16 & 599187) != 599186)) {
            z1.r rVarC = j0.c.C(j0.c.C(j0.c.v(z1.o.f58481a), CropImageView.DEFAULT_ASPECT_RATIO, 22, 1), 12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.u uVarA = j0.t.a(j0.i.g(10), z1.c.O, sVar3, 6);
            int iHashCode = Long.hashCode(sVar3.T);
            l1.q1 q1VarL = sVar3.l();
            z1.r rVarC2 = z1.a.c(sVar3, rVarC);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar3);
            l1.t.J(y2.j.f56916e, q1VarL, sVar3);
            y2.h hVar = y2.j.f56918g;
            if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar3);
            l1.g gVar2 = l1.m.f39353a;
            if (z11) {
                sVar3.d0(-315640168);
                boolean z13 = (i16 & 57344) == 16384;
                Object objQ = sVar3.Q();
                if (z13 || objQ == gVar2) {
                    objQ = new e2(19, onClickNoteCharacter);
                    sVar3.o0(objQ);
                }
                t1.d dVarD = t1.e.d(120286410, new fu.b0(i11, 6), sVar3);
                z12 = false;
                gVar = gVar2;
                i15 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                k7.j((fz.a) objQ, null, false, null, null, null, null, dVarD, sVar3, 100663296, 254);
                sVar2 = sVar3;
            } else {
                gVar = gVar2;
                i15 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                sVar2 = sVar3;
                z12 = false;
                sVar2.d0(-339625302);
            }
            sVar2.p(z12);
            boolean z14 = (i16 & 458752) == i15 ? true : z12;
            Object objQ2 = sVar2.Q();
            l1.g gVar3 = gVar;
            if (z14 || objQ2 == gVar3) {
                objQ2 = new e2(20, onClickNoteWord);
                sVar2.o0(objQ2);
            }
            l1.s sVar4 = sVar2;
            k7.j((fz.a) objQ2, null, false, null, null, null, null, t1.e.d(1576541679, new fu.b0(i12, 7), sVar2), sVar4, 100663296, 254);
            boolean z15 = (i16 & 3670016) == 1048576 ? true : z12;
            Object objQ3 = sVar4.Q();
            if (z15 || objQ3 == gVar3) {
                objQ3 = new e2(21, onClickNoteExpression);
                sVar4.o0(objQ3);
            }
            k7.j((fz.a) objQ3, null, false, null, null, null, null, t1.e.d(237501606, new fu.b0(i13, 8), sVar4), sVar4, 100663296, 254);
            sVar = sVar4;
            sVar.p(true);
        } else {
            sVar = sVar3;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.c(z11, i11, i12, i13, onClickNoteCharacter, onClickNoteWord, onClickNoteExpression, i14);
        }
    }

    public static final void r(int i11, int i12, fz.a onClickQuiz, fz.a onClickQuizVideo, l1.n nVar) {
        kotlin.jvm.internal.m.f(onClickQuiz, "onClickQuiz");
        kotlin.jvm.internal.m.f(onClickQuizVideo, "onClickQuizVideo");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1758757777);
        int i13 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.h(onClickQuiz) ? 32 : 16) | (sVar.h(onClickQuizVideo) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            z1.r rVarC = j0.c.C(j0.c.C(j0.c.v(z1.o.f58481a), CropImageView.DEFAULT_ASPECT_RATIO, 22, 1), 12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.u uVarA = j0.t.a(j0.i.g(10), z1.c.O, sVar, 6);
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
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            boolean z11 = (i13 & 112) == 32;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new e2(17, onClickQuiz);
                sVar.o0(objQ);
            }
            k7.j((fz.a) objQ, null, false, null, null, null, null, t1.e.d(-605732226, new fu.b0(i11, 4), sVar), sVar, 100663296, 254);
            boolean z12 = (i13 & 896) == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new e2(18, onClickQuizVideo);
                sVar.o0(objQ2);
            }
            k7.j((fz.a) objQ2, null, false, null, null, null, null, t1.e.d(-938043403, new fu.b0(i11, 5), sVar), sVar, 100663296, 254);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m0(i11, onClickQuiz, onClickQuizVideo, i12, 2);
        }
    }

    public static final void s(int i11, fz.a onDismissRequest, fz.a onReviewSuggestions, fz.a onKeepCurrentPlan, l1.n nVar, int i12) {
        int i13;
        l1.s sVar;
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        kotlin.jvm.internal.m.f(onReviewSuggestions, "onReviewSuggestions");
        kotlin.jvm.internal.m.f(onKeepCurrentPlan, "onKeepCurrentPlan");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1677503642);
        if ((i12 & 6) == 0) {
            i13 = (sVar2.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar2.h(onDismissRequest) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar2.h(onReviewSuggestions) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar2.h(onKeepCurrentPlan) ? 2048 : 1024;
        }
        if (sVar2.T(i13 & 1, (i13 & 1171) != 1170)) {
            sVar = sVar2;
            h1.a6.a(onDismissRequest, null, h1.a6.f(6, 2, null, sVar2), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(1953296937, new jr.h0(i11, 2, onReviewSuggestions, onKeepCurrentPlan), sVar2), sVar, (i13 >> 3) & 14, 384, 4090);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ku.b(i11, onDismissRequest, onReviewSuggestions, onKeepCurrentPlan, i12, 1);
        }
    }

    public static final void t(ae uiState, fz.a onBackClick, fz.c onToggleItem, fz.a onToggleAll, fz.c onEditItem, fz.e onUpdateReviewDay, fz.a onApply, fz.a onApplied, l1.n nVar, int i11) {
        l1.s sVar;
        Object obj;
        boolean z11;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        zd zdVar = uiState.f49469d;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onToggleItem, "onToggleItem");
        kotlin.jvm.internal.m.f(onToggleAll, "onToggleAll");
        kotlin.jvm.internal.m.f(onEditItem, "onEditItem");
        kotlin.jvm.internal.m.f(onUpdateReviewDay, "onUpdateReviewDay");
        kotlin.jvm.internal.m.f(onApply, "onApply");
        kotlin.jvm.internal.m.f(onApplied, "onApplied");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1134507151);
        int i12 = i11 | (sVar2.h(uiState) ? 4 : 2) | (sVar2.h(onBackClick) ? 32 : 16) | (sVar2.h(onToggleItem) ? 256 : 128) | (sVar2.h(onToggleAll) ? 2048 : 1024) | (sVar2.h(onEditItem) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(onUpdateReviewDay) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(onApply) ? 1048576 : 524288) | (sVar2.h(onApplied) ? 8388608 : 4194304);
        if (sVar2.T(i12 & 1, (4793491 & i12) != 4793490)) {
            boolean zA = kotlin.jvm.internal.m.a(zdVar, xd.f50663a);
            boolean zA2 = kotlin.jvm.internal.m.a(zdVar, yd.f50728a);
            l1.g gVar = l1.m.f39353a;
            if (zA2) {
                sVar2.d0(1005454239);
                boolean z12 = (29360128 & i12) == 8388608;
                Object objQ = sVar2.Q();
                if (z12 || objQ == gVar) {
                    objQ = new fs.h(onApplied, null, 3);
                    sVar2.o0(objQ);
                }
                l1.t.f((fz.e) objQ, qy.b0.f48488a, sVar2);
            } else {
                sVar2.d0(1000056147);
            }
            sVar2.p(false);
            se.i.a(!zA, onBackClick, sVar2, i12 & 112, 0);
            String str = uiState.f49468c;
            if (str == null) {
                sVar2.d0(1005607378);
                sVar2.p(false);
            } else {
                sVar2.d0(1005607379);
                Iterator it = uiState.f49467b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next = it.next();
                    if (kotlin.jvm.internal.m.a(((ud) next).f50502a, str)) {
                        obj = next;
                        break;
                    }
                }
                ud udVar = (ud) obj;
                if (udVar == null) {
                    sVar2.d0(-421592925);
                    sVar2.p(false);
                    z11 = false;
                } else {
                    sVar2.d0(-421592924);
                    int i13 = 57344 & i12;
                    boolean z13 = i13 == 16384;
                    Object objQ2 = sVar2.Q();
                    if (z13 || objQ2 == gVar) {
                        objQ2 = new km.x0(onEditItem, 13);
                        sVar2.o0(objQ2);
                    }
                    fz.a aVar = (fz.a) objQ2;
                    boolean zF = ((i12 & 458752) == 131072) | sVar2.f(udVar) | (i13 == 16384);
                    Object objQ3 = sVar2.Q();
                    if (zF || objQ3 == gVar) {
                        objQ3 = new fu.j0(onUpdateReviewDay, udVar, onEditItem, 24);
                        sVar2.o0(objQ3);
                    }
                    z11 = false;
                    v(udVar, aVar, (fz.c) objQ3, sVar2, 0);
                    sVar2.p(false);
                }
                sVar2.p(z11);
            }
            sVar = sVar2;
            p7.a(null, t1.e.d(1227307091, new br.i(onBackClick, zA), sVar2), t1.e.d(390512148, new at.d(12, uiState, onApply, onBackClick, zA), sVar2), null, null, 0, 0L, 0L, null, t1.e.d(892652638, new at.c(uiState, onToggleAll, zA, onToggleItem, onEditItem), sVar2), sVar, 805306800, 505);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.g6(uiState, onBackClick, onToggleItem, onToggleAll, onEditItem, onUpdateReviewDay, onApply, onApplied, i11);
        }
    }

    public static final void u(ud udVar, boolean z11, fz.a aVar, fz.a aVar2, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1950059642);
        int i12 = i11 | (sVar.f(udVar) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128) | (sVar.h(aVar2) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            k7.d(j0.e2.e(z1.o.f58481a, 1.0f), null, null, null, null, t1.e.d(1098319212, new bt.q0(udVar, z11, aVar2, aVar, 2), sVar), sVar, 196614, 30);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.d(udVar, z11, aVar, aVar2, i11, 11);
        }
    }

    public static final void v(ud udVar, fz.a aVar, fz.c cVar, l1.n nVar, int i11) {
        l1.s sVar;
        long j11 = udVar.f50508g;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1593961715);
        int i12 = i11 | (sVar2.f(udVar) ? 4 : 2) | (sVar2.h(aVar) ? 32 : 16) | (sVar2.h(cVar) ? 256 : 128);
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            LocalDate localDateNow = LocalDate.now(zoneIdSystemDefault);
            LocalDate localDateL = Instant.ofEpochSecond(j11).atZone(zoneIdSystemDefault).l();
            LocalDate localDateL2 = Instant.ofEpochSecond(udVar.f50506e).atZone(zoneIdSystemDefault).l();
            ChronoUnit chronoUnit = ChronoUnit.DAYS;
            int iL = hz.b.l(((int) chronoUnit.between(localDateNow, localDateL2)) - 1, 0, AchievementLevelType.DAY_STREAK_LV_10);
            boolean zE = sVar2.e(j11) | sVar2.f(udVar.f50502a);
            Object objQ = sVar2.Q();
            if (zE || objQ == l1.m.f39353a) {
                objQ = defpackage.e.v(hz.b.l((int) chronoUnit.between(localDateNow, localDateL), 0, iL), sVar2);
            }
            l1.a1 a1Var = (l1.a1) objQ;
            sVar = sVar2;
            k7.a(aVar, t1.e.d(210206635, new k9.p(16, cVar, a1Var), sVar2), null, t1.e.d(-37761559, new lt.g(aVar, 11, (byte) 0), sVar2), g.Q0, t1.e.d(1737769798, new bt.j5(a1Var, iL, 3), sVar2), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, ((i12 >> 3) & 14) | 1772592, 16276);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(udVar, aVar, cVar, i11, 0);
        }
    }

    public static final void w(int i11, int i12, fz.c cVar, l1.n nVar) {
        String strValueOf;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(2039507858);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.h(cVar) ? 32 : 16);
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            ArrayList arrayListG1 = ry.m.g1(ns.o.L(0, 10, 15, 20, 30, 50, 80, 100), 2, 2);
            int size = arrayListG1.size();
            int i14 = 0;
            while (i14 < size) {
                int i15 = i14 + 1;
                List list = (List) arrayListG1.get(i14);
                z1.r rVarE = j0.c.E(j0.e2.e(z1.o.f58481a, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12, 7);
                j0.a2 a2VarA = j0.z1.a(j0.i.f35310h, z1.c.L, sVar, 6);
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
                Iterator itO = com.google.android.material.datepicker.d.o(sVar, rVarC, y2.j.f56915d, -628802522, list);
                while (itO.hasNext()) {
                    int iIntValue = ((Number) itO.next()).intValue();
                    if (iIntValue == 0) {
                        strValueOf = ep.a.m(sVar, 816169396, R.string.all, sVar, false);
                    } else {
                        sVar.d0(816266705);
                        sVar.p(false);
                        strValueOf = String.valueOf(iIntValue);
                    }
                    x(iIntValue, strValueOf, i11 == iIntValue, cVar, sVar, (i13 << 6) & 7168);
                }
                sVar.p(false);
                sVar.p(true);
                i14 = i15;
            }
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iv.d(i11, cVar, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x017f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0183  */
    /* JADX WARN: Code duplicated, block: B:73:0x019e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01df  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f0  */
    public static final void x(int i11, String str, boolean z11, fz.c cVar, l1.n nVar, int i12) {
        int i13;
        long j11;
        int i14;
        int iHashCode;
        boolean z12;
        boolean z13;
        Object objQ;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(134786237);
        if ((i12 & 6) == 0) {
            i13 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.f(str) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            r0.e eVarD = r0.f.d(16);
            if (z11) {
                sVar.d0(680562692);
                j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31017a;
            } else {
                sVar.d0(680563940);
                j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).A;
            }
            sVar.p(false);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarJ = d0.n.j(d0.n.h(j0.e2.g(j0.e2.s(d2.h.b(oVar, eVarD), 150), 56), ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p, g2.f0.f28556b), 1, j11, eVarD);
            int i15 = i13 & 7168;
            int i16 = i13 & 14;
            boolean z14 = (i15 == 2048) | (i16 == 4);
            Object objQ2 = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z14 || objQ2 == gVar) {
                objQ2 = new h0(cVar, i11, 3);
                sVar.o0(objQ2);
            }
            z1.r rVarE = j0.c.E(d0.n.o(rVarJ, false, null, (fz.a) objQ2, 15), 28, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, 10);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
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
            l1.t.J(hVar, q0VarD, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S) {
                i14 = i13;
            } else {
                i14 = i13;
                if (!kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                }
                y2.h hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC, sVar);
                z1.i iVar2 = z1.c.M;
                j0.e eVar = j0.i.f35309g;
                z1.r rVarE2 = j0.e2.e(oVar, 1.0f);
                j0.a2 a2VarA = j0.z1.a(eVar, iVar2, sVar, 54);
                iHashCode = Long.hashCode(sVar.T);
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
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                }
                l1.t.J(hVar4, rVarC2, sVar);
                ua.b(str, null, 0L, fr.j3.A(16), null, n3.s.L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, ((i14 >> 3) & 14) | 199680, 0, 131030);
                if (i15 == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = (i16 == 4) | z12;
                objQ = sVar.Q();
                if (z13 || objQ == gVar) {
                    objQ = new h0(cVar, i11, 4);
                    sVar.o0(objQ);
                }
                i7.a(z11, (fz.a) objQ, null, false, null, sVar, (i14 >> 6) & 14, 60);
                sVar.p(true);
                sVar.p(true);
            }
            defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            z1.i iVar3 = z1.c.M;
            j0.e eVar2 = j0.i.f35309g;
            z1.r rVarE3 = j0.e2.e(oVar, 1.0f);
            j0.a2 a2VarA2 = j0.z1.a(eVar2, iVar3, sVar, 54);
            iHashCode = Long.hashCode(sVar.T);
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
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            l1.t.J(hVar5, rVarC3, sVar);
            ua.b(str, null, 0L, fr.j3.A(16), null, n3.s.L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, ((i14 >> 3) & 14) | 199680, 0, 131030);
            if (i15 == 2048) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = (i16 == 4) | z12;
            objQ = sVar.Q();
            if (z13) {
                objQ = new h0(cVar, i11, 4);
                sVar.o0(objQ);
            } else {
                objQ = new h0(cVar, i11, 4);
                sVar.o0(objQ);
            }
            i7.a(z11, (fz.a) objQ, null, false, null, sVar, (i14 >> 6) & 14, 60);
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.i(i11, str, z11, cVar, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:64:0x017d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0194  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:78:0x0206  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void y(String str, String str2, boolean z11, boolean z12, fz.a aVar, l1.n nVar, int i11, int i12) {
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        int i15;
        int i16;
        fz.a aVar2;
        int i17;
        int i18;
        boolean z15;
        boolean z16;
        boolean z17;
        fz.a aVar3;
        l1.x1 x1VarT;
        boolean z18;
        fz.a aVar4;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        l1.c3 c3Var;
        int i19;
        boolean z19;
        boolean z20;
        fz.a aVar5;
        long j11;
        n3.s sVar;
        boolean z21;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1760192441);
        int i21 = (sVar2.f(str) ? 4 : 2) | i11 | (sVar2.f(str2) ? 32 : 16);
        int i22 = i12 & 4;
        if (i22 == 0) {
            if ((i11 & 384) == 0) {
                z13 = z11;
                i21 |= sVar2.g(z13) ? 256 : 128;
            }
            i13 = i12 & 8;
            if (i13 != 0) {
                i15 = i21 | 3072;
                z14 = z12;
            } else {
                z14 = z12;
                if (sVar2.g(z14)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i15 = i21 | i14;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                i18 = i15 | 24576;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                if (sVar2.h(aVar2)) {
                    i17 = 16384;
                } else {
                    i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i18 = i15 | i17;
            }
            if ((i18 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (sVar2.T(i18 & 1, z15)) {
                if (i22 != 0) {
                    z13 = false;
                }
                if (i13 != 0) {
                    z18 = true;
                } else {
                    z18 = z14;
                }
                if (i16 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                z1.r rVarE = j0.e2.e(z1.o.f58481a, 1.0f);
                j0.a2 a2VarA = j0.z1.a(j0.i.f35309g, z1.c.M, sVar2, 54);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL = sVar2.l();
                z1.r rVarC = z1.a.c(sVar2, rVarE);
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
                c3Var = fc.f30256a;
                i19 = i18;
                z19 = z13;
                ua.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar2.j(c3Var)).f30178k, sVar2, i18 & 14, 0, 65534);
                sVar2 = sVar2;
                if (aVar4 != null) {
                    sVar2.d0(-1932414502);
                    j0.t1.f35419a.getClass();
                    boolean z22 = z18;
                    fz.a aVar6 = aVar4;
                    k7.m(aVar6, null, z22, null, null, j0.s1.f35416b, t1.e.d(-1432104067, new kt.i(z19, str2), sVar2), sVar2, ((i19 >> 12) & 14) | 817889280 | ((i19 >> 3) & 896), 378);
                    aVar5 = aVar6;
                    z20 = z22;
                    sVar2.p(false);
                    z21 = z19;
                } else {
                    z20 = z18;
                    aVar5 = aVar4;
                    sVar2.d0(-1931426284);
                    j3.y0 y0Var = ((dc) sVar2.j(c3Var)).f30178k;
                    if (z19) {
                        sVar2.d0(-339393412);
                        j11 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                    } else {
                        sVar2.d0(-339392155);
                        j11 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31036s;
                    }
                    sVar2.p(false);
                    if (z19) {
                        sVar = n3.s.K;
                    } else {
                        sVar = n3.s.f43178t;
                    }
                    z21 = z19;
                    ua.b(str2, null, j11, 0L, null, sVar, null, 0L, null, 0L, 0, false, 0, 0, y0Var, sVar2, (i19 >> 3) & 14, 0, 65498);
                    sVar2 = sVar2;
                    sVar2.p(false);
                }
                sVar2.p(true);
                z17 = z20;
                aVar3 = aVar5;
                z16 = z21;
            } else {
                sVar2.W();
                z16 = z13;
                z17 = z14;
                aVar3 = aVar2;
            }
            x1VarT = sVar2.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new dt.r3(str, str2, z16, z17, aVar3, i11, i12);
            }
        }
        i21 |= 384;
        z13 = z11;
        i13 = i12 & 8;
        if (i13 != 0) {
            i15 = i21 | 3072;
            z14 = z12;
        } else {
            z14 = z12;
            if (sVar2.g(z14)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i15 = i21 | i14;
        }
        i16 = i12 & 16;
        if (i16 != 0) {
            i18 = i15 | 24576;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            if (sVar2.h(aVar2)) {
                i17 = 16384;
            } else {
                i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            i18 = i15 | i17;
        }
        if ((i18 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (sVar2.T(i18 & 1, z15)) {
            if (i22 != 0) {
                z13 = false;
            }
            if (i13 != 0) {
                z18 = true;
            } else {
                z18 = z14;
            }
            if (i16 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            z1.r rVarE2 = j0.e2.e(z1.o.f58481a, 1.0f);
            j0.a2 a2VarA2 = j0.z1.a(j0.i.f35309g, z1.c.M, sVar2, 54);
            iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarE2);
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
            c3Var = fc.f30256a;
            i19 = i18;
            z19 = z13;
            ua.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar2.j(c3Var)).f30178k, sVar2, i18 & 14, 0, 65534);
            sVar2 = sVar2;
            if (aVar4 != null) {
                sVar2.d0(-1932414502);
                j0.t1.f35419a.getClass();
                boolean z23 = z18;
                fz.a aVar7 = aVar4;
                k7.m(aVar7, null, z23, null, null, j0.s1.f35416b, t1.e.d(-1432104067, new kt.i(z19, str2), sVar2), sVar2, ((i19 >> 12) & 14) | 817889280 | ((i19 >> 3) & 896), 378);
                aVar5 = aVar7;
                z20 = z23;
                sVar2.p(false);
                z21 = z19;
            } else {
                z20 = z18;
                aVar5 = aVar4;
                sVar2.d0(-1931426284);
                j3.y0 y0Var2 = ((dc) sVar2.j(c3Var)).f30178k;
                if (z19) {
                    sVar2.d0(-339393412);
                    j11 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                } else {
                    sVar2.d0(-339392155);
                    j11 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31036s;
                }
                sVar2.p(false);
                if (z19) {
                    sVar = n3.s.K;
                } else {
                    sVar = n3.s.f43178t;
                }
                z21 = z19;
                ua.b(str2, null, j11, 0L, null, sVar, null, 0L, null, 0L, 0, false, 0, 0, y0Var2, sVar2, (i19 >> 3) & 14, 0, 65498);
                sVar2 = sVar2;
                sVar2.p(false);
            }
            sVar2.p(true);
            z17 = z20;
            aVar3 = aVar5;
            z16 = z21;
        } else {
            sVar2.W();
            z16 = z13;
            z17 = z14;
            aVar3 = aVar2;
        }
        x1VarT = sVar2.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.r3(str, str2, z16, z17, aVar3, i11, i12);
        }
    }

    public static final void z(String str, int i11, boolean z11, final boolean z12, z1.r rVar, l1.n nVar, int i12) {
        l1.s sVar;
        long j11;
        y2.h hVar;
        y2.h hVar2;
        long j12;
        long j13;
        y2.h hVar3;
        y2.i iVar;
        long j14;
        long j15;
        z1.o oVar;
        boolean z13;
        l1.s sVar2;
        int i13;
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(-355740215);
        int i14 = i12 | (sVar3.f(str) ? 4 : 2) | (sVar3.d(i11) ? 32 : 16) | (sVar3.g(z11) ? 256 : 128) | (sVar3.g(z12) ? 2048 : 1024) | (sVar3.f(rVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar3.T(i14 & 1, (i14 & 9363) != 9362)) {
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar3, 48);
            int iHashCode = Long.hashCode(sVar3.T);
            l1.q1 q1VarL = sVar3.l();
            z1.r rVarC = z1.a.c(sVar3, rVar);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar2);
            } else {
                sVar3.r0();
            }
            y2.h hVar4 = y2.j.f56917f;
            l1.t.J(hVar4, uVarA, sVar3);
            y2.h hVar5 = y2.j.f56916e;
            l1.t.J(hVar5, q1VarL, sVar3);
            y2.h hVar6 = y2.j.f56918g;
            if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar6);
            }
            y2.h hVar7 = y2.j.f56915d;
            l1.t.J(hVar7, rVarC, sVar3);
            l1.c3 c3Var = h1.v1.f31180a;
            long j16 = ((h1.s1) sVar3.j(c3Var)).f31017a;
            long j17 = ((h1.s1) sVar3.j(c3Var)).f31033p;
            long j18 = ((h1.s1) sVar3.j(c3Var)).A;
            if (z12) {
                sVar3.d0(-1694520244);
                sVar3.p(false);
                j11 = j16;
            } else {
                sVar3.d0(-1694478611);
                j11 = ((h1.s1) sVar3.j(c3Var)).f31036s;
                sVar3.p(false);
            }
            z1.o oVar2 = z1.o.f58481a;
            if (z11 || i11 <= 0) {
                hVar = hVar5;
                hVar2 = hVar7;
                j12 = j11;
                j13 = j18;
                hVar3 = hVar4;
                iVar = iVar2;
                j14 = j16;
                j15 = j17;
                oVar = oVar2;
                z13 = false;
                if (z11) {
                    sVar3.d0(-1694023283);
                    ua.b(String.valueOf(i11), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 6, 7), j12, fr.j3.A(10), null, n3.s.H, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 199728, 0, 131024);
                    sVar2 = sVar3;
                } else {
                    sVar2 = sVar3;
                    sVar2.d0(-1699107345);
                }
                sVar2.p(false);
            } else {
                sVar3.d0(-1694353743);
                long j19 = j11;
                hVar2 = hVar7;
                hVar3 = hVar4;
                hVar = hVar5;
                j14 = j16;
                iVar = iVar2;
                j15 = j17;
                j13 = j18;
                z13 = false;
                ua.b(oz.x.q0(ub.a.e0(sVar3, R.string.srs_s_cards), "%s", String.valueOf(i11)), j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 6, 7), j19, fr.j3.A(12), null, n3.s.H, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 199728, 0, 131024);
                sVar3.p(false);
                sVar2 = sVar3;
                j12 = j19;
                oVar = oVar2;
            }
            float f5 = 12;
            z1.r rVarB = d2.h.b(j0.e2.n(oVar, f5), r0.f.f48733a);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, z13);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarB);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar3, q0VarD, sVar2);
            l1.t.J(hVar, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar6);
            }
            l1.t.J(hVar2, rVarC2, sVar2);
            z1.r rVarN = j0.e2.n(oVar, f5);
            boolean z14 = (i14 & 7168) == 2048 ? true : z13;
            final long j21 = j15;
            final long j22 = j14;
            boolean zE = sVar2.e(j21) | z14 | sVar2.e(j22);
            final long j23 = j13;
            boolean zE2 = zE | sVar2.e(j23);
            Object objQ = sVar2.Q();
            if (zE2 || objQ == l1.m.f39353a) {
                i13 = 6;
                fz.c cVar = new fz.c() { // from class: mt.l4
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        i2.d Canvas = (i2.d) obj;
                        kotlin.jvm.internal.m.f(Canvas, "$this$Canvas");
                        boolean z15 = z12;
                        long j24 = j21;
                        if (z15) {
                            float f11 = 2;
                            i2.d.j(Canvas, j24, f2.e.c(Canvas.d()) / f11, 0L, null, 0, 124);
                            float fC = (f2.e.c(Canvas.d()) / f11) - Canvas.e0((float) 2.5d);
                            long j25 = j22;
                            i2.d.j(Canvas, j25, fC, 0L, null, 0, 124);
                            float f12 = 1;
                            i2.d.j(Canvas, j25, (f2.e.c(Canvas.d()) / f11) - Canvas.e0(f12), 0L, new i2.h(Canvas.e0(f12), CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 0, 108);
                        } else {
                            float f13 = 2;
                            i2.d.j(Canvas, j24, f2.e.c(Canvas.d()) / f13, 0L, null, 0, 124);
                            i2.d.j(Canvas, j23, (f2.e.c(Canvas.d()) / f13) - Canvas.e0(1), 0L, new i2.h(Canvas.e0((float) 1.5d), CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 0, 108);
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(cVar);
                objQ = cVar;
            } else {
                i13 = 6;
            }
            d0.n.b(i13, (fz.c) objQ, sVar2, rVarN);
            sVar2.p(true);
            l1.s sVar4 = sVar2;
            ua.b(str, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, i13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), j12, fr.j3.A(10), null, n3.s.H, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar4, (i14 & 14) | 199728, 0, 130512);
            sVar = sVar4;
            sVar.p(true);
        } else {
            sVar = sVar3;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.q2(str, i11, z11, z12, rVar, i12);
        }
    }

    public static final void d(Map map, boolean z11, fz.c onClickUserRating, fz.c playSoundEffect, z1.r rVar, l1.n nVar, int i11) {
        fz.c cVar;
        int i12;
        kotlin.jvm.internal.m.f(map, DytezVyM.UBQzoSPrkgTtIIg);
        kotlin.jvm.internal.m.f(onClickUserRating, "onClickUserRating");
        kotlin.jvm.internal.m.f(playSoundEffect, "playSoundEffect");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1147332737);
        int i13 = (i11 & 6) == 0 ? (sVar.h(map) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i13 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar.h(onClickUserRating) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar.h(playSoundEffect) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= sVar.f(rVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.TRUE);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            w2.q0 q0VarD = j0.o.d(z1.c.H, false);
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
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = j0.e2.e(oVar, 1.0f);
            float f5 = 8;
            j0.a2 a2VarA = j0.z1.a(j0.i.g(f5), z1.c.L, sVar, 6);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarE);
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
            sVar.d0(1024363154);
            for (Map.Entry entry : map.entrySet()) {
                qy.l lVar = z11 ? (qy.l) entry.getValue() : null;
                int i14 = x3.f42058a[((wt.c0) entry.getKey()).ordinal()];
                if (i14 == 1) {
                    i12 = R.raw.srs_emoji_again;
                } else if (i14 == 2) {
                    i12 = R.raw.srs_emoji_hard;
                } else if (i14 == 3) {
                    i12 = R.raw.srs_emoji_good;
                } else {
                    if (i14 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i12 = R.raw.srs_emoji_perfect;
                }
                boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                boolean zH = ((i13 & 896) == 256) | sVar.h(entry);
                Object objQ2 = sVar.Q();
                if (zH || objQ2 == gVar) {
                    objQ2 = new l1.z1(9, onClickUserRating, entry);
                    sVar.o0(objQ2);
                }
                fz.a aVar = (fz.a) objQ2;
                boolean zH2 = ((i13 & 7168) == 2048) | sVar.h(entry);
                Object objQ3 = sVar.Q();
                if (zH2 || objQ3 == gVar) {
                    objQ3 = new fu.j0(playSoundEffect, entry, b1Var, 23);
                    sVar.o0(objQ3);
                }
                fz.c cVar2 = (fz.c) objQ3;
                long jA = ((wt.c0) entry.getKey()).a();
                l1.g gVar2 = gVar;
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                l1.b1 b1Var2 = b1Var;
                a(lVar, i12, zBooleanValue, aVar, cVar2, jA, new j0.i1(1.0f, true), sVar, 0);
                b1Var = b1Var2;
                gVar = gVar2;
                f5 = f5;
            }
            cVar = onClickUserRating;
            float f11 = f5;
            sVar.p(false);
            sVar.p(true);
            if (z11) {
                sVar.d0(-526354533);
            } else {
                sVar.d0(-517199985);
                iu.k.c(ub.a.e0(sVar, R.string.srs_custom_review_alert), j0.e2.e(j0.c.E(j0.c.C(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, 15, 5), 1.0f), j3.y0.a((j3.y0) sVar.j(ua.f31167a), ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, fr.j3.A(9), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), 0, false, 1, 0, new s0.g(fr.j3.A(6), fr.j3.A(9), fr.j3.A(1)), sVar, 1572912, 184);
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            cVar = onClickUserRating;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.q(map, z11, cVar, playSoundEffect, rVar, i11);
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
    public static final void e(List reviews, r8 practiceModel, boolean z11, rt.e3 e3Var, l9 l9Var, fz.a onClickClose, fz.c onClickBilling, fz.a aVar, fz.c loginNow, l1.n nVar, int i11) {
        rt.e3 e3Var2;
        l9 l9Var2;
        int i12;
        int i13;
        l9 l9Var3;
        rt.e3 e3Var3;
        l1.s sVar;
        l1.g gVar;
        boolean z12;
        char c11;
        j9.v vVar;
        kotlin.jvm.internal.m.f(reviews, "reviews");
        kotlin.jvm.internal.m.f(practiceModel, "practiceModel");
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(onClickBilling, "onClickBilling");
        kotlin.jvm.internal.m.f(aVar, bjXGJ.dJfZZwCcoAwu);
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-488343615);
        int i14 = i11 | (sVar2.h(reviews) ? 4 : 2) | (sVar2.d(practiceModel.ordinal()) ? 32 : 16) | (sVar2.g(z11) ? 256 : 128) | 9216 | (sVar2.h(onClickClose) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(onClickBilling) ? 1048576 : 524288) | (sVar2.h(aVar) ? 8388608 : 4194304) | (sVar2.h(loginNow) ? 67108864 : 33554432);
        if (sVar2.T(i14 & 1, (38347923 & i14) != 38347922)) {
            sVar2.Y();
            int i15 = i11 & 1;
            l1.g gVar2 = l1.m.f39353a;
            if (i15 == 0 || sVar2.C()) {
                boolean zH = sVar2.h(reviews) | ((i14 & 112) == 32) | ((i14 & 896) == 256);
                Object objQ = sVar2.Q();
                if (zH || objQ == gVar2) {
                    objQ = new dt.l4(reviews, practiceModel, z11);
                    sVar2.o0(objQ);
                }
                fz.a aVar2 = (fz.a) objQ;
                sVar2.d0(-1614864554);
                LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                int i16 = LocalViewModelStoreOwner.$stable;
                ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(sVar2, i16);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(rt.e3.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), aVar2);
                sVar2.p(false);
                rt.e3 e3Var4 = (rt.e3) viewModelA;
                sVar2.d0(-1614864554);
                ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(sVar2, i16);
                if (current2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA2 = i20.b.a(kotlin.jvm.internal.z.a(l9.class), current2.getViewModelStore(), null, i20.a.a(current2), null, q10.b.a(sVar2), null);
                i12 = 0;
                sVar2.p(false);
                i13 = i14 & (-64513);
                l9Var3 = (l9) viewModelA2;
                e3Var3 = e3Var4;
            } else {
                sVar2.W();
                i13 = i14 & (-64513);
                e3Var3 = e3Var;
                l9Var3 = l9Var;
                i12 = 0;
            }
            sVar2.q();
            j9.v vVarH = cf.x.H(new j9.c0[i12], sVar2);
            Object[] objArr = new Object[i12];
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar2) {
                objQ2 = new ju.d(22);
                sVar2.o0(objQ2);
            }
            l1.a1 a1Var = (l1.a1) w1.j.c(objArr, (fz.a) objQ2, sVar2, 48);
            Object[] objArr2 = new Object[0];
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar2) {
                objQ3 = new ju.d(23);
                sVar2.o0(objQ3);
            }
            l1.b1 b1Var = (l1.b1) w1.j.c(objArr2, (fz.a) objQ3, sVar2, 48);
            l1.h1 h1Var = (l1.h1) a1Var;
            if (h1Var.l() > 0) {
                sVar2.d0(-1188977221);
                int iL = h1Var.l();
                boolean zF = sVar2.f(a1Var);
                Object objQ4 = sVar2.Q();
                if (zF || objQ4 == gVar2) {
                    objQ4 = new gr.j(a1Var, 4);
                    sVar2.o0(objQ4);
                }
                fz.a aVar3 = (fz.a) objQ4;
                boolean zF2 = sVar2.f(a1Var) | sVar2.h(e3Var3) | sVar2.h(vVarH);
                Object objQ5 = sVar2.Q();
                if (zF2 || objQ5 == gVar2) {
                    objQ5 = new l0(e3Var3, vVarH, a1Var, 5);
                    sVar2.o0(objQ5);
                }
                fz.a aVar4 = (fz.a) objQ5;
                boolean zF3 = sVar2.f(a1Var) | sVar2.h(e3Var3) | sVar2.f(b1Var);
                Object objQ6 = sVar2.Q();
                if (zF3 || objQ6 == gVar2) {
                    objQ6 = new l0(e3Var3, a1Var, b1Var, 6);
                    sVar2.o0(objQ6);
                }
                fz.a aVar5 = (fz.a) objQ6;
                gVar = gVar2;
                c11 = 0;
                sVar = sVar2;
                z12 = false;
                s(iL, aVar3, aVar4, aVar5, sVar, 0);
            } else {
                sVar = sVar2;
                gVar = gVar2;
                z12 = false;
                c11 = 0;
                sVar.d0(-1192798591);
            }
            sVar.p(z12);
            boolean zH2 = sVar.h(e3Var3) | ((i13 & 3670016) == c11 ? true : z12) | sVar.h(l9Var3) | ((i13 & 458752) == 131072 ? true : z12) | sVar.h(vVarH) | ((i13 & 234881024) == 67108864 ? true : z12) | sVar.f(b1Var) | ((i13 & 29360128) != 8388608 ? z12 : true) | sVar.f(a1Var);
            Object objQ7 = sVar.Q();
            if (zH2 || objQ7 == gVar) {
                vVar = vVarH;
                l1.b2 b2Var = new l1.b2(e3Var3, onClickBilling, l9Var3, onClickClose, vVar, loginNow, b1Var, aVar, a1Var);
                sVar.o0(b2Var);
                objQ7 = b2Var;
            } else {
                vVar = vVarH;
            }
            sVar2 = sVar;
            com.bumptech.glide.e.c(vVar, "course_test", null, null, null, null, null, null, (fz.c) objQ7, sVar2, 48);
            e3Var2 = e3Var3;
            l9Var2 = l9Var3;
        } else {
            sVar2.W();
            e3Var2 = e3Var;
            l9Var2 = l9Var;
        }
        l1.x1 x1VarT = sVar2.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d7(reviews, practiceModel, z11, e3Var2, l9Var2, onClickClose, onClickBilling, aVar, loginNow, i11);
        }
    }
}
