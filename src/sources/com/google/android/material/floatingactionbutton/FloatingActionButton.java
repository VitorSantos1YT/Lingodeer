package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.expandable.ExpandableTransformationWidget;
import com.google.android.material.expandable.ExpandableWidgetHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l4.b;
import l4.e;
import r.s;
import r.v;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements ExpandableTransformationWidget, Shapeable, l4.a {
    public int H;
    public int K;
    public int L;
    public boolean M;
    public final Rect N;
    public final Rect O;
    public final v P;
    public final ExpandableWidgetHelper Q;
    public FloatingActionButtonImpl R;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f14518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f14519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f14520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f14521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f14522f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14523t;

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements FloatingActionButtonImpl.InternalVisibilityChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OnVisibilityChangedListener f14524a;

        public AnonymousClass1(OnVisibilityChangedListener onVisibilityChangedListener) {
            this.f14524a = onVisibilityChangedListener;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener
        public final void a() {
            this.f14524a.b();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener
        public final void b() {
            this.f14524a.a(FloatingActionButton.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class ShadowDelegateImpl implements ShadowViewDelegate {
        public ShadowDelegateImpl() {
        }

        public final void a(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Size {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class TransformationCallbackWrapper<T extends FloatingActionButton> implements FloatingActionButtonImpl.InternalTransformationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransformationCallback f14529a;

        public TransformationCallbackWrapper(TransformationCallback transformationCallback) {
            this.f14529a = transformationCallback;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback
        public final void a() {
            this.f14529a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback
        public final void b() {
            this.f14529a.a(FloatingActionButton.this);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof TransformationCallbackWrapper) && ((TransformationCallbackWrapper) obj).f14529a.equals(this.f14529a);
        }

        public final int hashCode() {
            return this.f14529a.hashCode();
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private FloatingActionButtonImpl getImpl() {
        if (this.R == null) {
            this.R = new FloatingActionButtonImpl(this, new ShadowDelegateImpl());
        }
        return this.R;
    }

    public final void c(Animator.AnimatorListener animatorListener) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f14549t == null) {
            impl.f14549t = new ArrayList();
        }
        impl.f14549t.add(animatorListener);
    }

    public final void d(Animator.AnimatorListener animatorListener) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f14548s == null) {
            impl.f14548s = new ArrayList();
        }
        impl.f14548s.add(animatorListener);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final void e(TransformationCallback transformationCallback) {
        FloatingActionButtonImpl impl = getImpl();
        TransformationCallbackWrapper transformationCallbackWrapper = new TransformationCallbackWrapper(transformationCallback);
        if (impl.f14550u == null) {
            impl.f14550u = new ArrayList();
        }
        impl.f14550u.add(transformationCallbackWrapper);
    }

    public final void f(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        int i11 = rect.left;
        Rect rect2 = this.N;
        rect.left = i11 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final int g(int i11) {
        int i12 = this.H;
        if (i12 != 0) {
            return i12;
        }
        Resources resources = getResources();
        if (i11 != -1) {
            return i11 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f14518b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f14519c;
    }

    @Override // l4.a
    public b getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().f14551v.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f14539i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f14540j;
    }

    public Drawable getContentBackground() {
        return getImpl().f14535e;
    }

    public int getCustomSize() {
        return this.H;
    }

    public int getExpandedComponentIdHint() {
        return this.Q.f14463c;
    }

    public MotionSpec getHideMotionSpec() {
        return getImpl().f14544o;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f14522f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f14522f;
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        ShapeAppearanceModel shapeAppearanceModel = getImpl().f14531a;
        shapeAppearanceModel.getClass();
        return shapeAppearanceModel;
    }

    public MotionSpec getShowMotionSpec() {
        return getImpl().f14543n;
    }

    public int getSize() {
        return this.f14523t;
    }

    public int getSizeDimension() {
        return g(this.f14523t);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f14520d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f14521e;
    }

    public boolean getUseCompatPadding() {
        return this.M;
    }

    public final void h(OnVisibilityChangedListener onVisibilityChangedListener, final boolean z11) {
        final FloatingActionButtonImpl impl = getImpl();
        final AnonymousClass1 anonymousClass1 = onVisibilityChangedListener == null ? null : new AnonymousClass1(onVisibilityChangedListener);
        FloatingActionButton floatingActionButton = impl.f14551v;
        FloatingActionButton floatingActionButton2 = impl.f14551v;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.f14547r == 1) {
                return;
            }
        } else if (impl.f14547r != 2) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton2.a(z11 ? 8 : 4, z11);
            if (anonymousClass1 != null) {
                anonymousClass1.b();
                return;
            }
            return;
        }
        MotionSpec motionSpec = impl.f14544o;
        AnimatorSet animatorSetB = motionSpec != null ? impl.b(motionSpec, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO) : impl.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.4f, 0.4f, FloatingActionButtonImpl.E, FloatingActionButtonImpl.F);
        animatorSetB.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f14556a;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator2) {
                this.f14556a = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
                floatingActionButtonImpl.f14547r = 0;
                floatingActionButtonImpl.m = null;
                if (this.f14556a) {
                    return;
                }
                FloatingActionButton floatingActionButton3 = floatingActionButtonImpl.f14551v;
                boolean z12 = z11;
                floatingActionButton3.a(z12 ? 8 : 4, z12);
                InternalVisibilityChangedListener internalVisibilityChangedListener = anonymousClass1;
                if (internalVisibilityChangedListener != null) {
                    internalVisibilityChangedListener.b();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator2) {
                FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
                floatingActionButtonImpl.f14551v.a(0, z11);
                floatingActionButtonImpl.f14547r = 1;
                floatingActionButtonImpl.m = animator2;
                this.f14556a = false;
            }
        });
        ArrayList arrayList = impl.f14549t;
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                animatorSetB.addListener((Animator.AnimatorListener) obj);
            }
        }
        animatorSetB.start();
    }

    public final boolean i() {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f14551v.getVisibility() == 0) {
            if (impl.f14547r != 1) {
                return false;
            }
        } else if (impl.f14547r == 2) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.material.expandable.ExpandableWidget
    public final boolean isExpanded() {
        return this.Q.f14462b;
    }

    public final boolean j() {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f14551v.getVisibility() != 0) {
            if (impl.f14547r != 2) {
                return false;
            }
        } else if (impl.f14547r == 1) {
            return false;
        }
        return true;
    }

    public final void k() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f14520d;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f14521e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(s.c(colorForState, mode));
    }

    public final void l(OnVisibilityChangedListener onVisibilityChangedListener, final boolean z11) {
        final FloatingActionButtonImpl impl = getImpl();
        final AnonymousClass1 anonymousClass1 = onVisibilityChangedListener == null ? null : new AnonymousClass1(onVisibilityChangedListener);
        FloatingActionButton floatingActionButton = impl.f14551v;
        Matrix matrix = impl.A;
        FloatingActionButton floatingActionButton2 = impl.f14551v;
        if (floatingActionButton.getVisibility() != 0) {
            if (impl.f14547r == 2) {
                return;
            }
        } else if (impl.f14547r != 1) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        int i11 = 0;
        boolean z12 = impl.f14543n == null;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, z11);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f14545p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            if (anonymousClass1 != null) {
                anonymousClass1.a();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
            floatingActionButton.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
            floatingActionButton.setScaleY(z12 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z12 ? 0.4f : 0.0f);
            if (z12) {
                f5 = 0.4f;
            }
            impl.f14545p = f5;
            impl.a(f5, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        MotionSpec motionSpec = impl.f14543n;
        AnimatorSet animatorSetB = motionSpec != null ? impl.b(motionSpec, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, FloatingActionButtonImpl.C, FloatingActionButtonImpl.D);
        animatorSetB.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
                floatingActionButtonImpl.f14547r = 0;
                floatingActionButtonImpl.m = null;
                InternalVisibilityChangedListener internalVisibilityChangedListener = anonymousClass1;
                if (internalVisibilityChangedListener != null) {
                    internalVisibilityChangedListener.a();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator2) {
                FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
                floatingActionButtonImpl.f14551v.a(0, z11);
                floatingActionButtonImpl.f14547r = 2;
                floatingActionButtonImpl.m = animator2;
            }
        });
        ArrayList arrayList = impl.f14548s;
        if (arrayList != null) {
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                animatorSetB.addListener((Animator.AnimatorListener) obj);
            }
        }
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        FloatingActionButtonImpl impl = getImpl();
        MaterialShapeDrawable materialShapeDrawable = impl.f14532b;
        if (materialShapeDrawable != null) {
            MaterialShapeUtils.c(impl.f14551v, materialShapeDrawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().f14551v.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i11, int i12) {
        int sizeDimension = getSizeDimension();
        this.K = (sizeDimension - this.L) / 2;
        getImpl().h();
        int iMin = Math.min(View.resolveSize(sizeDimension, i11), View.resolveSize(sizeDimension, i12));
        Rect rect = this.N;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f37910a);
        Bundle bundle = (Bundle) extendableSavedState.f15512c.get("expandableWidgetHelper");
        bundle.getClass();
        ExpandableWidgetHelper expandableWidgetHelper = this.Q;
        expandableWidgetHelper.getClass();
        expandableWidgetHelper.f14462b = bundle.getBoolean("expanded", false);
        expandableWidgetHelper.f14463c = bundle.getInt("expandedComponentIdHint", 0);
        if (expandableWidgetHelper.f14462b) {
            FloatingActionButton floatingActionButton = expandableWidgetHelper.f14461a;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).m(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        ExpandableWidgetHelper expandableWidgetHelper = this.Q;
        expandableWidgetHelper.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", expandableWidgetHelper.f14462b);
        bundle.putInt("expandedComponentIdHint", expandableWidgetHelper.f14463c);
        extendableSavedState.f15512c.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.O;
            f(rect);
            FloatingActionButtonImpl floatingActionButtonImpl = this.R;
            int i11 = -(floatingActionButtonImpl.f14536f ? Math.max((floatingActionButtonImpl.f14541k - floatingActionButtonImpl.f14551v.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i11, i11);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f14518b != colorStateList) {
            this.f14518b = colorStateList;
            FloatingActionButtonImpl impl = getImpl();
            MaterialShapeDrawable materialShapeDrawable = impl.f14532b;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintList(colorStateList);
            }
            BorderDrawable borderDrawable = impl.f14534d;
            if (borderDrawable != null) {
                if (colorStateList != null) {
                    borderDrawable.m = colorStateList.getColorForState(borderDrawable.getState(), borderDrawable.m);
                }
                borderDrawable.f14486p = colorStateList;
                borderDrawable.f14484n = true;
                borderDrawable.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f14519c != mode) {
            this.f14519c = mode;
            MaterialShapeDrawable materialShapeDrawable = getImpl().f14532b;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f5) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f14538h != f5) {
            impl.f14538h = f5;
            impl.e(f5, impl.f14539i, impl.f14540j);
        }
    }

    public void setCompatElevationResource(int i11) {
        setCompatElevation(getResources().getDimension(i11));
    }

    public void setCompatHoveredFocusedTranslationZ(float f5) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f14539i != f5) {
            impl.f14539i = f5;
            impl.e(impl.f14538h, f5, impl.f14540j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i11) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i11));
    }

    public void setCompatPressedTranslationZ(float f5) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f14540j != f5) {
            impl.f14540j = f5;
            impl.e(impl.f14538h, impl.f14539i, f5);
        }
    }

    public void setCompatPressedTranslationZResource(int i11) {
        setCompatPressedTranslationZ(getResources().getDimension(i11));
    }

    public void setCustomSize(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i11 != this.H) {
            this.H = i11;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeDrawable materialShapeDrawable = getImpl().f14532b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.q(f5);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z11) {
        if (z11 != getImpl().f14536f) {
            getImpl().f14536f = z11;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i11) {
        this.Q.f14463c = i11;
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        getImpl().f14544o = motionSpec;
    }

    public void setHideMotionSpecResource(int i11) {
        setHideMotionSpec(MotionSpec.b(getContext(), i11));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            FloatingActionButtonImpl impl = getImpl();
            float f5 = impl.f14545p;
            impl.f14545p = f5;
            Matrix matrix = impl.A;
            impl.a(f5, matrix);
            impl.f14551v.setImageMatrix(matrix);
            if (this.f14520d != null) {
                k();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i11) {
        this.P.c(i11);
        k();
    }

    public void setMaxImageSize(int i11) {
        this.L = i11;
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f14546q != i11) {
            impl.f14546q = i11;
            float f5 = impl.f14545p;
            impl.f14545p = f5;
            Matrix matrix = impl.A;
            impl.a(f5, matrix);
            impl.f14551v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i11) {
        setRippleColor(ColorStateList.valueOf(i11));
    }

    @Override // android.view.View
    public void setScaleX(float f5) {
        super.setScaleX(f5);
        ArrayList arrayList = getImpl().f14550u;
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((FloatingActionButtonImpl.InternalTransformationCallback) obj).b();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f5) {
        super.setScaleY(f5);
        ArrayList arrayList = getImpl().f14550u;
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((FloatingActionButtonImpl.InternalTransformationCallback) obj).b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z11) {
        FloatingActionButtonImpl impl = getImpl();
        impl.f14537g = z11;
        impl.h();
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        getImpl().g(shapeAppearanceModel);
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        getImpl().f14543n = motionSpec;
    }

    public void setShowMotionSpecResource(int i11) {
        setShowMotionSpec(MotionSpec.b(getContext(), i11));
    }

    public void setSize(int i11) {
        this.H = 0;
        if (i11 != this.f14523t) {
            this.f14523t = i11;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f14520d != colorStateList) {
            this.f14520d = colorStateList;
            k();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f14521e != mode) {
            this.f14521e = mode;
            k();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f5) {
        super.setTranslationX(f5);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationY(float f5) {
        super.setTranslationY(f5);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationZ(float f5) {
        super.setTranslationZ(f5);
        getImpl().f();
    }

    public void setUseCompatPadding(boolean z11) {
        if (this.M != z11) {
            this.M = z11;
            getImpl().h();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class BaseBehavior<T extends FloatingActionButton> extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f14526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f14527b;

        public BaseBehavior() {
            this.f14527b = true;
        }

        @Override // l4.b
        public final boolean g(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.N;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // l4.b
        public final void i(e eVar) {
            if (eVar.f39723h == 0) {
                eVar.f39723h = 80;
            }
        }

        @Override // l4.b
        public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                y(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof e ? ((e) layoutParams).f39716a instanceof BottomSheetBehavior : false) {
                    z(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // l4.b
        public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i11) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListO = coordinatorLayout.o(floatingActionButton);
            int size = arrayListO.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) arrayListO.get(i13);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof e ? ((e) layoutParams).f39716a instanceof BottomSheetBehavior : false) && z(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (y(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.u(floatingActionButton, i11);
            Rect rect = floatingActionButton.N;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                e eVar = (e) floatingActionButton.getLayoutParams();
                int i14 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) eVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) eVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) {
                    i12 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) eVar).topMargin) {
                    i12 = -rect.top;
                }
                if (i12 != 0) {
                    WeakHashMap weakHashMap = s0.f58893a;
                    floatingActionButton.offsetTopAndBottom(i12);
                }
                if (i14 != 0) {
                    WeakHashMap weakHashMap2 = s0.f58893a;
                    floatingActionButton.offsetLeftAndRight(i14);
                }
            }
            return true;
        }

        public final boolean y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            e eVar = (e) floatingActionButton.getLayoutParams();
            if (!this.f14527b || eVar.f39721f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.f14526a == null) {
                this.f14526a = new Rect();
            }
            Rect rect = this.f14526a;
            DescendantOffsetUtils.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        public final boolean z(View view, FloatingActionButton floatingActionButton) {
            e eVar = (e) floatingActionButton.getLayoutParams();
            if (!this.f14527b || eVar.f39721f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.f13761t);
            this.f14527b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f14522f != colorStateList) {
            this.f14522f = colorStateList;
            FloatingActionButtonImpl impl = getImpl();
            ColorStateList colorStateList2 = this.f14522f;
            RippleDrawable rippleDrawable = impl.f14533c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(RippleUtils.c(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(RippleUtils.c(colorStateList2));
            }
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i11) {
        Drawable drawable;
        Drawable layerDrawable;
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_Design_FloatingActionButton), attributeSet, i11);
        this.N = new Rect();
        this.O = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.f13760s, i11, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f14518b = MaterialResources.a(context2, typedArrayD, 1);
        this.f14519c = ViewUtils.h(typedArrayD.getInt(2, -1), null);
        this.f14522f = MaterialResources.a(context2, typedArrayD, 12);
        this.f14523t = typedArrayD.getInt(7, -1);
        this.H = typedArrayD.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(3, 0);
        float dimension = typedArrayD.getDimension(4, CropImageView.DEFAULT_ASPECT_RATIO);
        float dimension2 = typedArrayD.getDimension(9, CropImageView.DEFAULT_ASPECT_RATIO);
        float dimension3 = typedArrayD.getDimension(11, CropImageView.DEFAULT_ASPECT_RATIO);
        this.M = typedArrayD.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayD.getDimensionPixelSize(10, 0));
        MotionSpec motionSpecA = MotionSpec.a(context2, typedArrayD, 15);
        MotionSpec motionSpecA2 = MotionSpec.a(context2, typedArrayD, 8);
        ShapeAppearanceModel shapeAppearanceModelA = ShapeAppearanceModel.c(context2, attributeSet, i11, R.style.Widget_Design_FloatingActionButton, ShapeAppearanceModel.m).a();
        boolean z11 = typedArrayD.getBoolean(5, false);
        setEnabled(typedArrayD.getBoolean(0, true));
        typedArrayD.recycle();
        v vVar = new v(this);
        this.P = vVar;
        vVar.b(attributeSet, i11);
        this.Q = new ExpandableWidgetHelper(this);
        getImpl().g(shapeAppearanceModelA);
        FloatingActionButtonImpl impl = getImpl();
        ColorStateList colorStateList = this.f14518b;
        PorterDuff.Mode mode = this.f14519c;
        ColorStateList colorStateList2 = this.f14522f;
        FloatingActionButton floatingActionButton = impl.f14551v;
        ShapeAppearanceModel shapeAppearanceModel = impl.f14531a;
        shapeAppearanceModel.getClass();
        FloatingActionButtonImpl.AlwaysStatefulMaterialShapeDrawable alwaysStatefulMaterialShapeDrawable = new FloatingActionButtonImpl.AlwaysStatefulMaterialShapeDrawable(shapeAppearanceModel);
        impl.f14532b = alwaysStatefulMaterialShapeDrawable;
        alwaysStatefulMaterialShapeDrawable.setTintList(colorStateList);
        if (mode != null) {
            impl.f14532b.setTintMode(mode);
        }
        impl.f14532b.n(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            ShapeAppearanceModel shapeAppearanceModel2 = impl.f14531a;
            shapeAppearanceModel2.getClass();
            BorderDrawable borderDrawable = new BorderDrawable(shapeAppearanceModel2);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            borderDrawable.f14480i = color;
            borderDrawable.f14481j = color2;
            borderDrawable.f14482k = color3;
            borderDrawable.f14483l = color4;
            float f5 = dimensionPixelSize;
            if (borderDrawable.f14479h != f5) {
                borderDrawable.f14479h = f5;
                borderDrawable.f14473b.setStrokeWidth(f5 * 1.3333f);
                borderDrawable.f14484n = true;
                borderDrawable.invalidateSelf();
            }
            if (colorStateList != null) {
                borderDrawable.m = colorStateList.getColorForState(borderDrawable.getState(), borderDrawable.m);
            }
            borderDrawable.f14486p = colorStateList;
            borderDrawable.f14484n = true;
            borderDrawable.invalidateSelf();
            impl.f14534d = borderDrawable;
            BorderDrawable borderDrawable2 = impl.f14534d;
            borderDrawable2.getClass();
            MaterialShapeDrawable materialShapeDrawable = impl.f14532b;
            materialShapeDrawable.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{borderDrawable2, materialShapeDrawable});
            drawable = null;
        } else {
            drawable = null;
            impl.f14534d = null;
            layerDrawable = impl.f14532b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.c(colorStateList2), layerDrawable, drawable);
        impl.f14533c = rippleDrawable;
        impl.f14535e = rippleDrawable;
        getImpl().f14541k = dimensionPixelSize2;
        FloatingActionButtonImpl impl2 = getImpl();
        if (impl2.f14538h != dimension) {
            impl2.f14538h = dimension;
            impl2.e(dimension, impl2.f14539i, impl2.f14540j);
        }
        FloatingActionButtonImpl impl3 = getImpl();
        if (impl3.f14539i != dimension2) {
            impl3.f14539i = dimension2;
            impl3.e(impl3.f14538h, dimension2, impl3.f14540j);
        }
        FloatingActionButtonImpl impl4 = getImpl();
        if (impl4.f14540j != dimension3) {
            impl4.f14540j = dimension3;
            impl4.e(impl4.f14538h, impl4.f14539i, dimension3);
        }
        getImpl().f14543n = motionSpecA;
        getImpl().f14544o = motionSpecA2;
        getImpl().f14536f = z11;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class OnVisibilityChangedListener {
        public void b() {
        }

        public void a(FloatingActionButton floatingActionButton) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
    }
}
