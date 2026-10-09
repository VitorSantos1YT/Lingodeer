package mt;

import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.k7;
import h1.ua;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import java.util.Locale;
import rt.le;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f41395a = 536;

    public static final void a(String str, String str2, boolean z11, z1.r rVar, l1.n nVar, int i11) {
        long j11;
        long j12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-222710846);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.f(str2) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.f(rVar) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            l1.c3 c3Var = h1.v1.f31180a;
            long j13 = ((h1.s1) sVar.j(c3Var)).f31017a;
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
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
            l1.c3 c3Var2 = fc.f30256a;
            j3.y0 y0Var = ((dc) sVar.j(c3Var2)).f30180n;
            if (z11) {
                sVar.d0(-307896253);
                sVar.p(false);
                j11 = j13;
            } else {
                sVar.d0(-307894872);
                j11 = ((h1.s1) sVar.j(c3Var)).f31036s;
                sVar.p(false);
            }
            ua.b(str, null, j11, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var, sVar, i12 & 14, 0, 65530);
            float f5 = 2;
            ua.b(str2, j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, 7), 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, ((dc) sVar.j(c3Var2)).f30178k, sVar, ((i12 >> 3) & 14) | 48, 3120, 55292);
            sVar = sVar;
            float f11 = z11 ? f5 : 1;
            if (z11) {
                sVar.d0(-307882909);
                sVar.p(false);
                j12 = j13;
            } else {
                sVar.d0(-307881530);
                long j14 = ((h1.s1) sVar.j(c3Var)).B;
                sVar.p(false);
                j12 = j14;
            }
            k7.g(null, f11, j12, sVar, 0, 1);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.d(str, str2, z11, rVar, i11, 9);
        }
    }

    public static final void b(final h1.t3 t3Var, l1.n nVar, int i11) {
        final h1.t3 t3Var2;
        String str;
        String str2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1085381284);
        int i12 = i11 | (sVar.f(t3Var) ? 4 : 2);
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            Long lC = t3Var.c();
            lz.g gVar = t3Var.f31097a;
            Long lB = t3Var.b();
            LocalDate localDateWithDayOfMonth = h(((i1.z) t3Var.f31100d.getValue()).f34110e).withDayOfMonth(1);
            boolean z11 = lC == null || lB != null;
            z1.o oVar = z1.o.f58481a;
            float f5 = 16;
            float f11 = 2;
            z1.r rVarD = j0.c.D(j0.e2.e(oVar, 1.0f), f5, 4, f5, f11);
            j0.u uVarA = j0.t.a(j0.i.g(f11), z1.c.O, sVar, 6);
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
            l1.t.J(hVar, uVarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            z1.r rVarE = j0.e2.e(oVar, 1.0f);
            j0.a2 a2VarA = j0.z1.a(j0.i.g(12), z1.c.N, sVar, 54);
            boolean z12 = z11;
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
            String strE0 = ub.a.e0(sVar, R.string.srs_future_reviews_date_range_start);
            if (lC != null) {
                str = h(lC.longValue()).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.getDefault()));
                kotlin.jvm.internal.m.e(str, "format(...)");
            } else {
                str = "—";
            }
            j0.c2 c2Var = j0.c2.f35266a;
            a(strE0, str, z12, c2Var.a(oVar, 1.0f), sVar, 0);
            l1.c3 c3Var = fc.f30256a;
            ua.b("–", j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 3, 7), ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 54, 0, 65528);
            String strE1 = ub.a.e0(sVar, R.string.srs_future_reviews_date_range_end);
            if (lB != null) {
                str2 = h(lB.longValue()).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.getDefault()));
                kotlin.jvm.internal.m.e(str2, "format(...)");
            } else {
                str2 = "—";
            }
            a(strE1, str2, !z12, c2Var.a(oVar, 1.0f), sVar, 0);
            sVar.p(true);
            float f12 = 44;
            z1.r rVarG = j0.e2.g(j0.e2.e(oVar, 1.0f), f12);
            j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarG);
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
            l1.t.J(hVar4, rVarC3, sVar);
            kotlin.jvm.internal.m.c(localDateWithDayOfMonth);
            String str3 = localDateWithDayOfMonth.format(DateTimeFormatter.ofPattern("MMM yyyy", Locale.getDefault()));
            kotlin.jvm.internal.m.e(str3, "format(...)");
            ua.b(str3, c2Var.a(oVar, 1.0f), 0L, 0L, null, n3.s.K, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 196608, 0, 65500);
            int i13 = gVar.f40532a;
            int i14 = gVar.f40533b;
            int year = localDateWithDayOfMonth.minusMonths(1L).getYear();
            boolean z13 = i13 <= year && year <= i14;
            z1.r rVarN = j0.e2.n(r52, f12);
            int i15 = i12 & 14;
            boolean z14 = i15 == 4;
            Object objQ = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (z14 || objQ == gVar2) {
                final int i16 = 0;
                objQ = new fz.a() { // from class: mt.d0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                f0.g(t3Var, -1L);
                                break;
                            default:
                                f0.g(t3Var, 1L);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar.o0(objQ);
            }
            k7.h((fz.a) objQ, rVarN, z13, null, g.M, sVar, 196656, 24);
            int i17 = gVar.f40532a;
            int year2 = localDateWithDayOfMonth.plusMonths(1L).getYear();
            boolean z15 = i17 <= year2 && year2 <= i14;
            z1.r rVarN2 = j0.e2.n(oVar, f12);
            boolean z16 = i15 == 4;
            Object objQ2 = sVar.Q();
            if (z16 || objQ2 == gVar2) {
                final int i18 = 1;
                t3Var2 = t3Var;
                objQ2 = new fz.a() { // from class: mt.d0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                f0.g(t3Var2, -1L);
                                break;
                            default:
                                f0.g(t3Var2, 1L);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar.o0(objQ2);
            } else {
                t3Var2 = t3Var;
            }
            k7.h((fz.a) objQ2, rVarN2, z15, null, g.N, sVar, 196656, 24);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
        } else {
            t3Var2 = t3Var;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0(t3Var2, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    public static final void c(le leVar, fz.a onDismiss, fz.c onConfirm, l1.n nVar, int i11) {
        fz.c cVar;
        Long lValueOf;
        Long lValueOf2;
        e0 e0Var;
        kotlin.jvm.internal.m.f(onDismiss, "onDismiss");
        kotlin.jvm.internal.m.f(onConfirm, "onConfirm");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1529776664);
        int i12 = i11 | (sVar.f(leVar) ? 4 : 2) | (sVar.h(onDismiss) ? 32 : 16) | (sVar.h(onConfirm) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = LocalDate.now();
                sVar.o0(objQ);
            }
            LocalDate localDate = (LocalDate) objQ;
            if (leVar != null) {
                long j11 = leVar.f50034a;
                lValueOf = Long.valueOf(j11);
                if (j11 < localDate.toEpochDay()) {
                    lValueOf = null;
                }
            } else {
                lValueOf = null;
            }
            if (leVar != null) {
                long j12 = leVar.f50035b;
                lValueOf2 = Long.valueOf(j12);
                if (lValueOf == null || j12 < lValueOf.longValue()) {
                    lValueOf2 = null;
                }
            } else {
                lValueOf2 = null;
            }
            boolean zF = sVar.f(localDate);
            Object objQ2 = sVar.Q();
            if (zF || objQ2 == gVar) {
                objQ2 = new e0(localDate);
                sVar.o0(objQ2);
            }
            e0 e0Var2 = (e0) objQ2;
            Long lValueOf3 = lValueOf != null ? Long.valueOf(d(lValueOf.longValue())) : null;
            Long lValueOf4 = lValueOf2 != null ? Long.valueOf(d(lValueOf2.longValue())) : null;
            Long lValueOf5 = Long.valueOf(d(lValueOf != null ? lValueOf.longValue() : localDate.toEpochDay()));
            lz.g gVar2 = new lz.g(localDate.getYear(), h1.o2.f30776a.f40533b, 1);
            j0.v1 v1Var = h1.s3.f31051a;
            Locale localeR = k7.r(sVar);
            Object[] objArr = new Object[0];
            qp.o2 o2VarB = w1.j.b(h1.x1.P, new a0.e(5, e0Var2, localeR));
            boolean zF2 = sVar.f(lValueOf3) | sVar.f(lValueOf4) | sVar.f(lValueOf5) | sVar.h(gVar2) | sVar.d(0) | sVar.f(e0Var2) | sVar.h(localeR);
            Object objQ3 = sVar.Q();
            if (zF2 || objQ3 == gVar) {
                objQ3 = new h1.r3(lValueOf3, lValueOf4, lValueOf5, gVar2, e0Var2, localeR);
                e0Var = e0Var2;
                sVar.o0(objQ3);
            } else {
                e0Var = e0Var2;
            }
            h1.t3 t3Var = (h1.t3) w1.j.e(objArr, o2VarB, (fz.a) objQ3, sVar, 0, 4);
            t3Var.f31099c.setValue(e0Var);
            Long lC = t3Var.c();
            Long lB = t3Var.b();
            l1.c3 c3Var = h1.v1.f31180a;
            long j13 = ((h1.s1) sVar.j(c3Var)).f31017a;
            long j14 = ((h1.s1) sVar.j(c3Var)).f31019b;
            long jC = g2.x.c(((h1.s1) sVar.j(c3Var)).f31017a, 0.16f);
            long j15 = ((h1.s1) sVar.j(c3Var)).f31034q;
            long j16 = g2.x.f28622i;
            h1.s1 s1Var = (h1.s1) sVar.j(c3Var);
            h1.m2 m2Var = s1Var.T;
            sVar.d0(-653681037);
            if (m2Var == null) {
                long jC2 = h1.v1.c(s1Var, k1.d.f37464a);
                long jC3 = h1.v1.c(s1Var, k1.d.f37476n);
                long jC4 = h1.v1.c(s1Var, k1.d.m);
                long jC5 = h1.v1.c(s1Var, k1.d.f37484v);
                long jC6 = h1.v1.c(s1Var, k1.d.f37482t);
                long j17 = s1Var.f31036s;
                k1.c cVar2 = k1.d.f37488z;
                long jC7 = h1.v1.c(s1Var, cVar2);
                long jC8 = g2.x.c(h1.v1.c(s1Var, cVar2), 0.38f);
                k1.c cVar3 = k1.d.f37474k;
                long jC9 = h1.v1.c(s1Var, cVar3);
                k1.c cVar4 = k1.d.f37487y;
                long jC10 = h1.v1.c(s1Var, cVar4);
                long jC11 = g2.x.c(h1.v1.c(s1Var, cVar4), 0.38f);
                k1.c cVar5 = k1.d.f37486x;
                long jC12 = h1.v1.c(s1Var, cVar5);
                long jC13 = g2.x.c(h1.v1.c(s1Var, cVar5), 0.38f);
                k1.c cVar6 = k1.d.f37475l;
                long jC14 = h1.v1.c(s1Var, cVar6);
                long jC15 = g2.x.c(h1.v1.c(s1Var, cVar6), 0.38f);
                k1.c cVar7 = k1.d.f37469f;
                long jC16 = h1.v1.c(s1Var, cVar7);
                long jC17 = g2.x.c(h1.v1.c(s1Var, cVar7), 0.38f);
                k1.c cVar8 = k1.d.f37468e;
                long jC18 = h1.v1.c(s1Var, cVar8);
                long jC19 = g2.x.c(h1.v1.c(s1Var, cVar8), 0.38f);
                long jC20 = h1.v1.c(s1Var, cVar3);
                long jC21 = h1.v1.c(s1Var, k1.d.f37472i);
                long jC22 = h1.v1.c(s1Var, k1.d.f37479q);
                long jC23 = h1.v1.c(s1Var, k1.d.f37478p);
                long jC24 = h1.v1.c(s1Var, k1.f.f37509a);
                h1.j6 j6Var = h1.j6.f30479a;
                m2Var = new h1.m2(jC2, jC3, jC4, jC5, jC6, j17, jC7, jC8, jC9, jC10, jC11, jC12, jC13, jC14, jC15, jC16, jC17, jC18, jC19, jC20, jC21, jC23, jC22, jC24, h1.j6.d(s1Var, sVar));
                s1Var.T = m2Var;
            }
            sVar.p(false);
            long j18 = j16 != 16 ? j16 : m2Var.f30639a;
            long j19 = j16 != 16 ? j16 : m2Var.f30640b;
            long j21 = j16 != 16 ? j16 : m2Var.f30641c;
            long j22 = j16 != 16 ? j16 : m2Var.f30642d;
            long j23 = j16 != 16 ? j16 : m2Var.f30643e;
            long j24 = j16 != 16 ? j16 : m2Var.f30644f;
            long j25 = j16 != 16 ? j16 : m2Var.f30645g;
            long j26 = j16 != 16 ? j16 : m2Var.f30646h;
            long j27 = j16 != 16 ? j16 : m2Var.f30647i;
            long j28 = j16 != 16 ? j16 : m2Var.f30648j;
            long j29 = j16 != 16 ? j16 : m2Var.f30649k;
            long j30 = j16 != 16 ? j16 : m2Var.f30650l;
            long j31 = j16 != 16 ? j16 : m2Var.m;
            long j32 = j16 != 16 ? j16 : m2Var.f30651n;
            long j33 = j16 != 16 ? j16 : m2Var.f30652o;
            if (j14 == r1) {
                j14 = m2Var.f30653p;
            }
            long j34 = j14;
            long j35 = j16 != 16 ? j16 : m2Var.f30654q;
            if (j13 == r1) {
                j13 = m2Var.f30655r;
            }
            h1.m2 m2Var2 = new h1.m2(j18, j19, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j13, j16 != 16 ? j16 : m2Var.f30656s, j16 != 16 ? j16 : m2Var.f30657t, j16 != 16 ? j16 : m2Var.f30658u, jC != r1 ? jC : m2Var.f30659v, j15 != 16 ? j15 : m2Var.f30660w, j16 != 16 ? j16 : m2Var.f30661x, m2Var.f30662y);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarI = j0.e2.i(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, f41395a, 1);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
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
            z1.r rVarE = j0.e2.e(oVar, 1.0f);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            h1.s3.a(t3Var, w4.c.p(1.0f, true, rVarE), null, null, t1.e.d(1487478660, new b0(t3Var), sVar), false, m2Var2, sVar, 224256);
            z1.r rVarC2 = j0.c.C(d0.n.h(j0.e2.e(oVar, 1.0f), ((h1.s1) sVar.j(c3Var)).f31033p, g2.f0.f28556b), 12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35304b, z1.c.L, sVar, 6);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarC2);
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
            l1.t.J(hVar4, rVarC3, sVar);
            k7.m(onDismiss, null, false, null, null, null, g.K, sVar, ((i12 >> 3) & 14) | 805306368, 510);
            sVar = sVar;
            boolean zF3 = sVar.f(lC) | sVar.f(lB) | ((i12 & 896) == 256);
            Object objQ4 = sVar.Q();
            if (zF3 || objQ4 == gVar) {
                cVar = onConfirm;
                objQ4 = new androidx.lifecycle.compose.a(lC, lB, cVar, 28);
                sVar.o0(objQ4);
            } else {
                cVar = onConfirm;
            }
            k7.m((fz.a) objQ4, null, (lC == null || lB == null) ? false : true, null, null, null, g.L, sVar, 805306368, 506);
            sVar.p(true);
            sVar.p(true);
        } else {
            cVar = onConfirm;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c0(leVar, onDismiss, cVar, i11, 0);
        }
    }

    public static final long d(long j11) {
        return LocalDate.ofEpochDay(j11).atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();
    }

    public static final String e(long j11) {
        String str = LocalDate.ofEpochDay(j11).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.getDefault()));
        kotlin.jvm.internal.m.e(str, "format(...)");
        return str;
    }

    public static final String f(le dateRange) {
        kotlin.jvm.internal.m.f(dateRange, "dateRange");
        String strE = e(dateRange.f50034a);
        String strE2 = e(dateRange.f50035b);
        return strE.equals(strE2) ? strE : ep.a.D(strE, " – ", strE2);
    }

    public static final void g(h1.t3 t3Var, long j11) {
        LocalDate localDatePlusMonths = h(((i1.z) t3Var.f31100d.getValue()).f34110e).withDayOfMonth(1).plusMonths(j11);
        lz.g gVar = t3Var.f31097a;
        int i11 = gVar.f40532a;
        int i12 = gVar.f40533b;
        int year = localDatePlusMonths.getYear();
        if (i11 > year || year > i12) {
            return;
        }
        t3Var.d(d(localDatePlusMonths.toEpochDay()));
    }

    public static final LocalDate h(long j11) {
        LocalDate localDateL = Instant.ofEpochMilli(j11).atZone(ZoneOffset.UTC).l();
        kotlin.jvm.internal.m.e(localDateL, "toLocalDate(...)");
        return localDateL;
    }
}
