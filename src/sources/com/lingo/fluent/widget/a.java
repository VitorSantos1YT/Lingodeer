package com.lingo.fluent.widget;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GameWaveView f21664b;

    public /* synthetic */ a(GameWaveView gameWaveView, int i11) {
        this.f21663a = i11;
        this.f21664b = gameWaveView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21663a) {
            case 0:
                GameWaveView.initTallerAnimation$lambda$1(this.f21664b, valueAnimator);
                break;
            default:
                GameWaveView.initAnimator$lambda$0(this.f21664b, valueAnimator);
                break;
        }
    }
}
