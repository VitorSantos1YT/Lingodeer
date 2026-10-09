package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.yalantis.ucrop.view.CropImageView;
import java.util.WeakHashMap;
import qp.m4;
import r.b3;
import r.c1;
import r.h2;
import r.i2;
import r.o0;
import r.u;
import z4.f0;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final qa.b f997w0 = new qa.b(7, Float.class, "thumbPos");

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int[] f998x0 = {R.attr.state_checked};
    public PorterDuff.Mode H;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public CharSequence Q;
    public CharSequence R;
    public CharSequence S;
    public CharSequence T;
    public boolean U;
    public int V;
    public final int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f999a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f1000a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f1001b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f1002b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1003c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final VelocityTracker f1004c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1005d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f1006d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1007e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f1008e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1009f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f1010f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f1011g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f1012h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1013i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f1014j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f1015k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f1016l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f1017m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final TextPaint f1018n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final ColorStateList f1019o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public StaticLayout f1020p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public StaticLayout f1021q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final o.a f1022r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ObjectAnimator f1023s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f1024t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public u f1025t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public h2 f1026u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Rect f1027v0;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    private u getEmojiTextViewHelper() {
        if (this.f1025t0 == null) {
            this.f1025t0 = new u(this);
        }
        return this.f1025t0;
    }

    private boolean getTargetCheckedState() {
        return this.f1008e0 > 0.5f;
    }

    private int getThumbOffset() {
        boolean z11 = b3.f48531a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f1008e0 : this.f1008e0) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1009f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1027v0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f999a;
        Rect rectB = drawable2 != null ? c1.b(drawable2) : c1.f48540c;
        return ((((this.f1010f0 - this.f1012h0) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.S = charSequence;
        TransformationMethod transformationMethodJ = ((c.a) getEmojiTextViewHelper().f48669b.f52059b).J(this.f1022r0);
        if (transformationMethodJ != null) {
            charSequence = transformationMethodJ.getTransformation(charSequence, this);
        }
        this.T = charSequence;
        this.f1021q0 = null;
        if (this.U) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.Q = charSequence;
        TransformationMethod transformationMethodJ = ((c.a) getEmojiTextViewHelper().f48669b.f52059b).J(this.f1022r0);
        if (transformationMethodJ != null) {
            charSequence = transformationMethodJ.getTransformation(charSequence, this);
        }
        this.R = charSequence;
        this.f1020p0 = null;
        if (this.U) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f999a;
        if (drawable != null) {
            if (this.f1005d || this.f1007e) {
                Drawable drawableMutate = drawable.mutate();
                this.f999a = drawableMutate;
                if (this.f1005d) {
                    drawableMutate.setTintList(this.f1001b);
                }
                if (this.f1007e) {
                    this.f999a.setTintMode(this.f1003c);
                }
                if (this.f999a.isStateful()) {
                    this.f999a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f1009f;
        if (drawable != null) {
            if (this.K || this.L) {
                Drawable drawableMutate = drawable.mutate();
                this.f1009f = drawableMutate;
                if (this.K) {
                    drawableMutate.setTintList(this.f1024t);
                }
                if (this.L) {
                    this.f1009f.setTintMode(this.H);
                }
                if (this.f1009f.isStateful()) {
                    this.f1009f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.Q);
        setTextOffInternal(this.S);
        requestLayout();
    }

    public final void d() {
        if (this.f1026u0 == null && ((c.a) this.f1025t0.f48669b.f52059b).z() && v5.j.d()) {
            v5.j jVarA = v5.j.a();
            int iC = jVarA.c();
            if (iC == 3 || iC == 0) {
                h2 h2Var = new h2(this);
                this.f1026u0 = h2Var;
                jVarA.h(h2Var);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i11;
        int i12;
        int i13 = this.f1013i0;
        int i14 = this.f1014j0;
        int i15 = this.f1015k0;
        int i16 = this.f1016l0;
        int thumbOffset = getThumbOffset() + i13;
        Drawable drawable = this.f999a;
        Rect rectB = drawable != null ? c1.b(drawable) : c1.f48540c;
        Drawable drawable2 = this.f1009f;
        Rect rect = this.f1027v0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i17 = rect.left;
            thumbOffset += i17;
            if (rectB != null) {
                int i18 = rectB.left;
                if (i18 > i17) {
                    i13 += i18 - i17;
                }
                int i19 = rectB.top;
                int i21 = rect.top;
                i11 = i19 > i21 ? (i19 - i21) + i14 : i14;
                int i22 = rectB.right;
                int i23 = rect.right;
                if (i22 > i23) {
                    i15 -= i22 - i23;
                }
                int i24 = rectB.bottom;
                int i25 = rect.bottom;
                if (i24 > i25) {
                    i12 = i16 - (i24 - i25);
                }
                this.f1009f.setBounds(i13, i11, i15, i12);
            } else {
                i11 = i14;
            }
            i12 = i16;
            this.f1009f.setBounds(i13, i11, i15, i12);
        }
        Drawable drawable3 = this.f999a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i26 = thumbOffset - rect.left;
            int i27 = thumbOffset + this.f1012h0 + rect.right;
            this.f999a.setBounds(i26, i14, i27, i16);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i26, i14, i27, i16);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f5, float f11) {
        super.drawableHotspotChanged(f5, f11);
        Drawable drawable = this.f999a;
        if (drawable != null) {
            drawable.setHotspot(f5, f11);
        }
        Drawable drawable2 = this.f1009f;
        if (drawable2 != null) {
            drawable2.setHotspot(f5, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f999a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1009f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z11 = b3.f48531a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1010f0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.O : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z11 = b3.f48531a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1010f0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.O : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return v10.c.M(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.U;
    }

    public boolean getSplitTrack() {
        return this.P;
    }

    public int getSwitchMinWidth() {
        return this.N;
    }

    public int getSwitchPadding() {
        return this.O;
    }

    public CharSequence getTextOff() {
        return this.S;
    }

    public CharSequence getTextOn() {
        return this.Q;
    }

    public Drawable getThumbDrawable() {
        return this.f999a;
    }

    public final float getThumbPosition() {
        return this.f1008e0;
    }

    public int getThumbTextPadding() {
        return this.M;
    }

    public ColorStateList getThumbTintList() {
        return this.f1001b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1003c;
    }

    public Drawable getTrackDrawable() {
        return this.f1009f;
    }

    public ColorStateList getTrackTintList() {
        return this.f1024t;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.H;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f999a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1009f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1023s0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1023s0.end();
        this.f1023s0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f998x0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f1009f;
        Rect rect = this.f1027v0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i11 = this.f1014j0;
        int i12 = this.f1016l0;
        int i13 = i11 + rect.top;
        int i14 = i12 - rect.bottom;
        Drawable drawable2 = this.f999a;
        if (drawable != null) {
            if (!this.P || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = c1.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f1020p0 : this.f1021q0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.f1018n0;
            ColorStateList colorStateList = this.f1019o0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i13 + i14) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.Q : this.S;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z11, i11, i12, i13, i14);
        int iMax2 = 0;
        if (this.f999a != null) {
            Drawable drawable = this.f1009f;
            Rect rect = this.f1027v0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = c1.b(this.f999a);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z12 = b3.f48531a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f1010f0 + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f1010f0) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i15 = this.f1011g0;
            int i16 = height2 - (i15 / 2);
            height = i15 + i16;
            paddingTop = i16;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f1011g0 + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f1011g0;
        }
        this.f1013i0 = paddingLeft;
        this.f1014j0 = paddingTop;
        this.f1016l0 = height;
        this.f1015k0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i11, int i12) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.U) {
            StaticLayout staticLayout = this.f1020p0;
            TextPaint textPaint = this.f1018n0;
            if (staticLayout == null) {
                CharSequence charSequence = this.R;
                this.f1020p0 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, true);
            }
            if (this.f1021q0 == null) {
                CharSequence charSequence2 = this.T;
                this.f1021q0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, true);
            }
        }
        Drawable drawable = this.f999a;
        Rect rect = this.f1027v0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f999a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f999a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.U) {
            iMax = (this.M * 2) + Math.max(this.f1020p0.getWidth(), this.f1021q0.getWidth());
        } else {
            iMax = 0;
        }
        this.f1012h0 = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f1009f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f1009f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f999a;
        if (drawable3 != null) {
            Rect rectB = c1.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        int iMax4 = this.f1017m0 ? Math.max(this.N, (this.f1012h0 * 2) + iMax2 + iMax3) : this.N;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f1010f0 = iMax4;
        this.f1011g0 = iMax5;
        super.onMeasure(i11, i12);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.Q : this.S;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f5;
        VelocityTracker velocityTracker = this.f1004c0;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i11 = this.W;
        if (actionMasked != 0) {
            float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
            if (actionMasked == 1) {
                if (this.V == 2) {
                    this.V = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    zIsChecked = isChecked();
                    if (z11) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.f1006d0) {
                            boolean z12 = b3.f48531a;
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > CropImageView.DEFAULT_ASPECT_RATIO : xVelocity < CropImageView.DEFAULT_ASPECT_RATIO;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.V = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i12 = this.V;
                if (i12 == 1) {
                    float x11 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    float f12 = i11;
                    if (Math.abs(x11 - this.f1000a0) > f12 || Math.abs(y10 - this.f1002b0) > f12) {
                        this.V = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f1000a0 = x11;
                        this.f1002b0 = y10;
                        return true;
                    }
                } else if (i12 == 2) {
                    float x12 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f13 = x12 - this.f1000a0;
                    if (thumbScrollRange != 0) {
                        f5 = f13 / thumbScrollRange;
                    } else {
                        f5 = f13 > CropImageView.DEFAULT_ASPECT_RATIO ? 1.0f : -1.0f;
                    }
                    boolean z13 = b3.f48531a;
                    if (getLayoutDirection() == 1) {
                        f5 = -f5;
                    }
                    float f14 = this.f1008e0;
                    float f15 = f5 + f14;
                    if (f15 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                        f11 = f15 > 1.0f ? 1.0f : f15;
                    }
                    if (f11 != f14) {
                        this.f1000a0 = x12;
                        setThumbPosition(f11);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.V == 2) {
                    this.V = 0;
                    if (motionEvent.getAction() == 1) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    zIsChecked = isChecked();
                    if (z11) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.f1006d0) {
                            boolean z14 = b3.f48531a;
                            if (getLayoutDirection() == 1) {
                            }
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.V = 0;
                velocityTracker.clear();
            }
        } else {
            float x13 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (isEnabled() && this.f999a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f999a;
                Rect rect = this.f1027v0;
                drawable.getPadding(rect);
                int i13 = this.f1014j0 - i11;
                int i14 = (this.f1013i0 + thumbOffset) - i11;
                int i15 = this.f1012h0 + i14 + rect.left + rect.right + i11;
                int i16 = this.f1016l0 + i11;
                if (x13 > i14 && x13 < i15 && y11 > i13 && y11 < i16) {
                    this.V = 1;
                    this.f1000a0 = x13;
                    this.f1002b0 = y11;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z11) {
        super.setAllCaps(z11);
        getEmojiTextViewHelper().c(z11);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        super.setChecked(z11);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.Q;
                if (string == null) {
                    string = getResources().getString(com.lingodeer.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = s0.f58893a;
                new f0(com.lingodeer.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.S;
            if (string2 == null) {
                string2 = getResources().getString(com.lingodeer.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = s0.f58893a;
            new f0(com.lingodeer.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj2);
        }
        IBinder windowToken = getWindowToken();
        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (windowToken == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f1023s0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (zIsChecked) {
                f5 = 1.0f;
            }
            setThumbPosition(f5);
            return;
        }
        if (zIsChecked) {
            f5 = 1.0f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f997w0, f5);
        this.f1023s0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f1023s0.setAutoCancel(true);
        this.f1023s0.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(v10.c.O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z11) {
        getEmojiTextViewHelper().d(z11);
        setTextOnInternal(this.Q);
        setTextOffInternal(this.S);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z11) {
        this.f1017m0 = z11;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z11) {
        if (this.U != z11) {
            this.U = z11;
            requestLayout();
            if (z11) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z11) {
        this.P = z11;
        invalidate();
    }

    public void setSwitchMinWidth(int i11) {
        this.N = i11;
        requestLayout();
    }

    public void setSwitchPadding(int i11) {
        this.O = i11;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f1018n0;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.S;
        if (string == null) {
            string = getResources().getString(com.lingodeer.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = s0.f58893a;
        new f0(com.lingodeer.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.Q;
        if (string == null) {
            string = getResources().getString(com.lingodeer.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = s0.f58893a;
        new f0(com.lingodeer.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f999a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f999a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f5) {
        this.f1008e0 = f5;
        invalidate();
    }

    public void setThumbResource(int i11) {
        setThumbDrawable(jh.h.k(getContext(), i11));
    }

    public void setThumbTextPadding(int i11) {
        this.M = i11;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1001b = colorStateList;
        this.f1005d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1003c = mode;
        this.f1007e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1009f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1009f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i11) {
        setTrackDrawable(jh.h.k(getContext(), i11));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1024t = colorStateList;
        this.K = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.H = mode;
        this.L = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f999a || drawable == this.f1009f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.lingodeer.R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i11) {
        Typeface typeface;
        Typeface typefaceCreate;
        int resourceId;
        super(context, attributeSet, i11);
        this.f1001b = null;
        this.f1003c = null;
        this.f1005d = false;
        this.f1007e = false;
        this.f1024t = null;
        this.H = null;
        this.K = false;
        this.L = false;
        this.f1004c0 = VelocityTracker.obtain();
        this.f1017m0 = true;
        this.f1027v0 = new Rect();
        i2.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1018n0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = k.a.f37422y;
        m4 m4VarK = m4.k(context, attributeSet, iArr, i11);
        TypedArray typedArray = (TypedArray) m4VarK.f48061c;
        s0.p(this, context, iArr, attributeSet, typedArray, i11);
        Drawable drawableG = m4VarK.g(2);
        this.f999a = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = m4VarK.g(11);
        this.f1009f = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.U = typedArray.getBoolean(3, true);
        this.M = typedArray.getDimensionPixelSize(8, 0);
        this.N = typedArray.getDimensionPixelSize(5, 0);
        this.O = typedArray.getDimensionPixelSize(6, 0);
        this.P = typedArray.getBoolean(4, false);
        ColorStateList colorStateListF = m4VarK.f(9);
        if (colorStateListF != null) {
            this.f1001b = colorStateListF;
            this.f1005d = true;
        }
        PorterDuff.Mode modeC = c1.c(typedArray.getInt(10, -1), null);
        if (this.f1003c != modeC) {
            this.f1003c = modeC;
            this.f1007e = true;
        }
        if (this.f1005d || this.f1007e) {
            a();
        }
        ColorStateList colorStateListF2 = m4VarK.f(12);
        if (colorStateListF2 != null) {
            this.f1024t = colorStateListF2;
            this.K = true;
        }
        PorterDuff.Mode modeC2 = c1.c(typedArray.getInt(13, -1), null);
        if (this.H != modeC2) {
            this.H = modeC2;
            this.L = true;
        }
        if (this.K || this.L) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, k.a.f37423z);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = o4.c.b(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f1019o0 = colorStateList;
            } else {
                this.f1019o0 = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f5 = dimensionPixelSize;
                if (f5 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f5);
                    requestLayout();
                }
            }
            int i12 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i13 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i12 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i12 != 2) {
                typeface = i12 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
            if (i13 > 0) {
                if (typeface == null) {
                    typefaceCreate = Typeface.defaultFromStyle(i13);
                } else {
                    typefaceCreate = Typeface.create(typeface, i13);
                }
                setSwitchTypeface(typefaceCreate);
                int i14 = (~(typefaceCreate != null ? typefaceCreate.getStyle() : 0)) & i13;
                textPaint.setFakeBoldText((i14 & 1) != 0);
                textPaint.setTextSkewX((2 & i14) != 0 ? -0.25f : f11);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(CropImageView.DEFAULT_ASPECT_RATIO);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                o.a aVar = new o.a();
                aVar.f44350a = context2.getResources().getConfiguration().locale;
                this.f1022r0 = aVar;
            } else {
                this.f1022r0 = null;
            }
            setTextOnInternal(this.Q);
            setTextOffInternal(this.S);
            typedArrayObtainStyledAttributes.recycle();
        }
        new o0(this).f(attributeSet, i11);
        m4VarK.l();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.W = viewConfiguration.getScaledTouchSlop();
        this.f1006d0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, i11);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
