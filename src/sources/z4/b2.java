package z4;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cf.x f58814a;

    public b2(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f58814a = new a2(windowInsetsController, new tp.g(windowInsetsController));
        } else {
            this.f58814a = new y1(windowInsetsController, new tp.g(windowInsetsController));
        }
    }

    public b2(Window window, View view) {
        tp.g gVar = new tp.g(view);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35) {
            this.f58814a = new a2(window, gVar);
            return;
        }
        if (i11 >= 30) {
            this.f58814a = new y1(window, gVar);
        } else if (i11 >= 26) {
            this.f58814a = new x1(window, gVar);
        } else {
            this.f58814a = new w1(window, gVar);
        }
    }
}
