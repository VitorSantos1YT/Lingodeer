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
public class u extends t {
    @Override // f.r, qx.p
    public void E(h0 statusBarStyle, h0 navigationBarStyle, Window window, View view, boolean z11, boolean z12) {
        int i11;
        int i12;
        cf.x x1Var;
        kotlin.jvm.internal.m.f(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.m.f(navigationBarStyle, "navigationBarStyle");
        int i13 = navigationBarStyle.f26152c;
        kotlin.jvm.internal.m.f(window, "window");
        kotlin.jvm.internal.m.f(view, "view");
        android.support.v4.media.session.a.I(window, false);
        if (statusBarStyle.f26152c == 0) {
            i11 = 0;
        } else {
            i11 = z11 ? statusBarStyle.f26151b : statusBarStyle.f26150a;
        }
        window.setStatusBarColor(i11);
        if (i13 == 0) {
            i12 = 0;
        } else {
            i12 = z12 ? navigationBarStyle.f26151b : navigationBarStyle.f26150a;
        }
        window.setNavigationBarColor(i12);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(i13 == 0);
        tp.g gVar = new tp.g(view);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 35) {
            x1Var = new a2(window, gVar);
        } else if (i14 >= 30) {
            x1Var = new y1(window, gVar);
        } else {
            x1Var = i14 >= 26 ? new x1(window, gVar) : new w1(window, gVar);
        }
        x1Var.K(!z11);
        x1Var.J(true ^ z12);
    }
}
