package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[][] f15078t = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f15079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15080f;

    public MaterialRadioButton(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f15079e == null) {
            int iC = MaterialColors.c(this, com.lingodeer.R.attr.colorControlActivated);
            int iC2 = MaterialColors.c(this, com.lingodeer.R.attr.colorOnSurface);
            int iC3 = MaterialColors.c(this, com.lingodeer.R.attr.colorSurface);
            this.f15079e = new ColorStateList(f15078t, new int[]{MaterialColors.f(iC3, 1.0f, iC), MaterialColors.f(iC3, 0.54f, iC2), MaterialColors.f(iC3, 0.38f, iC2), MaterialColors.f(iC3, 0.38f, iC2)});
        }
        return this.f15079e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15080f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z11) {
        this.f15080f = z11;
        if (z11) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.lingodeer.R.attr.radioButtonStyle);
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, com.lingodeer.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, i11);
        Context context2 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.J, i11, com.lingodeer.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayD.hasValue(0)) {
            setButtonTintList(MaterialResources.a(context2, typedArrayD, 0));
        }
        this.f15080f = typedArrayD.getBoolean(1, false);
        typedArrayD.recycle();
    }
}
