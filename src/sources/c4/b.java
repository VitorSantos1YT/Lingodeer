package c4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends v10.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final double[] f6537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a[] f6538k;

    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [c4.b, java.lang.Object] */
    public b(int[] iArr, double[] dArr, double[][] dArr2) {
        boolean z11;
        int i11;
        double[] dArr3;
        double d5;
        double[] dArr4 = dArr;
        ?? obj = new Object();
        obj.f6537j = dArr4;
        int i12 = 1;
        obj.f6538k = new a[dArr4.length - 1];
        char c11 = 0;
        int i13 = 0;
        int i14 = 1;
        int i15 = 1;
        b bVar = obj;
        while (true) {
            a[] aVarArr = bVar.f6538k;
            if (i13 >= aVarArr.length) {
                return;
            }
            int i16 = iArr[i13];
            if (i16 == 0) {
                i15 = 3;
            } else if (i16 == i12) {
                i14 = i12;
                i15 = i14;
            } else {
                if (i16 != 2) {
                    if (i16 == 3) {
                        if (i14 != i12) {
                            i14 = i12;
                        }
                        i15 = i14;
                    } else if (i16 == 4) {
                        i15 = 4;
                    } else if (i16 == 5) {
                        i15 = 5;
                    }
                }
                i14 = 2;
                i15 = i14;
            }
            double d11 = dArr4[i13];
            int i17 = i13 + 1;
            double d12 = dArr4[i17];
            double[] dArr5 = dArr2[i13];
            double d13 = dArr5[c11];
            int i18 = i12;
            int i19 = i13;
            double d14 = dArr5[i18];
            double[] dArr6 = dArr2[i17];
            boolean z12 = c11;
            double d15 = dArr6[z12 ? 1 : 0];
            double d16 = dArr6[i18];
            a aVar = new a();
            aVar.f6536r = z12;
            int i21 = i14;
            double d17 = d15 - d13;
            double d18 = d16 - d14;
            boolean z13 = i18;
            if (i15 != z13) {
                if (i15 == 4) {
                    aVar.f6535q = d18 > 0.0d;
                } else if (i15 != 5) {
                    aVar.f6535q = false;
                } else {
                    aVar.f6535q = d18 < 0.0d;
                }
                z11 = true;
            } else {
                aVar.f6535q = z13;
                z11 = z13;
            }
            aVar.f6522c = r16;
            aVar.f6523d = d12;
            double d19 = d12 - d11;
            double d20 = 1.0d / d19;
            aVar.f6528i = d20;
            if (3 == i15) {
                aVar.f6536r = z11;
            }
            if (aVar.f6536r || Math.abs(d17) < 0.001d || Math.abs(d18) < 0.001d) {
                i11 = 1;
                aVar.f6536r = true;
                aVar.f6524e = d13;
                aVar.f6525f = d15;
                aVar.f6526g = d14;
                aVar.f6527h = d16;
                double dHypot = Math.hypot(d18, d17);
                aVar.f6521b = dHypot;
                aVar.f6532n = dHypot * d20;
                aVar.f6531l = d17 / d19;
                aVar.m = d18 / d19;
            } else {
                double[] dArr7 = new double[101];
                aVar.f6520a = dArr7;
                boolean z14 = aVar.f6535q;
                aVar.f6529j = ((double) (z14 ? -1 : 1)) * d17;
                aVar.f6530k = ((double) (z14 ? 1 : -1)) * d18;
                aVar.f6531l = z14 ? d15 : d13;
                aVar.m = z14 ? d14 : d16;
                double d21 = d14 - d16;
                double dHypot2 = 0.0d;
                double d22 = 0.0d;
                double d23 = 0.0d;
                int i22 = 0;
                while (true) {
                    dArr3 = a.f6519s;
                    if (i22 >= 91) {
                        break;
                    }
                    double[] dArr8 = dArr7;
                    double d24 = d21;
                    double radians = Math.toRadians((((double) i22) * 90.0d) / ((double) 90));
                    double dSin = d17 * Math.sin(radians);
                    double dCos = Math.cos(radians) * d24;
                    if (i22 > 0) {
                        d5 = dCos;
                        dHypot2 += Math.hypot(dSin - d22, d5 - d23);
                        dArr3[i22] = dHypot2;
                    } else {
                        d5 = dCos;
                    }
                    i22++;
                    d22 = dSin;
                    d21 = d24;
                    d23 = d5;
                    dArr7 = dArr8;
                }
                double[] dArr9 = dArr7;
                aVar.f6521b = dHypot2;
                for (int i23 = 0; i23 < 91; i23++) {
                    dArr3[i23] = dArr3[i23] / dHypot2;
                }
                for (int i24 = 0; i24 < 101; i24++) {
                    double d25 = ((double) i24) / ((double) 100);
                    int iBinarySearch = Arrays.binarySearch(dArr3, d25);
                    if (iBinarySearch >= 0) {
                        dArr9[i24] = ((double) iBinarySearch) / ((double) 90);
                    } else if (iBinarySearch == -1) {
                        dArr9[i24] = 0.0d;
                    } else {
                        int i25 = -iBinarySearch;
                        int i26 = i25 - 2;
                        double d26 = dArr3[i26];
                        dArr9[i24] = (((d25 - d26) / (dArr3[i25 - 1] - d26)) + ((double) i26)) / ((double) 90);
                    }
                }
                aVar.f6532n = aVar.f6521b * aVar.f6528i;
                i11 = 1;
            }
            aVarArr[i19] = aVar;
            bVar = this;
            dArr4 = dArr;
            i12 = i11;
            i13 = i17;
            i14 = i21;
            c11 = 0;
        }
    }

    @Override // v10.c
    public final double p(double d5) {
        a[] aVarArr = this.f6538k;
        a aVar = aVarArr[0];
        double d11 = aVar.f6522c;
        if (d5 < d11) {
            double d12 = d5 - d11;
            if (aVar.f6536r) {
                return (d12 * aVarArr[0].f6531l) + aVar.c(d11);
            }
            aVar.g(d11);
            return (aVarArr[0].a() * d12) + aVarArr[0].e();
        }
        if (d5 > aVarArr[aVarArr.length - 1].f6523d) {
            double d13 = aVarArr[aVarArr.length - 1].f6523d;
            double d14 = d5 - d13;
            int length = aVarArr.length - 1;
            return (d14 * aVarArr[length].f6531l) + aVarArr[length].c(d13);
        }
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            a aVar2 = aVarArr[i11];
            if (d5 <= aVar2.f6523d) {
                if (aVar2.f6536r) {
                    return aVar2.c(d5);
                }
                aVar2.g(d5);
                return aVarArr[i11].e();
            }
        }
        return Double.NaN;
    }

    @Override // v10.c
    public final void q(double d5, double[] dArr) {
        a[] aVarArr = this.f6538k;
        a aVar = aVarArr[0];
        double d11 = aVar.f6522c;
        if (d5 < d11) {
            double d12 = d5 - d11;
            if (aVar.f6536r) {
                double dC = aVar.c(d11);
                a aVar2 = aVarArr[0];
                dArr[0] = (aVar2.f6531l * d12) + dC;
                dArr[1] = (d12 * aVarArr[0].m) + aVar2.d(d11);
                return;
            }
            aVar.g(d11);
            dArr[0] = (aVarArr[0].a() * d12) + aVarArr[0].e();
            dArr[1] = (aVarArr[0].b() * d12) + aVarArr[0].f();
            return;
        }
        if (d5 <= aVarArr[aVarArr.length - 1].f6523d) {
            for (int i11 = 0; i11 < aVarArr.length; i11++) {
                a aVar3 = aVarArr[i11];
                if (d5 <= aVar3.f6523d) {
                    if (aVar3.f6536r) {
                        dArr[0] = aVar3.c(d5);
                        dArr[1] = aVarArr[i11].d(d5);
                        return;
                    } else {
                        aVar3.g(d5);
                        dArr[0] = aVarArr[i11].e();
                        dArr[1] = aVarArr[i11].f();
                        return;
                    }
                }
            }
            return;
        }
        double d13 = aVarArr[aVarArr.length - 1].f6523d;
        double d14 = d5 - d13;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (aVar4.f6536r) {
            double dC2 = aVar4.c(d13);
            a aVar5 = aVarArr[length];
            dArr[0] = (aVar5.f6531l * d14) + dC2;
            dArr[1] = (d14 * aVarArr[length].m) + aVar5.d(d13);
            return;
        }
        aVar4.g(d5);
        dArr[0] = (aVarArr[length].a() * d14) + aVarArr[length].e();
        dArr[1] = (aVarArr[length].b() * d14) + aVarArr[length].f();
    }

    @Override // v10.c
    public final void r(double d5, float[] fArr) {
        a[] aVarArr = this.f6538k;
        a aVar = aVarArr[0];
        double d11 = aVar.f6522c;
        if (d5 < d11) {
            double d12 = d5 - d11;
            if (aVar.f6536r) {
                double dC = aVar.c(d11);
                a aVar2 = aVarArr[0];
                fArr[0] = (float) ((aVar2.f6531l * d12) + dC);
                fArr[1] = (float) ((d12 * aVarArr[0].m) + aVar2.d(d11));
                return;
            }
            aVar.g(d11);
            fArr[0] = (float) ((aVarArr[0].a() * d12) + aVarArr[0].e());
            fArr[1] = (float) ((aVarArr[0].b() * d12) + aVarArr[0].f());
            return;
        }
        if (d5 <= aVarArr[aVarArr.length - 1].f6523d) {
            for (int i11 = 0; i11 < aVarArr.length; i11++) {
                a aVar3 = aVarArr[i11];
                if (d5 <= aVar3.f6523d) {
                    if (aVar3.f6536r) {
                        fArr[0] = (float) aVar3.c(d5);
                        fArr[1] = (float) aVarArr[i11].d(d5);
                        return;
                    } else {
                        aVar3.g(d5);
                        fArr[0] = (float) aVarArr[i11].e();
                        fArr[1] = (float) aVarArr[i11].f();
                        return;
                    }
                }
            }
            return;
        }
        double d13 = aVarArr[aVarArr.length - 1].f6523d;
        double d14 = d5 - d13;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (!aVar4.f6536r) {
            aVar4.g(d5);
            fArr[0] = (float) aVarArr[length].e();
            fArr[1] = (float) aVarArr[length].f();
        } else {
            double dC2 = aVar4.c(d13);
            a aVar5 = aVarArr[length];
            fArr[0] = (float) ((aVar5.f6531l * d14) + dC2);
            fArr[1] = (float) ((d14 * aVarArr[length].m) + aVar5.d(d13));
        }
    }

    @Override // v10.c
    public final double t(double d5) {
        a[] aVarArr = this.f6538k;
        double d11 = aVarArr[0].f6522c;
        if (d5 < d11) {
            d5 = d11;
        }
        if (d5 > aVarArr[aVarArr.length - 1].f6523d) {
            d5 = aVarArr[aVarArr.length - 1].f6523d;
        }
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            a aVar = aVarArr[i11];
            if (d5 <= aVar.f6523d) {
                if (aVar.f6536r) {
                    return aVar.f6531l;
                }
                aVar.g(d5);
                return aVarArr[i11].a();
            }
        }
        return Double.NaN;
    }

    @Override // v10.c
    public final void u(double d5, double[] dArr) {
        a[] aVarArr = this.f6538k;
        double d11 = aVarArr[0].f6522c;
        if (d5 < d11) {
            d5 = d11;
        } else if (d5 > aVarArr[aVarArr.length - 1].f6523d) {
            d5 = aVarArr[aVarArr.length - 1].f6523d;
        }
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            a aVar = aVarArr[i11];
            if (d5 <= aVar.f6523d) {
                if (aVar.f6536r) {
                    dArr[0] = aVar.f6531l;
                    dArr[1] = aVar.m;
                    return;
                } else {
                    aVar.g(d5);
                    dArr[0] = aVarArr[i11].a();
                    dArr[1] = aVarArr[i11].b();
                    return;
                }
            }
        }
    }

    @Override // v10.c
    public final double[] w() {
        return this.f6537j;
    }
}
