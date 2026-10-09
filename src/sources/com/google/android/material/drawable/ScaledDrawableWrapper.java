package com.google.android.material.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import n.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ScaledDrawableWrapper extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScaledDrawableWrapperState f14452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14453c;

    public ScaledDrawableWrapper(Drawable drawable) {
        super(drawable);
        this.f14452b = new ScaledDrawableWrapperState(drawable != null ? drawable.getConstantState() : null);
    }

    @Override // n.a
    public final void a(Drawable drawable) {
        super.a(drawable);
        ScaledDrawableWrapperState scaledDrawableWrapperState = this.f14452b;
        if (scaledDrawableWrapperState != null) {
            scaledDrawableWrapperState.f14454a = drawable != null ? drawable.getConstantState() : null;
            this.f14453c = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        ScaledDrawableWrapperState scaledDrawableWrapperState = this.f14452b;
        if (scaledDrawableWrapperState.f14454a != null) {
            return scaledDrawableWrapperState;
        }
        return null;
    }

    @Override // n.a, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        this.f14452b.getClass();
        return 0;
    }

    @Override // n.a, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.f14452b.getClass();
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f14453c && super.mutate() == this) {
            Drawable drawable = this.f42897a;
            if (drawable != null) {
                drawable.mutate();
            }
            Drawable.ConstantState constantState = drawable != null ? drawable.getConstantState() : null;
            this.f14452b.getClass();
            this.f14452b = new ScaledDrawableWrapperState(constantState);
            this.f14453c = true;
        }
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ScaledDrawableWrapperState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable.ConstantState f14454a;

        public ScaledDrawableWrapperState(Drawable.ConstantState constantState) {
            this.f14454a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.f14454a;
            if (constantState != null) {
                return constantState.getChangingConfigurations();
            }
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new ScaledDrawableWrapper(this.f14454a.newDrawable());
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new ScaledDrawableWrapper(this.f14454a.newDrawable(resources));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            return new ScaledDrawableWrapper(this.f14454a.newDrawable(resources, theme));
        }
    }
}
