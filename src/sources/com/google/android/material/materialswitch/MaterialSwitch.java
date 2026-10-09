package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;
import jh.h;
import qp.m4;
import r4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialSwitch extends SwitchCompat {
    public static final int[] L0 = {R.attr.state_with_icon};
    public int A0;
    public Drawable B0;
    public Drawable C0;
    public ColorStateList D0;
    public ColorStateList E0;
    public PorterDuff.Mode F0;
    public ColorStateList G0;
    public ColorStateList H0;
    public PorterDuff.Mode I0;
    public int[] J0;
    public int[] K0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Drawable f14788y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Drawable f14789z0;

    public MaterialSwitch(Context context) {
        this(context, null);
    }

    public static void g(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f5) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(c.b(colorStateList.getColorForState(iArr, 0), f5, colorStateList.getColorForState(iArr2, 0)));
    }

    public final void e() {
        this.f14788y0 = DrawableUtils.b(this.f14788y0, this.D0, getThumbTintMode());
        this.f14789z0 = DrawableUtils.b(this.f14789z0, this.E0, this.F0);
        h();
        Drawable drawable = this.f14788y0;
        Drawable drawable2 = this.f14789z0;
        int i11 = this.A0;
        super.setThumbDrawable(DrawableUtils.a(drawable, drawable2, i11, i11));
        refreshDrawableState();
    }

    public final void f() {
        this.B0 = DrawableUtils.b(this.B0, this.G0, getTrackTintMode());
        this.C0 = DrawableUtils.b(this.C0, this.H0, this.I0);
        h();
        Drawable layerDrawable = this.B0;
        if (layerDrawable != null && this.C0 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.B0, this.C0});
        } else if (layerDrawable == null) {
            layerDrawable = this.C0;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.f14788y0;
    }

    public Drawable getThumbIconDrawable() {
        return this.f14789z0;
    }

    public int getThumbIconSize() {
        return this.A0;
    }

    public ColorStateList getThumbIconTintList() {
        return this.E0;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.F0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.D0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.C0;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.H0;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.I0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.B0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.G0;
    }

    public final void h() {
        if (this.D0 == null && this.E0 == null && this.G0 == null && this.H0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.D0;
        if (colorStateList != null) {
            g(this.f14788y0, colorStateList, this.J0, this.K0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.E0;
        if (colorStateList2 != null) {
            g(this.f14789z0, colorStateList2, this.J0, this.K0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.G0;
        if (colorStateList3 != null) {
            g(this.B0, colorStateList3, this.J0, this.K0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.H0;
        if (colorStateList4 != null) {
            g(this.C0, colorStateList4, this.J0, this.K0, thumbPosition);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        h();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        if (this.f14789z0 != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, L0);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i12 = 0;
        for (int i13 : iArrOnCreateDrawableState) {
            if (i13 != 16842912) {
                iArr[i12] = i13;
                i12++;
            }
        }
        this.J0 = iArr;
        this.K0 = DrawableUtils.c(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.f14788y0 = drawable;
        e();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.f14789z0 = drawable;
        e();
    }

    public void setThumbIconResource(int i11) {
        setThumbIconDrawable(h.k(getContext(), i11));
    }

    public void setThumbIconSize(int i11) {
        if (this.A0 != i11) {
            this.A0 = i11;
            e();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.E0 = colorStateList;
        e();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.F0 = mode;
        e();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.D0 = colorStateList;
        e();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        e();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.C0 = drawable;
        f();
    }

    public void setTrackDecorationResource(int i11) {
        setTrackDecorationDrawable(h.k(getContext(), i11));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.H0 = colorStateList;
        f();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.I0 = mode;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.B0 = drawable;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.G0 = colorStateList;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        f();
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSwitchStyle);
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, i11);
        this.A0 = -1;
        Context context2 = getContext();
        this.f14788y0 = super.getThumbDrawable();
        this.D0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.B0 = super.getTrackDrawable();
        this.G0 = super.getTrackTintList();
        super.setTrackTintList(null);
        m4 m4VarE = ThemeEnforcement.e(context2, attributeSet, com.google.android.material.R.styleable.M, i11, R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        this.f14789z0 = m4VarE.g(0);
        TypedArray typedArray = (TypedArray) m4VarE.f48061c;
        this.A0 = typedArray.getDimensionPixelSize(1, -1);
        this.E0 = m4VarE.f(2);
        int i12 = typedArray.getInt(3, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.F0 = ViewUtils.h(i12, mode);
        this.C0 = m4VarE.g(4);
        this.H0 = m4VarE.f(5);
        this.I0 = ViewUtils.h(typedArray.getInt(6, -1), mode);
        m4VarE.l();
        setEnforceSwitchWidth(false);
        e();
        f();
    }
}
