package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class ViewOffsetBehavior<V extends View> extends l4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewOffsetHelper f13859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13860b = 0;

    public ViewOffsetBehavior() {
    }

    public void A(CoordinatorLayout coordinatorLayout, View view, int i11) {
        coordinatorLayout.u(view, i11);
    }

    public boolean B(int i11) {
        ViewOffsetHelper viewOffsetHelper = this.f13859a;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.b(i11);
        }
        this.f13860b = i11;
        return false;
    }

    @Override // l4.b
    public boolean n(CoordinatorLayout coordinatorLayout, View view, int i11) {
        A(coordinatorLayout, view, i11);
        if (this.f13859a == null) {
            this.f13859a = new ViewOffsetHelper(view);
        }
        ViewOffsetHelper viewOffsetHelper = this.f13859a;
        View view2 = viewOffsetHelper.f13861a;
        viewOffsetHelper.f13862b = view2.getTop();
        viewOffsetHelper.f13863c = view2.getLeft();
        this.f13859a.a();
        int i12 = this.f13860b;
        if (i12 == 0) {
            return true;
        }
        this.f13859a.b(i12);
        this.f13860b = 0;
        return true;
    }

    public int y() {
        ViewOffsetHelper viewOffsetHelper = this.f13859a;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.f13864d;
        }
        return 0;
    }

    public int z() {
        return y();
    }

    public ViewOffsetBehavior(int i11) {
    }
}
