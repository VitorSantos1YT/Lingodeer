package h1;

import android.content.Context;
import android.content.res.Configuration;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f31264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f31265e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y.w f31269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final y.w f31270j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f31271k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f31261a = 101;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f31262b = 69;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f31263c = 36;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f31266f = 74;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f31267g = 48;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y.w f31268h = y.l.a(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);

    static {
        float f5 = 24;
        f31264d = f5;
        f31265e = f5;
        y.w wVarA = y.l.a(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        f31269i = wVarA;
        y.w wVar = new y.w(wVarA.f56783b);
        int[] iArr = wVarA.f56782a;
        int i11 = wVarA.f56783b;
        for (int i12 = 0; i12 < i11; i12++) {
            wVar.a((iArr[i12] % 12) + 12);
        }
        f31270j = wVar;
        f31271k = 12;
    }

    public static final void a(yb ybVar, za zaVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-934561141);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar.f(ybVar) : sVar.h(ybVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(zaVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && sVar.F()) {
            sVar.W();
        } else {
            l1.t.b(new l1.w1[]{ua.f31167a.a(fc.a(k1.k0.f37599x, sVar)), z2.g1.f58552n.a(v3.m.Ltr)}, t1.e.d(-477913269, new b2.h(7, ybVar, zaVar), sVar), sVar, 56);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new db(ybVar, zaVar, i11, 0);
        }
    }

    public static final void b(n nVar, za zaVar, boolean z11, l1.n nVar2, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar2;
        sVar.f0(-1170157036);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(nVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(zaVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            a0.j0.g(nVar.f30706a.f() == 1 ? f31268h : f31269i, d2.h.f(j0.e2.n(d0.n.h(z1.o.f58481a, zaVar.f31429a, r0.f.f48733a).i(new n1(nVar, z11, nVar.f30706a.f())), k1.k0.f37578b), new a0.e(12, nVar, zaVar)), b0.e.r(200, 0, null, 6), null, t1.e.d(-1022006568, new gb(zaVar, nVar, z11), sVar), sVar, 24960, 8);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new hb(nVar, zaVar, z11, i11);
        }
    }

    public static final void c(yb ybVar, za zaVar, l1.n nVar, int i11) {
        int i12;
        boolean z11;
        boolean z12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(755539561);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar.f(ybVar) : sVar.h(ybVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(zaVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && sVar.F()) {
            sVar.W();
        } else {
            j0.u uVarA = j0.t.a(j0.i.f35307e, z1.c.O, sVar, 6);
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
            a(ybVar, zaVar, sVar, i12 & 126);
            sVar.d0(919638492);
            if (ybVar.g()) {
                z11 = true;
                z12 = false;
            } else {
                int i13 = i12;
                z12 = false;
                z1.r rVarE = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f31271k, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
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
                int i14 = i13 << 3;
                d(j0.e2.p(oVar, k1.k0.m, k1.k0.f37588l), ybVar, zaVar, sVar, (i14 & 896) | (i14 & 112) | 6);
                z11 = true;
                sVar.p(true);
            }
            sVar.p(z12);
            sVar.p(z11);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new db(ybVar, zaVar, i11, 1);
        }
    }

    public static final void d(z1.r rVar, yb ybVar, za zaVar, l1.n nVar, int i11) {
        z1.r rVar2;
        int i12;
        za zaVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1261215927);
        if ((i11 & 6) == 0) {
            rVar2 = rVar;
            i12 = (sVar.f(rVar2) ? 4 : 2) | i11;
        } else {
            rVar2 = rVar;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar.f(ybVar) : sVar.h(ybVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            zaVar2 = zaVar;
            i12 |= sVar.f(zaVar2) ? 256 : 128;
        } else {
            zaVar2 = zaVar;
        }
        if ((i12 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = g1.f30267c;
                sVar.o0(objQ);
            }
            g2.w0 w0VarA = y7.a(k1.k0.f37587k, sVar);
            kotlin.jvm.internal.m.d(w0VarA, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            r0.e eVar = (r0.e) w0VarA;
            float f5 = (float) 0.0d;
            f(rVar2, ybVar, zaVar2, (w2.q0) objQ, r0.e.b(eVar, null, new r0.b(f5), new r0.b(f5), null, 9), r0.e.b(eVar, new r0.b(f5), null, null, new r0.b(f5), 6), sVar, (i12 & 896) | (i12 & 14) | 3072 | (i12 & 112));
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new lb(rVar, ybVar, zaVar, i11, 0);
        }
    }

    public static final void e(n nVar, z1.r rVar, za zaVar, boolean z11, l1.n nVar2, int i11) {
        int i12;
        z1.r rVar2;
        l1.s sVar = (l1.s) nVar2;
        sVar.f0(1432307537);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(nVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(zaVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.g(z11) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && sVar.F()) {
            sVar.W();
            rVar2 = rVar;
        } else {
            sVar.Y();
            if ((i11 & 1) != 0 && !sVar.C()) {
                sVar.W();
            }
            sVar.q();
            rVar2 = rVar;
            z1.r rVarE = j0.c.E(rVar2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f31264d, 7);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
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
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            int i13 = i12 & 14;
            int i14 = i12 >> 3;
            int i15 = i13 | (i14 & 112);
            c(nVar, zaVar, sVar, i15);
            j0.c.g(sVar, j0.e2.s(z1.o.f58481a, f31263c));
            b(nVar, zaVar, z11, sVar, i15 | (i14 & 896));
            sVar.p(true);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new nb(nVar, rVar2, zaVar, z11, i11, 0);
        }
    }

    public static final void f(z1.r rVar, yb ybVar, za zaVar, w2.q0 q0Var, r0.e eVar, r0.e eVar2, l1.n nVar, int i11) {
        int i12;
        long j11 = zaVar.f31432d;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1374241901);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar.f(ybVar) : sVar.h(ybVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(zaVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(q0Var) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.f(eVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.f(eVar2) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        int i13 = i12;
        if ((74899 & i13) == 74898 && sVar.F()) {
            sVar.W();
        } else {
            d0.v vVarA = d0.n.a(j11, k1.k0.f37590o);
            g2.w0 w0VarA = y7.a(k1.k0.f37587k, sVar);
            kotlin.jvm.internal.m.d(w0VarA, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            r0.e eVar3 = (r0.e) w0VarA;
            String strI = i1.p.i(sVar, R.string.m3c_time_picker_period_toggle_description);
            boolean zF = sVar.f(strI);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = new c6.o(strI, 8);
                sVar.o0(objQ);
            }
            z1.r rVarK = d0.n.k(vVarA.f22811a, vVarA.f22812b, eVar3, q0.c.c(g3.r.b(rVar, false, (fz.c) objQ)));
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarK);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0Var, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            boolean z11 = !ybVar.i();
            int i14 = i13 & 112;
            boolean z12 = i14 == 32 || ((i13 & 64) != 0 && sVar.h(ybVar));
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new ob(0, ybVar);
                sVar.o0(objQ2);
            }
            int i15 = (i13 << 3) & 7168;
            h(z11, eVar, (fz.a) objQ2, zaVar, g2.f30270a, sVar, ((i13 >> 9) & 112) | 24576 | i15);
            j0.c.g(sVar, d0.n.h(j0.e2.d(z1.a.d(w2.a0.l(z1.o.f58481a, "Spacer"), 2.0f), 1.0f), j11, g2.f0.f28556b));
            boolean zI = ybVar.i();
            boolean z13 = i14 == 32 || ((i13 & 64) != 0 && sVar.h(ybVar));
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new ob(1, ybVar);
                sVar.o0(objQ3);
            }
            h(zI, eVar2, (fz.a) objQ3, zaVar, g2.f30271b, sVar, ((i13 >> 12) & 112) | 24576 | i15);
            sVar.p(true);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new a0.m(rVar, ybVar, zaVar, q0Var, eVar, eVar2, i11);
        }
    }

    public static final void g(yb ybVar, z1.r rVar, za zaVar, int i11, l1.n nVar, int i12) {
        int i13;
        int i14;
        z1.r rVar2;
        int i15;
        z1.r rVar3;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-619286452);
        int i16 = i12 | (sVar.f(ybVar) ? 4 : 2) | 48 | (sVar.f(zaVar) ? 256 : 128) | 1024;
        if ((i16 & 1171) == 1170 && sVar.F()) {
            sVar.W();
            rVar3 = rVar;
            i15 = i11;
        } else {
            sVar.Y();
            if ((i12 & 1) == 0 || sVar.C()) {
                Configuration configuration = (Configuration) sVar.j(AndroidCompositionLocals_androidKt.f1199a);
                i13 = i16 & (-7169);
                i14 = configuration.screenHeightDp < configuration.screenWidthDp ? 0 : 1;
                rVar2 = z1.o.f58481a;
            } else {
                sVar.W();
                rVar2 = rVar;
                i13 = i16 & (-7169);
                i14 = i11;
            }
            sVar.q();
            Object systemService = ((Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b)).getSystemService("accessibility");
            kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            boolean zG = sVar.g(true) | sVar.g(true);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zG || objQ == gVar) {
                objQ = new i1.n0();
                sVar.o0(objQ);
            }
            i1.n0 n0Var = (i1.n0) objQ;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) sVar.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            boolean zF = sVar.f(n0Var) | sVar.h(accessibilityManager);
            Object objQ2 = sVar.Q();
            if (zF || objQ2 == gVar) {
                objQ2 = new i1.c(n0Var, accessibilityManager);
                sVar.o0(objQ2);
            }
            fz.c cVar = (fz.c) objQ2;
            boolean zF2 = sVar.f(n0Var) | sVar.h(accessibilityManager);
            Object objQ3 = sVar.Q();
            if (zF2 || objQ3 == gVar) {
                objQ3 = new d2.c(5, n0Var, accessibilityManager);
                sVar.o0(objQ3);
            }
            i1.d.a(lifecycleOwner, cVar, (fz.a) objQ3, sVar, 0);
            boolean z11 = (i13 & 14) == 4;
            Object objQ4 = sVar.Q();
            if (z11 || objQ4 == gVar) {
                objQ4 = new n(ybVar);
                sVar.o0(objQ4);
            }
            n nVar2 = (n) objQ4;
            if (i14 == 1) {
                sVar.d0(-337235422);
                k(nVar2, rVar2, zaVar, true ^ ((Boolean) n0Var.getValue()).booleanValue(), sVar, i13 & 1008);
                sVar.p(false);
            } else {
                sVar.d0(-337036960);
                e(nVar2, rVar2, zaVar, true ^ ((Boolean) n0Var.getValue()).booleanValue(), sVar, i13 & 1008);
                sVar.p(false);
            }
            i15 = i14;
            rVar3 = rVar2;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new lb(ybVar, rVar3, zaVar, i15, i12);
        }
    }

    public static final void h(boolean z11, r0.e eVar, fz.a aVar, za zaVar, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        r0.e eVar2;
        fz.a aVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1937408098);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i12 |= sVar.f(eVar2) ? 32 : 16;
        } else {
            eVar2 = eVar;
        }
        if ((i11 & 384) == 0) {
            aVar2 = aVar;
            i12 |= sVar.h(aVar2) ? 256 : 128;
        } else {
            aVar2 = aVar;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(zaVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(dVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((i12 & 9363) == 9362 && sVar.F()) {
            sVar.W();
        } else {
            long j11 = z11 ? zaVar.f31437i : zaVar.f31438j;
            long j12 = z11 ? zaVar.f31435g : zaVar.f31436h;
            z1.r rVarD = j0.e2.d(z1.a.d(z1.o.f58481a, z11 ? CropImageView.DEFAULT_ASPECT_RATIO : 1.0f), 1.0f);
            boolean z12 = (i12 & 14) == 4;
            Object objQ = sVar.Q();
            if (z12 || objQ == l1.m.f39353a) {
                objQ = new sb(z11);
                sVar.o0(objQ);
            }
            z1.r rVarB = g3.r.b(rVarD, false, (fz.c) objQ);
            float f5 = 0;
            k7.m(aVar2, rVarB, false, eVar2, j0.g(j12, j11, sVar, 12), new j0.v1(f5, f5, f5, f5), dVar, sVar, ((i12 >> 6) & 14) | 12582912 | ((i12 << 6) & 7168) | ((i12 << 15) & 1879048192), 356);
            sVar = sVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new tb(z11, eVar, aVar, zaVar, dVar, i11);
        }
    }

    public static final void i(yb ybVar, za zaVar, l1.n nVar, int i11) {
        int i12;
        boolean z11;
        boolean z12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(2054675515);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar.f(ybVar) : sVar.h(ybVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(zaVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && sVar.F()) {
            sVar.W();
        } else {
            j0.a2 a2VarA = j0.z1.a(j0.i.f35307e, z1.c.L, sVar, 6);
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
            a(ybVar, zaVar, sVar, i12 & 126);
            sVar.d0(-709485014);
            if (ybVar.g()) {
                z11 = true;
                z12 = false;
            } else {
                int i13 = i12;
                z12 = false;
                z1.r rVarE = j0.c.E(oVar, f31271k, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
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
                int i14 = i13 << 3;
                j(j0.e2.p(oVar, k1.k0.f37595t, k1.k0.f37594s), ybVar, zaVar, sVar, (i14 & 896) | (i14 & 112) | 6);
                z11 = true;
                sVar.p(true);
            }
            sVar.p(z12);
            sVar.p(z11);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new db(ybVar, zaVar, i11, 2);
        }
    }

    public static final void j(z1.r rVar, yb ybVar, za zaVar, l1.n nVar, int i11) {
        int i12;
        za zaVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1898918107);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar.f(ybVar) : sVar.h(ybVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            zaVar2 = zaVar;
            i12 |= sVar.f(zaVar2) ? 256 : 128;
        } else {
            zaVar2 = zaVar;
        }
        if ((i12 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = g1.f30268d;
                sVar.o0(objQ);
            }
            g2.w0 w0VarA = y7.a(k1.k0.f37587k, sVar);
            kotlin.jvm.internal.m.d(w0VarA, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            r0.e eVar = (r0.e) w0VarA;
            float f5 = (float) 0.0d;
            f(rVar, ybVar, zaVar2, (w2.q0) objQ, y7.b(eVar), r0.e.b(eVar, new r0.b(f5), new r0.b(f5), null, null, 12), sVar, (i12 & 14) | 3072 | (i12 & 112) | (i12 & 896));
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new lb(rVar, ybVar, zaVar, i11, 2);
        }
    }

    public static final void k(n nVar, z1.r rVar, za zaVar, boolean z11, l1.n nVar2, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar2;
        sVar.f0(1249591487);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(nVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(zaVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.g(z11) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && sVar.F()) {
            sVar.W();
        } else {
            sVar.Y();
            if ((i11 & 1) != 0 && !sVar.C()) {
                sVar.W();
            }
            sVar.q();
            z1.r rVarB = g3.r.b(rVar, false, o0.W);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
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
            int i13 = i12 & 14;
            int i14 = i12 >> 3;
            int i15 = i13 | (i14 & 112);
            i(nVar, zaVar, sVar, i15);
            float f5 = f31263c;
            z1.o oVar = z1.o.f58481a;
            j0.c.g(sVar, j0.e2.g(oVar, f5));
            b(nVar, zaVar, z11, sVar, (i14 & 896) | i15);
            ep.a.C(oVar, f31264d, sVar, true);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new nb(nVar, rVar, zaVar, z11, i11, 1);
        }
    }

    public static final void l(z1.r rVar, float f5, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1548175696);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.c(f5) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(dVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            boolean z11 = (i12 & 112) == 32;
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new bb(f5);
                sVar.o0(objQ);
            }
            w2.q0 q0Var = (w2.q0) objQ;
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            int i13 = (((((i12 << 3) & 112) | ((i12 >> 6) & 14)) << 6) & 896) | 6;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0Var, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            hh.p0.x((i13 >> 6) & 14, dVar, sVar, true);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cb(rVar, f5, dVar, i11);
        }
    }

    public static final void m(z1.r rVar, n nVar, int i11, boolean z11, l1.n nVar2, int i12) {
        int i13;
        boolean z12;
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar2;
        sVar2.f0(-206784607);
        if ((i12 & 6) == 0) {
            i13 = (sVar2.f(rVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar2.h(nVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar2.d(i11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar2.g(z11) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && sVar2.F()) {
            sVar2.W();
            sVar = sVar2;
        } else {
            j3.y0 y0VarA = fc.a(k1.k0.f37579c, sVar2);
            float fE0 = ((v3.c) sVar2.j(z2.g1.f58547h)).e0(f31266f);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(new f2.b(0L));
                sVar2.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(new v3.j(0L));
                sVar2.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                l1.c0 c0Var = new l1.c0(l1.t.q(sVar2));
                sVar2.o0(c0Var);
                objQ3 = c0Var;
            }
            rz.b0 b0Var = ((l1.c0) objQ3).f39245a;
            yb ybVar = nVar.f30706a;
            String strS = s(ybVar.f(), ybVar.g(), i11, sVar2);
            String strA = s0.a(i11, 7);
            boolean zA = ybVar.f() == 1 ? kotlin.jvm.internal.m.a(s0.a(ybVar.d(), 7), strA) : kotlin.jvm.internal.m.a(s0.a(ybVar.h(), 7), strA);
            z1.j jVar = z1.c.f58467e;
            l1.c3 c3Var = s4.f31053a;
            z1.r rVarN = j0.e2.n(rVar.i(c5.f30080a), f31267g);
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = new a0.e(11, b1Var2, b1Var);
                sVar2.o0(objQ4);
            }
            z1.r rVarQ = d0.n.q(w2.a0.m(rVarN, (fz.c) objQ4), true, null);
            boolean zH = sVar2.h(b0Var) | sVar2.h(nVar) | sVar2.c(fE0) | ((i13 & 7168) == 2048) | sVar2.g(zA);
            Object objQ5 = sVar2.Q();
            if (zH || objQ5 == gVar) {
                boolean z13 = zA;
                z12 = false;
                jb jbVar = new jb(z13, b0Var, nVar, fE0, z11, b1Var, b1Var2);
                sVar2.o0(jbVar);
                objQ5 = jbVar;
            } else {
                z12 = false;
            }
            z1.r rVarB = g3.r.b(rVarQ, true, (fz.c) objQ5);
            w2.q0 q0VarD = j0.o.d(jVar, z12);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarB);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar2);
            boolean zF = sVar2.f(strS);
            Object objQ6 = sVar2.Q();
            if (zF || objQ6 == gVar) {
                objQ6 = new c6.o(strS, 7);
                sVar2.o0(objQ6);
            }
            ua.b(strA, g3.r.a(z1.o.f58481a, (fz.c) objQ6), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar2, 0, 0, 65532);
            sVar = sVar2;
            sVar.p(true);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new kb(rVar, nVar, i11, z11, i12);
        }
    }

    public static final void n(z1.r rVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(2100674302);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && sVar.F()) {
            sVar.W();
        } else {
            j3.y0 y0VarA = j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, new u3.i(17, u3.f.f52740b, 0), 15695871);
            z1.r rVarA = g3.r.a(rVar, o0.V);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
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
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            ua.b(":", null, v1.d(k1.j0.f37569a, sVar), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar, 6, 0, 65530);
            sVar = sVar;
            sVar.p(true);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v9(rVar, i11, 1);
        }
    }

    public static final void o(z1.r rVar, int i11, yb ybVar, int i12, za zaVar, l1.n nVar, int i13) {
        int i14;
        int i15;
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1148055889);
        if ((i13 & 6) == 0) {
            i14 = (sVar2.f(rVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 = i11;
            i14 |= sVar2.d(i15) ? 32 : 16;
        } else {
            i15 = i11;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? sVar2.f(ybVar) : sVar2.h(ybVar) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= sVar2.d(i12) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= sVar2.f(zaVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((i14 & 9363) == 9362 && sVar2.F()) {
            sVar2.W();
            sVar = sVar2;
        } else {
            boolean z11 = ybVar.f() == i12;
            String strI = i1.p.i(sVar2, i12 == 0 ? R.string.m3c_time_picker_hour_selection : R.string.m3c_time_picker_minute_selection);
            long j11 = z11 ? zaVar.f31439k : zaVar.f31440l;
            long j12 = z11 ? zaVar.m : zaVar.f31441n;
            boolean zF = sVar2.f(strI);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = new c6.o(strI, 9);
                sVar2.o0(objQ);
            }
            z1.r rVarB = g3.r.b(rVar, true, (fz.c) objQ);
            g2.w0 w0VarA = y7.a(k1.k0.f37597v, sVar2);
            boolean z12 = ((i14 & 7168) == 2048) | ((i14 & 896) == 256 || ((i14 & 512) != 0 && sVar2.h(ybVar)));
            Object objQ2 = sVar2.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new pb(i12, ybVar);
                sVar2.o0(objQ2);
            }
            sVar = sVar2;
            i9.b(z11, (fz.a) objQ2, rVarB, false, w0VarA, j11, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, null, t1.e.d(-1477282471, new qb(i12, ybVar, i15, j12), sVar2), sVar, 0, 1992);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new rb(rVar, i11, ybVar, i12, zaVar, i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object p(n nVar, float f5, float f11, float f12, boolean z11, long j11, xy.c cVar) {
        ub ubVar;
        float f13;
        float fRint;
        boolean z12;
        n nVar2;
        n nVar3;
        boolean z13;
        if (cVar instanceof ub) {
            ubVar = (ub) cVar;
            int i11 = ubVar.f31171d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                ubVar.f31171d = i11 - Integer.MIN_VALUE;
            } else {
                ubVar = new ub(cVar);
            }
        } else {
            ubVar = new ub(cVar);
        }
        ub ubVar2 = ubVar;
        Object obj = ubVar2.f31170c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = ubVar2.f31171d;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i12 != 0) {
            if (i12 == 1) {
                boolean z14 = ubVar2.f31169b;
                n nVar4 = ubVar2.f31168a;
                com.bumptech.glide.e.F(obj);
                z12 = z14;
                nVar2 = nVar4;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z13 = ubVar2.f31169b;
                nVar3 = ubVar2.f31168a;
                com.bumptech.glide.e.F(obj);
            }
            z12 = z13;
            nVar2 = nVar3;
            if (z12) {
                nVar2.e(1);
            }
            return b0Var;
        }
        com.bumptech.glide.e.F(obj);
        float fAtan2 = ((float) Math.atan2(f11 - ((int) (j11 & 4294967295L)), f5 - ((int) (j11 >> 32)))) - 1.5707964f;
        if (fAtan2 < CropImageView.DEFAULT_ASPECT_RATIO) {
            fAtan2 += 6.2831855f;
        }
        if (nVar.f30706a.f() == 1) {
            f13 = 0.10471976f;
            fRint = ((float) Math.rint((fAtan2 / 0.10471976f) / 5.0f)) * 5.0f;
        } else {
            f13 = 0.5235988f;
            fRint = (float) Math.rint(fAtan2 / 0.5235988f);
        }
        float f14 = fRint * f13;
        r(nVar, f5, f11, f12, j11);
        ubVar2.f31168a = nVar;
        z12 = z11;
        ubVar2.f31169b = z12;
        ubVar2.f31171d = 1;
        d0.o1 o1Var = nVar.f30710e;
        d0.l1 l1Var = d0.l1.UserInput;
        m mVar = new m(nVar, f14, true, null);
        o1Var.getClass();
        Object objL = rz.e0.l(new av.e(l1Var, o1Var, mVar, (vy.d) null), ubVar2);
        if (objL != aVar) {
            objL = b0Var;
        }
        if (objL != aVar) {
            nVar2 = nVar;
        }
        return aVar;
        if (nVar2.f30706a.f() == 0 && z12) {
            ubVar2.f31168a = nVar2;
            ubVar2.f31169b = z12;
            ubVar2.f31171d = 2;
            if (rz.e0.m(100L, ubVar2) != aVar) {
                nVar3 = nVar2;
                z13 = z12;
                z12 = z13;
                nVar2 = nVar3;
            }
            return aVar;
        }
        if (z12) {
            nVar2.e(1);
        }
        return b0Var;
    }

    public static final long q(n nVar) {
        float f5 = 2;
        float f11 = k1.k0.f37583g / f5;
        yb ybVar = nVar.f30706a;
        float f12 = (((ybVar.g() && ybVar.i() && ybVar.f() == 0) ? f31262b : f31261a) - f11) + f11;
        float fCos = ((float) Math.cos(((Number) nVar.f30709d.d()).floatValue())) * f12;
        float f13 = k1.k0.f37578b / f5;
        return (((long) Float.floatToRawIntBits(fCos + f13)) << 32) | (((long) Float.floatToRawIntBits((f12 * ((float) Math.sin(((Number) nVar.f30709d.d()).floatValue()))) + f13)) & 4294967295L);
    }

    public static final void r(yb ybVar, float f5, float f11, float f12, long j11) {
        if (ybVar.f() == 0 && ybVar.g()) {
            ybVar.a(((float) Math.hypot((double) (((float) ((int) (j11 >> 32))) - f5), (double) (((float) ((int) (j11 & 4294967295L))) - f11))) < f12);
        }
    }

    public static final String s(int i11, boolean z11, int i12, l1.n nVar) {
        int i13;
        if (i11 == 1) {
            i13 = R.string.m3c_time_picker_minute_suffix;
        } else {
            i13 = z11 ? R.string.m3c_time_picker_hour_24h_suffix : R.string.m3c_time_picker_hour_suffix;
        }
        Object[] objArr = {Integer.valueOf(i12)};
        String strI = i1.p.i(nVar, i13);
        Locale locale = ((Configuration) ((l1.s) nVar).j(AndroidCompositionLocals_androidKt.f1199a)).getLocales().get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
        return String.format(locale, strI, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }
}
