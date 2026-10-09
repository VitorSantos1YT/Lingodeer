package com.google.android.material.navigation;

import a5.c;
import a5.f;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.carousel.a;
import com.google.android.material.internal.BaselineLayout;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.yalantis.ucrop.view.CropImageView;
import fb.g0;
import q.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NavigationBarItemView extends FrameLayout implements NavigationBarMenuItemView {
    public static final int[] L0 = {R.attr.state_checked};
    public static final ActiveIndicatorTransform M0;
    public static final ActiveIndicatorUnlabeledTransform N0;
    public int A0;
    public int B0;
    public BadgeDrawable C0;
    public int D0;
    public int E0;
    public int F0;
    public boolean G0;
    public float H;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public float K;
    public Rect K0;
    public float L;
    public float M;
    public float N;
    public float O;
    public int P;
    public boolean Q;
    public final LinearLayout R;
    public final LinearLayout S;
    public final View T;
    public final FrameLayout U;
    public final ImageView V;
    public final BaselineLayout W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14828a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final TextView f14829a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f14830b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final TextView f14831b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f14832c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final BaselineLayout f14833c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14834d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final TextView f14835d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14836e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final TextView f14837e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14838f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public BaselineLayout f14839f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f14840g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f14841h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f14842i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f14843j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f14844k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ColorStateList f14845l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f14846m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public n f14847n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ColorStateList f14848o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Drawable f14849p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Drawable f14850q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ValueAnimator f14851r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ActiveIndicatorTransform f14852s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14853t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f14854t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f14855u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f14856v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f14857w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f14858x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f14859y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f14860z0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ActiveIndicatorTransform {
        private ActiveIndicatorTransform() {
        }

        public float a(float f5) {
            return 1.0f;
        }

        public /* synthetic */ ActiveIndicatorTransform(int i11) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ActiveIndicatorUnlabeledTransform extends ActiveIndicatorTransform {
        private ActiveIndicatorUnlabeledTransform() {
            super(0);
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform
        public final float a(float f5) {
            return AnimationUtils.a(0.4f, 1.0f, f5);
        }

        public /* synthetic */ ActiveIndicatorUnlabeledTransform(int i11) {
            this();
        }
    }

    static {
        int i11 = 0;
        M0 = new ActiveIndicatorTransform(i11);
        N0 = new ActiveIndicatorUnlabeledTransform(i11);
    }

    public NavigationBarItemView(Context context) {
        super(context);
        this.f14828a = false;
        this.f14840g0 = -1;
        this.f14841h0 = 0;
        this.f14842i0 = 0;
        this.f14843j0 = 0;
        this.f14844k0 = 0;
        this.f14846m0 = false;
        this.f14852s0 = M0;
        this.f14854t0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f14855u0 = false;
        this.f14856v0 = 0;
        this.f14857w0 = 0;
        this.f14858x0 = -2;
        this.f14859y0 = 0;
        this.f14860z0 = false;
        this.A0 = 0;
        this.B0 = 0;
        this.E0 = 0;
        this.F0 = 49;
        this.G0 = false;
        this.H0 = false;
        this.I0 = false;
        this.J0 = false;
        this.K0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.R = (LinearLayout) findViewById(com.lingodeer.R.id.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.lingodeer.R.id.navigation_bar_item_inner_content_container);
        this.S = linearLayout;
        this.T = findViewById(com.lingodeer.R.id.navigation_bar_item_active_indicator_view);
        this.U = (FrameLayout) findViewById(com.lingodeer.R.id.navigation_bar_item_icon_container);
        this.V = (ImageView) findViewById(com.lingodeer.R.id.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(com.lingodeer.R.id.navigation_bar_item_labels_group);
        this.W = baselineLayout;
        TextView textView = (TextView) findViewById(com.lingodeer.R.id.navigation_bar_item_small_label_view);
        this.f14829a0 = textView;
        TextView textView2 = (TextView) findViewById(com.lingodeer.R.id.navigation_bar_item_large_label_view);
        this.f14831b0 = textView2;
        float dimension = getResources().getDimension(com.lingodeer.R.dimen.default_navigation_text_size);
        float dimension2 = getResources().getDimension(com.lingodeer.R.dimen.default_navigation_active_text_size);
        BaselineLayout baselineLayout2 = new BaselineLayout(getContext());
        this.f14833c0 = baselineLayout2;
        baselineLayout2.setVisibility(8);
        this.f14833c0.setDuplicateParentStateEnabled(true);
        this.f14833c0.setMeasurePaddingFromBaseline(this.I0);
        TextView textView3 = new TextView(getContext());
        this.f14835d0 = textView3;
        textView3.setMaxLines(1);
        TextView textView4 = this.f14835d0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.f14835d0.setDuplicateParentStateEnabled(true);
        this.f14835d0.setIncludeFontPadding(false);
        this.f14835d0.setGravity(16);
        this.f14835d0.setTextSize(dimension);
        TextView textView5 = new TextView(getContext());
        this.f14837e0 = textView5;
        textView5.setMaxLines(1);
        this.f14837e0.setEllipsize(truncateAt);
        this.f14837e0.setDuplicateParentStateEnabled(true);
        this.f14837e0.setVisibility(4);
        this.f14837e0.setIncludeFontPadding(false);
        this.f14837e0.setGravity(16);
        this.f14837e0.setTextSize(dimension2);
        this.f14833c0.addView(this.f14835d0);
        this.f14833c0.addView(this.f14837e0);
        this.f14839f0 = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.f14834d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f14836e = baselineLayout.getPaddingBottom();
        this.f14838f = 0;
        this.f14853t = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.f14835d0.setImportantForAccessibility(2);
        this.f14837e0.setImportantForAccessibility(2);
        setFocusable(true);
        a();
        this.f14859y0 = getResources().getDimensionPixelSize(com.lingodeer.R.dimen.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new a(this, 1));
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i11 = 0;
        for (int i12 = 0; i12 < iIndexOfChild; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i11++;
            }
        }
        return i11;
    }

    private int getSuggestedIconWidth() {
        BadgeDrawable badgeDrawable = this.C0;
        int minimumWidth = badgeDrawable == null ? 0 : badgeDrawable.getMinimumWidth() - this.C0.f13877e.f13881b.Y.intValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.U.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.V.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void i(int i11, int i12, int i13, View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i11;
        layoutParams.bottomMargin = i12;
        layoutParams.gravity = i13;
        view.setLayoutParams(layoutParams);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    public final void a() {
        float textSize = this.f14829a0.getTextSize();
        float textSize2 = this.f14831b0.getTextSize();
        this.H = textSize - textSize2;
        this.K = (textSize2 * 1.0f) / textSize;
        this.L = (textSize * 1.0f) / textSize2;
        float textSize3 = this.f14835d0.getTextSize();
        float textSize4 = this.f14837e0.getTextSize();
        this.M = textSize3 - textSize4;
        this.N = (textSize4 * 1.0f) / textSize3;
        this.O = (textSize3 * 1.0f) / textSize4;
    }

    public final void b() {
        Drawable rippleDrawable = this.f14832c;
        RippleDrawable rippleDrawable2 = null;
        boolean z11 = true;
        if (this.f14830b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f14855u0 && getActiveIndicatorDrawable() != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(RippleUtils.c(this.f14830b), null, activeIndicatorDrawable);
                z11 = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(RippleUtils.a(this.f14830b), null, null);
            }
        }
        FrameLayout frameLayout = this.U;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setForeground(rippleDrawable2);
        setBackground(rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z11);
        }
    }

    @Override // q.w
    public final void c(n nVar) {
        this.f14847n0 = nVar;
        setCheckable(nVar.isCheckable());
        setChecked(nVar.isChecked());
        setEnabled(nVar.isEnabled());
        setIcon(nVar.getIcon());
        setTitle(nVar.f47298e);
        setId(nVar.f47290a);
        if (!TextUtils.isEmpty(nVar.S)) {
            setContentDescription(nVar.S);
        }
        g0.C(this, !TextUtils.isEmpty(nVar.T) ? nVar.T : nVar.f47298e);
        l();
        this.f14828a = true;
    }

    public final void d(float f5, float f11) {
        ActiveIndicatorTransform activeIndicatorTransform = this.f14852s0;
        activeIndicatorTransform.getClass();
        float fA = AnimationUtils.a(0.4f, 1.0f, f5);
        View view = this.T;
        view.setScaleX(fA);
        view.setScaleY(activeIndicatorTransform.a(f5));
        view.setAlpha(AnimationUtils.b(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, f11 == CropImageView.DEFAULT_ASPECT_RATIO ? 0.8f : 0.0f, f11 == CropImageView.DEFAULT_ASPECT_RATIO ? 1.0f : 0.2f, f5));
        this.f14854t0 = f5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f14855u0) {
            this.U.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        int i11 = this.V.getLayoutParams().width > 0 ? this.f14853t : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f14833c0.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i11 : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i11 : 0;
        }
    }

    public final void f(TextView textView, TextView textView2, float f5, float f11) {
        i(this.D0 == 0 ? (int) (this.f14834d + f11) : 0, 0, this.F0, this.R);
        int i11 = this.D0;
        i(i11 == 0 ? 0 : this.K0.top, i11 == 0 ? 0 : this.K0.bottom, i11 == 0 ? 17 : 8388627, this.S);
        int i12 = this.f14836e;
        BaselineLayout baselineLayout = this.W;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), i12);
        this.f14839f0.setVisibility(0);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView.setVisibility(0);
        textView2.setScaleX(f5);
        textView2.setScaleY(f5);
        textView2.setVisibility(4);
    }

    public final void g() {
        int i11 = this.f14834d;
        i(i11, i11, this.D0 == 0 ? 17 : this.F0, this.R);
        i(0, 0, 17, this.S);
        BaselineLayout baselineLayout = this.W;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), 0);
        this.f14839f0.setVisibility(8);
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.T.getBackground();
    }

    public BadgeDrawable getBadge() {
        return this.C0;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.f14833c0;
    }

    public int getItemBackgroundResId() {
        return com.lingodeer.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // q.w
    public n getItemData() {
        return this.f14847n0;
    }

    public int getItemDefaultMarginResId() {
        return com.lingodeer.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f14840g0;
    }

    public BaselineLayout getLabelGroup() {
        return this.W;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        LinearLayout linearLayout = this.R;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        return linearLayout.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.D0 == 1) {
            LinearLayout linearLayout = this.S;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            return linearLayout.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        BaselineLayout baselineLayout = this.W;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), baselineLayout.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public final void h(TextView textView, int i11) {
        int iRound;
        if (this.J0) {
            textView.setTextAppearance(i11);
            return;
        }
        textView.setTextAppearance(i11);
        Context context = textView.getContext();
        if (i11 == 0) {
            iRound = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, k.a.f37423z);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                iRound = typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            } else {
                iRound = 0;
            }
        }
        if (iRound != 0) {
            textView.setTextSize(0, iRound);
        }
    }

    public final void j(int i11) {
        if (i11 > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.f14856v0, i11 - (this.A0 * 2));
            int iMax = this.f14857w0;
            if (this.D0 == 1) {
                int measuredWidth = i11 - (this.B0 * 2);
                int i12 = this.f14858x0;
                if (i12 != -1) {
                    measuredWidth = i12 == -2 ? this.R.getMeasuredWidth() : Math.min(i12, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.f14859y0, this.S.getMeasuredHeight());
            }
            View view = this.T;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.f14860z0 && this.P == 2) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void k(TextView textView, int i11) {
        if (textView == null) {
            return;
        }
        h(textView, i11);
        a();
        textView.setMinimumHeight(MaterialResources.e(textView.getContext(), i11));
        ColorStateList colorStateList = this.f14845l0;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        TextView textView2 = this.f14831b0;
        textView2.setTypeface(textView2.getTypeface(), this.f14846m0 ? 1 : 0);
        TextView textView3 = this.f14837e0;
        textView3.setTypeface(textView3.getTypeface(), this.f14846m0 ? 1 : 0);
    }

    public final void l() {
        n nVar = this.f14847n0;
        if (nVar != null) {
            setVisibility((!nVar.isVisible() || (!this.G0 && this.H0)) ? 8 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        n nVar = this.f14847n0;
        if (nVar != null && nVar.isCheckable() && this.f14847n0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, L0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.C0;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            n nVar = this.f14847n0;
            CharSequence charSequence = nVar.f47298e;
            if (!TextUtils.isEmpty(nVar.S)) {
                charSequence = this.f14847n0.S;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.C0.d()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f.o(0, 1, getItemVisiblePosition(), 1, false, isSelected()).f378b);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) c.f361g.f373a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.lingodeer.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(final int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        post(new Runnable() { // from class: com.google.android.material.navigation.NavigationBarItemView.1
            @Override // java.lang.Runnable
            public final void run() {
                NavigationBarItemView.this.j(i11);
            }
        });
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.T.setBackground(drawable);
        b();
    }

    public void setActiveIndicatorEnabled(boolean z11) {
        this.f14855u0 = z11;
        b();
        this.T.setVisibility(z11 ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i11) {
        this.f14859y0 = i11;
        j(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i11) {
        this.B0 = i11;
        if (this.D0 == 1) {
            setPadding(i11, 0, i11, 0);
        }
        j(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.K0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i11) {
        this.f14858x0 = i11;
        j(getWidth());
    }

    public void setActiveIndicatorHeight(int i11) {
        this.f14857w0 = i11;
        j(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i11) {
        if (this.f14838f != i11) {
            this.f14838f = i11;
            ((LinearLayout.LayoutParams) this.W.getLayoutParams()).topMargin = i11;
            if (this.f14833c0.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f14833c0.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i11 : 0;
                if (getLayoutDirection() == 1) {
                    i11 = 0;
                }
                layoutParams.leftMargin = i11;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i11) {
        this.A0 = i11;
        j(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z11) {
        this.f14860z0 = z11;
    }

    public void setActiveIndicatorWidth(int i11) {
        this.f14856v0 = i11;
        j(getWidth());
    }

    public void setBadge(BadgeDrawable badgeDrawable) {
        BadgeDrawable badgeDrawable2 = this.C0;
        if (badgeDrawable2 == badgeDrawable) {
            return;
        }
        ImageView imageView = this.V;
        if (badgeDrawable2 != null && imageView != null && badgeDrawable2 != null) {
            setClipChildren(true);
            setClipToPadding(true);
            BadgeDrawable badgeDrawable3 = this.C0;
            if (badgeDrawable3 != null) {
                if (badgeDrawable3.e() != null) {
                    badgeDrawable3.e().setForeground(null);
                } else {
                    imageView.getOverlay().remove(badgeDrawable3);
                }
            }
            this.C0 = null;
        }
        this.C0 = badgeDrawable;
        int i11 = this.E0;
        BadgeState badgeState = badgeDrawable.f13877e;
        if (badgeState.f13891l != i11) {
            badgeState.f13891l = i11;
            badgeDrawable.k();
        }
        if (imageView == null || this.C0 == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        BadgeDrawable badgeDrawable4 = this.C0;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        badgeDrawable4.setBounds(rect);
        badgeDrawable4.j(imageView, null);
        if (badgeDrawable4.e() != null) {
            badgeDrawable4.e().setForeground(badgeDrawable4);
        } else {
            imageView.getOverlay().add(badgeDrawable4);
        }
    }

    public void setCheckable(boolean z11) {
        refreshDrawableState();
    }

    public void setChecked(boolean z11) {
        TextView textView = this.f14831b0;
        setLabelPivots(textView);
        TextView textView2 = this.f14829a0;
        setLabelPivots(textView2);
        TextView textView3 = this.f14837e0;
        setLabelPivots(textView3);
        TextView textView4 = this.f14835d0;
        setLabelPivots(textView4);
        final float f5 = z11 ? 1.0f : 0.0f;
        if (this.f14855u0 && this.f14828a && isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.f14851r0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f14851r0 = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f14854t0, f5);
            this.f14851r0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    int[] iArr = NavigationBarItemView.L0;
                    NavigationBarItemView.this.d(fFloatValue, f5);
                }
            });
            this.f14851r0.setInterpolator(MotionUtils.d(getContext(), com.lingodeer.R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f13769b));
            this.f14851r0.setDuration(MotionUtils.c(getContext(), com.lingodeer.R.attr.motionDurationLong2, getResources().getInteger(com.lingodeer.R.integer.material_motion_duration_long_1)));
            this.f14851r0.start();
        } else {
            d(f5, f5);
        }
        float f11 = this.H;
        float f12 = this.K;
        float f13 = this.L;
        if (this.D0 == 1) {
            f11 = this.M;
            f12 = this.N;
            f13 = this.O;
            textView = textView3;
            textView2 = textView4;
        }
        int i11 = this.P;
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        g();
                    }
                } else if (z11) {
                    f(textView, textView2, f12, f11);
                } else {
                    f(textView2, textView, f13, CropImageView.DEFAULT_ASPECT_RATIO);
                }
            } else if (z11) {
                f(textView, textView2, f12, CropImageView.DEFAULT_ASPECT_RATIO);
            } else {
                g();
            }
        } else if (this.Q) {
            if (z11) {
                f(textView, textView2, f12, CropImageView.DEFAULT_ASPECT_RATIO);
            } else {
                g();
            }
        } else if (z11) {
            f(textView, textView2, f12, f11);
        } else {
            f(textView2, textView, f13, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        refreshDrawableState();
        setSelected(z11);
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        this.f14829a0.setEnabled(z11);
        this.f14831b0.setEnabled(z11);
        this.f14835d0.setEnabled(z11);
        this.f14837e0.setEnabled(z11);
        this.V.setEnabled(z11);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setExpanded(boolean z11) {
        this.G0 = z11;
        l();
    }

    public void setHorizontalTextAppearanceActive(int i11) {
        this.f14843j0 = i11;
        if (i11 == 0) {
            i11 = this.f14841h0;
        }
        k(this.f14837e0, i11);
    }

    public void setHorizontalTextAppearanceInactive(int i11) {
        this.f14844k0 = i11;
        if (i11 == 0) {
            i11 = this.f14842i0;
        }
        TextView textView = this.f14835d0;
        if (textView == null) {
            return;
        }
        h(textView, i11);
        a();
        textView.setMinimumHeight(MaterialResources.e(textView.getContext(), i11));
        ColorStateList colorStateList = this.f14845l0;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f14849p0) {
            return;
        }
        this.f14849p0 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f14850q0 = drawable;
            ColorStateList colorStateList = this.f14848o0;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.V.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i11) {
        if (this.f14853t != i11) {
            this.f14853t = i11;
            e();
            requestLayout();
        }
    }

    public void setIconSize(int i11) {
        ImageView imageView = this.V;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i11;
        layoutParams.height = i11;
        imageView.setLayoutParams(layoutParams);
        e();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f14848o0 = colorStateList;
        if (this.f14847n0 == null || (drawable = this.f14850q0) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f14850q0.invalidateSelf();
    }

    public void setItemBackground(int i11) {
        setItemBackground(i11 == 0 ? null : getContext().getDrawable(i11));
    }

    public void setItemGravity(int i11) {
        this.F0 = i11;
        requestLayout();
    }

    public void setItemIconGravity(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (this.D0 != i11) {
            this.D0 = i11;
            this.E0 = 0;
            BaselineLayout baselineLayout = this.W;
            this.f14839f0 = baselineLayout;
            LinearLayout linearLayout = this.S;
            int i18 = 8;
            if (i11 == 1) {
                if (this.f14833c0.getParent() == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    linearLayout.addView(this.f14833c0, layoutParams);
                    e();
                }
                Rect rect = this.K0;
                int i19 = rect.left;
                int i21 = rect.right;
                int i22 = rect.top;
                i12 = rect.bottom;
                this.E0 = 1;
                int i23 = this.B0;
                this.f14839f0 = this.f14833c0;
                i16 = i22;
                i15 = i21;
                i14 = i19;
                i13 = i23;
                i17 = 0;
            } else {
                i12 = 0;
                i13 = 0;
                i14 = 0;
                i15 = 0;
                i16 = 0;
                i17 = 8;
                i18 = 0;
            }
            baselineLayout.setVisibility(i18);
            this.f14833c0.setVisibility(i17);
            ((FrameLayout.LayoutParams) this.R.getLayoutParams()).gravity = this.F0;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams2.leftMargin = i14;
            layoutParams2.rightMargin = i15;
            layoutParams2.topMargin = i16;
            layoutParams2.bottomMargin = i12;
            setPadding(i13, 0, i13, 0);
            j(getWidth());
            b();
        }
    }

    public void setItemPaddingBottom(int i11) {
        if (this.f14836e != i11) {
            this.f14836e = i11;
            n nVar = this.f14847n0;
            if (nVar != null) {
                setChecked(nVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i11) {
        if (this.f14834d != i11) {
            this.f14834d = i11;
            n nVar = this.f14847n0;
            if (nVar != null) {
                setChecked(nVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i11) {
        this.f14840g0 = i11;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f14830b = colorStateList;
        b();
    }

    public void setLabelFontScalingEnabled(boolean z11) {
        this.J0 = z11;
        setTextAppearanceActive(this.f14841h0);
        setTextAppearanceInactive(this.f14842i0);
        setHorizontalTextAppearanceActive(this.f14843j0);
        setHorizontalTextAppearanceInactive(this.f14844k0);
    }

    public void setLabelMaxLines(int i11) {
        TextView textView = this.f14829a0;
        textView.setMaxLines(i11);
        TextView textView2 = this.f14831b0;
        textView2.setMaxLines(i11);
        this.f14835d0.setMaxLines(i11);
        this.f14837e0.setMaxLines(i11);
        if (Build.VERSION.SDK_INT > 34) {
            textView.setGravity(17);
            textView2.setGravity(17);
        } else if (i11 > 1) {
            textView.setEllipsize(null);
            textView2.setEllipsize(null);
            textView.setGravity(17);
            textView2.setGravity(17);
        } else {
            textView.setGravity(16);
            textView2.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i11) {
        if (this.P != i11) {
            this.P = i11;
            if (this.f14860z0 && i11 == 2) {
                this.f14852s0 = N0;
            } else {
                this.f14852s0 = M0;
            }
            j(getWidth());
            n nVar = this.f14847n0;
            if (nVar != null) {
                setChecked(nVar.isChecked());
            }
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z11) {
        this.I0 = z11;
        this.W.setMeasurePaddingFromBaseline(z11);
        this.f14829a0.setIncludeFontPadding(z11);
        this.f14831b0.setIncludeFontPadding(z11);
        this.f14833c0.setMeasurePaddingFromBaseline(z11);
        this.f14835d0.setIncludeFontPadding(z11);
        this.f14837e0.setIncludeFontPadding(z11);
        requestLayout();
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setOnlyShowWhenExpanded(boolean z11) {
        this.H0 = z11;
        l();
    }

    public void setShifting(boolean z11) {
        if (this.Q != z11) {
            this.Q = z11;
            n nVar = this.f14847n0;
            if (nVar != null) {
                setChecked(nVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i11) {
        this.f14841h0 = i11;
        k(this.f14831b0, i11);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z11) {
        this.f14846m0 = z11;
        setTextAppearanceActive(this.f14841h0);
        setHorizontalTextAppearanceActive(this.f14843j0);
        TextView textView = this.f14831b0;
        textView.setTypeface(textView.getTypeface(), this.f14846m0 ? 1 : 0);
        TextView textView2 = this.f14837e0;
        textView2.setTypeface(textView2.getTypeface(), this.f14846m0 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i11) {
        this.f14842i0 = i11;
        TextView textView = this.f14829a0;
        if (textView == null) {
            return;
        }
        h(textView, i11);
        a();
        textView.setMinimumHeight(MaterialResources.e(textView.getContext(), i11));
        ColorStateList colorStateList = this.f14845l0;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f14845l0 = colorStateList;
        if (colorStateList != null) {
            this.f14829a0.setTextColor(colorStateList);
            this.f14831b0.setTextColor(colorStateList);
            this.f14835d0.setTextColor(colorStateList);
            this.f14837e0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f14829a0.setText(charSequence);
        this.f14831b0.setText(charSequence);
        this.f14835d0.setText(charSequence);
        this.f14837e0.setText(charSequence);
        n nVar = this.f14847n0;
        if (nVar == null || TextUtils.isEmpty(nVar.S)) {
            setContentDescription(charSequence);
        }
        n nVar2 = this.f14847n0;
        if (nVar2 != null && !TextUtils.isEmpty(nVar2.T)) {
            charSequence = this.f14847n0.T;
        }
        g0.C(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f14832c = drawable;
        b();
    }
}
