package com.google.android.material.color.utilities;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewingConditions {
    static {
        double dA = (ColorUtils.a(50.0d) * 63.66197723675813d) / 100.0d;
        double dMax = Math.max(0.1d, 50.0d);
        double[] dArr = ColorUtils.f14294a;
        double d5 = dArr[0];
        double[][] dArr2 = Cam16.f14293a;
        double[] dArr3 = dArr2[0];
        double d11 = dArr3[0] * d5;
        double d12 = dArr[1];
        double d13 = (dArr3[1] * d12) + d11;
        double d14 = dArr[2];
        double d15 = (dArr3[2] * d14) + d13;
        double[] dArr4 = dArr2[1];
        double d16 = (dArr4[2] * d14) + (dArr4[1] * d12) + (dArr4[0] * d5);
        double[] dArr5 = dArr2[2];
        double d17 = (d14 * dArr5[2]) + (d12 * dArr5[1]) + (d5 * dArr5[0]);
        double dExp = (1.0d - (Math.exp(((-dA) - 42.0d) / 92.0d) * 0.2777777777777778d)) * 1.0d;
        if (dExp < 0.0d) {
            dExp = 0.0d;
        } else if (dExp > 1.0d) {
            dExp = 1.0d;
        }
        double[] dArr6 = {(((100.0d / d15) * dExp) + 1.0d) - dExp, (((100.0d / d16) * dExp) + 1.0d) - dExp, (((100.0d / d17) * dExp) + 1.0d) - dExp};
        double d18 = 5.0d * dA;
        double d19 = 1.0d / (d18 + 1.0d);
        double d20 = d19 * d19 * d19 * d19;
        double d21 = 1.0d - d20;
        double dCbrt = (Math.cbrt(d18) * 0.1d * d21 * d21) + (d20 * dA);
        double dA2 = ColorUtils.a(dMax) / dArr[1];
        Math.sqrt(dA2);
        Math.pow(dA2, 0.2d);
        Math.pow(((dArr6[0] * dCbrt) * d15) / 100.0d, 0.42d);
        Math.pow(((dArr6[1] * dCbrt) * d16) / 100.0d, 0.42d);
        Math.pow(((dArr6[2] * dCbrt) * d17) / 100.0d, 0.42d);
        Math.pow(dCbrt, 0.25d);
    }

    public ViewingConditions(double d5, double d11, double d12, double d13, double d14, double d15, double[] dArr, double d16, double d17, double d18) {
    }
}
