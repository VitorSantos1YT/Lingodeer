package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class ElasticTabIndicatorInterpolator extends TabIndicatorInterpolator {
    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    public final void b(TabLayout tabLayout, View view, View view2, float f5, Drawable drawable) {
        float fSin;
        float fCos;
        RectF rectFA = TabIndicatorInterpolator.a(tabLayout, view);
        RectF rectFA2 = TabIndicatorInterpolator.a(tabLayout, view2);
        if (rectFA.left < rectFA2.left) {
            double d5 = (((double) f5) * 3.141592653589793d) / 2.0d;
            fSin = (float) (1.0d - Math.cos(d5));
            fCos = (float) Math.sin(d5);
        } else {
            double d11 = (((double) f5) * 3.141592653589793d) / 2.0d;
            fSin = (float) Math.sin(d11);
            fCos = (float) (1.0d - Math.cos(d11));
        }
        drawable.setBounds(AnimationUtils.c((int) rectFA.left, fSin, (int) rectFA2.left), drawable.getBounds().top, AnimationUtils.c((int) rectFA.right, fCos, (int) rectFA2.right), drawable.getBounds().bottom);
    }
}
