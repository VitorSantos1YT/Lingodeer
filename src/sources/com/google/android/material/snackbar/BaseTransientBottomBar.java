package com.google.android.material.snackbar;

import a5.g;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.WeakHashMap;
import l4.e;
import z4.b;
import z4.j0;
import z4.s0;
import z4.u;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f15456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f15457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f15458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f15459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f15460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SnackbarBaseLayout f15461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.google.android.material.snackbar.ContentViewCallback f15462j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15463k;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15465n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15466o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15467p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15468q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f15469r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AccessibilityManager f15470s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final r6.a f15448u = AnimationUtils.f13769b;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final LinearInterpolator f15449v = AnimationUtils.f13768a;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final r6.a f15450w = AnimationUtils.f13771d;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f15452y = {R.attr.snackbarStyle};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Handler f15451x = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.1
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i11 = message.what;
            if (i11 == 0) {
                final BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                SnackbarBaseLayout snackbarBaseLayout = baseTransientBottomBar.f15461i;
                if (snackbarBaseLayout.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
                    if (layoutParams instanceof e) {
                        e eVar = (e) layoutParams;
                        Behavior behavior = new Behavior();
                        BehaviorDelegate behaviorDelegate = behavior.K;
                        behaviorDelegate.getClass();
                        behaviorDelegate.f15487a = baseTransientBottomBar.f15471t;
                        behavior.f13925b = new SwipeDismissBehavior.OnDismissListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.7
                            @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
                            public final void a(View view) {
                                if (view.getParent() != null) {
                                    view.setVisibility(8);
                                }
                                BaseTransientBottomBar.this.b(0);
                            }

                            @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
                            public final void b(int i12) {
                                AnonymousClass5 anonymousClass5 = BaseTransientBottomBar.this.f15471t;
                                if (i12 == 0) {
                                    SnackbarManager.b().e(anonymousClass5);
                                } else if (i12 == 1 || i12 == 2) {
                                    SnackbarManager.b().d(anonymousClass5);
                                }
                            }
                        };
                        eVar.b(behavior);
                        eVar.f39722g = 80;
                    }
                    ViewGroup viewGroup = baseTransientBottomBar.f15459g;
                    snackbarBaseLayout.M = true;
                    viewGroup.addView(snackbarBaseLayout);
                    snackbarBaseLayout.M = false;
                    baseTransientBottomBar.g();
                    snackbarBaseLayout.setVisibility(4);
                }
                if (snackbarBaseLayout.isLaidOut()) {
                    baseTransientBottomBar.f();
                    return true;
                }
                baseTransientBottomBar.f15469r = true;
                return true;
            }
            if (i11 != 1) {
                return false;
            }
            final BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            int i12 = message.arg1;
            SnackbarBaseLayout snackbarBaseLayout2 = baseTransientBottomBar2.f15461i;
            AccessibilityManager accessibilityManager = baseTransientBottomBar2.f15470s;
            if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || snackbarBaseLayout2.getVisibility() != 0) {
                baseTransientBottomBar2.d();
                return true;
            }
            if (snackbarBaseLayout2.getAnimationMode() == 1) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar2.f15456d);
                valueAnimatorOfFloat.addUpdateListener(new AnonymousClass11());
                valueAnimatorOfFloat.setDuration(baseTransientBottomBar2.f15454b);
                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter(i12) { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.10
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        BaseTransientBottomBar.this.d();
                    }
                });
                valueAnimatorOfFloat.start();
                return true;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            SnackbarBaseLayout snackbarBaseLayout3 = baseTransientBottomBar2.f15461i;
            int height = snackbarBaseLayout3.getHeight();
            ViewGroup.LayoutParams layoutParams2 = snackbarBaseLayout3.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
            }
            valueAnimator.setIntValues(0, height);
            valueAnimator.setInterpolator(baseTransientBottomBar2.f15457e);
            valueAnimator.setDuration(baseTransientBottomBar2.f15455c);
            valueAnimator.addListener(new AnimatorListenerAdapter(i12) { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.15
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    BaseTransientBottomBar.this.d();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
                    baseTransientBottomBar3.f15462j.a(baseTransientBottomBar3.f15454b);
                }
            });
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.16
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    BaseTransientBottomBar.this.f15461i.setTranslationY(((Integer) valueAnimator2.getAnimatedValue()).intValue());
                }
            });
            valueAnimator.start();
            return true;
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Runnable f15464l = new Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.2
        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f15461i == null || (context = baseTransientBottomBar.f15460h) == null) {
                return;
            }
            int iHeight = WindowUtils.a(context).height();
            int[] iArr = new int[2];
            SnackbarBaseLayout snackbarBaseLayout = baseTransientBottomBar.f15461i;
            snackbarBaseLayout.getLocationInWindow(iArr);
            int height = (iHeight - (snackbarBaseLayout.getHeight() + iArr[1])) + ((int) baseTransientBottomBar.f15461i.getTranslationY());
            int i11 = baseTransientBottomBar.f15467p;
            if (height >= i11) {
                baseTransientBottomBar.f15468q = i11;
                return;
            }
            ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.f15461i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                r6.a aVar = BaseTransientBottomBar.f15448u;
                return;
            }
            int i12 = baseTransientBottomBar.f15467p;
            baseTransientBottomBar.f15468q = i12;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = (i12 - height) + marginLayoutParams.bottomMargin;
            baseTransientBottomBar.f15461i.requestLayout();
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AnonymousClass5 f15471t = new SnackbarManager.Callback() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.5
        @Override // com.google.android.material.snackbar.SnackbarManager.Callback
        public final void a() {
            Handler handler = BaseTransientBottomBar.f15451x;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.SnackbarManager.Callback
        public final void b(int i11) {
            Handler handler = BaseTransientBottomBar.f15451x;
            handler.sendMessage(handler.obtainMessage(1, i11, 0, BaseTransientBottomBar.this));
        }
    };

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$11, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass11 implements ValueAnimator.AnimatorUpdateListener {
        public AnonymousClass11() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f15461i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Anchor implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            throw null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            throw null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface AnimationMode {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class BaseCallback<B> {

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        @Retention(RetentionPolicy.SOURCE)
        public @interface DismissEvent {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Behavior extends SwipeDismissBehavior<View> {
        public final BehaviorDelegate K;

        public Behavior() {
            BehaviorDelegate behaviorDelegate = new BehaviorDelegate();
            this.f13929f = Math.min(Math.max(CropImageView.DEFAULT_ASPECT_RATIO, 0.1f), 1.0f);
            this.f13930t = Math.min(Math.max(CropImageView.DEFAULT_ASPECT_RATIO, 0.6f), 1.0f);
            this.f13928e = 0;
            this.K = behaviorDelegate;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, l4.b
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            BehaviorDelegate behaviorDelegate = this.K;
            behaviorDelegate.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    SnackbarManager.b().e(behaviorDelegate.f15487a);
                }
            } else if (coordinatorLayout.s(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                SnackbarManager.b().d(behaviorDelegate.f15487a);
            }
            return super.m(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean y(View view) {
            this.K.getClass();
            return view instanceof SnackbarBaseLayout;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class BehaviorDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AnonymousClass5 f15487a;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Deprecated
    public interface ContentViewCallback extends com.google.android.material.snackbar.ContentViewCallback {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Duration {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SnackbarBaseLayout extends FrameLayout {
        public static final View.OnTouchListener N = new View.OnTouchListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        };
        public ColorStateList H;
        public PorterDuff.Mode K;
        public Rect L;
        public boolean M;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BaseTransientBottomBar f15488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ShapeAppearanceModel f15489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f15491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f15492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f15493f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f15494t;

        public SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            Drawable drawable;
            super(MaterialThemeOverlay.a(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.f13740f0);
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f15490c = typedArrayObtainStyledAttributes.getInt(2, 0);
            if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
                this.f15489b = ShapeAppearanceModel.d(context2, attributeSet, 0, 0).a();
            }
            this.f15491d = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(MaterialResources.a(context2, typedArrayObtainStyledAttributes, 4));
            setBackgroundTintMode(ViewUtils.h(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f15492e = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
            this.f15493f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f15494t = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(N);
            setFocusable(true);
            if (getBackground() == null) {
                int iF = MaterialColors.f(MaterialColors.c(this, R.attr.colorSurface), getBackgroundOverlayColorAlpha(), MaterialColors.c(this, R.attr.colorOnSurface));
                ShapeAppearanceModel shapeAppearanceModel = this.f15489b;
                if (shapeAppearanceModel != null) {
                    r6.a aVar = BaseTransientBottomBar.f15448u;
                    MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
                    materialShapeDrawable.r(ColorStateList.valueOf(iF));
                    drawable = materialShapeDrawable;
                } else {
                    Resources resources = getResources();
                    r6.a aVar2 = BaseTransientBottomBar.f15448u;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(dimension);
                    gradientDrawable.setColor(iF);
                    drawable = gradientDrawable;
                }
                ColorStateList colorStateList = this.H;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
                setBackground(drawable);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f15488a = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f15492e;
        }

        public int getAnimationMode() {
            return this.f15490c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f15491d;
        }

        public int getMaxInlineActionWidth() {
            return this.f15494t;
        }

        public int getMaxWidth() {
            return this.f15493f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f15488a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.c();
            }
            requestApplyInsets();
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            boolean z11;
            super.onDetachedFromWindow();
            final BaseTransientBottomBar baseTransientBottomBar = this.f15488a;
            if (baseTransientBottomBar != null) {
                SnackbarManager snackbarManagerB = SnackbarManager.b();
                AnonymousClass5 anonymousClass5 = baseTransientBottomBar.f15471t;
                synchronized (snackbarManagerB.f15501a) {
                    z11 = true;
                    if (!snackbarManagerB.c(anonymousClass5)) {
                        SnackbarManager.SnackbarRecord snackbarRecord = snackbarManagerB.f15504d;
                        if (!(snackbarRecord != null && snackbarRecord.f15506a.get() == anonymousClass5)) {
                            z11 = false;
                        }
                    }
                }
                if (z11) {
                    BaseTransientBottomBar.f15451x.post(new Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.6
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseTransientBottomBar.this.d();
                        }
                    });
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
            super.onLayout(z11, i11, i12, i13, i14);
            BaseTransientBottomBar baseTransientBottomBar = this.f15488a;
            if (baseTransientBottomBar == null || !baseTransientBottomBar.f15469r) {
                return;
            }
            baseTransientBottomBar.f();
            baseTransientBottomBar.f15469r = false;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i11, int i12) {
            super.onMeasure(i11, i12);
            int i13 = this.f15493f;
            if (i13 <= 0 || getMeasuredWidth() <= i13) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), i12);
        }

        public void setAnimationMode(int i11) {
            this.f15490c = i11;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.H != null) {
                drawable = drawable.mutate();
                drawable.setTintList(this.H);
                drawable.setTintMode(this.K);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.H = colorStateList;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                drawableMutate.setTintList(colorStateList);
                drawableMutate.setTintMode(this.K);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.K = mode;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                drawableMutate.setTintMode(mode);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.M || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.L = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar baseTransientBottomBar = this.f15488a;
            if (baseTransientBottomBar != null) {
                r6.a aVar = BaseTransientBottomBar.f15448u;
                baseTransientBottomBar.g();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : N);
            super.setOnClickListener(onClickListener);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.snackbar.BaseTransientBottomBar$5] */
    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.ContentViewCallback contentViewCallback) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (contentViewCallback == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f15459g = viewGroup;
        this.f15462j = contentViewCallback;
        this.f15460h = context;
        ThemeEnforcement.c(context, ThemeEnforcement.f14739a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f15452y);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.f15461i = snackbarBaseLayout;
        snackbarBaseLayout.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float actionTextColorAlpha = snackbarBaseLayout.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.f15497b.setTextColor(MaterialColors.f(MaterialColors.c(snackbarContentLayout, R.attr.colorSurface), actionTextColorAlpha, snackbarContentLayout.f15497b.getCurrentTextColor()));
            }
            snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
        }
        snackbarBaseLayout.addView(view);
        snackbarBaseLayout.setAccessibilityLiveRegion(1);
        snackbarBaseLayout.setImportantForAccessibility(1);
        snackbarBaseLayout.setFitsSystemWindows(true);
        u uVar = new u() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.3
            @Override // z4.u
            public final v1 e(View view2, v1 v1Var) {
                int iA = v1Var.a();
                BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                baseTransientBottomBar.m = iA;
                baseTransientBottomBar.f15465n = v1Var.b();
                baseTransientBottomBar.f15466o = v1Var.c();
                baseTransientBottomBar.g();
                return v1Var;
            }
        };
        WeakHashMap weakHashMap = s0.f58893a;
        j0.m(snackbarBaseLayout, uVar);
        s0.q(snackbarBaseLayout, new b() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.4
            @Override // z4.b
            public final void d(View view2, g gVar) {
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f380a;
                this.f58810a.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfo);
                gVar.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
            }

            @Override // z4.b
            public final boolean g(View view2, int i11, Bundle bundle) {
                if (i11 != 1048576) {
                    return super.g(view2, i11, bundle);
                }
                BaseTransientBottomBar.this.a();
                return true;
            }
        });
        this.f15470s = (AccessibilityManager) context.getSystemService("accessibility");
        this.f15455c = MotionUtils.c(context, R.attr.motionDurationLong2, 250);
        this.f15453a = MotionUtils.c(context, R.attr.motionDurationLong2, 150);
        this.f15454b = MotionUtils.c(context, R.attr.motionDurationMedium1, 75);
        this.f15456d = MotionUtils.d(context, R.attr.motionEasingEmphasizedInterpolator, f15449v);
        this.f15458f = MotionUtils.d(context, R.attr.motionEasingEmphasizedInterpolator, f15450w);
        this.f15457e = MotionUtils.d(context, R.attr.motionEasingEmphasizedInterpolator, f15448u);
    }

    public void a() {
        b(3);
    }

    public final void b(int i11) {
        SnackbarManager snackbarManagerB = SnackbarManager.b();
        AnonymousClass5 anonymousClass5 = this.f15471t;
        synchronized (snackbarManagerB.f15501a) {
            try {
                if (snackbarManagerB.c(anonymousClass5)) {
                    snackbarManagerB.a(snackbarManagerB.f15503c, i11);
                } else {
                    SnackbarManager.SnackbarRecord snackbarRecord = snackbarManagerB.f15504d;
                    if (snackbarRecord != null && snackbarRecord.f15506a.get() == anonymousClass5) {
                        snackbarManagerB.a(snackbarManagerB.f15504d, i11);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f15461i.getRootWindowInsets()) == null) {
            return;
        }
        this.f15467p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        g();
    }

    public final void d() {
        SnackbarManager snackbarManagerB = SnackbarManager.b();
        AnonymousClass5 anonymousClass5 = this.f15471t;
        synchronized (snackbarManagerB.f15501a) {
            try {
                if (snackbarManagerB.c(anonymousClass5)) {
                    snackbarManagerB.f15503c = null;
                    SnackbarManager.SnackbarRecord snackbarRecord = snackbarManagerB.f15504d;
                    if (snackbarRecord != null && snackbarRecord != null) {
                        snackbarManagerB.f15503c = snackbarRecord;
                        snackbarManagerB.f15504d = null;
                        SnackbarManager.Callback callback = (SnackbarManager.Callback) snackbarRecord.f15506a.get();
                        if (callback != null) {
                            callback.a();
                        } else {
                            snackbarManagerB.f15503c = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ViewParent parent = this.f15461i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f15461i);
        }
    }

    public final void e() {
        SnackbarManager snackbarManagerB = SnackbarManager.b();
        AnonymousClass5 anonymousClass5 = this.f15471t;
        synchronized (snackbarManagerB.f15501a) {
            try {
                if (snackbarManagerB.c(anonymousClass5)) {
                    snackbarManagerB.f(snackbarManagerB.f15503c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        SnackbarBaseLayout snackbarBaseLayout = this.f15461i;
        AccessibilityManager accessibilityManager = this.f15470s;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            snackbarBaseLayout.post(new Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.8
                @Override // java.lang.Runnable
                public final void run() {
                    final BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                    SnackbarBaseLayout snackbarBaseLayout2 = baseTransientBottomBar.f15461i;
                    if (snackbarBaseLayout2 == null) {
                        return;
                    }
                    if (snackbarBaseLayout2.getParent() != null) {
                        snackbarBaseLayout2.setVisibility(0);
                    }
                    if (snackbarBaseLayout2.getAnimationMode() == 1) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar.f15456d);
                        valueAnimatorOfFloat.addUpdateListener(new AnonymousClass11());
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(baseTransientBottomBar.f15458f);
                        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.12
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                                baseTransientBottomBar2.f15461i.setScaleX(fFloatValue);
                                baseTransientBottomBar2.f15461i.setScaleY(fFloatValue);
                            }
                        });
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(baseTransientBottomBar.f15453a);
                        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.9
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                BaseTransientBottomBar.this.e();
                            }
                        });
                        animatorSet.start();
                        return;
                    }
                    int height = snackbarBaseLayout2.getHeight();
                    ViewGroup.LayoutParams layoutParams = snackbarBaseLayout2.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    }
                    snackbarBaseLayout2.setTranslationY(height);
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(height, 0);
                    valueAnimator.setInterpolator(baseTransientBottomBar.f15457e);
                    valueAnimator.setDuration(baseTransientBottomBar.f15455c);
                    valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.13
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            BaseTransientBottomBar.this.e();
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                            com.google.android.material.snackbar.ContentViewCallback contentViewCallback = baseTransientBottomBar2.f15462j;
                            int i11 = baseTransientBottomBar2.f15455c;
                            int i12 = baseTransientBottomBar2.f15453a;
                            contentViewCallback.b(i11 - i12, i12);
                        }
                    });
                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.14
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            BaseTransientBottomBar.this.f15461i.setTranslationY(((Integer) valueAnimator2.getAnimatedValue()).intValue());
                        }
                    });
                    valueAnimator.start();
                }
            });
            return;
        }
        if (snackbarBaseLayout.getParent() != null) {
            snackbarBaseLayout.setVisibility(0);
        }
        e();
    }

    public final void g() {
        SnackbarBaseLayout snackbarBaseLayout = this.f15461i;
        ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || snackbarBaseLayout.L == null || snackbarBaseLayout.getParent() == null) {
            return;
        }
        int i11 = this.m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = snackbarBaseLayout.L;
        int i12 = rect.bottom + i11;
        int i13 = rect.left + this.f15465n;
        int i14 = rect.right + this.f15466o;
        int i15 = rect.top;
        boolean z11 = (marginLayoutParams.bottomMargin == i12 && marginLayoutParams.leftMargin == i13 && marginLayoutParams.rightMargin == i14 && marginLayoutParams.topMargin == i15) ? false : true;
        if (z11) {
            marginLayoutParams.bottomMargin = i12;
            marginLayoutParams.leftMargin = i13;
            marginLayoutParams.rightMargin = i14;
            marginLayoutParams.topMargin = i15;
            snackbarBaseLayout.requestLayout();
        }
        if ((z11 || this.f15468q != this.f15467p) && Build.VERSION.SDK_INT >= 29 && this.f15467p > 0) {
            ViewGroup.LayoutParams layoutParams2 = snackbarBaseLayout.getLayoutParams();
            if ((layoutParams2 instanceof e) && (((e) layoutParams2).f39716a instanceof SwipeDismissBehavior)) {
                Runnable runnable = this.f15464l;
                snackbarBaseLayout.removeCallbacks(runnable);
                snackbarBaseLayout.post(runnable);
            }
        }
    }
}
