package com.google.android.material.appbar;

import a5.c;
import a5.g;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import jh.h;
import l4.e;
import ue.f;
import y.t0;
import z4.j0;
import z4.q;
import z4.s0;
import z4.u;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements l4.a {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f13787g0 = 0;
    public ArrayList H;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public ColorStateList O;
    public int P;
    public WeakReference Q;
    public ValueAnimator R;
    public ValueAnimator.AnimatorUpdateListener S;
    public final ArrayList T;
    public final LinkedHashSet U;
    public final long V;
    public final TimeInterpolator W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13788a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int[] f13789a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13790b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f13791b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13792c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Drawable f13793c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13794d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Integer f13795d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13796e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final float f13797e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13798f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Behavior f13799f0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public v1 f13800t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        void a(int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Behavior extends BaseBehavior<AppBarLayout> {

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class ChildScrollEffect {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class CompressChildScrollEffect extends ChildScrollEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f13813a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f13814b = new Rect();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CompressChildScrollEffect f13816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Interpolator f13817c;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollEffect {
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollFlags {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Deprecated
    public interface LiftOnScrollListener {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class LiftOnScrollProgressListener {
        public abstract void a(float f5);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final AppBarLayout C(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) arrayList.get(i11);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final float D(View view) {
            int i11;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                l4.b bVar = ((e) appBarLayout.getLayoutParams()).f39716a;
                int iZ = bVar instanceof BaseBehavior ? ((BaseBehavior) bVar).z() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iZ > downNestedPreScrollRange) && (i11 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iZ / i11) + 1.0f;
                }
            }
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final int E(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // l4.b
        public final boolean h(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // l4.b
        public boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int iN;
            l4.b bVar = ((e) view2.getLayoutParams()).f39716a;
            if (bVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) bVar).L + this.f13856e;
                if (this.f13857f == 0) {
                    iN = 0;
                } else {
                    float fD = D(view2);
                    int i11 = this.f13857f;
                    iN = f.n((int) (fD * i11), 0, i11);
                }
                int i12 = bottom - iN;
                WeakHashMap weakHashMap = s0.f58893a;
                view.offsetTopAndBottom(i12);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.N) {
                    appBarLayout.f(appBarLayout.g(view));
                }
            }
            return false;
        }

        @Override // l4.b
        public final void k(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                s0.q(coordinatorLayout, null);
            }
        }

        @Override // l4.b
        public final boolean s(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z11) {
            AppBarLayout appBarLayout;
            ArrayList arrayListO = coordinatorLayout.o(view);
            int size = arrayListO.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) arrayListO.get(i11);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i11++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f13854c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.e(false, !z11, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Y);
            this.f13857f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public static LayoutParams b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((LinearLayout.LayoutParams) layoutParams);
            layoutParams2.f13815a = 1;
            return layoutParams2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams3 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams3.f13815a = 1;
            return layoutParams3;
        }
        LayoutParams layoutParams4 = new LayoutParams(layoutParams);
        layoutParams4.f13815a = 1;
        return layoutParams4;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f13815a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f13731b);
        layoutParams.f13815a = typedArrayObtainStyledAttributes.getInt(1, 0);
        layoutParams.f13816b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new CompressChildScrollEffect();
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            layoutParams.f13817c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }

    public final void c() {
        Behavior behavior = this.f13799f0;
        BaseBehavior.SavedState savedStateM = (behavior == null || this.f13790b == -1 || this.f13798f != 0) ? null : behavior.M(k5.b.f37909b, this);
        this.f13790b = -1;
        this.f13792c = -1;
        this.f13794d = -1;
        if (savedStateM != null) {
            Behavior behavior2 = this.f13799f0;
            if (behavior2.O != null) {
                return;
            }
            behavior2.O = savedStateM;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d(int i11) {
        this.f13788a = i11;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.H;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                BaseOnOffsetChangedListener baseOnOffsetChangedListener = (BaseOnOffsetChangedListener) this.H.get(i12);
                if (baseOnOffsetChangedListener != null) {
                    baseOnOffsetChangedListener.a(i11);
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f13793c0 == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(CropImageView.DEFAULT_ASPECT_RATIO, -this.f13788a);
        this.f13793c0.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f13793c0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(boolean z11, boolean z12, boolean z13) {
        this.f13798f = (z11 ? 1 : 2) | (z12 ? 4 : 0) | (z13 ? 8 : 0);
        requestLayout();
    }

    public final boolean f(boolean z11) {
        if (this.K || this.M == z11) {
            return false;
        }
        this.M = z11;
        refreshDrawableState();
        if (!(getBackground() instanceof MaterialShapeDrawable)) {
            return true;
        }
        ColorStateList colorStateList = this.O;
        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (colorStateList != null) {
            float f11 = z11 ? 0.0f : 1.0f;
            if (z11) {
                f5 = 1.0f;
            }
            h(f11, f5);
            return true;
        }
        if (!this.N) {
            return true;
        }
        float f12 = this.f13797e0;
        float f13 = z11 ? 0.0f : f12;
        if (z11) {
            f5 = f12;
        }
        h(f13, f5);
        return true;
    }

    public final boolean g(View view) {
        int i11;
        if (this.Q == null && (i11 = this.P) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i11) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.P);
            }
            if (viewFindViewById != null) {
                this.Q = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.Q;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.f13815a = 1;
        return layoutParams;
    }

    @Override // l4.a
    public l4.b getBehavior() {
        Behavior behavior = new Behavior();
        this.f13799f0 = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i11 = this.f13792c;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = layoutParams.f13815a;
                if ((i13 & 5) != 5) {
                    if (i12 > 0) {
                        break;
                    }
                } else {
                    int i14 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i13 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i13 & 2) != 0) {
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i14 + measuredHeight;
                        }
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i12 += iMin;
                    }
                    iMin = minimumHeight + i14;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i12 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i12);
        this.f13792c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i11 = this.f13794d;
        if (i11 != -1) {
            return i11;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
                int i13 = layoutParams.f13815a;
                if ((i13 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i13 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f13794d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.P;
    }

    public MaterialShapeDrawable getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i11 = (minimumHeight * 2) + topInset;
            return i11 < getHeight() ? i11 : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i12 = (minimumHeight2 * 2) + topInset;
        return i12 < getHeight() ? i12 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.f13798f;
    }

    public Drawable getStatusBarForeground() {
        return this.f13793c0;
    }

    @Deprecated
    public float getTargetElevation() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final int getTopInset() {
        v1 v1Var = this.f13800t;
        if (v1Var != null) {
            return v1Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i11 = this.f13790b;
        if (i11 != -1) {
            return i11;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = layoutParams.f13815a;
                if ((i13 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + minimumHeight;
                if (i12 == 0 && childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
                minimumHeight = topInset;
                if ((i13 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f13790b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final void h(float f5, float f11) {
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f5, f11);
        this.R = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.V);
        this.R.setInterpolator(this.W);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.S;
        if (animatorUpdateListener != null) {
            this.R.addUpdateListener(animatorUpdateListener);
        }
        this.R.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.d(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i11) {
        if (this.f13789a0 == null) {
            this.f13789a0 = new int[4];
        }
        int[] iArr = this.f13789a0;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + iArr.length);
        boolean z11 = this.L;
        iArr[0] = z11 ? com.lingodeer.R.attr.state_liftable : -2130970015;
        iArr[1] = (z11 && this.M) ? com.lingodeer.R.attr.state_lifted : -2130970016;
        iArr[2] = z11 ? com.lingodeer.R.attr.state_collapsible : -2130970011;
        iArr[3] = (z11 && this.M) ? com.lingodeer.R.attr.state_collapsed : -2130970010;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.Q;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.Q = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        boolean z12 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    WeakHashMap weakHashMap = s0.f58893a;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.f13796e = false;
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            if (((LayoutParams) getChildAt(i15).getLayoutParams()).f13817c != null) {
                this.f13796e = true;
                break;
            }
        }
        Drawable drawable = this.f13793c0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.K) {
            return;
        }
        if (!this.N) {
            int childCount3 = getChildCount();
            int i16 = 0;
            while (true) {
                if (i16 >= childCount3) {
                    z12 = false;
                    break;
                }
                int i17 = ((LayoutParams) getChildAt(i16).getLayoutParams()).f13815a;
                if ((i17 & 1) == 1 && (i17 & 10) != 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        if (this.L != z12) {
            this.L = z12;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i12);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = f.n(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i12));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        c();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final MaterialShapeDrawable materialShapeDrawable;
        ColorStateList colorStateList;
        Context context = getContext();
        if (drawable instanceof MaterialShapeDrawable) {
            materialShapeDrawable = (MaterialShapeDrawable) drawable;
        } else {
            ColorStateList colorStateListD = DrawableUtils.d(drawable);
            if (colorStateListD == null) {
                materialShapeDrawable = null;
            } else {
                MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
                materialShapeDrawable2.r(colorStateListD);
                materialShapeDrawable = materialShapeDrawable2;
            }
        }
        if (materialShapeDrawable != null && (colorStateList = materialShapeDrawable.f15200b.f15217d) != null) {
            this.f13791b0 = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.O;
            if (colorStateList2 != null) {
                final Integer numD = MaterialColors.d(getContext(), com.lingodeer.R.attr.colorSurface);
                this.S = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        AppBarLayout appBarLayout = this.f13866a;
                        LinkedHashSet linkedHashSet = appBarLayout.U;
                        ArrayList arrayList = appBarLayout.T;
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        int iF = MaterialColors.f(appBarLayout.f13791b0, fFloatValue, colorStateList2.getDefaultColor());
                        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iF);
                        MaterialShapeDrawable materialShapeDrawable3 = materialShapeDrawable;
                        materialShapeDrawable3.r(colorStateListValueOf);
                        if (appBarLayout.f13793c0 != null && (num = appBarLayout.f13795d0) != null && num.equals(numD)) {
                            appBarLayout.f13793c0.setTint(iF);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                AppBarLayout.LiftOnScrollListener liftOnScrollListener = (AppBarLayout.LiftOnScrollListener) obj;
                                if (materialShapeDrawable3.f15200b.f15217d != null) {
                                    liftOnScrollListener.a();
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            ((AppBarLayout.LiftOnScrollProgressListener) it.next()).a(fFloatValue);
                        }
                    }
                };
            } else {
                materialShapeDrawable.n(context);
                this.S = new b(0, this, materialShapeDrawable);
            }
            drawable = materialShapeDrawable;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeUtils.b(this, f5);
    }

    public void setExpanded(boolean z11) {
        e(z11, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z11) {
        this.N = z11;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.P = -1;
        if (view != null) {
            this.Q = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.Q;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.Q = null;
    }

    public void setLiftOnScrollTargetViewId(int i11) {
        this.P = i11;
        WeakReference weakReference = this.Q;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.Q = null;
    }

    public void setLiftableOverrideEnabled(boolean z11) {
        this.K = z11;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i11) {
        if (i11 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i11);
    }

    public void setPendingAction(int i11) {
        this.f13798f = i11;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f13793c0;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f13793c0 = drawableMutate;
            if (drawableMutate instanceof MaterialShapeDrawable) {
                numValueOf = Integer.valueOf(((MaterialShapeDrawable) drawableMutate).X);
            } else {
                ColorStateList colorStateListD = DrawableUtils.d(drawableMutate);
                if (colorStateListD != null) {
                    numValueOf = Integer.valueOf(colorStateListD.getDefaultColor());
                }
            }
            this.f13795d0 = numValueOf;
            Drawable drawable3 = this.f13793c0;
            boolean z11 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f13793c0.setState(getDrawableState());
                }
                this.f13793c0.setLayoutDirection(getLayoutDirection());
                this.f13793c0.setVisible(getVisibility() == 0, false);
                this.f13793c0.setCallback(this);
            }
            if (this.f13793c0 != null && getTopInset() > 0) {
                z11 = true;
            }
            setWillNotDraw(!z11);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i11) {
        setStatusBarForeground(new ColorDrawable(i11));
    }

    public void setStatusBarForegroundResource(int i11) {
        setStatusBarForeground(h.k(getContext(), i11));
    }

    @Deprecated
    public void setTargetElevation(float f5) {
        ViewUtilsLollipop.a(this, f5);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.f13793c0;
        if (drawable != null) {
            drawable.setVisible(z11, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f13793c0;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.lingodeer.R.attr.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        public int L;
        public int M;
        public ValueAnimator N;
        public SavedState O;
        public WeakReference P;

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass2 extends z4.b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f13805d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f13806e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ BaseBehavior f13807f;

            public AnonymousClass2(CoordinatorLayout coordinatorLayout, BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
                this.f13807f = baseBehavior;
                this.f13805d = appBarLayout;
                this.f13806e = coordinatorLayout;
            }

            @Override // z4.b
            public final void d(View view, g gVar) {
                this.f58810a.onInitializeAccessibilityNodeInfo(view, gVar.f380a);
                gVar.m(ScrollView.class.getName());
                AppBarLayout appBarLayout = this.f13805d;
                if (appBarLayout.getTotalScrollRange() == 0) {
                    return;
                }
                CoordinatorLayout coordinatorLayout = this.f13806e;
                BaseBehavior baseBehavior = this.f13807f;
                View viewI = BaseBehavior.I(baseBehavior, coordinatorLayout);
                if (viewI == null) {
                    return;
                }
                int childCount = appBarLayout.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    if (((LayoutParams) appBarLayout.getChildAt(i11).getLayoutParams()).f13815a != 0) {
                        if (baseBehavior.z() != (-appBarLayout.getTotalScrollRange())) {
                            gVar.b(c.f364j);
                            gVar.u(true);
                        }
                        if (baseBehavior.z() != 0) {
                            if (!viewI.canScrollVertically(-1)) {
                                gVar.b(c.f365k);
                                gVar.u(true);
                                return;
                            } else {
                                if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                                    gVar.b(c.f365k);
                                    gVar.u(true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                }
            }

            @Override // z4.b
            public final boolean g(View view, int i11, Bundle bundle) {
                AppBarLayout appBarLayout = this.f13805d;
                if (i11 == 4096) {
                    appBarLayout.setExpanded(false);
                    return true;
                }
                if (i11 != 8192) {
                    return super.g(view, i11, bundle);
                }
                BaseBehavior baseBehavior = this.f13807f;
                if (baseBehavior.z() != 0) {
                    CoordinatorLayout coordinatorLayout = this.f13806e;
                    View viewI = BaseBehavior.I(baseBehavior, coordinatorLayout);
                    if (!viewI.canScrollVertically(-1)) {
                        appBarLayout.setExpanded(true);
                        return true;
                    }
                    int i12 = -appBarLayout.getDownNestedPreScrollRange();
                    if (i12 != 0) {
                        baseBehavior.L(coordinatorLayout, this.f13805d, viewI, i12, new int[]{0, 0});
                        return true;
                    }
                }
                return false;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static abstract class BaseDragCallback<T extends AppBarLayout> {
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static class SavedState extends k5.b {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.1
                @Override // android.os.Parcelable.ClassLoaderCreator
                public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i11) {
                    return new SavedState[i11];
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }
            };

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f13808c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f13809d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f13810e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public float f13811f;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public boolean f13812t;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f13808c = parcel.readByte() != 0;
                this.f13809d = parcel.readByte() != 0;
                this.f13810e = parcel.readInt();
                this.f13811f = parcel.readFloat();
                this.f13812t = parcel.readByte() != 0;
            }

            @Override // k5.b, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                super.writeToParcel(parcel, i11);
                parcel.writeByte(this.f13808c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f13809d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f13810e);
                parcel.writeFloat(this.f13811f);
                parcel.writeByte(this.f13812t ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f13849f = -1;
            this.H = -1;
        }

        public static View I(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if (((e) childAt.getLayoutParams()).f39716a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View K(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if ((childAt instanceof q) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005a  */
        public static void O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i11, int i12, boolean z11) {
            View childAt;
            boolean zG;
            int iAbs = Math.abs(i11);
            int childCount = appBarLayout.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i13);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i13++;
                }
            }
            if (childAt != null) {
                int i14 = ((LayoutParams) childAt.getLayoutParams()).f13815a;
                if ((i14 & 1) != 0) {
                    int minimumHeight = childAt.getMinimumHeight();
                    zG = true;
                    if (i12 <= 0 || (i14 & 12) == 0 ? (i14 & 2) == 0 || (-i11) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i11) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zG = false;
                    }
                } else {
                    zG = false;
                }
            } else {
                zG = false;
            }
            if (appBarLayout.N) {
                zG = appBarLayout.g(K(coordinatorLayout));
            }
            boolean zF = appBarLayout.f(zG);
            if (!z11) {
                if (zF) {
                    List list = (List) ((t0) coordinatorLayout.f1381b.f44814c).get(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.f1383d;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        l4.b bVar = ((e) ((View) arrayList.get(i15)).getLayoutParams()).f39716a;
                        if (bVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) bVar).f13857f == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final boolean C(View view) {
            WeakReference weakReference = this.P;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int D(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange());
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int E(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final void F(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            N(coordinatorLayout, appBarLayout);
            if (appBarLayout.N) {
                appBarLayout.f(appBarLayout.g(K(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int G(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13) {
            int top;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iZ = z();
            int i14 = 0;
            if (i12 == 0 || iZ < i12 || iZ > i13) {
                this.L = 0;
            } else {
                int iN = f.n(i11, i12, i13);
                if (iZ != iN) {
                    if (!appBarLayout.f13796e) {
                        top = iN;
                        break;
                    }
                    int iAbs = Math.abs(iN);
                    int childCount = appBarLayout.getChildCount();
                    int i15 = 0;
                    while (true) {
                        if (i15 < childCount) {
                            View childAt = appBarLayout.getChildAt(i15);
                            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                            Interpolator interpolator = layoutParams.f13817c;
                            if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i16 = layoutParams.f13815a;
                                    if ((i16 & 1) != 0) {
                                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                                        if ((i16 & 2) != 0) {
                                            topInset -= childAt.getMinimumHeight();
                                        }
                                    } else {
                                        topInset = 0;
                                    }
                                    if (childAt.getFitsSystemWindows()) {
                                        topInset -= appBarLayout.getTopInset();
                                    }
                                    if (topInset > 0) {
                                        float f5 = topInset;
                                        top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f5) * f5)) * Integer.signum(iN);
                                        break;
                                    }
                                }
                            } else {
                                i15++;
                            }
                        }
                        top = iN;
                        break;
                    }
                    boolean zB = B(top);
                    int i17 = iZ - iN;
                    this.L = iN - top;
                    int i18 = 1;
                    if (zB) {
                        int i19 = 0;
                        while (i19 < appBarLayout.getChildCount()) {
                            LayoutParams layoutParams2 = (LayoutParams) appBarLayout.getChildAt(i19).getLayoutParams();
                            CompressChildScrollEffect compressChildScrollEffect = layoutParams2.f13816b;
                            if (compressChildScrollEffect != null && (layoutParams2.f13815a & i18) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i19);
                                float fY = y();
                                Rect rect = compressChildScrollEffect.f13814b;
                                Rect rect2 = compressChildScrollEffect.f13813a;
                                childAt2.getDrawingRect(rect2);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                rect2.offset(0, -appBarLayout.getTopInset());
                                float fAbs = rect2.top - Math.abs(fY);
                                if (fAbs <= CropImageView.DEFAULT_ASPECT_RATIO) {
                                    float fM = 1.0f - f.m(Math.abs(fAbs / rect2.height()), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                                    float fHeight = (-fAbs) - ((rect2.height() * 0.3f) * (1.0f - (fM * fM)));
                                    childAt2.setTranslationY(fHeight);
                                    childAt2.getDrawingRect(rect);
                                    rect.offset(0, (int) (-fHeight));
                                    if (fHeight >= rect.height()) {
                                        childAt2.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                                    } else {
                                        childAt2.setAlpha(1.0f);
                                    }
                                    childAt2.setClipBounds(rect);
                                } else {
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                                    childAt2.setAlpha(1.0f);
                                }
                            }
                            i19++;
                            i18 = 1;
                        }
                    }
                    if (!zB && appBarLayout.f13796e) {
                        coordinatorLayout.m(appBarLayout);
                    }
                    appBarLayout.d(y());
                    O(coordinatorLayout, appBarLayout, iN, iN < iZ ? -1 : 1, false);
                    i14 = i17;
                }
            }
            if (s0.e(coordinatorLayout) != null) {
                return i14;
            }
            s0.q(coordinatorLayout, new AnonymousClass2(coordinatorLayout, this, appBarLayout));
            return i14;
        }

        public final void J(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i11) {
            int iAbs = Math.abs(z() - i11);
            float fAbs = Math.abs(CropImageView.DEFAULT_ASPECT_RATIO);
            int iRound = fAbs > CropImageView.DEFAULT_ASPECT_RATIO ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iZ = z();
            if (iZ == i11) {
                ValueAnimator valueAnimator = this.N;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.N.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.N;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.N = valueAnimator3;
                valueAnimator3.setInterpolator(com.google.android.material.animation.AnimationUtils.f13772e);
                this.N.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        this.H(coordinatorLayout, appBarLayout, ((Integer) valueAnimator4.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.N.setDuration(Math.min(iRound, 600));
            this.N.setIntValues(iZ, i11);
            this.N.start();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        public final void L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i11, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i12;
            int downNestedPreScrollRange;
            if (i11 == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i11 < 0) {
                    i12 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i12;
                } else {
                    i12 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i13 = i12;
                int i14 = downNestedPreScrollRange;
                if (i13 != i14) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = G(coordinatorLayout, appBarLayout2, z() - i11, i13, i14);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.N) {
                appBarLayout2.f(appBarLayout2.g(view));
            }
        }

        public final SavedState M(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iY = y();
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                int bottom = childAt.getBottom() + iY;
                if (childAt.getTop() + iY <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = k5.b.f37909b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z11 = iY == 0;
                    savedState.f13809d = z11;
                    savedState.f13808c = !z11 && (-iY) >= appBarLayout.getTotalScrollRange();
                    savedState.f13810e = i11;
                    savedState.f13812t = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    savedState.f13811f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iZ = z() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    i11 = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if ((layoutParams.f13815a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i12 = -iZ;
                if (top <= i12 && bottom >= i12) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i11);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int i13 = layoutParams2.f13815a;
                if ((i13 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i11 == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if ((i13 & 2) == 2) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i13 & 5) == 5) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iZ < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i13 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    }
                    if (iZ < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    J(coordinatorLayout, appBarLayout, f.n(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, l4.b
        public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i11) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.n(coordinatorLayout, appBarLayout, i11);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.O;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z11 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i12 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z11) {
                            J(coordinatorLayout, appBarLayout, i12);
                        } else {
                            H(coordinatorLayout, appBarLayout, i12);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z11) {
                            J(coordinatorLayout, appBarLayout, 0);
                        } else {
                            H(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f13808c) {
                H(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f13809d) {
                H(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f13810e);
                int i13 = -childAt.getBottom();
                if (this.O.f13812t) {
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i13;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.O.f13811f) + i13;
                }
                H(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f13798f = 0;
            this.O = null;
            B(f.n(y(), -appBarLayout.getTotalScrollRange(), 0));
            O(coordinatorLayout, appBarLayout, y(), 0, true);
            appBarLayout.d(y());
            if (s0.e(coordinatorLayout) != null) {
                return true;
            }
            s0.q(coordinatorLayout, new AnonymousClass2(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // l4.b
        public final boolean o(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((e) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.v(i11, i12, View.MeasureSpec.makeMeasureSpec(0, 0), appBarLayout);
            return true;
        }

        @Override // l4.b
        public final /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i11, int i12, int[] iArr, int i13) {
            L(coordinatorLayout, (AppBarLayout) view, view2, i12, iArr);
        }

        @Override // l4.b
        public final void r(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i13 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = G(coordinatorLayout2, appBarLayout, z() - i13, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i13 == 0 && s0.e(coordinatorLayout2) == null) {
                s0.q(coordinatorLayout2, new AnonymousClass2(coordinatorLayout2, this, appBarLayout));
            }
        }

        @Override // l4.b
        public final void t(View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                this.O = (SavedState) parcelable;
            } else {
                this.O = null;
            }
        }

        @Override // l4.b
        public final Parcelable u(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState savedStateM = M(absSavedState, (AppBarLayout) view);
            return savedStateM == null ? absSavedState : savedStateM;
        }

        @Override // l4.b
        public final boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i11, int i12) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z11 = (i11 & 2) != 0 && (appBarLayout.N || appBarLayout.M || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z11 && (valueAnimator = this.N) != null) {
                valueAnimator.cancel();
            }
            this.P = null;
            this.M = i12;
            return z11;
        }

        @Override // l4.b
        public final void w(CoordinatorLayout coordinatorLayout, View view, View view2, int i11) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.M == 0 || i11 == 1) {
                N(coordinatorLayout, appBarLayout);
                if (appBarLayout.N) {
                    appBarLayout.f(appBarLayout.g(view2));
                }
            }
            this.P = new WeakReference(view2);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public final int z() {
            return y() + this.L;
        }

        public BaseBehavior() {
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, com.lingodeer.R.style.Widget_Design_AppBarLayout), attributeSet, i11);
        this.f13790b = -1;
        this.f13792c = -1;
        this.f13794d = -1;
        this.f13798f = 0;
        this.T = new ArrayList();
        this.U = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context3, attributeSet, ViewUtilsLollipop.f13865a, i11, com.lingodeer.R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayD.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayD.getResourceId(0, 0)));
            }
            typedArrayD.recycle();
            TypedArray typedArrayD2 = ThemeEnforcement.d(context2, attributeSet, R.styleable.f13729a, i11, com.lingodeer.R.style.Widget_Design_AppBarLayout, new int[0]);
            this.O = MaterialResources.a(context2, typedArrayD2, 6);
            this.V = MotionUtils.c(context2, com.lingodeer.R.attr.motionDurationMedium2, getResources().getInteger(com.lingodeer.R.integer.app_bar_elevation_anim_duration));
            this.W = MotionUtils.d(context2, com.lingodeer.R.attr.motionEasingStandardInterpolator, com.google.android.material.animation.AnimationUtils.f13768a);
            if (typedArrayD2.hasValue(4)) {
                e(typedArrayD2.getBoolean(4, false), false, false);
            }
            if (typedArrayD2.hasValue(3)) {
                ViewUtilsLollipop.a(this, typedArrayD2.getDimensionPixelSize(3, 0));
            }
            setBackground(typedArrayD2.getDrawable(0));
            if (Build.VERSION.SDK_INT >= 26) {
                if (typedArrayD2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayD2.getBoolean(2, false));
                }
                if (typedArrayD2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayD2.getBoolean(1, false));
                }
            }
            this.f13797e0 = getResources().getDimension(com.lingodeer.R.dimen.design_appbar_elevation);
            this.N = typedArrayD2.getBoolean(5, false);
            this.P = typedArrayD2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayD2.getDrawable(8));
            typedArrayD2.recycle();
            u uVar = new u() { // from class: com.google.android.material.appbar.AppBarLayout.1
                @Override // z4.u
                public final v1 e(View view, v1 v1Var) {
                    AppBarLayout appBarLayout = AppBarLayout.this;
                    v1 v1Var2 = appBarLayout.getFitsSystemWindows() ? v1Var : null;
                    if (!Objects.equals(appBarLayout.f13800t, v1Var2)) {
                        appBarLayout.f13800t = v1Var2;
                        appBarLayout.setWillNotDraw(!(appBarLayout.f13793c0 != null && appBarLayout.getTopInset() > 0));
                        appBarLayout.requestLayout();
                    }
                    return v1Var;
                }
            };
            WeakHashMap weakHashMap = s0.f58893a;
            j0.m(this, uVar);
        } catch (Throwable th2) {
            typedArrayD.recycle();
            throw th2;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.f13815a = 1;
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
