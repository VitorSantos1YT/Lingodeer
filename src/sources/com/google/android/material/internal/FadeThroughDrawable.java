package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FadeThroughDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f14657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f14658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f14659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14660d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class EmptyDrawable extends Drawable {
        private EmptyDrawable() {
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -2;
        }

        public /* synthetic */ EmptyDrawable(int i11) {
            this();
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i11) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public FadeThroughDrawable(Drawable drawable, Drawable drawable2) {
        Drawable drawableMutate = drawable != null ? drawable.getConstantState().newDrawable().mutate() : new EmptyDrawable(0);
        this.f14657a = drawableMutate;
        Drawable drawableMutate2 = drawable2.getConstantState().newDrawable().mutate();
        this.f14658b = drawableMutate2;
        int layoutDirection = drawable != null ? drawable.getLayoutDirection() : 3;
        int layoutDirection2 = drawable2.getLayoutDirection();
        drawableMutate.setLayoutDirection(layoutDirection);
        drawableMutate2.setLayoutDirection(layoutDirection2);
        drawableMutate2.setAlpha(0);
        this.f14659c = new float[2];
    }

    public final void a(float f5) {
        if (this.f14660d != f5) {
            this.f14660d = f5;
            float[] fArr = this.f14659c;
            FadeThroughUtils.a(f5, fArr);
            this.f14657a.setAlpha((int) (fArr[0] * 255.0f));
            this.f14658b.setAlpha((int) (fArr[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f14657a.draw(canvas);
        this.f14658b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f14657a.getIntrinsicHeight(), this.f14658b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f14657a.getIntrinsicWidth(), this.f14658b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return Math.max(this.f14657a.getMinimumHeight(), this.f14658b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return Math.max(this.f14657a.getMinimumWidth(), this.f14658b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f14657a.isStateful() || this.f14658b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        float f5 = this.f14660d;
        Drawable drawable = this.f14658b;
        Drawable drawable2 = this.f14657a;
        if (f5 <= 0.5f) {
            drawable2.setAlpha(i11);
            drawable.setAlpha(0);
        } else {
            drawable2.setAlpha(0);
            drawable.setAlpha(i11);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i11, int i12, int i13, int i14) {
        super.setBounds(i11, i12, i13, i14);
        this.f14657a.setBounds(i11, i12, i13, i14);
        this.f14658b.setBounds(i11, i12, i13, i14);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f14657a.setColorFilter(colorFilter);
        this.f14658b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        return this.f14657a.setState(iArr) || this.f14658b.setState(iArr);
    }
}
