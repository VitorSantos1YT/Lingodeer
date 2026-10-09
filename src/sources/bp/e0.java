package bp;

import com.google.api.Service;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.ua;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4543b;

    public /* synthetic */ e0(String str, int i11) {
        this.f4542a = i11;
        this.f4543b = str;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4542a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ua.b(this.f4543b, null, 0L, fr.j3.A(20), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 3072, 0, 131062);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ua.b(this.f4543b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131070);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 2:
                String str = this.f4543b;
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    List listW0 = oz.q.W0(ub.a.e0(sVar3, R.string.chinese_tone_is_this_tone), new String[]{"%s"}, 0, 6);
                    sVar3.d0(-2125638424);
                    j3.e eVar = new j3.e();
                    String str2 = (String) ry.m.t0(0, listW0);
                    String str3 = BuildConfig.VERSION_NAME;
                    if (str2 == null) {
                        str2 = BuildConfig.VERSION_NAME;
                    }
                    eVar.d(str2);
                    int i11 = eVar.i(new j3.p0(((h1.s1) sVar3.j(h1.v1.f31180a)).f31017a, 0L, (n3.s) null, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (g2.v0) null, 65534));
                    try {
                        eVar.d(str);
                        eVar.f(i11);
                        String str4 = (String) ry.m.t0(1, listW0);
                        if (str4 != null) {
                            str3 = str4;
                        }
                        eVar.d(str3);
                        j3.h hVarJ = eVar.j();
                        sVar3.p(false);
                        dt.a0.p(hVarJ, sVar3, 0);
                    } catch (Throwable th2) {
                        eVar.f(i11);
                        throw th2;
                    }
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
            case 3:
                ((Integer) obj2).getClass();
                dt.e.k(this.f4543b, (l1.n) obj, l1.t.M(1));
                break;
            case 4:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String str5 = this.f4543b;
                    if (oz.q.K0(str5)) {
                        sVar4.d0(-1371303078);
                    } else {
                        sVar4.d0(-1346187126);
                        dt.a0.r(str5, j0.c.E(z1.o.f58481a, dt.c.f23679j, dt.c.f23678i, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), 4, 5, sVar4, 384, 0);
                    }
                    sVar4.p(false);
                } else {
                    sVar4.W();
                }
                return qy.b0.f48488a;
            case 5:
                l1.n nVar5 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    dt.a0.r(this.f4543b, j0.e2.e(z1.o.f58481a, 1.0f), 0, 0, sVar5, 48, 12);
                } else {
                    sVar5.W();
                }
                return qy.b0.f48488a;
            case 6:
                ((Integer) obj2).getClass();
                dt.e.M(this.f4543b, (l1.n) obj, l1.t.M(1));
                break;
            case 7:
                l1.n nVar6 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ua.b(this.f4543b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar6, 0, 0, 131070);
                } else {
                    sVar6.W();
                }
                return qy.b0.f48488a;
            case 8:
                l1.n nVar7 = (l1.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                l1.s sVar7 = (l1.s) nVar7;
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ua.b(this.f4543b, null, 0L, fr.j3.A(10), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar7, 3072, 0, 131062);
                } else {
                    sVar7.W();
                }
                return qy.b0.f48488a;
            case 9:
                l1.n nVar8 = (l1.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                l1.s sVar8 = (l1.s) nVar8;
                if (sVar8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ua.b(this.f4543b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar8, 0, 0, 131070);
                } else {
                    sVar8.W();
                }
                return qy.b0.f48488a;
            case 10:
                ((Integer) obj2).getClass();
                iv.o.e(this.f4543b, (l1.n) obj, l1.t.M(1));
                break;
            case 11:
                l1.n nVar9 = (l1.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                l1.s sVar9 = (l1.s) nVar9;
                if (sVar9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ua.b(this.f4543b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar9, 0, 0, 131070);
                } else {
                    sVar9.W();
                }
                return qy.b0.f48488a;
            case 12:
                ((Integer) obj2).getClass();
                iv.z0.m(this.f4543b, (l1.n) obj, l1.t.M(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                iv.z0.s(this.f4543b, (l1.n) obj, l1.t.M(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                iv.z0.u(this.f4543b, (l1.n) obj, l1.t.M(7));
                break;
            case 15:
                ((Integer) obj2).getClass();
                iv.z0.k(this.f4543b, (l1.n) obj, l1.t.M(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                iv.z0.n(this.f4543b, (l1.n) obj, l1.t.M(1));
                break;
            case 17:
                l1.n nVar10 = (l1.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                l1.s sVar10 = (l1.s) nVar10;
                if (sVar10.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ua.b(this.f4543b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar10, 0, 0, 131070);
                } else {
                    sVar10.W();
                }
                return qy.b0.f48488a;
            case 18:
                l1.n nVar11 = (l1.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                l1.s sVar11 = (l1.s) nVar11;
                if (sVar11.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ua.b(this.f4543b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar11, 0, 0, 131070);
                } else {
                    sVar11.W();
                }
                return qy.b0.f48488a;
            case 19:
                l1.n nVar12 = (l1.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                l1.s sVar12 = (l1.s) nVar12;
                if (sVar12.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarC = j0.c.C(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 2, 1);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar12, 0);
                    int iHashCode = Long.hashCode(sVar12.T);
                    l1.q1 q1VarL = sVar12.l();
                    z1.r rVarC2 = z1.a.c(sVar12, rVarC);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar12.h0();
                    if (sVar12.S) {
                        sVar12.k(iVar);
                    } else {
                        sVar12.r0();
                    }
                    y2.h hVar = y2.j.f56917f;
                    l1.t.J(hVar, uVarA, sVar12);
                    y2.h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, sVar12);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar12.S || !kotlin.jvm.internal.m.a(sVar12.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar12, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC2, sVar12);
                    j0.a2 a2VarA = j0.z1.a(j0.i.g(4), z1.c.M, sVar12, 54);
                    int iHashCode2 = Long.hashCode(sVar12.T);
                    l1.q1 q1VarL2 = sVar12.l();
                    z1.r rVarC3 = z1.a.c(sVar12, oVar);
                    sVar12.h0();
                    if (sVar12.S) {
                        sVar12.k(iVar);
                    } else {
                        sVar12.r0();
                    }
                    l1.t.J(hVar, a2VarA, sVar12);
                    l1.t.J(hVar2, q1VarL2, sVar12);
                    if (sVar12.S || !kotlin.jvm.internal.m.a(sVar12.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar12, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC3, sVar12);
                    ua.b(ub.a.e0(sVar12, R.string.srs_filter_custom_range), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar12, 0, 0, 131070);
                    l1.s sVar13 = sVar12;
                    h1.r4.b(se.k.y(R.drawable.edit_24px, sVar13, 0), null, j0.e2.n(oVar, 14), 0L, sVar13, 432, 8);
                    sVar13.p(true);
                    String str6 = this.f4543b;
                    if (str6 != null) {
                        sVar13.d0(-217702264);
                        ua.b(str6, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, ((dc) sVar13.j(fc.f30256a)).f30181o, sVar13, 0, 3072, 57342);
                        sVar13 = sVar13;
                    } else {
                        sVar13.d0(-228023745);
                    }
                    sVar13.p(false);
                    sVar13.p(true);
                } else {
                    sVar12.W();
                }
                return qy.b0.f48488a;
            case 20:
                l1.n nVar13 = (l1.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                l1.s sVar14 = (l1.s) nVar13;
                if (sVar14.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ua.b(this.f4543b, j0.c.B(z1.o.f58481a, 8, 3), ((h1.s1) sVar14.j(h1.v1.f31180a)).f31036s, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar14.j(fc.f30256a)).f30180n, sVar14, 48, 0, 65528);
                } else {
                    sVar14.W();
                }
                return qy.b0.f48488a;
            case 21:
                ((Integer) obj2).getClass();
                mt.b1.h(this.f4543b, (l1.n) obj, l1.t.M(1));
                break;
            case 22:
                l1.n nVar14 = (l1.n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                l1.s sVar15 = (l1.s) nVar14;
                if (sVar15.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    e20.a aVarC = w4.c.c(sVar15, -1168520582, sVar15, -1633490746);
                    boolean zF = sVar15.f(null) | sVar15.f(aVarC);
                    Object objQ = sVar15.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = w4.c.e(xt.u.class, aVarC, null, null, sVar15);
                    }
                    sVar15.p(false);
                    sVar15.p(false);
                    String lowerCase = this.f4543b.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                    ua.b(ub.a.e0(sVar15, ((xt.u) objQ).c(lowerCase)), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar15, 0, 0, 131070);
                } else {
                    sVar15.W();
                }
                return qy.b0.f48488a;
            case 23:
                ((Integer) obj2).getClass();
                nn.c.b(this.f4543b, (l1.n) obj, l1.t.M(7));
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((Integer) obj2).getClass();
                nn.c.m(this.f4543b, (l1.n) obj, l1.t.M(7));
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                l1.n nVar15 = (l1.n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                l1.s sVar16 = (l1.s) nVar15;
                if (sVar16.T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ua.b(this.f4543b, null, 0L, fr.j3.A(10), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar16, 3072, 0, 131062);
                } else {
                    sVar16.W();
                }
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                l1.n nVar16 = (l1.n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                l1.s sVar17 = (l1.s) nVar16;
                if (sVar17.T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ua.b(oz.x.q0(ub.a.e0(sVar17, R.string.group_s), "%s", this.f4543b), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar17, 0, 0, 131070);
                } else {
                    sVar17.W();
                }
                return qy.b0.f48488a;
            case 27:
                ((Integer) obj2).getClass();
                xn.a.p(this.f4543b, (l1.n) obj, l1.t.M(1));
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                xn.a.q(this.f4543b, (l1.n) obj, l1.t.M(1));
                break;
            default:
                ((Integer) obj2).getClass();
                xn.a.d(this.f4543b, (l1.n) obj, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ e0(String str, int i11, int i12) {
        this.f4542a = i12;
        this.f4543b = str;
    }
}
