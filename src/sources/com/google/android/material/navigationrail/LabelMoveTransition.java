package com.google.android.material.navigationrail;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.yalantis.ucrop.view.CropImageView;
import java.util.HashMap;
import qa.d0;
import qa.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class LabelMoveTransition extends v {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ int f14935i0 = 0;

    @Override // qa.v
    public final void f(d0 d0Var) {
        d0Var.f47604a.put("NavigationRailLabelVisibility", Integer.valueOf(d0Var.f47605b.getVisibility()));
    }

    @Override // qa.v
    public final void i(d0 d0Var) {
        d0Var.f47604a.put("NavigationRailLabelVisibility", Integer.valueOf(d0Var.f47605b.getVisibility()));
    }

    @Override // qa.v
    public final Animator m(ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        if (d0Var == null) {
            return null;
        }
        HashMap map = d0Var.f47604a;
        if (d0Var2 == null) {
            return null;
        }
        HashMap map2 = d0Var2.f47604a;
        if (map.get("NavigationRailLabelVisibility") == null || map2.get("NavigationRailLabelVisibility") == null || ((Integer) map.get("NavigationRailLabelVisibility")).intValue() != 8 || ((Integer) map2.get("NavigationRailLabelVisibility")).intValue() != 0) {
            return null;
        }
        final View view = d0Var2.f47605b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigationrail.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i11 = LabelMoveTransition.f14935i0;
                view.setTranslationX((1.0f - valueAnimator.getAnimatedFraction()) * (-30.0f));
            }
        });
        return valueAnimatorOfFloat;
    }
}
