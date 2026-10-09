package com.google.android.material.color.utilities;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ColorUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double[] f14294a = {95.047d, 100.0d, 108.883d};

    private ColorUtils() {
    }

    public static double a(double d5) {
        double d11 = (d5 + 16.0d) / 116.0d;
        double d12 = d11 * d11 * d11;
        if (d12 <= 0.008856451679035631d) {
            d12 = ((d11 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        return d12 * 100.0d;
    }
}
