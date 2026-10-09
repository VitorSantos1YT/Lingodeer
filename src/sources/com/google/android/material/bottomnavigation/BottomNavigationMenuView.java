package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.lingodeer.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {
    public final int D0;
    public final int E0;
    public final int F0;
    public final int G0;
    public boolean H0;
    public final ArrayList I0;

    public BottomNavigationMenuView(Context context) {
        super(context);
        this.I0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.D0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.E0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.F0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.G0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public final NavigationBarItemView f(Context context) {
        return new BottomNavigationItemView(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        int measuredWidth = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i18 = i15 - measuredWidth;
                    childAt.layout(i18 - childAt.getMeasuredWidth(), 0, i18, i16);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i16);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13;
        int iMax;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i11);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        int childCount = getChildCount();
        ArrayList arrayList = this.I0;
        arrayList.clear();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12), Integer.MIN_VALUE);
        int i16 = 0;
        if (getItemIconGravity() == 0) {
            boolean zG = NavigationBarMenuView.g(getLabelVisibilityMode(), currentVisibleContentItemCount);
            int i17 = this.F0;
            if (zG && this.H0) {
                View childAt = getChildAt(getSelectedItemPosition());
                int visibility = childAt.getVisibility();
                int iMax2 = this.G0;
                if (visibility != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, Integer.MIN_VALUE), iMakeMeasureSpec);
                    iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                }
                int i18 = currentVisibleContentItemCount - (childAt.getVisibility() != 8 ? 1 : 0);
                int iMin = Math.min(size - (this.E0 * i18), Math.min(iMax2, i17));
                int i19 = size - iMin;
                int iMin2 = Math.min(i19 / (i18 != 0 ? i18 : 1), this.D0);
                int i21 = i19 - (i18 * iMin2);
                int i22 = 0;
                while (i22 < childCount) {
                    if (getChildAt(i22).getVisibility() != 8) {
                        i15 = i22 == getSelectedItemPosition() ? iMin : iMin2;
                        if (i21 > 0) {
                            i15++;
                            i21--;
                        }
                    } else {
                        i15 = 0;
                    }
                    arrayList.add(Integer.valueOf(i15));
                    i22++;
                }
            } else {
                int iMin3 = Math.min(size / (currentVisibleContentItemCount != 0 ? currentVisibleContentItemCount : 1), i17);
                int i23 = size - (currentVisibleContentItemCount * iMin3);
                for (int i24 = 0; i24 < childCount; i24++) {
                    if (getChildAt(i24).getVisibility() == 8) {
                        i14 = 0;
                    } else if (i23 > 0) {
                        i14 = iMin3 + 1;
                        i23--;
                    } else {
                        i14 = iMin3;
                    }
                    arrayList.add(Integer.valueOf(i14));
                }
            }
            i13 = 0;
            iMax = 0;
            while (i16 < childCount) {
                View childAt2 = getChildAt(i16);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i16)).intValue(), 1073741824), iMakeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    int measuredWidth = childAt2.getMeasuredWidth() + i13;
                    iMax = Math.max(iMax, childAt2.getMeasuredHeight());
                    i13 = measuredWidth;
                }
                i16++;
            }
        } else {
            if (currentVisibleContentItemCount == 0) {
                currentVisibleContentItemCount = 1;
            }
            float f5 = size;
            float fMin = Math.min((currentVisibleContentItemCount + 3) / 10.0f, 0.9f) * f5;
            float f11 = currentVisibleContentItemCount;
            int iRound = Math.round(fMin / f11);
            int iRound2 = Math.round(f5 / f11);
            int i25 = 0;
            int iMax3 = 0;
            while (i16 < childCount) {
                View childAt3 = getChildAt(i16);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound2, Integer.MIN_VALUE), iMakeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < iRound) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound, 1073741824), iMakeMeasureSpec);
                    }
                    int measuredWidth2 = childAt3.getMeasuredWidth() + i25;
                    iMax3 = Math.max(iMax3, childAt3.getMeasuredHeight());
                    i25 = measuredWidth2;
                }
                i16++;
            }
            i13 = i25;
            iMax = iMax3;
        }
        setMeasuredDimension(i13, Math.max(iMax, getSuggestedMinimumHeight()));
    }

    public void setItemHorizontalTranslationEnabled(boolean z11) {
        this.H0 = z11;
    }
}
