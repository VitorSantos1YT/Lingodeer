package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {
    public int D0;
    public int E0;
    public final FrameLayout.LayoutParams F0;

    public NavigationRailMenuView(Context context) {
        super(context);
        this.D0 = -1;
        this.E0 = 0;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.F0 = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public final NavigationBarItemView f(Context context) {
        return new NavigationRailItemView(context);
    }

    public int getItemMinimumHeight() {
        return this.D0;
    }

    public int getItemSpacing() {
        return this.E0;
    }

    public int getMenuGravity() {
        return this.F0.gravity;
    }

    public final int h(int i11, int i12, int i13, View view) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 0);
        int childCount = getChildCount();
        int measuredHeight = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (!(childAt instanceof NavigationBarItemView)) {
                childAt.measure(i11, iMakeMeasureSpec2);
                int measuredHeight2 = childAt.getVisibility() != 8 ? childAt.getMeasuredHeight() : 0;
                i12 -= measuredHeight2;
                measuredHeight += measuredHeight2;
            }
        }
        int iMax = Math.max(i12, 0);
        if (view == null) {
            int iMax2 = iMax / Math.max(1, i13);
            int size = this.D0;
            if (size == -1) {
                size = View.MeasureSpec.getSize(i11);
            }
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax2), 0);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() == 0) {
                i15++;
            }
            if ((childAt2 instanceof NavigationBarItemView) && childAt2 != view) {
                childAt2.measure(i11, iMakeMeasureSpec);
                measuredHeight = (childAt2.getVisibility() != 8 ? childAt2.getMeasuredHeight() : 0) + measuredHeight;
            }
        }
        return (Math.max(0, i15 - 1) * this.E0) + measuredHeight;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int i15 = i13 - i11;
        int i16 = 0;
        int measuredHeight = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measuredHeight += childAt.getMeasuredHeight();
                i16++;
            }
        }
        int iMax = i16 <= 1 ? 0 : Math.max(0, Math.min((getMeasuredHeight() - measuredHeight) / (i16 - 1), this.E0));
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                int measuredHeight2 = childAt2.getMeasuredHeight();
                childAt2.layout(0, i18, i15, measuredHeight2 + i18);
                i18 += measuredHeight2 + iMax;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int iH;
        int measuredHeight;
        int size = View.MeasureSpec.getSize(i12);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        if (currentVisibleContentItemCount <= 1 || !NavigationBarMenuView.g(getLabelVisibilityMode(), currentVisibleContentItemCount)) {
            iH = h(i11, size, currentVisibleContentItemCount, null);
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            if (childAt != null) {
                int iMax = size / Math.max(1, currentVisibleContentItemCount);
                int size2 = this.D0;
                if (size2 == -1) {
                    size2 = View.MeasureSpec.getSize(i11);
                }
                childAt.measure(i11, View.MeasureSpec.makeMeasureSpec(Math.min(size2, iMax), 0));
                measuredHeight = childAt.getVisibility() != 8 ? childAt.getMeasuredHeight() : 0;
                size -= measuredHeight;
                currentVisibleContentItemCount--;
            } else {
                measuredHeight = 0;
            }
            iH = h(i11, size, currentVisibleContentItemCount, childAt) + measuredHeight;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i11), View.resolveSizeAndState(iH, i12, 0));
    }

    public void setItemMinimumHeight(int i11) {
        if (this.D0 != i11) {
            this.D0 = i11;
            requestLayout();
        }
    }

    public void setItemSpacing(int i11) {
        if (this.E0 != i11) {
            this.E0 = i11;
            requestLayout();
        }
    }

    public void setMenuGravity(int i11) {
        FrameLayout.LayoutParams layoutParams = this.F0;
        if (layoutParams.gravity != i11) {
            layoutParams.gravity = i11;
            setLayoutParams(layoutParams);
        }
    }
}
