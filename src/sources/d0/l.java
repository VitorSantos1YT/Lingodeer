package d0;

import android.content.Context;
import android.widget.EdgeEffect;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
    }

    public static float c(EdgeEffect edgeEffect, float f5, float f11) {
        try {
            return edgeEffect.onPullDistance(f5, f11);
        } catch (Throwable unused) {
            edgeEffect.onPull(f5, f11);
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
    }
}
