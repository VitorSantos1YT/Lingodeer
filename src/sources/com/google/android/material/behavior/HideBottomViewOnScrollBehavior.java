package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevelType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l4.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends b {
    public a H;
    public ViewPropertyAnimator N;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f13909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeInterpolator f13910e;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AccessibilityManager f13912t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f13906a = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13911f = 0;
    public final boolean K = true;
    public int L = 2;
    public int M = 0;

    /* JADX INFO: renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends AnimatorListenerAdapter {
        public AnonymousClass2() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.N = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnScrollStateChangedListener {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollState {
    }

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // l4.b
    public boolean n(CoordinatorLayout coordinatorLayout, View view, int i11) {
        this.f13911f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f13907b = MotionUtils.c(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f13908c = MotionUtils.c(view.getContext(), R.attr.motionDurationMedium4, AchievementLevelType.KNOWLEDGE_POINT_LV_4);
        this.f13909d = MotionUtils.d(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f13771d);
        this.f13910e = MotionUtils.d(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f13770c);
        if (this.f13912t == null) {
            this.f13912t = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f13912t;
        if (accessibilityManager == null || this.H != null) {
            return false;
        }
        a aVar = new a(this, view, 0);
        this.H = aVar;
        accessibilityManager.addTouchExplorationStateChangeListener(aVar);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.1
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                AccessibilityManager accessibilityManager2;
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = HideBottomViewOnScrollBehavior.this;
                a aVar2 = hideBottomViewOnScrollBehavior.H;
                if (aVar2 == null || (accessibilityManager2 = hideBottomViewOnScrollBehavior.f13912t) == null) {
                    return;
                }
                accessibilityManager2.removeTouchExplorationStateChangeListener(aVar2);
                hideBottomViewOnScrollBehavior.H = null;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
            }
        });
        return false;
    }

    @Override // l4.b
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i11 <= 0) {
            if (i11 < 0) {
                y(view);
                return;
            }
            return;
        }
        if (this.L == 1) {
            return;
        }
        if (this.K && (accessibilityManager = this.f13912t) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.N;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.L = 1;
        Iterator it = this.f13906a.iterator();
        while (it.hasNext()) {
            ((OnScrollStateChangedListener) it.next()).a();
        }
        this.N = view.animate().translationY(this.f13911f + this.M).setInterpolator(this.f13910e).setDuration(this.f13908c).setListener(new AnonymousClass2());
    }

    @Override // l4.b
    public boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i11, int i12) {
        return i11 == 2;
    }

    public final void y(View view) {
        if (this.L == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.N;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.L = 2;
        Iterator it = this.f13906a.iterator();
        while (it.hasNext()) {
            ((OnScrollStateChangedListener) it.next()).a();
        }
        this.N = view.animate().translationY(0).setInterpolator(this.f13909d).setDuration(this.f13907b).setListener(new AnonymousClass2());
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
