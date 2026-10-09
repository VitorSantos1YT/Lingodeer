package com.google.firebase.inappmessaging.display.internal;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SwipeDismissTouchListener implements View.OnTouchListener {
    public float H;
    public float K;
    public boolean L;
    public int M;
    public VelocityTracker N;
    public float O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f19796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DismissCallbacks f19797f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f19798t = 1;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface DismissCallbacks {
    }

    public SwipeDismissTouchListener(View view, DismissCallbacks dismissCallbacks) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f19792a = viewConfiguration.getScaledTouchSlop();
        this.f19793b = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f19794c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f19795d = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.f19796e = view;
        this.f19797f = dismissCallbacks;
    }

    public final void f(float f5, float f11, AnimatorListenerAdapter animatorListenerAdapter) {
        final float fH = h();
        final float f12 = f5 - fH;
        final float alpha = this.f19796e.getAlpha();
        final float f13 = f11 - alpha;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        valueAnimatorOfFloat.setDuration(this.f19795d);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.firebase.inappmessaging.display.internal.SwipeDismissTouchListener.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = (valueAnimator.getAnimatedFraction() * f12) + fH;
                float animatedFraction2 = (valueAnimator.getAnimatedFraction() * f13) + alpha;
                SwipeDismissTouchListener swipeDismissTouchListener = SwipeDismissTouchListener.this;
                swipeDismissTouchListener.i(animatedFraction);
                swipeDismissTouchListener.f19796e.setAlpha(animatedFraction2);
            }
        });
        if (animatorListenerAdapter != null) {
            valueAnimatorOfFloat.addListener(animatorListenerAdapter);
        }
        valueAnimatorOfFloat.start();
    }

    public float h() {
        return this.f19796e.getTranslationX();
    }

    public void i(float f5) {
        this.f19796e.setTranslationX(f5);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        motionEvent.offsetLocation(this.O, CropImageView.DEFAULT_ASPECT_RATIO);
        int i11 = this.f19798t;
        View view2 = this.f19796e;
        if (i11 < 2) {
            this.f19798t = view2.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.H = motionEvent.getRawX();
            this.K = motionEvent.getRawY();
            this.f19797f.getClass();
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.N = velocityTrackerObtain;
            velocityTrackerObtain.addMovement(motionEvent);
            return false;
        }
        boolean z12 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                VelocityTracker velocityTracker = this.N;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    float rawX = motionEvent.getRawX() - this.H;
                    float rawY = motionEvent.getRawY() - this.K;
                    float fAbs = Math.abs(rawX);
                    int i12 = this.f19792a;
                    if (fAbs > i12 && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                        this.L = true;
                        if (rawX <= CropImageView.DEFAULT_ASPECT_RATIO) {
                            i12 = -i12;
                        }
                        this.M = i12;
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                        view2.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (this.L) {
                        this.O = rawX;
                        i(rawX - this.M);
                        view2.setAlpha(Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(1.0f, 1.0f - ((Math.abs(rawX) * 2.0f) / this.f19798t))));
                        return true;
                    }
                }
            } else if (actionMasked == 3 && this.N != null) {
                f(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, null);
                this.N.recycle();
                this.N = null;
                this.O = CropImageView.DEFAULT_ASPECT_RATIO;
                this.H = CropImageView.DEFAULT_ASPECT_RATIO;
                this.K = CropImageView.DEFAULT_ASPECT_RATIO;
                this.L = false;
                return false;
            }
        } else if (this.N != null) {
            float rawX2 = motionEvent.getRawX() - this.H;
            this.N.addMovement(motionEvent);
            this.N.computeCurrentVelocity(1000);
            float xVelocity = this.N.getXVelocity();
            float fAbs2 = Math.abs(xVelocity);
            float fAbs3 = Math.abs(this.N.getYVelocity());
            if (Math.abs(rawX2) > this.f19798t / 2 && this.L) {
                z11 = rawX2 > CropImageView.DEFAULT_ASPECT_RATIO;
            } else if (this.f19793b > fAbs2 || fAbs2 > this.f19794c || fAbs3 >= fAbs2 || fAbs3 >= fAbs2 || !this.L) {
                z11 = false;
                z12 = false;
            } else {
                z12 = ((xVelocity > CropImageView.DEFAULT_ASPECT_RATIO ? 1 : (xVelocity == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : -1)) < 0) == ((rawX2 > CropImageView.DEFAULT_ASPECT_RATIO ? 1 : (rawX2 == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : -1)) < 0);
                z11 = this.N.getXVelocity() > CropImageView.DEFAULT_ASPECT_RATIO;
            }
            if (z12) {
                f(z11 ? this.f19798t : -this.f19798t, CropImageView.DEFAULT_ASPECT_RATIO, new AnimatorListenerAdapter() { // from class: com.google.firebase.inappmessaging.display.internal.SwipeDismissTouchListener.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        final SwipeDismissTouchListener swipeDismissTouchListener = SwipeDismissTouchListener.this;
                        View view3 = swipeDismissTouchListener.f19796e;
                        final ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                        final int height = view3.getHeight();
                        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(swipeDismissTouchListener.f19795d);
                        duration.addListener(new AnimatorListenerAdapter() { // from class: com.google.firebase.inappmessaging.display.internal.SwipeDismissTouchListener.3
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator2) {
                                SwipeDismissTouchListener swipeDismissTouchListener2 = SwipeDismissTouchListener.this;
                                DismissCallbacks dismissCallbacks = swipeDismissTouchListener2.f19797f;
                                View view4 = swipeDismissTouchListener2.f19796e;
                                BindingWrapper bindingWrapper = ((FiamWindowManager.AnonymousClass1) dismissCallbacks).f19770a;
                                if (bindingWrapper.c() != null) {
                                    bindingWrapper.c().onClick(view4);
                                }
                                view4.setAlpha(1.0f);
                                view4.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                                int i13 = height;
                                ViewGroup.LayoutParams layoutParams2 = layoutParams;
                                layoutParams2.height = i13;
                                view4.setLayoutParams(layoutParams2);
                            }
                        });
                        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.firebase.inappmessaging.display.internal.SwipeDismissTouchListener.4
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                ViewGroup.LayoutParams layoutParams2 = layoutParams;
                                layoutParams2.height = iIntValue;
                                SwipeDismissTouchListener.this.f19796e.setLayoutParams(layoutParams2);
                            }
                        });
                        duration.start();
                    }
                });
            } else if (this.L) {
                f(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, null);
            }
            VelocityTracker velocityTracker2 = this.N;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
            }
            this.N = null;
            this.O = CropImageView.DEFAULT_ASPECT_RATIO;
            this.H = CropImageView.DEFAULT_ASPECT_RATIO;
            this.K = CropImageView.DEFAULT_ASPECT_RATIO;
            this.L = false;
            return false;
        }
        return false;
    }
}
