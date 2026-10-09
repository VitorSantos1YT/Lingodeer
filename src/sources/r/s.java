package r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f48640b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static s f48641c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t1 f48642a;

    public static synchronized s a() {
        try {
            if (f48641c == null) {
                d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f48641c;
    }

    public static synchronized PorterDuffColorFilter c(int i11, PorterDuff.Mode mode) {
        return t1.e(i11, mode);
    }

    public static synchronized void d() {
        if (f48641c == null) {
            s sVar = new s();
            f48641c = sVar;
            sVar.f48642a = t1.b();
            t1 t1Var = f48641c.f48642a;
            oi.c cVar = new oi.c(7);
            synchronized (t1Var) {
                t1Var.f48653e = cVar;
            }
        }
    }

    public static void e(Drawable drawable, k2 k2Var, int[] iArr) {
        PorterDuff.Mode mode = t1.f48646f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z11 = k2Var.f48596b;
            if (!z11 && !k2Var.f48595a) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterE = null;
            ColorStateList colorStateList = z11 ? (ColorStateList) k2Var.f48597c : null;
            PorterDuff.Mode mode2 = k2Var.f48595a ? (PorterDuff.Mode) k2Var.f48598d : t1.f48646f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterE = t1.e(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterE);
        }
    }

    public final synchronized Drawable b(Context context, int i11) {
        return this.f48642a.c(context, i11);
    }
}
