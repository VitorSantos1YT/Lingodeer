package y3;

import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import java.util.HashMap;
import qy.b0;
import w2.x;
import y2.i0;
import y2.t1;
import z4.s0;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewFactoryHolder f57058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f57059c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ViewFactoryHolder viewFactoryHolder, i0 i0Var, int i11) {
        super(1);
        this.f57057a = i11;
        this.f57058b = viewFactoryHolder;
        this.f57059c = i0Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsG;
        switch (this.f57057a) {
            case 0:
                t1 t1Var = (t1) obj;
                AndroidComposeView androidComposeView = t1Var instanceof AndroidComposeView ? (AndroidComposeView) t1Var : null;
                ViewFactoryHolder viewFactoryHolder = this.f57058b;
                if (androidComposeView != null) {
                    HashMap<AndroidViewHolder, i0> holderToLayoutNode = androidComposeView.getAndroidViewsHandler$ui().getHolderToLayoutNode();
                    i0 i0Var = this.f57059c;
                    holderToLayoutNode.put(viewFactoryHolder, i0Var);
                    androidComposeView.getAndroidViewsHandler$ui().addView(viewFactoryHolder);
                    androidComposeView.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(i0Var, viewFactoryHolder);
                    viewFactoryHolder.setImportantForAccessibility(1);
                    s0.q(viewFactoryHolder, new z2.l(androidComposeView, i0Var, androidComposeView));
                }
                if (viewFactoryHolder.getView().getParent() != viewFactoryHolder) {
                    viewFactoryHolder.addView(viewFactoryHolder.getView());
                }
                break;
            case 1:
                h.d(this.f57058b, this.f57059c);
                break;
            default:
                i0 i0Var2 = this.f57059c;
                ViewFactoryHolder viewFactoryHolder2 = this.f57058b;
                h.d(viewFactoryHolder2, i0Var2);
                ((AndroidComposeView) viewFactoryHolder2.f1220c).f1181k0 = true;
                int[] iArr = viewFactoryHolder2.P;
                int i11 = iArr[0];
                int i12 = iArr[1];
                viewFactoryHolder2.getView().getLocationOnScreen(iArr);
                long j11 = viewFactoryHolder2.Q;
                long jM = ((x) obj).m();
                viewFactoryHolder2.Q = jM;
                v1 v1Var = viewFactoryHolder2.R;
                if (v1Var != null && ((i11 != iArr[0] || i12 != iArr[1] || !v3.l.a(j11, jM)) && (windowInsetsG = viewFactoryHolder2.n(v1Var).g()) != null)) {
                    viewFactoryHolder2.getView().dispatchApplyWindowInsets(windowInsetsG);
                }
                break;
        }
        return b0.f48488a;
    }
}
