package com.google.android.material.floatingactionbutton;

import am.rVFB.LwKl;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import l4.b;
import l4.e;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements l4.a {
    public static final Property D0 = new AnonymousClass6(Float.class, "width");
    public static final Property E0 = new AnonymousClass7(Float.class, "height");
    public static final Property F0 = new AnonymousClass8(Float.class, LwKl.qXCYYr);
    public static final Property G0 = new AnonymousClass9(Float.class, "paddingEnd");
    public ColorStateList A0;
    public int B0;
    public int C0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f14488n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f14489o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ChangeSizeStrategy f14490p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ChangeSizeStrategy f14491q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ShowStrategy f14492r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final HideStrategy f14493s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f14494t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f14495u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f14496v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final ExtendedFloatingActionButtonBehavior f14497w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f14498x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f14499y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f14500z0;

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 implements Size {
        public AnonymousClass2() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final ViewGroup.LayoutParams a() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final int f() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.f14496v0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final int getPaddingStart() {
            return ExtendedFloatingActionButton.this.f14495u0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final int h() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return ((extendedFloatingActionButton.getMeasuredWidth() - extendedFloatingActionButton.getPaddingStart()) - extendedFloatingActionButton.getPaddingEnd()) + extendedFloatingActionButton.f14495u0 + extendedFloatingActionButton.f14496v0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass3 implements Size {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AnonymousClass2 f14503a;

        public AnonymousClass3(AnonymousClass2 anonymousClass2) {
            this.f14503a = anonymousClass2;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final ViewGroup.LayoutParams a() {
            int i11 = ExtendedFloatingActionButton.this.C0;
            if (i11 == 0) {
                i11 = -2;
            }
            return new ViewGroup.LayoutParams(-1, i11);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final int f() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            ExtendedFloatingActionButton extendedFloatingActionButton2 = ExtendedFloatingActionButton.this;
            int i11 = extendedFloatingActionButton2.C0;
            if (i11 != -1) {
                return (i11 == 0 || i11 == -2) ? extendedFloatingActionButton.getMeasuredHeight() : i11;
            }
            if (!(extendedFloatingActionButton2.getParent() instanceof View)) {
                return extendedFloatingActionButton.getMeasuredHeight();
            }
            View view = (View) extendedFloatingActionButton2.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.height != -2) {
                return (view.getHeight() - ((!(extendedFloatingActionButton2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton2.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
            }
            return extendedFloatingActionButton.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.f14496v0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final int getPaddingStart() {
            return ExtendedFloatingActionButton.this.f14495u0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final int h() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            boolean z11 = extendedFloatingActionButton.getParent() instanceof View;
            AnonymousClass2 anonymousClass2 = this.f14503a;
            if (!z11) {
                return anonymousClass2.h();
            }
            View view = (View) extendedFloatingActionButton.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.width != -2) {
                return (view.getWidth() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
            }
            return anonymousClass2.h();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnonymousClass6 extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f5) {
            View view2 = view;
            view2.getLayoutParams().width = f5.intValue();
            view2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnonymousClass7 extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f5) {
            View view2 = view;
            view2.getLayoutParams().height = f5.intValue();
            view2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$8, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnonymousClass8 extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getPaddingStart());
        }

        @Override // android.util.Property
        public final void set(View view, Float f5) {
            View view2 = view;
            view2.setPaddingRelative(f5.intValue(), view2.getPaddingTop(), view2.getPaddingEnd(), view2.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$9, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnonymousClass9 extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getPaddingEnd());
        }

        @Override // android.util.Property
        public final void set(View view, Float f5) {
            View view2 = view;
            view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), f5.intValue(), view2.getPaddingBottom());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class ChangeSizeStrategy extends BaseMotionStrategy {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Size f14509g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f14510h;

        public ChangeSizeStrategy(AnimatorTracker animatorTracker, Size size, boolean z11) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
            this.f14509g = size;
            this.f14510h = z11;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public final int b() {
            return this.f14510h ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public final void c() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            boolean z11 = this.f14510h;
            extendedFloatingActionButton.f14498x0 = z11;
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!z11) {
                extendedFloatingActionButton.B0 = layoutParams.width;
                extendedFloatingActionButton.C0 = layoutParams.height;
            }
            Size size = this.f14509g;
            layoutParams.width = size.a().width;
            layoutParams.height = size.a().height;
            if (z11) {
                extendedFloatingActionButton.l(extendedFloatingActionButton.A0);
            } else if (extendedFloatingActionButton.getText() != null && extendedFloatingActionButton.getText() != BuildConfig.VERSION_NAME) {
                extendedFloatingActionButton.l(ColorStateList.valueOf(0));
            }
            extendedFloatingActionButton.setPaddingRelative(size.getPaddingStart(), extendedFloatingActionButton.getPaddingTop(), size.getPaddingEnd(), extendedFloatingActionButton.getPaddingBottom());
            extendedFloatingActionButton.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public final boolean d() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return this.f14510h == extendedFloatingActionButton.f14498x0 || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public final void e() {
            super.e();
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f14499y0 = false;
            extendedFloatingActionButton.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            Size size = this.f14509g;
            layoutParams.width = size.a().width;
            layoutParams.height = size.a().height;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public final AnimatorSet f() {
            MotionSpec motionSpec = this.f14470f;
            if (motionSpec == null) {
                if (this.f14469e == null) {
                    this.f14469e = MotionSpec.b(this.f14465a, b());
                }
                motionSpec = this.f14469e;
                motionSpec.getClass();
            }
            boolean zG = motionSpec.g("width");
            Size size = this.f14509g;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (zG) {
                PropertyValuesHolder[] propertyValuesHolderArrE = motionSpec.e("width");
                propertyValuesHolderArrE[0].setFloatValues(extendedFloatingActionButton.getWidth(), size.h());
                motionSpec.h("width", propertyValuesHolderArrE);
            }
            if (motionSpec.g("height")) {
                PropertyValuesHolder[] propertyValuesHolderArrE2 = motionSpec.e("height");
                propertyValuesHolderArrE2[0].setFloatValues(extendedFloatingActionButton.getHeight(), size.f());
                motionSpec.h("height", propertyValuesHolderArrE2);
            }
            if (motionSpec.g("paddingStart")) {
                PropertyValuesHolder[] propertyValuesHolderArrE3 = motionSpec.e("paddingStart");
                propertyValuesHolderArrE3[0].setFloatValues(extendedFloatingActionButton.getPaddingStart(), size.getPaddingStart());
                motionSpec.h("paddingStart", propertyValuesHolderArrE3);
            }
            if (motionSpec.g("paddingEnd")) {
                PropertyValuesHolder[] propertyValuesHolderArrE4 = motionSpec.e("paddingEnd");
                propertyValuesHolderArrE4[0].setFloatValues(extendedFloatingActionButton.getPaddingEnd(), size.getPaddingEnd());
                motionSpec.h("paddingEnd", propertyValuesHolderArrE4);
            }
            if (motionSpec.g("labelOpacity")) {
                PropertyValuesHolder[] propertyValuesHolderArrE5 = motionSpec.e("labelOpacity");
                boolean z11 = this.f14510h;
                propertyValuesHolderArrE5[0].setFloatValues(z11 ? 0.0f : 1.0f, z11 ? 1.0f : 0.0f);
                motionSpec.h("labelOpacity", propertyValuesHolderArrE5);
            }
            return g(motionSpec);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            boolean z11 = this.f14510h;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f14498x0 = z11;
            extendedFloatingActionButton.f14499y0 = true;
            extendedFloatingActionButton.setHorizontallyScrolling(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class HideStrategy extends BaseMotionStrategy {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f14515g;

        public HideStrategy(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public final void a() {
            super.a();
            this.f14515g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public final int b() {
            return R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public final void c() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public final boolean d() {
            Property property = ExtendedFloatingActionButton.D0;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (extendedFloatingActionButton.getVisibility() == 0) {
                if (extendedFloatingActionButton.f14488n0 != 1) {
                    return false;
                }
            } else if (extendedFloatingActionButton.f14488n0 == 2) {
                return false;
            }
            return true;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public final void e() {
            super.e();
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f14488n0 = 0;
            if (this.f14515g) {
                return;
            }
            extendedFloatingActionButton.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f14515g = false;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.f14488n0 = 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class OnChangedCallback {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class ShowStrategy extends BaseMotionStrategy {
        public ShowStrategy(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public final int b() {
            return R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public final void c() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.setAlpha(1.0f);
            extendedFloatingActionButton.setScaleY(1.0f);
            extendedFloatingActionButton.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public final boolean d() {
            Property property = ExtendedFloatingActionButton.D0;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (extendedFloatingActionButton.getVisibility() != 0) {
                if (extendedFloatingActionButton.f14488n0 != 2) {
                    return false;
                }
            } else if (extendedFloatingActionButton.f14488n0 == 1) {
                return false;
            }
            return true;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public final void e() {
            super.e();
            ExtendedFloatingActionButton.this.f14488n0 = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.f14488n0 = 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Size {
        ViewGroup.LayoutParams a();

        int f();

        int getPaddingEnd();

        int getPaddingStart();

        int h();
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0047  */
    /* JADX WARN: Code duplicated, block: B:33:0x004d  */
    /* JADX WARN: Code duplicated, block: B:34:0x004f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0055  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082 A[LOOP:0: B:39:0x0080->B:40:0x0082, LOOP_END] */
    public static void k(ExtendedFloatingActionButton extendedFloatingActionButton, int i11) {
        final BaseMotionStrategy baseMotionStrategy;
        int i12;
        AnimatorSet animatorSetF;
        ArrayList arrayList;
        int size;
        ViewGroup.LayoutParams layoutParams;
        if (i11 == 0) {
            baseMotionStrategy = extendedFloatingActionButton.f14492r0;
        } else if (i11 == 1) {
            baseMotionStrategy = extendedFloatingActionButton.f14493s0;
        } else if (i11 == 2) {
            baseMotionStrategy = extendedFloatingActionButton.f14490p0;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException(p.j(i11, "Unknown strategy type: "));
            }
            baseMotionStrategy = extendedFloatingActionButton.f14491q0;
        }
        if (baseMotionStrategy.d()) {
            return;
        }
        if (extendedFloatingActionButton.f14489o0) {
            if (extendedFloatingActionButton.isLaidOut()) {
                if (!extendedFloatingActionButton.isInEditMode()) {
                    if (i11 == 2) {
                        layoutParams = extendedFloatingActionButton.getLayoutParams();
                        if (layoutParams != null) {
                            extendedFloatingActionButton.B0 = layoutParams.width;
                            extendedFloatingActionButton.C0 = layoutParams.height;
                        } else {
                            extendedFloatingActionButton.B0 = extendedFloatingActionButton.getWidth();
                            extendedFloatingActionButton.C0 = extendedFloatingActionButton.getHeight();
                        }
                    }
                    i12 = 0;
                    extendedFloatingActionButton.measure(0, 0);
                    animatorSetF = baseMotionStrategy.f();
                    animatorSetF.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.5
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                            baseMotionStrategy.a();
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            baseMotionStrategy.e();
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            baseMotionStrategy.onAnimationStart(animator);
                        }
                    });
                    arrayList = baseMotionStrategy.f14467c;
                    size = arrayList.size();
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        animatorSetF.addListener((Animator.AnimatorListener) obj);
                    }
                    animatorSetF.start();
                    return;
                }
            } else if (extendedFloatingActionButton.getVisibility() != 0) {
                if (extendedFloatingActionButton.f14500z0) {
                    if (!extendedFloatingActionButton.isInEditMode()) {
                        if (i11 == 2) {
                            layoutParams = extendedFloatingActionButton.getLayoutParams();
                            if (layoutParams != null) {
                                extendedFloatingActionButton.B0 = layoutParams.width;
                                extendedFloatingActionButton.C0 = layoutParams.height;
                            } else {
                                extendedFloatingActionButton.B0 = extendedFloatingActionButton.getWidth();
                                extendedFloatingActionButton.C0 = extendedFloatingActionButton.getHeight();
                            }
                        }
                        i12 = 0;
                        extendedFloatingActionButton.measure(0, 0);
                        animatorSetF = baseMotionStrategy.f();
                        animatorSetF.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.5
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animator) {
                                baseMotionStrategy.a();
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                baseMotionStrategy.e();
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                                baseMotionStrategy.onAnimationStart(animator);
                            }
                        });
                        arrayList = baseMotionStrategy.f14467c;
                        size = arrayList.size();
                        while (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            animatorSetF.addListener((Animator.AnimatorListener) obj2);
                        }
                        animatorSetF.start();
                        return;
                    }
                }
            } else if (extendedFloatingActionButton.f14500z0) {
                if (!extendedFloatingActionButton.isInEditMode()) {
                    if (i11 == 2) {
                        layoutParams = extendedFloatingActionButton.getLayoutParams();
                        if (layoutParams != null) {
                            extendedFloatingActionButton.B0 = layoutParams.width;
                            extendedFloatingActionButton.C0 = layoutParams.height;
                        } else {
                            extendedFloatingActionButton.B0 = extendedFloatingActionButton.getWidth();
                            extendedFloatingActionButton.C0 = extendedFloatingActionButton.getHeight();
                        }
                    }
                    i12 = 0;
                    extendedFloatingActionButton.measure(0, 0);
                    animatorSetF = baseMotionStrategy.f();
                    animatorSetF.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.5
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                            baseMotionStrategy.a();
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            baseMotionStrategy.e();
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            baseMotionStrategy.onAnimationStart(animator);
                        }
                    });
                    arrayList = baseMotionStrategy.f14467c;
                    size = arrayList.size();
                    while (i12 < size) {
                        Object obj3 = arrayList.get(i12);
                        i12++;
                        animatorSetF.addListener((Animator.AnimatorListener) obj3);
                    }
                    animatorSetF.start();
                    return;
                }
            }
        }
        baseMotionStrategy.c();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // l4.a
    public b getBehavior() {
        return this.f14497w0;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i11 = this.f14494t0;
        if (i11 >= 0) {
            return i11;
        }
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    public MotionSpec getExtendMotionSpec() {
        return this.f14491q0.f14470f;
    }

    public MotionSpec getHideMotionSpec() {
        return this.f14493s0.f14470f;
    }

    public MotionSpec getShowMotionSpec() {
        return this.f14492r0.f14470f;
    }

    public MotionSpec getShrinkMotionSpec() {
        return this.f14490p0.f14470f;
    }

    public final void l(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f14498x0 && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f14498x0 = false;
            this.f14490p0.c();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z11) {
        this.f14500z0 = z11;
    }

    public void setAnimationEnabled(boolean z11) {
        this.f14489o0 = z11;
    }

    public void setExtendMotionSpec(MotionSpec motionSpec) {
        this.f14491q0.f14470f = motionSpec;
    }

    public void setExtendMotionSpecResource(int i11) {
        setExtendMotionSpec(MotionSpec.b(getContext(), i11));
    }

    public void setExtended(boolean z11) {
        if (this.f14498x0 == z11) {
            return;
        }
        ChangeSizeStrategy changeSizeStrategy = z11 ? this.f14491q0 : this.f14490p0;
        if (changeSizeStrategy.d()) {
            return;
        }
        changeSizeStrategy.c();
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        this.f14493s0.f14470f = motionSpec;
    }

    public void setHideMotionSpecResource(int i11) {
        setHideMotionSpec(MotionSpec.b(getContext(), i11));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i11, int i12, int i13, int i14) {
        super.setPadding(i11, i12, i13, i14);
        if (!this.f14498x0 || this.f14499y0) {
            return;
        }
        this.f14495u0 = getPaddingStart();
        this.f14496v0 = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i11, int i12, int i13, int i14) {
        super.setPaddingRelative(i11, i12, i13, i14);
        if (!this.f14498x0 || this.f14499y0) {
            return;
        }
        this.f14495u0 = i11;
        this.f14496v0 = i13;
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        this.f14492r0.f14470f = motionSpec;
    }

    public void setShowMotionSpecResource(int i11) {
        setShowMotionSpec(MotionSpec.b(getContext(), i11));
    }

    public void setShrinkMotionSpec(MotionSpec motionSpec) {
        this.f14490p0.f14470f = motionSpec;
    }

    public void setShrinkMotionSpecResource(int i11) {
        setShrinkMotionSpec(MotionSpec.b(getContext(), i11));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i11) {
        super.setTextColor(i11);
        this.A0 = getTextColors();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f14512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f14513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f14514c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f14513b = false;
            this.f14514c = true;
        }

        @Override // l4.b
        public final /* bridge */ /* synthetic */ boolean g(View view, Rect rect) {
            return false;
        }

        @Override // l4.b
        public final void i(e eVar) {
            if (eVar.f39723h == 0) {
                eVar.f39723h = 80;
            }
        }

        @Override // l4.b
        public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                y(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof e ? ((e) layoutParams).f39716a instanceof BottomSheetBehavior : false) {
                    z(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // l4.b
        public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i11) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList arrayListO = coordinatorLayout.o(extendedFloatingActionButton);
            int size = arrayListO.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view2 = (View) arrayListO.get(i12);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof e ? ((e) layoutParams).f39716a instanceof BottomSheetBehavior : false) && z(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (y(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.u(extendedFloatingActionButton, i11);
            return true;
        }

        public final boolean y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            e eVar = (e) extendedFloatingActionButton.getLayoutParams();
            boolean z11 = this.f14513b;
            boolean z12 = this.f14514c;
            if ((!z11 && !z12) || eVar.f39721f != appBarLayout.getId()) {
                return false;
            }
            if (this.f14512a == null) {
                this.f14512a = new Rect();
            }
            Rect rect = this.f14512a;
            DescendantOffsetUtils.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                ExtendedFloatingActionButton.k(extendedFloatingActionButton, z12 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.k(extendedFloatingActionButton, z12 ? 3 : 0);
            }
            return true;
        }

        public final boolean z(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            e eVar = (e) extendedFloatingActionButton.getLayoutParams();
            boolean z11 = this.f14513b;
            boolean z12 = this.f14514c;
            if ((!z11 && !z12) || eVar.f39721f != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((e) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                ExtendedFloatingActionButton.k(extendedFloatingActionButton, z12 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.k(extendedFloatingActionButton, z12 ? 3 : 0);
            }
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.f13759r);
            this.f14513b = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.f14514c = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon), attributeSet, i11);
        this.f14488n0 = 0;
        this.f14489o0 = true;
        AnimatorTracker animatorTracker = new AnimatorTracker();
        ShowStrategy showStrategy = new ShowStrategy(animatorTracker);
        this.f14492r0 = showStrategy;
        HideStrategy hideStrategy = new HideStrategy(animatorTracker);
        this.f14493s0 = hideStrategy;
        this.f14498x0 = true;
        this.f14499y0 = false;
        this.f14500z0 = false;
        Context context2 = getContext();
        this.f14497w0 = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.f13758q, i11, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, new int[0]);
        MotionSpec motionSpecA = MotionSpec.a(context2, typedArrayD, 5);
        MotionSpec motionSpecA2 = MotionSpec.a(context2, typedArrayD, 4);
        MotionSpec motionSpecA3 = MotionSpec.a(context2, typedArrayD, 2);
        MotionSpec motionSpecA4 = MotionSpec.a(context2, typedArrayD, 6);
        this.f14494t0 = typedArrayD.getDimensionPixelSize(0, -1);
        int i12 = typedArrayD.getInt(3, 1);
        this.f14495u0 = getPaddingStart();
        this.f14496v0 = getPaddingEnd();
        AnimatorTracker animatorTracker2 = new AnimatorTracker();
        final AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        final AnonymousClass3 anonymousClass3 = new AnonymousClass3(anonymousClass2);
        Size size = new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.4
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final ViewGroup.LayoutParams a() {
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                int i13 = extendedFloatingActionButton.B0;
                if (i13 == 0) {
                    i13 = -2;
                }
                int i14 = extendedFloatingActionButton.C0;
                return new ViewGroup.LayoutParams(i13, i14 != 0 ? i14 : -2);
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final int f() {
                int i13 = ExtendedFloatingActionButton.this.C0;
                if (i13 == -1) {
                    return anonymousClass3.f();
                }
                return (i13 == 0 || i13 == -2) ? ExtendedFloatingActionButton.this.getMeasuredHeight() : i13;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.f14496v0;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final int getPaddingStart() {
                return ExtendedFloatingActionButton.this.f14495u0;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final int h() {
                int i13 = ExtendedFloatingActionButton.this.B0;
                if (i13 == -1) {
                    return anonymousClass3.h();
                }
                return (i13 == 0 || i13 == -2) ? anonymousClass2.h() : i13;
            }
        };
        boolean z11 = true;
        Size size2 = anonymousClass2;
        if (i12 != 1) {
            Size size3 = i12 != 2 ? size : anonymousClass3;
            z11 = true;
            size2 = size3;
        }
        ChangeSizeStrategy changeSizeStrategy = new ChangeSizeStrategy(animatorTracker2, size2, z11);
        this.f14491q0 = changeSizeStrategy;
        ChangeSizeStrategy changeSizeStrategy2 = new ChangeSizeStrategy(animatorTracker2, new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.1
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final ViewGroup.LayoutParams a() {
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                return new ViewGroup.LayoutParams(extendedFloatingActionButton.getCollapsedSize(), extendedFloatingActionButton.getCollapsedSize());
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final int f() {
                return ExtendedFloatingActionButton.this.getCollapsedSize();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.getCollapsedPadding();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final int getPaddingStart() {
                return ExtendedFloatingActionButton.this.getCollapsedPadding();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final int h() {
                return ExtendedFloatingActionButton.this.getCollapsedSize();
            }
        }, false);
        this.f14490p0 = changeSizeStrategy2;
        showStrategy.f14470f = motionSpecA;
        hideStrategy.f14470f = motionSpecA2;
        changeSizeStrategy.f14470f = motionSpecA3;
        changeSizeStrategy2.f14470f = motionSpecA4;
        typedArrayD.recycle();
        setShapeAppearanceModel(ShapeAppearanceModel.c(context2, attributeSet, i11, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, ShapeAppearanceModel.m).a());
        this.A0 = getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.A0 = getTextColors();
    }
}
