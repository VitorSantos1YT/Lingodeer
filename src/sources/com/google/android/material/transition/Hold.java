package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.yalantis.ucrop.view.CropImageView;
import qa.d0;
import qa.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Hold extends j0 {
    @Override // qa.j0
    public final Animator U(ViewGroup viewGroup, View view, d0 d0Var) {
        return ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // qa.j0
    public final Animator V(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        return ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO);
    }
}
