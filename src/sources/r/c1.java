package r;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f48538a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f48539b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f48540c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29 || i11 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f48538a);
        } else {
            drawable.setState(f48539b);
        }
        drawable.setState(state);
    }

    public static Rect b(Drawable drawable) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            Insets insetsA = b1.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        Drawable drawableI0 = ub.a.i0(drawable);
        if (i11 >= 29) {
            boolean z11 = a1.f48523a;
        } else if (a1.f48523a) {
            try {
                Object objInvoke = a1.f48524b.invoke(drawableI0, null);
                if (objInvoke != null) {
                    return new Rect(a1.f48525c.getInt(objInvoke), a1.f48526d.getInt(objInvoke), a1.f48527e.getInt(objInvoke), a1.f48528f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f48540c;
    }

    public static PorterDuff.Mode c(int i11, PorterDuff.Mode mode) {
        if (i11 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i11 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i11 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i11) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
