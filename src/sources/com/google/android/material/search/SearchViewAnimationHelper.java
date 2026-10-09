package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.FadeThroughUpdateListener;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.RectEvaluator;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class SearchViewAnimationHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchView f15137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f15138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f15139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f15140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f15141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MaterialToolbar f15142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Toolbar f15143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearLayout f15144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f15145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final EditText f15146j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageButton f15147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f15148l;
    public final TouchObserverFrameLayout m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MaterialMainContainerBackHelper f15149n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AnimatorSet f15150o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SearchBar f15151p;

    public SearchViewAnimationHelper(SearchView searchView) {
        this.f15137a = searchView;
        this.f15138b = searchView.f15118a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.f15120b;
        this.f15139c = clippableRoundedCornerLayout;
        this.f15140d = searchView.f15126e;
        this.f15141e = searchView.f15128f;
        this.f15142f = searchView.f15133t;
        this.f15143g = searchView.H;
        this.f15145i = searchView.K;
        this.f15146j = searchView.M;
        this.f15147k = searchView.N;
        this.f15148l = searchView.O;
        this.m = searchView.P;
        this.f15144h = searchView.L;
        this.f15149n = new MaterialMainContainerBackHelper(clippableRoundedCornerLayout);
    }

    public static void a(SearchViewAnimationHelper searchViewAnimationHelper, float f5) {
        ActionMenuView actionMenuViewA;
        searchViewAnimationHelper.f15147k.setAlpha(f5);
        searchViewAnimationHelper.f15148l.setAlpha(f5);
        searchViewAnimationHelper.m.setAlpha(f5);
        if (!searchViewAnimationHelper.f15137a.f15123c0 || (actionMenuViewA = ToolbarUtils.a(searchViewAnimationHelper.f15142f)) == null) {
            return;
        }
        actionMenuViewA.setAlpha(f5);
    }

    public static AnimatorSet i(boolean z11, View view, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i11, CropImageView.DEFAULT_ASPECT_RATIO);
        valueAnimatorOfFloat.addUpdateListener(new MultiViewUpdateListener(new com.google.android.material.internal.a(0), view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(i12, CropImageView.DEFAULT_ASPECT_RATIO);
        valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.a(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z11 ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.a(z11, AnimationUtils.f13769b));
        return animatorSet;
    }

    public final void b(AnimatorSet animatorSet) {
        ImageButton imageButtonB = ToolbarUtils.b(this.f15142f);
        if (imageButtonB == null) {
            return;
        }
        Drawable drawableI0 = ub.a.i0(imageButtonB.getDrawable());
        if (!this.f15137a.f15121b0) {
            if (drawableI0 instanceof n.b) {
                n.b bVar = (n.b) drawableI0;
                if (bVar.f42907i != 1.0f) {
                    bVar.f42907i = 1.0f;
                    bVar.invalidateSelf();
                }
            }
            if (drawableI0 instanceof FadeThroughDrawable) {
                ((FadeThroughDrawable) drawableI0).a(1.0f);
                return;
            }
            return;
        }
        if (drawableI0 instanceof n.b) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new j((n.b) drawableI0, 1));
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
        if (drawableI0 instanceof FadeThroughDrawable) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new j((FadeThroughDrawable) drawableI0, 2));
            animatorSet.playTogether(valueAnimatorOfFloat2);
        }
        SearchBar searchBar = this.f15151p;
        if (searchBar == null || searchBar.getNavigationIcon() != null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        valueAnimatorOfFloat3.addUpdateListener(new j(imageButtonB, 3));
        animatorSet.playTogether(valueAnimatorOfFloat3);
    }

    public final void c() {
        SearchBar searchBar = this.f15151p;
        MaterialMainContainerBackHelper materialMainContainerBackHelper = this.f15149n;
        f.a aVar = materialMainContainerBackHelper.f14795f;
        materialMainContainerBackHelper.f14795f = null;
        if (aVar != null) {
            AnimatorSet animatorSetA = materialMainContainerBackHelper.a(searchBar);
            View view = materialMainContainerBackHelper.f14791b;
            if (view instanceof ClippableRoundedCornerLayout) {
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) view;
                ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new com.google.android.material.motion.b(), clippableRoundedCornerLayout.getCornerRadii(), materialMainContainerBackHelper.b());
                valueAnimatorOfObject.addUpdateListener(new com.google.android.material.motion.c(clippableRoundedCornerLayout, 0));
                animatorSetA.playTogether(valueAnimatorOfObject);
            }
            animatorSetA.setDuration(materialMainContainerBackHelper.f14794e);
            animatorSetA.start();
            materialMainContainerBackHelper.f14807i = CropImageView.DEFAULT_ASPECT_RATIO;
            materialMainContainerBackHelper.f14808j = null;
            materialMainContainerBackHelper.f14809k = null;
        }
        AnimatorSet animatorSet = this.f15150o;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.f15150o = null;
    }

    public final AnimatorSet d(boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        MaterialToolbar materialToolbar = this.f15142f;
        ImageButton imageButtonB = ToolbarUtils.b(materialToolbar);
        if (imageButtonB != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(k(ToolbarUtils.b(this.f15151p), imageButtonB), CropImageView.DEFAULT_ASPECT_RATIO);
            valueAnimatorOfFloat.addUpdateListener(new MultiViewUpdateListener(new com.google.android.material.internal.a(0), imageButtonB));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(g(), CropImageView.DEFAULT_ASPECT_RATIO);
            valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.a(imageButtonB));
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        }
        ActionMenuView actionMenuViewA = ToolbarUtils.a(materialToolbar);
        if (actionMenuViewA != null) {
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(k(ToolbarUtils.a(this.f15151p), actionMenuViewA), CropImageView.DEFAULT_ASPECT_RATIO);
            valueAnimatorOfFloat3.addUpdateListener(new MultiViewUpdateListener(new com.google.android.material.internal.a(0), actionMenuViewA));
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(g(), CropImageView.DEFAULT_ASPECT_RATIO);
            valueAnimatorOfFloat4.addUpdateListener(MultiViewUpdateListener.a(actionMenuViewA));
            animatorSet.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        }
        animatorSet.setDuration(z11 ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.a(z11, AnimationUtils.f13769b));
        return animatorSet;
    }

    public final AnimatorSet e(final boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f15150o == null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            b(animatorSet2);
            animatorSet2.setDuration(z11 ? 300L : 250L);
            animatorSet2.setInterpolator(ReversableAnimatedValueInterpolator.a(z11, AnimationUtils.f13769b));
            animatorSet.playTogether(animatorSet2, d(z11));
        }
        TimeInterpolator timeInterpolator = z11 ? AnimationUtils.f13768a : AnimationUtils.f13769b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        valueAnimatorOfFloat.setDuration(z11 ? 300L : 250L);
        valueAnimatorOfFloat.setStartDelay(z11 ? 100L : 0L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.a(z11, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(new MultiViewUpdateListener(new com.google.android.material.internal.a(3), this.f15138b));
        MaterialMainContainerBackHelper materialMainContainerBackHelper = this.f15149n;
        Rect rect = materialMainContainerBackHelper.f14808j;
        Rect rectA = materialMainContainerBackHelper.f14809k;
        SearchView searchView = this.f15137a;
        if (rect == null) {
            rect = new Rect(searchView.getLeft(), searchView.getTop(), searchView.getRight(), searchView.getBottom());
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f15139c;
        if (rectA == null) {
            rectA = ViewUtils.a(clippableRoundedCornerLayout, this.f15151p);
        }
        final Rect rect2 = new Rect(rectA);
        final float cornerSize = this.f15151p.getCornerSize();
        float[] cornerRadii = clippableRoundedCornerLayout.getCornerRadii();
        float[] fArrB = materialMainContainerBackHelper.b();
        final float[] fArr = {Math.max(cornerRadii[0], fArrB[0]), Math.max(cornerRadii[1], fArrB[1]), Math.max(cornerRadii[2], fArrB[2]), Math.max(cornerRadii[3], fArrB[3]), Math.max(cornerRadii[4], fArrB[4]), Math.max(cornerRadii[5], fArrB[5]), Math.max(cornerRadii[6], fArrB[6]), Math.max(cornerRadii[7], fArrB[7])};
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new RectEvaluator(rect2), rectA, rect);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SearchViewAnimationHelper searchViewAnimationHelper = this.f15172a;
                searchViewAnimationHelper.getClass();
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float[] fArr2 = fArr;
                float f5 = fArr2[0];
                float f11 = cornerSize;
                float[] fArr3 = {AnimationUtils.a(f11, f5, animatedFraction), AnimationUtils.a(f11, fArr2[1], animatedFraction), AnimationUtils.a(f11, fArr2[2], animatedFraction), AnimationUtils.a(f11, fArr2[3], animatedFraction), AnimationUtils.a(f11, fArr2[4], animatedFraction), AnimationUtils.a(f11, fArr2[5], animatedFraction), AnimationUtils.a(f11, fArr2[6], animatedFraction), AnimationUtils.a(f11, fArr2[7], animatedFraction)};
                ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = searchViewAnimationHelper.f15139c;
                clippableRoundedCornerLayout2.getClass();
                Rect rect3 = rect2;
                clippableRoundedCornerLayout2.a(rect3.left, rect3.top, rect3.right, rect3.bottom, fArr3);
            }
        });
        valueAnimatorOfObject.setDuration(z11 ? 300L : 250L);
        r6.a aVar = AnimationUtils.f13769b;
        valueAnimatorOfObject.setInterpolator(ReversableAnimatedValueInterpolator.a(z11, aVar));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        valueAnimatorOfFloat2.setDuration(z11 ? 50L : 42L);
        valueAnimatorOfFloat2.setStartDelay(z11 ? 250L : 0L);
        LinearInterpolator linearInterpolator = AnimationUtils.f13768a;
        valueAnimatorOfFloat2.setInterpolator(ReversableAnimatedValueInterpolator.a(z11, linearInterpolator));
        valueAnimatorOfFloat2.addUpdateListener(new MultiViewUpdateListener(new com.google.android.material.internal.a(3), this.f15147k));
        AnimatorSet animatorSet3 = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        valueAnimatorOfFloat3.setDuration(z11 ? 150L : 83L);
        valueAnimatorOfFloat3.setStartDelay(z11 ? 75L : 0L);
        valueAnimatorOfFloat3.setInterpolator(ReversableAnimatedValueInterpolator.a(z11, linearInterpolator));
        View view = this.f15148l;
        TouchObserverFrameLayout touchObserverFrameLayout = this.m;
        valueAnimatorOfFloat3.addUpdateListener(new MultiViewUpdateListener(new com.google.android.material.internal.a(3), view, touchObserverFrameLayout));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat((touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        valueAnimatorOfFloat4.setDuration(z11 ? 300L : 250L);
        valueAnimatorOfFloat4.setInterpolator(ReversableAnimatedValueInterpolator.a(z11, aVar));
        valueAnimatorOfFloat4.addUpdateListener(MultiViewUpdateListener.a(view));
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat5.setDuration(z11 ? 300L : 250L);
        valueAnimatorOfFloat5.setInterpolator(ReversableAnimatedValueInterpolator.a(z11, aVar));
        valueAnimatorOfFloat5.addUpdateListener(new MultiViewUpdateListener(new com.google.android.material.internal.a(2), touchObserverFrameLayout));
        animatorSet3.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4, valueAnimatorOfFloat5);
        View view2 = this.f15140d;
        AnimatorSet animatorSetI = i(z11, view2, f(view2), g());
        Toolbar toolbar = this.f15143g;
        Animator animatorI = i(z11, toolbar, f(toolbar), g());
        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        valueAnimatorOfFloat6.setDuration(z11 ? 300L : 250L);
        valueAnimatorOfFloat6.setInterpolator(ReversableAnimatedValueInterpolator.a(z11, aVar));
        if (searchView.f15123c0) {
            valueAnimatorOfFloat6.addUpdateListener(new FadeThroughUpdateListener(ToolbarUtils.a(toolbar), ToolbarUtils.a(this.f15142f)));
        }
        EditText editText = this.f15146j;
        Animator animatorJ = j(editText, z11);
        Animator animatorJ2 = j(this.f15145i, z11);
        AnimatorSet animatorSet4 = new AnimatorSet();
        if (this.f15151p != null && !TextUtils.equals(editText.getText(), this.f15151p.getText())) {
            ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
            valueAnimatorOfFloat7.addUpdateListener(new j(this, 0));
            animatorSet4.playTogether(valueAnimatorOfFloat7);
        }
        if (this.f15151p != null && TextUtils.equals(editText.getText(), this.f15151p.getText())) {
            final Rect rect3 = new Rect(0, 0, editText.getWidth(), editText.getHeight());
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f15151p.getTextView().getWidth(), editText.getWidth());
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.h
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SearchViewAnimationHelper searchViewAnimationHelper = this.f15170a;
                    searchViewAnimationHelper.getClass();
                    int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    Rect rect4 = rect3;
                    rect4.right = iIntValue;
                    searchViewAnimationHelper.f15146j.setClipBounds(rect4);
                }
            });
            animatorSet4.playTogether(valueAnimatorOfInt);
        }
        animatorSet4.setDuration(z11 ? 300L : 250L);
        animatorSet4.setInterpolator(ReversableAnimatedValueInterpolator.a(z11, linearInterpolator));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfObject, valueAnimatorOfFloat2, animatorSet3, animatorSetI, animatorI, valueAnimatorOfFloat6, animatorJ, animatorJ2, animatorSet4);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                SearchViewAnimationHelper searchViewAnimationHelper = SearchViewAnimationHelper.this;
                EditText editText2 = searchViewAnimationHelper.f15146j;
                boolean z12 = z11;
                SearchViewAnimationHelper.a(searchViewAnimationHelper, z12 ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO);
                editText2.setAlpha(1.0f);
                SearchBar searchBar = searchViewAnimationHelper.f15151p;
                if (searchBar != null) {
                    searchBar.getTextView().setAlpha(1.0f);
                }
                editText2.setClipBounds(null);
                ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = searchViewAnimationHelper.f15139c;
                clippableRoundedCornerLayout2.f14603a = null;
                clippableRoundedCornerLayout2.f14604b = new float[]{CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO};
                clippableRoundedCornerLayout2.invalidate();
                if (z12) {
                    return;
                }
                searchViewAnimationHelper.f15149n.f14810l = null;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.a(SearchViewAnimationHelper.this, z11 ? CropImageView.DEFAULT_ASPECT_RATIO : 1.0f);
            }
        });
        return animatorSet;
    }

    public final int f(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        int iL = l(this.f15151p);
        return ViewUtils.g(this.f15151p) ? iL - marginEnd : ((this.f15151p.getWidth() + iL) + marginEnd) - this.f15137a.getWidth();
    }

    public final int g() {
        FrameLayout frameLayout = this.f15141e;
        int height = (frameLayout.getHeight() / 2) + frameLayout.getTop();
        SearchBar searchBar = this.f15151p;
        int top = searchBar.getTop();
        for (ViewParent parent = searchBar.getParent(); (parent instanceof View) && parent != this.f15137a.getParent(); parent = parent.getParent()) {
            top += ((View) parent).getTop();
        }
        return ((this.f15151p.getHeight() / 2) + top) - height;
    }

    public final AnimatorSet h(boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f15139c;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), CropImageView.DEFAULT_ASPECT_RATIO);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.a(clippableRoundedCornerLayout));
        animatorSet.playTogether(valueAnimatorOfFloat);
        b(animatorSet);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.a(z11, AnimationUtils.f13769b));
        animatorSet.setDuration(z11 ? 350L : 300L);
        return animatorSet;
    }

    public final AnimatorSet j(View view, boolean z11) {
        TextView placeholderTextView = this.f15151p.getPlaceholderTextView();
        if (TextUtils.isEmpty(placeholderTextView.getText()) || z11) {
            placeholderTextView = this.f15151p.getTextView();
        }
        return i(z11, view, l(placeholderTextView) - (this.f15144h.getLeft() + view.getLeft()), g());
    }

    public final int k(View view, View view2) {
        if (view != null) {
            return l(view) - l(view2);
        }
        int marginStart = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
        int paddingStart = this.f15151p.getPaddingStart();
        int iL = l(this.f15151p);
        return ViewUtils.g(this.f15151p) ? (((this.f15151p.getWidth() + iL) + marginStart) - paddingStart) - this.f15137a.getRight() : (iL - marginStart) + paddingStart;
    }

    public final int l(View view) {
        int left = view.getLeft();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.f15137a.getParent(); parent = parent.getParent()) {
            left += ((View) parent).getLeft();
        }
        return left;
    }

    public final AnimatorSet m() {
        SearchBar searchBar = this.f15151p;
        SearchView searchView = this.f15137a;
        if (searchBar != null) {
            if (searchView.j()) {
                searchView.h();
            }
            AnimatorSet animatorSetE = e(false);
            animatorSetE.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    SearchViewAnimationHelper searchViewAnimationHelper = SearchViewAnimationHelper.this;
                    searchViewAnimationHelper.f15139c.setVisibility(8);
                    if (!searchViewAnimationHelper.f15137a.j()) {
                        searchViewAnimationHelper.f15137a.h();
                    }
                    searchViewAnimationHelper.f15137a.setTransitionState(SearchView.TransitionState.HIDDEN);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    SearchViewAnimationHelper.this.f15137a.setTransitionState(SearchView.TransitionState.HIDING);
                }
            });
            animatorSetE.start();
            return animatorSetE;
        }
        if (searchView.j()) {
            searchView.h();
        }
        AnimatorSet animatorSetH = h(false);
        animatorSetH.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                SearchViewAnimationHelper searchViewAnimationHelper = SearchViewAnimationHelper.this;
                searchViewAnimationHelper.f15139c.setVisibility(8);
                if (!searchViewAnimationHelper.f15137a.j()) {
                    searchViewAnimationHelper.f15137a.h();
                }
                searchViewAnimationHelper.f15137a.setTransitionState(SearchView.TransitionState.HIDDEN);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.f15137a.setTransitionState(SearchView.TransitionState.HIDING);
            }
        });
        animatorSetH.start();
        return animatorSetH;
    }

    public final void n(f.a aVar) {
        float f5 = aVar.f26117c;
        if (f5 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        SearchBar searchBar = this.f15151p;
        float cornerSize = searchBar.getCornerSize();
        MaterialMainContainerBackHelper materialMainContainerBackHelper = this.f15149n;
        f.a aVar2 = materialMainContainerBackHelper.f14795f;
        materialMainContainerBackHelper.f14795f = aVar;
        if (aVar2 != null) {
            if (searchBar.getVisibility() != 4) {
                searchBar.setVisibility(4);
            }
            boolean z11 = aVar.f26118d == 0;
            float f11 = aVar.f26116b;
            float f12 = materialMainContainerBackHelper.f14805g;
            float interpolation = materialMainContainerBackHelper.f14790a.getInterpolation(f5);
            View view = materialMainContainerBackHelper.f14791b;
            float width = view.getWidth();
            float height = view.getHeight();
            if (width > CropImageView.DEFAULT_ASPECT_RATIO && height > CropImageView.DEFAULT_ASPECT_RATIO) {
                float fA = AnimationUtils.a(1.0f, 0.9f, interpolation);
                float fA2 = AnimationUtils.a(CropImageView.DEFAULT_ASPECT_RATIO, Math.max(CropImageView.DEFAULT_ASPECT_RATIO, ((width - (0.9f * width)) / 2.0f) - f12), interpolation) * (z11 ? 1 : -1);
                float fMin = Math.min(Math.max(CropImageView.DEFAULT_ASPECT_RATIO, ((height - (fA * height)) / 2.0f) - f12), materialMainContainerBackHelper.f14806h);
                float f13 = f11 - materialMainContainerBackHelper.f14807i;
                float fA3 = AnimationUtils.a(CropImageView.DEFAULT_ASPECT_RATIO, fMin, Math.abs(f13) / height) * Math.signum(f13);
                if (!Float.isNaN(fA) && !Float.isNaN(fA2) && !Float.isNaN(fA3)) {
                    view.setScaleX(fA);
                    view.setScaleY(fA);
                    view.setTranslationX(fA2);
                    view.setTranslationY(fA3);
                    if (view instanceof ClippableRoundedCornerLayout) {
                        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) view;
                        float[] fArrB = materialMainContainerBackHelper.b();
                        clippableRoundedCornerLayout.a(clippableRoundedCornerLayout.getLeft(), clippableRoundedCornerLayout.getTop(), clippableRoundedCornerLayout.getRight(), clippableRoundedCornerLayout.getBottom(), new float[]{AnimationUtils.a(fArrB[0], cornerSize, interpolation), AnimationUtils.a(fArrB[1], cornerSize, interpolation), AnimationUtils.a(fArrB[2], cornerSize, interpolation), AnimationUtils.a(fArrB[3], cornerSize, interpolation), AnimationUtils.a(fArrB[4], cornerSize, interpolation), AnimationUtils.a(fArrB[5], cornerSize, interpolation), AnimationUtils.a(fArrB[6], cornerSize, interpolation), AnimationUtils.a(fArrB[7], cornerSize, interpolation)});
                    }
                }
            }
        }
        AnimatorSet animatorSet = this.f15150o;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (f5 * animatorSet.getDuration()));
            return;
        }
        SearchView searchView = this.f15137a;
        if (searchView.j()) {
            searchView.h();
        }
        if (searchView.f15121b0) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            b(animatorSet2);
            animatorSet2.setDuration(250L);
            animatorSet2.setInterpolator(ReversableAnimatedValueInterpolator.a(false, AnimationUtils.f13769b));
            this.f15150o = animatorSet2;
            animatorSet2.start();
            this.f15150o.pause();
        }
    }
}
