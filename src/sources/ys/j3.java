package ys;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bt.w7;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import dt.b5;
import dt.c5;
import dt.f5;
import fr.p3;
import h1.a6;
import h1.k7;
import h1.ua;
import ko.Zea.ealNNtLp;
import mt.c4;
import rt.ld;
import rt.md;
import rt.nd;
import rt.qd;
import rt.we;
import rt.ye;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oz.o f58088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final oz.o f58089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final oz.o f58090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final oz.o f58091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final oz.o f58092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final oz.o f58093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f58094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f58095h;

    static {
        oz.p pVar = oz.p.IGNORE_CASE;
        f58088a = new oz.o("<html\\b", pVar);
        f58089b = new oz.o("<html\\b[^>]*>", pVar);
        f58090c = new oz.o("</html\\s*>", pVar);
        f58091d = new oz.o("</head\\s*>", pVar);
        f58092e = new oz.o("</body\\s*>", pVar);
        f58093f = new oz.o("<link\\b(?=[^>]*\\bhref\\s*=\\s*[\"'][^\"']*froala_style\\.min\\.css(?:\\?[^\"']*)?[\"'])[^>]*>", pVar);
        f58094g = "<meta charset=\"utf-8\">\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\n<style>\n    * {\n        font-family: sans-serif !important;\n    }\n\n    html {\n        user-select: none !important;\n    }\n\n    html, body {\n        margin: 0;\n        background: #FFFFFF;\n        font-size: 14px;\n    }\n\n    body {\n        padding: 8px;\n    }\n\n    table {\n        width: 100%;\n        background: #FFFFFF;\n        border-collapse: collapse;\n    }\n\n    td, th {\n        font-size: 14px;\n        border: 1px solid #E5E5E5;\n        padding: 6px;\n        box-sizing: border-box;\n    }\n\n    p {\n        margin: 6px 0;\n    }\n\n    .course-unit-tips-copyright {\n        padding: 16px;\n        color: #757575;\n        font-size: 12px;\n        text-align: center;\n    }\n</style>";
        f58095h = "<div class=\"course-unit-tips-copyright\">Copyright @ 2026 LingoDeer. All rights reserved.</div>";
    }

    public static final void a(int i11, fz.a onClickBilling, l1.n nVar, z1.r rVar) {
        int i12;
        kotlin.jvm.internal.m.f(onClickBilling, "onClickBilling");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1526719313);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickBilling) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            l1.c3 c3Var = h1.v1.f31180a;
            z1.r rVarG = d0.n.g(rVar, p3.A(ns.o.L(new g2.x(g2.x.c(((h1.s1) sVar.j(c3Var)).f31033p, CropImageView.DEFAULT_ASPECT_RATIO)), new g2.x(((h1.s1) sVar.j(c3Var)).f31033p), new g2.x(((h1.s1) sVar.j(c3Var)).f31033p), new g2.x(((h1.s1) sVar.j(c3Var)).f31033p))), null, 6);
            j0.u uVarA = j0.t.a(j0.i.f35306d, z1.c.P, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarG);
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
            b(onClickBilling, sVar, (i12 >> 3) & 14);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iv.s0(i11, onClickBilling, rVar);
        }
    }

    public static final void b(fz.a onClickBilling, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(onClickBilling, "onClickBilling");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1818333428);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickBilling) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            k2.b bVarY = se.k.y(R.drawable.gem_premium_deer, sVar, 0);
            z1.o oVar = z1.o.f58481a;
            d0.n.c(bVarY, null, j0.e2.p(oVar, 72, 79), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
            j0.c.g(sVar, j0.e2.g(oVar, 6));
            float f5 = 16;
            h(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, f5, f5, 1), sVar, 0);
            iu.k.k(((i12 << 3) & 112) | 6, onClickBilling, ((Boolean) xt.b.f56284f.getValue()).booleanValue() ? ep.a.m(sVar, 1844251712, R.string.try_for_free, sVar, false) : ep.a.m(sVar, 1844335443, R.string.gems_pay_wall_premium_btn, sVar, false), sVar, j0.e2.e(j0.c.E(j0.c.A(oVar, f5), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 52, 7), 1.0f));
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.m(onClickBilling, i11, 11, (byte) 0);
        }
    }

    public static final void c(long j11, fz.a onDismissRequest, fz.a onClickBilling, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        kotlin.jvm.internal.m.f(onClickBilling, "onClickBilling");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1105136015);
        int i12 = i11 | (sVar2.e(j11) ? 4 : 2) | (sVar2.h(onClickBilling) ? 256 : 128);
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            sVar = sVar2;
            a6.a(onDismissRequest, null, a6.f(6, 2, null, sVar2), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-1158959342, new bt.n2(j11, onDismissRequest, onClickBilling), sVar2), sVar, 6, 384, 4090);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h3(j11, onDismissRequest, onClickBilling, i11);
        }
    }

    public static final void d(long j11, z1.r rVar, qd qdVar, fz.a onClickBilling, l1.n nVar, int i11) {
        qd qdVar2;
        int i12;
        qd qdVar3;
        kotlin.jvm.internal.m.f(onClickBilling, "onClickBilling");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(416953703);
        int i13 = i11 | (sVar.e(j11) ? 4 : 2) | 1072 | (sVar.h(onClickBilling) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            sVar.Y();
            int i14 = i11 & 1;
            l1.g gVar = l1.m.f39353a;
            if (i14 == 0 || sVar.C()) {
                String strJ = j(j11, false);
                boolean z11 = (i13 & 14) == 4;
                Object objQ = sVar.Q();
                if (z11 || objQ == gVar) {
                    objQ = new b3(j11, 1);
                    sVar.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(qd.class), current.getViewModelStore(), strJ, i20.a.a(current), null, q10.b.a(sVar), aVar);
                sVar.p(false);
                i12 = i13 & (-7169);
                qdVar3 = (qd) viewModelA;
            } else {
                sVar.W();
                i12 = i13 & (-7169);
                qdVar3 = qdVar;
            }
            sVar.q();
            nd ndVar = (nd) l1.t.o(qdVar3.K, sVar).getValue();
            boolean zH = sVar.h(qdVar3);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new c4(1, qdVar3, qd.class, "updateWebViewTextZoom", "updateWebViewTextZoom(I)V", 0, 24);
                sVar.o0(objQ2);
            }
            e(ndVar, rVar, onClickBilling, (fz.c) ((mz.e) objQ2), sVar, 48 | ((i12 >> 6) & 896));
            qdVar2 = qdVar3;
        } else {
            sVar.W();
            qdVar2 = qdVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w7(j11, rVar, qdVar2, onClickBilling, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:115:0x0332  */
    /* JADX WARN: Code duplicated, block: B:118:0x0352  */
    /* JADX WARN: Code duplicated, block: B:121:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:123:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:126:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:127:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:132:0x0404  */
    /* JADX WARN: Code duplicated, block: B:137:0x0435  */
    public static final void e(nd uiState, z1.r rVar, fz.a aVar, fz.c onTextZoomChanged, l1.n nVar, int i11) {
        int i12;
        l1.s sVar;
        String strK;
        String strK2;
        l1.b1 b1Var;
        y2.h hVar;
        boolean zT;
        z1.o oVar;
        boolean zF;
        Object objQ;
        l1.b1 b1Var2;
        j0.r rVar2;
        Object objQ2;
        Object objQ3;
        int i13;
        boolean z11;
        boolean z12;
        Object objQ4;
        int iHashCode;
        fz.a onClickBilling = aVar;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        kotlin.jvm.internal.m.f(onClickBilling, "onClickBilling");
        kotlin.jvm.internal.m.f(onTextZoomChanged, "onTextZoomChanged");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1546327552);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar2.f(uiState) : sVar2.h(uiState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(onClickBilling) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(onTextZoomChanged) ? 2048 : 1024;
        }
        if (!sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
            sVar = sVar2;
            sVar.W();
        } else if (uiState.equals(ld.f50033a)) {
            sVar2.d0(37916418);
            tv.a.d((i12 >> 3) & 14, 0, sVar2, rVar);
            sVar2.p(false);
            sVar = sVar2;
        } else {
            if (!(uiState instanceof md)) {
                throw nv.p.x(sVar2, 37923303, false);
            }
            sVar2.d0(1175753866);
            md mdVar = (md) uiState;
            int i14 = mdVar.f50097d;
            String tipsContent = mdVar.f50094a;
            l1.c3 c3Var = h1.v1.f31180a;
            long j11 = ((h1.s1) sVar2.j(c3Var)).f31033p;
            boolean z13 = mdVar.f50098e;
            boolean zF2 = sVar2.f(tipsContent);
            Object objQ5 = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF2 || objQ5 == gVar) {
                kotlin.jvm.internal.m.f(tipsContent, "tipsContent");
                String strG = f58093f.g(tipsContent);
                boolean zA = f58088a.a(strG);
                String str = f58095h;
                if (zA) {
                    oz.o oVar2 = f58091d;
                    if (oVar2.a(strG)) {
                        strK = k(oVar2, strG, new c3(1));
                    } else {
                        strK = k(f58089b, strG, new c3(2));
                    }
                    oz.o oVar3 = f58092e;
                    if (oVar3.a(strK)) {
                        strK2 = k(oVar3, strK, new c3(3));
                    } else {
                        oz.o oVar4 = f58090c;
                        strK2 = oVar4.a(strK) ? k(oVar4, strK, new c3(4)) : ep.a.D(strK, "\n", str);
                    }
                } else {
                    StringBuilder sbS = defpackage.e.s("\n            <!DOCTYPE html>\n            <html>\n            <head>\n                ", f58094g, "\n            </head>\n            <body>\n                ", strG, "\n                ");
                    sbS.append(str);
                    sbS.append("\n            </body>\n            </html>\n        ");
                    strK2 = oz.r.g0(sbS.toString());
                }
                objQ5 = strK2;
                sVar2.o0(objQ5);
            }
            String str2 = (String) objQ5;
            Object objQ6 = sVar2.Q();
            if (objQ6 == gVar) {
                objQ6 = l1.t.B(null);
                sVar2.o0(objQ6);
            }
            l1.b1 b1Var3 = (l1.b1) objQ6;
            Object objQ7 = sVar2.Q();
            if (objQ7 == gVar) {
                objQ7 = l1.t.q(sVar2);
                sVar2.o0(objQ7);
            }
            rz.b0 b0Var = (rz.b0) objQ7;
            Object objQ8 = sVar2.Q();
            if (objQ8 == gVar) {
                objQ8 = l1.t.B(Boolean.TRUE);
                sVar2.o0(objQ8);
            }
            l1.b1 b1Var4 = (l1.b1) objQ8;
            boolean zD = sVar2.d(i14);
            Object objQ9 = sVar2.Q();
            if (zD || objQ9 == gVar) {
                objQ9 = l1.t.B(Integer.valueOf(hz.b.l(i14, 50, 150)));
                sVar2.o0(objQ9);
            }
            l1.b1 b1Var5 = (l1.b1) objQ9;
            boolean zD2 = sVar2.d(((Number) b1Var5.getValue()).intValue());
            Object objQ10 = sVar2.Q();
            if (zD2 || objQ10 == gVar) {
                objQ10 = Boolean.valueOf(((Number) b1Var5.getValue()).intValue() < 150);
                sVar2.o0(objQ10);
            }
            boolean zBooleanValue = ((Boolean) objQ10).booleanValue();
            boolean zD3 = sVar2.d(((Number) b1Var5.getValue()).intValue());
            Object objQ11 = sVar2.Q();
            if (zD3 || objQ11 == gVar) {
                objQ11 = Boolean.valueOf(((Number) b1Var5.getValue()).intValue() > 50);
                sVar2.o0(objQ11);
            }
            boolean zBooleanValue2 = ((Boolean) objQ11).booleanValue();
            z1.r rVarH = d0.n.h(rVar, ((h1.s1) sVar2.j(c3Var)).f31033p, g2.f0.f28556b);
            Object objQ12 = sVar2.Q();
            if (objQ12 == gVar) {
                objQ12 = new f5(2, b1Var4);
                sVar2.o0(objQ12);
            }
            z1.r rVarA = s2.g0.a(rVarH, qy.b0.f48488a, (PointerInputEventHandler) objQ12);
            z1.j jVar = z1.c.f58463a;
            w2.q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarA);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, q0VarD, sVar2);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar2);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar2.S) {
                b1Var = b1Var4;
            } else {
                b1Var = b1Var4;
                if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                }
                hVar = y2.j.f56915d;
                l1.t.J(hVar, rVarC, sVar2);
                zT = d0.n.t(sVar2);
                sVar2.a0(349959709, str2);
                wg.r rVarA2 = wg.t.a(str2, sVar2, 4);
                oVar = z1.o.f58481a;
                z1.r rVarV = j0.c.v(j0.e2.d(oVar, 1.0f));
                zF = sVar2.f(b1Var5) | sVar2.e(j11) | sVar2.g(zT);
                objQ = sVar2.Q();
                if (!zF || objQ == gVar) {
                    b1Var2 = b1Var5;
                    objQ = new b5(j11, zT, b1Var3, b1Var2, b1Var, 1);
                    sVar2.o0(objQ);
                } else {
                    b1Var2 = b1Var5;
                }
                qx.p.g(rVarA2, rVarV, false, null, (fz.c) objQ, null, null, null, sVar2, 0, 492);
                sVar2.p(false);
                boolean zBooleanValue3 = ((Boolean) b1Var.getValue()).booleanValue();
                z1.j jVar2 = z1.c.K;
                rVar2 = j0.r.f35391a;
                z1.r rVarE = j0.c.E(j0.c.v(rVar2.a(oVar, jVar2)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, 32, 3);
                a0.l1 l1VarE = a0.f1.e(null, 3);
                objQ2 = sVar2.Q();
                if (objQ2 == gVar) {
                    objQ2 = new b0.k2(29);
                    sVar2.o0(objQ2);
                }
                a0.l1 l1VarA = l1VarE.a(a0.f1.r((fz.c) objQ2, 1));
                a0.m1 m1VarF = a0.f1.f(null, 3);
                objQ3 = sVar2.Q();
                if (objQ3 == gVar) {
                    objQ3 = new b0.k2(29);
                    sVar2.o0(objQ3);
                }
                i13 = i12;
                a0.j0.d(zBooleanValue3, rVarE, l1VarA, m1VarF.a(a0.f1.w((fz.c) objQ3, 1)), null, t1.e.d(2086800865, new c5(b1Var, zBooleanValue, b1Var2, b0Var, onTextZoomChanged, zBooleanValue2, b1Var3), sVar2), sVar2, 200064, 16);
                sVar = sVar2;
                if (z13) {
                    sVar.d0(-2029767263);
                    z1.r rVarD = j0.e2.d(oVar, 1.0f);
                    objQ4 = sVar.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new d(5);
                        sVar.o0(objQ4);
                    }
                    z1.r rVarQ = iu.k.q(24582, 7, (fz.a) objQ4, sVar, rVarD, false);
                    z11 = false;
                    w2.q0 q0VarD2 = j0.o.d(jVar, false);
                    iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(sVar, rVarQ);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar2, q0VarD2, sVar);
                    l1.t.J(hVar3, q1VarL2, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                    }
                    l1.t.J(hVar, rVarC2, sVar);
                    onClickBilling = aVar;
                    a((i13 >> 3) & 112, onClickBilling, sVar, rVar2.a(j0.e2.c(j0.e2.e(oVar, 1.0f), 0.8f), z1.c.H));
                    z12 = true;
                    sVar.p(true);
                } else {
                    onClickBilling = aVar;
                    z11 = false;
                    z12 = true;
                    sVar.d0(-2046530327);
                }
                sVar.p(z11);
                sVar.p(z12);
                sVar.p(z11);
            }
            defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
            hVar = y2.j.f56915d;
            l1.t.J(hVar, rVarC, sVar2);
            zT = d0.n.t(sVar2);
            sVar2.a0(349959709, str2);
            wg.r rVarA3 = wg.t.a(str2, sVar2, 4);
            oVar = z1.o.f58481a;
            z1.r rVarV2 = j0.c.v(j0.e2.d(oVar, 1.0f));
            zF = sVar2.f(b1Var5) | sVar2.e(j11) | sVar2.g(zT);
            objQ = sVar2.Q();
            if (zF) {
                b1Var2 = b1Var5;
                objQ = new b5(j11, zT, b1Var3, b1Var2, b1Var, 1);
                sVar2.o0(objQ);
            } else {
                b1Var2 = b1Var5;
                objQ = new b5(j11, zT, b1Var3, b1Var2, b1Var, 1);
                sVar2.o0(objQ);
            }
            qx.p.g(rVarA3, rVarV2, false, null, (fz.c) objQ, null, null, null, sVar2, 0, 492);
            sVar2.p(false);
            boolean zBooleanValue4 = ((Boolean) b1Var.getValue()).booleanValue();
            z1.j jVar3 = z1.c.K;
            rVar2 = j0.r.f35391a;
            z1.r rVarE2 = j0.c.E(j0.c.v(rVar2.a(oVar, jVar3)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, 32, 3);
            a0.l1 l1VarE2 = a0.f1.e(null, 3);
            objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = new b0.k2(29);
                sVar2.o0(objQ2);
            }
            a0.l1 l1VarA2 = l1VarE2.a(a0.f1.r((fz.c) objQ2, 1));
            a0.m1 m1VarF2 = a0.f1.f(null, 3);
            objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = new b0.k2(29);
                sVar2.o0(objQ3);
            }
            i13 = i12;
            a0.j0.d(zBooleanValue4, rVarE2, l1VarA2, m1VarF2.a(a0.f1.w((fz.c) objQ3, 1)), null, t1.e.d(2086800865, new c5(b1Var, zBooleanValue, b1Var2, b0Var, onTextZoomChanged, zBooleanValue2, b1Var3), sVar2), sVar2, 200064, 16);
            sVar = sVar2;
            if (z13) {
                sVar.d0(-2029767263);
                z1.r rVarD2 = j0.e2.d(oVar, 1.0f);
                objQ4 = sVar.Q();
                if (objQ4 == gVar) {
                    objQ4 = new d(5);
                    sVar.o0(objQ4);
                }
                z1.r rVarQ2 = iu.k.q(24582, 7, (fz.a) objQ4, sVar, rVarD2, false);
                z11 = false;
                w2.q0 q0VarD3 = j0.o.d(jVar, false);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL3 = sVar.l();
                z1.r rVarC3 = z1.a.c(sVar, rVarQ2);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar2, q0VarD3, sVar);
                l1.t.J(hVar3, q1VarL3, sVar);
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                }
                l1.t.J(hVar, rVarC3, sVar);
                onClickBilling = aVar;
                a((i13 >> 3) & 112, onClickBilling, sVar, rVar2.a(j0.e2.c(j0.e2.e(oVar, 1.0f), 0.8f), z1.c.H));
                z12 = true;
                sVar.p(true);
            } else {
                onClickBilling = aVar;
                z11 = false;
                z12 = true;
                sVar.d0(-2046530327);
            }
            sVar.p(z11);
            sVar.p(z12);
            sVar.p(z11);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a(uiState, rVar, onClickBilling, onTextZoomChanged, i11, 21);
        }
    }

    public static final void f(l1.b1 b1Var, boolean z11) {
        b1Var.setValue(Boolean.valueOf(z11));
    }

    public static final void g(final long j11, final boolean z11, final fz.a onBackClick, final fz.a onClickBilling, qd qdVar, l1.n nVar, final int i11) {
        l1.s sVar;
        final qd qdVar2;
        int i12;
        qd qdVar3;
        qd qdVar4;
        boolean z12;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onClickBilling, "onClickBilling");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1876788822);
        int i13 = i11 | (sVar2.e(j11) ? 4 : 2) | (sVar2.g(z11) ? 32 : 16) | (sVar2.h(onBackClick) ? 256 : 128) | (sVar2.h(onClickBilling) ? 2048 : 1024) | OSSConstants.DEFAULT_BUFFER_SIZE;
        if (sVar2.T(i13 & 1, (i13 & 9363) != 9362)) {
            sVar2.Y();
            int i14 = i11 & 1;
            l1.g gVar = l1.m.f39353a;
            if (i14 == 0 || sVar2.C()) {
                String strJ = j(j11, z11);
                boolean z13 = ((i13 & 14) == 4) | ((i13 & 112) == 32);
                Object objQ = sVar2.Q();
                if (z13 || objQ == gVar) {
                    objQ = new fz.a() { // from class: ys.i3
                        @Override // fz.a
                        public final Object invoke() {
                            return com.bumptech.glide.d.G(Long.valueOf(j11), Boolean.valueOf(z11));
                        }
                    };
                    sVar2.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                sVar2.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar2, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(qd.class), current.getViewModelStore(), strJ, i20.a.a(current), null, q10.b.a(sVar2), aVar);
                sVar2.p(false);
                i12 = i13 & (-57345);
                qdVar3 = (qd) viewModelA;
            } else {
                sVar2.W();
                i12 = i13 & (-57345);
                qdVar3 = qdVar;
            }
            sVar2.q();
            l1.b1 b1VarO = l1.t.o(qdVar3.K, sVar2);
            nd ndVar = (nd) b1VarO.getValue();
            md mdVar = ndVar instanceof md ? (md) ndVar : null;
            ye yeVar = mdVar != null ? mdVar.f50099f : null;
            we weVar = yeVar instanceof we ? (we) yeVar : null;
            boolean z14 = mdVar != null && mdVar.f50098e;
            boolean zF = sVar2.f(weVar != null ? weVar.f50597a : null);
            Object objQ2 = sVar2.Q();
            if (zF || objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ2);
            }
            l1.b1 b1Var = (l1.b1) objQ2;
            z1.r rVarD = j0.e2.d(z1.o.f58481a, 1.0f);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
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
            l1.t.J(y2.j.f56917f, uVarA, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar2);
            we weVar2 = weVar;
            iu.k.g(onBackClick, null, a.f57902w, null, t1.e.d(-1346903009, new bt.q0(weVar, z14, onClickBilling, b1Var, 4), sVar2), null, null, null, sVar2, ((i12 >> 6) & 14) | 24960, 234);
            sVar = sVar2;
            k7.g(null, 10, g2.x.f28621h, sVar, 432, 1);
            nd ndVar2 = (nd) b1VarO.getValue();
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.i1 i1Var = new j0.i1(1.0f, true);
            boolean zH = sVar.h(qdVar3);
            Object objQ3 = sVar.Q();
            if (zH || objQ3 == gVar) {
                qdVar4 = qdVar3;
                objQ3 = new c4(1, qdVar4, qd.class, "updateWebViewTextZoom", "updateWebViewTextZoom(I)V", 0, 25);
                sVar.o0(objQ3);
            } else {
                qdVar4 = qdVar3;
            }
            e(ndVar2, i1Var, onClickBilling, (fz.c) ((mz.e) objQ3), sVar, (i12 >> 3) & 896);
            sVar.p(true);
            if (!((Boolean) b1Var.getValue()).booleanValue() || weVar2 == null) {
                z12 = false;
                sVar.d0(447450584);
            } else {
                sVar.d0(470643203);
                String str = weVar2.f50597a;
                int i15 = weVar2.f50598b;
                boolean zF2 = sVar.f(b1Var);
                Object objQ4 = sVar.Q();
                if (zF2 || objQ4 == gVar) {
                    objQ4 = new d1(19, b1Var);
                    sVar.o0(objQ4);
                }
                z12 = false;
                a.C(i15, 0, (fz.a) objQ4, str, sVar);
            }
            sVar.p(z12);
            qdVar2 = qdVar4;
        } else {
            sVar = sVar2;
            sVar.W();
            qdVar2 = qdVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(j11, z11, onBackClick, onClickBilling, qdVar2, i11) { // from class: ys.f3

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f58006a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f58007b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ fz.a f58008c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ fz.a f58009d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ qd f58010e;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1);
                    j3.g(this.f58006a, this.f58007b, this.f58008c, this.f58009d, this.f58010e, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void h(z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1148815673);
        int i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            j0.u uVarA = j0.t.a(j0.i.g(8), z1.c.O, sVar, 6);
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
            sVar.d0(-209901559);
            String[] strArr = {ub.a.e0(sVar, R.string.welcome_billing_benefit_1), ub.a.e0(sVar, R.string.welcome_billing_benefit_2), ub.a.e0(sVar, R.string.welcome_billing_benefit_3), ub.a.e0(sVar, R.string.welcome_billing_benefit_4)};
            for (int i13 = 0; i13 < 4; i13++) {
                i(0, strArr[i13], sVar, null);
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.g(rVar, i11, 18);
        }
    }

    public static final void i(int i11, String text, l1.n nVar, z1.r rVar) {
        z1.r rVar2;
        kotlin.jvm.internal.m.f(text, "text");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1698798904);
        int i12 = i11 | 6 | (sVar.d(R.drawable.ep_subscription_check) ? 32 : 16) | (sVar.f(text) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            j0.a2 a2VarA = j0.z1.a(j0.i.g(8), z1.c.M, sVar, 54);
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
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            d0.n.c(se.k.y(R.drawable.ep_subscription_check, sVar, (i12 >> 3) & 14), null, j0.e2.n(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 19), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(((h1.s1) sVar.j(h1.v1.f31180a)).f31017a, 5), sVar, 432, 56);
            ua.b(text, null, 0L, fr.j3.A(14), null, n3.s.K, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, ((i12 >> 6) & 14) | 199680, 0, 131030);
            sVar = sVar;
            sVar.p(true);
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.a(rVar2, text, i11);
        }
    }

    public static final String k(oz.o oVar, String str, fz.c cVar) {
        oz.l lVarB = oVar.b(str);
        if (lVarB == null) {
            return str;
        }
        lz.g range = lVarB.b();
        CharSequence replacement = (CharSequence) cVar.invoke(lVarB);
        kotlin.jvm.internal.m.f(str, "<this>");
        kotlin.jvm.internal.m.f(range, "range");
        kotlin.jvm.internal.m.f(replacement, "replacement");
        return oz.q.T0(str, range.f40532a, range.f40533b + 1, replacement).toString();
    }

    public static final String j(long j11, boolean z11) {
        return z11 ? nv.p.m(j11, "course-unit-tips-", ealNNtLp.RZeqbNz) : defpackage.e.h(j11, "course-unit-tips-");
    }
}
