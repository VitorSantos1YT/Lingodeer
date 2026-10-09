package z2;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f58636b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(AndroidComposeView androidComposeView, int i11) {
        super(0);
        this.f58635a = i11;
        this.f58636b = androidComposeView;
    }

    @Override // fz.a
    public final Object invoke() {
        int actionMasked;
        switch (this.f58635a) {
            case 0:
                return g0.o(this.f58636b);
            case 1:
                AndroidComposeView androidComposeView = this.f58636b;
                MotionEvent motionEvent = androidComposeView.V0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    androidComposeView.W0 = SystemClock.uptimeMillis();
                    androidComposeView.post(androidComposeView.f1162b1);
                }
                return qy.b0.f48488a;
            default:
                return this.f58636b.get_viewTreeOwners();
        }
    }
}
