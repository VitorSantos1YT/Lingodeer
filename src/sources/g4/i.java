package g4;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray f28753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f28754g;

    @Override // g4.l
    public final void b(int i11, float f5) {
        throw new RuntimeException("call of custom attribute setPoint");
    }

    @Override // g4.l
    public final void c(View view, float f5) {
        this.f28756a.r(f5, this.f28754g);
        ve.i.G((j4.b) this.f28753f.valueAt(0), view, this.f28754g);
    }

    @Override // g4.l
    public final void d(int i11) {
        SparseArray sparseArray = this.f28753f;
        int size = sparseArray.size();
        int iC = ((j4.b) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        this.f28754g = new float[iC];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iC);
        for (int i12 = 0; i12 < size; i12++) {
            int iKeyAt = sparseArray.keyAt(i12);
            j4.b bVar = (j4.b) sparseArray.valueAt(i12);
            dArr[i12] = ((double) iKeyAt) * 0.01d;
            bVar.b(this.f28754g);
            int i13 = 0;
            while (true) {
                float[] fArr = this.f28754g;
                if (i13 < fArr.length) {
                    dArr2[i12][i13] = fArr[i13];
                    i13++;
                }
            }
        }
        this.f28756a = v10.c.j(i11, dArr, dArr2);
    }
}
