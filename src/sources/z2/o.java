package z2;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.AndroidComposeView;
import rt.qf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f58632b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(AndroidComposeView androidComposeView, int i11) {
        super(1);
        this.f58631a = i11;
        this.f58632b = androidComposeView;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f58631a) {
            case 0:
                ((e2.p) this.f58632b.getFocusOwner()).h(((e2.f) obj).f24711a, false);
                return qy.b0.f48488a;
            case 1:
                fz.a aVar = (fz.a) obj;
                AndroidComposeView androidComposeView = this.f58632b;
                androidComposeView.getUncaughtExceptionHandler$ui();
                Handler handler = androidComposeView.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = androidComposeView.getHandler();
                    if (handler2 != null) {
                        handler2.post(new qf(6, aVar));
                    }
                }
                return qy.b0.f48488a;
            default:
                AndroidComposeView androidComposeView2 = this.f58632b;
                return new m0(androidComposeView2, androidComposeView2.getTextInputService(), (rz.b0) obj);
        }
    }
}
