package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.ShapeableDelegate;
import com.yalantis.ucrop.view.CropImageView;
import ue.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaskableFrameLayout extends FrameLayout implements Maskable, Shapeable {
    public static final /* synthetic */ int L = 0;
    public View.OnHoverListener H;
    public boolean K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f14191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f14192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f14193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OnMaskChangedListener f14194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ShapeAppearanceModel f14195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ShapeableDelegate f14196f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Boolean f14197t;

    public MaskableFrameLayout(Context context) {
        this(context, null);
    }

    public final void a() {
        if (this.f14191a != -1.0f) {
            float fB = AnimationUtils.b(CropImageView.DEFAULT_ASPECT_RATIO, getWidth() / 2.0f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, this.f14191a);
            setMaskRectF(new RectF(fB, CropImageView.DEFAULT_ASPECT_RATIO, getWidth() - fB, getHeight()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ShapeableDelegate shapeableDelegate = this.f14196f;
        Path path = shapeableDelegate.f15316e;
        if (!shapeableDelegate.c() || path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        RectF rectF = this.f14192b;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public RectF getMaskRectF() {
        return this.f14192b;
    }

    @Deprecated
    public float getMaskXPercentage() {
        return this.f14191a;
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f14195e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f14197t;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            ShapeableDelegate shapeableDelegate = this.f14196f;
            if (zBooleanValue != shapeableDelegate.f15312a) {
                shapeableDelegate.f15312a = zBooleanValue;
                shapeableDelegate.b(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ShapeableDelegate shapeableDelegate = this.f14196f;
        this.f14197t = Boolean.valueOf(shapeableDelegate.f15312a);
        if (true != shapeableDelegate.f15312a) {
            shapeableDelegate.f15312a = true;
            shapeableDelegate.b(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RectF rectF = this.f14192b;
        if (!rectF.isEmpty() && ((action == 9 || action == 10 || action == 7) && !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
            if (this.K && this.H != null) {
                motionEvent.setAction(10);
                this.H.onHover(this, motionEvent);
            }
            this.K = false;
            return false;
        }
        if (this.H != null) {
            if (!this.K && action == 7) {
                motionEvent.setAction(9);
                this.K = true;
            }
            if (action == 7 || action == 9) {
                this.K = true;
            }
            this.H.onHover(this, motionEvent);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        Rect rect = this.f14193c;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        float x11 = getX();
        RectF rectF = this.f14192b;
        if (x11 > CropImageView.DEFAULT_ASPECT_RATIO) {
            rect.left = (int) (rect.left + rectF.left);
        }
        if (getY() > CropImageView.DEFAULT_ASPECT_RATIO) {
            rect.top = (int) (rect.top + rectF.top);
        }
        rect.right = Math.round(rectF.width()) + rect.left;
        rect.bottom = Math.round(rectF.height()) + rect.top;
        accessibilityNodeInfo.setBoundsInScreen(rect);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.f14192b;
        if (rectF.isEmpty() || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (this.f14191a != -1.0f) {
            a();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.f14192b;
        if (rectF.isEmpty() || motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setForceCompatClipping(boolean z11) {
        ShapeableDelegate shapeableDelegate = this.f14196f;
        if (z11 != shapeableDelegate.f15312a) {
            shapeableDelegate.f15312a = z11;
            shapeableDelegate.b(this);
        }
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setMaskRectF(RectF rectF) {
        RectF rectF2 = this.f14192b;
        rectF2.set(rectF);
        ShapeableDelegate shapeableDelegate = this.f14196f;
        shapeableDelegate.f15315d = rectF2;
        shapeableDelegate.d();
        shapeableDelegate.b(this);
        OnMaskChangedListener onMaskChangedListener = this.f14194d;
        if (onMaskChangedListener != null) {
            onMaskChangedListener.a();
        }
    }

    @Deprecated
    public void setMaskXPercentage(float f5) {
        float fM = f.m(f5, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        if (this.f14191a != fM) {
            this.f14191a = fM;
            a();
        }
    }

    @Override // android.view.View
    public void setOnHoverListener(View.OnHoverListener onHoverListener) {
        this.H = onHoverListener;
    }

    public void setOnMaskChangedListener(OnMaskChangedListener onMaskChangedListener) {
        this.f14194d = onMaskChangedListener;
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        ShapeAppearanceModel shapeAppearanceModelI = shapeAppearanceModel.i(new c3.a(11));
        this.f14195e = shapeAppearanceModelI;
        ShapeableDelegate shapeableDelegate = this.f14196f;
        shapeableDelegate.f15314c = shapeAppearanceModelI;
        shapeableDelegate.d();
        shapeableDelegate.b(this);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f14191a = -1.0f;
        this.f14192b = new RectF();
        this.f14193c = new Rect();
        this.f14196f = ShapeableDelegate.a(this);
        this.f14197t = null;
        this.K = false;
        setShapeAppearanceModel(ShapeAppearanceModel.d(context, attributeSet, i11, 0).a());
    }
}
