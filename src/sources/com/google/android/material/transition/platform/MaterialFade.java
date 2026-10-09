package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.animation.AnimationUtils;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MaterialFade extends MaterialVisibility<FadeProvider> {
    public MaterialFade() {
        FadeProvider fadeProvider = new FadeProvider();
        fadeProvider.f15991a = 0.3f;
        ScaleProvider scaleProvider = new ScaleProvider();
        scaleProvider.f16076b = false;
        scaleProvider.f16075a = 0.8f;
        super(fadeProvider, scaleProvider);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public final TimeInterpolator d() {
        return AnimationUtils.f13768a;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public final int f(boolean z11) {
        return z11 ? R.attr.motionDurationMedium4 : R.attr.motionDurationShort3;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public final int g(boolean z11) {
        return z11 ? R.attr.motionEasingEmphasizedDecelerateInterpolator : R.attr.motionEasingEmphasizedAccelerateInterpolator;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility, android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return c(viewGroup, view, true);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility, android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return c(viewGroup, view, false);
    }
}
