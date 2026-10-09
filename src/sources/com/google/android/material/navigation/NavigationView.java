package com.google.android.material.navigation;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.yalantis.ucrop.view.CropImageView;
import f.a;
import java.util.ArrayList;
import java.util.Objects;
import p.j;
import q.l;
import q.n;
import qp.m4;
import t5.b;
import t5.c;
import t5.e;
import z4.s0;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements MaterialBackHandler {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int[] f14925e0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int[] f14926f0 = {-16842910};
    public final NavigationMenu H;
    public final NavigationMenuPresenter K;
    public OnNavigationItemSelectedListener L;
    public final int M;
    public final int[] N;
    public j O;
    public final ViewTreeObserver.OnGlobalLayoutListener P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public final boolean V;
    public final int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ShapeableDelegate f14927a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final MaterialSideContainerBackHelper f14928b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final MaterialBackOrchestrator f14929c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final b f14930d0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnNavigationItemSelectedListener {
        boolean a();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SavedState extends k5.b {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
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
        public Bundle f14934c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14934c = parcel.readBundle(classLoader);
        }

        @Override // k5.b, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeBundle(this.f14934c);
        }
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        if (this.O == null) {
            this.O = new j(getContext());
        }
        return this.O;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void a(a aVar) {
        k();
        this.f14928b0.f14795f = aVar;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void c() {
        Pair pairK = k();
        final DrawerLayout drawerLayout = (DrawerLayout) pairK.first;
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.f14928b0;
        a aVar = materialSideContainerBackHelper.f14795f;
        materialSideContainerBackHelper.f14795f = null;
        if (aVar == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.b(this, true);
            return;
        }
        int i11 = ((c) pairK.second).f52036a;
        int i12 = DrawerLayoutUtils.f14822a;
        materialSideContainerBackHelper.b(aVar, i11, new AnimatorListenerAdapter() { // from class: com.google.android.material.navigation.DrawerLayoutUtils.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                NavigationView navigationView = this;
                DrawerLayout drawerLayout2 = drawerLayout;
                drawerLayout2.b(navigationView, false);
                drawerLayout2.setScrimColor(-1728053248);
            }
        }, new com.google.android.material.motion.c(drawerLayout, 1));
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void d(a aVar) {
        float f5 = aVar.f26117c;
        int i11 = ((c) k().second).f52036a;
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.f14928b0;
        a aVar2 = materialSideContainerBackHelper.f14795f;
        materialSideContainerBackHelper.f14795f = aVar;
        if (aVar2 != null) {
            materialSideContainerBackHelper.c(f5, i11, aVar.f26118d == 0);
        }
        if (this.V) {
            this.U = AnimationUtils.c(0, materialSideContainerBackHelper.f14790a.getInterpolation(f5), this.W);
            j(getWidth(), getHeight());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ShapeableDelegate shapeableDelegate = this.f14927a0;
        Path path = shapeableDelegate.f15316e;
        if (!shapeableDelegate.c() || path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void f() {
        k();
        this.f14928b0.a();
        if (!this.V || this.U == 0) {
            return;
        }
        this.U = 0;
        j(getWidth(), getHeight());
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public final void g(v1 v1Var) {
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        navigationMenuPresenter.getClass();
        int iD = v1Var.d();
        if (navigationMenuPresenter.f14686b0 != iD) {
            navigationMenuPresenter.f14686b0 = iD;
            int i11 = (navigationMenuPresenter.f14685b.getChildCount() <= 0 && navigationMenuPresenter.Z) ? navigationMenuPresenter.f14686b0 : 0;
            NavigationMenuView navigationMenuView = navigationMenuPresenter.f14683a;
            navigationMenuView.setPadding(0, i11, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = navigationMenuPresenter.f14683a;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, v1Var.a());
        s0.c(navigationMenuPresenter.f14685b, v1Var);
    }

    public MaterialSideContainerBackHelper getBackHelper() {
        return this.f14928b0;
    }

    public MenuItem getCheckedItem() {
        return this.K.a();
    }

    public int getDividerInsetEnd() {
        return this.K.V;
    }

    public int getDividerInsetStart() {
        return this.K.U;
    }

    public int getHeaderCount() {
        return this.K.f14685b.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.K.O;
    }

    public int getItemHorizontalPadding() {
        return this.K.Q;
    }

    public int getItemIconPadding() {
        return this.K.S;
    }

    public ColorStateList getItemIconTintList() {
        return this.K.N;
    }

    public int getItemMaxLines() {
        return this.K.f14684a0;
    }

    public ColorStateList getItemTextColor() {
        return this.K.M;
    }

    public int getItemVerticalPadding() {
        return this.K.R;
    }

    public Menu getMenu() {
        return this.H;
    }

    public int getSubheaderInsetEnd() {
        return this.K.X;
    }

    public int getSubheaderInsetStart() {
        return this.K.W;
    }

    public final ColorStateList h(int i11) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i11, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListB = o4.c.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.lingodeer.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i12 = typedValue.data;
        int defaultColor = colorStateListB.getDefaultColor();
        int[] iArr = f14925e0;
        int[] iArr2 = FrameLayout.EMPTY_STATE_SET;
        int[] iArr3 = f14926f0;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListB.getColorForState(iArr3, defaultColor), i12, defaultColor});
    }

    public final InsetDrawable i(m4 m4Var, ColorStateList colorStateList) {
        TypedArray typedArray = (TypedArray) m4Var.f48061c;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.a(getContext(), typedArray.getResourceId(18, 0), typedArray.getResourceId(19, 0)).a());
        materialShapeDrawable.r(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, typedArray.getDimensionPixelSize(23, 0), typedArray.getDimensionPixelSize(24, 0), typedArray.getDimensionPixelSize(22, 0), typedArray.getDimensionPixelSize(21, 0));
    }

    public final void j(int i11, int i12) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof c)) {
            if ((this.U > 0 || this.V) && (getBackground() instanceof MaterialShapeDrawable)) {
                boolean z11 = Gravity.getAbsoluteGravity(((c) getLayoutParams()).f52036a, getLayoutDirection()) == 3;
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
                ShapeAppearanceModel.Builder builderH = materialShapeDrawable.f15200b.f15214a.h();
                builderH.c(this.U);
                if (z11) {
                    builderH.f(CropImageView.DEFAULT_ASPECT_RATIO);
                    builderH.d(CropImageView.DEFAULT_ASPECT_RATIO);
                } else {
                    builderH.g(CropImageView.DEFAULT_ASPECT_RATIO);
                    builderH.e(CropImageView.DEFAULT_ASPECT_RATIO);
                }
                ShapeAppearanceModel shapeAppearanceModelA = builderH.a();
                materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelA);
                ShapeableDelegate shapeableDelegate = this.f14927a0;
                shapeableDelegate.f15314c = shapeAppearanceModelA;
                shapeableDelegate.d();
                shapeableDelegate.b(this);
                shapeableDelegate.f15315d = new RectF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, i11, i12);
                shapeableDelegate.d();
                shapeableDelegate.b(this);
                shapeableDelegate.f15313b = true;
                shapeableDelegate.b(this);
            }
        }
    }

    public final Pair k() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof c)) {
            return new Pair((DrawerLayout) parent, (c) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ArrayList arrayList;
        super.onAttachedToWindow();
        MaterialShapeUtils.d(this);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            MaterialBackOrchestrator materialBackOrchestrator = this.f14929c0;
            if (materialBackOrchestrator.f14796a != null) {
                DrawerLayout drawerLayout = (DrawerLayout) parent;
                b bVar = this.f14930d0;
                if (bVar != null && (arrayList = drawerLayout.V) != null) {
                    arrayList.remove(bVar);
                }
                if (bVar != null) {
                    if (drawerLayout.V == null) {
                        drawerLayout.V = new ArrayList();
                    }
                    drawerLayout.V.add(bVar);
                }
                if (DrawerLayout.j(this)) {
                    materialBackOrchestrator.a(true);
                }
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.P);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            b bVar = this.f14930d0;
            if (bVar != null && (arrayList = drawerLayout.V) != null) {
                arrayList.remove(bVar);
            }
        }
        this.f14929c0.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int i13 = this.M;
        if (mode == Integer.MIN_VALUE) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), i13), 1073741824);
        } else if (mode == 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f37910a);
        this.H.t(savedState.f14934c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f14934c = bundle;
        this.H.v(bundle);
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        j(i11, i12);
    }

    public void setBottomInsetScrimEnabled(boolean z11) {
        this.R = z11;
    }

    public void setCheckedItem(int i11) {
        MenuItem menuItemFindItem = this.H.findItem(i11);
        if (menuItemFindItem != null) {
            this.K.h((n) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i11) {
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        navigationMenuPresenter.V = i11;
        navigationMenuPresenter.o();
    }

    public void setDividerInsetStart(int i11) {
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        navigationMenuPresenter.U = i11;
        navigationMenuPresenter.o();
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeUtils.b(this, f5);
    }

    public void setEndInsetScrimEnabled(boolean z11) {
        this.T = z11;
    }

    public void setForceCompatClippingEnabled(boolean z11) {
        ShapeableDelegate shapeableDelegate = this.f14927a0;
        if (z11 != shapeableDelegate.f15312a) {
            shapeableDelegate.f15312a = z11;
            shapeableDelegate.b(this);
        }
    }

    public void setItemBackground(Drawable drawable) {
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        navigationMenuPresenter.O = drawable;
        navigationMenuPresenter.q();
    }

    public void setItemBackgroundResource(int i11) {
        setItemBackground(getContext().getDrawable(i11));
    }

    public void setItemHorizontalPadding(int i11) {
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        navigationMenuPresenter.Q = i11;
        navigationMenuPresenter.q();
    }

    public void setItemHorizontalPaddingResource(int i11) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i11);
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        navigationMenuPresenter.Q = dimensionPixelSize;
        navigationMenuPresenter.q();
    }

    public void setItemIconPadding(int i11) {
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        navigationMenuPresenter.S = i11;
        navigationMenuPresenter.q();
    }

    public void setItemIconPaddingResource(int i11) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i11);
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        navigationMenuPresenter.S = dimensionPixelSize;
        navigationMenuPresenter.q();
    }

    public void setItemIconSize(int i11) {
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        if (navigationMenuPresenter.T != i11) {
            navigationMenuPresenter.T = i11;
            navigationMenuPresenter.Y = true;
            navigationMenuPresenter.q();
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        navigationMenuPresenter.N = colorStateList;
        navigationMenuPresenter.q();
    }

    public void setItemMaxLines(int i11) {
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        navigationMenuPresenter.f14684a0 = i11;
        navigationMenuPresenter.q();
    }

    public void setItemTextAppearance(int i11) {
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        navigationMenuPresenter.K = i11;
        navigationMenuPresenter.q();
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z11) {
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        navigationMenuPresenter.L = z11;
        navigationMenuPresenter.q();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        navigationMenuPresenter.M = colorStateList;
        navigationMenuPresenter.q();
    }

    public void setItemVerticalPadding(int i11) {
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        navigationMenuPresenter.R = i11;
        navigationMenuPresenter.q();
    }

    public void setItemVerticalPaddingResource(int i11) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i11);
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        navigationMenuPresenter.R = dimensionPixelSize;
        navigationMenuPresenter.q();
    }

    public void setNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.L = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i11) {
        super.setOverScrollMode(i11);
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.f14690d0 = i11;
            NavigationMenuView navigationMenuView = navigationMenuPresenter.f14683a;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i11);
            }
        }
    }

    public void setStartInsetScrimEnabled(boolean z11) {
        this.S = z11;
    }

    public void setSubheaderInsetEnd(int i11) {
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        navigationMenuPresenter.X = i11;
        navigationMenuPresenter.p();
    }

    public void setSubheaderInsetStart(int i11) {
        NavigationMenuPresenter navigationMenuPresenter = this.K;
        navigationMenuPresenter.W = i11;
        navigationMenuPresenter.p();
    }

    public void setTopInsetScrimEnabled(boolean z11) {
        this.Q = z11;
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.lingodeer.R.attr.navigationViewStyle);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0181 A[PHI: r15
      0x0181: PHI (r15v4 android.graphics.drawable.Drawable) = 
      (r15v3 android.graphics.drawable.Drawable)
      (r15v7 android.graphics.drawable.Drawable)
      (r15v3 android.graphics.drawable.Drawable)
     binds: [B:50:0x0144, B:56:0x016a, B:54:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
    public NavigationView(Context context, AttributeSet attributeSet, int i11) {
        ColorStateList colorStateListH;
        int i12;
        super(MaterialThemeOverlay.a(context, attributeSet, i11, com.lingodeer.R.style.Widget_Design_NavigationView), attributeSet, i11);
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.K = navigationMenuPresenter;
        this.N = new int[2];
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = 0;
        this.f14927a0 = ShapeableDelegate.a(this);
        this.f14928b0 = new MaterialSideContainerBackHelper(this);
        this.f14929c0 = new MaterialBackOrchestrator(this, this);
        this.f14930d0 = new e() { // from class: com.google.android.material.navigation.NavigationView.1
            @Override // t5.b
            public final void a(View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    MaterialBackOrchestrator materialBackOrchestrator = navigationView.f14929c0;
                    Objects.requireNonNull(materialBackOrchestrator);
                    view.post(new b2.a(materialBackOrchestrator, 7));
                }
            }

            @Override // t5.b
            public final void b(View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    navigationView.f14929c0.b();
                    if (!navigationView.V || navigationView.U == 0) {
                        return;
                    }
                    navigationView.U = 0;
                    navigationView.j(navigationView.getWidth(), navigationView.getHeight());
                }
            }
        };
        Context context2 = getContext();
        NavigationMenu navigationMenu = new NavigationMenu(context2);
        this.H = navigationMenu;
        m4 m4VarE = ThemeEnforcement.e(context2, attributeSet, com.google.android.material.R.styleable.U, i11, com.lingodeer.R.style.Widget_Design_NavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) m4VarE.f48061c;
        if (typedArray.hasValue(1)) {
            setBackground(m4VarE.g(1));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        this.U = dimensionPixelSize;
        this.V = dimensionPixelSize == 0;
        this.W = getResources().getDimensionPixelSize(com.lingodeer.R.dimen.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList colorStateListD = DrawableUtils.d(background);
        if (background == null || colorStateListD != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.d(context2, attributeSet, i11, com.lingodeer.R.style.Widget_Design_NavigationView).a());
            if (colorStateListD != null) {
                materialShapeDrawable.r(colorStateListD);
            }
            materialShapeDrawable.n(context2);
            setBackground(materialShapeDrawable);
        }
        if (typedArray.hasValue(8)) {
            setElevation(typedArray.getDimensionPixelSize(8, 0));
        }
        setFitsSystemWindows(typedArray.getBoolean(2, false));
        this.M = typedArray.getDimensionPixelSize(3, 0);
        ColorStateList colorStateListF = typedArray.hasValue(33) ? m4VarE.f(33) : null;
        int resourceId = typedArray.hasValue(36) ? typedArray.getResourceId(36, 0) : 0;
        if (resourceId == 0 && colorStateListF == null) {
            colorStateListF = h(R.attr.textColorSecondary);
        }
        if (typedArray.hasValue(15)) {
            colorStateListH = m4VarE.f(15);
        } else {
            colorStateListH = h(R.attr.textColorSecondary);
        }
        int resourceId2 = typedArray.hasValue(25) ? typedArray.getResourceId(25, 0) : 0;
        boolean z11 = typedArray.getBoolean(26, true);
        if (typedArray.hasValue(14)) {
            setItemIconSize(typedArray.getDimensionPixelSize(14, 0));
        }
        ColorStateList colorStateListF2 = typedArray.hasValue(27) ? m4VarE.f(27) : null;
        if (resourceId2 == 0 && colorStateListF2 == null) {
            colorStateListF2 = h(R.attr.textColorPrimary);
        }
        Drawable drawableG = m4VarE.g(11);
        if (drawableG == null && (typedArray.hasValue(18) || typedArray.hasValue(19))) {
            drawableG = i(m4VarE, MaterialResources.b(getContext(), m4VarE, 20));
            ColorStateList colorStateListB = MaterialResources.b(context2, m4VarE, 17);
            if (colorStateListB != null) {
                navigationMenuPresenter.P = new RippleDrawable(RippleUtils.c(colorStateListB), null, i(m4VarE, null));
                navigationMenuPresenter.q();
            }
        }
        if (typedArray.hasValue(12)) {
            i12 = 0;
            setItemHorizontalPadding(typedArray.getDimensionPixelSize(12, 0));
        } else {
            i12 = 0;
        }
        if (typedArray.hasValue(28)) {
            setItemVerticalPadding(typedArray.getDimensionPixelSize(28, i12));
        }
        setDividerInsetStart(typedArray.getDimensionPixelSize(6, i12));
        setDividerInsetEnd(typedArray.getDimensionPixelSize(5, i12));
        setSubheaderInsetStart(typedArray.getDimensionPixelSize(35, i12));
        setSubheaderInsetEnd(typedArray.getDimensionPixelSize(34, i12));
        setTopInsetScrimEnabled(typedArray.getBoolean(37, this.Q));
        setBottomInsetScrimEnabled(typedArray.getBoolean(4, this.R));
        setStartInsetScrimEnabled(typedArray.getBoolean(32, this.S));
        setEndInsetScrimEnabled(typedArray.getBoolean(9, this.T));
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(13, 0);
        setItemMaxLines(typedArray.getInt(16, 1));
        navigationMenu.f47284e = new q.j() { // from class: com.google.android.material.navigation.NavigationView.2
            @Override // q.j
            public final boolean c(l lVar, MenuItem menuItem) {
                OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.L;
                return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.a();
            }

            @Override // q.j
            public final void i(l lVar) {
            }
        };
        navigationMenuPresenter.f14689d = 1;
        navigationMenuPresenter.j(context2, navigationMenu);
        if (resourceId != 0) {
            navigationMenuPresenter.f14694t = resourceId;
            navigationMenuPresenter.p();
        }
        navigationMenuPresenter.H = colorStateListF;
        navigationMenuPresenter.p();
        navigationMenuPresenter.N = colorStateListH;
        navigationMenuPresenter.q();
        int overScrollMode = getOverScrollMode();
        navigationMenuPresenter.f14690d0 = overScrollMode;
        NavigationMenuView navigationMenuView = navigationMenuPresenter.f14683a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(overScrollMode);
        }
        if (resourceId2 != 0) {
            navigationMenuPresenter.K = resourceId2;
            navigationMenuPresenter.q();
        }
        navigationMenuPresenter.L = z11;
        navigationMenuPresenter.q();
        navigationMenuPresenter.M = colorStateListF2;
        navigationMenuPresenter.q();
        navigationMenuPresenter.O = drawableG;
        navigationMenuPresenter.q();
        navigationMenuPresenter.S = dimensionPixelSize2;
        navigationMenuPresenter.q();
        navigationMenu.b(navigationMenuPresenter, navigationMenu.f47280a);
        addView((View) navigationMenuPresenter.b(this));
        if (typedArray.hasValue(29)) {
            int resourceId3 = typedArray.getResourceId(29, 0);
            navigationMenuPresenter.n(true);
            getMenuInflater().inflate(resourceId3, navigationMenu);
            navigationMenuPresenter.n(false);
            navigationMenuPresenter.c(false);
        }
        if (typedArray.hasValue(10)) {
            navigationMenuPresenter.f14685b.addView(navigationMenuPresenter.f14693f.inflate(typedArray.getResourceId(10, 0), (ViewGroup) navigationMenuPresenter.f14685b, false));
            NavigationMenuView navigationMenuView2 = navigationMenuPresenter.f14683a;
            navigationMenuView2.setPadding(0, 0, 0, navigationMenuView2.getPaddingBottom());
        }
        m4VarE.l();
        this.P = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                NavigationView navigationView = NavigationView.this;
                int[] iArr = navigationView.N;
                navigationView.getLocationOnScreen(iArr);
                boolean z12 = true;
                boolean z13 = iArr[1] == 0;
                NavigationMenuPresenter navigationMenuPresenter2 = navigationView.K;
                if (navigationMenuPresenter2.Z != z13) {
                    navigationMenuPresenter2.Z = z13;
                    int i13 = (navigationMenuPresenter2.f14685b.getChildCount() <= 0 && navigationMenuPresenter2.Z) ? navigationMenuPresenter2.f14686b0 : 0;
                    NavigationMenuView navigationMenuView3 = navigationMenuPresenter2.f14683a;
                    navigationMenuView3.setPadding(0, i13, 0, navigationMenuView3.getPaddingBottom());
                }
                navigationView.setDrawTopInsetForeground(z13 && navigationView.Q);
                boolean z14 = navigationView.getLayoutDirection() == 1;
                int i14 = iArr[0];
                navigationView.setDrawLeftInsetForeground((i14 == 0 || navigationView.getWidth() + i14 == 0) && (!z14 ? !navigationView.S : !navigationView.T));
                Activity activityA = ContextUtils.a(navigationView.getContext());
                if (activityA != null) {
                    Rect rectA = WindowUtils.a(activityA);
                    navigationView.setDrawBottomInsetForeground((rectA.height() - navigationView.getHeight() == iArr[1]) && (Color.alpha(activityA.getWindow().getNavigationBarColor()) != 0) && navigationView.R);
                    if ((rectA.width() != iArr[0] && rectA.width() - navigationView.getWidth() != iArr[0]) || (!z14 ? !navigationView.T : !navigationView.S)) {
                        z12 = false;
                    }
                    navigationView.setDrawRightInsetForeground(z12);
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.P);
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.H.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.K.h((n) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
