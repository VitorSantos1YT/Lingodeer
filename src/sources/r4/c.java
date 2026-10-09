package r4;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f48791a = new ThreadLocal();

    public static int a(double d5, double d11, double d12) {
        double d13 = (((-0.4986d) * d12) + (((-1.5372d) * d11) + (3.2406d * d5))) / 100.0d;
        double d14 = ((0.0415d * d12) + ((1.8758d * d11) + ((-0.9689d) * d5))) / 100.0d;
        double d15 = ((1.057d * d12) + (((-0.204d) * d11) + (0.0557d * d5))) / 100.0d;
        double dPow = d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d;
        double dPow2 = d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d;
        double dPow3 = d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    public static int b(int i11, float f5, int i12) {
        float f11 = 1.0f - f5;
        return Color.argb((int) ((Color.alpha(i12) * f5) + (Color.alpha(i11) * f11)), (int) ((Color.red(i12) * f5) + (Color.red(i11) * f11)), (int) ((Color.green(i12) * f5) + (Color.green(i11) * f11)), (int) ((Color.blue(i12) * f5) + (Color.blue(i11) * f11)));
    }

    public static int c(int i11, int i12) {
        int iAlpha = Color.alpha(i12);
        int iAlpha2 = Color.alpha(i11);
        int i13 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i13, d(Color.red(i11), iAlpha2, Color.red(i12), iAlpha, i13), d(Color.green(i11), iAlpha2, Color.green(i12), iAlpha, i13), d(Color.blue(i11), iAlpha2, Color.blue(i12), iAlpha, i13));
    }

    public static int d(int i11, int i12, int i13, int i14, int i15) {
        if (i15 == 0) {
            return 0;
        }
        return (((255 - i12) * (i13 * i14)) + ((i11 * 255) * i12)) / (i15 * 255);
    }

    public static int e(int i11, int i12) {
        if (i12 < 0 || i12 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i11 & 16777215) | (i12 << 24);
    }
}
