package yg;

import a0.f1;
import a0.m1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import b0.h0;
import b0.i2;
import b0.u0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingo.lingoskill.object.BillingPageRecomConfig;
import com.lingo.lingoskill.object.MergedBillingThemeBillingPage;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import d0.v;
import dt.i0;
import dt.n0;
import dt.r0;
import dt.v0;
import fr.j3;
import fr.p3;
import g2.f0;
import g2.j0;
import g2.x;
import gp.l1;
import h1.k7;
import h1.r4;
import h1.ua;
import j0.a2;
import j0.e1;
import j0.e2;
import j0.u;
import j0.v1;
import j0.z1;
import j3.y0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.z;
import l0.w;
import l0.y;
import l1.a1;
import l1.b1;
import l1.b3;
import l1.c3;
import l1.d0;
import l1.q1;
import l1.t;
import l1.x1;
import mt.h2;
import mt.j1;
import qy.b0;
import w2.a0;
import w2.q0;
import xu.r1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    public static final void a(int i11, com.android.billingclient.api.o oVar, MergedBillingThemeBillingPage mergedBillingThemeBillingPage, String str, String str2, String str3, String str4, String str5, String str6, l1.n nVar, ni.m mVar, boolean z11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1511174915);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.f(str2) ? 32 : 16) | (sVar.f(str3) ? 256 : 128) | (sVar.f(str4) ? 2048 : 1024) | (sVar.f(str5) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(mergedBillingThemeBillingPage) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.g(z11) ? 1048576 : 524288) | (sVar.h(mVar) ? 8388608 : 4194304) | (sVar.h(oVar) ? 67108864 : 33554432) | (sVar.f(str6) ? 536870912 : 268435456);
        if (sVar.T(i12 & 1, (i12 & 306783379) != 306783378)) {
            b3 b3VarB = b0.h.b(z11 ? 1.0f : 0.95f, null, BuildConfig.VERSION_NAME, sVar, 3072, 22);
            long jW = j3.w(mergedBillingThemeBillingPage.getColorYearlyCard());
            long jW2 = j3.w(mergedBillingThemeBillingPage.getColorYearlyCardEnd());
            long jW3 = j3.w(mergedBillingThemeBillingPage.getColorYearlyCardStroke());
            float f5 = z11 ? 2 : -1;
            long jW4 = j3.w(mergedBillingThemeBillingPage.getColorYearlyCardText());
            long jW5 = j3.w(mergedBillingThemeBillingPage.getColorYearlyCardText());
            float fFloatValue = ((Number) b3VarB.getValue()).floatValue();
            z1.r rVarI = d2.h.i(z1.o.f58481a, fFloatValue, fFloatValue);
            boolean zH = sVar.h(mVar) | sVar.h(oVar);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new a(mVar, oVar, 2);
                sVar.o0(objQ);
            }
            int i13 = i12 >> 3;
            b(str, str2, str4, str5, jW, jW2, jW3, f5, jW4, jW5, rVarI, (fz.a) objQ, t1.e.d(-136440039, new b(str3, str6, mergedBillingThemeBillingPage, z11, 1), sVar), sVar, (i12 & 126) | (i13 & 896) | (i13 & 7168));
            sVar = sVar;
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(str, str2, str3, str4, str5, mergedBillingThemeBillingPage, z11, mVar, oVar, str6, i11);
        }
    }

    public static final void b(final String str, final String str2, final String str3, final String str4, final long j11, final long j12, final long j13, final float f5, final long j14, final long j15, final z1.r rVar, final fz.a aVar, fz.f fVar, l1.n nVar, final int i11) {
        fz.f fVar2;
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(869622537);
        int i12 = (sVar2.f(str) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(str2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.f(str3) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.f(str4) ? 2048 : 1024;
        }
        int i13 = i12 | (sVar2.e(j11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.e(j12) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.e(j13) ? 1048576 : 524288) | (sVar2.c(f5) ? 8388608 : 4194304) | (sVar2.e(j14) ? 67108864 : 33554432) | (sVar2.e(j15) ? 536870912 : 268435456);
        int i14 = 384 | (sVar2.f(rVar) ? (char) 4 : (char) 2) | (sVar2.h(aVar) ? 32 : 16);
        if (sVar2.T(i13 & 1, ((i13 & 306783379) == 306783378 && (i14 & 147) == 146) ? false : true)) {
            float f11 = 84;
            float f12 = 16;
            float f13 = 14;
            z1.r rVarB = d2.h.b(e2.e(j0.c.C(rVar, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), r0.f.d(f13));
            boolean z11 = (i14 & 112) == 32;
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new r1(5, aVar);
                sVar2.o0(objQ);
            }
            z1.r rVarO = d0.n.o(rVarB, false, null, (fz.a) objQ, 15);
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarO);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar = y2.j.f56917f;
            t.J(hVar, q0VarD, sVar2);
            y2.h hVar2 = y2.j.f56916e;
            t.J(hVar2, q1VarL, sVar2);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            t.J(hVar4, rVarC, sVar2);
            j0 j0VarQ = p3.q(ns.o.L(new x(j11), new x(j12)));
            r0.e eVarD = r0.f.d(f13);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarG = d0.n.g(oVar, j0VarQ, eVarD, 4);
            v vVarA = d0.n.a(j13, f5);
            z1.r rVarQ = j0.c.q(e2.e(j0.c.E(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.d(f13), rVarG), 22, CropImageView.DEFAULT_ASPECT_RATIO, 34, CropImageView.DEFAULT_ASPECT_RATIO, 10), 1.0f), e1.Min);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
            int iHashCode2 = Long.hashCode(sVar2.T);
            q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarQ);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(hVar, a2VarA, sVar2);
            t.J(hVar2, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar2);
            z1.h hVar5 = z1.c.O;
            z1.r rVarI = e2.i(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            z1.r rVarE = j0.c.E(w4.c.p(1.0f, true, rVarI), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, 11);
            u uVarA = j0.t.a(j0.i.f35308f, hVar5, sVar2, 54);
            int iHashCode3 = Long.hashCode(sVar2.T);
            q1 q1VarL3 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, rVarE);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(hVar, uVarA, sVar2);
            t.J(hVar2, q1VarL3, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
            }
            t.J(hVar4, rVarC3, sVar2);
            z1.r rVarA = j0.v.a(oVar, 1.0f);
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = new xt.r(5);
                sVar2.o0(objQ2);
            }
            z1.r rVarQ2 = f0.q(rVarA, (fz.c) objQ2);
            z1.j jVar = z1.c.f58467e;
            q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode4 = Long.hashCode(sVar2.T);
            q1 q1VarL4 = sVar2.l();
            z1.r rVarC4 = z1.a.c(sVar2, rVarQ2);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(hVar, q0VarD2, sVar2);
            t.J(hVar2, q1VarL4, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar3);
            }
            t.J(hVar4, rVarC4, sVar2);
            d0 d0Var = ua.f31167a;
            int i15 = (i13 >> 3) & 14;
            ua.b(str2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(d0Var), j15, j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar2, i15, 0, 65534);
            sVar2.p(true);
            ua.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(d0Var), j14, j3.A(18), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar2, i13 & 14, 0, 65534);
            z1.r rVarC5 = j0.c.C(j0.v.a(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 4, 1);
            q0 q0VarD3 = j0.o.d(jVar, false);
            int iHashCode5 = Long.hashCode(sVar2.T);
            q1 q1VarL5 = sVar2.l();
            z1.r rVarC6 = z1.a.c(sVar2, rVarC5);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(hVar, q0VarD3, sVar2);
            t.J(hVar2, q1VarL5, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode5))) {
                defpackage.e.A(iHashCode5, sVar2, iHashCode5, hVar3);
            }
            t.J(hVar4, rVarC6, sVar2);
            ua.b(str2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(d0Var), j15, j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar2, i15, 0, 65534);
            sVar2.p(true);
            sVar2.p(true);
            u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.Q, sVar2, 48);
            int iHashCode6 = Long.hashCode(sVar2.T);
            q1 q1VarL6 = sVar2.l();
            z1.r rVarC7 = z1.a.c(sVar2, oVar);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(hVar, uVarA2, sVar2);
            t.J(hVar2, q1VarL6, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode6))) {
                defpackage.e.A(iHashCode6, sVar2, iHashCode6, hVar3);
            }
            t.J(hVar4, rVarC7, sVar2);
            z1.r rVarA2 = j0.v.a(oVar, 1.0f);
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = new xt.r(6);
                sVar2.o0(objQ3);
            }
            z1.r rVarQ3 = f0.q(rVarA2, (fz.c) objQ3);
            q0 q0VarD4 = j0.o.d(jVar, false);
            int iHashCode7 = Long.hashCode(sVar2.T);
            q1 q1VarL7 = sVar2.l();
            z1.r rVarC8 = z1.a.c(sVar2, rVarQ3);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(hVar, q0VarD4, sVar2);
            t.J(hVar2, q1VarL7, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode7))) {
                defpackage.e.A(iHashCode7, sVar2, iHashCode7, hVar3);
            }
            t.J(hVar4, rVarC8, sVar2);
            y0 y0Var = (y0) sVar2.j(d0Var);
            long jA = j3.A(12);
            u3.l lVar = u3.l.f52753d;
            y0 y0VarA = y0.a(y0Var, j14, jA, null, null, null, 0L, null, lVar, 3, 0, 0L, null, 16740348);
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = new xt.r(7);
                sVar2.o0(objQ4);
            }
            int i16 = ((i13 >> 9) & 14) | 48;
            ua.b(str4, f0.q(oVar, (fz.c) objQ4), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar2, i16, 0, 65532);
            sVar2.p(true);
            ua.b(str3, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(d0Var), j14, j3.A(18), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar2, (i13 >> 6) & 14, 0, 65534);
            z1.r rVarC9 = j0.c.C(j0.v.a(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 2, 1);
            q0 q0VarD5 = j0.o.d(jVar, false);
            int iHashCode8 = Long.hashCode(sVar2.T);
            q1 q1VarL8 = sVar2.l();
            z1.r rVarC10 = z1.a.c(sVar2, rVarC9);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(hVar, q0VarD5, sVar2);
            t.J(hVar2, q1VarL8, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode8))) {
                defpackage.e.A(iHashCode8, sVar2, iHashCode8, hVar3);
            }
            t.J(hVar4, rVarC10, sVar2);
            y0 y0VarA2 = y0.a((y0) sVar2.j(d0Var), j14, j3.A(12), null, null, null, 0L, null, lVar, 3, 0, 0L, null, 16740348);
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                objQ5 = new xt.r(8);
                sVar2.o0(objQ5);
            }
            ua.b(str4, f0.q(oVar, (fz.c) objQ5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA2, sVar2, i16, 0, 65532);
            sVar = sVar2;
            sVar.p(true);
            sVar.p(true);
            sVar.p(true);
            fVar2 = fVar;
            fVar2.invoke(j0.r.f35391a, sVar, 54);
            sVar.p(true);
        } else {
            fVar2 = fVar;
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            final fz.f fVar3 = fVar2;
            x1VarT.f39502d = new fz.e() { // from class: yg.e
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = t.M(i11 | 1);
                    o.b(str, str2, str3, str4, j11, j12, j13, f5, j14, j15, rVar, aVar, fVar3, (l1.n) obj, iM);
                    return b0.f48488a;
                }
            };
        }
    }

    public static final void c(String title, long j11, long j12, long j13, z1.r rVar, fz.a onClick, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1049030420);
        int i12 = (sVar2.f(title) ? 4 : 2) | i11 | (sVar2.e(j11) ? 32 : 16) | (sVar2.e(j12) ? 256 : 128) | (sVar2.e(j13) ? 2048 : 1024);
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.f(rVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i13 = i12 | (sVar2.h(onClick) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar2.T(i13 & 1, (i13 & 74899) != 74898)) {
            b0.j0 j0VarP = b0.e.p(BuildConfig.VERSION_NAME, sVar2, 0);
            i2 i2VarR = b0.e.r(1000, 0, b0.b0.f3441d, 2);
            u0 u0Var = u0.Reverse;
            sVar = sVar2;
            h0 h0VarG = b0.e.g(j0VarP, 1.0f, 1.1f, b0.e.o(i2VarR, u0Var, 4), BuildConfig.VERSION_NAME, sVar, 29112, 0);
            h0 h0VarG2 = b0.e.g(j0VarP, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, b0.e.o(b0.e.r(500, 0, b0.b0.f3438a, 2), u0Var, 4), BuildConfig.VERSION_NAME, sVar, 29112, 0);
            List listL = ns.o.L(new x(j12), new x(j13));
            z1.r rVarE = e2.e(e2.i(rVar, 48, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
            float fFloatValue = ((Number) h0VarG.f3553d.getValue()).floatValue();
            iu.k.e(onClick, d2.h.i(rVarE, fFloatValue, fFloatValue), false, j11, listL, t1.e.d(210879927, new gr.f(title, j11, h0VarG2, 1), sVar), sVar, ((i13 >> 15) & 14) | 196608 | ((i13 << 6) & 7168), 4);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new gr.h(title, j11, j12, j13, rVar, onClick, i11, 1);
        }
    }

    public static final void d(long j11, long j12, z1.r rVar, l1.n nVar, int i11) {
        long j13;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(543208460);
        int i12 = (sVar.e(j11) ? 4 : 2) | i11 | (sVar.e(j12) ? 32 : 16) | (sVar.f(rVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, q0VarD, sVar);
            t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar);
            z1.o oVar = z1.o.f58481a;
            j0.o.a(d0.n.h(e2.d(oVar, 1.0f), j12, r0.f.f48733a), sVar, 0);
            j13 = j11;
            r4.b(se.k.y(R.drawable.sub_page_check, sVar, 0), null, e2.d(oVar, 1.0f), j13, sVar, 440 | ((i12 << 9) & 7168), 0);
            sVar.p(true);
        } else {
            j13 = j11;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i0(j13, j12, rVar, i11);
        }
    }

    public static final void e(String iconUrl, int i11, String title, String subTitle, long j11, long j12, long j13, l1.n nVar, int i12) {
        int i13;
        y2.h hVar;
        y2.h hVar2;
        y2.h hVar3;
        l1.s sVar;
        kotlin.jvm.internal.m.f(iconUrl, "iconUrl");
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(subTitle, "subTitle");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1714512148);
        int i14 = i12 | (sVar2.f(iconUrl) ? 4 : 2) | (sVar2.d(i11) ? 32 : 16) | (sVar2.f(title) ? 256 : 128) | (sVar2.f(subTitle) ? 2048 : 1024) | (sVar2.e(j11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar2.T(i14 & 1, (i14 & 599187) != 599186)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = e2.e(oVar, 1.0f);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarE);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar4 = y2.j.f56917f;
            t.J(hVar4, a2VarA, sVar2);
            y2.h hVar5 = y2.j.f56916e;
            t.J(hVar5, q1VarL, sVar2);
            y2.h hVar6 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar6);
            }
            y2.h hVar7 = y2.j.f56915d;
            t.J(hVar7, rVarC, sVar2);
            if (iconUrl.length() > 0) {
                sVar2.d0(-95445011);
                wb.k.c(iconUrl, e2.s(oVar, 38), w2.i.f54517d, sVar2, (i14 & 14) | 1573296, 4024);
                sVar2.p(false);
                i13 = 0;
                hVar3 = hVar6;
                hVar2 = hVar5;
                sVar = sVar2;
                hVar = hVar7;
            } else {
                sVar2.d0(-95213100);
                i13 = 0;
                hVar = hVar7;
                hVar2 = hVar5;
                hVar3 = hVar6;
                d0.n.c(se.k.y(i11, sVar2, (i14 >> 3) & 14), null, e2.n(oVar, 38), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 440, 120);
                sVar = sVar2;
                sVar.p(false);
            }
            z1.r rVarE2 = j0.c.E(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, i13);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarE2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar4, uVarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar, rVarC2, sVar);
            d0 d0Var = ua.f31167a;
            l1.s sVar3 = sVar;
            ua.b(title, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), j11, j12, n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar3, (i14 >> 6) & 14, 0, 65534);
            sVar2 = sVar3;
            ua.b(subTitle, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(d0Var), j11, j13, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar2, ((i14 >> 9) & 14) | 48, 0, 65532);
            sVar2.p(true);
            sVar2.p(true);
        } else {
            sVar2.W();
        }
        x1 x1VarT = sVar2.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v0(iconUrl, i11, title, subTitle, j11, j12, j13, i12);
        }
    }

    public static final void f(String content, long j11, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(content, "content");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-277995698);
        int i12 = i11 | (sVar2.f(content) ? 4 : 2) | (sVar2.e(j11) ? 32 : 16);
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            float f5 = 22;
            sVar = sVar2;
            ua.b(content, j0.c.E(z1.o.f58481a, f5, 16, f5, CropImageView.DEFAULT_ASPECT_RATIO, 8), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), j11, j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, i12 & 14, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new gr.d(i11, 2, j11, content);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x026a  */
    /* JADX WARN: Code duplicated, block: B:104:0x027d  */
    /* JADX WARN: Code duplicated, block: B:110:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:116:0x0330  */
    /* JADX WARN: Code duplicated, block: B:120:0x0384  */
    /* JADX WARN: Code duplicated, block: B:126:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:128:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:130:0x03f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x040a A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:138:0x0412  */
    /* JADX WARN: Code duplicated, block: B:145:0x044a  */
    /* JADX WARN: Code duplicated, block: B:147:0x045b  */
    /* JADX WARN: Code duplicated, block: B:148:0x045d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x048a A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:157:0x0499  */
    /* JADX WARN: Code duplicated, block: B:162:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:164:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:165:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:173:0x0514 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:174:0x0523  */
    /* JADX WARN: Code duplicated, block: B:181:0x0563  */
    /* JADX WARN: Code duplicated, block: B:183:0x0574  */
    /* JADX WARN: Code duplicated, block: B:184:0x0576  */
    /* JADX WARN: Code duplicated, block: B:193:0x05a3 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:194:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:198:0x05db  */
    /* JADX WARN: Code duplicated, block: B:201:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:202:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:208:0x0639  */
    /* JADX WARN: Code duplicated, block: B:211:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:212:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:215:0x06be  */
    /* JADX WARN: Code duplicated, block: B:218:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:222:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:223:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:226:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:227:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:230:0x0718  */
    /* JADX WARN: Code duplicated, block: B:231:0x071a  */
    /* JADX WARN: Code duplicated, block: B:234:0x0724  */
    /* JADX WARN: Code duplicated, block: B:235:0x0726  */
    /* JADX WARN: Code duplicated, block: B:238:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:239:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:242:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:243:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:246:0x07de  */
    /* JADX WARN: Code duplicated, block: B:247:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:250:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:251:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:254:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:256:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:257:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:258:0x081d A[PHI: r24
      0x081d: PHI (r24v22 l1.g) = (r24v21 l1.g), (r24v24 l1.g) binds: [B:253:0x07f6, B:256:0x07fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:261:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:264:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:267:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:268:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:271:0x091a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0922  */
    /* JADX WARN: Code duplicated, block: B:276:0x0932  */
    /* JADX WARN: Code duplicated, block: B:278:0x0940  */
    /* JADX WARN: Code duplicated, block: B:283:0x095d  */
    /* JADX WARN: Code duplicated, block: B:286:0x0973  */
    /* JADX WARN: Code duplicated, block: B:289:0x0991  */
    /* JADX WARN: Code duplicated, block: B:290:0x0994  */
    /* JADX WARN: Code duplicated, block: B:292:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:294:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:297:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:75:0x0103  */
    /* JADX WARN: Code duplicated, block: B:76:0x0106  */
    /* JADX WARN: Code duplicated, block: B:87:0x0124  */
    /* JADX WARN: Code duplicated, block: B:93:0x013e  */
    /* JADX WARN: Code duplicated, block: B:95:0x014e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0174  */
    /* JADX WARN: Code duplicated, block: B:98:0x017a  */
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
    public static final void g(final xg.d dVar, final String str, final l1 remoteConfigViewModel, ni.m mVar, boolean z11, final fz.a onFinishClick, fz.a onSubscriptionSuccess, final fz.a onContactUsClick, final fz.a aVar, final fz.a onTermsOfUseClick, final fz.a onPrivacyPolicyClick, l1.n nVar, final int i11, final int i12) {
        int i13;
        char c11;
        final fz.a aVar2;
        final ni.m mVar2;
        final boolean z12;
        x1 x1VarT;
        ViewModelStoreOwner current;
        ni.m mVar3;
        int i14;
        boolean z13;
        int i15;
        ni.m mVar4;
        final b3 b3VarCollectAsStateWithLifecycle;
        b3 b3VarCollectAsStateWithLifecycle2;
        b3 b3VarCollectAsStateWithLifecycle3;
        b3 b3VarCollectAsStateWithLifecycle4;
        final b3 b3VarCollectAsStateWithLifecycle5;
        final b3 b3VarCollectAsStateWithLifecycle6;
        final b3 b3VarCollectAsStateWithLifecycle7;
        b3 b3VarCollectAsStateWithLifecycle8;
        b3 b3VarCollectAsStateWithLifecycle9;
        final b3 b3VarCollectAsStateWithLifecycle10;
        final b3 b3VarCollectAsStateWithLifecycle11;
        b3 b3VarCollectAsStateWithLifecycle12;
        final b3 b3VarCollectAsStateWithLifecycle13;
        b3 b3VarCollectAsStateWithLifecycle14;
        b3 b3VarCollectAsStateWithLifecycle15;
        b3 b3VarCollectAsStateWithLifecycle16;
        Object objQ;
        l1.g gVar;
        b1 b1Var;
        Object objQ2;
        final b1 b1Var2;
        boolean zF;
        Object objQ3;
        b3 b3Var;
        b3 b3Var2;
        b3 b3Var3;
        final b3 b3Var4;
        boolean zF2;
        Object objQ4;
        b1 b1Var3;
        ni.m mVar5;
        b3 b3Var5;
        b3 b3Var6;
        boolean zF3;
        Object objQ5;
        boolean zD;
        int i16;
        int i17;
        String str2;
        Object objB;
        final b1 b1Var4;
        boolean zF4;
        Object objQ6;
        int i18;
        long jW;
        final b1 b1Var5;
        boolean zD2;
        Object objQ7;
        int i19;
        long jW2;
        boolean zD3;
        Object objQ8;
        int i21;
        long jW3;
        final b1 b1Var6;
        Object objQ9;
        final a1 a1Var;
        Object objQ10;
        final long jW4;
        boolean zF5;
        Object objQ11;
        g2.t tVar;
        z1.o oVar;
        l1.g gVar2;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        y2.i iVar2;
        z1.r rVarG;
        c3 c3Var;
        float f5;
        boolean z14;
        boolean z15;
        final b3 b3Var7;
        final b3 b3Var8;
        final b1 b1Var7;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        Object objQ12;
        Object obj;
        final b3 b3Var9;
        l1.g gVar3;
        float f11;
        String str3;
        b3 b3Var10;
        l1.s sVar;
        Object objQ13;
        l1.g gVar4;
        Object objQ14;
        boolean zEquals;
        j0.r rVar;
        z1.o oVar2;
        z1.r rVarV;
        int iHashCode2;
        Object objQ15;
        Object objQ16;
        float f12;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        final String source = str;
        z1.j jVar = z1.c.H;
        kotlin.jvm.internal.m.f(source, "source");
        kotlin.jvm.internal.m.f(remoteConfigViewModel, "remoteConfigViewModel");
        kotlin.jvm.internal.m.f(onFinishClick, "onFinishClick");
        kotlin.jvm.internal.m.f(onSubscriptionSuccess, "onSubscriptionSuccess");
        kotlin.jvm.internal.m.f(onContactUsClick, "onContactUsClick");
        kotlin.jvm.internal.m.f(aVar, IMCc.CWSSyWAV);
        kotlin.jvm.internal.m.f(onTermsOfUseClick, "onTermsOfUseClick");
        kotlin.jvm.internal.m.f(onPrivacyPolicyClick, "onPrivacyPolicyClick");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1018409655);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.h(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.f(source) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar2.h(remoteConfigViewModel) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= 1024;
        }
        int i27 = i12 & 16;
        if (i27 == 0) {
            if ((i11 & 24576) == 0) {
                i13 |= sVar2.g(z11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            if ((i11 & 196608) == 0) {
                if (sVar2.h(onFinishClick)) {
                    i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i26 = 65536;
                }
                i13 |= i26;
            }
            if ((i11 & 1572864) == 0) {
                if (sVar2.h(onSubscriptionSuccess)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i13 |= i25;
            }
            if ((i11 & 12582912) == 0) {
                if (sVar2.h(onContactUsClick)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i13 |= i24;
            }
            if ((i11 & 100663296) == 0) {
                if (sVar2.h(aVar)) {
                    i23 = 67108864;
                } else {
                    i23 = 33554432;
                }
                i13 |= i23;
            }
            if ((i11 & 805306368) == 0) {
                if (sVar2.h(onTermsOfUseClick)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i13 |= i22;
            }
            if (sVar2.h(onPrivacyPolicyClick)) {
                c11 = 4;
            } else {
                c11 = 2;
            }
            if (sVar2.T(i13 & 1, (i13 & 306783379) == 306783378 || (c11 & 3) != 2)) {
                sVar2.Y();
                if ((i11 & 1) != 0 || sVar2.C()) {
                    sVar2.d0(-1614864554);
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar2, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModel viewModelA = i20.b.a(z.a(ni.m.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), null);
                    sVar2.p(false);
                    mVar3 = (ni.m) viewModelA;
                    i14 = i13 & (-7169);
                    if (i27 != 0) {
                        i15 = i14;
                        mVar4 = mVar3;
                        z13 = true;
                    } else {
                        z13 = z11;
                        i15 = i14;
                        mVar4 = mVar3;
                    }
                } else {
                    sVar2.W();
                    z13 = z11;
                    i15 = i13 & (-7169);
                    mVar4 = mVar;
                }
                sVar2.q();
                b3 b3VarCollectAsStateWithLifecycle17 = FlowExtKt.collectAsStateWithLifecycle(mVar4.Z, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.f29438d, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                b3VarCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.K, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.H, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                b3VarCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.U, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                b3VarCollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.L, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                b3VarCollectAsStateWithLifecycle5 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.M, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                b3VarCollectAsStateWithLifecycle6 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.N, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                b3VarCollectAsStateWithLifecycle7 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.O, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                b3VarCollectAsStateWithLifecycle8 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.P, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                b3 b3VarCollectAsStateWithLifecycle18 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.Q, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                b3VarCollectAsStateWithLifecycle9 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.R, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                b3VarCollectAsStateWithLifecycle10 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.S, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                b3VarCollectAsStateWithLifecycle11 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.T, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                b3VarCollectAsStateWithLifecycle12 = FlowExtKt.collectAsStateWithLifecycle(mVar4.H, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                b3VarCollectAsStateWithLifecycle13 = FlowExtKt.collectAsStateWithLifecycle(mVar4.L, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                b3VarCollectAsStateWithLifecycle14 = FlowExtKt.collectAsStateWithLifecycle(mVar4.M, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                b3VarCollectAsStateWithLifecycle15 = FlowExtKt.collectAsStateWithLifecycle(mVar4.N, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                b3VarCollectAsStateWithLifecycle16 = FlowExtKt.collectAsStateWithLifecycle(mVar4.O, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = t.B(ry.r.f50854a);
                    sVar2.o0(objQ);
                }
                b1Var = (b1) objQ;
                objQ2 = sVar2.Q();
                if (objQ2 == gVar) {
                    objQ2 = t.B(p.ANNUALLY);
                    sVar2.o0(objQ2);
                }
                b1Var2 = (b1) objQ2;
                com.android.billingclient.api.o oVar3 = (com.android.billingclient.api.o) b3VarCollectAsStateWithLifecycle16.getValue();
                zF = sVar2.f(b3VarCollectAsStateWithLifecycle16) | sVar2.f(b3VarCollectAsStateWithLifecycle12) | sVar2.f(b3VarCollectAsStateWithLifecycle13) | sVar2.f(b3VarCollectAsStateWithLifecycle15) | sVar2.f(b3VarCollectAsStateWithLifecycle14);
                objQ3 = sVar2.Q();
                if (!zF || objQ3 == gVar) {
                    objQ3 = new k9.t(b3VarCollectAsStateWithLifecycle16, b3VarCollectAsStateWithLifecycle12, b1Var2, b3VarCollectAsStateWithLifecycle13, b3VarCollectAsStateWithLifecycle15, b3VarCollectAsStateWithLifecycle14, null);
                    b3Var = b3VarCollectAsStateWithLifecycle16;
                    b3Var2 = b3VarCollectAsStateWithLifecycle15;
                    b3Var3 = b3VarCollectAsStateWithLifecycle14;
                    sVar2.o0(objQ3);
                } else {
                    b3Var = b3VarCollectAsStateWithLifecycle16;
                    b3Var2 = b3VarCollectAsStateWithLifecycle15;
                    b3Var3 = b3VarCollectAsStateWithLifecycle14;
                }
                t.f((fz.e) objQ3, oVar3, sVar2);
                com.android.billingclient.api.o oVar4 = (com.android.billingclient.api.o) r26.getValue();
                com.android.billingclient.api.o oVar5 = (com.android.billingclient.api.o) b3Var2.getValue();
                b3Var4 = b3Var;
                Integer numValueOf = Integer.valueOf(((BillingPageRecomConfig) b3VarCollectAsStateWithLifecycle3.getValue()).getRecomType());
                zF2 = sVar2.f(b3VarCollectAsStateWithLifecycle3) | sVar2.h(mVar4) | sVar2.f(r26) | sVar2.f(b3VarCollectAsStateWithLifecycle4);
                objQ4 = sVar2.Q();
                if (!zF2 || objQ4 == gVar) {
                    ni.m mVar6 = mVar4;
                    b1Var3 = b1Var;
                    objQ4 = new m(mVar6, b3VarCollectAsStateWithLifecycle3, r26, b3VarCollectAsStateWithLifecycle4, b1Var3, null, 0);
                    mVar5 = mVar6;
                    b3Var5 = b3VarCollectAsStateWithLifecycle3;
                    b3Var6 = r26;
                    sVar2.o0(objQ4);
                } else {
                    ni.m mVar7 = mVar4;
                    b3Var5 = b3VarCollectAsStateWithLifecycle3;
                    mVar5 = mVar7;
                    b1Var3 = b1Var;
                    b3Var6 = b3VarCollectAsStateWithLifecycle12;
                }
                t.h(oVar4, oVar5, numValueOf, (fz.e) objQ4, sVar2);
                com.android.billingclient.api.o oVar6 = (com.android.billingclient.api.o) b3Var2.getValue();
                Integer numValueOf2 = Integer.valueOf(((BillingPageRecomConfig) b3Var5.getValue()).getRecomType());
                zF3 = sVar2.f(b3Var5) | sVar2.h(mVar5) | sVar2.f(b3Var2) | sVar2.f(r28);
                objQ5 = sVar2.Q();
                if (zF3 || objQ5 == gVar) {
                    objQ5 = new m(mVar5, b3Var5, b3Var2, b3VarCollectAsStateWithLifecycle4, b1Var3, null, 1);
                    sVar2.o0(objQ5);
                }
                t.g(oVar6, numValueOf2, (fz.e) objQ5, sVar2);
                zD = sVar2.d(((p) b1Var2.getValue()).ordinal()) | sVar2.f((String) b3VarCollectAsStateWithLifecycle8.getValue()) | sVar2.f((String) b3VarCollectAsStateWithLifecycle9.getValue()) | sVar2.f((String) b3VarCollectAsStateWithLifecycle18.getValue());
                Object objQ17 = sVar2.Q();
                if (!zD || objQ17 == gVar) {
                    i16 = n.f57836a[((p) b1Var2.getValue()).ordinal()];
                    if (i16 != 1) {
                        i17 = 2;
                        if (i16 != 2 || i16 == 3) {
                            str2 = (String) b3VarCollectAsStateWithLifecycle9.getValue();
                        } else {
                            if (i16 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str2 = (String) b3VarCollectAsStateWithLifecycle18.getValue();
                        }
                    } else {
                        i17 = 2;
                        str2 = (String) b3VarCollectAsStateWithLifecycle8.getValue();
                    }
                    objB = t.B(str2);
                    sVar2.o0(objB);
                } else {
                    objB = objQ17;
                    i17 = 2;
                }
                b1Var4 = (b1) objB;
                zF4 = sVar2.f((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()) | sVar2.d(((p) b1Var2.getValue()).ordinal());
                objQ6 = sVar2.Q();
                if (zF4 || objQ6 == gVar) {
                    i18 = n.f57836a[((p) b1Var2.getValue()).ordinal()];
                    if (i18 == 1) {
                        jW = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonBuyYearlyText());
                    } else if (i18 != i17 || i18 == 3) {
                        jW = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonText());
                    } else {
                        if (i18 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jW = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonBuyLifetimeText());
                    }
                    objQ6 = t.B(new x(jW));
                    sVar2.o0(objQ6);
                }
                b1Var5 = (b1) objQ6;
                zD2 = sVar2.d(((p) b1Var2.getValue()).ordinal()) | sVar2.f((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue());
                objQ7 = sVar2.Q();
                if (zD2 || objQ7 == gVar) {
                    i19 = n.f57836a[((p) b1Var2.getValue()).ordinal()];
                    if (i19 == 1) {
                        jW2 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonBuyYearly());
                    } else if (i19 != i17 || i19 == 3) {
                        jW2 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButton());
                    } else {
                        if (i19 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jW2 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonBuyLifetime());
                    }
                    objQ7 = t.B(new x(jW2));
                    sVar2.o0(objQ7);
                }
                b1 b1Var8 = (b1) objQ7;
                zD3 = sVar2.d(((p) b1Var2.getValue()).ordinal()) | sVar2.f((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue());
                objQ8 = sVar2.Q();
                if (zD3 || objQ8 == gVar) {
                    i21 = n.f57836a[((p) b1Var2.getValue()).ordinal()];
                    if (i21 == 1) {
                        jW3 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonBuyYearlyEnd());
                    } else if (i21 != i17 || i21 == 3) {
                        jW3 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonEnd());
                    } else {
                        if (i21 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jW3 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonBuyLifetimeEnd());
                    }
                    objQ8 = t.B(new x(jW3));
                    sVar2.o0(objQ8);
                }
                b1Var6 = (b1) objQ8;
                w wVarA = y.a(0, sVar2, 3);
                objQ9 = sVar2.Q();
                if (objQ9 == gVar) {
                    objQ9 = defpackage.e.v(0, sVar2);
                }
                a1Var = (a1) objQ9;
                objQ10 = sVar2.Q();
                if (objQ10 == gVar) {
                    objQ10 = t.s(new gr.j(a1Var, 13));
                    sVar2.o0(objQ10);
                }
                b3 b3Var11 = (b3) objQ10;
                jW4 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorTitle());
                zF5 = sVar2.f(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorBackgroundEnd()) | sVar2.f(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorBackgroundStart());
                objQ11 = sVar2.Q();
                if (zF5 || objQ11 == gVar) {
                    objQ11 = p3.A(ns.o.L(new x(j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorBackgroundStart())), new x(j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorBackgroundEnd()))));
                    sVar2.o0(objQ11);
                }
                tVar = (g2.t) objQ11;
                oVar = z1.o.f58481a;
                z1.r rVarE = e2.e(oVar, 1.0f);
                gVar2 = gVar;
                q0 q0VarD = j0.o.d(z1.c.f58464b, false);
                iHashCode = Long.hashCode(sVar2.T);
                q1 q1VarL = sVar2.l();
                z1.r rVarC = z1.a.c(sVar2, rVarE);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                y2.h hVar2 = y2.j.f56917f;
                t.J(hVar2, q0VarD, sVar2);
                y2.h hVar3 = y2.j.f56916e;
                t.J(hVar3, q1VarL, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S) {
                    iVar2 = iVar;
                } else {
                    iVar2 = iVar;
                    if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    t.J(hVar4, rVarC, sVar2);
                    if (z13) {
                        rVarG = j0.c.v(d0.n.g(oVar, tVar, null, 6));
                    } else {
                        rVarG = d0.n.g(oVar, tVar, null, 6);
                    }
                    c3Var = ju.f.f37376j;
                    if (((Boolean) sVar2.j(c3Var)).booleanValue()) {
                        f5 = 0.7f;
                    } else {
                        f5 = 1.0f;
                    }
                    z1.r rVarC2 = e2.c(e2.e(rVarG, f5), 1.0f);
                    boolean zF6 = sVar2.f(b3VarCollectAsStateWithLifecycle2);
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z21 = z14 | zF6;
                    if ((i15 & 458752) == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zF7 = z21 | z15 | sVar2.f(b3VarCollectAsStateWithLifecycle10) | sVar2.f(b3VarCollectAsStateWithLifecycle5) | sVar2.f(b3VarCollectAsStateWithLifecycle11);
                    b3Var7 = b3Var6;
                    b3Var8 = b3Var3;
                    b1Var7 = b1Var8;
                    boolean zF8 = zF7 | sVar2.f(b3Var7) | sVar2.h(mVar5) | sVar2.f(b3Var5) | sVar2.f(b3VarCollectAsStateWithLifecycle6) | sVar2.f(b3VarCollectAsStateWithLifecycle) | sVar2.f(b3VarCollectAsStateWithLifecycle13) | sVar2.f(b3Var8) | sVar2.f(b3VarCollectAsStateWithLifecycle7) | sVar2.f(b3Var2) | sVar2.f(b1Var4) | sVar2.f(b1Var5) | sVar2.f(b1Var8) | sVar2.f(b1Var6) | sVar2.f(b3Var4) | sVar2.h(dVar) | sVar2.e(jW4);
                    if ((i15 & 1879048192) == 536870912) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z22 = zF8 | z16;
                    if ((c11 & 14) == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z23 = z22 | z17;
                    if ((i15 & 29360128) == 8388608) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z24 = z23 | z18;
                    if ((i15 & 234881024) == 67108864) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = z24 | z19;
                    objQ12 = sVar2.Q();
                    if (z20) {
                        b3Var9 = b3VarCollectAsStateWithLifecycle2;
                        gVar3 = gVar2;
                        f11 = 1.0f;
                        final ni.m mVar8 = mVar5;
                        final b3 b3Var12 = b3Var5;
                        final b1 b1Var9 = b1Var3;
                        final b3 b3Var13 = b3Var2;
                        obj = new fz.c() { // from class: yg.f
                            @Override // fz.c
                            public final Object invoke(Object obj2) {
                                l0.h LazyColumn = (l0.h) obj2;
                                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                final String str4 = str;
                                fz.a aVar3 = onFinishClick;
                                final b3 b3Var14 = b3Var9;
                                l0.h.p(LazyColumn, null, new t1.d(new defpackage.d(str4, aVar3, b3Var14, 20), true, -1625515996), 3);
                                l0.h.p(LazyColumn, null, new t1.d(new tp.u(4, b3VarCollectAsStateWithLifecycle10, b3Var14), true, 1026356699), 3);
                                b1 b1Var10 = b1Var9;
                                final ni.m mVar9 = mVar8;
                                l0.h.p(LazyColumn, null, new t1.d(new ei.n(b1Var10, mVar9, b1Var2, b3VarCollectAsStateWithLifecycle5, b3VarCollectAsStateWithLifecycle11, b3Var7, b3Var14, b3Var12, b3VarCollectAsStateWithLifecycle6, b3VarCollectAsStateWithLifecycle, b3VarCollectAsStateWithLifecycle13, b3Var8, b3VarCollectAsStateWithLifecycle7, b3Var13), true, -1179285668), 3);
                                final b3 b3Var15 = b3Var4;
                                final xg.d dVar2 = dVar;
                                final long j11 = jW4;
                                final b1 b1Var11 = b1Var4;
                                final b1 b1Var12 = b1Var5;
                                final b1 b1Var13 = b1Var7;
                                final b1 b1Var14 = b1Var6;
                                final a1 a1Var2 = a1Var;
                                l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.h
                                    @Override // fz.f
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        l0.c item = (l0.c) obj3;
                                        l1.n nVar2 = (l1.n) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        kotlin.jvm.internal.m.f(item, "$this$item");
                                        l1.s sVar3 = (l1.s) nVar2;
                                        if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            String str5 = (String) b1Var11.getValue();
                                            long j12 = ((x) b1Var12.getValue()).f28624a;
                                            long j13 = ((x) b1Var13.getValue()).f28624a;
                                            long j14 = ((x) b1Var14.getValue()).f28624a;
                                            float f13 = 36;
                                            z1.o oVar7 = z1.o.f58481a;
                                            z1.r rVarE2 = j0.c.E(oVar7, f13, 29, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8);
                                            Object objQ18 = sVar3.Q();
                                            l1.g gVar5 = l1.m.f39353a;
                                            if (objQ18 == gVar5) {
                                                objQ18 = new bt.a2(a1Var2, 17);
                                                sVar3.o0(objQ18);
                                            }
                                            z1.r rVarN = a0.n(rVarE2, (fz.c) objQ18);
                                            b3 b3Var16 = b3Var15;
                                            boolean zF9 = sVar3.f(b3Var16);
                                            ni.m mVar10 = mVar9;
                                            boolean zH = zF9 | sVar3.h(mVar10);
                                            xg.d dVar3 = dVar2;
                                            boolean zH2 = zH | sVar3.h(dVar3);
                                            String str6 = str4;
                                            boolean zF10 = zH2 | sVar3.f(str6);
                                            Object objQ19 = sVar3.Q();
                                            if (zF10 || objQ19 == gVar5) {
                                                objQ19 = new j(b3Var16, mVar10, dVar3, str6, 1);
                                                sVar3.o0(objQ19);
                                            }
                                            o.c(str5, j12, j13, j14, rVarN, (fz.a) objQ19, sVar3, 0);
                                            ua.b(ub.a.e0(sVar3, R.string.cancel_anytime_or_manage_subscriptions_in_google_play), e2.e(j0.c.E(j0.c.C(oVar7, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar3.j(ua.f31167a), j11, j3.A(11), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar3, 48, 0, 65532);
                                        } else {
                                            sVar3.W();
                                        }
                                        return b0.f48488a;
                                    }
                                }, true, 910039261), 3);
                                l0.h.p(LazyColumn, null, new t1.d(new r0(j11, 4), true, -1295603106), 3);
                                final int i28 = 0;
                                l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.i
                                    @Override // fz.f
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        switch (i28) {
                                            case 0:
                                                l0.c item = (l0.c) obj3;
                                                l1.n nVar2 = (l1.n) obj4;
                                                int iIntValue = ((Integer) obj5).intValue();
                                                kotlin.jvm.internal.m.f(item, "$this$item");
                                                l1.s sVar3 = (l1.s) nVar2;
                                                if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    String strE0 = ub.a.e0(sVar3, R.string.why_learn_with_the_deer);
                                                    float f13 = 44;
                                                    z1.o oVar7 = z1.o.f58481a;
                                                    z1.r rVarE2 = e2.e(j0.c.E(oVar7, f13, 58, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                    long j12 = j11;
                                                    v vVarA = d0.n.a(j12, 1);
                                                    o.h(0, j12, 0L, strE0, sVar3, j0.c.B(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.a(), rVarE2), 16, 10));
                                                    float f14 = 20;
                                                    z1.r rVarD = j0.c.D(e2.e(j0.c.C(j0.c.E(oVar7, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 14, 24, f14, 36);
                                                    u uVarA = j0.t.a(j0.i.g(26), z1.c.O, sVar3, 6);
                                                    int iHashCode3 = Long.hashCode(sVar3.T);
                                                    q1 q1VarL2 = sVar3.l();
                                                    z1.r rVarC3 = z1.a.c(sVar3, rVarD);
                                                    y2.k.J.getClass();
                                                    y2.i iVar3 = y2.j.f56913b;
                                                    sVar3.h0();
                                                    if (sVar3.S) {
                                                        sVar3.k(iVar3);
                                                    } else {
                                                        sVar3.r0();
                                                    }
                                                    t.J(y2.j.f56917f, uVarA, sVar3);
                                                    t.J(y2.j.f56916e, q1VarL2, sVar3);
                                                    y2.h hVar5 = y2.j.f56918g;
                                                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                                                        defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar5);
                                                    }
                                                    t.J(y2.j.f56915d, rVarC3, sVar3);
                                                    String[] strArr = {ub.a.e0(sVar3, R.string.accelerated_learning), ub.a.e0(sVar3, R.string.effective_results_a), ub.a.e0(sVar3, R.string.convenient_to_use_a)};
                                                    String[] strArr2 = {ub.a.e0(sVar3, R.string.systematic_curricula_guarantee_a_fast_path_to_intermediate_a), ub.a.e0(sVar3, R.string.everything_is_clarified_with_detailed_explanations_and_hd_audio_a), ub.a.e0(sVar3, R.string.feel_supported_with_settings_customized_for_asian_languages_a)};
                                                    b3 b3Var16 = b3Var14;
                                                    String[] strArr3 = {((MergedBillingThemeBillingPage) b3Var16.getValue()).getWhyLearnIcon1Url(), ((MergedBillingThemeBillingPage) b3Var16.getValue()).getWhyLearnIcon2Url(), ((MergedBillingThemeBillingPage) b3Var16.getValue()).getWhyLearnIcon3Url()};
                                                    Integer[] numArr = {Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_1), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_2), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_3)};
                                                    sVar3.d0(-663461197);
                                                    int i29 = 0;
                                                    int i30 = 0;
                                                    while (i29 < 3) {
                                                        long j13 = j12;
                                                        l1.s sVar4 = sVar3;
                                                        o.e(strArr3[i30], numArr[i30].intValue(), strArr[i29], strArr2[i30], j13, j3.A(16), j3.A(14), sVar4, 1769472);
                                                        j12 = j13;
                                                        sVar3 = sVar4;
                                                        i29++;
                                                        i30++;
                                                    }
                                                    sVar3.p(false);
                                                    sVar3.p(true);
                                                } else {
                                                    sVar3.W();
                                                }
                                                break;
                                            default:
                                                l0.c item2 = (l0.c) obj3;
                                                l1.n nVar3 = (l1.n) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                kotlin.jvm.internal.m.f(item2, "$this$item");
                                                l1.s sVar5 = (l1.s) nVar3;
                                                if (sVar5.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    String strE1 = ub.a.e0(sVar5, R.string._5m_happy_learners);
                                                    float f15 = 44;
                                                    z1.o oVar8 = z1.o.f58481a;
                                                    z1.r rVarE3 = e2.e(j0.c.E(oVar8, f15, 40, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                    final long j14 = j11;
                                                    v vVarA2 = d0.n.a(j14, 1);
                                                    float f16 = 16;
                                                    o.h(0, j14, 0L, strE1, sVar5, j0.c.B(d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.a(), rVarE3), f16, 10));
                                                    z1.r rVarE4 = e2.e(oVar8, 1.0f);
                                                    u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar5, 48);
                                                    int iHashCode4 = Long.hashCode(sVar5.T);
                                                    q1 q1VarL3 = sVar5.l();
                                                    z1.r rVarC4 = z1.a.c(sVar5, rVarE4);
                                                    y2.k.J.getClass();
                                                    y2.i iVar4 = y2.j.f56913b;
                                                    sVar5.h0();
                                                    if (sVar5.S) {
                                                        sVar5.k(iVar4);
                                                    } else {
                                                        sVar5.r0();
                                                    }
                                                    t.J(y2.j.f56917f, uVarA2, sVar5);
                                                    t.J(y2.j.f56916e, q1VarL3, sVar5);
                                                    y2.h hVar6 = y2.j.f56918g;
                                                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                                                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar6);
                                                    }
                                                    t.J(y2.j.f56915d, rVarC4, sVar5);
                                                    d0.n.c(se.k.y(R.drawable.ic_sub_intro_play, sVar5, 0), null, j0.c.C(oVar8, CropImageView.DEFAULT_ASPECT_RATIO, f16, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 440, 120);
                                                    ua.b(ub.a.e0(sVar5, R.string.editor_s_choice_2018), null, j14, j3.A(18), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar5, 3072, 0, 131058);
                                                    final int iIntValue3 = ((Number) sVar5.j(ju.f.f37371e)).intValue();
                                                    boolean zD4 = sVar5.d(iIntValue3);
                                                    Object objQ18 = sVar5.Q();
                                                    l1.g gVar5 = l1.m.f39353a;
                                                    if (zD4 || objQ18 == gVar5) {
                                                        objQ18 = new fu.x(iIntValue3, 6);
                                                        sVar5.o0(objQ18);
                                                    }
                                                    o0.b bVarB = o0.w.b(0, 0, 3, (fz.a) objQ18, sVar5);
                                                    final b3 b3Var17 = b3Var14;
                                                    boolean zF9 = sVar5.f((MergedBillingThemeBillingPage) b3Var17.getValue());
                                                    Object objQ19 = sVar5.Q();
                                                    Object obj6 = objQ19;
                                                    if (zF9 || objQ19 == gVar5) {
                                                        x[] xVarArr = {new x(j3.w(((MergedBillingThemeBillingPage) b3Var17.getValue()).getColorUserReviewNameIcon1())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var17.getValue()).getColorUserReviewNameIcon2())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var17.getValue()).getColorUserReviewNameIcon3())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var17.getValue()).getColorUserReviewNameIcon4()))};
                                                        sVar5.o0(xVarArr);
                                                        obj6 = xVarArr;
                                                    }
                                                    final x[] xVarArr2 = (x[]) obj6;
                                                    float f17 = 32;
                                                    ve.i.d(bVarB, null, new v1(f17, f16, f17, f16), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-1375898409, new fz.g() { // from class: yg.k
                                                        @Override // fz.g
                                                        public final Object f(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                            o0.o HorizontalPager = (o0.o) obj7;
                                                            int iIntValue4 = ((Integer) obj8).intValue();
                                                            l1.n nVar4 = (l1.n) obj9;
                                                            ((Integer) obj10).getClass();
                                                            kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                                                            z1.r rVarC5 = j0.c.C(e2.g(z1.o.f58481a, 240), 10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                                            b3 b3Var18 = b3Var17;
                                                            k7.d(rVarC5, null, k7.p(j3.w(((MergedBillingThemeBillingPage) b3Var18.getValue()).getColorUserReviewCard()), nVar4, 0), k7.q(62, 4), null, t1.e.d(1410031433, new jr.y(iIntValue3, iIntValue4, j14, xVarArr2, b3Var18), nVar4), nVar4, 196614, 18);
                                                            return b0.f48488a;
                                                        }
                                                    }, sVar5), sVar5, 384, 16378);
                                                    sVar5.p(true);
                                                } else {
                                                    sVar5.W();
                                                }
                                                break;
                                        }
                                        return b0.f48488a;
                                    }
                                }, true, 793721823), 3);
                                final int i29 = 1;
                                l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.i
                                    @Override // fz.f
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        switch (i29) {
                                            case 0:
                                                l0.c item = (l0.c) obj3;
                                                l1.n nVar2 = (l1.n) obj4;
                                                int iIntValue = ((Integer) obj5).intValue();
                                                kotlin.jvm.internal.m.f(item, "$this$item");
                                                l1.s sVar3 = (l1.s) nVar2;
                                                if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    String strE0 = ub.a.e0(sVar3, R.string.why_learn_with_the_deer);
                                                    float f13 = 44;
                                                    z1.o oVar7 = z1.o.f58481a;
                                                    z1.r rVarE2 = e2.e(j0.c.E(oVar7, f13, 58, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                    long j12 = j11;
                                                    v vVarA = d0.n.a(j12, 1);
                                                    o.h(0, j12, 0L, strE0, sVar3, j0.c.B(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.a(), rVarE2), 16, 10));
                                                    float f14 = 20;
                                                    z1.r rVarD = j0.c.D(e2.e(j0.c.C(j0.c.E(oVar7, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 14, 24, f14, 36);
                                                    u uVarA = j0.t.a(j0.i.g(26), z1.c.O, sVar3, 6);
                                                    int iHashCode3 = Long.hashCode(sVar3.T);
                                                    q1 q1VarL2 = sVar3.l();
                                                    z1.r rVarC3 = z1.a.c(sVar3, rVarD);
                                                    y2.k.J.getClass();
                                                    y2.i iVar3 = y2.j.f56913b;
                                                    sVar3.h0();
                                                    if (sVar3.S) {
                                                        sVar3.k(iVar3);
                                                    } else {
                                                        sVar3.r0();
                                                    }
                                                    t.J(y2.j.f56917f, uVarA, sVar3);
                                                    t.J(y2.j.f56916e, q1VarL2, sVar3);
                                                    y2.h hVar5 = y2.j.f56918g;
                                                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                                                        defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar5);
                                                    }
                                                    t.J(y2.j.f56915d, rVarC3, sVar3);
                                                    String[] strArr = {ub.a.e0(sVar3, R.string.accelerated_learning), ub.a.e0(sVar3, R.string.effective_results_a), ub.a.e0(sVar3, R.string.convenient_to_use_a)};
                                                    String[] strArr2 = {ub.a.e0(sVar3, R.string.systematic_curricula_guarantee_a_fast_path_to_intermediate_a), ub.a.e0(sVar3, R.string.everything_is_clarified_with_detailed_explanations_and_hd_audio_a), ub.a.e0(sVar3, R.string.feel_supported_with_settings_customized_for_asian_languages_a)};
                                                    b3 b3Var16 = b3Var14;
                                                    String[] strArr3 = {((MergedBillingThemeBillingPage) b3Var16.getValue()).getWhyLearnIcon1Url(), ((MergedBillingThemeBillingPage) b3Var16.getValue()).getWhyLearnIcon2Url(), ((MergedBillingThemeBillingPage) b3Var16.getValue()).getWhyLearnIcon3Url()};
                                                    Integer[] numArr = {Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_1), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_2), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_3)};
                                                    sVar3.d0(-663461197);
                                                    int i210 = 0;
                                                    int i30 = 0;
                                                    while (i210 < 3) {
                                                        long j13 = j12;
                                                        l1.s sVar4 = sVar3;
                                                        o.e(strArr3[i30], numArr[i30].intValue(), strArr[i210], strArr2[i30], j13, j3.A(16), j3.A(14), sVar4, 1769472);
                                                        j12 = j13;
                                                        sVar3 = sVar4;
                                                        i210++;
                                                        i30++;
                                                    }
                                                    sVar3.p(false);
                                                    sVar3.p(true);
                                                } else {
                                                    sVar3.W();
                                                }
                                                break;
                                            default:
                                                l0.c item2 = (l0.c) obj3;
                                                l1.n nVar3 = (l1.n) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                kotlin.jvm.internal.m.f(item2, "$this$item");
                                                l1.s sVar5 = (l1.s) nVar3;
                                                if (sVar5.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    String strE1 = ub.a.e0(sVar5, R.string._5m_happy_learners);
                                                    float f15 = 44;
                                                    z1.o oVar8 = z1.o.f58481a;
                                                    z1.r rVarE3 = e2.e(j0.c.E(oVar8, f15, 40, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                    final long j14 = j11;
                                                    v vVarA2 = d0.n.a(j14, 1);
                                                    float f16 = 16;
                                                    o.h(0, j14, 0L, strE1, sVar5, j0.c.B(d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.a(), rVarE3), f16, 10));
                                                    z1.r rVarE4 = e2.e(oVar8, 1.0f);
                                                    u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar5, 48);
                                                    int iHashCode4 = Long.hashCode(sVar5.T);
                                                    q1 q1VarL3 = sVar5.l();
                                                    z1.r rVarC4 = z1.a.c(sVar5, rVarE4);
                                                    y2.k.J.getClass();
                                                    y2.i iVar4 = y2.j.f56913b;
                                                    sVar5.h0();
                                                    if (sVar5.S) {
                                                        sVar5.k(iVar4);
                                                    } else {
                                                        sVar5.r0();
                                                    }
                                                    t.J(y2.j.f56917f, uVarA2, sVar5);
                                                    t.J(y2.j.f56916e, q1VarL3, sVar5);
                                                    y2.h hVar6 = y2.j.f56918g;
                                                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                                                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar6);
                                                    }
                                                    t.J(y2.j.f56915d, rVarC4, sVar5);
                                                    d0.n.c(se.k.y(R.drawable.ic_sub_intro_play, sVar5, 0), null, j0.c.C(oVar8, CropImageView.DEFAULT_ASPECT_RATIO, f16, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 440, 120);
                                                    ua.b(ub.a.e0(sVar5, R.string.editor_s_choice_2018), null, j14, j3.A(18), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar5, 3072, 0, 131058);
                                                    final int iIntValue3 = ((Number) sVar5.j(ju.f.f37371e)).intValue();
                                                    boolean zD4 = sVar5.d(iIntValue3);
                                                    Object objQ18 = sVar5.Q();
                                                    l1.g gVar5 = l1.m.f39353a;
                                                    if (zD4 || objQ18 == gVar5) {
                                                        objQ18 = new fu.x(iIntValue3, 6);
                                                        sVar5.o0(objQ18);
                                                    }
                                                    o0.b bVarB = o0.w.b(0, 0, 3, (fz.a) objQ18, sVar5);
                                                    final b3 b3Var17 = b3Var14;
                                                    boolean zF9 = sVar5.f((MergedBillingThemeBillingPage) b3Var17.getValue());
                                                    Object objQ19 = sVar5.Q();
                                                    Object obj6 = objQ19;
                                                    if (zF9 || objQ19 == gVar5) {
                                                        x[] xVarArr = {new x(j3.w(((MergedBillingThemeBillingPage) b3Var17.getValue()).getColorUserReviewNameIcon1())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var17.getValue()).getColorUserReviewNameIcon2())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var17.getValue()).getColorUserReviewNameIcon3())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var17.getValue()).getColorUserReviewNameIcon4()))};
                                                        sVar5.o0(xVarArr);
                                                        obj6 = xVarArr;
                                                    }
                                                    final x[] xVarArr2 = (x[]) obj6;
                                                    float f17 = 32;
                                                    ve.i.d(bVarB, null, new v1(f17, f16, f17, f16), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-1375898409, new fz.g() { // from class: yg.k
                                                        @Override // fz.g
                                                        public final Object f(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                            o0.o HorizontalPager = (o0.o) obj7;
                                                            int iIntValue4 = ((Integer) obj8).intValue();
                                                            l1.n nVar4 = (l1.n) obj9;
                                                            ((Integer) obj10).getClass();
                                                            kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                                                            z1.r rVarC5 = j0.c.C(e2.g(z1.o.f58481a, 240), 10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                                            b3 b3Var18 = b3Var17;
                                                            k7.d(rVarC5, null, k7.p(j3.w(((MergedBillingThemeBillingPage) b3Var18.getValue()).getColorUserReviewCard()), nVar4, 0), k7.q(62, 4), null, t1.e.d(1410031433, new jr.y(iIntValue3, iIntValue4, j14, xVarArr2, b3Var18), nVar4), nVar4, 196614, 18);
                                                            return b0.f48488a;
                                                        }
                                                    }, sVar5), sVar5, 384, 16378);
                                                    sVar5.p(true);
                                                } else {
                                                    sVar5.W();
                                                }
                                                break;
                                        }
                                        return b0.f48488a;
                                    }
                                }, true, -1411920544), 3);
                                l0.h.p(LazyColumn, null, new t1.d(new r0(j11, 5), true, 677404385), 3);
                                l0.h.p(LazyColumn, null, new t1.d(new j1(j11, onTermsOfUseClick, onPrivacyPolicyClick, onContactUsClick, aVar, 1), true, -1528237982), 3);
                                if (!kotlin.jvm.internal.m.a(str4, "bottom_tab")) {
                                    l0.h.p(LazyColumn, null, r.f57842b, 3);
                                }
                                return b0.f48488a;
                            }
                        };
                        str3 = str;
                        mVar5 = mVar8;
                        b3VarCollectAsStateWithLifecycle6 = b3VarCollectAsStateWithLifecycle6;
                        b3Var10 = b3VarCollectAsStateWithLifecycle;
                        b1Var7 = b1Var7;
                        sVar = sVar2;
                        sVar.o0(obj);
                    } else if (objQ12 == gVar2) {
                        gVar2 = gVar2;
                        b3Var9 = b3VarCollectAsStateWithLifecycle2;
                        gVar3 = gVar2;
                        f11 = 1.0f;
                        final ni.m mVar9 = mVar5;
                        final b3 b3Var14 = b3Var5;
                        final b1 b1Var10 = b1Var3;
                        final b3 b3Var15 = b3Var2;
                        obj = new fz.c() { // from class: yg.f
                            @Override // fz.c
                            public final Object invoke(Object obj2) {
                                l0.h LazyColumn = (l0.h) obj2;
                                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                final String str4 = str;
                                fz.a aVar3 = onFinishClick;
                                final b3 b3Var16 = b3Var9;
                                l0.h.p(LazyColumn, null, new t1.d(new defpackage.d(str4, aVar3, b3Var16, 20), true, -1625515996), 3);
                                l0.h.p(LazyColumn, null, new t1.d(new tp.u(4, b3VarCollectAsStateWithLifecycle10, b3Var16), true, 1026356699), 3);
                                b1 b1Var11 = b1Var10;
                                final ni.m mVar10 = mVar9;
                                l0.h.p(LazyColumn, null, new t1.d(new ei.n(b1Var11, mVar10, b1Var2, b3VarCollectAsStateWithLifecycle5, b3VarCollectAsStateWithLifecycle11, b3Var7, b3Var16, b3Var14, b3VarCollectAsStateWithLifecycle6, b3VarCollectAsStateWithLifecycle, b3VarCollectAsStateWithLifecycle13, b3Var8, b3VarCollectAsStateWithLifecycle7, b3Var15), true, -1179285668), 3);
                                final b3 b3Var17 = b3Var4;
                                final xg.d dVar2 = dVar;
                                final long j11 = jW4;
                                final b1 b1Var12 = b1Var4;
                                final b1 b1Var13 = b1Var5;
                                final b1 b1Var14 = b1Var7;
                                final b1 b1Var15 = b1Var6;
                                final a1 a1Var2 = a1Var;
                                l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.h
                                    @Override // fz.f
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        l0.c item = (l0.c) obj3;
                                        l1.n nVar2 = (l1.n) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        kotlin.jvm.internal.m.f(item, "$this$item");
                                        l1.s sVar3 = (l1.s) nVar2;
                                        if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            String str5 = (String) b1Var12.getValue();
                                            long j12 = ((x) b1Var13.getValue()).f28624a;
                                            long j13 = ((x) b1Var14.getValue()).f28624a;
                                            long j14 = ((x) b1Var15.getValue()).f28624a;
                                            float f13 = 36;
                                            z1.o oVar7 = z1.o.f58481a;
                                            z1.r rVarE2 = j0.c.E(oVar7, f13, 29, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8);
                                            Object objQ18 = sVar3.Q();
                                            l1.g gVar5 = l1.m.f39353a;
                                            if (objQ18 == gVar5) {
                                                objQ18 = new bt.a2(a1Var2, 17);
                                                sVar3.o0(objQ18);
                                            }
                                            z1.r rVarN = a0.n(rVarE2, (fz.c) objQ18);
                                            b3 b3Var18 = b3Var17;
                                            boolean zF9 = sVar3.f(b3Var18);
                                            ni.m mVar11 = mVar10;
                                            boolean zH = zF9 | sVar3.h(mVar11);
                                            xg.d dVar3 = dVar2;
                                            boolean zH2 = zH | sVar3.h(dVar3);
                                            String str6 = str4;
                                            boolean zF10 = zH2 | sVar3.f(str6);
                                            Object objQ19 = sVar3.Q();
                                            if (zF10 || objQ19 == gVar5) {
                                                objQ19 = new j(b3Var18, mVar11, dVar3, str6, 1);
                                                sVar3.o0(objQ19);
                                            }
                                            o.c(str5, j12, j13, j14, rVarN, (fz.a) objQ19, sVar3, 0);
                                            ua.b(ub.a.e0(sVar3, R.string.cancel_anytime_or_manage_subscriptions_in_google_play), e2.e(j0.c.E(j0.c.C(oVar7, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar3.j(ua.f31167a), j11, j3.A(11), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar3, 48, 0, 65532);
                                        } else {
                                            sVar3.W();
                                        }
                                        return b0.f48488a;
                                    }
                                }, true, 910039261), 3);
                                l0.h.p(LazyColumn, null, new t1.d(new r0(j11, 4), true, -1295603106), 3);
                                final int i28 = 0;
                                l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.i
                                    @Override // fz.f
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        switch (i28) {
                                            case 0:
                                                l0.c item = (l0.c) obj3;
                                                l1.n nVar2 = (l1.n) obj4;
                                                int iIntValue = ((Integer) obj5).intValue();
                                                kotlin.jvm.internal.m.f(item, "$this$item");
                                                l1.s sVar3 = (l1.s) nVar2;
                                                if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    String strE0 = ub.a.e0(sVar3, R.string.why_learn_with_the_deer);
                                                    float f13 = 44;
                                                    z1.o oVar7 = z1.o.f58481a;
                                                    z1.r rVarE2 = e2.e(j0.c.E(oVar7, f13, 58, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                    long j12 = j11;
                                                    v vVarA = d0.n.a(j12, 1);
                                                    o.h(0, j12, 0L, strE0, sVar3, j0.c.B(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.a(), rVarE2), 16, 10));
                                                    float f14 = 20;
                                                    z1.r rVarD = j0.c.D(e2.e(j0.c.C(j0.c.E(oVar7, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 14, 24, f14, 36);
                                                    u uVarA = j0.t.a(j0.i.g(26), z1.c.O, sVar3, 6);
                                                    int iHashCode3 = Long.hashCode(sVar3.T);
                                                    q1 q1VarL2 = sVar3.l();
                                                    z1.r rVarC3 = z1.a.c(sVar3, rVarD);
                                                    y2.k.J.getClass();
                                                    y2.i iVar3 = y2.j.f56913b;
                                                    sVar3.h0();
                                                    if (sVar3.S) {
                                                        sVar3.k(iVar3);
                                                    } else {
                                                        sVar3.r0();
                                                    }
                                                    t.J(y2.j.f56917f, uVarA, sVar3);
                                                    t.J(y2.j.f56916e, q1VarL2, sVar3);
                                                    y2.h hVar5 = y2.j.f56918g;
                                                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                                                        defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar5);
                                                    }
                                                    t.J(y2.j.f56915d, rVarC3, sVar3);
                                                    String[] strArr = {ub.a.e0(sVar3, R.string.accelerated_learning), ub.a.e0(sVar3, R.string.effective_results_a), ub.a.e0(sVar3, R.string.convenient_to_use_a)};
                                                    String[] strArr2 = {ub.a.e0(sVar3, R.string.systematic_curricula_guarantee_a_fast_path_to_intermediate_a), ub.a.e0(sVar3, R.string.everything_is_clarified_with_detailed_explanations_and_hd_audio_a), ub.a.e0(sVar3, R.string.feel_supported_with_settings_customized_for_asian_languages_a)};
                                                    b3 b3Var18 = b3Var16;
                                                    String[] strArr3 = {((MergedBillingThemeBillingPage) b3Var18.getValue()).getWhyLearnIcon1Url(), ((MergedBillingThemeBillingPage) b3Var18.getValue()).getWhyLearnIcon2Url(), ((MergedBillingThemeBillingPage) b3Var18.getValue()).getWhyLearnIcon3Url()};
                                                    Integer[] numArr = {Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_1), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_2), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_3)};
                                                    sVar3.d0(-663461197);
                                                    int i210 = 0;
                                                    int i30 = 0;
                                                    while (i210 < 3) {
                                                        long j13 = j12;
                                                        l1.s sVar4 = sVar3;
                                                        o.e(strArr3[i30], numArr[i30].intValue(), strArr[i210], strArr2[i30], j13, j3.A(16), j3.A(14), sVar4, 1769472);
                                                        j12 = j13;
                                                        sVar3 = sVar4;
                                                        i210++;
                                                        i30++;
                                                    }
                                                    sVar3.p(false);
                                                    sVar3.p(true);
                                                } else {
                                                    sVar3.W();
                                                }
                                                break;
                                            default:
                                                l0.c item2 = (l0.c) obj3;
                                                l1.n nVar3 = (l1.n) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                kotlin.jvm.internal.m.f(item2, "$this$item");
                                                l1.s sVar5 = (l1.s) nVar3;
                                                if (sVar5.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    String strE1 = ub.a.e0(sVar5, R.string._5m_happy_learners);
                                                    float f15 = 44;
                                                    z1.o oVar8 = z1.o.f58481a;
                                                    z1.r rVarE3 = e2.e(j0.c.E(oVar8, f15, 40, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                    final long j14 = j11;
                                                    v vVarA2 = d0.n.a(j14, 1);
                                                    float f16 = 16;
                                                    o.h(0, j14, 0L, strE1, sVar5, j0.c.B(d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.a(), rVarE3), f16, 10));
                                                    z1.r rVarE4 = e2.e(oVar8, 1.0f);
                                                    u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar5, 48);
                                                    int iHashCode4 = Long.hashCode(sVar5.T);
                                                    q1 q1VarL3 = sVar5.l();
                                                    z1.r rVarC4 = z1.a.c(sVar5, rVarE4);
                                                    y2.k.J.getClass();
                                                    y2.i iVar4 = y2.j.f56913b;
                                                    sVar5.h0();
                                                    if (sVar5.S) {
                                                        sVar5.k(iVar4);
                                                    } else {
                                                        sVar5.r0();
                                                    }
                                                    t.J(y2.j.f56917f, uVarA2, sVar5);
                                                    t.J(y2.j.f56916e, q1VarL3, sVar5);
                                                    y2.h hVar6 = y2.j.f56918g;
                                                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                                                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar6);
                                                    }
                                                    t.J(y2.j.f56915d, rVarC4, sVar5);
                                                    d0.n.c(se.k.y(R.drawable.ic_sub_intro_play, sVar5, 0), null, j0.c.C(oVar8, CropImageView.DEFAULT_ASPECT_RATIO, f16, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 440, 120);
                                                    ua.b(ub.a.e0(sVar5, R.string.editor_s_choice_2018), null, j14, j3.A(18), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar5, 3072, 0, 131058);
                                                    final int iIntValue3 = ((Number) sVar5.j(ju.f.f37371e)).intValue();
                                                    boolean zD4 = sVar5.d(iIntValue3);
                                                    Object objQ18 = sVar5.Q();
                                                    l1.g gVar5 = l1.m.f39353a;
                                                    if (zD4 || objQ18 == gVar5) {
                                                        objQ18 = new fu.x(iIntValue3, 6);
                                                        sVar5.o0(objQ18);
                                                    }
                                                    o0.b bVarB = o0.w.b(0, 0, 3, (fz.a) objQ18, sVar5);
                                                    final b3 b3Var19 = b3Var16;
                                                    boolean zF9 = sVar5.f((MergedBillingThemeBillingPage) b3Var19.getValue());
                                                    Object objQ19 = sVar5.Q();
                                                    Object obj6 = objQ19;
                                                    if (zF9 || objQ19 == gVar5) {
                                                        x[] xVarArr = {new x(j3.w(((MergedBillingThemeBillingPage) b3Var19.getValue()).getColorUserReviewNameIcon1())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var19.getValue()).getColorUserReviewNameIcon2())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var19.getValue()).getColorUserReviewNameIcon3())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var19.getValue()).getColorUserReviewNameIcon4()))};
                                                        sVar5.o0(xVarArr);
                                                        obj6 = xVarArr;
                                                    }
                                                    final x[] xVarArr2 = (x[]) obj6;
                                                    float f17 = 32;
                                                    ve.i.d(bVarB, null, new v1(f17, f16, f17, f16), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-1375898409, new fz.g() { // from class: yg.k
                                                        @Override // fz.g
                                                        public final Object f(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                            o0.o HorizontalPager = (o0.o) obj7;
                                                            int iIntValue4 = ((Integer) obj8).intValue();
                                                            l1.n nVar4 = (l1.n) obj9;
                                                            ((Integer) obj10).getClass();
                                                            kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                                                            z1.r rVarC5 = j0.c.C(e2.g(z1.o.f58481a, 240), 10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                                            b3 b3Var110 = b3Var19;
                                                            k7.d(rVarC5, null, k7.p(j3.w(((MergedBillingThemeBillingPage) b3Var110.getValue()).getColorUserReviewCard()), nVar4, 0), k7.q(62, 4), null, t1.e.d(1410031433, new jr.y(iIntValue3, iIntValue4, j14, xVarArr2, b3Var110), nVar4), nVar4, 196614, 18);
                                                            return b0.f48488a;
                                                        }
                                                    }, sVar5), sVar5, 384, 16378);
                                                    sVar5.p(true);
                                                } else {
                                                    sVar5.W();
                                                }
                                                break;
                                        }
                                        return b0.f48488a;
                                    }
                                }, true, 793721823), 3);
                                final int i29 = 1;
                                l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.i
                                    @Override // fz.f
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        switch (i29) {
                                            case 0:
                                                l0.c item = (l0.c) obj3;
                                                l1.n nVar2 = (l1.n) obj4;
                                                int iIntValue = ((Integer) obj5).intValue();
                                                kotlin.jvm.internal.m.f(item, "$this$item");
                                                l1.s sVar3 = (l1.s) nVar2;
                                                if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    String strE0 = ub.a.e0(sVar3, R.string.why_learn_with_the_deer);
                                                    float f13 = 44;
                                                    z1.o oVar7 = z1.o.f58481a;
                                                    z1.r rVarE2 = e2.e(j0.c.E(oVar7, f13, 58, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                    long j12 = j11;
                                                    v vVarA = d0.n.a(j12, 1);
                                                    o.h(0, j12, 0L, strE0, sVar3, j0.c.B(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.a(), rVarE2), 16, 10));
                                                    float f14 = 20;
                                                    z1.r rVarD = j0.c.D(e2.e(j0.c.C(j0.c.E(oVar7, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 14, 24, f14, 36);
                                                    u uVarA = j0.t.a(j0.i.g(26), z1.c.O, sVar3, 6);
                                                    int iHashCode3 = Long.hashCode(sVar3.T);
                                                    q1 q1VarL2 = sVar3.l();
                                                    z1.r rVarC3 = z1.a.c(sVar3, rVarD);
                                                    y2.k.J.getClass();
                                                    y2.i iVar3 = y2.j.f56913b;
                                                    sVar3.h0();
                                                    if (sVar3.S) {
                                                        sVar3.k(iVar3);
                                                    } else {
                                                        sVar3.r0();
                                                    }
                                                    t.J(y2.j.f56917f, uVarA, sVar3);
                                                    t.J(y2.j.f56916e, q1VarL2, sVar3);
                                                    y2.h hVar5 = y2.j.f56918g;
                                                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                                                        defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar5);
                                                    }
                                                    t.J(y2.j.f56915d, rVarC3, sVar3);
                                                    String[] strArr = {ub.a.e0(sVar3, R.string.accelerated_learning), ub.a.e0(sVar3, R.string.effective_results_a), ub.a.e0(sVar3, R.string.convenient_to_use_a)};
                                                    String[] strArr2 = {ub.a.e0(sVar3, R.string.systematic_curricula_guarantee_a_fast_path_to_intermediate_a), ub.a.e0(sVar3, R.string.everything_is_clarified_with_detailed_explanations_and_hd_audio_a), ub.a.e0(sVar3, R.string.feel_supported_with_settings_customized_for_asian_languages_a)};
                                                    b3 b3Var18 = b3Var16;
                                                    String[] strArr3 = {((MergedBillingThemeBillingPage) b3Var18.getValue()).getWhyLearnIcon1Url(), ((MergedBillingThemeBillingPage) b3Var18.getValue()).getWhyLearnIcon2Url(), ((MergedBillingThemeBillingPage) b3Var18.getValue()).getWhyLearnIcon3Url()};
                                                    Integer[] numArr = {Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_1), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_2), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_3)};
                                                    sVar3.d0(-663461197);
                                                    int i210 = 0;
                                                    int i30 = 0;
                                                    while (i210 < 3) {
                                                        long j13 = j12;
                                                        l1.s sVar4 = sVar3;
                                                        o.e(strArr3[i30], numArr[i30].intValue(), strArr[i210], strArr2[i30], j13, j3.A(16), j3.A(14), sVar4, 1769472);
                                                        j12 = j13;
                                                        sVar3 = sVar4;
                                                        i210++;
                                                        i30++;
                                                    }
                                                    sVar3.p(false);
                                                    sVar3.p(true);
                                                } else {
                                                    sVar3.W();
                                                }
                                                break;
                                            default:
                                                l0.c item2 = (l0.c) obj3;
                                                l1.n nVar3 = (l1.n) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                kotlin.jvm.internal.m.f(item2, "$this$item");
                                                l1.s sVar5 = (l1.s) nVar3;
                                                if (sVar5.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    String strE1 = ub.a.e0(sVar5, R.string._5m_happy_learners);
                                                    float f15 = 44;
                                                    z1.o oVar8 = z1.o.f58481a;
                                                    z1.r rVarE3 = e2.e(j0.c.E(oVar8, f15, 40, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                    final long j14 = j11;
                                                    v vVarA2 = d0.n.a(j14, 1);
                                                    float f16 = 16;
                                                    o.h(0, j14, 0L, strE1, sVar5, j0.c.B(d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.a(), rVarE3), f16, 10));
                                                    z1.r rVarE4 = e2.e(oVar8, 1.0f);
                                                    u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar5, 48);
                                                    int iHashCode4 = Long.hashCode(sVar5.T);
                                                    q1 q1VarL3 = sVar5.l();
                                                    z1.r rVarC4 = z1.a.c(sVar5, rVarE4);
                                                    y2.k.J.getClass();
                                                    y2.i iVar4 = y2.j.f56913b;
                                                    sVar5.h0();
                                                    if (sVar5.S) {
                                                        sVar5.k(iVar4);
                                                    } else {
                                                        sVar5.r0();
                                                    }
                                                    t.J(y2.j.f56917f, uVarA2, sVar5);
                                                    t.J(y2.j.f56916e, q1VarL3, sVar5);
                                                    y2.h hVar6 = y2.j.f56918g;
                                                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                                                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar6);
                                                    }
                                                    t.J(y2.j.f56915d, rVarC4, sVar5);
                                                    d0.n.c(se.k.y(R.drawable.ic_sub_intro_play, sVar5, 0), null, j0.c.C(oVar8, CropImageView.DEFAULT_ASPECT_RATIO, f16, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 440, 120);
                                                    ua.b(ub.a.e0(sVar5, R.string.editor_s_choice_2018), null, j14, j3.A(18), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar5, 3072, 0, 131058);
                                                    final int iIntValue3 = ((Number) sVar5.j(ju.f.f37371e)).intValue();
                                                    boolean zD4 = sVar5.d(iIntValue3);
                                                    Object objQ18 = sVar5.Q();
                                                    l1.g gVar5 = l1.m.f39353a;
                                                    if (zD4 || objQ18 == gVar5) {
                                                        objQ18 = new fu.x(iIntValue3, 6);
                                                        sVar5.o0(objQ18);
                                                    }
                                                    o0.b bVarB = o0.w.b(0, 0, 3, (fz.a) objQ18, sVar5);
                                                    final b3 b3Var19 = b3Var16;
                                                    boolean zF9 = sVar5.f((MergedBillingThemeBillingPage) b3Var19.getValue());
                                                    Object objQ19 = sVar5.Q();
                                                    Object obj6 = objQ19;
                                                    if (zF9 || objQ19 == gVar5) {
                                                        x[] xVarArr = {new x(j3.w(((MergedBillingThemeBillingPage) b3Var19.getValue()).getColorUserReviewNameIcon1())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var19.getValue()).getColorUserReviewNameIcon2())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var19.getValue()).getColorUserReviewNameIcon3())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var19.getValue()).getColorUserReviewNameIcon4()))};
                                                        sVar5.o0(xVarArr);
                                                        obj6 = xVarArr;
                                                    }
                                                    final x[] xVarArr2 = (x[]) obj6;
                                                    float f17 = 32;
                                                    ve.i.d(bVarB, null, new v1(f17, f16, f17, f16), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-1375898409, new fz.g() { // from class: yg.k
                                                        @Override // fz.g
                                                        public final Object f(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                            o0.o HorizontalPager = (o0.o) obj7;
                                                            int iIntValue4 = ((Integer) obj8).intValue();
                                                            l1.n nVar4 = (l1.n) obj9;
                                                            ((Integer) obj10).getClass();
                                                            kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                                                            z1.r rVarC5 = j0.c.C(e2.g(z1.o.f58481a, 240), 10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                                            b3 b3Var110 = b3Var19;
                                                            k7.d(rVarC5, null, k7.p(j3.w(((MergedBillingThemeBillingPage) b3Var110.getValue()).getColorUserReviewCard()), nVar4, 0), k7.q(62, 4), null, t1.e.d(1410031433, new jr.y(iIntValue3, iIntValue4, j14, xVarArr2, b3Var110), nVar4), nVar4, 196614, 18);
                                                            return b0.f48488a;
                                                        }
                                                    }, sVar5), sVar5, 384, 16378);
                                                    sVar5.p(true);
                                                } else {
                                                    sVar5.W();
                                                }
                                                break;
                                        }
                                        return b0.f48488a;
                                    }
                                }, true, -1411920544), 3);
                                l0.h.p(LazyColumn, null, new t1.d(new r0(j11, 5), true, 677404385), 3);
                                l0.h.p(LazyColumn, null, new t1.d(new j1(j11, onTermsOfUseClick, onPrivacyPolicyClick, onContactUsClick, aVar, 1), true, -1528237982), 3);
                                if (!kotlin.jvm.internal.m.a(str4, "bottom_tab")) {
                                    l0.h.p(LazyColumn, null, r.f57842b, 3);
                                }
                                return b0.f48488a;
                            }
                        };
                        str3 = str;
                        mVar5 = mVar9;
                        b3VarCollectAsStateWithLifecycle6 = b3VarCollectAsStateWithLifecycle6;
                        b3Var10 = b3VarCollectAsStateWithLifecycle;
                        b1Var7 = b1Var7;
                        sVar = sVar2;
                        sVar.o0(obj);
                    } else {
                        str3 = str;
                        gVar3 = gVar2;
                        obj = objQ12;
                        b3Var10 = b3VarCollectAsStateWithLifecycle;
                        b3Var9 = b3VarCollectAsStateWithLifecycle2;
                        f11 = 1.0f;
                        sVar = sVar2;
                    }
                    l1.s sVar3 = sVar;
                    ue.f.a(rVarC2, wVarA, null, null, null, null, false, null, (fz.c) obj, sVar3, 0, 508);
                    sVar2 = sVar3;
                    boolean zBooleanValue = ((Boolean) b3Var11.getValue()).booleanValue();
                    objQ13 = sVar2.Q();
                    gVar4 = gVar3;
                    if (objQ13 == gVar4) {
                        objQ13 = new xt.r(9);
                        sVar2.o0(objQ13);
                    }
                    a0.l1 l1VarC = f1.c((fz.c) objQ13, 7);
                    objQ14 = sVar2.Q();
                    if (objQ14 == gVar4) {
                        objQ14 = new xt.r(10);
                        sVar2.o0(objQ14);
                    }
                    a0.j0.d(zBooleanValue, null, l1VarC, f1.k((fz.c) objQ14, 7), null, t1.e.d(-309655129, new defpackage.d(b3Var9, b3VarCollectAsStateWithLifecycle6, b3Var10, 19), sVar2), sVar2, 200064, 18);
                    zEquals = str3.equals("bottom_tab");
                    rVar = j0.r.f35391a;
                    if (zEquals) {
                        oVar2 = oVar;
                        rVarV = rVar.a(oVar2, jVar);
                    } else {
                        oVar2 = oVar;
                        rVarV = j0.c.v(rVar.a(oVar2, r20));
                    }
                    q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                    iHashCode2 = Long.hashCode(sVar2.T);
                    q1 q1VarL2 = sVar2.l();
                    z1.r rVarC3 = z1.a.c(sVar2, rVarV);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    t.J(hVar2, q0VarD2, sVar2);
                    t.J(hVar3, q1VarL2, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
                    }
                    t.J(hVar4, rVarC3, sVar2);
                    boolean zBooleanValue2 = ((Boolean) b3Var11.getValue()).booleanValue();
                    objQ15 = sVar2.Q();
                    if (objQ15 == gVar4) {
                        objQ15 = new xt.r(11);
                        sVar2.o0(objQ15);
                    }
                    a0.l1 l1VarN = f1.n((fz.c) objQ15);
                    objQ16 = sVar2.Q();
                    if (objQ16 == gVar4) {
                        objQ16 = new xt.r(12);
                        sVar2.o0(objQ16);
                    }
                    m1 m1VarT = f1.t((fz.c) objQ16);
                    if (((Boolean) sVar2.j(c3Var)).booleanValue()) {
                        f12 = 0.7f;
                    } else {
                        f12 = f11;
                    }
                    z1.r rVarE2 = e2.e(oVar2, f12);
                    String str4 = str3;
                    ni.m mVar10 = mVar5;
                    h2 h2Var = new h2(b3Var4, mVar10, dVar, str4, b1Var4, b1Var5, b1Var7, b1Var6);
                    source = str4;
                    a0.j0.d(zBooleanValue2, rVarE2, l1VarN, m1VarT, null, t1.e.d(82105517, h2Var, sVar2), sVar2, 200064, 16);
                    sVar2.p(true);
                    sVar2.p(true);
                    aVar2 = onSubscriptionSuccess;
                    k((ni.h) b3VarCollectAsStateWithLifecycle17.getValue(), aVar2, source, sVar2, ((i15 >> 15) & 112) | ((i15 << 3) & 896));
                    mVar2 = mVar10;
                    z12 = z13;
                }
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                y2.h hVar5 = y2.j.f56915d;
                t.J(hVar5, rVarC, sVar2);
                if (z13) {
                    rVarG = j0.c.v(d0.n.g(oVar, tVar, null, 6));
                } else {
                    rVarG = d0.n.g(oVar, tVar, null, 6);
                }
                c3Var = ju.f.f37376j;
                if (((Boolean) sVar2.j(c3Var)).booleanValue()) {
                    f5 = 0.7f;
                } else {
                    f5 = 1.0f;
                }
                z1.r rVarC4 = e2.c(e2.e(rVarG, f5), 1.0f);
                boolean zF9 = sVar2.f(b3VarCollectAsStateWithLifecycle2);
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z25 = z14 | zF9;
                if ((i15 & 458752) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zF10 = z25 | z15 | sVar2.f(b3VarCollectAsStateWithLifecycle10) | sVar2.f(b3VarCollectAsStateWithLifecycle5) | sVar2.f(b3VarCollectAsStateWithLifecycle11);
                b3Var7 = b3Var6;
                b3Var8 = b3Var3;
                b1Var7 = b1Var8;
                boolean zF11 = zF10 | sVar2.f(b3Var7) | sVar2.h(mVar5) | sVar2.f(b3Var5) | sVar2.f(b3VarCollectAsStateWithLifecycle6) | sVar2.f(b3VarCollectAsStateWithLifecycle) | sVar2.f(b3VarCollectAsStateWithLifecycle13) | sVar2.f(b3Var8) | sVar2.f(b3VarCollectAsStateWithLifecycle7) | sVar2.f(b3Var2) | sVar2.f(b1Var4) | sVar2.f(b1Var5) | sVar2.f(b1Var8) | sVar2.f(b1Var6) | sVar2.f(b3Var4) | sVar2.h(dVar) | sVar2.e(jW4);
                if ((i15 & 1879048192) == 536870912) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z26 = zF11 | z16;
                if ((c11 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z27 = z26 | z17;
                if ((i15 & 29360128) == 8388608) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z28 = z27 | z18;
                if ((i15 & 234881024) == 67108864) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = z28 | z19;
                objQ12 = sVar2.Q();
                if (z20) {
                    b3Var9 = b3VarCollectAsStateWithLifecycle2;
                    gVar3 = gVar2;
                    f11 = 1.0f;
                    final ni.m mVar11 = mVar5;
                    final b3 b3Var16 = b3Var5;
                    final b1 b1Var11 = b1Var3;
                    final b3 b3Var17 = b3Var2;
                    obj = new fz.c() { // from class: yg.f
                        @Override // fz.c
                        public final Object invoke(Object obj2) {
                            l0.h LazyColumn = (l0.h) obj2;
                            kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                            final String str5 = str;
                            fz.a aVar3 = onFinishClick;
                            final b3 b3Var18 = b3Var9;
                            l0.h.p(LazyColumn, null, new t1.d(new defpackage.d(str5, aVar3, b3Var18, 20), true, -1625515996), 3);
                            l0.h.p(LazyColumn, null, new t1.d(new tp.u(4, b3VarCollectAsStateWithLifecycle10, b3Var18), true, 1026356699), 3);
                            b1 b1Var12 = b1Var11;
                            final ni.m mVar12 = mVar11;
                            l0.h.p(LazyColumn, null, new t1.d(new ei.n(b1Var12, mVar12, b1Var2, b3VarCollectAsStateWithLifecycle5, b3VarCollectAsStateWithLifecycle11, b3Var7, b3Var18, b3Var16, b3VarCollectAsStateWithLifecycle6, b3VarCollectAsStateWithLifecycle, b3VarCollectAsStateWithLifecycle13, b3Var8, b3VarCollectAsStateWithLifecycle7, b3Var17), true, -1179285668), 3);
                            final b3 b3Var19 = b3Var4;
                            final xg.d dVar2 = dVar;
                            final long j11 = jW4;
                            final b1 b1Var13 = b1Var4;
                            final b1 b1Var14 = b1Var5;
                            final b1 b1Var15 = b1Var7;
                            final b1 b1Var16 = b1Var6;
                            final a1 a1Var2 = a1Var;
                            l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.h
                                @Override // fz.f
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    l0.c item = (l0.c) obj3;
                                    l1.n nVar2 = (l1.n) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    kotlin.jvm.internal.m.f(item, "$this$item");
                                    l1.s sVar4 = (l1.s) nVar2;
                                    if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        String str6 = (String) b1Var13.getValue();
                                        long j12 = ((x) b1Var14.getValue()).f28624a;
                                        long j13 = ((x) b1Var15.getValue()).f28624a;
                                        long j14 = ((x) b1Var16.getValue()).f28624a;
                                        float f13 = 36;
                                        z1.o oVar7 = z1.o.f58481a;
                                        z1.r rVarE3 = j0.c.E(oVar7, f13, 29, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8);
                                        Object objQ18 = sVar4.Q();
                                        l1.g gVar5 = l1.m.f39353a;
                                        if (objQ18 == gVar5) {
                                            objQ18 = new bt.a2(a1Var2, 17);
                                            sVar4.o0(objQ18);
                                        }
                                        z1.r rVarN = a0.n(rVarE3, (fz.c) objQ18);
                                        b3 b3Var110 = b3Var19;
                                        boolean zF12 = sVar4.f(b3Var110);
                                        ni.m mVar13 = mVar12;
                                        boolean zH = zF12 | sVar4.h(mVar13);
                                        xg.d dVar3 = dVar2;
                                        boolean zH2 = zH | sVar4.h(dVar3);
                                        String str7 = str5;
                                        boolean zF13 = zH2 | sVar4.f(str7);
                                        Object objQ19 = sVar4.Q();
                                        if (zF13 || objQ19 == gVar5) {
                                            objQ19 = new j(b3Var110, mVar13, dVar3, str7, 1);
                                            sVar4.o0(objQ19);
                                        }
                                        o.c(str6, j12, j13, j14, rVarN, (fz.a) objQ19, sVar4, 0);
                                        ua.b(ub.a.e0(sVar4, R.string.cancel_anytime_or_manage_subscriptions_in_google_play), e2.e(j0.c.E(j0.c.C(oVar7, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(ua.f31167a), j11, j3.A(11), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar4, 48, 0, 65532);
                                    } else {
                                        sVar4.W();
                                    }
                                    return b0.f48488a;
                                }
                            }, true, 910039261), 3);
                            l0.h.p(LazyColumn, null, new t1.d(new r0(j11, 4), true, -1295603106), 3);
                            final int i28 = 0;
                            l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.i
                                @Override // fz.f
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    switch (i28) {
                                        case 0:
                                            l0.c item = (l0.c) obj3;
                                            l1.n nVar2 = (l1.n) obj4;
                                            int iIntValue = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item, "$this$item");
                                            l1.s sVar4 = (l1.s) nVar2;
                                            if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                String strE0 = ub.a.e0(sVar4, R.string.why_learn_with_the_deer);
                                                float f13 = 44;
                                                z1.o oVar7 = z1.o.f58481a;
                                                z1.r rVarE3 = e2.e(j0.c.E(oVar7, f13, 58, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                long j12 = j11;
                                                v vVarA = d0.n.a(j12, 1);
                                                o.h(0, j12, 0L, strE0, sVar4, j0.c.B(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.a(), rVarE3), 16, 10));
                                                float f14 = 20;
                                                z1.r rVarD = j0.c.D(e2.e(j0.c.C(j0.c.E(oVar7, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 14, 24, f14, 36);
                                                u uVarA = j0.t.a(j0.i.g(26), z1.c.O, sVar4, 6);
                                                int iHashCode3 = Long.hashCode(sVar4.T);
                                                q1 q1VarL3 = sVar4.l();
                                                z1.r rVarC5 = z1.a.c(sVar4, rVarD);
                                                y2.k.J.getClass();
                                                y2.i iVar3 = y2.j.f56913b;
                                                sVar4.h0();
                                                if (sVar4.S) {
                                                    sVar4.k(iVar3);
                                                } else {
                                                    sVar4.r0();
                                                }
                                                t.J(y2.j.f56917f, uVarA, sVar4);
                                                t.J(y2.j.f56916e, q1VarL3, sVar4);
                                                y2.h hVar6 = y2.j.f56918g;
                                                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                                                    defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar6);
                                                }
                                                t.J(y2.j.f56915d, rVarC5, sVar4);
                                                String[] strArr = {ub.a.e0(sVar4, R.string.accelerated_learning), ub.a.e0(sVar4, R.string.effective_results_a), ub.a.e0(sVar4, R.string.convenient_to_use_a)};
                                                String[] strArr2 = {ub.a.e0(sVar4, R.string.systematic_curricula_guarantee_a_fast_path_to_intermediate_a), ub.a.e0(sVar4, R.string.everything_is_clarified_with_detailed_explanations_and_hd_audio_a), ub.a.e0(sVar4, R.string.feel_supported_with_settings_customized_for_asian_languages_a)};
                                                b3 b3Var110 = b3Var18;
                                                String[] strArr3 = {((MergedBillingThemeBillingPage) b3Var110.getValue()).getWhyLearnIcon1Url(), ((MergedBillingThemeBillingPage) b3Var110.getValue()).getWhyLearnIcon2Url(), ((MergedBillingThemeBillingPage) b3Var110.getValue()).getWhyLearnIcon3Url()};
                                                Integer[] numArr = {Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_1), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_2), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_3)};
                                                sVar4.d0(-663461197);
                                                int i210 = 0;
                                                int i30 = 0;
                                                while (i210 < 3) {
                                                    long j13 = j12;
                                                    l1.s sVar5 = sVar4;
                                                    o.e(strArr3[i30], numArr[i30].intValue(), strArr[i210], strArr2[i30], j13, j3.A(16), j3.A(14), sVar5, 1769472);
                                                    j12 = j13;
                                                    sVar4 = sVar5;
                                                    i210++;
                                                    i30++;
                                                }
                                                sVar4.p(false);
                                                sVar4.p(true);
                                            } else {
                                                sVar4.W();
                                            }
                                            break;
                                        default:
                                            l0.c item2 = (l0.c) obj3;
                                            l1.n nVar3 = (l1.n) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item2, "$this$item");
                                            l1.s sVar6 = (l1.s) nVar3;
                                            if (sVar6.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                String strE1 = ub.a.e0(sVar6, R.string._5m_happy_learners);
                                                float f15 = 44;
                                                z1.o oVar8 = z1.o.f58481a;
                                                z1.r rVarE4 = e2.e(j0.c.E(oVar8, f15, 40, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                final long j14 = j11;
                                                v vVarA2 = d0.n.a(j14, 1);
                                                float f16 = 16;
                                                o.h(0, j14, 0L, strE1, sVar6, j0.c.B(d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.a(), rVarE4), f16, 10));
                                                z1.r rVarE5 = e2.e(oVar8, 1.0f);
                                                u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar6, 48);
                                                int iHashCode4 = Long.hashCode(sVar6.T);
                                                q1 q1VarL4 = sVar6.l();
                                                z1.r rVarC6 = z1.a.c(sVar6, rVarE5);
                                                y2.k.J.getClass();
                                                y2.i iVar4 = y2.j.f56913b;
                                                sVar6.h0();
                                                if (sVar6.S) {
                                                    sVar6.k(iVar4);
                                                } else {
                                                    sVar6.r0();
                                                }
                                                t.J(y2.j.f56917f, uVarA2, sVar6);
                                                t.J(y2.j.f56916e, q1VarL4, sVar6);
                                                y2.h hVar7 = y2.j.f56918g;
                                                if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode4))) {
                                                    defpackage.e.A(iHashCode4, sVar6, iHashCode4, hVar7);
                                                }
                                                t.J(y2.j.f56915d, rVarC6, sVar6);
                                                d0.n.c(se.k.y(R.drawable.ic_sub_intro_play, sVar6, 0), null, j0.c.C(oVar8, CropImageView.DEFAULT_ASPECT_RATIO, f16, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar6, 440, 120);
                                                ua.b(ub.a.e0(sVar6, R.string.editor_s_choice_2018), null, j14, j3.A(18), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar6, 3072, 0, 131058);
                                                final int iIntValue3 = ((Number) sVar6.j(ju.f.f37371e)).intValue();
                                                boolean zD4 = sVar6.d(iIntValue3);
                                                Object objQ18 = sVar6.Q();
                                                l1.g gVar5 = l1.m.f39353a;
                                                if (zD4 || objQ18 == gVar5) {
                                                    objQ18 = new fu.x(iIntValue3, 6);
                                                    sVar6.o0(objQ18);
                                                }
                                                o0.b bVarB = o0.w.b(0, 0, 3, (fz.a) objQ18, sVar6);
                                                final b3 b3Var111 = b3Var18;
                                                boolean zF12 = sVar6.f((MergedBillingThemeBillingPage) b3Var111.getValue());
                                                Object objQ19 = sVar6.Q();
                                                Object obj6 = objQ19;
                                                if (zF12 || objQ19 == gVar5) {
                                                    x[] xVarArr = {new x(j3.w(((MergedBillingThemeBillingPage) b3Var111.getValue()).getColorUserReviewNameIcon1())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var111.getValue()).getColorUserReviewNameIcon2())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var111.getValue()).getColorUserReviewNameIcon3())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var111.getValue()).getColorUserReviewNameIcon4()))};
                                                    sVar6.o0(xVarArr);
                                                    obj6 = xVarArr;
                                                }
                                                final x[] xVarArr2 = (x[]) obj6;
                                                float f17 = 32;
                                                ve.i.d(bVarB, null, new v1(f17, f16, f17, f16), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-1375898409, new fz.g() { // from class: yg.k
                                                    @Override // fz.g
                                                    public final Object f(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                        o0.o HorizontalPager = (o0.o) obj7;
                                                        int iIntValue4 = ((Integer) obj8).intValue();
                                                        l1.n nVar4 = (l1.n) obj9;
                                                        ((Integer) obj10).getClass();
                                                        kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                                                        z1.r rVarC7 = j0.c.C(e2.g(z1.o.f58481a, 240), 10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                                        b3 b3Var112 = b3Var111;
                                                        k7.d(rVarC7, null, k7.p(j3.w(((MergedBillingThemeBillingPage) b3Var112.getValue()).getColorUserReviewCard()), nVar4, 0), k7.q(62, 4), null, t1.e.d(1410031433, new jr.y(iIntValue3, iIntValue4, j14, xVarArr2, b3Var112), nVar4), nVar4, 196614, 18);
                                                        return b0.f48488a;
                                                    }
                                                }, sVar6), sVar6, 384, 16378);
                                                sVar6.p(true);
                                            } else {
                                                sVar6.W();
                                            }
                                            break;
                                    }
                                    return b0.f48488a;
                                }
                            }, true, 793721823), 3);
                            final int i29 = 1;
                            l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.i
                                @Override // fz.f
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    switch (i29) {
                                        case 0:
                                            l0.c item = (l0.c) obj3;
                                            l1.n nVar2 = (l1.n) obj4;
                                            int iIntValue = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item, "$this$item");
                                            l1.s sVar4 = (l1.s) nVar2;
                                            if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                String strE0 = ub.a.e0(sVar4, R.string.why_learn_with_the_deer);
                                                float f13 = 44;
                                                z1.o oVar7 = z1.o.f58481a;
                                                z1.r rVarE3 = e2.e(j0.c.E(oVar7, f13, 58, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                long j12 = j11;
                                                v vVarA = d0.n.a(j12, 1);
                                                o.h(0, j12, 0L, strE0, sVar4, j0.c.B(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.a(), rVarE3), 16, 10));
                                                float f14 = 20;
                                                z1.r rVarD = j0.c.D(e2.e(j0.c.C(j0.c.E(oVar7, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 14, 24, f14, 36);
                                                u uVarA = j0.t.a(j0.i.g(26), z1.c.O, sVar4, 6);
                                                int iHashCode3 = Long.hashCode(sVar4.T);
                                                q1 q1VarL3 = sVar4.l();
                                                z1.r rVarC5 = z1.a.c(sVar4, rVarD);
                                                y2.k.J.getClass();
                                                y2.i iVar3 = y2.j.f56913b;
                                                sVar4.h0();
                                                if (sVar4.S) {
                                                    sVar4.k(iVar3);
                                                } else {
                                                    sVar4.r0();
                                                }
                                                t.J(y2.j.f56917f, uVarA, sVar4);
                                                t.J(y2.j.f56916e, q1VarL3, sVar4);
                                                y2.h hVar6 = y2.j.f56918g;
                                                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                                                    defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar6);
                                                }
                                                t.J(y2.j.f56915d, rVarC5, sVar4);
                                                String[] strArr = {ub.a.e0(sVar4, R.string.accelerated_learning), ub.a.e0(sVar4, R.string.effective_results_a), ub.a.e0(sVar4, R.string.convenient_to_use_a)};
                                                String[] strArr2 = {ub.a.e0(sVar4, R.string.systematic_curricula_guarantee_a_fast_path_to_intermediate_a), ub.a.e0(sVar4, R.string.everything_is_clarified_with_detailed_explanations_and_hd_audio_a), ub.a.e0(sVar4, R.string.feel_supported_with_settings_customized_for_asian_languages_a)};
                                                b3 b3Var110 = b3Var18;
                                                String[] strArr3 = {((MergedBillingThemeBillingPage) b3Var110.getValue()).getWhyLearnIcon1Url(), ((MergedBillingThemeBillingPage) b3Var110.getValue()).getWhyLearnIcon2Url(), ((MergedBillingThemeBillingPage) b3Var110.getValue()).getWhyLearnIcon3Url()};
                                                Integer[] numArr = {Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_1), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_2), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_3)};
                                                sVar4.d0(-663461197);
                                                int i210 = 0;
                                                int i30 = 0;
                                                while (i210 < 3) {
                                                    long j13 = j12;
                                                    l1.s sVar5 = sVar4;
                                                    o.e(strArr3[i30], numArr[i30].intValue(), strArr[i210], strArr2[i30], j13, j3.A(16), j3.A(14), sVar5, 1769472);
                                                    j12 = j13;
                                                    sVar4 = sVar5;
                                                    i210++;
                                                    i30++;
                                                }
                                                sVar4.p(false);
                                                sVar4.p(true);
                                            } else {
                                                sVar4.W();
                                            }
                                            break;
                                        default:
                                            l0.c item2 = (l0.c) obj3;
                                            l1.n nVar3 = (l1.n) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item2, "$this$item");
                                            l1.s sVar6 = (l1.s) nVar3;
                                            if (sVar6.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                String strE1 = ub.a.e0(sVar6, R.string._5m_happy_learners);
                                                float f15 = 44;
                                                z1.o oVar8 = z1.o.f58481a;
                                                z1.r rVarE4 = e2.e(j0.c.E(oVar8, f15, 40, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                final long j14 = j11;
                                                v vVarA2 = d0.n.a(j14, 1);
                                                float f16 = 16;
                                                o.h(0, j14, 0L, strE1, sVar6, j0.c.B(d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.a(), rVarE4), f16, 10));
                                                z1.r rVarE5 = e2.e(oVar8, 1.0f);
                                                u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar6, 48);
                                                int iHashCode4 = Long.hashCode(sVar6.T);
                                                q1 q1VarL4 = sVar6.l();
                                                z1.r rVarC6 = z1.a.c(sVar6, rVarE5);
                                                y2.k.J.getClass();
                                                y2.i iVar4 = y2.j.f56913b;
                                                sVar6.h0();
                                                if (sVar6.S) {
                                                    sVar6.k(iVar4);
                                                } else {
                                                    sVar6.r0();
                                                }
                                                t.J(y2.j.f56917f, uVarA2, sVar6);
                                                t.J(y2.j.f56916e, q1VarL4, sVar6);
                                                y2.h hVar7 = y2.j.f56918g;
                                                if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode4))) {
                                                    defpackage.e.A(iHashCode4, sVar6, iHashCode4, hVar7);
                                                }
                                                t.J(y2.j.f56915d, rVarC6, sVar6);
                                                d0.n.c(se.k.y(R.drawable.ic_sub_intro_play, sVar6, 0), null, j0.c.C(oVar8, CropImageView.DEFAULT_ASPECT_RATIO, f16, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar6, 440, 120);
                                                ua.b(ub.a.e0(sVar6, R.string.editor_s_choice_2018), null, j14, j3.A(18), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar6, 3072, 0, 131058);
                                                final int iIntValue3 = ((Number) sVar6.j(ju.f.f37371e)).intValue();
                                                boolean zD4 = sVar6.d(iIntValue3);
                                                Object objQ18 = sVar6.Q();
                                                l1.g gVar5 = l1.m.f39353a;
                                                if (zD4 || objQ18 == gVar5) {
                                                    objQ18 = new fu.x(iIntValue3, 6);
                                                    sVar6.o0(objQ18);
                                                }
                                                o0.b bVarB = o0.w.b(0, 0, 3, (fz.a) objQ18, sVar6);
                                                final b3 b3Var111 = b3Var18;
                                                boolean zF12 = sVar6.f((MergedBillingThemeBillingPage) b3Var111.getValue());
                                                Object objQ19 = sVar6.Q();
                                                Object obj6 = objQ19;
                                                if (zF12 || objQ19 == gVar5) {
                                                    x[] xVarArr = {new x(j3.w(((MergedBillingThemeBillingPage) b3Var111.getValue()).getColorUserReviewNameIcon1())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var111.getValue()).getColorUserReviewNameIcon2())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var111.getValue()).getColorUserReviewNameIcon3())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var111.getValue()).getColorUserReviewNameIcon4()))};
                                                    sVar6.o0(xVarArr);
                                                    obj6 = xVarArr;
                                                }
                                                final x[] xVarArr2 = (x[]) obj6;
                                                float f17 = 32;
                                                ve.i.d(bVarB, null, new v1(f17, f16, f17, f16), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-1375898409, new fz.g() { // from class: yg.k
                                                    @Override // fz.g
                                                    public final Object f(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                        o0.o HorizontalPager = (o0.o) obj7;
                                                        int iIntValue4 = ((Integer) obj8).intValue();
                                                        l1.n nVar4 = (l1.n) obj9;
                                                        ((Integer) obj10).getClass();
                                                        kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                                                        z1.r rVarC7 = j0.c.C(e2.g(z1.o.f58481a, 240), 10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                                        b3 b3Var112 = b3Var111;
                                                        k7.d(rVarC7, null, k7.p(j3.w(((MergedBillingThemeBillingPage) b3Var112.getValue()).getColorUserReviewCard()), nVar4, 0), k7.q(62, 4), null, t1.e.d(1410031433, new jr.y(iIntValue3, iIntValue4, j14, xVarArr2, b3Var112), nVar4), nVar4, 196614, 18);
                                                        return b0.f48488a;
                                                    }
                                                }, sVar6), sVar6, 384, 16378);
                                                sVar6.p(true);
                                            } else {
                                                sVar6.W();
                                            }
                                            break;
                                    }
                                    return b0.f48488a;
                                }
                            }, true, -1411920544), 3);
                            l0.h.p(LazyColumn, null, new t1.d(new r0(j11, 5), true, 677404385), 3);
                            l0.h.p(LazyColumn, null, new t1.d(new j1(j11, onTermsOfUseClick, onPrivacyPolicyClick, onContactUsClick, aVar, 1), true, -1528237982), 3);
                            if (!kotlin.jvm.internal.m.a(str5, "bottom_tab")) {
                                l0.h.p(LazyColumn, null, r.f57842b, 3);
                            }
                            return b0.f48488a;
                        }
                    };
                    str3 = str;
                    mVar5 = mVar11;
                    b3VarCollectAsStateWithLifecycle6 = b3VarCollectAsStateWithLifecycle6;
                    b3Var10 = b3VarCollectAsStateWithLifecycle;
                    b1Var7 = b1Var7;
                    sVar = sVar2;
                    sVar.o0(obj);
                } else if (objQ12 == gVar2) {
                    gVar2 = gVar2;
                    b3Var9 = b3VarCollectAsStateWithLifecycle2;
                    gVar3 = gVar2;
                    f11 = 1.0f;
                    final ni.m mVar12 = mVar5;
                    final b3 b3Var18 = b3Var5;
                    final b1 b1Var12 = b1Var3;
                    final b3 b3Var19 = b3Var2;
                    obj = new fz.c() { // from class: yg.f
                        @Override // fz.c
                        public final Object invoke(Object obj2) {
                            l0.h LazyColumn = (l0.h) obj2;
                            kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                            final String str5 = str;
                            fz.a aVar3 = onFinishClick;
                            final b3 b3Var110 = b3Var9;
                            l0.h.p(LazyColumn, null, new t1.d(new defpackage.d(str5, aVar3, b3Var110, 20), true, -1625515996), 3);
                            l0.h.p(LazyColumn, null, new t1.d(new tp.u(4, b3VarCollectAsStateWithLifecycle10, b3Var110), true, 1026356699), 3);
                            b1 b1Var13 = b1Var12;
                            final ni.m mVar13 = mVar12;
                            l0.h.p(LazyColumn, null, new t1.d(new ei.n(b1Var13, mVar13, b1Var2, b3VarCollectAsStateWithLifecycle5, b3VarCollectAsStateWithLifecycle11, b3Var7, b3Var110, b3Var18, b3VarCollectAsStateWithLifecycle6, b3VarCollectAsStateWithLifecycle, b3VarCollectAsStateWithLifecycle13, b3Var8, b3VarCollectAsStateWithLifecycle7, b3Var19), true, -1179285668), 3);
                            final b3 b3Var111 = b3Var4;
                            final xg.d dVar2 = dVar;
                            final long j11 = jW4;
                            final b1 b1Var14 = b1Var4;
                            final b1 b1Var15 = b1Var5;
                            final b1 b1Var16 = b1Var7;
                            final b1 b1Var17 = b1Var6;
                            final a1 a1Var2 = a1Var;
                            l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.h
                                @Override // fz.f
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    l0.c item = (l0.c) obj3;
                                    l1.n nVar2 = (l1.n) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    kotlin.jvm.internal.m.f(item, "$this$item");
                                    l1.s sVar4 = (l1.s) nVar2;
                                    if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        String str6 = (String) b1Var14.getValue();
                                        long j12 = ((x) b1Var15.getValue()).f28624a;
                                        long j13 = ((x) b1Var16.getValue()).f28624a;
                                        long j14 = ((x) b1Var17.getValue()).f28624a;
                                        float f13 = 36;
                                        z1.o oVar7 = z1.o.f58481a;
                                        z1.r rVarE3 = j0.c.E(oVar7, f13, 29, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8);
                                        Object objQ18 = sVar4.Q();
                                        l1.g gVar5 = l1.m.f39353a;
                                        if (objQ18 == gVar5) {
                                            objQ18 = new bt.a2(a1Var2, 17);
                                            sVar4.o0(objQ18);
                                        }
                                        z1.r rVarN = a0.n(rVarE3, (fz.c) objQ18);
                                        b3 b3Var112 = b3Var111;
                                        boolean zF12 = sVar4.f(b3Var112);
                                        ni.m mVar14 = mVar13;
                                        boolean zH = zF12 | sVar4.h(mVar14);
                                        xg.d dVar3 = dVar2;
                                        boolean zH2 = zH | sVar4.h(dVar3);
                                        String str7 = str5;
                                        boolean zF13 = zH2 | sVar4.f(str7);
                                        Object objQ19 = sVar4.Q();
                                        if (zF13 || objQ19 == gVar5) {
                                            objQ19 = new j(b3Var112, mVar14, dVar3, str7, 1);
                                            sVar4.o0(objQ19);
                                        }
                                        o.c(str6, j12, j13, j14, rVarN, (fz.a) objQ19, sVar4, 0);
                                        ua.b(ub.a.e0(sVar4, R.string.cancel_anytime_or_manage_subscriptions_in_google_play), e2.e(j0.c.E(j0.c.C(oVar7, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(ua.f31167a), j11, j3.A(11), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar4, 48, 0, 65532);
                                    } else {
                                        sVar4.W();
                                    }
                                    return b0.f48488a;
                                }
                            }, true, 910039261), 3);
                            l0.h.p(LazyColumn, null, new t1.d(new r0(j11, 4), true, -1295603106), 3);
                            final int i28 = 0;
                            l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.i
                                @Override // fz.f
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    switch (i28) {
                                        case 0:
                                            l0.c item = (l0.c) obj3;
                                            l1.n nVar2 = (l1.n) obj4;
                                            int iIntValue = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item, "$this$item");
                                            l1.s sVar4 = (l1.s) nVar2;
                                            if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                String strE0 = ub.a.e0(sVar4, R.string.why_learn_with_the_deer);
                                                float f13 = 44;
                                                z1.o oVar7 = z1.o.f58481a;
                                                z1.r rVarE3 = e2.e(j0.c.E(oVar7, f13, 58, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                long j12 = j11;
                                                v vVarA = d0.n.a(j12, 1);
                                                o.h(0, j12, 0L, strE0, sVar4, j0.c.B(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.a(), rVarE3), 16, 10));
                                                float f14 = 20;
                                                z1.r rVarD = j0.c.D(e2.e(j0.c.C(j0.c.E(oVar7, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 14, 24, f14, 36);
                                                u uVarA = j0.t.a(j0.i.g(26), z1.c.O, sVar4, 6);
                                                int iHashCode3 = Long.hashCode(sVar4.T);
                                                q1 q1VarL3 = sVar4.l();
                                                z1.r rVarC5 = z1.a.c(sVar4, rVarD);
                                                y2.k.J.getClass();
                                                y2.i iVar3 = y2.j.f56913b;
                                                sVar4.h0();
                                                if (sVar4.S) {
                                                    sVar4.k(iVar3);
                                                } else {
                                                    sVar4.r0();
                                                }
                                                t.J(y2.j.f56917f, uVarA, sVar4);
                                                t.J(y2.j.f56916e, q1VarL3, sVar4);
                                                y2.h hVar6 = y2.j.f56918g;
                                                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                                                    defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar6);
                                                }
                                                t.J(y2.j.f56915d, rVarC5, sVar4);
                                                String[] strArr = {ub.a.e0(sVar4, R.string.accelerated_learning), ub.a.e0(sVar4, R.string.effective_results_a), ub.a.e0(sVar4, R.string.convenient_to_use_a)};
                                                String[] strArr2 = {ub.a.e0(sVar4, R.string.systematic_curricula_guarantee_a_fast_path_to_intermediate_a), ub.a.e0(sVar4, R.string.everything_is_clarified_with_detailed_explanations_and_hd_audio_a), ub.a.e0(sVar4, R.string.feel_supported_with_settings_customized_for_asian_languages_a)};
                                                b3 b3Var112 = b3Var110;
                                                String[] strArr3 = {((MergedBillingThemeBillingPage) b3Var112.getValue()).getWhyLearnIcon1Url(), ((MergedBillingThemeBillingPage) b3Var112.getValue()).getWhyLearnIcon2Url(), ((MergedBillingThemeBillingPage) b3Var112.getValue()).getWhyLearnIcon3Url()};
                                                Integer[] numArr = {Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_1), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_2), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_3)};
                                                sVar4.d0(-663461197);
                                                int i210 = 0;
                                                int i30 = 0;
                                                while (i210 < 3) {
                                                    long j13 = j12;
                                                    l1.s sVar5 = sVar4;
                                                    o.e(strArr3[i30], numArr[i30].intValue(), strArr[i210], strArr2[i30], j13, j3.A(16), j3.A(14), sVar5, 1769472);
                                                    j12 = j13;
                                                    sVar4 = sVar5;
                                                    i210++;
                                                    i30++;
                                                }
                                                sVar4.p(false);
                                                sVar4.p(true);
                                            } else {
                                                sVar4.W();
                                            }
                                            break;
                                        default:
                                            l0.c item2 = (l0.c) obj3;
                                            l1.n nVar3 = (l1.n) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item2, "$this$item");
                                            l1.s sVar6 = (l1.s) nVar3;
                                            if (sVar6.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                String strE1 = ub.a.e0(sVar6, R.string._5m_happy_learners);
                                                float f15 = 44;
                                                z1.o oVar8 = z1.o.f58481a;
                                                z1.r rVarE4 = e2.e(j0.c.E(oVar8, f15, 40, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                final long j14 = j11;
                                                v vVarA2 = d0.n.a(j14, 1);
                                                float f16 = 16;
                                                o.h(0, j14, 0L, strE1, sVar6, j0.c.B(d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.a(), rVarE4), f16, 10));
                                                z1.r rVarE5 = e2.e(oVar8, 1.0f);
                                                u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar6, 48);
                                                int iHashCode4 = Long.hashCode(sVar6.T);
                                                q1 q1VarL4 = sVar6.l();
                                                z1.r rVarC6 = z1.a.c(sVar6, rVarE5);
                                                y2.k.J.getClass();
                                                y2.i iVar4 = y2.j.f56913b;
                                                sVar6.h0();
                                                if (sVar6.S) {
                                                    sVar6.k(iVar4);
                                                } else {
                                                    sVar6.r0();
                                                }
                                                t.J(y2.j.f56917f, uVarA2, sVar6);
                                                t.J(y2.j.f56916e, q1VarL4, sVar6);
                                                y2.h hVar7 = y2.j.f56918g;
                                                if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode4))) {
                                                    defpackage.e.A(iHashCode4, sVar6, iHashCode4, hVar7);
                                                }
                                                t.J(y2.j.f56915d, rVarC6, sVar6);
                                                d0.n.c(se.k.y(R.drawable.ic_sub_intro_play, sVar6, 0), null, j0.c.C(oVar8, CropImageView.DEFAULT_ASPECT_RATIO, f16, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar6, 440, 120);
                                                ua.b(ub.a.e0(sVar6, R.string.editor_s_choice_2018), null, j14, j3.A(18), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar6, 3072, 0, 131058);
                                                final int iIntValue3 = ((Number) sVar6.j(ju.f.f37371e)).intValue();
                                                boolean zD4 = sVar6.d(iIntValue3);
                                                Object objQ18 = sVar6.Q();
                                                l1.g gVar5 = l1.m.f39353a;
                                                if (zD4 || objQ18 == gVar5) {
                                                    objQ18 = new fu.x(iIntValue3, 6);
                                                    sVar6.o0(objQ18);
                                                }
                                                o0.b bVarB = o0.w.b(0, 0, 3, (fz.a) objQ18, sVar6);
                                                final b3 b3Var113 = b3Var110;
                                                boolean zF12 = sVar6.f((MergedBillingThemeBillingPage) b3Var113.getValue());
                                                Object objQ19 = sVar6.Q();
                                                Object obj6 = objQ19;
                                                if (zF12 || objQ19 == gVar5) {
                                                    x[] xVarArr = {new x(j3.w(((MergedBillingThemeBillingPage) b3Var113.getValue()).getColorUserReviewNameIcon1())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var113.getValue()).getColorUserReviewNameIcon2())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var113.getValue()).getColorUserReviewNameIcon3())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var113.getValue()).getColorUserReviewNameIcon4()))};
                                                    sVar6.o0(xVarArr);
                                                    obj6 = xVarArr;
                                                }
                                                final x[] xVarArr2 = (x[]) obj6;
                                                float f17 = 32;
                                                ve.i.d(bVarB, null, new v1(f17, f16, f17, f16), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-1375898409, new fz.g() { // from class: yg.k
                                                    @Override // fz.g
                                                    public final Object f(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                        o0.o HorizontalPager = (o0.o) obj7;
                                                        int iIntValue4 = ((Integer) obj8).intValue();
                                                        l1.n nVar4 = (l1.n) obj9;
                                                        ((Integer) obj10).getClass();
                                                        kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                                                        z1.r rVarC7 = j0.c.C(e2.g(z1.o.f58481a, 240), 10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                                        b3 b3Var114 = b3Var113;
                                                        k7.d(rVarC7, null, k7.p(j3.w(((MergedBillingThemeBillingPage) b3Var114.getValue()).getColorUserReviewCard()), nVar4, 0), k7.q(62, 4), null, t1.e.d(1410031433, new jr.y(iIntValue3, iIntValue4, j14, xVarArr2, b3Var114), nVar4), nVar4, 196614, 18);
                                                        return b0.f48488a;
                                                    }
                                                }, sVar6), sVar6, 384, 16378);
                                                sVar6.p(true);
                                            } else {
                                                sVar6.W();
                                            }
                                            break;
                                    }
                                    return b0.f48488a;
                                }
                            }, true, 793721823), 3);
                            final int i29 = 1;
                            l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.i
                                @Override // fz.f
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    switch (i29) {
                                        case 0:
                                            l0.c item = (l0.c) obj3;
                                            l1.n nVar2 = (l1.n) obj4;
                                            int iIntValue = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item, "$this$item");
                                            l1.s sVar4 = (l1.s) nVar2;
                                            if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                String strE0 = ub.a.e0(sVar4, R.string.why_learn_with_the_deer);
                                                float f13 = 44;
                                                z1.o oVar7 = z1.o.f58481a;
                                                z1.r rVarE3 = e2.e(j0.c.E(oVar7, f13, 58, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                long j12 = j11;
                                                v vVarA = d0.n.a(j12, 1);
                                                o.h(0, j12, 0L, strE0, sVar4, j0.c.B(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.a(), rVarE3), 16, 10));
                                                float f14 = 20;
                                                z1.r rVarD = j0.c.D(e2.e(j0.c.C(j0.c.E(oVar7, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 14, 24, f14, 36);
                                                u uVarA = j0.t.a(j0.i.g(26), z1.c.O, sVar4, 6);
                                                int iHashCode3 = Long.hashCode(sVar4.T);
                                                q1 q1VarL3 = sVar4.l();
                                                z1.r rVarC5 = z1.a.c(sVar4, rVarD);
                                                y2.k.J.getClass();
                                                y2.i iVar3 = y2.j.f56913b;
                                                sVar4.h0();
                                                if (sVar4.S) {
                                                    sVar4.k(iVar3);
                                                } else {
                                                    sVar4.r0();
                                                }
                                                t.J(y2.j.f56917f, uVarA, sVar4);
                                                t.J(y2.j.f56916e, q1VarL3, sVar4);
                                                y2.h hVar6 = y2.j.f56918g;
                                                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                                                    defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar6);
                                                }
                                                t.J(y2.j.f56915d, rVarC5, sVar4);
                                                String[] strArr = {ub.a.e0(sVar4, R.string.accelerated_learning), ub.a.e0(sVar4, R.string.effective_results_a), ub.a.e0(sVar4, R.string.convenient_to_use_a)};
                                                String[] strArr2 = {ub.a.e0(sVar4, R.string.systematic_curricula_guarantee_a_fast_path_to_intermediate_a), ub.a.e0(sVar4, R.string.everything_is_clarified_with_detailed_explanations_and_hd_audio_a), ub.a.e0(sVar4, R.string.feel_supported_with_settings_customized_for_asian_languages_a)};
                                                b3 b3Var112 = b3Var110;
                                                String[] strArr3 = {((MergedBillingThemeBillingPage) b3Var112.getValue()).getWhyLearnIcon1Url(), ((MergedBillingThemeBillingPage) b3Var112.getValue()).getWhyLearnIcon2Url(), ((MergedBillingThemeBillingPage) b3Var112.getValue()).getWhyLearnIcon3Url()};
                                                Integer[] numArr = {Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_1), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_2), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_3)};
                                                sVar4.d0(-663461197);
                                                int i210 = 0;
                                                int i30 = 0;
                                                while (i210 < 3) {
                                                    long j13 = j12;
                                                    l1.s sVar5 = sVar4;
                                                    o.e(strArr3[i30], numArr[i30].intValue(), strArr[i210], strArr2[i30], j13, j3.A(16), j3.A(14), sVar5, 1769472);
                                                    j12 = j13;
                                                    sVar4 = sVar5;
                                                    i210++;
                                                    i30++;
                                                }
                                                sVar4.p(false);
                                                sVar4.p(true);
                                            } else {
                                                sVar4.W();
                                            }
                                            break;
                                        default:
                                            l0.c item2 = (l0.c) obj3;
                                            l1.n nVar3 = (l1.n) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item2, "$this$item");
                                            l1.s sVar6 = (l1.s) nVar3;
                                            if (sVar6.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                String strE1 = ub.a.e0(sVar6, R.string._5m_happy_learners);
                                                float f15 = 44;
                                                z1.o oVar8 = z1.o.f58481a;
                                                z1.r rVarE4 = e2.e(j0.c.E(oVar8, f15, 40, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                final long j14 = j11;
                                                v vVarA2 = d0.n.a(j14, 1);
                                                float f16 = 16;
                                                o.h(0, j14, 0L, strE1, sVar6, j0.c.B(d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.a(), rVarE4), f16, 10));
                                                z1.r rVarE5 = e2.e(oVar8, 1.0f);
                                                u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar6, 48);
                                                int iHashCode4 = Long.hashCode(sVar6.T);
                                                q1 q1VarL4 = sVar6.l();
                                                z1.r rVarC6 = z1.a.c(sVar6, rVarE5);
                                                y2.k.J.getClass();
                                                y2.i iVar4 = y2.j.f56913b;
                                                sVar6.h0();
                                                if (sVar6.S) {
                                                    sVar6.k(iVar4);
                                                } else {
                                                    sVar6.r0();
                                                }
                                                t.J(y2.j.f56917f, uVarA2, sVar6);
                                                t.J(y2.j.f56916e, q1VarL4, sVar6);
                                                y2.h hVar7 = y2.j.f56918g;
                                                if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode4))) {
                                                    defpackage.e.A(iHashCode4, sVar6, iHashCode4, hVar7);
                                                }
                                                t.J(y2.j.f56915d, rVarC6, sVar6);
                                                d0.n.c(se.k.y(R.drawable.ic_sub_intro_play, sVar6, 0), null, j0.c.C(oVar8, CropImageView.DEFAULT_ASPECT_RATIO, f16, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar6, 440, 120);
                                                ua.b(ub.a.e0(sVar6, R.string.editor_s_choice_2018), null, j14, j3.A(18), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar6, 3072, 0, 131058);
                                                final int iIntValue3 = ((Number) sVar6.j(ju.f.f37371e)).intValue();
                                                boolean zD4 = sVar6.d(iIntValue3);
                                                Object objQ18 = sVar6.Q();
                                                l1.g gVar5 = l1.m.f39353a;
                                                if (zD4 || objQ18 == gVar5) {
                                                    objQ18 = new fu.x(iIntValue3, 6);
                                                    sVar6.o0(objQ18);
                                                }
                                                o0.b bVarB = o0.w.b(0, 0, 3, (fz.a) objQ18, sVar6);
                                                final b3 b3Var113 = b3Var110;
                                                boolean zF12 = sVar6.f((MergedBillingThemeBillingPage) b3Var113.getValue());
                                                Object objQ19 = sVar6.Q();
                                                Object obj6 = objQ19;
                                                if (zF12 || objQ19 == gVar5) {
                                                    x[] xVarArr = {new x(j3.w(((MergedBillingThemeBillingPage) b3Var113.getValue()).getColorUserReviewNameIcon1())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var113.getValue()).getColorUserReviewNameIcon2())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var113.getValue()).getColorUserReviewNameIcon3())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var113.getValue()).getColorUserReviewNameIcon4()))};
                                                    sVar6.o0(xVarArr);
                                                    obj6 = xVarArr;
                                                }
                                                final x[] xVarArr2 = (x[]) obj6;
                                                float f17 = 32;
                                                ve.i.d(bVarB, null, new v1(f17, f16, f17, f16), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-1375898409, new fz.g() { // from class: yg.k
                                                    @Override // fz.g
                                                    public final Object f(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                        o0.o HorizontalPager = (o0.o) obj7;
                                                        int iIntValue4 = ((Integer) obj8).intValue();
                                                        l1.n nVar4 = (l1.n) obj9;
                                                        ((Integer) obj10).getClass();
                                                        kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                                                        z1.r rVarC7 = j0.c.C(e2.g(z1.o.f58481a, 240), 10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                                        b3 b3Var114 = b3Var113;
                                                        k7.d(rVarC7, null, k7.p(j3.w(((MergedBillingThemeBillingPage) b3Var114.getValue()).getColorUserReviewCard()), nVar4, 0), k7.q(62, 4), null, t1.e.d(1410031433, new jr.y(iIntValue3, iIntValue4, j14, xVarArr2, b3Var114), nVar4), nVar4, 196614, 18);
                                                        return b0.f48488a;
                                                    }
                                                }, sVar6), sVar6, 384, 16378);
                                                sVar6.p(true);
                                            } else {
                                                sVar6.W();
                                            }
                                            break;
                                    }
                                    return b0.f48488a;
                                }
                            }, true, -1411920544), 3);
                            l0.h.p(LazyColumn, null, new t1.d(new r0(j11, 5), true, 677404385), 3);
                            l0.h.p(LazyColumn, null, new t1.d(new j1(j11, onTermsOfUseClick, onPrivacyPolicyClick, onContactUsClick, aVar, 1), true, -1528237982), 3);
                            if (!kotlin.jvm.internal.m.a(str5, "bottom_tab")) {
                                l0.h.p(LazyColumn, null, r.f57842b, 3);
                            }
                            return b0.f48488a;
                        }
                    };
                    str3 = str;
                    mVar5 = mVar12;
                    b3VarCollectAsStateWithLifecycle6 = b3VarCollectAsStateWithLifecycle6;
                    b3Var10 = b3VarCollectAsStateWithLifecycle;
                    b1Var7 = b1Var7;
                    sVar = sVar2;
                    sVar.o0(obj);
                } else {
                    str3 = str;
                    gVar3 = gVar2;
                    obj = objQ12;
                    b3Var10 = b3VarCollectAsStateWithLifecycle;
                    b3Var9 = b3VarCollectAsStateWithLifecycle2;
                    f11 = 1.0f;
                    sVar = sVar2;
                }
                l1.s sVar4 = sVar;
                ue.f.a(rVarC4, wVarA, null, null, null, null, false, null, (fz.c) obj, sVar4, 0, 508);
                sVar2 = sVar4;
                boolean zBooleanValue3 = ((Boolean) b3Var11.getValue()).booleanValue();
                objQ13 = sVar2.Q();
                gVar4 = gVar3;
                if (objQ13 == gVar4) {
                    objQ13 = new xt.r(9);
                    sVar2.o0(objQ13);
                }
                a0.l1 l1VarC2 = f1.c((fz.c) objQ13, 7);
                objQ14 = sVar2.Q();
                if (objQ14 == gVar4) {
                    objQ14 = new xt.r(10);
                    sVar2.o0(objQ14);
                }
                a0.j0.d(zBooleanValue3, null, l1VarC2, f1.k((fz.c) objQ14, 7), null, t1.e.d(-309655129, new defpackage.d(b3Var9, b3VarCollectAsStateWithLifecycle6, b3Var10, 19), sVar2), sVar2, 200064, 18);
                zEquals = str3.equals("bottom_tab");
                rVar = j0.r.f35391a;
                if (zEquals) {
                    oVar2 = oVar;
                    rVarV = rVar.a(oVar2, jVar);
                } else {
                    oVar2 = oVar;
                    rVarV = j0.c.v(rVar.a(oVar2, r20));
                }
                q0 q0VarD3 = j0.o.d(z1.c.f58463a, false);
                iHashCode2 = Long.hashCode(sVar2.T);
                q1 q1VarL3 = sVar2.l();
                z1.r rVarC5 = z1.a.c(sVar2, rVarV);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar2);
                } else {
                    sVar2.r0();
                }
                t.J(hVar2, q0VarD3, sVar2);
                t.J(hVar3, q1VarL3, sVar2);
                if (sVar2.S) {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
                } else {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
                }
                t.J(hVar5, rVarC5, sVar2);
                boolean zBooleanValue4 = ((Boolean) b3Var11.getValue()).booleanValue();
                objQ15 = sVar2.Q();
                if (objQ15 == gVar4) {
                    objQ15 = new xt.r(11);
                    sVar2.o0(objQ15);
                }
                a0.l1 l1VarN2 = f1.n((fz.c) objQ15);
                objQ16 = sVar2.Q();
                if (objQ16 == gVar4) {
                    objQ16 = new xt.r(12);
                    sVar2.o0(objQ16);
                }
                m1 m1VarT2 = f1.t((fz.c) objQ16);
                if (((Boolean) sVar2.j(c3Var)).booleanValue()) {
                    f12 = 0.7f;
                } else {
                    f12 = f11;
                }
                z1.r rVarE3 = e2.e(oVar2, f12);
                String str5 = str3;
                ni.m mVar13 = mVar5;
                h2 h2Var2 = new h2(b3Var4, mVar13, dVar, str5, b1Var4, b1Var5, b1Var7, b1Var6);
                source = str5;
                a0.j0.d(zBooleanValue4, rVarE3, l1VarN2, m1VarT2, null, t1.e.d(82105517, h2Var2, sVar2), sVar2, 200064, 16);
                sVar2.p(true);
                sVar2.p(true);
                aVar2 = onSubscriptionSuccess;
                k((ni.h) b3VarCollectAsStateWithLifecycle17.getValue(), aVar2, source, sVar2, ((i15 >> 15) & 112) | ((i15 << 3) & 896));
                mVar2 = mVar13;
                z12 = z13;
            } else {
                aVar2 = onSubscriptionSuccess;
                sVar2.W();
                mVar2 = mVar;
                z12 = z11;
            }
            x1VarT = sVar2.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: yg.g
                    @Override // fz.e
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        o.g(dVar, source, remoteConfigViewModel, mVar2, z12, onFinishClick, aVar2, onContactUsClick, aVar, onTermsOfUseClick, onPrivacyPolicyClick, (l1.n) obj2, t.M(i11 | 1), i12);
                        return b0.f48488a;
                    }
                };
            }
        }
        i13 |= 24576;
        if ((i11 & 196608) == 0) {
            if (sVar2.h(onFinishClick)) {
                i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
            } else {
                i26 = 65536;
            }
            i13 |= i26;
        }
        if ((i11 & 1572864) == 0) {
            if (sVar2.h(onSubscriptionSuccess)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i13 |= i25;
        }
        if ((i11 & 12582912) == 0) {
            if (sVar2.h(onContactUsClick)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i13 |= i24;
        }
        if ((i11 & 100663296) == 0) {
            if (sVar2.h(aVar)) {
                i23 = 67108864;
            } else {
                i23 = 33554432;
            }
            i13 |= i23;
        }
        if ((i11 & 805306368) == 0) {
            if (sVar2.h(onTermsOfUseClick)) {
                i22 = 536870912;
            } else {
                i22 = 268435456;
            }
            i13 |= i22;
        }
        if (sVar2.h(onPrivacyPolicyClick)) {
            c11 = 4;
        } else {
            c11 = 2;
        }
        if (sVar2.T(i13 & 1, (i13 & 306783379) == 306783378 || (c11 & 3) != 2)) {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                sVar2.d0(-1614864554);
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar2, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA2 = i20.b.a(z.a(ni.m.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), null);
                sVar2.p(false);
                mVar3 = (ni.m) viewModelA2;
                i14 = i13 & (-7169);
                if (i27 != 0) {
                    i15 = i14;
                    mVar4 = mVar3;
                    z13 = true;
                } else {
                    z13 = z11;
                    i15 = i14;
                    mVar4 = mVar3;
                }
            } else {
                sVar2.d0(-1614864554);
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar2, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA3 = i20.b.a(z.a(ni.m.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), null);
                sVar2.p(false);
                mVar3 = (ni.m) viewModelA3;
                i14 = i13 & (-7169);
                if (i27 != 0) {
                    i15 = i14;
                    mVar4 = mVar3;
                    z13 = true;
                } else {
                    z13 = z11;
                    i15 = i14;
                    mVar4 = mVar3;
                }
            }
            sVar2.q();
            b3 b3VarCollectAsStateWithLifecycle19 = FlowExtKt.collectAsStateWithLifecycle(mVar4.Z, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.f29438d, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            b3VarCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.K, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.H, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            b3VarCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.U, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            b3VarCollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.L, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            b3VarCollectAsStateWithLifecycle5 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.M, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            b3VarCollectAsStateWithLifecycle6 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.N, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            b3VarCollectAsStateWithLifecycle7 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.O, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            b3VarCollectAsStateWithLifecycle8 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.P, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            b3 b3VarCollectAsStateWithLifecycle110 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.Q, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            b3VarCollectAsStateWithLifecycle9 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.R, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            b3VarCollectAsStateWithLifecycle10 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.S, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            b3VarCollectAsStateWithLifecycle11 = FlowExtKt.collectAsStateWithLifecycle(remoteConfigViewModel.T, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            b3VarCollectAsStateWithLifecycle12 = FlowExtKt.collectAsStateWithLifecycle(mVar4.H, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            b3VarCollectAsStateWithLifecycle13 = FlowExtKt.collectAsStateWithLifecycle(mVar4.L, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            b3VarCollectAsStateWithLifecycle14 = FlowExtKt.collectAsStateWithLifecycle(mVar4.M, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            b3VarCollectAsStateWithLifecycle15 = FlowExtKt.collectAsStateWithLifecycle(mVar4.N, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            b3VarCollectAsStateWithLifecycle16 = FlowExtKt.collectAsStateWithLifecycle(mVar4.O, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            objQ = sVar2.Q();
            gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = t.B(ry.r.f50854a);
                sVar2.o0(objQ);
            }
            b1Var = (b1) objQ;
            objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = t.B(p.ANNUALLY);
                sVar2.o0(objQ2);
            }
            b1Var2 = (b1) objQ2;
            com.android.billingclient.api.o oVar7 = (com.android.billingclient.api.o) b3VarCollectAsStateWithLifecycle16.getValue();
            zF = sVar2.f(b3VarCollectAsStateWithLifecycle16) | sVar2.f(b3VarCollectAsStateWithLifecycle12) | sVar2.f(b3VarCollectAsStateWithLifecycle13) | sVar2.f(b3VarCollectAsStateWithLifecycle15) | sVar2.f(b3VarCollectAsStateWithLifecycle14);
            objQ3 = sVar2.Q();
            if (zF) {
                objQ3 = new k9.t(b3VarCollectAsStateWithLifecycle16, b3VarCollectAsStateWithLifecycle12, b1Var2, b3VarCollectAsStateWithLifecycle13, b3VarCollectAsStateWithLifecycle15, b3VarCollectAsStateWithLifecycle14, null);
                b3Var = b3VarCollectAsStateWithLifecycle16;
                b3Var2 = b3VarCollectAsStateWithLifecycle15;
                b3Var3 = b3VarCollectAsStateWithLifecycle14;
                sVar2.o0(objQ3);
            } else {
                objQ3 = new k9.t(b3VarCollectAsStateWithLifecycle16, b3VarCollectAsStateWithLifecycle12, b1Var2, b3VarCollectAsStateWithLifecycle13, b3VarCollectAsStateWithLifecycle15, b3VarCollectAsStateWithLifecycle14, null);
                b3Var = b3VarCollectAsStateWithLifecycle16;
                b3Var2 = b3VarCollectAsStateWithLifecycle15;
                b3Var3 = b3VarCollectAsStateWithLifecycle14;
                sVar2.o0(objQ3);
            }
            t.f((fz.e) objQ3, oVar7, sVar2);
            com.android.billingclient.api.o oVar8 = (com.android.billingclient.api.o) r26.getValue();
            com.android.billingclient.api.o oVar9 = (com.android.billingclient.api.o) b3Var2.getValue();
            b3Var4 = b3Var;
            Integer numValueOf3 = Integer.valueOf(((BillingPageRecomConfig) b3VarCollectAsStateWithLifecycle3.getValue()).getRecomType());
            zF2 = sVar2.f(b3VarCollectAsStateWithLifecycle3) | sVar2.h(mVar4) | sVar2.f(r26) | sVar2.f(b3VarCollectAsStateWithLifecycle4);
            objQ4 = sVar2.Q();
            if (zF2) {
                ni.m mVar14 = mVar4;
                b1Var3 = b1Var;
                objQ4 = new m(mVar14, b3VarCollectAsStateWithLifecycle3, r26, b3VarCollectAsStateWithLifecycle4, b1Var3, null, 0);
                mVar5 = mVar14;
                b3Var5 = b3VarCollectAsStateWithLifecycle3;
                b3Var6 = r26;
                sVar2.o0(objQ4);
            } else {
                ni.m mVar15 = mVar4;
                b1Var3 = b1Var;
                objQ4 = new m(mVar15, b3VarCollectAsStateWithLifecycle3, r26, b3VarCollectAsStateWithLifecycle4, b1Var3, null, 0);
                mVar5 = mVar15;
                b3Var5 = b3VarCollectAsStateWithLifecycle3;
                b3Var6 = r26;
                sVar2.o0(objQ4);
            }
            t.h(oVar8, oVar9, numValueOf3, (fz.e) objQ4, sVar2);
            com.android.billingclient.api.o oVar10 = (com.android.billingclient.api.o) b3Var2.getValue();
            Integer numValueOf4 = Integer.valueOf(((BillingPageRecomConfig) b3Var5.getValue()).getRecomType());
            zF3 = sVar2.f(b3Var5) | sVar2.h(mVar5) | sVar2.f(b3Var2) | sVar2.f(r28);
            objQ5 = sVar2.Q();
            if (zF3) {
                objQ5 = new m(mVar5, b3Var5, b3Var2, b3VarCollectAsStateWithLifecycle4, b1Var3, null, 1);
                sVar2.o0(objQ5);
            } else {
                objQ5 = new m(mVar5, b3Var5, b3Var2, b3VarCollectAsStateWithLifecycle4, b1Var3, null, 1);
                sVar2.o0(objQ5);
            }
            t.g(oVar10, numValueOf4, (fz.e) objQ5, sVar2);
            zD = sVar2.d(((p) b1Var2.getValue()).ordinal()) | sVar2.f((String) b3VarCollectAsStateWithLifecycle8.getValue()) | sVar2.f((String) b3VarCollectAsStateWithLifecycle9.getValue()) | sVar2.f((String) b3VarCollectAsStateWithLifecycle110.getValue());
            Object objQ18 = sVar2.Q();
            if (zD) {
                i16 = n.f57836a[((p) b1Var2.getValue()).ordinal()];
                if (i16 != 1) {
                    i17 = 2;
                    if (i16 != 2) {
                        str2 = (String) b3VarCollectAsStateWithLifecycle9.getValue();
                    } else {
                        str2 = (String) b3VarCollectAsStateWithLifecycle9.getValue();
                    }
                } else {
                    i17 = 2;
                    str2 = (String) b3VarCollectAsStateWithLifecycle8.getValue();
                }
                objB = t.B(str2);
                sVar2.o0(objB);
            } else {
                i16 = n.f57836a[((p) b1Var2.getValue()).ordinal()];
                if (i16 != 1) {
                    i17 = 2;
                    if (i16 != 2) {
                        str2 = (String) b3VarCollectAsStateWithLifecycle9.getValue();
                    } else {
                        str2 = (String) b3VarCollectAsStateWithLifecycle9.getValue();
                    }
                } else {
                    i17 = 2;
                    str2 = (String) b3VarCollectAsStateWithLifecycle8.getValue();
                }
                objB = t.B(str2);
                sVar2.o0(objB);
            }
            b1Var4 = (b1) objB;
            zF4 = sVar2.f((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()) | sVar2.d(((p) b1Var2.getValue()).ordinal());
            objQ6 = sVar2.Q();
            if (zF4) {
                i18 = n.f57836a[((p) b1Var2.getValue()).ordinal()];
                if (i18 == 1) {
                    jW = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonBuyYearlyText());
                } else if (i18 != i17) {
                    jW = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonText());
                } else {
                    jW = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonText());
                }
                objQ6 = t.B(new x(jW));
                sVar2.o0(objQ6);
            } else {
                i18 = n.f57836a[((p) b1Var2.getValue()).ordinal()];
                if (i18 == 1) {
                    jW = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonBuyYearlyText());
                } else if (i18 != i17) {
                    jW = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonText());
                } else {
                    jW = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonText());
                }
                objQ6 = t.B(new x(jW));
                sVar2.o0(objQ6);
            }
            b1Var5 = (b1) objQ6;
            zD2 = sVar2.d(((p) b1Var2.getValue()).ordinal()) | sVar2.f((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue());
            objQ7 = sVar2.Q();
            if (zD2) {
                i19 = n.f57836a[((p) b1Var2.getValue()).ordinal()];
                if (i19 == 1) {
                    jW2 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonBuyYearly());
                } else if (i19 != i17) {
                    jW2 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButton());
                } else {
                    jW2 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButton());
                }
                objQ7 = t.B(new x(jW2));
                sVar2.o0(objQ7);
            } else {
                i19 = n.f57836a[((p) b1Var2.getValue()).ordinal()];
                if (i19 == 1) {
                    jW2 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonBuyYearly());
                } else if (i19 != i17) {
                    jW2 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButton());
                } else {
                    jW2 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButton());
                }
                objQ7 = t.B(new x(jW2));
                sVar2.o0(objQ7);
            }
            b1 b1Var13 = (b1) objQ7;
            zD3 = sVar2.d(((p) b1Var2.getValue()).ordinal()) | sVar2.f((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue());
            objQ8 = sVar2.Q();
            if (zD3) {
                i21 = n.f57836a[((p) b1Var2.getValue()).ordinal()];
                if (i21 == 1) {
                    jW3 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonBuyYearlyEnd());
                } else if (i21 != i17) {
                    jW3 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonEnd());
                } else {
                    jW3 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonEnd());
                }
                objQ8 = t.B(new x(jW3));
                sVar2.o0(objQ8);
            } else {
                i21 = n.f57836a[((p) b1Var2.getValue()).ordinal()];
                if (i21 == 1) {
                    jW3 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonBuyYearlyEnd());
                } else if (i21 != i17) {
                    jW3 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonEnd());
                } else {
                    jW3 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorButtonEnd());
                }
                objQ8 = t.B(new x(jW3));
                sVar2.o0(objQ8);
            }
            b1Var6 = (b1) objQ8;
            w wVarA2 = y.a(0, sVar2, 3);
            objQ9 = sVar2.Q();
            if (objQ9 == gVar) {
                objQ9 = defpackage.e.v(0, sVar2);
            }
            a1Var = (a1) objQ9;
            objQ10 = sVar2.Q();
            if (objQ10 == gVar) {
                objQ10 = t.s(new gr.j(a1Var, 13));
                sVar2.o0(objQ10);
            }
            b3 b3Var110 = (b3) objQ10;
            jW4 = j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorTitle());
            zF5 = sVar2.f(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorBackgroundEnd()) | sVar2.f(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorBackgroundStart());
            objQ11 = sVar2.Q();
            if (zF5) {
                objQ11 = p3.A(ns.o.L(new x(j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorBackgroundStart())), new x(j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorBackgroundEnd()))));
                sVar2.o0(objQ11);
            } else {
                objQ11 = p3.A(ns.o.L(new x(j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorBackgroundStart())), new x(j3.w(((MergedBillingThemeBillingPage) b3VarCollectAsStateWithLifecycle2.getValue()).getColorBackgroundEnd()))));
                sVar2.o0(objQ11);
            }
            tVar = (g2.t) objQ11;
            oVar = z1.o.f58481a;
            z1.r rVarE4 = e2.e(oVar, 1.0f);
            gVar2 = gVar;
            q0 q0VarD4 = j0.o.d(z1.c.f58464b, false);
            iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL4 = sVar2.l();
            z1.r rVarC6 = z1.a.c(sVar2, rVarE4);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar6 = y2.j.f56917f;
            t.J(hVar6, q0VarD4, sVar2);
            y2.h hVar7 = y2.j.f56916e;
            t.J(hVar7, q1VarL4, sVar2);
            hVar = y2.j.f56918g;
            if (sVar2.S) {
                iVar2 = iVar;
                if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                }
                y2.h hVar8 = y2.j.f56915d;
                t.J(hVar8, rVarC6, sVar2);
                if (z13) {
                    rVarG = j0.c.v(d0.n.g(oVar, tVar, null, 6));
                } else {
                    rVarG = d0.n.g(oVar, tVar, null, 6);
                }
                c3Var = ju.f.f37376j;
                if (((Boolean) sVar2.j(c3Var)).booleanValue()) {
                    f5 = 0.7f;
                } else {
                    f5 = 1.0f;
                }
                z1.r rVarC7 = e2.c(e2.e(rVarG, f5), 1.0f);
                boolean zF12 = sVar2.f(b3VarCollectAsStateWithLifecycle2);
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z29 = z14 | zF12;
                if ((i15 & 458752) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zF13 = z29 | z15 | sVar2.f(b3VarCollectAsStateWithLifecycle10) | sVar2.f(b3VarCollectAsStateWithLifecycle5) | sVar2.f(b3VarCollectAsStateWithLifecycle11);
                b3Var7 = b3Var6;
                b3Var8 = b3Var3;
                b1Var7 = b1Var13;
                boolean zF14 = zF13 | sVar2.f(b3Var7) | sVar2.h(mVar5) | sVar2.f(b3Var5) | sVar2.f(b3VarCollectAsStateWithLifecycle6) | sVar2.f(b3VarCollectAsStateWithLifecycle) | sVar2.f(b3VarCollectAsStateWithLifecycle13) | sVar2.f(b3Var8) | sVar2.f(b3VarCollectAsStateWithLifecycle7) | sVar2.f(b3Var2) | sVar2.f(b1Var4) | sVar2.f(b1Var5) | sVar2.f(b1Var13) | sVar2.f(b1Var6) | sVar2.f(b3Var4) | sVar2.h(dVar) | sVar2.e(jW4);
                if ((i15 & 1879048192) == 536870912) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z210 = zF14 | z16;
                if ((c11 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z211 = z210 | z17;
                if ((i15 & 29360128) == 8388608) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z212 = z211 | z18;
                if ((i15 & 234881024) == 67108864) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = z212 | z19;
                objQ12 = sVar2.Q();
                if (z20) {
                    b3Var9 = b3VarCollectAsStateWithLifecycle2;
                    gVar3 = gVar2;
                    f11 = 1.0f;
                    final ni.m mVar16 = mVar5;
                    final b3 b3Var111 = b3Var5;
                    final b1 b1Var14 = b1Var3;
                    final b3 b3Var112 = b3Var2;
                    obj = new fz.c() { // from class: yg.f
                        @Override // fz.c
                        public final Object invoke(Object obj2) {
                            l0.h LazyColumn = (l0.h) obj2;
                            kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                            final String str6 = str;
                            fz.a aVar3 = onFinishClick;
                            final b3 b3Var113 = b3Var9;
                            l0.h.p(LazyColumn, null, new t1.d(new defpackage.d(str6, aVar3, b3Var113, 20), true, -1625515996), 3);
                            l0.h.p(LazyColumn, null, new t1.d(new tp.u(4, b3VarCollectAsStateWithLifecycle10, b3Var113), true, 1026356699), 3);
                            b1 b1Var15 = b1Var14;
                            final ni.m mVar17 = mVar16;
                            l0.h.p(LazyColumn, null, new t1.d(new ei.n(b1Var15, mVar17, b1Var2, b3VarCollectAsStateWithLifecycle5, b3VarCollectAsStateWithLifecycle11, b3Var7, b3Var113, b3Var111, b3VarCollectAsStateWithLifecycle6, b3VarCollectAsStateWithLifecycle, b3VarCollectAsStateWithLifecycle13, b3Var8, b3VarCollectAsStateWithLifecycle7, b3Var112), true, -1179285668), 3);
                            final b3 b3Var114 = b3Var4;
                            final xg.d dVar2 = dVar;
                            final long j11 = jW4;
                            final b1 b1Var16 = b1Var4;
                            final b1 b1Var17 = b1Var5;
                            final b1 b1Var18 = b1Var7;
                            final b1 b1Var19 = b1Var6;
                            final a1 a1Var2 = a1Var;
                            l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.h
                                @Override // fz.f
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    l0.c item = (l0.c) obj3;
                                    l1.n nVar2 = (l1.n) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    kotlin.jvm.internal.m.f(item, "$this$item");
                                    l1.s sVar5 = (l1.s) nVar2;
                                    if (sVar5.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        String str7 = (String) b1Var16.getValue();
                                        long j12 = ((x) b1Var17.getValue()).f28624a;
                                        long j13 = ((x) b1Var18.getValue()).f28624a;
                                        long j14 = ((x) b1Var19.getValue()).f28624a;
                                        float f13 = 36;
                                        z1.o oVar11 = z1.o.f58481a;
                                        z1.r rVarE5 = j0.c.E(oVar11, f13, 29, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8);
                                        Object objQ19 = sVar5.Q();
                                        l1.g gVar5 = l1.m.f39353a;
                                        if (objQ19 == gVar5) {
                                            objQ19 = new bt.a2(a1Var2, 17);
                                            sVar5.o0(objQ19);
                                        }
                                        z1.r rVarN = a0.n(rVarE5, (fz.c) objQ19);
                                        b3 b3Var115 = b3Var114;
                                        boolean zF15 = sVar5.f(b3Var115);
                                        ni.m mVar18 = mVar17;
                                        boolean zH = zF15 | sVar5.h(mVar18);
                                        xg.d dVar3 = dVar2;
                                        boolean zH2 = zH | sVar5.h(dVar3);
                                        String str8 = str6;
                                        boolean zF16 = zH2 | sVar5.f(str8);
                                        Object objQ110 = sVar5.Q();
                                        if (zF16 || objQ110 == gVar5) {
                                            objQ110 = new j(b3Var115, mVar18, dVar3, str8, 1);
                                            sVar5.o0(objQ110);
                                        }
                                        o.c(str7, j12, j13, j14, rVarN, (fz.a) objQ110, sVar5, 0);
                                        ua.b(ub.a.e0(sVar5, R.string.cancel_anytime_or_manage_subscriptions_in_google_play), e2.e(j0.c.E(j0.c.C(oVar11, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(ua.f31167a), j11, j3.A(11), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar5, 48, 0, 65532);
                                    } else {
                                        sVar5.W();
                                    }
                                    return b0.f48488a;
                                }
                            }, true, 910039261), 3);
                            l0.h.p(LazyColumn, null, new t1.d(new r0(j11, 4), true, -1295603106), 3);
                            final int i28 = 0;
                            l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.i
                                @Override // fz.f
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    switch (i28) {
                                        case 0:
                                            l0.c item = (l0.c) obj3;
                                            l1.n nVar2 = (l1.n) obj4;
                                            int iIntValue = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item, "$this$item");
                                            l1.s sVar5 = (l1.s) nVar2;
                                            if (sVar5.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                String strE0 = ub.a.e0(sVar5, R.string.why_learn_with_the_deer);
                                                float f13 = 44;
                                                z1.o oVar11 = z1.o.f58481a;
                                                z1.r rVarE5 = e2.e(j0.c.E(oVar11, f13, 58, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                long j12 = j11;
                                                v vVarA = d0.n.a(j12, 1);
                                                o.h(0, j12, 0L, strE0, sVar5, j0.c.B(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.a(), rVarE5), 16, 10));
                                                float f14 = 20;
                                                z1.r rVarD = j0.c.D(e2.e(j0.c.C(j0.c.E(oVar11, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 14, 24, f14, 36);
                                                u uVarA = j0.t.a(j0.i.g(26), z1.c.O, sVar5, 6);
                                                int iHashCode3 = Long.hashCode(sVar5.T);
                                                q1 q1VarL5 = sVar5.l();
                                                z1.r rVarC8 = z1.a.c(sVar5, rVarD);
                                                y2.k.J.getClass();
                                                y2.i iVar3 = y2.j.f56913b;
                                                sVar5.h0();
                                                if (sVar5.S) {
                                                    sVar5.k(iVar3);
                                                } else {
                                                    sVar5.r0();
                                                }
                                                t.J(y2.j.f56917f, uVarA, sVar5);
                                                t.J(y2.j.f56916e, q1VarL5, sVar5);
                                                y2.h hVar9 = y2.j.f56918g;
                                                if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode3))) {
                                                    defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar9);
                                                }
                                                t.J(y2.j.f56915d, rVarC8, sVar5);
                                                String[] strArr = {ub.a.e0(sVar5, R.string.accelerated_learning), ub.a.e0(sVar5, R.string.effective_results_a), ub.a.e0(sVar5, R.string.convenient_to_use_a)};
                                                String[] strArr2 = {ub.a.e0(sVar5, R.string.systematic_curricula_guarantee_a_fast_path_to_intermediate_a), ub.a.e0(sVar5, R.string.everything_is_clarified_with_detailed_explanations_and_hd_audio_a), ub.a.e0(sVar5, R.string.feel_supported_with_settings_customized_for_asian_languages_a)};
                                                b3 b3Var115 = b3Var113;
                                                String[] strArr3 = {((MergedBillingThemeBillingPage) b3Var115.getValue()).getWhyLearnIcon1Url(), ((MergedBillingThemeBillingPage) b3Var115.getValue()).getWhyLearnIcon2Url(), ((MergedBillingThemeBillingPage) b3Var115.getValue()).getWhyLearnIcon3Url()};
                                                Integer[] numArr = {Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_1), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_2), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_3)};
                                                sVar5.d0(-663461197);
                                                int i210 = 0;
                                                int i30 = 0;
                                                while (i210 < 3) {
                                                    long j13 = j12;
                                                    l1.s sVar6 = sVar5;
                                                    o.e(strArr3[i30], numArr[i30].intValue(), strArr[i210], strArr2[i30], j13, j3.A(16), j3.A(14), sVar6, 1769472);
                                                    j12 = j13;
                                                    sVar5 = sVar6;
                                                    i210++;
                                                    i30++;
                                                }
                                                sVar5.p(false);
                                                sVar5.p(true);
                                            } else {
                                                sVar5.W();
                                            }
                                            break;
                                        default:
                                            l0.c item2 = (l0.c) obj3;
                                            l1.n nVar3 = (l1.n) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item2, "$this$item");
                                            l1.s sVar7 = (l1.s) nVar3;
                                            if (sVar7.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                String strE1 = ub.a.e0(sVar7, R.string._5m_happy_learners);
                                                float f15 = 44;
                                                z1.o oVar12 = z1.o.f58481a;
                                                z1.r rVarE6 = e2.e(j0.c.E(oVar12, f15, 40, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                final long j14 = j11;
                                                v vVarA2 = d0.n.a(j14, 1);
                                                float f16 = 16;
                                                o.h(0, j14, 0L, strE1, sVar7, j0.c.B(d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.a(), rVarE6), f16, 10));
                                                z1.r rVarE7 = e2.e(oVar12, 1.0f);
                                                u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar7, 48);
                                                int iHashCode4 = Long.hashCode(sVar7.T);
                                                q1 q1VarL6 = sVar7.l();
                                                z1.r rVarC9 = z1.a.c(sVar7, rVarE7);
                                                y2.k.J.getClass();
                                                y2.i iVar4 = y2.j.f56913b;
                                                sVar7.h0();
                                                if (sVar7.S) {
                                                    sVar7.k(iVar4);
                                                } else {
                                                    sVar7.r0();
                                                }
                                                t.J(y2.j.f56917f, uVarA2, sVar7);
                                                t.J(y2.j.f56916e, q1VarL6, sVar7);
                                                y2.h hVar10 = y2.j.f56918g;
                                                if (sVar7.S || !kotlin.jvm.internal.m.a(sVar7.Q(), Integer.valueOf(iHashCode4))) {
                                                    defpackage.e.A(iHashCode4, sVar7, iHashCode4, hVar10);
                                                }
                                                t.J(y2.j.f56915d, rVarC9, sVar7);
                                                d0.n.c(se.k.y(R.drawable.ic_sub_intro_play, sVar7, 0), null, j0.c.C(oVar12, CropImageView.DEFAULT_ASPECT_RATIO, f16, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar7, 440, 120);
                                                ua.b(ub.a.e0(sVar7, R.string.editor_s_choice_2018), null, j14, j3.A(18), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar7, 3072, 0, 131058);
                                                final int iIntValue3 = ((Number) sVar7.j(ju.f.f37371e)).intValue();
                                                boolean zD4 = sVar7.d(iIntValue3);
                                                Object objQ19 = sVar7.Q();
                                                l1.g gVar5 = l1.m.f39353a;
                                                if (zD4 || objQ19 == gVar5) {
                                                    objQ19 = new fu.x(iIntValue3, 6);
                                                    sVar7.o0(objQ19);
                                                }
                                                o0.b bVarB = o0.w.b(0, 0, 3, (fz.a) objQ19, sVar7);
                                                final b3 b3Var116 = b3Var113;
                                                boolean zF15 = sVar7.f((MergedBillingThemeBillingPage) b3Var116.getValue());
                                                Object objQ110 = sVar7.Q();
                                                Object obj6 = objQ110;
                                                if (zF15 || objQ110 == gVar5) {
                                                    x[] xVarArr = {new x(j3.w(((MergedBillingThemeBillingPage) b3Var116.getValue()).getColorUserReviewNameIcon1())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var116.getValue()).getColorUserReviewNameIcon2())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var116.getValue()).getColorUserReviewNameIcon3())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var116.getValue()).getColorUserReviewNameIcon4()))};
                                                    sVar7.o0(xVarArr);
                                                    obj6 = xVarArr;
                                                }
                                                final x[] xVarArr2 = (x[]) obj6;
                                                float f17 = 32;
                                                ve.i.d(bVarB, null, new v1(f17, f16, f17, f16), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-1375898409, new fz.g() { // from class: yg.k
                                                    @Override // fz.g
                                                    public final Object f(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                        o0.o HorizontalPager = (o0.o) obj7;
                                                        int iIntValue4 = ((Integer) obj8).intValue();
                                                        l1.n nVar4 = (l1.n) obj9;
                                                        ((Integer) obj10).getClass();
                                                        kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                                                        z1.r rVarC10 = j0.c.C(e2.g(z1.o.f58481a, 240), 10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                                        b3 b3Var117 = b3Var116;
                                                        k7.d(rVarC10, null, k7.p(j3.w(((MergedBillingThemeBillingPage) b3Var117.getValue()).getColorUserReviewCard()), nVar4, 0), k7.q(62, 4), null, t1.e.d(1410031433, new jr.y(iIntValue3, iIntValue4, j14, xVarArr2, b3Var117), nVar4), nVar4, 196614, 18);
                                                        return b0.f48488a;
                                                    }
                                                }, sVar7), sVar7, 384, 16378);
                                                sVar7.p(true);
                                            } else {
                                                sVar7.W();
                                            }
                                            break;
                                    }
                                    return b0.f48488a;
                                }
                            }, true, 793721823), 3);
                            final int i29 = 1;
                            l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.i
                                @Override // fz.f
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    switch (i29) {
                                        case 0:
                                            l0.c item = (l0.c) obj3;
                                            l1.n nVar2 = (l1.n) obj4;
                                            int iIntValue = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item, "$this$item");
                                            l1.s sVar5 = (l1.s) nVar2;
                                            if (sVar5.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                String strE0 = ub.a.e0(sVar5, R.string.why_learn_with_the_deer);
                                                float f13 = 44;
                                                z1.o oVar11 = z1.o.f58481a;
                                                z1.r rVarE5 = e2.e(j0.c.E(oVar11, f13, 58, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                long j12 = j11;
                                                v vVarA = d0.n.a(j12, 1);
                                                o.h(0, j12, 0L, strE0, sVar5, j0.c.B(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.a(), rVarE5), 16, 10));
                                                float f14 = 20;
                                                z1.r rVarD = j0.c.D(e2.e(j0.c.C(j0.c.E(oVar11, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 14, 24, f14, 36);
                                                u uVarA = j0.t.a(j0.i.g(26), z1.c.O, sVar5, 6);
                                                int iHashCode3 = Long.hashCode(sVar5.T);
                                                q1 q1VarL5 = sVar5.l();
                                                z1.r rVarC8 = z1.a.c(sVar5, rVarD);
                                                y2.k.J.getClass();
                                                y2.i iVar3 = y2.j.f56913b;
                                                sVar5.h0();
                                                if (sVar5.S) {
                                                    sVar5.k(iVar3);
                                                } else {
                                                    sVar5.r0();
                                                }
                                                t.J(y2.j.f56917f, uVarA, sVar5);
                                                t.J(y2.j.f56916e, q1VarL5, sVar5);
                                                y2.h hVar9 = y2.j.f56918g;
                                                if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode3))) {
                                                    defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar9);
                                                }
                                                t.J(y2.j.f56915d, rVarC8, sVar5);
                                                String[] strArr = {ub.a.e0(sVar5, R.string.accelerated_learning), ub.a.e0(sVar5, R.string.effective_results_a), ub.a.e0(sVar5, R.string.convenient_to_use_a)};
                                                String[] strArr2 = {ub.a.e0(sVar5, R.string.systematic_curricula_guarantee_a_fast_path_to_intermediate_a), ub.a.e0(sVar5, R.string.everything_is_clarified_with_detailed_explanations_and_hd_audio_a), ub.a.e0(sVar5, R.string.feel_supported_with_settings_customized_for_asian_languages_a)};
                                                b3 b3Var115 = b3Var113;
                                                String[] strArr3 = {((MergedBillingThemeBillingPage) b3Var115.getValue()).getWhyLearnIcon1Url(), ((MergedBillingThemeBillingPage) b3Var115.getValue()).getWhyLearnIcon2Url(), ((MergedBillingThemeBillingPage) b3Var115.getValue()).getWhyLearnIcon3Url()};
                                                Integer[] numArr = {Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_1), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_2), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_3)};
                                                sVar5.d0(-663461197);
                                                int i210 = 0;
                                                int i30 = 0;
                                                while (i210 < 3) {
                                                    long j13 = j12;
                                                    l1.s sVar6 = sVar5;
                                                    o.e(strArr3[i30], numArr[i30].intValue(), strArr[i210], strArr2[i30], j13, j3.A(16), j3.A(14), sVar6, 1769472);
                                                    j12 = j13;
                                                    sVar5 = sVar6;
                                                    i210++;
                                                    i30++;
                                                }
                                                sVar5.p(false);
                                                sVar5.p(true);
                                            } else {
                                                sVar5.W();
                                            }
                                            break;
                                        default:
                                            l0.c item2 = (l0.c) obj3;
                                            l1.n nVar3 = (l1.n) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item2, "$this$item");
                                            l1.s sVar7 = (l1.s) nVar3;
                                            if (sVar7.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                String strE1 = ub.a.e0(sVar7, R.string._5m_happy_learners);
                                                float f15 = 44;
                                                z1.o oVar12 = z1.o.f58481a;
                                                z1.r rVarE6 = e2.e(j0.c.E(oVar12, f15, 40, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                final long j14 = j11;
                                                v vVarA2 = d0.n.a(j14, 1);
                                                float f16 = 16;
                                                o.h(0, j14, 0L, strE1, sVar7, j0.c.B(d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.a(), rVarE6), f16, 10));
                                                z1.r rVarE7 = e2.e(oVar12, 1.0f);
                                                u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar7, 48);
                                                int iHashCode4 = Long.hashCode(sVar7.T);
                                                q1 q1VarL6 = sVar7.l();
                                                z1.r rVarC9 = z1.a.c(sVar7, rVarE7);
                                                y2.k.J.getClass();
                                                y2.i iVar4 = y2.j.f56913b;
                                                sVar7.h0();
                                                if (sVar7.S) {
                                                    sVar7.k(iVar4);
                                                } else {
                                                    sVar7.r0();
                                                }
                                                t.J(y2.j.f56917f, uVarA2, sVar7);
                                                t.J(y2.j.f56916e, q1VarL6, sVar7);
                                                y2.h hVar10 = y2.j.f56918g;
                                                if (sVar7.S || !kotlin.jvm.internal.m.a(sVar7.Q(), Integer.valueOf(iHashCode4))) {
                                                    defpackage.e.A(iHashCode4, sVar7, iHashCode4, hVar10);
                                                }
                                                t.J(y2.j.f56915d, rVarC9, sVar7);
                                                d0.n.c(se.k.y(R.drawable.ic_sub_intro_play, sVar7, 0), null, j0.c.C(oVar12, CropImageView.DEFAULT_ASPECT_RATIO, f16, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar7, 440, 120);
                                                ua.b(ub.a.e0(sVar7, R.string.editor_s_choice_2018), null, j14, j3.A(18), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar7, 3072, 0, 131058);
                                                final int iIntValue3 = ((Number) sVar7.j(ju.f.f37371e)).intValue();
                                                boolean zD4 = sVar7.d(iIntValue3);
                                                Object objQ19 = sVar7.Q();
                                                l1.g gVar5 = l1.m.f39353a;
                                                if (zD4 || objQ19 == gVar5) {
                                                    objQ19 = new fu.x(iIntValue3, 6);
                                                    sVar7.o0(objQ19);
                                                }
                                                o0.b bVarB = o0.w.b(0, 0, 3, (fz.a) objQ19, sVar7);
                                                final b3 b3Var116 = b3Var113;
                                                boolean zF15 = sVar7.f((MergedBillingThemeBillingPage) b3Var116.getValue());
                                                Object objQ110 = sVar7.Q();
                                                Object obj6 = objQ110;
                                                if (zF15 || objQ110 == gVar5) {
                                                    x[] xVarArr = {new x(j3.w(((MergedBillingThemeBillingPage) b3Var116.getValue()).getColorUserReviewNameIcon1())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var116.getValue()).getColorUserReviewNameIcon2())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var116.getValue()).getColorUserReviewNameIcon3())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var116.getValue()).getColorUserReviewNameIcon4()))};
                                                    sVar7.o0(xVarArr);
                                                    obj6 = xVarArr;
                                                }
                                                final x[] xVarArr2 = (x[]) obj6;
                                                float f17 = 32;
                                                ve.i.d(bVarB, null, new v1(f17, f16, f17, f16), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-1375898409, new fz.g() { // from class: yg.k
                                                    @Override // fz.g
                                                    public final Object f(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                        o0.o HorizontalPager = (o0.o) obj7;
                                                        int iIntValue4 = ((Integer) obj8).intValue();
                                                        l1.n nVar4 = (l1.n) obj9;
                                                        ((Integer) obj10).getClass();
                                                        kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                                                        z1.r rVarC10 = j0.c.C(e2.g(z1.o.f58481a, 240), 10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                                        b3 b3Var117 = b3Var116;
                                                        k7.d(rVarC10, null, k7.p(j3.w(((MergedBillingThemeBillingPage) b3Var117.getValue()).getColorUserReviewCard()), nVar4, 0), k7.q(62, 4), null, t1.e.d(1410031433, new jr.y(iIntValue3, iIntValue4, j14, xVarArr2, b3Var117), nVar4), nVar4, 196614, 18);
                                                        return b0.f48488a;
                                                    }
                                                }, sVar7), sVar7, 384, 16378);
                                                sVar7.p(true);
                                            } else {
                                                sVar7.W();
                                            }
                                            break;
                                    }
                                    return b0.f48488a;
                                }
                            }, true, -1411920544), 3);
                            l0.h.p(LazyColumn, null, new t1.d(new r0(j11, 5), true, 677404385), 3);
                            l0.h.p(LazyColumn, null, new t1.d(new j1(j11, onTermsOfUseClick, onPrivacyPolicyClick, onContactUsClick, aVar, 1), true, -1528237982), 3);
                            if (!kotlin.jvm.internal.m.a(str6, "bottom_tab")) {
                                l0.h.p(LazyColumn, null, r.f57842b, 3);
                            }
                            return b0.f48488a;
                        }
                    };
                    str3 = str;
                    mVar5 = mVar16;
                    b3VarCollectAsStateWithLifecycle6 = b3VarCollectAsStateWithLifecycle6;
                    b3Var10 = b3VarCollectAsStateWithLifecycle;
                    b1Var7 = b1Var7;
                    sVar = sVar2;
                    sVar.o0(obj);
                } else if (objQ12 == gVar2) {
                    gVar2 = gVar2;
                    b3Var9 = b3VarCollectAsStateWithLifecycle2;
                    gVar3 = gVar2;
                    f11 = 1.0f;
                    final ni.m mVar17 = mVar5;
                    final b3 b3Var113 = b3Var5;
                    final b1 b1Var15 = b1Var3;
                    final b3 b3Var114 = b3Var2;
                    obj = new fz.c() { // from class: yg.f
                        @Override // fz.c
                        public final Object invoke(Object obj2) {
                            l0.h LazyColumn = (l0.h) obj2;
                            kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                            final String str6 = str;
                            fz.a aVar3 = onFinishClick;
                            final b3 b3Var115 = b3Var9;
                            l0.h.p(LazyColumn, null, new t1.d(new defpackage.d(str6, aVar3, b3Var115, 20), true, -1625515996), 3);
                            l0.h.p(LazyColumn, null, new t1.d(new tp.u(4, b3VarCollectAsStateWithLifecycle10, b3Var115), true, 1026356699), 3);
                            b1 b1Var16 = b1Var15;
                            final ni.m mVar18 = mVar17;
                            l0.h.p(LazyColumn, null, new t1.d(new ei.n(b1Var16, mVar18, b1Var2, b3VarCollectAsStateWithLifecycle5, b3VarCollectAsStateWithLifecycle11, b3Var7, b3Var115, b3Var113, b3VarCollectAsStateWithLifecycle6, b3VarCollectAsStateWithLifecycle, b3VarCollectAsStateWithLifecycle13, b3Var8, b3VarCollectAsStateWithLifecycle7, b3Var114), true, -1179285668), 3);
                            final b3 b3Var116 = b3Var4;
                            final xg.d dVar2 = dVar;
                            final long j11 = jW4;
                            final b1 b1Var17 = b1Var4;
                            final b1 b1Var18 = b1Var5;
                            final b1 b1Var19 = b1Var7;
                            final b1 b1Var110 = b1Var6;
                            final a1 a1Var2 = a1Var;
                            l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.h
                                @Override // fz.f
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    l0.c item = (l0.c) obj3;
                                    l1.n nVar2 = (l1.n) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    kotlin.jvm.internal.m.f(item, "$this$item");
                                    l1.s sVar5 = (l1.s) nVar2;
                                    if (sVar5.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        String str7 = (String) b1Var17.getValue();
                                        long j12 = ((x) b1Var18.getValue()).f28624a;
                                        long j13 = ((x) b1Var19.getValue()).f28624a;
                                        long j14 = ((x) b1Var110.getValue()).f28624a;
                                        float f13 = 36;
                                        z1.o oVar11 = z1.o.f58481a;
                                        z1.r rVarE5 = j0.c.E(oVar11, f13, 29, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8);
                                        Object objQ19 = sVar5.Q();
                                        l1.g gVar5 = l1.m.f39353a;
                                        if (objQ19 == gVar5) {
                                            objQ19 = new bt.a2(a1Var2, 17);
                                            sVar5.o0(objQ19);
                                        }
                                        z1.r rVarN = a0.n(rVarE5, (fz.c) objQ19);
                                        b3 b3Var117 = b3Var116;
                                        boolean zF15 = sVar5.f(b3Var117);
                                        ni.m mVar19 = mVar18;
                                        boolean zH = zF15 | sVar5.h(mVar19);
                                        xg.d dVar3 = dVar2;
                                        boolean zH2 = zH | sVar5.h(dVar3);
                                        String str8 = str6;
                                        boolean zF16 = zH2 | sVar5.f(str8);
                                        Object objQ110 = sVar5.Q();
                                        if (zF16 || objQ110 == gVar5) {
                                            objQ110 = new j(b3Var117, mVar19, dVar3, str8, 1);
                                            sVar5.o0(objQ110);
                                        }
                                        o.c(str7, j12, j13, j14, rVarN, (fz.a) objQ110, sVar5, 0);
                                        ua.b(ub.a.e0(sVar5, R.string.cancel_anytime_or_manage_subscriptions_in_google_play), e2.e(j0.c.E(j0.c.C(oVar11, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(ua.f31167a), j11, j3.A(11), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar5, 48, 0, 65532);
                                    } else {
                                        sVar5.W();
                                    }
                                    return b0.f48488a;
                                }
                            }, true, 910039261), 3);
                            l0.h.p(LazyColumn, null, new t1.d(new r0(j11, 4), true, -1295603106), 3);
                            final int i28 = 0;
                            l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.i
                                @Override // fz.f
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    switch (i28) {
                                        case 0:
                                            l0.c item = (l0.c) obj3;
                                            l1.n nVar2 = (l1.n) obj4;
                                            int iIntValue = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item, "$this$item");
                                            l1.s sVar5 = (l1.s) nVar2;
                                            if (sVar5.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                String strE0 = ub.a.e0(sVar5, R.string.why_learn_with_the_deer);
                                                float f13 = 44;
                                                z1.o oVar11 = z1.o.f58481a;
                                                z1.r rVarE5 = e2.e(j0.c.E(oVar11, f13, 58, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                long j12 = j11;
                                                v vVarA = d0.n.a(j12, 1);
                                                o.h(0, j12, 0L, strE0, sVar5, j0.c.B(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.a(), rVarE5), 16, 10));
                                                float f14 = 20;
                                                z1.r rVarD = j0.c.D(e2.e(j0.c.C(j0.c.E(oVar11, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 14, 24, f14, 36);
                                                u uVarA = j0.t.a(j0.i.g(26), z1.c.O, sVar5, 6);
                                                int iHashCode3 = Long.hashCode(sVar5.T);
                                                q1 q1VarL5 = sVar5.l();
                                                z1.r rVarC8 = z1.a.c(sVar5, rVarD);
                                                y2.k.J.getClass();
                                                y2.i iVar3 = y2.j.f56913b;
                                                sVar5.h0();
                                                if (sVar5.S) {
                                                    sVar5.k(iVar3);
                                                } else {
                                                    sVar5.r0();
                                                }
                                                t.J(y2.j.f56917f, uVarA, sVar5);
                                                t.J(y2.j.f56916e, q1VarL5, sVar5);
                                                y2.h hVar9 = y2.j.f56918g;
                                                if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode3))) {
                                                    defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar9);
                                                }
                                                t.J(y2.j.f56915d, rVarC8, sVar5);
                                                String[] strArr = {ub.a.e0(sVar5, R.string.accelerated_learning), ub.a.e0(sVar5, R.string.effective_results_a), ub.a.e0(sVar5, R.string.convenient_to_use_a)};
                                                String[] strArr2 = {ub.a.e0(sVar5, R.string.systematic_curricula_guarantee_a_fast_path_to_intermediate_a), ub.a.e0(sVar5, R.string.everything_is_clarified_with_detailed_explanations_and_hd_audio_a), ub.a.e0(sVar5, R.string.feel_supported_with_settings_customized_for_asian_languages_a)};
                                                b3 b3Var117 = b3Var115;
                                                String[] strArr3 = {((MergedBillingThemeBillingPage) b3Var117.getValue()).getWhyLearnIcon1Url(), ((MergedBillingThemeBillingPage) b3Var117.getValue()).getWhyLearnIcon2Url(), ((MergedBillingThemeBillingPage) b3Var117.getValue()).getWhyLearnIcon3Url()};
                                                Integer[] numArr = {Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_1), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_2), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_3)};
                                                sVar5.d0(-663461197);
                                                int i210 = 0;
                                                int i30 = 0;
                                                while (i210 < 3) {
                                                    long j13 = j12;
                                                    l1.s sVar6 = sVar5;
                                                    o.e(strArr3[i30], numArr[i30].intValue(), strArr[i210], strArr2[i30], j13, j3.A(16), j3.A(14), sVar6, 1769472);
                                                    j12 = j13;
                                                    sVar5 = sVar6;
                                                    i210++;
                                                    i30++;
                                                }
                                                sVar5.p(false);
                                                sVar5.p(true);
                                            } else {
                                                sVar5.W();
                                            }
                                            break;
                                        default:
                                            l0.c item2 = (l0.c) obj3;
                                            l1.n nVar3 = (l1.n) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item2, "$this$item");
                                            l1.s sVar7 = (l1.s) nVar3;
                                            if (sVar7.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                String strE1 = ub.a.e0(sVar7, R.string._5m_happy_learners);
                                                float f15 = 44;
                                                z1.o oVar12 = z1.o.f58481a;
                                                z1.r rVarE6 = e2.e(j0.c.E(oVar12, f15, 40, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                final long j14 = j11;
                                                v vVarA2 = d0.n.a(j14, 1);
                                                float f16 = 16;
                                                o.h(0, j14, 0L, strE1, sVar7, j0.c.B(d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.a(), rVarE6), f16, 10));
                                                z1.r rVarE7 = e2.e(oVar12, 1.0f);
                                                u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar7, 48);
                                                int iHashCode4 = Long.hashCode(sVar7.T);
                                                q1 q1VarL6 = sVar7.l();
                                                z1.r rVarC9 = z1.a.c(sVar7, rVarE7);
                                                y2.k.J.getClass();
                                                y2.i iVar4 = y2.j.f56913b;
                                                sVar7.h0();
                                                if (sVar7.S) {
                                                    sVar7.k(iVar4);
                                                } else {
                                                    sVar7.r0();
                                                }
                                                t.J(y2.j.f56917f, uVarA2, sVar7);
                                                t.J(y2.j.f56916e, q1VarL6, sVar7);
                                                y2.h hVar10 = y2.j.f56918g;
                                                if (sVar7.S || !kotlin.jvm.internal.m.a(sVar7.Q(), Integer.valueOf(iHashCode4))) {
                                                    defpackage.e.A(iHashCode4, sVar7, iHashCode4, hVar10);
                                                }
                                                t.J(y2.j.f56915d, rVarC9, sVar7);
                                                d0.n.c(se.k.y(R.drawable.ic_sub_intro_play, sVar7, 0), null, j0.c.C(oVar12, CropImageView.DEFAULT_ASPECT_RATIO, f16, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar7, 440, 120);
                                                ua.b(ub.a.e0(sVar7, R.string.editor_s_choice_2018), null, j14, j3.A(18), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar7, 3072, 0, 131058);
                                                final int iIntValue3 = ((Number) sVar7.j(ju.f.f37371e)).intValue();
                                                boolean zD4 = sVar7.d(iIntValue3);
                                                Object objQ19 = sVar7.Q();
                                                l1.g gVar5 = l1.m.f39353a;
                                                if (zD4 || objQ19 == gVar5) {
                                                    objQ19 = new fu.x(iIntValue3, 6);
                                                    sVar7.o0(objQ19);
                                                }
                                                o0.b bVarB = o0.w.b(0, 0, 3, (fz.a) objQ19, sVar7);
                                                final b3 b3Var118 = b3Var115;
                                                boolean zF15 = sVar7.f((MergedBillingThemeBillingPage) b3Var118.getValue());
                                                Object objQ110 = sVar7.Q();
                                                Object obj6 = objQ110;
                                                if (zF15 || objQ110 == gVar5) {
                                                    x[] xVarArr = {new x(j3.w(((MergedBillingThemeBillingPage) b3Var118.getValue()).getColorUserReviewNameIcon1())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var118.getValue()).getColorUserReviewNameIcon2())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var118.getValue()).getColorUserReviewNameIcon3())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var118.getValue()).getColorUserReviewNameIcon4()))};
                                                    sVar7.o0(xVarArr);
                                                    obj6 = xVarArr;
                                                }
                                                final x[] xVarArr2 = (x[]) obj6;
                                                float f17 = 32;
                                                ve.i.d(bVarB, null, new v1(f17, f16, f17, f16), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-1375898409, new fz.g() { // from class: yg.k
                                                    @Override // fz.g
                                                    public final Object f(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                        o0.o HorizontalPager = (o0.o) obj7;
                                                        int iIntValue4 = ((Integer) obj8).intValue();
                                                        l1.n nVar4 = (l1.n) obj9;
                                                        ((Integer) obj10).getClass();
                                                        kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                                                        z1.r rVarC10 = j0.c.C(e2.g(z1.o.f58481a, 240), 10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                                        b3 b3Var119 = b3Var118;
                                                        k7.d(rVarC10, null, k7.p(j3.w(((MergedBillingThemeBillingPage) b3Var119.getValue()).getColorUserReviewCard()), nVar4, 0), k7.q(62, 4), null, t1.e.d(1410031433, new jr.y(iIntValue3, iIntValue4, j14, xVarArr2, b3Var119), nVar4), nVar4, 196614, 18);
                                                        return b0.f48488a;
                                                    }
                                                }, sVar7), sVar7, 384, 16378);
                                                sVar7.p(true);
                                            } else {
                                                sVar7.W();
                                            }
                                            break;
                                    }
                                    return b0.f48488a;
                                }
                            }, true, 793721823), 3);
                            final int i29 = 1;
                            l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.i
                                @Override // fz.f
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    switch (i29) {
                                        case 0:
                                            l0.c item = (l0.c) obj3;
                                            l1.n nVar2 = (l1.n) obj4;
                                            int iIntValue = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item, "$this$item");
                                            l1.s sVar5 = (l1.s) nVar2;
                                            if (sVar5.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                String strE0 = ub.a.e0(sVar5, R.string.why_learn_with_the_deer);
                                                float f13 = 44;
                                                z1.o oVar11 = z1.o.f58481a;
                                                z1.r rVarE5 = e2.e(j0.c.E(oVar11, f13, 58, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                long j12 = j11;
                                                v vVarA = d0.n.a(j12, 1);
                                                o.h(0, j12, 0L, strE0, sVar5, j0.c.B(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.a(), rVarE5), 16, 10));
                                                float f14 = 20;
                                                z1.r rVarD = j0.c.D(e2.e(j0.c.C(j0.c.E(oVar11, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 14, 24, f14, 36);
                                                u uVarA = j0.t.a(j0.i.g(26), z1.c.O, sVar5, 6);
                                                int iHashCode3 = Long.hashCode(sVar5.T);
                                                q1 q1VarL5 = sVar5.l();
                                                z1.r rVarC8 = z1.a.c(sVar5, rVarD);
                                                y2.k.J.getClass();
                                                y2.i iVar3 = y2.j.f56913b;
                                                sVar5.h0();
                                                if (sVar5.S) {
                                                    sVar5.k(iVar3);
                                                } else {
                                                    sVar5.r0();
                                                }
                                                t.J(y2.j.f56917f, uVarA, sVar5);
                                                t.J(y2.j.f56916e, q1VarL5, sVar5);
                                                y2.h hVar9 = y2.j.f56918g;
                                                if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode3))) {
                                                    defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar9);
                                                }
                                                t.J(y2.j.f56915d, rVarC8, sVar5);
                                                String[] strArr = {ub.a.e0(sVar5, R.string.accelerated_learning), ub.a.e0(sVar5, R.string.effective_results_a), ub.a.e0(sVar5, R.string.convenient_to_use_a)};
                                                String[] strArr2 = {ub.a.e0(sVar5, R.string.systematic_curricula_guarantee_a_fast_path_to_intermediate_a), ub.a.e0(sVar5, R.string.everything_is_clarified_with_detailed_explanations_and_hd_audio_a), ub.a.e0(sVar5, R.string.feel_supported_with_settings_customized_for_asian_languages_a)};
                                                b3 b3Var117 = b3Var115;
                                                String[] strArr3 = {((MergedBillingThemeBillingPage) b3Var117.getValue()).getWhyLearnIcon1Url(), ((MergedBillingThemeBillingPage) b3Var117.getValue()).getWhyLearnIcon2Url(), ((MergedBillingThemeBillingPage) b3Var117.getValue()).getWhyLearnIcon3Url()};
                                                Integer[] numArr = {Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_1), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_2), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_3)};
                                                sVar5.d0(-663461197);
                                                int i210 = 0;
                                                int i30 = 0;
                                                while (i210 < 3) {
                                                    long j13 = j12;
                                                    l1.s sVar6 = sVar5;
                                                    o.e(strArr3[i30], numArr[i30].intValue(), strArr[i210], strArr2[i30], j13, j3.A(16), j3.A(14), sVar6, 1769472);
                                                    j12 = j13;
                                                    sVar5 = sVar6;
                                                    i210++;
                                                    i30++;
                                                }
                                                sVar5.p(false);
                                                sVar5.p(true);
                                            } else {
                                                sVar5.W();
                                            }
                                            break;
                                        default:
                                            l0.c item2 = (l0.c) obj3;
                                            l1.n nVar3 = (l1.n) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item2, "$this$item");
                                            l1.s sVar7 = (l1.s) nVar3;
                                            if (sVar7.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                String strE1 = ub.a.e0(sVar7, R.string._5m_happy_learners);
                                                float f15 = 44;
                                                z1.o oVar12 = z1.o.f58481a;
                                                z1.r rVarE6 = e2.e(j0.c.E(oVar12, f15, 40, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                final long j14 = j11;
                                                v vVarA2 = d0.n.a(j14, 1);
                                                float f16 = 16;
                                                o.h(0, j14, 0L, strE1, sVar7, j0.c.B(d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.a(), rVarE6), f16, 10));
                                                z1.r rVarE7 = e2.e(oVar12, 1.0f);
                                                u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar7, 48);
                                                int iHashCode4 = Long.hashCode(sVar7.T);
                                                q1 q1VarL6 = sVar7.l();
                                                z1.r rVarC9 = z1.a.c(sVar7, rVarE7);
                                                y2.k.J.getClass();
                                                y2.i iVar4 = y2.j.f56913b;
                                                sVar7.h0();
                                                if (sVar7.S) {
                                                    sVar7.k(iVar4);
                                                } else {
                                                    sVar7.r0();
                                                }
                                                t.J(y2.j.f56917f, uVarA2, sVar7);
                                                t.J(y2.j.f56916e, q1VarL6, sVar7);
                                                y2.h hVar10 = y2.j.f56918g;
                                                if (sVar7.S || !kotlin.jvm.internal.m.a(sVar7.Q(), Integer.valueOf(iHashCode4))) {
                                                    defpackage.e.A(iHashCode4, sVar7, iHashCode4, hVar10);
                                                }
                                                t.J(y2.j.f56915d, rVarC9, sVar7);
                                                d0.n.c(se.k.y(R.drawable.ic_sub_intro_play, sVar7, 0), null, j0.c.C(oVar12, CropImageView.DEFAULT_ASPECT_RATIO, f16, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar7, 440, 120);
                                                ua.b(ub.a.e0(sVar7, R.string.editor_s_choice_2018), null, j14, j3.A(18), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar7, 3072, 0, 131058);
                                                final int iIntValue3 = ((Number) sVar7.j(ju.f.f37371e)).intValue();
                                                boolean zD4 = sVar7.d(iIntValue3);
                                                Object objQ19 = sVar7.Q();
                                                l1.g gVar5 = l1.m.f39353a;
                                                if (zD4 || objQ19 == gVar5) {
                                                    objQ19 = new fu.x(iIntValue3, 6);
                                                    sVar7.o0(objQ19);
                                                }
                                                o0.b bVarB = o0.w.b(0, 0, 3, (fz.a) objQ19, sVar7);
                                                final b3 b3Var118 = b3Var115;
                                                boolean zF15 = sVar7.f((MergedBillingThemeBillingPage) b3Var118.getValue());
                                                Object objQ110 = sVar7.Q();
                                                Object obj6 = objQ110;
                                                if (zF15 || objQ110 == gVar5) {
                                                    x[] xVarArr = {new x(j3.w(((MergedBillingThemeBillingPage) b3Var118.getValue()).getColorUserReviewNameIcon1())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var118.getValue()).getColorUserReviewNameIcon2())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var118.getValue()).getColorUserReviewNameIcon3())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var118.getValue()).getColorUserReviewNameIcon4()))};
                                                    sVar7.o0(xVarArr);
                                                    obj6 = xVarArr;
                                                }
                                                final x[] xVarArr2 = (x[]) obj6;
                                                float f17 = 32;
                                                ve.i.d(bVarB, null, new v1(f17, f16, f17, f16), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-1375898409, new fz.g() { // from class: yg.k
                                                    @Override // fz.g
                                                    public final Object f(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                        o0.o HorizontalPager = (o0.o) obj7;
                                                        int iIntValue4 = ((Integer) obj8).intValue();
                                                        l1.n nVar4 = (l1.n) obj9;
                                                        ((Integer) obj10).getClass();
                                                        kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                                                        z1.r rVarC10 = j0.c.C(e2.g(z1.o.f58481a, 240), 10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                                        b3 b3Var119 = b3Var118;
                                                        k7.d(rVarC10, null, k7.p(j3.w(((MergedBillingThemeBillingPage) b3Var119.getValue()).getColorUserReviewCard()), nVar4, 0), k7.q(62, 4), null, t1.e.d(1410031433, new jr.y(iIntValue3, iIntValue4, j14, xVarArr2, b3Var119), nVar4), nVar4, 196614, 18);
                                                        return b0.f48488a;
                                                    }
                                                }, sVar7), sVar7, 384, 16378);
                                                sVar7.p(true);
                                            } else {
                                                sVar7.W();
                                            }
                                            break;
                                    }
                                    return b0.f48488a;
                                }
                            }, true, -1411920544), 3);
                            l0.h.p(LazyColumn, null, new t1.d(new r0(j11, 5), true, 677404385), 3);
                            l0.h.p(LazyColumn, null, new t1.d(new j1(j11, onTermsOfUseClick, onPrivacyPolicyClick, onContactUsClick, aVar, 1), true, -1528237982), 3);
                            if (!kotlin.jvm.internal.m.a(str6, "bottom_tab")) {
                                l0.h.p(LazyColumn, null, r.f57842b, 3);
                            }
                            return b0.f48488a;
                        }
                    };
                    str3 = str;
                    mVar5 = mVar17;
                    b3VarCollectAsStateWithLifecycle6 = b3VarCollectAsStateWithLifecycle6;
                    b3Var10 = b3VarCollectAsStateWithLifecycle;
                    b1Var7 = b1Var7;
                    sVar = sVar2;
                    sVar.o0(obj);
                } else {
                    str3 = str;
                    gVar3 = gVar2;
                    obj = objQ12;
                    b3Var10 = b3VarCollectAsStateWithLifecycle;
                    b3Var9 = b3VarCollectAsStateWithLifecycle2;
                    f11 = 1.0f;
                    sVar = sVar2;
                }
                l1.s sVar5 = sVar;
                ue.f.a(rVarC7, wVarA2, null, null, null, null, false, null, (fz.c) obj, sVar5, 0, 508);
                sVar2 = sVar5;
                boolean zBooleanValue5 = ((Boolean) b3Var110.getValue()).booleanValue();
                objQ13 = sVar2.Q();
                gVar4 = gVar3;
                if (objQ13 == gVar4) {
                    objQ13 = new xt.r(9);
                    sVar2.o0(objQ13);
                }
                a0.l1 l1VarC3 = f1.c((fz.c) objQ13, 7);
                objQ14 = sVar2.Q();
                if (objQ14 == gVar4) {
                    objQ14 = new xt.r(10);
                    sVar2.o0(objQ14);
                }
                a0.j0.d(zBooleanValue5, null, l1VarC3, f1.k((fz.c) objQ14, 7), null, t1.e.d(-309655129, new defpackage.d(b3Var9, b3VarCollectAsStateWithLifecycle6, b3Var10, 19), sVar2), sVar2, 200064, 18);
                zEquals = str3.equals("bottom_tab");
                rVar = j0.r.f35391a;
                if (zEquals) {
                    oVar2 = oVar;
                    rVarV = rVar.a(oVar2, jVar);
                } else {
                    oVar2 = oVar;
                    rVarV = j0.c.v(rVar.a(oVar2, r20));
                }
                q0 q0VarD5 = j0.o.d(z1.c.f58463a, false);
                iHashCode2 = Long.hashCode(sVar2.T);
                q1 q1VarL5 = sVar2.l();
                z1.r rVarC8 = z1.a.c(sVar2, rVarV);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar2);
                } else {
                    sVar2.r0();
                }
                t.J(hVar6, q0VarD5, sVar2);
                t.J(hVar7, q1VarL5, sVar2);
                if (sVar2.S) {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
                } else {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
                }
                t.J(hVar8, rVarC8, sVar2);
                boolean zBooleanValue6 = ((Boolean) b3Var110.getValue()).booleanValue();
                objQ15 = sVar2.Q();
                if (objQ15 == gVar4) {
                    objQ15 = new xt.r(11);
                    sVar2.o0(objQ15);
                }
                a0.l1 l1VarN3 = f1.n((fz.c) objQ15);
                objQ16 = sVar2.Q();
                if (objQ16 == gVar4) {
                    objQ16 = new xt.r(12);
                    sVar2.o0(objQ16);
                }
                m1 m1VarT3 = f1.t((fz.c) objQ16);
                if (((Boolean) sVar2.j(c3Var)).booleanValue()) {
                    f12 = 0.7f;
                } else {
                    f12 = f11;
                }
                z1.r rVarE5 = e2.e(oVar2, f12);
                String str6 = str3;
                ni.m mVar18 = mVar5;
                h2 h2Var3 = new h2(b3Var4, mVar18, dVar, str6, b1Var4, b1Var5, b1Var7, b1Var6);
                source = str6;
                a0.j0.d(zBooleanValue6, rVarE5, l1VarN3, m1VarT3, null, t1.e.d(82105517, h2Var3, sVar2), sVar2, 200064, 16);
                sVar2.p(true);
                sVar2.p(true);
                aVar2 = onSubscriptionSuccess;
                k((ni.h) b3VarCollectAsStateWithLifecycle19.getValue(), aVar2, source, sVar2, ((i15 >> 15) & 112) | ((i15 << 3) & 896));
                mVar2 = mVar18;
                z12 = z13;
            } else {
                iVar2 = iVar;
            }
            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            y2.h hVar9 = y2.j.f56915d;
            t.J(hVar9, rVarC6, sVar2);
            if (z13) {
                rVarG = j0.c.v(d0.n.g(oVar, tVar, null, 6));
            } else {
                rVarG = d0.n.g(oVar, tVar, null, 6);
            }
            c3Var = ju.f.f37376j;
            if (((Boolean) sVar2.j(c3Var)).booleanValue()) {
                f5 = 0.7f;
            } else {
                f5 = 1.0f;
            }
            z1.r rVarC9 = e2.c(e2.e(rVarG, f5), 1.0f);
            boolean zF15 = sVar2.f(b3VarCollectAsStateWithLifecycle2);
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z213 = z14 | zF15;
            if ((i15 & 458752) == 131072) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean zF16 = z213 | z15 | sVar2.f(b3VarCollectAsStateWithLifecycle10) | sVar2.f(b3VarCollectAsStateWithLifecycle5) | sVar2.f(b3VarCollectAsStateWithLifecycle11);
            b3Var7 = b3Var6;
            b3Var8 = b3Var3;
            b1Var7 = b1Var13;
            boolean zF17 = zF16 | sVar2.f(b3Var7) | sVar2.h(mVar5) | sVar2.f(b3Var5) | sVar2.f(b3VarCollectAsStateWithLifecycle6) | sVar2.f(b3VarCollectAsStateWithLifecycle) | sVar2.f(b3VarCollectAsStateWithLifecycle13) | sVar2.f(b3Var8) | sVar2.f(b3VarCollectAsStateWithLifecycle7) | sVar2.f(b3Var2) | sVar2.f(b1Var4) | sVar2.f(b1Var5) | sVar2.f(b1Var13) | sVar2.f(b1Var6) | sVar2.f(b3Var4) | sVar2.h(dVar) | sVar2.e(jW4);
            if ((i15 & 1879048192) == 536870912) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z214 = zF17 | z16;
            if ((c11 & 14) == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z215 = z214 | z17;
            if ((i15 & 29360128) == 8388608) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z216 = z215 | z18;
            if ((i15 & 234881024) == 67108864) {
                z19 = true;
            } else {
                z19 = false;
            }
            z20 = z216 | z19;
            objQ12 = sVar2.Q();
            if (z20) {
                b3Var9 = b3VarCollectAsStateWithLifecycle2;
                gVar3 = gVar2;
                f11 = 1.0f;
                final ni.m mVar19 = mVar5;
                final b3 b3Var115 = b3Var5;
                final b1 b1Var16 = b1Var3;
                final b3 b3Var116 = b3Var2;
                obj = new fz.c() { // from class: yg.f
                    @Override // fz.c
                    public final Object invoke(Object obj2) {
                        l0.h LazyColumn = (l0.h) obj2;
                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                        final String str7 = str;
                        fz.a aVar3 = onFinishClick;
                        final b3 b3Var117 = b3Var9;
                        l0.h.p(LazyColumn, null, new t1.d(new defpackage.d(str7, aVar3, b3Var117, 20), true, -1625515996), 3);
                        l0.h.p(LazyColumn, null, new t1.d(new tp.u(4, b3VarCollectAsStateWithLifecycle10, b3Var117), true, 1026356699), 3);
                        b1 b1Var17 = b1Var16;
                        final ni.m mVar110 = mVar19;
                        l0.h.p(LazyColumn, null, new t1.d(new ei.n(b1Var17, mVar110, b1Var2, b3VarCollectAsStateWithLifecycle5, b3VarCollectAsStateWithLifecycle11, b3Var7, b3Var117, b3Var115, b3VarCollectAsStateWithLifecycle6, b3VarCollectAsStateWithLifecycle, b3VarCollectAsStateWithLifecycle13, b3Var8, b3VarCollectAsStateWithLifecycle7, b3Var116), true, -1179285668), 3);
                        final b3 b3Var118 = b3Var4;
                        final xg.d dVar2 = dVar;
                        final long j11 = jW4;
                        final b1 b1Var18 = b1Var4;
                        final b1 b1Var19 = b1Var5;
                        final b1 b1Var110 = b1Var7;
                        final b1 b1Var111 = b1Var6;
                        final a1 a1Var2 = a1Var;
                        l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.h
                            @Override // fz.f
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                l0.c item = (l0.c) obj3;
                                l1.n nVar2 = (l1.n) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar6 = (l1.s) nVar2;
                                if (sVar6.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    String str8 = (String) b1Var18.getValue();
                                    long j12 = ((x) b1Var19.getValue()).f28624a;
                                    long j13 = ((x) b1Var110.getValue()).f28624a;
                                    long j14 = ((x) b1Var111.getValue()).f28624a;
                                    float f13 = 36;
                                    z1.o oVar11 = z1.o.f58481a;
                                    z1.r rVarE6 = j0.c.E(oVar11, f13, 29, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8);
                                    Object objQ19 = sVar6.Q();
                                    l1.g gVar5 = l1.m.f39353a;
                                    if (objQ19 == gVar5) {
                                        objQ19 = new bt.a2(a1Var2, 17);
                                        sVar6.o0(objQ19);
                                    }
                                    z1.r rVarN = a0.n(rVarE6, (fz.c) objQ19);
                                    b3 b3Var119 = b3Var118;
                                    boolean zF18 = sVar6.f(b3Var119);
                                    ni.m mVar111 = mVar110;
                                    boolean zH = zF18 | sVar6.h(mVar111);
                                    xg.d dVar3 = dVar2;
                                    boolean zH2 = zH | sVar6.h(dVar3);
                                    String str9 = str7;
                                    boolean zF19 = zH2 | sVar6.f(str9);
                                    Object objQ110 = sVar6.Q();
                                    if (zF19 || objQ110 == gVar5) {
                                        objQ110 = new j(b3Var119, mVar111, dVar3, str9, 1);
                                        sVar6.o0(objQ110);
                                    }
                                    o.c(str8, j12, j13, j14, rVarN, (fz.a) objQ110, sVar6, 0);
                                    ua.b(ub.a.e0(sVar6, R.string.cancel_anytime_or_manage_subscriptions_in_google_play), e2.e(j0.c.E(j0.c.C(oVar11, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar6.j(ua.f31167a), j11, j3.A(11), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar6, 48, 0, 65532);
                                } else {
                                    sVar6.W();
                                }
                                return b0.f48488a;
                            }
                        }, true, 910039261), 3);
                        l0.h.p(LazyColumn, null, new t1.d(new r0(j11, 4), true, -1295603106), 3);
                        final int i28 = 0;
                        l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.i
                            @Override // fz.f
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                switch (i28) {
                                    case 0:
                                        l0.c item = (l0.c) obj3;
                                        l1.n nVar2 = (l1.n) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        kotlin.jvm.internal.m.f(item, "$this$item");
                                        l1.s sVar6 = (l1.s) nVar2;
                                        if (sVar6.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            String strE0 = ub.a.e0(sVar6, R.string.why_learn_with_the_deer);
                                            float f13 = 44;
                                            z1.o oVar11 = z1.o.f58481a;
                                            z1.r rVarE6 = e2.e(j0.c.E(oVar11, f13, 58, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                            long j12 = j11;
                                            v vVarA = d0.n.a(j12, 1);
                                            o.h(0, j12, 0L, strE0, sVar6, j0.c.B(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.a(), rVarE6), 16, 10));
                                            float f14 = 20;
                                            z1.r rVarD = j0.c.D(e2.e(j0.c.C(j0.c.E(oVar11, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 14, 24, f14, 36);
                                            u uVarA = j0.t.a(j0.i.g(26), z1.c.O, sVar6, 6);
                                            int iHashCode3 = Long.hashCode(sVar6.T);
                                            q1 q1VarL6 = sVar6.l();
                                            z1.r rVarC10 = z1.a.c(sVar6, rVarD);
                                            y2.k.J.getClass();
                                            y2.i iVar3 = y2.j.f56913b;
                                            sVar6.h0();
                                            if (sVar6.S) {
                                                sVar6.k(iVar3);
                                            } else {
                                                sVar6.r0();
                                            }
                                            t.J(y2.j.f56917f, uVarA, sVar6);
                                            t.J(y2.j.f56916e, q1VarL6, sVar6);
                                            y2.h hVar10 = y2.j.f56918g;
                                            if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode3))) {
                                                defpackage.e.A(iHashCode3, sVar6, iHashCode3, hVar10);
                                            }
                                            t.J(y2.j.f56915d, rVarC10, sVar6);
                                            String[] strArr = {ub.a.e0(sVar6, R.string.accelerated_learning), ub.a.e0(sVar6, R.string.effective_results_a), ub.a.e0(sVar6, R.string.convenient_to_use_a)};
                                            String[] strArr2 = {ub.a.e0(sVar6, R.string.systematic_curricula_guarantee_a_fast_path_to_intermediate_a), ub.a.e0(sVar6, R.string.everything_is_clarified_with_detailed_explanations_and_hd_audio_a), ub.a.e0(sVar6, R.string.feel_supported_with_settings_customized_for_asian_languages_a)};
                                            b3 b3Var119 = b3Var117;
                                            String[] strArr3 = {((MergedBillingThemeBillingPage) b3Var119.getValue()).getWhyLearnIcon1Url(), ((MergedBillingThemeBillingPage) b3Var119.getValue()).getWhyLearnIcon2Url(), ((MergedBillingThemeBillingPage) b3Var119.getValue()).getWhyLearnIcon3Url()};
                                            Integer[] numArr = {Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_1), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_2), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_3)};
                                            sVar6.d0(-663461197);
                                            int i210 = 0;
                                            int i30 = 0;
                                            while (i210 < 3) {
                                                long j13 = j12;
                                                l1.s sVar7 = sVar6;
                                                o.e(strArr3[i30], numArr[i30].intValue(), strArr[i210], strArr2[i30], j13, j3.A(16), j3.A(14), sVar7, 1769472);
                                                j12 = j13;
                                                sVar6 = sVar7;
                                                i210++;
                                                i30++;
                                            }
                                            sVar6.p(false);
                                            sVar6.p(true);
                                        } else {
                                            sVar6.W();
                                        }
                                        break;
                                    default:
                                        l0.c item2 = (l0.c) obj3;
                                        l1.n nVar3 = (l1.n) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        kotlin.jvm.internal.m.f(item2, "$this$item");
                                        l1.s sVar8 = (l1.s) nVar3;
                                        if (sVar8.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            String strE1 = ub.a.e0(sVar8, R.string._5m_happy_learners);
                                            float f15 = 44;
                                            z1.o oVar12 = z1.o.f58481a;
                                            z1.r rVarE7 = e2.e(j0.c.E(oVar12, f15, 40, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                            final long j14 = j11;
                                            v vVarA2 = d0.n.a(j14, 1);
                                            float f16 = 16;
                                            o.h(0, j14, 0L, strE1, sVar8, j0.c.B(d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.a(), rVarE7), f16, 10));
                                            z1.r rVarE8 = e2.e(oVar12, 1.0f);
                                            u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar8, 48);
                                            int iHashCode4 = Long.hashCode(sVar8.T);
                                            q1 q1VarL7 = sVar8.l();
                                            z1.r rVarC11 = z1.a.c(sVar8, rVarE8);
                                            y2.k.J.getClass();
                                            y2.i iVar4 = y2.j.f56913b;
                                            sVar8.h0();
                                            if (sVar8.S) {
                                                sVar8.k(iVar4);
                                            } else {
                                                sVar8.r0();
                                            }
                                            t.J(y2.j.f56917f, uVarA2, sVar8);
                                            t.J(y2.j.f56916e, q1VarL7, sVar8);
                                            y2.h hVar11 = y2.j.f56918g;
                                            if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode4))) {
                                                defpackage.e.A(iHashCode4, sVar8, iHashCode4, hVar11);
                                            }
                                            t.J(y2.j.f56915d, rVarC11, sVar8);
                                            d0.n.c(se.k.y(R.drawable.ic_sub_intro_play, sVar8, 0), null, j0.c.C(oVar12, CropImageView.DEFAULT_ASPECT_RATIO, f16, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar8, 440, 120);
                                            ua.b(ub.a.e0(sVar8, R.string.editor_s_choice_2018), null, j14, j3.A(18), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar8, 3072, 0, 131058);
                                            final int iIntValue3 = ((Number) sVar8.j(ju.f.f37371e)).intValue();
                                            boolean zD4 = sVar8.d(iIntValue3);
                                            Object objQ19 = sVar8.Q();
                                            l1.g gVar5 = l1.m.f39353a;
                                            if (zD4 || objQ19 == gVar5) {
                                                objQ19 = new fu.x(iIntValue3, 6);
                                                sVar8.o0(objQ19);
                                            }
                                            o0.b bVarB = o0.w.b(0, 0, 3, (fz.a) objQ19, sVar8);
                                            final b3 b3Var1110 = b3Var117;
                                            boolean zF18 = sVar8.f((MergedBillingThemeBillingPage) b3Var1110.getValue());
                                            Object objQ110 = sVar8.Q();
                                            Object obj6 = objQ110;
                                            if (zF18 || objQ110 == gVar5) {
                                                x[] xVarArr = {new x(j3.w(((MergedBillingThemeBillingPage) b3Var1110.getValue()).getColorUserReviewNameIcon1())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var1110.getValue()).getColorUserReviewNameIcon2())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var1110.getValue()).getColorUserReviewNameIcon3())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var1110.getValue()).getColorUserReviewNameIcon4()))};
                                                sVar8.o0(xVarArr);
                                                obj6 = xVarArr;
                                            }
                                            final x[] xVarArr2 = (x[]) obj6;
                                            float f17 = 32;
                                            ve.i.d(bVarB, null, new v1(f17, f16, f17, f16), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-1375898409, new fz.g() { // from class: yg.k
                                                @Override // fz.g
                                                public final Object f(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                    o0.o HorizontalPager = (o0.o) obj7;
                                                    int iIntValue4 = ((Integer) obj8).intValue();
                                                    l1.n nVar4 = (l1.n) obj9;
                                                    ((Integer) obj10).getClass();
                                                    kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                                                    z1.r rVarC12 = j0.c.C(e2.g(z1.o.f58481a, 240), 10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                                    b3 b3Var1111 = b3Var1110;
                                                    k7.d(rVarC12, null, k7.p(j3.w(((MergedBillingThemeBillingPage) b3Var1111.getValue()).getColorUserReviewCard()), nVar4, 0), k7.q(62, 4), null, t1.e.d(1410031433, new jr.y(iIntValue3, iIntValue4, j14, xVarArr2, b3Var1111), nVar4), nVar4, 196614, 18);
                                                    return b0.f48488a;
                                                }
                                            }, sVar8), sVar8, 384, 16378);
                                            sVar8.p(true);
                                        } else {
                                            sVar8.W();
                                        }
                                        break;
                                }
                                return b0.f48488a;
                            }
                        }, true, 793721823), 3);
                        final int i29 = 1;
                        l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.i
                            @Override // fz.f
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                switch (i29) {
                                    case 0:
                                        l0.c item = (l0.c) obj3;
                                        l1.n nVar2 = (l1.n) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        kotlin.jvm.internal.m.f(item, "$this$item");
                                        l1.s sVar6 = (l1.s) nVar2;
                                        if (sVar6.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            String strE0 = ub.a.e0(sVar6, R.string.why_learn_with_the_deer);
                                            float f13 = 44;
                                            z1.o oVar11 = z1.o.f58481a;
                                            z1.r rVarE6 = e2.e(j0.c.E(oVar11, f13, 58, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                            long j12 = j11;
                                            v vVarA = d0.n.a(j12, 1);
                                            o.h(0, j12, 0L, strE0, sVar6, j0.c.B(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.a(), rVarE6), 16, 10));
                                            float f14 = 20;
                                            z1.r rVarD = j0.c.D(e2.e(j0.c.C(j0.c.E(oVar11, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 14, 24, f14, 36);
                                            u uVarA = j0.t.a(j0.i.g(26), z1.c.O, sVar6, 6);
                                            int iHashCode3 = Long.hashCode(sVar6.T);
                                            q1 q1VarL6 = sVar6.l();
                                            z1.r rVarC10 = z1.a.c(sVar6, rVarD);
                                            y2.k.J.getClass();
                                            y2.i iVar3 = y2.j.f56913b;
                                            sVar6.h0();
                                            if (sVar6.S) {
                                                sVar6.k(iVar3);
                                            } else {
                                                sVar6.r0();
                                            }
                                            t.J(y2.j.f56917f, uVarA, sVar6);
                                            t.J(y2.j.f56916e, q1VarL6, sVar6);
                                            y2.h hVar10 = y2.j.f56918g;
                                            if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode3))) {
                                                defpackage.e.A(iHashCode3, sVar6, iHashCode3, hVar10);
                                            }
                                            t.J(y2.j.f56915d, rVarC10, sVar6);
                                            String[] strArr = {ub.a.e0(sVar6, R.string.accelerated_learning), ub.a.e0(sVar6, R.string.effective_results_a), ub.a.e0(sVar6, R.string.convenient_to_use_a)};
                                            String[] strArr2 = {ub.a.e0(sVar6, R.string.systematic_curricula_guarantee_a_fast_path_to_intermediate_a), ub.a.e0(sVar6, R.string.everything_is_clarified_with_detailed_explanations_and_hd_audio_a), ub.a.e0(sVar6, R.string.feel_supported_with_settings_customized_for_asian_languages_a)};
                                            b3 b3Var119 = b3Var117;
                                            String[] strArr3 = {((MergedBillingThemeBillingPage) b3Var119.getValue()).getWhyLearnIcon1Url(), ((MergedBillingThemeBillingPage) b3Var119.getValue()).getWhyLearnIcon2Url(), ((MergedBillingThemeBillingPage) b3Var119.getValue()).getWhyLearnIcon3Url()};
                                            Integer[] numArr = {Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_1), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_2), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_3)};
                                            sVar6.d0(-663461197);
                                            int i210 = 0;
                                            int i30 = 0;
                                            while (i210 < 3) {
                                                long j13 = j12;
                                                l1.s sVar7 = sVar6;
                                                o.e(strArr3[i30], numArr[i30].intValue(), strArr[i210], strArr2[i30], j13, j3.A(16), j3.A(14), sVar7, 1769472);
                                                j12 = j13;
                                                sVar6 = sVar7;
                                                i210++;
                                                i30++;
                                            }
                                            sVar6.p(false);
                                            sVar6.p(true);
                                        } else {
                                            sVar6.W();
                                        }
                                        break;
                                    default:
                                        l0.c item2 = (l0.c) obj3;
                                        l1.n nVar3 = (l1.n) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        kotlin.jvm.internal.m.f(item2, "$this$item");
                                        l1.s sVar8 = (l1.s) nVar3;
                                        if (sVar8.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            String strE1 = ub.a.e0(sVar8, R.string._5m_happy_learners);
                                            float f15 = 44;
                                            z1.o oVar12 = z1.o.f58481a;
                                            z1.r rVarE7 = e2.e(j0.c.E(oVar12, f15, 40, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                            final long j14 = j11;
                                            v vVarA2 = d0.n.a(j14, 1);
                                            float f16 = 16;
                                            o.h(0, j14, 0L, strE1, sVar8, j0.c.B(d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.a(), rVarE7), f16, 10));
                                            z1.r rVarE8 = e2.e(oVar12, 1.0f);
                                            u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar8, 48);
                                            int iHashCode4 = Long.hashCode(sVar8.T);
                                            q1 q1VarL7 = sVar8.l();
                                            z1.r rVarC11 = z1.a.c(sVar8, rVarE8);
                                            y2.k.J.getClass();
                                            y2.i iVar4 = y2.j.f56913b;
                                            sVar8.h0();
                                            if (sVar8.S) {
                                                sVar8.k(iVar4);
                                            } else {
                                                sVar8.r0();
                                            }
                                            t.J(y2.j.f56917f, uVarA2, sVar8);
                                            t.J(y2.j.f56916e, q1VarL7, sVar8);
                                            y2.h hVar11 = y2.j.f56918g;
                                            if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode4))) {
                                                defpackage.e.A(iHashCode4, sVar8, iHashCode4, hVar11);
                                            }
                                            t.J(y2.j.f56915d, rVarC11, sVar8);
                                            d0.n.c(se.k.y(R.drawable.ic_sub_intro_play, sVar8, 0), null, j0.c.C(oVar12, CropImageView.DEFAULT_ASPECT_RATIO, f16, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar8, 440, 120);
                                            ua.b(ub.a.e0(sVar8, R.string.editor_s_choice_2018), null, j14, j3.A(18), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar8, 3072, 0, 131058);
                                            final int iIntValue3 = ((Number) sVar8.j(ju.f.f37371e)).intValue();
                                            boolean zD4 = sVar8.d(iIntValue3);
                                            Object objQ19 = sVar8.Q();
                                            l1.g gVar5 = l1.m.f39353a;
                                            if (zD4 || objQ19 == gVar5) {
                                                objQ19 = new fu.x(iIntValue3, 6);
                                                sVar8.o0(objQ19);
                                            }
                                            o0.b bVarB = o0.w.b(0, 0, 3, (fz.a) objQ19, sVar8);
                                            final b3 b3Var1110 = b3Var117;
                                            boolean zF18 = sVar8.f((MergedBillingThemeBillingPage) b3Var1110.getValue());
                                            Object objQ110 = sVar8.Q();
                                            Object obj6 = objQ110;
                                            if (zF18 || objQ110 == gVar5) {
                                                x[] xVarArr = {new x(j3.w(((MergedBillingThemeBillingPage) b3Var1110.getValue()).getColorUserReviewNameIcon1())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var1110.getValue()).getColorUserReviewNameIcon2())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var1110.getValue()).getColorUserReviewNameIcon3())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var1110.getValue()).getColorUserReviewNameIcon4()))};
                                                sVar8.o0(xVarArr);
                                                obj6 = xVarArr;
                                            }
                                            final x[] xVarArr2 = (x[]) obj6;
                                            float f17 = 32;
                                            ve.i.d(bVarB, null, new v1(f17, f16, f17, f16), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-1375898409, new fz.g() { // from class: yg.k
                                                @Override // fz.g
                                                public final Object f(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                    o0.o HorizontalPager = (o0.o) obj7;
                                                    int iIntValue4 = ((Integer) obj8).intValue();
                                                    l1.n nVar4 = (l1.n) obj9;
                                                    ((Integer) obj10).getClass();
                                                    kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                                                    z1.r rVarC12 = j0.c.C(e2.g(z1.o.f58481a, 240), 10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                                    b3 b3Var1111 = b3Var1110;
                                                    k7.d(rVarC12, null, k7.p(j3.w(((MergedBillingThemeBillingPage) b3Var1111.getValue()).getColorUserReviewCard()), nVar4, 0), k7.q(62, 4), null, t1.e.d(1410031433, new jr.y(iIntValue3, iIntValue4, j14, xVarArr2, b3Var1111), nVar4), nVar4, 196614, 18);
                                                    return b0.f48488a;
                                                }
                                            }, sVar8), sVar8, 384, 16378);
                                            sVar8.p(true);
                                        } else {
                                            sVar8.W();
                                        }
                                        break;
                                }
                                return b0.f48488a;
                            }
                        }, true, -1411920544), 3);
                        l0.h.p(LazyColumn, null, new t1.d(new r0(j11, 5), true, 677404385), 3);
                        l0.h.p(LazyColumn, null, new t1.d(new j1(j11, onTermsOfUseClick, onPrivacyPolicyClick, onContactUsClick, aVar, 1), true, -1528237982), 3);
                        if (!kotlin.jvm.internal.m.a(str7, "bottom_tab")) {
                            l0.h.p(LazyColumn, null, r.f57842b, 3);
                        }
                        return b0.f48488a;
                    }
                };
                str3 = str;
                mVar5 = mVar19;
                b3VarCollectAsStateWithLifecycle6 = b3VarCollectAsStateWithLifecycle6;
                b3Var10 = b3VarCollectAsStateWithLifecycle;
                b1Var7 = b1Var7;
                sVar = sVar2;
                sVar.o0(obj);
            } else if (objQ12 == gVar2) {
                gVar2 = gVar2;
                b3Var9 = b3VarCollectAsStateWithLifecycle2;
                gVar3 = gVar2;
                f11 = 1.0f;
                final ni.m mVar110 = mVar5;
                final b3 b3Var117 = b3Var5;
                final b1 b1Var17 = b1Var3;
                final b3 b3Var118 = b3Var2;
                obj = new fz.c() { // from class: yg.f
                    @Override // fz.c
                    public final Object invoke(Object obj2) {
                        l0.h LazyColumn = (l0.h) obj2;
                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                        final String str7 = str;
                        fz.a aVar3 = onFinishClick;
                        final b3 b3Var119 = b3Var9;
                        l0.h.p(LazyColumn, null, new t1.d(new defpackage.d(str7, aVar3, b3Var119, 20), true, -1625515996), 3);
                        l0.h.p(LazyColumn, null, new t1.d(new tp.u(4, b3VarCollectAsStateWithLifecycle10, b3Var119), true, 1026356699), 3);
                        b1 b1Var18 = b1Var17;
                        final ni.m mVar111 = mVar110;
                        l0.h.p(LazyColumn, null, new t1.d(new ei.n(b1Var18, mVar111, b1Var2, b3VarCollectAsStateWithLifecycle5, b3VarCollectAsStateWithLifecycle11, b3Var7, b3Var119, b3Var117, b3VarCollectAsStateWithLifecycle6, b3VarCollectAsStateWithLifecycle, b3VarCollectAsStateWithLifecycle13, b3Var8, b3VarCollectAsStateWithLifecycle7, b3Var118), true, -1179285668), 3);
                        final b3 b3Var1110 = b3Var4;
                        final xg.d dVar2 = dVar;
                        final long j11 = jW4;
                        final b1 b1Var19 = b1Var4;
                        final b1 b1Var110 = b1Var5;
                        final b1 b1Var111 = b1Var7;
                        final b1 b1Var112 = b1Var6;
                        final a1 a1Var2 = a1Var;
                        l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.h
                            @Override // fz.f
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                l0.c item = (l0.c) obj3;
                                l1.n nVar2 = (l1.n) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar6 = (l1.s) nVar2;
                                if (sVar6.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    String str8 = (String) b1Var19.getValue();
                                    long j12 = ((x) b1Var110.getValue()).f28624a;
                                    long j13 = ((x) b1Var111.getValue()).f28624a;
                                    long j14 = ((x) b1Var112.getValue()).f28624a;
                                    float f13 = 36;
                                    z1.o oVar11 = z1.o.f58481a;
                                    z1.r rVarE6 = j0.c.E(oVar11, f13, 29, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8);
                                    Object objQ19 = sVar6.Q();
                                    l1.g gVar5 = l1.m.f39353a;
                                    if (objQ19 == gVar5) {
                                        objQ19 = new bt.a2(a1Var2, 17);
                                        sVar6.o0(objQ19);
                                    }
                                    z1.r rVarN = a0.n(rVarE6, (fz.c) objQ19);
                                    b3 b3Var1111 = b3Var1110;
                                    boolean zF18 = sVar6.f(b3Var1111);
                                    ni.m mVar112 = mVar111;
                                    boolean zH = zF18 | sVar6.h(mVar112);
                                    xg.d dVar3 = dVar2;
                                    boolean zH2 = zH | sVar6.h(dVar3);
                                    String str9 = str7;
                                    boolean zF19 = zH2 | sVar6.f(str9);
                                    Object objQ110 = sVar6.Q();
                                    if (zF19 || objQ110 == gVar5) {
                                        objQ110 = new j(b3Var1111, mVar112, dVar3, str9, 1);
                                        sVar6.o0(objQ110);
                                    }
                                    o.c(str8, j12, j13, j14, rVarN, (fz.a) objQ110, sVar6, 0);
                                    ua.b(ub.a.e0(sVar6, R.string.cancel_anytime_or_manage_subscriptions_in_google_play), e2.e(j0.c.E(j0.c.C(oVar11, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar6.j(ua.f31167a), j11, j3.A(11), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar6, 48, 0, 65532);
                                } else {
                                    sVar6.W();
                                }
                                return b0.f48488a;
                            }
                        }, true, 910039261), 3);
                        l0.h.p(LazyColumn, null, new t1.d(new r0(j11, 4), true, -1295603106), 3);
                        final int i28 = 0;
                        l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.i
                            @Override // fz.f
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                switch (i28) {
                                    case 0:
                                        l0.c item = (l0.c) obj3;
                                        l1.n nVar2 = (l1.n) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        kotlin.jvm.internal.m.f(item, "$this$item");
                                        l1.s sVar6 = (l1.s) nVar2;
                                        if (sVar6.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            String strE0 = ub.a.e0(sVar6, R.string.why_learn_with_the_deer);
                                            float f13 = 44;
                                            z1.o oVar11 = z1.o.f58481a;
                                            z1.r rVarE6 = e2.e(j0.c.E(oVar11, f13, 58, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                            long j12 = j11;
                                            v vVarA = d0.n.a(j12, 1);
                                            o.h(0, j12, 0L, strE0, sVar6, j0.c.B(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.a(), rVarE6), 16, 10));
                                            float f14 = 20;
                                            z1.r rVarD = j0.c.D(e2.e(j0.c.C(j0.c.E(oVar11, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 14, 24, f14, 36);
                                            u uVarA = j0.t.a(j0.i.g(26), z1.c.O, sVar6, 6);
                                            int iHashCode3 = Long.hashCode(sVar6.T);
                                            q1 q1VarL6 = sVar6.l();
                                            z1.r rVarC10 = z1.a.c(sVar6, rVarD);
                                            y2.k.J.getClass();
                                            y2.i iVar3 = y2.j.f56913b;
                                            sVar6.h0();
                                            if (sVar6.S) {
                                                sVar6.k(iVar3);
                                            } else {
                                                sVar6.r0();
                                            }
                                            t.J(y2.j.f56917f, uVarA, sVar6);
                                            t.J(y2.j.f56916e, q1VarL6, sVar6);
                                            y2.h hVar10 = y2.j.f56918g;
                                            if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode3))) {
                                                defpackage.e.A(iHashCode3, sVar6, iHashCode3, hVar10);
                                            }
                                            t.J(y2.j.f56915d, rVarC10, sVar6);
                                            String[] strArr = {ub.a.e0(sVar6, R.string.accelerated_learning), ub.a.e0(sVar6, R.string.effective_results_a), ub.a.e0(sVar6, R.string.convenient_to_use_a)};
                                            String[] strArr2 = {ub.a.e0(sVar6, R.string.systematic_curricula_guarantee_a_fast_path_to_intermediate_a), ub.a.e0(sVar6, R.string.everything_is_clarified_with_detailed_explanations_and_hd_audio_a), ub.a.e0(sVar6, R.string.feel_supported_with_settings_customized_for_asian_languages_a)};
                                            b3 b3Var1111 = b3Var119;
                                            String[] strArr3 = {((MergedBillingThemeBillingPage) b3Var1111.getValue()).getWhyLearnIcon1Url(), ((MergedBillingThemeBillingPage) b3Var1111.getValue()).getWhyLearnIcon2Url(), ((MergedBillingThemeBillingPage) b3Var1111.getValue()).getWhyLearnIcon3Url()};
                                            Integer[] numArr = {Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_1), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_2), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_3)};
                                            sVar6.d0(-663461197);
                                            int i210 = 0;
                                            int i30 = 0;
                                            while (i210 < 3) {
                                                long j13 = j12;
                                                l1.s sVar7 = sVar6;
                                                o.e(strArr3[i30], numArr[i30].intValue(), strArr[i210], strArr2[i30], j13, j3.A(16), j3.A(14), sVar7, 1769472);
                                                j12 = j13;
                                                sVar6 = sVar7;
                                                i210++;
                                                i30++;
                                            }
                                            sVar6.p(false);
                                            sVar6.p(true);
                                        } else {
                                            sVar6.W();
                                        }
                                        break;
                                    default:
                                        l0.c item2 = (l0.c) obj3;
                                        l1.n nVar3 = (l1.n) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        kotlin.jvm.internal.m.f(item2, "$this$item");
                                        l1.s sVar8 = (l1.s) nVar3;
                                        if (sVar8.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            String strE1 = ub.a.e0(sVar8, R.string._5m_happy_learners);
                                            float f15 = 44;
                                            z1.o oVar12 = z1.o.f58481a;
                                            z1.r rVarE7 = e2.e(j0.c.E(oVar12, f15, 40, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                            final long j14 = j11;
                                            v vVarA2 = d0.n.a(j14, 1);
                                            float f16 = 16;
                                            o.h(0, j14, 0L, strE1, sVar8, j0.c.B(d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.a(), rVarE7), f16, 10));
                                            z1.r rVarE8 = e2.e(oVar12, 1.0f);
                                            u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar8, 48);
                                            int iHashCode4 = Long.hashCode(sVar8.T);
                                            q1 q1VarL7 = sVar8.l();
                                            z1.r rVarC11 = z1.a.c(sVar8, rVarE8);
                                            y2.k.J.getClass();
                                            y2.i iVar4 = y2.j.f56913b;
                                            sVar8.h0();
                                            if (sVar8.S) {
                                                sVar8.k(iVar4);
                                            } else {
                                                sVar8.r0();
                                            }
                                            t.J(y2.j.f56917f, uVarA2, sVar8);
                                            t.J(y2.j.f56916e, q1VarL7, sVar8);
                                            y2.h hVar11 = y2.j.f56918g;
                                            if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode4))) {
                                                defpackage.e.A(iHashCode4, sVar8, iHashCode4, hVar11);
                                            }
                                            t.J(y2.j.f56915d, rVarC11, sVar8);
                                            d0.n.c(se.k.y(R.drawable.ic_sub_intro_play, sVar8, 0), null, j0.c.C(oVar12, CropImageView.DEFAULT_ASPECT_RATIO, f16, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar8, 440, 120);
                                            ua.b(ub.a.e0(sVar8, R.string.editor_s_choice_2018), null, j14, j3.A(18), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar8, 3072, 0, 131058);
                                            final int iIntValue3 = ((Number) sVar8.j(ju.f.f37371e)).intValue();
                                            boolean zD4 = sVar8.d(iIntValue3);
                                            Object objQ19 = sVar8.Q();
                                            l1.g gVar5 = l1.m.f39353a;
                                            if (zD4 || objQ19 == gVar5) {
                                                objQ19 = new fu.x(iIntValue3, 6);
                                                sVar8.o0(objQ19);
                                            }
                                            o0.b bVarB = o0.w.b(0, 0, 3, (fz.a) objQ19, sVar8);
                                            final b3 b3Var1112 = b3Var119;
                                            boolean zF18 = sVar8.f((MergedBillingThemeBillingPage) b3Var1112.getValue());
                                            Object objQ110 = sVar8.Q();
                                            Object obj6 = objQ110;
                                            if (zF18 || objQ110 == gVar5) {
                                                x[] xVarArr = {new x(j3.w(((MergedBillingThemeBillingPage) b3Var1112.getValue()).getColorUserReviewNameIcon1())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var1112.getValue()).getColorUserReviewNameIcon2())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var1112.getValue()).getColorUserReviewNameIcon3())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var1112.getValue()).getColorUserReviewNameIcon4()))};
                                                sVar8.o0(xVarArr);
                                                obj6 = xVarArr;
                                            }
                                            final x[] xVarArr2 = (x[]) obj6;
                                            float f17 = 32;
                                            ve.i.d(bVarB, null, new v1(f17, f16, f17, f16), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-1375898409, new fz.g() { // from class: yg.k
                                                @Override // fz.g
                                                public final Object f(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                    o0.o HorizontalPager = (o0.o) obj7;
                                                    int iIntValue4 = ((Integer) obj8).intValue();
                                                    l1.n nVar4 = (l1.n) obj9;
                                                    ((Integer) obj10).getClass();
                                                    kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                                                    z1.r rVarC12 = j0.c.C(e2.g(z1.o.f58481a, 240), 10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                                    b3 b3Var1113 = b3Var1112;
                                                    k7.d(rVarC12, null, k7.p(j3.w(((MergedBillingThemeBillingPage) b3Var1113.getValue()).getColorUserReviewCard()), nVar4, 0), k7.q(62, 4), null, t1.e.d(1410031433, new jr.y(iIntValue3, iIntValue4, j14, xVarArr2, b3Var1113), nVar4), nVar4, 196614, 18);
                                                    return b0.f48488a;
                                                }
                                            }, sVar8), sVar8, 384, 16378);
                                            sVar8.p(true);
                                        } else {
                                            sVar8.W();
                                        }
                                        break;
                                }
                                return b0.f48488a;
                            }
                        }, true, 793721823), 3);
                        final int i29 = 1;
                        l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: yg.i
                            @Override // fz.f
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                switch (i29) {
                                    case 0:
                                        l0.c item = (l0.c) obj3;
                                        l1.n nVar2 = (l1.n) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        kotlin.jvm.internal.m.f(item, "$this$item");
                                        l1.s sVar6 = (l1.s) nVar2;
                                        if (sVar6.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            String strE0 = ub.a.e0(sVar6, R.string.why_learn_with_the_deer);
                                            float f13 = 44;
                                            z1.o oVar11 = z1.o.f58481a;
                                            z1.r rVarE6 = e2.e(j0.c.E(oVar11, f13, 58, f13, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                            long j12 = j11;
                                            v vVarA = d0.n.a(j12, 1);
                                            o.h(0, j12, 0L, strE0, sVar6, j0.c.B(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.a(), rVarE6), 16, 10));
                                            float f14 = 20;
                                            z1.r rVarD = j0.c.D(e2.e(j0.c.C(j0.c.E(oVar11, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 14, 24, f14, 36);
                                            u uVarA = j0.t.a(j0.i.g(26), z1.c.O, sVar6, 6);
                                            int iHashCode3 = Long.hashCode(sVar6.T);
                                            q1 q1VarL6 = sVar6.l();
                                            z1.r rVarC10 = z1.a.c(sVar6, rVarD);
                                            y2.k.J.getClass();
                                            y2.i iVar3 = y2.j.f56913b;
                                            sVar6.h0();
                                            if (sVar6.S) {
                                                sVar6.k(iVar3);
                                            } else {
                                                sVar6.r0();
                                            }
                                            t.J(y2.j.f56917f, uVarA, sVar6);
                                            t.J(y2.j.f56916e, q1VarL6, sVar6);
                                            y2.h hVar10 = y2.j.f56918g;
                                            if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode3))) {
                                                defpackage.e.A(iHashCode3, sVar6, iHashCode3, hVar10);
                                            }
                                            t.J(y2.j.f56915d, rVarC10, sVar6);
                                            String[] strArr = {ub.a.e0(sVar6, R.string.accelerated_learning), ub.a.e0(sVar6, R.string.effective_results_a), ub.a.e0(sVar6, R.string.convenient_to_use_a)};
                                            String[] strArr2 = {ub.a.e0(sVar6, R.string.systematic_curricula_guarantee_a_fast_path_to_intermediate_a), ub.a.e0(sVar6, R.string.everything_is_clarified_with_detailed_explanations_and_hd_audio_a), ub.a.e0(sVar6, R.string.feel_supported_with_settings_customized_for_asian_languages_a)};
                                            b3 b3Var1111 = b3Var119;
                                            String[] strArr3 = {((MergedBillingThemeBillingPage) b3Var1111.getValue()).getWhyLearnIcon1Url(), ((MergedBillingThemeBillingPage) b3Var1111.getValue()).getWhyLearnIcon2Url(), ((MergedBillingThemeBillingPage) b3Var1111.getValue()).getWhyLearnIcon3Url()};
                                            Integer[] numArr = {Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_1), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_2), Integer.valueOf(R.drawable.ep_subscription_movie_why_learn_3)};
                                            sVar6.d0(-663461197);
                                            int i210 = 0;
                                            int i30 = 0;
                                            while (i210 < 3) {
                                                long j13 = j12;
                                                l1.s sVar7 = sVar6;
                                                o.e(strArr3[i30], numArr[i30].intValue(), strArr[i210], strArr2[i30], j13, j3.A(16), j3.A(14), sVar7, 1769472);
                                                j12 = j13;
                                                sVar6 = sVar7;
                                                i210++;
                                                i30++;
                                            }
                                            sVar6.p(false);
                                            sVar6.p(true);
                                        } else {
                                            sVar6.W();
                                        }
                                        break;
                                    default:
                                        l0.c item2 = (l0.c) obj3;
                                        l1.n nVar3 = (l1.n) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        kotlin.jvm.internal.m.f(item2, "$this$item");
                                        l1.s sVar8 = (l1.s) nVar3;
                                        if (sVar8.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            String strE1 = ub.a.e0(sVar8, R.string._5m_happy_learners);
                                            float f15 = 44;
                                            z1.o oVar12 = z1.o.f58481a;
                                            z1.r rVarE7 = e2.e(j0.c.E(oVar12, f15, 40, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                            final long j14 = j11;
                                            v vVarA2 = d0.n.a(j14, 1);
                                            float f16 = 16;
                                            o.h(0, j14, 0L, strE1, sVar8, j0.c.B(d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.a(), rVarE7), f16, 10));
                                            z1.r rVarE8 = e2.e(oVar12, 1.0f);
                                            u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar8, 48);
                                            int iHashCode4 = Long.hashCode(sVar8.T);
                                            q1 q1VarL7 = sVar8.l();
                                            z1.r rVarC11 = z1.a.c(sVar8, rVarE8);
                                            y2.k.J.getClass();
                                            y2.i iVar4 = y2.j.f56913b;
                                            sVar8.h0();
                                            if (sVar8.S) {
                                                sVar8.k(iVar4);
                                            } else {
                                                sVar8.r0();
                                            }
                                            t.J(y2.j.f56917f, uVarA2, sVar8);
                                            t.J(y2.j.f56916e, q1VarL7, sVar8);
                                            y2.h hVar11 = y2.j.f56918g;
                                            if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode4))) {
                                                defpackage.e.A(iHashCode4, sVar8, iHashCode4, hVar11);
                                            }
                                            t.J(y2.j.f56915d, rVarC11, sVar8);
                                            d0.n.c(se.k.y(R.drawable.ic_sub_intro_play, sVar8, 0), null, j0.c.C(oVar12, CropImageView.DEFAULT_ASPECT_RATIO, f16, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar8, 440, 120);
                                            ua.b(ub.a.e0(sVar8, R.string.editor_s_choice_2018), null, j14, j3.A(18), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar8, 3072, 0, 131058);
                                            final int iIntValue3 = ((Number) sVar8.j(ju.f.f37371e)).intValue();
                                            boolean zD4 = sVar8.d(iIntValue3);
                                            Object objQ19 = sVar8.Q();
                                            l1.g gVar5 = l1.m.f39353a;
                                            if (zD4 || objQ19 == gVar5) {
                                                objQ19 = new fu.x(iIntValue3, 6);
                                                sVar8.o0(objQ19);
                                            }
                                            o0.b bVarB = o0.w.b(0, 0, 3, (fz.a) objQ19, sVar8);
                                            final b3 b3Var1112 = b3Var119;
                                            boolean zF18 = sVar8.f((MergedBillingThemeBillingPage) b3Var1112.getValue());
                                            Object objQ110 = sVar8.Q();
                                            Object obj6 = objQ110;
                                            if (zF18 || objQ110 == gVar5) {
                                                x[] xVarArr = {new x(j3.w(((MergedBillingThemeBillingPage) b3Var1112.getValue()).getColorUserReviewNameIcon1())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var1112.getValue()).getColorUserReviewNameIcon2())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var1112.getValue()).getColorUserReviewNameIcon3())), new x(j3.w(((MergedBillingThemeBillingPage) b3Var1112.getValue()).getColorUserReviewNameIcon4()))};
                                                sVar8.o0(xVarArr);
                                                obj6 = xVarArr;
                                            }
                                            final x[] xVarArr2 = (x[]) obj6;
                                            float f17 = 32;
                                            ve.i.d(bVarB, null, new v1(f17, f16, f17, f16), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-1375898409, new fz.g() { // from class: yg.k
                                                @Override // fz.g
                                                public final Object f(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                    o0.o HorizontalPager = (o0.o) obj7;
                                                    int iIntValue4 = ((Integer) obj8).intValue();
                                                    l1.n nVar4 = (l1.n) obj9;
                                                    ((Integer) obj10).getClass();
                                                    kotlin.jvm.internal.m.f(HorizontalPager, "$this$HorizontalPager");
                                                    z1.r rVarC12 = j0.c.C(e2.g(z1.o.f58481a, 240), 10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                                    b3 b3Var1113 = b3Var1112;
                                                    k7.d(rVarC12, null, k7.p(j3.w(((MergedBillingThemeBillingPage) b3Var1113.getValue()).getColorUserReviewCard()), nVar4, 0), k7.q(62, 4), null, t1.e.d(1410031433, new jr.y(iIntValue3, iIntValue4, j14, xVarArr2, b3Var1113), nVar4), nVar4, 196614, 18);
                                                    return b0.f48488a;
                                                }
                                            }, sVar8), sVar8, 384, 16378);
                                            sVar8.p(true);
                                        } else {
                                            sVar8.W();
                                        }
                                        break;
                                }
                                return b0.f48488a;
                            }
                        }, true, -1411920544), 3);
                        l0.h.p(LazyColumn, null, new t1.d(new r0(j11, 5), true, 677404385), 3);
                        l0.h.p(LazyColumn, null, new t1.d(new j1(j11, onTermsOfUseClick, onPrivacyPolicyClick, onContactUsClick, aVar, 1), true, -1528237982), 3);
                        if (!kotlin.jvm.internal.m.a(str7, "bottom_tab")) {
                            l0.h.p(LazyColumn, null, r.f57842b, 3);
                        }
                        return b0.f48488a;
                    }
                };
                str3 = str;
                mVar5 = mVar110;
                b3VarCollectAsStateWithLifecycle6 = b3VarCollectAsStateWithLifecycle6;
                b3Var10 = b3VarCollectAsStateWithLifecycle;
                b1Var7 = b1Var7;
                sVar = sVar2;
                sVar.o0(obj);
            } else {
                str3 = str;
                gVar3 = gVar2;
                obj = objQ12;
                b3Var10 = b3VarCollectAsStateWithLifecycle;
                b3Var9 = b3VarCollectAsStateWithLifecycle2;
                f11 = 1.0f;
                sVar = sVar2;
            }
            l1.s sVar6 = sVar;
            ue.f.a(rVarC9, wVarA2, null, null, null, null, false, null, (fz.c) obj, sVar6, 0, 508);
            sVar2 = sVar6;
            boolean zBooleanValue7 = ((Boolean) b3Var110.getValue()).booleanValue();
            objQ13 = sVar2.Q();
            gVar4 = gVar3;
            if (objQ13 == gVar4) {
                objQ13 = new xt.r(9);
                sVar2.o0(objQ13);
            }
            a0.l1 l1VarC4 = f1.c((fz.c) objQ13, 7);
            objQ14 = sVar2.Q();
            if (objQ14 == gVar4) {
                objQ14 = new xt.r(10);
                sVar2.o0(objQ14);
            }
            a0.j0.d(zBooleanValue7, null, l1VarC4, f1.k((fz.c) objQ14, 7), null, t1.e.d(-309655129, new defpackage.d(b3Var9, b3VarCollectAsStateWithLifecycle6, b3Var10, 19), sVar2), sVar2, 200064, 18);
            zEquals = str3.equals("bottom_tab");
            rVar = j0.r.f35391a;
            if (zEquals) {
                oVar2 = oVar;
                rVarV = rVar.a(oVar2, jVar);
            } else {
                oVar2 = oVar;
                rVarV = j0.c.v(rVar.a(oVar2, r20));
            }
            q0 q0VarD6 = j0.o.d(z1.c.f58463a, false);
            iHashCode2 = Long.hashCode(sVar2.T);
            q1 q1VarL6 = sVar2.l();
            z1.r rVarC10 = z1.a.c(sVar2, rVarV);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar2);
            } else {
                sVar2.r0();
            }
            t.J(hVar6, q0VarD6, sVar2);
            t.J(hVar7, q1VarL6, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
            } else {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
            }
            t.J(hVar9, rVarC10, sVar2);
            boolean zBooleanValue8 = ((Boolean) b3Var110.getValue()).booleanValue();
            objQ15 = sVar2.Q();
            if (objQ15 == gVar4) {
                objQ15 = new xt.r(11);
                sVar2.o0(objQ15);
            }
            a0.l1 l1VarN4 = f1.n((fz.c) objQ15);
            objQ16 = sVar2.Q();
            if (objQ16 == gVar4) {
                objQ16 = new xt.r(12);
                sVar2.o0(objQ16);
            }
            m1 m1VarT4 = f1.t((fz.c) objQ16);
            if (((Boolean) sVar2.j(c3Var)).booleanValue()) {
                f12 = 0.7f;
            } else {
                f12 = f11;
            }
            z1.r rVarE6 = e2.e(oVar2, f12);
            String str7 = str3;
            ni.m mVar111 = mVar5;
            h2 h2Var4 = new h2(b3Var4, mVar111, dVar, str7, b1Var4, b1Var5, b1Var7, b1Var6);
            source = str7;
            a0.j0.d(zBooleanValue8, rVarE6, l1VarN4, m1VarT4, null, t1.e.d(82105517, h2Var4, sVar2), sVar2, 200064, 16);
            sVar2.p(true);
            sVar2.p(true);
            aVar2 = onSubscriptionSuccess;
            k((ni.h) b3VarCollectAsStateWithLifecycle19.getValue(), aVar2, source, sVar2, ((i15 >> 15) & 112) | ((i15 << 3) & 896));
            mVar2 = mVar111;
            z12 = z13;
        } else {
            aVar2 = onSubscriptionSuccess;
            sVar2.W();
            mVar2 = mVar;
            z12 = z11;
        }
        x1VarT = sVar2.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: yg.g
                @Override // fz.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    o.g(dVar, source, remoteConfigViewModel, mVar2, z12, onFinishClick, aVar2, onContactUsClick, aVar, onTermsOfUseClick, onPrivacyPolicyClick, (l1.n) obj2, t.M(i11 | 1), i12);
                    return b0.f48488a;
                }
            };
        }
    }

    public static final void h(int i11, long j11, long j12, String title, l1.n nVar, z1.r rVar) {
        l1.s sVar;
        long j13;
        kotlin.jvm.internal.m.f(title, "title");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(462720158);
        int i12 = i11 | (sVar2.f(title) ? 4 : 2) | (sVar2.e(j11) ? 32 : 16) | (sVar2.f(rVar) ? 256 : 128) | 3072;
        if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
            long jA = j3.A(18);
            sVar = sVar2;
            ua.b(title, rVar, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), j11, jA, n3.s.K, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar, (i12 & 14) | ((i12 >> 3) & 112), 0, 65532);
            j13 = jA;
        } else {
            sVar = sVar2;
            sVar.W();
            j13 = j12;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new gr.e(title, j11, rVar, j13, i11, 2);
        }
    }

    public static final void i(final String str, final String str2, final long j11, final long j12, final long j13, final long j14, final long j15, final long j16, l1.n nVar, final int i11) {
        boolean z11;
        boolean z12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1885812279);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.f(str2) ? 32 : 16) | (sVar.e(j11) ? 256 : 128) | (sVar.e(j12) ? 2048 : 1024) | (sVar.e(j13) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.e(j14) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.e(j15) ? 1048576 : 524288) | (sVar.e(j16) ? 8388608 : 4194304);
        if (sVar.T(i12 & 1, (4793491 & i12) != 4793490)) {
            j0 j0VarQ = p3.q(ns.o.L(new x(j15), new x(j16)));
            r0.e eVarC = r0.f.c(80, 11);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarG = d0.n.g(oVar, j0VarQ, eVarC, 4);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarG);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, a2VarA, sVar);
            t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar);
            if (oz.q.K0(str)) {
                z11 = false;
                sVar.d0(959966173);
            } else {
                sVar.d0(1024948621);
                float f5 = 5;
                ua.b(str, j0.c.D(d0.n.g(oVar, p3.q(ns.o.L(new x(j13), new x(j14))), r0.f.c(80, 11), 4), 6, f5, 12, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), j11, j3.A(10), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar, i12 & 14, 0, 65532);
                z11 = false;
            }
            sVar.p(z11);
            if (oz.q.K0(str2)) {
                z12 = false;
                sVar.d0(959966173);
            } else {
                sVar.d0(1025725481);
                float f11 = 5;
                ua.b(str2, j0.c.D(oVar, 6, f11, 12, f11), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), j12, j3.A(10), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar, (i12 >> 3) & 14, 0, 65532);
                z12 = false;
            }
            sVar.p(z12);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(str, str2, j11, j12, j13, j14, j15, j16, i11) { // from class: yg.d
                public final /* synthetic */ long H;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f57771a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f57772b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f57773c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f57774d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f57775e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f57776f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ long f57777t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = t.M(1);
                    o.i(this.f57771a, this.f57772b, this.f57773c, this.f57774d, this.f57775e, this.f57776f, this.f57777t, this.H, (l1.n) obj, iM);
                    return b0.f48488a;
                }
            };
        }
    }

    public static final void j(String title, long j11, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(title, "title");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(754739071);
        int i12 = i11 | (sVar2.f(title) ? 4 : 2) | (sVar2.e(j11) ? 32 : 16);
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            float f5 = 16;
            sVar = sVar2;
            ua.b(title, j0.c.D(e2.e(z1.o.f58481a, 1.0f), f5, f5, f5, 30), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), j11, j3.A(16), n3.s.K, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar, i12 & 14, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new gr.d(i11, 3, j11, title);
        }
    }

    public static final void k(ni.h subscriptionResponse, fz.a onSubscriptionSuccess, String source, l1.n nVar, int i11) {
        int i12;
        b1 b1Var;
        kotlin.jvm.internal.m.f(subscriptionResponse, "subscriptionResponse");
        kotlin.jvm.internal.m.f(onSubscriptionSuccess, "onSubscriptionSuccess");
        kotlin.jvm.internal.m.f(source, "source");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1889015995);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(subscriptionResponse) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onSubscriptionSuccess) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(source) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            b1 b1Var2 = (b1) objQ;
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF = sVar.f(null) | sVar.f(aVarC);
            Object objQ2 = sVar.Q();
            if (zF || objQ2 == gVar) {
                objQ2 = w4.c.e(ur.a.class, aVarC, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            ur.a aVar = (ur.a) objQ2;
            boolean zH = ((i12 & 896) == 256) | ((i12 & 14) == 4) | ((i12 & 112) == 32) | sVar.h(aVar) | sVar.h(context);
            Object objQ3 = sVar.Q();
            if (zH || objQ3 == gVar) {
                b1Var = b1Var2;
                k9.t tVar = new k9.t(subscriptionResponse, onSubscriptionSuccess, aVar, context, b1Var, source, null, 4);
                sVar.o0(tVar);
                objQ3 = tVar;
            } else {
                b1Var = b1Var2;
            }
            t.f((fz.e) objQ3, subscriptionResponse, sVar);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.d0(1282247134);
                tv.a.c(sVar, 0);
            } else {
                sVar.d0(1228261533);
            }
            sVar.p(false);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new qg.d(subscriptionResponse, onSubscriptionSuccess, source, i11);
        }
    }

    public static final void l(int i11, long j11, long j12, String timeStr, l1.n nVar, z1.r rVar) {
        z1.r rVar2;
        z1.o oVar;
        boolean z11;
        int i12;
        char c11;
        long j13 = j11;
        long j14 = j12;
        kotlin.jvm.internal.m.f(timeStr, "timeStr");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-201215070);
        int i13 = i11 | (sVar.f(timeStr) ? 4 : 2) | (sVar.e(j13) ? 32 : 16) | (sVar.e(j14) ? 256 : 128) | 24576;
        boolean z12 = false;
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar2 = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar2);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, a2VarA, sVar);
            t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar);
            boolean z13 = (i13 & 14) == 4;
            Object objQ = sVar.Q();
            if (z13 || objQ == l1.m.f39353a) {
                objQ = oz.q.W0(timeStr, new String[]{":"}, 0, 6);
                sVar.o0(objQ);
            }
            List list = (List) objQ;
            sVar.d0(-996061385);
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    ns.o.V();
                    throw null;
                }
                z1.o oVar3 = oVar2;
                int i16 = i14;
                k7.d(null, r0.f.d(2), k7.p(j13, sVar, (i13 >> 3) & 14), null, null, t1.e.d(-21601178, new n0((String) obj, j14, 2), sVar), sVar, 196608, 25);
                l1.s sVar2 = sVar;
                if (i16 != list.size() - 1) {
                    sVar2.d0(-36355507);
                    i12 = i13;
                    c11 = 6;
                    oVar = oVar3;
                    ua.b(":", j0.c.C(oVar, 6, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), j13, j3.L(4294967296L, 16.0f), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar2, 54, 0, 65532);
                    sVar = sVar2;
                    z11 = false;
                } else {
                    oVar = oVar3;
                    z11 = false;
                    i12 = i13;
                    sVar = sVar2;
                    c11 = 6;
                    sVar.d0(-104187382);
                }
                sVar.p(z11);
                oVar2 = oVar;
                z12 = z11;
                i14 = i15;
                i13 = i12;
                j13 = j11;
                j14 = j12;
            }
            sVar.p(z12);
            sVar.p(true);
            rVar2 = oVar2;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new gr.e(timeStr, j11, j12, rVar2, i11);
        }
    }

    public static final void m(int i11, com.android.billingclient.api.o oVar, MergedBillingThemeBillingPage mergedBillingThemeBillingPage, String str, String str2, String str3, String str4, String str5, String str6, l1.n nVar, ni.m mVar, boolean z11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-936645568);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.f(str2) ? 32 : 16) | (sVar.f(str3) ? 256 : 128) | (sVar.h(mergedBillingThemeBillingPage) ? 2048 : 1024) | (sVar.f(str4) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.f(str5) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.g(z11) ? 1048576 : 524288) | (sVar.h(mVar) ? 8388608 : 4194304) | (sVar.h(oVar) ? 67108864 : 33554432) | (sVar.f(str6) ? 536870912 : 268435456);
        if (sVar.T(i12 & 1, (i12 & 306783379) != 306783378)) {
            b3 b3VarB = b0.h.b(z11 ? 1.0f : 0.95f, null, BuildConfig.VERSION_NAME, sVar, 3072, 22);
            boolean z12 = (i12 & 1879048192) == 536870912;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z12 || objQ == gVar) {
                objQ = new aq.a(str6, null, 13);
                sVar.o0(objQ);
            }
            t.f((fz.e) objQ, str6, sVar);
            long jW = j3.w(mergedBillingThemeBillingPage.getColorLifeTimeCard());
            long jW2 = j3.w(mergedBillingThemeBillingPage.getColorLifeTimeCardEnd());
            long jW3 = j3.w(mergedBillingThemeBillingPage.getColorLifeTimeCardStroke());
            float f5 = z11 ? 2 : -1;
            long jW4 = j3.w(mergedBillingThemeBillingPage.getColorLifeTimeCardText());
            long jW5 = j3.w(mergedBillingThemeBillingPage.getColorLifeTimeCardText());
            float fFloatValue = ((Number) b3VarB.getValue()).floatValue();
            z1.r rVarI = d2.h.i(z1.o.f58481a, fFloatValue, fFloatValue);
            boolean zH = sVar.h(mVar) | sVar.h(oVar);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new a(mVar, oVar, 0);
                sVar.o0(objQ2);
            }
            int i13 = i12 >> 6;
            b(str, str2, str4, str5, jW, jW2, jW3, f5, jW4, jW5, rVarI, (fz.a) objQ2, t1.e.d(438089308, new b(str3, str6, mergedBillingThemeBillingPage, z11, 0), sVar), sVar, (i12 & 126) | (i13 & 896) | (i13 & 7168));
            sVar = sVar;
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(str, str2, str3, mergedBillingThemeBillingPage, str4, str5, z11, mVar, oVar, str6, i11);
        }
    }

    public static final void n(String str, String str2, MergedBillingThemeBillingPage mergedBillingThemeBillingPage, boolean z11, ni.m mVar, com.android.billingclient.api.o oVar, l1.n nVar, int i11) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1217057870);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2) | (sVar2.f(str2) ? 32 : 16) | (sVar2.h(mergedBillingThemeBillingPage) ? 256 : 128) | (sVar2.g(z11) ? 2048 : 1024) | (sVar2.h(mVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(oVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar2.T(i12 & 1, (74899 & i12) != 74898)) {
            b3 b3VarB = b0.h.b(z11 ? 1.0f : 0.95f, null, BuildConfig.VERSION_NAME, sVar2, 3072, 22);
            long jW = j3.w(mergedBillingThemeBillingPage.getColorOthersCard());
            long jW2 = j3.w(mergedBillingThemeBillingPage.getColorOthersCardEnd());
            long jW3 = j3.w(mergedBillingThemeBillingPage.getColorOthersCardStroke());
            float f5 = z11 ? 2 : -1;
            long jW4 = j3.w(mergedBillingThemeBillingPage.getColorOthersCardText());
            long jW5 = j3.w(mergedBillingThemeBillingPage.getColorOthersCardText());
            float fFloatValue = ((Number) b3VarB.getValue()).floatValue();
            z1.r rVarI = d2.h.i(z1.o.f58481a, fFloatValue, fFloatValue);
            boolean zH = sVar2.h(mVar) | sVar2.h(oVar);
            Object objQ = sVar2.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new a(mVar, oVar, 1);
                sVar2.o0(objQ);
            }
            sVar = sVar2;
            b(str, BuildConfig.VERSION_NAME, str2, BuildConfig.VERSION_NAME, jW, jW2, jW3, f5, jW4, jW5, rVarI, (fz.a) objQ, t1.e.d(-583723854, new gs.m(z11, mergedBillingThemeBillingPage, 5), sVar2), sVar, (i12 & 14) | 3120 | ((i12 << 3) & 896));
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.q1(str, str2, mergedBillingThemeBillingPage, z11, mVar, oVar, i11);
        }
    }
}
