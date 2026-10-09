package com.google.android.material.navigationrail;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarDividerView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import qa.b0;
import qa.f;
import qa.h;
import qa.z;
import qp.m4;
import r4.d;
import z4.s1;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NavigationRailView extends NavigationBarView {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final PathInterpolator f14938c0 = new PathInterpolator(0.38f, 1.21f, 0.22f, 1.0f);
    public final int H;
    public boolean K;
    public final View L;
    public final Boolean M;
    public final Boolean N;
    public final Boolean O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f14939a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final NavigationRailFrameLayout f14940b0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f14941t;

    public NavigationRailView(Context context) {
        this(context, null);
    }

    private int getMaxChildWidth() {
        int childCount = getNavigationRailMenuView().getChildCount();
        int iMax = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getNavigationRailMenuView().getChildAt(i11);
            if (childAt.getVisibility() != 8 && !(childAt instanceof NavigationBarDividerView)) {
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
        }
        return iMax;
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    private void setExpanded(boolean z11) {
        if (this.P == z11) {
            return;
        }
        if (isLaidOut()) {
            f fVar = new f();
            fVar.f47680c = 500L;
            fVar.f47682d = f14938c0;
            h hVar = new h();
            hVar.f47680c = 100L;
            h hVar2 = new h();
            hVar2.f47680c = 100L;
            LabelMoveTransition labelMoveTransition = new LabelMoveTransition();
            h hVar3 = new h();
            hVar3.f47680c = 100L;
            int childCount = getNavigationRailMenuView().getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getNavigationRailMenuView().getChildAt(i11);
                if (childAt instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) childAt;
                    fVar.p(navigationBarItemView.getLabelGroup());
                    fVar.p(navigationBarItemView.getExpandedLabelGroup());
                    if (this.P) {
                        hVar2.c(navigationBarItemView.getExpandedLabelGroup());
                        hVar.c(navigationBarItemView.getLabelGroup());
                    } else {
                        hVar2.c(navigationBarItemView.getLabelGroup());
                        hVar.c(navigationBarItemView.getExpandedLabelGroup());
                    }
                    labelMoveTransition.c(navigationBarItemView.getExpandedLabelGroup());
                }
                hVar3.c(childAt);
            }
            b0 b0Var = new b0();
            b0Var.W(0);
            b0Var.S(fVar);
            b0Var.S(hVar);
            b0Var.S(labelMoveTransition);
            if (!this.P) {
                b0Var.S(hVar3);
            }
            b0 b0Var2 = new b0();
            b0Var2.W(0);
            b0Var2.S(hVar2);
            if (this.P) {
                b0Var2.S(hVar3);
            }
            b0 b0Var3 = new b0();
            b0Var3.W(1);
            b0Var3.S(b0Var2);
            b0Var3.S(b0Var);
            z.a((ViewGroup) getParent(), b0Var3);
        }
        this.P = z11;
        int i12 = this.S;
        int i13 = this.Q;
        int i14 = this.R;
        int i15 = this.T;
        if (z11) {
            i12 = this.V;
            i13 = this.f14939a0;
            i14 = this.U;
            i15 = this.W;
        }
        getNavigationRailMenuView().setItemGravity(i15);
        super.setItemIconGravity(i12);
        getNavigationRailMenuView().setItemSpacing(i13);
        getNavigationRailMenuView().setItemMinimumHeight(i14);
        getNavigationRailMenuView().setExpanded(z11);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public final NavigationBarMenuView a(Context context) {
        return new NavigationRailMenuView(context);
    }

    public int getCollapsedItemMinimumHeight() {
        return this.R;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getCollapsedMaxItemCount() {
        return 7;
    }

    public int getExpandedItemMinimumHeight() {
        return this.U;
    }

    public View getHeaderView() {
        return this.L;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getItemGravity() {
        return getNavigationRailMenuView().getItemGravity();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getItemIconGravity() {
        return getNavigationRailMenuView().getItemIconGravity();
    }

    public int getItemMinimumHeight() {
        return getNavigationRailMenuView().getItemMinimumHeight();
    }

    public int getItemSpacing() {
        return getNavigationRailMenuView().getItemSpacing();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return Integer.MAX_VALUE;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public boolean getSubmenuDividersEnabled() {
        return this.K;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int iMakeMeasureSpec = (View.MeasureSpec.getMode(i11) == 1073741824 || suggestedMinimumWidth <= 0) ? i11 : View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
        if (this.P) {
            measureChild(getNavigationRailMenuView(), i11, i12);
            View view = this.L;
            if (view != null) {
                measureChild(view, i11, i12);
            }
            int maxChildWidth = getMaxChildWidth();
            int iMin = Math.min(this.f14941t, View.MeasureSpec.getSize(i11));
            if (View.MeasureSpec.getMode(i11) != 1073741824) {
                int iMax = Math.max(maxChildWidth, iMin);
                View view2 = this.L;
                if (view2 != null) {
                    iMax = Math.max(iMax, view2.getMeasuredWidth());
                }
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max(getSuggestedMinimumWidth(), Math.min(iMax, this.H)), 1073741824);
            }
            if (getItemActiveIndicatorExpandedWidth() == -1) {
                NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
                int size = View.MeasureSpec.getSize(i11);
                NavigationBarMenuItemView[] navigationBarMenuItemViewArr = navigationRailMenuView.f14898t;
                if (navigationBarMenuItemViewArr != null) {
                    for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                        if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                            ((NavigationBarItemView) navigationBarMenuItemView).j(size);
                        }
                    }
                }
            }
            iMakeMeasureSpec = i11;
        }
        super.onMeasure(iMakeMeasureSpec, i12);
        if (this.f14940b0.getMeasuredHeight() < getMeasuredHeight()) {
            measureChild(this.f14940b0, iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setCollapsedItemMinimumHeight(int i11) {
        this.R = i11;
        if (this.P) {
            return;
        }
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i11);
    }

    public void setCollapsedItemSpacing(int i11) {
        this.Q = i11;
        if (this.P) {
            return;
        }
        getNavigationRailMenuView().setItemSpacing(i11);
    }

    public void setExpandedItemMinimumHeight(int i11) {
        this.U = i11;
        if (this.P) {
            ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i11);
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void setItemGravity(int i11) {
        this.T = i11;
        this.W = i11;
        super.setItemGravity(i11);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void setItemIconGravity(int i11) {
        this.S = i11;
        this.V = i11;
        super.setItemIconGravity(i11);
    }

    public void setItemMinimumHeight(int i11) {
        this.R = i11;
        this.U = i11;
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i11);
    }

    public void setItemSpacing(int i11) {
        this.Q = i11;
        this.f14939a0 = i11;
        getNavigationRailMenuView().setItemSpacing(i11);
    }

    public void setMenuGravity(int i11) {
        getNavigationRailMenuView().setMenuGravity(i11);
    }

    public void setSubmenuDividersEnabled(boolean z11) {
        if (this.K == z11) {
            return;
        }
        this.K = z11;
        getNavigationRailMenuView().setSubmenuDividersEnabled(z11);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, R.style.Widget_MaterialComponents_NavigationRailView);
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = false;
        this.R = -1;
        this.S = 0;
        this.T = 49;
        Context context2 = getContext();
        this.f14939a0 = getContext().getResources().getDimensionPixelSize(R.dimen.m3_navigation_rail_expanded_item_spacing);
        this.W = 8388627;
        this.V = 1;
        m4 m4VarE = ThemeEnforcement.e(context2, attributeSet, com.google.android.material.R.styleable.T, i11, R.style.Widget_MaterialComponents_NavigationRailView, new int[0]);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin);
        TypedArray typedArray = (TypedArray) m4VarE.f48061c;
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(1, dimensionPixelSize);
        int dimensionPixelSize3 = typedArray.getDimensionPixelSize(7, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin));
        boolean z11 = typedArray.getBoolean(14, false);
        setSubmenuDividersEnabled(typedArray.getBoolean(17, false));
        View view = (View) getMenuView();
        NavigationRailFrameLayout navigationRailFrameLayout = new NavigationRailFrameLayout(getContext());
        this.f14940b0 = navigationRailFrameLayout;
        navigationRailFrameLayout.setPaddingTop(dimensionPixelSize2);
        this.f14940b0.setScrollingEnabled(z11);
        this.f14940b0.setClipChildren(false);
        this.f14940b0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f14940b0.addView(view);
        if (!z11) {
            addView(this.f14940b0);
        } else {
            ScrollView scrollView = new ScrollView(getContext());
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.addView(this.f14940b0);
            scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(scrollView);
        }
        int resourceId = typedArray.getResourceId(6, 0);
        if (resourceId != 0) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
            View view2 = this.L;
            if (view2 != null) {
                this.f14940b0.removeView(view2);
                this.L = null;
            }
            this.L = viewInflate;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.bottomMargin = dimensionPixelSize3;
            this.f14940b0.addView(viewInflate, 0, layoutParams);
        }
        setMenuGravity(typedArray.getInt(10, 49));
        int dimensionPixelSize4 = typedArray.getDimensionPixelSize(8, -1);
        int dimensionPixelSize5 = typedArray.getDimensionPixelSize(8, -1);
        dimensionPixelSize4 = typedArray.hasValue(0) ? typedArray.getDimensionPixelSize(0, -1) : dimensionPixelSize4;
        dimensionPixelSize5 = typedArray.hasValue(3) ? typedArray.getDimensionPixelSize(3, -1) : dimensionPixelSize5;
        setCollapsedItemMinimumHeight(dimensionPixelSize4);
        setExpandedItemMinimumHeight(dimensionPixelSize5);
        this.f14941t = typedArray.getDimensionPixelSize(5, context2.getResources().getDimensionPixelSize(R.dimen.m3_navigation_rail_min_expanded_width));
        this.H = typedArray.getDimensionPixelSize(4, context2.getResources().getDimensionPixelSize(R.dimen.m3_navigation_rail_max_expanded_width));
        if (typedArray.hasValue(13)) {
            this.M = Boolean.valueOf(typedArray.getBoolean(13, false));
        }
        if (typedArray.hasValue(11)) {
            this.N = Boolean.valueOf(typedArray.getBoolean(11, false));
        }
        if (typedArray.hasValue(12)) {
            this.O = Boolean.valueOf(typedArray.getBoolean(12, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float fB = AnimationUtils.b(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f);
        float fC = AnimationUtils.c(getItemPaddingTop(), fB, dimensionPixelOffset);
        float fC2 = AnimationUtils.c(getItemPaddingBottom(), fB, dimensionPixelOffset2);
        setItemPaddingTop(Math.round(fC));
        setItemPaddingBottom(Math.round(fC2));
        setCollapsedItemSpacing(typedArray.getDimensionPixelSize(9, 0));
        setExpanded(typedArray.getBoolean(2, false));
        m4VarE.l();
        ViewUtils.b(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.navigationrail.NavigationRailView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public final v1 a(View view3, v1 v1Var, ViewUtils.RelativePadding relativePadding) {
                s1 s1Var = v1Var.f58905a;
                d dVarG = s1Var.g(519);
                d dVarG2 = s1Var.g(128);
                NavigationRailView navigationRailView = NavigationRailView.this;
                Boolean bool = navigationRailView.M;
                if (bool != null ? bool.booleanValue() : navigationRailView.getFitsSystemWindows()) {
                    relativePadding.f14750b += dVarG.f48794b;
                }
                Boolean bool2 = navigationRailView.N;
                if (bool2 != null ? bool2.booleanValue() : navigationRailView.getFitsSystemWindows()) {
                    relativePadding.f14752d += dVarG.f48796d;
                }
                Boolean bool3 = navigationRailView.O;
                if (bool3 != null ? bool3.booleanValue() : navigationRailView.getFitsSystemWindows()) {
                    if (ViewUtils.g(view3)) {
                        relativePadding.f14749a = Math.max(dVarG.f48795c, dVarG2.f48795c) + relativePadding.f14749a;
                    } else {
                        relativePadding.f14749a = Math.max(dVarG.f48793a, dVarG2.f48793a) + relativePadding.f14749a;
                    }
                }
                view3.setPaddingRelative(relativePadding.f14749a, relativePadding.f14750b, relativePadding.f14751c, relativePadding.f14752d);
                return v1Var;
            }
        });
    }
}
