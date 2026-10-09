package com.google.android.material.dockedtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;
import l4.e;
import qp.m4;
import r4.d;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DockedToolbarLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f14449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f14450b;

    public DockedToolbarLayout(Context context) {
        this(context, null);
    }

    public static boolean a(DockedToolbarLayout dockedToolbarLayout, ViewGroup.LayoutParams layoutParams, int i11) {
        if (layoutParams instanceof e) {
            return (((e) layoutParams).f39718c & i11) == i11;
        }
        return (layoutParams instanceof FrameLayout.LayoutParams) && (((FrameLayout.LayoutParams) layoutParams).gravity & i11) == i11;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (View.MeasureSpec.getMode(i12) != 1073741824) {
            int childCount = getChildCount();
            int iMax = Math.max(getMeasuredHeight(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight());
            for (int i13 = 0; i13 < childCount; i13++) {
                measureChild(getChildAt(i13), i11, View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
            }
            setMeasuredDimension(getMeasuredWidth(), iMax);
        }
    }

    public DockedToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.dockedToolbarStyle);
    }

    public DockedToolbarLayout(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_Material3_DockedToolbar), attributeSet, i11);
        Context context2 = getContext();
        m4 m4VarE = ThemeEnforcement.e(context2, attributeSet, com.google.android.material.R.styleable.f13757p, i11, R.style.Widget_Material3_DockedToolbar, new int[0]);
        TypedArray typedArray = (TypedArray) m4VarE.f48061c;
        if (typedArray.hasValue(0)) {
            int color = typedArray.getColor(0, 0);
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.d(context2, attributeSet, i11, R.style.Widget_Material3_DockedToolbar).a());
            materialShapeDrawable.r(ColorStateList.valueOf(color));
            setBackground(materialShapeDrawable);
        }
        if (typedArray.hasValue(2)) {
            this.f14449a = Boolean.valueOf(typedArray.getBoolean(2, true));
        }
        if (typedArray.hasValue(1)) {
            this.f14450b = Boolean.valueOf(typedArray.getBoolean(1, true));
        }
        ViewUtils.b(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.dockedtoolbar.DockedToolbarLayout.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public final v1 a(View view, v1 v1Var, ViewUtils.RelativePadding relativePadding) {
                DockedToolbarLayout dockedToolbarLayout = DockedToolbarLayout.this;
                Boolean bool = dockedToolbarLayout.f14450b;
                Boolean bool2 = dockedToolbarLayout.f14449a;
                if (bool2 != null && bool != null && !bool2.booleanValue() && !bool.booleanValue()) {
                    return v1Var;
                }
                d dVarG = v1Var.f58905a.g(655);
                int i12 = dVarG.f48796d;
                int i13 = dVarG.f48794b;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int i14 = (DockedToolbarLayout.a(dockedToolbarLayout, layoutParams, 48) && bool2 == null && dockedToolbarLayout.getFitsSystemWindows()) ? i13 : 0;
                int i15 = (DockedToolbarLayout.a(dockedToolbarLayout, layoutParams, 80) && bool == null && dockedToolbarLayout.getFitsSystemWindows()) ? i12 : 0;
                if (bool != null) {
                    if (!bool.booleanValue()) {
                        i12 = 0;
                    }
                    i15 = i12;
                }
                if (bool2 != null) {
                    if (!bool2.booleanValue()) {
                        i13 = 0;
                    }
                    i14 = i13;
                }
                int i16 = relativePadding.f14750b + i14;
                relativePadding.f14750b = i16;
                int i17 = relativePadding.f14752d + i15;
                relativePadding.f14752d = i17;
                view.setPaddingRelative(relativePadding.f14749a, i16, relativePadding.f14751c, i17);
                return v1Var;
            }
        });
        setImportantForAccessibility(1);
        m4VarE.l();
    }
}
