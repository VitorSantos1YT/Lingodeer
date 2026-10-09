package com.google.android.material.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class FadeThroughUtils {
    private FadeThroughUtils() {
    }

    public static void a(float f5, float[] fArr) {
        if (f5 <= 0.5f) {
            fArr[0] = 1.0f - (f5 * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f5 * 2.0f) - 1.0f;
        }
    }
}
