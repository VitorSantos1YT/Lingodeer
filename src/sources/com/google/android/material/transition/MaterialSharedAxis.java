package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.lingodeer.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import qa.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MaterialSharedAxis extends MaterialVisibility<VisibilityAnimatorProvider> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Axis {
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
    public final int Z(boolean z11) {
        return R.attr.motionDurationLong1;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public final int a0(boolean z11) {
        return R.attr.motionEasingEmphasizedInterpolator;
    }

    @Override // com.google.android.material.transition.MaterialVisibility, qa.v
    public final /* bridge */ /* synthetic */ boolean x() {
        return true;
    }
}
