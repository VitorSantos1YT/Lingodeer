package qa;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f47614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f47615b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f47614a = new g0();
        } else {
            f47614a = new f0();
        }
        f47615b = new b(5, Float.class, "translationAlpha");
        new b(6, Rect.class, "clipBounds");
    }

    public static void a(View view, int i11, int i12, int i13, int i14) {
        f47614a.O(view, i11, i12, i13, i14);
    }

    public static void b(View view, int i11) {
        f47614a.J(view, i11);
    }
}
