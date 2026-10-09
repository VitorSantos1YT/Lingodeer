package c4;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends v10.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final double[] f6566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final double[][] f6567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final double[][] f6568l;
    public final double[] m;

    public i(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.m = new double[length2];
        int i11 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i11, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i12 = 0; i12 < length2; i12++) {
            int i13 = 0;
            while (i13 < i11) {
                int i14 = i13 + 1;
                double d5 = dArr[i14] - dArr[i13];
                double[] dArr5 = dArr3[i13];
                double d11 = (dArr2[i14][i12] - dArr2[i13][i12]) / d5;
                dArr5[i12] = d11;
                if (i13 == 0) {
                    dArr4[i13][i12] = d11;
                } else {
                    dArr4[i13][i12] = (dArr3[i13 - 1][i12] + d11) * 0.5d;
                }
                i13 = i14;
            }
            dArr4[i11][i12] = dArr3[length - 2][i12];
        }
        for (int i15 = 0; i15 < i11; i15++) {
            for (int i16 = 0; i16 < length2; i16++) {
                double d12 = dArr3[i15][i16];
                if (d12 == 0.0d) {
                    dArr4[i15][i16] = 0.0d;
                    dArr4[i15 + 1][i16] = 0.0d;
                } else {
                    double d13 = dArr4[i15][i16] / d12;
                    int i17 = i15 + 1;
                    double d14 = dArr4[i17][i16] / d12;
                    double dHypot = Math.hypot(d13, d14);
                    if (dHypot > 9.0d) {
                        double d15 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i15];
                        double[] dArr7 = dArr3[i15];
                        dArr6[i16] = d13 * d15 * dArr7[i16];
                        dArr4[i17][i16] = d15 * d14 * dArr7[i16];
                    }
                }
            }
        }
        this.f6566j = dArr;
        this.f6567k = dArr2;
        this.f6568l = dArr4;
    }

    public static double P(double d5, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d11 * d11;
        double d17 = d11 * 6.0d;
        double d18 = 6.0d * d16 * d12;
        double d19 = (d18 + ((d17 * d13) + (((-6.0d) * d16) * d13))) - (d17 * d12);
        double d20 = 3.0d * d5;
        return (d5 * d14) + (((((d20 * d14) * d16) + (((d20 * d15) * d16) + d19)) - (((2.0d * d5) * d15) * d11)) - (((4.0d * d5) * d14) * d11));
    }

    public static double Q(double d5, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d11 * d11;
        double d17 = d16 * d11;
        double d18 = 3.0d * d16;
        double d19 = d17 * 2.0d * d12;
        double d20 = ((d19 + ((d18 * d13) + (((-2.0d) * d17) * d13))) - (d18 * d12)) + d12;
        double d21 = d5 * d15;
        double d22 = (d21 * d17) + d20;
        double d23 = d5 * d14;
        return (d23 * d11) + ((((d17 * d23) + d22) - (d21 * d16)) - (((d5 * 2.0d) * d14) * d16));
    }

    @Override // v10.c
    public final double p(double d5) {
        double d11;
        double d12;
        double dT;
        double[] dArr = this.f6566j;
        int length = dArr.length;
        double d13 = dArr[0];
        double[][] dArr2 = this.f6567k;
        if (d5 <= d13) {
            d11 = dArr2[0][0];
            d12 = d5 - d13;
            dT = t(d13);
        } else {
            int i11 = length - 1;
            double d14 = dArr[i11];
            if (d5 < d14) {
                int i12 = 0;
                while (i12 < i11) {
                    double d15 = dArr[i12];
                    if (d5 == d15) {
                        return dArr2[i12][0];
                    }
                    int i13 = i12 + 1;
                    double d16 = dArr[i13];
                    if (d5 < d16) {
                        double d17 = d16 - d15;
                        double d18 = (d5 - d15) / d17;
                        double d19 = dArr2[i12][0];
                        double d20 = dArr2[i13][0];
                        double[][] dArr3 = this.f6568l;
                        return Q(d17, d18, d19, d20, dArr3[i12][0], dArr3[i13][0]);
                    }
                    i12 = i13;
                }
                return 0.0d;
            }
            d11 = dArr2[i11][0];
            d12 = d5 - d14;
            dT = t(d14);
        }
        return (dT * d12) + d11;
    }

    @Override // v10.c
    public final void q(double d5, double[] dArr) {
        double[] dArr2 = this.f6566j;
        int length = dArr2.length;
        double[][] dArr3 = this.f6567k;
        int i11 = 0;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        double[] dArr4 = this.m;
        if (d5 <= d11) {
            u(d11, dArr4);
            for (int i12 = 0; i12 < length2; i12++) {
                dArr[i12] = ((d5 - dArr2[0]) * dArr4[i12]) + dArr3[0][i12];
            }
            return;
        }
        int i13 = length - 1;
        double d12 = dArr2[i13];
        if (d5 >= d12) {
            u(d12, dArr4);
            while (i11 < length2) {
                dArr[i11] = ((d5 - dArr2[i13]) * dArr4[i11]) + dArr3[i13][i11];
                i11++;
            }
            return;
        }
        int i14 = 0;
        while (i14 < length - 1) {
            if (d5 == dArr2[i14]) {
                for (int i15 = 0; i15 < length2; i15++) {
                    dArr[i15] = dArr3[i14][i15];
                }
            }
            int i16 = i14 + 1;
            double d13 = dArr2[i16];
            if (d5 < d13) {
                double d14 = dArr2[i14];
                double d15 = d13 - d14;
                double d16 = (d5 - d14) / d15;
                while (i11 < length2) {
                    double d17 = dArr3[i14][i11];
                    double d18 = dArr3[i16][i11];
                    double[][] dArr5 = this.f6568l;
                    dArr[i11] = Q(d15, d16, d17, d18, dArr5[i14][i11], dArr5[i16][i11]);
                    i11++;
                }
                return;
            }
            i14 = i16;
        }
    }

    @Override // v10.c
    public final void r(double d5, float[] fArr) {
        double[] dArr = this.f6566j;
        int length = dArr.length;
        double[][] dArr2 = this.f6567k;
        int i11 = 0;
        int length2 = dArr2[0].length;
        double d11 = dArr[0];
        double[] dArr3 = this.m;
        if (d5 <= d11) {
            u(d11, dArr3);
            for (int i12 = 0; i12 < length2; i12++) {
                fArr[i12] = (float) (((d5 - dArr[0]) * dArr3[i12]) + dArr2[0][i12]);
            }
            return;
        }
        int i13 = length - 1;
        double d12 = dArr[i13];
        if (d5 >= d12) {
            u(d12, dArr3);
            while (i11 < length2) {
                fArr[i11] = (float) (((d5 - dArr[i13]) * dArr3[i11]) + dArr2[i13][i11]);
                i11++;
            }
            return;
        }
        int i14 = 0;
        while (i14 < length - 1) {
            if (d5 == dArr[i14]) {
                for (int i15 = 0; i15 < length2; i15++) {
                    fArr[i15] = (float) dArr2[i14][i15];
                }
            }
            int i16 = i14 + 1;
            double d13 = dArr[i16];
            if (d5 < d13) {
                double d14 = dArr[i14];
                double d15 = d13 - d14;
                double d16 = (d5 - d14) / d15;
                while (i11 < length2) {
                    double d17 = dArr2[i14][i11];
                    double d18 = dArr2[i16][i11];
                    double[][] dArr4 = this.f6568l;
                    fArr[i11] = (float) Q(d15, d16, d17, d18, dArr4[i14][i11], dArr4[i16][i11]);
                    i11++;
                }
                return;
            }
            i14 = i16;
        }
    }

    @Override // v10.c
    public final double t(double d5) {
        double[] dArr = this.f6566j;
        int length = dArr.length;
        double d11 = dArr[0];
        if (d5 >= d11) {
            d11 = dArr[length - 1];
            if (d5 < d11) {
                d11 = d5;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            int i12 = i11 + 1;
            double d12 = dArr[i12];
            if (d11 <= d12) {
                double d13 = dArr[i11];
                double d14 = d12 - d13;
                double[][] dArr2 = this.f6567k;
                double d15 = dArr2[i11][0];
                double d16 = dArr2[i12][0];
                double[][] dArr3 = this.f6568l;
                return P(d14, (d11 - d13) / d14, d15, d16, dArr3[i11][0], dArr3[i12][0]) / d14;
            }
            i11 = i12;
        }
        return 0.0d;
    }

    @Override // v10.c
    public final void u(double d5, double[] dArr) {
        double[] dArr2 = this.f6566j;
        int length = dArr2.length;
        double[][] dArr3 = this.f6567k;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        if (d5 > d11) {
            d11 = dArr2[length - 1];
            if (d5 < d11) {
                d11 = d5;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            int i12 = i11 + 1;
            double d12 = dArr2[i12];
            if (d11 <= d12) {
                double d13 = dArr2[i11];
                double d14 = d12 - d13;
                double d15 = (d11 - d13) / d14;
                for (int i13 = 0; i13 < length2; i13++) {
                    double d16 = dArr3[i11][i13];
                    double d17 = dArr3[i12][i13];
                    double[][] dArr4 = this.f6568l;
                    dArr[i13] = P(d14, d15, d16, d17, dArr4[i11][i13], dArr4[i12][i13]) / d14;
                }
                return;
            }
            i11 = i12;
        }
    }

    @Override // v10.c
    public final double[] w() {
        return this.f6566j;
    }
}
