package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.logging.type.LogSeverity;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import k5.b;
import l4.e;
import r.p2;
import y.t0;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class BottomAppBar extends Toolbar implements l4.a {
    public static final /* synthetic */ int W0 = 0;
    public final MaterialShapeDrawable A0;
    public AnimatorSet B0;
    public AnimatorSet C0;
    public int D0;
    public int E0;
    public int F0;
    public final int G0;
    public int H0;
    public int I0;
    public final boolean J0;
    public boolean K0;
    public final boolean L0;
    public final boolean M0;
    public final boolean N0;
    public boolean O0;
    public boolean P0;
    public Behavior Q0;
    public int R0;
    public int S0;
    public int T0;
    public final AnimatorListenerAdapter U0;
    public final TransformationCallback V0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Integer f13941z0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface AnimationListener {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAlignmentMode {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnchorMode {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnimationMode {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MenuAlignmentMode {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SavedState extends b {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomappbar.BottomAppBar.SavedState.1
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
        public int f13960c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f13961d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13960c = parcel.readInt();
            this.f13961d = parcel.readInt() != 0;
        }

        @Override // k5.b, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f13960c);
            parcel.writeInt(this.f13961d ? 1 : 0);
        }
    }

    public BottomAppBar(Context context) {
        this(context, null);
    }

    public static void L(BottomAppBar bottomAppBar, View view) {
        e eVar = (e) view.getLayoutParams();
        eVar.f39719d = 17;
        int i11 = bottomAppBar.F0;
        if (i11 == 1) {
            eVar.f39719d = 49;
        }
        if (i11 == 0) {
            eVar.f39719d |= 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.R0;
    }

    private int getFabAlignmentAnimationDuration() {
        return MotionUtils.c(getContext(), R.attr.motionDurationLong2, LogSeverity.NOTICE_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return E(this.D0);
    }

    private float getFabTranslationY() {
        if (this.F0 == 1) {
            return -getTopEdgeTreatment().f13965d;
        }
        View viewC = C();
        return viewC != null ? (-((getMeasuredHeight() + getBottomInset()) - viewC.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.T0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.S0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
        return (BottomAppBarTopEdgeTreatment) this.A0.f15200b.f15214a.f15253i;
    }

    public final View C() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        List list = (List) ((t0) coordinatorLayout.f1381b.f44814c).get(this);
        ArrayList arrayList = coordinatorLayout.f1383d;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            View view = (View) obj;
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final int D(ActionMenuView actionMenuView, int i11, boolean z11) {
        int i12 = 0;
        if (this.I0 != 1 && (i11 != 1 || !z11)) {
            return 0;
        }
        boolean z12 = getLayoutDirection() == 1;
        int measuredWidth = z12 ? getMeasuredWidth() : 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if ((childAt.getLayoutParams() instanceof p2) && (((p2) childAt.getLayoutParams()).f48622a & 8388615) == 8388611) {
                measuredWidth = z12 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = z12 ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i14 = z12 ? this.S0 : -this.T0;
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!z12) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
            i12 = dimensionPixelOffset;
        }
        return measuredWidth - ((right + i14) + i12);
    }

    public final float E(int i11) {
        boolean z11 = getLayoutDirection() == 1;
        if (i11 != 1) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        View viewC = C();
        int i12 = z11 ? this.T0 : this.S0;
        return ((getMeasuredWidth() / 2) - ((this.H0 == -1 || viewC == null) ? this.G0 + i12 : ((viewC.getMeasuredWidth() / 2) + this.H0) + i12)) * (z11 ? -1 : 1);
    }

    public final boolean F() {
        View viewC = C();
        FloatingActionButton floatingActionButton = viewC instanceof FloatingActionButton ? (FloatingActionButton) viewC : null;
        return floatingActionButton != null && floatingActionButton.j();
    }

    public final void G(final int i11, final boolean z11) {
        if (!isLaidOut()) {
            this.O0 = false;
            return;
        }
        AnimatorSet animatorSet = this.C0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!F()) {
            i11 = 0;
            z11 = false;
        }
        final ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
            if (Math.abs(actionMenuView.getTranslationX() - D(actionMenuView, i11, z11)) > 1.0f) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", CropImageView.DEFAULT_ASPECT_RATIO);
                objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                objectAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.7

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public boolean f13949a;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        this.f13949a = true;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        if (this.f13949a) {
                            return;
                        }
                        BottomAppBar.this.K(actionMenuView, i11, z11, false);
                    }
                });
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                arrayList.add(animatorSet2);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(objectAnimatorOfFloat);
            }
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(arrayList);
        this.C0 = animatorSet3;
        animatorSet3.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i12 = BottomAppBar.W0;
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.O0 = false;
                bottomAppBar.C0 = null;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                int i12 = BottomAppBar.W0;
            }
        });
        this.C0.start();
    }

    public final void H() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.C0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (F()) {
            K(actionMenuView, this.D0, this.P0, false);
        } else {
            K(actionMenuView, 0, false, false);
        }
    }

    public final void I() {
        getTopEdgeTreatment().f13966e = getFabTranslationX();
        this.A0.s((this.P0 && F() && this.F0 == 1) ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO);
        View viewC = C();
        if (viewC != null) {
            viewC.setTranslationY(getFabTranslationY());
            viewC.setTranslationX(getFabTranslationX());
        }
    }

    public final void J(int i11) {
        float f5 = i11;
        if (f5 != getTopEdgeTreatment().f13964c) {
            getTopEdgeTreatment().f13964c = f5;
            this.A0.invalidateSelf();
        }
    }

    public final void K(final ActionMenuView actionMenuView, final int i11, final boolean z11, boolean z12) {
        Runnable runnable = new Runnable() { // from class: com.google.android.material.bottomappbar.BottomAppBar.8
            @Override // java.lang.Runnable
            public final void run() {
                int i12 = i11;
                boolean z13 = z11;
                BottomAppBar bottomAppBar = BottomAppBar.this;
                ActionMenuView actionMenuView2 = actionMenuView;
                actionMenuView2.setTranslationX(bottomAppBar.D(actionMenuView2, i12, z13));
            }
        };
        if (z12) {
            actionMenuView.post(runnable);
        } else {
            runnable.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.A0.f15200b.f15219f;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f13965d;
    }

    public int getFabAlignmentMode() {
        return this.D0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.H0;
    }

    public int getFabAnchorMode() {
        return this.F0;
    }

    public int getFabAnimationMode() {
        return this.E0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f13963b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f13962a;
    }

    public boolean getHideOnScroll() {
        return this.K0;
    }

    public int getMenuAlignmentMode() {
        return this.I0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.c(this, this.A0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            AnimatorSet animatorSet = this.C0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.B0;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            I();
            View viewC = C();
            if (viewC != null && viewC.isLaidOut()) {
                viewC.post(new a(viewC, 0));
            }
        }
        H();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f37910a);
        this.D0 = savedState.f13960c;
        this.P0 = savedState.f13961d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13960c = this.D0;
        savedState.f13961d = this.P0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.A0.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f5) {
        if (f5 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().d(f5);
            this.A0.invalidateSelf();
            I();
        }
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        MaterialShapeDrawable materialShapeDrawable = this.A0;
        materialShapeDrawable.q(f5);
        int iJ = materialShapeDrawable.f15200b.f15228p - materialShapeDrawable.j();
        Behavior behavior = getBehavior();
        behavior.M = iJ;
        if (behavior.L == 1) {
            setTranslationY(behavior.f13911f + iJ);
        }
    }

    public void setFabAlignmentMode(final int i11) {
        this.O0 = true;
        G(i11, this.P0);
        if (this.D0 != i11 && isLaidOut()) {
            AnimatorSet animatorSet = this.B0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.E0 == 1) {
                View viewC = C();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewC instanceof FloatingActionButton ? (FloatingActionButton) viewC : null, "translationX", E(i11));
                objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
                arrayList.add(objectAnimatorOfFloat);
            } else {
                View viewC2 = C();
                FloatingActionButton floatingActionButton = viewC2 instanceof FloatingActionButton ? (FloatingActionButton) viewC2 : null;
                if (floatingActionButton != null && !floatingActionButton.i()) {
                    floatingActionButton.h(new FloatingActionButton.OnVisibilityChangedListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5

                        /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$5$1, reason: invalid class name */
                        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
                        class AnonymousClass1 extends FloatingActionButton.OnVisibilityChangedListener {
                            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
                            public final void b() {
                                int i11 = BottomAppBar.W0;
                            }
                        }

                        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
                        public final void a(FloatingActionButton floatingActionButton2) {
                            int i12 = BottomAppBar.W0;
                            floatingActionButton2.setTranslationX(BottomAppBar.this.E(i11));
                            floatingActionButton2.l(new AnonymousClass1(), true);
                        }
                    }, true);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            animatorSet2.setInterpolator(MotionUtils.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f13768a));
            this.B0 = animatorSet2;
            animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    int i12 = BottomAppBar.W0;
                    BottomAppBar.this.B0 = null;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    int i12 = BottomAppBar.W0;
                }
            });
            this.B0.start();
        }
        this.D0 = i11;
    }

    public void setFabAlignmentModeEndMargin(int i11) {
        if (this.H0 != i11) {
            this.H0 = i11;
            I();
        }
    }

    public void setFabAnchorMode(int i11) {
        this.F0 = i11;
        I();
        View viewC = C();
        if (viewC != null) {
            L(this, viewC);
            viewC.requestLayout();
            this.A0.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i11) {
        this.E0 = i11;
    }

    public void setFabCornerSize(float f5) {
        if (f5 != getTopEdgeTreatment().f13967f) {
            getTopEdgeTreatment().f13967f = f5;
            this.A0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f5) {
        if (f5 != getFabCradleMargin()) {
            getTopEdgeTreatment().f13963b = f5;
            this.A0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f5) {
        if (f5 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f13962a = f5;
            this.A0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z11) {
        this.K0 = z11;
    }

    public void setMenuAlignmentMode(int i11) {
        if (this.I0 != i11) {
            this.I0 = i11;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                K(actionMenuView, this.D0, F(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f13941z0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f13941z0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i11) {
        this.f13941z0 = Integer.valueOf(i11);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    @Override // l4.a
    public Behavior getBehavior() {
        if (this.Q0 == null) {
            this.Q0 = new Behavior();
        }
        return this.Q0;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect O;
        public WeakReference P;
        public int Q;
        public final View.OnLayoutChangeListener R;

        public Behavior() {
            this.R = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    Behavior behavior = Behavior.this;
                    Rect rect = behavior.O;
                    BottomAppBar bottomAppBar = (BottomAppBar) behavior.P.get();
                    if (bottomAppBar != null) {
                        int i19 = bottomAppBar.G0;
                        if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                            int height = view.getHeight();
                            if (view instanceof FloatingActionButton) {
                                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                                floatingActionButton.f(rect);
                                int iHeight = rect.height();
                                bottomAppBar.J(iHeight);
                                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f15249e.a(new RectF(rect)));
                                height = iHeight;
                            }
                            e eVar = (e) view.getLayoutParams();
                            if (behavior.Q == 0) {
                                if (bottomAppBar.F0 == 1) {
                                    ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                                }
                                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = bottomAppBar.getLeftInset();
                                ((ViewGroup.MarginLayoutParams) eVar).rightMargin = bottomAppBar.getRightInset();
                                if (view.getLayoutDirection() == 1) {
                                    ((ViewGroup.MarginLayoutParams) eVar).leftMargin += i19;
                                } else {
                                    ((ViewGroup.MarginLayoutParams) eVar).rightMargin += i19;
                                }
                            }
                            int i21 = BottomAppBar.W0;
                            bottomAppBar.I();
                            return;
                        }
                    }
                    view.removeOnLayoutChangeListener(this);
                }
            };
            this.O = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, l4.b
        public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i11) {
            final BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.P = new WeakReference(bottomAppBar);
            int i12 = BottomAppBar.W0;
            View viewC = bottomAppBar.C();
            if (viewC != null && !viewC.isLaidOut()) {
                BottomAppBar.L(bottomAppBar, viewC);
                this.Q = ((ViewGroup.MarginLayoutParams) ((e) viewC.getLayoutParams())).bottomMargin;
                if (viewC instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewC;
                    if (bottomAppBar.F0 == 0 && bottomAppBar.J0) {
                        floatingActionButton.setElevation(CropImageView.DEFAULT_ASPECT_RATIO);
                        floatingActionButton.setCompatElevation(CropImageView.DEFAULT_ASPECT_RATIO);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                    }
                    floatingActionButton.c(bottomAppBar.U0);
                    floatingActionButton.d(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.9
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            BottomAppBar bottomAppBar2 = BottomAppBar.this;
                            bottomAppBar2.U0.onAnimationStart(animator);
                            View viewC2 = bottomAppBar2.C();
                            FloatingActionButton floatingActionButton2 = viewC2 instanceof FloatingActionButton ? (FloatingActionButton) viewC2 : null;
                            if (floatingActionButton2 != null) {
                                floatingActionButton2.setTranslationX(bottomAppBar2.getFabTranslationX());
                            }
                        }
                    });
                    floatingActionButton.e(bottomAppBar.V0);
                }
                viewC.addOnLayoutChangeListener(this.R);
                bottomAppBar.I();
            }
            coordinatorLayout.u(bottomAppBar, i11);
            super.n(coordinatorLayout, bottomAppBar, i11);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, l4.b
        public final boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i11, int i12) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.v(coordinatorLayout, bottomAppBar, view2, view3, i11, i12);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.R = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    Behavior behavior = Behavior.this;
                    Rect rect = behavior.O;
                    BottomAppBar bottomAppBar = (BottomAppBar) behavior.P.get();
                    if (bottomAppBar != null) {
                        int i19 = bottomAppBar.G0;
                        if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                            int height = view.getHeight();
                            if (view instanceof FloatingActionButton) {
                                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                                floatingActionButton.f(rect);
                                int iHeight = rect.height();
                                bottomAppBar.J(iHeight);
                                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f15249e.a(new RectF(rect)));
                                height = iHeight;
                            }
                            e eVar = (e) view.getLayoutParams();
                            if (behavior.Q == 0) {
                                if (bottomAppBar.F0 == 1) {
                                    ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                                }
                                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = bottomAppBar.getLeftInset();
                                ((ViewGroup.MarginLayoutParams) eVar).rightMargin = bottomAppBar.getRightInset();
                                if (view.getLayoutDirection() == 1) {
                                    ((ViewGroup.MarginLayoutParams) eVar).leftMargin += i19;
                                } else {
                                    ((ViewGroup.MarginLayoutParams) eVar).rightMargin += i19;
                                }
                            }
                            int i21 = BottomAppBar.W0;
                            bottomAppBar.I();
                            return;
                        }
                    }
                    view.removeOnLayoutChangeListener(this);
                }
            };
            this.O = new Rect();
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_BottomAppBar), attributeSet, i11);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.A0 = materialShapeDrawable;
        this.O0 = false;
        this.P0 = true;
        this.U0 = new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                if (bottomAppBar.O0) {
                    return;
                }
                bottomAppBar.G(bottomAppBar.D0, bottomAppBar.P0);
            }
        };
        this.V0 = new TransformationCallback<FloatingActionButton>() { // from class: com.google.android.material.bottomappbar.BottomAppBar.2
            @Override // com.google.android.material.animation.TransformationCallback
            public final void a(View view) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.A0.s((floatingActionButton.getVisibility() == 0 && bottomAppBar.F0 == 1) ? floatingActionButton.getScaleY() : CropImageView.DEFAULT_ASPECT_RATIO);
            }

            @Override // com.google.android.material.animation.TransformationCallback
            public final void b(View view) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                BottomAppBar bottomAppBar = BottomAppBar.this;
                int i12 = bottomAppBar.F0;
                MaterialShapeDrawable materialShapeDrawable2 = bottomAppBar.A0;
                if (i12 != 1) {
                    return;
                }
                float translationX = floatingActionButton.getTranslationX();
                if (bottomAppBar.getTopEdgeTreatment().f13966e != translationX) {
                    bottomAppBar.getTopEdgeTreatment().f13966e = translationX;
                    materialShapeDrawable2.invalidateSelf();
                }
                float f5 = -floatingActionButton.getTranslationY();
                float scaleY = CropImageView.DEFAULT_ASPECT_RATIO;
                float fMax = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, f5);
                if (bottomAppBar.getTopEdgeTreatment().f13965d != fMax) {
                    bottomAppBar.getTopEdgeTreatment().d(fMax);
                    materialShapeDrawable2.invalidateSelf();
                }
                if (floatingActionButton.getVisibility() == 0) {
                    scaleY = floatingActionButton.getScaleY();
                }
                materialShapeDrawable2.s(scaleY);
            }
        };
        Context context2 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.f13737e, i11, R.style.Widget_MaterialComponents_BottomAppBar, new int[0]);
        ColorStateList colorStateListA = MaterialResources.a(context2, typedArrayD, 1);
        if (typedArrayD.hasValue(12)) {
            setNavigationIconTint(typedArrayD.getColor(12, -1));
        }
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(2, 0);
        float dimensionPixelOffset = typedArrayD.getDimensionPixelOffset(7, 0);
        float dimensionPixelOffset2 = typedArrayD.getDimensionPixelOffset(8, 0);
        float dimensionPixelOffset3 = typedArrayD.getDimensionPixelOffset(9, 0);
        this.D0 = typedArrayD.getInt(3, 0);
        this.E0 = typedArrayD.getInt(6, 0);
        this.F0 = typedArrayD.getInt(5, 1);
        this.J0 = typedArrayD.getBoolean(16, true);
        this.I0 = typedArrayD.getInt(11, 0);
        this.K0 = typedArrayD.getBoolean(10, false);
        this.L0 = typedArrayD.getBoolean(13, false);
        this.M0 = typedArrayD.getBoolean(14, false);
        this.N0 = typedArrayD.getBoolean(15, false);
        this.H0 = typedArrayD.getDimensionPixelOffset(4, -1);
        boolean z11 = typedArrayD.getBoolean(0, true);
        typedArrayD.recycle();
        this.G0 = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        BottomAppBarTopEdgeTreatment bottomAppBarTopEdgeTreatment = new BottomAppBarTopEdgeTreatment();
        bottomAppBarTopEdgeTreatment.f13967f = -1.0f;
        bottomAppBarTopEdgeTreatment.f13963b = dimensionPixelOffset;
        bottomAppBarTopEdgeTreatment.f13962a = dimensionPixelOffset2;
        bottomAppBarTopEdgeTreatment.d(dimensionPixelOffset3);
        bottomAppBarTopEdgeTreatment.f13966e = CropImageView.DEFAULT_ASPECT_RATIO;
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
        builder.f15265i = bottomAppBarTopEdgeTreatment;
        materialShapeDrawable.setShapeAppearanceModel(builder.a());
        if (z11) {
            materialShapeDrawable.v(2);
        } else {
            materialShapeDrawable.v(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        Paint.Style style = Paint.Style.FILL;
        materialShapeDrawable.t();
        materialShapeDrawable.n(context2);
        materialShapeDrawable.setTintList(colorStateListA);
        setElevation(dimensionPixelSize);
        setBackground(materialShapeDrawable);
        ViewUtils.c(this, attributeSet, i11, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.3
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public final v1 a(View view, v1 v1Var, ViewUtils.RelativePadding relativePadding) {
                boolean z12;
                BottomAppBar bottomAppBar = BottomAppBar.this;
                if (bottomAppBar.L0) {
                    bottomAppBar.R0 = v1Var.a();
                }
                boolean z13 = false;
                if (bottomAppBar.M0) {
                    z12 = bottomAppBar.T0 != v1Var.b();
                    bottomAppBar.T0 = v1Var.b();
                } else {
                    z12 = false;
                }
                if (bottomAppBar.N0) {
                    boolean z14 = bottomAppBar.S0 != v1Var.c();
                    bottomAppBar.S0 = v1Var.c();
                    z13 = z14;
                }
                if (!z12 && !z13) {
                    return v1Var;
                }
                AnimatorSet animatorSet = bottomAppBar.C0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = bottomAppBar.B0;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                bottomAppBar.I();
                bottomAppBar.H();
                return v1Var;
            }
        });
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
