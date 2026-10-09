package l4;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public boolean g(View view, Rect rect) {
        return false;
    }

    public boolean h(View view, View view2) {
        return false;
    }

    public boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean n(CoordinatorLayout coordinatorLayout, View view, int i11) {
        return false;
    }

    public boolean o(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13) {
        return false;
    }

    public boolean p(View view) {
        return false;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13, int[] iArr) {
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
    }

    public boolean s(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z11) {
        return false;
    }

    public Parcelable u(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i11, int i12) {
        return false;
    }

    public boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public void l() {
    }

    public void i(e eVar) {
    }

    public void k(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void t(View view, Parcelable parcelable) {
    }

    public void w(CoordinatorLayout coordinatorLayout, View view, View view2, int i11) {
    }

    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i11, int i12, int[] iArr, int i13) {
    }
}
