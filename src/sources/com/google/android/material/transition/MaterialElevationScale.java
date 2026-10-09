package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import qa.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MaterialElevationScale extends MaterialVisibility<ScaleProvider> {
    @Override // com.google.android.material.transition.MaterialVisibility, qa.j0
    public final Animator U(ViewGroup viewGroup, View view, d0 d0Var) {
        return X(viewGroup, view, true);
    }

    @Override // com.google.android.material.transition.MaterialVisibility, qa.j0
    public final Animator V(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        return X(viewGroup, view, false);
    }

    @Override // com.google.android.material.transition.MaterialVisibility, qa.v
    public final /* bridge */ /* synthetic */ boolean x() {
        return true;
    }
}
