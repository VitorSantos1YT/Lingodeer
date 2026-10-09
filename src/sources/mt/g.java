package mt;

import am.rVFB.LwKl;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.CourseACK;
import com.lingodeer.data.model.CoursePracticeType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.bc;
import h1.dc;
import h1.e8;
import h1.fa;
import h1.fc;
import h1.h7;
import h1.i7;
import h1.i9;
import h1.k7;
import h1.ua;
import h1.w7;
import h1.y7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import rt.je;
import rt.ke;
import rt.le;
import rt.me;
import rt.oe;
import rt.te;
import rt.x8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static final t1.d C0;
    public static final t1.d D0;
    public static final t1.d E0;
    public static final t1.d F0;
    public static final t1.d G0;
    public static final t1.d H0;
    public static final t1.d I0;
    public static final t1.d J0;
    public static final t1.d K0;
    public static final t1.d L0;
    public static final t1.d M0;
    public static final t1.d N0;
    public static final t1.d O0;
    public static final t1.d P0;
    public static final t1.d Q0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f41417a = new t1.d(new lt.a(4), false, -306369752);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f41419b = new t1.d(new lt.a(5), false, 29150706);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.d f41421c = new t1.d(new lt.a(6), false, 144027812);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.d f41423d = new t1.d(new lt.a(7), false, 1983959357);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t1.d f41425e = new t1.d(new lt.a(8), false, -1662415169);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t1.d f41427f = new t1.d(new k9.q(14), false, 1615803652);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t1.d f41429g = new t1.d(new k9.q(15), false, 106186325);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t1.d f41431h = new t1.d(new k9.q(16), false, 1246703450);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t1.d f41433i = new t1.d(new k9.q(17), false, 1679783668);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t1.d f41435j = new t1.d(new k9.q(18), false, 868140692);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t1.d f41437k = new t1.d(new k9.q(21), false, 871706759);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t1.d f41439l = new t1.d(new lt.a(11), false, -1062870544);
    public static final t1.d m = new t1.d(new lt.a(12), false, -1174778766);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final t1.d f41442n = new t1.d(new k9.q(22), false, 1391878967);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final t1.d f41444o = new t1.d(new k9.q(23), false, -811558792);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t1.d f41446p = new t1.d(new k9.q(24), false, -1356375576);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final t1.d f41448q = new t1.d(new k9.q(25), false, 1163514096);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final t1.d f41450r = new t1.d(new k9.q(19), false, -1146000985);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final t1.d f41452s = new t1.d(new lt.a(9), false, -251188029);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final t1.d f41454t = new t1.d(new lt.a(10), false, -972107451);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final t1.d f41456u = new t1.d(new k9.q(20), false, -1090521637);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final t1.d f41458v = new t1.d(new k9.q(26), false, 748616746);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final t1.d f41460w = new t1.d(new k9.q(29), false, 958196823);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final t1.d f41462x = new t1.d(new h(0), false, 2035765376);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final t1.d f41464y = new t1.d(new lt.a(17), false, 541919840);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final t1.d f41466z = new t1.d(new lt.a(18), false, 1977385228);
    public static final t1.d A = new t1.d(new lt.a(19), false, 1441471178);
    public static final t1.d B = new t1.d(new h(1), false, 1894588069);
    public static final t1.d C = new t1.d(new lt.a(13), false, 1419401165);
    public static final t1.d D = new t1.d(new lt.a(14), false, -244407193);
    public static final t1.d E = new t1.d(new k9.q(27), false, 1336604006);
    public static final t1.d F = new t1.d(new lt.a(15), false, 861417102);
    public static final t1.d G = new t1.d(new lt.a(16), false, 325503052);
    public static final t1.d H = new t1.d(new k9.q(28), false, 778619943);
    public static final t1.d I = new t1.d(new h(2), false, 1110316400);
    public static final t1.d J = new t1.d(new lt.a(20), false, 1507472469);
    public static final t1.d K = new t1.d(new lt.a(21), false, 1080691249);
    public static final t1.d L = new t1.d(new lt.a(22), false, 358980122);
    public static final t1.d M = new t1.d(new h(3), false, -376713682);
    public static final t1.d N = new t1.d(new h(4), false, 824471831);
    public static final t1.d O = new t1.d(new lt.a(23), false, 508146205);
    public static final t1.d P = new t1.d(new lt.a(24), false, 1118446598);
    public static final t1.d Q = new t1.d(new lt.a(25), false, -1174005251);
    public static final t1.d R = new t1.d(new lt.a(26), false, -506623361);
    public static final t1.d S = new t1.d(new h(5), false, 1408151620);
    public static final t1.d T = new t1.d(new h(6), false, -1736115961);
    public static final t1.d U = new t1.d(new h(7), false, 1318764478);
    public static final t1.d V = new t1.d(new lt.a(27), false, -598281398);
    public static final t1.d W = new t1.d(new lt.a(28), false, 1000867660);
    public static final t1.d X = new t1.d(new h(8), false, -1413012015);
    public static final t1.d Y = new t1.d(new h(9), false, 1019651011);
    public static final t1.d Z = new t1.d(new lt.a(29), false, 165217576);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final t1.d f41418a0 = new t1.d(new i(0), false, 1260804998);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final t1.d f41420b0 = new t1.d(new i(1), false, 2036490013);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final t1.d f41422c0 = new t1.d(new i(2), false, 1336407558);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final t1.d f41424d0 = new t1.d(new i(3), false, 2046675521);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final t1.d f41426e0 = new t1.d(new h(10), false, 547090900);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final t1.d f41428f0 = new t1.d(new h(11), false, 898027881);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final t1.d f41430g0 = new t1.d(new h(12), false, 626691128);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final t1.d f41432h0 = new t1.d(new h(13), false, -1475762375);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final t1.d f41434i0 = new t1.d(new h(14), false, 1532043095);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final t1.d f41436j0 = new t1.d(new i(4), false, -163036057);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final t1.d f41438k0 = new t1.d(new h(15), false, -1147661339);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final t1.d f41440l0 = new t1.d(new h(16), false, 127920407);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final t1.d f41441m0 = new t1.d(new h(17), false, -677263022);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final t1.d f41443n0 = new t1.d(new h(18), false, -1589728192);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final t1.d f41445o0 = new t1.d(new h(19), false, 2018077115);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final t1.d f41447p0 = new t1.d(new i(5), false, -171615333);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final t1.d f41449q0 = new t1.d(new i(6), false, 1246738050);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final t1.d f41451r0 = new t1.d(new i(7), false, -1767553211);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final t1.d f41453s0 = new t1.d(new i(8), false, -422595221);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final t1.d f41455t0 = new t1.d(new i(9), false, 1501916893);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final t1.d f41457u0 = new t1.d(new i(10), false, -1651644136);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final t1.d f41459v0 = new t1.d(new i(11), false, -1188307114);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final t1.d f41461w0 = new t1.d(new h(21), false, -2110887311);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final t1.d f41463x0 = new t1.d(new h(22), false, -1879218800);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final t1.d f41465y0 = new t1.d(new h(23), false, -827541800);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final t1.d f41467z0 = new t1.d(new i(12), false, 194470976);
    public static final t1.d A0 = new t1.d(new h(24), false, 1094894880);
    public static final t1.d B0 = new t1.d(new i(13), false, 722627212);

    static {
        new t1.d(new h(20), false, 1583213181);
        C0 = new t1.d(new h(25), false, 1929146059);
        D0 = new t1.d(new h(26), false, 1373265012);
        E0 = new t1.d(new h(27), false, -1614054820);
        F0 = new t1.d(new i(14), false, -1376945057);
        G0 = new t1.d(new i(16), false, -363281942);
        H0 = new t1.d(new k(0, (byte) 0), false, -1530654889);
        I0 = new t1.d(new i(17), false, 2038412138);
        J0 = new t1.d(new i(18), false, -1926477476);
        K0 = new t1.d(new k(1, (byte) 0), false, 1987817320);
        L0 = new t1.d(new i(19), false, -1215584697);
        M0 = new t1.d(new i(20), false, 439795625);
        N0 = new t1.d(new i(21), false, -1180002447);
        O0 = new t1.d(new i(22), false, 898983630);
        P0 = new t1.d(new i(23), false, 651015436);
        Q0 = new t1.d(new k(2, (byte) 0), false, -285729753);
    }

    public static final void A(fz.a onDismiss, fz.a onConfirm, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(onDismiss, "onDismiss");
        kotlin.jvm.internal.m.f(onConfirm, "onConfirm");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1820403585);
        int i12 = i11 | (sVar2.h(onConfirm) ? 32 : 16);
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            sVar = sVar2;
            h1.a6.a(onDismiss, null, h1.a6.f(6, 2, null, sVar2), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-1112130940, new ch.e(2, onConfirm, onDismiss), sVar2), sVar, 6, 384, 4090);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.n1(i11, 5, onDismiss, onConfirm);
        }
    }

    public static final void B(int i11, int i12, fz.a aVar, fz.a aVar2, l1.n nVar) {
        fz.a aVar3;
        int i13;
        fz.a aVar4;
        int i14;
        fz.a aVar5;
        fz.a aVar6;
        fz.a aVar7;
        fz.a aVar8;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1085049750);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
            aVar3 = aVar;
        } else {
            aVar3 = aVar;
            i13 = i11 | (sVar.h(aVar3) ? 4 : 2);
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i14 = i13 | 48;
            aVar4 = aVar2;
        } else {
            aVar4 = aVar2;
            i14 = i13 | (sVar.h(aVar4) ? 32 : 16);
        }
        int i17 = i14;
        if (sVar.T(i17 & 1, (i17 & 19) != 18)) {
            l1.g gVar = l1.m.f39353a;
            if (i15 != 0) {
                Object objQ = sVar.Q();
                if (objQ == gVar) {
                    objQ = new ju.d(25);
                    sVar.o0(objQ);
                }
                aVar7 = (fz.a) objQ;
            } else {
                aVar7 = aVar3;
            }
            if (i16 != 0) {
                Object objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = new ju.d(25);
                    sVar.o0(objQ2);
                }
                aVar8 = (fz.a) objQ2;
            } else {
                aVar8 = aVar4;
            }
            z1.h hVar = z1.c.P;
            float f5 = 16;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarA = j0.c.A(oVar, f5);
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
            d0.n.c(se.k.y(R.drawable.ic_testout_intro_deer, sVar, 0), null, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
            String strE0 = ub.a.e0(sVar, R.string.enable_smart_review_notification_title);
            l1.c3 c3Var = fc.f30256a;
            ua.b(strE0, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30174g, sVar, 48, 0, 65020);
            String strE1 = ub.a.e0(sVar, R.string.enable_srs_notification_content);
            j3.y0 y0Var = ((dc) sVar.j(c3Var)).f30178k;
            float f11 = 8;
            ua.b(strE1, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, y0Var, sVar, 48, 0, 65020);
            sVar = sVar;
            fz.a aVar9 = aVar7;
            iu.k.e(aVar9, j0.e2.e(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 22, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), false, 0L, null, f41453s0, sVar, (i17 & 14) | 196656, 28);
            aVar5 = aVar9;
            j0.c.g(sVar, j0.e2.g(oVar, f11));
            aVar6 = aVar8;
            k7.m(aVar6, j0.e2.e(oVar, 1.0f), false, null, null, null, f41455t0, sVar, ((i17 >> 3) & 14) | 805306416, 508);
            sVar.p(true);
        } else {
            sVar.W();
            aVar5 = aVar3;
            aVar6 = aVar4;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m0(i11, i12, aVar5, aVar6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x028f  */
    /* JADX WARN: Code duplicated, block: B:172:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:175:0x0359  */
    /* JADX WARN: Code duplicated, block: B:176:0x035b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0373  */
    /* JADX WARN: Code duplicated, block: B:180:0x0376  */
    /* JADX WARN: Code duplicated, block: B:183:0x0387 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:186:0x038d  */
    public static final void C(final int i11, final int i12, final int i13, final int i14, final int i15, final float f5, final boolean z11, final fz.a onDismissRequest, final fz.j onSettingChange, l1.n nVar, final int i16) {
        int i17;
        l1.s sVar;
        boolean z12;
        String[] strArrD;
        String[] strArr;
        final int length;
        int iIntValue;
        boolean z13;
        boolean zG;
        Object objQ;
        boolean z14;
        boolean z15;
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        kotlin.jvm.internal.m.f(onSettingChange, "onSettingChange");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1514147615);
        if ((i16 & 6) == 0) {
            i17 = (sVar2.d(i11) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= sVar2.d(i12) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i17 |= sVar2.d(i13) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= sVar2.d(i14) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i17 |= sVar2.d(i15) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i16) == 0) {
            i17 |= sVar2.c(f5) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i16) == 0) {
            i17 |= sVar2.g(z11) ? 1048576 : 524288;
        }
        if ((12582912 & i16) == 0) {
            i17 |= sVar2.h(onDismissRequest) ? 8388608 : 4194304;
        }
        if ((100663296 & i16) == 0) {
            i17 |= sVar2.h(onSettingChange) ? 67108864 : 33554432;
        }
        if (sVar2.T(i17 & 1, (38347923 & i17) != 38347922)) {
            boolean z16 = (i17 & 14) == 4;
            Object objQ2 = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (z16 || objQ2 == gVar) {
                objQ2 = ep.a.r(i11, sVar2);
            }
            final l1.b1 b1Var = (l1.b1) objQ2;
            boolean z17 = (i17 & 112) == 32;
            Object objQ3 = sVar2.Q();
            if (z17 || objQ3 == gVar) {
                objQ3 = ep.a.r(i12, sVar2);
            }
            final l1.b1 b1Var2 = (l1.b1) objQ3;
            boolean z18 = (i17 & 896) == 256;
            Object objQ4 = sVar2.Q();
            if (z18 || objQ4 == gVar) {
                objQ4 = ep.a.r(i13, sVar2);
            }
            final l1.b1 b1Var3 = (l1.b1) objQ4;
            boolean z19 = (i17 & 7168) == 2048;
            Object objQ5 = sVar2.Q();
            if (z19 || objQ5 == gVar) {
                objQ5 = ep.a.r(i14, sVar2);
            }
            final l1.b1 b1Var4 = (l1.b1) objQ5;
            boolean z20 = (57344 & i17) == 16384;
            Object objQ6 = sVar2.Q();
            if (z20 || objQ6 == gVar) {
                objQ6 = ep.a.r(i15, sVar2);
            }
            final l1.b1 b1Var5 = (l1.b1) objQ6;
            boolean z21 = (458752 & i17) == 131072;
            Object objQ7 = sVar2.Q();
            if (z21 || objQ7 == gVar) {
                objQ7 = l1.t.B(Float.valueOf(hz.b.k(f5, 0.1f, 1.0f)));
                sVar2.o0(objQ7);
            }
            final l1.b1 b1Var6 = (l1.b1) objQ7;
            boolean z22 = (3670016 & i17) == 1048576;
            Object objQ8 = sVar2.Q();
            if (z22 || objQ8 == gVar) {
                objQ8 = ep.a.s(z11, sVar2);
            }
            final l1.b1 b1Var7 = (l1.b1) objQ8;
            Object objQ9 = sVar2.Q();
            if (objQ9 == gVar) {
                objQ9 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ9);
            }
            final l1.b1 b1Var8 = (l1.b1) objQ9;
            Object objQ10 = sVar2.Q();
            if (objQ10 == gVar) {
                objQ10 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ10);
            }
            final l1.b1 b1Var9 = (l1.b1) objQ10;
            Object objQ11 = sVar2.Q();
            if (objQ11 == gVar) {
                objQ11 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ11);
            }
            final l1.b1 b1Var10 = (l1.b1) objQ11;
            l1.c3 c3Var = ju.f.f37370d;
            int iIntValue2 = ((Number) sVar2.j(c3Var)).intValue();
            e8 e8VarF = h1.a6.f(6, 2, null, sVar2);
            if (iIntValue2 != 0) {
                if (iIntValue2 != 1) {
                    if (iIntValue2 != 2) {
                        if (iIntValue2 == 51 || iIntValue2 == 55) {
                            iIntValue2 = iIntValue2;
                            strArrD = hh.p0.D(sVar2, -897995226, R.array.ara_display_item, sVar2, false);
                        } else if (iIntValue2 == 57) {
                            iIntValue2 = iIntValue2;
                            strArrD = hh.p0.D(sVar2, -897985849, R.array.thai_display_item, sVar2, false);
                        } else if (iIntValue2 == 61) {
                            iIntValue2 = iIntValue2;
                            strArrD = hh.p0.D(sVar2, -897992088, R.array.hindi_display_item, sVar2, false);
                        } else if (iIntValue2 != 65) {
                            switch (iIntValue2) {
                                case 11:
                                    z12 = false;
                                    break;
                                case 12:
                                    z14 = false;
                                    break;
                                case 13:
                                    z15 = false;
                                    break;
                                default:
                                    sVar2.d0(-897983061);
                                    sVar2.p(false);
                                    strArrD = new String[0];
                                    iIntValue2 = iIntValue2;
                                    break;
                            }
                        } else {
                            iIntValue2 = iIntValue2;
                            strArrD = hh.p0.D(sVar2, -897988954, R.array.grk_display_item, sVar2, false);
                        }
                        final String[] strArr2 = strArrD;
                        if (((fr.o0) xt.b.c()).f27733a.enableNativeSpeakerVideos || !xt.d.g(iIntValue2)) {
                            sVar2.d0(-2067162217);
                            strArr = new String[]{oz.x.q0(oz.x.q0(tv.a.l(tv.a.n(((Number) sVar2.j(c3Var)).intValue()), sVar2), " 1", BuildConfig.VERSION_NAME), " 2", BuildConfig.VERSION_NAME), ub.a.e0(sVar2, R.string.translation), ub.a.e0(sVar2, R.string.audio), ub.a.e0(sVar2, R.string.mixed)};
                            sVar2.p(false);
                        } else {
                            sVar2.d0(-2067508053);
                            strArr = new String[]{oz.x.q0(oz.x.q0(tv.a.l(tv.a.n(((Number) sVar2.j(c3Var)).intValue()), sVar2), " 1", BuildConfig.VERSION_NAME), " 2", BuildConfig.VERSION_NAME), ub.a.e0(sVar2, R.string.translation), ub.a.e0(sVar2, R.string.audio), ub.a.e0(sVar2, R.string.video), ub.a.e0(sVar2, R.string.mixed)};
                            sVar2.p(false);
                        }
                        final String[] strArr3 = {ub.a.e0(sVar2, R.string.off), ub.a.e0(sVar2, R.string.before_answer), ub.a.e0(sVar2, R.string.after_answer)};
                        length = strArr.length - 1;
                        if (((Number) b1Var4.getValue()).intValue() == -1) {
                            iIntValue = length;
                        } else {
                            iIntValue = ((Number) b1Var4.getValue()).intValue();
                        }
                        if (((Number) b1Var4.getValue()).intValue() == -1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z13);
                        zG = sVar2.g(z13);
                        objQ = sVar2.Q();
                        if (zG || objQ == gVar) {
                            objQ = new g.m(2, b1Var9, null, z13);
                            sVar2.o0(objQ);
                        }
                        l1.t.f((fz.e) objQ, boolValueOf, sVar2);
                        final int i18 = iIntValue;
                        final boolean z23 = z13;
                        final int i19 = iIntValue2;
                        final String[] strArr4 = strArr;
                        sVar = sVar2;
                        h1.a6.a(onDismissRequest, null, e8VarF, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-862581764, new fz.f() { // from class: mt.n3
                            /* JADX WARN: Code duplicated, block: B:104:0x0558  */
                            /* JADX WARN: Code duplicated, block: B:107:0x05ed  */
                            /* JADX WARN: Code duplicated, block: B:108:0x05f1  */
                            /* JADX WARN: Code duplicated, block: B:111:0x05fe  */
                            /* JADX WARN: Code duplicated, block: B:113:0x060c  */
                            /* JADX WARN: Code duplicated, block: B:116:0x064f  */
                            /* JADX WARN: Code duplicated, block: B:119:0x0654  */
                            /* JADX WARN: Code duplicated, block: B:120:0x065d  */
                            /* JADX WARN: Code duplicated, block: B:124:0x0690  */
                            /* JADX WARN: Code duplicated, block: B:125:0x0692  */
                            /* JADX WARN: Code duplicated, block: B:128:0x073c A[ADDED_TO_REGION] */
                            /* JADX WARN: Code duplicated, block: B:131:0x0746  */
                            /* JADX WARN: Code duplicated, block: B:134:0x0773  */
                            /* JADX WARN: Code duplicated, block: B:135:0x0775  */
                            /* JADX WARN: Code duplicated, block: B:138:0x0846  */
                            /* JADX WARN: Code duplicated, block: B:140:0x084a  */
                            /* JADX WARN: Code duplicated, block: B:89:0x04c8  */
                            /* JADX WARN: Code duplicated, block: B:91:0x04d2  */
                            /* JADX WARN: Code duplicated, block: B:94:0x04e4  */
                            /* JADX WARN: Code duplicated, block: B:97:0x04f7  */
                            /* JADX WARN: Code duplicated, block: B:99:0x04fc  */
                            @Override // fz.f
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                l1.b1 b1Var11;
                                l1.b1 b1Var12;
                                final fz.j jVar;
                                final l1.b1 b1Var13;
                                final l1.b1 b1Var14;
                                final l1.b1 b1Var15;
                                final l1.b1 b1Var16;
                                l1.b1 b1Var17;
                                l1.b1 b1Var18;
                                final l1.b1 b1Var19;
                                l1.b1 b1Var20;
                                l1.b1 b1Var21;
                                l1.b1 b1Var22;
                                fz.j jVar2;
                                boolean z24;
                                l1.b1 b1Var23;
                                fz.j jVar3;
                                l1.g gVar2;
                                final fz.j jVar4;
                                l1.b1 b1Var24;
                                l1.b1 b1Var25;
                                l1.b1 b1Var26;
                                int iHashCode;
                                y2.i iVar;
                                l1.g gVar3;
                                z1.o oVar;
                                y2.h hVar;
                                y2.h hVar2;
                                l1.s sVar3;
                                y2.i iVar2;
                                fz.j jVar5;
                                l1.b1 b1Var27;
                                final l1.b1 b1Var28;
                                l1.b1 b1Var29;
                                l1.b1 b1Var30;
                                final l1.b1 b1Var31;
                                int iHashCode2;
                                boolean zF;
                                Object objQ12;
                                l1.g gVar4;
                                l1.b1 b1Var32;
                                fz.j jVar6;
                                l1.b1 b1Var33;
                                l1.b1 b1Var34;
                                l1.b1 b1Var35;
                                boolean z25;
                                fz.j jVar7;
                                l1.b1 b1Var36;
                                l1.b1 b1Var37;
                                boolean zF2;
                                Object objQ13;
                                fz.j jVar8;
                                l1.b1 b1Var38;
                                l1.b1 b1Var39;
                                boolean z26;
                                final l1.b1 b1Var40;
                                final fz.j jVar9;
                                final l1.b1 b1Var41;
                                boolean zF3;
                                Object objQ14;
                                j0.v ModalBottomSheet = (j0.v) obj;
                                l1.n nVar2 = (l1.n) obj2;
                                int iIntValue3 = ((Integer) obj3).intValue();
                                kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                                l1.s sVar4 = (l1.s) nVar2;
                                if (sVar4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    z1.o oVar2 = z1.o.f58481a;
                                    z1.r rVarC = j0.e2.c(j0.e2.e(oVar2, 1.0f), 0.7f);
                                    j0.d dVar = j0.i.f35305c;
                                    z1.h hVar3 = z1.c.O;
                                    j0.u uVarA = j0.t.a(dVar, hVar3, sVar4, 0);
                                    int iHashCode3 = Long.hashCode(sVar4.T);
                                    l1.q1 q1VarL = sVar4.l();
                                    z1.r rVarC2 = z1.a.c(sVar4, rVarC);
                                    y2.k.J.getClass();
                                    y2.i iVar3 = y2.j.f56913b;
                                    sVar4.h0();
                                    if (sVar4.S) {
                                        sVar4.k(iVar3);
                                    } else {
                                        sVar4.r0();
                                    }
                                    y2.h hVar4 = y2.j.f56917f;
                                    l1.t.J(hVar4, uVarA, sVar4);
                                    y2.h hVar5 = y2.j.f56916e;
                                    l1.t.J(hVar5, q1VarL, sVar4);
                                    y2.h hVar6 = y2.j.f56918g;
                                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                                        defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar6);
                                    }
                                    y2.h hVar7 = y2.j.f56915d;
                                    l1.t.J(hVar7, rVarC2, sVar4);
                                    String strE0 = ub.a.e0(sVar4, R.string.settings);
                                    Object objQ15 = sVar4.Q();
                                    l1.g gVar5 = l1.m.f39353a;
                                    if (objQ15 == gVar5) {
                                        objQ15 = new ju.d(25);
                                        sVar4.o0(objQ15);
                                    }
                                    ys.a.l(432, (fz.a) objQ15, strE0, sVar4, false);
                                    z1.r rVarC3 = j0.c.C(d0.n.y(oVar2, d0.n.u(sVar4), true, 12), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    j0.u uVarA2 = j0.t.a(dVar, hVar3, sVar4, 0);
                                    int iHashCode4 = Long.hashCode(sVar4.T);
                                    l1.q1 q1VarL2 = sVar4.l();
                                    z1.r rVarC4 = z1.a.c(sVar4, rVarC3);
                                    sVar4.h0();
                                    if (sVar4.S) {
                                        sVar4.k(iVar3);
                                    } else {
                                        sVar4.r0();
                                    }
                                    l1.t.J(hVar4, uVarA2, sVar4);
                                    l1.t.J(hVar5, q1VarL2, sVar4);
                                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode4))) {
                                        defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar6);
                                    }
                                    l1.t.J(hVar7, rVarC4, sVar4);
                                    String strE1 = ub.a.e0(sVar4, R.string.display_in);
                                    l1.b1 b1Var42 = b1Var8;
                                    boolean zBooleanValue = ((Boolean) b1Var42.getValue()).booleanValue();
                                    Object objQ16 = sVar4.Q();
                                    if (objQ16 == gVar5) {
                                        objQ16 = new p(6, b1Var42);
                                        sVar4.o0(objQ16);
                                    }
                                    fz.c cVar = (fz.c) objQ16;
                                    int i21 = length;
                                    boolean zD = sVar4.d(i21);
                                    l1.b1 b1Var43 = b1Var4;
                                    boolean zF4 = zD | sVar4.f(b1Var43);
                                    l1.b1 b1Var44 = b1Var;
                                    boolean zF5 = zF4 | sVar4.f(b1Var44);
                                    l1.b1 b1Var45 = b1Var2;
                                    boolean zF6 = zF5 | sVar4.f(b1Var45);
                                    l1.b1 b1Var46 = b1Var3;
                                    boolean zF7 = zF6 | sVar4.f(b1Var46);
                                    final l1.b1 b1Var47 = b1Var5;
                                    boolean zF8 = zF7 | sVar4.f(b1Var47);
                                    l1.b1 b1Var48 = b1Var6;
                                    boolean zF9 = zF8 | sVar4.f(b1Var48);
                                    l1.b1 b1Var49 = b1Var7;
                                    boolean zF10 = zF9 | sVar4.f(b1Var49);
                                    fz.j jVar10 = onSettingChange;
                                    boolean zF11 = zF10 | sVar4.f(jVar10);
                                    Object objQ17 = sVar4.Q();
                                    if (zF11 || objQ17 == gVar5) {
                                        b1Var11 = b1Var44;
                                        objQ17 = new r3(i21, jVar10, b1Var43, b1Var11, b1Var45, b1Var46, b1Var47, b1Var48, b1Var49);
                                        b1Var12 = b1Var43;
                                        sVar4.o0(objQ17);
                                    } else {
                                        b1Var12 = b1Var43;
                                        b1Var11 = b1Var44;
                                    }
                                    l1.g gVar6 = gVar5;
                                    ys.a.i(strE1, strArr4, i18, zBooleanValue, false, cVar, (fz.c) objQ17, sVar4, 196608, 16);
                                    int iL = hz.b.l(((Number) b1Var47.getValue()).intValue(), 0, 2);
                                    final l1.b1 b1Var50 = b1Var11;
                                    String strE2 = ub.a.e0(sVar4, R.string.audio_auto_play);
                                    l1.b1 b1Var51 = b1Var9;
                                    boolean zBooleanValue2 = ((Boolean) b1Var51.getValue()).booleanValue();
                                    boolean z27 = !z23;
                                    Object objQ18 = sVar4.Q();
                                    if (objQ18 == gVar6) {
                                        objQ18 = new p(7, b1Var51);
                                        sVar4.o0(objQ18);
                                    }
                                    fz.c cVar2 = (fz.c) objQ18;
                                    boolean zF12 = sVar4.f(b1Var47) | sVar4.f(b1Var50) | sVar4.f(b1Var45) | sVar4.f(b1Var46) | sVar4.f(b1Var12) | sVar4.f(b1Var48) | sVar4.f(b1Var49) | sVar4.f(jVar10);
                                    Object objQ19 = sVar4.Q();
                                    if (zF12 || objQ19 == gVar6) {
                                        final int i22 = 3;
                                        final l1.b1 b1Var52 = b1Var12;
                                        jVar = jVar10;
                                        b1Var13 = b1Var45;
                                        b1Var14 = b1Var46;
                                        b1Var15 = b1Var48;
                                        b1Var16 = b1Var49;
                                        objQ19 = new fz.c() { // from class: mt.o3
                                            @Override // fz.c
                                            public final Object invoke(Object obj4) {
                                                switch (i22) {
                                                    case 0:
                                                        Integer num = (Integer) obj4;
                                                        int iIntValue4 = num.intValue();
                                                        l1.b1 b1Var53 = b1Var47;
                                                        b1Var53.setValue(num);
                                                        g.D(jVar, b1Var53, b1Var50, b1Var13, b1Var14, b1Var52, b1Var15, b1Var16, iIntValue4, 0, 0, 0, 0, false, 32256);
                                                        break;
                                                    case 1:
                                                        Boolean bool = (Boolean) obj4;
                                                        boolean zBooleanValue3 = bool.booleanValue();
                                                        l1.b1 b1Var54 = b1Var47;
                                                        b1Var54.setValue(bool);
                                                        g.D(jVar, b1Var50, b1Var13, b1Var14, b1Var52, b1Var15, b1Var16, b1Var54, 0, 0, 0, 0, 0, zBooleanValue3, 16128);
                                                        break;
                                                    case 2:
                                                        Integer num2 = (Integer) obj4;
                                                        int iIntValue5 = num2.intValue();
                                                        l1.b1 b1Var55 = b1Var47;
                                                        b1Var55.setValue(num2);
                                                        g.D(jVar, b1Var50, b1Var55, b1Var13, b1Var14, b1Var52, b1Var15, b1Var16, 0, iIntValue5, 0, 0, 0, false, 32000);
                                                        break;
                                                    default:
                                                        Integer num3 = (Integer) obj4;
                                                        int iIntValue6 = num3.intValue();
                                                        l1.b1 b1Var56 = b1Var47;
                                                        b1Var56.setValue(num3);
                                                        g.D(jVar, b1Var50, b1Var13, b1Var14, b1Var52, b1Var56, b1Var15, b1Var16, 0, 0, 0, 0, iIntValue6, false, 28416);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        b1Var17 = b1Var50;
                                        b1Var18 = b1Var47;
                                        sVar4.o0(objQ19);
                                    } else {
                                        jVar = jVar10;
                                        b1Var17 = b1Var50;
                                        b1Var13 = b1Var45;
                                        b1Var14 = b1Var46;
                                        b1Var18 = b1Var47;
                                        b1Var15 = b1Var48;
                                        b1Var16 = b1Var49;
                                    }
                                    final fz.j jVar11 = jVar;
                                    final l1.b1 b1Var53 = b1Var13;
                                    final l1.b1 b1Var54 = b1Var18;
                                    l1.b1 b1Var55 = b1Var15;
                                    final l1.b1 b1Var56 = b1Var16;
                                    final l1.b1 b1Var57 = b1Var14;
                                    ys.a.i(strE2, strArr3, iL, zBooleanValue2, z27, cVar2, (fz.c) objQ19, sVar4, 196608, 0);
                                    String[] strArr5 = strArr2;
                                    if (strArr5.length == 0) {
                                        sVar4.d0(1050243442);
                                        sVar4.p(false);
                                        b1Var21 = b1Var54;
                                        b1Var20 = b1Var55;
                                        b1Var22 = b1Var56;
                                        gVar6 = gVar6;
                                        jVar2 = jVar11;
                                    } else {
                                        sVar4.d0(1058794978);
                                        int iL2 = hz.b.l(((Number) b1Var17.getValue()).intValue(), 0, strArr5.length - 1);
                                        int i23 = i19;
                                        String strE = ys.a.E(sVar4, i23);
                                        l1.b1 b1Var58 = b1Var10;
                                        boolean zBooleanValue3 = ((Boolean) b1Var58.getValue()).booleanValue();
                                        Object objQ20 = sVar4.Q();
                                        if (objQ20 == gVar6) {
                                            objQ20 = new p(8, b1Var58);
                                            sVar4.o0(objQ20);
                                        }
                                        fz.c cVar3 = (fz.c) objQ20;
                                        boolean zF13 = sVar4.f(b1Var17) | sVar4.f(b1Var53) | sVar4.f(b1Var57) | sVar4.f(b1Var12) | sVar4.f(b1Var54) | sVar4.f(b1Var55) | sVar4.f(b1Var56) | sVar4.f(jVar11);
                                        Object objQ21 = sVar4.Q();
                                        if (zF13 || objQ21 == gVar6) {
                                            final int i24 = 0;
                                            final l1.b1 b1Var59 = b1Var17;
                                            final l1.b1 b1Var60 = b1Var12;
                                            b1Var19 = b1Var55;
                                            objQ21 = new fz.c() { // from class: mt.o3
                                                @Override // fz.c
                                                public final Object invoke(Object obj4) {
                                                    switch (i24) {
                                                        case 0:
                                                            Integer num = (Integer) obj4;
                                                            int iIntValue4 = num.intValue();
                                                            l1.b1 b1Var510 = b1Var59;
                                                            b1Var510.setValue(num);
                                                            g.D(jVar11, b1Var510, b1Var53, b1Var57, b1Var60, b1Var54, b1Var19, b1Var56, iIntValue4, 0, 0, 0, 0, false, 32256);
                                                            break;
                                                        case 1:
                                                            Boolean bool = (Boolean) obj4;
                                                            boolean zBooleanValue4 = bool.booleanValue();
                                                            l1.b1 b1Var511 = b1Var59;
                                                            b1Var511.setValue(bool);
                                                            g.D(jVar11, b1Var53, b1Var57, b1Var60, b1Var54, b1Var19, b1Var56, b1Var511, 0, 0, 0, 0, 0, zBooleanValue4, 16128);
                                                            break;
                                                        case 2:
                                                            Integer num2 = (Integer) obj4;
                                                            int iIntValue5 = num2.intValue();
                                                            l1.b1 b1Var512 = b1Var59;
                                                            b1Var512.setValue(num2);
                                                            g.D(jVar11, b1Var53, b1Var512, b1Var57, b1Var60, b1Var54, b1Var19, b1Var56, 0, iIntValue5, 0, 0, 0, false, 32000);
                                                            break;
                                                        default:
                                                            Integer num3 = (Integer) obj4;
                                                            int iIntValue6 = num3.intValue();
                                                            l1.b1 b1Var513 = b1Var59;
                                                            b1Var513.setValue(num3);
                                                            g.D(jVar11, b1Var53, b1Var57, b1Var60, b1Var54, b1Var513, b1Var19, b1Var56, 0, 0, 0, 0, iIntValue6, false, 28416);
                                                            break;
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            };
                                            sVar4.o0(objQ21);
                                        } else {
                                            b1Var19 = b1Var55;
                                        }
                                        fz.c cVar4 = (fz.c) objQ21;
                                        l1.b1 b1Var61 = b1Var19;
                                        ys.a.i(strE, strArr5, iL2, zBooleanValue3, false, cVar3, cVar4, sVar4, 196608, 16);
                                        int iIntValue4 = ((Number) b1Var17.getValue()).intValue();
                                        Integer numValueOf = ys.a.F(i23, iIntValue4) ? Integer.valueOf(iIntValue4) : null;
                                        if (numValueOf != null) {
                                            sVar4.d0(1059792899);
                                            int iIntValue5 = numValueOf.intValue();
                                            float fFloatValue = ((Number) b1Var61.getValue()).floatValue();
                                            boolean zF14 = sVar4.f(b1Var61);
                                            Object objQ22 = sVar4.Q();
                                            if (zF14 || objQ22 == gVar6) {
                                                objQ22 = new p(5, b1Var61);
                                                sVar4.o0(objQ22);
                                            }
                                            fz.c cVar5 = (fz.c) objQ22;
                                            boolean zF15 = sVar4.f(b1Var17) | sVar4.f(b1Var53) | sVar4.f(b1Var57) | sVar4.f(b1Var12) | sVar4.f(b1Var54) | sVar4.f(b1Var61) | sVar4.f(b1Var56) | sVar4.f(jVar11);
                                            Object objQ23 = sVar4.Q();
                                            if (zF15 || objQ23 == gVar6) {
                                                objQ23 = new p3(jVar11, b1Var17, b1Var53, b1Var57, b1Var12, b1Var54, b1Var61, b1Var56);
                                                b1Var21 = b1Var54;
                                                b1Var20 = b1Var61;
                                                b1Var23 = b1Var56;
                                                jVar3 = jVar11;
                                                sVar4.o0(objQ23);
                                            } else {
                                                jVar3 = jVar11;
                                                b1Var23 = b1Var56;
                                                b1Var20 = b1Var61;
                                                b1Var21 = b1Var54;
                                            }
                                            jVar2 = jVar3;
                                            b1Var22 = b1Var23;
                                            ys.a.k(i23, iIntValue5, fFloatValue, cVar5, (fz.a) objQ23, null, sVar4, 0);
                                            sVar4 = sVar4;
                                            z24 = false;
                                        } else {
                                            b1Var20 = b1Var61;
                                            b1Var21 = b1Var54;
                                            b1Var22 = b1Var56;
                                            jVar2 = jVar11;
                                            z24 = false;
                                            sVar4.d0(1050243442);
                                        }
                                        sVar4.p(z24);
                                        sVar4.p(z24);
                                    }
                                    String strE3 = ub.a.e0(sVar4, R.string.sound_effect);
                                    boolean zBooleanValue4 = ((Boolean) b1Var22.getValue()).booleanValue();
                                    boolean zF16 = sVar4.f(b1Var22) | sVar4.f(b1Var17) | sVar4.f(b1Var53) | sVar4.f(b1Var57) | sVar4.f(b1Var12) | sVar4.f(b1Var21) | sVar4.f(b1Var20) | sVar4.f(jVar2);
                                    Object objQ24 = sVar4.Q();
                                    if (zF16) {
                                        gVar2 = gVar6;
                                    } else {
                                        gVar2 = gVar6;
                                        if (objQ24 != gVar2) {
                                            jVar4 = jVar2;
                                            b1Var24 = b1Var22;
                                            b1Var25 = b1Var21;
                                            b1Var26 = b1Var20;
                                        }
                                        ys.a.m(strE3, zBooleanValue4, (fz.c) objQ24, sVar4, 0);
                                        z1.r rVarI = j0.e2.i(j0.e2.e(oVar2, 1.0f), 62, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                        j0.e eVar = j0.i.f35309g;
                                        z1.i iVar4 = z1.c.M;
                                        j0.a2 a2VarA = j0.z1.a(eVar, iVar4, sVar4, 54);
                                        iHashCode = Long.hashCode(sVar4.T);
                                        l1.q1 q1VarL3 = sVar4.l();
                                        z1.r rVarC5 = z1.a.c(sVar4, rVarI);
                                        sVar4.h0();
                                        if (sVar4.S) {
                                            iVar = iVar3;
                                            sVar4.k(iVar);
                                        } else {
                                            iVar = iVar3;
                                            sVar4.r0();
                                        }
                                        gVar3 = gVar2;
                                        l1.t.J(hVar4, a2VarA, sVar4);
                                        l1.t.J(hVar5, q1VarL3, sVar4);
                                        if (sVar4.S) {
                                            oVar = oVar2;
                                        } else {
                                            oVar = oVar2;
                                            if (!kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                                                hVar = hVar6;
                                            }
                                            l1.t.J(hVar7, rVarC5, sVar4);
                                            String strE4 = ub.a.e0(sVar4, R.string.audio_speed);
                                            l1.c3 c3Var2 = fc.f30256a;
                                            j3.y0 y0Var = ((dc) sVar4.j(c3Var2)).f30175h;
                                            l1.c3 c3Var3 = h1.v1.f31180a;
                                            hVar2 = hVar;
                                            j3.y0 y0VarA = j3.y0.a(y0Var, ((h1.s1) sVar4.j(c3Var3)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                                            if (1.0f <= 0.0d) {
                                                k0.a.a("invalid weight; must be greater than zero");
                                            }
                                            sVar3 = sVar4;
                                            iVar2 = iVar;
                                            z1.o oVar3 = oVar;
                                            jVar5 = jVar4;
                                            b1Var27 = b1Var25;
                                            b1Var28 = b1Var12;
                                            b1Var29 = b1Var24;
                                            b1Var30 = b1Var26;
                                            b1Var31 = b1Var17;
                                            ua.b(strE4, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar3, 0, 0, 65532);
                                            j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, iVar4, sVar3, 48);
                                            iHashCode2 = Long.hashCode(sVar3.T);
                                            l1.q1 q1VarL4 = sVar3.l();
                                            z1.r rVarC6 = z1.a.c(sVar3, oVar3);
                                            sVar3.h0();
                                            if (sVar3.S) {
                                                sVar3.k(iVar2);
                                            } else {
                                                sVar3.r0();
                                            }
                                            l1.t.J(hVar4, a2VarA2, sVar3);
                                            l1.t.J(hVar5, q1VarL4, sVar3);
                                            if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                                                defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                            }
                                            l1.t.J(hVar7, rVarC6, sVar3);
                                            zF = sVar3.f(b1Var57) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var27) | sVar3.f(b1Var30) | sVar3.f(b1Var29) | sVar3.f(jVar5);
                                            objQ12 = sVar3.Q();
                                            if (zF) {
                                                gVar4 = gVar3;
                                            } else {
                                                gVar4 = gVar3;
                                                if (objQ12 == gVar4) {
                                                    b1Var32 = b1Var29;
                                                    jVar6 = jVar5;
                                                    b1Var33 = b1Var30;
                                                    b1Var35 = b1Var27;
                                                    b1Var34 = b1Var57;
                                                }
                                                fz.a aVar = (fz.a) objQ12;
                                                if (((Number) b1Var34.getValue()).intValue() > 50) {
                                                    z25 = true;
                                                } else {
                                                    z25 = false;
                                                }
                                                jVar7 = jVar6;
                                                b1Var36 = b1Var33;
                                                b1Var37 = b1Var32;
                                                k7.h(aVar, null, z25, null, g.C0, sVar3, 196608, 26);
                                                float f11 = 8;
                                                ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                                zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                                objQ13 = sVar3.Q();
                                                if (!zF2 || objQ13 == gVar4) {
                                                    jVar8 = jVar7;
                                                    b1Var38 = b1Var36;
                                                    b1Var39 = b1Var37;
                                                    objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                                    sVar3.o0(objQ13);
                                                } else {
                                                    jVar8 = jVar7;
                                                    b1Var38 = b1Var36;
                                                    b1Var39 = b1Var37;
                                                }
                                                fz.a aVar2 = (fz.a) objQ13;
                                                if (((Number) b1Var34.getValue()).intValue() < 150) {
                                                    z26 = true;
                                                } else {
                                                    z26 = false;
                                                }
                                                k7.h(aVar2, null, z26, null, g.D0, sVar3, 196608, 26);
                                                sVar3.p(true);
                                                sVar3.p(true);
                                                b1Var40 = b1Var39;
                                                jVar9 = jVar8;
                                                b1Var41 = b1Var38;
                                                l1.g gVar7 = gVar4;
                                                ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var2)).f30175h, ((h1.s1) sVar3.j(c3Var3)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                                int iIntValue6 = ((Number) b1Var53.getValue()).intValue();
                                                z1.r rVarE = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                                zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                                objQ14 = sVar3.Q();
                                                if (zF3 || objQ14 == gVar7) {
                                                    final int i25 = 2;
                                                    final l1.b1 b1Var62 = b1Var34;
                                                    final l1.b1 b1Var63 = b1Var35;
                                                    objQ14 = new fz.c() { // from class: mt.o3
                                                        @Override // fz.c
                                                        public final Object invoke(Object obj4) {
                                                            switch (i25) {
                                                                case 0:
                                                                    Integer num = (Integer) obj4;
                                                                    int iIntValue7 = num.intValue();
                                                                    l1.b1 b1Var510 = b1Var53;
                                                                    b1Var510.setValue(num);
                                                                    g.D(jVar9, b1Var510, b1Var31, b1Var62, b1Var28, b1Var63, b1Var41, b1Var40, iIntValue7, 0, 0, 0, 0, false, 32256);
                                                                    break;
                                                                case 1:
                                                                    Boolean bool = (Boolean) obj4;
                                                                    boolean zBooleanValue5 = bool.booleanValue();
                                                                    l1.b1 b1Var511 = b1Var53;
                                                                    b1Var511.setValue(bool);
                                                                    g.D(jVar9, b1Var31, b1Var62, b1Var28, b1Var63, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                                    break;
                                                                case 2:
                                                                    Integer num2 = (Integer) obj4;
                                                                    int iIntValue8 = num2.intValue();
                                                                    l1.b1 b1Var512 = b1Var53;
                                                                    b1Var512.setValue(num2);
                                                                    g.D(jVar9, b1Var31, b1Var512, b1Var62, b1Var28, b1Var63, b1Var41, b1Var40, 0, iIntValue8, 0, 0, 0, false, 32000);
                                                                    break;
                                                                default:
                                                                    Integer num3 = (Integer) obj4;
                                                                    int iIntValue9 = num3.intValue();
                                                                    l1.b1 b1Var513 = b1Var53;
                                                                    b1Var513.setValue(num3);
                                                                    g.D(jVar9, b1Var31, b1Var62, b1Var28, b1Var63, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue9, false, 28416);
                                                                    break;
                                                            }
                                                            return qy.b0.f48488a;
                                                        }
                                                    };
                                                    sVar3.o0(objQ14);
                                                }
                                                ys.a.y(iIntValue6, 48, (fz.c) objQ14, sVar3, rVarE);
                                                sVar3.p(true);
                                                sVar3.p(true);
                                            }
                                            b1Var32 = b1Var29;
                                            jVar6 = jVar5;
                                            b1Var33 = b1Var30;
                                            objQ12 = new p3(1, jVar6, b1Var57, b1Var31, b1Var53, b1Var28, b1Var27, b1Var33, b1Var32);
                                            b1Var34 = b1Var57;
                                            b1Var35 = b1Var27;
                                            sVar3.o0(objQ12);
                                            fz.a aVar3 = (fz.a) objQ12;
                                            if (((Number) b1Var34.getValue()).intValue() > 50) {
                                                z25 = true;
                                            } else {
                                                z25 = false;
                                            }
                                            jVar7 = jVar6;
                                            b1Var36 = b1Var33;
                                            b1Var37 = b1Var32;
                                            k7.h(aVar3, null, z25, null, g.C0, sVar3, 196608, 26);
                                            float f12 = 8;
                                            ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar3, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                            zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                            objQ13 = sVar3.Q();
                                            if (zF2) {
                                                jVar8 = jVar7;
                                                b1Var38 = b1Var36;
                                                b1Var39 = b1Var37;
                                                objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                                sVar3.o0(objQ13);
                                            } else {
                                                jVar8 = jVar7;
                                                b1Var38 = b1Var36;
                                                b1Var39 = b1Var37;
                                                objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                                sVar3.o0(objQ13);
                                            }
                                            fz.a aVar4 = (fz.a) objQ13;
                                            if (((Number) b1Var34.getValue()).intValue() < 150) {
                                                z26 = true;
                                            } else {
                                                z26 = false;
                                            }
                                            k7.h(aVar4, null, z26, null, g.D0, sVar3, 196608, 26);
                                            sVar3.p(true);
                                            sVar3.p(true);
                                            b1Var40 = b1Var39;
                                            jVar9 = jVar8;
                                            b1Var41 = b1Var38;
                                            l1.g gVar8 = gVar4;
                                            ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var2)).f30175h, ((h1.s1) sVar3.j(c3Var3)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                            int iIntValue7 = ((Number) b1Var53.getValue()).intValue();
                                            z1.r rVarE2 = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                            zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                            objQ14 = sVar3.Q();
                                            if (zF3) {
                                                final int i26 = 2;
                                                final l1.b1 b1Var64 = b1Var34;
                                                final l1.b1 b1Var65 = b1Var35;
                                                objQ14 = new fz.c() { // from class: mt.o3
                                                    @Override // fz.c
                                                    public final Object invoke(Object obj4) {
                                                        switch (i26) {
                                                            case 0:
                                                                Integer num = (Integer) obj4;
                                                                int iIntValue8 = num.intValue();
                                                                l1.b1 b1Var510 = b1Var53;
                                                                b1Var510.setValue(num);
                                                                g.D(jVar9, b1Var510, b1Var31, b1Var64, b1Var28, b1Var65, b1Var41, b1Var40, iIntValue8, 0, 0, 0, 0, false, 32256);
                                                                break;
                                                            case 1:
                                                                Boolean bool = (Boolean) obj4;
                                                                boolean zBooleanValue5 = bool.booleanValue();
                                                                l1.b1 b1Var511 = b1Var53;
                                                                b1Var511.setValue(bool);
                                                                g.D(jVar9, b1Var31, b1Var64, b1Var28, b1Var65, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                                break;
                                                            case 2:
                                                                Integer num2 = (Integer) obj4;
                                                                int iIntValue9 = num2.intValue();
                                                                l1.b1 b1Var512 = b1Var53;
                                                                b1Var512.setValue(num2);
                                                                g.D(jVar9, b1Var31, b1Var512, b1Var64, b1Var28, b1Var65, b1Var41, b1Var40, 0, iIntValue9, 0, 0, 0, false, 32000);
                                                                break;
                                                            default:
                                                                Integer num3 = (Integer) obj4;
                                                                int iIntValue10 = num3.intValue();
                                                                l1.b1 b1Var513 = b1Var53;
                                                                b1Var513.setValue(num3);
                                                                g.D(jVar9, b1Var31, b1Var64, b1Var28, b1Var65, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue10, false, 28416);
                                                                break;
                                                        }
                                                        return qy.b0.f48488a;
                                                    }
                                                };
                                                sVar3.o0(objQ14);
                                            } else {
                                                final int i27 = 2;
                                                final l1.b1 b1Var66 = b1Var34;
                                                final l1.b1 b1Var67 = b1Var35;
                                                objQ14 = new fz.c() { // from class: mt.o3
                                                    @Override // fz.c
                                                    public final Object invoke(Object obj4) {
                                                        switch (i27) {
                                                            case 0:
                                                                Integer num = (Integer) obj4;
                                                                int iIntValue8 = num.intValue();
                                                                l1.b1 b1Var510 = b1Var53;
                                                                b1Var510.setValue(num);
                                                                g.D(jVar9, b1Var510, b1Var31, b1Var66, b1Var28, b1Var67, b1Var41, b1Var40, iIntValue8, 0, 0, 0, 0, false, 32256);
                                                                break;
                                                            case 1:
                                                                Boolean bool = (Boolean) obj4;
                                                                boolean zBooleanValue5 = bool.booleanValue();
                                                                l1.b1 b1Var511 = b1Var53;
                                                                b1Var511.setValue(bool);
                                                                g.D(jVar9, b1Var31, b1Var66, b1Var28, b1Var67, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                                break;
                                                            case 2:
                                                                Integer num2 = (Integer) obj4;
                                                                int iIntValue9 = num2.intValue();
                                                                l1.b1 b1Var512 = b1Var53;
                                                                b1Var512.setValue(num2);
                                                                g.D(jVar9, b1Var31, b1Var512, b1Var66, b1Var28, b1Var67, b1Var41, b1Var40, 0, iIntValue9, 0, 0, 0, false, 32000);
                                                                break;
                                                            default:
                                                                Integer num3 = (Integer) obj4;
                                                                int iIntValue10 = num3.intValue();
                                                                l1.b1 b1Var513 = b1Var53;
                                                                b1Var513.setValue(num3);
                                                                g.D(jVar9, b1Var31, b1Var66, b1Var28, b1Var67, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue10, false, 28416);
                                                                break;
                                                        }
                                                        return qy.b0.f48488a;
                                                    }
                                                };
                                                sVar3.o0(objQ14);
                                            }
                                            ys.a.y(iIntValue7, 48, (fz.c) objQ14, sVar3, rVarE2);
                                            sVar3.p(true);
                                            sVar3.p(true);
                                        }
                                        hVar = hVar6;
                                        defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
                                        l1.t.J(hVar7, rVarC5, sVar4);
                                        String strE5 = ub.a.e0(sVar4, R.string.audio_speed);
                                        l1.c3 c3Var4 = fc.f30256a;
                                        j3.y0 y0Var2 = ((dc) sVar4.j(c3Var4)).f30175h;
                                        l1.c3 c3Var5 = h1.v1.f31180a;
                                        hVar2 = hVar;
                                        j3.y0 y0VarA2 = j3.y0.a(y0Var2, ((h1.s1) sVar4.j(c3Var5)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                                        if (1.0f <= 0.0d) {
                                            k0.a.a("invalid weight; must be greater than zero");
                                        }
                                        sVar3 = sVar4;
                                        iVar2 = iVar;
                                        z1.o oVar4 = oVar;
                                        jVar5 = jVar4;
                                        b1Var27 = b1Var25;
                                        b1Var28 = b1Var12;
                                        b1Var29 = b1Var24;
                                        b1Var30 = b1Var26;
                                        b1Var31 = b1Var17;
                                        ua.b(strE5, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA2, sVar3, 0, 0, 65532);
                                        j0.a2 a2VarA3 = j0.z1.a(j0.i.f35303a, iVar4, sVar3, 48);
                                        iHashCode2 = Long.hashCode(sVar3.T);
                                        l1.q1 q1VarL5 = sVar3.l();
                                        z1.r rVarC7 = z1.a.c(sVar3, oVar4);
                                        sVar3.h0();
                                        if (sVar3.S) {
                                            sVar3.k(iVar2);
                                        } else {
                                            sVar3.r0();
                                        }
                                        l1.t.J(hVar4, a2VarA3, sVar3);
                                        l1.t.J(hVar5, q1VarL5, sVar3);
                                        if (sVar3.S) {
                                            defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                        } else {
                                            defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                        }
                                        l1.t.J(hVar7, rVarC7, sVar3);
                                        zF = sVar3.f(b1Var57) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var27) | sVar3.f(b1Var30) | sVar3.f(b1Var29) | sVar3.f(jVar5);
                                        objQ12 = sVar3.Q();
                                        if (zF) {
                                            gVar4 = gVar3;
                                            if (objQ12 == gVar4) {
                                                b1Var32 = b1Var29;
                                                jVar6 = jVar5;
                                                b1Var33 = b1Var30;
                                                b1Var35 = b1Var27;
                                                b1Var34 = b1Var57;
                                            }
                                            fz.a aVar5 = (fz.a) objQ12;
                                            if (((Number) b1Var34.getValue()).intValue() > 50) {
                                                z25 = true;
                                            } else {
                                                z25 = false;
                                            }
                                            jVar7 = jVar6;
                                            b1Var36 = b1Var33;
                                            b1Var37 = b1Var32;
                                            k7.h(aVar5, null, z25, null, g.C0, sVar3, 196608, 26);
                                            float f13 = 8;
                                            ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar4, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                            zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                            objQ13 = sVar3.Q();
                                            if (zF2) {
                                                jVar8 = jVar7;
                                                b1Var38 = b1Var36;
                                                b1Var39 = b1Var37;
                                                objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                                sVar3.o0(objQ13);
                                            } else {
                                                jVar8 = jVar7;
                                                b1Var38 = b1Var36;
                                                b1Var39 = b1Var37;
                                                objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                                sVar3.o0(objQ13);
                                            }
                                            fz.a aVar6 = (fz.a) objQ13;
                                            if (((Number) b1Var34.getValue()).intValue() < 150) {
                                                z26 = true;
                                            } else {
                                                z26 = false;
                                            }
                                            k7.h(aVar6, null, z26, null, g.D0, sVar3, 196608, 26);
                                            sVar3.p(true);
                                            sVar3.p(true);
                                            b1Var40 = b1Var39;
                                            jVar9 = jVar8;
                                            b1Var41 = b1Var38;
                                            l1.g gVar9 = gVar4;
                                            ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var4)).f30175h, ((h1.s1) sVar3.j(c3Var5)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                            int iIntValue8 = ((Number) b1Var53.getValue()).intValue();
                                            z1.r rVarE3 = j0.c.E(oVar4, CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                            zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                            objQ14 = sVar3.Q();
                                            if (zF3) {
                                                final int i28 = 2;
                                                final l1.b1 b1Var68 = b1Var34;
                                                final l1.b1 b1Var69 = b1Var35;
                                                objQ14 = new fz.c() { // from class: mt.o3
                                                    @Override // fz.c
                                                    public final Object invoke(Object obj4) {
                                                        switch (i28) {
                                                            case 0:
                                                                Integer num = (Integer) obj4;
                                                                int iIntValue9 = num.intValue();
                                                                l1.b1 b1Var510 = b1Var53;
                                                                b1Var510.setValue(num);
                                                                g.D(jVar9, b1Var510, b1Var31, b1Var68, b1Var28, b1Var69, b1Var41, b1Var40, iIntValue9, 0, 0, 0, 0, false, 32256);
                                                                break;
                                                            case 1:
                                                                Boolean bool = (Boolean) obj4;
                                                                boolean zBooleanValue5 = bool.booleanValue();
                                                                l1.b1 b1Var511 = b1Var53;
                                                                b1Var511.setValue(bool);
                                                                g.D(jVar9, b1Var31, b1Var68, b1Var28, b1Var69, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                                break;
                                                            case 2:
                                                                Integer num2 = (Integer) obj4;
                                                                int iIntValue10 = num2.intValue();
                                                                l1.b1 b1Var512 = b1Var53;
                                                                b1Var512.setValue(num2);
                                                                g.D(jVar9, b1Var31, b1Var512, b1Var68, b1Var28, b1Var69, b1Var41, b1Var40, 0, iIntValue10, 0, 0, 0, false, 32000);
                                                                break;
                                                            default:
                                                                Integer num3 = (Integer) obj4;
                                                                int iIntValue11 = num3.intValue();
                                                                l1.b1 b1Var513 = b1Var53;
                                                                b1Var513.setValue(num3);
                                                                g.D(jVar9, b1Var31, b1Var68, b1Var28, b1Var69, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue11, false, 28416);
                                                                break;
                                                        }
                                                        return qy.b0.f48488a;
                                                    }
                                                };
                                                sVar3.o0(objQ14);
                                            } else {
                                                final int i29 = 2;
                                                final l1.b1 b1Var610 = b1Var34;
                                                final l1.b1 b1Var611 = b1Var35;
                                                objQ14 = new fz.c() { // from class: mt.o3
                                                    @Override // fz.c
                                                    public final Object invoke(Object obj4) {
                                                        switch (i29) {
                                                            case 0:
                                                                Integer num = (Integer) obj4;
                                                                int iIntValue9 = num.intValue();
                                                                l1.b1 b1Var510 = b1Var53;
                                                                b1Var510.setValue(num);
                                                                g.D(jVar9, b1Var510, b1Var31, b1Var610, b1Var28, b1Var611, b1Var41, b1Var40, iIntValue9, 0, 0, 0, 0, false, 32256);
                                                                break;
                                                            case 1:
                                                                Boolean bool = (Boolean) obj4;
                                                                boolean zBooleanValue5 = bool.booleanValue();
                                                                l1.b1 b1Var511 = b1Var53;
                                                                b1Var511.setValue(bool);
                                                                g.D(jVar9, b1Var31, b1Var610, b1Var28, b1Var611, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                                break;
                                                            case 2:
                                                                Integer num2 = (Integer) obj4;
                                                                int iIntValue10 = num2.intValue();
                                                                l1.b1 b1Var512 = b1Var53;
                                                                b1Var512.setValue(num2);
                                                                g.D(jVar9, b1Var31, b1Var512, b1Var610, b1Var28, b1Var611, b1Var41, b1Var40, 0, iIntValue10, 0, 0, 0, false, 32000);
                                                                break;
                                                            default:
                                                                Integer num3 = (Integer) obj4;
                                                                int iIntValue11 = num3.intValue();
                                                                l1.b1 b1Var513 = b1Var53;
                                                                b1Var513.setValue(num3);
                                                                g.D(jVar9, b1Var31, b1Var610, b1Var28, b1Var611, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue11, false, 28416);
                                                                break;
                                                        }
                                                        return qy.b0.f48488a;
                                                    }
                                                };
                                                sVar3.o0(objQ14);
                                            }
                                            ys.a.y(iIntValue8, 48, (fz.c) objQ14, sVar3, rVarE3);
                                            sVar3.p(true);
                                            sVar3.p(true);
                                        } else {
                                            gVar4 = gVar3;
                                        }
                                        b1Var32 = b1Var29;
                                        jVar6 = jVar5;
                                        b1Var33 = b1Var30;
                                        objQ12 = new p3(1, jVar6, b1Var57, b1Var31, b1Var53, b1Var28, b1Var27, b1Var33, b1Var32);
                                        b1Var34 = b1Var57;
                                        b1Var35 = b1Var27;
                                        sVar3.o0(objQ12);
                                        fz.a aVar7 = (fz.a) objQ12;
                                        if (((Number) b1Var34.getValue()).intValue() > 50) {
                                            z25 = true;
                                        } else {
                                            z25 = false;
                                        }
                                        jVar7 = jVar6;
                                        b1Var36 = b1Var33;
                                        b1Var37 = b1Var32;
                                        k7.h(aVar7, null, z25, null, g.C0, sVar3, 196608, 26);
                                        float f14 = 8;
                                        ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar4, f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                        zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                        objQ13 = sVar3.Q();
                                        if (zF2) {
                                            jVar8 = jVar7;
                                            b1Var38 = b1Var36;
                                            b1Var39 = b1Var37;
                                            objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                            sVar3.o0(objQ13);
                                        } else {
                                            jVar8 = jVar7;
                                            b1Var38 = b1Var36;
                                            b1Var39 = b1Var37;
                                            objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                            sVar3.o0(objQ13);
                                        }
                                        fz.a aVar8 = (fz.a) objQ13;
                                        if (((Number) b1Var34.getValue()).intValue() < 150) {
                                            z26 = true;
                                        } else {
                                            z26 = false;
                                        }
                                        k7.h(aVar8, null, z26, null, g.D0, sVar3, 196608, 26);
                                        sVar3.p(true);
                                        sVar3.p(true);
                                        b1Var40 = b1Var39;
                                        jVar9 = jVar8;
                                        b1Var41 = b1Var38;
                                        l1.g gVar10 = gVar4;
                                        ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var4)).f30175h, ((h1.s1) sVar3.j(c3Var5)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                        int iIntValue9 = ((Number) b1Var53.getValue()).intValue();
                                        z1.r rVarE4 = j0.c.E(oVar4, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                        zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                        objQ14 = sVar3.Q();
                                        if (zF3) {
                                            final int i210 = 2;
                                            final l1.b1 b1Var612 = b1Var34;
                                            final l1.b1 b1Var613 = b1Var35;
                                            objQ14 = new fz.c() { // from class: mt.o3
                                                @Override // fz.c
                                                public final Object invoke(Object obj4) {
                                                    switch (i210) {
                                                        case 0:
                                                            Integer num = (Integer) obj4;
                                                            int iIntValue10 = num.intValue();
                                                            l1.b1 b1Var510 = b1Var53;
                                                            b1Var510.setValue(num);
                                                            g.D(jVar9, b1Var510, b1Var31, b1Var612, b1Var28, b1Var613, b1Var41, b1Var40, iIntValue10, 0, 0, 0, 0, false, 32256);
                                                            break;
                                                        case 1:
                                                            Boolean bool = (Boolean) obj4;
                                                            boolean zBooleanValue5 = bool.booleanValue();
                                                            l1.b1 b1Var511 = b1Var53;
                                                            b1Var511.setValue(bool);
                                                            g.D(jVar9, b1Var31, b1Var612, b1Var28, b1Var613, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                            break;
                                                        case 2:
                                                            Integer num2 = (Integer) obj4;
                                                            int iIntValue11 = num2.intValue();
                                                            l1.b1 b1Var512 = b1Var53;
                                                            b1Var512.setValue(num2);
                                                            g.D(jVar9, b1Var31, b1Var512, b1Var612, b1Var28, b1Var613, b1Var41, b1Var40, 0, iIntValue11, 0, 0, 0, false, 32000);
                                                            break;
                                                        default:
                                                            Integer num3 = (Integer) obj4;
                                                            int iIntValue12 = num3.intValue();
                                                            l1.b1 b1Var513 = b1Var53;
                                                            b1Var513.setValue(num3);
                                                            g.D(jVar9, b1Var31, b1Var612, b1Var28, b1Var613, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue12, false, 28416);
                                                            break;
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            };
                                            sVar3.o0(objQ14);
                                        } else {
                                            final int i211 = 2;
                                            final l1.b1 b1Var614 = b1Var34;
                                            final l1.b1 b1Var615 = b1Var35;
                                            objQ14 = new fz.c() { // from class: mt.o3
                                                @Override // fz.c
                                                public final Object invoke(Object obj4) {
                                                    switch (i211) {
                                                        case 0:
                                                            Integer num = (Integer) obj4;
                                                            int iIntValue10 = num.intValue();
                                                            l1.b1 b1Var510 = b1Var53;
                                                            b1Var510.setValue(num);
                                                            g.D(jVar9, b1Var510, b1Var31, b1Var614, b1Var28, b1Var615, b1Var41, b1Var40, iIntValue10, 0, 0, 0, 0, false, 32256);
                                                            break;
                                                        case 1:
                                                            Boolean bool = (Boolean) obj4;
                                                            boolean zBooleanValue5 = bool.booleanValue();
                                                            l1.b1 b1Var511 = b1Var53;
                                                            b1Var511.setValue(bool);
                                                            g.D(jVar9, b1Var31, b1Var614, b1Var28, b1Var615, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                            break;
                                                        case 2:
                                                            Integer num2 = (Integer) obj4;
                                                            int iIntValue11 = num2.intValue();
                                                            l1.b1 b1Var512 = b1Var53;
                                                            b1Var512.setValue(num2);
                                                            g.D(jVar9, b1Var31, b1Var512, b1Var614, b1Var28, b1Var615, b1Var41, b1Var40, 0, iIntValue11, 0, 0, 0, false, 32000);
                                                            break;
                                                        default:
                                                            Integer num3 = (Integer) obj4;
                                                            int iIntValue12 = num3.intValue();
                                                            l1.b1 b1Var513 = b1Var53;
                                                            b1Var513.setValue(num3);
                                                            g.D(jVar9, b1Var31, b1Var614, b1Var28, b1Var615, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue12, false, 28416);
                                                            break;
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            };
                                            sVar3.o0(objQ14);
                                        }
                                        ys.a.y(iIntValue9, 48, (fz.c) objQ14, sVar3, rVarE4);
                                        sVar3.p(true);
                                        sVar3.p(true);
                                    }
                                    final int i30 = 1;
                                    final l1.b1 b1Var70 = b1Var21;
                                    final l1.b1 b1Var71 = b1Var22;
                                    final l1.b1 b1Var72 = b1Var17;
                                    jVar4 = jVar2;
                                    final l1.b1 b1Var73 = b1Var12;
                                    final l1.b1 b1Var74 = b1Var20;
                                    objQ24 = new fz.c() { // from class: mt.o3
                                        @Override // fz.c
                                        public final Object invoke(Object obj4) {
                                            switch (i30) {
                                                case 0:
                                                    Integer num = (Integer) obj4;
                                                    int iIntValue10 = num.intValue();
                                                    l1.b1 b1Var510 = b1Var71;
                                                    b1Var510.setValue(num);
                                                    g.D(jVar4, b1Var510, b1Var72, b1Var53, b1Var57, b1Var73, b1Var70, b1Var74, iIntValue10, 0, 0, 0, 0, false, 32256);
                                                    break;
                                                case 1:
                                                    Boolean bool = (Boolean) obj4;
                                                    boolean zBooleanValue5 = bool.booleanValue();
                                                    l1.b1 b1Var511 = b1Var71;
                                                    b1Var511.setValue(bool);
                                                    g.D(jVar4, b1Var72, b1Var53, b1Var57, b1Var73, b1Var70, b1Var74, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                    break;
                                                case 2:
                                                    Integer num2 = (Integer) obj4;
                                                    int iIntValue11 = num2.intValue();
                                                    l1.b1 b1Var512 = b1Var71;
                                                    b1Var512.setValue(num2);
                                                    g.D(jVar4, b1Var72, b1Var512, b1Var53, b1Var57, b1Var73, b1Var70, b1Var74, 0, iIntValue11, 0, 0, 0, false, 32000);
                                                    break;
                                                default:
                                                    Integer num3 = (Integer) obj4;
                                                    int iIntValue12 = num3.intValue();
                                                    l1.b1 b1Var513 = b1Var71;
                                                    b1Var513.setValue(num3);
                                                    g.D(jVar4, b1Var72, b1Var53, b1Var57, b1Var73, b1Var513, b1Var70, b1Var74, 0, 0, 0, 0, iIntValue12, false, 28416);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    b1Var24 = b1Var71;
                                    b1Var25 = b1Var70;
                                    b1Var26 = b1Var74;
                                    sVar4.o0(objQ24);
                                    ys.a.m(strE3, zBooleanValue4, (fz.c) objQ24, sVar4, 0);
                                    z1.r rVarI2 = j0.e2.i(j0.e2.e(oVar2, 1.0f), 62, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    j0.e eVar2 = j0.i.f35309g;
                                    z1.i iVar5 = z1.c.M;
                                    j0.a2 a2VarA4 = j0.z1.a(eVar2, iVar5, sVar4, 54);
                                    iHashCode = Long.hashCode(sVar4.T);
                                    l1.q1 q1VarL6 = sVar4.l();
                                    z1.r rVarC8 = z1.a.c(sVar4, rVarI2);
                                    sVar4.h0();
                                    if (sVar4.S) {
                                        iVar = iVar3;
                                        sVar4.k(iVar);
                                    } else {
                                        iVar = iVar3;
                                        sVar4.r0();
                                    }
                                    gVar3 = gVar2;
                                    l1.t.J(hVar4, a2VarA4, sVar4);
                                    l1.t.J(hVar5, q1VarL6, sVar4);
                                    if (sVar4.S) {
                                        oVar = oVar2;
                                        if (!kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                                            hVar = hVar6;
                                        }
                                        l1.t.J(hVar7, rVarC8, sVar4);
                                        String strE6 = ub.a.e0(sVar4, R.string.audio_speed);
                                        l1.c3 c3Var6 = fc.f30256a;
                                        j3.y0 y0Var3 = ((dc) sVar4.j(c3Var6)).f30175h;
                                        l1.c3 c3Var7 = h1.v1.f31180a;
                                        hVar2 = hVar;
                                        j3.y0 y0VarA3 = j3.y0.a(y0Var3, ((h1.s1) sVar4.j(c3Var7)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                                        if (1.0f <= 0.0d) {
                                            k0.a.a("invalid weight; must be greater than zero");
                                        }
                                        sVar3 = sVar4;
                                        iVar2 = iVar;
                                        z1.o oVar5 = oVar;
                                        jVar5 = jVar4;
                                        b1Var27 = b1Var25;
                                        b1Var28 = b1Var12;
                                        b1Var29 = b1Var24;
                                        b1Var30 = b1Var26;
                                        b1Var31 = b1Var17;
                                        ua.b(strE6, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA3, sVar3, 0, 0, 65532);
                                        j0.a2 a2VarA5 = j0.z1.a(j0.i.f35303a, iVar5, sVar3, 48);
                                        iHashCode2 = Long.hashCode(sVar3.T);
                                        l1.q1 q1VarL7 = sVar3.l();
                                        z1.r rVarC9 = z1.a.c(sVar3, oVar5);
                                        sVar3.h0();
                                        if (sVar3.S) {
                                            sVar3.k(iVar2);
                                        } else {
                                            sVar3.r0();
                                        }
                                        l1.t.J(hVar4, a2VarA5, sVar3);
                                        l1.t.J(hVar5, q1VarL7, sVar3);
                                        if (sVar3.S) {
                                            defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                        } else {
                                            defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                        }
                                        l1.t.J(hVar7, rVarC9, sVar3);
                                        zF = sVar3.f(b1Var57) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var27) | sVar3.f(b1Var30) | sVar3.f(b1Var29) | sVar3.f(jVar5);
                                        objQ12 = sVar3.Q();
                                        if (zF) {
                                            gVar4 = gVar3;
                                            if (objQ12 == gVar4) {
                                                b1Var32 = b1Var29;
                                                jVar6 = jVar5;
                                                b1Var33 = b1Var30;
                                                b1Var35 = b1Var27;
                                                b1Var34 = b1Var57;
                                            }
                                            fz.a aVar9 = (fz.a) objQ12;
                                            if (((Number) b1Var34.getValue()).intValue() > 50) {
                                                z25 = true;
                                            } else {
                                                z25 = false;
                                            }
                                            jVar7 = jVar6;
                                            b1Var36 = b1Var33;
                                            b1Var37 = b1Var32;
                                            k7.h(aVar9, null, z25, null, g.C0, sVar3, 196608, 26);
                                            float f15 = 8;
                                            ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar5, f15, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                            zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                            objQ13 = sVar3.Q();
                                            if (zF2) {
                                                jVar8 = jVar7;
                                                b1Var38 = b1Var36;
                                                b1Var39 = b1Var37;
                                                objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                                sVar3.o0(objQ13);
                                            } else {
                                                jVar8 = jVar7;
                                                b1Var38 = b1Var36;
                                                b1Var39 = b1Var37;
                                                objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                                sVar3.o0(objQ13);
                                            }
                                            fz.a aVar10 = (fz.a) objQ13;
                                            if (((Number) b1Var34.getValue()).intValue() < 150) {
                                                z26 = true;
                                            } else {
                                                z26 = false;
                                            }
                                            k7.h(aVar10, null, z26, null, g.D0, sVar3, 196608, 26);
                                            sVar3.p(true);
                                            sVar3.p(true);
                                            b1Var40 = b1Var39;
                                            jVar9 = jVar8;
                                            b1Var41 = b1Var38;
                                            l1.g gVar11 = gVar4;
                                            ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var6)).f30175h, ((h1.s1) sVar3.j(c3Var7)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                            int iIntValue10 = ((Number) b1Var53.getValue()).intValue();
                                            z1.r rVarE5 = j0.c.E(oVar5, CropImageView.DEFAULT_ASPECT_RATIO, f15, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                            zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                            objQ14 = sVar3.Q();
                                            if (zF3) {
                                                final int i212 = 2;
                                                final l1.b1 b1Var616 = b1Var34;
                                                final l1.b1 b1Var617 = b1Var35;
                                                objQ14 = new fz.c() { // from class: mt.o3
                                                    @Override // fz.c
                                                    public final Object invoke(Object obj4) {
                                                        switch (i212) {
                                                            case 0:
                                                                Integer num = (Integer) obj4;
                                                                int iIntValue11 = num.intValue();
                                                                l1.b1 b1Var510 = b1Var53;
                                                                b1Var510.setValue(num);
                                                                g.D(jVar9, b1Var510, b1Var31, b1Var616, b1Var28, b1Var617, b1Var41, b1Var40, iIntValue11, 0, 0, 0, 0, false, 32256);
                                                                break;
                                                            case 1:
                                                                Boolean bool = (Boolean) obj4;
                                                                boolean zBooleanValue5 = bool.booleanValue();
                                                                l1.b1 b1Var511 = b1Var53;
                                                                b1Var511.setValue(bool);
                                                                g.D(jVar9, b1Var31, b1Var616, b1Var28, b1Var617, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                                break;
                                                            case 2:
                                                                Integer num2 = (Integer) obj4;
                                                                int iIntValue12 = num2.intValue();
                                                                l1.b1 b1Var512 = b1Var53;
                                                                b1Var512.setValue(num2);
                                                                g.D(jVar9, b1Var31, b1Var512, b1Var616, b1Var28, b1Var617, b1Var41, b1Var40, 0, iIntValue12, 0, 0, 0, false, 32000);
                                                                break;
                                                            default:
                                                                Integer num3 = (Integer) obj4;
                                                                int iIntValue13 = num3.intValue();
                                                                l1.b1 b1Var513 = b1Var53;
                                                                b1Var513.setValue(num3);
                                                                g.D(jVar9, b1Var31, b1Var616, b1Var28, b1Var617, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue13, false, 28416);
                                                                break;
                                                        }
                                                        return qy.b0.f48488a;
                                                    }
                                                };
                                                sVar3.o0(objQ14);
                                            } else {
                                                final int i213 = 2;
                                                final l1.b1 b1Var618 = b1Var34;
                                                final l1.b1 b1Var619 = b1Var35;
                                                objQ14 = new fz.c() { // from class: mt.o3
                                                    @Override // fz.c
                                                    public final Object invoke(Object obj4) {
                                                        switch (i213) {
                                                            case 0:
                                                                Integer num = (Integer) obj4;
                                                                int iIntValue11 = num.intValue();
                                                                l1.b1 b1Var510 = b1Var53;
                                                                b1Var510.setValue(num);
                                                                g.D(jVar9, b1Var510, b1Var31, b1Var618, b1Var28, b1Var619, b1Var41, b1Var40, iIntValue11, 0, 0, 0, 0, false, 32256);
                                                                break;
                                                            case 1:
                                                                Boolean bool = (Boolean) obj4;
                                                                boolean zBooleanValue5 = bool.booleanValue();
                                                                l1.b1 b1Var511 = b1Var53;
                                                                b1Var511.setValue(bool);
                                                                g.D(jVar9, b1Var31, b1Var618, b1Var28, b1Var619, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                                break;
                                                            case 2:
                                                                Integer num2 = (Integer) obj4;
                                                                int iIntValue12 = num2.intValue();
                                                                l1.b1 b1Var512 = b1Var53;
                                                                b1Var512.setValue(num2);
                                                                g.D(jVar9, b1Var31, b1Var512, b1Var618, b1Var28, b1Var619, b1Var41, b1Var40, 0, iIntValue12, 0, 0, 0, false, 32000);
                                                                break;
                                                            default:
                                                                Integer num3 = (Integer) obj4;
                                                                int iIntValue13 = num3.intValue();
                                                                l1.b1 b1Var513 = b1Var53;
                                                                b1Var513.setValue(num3);
                                                                g.D(jVar9, b1Var31, b1Var618, b1Var28, b1Var619, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue13, false, 28416);
                                                                break;
                                                        }
                                                        return qy.b0.f48488a;
                                                    }
                                                };
                                                sVar3.o0(objQ14);
                                            }
                                            ys.a.y(iIntValue10, 48, (fz.c) objQ14, sVar3, rVarE5);
                                            sVar3.p(true);
                                            sVar3.p(true);
                                        } else {
                                            gVar4 = gVar3;
                                        }
                                        b1Var32 = b1Var29;
                                        jVar6 = jVar5;
                                        b1Var33 = b1Var30;
                                        objQ12 = new p3(1, jVar6, b1Var57, b1Var31, b1Var53, b1Var28, b1Var27, b1Var33, b1Var32);
                                        b1Var34 = b1Var57;
                                        b1Var35 = b1Var27;
                                        sVar3.o0(objQ12);
                                        fz.a aVar11 = (fz.a) objQ12;
                                        if (((Number) b1Var34.getValue()).intValue() > 50) {
                                            z25 = true;
                                        } else {
                                            z25 = false;
                                        }
                                        jVar7 = jVar6;
                                        b1Var36 = b1Var33;
                                        b1Var37 = b1Var32;
                                        k7.h(aVar11, null, z25, null, g.C0, sVar3, 196608, 26);
                                        float f16 = 8;
                                        ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar5, f16, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                        zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                        objQ13 = sVar3.Q();
                                        if (zF2) {
                                            jVar8 = jVar7;
                                            b1Var38 = b1Var36;
                                            b1Var39 = b1Var37;
                                            objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                            sVar3.o0(objQ13);
                                        } else {
                                            jVar8 = jVar7;
                                            b1Var38 = b1Var36;
                                            b1Var39 = b1Var37;
                                            objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                            sVar3.o0(objQ13);
                                        }
                                        fz.a aVar12 = (fz.a) objQ13;
                                        if (((Number) b1Var34.getValue()).intValue() < 150) {
                                            z26 = true;
                                        } else {
                                            z26 = false;
                                        }
                                        k7.h(aVar12, null, z26, null, g.D0, sVar3, 196608, 26);
                                        sVar3.p(true);
                                        sVar3.p(true);
                                        b1Var40 = b1Var39;
                                        jVar9 = jVar8;
                                        b1Var41 = b1Var38;
                                        l1.g gVar12 = gVar4;
                                        ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var6)).f30175h, ((h1.s1) sVar3.j(c3Var7)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                        int iIntValue11 = ((Number) b1Var53.getValue()).intValue();
                                        z1.r rVarE6 = j0.c.E(oVar5, CropImageView.DEFAULT_ASPECT_RATIO, f16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                        zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                        objQ14 = sVar3.Q();
                                        if (zF3) {
                                            final int i214 = 2;
                                            final l1.b1 b1Var6110 = b1Var34;
                                            final l1.b1 b1Var6111 = b1Var35;
                                            objQ14 = new fz.c() { // from class: mt.o3
                                                @Override // fz.c
                                                public final Object invoke(Object obj4) {
                                                    switch (i214) {
                                                        case 0:
                                                            Integer num = (Integer) obj4;
                                                            int iIntValue12 = num.intValue();
                                                            l1.b1 b1Var510 = b1Var53;
                                                            b1Var510.setValue(num);
                                                            g.D(jVar9, b1Var510, b1Var31, b1Var6110, b1Var28, b1Var6111, b1Var41, b1Var40, iIntValue12, 0, 0, 0, 0, false, 32256);
                                                            break;
                                                        case 1:
                                                            Boolean bool = (Boolean) obj4;
                                                            boolean zBooleanValue5 = bool.booleanValue();
                                                            l1.b1 b1Var511 = b1Var53;
                                                            b1Var511.setValue(bool);
                                                            g.D(jVar9, b1Var31, b1Var6110, b1Var28, b1Var6111, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                            break;
                                                        case 2:
                                                            Integer num2 = (Integer) obj4;
                                                            int iIntValue13 = num2.intValue();
                                                            l1.b1 b1Var512 = b1Var53;
                                                            b1Var512.setValue(num2);
                                                            g.D(jVar9, b1Var31, b1Var512, b1Var6110, b1Var28, b1Var6111, b1Var41, b1Var40, 0, iIntValue13, 0, 0, 0, false, 32000);
                                                            break;
                                                        default:
                                                            Integer num3 = (Integer) obj4;
                                                            int iIntValue14 = num3.intValue();
                                                            l1.b1 b1Var513 = b1Var53;
                                                            b1Var513.setValue(num3);
                                                            g.D(jVar9, b1Var31, b1Var6110, b1Var28, b1Var6111, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue14, false, 28416);
                                                            break;
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            };
                                            sVar3.o0(objQ14);
                                        } else {
                                            final int i215 = 2;
                                            final l1.b1 b1Var6112 = b1Var34;
                                            final l1.b1 b1Var6113 = b1Var35;
                                            objQ14 = new fz.c() { // from class: mt.o3
                                                @Override // fz.c
                                                public final Object invoke(Object obj4) {
                                                    switch (i215) {
                                                        case 0:
                                                            Integer num = (Integer) obj4;
                                                            int iIntValue12 = num.intValue();
                                                            l1.b1 b1Var510 = b1Var53;
                                                            b1Var510.setValue(num);
                                                            g.D(jVar9, b1Var510, b1Var31, b1Var6112, b1Var28, b1Var6113, b1Var41, b1Var40, iIntValue12, 0, 0, 0, 0, false, 32256);
                                                            break;
                                                        case 1:
                                                            Boolean bool = (Boolean) obj4;
                                                            boolean zBooleanValue5 = bool.booleanValue();
                                                            l1.b1 b1Var511 = b1Var53;
                                                            b1Var511.setValue(bool);
                                                            g.D(jVar9, b1Var31, b1Var6112, b1Var28, b1Var6113, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                            break;
                                                        case 2:
                                                            Integer num2 = (Integer) obj4;
                                                            int iIntValue13 = num2.intValue();
                                                            l1.b1 b1Var512 = b1Var53;
                                                            b1Var512.setValue(num2);
                                                            g.D(jVar9, b1Var31, b1Var512, b1Var6112, b1Var28, b1Var6113, b1Var41, b1Var40, 0, iIntValue13, 0, 0, 0, false, 32000);
                                                            break;
                                                        default:
                                                            Integer num3 = (Integer) obj4;
                                                            int iIntValue14 = num3.intValue();
                                                            l1.b1 b1Var513 = b1Var53;
                                                            b1Var513.setValue(num3);
                                                            g.D(jVar9, b1Var31, b1Var6112, b1Var28, b1Var6113, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue14, false, 28416);
                                                            break;
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            };
                                            sVar3.o0(objQ14);
                                        }
                                        ys.a.y(iIntValue11, 48, (fz.c) objQ14, sVar3, rVarE6);
                                        sVar3.p(true);
                                        sVar3.p(true);
                                    } else {
                                        oVar = oVar2;
                                    }
                                    hVar = hVar6;
                                    defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
                                    l1.t.J(hVar7, rVarC8, sVar4);
                                    String strE7 = ub.a.e0(sVar4, R.string.audio_speed);
                                    l1.c3 c3Var8 = fc.f30256a;
                                    j3.y0 y0Var4 = ((dc) sVar4.j(c3Var8)).f30175h;
                                    l1.c3 c3Var9 = h1.v1.f31180a;
                                    hVar2 = hVar;
                                    j3.y0 y0VarA4 = j3.y0.a(y0Var4, ((h1.s1) sVar4.j(c3Var9)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                                    if (1.0f <= 0.0d) {
                                        k0.a.a("invalid weight; must be greater than zero");
                                    }
                                    sVar3 = sVar4;
                                    iVar2 = iVar;
                                    z1.o oVar6 = oVar;
                                    jVar5 = jVar4;
                                    b1Var27 = b1Var25;
                                    b1Var28 = b1Var12;
                                    b1Var29 = b1Var24;
                                    b1Var30 = b1Var26;
                                    b1Var31 = b1Var17;
                                    ua.b(strE7, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA4, sVar3, 0, 0, 65532);
                                    j0.a2 a2VarA6 = j0.z1.a(j0.i.f35303a, iVar5, sVar3, 48);
                                    iHashCode2 = Long.hashCode(sVar3.T);
                                    l1.q1 q1VarL8 = sVar3.l();
                                    z1.r rVarC10 = z1.a.c(sVar3, oVar6);
                                    sVar3.h0();
                                    if (sVar3.S) {
                                        sVar3.k(iVar2);
                                    } else {
                                        sVar3.r0();
                                    }
                                    l1.t.J(hVar4, a2VarA6, sVar3);
                                    l1.t.J(hVar5, q1VarL8, sVar3);
                                    if (sVar3.S) {
                                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                    } else {
                                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                    }
                                    l1.t.J(hVar7, rVarC10, sVar3);
                                    zF = sVar3.f(b1Var57) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var27) | sVar3.f(b1Var30) | sVar3.f(b1Var29) | sVar3.f(jVar5);
                                    objQ12 = sVar3.Q();
                                    if (zF) {
                                        gVar4 = gVar3;
                                        if (objQ12 == gVar4) {
                                            b1Var32 = b1Var29;
                                            jVar6 = jVar5;
                                            b1Var33 = b1Var30;
                                            b1Var35 = b1Var27;
                                            b1Var34 = b1Var57;
                                        }
                                        fz.a aVar13 = (fz.a) objQ12;
                                        if (((Number) b1Var34.getValue()).intValue() > 50) {
                                            z25 = true;
                                        } else {
                                            z25 = false;
                                        }
                                        jVar7 = jVar6;
                                        b1Var36 = b1Var33;
                                        b1Var37 = b1Var32;
                                        k7.h(aVar13, null, z25, null, g.C0, sVar3, 196608, 26);
                                        float f17 = 8;
                                        ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar6, f17, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                        zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                        objQ13 = sVar3.Q();
                                        if (zF2) {
                                            jVar8 = jVar7;
                                            b1Var38 = b1Var36;
                                            b1Var39 = b1Var37;
                                            objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                            sVar3.o0(objQ13);
                                        } else {
                                            jVar8 = jVar7;
                                            b1Var38 = b1Var36;
                                            b1Var39 = b1Var37;
                                            objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                            sVar3.o0(objQ13);
                                        }
                                        fz.a aVar14 = (fz.a) objQ13;
                                        if (((Number) b1Var34.getValue()).intValue() < 150) {
                                            z26 = true;
                                        } else {
                                            z26 = false;
                                        }
                                        k7.h(aVar14, null, z26, null, g.D0, sVar3, 196608, 26);
                                        sVar3.p(true);
                                        sVar3.p(true);
                                        b1Var40 = b1Var39;
                                        jVar9 = jVar8;
                                        b1Var41 = b1Var38;
                                        l1.g gVar13 = gVar4;
                                        ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var8)).f30175h, ((h1.s1) sVar3.j(c3Var9)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                        int iIntValue12 = ((Number) b1Var53.getValue()).intValue();
                                        z1.r rVarE7 = j0.c.E(oVar6, CropImageView.DEFAULT_ASPECT_RATIO, f17, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                        zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                        objQ14 = sVar3.Q();
                                        if (zF3) {
                                            final int i216 = 2;
                                            final l1.b1 b1Var6114 = b1Var34;
                                            final l1.b1 b1Var6115 = b1Var35;
                                            objQ14 = new fz.c() { // from class: mt.o3
                                                @Override // fz.c
                                                public final Object invoke(Object obj4) {
                                                    switch (i216) {
                                                        case 0:
                                                            Integer num = (Integer) obj4;
                                                            int iIntValue13 = num.intValue();
                                                            l1.b1 b1Var510 = b1Var53;
                                                            b1Var510.setValue(num);
                                                            g.D(jVar9, b1Var510, b1Var31, b1Var6114, b1Var28, b1Var6115, b1Var41, b1Var40, iIntValue13, 0, 0, 0, 0, false, 32256);
                                                            break;
                                                        case 1:
                                                            Boolean bool = (Boolean) obj4;
                                                            boolean zBooleanValue5 = bool.booleanValue();
                                                            l1.b1 b1Var511 = b1Var53;
                                                            b1Var511.setValue(bool);
                                                            g.D(jVar9, b1Var31, b1Var6114, b1Var28, b1Var6115, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                            break;
                                                        case 2:
                                                            Integer num2 = (Integer) obj4;
                                                            int iIntValue14 = num2.intValue();
                                                            l1.b1 b1Var512 = b1Var53;
                                                            b1Var512.setValue(num2);
                                                            g.D(jVar9, b1Var31, b1Var512, b1Var6114, b1Var28, b1Var6115, b1Var41, b1Var40, 0, iIntValue14, 0, 0, 0, false, 32000);
                                                            break;
                                                        default:
                                                            Integer num3 = (Integer) obj4;
                                                            int iIntValue15 = num3.intValue();
                                                            l1.b1 b1Var513 = b1Var53;
                                                            b1Var513.setValue(num3);
                                                            g.D(jVar9, b1Var31, b1Var6114, b1Var28, b1Var6115, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue15, false, 28416);
                                                            break;
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            };
                                            sVar3.o0(objQ14);
                                        } else {
                                            final int i217 = 2;
                                            final l1.b1 b1Var6116 = b1Var34;
                                            final l1.b1 b1Var6117 = b1Var35;
                                            objQ14 = new fz.c() { // from class: mt.o3
                                                @Override // fz.c
                                                public final Object invoke(Object obj4) {
                                                    switch (i217) {
                                                        case 0:
                                                            Integer num = (Integer) obj4;
                                                            int iIntValue13 = num.intValue();
                                                            l1.b1 b1Var510 = b1Var53;
                                                            b1Var510.setValue(num);
                                                            g.D(jVar9, b1Var510, b1Var31, b1Var6116, b1Var28, b1Var6117, b1Var41, b1Var40, iIntValue13, 0, 0, 0, 0, false, 32256);
                                                            break;
                                                        case 1:
                                                            Boolean bool = (Boolean) obj4;
                                                            boolean zBooleanValue5 = bool.booleanValue();
                                                            l1.b1 b1Var511 = b1Var53;
                                                            b1Var511.setValue(bool);
                                                            g.D(jVar9, b1Var31, b1Var6116, b1Var28, b1Var6117, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                            break;
                                                        case 2:
                                                            Integer num2 = (Integer) obj4;
                                                            int iIntValue14 = num2.intValue();
                                                            l1.b1 b1Var512 = b1Var53;
                                                            b1Var512.setValue(num2);
                                                            g.D(jVar9, b1Var31, b1Var512, b1Var6116, b1Var28, b1Var6117, b1Var41, b1Var40, 0, iIntValue14, 0, 0, 0, false, 32000);
                                                            break;
                                                        default:
                                                            Integer num3 = (Integer) obj4;
                                                            int iIntValue15 = num3.intValue();
                                                            l1.b1 b1Var513 = b1Var53;
                                                            b1Var513.setValue(num3);
                                                            g.D(jVar9, b1Var31, b1Var6116, b1Var28, b1Var6117, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue15, false, 28416);
                                                            break;
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            };
                                            sVar3.o0(objQ14);
                                        }
                                        ys.a.y(iIntValue12, 48, (fz.c) objQ14, sVar3, rVarE7);
                                        sVar3.p(true);
                                        sVar3.p(true);
                                    } else {
                                        gVar4 = gVar3;
                                    }
                                    b1Var32 = b1Var29;
                                    jVar6 = jVar5;
                                    b1Var33 = b1Var30;
                                    objQ12 = new p3(1, jVar6, b1Var57, b1Var31, b1Var53, b1Var28, b1Var27, b1Var33, b1Var32);
                                    b1Var34 = b1Var57;
                                    b1Var35 = b1Var27;
                                    sVar3.o0(objQ12);
                                    fz.a aVar15 = (fz.a) objQ12;
                                    if (((Number) b1Var34.getValue()).intValue() > 50) {
                                        z25 = true;
                                    } else {
                                        z25 = false;
                                    }
                                    jVar7 = jVar6;
                                    b1Var36 = b1Var33;
                                    b1Var37 = b1Var32;
                                    k7.h(aVar15, null, z25, null, g.C0, sVar3, 196608, 26);
                                    float f18 = 8;
                                    ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar6, f18, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                    zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                    objQ13 = sVar3.Q();
                                    if (zF2) {
                                        jVar8 = jVar7;
                                        b1Var38 = b1Var36;
                                        b1Var39 = b1Var37;
                                        objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                        sVar3.o0(objQ13);
                                    } else {
                                        jVar8 = jVar7;
                                        b1Var38 = b1Var36;
                                        b1Var39 = b1Var37;
                                        objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                        sVar3.o0(objQ13);
                                    }
                                    fz.a aVar16 = (fz.a) objQ13;
                                    if (((Number) b1Var34.getValue()).intValue() < 150) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    k7.h(aVar16, null, z26, null, g.D0, sVar3, 196608, 26);
                                    sVar3.p(true);
                                    sVar3.p(true);
                                    b1Var40 = b1Var39;
                                    jVar9 = jVar8;
                                    b1Var41 = b1Var38;
                                    l1.g gVar14 = gVar4;
                                    ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var8)).f30175h, ((h1.s1) sVar3.j(c3Var9)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                    int iIntValue13 = ((Number) b1Var53.getValue()).intValue();
                                    z1.r rVarE8 = j0.c.E(oVar6, CropImageView.DEFAULT_ASPECT_RATIO, f18, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                    zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                    objQ14 = sVar3.Q();
                                    if (zF3) {
                                        final int i218 = 2;
                                        final l1.b1 b1Var6118 = b1Var34;
                                        final l1.b1 b1Var6119 = b1Var35;
                                        objQ14 = new fz.c() { // from class: mt.o3
                                            @Override // fz.c
                                            public final Object invoke(Object obj4) {
                                                switch (i218) {
                                                    case 0:
                                                        Integer num = (Integer) obj4;
                                                        int iIntValue14 = num.intValue();
                                                        l1.b1 b1Var510 = b1Var53;
                                                        b1Var510.setValue(num);
                                                        g.D(jVar9, b1Var510, b1Var31, b1Var6118, b1Var28, b1Var6119, b1Var41, b1Var40, iIntValue14, 0, 0, 0, 0, false, 32256);
                                                        break;
                                                    case 1:
                                                        Boolean bool = (Boolean) obj4;
                                                        boolean zBooleanValue5 = bool.booleanValue();
                                                        l1.b1 b1Var511 = b1Var53;
                                                        b1Var511.setValue(bool);
                                                        g.D(jVar9, b1Var31, b1Var6118, b1Var28, b1Var6119, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                        break;
                                                    case 2:
                                                        Integer num2 = (Integer) obj4;
                                                        int iIntValue15 = num2.intValue();
                                                        l1.b1 b1Var512 = b1Var53;
                                                        b1Var512.setValue(num2);
                                                        g.D(jVar9, b1Var31, b1Var512, b1Var6118, b1Var28, b1Var6119, b1Var41, b1Var40, 0, iIntValue15, 0, 0, 0, false, 32000);
                                                        break;
                                                    default:
                                                        Integer num3 = (Integer) obj4;
                                                        int iIntValue16 = num3.intValue();
                                                        l1.b1 b1Var513 = b1Var53;
                                                        b1Var513.setValue(num3);
                                                        g.D(jVar9, b1Var31, b1Var6118, b1Var28, b1Var6119, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue16, false, 28416);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar3.o0(objQ14);
                                    } else {
                                        final int i219 = 2;
                                        final l1.b1 b1Var61110 = b1Var34;
                                        final l1.b1 b1Var61111 = b1Var35;
                                        objQ14 = new fz.c() { // from class: mt.o3
                                            @Override // fz.c
                                            public final Object invoke(Object obj4) {
                                                switch (i219) {
                                                    case 0:
                                                        Integer num = (Integer) obj4;
                                                        int iIntValue14 = num.intValue();
                                                        l1.b1 b1Var510 = b1Var53;
                                                        b1Var510.setValue(num);
                                                        g.D(jVar9, b1Var510, b1Var31, b1Var61110, b1Var28, b1Var61111, b1Var41, b1Var40, iIntValue14, 0, 0, 0, 0, false, 32256);
                                                        break;
                                                    case 1:
                                                        Boolean bool = (Boolean) obj4;
                                                        boolean zBooleanValue5 = bool.booleanValue();
                                                        l1.b1 b1Var511 = b1Var53;
                                                        b1Var511.setValue(bool);
                                                        g.D(jVar9, b1Var31, b1Var61110, b1Var28, b1Var61111, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                        break;
                                                    case 2:
                                                        Integer num2 = (Integer) obj4;
                                                        int iIntValue15 = num2.intValue();
                                                        l1.b1 b1Var512 = b1Var53;
                                                        b1Var512.setValue(num2);
                                                        g.D(jVar9, b1Var31, b1Var512, b1Var61110, b1Var28, b1Var61111, b1Var41, b1Var40, 0, iIntValue15, 0, 0, 0, false, 32000);
                                                        break;
                                                    default:
                                                        Integer num3 = (Integer) obj4;
                                                        int iIntValue16 = num3.intValue();
                                                        l1.b1 b1Var513 = b1Var53;
                                                        b1Var513.setValue(num3);
                                                        g.D(jVar9, b1Var31, b1Var61110, b1Var28, b1Var61111, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue16, false, 28416);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar3.o0(objQ14);
                                    }
                                    ys.a.y(iIntValue13, 48, (fz.c) objQ14, sVar3, rVarE8);
                                    sVar3.p(true);
                                    sVar3.p(true);
                                } else {
                                    sVar4.W();
                                }
                                return qy.b0.f48488a;
                            }
                        }, sVar2), sVar, (i17 >> 21) & 14, 384, 4090);
                    } else {
                        z15 = false;
                    }
                    strArrD = hh.p0.D(sVar2, -897998839, R.array.korean_display_item, sVar2, z15);
                    final String[] strArr5 = strArrD;
                    if (((fr.o0) xt.b.c()).f27733a.enableNativeSpeakerVideos) {
                        sVar2.d0(-2067162217);
                        strArr = new String[]{oz.x.q0(oz.x.q0(tv.a.l(tv.a.n(((Number) sVar2.j(c3Var)).intValue()), sVar2), " 1", BuildConfig.VERSION_NAME), " 2", BuildConfig.VERSION_NAME), ub.a.e0(sVar2, R.string.translation), ub.a.e0(sVar2, R.string.audio), ub.a.e0(sVar2, R.string.mixed)};
                        sVar2.p(false);
                    } else {
                        sVar2.d0(-2067162217);
                        strArr = new String[]{oz.x.q0(oz.x.q0(tv.a.l(tv.a.n(((Number) sVar2.j(c3Var)).intValue()), sVar2), " 1", BuildConfig.VERSION_NAME), " 2", BuildConfig.VERSION_NAME), ub.a.e0(sVar2, R.string.translation), ub.a.e0(sVar2, R.string.audio), ub.a.e0(sVar2, R.string.mixed)};
                        sVar2.p(false);
                    }
                    final String[] strArr6 = {ub.a.e0(sVar2, R.string.off), ub.a.e0(sVar2, R.string.before_answer), ub.a.e0(sVar2, R.string.after_answer)};
                    length = strArr.length - 1;
                    if (((Number) b1Var4.getValue()).intValue() == -1) {
                        iIntValue = length;
                    } else {
                        iIntValue = ((Number) b1Var4.getValue()).intValue();
                    }
                    if (((Number) b1Var4.getValue()).intValue() == -1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z13);
                    zG = sVar2.g(z13);
                    objQ = sVar2.Q();
                    if (zG) {
                        objQ = new g.m(2, b1Var9, null, z13);
                        sVar2.o0(objQ);
                    } else {
                        objQ = new g.m(2, b1Var9, null, z13);
                        sVar2.o0(objQ);
                    }
                    l1.t.f((fz.e) objQ, boolValueOf2, sVar2);
                    final int i110 = iIntValue;
                    final boolean z24 = z13;
                    final int i111 = iIntValue2;
                    final String[] strArr7 = strArr;
                    sVar = sVar2;
                    h1.a6.a(onDismissRequest, null, e8VarF, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-862581764, new fz.f() { // from class: mt.n3
                        /* JADX WARN: Code duplicated, block: B:104:0x0558  */
                        /* JADX WARN: Code duplicated, block: B:107:0x05ed  */
                        /* JADX WARN: Code duplicated, block: B:108:0x05f1  */
                        /* JADX WARN: Code duplicated, block: B:111:0x05fe  */
                        /* JADX WARN: Code duplicated, block: B:113:0x060c  */
                        /* JADX WARN: Code duplicated, block: B:116:0x064f  */
                        /* JADX WARN: Code duplicated, block: B:119:0x0654  */
                        /* JADX WARN: Code duplicated, block: B:120:0x065d  */
                        /* JADX WARN: Code duplicated, block: B:124:0x0690  */
                        /* JADX WARN: Code duplicated, block: B:125:0x0692  */
                        /* JADX WARN: Code duplicated, block: B:128:0x073c A[ADDED_TO_REGION] */
                        /* JADX WARN: Code duplicated, block: B:131:0x0746  */
                        /* JADX WARN: Code duplicated, block: B:134:0x0773  */
                        /* JADX WARN: Code duplicated, block: B:135:0x0775  */
                        /* JADX WARN: Code duplicated, block: B:138:0x0846  */
                        /* JADX WARN: Code duplicated, block: B:140:0x084a  */
                        /* JADX WARN: Code duplicated, block: B:89:0x04c8  */
                        /* JADX WARN: Code duplicated, block: B:91:0x04d2  */
                        /* JADX WARN: Code duplicated, block: B:94:0x04e4  */
                        /* JADX WARN: Code duplicated, block: B:97:0x04f7  */
                        /* JADX WARN: Code duplicated, block: B:99:0x04fc  */
                        @Override // fz.f
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            l1.b1 b1Var11;
                            l1.b1 b1Var12;
                            final fz.j jVar;
                            final l1.b1 b1Var13;
                            final l1.b1 b1Var14;
                            final l1.b1 b1Var15;
                            final l1.b1 b1Var16;
                            l1.b1 b1Var17;
                            l1.b1 b1Var18;
                            final l1.b1 b1Var19;
                            l1.b1 b1Var20;
                            l1.b1 b1Var21;
                            l1.b1 b1Var22;
                            fz.j jVar2;
                            boolean z25;
                            l1.b1 b1Var23;
                            fz.j jVar3;
                            l1.g gVar2;
                            final fz.j jVar4;
                            l1.b1 b1Var24;
                            l1.b1 b1Var25;
                            l1.b1 b1Var26;
                            int iHashCode;
                            y2.i iVar;
                            l1.g gVar3;
                            z1.o oVar;
                            y2.h hVar;
                            y2.h hVar2;
                            l1.s sVar3;
                            y2.i iVar2;
                            fz.j jVar5;
                            l1.b1 b1Var27;
                            final l1.b1 b1Var28;
                            l1.b1 b1Var29;
                            l1.b1 b1Var30;
                            final l1.b1 b1Var31;
                            int iHashCode2;
                            boolean zF;
                            Object objQ12;
                            l1.g gVar4;
                            l1.b1 b1Var32;
                            fz.j jVar6;
                            l1.b1 b1Var33;
                            l1.b1 b1Var34;
                            l1.b1 b1Var35;
                            boolean z26;
                            fz.j jVar7;
                            l1.b1 b1Var36;
                            l1.b1 b1Var37;
                            boolean zF2;
                            Object objQ13;
                            fz.j jVar8;
                            l1.b1 b1Var38;
                            l1.b1 b1Var39;
                            boolean z27;
                            final l1.b1 b1Var40;
                            final fz.j jVar9;
                            final l1.b1 b1Var41;
                            boolean zF3;
                            Object objQ14;
                            j0.v ModalBottomSheet = (j0.v) obj;
                            l1.n nVar2 = (l1.n) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                            l1.s sVar4 = (l1.s) nVar2;
                            if (sVar4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                z1.o oVar2 = z1.o.f58481a;
                                z1.r rVarC = j0.e2.c(j0.e2.e(oVar2, 1.0f), 0.7f);
                                j0.d dVar = j0.i.f35305c;
                                z1.h hVar3 = z1.c.O;
                                j0.u uVarA = j0.t.a(dVar, hVar3, sVar4, 0);
                                int iHashCode3 = Long.hashCode(sVar4.T);
                                l1.q1 q1VarL = sVar4.l();
                                z1.r rVarC2 = z1.a.c(sVar4, rVarC);
                                y2.k.J.getClass();
                                y2.i iVar3 = y2.j.f56913b;
                                sVar4.h0();
                                if (sVar4.S) {
                                    sVar4.k(iVar3);
                                } else {
                                    sVar4.r0();
                                }
                                y2.h hVar4 = y2.j.f56917f;
                                l1.t.J(hVar4, uVarA, sVar4);
                                y2.h hVar5 = y2.j.f56916e;
                                l1.t.J(hVar5, q1VarL, sVar4);
                                y2.h hVar6 = y2.j.f56918g;
                                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                                    defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar6);
                                }
                                y2.h hVar7 = y2.j.f56915d;
                                l1.t.J(hVar7, rVarC2, sVar4);
                                String strE0 = ub.a.e0(sVar4, R.string.settings);
                                Object objQ15 = sVar4.Q();
                                l1.g gVar5 = l1.m.f39353a;
                                if (objQ15 == gVar5) {
                                    objQ15 = new ju.d(25);
                                    sVar4.o0(objQ15);
                                }
                                ys.a.l(432, (fz.a) objQ15, strE0, sVar4, false);
                                z1.r rVarC3 = j0.c.C(d0.n.y(oVar2, d0.n.u(sVar4), true, 12), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                j0.u uVarA2 = j0.t.a(dVar, hVar3, sVar4, 0);
                                int iHashCode4 = Long.hashCode(sVar4.T);
                                l1.q1 q1VarL2 = sVar4.l();
                                z1.r rVarC4 = z1.a.c(sVar4, rVarC3);
                                sVar4.h0();
                                if (sVar4.S) {
                                    sVar4.k(iVar3);
                                } else {
                                    sVar4.r0();
                                }
                                l1.t.J(hVar4, uVarA2, sVar4);
                                l1.t.J(hVar5, q1VarL2, sVar4);
                                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode4))) {
                                    defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar6);
                                }
                                l1.t.J(hVar7, rVarC4, sVar4);
                                String strE1 = ub.a.e0(sVar4, R.string.display_in);
                                l1.b1 b1Var42 = b1Var8;
                                boolean zBooleanValue = ((Boolean) b1Var42.getValue()).booleanValue();
                                Object objQ16 = sVar4.Q();
                                if (objQ16 == gVar5) {
                                    objQ16 = new p(6, b1Var42);
                                    sVar4.o0(objQ16);
                                }
                                fz.c cVar = (fz.c) objQ16;
                                int i21 = length;
                                boolean zD = sVar4.d(i21);
                                l1.b1 b1Var43 = b1Var4;
                                boolean zF4 = zD | sVar4.f(b1Var43);
                                l1.b1 b1Var44 = b1Var;
                                boolean zF5 = zF4 | sVar4.f(b1Var44);
                                l1.b1 b1Var45 = b1Var2;
                                boolean zF6 = zF5 | sVar4.f(b1Var45);
                                l1.b1 b1Var46 = b1Var3;
                                boolean zF7 = zF6 | sVar4.f(b1Var46);
                                final l1.b1 b1Var47 = b1Var5;
                                boolean zF8 = zF7 | sVar4.f(b1Var47);
                                l1.b1 b1Var48 = b1Var6;
                                boolean zF9 = zF8 | sVar4.f(b1Var48);
                                l1.b1 b1Var49 = b1Var7;
                                boolean zF10 = zF9 | sVar4.f(b1Var49);
                                fz.j jVar10 = onSettingChange;
                                boolean zF11 = zF10 | sVar4.f(jVar10);
                                Object objQ17 = sVar4.Q();
                                if (zF11 || objQ17 == gVar5) {
                                    b1Var11 = b1Var44;
                                    objQ17 = new r3(i21, jVar10, b1Var43, b1Var11, b1Var45, b1Var46, b1Var47, b1Var48, b1Var49);
                                    b1Var12 = b1Var43;
                                    sVar4.o0(objQ17);
                                } else {
                                    b1Var12 = b1Var43;
                                    b1Var11 = b1Var44;
                                }
                                l1.g gVar6 = gVar5;
                                ys.a.i(strE1, strArr7, i110, zBooleanValue, false, cVar, (fz.c) objQ17, sVar4, 196608, 16);
                                int iL = hz.b.l(((Number) b1Var47.getValue()).intValue(), 0, 2);
                                final l1.b1 b1Var50 = b1Var11;
                                String strE2 = ub.a.e0(sVar4, R.string.audio_auto_play);
                                l1.b1 b1Var51 = b1Var9;
                                boolean zBooleanValue2 = ((Boolean) b1Var51.getValue()).booleanValue();
                                boolean z28 = !z24;
                                Object objQ18 = sVar4.Q();
                                if (objQ18 == gVar6) {
                                    objQ18 = new p(7, b1Var51);
                                    sVar4.o0(objQ18);
                                }
                                fz.c cVar2 = (fz.c) objQ18;
                                boolean zF12 = sVar4.f(b1Var47) | sVar4.f(b1Var50) | sVar4.f(b1Var45) | sVar4.f(b1Var46) | sVar4.f(b1Var12) | sVar4.f(b1Var48) | sVar4.f(b1Var49) | sVar4.f(jVar10);
                                Object objQ19 = sVar4.Q();
                                if (zF12 || objQ19 == gVar6) {
                                    final int i22 = 3;
                                    final l1.b1 b1Var52 = b1Var12;
                                    jVar = jVar10;
                                    b1Var13 = b1Var45;
                                    b1Var14 = b1Var46;
                                    b1Var15 = b1Var48;
                                    b1Var16 = b1Var49;
                                    objQ19 = new fz.c() { // from class: mt.o3
                                        @Override // fz.c
                                        public final Object invoke(Object obj4) {
                                            switch (i22) {
                                                case 0:
                                                    Integer num = (Integer) obj4;
                                                    int iIntValue14 = num.intValue();
                                                    l1.b1 b1Var510 = b1Var47;
                                                    b1Var510.setValue(num);
                                                    g.D(jVar, b1Var510, b1Var50, b1Var13, b1Var14, b1Var52, b1Var15, b1Var16, iIntValue14, 0, 0, 0, 0, false, 32256);
                                                    break;
                                                case 1:
                                                    Boolean bool = (Boolean) obj4;
                                                    boolean zBooleanValue5 = bool.booleanValue();
                                                    l1.b1 b1Var511 = b1Var47;
                                                    b1Var511.setValue(bool);
                                                    g.D(jVar, b1Var50, b1Var13, b1Var14, b1Var52, b1Var15, b1Var16, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                    break;
                                                case 2:
                                                    Integer num2 = (Integer) obj4;
                                                    int iIntValue15 = num2.intValue();
                                                    l1.b1 b1Var512 = b1Var47;
                                                    b1Var512.setValue(num2);
                                                    g.D(jVar, b1Var50, b1Var512, b1Var13, b1Var14, b1Var52, b1Var15, b1Var16, 0, iIntValue15, 0, 0, 0, false, 32000);
                                                    break;
                                                default:
                                                    Integer num3 = (Integer) obj4;
                                                    int iIntValue16 = num3.intValue();
                                                    l1.b1 b1Var513 = b1Var47;
                                                    b1Var513.setValue(num3);
                                                    g.D(jVar, b1Var50, b1Var13, b1Var14, b1Var52, b1Var513, b1Var15, b1Var16, 0, 0, 0, 0, iIntValue16, false, 28416);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    b1Var17 = b1Var50;
                                    b1Var18 = b1Var47;
                                    sVar4.o0(objQ19);
                                } else {
                                    jVar = jVar10;
                                    b1Var17 = b1Var50;
                                    b1Var13 = b1Var45;
                                    b1Var14 = b1Var46;
                                    b1Var18 = b1Var47;
                                    b1Var15 = b1Var48;
                                    b1Var16 = b1Var49;
                                }
                                final fz.j jVar11 = jVar;
                                final l1.b1 b1Var53 = b1Var13;
                                final l1.b1 b1Var54 = b1Var18;
                                l1.b1 b1Var55 = b1Var15;
                                final l1.b1 b1Var56 = b1Var16;
                                final l1.b1 b1Var57 = b1Var14;
                                ys.a.i(strE2, strArr6, iL, zBooleanValue2, z28, cVar2, (fz.c) objQ19, sVar4, 196608, 0);
                                String[] strArr8 = strArr5;
                                if (strArr8.length == 0) {
                                    sVar4.d0(1050243442);
                                    sVar4.p(false);
                                    b1Var21 = b1Var54;
                                    b1Var20 = b1Var55;
                                    b1Var22 = b1Var56;
                                    gVar6 = gVar6;
                                    jVar2 = jVar11;
                                } else {
                                    sVar4.d0(1058794978);
                                    int iL2 = hz.b.l(((Number) b1Var17.getValue()).intValue(), 0, strArr8.length - 1);
                                    int i23 = i111;
                                    String strE = ys.a.E(sVar4, i23);
                                    l1.b1 b1Var58 = b1Var10;
                                    boolean zBooleanValue3 = ((Boolean) b1Var58.getValue()).booleanValue();
                                    Object objQ20 = sVar4.Q();
                                    if (objQ20 == gVar6) {
                                        objQ20 = new p(8, b1Var58);
                                        sVar4.o0(objQ20);
                                    }
                                    fz.c cVar3 = (fz.c) objQ20;
                                    boolean zF13 = sVar4.f(b1Var17) | sVar4.f(b1Var53) | sVar4.f(b1Var57) | sVar4.f(b1Var12) | sVar4.f(b1Var54) | sVar4.f(b1Var55) | sVar4.f(b1Var56) | sVar4.f(jVar11);
                                    Object objQ21 = sVar4.Q();
                                    if (zF13 || objQ21 == gVar6) {
                                        final int i24 = 0;
                                        final l1.b1 b1Var59 = b1Var17;
                                        final l1.b1 b1Var60 = b1Var12;
                                        b1Var19 = b1Var55;
                                        objQ21 = new fz.c() { // from class: mt.o3
                                            @Override // fz.c
                                            public final Object invoke(Object obj4) {
                                                switch (i24) {
                                                    case 0:
                                                        Integer num = (Integer) obj4;
                                                        int iIntValue14 = num.intValue();
                                                        l1.b1 b1Var510 = b1Var59;
                                                        b1Var510.setValue(num);
                                                        g.D(jVar11, b1Var510, b1Var53, b1Var57, b1Var60, b1Var54, b1Var19, b1Var56, iIntValue14, 0, 0, 0, 0, false, 32256);
                                                        break;
                                                    case 1:
                                                        Boolean bool = (Boolean) obj4;
                                                        boolean zBooleanValue5 = bool.booleanValue();
                                                        l1.b1 b1Var511 = b1Var59;
                                                        b1Var511.setValue(bool);
                                                        g.D(jVar11, b1Var53, b1Var57, b1Var60, b1Var54, b1Var19, b1Var56, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                        break;
                                                    case 2:
                                                        Integer num2 = (Integer) obj4;
                                                        int iIntValue15 = num2.intValue();
                                                        l1.b1 b1Var512 = b1Var59;
                                                        b1Var512.setValue(num2);
                                                        g.D(jVar11, b1Var53, b1Var512, b1Var57, b1Var60, b1Var54, b1Var19, b1Var56, 0, iIntValue15, 0, 0, 0, false, 32000);
                                                        break;
                                                    default:
                                                        Integer num3 = (Integer) obj4;
                                                        int iIntValue16 = num3.intValue();
                                                        l1.b1 b1Var513 = b1Var59;
                                                        b1Var513.setValue(num3);
                                                        g.D(jVar11, b1Var53, b1Var57, b1Var60, b1Var54, b1Var513, b1Var19, b1Var56, 0, 0, 0, 0, iIntValue16, false, 28416);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar4.o0(objQ21);
                                    } else {
                                        b1Var19 = b1Var55;
                                    }
                                    fz.c cVar4 = (fz.c) objQ21;
                                    l1.b1 b1Var61 = b1Var19;
                                    ys.a.i(strE, strArr8, iL2, zBooleanValue3, false, cVar3, cVar4, sVar4, 196608, 16);
                                    int iIntValue4 = ((Number) b1Var17.getValue()).intValue();
                                    Integer numValueOf = ys.a.F(i23, iIntValue4) ? Integer.valueOf(iIntValue4) : null;
                                    if (numValueOf != null) {
                                        sVar4.d0(1059792899);
                                        int iIntValue5 = numValueOf.intValue();
                                        float fFloatValue = ((Number) b1Var61.getValue()).floatValue();
                                        boolean zF14 = sVar4.f(b1Var61);
                                        Object objQ22 = sVar4.Q();
                                        if (zF14 || objQ22 == gVar6) {
                                            objQ22 = new p(5, b1Var61);
                                            sVar4.o0(objQ22);
                                        }
                                        fz.c cVar5 = (fz.c) objQ22;
                                        boolean zF15 = sVar4.f(b1Var17) | sVar4.f(b1Var53) | sVar4.f(b1Var57) | sVar4.f(b1Var12) | sVar4.f(b1Var54) | sVar4.f(b1Var61) | sVar4.f(b1Var56) | sVar4.f(jVar11);
                                        Object objQ23 = sVar4.Q();
                                        if (zF15 || objQ23 == gVar6) {
                                            objQ23 = new p3(jVar11, b1Var17, b1Var53, b1Var57, b1Var12, b1Var54, b1Var61, b1Var56);
                                            b1Var21 = b1Var54;
                                            b1Var20 = b1Var61;
                                            b1Var23 = b1Var56;
                                            jVar3 = jVar11;
                                            sVar4.o0(objQ23);
                                        } else {
                                            jVar3 = jVar11;
                                            b1Var23 = b1Var56;
                                            b1Var20 = b1Var61;
                                            b1Var21 = b1Var54;
                                        }
                                        jVar2 = jVar3;
                                        b1Var22 = b1Var23;
                                        ys.a.k(i23, iIntValue5, fFloatValue, cVar5, (fz.a) objQ23, null, sVar4, 0);
                                        sVar4 = sVar4;
                                        z25 = false;
                                    } else {
                                        b1Var20 = b1Var61;
                                        b1Var21 = b1Var54;
                                        b1Var22 = b1Var56;
                                        jVar2 = jVar11;
                                        z25 = false;
                                        sVar4.d0(1050243442);
                                    }
                                    sVar4.p(z25);
                                    sVar4.p(z25);
                                }
                                String strE3 = ub.a.e0(sVar4, R.string.sound_effect);
                                boolean zBooleanValue4 = ((Boolean) b1Var22.getValue()).booleanValue();
                                boolean zF16 = sVar4.f(b1Var22) | sVar4.f(b1Var17) | sVar4.f(b1Var53) | sVar4.f(b1Var57) | sVar4.f(b1Var12) | sVar4.f(b1Var21) | sVar4.f(b1Var20) | sVar4.f(jVar2);
                                Object objQ24 = sVar4.Q();
                                if (zF16) {
                                    gVar2 = gVar6;
                                } else {
                                    gVar2 = gVar6;
                                    if (objQ24 != gVar2) {
                                        jVar4 = jVar2;
                                        b1Var24 = b1Var22;
                                        b1Var25 = b1Var21;
                                        b1Var26 = b1Var20;
                                    }
                                    ys.a.m(strE3, zBooleanValue4, (fz.c) objQ24, sVar4, 0);
                                    z1.r rVarI2 = j0.e2.i(j0.e2.e(oVar2, 1.0f), 62, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    j0.e eVar2 = j0.i.f35309g;
                                    z1.i iVar5 = z1.c.M;
                                    j0.a2 a2VarA4 = j0.z1.a(eVar2, iVar5, sVar4, 54);
                                    iHashCode = Long.hashCode(sVar4.T);
                                    l1.q1 q1VarL6 = sVar4.l();
                                    z1.r rVarC8 = z1.a.c(sVar4, rVarI2);
                                    sVar4.h0();
                                    if (sVar4.S) {
                                        iVar = iVar3;
                                        sVar4.k(iVar);
                                    } else {
                                        iVar = iVar3;
                                        sVar4.r0();
                                    }
                                    gVar3 = gVar2;
                                    l1.t.J(hVar4, a2VarA4, sVar4);
                                    l1.t.J(hVar5, q1VarL6, sVar4);
                                    if (sVar4.S) {
                                        oVar = oVar2;
                                    } else {
                                        oVar = oVar2;
                                        if (!kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                                            hVar = hVar6;
                                        }
                                        l1.t.J(hVar7, rVarC8, sVar4);
                                        String strE7 = ub.a.e0(sVar4, R.string.audio_speed);
                                        l1.c3 c3Var8 = fc.f30256a;
                                        j3.y0 y0Var4 = ((dc) sVar4.j(c3Var8)).f30175h;
                                        l1.c3 c3Var9 = h1.v1.f31180a;
                                        hVar2 = hVar;
                                        j3.y0 y0VarA4 = j3.y0.a(y0Var4, ((h1.s1) sVar4.j(c3Var9)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                                        if (1.0f <= 0.0d) {
                                            k0.a.a("invalid weight; must be greater than zero");
                                        }
                                        sVar3 = sVar4;
                                        iVar2 = iVar;
                                        z1.o oVar6 = oVar;
                                        jVar5 = jVar4;
                                        b1Var27 = b1Var25;
                                        b1Var28 = b1Var12;
                                        b1Var29 = b1Var24;
                                        b1Var30 = b1Var26;
                                        b1Var31 = b1Var17;
                                        ua.b(strE7, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA4, sVar3, 0, 0, 65532);
                                        j0.a2 a2VarA6 = j0.z1.a(j0.i.f35303a, iVar5, sVar3, 48);
                                        iHashCode2 = Long.hashCode(sVar3.T);
                                        l1.q1 q1VarL8 = sVar3.l();
                                        z1.r rVarC10 = z1.a.c(sVar3, oVar6);
                                        sVar3.h0();
                                        if (sVar3.S) {
                                            sVar3.k(iVar2);
                                        } else {
                                            sVar3.r0();
                                        }
                                        l1.t.J(hVar4, a2VarA6, sVar3);
                                        l1.t.J(hVar5, q1VarL8, sVar3);
                                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                                            defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                        }
                                        l1.t.J(hVar7, rVarC10, sVar3);
                                        zF = sVar3.f(b1Var57) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var27) | sVar3.f(b1Var30) | sVar3.f(b1Var29) | sVar3.f(jVar5);
                                        objQ12 = sVar3.Q();
                                        if (zF) {
                                            gVar4 = gVar3;
                                        } else {
                                            gVar4 = gVar3;
                                            if (objQ12 == gVar4) {
                                                b1Var32 = b1Var29;
                                                jVar6 = jVar5;
                                                b1Var33 = b1Var30;
                                                b1Var35 = b1Var27;
                                                b1Var34 = b1Var57;
                                            }
                                            fz.a aVar15 = (fz.a) objQ12;
                                            if (((Number) b1Var34.getValue()).intValue() > 50) {
                                                z26 = true;
                                            } else {
                                                z26 = false;
                                            }
                                            jVar7 = jVar6;
                                            b1Var36 = b1Var33;
                                            b1Var37 = b1Var32;
                                            k7.h(aVar15, null, z26, null, g.C0, sVar3, 196608, 26);
                                            float f18 = 8;
                                            ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar6, f18, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                            zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                            objQ13 = sVar3.Q();
                                            if (!zF2 || objQ13 == gVar4) {
                                                jVar8 = jVar7;
                                                b1Var38 = b1Var36;
                                                b1Var39 = b1Var37;
                                                objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                                sVar3.o0(objQ13);
                                            } else {
                                                jVar8 = jVar7;
                                                b1Var38 = b1Var36;
                                                b1Var39 = b1Var37;
                                            }
                                            fz.a aVar16 = (fz.a) objQ13;
                                            if (((Number) b1Var34.getValue()).intValue() < 150) {
                                                z27 = true;
                                            } else {
                                                z27 = false;
                                            }
                                            k7.h(aVar16, null, z27, null, g.D0, sVar3, 196608, 26);
                                            sVar3.p(true);
                                            sVar3.p(true);
                                            b1Var40 = b1Var39;
                                            jVar9 = jVar8;
                                            b1Var41 = b1Var38;
                                            l1.g gVar14 = gVar4;
                                            ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var8)).f30175h, ((h1.s1) sVar3.j(c3Var9)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                            int iIntValue13 = ((Number) b1Var53.getValue()).intValue();
                                            z1.r rVarE8 = j0.c.E(oVar6, CropImageView.DEFAULT_ASPECT_RATIO, f18, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                            zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                            objQ14 = sVar3.Q();
                                            if (zF3 || objQ14 == gVar14) {
                                                final int i219 = 2;
                                                final l1.b1 b1Var61110 = b1Var34;
                                                final l1.b1 b1Var61111 = b1Var35;
                                                objQ14 = new fz.c() { // from class: mt.o3
                                                    @Override // fz.c
                                                    public final Object invoke(Object obj4) {
                                                        switch (i219) {
                                                            case 0:
                                                                Integer num = (Integer) obj4;
                                                                int iIntValue14 = num.intValue();
                                                                l1.b1 b1Var510 = b1Var53;
                                                                b1Var510.setValue(num);
                                                                g.D(jVar9, b1Var510, b1Var31, b1Var61110, b1Var28, b1Var61111, b1Var41, b1Var40, iIntValue14, 0, 0, 0, 0, false, 32256);
                                                                break;
                                                            case 1:
                                                                Boolean bool = (Boolean) obj4;
                                                                boolean zBooleanValue5 = bool.booleanValue();
                                                                l1.b1 b1Var511 = b1Var53;
                                                                b1Var511.setValue(bool);
                                                                g.D(jVar9, b1Var31, b1Var61110, b1Var28, b1Var61111, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                                break;
                                                            case 2:
                                                                Integer num2 = (Integer) obj4;
                                                                int iIntValue15 = num2.intValue();
                                                                l1.b1 b1Var512 = b1Var53;
                                                                b1Var512.setValue(num2);
                                                                g.D(jVar9, b1Var31, b1Var512, b1Var61110, b1Var28, b1Var61111, b1Var41, b1Var40, 0, iIntValue15, 0, 0, 0, false, 32000);
                                                                break;
                                                            default:
                                                                Integer num3 = (Integer) obj4;
                                                                int iIntValue16 = num3.intValue();
                                                                l1.b1 b1Var513 = b1Var53;
                                                                b1Var513.setValue(num3);
                                                                g.D(jVar9, b1Var31, b1Var61110, b1Var28, b1Var61111, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue16, false, 28416);
                                                                break;
                                                        }
                                                        return qy.b0.f48488a;
                                                    }
                                                };
                                                sVar3.o0(objQ14);
                                            }
                                            ys.a.y(iIntValue13, 48, (fz.c) objQ14, sVar3, rVarE8);
                                            sVar3.p(true);
                                            sVar3.p(true);
                                        }
                                        b1Var32 = b1Var29;
                                        jVar6 = jVar5;
                                        b1Var33 = b1Var30;
                                        objQ12 = new p3(1, jVar6, b1Var57, b1Var31, b1Var53, b1Var28, b1Var27, b1Var33, b1Var32);
                                        b1Var34 = b1Var57;
                                        b1Var35 = b1Var27;
                                        sVar3.o0(objQ12);
                                        fz.a aVar17 = (fz.a) objQ12;
                                        if (((Number) b1Var34.getValue()).intValue() > 50) {
                                            z26 = true;
                                        } else {
                                            z26 = false;
                                        }
                                        jVar7 = jVar6;
                                        b1Var36 = b1Var33;
                                        b1Var37 = b1Var32;
                                        k7.h(aVar17, null, z26, null, g.C0, sVar3, 196608, 26);
                                        float f19 = 8;
                                        ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar6, f19, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                        zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                        objQ13 = sVar3.Q();
                                        if (zF2) {
                                            jVar8 = jVar7;
                                            b1Var38 = b1Var36;
                                            b1Var39 = b1Var37;
                                            objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                            sVar3.o0(objQ13);
                                        } else {
                                            jVar8 = jVar7;
                                            b1Var38 = b1Var36;
                                            b1Var39 = b1Var37;
                                            objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                            sVar3.o0(objQ13);
                                        }
                                        fz.a aVar18 = (fz.a) objQ13;
                                        if (((Number) b1Var34.getValue()).intValue() < 150) {
                                            z27 = true;
                                        } else {
                                            z27 = false;
                                        }
                                        k7.h(aVar18, null, z27, null, g.D0, sVar3, 196608, 26);
                                        sVar3.p(true);
                                        sVar3.p(true);
                                        b1Var40 = b1Var39;
                                        jVar9 = jVar8;
                                        b1Var41 = b1Var38;
                                        l1.g gVar15 = gVar4;
                                        ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var8)).f30175h, ((h1.s1) sVar3.j(c3Var9)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                        int iIntValue14 = ((Number) b1Var53.getValue()).intValue();
                                        z1.r rVarE9 = j0.c.E(oVar6, CropImageView.DEFAULT_ASPECT_RATIO, f19, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                        zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                        objQ14 = sVar3.Q();
                                        if (zF3) {
                                            final int i2110 = 2;
                                            final l1.b1 b1Var61112 = b1Var34;
                                            final l1.b1 b1Var61113 = b1Var35;
                                            objQ14 = new fz.c() { // from class: mt.o3
                                                @Override // fz.c
                                                public final Object invoke(Object obj4) {
                                                    switch (i2110) {
                                                        case 0:
                                                            Integer num = (Integer) obj4;
                                                            int iIntValue15 = num.intValue();
                                                            l1.b1 b1Var510 = b1Var53;
                                                            b1Var510.setValue(num);
                                                            g.D(jVar9, b1Var510, b1Var31, b1Var61112, b1Var28, b1Var61113, b1Var41, b1Var40, iIntValue15, 0, 0, 0, 0, false, 32256);
                                                            break;
                                                        case 1:
                                                            Boolean bool = (Boolean) obj4;
                                                            boolean zBooleanValue5 = bool.booleanValue();
                                                            l1.b1 b1Var511 = b1Var53;
                                                            b1Var511.setValue(bool);
                                                            g.D(jVar9, b1Var31, b1Var61112, b1Var28, b1Var61113, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                            break;
                                                        case 2:
                                                            Integer num2 = (Integer) obj4;
                                                            int iIntValue16 = num2.intValue();
                                                            l1.b1 b1Var512 = b1Var53;
                                                            b1Var512.setValue(num2);
                                                            g.D(jVar9, b1Var31, b1Var512, b1Var61112, b1Var28, b1Var61113, b1Var41, b1Var40, 0, iIntValue16, 0, 0, 0, false, 32000);
                                                            break;
                                                        default:
                                                            Integer num3 = (Integer) obj4;
                                                            int iIntValue17 = num3.intValue();
                                                            l1.b1 b1Var513 = b1Var53;
                                                            b1Var513.setValue(num3);
                                                            g.D(jVar9, b1Var31, b1Var61112, b1Var28, b1Var61113, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue17, false, 28416);
                                                            break;
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            };
                                            sVar3.o0(objQ14);
                                        } else {
                                            final int i2111 = 2;
                                            final l1.b1 b1Var61114 = b1Var34;
                                            final l1.b1 b1Var61115 = b1Var35;
                                            objQ14 = new fz.c() { // from class: mt.o3
                                                @Override // fz.c
                                                public final Object invoke(Object obj4) {
                                                    switch (i2111) {
                                                        case 0:
                                                            Integer num = (Integer) obj4;
                                                            int iIntValue15 = num.intValue();
                                                            l1.b1 b1Var510 = b1Var53;
                                                            b1Var510.setValue(num);
                                                            g.D(jVar9, b1Var510, b1Var31, b1Var61114, b1Var28, b1Var61115, b1Var41, b1Var40, iIntValue15, 0, 0, 0, 0, false, 32256);
                                                            break;
                                                        case 1:
                                                            Boolean bool = (Boolean) obj4;
                                                            boolean zBooleanValue5 = bool.booleanValue();
                                                            l1.b1 b1Var511 = b1Var53;
                                                            b1Var511.setValue(bool);
                                                            g.D(jVar9, b1Var31, b1Var61114, b1Var28, b1Var61115, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                            break;
                                                        case 2:
                                                            Integer num2 = (Integer) obj4;
                                                            int iIntValue16 = num2.intValue();
                                                            l1.b1 b1Var512 = b1Var53;
                                                            b1Var512.setValue(num2);
                                                            g.D(jVar9, b1Var31, b1Var512, b1Var61114, b1Var28, b1Var61115, b1Var41, b1Var40, 0, iIntValue16, 0, 0, 0, false, 32000);
                                                            break;
                                                        default:
                                                            Integer num3 = (Integer) obj4;
                                                            int iIntValue17 = num3.intValue();
                                                            l1.b1 b1Var513 = b1Var53;
                                                            b1Var513.setValue(num3);
                                                            g.D(jVar9, b1Var31, b1Var61114, b1Var28, b1Var61115, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue17, false, 28416);
                                                            break;
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            };
                                            sVar3.o0(objQ14);
                                        }
                                        ys.a.y(iIntValue14, 48, (fz.c) objQ14, sVar3, rVarE9);
                                        sVar3.p(true);
                                        sVar3.p(true);
                                    }
                                    hVar = hVar6;
                                    defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
                                    l1.t.J(hVar7, rVarC8, sVar4);
                                    String strE8 = ub.a.e0(sVar4, R.string.audio_speed);
                                    l1.c3 c3Var10 = fc.f30256a;
                                    j3.y0 y0Var5 = ((dc) sVar4.j(c3Var10)).f30175h;
                                    l1.c3 c3Var11 = h1.v1.f31180a;
                                    hVar2 = hVar;
                                    j3.y0 y0VarA5 = j3.y0.a(y0Var5, ((h1.s1) sVar4.j(c3Var11)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                                    if (1.0f <= 0.0d) {
                                        k0.a.a("invalid weight; must be greater than zero");
                                    }
                                    sVar3 = sVar4;
                                    iVar2 = iVar;
                                    z1.o oVar7 = oVar;
                                    jVar5 = jVar4;
                                    b1Var27 = b1Var25;
                                    b1Var28 = b1Var12;
                                    b1Var29 = b1Var24;
                                    b1Var30 = b1Var26;
                                    b1Var31 = b1Var17;
                                    ua.b(strE8, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA5, sVar3, 0, 0, 65532);
                                    j0.a2 a2VarA7 = j0.z1.a(j0.i.f35303a, iVar5, sVar3, 48);
                                    iHashCode2 = Long.hashCode(sVar3.T);
                                    l1.q1 q1VarL9 = sVar3.l();
                                    z1.r rVarC11 = z1.a.c(sVar3, oVar7);
                                    sVar3.h0();
                                    if (sVar3.S) {
                                        sVar3.k(iVar2);
                                    } else {
                                        sVar3.r0();
                                    }
                                    l1.t.J(hVar4, a2VarA7, sVar3);
                                    l1.t.J(hVar5, q1VarL9, sVar3);
                                    if (sVar3.S) {
                                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                    } else {
                                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                    }
                                    l1.t.J(hVar7, rVarC11, sVar3);
                                    zF = sVar3.f(b1Var57) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var27) | sVar3.f(b1Var30) | sVar3.f(b1Var29) | sVar3.f(jVar5);
                                    objQ12 = sVar3.Q();
                                    if (zF) {
                                        gVar4 = gVar3;
                                        if (objQ12 == gVar4) {
                                            b1Var32 = b1Var29;
                                            jVar6 = jVar5;
                                            b1Var33 = b1Var30;
                                            b1Var35 = b1Var27;
                                            b1Var34 = b1Var57;
                                        }
                                        fz.a aVar19 = (fz.a) objQ12;
                                        if (((Number) b1Var34.getValue()).intValue() > 50) {
                                            z26 = true;
                                        } else {
                                            z26 = false;
                                        }
                                        jVar7 = jVar6;
                                        b1Var36 = b1Var33;
                                        b1Var37 = b1Var32;
                                        k7.h(aVar19, null, z26, null, g.C0, sVar3, 196608, 26);
                                        float f110 = 8;
                                        ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar7, f110, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                        zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                        objQ13 = sVar3.Q();
                                        if (zF2) {
                                            jVar8 = jVar7;
                                            b1Var38 = b1Var36;
                                            b1Var39 = b1Var37;
                                            objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                            sVar3.o0(objQ13);
                                        } else {
                                            jVar8 = jVar7;
                                            b1Var38 = b1Var36;
                                            b1Var39 = b1Var37;
                                            objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                            sVar3.o0(objQ13);
                                        }
                                        fz.a aVar110 = (fz.a) objQ13;
                                        if (((Number) b1Var34.getValue()).intValue() < 150) {
                                            z27 = true;
                                        } else {
                                            z27 = false;
                                        }
                                        k7.h(aVar110, null, z27, null, g.D0, sVar3, 196608, 26);
                                        sVar3.p(true);
                                        sVar3.p(true);
                                        b1Var40 = b1Var39;
                                        jVar9 = jVar8;
                                        b1Var41 = b1Var38;
                                        l1.g gVar16 = gVar4;
                                        ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var10)).f30175h, ((h1.s1) sVar3.j(c3Var11)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                        int iIntValue15 = ((Number) b1Var53.getValue()).intValue();
                                        z1.r rVarE10 = j0.c.E(oVar7, CropImageView.DEFAULT_ASPECT_RATIO, f110, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                        zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                        objQ14 = sVar3.Q();
                                        if (zF3) {
                                            final int i2112 = 2;
                                            final l1.b1 b1Var61116 = b1Var34;
                                            final l1.b1 b1Var61117 = b1Var35;
                                            objQ14 = new fz.c() { // from class: mt.o3
                                                @Override // fz.c
                                                public final Object invoke(Object obj4) {
                                                    switch (i2112) {
                                                        case 0:
                                                            Integer num = (Integer) obj4;
                                                            int iIntValue16 = num.intValue();
                                                            l1.b1 b1Var510 = b1Var53;
                                                            b1Var510.setValue(num);
                                                            g.D(jVar9, b1Var510, b1Var31, b1Var61116, b1Var28, b1Var61117, b1Var41, b1Var40, iIntValue16, 0, 0, 0, 0, false, 32256);
                                                            break;
                                                        case 1:
                                                            Boolean bool = (Boolean) obj4;
                                                            boolean zBooleanValue5 = bool.booleanValue();
                                                            l1.b1 b1Var511 = b1Var53;
                                                            b1Var511.setValue(bool);
                                                            g.D(jVar9, b1Var31, b1Var61116, b1Var28, b1Var61117, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                            break;
                                                        case 2:
                                                            Integer num2 = (Integer) obj4;
                                                            int iIntValue17 = num2.intValue();
                                                            l1.b1 b1Var512 = b1Var53;
                                                            b1Var512.setValue(num2);
                                                            g.D(jVar9, b1Var31, b1Var512, b1Var61116, b1Var28, b1Var61117, b1Var41, b1Var40, 0, iIntValue17, 0, 0, 0, false, 32000);
                                                            break;
                                                        default:
                                                            Integer num3 = (Integer) obj4;
                                                            int iIntValue18 = num3.intValue();
                                                            l1.b1 b1Var513 = b1Var53;
                                                            b1Var513.setValue(num3);
                                                            g.D(jVar9, b1Var31, b1Var61116, b1Var28, b1Var61117, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue18, false, 28416);
                                                            break;
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            };
                                            sVar3.o0(objQ14);
                                        } else {
                                            final int i2113 = 2;
                                            final l1.b1 b1Var61118 = b1Var34;
                                            final l1.b1 b1Var61119 = b1Var35;
                                            objQ14 = new fz.c() { // from class: mt.o3
                                                @Override // fz.c
                                                public final Object invoke(Object obj4) {
                                                    switch (i2113) {
                                                        case 0:
                                                            Integer num = (Integer) obj4;
                                                            int iIntValue16 = num.intValue();
                                                            l1.b1 b1Var510 = b1Var53;
                                                            b1Var510.setValue(num);
                                                            g.D(jVar9, b1Var510, b1Var31, b1Var61118, b1Var28, b1Var61119, b1Var41, b1Var40, iIntValue16, 0, 0, 0, 0, false, 32256);
                                                            break;
                                                        case 1:
                                                            Boolean bool = (Boolean) obj4;
                                                            boolean zBooleanValue5 = bool.booleanValue();
                                                            l1.b1 b1Var511 = b1Var53;
                                                            b1Var511.setValue(bool);
                                                            g.D(jVar9, b1Var31, b1Var61118, b1Var28, b1Var61119, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                            break;
                                                        case 2:
                                                            Integer num2 = (Integer) obj4;
                                                            int iIntValue17 = num2.intValue();
                                                            l1.b1 b1Var512 = b1Var53;
                                                            b1Var512.setValue(num2);
                                                            g.D(jVar9, b1Var31, b1Var512, b1Var61118, b1Var28, b1Var61119, b1Var41, b1Var40, 0, iIntValue17, 0, 0, 0, false, 32000);
                                                            break;
                                                        default:
                                                            Integer num3 = (Integer) obj4;
                                                            int iIntValue18 = num3.intValue();
                                                            l1.b1 b1Var513 = b1Var53;
                                                            b1Var513.setValue(num3);
                                                            g.D(jVar9, b1Var31, b1Var61118, b1Var28, b1Var61119, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue18, false, 28416);
                                                            break;
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            };
                                            sVar3.o0(objQ14);
                                        }
                                        ys.a.y(iIntValue15, 48, (fz.c) objQ14, sVar3, rVarE10);
                                        sVar3.p(true);
                                        sVar3.p(true);
                                    } else {
                                        gVar4 = gVar3;
                                    }
                                    b1Var32 = b1Var29;
                                    jVar6 = jVar5;
                                    b1Var33 = b1Var30;
                                    objQ12 = new p3(1, jVar6, b1Var57, b1Var31, b1Var53, b1Var28, b1Var27, b1Var33, b1Var32);
                                    b1Var34 = b1Var57;
                                    b1Var35 = b1Var27;
                                    sVar3.o0(objQ12);
                                    fz.a aVar111 = (fz.a) objQ12;
                                    if (((Number) b1Var34.getValue()).intValue() > 50) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    jVar7 = jVar6;
                                    b1Var36 = b1Var33;
                                    b1Var37 = b1Var32;
                                    k7.h(aVar111, null, z26, null, g.C0, sVar3, 196608, 26);
                                    float f111 = 8;
                                    ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar7, f111, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                    zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                    objQ13 = sVar3.Q();
                                    if (zF2) {
                                        jVar8 = jVar7;
                                        b1Var38 = b1Var36;
                                        b1Var39 = b1Var37;
                                        objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                        sVar3.o0(objQ13);
                                    } else {
                                        jVar8 = jVar7;
                                        b1Var38 = b1Var36;
                                        b1Var39 = b1Var37;
                                        objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                        sVar3.o0(objQ13);
                                    }
                                    fz.a aVar112 = (fz.a) objQ13;
                                    if (((Number) b1Var34.getValue()).intValue() < 150) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    k7.h(aVar112, null, z27, null, g.D0, sVar3, 196608, 26);
                                    sVar3.p(true);
                                    sVar3.p(true);
                                    b1Var40 = b1Var39;
                                    jVar9 = jVar8;
                                    b1Var41 = b1Var38;
                                    l1.g gVar17 = gVar4;
                                    ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var10)).f30175h, ((h1.s1) sVar3.j(c3Var11)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                    int iIntValue16 = ((Number) b1Var53.getValue()).intValue();
                                    z1.r rVarE11 = j0.c.E(oVar7, CropImageView.DEFAULT_ASPECT_RATIO, f111, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                    zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                    objQ14 = sVar3.Q();
                                    if (zF3) {
                                        final int i2114 = 2;
                                        final l1.b1 b1Var611110 = b1Var34;
                                        final l1.b1 b1Var611111 = b1Var35;
                                        objQ14 = new fz.c() { // from class: mt.o3
                                            @Override // fz.c
                                            public final Object invoke(Object obj4) {
                                                switch (i2114) {
                                                    case 0:
                                                        Integer num = (Integer) obj4;
                                                        int iIntValue17 = num.intValue();
                                                        l1.b1 b1Var510 = b1Var53;
                                                        b1Var510.setValue(num);
                                                        g.D(jVar9, b1Var510, b1Var31, b1Var611110, b1Var28, b1Var611111, b1Var41, b1Var40, iIntValue17, 0, 0, 0, 0, false, 32256);
                                                        break;
                                                    case 1:
                                                        Boolean bool = (Boolean) obj4;
                                                        boolean zBooleanValue5 = bool.booleanValue();
                                                        l1.b1 b1Var511 = b1Var53;
                                                        b1Var511.setValue(bool);
                                                        g.D(jVar9, b1Var31, b1Var611110, b1Var28, b1Var611111, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                        break;
                                                    case 2:
                                                        Integer num2 = (Integer) obj4;
                                                        int iIntValue18 = num2.intValue();
                                                        l1.b1 b1Var512 = b1Var53;
                                                        b1Var512.setValue(num2);
                                                        g.D(jVar9, b1Var31, b1Var512, b1Var611110, b1Var28, b1Var611111, b1Var41, b1Var40, 0, iIntValue18, 0, 0, 0, false, 32000);
                                                        break;
                                                    default:
                                                        Integer num3 = (Integer) obj4;
                                                        int iIntValue19 = num3.intValue();
                                                        l1.b1 b1Var513 = b1Var53;
                                                        b1Var513.setValue(num3);
                                                        g.D(jVar9, b1Var31, b1Var611110, b1Var28, b1Var611111, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue19, false, 28416);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar3.o0(objQ14);
                                    } else {
                                        final int i2115 = 2;
                                        final l1.b1 b1Var611112 = b1Var34;
                                        final l1.b1 b1Var611113 = b1Var35;
                                        objQ14 = new fz.c() { // from class: mt.o3
                                            @Override // fz.c
                                            public final Object invoke(Object obj4) {
                                                switch (i2115) {
                                                    case 0:
                                                        Integer num = (Integer) obj4;
                                                        int iIntValue17 = num.intValue();
                                                        l1.b1 b1Var510 = b1Var53;
                                                        b1Var510.setValue(num);
                                                        g.D(jVar9, b1Var510, b1Var31, b1Var611112, b1Var28, b1Var611113, b1Var41, b1Var40, iIntValue17, 0, 0, 0, 0, false, 32256);
                                                        break;
                                                    case 1:
                                                        Boolean bool = (Boolean) obj4;
                                                        boolean zBooleanValue5 = bool.booleanValue();
                                                        l1.b1 b1Var511 = b1Var53;
                                                        b1Var511.setValue(bool);
                                                        g.D(jVar9, b1Var31, b1Var611112, b1Var28, b1Var611113, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                        break;
                                                    case 2:
                                                        Integer num2 = (Integer) obj4;
                                                        int iIntValue18 = num2.intValue();
                                                        l1.b1 b1Var512 = b1Var53;
                                                        b1Var512.setValue(num2);
                                                        g.D(jVar9, b1Var31, b1Var512, b1Var611112, b1Var28, b1Var611113, b1Var41, b1Var40, 0, iIntValue18, 0, 0, 0, false, 32000);
                                                        break;
                                                    default:
                                                        Integer num3 = (Integer) obj4;
                                                        int iIntValue19 = num3.intValue();
                                                        l1.b1 b1Var513 = b1Var53;
                                                        b1Var513.setValue(num3);
                                                        g.D(jVar9, b1Var31, b1Var611112, b1Var28, b1Var611113, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue19, false, 28416);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar3.o0(objQ14);
                                    }
                                    ys.a.y(iIntValue16, 48, (fz.c) objQ14, sVar3, rVarE11);
                                    sVar3.p(true);
                                    sVar3.p(true);
                                }
                                final int i30 = 1;
                                final l1.b1 b1Var70 = b1Var21;
                                final l1.b1 b1Var71 = b1Var22;
                                final l1.b1 b1Var72 = b1Var17;
                                jVar4 = jVar2;
                                final l1.b1 b1Var73 = b1Var12;
                                final l1.b1 b1Var74 = b1Var20;
                                objQ24 = new fz.c() { // from class: mt.o3
                                    @Override // fz.c
                                    public final Object invoke(Object obj4) {
                                        switch (i30) {
                                            case 0:
                                                Integer num = (Integer) obj4;
                                                int iIntValue17 = num.intValue();
                                                l1.b1 b1Var510 = b1Var71;
                                                b1Var510.setValue(num);
                                                g.D(jVar4, b1Var510, b1Var72, b1Var53, b1Var57, b1Var73, b1Var70, b1Var74, iIntValue17, 0, 0, 0, 0, false, 32256);
                                                break;
                                            case 1:
                                                Boolean bool = (Boolean) obj4;
                                                boolean zBooleanValue5 = bool.booleanValue();
                                                l1.b1 b1Var511 = b1Var71;
                                                b1Var511.setValue(bool);
                                                g.D(jVar4, b1Var72, b1Var53, b1Var57, b1Var73, b1Var70, b1Var74, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                break;
                                            case 2:
                                                Integer num2 = (Integer) obj4;
                                                int iIntValue18 = num2.intValue();
                                                l1.b1 b1Var512 = b1Var71;
                                                b1Var512.setValue(num2);
                                                g.D(jVar4, b1Var72, b1Var512, b1Var53, b1Var57, b1Var73, b1Var70, b1Var74, 0, iIntValue18, 0, 0, 0, false, 32000);
                                                break;
                                            default:
                                                Integer num3 = (Integer) obj4;
                                                int iIntValue19 = num3.intValue();
                                                l1.b1 b1Var513 = b1Var71;
                                                b1Var513.setValue(num3);
                                                g.D(jVar4, b1Var72, b1Var53, b1Var57, b1Var73, b1Var513, b1Var70, b1Var74, 0, 0, 0, 0, iIntValue19, false, 28416);
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                b1Var24 = b1Var71;
                                b1Var25 = b1Var70;
                                b1Var26 = b1Var74;
                                sVar4.o0(objQ24);
                                ys.a.m(strE3, zBooleanValue4, (fz.c) objQ24, sVar4, 0);
                                z1.r rVarI3 = j0.e2.i(j0.e2.e(oVar2, 1.0f), 62, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                j0.e eVar3 = j0.i.f35309g;
                                z1.i iVar6 = z1.c.M;
                                j0.a2 a2VarA5 = j0.z1.a(eVar3, iVar6, sVar4, 54);
                                iHashCode = Long.hashCode(sVar4.T);
                                l1.q1 q1VarL7 = sVar4.l();
                                z1.r rVarC9 = z1.a.c(sVar4, rVarI3);
                                sVar4.h0();
                                if (sVar4.S) {
                                    iVar = iVar3;
                                    sVar4.k(iVar);
                                } else {
                                    iVar = iVar3;
                                    sVar4.r0();
                                }
                                gVar3 = gVar2;
                                l1.t.J(hVar4, a2VarA5, sVar4);
                                l1.t.J(hVar5, q1VarL7, sVar4);
                                if (sVar4.S) {
                                    oVar = oVar2;
                                    if (!kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                                        hVar = hVar6;
                                    }
                                    l1.t.J(hVar7, rVarC9, sVar4);
                                    String strE9 = ub.a.e0(sVar4, R.string.audio_speed);
                                    l1.c3 c3Var12 = fc.f30256a;
                                    j3.y0 y0Var6 = ((dc) sVar4.j(c3Var12)).f30175h;
                                    l1.c3 c3Var13 = h1.v1.f31180a;
                                    hVar2 = hVar;
                                    j3.y0 y0VarA6 = j3.y0.a(y0Var6, ((h1.s1) sVar4.j(c3Var13)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                                    if (1.0f <= 0.0d) {
                                        k0.a.a("invalid weight; must be greater than zero");
                                    }
                                    sVar3 = sVar4;
                                    iVar2 = iVar;
                                    z1.o oVar8 = oVar;
                                    jVar5 = jVar4;
                                    b1Var27 = b1Var25;
                                    b1Var28 = b1Var12;
                                    b1Var29 = b1Var24;
                                    b1Var30 = b1Var26;
                                    b1Var31 = b1Var17;
                                    ua.b(strE9, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA6, sVar3, 0, 0, 65532);
                                    j0.a2 a2VarA8 = j0.z1.a(j0.i.f35303a, iVar6, sVar3, 48);
                                    iHashCode2 = Long.hashCode(sVar3.T);
                                    l1.q1 q1VarL10 = sVar3.l();
                                    z1.r rVarC12 = z1.a.c(sVar3, oVar8);
                                    sVar3.h0();
                                    if (sVar3.S) {
                                        sVar3.k(iVar2);
                                    } else {
                                        sVar3.r0();
                                    }
                                    l1.t.J(hVar4, a2VarA8, sVar3);
                                    l1.t.J(hVar5, q1VarL10, sVar3);
                                    if (sVar3.S) {
                                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                    } else {
                                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                    }
                                    l1.t.J(hVar7, rVarC12, sVar3);
                                    zF = sVar3.f(b1Var57) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var27) | sVar3.f(b1Var30) | sVar3.f(b1Var29) | sVar3.f(jVar5);
                                    objQ12 = sVar3.Q();
                                    if (zF) {
                                        gVar4 = gVar3;
                                        if (objQ12 == gVar4) {
                                            b1Var32 = b1Var29;
                                            jVar6 = jVar5;
                                            b1Var33 = b1Var30;
                                            b1Var35 = b1Var27;
                                            b1Var34 = b1Var57;
                                        }
                                        fz.a aVar113 = (fz.a) objQ12;
                                        if (((Number) b1Var34.getValue()).intValue() > 50) {
                                            z26 = true;
                                        } else {
                                            z26 = false;
                                        }
                                        jVar7 = jVar6;
                                        b1Var36 = b1Var33;
                                        b1Var37 = b1Var32;
                                        k7.h(aVar113, null, z26, null, g.C0, sVar3, 196608, 26);
                                        float f112 = 8;
                                        ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar8, f112, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                        zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                        objQ13 = sVar3.Q();
                                        if (zF2) {
                                            jVar8 = jVar7;
                                            b1Var38 = b1Var36;
                                            b1Var39 = b1Var37;
                                            objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                            sVar3.o0(objQ13);
                                        } else {
                                            jVar8 = jVar7;
                                            b1Var38 = b1Var36;
                                            b1Var39 = b1Var37;
                                            objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                            sVar3.o0(objQ13);
                                        }
                                        fz.a aVar114 = (fz.a) objQ13;
                                        if (((Number) b1Var34.getValue()).intValue() < 150) {
                                            z27 = true;
                                        } else {
                                            z27 = false;
                                        }
                                        k7.h(aVar114, null, z27, null, g.D0, sVar3, 196608, 26);
                                        sVar3.p(true);
                                        sVar3.p(true);
                                        b1Var40 = b1Var39;
                                        jVar9 = jVar8;
                                        b1Var41 = b1Var38;
                                        l1.g gVar18 = gVar4;
                                        ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var12)).f30175h, ((h1.s1) sVar3.j(c3Var13)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                        int iIntValue17 = ((Number) b1Var53.getValue()).intValue();
                                        z1.r rVarE12 = j0.c.E(oVar8, CropImageView.DEFAULT_ASPECT_RATIO, f112, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                        zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                        objQ14 = sVar3.Q();
                                        if (zF3) {
                                            final int i2116 = 2;
                                            final l1.b1 b1Var611114 = b1Var34;
                                            final l1.b1 b1Var611115 = b1Var35;
                                            objQ14 = new fz.c() { // from class: mt.o3
                                                @Override // fz.c
                                                public final Object invoke(Object obj4) {
                                                    switch (i2116) {
                                                        case 0:
                                                            Integer num = (Integer) obj4;
                                                            int iIntValue18 = num.intValue();
                                                            l1.b1 b1Var510 = b1Var53;
                                                            b1Var510.setValue(num);
                                                            g.D(jVar9, b1Var510, b1Var31, b1Var611114, b1Var28, b1Var611115, b1Var41, b1Var40, iIntValue18, 0, 0, 0, 0, false, 32256);
                                                            break;
                                                        case 1:
                                                            Boolean bool = (Boolean) obj4;
                                                            boolean zBooleanValue5 = bool.booleanValue();
                                                            l1.b1 b1Var511 = b1Var53;
                                                            b1Var511.setValue(bool);
                                                            g.D(jVar9, b1Var31, b1Var611114, b1Var28, b1Var611115, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                            break;
                                                        case 2:
                                                            Integer num2 = (Integer) obj4;
                                                            int iIntValue19 = num2.intValue();
                                                            l1.b1 b1Var512 = b1Var53;
                                                            b1Var512.setValue(num2);
                                                            g.D(jVar9, b1Var31, b1Var512, b1Var611114, b1Var28, b1Var611115, b1Var41, b1Var40, 0, iIntValue19, 0, 0, 0, false, 32000);
                                                            break;
                                                        default:
                                                            Integer num3 = (Integer) obj4;
                                                            int iIntValue110 = num3.intValue();
                                                            l1.b1 b1Var513 = b1Var53;
                                                            b1Var513.setValue(num3);
                                                            g.D(jVar9, b1Var31, b1Var611114, b1Var28, b1Var611115, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue110, false, 28416);
                                                            break;
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            };
                                            sVar3.o0(objQ14);
                                        } else {
                                            final int i2117 = 2;
                                            final l1.b1 b1Var611116 = b1Var34;
                                            final l1.b1 b1Var611117 = b1Var35;
                                            objQ14 = new fz.c() { // from class: mt.o3
                                                @Override // fz.c
                                                public final Object invoke(Object obj4) {
                                                    switch (i2117) {
                                                        case 0:
                                                            Integer num = (Integer) obj4;
                                                            int iIntValue18 = num.intValue();
                                                            l1.b1 b1Var510 = b1Var53;
                                                            b1Var510.setValue(num);
                                                            g.D(jVar9, b1Var510, b1Var31, b1Var611116, b1Var28, b1Var611117, b1Var41, b1Var40, iIntValue18, 0, 0, 0, 0, false, 32256);
                                                            break;
                                                        case 1:
                                                            Boolean bool = (Boolean) obj4;
                                                            boolean zBooleanValue5 = bool.booleanValue();
                                                            l1.b1 b1Var511 = b1Var53;
                                                            b1Var511.setValue(bool);
                                                            g.D(jVar9, b1Var31, b1Var611116, b1Var28, b1Var611117, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                            break;
                                                        case 2:
                                                            Integer num2 = (Integer) obj4;
                                                            int iIntValue19 = num2.intValue();
                                                            l1.b1 b1Var512 = b1Var53;
                                                            b1Var512.setValue(num2);
                                                            g.D(jVar9, b1Var31, b1Var512, b1Var611116, b1Var28, b1Var611117, b1Var41, b1Var40, 0, iIntValue19, 0, 0, 0, false, 32000);
                                                            break;
                                                        default:
                                                            Integer num3 = (Integer) obj4;
                                                            int iIntValue110 = num3.intValue();
                                                            l1.b1 b1Var513 = b1Var53;
                                                            b1Var513.setValue(num3);
                                                            g.D(jVar9, b1Var31, b1Var611116, b1Var28, b1Var611117, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue110, false, 28416);
                                                            break;
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            };
                                            sVar3.o0(objQ14);
                                        }
                                        ys.a.y(iIntValue17, 48, (fz.c) objQ14, sVar3, rVarE12);
                                        sVar3.p(true);
                                        sVar3.p(true);
                                    } else {
                                        gVar4 = gVar3;
                                    }
                                    b1Var32 = b1Var29;
                                    jVar6 = jVar5;
                                    b1Var33 = b1Var30;
                                    objQ12 = new p3(1, jVar6, b1Var57, b1Var31, b1Var53, b1Var28, b1Var27, b1Var33, b1Var32);
                                    b1Var34 = b1Var57;
                                    b1Var35 = b1Var27;
                                    sVar3.o0(objQ12);
                                    fz.a aVar115 = (fz.a) objQ12;
                                    if (((Number) b1Var34.getValue()).intValue() > 50) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    jVar7 = jVar6;
                                    b1Var36 = b1Var33;
                                    b1Var37 = b1Var32;
                                    k7.h(aVar115, null, z26, null, g.C0, sVar3, 196608, 26);
                                    float f113 = 8;
                                    ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar8, f113, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                    zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                    objQ13 = sVar3.Q();
                                    if (zF2) {
                                        jVar8 = jVar7;
                                        b1Var38 = b1Var36;
                                        b1Var39 = b1Var37;
                                        objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                        sVar3.o0(objQ13);
                                    } else {
                                        jVar8 = jVar7;
                                        b1Var38 = b1Var36;
                                        b1Var39 = b1Var37;
                                        objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                        sVar3.o0(objQ13);
                                    }
                                    fz.a aVar116 = (fz.a) objQ13;
                                    if (((Number) b1Var34.getValue()).intValue() < 150) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    k7.h(aVar116, null, z27, null, g.D0, sVar3, 196608, 26);
                                    sVar3.p(true);
                                    sVar3.p(true);
                                    b1Var40 = b1Var39;
                                    jVar9 = jVar8;
                                    b1Var41 = b1Var38;
                                    l1.g gVar19 = gVar4;
                                    ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var12)).f30175h, ((h1.s1) sVar3.j(c3Var13)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                    int iIntValue18 = ((Number) b1Var53.getValue()).intValue();
                                    z1.r rVarE13 = j0.c.E(oVar8, CropImageView.DEFAULT_ASPECT_RATIO, f113, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                    zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                    objQ14 = sVar3.Q();
                                    if (zF3) {
                                        final int i2118 = 2;
                                        final l1.b1 b1Var611118 = b1Var34;
                                        final l1.b1 b1Var611119 = b1Var35;
                                        objQ14 = new fz.c() { // from class: mt.o3
                                            @Override // fz.c
                                            public final Object invoke(Object obj4) {
                                                switch (i2118) {
                                                    case 0:
                                                        Integer num = (Integer) obj4;
                                                        int iIntValue19 = num.intValue();
                                                        l1.b1 b1Var510 = b1Var53;
                                                        b1Var510.setValue(num);
                                                        g.D(jVar9, b1Var510, b1Var31, b1Var611118, b1Var28, b1Var611119, b1Var41, b1Var40, iIntValue19, 0, 0, 0, 0, false, 32256);
                                                        break;
                                                    case 1:
                                                        Boolean bool = (Boolean) obj4;
                                                        boolean zBooleanValue5 = bool.booleanValue();
                                                        l1.b1 b1Var511 = b1Var53;
                                                        b1Var511.setValue(bool);
                                                        g.D(jVar9, b1Var31, b1Var611118, b1Var28, b1Var611119, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                        break;
                                                    case 2:
                                                        Integer num2 = (Integer) obj4;
                                                        int iIntValue110 = num2.intValue();
                                                        l1.b1 b1Var512 = b1Var53;
                                                        b1Var512.setValue(num2);
                                                        g.D(jVar9, b1Var31, b1Var512, b1Var611118, b1Var28, b1Var611119, b1Var41, b1Var40, 0, iIntValue110, 0, 0, 0, false, 32000);
                                                        break;
                                                    default:
                                                        Integer num3 = (Integer) obj4;
                                                        int iIntValue111 = num3.intValue();
                                                        l1.b1 b1Var513 = b1Var53;
                                                        b1Var513.setValue(num3);
                                                        g.D(jVar9, b1Var31, b1Var611118, b1Var28, b1Var611119, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue111, false, 28416);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar3.o0(objQ14);
                                    } else {
                                        final int i2119 = 2;
                                        final l1.b1 b1Var6111110 = b1Var34;
                                        final l1.b1 b1Var6111111 = b1Var35;
                                        objQ14 = new fz.c() { // from class: mt.o3
                                            @Override // fz.c
                                            public final Object invoke(Object obj4) {
                                                switch (i2119) {
                                                    case 0:
                                                        Integer num = (Integer) obj4;
                                                        int iIntValue19 = num.intValue();
                                                        l1.b1 b1Var510 = b1Var53;
                                                        b1Var510.setValue(num);
                                                        g.D(jVar9, b1Var510, b1Var31, b1Var6111110, b1Var28, b1Var6111111, b1Var41, b1Var40, iIntValue19, 0, 0, 0, 0, false, 32256);
                                                        break;
                                                    case 1:
                                                        Boolean bool = (Boolean) obj4;
                                                        boolean zBooleanValue5 = bool.booleanValue();
                                                        l1.b1 b1Var511 = b1Var53;
                                                        b1Var511.setValue(bool);
                                                        g.D(jVar9, b1Var31, b1Var6111110, b1Var28, b1Var6111111, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                        break;
                                                    case 2:
                                                        Integer num2 = (Integer) obj4;
                                                        int iIntValue110 = num2.intValue();
                                                        l1.b1 b1Var512 = b1Var53;
                                                        b1Var512.setValue(num2);
                                                        g.D(jVar9, b1Var31, b1Var512, b1Var6111110, b1Var28, b1Var6111111, b1Var41, b1Var40, 0, iIntValue110, 0, 0, 0, false, 32000);
                                                        break;
                                                    default:
                                                        Integer num3 = (Integer) obj4;
                                                        int iIntValue111 = num3.intValue();
                                                        l1.b1 b1Var513 = b1Var53;
                                                        b1Var513.setValue(num3);
                                                        g.D(jVar9, b1Var31, b1Var6111110, b1Var28, b1Var6111111, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue111, false, 28416);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar3.o0(objQ14);
                                    }
                                    ys.a.y(iIntValue18, 48, (fz.c) objQ14, sVar3, rVarE13);
                                    sVar3.p(true);
                                    sVar3.p(true);
                                } else {
                                    oVar = oVar2;
                                }
                                hVar = hVar6;
                                defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
                                l1.t.J(hVar7, rVarC9, sVar4);
                                String strE10 = ub.a.e0(sVar4, R.string.audio_speed);
                                l1.c3 c3Var14 = fc.f30256a;
                                j3.y0 y0Var7 = ((dc) sVar4.j(c3Var14)).f30175h;
                                l1.c3 c3Var15 = h1.v1.f31180a;
                                hVar2 = hVar;
                                j3.y0 y0VarA7 = j3.y0.a(y0Var7, ((h1.s1) sVar4.j(c3Var15)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                                if (1.0f <= 0.0d) {
                                    k0.a.a("invalid weight; must be greater than zero");
                                }
                                sVar3 = sVar4;
                                iVar2 = iVar;
                                z1.o oVar9 = oVar;
                                jVar5 = jVar4;
                                b1Var27 = b1Var25;
                                b1Var28 = b1Var12;
                                b1Var29 = b1Var24;
                                b1Var30 = b1Var26;
                                b1Var31 = b1Var17;
                                ua.b(strE10, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA7, sVar3, 0, 0, 65532);
                                j0.a2 a2VarA9 = j0.z1.a(j0.i.f35303a, iVar6, sVar3, 48);
                                iHashCode2 = Long.hashCode(sVar3.T);
                                l1.q1 q1VarL11 = sVar3.l();
                                z1.r rVarC13 = z1.a.c(sVar3, oVar9);
                                sVar3.h0();
                                if (sVar3.S) {
                                    sVar3.k(iVar2);
                                } else {
                                    sVar3.r0();
                                }
                                l1.t.J(hVar4, a2VarA9, sVar3);
                                l1.t.J(hVar5, q1VarL11, sVar3);
                                if (sVar3.S) {
                                    defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                } else {
                                    defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                }
                                l1.t.J(hVar7, rVarC13, sVar3);
                                zF = sVar3.f(b1Var57) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var27) | sVar3.f(b1Var30) | sVar3.f(b1Var29) | sVar3.f(jVar5);
                                objQ12 = sVar3.Q();
                                if (zF) {
                                    gVar4 = gVar3;
                                    if (objQ12 == gVar4) {
                                        b1Var32 = b1Var29;
                                        jVar6 = jVar5;
                                        b1Var33 = b1Var30;
                                        b1Var35 = b1Var27;
                                        b1Var34 = b1Var57;
                                    }
                                    fz.a aVar117 = (fz.a) objQ12;
                                    if (((Number) b1Var34.getValue()).intValue() > 50) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    jVar7 = jVar6;
                                    b1Var36 = b1Var33;
                                    b1Var37 = b1Var32;
                                    k7.h(aVar117, null, z26, null, g.C0, sVar3, 196608, 26);
                                    float f114 = 8;
                                    ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar9, f114, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                    zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                    objQ13 = sVar3.Q();
                                    if (zF2) {
                                        jVar8 = jVar7;
                                        b1Var38 = b1Var36;
                                        b1Var39 = b1Var37;
                                        objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                        sVar3.o0(objQ13);
                                    } else {
                                        jVar8 = jVar7;
                                        b1Var38 = b1Var36;
                                        b1Var39 = b1Var37;
                                        objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                        sVar3.o0(objQ13);
                                    }
                                    fz.a aVar118 = (fz.a) objQ13;
                                    if (((Number) b1Var34.getValue()).intValue() < 150) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    k7.h(aVar118, null, z27, null, g.D0, sVar3, 196608, 26);
                                    sVar3.p(true);
                                    sVar3.p(true);
                                    b1Var40 = b1Var39;
                                    jVar9 = jVar8;
                                    b1Var41 = b1Var38;
                                    l1.g gVar110 = gVar4;
                                    ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var14)).f30175h, ((h1.s1) sVar3.j(c3Var15)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                    int iIntValue19 = ((Number) b1Var53.getValue()).intValue();
                                    z1.r rVarE14 = j0.c.E(oVar9, CropImageView.DEFAULT_ASPECT_RATIO, f114, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                    zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                    objQ14 = sVar3.Q();
                                    if (zF3) {
                                        final int i21110 = 2;
                                        final l1.b1 b1Var6111112 = b1Var34;
                                        final l1.b1 b1Var6111113 = b1Var35;
                                        objQ14 = new fz.c() { // from class: mt.o3
                                            @Override // fz.c
                                            public final Object invoke(Object obj4) {
                                                switch (i21110) {
                                                    case 0:
                                                        Integer num = (Integer) obj4;
                                                        int iIntValue110 = num.intValue();
                                                        l1.b1 b1Var510 = b1Var53;
                                                        b1Var510.setValue(num);
                                                        g.D(jVar9, b1Var510, b1Var31, b1Var6111112, b1Var28, b1Var6111113, b1Var41, b1Var40, iIntValue110, 0, 0, 0, 0, false, 32256);
                                                        break;
                                                    case 1:
                                                        Boolean bool = (Boolean) obj4;
                                                        boolean zBooleanValue5 = bool.booleanValue();
                                                        l1.b1 b1Var511 = b1Var53;
                                                        b1Var511.setValue(bool);
                                                        g.D(jVar9, b1Var31, b1Var6111112, b1Var28, b1Var6111113, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                        break;
                                                    case 2:
                                                        Integer num2 = (Integer) obj4;
                                                        int iIntValue111 = num2.intValue();
                                                        l1.b1 b1Var512 = b1Var53;
                                                        b1Var512.setValue(num2);
                                                        g.D(jVar9, b1Var31, b1Var512, b1Var6111112, b1Var28, b1Var6111113, b1Var41, b1Var40, 0, iIntValue111, 0, 0, 0, false, 32000);
                                                        break;
                                                    default:
                                                        Integer num3 = (Integer) obj4;
                                                        int iIntValue112 = num3.intValue();
                                                        l1.b1 b1Var513 = b1Var53;
                                                        b1Var513.setValue(num3);
                                                        g.D(jVar9, b1Var31, b1Var6111112, b1Var28, b1Var6111113, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue112, false, 28416);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar3.o0(objQ14);
                                    } else {
                                        final int i21111 = 2;
                                        final l1.b1 b1Var6111114 = b1Var34;
                                        final l1.b1 b1Var6111115 = b1Var35;
                                        objQ14 = new fz.c() { // from class: mt.o3
                                            @Override // fz.c
                                            public final Object invoke(Object obj4) {
                                                switch (i21111) {
                                                    case 0:
                                                        Integer num = (Integer) obj4;
                                                        int iIntValue110 = num.intValue();
                                                        l1.b1 b1Var510 = b1Var53;
                                                        b1Var510.setValue(num);
                                                        g.D(jVar9, b1Var510, b1Var31, b1Var6111114, b1Var28, b1Var6111115, b1Var41, b1Var40, iIntValue110, 0, 0, 0, 0, false, 32256);
                                                        break;
                                                    case 1:
                                                        Boolean bool = (Boolean) obj4;
                                                        boolean zBooleanValue5 = bool.booleanValue();
                                                        l1.b1 b1Var511 = b1Var53;
                                                        b1Var511.setValue(bool);
                                                        g.D(jVar9, b1Var31, b1Var6111114, b1Var28, b1Var6111115, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                        break;
                                                    case 2:
                                                        Integer num2 = (Integer) obj4;
                                                        int iIntValue111 = num2.intValue();
                                                        l1.b1 b1Var512 = b1Var53;
                                                        b1Var512.setValue(num2);
                                                        g.D(jVar9, b1Var31, b1Var512, b1Var6111114, b1Var28, b1Var6111115, b1Var41, b1Var40, 0, iIntValue111, 0, 0, 0, false, 32000);
                                                        break;
                                                    default:
                                                        Integer num3 = (Integer) obj4;
                                                        int iIntValue112 = num3.intValue();
                                                        l1.b1 b1Var513 = b1Var53;
                                                        b1Var513.setValue(num3);
                                                        g.D(jVar9, b1Var31, b1Var6111114, b1Var28, b1Var6111115, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue112, false, 28416);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar3.o0(objQ14);
                                    }
                                    ys.a.y(iIntValue19, 48, (fz.c) objQ14, sVar3, rVarE14);
                                    sVar3.p(true);
                                    sVar3.p(true);
                                } else {
                                    gVar4 = gVar3;
                                }
                                b1Var32 = b1Var29;
                                jVar6 = jVar5;
                                b1Var33 = b1Var30;
                                objQ12 = new p3(1, jVar6, b1Var57, b1Var31, b1Var53, b1Var28, b1Var27, b1Var33, b1Var32);
                                b1Var34 = b1Var57;
                                b1Var35 = b1Var27;
                                sVar3.o0(objQ12);
                                fz.a aVar119 = (fz.a) objQ12;
                                if (((Number) b1Var34.getValue()).intValue() > 50) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                jVar7 = jVar6;
                                b1Var36 = b1Var33;
                                b1Var37 = b1Var32;
                                k7.h(aVar119, null, z26, null, g.C0, sVar3, 196608, 26);
                                float f115 = 8;
                                ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar9, f115, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                objQ13 = sVar3.Q();
                                if (zF2) {
                                    jVar8 = jVar7;
                                    b1Var38 = b1Var36;
                                    b1Var39 = b1Var37;
                                    objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                    sVar3.o0(objQ13);
                                } else {
                                    jVar8 = jVar7;
                                    b1Var38 = b1Var36;
                                    b1Var39 = b1Var37;
                                    objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                    sVar3.o0(objQ13);
                                }
                                fz.a aVar1110 = (fz.a) objQ13;
                                if (((Number) b1Var34.getValue()).intValue() < 150) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                k7.h(aVar1110, null, z27, null, g.D0, sVar3, 196608, 26);
                                sVar3.p(true);
                                sVar3.p(true);
                                b1Var40 = b1Var39;
                                jVar9 = jVar8;
                                b1Var41 = b1Var38;
                                l1.g gVar111 = gVar4;
                                ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var14)).f30175h, ((h1.s1) sVar3.j(c3Var15)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                int iIntValue110 = ((Number) b1Var53.getValue()).intValue();
                                z1.r rVarE15 = j0.c.E(oVar9, CropImageView.DEFAULT_ASPECT_RATIO, f115, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                objQ14 = sVar3.Q();
                                if (zF3) {
                                    final int i21112 = 2;
                                    final l1.b1 b1Var6111116 = b1Var34;
                                    final l1.b1 b1Var6111117 = b1Var35;
                                    objQ14 = new fz.c() { // from class: mt.o3
                                        @Override // fz.c
                                        public final Object invoke(Object obj4) {
                                            switch (i21112) {
                                                case 0:
                                                    Integer num = (Integer) obj4;
                                                    int iIntValue111 = num.intValue();
                                                    l1.b1 b1Var510 = b1Var53;
                                                    b1Var510.setValue(num);
                                                    g.D(jVar9, b1Var510, b1Var31, b1Var6111116, b1Var28, b1Var6111117, b1Var41, b1Var40, iIntValue111, 0, 0, 0, 0, false, 32256);
                                                    break;
                                                case 1:
                                                    Boolean bool = (Boolean) obj4;
                                                    boolean zBooleanValue5 = bool.booleanValue();
                                                    l1.b1 b1Var511 = b1Var53;
                                                    b1Var511.setValue(bool);
                                                    g.D(jVar9, b1Var31, b1Var6111116, b1Var28, b1Var6111117, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                    break;
                                                case 2:
                                                    Integer num2 = (Integer) obj4;
                                                    int iIntValue112 = num2.intValue();
                                                    l1.b1 b1Var512 = b1Var53;
                                                    b1Var512.setValue(num2);
                                                    g.D(jVar9, b1Var31, b1Var512, b1Var6111116, b1Var28, b1Var6111117, b1Var41, b1Var40, 0, iIntValue112, 0, 0, 0, false, 32000);
                                                    break;
                                                default:
                                                    Integer num3 = (Integer) obj4;
                                                    int iIntValue113 = num3.intValue();
                                                    l1.b1 b1Var513 = b1Var53;
                                                    b1Var513.setValue(num3);
                                                    g.D(jVar9, b1Var31, b1Var6111116, b1Var28, b1Var6111117, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue113, false, 28416);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar3.o0(objQ14);
                                } else {
                                    final int i21113 = 2;
                                    final l1.b1 b1Var6111118 = b1Var34;
                                    final l1.b1 b1Var6111119 = b1Var35;
                                    objQ14 = new fz.c() { // from class: mt.o3
                                        @Override // fz.c
                                        public final Object invoke(Object obj4) {
                                            switch (i21113) {
                                                case 0:
                                                    Integer num = (Integer) obj4;
                                                    int iIntValue111 = num.intValue();
                                                    l1.b1 b1Var510 = b1Var53;
                                                    b1Var510.setValue(num);
                                                    g.D(jVar9, b1Var510, b1Var31, b1Var6111118, b1Var28, b1Var6111119, b1Var41, b1Var40, iIntValue111, 0, 0, 0, 0, false, 32256);
                                                    break;
                                                case 1:
                                                    Boolean bool = (Boolean) obj4;
                                                    boolean zBooleanValue5 = bool.booleanValue();
                                                    l1.b1 b1Var511 = b1Var53;
                                                    b1Var511.setValue(bool);
                                                    g.D(jVar9, b1Var31, b1Var6111118, b1Var28, b1Var6111119, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                    break;
                                                case 2:
                                                    Integer num2 = (Integer) obj4;
                                                    int iIntValue112 = num2.intValue();
                                                    l1.b1 b1Var512 = b1Var53;
                                                    b1Var512.setValue(num2);
                                                    g.D(jVar9, b1Var31, b1Var512, b1Var6111118, b1Var28, b1Var6111119, b1Var41, b1Var40, 0, iIntValue112, 0, 0, 0, false, 32000);
                                                    break;
                                                default:
                                                    Integer num3 = (Integer) obj4;
                                                    int iIntValue113 = num3.intValue();
                                                    l1.b1 b1Var513 = b1Var53;
                                                    b1Var513.setValue(num3);
                                                    g.D(jVar9, b1Var31, b1Var6111118, b1Var28, b1Var6111119, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue113, false, 28416);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar3.o0(objQ14);
                                }
                                ys.a.y(iIntValue110, 48, (fz.c) objQ14, sVar3, rVarE15);
                                sVar3.p(true);
                                sVar3.p(true);
                            } else {
                                sVar4.W();
                            }
                            return qy.b0.f48488a;
                        }
                    }, sVar2), sVar, (i17 >> 21) & 14, 384, 4090);
                } else {
                    z14 = false;
                }
                strArrD = hh.p0.D(sVar2, -898002517, R.array.japanese_display_item, sVar2, z14);
                final String[] strArr8 = strArrD;
                if (((fr.o0) xt.b.c()).f27733a.enableNativeSpeakerVideos) {
                    sVar2.d0(-2067162217);
                    strArr = new String[]{oz.x.q0(oz.x.q0(tv.a.l(tv.a.n(((Number) sVar2.j(c3Var)).intValue()), sVar2), " 1", BuildConfig.VERSION_NAME), " 2", BuildConfig.VERSION_NAME), ub.a.e0(sVar2, R.string.translation), ub.a.e0(sVar2, R.string.audio), ub.a.e0(sVar2, R.string.mixed)};
                    sVar2.p(false);
                } else {
                    sVar2.d0(-2067162217);
                    strArr = new String[]{oz.x.q0(oz.x.q0(tv.a.l(tv.a.n(((Number) sVar2.j(c3Var)).intValue()), sVar2), " 1", BuildConfig.VERSION_NAME), " 2", BuildConfig.VERSION_NAME), ub.a.e0(sVar2, R.string.translation), ub.a.e0(sVar2, R.string.audio), ub.a.e0(sVar2, R.string.mixed)};
                    sVar2.p(false);
                }
                final String[] strArr9 = {ub.a.e0(sVar2, R.string.off), ub.a.e0(sVar2, R.string.before_answer), ub.a.e0(sVar2, R.string.after_answer)};
                length = strArr.length - 1;
                if (((Number) b1Var4.getValue()).intValue() == -1) {
                    iIntValue = length;
                } else {
                    iIntValue = ((Number) b1Var4.getValue()).intValue();
                }
                if (((Number) b1Var4.getValue()).intValue() == -1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Boolean boolValueOf3 = Boolean.valueOf(z13);
                zG = sVar2.g(z13);
                objQ = sVar2.Q();
                if (zG) {
                    objQ = new g.m(2, b1Var9, null, z13);
                    sVar2.o0(objQ);
                } else {
                    objQ = new g.m(2, b1Var9, null, z13);
                    sVar2.o0(objQ);
                }
                l1.t.f((fz.e) objQ, boolValueOf3, sVar2);
                final int i112 = iIntValue;
                final boolean z25 = z13;
                final int i113 = iIntValue2;
                final String[] strArr10 = strArr;
                sVar = sVar2;
                h1.a6.a(onDismissRequest, null, e8VarF, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-862581764, new fz.f() { // from class: mt.n3
                    /* JADX WARN: Code duplicated, block: B:104:0x0558  */
                    /* JADX WARN: Code duplicated, block: B:107:0x05ed  */
                    /* JADX WARN: Code duplicated, block: B:108:0x05f1  */
                    /* JADX WARN: Code duplicated, block: B:111:0x05fe  */
                    /* JADX WARN: Code duplicated, block: B:113:0x060c  */
                    /* JADX WARN: Code duplicated, block: B:116:0x064f  */
                    /* JADX WARN: Code duplicated, block: B:119:0x0654  */
                    /* JADX WARN: Code duplicated, block: B:120:0x065d  */
                    /* JADX WARN: Code duplicated, block: B:124:0x0690  */
                    /* JADX WARN: Code duplicated, block: B:125:0x0692  */
                    /* JADX WARN: Code duplicated, block: B:128:0x073c A[ADDED_TO_REGION] */
                    /* JADX WARN: Code duplicated, block: B:131:0x0746  */
                    /* JADX WARN: Code duplicated, block: B:134:0x0773  */
                    /* JADX WARN: Code duplicated, block: B:135:0x0775  */
                    /* JADX WARN: Code duplicated, block: B:138:0x0846  */
                    /* JADX WARN: Code duplicated, block: B:140:0x084a  */
                    /* JADX WARN: Code duplicated, block: B:89:0x04c8  */
                    /* JADX WARN: Code duplicated, block: B:91:0x04d2  */
                    /* JADX WARN: Code duplicated, block: B:94:0x04e4  */
                    /* JADX WARN: Code duplicated, block: B:97:0x04f7  */
                    /* JADX WARN: Code duplicated, block: B:99:0x04fc  */
                    @Override // fz.f
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        l1.b1 b1Var11;
                        l1.b1 b1Var12;
                        final fz.j jVar;
                        final l1.b1 b1Var13;
                        final l1.b1 b1Var14;
                        final l1.b1 b1Var15;
                        final l1.b1 b1Var16;
                        l1.b1 b1Var17;
                        l1.b1 b1Var18;
                        final l1.b1 b1Var19;
                        l1.b1 b1Var20;
                        l1.b1 b1Var21;
                        l1.b1 b1Var22;
                        fz.j jVar2;
                        boolean z26;
                        l1.b1 b1Var23;
                        fz.j jVar3;
                        l1.g gVar2;
                        final fz.j jVar4;
                        l1.b1 b1Var24;
                        l1.b1 b1Var25;
                        l1.b1 b1Var26;
                        int iHashCode;
                        y2.i iVar;
                        l1.g gVar3;
                        z1.o oVar;
                        y2.h hVar;
                        y2.h hVar2;
                        l1.s sVar3;
                        y2.i iVar2;
                        fz.j jVar5;
                        l1.b1 b1Var27;
                        final l1.b1 b1Var28;
                        l1.b1 b1Var29;
                        l1.b1 b1Var30;
                        final l1.b1 b1Var31;
                        int iHashCode2;
                        boolean zF;
                        Object objQ12;
                        l1.g gVar4;
                        l1.b1 b1Var32;
                        fz.j jVar6;
                        l1.b1 b1Var33;
                        l1.b1 b1Var34;
                        l1.b1 b1Var35;
                        boolean z27;
                        fz.j jVar7;
                        l1.b1 b1Var36;
                        l1.b1 b1Var37;
                        boolean zF2;
                        Object objQ13;
                        fz.j jVar8;
                        l1.b1 b1Var38;
                        l1.b1 b1Var39;
                        boolean z28;
                        final l1.b1 b1Var40;
                        final fz.j jVar9;
                        final l1.b1 b1Var41;
                        boolean zF3;
                        Object objQ14;
                        j0.v ModalBottomSheet = (j0.v) obj;
                        l1.n nVar2 = (l1.n) obj2;
                        int iIntValue3 = ((Integer) obj3).intValue();
                        kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                        l1.s sVar4 = (l1.s) nVar2;
                        if (sVar4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                            z1.o oVar2 = z1.o.f58481a;
                            z1.r rVarC = j0.e2.c(j0.e2.e(oVar2, 1.0f), 0.7f);
                            j0.d dVar = j0.i.f35305c;
                            z1.h hVar3 = z1.c.O;
                            j0.u uVarA = j0.t.a(dVar, hVar3, sVar4, 0);
                            int iHashCode3 = Long.hashCode(sVar4.T);
                            l1.q1 q1VarL = sVar4.l();
                            z1.r rVarC2 = z1.a.c(sVar4, rVarC);
                            y2.k.J.getClass();
                            y2.i iVar3 = y2.j.f56913b;
                            sVar4.h0();
                            if (sVar4.S) {
                                sVar4.k(iVar3);
                            } else {
                                sVar4.r0();
                            }
                            y2.h hVar4 = y2.j.f56917f;
                            l1.t.J(hVar4, uVarA, sVar4);
                            y2.h hVar5 = y2.j.f56916e;
                            l1.t.J(hVar5, q1VarL, sVar4);
                            y2.h hVar6 = y2.j.f56918g;
                            if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                                defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar6);
                            }
                            y2.h hVar7 = y2.j.f56915d;
                            l1.t.J(hVar7, rVarC2, sVar4);
                            String strE0 = ub.a.e0(sVar4, R.string.settings);
                            Object objQ15 = sVar4.Q();
                            l1.g gVar5 = l1.m.f39353a;
                            if (objQ15 == gVar5) {
                                objQ15 = new ju.d(25);
                                sVar4.o0(objQ15);
                            }
                            ys.a.l(432, (fz.a) objQ15, strE0, sVar4, false);
                            z1.r rVarC3 = j0.c.C(d0.n.y(oVar2, d0.n.u(sVar4), true, 12), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            j0.u uVarA2 = j0.t.a(dVar, hVar3, sVar4, 0);
                            int iHashCode4 = Long.hashCode(sVar4.T);
                            l1.q1 q1VarL2 = sVar4.l();
                            z1.r rVarC4 = z1.a.c(sVar4, rVarC3);
                            sVar4.h0();
                            if (sVar4.S) {
                                sVar4.k(iVar3);
                            } else {
                                sVar4.r0();
                            }
                            l1.t.J(hVar4, uVarA2, sVar4);
                            l1.t.J(hVar5, q1VarL2, sVar4);
                            if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode4))) {
                                defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar6);
                            }
                            l1.t.J(hVar7, rVarC4, sVar4);
                            String strE1 = ub.a.e0(sVar4, R.string.display_in);
                            l1.b1 b1Var42 = b1Var8;
                            boolean zBooleanValue = ((Boolean) b1Var42.getValue()).booleanValue();
                            Object objQ16 = sVar4.Q();
                            if (objQ16 == gVar5) {
                                objQ16 = new p(6, b1Var42);
                                sVar4.o0(objQ16);
                            }
                            fz.c cVar = (fz.c) objQ16;
                            int i21 = length;
                            boolean zD = sVar4.d(i21);
                            l1.b1 b1Var43 = b1Var4;
                            boolean zF4 = zD | sVar4.f(b1Var43);
                            l1.b1 b1Var44 = b1Var;
                            boolean zF5 = zF4 | sVar4.f(b1Var44);
                            l1.b1 b1Var45 = b1Var2;
                            boolean zF6 = zF5 | sVar4.f(b1Var45);
                            l1.b1 b1Var46 = b1Var3;
                            boolean zF7 = zF6 | sVar4.f(b1Var46);
                            final l1.b1 b1Var47 = b1Var5;
                            boolean zF8 = zF7 | sVar4.f(b1Var47);
                            l1.b1 b1Var48 = b1Var6;
                            boolean zF9 = zF8 | sVar4.f(b1Var48);
                            l1.b1 b1Var49 = b1Var7;
                            boolean zF10 = zF9 | sVar4.f(b1Var49);
                            fz.j jVar10 = onSettingChange;
                            boolean zF11 = zF10 | sVar4.f(jVar10);
                            Object objQ17 = sVar4.Q();
                            if (zF11 || objQ17 == gVar5) {
                                b1Var11 = b1Var44;
                                objQ17 = new r3(i21, jVar10, b1Var43, b1Var11, b1Var45, b1Var46, b1Var47, b1Var48, b1Var49);
                                b1Var12 = b1Var43;
                                sVar4.o0(objQ17);
                            } else {
                                b1Var12 = b1Var43;
                                b1Var11 = b1Var44;
                            }
                            l1.g gVar6 = gVar5;
                            ys.a.i(strE1, strArr10, i112, zBooleanValue, false, cVar, (fz.c) objQ17, sVar4, 196608, 16);
                            int iL = hz.b.l(((Number) b1Var47.getValue()).intValue(), 0, 2);
                            final l1.b1 b1Var50 = b1Var11;
                            String strE2 = ub.a.e0(sVar4, R.string.audio_auto_play);
                            l1.b1 b1Var51 = b1Var9;
                            boolean zBooleanValue2 = ((Boolean) b1Var51.getValue()).booleanValue();
                            boolean z29 = !z25;
                            Object objQ18 = sVar4.Q();
                            if (objQ18 == gVar6) {
                                objQ18 = new p(7, b1Var51);
                                sVar4.o0(objQ18);
                            }
                            fz.c cVar2 = (fz.c) objQ18;
                            boolean zF12 = sVar4.f(b1Var47) | sVar4.f(b1Var50) | sVar4.f(b1Var45) | sVar4.f(b1Var46) | sVar4.f(b1Var12) | sVar4.f(b1Var48) | sVar4.f(b1Var49) | sVar4.f(jVar10);
                            Object objQ19 = sVar4.Q();
                            if (zF12 || objQ19 == gVar6) {
                                final int i22 = 3;
                                final l1.b1 b1Var52 = b1Var12;
                                jVar = jVar10;
                                b1Var13 = b1Var45;
                                b1Var14 = b1Var46;
                                b1Var15 = b1Var48;
                                b1Var16 = b1Var49;
                                objQ19 = new fz.c() { // from class: mt.o3
                                    @Override // fz.c
                                    public final Object invoke(Object obj4) {
                                        switch (i22) {
                                            case 0:
                                                Integer num = (Integer) obj4;
                                                int iIntValue111 = num.intValue();
                                                l1.b1 b1Var510 = b1Var47;
                                                b1Var510.setValue(num);
                                                g.D(jVar, b1Var510, b1Var50, b1Var13, b1Var14, b1Var52, b1Var15, b1Var16, iIntValue111, 0, 0, 0, 0, false, 32256);
                                                break;
                                            case 1:
                                                Boolean bool = (Boolean) obj4;
                                                boolean zBooleanValue5 = bool.booleanValue();
                                                l1.b1 b1Var511 = b1Var47;
                                                b1Var511.setValue(bool);
                                                g.D(jVar, b1Var50, b1Var13, b1Var14, b1Var52, b1Var15, b1Var16, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                break;
                                            case 2:
                                                Integer num2 = (Integer) obj4;
                                                int iIntValue112 = num2.intValue();
                                                l1.b1 b1Var512 = b1Var47;
                                                b1Var512.setValue(num2);
                                                g.D(jVar, b1Var50, b1Var512, b1Var13, b1Var14, b1Var52, b1Var15, b1Var16, 0, iIntValue112, 0, 0, 0, false, 32000);
                                                break;
                                            default:
                                                Integer num3 = (Integer) obj4;
                                                int iIntValue113 = num3.intValue();
                                                l1.b1 b1Var513 = b1Var47;
                                                b1Var513.setValue(num3);
                                                g.D(jVar, b1Var50, b1Var13, b1Var14, b1Var52, b1Var513, b1Var15, b1Var16, 0, 0, 0, 0, iIntValue113, false, 28416);
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                b1Var17 = b1Var50;
                                b1Var18 = b1Var47;
                                sVar4.o0(objQ19);
                            } else {
                                jVar = jVar10;
                                b1Var17 = b1Var50;
                                b1Var13 = b1Var45;
                                b1Var14 = b1Var46;
                                b1Var18 = b1Var47;
                                b1Var15 = b1Var48;
                                b1Var16 = b1Var49;
                            }
                            final fz.j jVar11 = jVar;
                            final l1.b1 b1Var53 = b1Var13;
                            final l1.b1 b1Var54 = b1Var18;
                            l1.b1 b1Var55 = b1Var15;
                            final l1.b1 b1Var56 = b1Var16;
                            final l1.b1 b1Var57 = b1Var14;
                            ys.a.i(strE2, strArr9, iL, zBooleanValue2, z29, cVar2, (fz.c) objQ19, sVar4, 196608, 0);
                            String[] strArr11 = strArr8;
                            if (strArr11.length == 0) {
                                sVar4.d0(1050243442);
                                sVar4.p(false);
                                b1Var21 = b1Var54;
                                b1Var20 = b1Var55;
                                b1Var22 = b1Var56;
                                gVar6 = gVar6;
                                jVar2 = jVar11;
                            } else {
                                sVar4.d0(1058794978);
                                int iL2 = hz.b.l(((Number) b1Var17.getValue()).intValue(), 0, strArr11.length - 1);
                                int i23 = i113;
                                String strE = ys.a.E(sVar4, i23);
                                l1.b1 b1Var58 = b1Var10;
                                boolean zBooleanValue3 = ((Boolean) b1Var58.getValue()).booleanValue();
                                Object objQ20 = sVar4.Q();
                                if (objQ20 == gVar6) {
                                    objQ20 = new p(8, b1Var58);
                                    sVar4.o0(objQ20);
                                }
                                fz.c cVar3 = (fz.c) objQ20;
                                boolean zF13 = sVar4.f(b1Var17) | sVar4.f(b1Var53) | sVar4.f(b1Var57) | sVar4.f(b1Var12) | sVar4.f(b1Var54) | sVar4.f(b1Var55) | sVar4.f(b1Var56) | sVar4.f(jVar11);
                                Object objQ21 = sVar4.Q();
                                if (zF13 || objQ21 == gVar6) {
                                    final int i24 = 0;
                                    final l1.b1 b1Var59 = b1Var17;
                                    final l1.b1 b1Var60 = b1Var12;
                                    b1Var19 = b1Var55;
                                    objQ21 = new fz.c() { // from class: mt.o3
                                        @Override // fz.c
                                        public final Object invoke(Object obj4) {
                                            switch (i24) {
                                                case 0:
                                                    Integer num = (Integer) obj4;
                                                    int iIntValue111 = num.intValue();
                                                    l1.b1 b1Var510 = b1Var59;
                                                    b1Var510.setValue(num);
                                                    g.D(jVar11, b1Var510, b1Var53, b1Var57, b1Var60, b1Var54, b1Var19, b1Var56, iIntValue111, 0, 0, 0, 0, false, 32256);
                                                    break;
                                                case 1:
                                                    Boolean bool = (Boolean) obj4;
                                                    boolean zBooleanValue5 = bool.booleanValue();
                                                    l1.b1 b1Var511 = b1Var59;
                                                    b1Var511.setValue(bool);
                                                    g.D(jVar11, b1Var53, b1Var57, b1Var60, b1Var54, b1Var19, b1Var56, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                    break;
                                                case 2:
                                                    Integer num2 = (Integer) obj4;
                                                    int iIntValue112 = num2.intValue();
                                                    l1.b1 b1Var512 = b1Var59;
                                                    b1Var512.setValue(num2);
                                                    g.D(jVar11, b1Var53, b1Var512, b1Var57, b1Var60, b1Var54, b1Var19, b1Var56, 0, iIntValue112, 0, 0, 0, false, 32000);
                                                    break;
                                                default:
                                                    Integer num3 = (Integer) obj4;
                                                    int iIntValue113 = num3.intValue();
                                                    l1.b1 b1Var513 = b1Var59;
                                                    b1Var513.setValue(num3);
                                                    g.D(jVar11, b1Var53, b1Var57, b1Var60, b1Var54, b1Var513, b1Var19, b1Var56, 0, 0, 0, 0, iIntValue113, false, 28416);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar4.o0(objQ21);
                                } else {
                                    b1Var19 = b1Var55;
                                }
                                fz.c cVar4 = (fz.c) objQ21;
                                l1.b1 b1Var61 = b1Var19;
                                ys.a.i(strE, strArr11, iL2, zBooleanValue3, false, cVar3, cVar4, sVar4, 196608, 16);
                                int iIntValue4 = ((Number) b1Var17.getValue()).intValue();
                                Integer numValueOf = ys.a.F(i23, iIntValue4) ? Integer.valueOf(iIntValue4) : null;
                                if (numValueOf != null) {
                                    sVar4.d0(1059792899);
                                    int iIntValue5 = numValueOf.intValue();
                                    float fFloatValue = ((Number) b1Var61.getValue()).floatValue();
                                    boolean zF14 = sVar4.f(b1Var61);
                                    Object objQ22 = sVar4.Q();
                                    if (zF14 || objQ22 == gVar6) {
                                        objQ22 = new p(5, b1Var61);
                                        sVar4.o0(objQ22);
                                    }
                                    fz.c cVar5 = (fz.c) objQ22;
                                    boolean zF15 = sVar4.f(b1Var17) | sVar4.f(b1Var53) | sVar4.f(b1Var57) | sVar4.f(b1Var12) | sVar4.f(b1Var54) | sVar4.f(b1Var61) | sVar4.f(b1Var56) | sVar4.f(jVar11);
                                    Object objQ23 = sVar4.Q();
                                    if (zF15 || objQ23 == gVar6) {
                                        objQ23 = new p3(jVar11, b1Var17, b1Var53, b1Var57, b1Var12, b1Var54, b1Var61, b1Var56);
                                        b1Var21 = b1Var54;
                                        b1Var20 = b1Var61;
                                        b1Var23 = b1Var56;
                                        jVar3 = jVar11;
                                        sVar4.o0(objQ23);
                                    } else {
                                        jVar3 = jVar11;
                                        b1Var23 = b1Var56;
                                        b1Var20 = b1Var61;
                                        b1Var21 = b1Var54;
                                    }
                                    jVar2 = jVar3;
                                    b1Var22 = b1Var23;
                                    ys.a.k(i23, iIntValue5, fFloatValue, cVar5, (fz.a) objQ23, null, sVar4, 0);
                                    sVar4 = sVar4;
                                    z26 = false;
                                } else {
                                    b1Var20 = b1Var61;
                                    b1Var21 = b1Var54;
                                    b1Var22 = b1Var56;
                                    jVar2 = jVar11;
                                    z26 = false;
                                    sVar4.d0(1050243442);
                                }
                                sVar4.p(z26);
                                sVar4.p(z26);
                            }
                            String strE3 = ub.a.e0(sVar4, R.string.sound_effect);
                            boolean zBooleanValue4 = ((Boolean) b1Var22.getValue()).booleanValue();
                            boolean zF16 = sVar4.f(b1Var22) | sVar4.f(b1Var17) | sVar4.f(b1Var53) | sVar4.f(b1Var57) | sVar4.f(b1Var12) | sVar4.f(b1Var21) | sVar4.f(b1Var20) | sVar4.f(jVar2);
                            Object objQ24 = sVar4.Q();
                            if (zF16) {
                                gVar2 = gVar6;
                            } else {
                                gVar2 = gVar6;
                                if (objQ24 != gVar2) {
                                    jVar4 = jVar2;
                                    b1Var24 = b1Var22;
                                    b1Var25 = b1Var21;
                                    b1Var26 = b1Var20;
                                }
                                ys.a.m(strE3, zBooleanValue4, (fz.c) objQ24, sVar4, 0);
                                z1.r rVarI3 = j0.e2.i(j0.e2.e(oVar2, 1.0f), 62, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                j0.e eVar3 = j0.i.f35309g;
                                z1.i iVar6 = z1.c.M;
                                j0.a2 a2VarA5 = j0.z1.a(eVar3, iVar6, sVar4, 54);
                                iHashCode = Long.hashCode(sVar4.T);
                                l1.q1 q1VarL7 = sVar4.l();
                                z1.r rVarC9 = z1.a.c(sVar4, rVarI3);
                                sVar4.h0();
                                if (sVar4.S) {
                                    iVar = iVar3;
                                    sVar4.k(iVar);
                                } else {
                                    iVar = iVar3;
                                    sVar4.r0();
                                }
                                gVar3 = gVar2;
                                l1.t.J(hVar4, a2VarA5, sVar4);
                                l1.t.J(hVar5, q1VarL7, sVar4);
                                if (sVar4.S) {
                                    oVar = oVar2;
                                } else {
                                    oVar = oVar2;
                                    if (!kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                                        hVar = hVar6;
                                    }
                                    l1.t.J(hVar7, rVarC9, sVar4);
                                    String strE10 = ub.a.e0(sVar4, R.string.audio_speed);
                                    l1.c3 c3Var14 = fc.f30256a;
                                    j3.y0 y0Var7 = ((dc) sVar4.j(c3Var14)).f30175h;
                                    l1.c3 c3Var15 = h1.v1.f31180a;
                                    hVar2 = hVar;
                                    j3.y0 y0VarA7 = j3.y0.a(y0Var7, ((h1.s1) sVar4.j(c3Var15)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                                    if (1.0f <= 0.0d) {
                                        k0.a.a("invalid weight; must be greater than zero");
                                    }
                                    sVar3 = sVar4;
                                    iVar2 = iVar;
                                    z1.o oVar9 = oVar;
                                    jVar5 = jVar4;
                                    b1Var27 = b1Var25;
                                    b1Var28 = b1Var12;
                                    b1Var29 = b1Var24;
                                    b1Var30 = b1Var26;
                                    b1Var31 = b1Var17;
                                    ua.b(strE10, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA7, sVar3, 0, 0, 65532);
                                    j0.a2 a2VarA9 = j0.z1.a(j0.i.f35303a, iVar6, sVar3, 48);
                                    iHashCode2 = Long.hashCode(sVar3.T);
                                    l1.q1 q1VarL11 = sVar3.l();
                                    z1.r rVarC13 = z1.a.c(sVar3, oVar9);
                                    sVar3.h0();
                                    if (sVar3.S) {
                                        sVar3.k(iVar2);
                                    } else {
                                        sVar3.r0();
                                    }
                                    l1.t.J(hVar4, a2VarA9, sVar3);
                                    l1.t.J(hVar5, q1VarL11, sVar3);
                                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                    }
                                    l1.t.J(hVar7, rVarC13, sVar3);
                                    zF = sVar3.f(b1Var57) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var27) | sVar3.f(b1Var30) | sVar3.f(b1Var29) | sVar3.f(jVar5);
                                    objQ12 = sVar3.Q();
                                    if (zF) {
                                        gVar4 = gVar3;
                                    } else {
                                        gVar4 = gVar3;
                                        if (objQ12 == gVar4) {
                                            b1Var32 = b1Var29;
                                            jVar6 = jVar5;
                                            b1Var33 = b1Var30;
                                            b1Var35 = b1Var27;
                                            b1Var34 = b1Var57;
                                        }
                                        fz.a aVar119 = (fz.a) objQ12;
                                        if (((Number) b1Var34.getValue()).intValue() > 50) {
                                            z27 = true;
                                        } else {
                                            z27 = false;
                                        }
                                        jVar7 = jVar6;
                                        b1Var36 = b1Var33;
                                        b1Var37 = b1Var32;
                                        k7.h(aVar119, null, z27, null, g.C0, sVar3, 196608, 26);
                                        float f115 = 8;
                                        ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar9, f115, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                        zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                        objQ13 = sVar3.Q();
                                        if (!zF2 || objQ13 == gVar4) {
                                            jVar8 = jVar7;
                                            b1Var38 = b1Var36;
                                            b1Var39 = b1Var37;
                                            objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                            sVar3.o0(objQ13);
                                        } else {
                                            jVar8 = jVar7;
                                            b1Var38 = b1Var36;
                                            b1Var39 = b1Var37;
                                        }
                                        fz.a aVar1110 = (fz.a) objQ13;
                                        if (((Number) b1Var34.getValue()).intValue() < 150) {
                                            z28 = true;
                                        } else {
                                            z28 = false;
                                        }
                                        k7.h(aVar1110, null, z28, null, g.D0, sVar3, 196608, 26);
                                        sVar3.p(true);
                                        sVar3.p(true);
                                        b1Var40 = b1Var39;
                                        jVar9 = jVar8;
                                        b1Var41 = b1Var38;
                                        l1.g gVar111 = gVar4;
                                        ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var14)).f30175h, ((h1.s1) sVar3.j(c3Var15)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                        int iIntValue110 = ((Number) b1Var53.getValue()).intValue();
                                        z1.r rVarE15 = j0.c.E(oVar9, CropImageView.DEFAULT_ASPECT_RATIO, f115, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                        zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                        objQ14 = sVar3.Q();
                                        if (zF3 || objQ14 == gVar111) {
                                            final int i21113 = 2;
                                            final l1.b1 b1Var6111118 = b1Var34;
                                            final l1.b1 b1Var6111119 = b1Var35;
                                            objQ14 = new fz.c() { // from class: mt.o3
                                                @Override // fz.c
                                                public final Object invoke(Object obj4) {
                                                    switch (i21113) {
                                                        case 0:
                                                            Integer num = (Integer) obj4;
                                                            int iIntValue111 = num.intValue();
                                                            l1.b1 b1Var510 = b1Var53;
                                                            b1Var510.setValue(num);
                                                            g.D(jVar9, b1Var510, b1Var31, b1Var6111118, b1Var28, b1Var6111119, b1Var41, b1Var40, iIntValue111, 0, 0, 0, 0, false, 32256);
                                                            break;
                                                        case 1:
                                                            Boolean bool = (Boolean) obj4;
                                                            boolean zBooleanValue5 = bool.booleanValue();
                                                            l1.b1 b1Var511 = b1Var53;
                                                            b1Var511.setValue(bool);
                                                            g.D(jVar9, b1Var31, b1Var6111118, b1Var28, b1Var6111119, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                            break;
                                                        case 2:
                                                            Integer num2 = (Integer) obj4;
                                                            int iIntValue112 = num2.intValue();
                                                            l1.b1 b1Var512 = b1Var53;
                                                            b1Var512.setValue(num2);
                                                            g.D(jVar9, b1Var31, b1Var512, b1Var6111118, b1Var28, b1Var6111119, b1Var41, b1Var40, 0, iIntValue112, 0, 0, 0, false, 32000);
                                                            break;
                                                        default:
                                                            Integer num3 = (Integer) obj4;
                                                            int iIntValue113 = num3.intValue();
                                                            l1.b1 b1Var513 = b1Var53;
                                                            b1Var513.setValue(num3);
                                                            g.D(jVar9, b1Var31, b1Var6111118, b1Var28, b1Var6111119, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue113, false, 28416);
                                                            break;
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            };
                                            sVar3.o0(objQ14);
                                        }
                                        ys.a.y(iIntValue110, 48, (fz.c) objQ14, sVar3, rVarE15);
                                        sVar3.p(true);
                                        sVar3.p(true);
                                    }
                                    b1Var32 = b1Var29;
                                    jVar6 = jVar5;
                                    b1Var33 = b1Var30;
                                    objQ12 = new p3(1, jVar6, b1Var57, b1Var31, b1Var53, b1Var28, b1Var27, b1Var33, b1Var32);
                                    b1Var34 = b1Var57;
                                    b1Var35 = b1Var27;
                                    sVar3.o0(objQ12);
                                    fz.a aVar1111 = (fz.a) objQ12;
                                    if (((Number) b1Var34.getValue()).intValue() > 50) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    jVar7 = jVar6;
                                    b1Var36 = b1Var33;
                                    b1Var37 = b1Var32;
                                    k7.h(aVar1111, null, z27, null, g.C0, sVar3, 196608, 26);
                                    float f116 = 8;
                                    ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar9, f116, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                    zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                    objQ13 = sVar3.Q();
                                    if (zF2) {
                                        jVar8 = jVar7;
                                        b1Var38 = b1Var36;
                                        b1Var39 = b1Var37;
                                        objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                        sVar3.o0(objQ13);
                                    } else {
                                        jVar8 = jVar7;
                                        b1Var38 = b1Var36;
                                        b1Var39 = b1Var37;
                                        objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                        sVar3.o0(objQ13);
                                    }
                                    fz.a aVar1112 = (fz.a) objQ13;
                                    if (((Number) b1Var34.getValue()).intValue() < 150) {
                                        z28 = true;
                                    } else {
                                        z28 = false;
                                    }
                                    k7.h(aVar1112, null, z28, null, g.D0, sVar3, 196608, 26);
                                    sVar3.p(true);
                                    sVar3.p(true);
                                    b1Var40 = b1Var39;
                                    jVar9 = jVar8;
                                    b1Var41 = b1Var38;
                                    l1.g gVar112 = gVar4;
                                    ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var14)).f30175h, ((h1.s1) sVar3.j(c3Var15)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                    int iIntValue111 = ((Number) b1Var53.getValue()).intValue();
                                    z1.r rVarE16 = j0.c.E(oVar9, CropImageView.DEFAULT_ASPECT_RATIO, f116, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                    zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                    objQ14 = sVar3.Q();
                                    if (zF3) {
                                        final int i21114 = 2;
                                        final l1.b1 b1Var61111110 = b1Var34;
                                        final l1.b1 b1Var61111111 = b1Var35;
                                        objQ14 = new fz.c() { // from class: mt.o3
                                            @Override // fz.c
                                            public final Object invoke(Object obj4) {
                                                switch (i21114) {
                                                    case 0:
                                                        Integer num = (Integer) obj4;
                                                        int iIntValue112 = num.intValue();
                                                        l1.b1 b1Var510 = b1Var53;
                                                        b1Var510.setValue(num);
                                                        g.D(jVar9, b1Var510, b1Var31, b1Var61111110, b1Var28, b1Var61111111, b1Var41, b1Var40, iIntValue112, 0, 0, 0, 0, false, 32256);
                                                        break;
                                                    case 1:
                                                        Boolean bool = (Boolean) obj4;
                                                        boolean zBooleanValue5 = bool.booleanValue();
                                                        l1.b1 b1Var511 = b1Var53;
                                                        b1Var511.setValue(bool);
                                                        g.D(jVar9, b1Var31, b1Var61111110, b1Var28, b1Var61111111, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                        break;
                                                    case 2:
                                                        Integer num2 = (Integer) obj4;
                                                        int iIntValue113 = num2.intValue();
                                                        l1.b1 b1Var512 = b1Var53;
                                                        b1Var512.setValue(num2);
                                                        g.D(jVar9, b1Var31, b1Var512, b1Var61111110, b1Var28, b1Var61111111, b1Var41, b1Var40, 0, iIntValue113, 0, 0, 0, false, 32000);
                                                        break;
                                                    default:
                                                        Integer num3 = (Integer) obj4;
                                                        int iIntValue114 = num3.intValue();
                                                        l1.b1 b1Var513 = b1Var53;
                                                        b1Var513.setValue(num3);
                                                        g.D(jVar9, b1Var31, b1Var61111110, b1Var28, b1Var61111111, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue114, false, 28416);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar3.o0(objQ14);
                                    } else {
                                        final int i21115 = 2;
                                        final l1.b1 b1Var61111112 = b1Var34;
                                        final l1.b1 b1Var61111113 = b1Var35;
                                        objQ14 = new fz.c() { // from class: mt.o3
                                            @Override // fz.c
                                            public final Object invoke(Object obj4) {
                                                switch (i21115) {
                                                    case 0:
                                                        Integer num = (Integer) obj4;
                                                        int iIntValue112 = num.intValue();
                                                        l1.b1 b1Var510 = b1Var53;
                                                        b1Var510.setValue(num);
                                                        g.D(jVar9, b1Var510, b1Var31, b1Var61111112, b1Var28, b1Var61111113, b1Var41, b1Var40, iIntValue112, 0, 0, 0, 0, false, 32256);
                                                        break;
                                                    case 1:
                                                        Boolean bool = (Boolean) obj4;
                                                        boolean zBooleanValue5 = bool.booleanValue();
                                                        l1.b1 b1Var511 = b1Var53;
                                                        b1Var511.setValue(bool);
                                                        g.D(jVar9, b1Var31, b1Var61111112, b1Var28, b1Var61111113, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                        break;
                                                    case 2:
                                                        Integer num2 = (Integer) obj4;
                                                        int iIntValue113 = num2.intValue();
                                                        l1.b1 b1Var512 = b1Var53;
                                                        b1Var512.setValue(num2);
                                                        g.D(jVar9, b1Var31, b1Var512, b1Var61111112, b1Var28, b1Var61111113, b1Var41, b1Var40, 0, iIntValue113, 0, 0, 0, false, 32000);
                                                        break;
                                                    default:
                                                        Integer num3 = (Integer) obj4;
                                                        int iIntValue114 = num3.intValue();
                                                        l1.b1 b1Var513 = b1Var53;
                                                        b1Var513.setValue(num3);
                                                        g.D(jVar9, b1Var31, b1Var61111112, b1Var28, b1Var61111113, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue114, false, 28416);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar3.o0(objQ14);
                                    }
                                    ys.a.y(iIntValue111, 48, (fz.c) objQ14, sVar3, rVarE16);
                                    sVar3.p(true);
                                    sVar3.p(true);
                                }
                                hVar = hVar6;
                                defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
                                l1.t.J(hVar7, rVarC9, sVar4);
                                String strE11 = ub.a.e0(sVar4, R.string.audio_speed);
                                l1.c3 c3Var16 = fc.f30256a;
                                j3.y0 y0Var8 = ((dc) sVar4.j(c3Var16)).f30175h;
                                l1.c3 c3Var17 = h1.v1.f31180a;
                                hVar2 = hVar;
                                j3.y0 y0VarA8 = j3.y0.a(y0Var8, ((h1.s1) sVar4.j(c3Var17)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                                if (1.0f <= 0.0d) {
                                    k0.a.a("invalid weight; must be greater than zero");
                                }
                                sVar3 = sVar4;
                                iVar2 = iVar;
                                z1.o oVar10 = oVar;
                                jVar5 = jVar4;
                                b1Var27 = b1Var25;
                                b1Var28 = b1Var12;
                                b1Var29 = b1Var24;
                                b1Var30 = b1Var26;
                                b1Var31 = b1Var17;
                                ua.b(strE11, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA8, sVar3, 0, 0, 65532);
                                j0.a2 a2VarA10 = j0.z1.a(j0.i.f35303a, iVar6, sVar3, 48);
                                iHashCode2 = Long.hashCode(sVar3.T);
                                l1.q1 q1VarL12 = sVar3.l();
                                z1.r rVarC14 = z1.a.c(sVar3, oVar10);
                                sVar3.h0();
                                if (sVar3.S) {
                                    sVar3.k(iVar2);
                                } else {
                                    sVar3.r0();
                                }
                                l1.t.J(hVar4, a2VarA10, sVar3);
                                l1.t.J(hVar5, q1VarL12, sVar3);
                                if (sVar3.S) {
                                    defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                } else {
                                    defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                }
                                l1.t.J(hVar7, rVarC14, sVar3);
                                zF = sVar3.f(b1Var57) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var27) | sVar3.f(b1Var30) | sVar3.f(b1Var29) | sVar3.f(jVar5);
                                objQ12 = sVar3.Q();
                                if (zF) {
                                    gVar4 = gVar3;
                                    if (objQ12 == gVar4) {
                                        b1Var32 = b1Var29;
                                        jVar6 = jVar5;
                                        b1Var33 = b1Var30;
                                        b1Var35 = b1Var27;
                                        b1Var34 = b1Var57;
                                    }
                                    fz.a aVar1113 = (fz.a) objQ12;
                                    if (((Number) b1Var34.getValue()).intValue() > 50) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    jVar7 = jVar6;
                                    b1Var36 = b1Var33;
                                    b1Var37 = b1Var32;
                                    k7.h(aVar1113, null, z27, null, g.C0, sVar3, 196608, 26);
                                    float f117 = 8;
                                    ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar10, f117, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                    zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                    objQ13 = sVar3.Q();
                                    if (zF2) {
                                        jVar8 = jVar7;
                                        b1Var38 = b1Var36;
                                        b1Var39 = b1Var37;
                                        objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                        sVar3.o0(objQ13);
                                    } else {
                                        jVar8 = jVar7;
                                        b1Var38 = b1Var36;
                                        b1Var39 = b1Var37;
                                        objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                        sVar3.o0(objQ13);
                                    }
                                    fz.a aVar1114 = (fz.a) objQ13;
                                    if (((Number) b1Var34.getValue()).intValue() < 150) {
                                        z28 = true;
                                    } else {
                                        z28 = false;
                                    }
                                    k7.h(aVar1114, null, z28, null, g.D0, sVar3, 196608, 26);
                                    sVar3.p(true);
                                    sVar3.p(true);
                                    b1Var40 = b1Var39;
                                    jVar9 = jVar8;
                                    b1Var41 = b1Var38;
                                    l1.g gVar113 = gVar4;
                                    ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var16)).f30175h, ((h1.s1) sVar3.j(c3Var17)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                    int iIntValue112 = ((Number) b1Var53.getValue()).intValue();
                                    z1.r rVarE17 = j0.c.E(oVar10, CropImageView.DEFAULT_ASPECT_RATIO, f117, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                    zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                    objQ14 = sVar3.Q();
                                    if (zF3) {
                                        final int i21116 = 2;
                                        final l1.b1 b1Var61111114 = b1Var34;
                                        final l1.b1 b1Var61111115 = b1Var35;
                                        objQ14 = new fz.c() { // from class: mt.o3
                                            @Override // fz.c
                                            public final Object invoke(Object obj4) {
                                                switch (i21116) {
                                                    case 0:
                                                        Integer num = (Integer) obj4;
                                                        int iIntValue113 = num.intValue();
                                                        l1.b1 b1Var510 = b1Var53;
                                                        b1Var510.setValue(num);
                                                        g.D(jVar9, b1Var510, b1Var31, b1Var61111114, b1Var28, b1Var61111115, b1Var41, b1Var40, iIntValue113, 0, 0, 0, 0, false, 32256);
                                                        break;
                                                    case 1:
                                                        Boolean bool = (Boolean) obj4;
                                                        boolean zBooleanValue5 = bool.booleanValue();
                                                        l1.b1 b1Var511 = b1Var53;
                                                        b1Var511.setValue(bool);
                                                        g.D(jVar9, b1Var31, b1Var61111114, b1Var28, b1Var61111115, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                        break;
                                                    case 2:
                                                        Integer num2 = (Integer) obj4;
                                                        int iIntValue114 = num2.intValue();
                                                        l1.b1 b1Var512 = b1Var53;
                                                        b1Var512.setValue(num2);
                                                        g.D(jVar9, b1Var31, b1Var512, b1Var61111114, b1Var28, b1Var61111115, b1Var41, b1Var40, 0, iIntValue114, 0, 0, 0, false, 32000);
                                                        break;
                                                    default:
                                                        Integer num3 = (Integer) obj4;
                                                        int iIntValue115 = num3.intValue();
                                                        l1.b1 b1Var513 = b1Var53;
                                                        b1Var513.setValue(num3);
                                                        g.D(jVar9, b1Var31, b1Var61111114, b1Var28, b1Var61111115, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue115, false, 28416);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar3.o0(objQ14);
                                    } else {
                                        final int i21117 = 2;
                                        final l1.b1 b1Var61111116 = b1Var34;
                                        final l1.b1 b1Var61111117 = b1Var35;
                                        objQ14 = new fz.c() { // from class: mt.o3
                                            @Override // fz.c
                                            public final Object invoke(Object obj4) {
                                                switch (i21117) {
                                                    case 0:
                                                        Integer num = (Integer) obj4;
                                                        int iIntValue113 = num.intValue();
                                                        l1.b1 b1Var510 = b1Var53;
                                                        b1Var510.setValue(num);
                                                        g.D(jVar9, b1Var510, b1Var31, b1Var61111116, b1Var28, b1Var61111117, b1Var41, b1Var40, iIntValue113, 0, 0, 0, 0, false, 32256);
                                                        break;
                                                    case 1:
                                                        Boolean bool = (Boolean) obj4;
                                                        boolean zBooleanValue5 = bool.booleanValue();
                                                        l1.b1 b1Var511 = b1Var53;
                                                        b1Var511.setValue(bool);
                                                        g.D(jVar9, b1Var31, b1Var61111116, b1Var28, b1Var61111117, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                        break;
                                                    case 2:
                                                        Integer num2 = (Integer) obj4;
                                                        int iIntValue114 = num2.intValue();
                                                        l1.b1 b1Var512 = b1Var53;
                                                        b1Var512.setValue(num2);
                                                        g.D(jVar9, b1Var31, b1Var512, b1Var61111116, b1Var28, b1Var61111117, b1Var41, b1Var40, 0, iIntValue114, 0, 0, 0, false, 32000);
                                                        break;
                                                    default:
                                                        Integer num3 = (Integer) obj4;
                                                        int iIntValue115 = num3.intValue();
                                                        l1.b1 b1Var513 = b1Var53;
                                                        b1Var513.setValue(num3);
                                                        g.D(jVar9, b1Var31, b1Var61111116, b1Var28, b1Var61111117, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue115, false, 28416);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar3.o0(objQ14);
                                    }
                                    ys.a.y(iIntValue112, 48, (fz.c) objQ14, sVar3, rVarE17);
                                    sVar3.p(true);
                                    sVar3.p(true);
                                } else {
                                    gVar4 = gVar3;
                                }
                                b1Var32 = b1Var29;
                                jVar6 = jVar5;
                                b1Var33 = b1Var30;
                                objQ12 = new p3(1, jVar6, b1Var57, b1Var31, b1Var53, b1Var28, b1Var27, b1Var33, b1Var32);
                                b1Var34 = b1Var57;
                                b1Var35 = b1Var27;
                                sVar3.o0(objQ12);
                                fz.a aVar1115 = (fz.a) objQ12;
                                if (((Number) b1Var34.getValue()).intValue() > 50) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                jVar7 = jVar6;
                                b1Var36 = b1Var33;
                                b1Var37 = b1Var32;
                                k7.h(aVar1115, null, z27, null, g.C0, sVar3, 196608, 26);
                                float f118 = 8;
                                ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar10, f118, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                objQ13 = sVar3.Q();
                                if (zF2) {
                                    jVar8 = jVar7;
                                    b1Var38 = b1Var36;
                                    b1Var39 = b1Var37;
                                    objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                    sVar3.o0(objQ13);
                                } else {
                                    jVar8 = jVar7;
                                    b1Var38 = b1Var36;
                                    b1Var39 = b1Var37;
                                    objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                    sVar3.o0(objQ13);
                                }
                                fz.a aVar1116 = (fz.a) objQ13;
                                if (((Number) b1Var34.getValue()).intValue() < 150) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                k7.h(aVar1116, null, z28, null, g.D0, sVar3, 196608, 26);
                                sVar3.p(true);
                                sVar3.p(true);
                                b1Var40 = b1Var39;
                                jVar9 = jVar8;
                                b1Var41 = b1Var38;
                                l1.g gVar114 = gVar4;
                                ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var16)).f30175h, ((h1.s1) sVar3.j(c3Var17)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                int iIntValue113 = ((Number) b1Var53.getValue()).intValue();
                                z1.r rVarE18 = j0.c.E(oVar10, CropImageView.DEFAULT_ASPECT_RATIO, f118, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                objQ14 = sVar3.Q();
                                if (zF3) {
                                    final int i21118 = 2;
                                    final l1.b1 b1Var61111118 = b1Var34;
                                    final l1.b1 b1Var61111119 = b1Var35;
                                    objQ14 = new fz.c() { // from class: mt.o3
                                        @Override // fz.c
                                        public final Object invoke(Object obj4) {
                                            switch (i21118) {
                                                case 0:
                                                    Integer num = (Integer) obj4;
                                                    int iIntValue114 = num.intValue();
                                                    l1.b1 b1Var510 = b1Var53;
                                                    b1Var510.setValue(num);
                                                    g.D(jVar9, b1Var510, b1Var31, b1Var61111118, b1Var28, b1Var61111119, b1Var41, b1Var40, iIntValue114, 0, 0, 0, 0, false, 32256);
                                                    break;
                                                case 1:
                                                    Boolean bool = (Boolean) obj4;
                                                    boolean zBooleanValue5 = bool.booleanValue();
                                                    l1.b1 b1Var511 = b1Var53;
                                                    b1Var511.setValue(bool);
                                                    g.D(jVar9, b1Var31, b1Var61111118, b1Var28, b1Var61111119, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                    break;
                                                case 2:
                                                    Integer num2 = (Integer) obj4;
                                                    int iIntValue115 = num2.intValue();
                                                    l1.b1 b1Var512 = b1Var53;
                                                    b1Var512.setValue(num2);
                                                    g.D(jVar9, b1Var31, b1Var512, b1Var61111118, b1Var28, b1Var61111119, b1Var41, b1Var40, 0, iIntValue115, 0, 0, 0, false, 32000);
                                                    break;
                                                default:
                                                    Integer num3 = (Integer) obj4;
                                                    int iIntValue116 = num3.intValue();
                                                    l1.b1 b1Var513 = b1Var53;
                                                    b1Var513.setValue(num3);
                                                    g.D(jVar9, b1Var31, b1Var61111118, b1Var28, b1Var61111119, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue116, false, 28416);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar3.o0(objQ14);
                                } else {
                                    final int i21119 = 2;
                                    final l1.b1 b1Var611111110 = b1Var34;
                                    final l1.b1 b1Var611111111 = b1Var35;
                                    objQ14 = new fz.c() { // from class: mt.o3
                                        @Override // fz.c
                                        public final Object invoke(Object obj4) {
                                            switch (i21119) {
                                                case 0:
                                                    Integer num = (Integer) obj4;
                                                    int iIntValue114 = num.intValue();
                                                    l1.b1 b1Var510 = b1Var53;
                                                    b1Var510.setValue(num);
                                                    g.D(jVar9, b1Var510, b1Var31, b1Var611111110, b1Var28, b1Var611111111, b1Var41, b1Var40, iIntValue114, 0, 0, 0, 0, false, 32256);
                                                    break;
                                                case 1:
                                                    Boolean bool = (Boolean) obj4;
                                                    boolean zBooleanValue5 = bool.booleanValue();
                                                    l1.b1 b1Var511 = b1Var53;
                                                    b1Var511.setValue(bool);
                                                    g.D(jVar9, b1Var31, b1Var611111110, b1Var28, b1Var611111111, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                    break;
                                                case 2:
                                                    Integer num2 = (Integer) obj4;
                                                    int iIntValue115 = num2.intValue();
                                                    l1.b1 b1Var512 = b1Var53;
                                                    b1Var512.setValue(num2);
                                                    g.D(jVar9, b1Var31, b1Var512, b1Var611111110, b1Var28, b1Var611111111, b1Var41, b1Var40, 0, iIntValue115, 0, 0, 0, false, 32000);
                                                    break;
                                                default:
                                                    Integer num3 = (Integer) obj4;
                                                    int iIntValue116 = num3.intValue();
                                                    l1.b1 b1Var513 = b1Var53;
                                                    b1Var513.setValue(num3);
                                                    g.D(jVar9, b1Var31, b1Var611111110, b1Var28, b1Var611111111, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue116, false, 28416);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar3.o0(objQ14);
                                }
                                ys.a.y(iIntValue113, 48, (fz.c) objQ14, sVar3, rVarE18);
                                sVar3.p(true);
                                sVar3.p(true);
                            }
                            final int i30 = 1;
                            final l1.b1 b1Var70 = b1Var21;
                            final l1.b1 b1Var71 = b1Var22;
                            final l1.b1 b1Var72 = b1Var17;
                            jVar4 = jVar2;
                            final l1.b1 b1Var73 = b1Var12;
                            final l1.b1 b1Var74 = b1Var20;
                            objQ24 = new fz.c() { // from class: mt.o3
                                @Override // fz.c
                                public final Object invoke(Object obj4) {
                                    switch (i30) {
                                        case 0:
                                            Integer num = (Integer) obj4;
                                            int iIntValue114 = num.intValue();
                                            l1.b1 b1Var510 = b1Var71;
                                            b1Var510.setValue(num);
                                            g.D(jVar4, b1Var510, b1Var72, b1Var53, b1Var57, b1Var73, b1Var70, b1Var74, iIntValue114, 0, 0, 0, 0, false, 32256);
                                            break;
                                        case 1:
                                            Boolean bool = (Boolean) obj4;
                                            boolean zBooleanValue5 = bool.booleanValue();
                                            l1.b1 b1Var511 = b1Var71;
                                            b1Var511.setValue(bool);
                                            g.D(jVar4, b1Var72, b1Var53, b1Var57, b1Var73, b1Var70, b1Var74, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                            break;
                                        case 2:
                                            Integer num2 = (Integer) obj4;
                                            int iIntValue115 = num2.intValue();
                                            l1.b1 b1Var512 = b1Var71;
                                            b1Var512.setValue(num2);
                                            g.D(jVar4, b1Var72, b1Var512, b1Var53, b1Var57, b1Var73, b1Var70, b1Var74, 0, iIntValue115, 0, 0, 0, false, 32000);
                                            break;
                                        default:
                                            Integer num3 = (Integer) obj4;
                                            int iIntValue116 = num3.intValue();
                                            l1.b1 b1Var513 = b1Var71;
                                            b1Var513.setValue(num3);
                                            g.D(jVar4, b1Var72, b1Var53, b1Var57, b1Var73, b1Var513, b1Var70, b1Var74, 0, 0, 0, 0, iIntValue116, false, 28416);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            b1Var24 = b1Var71;
                            b1Var25 = b1Var70;
                            b1Var26 = b1Var74;
                            sVar4.o0(objQ24);
                            ys.a.m(strE3, zBooleanValue4, (fz.c) objQ24, sVar4, 0);
                            z1.r rVarI4 = j0.e2.i(j0.e2.e(oVar2, 1.0f), 62, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            j0.e eVar4 = j0.i.f35309g;
                            z1.i iVar7 = z1.c.M;
                            j0.a2 a2VarA6 = j0.z1.a(eVar4, iVar7, sVar4, 54);
                            iHashCode = Long.hashCode(sVar4.T);
                            l1.q1 q1VarL8 = sVar4.l();
                            z1.r rVarC10 = z1.a.c(sVar4, rVarI4);
                            sVar4.h0();
                            if (sVar4.S) {
                                iVar = iVar3;
                                sVar4.k(iVar);
                            } else {
                                iVar = iVar3;
                                sVar4.r0();
                            }
                            gVar3 = gVar2;
                            l1.t.J(hVar4, a2VarA6, sVar4);
                            l1.t.J(hVar5, q1VarL8, sVar4);
                            if (sVar4.S) {
                                oVar = oVar2;
                                if (!kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                                    hVar = hVar6;
                                }
                                l1.t.J(hVar7, rVarC10, sVar4);
                                String strE12 = ub.a.e0(sVar4, R.string.audio_speed);
                                l1.c3 c3Var18 = fc.f30256a;
                                j3.y0 y0Var9 = ((dc) sVar4.j(c3Var18)).f30175h;
                                l1.c3 c3Var19 = h1.v1.f31180a;
                                hVar2 = hVar;
                                j3.y0 y0VarA9 = j3.y0.a(y0Var9, ((h1.s1) sVar4.j(c3Var19)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                                if (1.0f <= 0.0d) {
                                    k0.a.a("invalid weight; must be greater than zero");
                                }
                                sVar3 = sVar4;
                                iVar2 = iVar;
                                z1.o oVar11 = oVar;
                                jVar5 = jVar4;
                                b1Var27 = b1Var25;
                                b1Var28 = b1Var12;
                                b1Var29 = b1Var24;
                                b1Var30 = b1Var26;
                                b1Var31 = b1Var17;
                                ua.b(strE12, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA9, sVar3, 0, 0, 65532);
                                j0.a2 a2VarA11 = j0.z1.a(j0.i.f35303a, iVar7, sVar3, 48);
                                iHashCode2 = Long.hashCode(sVar3.T);
                                l1.q1 q1VarL13 = sVar3.l();
                                z1.r rVarC15 = z1.a.c(sVar3, oVar11);
                                sVar3.h0();
                                if (sVar3.S) {
                                    sVar3.k(iVar2);
                                } else {
                                    sVar3.r0();
                                }
                                l1.t.J(hVar4, a2VarA11, sVar3);
                                l1.t.J(hVar5, q1VarL13, sVar3);
                                if (sVar3.S) {
                                    defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                } else {
                                    defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                }
                                l1.t.J(hVar7, rVarC15, sVar3);
                                zF = sVar3.f(b1Var57) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var27) | sVar3.f(b1Var30) | sVar3.f(b1Var29) | sVar3.f(jVar5);
                                objQ12 = sVar3.Q();
                                if (zF) {
                                    gVar4 = gVar3;
                                    if (objQ12 == gVar4) {
                                        b1Var32 = b1Var29;
                                        jVar6 = jVar5;
                                        b1Var33 = b1Var30;
                                        b1Var35 = b1Var27;
                                        b1Var34 = b1Var57;
                                    }
                                    fz.a aVar1117 = (fz.a) objQ12;
                                    if (((Number) b1Var34.getValue()).intValue() > 50) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    jVar7 = jVar6;
                                    b1Var36 = b1Var33;
                                    b1Var37 = b1Var32;
                                    k7.h(aVar1117, null, z27, null, g.C0, sVar3, 196608, 26);
                                    float f119 = 8;
                                    ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar11, f119, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                    zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                    objQ13 = sVar3.Q();
                                    if (zF2) {
                                        jVar8 = jVar7;
                                        b1Var38 = b1Var36;
                                        b1Var39 = b1Var37;
                                        objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                        sVar3.o0(objQ13);
                                    } else {
                                        jVar8 = jVar7;
                                        b1Var38 = b1Var36;
                                        b1Var39 = b1Var37;
                                        objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                        sVar3.o0(objQ13);
                                    }
                                    fz.a aVar1118 = (fz.a) objQ13;
                                    if (((Number) b1Var34.getValue()).intValue() < 150) {
                                        z28 = true;
                                    } else {
                                        z28 = false;
                                    }
                                    k7.h(aVar1118, null, z28, null, g.D0, sVar3, 196608, 26);
                                    sVar3.p(true);
                                    sVar3.p(true);
                                    b1Var40 = b1Var39;
                                    jVar9 = jVar8;
                                    b1Var41 = b1Var38;
                                    l1.g gVar115 = gVar4;
                                    ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var18)).f30175h, ((h1.s1) sVar3.j(c3Var19)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                    int iIntValue114 = ((Number) b1Var53.getValue()).intValue();
                                    z1.r rVarE19 = j0.c.E(oVar11, CropImageView.DEFAULT_ASPECT_RATIO, f119, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                    zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                    objQ14 = sVar3.Q();
                                    if (zF3) {
                                        final int i211110 = 2;
                                        final l1.b1 b1Var611111112 = b1Var34;
                                        final l1.b1 b1Var611111113 = b1Var35;
                                        objQ14 = new fz.c() { // from class: mt.o3
                                            @Override // fz.c
                                            public final Object invoke(Object obj4) {
                                                switch (i211110) {
                                                    case 0:
                                                        Integer num = (Integer) obj4;
                                                        int iIntValue115 = num.intValue();
                                                        l1.b1 b1Var510 = b1Var53;
                                                        b1Var510.setValue(num);
                                                        g.D(jVar9, b1Var510, b1Var31, b1Var611111112, b1Var28, b1Var611111113, b1Var41, b1Var40, iIntValue115, 0, 0, 0, 0, false, 32256);
                                                        break;
                                                    case 1:
                                                        Boolean bool = (Boolean) obj4;
                                                        boolean zBooleanValue5 = bool.booleanValue();
                                                        l1.b1 b1Var511 = b1Var53;
                                                        b1Var511.setValue(bool);
                                                        g.D(jVar9, b1Var31, b1Var611111112, b1Var28, b1Var611111113, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                        break;
                                                    case 2:
                                                        Integer num2 = (Integer) obj4;
                                                        int iIntValue116 = num2.intValue();
                                                        l1.b1 b1Var512 = b1Var53;
                                                        b1Var512.setValue(num2);
                                                        g.D(jVar9, b1Var31, b1Var512, b1Var611111112, b1Var28, b1Var611111113, b1Var41, b1Var40, 0, iIntValue116, 0, 0, 0, false, 32000);
                                                        break;
                                                    default:
                                                        Integer num3 = (Integer) obj4;
                                                        int iIntValue117 = num3.intValue();
                                                        l1.b1 b1Var513 = b1Var53;
                                                        b1Var513.setValue(num3);
                                                        g.D(jVar9, b1Var31, b1Var611111112, b1Var28, b1Var611111113, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue117, false, 28416);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar3.o0(objQ14);
                                    } else {
                                        final int i211111 = 2;
                                        final l1.b1 b1Var611111114 = b1Var34;
                                        final l1.b1 b1Var611111115 = b1Var35;
                                        objQ14 = new fz.c() { // from class: mt.o3
                                            @Override // fz.c
                                            public final Object invoke(Object obj4) {
                                                switch (i211111) {
                                                    case 0:
                                                        Integer num = (Integer) obj4;
                                                        int iIntValue115 = num.intValue();
                                                        l1.b1 b1Var510 = b1Var53;
                                                        b1Var510.setValue(num);
                                                        g.D(jVar9, b1Var510, b1Var31, b1Var611111114, b1Var28, b1Var611111115, b1Var41, b1Var40, iIntValue115, 0, 0, 0, 0, false, 32256);
                                                        break;
                                                    case 1:
                                                        Boolean bool = (Boolean) obj4;
                                                        boolean zBooleanValue5 = bool.booleanValue();
                                                        l1.b1 b1Var511 = b1Var53;
                                                        b1Var511.setValue(bool);
                                                        g.D(jVar9, b1Var31, b1Var611111114, b1Var28, b1Var611111115, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                        break;
                                                    case 2:
                                                        Integer num2 = (Integer) obj4;
                                                        int iIntValue116 = num2.intValue();
                                                        l1.b1 b1Var512 = b1Var53;
                                                        b1Var512.setValue(num2);
                                                        g.D(jVar9, b1Var31, b1Var512, b1Var611111114, b1Var28, b1Var611111115, b1Var41, b1Var40, 0, iIntValue116, 0, 0, 0, false, 32000);
                                                        break;
                                                    default:
                                                        Integer num3 = (Integer) obj4;
                                                        int iIntValue117 = num3.intValue();
                                                        l1.b1 b1Var513 = b1Var53;
                                                        b1Var513.setValue(num3);
                                                        g.D(jVar9, b1Var31, b1Var611111114, b1Var28, b1Var611111115, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue117, false, 28416);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar3.o0(objQ14);
                                    }
                                    ys.a.y(iIntValue114, 48, (fz.c) objQ14, sVar3, rVarE19);
                                    sVar3.p(true);
                                    sVar3.p(true);
                                } else {
                                    gVar4 = gVar3;
                                }
                                b1Var32 = b1Var29;
                                jVar6 = jVar5;
                                b1Var33 = b1Var30;
                                objQ12 = new p3(1, jVar6, b1Var57, b1Var31, b1Var53, b1Var28, b1Var27, b1Var33, b1Var32);
                                b1Var34 = b1Var57;
                                b1Var35 = b1Var27;
                                sVar3.o0(objQ12);
                                fz.a aVar1119 = (fz.a) objQ12;
                                if (((Number) b1Var34.getValue()).intValue() > 50) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                jVar7 = jVar6;
                                b1Var36 = b1Var33;
                                b1Var37 = b1Var32;
                                k7.h(aVar1119, null, z27, null, g.C0, sVar3, 196608, 26);
                                float f1110 = 8;
                                ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar11, f1110, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                objQ13 = sVar3.Q();
                                if (zF2) {
                                    jVar8 = jVar7;
                                    b1Var38 = b1Var36;
                                    b1Var39 = b1Var37;
                                    objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                    sVar3.o0(objQ13);
                                } else {
                                    jVar8 = jVar7;
                                    b1Var38 = b1Var36;
                                    b1Var39 = b1Var37;
                                    objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                    sVar3.o0(objQ13);
                                }
                                fz.a aVar11110 = (fz.a) objQ13;
                                if (((Number) b1Var34.getValue()).intValue() < 150) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                k7.h(aVar11110, null, z28, null, g.D0, sVar3, 196608, 26);
                                sVar3.p(true);
                                sVar3.p(true);
                                b1Var40 = b1Var39;
                                jVar9 = jVar8;
                                b1Var41 = b1Var38;
                                l1.g gVar116 = gVar4;
                                ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var18)).f30175h, ((h1.s1) sVar3.j(c3Var19)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                int iIntValue115 = ((Number) b1Var53.getValue()).intValue();
                                z1.r rVarE110 = j0.c.E(oVar11, CropImageView.DEFAULT_ASPECT_RATIO, f1110, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                objQ14 = sVar3.Q();
                                if (zF3) {
                                    final int i211112 = 2;
                                    final l1.b1 b1Var611111116 = b1Var34;
                                    final l1.b1 b1Var611111117 = b1Var35;
                                    objQ14 = new fz.c() { // from class: mt.o3
                                        @Override // fz.c
                                        public final Object invoke(Object obj4) {
                                            switch (i211112) {
                                                case 0:
                                                    Integer num = (Integer) obj4;
                                                    int iIntValue116 = num.intValue();
                                                    l1.b1 b1Var510 = b1Var53;
                                                    b1Var510.setValue(num);
                                                    g.D(jVar9, b1Var510, b1Var31, b1Var611111116, b1Var28, b1Var611111117, b1Var41, b1Var40, iIntValue116, 0, 0, 0, 0, false, 32256);
                                                    break;
                                                case 1:
                                                    Boolean bool = (Boolean) obj4;
                                                    boolean zBooleanValue5 = bool.booleanValue();
                                                    l1.b1 b1Var511 = b1Var53;
                                                    b1Var511.setValue(bool);
                                                    g.D(jVar9, b1Var31, b1Var611111116, b1Var28, b1Var611111117, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                    break;
                                                case 2:
                                                    Integer num2 = (Integer) obj4;
                                                    int iIntValue117 = num2.intValue();
                                                    l1.b1 b1Var512 = b1Var53;
                                                    b1Var512.setValue(num2);
                                                    g.D(jVar9, b1Var31, b1Var512, b1Var611111116, b1Var28, b1Var611111117, b1Var41, b1Var40, 0, iIntValue117, 0, 0, 0, false, 32000);
                                                    break;
                                                default:
                                                    Integer num3 = (Integer) obj4;
                                                    int iIntValue118 = num3.intValue();
                                                    l1.b1 b1Var513 = b1Var53;
                                                    b1Var513.setValue(num3);
                                                    g.D(jVar9, b1Var31, b1Var611111116, b1Var28, b1Var611111117, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue118, false, 28416);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar3.o0(objQ14);
                                } else {
                                    final int i211113 = 2;
                                    final l1.b1 b1Var611111118 = b1Var34;
                                    final l1.b1 b1Var611111119 = b1Var35;
                                    objQ14 = new fz.c() { // from class: mt.o3
                                        @Override // fz.c
                                        public final Object invoke(Object obj4) {
                                            switch (i211113) {
                                                case 0:
                                                    Integer num = (Integer) obj4;
                                                    int iIntValue116 = num.intValue();
                                                    l1.b1 b1Var510 = b1Var53;
                                                    b1Var510.setValue(num);
                                                    g.D(jVar9, b1Var510, b1Var31, b1Var611111118, b1Var28, b1Var611111119, b1Var41, b1Var40, iIntValue116, 0, 0, 0, 0, false, 32256);
                                                    break;
                                                case 1:
                                                    Boolean bool = (Boolean) obj4;
                                                    boolean zBooleanValue5 = bool.booleanValue();
                                                    l1.b1 b1Var511 = b1Var53;
                                                    b1Var511.setValue(bool);
                                                    g.D(jVar9, b1Var31, b1Var611111118, b1Var28, b1Var611111119, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                    break;
                                                case 2:
                                                    Integer num2 = (Integer) obj4;
                                                    int iIntValue117 = num2.intValue();
                                                    l1.b1 b1Var512 = b1Var53;
                                                    b1Var512.setValue(num2);
                                                    g.D(jVar9, b1Var31, b1Var512, b1Var611111118, b1Var28, b1Var611111119, b1Var41, b1Var40, 0, iIntValue117, 0, 0, 0, false, 32000);
                                                    break;
                                                default:
                                                    Integer num3 = (Integer) obj4;
                                                    int iIntValue118 = num3.intValue();
                                                    l1.b1 b1Var513 = b1Var53;
                                                    b1Var513.setValue(num3);
                                                    g.D(jVar9, b1Var31, b1Var611111118, b1Var28, b1Var611111119, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue118, false, 28416);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar3.o0(objQ14);
                                }
                                ys.a.y(iIntValue115, 48, (fz.c) objQ14, sVar3, rVarE110);
                                sVar3.p(true);
                                sVar3.p(true);
                            } else {
                                oVar = oVar2;
                            }
                            hVar = hVar6;
                            defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
                            l1.t.J(hVar7, rVarC10, sVar4);
                            String strE13 = ub.a.e0(sVar4, R.string.audio_speed);
                            l1.c3 c3Var110 = fc.f30256a;
                            j3.y0 y0Var10 = ((dc) sVar4.j(c3Var110)).f30175h;
                            l1.c3 c3Var111 = h1.v1.f31180a;
                            hVar2 = hVar;
                            j3.y0 y0VarA10 = j3.y0.a(y0Var10, ((h1.s1) sVar4.j(c3Var111)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                            if (1.0f <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            sVar3 = sVar4;
                            iVar2 = iVar;
                            z1.o oVar12 = oVar;
                            jVar5 = jVar4;
                            b1Var27 = b1Var25;
                            b1Var28 = b1Var12;
                            b1Var29 = b1Var24;
                            b1Var30 = b1Var26;
                            b1Var31 = b1Var17;
                            ua.b(strE13, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA10, sVar3, 0, 0, 65532);
                            j0.a2 a2VarA12 = j0.z1.a(j0.i.f35303a, iVar7, sVar3, 48);
                            iHashCode2 = Long.hashCode(sVar3.T);
                            l1.q1 q1VarL14 = sVar3.l();
                            z1.r rVarC16 = z1.a.c(sVar3, oVar12);
                            sVar3.h0();
                            if (sVar3.S) {
                                sVar3.k(iVar2);
                            } else {
                                sVar3.r0();
                            }
                            l1.t.J(hVar4, a2VarA12, sVar3);
                            l1.t.J(hVar5, q1VarL14, sVar3);
                            if (sVar3.S) {
                                defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                            } else {
                                defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                            }
                            l1.t.J(hVar7, rVarC16, sVar3);
                            zF = sVar3.f(b1Var57) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var27) | sVar3.f(b1Var30) | sVar3.f(b1Var29) | sVar3.f(jVar5);
                            objQ12 = sVar3.Q();
                            if (zF) {
                                gVar4 = gVar3;
                                if (objQ12 == gVar4) {
                                    b1Var32 = b1Var29;
                                    jVar6 = jVar5;
                                    b1Var33 = b1Var30;
                                    b1Var35 = b1Var27;
                                    b1Var34 = b1Var57;
                                }
                                fz.a aVar11111 = (fz.a) objQ12;
                                if (((Number) b1Var34.getValue()).intValue() > 50) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                jVar7 = jVar6;
                                b1Var36 = b1Var33;
                                b1Var37 = b1Var32;
                                k7.h(aVar11111, null, z27, null, g.C0, sVar3, 196608, 26);
                                float f1111 = 8;
                                ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar12, f1111, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                objQ13 = sVar3.Q();
                                if (zF2) {
                                    jVar8 = jVar7;
                                    b1Var38 = b1Var36;
                                    b1Var39 = b1Var37;
                                    objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                    sVar3.o0(objQ13);
                                } else {
                                    jVar8 = jVar7;
                                    b1Var38 = b1Var36;
                                    b1Var39 = b1Var37;
                                    objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                    sVar3.o0(objQ13);
                                }
                                fz.a aVar11112 = (fz.a) objQ13;
                                if (((Number) b1Var34.getValue()).intValue() < 150) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                k7.h(aVar11112, null, z28, null, g.D0, sVar3, 196608, 26);
                                sVar3.p(true);
                                sVar3.p(true);
                                b1Var40 = b1Var39;
                                jVar9 = jVar8;
                                b1Var41 = b1Var38;
                                l1.g gVar117 = gVar4;
                                ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var110)).f30175h, ((h1.s1) sVar3.j(c3Var111)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                int iIntValue116 = ((Number) b1Var53.getValue()).intValue();
                                z1.r rVarE111 = j0.c.E(oVar12, CropImageView.DEFAULT_ASPECT_RATIO, f1111, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                objQ14 = sVar3.Q();
                                if (zF3) {
                                    final int i211114 = 2;
                                    final l1.b1 b1Var6111111110 = b1Var34;
                                    final l1.b1 b1Var6111111111 = b1Var35;
                                    objQ14 = new fz.c() { // from class: mt.o3
                                        @Override // fz.c
                                        public final Object invoke(Object obj4) {
                                            switch (i211114) {
                                                case 0:
                                                    Integer num = (Integer) obj4;
                                                    int iIntValue117 = num.intValue();
                                                    l1.b1 b1Var510 = b1Var53;
                                                    b1Var510.setValue(num);
                                                    g.D(jVar9, b1Var510, b1Var31, b1Var6111111110, b1Var28, b1Var6111111111, b1Var41, b1Var40, iIntValue117, 0, 0, 0, 0, false, 32256);
                                                    break;
                                                case 1:
                                                    Boolean bool = (Boolean) obj4;
                                                    boolean zBooleanValue5 = bool.booleanValue();
                                                    l1.b1 b1Var511 = b1Var53;
                                                    b1Var511.setValue(bool);
                                                    g.D(jVar9, b1Var31, b1Var6111111110, b1Var28, b1Var6111111111, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                    break;
                                                case 2:
                                                    Integer num2 = (Integer) obj4;
                                                    int iIntValue118 = num2.intValue();
                                                    l1.b1 b1Var512 = b1Var53;
                                                    b1Var512.setValue(num2);
                                                    g.D(jVar9, b1Var31, b1Var512, b1Var6111111110, b1Var28, b1Var6111111111, b1Var41, b1Var40, 0, iIntValue118, 0, 0, 0, false, 32000);
                                                    break;
                                                default:
                                                    Integer num3 = (Integer) obj4;
                                                    int iIntValue119 = num3.intValue();
                                                    l1.b1 b1Var513 = b1Var53;
                                                    b1Var513.setValue(num3);
                                                    g.D(jVar9, b1Var31, b1Var6111111110, b1Var28, b1Var6111111111, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue119, false, 28416);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar3.o0(objQ14);
                                } else {
                                    final int i211115 = 2;
                                    final l1.b1 b1Var6111111112 = b1Var34;
                                    final l1.b1 b1Var6111111113 = b1Var35;
                                    objQ14 = new fz.c() { // from class: mt.o3
                                        @Override // fz.c
                                        public final Object invoke(Object obj4) {
                                            switch (i211115) {
                                                case 0:
                                                    Integer num = (Integer) obj4;
                                                    int iIntValue117 = num.intValue();
                                                    l1.b1 b1Var510 = b1Var53;
                                                    b1Var510.setValue(num);
                                                    g.D(jVar9, b1Var510, b1Var31, b1Var6111111112, b1Var28, b1Var6111111113, b1Var41, b1Var40, iIntValue117, 0, 0, 0, 0, false, 32256);
                                                    break;
                                                case 1:
                                                    Boolean bool = (Boolean) obj4;
                                                    boolean zBooleanValue5 = bool.booleanValue();
                                                    l1.b1 b1Var511 = b1Var53;
                                                    b1Var511.setValue(bool);
                                                    g.D(jVar9, b1Var31, b1Var6111111112, b1Var28, b1Var6111111113, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                    break;
                                                case 2:
                                                    Integer num2 = (Integer) obj4;
                                                    int iIntValue118 = num2.intValue();
                                                    l1.b1 b1Var512 = b1Var53;
                                                    b1Var512.setValue(num2);
                                                    g.D(jVar9, b1Var31, b1Var512, b1Var6111111112, b1Var28, b1Var6111111113, b1Var41, b1Var40, 0, iIntValue118, 0, 0, 0, false, 32000);
                                                    break;
                                                default:
                                                    Integer num3 = (Integer) obj4;
                                                    int iIntValue119 = num3.intValue();
                                                    l1.b1 b1Var513 = b1Var53;
                                                    b1Var513.setValue(num3);
                                                    g.D(jVar9, b1Var31, b1Var6111111112, b1Var28, b1Var6111111113, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue119, false, 28416);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar3.o0(objQ14);
                                }
                                ys.a.y(iIntValue116, 48, (fz.c) objQ14, sVar3, rVarE111);
                                sVar3.p(true);
                                sVar3.p(true);
                            } else {
                                gVar4 = gVar3;
                            }
                            b1Var32 = b1Var29;
                            jVar6 = jVar5;
                            b1Var33 = b1Var30;
                            objQ12 = new p3(1, jVar6, b1Var57, b1Var31, b1Var53, b1Var28, b1Var27, b1Var33, b1Var32);
                            b1Var34 = b1Var57;
                            b1Var35 = b1Var27;
                            sVar3.o0(objQ12);
                            fz.a aVar11113 = (fz.a) objQ12;
                            if (((Number) b1Var34.getValue()).intValue() > 50) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            jVar7 = jVar6;
                            b1Var36 = b1Var33;
                            b1Var37 = b1Var32;
                            k7.h(aVar11113, null, z27, null, g.C0, sVar3, 196608, 26);
                            float f1112 = 8;
                            ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar12, f1112, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                            zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                            objQ13 = sVar3.Q();
                            if (zF2) {
                                jVar8 = jVar7;
                                b1Var38 = b1Var36;
                                b1Var39 = b1Var37;
                                objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                sVar3.o0(objQ13);
                            } else {
                                jVar8 = jVar7;
                                b1Var38 = b1Var36;
                                b1Var39 = b1Var37;
                                objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                sVar3.o0(objQ13);
                            }
                            fz.a aVar11114 = (fz.a) objQ13;
                            if (((Number) b1Var34.getValue()).intValue() < 150) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            k7.h(aVar11114, null, z28, null, g.D0, sVar3, 196608, 26);
                            sVar3.p(true);
                            sVar3.p(true);
                            b1Var40 = b1Var39;
                            jVar9 = jVar8;
                            b1Var41 = b1Var38;
                            l1.g gVar118 = gVar4;
                            ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var110)).f30175h, ((h1.s1) sVar3.j(c3Var111)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                            int iIntValue117 = ((Number) b1Var53.getValue()).intValue();
                            z1.r rVarE112 = j0.c.E(oVar12, CropImageView.DEFAULT_ASPECT_RATIO, f1112, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                            zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                            objQ14 = sVar3.Q();
                            if (zF3) {
                                final int i211116 = 2;
                                final l1.b1 b1Var6111111114 = b1Var34;
                                final l1.b1 b1Var6111111115 = b1Var35;
                                objQ14 = new fz.c() { // from class: mt.o3
                                    @Override // fz.c
                                    public final Object invoke(Object obj4) {
                                        switch (i211116) {
                                            case 0:
                                                Integer num = (Integer) obj4;
                                                int iIntValue118 = num.intValue();
                                                l1.b1 b1Var510 = b1Var53;
                                                b1Var510.setValue(num);
                                                g.D(jVar9, b1Var510, b1Var31, b1Var6111111114, b1Var28, b1Var6111111115, b1Var41, b1Var40, iIntValue118, 0, 0, 0, 0, false, 32256);
                                                break;
                                            case 1:
                                                Boolean bool = (Boolean) obj4;
                                                boolean zBooleanValue5 = bool.booleanValue();
                                                l1.b1 b1Var511 = b1Var53;
                                                b1Var511.setValue(bool);
                                                g.D(jVar9, b1Var31, b1Var6111111114, b1Var28, b1Var6111111115, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                break;
                                            case 2:
                                                Integer num2 = (Integer) obj4;
                                                int iIntValue119 = num2.intValue();
                                                l1.b1 b1Var512 = b1Var53;
                                                b1Var512.setValue(num2);
                                                g.D(jVar9, b1Var31, b1Var512, b1Var6111111114, b1Var28, b1Var6111111115, b1Var41, b1Var40, 0, iIntValue119, 0, 0, 0, false, 32000);
                                                break;
                                            default:
                                                Integer num3 = (Integer) obj4;
                                                int iIntValue1110 = num3.intValue();
                                                l1.b1 b1Var513 = b1Var53;
                                                b1Var513.setValue(num3);
                                                g.D(jVar9, b1Var31, b1Var6111111114, b1Var28, b1Var6111111115, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue1110, false, 28416);
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                sVar3.o0(objQ14);
                            } else {
                                final int i211117 = 2;
                                final l1.b1 b1Var6111111116 = b1Var34;
                                final l1.b1 b1Var6111111117 = b1Var35;
                                objQ14 = new fz.c() { // from class: mt.o3
                                    @Override // fz.c
                                    public final Object invoke(Object obj4) {
                                        switch (i211117) {
                                            case 0:
                                                Integer num = (Integer) obj4;
                                                int iIntValue118 = num.intValue();
                                                l1.b1 b1Var510 = b1Var53;
                                                b1Var510.setValue(num);
                                                g.D(jVar9, b1Var510, b1Var31, b1Var6111111116, b1Var28, b1Var6111111117, b1Var41, b1Var40, iIntValue118, 0, 0, 0, 0, false, 32256);
                                                break;
                                            case 1:
                                                Boolean bool = (Boolean) obj4;
                                                boolean zBooleanValue5 = bool.booleanValue();
                                                l1.b1 b1Var511 = b1Var53;
                                                b1Var511.setValue(bool);
                                                g.D(jVar9, b1Var31, b1Var6111111116, b1Var28, b1Var6111111117, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                break;
                                            case 2:
                                                Integer num2 = (Integer) obj4;
                                                int iIntValue119 = num2.intValue();
                                                l1.b1 b1Var512 = b1Var53;
                                                b1Var512.setValue(num2);
                                                g.D(jVar9, b1Var31, b1Var512, b1Var6111111116, b1Var28, b1Var6111111117, b1Var41, b1Var40, 0, iIntValue119, 0, 0, 0, false, 32000);
                                                break;
                                            default:
                                                Integer num3 = (Integer) obj4;
                                                int iIntValue1110 = num3.intValue();
                                                l1.b1 b1Var513 = b1Var53;
                                                b1Var513.setValue(num3);
                                                g.D(jVar9, b1Var31, b1Var6111111116, b1Var28, b1Var6111111117, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue1110, false, 28416);
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                sVar3.o0(objQ14);
                            }
                            ys.a.y(iIntValue117, 48, (fz.c) objQ14, sVar3, rVarE112);
                            sVar3.p(true);
                            sVar3.p(true);
                        } else {
                            sVar4.W();
                        }
                        return qy.b0.f48488a;
                    }
                }, sVar2), sVar, (i17 >> 21) & 14, 384, 4090);
            } else {
                z12 = false;
            }
            strArrD = hh.p0.D(sVar2, -898006011, R.array.cn_display_item, sVar2, z12);
            final String[] strArr11 = strArrD;
            if (((fr.o0) xt.b.c()).f27733a.enableNativeSpeakerVideos) {
                sVar2.d0(-2067162217);
                strArr = new String[]{oz.x.q0(oz.x.q0(tv.a.l(tv.a.n(((Number) sVar2.j(c3Var)).intValue()), sVar2), " 1", BuildConfig.VERSION_NAME), " 2", BuildConfig.VERSION_NAME), ub.a.e0(sVar2, R.string.translation), ub.a.e0(sVar2, R.string.audio), ub.a.e0(sVar2, R.string.mixed)};
                sVar2.p(false);
            } else {
                sVar2.d0(-2067162217);
                strArr = new String[]{oz.x.q0(oz.x.q0(tv.a.l(tv.a.n(((Number) sVar2.j(c3Var)).intValue()), sVar2), " 1", BuildConfig.VERSION_NAME), " 2", BuildConfig.VERSION_NAME), ub.a.e0(sVar2, R.string.translation), ub.a.e0(sVar2, R.string.audio), ub.a.e0(sVar2, R.string.mixed)};
                sVar2.p(false);
            }
            final String[] strArr12 = {ub.a.e0(sVar2, R.string.off), ub.a.e0(sVar2, R.string.before_answer), ub.a.e0(sVar2, R.string.after_answer)};
            length = strArr.length - 1;
            if (((Number) b1Var4.getValue()).intValue() == -1) {
                iIntValue = length;
            } else {
                iIntValue = ((Number) b1Var4.getValue()).intValue();
            }
            if (((Number) b1Var4.getValue()).intValue() == -1) {
                z13 = true;
            } else {
                z13 = false;
            }
            Boolean boolValueOf4 = Boolean.valueOf(z13);
            zG = sVar2.g(z13);
            objQ = sVar2.Q();
            if (zG) {
                objQ = new g.m(2, b1Var9, null, z13);
                sVar2.o0(objQ);
            } else {
                objQ = new g.m(2, b1Var9, null, z13);
                sVar2.o0(objQ);
            }
            l1.t.f((fz.e) objQ, boolValueOf4, sVar2);
            final int i114 = iIntValue;
            final boolean z26 = z13;
            final int i115 = iIntValue2;
            final String[] strArr13 = strArr;
            sVar = sVar2;
            h1.a6.a(onDismissRequest, null, e8VarF, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-862581764, new fz.f() { // from class: mt.n3
                /* JADX WARN: Code duplicated, block: B:104:0x0558  */
                /* JADX WARN: Code duplicated, block: B:107:0x05ed  */
                /* JADX WARN: Code duplicated, block: B:108:0x05f1  */
                /* JADX WARN: Code duplicated, block: B:111:0x05fe  */
                /* JADX WARN: Code duplicated, block: B:113:0x060c  */
                /* JADX WARN: Code duplicated, block: B:116:0x064f  */
                /* JADX WARN: Code duplicated, block: B:119:0x0654  */
                /* JADX WARN: Code duplicated, block: B:120:0x065d  */
                /* JADX WARN: Code duplicated, block: B:124:0x0690  */
                /* JADX WARN: Code duplicated, block: B:125:0x0692  */
                /* JADX WARN: Code duplicated, block: B:128:0x073c A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:131:0x0746  */
                /* JADX WARN: Code duplicated, block: B:134:0x0773  */
                /* JADX WARN: Code duplicated, block: B:135:0x0775  */
                /* JADX WARN: Code duplicated, block: B:138:0x0846  */
                /* JADX WARN: Code duplicated, block: B:140:0x084a  */
                /* JADX WARN: Code duplicated, block: B:89:0x04c8  */
                /* JADX WARN: Code duplicated, block: B:91:0x04d2  */
                /* JADX WARN: Code duplicated, block: B:94:0x04e4  */
                /* JADX WARN: Code duplicated, block: B:97:0x04f7  */
                /* JADX WARN: Code duplicated, block: B:99:0x04fc  */
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    l1.b1 b1Var11;
                    l1.b1 b1Var12;
                    final fz.j jVar;
                    final l1.b1 b1Var13;
                    final l1.b1 b1Var14;
                    final l1.b1 b1Var15;
                    final l1.b1 b1Var16;
                    l1.b1 b1Var17;
                    l1.b1 b1Var18;
                    final l1.b1 b1Var19;
                    l1.b1 b1Var20;
                    l1.b1 b1Var21;
                    l1.b1 b1Var22;
                    fz.j jVar2;
                    boolean z27;
                    l1.b1 b1Var23;
                    fz.j jVar3;
                    l1.g gVar2;
                    final fz.j jVar4;
                    l1.b1 b1Var24;
                    l1.b1 b1Var25;
                    l1.b1 b1Var26;
                    int iHashCode;
                    y2.i iVar;
                    l1.g gVar3;
                    z1.o oVar;
                    y2.h hVar;
                    y2.h hVar2;
                    l1.s sVar3;
                    y2.i iVar2;
                    fz.j jVar5;
                    l1.b1 b1Var27;
                    final l1.b1 b1Var28;
                    l1.b1 b1Var29;
                    l1.b1 b1Var30;
                    final l1.b1 b1Var31;
                    int iHashCode2;
                    boolean zF;
                    Object objQ12;
                    l1.g gVar4;
                    l1.b1 b1Var32;
                    fz.j jVar6;
                    l1.b1 b1Var33;
                    l1.b1 b1Var34;
                    l1.b1 b1Var35;
                    boolean z28;
                    fz.j jVar7;
                    l1.b1 b1Var36;
                    l1.b1 b1Var37;
                    boolean zF2;
                    Object objQ13;
                    fz.j jVar8;
                    l1.b1 b1Var38;
                    l1.b1 b1Var39;
                    boolean z29;
                    final l1.b1 b1Var40;
                    final fz.j jVar9;
                    final l1.b1 b1Var41;
                    boolean zF3;
                    Object objQ14;
                    j0.v ModalBottomSheet = (j0.v) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue3 = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                    l1.s sVar4 = (l1.s) nVar2;
                    if (sVar4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                        z1.o oVar2 = z1.o.f58481a;
                        z1.r rVarC = j0.e2.c(j0.e2.e(oVar2, 1.0f), 0.7f);
                        j0.d dVar = j0.i.f35305c;
                        z1.h hVar3 = z1.c.O;
                        j0.u uVarA = j0.t.a(dVar, hVar3, sVar4, 0);
                        int iHashCode3 = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL = sVar4.l();
                        z1.r rVarC2 = z1.a.c(sVar4, rVarC);
                        y2.k.J.getClass();
                        y2.i iVar3 = y2.j.f56913b;
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar3);
                        } else {
                            sVar4.r0();
                        }
                        y2.h hVar4 = y2.j.f56917f;
                        l1.t.J(hVar4, uVarA, sVar4);
                        y2.h hVar5 = y2.j.f56916e;
                        l1.t.J(hVar5, q1VarL, sVar4);
                        y2.h hVar6 = y2.j.f56918g;
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                            defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar6);
                        }
                        y2.h hVar7 = y2.j.f56915d;
                        l1.t.J(hVar7, rVarC2, sVar4);
                        String strE0 = ub.a.e0(sVar4, R.string.settings);
                        Object objQ15 = sVar4.Q();
                        l1.g gVar5 = l1.m.f39353a;
                        if (objQ15 == gVar5) {
                            objQ15 = new ju.d(25);
                            sVar4.o0(objQ15);
                        }
                        ys.a.l(432, (fz.a) objQ15, strE0, sVar4, false);
                        z1.r rVarC3 = j0.c.C(d0.n.y(oVar2, d0.n.u(sVar4), true, 12), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        j0.u uVarA2 = j0.t.a(dVar, hVar3, sVar4, 0);
                        int iHashCode4 = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL2 = sVar4.l();
                        z1.r rVarC4 = z1.a.c(sVar4, rVarC3);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar3);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar4, uVarA2, sVar4);
                        l1.t.J(hVar5, q1VarL2, sVar4);
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode4))) {
                            defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar6);
                        }
                        l1.t.J(hVar7, rVarC4, sVar4);
                        String strE1 = ub.a.e0(sVar4, R.string.display_in);
                        l1.b1 b1Var42 = b1Var8;
                        boolean zBooleanValue = ((Boolean) b1Var42.getValue()).booleanValue();
                        Object objQ16 = sVar4.Q();
                        if (objQ16 == gVar5) {
                            objQ16 = new p(6, b1Var42);
                            sVar4.o0(objQ16);
                        }
                        fz.c cVar = (fz.c) objQ16;
                        int i21 = length;
                        boolean zD = sVar4.d(i21);
                        l1.b1 b1Var43 = b1Var4;
                        boolean zF4 = zD | sVar4.f(b1Var43);
                        l1.b1 b1Var44 = b1Var;
                        boolean zF5 = zF4 | sVar4.f(b1Var44);
                        l1.b1 b1Var45 = b1Var2;
                        boolean zF6 = zF5 | sVar4.f(b1Var45);
                        l1.b1 b1Var46 = b1Var3;
                        boolean zF7 = zF6 | sVar4.f(b1Var46);
                        final l1.b1 b1Var47 = b1Var5;
                        boolean zF8 = zF7 | sVar4.f(b1Var47);
                        l1.b1 b1Var48 = b1Var6;
                        boolean zF9 = zF8 | sVar4.f(b1Var48);
                        l1.b1 b1Var49 = b1Var7;
                        boolean zF10 = zF9 | sVar4.f(b1Var49);
                        fz.j jVar10 = onSettingChange;
                        boolean zF11 = zF10 | sVar4.f(jVar10);
                        Object objQ17 = sVar4.Q();
                        if (zF11 || objQ17 == gVar5) {
                            b1Var11 = b1Var44;
                            objQ17 = new r3(i21, jVar10, b1Var43, b1Var11, b1Var45, b1Var46, b1Var47, b1Var48, b1Var49);
                            b1Var12 = b1Var43;
                            sVar4.o0(objQ17);
                        } else {
                            b1Var12 = b1Var43;
                            b1Var11 = b1Var44;
                        }
                        l1.g gVar6 = gVar5;
                        ys.a.i(strE1, strArr13, i114, zBooleanValue, false, cVar, (fz.c) objQ17, sVar4, 196608, 16);
                        int iL = hz.b.l(((Number) b1Var47.getValue()).intValue(), 0, 2);
                        final l1.b1 b1Var50 = b1Var11;
                        String strE2 = ub.a.e0(sVar4, R.string.audio_auto_play);
                        l1.b1 b1Var51 = b1Var9;
                        boolean zBooleanValue2 = ((Boolean) b1Var51.getValue()).booleanValue();
                        boolean z210 = !z26;
                        Object objQ18 = sVar4.Q();
                        if (objQ18 == gVar6) {
                            objQ18 = new p(7, b1Var51);
                            sVar4.o0(objQ18);
                        }
                        fz.c cVar2 = (fz.c) objQ18;
                        boolean zF12 = sVar4.f(b1Var47) | sVar4.f(b1Var50) | sVar4.f(b1Var45) | sVar4.f(b1Var46) | sVar4.f(b1Var12) | sVar4.f(b1Var48) | sVar4.f(b1Var49) | sVar4.f(jVar10);
                        Object objQ19 = sVar4.Q();
                        if (zF12 || objQ19 == gVar6) {
                            final int i22 = 3;
                            final l1.b1 b1Var52 = b1Var12;
                            jVar = jVar10;
                            b1Var13 = b1Var45;
                            b1Var14 = b1Var46;
                            b1Var15 = b1Var48;
                            b1Var16 = b1Var49;
                            objQ19 = new fz.c() { // from class: mt.o3
                                @Override // fz.c
                                public final Object invoke(Object obj4) {
                                    switch (i22) {
                                        case 0:
                                            Integer num = (Integer) obj4;
                                            int iIntValue118 = num.intValue();
                                            l1.b1 b1Var510 = b1Var47;
                                            b1Var510.setValue(num);
                                            g.D(jVar, b1Var510, b1Var50, b1Var13, b1Var14, b1Var52, b1Var15, b1Var16, iIntValue118, 0, 0, 0, 0, false, 32256);
                                            break;
                                        case 1:
                                            Boolean bool = (Boolean) obj4;
                                            boolean zBooleanValue5 = bool.booleanValue();
                                            l1.b1 b1Var511 = b1Var47;
                                            b1Var511.setValue(bool);
                                            g.D(jVar, b1Var50, b1Var13, b1Var14, b1Var52, b1Var15, b1Var16, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                            break;
                                        case 2:
                                            Integer num2 = (Integer) obj4;
                                            int iIntValue119 = num2.intValue();
                                            l1.b1 b1Var512 = b1Var47;
                                            b1Var512.setValue(num2);
                                            g.D(jVar, b1Var50, b1Var512, b1Var13, b1Var14, b1Var52, b1Var15, b1Var16, 0, iIntValue119, 0, 0, 0, false, 32000);
                                            break;
                                        default:
                                            Integer num3 = (Integer) obj4;
                                            int iIntValue1110 = num3.intValue();
                                            l1.b1 b1Var513 = b1Var47;
                                            b1Var513.setValue(num3);
                                            g.D(jVar, b1Var50, b1Var13, b1Var14, b1Var52, b1Var513, b1Var15, b1Var16, 0, 0, 0, 0, iIntValue1110, false, 28416);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            b1Var17 = b1Var50;
                            b1Var18 = b1Var47;
                            sVar4.o0(objQ19);
                        } else {
                            jVar = jVar10;
                            b1Var17 = b1Var50;
                            b1Var13 = b1Var45;
                            b1Var14 = b1Var46;
                            b1Var18 = b1Var47;
                            b1Var15 = b1Var48;
                            b1Var16 = b1Var49;
                        }
                        final fz.j jVar11 = jVar;
                        final l1.b1 b1Var53 = b1Var13;
                        final l1.b1 b1Var54 = b1Var18;
                        l1.b1 b1Var55 = b1Var15;
                        final l1.b1 b1Var56 = b1Var16;
                        final l1.b1 b1Var57 = b1Var14;
                        ys.a.i(strE2, strArr12, iL, zBooleanValue2, z210, cVar2, (fz.c) objQ19, sVar4, 196608, 0);
                        String[] strArr14 = strArr11;
                        if (strArr14.length == 0) {
                            sVar4.d0(1050243442);
                            sVar4.p(false);
                            b1Var21 = b1Var54;
                            b1Var20 = b1Var55;
                            b1Var22 = b1Var56;
                            gVar6 = gVar6;
                            jVar2 = jVar11;
                        } else {
                            sVar4.d0(1058794978);
                            int iL2 = hz.b.l(((Number) b1Var17.getValue()).intValue(), 0, strArr14.length - 1);
                            int i23 = i115;
                            String strE = ys.a.E(sVar4, i23);
                            l1.b1 b1Var58 = b1Var10;
                            boolean zBooleanValue3 = ((Boolean) b1Var58.getValue()).booleanValue();
                            Object objQ20 = sVar4.Q();
                            if (objQ20 == gVar6) {
                                objQ20 = new p(8, b1Var58);
                                sVar4.o0(objQ20);
                            }
                            fz.c cVar3 = (fz.c) objQ20;
                            boolean zF13 = sVar4.f(b1Var17) | sVar4.f(b1Var53) | sVar4.f(b1Var57) | sVar4.f(b1Var12) | sVar4.f(b1Var54) | sVar4.f(b1Var55) | sVar4.f(b1Var56) | sVar4.f(jVar11);
                            Object objQ21 = sVar4.Q();
                            if (zF13 || objQ21 == gVar6) {
                                final int i24 = 0;
                                final l1.b1 b1Var59 = b1Var17;
                                final l1.b1 b1Var60 = b1Var12;
                                b1Var19 = b1Var55;
                                objQ21 = new fz.c() { // from class: mt.o3
                                    @Override // fz.c
                                    public final Object invoke(Object obj4) {
                                        switch (i24) {
                                            case 0:
                                                Integer num = (Integer) obj4;
                                                int iIntValue118 = num.intValue();
                                                l1.b1 b1Var510 = b1Var59;
                                                b1Var510.setValue(num);
                                                g.D(jVar11, b1Var510, b1Var53, b1Var57, b1Var60, b1Var54, b1Var19, b1Var56, iIntValue118, 0, 0, 0, 0, false, 32256);
                                                break;
                                            case 1:
                                                Boolean bool = (Boolean) obj4;
                                                boolean zBooleanValue5 = bool.booleanValue();
                                                l1.b1 b1Var511 = b1Var59;
                                                b1Var511.setValue(bool);
                                                g.D(jVar11, b1Var53, b1Var57, b1Var60, b1Var54, b1Var19, b1Var56, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                break;
                                            case 2:
                                                Integer num2 = (Integer) obj4;
                                                int iIntValue119 = num2.intValue();
                                                l1.b1 b1Var512 = b1Var59;
                                                b1Var512.setValue(num2);
                                                g.D(jVar11, b1Var53, b1Var512, b1Var57, b1Var60, b1Var54, b1Var19, b1Var56, 0, iIntValue119, 0, 0, 0, false, 32000);
                                                break;
                                            default:
                                                Integer num3 = (Integer) obj4;
                                                int iIntValue1110 = num3.intValue();
                                                l1.b1 b1Var513 = b1Var59;
                                                b1Var513.setValue(num3);
                                                g.D(jVar11, b1Var53, b1Var57, b1Var60, b1Var54, b1Var513, b1Var19, b1Var56, 0, 0, 0, 0, iIntValue1110, false, 28416);
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                sVar4.o0(objQ21);
                            } else {
                                b1Var19 = b1Var55;
                            }
                            fz.c cVar4 = (fz.c) objQ21;
                            l1.b1 b1Var61 = b1Var19;
                            ys.a.i(strE, strArr14, iL2, zBooleanValue3, false, cVar3, cVar4, sVar4, 196608, 16);
                            int iIntValue4 = ((Number) b1Var17.getValue()).intValue();
                            Integer numValueOf = ys.a.F(i23, iIntValue4) ? Integer.valueOf(iIntValue4) : null;
                            if (numValueOf != null) {
                                sVar4.d0(1059792899);
                                int iIntValue5 = numValueOf.intValue();
                                float fFloatValue = ((Number) b1Var61.getValue()).floatValue();
                                boolean zF14 = sVar4.f(b1Var61);
                                Object objQ22 = sVar4.Q();
                                if (zF14 || objQ22 == gVar6) {
                                    objQ22 = new p(5, b1Var61);
                                    sVar4.o0(objQ22);
                                }
                                fz.c cVar5 = (fz.c) objQ22;
                                boolean zF15 = sVar4.f(b1Var17) | sVar4.f(b1Var53) | sVar4.f(b1Var57) | sVar4.f(b1Var12) | sVar4.f(b1Var54) | sVar4.f(b1Var61) | sVar4.f(b1Var56) | sVar4.f(jVar11);
                                Object objQ23 = sVar4.Q();
                                if (zF15 || objQ23 == gVar6) {
                                    objQ23 = new p3(jVar11, b1Var17, b1Var53, b1Var57, b1Var12, b1Var54, b1Var61, b1Var56);
                                    b1Var21 = b1Var54;
                                    b1Var20 = b1Var61;
                                    b1Var23 = b1Var56;
                                    jVar3 = jVar11;
                                    sVar4.o0(objQ23);
                                } else {
                                    jVar3 = jVar11;
                                    b1Var23 = b1Var56;
                                    b1Var20 = b1Var61;
                                    b1Var21 = b1Var54;
                                }
                                jVar2 = jVar3;
                                b1Var22 = b1Var23;
                                ys.a.k(i23, iIntValue5, fFloatValue, cVar5, (fz.a) objQ23, null, sVar4, 0);
                                sVar4 = sVar4;
                                z27 = false;
                            } else {
                                b1Var20 = b1Var61;
                                b1Var21 = b1Var54;
                                b1Var22 = b1Var56;
                                jVar2 = jVar11;
                                z27 = false;
                                sVar4.d0(1050243442);
                            }
                            sVar4.p(z27);
                            sVar4.p(z27);
                        }
                        String strE3 = ub.a.e0(sVar4, R.string.sound_effect);
                        boolean zBooleanValue4 = ((Boolean) b1Var22.getValue()).booleanValue();
                        boolean zF16 = sVar4.f(b1Var22) | sVar4.f(b1Var17) | sVar4.f(b1Var53) | sVar4.f(b1Var57) | sVar4.f(b1Var12) | sVar4.f(b1Var21) | sVar4.f(b1Var20) | sVar4.f(jVar2);
                        Object objQ24 = sVar4.Q();
                        if (zF16) {
                            gVar2 = gVar6;
                        } else {
                            gVar2 = gVar6;
                            if (objQ24 != gVar2) {
                                jVar4 = jVar2;
                                b1Var24 = b1Var22;
                                b1Var25 = b1Var21;
                                b1Var26 = b1Var20;
                            }
                            ys.a.m(strE3, zBooleanValue4, (fz.c) objQ24, sVar4, 0);
                            z1.r rVarI4 = j0.e2.i(j0.e2.e(oVar2, 1.0f), 62, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            j0.e eVar4 = j0.i.f35309g;
                            z1.i iVar7 = z1.c.M;
                            j0.a2 a2VarA6 = j0.z1.a(eVar4, iVar7, sVar4, 54);
                            iHashCode = Long.hashCode(sVar4.T);
                            l1.q1 q1VarL8 = sVar4.l();
                            z1.r rVarC10 = z1.a.c(sVar4, rVarI4);
                            sVar4.h0();
                            if (sVar4.S) {
                                iVar = iVar3;
                                sVar4.k(iVar);
                            } else {
                                iVar = iVar3;
                                sVar4.r0();
                            }
                            gVar3 = gVar2;
                            l1.t.J(hVar4, a2VarA6, sVar4);
                            l1.t.J(hVar5, q1VarL8, sVar4);
                            if (sVar4.S) {
                                oVar = oVar2;
                            } else {
                                oVar = oVar2;
                                if (!kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                                    hVar = hVar6;
                                }
                                l1.t.J(hVar7, rVarC10, sVar4);
                                String strE13 = ub.a.e0(sVar4, R.string.audio_speed);
                                l1.c3 c3Var110 = fc.f30256a;
                                j3.y0 y0Var10 = ((dc) sVar4.j(c3Var110)).f30175h;
                                l1.c3 c3Var111 = h1.v1.f31180a;
                                hVar2 = hVar;
                                j3.y0 y0VarA10 = j3.y0.a(y0Var10, ((h1.s1) sVar4.j(c3Var111)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                                if (1.0f <= 0.0d) {
                                    k0.a.a("invalid weight; must be greater than zero");
                                }
                                sVar3 = sVar4;
                                iVar2 = iVar;
                                z1.o oVar12 = oVar;
                                jVar5 = jVar4;
                                b1Var27 = b1Var25;
                                b1Var28 = b1Var12;
                                b1Var29 = b1Var24;
                                b1Var30 = b1Var26;
                                b1Var31 = b1Var17;
                                ua.b(strE13, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA10, sVar3, 0, 0, 65532);
                                j0.a2 a2VarA12 = j0.z1.a(j0.i.f35303a, iVar7, sVar3, 48);
                                iHashCode2 = Long.hashCode(sVar3.T);
                                l1.q1 q1VarL14 = sVar3.l();
                                z1.r rVarC16 = z1.a.c(sVar3, oVar12);
                                sVar3.h0();
                                if (sVar3.S) {
                                    sVar3.k(iVar2);
                                } else {
                                    sVar3.r0();
                                }
                                l1.t.J(hVar4, a2VarA12, sVar3);
                                l1.t.J(hVar5, q1VarL14, sVar3);
                                if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                                    defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                                }
                                l1.t.J(hVar7, rVarC16, sVar3);
                                zF = sVar3.f(b1Var57) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var27) | sVar3.f(b1Var30) | sVar3.f(b1Var29) | sVar3.f(jVar5);
                                objQ12 = sVar3.Q();
                                if (zF) {
                                    gVar4 = gVar3;
                                } else {
                                    gVar4 = gVar3;
                                    if (objQ12 == gVar4) {
                                        b1Var32 = b1Var29;
                                        jVar6 = jVar5;
                                        b1Var33 = b1Var30;
                                        b1Var35 = b1Var27;
                                        b1Var34 = b1Var57;
                                    }
                                    fz.a aVar11113 = (fz.a) objQ12;
                                    if (((Number) b1Var34.getValue()).intValue() > 50) {
                                        z28 = true;
                                    } else {
                                        z28 = false;
                                    }
                                    jVar7 = jVar6;
                                    b1Var36 = b1Var33;
                                    b1Var37 = b1Var32;
                                    k7.h(aVar11113, null, z28, null, g.C0, sVar3, 196608, 26);
                                    float f1112 = 8;
                                    ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar12, f1112, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                    zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                    objQ13 = sVar3.Q();
                                    if (!zF2 || objQ13 == gVar4) {
                                        jVar8 = jVar7;
                                        b1Var38 = b1Var36;
                                        b1Var39 = b1Var37;
                                        objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                        sVar3.o0(objQ13);
                                    } else {
                                        jVar8 = jVar7;
                                        b1Var38 = b1Var36;
                                        b1Var39 = b1Var37;
                                    }
                                    fz.a aVar11114 = (fz.a) objQ13;
                                    if (((Number) b1Var34.getValue()).intValue() < 150) {
                                        z29 = true;
                                    } else {
                                        z29 = false;
                                    }
                                    k7.h(aVar11114, null, z29, null, g.D0, sVar3, 196608, 26);
                                    sVar3.p(true);
                                    sVar3.p(true);
                                    b1Var40 = b1Var39;
                                    jVar9 = jVar8;
                                    b1Var41 = b1Var38;
                                    l1.g gVar118 = gVar4;
                                    ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var110)).f30175h, ((h1.s1) sVar3.j(c3Var111)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                    int iIntValue117 = ((Number) b1Var53.getValue()).intValue();
                                    z1.r rVarE112 = j0.c.E(oVar12, CropImageView.DEFAULT_ASPECT_RATIO, f1112, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                    zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                    objQ14 = sVar3.Q();
                                    if (zF3 || objQ14 == gVar118) {
                                        final int i211117 = 2;
                                        final l1.b1 b1Var6111111116 = b1Var34;
                                        final l1.b1 b1Var6111111117 = b1Var35;
                                        objQ14 = new fz.c() { // from class: mt.o3
                                            @Override // fz.c
                                            public final Object invoke(Object obj4) {
                                                switch (i211117) {
                                                    case 0:
                                                        Integer num = (Integer) obj4;
                                                        int iIntValue118 = num.intValue();
                                                        l1.b1 b1Var510 = b1Var53;
                                                        b1Var510.setValue(num);
                                                        g.D(jVar9, b1Var510, b1Var31, b1Var6111111116, b1Var28, b1Var6111111117, b1Var41, b1Var40, iIntValue118, 0, 0, 0, 0, false, 32256);
                                                        break;
                                                    case 1:
                                                        Boolean bool = (Boolean) obj4;
                                                        boolean zBooleanValue5 = bool.booleanValue();
                                                        l1.b1 b1Var511 = b1Var53;
                                                        b1Var511.setValue(bool);
                                                        g.D(jVar9, b1Var31, b1Var6111111116, b1Var28, b1Var6111111117, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                        break;
                                                    case 2:
                                                        Integer num2 = (Integer) obj4;
                                                        int iIntValue119 = num2.intValue();
                                                        l1.b1 b1Var512 = b1Var53;
                                                        b1Var512.setValue(num2);
                                                        g.D(jVar9, b1Var31, b1Var512, b1Var6111111116, b1Var28, b1Var6111111117, b1Var41, b1Var40, 0, iIntValue119, 0, 0, 0, false, 32000);
                                                        break;
                                                    default:
                                                        Integer num3 = (Integer) obj4;
                                                        int iIntValue1110 = num3.intValue();
                                                        l1.b1 b1Var513 = b1Var53;
                                                        b1Var513.setValue(num3);
                                                        g.D(jVar9, b1Var31, b1Var6111111116, b1Var28, b1Var6111111117, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue1110, false, 28416);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar3.o0(objQ14);
                                    }
                                    ys.a.y(iIntValue117, 48, (fz.c) objQ14, sVar3, rVarE112);
                                    sVar3.p(true);
                                    sVar3.p(true);
                                }
                                b1Var32 = b1Var29;
                                jVar6 = jVar5;
                                b1Var33 = b1Var30;
                                objQ12 = new p3(1, jVar6, b1Var57, b1Var31, b1Var53, b1Var28, b1Var27, b1Var33, b1Var32);
                                b1Var34 = b1Var57;
                                b1Var35 = b1Var27;
                                sVar3.o0(objQ12);
                                fz.a aVar11115 = (fz.a) objQ12;
                                if (((Number) b1Var34.getValue()).intValue() > 50) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                jVar7 = jVar6;
                                b1Var36 = b1Var33;
                                b1Var37 = b1Var32;
                                k7.h(aVar11115, null, z28, null, g.C0, sVar3, 196608, 26);
                                float f1113 = 8;
                                ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar12, f1113, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                objQ13 = sVar3.Q();
                                if (zF2) {
                                    jVar8 = jVar7;
                                    b1Var38 = b1Var36;
                                    b1Var39 = b1Var37;
                                    objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                    sVar3.o0(objQ13);
                                } else {
                                    jVar8 = jVar7;
                                    b1Var38 = b1Var36;
                                    b1Var39 = b1Var37;
                                    objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                    sVar3.o0(objQ13);
                                }
                                fz.a aVar11116 = (fz.a) objQ13;
                                if (((Number) b1Var34.getValue()).intValue() < 150) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                k7.h(aVar11116, null, z29, null, g.D0, sVar3, 196608, 26);
                                sVar3.p(true);
                                sVar3.p(true);
                                b1Var40 = b1Var39;
                                jVar9 = jVar8;
                                b1Var41 = b1Var38;
                                l1.g gVar119 = gVar4;
                                ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var110)).f30175h, ((h1.s1) sVar3.j(c3Var111)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                int iIntValue118 = ((Number) b1Var53.getValue()).intValue();
                                z1.r rVarE113 = j0.c.E(oVar12, CropImageView.DEFAULT_ASPECT_RATIO, f1113, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                objQ14 = sVar3.Q();
                                if (zF3) {
                                    final int i211118 = 2;
                                    final l1.b1 b1Var6111111118 = b1Var34;
                                    final l1.b1 b1Var6111111119 = b1Var35;
                                    objQ14 = new fz.c() { // from class: mt.o3
                                        @Override // fz.c
                                        public final Object invoke(Object obj4) {
                                            switch (i211118) {
                                                case 0:
                                                    Integer num = (Integer) obj4;
                                                    int iIntValue119 = num.intValue();
                                                    l1.b1 b1Var510 = b1Var53;
                                                    b1Var510.setValue(num);
                                                    g.D(jVar9, b1Var510, b1Var31, b1Var6111111118, b1Var28, b1Var6111111119, b1Var41, b1Var40, iIntValue119, 0, 0, 0, 0, false, 32256);
                                                    break;
                                                case 1:
                                                    Boolean bool = (Boolean) obj4;
                                                    boolean zBooleanValue5 = bool.booleanValue();
                                                    l1.b1 b1Var511 = b1Var53;
                                                    b1Var511.setValue(bool);
                                                    g.D(jVar9, b1Var31, b1Var6111111118, b1Var28, b1Var6111111119, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                    break;
                                                case 2:
                                                    Integer num2 = (Integer) obj4;
                                                    int iIntValue1110 = num2.intValue();
                                                    l1.b1 b1Var512 = b1Var53;
                                                    b1Var512.setValue(num2);
                                                    g.D(jVar9, b1Var31, b1Var512, b1Var6111111118, b1Var28, b1Var6111111119, b1Var41, b1Var40, 0, iIntValue1110, 0, 0, 0, false, 32000);
                                                    break;
                                                default:
                                                    Integer num3 = (Integer) obj4;
                                                    int iIntValue1111 = num3.intValue();
                                                    l1.b1 b1Var513 = b1Var53;
                                                    b1Var513.setValue(num3);
                                                    g.D(jVar9, b1Var31, b1Var6111111118, b1Var28, b1Var6111111119, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue1111, false, 28416);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar3.o0(objQ14);
                                } else {
                                    final int i211119 = 2;
                                    final l1.b1 b1Var61111111110 = b1Var34;
                                    final l1.b1 b1Var61111111111 = b1Var35;
                                    objQ14 = new fz.c() { // from class: mt.o3
                                        @Override // fz.c
                                        public final Object invoke(Object obj4) {
                                            switch (i211119) {
                                                case 0:
                                                    Integer num = (Integer) obj4;
                                                    int iIntValue119 = num.intValue();
                                                    l1.b1 b1Var510 = b1Var53;
                                                    b1Var510.setValue(num);
                                                    g.D(jVar9, b1Var510, b1Var31, b1Var61111111110, b1Var28, b1Var61111111111, b1Var41, b1Var40, iIntValue119, 0, 0, 0, 0, false, 32256);
                                                    break;
                                                case 1:
                                                    Boolean bool = (Boolean) obj4;
                                                    boolean zBooleanValue5 = bool.booleanValue();
                                                    l1.b1 b1Var511 = b1Var53;
                                                    b1Var511.setValue(bool);
                                                    g.D(jVar9, b1Var31, b1Var61111111110, b1Var28, b1Var61111111111, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                    break;
                                                case 2:
                                                    Integer num2 = (Integer) obj4;
                                                    int iIntValue1110 = num2.intValue();
                                                    l1.b1 b1Var512 = b1Var53;
                                                    b1Var512.setValue(num2);
                                                    g.D(jVar9, b1Var31, b1Var512, b1Var61111111110, b1Var28, b1Var61111111111, b1Var41, b1Var40, 0, iIntValue1110, 0, 0, 0, false, 32000);
                                                    break;
                                                default:
                                                    Integer num3 = (Integer) obj4;
                                                    int iIntValue1111 = num3.intValue();
                                                    l1.b1 b1Var513 = b1Var53;
                                                    b1Var513.setValue(num3);
                                                    g.D(jVar9, b1Var31, b1Var61111111110, b1Var28, b1Var61111111111, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue1111, false, 28416);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar3.o0(objQ14);
                                }
                                ys.a.y(iIntValue118, 48, (fz.c) objQ14, sVar3, rVarE113);
                                sVar3.p(true);
                                sVar3.p(true);
                            }
                            hVar = hVar6;
                            defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
                            l1.t.J(hVar7, rVarC10, sVar4);
                            String strE14 = ub.a.e0(sVar4, R.string.audio_speed);
                            l1.c3 c3Var112 = fc.f30256a;
                            j3.y0 y0Var11 = ((dc) sVar4.j(c3Var112)).f30175h;
                            l1.c3 c3Var113 = h1.v1.f31180a;
                            hVar2 = hVar;
                            j3.y0 y0VarA11 = j3.y0.a(y0Var11, ((h1.s1) sVar4.j(c3Var113)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                            if (1.0f <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            sVar3 = sVar4;
                            iVar2 = iVar;
                            z1.o oVar13 = oVar;
                            jVar5 = jVar4;
                            b1Var27 = b1Var25;
                            b1Var28 = b1Var12;
                            b1Var29 = b1Var24;
                            b1Var30 = b1Var26;
                            b1Var31 = b1Var17;
                            ua.b(strE14, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA11, sVar3, 0, 0, 65532);
                            j0.a2 a2VarA13 = j0.z1.a(j0.i.f35303a, iVar7, sVar3, 48);
                            iHashCode2 = Long.hashCode(sVar3.T);
                            l1.q1 q1VarL15 = sVar3.l();
                            z1.r rVarC17 = z1.a.c(sVar3, oVar13);
                            sVar3.h0();
                            if (sVar3.S) {
                                sVar3.k(iVar2);
                            } else {
                                sVar3.r0();
                            }
                            l1.t.J(hVar4, a2VarA13, sVar3);
                            l1.t.J(hVar5, q1VarL15, sVar3);
                            if (sVar3.S) {
                                defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                            } else {
                                defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                            }
                            l1.t.J(hVar7, rVarC17, sVar3);
                            zF = sVar3.f(b1Var57) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var27) | sVar3.f(b1Var30) | sVar3.f(b1Var29) | sVar3.f(jVar5);
                            objQ12 = sVar3.Q();
                            if (zF) {
                                gVar4 = gVar3;
                                if (objQ12 == gVar4) {
                                    b1Var32 = b1Var29;
                                    jVar6 = jVar5;
                                    b1Var33 = b1Var30;
                                    b1Var35 = b1Var27;
                                    b1Var34 = b1Var57;
                                }
                                fz.a aVar11117 = (fz.a) objQ12;
                                if (((Number) b1Var34.getValue()).intValue() > 50) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                jVar7 = jVar6;
                                b1Var36 = b1Var33;
                                b1Var37 = b1Var32;
                                k7.h(aVar11117, null, z28, null, g.C0, sVar3, 196608, 26);
                                float f1114 = 8;
                                ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar13, f1114, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                objQ13 = sVar3.Q();
                                if (zF2) {
                                    jVar8 = jVar7;
                                    b1Var38 = b1Var36;
                                    b1Var39 = b1Var37;
                                    objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                    sVar3.o0(objQ13);
                                } else {
                                    jVar8 = jVar7;
                                    b1Var38 = b1Var36;
                                    b1Var39 = b1Var37;
                                    objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                    sVar3.o0(objQ13);
                                }
                                fz.a aVar11118 = (fz.a) objQ13;
                                if (((Number) b1Var34.getValue()).intValue() < 150) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                k7.h(aVar11118, null, z29, null, g.D0, sVar3, 196608, 26);
                                sVar3.p(true);
                                sVar3.p(true);
                                b1Var40 = b1Var39;
                                jVar9 = jVar8;
                                b1Var41 = b1Var38;
                                l1.g gVar1110 = gVar4;
                                ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var112)).f30175h, ((h1.s1) sVar3.j(c3Var113)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                int iIntValue119 = ((Number) b1Var53.getValue()).intValue();
                                z1.r rVarE114 = j0.c.E(oVar13, CropImageView.DEFAULT_ASPECT_RATIO, f1114, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                objQ14 = sVar3.Q();
                                if (zF3) {
                                    final int i2111110 = 2;
                                    final l1.b1 b1Var61111111112 = b1Var34;
                                    final l1.b1 b1Var61111111113 = b1Var35;
                                    objQ14 = new fz.c() { // from class: mt.o3
                                        @Override // fz.c
                                        public final Object invoke(Object obj4) {
                                            switch (i2111110) {
                                                case 0:
                                                    Integer num = (Integer) obj4;
                                                    int iIntValue1110 = num.intValue();
                                                    l1.b1 b1Var510 = b1Var53;
                                                    b1Var510.setValue(num);
                                                    g.D(jVar9, b1Var510, b1Var31, b1Var61111111112, b1Var28, b1Var61111111113, b1Var41, b1Var40, iIntValue1110, 0, 0, 0, 0, false, 32256);
                                                    break;
                                                case 1:
                                                    Boolean bool = (Boolean) obj4;
                                                    boolean zBooleanValue5 = bool.booleanValue();
                                                    l1.b1 b1Var511 = b1Var53;
                                                    b1Var511.setValue(bool);
                                                    g.D(jVar9, b1Var31, b1Var61111111112, b1Var28, b1Var61111111113, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                    break;
                                                case 2:
                                                    Integer num2 = (Integer) obj4;
                                                    int iIntValue1111 = num2.intValue();
                                                    l1.b1 b1Var512 = b1Var53;
                                                    b1Var512.setValue(num2);
                                                    g.D(jVar9, b1Var31, b1Var512, b1Var61111111112, b1Var28, b1Var61111111113, b1Var41, b1Var40, 0, iIntValue1111, 0, 0, 0, false, 32000);
                                                    break;
                                                default:
                                                    Integer num3 = (Integer) obj4;
                                                    int iIntValue1112 = num3.intValue();
                                                    l1.b1 b1Var513 = b1Var53;
                                                    b1Var513.setValue(num3);
                                                    g.D(jVar9, b1Var31, b1Var61111111112, b1Var28, b1Var61111111113, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue1112, false, 28416);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar3.o0(objQ14);
                                } else {
                                    final int i2111111 = 2;
                                    final l1.b1 b1Var61111111114 = b1Var34;
                                    final l1.b1 b1Var61111111115 = b1Var35;
                                    objQ14 = new fz.c() { // from class: mt.o3
                                        @Override // fz.c
                                        public final Object invoke(Object obj4) {
                                            switch (i2111111) {
                                                case 0:
                                                    Integer num = (Integer) obj4;
                                                    int iIntValue1110 = num.intValue();
                                                    l1.b1 b1Var510 = b1Var53;
                                                    b1Var510.setValue(num);
                                                    g.D(jVar9, b1Var510, b1Var31, b1Var61111111114, b1Var28, b1Var61111111115, b1Var41, b1Var40, iIntValue1110, 0, 0, 0, 0, false, 32256);
                                                    break;
                                                case 1:
                                                    Boolean bool = (Boolean) obj4;
                                                    boolean zBooleanValue5 = bool.booleanValue();
                                                    l1.b1 b1Var511 = b1Var53;
                                                    b1Var511.setValue(bool);
                                                    g.D(jVar9, b1Var31, b1Var61111111114, b1Var28, b1Var61111111115, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                    break;
                                                case 2:
                                                    Integer num2 = (Integer) obj4;
                                                    int iIntValue1111 = num2.intValue();
                                                    l1.b1 b1Var512 = b1Var53;
                                                    b1Var512.setValue(num2);
                                                    g.D(jVar9, b1Var31, b1Var512, b1Var61111111114, b1Var28, b1Var61111111115, b1Var41, b1Var40, 0, iIntValue1111, 0, 0, 0, false, 32000);
                                                    break;
                                                default:
                                                    Integer num3 = (Integer) obj4;
                                                    int iIntValue1112 = num3.intValue();
                                                    l1.b1 b1Var513 = b1Var53;
                                                    b1Var513.setValue(num3);
                                                    g.D(jVar9, b1Var31, b1Var61111111114, b1Var28, b1Var61111111115, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue1112, false, 28416);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar3.o0(objQ14);
                                }
                                ys.a.y(iIntValue119, 48, (fz.c) objQ14, sVar3, rVarE114);
                                sVar3.p(true);
                                sVar3.p(true);
                            } else {
                                gVar4 = gVar3;
                            }
                            b1Var32 = b1Var29;
                            jVar6 = jVar5;
                            b1Var33 = b1Var30;
                            objQ12 = new p3(1, jVar6, b1Var57, b1Var31, b1Var53, b1Var28, b1Var27, b1Var33, b1Var32);
                            b1Var34 = b1Var57;
                            b1Var35 = b1Var27;
                            sVar3.o0(objQ12);
                            fz.a aVar11119 = (fz.a) objQ12;
                            if (((Number) b1Var34.getValue()).intValue() > 50) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            jVar7 = jVar6;
                            b1Var36 = b1Var33;
                            b1Var37 = b1Var32;
                            k7.h(aVar11119, null, z28, null, g.C0, sVar3, 196608, 26);
                            float f1115 = 8;
                            ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar13, f1115, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                            zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                            objQ13 = sVar3.Q();
                            if (zF2) {
                                jVar8 = jVar7;
                                b1Var38 = b1Var36;
                                b1Var39 = b1Var37;
                                objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                sVar3.o0(objQ13);
                            } else {
                                jVar8 = jVar7;
                                b1Var38 = b1Var36;
                                b1Var39 = b1Var37;
                                objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                sVar3.o0(objQ13);
                            }
                            fz.a aVar111110 = (fz.a) objQ13;
                            if (((Number) b1Var34.getValue()).intValue() < 150) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            k7.h(aVar111110, null, z29, null, g.D0, sVar3, 196608, 26);
                            sVar3.p(true);
                            sVar3.p(true);
                            b1Var40 = b1Var39;
                            jVar9 = jVar8;
                            b1Var41 = b1Var38;
                            l1.g gVar1111 = gVar4;
                            ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var112)).f30175h, ((h1.s1) sVar3.j(c3Var113)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                            int iIntValue1110 = ((Number) b1Var53.getValue()).intValue();
                            z1.r rVarE115 = j0.c.E(oVar13, CropImageView.DEFAULT_ASPECT_RATIO, f1115, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                            zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                            objQ14 = sVar3.Q();
                            if (zF3) {
                                final int i2111112 = 2;
                                final l1.b1 b1Var61111111116 = b1Var34;
                                final l1.b1 b1Var61111111117 = b1Var35;
                                objQ14 = new fz.c() { // from class: mt.o3
                                    @Override // fz.c
                                    public final Object invoke(Object obj4) {
                                        switch (i2111112) {
                                            case 0:
                                                Integer num = (Integer) obj4;
                                                int iIntValue1111 = num.intValue();
                                                l1.b1 b1Var510 = b1Var53;
                                                b1Var510.setValue(num);
                                                g.D(jVar9, b1Var510, b1Var31, b1Var61111111116, b1Var28, b1Var61111111117, b1Var41, b1Var40, iIntValue1111, 0, 0, 0, 0, false, 32256);
                                                break;
                                            case 1:
                                                Boolean bool = (Boolean) obj4;
                                                boolean zBooleanValue5 = bool.booleanValue();
                                                l1.b1 b1Var511 = b1Var53;
                                                b1Var511.setValue(bool);
                                                g.D(jVar9, b1Var31, b1Var61111111116, b1Var28, b1Var61111111117, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                break;
                                            case 2:
                                                Integer num2 = (Integer) obj4;
                                                int iIntValue1112 = num2.intValue();
                                                l1.b1 b1Var512 = b1Var53;
                                                b1Var512.setValue(num2);
                                                g.D(jVar9, b1Var31, b1Var512, b1Var61111111116, b1Var28, b1Var61111111117, b1Var41, b1Var40, 0, iIntValue1112, 0, 0, 0, false, 32000);
                                                break;
                                            default:
                                                Integer num3 = (Integer) obj4;
                                                int iIntValue1113 = num3.intValue();
                                                l1.b1 b1Var513 = b1Var53;
                                                b1Var513.setValue(num3);
                                                g.D(jVar9, b1Var31, b1Var61111111116, b1Var28, b1Var61111111117, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue1113, false, 28416);
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                sVar3.o0(objQ14);
                            } else {
                                final int i2111113 = 2;
                                final l1.b1 b1Var61111111118 = b1Var34;
                                final l1.b1 b1Var61111111119 = b1Var35;
                                objQ14 = new fz.c() { // from class: mt.o3
                                    @Override // fz.c
                                    public final Object invoke(Object obj4) {
                                        switch (i2111113) {
                                            case 0:
                                                Integer num = (Integer) obj4;
                                                int iIntValue1111 = num.intValue();
                                                l1.b1 b1Var510 = b1Var53;
                                                b1Var510.setValue(num);
                                                g.D(jVar9, b1Var510, b1Var31, b1Var61111111118, b1Var28, b1Var61111111119, b1Var41, b1Var40, iIntValue1111, 0, 0, 0, 0, false, 32256);
                                                break;
                                            case 1:
                                                Boolean bool = (Boolean) obj4;
                                                boolean zBooleanValue5 = bool.booleanValue();
                                                l1.b1 b1Var511 = b1Var53;
                                                b1Var511.setValue(bool);
                                                g.D(jVar9, b1Var31, b1Var61111111118, b1Var28, b1Var61111111119, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                break;
                                            case 2:
                                                Integer num2 = (Integer) obj4;
                                                int iIntValue1112 = num2.intValue();
                                                l1.b1 b1Var512 = b1Var53;
                                                b1Var512.setValue(num2);
                                                g.D(jVar9, b1Var31, b1Var512, b1Var61111111118, b1Var28, b1Var61111111119, b1Var41, b1Var40, 0, iIntValue1112, 0, 0, 0, false, 32000);
                                                break;
                                            default:
                                                Integer num3 = (Integer) obj4;
                                                int iIntValue1113 = num3.intValue();
                                                l1.b1 b1Var513 = b1Var53;
                                                b1Var513.setValue(num3);
                                                g.D(jVar9, b1Var31, b1Var61111111118, b1Var28, b1Var61111111119, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue1113, false, 28416);
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                sVar3.o0(objQ14);
                            }
                            ys.a.y(iIntValue1110, 48, (fz.c) objQ14, sVar3, rVarE115);
                            sVar3.p(true);
                            sVar3.p(true);
                        }
                        final int i30 = 1;
                        final l1.b1 b1Var70 = b1Var21;
                        final l1.b1 b1Var71 = b1Var22;
                        final l1.b1 b1Var72 = b1Var17;
                        jVar4 = jVar2;
                        final l1.b1 b1Var73 = b1Var12;
                        final l1.b1 b1Var74 = b1Var20;
                        objQ24 = new fz.c() { // from class: mt.o3
                            @Override // fz.c
                            public final Object invoke(Object obj4) {
                                switch (i30) {
                                    case 0:
                                        Integer num = (Integer) obj4;
                                        int iIntValue1111 = num.intValue();
                                        l1.b1 b1Var510 = b1Var71;
                                        b1Var510.setValue(num);
                                        g.D(jVar4, b1Var510, b1Var72, b1Var53, b1Var57, b1Var73, b1Var70, b1Var74, iIntValue1111, 0, 0, 0, 0, false, 32256);
                                        break;
                                    case 1:
                                        Boolean bool = (Boolean) obj4;
                                        boolean zBooleanValue5 = bool.booleanValue();
                                        l1.b1 b1Var511 = b1Var71;
                                        b1Var511.setValue(bool);
                                        g.D(jVar4, b1Var72, b1Var53, b1Var57, b1Var73, b1Var70, b1Var74, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                        break;
                                    case 2:
                                        Integer num2 = (Integer) obj4;
                                        int iIntValue1112 = num2.intValue();
                                        l1.b1 b1Var512 = b1Var71;
                                        b1Var512.setValue(num2);
                                        g.D(jVar4, b1Var72, b1Var512, b1Var53, b1Var57, b1Var73, b1Var70, b1Var74, 0, iIntValue1112, 0, 0, 0, false, 32000);
                                        break;
                                    default:
                                        Integer num3 = (Integer) obj4;
                                        int iIntValue1113 = num3.intValue();
                                        l1.b1 b1Var513 = b1Var71;
                                        b1Var513.setValue(num3);
                                        g.D(jVar4, b1Var72, b1Var53, b1Var57, b1Var73, b1Var513, b1Var70, b1Var74, 0, 0, 0, 0, iIntValue1113, false, 28416);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        b1Var24 = b1Var71;
                        b1Var25 = b1Var70;
                        b1Var26 = b1Var74;
                        sVar4.o0(objQ24);
                        ys.a.m(strE3, zBooleanValue4, (fz.c) objQ24, sVar4, 0);
                        z1.r rVarI5 = j0.e2.i(j0.e2.e(oVar2, 1.0f), 62, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        j0.e eVar5 = j0.i.f35309g;
                        z1.i iVar8 = z1.c.M;
                        j0.a2 a2VarA7 = j0.z1.a(eVar5, iVar8, sVar4, 54);
                        iHashCode = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL9 = sVar4.l();
                        z1.r rVarC11 = z1.a.c(sVar4, rVarI5);
                        sVar4.h0();
                        if (sVar4.S) {
                            iVar = iVar3;
                            sVar4.k(iVar);
                        } else {
                            iVar = iVar3;
                            sVar4.r0();
                        }
                        gVar3 = gVar2;
                        l1.t.J(hVar4, a2VarA7, sVar4);
                        l1.t.J(hVar5, q1VarL9, sVar4);
                        if (sVar4.S) {
                            oVar = oVar2;
                            if (!kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                                hVar = hVar6;
                            }
                            l1.t.J(hVar7, rVarC11, sVar4);
                            String strE15 = ub.a.e0(sVar4, R.string.audio_speed);
                            l1.c3 c3Var114 = fc.f30256a;
                            j3.y0 y0Var12 = ((dc) sVar4.j(c3Var114)).f30175h;
                            l1.c3 c3Var115 = h1.v1.f31180a;
                            hVar2 = hVar;
                            j3.y0 y0VarA12 = j3.y0.a(y0Var12, ((h1.s1) sVar4.j(c3Var115)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                            if (1.0f <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            sVar3 = sVar4;
                            iVar2 = iVar;
                            z1.o oVar14 = oVar;
                            jVar5 = jVar4;
                            b1Var27 = b1Var25;
                            b1Var28 = b1Var12;
                            b1Var29 = b1Var24;
                            b1Var30 = b1Var26;
                            b1Var31 = b1Var17;
                            ua.b(strE15, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA12, sVar3, 0, 0, 65532);
                            j0.a2 a2VarA14 = j0.z1.a(j0.i.f35303a, iVar8, sVar3, 48);
                            iHashCode2 = Long.hashCode(sVar3.T);
                            l1.q1 q1VarL16 = sVar3.l();
                            z1.r rVarC18 = z1.a.c(sVar3, oVar14);
                            sVar3.h0();
                            if (sVar3.S) {
                                sVar3.k(iVar2);
                            } else {
                                sVar3.r0();
                            }
                            l1.t.J(hVar4, a2VarA14, sVar3);
                            l1.t.J(hVar5, q1VarL16, sVar3);
                            if (sVar3.S) {
                                defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                            } else {
                                defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                            }
                            l1.t.J(hVar7, rVarC18, sVar3);
                            zF = sVar3.f(b1Var57) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var27) | sVar3.f(b1Var30) | sVar3.f(b1Var29) | sVar3.f(jVar5);
                            objQ12 = sVar3.Q();
                            if (zF) {
                                gVar4 = gVar3;
                                if (objQ12 == gVar4) {
                                    b1Var32 = b1Var29;
                                    jVar6 = jVar5;
                                    b1Var33 = b1Var30;
                                    b1Var35 = b1Var27;
                                    b1Var34 = b1Var57;
                                }
                                fz.a aVar111111 = (fz.a) objQ12;
                                if (((Number) b1Var34.getValue()).intValue() > 50) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                jVar7 = jVar6;
                                b1Var36 = b1Var33;
                                b1Var37 = b1Var32;
                                k7.h(aVar111111, null, z28, null, g.C0, sVar3, 196608, 26);
                                float f1116 = 8;
                                ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar14, f1116, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                                zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                                objQ13 = sVar3.Q();
                                if (zF2) {
                                    jVar8 = jVar7;
                                    b1Var38 = b1Var36;
                                    b1Var39 = b1Var37;
                                    objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                    sVar3.o0(objQ13);
                                } else {
                                    jVar8 = jVar7;
                                    b1Var38 = b1Var36;
                                    b1Var39 = b1Var37;
                                    objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                    sVar3.o0(objQ13);
                                }
                                fz.a aVar111112 = (fz.a) objQ13;
                                if (((Number) b1Var34.getValue()).intValue() < 150) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                k7.h(aVar111112, null, z29, null, g.D0, sVar3, 196608, 26);
                                sVar3.p(true);
                                sVar3.p(true);
                                b1Var40 = b1Var39;
                                jVar9 = jVar8;
                                b1Var41 = b1Var38;
                                l1.g gVar1112 = gVar4;
                                ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var114)).f30175h, ((h1.s1) sVar3.j(c3Var115)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                                int iIntValue1111 = ((Number) b1Var53.getValue()).intValue();
                                z1.r rVarE116 = j0.c.E(oVar14, CropImageView.DEFAULT_ASPECT_RATIO, f1116, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                                objQ14 = sVar3.Q();
                                if (zF3) {
                                    final int i2111114 = 2;
                                    final l1.b1 b1Var611111111110 = b1Var34;
                                    final l1.b1 b1Var611111111111 = b1Var35;
                                    objQ14 = new fz.c() { // from class: mt.o3
                                        @Override // fz.c
                                        public final Object invoke(Object obj4) {
                                            switch (i2111114) {
                                                case 0:
                                                    Integer num = (Integer) obj4;
                                                    int iIntValue1112 = num.intValue();
                                                    l1.b1 b1Var510 = b1Var53;
                                                    b1Var510.setValue(num);
                                                    g.D(jVar9, b1Var510, b1Var31, b1Var611111111110, b1Var28, b1Var611111111111, b1Var41, b1Var40, iIntValue1112, 0, 0, 0, 0, false, 32256);
                                                    break;
                                                case 1:
                                                    Boolean bool = (Boolean) obj4;
                                                    boolean zBooleanValue5 = bool.booleanValue();
                                                    l1.b1 b1Var511 = b1Var53;
                                                    b1Var511.setValue(bool);
                                                    g.D(jVar9, b1Var31, b1Var611111111110, b1Var28, b1Var611111111111, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                    break;
                                                case 2:
                                                    Integer num2 = (Integer) obj4;
                                                    int iIntValue1113 = num2.intValue();
                                                    l1.b1 b1Var512 = b1Var53;
                                                    b1Var512.setValue(num2);
                                                    g.D(jVar9, b1Var31, b1Var512, b1Var611111111110, b1Var28, b1Var611111111111, b1Var41, b1Var40, 0, iIntValue1113, 0, 0, 0, false, 32000);
                                                    break;
                                                default:
                                                    Integer num3 = (Integer) obj4;
                                                    int iIntValue1114 = num3.intValue();
                                                    l1.b1 b1Var513 = b1Var53;
                                                    b1Var513.setValue(num3);
                                                    g.D(jVar9, b1Var31, b1Var611111111110, b1Var28, b1Var611111111111, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue1114, false, 28416);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar3.o0(objQ14);
                                } else {
                                    final int i2111115 = 2;
                                    final l1.b1 b1Var611111111112 = b1Var34;
                                    final l1.b1 b1Var611111111113 = b1Var35;
                                    objQ14 = new fz.c() { // from class: mt.o3
                                        @Override // fz.c
                                        public final Object invoke(Object obj4) {
                                            switch (i2111115) {
                                                case 0:
                                                    Integer num = (Integer) obj4;
                                                    int iIntValue1112 = num.intValue();
                                                    l1.b1 b1Var510 = b1Var53;
                                                    b1Var510.setValue(num);
                                                    g.D(jVar9, b1Var510, b1Var31, b1Var611111111112, b1Var28, b1Var611111111113, b1Var41, b1Var40, iIntValue1112, 0, 0, 0, 0, false, 32256);
                                                    break;
                                                case 1:
                                                    Boolean bool = (Boolean) obj4;
                                                    boolean zBooleanValue5 = bool.booleanValue();
                                                    l1.b1 b1Var511 = b1Var53;
                                                    b1Var511.setValue(bool);
                                                    g.D(jVar9, b1Var31, b1Var611111111112, b1Var28, b1Var611111111113, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                    break;
                                                case 2:
                                                    Integer num2 = (Integer) obj4;
                                                    int iIntValue1113 = num2.intValue();
                                                    l1.b1 b1Var512 = b1Var53;
                                                    b1Var512.setValue(num2);
                                                    g.D(jVar9, b1Var31, b1Var512, b1Var611111111112, b1Var28, b1Var611111111113, b1Var41, b1Var40, 0, iIntValue1113, 0, 0, 0, false, 32000);
                                                    break;
                                                default:
                                                    Integer num3 = (Integer) obj4;
                                                    int iIntValue1114 = num3.intValue();
                                                    l1.b1 b1Var513 = b1Var53;
                                                    b1Var513.setValue(num3);
                                                    g.D(jVar9, b1Var31, b1Var611111111112, b1Var28, b1Var611111111113, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue1114, false, 28416);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar3.o0(objQ14);
                                }
                                ys.a.y(iIntValue1111, 48, (fz.c) objQ14, sVar3, rVarE116);
                                sVar3.p(true);
                                sVar3.p(true);
                            } else {
                                gVar4 = gVar3;
                            }
                            b1Var32 = b1Var29;
                            jVar6 = jVar5;
                            b1Var33 = b1Var30;
                            objQ12 = new p3(1, jVar6, b1Var57, b1Var31, b1Var53, b1Var28, b1Var27, b1Var33, b1Var32);
                            b1Var34 = b1Var57;
                            b1Var35 = b1Var27;
                            sVar3.o0(objQ12);
                            fz.a aVar111113 = (fz.a) objQ12;
                            if (((Number) b1Var34.getValue()).intValue() > 50) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            jVar7 = jVar6;
                            b1Var36 = b1Var33;
                            b1Var37 = b1Var32;
                            k7.h(aVar111113, null, z28, null, g.C0, sVar3, 196608, 26);
                            float f1117 = 8;
                            ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar14, f1117, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                            zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                            objQ13 = sVar3.Q();
                            if (zF2) {
                                jVar8 = jVar7;
                                b1Var38 = b1Var36;
                                b1Var39 = b1Var37;
                                objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                sVar3.o0(objQ13);
                            } else {
                                jVar8 = jVar7;
                                b1Var38 = b1Var36;
                                b1Var39 = b1Var37;
                                objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                sVar3.o0(objQ13);
                            }
                            fz.a aVar111114 = (fz.a) objQ13;
                            if (((Number) b1Var34.getValue()).intValue() < 150) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            k7.h(aVar111114, null, z29, null, g.D0, sVar3, 196608, 26);
                            sVar3.p(true);
                            sVar3.p(true);
                            b1Var40 = b1Var39;
                            jVar9 = jVar8;
                            b1Var41 = b1Var38;
                            l1.g gVar1113 = gVar4;
                            ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var114)).f30175h, ((h1.s1) sVar3.j(c3Var115)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                            int iIntValue1112 = ((Number) b1Var53.getValue()).intValue();
                            z1.r rVarE117 = j0.c.E(oVar14, CropImageView.DEFAULT_ASPECT_RATIO, f1117, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                            zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                            objQ14 = sVar3.Q();
                            if (zF3) {
                                final int i2111116 = 2;
                                final l1.b1 b1Var611111111114 = b1Var34;
                                final l1.b1 b1Var611111111115 = b1Var35;
                                objQ14 = new fz.c() { // from class: mt.o3
                                    @Override // fz.c
                                    public final Object invoke(Object obj4) {
                                        switch (i2111116) {
                                            case 0:
                                                Integer num = (Integer) obj4;
                                                int iIntValue1113 = num.intValue();
                                                l1.b1 b1Var510 = b1Var53;
                                                b1Var510.setValue(num);
                                                g.D(jVar9, b1Var510, b1Var31, b1Var611111111114, b1Var28, b1Var611111111115, b1Var41, b1Var40, iIntValue1113, 0, 0, 0, 0, false, 32256);
                                                break;
                                            case 1:
                                                Boolean bool = (Boolean) obj4;
                                                boolean zBooleanValue5 = bool.booleanValue();
                                                l1.b1 b1Var511 = b1Var53;
                                                b1Var511.setValue(bool);
                                                g.D(jVar9, b1Var31, b1Var611111111114, b1Var28, b1Var611111111115, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                break;
                                            case 2:
                                                Integer num2 = (Integer) obj4;
                                                int iIntValue1114 = num2.intValue();
                                                l1.b1 b1Var512 = b1Var53;
                                                b1Var512.setValue(num2);
                                                g.D(jVar9, b1Var31, b1Var512, b1Var611111111114, b1Var28, b1Var611111111115, b1Var41, b1Var40, 0, iIntValue1114, 0, 0, 0, false, 32000);
                                                break;
                                            default:
                                                Integer num3 = (Integer) obj4;
                                                int iIntValue1115 = num3.intValue();
                                                l1.b1 b1Var513 = b1Var53;
                                                b1Var513.setValue(num3);
                                                g.D(jVar9, b1Var31, b1Var611111111114, b1Var28, b1Var611111111115, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue1115, false, 28416);
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                sVar3.o0(objQ14);
                            } else {
                                final int i2111117 = 2;
                                final l1.b1 b1Var611111111116 = b1Var34;
                                final l1.b1 b1Var611111111117 = b1Var35;
                                objQ14 = new fz.c() { // from class: mt.o3
                                    @Override // fz.c
                                    public final Object invoke(Object obj4) {
                                        switch (i2111117) {
                                            case 0:
                                                Integer num = (Integer) obj4;
                                                int iIntValue1113 = num.intValue();
                                                l1.b1 b1Var510 = b1Var53;
                                                b1Var510.setValue(num);
                                                g.D(jVar9, b1Var510, b1Var31, b1Var611111111116, b1Var28, b1Var611111111117, b1Var41, b1Var40, iIntValue1113, 0, 0, 0, 0, false, 32256);
                                                break;
                                            case 1:
                                                Boolean bool = (Boolean) obj4;
                                                boolean zBooleanValue5 = bool.booleanValue();
                                                l1.b1 b1Var511 = b1Var53;
                                                b1Var511.setValue(bool);
                                                g.D(jVar9, b1Var31, b1Var611111111116, b1Var28, b1Var611111111117, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                break;
                                            case 2:
                                                Integer num2 = (Integer) obj4;
                                                int iIntValue1114 = num2.intValue();
                                                l1.b1 b1Var512 = b1Var53;
                                                b1Var512.setValue(num2);
                                                g.D(jVar9, b1Var31, b1Var512, b1Var611111111116, b1Var28, b1Var611111111117, b1Var41, b1Var40, 0, iIntValue1114, 0, 0, 0, false, 32000);
                                                break;
                                            default:
                                                Integer num3 = (Integer) obj4;
                                                int iIntValue1115 = num3.intValue();
                                                l1.b1 b1Var513 = b1Var53;
                                                b1Var513.setValue(num3);
                                                g.D(jVar9, b1Var31, b1Var611111111116, b1Var28, b1Var611111111117, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue1115, false, 28416);
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                sVar3.o0(objQ14);
                            }
                            ys.a.y(iIntValue1112, 48, (fz.c) objQ14, sVar3, rVarE117);
                            sVar3.p(true);
                            sVar3.p(true);
                        } else {
                            oVar = oVar2;
                        }
                        hVar = hVar6;
                        defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
                        l1.t.J(hVar7, rVarC11, sVar4);
                        String strE16 = ub.a.e0(sVar4, R.string.audio_speed);
                        l1.c3 c3Var116 = fc.f30256a;
                        j3.y0 y0Var13 = ((dc) sVar4.j(c3Var116)).f30175h;
                        l1.c3 c3Var117 = h1.v1.f31180a;
                        hVar2 = hVar;
                        j3.y0 y0VarA13 = j3.y0.a(y0Var13, ((h1.s1) sVar4.j(c3Var117)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        sVar3 = sVar4;
                        iVar2 = iVar;
                        z1.o oVar15 = oVar;
                        jVar5 = jVar4;
                        b1Var27 = b1Var25;
                        b1Var28 = b1Var12;
                        b1Var29 = b1Var24;
                        b1Var30 = b1Var26;
                        b1Var31 = b1Var17;
                        ua.b(strE16, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA13, sVar3, 0, 0, 65532);
                        j0.a2 a2VarA15 = j0.z1.a(j0.i.f35303a, iVar8, sVar3, 48);
                        iHashCode2 = Long.hashCode(sVar3.T);
                        l1.q1 q1VarL17 = sVar3.l();
                        z1.r rVarC19 = z1.a.c(sVar3, oVar15);
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar2);
                        } else {
                            sVar3.r0();
                        }
                        l1.t.J(hVar4, a2VarA15, sVar3);
                        l1.t.J(hVar5, q1VarL17, sVar3);
                        if (sVar3.S) {
                            defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                        } else {
                            defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                        }
                        l1.t.J(hVar7, rVarC19, sVar3);
                        zF = sVar3.f(b1Var57) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var27) | sVar3.f(b1Var30) | sVar3.f(b1Var29) | sVar3.f(jVar5);
                        objQ12 = sVar3.Q();
                        if (zF) {
                            gVar4 = gVar3;
                            if (objQ12 == gVar4) {
                                b1Var32 = b1Var29;
                                jVar6 = jVar5;
                                b1Var33 = b1Var30;
                                b1Var35 = b1Var27;
                                b1Var34 = b1Var57;
                            }
                            fz.a aVar111115 = (fz.a) objQ12;
                            if (((Number) b1Var34.getValue()).intValue() > 50) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            jVar7 = jVar6;
                            b1Var36 = b1Var33;
                            b1Var37 = b1Var32;
                            k7.h(aVar111115, null, z28, null, g.C0, sVar3, 196608, 26);
                            float f1118 = 8;
                            ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar15, f1118, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                            zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                            objQ13 = sVar3.Q();
                            if (zF2) {
                                jVar8 = jVar7;
                                b1Var38 = b1Var36;
                                b1Var39 = b1Var37;
                                objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                sVar3.o0(objQ13);
                            } else {
                                jVar8 = jVar7;
                                b1Var38 = b1Var36;
                                b1Var39 = b1Var37;
                                objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                                sVar3.o0(objQ13);
                            }
                            fz.a aVar111116 = (fz.a) objQ13;
                            if (((Number) b1Var34.getValue()).intValue() < 150) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            k7.h(aVar111116, null, z29, null, g.D0, sVar3, 196608, 26);
                            sVar3.p(true);
                            sVar3.p(true);
                            b1Var40 = b1Var39;
                            jVar9 = jVar8;
                            b1Var41 = b1Var38;
                            l1.g gVar1114 = gVar4;
                            ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var116)).f30175h, ((h1.s1) sVar3.j(c3Var117)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                            int iIntValue1113 = ((Number) b1Var53.getValue()).intValue();
                            z1.r rVarE118 = j0.c.E(oVar15, CropImageView.DEFAULT_ASPECT_RATIO, f1118, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                            zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                            objQ14 = sVar3.Q();
                            if (zF3) {
                                final int i2111118 = 2;
                                final l1.b1 b1Var611111111118 = b1Var34;
                                final l1.b1 b1Var611111111119 = b1Var35;
                                objQ14 = new fz.c() { // from class: mt.o3
                                    @Override // fz.c
                                    public final Object invoke(Object obj4) {
                                        switch (i2111118) {
                                            case 0:
                                                Integer num = (Integer) obj4;
                                                int iIntValue1114 = num.intValue();
                                                l1.b1 b1Var510 = b1Var53;
                                                b1Var510.setValue(num);
                                                g.D(jVar9, b1Var510, b1Var31, b1Var611111111118, b1Var28, b1Var611111111119, b1Var41, b1Var40, iIntValue1114, 0, 0, 0, 0, false, 32256);
                                                break;
                                            case 1:
                                                Boolean bool = (Boolean) obj4;
                                                boolean zBooleanValue5 = bool.booleanValue();
                                                l1.b1 b1Var511 = b1Var53;
                                                b1Var511.setValue(bool);
                                                g.D(jVar9, b1Var31, b1Var611111111118, b1Var28, b1Var611111111119, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                break;
                                            case 2:
                                                Integer num2 = (Integer) obj4;
                                                int iIntValue1115 = num2.intValue();
                                                l1.b1 b1Var512 = b1Var53;
                                                b1Var512.setValue(num2);
                                                g.D(jVar9, b1Var31, b1Var512, b1Var611111111118, b1Var28, b1Var611111111119, b1Var41, b1Var40, 0, iIntValue1115, 0, 0, 0, false, 32000);
                                                break;
                                            default:
                                                Integer num3 = (Integer) obj4;
                                                int iIntValue1116 = num3.intValue();
                                                l1.b1 b1Var513 = b1Var53;
                                                b1Var513.setValue(num3);
                                                g.D(jVar9, b1Var31, b1Var611111111118, b1Var28, b1Var611111111119, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue1116, false, 28416);
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                sVar3.o0(objQ14);
                            } else {
                                final int i2111119 = 2;
                                final l1.b1 b1Var6111111111110 = b1Var34;
                                final l1.b1 b1Var6111111111111 = b1Var35;
                                objQ14 = new fz.c() { // from class: mt.o3
                                    @Override // fz.c
                                    public final Object invoke(Object obj4) {
                                        switch (i2111119) {
                                            case 0:
                                                Integer num = (Integer) obj4;
                                                int iIntValue1114 = num.intValue();
                                                l1.b1 b1Var510 = b1Var53;
                                                b1Var510.setValue(num);
                                                g.D(jVar9, b1Var510, b1Var31, b1Var6111111111110, b1Var28, b1Var6111111111111, b1Var41, b1Var40, iIntValue1114, 0, 0, 0, 0, false, 32256);
                                                break;
                                            case 1:
                                                Boolean bool = (Boolean) obj4;
                                                boolean zBooleanValue5 = bool.booleanValue();
                                                l1.b1 b1Var511 = b1Var53;
                                                b1Var511.setValue(bool);
                                                g.D(jVar9, b1Var31, b1Var6111111111110, b1Var28, b1Var6111111111111, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                                break;
                                            case 2:
                                                Integer num2 = (Integer) obj4;
                                                int iIntValue1115 = num2.intValue();
                                                l1.b1 b1Var512 = b1Var53;
                                                b1Var512.setValue(num2);
                                                g.D(jVar9, b1Var31, b1Var512, b1Var6111111111110, b1Var28, b1Var6111111111111, b1Var41, b1Var40, 0, iIntValue1115, 0, 0, 0, false, 32000);
                                                break;
                                            default:
                                                Integer num3 = (Integer) obj4;
                                                int iIntValue1116 = num3.intValue();
                                                l1.b1 b1Var513 = b1Var53;
                                                b1Var513.setValue(num3);
                                                g.D(jVar9, b1Var31, b1Var6111111111110, b1Var28, b1Var6111111111111, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue1116, false, 28416);
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                sVar3.o0(objQ14);
                            }
                            ys.a.y(iIntValue1113, 48, (fz.c) objQ14, sVar3, rVarE118);
                            sVar3.p(true);
                            sVar3.p(true);
                        } else {
                            gVar4 = gVar3;
                        }
                        b1Var32 = b1Var29;
                        jVar6 = jVar5;
                        b1Var33 = b1Var30;
                        objQ12 = new p3(1, jVar6, b1Var57, b1Var31, b1Var53, b1Var28, b1Var27, b1Var33, b1Var32);
                        b1Var34 = b1Var57;
                        b1Var35 = b1Var27;
                        sVar3.o0(objQ12);
                        fz.a aVar111117 = (fz.a) objQ12;
                        if (((Number) b1Var34.getValue()).intValue() > 50) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        jVar7 = jVar6;
                        b1Var36 = b1Var33;
                        b1Var37 = b1Var32;
                        k7.h(aVar111117, null, z28, null, g.C0, sVar3, 196608, 26);
                        float f1119 = 8;
                        ua.b(w4.c.f(((Number) b1Var34.getValue()).intValue(), "%"), j0.c.C(oVar15, f1119, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131068);
                        zF2 = sVar3.f(b1Var34) | sVar3.f(b1Var31) | sVar3.f(b1Var53) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var36) | sVar3.f(b1Var37) | sVar3.f(jVar7);
                        objQ13 = sVar3.Q();
                        if (zF2) {
                            jVar8 = jVar7;
                            b1Var38 = b1Var36;
                            b1Var39 = b1Var37;
                            objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                            sVar3.o0(objQ13);
                        } else {
                            jVar8 = jVar7;
                            b1Var38 = b1Var36;
                            b1Var39 = b1Var37;
                            objQ13 = new p3(2, jVar8, b1Var34, b1Var31, b1Var53, b1Var28, b1Var35, b1Var38, b1Var39);
                            sVar3.o0(objQ13);
                        }
                        fz.a aVar111118 = (fz.a) objQ13;
                        if (((Number) b1Var34.getValue()).intValue() < 150) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        k7.h(aVar111118, null, z29, null, g.D0, sVar3, 196608, 26);
                        sVar3.p(true);
                        sVar3.p(true);
                        b1Var40 = b1Var39;
                        jVar9 = jVar8;
                        b1Var41 = b1Var38;
                        l1.g gVar1115 = gVar4;
                        ua.b(ub.a.e0(sVar3, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar3.j(c3Var116)).f30175h, ((h1.s1) sVar3.j(c3Var117)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                        int iIntValue1114 = ((Number) b1Var53.getValue()).intValue();
                        z1.r rVarE119 = j0.c.E(oVar15, CropImageView.DEFAULT_ASPECT_RATIO, f1119, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                        zF3 = sVar3.f(b1Var53) | sVar3.f(b1Var31) | sVar3.f(b1Var34) | sVar3.f(b1Var28) | sVar3.f(b1Var35) | sVar3.f(b1Var41) | sVar3.f(b1Var40) | sVar3.f(jVar9);
                        objQ14 = sVar3.Q();
                        if (zF3) {
                            final int i21111110 = 2;
                            final l1.b1 b1Var6111111111112 = b1Var34;
                            final l1.b1 b1Var6111111111113 = b1Var35;
                            objQ14 = new fz.c() { // from class: mt.o3
                                @Override // fz.c
                                public final Object invoke(Object obj4) {
                                    switch (i21111110) {
                                        case 0:
                                            Integer num = (Integer) obj4;
                                            int iIntValue1115 = num.intValue();
                                            l1.b1 b1Var510 = b1Var53;
                                            b1Var510.setValue(num);
                                            g.D(jVar9, b1Var510, b1Var31, b1Var6111111111112, b1Var28, b1Var6111111111113, b1Var41, b1Var40, iIntValue1115, 0, 0, 0, 0, false, 32256);
                                            break;
                                        case 1:
                                            Boolean bool = (Boolean) obj4;
                                            boolean zBooleanValue5 = bool.booleanValue();
                                            l1.b1 b1Var511 = b1Var53;
                                            b1Var511.setValue(bool);
                                            g.D(jVar9, b1Var31, b1Var6111111111112, b1Var28, b1Var6111111111113, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                            break;
                                        case 2:
                                            Integer num2 = (Integer) obj4;
                                            int iIntValue1116 = num2.intValue();
                                            l1.b1 b1Var512 = b1Var53;
                                            b1Var512.setValue(num2);
                                            g.D(jVar9, b1Var31, b1Var512, b1Var6111111111112, b1Var28, b1Var6111111111113, b1Var41, b1Var40, 0, iIntValue1116, 0, 0, 0, false, 32000);
                                            break;
                                        default:
                                            Integer num3 = (Integer) obj4;
                                            int iIntValue1117 = num3.intValue();
                                            l1.b1 b1Var513 = b1Var53;
                                            b1Var513.setValue(num3);
                                            g.D(jVar9, b1Var31, b1Var6111111111112, b1Var28, b1Var6111111111113, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue1117, false, 28416);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar3.o0(objQ14);
                        } else {
                            final int i21111111 = 2;
                            final l1.b1 b1Var6111111111114 = b1Var34;
                            final l1.b1 b1Var6111111111115 = b1Var35;
                            objQ14 = new fz.c() { // from class: mt.o3
                                @Override // fz.c
                                public final Object invoke(Object obj4) {
                                    switch (i21111111) {
                                        case 0:
                                            Integer num = (Integer) obj4;
                                            int iIntValue1115 = num.intValue();
                                            l1.b1 b1Var510 = b1Var53;
                                            b1Var510.setValue(num);
                                            g.D(jVar9, b1Var510, b1Var31, b1Var6111111111114, b1Var28, b1Var6111111111115, b1Var41, b1Var40, iIntValue1115, 0, 0, 0, 0, false, 32256);
                                            break;
                                        case 1:
                                            Boolean bool = (Boolean) obj4;
                                            boolean zBooleanValue5 = bool.booleanValue();
                                            l1.b1 b1Var511 = b1Var53;
                                            b1Var511.setValue(bool);
                                            g.D(jVar9, b1Var31, b1Var6111111111114, b1Var28, b1Var6111111111115, b1Var41, b1Var40, b1Var511, 0, 0, 0, 0, 0, zBooleanValue5, 16128);
                                            break;
                                        case 2:
                                            Integer num2 = (Integer) obj4;
                                            int iIntValue1116 = num2.intValue();
                                            l1.b1 b1Var512 = b1Var53;
                                            b1Var512.setValue(num2);
                                            g.D(jVar9, b1Var31, b1Var512, b1Var6111111111114, b1Var28, b1Var6111111111115, b1Var41, b1Var40, 0, iIntValue1116, 0, 0, 0, false, 32000);
                                            break;
                                        default:
                                            Integer num3 = (Integer) obj4;
                                            int iIntValue1117 = num3.intValue();
                                            l1.b1 b1Var513 = b1Var53;
                                            b1Var513.setValue(num3);
                                            g.D(jVar9, b1Var31, b1Var6111111111114, b1Var28, b1Var6111111111115, b1Var513, b1Var41, b1Var40, 0, 0, 0, 0, iIntValue1117, false, 28416);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar3.o0(objQ14);
                        }
                        ys.a.y(iIntValue1114, 48, (fz.c) objQ14, sVar3, rVarE119);
                        sVar3.p(true);
                        sVar3.p(true);
                    } else {
                        sVar4.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar2), sVar, (i17 >> 21) & 14, 384, 4090);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: mt.q3
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    g.C(i11, i12, i13, i14, i15, f5, z11, onDismissRequest, onSettingChange, (l1.n) obj, l1.t.M(i16 | 1));
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static void D(fz.j jVar, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, l1.b1 b1Var5, l1.b1 b1Var6, l1.b1 b1Var7, int i11, int i12, int i13, int i14, int i15, boolean z11, int i16) {
        jVar.invoke(Integer.valueOf((i16 & 256) != 0 ? ((Number) b1Var.getValue()).intValue() : i11), Integer.valueOf((i16 & 512) != 0 ? ((Number) b1Var2.getValue()).intValue() : i12), Integer.valueOf((i16 & 1024) != 0 ? ((Number) b1Var3.getValue()).intValue() : i13), Integer.valueOf((i16 & 2048) != 0 ? ((Number) b1Var4.getValue()).intValue() : i14), Integer.valueOf((i16 & 4096) != 0 ? ((Number) b1Var5.getValue()).intValue() : i15), Float.valueOf(((Number) b1Var6.getValue()).floatValue()), Boolean.valueOf((i16 & 16384) != 0 ? ((Boolean) b1Var7.getValue()).booleanValue() : z11));
    }

    public static final void E(final boolean z11, final int i11, final int i12, final String str, final int i13, final List list, final long j11, final z1.r rVar, final fz.a aVar, l1.n nVar, final int i14) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-674177481);
        int i15 = i14 | (sVar.g(z11) ? 4 : 2) | (sVar.d(i11) ? 256 : 128) | (sVar.f(str) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.d(i13) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.f(rVar) ? 67108864 : 33554432) | (sVar.h(aVar) ? 536870912 : 268435456);
        if (sVar.T(i15 & 1, (306782339 & i15) != 306782338)) {
            z1.h hVar = z1.c.P;
            z1.r rVarA = d2.h.a(rVar, z11 ? 1.0f : 0.5f);
            boolean z12 = (1879048192 & i15) == 536870912;
            Object objQ = sVar.Q();
            if (z12 || objQ == l1.m.f39353a) {
                objQ = new jr.m(24, aVar);
                sVar.o0(objQ);
            }
            z1.r rVarQ = iu.k.q(0, 7, (fz.a) objQ, sVar, rVarA, false);
            j0.u uVarA = j0.t.a(j0.i.f35305c, hVar, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarQ);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, uVarA, sVar);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            l1.d0 d0Var = ua.f31167a;
            iu.k.c(str, null, j3.y0.a((j3.y0) sVar.j(d0Var), j11, 0L, n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744442), 0, false, 1, 0, s0.x0.a(fr.j3.A(8), fr.j3.A(12)), sVar, ((i15 >> 12) & 14) | 1572864, 186);
            z1.j jVar = z1.c.f58467e;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarG = d0.n.g(j0.e2.g(j0.e2.e(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, 8, 5), 1.0f), 30), fr.p3.q(list), r0.f.f48733a, 4);
            w2.q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarG);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, q0VarD, sVar);
            l1.t.J(hVar3, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            }
            l1.t.J(hVar5, rVarC2, sVar);
            iu.k.c(String.valueOf(i11), null, j3.y0.a((j3.y0) sVar.j(d0Var), ((h1.s1) sVar.j(h1.v1.f31180a)).f31019b, fr.j3.A(16), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 1, 0, s0.x0.a(fr.j3.A(12), fr.j3.A(16)), sVar, 1572864, 186);
            sVar.p(true);
            z1.i iVar2 = z1.c.M;
            z1.r rVarE = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, iVar2, sVar, 48);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarE);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, a2VarA, sVar);
            l1.t.J(hVar3, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
            }
            l1.t.J(hVar5, rVarC3, sVar);
            d0.n.c(se.k.y(i13, sVar, (i15 >> 15) & 14), null, j0.e2.p(oVar, 14, 13), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(z11, i11, i12, str, i13, list, j11, rVar, aVar, i14) { // from class: mt.x
                public final /* synthetic */ z1.r H;
                public final /* synthetic */ fz.a K;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f42034a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f42035b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f42036c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f42037d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f42038e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ List f42039f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ long f42040t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(14155825);
                    g.E(this.f42034a, this.f42035b, this.f42036c, this.f42037d, this.f42038e, this.f42039f, this.f42040t, this.H, this.K, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void F(x8 x8Var, List list, fz.a aVar, l1.n nVar, int i11) {
        String strM;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-357398129);
        int i12 = i11 | (sVar.d(x8Var.ordinal()) ? 4 : 2) | (sVar.h(list) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            float f5 = 8;
            z1.r rVarC = j0.c.C(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, f5, 1);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new jr.m(26, aVar);
                sVar.o0(objQ);
            }
            z1.r rVarO = d0.n.o(rVarC, false, null, (fz.a) objQ, 15);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarO);
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
            boolean zContains = list.contains(x8Var);
            boolean z12 = i13 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new bp.r0(10, aVar);
                sVar.o0(objQ2);
            }
            fz.c cVar = (fz.c) objQ2;
            l1.c3 c3Var = h1.v1.f31180a;
            long j11 = ((h1.s1) sVar.j(c3Var)).f31017a;
            long j12 = g2.x.f28618e;
            long j13 = g2.x.f28622i;
            h1.z0 z0VarV = k7.v((h1.s1) sVar.j(c3Var));
            long j14 = g2.x.f28621h;
            if (j12 == 16) {
                j12 = z0VarV.f31377a;
            }
            long j15 = j12;
            long j16 = j14 != 16 ? j14 : z0VarV.f31378b;
            long j17 = j11 != 16 ? j11 : z0VarV.f31379c;
            long j18 = j14 != 16 ? j14 : z0VarV.f31380d;
            long j19 = j13 != 16 ? j13 : z0VarV.f31381e;
            long j21 = j14 != 16 ? j14 : z0VarV.f31382f;
            long j22 = j13 != 16 ? j13 : z0VarV.f31383g;
            if (j11 == 16) {
                j11 = z0VarV.f31384h;
            }
            h1.e1.a(zContains, cVar, null, false, new h1.z0(j15, j16, j17, j18, j19, j21, j22, j11, j13 != 16 ? j13 : z0VarV.f31385i, j13 != 16 ? j13 : z0VarV.f31386j, j13 != 16 ? j13 : z0VarV.f31387k, j13 != 16 ? j13 : z0VarV.f31388l), sVar, 0, 44);
            j0.c.g(sVar, j0.e2.s(oVar, f5));
            int i14 = z.f42100a[x8Var.ordinal()];
            if (i14 == 1) {
                strM = ep.a.m(sVar, -5495737, R.string.characters, sVar, false);
            } else if (i14 == 2) {
                strM = ep.a.m(sVar, -5492734, R.string.words, sVar, false);
            } else if (i14 == 3) {
                strM = ep.a.m(sVar, -5489754, R.string.sentences, sVar, false);
            } else {
                if (i14 != 4) {
                    throw nv.p.x(sVar, -5497346, false);
                }
                sVar.d0(-170084693);
                sVar.p(false);
                strM = BuildConfig.VERSION_NAME;
            }
            ua.b(strM, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30175h, sVar, 0, 0, 65534);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fp.e(x8Var, list, aVar, i11, 23);
        }
    }

    public static final void G(oe oeVar, fz.a onDismiss, fz.e onConfirm, l1.n nVar, int i11) {
        l1.s sVar;
        String str = oeVar.f50220a;
        kotlin.jvm.internal.m.f(onDismiss, "onDismiss");
        kotlin.jvm.internal.m.f(onConfirm, "onConfirm");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1327169659);
        int i12 = i11 | (sVar2.h(oeVar) ? 4 : 2) | (sVar2.h(onDismiss) ? 32 : 16) | (sVar2.h(onConfirm) ? 256 : 128);
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            boolean zF = sVar2.f(str);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = defpackage.e.v(hz.b.l(oeVar.f50222c, 0, AchievementLevelType.DAY_STREAK_LV_10), sVar2);
            }
            l1.a1 a1Var = (l1.a1) objQ;
            boolean zF2 = sVar2.f(str);
            Object objQ2 = sVar2.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.valueOf(oeVar.f50221b.f49553a.isExcludedFromReview()));
                sVar2.o0(objQ2);
            }
            l1.b1 b1Var = (l1.b1) objQ2;
            sVar = sVar2;
            k7.a(onDismiss, t1.e.d(-316342835, new fp.e(onConfirm, a1Var, b1Var), sVar2), null, t1.e.d(1282806223, new lt.g(onDismiss, 6, (byte) 0), sVar2), X, t1.e.d(-613437486, new fp.e(oeVar, a1Var, b1Var, 24), sVar2), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, ((i12 >> 3) & 14) | 1772592, 16276);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fp.e((Object) oeVar, onDismiss, (Object) onConfirm, i11, 25);
        }
    }

    public static final void H(final int i11, final fz.a onDismiss, final fz.c onConfirm, l1.n nVar, int i12) {
        l1.s sVar;
        r6 p6Var;
        boolean z11;
        l1.b1 b1Var;
        kotlin.jvm.internal.m.f(onDismiss, "onDismiss");
        kotlin.jvm.internal.m.f(onConfirm, "onConfirm");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(195033157);
        int i13 = i12 | (sVar2.d(i11) ? 4 : 2) | (sVar2.h(onConfirm) ? 256 : 128);
        if (sVar2.T(i13 & 1, (i13 & 147) != 146)) {
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(null);
                sVar2.o0(objQ);
            }
            final l1.b1 b1Var2 = (l1.b1) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(null);
                sVar2.o0(objQ2);
            }
            final l1.b1 b1Var3 = (l1.b1) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ3);
            }
            final l1.b1 b1Var4 = (l1.b1) objQ3;
            je jeVar = (je) b1Var2.getValue();
            if (jeVar != null) {
                p6Var = new q6(jeVar);
            } else {
                le leVar = (le) b1Var3.getValue();
                p6Var = leVar != null ? new p6(leVar) : null;
            }
            le leVar2 = (le) b1Var3.getValue();
            final r6 r6Var = p6Var;
            final String strF = leVar2 != null ? f0.f(leVar2) : null;
            h1.a6.a(onDismiss, null, h1.a6.f(6, 2, null, sVar2), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-519223902, new fz.f() { // from class: mt.g0
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    j0.v ModalBottomSheet = (j0.v) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                    l1.s sVar3 = (l1.s) nVar2;
                    if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        z1.o oVar = z1.o.f58481a;
                        z1.r rVarE = j0.c.E(j0.c.C(d0.n.y(j0.c.v(j0.e2.e(oVar, 1.0f)), d0.n.u(sVar3), false, 14), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, 7);
                        j0.u uVarA = j0.t.a(j0.i.g(10), z1.c.O, sVar3, 6);
                        int iHashCode = Long.hashCode(sVar3.T);
                        l1.q1 q1VarL = sVar3.l();
                        z1.r rVarC = z1.a.c(sVar3, rVarE);
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
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar3, iHashCode, hVar3);
                        }
                        y2.h hVar4 = y2.j.f56915d;
                        l1.t.J(hVar4, rVarC, sVar3);
                        String strE0 = ub.a.e0(sVar3, R.string.srs_adjust_next_review);
                        l1.c3 c3Var = fc.f30256a;
                        ua.b(strE0, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar3.j(c3Var)).f30174g, sVar3, 0, 0, 65534);
                        ua.b(ub.a.d0(R.string.srs_future_reviews_selected_count, new Object[]{Integer.valueOf(i11)}, sVar3), null, ((h1.s1) sVar3.j(h1.v1.f31180a)).f31036s, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar3.j(c3Var)).f30178k, sVar3, 0, 0, 65530);
                        ua.b(ub.a.e0(sVar3, R.string.srs_adjust_next_review_desc), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar3.j(c3Var)).f30178k, sVar3, 0, 0, 65534);
                        float f5 = 4;
                        j0.c.g(sVar3, j0.e2.g(oVar, f5));
                        l1.b1 b1Var5 = b1Var2;
                        je jeVar2 = (je) b1Var5.getValue();
                        l1.b1 b1Var6 = b1Var4;
                        boolean zBooleanValue = ((Boolean) b1Var6.getValue()).booleanValue();
                        l1.b1 b1Var7 = b1Var3;
                        boolean z12 = zBooleanValue || ((le) b1Var7.getValue()) != null;
                        Object objQ4 = sVar3.Q();
                        l1.g gVar2 = l1.m.f39353a;
                        if (objQ4 == gVar2) {
                            objQ4 = new bp.r1(b1Var5, b1Var7, b1Var6, 2);
                            sVar3.o0(objQ4);
                        }
                        fz.c cVar = (fz.c) objQ4;
                        Object objQ5 = sVar3.Q();
                        if (objQ5 == gVar2) {
                            objQ5 = new ch.h0(b1Var5, b1Var6, 4);
                            sVar3.o0(objQ5);
                        }
                        g.N(jeVar2, z12, strF, cVar, (fz.a) objQ5, sVar3, 224256);
                        z1.r rVarE2 = j0.c.E(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                        j0.a2 a2VarA = j0.z1.a(j0.i.g(8), z1.c.L, sVar3, 6);
                        int iHashCode2 = Long.hashCode(sVar3.T);
                        l1.q1 q1VarL2 = sVar3.l();
                        z1.r rVarC2 = z1.a.c(sVar3, rVarE2);
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar);
                        } else {
                            sVar3.r0();
                        }
                        l1.t.J(hVar, a2VarA, sVar3);
                        l1.t.J(hVar2, q1VarL2, sVar3);
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar3);
                        }
                        l1.t.J(hVar4, rVarC2, sVar3);
                        r6 r6Var2 = r6Var;
                        boolean z13 = r6Var2 != null;
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        float f11 = 44;
                        z1.r rVarG = j0.e2.g(new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), f11);
                        boolean zH = sVar3.h(r6Var2);
                        fz.c cVar2 = onConfirm;
                        boolean zF = zH | sVar3.f(cVar2);
                        Object objQ6 = sVar3.Q();
                        if (zF || objQ6 == gVar2) {
                            objQ6 = new l1.z1(7, r6Var2, cVar2);
                            sVar3.o0(objQ6);
                        }
                        iu.k.e((fz.a) objQ6, rVarG, z13, 0L, null, g.O, sVar3, 196608, 24);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        iu.k.e(onDismiss, j0.e2.g(new j0.i1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), f11), false, 0L, null, g.P, sVar3, 196608, 28);
                        sVar3.p(true);
                        sVar3.p(true);
                    } else {
                        sVar3.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar2), sVar2, 6, 384, 4090);
            sVar = sVar2;
            if (((Boolean) b1Var4.getValue()).booleanValue()) {
                sVar.d0(-854378523);
                le leVar3 = (le) b1Var3.getValue();
                Object objQ4 = sVar.Q();
                if (objQ4 == gVar) {
                    b1Var = b1Var4;
                    objQ4 = new q(17, b1Var);
                    sVar.o0(objQ4);
                } else {
                    b1Var = b1Var4;
                }
                fz.a aVar = (fz.a) objQ4;
                Object objQ5 = sVar.Q();
                if (objQ5 == gVar) {
                    objQ5 = new bp.i2(b1Var3, b1Var, 11);
                    sVar.o0(objQ5);
                }
                J(leVar3, aVar, (fz.c) objQ5, sVar, 432);
                z11 = false;
            } else {
                z11 = false;
                sVar.d0(-860612995);
            }
            sVar.p(z11);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iv.e(i11, onDismiss, onConfirm, i12, 2);
        }
    }

    public static final void I(List list, int i11, fz.c cVar, l1.n nVar, int i12) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1674566636);
        int i13 = i12 | (sVar.h(list) ? 4 : 2) | (sVar.d(i11) ? 32 : 16) | (sVar.h(cVar) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            fa.a(i11, null, 0L, 0L, null, null, t1.e.d(-1655415892, new et.c(i11, 1, cVar, list), sVar), sVar, ((i13 >> 3) & 14) | 1572864, 62);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new et.c(list, i11, cVar, i12, 2);
        }
    }

    public static final void J(le leVar, fz.a aVar, fz.c cVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-423180412);
        int i12 = (sVar.f(leVar) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            androidx.compose.ui.window.a.a(aVar, new z3.r(3), t1.e.d(-1168465971, new c0(leVar, aVar, cVar, 1), sVar), sVar, 438, 0);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c0(leVar, aVar, cVar, i11, 2);
        }
    }

    public static final void K(final int i11, final fz.c onValueChange, final boolean z11, z1.r rVar, int i12, l1.n nVar, final int i13, final int i14) {
        z1.r rVar2;
        int i15;
        int i16;
        int i17;
        final z1.r rVar3;
        final int i18;
        fz.c cVar;
        kotlin.jvm.internal.m.f(onValueChange, "onValueChange");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(108304400);
        int i19 = (sVar.d(i11) ? 4 : 2) | i13 | (sVar.h(onValueChange) ? 32 : 16);
        if ((i13 & 384) == 0) {
            i19 |= sVar.g(z11) ? 256 : 128;
        }
        int i21 = i14 & 8;
        if (i21 != 0) {
            i15 = i19 | 3072;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i15 = i19 | (sVar.f(rVar2) ? 2048 : 1024);
        }
        int i22 = i14 & 16;
        if (i22 != 0) {
            i17 = i15 | 24576;
            i16 = i12;
        } else {
            i16 = i12;
            i17 = i15 | (sVar.d(i16) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        }
        if (sVar.T(i17 & 1, (i17 & 9363) != 9362)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVar4 = i21 != 0 ? oVar : rVar2;
            int i23 = i22 != 0 ? 365 : i16;
            int iL = hz.b.l(i23, 0, AchievementLevelType.DAY_STREAK_LV_10);
            int i24 = i17;
            int iL2 = hz.b.l(i11, 0, iL);
            z1.r rVarE = j0.e2.e(rVar4, 1.0f);
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
            z1.r rVarE2 = j0.e2.e(oVar, 1.0f);
            z1.r rVar5 = rVar4;
            j0.a2 a2VarA = j0.z1.a(j0.i.f35309g, z1.c.M, sVar, 54);
            int i25 = i23;
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
            int i26 = i24 & 112;
            boolean zD = (i26 == 32) | sVar.d(iL2);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zD || objQ == gVar) {
                objQ = new h0(onValueChange, iL2, 0);
                sVar.o0(objQ);
            }
            k7.h((fz.a) objQ, null, z11 && iL2 > 0, null, T, sVar, 196608, 26);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.i1 i1Var = new j0.i1(1.0f, true);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, i1Var);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            i9.a(null, ((w7) sVar.j(y7.f31359a)).f31244d, ((h1.s1) sVar.j(h1.v1.f31180a)).f31035r, 0L, 2, 0, null, t1.e.d(1219748235, new dt.t0(iL2, 3, (byte) 0), sVar), sVar, 12804096, 73);
            sVar.p(true);
            boolean zD2 = sVar.d(iL2) | (i26 == 32) | sVar.d(iL);
            Object objQ2 = sVar.Q();
            if (zD2 || objQ2 == gVar) {
                cVar = onValueChange;
                objQ2 = new i0(cVar, iL2, iL, 0);
                sVar.o0(objQ2);
            } else {
                cVar = onValueChange;
            }
            k7.h((fz.a) objQ2, null, z11 && iL2 < iL, null, U, sVar, 196608, 26);
            sVar.p(true);
            j0.c.g(sVar, j0.e2.g(oVar, 12));
            List listL = ns.o.L(0, 1, 3, 7, 14, 30, 60, 90, Integer.valueOf(AchievementLevelType.DAY_STREAK_LV_8), Integer.valueOf(AchievementLevelType.DAY_STREAK_LV_10));
            ArrayList arrayList = new ArrayList();
            for (Object obj : listL) {
                if (((Number) obj).intValue() <= iL) {
                    arrayList.add(obj);
                }
            }
            j0.c.c(null, j0.i.g(8), null, null, 0, 0, t1.e.d(-284074517, new j0(arrayList, iL2, cVar, z11, 0), sVar), sVar, 1572912, 61);
            sVar = sVar;
            sVar.p(true);
            rVar3 = rVar5;
            i18 = i25;
        } else {
            sVar.W();
            rVar3 = rVar2;
            i18 = i16;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: mt.k0
                @Override // fz.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    g.K(i11, onValueChange, z11, rVar3, i18, (l1.n) obj2, l1.t.M(i13 | 1), i14);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void L(int i11, int i12, fz.a onDismiss, fz.a onConfirm, l1.n nVar) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(onDismiss, "onDismiss");
        kotlin.jvm.internal.m.f(onConfirm, "onConfirm");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(468406008);
        int i13 = i12 | (sVar2.d(i11) ? 4 : 2) | (sVar2.h(onConfirm) ? 256 : 128);
        if (sVar2.T(i13 & 1, (i13 & 147) != 146)) {
            sVar = sVar2;
            k7.a(onDismiss, t1.e.d(73387840, new lt.g(onConfirm, 4, (byte) 0), sVar2), null, t1.e.d(740769730, new lt.g(onDismiss, 5, (byte) 0), sVar2), S, t1.e.d(-405641083, new dt.t0(i11, 5, (byte) 0), sVar2), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772598, 16276);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m0(i11, onDismiss, onConfirm, i12, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r12v5, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r12v6, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public static final void M(rt.o1 o1Var, final int i11, fz.c onContentTabChange, final fz.e onItemSelectedChange, final fz.c onToggleExpand, final fz.e onUnitSelectionChange, final fz.c onEditClick, z1.r rVar, l1.n nVar, int i12) {
        ?? r12;
        Object obj;
        ?? r11;
        o0.b bVar;
        fz.c cVar;
        ?? r13;
        rt.o1 uiState = o1Var;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        ke keVar = uiState.f50165c;
        boolean z11 = uiState.f50163a;
        kotlin.jvm.internal.m.f(onContentTabChange, "onContentTabChange");
        kotlin.jvm.internal.m.f(onItemSelectedChange, "onItemSelectedChange");
        kotlin.jvm.internal.m.f(onToggleExpand, "onToggleExpand");
        kotlin.jvm.internal.m.f(onUnitSelectionChange, "onUnitSelectionChange");
        kotlin.jvm.internal.m.f(onEditClick, "onEditClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(6598570);
        int i13 = i12 | (sVar.h(uiState) ? 4 : 2) | (sVar.d(i11) ? 32 : 16) | (sVar.h(onContentTabChange) ? 256 : 128) | (sVar.h(onItemSelectedChange) ? 2048 : 1024) | (sVar.h(onToggleExpand) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(onUnitSelectionChange) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.h(onEditClick) ? 1048576 : 524288) | (sVar.f(rVar) ? 8388608 : 4194304);
        if (sVar.T(i13 & 1, (4793491 & i13) != 4793490)) {
            z1.r rVarD = j0.e2.d(rVar, 1.0f);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
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
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            sVar.d0(1513502193);
            boolean z12 = uiState.f50179r;
            z1.o oVar = z1.o.f58481a;
            if (z12) {
                sVar.d0(1513433899);
                float f5 = 16;
                ua.b(ub.a.e0(sVar, R.string.srs_future_reviews_empty), j0.c.B(oVar, f5, f5), ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30178k, sVar, 48, 0, 65528);
                l1.s sVar2 = sVar;
                sVar2.p(false);
                sVar2.p(false);
                r13 = sVar2;
            } else {
                sVar.d0(1511876366);
                sVar.p(false);
                boolean zG = sVar.g(z11);
                Object objQ = sVar.Q();
                l1.g gVar = l1.m.f39353a;
                if (zG || objQ == gVar) {
                    obj = objQ;
                    sy.c cVarO = ns.o.o();
                    cVarO.add(ke.WORDS_EXPRESSION);
                    if (z11) {
                        cVarO.add(ke.CHARACTER);
                    }
                    cVarO.add(ke.HIDDEN);
                    sy.c cVarE = ns.o.e(cVarO);
                    sVar.o0(cVarE);
                    obj = cVarE;
                }
                final List list = (List) obj;
                if (!list.contains(keVar)) {
                    keVar = (ke) ry.m.q0(list);
                }
                int iIndexOf = list.indexOf(keVar);
                int i14 = iIndexOf < 0 ? 0 : iIndexOf;
                boolean zH = sVar.h(list);
                Object objQ2 = sVar.Q();
                Object obj2 = objQ2;
                if (zH || objQ2 == gVar) {
                    c00.f fVar = new c00.f(4, list);
                    sVar.o0(fVar);
                    obj2 = fVar;
                }
                o0.b bVarB = o0.w.b(i14, 0, 2, (fz.a) obj2, sVar);
                Integer numValueOf = Integer.valueOf(i14);
                Integer numValueOf2 = Integer.valueOf(list.size());
                boolean zF = sVar.f(bVarB) | sVar.d(i14);
                Object objQ3 = sVar.Q();
                Object obj3 = objQ3;
                if (zF || objQ3 == gVar) {
                    d1 d1Var = new d1(bVarB, i14, null, 0);
                    sVar.o0(d1Var);
                    obj3 = d1Var;
                }
                l1.t.g(numValueOf, numValueOf2, (fz.e) obj3, sVar);
                Integer numValueOf3 = Integer.valueOf(bVarB.k());
                Boolean boolValueOf = Boolean.valueOf(bVarB.f44442k.b());
                int i15 = i13 & 896;
                boolean zF2 = sVar.f(bVarB) | sVar.h(list) | sVar.h(uiState) | (i15 == 256);
                Object objQ4 = sVar.Q();
                if (zF2 || objQ4 == gVar) {
                    r11 = 0;
                    ad.x xVar = new ad.x(bVarB, list, uiState, onContentTabChange, null, 23);
                    bVar = bVarB;
                    uiState = uiState;
                    cVar = onContentTabChange;
                    sVar.o0(xVar);
                    objQ4 = xVar;
                } else {
                    bVar = bVarB;
                    r11 = 0;
                    cVar = onContentTabChange;
                }
                l1.t.h(numValueOf3, boolValueOf, list, (fz.e) objQ4, sVar);
                ?? r9 = (sVar.h(list) ? 1 : 0) | (sVar.h(uiState) ? 1 : 0) | (i15 == 256 ? 1 : r11);
                Object objQ5 = sVar.Q();
                Object obj4 = objQ5;
                if (r9 != 0 || objQ5 == gVar) {
                    fu.j0 j0Var = new fu.j0(list, uiState, cVar, 21);
                    sVar.o0(j0Var);
                    obj4 = j0Var;
                }
                I(list, i14, (fz.c) obj4, sVar, r11);
                z1.r rVarE = j0.e2.e(oVar, 1.0f);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                final rt.o1 o1Var2 = uiState;
                final o0.b bVar2 = bVar;
                ve.i.d(bVar2, w4.c.p(1.0f, true, rVarE), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-1101188781, new fz.g() { // from class: mt.c1
                    @Override // fz.g
                    public final Object f(Object obj5, Object obj6, Object obj7, Object obj8) {
                        List list2;
                        List list3;
                        o0.o HorizontalPager = (o0.o) obj5;
                        int iIntValue = ((Integer) obj6).intValue();
                        l1.n nVar2 = (l1.n) obj7;
                        ((Integer) obj8).getClass();
                        kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                        ke keVar2 = (ke) ry.m.t0(iIntValue, list);
                        rt.o1 o1Var3 = o1Var2;
                        if (keVar2 == null) {
                            keVar2 = o1Var3.f50165c;
                        }
                        ke keVar3 = keVar2;
                        te teVar = (te) o1Var3.f50168f.get(keVar3);
                        me meVar = o1Var3.f50164b;
                        boolean z13 = teVar != null ? teVar.f50459c : true;
                        boolean z14 = teVar != null ? teVar.f50460d : false;
                        List list4 = ry.r.f50854a;
                        if (teVar == null || (list2 = teVar.f50457a) == null) {
                            list2 = list4;
                        }
                        if (teVar != null && (list3 = teVar.f50458b) != null) {
                            list4 = list3;
                        }
                        boolean z15 = z14;
                        Set set = o1Var3.f50172j;
                        boolean z16 = false;
                        List list5 = list4;
                        Set set2 = o1Var3.f50171i;
                        boolean z17 = z13;
                        List list6 = list2;
                        int i16 = o1Var3.f50173k;
                        if (iIntValue == bVar2.k()) {
                            z16 = true;
                        }
                        b1.j(meVar, keVar3, z17, z15, list6, list5, set, set2, i16, i11, z16, o1Var3.f50167e, onItemSelectedChange, onToggleExpand, onUnitSelectionChange, onEditClick, j0.e2.d(z1.o.f58481a, 1.0f), nVar2, 0);
                        return qy.b0.f48488a;
                    }
                }, sVar), sVar, 0, 16380);
                ?? r14 = sVar;
                r14.p(r11);
                r13 = r14;
            }
            r13.p(true);
            r12 = r13;
        } else {
            l1.s sVar3 = sVar;
            sVar3.W();
            r12 = sVar3;
        }
        l1.x1 x1VarT = r12.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e(o1Var, i11, onContentTabChange, onItemSelectedChange, onToggleExpand, onUnitSelectionChange, onEditClick, rVar, i12);
        }
    }

    public static final void N(je jeVar, boolean z11, String str, fz.c cVar, fz.a aVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1272326095);
        int i12 = i11 | (sVar.d(jeVar == null ? -1 : jeVar.ordinal()) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.f(str) ? 256 : 128);
        if (sVar.T(i12 & 1, (74899 & i12) != 74898)) {
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = je.a();
                sVar.o0(objQ);
            }
            j0.c.c(null, j0.i.g(8), j0.i.g(4), null, 0, 0, t1.e.d(147438060, new jr.h((yy.a) objQ, jeVar, cVar, z11, aVar, str), sVar), sVar, 1573296, 57);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.c0(jeVar, z11, str, cVar, aVar, i11);
        }
    }

    public static final void a(int i11, fz.a onChangeFolder, l1.n nVar, z1.r rVar) {
        int i12;
        z1.r rVar2;
        kotlin.jvm.internal.m.f(onChangeFolder, "onChangeFolder");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(117469533);
        if ((i11 & 48) == 0) {
            i12 = (sVar.h(onChangeFolder) ? 32 : 16) | i11;
        } else {
            i12 = i11;
        }
        int i13 = i12 | 384;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            z1.j jVar = z1.c.H;
            j0.r rVar3 = j0.r.f35391a;
            rVar2 = z1.o.f58481a;
            float f5 = 1;
            k7.k(j0.e2.e(j0.c.E(j0.c.C(rVar3.a(rVar2, jVar), 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 88, 7), 1.0f), null, null, new h1.u0(f5, f5, f5, f5, k1.v.f37775e, k1.v.f37774d), null, t1.e.d(-1577156759, new bp.u(14, onChangeFolder), sVar), sVar, 196608, 22);
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iv.s0(i11, 2, onChangeFolder, rVar2);
        }
    }

    public static final void b(x8 x8Var, List list, fz.c cVar, fz.c cVar2, fz.c cVar3, z1.r rVar, l1.n nVar, int i11) {
        int i12;
        fz.c cVar4;
        fz.c cVar5;
        fz.c cVar6;
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-636543281);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.d(x8Var.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(list) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            cVar4 = cVar;
            i12 |= sVar2.h(cVar4) ? 256 : 128;
        } else {
            cVar4 = cVar;
        }
        if ((i11 & 3072) == 0) {
            cVar5 = cVar2;
            i12 |= sVar2.h(cVar5) ? 2048 : 1024;
        } else {
            cVar5 = cVar2;
        }
        if ((i11 & 24576) == 0) {
            cVar6 = cVar3;
            i12 |= sVar2.h(cVar6) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        } else {
            cVar6 = cVar3;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.f(rVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if (sVar2.T(i12 & 1, (74899 & i12) != 74898)) {
            z1.r rVarH = d0.n.h(rVar, ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p, r0.f.d(12));
            boolean zH = ((i12 & 14) == 4) | sVar2.h(list) | ((i12 & 896) == 256) | ((i12 & 7168) == 2048) | ((i12 & 57344) == 16384);
            Object objQ = sVar2.Q();
            if (zH || objQ == l1.m.f39353a) {
                b1.a aVar = new b1.a(list, (Object) x8Var, cVar4, (Object) cVar5, (Object) cVar6, 17);
                sVar2.o0(aVar);
                objQ = aVar;
            }
            sVar = sVar2;
            ue.f.a(rVarH, null, null, null, null, null, false, null, (fz.c) objQ, sVar, 0, 510);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.d(x8Var, (Object) list, cVar, cVar2, (qy.e) cVar3, (Object) rVar, i11, 6);
        }
    }

    public static final void c(c cVar, rt.p pVar, fz.a aVar, fz.c cVar2, l1.n nVar, int i11) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1809948738);
        int i12 = i11 | (sVar2.f(cVar) ? 4 : 2) | (sVar2.f(pVar) ? 32 : 16) | (sVar2.h(aVar) ? 256 : 128) | (sVar2.h(cVar2) ? 2048 : 1024);
        if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
            boolean z11 = (i12 & 14) == 4;
            Object objQ = sVar2.Q();
            String strM = null;
            if (z11 || objQ == l1.m.f39353a) {
                b bVar = cVar instanceof b ? (b) cVar : null;
                String str = bVar != null ? bVar.f41266b : null;
                if (str == null) {
                    str = BuildConfig.VERSION_NAME;
                }
                objQ = l1.t.B(str);
                sVar2.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            if (kotlin.jvm.internal.m.a(pVar, rt.l.f50001a)) {
                strM = ep.a.m(sVar2, 101031959, R.string.bookmark_folder_name_empty_error, sVar2, false);
            } else if (kotlin.jvm.internal.m.a(pVar, rt.m.f50041a)) {
                sVar2.d0(101035564);
                strM = ub.a.d0(R.string.bookmark_folder_name_too_long_error, new Object[]{40}, sVar2);
                sVar2.p(false);
            } else if (kotlin.jvm.internal.m.a(pVar, rt.k.f49954a)) {
                strM = ep.a.m(sVar2, 101040859, R.string.bookmark_folder_name_duplicate_error, sVar2, false);
            } else {
                sVar2.d0(-1162625057);
                sVar2.p(false);
            }
            sVar = sVar2;
            k7.a(aVar, t1.e.d(-263835642, new iv.f1(cVar2, b1Var, 2), sVar2), null, t1.e.d(-984755064, new lt.g(aVar, 3, (byte) 0), sVar2), t1.e.d(-1705674486, new ch.b0(cVar, 29), sVar2), t1.e.d(-2066134197, new f(strM, b1Var, 1), sVar2), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, ((i12 >> 6) & 14) | 1772592, 16276);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.t(cVar, pVar, aVar, cVar2, i11, 16);
        }
    }

    public static final void d(rt.p pVar, fz.a aVar, fz.c cVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar;
        String strM;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1603312200);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar2.f(pVar) : sVar2.h(pVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(cVar) ? 256 : 128;
        }
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            Object objQ = sVar2.Q();
            if (objQ == l1.m.f39353a) {
                objQ = l1.t.B(BuildConfig.VERSION_NAME);
                sVar2.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            if (kotlin.jvm.internal.m.a(pVar, rt.l.f50001a)) {
                strM = ep.a.m(sVar2, 1110245041, R.string.bookmark_folder_name_empty_error, sVar2, false);
            } else if (kotlin.jvm.internal.m.a(pVar, rt.m.f50041a)) {
                sVar2.d0(1110248646);
                strM = ub.a.d0(R.string.bookmark_folder_name_too_long_error, new Object[]{40}, sVar2);
                sVar2.p(false);
            } else if (kotlin.jvm.internal.m.a(pVar, rt.k.f49954a)) {
                strM = ep.a.m(sVar2, 1110253941, R.string.bookmark_folder_name_duplicate_error, sVar2, false);
            } else {
                sVar2.d0(58209413);
                sVar2.p(false);
                strM = null;
            }
            byte b3 = 0;
            sVar = sVar2;
            k7.a(aVar, t1.e.d(318618112, new iv.f1(cVar, b1Var, 1), sVar2), null, t1.e.d(967210882, new lt.g(aVar, 2, b3), sVar2), f41427f, t1.e.d(-207383611, new f(strM, b1Var, b3), sVar2), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, ((i12 >> 3) & 14) | 1772592, 16276);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(pVar, aVar, cVar, i11, 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x023b  */
    /* JADX WARN: Code duplicated, block: B:74:0x023d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0250  */
    /* JADX WARN: Code duplicated, block: B:78:0x0252  */
    /* JADX WARN: Code duplicated, block: B:82:0x025b  */
    public static final void e(List list, String str, float f5, Set set, fz.a aVar, fz.a aVar2, fz.c cVar, l1.n nVar, int i11) {
        l1.b1 b1Var;
        l1.g gVar;
        boolean z11;
        boolean z12;
        Object objQ;
        Object next;
        List list2 = list;
        Set set2 = set;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1165903035);
        int i12 = i11 | (sVar.h(list2) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.c(f5) ? 256 : 128) | (sVar.h(set2) ? 2048 : 1024) | (sVar.h(cVar) ? 1048576 : 524288);
        if (sVar.T(i12 & 1, (i12 & 599187) != 599186)) {
            Object objQ2 = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ2 == gVar2) {
                Iterator it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((rt.r) next).f50321d);
                rt.r rVar = (rt.r) next;
                objQ2 = l1.t.B(rVar != null ? rVar.f50318a : null);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            boolean zH = sVar.h(set2) | sVar.h(list2);
            Object objQ3 = sVar.Q();
            if (zH || objQ3 == gVar2) {
                ad.x xVar = new ad.x(set, aVar, list2, b1Var2, null, 17);
                b1Var = b1Var2;
                set2 = set;
                list2 = list2;
                sVar.o0(xVar);
                objQ3 = xVar;
            } else {
                b1Var = b1Var2;
            }
            l1.t.g(list2, set2, (fz.e) objQ3, sVar);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarB = j0.c.B(j0.c.v(j0.e2.i(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, f5, 1)), 20, 8);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarB);
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
            float f11 = 12;
            ua.b(ub.a.e0(sVar, R.string.bookmark_folder_add_to_folder_title), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f11, 7), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar.j(fc.f30256a)).f30175h, 0L, 0L, n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777211), sVar, 48, 0, 65532);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.i1 i1Var = new j0.i1(1.0f, false);
            boolean zH2 = sVar.h(list2) | ((i12 & 112) == 32);
            Object objQ4 = sVar.Q();
            if (zH2) {
                gVar = gVar2;
            } else {
                gVar = gVar2;
                if (objQ4 == gVar) {
                }
                ue.f.a(i1Var, null, null, null, null, null, false, null, (fz.c) objQ4, sVar, 0, 510);
                k7.m(aVar2, j0.e2.e(oVar, 1.0f), false, null, null, null, f41419b, sVar, 805306422, 508);
                j0.c.g(sVar, j0.e2.g(oVar, 4));
                if (((String) b1Var.getValue()) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z1.r rVarC2 = j0.c.C(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, f11, 1);
                if ((i12 & 3670016) == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objQ = sVar.Q();
                if (z12 || objQ == gVar) {
                    objQ = new bp.q(b1Var, cVar, 7);
                    sVar.o0(objQ);
                }
                iu.k.e((fz.a) objQ, rVarC2, z11, 0L, null, f41421c, sVar, 196656, 24);
                sVar = sVar;
                sVar.p(true);
            }
            objQ4 = new fu.j0(list2, str, b1Var, 18);
            sVar.o0(objQ4);
            ue.f.a(i1Var, null, null, null, null, null, false, null, (fz.c) objQ4, sVar, 0, 510);
            k7.m(aVar2, j0.e2.e(oVar, 1.0f), false, null, null, null, f41419b, sVar, 805306422, 508);
            j0.c.g(sVar, j0.e2.g(oVar, 4));
            if (((String) b1Var.getValue()) != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            z1.r rVarC3 = j0.c.C(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, f11, 1);
            if ((i12 & 3670016) == 1048576) {
                z12 = true;
            } else {
                z12 = false;
            }
            objQ = sVar.Q();
            if (z12) {
                objQ = new bp.q(b1Var, cVar, 7);
                sVar.o0(objQ);
            } else {
                objQ = new bp.q(b1Var, cVar, 7);
                sVar.o0(objQ);
            }
            iu.k.e((fz.a) objQ, rVarC3, z11, 0L, null, f41421c, sVar, 196656, 24);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new gr.g(list2, str, f5, set2, aVar, aVar2, cVar, i11);
        }
    }

    public static final void f(String str, String str2, boolean z11, fz.a aVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-807021624);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.f(str2) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.h(aVar) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarO = d0.n.o(j0.e2.g(j0.e2.e(oVar, 1.0f), 70), false, null, aVar, 15);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarO);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, a2VarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            z1.r rVarN = j0.e2.n(oVar, 38);
            l1.c3 c3Var = h1.v1.f31180a;
            z1.r rVarH = d0.n.h(rVarN, ((h1.s1) sVar.j(c3Var)).f31021c, r0.f.f48733a);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarH);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            h1.r4.b(se.k.y(R.drawable.ic_bookmark_folder_outline, sVar, 0), null, j0.e2.n(oVar, 20), ((h1.s1) sVar.j(c3Var)).f31017a, sVar, 432, 0);
            sVar.p(true);
            j0.c.g(sVar, j0.e2.s(oVar, 14));
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.i1 i1Var = new j0.i1(1.0f, true);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, i1Var);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            ua.b(str, null, ((h1.s1) sVar.j(c3Var)).f31034q, fr.j3.A(16), null, n3.s.H, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, (i12 & 14) | 199680, 0, 131026);
            j0.c.g(sVar, j0.e2.g(oVar, 2));
            ua.b(str2, null, ((h1.s1) sVar.j(c3Var)).f31036s, fr.j3.A(12), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, ((i12 >> 3) & 14) | 3072, 0, 131058);
            sVar = sVar;
            sVar.p(true);
            i7.a(z11, aVar, null, false, null, sVar, (i12 >> 6) & 126, 60);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.d(str, str2, z11, aVar, i11, 8);
        }
    }

    public static final void g(final List list, rt.p pVar, final String str, fz.c cVar, final fz.c cVar2, fz.a aVar, fz.a aVar2, l1.n nVar, int i11) {
        int i12;
        fz.a aVar3;
        rt.p pVar2;
        Object xVar;
        l1.g gVar;
        final l1.b1 b1Var;
        fz.c cVar3;
        int i13;
        l1.b1 b1Var2;
        boolean z11;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1340017866);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar.f(pVar) : sVar.h(pVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(str) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(cVar2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(aVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.h(aVar2) ? 1048576 : 524288;
        }
        if (sVar.T(i12 & 1, (599187 & i12) != 599186)) {
            Object objQ = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ == gVar2) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            l1.b1 b1Var3 = (l1.b1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar2) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var4 = (l1.b1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar2) {
                objQ3 = l1.t.B(null);
                sVar.o0(objQ3);
            }
            final l1.b1 b1Var5 = (l1.b1) objQ3;
            final float f5 = (((Configuration) sVar.j(AndroidCompositionLocals_androidKt.f1199a)).screenHeightDp * 0.9f) - 48;
            int i14 = 3670016 & i12;
            boolean z12 = i14 == 1048576;
            int i15 = i12;
            Object objQ4 = sVar.Q();
            if (z12 || objQ4 == gVar2) {
                objQ4 = new fs.h(aVar2, null, 2);
                sVar.o0(objQ4);
            }
            l1.t.f((fz.e) objQ4, qy.b0.f48488a, sVar);
            Boolean bool = (Boolean) b1Var4.getValue();
            bool.getClass();
            boolean z13 = ((i15 & 112) == 32 || ((i15 & 64) != 0 && sVar.h(pVar))) | (i14 == 1048576);
            Object objQ5 = sVar.Q();
            if (z13 || objQ5 == gVar2) {
                gVar = gVar2;
                b1Var = b1Var3;
                cVar3 = null;
                i13 = 1048576;
                xVar = new ad.x(pVar, aVar2, b1Var4, b1Var, null, 18);
                pVar2 = pVar;
                aVar3 = aVar2;
                b1Var2 = b1Var4;
                sVar.o0(xVar);
            } else {
                b1Var2 = b1Var4;
                gVar = gVar2;
                cVar3 = null;
                i13 = 1048576;
                aVar3 = aVar2;
                pVar2 = pVar;
                xVar = objQ5;
                b1Var = b1Var3;
            }
            int i16 = (i15 >> 3) & 14;
            l1.t.g(pVar2, bool, (fz.e) xVar, sVar);
            l1.b1 b1Var6 = b1Var2;
            int i17 = i13;
            h1.a6.a(aVar, null, h1.a6.f(6, 2, cVar3, sVar), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, new k9.q(13), null, t1.e.d(397205395, new fz.f() { // from class: mt.d
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    j0.v ModalBottomSheet = (j0.v) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        l1.b1 b1Var7 = b1Var5;
                        Set set = (Set) b1Var7.getValue();
                        Object objQ6 = sVar2.Q();
                        l1.g gVar3 = l1.m.f39353a;
                        if (objQ6 == gVar3) {
                            objQ6 = new jt.i0(21, b1Var7);
                            sVar2.o0(objQ6);
                        }
                        fz.a aVar4 = (fz.a) objQ6;
                        Object objQ7 = sVar2.Q();
                        if (objQ7 == gVar3) {
                            objQ7 = new jt.i0(22, b1Var);
                            sVar2.o0(objQ7);
                        }
                        g.e(list, str, f5, set, aVar4, (fz.a) objQ7, cVar2, sVar2, 221184);
                    } else {
                        sVar2.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar), sVar, (i15 >> 15) & 14, 384, 3066);
            sVar = sVar;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.d0(1250391461);
                boolean z14 = i14 == i17;
                Object objQ6 = sVar.Q();
                l1.g gVar3 = gVar;
                if (z14 || objQ6 == gVar3) {
                    objQ6 = new kt.d(3, aVar3, b1Var6, b1Var);
                    sVar.o0(objQ6);
                }
                fz.a aVar4 = (fz.a) objQ6;
                boolean zH = sVar.h(list) | ((i15 & 7168) == 2048);
                Object objQ7 = sVar.Q();
                if (zH || objQ7 == gVar3) {
                    z11 = false;
                    b0.a aVar5 = new b0.a(22, cVar, list, b1Var6, b1Var5);
                    sVar.o0(aVar5);
                    objQ7 = aVar5;
                } else {
                    z11 = false;
                }
                d(pVar2, aVar4, (fz.c) objQ7, sVar, i16);
            } else {
                z11 = false;
                sVar.d0(1244060300);
            }
            sVar.p(z11);
        } else {
            aVar3 = aVar2;
            pVar2 = pVar;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e(list, pVar2, str, cVar, cVar2, aVar, aVar3, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0149  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:62:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:70:0x026d  */
    /* JADX WARN: Code duplicated, block: B:72:0x028f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0295  */
    /* JADX WARN: Code duplicated, block: B:78:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:81:0x02be  */
    /* JADX WARN: Code duplicated, block: B:82:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x0328  */
    public static final void h(String str, String str2, boolean z11, fz.a aVar, fz.a aVar2, fz.a aVar3, l1.n nVar, int i11) {
        fz.a aVar4;
        int i12;
        y2.h hVar;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        Object objQ;
        l1.b1 b1Var;
        Object objQ2;
        fz.a aVar5 = aVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-306367286);
        int i13 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.f(str2) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.h(aVar) ? 2048 : 1024) | (sVar.h(aVar5) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(aVar3) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar.T(i13 & 1, (74899 & i13) != 74898)) {
            Object objQ3 = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ3);
            }
            l1.b1 b1Var2 = (l1.b1) objQ3;
            z1.o oVar = z1.o.f58481a;
            float f5 = 16;
            z1.r rVarD = j0.c.D(d0.n.o(j0.e2.e(oVar, 1.0f), false, null, aVar, 15), f5, f5, 8, f5);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode4 = Long.hashCode(sVar.T);
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
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, a2VarA, sVar);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S) {
                i12 = i13;
            } else {
                i12 = i13;
                if (!kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                }
                hVar = y2.j.f56915d;
                l1.t.J(hVar, rVarC, sVar);
                z1.r rVarN = j0.e2.n(oVar, 38);
                l1.c3 c3Var = h1.v1.f31180a;
                z1.r rVarH = d0.n.h(rVarN, ((h1.s1) sVar.j(c3Var)).f31021c, r0.f.f48733a);
                w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarH);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar2, q0VarD, sVar);
                l1.t.J(hVar3, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                }
                l1.t.J(hVar, rVarC2, sVar);
                h1.r4.b(se.k.y(R.drawable.ic_bookmark_folder_outline, sVar, 0), null, j0.e2.n(oVar, 20), ((h1.s1) sVar.j(c3Var)).f31017a, sVar, 432, 0);
                sVar.p(true);
                j0.c.g(sVar, j0.e2.s(oVar, 14));
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                j0.i1 i1Var = new j0.i1(1.0f, true);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                iHashCode2 = Long.hashCode(sVar.T);
                l1.q1 q1VarL3 = sVar.l();
                z1.r rVarC3 = z1.a.c(sVar, i1Var);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar2, uVarA, sVar);
                l1.t.J(hVar3, q1VarL3, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
                }
                l1.t.J(hVar, rVarC3, sVar);
                ua.b(str, null, ((h1.s1) sVar.j(c3Var)).f31034q, fr.j3.A(16), null, n3.s.H, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, (i12 & 14) | 199680, 0, 131026);
                j0.c.g(sVar, j0.e2.g(oVar, 2));
                ua.b(str2, null, ((h1.s1) sVar.j(c3Var)).f31036s, fr.j3.A(12), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, ((i12 >> 3) & 14) | 3072, 0, 131058);
                sVar = sVar;
                sVar.p(true);
                if (z11) {
                    sVar.d0(427786065);
                    w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                    iHashCode3 = Long.hashCode(sVar.T);
                    l1.q1 q1VarL4 = sVar.l();
                    z1.r rVarC4 = z1.a.c(sVar, oVar);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar2, q0VarD2, sVar);
                    l1.t.J(hVar3, q1VarL4, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
                    }
                    l1.t.J(hVar, rVarC4, sVar);
                    objQ = sVar.Q();
                    if (objQ == gVar) {
                        b1Var = b1Var2;
                        objQ = new jt.i0(28, b1Var);
                        sVar.o0(objQ);
                    } else {
                        b1Var = b1Var2;
                    }
                    k7.h((fz.a) objQ, null, false, null, f41446p, sVar, 196614, 30);
                    boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                    objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new q(0, b1Var);
                        sVar.o0(objQ2);
                    }
                    aVar5 = aVar2;
                    aVar4 = aVar3;
                    h1.s.a(zBooleanValue, (fz.a) objQ2, null, 0L, null, null, null, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, t1.e.d(837243168, new defpackage.d(aVar5, aVar4, b1Var), sVar), sVar, 48);
                    sVar = sVar;
                    sVar.p(true);
                    sVar.p(false);
                } else {
                    aVar5 = aVar2;
                    aVar4 = aVar3;
                    sVar.d0(428819388);
                    j0.c.g(sVar, j0.e2.s(oVar, 48));
                    sVar.p(false);
                }
                sVar.p(true);
            }
            defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar4);
            hVar = y2.j.f56915d;
            l1.t.J(hVar, rVarC, sVar);
            z1.r rVarN2 = j0.e2.n(oVar, 38);
            l1.c3 c3Var2 = h1.v1.f31180a;
            z1.r rVarH2 = d0.n.h(rVarN2, ((h1.s1) sVar.j(c3Var2)).f31021c, r0.f.f48733a);
            w2.q0 q0VarD3 = j0.o.d(z1.c.f58467e, false);
            iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL5 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarH2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, q0VarD3, sVar);
            l1.t.J(hVar3, q1VarL5, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            l1.t.J(hVar, rVarC5, sVar);
            h1.r4.b(se.k.y(R.drawable.ic_bookmark_folder_outline, sVar, 0), null, j0.e2.n(oVar, 20), ((h1.s1) sVar.j(c3Var2)).f31017a, sVar, 432, 0);
            sVar.p(true);
            j0.c.g(sVar, j0.e2.s(oVar, 14));
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.i1 i1Var2 = new j0.i1(1.0f, true);
            j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL6 = sVar.l();
            z1.r rVarC6 = z1.a.c(sVar, i1Var2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, uVarA2, sVar);
            l1.t.J(hVar3, q1VarL6, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            } else {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            }
            l1.t.J(hVar, rVarC6, sVar);
            ua.b(str, null, ((h1.s1) sVar.j(c3Var2)).f31034q, fr.j3.A(16), null, n3.s.H, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, (i12 & 14) | 199680, 0, 131026);
            j0.c.g(sVar, j0.e2.g(oVar, 2));
            ua.b(str2, null, ((h1.s1) sVar.j(c3Var2)).f31036s, fr.j3.A(12), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, ((i12 >> 3) & 14) | 3072, 0, 131058);
            sVar = sVar;
            sVar.p(true);
            if (z11) {
                sVar.d0(427786065);
                w2.q0 q0VarD4 = j0.o.d(z1.c.f58463a, false);
                iHashCode3 = Long.hashCode(sVar.T);
                l1.q1 q1VarL7 = sVar.l();
                z1.r rVarC7 = z1.a.c(sVar, oVar);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar2, q0VarD4, sVar);
                l1.t.J(hVar3, q1VarL7, sVar);
                if (sVar.S) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
                } else {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
                }
                l1.t.J(hVar, rVarC7, sVar);
                objQ = sVar.Q();
                if (objQ == gVar) {
                    b1Var = b1Var2;
                    objQ = new jt.i0(28, b1Var);
                    sVar.o0(objQ);
                } else {
                    b1Var = b1Var2;
                }
                k7.h((fz.a) objQ, null, false, null, f41446p, sVar, 196614, 30);
                boolean zBooleanValue2 = ((Boolean) b1Var.getValue()).booleanValue();
                objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = new q(0, b1Var);
                    sVar.o0(objQ2);
                }
                aVar5 = aVar2;
                aVar4 = aVar3;
                h1.s.a(zBooleanValue2, (fz.a) objQ2, null, 0L, null, null, null, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, t1.e.d(837243168, new defpackage.d(aVar5, aVar4, b1Var), sVar), sVar, 48);
                sVar = sVar;
                sVar.p(true);
                sVar.p(false);
            } else {
                aVar5 = aVar2;
                aVar4 = aVar3;
                sVar.d0(428819388);
                j0.c.g(sVar, j0.e2.s(oVar, 48));
                sVar.p(false);
            }
            sVar.p(true);
        } else {
            aVar4 = aVar3;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.q1(str, str2, z11, aVar, aVar5, aVar4, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:113:0x0208  */
    /* JADX WARN: Code duplicated, block: B:117:0x021b  */
    /* JADX WARN: Code duplicated, block: B:121:0x022a  */
    public static final void i(Object obj, List folders, rt.p operationResult, boolean z11, String str, fz.e onCreateFolder, fz.e onAddToFolder, fz.a onDismiss, fz.c onShowDefaultHint, fz.a onClearOperationResult, l1.n nVar, int i11, int i12) {
        String str2;
        int i13;
        l1.s sVar;
        String str3;
        Object xVar;
        l1.g gVar;
        boolean z12;
        boolean z13;
        boolean zH;
        Object objQ;
        boolean zH2;
        Object objQ2;
        String str4;
        boolean z14;
        Object obj2 = obj;
        kotlin.jvm.internal.m.f(folders, "folders");
        kotlin.jvm.internal.m.f(operationResult, "operationResult");
        kotlin.jvm.internal.m.f(onCreateFolder, "onCreateFolder");
        kotlin.jvm.internal.m.f(onAddToFolder, "onAddToFolder");
        kotlin.jvm.internal.m.f(onDismiss, "onDismiss");
        kotlin.jvm.internal.m.f(onShowDefaultHint, "onShowDefaultHint");
        kotlin.jvm.internal.m.f(onClearOperationResult, "onClearOperationResult");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1795932788);
        int i14 = i11 | (sVar2.f(obj2) ? 4 : 2) | (sVar2.h(folders) ? 32 : 16) | (sVar2.f(operationResult) ? 256 : 128) | (sVar2.g(z11) ? 2048 : 1024);
        int i15 = i12 & 16;
        if (i15 != 0) {
            i13 = i14 | 24576;
            str2 = str;
        } else {
            str2 = str;
            i13 = i14 | (sVar2.f(str2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        }
        int i16 = i13 | (sVar2.h(onCreateFolder) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if ((i11 & 1572864) == 0) {
            i16 |= sVar2.h(onAddToFolder) ? 1048576 : 524288;
        }
        if ((i11 & 805306368) == 0) {
            i16 |= sVar2.h(onClearOperationResult) ? 536870912 : 268435456;
        }
        if (sVar2.T(i16 & 1, (i16 & 306783379) != 306783378)) {
            String str5 = i15 != 0 ? null : str2;
            Context context = (Context) sVar2.j(AndroidCompositionLocals_androidKt.f1200b);
            Object objQ3 = sVar2.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ3 == gVar2) {
                objQ3 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ3);
            }
            l1.b1 b1Var = (l1.b1) objQ3;
            Boolean bool = (Boolean) b1Var.getValue();
            bool.getClass();
            boolean zH3 = ((1879048192 & i16) == 536870912) | ((i16 & 896) == 256) | sVar2.h(context);
            Object objQ4 = sVar2.Q();
            if (zH3 || objQ4 == gVar2) {
                gVar = gVar2;
                z12 = true;
                xVar = new ad.x(operationResult, context, onClearOperationResult, b1Var, null, 19);
                sVar2.o0(xVar);
            } else {
                xVar = objQ4;
                gVar = gVar2;
                z12 = true;
            }
            int i17 = i16 >> 6;
            l1.t.g(operationResult, bool, (fz.e) xVar, sVar2);
            if (obj2 == null) {
                sVar2.d0(227026971);
                sVar2.p(false);
                sVar = sVar2;
                str4 = str5;
            } else {
                boolean z15 = false;
                sVar2.d0(227026972);
                List listK = (z11 && folders.isEmpty()) ? ns.o.K(new rt.r(0, "__default_bookmark_folder__", BuildConfig.VERSION_NAME, z12)) : folders;
                if (z11) {
                    sVar = sVar2;
                    l1.g gVar3 = gVar;
                    sVar.d0(1973911951);
                    if ((458752 & i16) == 131072) {
                        z13 = z12;
                    } else {
                        z13 = false;
                    }
                    zH = z13 | sVar.h(obj2);
                    objQ = sVar.Q();
                    if (zH || objQ == gVar3) {
                        objQ = new j9.h(19, onCreateFolder, obj2);
                        sVar.o0(objQ);
                    }
                    fz.c cVar = (fz.c) objQ;
                    if ((i16 & 3670016) != 1048576) {
                        z12 = false;
                    }
                    zH2 = z12 | sVar.h(obj2);
                    objQ2 = sVar.Q();
                    if (zH2 || objQ2 == gVar3) {
                        b0.a aVar = new b0.a(onDismiss, onAddToFolder, obj2, b1Var, 21);
                        sVar.o0(aVar);
                        objQ2 = aVar;
                    }
                    int i18 = ((i16 >> 3) & 112) | (i17 & 896) | 196608 | ((i16 >> 9) & 3670016);
                    str4 = str5;
                    z15 = false;
                    g(listK, operationResult, str4, cVar, (fz.c) objQ2, onDismiss, onClearOperationResult, sVar, i18);
                    sVar.p(false);
                } else {
                    if (!folders.isEmpty()) {
                        Iterator it = folders.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!((rt.r) it.next()).f50321d) {
                                    sVar = sVar2;
                                    l1.g gVar4 = gVar;
                                    sVar.d0(1973911951);
                                    if ((458752 & i16) == 131072) {
                                        z13 = z12;
                                    } else {
                                        z13 = false;
                                    }
                                    zH = z13 | sVar.h(obj2);
                                    objQ = sVar.Q();
                                    if (zH) {
                                        objQ = new j9.h(19, onCreateFolder, obj2);
                                        sVar.o0(objQ);
                                    } else {
                                        objQ = new j9.h(19, onCreateFolder, obj2);
                                        sVar.o0(objQ);
                                    }
                                    fz.c cVar2 = (fz.c) objQ;
                                    if ((i16 & 3670016) != 1048576) {
                                        z12 = false;
                                    }
                                    zH2 = z12 | sVar.h(obj2);
                                    objQ2 = sVar.Q();
                                    if (zH2) {
                                        b0.a aVar2 = new b0.a(onDismiss, onAddToFolder, obj2, b1Var, 21);
                                        sVar.o0(aVar2);
                                        objQ2 = aVar2;
                                    } else {
                                        b0.a aVar3 = new b0.a(onDismiss, onAddToFolder, obj2, b1Var, 21);
                                        sVar.o0(aVar3);
                                        objQ2 = aVar3;
                                    }
                                    int i19 = ((i16 >> 3) & 112) | (i17 & 896) | 196608 | ((i16 >> 9) & 3670016);
                                    str4 = str5;
                                    z15 = false;
                                    g(listK, operationResult, str4, cVar2, (fz.c) objQ2, onDismiss, onClearOperationResult, sVar, i19);
                                    sVar.p(false);
                                }
                            }
                        }
                    }
                    if (folders.isEmpty()) {
                        sVar = sVar2;
                        sVar.d0(1969999007);
                        sVar.p(false);
                    } else {
                        sVar2.d0(1974488644);
                        boolean zH4 = sVar2.h(obj2) | ((i16 & 3670016) == 1048576 ? z12 : false);
                        Object objQ5 = sVar2.Q();
                        if (zH4 || objQ5 == gVar) {
                            sVar = sVar2;
                            z14 = false;
                            ad.x xVar2 = new ad.x(onAddToFolder, obj2, onShowDefaultHint, onDismiss, null, 20);
                            obj2 = obj2;
                            sVar.o0(xVar2);
                            objQ5 = xVar2;
                        } else {
                            sVar = sVar2;
                            z14 = false;
                        }
                        l1.t.f((fz.e) objQ5, obj2, sVar);
                        sVar.p(z14);
                        z15 = z14;
                    }
                    str4 = str5;
                }
                sVar.p(z15);
            }
            str3 = str4;
        } else {
            sVar = sVar2;
            sVar.W();
            str3 = str2;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m0.g(obj, folders, operationResult, z11, str3, onCreateFolder, onAddToFolder, onDismiss, onShowDefaultHint, onClearOperationResult, i11, i12);
        }
    }

    public static final void j(int i11, int i12, int i13, fz.a aVar, l1.n nVar) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(663249187);
        int i14 = (sVar.d(i12) ? 32 : 16) | i13;
        if (sVar.T(i14 & 1, (i14 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            float f5 = 8;
            z1.r rVarC = j0.c.C(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, f5, 1);
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new jr.m(25, aVar);
                sVar.o0(objQ);
            }
            z1.r rVarO = d0.n.o(rVarC, false, null, (fz.a) objQ, 15);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarO);
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
            boolean z11 = i11 == i12;
            l1.c3 c3Var = h1.v1.f31180a;
            long j11 = ((h1.s1) sVar.j(c3Var)).f31017a;
            long j12 = g2.x.f28622i;
            h1.s1 s1Var = (h1.s1) sVar.j(c3Var);
            h7 h7Var = s1Var.W;
            if (h7Var == null) {
                h7 h7Var2 = new h7(h1.v1.c(s1Var, k1.a0.f37435d), h1.v1.c(s1Var, k1.a0.f37437f), g2.x.c(h1.v1.c(s1Var, k1.a0.f37432a), 0.38f), g2.x.c(h1.v1.c(s1Var, k1.a0.f37433b), 0.38f));
                s1Var.W = h7Var2;
                h7Var = h7Var2;
            }
            if (j11 == 16) {
                j11 = h7Var.f30339a;
            }
            long j13 = j11;
            long j14 = j12 != 16 ? j12 : h7Var.f30340b;
            long j15 = j12 != 16 ? j12 : h7Var.f30341c;
            if (j12 == 16) {
                j12 = h7Var.f30342d;
            }
            i7.a(z11, aVar, null, false, new h7(j13, j14, j15, j12), sVar, 48, 44);
            j0.c.g(sVar, j0.e2.s(oVar, f5));
            ua.b(String.valueOf(i11), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30175h, sVar, 0, 0, 65534);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new jr.p(i11, i12, aVar, i13);
        }
    }

    public static final void k(int i11, int i12, fz.a onClick, String title, l1.n nVar, z1.r rVar, boolean z11, boolean z12) {
        long j11;
        boolean z13;
        long j12;
        long j13;
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-832815288);
        int i13 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.f(title) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.g(z12) ? 2048 : 1024) | (sVar.f(rVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i13 & 1, (74899 & i13) != 74898)) {
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
            String strValueOf = String.valueOf(i11);
            j3.y0 y0Var = (j3.y0) sVar.j(ua.f31167a);
            if (z12) {
                sVar.d0(-1486555803);
                j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31017a;
            } else {
                sVar.d0(-1486554546);
                j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s;
            }
            sVar.p(false);
            ua.b(strValueOf, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, j11, fr.j3.A(14), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 0, 0, 65534);
            z1.o oVar = z1.o.f58481a;
            if (z12) {
                sVar.d0(1161612082);
                z1.r rVarE = j0.e2.e(oVar, 1.0f);
                l1.c3 c3Var = h1.v1.f31180a;
                d0.v vVarA = d0.n.a(((h1.s1) sVar.j(c3Var)).f31017a, 2);
                j0.v1 v1Var = h1.j0.f30447a;
                if (z11) {
                    sVar.d0(-1486538875);
                    j12 = ((h1.s1) sVar.j(c3Var)).f31017a;
                    z13 = false;
                    sVar.p(false);
                } else {
                    z13 = false;
                    sVar.d0(-1486538263);
                    sVar.p(false);
                    j12 = g2.x.f28622i;
                }
                if (z11) {
                    sVar.d0(-1486535385);
                    j13 = ((h1.s1) sVar.j(c3Var)).f31019b;
                    sVar.p(z13);
                } else {
                    sVar.d0(-1486534711);
                    sVar.p(z13);
                    j13 = g2.x.f28622i;
                }
                k7.i(onClick, rVarE, true, null, h1.j0.f(j12, j13, sVar, 12), vVarA, null, t1.e.d(97568011, new bp.a0(title, 12), sVar), sVar, 805306806, 424);
                sVar = sVar;
                sVar.p(z13);
            } else {
                sVar.d0(1162194541);
                z1.r rVarE2 = j0.e2.e(oVar, 1.0f);
                Object objQ = sVar.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = new ju.d(25);
                    sVar.o0(objQ);
                }
                k7.b((fz.a) objQ, rVarE2, false, null, null, null, null, null, t1.e.d(1446592338, new bp.a0(title, 13), sVar), sVar, 805306806, 504);
                sVar = sVar;
                sVar.p(false);
            }
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new l(i11, title, z11, z12, rVar, onClick, i12);
        }
    }

    public static final void l(CourseACK ack, fz.a onClickBilling, fz.e updateFavStatus, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(ack, "ack");
        kotlin.jvm.internal.m.f(onClickBilling, "onClickBilling");
        kotlin.jvm.internal.m.f(updateFavStatus, "updateFavStatus");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-2116861115);
        int i12 = 16;
        int i13 = i11 | (sVar.h(ack) ? 4 : 2) | (sVar.h(onClickBilling) ? 32 : 16) | (sVar.h(updateFavStatus) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar);
                sVar.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            int i14 = g2.g0.f28567b;
            g2.c0 c0Var = (g2.c0) sVar.j(z2.g1.f58546g);
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new g2.d0(c0Var);
                sVar.o0(objQ2);
            }
            j2.c cVar = ((g2.d0) objQ2).f28544b;
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            z1.r rVarA = j0.c.A(z1.o.f58481a, 16);
            boolean zH = sVar.h(cVar);
            Object objQ3 = sVar.Q();
            if (zH || objQ3 == gVar) {
                objQ3 = new kp.j(cVar, i12);
                sVar.o0(objQ3);
            }
            k7.d(d2.h.f(rVarA, (fz.c) objQ3), null, null, null, null, t1.e.d(512595255, new es.h(ack, b0Var, cVar, context, updateFavStatus, onClickBilling), sVar), sVar, 196608, 30);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fp.e((Object) ack, onClickBilling, (Object) updateFavStatus, i11, 19);
        }
    }

    public static final void m(List items, o0.b bVar, z1.r rVar, fz.a onClickBilling, fz.e updateFavStatus, l1.n nVar, int i11) {
        int i12;
        z1.r rVar2;
        l1.s sVar;
        kotlin.jvm.internal.m.f(items, "items");
        kotlin.jvm.internal.m.f(onClickBilling, "onClickBilling");
        kotlin.jvm.internal.m.f(updateFavStatus, "updateFavStatus");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-405017061);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(items) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(bVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            rVar2 = rVar;
            i12 |= sVar2.f(rVar2) ? 256 : 128;
        } else {
            rVar2 = rVar;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(onClickBilling) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(updateFavStatus) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar2.T(i12 & 1, (i12 & 9363) != 9362)) {
            sVar = sVar2;
            ve.i.d(bVar, rVar2, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-508338212, new bp.b2(items, onClickBilling, updateFavStatus, 6), sVar2), sVar, (i12 >> 3) & 126, 16380);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.e2(items, bVar, rVar, onClickBilling, updateFavStatus, i11, 7);
        }
    }

    public static final void n(fz.a onBackClick, fz.a onClickBilling, rt.y yVar, l1.n nVar, int i11) {
        rt.y yVar2;
        int i12;
        rt.y yVar3;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onClickBilling, "onClickBilling");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-116057230);
        int i13 = i11 | (sVar.h(onBackClick) ? 4 : 2) | (sVar.h(onClickBilling) ? 32 : 16) | 128;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(rt.y.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                rt.y yVar4 = (rt.y) viewModelA;
                i12 = i13 & (-897);
                yVar3 = yVar4;
            } else {
                sVar.W();
                i12 = i13 & (-897);
                yVar3 = yVar;
            }
            sVar.q();
            rt.x xVar = (rt.x) l1.t.o(yVar3.f50668d, sVar).getValue();
            boolean zH = sVar.h(yVar3);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new ch.b0(yVar3, 28);
                sVar.o0(objQ);
            }
            o(xVar, onBackClick, (fz.e) objQ, onClickBilling, sVar, ((i12 << 3) & 112) | ((i12 << 6) & 7168));
            yVar2 = yVar3;
        } else {
            sVar.W();
            yVar2 = yVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fp.e(onBackClick, onClickBilling, (ViewModel) yVar2, i11, 20);
        }
    }

    public static final void o(rt.x uiState, fz.a onBackClick, fz.e updateFavStatus, fz.a onClickBilling, l1.n nVar, int i11) {
        int i12;
        int i13;
        o0.b bVar;
        o0.b bVar2;
        l1.b1 b1Var;
        l1.a1 a1Var;
        boolean z11;
        y2.i iVar;
        y2.h hVar;
        l1.b1 b1Var2;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(updateFavStatus, "updateFavStatus");
        kotlin.jvm.internal.m.f(onClickBilling, "onClickBilling");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1689006842);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar.f(uiState) : sVar.h(uiState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onBackClick) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(updateFavStatus) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(onClickBilling) ? 2048 : 1024;
        }
        if (!sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            sVar.W();
        } else if (uiState.equals(rt.v.f50518a)) {
            sVar.d0(362071477);
            tv.a.d(0, 1, sVar, null);
            sVar.p(false);
        } else {
            if (!(uiState instanceof rt.w)) {
                throw nv.p.x(sVar, 362075403, false);
            }
            sVar.d0(-1660460791);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(oVar);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, uVarA, sVar);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar);
                sVar.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                i13 = 0;
                objQ2 = ep.a.r(0, sVar);
            } else {
                i13 = 0;
            }
            l1.b1 b1Var3 = (l1.b1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = defpackage.e.v(i13, sVar);
            }
            l1.a1 a1Var2 = (l1.a1) objQ3;
            int iIntValue = ((Number) b1Var3.getValue()).intValue();
            rt.w wVar = (rt.w) uiState;
            int i14 = i12;
            List list = wVar.f50561d;
            List list2 = wVar.f50560c;
            ArrayList arrayList = wVar.f50558a;
            ArrayList arrayList2 = wVar.f50559b;
            boolean zD = sVar.d(iIntValue) | sVar.f(arrayList) | sVar.f(arrayList2);
            Object objQ4 = sVar.Q();
            if (zD || objQ4 == gVar) {
                objQ4 = ((Number) b1Var3.getValue()).intValue() == 0 ? l1.t.B(arrayList) : l1.t.B(arrayList2);
                sVar.o0(objQ4);
            }
            l1.b1 b1Var4 = (l1.b1) objQ4;
            boolean zD2 = sVar.d(((Number) b1Var3.getValue()).intValue()) | sVar.f(list2) | sVar.f(list);
            Object objQ5 = sVar.Q();
            if (zD2 || objQ5 == gVar) {
                objQ5 = ((Number) b1Var3.getValue()).intValue() == 0 ? l1.t.B(list2) : l1.t.B(list);
                sVar.o0(objQ5);
            }
            l1.b1 b1Var5 = (l1.b1) objQ5;
            boolean z12 = (i14 & 14) == 4 || ((i14 & 8) != 0 && sVar.h(uiState));
            Object objQ6 = sVar.Q();
            if (z12 || objQ6 == gVar) {
                objQ6 = new iv.h0(18, uiState, b1Var3, null);
                sVar.o0(objQ6);
            }
            l1.t.f((fz.e) objQ6, arrayList2, sVar);
            Object objQ7 = sVar.Q();
            if (objQ7 == gVar) {
                objQ7 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ7);
            }
            l1.b1 b1Var6 = (l1.b1) objQ7;
            Object objQ8 = sVar.Q();
            if (objQ8 == gVar) {
                objQ8 = l1.t.B(BuildConfig.VERSION_NAME);
                sVar.o0(objQ8);
            }
            l1.b1 b1Var7 = (l1.b1) objQ8;
            boolean zF = sVar.f(b1Var4);
            Object objQ9 = sVar.Q();
            if (zF || objQ9 == gVar) {
                objQ9 = new jt.i0(27, b1Var4);
                sVar.o0(objQ9);
            }
            o0.b bVarB = o0.w.b(0, 0, 3, (fz.a) objQ9, sVar);
            Integer numValueOf = Integer.valueOf(bVarB.k());
            boolean zF2 = sVar.f(bVarB) | sVar.f(b1Var4);
            Object objQ10 = sVar.Q();
            if (zF2 || objQ10 == gVar) {
                objQ10 = new ad.x(bVarB, a1Var2, b1Var4, b1Var7, null, 21);
                bVar = bVarB;
                sVar.o0(objQ10);
            } else {
                bVar = bVarB;
            }
            l1.t.f((fz.e) objQ10, numValueOf, sVar);
            if (((Boolean) b1Var6.getValue()).booleanValue()) {
                sVar.d0(-968446625);
                List list3 = (List) b1Var5.getValue();
                String str = (String) b1Var7.getValue();
                boolean zH = sVar.h(b0Var) | sVar.f(r22) | sVar.f(bVar);
                Object objQ11 = sVar.Q();
                if (zH || objQ11 == gVar) {
                    o0.b bVar3 = bVar;
                    objQ11 = new b1.a(b0Var, b1Var7, b1Var6, bVar3, r22, 16);
                    bVar2 = bVar3;
                    b1Var = r22;
                    sVar.o0(objQ11);
                } else {
                    bVar2 = bVar;
                    b1Var = b1Var4;
                }
                fz.c cVar = (fz.c) objQ11;
                Object objQ12 = sVar.Q();
                if (objQ12 == gVar) {
                    objQ12 = new jt.i0(23, b1Var6);
                    sVar.o0(objQ12);
                }
                a1Var = a1Var2;
                p(3072, (fz.a) objQ12, cVar, str, list3, sVar);
                sVar = sVar;
                z11 = false;
            } else {
                bVar2 = bVar;
                b1Var = r22;
                a1Var = a1Var2;
                z11 = false;
                sVar.d0(-975220621);
            }
            sVar.p(z11);
            l1.s sVar2 = sVar;
            l1.b1 b1Var8 = b1Var;
            iu.k.g(onBackClick, null, f41431h, null, t1.e.d(-49650576, new defpackage.d(b1Var6, a1Var, b1Var, 10), sVar), null, null, null, sVar2, ((i14 >> 3) & 14) | 24960, 234);
            if (!(((double) 1.0f) > 0.0d)) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.i1 i1Var = new j0.i1(1.0f, true);
            z1.j jVar = z1.c.f58463a;
            boolean z13 = false;
            w2.q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, i1Var);
            sVar2.h0();
            if (sVar2.S) {
                iVar = iVar2;
                sVar2.k(iVar);
            } else {
                iVar = iVar2;
                sVar2.r0();
            }
            l1.t.J(hVar2, q0VarD, sVar2);
            l1.t.J(r29, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                hVar = hVar4;
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
            } else {
                hVar = hVar4;
            }
            l1.t.J(r27, rVarC2, sVar2);
            y2.h hVar6 = hVar;
            m((List) b1Var8.getValue(), bVar2, j0.e2.d(oVar, 1.0f), onClickBilling, updateFavStatus, sVar2, ((i14 << 6) & 57344) | (i14 & 7168) | 384);
            sVar = sVar2;
            sVar.p(true);
            w2.q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, q0VarD2, sVar);
            l1.t.J(r29, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar6);
            }
            l1.t.J(r27, rVarC3, sVar);
            float f5 = 16;
            j0.g gVarG = j0.i.g(f5);
            z1.r rVarB = j0.c.B(oVar, f5, f5);
            j0.a2 a2VarA = j0.z1.a(gVarG, z1.c.L, sVar, 6);
            int iHashCode4 = Long.hashCode(sVar.T);
            l1.q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarB);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, a2VarA, sVar);
            l1.t.J(hVar3, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar6);
            }
            l1.t.J(hVar5, rVarC4, sVar);
            int size = arrayList.size();
            String strE0 = ub.a.e0(sVar, R.string.all);
            if (((Number) b1Var3.getValue()).intValue() == 0) {
                z13 = true;
            }
            boolean z14 = !arrayList.isEmpty();
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.i1 i1Var2 = new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            Object objQ13 = sVar.Q();
            if (objQ13 == gVar) {
                b1Var2 = b1Var3;
                objQ13 = new jt.i0(24, b1Var2);
                sVar.o0(objQ13);
            } else {
                b1Var2 = b1Var3;
            }
            k(size, 196608, (fz.a) objQ13, strE0, sVar, i1Var2, z13, z14);
            int size2 = arrayList2.size();
            String strE1 = ub.a.e0(sVar, R.string.favorite);
            boolean z15 = ((Number) b1Var2.getValue()).intValue() == 1 ? true : z13;
            boolean z16 = !arrayList2.isEmpty();
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.i1 i1Var3 = new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            Object objQ14 = sVar.Q();
            if (objQ14 == gVar) {
                objQ14 = new jt.i0(25, b1Var2);
                sVar.o0(objQ14);
            }
            k(size2, 196608, (fz.a) objQ14, strE1, sVar, i1Var3, z15, z16);
            sVar.p(true);
            sVar.p(true);
            sVar.p(true);
            sVar.p(false);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a((Object) uiState, onBackClick, (qy.e) updateFavStatus, (qy.e) onClickBilling, i11, 7);
        }
    }

    public static final void p(int i11, fz.a onDismissRequest, fz.c selectUnitName, String currentDisplayUnitName, List unitNames, l1.n nVar) {
        l1.s sVar;
        l0.w wVar;
        kotlin.jvm.internal.m.f(unitNames, "unitNames");
        kotlin.jvm.internal.m.f(currentDisplayUnitName, "currentDisplayUnitName");
        kotlin.jvm.internal.m.f(selectUnitName, "selectUnitName");
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-500796175);
        int i12 = i11 | (sVar2.h(unitNames) ? 4 : 2) | (sVar2.f(currentDisplayUnitName) ? 32 : 16) | (sVar2.h(selectUnitName) ? 256 : 128);
        if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar2);
                sVar2.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            e8 e8VarF = h1.a6.f(6, 2, null, sVar2);
            l0.w wVarA = l0.y.a(0, sVar2, 3);
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = defpackage.e.v(0, sVar2);
            }
            l1.a1 a1Var = (l1.a1) objQ2;
            boolean zH = sVar2.h(unitNames) | ((i12 & 112) == 32) | sVar2.f(wVarA);
            Object objQ3 = sVar2.Q();
            if (zH || objQ3 == gVar) {
                wVar = wVarA;
                jr.i0 i0Var = new jr.i0(unitNames, currentDisplayUnitName, wVar, a1Var, (vy.d) null);
                sVar2.o0(i0Var);
                objQ3 = i0Var;
            } else {
                wVar = wVarA;
            }
            l1.t.f((fz.e) objQ3, qy.b0.f48488a, sVar2);
            sVar = sVar2;
            h1.a6.a(onDismissRequest, null, e8VarF, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(342905524, new ei.l(wVar, unitNames, currentDisplayUnitName, selectUnitName, b0Var, e8VarF, onDismissRequest, 2), sVar2), sVar, 6, 384, 4090);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.t(unitNames, currentDisplayUnitName, selectUnitName, onDismissRequest, i11);
        }
    }

    public static final void r(x8 reviewType, rt.e0 e0Var, fz.a onBackClick, fz.c onSelectFolder, l1.n nVar, int i11) {
        rt.e0 e0Var2;
        int i12;
        final rt.e0 e0Var3;
        kotlin.jvm.internal.m.f(reviewType, "reviewType");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onSelectFolder, "onSelectFolder");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1504085099);
        int i13 = i11 | (sVar.d(reviewType.ordinal()) ? 4 : 2) | 16 | (sVar.h(onBackClick) ? 256 : 128) | (sVar.h(onSelectFolder) ? 2048 : 1024);
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            sVar.Y();
            int i14 = i11 & 1;
            l1.g gVar = l1.m.f39353a;
            if (i14 == 0 || sVar.C()) {
                boolean z11 = (i13 & 14) == 4;
                Object objQ = sVar.Q();
                if (z11 || objQ == gVar) {
                    objQ = new lt.e(reviewType, 2);
                    sVar.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(rt.e0.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), aVar);
                sVar.p(false);
                i12 = i13 & (-113);
                e0Var3 = (rt.e0) viewModelA;
            } else {
                sVar.W();
                i12 = i13 & (-113);
                e0Var3 = e0Var;
            }
            sVar.q();
            rt.b0 b0Var = (rt.b0) l1.t.o(e0Var3.f49663f, sVar).getValue();
            boolean z12 = (i12 & 7168) == 2048;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new b0.o1(onSelectFolder, 14);
                sVar.o0(objQ2);
            }
            fz.c cVar = (fz.c) objQ2;
            boolean zH = sVar.h(e0Var3);
            Object objQ3 = sVar.Q();
            if (zH || objQ3 == gVar) {
                final int i15 = 1;
                objQ3 = new fz.c() { // from class: mt.o
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        int i16 = i15;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        vy.d dVar = null;
                        rt.e0 e0Var4 = e0Var3;
                        String it = (String) obj;
                        switch (i16) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                rz.b0 viewModelScope = ViewModelKt.getViewModelScope(e0Var4);
                                yz.f fVar = rz.o0.f50940a;
                                rz.e0.B(viewModelScope, yz.e.f58387a, null, new rt.d0(e0Var4, it, dVar, 1), 2);
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "it");
                                rz.e0.B(ViewModelKt.getViewModelScope(e0Var4), null, null, new rt.d0(e0Var4, it, dVar, 0), 3);
                                break;
                        }
                        return b0Var2;
                    }
                };
                sVar.o0(objQ3);
            }
            fz.c cVar2 = (fz.c) objQ3;
            boolean zH2 = sVar.h(e0Var3);
            Object objQ4 = sVar.Q();
            if (zH2 || objQ4 == gVar) {
                objQ4 = new r(e0Var3, 0);
                sVar.o0(objQ4);
            }
            fz.e eVar = (fz.e) objQ4;
            boolean zH3 = sVar.h(e0Var3);
            Object objQ5 = sVar.Q();
            if (zH3 || objQ5 == gVar) {
                final int i16 = 0;
                objQ5 = new fz.c() { // from class: mt.o
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        int i17 = i16;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        vy.d dVar = null;
                        rt.e0 e0Var4 = e0Var3;
                        String it = (String) obj;
                        switch (i17) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                rz.b0 viewModelScope = ViewModelKt.getViewModelScope(e0Var4);
                                yz.f fVar = rz.o0.f50940a;
                                rz.e0.B(viewModelScope, yz.e.f58387a, null, new rt.d0(e0Var4, it, dVar, 1), 2);
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "it");
                                rz.e0.B(ViewModelKt.getViewModelScope(e0Var4), null, null, new rt.d0(e0Var4, it, dVar, 0), 3);
                                break;
                        }
                        return b0Var2;
                    }
                };
                sVar.o0(objQ5);
            }
            fz.c cVar3 = (fz.c) objQ5;
            boolean zH4 = sVar.h(e0Var3);
            Object objQ6 = sVar.Q();
            if (zH4 || objQ6 == gVar) {
                objQ6 = new lt.e(e0Var3, 1);
                sVar.o0(objQ6);
            }
            s(b0Var, reviewType, cVar, cVar2, eVar, cVar3, (fz.a) objQ6, onBackClick, sVar, ((i12 << 15) & 29360128) | ((i12 << 3) & 112));
            e0Var2 = e0Var3;
        } else {
            sVar.W();
            e0Var2 = e0Var;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.t(reviewType, e0Var2, onBackClick, onSelectFolder, i11, 15);
        }
    }

    public static final void s(rt.b0 uiState, x8 reviewType, fz.c onSelectFolder, fz.c onCreateFolder, fz.e onRenameFolder, fz.c cVar, fz.a onClearOperationResult, fz.a onBackClick, l1.n nVar, int i11) {
        int i12;
        l1.s sVar;
        Object xVar;
        int i13;
        l1.g gVar;
        int i14;
        boolean z11;
        l1.b1 b1Var;
        fz.c onDeleteFolder = cVar;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        kotlin.jvm.internal.m.f(reviewType, "reviewType");
        kotlin.jvm.internal.m.f(onSelectFolder, "onSelectFolder");
        kotlin.jvm.internal.m.f(onCreateFolder, "onCreateFolder");
        kotlin.jvm.internal.m.f(onRenameFolder, "onRenameFolder");
        kotlin.jvm.internal.m.f(onDeleteFolder, "onDeleteFolder");
        kotlin.jvm.internal.m.f(onClearOperationResult, "onClearOperationResult");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(996001855);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(uiState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.d(reviewType.ordinal()) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(onSelectFolder) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(onCreateFolder) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(onRenameFolder) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(onDeleteFolder) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.h(onClearOperationResult) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i12 |= sVar2.h(onBackClick) ? 8388608 : 4194304;
        }
        if (sVar2.T(i12 & 1, (4793491 & i12) != 4793490)) {
            Object objQ = sVar2.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ == gVar2) {
                objQ = l1.t.B(null);
                sVar2.o0(objQ);
            }
            l1.b1 b1Var2 = (l1.b1) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar2) {
                objQ2 = l1.t.B(null);
                sVar2.o0(objQ2);
            }
            l1.b1 b1Var3 = (l1.b1) objQ2;
            rt.p pVar = uiState.f49473b;
            int i15 = i12 & 3670016;
            boolean zH = sVar2.h(uiState) | (i15 == 1048576);
            Object objQ3 = sVar2.Q();
            if (zH || objQ3 == gVar2) {
                i13 = i12;
                gVar = gVar2;
                i14 = i15;
                xVar = new ad.x(uiState, onClearOperationResult, b1Var2, b1Var3, null, 22);
                sVar2.o0(xVar);
            } else {
                i13 = i12;
                gVar = gVar2;
                i14 = i15;
                xVar = objQ3;
            }
            l1.t.f((fz.e) xVar, pVar, sVar2);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarH = d0.n.h(j0.e2.d(oVar, 1.0f), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31031n, g2.f0.f28556b);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarH);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
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
            int i16 = i13;
            iu.k.g(onBackClick, null, f41435j, null, t1.e.d(-1080775382, new bt.g5(4, b1Var2), sVar2), null, null, null, sVar2, ((i16 >> 21) & 14) | 24960, 234);
            sVar = sVar2;
            List list = uiState.f49472a;
            Object objQ4 = sVar.Q();
            l1.g gVar3 = gVar;
            if (objQ4 == gVar3) {
                objQ4 = new bp.h0(29, b1Var2);
                sVar.o0(objQ4);
            }
            fz.c cVar2 = (fz.c) objQ4;
            Object objQ5 = sVar.Q();
            if (objQ5 == gVar3) {
                objQ5 = new p(0, b1Var3);
                sVar.o0(objQ5);
            }
            b(reviewType, list, onSelectFolder, cVar2, (fz.c) objQ5, j0.c.E(j0.c.C(j0.e2.e(oVar, 1.0f), 12, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, ((i16 >> 3) & 14) | 224256 | (i16 & 896));
            sVar.p(true);
            c cVar3 = (c) b1Var2.getValue();
            if (cVar3 == null) {
                sVar.d0(-2035410910);
                z11 = false;
            } else {
                z11 = false;
                sVar.d0(-2035410909);
                rt.p pVar2 = uiState.f49473b;
                boolean z12 = i14 == 1048576;
                Object objQ6 = sVar.Q();
                if (z12 || objQ6 == gVar3) {
                    objQ6 = new fu.e(5, onClearOperationResult, b1Var2);
                    sVar.o0(objQ6);
                }
                fz.a aVar = (fz.a) objQ6;
                boolean zH2 = sVar.h(cVar3) | ((i16 & 7168) == 2048) | ((57344 & i16) == 16384);
                Object objQ7 = sVar.Q();
                if (zH2 || objQ7 == gVar3) {
                    objQ7 = new fu.j0(cVar3, onCreateFolder, onRenameFolder, 19);
                    sVar.o0(objQ7);
                }
                c(cVar3, pVar2, aVar, (fz.c) objQ7, sVar, 0);
                sVar = sVar;
            }
            sVar.p(z11);
            rt.r rVar = (rt.r) b1Var3.getValue();
            if (rVar == null) {
                sVar.d0(-2034835953);
                sVar.p(z11);
                onDeleteFolder = cVar;
            } else {
                sVar.d0(-2034835952);
                Object objQ8 = sVar.Q();
                if (objQ8 == gVar3) {
                    b1Var = b1Var3;
                    objQ8 = new jt.i0(29, b1Var);
                    sVar.o0(objQ8);
                } else {
                    b1Var = b1Var3;
                }
                onDeleteFolder = cVar;
                k7.a((fz.a) objQ8, t1.e.d(1615695411, new fp.e(onDeleteFolder, rVar, b1Var, 21), sVar), null, t1.e.d(1503787189, new bp.s(b1Var, 5, (byte) 0), sVar), f41442n, f41444o, null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772598, 16276);
                sVar.p(z11);
            }
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.m1(uiState, reviewType, onSelectFolder, onCreateFolder, onRenameFolder, onDeleteFolder, onClearOperationResult, onBackClick, i11);
        }
    }

    public static final void t(int i11, fz.c onStartClick, fz.a onBackClick, fz.a onExplainClick, rt.z0 z0Var, l1.n nVar, int i12) {
        rt.z0 z0Var2;
        int i13;
        final rt.z0 z0Var3;
        kotlin.jvm.internal.m.f(onStartClick, "onStartClick");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onExplainClick, "onExplainClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1943879756);
        int i14 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.h(onBackClick) ? 256 : 128) | (sVar.h(onExplainClick) ? 2048 : 1024) | OSSConstants.DEFAULT_BUFFER_SIZE;
        if (sVar.T(i14 & 1, (i14 & 9363) != 9362)) {
            sVar.Y();
            if ((i12 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(rt.z0.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i13 = i14 & (-57345);
                z0Var3 = (rt.z0) viewModelA;
            } else {
                sVar.W();
                i13 = i14 & (-57345);
                z0Var3 = z0Var;
            }
            sVar.q();
            rt.y0 y0Var = (rt.y0) l1.t.o(z0Var3.f50742t, sVar).getValue();
            boolean zH = sVar.h(z0Var3);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                final int i15 = 0;
                objQ = new fz.c() { // from class: mt.t
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                z0Var3.a(new rt.u0(((Integer) obj).intValue()));
                                break;
                            case 1:
                                String it = (String) obj;
                                kotlin.jvm.internal.m.f(it, "it");
                                z0Var3.a(new rt.p0(it));
                                break;
                            default:
                                List it2 = (List) obj;
                                kotlin.jvm.internal.m.f(it2, "it");
                                z0Var3.a(new rt.o0(it2));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar.o0(objQ);
            }
            fz.c cVar = (fz.c) objQ;
            boolean zH2 = sVar.h(z0Var3);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                final int i16 = 1;
                objQ2 = new fz.c() { // from class: mt.t
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                z0Var3.a(new rt.u0(((Integer) obj).intValue()));
                                break;
                            case 1:
                                String it = (String) obj;
                                kotlin.jvm.internal.m.f(it, "it");
                                z0Var3.a(new rt.p0(it));
                                break;
                            default:
                                List it2 = (List) obj;
                                kotlin.jvm.internal.m.f(it2, "it");
                                z0Var3.a(new rt.o0(it2));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar.o0(objQ2);
            }
            fz.c cVar2 = (fz.c) objQ2;
            boolean zH3 = sVar.h(z0Var3);
            Object objQ3 = sVar.Q();
            if (zH3 || objQ3 == gVar) {
                final int i17 = 2;
                objQ3 = new fz.c() { // from class: mt.t
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i17) {
                            case 0:
                                z0Var3.a(new rt.u0(((Integer) obj).intValue()));
                                break;
                            case 1:
                                String it = (String) obj;
                                kotlin.jvm.internal.m.f(it, "it");
                                z0Var3.a(new rt.p0(it));
                                break;
                            default:
                                List it2 = (List) obj;
                                kotlin.jvm.internal.m.f(it2, "it");
                                z0Var3.a(new rt.o0(it2));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar.o0(objQ3);
            }
            fz.c cVar3 = (fz.c) objQ3;
            boolean zH4 = sVar.h(z0Var3);
            Object objQ4 = sVar.Q();
            if (zH4 || objQ4 == gVar) {
                final int i18 = 0;
                objQ4 = new fz.a() { // from class: mt.w
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                z0Var3.a(rt.r0.f50322a);
                                break;
                            case 1:
                                z0Var3.a(rt.t0.f50399a);
                                break;
                            case 2:
                                z0Var3.a(rt.q0.f50259a);
                                break;
                            default:
                                z0Var3.a(rt.s0.f50355a);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar.o0(objQ4);
            }
            fz.a aVar = (fz.a) objQ4;
            boolean zH5 = sVar.h(z0Var3);
            Object objQ5 = sVar.Q();
            if (zH5 || objQ5 == gVar) {
                final int i19 = 1;
                objQ5 = new fz.a() { // from class: mt.w
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                z0Var3.a(rt.r0.f50322a);
                                break;
                            case 1:
                                z0Var3.a(rt.t0.f50399a);
                                break;
                            case 2:
                                z0Var3.a(rt.q0.f50259a);
                                break;
                            default:
                                z0Var3.a(rt.s0.f50355a);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar.o0(objQ5);
            }
            fz.a aVar2 = (fz.a) objQ5;
            boolean zH6 = sVar.h(z0Var3);
            Object objQ6 = sVar.Q();
            if (zH6 || objQ6 == gVar) {
                final int i21 = 2;
                objQ6 = new fz.a() { // from class: mt.w
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i21) {
                            case 0:
                                z0Var3.a(rt.r0.f50322a);
                                break;
                            case 1:
                                z0Var3.a(rt.t0.f50399a);
                                break;
                            case 2:
                                z0Var3.a(rt.q0.f50259a);
                                break;
                            default:
                                z0Var3.a(rt.s0.f50355a);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar.o0(objQ6);
            }
            fz.a aVar3 = (fz.a) objQ6;
            boolean zH7 = sVar.h(z0Var3);
            int i22 = i13;
            Object objQ7 = sVar.Q();
            if (zH7 || objQ7 == gVar) {
                final int i23 = 3;
                objQ7 = new fz.a() { // from class: mt.w
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i23) {
                            case 0:
                                z0Var3.a(rt.r0.f50322a);
                                break;
                            case 1:
                                z0Var3.a(rt.t0.f50399a);
                                break;
                            case 2:
                                z0Var3.a(rt.q0.f50259a);
                                break;
                            default:
                                z0Var3.a(rt.s0.f50355a);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar.o0(objQ7);
            }
            u(y0Var, i11, cVar, cVar2, cVar3, aVar, aVar2, aVar3, (fz.a) objQ7, onStartClick, onBackClick, onExplainClick, sVar, 805306368 | ((i22 << 3) & 112), (i22 >> 6) & 126);
            z0Var2 = z0Var3;
        } else {
            sVar.W();
            z0Var2 = z0Var;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a(i11, onStartClick, onBackClick, onExplainClick, z0Var2, i12, 8);
        }
    }

    public static final void u(rt.y0 uiState, int i11, fz.c updatePracticeCount, fz.c updateFocUnits, fz.c updateFocTypes, fz.a updateFocusNew, fz.a updateFocusWeak, fz.a updateFocusGood, fz.a updateFocusPerfect, fz.c onStartClick, fz.a onBackClick, fz.a onClickExplain, l1.n nVar, int i12, int i13) {
        int i14;
        int i15;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        kotlin.jvm.internal.m.f(updatePracticeCount, "updatePracticeCount");
        kotlin.jvm.internal.m.f(updateFocUnits, "updateFocUnits");
        kotlin.jvm.internal.m.f(updateFocTypes, "updateFocTypes");
        kotlin.jvm.internal.m.f(updateFocusNew, "updateFocusNew");
        kotlin.jvm.internal.m.f(updateFocusWeak, "updateFocusWeak");
        kotlin.jvm.internal.m.f(updateFocusGood, "updateFocusGood");
        kotlin.jvm.internal.m.f(updateFocusPerfect, "updateFocusPerfect");
        kotlin.jvm.internal.m.f(onStartClick, "onStartClick");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onClickExplain, "onClickExplain");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(25859029);
        if ((i12 & 6) == 0) {
            i14 = ((i12 & 8) == 0 ? sVar.f(uiState) : sVar.h(uiState) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar.d(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= sVar.h(updatePracticeCount) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= sVar.h(updateFocUnits) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= sVar.h(updateFocTypes) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i12) == 0) {
            i14 |= sVar.h(updateFocusNew) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i12) == 0) {
            i14 |= sVar.h(updateFocusWeak) ? 1048576 : 524288;
        }
        if ((12582912 & i12) == 0) {
            i14 |= sVar.h(updateFocusGood) ? 8388608 : 4194304;
        }
        if ((100663296 & i12) == 0) {
            i14 |= sVar.h(updateFocusPerfect) ? 67108864 : 33554432;
        }
        if ((805306368 & i12) == 0) {
            i14 |= sVar.h(onStartClick) ? 536870912 : 268435456;
        }
        if ((i13 & 6) == 0) {
            i15 = i13 | (sVar.h(onBackClick) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= sVar.h(onClickExplain) ? 32 : 16;
        }
        int i16 = i14;
        if (!sVar.T(i16 & 1, ((i14 & 306783379) == 306783378 && (i15 & 19) == 18) ? false : true)) {
            sVar.W();
        } else if (uiState.equals(rt.w0.f50562a)) {
            sVar.d0(-919257756);
            tv.a.d(0, 1, sVar, null);
            sVar.p(false);
        } else {
            if (!(uiState instanceof rt.x0)) {
                throw nv.p.x(sVar, -919259484, false);
            }
            sVar.d0(1567880644);
            y((rt.x0) uiState, i11, updatePracticeCount, updateFocUnits, updateFocTypes, updateFocusNew, updateFocusWeak, updateFocusGood, updateFocusPerfect, onStartClick, onBackClick, onClickExplain, sVar, i16 & 2147483632, i15 & 126);
            sVar.p(false);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v(uiState, i11, updatePracticeCount, updateFocUnits, updateFocTypes, updateFocusNew, updateFocusWeak, updateFocusGood, updateFocusPerfect, onStartClick, onBackClick, onClickExplain, i12, i13, 1);
        }
    }

    public static final void v(int i11, int i12, fz.a aVar, l1.n nVar) {
        fz.a aVar2;
        int i13;
        fz.a aVar3;
        y2.i iVar;
        y2.h hVar;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1372779995);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i13 = i11 | (sVar.h(aVar2) ? 4 : 2);
        }
        if (sVar.T(i13 & 1, (i13 & 3) != 2)) {
            if (i14 != 0) {
                Object objQ = sVar.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = new ju.d(25);
                    sVar.o0(objQ);
                }
                aVar3 = (fz.a) objQ;
            } else {
                aVar3 = aVar2;
            }
            j0.d dVar = j0.i.f35305c;
            z1.h hVar2 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar2, sVar, 0);
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
            y2.h hVar3 = y2.j.f56917f;
            l1.t.J(hVar3, uVarA, sVar);
            y2.h hVar4 = y2.j.f56916e;
            l1.t.J(hVar4, q1VarL, sVar);
            y2.h hVar5 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar5);
            }
            y2.h hVar6 = y2.j.f56915d;
            l1.t.J(hVar6, rVarC, sVar);
            iu.k.g(aVar3, null, I, null, null, null, null, null, sVar, (i13 & 14) | 384, 250);
            fz.a aVar4 = aVar3;
            float f5 = 6;
            j0.c.g(sVar, j0.e2.g(oVar, f5));
            z1.r rVarY = d0.n.y(j0.c.C(d0.n.h(j0.e2.d(j0.c.v(oVar), 1.0f), ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p, g2.f0.f28556b), 24, CropImageView.DEFAULT_ASPECT_RATIO, 2), d0.n.u(sVar), false, 14);
            j0.u uVarA2 = j0.t.a(dVar, hVar2, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                iVar = iVar2;
                sVar.k(iVar);
            } else {
                iVar = iVar2;
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA2, sVar);
            l1.t.J(hVar4, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                hVar = hVar5;
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar);
            } else {
                hVar = hVar5;
            }
            l1.t.J(hVar6, rVarC2, sVar);
            j0.u uVarA3 = j0.t.a(dVar, hVar2, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA3, sVar);
            l1.t.J(hVar4, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar);
            }
            l1.t.J(hVar6, rVarC3, sVar);
            float f11 = 32;
            z(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, 6);
            z1.r rVarC4 = j0.c.C(j0.c.C(j0.c.q(j0.e2.e(oVar, 1.0f), j0.e1.Min), CropImageView.DEFAULT_ASPECT_RATIO, 8, 1), 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.a2 a2VarA = j0.z1.a(j0.i.g(f5), z1.c.M, sVar, 54);
            int iHashCode4 = Long.hashCode(sVar.T);
            l1.q1 q1VarL4 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarC4);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA, sVar);
            l1.t.J(hVar4, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar);
            }
            l1.t.J(hVar6, rVarC5, sVar);
            j0.c2 c2Var = j0.c2.f35266a;
            j0.c.g(sVar, c2Var.a(oVar, 0.35f));
            String strE0 = ub.a.e0(sVar, R.string.srs_fading);
            l1.d0 d0Var = ua.f31167a;
            j3.y0 y0Var = (j3.y0) sVar.j(d0Var);
            long jE = g2.f0.e(4294921036L);
            n3.s sVar2 = n3.s.H;
            iu.k.c(strE0, c2Var.a(oVar, 1.0f), j3.y0.a(y0Var, jE, 0L, sVar2, null, null, 0L, null, null, 3, 0, 0L, null, 16744442), 0, false, 1, 0, s0.x0.a(fr.j3.A(8), fr.j3.A(12)), sVar, 1572864, 184);
            iu.k.c(ub.a.e0(sVar, R.string.srs_reinforcing), c2Var.a(oVar, 2.0f), j3.y0.a((j3.y0) sVar.j(d0Var), g2.f0.e(4285768278L), 0L, sVar2, null, null, 0L, null, null, 3, 0, 0L, null, 16744442), 0, false, 1, 0, s0.x0.a(fr.j3.A(8), fr.j3.A(12)), sVar, 1572864, 184);
            iu.k.c(ub.a.e0(sVar, R.string.srs_mastered), c2Var.a(oVar, 1.0f), j3.y0.a((j3.y0) sVar.j(d0Var), g2.f0.e(4279417706L), 0L, sVar2, null, null, 0L, null, null, 3, 0, 0L, null, 16744442), 0, false, 1, 0, s0.x0.a(fr.j3.A(8), fr.j3.A(12)), sVar, 1572864, 184);
            j0.c.g(sVar, c2Var.a(oVar, 0.15f));
            sVar.p(true);
            sVar.p(true);
            ua.b(oz.x.q0(ub.a.e0(sVar, R.string.srs_explain_content), "\n ", "\n"), j0.c.C(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f11, 1), 0L, fr.j3.A(14), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 3120, 0, 131060);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
            aVar2 = aVar4;
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.m(i11, i12, aVar2);
        }
    }

    public static final void w(final int i11, final fz.a onFinish, final fz.c loginNow, final boolean z11, final fz.a aVar, rt.b1 b1Var, l1.n nVar, final int i12) {
        final rt.b1 b1Var2;
        l1.x1 x1VarT;
        fz.e eVar;
        rt.b1 b1Var3;
        int i13;
        kotlin.jvm.internal.m.f(onFinish, "onFinish");
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(460676700);
        int i14 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.h(onFinish) ? 32 : 16) | (sVar.h(loginNow) ? 256 : 128) | (sVar.g(z11) ? 2048 : 1024) | (sVar.h(aVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | 65536;
        if (sVar.T(i14 & 1, (74899 & i14) != 74898)) {
            sVar.Y();
            if ((i12 & 1) == 0 || sVar.C()) {
                boolean z12 = (i14 & 14) == 4;
                Object objQ = sVar.Q();
                if (z12 || objQ == l1.m.f39353a) {
                    objQ = new fu.x(i11, 5);
                    sVar.o0(objQ);
                }
                fz.a aVar2 = (fz.a) objQ;
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(rt.b1.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), aVar2);
                sVar.p(false);
                b1Var3 = (rt.b1) viewModelA;
                i13 = i14 & (-458753);
            } else {
                sVar.W();
                i13 = i14 & (-458753);
                b1Var3 = b1Var;
            }
            sVar.q();
            l1.b1 b1VarO = l1.t.o(b1Var3.f49476c, sVar);
            if (((Number) b1VarO.getValue()).intValue() == -1) {
                sVar.d0(1599524664);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
                x1VarT = sVar.t();
                if (x1VarT == null) {
                    return;
                }
                final int i15 = 0;
                final rt.b1 b1Var4 = b1Var3;
                eVar = new fz.e(i11, onFinish, loginNow, z11, aVar, b1Var4, i12, i15) { // from class: mt.a0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f41223a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f41224b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ fz.a f41225c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ fz.c f41226d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ boolean f41227e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ fz.a f41228f;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public final /* synthetic */ rt.b1 f41229t;

                    {
                        this.f41223a = i15;
                    }

                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f41223a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iM = l1.t.M(1);
                                g.w(this.f41224b, this.f41225c, this.f41226d, this.f41227e, this.f41228f, this.f41229t, (l1.n) obj, iM);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iM2 = l1.t.M(1);
                                g.w(this.f41224b, this.f41225c, this.f41226d, this.f41227e, this.f41228f, this.f41229t, (l1.n) obj, iM2);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
            } else {
                sVar.d0(1597686054);
                sVar.p(false);
                int i16 = i13;
                int i17 = ((i16 << 3) & 7168) | 100663302 | ((i16 << 9) & 57344);
                int i18 = i16 << 6;
                ys.a.a(CoursePracticeType.COURSE_REVIEW_FLASHCARD, null, null, loginNow, onFinish, z11, aVar, null, t1.e.d(579998677, new bt.g5(5, b1VarO), sVar), sVar, i17 | (458752 & i18) | (i18 & 3670016), 134);
                b1Var2 = b1Var3;
            }
            x1VarT.f39502d = eVar;
        }
        sVar.W();
        b1Var2 = b1Var;
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i19 = 1;
            eVar = new fz.e(i11, onFinish, loginNow, z11, aVar, b1Var2, i12, i19) { // from class: mt.a0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f41223a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f41224b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ fz.a f41225c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ fz.c f41226d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f41227e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ fz.a f41228f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ rt.b1 f41229t;

                {
                    this.f41223a = i19;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f41223a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iM = l1.t.M(1);
                            g.w(this.f41224b, this.f41225c, this.f41226d, this.f41227e, this.f41228f, this.f41229t, (l1.n) obj, iM);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iM2 = l1.t.M(1);
                            g.w(this.f41224b, this.f41225c, this.f41226d, this.f41227e, this.f41228f, this.f41229t, (l1.n) obj, iM2);
                            break;
                    }
                    return qy.b0.f48488a;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }

    public static final void x(int i11, int i12, fz.a onFinishClick, l1.n nVar) {
        kotlin.jvm.internal.m.f(onFinishClick, "onFinishClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-529625708);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.h(onFinishClick) ? 32 : 16);
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            long j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31031n;
            g2.r0 r0Var = g2.f0.f28556b;
            z1.o oVar = z1.o.f58481a;
            float f5 = 16;
            z1.r rVarA = j0.c.A(j0.c.v(j0.c.F(j0.e2.d(d0.n.h(oVar, j11, r0Var), 1.0f))), f5);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
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
            j0.c.g(sVar, j0.e2.g(oVar, 56));
            z1.r rVarE = j0.e2.e(oVar, 1.0f);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarE);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            tv.a.b(i11, sVar, i13 & 14);
            sVar.p(true);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            w4.c.r(1.0f, true, sVar);
            boolean z11 = (i13 & 112) == 32;
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new jr.m(28, onFinishClick);
                sVar.o0(objQ);
            }
            iu.k.e((fz.a) objQ, j0.e2.e(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, 7), 1.0f), false, 0L, null, J, sVar, 196656, 28);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.m(i11, onFinishClick, i12, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x029b  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:140:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:144:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:149:0x0315  */
    /* JADX WARN: Code duplicated, block: B:159:0x038b  */
    /* JADX WARN: Code duplicated, block: B:162:0x039f  */
    /* JADX WARN: Code duplicated, block: B:163:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:169:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:172:0x03df  */
    /* JADX WARN: Code duplicated, block: B:174:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:177:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:178:0x0405  */
    /* JADX WARN: Code duplicated, block: B:180:0x045a  */
    /* JADX WARN: Code duplicated, block: B:183:0x0470  */
    /* JADX WARN: Code duplicated, block: B:185:0x047c  */
    /* JADX WARN: Code duplicated, block: B:189:0x0492  */
    /* JADX WARN: Code duplicated, block: B:193:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:196:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:199:0x0514  */
    /* JADX WARN: Code duplicated, block: B:202:0x0527  */
    /* JADX WARN: Code duplicated, block: B:204:0x0533  */
    /* JADX WARN: Code duplicated, block: B:207:0x0544  */
    /* JADX WARN: Code duplicated, block: B:210:0x0599  */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, java.util.Collection] */
    public static final void y(rt.x0 x0Var, int i11, final fz.c cVar, fz.c cVar2, final fz.c cVar3, fz.a aVar, fz.a aVar2, fz.a aVar3, fz.a aVar4, fz.c cVar4, fz.a aVar5, fz.a aVar6, l1.n nVar, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        y2.h hVar;
        int iHashCode;
        int iHashCode2;
        final int i18;
        ?? r9;
        List list;
        List list2;
        boolean z11;
        boolean z12;
        boolean zH;
        Object objQ;
        int i19;
        boolean z13;
        boolean z14;
        Object objQ2;
        Object objQ3;
        Object objQ4;
        boolean zF;
        Object objQ5;
        boolean zF2;
        Object objQ6;
        Object objQ7;
        Object objQ8;
        Object objQ9;
        final l1.b1 b1Var;
        rt.x0 x0Var2 = x0Var;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1357828511);
        if ((i12 & 6) == 0) {
            i14 = (sVar.h(x0Var2) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar.d(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= sVar.h(cVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= sVar.h(cVar2) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= sVar.h(cVar3) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((1572864 & i12) == 0) {
            i14 |= sVar.h(aVar2) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= sVar.h(aVar3) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i14 |= sVar.h(aVar4) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i14 |= sVar.h(cVar4) ? 536870912 : 268435456;
        }
        if ((i13 & 6) == 0) {
            i15 = i13 | (sVar.h(aVar5) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= sVar.h(aVar6) ? 32 : 16;
        }
        int i21 = i15;
        if (sVar.T(i14 & 1, ((306717843 & i14) == 306717842 && (i21 & 19) == 18) ? false : true)) {
            Object objQ10 = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ10 == gVar) {
                objQ10 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ10);
            }
            l1.b1 b1Var2 = (l1.b1) objQ10;
            Object objQ11 = sVar.Q();
            if (objQ11 == gVar) {
                objQ11 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ11);
            }
            l1.b1 b1Var3 = (l1.b1) objQ11;
            Object objQ12 = sVar.Q();
            if (objQ12 == gVar) {
                objQ12 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ12);
            }
            final l1.b1 b1Var4 = (l1.b1) objQ12;
            Object objQ13 = sVar.Q();
            if (objQ13 == gVar) {
                objQ13 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ13);
            }
            l1.b1 b1Var5 = (l1.b1) objQ13;
            if (((Boolean) b1Var5.getValue()).booleanValue()) {
                sVar.d0(1068053814);
                Object objQ14 = sVar.Q();
                if (objQ14 == gVar) {
                    objQ14 = new q(16, b1Var5);
                    sVar.o0(objQ14);
                }
                fz.a aVar7 = (fz.a) objQ14;
                i16 = i14;
                boolean z15 = (i14 & 896) == 256;
                Object objQ15 = sVar.Q();
                if (z15 || objQ15 == gVar) {
                    objQ15 = new dt.y3(cVar, b1Var5, 5);
                    sVar.o0(objQ15);
                }
                y3.g(i11, aVar7, (fz.c) objQ15, sVar, ((i16 >> 3) & 14) | 48);
                i17 = 0;
                sVar.p(false);
            } else {
                i16 = i14;
                i17 = 0;
                sVar.d0(1060442787);
                sVar.p(false);
            }
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(j0.e2.d(oVar, 1.0f));
            j0.d dVar = j0.i.f35305c;
            z1.h hVar2 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar2, sVar, i17);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar3 = y2.j.f56917f;
            l1.t.J(hVar3, uVarA, sVar);
            y2.h hVar4 = y2.j.f56916e;
            l1.t.J(hVar4, q1VarL, sVar);
            y2.h hVar5 = y2.j.f56918g;
            if (sVar.S) {
                hVar = hVar4;
            } else {
                hVar = hVar4;
                if (!kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                }
                y2.h hVar6 = y2.j.f56915d;
                l1.t.J(hVar6, rVarC, sVar);
                float f5 = bc.f30055a;
                y2.h hVar7 = hVar;
                iu.k.g(aVar5, null, f41458v, null, t1.e.d(1985231828, new fu.f0(1, aVar6, b1Var5), sVar), null, bc.f(g2.x.f28621h, 0L, sVar, 30), null, sVar, (i21 & 14) | 24960, 170);
                z1.r rVarY = d0.n.y(j0.v.a(oVar, 1.0f), d0.n.u(sVar), true, 12);
                j0.u uVarA2 = j0.t.a(dVar, hVar2, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarY);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar3, uVarA2, sVar);
                l1.t.J(hVar7, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar5);
                }
                l1.t.J(hVar6, rVarC2, sVar);
                j0.c.g(sVar, j0.v.a(oVar, 1.0f));
                float f11 = 16;
                z1.r rVarA = j0.c.A(j0.e2.e(oVar, 1.0f), f11);
                j0.u uVarA3 = j0.t.a(dVar, z1.c.P, sVar, 48);
                iHashCode2 = Long.hashCode(sVar.T);
                l1.q1 q1VarL3 = sVar.l();
                z1.r rVarC3 = z1.a.c(sVar, rVarA);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar3, uVarA3, sVar);
                l1.t.J(hVar7, q1VarL3, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
                }
                l1.t.J(hVar6, rVarC3, sVar);
                i18 = 1;
                k7.d(j0.e2.e(oVar, 1.0f), r0.f.d(f11), null, null, null, t1.e.d(-48501389, new es.h(b1Var3, x0Var, b1Var4, aVar2, aVar3, aVar4, 5), sVar), sVar, 196614, 28);
                sVar = sVar;
                sVar.p(true);
                j0.c.g(sVar, j0.v.a(oVar, 2.0f));
                sVar.p(true);
                r9 = x0Var.f50610l;
                list = x0Var.f50602d;
                list2 = x0Var.f50599a;
                if (!r9.isEmpty() && x0Var.m.isEmpty() && x0Var.f50611n.isEmpty()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                z1.r rVarE = j0.e2.e(j0.c.B(oVar, f11, 32), 1.0f);
                if ((i16 & 1879048192) == 536870912) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zH = z12 | sVar.h(x0Var);
                objQ = sVar.Q();
                if (zH || objQ == gVar) {
                    objQ = new l1.z1(5, cVar4, x0Var);
                    sVar.o0(objQ);
                }
                iu.k.e((fz.a) objQ, rVarE, z11, 0L, null, f41464y, sVar, 196656, 24);
                sVar.p(true);
                if (((Boolean) b1Var2.getValue()).booleanValue()) {
                    sVar.d0(1078295935);
                    objQ8 = sVar.Q();
                    if (objQ8 == gVar) {
                        objQ8 = ep.a.r(x0Var.f50601c, sVar);
                    }
                    final l1.b1 b1Var6 = (l1.b1) objQ8;
                    objQ9 = sVar.Q();
                    if (objQ9 == gVar) {
                        b1Var = b1Var2;
                        objQ9 = new q(4, b1Var);
                        sVar.o0(objQ9);
                    } else {
                        b1Var = b1Var2;
                    }
                    byte b3 = 0;
                    k7.a((fz.a) objQ9, t1.e.d(-1328551127, new fz.e() { // from class: mt.u
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = i18;
                            l1.n nVar2 = (l1.n) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            switch (i22) {
                                case 0:
                                    l1.s sVar2 = (l1.s) nVar2;
                                    if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        fz.c cVar5 = cVar;
                                        boolean zF3 = sVar2.f(cVar5);
                                        Object objQ16 = sVar2.Q();
                                        l1.b1 b1Var7 = b1Var6;
                                        if (zF3 || objQ16 == l1.m.f39353a) {
                                            objQ16 = new bp.j2(cVar5, b1Var, b1Var7, 1);
                                            sVar2.o0(objQ16);
                                        }
                                        k7.m((fz.a) objQ16, null, !((List) b1Var7.getValue()).isEmpty(), null, null, null, g.F, sVar2, 805306368, 506);
                                    } else {
                                        sVar2.W();
                                    }
                                    break;
                                default:
                                    l1.s sVar3 = (l1.s) nVar2;
                                    if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        fz.c cVar6 = cVar;
                                        boolean zF4 = sVar3.f(cVar6);
                                        Object objQ17 = sVar3.Q();
                                        if (zF4 || objQ17 == l1.m.f39353a) {
                                            objQ17 = new bp.j2(cVar6, b1Var, b1Var6, 2);
                                            sVar3.o0(objQ17);
                                        }
                                        k7.m((fz.a) objQ17, null, false, null, null, null, g.f41466z, sVar3, 805306368, 510);
                                    } else {
                                        sVar3.W();
                                    }
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    }, sVar), null, t1.e.d(-1864465177, new bp.s(b1Var, 8, b3), sVar), B, t1.e.d(-520852604, new bp.s(b1Var6, 9, b3), sVar), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772598, 16276);
                    sVar.p(false);
                    i19 = 1060442787;
                } else {
                    i19 = 1060442787;
                    sVar.d0(1060442787);
                    sVar.p(false);
                }
                if (((Boolean) b1Var3.getValue()).booleanValue()) {
                    sVar.d0(1079681356);
                    objQ4 = sVar.Q();
                    if (objQ4 == gVar) {
                        objQ4 = l1.t.q(sVar);
                        sVar.o0(objQ4);
                    }
                    rz.b0 b0Var = (rz.b0) objQ4;
                    zF = sVar.f(list2);
                    objQ5 = sVar.Q();
                    if (zF || objQ5 == gVar) {
                        objQ5 = l1.t.B(list2);
                        sVar.o0(objQ5);
                    }
                    l1.b1 b1Var7 = (l1.b1) objQ5;
                    zF2 = sVar.f(list);
                    objQ6 = sVar.Q();
                    if (zF2 || objQ6 == gVar) {
                        objQ6 = l1.t.B(list);
                        sVar.o0(objQ6);
                    }
                    l1.b1 b1Var8 = (l1.b1) objQ6;
                    objQ7 = sVar.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new q(5, b1Var3);
                        sVar.o0(objQ7);
                    }
                    x0Var2 = x0Var;
                    k7.a((fz.a) objQ7, t1.e.d(-1886535190, new bp.t(17, cVar2, b1Var8, x0Var, b1Var3), sVar), null, t1.e.d(1872518056, new bp.s(b1Var3, 6, (byte) 0), sVar), E, t1.e.d(-1078836667, new fp.e(b1Var7, b0Var, b1Var8, 22), sVar), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772598, 16276);
                    z13 = false;
                } else {
                    z13 = false;
                    x0Var2 = x0Var;
                    sVar.d0(i19);
                }
                sVar.p(z13);
                if (((Boolean) b1Var4.getValue()).booleanValue()) {
                    sVar.d0(1084094330);
                    objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = l1.t.B(x0Var2.f50603e);
                        sVar.o0(objQ2);
                    }
                    final l1.b1 b1Var9 = (l1.b1) objQ2;
                    objQ3 = sVar.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new q(3, b1Var4);
                        sVar.o0(objQ3);
                    }
                    final byte b11 = 0;
                    k7.a((fz.a) objQ3, t1.e.d(1850448043, new fz.e() { // from class: mt.u
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = b11;
                            l1.n nVar2 = (l1.n) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            switch (i22) {
                                case 0:
                                    l1.s sVar2 = (l1.s) nVar2;
                                    if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        fz.c cVar5 = cVar3;
                                        boolean zF3 = sVar2.f(cVar5);
                                        Object objQ16 = sVar2.Q();
                                        l1.b1 b1Var10 = b1Var9;
                                        if (zF3 || objQ16 == l1.m.f39353a) {
                                            objQ16 = new bp.j2(cVar5, b1Var4, b1Var10, 1);
                                            sVar2.o0(objQ16);
                                        }
                                        k7.m((fz.a) objQ16, null, !((List) b1Var10.getValue()).isEmpty(), null, null, null, g.F, sVar2, 805306368, 506);
                                    } else {
                                        sVar2.W();
                                    }
                                    break;
                                default:
                                    l1.s sVar3 = (l1.s) nVar2;
                                    if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        fz.c cVar6 = cVar3;
                                        boolean zF4 = sVar3.f(cVar6);
                                        Object objQ17 = sVar3.Q();
                                        if (zF4 || objQ17 == l1.m.f39353a) {
                                            objQ17 = new bp.j2(cVar6, b1Var4, b1Var9, 2);
                                            sVar3.o0(objQ17);
                                        }
                                        k7.m((fz.a) objQ17, null, false, null, null, null, g.f41466z, sVar3, 805306368, 510);
                                    } else {
                                        sVar3.W();
                                    }
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    }, sVar), null, t1.e.d(1314533993, new bp.s(b1Var4, 7, b11), sVar), H, t1.e.d(-1636820730, new k9.p(11, x0Var2, b1Var9), sVar), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772598, 16276);
                    z14 = false;
                } else {
                    z14 = false;
                    sVar.d0(i19);
                }
                sVar.p(z14);
            }
            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar5);
            y2.h hVar8 = y2.j.f56915d;
            l1.t.J(hVar8, rVarC, sVar);
            float f12 = bc.f30055a;
            y2.h hVar9 = hVar;
            iu.k.g(aVar5, null, f41458v, null, t1.e.d(1985231828, new fu.f0(1, aVar6, b1Var5), sVar), null, bc.f(g2.x.f28621h, 0L, sVar, 30), null, sVar, (i21 & 14) | 24960, 170);
            z1.r rVarY2 = d0.n.y(j0.v.a(oVar, 1.0f), d0.n.u(sVar), true, 12);
            j0.u uVarA4 = j0.t.a(dVar, hVar2, sVar, 0);
            iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarY2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA4, sVar);
            l1.t.J(hVar9, q1VarL4, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar5);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar5);
            }
            l1.t.J(hVar8, rVarC4, sVar);
            j0.c.g(sVar, j0.v.a(oVar, 1.0f));
            float f13 = 16;
            z1.r rVarA2 = j0.c.A(j0.e2.e(oVar, 1.0f), f13);
            j0.u uVarA5 = j0.t.a(dVar, z1.c.P, sVar, 48);
            iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL5 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarA2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA5, sVar);
            l1.t.J(hVar9, q1VarL5, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
            } else {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
            }
            l1.t.J(hVar8, rVarC5, sVar);
            i18 = 1;
            k7.d(j0.e2.e(oVar, 1.0f), r0.f.d(f13), null, null, null, t1.e.d(-48501389, new es.h(b1Var3, x0Var, b1Var4, aVar2, aVar3, aVar4, 5), sVar), sVar, 196614, 28);
            sVar = sVar;
            sVar.p(true);
            j0.c.g(sVar, j0.v.a(oVar, 2.0f));
            sVar.p(true);
            r9 = x0Var.f50610l;
            list = x0Var.f50602d;
            list2 = x0Var.f50599a;
            if (!r9.isEmpty()) {
                z11 = true;
            } else {
                z11 = true;
            }
            z1.r rVarE2 = j0.e2.e(j0.c.B(oVar, f13, 32), 1.0f);
            if ((i16 & 1879048192) == 536870912) {
                z12 = true;
            } else {
                z12 = false;
            }
            zH = z12 | sVar.h(x0Var);
            objQ = sVar.Q();
            if (zH) {
                objQ = new l1.z1(5, cVar4, x0Var);
                sVar.o0(objQ);
            } else {
                objQ = new l1.z1(5, cVar4, x0Var);
                sVar.o0(objQ);
            }
            iu.k.e((fz.a) objQ, rVarE2, z11, 0L, null, f41464y, sVar, 196656, 24);
            sVar.p(true);
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                sVar.d0(1078295935);
                objQ8 = sVar.Q();
                if (objQ8 == gVar) {
                    objQ8 = ep.a.r(x0Var.f50601c, sVar);
                }
                final l1.b1 b1Var10 = (l1.b1) objQ8;
                objQ9 = sVar.Q();
                if (objQ9 == gVar) {
                    b1Var = b1Var2;
                    objQ9 = new q(4, b1Var);
                    sVar.o0(objQ9);
                } else {
                    b1Var = b1Var2;
                }
                byte b12 = 0;
                k7.a((fz.a) objQ9, t1.e.d(-1328551127, new fz.e() { // from class: mt.u
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i22 = i18;
                        l1.n nVar2 = (l1.n) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (i22) {
                            case 0:
                                l1.s sVar2 = (l1.s) nVar2;
                                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    fz.c cVar5 = cVar;
                                    boolean zF3 = sVar2.f(cVar5);
                                    Object objQ16 = sVar2.Q();
                                    l1.b1 b1Var11 = b1Var10;
                                    if (zF3 || objQ16 == l1.m.f39353a) {
                                        objQ16 = new bp.j2(cVar5, b1Var, b1Var11, 1);
                                        sVar2.o0(objQ16);
                                    }
                                    k7.m((fz.a) objQ16, null, !((List) b1Var11.getValue()).isEmpty(), null, null, null, g.F, sVar2, 805306368, 506);
                                } else {
                                    sVar2.W();
                                }
                                break;
                            default:
                                l1.s sVar3 = (l1.s) nVar2;
                                if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    fz.c cVar6 = cVar;
                                    boolean zF4 = sVar3.f(cVar6);
                                    Object objQ17 = sVar3.Q();
                                    if (zF4 || objQ17 == l1.m.f39353a) {
                                        objQ17 = new bp.j2(cVar6, b1Var, b1Var10, 2);
                                        sVar3.o0(objQ17);
                                    }
                                    k7.m((fz.a) objQ17, null, false, null, null, null, g.f41466z, sVar3, 805306368, 510);
                                } else {
                                    sVar3.W();
                                }
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                }, sVar), null, t1.e.d(-1864465177, new bp.s(b1Var, 8, b12), sVar), B, t1.e.d(-520852604, new bp.s(b1Var10, 9, b12), sVar), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772598, 16276);
                sVar.p(false);
                i19 = 1060442787;
            } else {
                i19 = 1060442787;
                sVar.d0(1060442787);
                sVar.p(false);
            }
            if (((Boolean) b1Var3.getValue()).booleanValue()) {
                sVar.d0(1079681356);
                objQ4 = sVar.Q();
                if (objQ4 == gVar) {
                    objQ4 = l1.t.q(sVar);
                    sVar.o0(objQ4);
                }
                rz.b0 b0Var2 = (rz.b0) objQ4;
                zF = sVar.f(list2);
                objQ5 = sVar.Q();
                if (zF) {
                    objQ5 = l1.t.B(list2);
                    sVar.o0(objQ5);
                } else {
                    objQ5 = l1.t.B(list2);
                    sVar.o0(objQ5);
                }
                l1.b1 b1Var11 = (l1.b1) objQ5;
                zF2 = sVar.f(list);
                objQ6 = sVar.Q();
                if (zF2) {
                    objQ6 = l1.t.B(list);
                    sVar.o0(objQ6);
                } else {
                    objQ6 = l1.t.B(list);
                    sVar.o0(objQ6);
                }
                l1.b1 b1Var12 = (l1.b1) objQ6;
                objQ7 = sVar.Q();
                if (objQ7 == gVar) {
                    objQ7 = new q(5, b1Var3);
                    sVar.o0(objQ7);
                }
                x0Var2 = x0Var;
                k7.a((fz.a) objQ7, t1.e.d(-1886535190, new bp.t(17, cVar2, b1Var12, x0Var, b1Var3), sVar), null, t1.e.d(1872518056, new bp.s(b1Var3, 6, (byte) 0), sVar), E, t1.e.d(-1078836667, new fp.e(b1Var11, b0Var2, b1Var12, 22), sVar), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772598, 16276);
                z13 = false;
            } else {
                z13 = false;
                x0Var2 = x0Var;
                sVar.d0(i19);
            }
            sVar.p(z13);
            if (((Boolean) b1Var4.getValue()).booleanValue()) {
                sVar.d0(1084094330);
                objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = l1.t.B(x0Var2.f50603e);
                    sVar.o0(objQ2);
                }
                final l1.b1 b1Var13 = (l1.b1) objQ2;
                objQ3 = sVar.Q();
                if (objQ3 == gVar) {
                    objQ3 = new q(3, b1Var4);
                    sVar.o0(objQ3);
                }
                final int b13 = 0;
                k7.a((fz.a) objQ3, t1.e.d(1850448043, new fz.e() { // from class: mt.u
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i22 = b13;
                        l1.n nVar2 = (l1.n) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (i22) {
                            case 0:
                                l1.s sVar2 = (l1.s) nVar2;
                                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    fz.c cVar5 = cVar3;
                                    boolean zF3 = sVar2.f(cVar5);
                                    Object objQ16 = sVar2.Q();
                                    l1.b1 b1Var14 = b1Var13;
                                    if (zF3 || objQ16 == l1.m.f39353a) {
                                        objQ16 = new bp.j2(cVar5, b1Var4, b1Var14, 1);
                                        sVar2.o0(objQ16);
                                    }
                                    k7.m((fz.a) objQ16, null, !((List) b1Var14.getValue()).isEmpty(), null, null, null, g.F, sVar2, 805306368, 506);
                                } else {
                                    sVar2.W();
                                }
                                break;
                            default:
                                l1.s sVar3 = (l1.s) nVar2;
                                if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    fz.c cVar6 = cVar3;
                                    boolean zF4 = sVar3.f(cVar6);
                                    Object objQ17 = sVar3.Q();
                                    if (zF4 || objQ17 == l1.m.f39353a) {
                                        objQ17 = new bp.j2(cVar6, b1Var4, b1Var13, 2);
                                        sVar3.o0(objQ17);
                                    }
                                    k7.m((fz.a) objQ17, null, false, null, null, null, g.f41466z, sVar3, 805306368, 510);
                                } else {
                                    sVar3.W();
                                }
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                }, sVar), null, t1.e.d(1314533993, new bp.s(b1Var4, 7, b13), sVar), H, t1.e.d(-1636820730, new k9.p(11, x0Var2, b1Var13), sVar), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772598, 16276);
                z14 = false;
            } else {
                z14 = false;
                sVar.d0(i19);
            }
            sVar.p(z14);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v(x0Var2, i11, cVar, cVar2, cVar3, aVar, aVar2, aVar3, aVar4, cVar4, aVar5, aVar6, i12, i13, 0);
        }
    }

    public static final void z(z1.r rVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1888967950);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z1.j jVar = z1.c.f58463a;
            w2.q0 q0VarD = j0.o.d(jVar, false);
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
            float f5 = 16;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarJ = j0.c.j(j0.e2.e(j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, 10), 1.0f), 2.3093526f);
            w2.q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarJ);
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
            d0.n.c(se.k.y(((Number) sVar.j(ju.f.f37371e)).intValue() == 51 ? R.drawable.flash_card_memery_strength_ara_locale : R.drawable.flash_card_memery_strength, sVar, 0), null, j0.c.j(j0.e2.e(oVar, 1.0f), 2.3093526f), null, w2.i.f54520g, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 25008, 104);
            sVar.p(true);
            z1.r rVarE = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 7);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarE);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, a2VarA, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            ua.b(ub.a.e0(sVar, R.string.srs_mastery), j0.c.E(oVar, 50, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), g2.x.c(((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, 0.5f), fr.j3.A(10), null, n3.s.K, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 199728, 0, 131024);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.c3(rVar, i11, 3, (byte) 0);
        }
    }

    public static final void q(int i11, String content, l1.n nVar, z1.r rVar) {
        z1.r rVar2;
        kotlin.jvm.internal.m.f(content, "content");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1760115272);
        int i12 = (sVar.f(content) ? 4 : 2) | i11 | 48;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                String str = "<html>\n<body bgcolor=\"#FFFFFF\" style=\"font-size:14px;\">\n" + content + "</body>\n</html>";
                kotlin.jvm.internal.m.e(str, "toString(...)");
                objQ = oz.x.q0(str, LwKl.axbQrXNvl, "<td style=\"font-size:14px;\">");
                sVar.o0(objQ);
            }
            wg.r rVarA = wg.t.a((String) objQ, sVar, 30);
            long j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p;
            boolean zT = d0.n.t(sVar);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
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
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            boolean zE = sVar.e(j11) | sVar.g(zT);
            Object objQ2 = sVar.Q();
            if (zE || objQ2 == gVar) {
                objQ2 = new dt.b0(2, j11, zT);
                sVar.o0(objQ2);
            }
            rVar2 = oVar;
            qx.p.g(rVarA, rVar2, false, null, (fz.c) objQ2, null, null, null, sVar, 48, 492);
            sVar.p(true);
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.a(content, rVar2, i11, 4);
        }
    }
}
