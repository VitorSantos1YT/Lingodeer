package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.yalantis.ucrop.view.CropImageView;
import q.z;
import r.j1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public int H;
    public final int[] K = new int[2];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f1085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j1 f1086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j1 f1087f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1088t;

    public f(View view) {
        this.f1085d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1082a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1083b = tapTimeout;
        this.f1084c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void f() {
        j1 j1Var = this.f1087f;
        View view = this.f1085d;
        if (j1Var != null) {
            view.removeCallbacks(j1Var);
        }
        j1 j1Var2 = this.f1086e;
        if (j1Var2 != null) {
            view.removeCallbacks(j1Var2);
        }
    }

    public abstract z h();

    public abstract boolean i();

    public boolean j() {
        z zVarH = h();
        if (zVarH == null || !zVarH.b()) {
            return true;
        }
        zVarH.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        DropDownListView dropDownListView;
        boolean z12 = this.f1088t;
        View view2 = this.f1085d;
        if (z12) {
            z zVarH = h();
            if (zVarH != null && zVarH.b() && (dropDownListView = (DropDownListView) zVarH.h()) != null && dropDownListView.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.K;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                dropDownListView.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = dropDownListView.b(motionEventObtainNoHistory, this.H);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z13 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z13) {
                    z11 = true;
                } else if (j()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
            } else if (j()) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.H = motionEvent.getPointerId(0);
                    if (this.f1086e == null) {
                        this.f1086e = new j1(this, 0);
                    }
                    view2.postDelayed(this.f1086e, this.f1083b);
                    if (this.f1087f == null) {
                        this.f1087f = new j1(this, 1);
                    }
                    view2.postDelayed(this.f1087f, this.f1084c);
                } else if (actionMasked2 == 1) {
                    f();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.H);
                    if (iFindPointerIndex >= 0) {
                        float x11 = motionEvent.getX(iFindPointerIndex);
                        float y10 = motionEvent.getY(iFindPointerIndex);
                        float f5 = this.f1082a;
                        float f11 = -f5;
                        if (x11 < f11 || y10 < f11 || x11 >= (view2.getRight() - view2.getLeft()) + f5 || y10 >= (view2.getBottom() - view2.getTop()) + f5) {
                            f();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (i()) {
                                z11 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    f();
                }
                z11 = false;
            } else {
                z11 = false;
            }
            if (z11) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f1088t = z11;
        return z11 || z12;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1088t = false;
        this.H = -1;
        j1 j1Var = this.f1086e;
        if (j1Var != null) {
            this.f1085d.removeCallbacks(j1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
