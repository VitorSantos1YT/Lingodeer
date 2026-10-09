package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FadeThroughUpdateListener implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f14661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f14662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f14663c = new float[2];

    public FadeThroughUpdateListener(ActionMenuView actionMenuView, ActionMenuView actionMenuView2) {
        this.f14661a = actionMenuView;
        this.f14662b = actionMenuView2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = this.f14663c;
        FadeThroughUtils.a(fFloatValue, fArr);
        View view = this.f14661a;
        if (view != null) {
            view.setAlpha(fArr[0]);
        }
        View view2 = this.f14662b;
        if (view2 != null) {
            view2.setAlpha(fArr[1]);
        }
    }
}
