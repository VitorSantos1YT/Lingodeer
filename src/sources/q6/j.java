package q6;

import android.graphics.Matrix;
import b1.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends c {
    public final void f(p pVar, int i11) {
        float[] fArr = this.f47478a;
        float f5 = fArr[i11];
        int i12 = i11 + 1;
        float f11 = fArr[i12];
        float[] fArr2 = (float[]) pVar.f3800b;
        fArr2[0] = f5;
        fArr2[1] = f11;
        ((Matrix) pVar.f3801c).mapPoints(fArr2);
        long jA = y.h.a(fArr2[0], fArr2[1]);
        fArr[i11] = Float.intBitsToFloat((int) (jA >> 32));
        fArr[i12] = Float.intBitsToFloat((int) (4294967295L & jA));
    }
}
