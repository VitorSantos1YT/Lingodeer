package z3;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.window.PopupLayout;
import rt.qf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f58770b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(PopupLayout popupLayout, int i11) {
        super(1);
        this.f58769a = i11;
        this.f58770b = popupLayout;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f58769a) {
            case 0:
                w2.x xVarH = ((w2.x) obj).H();
                kotlin.jvm.internal.m.c(xVarH);
                this.f58770b.n(xVarH);
                break;
            case 1:
                v3.l lVar = new v3.l(((v3.l) obj).f53498a);
                PopupLayout popupLayout = this.f58770b;
                popupLayout.m8setPopupContentSizefhxjrPA(lVar);
                popupLayout.o();
                break;
            default:
                fz.a aVar = (fz.a) obj;
                PopupLayout popupLayout2 = this.f58770b;
                Handler handler = popupLayout2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = popupLayout2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new qf(7, aVar));
                    }
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
