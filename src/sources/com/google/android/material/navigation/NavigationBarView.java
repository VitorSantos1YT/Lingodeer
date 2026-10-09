package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.navigationrail.NavigationRailView;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k5.b;
import p.j;
import q.l;
import q.x;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavigationBarMenu f14917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavigationBarMenuView f14918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavigationBarPresenter f14919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f14920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnItemSelectedListener f14921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OnItemReselectedListener f14922f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ItemGravity {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ItemIconGravity {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface LabelVisibility {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnItemReselectedListener {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnItemSelectedListener {
        boolean a();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SavedState extends b {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarView.SavedState.1
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
        public Bundle f14924c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14924c = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        @Override // k5.b, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeBundle(this.f14924c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v22 */
    public NavigationBarView(Context context, AttributeSet attributeSet, int i11, int i12) {
        ?? r12;
        super(MaterialThemeOverlay.a(context, attributeSet, i11, i12), attributeSet, i11);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f14919c = navigationBarPresenter;
        Context context2 = getContext();
        m4 m4VarE = ThemeEnforcement.e(context2, attributeSet, R.styleable.S, i11, i12, 17, 15);
        boolean z11 = this instanceof NavigationRailView;
        NavigationBarMenu navigationBarMenu = new NavigationBarMenu(context2, getClass(), getMaxItemCount(), z11);
        this.f14917a = navigationBarMenu;
        NavigationBarMenuView navigationBarMenuViewA = a(context2);
        this.f14918b = navigationBarMenuViewA;
        navigationBarMenuViewA.setMinimumHeight(getSuggestedMinimumHeight());
        navigationBarMenuViewA.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        navigationBarPresenter.f14907a = navigationBarMenuViewA;
        navigationBarPresenter.f14909c = 1;
        navigationBarMenuViewA.setPresenter(navigationBarPresenter);
        navigationBarMenu.b(navigationBarPresenter, navigationBarMenu.f47280a);
        navigationBarPresenter.j(getContext(), navigationBarMenu);
        TypedArray typedArray = (TypedArray) m4VarE.f48061c;
        if (typedArray.hasValue(11)) {
            navigationBarMenuViewA.setIconTintList(m4VarE.f(11));
        } else {
            navigationBarMenuViewA.setIconTintList(navigationBarMenuViewA.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(10, getResources().getDimensionPixelSize(com.lingodeer.R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(17)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(17, 0));
        }
        if (typedArray.hasValue(15)) {
            setItemTextAppearanceActive(typedArray.getResourceId(15, 0));
        }
        if (typedArray.hasValue(4)) {
            setHorizontalItemTextAppearanceInactive(typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(3)) {
            setHorizontalItemTextAppearanceActive(typedArray.getResourceId(3, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(16, true));
        if (typedArray.hasValue(18)) {
            setItemTextColor(m4VarE.f(18));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListD = DrawableUtils.d(background);
        if (background == null || colorStateListD != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.d(context2, attributeSet, i11, i12).a());
            if (colorStateListD != null) {
                materialShapeDrawable.r(colorStateListD);
            }
            materialShapeDrawable.n(context2);
            setBackground(materialShapeDrawable);
        }
        if (typedArray.hasValue(13)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(13, 0));
        }
        if (typedArray.hasValue(12)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(12, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(5)) {
            setIconLabelHorizontalSpacing(typedArray.getDimensionPixelSize(5, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(MaterialResources.b(context2, m4VarE, 1));
        setLabelVisibilityMode(typedArray.getInteger(21, -1));
        setItemIconGravity(typedArray.getInteger(9, 0));
        setItemGravity(typedArray.getInteger(8, 49));
        int resourceId = typedArray.getResourceId(7, 0);
        if (resourceId != 0) {
            navigationBarMenuViewA.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(MaterialResources.b(context2, m4VarE, 14));
        }
        setMeasureBottomPaddingFromLabelBaseline(typedArray.getBoolean(22, true));
        setLabelFontScalingEnabled(typedArray.getBoolean(19, false));
        setLabelMaxLines(typedArray.getInteger(20, 1));
        int resourceId2 = typedArray.getResourceId(6, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, R.styleable.R);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize);
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            String string = typedArrayObtainStyledAttributes.getString(9);
            int dimensionPixelSize2 = -2;
            if (string != null) {
                if (String.valueOf(-1).equals(string)) {
                    dimensionPixelSize2 = -1;
                } else if (!String.valueOf(-2).equals(string)) {
                    dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -2);
                }
            }
            setItemActiveIndicatorExpandedWidth(dimensionPixelSize2);
            setItemActiveIndicatorExpandedHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize));
            setItemActiveIndicatorExpandedMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(8, dimensionPixelOffset));
            int dimensionPixelSize3 = getResources().getDimensionPixelSize(com.lingodeer.R.dimen.m3_navigation_item_leading_trailing_space);
            int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, dimensionPixelSize3);
            int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, dimensionPixelSize3);
            int i13 = getLayoutDirection() == 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
            dimensionPixelOffset2 = getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset5 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
            Rect rect = navigationBarMenuViewA.A0;
            rect.left = i13;
            rect.top = dimensionPixelOffset4;
            rect.right = dimensionPixelOffset2;
            rect.bottom = dimensionPixelOffset5;
            NavigationBarMenuItemView[] navigationBarMenuItemViewArr = navigationBarMenuViewA.f14898t;
            if (navigationBarMenuItemViewArr != null) {
                for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                    if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                        ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorExpandedPadding(rect);
                    }
                }
            }
            setItemActiveIndicatorColor(MaterialResources.a(context2, typedArrayObtainStyledAttributes, 2));
            r12 = 0;
            setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel.a(context2, typedArrayObtainStyledAttributes.getResourceId(11, 0), 0).a());
            typedArrayObtainStyledAttributes.recycle();
        } else {
            r12 = 0;
        }
        if (typedArray.hasValue(23)) {
            int resourceId3 = typedArray.getResourceId(23, r12);
            NavigationBarPresenter navigationBarPresenter2 = this.f14919c;
            navigationBarPresenter2.f14908b = true;
            getMenuInflater().inflate(resourceId3, this.f14917a);
            navigationBarPresenter2.f14908b = r12;
            navigationBarPresenter2.c(true);
        }
        m4VarE.l();
        if (!z11) {
            addView(this.f14918b);
        }
        this.f14917a.f47284e = new q.j() { // from class: com.google.android.material.navigation.NavigationBarView.1
            @Override // q.j
            public final boolean c(l lVar, MenuItem menuItem) {
                NavigationBarView navigationBarView = NavigationBarView.this;
                if (navigationBarView.f14922f == null || menuItem.getItemId() != navigationBarView.getSelectedItemId()) {
                    OnItemSelectedListener onItemSelectedListener = navigationBarView.f14921e;
                    return (onItemSelectedListener == null || onItemSelectedListener.a()) ? false : true;
                }
                navigationBarView.f14922f.a();
                return true;
            }

            @Override // q.j
            public final void i(l lVar) {
            }
        };
    }

    private MenuInflater getMenuInflater() {
        if (this.f14920d == null) {
            this.f14920d = new j(getContext());
        }
        return this.f14920d;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z11) {
        this.f14918b.setMeasurePaddingFromLabelBaseline(z11);
    }

    public abstract NavigationBarMenuView a(Context context);

    public int getActiveIndicatorLabelPadding() {
        return this.f14918b.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f14918b.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f14918b.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f14918b.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f14918b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f14918b.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f14918b.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f14918b.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f14918b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f14918b.getItemActiveIndicatorMarginHorizontal();
    }

    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.f14918b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f14918b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f14918b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f14918b.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.f14918b.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.f14918b.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.f14918b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f14918b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f14918b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f14918b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f14918b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f14918b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f14918b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f14918b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f14918b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f14917a;
    }

    public x getMenuView() {
        return this.f14918b;
    }

    public ViewGroup getMenuViewGroup() {
        return this.f14918b;
    }

    public NavigationBarPresenter getPresenter() {
        return this.f14919c;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f14918b.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.f14918b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.d(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f37910a);
        this.f14917a.t(savedState.f14924c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f14924c = bundle;
        this.f14917a.v(bundle);
        return savedState;
    }

    public void setActiveIndicatorLabelPadding(int i11) {
        this.f14918b.setActiveIndicatorLabelPadding(i11);
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeUtils.b(this, f5);
    }

    public void setHorizontalItemTextAppearanceActive(int i11) {
        this.f14918b.setHorizontalItemTextAppearanceActive(i11);
    }

    public void setHorizontalItemTextAppearanceInactive(int i11) {
        this.f14918b.setHorizontalItemTextAppearanceInactive(i11);
    }

    public void setIconLabelHorizontalSpacing(int i11) {
        this.f14918b.setIconLabelHorizontalSpacing(i11);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f14918b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z11) {
        this.f14918b.setItemActiveIndicatorEnabled(z11);
    }

    public void setItemActiveIndicatorExpandedHeight(int i11) {
        this.f14918b.setItemActiveIndicatorExpandedHeight(i11);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i11) {
        this.f14918b.setItemActiveIndicatorExpandedMarginHorizontal(i11);
    }

    public void setItemActiveIndicatorExpandedWidth(int i11) {
        this.f14918b.setItemActiveIndicatorExpandedWidth(i11);
    }

    public void setItemActiveIndicatorHeight(int i11) {
        this.f14918b.setItemActiveIndicatorHeight(i11);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i11) {
        this.f14918b.setItemActiveIndicatorMarginHorizontal(i11);
    }

    public void setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel shapeAppearanceModel) {
        this.f14918b.setItemActiveIndicatorShapeAppearance(shapeAppearanceModel);
    }

    public void setItemActiveIndicatorWidth(int i11) {
        this.f14918b.setItemActiveIndicatorWidth(i11);
    }

    public void setItemBackground(Drawable drawable) {
        this.f14918b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i11) {
        this.f14918b.setItemBackgroundRes(i11);
    }

    public void setItemGravity(int i11) {
        NavigationBarMenuView navigationBarMenuView = this.f14918b;
        if (navigationBarMenuView.getItemGravity() != i11) {
            navigationBarMenuView.setItemGravity(i11);
            this.f14919c.c(false);
        }
    }

    public void setItemIconGravity(int i11) {
        NavigationBarMenuView navigationBarMenuView = this.f14918b;
        if (navigationBarMenuView.getItemIconGravity() != i11) {
            navigationBarMenuView.setItemIconGravity(i11);
            this.f14919c.c(false);
        }
    }

    public void setItemIconSize(int i11) {
        this.f14918b.setItemIconSize(i11);
    }

    public void setItemIconSizeRes(int i11) {
        setItemIconSize(getResources().getDimensionPixelSize(i11));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f14918b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i11) {
        this.f14918b.setItemPaddingBottom(i11);
    }

    public void setItemPaddingTop(int i11) {
        this.f14918b.setItemPaddingTop(i11);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f14918b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i11) {
        this.f14918b.setItemTextAppearanceActive(i11);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z11) {
        this.f14918b.setItemTextAppearanceActiveBoldEnabled(z11);
    }

    public void setItemTextAppearanceInactive(int i11) {
        this.f14918b.setItemTextAppearanceInactive(i11);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f14918b.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z11) {
        this.f14918b.setLabelFontScalingEnabled(z11);
    }

    public void setLabelMaxLines(int i11) {
        this.f14918b.setLabelMaxLines(i11);
    }

    public void setLabelVisibilityMode(int i11) {
        NavigationBarMenuView navigationBarMenuView = this.f14918b;
        if (navigationBarMenuView.getLabelVisibilityMode() != i11) {
            navigationBarMenuView.setLabelVisibilityMode(i11);
            this.f14919c.c(false);
        }
    }

    public void setOnItemReselectedListener(OnItemReselectedListener onItemReselectedListener) {
        this.f14922f = onItemReselectedListener;
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.f14921e = onItemSelectedListener;
    }

    public void setSelectedItemId(int i11) {
        NavigationBarMenu navigationBarMenu = this.f14917a;
        MenuItem menuItemFindItem = navigationBarMenu.findItem(i11);
        if (menuItemFindItem != null) {
            boolean zQ = navigationBarMenu.q(menuItemFindItem, this.f14919c, 0);
            if (menuItemFindItem.isCheckable()) {
                if (!zQ || menuItemFindItem.isChecked()) {
                    this.f14918b.setCheckedItem(menuItemFindItem);
                }
            }
        }
    }
}
