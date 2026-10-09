package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.MotionSpec;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class BaseMotionStrategy implements MotionStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExtendedFloatingActionButton f14466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14467c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AnimatorTracker f14468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MotionSpec f14469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MotionSpec f14470f;

    public BaseMotionStrategy(ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker) {
        this.f14466b = extendedFloatingActionButton;
        this.f14465a = extendedFloatingActionButton.getContext();
        this.f14468d = animatorTracker;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public void a() {
        this.f14468d.f14464a = null;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public void e() {
        this.f14468d.f14464a = null;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public AnimatorSet f() {
        MotionSpec motionSpec = this.f14470f;
        if (motionSpec == null) {
            if (this.f14469e == null) {
                this.f14469e = MotionSpec.b(this.f14465a, b());
            }
            motionSpec = this.f14469e;
            motionSpec.getClass();
        }
        return g(motionSpec);
    }

    public final AnimatorSet g(MotionSpec motionSpec) {
        ArrayList arrayList = new ArrayList();
        boolean zG = motionSpec.g("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f14466b;
        if (zG) {
            arrayList.add(motionSpec.d("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (motionSpec.g("scale")) {
            arrayList.add(motionSpec.d("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(motionSpec.d("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (motionSpec.g("width")) {
            arrayList.add(motionSpec.d("width", extendedFloatingActionButton, ExtendedFloatingActionButton.D0));
        }
        if (motionSpec.g("height")) {
            arrayList.add(motionSpec.d("height", extendedFloatingActionButton, ExtendedFloatingActionButton.E0));
        }
        if (motionSpec.g("paddingStart")) {
            arrayList.add(motionSpec.d("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.F0));
        }
        if (motionSpec.g("paddingEnd")) {
            arrayList.add(motionSpec.d("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.G0));
        }
        if (motionSpec.g("labelOpacity")) {
            arrayList.add(motionSpec.d("labelOpacity", extendedFloatingActionButton, new Property<ExtendedFloatingActionButton, Float>() { // from class: com.google.android.material.floatingactionbutton.BaseMotionStrategy.1
                @Override // android.util.Property
                public final Float get(ExtendedFloatingActionButton extendedFloatingActionButton2) {
                    ExtendedFloatingActionButton extendedFloatingActionButton3 = extendedFloatingActionButton2;
                    return Float.valueOf(AnimationUtils.a(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, (Color.alpha(extendedFloatingActionButton3.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton3.A0.getColorForState(extendedFloatingActionButton3.getDrawableState(), BaseMotionStrategy.this.f14466b.A0.getDefaultColor()))));
                }

                @Override // android.util.Property
                public final void set(ExtendedFloatingActionButton extendedFloatingActionButton2, Float f5) {
                    ExtendedFloatingActionButton extendedFloatingActionButton3 = extendedFloatingActionButton2;
                    Float f11 = f5;
                    int colorForState = extendedFloatingActionButton3.A0.getColorForState(extendedFloatingActionButton3.getDrawableState(), BaseMotionStrategy.this.f14466b.A0.getDefaultColor());
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (AnimationUtils.a(CropImageView.DEFAULT_ASPECT_RATIO, Color.alpha(colorForState) / 255.0f, f11.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                    if (f11.floatValue() == 1.0f) {
                        extendedFloatingActionButton3.l(extendedFloatingActionButton3.A0);
                    } else {
                        extendedFloatingActionButton3.l(colorStateListValueOf);
                    }
                }
            }));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.a(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public void onAnimationStart(Animator animator) {
        AnimatorTracker animatorTracker = this.f14468d;
        Animator animator2 = animatorTracker.f14464a;
        if (animator2 != null) {
            animator2.cancel();
        }
        animatorTracker.f14464a = animator;
    }
}
