package z2;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z1.q implements d3.a, y2.b2, q2.e, y2.z, y2.g2, y2.m {
    public final y.p0 Q = new y.p0(this, 7);
    public final /* synthetic */ AndroidComposeView R;

    public j(AndroidComposeView androidComposeView) {
        this.R = androidComposeView;
    }

    @Override // q2.e
    public final boolean B(KeyEvent keyEvent) {
        e2.f fVar;
        int[] iArr = e2.h.f24715a;
        long jB = q2.c.b(keyEvent);
        boolean z11 = true;
        if (q2.a.a(jB, q2.a.f47396b)) {
            fVar = new e2.f(2);
        } else if (q2.a.a(jB, q2.a.f47397c)) {
            fVar = new e2.f(1);
        } else if (q2.a.a(jB, q2.a.f47403i)) {
            fVar = new e2.f(keyEvent.isShiftPressed() ? 2 : 1);
        } else if (q2.a.a(jB, q2.a.f47401g)) {
            fVar = new e2.f(4);
        } else if (q2.a.a(jB, q2.a.f47400f)) {
            fVar = new e2.f(3);
        } else if (q2.a.a(jB, q2.a.f47398d) || q2.a.a(jB, q2.a.m)) {
            fVar = new e2.f(5);
        } else if (q2.a.a(jB, q2.a.f47399e) || q2.a.a(jB, q2.a.f47407n)) {
            fVar = new e2.f(6);
        } else if (q2.a.a(jB, q2.a.f47402h) || q2.a.a(jB, q2.a.f47405k) || q2.a.a(jB, q2.a.f47408o)) {
            fVar = new e2.f(7);
        } else {
            fVar = (q2.a.a(jB, q2.a.f47395a) || q2.a.a(jB, q2.a.f47406l)) ? new e2.f(8) : null;
        }
        if (fVar != null) {
            int i11 = fVar.f24711a;
            if (q2.c.c(keyEvent) == 2) {
                AndroidComposeView androidComposeView = this.R;
                e2.e0 e0VarG = ((e2.p) androidComposeView.getFocusOwner()).g();
                if (e0VarG == null || !e0VarG.Q || !androidComposeView.u(i11)) {
                    Boolean boolF = ((e2.p) androidComposeView.getFocusOwner()).f(i11, androidComposeView.getEmbeddedViewFocusRect(), new y.p0(fVar, 6));
                    if (!(boolF != null ? boolF.booleanValue() : true)) {
                        if (i11 != 1 && i11 != 2) {
                            z11 = false;
                        }
                        if (z11) {
                            Integer numC = e2.h.c(i11);
                            int iIntValue = numC != null ? numC.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = androidComposeView.getRootView();
                            kotlin.jvm.internal.m.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, androidComposeView.getView(), iIntValue);
                            if (viewFindNextFocus == null || viewFindNextFocus.equals(androidComposeView)) {
                                return ((e2.p) androidComposeView.getFocusOwner()).i(i11);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // d3.a
    public final Object G0(y2.k1 k1Var, d2.c cVar, xy.c cVar2) {
        long jP = k1Var.P(0L);
        f2.c cVar3 = (f2.c) cVar.invoke();
        f2.c cVarI = cVar3 != null ? cVar3.i(jP) : null;
        if (cVarI != null) {
            this.R.requestRectangleOnScreen(new Rect((int) cVarI.f26572a, (int) cVarI.f26573b, (int) cVarI.f26574c, (int) cVarI.f26575d), false);
        }
        return qy.b0.f48488a;
    }

    @Override // y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        w2.g1 g1VarB = p0Var.B(j11);
        return s0Var.O(g1VarB.f54501a, g1VarB.f54502b, ry.s.f50855a, this.Q, new a0.h0(g1VarB, 7));
    }

    @Override // q2.e
    public final boolean f(KeyEvent keyEvent) {
        return false;
    }

    @Override // y2.g2
    public final Object h() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // y2.b2
    public final void i0(g3.b0 b0Var) {
    }
}
