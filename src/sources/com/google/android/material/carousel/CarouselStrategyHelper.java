package com.google.android.material.carousel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class CarouselStrategyHelper {
    private CarouselStrategyHelper() {
    }

    public static float a(float f5, float f11, int i11) {
        return (Math.max(0, i11 - 1) * f11) + f5;
    }

    public static float b(float f5, float f11, int i11) {
        return i11 > 0 ? (f11 / 2.0f) + f5 : f5;
    }

    public static int c(int[] iArr) {
        int i11 = Integer.MIN_VALUE;
        for (int i12 : iArr) {
            if (i12 > i11) {
                i11 = i12;
            }
        }
        return i11;
    }

    public static float d(float f5, float f11, float f12, int i11) {
        return i11 > 0 ? (f12 / 2.0f) + f11 : f5;
    }
}
