package g4;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v10.c f28756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f28757b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f28758c = new float[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f28760e;

    public final float a(float f5) {
        return (float) this.f28756a.p(f5);
    }

    public void b(int i11, float f5) {
        int[] iArr = this.f28757b;
        if (iArr.length < this.f28759d + 1) {
            this.f28757b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f28758c;
            this.f28758c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f28757b;
        int i12 = this.f28759d;
        iArr2[i12] = i11;
        this.f28758c[i12] = f5;
        this.f28759d = i12 + 1;
    }

    public abstract void c(View view, float f5);

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    public void d(int i11) {
        int i12 = this.f28759d;
        if (i12 == 0) {
            return;
        }
        int[] iArr = this.f28757b;
        float[] fArr = this.f28758c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i12 - 1;
        iArr2[1] = 0;
        int i13 = 2;
        while (i13 > 0) {
            int i14 = i13 - 1;
            int i15 = iArr2[i14];
            int i16 = i13 - 2;
            int i17 = iArr2[i16];
            if (i15 < i17) {
                int i18 = iArr[i17];
                int i19 = i15;
                int i21 = i19;
                while (i19 < i17) {
                    int i22 = iArr[i19];
                    if (i22 <= i18) {
                        int i23 = iArr[i21];
                        iArr[i21] = i22;
                        iArr[i19] = i23;
                        float f5 = fArr[i21];
                        fArr[i21] = fArr[i19];
                        fArr[i19] = f5;
                        i21++;
                    }
                    i19++;
                }
                int i24 = iArr[i21];
                iArr[i21] = iArr[i17];
                iArr[i17] = i24;
                float f11 = fArr[i21];
                fArr[i21] = fArr[i17];
                fArr[i17] = f11;
                iArr2[i16] = i21 - 1;
                iArr2[i14] = i15;
                int i25 = i13 + 1;
                iArr2[i13] = i17;
                i13 += 2;
                iArr2[i25] = i21 + 1;
            } else {
                i13 = i16;
            }
        }
        int i26 = 1;
        for (int i27 = 1; i27 < this.f28759d; i27++) {
            int[] iArr3 = this.f28757b;
            if (iArr3[i27 - 1] != iArr3[i27]) {
                i26++;
            }
        }
        double[] dArr = new double[i26];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i26, 1);
        int i28 = 0;
        for (int i29 = 0; i29 < this.f28759d; i29++) {
            if (i29 > 0) {
                int[] iArr4 = this.f28757b;
                if (iArr4[i29] != iArr4[i29 - 1]) {
                    dArr[i28] = ((double) this.f28757b[i29]) * 0.01d;
                    dArr2[i28][0] = this.f28758c[i29];
                    i28++;
                }
            } else {
                dArr[i28] = ((double) this.f28757b[i29]) * 0.01d;
                dArr2[i28][0] = this.f28758c[i29];
                i28++;
            }
        }
        this.f28756a = v10.c.j(i11, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f28760e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i11 = 0; i11 < this.f28759d; i11++) {
            StringBuilder sbR = defpackage.e.r(string, "[");
            sbR.append(this.f28757b[i11]);
            sbR.append(" , ");
            sbR.append(decimalFormat.format(this.f28758c[i11]));
            sbR.append("] ");
            string = sbR.toString();
        }
        return string;
    }
}
