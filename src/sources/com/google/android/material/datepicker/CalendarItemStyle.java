package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import ns.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class CalendarItemStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f14310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f14311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f14312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ColorStateList f14313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ShapeAppearanceModel f14315f;

    public CalendarItemStyle(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i11, ShapeAppearanceModel shapeAppearanceModel, Rect rect) {
        o.k(rect.left);
        o.k(rect.top);
        o.k(rect.right);
        o.k(rect.bottom);
        this.f14310a = rect;
        this.f14311b = colorStateList2;
        this.f14312c = colorStateList;
        this.f14313d = colorStateList3;
        this.f14314e = i11;
        this.f14315f = shapeAppearanceModel;
    }

    public static CalendarItemStyle a(Context context, int i11) {
        o.j("Cannot create a CalendarItemStyle with a styleResId of 0", i11 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, R.styleable.F);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListA = MaterialResources.a(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListA2 = MaterialResources.a(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListA3 = MaterialResources.a(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        ShapeAppearanceModel shapeAppearanceModelA = ShapeAppearanceModel.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)).a();
        typedArrayObtainStyledAttributes.recycle();
        return new CalendarItemStyle(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, shapeAppearanceModelA, rect);
    }

    public final void b(TextView textView) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        ShapeAppearanceModel shapeAppearanceModel = this.f14315f;
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel);
        materialShapeDrawable.r(this.f14312c);
        materialShapeDrawable.z(this.f14314e);
        materialShapeDrawable.y(this.f14313d);
        ColorStateList colorStateList = this.f14311b;
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.f14310a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
