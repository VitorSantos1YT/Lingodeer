package z4;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {
    public static v1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        v1 v1VarH = v1.h(null, rootWindowInsets);
        s1 s1Var = v1VarH.f58905a;
        s1Var.t(v1VarH);
        s1Var.d(view.getRootView());
        return v1VarH;
    }

    public static void b(View view, int i11, int i12) {
        view.setScrollIndicators(i11, i12);
    }
}
