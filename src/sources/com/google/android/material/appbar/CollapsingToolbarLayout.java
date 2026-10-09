package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import hh.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import o4.c;
import ue.f;
import z4.j0;
import z4.s0;
import z4.u;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public int H;
    public int K;
    public int L;
    public final Rect M;
    public final CollapsingTextHelper N;
    public final CollapsingTextHelper O;
    public final ElevationOverlayProvider P;
    public boolean Q;
    public boolean R;
    public final int S;
    public Drawable T;
    public Drawable U;
    public int V;
    public boolean W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13818a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ValueAnimator f13819a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13820b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f13821b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f13822c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final TimeInterpolator f13823c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f13824d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final TimeInterpolator f13825d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f13826e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f13827e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13828f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public AppBarLayout.OnOffsetChangedListener f13829f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f13830g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f13831h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f13832i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public v1 f13833j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f13834k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f13835l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f13836m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f13837n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f13838o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f13839p0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13840t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CollapsedTitleGravityMode {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f13844b;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class OffsetUpdateListener implements AppBarLayout.OnOffsetChangedListener {
        public OffsetUpdateListener() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public final void a(int i11) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            CollapsingTextHelper collapsingTextHelper = collapsingToolbarLayout.O;
            CollapsingTextHelper collapsingTextHelper2 = collapsingToolbarLayout.N;
            collapsingToolbarLayout.f13830g0 = i11;
            v1 v1Var = collapsingToolbarLayout.f13833j0;
            int iD = v1Var != null ? v1Var.d() : 0;
            int childCount = collapsingToolbarLayout.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = collapsingToolbarLayout.getChildAt(i12);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ViewOffsetHelper viewOffsetHelperB = CollapsingToolbarLayout.b(childAt);
                int i13 = layoutParams.f13843a;
                if (i13 == 1) {
                    viewOffsetHelperB.b(f.n(-i11, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).f13862b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).bottomMargin));
                } else if (i13 == 2) {
                    viewOffsetHelperB.b(Math.round((-i11) * layoutParams.f13844b));
                }
            }
            collapsingToolbarLayout.d();
            if (collapsingToolbarLayout.U != null && iD > 0) {
                collapsingToolbarLayout.postInvalidateOnAnimation();
            }
            int height = collapsingToolbarLayout.getHeight();
            int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - iD;
            int scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
            int i14 = collapsingToolbarLayout.f13830g0 + minimumHeight;
            float f5 = minimumHeight;
            float fAbs = Math.abs(i11) / f5;
            float f11 = scrimVisibleHeightTrigger / f5;
            float fMin = Math.min(1.0f, f11);
            collapsingTextHelper2.f14611d = fMin;
            collapsingTextHelper2.f14613e = p0.a(1.0f, fMin, 0.5f, fMin);
            collapsingTextHelper2.f14615f = i14;
            collapsingTextHelper2.A(fAbs);
            float fMin2 = Math.min(1.0f, f11);
            collapsingTextHelper.f14611d = fMin2;
            collapsingTextHelper.f14613e = p0.a(1.0f, fMin2, 0.5f, fMin2);
            collapsingTextHelper.f14615f = i14;
            collapsingTextHelper.A(fAbs);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface StaticLayoutBuilderConfigurer extends com.google.android.material.internal.StaticLayoutBuilderConfigurer {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface TitleCollapseMode {
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public static ViewOffsetHelper b(View view) {
        ViewOffsetHelper viewOffsetHelper = (ViewOffsetHelper) view.getTag(R.id.view_offset_helper);
        if (viewOffsetHelper != null) {
            return viewOffsetHelper;
        }
        ViewOffsetHelper viewOffsetHelper2 = new ViewOffsetHelper(view);
        view.setTag(R.id.view_offset_helper, viewOffsetHelper2);
        return viewOffsetHelper2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateListValueOf;
        Context context = getContext();
        TypedValue typedValueA = MaterialAttributes.a(context, R.attr.colorSurfaceContainer);
        if (typedValueA != null) {
            int i11 = typedValueA.resourceId;
            if (i11 != 0) {
                colorStateListValueOf = c.b(context, i11);
            } else {
                int i12 = typedValueA.data;
                if (i12 != 0) {
                    colorStateListValueOf = ColorStateList.valueOf(i12);
                } else {
                    colorStateListValueOf = null;
                }
            }
        } else {
            colorStateListValueOf = null;
        }
        if (colorStateListValueOf != null) {
            return colorStateListValueOf.getDefaultColor();
        }
        float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
        ElevationOverlayProvider elevationOverlayProvider = this.P;
        return elevationOverlayProvider.a(elevationOverlayProvider.f14459d, dimension);
    }

    public final void a() {
        View view;
        if (this.f13818a) {
            ViewGroup viewGroup = null;
            this.f13822c = null;
            this.f13824d = null;
            int i11 = this.f13820b;
            if (i11 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i11);
                this.f13822c = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    while (true) {
                        if (parent == this) {
                            view = viewGroup2;
                            break;
                        } else {
                            if (parent == null) {
                                break;
                            }
                            if (parent instanceof View) {
                                view = (View) parent;
                            }
                            parent = parent.getParent();
                            view = view;
                        }
                    }
                    this.f13824d = view;
                }
            }
            if (this.f13822c == null) {
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f13822c = viewGroup;
            }
            c();
            this.f13818a = false;
        }
    }

    public final void c() {
        View view;
        if (!this.Q && (view = this.f13826e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f13826e);
            }
        }
        if (!this.Q || this.f13822c == null) {
            return;
        }
        if (this.f13826e == null) {
            this.f13826e = new View(getContext());
        }
        if (this.f13826e.getParent() == null) {
            this.f13822c.addView(this.f13826e, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d() {
        if (this.T == null && this.U == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f13830g0 < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f13822c == null && (drawable = this.T) != null && this.V > 0) {
            drawable.mutate().setAlpha(this.V);
            this.T.draw(canvas);
        }
        if (this.Q && this.R) {
            ViewGroup viewGroup = this.f13822c;
            CollapsingTextHelper collapsingTextHelper = this.O;
            CollapsingTextHelper collapsingTextHelper2 = this.N;
            if (viewGroup == null || this.T == null || this.V <= 0 || this.f13832i0 != 1 || collapsingTextHelper2.f14607b >= collapsingTextHelper2.f14613e) {
                collapsingTextHelper2.f(canvas);
                collapsingTextHelper.f(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.T.getBounds(), Region.Op.DIFFERENCE);
                collapsingTextHelper2.f(canvas);
                collapsingTextHelper.f(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.U == null || this.V <= 0) {
            return;
        }
        v1 v1Var = this.f13833j0;
        int iD = v1Var != null ? v1Var.d() : 0;
        if (iD > 0) {
            this.U.setBounds(0, -this.f13830g0, getWidth(), iD - this.f13830g0);
            this.U.mutate().setAlpha(this.V);
            this.U.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j11) {
        boolean z11;
        View view2;
        Drawable drawable = this.T;
        if (drawable == null || this.V <= 0 || ((view2 = this.f13824d) == null || view2 == this ? view != this.f13822c : view != view2)) {
            z11 = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.f13832i0 == 1 && view != null && this.Q) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.T.mutate().setAlpha(this.V);
            this.T.draw(canvas);
            z11 = true;
        }
        return super.drawChild(canvas, view, j11) || z11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.U;
        boolean z11 = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.T;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        CollapsingTextHelper collapsingTextHelper = this.N;
        if (collapsingTextHelper != null) {
            collapsingTextHelper.S = drawableState;
            ColorStateList colorStateList2 = collapsingTextHelper.f14634p;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = collapsingTextHelper.f14632o) != null && colorStateList.isStateful())) {
                collapsingTextHelper.l(false);
                z11 = true;
            }
            state |= z11;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(int i11, int i12, int i13, int i14, boolean z11) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.Q || (view = this.f13826e) == null) {
            return;
        }
        int titleMarginStart = 0;
        boolean z12 = view.isAttachedToWindow() && this.f13826e.getVisibility() == 0;
        this.R = z12;
        if (z12 || z11) {
            boolean z13 = getLayoutDirection() == 1;
            View view2 = this.f13824d;
            if (view2 == null) {
                view2 = this.f13822c;
            }
            int height = ((getHeight() - b(view2).f13862b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view2.getLayoutParams())).bottomMargin;
            View view3 = this.f13826e;
            Rect rect = this.M;
            DescendantOffsetUtils.a(this, view3, rect);
            ViewGroup viewGroup = this.f13822c;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            } else {
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            }
            int i15 = rect.left + (z13 ? titleMarginEnd : titleMarginStart);
            int i16 = rect.right - (z13 ? titleMarginStart : titleMarginEnd);
            int i17 = rect.top + height + titleMarginTop;
            int i18 = (rect.bottom + height) - titleMarginBottom;
            CollapsingTextHelper collapsingTextHelper = this.O;
            TextPaint textPaint = collapsingTextHelper.V;
            textPaint.setTextSize(collapsingTextHelper.f14630n);
            textPaint.setTypeface(collapsingTextHelper.f14650x);
            textPaint.setLetterSpacing(collapsingTextHelper.f14618g0);
            int iDescent = (int) (i18 - (textPaint.descent() + (-textPaint.ascent())));
            CollapsingTextHelper collapsingTextHelper2 = this.N;
            TextPaint textPaint2 = collapsingTextHelper2.V;
            textPaint2.setTextSize(collapsingTextHelper2.f14630n);
            textPaint2.setTypeface(collapsingTextHelper2.f14650x);
            textPaint2.setLetterSpacing(collapsingTextHelper2.f14618g0);
            int iDescent2 = (int) (textPaint2.descent() + (-textPaint2.ascent()) + i17);
            if (TextUtils.isEmpty(collapsingTextHelper.H)) {
                collapsingTextHelper2.o(i15, i17, i16, i18);
            } else {
                collapsingTextHelper2.o(i15, i17, i16, iDescent);
                collapsingTextHelper.o(i15, iDescent2, i16, i18);
            }
            if (this.S == 0) {
                DescendantOffsetUtils.a(this, this, rect);
                int i19 = rect.left + (z13 ? titleMarginEnd : titleMarginStart);
                int i21 = rect.right;
                if (!z13) {
                    titleMarginStart = titleMarginEnd;
                }
                int i22 = i21 - titleMarginStart;
                if (TextUtils.isEmpty(collapsingTextHelper.H)) {
                    collapsingTextHelper2.p(i19, i17, i22, i18);
                } else {
                    collapsingTextHelper2.p(i19, i17, i22, iDescent);
                    collapsingTextHelper.p(i19, iDescent2, i22, i18);
                }
            }
            int i23 = z13 ? this.H : this.f13828f;
            int i24 = rect.top + this.f13840t;
            int i25 = (i13 - i11) - (z13 ? this.f13828f : this.H);
            int i26 = (i14 - i12) - this.K;
            if (TextUtils.isEmpty(collapsingTextHelper.H)) {
                this.N.u(i23, i24, i25, i26, true);
                collapsingTextHelper2.l(z11);
            } else {
                this.N.u(i23, i24, i25, (int) ((i26 - (collapsingTextHelper.i() + this.f13837n0)) - this.L), false);
                this.O.u(i23, (int) (collapsingTextHelper2.i() + this.f13836m0 + i24 + this.L), i25, i26, false);
                collapsingTextHelper2.l(z11);
                collapsingTextHelper.l(z11);
            }
        }
    }

    public final void f() {
        CharSequence title;
        ViewGroup viewGroup = this.f13822c;
        if (viewGroup == null || !this.Q) {
            return;
        }
        CharSequence subtitle = null;
        if (viewGroup instanceof Toolbar) {
            title = ((Toolbar) viewGroup).getTitle();
        } else {
            title = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
        }
        if (TextUtils.isEmpty(this.N.H) && !TextUtils.isEmpty(title)) {
            setTitle(title);
        }
        ViewGroup viewGroup2 = this.f13822c;
        if (viewGroup2 instanceof Toolbar) {
            subtitle = ((Toolbar) viewGroup2).getSubtitle();
        } else if (viewGroup2 instanceof android.widget.Toolbar) {
            subtitle = ((android.widget.Toolbar) viewGroup2).getSubtitle();
        }
        if (!TextUtils.isEmpty(this.O.H) || TextUtils.isEmpty(subtitle)) {
            return;
        }
        setSubtitle(subtitle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f13843a = 0;
        layoutParams.f13844b = 0.5f;
        return layoutParams;
    }

    public float getCollapsedSubtitleTextSize() {
        return this.O.f14630n;
    }

    public Typeface getCollapsedSubtitleTypeface() {
        Typeface typeface = this.O.f14650x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getCollapsedTitleGravity() {
        return this.N.f14627l;
    }

    public float getCollapsedTitleTextSize() {
        return this.N.f14630n;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.N.f14650x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.T;
    }

    public float getExpandedSubtitleTextSize() {
        return this.O.m;
    }

    public Typeface getExpandedSubtitleTypeface() {
        Typeface typeface = this.O.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getExpandedTitleGravity() {
        return this.N.f14625k;
    }

    public int getExpandedTitleMarginBottom() {
        return this.K;
    }

    public int getExpandedTitleMarginEnd() {
        return this.H;
    }

    public int getExpandedTitleMarginStart() {
        return this.f13828f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f13840t;
    }

    public int getExpandedTitleSpacing() {
        return this.L;
    }

    public float getExpandedTitleTextSize() {
        return this.N.m;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.N.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.N.f14641s0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.N.f14624j0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.N.f14624j0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.N.f14624j0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.N.f14633o0;
    }

    public int getScrimAlpha() {
        return this.V;
    }

    public long getScrimAnimationDuration() {
        return this.f13821b0;
    }

    public int getScrimVisibleHeightTrigger() {
        int i11 = this.f13827e0;
        if (i11 >= 0) {
            return i11 + this.f13834k0 + this.f13836m0 + this.f13837n0 + this.f13839p0;
        }
        v1 v1Var = this.f13833j0;
        int iD = v1Var != null ? v1Var.d() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iD, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.U;
    }

    public CharSequence getSubtitle() {
        if (this.Q) {
            return this.O.H;
        }
        return null;
    }

    public CharSequence getTitle() {
        if (this.Q) {
            return this.N.H;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f13832i0;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.N.W;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.N.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f13832i0 == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.f13829f0 == null) {
                this.f13829f0 = new OffsetUpdateListener();
            }
            AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = this.f13829f0;
            if (appBarLayout.H == null) {
                appBarLayout.H = new ArrayList();
            }
            if (onOffsetChangedListener != null && !appBarLayout.H.contains(onOffsetChangedListener)) {
                appBarLayout.H.add(onOffsetChangedListener);
            }
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CollapsingTextHelper collapsingTextHelper = this.N;
        collapsingTextHelper.k(configuration);
        if (this.f13831h0 != configuration.orientation && this.f13838o0 && collapsingTextHelper.f14607b == 1.0f) {
            ViewParent parent = getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.getPendingAction() == 0) {
                    appBarLayout.setPendingAction(2);
                }
            }
        }
        this.f13831h0 = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = this.f13829f0;
        if (onOffsetChangedListener != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).H) != null) {
            arrayList.remove(onOffsetChangedListener);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        v1 v1Var = this.f13833j0;
        if (v1Var != null) {
            int iD = v1Var.d();
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iD) {
                    WeakHashMap weakHashMap = s0.f58893a;
                    childAt.offsetTopAndBottom(iD);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i16 = 0; i16 < childCount2; i16++) {
            ViewOffsetHelper viewOffsetHelperB = b(getChildAt(i16));
            View view = viewOffsetHelperB.f13861a;
            viewOffsetHelperB.f13862b = view.getTop();
            viewOffsetHelperB.f13863c = view.getLeft();
        }
        e(i11, i12, i13, i14, false);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i17 = 0; i17 < childCount3; i17++) {
            b(getChildAt(i17)).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i12);
        v1 v1Var = this.f13833j0;
        int iD = v1Var != null ? v1Var.d() : 0;
        if ((mode == 0 || this.f13835l0) && iD > 0) {
            this.f13834k0 = iD;
            super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iD, 1073741824));
        }
        f();
        if (this.Q) {
            CollapsingTextHelper collapsingTextHelper = this.N;
            if (TextUtils.isEmpty(collapsingTextHelper.H)) {
                collapsingToolbarLayout = this;
            } else {
                int measuredHeight3 = getMeasuredHeight();
                collapsingToolbarLayout = this;
                collapsingToolbarLayout.e(0, 0, getMeasuredWidth(), measuredHeight3, true);
                float fI = collapsingTextHelper.i() + collapsingToolbarLayout.f13834k0 + collapsingToolbarLayout.f13840t;
                CollapsingTextHelper collapsingTextHelper2 = collapsingToolbarLayout.O;
                int i13 = (int) (fI + (TextUtils.isEmpty(collapsingTextHelper2.H) ? CropImageView.DEFAULT_ASPECT_RATIO : collapsingToolbarLayout.L + collapsingTextHelper2.i()) + collapsingToolbarLayout.K);
                if (i13 > measuredHeight3) {
                    collapsingToolbarLayout.f13839p0 = i13 - measuredHeight3;
                } else {
                    collapsingToolbarLayout.f13839p0 = 0;
                }
                if (collapsingToolbarLayout.f13838o0) {
                    if (collapsingTextHelper.f14633o0 > 1) {
                        int i14 = collapsingTextHelper.f14636q;
                        if (i14 > 1) {
                            collapsingToolbarLayout.f13836m0 = (i14 - 1) * Math.round(collapsingTextHelper.i());
                        } else {
                            collapsingToolbarLayout.f13836m0 = 0;
                        }
                    }
                    if (collapsingTextHelper2.f14633o0 > 1) {
                        int i15 = collapsingTextHelper2.f14636q;
                        if (i15 > 1) {
                            collapsingToolbarLayout.f13837n0 = (i15 - 1) * Math.round(collapsingTextHelper2.i());
                        } else {
                            collapsingToolbarLayout.f13837n0 = 0;
                        }
                    }
                }
                int i16 = collapsingToolbarLayout.f13839p0;
                int i17 = collapsingToolbarLayout.f13836m0;
                int i18 = collapsingToolbarLayout.f13837n0;
                if (i16 + i17 + i18 > 0) {
                    super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(measuredHeight3 + i16 + i17 + i18, 1073741824));
                }
            }
        } else {
            collapsingToolbarLayout = this;
        }
        ViewGroup viewGroup = collapsingToolbarLayout.f13822c;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.f13824d;
            if (view == null || view == collapsingToolbarLayout) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                }
                setMinimumHeight(measuredHeight);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight2 = view.getMeasuredHeight();
            }
            setMinimumHeight(measuredHeight2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        Drawable drawable = this.T;
        if (drawable != null) {
            ViewGroup viewGroup = this.f13822c;
            if (this.f13832i0 == 1 && viewGroup != null && this.Q) {
                i12 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i11, i12);
        }
    }

    public void setCollapsedSubtitleTextAppearance(int i11) {
        this.O.q(i11);
    }

    public void setCollapsedSubtitleTextColor(int i11) {
        setCollapsedSubtitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setCollapsedSubtitleTextSize(float f5) {
        CollapsingTextHelper collapsingTextHelper = this.O;
        if (collapsingTextHelper.f14630n != f5) {
            collapsingTextHelper.f14630n = f5;
            collapsingTextHelper.l(false);
        }
    }

    public void setCollapsedSubtitleTypeface(Typeface typeface) {
        CollapsingTextHelper collapsingTextHelper = this.O;
        if (collapsingTextHelper.t(typeface)) {
            collapsingTextHelper.l(false);
        }
    }

    public void setCollapsedTitleGravity(int i11) {
        this.N.s(i11);
        this.O.s(i11);
    }

    public void setCollapsedTitleTextAppearance(int i11) {
        this.N.q(i11);
    }

    public void setCollapsedTitleTextColor(int i11) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setCollapsedTitleTextSize(float f5) {
        CollapsingTextHelper collapsingTextHelper = this.N;
        if (collapsingTextHelper.f14630n != f5) {
            collapsingTextHelper.f14630n = f5;
            collapsingTextHelper.l(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        CollapsingTextHelper collapsingTextHelper = this.N;
        if (collapsingTextHelper.t(typeface)) {
            collapsingTextHelper.l(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.T;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.T = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f13822c;
                if (this.f13832i0 == 1 && viewGroup != null && this.Q) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.T.setCallback(this);
                this.T.setAlpha(this.V);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i11) {
        setContentScrim(new ColorDrawable(i11));
    }

    public void setContentScrimResource(int i11) {
        setContentScrim(getContext().getDrawable(i11));
    }

    public void setExpandedSubtitleColor(int i11) {
        setExpandedSubtitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setExpandedSubtitleTextAppearance(int i11) {
        this.O.w(i11);
    }

    public void setExpandedSubtitleTextColor(ColorStateList colorStateList) {
        CollapsingTextHelper collapsingTextHelper = this.O;
        if (collapsingTextHelper.f14632o != colorStateList) {
            collapsingTextHelper.f14632o = colorStateList;
            collapsingTextHelper.l(false);
        }
    }

    public void setExpandedSubtitleTextSize(float f5) {
        this.O.y(f5);
    }

    public void setExpandedSubtitleTypeface(Typeface typeface) {
        CollapsingTextHelper collapsingTextHelper = this.O;
        if (collapsingTextHelper.z(typeface)) {
            collapsingTextHelper.l(false);
        }
    }

    public void setExpandedTitleColor(int i11) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setExpandedTitleGravity(int i11) {
        this.N.x(i11);
        this.O.x(i11);
    }

    public void setExpandedTitleMarginBottom(int i11) {
        this.K = i11;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i11) {
        this.H = i11;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i11) {
        this.f13828f = i11;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i11) {
        this.f13840t = i11;
        requestLayout();
    }

    public void setExpandedTitleSpacing(int i11) {
        this.L = i11;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i11) {
        this.N.w(i11);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        CollapsingTextHelper collapsingTextHelper = this.N;
        if (collapsingTextHelper.f14632o != colorStateList) {
            collapsingTextHelper.f14632o = colorStateList;
            collapsingTextHelper.l(false);
        }
    }

    public void setExpandedTitleTextSize(float f5) {
        this.N.y(f5);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        CollapsingTextHelper collapsingTextHelper = this.N;
        if (collapsingTextHelper.z(typeface)) {
            collapsingTextHelper.l(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z11) {
        this.f13838o0 = z11;
    }

    public void setForceApplySystemWindowInsetTop(boolean z11) {
        this.f13835l0 = z11;
    }

    public void setHyphenationFrequency(int i11) {
        this.N.f14641s0 = i11;
    }

    public void setLineSpacingAdd(float f5) {
        this.N.f14637q0 = f5;
    }

    public void setLineSpacingMultiplier(float f5) {
        this.N.f14639r0 = f5;
    }

    public void setMaxLines(int i11) {
        this.N.v(i11);
        this.O.v(i11);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z11) {
        this.N.K = z11;
    }

    public void setScrimAlpha(int i11) {
        ViewGroup viewGroup;
        if (i11 != this.V) {
            if (this.T != null && (viewGroup = this.f13822c) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.V = i11;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j11) {
        this.f13821b0 = j11;
    }

    public void setScrimVisibleHeightTrigger(int i11) {
        if (this.f13827e0 != i11) {
            this.f13827e0 = i11;
            d();
        }
    }

    public void setScrimsShown(boolean z11) {
        boolean z12 = isLaidOut() && !isInEditMode();
        if (this.W != z11) {
            if (z12) {
                int i11 = z11 ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.f13819a0;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f13819a0 = valueAnimator2;
                    valueAnimator2.setInterpolator(i11 > this.V ? this.f13823c0 : this.f13825d0);
                    this.f13819a0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.2
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                        }
                    });
                } else if (valueAnimator.isRunning()) {
                    this.f13819a0.cancel();
                }
                this.f13819a0.setDuration(this.f13821b0);
                this.f13819a0.setIntValues(this.V, i11);
                this.f13819a0.start();
            } else {
                setScrimAlpha(z11 ? 255 : 0);
            }
            this.W = z11;
        }
    }

    public void setStaticLayoutBuilderConfigurer(StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        CollapsingTextHelper collapsingTextHelper = this.N;
        if (collapsingTextHelper.f14643t0 != staticLayoutBuilderConfigurer) {
            collapsingTextHelper.f14643t0 = staticLayoutBuilderConfigurer;
            collapsingTextHelper.l(true);
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.U;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.U = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.U.setState(getDrawableState());
                }
                this.U.setLayoutDirection(getLayoutDirection());
                this.U.setVisible(getVisibility() == 0, false);
                this.U.setCallback(this);
                this.U.setAlpha(this.V);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i11) {
        setStatusBarScrim(new ColorDrawable(i11));
    }

    public void setStatusBarScrimResource(int i11) {
        setStatusBarScrim(getContext().getDrawable(i11));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.O.B(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.N.B(charSequence);
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i11) {
        this.f13832i0 = i11;
        boolean z11 = i11 == 1;
        this.N.f14609c = z11;
        this.O.f14609c = z11;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f13832i0 == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z11 && this.T == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        CollapsingTextHelper collapsingTextHelper = this.N;
        collapsingTextHelper.G = truncateAt;
        collapsingTextHelper.l(false);
    }

    public void setTitleEnabled(boolean z11) {
        if (z11 != this.Q) {
            this.Q = z11;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        CollapsingTextHelper collapsingTextHelper = this.N;
        collapsingTextHelper.W = timeInterpolator;
        collapsingTextHelper.l(false);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.U;
        if (drawable != null && drawable.isVisible() != z11) {
            this.U.setVisible(z11, false);
        }
        Drawable drawable2 = this.T;
        if (drawable2 == null || drawable2.isVisible() == z11) {
            return;
        }
        this.T.setVisible(z11, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.T || drawable == this.U;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f13843a = 0;
        layoutParams.f13844b = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.f13756o);
        layoutParams.f13843a = typedArrayObtainStyledAttributes.getInt(0, 0);
        layoutParams.f13844b = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setCollapsedSubtitleTextColor(ColorStateList colorStateList) {
        this.O.r(colorStateList);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.N.r(colorStateList);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i11) {
        ColorStateList colorStateListA;
        ColorStateList colorStateListA2;
        TextUtils.TruncateAt truncateAt;
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_Design_CollapsingToolbar), attributeSet, i11);
        this.f13818a = true;
        this.M = new Rect();
        this.f13827e0 = -1;
        this.f13834k0 = 0;
        this.f13836m0 = 0;
        this.f13837n0 = 0;
        this.f13839p0 = 0;
        Context context2 = getContext();
        this.f13831h0 = getResources().getConfiguration().orientation;
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.N = collapsingTextHelper;
        DecelerateInterpolator decelerateInterpolator = AnimationUtils.f13772e;
        collapsingTextHelper.X = decelerateInterpolator;
        collapsingTextHelper.l(false);
        collapsingTextHelper.K = false;
        this.P = new ElevationOverlayProvider(context2);
        ThemeEnforcement.a(context2, attributeSet, i11, R.style.Widget_Design_CollapsingToolbar);
        int[] iArr = com.google.android.material.R.styleable.f13754n;
        ThemeEnforcement.b(context2, attributeSet, iArr, i11, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i11, R.style.Widget_Design_CollapsingToolbar);
        int i12 = typedArrayObtainStyledAttributes.getInt(9, 8388691);
        int i13 = typedArrayObtainStyledAttributes.getInt(2, 8388627);
        this.S = typedArrayObtainStyledAttributes.getInt(3, 1);
        collapsingTextHelper.x(i12);
        collapsingTextHelper.s(i13);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.K = dimensionPixelSize;
        this.H = dimensionPixelSize;
        this.f13840t = dimensionPixelSize;
        this.f13828f = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            this.f13828f = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            this.f13840t = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0);
        }
        this.Q = typedArrayObtainStyledAttributes.getBoolean(28, true);
        setTitle(typedArrayObtainStyledAttributes.getText(26));
        collapsingTextHelper.w(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        collapsingTextHelper.q(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            collapsingTextHelper.w(typedArrayObtainStyledAttributes.getResourceId(16, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            collapsingTextHelper.q(typedArrayObtainStyledAttributes.getResourceId(4, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(31)) {
            int i14 = typedArrayObtainStyledAttributes.getInt(31, -1);
            if (i14 == 0) {
                truncateAt = TextUtils.TruncateAt.START;
            } else if (i14 == 1) {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            } else if (i14 != 3) {
                truncateAt = TextUtils.TruncateAt.END;
            } else {
                truncateAt = TextUtils.TruncateAt.MARQUEE;
            }
            setTitleEllipsize(truncateAt);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17) && collapsingTextHelper.f14632o != (colorStateListA2 = MaterialResources.a(context2, typedArrayObtainStyledAttributes, 17))) {
            collapsingTextHelper.f14632o = colorStateListA2;
            collapsingTextHelper.l(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            collapsingTextHelper.r(MaterialResources.a(context2, typedArrayObtainStyledAttributes, 5));
        }
        this.f13827e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(22, -1);
        if (typedArrayObtainStyledAttributes.hasValue(29)) {
            collapsingTextHelper.v(typedArrayObtainStyledAttributes.getInt(29, 1));
        } else if (typedArrayObtainStyledAttributes.hasValue(20)) {
            collapsingTextHelper.v(typedArrayObtainStyledAttributes.getInt(20, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(30)) {
            collapsingTextHelper.W = android.view.animation.AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(30, 0));
            collapsingTextHelper.l(false);
        }
        CollapsingTextHelper collapsingTextHelper2 = new CollapsingTextHelper(this);
        this.O = collapsingTextHelper2;
        collapsingTextHelper2.X = decelerateInterpolator;
        collapsingTextHelper2.l(false);
        collapsingTextHelper2.K = false;
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            setSubtitle(typedArrayObtainStyledAttributes.getText(24));
        }
        collapsingTextHelper2.x(i12);
        collapsingTextHelper2.s(i13);
        collapsingTextHelper2.w(R.style.TextAppearance_AppCompat_Headline);
        collapsingTextHelper2.q(R.style.TextAppearance_AppCompat_Widget_ActionBar_Subtitle);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            collapsingTextHelper2.w(typedArrayObtainStyledAttributes.getResourceId(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            collapsingTextHelper2.q(typedArrayObtainStyledAttributes.getResourceId(0, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(8) && collapsingTextHelper2.f14632o != (colorStateListA = MaterialResources.a(context2, typedArrayObtainStyledAttributes, 8))) {
            collapsingTextHelper2.f14632o = colorStateListA;
            collapsingTextHelper2.l(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            collapsingTextHelper2.r(MaterialResources.a(context2, typedArrayObtainStyledAttributes, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(25)) {
            collapsingTextHelper2.v(typedArrayObtainStyledAttributes.getInt(25, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(30)) {
            collapsingTextHelper2.W = android.view.animation.AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(30, 0));
            collapsingTextHelper2.l(false);
        }
        this.f13821b0 = typedArrayObtainStyledAttributes.getInt(21, 600);
        this.f13823c0 = MotionUtils.d(context2, R.attr.motionEasingStandardInterpolator, AnimationUtils.f13770c);
        this.f13825d0 = MotionUtils.d(context2, R.attr.motionEasingStandardInterpolator, AnimationUtils.f13771d);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(6));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(23));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(27, 0));
        this.f13820b = typedArrayObtainStyledAttributes.getResourceId(32, -1);
        this.f13835l0 = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.f13838o0 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        u uVar = new u() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.1
            @Override // z4.u
            public final v1 e(View view, v1 v1Var) {
                CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
                v1 v1Var2 = collapsingToolbarLayout.getFitsSystemWindows() ? v1Var : null;
                if (!Objects.equals(collapsingToolbarLayout.f13833j0, v1Var2)) {
                    collapsingToolbarLayout.f13833j0 = v1Var2;
                    collapsingToolbarLayout.requestLayout();
                }
                return v1Var.f58905a.c();
            }
        };
        WeakHashMap weakHashMap = s0.f58893a;
        j0.m(this, uVar);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f13843a = 0;
        layoutParams.f13844b = 0.5f;
        return layoutParams;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2 = new LayoutParams(layoutParams);
        layoutParams2.f13843a = 0;
        layoutParams2.f13844b = 0.5f;
        return layoutParams2;
    }
}
