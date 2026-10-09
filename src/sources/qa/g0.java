package qa;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends f0 {
    @Override // qx.b
    public final void I(View view, float f5) {
        view.setTransitionAlpha(f5);
    }

    @Override // qa.f0, qx.b
    public final void J(View view, int i11) {
        view.setTransitionVisibility(i11);
    }

    @Override // qa.f0
    public final void O(View view, int i11, int i12, int i13, int i14) {
        view.setLeftTopRightBottom(i11, i12, i13, i14);
    }

    @Override // qa.f0
    public final void P(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // qa.f0
    public final void Q(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // qx.b
    public final float u(View view) {
        return view.getTransitionAlpha();
    }
}
