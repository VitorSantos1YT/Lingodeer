package com.google.android.material.chip;

import a5.c;
import a5.f;
import a5.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.android.billingclient.api.k0;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.MaterialCheckable;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import jh.h;
import l5.b;
import ub.a;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Chip extends AppCompatCheckBox implements ChipDrawable.Delegate, Shapeable, MaterialCheckable<Chip> {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Rect f14215c0 = new Rect();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int[] f14216d0 = {R.attr.state_selected};

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int[] f14217e0 = {R.attr.state_checkable};
    public View.OnClickListener H;
    public CompoundButton.OnCheckedChangeListener K;
    public MaterialCheckable.OnCheckedChangeListener L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public CharSequence T;
    public final ChipTouchHelper U;
    public boolean V;
    public final Rect W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RectF f14218a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final TextAppearanceFontCallback f14219b0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ChipDrawable f14220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InsetDrawable f14221f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RippleDrawable f14222t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class ChipTouchHelper extends b {
        public ChipTouchHelper(Chip chip) {
            super(chip);
        }

        @Override // l5.b
        public final int n(float f5, float f11) {
            Rect rect = Chip.f14215c0;
            Chip chip = Chip.this;
            return (chip.e() && chip.getCloseIconTouchBounds().contains(f5, f11)) ? 1 : 0;
        }

        @Override // l5.b
        public final void o(ArrayList arrayList) {
            ChipDrawable chipDrawable;
            arrayList.add(0);
            Rect rect = Chip.f14215c0;
            Chip chip = Chip.this;
            if (!chip.e() || (chipDrawable = chip.f14220e) == null || !chipDrawable.f14255w0 || chip.H == null) {
                return;
            }
            arrayList.add(1);
        }

        @Override // l5.b
        public final boolean s(int i11, int i12, Bundle bundle) {
            boolean z11 = false;
            if (i12 == 16) {
                Chip chip = Chip.this;
                if (i11 == 0) {
                    return chip.performClick();
                }
                if (i11 == 1) {
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.H;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z11 = true;
                    }
                    if (chip.V) {
                        chip.U.x(1, 1);
                    }
                }
            }
            return z11;
        }

        @Override // l5.b
        public final void t(g gVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f380a;
            Chip chip = Chip.this;
            ChipDrawable chipDrawable = chip.f14220e;
            accessibilityNodeInfo.setCheckable(chipDrawable != null && chipDrawable.C0);
            accessibilityNodeInfo.setClickable(chip.isClickable());
            gVar.m(chip.getAccessibilityClassName());
            gVar.x(chip.getText());
        }

        @Override // l5.b
        public final void u(int i11, g gVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f380a;
            CharSequence charSequence = BuildConfig.VERSION_NAME;
            if (i11 != 1) {
                gVar.p(BuildConfig.VERSION_NAME);
                accessibilityNodeInfo.setBoundsInParent(Chip.f14215c0);
                return;
            }
            Chip chip = Chip.this;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                gVar.p(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                gVar.p(context.getString(com.lingodeer.R.string.mtrl_chip_close_icon_content_description, charSequence).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            gVar.b(c.f361g);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            gVar.m(Button.class.getName());
        }

        @Override // l5.b
        public final void v(int i11, boolean z11) {
            Chip chip = Chip.this;
            if (i11 == 1) {
                chip.P = z11;
            }
            ChipDrawable chipDrawable = chip.f14220e;
            boolean z12 = chip.P;
            boolean zC0 = false;
            if (chipDrawable.f14256x0 != null) {
                zC0 = chipDrawable.c0(z12 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : ChipDrawable.f14225r1);
            }
            if (zC0) {
                chip.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f14218a0;
        rectF.setEmpty();
        if (e() && this.H != null) {
            ChipDrawable chipDrawable = this.f14220e;
            Rect bounds = chipDrawable.getBounds();
            rectF.setEmpty();
            if (chipDrawable.k0()) {
                float f5 = chipDrawable.P0 + chipDrawable.O0 + chipDrawable.A0 + chipDrawable.N0 + chipDrawable.M0;
                if (chipDrawable.getLayoutDirection() == 0) {
                    float f11 = bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f5;
                } else {
                    float f12 = bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f5;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i11 = (int) closeIconTouchBounds.left;
        int i12 = (int) closeIconTouchBounds.top;
        int i13 = (int) closeIconTouchBounds.right;
        int i14 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.W;
        rect.set(i11, i12, i13, i14);
        return rect;
    }

    private TextAppearance getTextAppearance() {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            return chipDrawable.W0.f14736g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z11) {
        if (this.O != z11) {
            this.O = z11;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z11) {
        if (this.N != z11) {
            this.N = z11;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.ChipDrawable.Delegate
    public final void a() {
        d(this.S);
        requestLayout();
        invalidateOutline();
    }

    public final void d(int i11) {
        this.S = i11;
        if (!this.Q) {
            InsetDrawable insetDrawable = this.f14221f;
            if (insetDrawable == null) {
                g();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f14221f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i11 - ((int) this.f14220e.f14238l0));
        int iMax2 = Math.max(0, i11 - this.f14220e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f14221f;
            if (insetDrawable2 == null) {
                g();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f14221f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
        }
        int i12 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i13 = iMax > 0 ? iMax / 2 : 0;
        if (this.f14221f != null) {
            Rect rect = new Rect();
            this.f14221f.getPadding(rect);
            if (rect.top == i13 && rect.bottom == i13 && rect.left == i12 && rect.right == i12) {
                g();
                return;
            }
        }
        if (getMinHeight() != i11) {
            setMinHeight(i11);
        }
        if (getMinWidth() != i11) {
            setMinWidth(i11);
        }
        this.f14221f = new InsetDrawable((Drawable) this.f14220e, i12, i13, i12, i13);
        g();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.V) {
            return this.U.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i11;
        if (!this.V) {
            return super.dispatchKeyEvent(keyEvent);
        }
        ChipTouchHelper chipTouchHelper = this.U;
        chipTouchHelper.getClass();
        boolean zQ = false;
        int i12 = 0;
        zQ = false;
        zQ = false;
        zQ = false;
        zQ = false;
        zQ = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i13 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i13 = 33;
                                } else if (keyCode == 21) {
                                    i13 = 17;
                                } else if (keyCode != 22) {
                                    i13 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z11 = false;
                                while (i12 < repeatCount && chipTouchHelper.q(i13, null)) {
                                    i12++;
                                    z11 = true;
                                }
                                zQ = z11;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i11 = chipTouchHelper.N;
                                if (i11 != Integer.MIN_VALUE) {
                                    chipTouchHelper.s(i11, 16, null);
                                }
                                zQ = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i11 = chipTouchHelper.N;
                    if (i11 != Integer.MIN_VALUE) {
                        chipTouchHelper.s(i11, 16, null);
                    }
                    zQ = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zQ = chipTouchHelper.q(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zQ = chipTouchHelper.q(1, null);
            }
        }
        if (!zQ || chipTouchHelper.N == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i11;
        super.drawableStateChanged();
        ChipDrawable chipDrawable = this.f14220e;
        boolean zC0 = false;
        int i12 = 0;
        zC0 = false;
        if (chipDrawable != null && ChipDrawable.K(chipDrawable.f14256x0)) {
            ChipDrawable chipDrawable2 = this.f14220e;
            ?? IsEnabled = isEnabled();
            if (this.P) {
                i11 = IsEnabled;
                i11 = IsEnabled + 1;
            }
            i11 = IsEnabled;
            int i13 = i11;
            if (this.O) {
                i13 = i11 + 1;
            }
            int i14 = i13;
            if (this.N) {
                i14 = i13 + 1;
            }
            int i15 = i14;
            if (isChecked()) {
                i15 = i14 + 1;
            }
            int[] iArr = new int[i15];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i12 = 1;
            }
            if (this.P) {
                iArr[i12] = 16842908;
                i12++;
            }
            if (this.O) {
                iArr[i12] = 16843623;
                i12++;
            }
            if (this.N) {
                iArr[i12] = 16842919;
                i12++;
            }
            if (isChecked()) {
                iArr[i12] = 16842913;
            }
            zC0 = chipDrawable2.c0(iArr);
        }
        if (zC0) {
            invalidate();
        }
    }

    public final boolean e() {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable == null) {
            return false;
        }
        Drawable drawable = chipDrawable.f14256x0;
        return (drawable != null ? a.i0(drawable) : null) != null;
    }

    public final void f() {
        ChipDrawable chipDrawable;
        if (!e() || (chipDrawable = this.f14220e) == null || !chipDrawable.f14255w0 || this.H == null) {
            s0.q(this, null);
            this.V = false;
        } else {
            s0.q(this, this.U);
            this.V = true;
        }
    }

    public final void g() {
        this.f14222t = new RippleDrawable(RippleUtils.c(this.f14220e.f14246p0), getBackgroundDrawable(), null);
        this.f14220e.getClass();
        setBackground(this.f14222t);
        h();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.T)) {
            return this.T;
        }
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable == null || !chipDrawable.C0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).H.f14594d) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f14221f;
        return insetDrawable == null ? this.f14220e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            return chipDrawable.E0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            return chipDrawable.F0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            return chipDrawable.f14236k0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        ChipDrawable chipDrawable = this.f14220e;
        return chipDrawable != null ? Math.max(CropImageView.DEFAULT_ASPECT_RATIO, chipDrawable.I()) : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public Drawable getChipDrawable() {
        return this.f14220e;
    }

    public float getChipEndPadding() {
        ChipDrawable chipDrawable = this.f14220e;
        return chipDrawable != null ? chipDrawable.P0 : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable == null || (drawable = chipDrawable.f14251s0) == null) {
            return null;
        }
        return a.i0(drawable);
    }

    public float getChipIconSize() {
        ChipDrawable chipDrawable = this.f14220e;
        return chipDrawable != null ? chipDrawable.f14253u0 : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public ColorStateList getChipIconTint() {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            return chipDrawable.f14252t0;
        }
        return null;
    }

    public float getChipMinHeight() {
        ChipDrawable chipDrawable = this.f14220e;
        return chipDrawable != null ? chipDrawable.f14238l0 : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public float getChipStartPadding() {
        ChipDrawable chipDrawable = this.f14220e;
        return chipDrawable != null ? chipDrawable.I0 : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public ColorStateList getChipStrokeColor() {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            return chipDrawable.f14242n0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        ChipDrawable chipDrawable = this.f14220e;
        return chipDrawable != null ? chipDrawable.f14244o0 : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable == null || (drawable = chipDrawable.f14256x0) == null) {
            return null;
        }
        return a.i0(drawable);
    }

    public CharSequence getCloseIconContentDescription() {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            return chipDrawable.B0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        ChipDrawable chipDrawable = this.f14220e;
        return chipDrawable != null ? chipDrawable.O0 : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public float getCloseIconSize() {
        ChipDrawable chipDrawable = this.f14220e;
        return chipDrawable != null ? chipDrawable.A0 : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public float getCloseIconStartPadding() {
        ChipDrawable chipDrawable = this.f14220e;
        return chipDrawable != null ? chipDrawable.N0 : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public ColorStateList getCloseIconTint() {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            return chipDrawable.f14258z0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            return chipDrawable.f14243n1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.V) {
            ChipTouchHelper chipTouchHelper = this.U;
            if (chipTouchHelper.N == 1 || chipTouchHelper.M == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public MotionSpec getHideMotionSpec() {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            return chipDrawable.H0;
        }
        return null;
    }

    public float getIconEndPadding() {
        ChipDrawable chipDrawable = this.f14220e;
        return chipDrawable != null ? chipDrawable.K0 : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public float getIconStartPadding() {
        ChipDrawable chipDrawable = this.f14220e;
        return chipDrawable != null ? chipDrawable.J0 : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public ColorStateList getRippleColor() {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            return chipDrawable.f14246p0;
        }
        return null;
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f14220e.f15200b.f15214a;
    }

    public MotionSpec getShowMotionSpec() {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            return chipDrawable.G0;
        }
        return null;
    }

    public float getTextEndPadding() {
        ChipDrawable chipDrawable = this.f14220e;
        return chipDrawable != null ? chipDrawable.M0 : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public float getTextStartPadding() {
        ChipDrawable chipDrawable = this.f14220e;
        return chipDrawable != null ? chipDrawable.L0 : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final void h() {
        ChipDrawable chipDrawable;
        if (TextUtils.isEmpty(getText()) || (chipDrawable = this.f14220e) == null) {
            return;
        }
        int iH = (int) (chipDrawable.H() + chipDrawable.P0 + chipDrawable.M0);
        ChipDrawable chipDrawable2 = this.f14220e;
        int iG = (int) (chipDrawable2.G() + chipDrawable2.I0 + chipDrawable2.L0);
        if (this.f14221f != null) {
            Rect rect = new Rect();
            this.f14221f.getPadding(rect);
            iG += rect.left;
            iH += rect.right;
        }
        setPaddingRelative(iG, getPaddingTop(), iH, getPaddingBottom());
    }

    public final void i() {
        TextPaint paint = getPaint();
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            paint.drawableState = chipDrawable.getState();
        }
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.f14219b0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.c(this, this.f14220e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14216d0);
        }
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null && chipDrawable.C0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14217e0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (this.V) {
            ChipTouchHelper chipTouchHelper = this.U;
            int i12 = chipTouchHelper.N;
            if (i12 != Integer.MIN_VALUE) {
                chipTouchHelper.j(i12);
            }
            if (z11) {
                chipTouchHelper.q(i11, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        ChipDrawable chipDrawable = this.f14220e;
        int i12 = 0;
        accessibilityNodeInfo.setCheckable(chipDrawable != null && chipDrawable.C0);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f14666c) {
                int i13 = 0;
                while (true) {
                    if (i12 >= chipGroup.getChildCount()) {
                        i13 = -1;
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i12);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i12).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    i12++;
                }
                i11 = i13;
            } else {
                i11 = -1;
            }
            Object tag = getTag(com.lingodeer.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f.o(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i11, 1, false, isChecked()).f378b);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i11) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i11);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i11) {
        super.onRtlPropertiesChanged(i11);
        if (this.R != i11) {
            this.R = i11;
            h();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.N) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z11 = true;
                }
                z11 = false;
            } else {
                if (this.N) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.H;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.V) {
                        this.U.x(1, 1);
                    }
                    z11 = true;
                }
                setCloseIconPressed(false);
            }
            z11 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z11 = true;
        } else {
            z11 = false;
        }
        return z11 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.T = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f14222t) {
            super.setBackground(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f14222t) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setCheckable(boolean z11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.N(z11);
        }
    }

    public void setCheckableResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.N(chipDrawable.Q0.getResources().getBoolean(i11));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable == null) {
            this.M = z11;
        } else if (chipDrawable.C0) {
            super.setChecked(z11);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.O(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z11) {
        setCheckedIconVisible(z11);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i11) {
        setCheckedIconVisible(i11);
    }

    public void setCheckedIconResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.O(h.k(chipDrawable.Q0, i11));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.P(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.P(o4.c.b(chipDrawable.Q0, i11));
        }
    }

    public void setCheckedIconVisible(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.Q(chipDrawable.Q0.getResources().getBoolean(i11));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable == null || chipDrawable.f14236k0 == colorStateList) {
            return;
        }
        chipDrawable.f14236k0 = colorStateList;
        chipDrawable.onStateChange(chipDrawable.getState());
    }

    public void setChipBackgroundColorResource(int i11) {
        ColorStateList colorStateListB;
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable == null || chipDrawable.f14236k0 == (colorStateListB = o4.c.b(chipDrawable.Q0, i11))) {
            return;
        }
        chipDrawable.f14236k0 = colorStateListB;
        chipDrawable.onStateChange(chipDrawable.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f5) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.R(f5);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.R(chipDrawable.Q0.getResources().getDimension(i11));
        }
    }

    public void setChipDrawable(ChipDrawable chipDrawable) {
        ChipDrawable chipDrawable2 = this.f14220e;
        if (chipDrawable2 != chipDrawable) {
            if (chipDrawable2 != null) {
                chipDrawable2.f14241m1 = new WeakReference(null);
            }
            this.f14220e = chipDrawable;
            chipDrawable.f14245o1 = false;
            chipDrawable.f14241m1 = new WeakReference(this);
            d(this.S);
        }
    }

    public void setChipEndPadding(float f5) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable == null || chipDrawable.P0 == f5) {
            return;
        }
        chipDrawable.P0 = f5;
        chipDrawable.invalidateSelf();
        chipDrawable.L();
    }

    public void setChipEndPaddingResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            float dimension = chipDrawable.Q0.getResources().getDimension(i11);
            if (chipDrawable.P0 != dimension) {
                chipDrawable.P0 = dimension;
                chipDrawable.invalidateSelf();
                chipDrawable.L();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.S(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z11) {
        setChipIconVisible(z11);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i11) {
        setChipIconVisible(i11);
    }

    public void setChipIconResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.S(h.k(chipDrawable.Q0, i11));
        }
    }

    public void setChipIconSize(float f5) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.T(f5);
        }
    }

    public void setChipIconSizeResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.T(chipDrawable.Q0.getResources().getDimension(i11));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.U(colorStateList);
        }
    }

    public void setChipIconTintResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.U(o4.c.b(chipDrawable.Q0, i11));
        }
    }

    public void setChipIconVisible(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.V(chipDrawable.Q0.getResources().getBoolean(i11));
        }
    }

    public void setChipMinHeight(float f5) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable == null || chipDrawable.f14238l0 == f5) {
            return;
        }
        chipDrawable.f14238l0 = f5;
        chipDrawable.invalidateSelf();
        chipDrawable.L();
    }

    public void setChipMinHeightResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            float dimension = chipDrawable.Q0.getResources().getDimension(i11);
            if (chipDrawable.f14238l0 != dimension) {
                chipDrawable.f14238l0 = dimension;
                chipDrawable.invalidateSelf();
                chipDrawable.L();
            }
        }
    }

    public void setChipStartPadding(float f5) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable == null || chipDrawable.I0 == f5) {
            return;
        }
        chipDrawable.I0 = f5;
        chipDrawable.invalidateSelf();
        chipDrawable.L();
    }

    public void setChipStartPaddingResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            float dimension = chipDrawable.Q0.getResources().getDimension(i11);
            if (chipDrawable.I0 != dimension) {
                chipDrawable.I0 = dimension;
                chipDrawable.invalidateSelf();
                chipDrawable.L();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.W(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.W(o4.c.b(chipDrawable.Q0, i11));
        }
    }

    public void setChipStrokeWidth(float f5) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.X(f5);
        }
    }

    public void setChipStrokeWidthResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.X(chipDrawable.Q0.getResources().getDimension(i11));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i11) {
        setText(getResources().getString(i11));
    }

    public void setCloseIcon(Drawable drawable) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.Y(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable == null || chipDrawable.B0 == charSequence) {
            return;
        }
        String str = x4.b.f55768b;
        x4.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? x4.b.f55771e : x4.b.f55770d;
        bVar.getClass();
        k0 k0Var = x4.f.f55778a;
        chipDrawable.B0 = bVar.c(charSequence);
        chipDrawable.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z11) {
        setCloseIconVisible(z11);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i11) {
        setCloseIconVisible(i11);
    }

    public void setCloseIconEndPadding(float f5) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.Z(f5);
        }
    }

    public void setCloseIconEndPaddingResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.Z(chipDrawable.Q0.getResources().getDimension(i11));
        }
    }

    public void setCloseIconResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.Y(h.k(chipDrawable.Q0, i11));
        }
        f();
    }

    public void setCloseIconSize(float f5) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.a0(f5);
        }
    }

    public void setCloseIconSizeResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.a0(chipDrawable.Q0.getResources().getDimension(i11));
        }
    }

    public void setCloseIconStartPadding(float f5) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.b0(f5);
        }
    }

    public void setCloseIconStartPaddingResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.b0(chipDrawable.Q0.getResources().getDimension(i11));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.d0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.d0(o4.c.b(chipDrawable.Q0, i11));
        }
    }

    public void setCloseIconVisible(int i11) {
        setCloseIconVisible(getResources().getBoolean(i11));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i13 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i11, i12, i13, i14);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i13 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i11, i12, i13, i14);
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.q(f5);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f14220e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.f14243n1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z11) {
        this.Q = z11;
        d(this.S);
    }

    @Override // android.widget.TextView
    public void setGravity(int i11) {
        if (i11 != 8388627) {
            return;
        }
        super.setGravity(i11);
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.H0 = motionSpec;
        }
    }

    public void setHideMotionSpecResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.H0 = MotionSpec.b(chipDrawable.Q0, i11);
        }
    }

    public void setIconEndPadding(float f5) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.f0(f5);
        }
    }

    public void setIconEndPaddingResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.f0(chipDrawable.Q0.getResources().getDimension(i11));
        }
    }

    public void setIconStartPadding(float f5) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.g0(f5);
        }
    }

    public void setIconStartPaddingResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.g0(chipDrawable.Q0.getResources().getDimension(i11));
        }
    }

    @Override // com.google.android.material.internal.MaterialCheckable
    public void setInternalOnCheckedChangeListener(MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListener) {
        this.L = onCheckedChangeListener;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i11) {
        if (this.f14220e == null) {
            return;
        }
        super.setLayoutDirection(i11);
    }

    @Override // android.widget.TextView
    public void setLines(int i11) {
        if (i11 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i11);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i11) {
        if (i11 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i11);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i11) {
        super.setMaxWidth(i11);
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.f14247p1 = i11;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i11) {
        if (i11 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i11);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.K = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.H = onClickListener;
        f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.h0(colorStateList);
        }
        this.f14220e.getClass();
        g();
    }

    public void setRippleColorResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.h0(o4.c.b(chipDrawable.Q0, i11));
            this.f14220e.getClass();
            g();
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.f14220e.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.G0 = motionSpec;
        }
    }

    public void setShowMotionSpecResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.G0 = MotionSpec.b(chipDrawable.Q0, i11);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z11) {
        if (!z11) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z11);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = BuildConfig.VERSION_NAME;
        }
        super.setText(chipDrawable.f14245o1 ? null : charSequence, bufferType);
        ChipDrawable chipDrawable2 = this.f14220e;
        if (chipDrawable2 == null || TextUtils.equals(chipDrawable2.f14248q0, charSequence)) {
            return;
        }
        chipDrawable2.f14248q0 = charSequence;
        chipDrawable2.W0.f14734e = true;
        chipDrawable2.invalidateSelf();
        chipDrawable2.L();
    }

    public void setTextAppearance(TextAppearance textAppearance) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.W0.c(textAppearance, chipDrawable.Q0);
        }
        i();
    }

    public void setTextAppearanceResource(int i11) {
        setTextAppearance(getContext(), i11);
    }

    public void setTextEndPadding(float f5) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable == null || chipDrawable.M0 == f5) {
            return;
        }
        chipDrawable.M0 = f5;
        chipDrawable.invalidateSelf();
        chipDrawable.L();
    }

    public void setTextEndPaddingResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            float dimension = chipDrawable.Q0.getResources().getDimension(i11);
            if (chipDrawable.M0 != dimension) {
                chipDrawable.M0 = dimension;
                chipDrawable.invalidateSelf();
                chipDrawable.L();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i11, float f5) {
        super.setTextSize(i11, f5);
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            float fApplyDimension = TypedValue.applyDimension(i11, f5, getResources().getDisplayMetrics());
            TextDrawableHelper textDrawableHelper = chipDrawable.W0;
            TextAppearance textAppearance = textDrawableHelper.f14736g;
            if (textAppearance != null) {
                textAppearance.f15095l = fApplyDimension;
                textDrawableHelper.f14730a.setTextSize(fApplyDimension);
                chipDrawable.a();
            }
        }
        i();
    }

    public void setTextStartPadding(float f5) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable == null || chipDrawable.L0 == f5) {
            return;
        }
        chipDrawable.L0 = f5;
        chipDrawable.invalidateSelf();
        chipDrawable.L();
    }

    public void setTextStartPaddingResource(int i11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            float dimension = chipDrawable.Q0.getResources().getDimension(i11);
            if (chipDrawable.L0 != dimension) {
                chipDrawable.L0 = dimension;
                chipDrawable.invalidateSelf();
                chipDrawable.L();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.lingodeer.R.attr.chipStyle);
    }

    public void setCloseIconVisible(boolean z11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.e0(z11);
        }
        f();
    }

    public Chip(Context context, AttributeSet attributeSet, int i11) {
        int resourceId;
        super(MaterialThemeOverlay.a(context, attributeSet, i11, com.lingodeer.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, i11);
        this.W = new Rect();
        this.f14218a0 = new RectF();
        this.f14219b0 = new TextAppearanceFontCallback() { // from class: com.google.android.material.chip.Chip.1
            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public final void b(Typeface typeface, boolean z11) {
                Chip chip = Chip.this;
                ChipDrawable chipDrawable = chip.f14220e;
                chip.setText(chipDrawable.f14245o1 ? chipDrawable.f14248q0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
            }

            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public final void a(int i12) {
            }
        };
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        ChipDrawable chipDrawable = new ChipDrawable(context2, attributeSet, i11);
        Context context3 = chipDrawable.Q0;
        int[] iArr = com.google.android.material.R.styleable.f13745i;
        TypedArray typedArrayD = ThemeEnforcement.d(context3, attributeSet, iArr, i11, com.lingodeer.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        chipDrawable.f14249q1 = typedArrayD.hasValue(37);
        Context context4 = chipDrawable.Q0;
        ColorStateList colorStateListA = MaterialResources.a(context4, typedArrayD, 24);
        if (chipDrawable.f14234j0 != colorStateListA) {
            chipDrawable.f14234j0 = colorStateListA;
            chipDrawable.onStateChange(chipDrawable.getState());
        }
        ColorStateList colorStateListA2 = MaterialResources.a(context4, typedArrayD, 11);
        if (chipDrawable.f14236k0 != colorStateListA2) {
            chipDrawable.f14236k0 = colorStateListA2;
            chipDrawable.onStateChange(chipDrawable.getState());
        }
        float dimension = typedArrayD.getDimension(19, CropImageView.DEFAULT_ASPECT_RATIO);
        if (chipDrawable.f14238l0 != dimension) {
            chipDrawable.f14238l0 = dimension;
            chipDrawable.invalidateSelf();
            chipDrawable.L();
        }
        if (typedArrayD.hasValue(12)) {
            chipDrawable.R(typedArrayD.getDimension(12, CropImageView.DEFAULT_ASPECT_RATIO));
        }
        chipDrawable.W(MaterialResources.a(context4, typedArrayD, 22));
        chipDrawable.X(typedArrayD.getDimension(23, CropImageView.DEFAULT_ASPECT_RATIO));
        chipDrawable.h0(MaterialResources.a(context4, typedArrayD, 36));
        CharSequence text = typedArrayD.getText(5);
        text = text == null ? BuildConfig.VERSION_NAME : text;
        boolean zEquals = TextUtils.equals(chipDrawable.f14248q0, text);
        TextDrawableHelper textDrawableHelper = chipDrawable.W0;
        if (!zEquals) {
            chipDrawable.f14248q0 = text;
            textDrawableHelper.f14734e = true;
            chipDrawable.invalidateSelf();
            chipDrawable.L();
        }
        TextAppearance textAppearance = (!typedArrayD.hasValue(0) || (resourceId = typedArrayD.getResourceId(0, 0)) == 0) ? null : new TextAppearance(context4, resourceId);
        textAppearance.f15095l = typedArrayD.getDimension(1, textAppearance.f15095l);
        textDrawableHelper.c(textAppearance, context4);
        int i12 = typedArrayD.getInt(3, 0);
        if (i12 == 1) {
            chipDrawable.f14243n1 = TextUtils.TruncateAt.START;
        } else if (i12 == 2) {
            chipDrawable.f14243n1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i12 == 3) {
            chipDrawable.f14243n1 = TextUtils.TruncateAt.END;
        }
        chipDrawable.V(typedArrayD.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            chipDrawable.V(typedArrayD.getBoolean(15, false));
        }
        chipDrawable.S(MaterialResources.d(context4, typedArrayD, 14));
        if (typedArrayD.hasValue(17)) {
            chipDrawable.U(MaterialResources.a(context4, typedArrayD, 17));
        }
        chipDrawable.T(typedArrayD.getDimension(16, -1.0f));
        chipDrawable.e0(typedArrayD.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            chipDrawable.e0(typedArrayD.getBoolean(26, false));
        }
        chipDrawable.Y(MaterialResources.d(context4, typedArrayD, 25));
        chipDrawable.d0(MaterialResources.a(context4, typedArrayD, 30));
        chipDrawable.a0(typedArrayD.getDimension(28, CropImageView.DEFAULT_ASPECT_RATIO));
        chipDrawable.N(typedArrayD.getBoolean(6, false));
        chipDrawable.Q(typedArrayD.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            chipDrawable.Q(typedArrayD.getBoolean(8, false));
        }
        chipDrawable.O(MaterialResources.d(context4, typedArrayD, 7));
        if (typedArrayD.hasValue(9)) {
            chipDrawable.P(MaterialResources.a(context4, typedArrayD, 9));
        }
        chipDrawable.G0 = MotionSpec.a(context4, typedArrayD, 39);
        chipDrawable.H0 = MotionSpec.a(context4, typedArrayD, 33);
        float dimension2 = typedArrayD.getDimension(21, CropImageView.DEFAULT_ASPECT_RATIO);
        if (chipDrawable.I0 != dimension2) {
            chipDrawable.I0 = dimension2;
            chipDrawable.invalidateSelf();
            chipDrawable.L();
        }
        chipDrawable.g0(typedArrayD.getDimension(35, CropImageView.DEFAULT_ASPECT_RATIO));
        chipDrawable.f0(typedArrayD.getDimension(34, CropImageView.DEFAULT_ASPECT_RATIO));
        float dimension3 = typedArrayD.getDimension(41, CropImageView.DEFAULT_ASPECT_RATIO);
        if (chipDrawable.L0 != dimension3) {
            chipDrawable.L0 = dimension3;
            chipDrawable.invalidateSelf();
            chipDrawable.L();
        }
        float dimension4 = typedArrayD.getDimension(40, CropImageView.DEFAULT_ASPECT_RATIO);
        if (chipDrawable.M0 != dimension4) {
            chipDrawable.M0 = dimension4;
            chipDrawable.invalidateSelf();
            chipDrawable.L();
        }
        chipDrawable.b0(typedArrayD.getDimension(29, CropImageView.DEFAULT_ASPECT_RATIO));
        chipDrawable.Z(typedArrayD.getDimension(27, CropImageView.DEFAULT_ASPECT_RATIO));
        float dimension5 = typedArrayD.getDimension(13, CropImageView.DEFAULT_ASPECT_RATIO);
        if (chipDrawable.P0 != dimension5) {
            chipDrawable.P0 = dimension5;
            chipDrawable.invalidateSelf();
            chipDrawable.L();
        }
        chipDrawable.f14247p1 = typedArrayD.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayD.recycle();
        ThemeEnforcement.a(context2, attributeSet, i11, com.lingodeer.R.style.Widget_MaterialComponents_Chip_Action);
        ThemeEnforcement.b(context2, attributeSet, iArr, i11, com.lingodeer.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i11, com.lingodeer.R.style.Widget_MaterialComponents_Chip_Action);
        this.Q = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.S = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, MaterialAttributes.c(context2)));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(chipDrawable);
        chipDrawable.q(getElevation());
        ThemeEnforcement.a(context2, attributeSet, i11, com.lingodeer.R.style.Widget_MaterialComponents_Chip_Action);
        ThemeEnforcement.b(context2, attributeSet, iArr, i11, com.lingodeer.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, i11, com.lingodeer.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.U = new ChipTouchHelper(this);
        f();
        if (!zHasValue) {
            setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.chip.Chip.2
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    ChipDrawable chipDrawable2 = Chip.this.f14220e;
                    if (chipDrawable2 != null) {
                        chipDrawable2.getOutline(outline);
                    } else {
                        outline.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                    }
                }
            });
        }
        setChecked(this.M);
        setText(chipDrawable.f14248q0);
        setEllipsize(chipDrawable.f14243n1);
        i();
        if (!this.f14220e.f14245o1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        h();
        if (this.Q) {
            setMinHeight(this.S);
        }
        this.R = getLayoutDirection();
        super.setOnCheckedChangeListener(new qh.g(this, 3));
    }

    public void setCheckedIconVisible(boolean z11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.Q(z11);
        }
    }

    public void setChipIconVisible(boolean z11) {
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            chipDrawable.V(z11);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            Context context2 = chipDrawable.Q0;
            chipDrawable.W0.c(new TextAppearance(context2, i11), context2);
        }
        i();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i11) {
        super.setTextAppearance(i11);
        ChipDrawable chipDrawable = this.f14220e;
        if (chipDrawable != null) {
            Context context = chipDrawable.Q0;
            chipDrawable.W0.c(new TextAppearance(context, i11), context);
        }
        i();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i11) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }
}
