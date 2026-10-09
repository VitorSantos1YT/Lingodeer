package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class LeftSheetDelegate extends SheetDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior f15348a;

    public LeftSheetDelegate(SideSheetBehavior sideSheetBehavior) {
        this.f15348a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final float b(int i11) {
        float fE = e();
        return (i11 - fE) / (d() - fE);
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int d() {
        SideSheetBehavior sideSheetBehavior = this.f15348a;
        return Math.max(0, sideSheetBehavior.P + sideSheetBehavior.Q);
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int e() {
        SideSheetBehavior sideSheetBehavior = this.f15348a;
        return (-sideSheetBehavior.N) - sideSheetBehavior.Q;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int f() {
        return this.f15348a.Q;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int g() {
        return -this.f15348a.N;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int h(View view) {
        return view.getRight() + this.f15348a.Q;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int j() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean k(float f5) {
        return f5 > CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean l(View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean m(float f5, float f11) {
        if (Math.abs(f5) <= Math.abs(f11)) {
            return false;
        }
        float fAbs = Math.abs(f5);
        this.f15348a.getClass();
        return fAbs > ((float) 500);
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean n(View view, float f5) {
        float left = view.getLeft();
        SideSheetBehavior sideSheetBehavior = this.f15348a;
        float fAbs = Math.abs((f5 * sideSheetBehavior.M) + left);
        sideSheetBehavior.getClass();
        return fAbs > 0.5f;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        marginLayoutParams.leftMargin = i11;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i11, int i12) {
        if (i11 <= this.f15348a.O) {
            marginLayoutParams.leftMargin = i12;
        }
    }
}
