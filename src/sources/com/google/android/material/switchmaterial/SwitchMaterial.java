package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SwitchMaterial extends SwitchCompat {
    public static final int[][] C0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList A0;
    public boolean B0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final ElevationOverlayProvider f15513y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ColorStateList f15514z0;

    public SwitchMaterial(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f15514z0 == null) {
            int iC = MaterialColors.c(this, com.lingodeer.R.attr.colorSurface);
            int iC2 = MaterialColors.c(this, com.lingodeer.R.attr.colorControlActivated);
            float dimension = getResources().getDimension(com.lingodeer.R.dimen.mtrl_switch_thumb_elevation);
            ElevationOverlayProvider elevationOverlayProvider = this.f15513y0;
            if (elevationOverlayProvider.f14456a) {
                float elevation = CropImageView.DEFAULT_ASPECT_RATIO;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    elevation += ((View) parent).getElevation();
                }
                dimension += elevation;
            }
            int iA = elevationOverlayProvider.a(iC, dimension);
            this.f15514z0 = new ColorStateList(C0, new int[]{MaterialColors.f(iC, 1.0f, iC2), iA, MaterialColors.f(iC, 0.38f, iC2), iA});
        }
        return this.f15514z0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.A0 == null) {
            int iC = MaterialColors.c(this, com.lingodeer.R.attr.colorSurface);
            int iC2 = MaterialColors.c(this, com.lingodeer.R.attr.colorControlActivated);
            int iC3 = MaterialColors.c(this, com.lingodeer.R.attr.colorOnSurface);
            this.A0 = new ColorStateList(C0, new int[]{MaterialColors.f(iC, 0.54f, iC2), MaterialColors.f(iC, 0.32f, iC3), MaterialColors.f(iC, 0.12f, iC2), MaterialColors.f(iC, 0.12f, iC3)});
        }
        return this.A0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.B0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.B0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z11) {
        this.B0 = z11;
        if (z11) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.lingodeer.R.attr.switchStyle);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, com.lingodeer.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet, i11);
        Context context2 = getContext();
        this.f15513y0 = new ElevationOverlayProvider(context2);
        ThemeEnforcement.a(context2, attributeSet, i11, com.lingodeer.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        int[] iArr = com.google.android.material.R.styleable.f13744h0;
        ThemeEnforcement.b(context2, attributeSet, iArr, i11, com.lingodeer.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i11, com.lingodeer.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        this.B0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
