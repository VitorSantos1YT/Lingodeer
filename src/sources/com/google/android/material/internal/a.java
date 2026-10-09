package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements MultiViewUpdateListener.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14754a;

    @Override // com.google.android.material.internal.MultiViewUpdateListener.Listener
    public final void a(ValueAnimator valueAnimator, View view) {
        switch (this.f14754a) {
            case 0:
                view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                Float f5 = (Float) valueAnimator.getAnimatedValue();
                view.setScaleX(f5.floatValue());
                view.setScaleY(f5.floatValue());
                break;
            default:
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
