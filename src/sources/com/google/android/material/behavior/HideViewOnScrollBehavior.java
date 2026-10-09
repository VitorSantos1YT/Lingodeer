package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevelType;
import hh.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l4.b;
import l4.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class HideViewOnScrollBehavior<V extends View> extends b {
    public TimeInterpolator H;
    public ViewPropertyAnimator M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HideViewOnScrollDelegate f13915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AccessibilityManager f13916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f13917c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13920f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TimeInterpolator f13921t;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f13918d = new LinkedHashSet();
    public int K = 0;
    public int L = 2;

    /* JADX INFO: renamed from: com.google.android.material.behavior.HideViewOnScrollBehavior$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends AnimatorListenerAdapter {
        public AnonymousClass2() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            HideViewOnScrollBehavior.this.M = null;
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

    public HideViewOnScrollBehavior() {
    }

    @Override // l4.b
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i11) {
        if (this.f13916b == null) {
            this.f13916b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f13916b;
        if (accessibilityManager != null && this.f13917c == null) {
            a aVar = new a(this, view, 1);
            this.f13917c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.behavior.HideViewOnScrollBehavior.1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                    AccessibilityManager accessibilityManager2;
                    HideViewOnScrollBehavior hideViewOnScrollBehavior = HideViewOnScrollBehavior.this;
                    a aVar2 = hideViewOnScrollBehavior.f13917c;
                    if (aVar2 == null || (accessibilityManager2 = hideViewOnScrollBehavior.f13916b) == null) {
                        return;
                    }
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar2);
                    hideViewOnScrollBehavior.f13917c = null;
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                }
            });
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i12 = ((e) view.getLayoutParams()).f39718c;
        if (i12 == 80 || i12 == 81) {
            y(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i12, i11);
            y((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.K = this.f13915a.a(view, marginLayoutParams);
        this.f13919e = MotionUtils.c(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f13920f = MotionUtils.c(view.getContext(), R.attr.motionDurationMedium4, AchievementLevelType.KNOWLEDGE_POINT_LV_4);
        this.f13921t = MotionUtils.d(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f13771d);
        this.H = MotionUtils.d(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f13770c);
        return false;
    }

    @Override // l4.b
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13, int[] iArr) {
        if (i11 <= 0) {
            if (i11 < 0) {
                z(view);
                return;
            }
            return;
        }
        if (this.L == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f13916b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.M;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.L = 1;
            Iterator it = this.f13918d.iterator();
            while (it.hasNext()) {
                ((OnScrollStateChangedListener) it.next()).a();
            }
            this.M = this.f13915a.c(view, this.K).setInterpolator(this.H).setDuration(this.f13920f).setListener(new AnonymousClass2());
        }
    }

    @Override // l4.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i11, int i12) {
        return i11 == 2;
    }

    public final void y(int i11) {
        HideViewOnScrollDelegate hideViewOnScrollDelegate = this.f13915a;
        if (hideViewOnScrollDelegate == null || hideViewOnScrollDelegate.b() != i11) {
            if (i11 == 0) {
                this.f13915a = new HideRightViewOnScrollDelegate();
            } else if (i11 == 1) {
                this.f13915a = new HideBottomViewOnScrollDelegate();
            } else {
                if (i11 != 2) {
                    throw new IllegalArgumentException(p0.h(i11, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
                }
                this.f13915a = new HideLeftViewOnScrollDelegate();
            }
        }
    }

    public final void z(View view) {
        if (this.L == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.M;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.L = 2;
        Iterator it = this.f13918d.iterator();
        while (it.hasNext()) {
            ((OnScrollStateChangedListener) it.next()).a();
        }
        this.f13915a.getClass();
        this.M = this.f13915a.c(view, 0).setInterpolator(this.f13921t).setDuration(this.f13919e).setListener(new AnonymousClass2());
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
