package nv;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bt.e6;
import bt.g6;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.lingodeer.R;
import com.lingodeer.data.model.SyllableLessonStatus;
import com.yalantis.ucrop.view.CropImageView;
import dt.j1;
import fr.j3;
import g2.f0;
import g2.v0;
import h1.dc;
import h1.e0;
import h1.fc;
import h1.i9;
import h1.k7;
import h1.p7;
import h1.r4;
import h1.s1;
import h1.ua;
import iv.o0;
import iv.t0;
import j0.a2;
import j0.e1;
import j0.e2;
import j0.i1;
import j0.v1;
import j0.z1;
import j3.p0;
import j3.y0;
import j9.c0;
import java.util.ArrayList;
import jr.g0;
import km.x0;
import kotlin.NoWhenBranchMatchedException;
import l1.b1;
import l1.c3;
import l1.q1;
import l1.x1;
import mt.k6;
import qy.b0;
import rt.cb;
import rt.db;
import rt.eb;
import rt.fb;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f44086a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t1.d f44094e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t1.d f44102k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t1.d f44103l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final t1.d f44104n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t1.d f44106p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final t1.d f44109s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final t1.d f44111u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f44088b = new t1.d(new mt.k(17, 0), false, 576848636);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.d f44090c = new t1.d(new mt.k(18, 0), false, -1569431053);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.d f44092d = new t1.d(new mt.i(28), false, 773334966);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t1.d f44096f = new t1.d(new mt.k(20, 0), false, 980714708);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t1.d f44098g = new t1.d(new mt.k(21, 0), false, -1601838915);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t1.d f44099h = new t1.d(new mt.k(22, 0), false, -1550795300);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t1.d f44100i = new t1.d(new mt.i(29), false, -130132522);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t1.d f44101j = new t1.d(new b(0), false, 461496487);
    public static final t1.d m = new t1.d(new b(1), false, 738270687);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final t1.d f44105o = new t1.d(new b(2), false, 1062804961);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final t1.d f44107q = new t1.d(new mt.k(27, 0), false, 1451243254);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final t1.d f44108r = new t1.d(new b(3), false, 1387339235);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final t1.d f44110t = new t1.d(new b(4), false, 1711873509);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final t1.d f44112v = new t1.d(new b(5), false, 2036407783);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final t1.d f44113w = new t1.d(new c(0), false, -1254012024);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final t1.d f44114x = new t1.d(new c(1), false, -1271996191);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final t1.d f44115y = new t1.d(new c(2), false, -1481891830);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final t1.d f44116z = new t1.d(new b(6), false, -564395185);
    public static final t1.d A = new t1.d(new c(3), false, -893000728);
    public static final t1.d B = new t1.d(new b(7), false, -203383889);
    public static final t1.d C = new t1.d(new c(4), false, -531989432);
    public static final t1.d D = new t1.d(new b(8), false, 157627407);
    public static final t1.d E = new t1.d(new c(5), false, -170978136);
    public static final t1.d F = new t1.d(new b(9), false, 518638703);
    public static final t1.d G = new t1.d(new c(6), false, 190033160);
    public static final t1.d H = new t1.d(new c(7), false, -113685207);
    public static final t1.d I = new t1.d(new b(10), false, 879649999);
    public static final t1.d J = new t1.d(new c(8), false, 551044456);
    public static final t1.d K = new t1.d(new b(11), false, 1240661295);
    public static final t1.d L = new t1.d(new c(9), false, 912055752);
    public static final t1.d M = new t1.d(new b(12), false, 1601672591);
    public static final t1.d N = new t1.d(new c(10), false, 1273067048);
    public static final t1.d O = new t1.d(new b(13), false, 1962683887);
    public static final t1.d P = new t1.d(new c(11), false, 1634078344);
    public static final t1.d Q = new t1.d(new b(14), false, -1971272113);
    public static final t1.d R = new t1.d(new c(12), false, -9634530);
    public static final t1.d S = new t1.d(new b(15), false, 438474149);
    public static final t1.d T = new t1.d(new c(13), false, -1002864672);
    public static final t1.d U = new t1.d(new b(16), false, -554755993);
    public static final t1.d V = new t1.d(new c(14), false, -1996094814);
    public static final t1.d W = new t1.d(new b(17), false, -1547986135);
    public static final t1.d X = new t1.d(new c(15), false, 1305642340);
    public static final t1.d Y = new t1.d(new b(18), false, 1753751019);
    public static final t1.d Z = new t1.d(new c(16), false, 312412198);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final t1.d f44087a0 = new t1.d(new b(19), false, 760520877);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final t1.d f44089b0 = new t1.d(new c(17), false, -680817944);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final t1.d f44091c0 = new t1.d(new b(20), false, -232709265);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final t1.d f44093d0 = new t1.d(new c(18), false, -1674048086);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final t1.d f44095e0 = new t1.d(new b(21), false, -1225939407);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final t1.d f44097f0 = new t1.d(new b(22), false, -1279967874);

    static {
        byte b3 = 0;
        f44086a = new t1.d(new mt.k(16, b3), false, 1218599525);
        f44094e = new t1.d(new mt.k(19, b3), false, 1626019641);
        f44102k = new t1.d(new mt.k(23, b3), false, 1764563300);
        f44103l = new t1.d(new mt.k(24, b3), false, -558548008);
        f44104n = new t1.d(new mt.k(25, b3), false, -234013734);
        f44106p = new t1.d(new mt.k(26, b3), false, 90520540);
        f44109s = new t1.d(new mt.k(28, b3), false, 415054814);
        f44111u = new t1.d(new mt.k(29, b3), false, 739589088);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:57:0x0109  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:61:0x011a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0128  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:70:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:78:0x0226  */
    /* JADX WARN: Code duplicated, block: B:79:0x022a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0237  */
    /* JADX WARN: Code duplicated, block: B:84:0x0245  */
    /* JADX WARN: Code duplicated, block: B:87:0x0263  */
    /* JADX WARN: Code duplicated, block: B:90:0x0270  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void b(String str, String zhuyin, boolean z11, fz.a onClick, t1.d dVar, fz.e eVar, l1.n nVar, int i11, int i12) {
        int i13;
        boolean z12;
        int i14;
        int i15;
        int i16;
        fz.e eVar2;
        int i17;
        fz.e eVar3;
        boolean z13;
        t1.d dVar2;
        fz.e eVar4;
        l1.s sVar;
        fz.e eVar5;
        x1 x1VarT;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        int iHashCode2;
        l1.s sVar2;
        int iHashCode3;
        y2.h hVar2;
        int iHashCode4;
        kotlin.jvm.internal.m.f(zhuyin, "zhuyin");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(-873326759);
        if ((i11 & 48) == 0) {
            i13 = (sVar3.f(zhuyin) ? 32 : 16) | i11;
        } else {
            i13 = i11;
        }
        int i18 = i12 & 4;
        if (i18 == 0) {
            if ((i11 & 384) == 0) {
                z12 = z11;
                i13 |= sVar3.g(z12) ? 256 : 128;
            }
            if (sVar3.h(onClick)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i15 = i13 | i14;
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((196608 & i11) == 0) {
                    eVar2 = eVar;
                    if (sVar3.h(eVar2)) {
                        i17 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i17 = 65536;
                    }
                    i15 |= i17;
                    eVar3 = eVar2;
                }
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (sVar3.T(i15 & 1, z13)) {
                    if (i18 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        eVar3 = f44102k;
                    }
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarA = j0.c.A(oVar, 16);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar3, 0);
                    iHashCode = Long.hashCode(sVar3.T);
                    q1 q1VarL = sVar3.l();
                    z1.r rVarC = z1.a.c(sVar3, rVarA);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    y2.h hVar3 = y2.j.f56917f;
                    l1.t.J(hVar3, uVarA, sVar3);
                    y2.h hVar4 = y2.j.f56916e;
                    l1.t.J(hVar4, q1VarL, sVar3);
                    hVar = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                    }
                    y2.h hVar5 = y2.j.f56915d;
                    l1.t.J(hVar5, rVarC, sVar3);
                    z1.r rVarQ = j0.c.q(oVar, e1.Min);
                    a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar3, 48);
                    iHashCode2 = Long.hashCode(sVar3.T);
                    q1 q1VarL2 = sVar3.l();
                    z1.r rVarC2 = z1.a.c(sVar3, rVarQ);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(hVar3, a2VarA, sVar3);
                    l1.t.J(hVar4, q1VarL2, sVar3);
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar);
                    }
                    l1.t.J(hVar5, rVarC2, sVar3);
                    int i19 = i15;
                    fz.e eVar6 = eVar3;
                    boolean z14 = z12;
                    iu.k.l(onClick, null, z14, CropImageView.DEFAULT_ASPECT_RATIO, f0.e(4294964188L), 0L, f0.e(4294956449L), CropImageView.DEFAULT_ASPECT_RATIO, d0.n.a(f0.e(4294956449L), 1), t1.e.d(1736465853, new o0(str, zhuyin, 2), sVar3), sVar3, (i15 & 896) | ((i15 >> 9) & 14) | 907567104, 170);
                    sVar2 = sVar3;
                    z1.r rVarE = j0.c.E(oVar, 30, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                    z1.j jVar = z1.c.f58463a;
                    q0 q0VarD = j0.o.d(jVar, false);
                    iHashCode3 = Long.hashCode(sVar2.T);
                    q1 q1VarL3 = sVar2.l();
                    z1.r rVarC3 = z1.a.c(sVar2, rVarE);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar3, q0VarD, sVar2);
                    l1.t.J(hVar4, q1VarL3, sVar2);
                    if (sVar2.S && kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                        hVar2 = hVar;
                    } else {
                        hVar2 = hVar;
                        defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar2);
                    }
                    l1.t.J(hVar5, rVarC3, sVar2);
                    t1.d dVar3 = dVar;
                    dVar3.invoke(sVar2, 6);
                    sVar2.p(true);
                    sVar2.p(true);
                    q0 q0VarD2 = j0.o.d(jVar, false);
                    iHashCode4 = Long.hashCode(sVar2.T);
                    q1 q1VarL4 = sVar2.l();
                    z1.r rVarC4 = z1.a.c(sVar2, oVar);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar3, q0VarD2, sVar2);
                    l1.t.J(hVar4, q1VarL4, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar2);
                    }
                    l1.t.J(hVar5, rVarC4, sVar2);
                    fz.e eVar7 = eVar6;
                    eVar7.invoke(sVar2, Integer.valueOf((i19 >> 15) & 14));
                    sVar2.p(true);
                    sVar2.p(true);
                    z12 = z14;
                    sVar = sVar2;
                    eVar4 = eVar7;
                    dVar2 = dVar3;
                } else {
                    dVar2 = dVar;
                    l1.s sVar4 = sVar3;
                    sVar4.W();
                    sVar = sVar4;
                    eVar4 = eVar3;
                }
                eVar5 = eVar4;
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new j1(str, zhuyin, z12, onClick, dVar2, eVar5, i11, i12);
                }
            }
            i15 |= 196608;
            eVar3 = eVar;
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar3.T(i15 & 1, z13)) {
                if (i18 != 0) {
                    z12 = true;
                }
                if (i16 != 0) {
                    eVar3 = f44102k;
                }
                z1.o oVar2 = z1.o.f58481a;
                z1.r rVarA2 = j0.c.A(oVar2, 16);
                j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar3, 0);
                iHashCode = Long.hashCode(sVar3.T);
                q1 q1VarL5 = sVar3.l();
                z1.r rVarC5 = z1.a.c(sVar3, rVarA2);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                y2.h hVar6 = y2.j.f56917f;
                l1.t.J(hVar6, uVarA2, sVar3);
                y2.h hVar7 = y2.j.f56916e;
                l1.t.J(hVar7, q1VarL5, sVar3);
                hVar = y2.j.f56918g;
                if (sVar3.S) {
                    defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                }
                y2.h hVar8 = y2.j.f56915d;
                l1.t.J(hVar8, rVarC5, sVar3);
                z1.r rVarQ2 = j0.c.q(oVar2, e1.Min);
                a2 a2VarA2 = z1.a(j0.i.f35303a, z1.c.L, sVar3, 48);
                iHashCode2 = Long.hashCode(sVar3.T);
                q1 q1VarL6 = sVar3.l();
                z1.r rVarC6 = z1.a.c(sVar3, rVarQ2);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar6, a2VarA2, sVar3);
                l1.t.J(hVar7, q1VarL6, sVar3);
                if (sVar3.S) {
                    defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar);
                } else {
                    defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar);
                }
                l1.t.J(hVar8, rVarC6, sVar3);
                int i110 = i15;
                fz.e eVar8 = eVar3;
                boolean z15 = z12;
                iu.k.l(onClick, null, z15, CropImageView.DEFAULT_ASPECT_RATIO, f0.e(4294964188L), 0L, f0.e(4294956449L), CropImageView.DEFAULT_ASPECT_RATIO, d0.n.a(f0.e(4294956449L), 1), t1.e.d(1736465853, new o0(str, zhuyin, 2), sVar3), sVar3, (i15 & 896) | ((i15 >> 9) & 14) | 907567104, 170);
                sVar2 = sVar3;
                z1.r rVarE2 = j0.c.E(oVar2, 30, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                z1.j jVar2 = z1.c.f58463a;
                q0 q0VarD3 = j0.o.d(jVar2, false);
                iHashCode3 = Long.hashCode(sVar2.T);
                q1 q1VarL7 = sVar2.l();
                z1.r rVarC7 = z1.a.c(sVar2, rVarE2);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar6, q0VarD3, sVar2);
                l1.t.J(hVar7, q1VarL7, sVar2);
                if (sVar2.S) {
                    hVar2 = hVar;
                    defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar2);
                } else {
                    hVar2 = hVar;
                    defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar2);
                }
                l1.t.J(hVar8, rVarC7, sVar2);
                t1.d dVar4 = dVar;
                dVar4.invoke(sVar2, 6);
                sVar2.p(true);
                sVar2.p(true);
                q0 q0VarD4 = j0.o.d(jVar2, false);
                iHashCode4 = Long.hashCode(sVar2.T);
                q1 q1VarL8 = sVar2.l();
                z1.r rVarC8 = z1.a.c(sVar2, oVar2);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar6, q0VarD4, sVar2);
                l1.t.J(hVar7, q1VarL8, sVar2);
                if (sVar2.S) {
                    defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar2);
                } else {
                    defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar2);
                }
                l1.t.J(hVar8, rVarC8, sVar2);
                fz.e eVar9 = eVar8;
                eVar9.invoke(sVar2, Integer.valueOf((i110 >> 15) & 14));
                sVar2.p(true);
                sVar2.p(true);
                z12 = z15;
                sVar = sVar2;
                eVar4 = eVar9;
                dVar2 = dVar4;
            } else {
                dVar2 = dVar;
                l1.s sVar5 = sVar3;
                sVar5.W();
                sVar = sVar5;
                eVar4 = eVar3;
            }
            eVar5 = eVar4;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new j1(str, zhuyin, z12, onClick, dVar2, eVar5, i11, i12);
            }
        }
        i13 |= 384;
        z12 = z11;
        if (sVar3.h(onClick)) {
            i14 = 2048;
        } else {
            i14 = 1024;
        }
        i15 = i13 | i14;
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((196608 & i11) == 0) {
                eVar2 = eVar;
                if (sVar3.h(eVar2)) {
                    i17 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i17 = 65536;
                }
                i15 |= i17;
                eVar3 = eVar2;
            }
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar3.T(i15 & 1, z13)) {
                if (i18 != 0) {
                    z12 = true;
                }
                if (i16 != 0) {
                    eVar3 = f44102k;
                }
                z1.o oVar3 = z1.o.f58481a;
                z1.r rVarA3 = j0.c.A(oVar3, 16);
                j0.u uVarA3 = j0.t.a(j0.i.f35305c, z1.c.O, sVar3, 0);
                iHashCode = Long.hashCode(sVar3.T);
                q1 q1VarL9 = sVar3.l();
                z1.r rVarC9 = z1.a.c(sVar3, rVarA3);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                y2.h hVar9 = y2.j.f56917f;
                l1.t.J(hVar9, uVarA3, sVar3);
                y2.h hVar10 = y2.j.f56916e;
                l1.t.J(hVar10, q1VarL9, sVar3);
                hVar = y2.j.f56918g;
                if (sVar3.S) {
                    defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                }
                y2.h hVar11 = y2.j.f56915d;
                l1.t.J(hVar11, rVarC9, sVar3);
                z1.r rVarQ3 = j0.c.q(oVar3, e1.Min);
                a2 a2VarA3 = z1.a(j0.i.f35303a, z1.c.L, sVar3, 48);
                iHashCode2 = Long.hashCode(sVar3.T);
                q1 q1VarL10 = sVar3.l();
                z1.r rVarC10 = z1.a.c(sVar3, rVarQ3);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar9, a2VarA3, sVar3);
                l1.t.J(hVar10, q1VarL10, sVar3);
                if (sVar3.S) {
                    defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar);
                } else {
                    defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar);
                }
                l1.t.J(hVar11, rVarC10, sVar3);
                int i111 = i15;
                fz.e eVar10 = eVar3;
                boolean z16 = z12;
                iu.k.l(onClick, null, z16, CropImageView.DEFAULT_ASPECT_RATIO, f0.e(4294964188L), 0L, f0.e(4294956449L), CropImageView.DEFAULT_ASPECT_RATIO, d0.n.a(f0.e(4294956449L), 1), t1.e.d(1736465853, new o0(str, zhuyin, 2), sVar3), sVar3, (i15 & 896) | ((i15 >> 9) & 14) | 907567104, 170);
                sVar2 = sVar3;
                z1.r rVarE3 = j0.c.E(oVar3, 30, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                z1.j jVar3 = z1.c.f58463a;
                q0 q0VarD5 = j0.o.d(jVar3, false);
                iHashCode3 = Long.hashCode(sVar2.T);
                q1 q1VarL11 = sVar2.l();
                z1.r rVarC11 = z1.a.c(sVar2, rVarE3);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar9, q0VarD5, sVar2);
                l1.t.J(hVar10, q1VarL11, sVar2);
                if (sVar2.S) {
                    hVar2 = hVar;
                    defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar2);
                } else {
                    hVar2 = hVar;
                    defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar2);
                }
                l1.t.J(hVar11, rVarC11, sVar2);
                t1.d dVar5 = dVar;
                dVar5.invoke(sVar2, 6);
                sVar2.p(true);
                sVar2.p(true);
                q0 q0VarD6 = j0.o.d(jVar3, false);
                iHashCode4 = Long.hashCode(sVar2.T);
                q1 q1VarL12 = sVar2.l();
                z1.r rVarC12 = z1.a.c(sVar2, oVar3);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar9, q0VarD6, sVar2);
                l1.t.J(hVar10, q1VarL12, sVar2);
                if (sVar2.S) {
                    defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar2);
                } else {
                    defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar2);
                }
                l1.t.J(hVar11, rVarC12, sVar2);
                fz.e eVar11 = eVar10;
                eVar11.invoke(sVar2, Integer.valueOf((i111 >> 15) & 14));
                sVar2.p(true);
                sVar2.p(true);
                z12 = z16;
                sVar = sVar2;
                eVar4 = eVar11;
                dVar2 = dVar5;
            } else {
                dVar2 = dVar;
                l1.s sVar6 = sVar3;
                sVar6.W();
                sVar = sVar6;
                eVar4 = eVar3;
            }
            eVar5 = eVar4;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new j1(str, zhuyin, z12, onClick, dVar2, eVar5, i11, i12);
            }
        }
        i15 |= 196608;
        eVar3 = eVar;
        if ((74899 & i15) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (sVar3.T(i15 & 1, z13)) {
            if (i18 != 0) {
                z12 = true;
            }
            if (i16 != 0) {
                eVar3 = f44102k;
            }
            z1.o oVar4 = z1.o.f58481a;
            z1.r rVarA4 = j0.c.A(oVar4, 16);
            j0.u uVarA4 = j0.t.a(j0.i.f35305c, z1.c.O, sVar3, 0);
            iHashCode = Long.hashCode(sVar3.T);
            q1 q1VarL13 = sVar3.l();
            z1.r rVarC13 = z1.a.c(sVar3, rVarA4);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            y2.h hVar12 = y2.j.f56917f;
            l1.t.J(hVar12, uVarA4, sVar3);
            y2.h hVar13 = y2.j.f56916e;
            l1.t.J(hVar13, q1VarL13, sVar3);
            hVar = y2.j.f56918g;
            if (sVar3.S) {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
            }
            y2.h hVar14 = y2.j.f56915d;
            l1.t.J(hVar14, rVarC13, sVar3);
            z1.r rVarQ4 = j0.c.q(oVar4, e1.Min);
            a2 a2VarA4 = z1.a(j0.i.f35303a, z1.c.L, sVar3, 48);
            iHashCode2 = Long.hashCode(sVar3.T);
            q1 q1VarL14 = sVar3.l();
            z1.r rVarC14 = z1.a.c(sVar3, rVarQ4);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            l1.t.J(hVar12, a2VarA4, sVar3);
            l1.t.J(hVar13, q1VarL14, sVar3);
            if (sVar3.S) {
                defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar);
            } else {
                defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar);
            }
            l1.t.J(hVar14, rVarC14, sVar3);
            int i112 = i15;
            fz.e eVar12 = eVar3;
            boolean z17 = z12;
            iu.k.l(onClick, null, z17, CropImageView.DEFAULT_ASPECT_RATIO, f0.e(4294964188L), 0L, f0.e(4294956449L), CropImageView.DEFAULT_ASPECT_RATIO, d0.n.a(f0.e(4294956449L), 1), t1.e.d(1736465853, new o0(str, zhuyin, 2), sVar3), sVar3, (i15 & 896) | ((i15 >> 9) & 14) | 907567104, 170);
            sVar2 = sVar3;
            z1.r rVarE4 = j0.c.E(oVar4, 30, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            z1.j jVar4 = z1.c.f58463a;
            q0 q0VarD7 = j0.o.d(jVar4, false);
            iHashCode3 = Long.hashCode(sVar2.T);
            q1 q1VarL15 = sVar2.l();
            z1.r rVarC15 = z1.a.c(sVar2, rVarE4);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar12, q0VarD7, sVar2);
            l1.t.J(hVar13, q1VarL15, sVar2);
            if (sVar2.S) {
                hVar2 = hVar;
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar2);
            } else {
                hVar2 = hVar;
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar2);
            }
            l1.t.J(hVar14, rVarC15, sVar2);
            t1.d dVar6 = dVar;
            dVar6.invoke(sVar2, 6);
            sVar2.p(true);
            sVar2.p(true);
            q0 q0VarD8 = j0.o.d(jVar4, false);
            iHashCode4 = Long.hashCode(sVar2.T);
            q1 q1VarL16 = sVar2.l();
            z1.r rVarC16 = z1.a.c(sVar2, oVar4);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar12, q0VarD8, sVar2);
            l1.t.J(hVar13, q1VarL16, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar2);
            } else {
                defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar2);
            }
            l1.t.J(hVar14, rVarC16, sVar2);
            fz.e eVar13 = eVar12;
            eVar13.invoke(sVar2, Integer.valueOf((i112 >> 15) & 14));
            sVar2.p(true);
            sVar2.p(true);
            z12 = z17;
            sVar = sVar2;
            eVar4 = eVar13;
            dVar2 = dVar6;
        } else {
            dVar2 = dVar;
            l1.s sVar7 = sVar3;
            sVar7.W();
            sVar = sVar7;
            eVar4 = eVar3;
        }
        eVar5 = eVar4;
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j1(str, zhuyin, z12, onClick, dVar2, eVar5, i11, i12);
        }
    }

    public static final void c(fz.c playAudio, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1716133665);
        int i12 = (sVar.h(playAudio) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            float f5 = 16;
            j0.g gVarG = j0.i.g(f5);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarA = j0.c.A(oVar, f5);
            j0.u uVarA = j0.t.a(gVarG, z1.c.O, sVar, 6);
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
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_intro1_1), e2.e(oVar, 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30174g, sVar, 48, 0, 65532);
            sVar.d0(1632396185);
            StringBuilder sb2 = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            sb2.append(ub.a.e0(sVar, R.string.ko_syllable_intro1_2));
            arrayList.add(new j3.d(0, 6, 8, new p0(0L, 0L, n3.s.L, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65531), null));
            String string = sb2.toString();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                arrayList2.add(((j3.d) arrayList.get(i13)).a(sb2.length()));
            }
            j3.h hVar2 = new j3.h(string, arrayList2);
            sVar.p(false);
            c3 c3Var = fc.f30256a;
            ua.c(hVar2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ((dc) sVar.j(c3Var)).f30177j, sVar, 0, 0, 131070);
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_intro1_3), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 0, 0, 65534);
            sVar = sVar;
            String strE0 = ub.a.e0(sVar, R.string.ko_syllable_intro1_4);
            int i14 = i12 & 14;
            boolean z11 = i14 == 4;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new x0(playAudio, 21);
                sVar.o0(objQ);
            }
            n(6, (fz.a) objQ, "ㅎ", strE0, sVar, null);
            String strE1 = ub.a.e0(sVar, R.string.ko_syllable_intro1_5);
            boolean z12 = i14 == 4;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new x0(playAudio, 18);
                sVar.o0(objQ2);
            }
            n(6, (fz.a) objQ2, "ㅏ", strE1, sVar, null);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e6(playAudio, i11, 19);
        }
    }

    public static final void d(sv.b bVar, fz.c playAudio, fz.a onClickStartLearning, l1.n nVar, int i11) {
        String str = bVar.f51795b;
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(839395813);
        int i12 = i11 | (sVar.h(bVar) ? 4 : 2) | (sVar.h(playAudio) ? 32 : 16) | (sVar.h(onClickStartLearning) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
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
            z1.r rVarY = d0.n.y(j0.c.A(oVar, f5), d0.n.u(sVar), true, 12);
            j0.u uVarA = j0.t.a(j0.i.g(f5), z1.c.P, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarY);
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
            String strE0 = ub.a.e0(sVar, R.string.ko_syllable_intro2_1);
            c3 c3Var = fc.f30256a;
            ua.b(strE0, e2.e(oVar, 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30174g, sVar, 48, 0, 65532);
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_intro2_2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 0, 0, 65534);
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_intro2_3), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 0, 0, 65534);
            long j11 = g2.x.f28618e;
            float f11 = 12;
            i9.a(null, r0.f.d(f11), g2.x.c(j11, 0.5f), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f44088b, sVar, 12583296, 121);
            String strE1 = ub.a.e0(sVar, R.string.ko_syllable_intro2_4);
            boolean zA = kotlin.jvm.internal.m.a(str, "han");
            int i13 = i12 & 112;
            boolean z11 = i13 == 32;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new x0(playAudio, 19);
                sVar.o0(objQ);
            }
            o("한/ han", strE1, zA, null, (fz.a) objQ, sVar, 6);
            i9.a(null, r0.f.d(f11), g2.x.c(j11, 0.5f), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f44090c, sVar, 12583296, 121);
            sVar = sVar;
            String strE2 = ub.a.e0(sVar, R.string.ko_syllable_intro2_5);
            boolean zA2 = kotlin.jvm.internal.m.a(str, "geul");
            boolean z12 = i13 == 32;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new x0(playAudio, 20);
                sVar.o0(objQ2);
            }
            o("글 / geul", strE2, zA2, null, (fz.a) objQ2, sVar, 6);
            ep.a.C(oVar, 72, sVar, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(e2.e(j0.c.A(oVar, f5), 1.0f), z1.c.H), false, 0L, null, f44092d, sVar, ((i12 >> 6) & 14) | 196608, 28);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(bVar, playAudio, false, onClickStartLearning, i11, 5);
        }
    }

    public static final void e(sv.b bVar, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar, int i11) {
        sv.b bVar2;
        int i12;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(994807895);
        if ((i11 & 6) == 0) {
            bVar2 = bVar;
            i12 = (sVar.h(bVar2) ? 4 : 2) | i11;
        } else {
            bVar2 = bVar;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickFinish) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(playAudio) ? 2048 : 1024;
        }
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(oVar);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
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
            e0.c(f44086a, null, t1.e.d(497680103, new lt.g(onClickFinish, 14, (byte) 0), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new uu.f(20);
                sVar.o0(objQ);
            }
            o0.b bVarB = o0.w.b(0, 384, 3, (fz.a) objQ, sVar);
            float f5 = 28;
            float f11 = 16;
            v1 v1Var = new v1(f5, f11, f5, f11);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            ve.i.d(bVarB, new i1(1.0f, true), v1Var, null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-281406528, new br.u(bVarB, playAudio, bVar2, onClickStartLearning, 7), sVar), sVar, 384, 16376);
            ua.b((bVarB.k() + 1) + "/" + bVarB.m(), j0.c.E(e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f11, 7), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(((dc) sVar.j(fc.f30256a)).m, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447), sVar, 48, 0, 65532);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a((Object) bVar, onClickFinish, (qy.e) onClickStartLearning, (qy.e) playAudio, i11, 12);
        }
    }

    public static final void f(ArrayList arrayList, String str, fz.a onClickIntroduction, fz.a onClickLockedLesson, fz.c onClickLesson, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(onClickIntroduction, "onClickIntroduction");
        kotlin.jvm.internal.m.f(onClickLockedLesson, "onClickLockedLesson");
        kotlin.jvm.internal.m.f(onClickLesson, "onClickLesson");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1834522354);
        int i12 = i11 | (sVar.h(arrayList) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.h(onClickIntroduction) ? 256 : 128) | (sVar.h(onClickLockedLesson) ? 2048 : 1024) | (sVar.h(onClickLesson) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i12 & 1, (i12 & 9363) != 9362)) {
            float f5 = 16;
            j0.g gVarG = j0.i.g(f5);
            v1 v1Var = new v1(f5, f5, f5, f5);
            z1.r rVarD = e2.d(z1.o.f58481a, 1.0f);
            boolean zH = ((i12 & 896) == 256) | sVar.h(arrayList) | ((i12 & 112) == 32) | ((i12 & 7168) == 2048) | ((i12 & 57344) == 16384);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                b1.a aVar = new b1.a(arrayList, onClickIntroduction, str, onClickLockedLesson, onClickLesson, 18);
                sVar.o0(aVar);
                objQ = aVar;
            }
            ue.f.a(rVarD, null, v1Var, gVarG, null, null, false, null, (fz.c) objQ, sVar, 24966, 490);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.v1(arrayList, str, onClickIntroduction, onClickLockedLesson, onClickLesson, i11, 11);
        }
    }

    public static final void g(sv.h hVar, qv.c syllableWriteIndexUiState, fz.a refreshSyllableWriteIndex, fz.a onClickClose, fz.a onClickIntroduction, fz.a onClickLockedLesson, fz.c onClickLesson, fz.c onClickSyllableWriteLesson, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(syllableWriteIndexUiState, "syllableWriteIndexUiState");
        kotlin.jvm.internal.m.f(refreshSyllableWriteIndex, "refreshSyllableWriteIndex");
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(onClickIntroduction, "onClickIntroduction");
        kotlin.jvm.internal.m.f(onClickLockedLesson, "onClickLockedLesson");
        kotlin.jvm.internal.m.f(onClickLesson, "onClickLesson");
        kotlin.jvm.internal.m.f(onClickSyllableWriteLesson, "onClickSyllableWriteLesson");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-960995176);
        int i12 = i11 | (sVar2.f(hVar) ? 4 : 2) | (sVar2.f(syllableWriteIndexUiState) ? 32 : 16) | (sVar2.h(refreshSyllableWriteIndex) ? 256 : 128) | (sVar2.h(onClickClose) ? 2048 : 1024) | (sVar2.h(onClickIntroduction) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(onClickLockedLesson) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(onClickLesson) ? 1048576 : 524288) | (sVar2.h(onClickSyllableWriteLesson) ? 8388608 : 4194304);
        if (!sVar2.T(i12 & 1, (4793491 & i12) != 4793490)) {
            sVar = sVar2;
            sVar.W();
        } else if (hVar.equals(sv.g.f51804a)) {
            sVar2.d0(-98378905);
            tv.a.d(0, 1, sVar2, null);
            sVar2.p(false);
            sVar = sVar2;
        } else {
            sVar2.d0(1245541814);
            p7.a(null, t1.e.d(1488813949, new lt.g(onClickClose, 16, (byte) 0), sVar2), null, null, null, 0, 0L, 0L, null, t1.e.d(1136145096, new ei.l(hVar, onClickIntroduction, onClickLockedLesson, onClickLesson, refreshSyllableWriteIndex, syllableWriteIndexUiState, onClickSyllableWriteLesson, 4), sVar2), sVar2, 805306416, 509);
            sVar = sVar2;
            sVar.p(false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new g6(hVar, syllableWriteIndexUiState, refreshSyllableWriteIndex, onClickClose, onClickIntroduction, onClickLockedLesson, onClickLesson, onClickSyllableWriteLesson, i11);
        }
    }

    public static final void h(int i11, sv.d dVar, fz.a onClickFinish, fz.a onClickStartLearning, l1.n nVar, int i12) {
        int i13;
        sv.d dVar2;
        int i14;
        sv.d dVar3;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1298989895);
        if ((i12 & 6) == 0) {
            i13 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i15 = i13 | 16 | (sVar.h(onClickFinish) ? 256 : 128);
        if ((i12 & 3072) == 0) {
            i15 |= sVar.h(onClickStartLearning) ? 2048 : 1024;
        }
        if (sVar.T(i15 & 1, (i15 & 1171) != 1170)) {
            sVar.Y();
            if ((i12 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(sv.d.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i14 = i15 & (-113);
                dVar3 = (sv.d) viewModelA;
            } else {
                sVar.W();
                i14 = i15 & (-113);
                dVar3 = dVar;
            }
            sVar.q();
            sv.c cVar = (sv.c) l1.t.o(dVar3.f51800e, sVar).getValue();
            if (kotlin.jvm.internal.m.a(cVar, sv.a.f51793a)) {
                sVar.d0(-1506184042);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            } else {
                if (!(cVar instanceof sv.b)) {
                    throw p.x(sVar, -1506180242, false);
                }
                sVar.d0(553174617);
                sv.b bVar = (sv.b) cVar;
                fb fbVar = bVar.f51794a;
                if (fbVar instanceof db) {
                    sVar.d0(-1506178779);
                    tv.a.g(((db) fbVar).f49634a, null, sVar, 0, 6);
                    sVar.p(false);
                } else if (kotlin.jvm.internal.m.a(fbVar, eb.f49693a)) {
                    sVar.d0(-1506175114);
                    tv.a.d(0, 1, sVar, null);
                    sVar.p(false);
                } else {
                    if (!kotlin.jvm.internal.m.a(fbVar, cb.f49585a)) {
                        throw p.x(sVar, -1506175888, false);
                    }
                    sVar.d0(553460220);
                    l1.g gVar = l1.m.f39353a;
                    switch (i11) {
                        case 0:
                            sVar.d0(-1506170230);
                            boolean zH = sVar.h(dVar3);
                            Object objQ = sVar.Q();
                            if (zH || objQ == gVar) {
                                objQ = new m(dVar3, 14);
                                sVar.o0(objQ);
                            }
                            e(bVar, onClickFinish, onClickStartLearning, (fz.c) objQ, sVar, (i14 >> 3) & 1008);
                            sVar.p(false);
                            break;
                        case 1:
                            sVar.d0(-1506156902);
                            boolean zH2 = sVar.h(dVar3);
                            Object objQ2 = sVar.Q();
                            if (zH2 || objQ2 == gVar) {
                                objQ2 = new m(dVar3, 5);
                                sVar.o0(objQ2);
                            }
                            r.d((i14 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ2, sVar);
                            sVar.p(false);
                            break;
                        case 2:
                            sVar.d0(-1506143782);
                            boolean zH3 = sVar.h(dVar3);
                            Object objQ3 = sVar.Q();
                            if (zH3 || objQ3 == gVar) {
                                objQ3 = new m(dVar3, 6);
                                sVar.o0(objQ3);
                            }
                            r.e((i14 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ3, sVar);
                            sVar.p(false);
                            break;
                        case 3:
                            sVar.d0(-1506131942);
                            boolean zH4 = sVar.h(dVar3);
                            Object objQ4 = sVar.Q();
                            if (zH4 || objQ4 == gVar) {
                                objQ4 = new m(dVar3, 7);
                                sVar.o0(objQ4);
                            }
                            r.f((i14 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ4, sVar);
                            sVar.p(false);
                            break;
                        case 4:
                            sVar.d0(-1506120102);
                            boolean zH5 = sVar.h(dVar3);
                            Object objQ5 = sVar.Q();
                            if (zH5 || objQ5 == gVar) {
                                objQ5 = new m(dVar3, 8);
                                sVar.o0(objQ5);
                            }
                            r.g((i14 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ5, sVar);
                            sVar.p(false);
                            break;
                        case 5:
                            sVar.d0(-1506108262);
                            boolean zH6 = sVar.h(dVar3);
                            Object objQ6 = sVar.Q();
                            if (zH6 || objQ6 == gVar) {
                                objQ6 = new m(dVar3, 9);
                                sVar.o0(objQ6);
                            }
                            r.h((i14 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ6, sVar);
                            sVar.p(false);
                            break;
                        case 6:
                            sVar.d0(-1506096422);
                            boolean zH7 = sVar.h(dVar3);
                            Object objQ7 = sVar.Q();
                            if (zH7 || objQ7 == gVar) {
                                objQ7 = new m(dVar3, 10);
                                sVar.o0(objQ7);
                            }
                            r.i((i14 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ7, sVar);
                            sVar.p(false);
                            break;
                        case 7:
                            sVar.d0(-1506084582);
                            boolean zH8 = sVar.h(dVar3);
                            Object objQ8 = sVar.Q();
                            if (zH8 || objQ8 == gVar) {
                                objQ8 = new m(dVar3, 11);
                                sVar.o0(objQ8);
                            }
                            r.j((i14 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ8, sVar);
                            sVar.p(false);
                            break;
                        case 8:
                            sVar.d0(-1506072742);
                            boolean zH9 = sVar.h(dVar3);
                            Object objQ9 = sVar.Q();
                            if (zH9 || objQ9 == gVar) {
                                objQ9 = new m(dVar3, 12);
                                sVar.o0(objQ9);
                            }
                            r.k((i14 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ9, sVar);
                            sVar.p(false);
                            break;
                        case 9:
                            sVar.d0(-1506060902);
                            boolean zH10 = sVar.h(dVar3);
                            Object objQ10 = sVar.Q();
                            if (zH10 || objQ10 == gVar) {
                                objQ10 = new m(dVar3, 13);
                                sVar.o0(objQ10);
                            }
                            r.l((i14 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ10, sVar);
                            sVar.p(false);
                            break;
                        case 10:
                            sVar.d0(-1506049029);
                            boolean zH11 = sVar.h(dVar3);
                            Object objQ11 = sVar.Q();
                            if (zH11 || objQ11 == gVar) {
                                objQ11 = new m(dVar3, 0);
                                sVar.o0(objQ11);
                            }
                            i((i14 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ11, sVar);
                            sVar.p(false);
                            break;
                        case 11:
                            sVar.d0(-1506037125);
                            boolean zH12 = sVar.h(dVar3);
                            Object objQ12 = sVar.Q();
                            if (zH12 || objQ12 == gVar) {
                                objQ12 = new m(dVar3, 1);
                                sVar.o0(objQ12);
                            }
                            j((i14 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ12, sVar);
                            sVar.p(false);
                            break;
                        case 12:
                            sVar.d0(-1506025221);
                            boolean zH13 = sVar.h(dVar3);
                            Object objQ13 = sVar.Q();
                            if (zH13 || objQ13 == gVar) {
                                objQ13 = new m(dVar3, 2);
                                sVar.o0(objQ13);
                            }
                            r.a((i14 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ13, sVar);
                            sVar.p(false);
                            break;
                        case 13:
                            sVar.d0(-1506013317);
                            boolean zH14 = sVar.h(dVar3);
                            Object objQ14 = sVar.Q();
                            if (zH14 || objQ14 == gVar) {
                                objQ14 = new m(dVar3, 3);
                                sVar.o0(objQ14);
                            }
                            r.b((i14 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ14, sVar);
                            sVar.p(false);
                            break;
                        case 14:
                            sVar.d0(-1506001413);
                            boolean zH15 = sVar.h(dVar3);
                            Object objQ15 = sVar.Q();
                            if (zH15 || objQ15 == gVar) {
                                objQ15 = new m(dVar3, 4);
                                sVar.o0(objQ15);
                            }
                            r.c((i14 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ15, sVar);
                            sVar.p(false);
                            break;
                        default:
                            sVar.d0(550766971);
                            sVar.p(false);
                            break;
                    }
                    sVar.p(false);
                }
                sVar.p(false);
            }
            dVar2 = dVar3;
        } else {
            sVar.W();
            dVar2 = dVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.d(i11, dVar2, onClickFinish, onClickStartLearning, i12, 7);
        }
    }

    public static final void i(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar) {
        int i12;
        fz.c cVar;
        fz.c cVar2;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(40837264);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
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
            j0.d dVar = j0.i.f35305c;
            z1.h hVar5 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
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
            e0.c(f44103l, null, t1.e.d(125412698, new lt.g(onClickFinish, 17, (byte) 0), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(h1.v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
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
            float f5 = 16;
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_lesson10_1), j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30177j, sVar, 48, 0, 65532);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                cVar2 = playAudio;
                objQ = new o(cVar2, 0);
                sVar.o0(objQ);
            } else {
                cVar2 = playAudio;
            }
            cVar = playAudio;
            b("ㅂ", "b", false, (fz.a) objQ, t1.e.d(-661463311, new e6(cVar2, 20), sVar), t1.e.d(802174706, new e6(cVar2, 21), sVar), sVar, 221238, 4);
            boolean z12 = i13 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new o(cVar, 1);
                sVar.o0(objQ2);
            }
            b("ㅍ", "p", false, (fz.a) objQ2, t1.e.d(-507709478, new e6(cVar, 22), sVar), null, sVar, 24630, 36);
            boolean z13 = i13 == 256;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new o(cVar, 2);
                sVar.o0(objQ3);
            }
            b("ㅃ", "pp", false, (fz.a) objQ3, t1.e.d(-374122567, new e6(cVar, 23), sVar), null, sVar, 24630, 36);
            hh.p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, m, sVar, ((i12 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            cVar = playAudio;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, cVar, i11, 0);
        }
    }

    public static final void j(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar) {
        int i12;
        fz.c cVar;
        fz.c cVar2;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(365371538);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
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
            j0.d dVar = j0.i.f35305c;
            z1.h hVar5 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
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
            e0.c(f44104n, null, t1.e.d(449946972, new lt.g(onClickFinish, 18, (byte) 0), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(h1.v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
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
            float f5 = 16;
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_lesson11_1), j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30177j, sVar, 48, 0, 65532);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                cVar2 = playAudio;
                objQ = new o(cVar2, 10);
                sVar.o0(objQ);
            } else {
                cVar2 = playAudio;
            }
            cVar = playAudio;
            b("ㅈ", "j", false, (fz.a) objQ, t1.e.d(-336929037, new e6(cVar2, 24), sVar), t1.e.d(1126708980, new e6(cVar2, 25), sVar), sVar, 221238, 4);
            boolean z12 = i13 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new o(cVar, 11);
                sVar.o0(objQ2);
            }
            b("ㅊ", "ch", false, (fz.a) objQ2, t1.e.d(-183175204, new e6(cVar, 26), sVar), null, sVar, 24630, 36);
            boolean z13 = i13 == 256;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new o(cVar, 12);
                sVar.o0(objQ3);
            }
            b("ㅉ", "jj", false, (fz.a) objQ3, t1.e.d(-49588293, new e6(cVar, 27), sVar), null, sVar, 24630, 36);
            hh.p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, f44105o, sVar, ((i12 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            cVar = playAudio;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, cVar, i11, 1);
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
    public static final void k(fz.a onClickClose, fz.a onClickIntroduction, fz.a onClickLockedLesson, fz.e onClickPracticeWrite, fz.c loginNow, sv.j jVar, qv.e eVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar;
        sv.j jVar2;
        qv.e eVar2;
        qv.e eVar3;
        int i13;
        sv.j jVar3;
        j9.v vVar;
        j9.v vVar2;
        boolean z11;
        sv.j jVar4;
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(onClickIntroduction, "onClickIntroduction");
        kotlin.jvm.internal.m.f(onClickLockedLesson, "onClickLockedLesson");
        kotlin.jvm.internal.m.f(onClickPracticeWrite, "onClickPracticeWrite");
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1307813438);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(onClickClose) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(onClickIntroduction) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(onClickLockedLesson) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(onClickPracticeWrite) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(loginNow) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i14 = i12 | 589824;
        if (sVar2.T(i14 & 1, (599187 & i14) != 599186)) {
            sVar2.Y();
            if ((i11 & 1) == 0 || sVar2.C()) {
                sVar2.d0(-1614864554);
                LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                int i15 = LocalViewModelStoreOwner.$stable;
                ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(sVar2, i15);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(sv.j.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), null);
                sVar2.p(false);
                sv.j jVar5 = (sv.j) viewModelA;
                sVar2.d0(-1614864554);
                ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(sVar2, i15);
                if (current2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA2 = i20.b.a(kotlin.jvm.internal.z.a(qv.e.class), current2.getViewModelStore(), null, i20.a.a(current2), null, q10.b.a(sVar2), null);
                sVar2.p(false);
                eVar3 = (qv.e) viewModelA2;
                i13 = i14 & (-4128769);
                jVar3 = jVar5;
            } else {
                sVar2.W();
                eVar3 = eVar;
                i13 = i14 & (-4128769);
                jVar3 = jVar;
            }
            sVar2.q();
            b1 b1VarO = l1.t.o(jVar3.f51812c, sVar2);
            b1 b1VarO2 = l1.t.o(eVar3.f48434e, sVar2);
            sv.i iVar = (sv.i) b1VarO.getValue();
            if (kotlin.jvm.internal.m.a(iVar, sv.g.f51804a)) {
                sVar2.d0(-1616684403);
                tv.a.d(0, 1, sVar2, null);
                sVar2.p(false);
                jVar4 = jVar3;
                eVar3 = eVar3;
                sVar = sVar2;
            } else {
                if (!(iVar instanceof sv.h)) {
                    throw p.x(sVar2, -1616680603, false);
                }
                sVar2.d0(1422648020);
                j9.v vVarH = cf.x.H(new c0[0], sVar2);
                Object objQ = sVar2.Q();
                l1.g gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = l1.t.B(Boolean.FALSE);
                    sVar2.o0(objQ);
                }
                b1 b1Var = (b1) objQ;
                boolean zH = sVar2.h(iVar) | sVar2.h(vVarH);
                Object objQ2 = sVar2.Q();
                if (zH || objQ2 == gVar) {
                    objQ2 = new ad.y((sv.h) iVar, vVarH, b1Var, (vy.d) null, 24);
                    vVar = vVarH;
                    sVar2.o0(objQ2);
                } else {
                    vVar = vVarH;
                }
                l1.t.f((fz.e) objQ2, b0.f48488a, sVar2);
                boolean zH2 = ((i13 & 14) == 4) | sVar2.h(iVar) | sVar2.f(b1VarO2) | sVar2.h(eVar3) | ((i13 & 112) == 32) | ((i13 & 896) == 256) | sVar2.h(jVar3) | sVar2.h(vVar) | ((57344 & i13) == 16384) | ((i13 & 7168) == 2048);
                Object objQ3 = sVar2.Q();
                if (zH2 || objQ3 == gVar) {
                    vVar2 = vVar;
                    sv.j jVar6 = jVar3;
                    z11 = false;
                    g0 g0Var = new g0((sv.h) iVar, eVar3, onClickClose, onClickIntroduction, onClickLockedLesson, jVar6, vVar2, b1Var, b1VarO2, loginNow, onClickPracticeWrite);
                    jVar4 = jVar6;
                    sVar2.o0(g0Var);
                    objQ3 = g0Var;
                } else {
                    jVar4 = jVar3;
                    vVar2 = vVar;
                    z11 = false;
                }
                sVar = sVar2;
                com.bumptech.glide.e.c(vVar2, "syllable_index", null, null, null, null, null, null, (fz.c) objQ3, sVar, 48);
                sVar.p(z11);
            }
            eVar2 = eVar3;
            jVar2 = jVar4;
        } else {
            sVar = sVar2;
            sVar.W();
            jVar2 = jVar;
            eVar2 = eVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new mt.e(onClickClose, onClickIntroduction, onClickLockedLesson, onClickPracticeWrite, loginNow, jVar2, eVar2, i11);
        }
    }

    public static final void l(int i11, fz.a playAudio, String str, String str2, l1.n nVar, z1.r rVar) {
        int i12;
        l1.s sVar;
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(287068119);
        if ((i11 & 48) == 0) {
            i12 = (sVar2.f(rVar) ? 32 : 16) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.f(str2) ? 256 : 128;
        }
        int i13 = i12 | (sVar2.h(playAudio) ? 2048 : 1024);
        if (sVar2.T(i13 & 1, (i13 & 1171) != 1170)) {
            boolean z11 = (i13 & 7168) == 2048;
            Object objQ = sVar2.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new d(4, playAudio);
                sVar2.o0(objQ);
            }
            sVar = sVar2;
            iu.k.l((fz.a) objQ, rVar, false, CropImageView.DEFAULT_ASPECT_RATIO, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, d0.n.a(f0.e(4292007898L), 1), t1.e.d(-850379111, new o0(str, str2, 1), sVar2), sVar, (i13 & 112) | 905969664, 252);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a(str, rVar, str2, playAudio, i11);
        }
    }

    public static final void m(ArrayList arrayList, String str, fz.a onClickLockedLesson, fz.c onClickLesson, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(onClickLockedLesson, "onClickLockedLesson");
        kotlin.jvm.internal.m.f(onClickLesson, "onClickLesson");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(405183778);
        int i12 = i11 | (sVar.h(arrayList) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.h(onClickLockedLesson) ? 256 : 128) | (sVar.h(onClickLesson) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            float f5 = 16;
            j0.g gVarG = j0.i.g(f5);
            v1 v1Var = new v1(f5, f5, f5, f5);
            z1.r rVarD = e2.d(z1.o.f58481a, 1.0f);
            boolean zH = sVar.h(arrayList) | ((i12 & 112) == 32) | ((i12 & 896) == 256) | ((i12 & 7168) == 2048);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                e eVar = new e(arrayList, str, onClickLockedLesson, onClickLesson, 0);
                sVar.o0(eVar);
                objQ = eVar;
            }
            ue.f.a(rVarD, null, v1Var, gVarG, null, null, false, null, (fz.c) objQ, sVar, 24966, 490);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.t(arrayList, str, onClickLockedLesson, onClickLesson, i11, 29);
        }
    }

    public static final void n(int i11, fz.a onClick, String str, String explain, l1.n nVar, z1.r rVar) {
        z1.r rVar2;
        kotlin.jvm.internal.m.f(explain, "explain");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1393819885);
        int i12 = i11 | (sVar.f(explain) ? 32 : 16) | 384 | (sVar.h(onClick) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            a2 a2VarA = z1.a(j0.i.g(12), z1.c.M, sVar, 54);
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
            k7.k(e2.n(oVar, 72), null, null, null, null, t1.e.d(1817604037, new dl.h(onClick, str, 2), sVar), sVar, 196614, 30);
            ua.b(explain, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30178k, sVar, (i12 >> 3) & 14, 0, 65534);
            sVar = sVar;
            sVar.p(true);
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t0(i11, 1, onClick, str, explain, rVar2);
        }
    }

    public static final void o(String str, String translation, boolean z11, z1.r rVar, fz.a playAudio, l1.n nVar, int i11) {
        z1.r rVar2;
        kotlin.jvm.internal.m.f(translation, "translation");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1365739246);
        int i12 = i11 | (sVar.f(translation) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | 3072 | (sVar.h(playAudio) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i12 & 1, (i12 & 9363) != 9362)) {
            int i13 = i12 & 57344;
            boolean z12 = i13 == 16384;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z12 || objQ == gVar) {
                objQ = new d(5, playAudio);
                sVar.o0(objQ);
            }
            z1.o oVar = z1.o.f58481a;
            z1.r rVarQ = iu.k.q(6, 7, (fz.a) objQ, sVar, oVar, false);
            float f5 = 4;
            j0.u uVarA = j0.t.a(j0.i.g(f5), z1.c.P, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarQ);
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
            a2 a2VarA = z1.a(j0.i.g(f5), z1.c.M, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
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
            z1.r rVarN = e2.n(oVar, 24);
            long j11 = ((s1) sVar.j(h1.v1.f31180a)).f31017a;
            boolean z13 = i13 == 16384;
            Object objQ2 = sVar.Q();
            if (z13 || objQ2 == gVar) {
                objQ2 = new d(6, playAudio);
                sVar.o0(objQ2);
            }
            dt.a0.a(z11, rVarN, j11, (fz.a) objQ2, sVar, ((i12 >> 6) & 14) | 48, 0);
            c3 c3Var = fc.f30256a;
            ua.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 6, 0, 65534);
            sVar.p(true);
            ua.b(translation, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, (i12 >> 3) & 14, 0, 65534);
            sVar = sVar;
            sVar.p(true);
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iv.v0(str, translation, z11, rVar2, playAudio, i11, 1);
        }
    }

    public static final void a(SyllableLessonStatus syllableLessonStatus, final String lessonName, final String description, final boolean z11, final boolean z12, final boolean z13, z1.r rVar, fz.a onClickLocked, fz.a onClick, l1.n nVar, int i11) {
        l1.s sVar;
        long jE;
        int i12;
        kotlin.jvm.internal.m.f(syllableLessonStatus, kHfjNGauVgdF.rYRixridxuXlACb);
        kotlin.jvm.internal.m.f(lessonName, "lessonName");
        kotlin.jvm.internal.m.f(description, "description");
        kotlin.jvm.internal.m.f(onClickLocked, "onClickLocked");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(683242810);
        int i13 = (sVar2.d(syllableLessonStatus.ordinal()) ? 4 : 2) | i11 | (sVar2.f(lessonName) ? 32 : 16) | (sVar2.f(description) ? 256 : 128);
        if ((i11 & 3072) == 0) {
            i13 |= sVar2.g(z11) ? 2048 : 1024;
        }
        int i14 = i13 | (sVar2.g(z12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(onClickLocked) ? 8388608 : 4194304) | (sVar2.h(onClick) ? 67108864 : 33554432);
        if (sVar2.T(i14 & 1, (38347923 & i14) != 38347922)) {
            boolean z14 = syllableLessonStatus == SyllableLessonStatus.LOCKED;
            int[] iArr = l.f44157b;
            if (iArr[syllableLessonStatus.ordinal()] == 1) {
                sVar2.d0(-533642389);
                sVar2.p(false);
                jE = f0.e(4293454056L);
            } else {
                sVar2.d0(-533640479);
                jE = ((s1) sVar2.j(h1.v1.f31180a)).f31017a;
                sVar2.p(false);
            }
            long jE2 = iArr[syllableLessonStatus.ordinal()] == 1 ? f0.e(4290098613L) : g2.x.f28618e;
            int i15 = iArr[syllableLessonStatus.ordinal()];
            if (i15 == 1) {
                i12 = R.drawable.ic_lesson_index_lesson_start_grey;
            } else if (i15 == 2) {
                i12 = R.drawable.ic_lesson_index_lesson_start;
            } else {
                if (i15 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = R.drawable.ic_lesson_index_lesson_redo;
            }
            h1.t0 t0VarO = k7.o(sVar2);
            if (z14 != 0) {
                long j11 = t0VarO.f31086c;
                long j12 = t0VarO.f31087d;
                t0VarO = t0VarO.a(j11, j12, j11, j12);
            }
            h1.t0 t0Var = t0VarO;
            float f5 = 10;
            z1.r rVarB = d2.h.b(rVar, r0.f.d(f5));
            r0.e eVarD = r0.f.d(f5);
            boolean z15 = z14;
            boolean zG = sVar2.g(z15) | ((29360128 & i14) == 8388608) | ((i14 & 234881024) == 67108864);
            Object objQ = sVar2.Q();
            if (zG || objQ == l1.m.f39353a) {
                objQ = new gr.w(z15, onClickLocked, onClick, 4);
                sVar2.o0(objQ);
            }
            final long j13 = jE;
            final int i16 = i12;
            final long j14 = jE2;
            sVar = sVar2;
            k7.c((fz.a) objQ, rVarB, false, eVarD, t0Var, null, null, t1.e.d(779703845, new fz.f() { // from class: nv.f
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v10 */
                /* JADX WARN: Type inference failed for: r6v8 */
                /* JADX WARN: Type inference failed for: r6v9, types: [boolean, int] */
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ?? r9;
                    boolean z16;
                    l1.s sVar3;
                    j0.v Card = (j0.v) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(Card, "$this$Card");
                    l1.s sVar4 = (l1.s) nVar2;
                    if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        z1.j jVar = z1.c.f58463a;
                        q0 q0VarD = j0.o.d(jVar, false);
                        int iHashCode = Long.hashCode(sVar4.T);
                        q1 q1VarL = sVar4.l();
                        z1.o oVar = z1.o.f58481a;
                        z1.r rVarC = z1.a.c(sVar4, oVar);
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
                        float f11 = 14;
                        z1.r rVarB2 = j0.c.B(e2.i(oVar, 68, CropImageView.DEFAULT_ASPECT_RATIO, 2), f11, 8);
                        a2 a2VarA = z1.a(j0.i.g(f11), z1.c.M, sVar4, 54);
                        int iHashCode2 = Long.hashCode(sVar4.T);
                        q1 q1VarL2 = sVar4.l();
                        z1.r rVarC2 = z1.a.c(sVar4, rVarB2);
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
                        r0.e eVar = r0.f.f48733a;
                        long j15 = j13;
                        z1.r rVarN = e2.n(d0.n.h(oVar, j15, eVar), 36);
                        q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
                        int iHashCode3 = Long.hashCode(sVar4.T);
                        q1 q1VarL3 = sVar4.l();
                        z1.r rVarC3 = z1.a.c(sVar4, rVarN);
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
                        boolean z17 = z11;
                        long j16 = j14;
                        if (z17) {
                            sVar4.d0(2042440162);
                            r4.b(se.k.y(R.drawable.syllable_test_icon, sVar4, 0), null, null, j16, sVar4, 48, 4);
                            sVar4.p(false);
                        } else {
                            sVar4.d0(2042717333);
                            iu.k.c(lessonName, null, y0.a((y0) sVar4.j(ua.f31167a), j16, j3.A(18), n3.s.N, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 1, 0, new s0.g(j3.A(10), j3.A(18), j3.A(1)), sVar4, 1572864, 186);
                            sVar4 = sVar4;
                            sVar4.p(false);
                        }
                        sVar4.p(true);
                        y0 y0Var = ((dc) sVar4.j(fc.f30256a)).f30177j;
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        l1.s sVar5 = sVar4;
                        ua.b(description, new i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var, sVar5, 0, 0, 65532);
                        l1.s sVar6 = sVar5;
                        if (z13) {
                            sVar6.d0(2027844873);
                            r9 = 0;
                            r4.b(se.k.y(i16, sVar6, 0), null, null, j15, sVar6, 48, 4);
                        } else {
                            r9 = 0;
                            sVar6.d0(2002322759);
                        }
                        sVar6.p(r9);
                        sVar6.p(true);
                        if (z12) {
                            sVar6.d0(-799691522);
                            d0.n.c(se.k.y(R.drawable.ic_learn_lesson_open_tag, sVar6, r9), null, e2.n(j0.c.E(j0.r.f35391a.a(oVar, jVar), 42, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 16), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar6, 48, 120);
                            sVar3 = sVar6;
                            z16 = 0;
                        } else {
                            z16 = r9;
                            sVar6.d0(-825478717);
                            sVar3 = sVar6;
                        }
                        sVar3.p(z16);
                        sVar3.p(true);
                    } else {
                        sVar4.W();
                    }
                    return b0.f48488a;
                }
            }, sVar2), sVar, 100663296, 228);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new et.v(syllableLessonStatus, lessonName, description, z11, z12, z13, rVar, onClickLocked, onClick, i11);
        }
    }
}
