package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import jh.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Slider extends BaseSlider<Slider, OnChangeListener, OnSliderTouchListener> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnChangeListener extends BaseOnChangeListener<Slider> {
        @Override // com.google.android.material.slider.BaseOnChangeListener
        /* bridge */ /* synthetic */ default void a(Object obj, float f5, boolean z11) {
            b();
        }

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnSliderTouchListener extends BaseOnSliderTouchListener<Slider> {
        @Override // com.google.android.material.slider.BaseOnSliderTouchListener
        /* bridge */ /* synthetic */ default void a(Object obj) {
            d();
        }

        @Override // com.google.android.material.slider.BaseOnSliderTouchListener
        /* bridge */ /* synthetic */ default void b(Object obj) {
            f();
        }

        void d();

        void f();
    }

    public Slider(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.P0;
    }

    public int getFocusedThumbIndex() {
        return this.Q0;
    }

    public int getHaloRadius() {
        return this.f15406m0;
    }

    public ColorStateList getHaloTintList() {
        return this.Z0;
    }

    public int getLabelBehavior() {
        return this.f15396h0;
    }

    public float getStepSize() {
        return this.R0;
    }

    public float getThumbElevation() {
        return this.f15409n1.f15200b.f15226n;
    }

    public int getThumbHeight() {
        return this.f15404l0;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public int getThumbRadius() {
        return this.f15402k0 / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f15409n1.f15200b.f15218e;
    }

    public float getThumbStrokeWidth() {
        return this.f15409n1.f15200b.f15224k;
    }

    public ColorStateList getThumbTintList() {
        return this.f15409n1.f15200b.f15217d;
    }

    public int getThumbTrackGapSize() {
        return this.f15408n0;
    }

    public int getThumbWidth() {
        return this.f15402k0;
    }

    public int getTickActiveRadius() {
        return this.U0;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f15380a1;
    }

    public int getTickInactiveRadius() {
        return this.V0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f15383b1;
    }

    public ColorStateList getTickTintList() {
        if (this.f15383b1.equals(this.f15380a1)) {
            return this.f15380a1;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public int getTickVisibilityMode() {
        return this.T0;
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f15386c1;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackCornerSize() {
        return super.getTrackCornerSize();
    }

    public int getTrackHeight() {
        return this.f15398i0;
    }

    public ColorStateList getTrackIconActiveColor() {
        return this.f15430y0;
    }

    public Drawable getTrackIconActiveEnd() {
        return this.f15427w0;
    }

    public Drawable getTrackIconActiveStart() {
        return this.f15423u0;
    }

    public ColorStateList getTrackIconInactiveColor() {
        return this.D0;
    }

    public Drawable getTrackIconInactiveEnd() {
        return this.B0;
    }

    public Drawable getTrackIconInactiveStart() {
        return this.f15431z0;
    }

    public int getTrackIconSize() {
        return this.E0;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f15389d1;
    }

    public int getTrackInsideCornerSize() {
        return this.f15418s0;
    }

    public int getTrackSidePadding() {
        return this.f15400j0;
    }

    public int getTrackStopIndicatorSize() {
        return this.f15414q0;
    }

    public ColorStateList getTrackTintList() {
        if (this.f15389d1.equals(this.f15386c1)) {
            return this.f15386c1;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.W0;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public float getValueFrom() {
        return this.M0;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public float getValueTo() {
        return this.N0;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public final boolean o() {
        return this.f15421t0;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setCentered(boolean z11) {
        super.setCentered(z11);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z11) {
        super.setEnabled(z11);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i11) {
        super.setFocusedThumbIndex(i11);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadius(int i11) {
        super.setHaloRadius(i11);
    }

    public void setHaloRadiusResource(int i11) {
        setHaloRadius(getResources().getDimensionPixelSize(i11));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloTintList(ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelBehavior(int i11) {
        super.setLabelBehavior(i11);
    }

    public void setLabelFormatter(LabelFormatter labelFormatter) {
        this.K0 = labelFormatter;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setOrientation(int i11) {
        super.setOrientation(i11);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setStepSize(float f5) {
        super.setStepSize(f5);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevation(float f5) {
        super.setThumbElevation(f5);
    }

    public void setThumbElevationResource(int i11) {
        setThumbElevation(getResources().getDimension(i11));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbHeight(int i11) {
        super.setThumbHeight(i11);
    }

    public void setThumbHeightResource(int i11) {
        setThumbHeight(getResources().getDimensionPixelSize(i11));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadius(int i11) {
        super.setThumbRadius(i11);
    }

    public void setThumbRadiusResource(int i11) {
        setThumbRadius(getResources().getDimensionPixelSize(i11));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    public void setThumbStrokeColorResource(int i11) {
        if (i11 != 0) {
            setThumbStrokeColor(o4.c.b(getContext(), i11));
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f5) {
        super.setThumbStrokeWidth(f5);
    }

    public void setThumbStrokeWidthResource(int i11) {
        if (i11 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i11));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f15409n1;
        if (colorStateList.equals(materialShapeDrawable.f15200b.f15217d)) {
            return;
        }
        materialShapeDrawable.r(colorStateList);
        invalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbTrackGapSize(int i11) {
        super.setThumbTrackGapSize(i11);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbWidth(int i11) {
        super.setThumbWidth(i11);
    }

    public void setThumbWidthResource(int i11) {
        setThumbWidth(getResources().getDimensionPixelSize(i11));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveRadius(int i11) {
        super.setTickActiveRadius(i11);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveTintList(ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveRadius(int i11) {
        super.setTickInactiveRadius(i11);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickVisibilityMode(int i11) {
        super.setTickVisibilityMode(i11);
    }

    @Deprecated
    public void setTickVisible(boolean z11) {
        setTickVisibilityMode(z11 ? 0 : 2);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackCornerSize(int i11) {
        super.setTrackCornerSize(i11);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackHeight(int i11) {
        super.setTrackHeight(i11);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconActiveColor(ColorStateList colorStateList) {
        super.setTrackIconActiveColor(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconActiveEnd(Drawable drawable) {
        super.setTrackIconActiveEnd(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconActiveStart(Drawable drawable) {
        super.setTrackIconActiveStart(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconInactiveColor(ColorStateList colorStateList) {
        super.setTrackIconInactiveColor(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconInactiveEnd(Drawable drawable) {
        super.setTrackIconInactiveEnd(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconInactiveStart(Drawable drawable) {
        super.setTrackIconInactiveStart(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconSize(int i11) {
        super.setTrackIconSize(i11);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInsideCornerSize(int i11) {
        super.setTrackInsideCornerSize(i11);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackStopIndicatorSize(int i11) {
        super.setTrackStopIndicatorSize(i11);
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f5) {
        setValues(Float.valueOf(f5));
    }

    public void setValueFrom(float f5) {
        this.M0 = f5;
        this.Y0 = true;
        postInvalidate();
    }

    public void setValueTo(float f5) {
        this.N0 = f5;
        this.Y0 = true;
        postInvalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public final boolean y() {
        if (getActiveThumbIndex() != -1) {
            return true;
        }
        setActiveThumbIndex(0);
        return true;
    }

    public Slider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public void setCustomThumbDrawable(int i11) {
        setCustomThumbDrawable(getResources().getDrawable(i11));
    }

    public void setTrackIconActiveEnd(int i11) {
        setTrackIconActiveEnd(i11 != 0 ? h.k(getContext(), i11) : null);
    }

    public void setTrackIconActiveStart(int i11) {
        setTrackIconActiveStart(i11 != 0 ? h.k(getContext(), i11) : null);
    }

    public void setTrackIconInactiveEnd(int i11) {
        setTrackIconInactiveEnd(i11 != 0 ? h.k(getContext(), i11) : null);
    }

    public void setTrackIconInactiveStart(int i11) {
        setTrackIconInactiveStart(i11 != 0 ? h.k(getContext(), i11) : null);
    }

    public Slider(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, CropImageView.DEFAULT_ASPECT_RATIO));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
