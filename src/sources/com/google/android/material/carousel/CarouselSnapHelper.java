package com.google.android.material.carousel;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a2;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.k2;
import androidx.recyclerview.widget.m1;
import androidx.recyclerview.widget.r0;
import androidx.recyclerview.widget.z1;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CarouselSnapHelper extends k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14154a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f14155b;

    public static int[] a(m1 m1Var, View view, boolean z11) {
        if (!(m1Var instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) m1Var;
        int iX = carouselLayoutManager.x(carouselLayoutManager.getPosition(view), z11);
        if (carouselLayoutManager.B()) {
            return new int[]{iX, 0};
        }
        return m1Var.canScrollVertically() ? new int[]{0, iX} : new int[]{0, 0};
    }

    @Override // androidx.recyclerview.widget.k2
    public final void attachToRecyclerView(RecyclerView recyclerView) {
        super.attachToRecyclerView(recyclerView);
        this.f14155b = recyclerView;
    }

    @Override // androidx.recyclerview.widget.k2
    public final int[] calculateDistanceToFinalSnap(m1 m1Var, View view) {
        return a(m1Var, view, false);
    }

    @Override // androidx.recyclerview.widget.k2
    public final b2 createScroller(final m1 m1Var) {
        if (m1Var instanceof a2) {
            return new r0(this.f14155b.getContext()) { // from class: com.google.android.material.carousel.CarouselSnapHelper.1
                @Override // androidx.recyclerview.widget.r0
                public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    float f5;
                    float f11;
                    if (m1Var.canScrollVertically()) {
                        f5 = displayMetrics.densityDpi;
                        f11 = 50.0f;
                    } else {
                        f5 = displayMetrics.densityDpi;
                        f11 = 100.0f;
                    }
                    return f11 / f5;
                }

                @Override // androidx.recyclerview.widget.r0, androidx.recyclerview.widget.b2
                public final void onTargetFound(View view, c2 c2Var, z1 z1Var) {
                    RecyclerView recyclerView = CarouselSnapHelper.this.f14155b;
                    if (recyclerView != null) {
                        int[] iArrA = CarouselSnapHelper.a(recyclerView.getLayoutManager(), view, true);
                        int i11 = iArrA[0];
                        int i12 = iArrA[1];
                        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i11), Math.abs(i12)));
                        if (iCalculateTimeForDeceleration > 0) {
                            z1Var.b(i11, i12, this.mDecelerateInterpolator, iCalculateTimeForDeceleration);
                        }
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.k2
    public final View findSnapView(m1 m1Var) {
        int childCount = m1Var.getChildCount();
        View view = null;
        if (childCount != 0 && (m1Var instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) m1Var;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = m1Var.getChildAt(i12);
                int iAbs = Math.abs(carouselLayoutManager.x(m1Var.getPosition(childAt), false));
                if (iAbs < i11) {
                    view = childAt;
                    i11 = iAbs;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.k2
    public final int findTargetSnapPosition(m1 m1Var, int i11, int i12) {
        int itemCount;
        PointF pointFComputeScrollVectorForPosition;
        if (this.f14154a && (itemCount = m1Var.getItemCount()) != 0) {
            int childCount = m1Var.getChildCount();
            View view = null;
            boolean z11 = false;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            View view2 = null;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = m1Var.getChildAt(i15);
                if (childAt != null) {
                    CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) m1Var;
                    int iX = carouselLayoutManager.x(carouselLayoutManager.getPosition(childAt), false);
                    if (iX <= 0 && iX > i14) {
                        view2 = childAt;
                        i14 = iX;
                    }
                    if (iX >= 0 && iX < i13) {
                        view = childAt;
                        i13 = iX;
                    }
                }
            }
            boolean z12 = !m1Var.canScrollHorizontally() ? i12 <= 0 : i11 <= 0;
            if (z12 && view != null) {
                return m1Var.getPosition(view);
            }
            if (!z12 && view2 != null) {
                return m1Var.getPosition(view2);
            }
            if (z12) {
                view = view2;
            }
            if (view != null) {
                int position = m1Var.getPosition(view);
                int itemCount2 = m1Var.getItemCount();
                if ((m1Var instanceof a2) && (pointFComputeScrollVectorForPosition = ((a2) m1Var).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < CropImageView.DEFAULT_ASPECT_RATIO || pointFComputeScrollVectorForPosition.y < CropImageView.DEFAULT_ASPECT_RATIO)) {
                    z11 = true;
                }
                int i16 = position + (z11 == z12 ? -1 : 1);
                if (i16 >= 0 && i16 < itemCount) {
                    return i16;
                }
            }
        }
        return -1;
    }
}
