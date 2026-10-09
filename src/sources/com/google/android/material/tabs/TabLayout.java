package com.google.android.material.tabs;

import a5.c;
import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.logging.type.LogSeverity;
import com.yalantis.ucrop.view.CropImageView;
import fb.g0;
import i0.pKy.shrCcjmOhAmRC;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import jh.h;
import ua.a;
import ua.f;
import ua.i;
import ua.j;
import y4.d;
import z4.l0;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@f
public class TabLayout extends HorizontalScrollView {
    public static final d C0 = new d(16);
    public int A0;
    public final b4.d B0;
    public final int H;
    public final int K;
    public final int L;
    public final int M;
    public ColorStateList N;
    public ColorStateList O;
    public ColorStateList P;
    public Drawable Q;
    public int R;
    public final PorterDuff.Mode S;
    public final float T;
    public final float U;
    public final float V;
    public final int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15518a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f15519a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f15520b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int f15521b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Tab f15522c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final int f15523c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SlidingTabIndicator f15524d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f15525d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15526e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f15527e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15528f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f15529f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final int f15530g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f15531h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f15532i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f15533j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f15534k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f15535l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f15536m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f15537n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public TabIndicatorInterpolator f15538o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final TimeInterpolator f15539p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public BaseOnTabSelectedListener f15540q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ArrayList f15541r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ViewPagerOnTabSelectedListener f15542s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f15543t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ValueAnimator f15544t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ViewPager f15545u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public a f15546v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public DataSetObserver f15547w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public TabLayoutOnPageChangeListener f15548x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public AdapterChangeListener f15549y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f15550z0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AdapterChangeListener implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f15552a;

        public AdapterChangeListener() {
        }

        @Override // ua.i
        public final void a(ViewPager viewPager, a aVar, a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f15545u0 == viewPager) {
                tabLayout.l(aVar2, this.f15552a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Deprecated
    public interface BaseOnTabSelectedListener<T extends Tab> {
        void a(Tab tab);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface LabelVisibility {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnTabSelectedListener extends BaseOnTabSelectedListener<Tab> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class PagerAdapterObserver extends DataSetObserver {
        public PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            TabLayout.this.i();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            TabLayout.this.i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class SlidingTabIndicator extends LinearLayout {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f15555c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ValueAnimator f15556a;

        public SlidingTabIndicator(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a(int i11) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.A0 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i11);
                TabIndicatorInterpolator tabIndicatorInterpolator = tabLayout.f15538o0;
                Drawable drawable = tabLayout.Q;
                tabIndicatorInterpolator.getClass();
                RectF rectFA = TabIndicatorInterpolator.a(tabLayout, childAt);
                drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
                tabLayout.f15518a = i11;
            }
        }

        public final void b(int i11) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.Q.getBounds();
            tabLayout.Q.setBounds(bounds.left, 0, bounds.right, i11);
            requestLayout();
        }

        public final void c(View view, View view2, float f5) {
            TabLayout tabLayout = TabLayout.this;
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = tabLayout.Q;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.Q.getBounds().bottom);
            } else {
                tabLayout.f15538o0.b(tabLayout, view, view2, f5, tabLayout.Q);
            }
            postInvalidateOnAnimation();
        }

        public final void d(int i11, int i12, boolean z11) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f15518a == i11) {
                return;
            }
            final View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            final View childAt2 = getChildAt(i11);
            if (childAt2 == null) {
                a(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.f15518a = i11;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.SlidingTabIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    int i13 = SlidingTabIndicator.f15555c;
                    SlidingTabIndicator.this.c(childAt, childAt2, animatedFraction);
                }
            };
            if (!z11) {
                this.f15556a.removeAllUpdateListeners();
                this.f15556a.addUpdateListener(animatorUpdateListener);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f15556a = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.f15539p0);
            valueAnimator.setDuration(i12);
            valueAnimator.setFloatValues(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
            valueAnimator.addUpdateListener(animatorUpdateListener);
            valueAnimator.start();
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int iHeight = tabLayout.Q.getBounds().height();
            if (iHeight < 0) {
                iHeight = tabLayout.Q.getIntrinsicHeight();
            }
            int i11 = tabLayout.f15531h0;
            if (i11 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i11 != 1) {
                height = 0;
                if (i11 != 2) {
                    iHeight = i11 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (tabLayout.Q.getBounds().width() > 0) {
                Rect bounds = tabLayout.Q.getBounds();
                tabLayout.Q.setBounds(bounds.left, height, bounds.right, iHeight);
                tabLayout.Q.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
            super.onLayout(z11, i11, i12, i13, i14);
            ValueAnimator valueAnimator = this.f15556a;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                d(tabLayout.getSelectedTabPosition(), -1, false);
                return;
            }
            if (tabLayout.f15518a == -1) {
                tabLayout.f15518a = tabLayout.getSelectedTabPosition();
            }
            a(tabLayout.f15518a);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i11, int i12) {
            super.onMeasure(i11, i12);
            if (View.MeasureSpec.getMode(i11) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z11 = true;
            if (tabLayout.f15529f0 == 1 || tabLayout.f15532i0 == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) ViewUtils.d(getContext(), 16)) * 2)) {
                    boolean z12 = false;
                    for (int i14 = 0; i14 < childCount; i14++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != CropImageView.DEFAULT_ASPECT_RATIO) {
                            layoutParams.width = iMax;
                            layoutParams.weight = CropImageView.DEFAULT_ASPECT_RATIO;
                            z12 = true;
                        }
                    }
                    z11 = z12;
                } else {
                    tabLayout.f15529f0 = 0;
                    tabLayout.o(false);
                }
                if (z11) {
                    super.onMeasure(i11, i12);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Tab {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f15561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f15562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f15563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15564d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f15565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TabLayout f15566f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public TabView f15567g;

        public final void a(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f15563c) && !TextUtils.isEmpty(charSequence)) {
                this.f15567g.setContentDescription(charSequence);
            }
            this.f15562b = charSequence;
            TabView tabView = this.f15567g;
            if (tabView != null) {
                tabView.d();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface TabGravity {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface TabIndicatorAnimationMode {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface TabIndicatorGravity {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class TabLayoutOnPageChangeListener implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f15568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15570c;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.f15568a = new WeakReference(tabLayout);
        }

        @Override // ua.j
        public final void b(int i11, float f5) {
            TabLayout tabLayout = (TabLayout) this.f15568a.get();
            if (tabLayout != null) {
                int i12 = this.f15570c;
                boolean z11 = true;
                if (i12 == 2 && this.f15569b != 1) {
                    z11 = false;
                }
                if (i12 == 2 && this.f15569b == 0) {
                    z11 = false;
                }
                tabLayout.m(i11, f5, z11, z11, false);
            }
        }

        @Override // ua.j
        public final void onPageScrollStateChanged(int i11) {
            this.f15569b = this.f15570c;
            this.f15570c = i11;
            TabLayout tabLayout = (TabLayout) this.f15568a.get();
            if (tabLayout != null) {
                tabLayout.A0 = this.f15570c;
            }
        }

        @Override // ua.j
        public final void onPageSelected(int i11) {
            TabLayout tabLayout = (TabLayout) this.f15568a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i11 || i11 >= tabLayout.getTabCount()) {
                return;
            }
            int i12 = this.f15570c;
            tabLayout.k(tabLayout.g(i11), i12 == 0 || (i12 == 2 && this.f15569b == 0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class TabView extends LinearLayout {
        public static final /* synthetic */ int N = 0;
        public ImageView H;
        public Drawable K;
        public int L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Tab f15571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f15572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageView f15573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public View f15574d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public BadgeDrawable f15575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f15576f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f15577t;

        public TabView(Context context) {
            super(context);
            this.L = 2;
            e(context);
            setPaddingRelative(TabLayout.this.f15526e, TabLayout.this.f15528f, TabLayout.this.f15543t, TabLayout.this.H);
            setGravity(17);
            setOrientation(!TabLayout.this.f15533j0 ? 1 : 0);
            setClickable(true);
            PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            WeakHashMap weakHashMap = s0.f58893a;
            l0.a(this, systemIcon);
        }

        private BadgeDrawable getBadge() {
            return this.f15575e;
        }

        public final void a() {
            if (this.f15575e != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f15574d;
                if (view != null) {
                    BadgeDrawable badgeDrawable = this.f15575e;
                    if (badgeDrawable != null) {
                        if (badgeDrawable.e() != null) {
                            badgeDrawable.e().setForeground(null);
                        } else {
                            view.getOverlay().remove(badgeDrawable);
                        }
                    }
                    this.f15574d = null;
                }
            }
        }

        public final void b() {
            Tab tab;
            if (this.f15575e != null) {
                if (this.f15576f != null) {
                    a();
                    return;
                }
                ImageView imageView = this.f15573c;
                if (imageView != null && (tab = this.f15571a) != null && tab.f15561a != null) {
                    if (this.f15574d == imageView) {
                        c(imageView);
                        return;
                    }
                    a();
                    ImageView imageView2 = this.f15573c;
                    if (this.f15575e == null || imageView2 == null) {
                        return;
                    }
                    setClipChildren(false);
                    setClipToPadding(false);
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                    BadgeDrawable badgeDrawable = this.f15575e;
                    Rect rect = new Rect();
                    imageView2.getDrawingRect(rect);
                    badgeDrawable.setBounds(rect);
                    badgeDrawable.j(imageView2, null);
                    if (badgeDrawable.e() != null) {
                        badgeDrawable.e().setForeground(badgeDrawable);
                    } else {
                        imageView2.getOverlay().add(badgeDrawable);
                    }
                    this.f15574d = imageView2;
                    return;
                }
                TextView textView = this.f15572b;
                if (textView == null || this.f15571a == null) {
                    a();
                    return;
                }
                if (this.f15574d == textView) {
                    c(textView);
                    return;
                }
                a();
                TextView textView2 = this.f15572b;
                if (this.f15575e == null || textView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                BadgeDrawable badgeDrawable2 = this.f15575e;
                Rect rect2 = new Rect();
                textView2.getDrawingRect(rect2);
                badgeDrawable2.setBounds(rect2);
                badgeDrawable2.j(textView2, null);
                if (badgeDrawable2.e() != null) {
                    badgeDrawable2.e().setForeground(badgeDrawable2);
                } else {
                    textView2.getOverlay().add(badgeDrawable2);
                }
                this.f15574d = textView2;
            }
        }

        public final void c(View view) {
            BadgeDrawable badgeDrawable = this.f15575e;
            if (badgeDrawable == null || view != this.f15574d) {
                return;
            }
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            badgeDrawable.setBounds(rect);
            badgeDrawable.j(view, null);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0020  */
        public final void d() {
            boolean z11;
            f();
            Tab tab = this.f15571a;
            if (tab == null) {
                z11 = false;
            } else {
                TabLayout tabLayout = tab.f15566f;
                if (tabLayout == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition == -1 || selectedTabPosition != tab.f15564d) {
                    z11 = false;
                } else {
                    z11 = true;
                }
            }
            setSelected(z11);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.K;
            if ((drawable == null || !drawable.isStateful()) ? false : this.K.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e(Context context) {
            GradientDrawable gradientDrawable;
            TabLayout tabLayout = TabLayout.this;
            int i11 = tabLayout.W;
            if (i11 != 0) {
                Drawable drawableK = h.k(context, i11);
                this.K = drawableK;
                if (drawableK != null && drawableK.isStateful()) {
                    this.K.setState(getDrawableState());
                }
            } else {
                this.K = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable rippleDrawable = gradientDrawable2;
            if (tabLayout.P != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateListA = RippleUtils.a(tabLayout.P);
                boolean z11 = tabLayout.f15537n0;
                if (z11) {
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z11 ? null : gradientDrawable3);
            }
            setBackground(rippleDrawable);
            tabLayout.invalidate();
        }

        public final void f() {
            int i11;
            ViewParent parent;
            Tab tab = this.f15571a;
            View view = tab != null ? tab.f15565e : null;
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.f15576f;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f15576f);
                    }
                    addView(view);
                }
                this.f15576f = view;
                TextView textView = this.f15572b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f15573c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f15573c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.f15577t = textView2;
                if (textView2 != null) {
                    this.L = textView2.getMaxLines();
                }
                this.H = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view3 = this.f15576f;
                if (view3 != null) {
                    removeView(view3);
                    this.f15576f = null;
                }
                this.f15577t = null;
                this.H = null;
            }
            if (this.f15576f == null) {
                if (this.f15573c == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.lingodeer.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f15573c = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f15572b == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.lingodeer.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f15572b = textView3;
                    addView(textView3);
                    this.L = this.f15572b.getMaxLines();
                }
                TextView textView4 = this.f15572b;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.K);
                if (!isSelected() || (i11 = tabLayout.M) == -1) {
                    this.f15572b.setTextAppearance(tabLayout.L);
                } else {
                    this.f15572b.setTextAppearance(i11);
                }
                ColorStateList colorStateList = tabLayout.N;
                if (colorStateList != null) {
                    this.f15572b.setTextColor(colorStateList);
                }
                g(this.f15572b, this.f15573c, true);
                b();
                final ImageView imageView3 = this.f15573c;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.tabs.TabLayout.TabView.1
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view4, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                            View view5 = imageView3;
                            if (view5.getVisibility() == 0) {
                                int i21 = TabView.N;
                                TabView.this.c(view5);
                            }
                        }
                    });
                }
                final TextView textView5 = this.f15572b;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.tabs.TabLayout.TabView.1
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view4, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                            View view5 = textView5;
                            if (view5.getVisibility() == 0) {
                                int i21 = TabView.N;
                                TabView.this.c(view5);
                            }
                        }
                    });
                }
            } else {
                TextView textView6 = this.f15577t;
                if (textView6 != null || this.H != null) {
                    g(textView6, this.H, false);
                }
            }
            if (tab == null || TextUtils.isEmpty(tab.f15563c)) {
                return;
            }
            setContentDescription(tab.f15563c);
        }

        public final void g(TextView textView, ImageView imageView, boolean z11) {
            boolean z12;
            Drawable drawable;
            Tab tab = this.f15571a;
            Drawable drawableMutate = (tab == null || (drawable = tab.f15561a) == null) ? null : drawable.mutate();
            TabLayout tabLayout = TabLayout.this;
            if (drawableMutate != null) {
                drawableMutate.setTintList(tabLayout.O);
                PorterDuff.Mode mode = tabLayout.S;
                if (mode != null) {
                    drawableMutate.setTintMode(mode);
                }
            }
            Tab tab2 = this.f15571a;
            CharSequence charSequence = tab2 != null ? tab2.f15562b : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (zIsEmpty) {
                    z12 = false;
                } else {
                    this.f15571a.getClass();
                    z12 = true;
                }
                textView.setText(!zIsEmpty ? charSequence : null);
                textView.setVisibility(z12 ? 0 : 8);
                if (!zIsEmpty) {
                    setVisibility(0);
                }
            } else {
                z12 = false;
            }
            if (z11 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iD = (z12 && imageView.getVisibility() == 0) ? (int) ViewUtils.d(getContext(), 8) : 0;
                if (tabLayout.f15533j0) {
                    if (iD != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(iD);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iD != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iD;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            Tab tab3 = this.f15571a;
            CharSequence charSequence2 = tab3 != null ? tab3.f15563c : null;
            if (zIsEmpty) {
                charSequence = charSequence2;
            }
            g0.C(this, charSequence);
        }

        public int getContentHeight() {
            View[] viewArr = {this.f15572b, this.f15573c, this.f15576f};
            int iMax = 0;
            int iMin = 0;
            boolean z11 = false;
            for (int i11 = 0; i11 < 3; i11++) {
                View view = viewArr[i11];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z11 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z11 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z11 = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f15572b, this.f15573c, this.f15576f};
            int iMax = 0;
            int iMin = 0;
            boolean z11 = false;
            for (int i11 = 0; i11 < 3; i11++) {
                View view = viewArr[i11];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z11 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z11 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z11 = true;
                }
            }
            return iMax - iMin;
        }

        public Tab getTab() {
            return this.f15571a;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f15575e;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfo.setContentDescription(this.f15575e.d());
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) a5.f.o(0, 1, this.f15571a.f15564d, 1, false, isSelected()).f378b);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) c.f361g.f373a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.lingodeer.R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i11, int i12) {
            int size = View.MeasureSpec.getSize(i11);
            int mode = View.MeasureSpec.getMode(i11);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i11 = View.MeasureSpec.makeMeasureSpec(tabLayout.f15519a0, Integer.MIN_VALUE);
            }
            super.onMeasure(i11, i12);
            if (this.f15572b != null) {
                float f5 = tabLayout.T;
                if (isSelected() && tabLayout.M != -1) {
                    f5 = tabLayout.U;
                }
                int i13 = this.L;
                ImageView imageView = this.f15573c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f15572b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f5 = tabLayout.V;
                    }
                } else {
                    i13 = 1;
                }
                float textSize = this.f15572b.getTextSize();
                int lineCount = this.f15572b.getLineCount();
                int maxLines = this.f15572b.getMaxLines();
                if (f5 != textSize || (maxLines >= 0 && i13 != maxLines)) {
                    if (tabLayout.f15532i0 == 1 && f5 > textSize && lineCount == 1) {
                        Layout layout = this.f15572b.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((f5 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.f15572b.setTextSize(0, f5);
                    this.f15572b.setMaxLines(i13);
                    super.onMeasure(i11, i12);
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f15571a == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            Tab tab = this.f15571a;
            TabLayout tabLayout = tab.f15566f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.k(tab, true);
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z11) {
            isSelected();
            super.setSelected(z11);
            TextView textView = this.f15572b;
            if (textView != null) {
                textView.setSelected(z11);
            }
            ImageView imageView = this.f15573c;
            if (imageView != null) {
                imageView.setSelected(z11);
            }
            View view = this.f15576f;
            if (view != null) {
                view.setSelected(z11);
            }
        }

        public void setTab(Tab tab) {
            if (tab != this.f15571a) {
                this.f15571a = tab;
                d();
            }
        }

        private BadgeDrawable getOrCreateBadge() {
            if (this.f15575e == null) {
                this.f15575e = new BadgeDrawable(getContext(), null);
            }
            b();
            BadgeDrawable badgeDrawable = this.f15575e;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException(shrCcjmOhAmRC.FRFoPGBp);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewPager f15580a;

        public ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.f15580a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void a(Tab tab) {
            this.f15580a.setCurrentItem(tab.f15564d);
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f15520b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Tab tab = (Tab) arrayList.get(i11);
            if (tab != null && tab.f15561a != null && !TextUtils.isEmpty(tab.f15562b)) {
                return !this.f15533j0 ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i11 = this.f15521b0;
        if (i11 != -1) {
            return i11;
        }
        int i12 = this.f15532i0;
        if (i12 == 0 || i12 == 2) {
            return this.f15525d0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f15524d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i11) {
        SlidingTabIndicator slidingTabIndicator = this.f15524d;
        int childCount = slidingTabIndicator.getChildCount();
        if (i11 < childCount) {
            int i12 = 0;
            while (i12 < childCount) {
                View childAt = slidingTabIndicator.getChildAt(i12);
                if ((i12 != i11 || childAt.isSelected()) && (i12 == i11 || !childAt.isSelected())) {
                    childAt.setSelected(i12 == i11);
                    childAt.setActivated(i12 == i11);
                } else {
                    childAt.setSelected(i12 == i11);
                    childAt.setActivated(i12 == i11);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).f();
                    }
                }
                i12++;
            }
        }
    }

    public final void a(Tab tab, boolean z11) {
        ArrayList arrayList = this.f15520b;
        int size = arrayList.size();
        if (tab.f15566f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        tab.f15564d = size;
        arrayList.add(size, tab);
        int size2 = arrayList.size();
        int i11 = -1;
        for (int i12 = size + 1; i12 < size2; i12++) {
            if (((Tab) arrayList.get(i12)).f15564d == this.f15518a) {
                i11 = i12;
            }
            ((Tab) arrayList.get(i12)).f15564d = i12;
        }
        this.f15518a = i11;
        TabView tabView = tab.f15567g;
        tabView.setSelected(false);
        tabView.setActivated(false);
        int i13 = tab.f15564d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.f15532i0 == 1 && this.f15529f0 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        this.f15524d.addView(tabView, i13, layoutParams);
        if (z11) {
            TabLayout tabLayout = tab.f15566f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.k(tab, true);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        b(view);
    }

    public final void b(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        Tab tabH = h();
        CharSequence charSequence = tabItem.f15515a;
        if (charSequence != null) {
            tabH.a(charSequence);
        }
        Drawable drawable = tabItem.f15516b;
        if (drawable != null) {
            tabH.f15561a = drawable;
            TabLayout tabLayout = tabH.f15566f;
            if (tabLayout.f15529f0 == 1 || tabLayout.f15532i0 == 2) {
                tabLayout.o(true);
            }
            TabView tabView = tabH.f15567g;
            if (tabView != null) {
                tabView.d();
            }
        }
        int i11 = tabItem.f15517c;
        if (i11 != 0) {
            tabH.f15565e = LayoutInflater.from(tabH.f15567g.getContext()).inflate(i11, (ViewGroup) tabH.f15567g, false);
            TabView tabView2 = tabH.f15567g;
            if (tabView2 != null) {
                tabView2.d();
            }
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            tabH.f15563c = tabItem.getContentDescription();
            TabView tabView3 = tabH.f15567g;
            if (tabView3 != null) {
                tabView3.d();
            }
        }
        a(tabH, this.f15520b.isEmpty());
    }

    public final void c(int i11) {
        if (i11 == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            SlidingTabIndicator slidingTabIndicator = this.f15524d;
            int childCount = slidingTabIndicator.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (slidingTabIndicator.getChildAt(i12).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iE = e(i11, CropImageView.DEFAULT_ASPECT_RATIO);
            if (scrollX != iE) {
                f();
                this.f15544t0.setIntValues(scrollX, iE);
                this.f15544t0.start();
            }
            ValueAnimator valueAnimator = slidingTabIndicator.f15556a;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f15518a != i11) {
                slidingTabIndicator.f15556a.cancel();
            }
            slidingTabIndicator.d(i11, this.f15530g0, true);
            return;
        }
        m(i11, CropImageView.DEFAULT_ASPECT_RATIO, true, true, true);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void d() {
        int i11 = this.f15532i0;
        int iMax = (i11 == 0 || i11 == 2) ? Math.max(0, this.f15527e0 - this.f15526e) : 0;
        SlidingTabIndicator slidingTabIndicator = this.f15524d;
        slidingTabIndicator.setPaddingRelative(iMax, 0, 0, 0);
        int i12 = this.f15532i0;
        if (i12 == 0) {
            int i13 = this.f15529f0;
            if (i13 == 0) {
                slidingTabIndicator.setGravity(8388611);
            } else if (i13 == 1) {
                slidingTabIndicator.setGravity(1);
            } else if (i13 == 2) {
                slidingTabIndicator.setGravity(8388611);
            }
        } else if (i12 == 1 || i12 == 2) {
            slidingTabIndicator.setGravity(1);
        }
        o(true);
    }

    public final int e(int i11, float f5) {
        SlidingTabIndicator slidingTabIndicator;
        View childAt;
        int i12 = this.f15532i0;
        if ((i12 != 0 && i12 != 2) || (childAt = (slidingTabIndicator = this.f15524d).getChildAt(i11)) == null) {
            return 0;
        }
        int i13 = i11 + 1;
        View childAt2 = i13 < slidingTabIndicator.getChildCount() ? slidingTabIndicator.getChildAt(i13) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i14 = (int) ((width + width2) * 0.5f * f5);
        return getLayoutDirection() == 0 ? left + i14 : left - i14;
    }

    public final void f() {
        if (this.f15544t0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f15544t0 = valueAnimator;
            valueAnimator.setInterpolator(this.f15539p0);
            this.f15544t0.setDuration(this.f15530g0);
            this.f15544t0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator2.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    public final Tab g(int i11) {
        if (i11 < 0 || i11 >= getTabCount()) {
            return null;
        }
        return (Tab) this.f15520b.get(i11);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        Tab tab = this.f15522c;
        if (tab != null) {
            return tab.f15564d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f15520b.size();
    }

    public int getTabGravity() {
        return this.f15529f0;
    }

    public ColorStateList getTabIconTint() {
        return this.O;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f15536m0;
    }

    public int getTabIndicatorGravity() {
        return this.f15531h0;
    }

    public int getTabMaxWidth() {
        return this.f15519a0;
    }

    public int getTabMode() {
        return this.f15532i0;
    }

    public ColorStateList getTabRippleColor() {
        return this.P;
    }

    public Drawable getTabSelectedIndicator() {
        return this.Q;
    }

    public ColorStateList getTabTextColors() {
        return this.N;
    }

    public final Tab h() {
        Tab tab = (Tab) C0.acquire();
        if (tab == null) {
            tab = new Tab();
        }
        tab.f15566f = this;
        b4.d dVar = this.B0;
        TabView tabView = dVar != null ? (TabView) dVar.acquire() : null;
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(tab);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(tab.f15563c)) {
            tabView.setContentDescription(tab.f15562b);
        } else {
            tabView.setContentDescription(tab.f15563c);
        }
        tab.f15567g = tabView;
        return tab;
    }

    public final void i() {
        int currentItem;
        j();
        a aVar = this.f15546v0;
        if (aVar != null) {
            int iC = aVar.c();
            for (int i11 = 0; i11 < iC; i11++) {
                Tab tabH = h();
                this.f15546v0.getClass();
                tabH.a(null);
                a(tabH, false);
            }
            ViewPager viewPager = this.f15545u0;
            if (viewPager == null || iC <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            k(g(currentItem), true);
        }
    }

    public final void j() {
        SlidingTabIndicator slidingTabIndicator = this.f15524d;
        int childCount = slidingTabIndicator.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            TabView tabView = (TabView) slidingTabIndicator.getChildAt(childCount);
            slidingTabIndicator.removeViewAt(childCount);
            if (tabView != null) {
                tabView.setTab(null);
                tabView.setSelected(false);
                this.B0.c(tabView);
            }
            requestLayout();
        }
        Iterator it = this.f15520b.iterator();
        while (it.hasNext()) {
            Tab tab = (Tab) it.next();
            it.remove();
            tab.f15566f = null;
            tab.f15567g = null;
            tab.f15561a = null;
            tab.f15562b = null;
            tab.f15563c = null;
            tab.f15564d = -1;
            tab.f15565e = null;
            C0.c(tab);
        }
        this.f15522c = null;
    }

    public final void k(Tab tab, boolean z11) {
        TabLayout tabLayout;
        Tab tab2 = this.f15522c;
        ArrayList arrayList = this.f15541r0;
        if (tab2 == tab) {
            if (tab2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((BaseOnTabSelectedListener) arrayList.get(size)).getClass();
                }
                c(tab.f15564d);
                return;
            }
            return;
        }
        int i11 = tab != null ? tab.f15564d : -1;
        if (z11) {
            if ((tab2 == null || tab2.f15564d == -1) && i11 != -1) {
                tabLayout = this;
                tabLayout.m(i11, CropImageView.DEFAULT_ASPECT_RATIO, true, true, true);
            } else {
                tabLayout = this;
                c(i11);
            }
            if (i11 != -1) {
                setSelectedTabView(i11);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.f15522c = tab;
        if (tab2 != null && tab2.f15566f != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((BaseOnTabSelectedListener) arrayList.get(size2)).getClass();
            }
        }
        if (tab != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((BaseOnTabSelectedListener) arrayList.get(size3)).a(tab);
            }
        }
    }

    public final void l(a aVar, boolean z11) {
        DataSetObserver dataSetObserver;
        a aVar2 = this.f15546v0;
        if (aVar2 != null && (dataSetObserver = this.f15547w0) != null) {
            aVar2.f52881a.unregisterObserver(dataSetObserver);
        }
        this.f15546v0 = aVar;
        if (z11 && aVar != null) {
            if (this.f15547w0 == null) {
                this.f15547w0 = new PagerAdapterObserver();
            }
            aVar.f52881a.registerObserver(this.f15547w0);
        }
        i();
    }

    public final void m(int i11, float f5, boolean z11, boolean z12, boolean z13) {
        float f11 = i11 + f5;
        int iRound = Math.round(f11);
        if (iRound >= 0) {
            SlidingTabIndicator slidingTabIndicator = this.f15524d;
            if (iRound >= slidingTabIndicator.getChildCount()) {
                return;
            }
            if (z12) {
                TabLayout.this.f15518a = Math.round(f11);
                ValueAnimator valueAnimator = slidingTabIndicator.f15556a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    slidingTabIndicator.f15556a.cancel();
                }
                slidingTabIndicator.c(slidingTabIndicator.getChildAt(i11), slidingTabIndicator.getChildAt(i11 + 1), f5);
            }
            ValueAnimator valueAnimator2 = this.f15544t0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f15544t0.cancel();
            }
            int iE = e(i11, f5);
            int scrollX = getScrollX();
            boolean z14 = (i11 < getSelectedTabPosition() && iE >= scrollX) || (i11 > getSelectedTabPosition() && iE <= scrollX) || i11 == getSelectedTabPosition();
            if (getLayoutDirection() == 1) {
                z14 = (i11 < getSelectedTabPosition() && iE <= scrollX) || (i11 > getSelectedTabPosition() && iE >= scrollX) || i11 == getSelectedTabPosition();
            }
            if (z14 || this.A0 == 1 || z13) {
                if (i11 < 0) {
                    iE = 0;
                }
                scrollTo(iE, 0);
            }
            if (z11) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void n(ViewPager viewPager, boolean z11) {
        TabLayout tabLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.f15545u0;
        if (viewPager2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.f15548x0;
            if (tabLayoutOnPageChangeListener != null && (arrayList2 = viewPager2.f2771w0) != null) {
                arrayList2.remove(tabLayoutOnPageChangeListener);
            }
            AdapterChangeListener adapterChangeListener = this.f15549y0;
            if (adapterChangeListener != null && (arrayList = this.f15545u0.f2774z0) != null) {
                arrayList.remove(adapterChangeListener);
            }
        }
        ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = this.f15542s0;
        ArrayList arrayList3 = this.f15541r0;
        if (viewPagerOnTabSelectedListener != null) {
            arrayList3.remove(viewPagerOnTabSelectedListener);
            this.f15542s0 = null;
        }
        if (viewPager != null) {
            this.f15545u0 = viewPager;
            if (this.f15548x0 == null) {
                this.f15548x0 = new TabLayoutOnPageChangeListener(this);
            }
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener2 = this.f15548x0;
            tabLayoutOnPageChangeListener2.f15570c = 0;
            tabLayoutOnPageChangeListener2.f15569b = 0;
            if (viewPager.f2771w0 == null) {
                viewPager.f2771w0 = new ArrayList();
            }
            viewPager.f2771w0.add(tabLayoutOnPageChangeListener2);
            ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener2 = new ViewPagerOnTabSelectedListener(viewPager);
            this.f15542s0 = viewPagerOnTabSelectedListener2;
            if (!arrayList3.contains(viewPagerOnTabSelectedListener2)) {
                arrayList3.add(viewPagerOnTabSelectedListener2);
            }
            a adapter = viewPager.getAdapter();
            if (adapter != null) {
                l(adapter, true);
            }
            if (this.f15549y0 == null) {
                this.f15549y0 = new AdapterChangeListener();
            }
            AdapterChangeListener adapterChangeListener2 = this.f15549y0;
            adapterChangeListener2.f15552a = true;
            if (viewPager.f2774z0 == null) {
                viewPager.f2774z0 = new ArrayList();
            }
            viewPager.f2774z0.add(adapterChangeListener2);
            m(viewPager.getCurrentItem(), CropImageView.DEFAULT_ASPECT_RATIO, true, true, true);
            tabLayout = this;
        } else {
            tabLayout = this;
            tabLayout.f15545u0 = null;
            l(null, false);
        }
        tabLayout.f15550z0 = z11;
    }

    public final void o(boolean z11) {
        int i11 = 0;
        while (true) {
            SlidingTabIndicator slidingTabIndicator = this.f15524d;
            if (i11 >= slidingTabIndicator.getChildCount()) {
                return;
            }
            View childAt = slidingTabIndicator.getChildAt(i11);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f15532i0 == 1 && this.f15529f0 == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = CropImageView.DEFAULT_ASPECT_RATIO;
            }
            if (z11) {
                childAt.requestLayout();
            }
            i11++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.d(this);
        if (this.f15545u0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                n((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f15550z0) {
            setupWithViewPager(null);
            this.f15550z0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        TabView tabView;
        Drawable drawable;
        int i11 = 0;
        while (true) {
            SlidingTabIndicator slidingTabIndicator = this.f15524d;
            if (i11 >= slidingTabIndicator.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = slidingTabIndicator.getChildAt(i11);
            if ((childAt instanceof TabView) && (drawable = (tabView = (TabView) childAt).K) != null) {
                drawable.setBounds(tabView.getLeft(), tabView.getTop(), tabView.getRight(), tabView.getBottom());
                tabView.K.draw(canvas);
            }
            i11++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) hd.d.v(1, getTabCount(), 1, false).f32187b);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int iRound = Math.round(ViewUtils.d(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i12);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i12 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i12) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i11);
        if (View.MeasureSpec.getMode(i11) != 0) {
            int iD = this.f15523c0;
            if (iD <= 0) {
                iD = (int) (size - ViewUtils.d(getContext(), 56));
            }
            this.f15519a0 = iD;
        }
        super.onMeasure(i11, i12);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i13 = this.f15532i0;
            if (i13 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i13 != 1) {
                if (i13 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeUtils.b(this, f5);
    }

    public void setInlineLabel(boolean z11) {
        if (this.f15533j0 == z11) {
            return;
        }
        this.f15533j0 = z11;
        int i11 = 0;
        while (true) {
            SlidingTabIndicator slidingTabIndicator = this.f15524d;
            if (i11 >= slidingTabIndicator.getChildCount()) {
                d();
                return;
            }
            View childAt = slidingTabIndicator.getChildAt(i11);
            if (childAt instanceof TabView) {
                TabView tabView = (TabView) childAt;
                tabView.setOrientation(!TabLayout.this.f15533j0 ? 1 : 0);
                TextView textView = tabView.f15577t;
                if (textView == null && tabView.H == null) {
                    tabView.g(tabView.f15572b, tabView.f15573c, true);
                } else {
                    tabView.g(textView, tabView.H, false);
                }
            }
            i11++;
        }
    }

    public void setInlineLabelResource(int i11) {
        setInlineLabel(getResources().getBoolean(i11));
    }

    @Deprecated
    public void setOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        setOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.f15544t0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.Q = drawableMutate;
        int i11 = this.R;
        if (i11 != 0) {
            drawableMutate.setTint(i11);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.f15535l0;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.Q.getIntrinsicHeight();
        }
        this.f15524d.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i11) {
        this.R = i11;
        Drawable drawable = this.Q;
        if (i11 != 0) {
            drawable.setTint(i11);
        } else {
            drawable.setTintList(null);
        }
        o(false);
    }

    public void setSelectedTabIndicatorGravity(int i11) {
        if (this.f15531h0 != i11) {
            this.f15531h0 = i11;
            this.f15524d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i11) {
        this.f15535l0 = i11;
        this.f15524d.b(i11);
    }

    public void setTabGravity(int i11) {
        if (this.f15529f0 != i11) {
            this.f15529f0 = i11;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            ArrayList arrayList = this.f15520b;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                TabView tabView = ((Tab) arrayList.get(i11)).f15567g;
                if (tabView != null) {
                    tabView.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i11) {
        setTabIconTint(o4.c.b(getContext(), i11));
    }

    public void setTabIndicatorAnimationMode(int i11) {
        this.f15536m0 = i11;
        if (i11 == 0) {
            this.f15538o0 = new TabIndicatorInterpolator();
        } else if (i11 == 1) {
            this.f15538o0 = new ElasticTabIndicatorInterpolator();
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException(w4.c.f(i11, " is not a valid TabIndicatorAnimationMode"));
            }
            this.f15538o0 = new FadeTabIndicatorInterpolator();
        }
    }

    public void setTabIndicatorFullWidth(boolean z11) {
        this.f15534k0 = z11;
        int i11 = SlidingTabIndicator.f15555c;
        SlidingTabIndicator slidingTabIndicator = this.f15524d;
        slidingTabIndicator.a(TabLayout.this.getSelectedTabPosition());
        slidingTabIndicator.postInvalidateOnAnimation();
    }

    public void setTabMode(int i11) {
        if (i11 != this.f15532i0) {
            this.f15532i0 = i11;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.P == colorStateList) {
            return;
        }
        this.P = colorStateList;
        int i11 = 0;
        while (true) {
            SlidingTabIndicator slidingTabIndicator = this.f15524d;
            if (i11 >= slidingTabIndicator.getChildCount()) {
                return;
            }
            View childAt = slidingTabIndicator.getChildAt(i11);
            if (childAt instanceof TabView) {
                Context context = getContext();
                int i12 = TabView.N;
                ((TabView) childAt).e(context);
            }
            i11++;
        }
    }

    public void setTabRippleColorResource(int i11) {
        setTabRippleColor(o4.c.b(getContext(), i11));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            ArrayList arrayList = this.f15520b;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                TabView tabView = ((Tab) arrayList.get(i11)).f15567g;
                if (tabView != null) {
                    tabView.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(a aVar) {
        l(aVar, false);
    }

    public void setUnboundedRipple(boolean z11) {
        if (this.f15537n0 == z11) {
            return;
        }
        this.f15537n0 = z11;
        int i11 = 0;
        while (true) {
            SlidingTabIndicator slidingTabIndicator = this.f15524d;
            if (i11 >= slidingTabIndicator.getChildCount()) {
                return;
            }
            View childAt = slidingTabIndicator.getChildAt(i11);
            if (childAt instanceof TabView) {
                Context context = getContext();
                int i12 = TabView.N;
                ((TabView) childAt).e(context);
            }
            i11++;
        }
    }

    public void setUnboundedRippleResource(int i11) {
        setUnboundedRipple(getResources().getBoolean(i11));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        n(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.lingodeer.R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i11) {
        b(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(BaseOnTabSelectedListener baseOnTabSelectedListener) {
        BaseOnTabSelectedListener baseOnTabSelectedListener2 = this.f15540q0;
        ArrayList arrayList = this.f15541r0;
        if (baseOnTabSelectedListener2 != null) {
            arrayList.remove(baseOnTabSelectedListener2);
        }
        this.f15540q0 = baseOnTabSelectedListener;
        if (baseOnTabSelectedListener == null || arrayList.contains(baseOnTabSelectedListener)) {
            return;
        }
        arrayList.add(baseOnTabSelectedListener);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, com.lingodeer.R.style.Widget_Design_TabLayout), attributeSet, i11);
        this.f15518a = -1;
        this.f15520b = new ArrayList();
        this.M = -1;
        this.R = 0;
        this.f15519a0 = Integer.MAX_VALUE;
        this.f15535l0 = -1;
        this.f15541r0 = new ArrayList();
        this.B0 = new b4.d(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        SlidingTabIndicator slidingTabIndicator = new SlidingTabIndicator(context2);
        this.f15524d = slidingTabIndicator;
        super.addView(slidingTabIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.f13748j0, i11, com.lingodeer.R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListD = DrawableUtils.d(getBackground());
        if (colorStateListD != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.r(colorStateListD);
            materialShapeDrawable.n(context2);
            materialShapeDrawable.q(getElevation());
            setBackground(materialShapeDrawable);
        }
        setSelectedTabIndicator(MaterialResources.d(context2, typedArrayD, 5));
        setSelectedTabIndicatorColor(typedArrayD.getColor(8, 0));
        slidingTabIndicator.b(typedArrayD.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayD.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayD.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayD.getBoolean(9, true));
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(16, 0);
        this.H = dimensionPixelSize;
        this.f15543t = dimensionPixelSize;
        this.f15528f = dimensionPixelSize;
        this.f15526e = dimensionPixelSize;
        this.f15526e = typedArrayD.getDimensionPixelSize(19, dimensionPixelSize);
        this.f15528f = typedArrayD.getDimensionPixelSize(20, dimensionPixelSize);
        this.f15543t = typedArrayD.getDimensionPixelSize(18, dimensionPixelSize);
        this.H = typedArrayD.getDimensionPixelSize(17, dimensionPixelSize);
        if (MaterialAttributes.b(context2, com.lingodeer.R.attr.isMaterial3Theme, false)) {
            this.K = com.lingodeer.R.attr.textAppearanceTitleSmall;
        } else {
            this.K = com.lingodeer.R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayD.getResourceId(24, com.lingodeer.R.style.TextAppearance_Design_Tab);
        this.L = resourceId;
        int[] iArr = k.a.f37423z;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.T = dimensionPixelSize2;
            this.N = MaterialResources.a(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayD.hasValue(22)) {
                this.M = typedArrayD.getResourceId(22, resourceId);
            }
            int i12 = this.M;
            int[] iArr2 = HorizontalScrollView.EMPTY_STATE_SET;
            int[] iArr3 = HorizontalScrollView.SELECTED_STATE_SET;
            if (i12 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i12, iArr);
                try {
                    this.U = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListA = MaterialResources.a(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListA != null) {
                        this.N = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor()), this.N.getDefaultColor()});
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th2;
                }
            }
            if (typedArrayD.hasValue(25)) {
                this.N = MaterialResources.a(context2, typedArrayD, 25);
            }
            if (typedArrayD.hasValue(23)) {
                this.N = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{typedArrayD.getColor(23, 0), this.N.getDefaultColor()});
            }
            this.O = MaterialResources.a(context2, typedArrayD, 3);
            this.S = ViewUtils.h(typedArrayD.getInt(4, -1), null);
            this.P = MaterialResources.a(context2, typedArrayD, 21);
            this.f15530g0 = typedArrayD.getInt(6, LogSeverity.NOTICE_VALUE);
            this.f15539p0 = MotionUtils.d(context2, com.lingodeer.R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f13769b);
            this.f15521b0 = typedArrayD.getDimensionPixelSize(14, -1);
            this.f15523c0 = typedArrayD.getDimensionPixelSize(13, -1);
            this.W = typedArrayD.getResourceId(0, 0);
            this.f15527e0 = typedArrayD.getDimensionPixelSize(1, 0);
            this.f15532i0 = typedArrayD.getInt(15, 1);
            this.f15529f0 = typedArrayD.getInt(2, 0);
            this.f15533j0 = typedArrayD.getBoolean(12, false);
            this.f15537n0 = typedArrayD.getBoolean(26, false);
            typedArrayD.recycle();
            Resources resources = getResources();
            this.V = resources.getDimensionPixelSize(com.lingodeer.R.dimen.design_tab_text_size_2line);
            this.f15525d0 = resources.getDimensionPixelSize(com.lingodeer.R.dimen.design_tab_scrollable_min_width);
            d();
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    public void setSelectedTabIndicator(int i11) {
        if (i11 != 0) {
            setSelectedTabIndicator(h.k(getContext(), i11));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
