package y3;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import e2.a0;
import e2.b0;
import e2.e0;
import e2.u;
import kotlin.NoWhenBranchMatchedException;
import y2.t1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends z1.q implements u, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View Q;
    public ViewTreeObserver R;
    public final n S = new n(this, 0);
    public final n T = new n(this, 1);

    @Override // z1.q
    public final void L0() {
        ViewTreeObserver viewTreeObserver = y2.f.z(this).getViewTreeObserver();
        this.R = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // z1.q
    public final void M0() {
        ViewTreeObserver viewTreeObserver = this.R;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.R = null;
        y2.f.z(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.Q = null;
    }

    public final e0 T0() {
        if (!this.f58482a.P) {
            v2.a.b("visitLocalDescendants called on an unattached node");
        }
        z1.q qVar = this.f58482a;
        if ((qVar.f58485d & 1024) != 0) {
            boolean z11 = false;
            for (z1.q qVar2 = qVar.f58487f; qVar2 != null; qVar2 = qVar2.f58487f) {
                if ((qVar2.f58484c & 1024) != 0) {
                    z1.q qVarF = qVar2;
                    n1.e eVar = null;
                    while (qVarF != null) {
                        if (qVarF instanceof e0) {
                            e0 e0Var = (e0) qVarF;
                            if (z11) {
                                return e0Var;
                            }
                            z11 = true;
                        } else if ((qVarF.f58484c & 1024) != 0 && (qVarF instanceof y2.n)) {
                            int i11 = 0;
                            for (z1.q qVar3 = ((y2.n) qVarF).R; qVar3 != null; qVar3 = qVar3.f58487f) {
                                if ((qVar3.f58484c & 1024) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        qVarF = qVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new n1.e(new z1.q[16]);
                                        }
                                        if (qVarF != null) {
                                            eVar.c(qVarF);
                                            qVarF = null;
                                        }
                                        eVar.c(qVar3);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        qVarF = y2.f.f(eVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // e2.u
    public final void a0(e2.r rVar) {
        rVar.c(false);
        rVar.e(this.S);
        rVar.d(this.T);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z11;
        boolean z12;
        if (y2.f.x(this).Q == null) {
            return;
        }
        View viewC = h.c(this);
        e2.l focusOwner = y2.f.y(this).getFocusOwner();
        t1 t1VarY = y2.f.y(this);
        if (view != null && !view.equals(t1VarY)) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    z11 = false;
                    break;
                } else {
                    if (parent == viewC.getParent()) {
                        z11 = true;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        } else {
            z11 = false;
            break;
        }
        if (view2 != null && !view2.equals(t1VarY)) {
            ViewParent parent2 = view2.getParent();
            while (true) {
                if (parent2 == null) {
                    z12 = false;
                    break;
                } else {
                    if (parent2 == viewC.getParent()) {
                        z12 = true;
                        break;
                    }
                    parent2 = parent2.getParent();
                }
            }
        } else {
            z12 = false;
            break;
        }
        if (z11 && z12) {
            this.Q = view2;
            return;
        }
        if (!z12) {
            if (!z11) {
                this.Q = null;
                return;
            }
            this.Q = null;
            if (T0().X0().a()) {
                ((e2.p) focusOwner).c(8, false, false);
                return;
            }
            return;
        }
        this.Q = view2;
        e0 e0VarT0 = T0();
        b0 b0VarX0 = e0VarT0.X0();
        b0VarX0.getClass();
        int i11 = a0.f24706a[b0VarX0.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return;
        }
        if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        e2.d.x(e0VarT0);
    }
}
