package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialShapeDrawable f14444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14448e;

    public MaterialDivider(Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.f14446c;
    }

    public int getDividerInsetEnd() {
        return this.f14448e;
    }

    public int getDividerInsetStart() {
        return this.f14447d;
    }

    public int getDividerThickness() {
        return this.f14445b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i11;
        super.onDraw(canvas);
        boolean z11 = getLayoutDirection() == 1;
        int i12 = z11 ? this.f14448e : this.f14447d;
        if (z11) {
            width = getWidth();
            i11 = this.f14447d;
        } else {
            width = getWidth();
            i11 = this.f14448e;
        }
        int i13 = width - i11;
        int bottom = getBottom() - getTop();
        MaterialShapeDrawable materialShapeDrawable = this.f14444a;
        materialShapeDrawable.setBounds(i12, 0, i13, bottom);
        materialShapeDrawable.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i12);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i13 = this.f14445b;
            if (i13 > 0 && measuredHeight != i13) {
                measuredHeight = i13;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i11) {
        if (this.f14446c != i11) {
            this.f14446c = i11;
            this.f14444a.r(ColorStateList.valueOf(i11));
            invalidate();
        }
    }

    public void setDividerColorResource(int i11) {
        setDividerColor(getContext().getColor(i11));
    }

    public void setDividerInsetEnd(int i11) {
        this.f14448e = i11;
    }

    public void setDividerInsetEndResource(int i11) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i11));
    }

    public void setDividerInsetStart(int i11) {
        this.f14447d = i11;
    }

    public void setDividerInsetStartResource(int i11) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i11));
    }

    public void setDividerThickness(int i11) {
        if (this.f14445b != i11) {
            this.f14445b = i11;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i11) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i11));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    public MaterialDivider(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, i11);
        Context context2 = getContext();
        this.f14444a = new MaterialShapeDrawable();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.I, i11, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f14445b = typedArrayD.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f14447d = typedArrayD.getDimensionPixelOffset(2, 0);
        this.f14448e = typedArrayD.getDimensionPixelOffset(1, 0);
        setDividerColor(MaterialResources.a(context2, typedArrayD, 0).getDefaultColor());
        typedArrayD.recycle();
    }
}
