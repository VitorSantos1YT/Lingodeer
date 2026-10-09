package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zah extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zag f9599f;

    public final boolean a() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i11 = this.f9594a;
        boolean z11 = false;
        boolean z12 = true;
        if (i11 != 1) {
            if (i11 == 2 && this.f9595b >= 0) {
                float f5 = 0;
                float fUptimeMillis = (SystemClock.uptimeMillis() - this.f9595b) / f5;
                z12 = fUptimeMillis >= 1.0f;
                if (z12) {
                    this.f9594a = 0;
                }
                this.f9597d = (int) ((Math.min(fUptimeMillis, 1.0f) * f5) + CropImageView.DEFAULT_ASPECT_RATIO);
            }
            z11 = z12;
        } else {
            this.f9595b = SystemClock.uptimeMillis();
            this.f9594a = 2;
        }
        int i12 = this.f9597d;
        boolean z13 = this.f9598e;
        if (!z11) {
            if (!z13) {
                throw null;
            }
            throw null;
        }
        if (!z13 || i12 == 0 || i12 == this.f9596c) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        zag zagVar = this.f9599f;
        return changingConfigurations | zagVar.f9592a | zagVar.f9593b;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        zag zagVar = this.f9599f;
        if (!a()) {
            return null;
        }
        zagVar.f9592a = getChangingConfigurations();
        return zagVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (super.mutate() != this) {
            return this;
        }
        if (a()) {
            throw null;
        }
        throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        if (this.f9597d == this.f9596c) {
            this.f9597d = i11;
        }
        this.f9596c = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
