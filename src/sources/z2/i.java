package z2;

import android.os.Trace;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f58586b;

    public /* synthetic */ i(AndroidComposeView androidComposeView, int i11) {
        this.f58585a = i11;
        this.f58586b = androidComposeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f58585a;
        AndroidComposeView androidComposeView = this.f58586b;
        switch (i11) {
            case 0:
                Class cls = AndroidComposeView.f1151l1;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!androidComposeView.f1191t.isEmpty()) {
                    try {
                        ((fz.a) androidComposeView.f1191t.removeLast()).invoke();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                Trace.endSection();
                return;
            default:
                androidComposeView.f1168d1 = false;
                MotionEvent motionEvent = androidComposeView.V0;
                kotlin.jvm.internal.m.c(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                androidComposeView.G(motionEvent);
                return;
        }
    }
}
