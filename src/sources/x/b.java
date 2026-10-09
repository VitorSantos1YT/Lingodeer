package x;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f55567a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f5, float f11, boolean z11) {
        if (!z11) {
            return f5;
        }
        return (float) (((1.0d - f55567a) * ((double) f11)) + ((double) f5));
    }

    public static float b(float f5, float f11, boolean z11) {
        if (!z11) {
            return f5 * 1.5f;
        }
        return (float) (((1.0d - f55567a) * ((double) f11)) + ((double) (f5 * 1.5f)));
    }
}
