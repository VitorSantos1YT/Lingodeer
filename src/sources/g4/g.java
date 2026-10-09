package g4;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c4.f f28746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28748c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28749d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28750e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f28751f = new ArrayList();

    public static g c(String str) {
        if (str.startsWith("CUSTOM")) {
            d dVar = new d();
            dVar.f28743g = new float[1];
            return dVar;
        }
        switch (str) {
            case "rotationX":
                return new c(3);
            case "rotationY":
                return new c(4);
            case "translationX":
                return new c(7);
            case "translationY":
                return new c(8);
            case "translationZ":
                return new c(9);
            case "progress":
                f fVar = new f();
                fVar.f28745g = false;
                return fVar;
            case "scaleX":
                return new c(5);
            case "scaleY":
                return new c(6);
            case "waveVariesBy":
                return new c(0);
            case "rotation":
                return new c(2);
            case "elevation":
                return new c(1);
            case "transitionPathRotate":
                return new e();
            case "alpha":
                return new c(0);
            case "waveOffset":
                return new c(0);
            default:
                return null;
        }
    }

    public final float a(float f5) {
        c4.f fVar = this.f28746a;
        v10.c cVar = fVar.f6555g;
        if (cVar != null) {
            cVar.q(f5, fVar.f6556h);
        } else {
            double[] dArr = fVar.f6556h;
            dArr[0] = fVar.f6553e[0];
            dArr[1] = fVar.f6554f[0];
            dArr[2] = fVar.f6550b[0];
        }
        double[] dArr2 = fVar.f6556h;
        return (float) ((fVar.f6549a.D(f5, dArr2[1]) * fVar.f6556h[2]) + dArr2[0]);
    }

    public final float b(float f5) {
        double dT;
        double d5;
        double dSignum;
        double dSin;
        c4.f fVar = this.f28746a;
        a.a aVar = fVar.f6549a;
        v10.c cVar = fVar.f6555g;
        double d11 = 0.0d;
        if (cVar != null) {
            double d12 = f5;
            cVar.u(d12, fVar.f6557i);
            fVar.f6555g.q(d12, fVar.f6556h);
        } else {
            double[] dArr = fVar.f6557i;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d13 = f5;
        double D = aVar.D(d13, fVar.f6556h[1]);
        double d14 = fVar.f6556h[1];
        double d15 = fVar.f6557i[1];
        double dA = aVar.A(d13) + d14;
        if (d13 > 0.0d) {
            if (d13 >= 1.0d) {
                d11 = 1.0d;
            } else {
                int iBinarySearch = Arrays.binarySearch((double[]) aVar.f7d, d13);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                float[] fArr = (float[]) aVar.f6c;
                float f11 = fArr[iBinarySearch];
                int i11 = iBinarySearch - 1;
                float f12 = fArr[i11];
                double d16 = f11 - f12;
                double[] dArr2 = (double[]) aVar.f7d;
                double d17 = dArr2[iBinarySearch];
                double d18 = dArr2[i11];
                double d19 = d16 / (d17 - d18);
                d11 = (((double) f12) - (d19 * d18)) + (d13 * d19);
            }
        }
        double d20 = d11 + d15;
        double d21 = 2.0d;
        switch (aVar.f5b) {
            case 1:
                dT = 0.0d;
                break;
            case 2:
                d5 = d20 * 4.0d;
                dSignum = Math.signum((((dA * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                dT = d5 * dSignum;
                break;
            case 3:
                dT = d20 * 2.0d;
                break;
            case 4:
                dSin = -d20;
                dT = dSin * d21;
                break;
            case 5:
                d21 = (-6.283185307179586d) * d20;
                dSin = Math.sin(6.283185307179586d * dA);
                dT = dSin * d21;
                break;
            case 6:
                dT = d20 * 4.0d * ((((dA * 4.0d) + 2.0d) % 4.0d) - 2.0d);
                break;
            case 7:
                dT = ((c4.i) aVar.f9f).t(dA % 1.0d);
                break;
            default:
                d5 = d20 * 6.283185307179586d;
                dSignum = Math.cos(6.283185307179586d * dA);
                dT = d5 * dSignum;
                break;
        }
        double[] dArr3 = fVar.f6557i;
        return (float) ((dT * fVar.f6556h[2]) + (D * dArr3[r5]) + dArr3[0]);
    }

    public abstract void e(View view, float f5);

    public final void f() {
        int i11;
        int i12;
        double d5;
        int i13;
        ArrayList arrayList = this.f28751f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new b4.e(2));
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        int i14 = this.f28748c;
        String str = this.f28749d;
        c4.f fVar = new c4.f();
        a.a aVar = new a.a(2);
        aVar.f6c = new float[0];
        aVar.f7d = new double[0];
        fVar.f6549a = aVar;
        aVar.f5b = i14;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            i12 = 0;
            i11 = 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i15 = 0;
            d5 = 1.0d;
            while (iIndexOf2 != -1) {
                dArr3[i15] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i15++;
            }
            dArr3[i15] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr3, i15 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d11 = 1.0d / ((double) length2);
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, 1);
            double[] dArr5 = new double[length];
            int i16 = 0;
            while (i16 < dArrCopyOf.length) {
                double d12 = dArrCopyOf[i16];
                int i17 = i16 + length2;
                dArr4[i17][0] = d12;
                double d13 = d11;
                double d14 = ((double) i16) * d13;
                dArr5[i17] = d14;
                if (i16 > 0) {
                    int i18 = (length2 * 2) + i16;
                    dArr4[i18][0] = d12 + 1.0d;
                    dArr5[i18] = d14 + 1.0d;
                    int i19 = i16 - 1;
                    dArr4[i19][0] = (d12 - 1.0d) - d13;
                    dArr5[i19] = (d14 - 1.0d) - d13;
                }
                i16++;
                d11 = d13;
            }
            aVar.f9f = new c4.i(dArr5, dArr4);
        } else {
            i11 = 1;
            i12 = 0;
            d5 = 1.0d;
        }
        fVar.f6550b = new float[size];
        fVar.f6551c = new double[size];
        fVar.f6552d = new float[size];
        fVar.f6553e = new float[size];
        fVar.f6554f = new float[size];
        float[] fArr = new float[size];
        this.f28746a = fVar;
        int i21 = i12;
        int i22 = i21;
        for (int size2 = arrayList.size(); i22 < size2; size2 = size2) {
            Object obj = arrayList.get(i22);
            i22++;
            c4.g gVar = (c4.g) obj;
            float f5 = gVar.f6561d;
            dArr[i21] = ((double) f5) * 0.01d;
            double[] dArr6 = dArr2[i21];
            float f11 = gVar.f6559b;
            dArr6[i12] = f11;
            float f12 = gVar.f6560c;
            dArr6[i11] = f12;
            float f13 = gVar.f6562e;
            dArr6[r4] = f13;
            c4.f fVar2 = this.f28746a;
            fVar2.f6551c[i21] = ((double) gVar.f6558a) / 100.0d;
            fVar2.f6552d[i21] = f5;
            fVar2.f6553e[i21] = f12;
            fVar2.f6554f[i21] = f13;
            fVar2.f6550b[i21] = f11;
            i21++;
            arrayList = arrayList;
        }
        c4.f fVar3 = this.f28746a;
        float[] fArr2 = fVar3.f6552d;
        a.a aVar2 = fVar3.f6549a;
        double[] dArr7 = fVar3.f6551c;
        int length3 = dArr7.length;
        int[] iArr = new int[2];
        iArr[i11] = 3;
        iArr[i12] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        float[] fArr3 = fVar3.f6550b;
        fVar3.f6556h = new double[fArr3.length + 2];
        fVar3.f6557i = new double[fArr3.length + 2];
        double d15 = 0.0d;
        if (dArr7[i12] > 0.0d) {
            aVar2.f(0.0d, fArr2[i12]);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d5) {
            aVar2.f(d5, fArr2[length4]);
        }
        for (int i23 = i12; i23 < dArr8.length; i23++) {
            double[] dArr9 = dArr8[i23];
            dArr9[i12] = fVar3.f6553e[i23];
            dArr9[i11] = fVar3.f6554f[i23];
            dArr9[2] = fArr3[i23];
            aVar2.f(dArr7[i23], fArr2[i23]);
        }
        double d16 = 0.0d;
        int i24 = i12;
        while (true) {
            float[] fArr4 = (float[]) aVar2.f6c;
            if (i24 >= fArr4.length) {
                break;
            }
            d16 += (double) fArr4[i24];
            i24++;
        }
        double d17 = 0.0d;
        int i25 = i11;
        while (true) {
            float[] fArr5 = (float[]) aVar2.f6c;
            if (i25 >= fArr5.length) {
                break;
            }
            int i26 = i25 - 1;
            float f14 = (fArr5[i26] + fArr5[i25]) / 2.0f;
            double d18 = d15;
            double[] dArr10 = (double[]) aVar2.f7d;
            d17 = ((dArr10[i25] - dArr10[i26]) * ((double) f14)) + d17;
            i25++;
            d15 = d18;
        }
        double d19 = d15;
        int i27 = i12;
        while (true) {
            float[] fArr6 = (float[]) aVar2.f6c;
            if (i27 >= fArr6.length) {
                break;
            }
            fArr6[i27] = fArr6[i27] * ((float) (d16 / d17));
            i27++;
        }
        ((double[]) aVar2.f8e)[i12] = d19;
        int i28 = i11;
        while (true) {
            float[] fArr7 = (float[]) aVar2.f6c;
            if (i28 >= fArr7.length) {
                break;
            }
            int i29 = i28 - 1;
            float f15 = (fArr7[i29] + fArr7[i28]) / 2.0f;
            double[] dArr11 = (double[]) aVar2.f7d;
            double d20 = dArr11[i28] - dArr11[i29];
            double[] dArr12 = (double[]) aVar2.f8e;
            dArr12[i28] = (d20 * ((double) f15)) + dArr12[i29];
            i28++;
        }
        if (dArr7.length > i11) {
            i13 = i12;
            fVar3.f6555g = v10.c.j(i13, dArr7, dArr8);
        } else {
            i13 = i12;
            fVar3.f6555g = null;
        }
        v10.c.j(i13, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f28747b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        ArrayList arrayList = this.f28751f;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            c4.g gVar = (c4.g) obj;
            StringBuilder sbR = defpackage.e.r(string, "[");
            sbR.append(gVar.f6558a);
            sbR.append(" , ");
            sbR.append(decimalFormat.format(gVar.f6559b));
            sbR.append("] ");
            string = sbR.toString();
        }
        return string;
    }

    public void d(j4.b bVar) {
    }
}
