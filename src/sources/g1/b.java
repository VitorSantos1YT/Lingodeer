package g1;

import android.view.View;
import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import cr.n;
import e6.q0;
import g2.v;
import h0.m;
import h1.u3;
import h1.v3;
import java.util.LinkedHashMap;
import y.e0;
import y2.k0;
import y2.y;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends q implements g, y2.l, y2.q, y {
    public final h0.i Q;
    public final boolean R;
    public final float S;
    public final u3 T;
    public final v3 U;
    public k V;
    public float W;
    public boolean Y;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public RippleContainer f28513a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public RippleHostView f28514b0;
    public long X = 0;
    public final e0 Z = new e0();

    public b(h0.i iVar, boolean z11, float f5, u3 u3Var, v3 v3Var) {
        this.Q = iVar;
        this.R = z11;
        this.S = f5;
        this.T = u3Var;
        this.U = v3Var;
    }

    @Override // z1.q
    public final boolean I0() {
        return false;
    }

    @Override // g1.g
    public final void J() {
        this.f28514b0 = null;
        y2.f.m(this);
    }

    @Override // z1.q
    public final void L0() {
        rz.e0.B(H0(), null, null, new q0(this, null, 24), 3);
    }

    @Override // z1.q
    public final void M0() {
        RippleContainer rippleContainer = this.f28513a0;
        if (rippleContainer != null) {
            J();
            ob.e eVar = rippleContainer.f1119d;
            RippleHostView rippleHostView = (RippleHostView) ((LinkedHashMap) eVar.f44804b).get(this);
            if (rippleHostView != null) {
                rippleHostView.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) eVar.f44804b;
                RippleHostView rippleHostView2 = (RippleHostView) linkedHashMap.get(this);
                if (rippleHostView2 != null) {
                }
                linkedHashMap.remove(this);
                rippleContainer.f1118c.add(rippleHostView);
            }
        }
    }

    public final void T0(m mVar) {
        RippleHostView rippleHostView;
        if (!(mVar instanceof h0.k)) {
            if (mVar instanceof h0.l) {
                RippleHostView rippleHostView2 = this.f28514b0;
                if (rippleHostView2 != null) {
                    rippleHostView2.d();
                    return;
                }
                return;
            }
            if (!(mVar instanceof h0.j) || (rippleHostView = this.f28514b0) == null) {
                return;
            }
            rippleHostView.d();
            return;
        }
        h0.k kVar = (h0.k) mVar;
        long j11 = this.X;
        float f5 = this.W;
        RippleContainer rippleContainerF = this.f28513a0;
        if (rippleContainerF == null) {
            rippleContainerF = ue.f.f(ue.f.g((View) y2.f.i(this, AndroidCompositionLocals_androidKt.f1204f)));
            this.f28513a0 = rippleContainerF;
        }
        RippleHostView rippleHostViewA = rippleContainerF.a(this);
        int iQ = hz.b.Q(f5);
        long jA = this.T.a();
        this.U.invoke();
        rippleHostViewA.b(kVar, this.R, j11, iQ, jA, 0.1f, new n(this, 24));
        this.f28514b0 = rippleHostViewA;
        y2.f.m(this);
    }

    @Override // y2.q
    public final void i(k0 k0Var) {
        k0Var.a();
        k kVar = this.V;
        if (kVar != null) {
            kVar.f(k0Var, this.W, this.T.a());
        }
        v vVarX = k0Var.f56937a.f34121b.x();
        RippleHostView rippleHostView = this.f28514b0;
        if (rippleHostView != null) {
            long j11 = this.X;
            int iQ = hz.b.Q(this.W);
            long jA = this.T.a();
            this.U.invoke();
            rippleHostView.e(0.1f, j11, jA, iQ);
            rippleHostView.draw(g2.d.a(vVarX));
        }
    }

    @Override // y2.y
    public final void l(long j11) {
        this.Y = true;
        v3.c cVar = y2.f.x(this).f56881b0;
        this.X = ff.h.P(j11);
        float f5 = this.S;
        this.W = Float.isNaN(f5) ? f.a(cVar, this.R, this.X) : cVar.e0(f5);
        e0 e0Var = this.Z;
        Object[] objArr = e0Var.f56686a;
        int i11 = e0Var.f56687b;
        for (int i12 = 0; i12 < i11; i12++) {
            T0((m) objArr[i12]);
        }
        e0Var.d();
    }
}
