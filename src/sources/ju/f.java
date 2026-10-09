package ju;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bt.t5;
import dt.d1;
import h1.s1;
import h1.u4;
import h1.v1;
import hh.y;
import l1.c3;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1 f37367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s1 f37368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c3 f37369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c3 f37370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c3 f37371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c3 f37372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c3 f37373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c3 f37374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c3 f37375i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c3 f37376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c3 f37377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c3 f37378l;

    static {
        long j11 = a.f37291a;
        long j12 = a.f37294b;
        long j13 = a.f37297c;
        long j14 = a.f37300d;
        long j15 = a.f37303e;
        long j16 = a.f37305f;
        long j17 = a.f37307g;
        long j18 = a.f37310h;
        long j19 = a.f37313i;
        long j21 = a.f37316j;
        long j22 = a.f37319k;
        long j23 = a.f37322l;
        long j24 = a.m;
        long j25 = a.f37327n;
        long j26 = a.f37330o;
        long j27 = a.f37333p;
        long j28 = a.f37336q;
        long j29 = a.f37339r;
        long j30 = a.f37342s;
        long j31 = a.f37345t;
        long j32 = a.f37348u;
        long j33 = a.f37351v;
        long j34 = a.f37354w;
        long j35 = a.f37356x;
        long j36 = a.f37358y;
        long j37 = a.f37360z;
        long j38 = a.A;
        long j39 = a.B;
        long j40 = a.C;
        long j41 = a.D;
        long j42 = a.E;
        f37367a = v1.e(j11, j12, j13, j14, j39, j15, j16, j17, j18, j19, j21, j22, j23, j28, j29, j30, j31, j32, j33, j37, j38, j24, j25, j26, j27, j34, j35, j36, j41, a.G, a.H, a.I, a.F, j42, j40, 524288, 0);
        long j43 = a.f37301d0;
        long j44 = a.f37304e0;
        long j45 = a.f37306f0;
        long j46 = a.f37308g0;
        long j47 = a.f37311h0;
        long j48 = a.f37314i0;
        long j49 = a.f37317j0;
        long j50 = a.f37320k0;
        long j51 = a.f37323l0;
        long j52 = a.f37325m0;
        long j53 = a.f37328n0;
        long j54 = a.f37331o0;
        long j55 = a.f37334p0;
        long j56 = a.f37337q0;
        long j57 = a.f37340r0;
        long j58 = a.f37343s0;
        long j59 = a.f37346t0;
        long j60 = a.f37349u0;
        long j61 = a.f37352v0;
        long j62 = a.f37355w0;
        long j63 = a.f37357x0;
        long j64 = a.f37359y0;
        long j65 = a.f37361z0;
        long j66 = a.A0;
        long j67 = a.B0;
        long j68 = a.C0;
        long j69 = a.D0;
        long j70 = a.E0;
        long j71 = a.F0;
        long j72 = a.G0;
        long j73 = a.H0;
        f37368b = new s1(j43, j44, j45, j46, j70, j47, j48, j49, j50, j51, j52, j53, j54, j59, j60, j61, j62, j63, j64, j43, j68, j69, j55, j56, j57, j58, j65, j66, j67, j72, j71, a.J0, a.K0, a.L0, a.I0, j73);
        f37369c = new c3(new y(24));
        f37370d = new c3(new y(25));
        f37371e = new c3(new y(26));
        f37372f = new c3(new y(27));
        f37373g = new c3(new y(28));
        f37374h = new c3(new y(29));
        f37375i = new c3(new d(0));
        f37376j = new c3(new d(1));
        f37377k = new c3(new d(2));
        f37378l = new c3(new d(2));
    }

    public static final void a(boolean z11, t1.d dVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1284521980);
        int i12 = i11 | 2;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                z11 = d0.n.t(sVar);
            } else {
                sVar.W();
            }
            boolean z12 = z11;
            sVar.q();
            s1 s1Var = z12 ? f37368b : f37367a;
            Boolean boolValueOf = Boolean.valueOf(z12);
            boolean zG = sVar.g(z12);
            Object objQ = sVar.Q();
            vy.d dVar2 = null;
            l1.g gVar = m.f39353a;
            if (zG || objQ == gVar) {
                objQ = new e(z12, (vy.d) null);
                sVar.o0(objQ);
            }
            t.f((fz.e) objQ, boolValueOf, sVar);
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            kotlin.jvm.internal.m.d(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            Window window = activity.getWindow();
            View decorView = window.getDecorView();
            kotlin.jvm.internal.m.e(decorView, "getDecorView(...)");
            Boolean boolValueOf2 = Boolean.valueOf(z12);
            boolean zH = sVar.h(window) | sVar.h(decorView) | sVar.g(z12);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                t5 t5Var = new t5(window, decorView, z12, dVar2, 4);
                sVar.o0(t5Var);
                objQ2 = t5Var;
            }
            t.f((fz.e) objQ2, boolValueOf2, sVar);
            DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
            kotlin.jvm.internal.m.e(displayMetrics, "getDisplayMetrics(...)");
            int i13 = activity.getResources().getConfiguration().smallestScreenWidthDp;
            v3.c cVar = (v3.c) sVar.j(g1.f58547h);
            int i14 = displayMetrics.widthPixels;
            int i15 = displayMetrics.heightPixels;
            int iMin = Math.min(i14, i15);
            u4.a(s1Var, null, g.f37379a, t1.e.d(-690158416, new fu.n(28, new v3.d((i13 < 600 && Math.max(i14, i15) <= 1920 && iMin <= 1080) ? iMin / 400.0f : cVar.getDensity(), cVar.Z()), dVar), sVar), sVar, 3456);
            z11 = z12;
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d1(z11, dVar, i11, 2);
        }
    }
}
