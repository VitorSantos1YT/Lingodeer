package qa;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class f0 extends qx.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f47622e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f47623f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f47624g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f47625h = true;

    @Override // qx.b
    public void J(View view, int i11) {
        if (Build.VERSION.SDK_INT == 28) {
            super.J(view, i11);
        } else if (f47625h) {
            try {
                c3.c.n(view, i11);
            } catch (NoSuchMethodError unused) {
                f47625h = false;
            }
        }
    }

    public void O(View view, int i11, int i12, int i13, int i14) {
        if (f47624g) {
            try {
                c3.c.l(view, i11, i12, i13, i14);
            } catch (NoSuchMethodError unused) {
                f47624g = false;
            }
        }
    }

    public void P(View view, Matrix matrix) {
        if (f47622e) {
            try {
                c3.c.s(view, matrix);
            } catch (NoSuchMethodError unused) {
                f47622e = false;
            }
        }
    }

    public void Q(View view, Matrix matrix) {
        if (f47623f) {
            try {
                c3.c.t(view, matrix);
            } catch (NoSuchMethodError unused) {
                f47623f = false;
            }
        }
    }
}
