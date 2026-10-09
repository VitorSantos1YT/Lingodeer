package k3;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.StaticLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static boolean a(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public static boolean b(Canvas canvas, float f5, float f11, float f12, float f13) {
        return canvas.clipOutRect(f5, f11, f12, f13);
    }

    public static boolean c(Canvas canvas, int i11, int i12, int i13, int i14) {
        return canvas.clipOutRect(i11, i12, i13, i14);
    }

    public static boolean d(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public static boolean e(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    public static final void f(StaticLayout.Builder builder, int i11) {
        builder.setJustificationMode(i11);
    }
}
