package f;

import android.os.Build;
import android.view.View;
import android.view.Window;
import z4.a2;
import z4.w1;
import z4.x1;
import z4.y1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class r extends qx.p {
    @Override // qx.p
    public void E(h0 statusBarStyle, h0 navigationBarStyle, Window window, View view, boolean z11, boolean z12) {
        cf.x x1Var;
        kotlin.jvm.internal.m.f(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.m.f(navigationBarStyle, "navigationBarStyle");
        kotlin.jvm.internal.m.f(window, "window");
        kotlin.jvm.internal.m.f(view, "view");
        android.support.v4.media.session.a.I(window, false);
        window.setStatusBarColor(z11 ? statusBarStyle.f26151b : statusBarStyle.f26150a);
        window.setNavigationBarColor(z12 ? navigationBarStyle.f26151b : navigationBarStyle.f26150a);
        tp.g gVar = new tp.g(view);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35) {
            x1Var = new a2(window, gVar);
        } else if (i11 >= 30) {
            x1Var = new y1(window, gVar);
        } else {
            x1Var = i11 >= 26 ? new x1(window, gVar) : new w1(window, gVar);
        }
        x1Var.K(!z11);
        x1Var.J(!z12);
    }
}
