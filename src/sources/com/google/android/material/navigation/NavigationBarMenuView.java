package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.TextScale;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.yalantis.ucrop.view.CropImageView;
import java.util.HashSet;
import o4.c;
import q.l;
import q.n;
import q.x;
import qa.a;
import y4.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements x {
    public static final int[] B0 = {R.attr.state_checked};
    public static final int[] C0 = {-16842910};
    public final Rect A0;
    public int H;
    public int K;
    public ColorStateList L;
    public int M;
    public ColorStateList N;
    public final ColorStateList O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public Drawable U;
    public ColorStateList V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f14873a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final SparseArray f14874a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View.OnClickListener f14875b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f14876b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f14877c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f14878c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f14879d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f14880d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14881e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f14882e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14883f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f14884f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f14885g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f14886h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f14887i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f14888j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f14889k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f14890l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f14891m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ShapeAppearanceModel f14892n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f14893o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ColorStateList f14894p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public NavigationBarPresenter f14895q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public NavigationBarMenuBuilder f14896r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f14897s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public NavigationBarMenuItemView[] f14898t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f14899t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f14900u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f14901v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f14902w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public MenuItem f14903x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f14904y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f14905z0;

    public NavigationBarMenuView(Context context) {
        super(context);
        this.f14879d = new SparseArray();
        this.H = -1;
        this.K = -1;
        this.f14874a0 = new SparseArray();
        this.f14876b0 = -1;
        this.f14878c0 = -1;
        this.f14880d0 = -1;
        this.f14882e0 = -1;
        this.f14891m0 = 49;
        this.f14893o0 = false;
        this.f14900u0 = 1;
        this.f14901v0 = 0;
        this.f14903x0 = null;
        this.f14904y0 = 7;
        this.f14905z0 = false;
        this.A0 = new Rect();
        this.O = c();
        if (isInEditMode()) {
            this.f14873a = null;
        } else {
            a aVar = new a();
            this.f14873a = aVar;
            aVar.W(0);
            aVar.q();
            aVar.K(MotionUtils.c(getContext(), com.lingodeer.R.attr.motionDurationMedium4, getResources().getInteger(com.lingodeer.R.integer.material_motion_duration_long_1)));
            aVar.M(MotionUtils.d(getContext(), com.lingodeer.R.attr.motionEasingStandard, AnimationUtils.f13769b));
            aVar.S(new TextScale());
        }
        this.f14875b = new View.OnClickListener() { // from class: com.google.android.material.navigation.NavigationBarMenuView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n itemData = ((NavigationBarItemView) view).getItemData();
                NavigationBarMenuView navigationBarMenuView = NavigationBarMenuView.this;
                NavigationBarMenuBuilder navigationBarMenuBuilder = navigationBarMenuView.f14896r0;
                boolean zQ = navigationBarMenuBuilder.f14868a.q(itemData, navigationBarMenuView.f14895q0, 0);
                if (itemData == null || !itemData.isCheckable()) {
                    return;
                }
                if (!zQ || itemData.isChecked()) {
                    navigationBarMenuView.setCheckedItem(itemData);
                }
            }
        };
        setImportantForAccessibility(1);
    }

    public static boolean g(int i11, int i12) {
        if (i11 == -1) {
            return i12 > 3;
        }
        return i11 == 0;
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.f14904y0, this.f14896r0.f14872e);
    }

    private NavigationBarItemView getNewItem() {
        d dVar = this.f14877c;
        NavigationBarItemView navigationBarItemView = dVar != null ? (NavigationBarItemView) dVar.acquire() : null;
        return navigationBarItemView == null ? f(getContext()) : navigationBarItemView;
    }

    private void setBadgeIfNeeded(NavigationBarItemView navigationBarItemView) {
        BadgeDrawable badgeDrawable;
        int id2 = navigationBarItemView.getId();
        if (id2 == -1 || (badgeDrawable = (BadgeDrawable) this.f14874a0.get(id2)) == null) {
            return;
        }
        navigationBarItemView.setBadge(badgeDrawable);
    }

    @Override // q.x
    public final void a(l lVar) {
        this.f14896r0 = new NavigationBarMenuBuilder(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        NavigationBarItemView navigationBarItemViewE;
        View viewE;
        NavigationBarDividerView navigationBarDividerView;
        removeAllViews();
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null && this.f14877c != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) navigationBarMenuItemView;
                    this.f14877c.c(navigationBarItemView);
                    ImageView imageView = navigationBarItemView.V;
                    if (navigationBarItemView.C0 != null) {
                        if (imageView != null) {
                            navigationBarItemView.setClipChildren(true);
                            navigationBarItemView.setClipToPadding(true);
                            BadgeDrawable badgeDrawable = navigationBarItemView.C0;
                            if (badgeDrawable != null) {
                                if (badgeDrawable.e() != null) {
                                    badgeDrawable.e().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(badgeDrawable);
                                }
                            }
                        }
                        navigationBarItemView.C0 = null;
                    }
                    navigationBarItemView.f14847n0 = null;
                    navigationBarItemView.f14854t0 = CropImageView.DEFAULT_ASPECT_RATIO;
                    navigationBarItemView.f14828a = false;
                }
            }
        }
        this.f14895q0.f14908b = true;
        this.f14896r0.b();
        this.f14895q0.f14908b = false;
        int i11 = this.f14896r0.f14870c;
        if (i11 == 0) {
            this.H = 0;
            this.K = 0;
            this.f14898t = null;
            this.f14877c = null;
            return;
        }
        if (this.f14877c == null || this.f14901v0 != i11) {
            this.f14901v0 = i11;
            this.f14877c = new d(i11);
        }
        HashSet hashSet = new HashSet();
        for (int i12 = 0; i12 < this.f14896r0.f14869b.size(); i12++) {
            hashSet.add(Integer.valueOf(this.f14896r0.a(i12).getItemId()));
        }
        int i13 = 0;
        while (true) {
            SparseArray sparseArray = this.f14874a0;
            if (i13 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i13);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i13++;
        }
        int size = this.f14896r0.f14869b.size();
        this.f14898t = new NavigationBarMenuItemView[size];
        boolean zG = g(this.f14881e, getCurrentVisibleContentItemCount());
        int size2 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            MenuItem menuItemA = this.f14896r0.a(i15);
            boolean z11 = menuItemA instanceof DividerMenuItem;
            if (z11) {
                Context context = getContext();
                navigationBarDividerView = new NavigationBarDividerView(context);
                LayoutInflater.from(context).inflate(com.lingodeer.R.layout.m3_navigation_menu_divider, (ViewGroup) navigationBarDividerView, true);
                navigationBarDividerView.a();
                navigationBarDividerView.setOnlyShowWhenExpanded(true);
                navigationBarDividerView.setDividersEnabled(this.f14905z0);
            } else if (menuItemA.hasSubMenu()) {
                if (size2 > 0) {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                NavigationBarSubheaderView navigationBarSubheaderView = new NavigationBarSubheaderView(getContext());
                int i16 = this.S;
                if (i16 == 0) {
                    i16 = this.Q;
                }
                navigationBarSubheaderView.setTextAppearance(i16);
                navigationBarSubheaderView.setTextColor(this.N);
                navigationBarSubheaderView.setOnlyShowWhenExpanded(true);
                navigationBarSubheaderView.c((n) menuItemA);
                size2 = menuItemA.getSubMenu().size();
                viewE = navigationBarSubheaderView;
            } else if (size2 > 0) {
                navigationBarItemViewE = e(i15, (n) menuItemA, zG, true);
                size2--;
            } else {
                n nVar = (n) menuItemA;
                boolean z12 = i14 >= this.f14904y0;
                i14++;
                viewE = e(i15, nVar, zG, z12);
            }
            if (z11) {
                viewE = navigationBarItemViewE;
                viewE = navigationBarDividerView;
            } else {
                viewE = navigationBarItemViewE;
                if (menuItemA.isCheckable() && this.K == -1) {
                    viewE = navigationBarDividerView;
                    this.K = i15;
                } else {
                    viewE = navigationBarDividerView;
                }
            }
            this.f14898t[i15] = viewE;
            addView(viewE);
        }
        int iMin = Math.min(size - 1, this.K);
        this.K = iMin;
        setCheckedItem(this.f14898t[iMin].getItemData());
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListB = c.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.lingodeer.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListB.getDefaultColor();
        int[] iArr = B0;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = C0;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListB.getColorForState(iArr3, defaultColor), i11, defaultColor});
    }

    public final MaterialShapeDrawable d() {
        if (this.f14892n0 == null || this.f14894p0 == null) {
            return null;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f14892n0);
        materialShapeDrawable.r(this.f14894p0);
        return materialShapeDrawable;
    }

    public final NavigationBarItemView e(int i11, n nVar, boolean z11, boolean z12) {
        this.f14895q0.f14908b = true;
        nVar.setCheckable(true);
        this.f14895q0.f14908b = false;
        NavigationBarItemView newItem = getNewItem();
        newItem.setShifting(z11);
        newItem.setLabelMaxLines(this.f14900u0);
        newItem.setIconTintList(this.L);
        newItem.setIconSize(this.M);
        newItem.setTextColor(this.O);
        newItem.setTextAppearanceInactive(this.P);
        newItem.setTextAppearanceActive(this.Q);
        newItem.setHorizontalTextAppearanceInactive(this.R);
        newItem.setHorizontalTextAppearanceActive(this.S);
        newItem.setTextAppearanceActiveBoldEnabled(this.T);
        newItem.setTextColor(this.N);
        int i12 = this.f14876b0;
        if (i12 != -1) {
            newItem.setItemPaddingTop(i12);
        }
        int i13 = this.f14878c0;
        if (i13 != -1) {
            newItem.setItemPaddingBottom(i13);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.f14897s0);
        newItem.setLabelFontScalingEnabled(this.f14899t0);
        int i14 = this.f14880d0;
        if (i14 != -1) {
            newItem.setActiveIndicatorLabelPadding(i14);
        }
        int i15 = this.f14882e0;
        if (i15 != -1) {
            newItem.setIconLabelHorizontalSpacing(i15);
        }
        newItem.setActiveIndicatorWidth(this.f14885g0);
        newItem.setActiveIndicatorHeight(this.f14886h0);
        newItem.setActiveIndicatorExpandedWidth(this.f14887i0);
        newItem.setActiveIndicatorExpandedHeight(this.f14888j0);
        newItem.setActiveIndicatorMarginHorizontal(this.f14889k0);
        newItem.setItemGravity(this.f14891m0);
        newItem.setActiveIndicatorExpandedPadding(this.A0);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.f14890l0);
        newItem.setActiveIndicatorDrawable(d());
        newItem.setActiveIndicatorResizeable(this.f14893o0);
        newItem.setActiveIndicatorEnabled(this.f14884f0);
        Drawable drawable = this.U;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.W);
        }
        newItem.setItemRippleColor(this.V);
        newItem.setLabelVisibilityMode(this.f14881e);
        newItem.setItemIconGravity(this.f14883f);
        newItem.setOnlyShowWhenExpanded(z12);
        newItem.setExpanded(this.f14902w0);
        newItem.c(nVar);
        newItem.setItemPosition(i11);
        int i16 = nVar.f47290a;
        newItem.setOnTouchListener((View.OnTouchListener) this.f14879d.get(i16));
        newItem.setOnClickListener(this.f14875b);
        int i17 = this.H;
        if (i17 != 0 && i16 == i17) {
            this.K = i11;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    public abstract NavigationBarItemView f(Context context);

    public int getActiveIndicatorLabelPadding() {
        return this.f14880d0;
    }

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f14874a0;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.f14902w0 ? this.f14896r0.f14871d : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.S;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.R;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f14882e0;
    }

    public ColorStateList getIconTintList() {
        return this.L;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f14894p0;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f14884f0;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f14888j0;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f14890l0;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f14887i0;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f14886h0;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f14889k0;
    }

    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.f14892n0;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f14885g0;
    }

    public Drawable getItemBackground() {
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null && navigationBarMenuItemViewArr.length > 0) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    return ((NavigationBarItemView) navigationBarMenuItemView).getBackground();
                }
            }
        }
        return this.U;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.W;
    }

    public int getItemGravity() {
        return this.f14891m0;
    }

    public int getItemIconGravity() {
        return this.f14883f;
    }

    public int getItemIconSize() {
        return this.M;
    }

    public int getItemPaddingBottom() {
        return this.f14878c0;
    }

    public int getItemPaddingTop() {
        return this.f14876b0;
    }

    public ColorStateList getItemRippleColor() {
        return this.V;
    }

    public int getItemTextAppearanceActive() {
        return this.Q;
    }

    public int getItemTextAppearanceInactive() {
        return this.P;
    }

    public ColorStateList getItemTextColor() {
        return this.N;
    }

    public int getLabelMaxLines() {
        return this.f14900u0;
    }

    public int getLabelVisibilityMode() {
        return this.f14881e;
    }

    public NavigationBarMenuBuilder getMenu() {
        return this.f14896r0;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f14899t0;
    }

    public int getSelectedItemId() {
        return this.H;
    }

    public int getSelectedItemPosition() {
        return this.K;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) hd.d.v(1, getCurrentVisibleContentItemCount(), 1, false).f32187b);
    }

    public void setActiveIndicatorLabelPadding(int i11) {
        this.f14880d0 = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorLabelPadding(i11);
                }
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        if (this.f14903x0 == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.f14903x0;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.f14903x0.setChecked(false);
        }
        menuItem.setChecked(true);
        this.f14903x0 = menuItem;
    }

    public void setCollapsedMaxItemCount(int i11) {
        this.f14904y0 = i11;
    }

    public void setExpanded(boolean z11) {
        this.f14902w0 = z11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                navigationBarMenuItemView.setExpanded(z11);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i11) {
        this.S = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setHorizontalTextAppearanceActive(i11);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i11) {
        this.R = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setHorizontalTextAppearanceInactive(i11);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i11) {
        this.f14882e0 = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setIconLabelHorizontalSpacing(i11);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.L = colorStateList;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f14894p0 = colorStateList;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z11) {
        this.f14884f0 = z11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorEnabled(z11);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i11) {
        this.f14888j0 = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorExpandedHeight(i11);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i11) {
        this.f14890l0 = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorExpandedMarginHorizontal(i11);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i11) {
        this.f14887i0 = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorExpandedWidth(i11);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i11) {
        this.f14886h0 = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorHeight(i11);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i11) {
        this.f14889k0 = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorMarginHorizontal(i11);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z11) {
        this.f14893o0 = z11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorResizeable(z11);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel shapeAppearanceModel) {
        this.f14892n0 = shapeAppearanceModel;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i11) {
        this.f14885g0 = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorWidth(i11);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.U = drawable;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i11) {
        this.W = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemBackground(i11);
                }
            }
        }
    }

    public void setItemGravity(int i11) {
        this.f14891m0 = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemGravity(i11);
                }
            }
        }
    }

    public void setItemIconGravity(int i11) {
        this.f14883f = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemIconGravity(i11);
                }
            }
        }
    }

    public void setItemIconSize(int i11) {
        this.M = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setIconSize(i11);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i11) {
        this.f14878c0 = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemPaddingBottom(this.f14878c0);
                }
            }
        }
    }

    public void setItemPaddingTop(int i11) {
        this.f14876b0 = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemPaddingTop(i11);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.V = colorStateList;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i11) {
        this.Q = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setTextAppearanceActive(i11);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z11) {
        this.T = z11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setTextAppearanceActiveBoldEnabled(z11);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i11) {
        this.P = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setTextAppearanceInactive(i11);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.N = colorStateList;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z11) {
        this.f14899t0 = z11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setLabelFontScalingEnabled(z11);
                }
            }
        }
    }

    public void setLabelMaxLines(int i11) {
        this.f14900u0 = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setLabelMaxLines(i11);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i11) {
        this.f14881e = i11;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z11) {
        this.f14897s0 = z11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setMeasureBottomPaddingFromLabelBaseline(z11);
                }
            }
        }
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.f14895q0 = navigationBarPresenter;
    }

    public void setSubmenuDividersEnabled(boolean z11) {
        if (this.f14905z0 == z11) {
            return;
        }
        this.f14905z0 = z11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f14898t;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarDividerView) {
                    ((NavigationBarDividerView) navigationBarMenuItemView).setDividersEnabled(z11);
                }
            }
        }
    }
}
