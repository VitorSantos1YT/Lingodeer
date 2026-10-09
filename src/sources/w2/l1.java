package w2;

import android.webkit.WebView;
import androidx.compose.ui.window.PopupLayout;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54540b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(Object obj, int i11) {
        super(0);
        this.f54539a = i11;
        this.f54540b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x016b A[LOOP:3: B:69:0x0135->B:79:0x016b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x016e A[SYNTHETIC] */
    @Override // fz.a
    public final Object invoke() {
        switch (this.f54539a) {
            case 0:
                m0 m0VarA = ((p1) this.f54540b).a();
                y2.i0 i0Var = m0VarA.f54542a;
                if (m0VarA.P != ((n1.e) ((n1.b) i0Var.p()).f43104b).f43114c) {
                    y.i0 i0Var2 = m0VarA.f54547f;
                    Object[] objArr = i0Var2.f56715c;
                    long[] jArr = i0Var2.f56713a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j11 = jArr[i11];
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((255 & j11) < 128) {
                                        ((f0) objArr[(i11 << 3) + i13]).f54487d = true;
                                    }
                                    j11 >>= 8;
                                }
                                if (i12 == 8) {
                                    if (i11 != length) {
                                        i11++;
                                    }
                                }
                            } else if (i11 != length) {
                                i11++;
                            }
                        }
                    }
                    if (i0Var.K != null) {
                        if (!i0Var.f56893j0.f56964e) {
                            y2.i0.W(i0Var, false, 7);
                        }
                    } else if (!i0Var.s()) {
                        y2.i0.Y(i0Var, false, 7);
                    }
                }
                return qy.b0.f48488a;
            case 1:
                WebView webView = (WebView) this.f54540b;
                if (webView != null) {
                    webView.goBack();
                }
                return qy.b0.f48488a;
            case 2:
                return (wg.i) ((wg.r) this.f54540b).f55163b.getValue();
            case 3:
                x2.d dVar = (x2.d) this.f54540b;
                n1.e eVar = dVar.f55756c;
                n1.e eVar2 = dVar.f55755b;
                n1.e eVar3 = dVar.f55758e;
                dVar.f55759f = false;
                HashSet hashSet = new HashSet();
                n1.e eVar4 = dVar.f55757d;
                Object[] objArr2 = eVar4.f43112a;
                int i14 = eVar4.f43114c;
                for (int i15 = 0; i15 < i14; i15++) {
                    y2.i0 i0Var3 = (y2.i0) objArr2[i15];
                    x2.h hVar = (x2.h) eVar3.f43112a[i15];
                    z1.q qVar = (z1.q) i0Var3.f56892i0.f50089g;
                    if (qVar.P) {
                        x2.d.b(qVar, hVar, hashSet);
                    }
                }
                eVar4.h();
                eVar3.h();
                Object[] objArr3 = eVar2.f43112a;
                int i16 = eVar2.f43114c;
                for (int i17 = 0; i17 < i16; i17++) {
                    y2.c cVar = (y2.c) objArr3[i17];
                    x2.h hVar2 = (x2.h) eVar.f43112a[i17];
                    if (cVar.P) {
                        x2.d.b(cVar, hVar2, hashSet);
                    }
                }
                eVar2.h();
                eVar.h();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((y2.c) it.next()).V0();
                }
                return qy.b0.f48488a;
            case 4:
                y2.m0 m0Var = ((y2.i0) this.f54540b).f56893j0;
                m0Var.f56974p.f56828b0 = true;
                y2.v0 v0Var = m0Var.f56975q;
                if (v0Var != null) {
                    v0Var.V = true;
                }
                return qy.b0.f48488a;
            case 5:
                return (f2.c) this.f54540b;
            case 6:
                rz.e0.i(((z2.m0) this.f54540b).f58616c, null);
                return qy.b0.f48488a;
            case 7:
                return qy.b0.f48488a;
            case 8:
                u1.c cVar2 = (u1.c) ((z2.w1) this.f54540b).f58695a.f52454b;
                if (!cVar2.f52723b) {
                    if (cVar2.f52724c) {
                        v1.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar2.a();
                    cVar2.f52724c = true;
                }
                return qy.b0.f48488a;
            case 9:
                ((fz.a) ((kotlin.jvm.internal.y) this.f54540b).f38361a).invoke();
                return qy.b0.f48488a;
            default:
                PopupLayout popupLayout = (PopupLayout) this.f54540b;
                x parentLayoutCoordinates = popupLayout.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.k()) {
                    parentLayoutCoordinates = null;
                }
                return Boolean.valueOf((parentLayoutCoordinates == null || popupLayout.m7getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }
}
