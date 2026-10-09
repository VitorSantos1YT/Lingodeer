package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RippleDrawableCompat extends Drawable implements Shapeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RippleDrawableCompatState f15105a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class RippleDrawableCompatState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MaterialShapeDrawable f15106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f15107b;

        public RippleDrawableCompatState(RippleDrawableCompatState rippleDrawableCompatState) {
            this.f15106a = (MaterialShapeDrawable) rippleDrawableCompatState.f15106a.f15200b.newDrawable();
            this.f15107b = rippleDrawableCompatState.f15107b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            RippleDrawableCompatState rippleDrawableCompatState = new RippleDrawableCompatState(this);
            RippleDrawableCompat rippleDrawableCompat = new RippleDrawableCompat();
            rippleDrawableCompat.f15105a = rippleDrawableCompatState;
            return rippleDrawableCompat;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RippleDrawableCompatState rippleDrawableCompatState = this.f15105a;
        if (rippleDrawableCompatState.f15107b) {
            rippleDrawableCompatState.f15106a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f15105a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        this.f15105a.f15106a.getClass();
        return -3;
    }

    @Override // com.google.android.material.shape.Shapeable
    public final ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f15105a.f15106a.f15200b.f15214a;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f15105a = new RippleDrawableCompatState(this.f15105a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f15105a.f15106a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f15105a.f15106a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zD = RippleUtils.d(iArr);
        RippleDrawableCompatState rippleDrawableCompatState = this.f15105a;
        if (rippleDrawableCompatState.f15107b == zD) {
            return zOnStateChange;
        }
        rippleDrawableCompatState.f15107b = zD;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f15105a.f15106a.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15105a.f15106a.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.shape.Shapeable
    public final void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.f15105a.f15106a.setShapeAppearanceModel(shapeAppearanceModel);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i11) {
        this.f15105a.f15106a.setTint(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f15105a.f15106a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f15105a.f15106a.setTintMode(mode);
    }
}
