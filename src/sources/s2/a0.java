package s2;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import y2.t1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewFactoryHolder f51283b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(ViewFactoryHolder viewFactoryHolder, int i11) {
        super(1);
        this.f51282a = i11;
        this.f51283b = viewFactoryHolder;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f51282a) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                ViewFactoryHolder viewFactoryHolder = this.f51283b;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = viewFactoryHolder.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = viewFactoryHolder.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
            case 1:
                t1 t1Var = (t1) obj;
                AndroidComposeView androidComposeView = t1Var instanceof AndroidComposeView ? (AndroidComposeView) t1Var : null;
                ViewFactoryHolder viewFactoryHolder2 = this.f51283b;
                if (androidComposeView != null) {
                    androidComposeView.getAndroidViewsHandler$ui().removeViewInLayout(viewFactoryHolder2);
                    kotlin.jvm.internal.c0.c(androidComposeView.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(androidComposeView.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(viewFactoryHolder2));
                    viewFactoryHolder2.setImportantForAccessibility(0);
                }
                viewFactoryHolder2.removeAllViewsInLayout();
                return qy.b0.f48488a;
            default:
                this.f51283b.S = (fz.c) obj;
                return qy.b0.f48488a;
        }
    }
}
