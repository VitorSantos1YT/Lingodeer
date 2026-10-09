package z2;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f58497a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f58498b = new int[2];

    @Override // z2.z0
    public void c(View view, float[] fArr) {
        Matrix matrix = this.f58497a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f58498b;
        view.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i11, iArr[1] - i12);
        g2.f0.z(matrix, fArr);
    }
}
