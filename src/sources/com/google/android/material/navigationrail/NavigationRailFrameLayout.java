package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NavigationRailFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14937b;

    public NavigationRailFrameLayout(Context context) {
        super(context);
        this.f14936a = 0;
        this.f14937b = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        int childCount = getChildCount();
        int measuredHeight = this.f14936a;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int iMax = Math.max(measuredHeight, childAt.getTop()) + layoutParams.topMargin;
            childAt.layout(childAt.getLeft(), iMax, childAt.getRight(), childAt.getMeasuredHeight() + iMax);
            measuredHeight = iMax + childAt.getMeasuredHeight() + layoutParams.bottomMargin;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int childCount = getChildCount();
        int measuredHeight = 0;
        View childAt = getChildAt(0);
        int size = View.MeasureSpec.getSize(i12);
        if (childCount > 1) {
            View childAt2 = getChildAt(0);
            measureChild(childAt2, i11, i12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
            measuredHeight = layoutParams.topMargin + childAt2.getMeasuredHeight() + layoutParams.bottomMargin;
            int i13 = (size - measuredHeight) - this.f14936a;
            childAt = getChildAt(1);
            if (!this.f14937b) {
                i12 = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        measureChild(childAt, i11, i12);
        setMeasuredDimension(getMeasuredWidth(), Math.max(size, this.f14936a + measuredHeight + childAt.getMeasuredHeight() + layoutParams2.bottomMargin + layoutParams2.topMargin));
    }

    public void setPaddingTop(int i11) {
        this.f14936a = i11;
    }

    public void setScrollingEnabled(boolean z11) {
        this.f14937b = z11;
    }
}
