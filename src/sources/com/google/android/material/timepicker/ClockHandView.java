package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f15770a0 = 0;
    public final int H;
    public boolean K;
    public final ArrayList L;
    public final int M;
    public final float N;
    public final Paint O;
    public final RectF P;
    public final int Q;
    public float R;
    public boolean S;
    public OnActionUpListener T;
    public double U;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeInterpolator f15772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ValueAnimator f15773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f15776f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15777t;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockHandView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnActionUpListener {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnRotateListener {
        void b(float f5, boolean z11);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f15773c = valueAnimator;
        this.L = new ArrayList();
        Paint paint = new Paint();
        this.O = paint;
        this.P = new RectF();
        this.W = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.m, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f15771a = MotionUtils.c(context, R.attr.motionDurationLong2, 200);
        this.f15772b = MotionUtils.d(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f13769b);
        this.V = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.Q = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.N = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        c(CropImageView.DEFAULT_ASPECT_RATIO, false);
        this.H = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i11 = ClockHandView.f15770a0;
                ClockHandView clockHandView = this.f15839a;
                clockHandView.getClass();
                clockHandView.d(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        valueAnimator.addListener(new AnonymousClass1());
    }

    public final int a(float f5, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f5 - (getWidth() / 2)));
        int i11 = degrees + 90;
        return i11 < 0 ? degrees + 450 : i11;
    }

    public final int b(int i11) {
        return i11 == 2 ? Math.round(this.V * 0.66f) : this.V;
    }

    public final void c(float f5, boolean z11) {
        ValueAnimator valueAnimator = this.f15773c;
        valueAnimator.cancel();
        if (!z11) {
            d(f5, false);
            return;
        }
        float f11 = this.R;
        if (Math.abs(f11 - f5) > 180.0f) {
            if (f11 > 180.0f && f5 < 180.0f) {
                f5 += 360.0f;
            }
            if (f11 < 180.0f && f5 > 180.0f) {
                f11 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f11), Float.valueOf(f5));
        valueAnimator.setFloatValues(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        valueAnimator.setDuration(this.f15771a);
        valueAnimator.setInterpolator(this.f15772b);
        valueAnimator.start();
    }

    public final void d(float f5, boolean z11) {
        float f11 = f5 % 360.0f;
        this.R = f11;
        this.U = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fB = b(this.W);
        float fCos = (((float) Math.cos(this.U)) * fB) + width;
        float fSin = (fB * ((float) Math.sin(this.U))) + height;
        float f12 = this.M;
        this.P.set(fCos - f12, fSin - f12, fCos + f12, fSin + f12);
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((OnRotateListener) obj).b(f11, z11);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iB = b(this.W);
        float f5 = width;
        float f11 = iB;
        float fCos = (((float) Math.cos(this.U)) * f11) + f5;
        float f12 = height;
        float fSin = (f11 * ((float) Math.sin(this.U))) + f12;
        Paint paint = this.O;
        paint.setStrokeWidth(CropImageView.DEFAULT_ASPECT_RATIO);
        int i11 = this.M;
        canvas.drawCircle(fCos, fSin, i11, paint);
        double dSin = Math.sin(this.U);
        double d5 = iB - i11;
        paint.setStrokeWidth(this.Q);
        canvas.drawLine(f5, f12, width + ((int) (Math.cos(this.U) * d5)), height + ((int) (d5 * dSin)), paint);
        canvas.drawCircle(f5, f12, this.N, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (this.f15773c.isRunning()) {
            return;
        }
        c(this.R, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        OnActionUpListener onActionUpListener;
        int actionMasked = motionEvent.getActionMasked();
        float x11 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i11 = (int) (x11 - this.f15775e);
                int i12 = (int) (y10 - this.f15776f);
                this.f15777t = (i12 * i12) + (i11 * i11) > this.H;
                z13 = this.S;
                z12 = actionMasked == 1;
                if (this.K) {
                    this.W = MathUtils.a((float) (getWidth() / 2), (float) (getHeight() / 2), x11, y10) > ((float) b(2)) + ViewUtils.d(getContext(), 12) ? 1 : 2;
                }
                z11 = false;
            } else {
                z12 = false;
                z11 = false;
                z13 = false;
            }
        } else {
            this.f15775e = x11;
            this.f15776f = y10;
            this.f15777t = true;
            this.S = false;
            z11 = true;
            z12 = false;
            z13 = false;
        }
        boolean z15 = this.S;
        float fA = a(x11, y10);
        boolean z16 = this.R != fA;
        if (z11 && z16) {
            z14 = true;
        } else if (z16 || z13) {
            c(fA, z12 && this.f15774d);
            z14 = true;
        } else {
            z14 = false;
        }
        boolean z17 = z14 | z15;
        this.S = z17;
        if (z17 && z12 && (onActionUpListener = this.T) != null) {
            float fA2 = a(x11, y10);
            boolean z18 = this.f15777t;
            TimePickerClockPresenter timePickerClockPresenter = (TimePickerClockPresenter) onActionUpListener;
            TimePickerView timePickerView = timePickerClockPresenter.f15805a;
            timePickerClockPresenter.f15809e = true;
            TimeModel timeModel = timePickerClockPresenter.f15806b;
            int i13 = timeModel.f15800e;
            int i14 = timeModel.f15799d;
            if (timeModel.f15801f == 10) {
                timePickerView.U.c(timePickerClockPresenter.f15808d, false);
                AccessibilityManager accessibilityManager = (AccessibilityManager) timePickerView.getContext().getSystemService(AccessibilityManager.class);
                if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    timePickerClockPresenter.d(12, true);
                }
            } else {
                int iRound = Math.round(fA2);
                if (!z18) {
                    int i15 = (((iRound + 15) / 30) * 5) % 60;
                    timeModel.f15800e = i15;
                    timePickerClockPresenter.f15807c = i15 * 6;
                }
                timePickerView.U.c(timePickerClockPresenter.f15807c, z18);
            }
            timePickerClockPresenter.f15809e = false;
            timePickerClockPresenter.e();
            if (timeModel.f15800e != i13 || timeModel.f15799d != i14) {
                timePickerView.performHapticFeedback(4);
            }
        }
        return true;
    }
}
