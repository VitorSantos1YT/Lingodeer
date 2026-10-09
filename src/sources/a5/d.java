package a5;

import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import com.yalantis.ucrop.view.CropImageView;
import g2.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static Icon a(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static void b(int i11) {
        SdkExtensions.getExtensionVersion(i11);
    }

    public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static Insets d(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void e(Window window, boolean z11) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z11 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z11);
    }

    public static void f(Window window, boolean z11) {
        window.setDecorFitsSystemWindows(z11);
    }

    public static void g(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void h(Outline outline, p0 p0Var) {
        if (!(p0Var instanceof g2.k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((g2.k) p0Var).f28575a);
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void j(Surface surface, float f5) {
        try {
            surface.setFrameRate(f5, f5 == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : 1);
        } catch (IllegalStateException e8) {
            b7.a.p("Failed to call Surface.setFrameRate", e8);
        }
    }
}
