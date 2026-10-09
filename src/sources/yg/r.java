package yg;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import d0.v;
import dt.d2;
import fr.j3;
import fr.p3;
import g2.j0;
import g2.v0;
import g2.w0;
import g2.x;
import h1.k7;
import h1.r4;
import h1.ua;
import j0.a2;
import j0.e1;
import j0.e2;
import j0.i1;
import j0.u;
import j0.z1;
import j3.c0;
import j3.f0;
import j3.g0;
import j3.h0;
import j3.p0;
import j3.y0;
import java.util.List;
import l1.q1;
import l1.t;
import l1.x1;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f57841a = new t1.d(new xu.d(19), false, -2058047838);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f57842b = new t1.d(new xu.e(11), false, -319187457);

    static {
        new t1.d(new xu.e(12), false, -1312654395);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:103:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:107:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:108:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:110:0x0300  */
    /* JADX WARN: Code duplicated, block: B:111:0x0306  */
    /* JADX WARN: Code duplicated, block: B:114:0x0343  */
    /* JADX WARN: Code duplicated, block: B:115:0x0349  */
    /* JADX WARN: Code duplicated, block: B:120:0x0366  */
    /* JADX WARN: Code duplicated, block: B:125:0x0375  */
    /* JADX WARN: Code duplicated, block: B:127:0x0426  */
    /* JADX WARN: Code duplicated, block: B:128:0x042b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0443  */
    /* JADX WARN: Code duplicated, block: B:134:0x047e  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x012f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0133  */
    /* JADX WARN: Code duplicated, block: B:74:0x014e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0158  */
    /* JADX WARN: Code duplicated, block: B:79:0x0160  */
    /* JADX WARN: Code duplicated, block: B:80:0x0163  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:86:0x0200  */
    /* JADX WARN: Code duplicated, block: B:87:0x0204  */
    /* JADX WARN: Code duplicated, block: B:94:0x0223  */
    /* JADX WARN: Code duplicated, block: B:97:0x0231  */
    /* JADX WARN: Code duplicated, block: B:99:0x0298  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    public static final void a(String str, Boolean bool, Boolean bool2, boolean z11, boolean z12, float f5, long j11, l1.n nVar, int i11) {
        int i12;
        l1.s sVar;
        int i13;
        float f11;
        int iHashCode;
        y2.h hVar;
        float f12;
        fz.a aVar;
        y2.h hVar2;
        ?? r9;
        int i14;
        l1.s sVar2;
        z1.j jVar;
        int iHashCode2;
        z1.j jVar2;
        int i15;
        k2.b bVarY;
        long j12;
        l1.s sVar3;
        float f13;
        w0 w0VarF;
        fz.a aVar2;
        int iHashCode3;
        l1.s sVar4;
        h0 h0Var;
        g0 g0Var;
        f0 f0Var;
        String str2;
        l1.s sVar5 = (l1.s) nVar;
        sVar5.f0(-931458537);
        if ((i11 & 6) == 0) {
            i12 = (sVar5.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar5.f(bool) ? 32 : 16;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar5.g(z11) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar5.g(z12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar5.c(f5) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar5.e(j11) ? 1048576 : 524288;
        }
        if (sVar5.T(i12 & 1, (599059 & i12) != 599058)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarQ = j0.c.q(e2.e(oVar, 1.0f), e1.Min);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
            int iHashCode4 = Long.hashCode(sVar5.T);
            q1 q1VarL = sVar5.l();
            z1.r rVarC = z1.a.c(sVar5, rVarQ);
            y2.k.J.getClass();
            fz.a aVar3 = y2.j.f56913b;
            sVar5.h0();
            if (sVar5.S) {
                sVar5.k(aVar3);
            } else {
                sVar5.r0();
            }
            y2.h hVar3 = y2.j.f56917f;
            t.J(hVar3, a2VarA, sVar5);
            y2.h hVar4 = y2.j.f56916e;
            t.J(hVar4, q1VarL, sVar5);
            y2.h hVar5 = y2.j.f56918g;
            if (sVar5.S) {
                i13 = i12;
            } else {
                i13 = i12;
                if (!kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                }
                y2.h hVar6 = y2.j.f56915d;
                t.J(hVar6, rVarC, sVar5);
                if (3.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                f11 = 16;
                z1.r rVarB = j0.c.B(new i1(3.0f, true), 8, f11);
                q0 q0VarD = j0.o.d(z1.c.f58466d, false);
                iHashCode = Long.hashCode(sVar5.T);
                q1 q1VarL2 = sVar5.l();
                z1.r rVarC2 = z1.a.c(sVar5, rVarB);
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(aVar3);
                } else {
                    sVar5.r0();
                }
                t.J(hVar3, q0VarD, sVar5);
                t.J(hVar4, q1VarL2, sVar5);
                if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar5, iHashCode, hVar5);
                }
                t.J(hVar6, rVarC2, sVar5);
                if (z11) {
                    hVar = hVar4;
                    f12 = f11;
                    aVar = aVar3;
                    hVar2 = hVar5;
                    r9 = 0;
                    i14 = 199680;
                    sVar5.d0(-1449831967);
                    sVar2 = sVar5;
                } else {
                    sVar5.d0(-1444843323);
                    if (str == null) {
                        str2 = BuildConfig.VERSION_NAME;
                    } else {
                        str2 = str;
                    }
                    i14 = 199680;
                    String str3 = str2;
                    hVar = hVar4;
                    aVar = aVar3;
                    f12 = f11;
                    hVar2 = hVar5;
                    r9 = 0;
                    ua.b(str3, null, j11, j3.A(14), null, n3.s.K, null, 0L, null, 0L, 0, false, 0, 0, null, sVar5, ((i13 >> 12) & 896) | 199680, 0, 131026);
                    sVar2 = sVar5;
                }
                sVar2.p(r9);
                sVar2.p(true);
                z1.r rVarC3 = j0.c.C(e2.s(oVar, 52), CropImageView.DEFAULT_ASPECT_RATIO, f12, 1);
                jVar = z1.c.f58467e;
                q0 q0VarD2 = j0.o.d(jVar, r9);
                iHashCode2 = Long.hashCode(sVar2.T);
                q1 q1VarL3 = sVar2.l();
                z1.r rVarC4 = z1.a.c(sVar2, rVarC3);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(aVar);
                } else {
                    sVar2.r0();
                }
                t.J(hVar3, q0VarD2, sVar2);
                t.J(hVar, q1VarL3, sVar2);
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                }
                t.J(hVar6, rVarC4, sVar2);
                if (z11) {
                    sVar2.d0(599648955);
                    String strE0 = ub.a.e0(sVar2, R.string.free);
                    n3.s sVar6 = n3.s.L;
                    l1.s sVar7 = sVar2;
                    i15 = R.drawable.ic_billing_page_check_2;
                    jVar2 = jVar;
                    j12 = j11;
                    ua.b(strE0, null, j12, j3.A(r4), null, sVar6, null, 0L, null, 0L, 0, false, 0, 0, null, sVar7, ((i13 >> 12) & 896) | i14, 0, 131026);
                    l1.s sVar8 = sVar7;
                    sVar8.p(r9);
                    sVar3 = sVar8;
                } else {
                    jVar2 = jVar;
                    i15 = R.drawable.ic_billing_page_check_2;
                    sVar2.d0(599899745);
                    if (kotlin.jvm.internal.m.a(bool, Boolean.TRUE)) {
                        sVar2.d0(434995627);
                        bVarY = se.k.y(i15, sVar2, r9);
                    } else {
                        sVar2.d0(434997491);
                        bVarY = se.k.y(R.drawable.ic_sub_intro_lock, sVar2, r9);
                    }
                    sVar2.p(r9);
                    r4.b(bVarY, null, d2.h.a(e2.n(oVar, 14), 0.6f), j11, sVar2, 440 | ((i13 >> 9) & 7168), 0);
                    j12 = j11;
                    sVar2.p(r9);
                    sVar3 = sVar2;
                }
                sVar3.p(true);
                if (z11) {
                    f13 = CropImageView.DEFAULT_ASPECT_RATIO;
                    w0VarF = r0.f.f(f5, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12);
                } else {
                    f13 = CropImageView.DEFAULT_ASPECT_RATIO;
                    if (z12) {
                        w0VarF = r0.f.f(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, f5, 3);
                    } else {
                        w0VarF = g2.f0.f28556b;
                    }
                }
                aVar2 = aVar;
                z1.r rVarC5 = j0.c.C(d0.n.h(e2.c(e2.s(oVar, 72), 1.0f), x.c(j12, 0.13f), w0VarF), f13, f12, 1);
                q0 q0VarD3 = j0.o.d(jVar2, false);
                iHashCode3 = Long.hashCode(sVar3.T);
                q1 q1VarL4 = sVar3.l();
                z1.r rVarC6 = z1.a.c(sVar3, rVarC5);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(aVar2);
                } else {
                    sVar3.r0();
                }
                t.J(hVar3, q0VarD3, sVar3);
                t.J(hVar, q1VarL4, sVar3);
                if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar2);
                }
                t.J(hVar6, rVarC6, sVar3);
                if (z11) {
                    sVar3.d0(184332616);
                    List listL = ns.o.L(new x(g2.f0.e(4294961939L)), new x(g2.f0.e(4294944000L)));
                    String strE1 = ub.a.e0(sVar3, R.string.premium);
                    n3.s sVar9 = n3.s.L;
                    long jA = j3.A(14);
                    y0 y0Var = (y0) sVar3.j(ua.f31167a);
                    j0 j0VarQ = p3.q(listL);
                    y0 y0Var2 = y0.f35826d;
                    float fA = y0Var.f35827a.f35754a.a();
                    p0 p0Var = y0Var.f35827a;
                    long j13 = p0Var.f35755b;
                    n3.s sVar10 = p0Var.f35756c;
                    n3.o oVar2 = p0Var.f35757d;
                    n3.p pVar = p0Var.f35758e;
                    n3.i iVar = p0Var.f35759f;
                    String str4 = p0Var.f35760g;
                    long j14 = p0Var.f35761h;
                    u3.a aVar4 = p0Var.f35762i;
                    u3.p pVar2 = p0Var.f35763j;
                    q3.b bVar = p0Var.f35764k;
                    long j15 = p0Var.f35765l;
                    u3.l lVar = p0Var.m;
                    v0 v0Var = p0Var.f35766n;
                    i2.e eVar = p0Var.f35768p;
                    c0 c0Var = y0Var.f35828b;
                    int i16 = c0Var.f35668a;
                    int i17 = c0Var.f35669b;
                    long j16 = c0Var.f35670c;
                    u3.q qVar = c0Var.f35671d;
                    h0Var = y0Var.f35829c;
                    u3.i iVar2 = c0Var.f35673f;
                    int i18 = c0Var.f35674g;
                    int i19 = c0Var.f35675h;
                    u3.s sVar11 = c0Var.f35676i;
                    if (h0Var != null) {
                        g0Var = h0Var.f35703a;
                    } else {
                        g0Var = null;
                    }
                    p0 p0Var2 = new p0(new u3.b(j0VarQ, fA), j13, sVar10, oVar2, pVar, iVar, str4, j14, aVar4, pVar2, bVar, j15, lVar, v0Var, g0Var, eVar);
                    f0Var = null;
                    if (h0Var != null) {
                        f0Var = h0Var.f35704b;
                    }
                    l1.s sVar12 = sVar3;
                    ua.b(strE1, null, j12, jA, null, sVar9, null, 0L, null, 0L, 0, false, 0, 0, new y0(p0Var2, new c0(i16, i17, j16, qVar, f0Var, iVar2, i18, i19, sVar11), h0Var), sVar12, ((i13 >> 12) & 896) | i14, 0, 65490);
                    l1.s sVar13 = sVar12;
                    sVar13.p(false);
                    sVar4 = sVar13;
                } else {
                    sVar3.d0(184904008);
                    r4.b(se.k.y(i15, sVar3, 0), null, e2.n(oVar, 14), j11, sVar3, 440 | ((i13 >> 9) & 7168), 0);
                    sVar3.p(false);
                    sVar4 = sVar3;
                }
                sVar4.p(true);
                sVar4.p(true);
                sVar = sVar4;
            }
            defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar5);
            y2.h hVar7 = y2.j.f56915d;
            t.J(hVar7, rVarC, sVar5);
            if (3.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            f11 = 16;
            z1.r rVarB2 = j0.c.B(new i1(3.0f, true), 8, f11);
            q0 q0VarD4 = j0.o.d(z1.c.f58466d, false);
            iHashCode = Long.hashCode(sVar5.T);
            q1 q1VarL5 = sVar5.l();
            z1.r rVarC7 = z1.a.c(sVar5, rVarB2);
            sVar5.h0();
            if (sVar5.S) {
                sVar5.k(aVar3);
            } else {
                sVar5.r0();
            }
            t.J(hVar3, q0VarD4, sVar5);
            t.J(hVar4, q1VarL5, sVar5);
            if (sVar5.S) {
                defpackage.e.A(iHashCode, sVar5, iHashCode, hVar5);
            } else {
                defpackage.e.A(iHashCode, sVar5, iHashCode, hVar5);
            }
            t.J(hVar7, rVarC7, sVar5);
            if (z11) {
                sVar5.d0(-1444843323);
                if (str == null) {
                    str2 = BuildConfig.VERSION_NAME;
                } else {
                    str2 = str;
                }
                i14 = 199680;
                String str5 = str2;
                hVar = hVar4;
                aVar = aVar3;
                f12 = f11;
                hVar2 = hVar5;
                r9 = 0;
                ua.b(str5, null, j11, j3.A(14), null, n3.s.K, null, 0L, null, 0L, 0, false, 0, 0, null, sVar5, ((i13 >> 12) & 896) | 199680, 0, 131026);
                sVar2 = sVar5;
            } else {
                hVar = hVar4;
                f12 = f11;
                aVar = aVar3;
                hVar2 = hVar5;
                r9 = 0;
                i14 = 199680;
                sVar5.d0(-1449831967);
                sVar2 = sVar5;
            }
            sVar2.p(r9);
            sVar2.p(true);
            z1.r rVarC8 = j0.c.C(e2.s(oVar, 52), CropImageView.DEFAULT_ASPECT_RATIO, f12, 1);
            jVar = z1.c.f58467e;
            q0 q0VarD5 = j0.o.d(jVar, r9);
            iHashCode2 = Long.hashCode(sVar2.T);
            q1 q1VarL6 = sVar2.l();
            z1.r rVarC9 = z1.a.c(sVar2, rVarC8);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(aVar);
            } else {
                sVar2.r0();
            }
            t.J(hVar3, q0VarD5, sVar2);
            t.J(hVar, q1VarL6, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
            } else {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
            }
            t.J(hVar7, rVarC9, sVar2);
            if (z11) {
                sVar2.d0(599648955);
                String strE2 = ub.a.e0(sVar2, R.string.free);
                n3.s sVar14 = n3.s.L;
                l1.s sVar15 = sVar2;
                i15 = R.drawable.ic_billing_page_check_2;
                jVar2 = jVar;
                j12 = j11;
                ua.b(strE2, null, j12, j3.A(r4), null, sVar14, null, 0L, null, 0L, 0, false, 0, 0, null, sVar15, ((i13 >> 12) & 896) | i14, 0, 131026);
                l1.s sVar16 = sVar15;
                sVar16.p(r9);
                sVar3 = sVar16;
            } else {
                jVar2 = jVar;
                i15 = R.drawable.ic_billing_page_check_2;
                sVar2.d0(599899745);
                if (kotlin.jvm.internal.m.a(bool, Boolean.TRUE)) {
                    sVar2.d0(434995627);
                    bVarY = se.k.y(i15, sVar2, r9);
                } else {
                    sVar2.d0(434997491);
                    bVarY = se.k.y(R.drawable.ic_sub_intro_lock, sVar2, r9);
                }
                sVar2.p(r9);
                r4.b(bVarY, null, d2.h.a(e2.n(oVar, 14), 0.6f), j11, sVar2, 440 | ((i13 >> 9) & 7168), 0);
                j12 = j11;
                sVar2.p(r9);
                sVar3 = sVar2;
            }
            sVar3.p(true);
            if (z11) {
                f13 = CropImageView.DEFAULT_ASPECT_RATIO;
                w0VarF = r0.f.f(f5, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12);
            } else {
                f13 = CropImageView.DEFAULT_ASPECT_RATIO;
                if (z12) {
                    w0VarF = r0.f.f(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, f5, 3);
                } else {
                    w0VarF = g2.f0.f28556b;
                }
            }
            aVar2 = aVar;
            z1.r rVarC10 = j0.c.C(d0.n.h(e2.c(e2.s(oVar, 72), 1.0f), x.c(j12, 0.13f), w0VarF), f13, f12, 1);
            q0 q0VarD6 = j0.o.d(jVar2, false);
            iHashCode3 = Long.hashCode(sVar3.T);
            q1 q1VarL7 = sVar3.l();
            z1.r rVarC11 = z1.a.c(sVar3, rVarC10);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(aVar2);
            } else {
                sVar3.r0();
            }
            t.J(hVar3, q0VarD6, sVar3);
            t.J(hVar, q1VarL7, sVar3);
            if (sVar3.S) {
                defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar2);
            } else {
                defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar2);
            }
            t.J(hVar7, rVarC11, sVar3);
            if (z11) {
                sVar3.d0(184332616);
                List listL2 = ns.o.L(new x(g2.f0.e(4294961939L)), new x(g2.f0.e(4294944000L)));
                String strE3 = ub.a.e0(sVar3, R.string.premium);
                n3.s sVar17 = n3.s.L;
                long jA2 = j3.A(14);
                y0 y0Var3 = (y0) sVar3.j(ua.f31167a);
                j0 j0VarQ2 = p3.q(listL2);
                y0 y0Var4 = y0.f35826d;
                float fA2 = y0Var3.f35827a.f35754a.a();
                p0 p0Var3 = y0Var3.f35827a;
                long j17 = p0Var3.f35755b;
                n3.s sVar18 = p0Var3.f35756c;
                n3.o oVar3 = p0Var3.f35757d;
                n3.p pVar3 = p0Var3.f35758e;
                n3.i iVar3 = p0Var3.f35759f;
                String str6 = p0Var3.f35760g;
                long j18 = p0Var3.f35761h;
                u3.a aVar5 = p0Var3.f35762i;
                u3.p pVar4 = p0Var3.f35763j;
                q3.b bVar2 = p0Var3.f35764k;
                long j19 = p0Var3.f35765l;
                u3.l lVar2 = p0Var3.m;
                v0 v0Var2 = p0Var3.f35766n;
                i2.e eVar2 = p0Var3.f35768p;
                c0 c0Var2 = y0Var3.f35828b;
                int i110 = c0Var2.f35668a;
                int i111 = c0Var2.f35669b;
                long j110 = c0Var2.f35670c;
                u3.q qVar2 = c0Var2.f35671d;
                h0Var = y0Var3.f35829c;
                u3.i iVar4 = c0Var2.f35673f;
                int i112 = c0Var2.f35674g;
                int i113 = c0Var2.f35675h;
                u3.s sVar19 = c0Var2.f35676i;
                if (h0Var != null) {
                    g0Var = h0Var.f35703a;
                } else {
                    g0Var = null;
                }
                p0 p0Var4 = new p0(new u3.b(j0VarQ2, fA2), j17, sVar18, oVar3, pVar3, iVar3, str6, j18, aVar5, pVar4, bVar2, j19, lVar2, v0Var2, g0Var, eVar2);
                f0Var = null;
                if (h0Var != null) {
                    f0Var = h0Var.f35704b;
                }
                l1.s sVar110 = sVar3;
                ua.b(strE3, null, j12, jA2, null, sVar17, null, 0L, null, 0L, 0, false, 0, 0, new y0(p0Var4, new c0(i110, i111, j110, qVar2, f0Var, iVar4, i112, i113, sVar19), h0Var), sVar110, ((i13 >> 12) & 896) | i14, 0, 65490);
                l1.s sVar111 = sVar110;
                sVar111.p(false);
                sVar4 = sVar111;
            } else {
                sVar3.d0(184904008);
                r4.b(se.k.y(i15, sVar3, 0), null, e2.n(oVar, 14), j11, sVar3, 440 | ((i13 >> 9) & 7168), 0);
                sVar3.p(false);
                sVar4 = sVar3;
            }
            sVar4.p(true);
            sVar4.p(true);
            sVar = sVar4;
        } else {
            sVar5.W();
            sVar = sVar5;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d1.b(str, bool, bool2, z11, z12, f5, j11, i11);
        }
    }

    public static final void b(int i11, long j11, l1.n nVar, z1.r rVar) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1071811312);
        int i12 = i11 | (sVar2.e(j11) ? 4 : 2) | (sVar2.f(rVar) ? 32 : 16);
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(y2.j.f56917f, uVarA, sVar2);
            t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar2);
            ua.b(ub.a.e0(sVar2, R.string.what_s_included), j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, 7), j11, j3.A(22), null, n3.s.L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, ((i12 << 6) & 896) | 199728, 0, 131024);
            sVar = sVar2;
            c(ns.o.L(new s(ub.a.e0(sVar, R.string.alphabet_pronunciation), true), new s(ub.a.e0(sVar, R.string.travel_phrasebook), true), new s(ub.a.e0(sVar, R.string.main_course_lessons), false), new s(ub.a.e0(sVar, R.string.fluent_lessons), false), new s(ub.a.e0(sVar, R.string.learn_all_languages), false)), j11, sVar, (i12 << 3) & 112);
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d2(i11, 2, j11, rVar);
        }
    }

    public static final void c(List list, long j11, l1.n nVar, int i11) {
        l1.s sVar;
        long j12;
        long j13;
        boolean z11;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-405623069);
        int i12 = (i11 & 6) == 0 ? (sVar2.h(list) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar2.e(j11) ? 32 : 16;
        }
        boolean z12 = false;
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            float f5 = 12;
            long jC = x.c(j11, 1.0f);
            v vVarA = d0.n.a(jC, 1);
            z1.r rVarB = j0.c.B(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.d(f5), z1.o.f58481a), 6, 14);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarB);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(y2.j.f56917f, uVarA, sVar2);
            t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar2);
            int i13 = (i12 << 15) & 3670016;
            a(null, null, null, true, false, f5, j11, sVar2, i13 | 224694);
            sVar2.d0(623100415);
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    ns.o.V();
                    throw null;
                }
                s sVar3 = (s) obj;
                int i16 = i14;
                a(sVar3.f57843a, Boolean.valueOf(sVar3.f57844b), Boolean.TRUE, false, i14 == list.size() + (-1) ? true : z12, f5, j11, sVar2, i13 | 199680);
                float f11 = f5;
                l1.s sVar4 = sVar2;
                if (i16 < list.size() - 1) {
                    sVar4.d0(1813001132);
                    j13 = jC;
                    k7.g(null, (float) 0.5d, j13, sVar4, 48, 1);
                    z11 = false;
                } else {
                    j13 = jC;
                    z11 = false;
                    sVar4.d0(1808906869);
                }
                sVar4.p(z11);
                z12 = z11;
                jC = j13;
                sVar2 = sVar4;
                f5 = f11;
                i14 = i15;
            }
            sVar = sVar2;
            j12 = j11;
            sVar.p(z12);
            sVar.p(true);
        } else {
            sVar = sVar2;
            j12 = j11;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q(list, i11, j12);
        }
    }
}
