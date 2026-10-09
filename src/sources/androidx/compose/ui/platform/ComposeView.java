package androidx.compose.ui.platform;

import a0.h;
import android.content.Context;
import android.util.AttributeSet;
import fz.e;
import l1.k1;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ComposeView extends AbstractComposeView {
    public final k1 K;
    public boolean L;

    public ComposeView(Context context) {
        this(context, null, 6, 0);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(420213850);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            e eVar = (e) this.K.getValue();
            if (eVar == null) {
                sVar.d0(-1238823553);
            } else {
                sVar.d0(98585282);
                eVar.invoke(sVar, 0);
            }
            sVar.p(false);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(this, i11, 10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.L;
    }

    public final void setContent(e eVar) {
        this.L = true;
        this.K.setValue(eVar);
        if (isAttachedToWindow()) {
            c();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.K = t.B(null);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
