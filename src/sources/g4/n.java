package g4;

import android.util.SparseArray;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f28762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SparseArray f28763l;
    public SparseArray m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float[] f28764n;

    @Override // g4.q
    public final void c(float f5, float f11, float f12, int i11, int i12) {
        throw new RuntimeException("Wrong call for custom attribute");
    }

    @Override // g4.q
    public final boolean d(float f5, long j11, View view, c4.e eVar) {
        this.f28766a.r(f5, this.f28764n);
        float[] fArr = this.f28764n;
        float f11 = fArr[fArr.length - 2];
        float f12 = fArr[fArr.length - 1];
        long j12 = j11 - this.f28774i;
        if (Float.isNaN(this.f28775j)) {
            float fC = eVar.c(view, this.f28762k);
            this.f28775j = fC;
            if (Float.isNaN(fC)) {
                this.f28775j = CropImageView.DEFAULT_ASPECT_RATIO;
            }
        }
        float f13 = (float) ((((j12 * 1.0E-9d) * ((double) f11)) + ((double) this.f28775j)) % 1.0d);
        this.f28775j = f13;
        this.f28774i = j11;
        float fA = a(f13);
        this.f28773h = false;
        int i11 = 0;
        while (true) {
            float[] fArr2 = this.f28772g;
            if (i11 >= fArr2.length) {
                break;
            }
            boolean z11 = this.f28773h;
            float f14 = this.f28764n[i11];
            this.f28773h = z11 | (((double) f14) != 0.0d);
            fArr2[i11] = (f14 * fA) + f12;
            i11++;
        }
        ve.i.G((j4.b) this.f28763l.valueAt(0), view, this.f28772g);
        if (f11 != CropImageView.DEFAULT_ASPECT_RATIO) {
            this.f28773h = true;
        }
        return this.f28773h;
    }

    @Override // g4.q
    public final void e(int i11) {
        SparseArray sparseArray = this.f28763l;
        int size = sparseArray.size();
        int iC = ((j4.b) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        int i12 = iC + 2;
        this.f28764n = new float[i12];
        this.f28772g = new float[iC];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i12);
        for (int i13 = 0; i13 < size; i13++) {
            int iKeyAt = sparseArray.keyAt(i13);
            j4.b bVar = (j4.b) sparseArray.valueAt(i13);
            float[] fArr = (float[]) this.m.valueAt(i13);
            dArr[i13] = ((double) iKeyAt) * 0.01d;
            bVar.b(this.f28764n);
            int i14 = 0;
            while (true) {
                float[] fArr2 = this.f28764n;
                if (i14 < fArr2.length) {
                    dArr2[i13][i14] = fArr2[i14];
                    i14++;
                }
            }
            double[] dArr3 = dArr2[i13];
            dArr3[iC] = fArr[0];
            dArr3[iC + 1] = fArr[1];
        }
        this.f28766a = v10.c.j(i11, dArr, dArr2);
    }
}
