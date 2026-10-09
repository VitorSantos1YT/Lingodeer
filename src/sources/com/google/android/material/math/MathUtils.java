package com.google.android.material.math;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MathUtils {
    private MathUtils() {
    }

    public static float a(float f5, float f11, float f12, float f13) {
        return (float) Math.hypot(f12 - f5, f13 - f11);
    }

    public static float b(float f5, float f11, float f12, float f13) {
        float fA = a(f5, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
        float fA2 = a(f5, f11, f12, CropImageView.DEFAULT_ASPECT_RATIO);
        float fA3 = a(f5, f11, f12, f13);
        float fA4 = a(f5, f11, CropImageView.DEFAULT_ASPECT_RATIO, f13);
        if (fA > fA2 && fA > fA3 && fA > fA4) {
            return fA;
        }
        if (fA2 <= fA3 || fA2 <= fA4) {
            return fA3 > fA4 ? fA3 : fA4;
        }
        return fA2;
    }

    public static float c(float f5, float f11, float f12) {
        return (f12 * f11) + ((1.0f - f12) * f5);
    }
}
