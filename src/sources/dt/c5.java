package dt;

import android.webkit.WebView;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c5 implements fz.f {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23711a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f23712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f23714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f23715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f23716f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f23717t;

    public /* synthetic */ c5(l1.b1 b1Var, boolean z11, l1.b1 b1Var2, rz.b0 b0Var, fz.c cVar, boolean z12, l1.b1 b1Var3) {
        this.f23712b = b1Var;
        this.f23713c = z11;
        this.f23714d = b1Var2;
        this.f23715e = b0Var;
        this.H = cVar;
        this.f23716f = z12;
        this.f23717t = b1Var3;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        final l1.b1 b1Var;
        long j11;
        long j12;
        Object obj5;
        final l1.b1 b1Var2;
        long j13;
        long j14;
        switch (this.f23711a) {
            case 0:
                final vt.n0 n0Var = (vt.n0) this.H;
                a0.k0 AnimatedVisibility = (a0.k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                l1.s sVar = (l1.s) ((l1.n) obj2);
                Object objQ = sVar.Q();
                l1.g gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = new b2(this.f23712b, (vy.d) null, 2);
                    sVar.o0(objQ);
                }
                qy.b0 b0Var = qy.b0.f48488a;
                l1.t.f((fz.e) objQ, b0Var, sVar);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
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
                l1.t.J(y2.j.f56917f, uVarA, sVar);
                l1.t.J(y2.j.f56916e, q1VarL, sVar);
                y2.h hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar);
                k2.b bVarY = se.k.y(R.drawable.ic_font_plus, sVar, 0);
                final rz.b0 b0Var2 = this.f23715e;
                boolean zH = sVar.h(b0Var2) | sVar.h(n0Var);
                Object objQ2 = sVar.Q();
                l1.b1 b1Var3 = this.f23714d;
                final l1.b1 b1Var4 = this.f23717t;
                if (zH || objQ2 == gVar) {
                    b1Var = b1Var3;
                    final int i11 = 0;
                    obj4 = new fz.a() { // from class: dt.d5
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i11) {
                                case 0:
                                    WebView webView = (WebView) b1Var.getValue();
                                    if (webView != null) {
                                        l1.b1 b1Var5 = b1Var4;
                                        if (((Number) b1Var5.getValue()).intValue() < 150) {
                                            int iIntValue = ((Number) b1Var5.getValue()).intValue() + 10;
                                            int i12 = iIntValue <= 150 ? iIntValue : 150;
                                            b1Var5.setValue(Integer.valueOf(i12));
                                            webView.getSettings().setSupportZoom(true);
                                            webView.getSettings().setTextZoom(i12);
                                            rz.e0.B(b0Var2, null, null, new g5(n0Var, i12, null, 0), 3);
                                        }
                                    }
                                    break;
                                default:
                                    WebView webView2 = (WebView) b1Var.getValue();
                                    if (webView2 != null) {
                                        l1.b1 b1Var6 = b1Var4;
                                        if (((Number) b1Var6.getValue()).intValue() > 50) {
                                            int iIntValue2 = ((Number) b1Var6.getValue()).intValue() - 10;
                                            int i13 = iIntValue2 >= 50 ? iIntValue2 : 50;
                                            b1Var6.setValue(Integer.valueOf(i13));
                                            webView2.getSettings().setSupportZoom(true);
                                            webView2.getSettings().setTextZoom(i13);
                                            rz.e0.B(b0Var2, null, null, new g5(n0Var, i13, null, 1), 3);
                                        }
                                    }
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(obj4);
                } else {
                    obj4 = objQ2;
                    b1Var = b1Var3;
                }
                boolean z11 = this.f23713c;
                z1.r rVarQ = iu.k.q(6, 6, (fz.a) obj4, sVar, oVar, z11);
                if (z11) {
                    sVar.d0(-1863239317);
                    j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31017a;
                } else {
                    sVar.d0(-1863238069);
                    j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).A;
                }
                sVar.p(false);
                h1.r4.b(bVarY, null, rVarQ, j11, sVar, 48, 0);
                k2.b bVarY2 = se.k.y(R.drawable.ic_font_reduse, sVar, 0);
                z1.r rVarE = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                boolean zH2 = sVar.h(b0Var2) | sVar.h(n0Var);
                Object objQ3 = sVar.Q();
                if (zH2 || objQ3 == gVar) {
                    final int i12 = 1;
                    fz.a aVar = new fz.a() { // from class: dt.d5
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i12) {
                                case 0:
                                    WebView webView = (WebView) b1Var.getValue();
                                    if (webView != null) {
                                        l1.b1 b1Var5 = b1Var4;
                                        if (((Number) b1Var5.getValue()).intValue() < 150) {
                                            int iIntValue = ((Number) b1Var5.getValue()).intValue() + 10;
                                            int i13 = iIntValue <= 150 ? iIntValue : 150;
                                            b1Var5.setValue(Integer.valueOf(i13));
                                            webView.getSettings().setSupportZoom(true);
                                            webView.getSettings().setTextZoom(i13);
                                            rz.e0.B(b0Var2, null, null, new g5(n0Var, i13, null, 0), 3);
                                        }
                                    }
                                    break;
                                default:
                                    WebView webView2 = (WebView) b1Var.getValue();
                                    if (webView2 != null) {
                                        l1.b1 b1Var6 = b1Var4;
                                        if (((Number) b1Var6.getValue()).intValue() > 50) {
                                            int iIntValue2 = ((Number) b1Var6.getValue()).intValue() - 10;
                                            int i14 = iIntValue2 >= 50 ? iIntValue2 : 50;
                                            b1Var6.setValue(Integer.valueOf(i14));
                                            webView2.getSettings().setSupportZoom(true);
                                            webView2.getSettings().setTextZoom(i14);
                                            rz.e0.B(b0Var2, null, null, new g5(n0Var, i14, null, 1), 3);
                                        }
                                    }
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(aVar);
                    objQ3 = aVar;
                }
                boolean z12 = this.f23716f;
                z1.r rVarQ2 = iu.k.q(6, 6, (fz.a) objQ3, sVar, rVarE, z12);
                if (z12) {
                    sVar.d0(-1863198613);
                    j12 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31017a;
                } else {
                    sVar.d0(-1863197365);
                    j12 = ((h1.s1) sVar.j(h1.v1.f31180a)).A;
                }
                sVar.p(false);
                h1.r4.b(bVarY2, null, rVarQ2, j12, sVar, 48, 0);
                sVar.p(true);
                return b0Var;
            default:
                final fz.c cVar = (fz.c) this.H;
                a0.k0 AnimatedVisibility2 = (a0.k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility2, "$this$AnimatedVisibility");
                l1.s sVar2 = (l1.s) ((l1.n) obj2);
                Object objQ4 = sVar2.Q();
                l1.g gVar2 = l1.m.f39353a;
                if (objQ4 == gVar2) {
                    objQ4 = new b2(this.f23712b, (vy.d) null, 11);
                    sVar2.o0(objQ4);
                }
                qy.b0 b0Var3 = qy.b0.f48488a;
                l1.t.f((fz.e) objQ4, b0Var3, sVar2);
                j0.u uVarA2 = j0.t.a(j0.i.g(16), z1.c.O, sVar2, 6);
                int iHashCode2 = Long.hashCode(sVar2.T);
                l1.q1 q1VarL2 = sVar2.l();
                z1.o oVar2 = z1.o.f58481a;
                z1.r rVarC2 = z1.a.c(sVar2, oVar2);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar2);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA2, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                y2.h hVar2 = y2.j.f56918g;
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                }
                l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                k2.b bVarY3 = se.k.y(R.drawable.ic_font_plus, sVar2, 0);
                final l1.b1 b1Var5 = this.f23714d;
                boolean zF = sVar2.f(b1Var5);
                final rz.b0 b0Var4 = this.f23715e;
                boolean zH3 = zF | sVar2.h(b0Var4) | sVar2.f(cVar);
                Object objQ5 = sVar2.Q();
                l1.b1 b1Var6 = this.f23717t;
                if (zH3 || objQ5 == gVar2) {
                    b1Var2 = b1Var6;
                    final int i13 = 0;
                    obj5 = new fz.a() { // from class: ys.g3
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i13) {
                                case 0:
                                    WebView webView = (WebView) b1Var2.getValue();
                                    if (webView != null) {
                                        l1.b1 b1Var7 = b1Var5;
                                        if (((Number) b1Var7.getValue()).intValue() < 150) {
                                            int iIntValue = ((Number) b1Var7.getValue()).intValue() + 10;
                                            int i14 = iIntValue <= 150 ? iIntValue : 150;
                                            b1Var7.setValue(Integer.valueOf(i14));
                                            webView.getSettings().setSupportZoom(true);
                                            webView.getSettings().setTextZoom(i14);
                                            rz.e0.B(b0Var4, null, null, new c0(cVar, i14, null, 1), 3);
                                        }
                                    }
                                    break;
                                default:
                                    WebView webView2 = (WebView) b1Var2.getValue();
                                    if (webView2 != null) {
                                        l1.b1 b1Var8 = b1Var5;
                                        if (((Number) b1Var8.getValue()).intValue() > 50) {
                                            int iIntValue2 = ((Number) b1Var8.getValue()).intValue() - 10;
                                            int i15 = iIntValue2 >= 50 ? iIntValue2 : 50;
                                            b1Var8.setValue(Integer.valueOf(i15));
                                            webView2.getSettings().setSupportZoom(true);
                                            webView2.getSettings().setTextZoom(i15);
                                            rz.e0.B(b0Var4, null, null, new c0(cVar, i15, null, 2), 3);
                                        }
                                    }
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar2.o0(obj5);
                } else {
                    obj5 = objQ5;
                    b1Var2 = b1Var6;
                }
                boolean z13 = this.f23713c;
                z1.r rVarQ3 = iu.k.q(6, 6, (fz.a) obj5, sVar2, oVar2, z13);
                if (z13) {
                    sVar2.d0(-949203022);
                    j13 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                } else {
                    sVar2.d0(-949201774);
                    j13 = ((h1.s1) sVar2.j(h1.v1.f31180a)).A;
                }
                sVar2.p(false);
                h1.r4.b(bVarY3, null, rVarQ3, j13, sVar2, 48, 0);
                k2.b bVarY4 = se.k.y(R.drawable.ic_font_reduse, sVar2, 0);
                boolean zF2 = sVar2.f(b1Var5) | sVar2.h(b0Var4) | sVar2.f(cVar);
                Object objQ6 = sVar2.Q();
                if (zF2 || objQ6 == gVar2) {
                    final int i14 = 1;
                    fz.a aVar2 = new fz.a() { // from class: ys.g3
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    WebView webView = (WebView) b1Var2.getValue();
                                    if (webView != null) {
                                        l1.b1 b1Var7 = b1Var5;
                                        if (((Number) b1Var7.getValue()).intValue() < 150) {
                                            int iIntValue = ((Number) b1Var7.getValue()).intValue() + 10;
                                            int i15 = iIntValue <= 150 ? iIntValue : 150;
                                            b1Var7.setValue(Integer.valueOf(i15));
                                            webView.getSettings().setSupportZoom(true);
                                            webView.getSettings().setTextZoom(i15);
                                            rz.e0.B(b0Var4, null, null, new c0(cVar, i15, null, 1), 3);
                                        }
                                    }
                                    break;
                                default:
                                    WebView webView2 = (WebView) b1Var2.getValue();
                                    if (webView2 != null) {
                                        l1.b1 b1Var8 = b1Var5;
                                        if (((Number) b1Var8.getValue()).intValue() > 50) {
                                            int iIntValue2 = ((Number) b1Var8.getValue()).intValue() - 10;
                                            int i16 = iIntValue2 >= 50 ? iIntValue2 : 50;
                                            b1Var8.setValue(Integer.valueOf(i16));
                                            webView2.getSettings().setSupportZoom(true);
                                            webView2.getSettings().setTextZoom(i16);
                                            rz.e0.B(b0Var4, null, null, new c0(cVar, i16, null, 2), 3);
                                        }
                                    }
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar2.o0(aVar2);
                    objQ6 = aVar2;
                }
                boolean z14 = this.f23716f;
                z1.r rVarQ4 = iu.k.q(6, 6, (fz.a) objQ6, sVar2, oVar2, z14);
                if (z14) {
                    sVar2.d0(-949167630);
                    j14 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                } else {
                    sVar2.d0(-949166382);
                    j14 = ((h1.s1) sVar2.j(h1.v1.f31180a)).A;
                }
                sVar2.p(false);
                h1.r4.b(bVarY4, null, rVarQ4, j14, sVar2, 48, 0);
                sVar2.p(true);
                return b0Var3;
        }
    }

    public /* synthetic */ c5(l1.b1 b1Var, boolean z11, rz.b0 b0Var, vt.n0 n0Var, boolean z12, l1.b1 b1Var2, l1.b1 b1Var3) {
        this.f23712b = b1Var;
        this.f23713c = z11;
        this.f23715e = b0Var;
        this.H = n0Var;
        this.f23716f = z12;
        this.f23714d = b1Var2;
        this.f23717t = b1Var3;
    }
}
