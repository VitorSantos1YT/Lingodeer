package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MaterialFadeThrough extends MaterialVisibility<FadeThroughProvider> {
    public MaterialFadeThrough() {
        FadeThroughProvider fadeThroughProvider = new FadeThroughProvider();
        ScaleProvider scaleProvider = new ScaleProvider();
        scaleProvider.f16076b = false;
        scaleProvider.f16075a = 0.92f;
        super(fadeThroughProvider, scaleProvider);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public final int f(boolean z11) {
        return R.attr.motionDurationLong1;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public final int g(boolean z11) {
        return R.attr.motionEasingEmphasizedInterpolator;
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
