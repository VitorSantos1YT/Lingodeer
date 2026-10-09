package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.compose.ui.platform.AbstractComposeView;
import b0.d;
import fz.e;
import h1.c2;
import h1.h5;
import h1.k5;
import l1.k1;
import l1.n;
import l1.t;
import l1.x1;
import rz.b0;
import z3.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ModalBottomSheetDialogLayout extends AbstractComposeView implements s {
    public final Window K;
    public final boolean L;
    public final fz.a M;
    public final d N;
    public final b0 O;
    public final k1 P;
    public Object Q;
    public boolean R;

    public ModalBottomSheetDialogLayout(Context context, Window window, boolean z11, fz.a aVar, d dVar, b0 b0Var) {
        super(context, null, 6, 0);
        this.K = window;
        this.L = z11;
        this.M = aVar;
        this.N = dVar;
        this.O = b0Var;
        this.P = t.B(c2.f30076a);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(576708319);
        if ((((sVar.h(this) ? 4 : 2) | i11) & 3) == 2 && sVar.F()) {
            sVar.W();
        } else {
            ((e) this.P.getValue()).invoke(sVar, 0);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new a(this, i11);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.R;
    }

    @Override // z3.s
    public final Window getWindow() {
        return this.K;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i11;
        super.onAttachedToWindow();
        if (!this.L || (i11 = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.Q == null) {
            fz.a aVar = this.M;
            this.Q = i11 >= 34 ? k5.a(aVar, this.N, this.O) : h5.a(aVar);
        }
        h5.b(this, this.Q);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            h5.c(this, this.Q);
        }
        this.Q = null;
    }
}
