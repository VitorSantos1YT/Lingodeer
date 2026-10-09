package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.animation.ChildrenAlphaProperty;
import com.google.android.material.animation.DrawableAlphaProperty;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.animation.Positioning;
import com.google.android.material.circularreveal.CircularRevealCompat;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.math.MathUtils;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import l4.e;
import y.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public float H;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f15869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f15870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f15871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f15872f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f15873t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class FabTransformationSpec {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MotionSpec f15881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Positioning f15882b;
    }

    public FabTransformationBehavior() {
        this.f15869c = new Rect();
        this.f15870d = new RectF();
        this.f15871e = new RectF();
        this.f15872f = new int[2];
    }

    public static Pair A(float f5, float f11, boolean z11, FabTransformationSpec fabTransformationSpec) {
        MotionTiming motionTimingF;
        MotionTiming motionTimingF2;
        if (f5 == CropImageView.DEFAULT_ASPECT_RATIO || f11 == CropImageView.DEFAULT_ASPECT_RATIO) {
            motionTimingF = fabTransformationSpec.f15881a.f("translationXLinear");
            motionTimingF2 = fabTransformationSpec.f15881a.f("translationYLinear");
        } else if ((!z11 || f11 >= CropImageView.DEFAULT_ASPECT_RATIO) && (z11 || f11 <= CropImageView.DEFAULT_ASPECT_RATIO)) {
            motionTimingF = fabTransformationSpec.f15881a.f("translationXCurveDownwards");
            motionTimingF2 = fabTransformationSpec.f15881a.f("translationYCurveDownwards");
        } else {
            motionTimingF = fabTransformationSpec.f15881a.f("translationXCurveUpwards");
            motionTimingF2 = fabTransformationSpec.f15881a.f("translationYCurveUpwards");
        }
        return new Pair(motionTimingF, motionTimingF2);
    }

    public static float D(FabTransformationSpec fabTransformationSpec, MotionTiming motionTiming, float f5) {
        long j11 = motionTiming.f13782a;
        long j12 = motionTiming.f13783b;
        MotionTiming motionTimingF = fabTransformationSpec.f15881a.f("expansion");
        return AnimationUtils.a(f5, CropImageView.DEFAULT_ASPECT_RATIO, motionTiming.b().getInterpolation((((motionTimingF.f13782a + motionTimingF.f13783b) + 17) - j11) / j12));
    }

    public final float B(View view, View view2, Positioning positioning) {
        RectF rectF = this.f15870d;
        E(view, rectF);
        rectF.offset(this.f15873t, this.H);
        RectF rectF2 = this.f15871e;
        E(view2, rectF2);
        positioning.getClass();
        return (rectF2.centerX() - rectF.centerX()) + CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final float C(View view, View view2, Positioning positioning) {
        RectF rectF = this.f15870d;
        E(view, rectF);
        rectF.offset(this.f15873t, this.H);
        RectF rectF2 = this.f15871e;
        E(view2, rectF2);
        positioning.getClass();
        return (rectF2.centerY() - rectF.centerY()) + CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final void E(View view, RectF rectF) {
        rectF.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, view.getWidth(), view.getHeight());
        int[] iArr = this.f15872f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract FabTransformationSpec F(Context context, boolean z11);

    @Override // com.google.android.material.transformation.ExpandableBehavior, l4.b
    public final boolean h(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // l4.b
    public final void i(e eVar) {
        if (eVar.f39723h == 0) {
            eVar.f39723h = 80;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0146  */
    /* JADX WARN: Code duplicated, block: B:94:0x0331  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet z(final View view, final View view2, final boolean z11, boolean z12) {
        ObjectAnimator objectAnimatorOfFloat;
        float f5;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ArrayList arrayList;
        AnimatorSet animatorSetA;
        int i11;
        ObjectAnimator objectAnimatorOfFloat4;
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2;
        FabTransformationSpec fabTransformationSpecF = F(view2.getContext(), z11);
        if (z11) {
            this.f15873t = view.getTranslationX();
            this.H = view.getTranslationY();
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        float elevation = view2.getElevation() - view.getElevation();
        if (z11) {
            if (!z12) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, CropImageView.DEFAULT_ASPECT_RATIO);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        fabTransformationSpecF.f15881a.f("elevation").a(objectAnimatorOfFloat);
        arrayList2.add(objectAnimatorOfFloat);
        float fB = B(view, view2, fabTransformationSpecF.f15882b);
        float fC = C(view, view2, fabTransformationSpecF.f15882b);
        Pair pairA = A(fB, fC, z11, fabTransformationSpecF);
        MotionTiming motionTiming = (MotionTiming) pairA.first;
        MotionTiming motionTiming2 = (MotionTiming) pairA.second;
        RectF rectF = this.f15871e;
        Rect rect = this.f15869c;
        RectF rectF2 = this.f15870d;
        if (z11) {
            f5 = 0.0f;
            if (!z12) {
                view2.setTranslationX(-fB);
                view2.setTranslationY(-fC);
            }
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, CropImageView.DEFAULT_ASPECT_RATIO);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, CropImageView.DEFAULT_ASPECT_RATIO);
            float fD = D(fabTransformationSpecF, motionTiming, -fB);
            float fD2 = D(fabTransformationSpecF, motionTiming2, -fC);
            view2.getWindowVisibleDisplayFrame(rect);
            rectF2.set(rect);
            E(view2, rectF);
            rectF.offset(fD, fD2);
            rectF.intersect(rectF2);
            rectF2.set(rectF);
            objectAnimatorOfFloat3 = objectAnimatorOfFloat6;
            objectAnimatorOfFloat2 = objectAnimatorOfFloat5;
        } else {
            f5 = 0.0f;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fB);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fC);
        }
        motionTiming.a(objectAnimatorOfFloat2);
        motionTiming2.a(objectAnimatorOfFloat3);
        arrayList2.add(objectAnimatorOfFloat2);
        arrayList2.add(objectAnimatorOfFloat3);
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        float fB2 = B(view, view2, fabTransformationSpecF.f15882b);
        float fC2 = C(view, view2, fabTransformationSpecF.f15882b);
        Pair pairA2 = A(fB2, fC2, z11, fabTransformationSpecF);
        MotionTiming motionTiming3 = (MotionTiming) pairA2.first;
        MotionTiming motionTiming4 = (MotionTiming) pairA2.second;
        Property property = View.TRANSLATION_X;
        if (!z11) {
            fB2 = this.f15873t;
        }
        float f11 = fC2;
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fB2);
        Property property2 = View.TRANSLATION_Y;
        if (!z11) {
            f11 = this.H;
        }
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, f11);
        motionTiming3.a(objectAnimatorOfFloat7);
        motionTiming4.a(objectAnimatorOfFloat8);
        arrayList2.add(objectAnimatorOfFloat7);
        arrayList2.add(objectAnimatorOfFloat8);
        boolean z13 = view2 instanceof CircularRevealWidget;
        if (z13 && (view instanceof ImageView)) {
            final CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
            final Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                arrayList = arrayList3;
            } else {
                drawable.mutate();
                if (z11) {
                    if (!z12) {
                        drawable.setAlpha(255);
                    }
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.f13775a, 0);
                } else {
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.f13775a, 255);
                }
                objectAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transformation.FabTransformationBehavior.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        view2.invalidate();
                    }
                });
                fabTransformationSpecF.f15881a.f("iconFade").a(objectAnimatorOfInt2);
                arrayList2.add(objectAnimatorOfInt2);
                AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        circularRevealWidget.setCircularRevealOverlayDrawable(null);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        circularRevealWidget.setCircularRevealOverlayDrawable(drawable);
                    }
                };
                arrayList = arrayList3;
                arrayList.add(animatorListenerAdapter);
            }
        } else {
            arrayList = arrayList3;
        }
        if (z13) {
            final CircularRevealWidget circularRevealWidget2 = (CircularRevealWidget) view2;
            Positioning positioning = fabTransformationSpecF.f15882b;
            E(view, rectF2);
            rectF2.offset(this.f15873t, this.H);
            E(view2, rectF);
            rectF.offset(-B(view, view2, positioning), f5);
            float fCenterX = rectF2.centerX() - rectF.left;
            Positioning positioning2 = fabTransformationSpecF.f15882b;
            E(view, rectF2);
            rectF2.offset(this.f15873t, this.H);
            E(view2, rectF);
            rectF.offset(CropImageView.DEFAULT_ASPECT_RATIO, -C(view, view2, positioning2));
            float fCenterY = rectF2.centerY() - rectF.top;
            ((FloatingActionButton) view).f(rect);
            float fWidth2 = rect.width() / 2.0f;
            MotionTiming motionTimingF = fabTransformationSpecF.f15881a.f("expansion");
            if (z11) {
                if (!z12) {
                    circularRevealWidget2.setRevealInfo(new CircularRevealWidget.RevealInfo(fCenterX, fCenterY, fWidth2));
                }
                if (z12) {
                    fWidth2 = circularRevealWidget2.getRevealInfo().f14283c;
                }
                animatorSetA = CircularRevealCompat.a(circularRevealWidget2, fCenterX, fCenterY, MathUtils.b(fCenterX, fCenterY, fWidth, fHeight));
                animatorSetA.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        CircularRevealWidget circularRevealWidget3 = circularRevealWidget2;
                        CircularRevealWidget.RevealInfo revealInfo = circularRevealWidget3.getRevealInfo();
                        revealInfo.f14283c = Float.MAX_VALUE;
                        circularRevealWidget3.setRevealInfo(revealInfo);
                    }
                });
                long j11 = motionTimingF.f13782a;
                int i12 = (int) fCenterX;
                int i13 = (int) fCenterY;
                if (j11 > 0) {
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i12, i13, fWidth2, fWidth2);
                    animatorCreateCircularReveal.setStartDelay(0L);
                    animatorCreateCircularReveal.setDuration(j11);
                    arrayList2.add(animatorCreateCircularReveal);
                }
            } else {
                float f12 = circularRevealWidget2.getRevealInfo().f14283c;
                AnimatorSet animatorSetA2 = CircularRevealCompat.a(circularRevealWidget2, fCenterX, fCenterY, fWidth2);
                long j12 = motionTimingF.f13782a;
                int i14 = (int) fCenterX;
                int i15 = (int) fCenterY;
                if (j12 > 0) {
                    Animator animatorCreateCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i14, i15, f12, f12);
                    animatorCreateCircularReveal2.setStartDelay(0L);
                    animatorCreateCircularReveal2.setDuration(j12);
                    arrayList2.add(animatorCreateCircularReveal2);
                }
                long j13 = motionTimingF.f13782a;
                long j14 = motionTimingF.f13783b;
                t0 t0Var = fabTransformationSpecF.f15881a.f13780a;
                int i16 = t0Var.f56767c;
                int i17 = 0;
                long jMax = 0;
                while (i17 < i16) {
                    t0 t0Var2 = t0Var;
                    MotionTiming motionTiming5 = (MotionTiming) t0Var.j(i17);
                    jMax = Math.max(jMax, motionTiming5.f13782a + motionTiming5.f13783b);
                    i17++;
                    t0Var = t0Var2;
                    j13 = j13;
                }
                long j15 = j13 + j14;
                if (j15 < jMax) {
                    Animator animatorCreateCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i14, i15, fWidth2, fWidth2);
                    animatorCreateCircularReveal3.setStartDelay(j15);
                    animatorCreateCircularReveal3.setDuration(jMax - j15);
                    arrayList2.add(animatorCreateCircularReveal3);
                }
                animatorSetA = animatorSetA2;
            }
            motionTimingF.a(animatorSetA);
            arrayList2.add(animatorSetA);
            arrayList.add(CircularRevealCompat.b(circularRevealWidget2));
        }
        if (z13) {
            CircularRevealWidget circularRevealWidget3 = (CircularRevealWidget) view2;
            ColorStateList backgroundTintList = view.getBackgroundTintList();
            int colorForState = backgroundTintList != null ? backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor()) : 0;
            int i18 = 16777215 & colorForState;
            if (z11) {
                if (!z12) {
                    circularRevealWidget3.setCircularRevealScrimColor(colorForState);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(circularRevealWidget3, CircularRevealWidget.CircularRevealScrimColorProperty.f14280a, i18);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(circularRevealWidget3, CircularRevealWidget.CircularRevealScrimColorProperty.f14280a, colorForState);
            }
            objectAnimatorOfInt.setEvaluator(ArgbEvaluatorCompat.f13773a);
            fabTransformationSpecF.f15881a.f("color").a(objectAnimatorOfInt);
            arrayList2.add(objectAnimatorOfInt);
        }
        if (view2 instanceof ViewGroup) {
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = null;
            if (viewFindViewById != null) {
                if (viewFindViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewFindViewById;
                }
            } else if ((view2 instanceof TransformationChildLayout) || (view2 instanceof TransformationChildCard)) {
                View childAt = ((ViewGroup) view2).getChildAt(0);
                if (childAt instanceof ViewGroup) {
                    viewGroup = (ViewGroup) childAt;
                }
            } else {
                viewGroup = (ViewGroup) view2;
            }
            if (viewGroup == null) {
                i11 = 0;
            } else {
                if (z11) {
                    if (!z12) {
                        ChildrenAlphaProperty.f13774a.set(viewGroup, Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO));
                    }
                    i11 = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, ChildrenAlphaProperty.f13774a, 1.0f);
                } else {
                    i11 = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, ChildrenAlphaProperty.f13774a, CropImageView.DEFAULT_ASPECT_RATIO);
                }
                fabTransformationSpecF.f15881a.f(ualZoVVCQs.euBkidDFFsrqLab).a(objectAnimatorOfFloat4);
                arrayList2.add(objectAnimatorOfFloat4);
            }
        } else {
            i11 = 0;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.a(animatorSet, arrayList2);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (z11) {
                    return;
                }
                view2.setVisibility(4);
                View view3 = view;
                view3.setAlpha(1.0f);
                view3.setVisibility(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (z11) {
                    view2.setVisibility(0);
                    View view3 = view;
                    view3.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                    view3.setVisibility(4);
                }
            }
        });
        int size = arrayList.size();
        for (int i19 = i11; i19 < size; i19++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList.get(i19));
        }
        return animatorSet;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15869c = new Rect();
        this.f15870d = new RectF();
        this.f15871e = new RectF();
        this.f15872f = new int[2];
    }
}
