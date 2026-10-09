package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] E0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public boolean A0;
    public boolean B0;
    public ImageView.ScaleType C0;
    public Boolean D0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Integer f13858z0;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.C0;
    }

    public Integer getNavigationIconTint() {
        return this.f13858z0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.d(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z11, i11, i12, i13, i14);
        ImageView imageView2 = null;
        if (this.A0 || this.B0) {
            Comparator comparator = ToolbarUtils.f14741a;
            ArrayList arrayListC = ToolbarUtils.c(this, getTitle());
            TextView textView = arrayListC.isEmpty() ? null : (TextView) Collections.min(arrayListC, ToolbarUtils.f14741a);
            ArrayList arrayListC2 = ToolbarUtils.c(this, getSubtitle());
            TextView textView2 = arrayListC2.isEmpty() ? null : (TextView) Collections.max(arrayListC2, ToolbarUtils.f14741a);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i15 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i15 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i15 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.A0 && textView != null) {
                    x(textView, pair);
                }
                if (this.B0 && textView2 != null) {
                    x(textView2, pair);
                }
            }
        }
        Comparator comparator2 = ToolbarUtils.f14741a;
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                View childAt2 = getChildAt(i17);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.D0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.C0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeUtils.b(this, f5);
    }

    public void setLogoAdjustViewBounds(boolean z11) {
        Boolean bool = this.D0;
        if (bool == null || bool.booleanValue() != z11) {
            this.D0 = Boolean.valueOf(z11);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.C0 != scaleType) {
            this.C0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f13858z0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f13858z0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i11) {
        this.f13858z0 = Integer.valueOf(i11);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z11) {
        if (this.B0 != z11) {
            this.B0 = z11;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z11) {
        if (this.A0 != z11) {
            this.A0 = z11;
            requestLayout();
        }
    }

    public final void x(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i11 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i12 = measuredWidth2 + i11;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i11, 0), Math.max(i12 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i11 += iMax;
            i12 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i12 - i11, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i11, textView.getTop(), i12, textView.getBottom());
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i11) {
        ColorStateList colorStateListD;
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i11);
        Context context2 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.Q, i11, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayD.hasValue(2)) {
            setNavigationIconTint(typedArrayD.getColor(2, -1));
        }
        this.A0 = typedArrayD.getBoolean(4, false);
        this.B0 = typedArrayD.getBoolean(3, false);
        int i12 = typedArrayD.getInt(1, -1);
        if (i12 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = E0;
            if (i12 < scaleTypeArr.length) {
                this.C0 = scaleTypeArr[i12];
            }
        }
        if (typedArrayD.hasValue(0)) {
            this.D0 = Boolean.valueOf(typedArrayD.getBoolean(0, false));
        }
        typedArrayD.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateListD = ColorStateList.valueOf(0);
        } else {
            colorStateListD = DrawableUtils.d(background);
        }
        if (colorStateListD != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.r(colorStateListD);
            materialShapeDrawable.n(context2);
            materialShapeDrawable.q(getElevation());
            setBackground(materialShapeDrawable);
        }
    }
}
