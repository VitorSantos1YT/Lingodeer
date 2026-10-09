package c4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends v10.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double[] f6563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double[][] f6564k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double[] f6565l;

    @Override // v10.c
    public final double p(double d5) {
        double d11;
        double d12;
        double dT;
        double[][] dArr = this.f6564k;
        double[] dArr2 = this.f6563j;
        int length = dArr2.length;
        double d13 = dArr2[0];
        if (d5 <= d13) {
            d11 = dArr[0][0];
            d12 = d5 - d13;
            dT = t(d13);
        } else {
            int i11 = length - 1;
            double d14 = dArr2[i11];
            if (d5 < d14) {
                int i12 = 0;
                while (i12 < i11) {
                    double d15 = dArr2[i12];
                    if (d5 == d15) {
                        return dArr[i12][0];
                    }
                    int i13 = i12 + 1;
                    double d16 = dArr2[i13];
                    if (d5 < d16) {
                        double d17 = (d5 - d15) / (d16 - d15);
                        return (dArr[i13][0] * d17) + ((1.0d - d17) * dArr[i12][0]);
                    }
                    i12 = i13;
                }
                return 0.0d;
            }
            d11 = dArr[i11][0];
            d12 = d5 - d14;
            dT = t(d14);
        }
        return (dT * d12) + d11;
    }

    @Override // v10.c
    public final void q(double d5, double[] dArr) {
        double[] dArr2 = this.f6565l;
        double[] dArr3 = this.f6563j;
        int length = dArr3.length;
        double[][] dArr4 = this.f6564k;
        int i11 = 0;
        int length2 = dArr4[0].length;
        double d11 = dArr3[0];
        if (d5 <= d11) {
            u(d11, dArr2);
            for (int i12 = 0; i12 < length2; i12++) {
                dArr[i12] = ((d5 - dArr3[0]) * dArr2[i12]) + dArr4[0][i12];
            }
            return;
        }
        int i13 = length - 1;
        double d12 = dArr3[i13];
        if (d5 >= d12) {
            u(d12, dArr2);
            while (i11 < length2) {
                dArr[i11] = ((d5 - dArr3[i13]) * dArr2[i11]) + dArr4[i13][i11];
                i11++;
            }
            return;
        }
        int i14 = 0;
        while (i14 < length - 1) {
            if (d5 == dArr3[i14]) {
                for (int i15 = 0; i15 < length2; i15++) {
                    dArr[i15] = dArr4[i14][i15];
                }
            }
            int i16 = i14 + 1;
            double d13 = dArr3[i16];
            if (d5 < d13) {
                double d14 = dArr3[i14];
                double d15 = (d5 - d14) / (d13 - d14);
                while (i11 < length2) {
                    dArr[i11] = (dArr4[i16][i11] * d15) + ((1.0d - d15) * dArr4[i14][i11]);
                    i11++;
                }
                return;
            }
            i14 = i16;
        }
    }

    @Override // v10.c
    public final void r(double d5, float[] fArr) {
        double[] dArr = this.f6565l;
        double[] dArr2 = this.f6563j;
        int length = dArr2.length;
        double[][] dArr3 = this.f6564k;
        int i11 = 0;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        if (d5 <= d11) {
            u(d11, dArr);
            for (int i12 = 0; i12 < length2; i12++) {
                fArr[i12] = (float) (((d5 - dArr2[0]) * dArr[i12]) + dArr3[0][i12]);
            }
            return;
        }
        int i13 = length - 1;
        double d12 = dArr2[i13];
        if (d5 >= d12) {
            u(d12, dArr);
            while (i11 < length2) {
                fArr[i11] = (float) (((d5 - dArr2[i13]) * dArr[i11]) + dArr3[i13][i11]);
                i11++;
            }
            return;
        }
        int i14 = 0;
        while (i14 < length - 1) {
            if (d5 == dArr2[i14]) {
                for (int i15 = 0; i15 < length2; i15++) {
                    fArr[i15] = (float) dArr3[i14][i15];
                }
            }
            int i16 = i14 + 1;
            double d13 = dArr2[i16];
            if (d5 < d13) {
                double d14 = dArr2[i14];
                double d15 = (d5 - d14) / (d13 - d14);
                while (i11 < length2) {
                    fArr[i11] = (float) ((dArr3[i16][i11] * d15) + ((1.0d - d15) * dArr3[i14][i11]));
                    i11++;
                }
                return;
            }
            i14 = i16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v6 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // v10.c
    public final double t(double d5) {
        double[] dArr = this.f6563j;
        int length = dArr.length;
        double d11 = dArr[0];
        if (d5 < d11) {
            d5 = d11;
        } else {
            d11 = dArr[length - 1];
            if (d5 >= d11) {
                d5 = d11;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            int i12 = i11 + 1;
            double d12 = dArr[i12];
            if (d5 <= d12) {
                double d13 = d12 - dArr[i11];
                double[][] dArr2 = this.f6564k;
                return (dArr2[i12][0] - dArr2[i11][0]) / d13;
            }
            i11 = i12;
        }
        return 0.0d;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000f A[PHI: r5
      0x000f: PHI (r5v6 double) = (r5v0 double), (r5v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // v10.c
    public final void u(double d5, double[] dArr) {
        double[] dArr2 = this.f6563j;
        int length = dArr2.length;
        double[][] dArr3 = this.f6564k;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        if (d5 <= d11) {
            d5 = d11;
        } else {
            d11 = dArr2[length - 1];
            if (d5 >= d11) {
                d5 = d11;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            int i12 = i11 + 1;
            double d12 = dArr2[i12];
            if (d5 <= d12) {
                double d13 = d12 - dArr2[i11];
                for (int i13 = 0; i13 < length2; i13++) {
                    dArr[i13] = (dArr3[i12][i13] - dArr3[i11][i13]) / d13;
                }
                return;
            }
            i11 = i12;
        }
    }

    @Override // v10.c
    public final double[] w() {
        return this.f6563j;
    }
}
