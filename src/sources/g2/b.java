package g2;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static void a(Canvas canvas, boolean z11) {
        if (z11) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    public static final long b(AndroidComposeView androidComposeView) {
        return androidComposeView.getUniqueDrawingId();
    }

    public static void c(Paint paint, int i11) {
        paint.setBlendMode(d(i11));
    }

    public static final BlendMode d(int i11) {
        if (i11 == 0) {
            return BlendMode.CLEAR;
        }
        if (i11 == 1) {
            return BlendMode.SRC;
        }
        if (i11 == 2) {
            return BlendMode.DST;
        }
        if (i11 == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i11 == 4) {
            return BlendMode.DST_OVER;
        }
        if (i11 == 5) {
            return BlendMode.SRC_IN;
        }
        if (i11 == 6) {
            return BlendMode.DST_IN;
        }
        if (i11 == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i11 == 8) {
            return BlendMode.DST_OUT;
        }
        if (i11 == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i11 == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i11 == 11) {
            return BlendMode.XOR;
        }
        if (i11 == 12) {
            return BlendMode.PLUS;
        }
        if (i11 == 13) {
            return BlendMode.MODULATE;
        }
        if (i11 == 14) {
            return BlendMode.SCREEN;
        }
        if (i11 == 15) {
            return BlendMode.OVERLAY;
        }
        if (i11 == 16) {
            return BlendMode.DARKEN;
        }
        if (i11 == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i11 == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i11 == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i11 == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i11 == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i11 == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i11 == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i11 == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i11 == 25) {
            return BlendMode.HUE;
        }
        if (i11 == 26) {
            return BlendMode.SATURATION;
        }
        if (i11 == 27) {
            return BlendMode.COLOR;
        }
        return i11 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode e(int i11) {
        if (i11 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i11 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i11 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i11 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i11 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i11 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i11 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i11 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i11 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i11 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i11 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i11 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i11 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i11 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i11 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i11 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i11 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i11 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
