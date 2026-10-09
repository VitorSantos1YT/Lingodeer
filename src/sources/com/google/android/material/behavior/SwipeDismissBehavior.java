package com.google.android.material.behavior;

import a5.c;
import a5.k;
import a5.s;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.d;
import com.yalantis.ucrop.view.CropImageView;
import java.util.WeakHashMap;
import l4.b;
import l5.e;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f13924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OnDismissListener f13925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13928e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f13929f = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f13930t = 0.5f;
    public final d H = new d() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13932b = -1;

        @Override // com.bumptech.glide.d
        public final void C(View view, int i11) {
            this.f13932b = i11;
            this.f13931a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.f13927d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.f13927d = false;
            }
        }

        @Override // com.bumptech.glide.d
        public final void D(int i11) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.f13925b;
            if (onDismissListener != null) {
                onDismissListener.b(i11);
            }
        }

        @Override // com.bumptech.glide.d
        public final void E(View view, int i11, int i12) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f5 = width * swipeDismissBehavior.f13929f;
            float width2 = view.getWidth() * swipeDismissBehavior.f13930t;
            float fAbs = Math.abs(i11 - this.f13931a);
            if (fAbs <= f5) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
            } else {
                view.setAlpha(Math.min(Math.max(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f - ((fAbs - f5) / (width2 - f5))), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0050  */
        /* JADX WARN: Code duplicated, block: B:29:0x0054  */
        /* JADX WARN: Code duplicated, block: B:32:0x005d  */
        /* JADX WARN: Code duplicated, block: B:33:0x005f  */
        /* JADX WARN: Code duplicated, block: B:35:0x0065  */
        @Override // com.bumptech.glide.d
        public final void F(View view, float f5, float f11) {
            int i11;
            int left;
            int i12;
            OnDismissListener onDismissListener;
            this.f13932b = -1;
            int width = view.getWidth();
            boolean z11 = false;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            if (f5 != CropImageView.DEFAULT_ASPECT_RATIO) {
                boolean z12 = view.getLayoutDirection() == 1;
                int i13 = swipeDismissBehavior.f13928e;
                if (i13 != 2 && (i13 != 0 ? i13 != 1 || (!z12 ? f5 < CropImageView.DEFAULT_ASPECT_RATIO : f5 > CropImageView.DEFAULT_ASPECT_RATIO) : !z12 ? f5 > CropImageView.DEFAULT_ASPECT_RATIO : f5 < CropImageView.DEFAULT_ASPECT_RATIO)) {
                    i11 = this.f13931a;
                } else {
                    if (f5 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                        left = view.getLeft();
                        i12 = this.f13931a;
                        if (left < i12) {
                            i11 = this.f13931a - width;
                        } else {
                            i11 = i12 + width;
                        }
                    } else {
                        i11 = this.f13931a - width;
                    }
                    z11 = true;
                }
            } else {
                if (Math.abs(view.getLeft() - this.f13931a) >= Math.round(view.getWidth() * 0.5f)) {
                    if (f5 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                        left = view.getLeft();
                        i12 = this.f13931a;
                        if (left < i12) {
                            i11 = this.f13931a - width;
                        } else {
                            i11 = i12 + width;
                        }
                    } else {
                        i11 = this.f13931a - width;
                    }
                    z11 = true;
                } else {
                    i11 = this.f13931a;
                }
            }
            if (swipeDismissBehavior.f13924a.r(i11, view.getTop())) {
                view.postOnAnimation(new SettleRunnable(view, z11));
            } else {
                if (!z11 || (onDismissListener = swipeDismissBehavior.f13925b) == null) {
                    return;
                }
                onDismissListener.a(view);
            }
        }

        @Override // com.bumptech.glide.d
        public final boolean M(View view, int i11) {
            int i12 = this.f13932b;
            return (i12 == -1 || i12 == i11) && SwipeDismissBehavior.this.y(view);
        }

        @Override // com.bumptech.glide.d
        public final int h(View view, int i11) {
            int width;
            int width2;
            int width3;
            boolean z11 = view.getLayoutDirection() == 1;
            int i12 = SwipeDismissBehavior.this.f13928e;
            if (i12 == 0) {
                if (z11) {
                    width = this.f13931a - view.getWidth();
                    width2 = this.f13931a;
                } else {
                    width = this.f13931a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f13931a - view.getWidth();
                width2 = view.getWidth() + this.f13931a;
            } else if (z11) {
                width = this.f13931a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f13931a - view.getWidth();
                width2 = this.f13931a;
            }
            return Math.min(Math.max(width, i11), width2);
        }

        @Override // com.bumptech.glide.d
        public final int i(View view, int i11) {
            return view.getTop();
        }

        @Override // com.bumptech.glide.d
        public final int q(View view) {
            return view.getWidth();
        }
    };

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnDismissListener {
        void a(View view);

        void b(int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class SettleRunnable implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f13935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f13936b;

        public SettleRunnable(View view, boolean z11) {
            this.f13935a = view;
            this.f13936b = z11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OnDismissListener onDismissListener;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            e eVar = swipeDismissBehavior.f13924a;
            View view = this.f13935a;
            if (eVar != null && eVar.h()) {
                view.postOnAnimation(this);
            } else {
                if (!this.f13936b || (onDismissListener = swipeDismissBehavior.f13925b) == null) {
                    return;
                }
                onDismissListener.a(view);
            }
        }
    }

    @Override // l4.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zS = this.f13926c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zS = coordinatorLayout.s(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f13926c = zS;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f13926c = false;
        }
        if (zS) {
            if (this.f13924a == null) {
                this.f13924a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.H);
            }
            if (!this.f13927d && this.f13924a.s(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // l4.b
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i11) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            s0.n(view, 1048576);
            s0.j(view, 0);
            if (y(view)) {
                s0.o(view, c.f367n, null, new s() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                    @Override // a5.s
                    public final boolean perform(View view2, k kVar) {
                        SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                        if (!swipeDismissBehavior.y(view2)) {
                            return false;
                        }
                        boolean z11 = view2.getLayoutDirection() == 1;
                        int i12 = swipeDismissBehavior.f13928e;
                        int width = (!(i12 == 0 && z11) && (i12 != 1 || z11)) ? view2.getWidth() : -view2.getWidth();
                        WeakHashMap weakHashMap = s0.f58893a;
                        view2.offsetLeftAndRight(width);
                        view2.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                        OnDismissListener onDismissListener = swipeDismissBehavior.f13925b;
                        if (onDismissListener != null) {
                            onDismissListener.a(view2);
                        }
                        return true;
                    }
                });
            }
        }
        return false;
    }

    @Override // l4.b
    public final boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f13924a == null) {
            return false;
        }
        if (this.f13927d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f13924a.l(motionEvent);
        return true;
    }

    public boolean y(View view) {
        return true;
    }
}
