package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.animation.AnimationUtils;
import com.lingodeer.R;
import qa.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MaterialFade extends MaterialVisibility<FadeProvider> {
    public MaterialFade() {
        FadeProvider fadeProvider = new FadeProvider();
        fadeProvider.f15892a = 0.3f;
        ScaleProvider scaleProvider = new ScaleProvider();
        scaleProvider.f15975b = false;
        scaleProvider.f15974a = 0.8f;
        super(fadeProvider, scaleProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility, qa.j0
    public final Animator U(ViewGroup viewGroup, View view, d0 d0Var) {
        return X(viewGroup, view, true);
    }

    @Override // com.google.android.material.transition.MaterialVisibility, qa.j0
    public final Animator V(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        return X(viewGroup, view, false);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public final TimeInterpolator Y() {
        return AnimationUtils.f13768a;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public final int Z(boolean z11) {
        return z11 ? R.attr.motionDurationMedium4 : R.attr.motionDurationShort3;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public final int a0(boolean z11) {
        return z11 ? R.attr.motionEasingEmphasizedDecelerateInterpolator : R.attr.motionEasingEmphasizedAccelerateInterpolator;
    }

    @Override // com.google.android.material.transition.MaterialVisibility, qa.v
    public final /* bridge */ /* synthetic */ boolean x() {
        return true;
    }
}
