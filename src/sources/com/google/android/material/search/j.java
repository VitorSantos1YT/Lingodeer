package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.widget.ImageButton;
import com.google.android.material.internal.FadeThroughDrawable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15177b;

    public /* synthetic */ j(Object obj, int i11) {
        this.f15176a = i11;
        this.f15177b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15176a) {
            case 0:
                SearchViewAnimationHelper searchViewAnimationHelper = (SearchViewAnimationHelper) this.f15177b;
                searchViewAnimationHelper.f15146j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                searchViewAnimationHelper.f15151p.getTextView().setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                n.b bVar = (n.b) this.f15177b;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (bVar.f42907i != fFloatValue) {
                    bVar.f42907i = fFloatValue;
                    bVar.invalidateSelf();
                }
                break;
            case 2:
                ((FadeThroughDrawable) this.f15177b).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((ImageButton) this.f15177b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
