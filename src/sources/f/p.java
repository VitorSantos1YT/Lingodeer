package f;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f26166a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f26167b = Color.argb(128, 27, 27, 27);

    public static final void a(n nVar, h0 h0Var, h0 navigationBarStyle) {
        qx.p rVar;
        kotlin.jvm.internal.m.f(navigationBarStyle, "navigationBarStyle");
        View decorView = nVar.getWindow().getDecorView();
        kotlin.jvm.internal.m.e(decorView, "window.decorView");
        fz.c cVar = h0Var.f26153d;
        Resources resources = decorView.getResources();
        kotlin.jvm.internal.m.e(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) cVar.invoke(resources)).booleanValue();
        fz.c cVar2 = navigationBarStyle.f26153d;
        Resources resources2 = decorView.getResources();
        kotlin.jvm.internal.m.e(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) cVar2.invoke(resources2)).booleanValue();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            rVar = new v();
        } else if (i11 >= 29) {
            rVar = new u();
        } else if (i11 >= 28) {
            rVar = new t();
        } else {
            rVar = i11 >= 26 ? new r() : new q();
        }
        qx.p pVar = rVar;
        Window window = nVar.getWindow();
        kotlin.jvm.internal.m.e(window, "window");
        pVar.E(h0Var, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = nVar.getWindow();
        kotlin.jvm.internal.m.e(window2, "window");
        pVar.i(window2);
    }

    public static /* synthetic */ void b(l.m mVar, h0 h0Var, int i11) {
        h0 h0VarG = p20.c.g(0, 0);
        if ((i11 & 2) != 0) {
            h0Var = p20.c.g(f26166a, f26167b);
        }
        a(mVar, h0VarG, h0Var);
    }
}
