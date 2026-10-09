package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SearchBar extends Toolbar {
    public final TextView A0;
    public final FrameLayout B0;
    public final int C0;
    public boolean D0;
    public final ColorStateList E0;
    public final boolean F0;
    public final boolean G0;
    public final SearchBarAnimationHelper H0;
    public final Drawable I0;
    public final boolean J0;
    public final boolean K0;
    public View L0;
    public final Integer M0;
    public Drawable N0;
    public int O0;
    public boolean P0;
    public final MaterialShapeDrawable Q0;
    public boolean R0;
    public int S0;
    public ActionMenuView T0;
    public ImageButton U0;
    public final AppBarLayout.LiftOnScrollProgressListener V0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final TextView f15113z0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class OnLoadAnimationCallback {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SavedState extends k5.b {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchBar.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i11) {
                return new SavedState[i11];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f15115c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f15115c = parcel.readString();
        }

        @Override // k5.b, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.f15115c);
        }
    }

    public SearchBar(Context context) {
        this(context, null);
    }

    private AppBarLayout getAppBarLayoutParentIfExists() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    private void setNavigationIconDecorative(boolean z11) {
        ImageButton imageButtonB = ToolbarUtils.b(this);
        if (imageButtonB == null) {
            return;
        }
        imageButtonB.setClickable(!z11);
        imageButtonB.setFocusable(!z11);
        Drawable background = imageButtonB.getBackground();
        if (background != null) {
            this.N0 = background;
        }
        imageButtonB.setBackgroundDrawable(z11 ? null : this.N0);
        y();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (this.F0 && this.L0 == null && !(view instanceof ActionMenuView)) {
            this.L0 = view;
            view.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
        }
        super.addView(view, i11, layoutParams);
    }

    public View getCenterView() {
        return this.L0;
    }

    public float getCompatElevation() {
        MaterialShapeDrawable materialShapeDrawable = this.Q0;
        return materialShapeDrawable != null ? materialShapeDrawable.f15200b.f15226n : getElevation();
    }

    public float getCornerSize() {
        return this.Q0.l();
    }

    public int getDefaultMarginVerticalResource() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_search_black_24;
    }

    public CharSequence getHint() {
        return this.f15113z0.getHint();
    }

    public int getMaxWidth() {
        return this.S0;
    }

    public int getMenuResId() {
        return this.O0;
    }

    public TextView getPlaceholderTextView() {
        return this.A0;
    }

    public int getStrokeColor() {
        return this.Q0.f15200b.f15218e.getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.Q0.f15200b.f15224k;
    }

    public CharSequence getText() {
        return this.f15113z0.getText();
    }

    public boolean getTextCentered() {
        return this.R0;
    }

    public TextView getTextView() {
        return this.f15113z0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i11) {
        super.m(i11);
        this.O0 = i11;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.c(this, this.Q0);
        if (this.G0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i11 = marginLayoutParams.leftMargin;
            if (i11 == 0) {
                i11 = dimensionPixelSize;
            }
            marginLayoutParams.leftMargin = i11;
            int i12 = marginLayoutParams.topMargin;
            if (i12 == 0) {
                i12 = dimensionPixelSize2;
            }
            marginLayoutParams.topMargin = i12;
            int i13 = marginLayoutParams.rightMargin;
            if (i13 != 0) {
                dimensionPixelSize = i13;
            }
            marginLayoutParams.rightMargin = dimensionPixelSize;
            int i14 = marginLayoutParams.bottomMargin;
            if (i14 != 0) {
                dimensionPixelSize2 = i14;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize2;
        }
        z();
        if (this.D0) {
            x();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.U.remove(this.V0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        View view = this.L0;
        if (view != null && view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i15 = measuredWidth + measuredWidth2;
            int measuredHeight = view.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i16 = measuredHeight + measuredHeight2;
            if (getLayoutDirection() == 1) {
                view.layout(getMeasuredWidth() - i15, measuredHeight2, getMeasuredWidth() - measuredWidth2, i16);
            } else {
                view.layout(measuredWidth2, measuredHeight2, i15, i16);
            }
        }
        y();
        TextView textView = this.f15113z0;
        if (textView == null || !this.R0) {
            return;
        }
        int measuredWidth3 = getMeasuredWidth() / 2;
        FrameLayout frameLayout = this.B0;
        int measuredWidth4 = measuredWidth3 - (frameLayout.getMeasuredWidth() / 2);
        int measuredWidth5 = frameLayout.getMeasuredWidth() + measuredWidth4;
        int measuredHeight3 = (getMeasuredHeight() / 2) - (frameLayout.getMeasuredHeight() / 2);
        int measuredHeight4 = frameLayout.getMeasuredHeight() + measuredHeight3;
        boolean z12 = getLayoutDirection() == 1;
        if (this.T0 == null) {
            this.T0 = ToolbarUtils.a(this);
        }
        View view2 = this.T0;
        if (this.U0 == null) {
            this.U0 = ToolbarUtils.b(this);
        }
        ImageButton imageButton = this.U0;
        int measuredWidth6 = (frameLayout.getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2);
        int measuredWidth7 = textView.getMeasuredWidth() + measuredWidth6;
        int i17 = measuredWidth6 + measuredWidth4;
        int i18 = measuredWidth7 + measuredWidth4;
        View view3 = z12 ? view2 : imageButton;
        if (z12) {
            view2 = imageButton;
        }
        int iMax = view3 != null ? Math.max(view3.getRight() - i17, 0) : 0;
        int i19 = i17 + iMax;
        int i21 = i18 + iMax;
        int iMax2 = view2 != null ? Math.max(i21 - view2.getLeft(), 0) : 0;
        int i22 = i19 - iMax2;
        int i23 = i21 - iMax2;
        int iMax3 = ((iMax - iMax2) + Math.max(Math.max(getPaddingLeft() - i22, getContentInsetLeft() - i22), 0)) - Math.max(Math.max(i23 - (getMeasuredWidth() - getPaddingRight()), i23 - (getMeasuredWidth() - getContentInsetRight())), 0);
        frameLayout.layout(measuredWidth4 + iMax3, measuredHeight3, measuredWidth5 + iMax3, measuredHeight4);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13 = this.S0;
        if (i13 >= 0 && i13 < View.MeasureSpec.getSize(i11)) {
            i11 = View.MeasureSpec.makeMeasureSpec(this.S0, View.MeasureSpec.getMode(i11));
        }
        super.onMeasure(i11, i12);
        View view = this.L0;
        if (view != null) {
            view.measure(i11, i12);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f37910a);
        setText(savedState.f15115c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.f15115c = text == null ? null : text.toString();
        return savedState;
    }

    public void setCenterView(View view) {
        View view2 = this.L0;
        if (view2 != null) {
            removeView(view2);
            this.L0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z11) {
        this.P0 = z11;
        z();
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeDrawable materialShapeDrawable = this.Q0;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.q(f5);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.f15113z0.setHint(charSequence);
    }

    public void setLiftOnScroll(boolean z11) {
        this.D0 = z11;
        if (z11) {
            x();
            return;
        }
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.U.remove(this.V0);
        }
    }

    public void setMaxWidth(int i11) {
        if (this.S0 != i11) {
            this.S0 = i11;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        int iC;
        if (this.J0 && drawable != null) {
            Integer num = this.M0;
            if (num != null) {
                iC = num.intValue();
            } else {
                iC = MaterialColors.c(this, drawable == this.I0 ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface);
            }
            drawable = drawable.mutate();
            drawable.setTint(iC);
        }
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.K0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z11) {
        this.H0.getClass();
    }

    public void setPlaceholderText(String str) {
        this.A0.setText(str);
    }

    public void setStrokeColor(int i11) {
        if (getStrokeColor() != i11) {
            this.Q0.y(ColorStateList.valueOf(i11));
        }
    }

    public void setStrokeWidth(float f5) {
        if (getStrokeWidth() != f5) {
            this.Q0.z(f5);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f15113z0.setText(charSequence);
        this.A0.setText(charSequence);
    }

    public void setTextCentered(boolean z11) {
        this.R0 = z11;
        TextView textView = this.f15113z0;
        if (textView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (z11) {
            layoutParams.gravity = 1;
            textView.setGravity(1);
        } else {
            layoutParams.gravity = 0;
            textView.setGravity(0);
        }
        textView.setLayoutParams(layoutParams);
        this.A0.setLayoutParams(layoutParams);
    }

    public final void x() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists == null || this.E0 == null) {
            return;
        }
        appBarLayoutParentIfExists.U.add(this.V0);
    }

    public final void y() {
        int width;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        int right = 0;
        boolean z11 = getLayoutDirection() == 1;
        ImageButton imageButtonB = ToolbarUtils.b(this);
        if (imageButtonB == null || !imageButtonB.isClickable()) {
            width = 0;
        } else {
            width = z11 ? getWidth() - imageButtonB.getLeft() : imageButtonB.getRight();
        }
        ActionMenuView actionMenuViewA = ToolbarUtils.a(this);
        if (actionMenuViewA != null) {
            right = z11 ? actionMenuViewA.getRight() : getWidth() - actionMenuViewA.getLeft();
        }
        float f5 = -(z11 ? right : width);
        if (!z11) {
            width = right;
        }
        setHandwritingBoundsOffsets(f5, CropImageView.DEFAULT_ASPECT_RATIO, -width, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public final void z() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.P0) {
                if (layoutParams.f13815a == 0) {
                    layoutParams.f13815a = 53;
                }
            } else if (layoutParams.f13815a == 53) {
                layoutParams.f13815a = 0;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f15116t;

        public ScrollingViewBehavior() {
            this.f15116t = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, l4.b
        public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.j(coordinatorLayout, view, view2);
            if (!this.f15116t && (view2 instanceof AppBarLayout)) {
                this.f15116t = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(CropImageView.DEFAULT_ASPECT_RATIO);
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f15116t = false;
        }
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    public void setHint(int i11) {
        this.f15113z0.setHint(i11);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_Material3_SearchBar), attributeSet, i11);
        this.O0 = -1;
        this.V0 = new AppBarLayout.LiftOnScrollProgressListener() { // from class: com.google.android.material.search.SearchBar.1
            @Override // com.google.android.material.appbar.AppBarLayout.LiftOnScrollProgressListener
            public final void a(float f5) {
                SearchBar searchBar = SearchBar.this;
                ColorStateList colorStateList = searchBar.E0;
                if (colorStateList != null) {
                    searchBar.Q0.r(ColorStateList.valueOf(MaterialColors.f(searchBar.C0, f5, colorStateList.getDefaultColor())));
                }
            }
        };
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                    throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
                }
            } else {
                throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
        }
        Drawable drawableK = jh.h.k(context2, getDefaultNavigationIconResource());
        this.I0 = drawableK;
        this.H0 = new SearchBarAnimationHelper();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.Z, i11, R.style.Widget_Material3_SearchBar, new int[0]);
        ShapeAppearanceModel shapeAppearanceModelA = ShapeAppearanceModel.d(context2, attributeSet, i11, R.style.Widget_Material3_SearchBar).a();
        int color = typedArrayD.getColor(4, 0);
        this.C0 = color;
        this.E0 = MaterialResources.a(context2, typedArrayD, 11);
        float dimension = typedArrayD.getDimension(7, CropImageView.DEFAULT_ASPECT_RATIO);
        this.G0 = typedArrayD.getBoolean(5, true);
        this.P0 = typedArrayD.getBoolean(6, true);
        boolean z11 = typedArrayD.getBoolean(9, false);
        this.K0 = typedArrayD.getBoolean(8, false);
        this.J0 = typedArrayD.getBoolean(16, true);
        if (typedArrayD.hasValue(12)) {
            this.M0 = Integer.valueOf(typedArrayD.getColor(12, -1));
        }
        int resourceId = typedArrayD.getResourceId(0, -1);
        String string = typedArrayD.getString(2);
        String string2 = typedArrayD.getString(3);
        float dimension2 = typedArrayD.getDimension(14, -1.0f);
        int color2 = typedArrayD.getColor(13, 0);
        this.R0 = typedArrayD.getBoolean(15, false);
        this.D0 = typedArrayD.getBoolean(10, false);
        this.S0 = typedArrayD.getDimensionPixelSize(1, -1);
        typedArrayD.recycle();
        if (!z11) {
            setNavigationIcon(getNavigationIcon() != null ? getNavigationIcon() : drawableK);
            setNavigationIconDecorative(true);
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.F0 = true;
        TextView textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        this.f15113z0 = textView;
        TextView textView2 = (TextView) findViewById(R.id.open_search_bar_placeholder_text_view);
        this.A0 = textView2;
        this.B0 = (FrameLayout) findViewById(R.id.open_search_bar_text_view_container);
        setElevation(dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
        }
        setText(string);
        setHint(string2);
        setTextCentered(this.R0);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelA);
        this.Q0 = materialShapeDrawable;
        materialShapeDrawable.n(getContext());
        this.Q0.q(dimension);
        if (dimension2 >= CropImageView.DEFAULT_ASPECT_RATIO) {
            MaterialShapeDrawable materialShapeDrawable2 = this.Q0;
            materialShapeDrawable2.z(dimension2);
            materialShapeDrawable2.y(ColorStateList.valueOf(color2));
        }
        int iC = MaterialColors.c(this, R.attr.colorControlHighlight);
        this.Q0.r(ColorStateList.valueOf(color));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iC);
        MaterialShapeDrawable materialShapeDrawable3 = this.Q0;
        setBackground(new RippleDrawable(colorStateListValueOf, materialShapeDrawable3, materialShapeDrawable3));
    }

    public void setText(int i11) {
        this.f15113z0.setText(i11);
        this.A0.setText(i11);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
