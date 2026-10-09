package com.google.android.material.appbar;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ue.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    public VelocityTracker K;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f13846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OverScroller f13847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13848e;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13850t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13849f = -1;
    public int H = -1;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class FlingRunnable implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CoordinatorLayout f13851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f13852b;

        public FlingRunnable(CoordinatorLayout coordinatorLayout, View view) {
            this.f13851a = coordinatorLayout;
            this.f13852b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HeaderBehavior headerBehavior;
            OverScroller overScroller;
            View view = this.f13852b;
            if (view == null || (overScroller = (headerBehavior = HeaderBehavior.this).f13847d) == null) {
                return;
            }
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.f13851a;
            if (!zComputeScrollOffset) {
                headerBehavior.F(coordinatorLayout, view);
            } else {
                headerBehavior.H(coordinatorLayout, view, headerBehavior.f13847d.getCurrY());
                view.postOnAnimation(this);
            }
        }
    }

    public boolean C(View view) {
        return false;
    }

    public int D(View view) {
        return -view.getHeight();
    }

    public int E(View view) {
        return view.getHeight();
    }

    public int G(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13) {
        int iN;
        int iY = y();
        if (i12 == 0 || iY < i12 || iY > i13 || iY == (iN = f.n(i11, i12, i13))) {
            return 0;
        }
        B(iN);
        return iY - iN;
    }

    public final void H(CoordinatorLayout coordinatorLayout, View view, int i11) {
        G(coordinatorLayout, view, i11, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    @Override // l4.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int y10;
        boolean z11;
        OverScroller overScroller;
        int iFindPointerIndex;
        if (this.H < 0) {
            this.H = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f13848e) {
            int i11 = this.f13849f;
            if (i11 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i11)) != -1) {
                int y11 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y11 - this.f13850t) > this.H) {
                    this.f13850t = y11;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.f13849f = -1;
                    int x11 = (int) motionEvent.getX();
                    y10 = (int) motionEvent.getY();
                    if (C(view)) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    this.f13848e = z11;
                    if (z11) {
                        this.f13850t = y10;
                        this.f13849f = motionEvent.getPointerId(0);
                        if (this.K == null) {
                            this.K = VelocityTracker.obtain();
                        }
                        overScroller = this.f13847d;
                        if (overScroller != null) {
                            this.f13847d.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.K;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.f13849f = -1;
                int x12 = (int) motionEvent.getX();
                y10 = (int) motionEvent.getY();
                if (C(view) || !coordinatorLayout.s(view, x12, y10)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.f13848e = z11;
                if (z11) {
                    this.f13850t = y10;
                    this.f13849f = motionEvent.getPointerId(0);
                    if (this.K == null) {
                        this.K = VelocityTracker.obtain();
                    }
                    overScroller = this.f13847d;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.f13847d.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.K;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d8 A[ADDED_TO_REGION] */
    @Override // l4.b
    public boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z11;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f13849f);
                if (iFindPointerIndex != -1) {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i11 = this.f13850t - y10;
                    this.f13850t = y10;
                    G(coordinatorLayout, view, z() - i11, D(view), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i12 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f13849f = motionEvent.getPointerId(i12);
                    this.f13850t = (int) (motionEvent.getY(i12) + 0.5f);
                }
            }
            z11 = false;
            velocityTracker2 = this.K;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f13848e || z11;
        }
        VelocityTracker velocityTracker3 = this.K;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.K.computeCurrentVelocity(1000);
            float yVelocity = this.K.getYVelocity(this.f13849f);
            int i13 = -E(view);
            Runnable runnable = this.f13846c;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.f13846c = null;
            }
            if (this.f13847d == null) {
                this.f13847d = new OverScroller(view.getContext());
            }
            this.f13847d.fling(0, y(), 0, Math.round(yVelocity), 0, 0, i13, 0);
            if (this.f13847d.computeScrollOffset()) {
                FlingRunnable flingRunnable = new FlingRunnable(coordinatorLayout, view);
                this.f13846c = flingRunnable;
                view.postOnAnimation(flingRunnable);
            } else {
                F(coordinatorLayout, view);
            }
            z11 = true;
        }
        this.f13848e = false;
        this.f13849f = -1;
        velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.K = null;
        }
        velocityTracker2 = this.K;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f13848e) {
        }
        z11 = false;
        this.f13848e = false;
        this.f13849f = -1;
        velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.K = null;
        }
        velocityTracker2 = this.K;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f13848e) {
        }
    }

    public void F(CoordinatorLayout coordinatorLayout, View view) {
    }
}
